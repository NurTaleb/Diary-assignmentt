import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Scanner;


import java.io.IOException;

public class MainMenu {
        public static void main(String[] args) throws IOException {


            Scanner scanner = new Scanner(System.in);
            int menuOption;


            do {
                System.out.println("Hello, there be want to read my diary, if so be kind and press the options" +
                        " 1-3. Thanks!");

                EntryProfitability.MenuChoicesPrintOut();
                menuOption = scanner.nextInt();
                switch (menuOption) {

                    case 1:

                        EntryProfitability.AllEntriesShouldBeRead();

                        break;
                    case 2:
                        EntryProfitability.EntriesAddedIntoJson();
                        break;

                    //Program closes here
                    case 3:
                        break;

                    case 4:
                        EntryProfitability.WrongChoice();
                    default:
                        System.out.println(5);

                }
            } while (menuOption != 3);

            EntryProfitability.ThisPrintGoodBye();



        }
    }

