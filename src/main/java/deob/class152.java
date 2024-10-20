package deob;

import java.util.Comparator;

@ObfuscatedName("eb")
public class class152 implements Comparator {

    @ObfuscatedName("eb.s")
    public final boolean field1949;

    public class152(boolean arg0) {
        this.field1949 = arg0;
    }

    @ObfuscatedName("eb.s(Ljt;Ljt;B)I")
    public int method3112(class279 arg0, class279 arg1) {
        return this.field1949 ? arg0.field3589 - arg1.field3589 : arg1.field3589 - arg0.field3589;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3112((class279) arg0, (class279) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
