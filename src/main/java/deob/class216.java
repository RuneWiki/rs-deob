package deob;

import java.util.Comparator;

@ObfuscatedName("hg")
public final class class216 implements Comparator {

    @ObfuscatedName("hg.z(Lhh;Lhh;B)I")
    public int method3615(class214 arg0, class214 arg1) {
        return arg0.field3135.field3155 < arg1.field3135.field3155 ? -1 : (arg0.field3135.field3155 == arg1.field3135.field3155 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3615((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
