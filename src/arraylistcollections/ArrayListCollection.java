package arraylistcollections;

import java.util.ArrayList;

public class ArrayListCollection {

    public static void main(String[] args) {

        // 1. Create an arraylist of participants
        ArrayList<String> participantList = new ArrayList<String>();

        // Another way to declare an arraylist
        // ArrayList<String> participantList2 = new ArrayList<>();

        // The initial size of the arrayList called participantList is 0
        System.out.println(participantList.size());

        // add a value to arraylist participantList and print out its size and value
        participantList.add("James");
        System.out.println("The size of participantList now is: " + participantList.size());
        System.out.println(participantList);

        // add more elements to the arrayList called participantList
        participantList.add("Patrick");
        participantList.add("Angela");
        participantList.add("Benny");
        System.out.println(participantList);
        System.out.println(participantList.size());

        // remove an element from the participantList - removing Benny
        participantList.remove("Benny");
        System.out.println(participantList);
        System.out.println(participantList.size());

        // Use the get method from arrayList to access element 1 (index 0)
        System.out.println(participantList.get(0));

        // Use the set methods from arrayList to change the value in element 1 (index 0)
        participantList.set(0, "Jamerson");

        System.out.println(participantList);
        
        // Q: Use a for-loop to changes all the values in participantList to value: "To be confirmed"
        //for (int i = 0; i < participantList.size() ; i++) {
        //    // change each element in participantList to "To be confirmed"
        //    participantList.set(i, "To be confirmed");
        //}

        // Q: Only change Jamerson to the value "Jameson - to be confirmed"
        for (int i = 0; i < participantList.size(); i++) {
            if(participantList.get(i) == "Jamerson")
                participantList.set(i, "Jamerson" + " - to be confirmed");
        }

        // Q: Change all particpants name to be appended with the value of "<Name> - to be confirmed"
        for (int i = 0; i < participantList.size(); i++) {
                participantList.set(i, participantList.get(i) + " - to be confirmed");
        }

        System.out.println(participantList);

        // ArrayList contains a number of methods that you can use at your disposal to work with the data in it
        System.out.println(participantList.contains("Jamerson"));
    }

}
