package Chapter_1_Building_Blocks;



/** Java class have two primary elements -> methods and fields = members.
 * @author Willyan Faria
 * javadoc
 */

// comments

/*
other comments/
 */
public class Animal {

    String name;

    public String getName() {   //we define a method, this is operation can called other classes.
        return name;
    }

    public void setName(String name) {  //Other method, but void and is called a parameter where you pass a string parameter to be returned.
        this.name = name;
    }
}
