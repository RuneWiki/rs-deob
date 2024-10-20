package deob;

@ObfuscatedName("oo")
public class class402 {

    @ObfuscatedName("oo.s")
    public static final class402 field4300 = new class402(0);

    @ObfuscatedName("oo.t")
    public static final class402 field4299 = new class402(1);

    @ObfuscatedName("oo.v")
    public static final class402 field4298 = new class402(2);

    @ObfuscatedName("oo.j")
    public final int field4301;

    public class402(int arg0) {
        this.field4301 = arg0;
    }

    @ObfuscatedName("fw.s(II)Loo;")
    public static class402 method2815(int arg0) {
        class402[] var1 = new class402[] { field4298, field4300, field4299 };
        class402[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class402 var4 = var2[var3];
            if (var4.field4301 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
