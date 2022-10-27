public class Books {
    private String title ;
    private String author ;
    private String bookType;


    public Books(String title, String author , String bookType)
    {
      this.title =title;
      this.author= author;
      this.bookType= bookType;
      
    }

    public String getTitle()
    {
        return title;
    }

    public String getBookType()
    {
        return bookType;
    }

   // public String getAvailabilityStatus(String S)

   // {
    //    return S;
    //}

    public String getAuthor()
    {
        return author;
    }

    public Books get(String s) {
        return null;
    }
    
    
}
