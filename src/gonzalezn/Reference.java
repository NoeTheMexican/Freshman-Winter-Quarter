/*
 * SE1021
 * Winter 2016-2017
 * Lab 2
 * Name: Noe Gonzalez
 * Created: 12/18/2016
 */
package gonzalezn;
/*
 * Reference is the parent class that every citation looks towards,
 * although some citations are different they all are similar by using these
 * methods.
 */
public class Reference {
    private String author;
    private String title;
    protected static int instanceCount = 0;
    protected int myUniqueID;
    private int publicationYear;

    public Reference(String author, String title, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        this.myUniqueID = instanceCount;
        instanceCount++;
    }

    public String getAuthor() {
        return author;
    }
/**
 * 
 * @return returns the generic citation
 */
    public String getBibtexEntry() {
        return "@Reference {REF"+myUniqueID
              +",\nauthor = \""+author
              +"\",\ntitle = \""+title
              +"\",\nyear = \""+publicationYear+"\"\n}";
    }

    public int getMyUniqueID() {
        return myUniqueID;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
