package deob;

@ObfuscatedName("lz")
public class class321 {

    @ObfuscatedName("lz.g")
    public static final class321 field3938 = new class321(0);

    @ObfuscatedName("lz.e")
    public static final class321 field3935 = new class321(1);

    @ObfuscatedName("lz.b")
    public static final class321 field3937 = new class321(2);

    @ObfuscatedName("lz.z")
    public final int field3936;

    public class321(int arg0) {
        this.field3936 = arg0;
    }

    @ObfuscatedName("ab.g(II)Llz;")
    public static class321 method527(int arg0) {
        class321[] var1 = new class321[] { field3935, field3937, field3938 };
        class321[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class321 var4 = var2[var3];
            if (var4.field3936 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
