package deob;

import java.util.Comparator;

@ObfuscatedName("ey")
public class class152 implements Comparator {

    @ObfuscatedName("ey.z")
    public final boolean field1947;

    public class152(boolean arg0) {
        this.field1947 = arg0;
    }

    @ObfuscatedName("ey.z(Ljl;Ljl;I)I")
    public int method3043(class279 arg0, class279 arg1) {
        return this.field1947 ? arg0.field3598 - arg1.field3598 : arg1.field3598 - arg0.field3598;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3043((class279) arg0, (class279) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
