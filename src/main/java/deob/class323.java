package deob;

import java.util.Comparator;

@ObfuscatedName("lm")
public class class323 implements Comparator {

    @ObfuscatedName("lm.d")
    public final boolean field3933;

    public class323(boolean arg0) {
        this.field3933 = arg0;
    }

    @ObfuscatedName("lm.d(Lkm;Lkm;B)I")
    public int method5293(class297 arg0, class297 arg1) {
        return this.field3933 ? arg0.method4975().method5099(arg1.method4975()) : arg1.method4975().method5099(arg0.method4975());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5293((class297) arg0, (class297) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
