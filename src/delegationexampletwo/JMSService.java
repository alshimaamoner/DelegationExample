/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delegationexampletwo;

/**
 *
 * @author PC HOME
 */
public class JMSService implements BusinessService{

    @Override
    public void doProcessing() {
      System.out.println("Processing task by invoking JMS Service");
    }
    
}
