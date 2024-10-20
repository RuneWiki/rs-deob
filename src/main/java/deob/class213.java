package deob;

import java.util.Comparator;

@ObfuscatedName("hb")
public final class class213 implements Comparator {

    @ObfuscatedName("hb.n(Lhn;Lhn;B)I")
    public int method3684(class214 arg0, class214 arg1) {
        return arg0.method3686().compareTo(arg1.method3686());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3684((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
