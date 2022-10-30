public class DiaryEntry {
    private String TitleOfEntry;
    private String ContentOfEntry;
    private String DateOfEntry;

    public DiaryEntry(String titleOfEntry, String contentOfEntry, String dateOfEntry) {
        TitleOfEntry = titleOfEntry;
        ContentOfEntry = contentOfEntry;
        DateOfEntry = dateOfEntry;
    }

    public String getTitleOfEntry() {
        return TitleOfEntry;
    }

    public void setTitleOfEntry(String titleOfEntry) {
        TitleOfEntry = titleOfEntry;
    }

    public String getContentOfEntry() {
        return ContentOfEntry;
    }

    public void setContentOfEntry(String contentOfEntry) {
        ContentOfEntry = contentOfEntry;
    }

    public String getDateOfEntry() {
        return DateOfEntry;
    }

    public void setDateOfEntry(String dateOfEntry) {
        DateOfEntry = dateOfEntry;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "TitleOfEntry='" + TitleOfEntry + '\'' +
                ", ContentOfEntry='" + ContentOfEntry + '\'' +
                ", DateOfEntry='" + DateOfEntry + '\'' +
                '}';
    }
}




