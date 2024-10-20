package deob;

import java.util.Comparator;

@ObfuscatedName("h")
public final class class18 implements Comparator {

    @ObfuscatedName("h.c(Ll;Ll;I)I")
    public int method116(class15 arg0, class15 arg1) {
        return arg0.field275.field291 < arg1.field275.field291 ? -1 : (arg0.field275.field291 == arg1.field275.field291 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method116((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
