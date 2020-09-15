public interface I_Blog_Notifier {


    public void register(Observer o);

    public void unregister(Observer o);

    public void notifyObserver();

}
