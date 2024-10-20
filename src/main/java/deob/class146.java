package deob;

import java.util.Comparator;

@ObfuscatedName("ei")
public class class146 implements Comparator {

    @ObfuscatedName("ei.f")
    public final boolean field1935;

    public class146(boolean arg0) {
        this.field1935 = arg0;
    }

    @ObfuscatedName("ei.f(Ljt;Ljt;I)I")
    public int method3042(class279 arg0, class279 arg1) {
        return this.field1935 ? arg0.field3593 - arg1.field3593 : arg1.field3593 - arg0.field3593;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3042((class279) arg0, (class279) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
