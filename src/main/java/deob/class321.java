package deob;

@ObfuscatedName("ln")
public class class321 {

    @ObfuscatedName("ln.o")
    public static final class321 field3936 = new class321(0);

    @ObfuscatedName("ln.k")
    public static final class321 field3934 = new class321(1);

    @ObfuscatedName("ln.t")
    public static final class321 field3935 = new class321(2);

    @ObfuscatedName("ln.d")
    public final int field3933;

    @ObfuscatedName("kl.o(I)[Lln;")
    public static class321[] method4986() {
        return new class321[] { field3934, field3936, field3935 };
    }

    public class321(int arg0) {
        this.field3933 = arg0;
    }

    @ObfuscatedName("k.k(IB)Lln;")
    public static class321 method2(int arg0) {
        class321[] var1 = method4986();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class321 var3 = var1[var2];
            if (var3.field3933 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
