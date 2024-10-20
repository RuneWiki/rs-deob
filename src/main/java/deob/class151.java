package deob;

import java.util.Comparator;

@ObfuscatedName("ev")
public class class151 implements Comparator {

    @ObfuscatedName("ev.m")
    public final boolean field1950;

    public class151(boolean arg0) {
        this.field1950 = arg0;
    }

    @ObfuscatedName("ev.m(Lke;Lke;I)I")
    public int method3046(class291 arg0, class291 arg1) {
        return this.field1950 ? arg0.field3701 - arg1.field3701 : arg1.field3701 - arg0.field3701;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3046((class291) arg0, (class291) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
