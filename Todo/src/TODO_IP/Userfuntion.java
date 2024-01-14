package TODO_IP;

public interface Userfuntion {
    boolean isEmpty();
    boolean isFull();
    boolean isUserExist(String email);
    boolean register(User u);
    User login(String email,String pass);
}
