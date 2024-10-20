package deob;

import java.util.Comparator;

@ObfuscatedName("ek")
public class class150 implements Comparator {

    @ObfuscatedName("ek.o")
    public final boolean field2142;

    public class150(boolean arg0) {
        this.field2142 = arg0;
    }

    @ObfuscatedName("ek.o(Lkv;Lkv;I)I")
    public int method2850(class302 arg0, class302 arg1) {
        return this.field2142 ? arg0.field3846 - arg1.field3846 : arg1.field3846 - arg0.field3846;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2850((class302) arg0, (class302) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
