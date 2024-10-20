package deob;

import java.util.Comparator;

@ObfuscatedName("v")
public final class class19 implements Comparator {

    @ObfuscatedName("v.g(Lp;Lp;B)I")
    public int method133(class15 arg0, class15 arg1) {
        return arg0.method75().compareTo(arg1.method75());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method133((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
