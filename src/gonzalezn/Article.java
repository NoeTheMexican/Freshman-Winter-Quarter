/*
 * SE1021
 * Winter 2016-2017
 * Lab 2
 * Name: Noe Gonzalez
 * Created: 12/18/2016
 */
package gonzalezn;
/*
 * The Article class creates an article citation.
 */
public class Article extends Reference {
    int startingPage;
    int endingPage;
    String journal;

    public Article(String author, String title, int publicationYear, String journal, int startingPage, int endingPage) {
        super(author, title, publicationYear);
        this.journal = journal;
        this.startingPage = startingPage;
        this.endingPage = endingPage;
    }
    /**
     *@return returns the citations for an article including the pages. 
     */
    @Override    
    public String getBibtexEntry() {
        return "@Article {REF"+myUniqueID
                +",\nauthor = \""+super.getAuthor()
                +"\",\ntitle = \""+super.getTitle()
                +"\",\njournal = \""+journal
                +"\",\npages = \""+startingPage +"-"+endingPage
                +"\",\nyear = \""+super.getPublicationYear()+"\"\n}";
    }

    public int getEndingPage() {
        return endingPage;
    }

    public String getJournal() {
        return journal;
    }

    public int getStartingPage() {
        return startingPage;
    }

    public void setEndingPage(int endingPage) {
        this.endingPage = endingPage;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public void setStartingPage(int startingPage) {
        this.startingPage = startingPage;
    }

}
