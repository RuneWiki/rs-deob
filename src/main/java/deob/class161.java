package deob;

import java.util.Comparator;

@ObfuscatedName("ff")
public class class161 implements Comparator {

    @ObfuscatedName("ff.x")
    public final boolean field1986;

    public class161(boolean arg0) {
        this.field1986 = arg0;
    }

    @ObfuscatedName("ff.x(Lke;Lke;I)I")
    public int method3182(class289 arg0, class289 arg1) {
        return this.field1986 ? arg0.field3610 - arg1.field3610 : arg1.field3610 - arg0.field3610;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3182((class289) arg0, (class289) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
