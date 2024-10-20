package deob;

@ObfuscatedName("af")
public class class40 extends class185 {

    @ObfuscatedName("af.y")
    public static class174 field928 = new class174(64);

    @ObfuscatedName("af.r")
    public static class174 field926 = new class174(30);

    @ObfuscatedName("af.f")
    public int field927;

    @ObfuscatedName("af.l")
    public int field935;

    @ObfuscatedName("af.b")
    public int field930 = -1;

    @ObfuscatedName("af.k")
    public short[] field939;

    @ObfuscatedName("af.g")
    public short[] field931;

    @ObfuscatedName("af.v")
    public short[] field932;

    @ObfuscatedName("af.i")
    public short[] field933;

    @ObfuscatedName("af.x")
    public int field929 = 128;

    @ObfuscatedName("af.h")
    public int field925 = 128;

    @ObfuscatedName("af.w")
    public int field934 = 0;

    @ObfuscatedName("af.s")
    public int field937 = 0;

    @ObfuscatedName("af.p")
    public int field938 = 0;

    @ObfuscatedName("bu.c(Ler;Ler;B)V")
    public static void method1312(class149 arg0, class149 arg1) {
        Statics.field936 = arg0;
        Statics.field924 = arg1;
    }

    @ObfuscatedName("av.j(II)Laf;")
    public static class40 method903(int arg0) {
        class40 var1 = (class40) field928.method3178((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field936.method2746(13, arg0);
        class40 var3 = new class40();
        var3.field927 = arg0;
        if (var2 != null) {
            var3.method736(new class108(var2));
        }
        field928.method3167(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.y(Ldx;I)V")
    public void method736(class108 arg0) {
        while (true) {
            int var2 = arg0.method2134();
            if (var2 == 0) {
                return;
            }
            this.method734(arg0, var2);
        }
    }

    @ObfuscatedName("af.r(Ldx;II)V")
    public void method734(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field935 = arg0.method2136();
        } else if (arg1 == 2) {
            this.field930 = arg0.method2136();
        } else if (arg1 == 4) {
            this.field929 = arg0.method2136();
        } else if (arg1 == 5) {
            this.field925 = arg0.method2136();
        } else if (arg1 == 6) {
            this.field934 = arg0.method2136();
        } else if (arg1 == 7) {
            this.field937 = arg0.method2134();
        } else if (arg1 == 8) {
            this.field938 = arg0.method2134();
        } else if (arg1 == 40) {
            int var3 = arg0.method2134();
            this.field939 = new short[var3];
            this.field931 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field939[var4] = (short) arg0.method2136();
                this.field931[var4] = (short) arg0.method2136();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2134();
            this.field932 = new short[var5];
            this.field933 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field932[var6] = (short) arg0.method2136();
                this.field933[var6] = (short) arg0.method2136();
            }
        }
    }

    @ObfuscatedName("af.f(IB)Lcl;")
    public final class99 method735(int arg0) {
        class99 var2 = (class99) field926.method3178((long) this.field927);
        if (var2 == null) {
            class94 var3 = class94.method1955(Statics.field924, this.field935, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field939 != null) {
                for (int var4 = 0; var4 < this.field939.length; var4++) {
                    var3.method1914(this.field939[var4], this.field931[var4]);
                }
            }
            if (this.field932 != null) {
                for (int var5 = 0; var5 < this.field932.length; var5++) {
                    var3.method1915(this.field932[var5], this.field933[var5]);
                }
            }
            var2 = var3.method1922(this.field937 + 64, this.field938 + 850, -30, -50, -30);
            field926.method3167(var2, (long) this.field927);
        }
        class99 var6;
        if (this.field930 == -1 || arg0 == -1) {
            var6 = var2.method1985(true);
        } else {
            var6 = class39.method109(this.field930).method697(var2, arg0);
        }
        if (this.field929 != 128 || this.field925 != 128) {
            var6.method2001(this.field929, this.field925, this.field929);
        }
        if (this.field934 != 0) {
            if (this.field934 == 90) {
                var6.method1993();
            }
            if (this.field934 == 180) {
                var6.method1993();
                var6.method1993();
            }
            if (this.field934 == 270) {
                var6.method1993();
                var6.method1993();
                var6.method1993();
            }
        }
        return var6;
    }

    @ObfuscatedName("ai.l(I)V")
    public static void method594() {
        field928.method3168();
        field926.method3168();
    }
}
