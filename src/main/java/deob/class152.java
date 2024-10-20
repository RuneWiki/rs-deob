package deob;

import java.util.Comparator;

@ObfuscatedName("ec")
public class class152 implements Comparator {

    @ObfuscatedName("ec.a")
    public final boolean field1951;

    public class152(boolean arg0) {
        this.field1951 = arg0;
    }

    @ObfuscatedName("ec.a(Ljx;Ljx;I)I")
    public int method3176(class279 arg0, class279 arg1) {
        return this.field1951 ? arg0.field3598 - arg1.field3598 : arg1.field3598 - arg0.field3598;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3176((class279) arg0, (class279) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
