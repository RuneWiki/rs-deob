package deob;

@ObfuscatedName("ag")
public class class40 extends class205 {

    @ObfuscatedName("ag.t")
    public static class194 field887 = new class194(64);

    @ObfuscatedName("ag.p")
    public static class194 field889 = new class194(50);

    @ObfuscatedName("ag.e")
    public int field890;

    @ObfuscatedName("ag.y")
    public String field891 = "null";

    @ObfuscatedName("ag.m")
    public int field886 = 1;

    @ObfuscatedName("ag.c")
    public int[] field893;

    @ObfuscatedName("ag.v")
    public int[] field919;

    @ObfuscatedName("ag.l")
    public int field924 = -1;

    @ObfuscatedName("ag.z")
    public int field896 = -1;

    @ObfuscatedName("ag.s")
    public int field910 = -1;

    @ObfuscatedName("ag.j")
    public int field912 = -1;

    @ObfuscatedName("ag.q")
    public int field899 = -1;

    @ObfuscatedName("ag.a")
    public int field888 = -1;

    @ObfuscatedName("ag.d")
    public int field901 = -1;

    @ObfuscatedName("ag.u")
    public short[] field902;

    @ObfuscatedName("ag.i")
    public short[] field903;

    @ObfuscatedName("ag.o")
    public short[] field904;

    @ObfuscatedName("ag.h")
    public short[] field905;

    @ObfuscatedName("ag.k")
    public String[] field894 = new String[5];

    @ObfuscatedName("ag.f")
    public boolean field907 = true;

    @ObfuscatedName("ag.r")
    public int field900 = -1;

    @ObfuscatedName("ag.n")
    public int field892 = 128;

    @ObfuscatedName("ag.g")
    public int field898 = 128;

    @ObfuscatedName("ag.b")
    public boolean field911 = false;

    @ObfuscatedName("ag.af")
    public int field895 = 0;

    @ObfuscatedName("ag.am")
    public int field913 = 0;

    @ObfuscatedName("ag.ar")
    public int field914 = -1;

    @ObfuscatedName("ag.ay")
    public int field915 = 32;

    @ObfuscatedName("ag.ai")
    public int[] field916;

    @ObfuscatedName("ag.ab")
    public int field917 = -1;

    @ObfuscatedName("ag.av")
    public int field909 = -1;

    @ObfuscatedName("ag.ac")
    public boolean field897 = true;

    @ObfuscatedName("ag.ah")
    public boolean field920 = true;

    @ObfuscatedName("ag.ae")
    public boolean field921 = false;

    @ObfuscatedName("ag.aj")
    public int field922 = 30;

    @ObfuscatedName("aj.w(II)Lag;")
    public static class40 method745(int arg0) {
        class40 var1 = (class40) field887.method3520((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field906.method3127(9, arg0);
        class40 var3 = new class40();
        var3.field890 = arg0;
        if (var2 != null) {
            var3.method779(new class120(var2));
        }
        var3.method769();
        field887.method3522(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.x(I)V")
    public void method769() {
    }

    @ObfuscatedName("ag.t(Lde;I)V")
    public void method779(class120 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method771(arg0, var2);
        }
    }

    @ObfuscatedName("ag.p(Lde;II)V")
    public void method771(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2363();
            this.field893 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field893[var4] = arg0.method2365();
            }
        } else if (arg1 == 2) {
            this.field891 = arg0.method2540();
        } else if (arg1 == 12) {
            this.field886 = arg0.method2363();
        } else if (arg1 == 13) {
            this.field924 = arg0.method2365();
        } else if (arg1 == 14) {
            this.field912 = arg0.method2365();
        } else if (arg1 == 15) {
            this.field896 = arg0.method2365();
        } else if (arg1 == 16) {
            this.field910 = arg0.method2365();
        } else if (arg1 == 17) {
            this.field912 = arg0.method2365();
            this.field899 = arg0.method2365();
            this.field888 = arg0.method2365();
            this.field901 = arg0.method2365();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field894[arg1 - 30] = arg0.method2540();
            if (this.field894[arg1 - 30].equalsIgnoreCase(class158.field2338)) {
                this.field894[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2363();
            this.field902 = new short[var5];
            this.field903 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field902[var6] = (short) arg0.method2365();
                this.field903[var6] = (short) arg0.method2365();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2363();
            this.field904 = new short[var7];
            this.field905 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field904[var8] = (short) arg0.method2365();
                this.field905[var8] = (short) arg0.method2365();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2363();
            this.field919 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field919[var10] = arg0.method2365();
            }
        } else if (arg1 == 93) {
            this.field907 = false;
        } else if (arg1 == 95) {
            this.field900 = arg0.method2365();
        } else if (arg1 == 97) {
            this.field892 = arg0.method2365();
        } else if (arg1 == 98) {
            this.field898 = arg0.method2365();
        } else if (arg1 == 99) {
            this.field911 = true;
        } else if (arg1 == 100) {
            this.field895 = arg0.method2381();
        } else if (arg1 == 101) {
            this.field913 = arg0.method2381() * 5;
        } else if (arg1 == 102) {
            this.field914 = arg0.method2365();
        } else if (arg1 == 103) {
            this.field915 = arg0.method2365();
        } else if (arg1 == 106) {
            this.field917 = arg0.method2365();
            if (this.field917 == 65535) {
                this.field917 = -1;
            }
            this.field909 = arg0.method2365();
            if (this.field909 == 65535) {
                this.field909 = -1;
            }
            int var11 = arg0.method2363();
            this.field916 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field916[var12] = arg0.method2365();
                if (this.field916[var12] == 65535) {
                    this.field916[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field897 = false;
        } else if (arg1 == 109) {
            this.field920 = false;
        } else if (arg1 == 111) {
            this.field921 = true;
        } else if (arg1 == 112) {
            this.field922 = arg0.method2363();
        }
    }

    @ObfuscatedName("ag.e(Lao;ILao;II)Ldp;")
    public final class106 method773(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field916 != null) {
            class40 var5 = this.method774();
            return var5 == null ? null : var5.method773(arg0, arg1, arg2, arg3);
        }
        class106 var6 = (class106) field889.method3520((long) this.field890);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field893.length; var8++) {
                if (!Statics.field908.method3082(this.field893[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field893.length];
            for (int var10 = 0; var10 < this.field893.length; var10++) {
                var9[var10] = class101.method2081(Statics.field908, this.field893[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field902 != null) {
                for (int var12 = 0; var12 < this.field902.length; var12++) {
                    var11.method2105(this.field902[var12], this.field903[var12]);
                }
            }
            if (this.field904 != null) {
                for (int var13 = 0; var13 < this.field904.length; var13++) {
                    var11.method2072(this.field904[var13], this.field905[var13]);
                }
            }
            var6 = var11.method2079(this.field895 + 64, this.field913 + 850, -30, -50, -30);
            field889.method3522(var6, (long) this.field890);
        }
        class106 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method890(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method883(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2178(true);
        } else {
            var14 = arg2.method883(var6, arg3);
        }
        if (this.field892 != 128 || this.field898 != 128) {
            var14.method2182(this.field892, this.field898, this.field892);
        }
        return var14;
    }

    @ObfuscatedName("ag.y(I)Lcu;")
    public final class101 method790() {
        if (this.field916 != null) {
            class40 var1 = this.method774();
            return var1 == null ? null : var1.method790();
        } else if (this.field919 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field919.length; var3++) {
                if (!Statics.field908.method3082(this.field919[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field919.length];
            for (int var5 = 0; var5 < this.field919.length; var5++) {
                var4[var5] = class101.method2081(Statics.field908, this.field919[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field902 != null) {
                for (int var7 = 0; var7 < this.field902.length; var7++) {
                    var6.method2105(this.field902[var7], this.field903[var7]);
                }
            }
            if (this.field904 != null) {
                for (int var8 = 0; var8 < this.field904.length; var8++) {
                    var6.method2072(this.field904[var8], this.field905[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ag.m(B)Lag;")
    public final class40 method774() {
        int var1 = -1;
        if (this.field917 != -1) {
            var1 = class177.method2977(this.field917);
        } else if (this.field909 != -1) {
            var1 = class177.field2917[this.field909];
        }
        return var1 < 0 || var1 >= this.field916.length || this.field916[var1] == -1 ? null : method745(this.field916[var1]);
    }

    @ObfuscatedName("ag.c(B)Z")
    public boolean method775() {
        if (this.field916 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field917 != -1) {
            var1 = class177.method2977(this.field917);
        } else if (this.field909 != -1) {
            var1 = class177.field2917[this.field909];
        }
        return var1 >= 0 && var1 < this.field916.length && this.field916[var1] != -1;
    }

    @ObfuscatedName("h.v(B)V")
    public static void method226() {
        field887.method3525();
        field889.method3525();
    }
}
