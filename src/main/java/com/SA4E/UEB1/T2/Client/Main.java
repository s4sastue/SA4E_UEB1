package com.SA4E.UEB1.T2.Client;

import com.SA4E.UEB1.Config;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int num = Config.NUM_OF_ROWS;

        List<Firefly> fireflies = new ArrayList<>();

        for(int i = 0; i<(num*num); i++){
            var f = new Firefly(i%num, i/num);
            fireflies.add(f);
            f.start();
        }

        for(Firefly f: fireflies){
            try {
                f.join();
            } catch (InterruptedException ignore) {}
        }
    }
}