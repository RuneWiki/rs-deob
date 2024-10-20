package deob;

import java.util.Comparator;

@ObfuscatedName("mq")
public class class317 implements Comparator {

    @ObfuscatedName("mq.au(Lli;Lli;I)I")
    public int method5472(class310 arg0, class310 arg1) {
        return arg0.field3464 - arg1.field3464;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5472((class310) arg0, (class310) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
