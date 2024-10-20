package deob;

@ObfuscatedName("ap")
public class class42 extends class208 {

    @ObfuscatedName("ap.n")
    public static class197 field886 = new class197(64);

    @ObfuscatedName("ap.t")
    public static class197 field887 = new class197(50);

    @ObfuscatedName("ap.v")
    public int field888;

    @ObfuscatedName("ap.b")
    public String field916 = "null";

    @ObfuscatedName("ap.m")
    public int field895 = 1;

    @ObfuscatedName("ap.k")
    public int[] field891;

    @ObfuscatedName("ap.c")
    public int[] field892;

    @ObfuscatedName("ap.w")
    public int field890 = -1;

    @ObfuscatedName("ap.l")
    public int field913 = -1;

    @ObfuscatedName("ap.h")
    public int field920 = -1;

    @ObfuscatedName("ap.i")
    public int field896 = -1;

    @ObfuscatedName("ap.u")
    public int field894 = -1;

    @ObfuscatedName("ap.x")
    public int field898 = -1;

    @ObfuscatedName("ap.d")
    public int field893 = -1;

    @ObfuscatedName("ap.o")
    public short[] field900;

    @ObfuscatedName("ap.j")
    public short[] field901;

    @ObfuscatedName("ap.q")
    public short[] field897;

    @ObfuscatedName("ap.r")
    public short[] field903;

    @ObfuscatedName("ap.a")
    public String[] field904 = new String[5];

    @ObfuscatedName("ap.z")
    public boolean field905 = true;

    @ObfuscatedName("ap.p")
    public int field906 = -1;

    @ObfuscatedName("ap.y")
    public int field919 = 128;

    @ObfuscatedName("ap.s")
    public int field908 = 128;

    @ObfuscatedName("ap.g")
    public boolean field909 = false;

    @ObfuscatedName("ap.aj")
    public int field910 = 0;

    @ObfuscatedName("ap.ay")
    public int field902 = 0;

    @ObfuscatedName("ap.ah")
    public int field912 = -1;

    @ObfuscatedName("ap.ax")
    public int field889 = 32;

    @ObfuscatedName("ap.ar")
    public int[] field914;

    @ObfuscatedName("ap.ae")
    public int field915 = -1;

    @ObfuscatedName("ap.ac")
    public int field911 = -1;

    @ObfuscatedName("ap.aw")
    public boolean field917 = true;

    @ObfuscatedName("ap.am")
    public boolean field918 = true;

    @ObfuscatedName("ap.aq")
    public boolean field899 = false;

    @ObfuscatedName("ay.f(II)Lap;")
    public static class42 method644(int arg0) {
        class42 var1 = (class42) field886.method3569((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field907.method3107(9, arg0);
        class42 var3 = new class42();
        var3.field888 = arg0;
        if (var2 != null) {
            var3.method774(new class123(var2));
        }
        var3.method777();
        field886.method3571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.e(I)V")
    public void method777() {
    }

    @ObfuscatedName("ap.n(Ldx;I)V")
    public void method774(class123 arg0) {
        while (true) {
            int var2 = arg0.method2522();
            if (var2 == 0) {
                return;
            }
            this.method775(arg0, var2);
        }
    }

    @ObfuscatedName("ap.t(Ldx;II)V")
    public void method775(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2522();
            this.field891 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field891[var4] = arg0.method2401();
            }
        } else if (arg1 == 2) {
            this.field916 = arg0.method2407();
        } else if (arg1 == 12) {
            this.field895 = arg0.method2522();
        } else if (arg1 == 13) {
            this.field890 = arg0.method2401();
        } else if (arg1 == 14) {
            this.field896 = arg0.method2401();
        } else if (arg1 == 15) {
            this.field913 = arg0.method2401();
        } else if (arg1 == 16) {
            this.field920 = arg0.method2401();
        } else if (arg1 == 17) {
            this.field896 = arg0.method2401();
            this.field894 = arg0.method2401();
            this.field898 = arg0.method2401();
            this.field893 = arg0.method2401();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field904[arg1 - 30] = arg0.method2407();
            if (this.field904[arg1 - 30].equalsIgnoreCase(class161.field2351)) {
                this.field904[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2522();
            this.field900 = new short[var5];
            this.field901 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field900[var6] = (short) arg0.method2401();
                this.field901[var6] = (short) arg0.method2401();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2522();
            this.field897 = new short[var7];
            this.field903 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field897[var8] = (short) arg0.method2401();
                this.field903[var8] = (short) arg0.method2401();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2522();
            this.field892 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field892[var10] = arg0.method2401();
            }
        } else if (arg1 == 93) {
            this.field905 = false;
        } else if (arg1 == 95) {
            this.field906 = arg0.method2401();
        } else if (arg1 == 97) {
            this.field919 = arg0.method2401();
        } else if (arg1 == 98) {
            this.field908 = arg0.method2401();
        } else if (arg1 == 99) {
            this.field909 = true;
        } else if (arg1 == 100) {
            this.field910 = arg0.method2400();
        } else if (arg1 == 101) {
            this.field902 = arg0.method2400() * 5;
        } else if (arg1 == 102) {
            this.field912 = arg0.method2401();
        } else if (arg1 == 103) {
            this.field889 = arg0.method2401();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field915 = arg0.method2401();
            if (this.field915 == 65535) {
                this.field915 = -1;
            }
            this.field911 = arg0.method2401();
            if (this.field911 == 65535) {
                this.field911 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2401();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2522();
            this.field914 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field914[var13] = arg0.method2401();
                if (this.field914[var13] == 65535) {
                    this.field914[var13] = -1;
                }
            }
            this.field914[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field917 = false;
        } else if (arg1 == 109) {
            this.field918 = false;
        } else if (arg1 == 111) {
            this.field899 = true;
        }
    }

    @ObfuscatedName("ap.v(Laz;ILaz;II)Ldg;")
    public final class109 method776(class45 arg0, int arg1, class45 arg2, int arg3) {
        if (this.field914 != null) {
            class42 var5 = this.method778();
            return var5 == null ? null : var5.method776(arg0, arg1, arg2, arg3);
        }
        class109 var6 = (class109) field887.method3569((long) this.field888);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field891.length; var8++) {
                if (!Statics.field2225.method3156(this.field891[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class104[] var9 = new class104[this.field891.length];
            for (int var10 = 0; var10 < this.field891.length; var10++) {
                var9[var10] = class104.method2114(Statics.field2225, this.field891[var10], 0);
            }
            class104 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class104(var9, var9.length);
            }
            if (this.field900 != null) {
                for (int var12 = 0; var12 < this.field900.length; var12++) {
                    var11.method2126(this.field900[var12], this.field901[var12]);
                }
            }
            if (this.field897 != null) {
                for (int var13 = 0; var13 < this.field897.length; var13++) {
                    var11.method2127(this.field897[var13], this.field903[var13]);
                }
            }
            var6 = var11.method2134(this.field910 + 64, this.field902 + 850, -30, -50, -30);
            field887.method3571(var6, (long) this.field888);
        }
        class109 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method865(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method862(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2228(true);
        } else {
            var14 = arg2.method862(var6, arg3);
        }
        if (this.field919 != 128 || this.field908 != 128) {
            var14.method2211(this.field919, this.field908, this.field919);
        }
        return var14;
    }

    @ObfuscatedName("ap.b(I)Lca;")
    public final class104 method790() {
        if (this.field914 != null) {
            class42 var1 = this.method778();
            return var1 == null ? null : var1.method790();
        } else if (this.field892 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field892.length; var3++) {
                if (!Statics.field2225.method3156(this.field892[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class104[] var4 = new class104[this.field892.length];
            for (int var5 = 0; var5 < this.field892.length; var5++) {
                var4[var5] = class104.method2114(Statics.field2225, this.field892[var5], 0);
            }
            class104 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class104(var4, var4.length);
            }
            if (this.field900 != null) {
                for (int var7 = 0; var7 < this.field900.length; var7++) {
                    var6.method2126(this.field900[var7], this.field901[var7]);
                }
            }
            if (this.field897 != null) {
                for (int var8 = 0; var8 < this.field897.length; var8++) {
                    var6.method2127(this.field897[var8], this.field903[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ap.m(I)Lap;")
    public final class42 method778() {
        int var1 = -1;
        if (this.field915 != -1) {
            var1 = class180.method2322(this.field915);
        } else if (this.field911 != -1) {
            var1 = class180.field2941[this.field911];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field914.length - 1) {
            var2 = this.field914[var1];
        } else {
            var2 = this.field914[this.field914.length - 1];
        }
        return var2 == -1 ? null : method644(var2);
    }

    @ObfuscatedName("ap.k(I)Z")
    public boolean method779() {
        if (this.field914 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field915 != -1) {
            var1 = class180.method2322(this.field915);
        } else if (this.field911 != -1) {
            var1 = class180.field2941[this.field911];
        }
        if (var1 >= 0 && var1 < this.field914.length) {
            return this.field914[var1] != -1;
        } else {
            return this.field914[this.field914.length - 1] != -1;
        }
    }

    @ObfuscatedName("h.c(S)V")
    public static void method138() {
        field886.method3572();
        field887.method3572();
    }
}
