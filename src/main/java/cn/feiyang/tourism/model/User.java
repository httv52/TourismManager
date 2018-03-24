package cn.feiyang.tourism.model;

public class User {
    private String uid;

    private String username;

    private String password;

    private String email;

    private String screenName;

    private Long created;

    private Long logged;

    private String activatecode;

    private Integer state;

    private String resume;

    private Integer wordNumber;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName == null ? null : screenName.trim();
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Long getLogged() {
        return logged;
    }

    public void setLogged(Long logged) {
        this.logged = logged;
    }

    public String getActivatecode() {
        return activatecode;
    }

    public void setActivatecode(String activatecode) {
        this.activatecode = activatecode == null ? null : activatecode.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume == null ? null : resume.trim();
    }

    public Integer getWordNumber() {
        return wordNumber;
    }

    public void setWordNumber(Integer wordNumber) {
        this.wordNumber = wordNumber;
    }
}