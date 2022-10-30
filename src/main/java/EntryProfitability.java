import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntryProfitability {

    private static final Scanner scanner = new Scanner(System.in);

    private static final ObjectMapper objectmapper = new ObjectMapper();

    private static List<DiaryEntry> EntryFromJSON;

    private static final Path path = Paths.get("src/main/resources/EveryDiary.json");




    static {
        try {
            EntryFromJSON = List.of(objectmapper.readValue(path.toFile(), DiaryEntry[].class));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * This method prints out menu for the user
     */
    public static void EntryCreating() {
        String Option1 = "Hello dear reader, welcome to my diary, " +
                "if you be kind choose one option between 1-3. Thank you!";
        System.out.println(Option1);
    }


    /**
     * This is needed for readValue.
     * This method reads post from Json-file
     * @throws IOException
     */
    public static void AllEntriesShouldBeRead() throws IOException {

        List<DiaryEntry> allJsonEntries = List.of(objectmapper.readValue(path.toFile(), DiaryEntry[].class));

        for (DiaryEntry entry : allJsonEntries) {
            System.out.println("Title Of Diary: " + entry.getTitleOfEntry());
            System.out.println("Entry Of Diary: " + entry.getContentOfEntry());
            System.out.println("Date Of Diary: " + entry.getDateOfEntry() + "\n");
        }
    }

    /**
     * This method prints out menu for the user
     */
    public static void MenuChoicesPrintOut () {
        String Option2 = "1: Read entires";
        String Option3 = "2: Write a new entry";
        String Option4 = "3: Shut down the program!";
        System.out.println(Option2 + "\n" + Option3 + "\n" + Option4);

    }

    /**
     * Users posts will be saved in json file
     * @throws IOException
     */
    public static void EntriesAddedIntoJson() throws IOException{
        EntryFromJSON = List.of(objectmapper.readValue(path.toFile(),
                DiaryEntry[].class));
        List<DiaryEntry> Entries = new ArrayList<>(EntryFromJSON);

        Entries.add(AnWritenEntry());
        objectmapper.writerWithDefaultPrettyPrinter().writeValue
                (path.toFile(), Entries);
    }

    /**
     * Reads if the user writes wrong
     */
    public static void WrongChoice() {
        String Option5 = "Sorry to inform you but this is not available, " +
                "be kind and choose a number between 1-3 thanks!";
        System.out.println("5");
    }


    /**
     * This method implies to say bye
     */

    public static void ThisPrintGoodBye() {

        String Option4 = "The diary have come to an end and will be closed";

        System.out.println(Option4);
    }

    /**
     * User can write posts
     *
     * @return
     */

    private static DiaryEntry AnWritenEntry() {

        System.out.println("Be kind and write a title:");
        String titleOfEntry = scanner.nextLine();
        System.out.println("Be kind and write an entry:");
        String contentOfEntry = scanner.nextLine();
        String dateOfEntry = LocalDate.now().toString();
        System.out.println("\n" + "Be kind and Write todays entry:");
        System.out.println(titleOfEntry + "\n" + contentOfEntry + "\n" + dateOfEntry + "\n");
        return new DiaryEntry(titleOfEntry, contentOfEntry, dateOfEntry);
    }



}