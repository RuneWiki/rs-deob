package deob;

import java.util.Comparator;

@ObfuscatedName("hn")
public final class class219 implements Comparator {

    @ObfuscatedName("hn.k(Lhq;Lhq;S)I")
    public int method3749(class214 arg0, class214 arg1) {
        return arg0.field3144 < arg1.field3144 ? -1 : (arg0.field3144 == arg1.field3144 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3749((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
