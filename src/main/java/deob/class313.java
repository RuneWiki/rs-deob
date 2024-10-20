package deob;

@ObfuscatedName("ly")
public class class313 {

    @ObfuscatedName("ly.n")
    public static final class313 field3801 = new class313(0);

    @ObfuscatedName("ly.h")
    public static final class313 field3803 = new class313(1);

    @ObfuscatedName("ly.l")
    public static final class313 field3802 = new class313(2);

    @ObfuscatedName("ly.g")
    public final int field3800;

    @ObfuscatedName("ah.n(B)[Lly;")
    public static class313[] method518() {
        return new class313[] { field3801, field3802, field3803 };
    }

    public class313(int arg0) {
        this.field3800 = arg0;
    }

    @ObfuscatedName("jk.h(II)Lly;")
    public static class313 method4746(int arg0) {
        class313[] var1 = method518();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class313 var3 = var1[var2];
            if (var3.field3800 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
