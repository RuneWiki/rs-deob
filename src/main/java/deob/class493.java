package deob;

@ObfuscatedName("ra")
public class class493 {

    @ObfuscatedName("ra.f")
    public static final class493 field5075 = new class493(0);

    @ObfuscatedName("ra.w")
    public static final class493 field5073 = new class493(1);

    @ObfuscatedName("ra.v")
    public static final class493 field5074 = new class493(2);

    @ObfuscatedName("ra.s")
    public final int field5072;

    @ObfuscatedName("at.f(I)[Lra;")
    public static class493[] method488() {
        return new class493[] { field5075, field5073, field5074 };
    }

    public class493(int arg0) {
        this.field5072 = arg0;
    }

    @ObfuscatedName("gj.w(IB)Lra;")
    public static class493 method3420(int arg0) {
        class493[] var1 = method488();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class493 var3 = var1[var2];
            if (var3.field5072 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
