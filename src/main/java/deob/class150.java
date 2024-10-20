package deob;

import java.util.Comparator;

@ObfuscatedName("eq")
public class class150 implements Comparator {

    @ObfuscatedName("eq.c")
    public final boolean field2123;

    public class150(boolean arg0) {
        this.field2123 = arg0;
    }

    @ObfuscatedName("eq.c(Lke;Lke;I)I")
    public int method2888(class302 arg0, class302 arg1) {
        return this.field2123 ? arg0.field3840 - arg1.field3840 : arg1.field3840 - arg0.field3840;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2888((class302) arg0, (class302) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
