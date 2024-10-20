package deob;

@ObfuscatedName("ar")
public class class40 extends class204 {

    @ObfuscatedName("ar.v")
    public static class193 field895 = new class193(64);

    @ObfuscatedName("ar.l")
    public static class193 field892 = new class193(50);

    @ObfuscatedName("ar.y")
    public int field893;

    @ObfuscatedName("ar.w")
    public String field921 = "null";

    @ObfuscatedName("ar.u")
    public int field905 = 1;

    @ObfuscatedName("ar.a")
    public int[] field896;

    @ObfuscatedName("ar.e")
    public int[] field897;

    @ObfuscatedName("ar.b")
    public int field920 = -1;

    @ObfuscatedName("ar.o")
    public int field899 = -1;

    @ObfuscatedName("ar.m")
    public int field907 = -1;

    @ObfuscatedName("ar.x")
    public int field901 = -1;

    @ObfuscatedName("ar.k")
    public int field900 = -1;

    @ObfuscatedName("ar.n")
    public int field903 = -1;

    @ObfuscatedName("ar.j")
    public int field904 = -1;

    @ObfuscatedName("ar.t")
    public short[] field891;

    @ObfuscatedName("ar.z")
    public short[] field915;

    @ObfuscatedName("ar.h")
    public short[] field919;

    @ObfuscatedName("ar.i")
    public short[] field908;

    @ObfuscatedName("ar.q")
    public String[] field909 = new String[5];

    @ObfuscatedName("ar.r")
    public boolean field910 = true;

    @ObfuscatedName("ar.s")
    public int field911 = -1;

    @ObfuscatedName("ar.g")
    public int field912 = 128;

    @ObfuscatedName("ar.f")
    public int field913 = 128;

    @ObfuscatedName("ar.c")
    public boolean field902 = false;

    @ObfuscatedName("ar.ae")
    public int field917 = 0;

    @ObfuscatedName("ar.ao")
    public int field916 = 0;

    @ObfuscatedName("ar.ak")
    public int field890 = -1;

    @ObfuscatedName("ar.ah")
    public int field918 = 32;

    @ObfuscatedName("ar.al")
    public int[] field898;

    @ObfuscatedName("ar.ax")
    public int field894 = -1;

    @ObfuscatedName("ar.az")
    public int field923 = -1;

    @ObfuscatedName("ar.ad")
    public boolean field922 = true;

    @ObfuscatedName("ar.aw")
    public boolean field906 = true;

    @ObfuscatedName("ar.as")
    public boolean field924 = false;

    @ObfuscatedName("ar.ai")
    public int field925 = 30;

    @ObfuscatedName("ae.d(Lfn;Lfn;I)V")
    public static void method613(class167 arg0, class167 arg1) {
        Statics.field2899 = arg0;
        Statics.field914 = arg1;
    }

    @ObfuscatedName("bi.p(II)Lar;")
    public static class40 method1083(int arg0) {
        class40 var1 = (class40) field895.method3553((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2899.method3134(9, arg0);
        class40 var3 = new class40();
        var3.field893 = arg0;
        if (var2 != null) {
            var3.method739(new class119(var2));
        }
        var3.method731();
        field895.method3554(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.v(B)V")
    public void method731() {
    }

    @ObfuscatedName("ar.l(Ldf;I)V")
    public void method739(class119 arg0) {
        while (true) {
            int var2 = arg0.method2357();
            if (var2 == 0) {
                return;
            }
            this.method730(arg0, var2);
        }
    }

    @ObfuscatedName("ar.y(Ldf;II)V")
    public void method730(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2357();
            this.field896 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field896[var4] = arg0.method2359();
            }
        } else if (arg1 == 2) {
            this.field921 = arg0.method2365();
        } else if (arg1 == 12) {
            this.field905 = arg0.method2357();
        } else if (arg1 == 13) {
            this.field920 = arg0.method2359();
        } else if (arg1 == 14) {
            this.field901 = arg0.method2359();
        } else if (arg1 == 15) {
            this.field899 = arg0.method2359();
        } else if (arg1 == 16) {
            this.field907 = arg0.method2359();
        } else if (arg1 == 17) {
            this.field901 = arg0.method2359();
            this.field900 = arg0.method2359();
            this.field903 = arg0.method2359();
            this.field904 = arg0.method2359();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field909[arg1 - 30] = arg0.method2365();
            if (this.field909[arg1 - 30].equalsIgnoreCase(class157.field2282)) {
                this.field909[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2357();
            this.field891 = new short[var5];
            this.field915 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field891[var6] = (short) arg0.method2359();
                this.field915[var6] = (short) arg0.method2359();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2357();
            this.field919 = new short[var7];
            this.field908 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field919[var8] = (short) arg0.method2359();
                this.field908[var8] = (short) arg0.method2359();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2357();
            this.field897 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field897[var10] = arg0.method2359();
            }
        } else if (arg1 == 93) {
            this.field910 = false;
        } else if (arg1 == 95) {
            this.field911 = arg0.method2359();
        } else if (arg1 == 97) {
            this.field912 = arg0.method2359();
        } else if (arg1 == 98) {
            this.field913 = arg0.method2359();
        } else if (arg1 == 99) {
            this.field902 = true;
        } else if (arg1 == 100) {
            this.field917 = arg0.method2477();
        } else if (arg1 == 101) {
            this.field916 = arg0.method2477() * 5;
        } else if (arg1 == 102) {
            this.field890 = arg0.method2359();
        } else if (arg1 == 103) {
            this.field918 = arg0.method2359();
        } else if (arg1 == 106) {
            this.field894 = arg0.method2359();
            if (this.field894 == 65535) {
                this.field894 = -1;
            }
            this.field923 = arg0.method2359();
            if (this.field923 == 65535) {
                this.field923 = -1;
            }
            int var11 = arg0.method2357();
            this.field898 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field898[var12] = arg0.method2359();
                if (this.field898[var12] == 65535) {
                    this.field898[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field922 = false;
        } else if (arg1 == 109) {
            this.field906 = false;
        } else if (arg1 == 111) {
            this.field924 = true;
        } else if (arg1 == 112) {
            this.field925 = arg0.method2357();
        }
    }

    @ObfuscatedName("ar.w(Laf;ILaf;IB)Ldn;")
    public final class105 method734(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field898 != null) {
            class40 var5 = this.method736();
            return var5 == null ? null : var5.method734(arg0, arg1, arg2, arg3);
        }
        class105 var6 = (class105) field892.method3553((long) this.field893);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field896.length; var8++) {
                if (!Statics.field914.method3113(this.field896[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field896.length];
            for (int var10 = 0; var10 < this.field896.length; var10++) {
                var9[var10] = class100.method2064(Statics.field914, this.field896[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field891 != null) {
                for (int var12 = 0; var12 < this.field891.length; var12++) {
                    var11.method2075(this.field891[var12], this.field915[var12]);
                }
            }
            if (this.field919 != null) {
                for (int var13 = 0; var13 < this.field919.length; var13++) {
                    var11.method2076(this.field919[var13], this.field908[var13]);
                }
            }
            var6 = var11.method2083(this.field917 + 64, this.field916 + 850, -30, -50, -30);
            field892.method3554(var6, (long) this.field893);
        }
        class105 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method846(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method856(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2154(true);
        } else {
            var14 = arg2.method856(var6, arg3);
        }
        if (this.field912 != 128 || this.field913 != 128) {
            var14.method2168(this.field912, this.field913, this.field912);
        }
        return var14;
    }

    @ObfuscatedName("ar.u(B)Lca;")
    public final class100 method735() {
        if (this.field898 != null) {
            class40 var1 = this.method736();
            return var1 == null ? null : var1.method735();
        } else if (this.field897 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field897.length; var3++) {
                if (!Statics.field914.method3113(this.field897[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field897.length];
            for (int var5 = 0; var5 < this.field897.length; var5++) {
                var4[var5] = class100.method2064(Statics.field914, this.field897[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field891 != null) {
                for (int var7 = 0; var7 < this.field891.length; var7++) {
                    var6.method2075(this.field891[var7], this.field915[var7]);
                }
            }
            if (this.field919 != null) {
                for (int var8 = 0; var8 < this.field919.length; var8++) {
                    var6.method2076(this.field919[var8], this.field908[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ar.a(I)Lar;")
    public final class40 method736() {
        int var1 = -1;
        if (this.field894 != -1) {
            var1 = class176.method3020(this.field894);
        } else if (this.field923 != -1) {
            var1 = class176.field2893[this.field923];
        }
        return var1 < 0 || var1 >= this.field898.length || this.field898[var1] == -1 ? null : method1083(this.field898[var1]);
    }

    @ObfuscatedName("ar.e(S)Z")
    public boolean method744() {
        if (this.field898 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field894 != -1) {
            var1 = class176.method3020(this.field894);
        } else if (this.field923 != -1) {
            var1 = class176.field2893[this.field923];
        }
        return var1 >= 0 && var1 < this.field898.length && this.field898[var1] != -1;
    }
}
