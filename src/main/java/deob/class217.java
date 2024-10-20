package deob;

import java.util.Comparator;

@ObfuscatedName("hn")
public final class class217 implements Comparator {

    @ObfuscatedName("hn.g(Lhv;Lhv;I)I")
    public int method3745(class214 arg0, class214 arg1) {
        return arg0.field3130.field3152 < arg1.field3130.field3152 ? -1 : (arg0.field3130.field3152 == arg1.field3130.field3152 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3745((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
