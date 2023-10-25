package com.dubrouskaya.grpc.server;

import com.dubrouskaya.grpc.PingPongServiceGrpc;
import com.dubrouskaya.grpc.PingPongServiceOuterClass;
import io.grpc.stub.StreamObserver;

public class PingPongServiceImplBase extends PingPongServiceGrpc.PingPongServiceImplBase {
    @Override
    public void say(PingPongServiceOuterClass.PingRequest request, StreamObserver<PingPongServiceOuterClass.PongResponse> responseObserver) {

        PingPongServiceOuterClass.PongResponse response = PingPongServiceOuterClass.PongResponse.newBuilder()
                .setPongWord(request.getPingWord() + "Pong")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
