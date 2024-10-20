package deob;

@ObfuscatedName("aj")
public class class42 extends class208 {

    @ObfuscatedName("aj.r")
    public static class197 field930 = new class197(64);

    @ObfuscatedName("aj.e")
    public static class197 field911 = new class197(50);

    @ObfuscatedName("aj.h")
    public int field925;

    @ObfuscatedName("aj.s")
    public String field913 = "null";

    @ObfuscatedName("aj.k")
    public int field914 = 1;

    @ObfuscatedName("aj.u")
    public int[] field915;

    @ObfuscatedName("aj.n")
    public int[] field916;

    @ObfuscatedName("aj.b")
    public int field932 = -1;

    @ObfuscatedName("aj.m")
    public int field929 = -1;

    @ObfuscatedName("aj.q")
    public int field924 = -1;

    @ObfuscatedName("aj.p")
    public int field920 = -1;

    @ObfuscatedName("aj.w")
    public int field918 = -1;

    @ObfuscatedName("aj.o")
    public int field933 = -1;

    @ObfuscatedName("aj.d")
    public int field923 = -1;

    @ObfuscatedName("aj.f")
    public short[] field926;

    @ObfuscatedName("aj.z")
    public short[] field931;

    @ObfuscatedName("aj.i")
    public short[] field912;

    @ObfuscatedName("aj.v")
    public short[] field927;

    @ObfuscatedName("aj.j")
    public String[] field928 = new String[5];

    @ObfuscatedName("aj.x")
    public boolean field934 = true;

    @ObfuscatedName("aj.t")
    public int field921 = -1;

    @ObfuscatedName("aj.y")
    public int field910 = 128;

    @ObfuscatedName("aj.a")
    public int field917 = 128;

    @ObfuscatedName("aj.c")
    public boolean field919 = false;

    @ObfuscatedName("aj.ad")
    public int field908 = 0;

    @ObfuscatedName("aj.as")
    public int field935 = 0;

    @ObfuscatedName("aj.ac")
    public int field936 = -1;

    @ObfuscatedName("aj.ah")
    public int field937 = 32;

    @ObfuscatedName("aj.am")
    public int[] field938;

    @ObfuscatedName("aj.aq")
    public int field939 = -1;

    @ObfuscatedName("aj.az")
    public int field940 = -1;

    @ObfuscatedName("aj.ak")
    public boolean field941 = true;

    @ObfuscatedName("aj.ag")
    public boolean field942 = true;

    @ObfuscatedName("aj.af")
    public boolean field943 = false;

    @ObfuscatedName("f.l(IB)Laj;")
    public static class42 method195(int arg0) {
        class42 var1 = (class42) field930.method3653((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field922.method3210(9, arg0);
        class42 var3 = new class42();
        var3.field925 = arg0;
        if (var2 != null) {
            var3.method813(new class123(var2));
        }
        var3.method790();
        field930.method3655(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.g(I)V")
    public void method790() {
    }

    @ObfuscatedName("aj.r(Ldc;I)V")
    public void method813(class123 arg0) {
        while (true) {
            int var2 = arg0.method2490();
            if (var2 == 0) {
                return;
            }
            this.method808(arg0, var2);
        }
    }

    @ObfuscatedName("aj.e(Ldc;IB)V")
    public void method808(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2490();
            this.field915 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field915[var4] = arg0.method2492();
            }
        } else if (arg1 == 2) {
            this.field913 = arg0.method2520();
        } else if (arg1 == 12) {
            this.field914 = arg0.method2490();
        } else if (arg1 == 13) {
            this.field932 = arg0.method2492();
        } else if (arg1 == 14) {
            this.field920 = arg0.method2492();
        } else if (arg1 == 15) {
            this.field929 = arg0.method2492();
        } else if (arg1 == 16) {
            this.field924 = arg0.method2492();
        } else if (arg1 == 17) {
            this.field920 = arg0.method2492();
            this.field918 = arg0.method2492();
            this.field933 = arg0.method2492();
            this.field923 = arg0.method2492();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field928[arg1 - 30] = arg0.method2520();
            if (this.field928[arg1 - 30].equalsIgnoreCase(class161.field2378)) {
                this.field928[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2490();
            this.field926 = new short[var5];
            this.field931 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field926[var6] = (short) arg0.method2492();
                this.field931[var6] = (short) arg0.method2492();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2490();
            this.field912 = new short[var7];
            this.field927 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field912[var8] = (short) arg0.method2492();
                this.field927[var8] = (short) arg0.method2492();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2490();
            this.field916 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field916[var10] = arg0.method2492();
            }
        } else if (arg1 == 93) {
            this.field934 = false;
        } else if (arg1 == 95) {
            this.field921 = arg0.method2492();
        } else if (arg1 == 97) {
            this.field910 = arg0.method2492();
        } else if (arg1 == 98) {
            this.field917 = arg0.method2492();
        } else if (arg1 == 99) {
            this.field919 = true;
        } else if (arg1 == 100) {
            this.field908 = arg0.method2491();
        } else if (arg1 == 101) {
            this.field935 = arg0.method2491();
        } else if (arg1 == 102) {
            this.field936 = arg0.method2492();
        } else if (arg1 == 103) {
            this.field937 = arg0.method2492();
        } else if (arg1 == 106) {
            this.field939 = arg0.method2492();
            if (this.field939 == 65535) {
                this.field939 = -1;
            }
            this.field940 = arg0.method2492();
            if (this.field940 == 65535) {
                this.field940 = -1;
            }
            int var11 = arg0.method2490();
            this.field938 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field938[var12] = arg0.method2492();
                if (this.field938[var12] == 65535) {
                    this.field938[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field941 = false;
        } else if (arg1 == 109) {
            this.field942 = false;
        } else if (arg1 == 111) {
            this.field943 = true;
        }
    }

    @ObfuscatedName("aj.h(Lat;ILat;II)Ldv;")
    public final class109 method793(class45 arg0, int arg1, class45 arg2, int arg3) {
        if (this.field938 != null) {
            class42 var5 = this.method795();
            return var5 == null ? null : var5.method793(arg0, arg1, arg2, arg3);
        }
        class109 var6 = (class109) field911.method3653((long) this.field925);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field915.length; var8++) {
                if (!Statics.field909.method3252(this.field915[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class104[] var9 = new class104[this.field915.length];
            for (int var10 = 0; var10 < this.field915.length; var10++) {
                var9[var10] = class104.method2237(Statics.field909, this.field915[var10], 0);
            }
            class104 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class104(var9, var9.length);
            }
            if (this.field926 != null) {
                for (int var12 = 0; var12 < this.field926.length; var12++) {
                    var11.method2173(this.field926[var12], this.field931[var12]);
                }
            }
            if (this.field912 != null) {
                for (int var13 = 0; var13 < this.field912.length; var13++) {
                    var11.method2174(this.field912[var13], this.field927[var13]);
                }
            }
            var6 = var11.method2189(this.field908 + 64, this.field935 * 5 + 850, -30, -50, -30);
            field911.method3655(var6, (long) this.field925);
        }
        class109 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method889(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method918(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2267(true);
        } else {
            var14 = arg2.method918(var6, arg3);
        }
        if (this.field910 != 128 || this.field917 != 128) {
            var14.method2272(this.field910, this.field917, this.field910);
        }
        return var14;
    }

    @ObfuscatedName("aj.s(B)Lcc;")
    public final class104 method794() {
        if (this.field938 != null) {
            class42 var1 = this.method795();
            return var1 == null ? null : var1.method794();
        } else if (this.field916 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field916.length; var3++) {
                if (!Statics.field909.method3252(this.field916[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class104[] var4 = new class104[this.field916.length];
            for (int var5 = 0; var5 < this.field916.length; var5++) {
                var4[var5] = class104.method2237(Statics.field909, this.field916[var5], 0);
            }
            class104 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class104(var4, var4.length);
            }
            if (this.field926 != null) {
                for (int var7 = 0; var7 < this.field926.length; var7++) {
                    var6.method2173(this.field926[var7], this.field931[var7]);
                }
            }
            if (this.field912 != null) {
                for (int var8 = 0; var8 < this.field912.length; var8++) {
                    var6.method2174(this.field912[var8], this.field927[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aj.k(I)Laj;")
    public final class42 method795() {
        int var1 = -1;
        if (this.field939 != -1) {
            var1 = class180.method1139(this.field939);
        } else if (this.field940 != -1) {
            var1 = class180.field2959[this.field940];
        }
        return var1 < 0 || var1 >= this.field938.length || this.field938[var1] == -1 ? null : method195(this.field938[var1]);
    }

    @ObfuscatedName("aj.u(I)Z")
    public boolean method819() {
        if (this.field938 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field939 != -1) {
            var1 = class180.method1139(this.field939);
        } else if (this.field940 != -1) {
            var1 = class180.field2959[this.field940];
        }
        return var1 >= 0 && var1 < this.field938.length && this.field938[var1] != -1;
    }

    @ObfuscatedName("fr.n(B)V")
    public static void method3114() {
        field930.method3658();
        field911.method3658();
    }
}
