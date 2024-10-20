package deob;

import java.util.Comparator;

@ObfuscatedName("ec")
public class class140 implements Comparator {

    @ObfuscatedName("ec.f")
    public final boolean field1926;

    public class140(boolean arg0) {
        this.field1926 = arg0;
    }

    @ObfuscatedName("ec.f(Lkj;Lkj;I)I")
    public int method2957(class290 arg0, class290 arg1) {
        return this.field1926 ? arg0.field3700 - arg1.field3700 : arg1.field3700 - arg0.field3700;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2957((class290) arg0, (class290) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
