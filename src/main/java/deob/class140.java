package deob;

import java.util.Comparator;

@ObfuscatedName("ed")
public class class140 implements Comparator {

    @ObfuscatedName("ed.v")
    public final boolean field1919;

    public class140(boolean arg0) {
        this.field1919 = arg0;
    }

    @ObfuscatedName("ed.v(Lkx;Lkx;I)I")
    public int method2884(class290 arg0, class290 arg1) {
        return this.field1919 ? arg0.field3662 - arg1.field3662 : arg1.field3662 - arg0.field3662;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2884((class290) arg0, (class290) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
