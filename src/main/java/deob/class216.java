package deob;

import java.util.Comparator;

@ObfuscatedName("ht")
public final class class216 implements Comparator {

    @ObfuscatedName("ht.o(Lhh;Lhh;B)I")
    public int method3649(class214 arg0, class214 arg1) {
        return arg0.field3136.field3157 < arg1.field3136.field3157 ? -1 : (arg0.field3136.field3157 == arg1.field3136.field3157 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3649((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
