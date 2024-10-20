package deob;

import java.util.Comparator;

@ObfuscatedName("lc")
public class class323 implements Comparator {

    @ObfuscatedName("lc.t")
    public final boolean field3941;

    public class323(boolean arg0) {
        this.field3941 = arg0;
    }

    @ObfuscatedName("lc.t(Lkv;Lkv;I)I")
    public int method5221(class297 arg0, class297 arg1) {
        return this.field3941 ? arg0.method4856().method5007(arg1.method4856()) : arg1.method4856().method5007(arg0.method4856());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5221((class297) arg0, (class297) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
