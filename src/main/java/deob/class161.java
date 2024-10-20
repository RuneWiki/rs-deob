package deob;

import java.util.Comparator;

@ObfuscatedName("fc")
public class class161 implements Comparator {

    @ObfuscatedName("fc.m")
    public final boolean field1990;

    public class161(boolean arg0) {
        this.field1990 = arg0;
    }

    @ObfuscatedName("fc.m(Lkx;Lkx;I)I")
    public int method3175(class289 arg0, class289 arg1) {
        return this.field1990 ? arg0.field3641 - arg1.field3641 : arg1.field3641 - arg0.field3641;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3175((class289) arg0, (class289) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
