package com.SA4E.UEB1.T1;

import com.SA4E.UEB1.Config;

import java.util.Random;

public class Firefly extends Thread{

    int posX, posY;

    double phase, frequency;

    Firefly(int posX, int posY){
        phase = new Random().nextDouble() * 2 * Math.PI;
        frequency = Config.FREQUENCY;

        this.posX = posX;
        this.posY = posY;

        setDaemon(true);
    }

    @Override
    public void run() {
        while(true){

            double[][] values = FireflyEnvironment.values;

            double sum = 0;
            for (int dx = -1; dx <= 1; dx++) {
                for (int dy = -1; dy <= 1; dy++) {
                    int nx = posX + dx;
                    int ny = posY + dy;

                    if (nx >= 0 && nx < values[0].length && ny >= 0 && ny < values.length && (dx != 0 || dy != 0)) {
                        sum += Math.sin(values[nx][ny] - phase);
                    }
                }
            }

            phase += (frequency + 1.0/8 * sum) * Config.DT;

            FireflyEnvironment.update(posX, posY, phase);

            try {
                sleep(1);
            } catch (InterruptedException ignore) {}
        }
    }
}
