package deob;

import java.util.Comparator;

@ObfuscatedName("gh")
public final class class200 implements Comparator {

    @ObfuscatedName("gh.g(Lgi;Lgi;I)I")
    public int method3318(class195 arg0, class195 arg1) {
        return arg0.field2914 < arg1.field2914 ? -1 : (arg0.field2914 == arg1.field2914 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3318((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
