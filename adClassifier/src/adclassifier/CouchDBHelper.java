/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adclassifier;

import org.lightcouch.*;

/**
 * Uses LightCouch
 * @author Karol
 */
public class CouchDBHelper {
    
    CouchDbClient db;
    
    public CouchDBHelper() {
        db = new CouchDbClient();
    }
    
    public void test() {
        Ad a = new Ad();
        a.setTitle("First ad");
        a.setPrice(200000);
        Response response = db.save(a);
        String id = response.getId();
        Ad b = db.find(Ad.class, id);
        System.out.println(b.toString());
    }
    
}
