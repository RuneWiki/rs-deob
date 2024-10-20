package deob;

@ObfuscatedName("ln")
public class class314 {

    @ObfuscatedName("ln.a")
    public static final class314 field3814 = new class314(0);

    @ObfuscatedName("ln.s")
    public static final class314 field3813 = new class314(1);

    @ObfuscatedName("ln.g")
    public static final class314 field3815 = new class314(2);

    @ObfuscatedName("ln.x")
    public final int field3812;

    public class314(int arg0) {
        this.field3812 = arg0;
    }

    @ObfuscatedName("bp.a(II)Lln;")
    public static class314 method1024(int arg0) {
        class314[] var1 = new class314[] { field3815, field3814, field3813 };
        class314[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class314 var4 = var2[var3];
            if (var4.field3812 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
