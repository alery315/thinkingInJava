package design.singleton;

public class StatefulBean {

    public int state;
    public User user;


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "StatefulBean{" +
                "state=" + state +
                ", user=" + user +
                '}';
    }

    public static void main(String[] args) {

        User user = new User();
        user.setName("alery");

        int a = 100;

        StatefulBean bean = new StatefulBean();


        bean.setState(a);
        bean.setUser(user);

        System.out.println("init bean:" + bean);

        user.setName("alery2");
        a = 200;

        System.out.println("changed bean:" + bean);


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

//                User user1 = new User();
//                user1.setName("sam");
//                bean.setUser(user1);
//                System.out.println("in thread :" + bean);

                user.setName("sam");
                System.out.println("in thread :" + bean);

            }
        });
        thread.start();

        System.out.println("after thread bean:" + bean);
    }


}
