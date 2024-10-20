package deob;

import java.util.Comparator;

@ObfuscatedName("lp")
public class class325 implements Comparator {

    @ObfuscatedName("lp.h")
    public final boolean field3861;

    public class325(boolean arg0) {
        this.field3861 = arg0;
    }

    @ObfuscatedName("lp.h(Lju;Lju;B)I")
    public int method5478(class285 arg0, class285 arg1) {
        return this.field3861 ? arg0.method4703(arg1) : arg1.method4703(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5478((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
