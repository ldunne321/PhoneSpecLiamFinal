/**
 * Created by Liam on 04/12/2016.
 */

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;
public class DeliverPhone {





        public static void main(String[] args) {


            Inventory inventory = new Inventory(new LinkedList<>());
            initializeInventory(inventory);
            PhoneSpec m = new PhoneSpec();


            int Choice = JOptionPane.showConfirmDialog(null, "Do you want phone to be delivered");

            if (Choice == JOptionPane.OK_OPTION) {

                 String ModelChoice = JOptionPane.showInputDialog(null, "Android or IOS:");
                String NetworkChoice = JOptionPane.showInputDialog(null, "What network Vodafone or Meteor");
                String MemoryChoice = JOptionPane.showInputDialog(null, "How much memory");



                    if (ModelChoice.equals("IOS")) {
                        m.setModel(Model.IOS);
                    } else {

                        if (ModelChoice.equals("Android")) {

                            m.setModel(Model.Android);
                        } else {

                            JOptionPane.showConfirmDialog(null, "We dont have that Model");
                        }
                    }

                if (NetworkChoice.equals("Meteor")) {
                    m.setNetwork(Network.Meteor);
                } else {

                    if (NetworkChoice.equals("Vodafone")) {

                        m.setNetwork(Network.vodafone);
                    } else {

                        if (NetworkChoice.equals("Three")) {

                            m.setNetwork(Network.Three);
                        } else {

                            JOptionPane.showConfirmDialog(null, "We dont have that Network");
                        }
                    }
                }


                if (MemoryChoice.equals("sixteenGB")) {
                    m.setMemory(Memory.sixteenGB);
                } else {

                    if (MemoryChoice.equals("thirtytwoGB")) {

                        m.setMemory(Memory.thirtytwoGB);
                    } else {

                        JOptionPane.showConfirmDialog(null, "We dont have that specified memory in a phone");
                    }
                }
                findMatching(inventory, new PhoneSpec(m.getModel(), m.getMemory(), m.getNetwork()));



                System.out.println("\nLooking for a Phone..");


            }
            else if (Choice==JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null,"Phone to be collected");
                System.exit(0);
            }
        }



        private static void findMatching(final Inventory inventory, final PhoneSpec Delivery) {
            List<Phone> matchingPhones = inventory.searchPhone(Delivery);
            if (!matchingPhones.isEmpty()) {
                for (Phone match : matchingPhones) {
                    if (match != null) {
                        PhoneSpec phoneSpec = match.getSpec();
                        System.out.println("Is this your phone " + ""+"model" + " "+
                                 phoneSpec.getModel() + " " + "memory: " +"  "+
                                phoneSpec.getMemory() + " " + " network: " + " "+
                                phoneSpec.getNetwork() + "  " +"serial num" +
                                match.getSerialNumber()+  " " + "name" +" "+
                                match.getName()+ " "+"address"+"" +
                                match.getaddress()+" "+ "Price"+ " "+
                                match.getPrice() +".");
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

