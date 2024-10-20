package deob;

@ObfuscatedName("ab")
public class class41 extends class195 {

    @ObfuscatedName("ab.e")
    public static class184 field965 = new class184(64);

    @ObfuscatedName("ab.f")
    public static class184 field971 = new class184(30);

    @ObfuscatedName("ab.w")
    public int field967;

    @ObfuscatedName("ab.t")
    public int field980;

    @ObfuscatedName("ab.s")
    public int field969 = -1;

    @ObfuscatedName("ab.c")
    public short[] field970;

    @ObfuscatedName("ab.d")
    public short[] field972;

    @ObfuscatedName("ab.v")
    public short[] field974;

    @ObfuscatedName("ab.m")
    public short[] field973;

    @ObfuscatedName("ab.h")
    public int field968 = 128;

    @ObfuscatedName("ab.n")
    public int field975 = 128;

    @ObfuscatedName("ab.x")
    public int field976 = 0;

    @ObfuscatedName("ab.o")
    public int field966 = 0;

    @ObfuscatedName("ab.r")
    public int field983 = 0;

    @ObfuscatedName("h.p(Lff;Lff;I)V")
    public static void method129(class158 arg0, class158 arg1) {
        Statics.field978 = arg0;
        Statics.field2566 = arg1;
    }

    @ObfuscatedName("ej.k(II)Lab;")
    public static class41 method2637(int arg0) {
        class41 var1 = (class41) field965.method3371((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field978.method2896(13, arg0);
        class41 var3 = new class41();
        var3.field967 = arg0;
        if (var2 != null) {
            var3.method778(new class111(var2));
        }
        field965.method3370(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.e(Lde;I)V")
    public void method778(class111 arg0) {
        while (true) {
            int var2 = arg0.method2314();
            if (var2 == 0) {
                return;
            }
            this.method779(arg0, var2);
        }
    }

    @ObfuscatedName("ab.f(Lde;IB)V")
    public void method779(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field980 = arg0.method2177();
        } else if (arg1 == 2) {
            this.field969 = arg0.method2177();
        } else if (arg1 == 4) {
            this.field968 = arg0.method2177();
        } else if (arg1 == 5) {
            this.field975 = arg0.method2177();
        } else if (arg1 == 6) {
            this.field976 = arg0.method2177();
        } else if (arg1 == 7) {
            this.field966 = arg0.method2314();
        } else if (arg1 == 8) {
            this.field983 = arg0.method2314();
        } else if (arg1 == 40) {
            int var3 = arg0.method2314();
            this.field970 = new short[var3];
            this.field972 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field970[var4] = (short) arg0.method2177();
                this.field972[var4] = (short) arg0.method2177();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2314();
            this.field974 = new short[var5];
            this.field973 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field974[var6] = (short) arg0.method2177();
                this.field973[var6] = (short) arg0.method2177();
            }
        }
    }

    @ObfuscatedName("ab.w(IS)Lcm;")
    public final class100 method780(int arg0) {
        class100 var2 = (class100) field971.method3371((long) this.field967);
        if (var2 == null) {
            class95 var3 = class95.method1916(Statics.field2566, this.field980, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field970 != null) {
                for (int var4 = 0; var4 < this.field970.length; var4++) {
                    var3.method1929(this.field970[var4], this.field972[var4]);
                }
            }
            if (this.field974 != null) {
                for (int var5 = 0; var5 < this.field974.length; var5++) {
                    var3.method1930(this.field974[var5], this.field973[var5]);
                }
            }
            var2 = var3.method1937(this.field966 + 64, this.field983 + 850, -30, -50, -30);
            field971.method3370(var2, (long) this.field967);
        }
        class100 var6;
        if (this.field969 == -1 || arg0 == -1) {
            var6 = var2.method2025(true);
        } else {
            var6 = class40.method678(this.field969).method744(var2, arg0);
        }
        if (this.field968 != 128 || this.field975 != 128) {
            var6.method2051(this.field968, this.field975, this.field968);
        }
        if (this.field976 != 0) {
            if (this.field976 == 90) {
                var6.method2033();
            }
            if (this.field976 == 180) {
                var6.method2033();
                var6.method2033();
            }
            if (this.field976 == 270) {
                var6.method2033();
                var6.method2033();
                var6.method2033();
            }
        }
        return var6;
    }

    @ObfuscatedName("ej.t(B)V")
    public static void method2639() {
        field965.method3374();
        field971.method3374();
    }
}
