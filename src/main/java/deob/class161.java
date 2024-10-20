package deob;

import java.util.Comparator;

@ObfuscatedName("fz")
public class class161 implements Comparator {

    @ObfuscatedName("fz.h")
    public final boolean field1988;

    public class161(boolean arg0) {
        this.field1988 = arg0;
    }

    @ObfuscatedName("fz.h(Lkz;Lkz;I)I")
    public int method3193(class290 arg0, class290 arg1) {
        return this.field1988 ? arg0.field3650 - arg1.field3650 : arg1.field3650 - arg0.field3650;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3193((class290) arg0, (class290) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
