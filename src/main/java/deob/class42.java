package deob;

@ObfuscatedName("ad")
public class class42 extends class208 {

    @ObfuscatedName("ad.v")
    public static class197 field933 = new class197(64);

    @ObfuscatedName("ad.r")
    public static class197 field913 = new class197(50);

    @ObfuscatedName("ad.z")
    public int field911;

    @ObfuscatedName("ad.t")
    public String field915 = "null";

    @ObfuscatedName("ad.n")
    public int field916 = 1;

    @ObfuscatedName("ad.i")
    public int[] field917;

    @ObfuscatedName("ad.g")
    public int[] field920;

    @ObfuscatedName("ad.m")
    public int field936 = -1;

    @ObfuscatedName("ad.k")
    public int field935 = -1;

    @ObfuscatedName("ad.x")
    public int field921 = -1;

    @ObfuscatedName("ad.u")
    public int field922 = -1;

    @ObfuscatedName("ad.j")
    public int field914 = -1;

    @ObfuscatedName("ad.q")
    public int field929 = -1;

    @ObfuscatedName("ad.w")
    public int field925 = -1;

    @ObfuscatedName("ad.b")
    public short[] field926;

    @ObfuscatedName("ad.p")
    public short[] field927;

    @ObfuscatedName("ad.o")
    public short[] field928;

    @ObfuscatedName("ad.y")
    public short[] field937;

    @ObfuscatedName("ad.s")
    public String[] field930 = new String[5];

    @ObfuscatedName("ad.e")
    public boolean field912 = true;

    @ObfuscatedName("ad.h")
    public int field932 = -1;

    @ObfuscatedName("ad.l")
    public int field934 = 128;

    @ObfuscatedName("ad.c")
    public int field918 = 128;

    @ObfuscatedName("ad.f")
    public boolean field919 = false;

    @ObfuscatedName("ad.ac")
    public int field931 = 0;

    @ObfuscatedName("ad.as")
    public int field940 = 0;

    @ObfuscatedName("ad.af")
    public int field938 = -1;

    @ObfuscatedName("ad.am")
    public int field939 = 32;

    @ObfuscatedName("ad.ap")
    public int[] field924;

    @ObfuscatedName("ad.aa")
    public int field941 = -1;

    @ObfuscatedName("ad.ar")
    public int field942 = -1;

    @ObfuscatedName("ad.av")
    public boolean field943 = true;

    @ObfuscatedName("ad.ao")
    public boolean field944 = true;

    @ObfuscatedName("ad.aq")
    public boolean field945 = false;

    @ObfuscatedName("ah.a(II)Lad;")
    public static class42 method823(int arg0) {
        class42 var1 = (class42) field933.method3544((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field923.method3117(9, arg0);
        class42 var3 = new class42();
        var3.field911 = arg0;
        if (var2 != null) {
            var3.method784(new class123(var2));
        }
        var3.method792();
        field933.method3546(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.d(I)V")
    public void method792() {
    }

    @ObfuscatedName("ad.v(Ldb;B)V")
    public void method784(class123 arg0) {
        while (true) {
            int var2 = arg0.method2395();
            if (var2 == 0) {
                return;
            }
            this.method785(arg0, var2);
        }
    }

    @ObfuscatedName("ad.r(Ldb;II)V")
    public void method785(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2395();
            this.field917 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field917[var4] = arg0.method2584();
            }
        } else if (arg1 == 2) {
            this.field915 = arg0.method2397();
        } else if (arg1 == 12) {
            this.field916 = arg0.method2395();
        } else if (arg1 == 13) {
            this.field936 = arg0.method2584();
        } else if (arg1 == 14) {
            this.field922 = arg0.method2584();
        } else if (arg1 == 15) {
            this.field935 = arg0.method2584();
        } else if (arg1 == 16) {
            this.field921 = arg0.method2584();
        } else if (arg1 == 17) {
            this.field922 = arg0.method2584();
            this.field914 = arg0.method2584();
            this.field929 = arg0.method2584();
            this.field925 = arg0.method2584();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field930[arg1 - 30] = arg0.method2397();
            if (this.field930[arg1 - 30].equalsIgnoreCase(class161.field2422)) {
                this.field930[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2395();
            this.field926 = new short[var5];
            this.field927 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field926[var6] = (short) arg0.method2584();
                this.field927[var6] = (short) arg0.method2584();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2395();
            this.field928 = new short[var7];
            this.field937 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field928[var8] = (short) arg0.method2584();
                this.field937[var8] = (short) arg0.method2584();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2395();
            this.field920 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field920[var10] = arg0.method2584();
            }
        } else if (arg1 == 93) {
            this.field912 = false;
        } else if (arg1 == 95) {
            this.field932 = arg0.method2584();
        } else if (arg1 == 97) {
            this.field934 = arg0.method2584();
        } else if (arg1 == 98) {
            this.field918 = arg0.method2584();
        } else if (arg1 == 99) {
            this.field919 = true;
        } else if (arg1 == 100) {
            this.field931 = arg0.method2396();
        } else if (arg1 == 101) {
            this.field940 = arg0.method2396() * 5;
        } else if (arg1 == 102) {
            this.field938 = arg0.method2584();
        } else if (arg1 == 103) {
            this.field939 = arg0.method2584();
        } else if (arg1 == 106) {
            this.field941 = arg0.method2584();
            if (this.field941 == 65535) {
                this.field941 = -1;
            }
            this.field942 = arg0.method2584();
            if (this.field942 == 65535) {
                this.field942 = -1;
            }
            int var11 = arg0.method2395();
            this.field924 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field924[var12] = arg0.method2584();
                if (this.field924[var12] == 65535) {
                    this.field924[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field943 = false;
        } else if (arg1 == 109) {
            this.field944 = false;
        } else if (arg1 == 111) {
            this.field945 = true;
        }
    }

    @ObfuscatedName("ad.z(Lai;ILai;II)Ldp;")
    public final class109 method800(class45 arg0, int arg1, class45 arg2, int arg3) {
        if (this.field924 != null) {
            class42 var5 = this.method788();
            return var5 == null ? null : var5.method800(arg0, arg1, arg2, arg3);
        }
        class109 var6 = (class109) field913.method3544((long) this.field911);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field917.length; var8++) {
                if (!Statics.field2246.method3159(this.field917[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class104[] var9 = new class104[this.field917.length];
            for (int var10 = 0; var10 < this.field917.length; var10++) {
                var9[var10] = class104.method2159(Statics.field2246, this.field917[var10], 0);
            }
            class104 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class104(var9, var9.length);
            }
            if (this.field926 != null) {
                for (int var12 = 0; var12 < this.field926.length; var12++) {
                    var11.method2114(this.field926[var12], this.field927[var12]);
                }
            }
            if (this.field928 != null) {
                for (int var13 = 0; var13 < this.field928.length; var13++) {
                    var11.method2115(this.field928[var13], this.field937[var13]);
                }
            }
            var6 = var11.method2122(this.field931 + 64, this.field940 + 850, -30, -50, -30);
            field913.method3546(var6, (long) this.field911);
        }
        class109 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method884(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method881(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2231(true);
        } else {
            var14 = arg2.method881(var6, arg3);
        }
        if (this.field934 != 128 || this.field918 != 128) {
            var14.method2210(this.field934, this.field918, this.field934);
        }
        return var14;
    }

    @ObfuscatedName("ad.t(I)Lcd;")
    public final class104 method787() {
        if (this.field924 != null) {
            class42 var1 = this.method788();
            return var1 == null ? null : var1.method787();
        } else if (this.field920 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field920.length; var3++) {
                if (!Statics.field2246.method3159(this.field920[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class104[] var4 = new class104[this.field920.length];
            for (int var5 = 0; var5 < this.field920.length; var5++) {
                var4[var5] = class104.method2159(Statics.field2246, this.field920[var5], 0);
            }
            class104 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class104(var4, var4.length);
            }
            if (this.field926 != null) {
                for (int var7 = 0; var7 < this.field926.length; var7++) {
                    var6.method2114(this.field926[var7], this.field927[var7]);
                }
            }
            if (this.field928 != null) {
                for (int var8 = 0; var8 < this.field928.length; var8++) {
                    var6.method2115(this.field928[var8], this.field937[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ad.n(I)Lad;")
    public final class42 method788() {
        int var1 = -1;
        if (this.field941 != -1) {
            var1 = class180.method3001(this.field941);
        } else if (this.field942 != -1) {
            var1 = class180.field2969[this.field942];
        }
        return var1 < 0 || var1 >= this.field924.length || this.field924[var1] == -1 ? null : method823(this.field924[var1]);
    }

    @ObfuscatedName("ad.i(I)Z")
    public boolean method789() {
        if (this.field924 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field941 != -1) {
            var1 = class180.method3001(this.field941);
        } else if (this.field942 != -1) {
            var1 = class180.field2969[this.field942];
        }
        return var1 >= 0 && var1 < this.field924.length && this.field924[var1] != -1;
    }

    @ObfuscatedName("c.g(I)V")
    public static void method596() {
        field933.method3552();
        field913.method3552();
    }
}
