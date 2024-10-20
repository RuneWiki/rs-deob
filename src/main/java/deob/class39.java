package deob;

@ObfuscatedName("ai")
public class class39 extends class182 {

    @ObfuscatedName("ai.i")
    public static class171 field915 = new class171(64);

    @ObfuscatedName("ai.p")
    public static class171 field929 = new class171(30);

    @ObfuscatedName("ai.c")
    public int field916;

    @ObfuscatedName("ai.y")
    public int field917;

    @ObfuscatedName("ai.g")
    public int field912 = -1;

    @ObfuscatedName("ai.l")
    public short[] field919;

    @ObfuscatedName("ai.h")
    public short[] field920;

    @ObfuscatedName("ai.n")
    public short[] field921;

    @ObfuscatedName("ai.w")
    public short[] field922;

    @ObfuscatedName("ai.m")
    public int field927 = 128;

    @ObfuscatedName("ai.x")
    public int field924 = 128;

    @ObfuscatedName("ai.b")
    public int field925 = 0;

    @ObfuscatedName("ai.u")
    public int field926 = 0;

    @ObfuscatedName("ai.r")
    public int field923 = 0;

    @ObfuscatedName("eq.t(II)Lai;")
    public static class39 method2654(int arg0) {
        class39 var1 = (class39) field915.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field914.method2668(13, arg0);
        class39 var3 = new class39();
        var3.field916 = arg0;
        if (var2 != null) {
            var3.method747(new class107(var2));
        }
        field915.method3101(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.o(Ldg;I)V")
    public void method747(class107 arg0) {
        while (true) {
            int var2 = arg0.method2118();
            if (var2 == 0) {
                return;
            }
            this.method753(arg0, var2);
        }
    }

    @ObfuscatedName("ai.i(Ldg;II)V")
    public void method753(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field917 = arg0.method2120();
        } else if (arg1 == 2) {
            this.field912 = arg0.method2120();
        } else if (arg1 == 4) {
            this.field927 = arg0.method2120();
        } else if (arg1 == 5) {
            this.field924 = arg0.method2120();
        } else if (arg1 == 6) {
            this.field925 = arg0.method2120();
        } else if (arg1 == 7) {
            this.field926 = arg0.method2118();
        } else if (arg1 == 8) {
            this.field923 = arg0.method2118();
        } else if (arg1 == 40) {
            int var3 = arg0.method2118();
            this.field919 = new short[var3];
            this.field920 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field919[var4] = (short) arg0.method2120();
                this.field920[var4] = (short) arg0.method2120();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2118();
            this.field921 = new short[var5];
            this.field922 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field921[var6] = (short) arg0.method2120();
                this.field922[var6] = (short) arg0.method2120();
            }
        }
    }

    @ObfuscatedName("ai.p(II)Lcx;")
    public final class98 method744(int arg0) {
        class98 var2 = (class98) field929.method3099((long) this.field916);
        if (var2 == null) {
            class93 var3 = class93.method1883(Statics.field913, this.field917, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field919 != null) {
                for (int var4 = 0; var4 < this.field919.length; var4++) {
                    var3.method1924(this.field919[var4], this.field920[var4]);
                }
            }
            if (this.field921 != null) {
                for (int var5 = 0; var5 < this.field921.length; var5++) {
                    var3.method1945(this.field921[var5], this.field922[var5]);
                }
            }
            var2 = var3.method1917(this.field926 + 64, this.field923 + 850, -30, -50, -30);
            field929.method3101(var2, (long) this.field916);
        }
        class98 var6;
        if (this.field912 == -1 || arg0 == -1) {
            var6 = var2.method1990(true);
        } else {
            var6 = class38.method1579(this.field912).method712(var2, arg0);
        }
        if (this.field927 != 128 || this.field924 != 128) {
            var6.method2018(this.field927, this.field924, this.field927);
        }
        if (this.field925 != 0) {
            if (this.field925 == 90) {
                var6.method1980();
            }
            if (this.field925 == 180) {
                var6.method1980();
                var6.method1980();
            }
            if (this.field925 == 270) {
                var6.method1980();
                var6.method1980();
                var6.method1980();
            }
        }
        return var6;
    }
}
