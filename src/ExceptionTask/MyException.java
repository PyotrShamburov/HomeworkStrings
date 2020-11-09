package ExceptionTask;

public class MyException extends Exception{
    private String detail;

    MyException(String string){
        detail = string;
    }

    @Override
    public String toString() {
        return "Exception [ "+detail+" ]";
    }
}
