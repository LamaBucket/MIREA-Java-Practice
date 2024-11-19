package Task13;

public class Shirt {
    private String _id;
    private String _name;
    private String _color;
    private String _size;
    
    
    public String get_id() {
        return _id;
    }

    public String get_name() {
        return _name;
    }

    public String get_color() {
        return _color;
    }

    public String get_size() {
        return _size;
    }



    public static Shirt FromString(String str){
        String[] shirtArr = str.split(",");

        if(shirtArr.length != 4){
            System.out.println("Not Enough Data");
            return null;
        }

        return new Shirt(shirtArr[0], shirtArr[1], shirtArr[2], shirtArr[3]);
    }

    @Override
    public String toString(){
        return _id + " " + _name + " " + _color + " " + _size;
    }


    private Shirt(String _id, String _name, String _color, String _size) {
        this._id = _id;
        this._name = _name;
        this._color = _color;
        this._size = _size;
    }
}
