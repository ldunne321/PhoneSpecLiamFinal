/**
 * Created by Liam on 04/12/2016.
 */


import javax.swing.*;
import java.util.LinkedList;
import java.util.List;
public class DeliverPhone {





        public static void main(String[] args) {

            Inventory inventory = new Inventory(new LinkedList<>());
            initializeInventory(inventory);
            PhoneSpec m = new PhoneSpec();

            String g = JOptionPane.showInputDialog(null, "Android or IOS:");
            String n = JOptionPane.showInputDialog(null, "What network Vodafone or Meteor");
            String d = JOptionPane.showInputDialog(null, "How much memory");


            if (g.equals("IOS")) {
                m.setModel(Model.IOS);
            } else {

                if (g.equals("Android")) {

                    m.setModel(Model.Android);
                } else {

                    JOptionPane.showConfirmDialog(null, "We dont have that Model");
                }
            }

            if (n.equals("Meteor")) {
                m.setNetwork(Network.Meteor);
            } else {

                if (n.equals("Vodafone")) {

                    m.setNetwork(Network.vodafone);
                } else {

                    if (n.equals("Three")) {

                        m.setNetwork(Network.Three);
                    } else {

                        JOptionPane.showConfirmDialog(null, "We dont have that Network");
                    }
                }
            }


            if(d.equals("sixteenGB"))
            {
                m.setMemory(Memory.sixteenGB);
            }

            else {

                if (d.equals("thirtytwoGB")) {

                    m.setMemory(Memory.thirtytwoGB);
                } else {

                    JOptionPane.showConfirmDialog(null, "We dont have that specified memory in a phone");
                }
            }
findMatching(inventory,new PhoneSpec(m.getModel(),m.getMemory() , m.getNetwork()));

            /*findMatching(inventory, new PhoneSpec(Model.IOS,
                    Memory.sixteenGB, Network.vodafone));*/



            System.out.println("\nLooking for a Phone..");



        }

        private static void findMatching(final Inventory inventory, final PhoneSpec Delivery) {
            List<Phone> matchingPhones = inventory.search(Delivery);
            if (!matchingPhones.isEmpty()) {
                for (Phone match : matchingPhones) {
                    if (match != null) {
                        PhoneSpec phoneSpec = match.getSpec();
                        System.out.println("Is this your phone " +
                                 phoneSpec.getModel() + " model" +
                                phoneSpec.getNetwork() + " network:\n   " +
                                phoneSpec.getMemory() + " memory,\n   " +"serial num\n" +
                                match.getSerialNumber()+  " " +" "+
                                match.getPrice() + "!");
                    }
                }
            } else {
                System.out.println("Phone is in Inventory. Phone Ready to be delivered.");
            }
        }

        private static void initializeInventory(Inventory inventory) {


            inventory.addPhone("V95693", 100.00,"Liam","Ballymac", new PhoneSpec(Model.Android,Memory.sixteenGB,
                    Network.Meteor));

            inventory.addPhone("V95344", 159.95,"John","Tralee", new PhoneSpec(Model.IOS,Memory.thirtytwoGB,
                    Network.vodafone));
            inventory.addPhone("V54366", 145.95,"Tim","Ardfert", new PhoneSpec(Model.Android,Memory.sixteenGB,
                    Network.Three));
            inventory.addPhone("V66542", 200.00,"John","Listowel", new PhoneSpec(Model.Android,Memory.thirtytwoGB,
                    Network.Meteor));
            inventory.addPhone("V97844", 300.00,"John","Cordal", new PhoneSpec(Model.IOS,Memory.sixteenGB,
                    Network.Three));
            inventory.addPhone("V95435", 70.00,"John","Cork", new PhoneSpec(Model.Android,Memory.sixteenGB,
                    Network.Meteor));

        }
    }

