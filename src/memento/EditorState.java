package memento;

public class EditorState {

    private final String contact;

    /**
     * constructor
     * @param contact
     */
    EditorState(String contact){
        this.contact=contact;
    }

    /**
     * method getContanct
     * @return
     */
    public String getContact() {
        return contact;
    }

}
