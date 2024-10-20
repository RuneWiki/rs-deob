package deob;

import java.util.Comparator;

@ObfuscatedName("eo")
public class class150 implements Comparator {

    @ObfuscatedName("eo.d")
    public final boolean field2113;

    public class150(boolean arg0) {
        this.field2113 = arg0;
    }

    @ObfuscatedName("eo.d(Lkz;Lkz;I)I")
    public int method2927(class302 arg0, class302 arg1) {
        return this.field2113 ? arg0.field3841 - arg1.field3841 : arg1.field3841 - arg0.field3841;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2927((class302) arg0, (class302) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
