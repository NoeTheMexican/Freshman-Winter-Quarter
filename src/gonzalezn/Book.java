/*
 * SE1021
 * Winter 2016-2017
 * Lab 2
 * Name: Noe Gonzalez
 * Created: 12/18/2016
 */
package gonzalezn;
/*
 * The Book class creates a book citation.
 */
public class Book extends Reference{
    String publisher;
    public Book(String author, String title, int publicationYear, String publisher) {
        super(author, title, publicationYear);
        this.publisher = publisher;
    }
    /**
     *@return returns the book citation that is more accurate.
     */
    @Override 
    public String getBibtexEntry(){
        return "@Book {REF"+myUniqueID
                +",\nauthor = \""+super.getAuthor()
                +"\",\ntitle = \""+super.getTitle()
                +"\",\npublisher = \""+ publisher
                +"\",\nyear = \""+super.getPublicationYear()+"\"\n}";
    }
    public  String getPublisher(){
        return publisher;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

}
