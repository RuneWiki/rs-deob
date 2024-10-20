package deob;

@ObfuscatedName("ae")
public class class40 extends class204 {

    @ObfuscatedName("ae.w")
    public static class193 field912 = new class193(64);

    @ObfuscatedName("ae.d")
    public static class193 field891 = new class193(50);

    @ObfuscatedName("ae.z")
    public int field892;

    @ObfuscatedName("ae.l")
    public String field893 = "null";

    @ObfuscatedName("ae.m")
    public int field894 = 1;

    @ObfuscatedName("ae.p")
    public int[] field916;

    @ObfuscatedName("ae.u")
    public int[] field915;

    @ObfuscatedName("ae.c")
    public int field924 = -1;

    @ObfuscatedName("ae.v")
    public int field898 = -1;

    @ObfuscatedName("ae.o")
    public int field905 = -1;

    @ObfuscatedName("ae.n")
    public int field900 = -1;

    @ObfuscatedName("ae.k")
    public int field901 = -1;

    @ObfuscatedName("ae.f")
    public int field890 = -1;

    @ObfuscatedName("ae.x")
    public int field917 = -1;

    @ObfuscatedName("ae.j")
    public short[] field902;

    @ObfuscatedName("ae.r")
    public short[] field919;

    @ObfuscatedName("ae.y")
    public short[] field906;

    @ObfuscatedName("ae.t")
    public short[] field907;

    @ObfuscatedName("ae.a")
    public String[] field908 = new String[5];

    @ObfuscatedName("ae.s")
    public boolean field909 = true;

    @ObfuscatedName("ae.e")
    public int field910 = -1;

    @ObfuscatedName("ae.q")
    public int field911 = 128;

    @ObfuscatedName("ae.i")
    public int field926 = 128;

    @ObfuscatedName("ae.h")
    public boolean field913 = false;

    @ObfuscatedName("ae.ay")
    public int field914 = 0;

    @ObfuscatedName("ae.ak")
    public int field903 = 0;

    @ObfuscatedName("ae.ai")
    public int field888 = -1;

    @ObfuscatedName("ae.ag")
    public int field896 = 32;

    @ObfuscatedName("ae.ab")
    public int[] field899;

    @ObfuscatedName("ae.aa")
    public int field918 = -1;

    @ObfuscatedName("ae.af")
    public int field920 = -1;

    @ObfuscatedName("ae.al")
    public boolean field921 = true;

    @ObfuscatedName("ae.ad")
    public boolean field922 = true;

    @ObfuscatedName("ae.aw")
    public boolean field923 = false;

    @ObfuscatedName("ae.an")
    public int field895 = 30;

    @ObfuscatedName("cc.g(Lfc;Lfc;I)V")
    public static void method2165(class167 arg0, class167 arg1) {
        Statics.field897 = arg0;
        Statics.field889 = arg1;
    }

    @ObfuscatedName("o.b(II)Lae;")
    public static class40 method140(int arg0) {
        class40 var1 = (class40) field912.method3529((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field897.method3112(9, arg0);
        class40 var3 = new class40();
        var3.field892 = arg0;
        if (var2 != null) {
            var3.method766(new class119(var2));
        }
        var3.method765();
        field912.method3528(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.w(I)V")
    public void method765() {
    }

    @ObfuscatedName("ae.d(Ldm;I)V")
    public void method766(class119 arg0) {
        while (true) {
            int var2 = arg0.method2362();
            if (var2 == 0) {
                return;
            }
            this.method773(arg0, var2);
        }
    }

    @ObfuscatedName("ae.z(Ldm;IB)V")
    public void method773(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2362();
            this.field916 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field916[var4] = arg0.method2376();
            }
        } else if (arg1 == 2) {
            this.field893 = arg0.method2370();
        } else if (arg1 == 12) {
            this.field894 = arg0.method2362();
        } else if (arg1 == 13) {
            this.field924 = arg0.method2376();
        } else if (arg1 == 14) {
            this.field900 = arg0.method2376();
        } else if (arg1 == 15) {
            this.field898 = arg0.method2376();
        } else if (arg1 == 16) {
            this.field905 = arg0.method2376();
        } else if (arg1 == 17) {
            this.field900 = arg0.method2376();
            this.field901 = arg0.method2376();
            this.field890 = arg0.method2376();
            this.field917 = arg0.method2376();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field908[arg1 - 30] = arg0.method2370();
            if (this.field908[arg1 - 30].equalsIgnoreCase(class157.field2300)) {
                this.field908[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2362();
            this.field902 = new short[var5];
            this.field919 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field902[var6] = (short) arg0.method2376();
                this.field919[var6] = (short) arg0.method2376();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2362();
            this.field906 = new short[var7];
            this.field907 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field906[var8] = (short) arg0.method2376();
                this.field907[var8] = (short) arg0.method2376();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2362();
            this.field915 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field915[var10] = arg0.method2376();
            }
        } else if (arg1 == 93) {
            this.field909 = false;
        } else if (arg1 == 95) {
            this.field910 = arg0.method2376();
        } else if (arg1 == 97) {
            this.field911 = arg0.method2376();
        } else if (arg1 == 98) {
            this.field926 = arg0.method2376();
        } else if (arg1 == 99) {
            this.field913 = true;
        } else if (arg1 == 100) {
            this.field914 = arg0.method2391();
        } else if (arg1 == 101) {
            this.field903 = arg0.method2391() * 5;
        } else if (arg1 == 102) {
            this.field888 = arg0.method2376();
        } else if (arg1 == 103) {
            this.field896 = arg0.method2376();
        } else if (arg1 == 106) {
            this.field918 = arg0.method2376();
            if (this.field918 == 65535) {
                this.field918 = -1;
            }
            this.field920 = arg0.method2376();
            if (this.field920 == 65535) {
                this.field920 = -1;
            }
            int var11 = arg0.method2362();
            this.field899 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field899[var12] = arg0.method2376();
                if (this.field899[var12] == 65535) {
                    this.field899[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field921 = false;
        } else if (arg1 == 109) {
            this.field922 = false;
        } else if (arg1 == 111) {
            this.field923 = true;
        } else if (arg1 == 112) {
            this.field895 = arg0.method2362();
        }
    }

    @ObfuscatedName("ae.l(Laj;ILaj;II)Ldd;")
    public final class105 method768(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field899 != null) {
            class40 var5 = this.method770();
            return var5 == null ? null : var5.method768(arg0, arg1, arg2, arg3);
        }
        class105 var6 = (class105) field891.method3529((long) this.field892);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field916.length; var8++) {
                if (!Statics.field889.method3082(this.field916[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field916.length];
            for (int var10 = 0; var10 < this.field916.length; var10++) {
                var9[var10] = class100.method2080(Statics.field889, this.field916[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field902 != null) {
                for (int var12 = 0; var12 < this.field902.length; var12++) {
                    var11.method2093(this.field902[var12], this.field919[var12]);
                }
            }
            if (this.field906 != null) {
                for (int var13 = 0; var13 < this.field906.length; var13++) {
                    var11.method2094(this.field906[var13], this.field907[var13]);
                }
            }
            var6 = var11.method2079(this.field914 + 64, this.field903 + 850, -30, -50, -30);
            field891.method3528(var6, (long) this.field892);
        }
        class105 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method872(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method869(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2176(true);
        } else {
            var14 = arg2.method869(var6, arg3);
        }
        if (this.field911 != 128 || this.field926 != 128) {
            var14.method2190(this.field911, this.field926, this.field911);
        }
        return var14;
    }

    @ObfuscatedName("ae.m(I)Lcd;")
    public final class100 method769() {
        if (this.field899 != null) {
            class40 var1 = this.method770();
            return var1 == null ? null : var1.method769();
        } else if (this.field915 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field915.length; var3++) {
                if (!Statics.field889.method3082(this.field915[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field915.length];
            for (int var5 = 0; var5 < this.field915.length; var5++) {
                var4[var5] = class100.method2080(Statics.field889, this.field915[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field902 != null) {
                for (int var7 = 0; var7 < this.field902.length; var7++) {
                    var6.method2093(this.field902[var7], this.field919[var7]);
                }
            }
            if (this.field906 != null) {
                for (int var8 = 0; var8 < this.field906.length; var8++) {
                    var6.method2094(this.field906[var8], this.field907[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ae.p(I)Lae;")
    public final class40 method770() {
        int var1 = -1;
        if (this.field918 != -1) {
            var1 = class176.method98(this.field918);
        } else if (this.field920 != -1) {
            var1 = class176.field2885[this.field920];
        }
        return var1 < 0 || var1 >= this.field899.length || this.field899[var1] == -1 ? null : method140(this.field899[var1]);
    }

    @ObfuscatedName("ae.u(I)Z")
    public boolean method775() {
        if (this.field899 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field918 != -1) {
            var1 = class176.method98(this.field918);
        } else if (this.field920 != -1) {
            var1 = class176.field2885[this.field920];
        }
        return var1 >= 0 && var1 < this.field899.length && this.field899[var1] != -1;
    }
}
