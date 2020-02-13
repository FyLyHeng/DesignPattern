package memento;

public class Editor {
    private String contant;


    /**
     *
     * @return
     */
    public EditorState createState() {
        return new EditorState(contant);
    }

    public void retore(EditorState state){
        contant = state.getContact();
    }


    /**
     * set-get method
     * @return
     */
    public String getContant() {
        return contant;
    }

    public void setContant(String contant) {
        this.contant = contant;
    }


}
