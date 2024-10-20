package deob;

import java.util.Comparator;

@ObfuscatedName("ht")
public final class class219 implements Comparator {

    @ObfuscatedName("ht.n(Lhe;Lhe;I)I")
    public int method3715(class214 arg0, class214 arg1) {
        return arg0.field3145 < arg1.field3145 ? -1 : (arg0.field3145 == arg1.field3145 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3715((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
