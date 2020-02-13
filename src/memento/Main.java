package memento;

public class Main {
    public static void main(String[] args) {

        Editor editor = new Editor();
        History history = new History();

        /**
         * set contact to class Editor
         * set "a" to var of class Editor
         * using obj of History to invoked push()
         * @parameter createState() method in Editor class
         */
        editor.setContant("a");
        history.push(editor.createState());


        editor.setContant("b");
        history.push(editor.createState());


        /**
         * using obj og Editor to invoked restore() in class Editor
         * @parameter pass value to remove from list
         *
         */
        editor.setContant("c");
        editor.retore(history.pop());

        System.out.println(editor.getContant());
    }
}
