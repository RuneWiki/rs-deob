package deob;

import java.util.Comparator;

@ObfuscatedName("mv")
public class class333 implements Comparator {

    @ObfuscatedName("mv.aq(Lmg;Lmg;B)I")
    public int method5739(class326 arg0, class326 arg1) {
        return arg0.field3541 - arg1.field3541;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5739((class326) arg0, (class326) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
