public abstract class Customer {
    private String phone,email,name,address;
    public Customer(String phone,String email,String name,String address){
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.address=address;
    }

    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String Address){
        this.address=Address;
    }
    public String getAddress(){
        return address;
    }

}
