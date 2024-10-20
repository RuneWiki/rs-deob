package deob;

@ObfuscatedName("ac")
public class class35 extends class174 {

    @ObfuscatedName("ac.p")
    public static class170 field909 = new class170(64);

    @ObfuscatedName("ac.z")
    public static class170 field903 = new class170(30);

    @ObfuscatedName("ac.m")
    public int field904;

    @ObfuscatedName("ac.k")
    public int field908;

    @ObfuscatedName("ac.v")
    public int field906 = -1;

    @ObfuscatedName("ac.y")
    public short[] field911;

    @ObfuscatedName("ac.d")
    public short[] field900;

    @ObfuscatedName("ac.l")
    public short[] field905;

    @ObfuscatedName("ac.h")
    public short[] field910;

    @ObfuscatedName("ac.b")
    public int field916 = 128;

    @ObfuscatedName("ac.r")
    public int field912 = 128;

    @ObfuscatedName("ac.t")
    public int field913 = 0;

    @ObfuscatedName("ac.u")
    public int field914 = 0;

    @ObfuscatedName("ac.g")
    public int field915 = 0;

    @ObfuscatedName("dy.q(Ley;Ley;I)V")
    public static void method2401(class153 arg0, class153 arg1) {
        Statics.field907 = arg0;
        Statics.field901 = arg1;
    }

    @ObfuscatedName("u.c(IB)Lac;")
    public static class35 method131(int arg0) {
        class35 var1 = (class35) field909.method3215((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field907.method2952(13, arg0);
        class35 var3 = new class35();
        var3.field904 = arg0;
        if (var2 != null) {
            var3.method740(new class127(var2));
        }
        field909.method3225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.p(Ldo;I)V")
    public void method740(class127 arg0) {
        while (true) {
            int var2 = arg0.method2534();
            if (var2 == 0) {
                return;
            }
            this.method747(arg0, var2);
        }
    }

    @ObfuscatedName("ac.z(Ldo;II)V")
    public void method747(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field908 = arg0.method2427();
        } else if (arg1 == 2) {
            this.field906 = arg0.method2427();
        } else if (arg1 == 4) {
            this.field916 = arg0.method2427();
        } else if (arg1 == 5) {
            this.field912 = arg0.method2427();
        } else if (arg1 == 6) {
            this.field913 = arg0.method2427();
        } else if (arg1 == 7) {
            this.field914 = arg0.method2534();
        } else if (arg1 == 8) {
            this.field915 = arg0.method2534();
        } else if (arg1 == 40) {
            int var3 = arg0.method2534();
            this.field911 = new short[var3];
            this.field900 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field911[var4] = (short) arg0.method2427();
                this.field900[var4] = (short) arg0.method2427();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2534();
            this.field905 = new short[var5];
            this.field910 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field905[var6] = (short) arg0.method2427();
                this.field910[var6] = (short) arg0.method2427();
            }
        }
    }

    @ObfuscatedName("ac.m(II)Ldn;")
    public final class112 method742(int arg0) {
        class112 var2 = (class112) field903.method3215((long) this.field904);
        if (var2 == null) {
            class101 var3 = class101.method2039(Statics.field901, this.field908, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field911 != null) {
                for (int var4 = 0; var4 < this.field911.length; var4++) {
                    var3.method2072(this.field911[var4], this.field900[var4]);
                }
            }
            if (this.field905 != null) {
                for (int var5 = 0; var5 < this.field905.length; var5++) {
                    var3.method2042(this.field905[var5], this.field910[var5]);
                }
            }
            var2 = var3.method2049(this.field914 + 64, this.field915 + 850, -30, -50, -30);
            field903.method3225(var2, (long) this.field904);
        }
        class112 var6;
        if (this.field906 == -1 || arg0 == -1) {
            var6 = var2.method2211(true);
        } else {
            var6 = class34.method2178(this.field906).method712(var2, arg0);
        }
        if (this.field916 != 128 || this.field912 != 128) {
            var6.method2236(this.field916, this.field912, this.field916);
        }
        if (this.field913 != 0) {
            if (this.field913 == 90) {
                var6.method2256();
            }
            if (this.field913 == 180) {
                var6.method2256();
                var6.method2256();
            }
            if (this.field913 == 270) {
                var6.method2256();
                var6.method2256();
                var6.method2256();
            }
        }
        return var6;
    }

    @ObfuscatedName("ak.k(I)V")
    public static void method739() {
        field909.method3218();
        field903.method3218();
    }
}
