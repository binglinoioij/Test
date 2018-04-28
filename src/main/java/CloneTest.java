/**
 * Copyright (C), 2011-2018, 微贷网.
 */

/**
 * @author binglin 2018/3/18.
 */
public class CloneTest implements Cloneable {

    private Integer id;

    private String name;

    private User user;

    public CloneTest(Integer id, String name, User user) {
        this.id = id;
        this.name = name;
        this.user = user;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        CloneTest clone = (CloneTest) super.clone();
        User user = clone.user;
        clone.user = (User)user.clone();
        return clone;
    }

    public static class User implements Cloneable {
        private String idnumber;

        public User(String idnumber) {
            this.idnumber = idnumber;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        User user = new User("iiiiii");
        CloneTest cloneTest = new CloneTest(1, "name", user);

        CloneTest clone = (CloneTest)cloneTest.clone();
        System.out.println(clone);
        System.out.println(cloneTest.user==clone.user);
    }

}
