package deob;

import java.util.Comparator;

@ObfuscatedName("mh")
public class class318 implements Comparator {

    @ObfuscatedName("mh.aw(Lll;Lll;I)I")
    public int method5460(class311 arg0, class311 arg1) {
        return arg0.field3460 - arg1.field3460;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5460((class311) arg0, (class311) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
