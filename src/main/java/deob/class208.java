package deob;

import java.util.Comparator;

@ObfuscatedName("gh")
public final class class208 implements Comparator {

    @ObfuscatedName("gh.n(Lgg;Lgg;I)I")
    public int method3606(class205 arg0, class205 arg1) {
        return arg0.field3050.field3068 < arg1.field3050.field3068 ? -1 : (arg0.field3050.field3068 == arg1.field3050.field3068 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3606((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
