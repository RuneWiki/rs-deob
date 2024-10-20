package deob;

import java.util.Comparator;

@ObfuscatedName("et")
public class class140 implements Comparator {

    @ObfuscatedName("et.f")
    public final boolean field1911;

    public class140(boolean arg0) {
        this.field1911 = arg0;
    }

    @ObfuscatedName("et.f(Lkd;Lkd;I)I")
    public int method2902(class290 arg0, class290 arg1) {
        return this.field1911 ? arg0.field3694 - arg1.field3694 : arg1.field3694 - arg0.field3694;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2902((class290) arg0, (class290) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
