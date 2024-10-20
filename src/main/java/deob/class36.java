package deob;

@ObfuscatedName("am")
public class class36 extends class176 {

    @ObfuscatedName("am.k")
    public static class172 field920 = new class172(64);

    @ObfuscatedName("am.q")
    public static class172 field922 = new class172(30);

    @ObfuscatedName("am.j")
    public int field924;

    @ObfuscatedName("am.z")
    public int field925;

    @ObfuscatedName("am.m")
    public int field926 = -1;

    @ObfuscatedName("am.w")
    public short[] field927;

    @ObfuscatedName("am.a")
    public short[] field923;

    @ObfuscatedName("am.d")
    public short[] field929;

    @ObfuscatedName("am.u")
    public short[] field930;

    @ObfuscatedName("am.p")
    public int field931 = 128;

    @ObfuscatedName("am.t")
    public int field932 = 128;

    @ObfuscatedName("am.g")
    public int field933 = 0;

    @ObfuscatedName("am.o")
    public int field934 = 0;

    @ObfuscatedName("am.x")
    public int field935 = 0;

    @ObfuscatedName("an.e(IB)Lam;")
    public static class36 method867(int arg0) {
        class36 var1 = (class36) field920.method3262((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field938.method3069(13, arg0);
        class36 var3 = new class36();
        var3.field924 = arg0;
        if (var2 != null) {
            var3.method803(new class128(var2));
        }
        field920.method3264(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.i(Ldl;B)V")
    public void method803(class128 arg0) {
        while (true) {
            int var2 = arg0.method2548();
            if (var2 == 0) {
                return;
            }
            this.method800(arg0, var2);
        }
    }

    @ObfuscatedName("am.k(Ldl;II)V")
    public void method800(class128 arg0, int arg1) {
        if (arg1 == 1) {
            this.field925 = arg0.method2456();
        } else if (arg1 == 2) {
            this.field926 = arg0.method2456();
        } else if (arg1 == 4) {
            this.field931 = arg0.method2456();
        } else if (arg1 == 5) {
            this.field932 = arg0.method2456();
        } else if (arg1 == 6) {
            this.field933 = arg0.method2456();
        } else if (arg1 == 7) {
            this.field934 = arg0.method2548();
        } else if (arg1 == 8) {
            this.field935 = arg0.method2548();
        } else if (arg1 == 40) {
            int var3 = arg0.method2548();
            this.field927 = new short[var3];
            this.field923 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field927[var4] = (short) arg0.method2456();
                this.field923[var4] = (short) arg0.method2456();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2548();
            this.field929 = new short[var5];
            this.field930 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field929[var6] = (short) arg0.method2456();
                this.field930[var6] = (short) arg0.method2456();
            }
        }
    }

    @ObfuscatedName("am.q(II)Ldo;")
    public final class113 method795(int arg0) {
        class113 var2 = (class113) field922.method3262((long) this.field924);
        if (var2 == null) {
            class102 var3 = class102.method2051(Statics.field921, this.field925, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field927 != null) {
                for (int var4 = 0; var4 < this.field927.length; var4++) {
                    var3.method2063(this.field927[var4], this.field923[var4]);
                }
            }
            if (this.field929 != null) {
                for (int var5 = 0; var5 < this.field929.length; var5++) {
                    var3.method2104(this.field929[var5], this.field930[var5]);
                }
            }
            var2 = var3.method2054(this.field934 + 64, this.field935 + 850, -30, -50, -30);
            field922.method3264(var2, (long) this.field924);
        }
        class113 var6;
        if (this.field926 == -1 || arg0 == -1) {
            var6 = var2.method2279(true);
        } else {
            var6 = class35.method28(this.field926).method759(var2, arg0);
        }
        if (this.field931 != 128 || this.field932 != 128) {
            var6.method2257(this.field931, this.field932, this.field931);
        }
        if (this.field933 != 0) {
            if (this.field933 == 90) {
                var6.method2252();
            }
            if (this.field933 == 180) {
                var6.method2252();
                var6.method2252();
            }
            if (this.field933 == 270) {
                var6.method2252();
                var6.method2252();
                var6.method2252();
            }
        }
        return var6;
    }
}
