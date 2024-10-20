package deob;

@ObfuscatedName("hh")
public class class215 {

    @ObfuscatedName("hh.c")
    public static final class215 field2578 = new class215(2, 0, 4);

    @ObfuscatedName("hh.b")
    public static final class215 field2576 = new class215(1, 1, 2);

    @ObfuscatedName("hh.p")
    public static final class215 field2577 = new class215(0, 2, 0);

    @ObfuscatedName("hh.m")
    public final int field2584;

    @ObfuscatedName("hh.t")
    public final int field2579;

    @ObfuscatedName("hh.s")
    public final int field2580;

    @ObfuscatedName("hh.c(I)[Lhh;")
    public static class215[] method4015() {
        return new class215[] { field2577, field2576, field2578 };
    }

    public class215(int arg0, int arg1, int arg2) {
        this.field2584 = arg0;
        this.field2579 = arg1;
        this.field2580 = arg2;
    }

    @ObfuscatedName("hh.b(FI)Z")
    public boolean method4028(float arg0) {
        return arg0 >= (float) this.field2580;
    }

    @ObfuscatedName("hh.p(II)Lhh;")
    public static class215 method4020(int arg0) {
        class215[] var1 = method4015();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class215 var3 = var1[var2];
            if (var3.field2579 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
