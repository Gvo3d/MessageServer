package userObj;

public abstract class Person {
   private int user_id;
   private String user_login;
   private int user_type;
   private String user_last_entered;
   private String avatar;

   public Person(int user_id, String user_login, int user_type, String avatar) {
      this.user_id = user_id;
      this.user_login = user_login;
      this.user_type = user_type;
      this.avatar = avatar;
   }

   public int getUser_id() {
      return user_id;
   }

   public void setUser_id(int user_id) {
      this.user_id = user_id;
   }

   public String getUser_login() {
      return user_login;
   }

   public void setUser_login(String user_login) {
      this.user_login = user_login;
   }

   public int getUser_type() {
      return user_type;
   }

   public void setUser_type(int user_type) {
      this.user_type = user_type;
   }

   public String getUser_last_entered() {
      return user_last_entered;
   }

   public void setUser_last_entered(String user_last_entered) {
      this.user_last_entered = user_last_entered;
   }

   public String getAvatar() {
      return avatar;
   }

   public void setAvatar(String avatar) {
      this.avatar = avatar;
   }
}
