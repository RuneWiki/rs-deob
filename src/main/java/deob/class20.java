package deob;

import java.util.Comparator;

@ObfuscatedName("v")
public final class class20 implements Comparator {

    @ObfuscatedName("v.c(Ll;Ll;B)I")
    public int method147(class15 arg0, class15 arg1) {
        return arg0.field279 < arg1.field279 ? -1 : (arg0.field279 == arg1.field279 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method147((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
