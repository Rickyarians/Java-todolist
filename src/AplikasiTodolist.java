public class AplikasiTodolist {

    public static String[] model = new String[10];

    public static void main(String[] args) {

    testShowTodoList();

    }


    /*
    * Menampilkan Todo List
    * */
    public static void showTodoList(){
        for(var i = 0; i < model.length; i++){
            var todo = model[i];
            var no = i + 1;

            if(todo != null) {
                System.out.println((no + ". " + todo));
            }
        }
    }

    public static void testShowTodoList() {
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi kasus Java Dasar";
        showTodoList();
    }

    /*
    * Meanambah todo kedalam list
    * */
    public static void addTodoList(){

    }


    /*
    * Menghapus todo list*/
    public static void removeTodoList(){

    }


    public static void viewShowTodoList(){

    }

    public static void viewAddTodoList(){

    }

    public static void viewRemoveTodoList(){

    }
}
