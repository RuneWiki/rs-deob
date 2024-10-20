package deob;

@ObfuscatedName("aa")
public class class39 extends class181 {

    @ObfuscatedName("aa.x")
    public static class171 field928 = new class171(64);

    @ObfuscatedName("aa.j")
    public static class171 field929 = new class171(30);

    @ObfuscatedName("aa.o")
    public int field927;

    @ObfuscatedName("aa.n")
    public int field931;

    @ObfuscatedName("aa.y")
    public int field932 = -1;

    @ObfuscatedName("aa.f")
    public short[] field933;

    @ObfuscatedName("aa.p")
    public short[] field930;

    @ObfuscatedName("aa.l")
    public short[] field935;

    @ObfuscatedName("aa.k")
    public short[] field940;

    @ObfuscatedName("aa.q")
    public int field937 = 128;

    @ObfuscatedName("aa.e")
    public int field938 = 128;

    @ObfuscatedName("aa.t")
    public int field934 = 0;

    @ObfuscatedName("aa.g")
    public int field936 = 0;

    @ObfuscatedName("aa.c")
    public int field941 = 0;

    @ObfuscatedName("b.b(II)Laa;")
    public static class39 method1(int arg0) {
        class39 var1 = (class39) field928.method3114((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field939.method2692(13, arg0);
        class39 var3 = new class39();
        var3.field927 = arg0;
        if (var2 != null) {
            var3.method731(new class107(var2));
        }
        field928.method3116(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.u(Ldh;I)V")
    public void method731(class107 arg0) {
        while (true) {
            int var2 = arg0.method2134();
            if (var2 == 0) {
                return;
            }
            this.method739(arg0, var2);
        }
    }

    @ObfuscatedName("aa.x(Ldh;II)V")
    public void method739(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field931 = arg0.method2136();
        } else if (arg1 == 2) {
            this.field932 = arg0.method2136();
        } else if (arg1 == 4) {
            this.field937 = arg0.method2136();
        } else if (arg1 == 5) {
            this.field938 = arg0.method2136();
        } else if (arg1 == 6) {
            this.field934 = arg0.method2136();
        } else if (arg1 == 7) {
            this.field936 = arg0.method2134();
        } else if (arg1 == 8) {
            this.field941 = arg0.method2134();
        } else if (arg1 == 40) {
            int var3 = arg0.method2134();
            this.field933 = new short[var3];
            this.field930 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field933[var4] = (short) arg0.method2136();
                this.field930[var4] = (short) arg0.method2136();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2134();
            this.field935 = new short[var5];
            this.field940 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field935[var6] = (short) arg0.method2136();
                this.field940[var6] = (short) arg0.method2136();
            }
        }
    }

    @ObfuscatedName("aa.j(IB)Lcu;")
    public final class98 method733(int arg0) {
        class98 var2 = (class98) field929.method3114((long) this.field927);
        if (var2 == null) {
            class93 var3 = class93.method1901(Statics.field592, this.field931, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field933 != null) {
                for (int var4 = 0; var4 < this.field933.length; var4++) {
                    var3.method1903(this.field933[var4], this.field930[var4]);
                }
            }
            if (this.field935 != null) {
                for (int var5 = 0; var5 < this.field935.length; var5++) {
                    var3.method1904(this.field935[var5], this.field940[var5]);
                }
            }
            var2 = var3.method1910(this.field936 + 64, this.field941 + 850, -30, -50, -30);
            field929.method3116(var2, (long) this.field927);
        }
        class98 var6;
        if (this.field932 == -1 || arg0 == -1) {
            var6 = var2.method1987(true);
        } else {
            var6 = Statics.method484(this.field932).method697(var2, arg0);
        }
        if (this.field937 != 128 || this.field938 != 128) {
            var6.method2000(this.field937, this.field938, this.field937);
        }
        if (this.field934 != 0) {
            if (this.field934 == 90) {
                var6.method2048();
            }
            if (this.field934 == 180) {
                var6.method2048();
                var6.method2048();
            }
            if (this.field934 == 270) {
                var6.method2048();
                var6.method2048();
                var6.method2048();
            }
        }
        return var6;
    }

    @ObfuscatedName("dw.o(I)V")
    public static void method2393() {
        field928.method3117();
        field929.method3117();
    }
}
