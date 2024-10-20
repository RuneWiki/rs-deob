package deob;

import java.util.Comparator;

@ObfuscatedName("b")
public final class class18 implements Comparator {

    @ObfuscatedName("b.w(La;La;I)I")
    public int method107(class15 arg0, class15 arg1) {
        return arg0.field295.field320 < arg1.field295.field320 ? -1 : (arg0.field295.field320 == arg1.field295.field320 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method107((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
