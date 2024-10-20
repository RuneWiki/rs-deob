package deob;

@ObfuscatedName("pc")
public class class436 {

    @ObfuscatedName("pc.c")
    public static final class436 field4596 = new class436(0);

    @ObfuscatedName("pc.b")
    public static final class436 field4597 = new class436(1);

    @ObfuscatedName("pc.p")
    public static final class436 field4595 = new class436(2);

    @ObfuscatedName("pc.m")
    public final int field4598;

    @ObfuscatedName("fl.c(I)[Lpc;")
    public static class436[] method3072() {
        return new class436[] { field4595, field4596, field4597 };
    }

    public class436(int arg0) {
        this.field4598 = arg0;
    }

    @ObfuscatedName("hn.b(II)Lpc;")
    public static class436 method4011(int arg0) {
        class436[] var1 = method3072();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class436 var3 = var1[var2];
            if (var3.field4598 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
