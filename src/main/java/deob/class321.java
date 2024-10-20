package deob;

@ObfuscatedName("lb")
public class class321 {

    @ObfuscatedName("lb.f")
    public static final class321 field3828 = new class321(0);

    @ObfuscatedName("lb.b")
    public static final class321 field3825 = new class321(1);

    @ObfuscatedName("lb.l")
    public static final class321 field3827 = new class321(2);

    @ObfuscatedName("lb.m")
    public final int field3826;

    @ObfuscatedName("ek.f(I)[Llb;")
    public static class321[] method2724() {
        return new class321[] { field3827, field3825, field3828 };
    }

    public class321(int arg0) {
        this.field3826 = arg0;
    }

    @ObfuscatedName("bh.b(II)Llb;")
    public static class321 method1128(int arg0) {
        class321[] var1 = method2724();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class321 var3 = var1[var2];
            if (var3.field3826 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
