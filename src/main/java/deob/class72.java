package deob;

@ObfuscatedName("bi")
public class class72 extends class405 {

    @ObfuscatedName("bi.c")
    public static class256 field977 = new class256(128);

    @ObfuscatedName("bi.v")
    public String field968;

    @ObfuscatedName("bi.q")
    public int[] field967;

    @ObfuscatedName("bi.f")
    public int[] field969;

    @ObfuscatedName("bi.j")
    public String[] field970;

    @ObfuscatedName("bi.e")
    public int field971;

    @ObfuscatedName("bi.g")
    public int field972;

    @ObfuscatedName("bi.w")
    public int field973;

    @ObfuscatedName("bi.y")
    public int field974;

    @ObfuscatedName("bi.i")
    public class419[] field975;

    @ObfuscatedName("lb.c(IB)Lbi;")
    public static class72 method5510(int arg0) {
        class72 var1 = (class72) field977.method4691((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3168.method5305(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class72 var3 = Statics.method5764(var2);
            field977.method4693(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("ey.v(IIIB)Lbi;")
    public static class72 method2863(int arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0;
        class72 var5 = method4959(var3, arg0);
        if (var5 == null) {
            int var6 = (-3 - arg2 << 8) + arg0;
            class72 var8 = method4959(var6, arg0);
            return var8 == null ? null : var8;
        } else {
            return var5;
        }
    }

    @ObfuscatedName("ji.q(III)Lbi;")
    public static class72 method4959(int arg0, int arg1) {
        class72 var2 = (class72) field977.method4691((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field3168.method5349(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field3168.method5306(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class72 var6 = Statics.method5764(var5);
            if (var6 != null) {
                field977.method4693(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("bi.j(II)[Lpb;")
    public class419[] method1884(int arg0) {
        return new class419[arg0];
    }
}
