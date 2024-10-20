package deob;

@ObfuscatedName("jg")
public class class278 {

    @ObfuscatedName("jg.e")
    public static final class278 field3719 = new class278(0);

    @ObfuscatedName("jg.n")
    public static final class278 field3714 = new class278(1);

    @ObfuscatedName("jg.g")
    public static final class278 field3717 = new class278(2);

    @ObfuscatedName("jg.y")
    public final int field3715;

    @ObfuscatedName("ia.e(I)[Ljg;")
    public static class278[] method4236() {
        return new class278[] { field3719, field3717, field3714 };
    }

    public class278(int arg0) {
        this.field3715 = arg0;
    }

    @ObfuscatedName("fa.n(II)Ljg;")
    public static class278 method2906(int arg0) {
        class278[] var1 = method4236();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class278 var3 = var1[var2];
            if (var3.field3715 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
