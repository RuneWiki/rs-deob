package deob;

import java.util.Comparator;

@ObfuscatedName("er")
public class class149 implements Comparator {

    @ObfuscatedName("er.b")
    public final boolean field2076;

    public class149(boolean arg0) {
        this.field2076 = arg0;
    }

    @ObfuscatedName("er.b(Lku;Lku;I)I")
    public int method2865(class288 arg0, class288 arg1) {
        return this.field2076 ? arg0.field3719 - arg1.field3719 : arg1.field3719 - arg0.field3719;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2865((class288) arg0, (class288) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
