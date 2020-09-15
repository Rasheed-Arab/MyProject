
// Represents each Observer that is monitoring changes in the subject

public class ActivityTrackerObserver implements Observer {

    private string str;


        // Static used as a counter

    private static int observerIDTracker = 0;

        // Used to track the observers

    private int observerID;

        // Will hold reference to the ActivityTrackerObserver object

    private Subject ModeratorObserver;

    public ActivityTrackerObserver(Subject ModeratorObserver){

        // Store the reference to the stockGrabber object so

        // I can make calls to its methods

        this.ModeratorObserver = ModeratorObserver;

        // Assign an observer ID and increment the static counter

        this.observerID = ++observerIDTracker;

        // Message notifies user of new observer

        System.out.println("New Observer " + this.observerID);

        // Add the observer to the Subjects ArrayList

        ModeratorObserver.register(this);

    }

        // Called to update all observers

    public void update(string str) {

        this.Str = "Post";


        printThePost();

    }

    public void printThePost(){

        System.out.println(observerID + "\nIBM: " + str+ "\n Post ");

    }

}
