import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private Date moment;
    private String title;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();

    public Post() {
    }

    public Post(Date moment, String title, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments(){
        return comments;
    }

    public void addComment(Comment comment){
        comments.add(comment);
    }

    public void removeComment(Comment comment){
        comments.remove(comment);
    }

}
