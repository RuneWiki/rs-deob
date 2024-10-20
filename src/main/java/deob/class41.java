package deob;

@ObfuscatedName("af")
public class class41 extends class204 {

    @ObfuscatedName("af.o")
    public static boolean field930 = false;

    @ObfuscatedName("af.h")
    public static class193 field947 = new class193(64);

    @ObfuscatedName("af.q")
    public static class193 field918 = new class193(500);

    @ObfuscatedName("af.u")
    public static class193 field948 = new class193(30);

    @ObfuscatedName("af.m")
    public static class193 field919 = new class193(30);

    @ObfuscatedName("af.y")
    public static class100[] field924 = new class100[4];

    @ObfuscatedName("af.p")
    public int field921;

    @ObfuscatedName("af.t")
    public int[] field922;

    @ObfuscatedName("af.g")
    public int[] field923;

    @ObfuscatedName("af.v")
    public String field955 = "null";

    @ObfuscatedName("af.l")
    public short[] field925;

    @ObfuscatedName("af.e")
    public short[] field926;

    @ObfuscatedName("af.a")
    public short[] field927;

    @ObfuscatedName("af.w")
    public short[] field928;

    @ObfuscatedName("af.d")
    public int field929 = 1;

    @ObfuscatedName("af.z")
    public int field920 = 1;

    @ObfuscatedName("af.s")
    public int field931 = 2;

    @ObfuscatedName("af.j")
    public boolean field932 = true;

    @ObfuscatedName("af.b")
    public int field933 = -1;

    @ObfuscatedName("af.r")
    public int field951 = -1;

    @ObfuscatedName("af.n")
    public boolean field935 = false;

    @ObfuscatedName("af.c")
    public boolean field945 = false;

    @ObfuscatedName("af.k")
    public int field937 = -1;

    @ObfuscatedName("af.x")
    public int field914 = 16;

    @ObfuscatedName("af.ar")
    public int field939 = 0;

    @ObfuscatedName("af.as")
    public int field940 = 0;

    @ObfuscatedName("af.ac")
    public String[] field941 = new String[5];

    @ObfuscatedName("af.ah")
    public int field942 = -1;

    @ObfuscatedName("af.al")
    public int field943 = -1;

    @ObfuscatedName("af.am")
    public boolean field944 = false;

    @ObfuscatedName("af.ae")
    public boolean field938 = true;

    @ObfuscatedName("af.ai")
    public int field946 = 128;

    @ObfuscatedName("af.aa")
    public int field936 = 128;

    @ObfuscatedName("af.ag")
    public int field957 = 128;

    @ObfuscatedName("af.an")
    public int field915 = 0;

    @ObfuscatedName("af.ap")
    public int field950 = 0;

    @ObfuscatedName("af.ay")
    public int field917 = 0;

    @ObfuscatedName("af.ax")
    public boolean field952 = false;

    @ObfuscatedName("af.af")
    public boolean field961 = false;

    @ObfuscatedName("af.av")
    public int field954 = -1;

    @ObfuscatedName("af.au")
    public int[] field949;

    @ObfuscatedName("af.ad")
    public int field956 = -1;

    @ObfuscatedName("af.ab")
    public int field916 = -1;

    @ObfuscatedName("af.ao")
    public int field958 = -1;

    @ObfuscatedName("af.az")
    public int field959 = 0;

    @ObfuscatedName("af.aj")
    public int field960 = 0;

    @ObfuscatedName("af.ak")
    public int field953 = 0;

    @ObfuscatedName("af.aw")
    public int[] field962;

    @ObfuscatedName("ej.o(IB)Laf;")
    public static class41 method2717(int arg0) {
        class41 var1 = (class41) field947.method3456((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field934.method3030(6, arg0);
        class41 var3 = new class41();
        var3.field921 = arg0;
        if (var2 != null) {
            var3.method757(new class119(var2));
        }
        var3.method756();
        if (var3.field961) {
            var3.field931 = 0;
            var3.field932 = false;
        }
        field947.method3451(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.f(I)V")
    public void method756() {
        if (this.field933 == -1) {
            this.field933 = 0;
            if (this.field922 != null && (this.field923 == null || this.field923[0] == 10)) {
                this.field933 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field941[var1] != null) {
                    this.field933 = 1;
                }
            }
        }
        if (this.field954 == -1) {
            this.field954 = this.field931 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("af.i(Ldc;I)V")
    public void method757(class119 arg0) {
        while (true) {
            int var2 = arg0.method2290();
            if (var2 == 0) {
                return;
            }
            this.method770(arg0, var2);
        }
    }

    @ObfuscatedName("af.h(Ldc;II)V")
    public void method770(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2290();
            if (var3 > 0) {
                if (this.field922 == null || field930) {
                    this.field923 = new int[var3];
                    this.field922 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field922[var4] = arg0.method2292();
                        this.field923[var4] = arg0.method2290();
                    }
                } else {
                    arg0.field1984 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field955 = arg0.method2344();
        } else if (arg1 == 5) {
            int var5 = arg0.method2290();
            if (var5 > 0) {
                if (this.field922 == null || field930) {
                    this.field923 = null;
                    this.field922 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field922[var6] = arg0.method2292();
                    }
                } else {
                    arg0.field1984 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field929 = arg0.method2290();
        } else if (arg1 == 15) {
            this.field920 = arg0.method2290();
        } else if (arg1 == 17) {
            this.field931 = 0;
            this.field932 = false;
        } else if (arg1 == 18) {
            this.field932 = false;
        } else if (arg1 == 19) {
            this.field933 = arg0.method2290();
        } else if (arg1 == 21) {
            this.field951 = 0;
        } else if (arg1 == 22) {
            this.field935 = true;
        } else if (arg1 == 23) {
            this.field945 = true;
        } else if (arg1 == 24) {
            this.field937 = arg0.method2292();
            if (this.field937 == 65535) {
                this.field937 = -1;
            }
        } else if (arg1 == 27) {
            this.field931 = 1;
        } else if (arg1 == 28) {
            this.field914 = arg0.method2290();
        } else if (arg1 == 29) {
            this.field939 = arg0.method2435();
        } else if (arg1 == 39) {
            this.field940 = arg0.method2435() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field941[arg1 - 30] = arg0.method2344();
            if (this.field941[arg1 - 30].equalsIgnoreCase(class157.field2301)) {
                this.field941[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2290();
            this.field925 = new short[var7];
            this.field926 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field925[var8] = (short) arg0.method2292();
                this.field926[var8] = (short) arg0.method2292();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2290();
            this.field927 = new short[var9];
            this.field928 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field927[var10] = (short) arg0.method2292();
                this.field928[var10] = (short) arg0.method2292();
            }
        } else if (arg1 == 60) {
            this.field942 = arg0.method2292();
        } else if (arg1 == 62) {
            this.field944 = true;
        } else if (arg1 == 64) {
            this.field938 = false;
        } else if (arg1 == 65) {
            this.field946 = arg0.method2292();
        } else if (arg1 == 66) {
            this.field936 = arg0.method2292();
        } else if (arg1 == 67) {
            this.field957 = arg0.method2292();
        } else if (arg1 == 68) {
            this.field943 = arg0.method2292();
        } else if (arg1 == 69) {
            arg0.method2290();
        } else if (arg1 == 70) {
            this.field915 = arg0.method2293();
        } else if (arg1 == 71) {
            this.field950 = arg0.method2293();
        } else if (arg1 == 72) {
            this.field917 = arg0.method2293();
        } else if (arg1 == 73) {
            this.field952 = true;
        } else if (arg1 == 74) {
            this.field961 = true;
        } else if (arg1 == 75) {
            this.field954 = arg0.method2290();
        } else if (arg1 == 77) {
            this.field956 = arg0.method2292();
            if (this.field956 == 65535) {
                this.field956 = -1;
            }
            this.field916 = arg0.method2292();
            if (this.field916 == 65535) {
                this.field916 = -1;
            }
            int var11 = arg0.method2290();
            this.field949 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field949[var12] = arg0.method2292();
                if (this.field949[var12] == 65535) {
                    this.field949[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field958 = arg0.method2292();
            this.field959 = arg0.method2290();
        } else if (arg1 == 79) {
            this.field960 = arg0.method2292();
            this.field953 = arg0.method2292();
            this.field959 = arg0.method2290();
            int var13 = arg0.method2290();
            this.field962 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field962[var14] = arg0.method2292();
            }
        } else if (arg1 == 81) {
            this.field951 = arg0.method2290() * 256;
        }
    }

    @ObfuscatedName("af.q(IB)Z")
    public final boolean method759(int arg0) {
        if (this.field923 != null) {
            for (int var4 = 0; var4 < this.field923.length; var4++) {
                if (this.field923[var4] == arg0) {
                    return Statics.field3148.method2976(this.field922[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field922 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field922.length; var3++) {
                var2 &= Statics.field3148.method2976(this.field922[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("af.u(I)Z")
    public final boolean method765() {
        if (this.field922 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field922.length; var2++) {
            var1 &= Statics.field3148.method2976(this.field922[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("af.m(II[[IIIIB)Lco;")
    public final class85 method784(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field923 == null) {
            var7 = (long) ((this.field921 << 10) + arg1);
        } else {
            var7 = (long) ((this.field921 << 10) + (arg0 << 3) + arg1);
        }
        class85 var9 = (class85) field948.method3456(var7);
        if (var9 == null) {
            class100 var10 = this.method761(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field935) {
                var10.field1721 = (short) (this.field939 + 64);
                var10.field1699 = (short) (this.field940 + 768);
                var10.method2057();
                var9 = var10;
            } else {
                var9 = var10.method2036(this.field939 + 64, this.field940 + 768, -50, -10, -50);
            }
            field948.method3451(var9, var7);
        }
        if (this.field935) {
            var9 = ((class100) var9).method2005();
        }
        if (this.field951 >= 0) {
            if (var9 instanceof class105) {
                var9 = ((class105) var9).method2089(arg2, arg3, arg4, arg5, true, this.field951);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2006(arg2, arg3, arg4, arg5, true, this.field951);
            }
        }
        return var9;
    }

    @ObfuscatedName("af.y(II[[IIIII)Ldm;")
    public final class105 method767(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field923 == null) {
            var7 = (long) ((this.field921 << 10) + arg1);
        } else {
            var7 = (long) ((this.field921 << 10) + (arg0 << 3) + arg1);
        }
        class105 var9 = (class105) field919.method3456(var7);
        if (var9 == null) {
            class100 var10 = this.method761(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2036(this.field939 + 64, this.field940 + 768, -50, -10, -50);
            field919.method3451(var9, var7);
        }
        if (this.field951 >= 0) {
            var9 = var9.method2089(arg2, arg3, arg4, arg5, true, this.field951);
        }
        return var9;
    }

    @ObfuscatedName("af.p(II[[IIIILau;II)Ldm;")
    public final class105 method762(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field923 == null) {
            var9 = (long) ((this.field921 << 10) + arg1);
        } else {
            var9 = (long) ((this.field921 << 10) + (arg0 << 3) + arg1);
        }
        class105 var11 = (class105) field919.method3456(var9);
        if (var11 == null) {
            class100 var12 = this.method761(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2036(this.field939 + 64, this.field940 + 768, -50, -10, -50);
            field919.method3451(var11, var9);
        }
        if (arg6 == null && this.field951 == -1) {
            return var11;
        }
        class105 var13;
        if (arg6 == null) {
            var13 = var11.method2090(true);
        } else {
            var13 = arg6.method810(var11, arg7, arg1);
        }
        if (this.field951 >= 0) {
            var13 = var13.method2089(arg2, arg3, arg4, arg5, false, this.field951);
        }
        return var13;
    }

    @ObfuscatedName("af.t(III)Lck;")
    public final class100 method761(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field923 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field922 == null) {
                return null;
            }
            boolean var4 = this.field944;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field922.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field922[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field918.method3456((long) var7);
                if (var3 == null) {
                    var3 = class100.method2000(Statics.field3148, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2015();
                    }
                    field918.method3451(var3, (long) var7);
                }
                if (var5 > 1) {
                    field924[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field924, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field923.length; var9++) {
                if (this.field923[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field922[var8];
            boolean var11 = this.field944 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field918.method3456((long) var10);
            if (var3 == null) {
                var3 = class100.method2000(Statics.field3148, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2015();
                }
                field918.method3451(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field946 == 128 && this.field936 == 128 && this.field957 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field915 == 0 && this.field950 == 0 && this.field917 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field925 == null, this.field927 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2011(256);
            var14.method2012(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2008();
        } else if (var15 == 2) {
            var14.method2009();
        } else if (var15 == 3) {
            var14.method2029();
        }
        if (this.field925 != null) {
            for (int var16 = 0; var16 < this.field925.length; var16++) {
                var14.method2013(this.field925[var16], this.field926[var16]);
            }
        }
        if (this.field927 != null) {
            for (int var17 = 0; var17 < this.field927.length; var17++) {
                var14.method2014(this.field927[var17], this.field928[var17]);
            }
        }
        if (var12) {
            var14.method2016(this.field946, this.field936, this.field957);
        }
        if (var13) {
            var14.method2012(this.field915, this.field950, this.field917);
        }
        return var14;
    }

    @ObfuscatedName("af.g(I)Laf;")
    public final class41 method785() {
        int var1 = -1;
        if (this.field956 != -1) {
            var1 = class176.method701(this.field956);
        } else if (this.field916 != -1) {
            var1 = class176.field2901[this.field916];
        }
        return var1 < 0 || var1 >= this.field949.length || this.field949[var1] == -1 ? null : method2717(this.field949[var1]);
    }

    @ObfuscatedName("af.v(I)Z")
    public boolean method775() {
        if (this.field949 == null) {
            return this.field958 != -1 || this.field962 != null;
        }
        for (int var1 = 0; var1 < this.field949.length; var1++) {
            if (this.field949[var1] != -1) {
                class41 var2 = method2717(this.field949[var1]);
                if (var2.field958 != -1 || var2.field962 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
