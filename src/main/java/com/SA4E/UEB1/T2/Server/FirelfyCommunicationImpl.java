package com.SA4E.UEB1.T2.Server;

import io.grpc.stub.StreamObserver;
import com.SA4E.UEB1.T2.proto.FireflyCommunication;
import com.SA4E.UEB1.T2.proto.UpdaterGrpc;

import java.util.ArrayList;
import java.util.List;

public class FirelfyCommunicationImpl extends UpdaterGrpc.UpdaterImplBase {

    @Override
    public void updateState(FireflyCommunication.UpdateStateRequest request, StreamObserver<FireflyCommunication.GetStateReply> responseObserver){
        int posX = request.getPosX(),
            posY = request.getPosY();

        Main.update(posX, posY, request.getPhase());

        List<Double> values = new ArrayList<>();
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                int nx = posX + dx;
                int ny = posY + dy;

                if (nx >= 0 && nx < Main.values[0].length && ny >= 0 && ny < Main.values.length && (dx != 0 || dy != 0)) {
                    values.add(Main.values[nx][ny]);
                }
            }
        }

        var reply = FireflyCommunication.GetStateReply
                .newBuilder()
                .addAllValues(values)
                .build();

        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
