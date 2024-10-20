package deob;

import java.util.Comparator;

@ObfuscatedName("hf")
public final class class216 implements Comparator {

    @ObfuscatedName("hf.m(Lhv;Lhv;I)I")
    public int method3746(class214 arg0, class214 arg1) {
        return arg0.field3122.field3146 < arg1.field3122.field3146 ? -1 : (arg0.field3122.field3146 == arg1.field3122.field3146 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3746((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
