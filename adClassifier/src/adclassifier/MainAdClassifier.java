/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adclassifier;

/**
 *
 * @author Karol
 */
public class MainAdClassifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CouchDBHelper dbhelper = new CouchDBHelper();
        dbhelper.test();
    }
}
