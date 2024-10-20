package deob;

@ObfuscatedName("ab")
public class class35 extends class174 {

    @ObfuscatedName("ab.o")
    public static class170 field907 = new class170(64);

    @ObfuscatedName("ab.h")
    public static class170 field911 = new class170(30);

    @ObfuscatedName("ab.u")
    public int field903;

    @ObfuscatedName("ab.a")
    public int field905;

    @ObfuscatedName("ab.q")
    public int field914 = -1;

    @ObfuscatedName("ab.t")
    public short[] field902;

    @ObfuscatedName("ab.n")
    public short[] field918;

    @ObfuscatedName("ab.i")
    public short[] field908;

    @ObfuscatedName("ab.c")
    public short[] field909;

    @ObfuscatedName("ab.b")
    public int field899 = 128;

    @ObfuscatedName("ab.m")
    public int field910 = 128;

    @ObfuscatedName("ab.g")
    public int field912 = 0;

    @ObfuscatedName("ab.x")
    public int field913 = 0;

    @ObfuscatedName("ab.r")
    public int field904 = 0;

    @ObfuscatedName("bu.j(Lew;Lew;I)V")
    public static void method1315(class153 arg0, class153 arg1) {
        Statics.field901 = arg0;
        Statics.field900 = arg1;
    }

    @ObfuscatedName("i.f(II)Lab;")
    public static class35 method113(int arg0) {
        class35 var1 = (class35) field907.method3256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field901.method3027(13, arg0);
        class35 var3 = new class35();
        var3.field903 = arg0;
        if (var2 != null) {
            var3.method753(new class127(var2));
        }
        field907.method3257(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.o(Ldq;I)V")
    public void method753(class127 arg0) {
        while (true) {
            int var2 = arg0.method2464();
            if (var2 == 0) {
                return;
            }
            this.method757(arg0, var2);
        }
    }

    @ObfuscatedName("ab.h(Ldq;II)V")
    public void method757(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field905 = arg0.method2582();
        } else if (arg1 == 2) {
            this.field914 = arg0.method2582();
        } else if (arg1 == 4) {
            this.field899 = arg0.method2582();
        } else if (arg1 == 5) {
            this.field910 = arg0.method2582();
        } else if (arg1 == 6) {
            this.field912 = arg0.method2582();
        } else if (arg1 == 7) {
            this.field913 = arg0.method2464();
        } else if (arg1 == 8) {
            this.field904 = arg0.method2464();
        } else if (arg1 == 40) {
            int var3 = arg0.method2464();
            this.field902 = new short[var3];
            this.field918 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field902[var4] = (short) arg0.method2582();
                this.field918[var4] = (short) arg0.method2582();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2464();
            this.field908 = new short[var5];
            this.field909 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field908[var6] = (short) arg0.method2582();
                this.field909[var6] = (short) arg0.method2582();
            }
        }
    }

    @ObfuscatedName("ab.u(II)Ldo;")
    public final class112 method755(int arg0) {
        class112 var2 = (class112) field911.method3256((long) this.field903);
        if (var2 == null) {
            class101 var3 = class101.method2064(Statics.field900, this.field905, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field902 != null) {
                for (int var4 = 0; var4 < this.field902.length; var4++) {
                    var3.method2112(this.field902[var4], this.field918[var4]);
                }
            }
            if (this.field908 != null) {
                for (int var5 = 0; var5 < this.field908.length; var5++) {
                    var3.method2082(this.field908[var5], this.field909[var5]);
                }
            }
            var2 = var3.method2083(this.field913 + 64, this.field904 + 850, -30, -50, -30);
            field911.method3257(var2, (long) this.field903);
        }
        class112 var6;
        if (this.field914 == -1 || arg0 == -1) {
            var6 = var2.method2237(true);
        } else {
            var6 = class34.method612(this.field914).method719(var2, arg0);
        }
        if (this.field899 != 128 || this.field910 != 128) {
            var6.method2268(this.field899, this.field910, this.field899);
        }
        if (this.field912 != 0) {
            if (this.field912 == 90) {
                var6.method2246();
            }
            if (this.field912 == 180) {
                var6.method2246();
                var6.method2246();
            }
            if (this.field912 == 270) {
                var6.method2246();
                var6.method2246();
                var6.method2246();
            }
        }
        return var6;
    }
}
