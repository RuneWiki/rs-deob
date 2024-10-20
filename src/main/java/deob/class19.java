package deob;

import java.util.Comparator;

@ObfuscatedName("z")
public final class class19 implements Comparator {

    @ObfuscatedName("z.e(Lc;Lc;B)I")
    public int method99(class15 arg0, class15 arg1) {
        return arg0.method53().compareTo(arg1.method53());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method99((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
