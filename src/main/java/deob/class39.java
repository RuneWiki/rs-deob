package deob;

@ObfuscatedName("au")
public class class39 extends class183 {

    @ObfuscatedName("au.k")
    public static class172 field930 = new class172(64);

    @ObfuscatedName("au.e")
    public static class172 field931 = new class172(30);

    @ObfuscatedName("au.w")
    public int field932;

    @ObfuscatedName("au.m")
    public int field943;

    @ObfuscatedName("au.u")
    public int field939 = -1;

    @ObfuscatedName("au.j")
    public short[] field935;

    @ObfuscatedName("au.o")
    public short[] field938;

    @ObfuscatedName("au.h")
    public short[] field937;

    @ObfuscatedName("au.b")
    public short[] field934;

    @ObfuscatedName("au.r")
    public int field936 = 128;

    @ObfuscatedName("au.l")
    public int field940 = 128;

    @ObfuscatedName("au.x")
    public int field941 = 0;

    @ObfuscatedName("au.q")
    public int field929 = 0;

    @ObfuscatedName("au.t")
    public int field942 = 0;

    @ObfuscatedName("ay.g(IB)Lau;")
    public static class39 method685(int arg0) {
        class39 var1 = (class39) field930.method3135((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field933.method2734(13, arg0);
        class39 var3 = new class39();
        var3.field932 = arg0;
        if (var2 != null) {
            var3.method716(new class107(var2));
        }
        field930.method3140(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.i(Ldk;I)V")
    public void method716(class107 arg0) {
        while (true) {
            int var2 = arg0.method2092();
            if (var2 == 0) {
                return;
            }
            this.method717(arg0, var2);
        }
    }

    @ObfuscatedName("au.k(Ldk;IB)V")
    public void method717(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field943 = arg0.method2094();
        } else if (arg1 == 2) {
            this.field939 = arg0.method2094();
        } else if (arg1 == 4) {
            this.field936 = arg0.method2094();
        } else if (arg1 == 5) {
            this.field940 = arg0.method2094();
        } else if (arg1 == 6) {
            this.field941 = arg0.method2094();
        } else if (arg1 == 7) {
            this.field929 = arg0.method2092();
        } else if (arg1 == 8) {
            this.field942 = arg0.method2092();
        } else if (arg1 == 40) {
            int var3 = arg0.method2092();
            this.field935 = new short[var3];
            this.field938 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field935[var4] = (short) arg0.method2094();
                this.field938[var4] = (short) arg0.method2094();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2092();
            this.field937 = new short[var5];
            this.field934 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field937[var6] = (short) arg0.method2094();
                this.field934[var6] = (short) arg0.method2094();
            }
        }
    }

    @ObfuscatedName("au.e(II)Lce;")
    public final class98 method718(int arg0) {
        class98 var2 = (class98) field931.method3135((long) this.field932);
        if (var2 == null) {
            class93 var3 = class93.method1903(Statics.field928, this.field943, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field935 != null) {
                for (int var4 = 0; var4 < this.field935.length; var4++) {
                    var3.method1873(this.field935[var4], this.field938[var4]);
                }
            }
            if (this.field937 != null) {
                for (int var5 = 0; var5 < this.field937.length; var5++) {
                    var3.method1874(this.field937[var5], this.field934[var5]);
                }
            }
            var2 = var3.method1881(this.field929 + 64, this.field942 + 850, -30, -50, -30);
            field931.method3140(var2, (long) this.field932);
        }
        class98 var6;
        if (this.field939 == -1 || arg0 == -1) {
            var6 = var2.method1953(true);
        } else {
            var6 = class38.method552(this.field939).method693(var2, arg0);
        }
        if (this.field936 != 128 || this.field940 != 128) {
            var6.method1968(this.field936, this.field940, this.field936);
        }
        if (this.field941 != 0) {
            if (this.field941 == 90) {
                var6.method1978();
            }
            if (this.field941 == 180) {
                var6.method1978();
                var6.method1978();
            }
            if (this.field941 == 270) {
                var6.method1978();
                var6.method1978();
                var6.method1978();
            }
        }
        return var6;
    }
}
