public class User {

    private String gender;
    private String type;
    private int num;

    public void Usuario(String gender, String type, int num){
        this.gender = gender;
        this.type = type;
        this.num = num;
    }

    public void setGender(String gender){
        this.gender=gender;
    }

    public User(String m, String litters, int mD) {
    }

    public String getGender(){
        return gender;
    }

    public void setType(String type){
        this.type= type;
    }

    public String getType() {
        return type;
    }

    public void setNum(int num){
        this.num= num;
    }

    public int getNum() {
        return num;
    }

}
