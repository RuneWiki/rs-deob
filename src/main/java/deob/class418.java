package deob;

@ObfuscatedName("pz")
public class class418 {

    @ObfuscatedName("pz.i")
    public static final class418 field4423 = new class418(0);

    @ObfuscatedName("pz.w")
    public static final class418 field4426 = new class418(1);

    @ObfuscatedName("pz.s")
    public static final class418 field4424 = new class418(2);

    @ObfuscatedName("pz.a")
    public final int field4425;

    public class418(int arg0) {
        this.field4425 = arg0;
    }

    @ObfuscatedName("gq.i(II)Lpz;")
    public static class418 method3737(int arg0) {
        class418[] var1 = new class418[] { field4426, field4424, field4423 };
        class418[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class418 var4 = var2[var3];
            if (var4.field4425 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
