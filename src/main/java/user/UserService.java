package user;

import com.momo.grpc.User;
import com.momo.grpc.userGrpc;
import io.grpc.stub.StreamObserver;

public class UserService extends userGrpc.userImplBase {
    @Override
    public void login(User.LoginRequest request, StreamObserver<User.APIResponse> responseObserver) {
        System.out.println("Login");
        //get data from request
        String username = request.getUsername();
        String password = request.getPassword();

        //builder of API response
        User.APIResponse.Builder response = User.APIResponse.newBuilder();
        if(username.equals(password)) {
            //login success
            response.setResponseCode(200).setResponseMessage("Success");
        }
        else {
            //login fail
            response.setResponseCode(400).setResponseMessage("Fail");
        }

        //send to client
        responseObserver.onNext(response.build());
        //close the call
        responseObserver.onCompleted();
    }

    @Override
    public void logout(User.Empty request, StreamObserver<User.APIResponse> responseObserver) {

    }
}
