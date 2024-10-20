package deob;

import java.util.Comparator;

@ObfuscatedName("nv")
public class class342 implements Comparator {

    @ObfuscatedName("nv.aq(Lme;Lme;I)I")
    public int method5815(class335 arg0, class335 arg1) {
        return arg0.field3648 - arg1.field3648;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5815((class335) arg0, (class335) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
