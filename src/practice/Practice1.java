package practice;

import common.Address;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author pdavis13
 */
public class Practice1 {
    public static void main(String[] args) {
        Address address = new Address();
        
        address.setAddress1("1234 Street");
        address.setCity("Milwaukee");
        address.setState("WI");
        address.setZipCode("53129");
        address.setEmail("abc@isp.com");
        address.setPhone("414-867-5309");
        
        Address address2 = new Address();
        
        address2.setAddress1("1234 Street");
        address2.setCity("Milwaukee");
        address2.setState("WI");
        address2.setZipCode("53129");
        address2.setEmail("abc@isp.com");
        address2.setPhone("414-867-5309");
        
        Set<Address> noDupes = new HashSet<>();
        noDupes.add(address);
        noDupes.add(address2);
        
//        List<Address> addresses = new ArrayList<>();
//        if(address.getCity().equals("Milwaukee")){
//            addresses.add(address);
//        }
//        
//        if(address2.equals(address)){
//            addresses.add(address2);
//        }
//        
//        for(Address a : addresses) {
//            System.out.println(a);
//        }
//        
//        System.out.println(address.toString());
        
//        List<String> list = new ArrayList<>();
//        
//        list.add("Beer");
//        list.add("Chips");
//        list.add("Vodka");
//        list.add("Beer");
//        
//        Set<String> noDupes = new HashSet<>(list);
//        //list.Clear();
//        //list.addAll(noDupes);
//        list = new ArrayList<>(noDupes);
//        
//        for(String item : list){
//            System.out.println(item);
//        }
//        
//        for(int i=0; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }
        
//        // Boxing/Wrapping
//        Integer x = new Integer(1);
//        // Unboxing/Unwrapping
//        int primitive = x.intValue();
//        
//        ArrayList list = new ArrayList();
//        list.add("howdy");
//        list.add(new Integer(1));
//        Integer value1 = (Integer)list.get(1);
//        Object value2 = list.get(1);
//        // upcasting is allowed
//        Long value3 = (Long)list.get(1);
//        
//        // Diamond operator '<>' assumes the previously stated type "String"
//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("howdy");
//        String value = list2.get(0);
    }
}
