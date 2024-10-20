package deob;

@ObfuscatedName("am")
public class class34 extends class173 {

    @ObfuscatedName("am.w")
    public static class169 field918 = new class169(64);

    @ObfuscatedName("am.h")
    public static class169 field916 = new class169(30);

    @ObfuscatedName("am.v")
    public int field902;

    @ObfuscatedName("am.k")
    public int field903;

    @ObfuscatedName("am.g")
    public int field904 = -1;

    @ObfuscatedName("am.n")
    public short[] field905;

    @ObfuscatedName("am.c")
    public short[] field906;

    @ObfuscatedName("am.o")
    public short[] field907;

    @ObfuscatedName("am.u")
    public short[] field911;

    @ObfuscatedName("am.z")
    public int field909 = 128;

    @ObfuscatedName("am.e")
    public int field910 = 128;

    @ObfuscatedName("am.l")
    public int field901 = 0;

    @ObfuscatedName("am.m")
    public int field912 = 0;

    @ObfuscatedName("am.s")
    public int field913 = 0;

    @ObfuscatedName("b.p(Ler;Ler;I)V")
    public static void method227(class151 arg0, class151 arg1) {
        Statics.field908 = arg0;
        Statics.field899 = arg1;
    }

    @ObfuscatedName("j.j(II)Lam;")
    public static class34 method7(int arg0) {
        class34 var1 = (class34) field918.method3214((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field908.method2973(13, arg0);
        class34 var3 = new class34();
        var3.field902 = arg0;
        if (var2 != null) {
            var3.method708(new class126(var2));
        }
        field918.method3223(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.w(Ldv;I)V")
    public void method708(class126 arg0) {
        while (true) {
            int var2 = arg0.method2544();
            if (var2 == 0) {
                return;
            }
            this.method709(arg0, var2);
        }
    }

    @ObfuscatedName("am.h(Ldv;II)V")
    public void method709(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field903 = arg0.method2489();
        } else if (arg1 == 2) {
            this.field904 = arg0.method2489();
        } else if (arg1 == 4) {
            this.field909 = arg0.method2489();
        } else if (arg1 == 5) {
            this.field910 = arg0.method2489();
        } else if (arg1 == 6) {
            this.field901 = arg0.method2489();
        } else if (arg1 == 7) {
            this.field912 = arg0.method2544();
        } else if (arg1 == 8) {
            this.field913 = arg0.method2544();
        } else if (arg1 == 40) {
            int var3 = arg0.method2544();
            this.field905 = new short[var3];
            this.field906 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field905[var4] = (short) arg0.method2489();
                this.field906[var4] = (short) arg0.method2489();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2544();
            this.field907 = new short[var5];
            this.field911 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field907[var6] = (short) arg0.method2489();
                this.field911[var6] = (short) arg0.method2489();
            }
        }
    }

    @ObfuscatedName("am.v(II)Ldm;")
    public final class111 method713(int arg0) {
        class111 var2 = (class111) field916.method3214((long) this.field902);
        if (var2 == null) {
            class100 var3 = class100.method1997(Statics.field899, this.field903, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field905 != null) {
                for (int var4 = 0; var4 < this.field905.length; var4++) {
                    var3.method2010(this.field905[var4], this.field906[var4]);
                }
            }
            if (this.field907 != null) {
                for (int var5 = 0; var5 < this.field907.length; var5++) {
                    var3.method2011(this.field907[var5], this.field911[var5]);
                }
            }
            var2 = var3.method2042(this.field912 + 64, this.field913 + 850, -30, -50, -30);
            field916.method3223(var2, (long) this.field902);
        }
        class111 var6;
        if (this.field904 == -1 || arg0 == -1) {
            var6 = var2.method2182(true);
        } else {
            var6 = class33.method751(this.field904).method676(var2, arg0);
        }
        if (this.field909 != 128 || this.field910 != 128) {
            var6.method2239(this.field909, this.field910, this.field909);
        }
        if (this.field901 != 0) {
            if (this.field901 == 90) {
                var6.method2189();
            }
            if (this.field901 == 180) {
                var6.method2189();
                var6.method2189();
            }
            if (this.field901 == 270) {
                var6.method2189();
                var6.method2189();
                var6.method2189();
            }
        }
        return var6;
    }
}
