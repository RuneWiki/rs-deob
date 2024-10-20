package deob;

@ObfuscatedName("pa")
public class class418 {

    @ObfuscatedName("pa.l")
    public static final class418 field4413 = new class418(0);

    @ObfuscatedName("pa.q")
    public static final class418 field4412 = new class418(1);

    @ObfuscatedName("pa.f")
    public static final class418 field4414 = new class418(2);

    @ObfuscatedName("pa.j")
    public final int field4415;

    @ObfuscatedName("hg.l(I)[Lpa;")
    public static class418[] method3823() {
        return new class418[] { field4413, field4414, field4412 };
    }

    public class418(int arg0) {
        this.field4415 = arg0;
    }

    @ObfuscatedName("de.q(II)Lpa;")
    public static class418 method2488(int arg0) {
        class418[] var1 = method3823();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class418 var3 = var1[var2];
            if (var3.field4415 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
