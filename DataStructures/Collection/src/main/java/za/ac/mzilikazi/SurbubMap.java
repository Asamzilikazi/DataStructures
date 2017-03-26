package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-03-26.
 */
public class SurbubMap {
    private  String code;
    private  String name;

    public SurbubMap(String code, String name){
        this.code = code;
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Surbub Maps{" +
                "Surbub code '" + code + '\'' +
                ",Surbub name '" + name + '\'' +
                '}';    }
}
