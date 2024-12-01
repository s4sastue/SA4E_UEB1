package com.SA4E.UEB1.T2.Client;

import com.SA4E.UEB1.Config;
import com.SA4E.UEB1.T2.proto.FireflyCommunication;
import com.SA4E.UEB1.T2.proto.UpdaterGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Random;

public class Firefly extends Thread{

    int posX, posY;

    double phase, frequency;

    ManagedChannel channel;

    Firefly(int posX, int posY){
        phase = new Random().nextDouble() * 2 * Math.PI;
        frequency = Config.FREQUENCY;

        this.posX = posX;
        this.posY = posY;

        setDaemon(true);
        channel = ManagedChannelBuilder.forAddress("localhost", 8999).usePlaintext().build();
    }

    @Override
    public void run() {
        while(true){
            var bookStub = UpdaterGrpc.newBlockingStub(channel);

            var reply = bookStub.updateState(
                    FireflyCommunication
                            .UpdateStateRequest
                            .newBuilder()
                            .setPosX(posX)
                            .setPosY(posY)
                            .setPhase(phase)
                            .build()
            );

            double sum = 0;
            for(Double otherPhase: reply.getValuesList()){
                sum += Math.sin(otherPhase - phase);
            }

            phase += (frequency + 1.0/8 * sum) * Config.DT;

            try {
                sleep(5);
            } catch (InterruptedException ignore) {}
        }
    }
}