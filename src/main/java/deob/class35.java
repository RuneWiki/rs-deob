package deob;

@ObfuscatedName("as")
public class class35 extends class174 {

    @ObfuscatedName("as.a")
    public static class170 field910 = new class170(64);

    @ObfuscatedName("as.l")
    public static class170 field911 = new class170(30);

    @ObfuscatedName("as.q")
    public int field912;

    @ObfuscatedName("as.b")
    public int field927;

    @ObfuscatedName("as.u")
    public int field914 = -1;

    @ObfuscatedName("as.d")
    public short[] field915;

    @ObfuscatedName("as.m")
    public short[] field908;

    @ObfuscatedName("as.v")
    public short[] field917;

    @ObfuscatedName("as.j")
    public short[] field918;

    @ObfuscatedName("as.f")
    public int field919 = 128;

    @ObfuscatedName("as.h")
    public int field924 = 128;

    @ObfuscatedName("as.o")
    public int field921 = 0;

    @ObfuscatedName("as.z")
    public int field916 = 0;

    @ObfuscatedName("as.k")
    public int field909 = 0;

    @ObfuscatedName("dt.i(Lef;Lef;S)V")
    public static void method2392(class152 arg0, class152 arg1) {
        Statics.field920 = arg0;
        Statics.field913 = arg1;
    }

    @ObfuscatedName("l.p(II)Las;")
    public static class35 method37(int arg0) {
        class35 var1 = (class35) field910.method3223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field920.method2932(13, arg0);
        class35 var3 = new class35();
        var3.field912 = arg0;
        if (var2 != null) {
            var3.method734(new class127(var2));
        }
        field910.method3225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.a(Ldn;I)V")
    public void method734(class127 arg0) {
        while (true) {
            int var2 = arg0.method2411();
            if (var2 == 0) {
                return;
            }
            this.method729(arg0, var2);
        }
    }

    @ObfuscatedName("as.l(Ldn;IB)V")
    public void method729(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field927 = arg0.method2413();
        } else if (arg1 == 2) {
            this.field914 = arg0.method2413();
        } else if (arg1 == 4) {
            this.field919 = arg0.method2413();
        } else if (arg1 == 5) {
            this.field924 = arg0.method2413();
        } else if (arg1 == 6) {
            this.field921 = arg0.method2413();
        } else if (arg1 == 7) {
            this.field916 = arg0.method2411();
        } else if (arg1 == 8) {
            this.field909 = arg0.method2411();
        } else if (arg1 == 40) {
            int var3 = arg0.method2411();
            this.field915 = new short[var3];
            this.field908 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field915[var4] = (short) arg0.method2413();
                this.field908[var4] = (short) arg0.method2413();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2411();
            this.field917 = new short[var5];
            this.field918 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field917[var6] = (short) arg0.method2413();
                this.field918[var6] = (short) arg0.method2413();
            }
        }
    }

    @ObfuscatedName("as.q(IS)Ldc;")
    public final class112 method728(int arg0) {
        class112 var2 = (class112) field911.method3223((long) this.field912);
        if (var2 == null) {
            class101 var3 = class101.method2035(Statics.field913, this.field927, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field915 != null) {
                for (int var4 = 0; var4 < this.field915.length; var4++) {
                    var3.method1999(this.field915[var4], this.field908[var4]);
                }
            }
            if (this.field917 != null) {
                for (int var5 = 0; var5 < this.field917.length; var5++) {
                    var3.method2029(this.field917[var5], this.field918[var5]);
                }
            }
            var2 = var3.method2006(this.field916 + 64, this.field909 + 850, -30, -50, -30);
            field911.method3225(var2, (long) this.field912);
        }
        class112 var6;
        if (this.field914 == -1 || arg0 == -1) {
            var6 = var2.method2237(true);
        } else {
            var6 = class34.method763(this.field914).method697(var2, arg0);
        }
        if (this.field919 != 128 || this.field924 != 128) {
            var6.method2185(this.field919, this.field924, this.field919);
        }
        if (this.field921 != 0) {
            if (this.field921 == 90) {
                var6.method2250();
            }
            if (this.field921 == 180) {
                var6.method2250();
                var6.method2250();
            }
            if (this.field921 == 270) {
                var6.method2250();
                var6.method2250();
                var6.method2250();
            }
        }
        return var6;
    }
}
