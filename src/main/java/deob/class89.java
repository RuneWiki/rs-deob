package deob;

import java.util.Comparator;

@ObfuscatedName("co")
public class class89 implements Comparator {

    @ObfuscatedName("co.s")
    public final boolean field1227;

    public class89(boolean arg0) {
        this.field1227 = arg0;
    }

    @ObfuscatedName("co.s(Llr;Llr;I)I")
    public int method2030(class328 arg0, class328 arg1) {
        return this.field1227 ? arg0.field3869 - arg1.field3869 : arg1.field3869 - arg0.field3869;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2030((class328) arg0, (class328) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
