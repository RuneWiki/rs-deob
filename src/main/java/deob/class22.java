package deob;

import java.util.Comparator;

@ObfuscatedName("t")
public final class class22 implements Comparator {

    @ObfuscatedName("t.m(Ls;Ls;I)I")
    public int method192(class17 arg0, class17 arg1) {
        return arg0.field70 < arg1.field70 ? -1 : (arg0.field70 == arg1.field70 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method192((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
