package deob;

@ObfuscatedName("aq")
public class class35 extends class174 {

    @ObfuscatedName("aq.o")
    public static class170 field903 = new class170(64);

    @ObfuscatedName("aq.n")
    public static class170 field920 = new class170(30);

    @ObfuscatedName("aq.l")
    public int field905;

    @ObfuscatedName("aq.v")
    public int field904;

    @ObfuscatedName("aq.g")
    public int field908 = -1;

    @ObfuscatedName("aq.x")
    public short[] field913;

    @ObfuscatedName("aq.c")
    public short[] field910;

    @ObfuscatedName("aq.f")
    public short[] field911;

    @ObfuscatedName("aq.r")
    public short[] field906;

    @ObfuscatedName("aq.d")
    public int field907 = 128;

    @ObfuscatedName("aq.a")
    public int field914 = 128;

    @ObfuscatedName("aq.q")
    public int field915 = 0;

    @ObfuscatedName("aq.u")
    public int field916 = 0;

    @ObfuscatedName("aq.w")
    public int field917 = 0;

    @ObfuscatedName("ea.p(Lep;Lep;B)V")
    public static void method3103(class152 arg0, class152 arg1) {
        Statics.field912 = arg0;
        Statics.field923 = arg1;
    }

    @ObfuscatedName("ew.i(II)Laq;")
    public static class35 method2756(int arg0) {
        class35 var1 = (class35) field903.method3264((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field912.method3049(13, arg0);
        class35 var3 = new class35();
        var3.field905 = arg0;
        if (var2 != null) {
            var3.method770(new class127(var2));
        }
        field903.method3269(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.o(Ldt;B)V")
    public void method770(class127 arg0) {
        while (true) {
            int var2 = arg0.method2659();
            if (var2 == 0) {
                return;
            }
            this.method771(arg0, var2);
        }
    }

    @ObfuscatedName("aq.n(Ldt;IB)V")
    public void method771(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field904 = arg0.method2652();
        } else if (arg1 == 2) {
            this.field908 = arg0.method2652();
        } else if (arg1 == 4) {
            this.field907 = arg0.method2652();
        } else if (arg1 == 5) {
            this.field914 = arg0.method2652();
        } else if (arg1 == 6) {
            this.field915 = arg0.method2652();
        } else if (arg1 == 7) {
            this.field916 = arg0.method2659();
        } else if (arg1 == 8) {
            this.field917 = arg0.method2659();
        } else if (arg1 == 40) {
            int var3 = arg0.method2659();
            this.field913 = new short[var3];
            this.field910 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field913[var4] = (short) arg0.method2652();
                this.field910[var4] = (short) arg0.method2652();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2659();
            this.field911 = new short[var5];
            this.field906 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field911[var6] = (short) arg0.method2652();
                this.field906[var6] = (short) arg0.method2652();
            }
        }
    }

    @ObfuscatedName("aq.l(II)Ldj;")
    public final class112 method780(int arg0) {
        class112 var2 = (class112) field920.method3264((long) this.field905);
        if (var2 == null) {
            class101 var3 = class101.method2078(Statics.field923, this.field904, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field913 != null) {
                for (int var4 = 0; var4 < this.field913.length; var4++) {
                    var3.method2092(this.field913[var4], this.field910[var4]);
                }
            }
            if (this.field911 != null) {
                for (int var5 = 0; var5 < this.field911.length; var5++) {
                    var3.method2093(this.field911[var5], this.field906[var5]);
                }
            }
            var2 = var3.method2099(this.field916 + 64, this.field917 + 850, -30, -50, -30);
            field920.method3269(var2, (long) this.field905);
        }
        class112 var6;
        if (this.field908 == -1 || arg0 == -1) {
            var6 = var2.method2269(true);
        } else {
            var6 = class34.method160(this.field908).method752(var2, arg0);
        }
        if (this.field907 != 128 || this.field914 != 128) {
            var6.method2274(this.field907, this.field914, this.field907);
        }
        if (this.field915 != 0) {
            if (this.field915 == 90) {
                var6.method2286();
            }
            if (this.field915 == 180) {
                var6.method2286();
                var6.method2286();
            }
            if (this.field915 == 270) {
                var6.method2286();
                var6.method2286();
                var6.method2286();
            }
        }
        return var6;
    }
}
