package deob;

import java.util.Comparator;

@ObfuscatedName("lv")
public class class315 implements Comparator {

    @ObfuscatedName("lv.y")
    public final boolean field3802;

    public class315(boolean arg0) {
        this.field3802 = arg0;
    }

    @ObfuscatedName("lv.y(Ljd;Ljd;B)I")
    public int method5311(class285 arg0, class285 arg1) {
        return this.field3802 ? arg0.method4962().method5080(arg1.method4962()) : arg1.method4962().method5080(arg0.method4962());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5311((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
