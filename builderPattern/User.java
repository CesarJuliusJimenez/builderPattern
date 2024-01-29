package builderPattern;

public class User {
    protected final String firstName;
    protected final String lastName;
    protected final String email;
    protected final String address;
    protected final String phone;
    protected final int age;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
    }

    protected static class UserBuilder {
        String firstName;
        String lastName;
        String email;
        String address;
        String phone;
        int age;

        public UserBuilder(String firstName, String lastName, String phone, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.phone = phone;
            this.age = age;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
