package ro.iteahome.mvc.model.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class PersonForm {

    @NotBlank(message = "ID CANNOT BE BLANK")
    private int id;

    @NotBlank(message = "NICKNAME CANNOT BE BLANK")
    @Size(min = 2, max = 50)
    private String nickname;

    @NotBlank(message = "EMAIL CANNOT BE BLANK")
    private String email;

    public PersonForm() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
