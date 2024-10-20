package deob;

@ObfuscatedName("ac")
public class class39 extends class180 {

    @ObfuscatedName("ac.k")
    public static class170 field920 = new class170(64);

    @ObfuscatedName("ac.v")
    public static class170 field907 = new class170(30);

    @ObfuscatedName("ac.l")
    public int field911;

    @ObfuscatedName("ac.g")
    public int field909;

    @ObfuscatedName("ac.a")
    public int field905 = -1;

    @ObfuscatedName("ac.x")
    public short[] field910;

    @ObfuscatedName("ac.r")
    public short[] field912;

    @ObfuscatedName("ac.w")
    public short[] field913;

    @ObfuscatedName("ac.c")
    public short[] field914;

    @ObfuscatedName("ac.f")
    public int field915 = 128;

    @ObfuscatedName("ac.o")
    public int field916 = 128;

    @ObfuscatedName("ac.p")
    public int field917 = 0;

    @ObfuscatedName("ac.n")
    public int field918 = 0;

    @ObfuscatedName("ac.m")
    public int field919 = 0;

    @ObfuscatedName("o.y(Lev;Lev;I)V")
    public static void method129(class145 arg0, class145 arg1) {
        Statics.field908 = arg0;
        Statics.field906 = arg1;
    }

    @ObfuscatedName("es.u(II)Lac;")
    public static class39 method2683(int arg0) {
        class39 var1 = (class39) field920.method3145((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field908.method2704(13, arg0);
        class39 var3 = new class39();
        var3.field911 = arg0;
        if (var2 != null) {
            var3.method747(new class107(var2));
        }
        field920.method3147(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.k(Ldo;I)V")
    public void method747(class107 arg0) {
        while (true) {
            int var2 = arg0.method2109();
            if (var2 == 0) {
                return;
            }
            this.method745(arg0, var2);
        }
    }

    @ObfuscatedName("ac.v(Ldo;IB)V")
    public void method745(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field909 = arg0.method2111();
        } else if (arg1 == 2) {
            this.field905 = arg0.method2111();
        } else if (arg1 == 4) {
            this.field915 = arg0.method2111();
        } else if (arg1 == 5) {
            this.field916 = arg0.method2111();
        } else if (arg1 == 6) {
            this.field917 = arg0.method2111();
        } else if (arg1 == 7) {
            this.field918 = arg0.method2109();
        } else if (arg1 == 8) {
            this.field919 = arg0.method2109();
        } else if (arg1 == 40) {
            int var3 = arg0.method2109();
            this.field910 = new short[var3];
            this.field912 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field910[var4] = (short) arg0.method2111();
                this.field912[var4] = (short) arg0.method2111();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2109();
            this.field913 = new short[var5];
            this.field914 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field913[var6] = (short) arg0.method2111();
                this.field914[var6] = (short) arg0.method2111();
            }
        }
    }

    @ObfuscatedName("ac.l(IB)Lcz;")
    public final class98 method739(int arg0) {
        class98 var2 = (class98) field907.method3145((long) this.field911);
        if (var2 == null) {
            class93 var3 = class93.method1873(Statics.field906, this.field909, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field910 != null) {
                for (int var4 = 0; var4 < this.field910.length; var4++) {
                    var3.method1886(this.field910[var4], this.field912[var4]);
                }
            }
            if (this.field913 != null) {
                for (int var5 = 0; var5 < this.field913.length; var5++) {
                    var3.method1930(this.field913[var5], this.field914[var5]);
                }
            }
            var2 = var3.method1894(this.field918 + 64, this.field919 + 850, -30, -50, -30);
            field907.method3147(var2, (long) this.field911);
        }
        class98 var6;
        if (this.field905 == -1 || arg0 == -1) {
            var6 = var2.method1964(true);
        } else {
            var6 = class38.method1866(this.field905).method693(var2, arg0);
        }
        if (this.field915 != 128 || this.field916 != 128) {
            var6.method1978(this.field915, this.field916, this.field915);
        }
        if (this.field917 != 0) {
            if (this.field917 == 90) {
                var6.method1972();
            }
            if (this.field917 == 180) {
                var6.method1972();
                var6.method1972();
            }
            if (this.field917 == 270) {
                var6.method1972();
                var6.method1972();
                var6.method1972();
            }
        }
        return var6;
    }
}
