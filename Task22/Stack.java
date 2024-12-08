package Task22;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stack {
    private int[] _arr;
    private int _size;

    private int _top;

    public void Solve(String example) {
        if (ValidateProblem(example)) {
            
            String[] mass = example.split("");
            Push(Integer.parseInt(mass[0]));
            while (!IsEmpty()) {
                for (int i = 1; i < example.length(); i++) {
                    if (!checkElement(mass[i])) {
                        if (Objects.equals(mass[i], "+")) {
                            int el1 = Pop();
                            int el2 = Pop();
                            Push(el1 + el2);
                        } else if (Objects.equals(mass[i], "-")) {
                            int el1 = Pop();
                            int el2 = Pop();
                            Push(el1 - el2);
                        } else if (Objects.equals(mass[i], "*")) {
                            int el1 = Pop();
                            int el2 = Pop();
                            Push(el1 * el2);
                        } else if (Objects.equals(mass[i], "/")) {
                            int el1 = this.Pop();
                            int el2 = this.Pop();
                            Push(el1 / el2);
                        }
                    } else {
                        Push(Integer.parseInt(mass[i]));
                    }
                }
                System.out.println(example + "=" + this.Pop());
            }
        }
        else{
            System.out.println("Problem " + example + " is written wrong.");
        }
    }

    public void Push(int x){
        if (IsFull()){
            System.out.println("Stack OverFlow");
            System.exit(1);
        }
        
        _arr[++_top] = x;
    }

    public int Pop(){
        if (IsEmpty()){
            System.out.println("Stack empty");
            System.exit(1);
        }
        return _arr[_top--];
    }

    public int GetSize(){
        return _top + 1;
    }

    public Boolean IsEmpty(){
        return _top == -1;
    }

    public Boolean IsFull(){
        return _top == _size - 1;
    }

    public void printStack(){
        for (int i = 0; i <= _top; i++){
            System.out.print(_arr[i] + ", ");
        }
    }


    private Boolean checkElement(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher matcher = pattern.matcher(str);
        
        return matcher.matches();
    }

    private int findNumbers(String example){
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(example);
        int numbers = 0;
        while(matcher.find()) {;
            numbers++;
        }
        return numbers;
    }

    private Boolean ValidateProblem(String example){
        
        String check = "0123456789+-*/";
        
        boolean flag2 = false;
        int count = 0;
        String[] mass = example.split("");
        for (int i = 0; i < example.length(); i++){
            if (check.contains(mass[i])){
                count += 1;
            }
        }
        if(count == example.length()){
            flag2 = true;
        }

        return flag2 && (example.length() - findNumbers(example) == findNumbers(example) - 1);

    }

    
    Stack(int size){
        _arr = new int[size];
        _size = size;
        _top = -1;
    }
}
