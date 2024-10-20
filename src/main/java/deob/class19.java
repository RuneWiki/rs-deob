package deob;

import java.util.Comparator;

@ObfuscatedName("m")
public final class class19 implements Comparator {

    @ObfuscatedName("m.n(Lt;Lt;B)I")
    public int method122(class15 arg0, class15 arg1) {
        return arg0.method77().compareTo(arg1.method77());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method122((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
