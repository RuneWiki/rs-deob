package deob;

@ObfuscatedName("hh")
public class class215 {

    @ObfuscatedName("hh.c")
    public static final class215 field2601 = new class215(0, 0, 4);

    @ObfuscatedName("hh.l")
    public static final class215 field2602 = new class215(1, 1, 2);

    @ObfuscatedName("hh.s")
    public static final class215 field2605 = new class215(2, 2, 0);

    @ObfuscatedName("hh.e")
    public final int field2600;

    @ObfuscatedName("hh.r")
    public final int field2604;

    @ObfuscatedName("hh.o")
    public final int field2603;

    @ObfuscatedName("hh.c(I)[Lhh;")
    public static class215[] method3961() {
        return new class215[] { field2601, field2605, field2602 };
    }

    public class215(int arg0, int arg1, int arg2) {
        this.field2600 = arg0;
        this.field2604 = arg1;
        this.field2603 = arg2;
    }

    @ObfuscatedName("hh.l(FI)Z")
    public boolean method3963(float arg0) {
        return arg0 >= (float) this.field2603;
    }

    @ObfuscatedName("hh.s(IB)Lhh;")
    public static class215 method3972(int arg0) {
        class215[] var1 = method3961();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class215 var3 = var1[var2];
            if (var3.field2604 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
