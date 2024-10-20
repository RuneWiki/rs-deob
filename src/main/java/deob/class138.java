package deob;

import java.util.Comparator;

@ObfuscatedName("ey")
public class class138 implements Comparator {

    @ObfuscatedName("ey.z")
    public final boolean field1871;

    public class138(boolean arg0) {
        this.field1871 = arg0;
    }

    @ObfuscatedName("ey.z(Lkz;Lkz;I)I")
    public int method2890(class288 arg0, class288 arg1) {
        return this.field1871 ? arg0.field3628 - arg1.field3628 : arg1.field3628 - arg0.field3628;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2890((class288) arg0, (class288) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
