// 6510450658 Pinpawat Limsuwat
import java.util.ArrayList;
import java.util.Arrays;

public class Service implements Verification{
    private User user ;

    public Service(User user) {
        this.user = user;
    }

    @Override
    public boolean Verify() {
        ArrayList<Verification> verificationArrayList = new ArrayList<>(Arrays.asList(user, user.getEmail()));
        for (Verification verification : verificationArrayList){
            verification.Verify();
        }
        return true;
    }

}
