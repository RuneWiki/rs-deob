package deob;

@ObfuscatedName("al")
public class class40 extends class187 {

    @ObfuscatedName("al.f")
    public static class176 field947 = new class176(64);

    @ObfuscatedName("al.j")
    public static class176 field943 = new class176(30);

    @ObfuscatedName("al.l")
    public int field931;

    @ObfuscatedName("al.g")
    public int field932;

    @ObfuscatedName("al.k")
    public int field933 = -1;

    @ObfuscatedName("al.p")
    public short[] field934;

    @ObfuscatedName("al.y")
    public short[] field935;

    @ObfuscatedName("al.m")
    public short[] field936;

    @ObfuscatedName("al.o")
    public short[] field950;

    @ObfuscatedName("al.c")
    public int field938 = 128;

    @ObfuscatedName("al.r")
    public int field939 = 128;

    @ObfuscatedName("al.s")
    public int field948 = 0;

    @ObfuscatedName("al.n")
    public int field941 = 0;

    @ObfuscatedName("al.q")
    public int field942 = 0;

    @ObfuscatedName("ei.v(II)Lal;")
    public static class40 method2864(int arg0) {
        class40 var1 = (class40) field947.method3231((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field928.method2852(13, arg0);
        class40 var3 = new class40();
        var3.field931 = arg0;
        if (var2 != null) {
            var3.method752(new class110(var2));
        }
        field947.method3228(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.t(Ldp;B)V")
    public void method752(class110 arg0) {
        while (true) {
            int var2 = arg0.method2257();
            if (var2 == 0) {
                return;
            }
            this.method753(arg0, var2);
        }
    }

    @ObfuscatedName("al.f(Ldp;II)V")
    public void method753(class110 arg0, int arg1) {
        if (arg1 == 1) {
            this.field932 = arg0.method2194();
        } else if (arg1 == 2) {
            this.field933 = arg0.method2194();
        } else if (arg1 == 4) {
            this.field938 = arg0.method2194();
        } else if (arg1 == 5) {
            this.field939 = arg0.method2194();
        } else if (arg1 == 6) {
            this.field948 = arg0.method2194();
        } else if (arg1 == 7) {
            this.field941 = arg0.method2257();
        } else if (arg1 == 8) {
            this.field942 = arg0.method2257();
        } else if (arg1 == 40) {
            int var3 = arg0.method2257();
            this.field934 = new short[var3];
            this.field935 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field934[var4] = (short) arg0.method2194();
                this.field935[var4] = (short) arg0.method2194();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2257();
            this.field936 = new short[var5];
            this.field950 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field936[var6] = (short) arg0.method2194();
                this.field950[var6] = (short) arg0.method2194();
            }
        }
    }

    @ObfuscatedName("al.j(IB)Lcy;")
    public final class99 method754(int arg0) {
        class99 var2 = (class99) field943.method3231((long) this.field931);
        if (var2 == null) {
            class94 var3 = class94.method1899(Statics.field937, this.field932, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field934 != null) {
                for (int var4 = 0; var4 < this.field934.length; var4++) {
                    var3.method1976(this.field934[var4], this.field935[var4]);
                }
            }
            if (this.field936 != null) {
                for (int var5 = 0; var5 < this.field936.length; var5++) {
                    var3.method1981(this.field936[var5], this.field950[var5]);
                }
            }
            var2 = var3.method1918(this.field941 + 64, this.field942 + 850, -30, -50, -30);
            field943.method3228(var2, (long) this.field931);
        }
        class99 var6;
        if (this.field933 == -1 || arg0 == -1) {
            var6 = var2.method2005(true);
        } else {
            var6 = class39.method682(this.field933).method721(var2, arg0);
        }
        if (this.field938 != 128 || this.field939 != 128) {
            var6.method2015(this.field938, this.field939, this.field938);
        }
        if (this.field948 != 0) {
            if (this.field948 == 90) {
                var6.method2018();
            }
            if (this.field948 == 180) {
                var6.method2018();
                var6.method2018();
            }
            if (this.field948 == 270) {
                var6.method2018();
                var6.method2018();
                var6.method2018();
            }
        }
        return var6;
    }

    @ObfuscatedName("ex.l(I)V")
    public static void method2768() {
        field947.method3229();
        field943.method3229();
    }
}
