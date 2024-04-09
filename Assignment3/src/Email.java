//Jake Beahan
//Assignment 2.3 - Email Class
//Feb 15 2024

public class Email {
    private String local, domain;

    public Email(){
        this.local = "johndoe";
        this.domain = "website.com";
    }

    public Email(String local, String domain){
        this.local = local;
        this.domain = domain;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String toString(){
        return local + "@" + domain;
    }

    public String toAntiSpamString(){
        String start = domain.substring(0,domain.indexOf("."));
        String end = domain.substring(domain.indexOf(".")+1);

        return local + " at " + start + " dot " + end;
    }



    public static void main(String[] args) {
        Email email1 = new Email();
        Email email2 = new Email("abc12340", "ucmo.edu");

        System.out.println("email1:\n\n" + email1);
        System.out.println(email1.toAntiSpamString());
        System.out.println("\nemail2:\n\n" + email2);
        System.out.println(email2.toAntiSpamString());
    }
}