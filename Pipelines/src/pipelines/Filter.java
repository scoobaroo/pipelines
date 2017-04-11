/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelines;
import java.util.*;

/**
 *
 * @author suejanehan
 */
public abstract class Filter<Data> implements Subscriber{
    public abstract void update();
    public abstract void activate();
}
