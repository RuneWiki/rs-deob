package deob;

import java.util.Comparator;

@ObfuscatedName("gx")
public final class class207 implements Comparator {

    @ObfuscatedName("gx.y(Lgv;Lgv;I)I")
    public int method3532(class205 arg0, class205 arg1) {
        return arg0.field3054.field3074 < arg1.field3054.field3074 ? -1 : (arg0.field3054.field3074 == arg1.field3054.field3074 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3532((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
