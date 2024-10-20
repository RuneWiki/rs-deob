package deob;

@ObfuscatedName("az")
public class class41 extends class204 {

    @ObfuscatedName("az.m")
    public static boolean field904 = false;

    @ObfuscatedName("az.u")
    public static class193 field882 = new class193(64);

    @ObfuscatedName("az.k")
    public static class193 field885 = new class193(500);

    @ObfuscatedName("az.j")
    public static class193 field886 = new class193(30);

    @ObfuscatedName("az.i")
    public static class193 field887 = new class193(30);

    @ObfuscatedName("az.x")
    public static class100[] field888 = new class100[4];

    @ObfuscatedName("az.g")
    public int field931;

    @ObfuscatedName("az.e")
    public int[] field925;

    @ObfuscatedName("az.p")
    public int[] field891;

    @ObfuscatedName("az.a")
    public String field892 = "null";

    @ObfuscatedName("az.v")
    public short[] field893;

    @ObfuscatedName("az.c")
    public short[] field894;

    @ObfuscatedName("az.s")
    public short[] field895;

    @ObfuscatedName("az.r")
    public short[] field896;

    @ObfuscatedName("az.h")
    public int field930 = 1;

    @ObfuscatedName("az.n")
    public int field898 = 1;

    @ObfuscatedName("az.b")
    public int field899 = 2;

    @ObfuscatedName("az.f")
    public boolean field900 = true;

    @ObfuscatedName("az.d")
    public int field901 = -1;

    @ObfuscatedName("az.q")
    public int field884 = -1;

    @ObfuscatedName("az.o")
    public boolean field903 = false;

    @ObfuscatedName("az.w")
    public boolean field907 = false;

    @ObfuscatedName("az.z")
    public int field889 = -1;

    @ObfuscatedName("az.t")
    public int field906 = 16;

    @ObfuscatedName("az.aq")
    public int field890 = 0;

    @ObfuscatedName("az.an")
    public int field908 = 0;

    @ObfuscatedName("az.av")
    public String[] field909 = new String[5];

    @ObfuscatedName("az.ac")
    public int field910 = -1;

    @ObfuscatedName("az.ar")
    public int field911 = -1;

    @ObfuscatedName("az.ah")
    public boolean field912 = false;

    @ObfuscatedName("az.ab")
    public boolean field913 = true;

    @ObfuscatedName("az.au")
    public int field918 = 128;

    @ObfuscatedName("az.ao")
    public int field915 = 128;

    @ObfuscatedName("az.am")
    public int field933 = 128;

    @ObfuscatedName("az.aa")
    public int field917 = 0;

    @ObfuscatedName("az.aj")
    public int field916 = 0;

    @ObfuscatedName("az.ap")
    public int field919 = 0;

    @ObfuscatedName("az.at")
    public boolean field920 = false;

    @ObfuscatedName("az.az")
    public boolean field921 = false;

    @ObfuscatedName("az.ai")
    public int field922 = -1;

    @ObfuscatedName("az.af")
    public int[] field923;

    @ObfuscatedName("az.aw")
    public int field924 = -1;

    @ObfuscatedName("az.al")
    public int field926 = -1;

    @ObfuscatedName("az.ax")
    public int field914 = -1;

    @ObfuscatedName("az.ag")
    public int field897 = 0;

    @ObfuscatedName("az.ak")
    public int field928 = 0;

    @ObfuscatedName("az.ad")
    public int field929 = 0;

    @ObfuscatedName("az.ae")
    public int[] field905;

    @ObfuscatedName("ad.m(Lfx;Lfx;ZI)V")
    public static void method1013(class167 arg0, class167 arg1, boolean arg2) {
        Statics.field3205 = arg0;
        Statics.field883 = arg1;
        field904 = arg2;
    }

    @ObfuscatedName("j.l(II)Laz;")
    public static class41 method85(int arg0) {
        class41 var1 = (class41) field882.method3537((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3205.method3080(6, arg0);
        class41 var3 = new class41();
        var3.field931 = arg0;
        if (var2 != null) {
            var3.method814(new class119(var2));
        }
        var3.method813();
        if (var3.field921) {
            var3.field899 = 0;
            var3.field900 = false;
        }
        field882.method3539(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.y(I)V")
    public void method813() {
        if (this.field901 == -1) {
            this.field901 = 0;
            if (this.field925 != null && (this.field891 == null || this.field891[0] == 10)) {
                this.field901 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field909[var1] != null) {
                    this.field901 = 1;
                }
            }
        }
        if (this.field922 == -1) {
            this.field922 = this.field899 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("az.u(Ldx;I)V")
    public void method814(class119 arg0) {
        while (true) {
            int var2 = arg0.method2562();
            if (var2 == 0) {
                return;
            }
            this.method841(arg0, var2);
        }
    }

    @ObfuscatedName("az.k(Ldx;II)V")
    public void method841(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2562();
            if (var3 > 0) {
                if (this.field925 == null || field904) {
                    this.field891 = new int[var3];
                    this.field925 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field925[var4] = arg0.method2541();
                        this.field891[var4] = arg0.method2562();
                    }
                } else {
                    arg0.field1955 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field892 = arg0.method2389();
        } else if (arg1 == 5) {
            int var5 = arg0.method2562();
            if (var5 > 0) {
                if (this.field925 == null || field904) {
                    this.field891 = null;
                    this.field925 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field925[var6] = arg0.method2541();
                    }
                } else {
                    arg0.field1955 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field930 = arg0.method2562();
        } else if (arg1 == 15) {
            this.field898 = arg0.method2562();
        } else if (arg1 == 17) {
            this.field899 = 0;
            this.field900 = false;
        } else if (arg1 == 18) {
            this.field900 = false;
        } else if (arg1 == 19) {
            this.field901 = arg0.method2562();
        } else if (arg1 == 21) {
            this.field884 = 0;
        } else if (arg1 == 22) {
            this.field903 = true;
        } else if (arg1 == 23) {
            this.field907 = true;
        } else if (arg1 == 24) {
            this.field889 = arg0.method2541();
            if (this.field889 == 65535) {
                this.field889 = -1;
            }
        } else if (arg1 == 27) {
            this.field899 = 1;
        } else if (arg1 == 28) {
            this.field906 = arg0.method2562();
        } else if (arg1 == 29) {
            this.field890 = arg0.method2382();
        } else if (arg1 == 39) {
            this.field908 = arg0.method2382() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field909[arg1 - 30] = arg0.method2389();
            if (this.field909[arg1 - 30].equalsIgnoreCase(class157.field2286)) {
                this.field909[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2562();
            this.field893 = new short[var7];
            this.field894 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field893[var8] = (short) arg0.method2541();
                this.field894[var8] = (short) arg0.method2541();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2562();
            this.field895 = new short[var9];
            this.field896 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field895[var10] = (short) arg0.method2541();
                this.field896[var10] = (short) arg0.method2541();
            }
        } else if (arg1 == 60) {
            this.field910 = arg0.method2541();
        } else if (arg1 == 62) {
            this.field912 = true;
        } else if (arg1 == 64) {
            this.field913 = false;
        } else if (arg1 == 65) {
            this.field918 = arg0.method2541();
        } else if (arg1 == 66) {
            this.field915 = arg0.method2541();
        } else if (arg1 == 67) {
            this.field933 = arg0.method2541();
        } else if (arg1 == 68) {
            this.field911 = arg0.method2541();
        } else if (arg1 == 69) {
            arg0.method2562();
        } else if (arg1 == 70) {
            this.field917 = arg0.method2384();
        } else if (arg1 == 71) {
            this.field916 = arg0.method2384();
        } else if (arg1 == 72) {
            this.field919 = arg0.method2384();
        } else if (arg1 == 73) {
            this.field920 = true;
        } else if (arg1 == 74) {
            this.field921 = true;
        } else if (arg1 == 75) {
            this.field922 = arg0.method2562();
        } else if (arg1 == 77) {
            this.field924 = arg0.method2541();
            if (this.field924 == 65535) {
                this.field924 = -1;
            }
            this.field926 = arg0.method2541();
            if (this.field926 == 65535) {
                this.field926 = -1;
            }
            int var11 = arg0.method2562();
            this.field923 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field923[var12] = arg0.method2541();
                if (this.field923[var12] == 65535) {
                    this.field923[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field914 = arg0.method2541();
            this.field897 = arg0.method2562();
        } else if (arg1 == 79) {
            this.field928 = arg0.method2541();
            this.field929 = arg0.method2541();
            this.field897 = arg0.method2562();
            int var13 = arg0.method2562();
            this.field905 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field905[var14] = arg0.method2541();
            }
        } else if (arg1 == 81) {
            this.field884 = arg0.method2562() * 256;
        }
    }

    @ObfuscatedName("az.j(II)Z")
    public final boolean method815(int arg0) {
        if (this.field891 != null) {
            for (int var4 = 0; var4 < this.field891.length; var4++) {
                if (this.field891[var4] == arg0) {
                    return Statics.field883.method3095(this.field925[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field925 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field925.length; var3++) {
                var2 &= Statics.field883.method3095(this.field925[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("az.i(I)Z")
    public final boolean method818() {
        if (this.field925 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field925.length; var2++) {
            var1 &= Statics.field883.method3095(this.field925[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("az.x(II[[IIIII)Lcv;")
    public final class85 method812(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field891 == null) {
            var7 = (long) ((this.field931 << 10) + arg1);
        } else {
            var7 = (long) ((this.field931 << 10) + (arg0 << 3) + arg1);
        }
        class85 var9 = (class85) field886.method3537(var7);
        if (var9 == null) {
            class100 var10 = this.method820(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field903) {
                var10.field1676 = (short) (this.field890 + 64);
                var10.field1677 = (short) (this.field908 + 768);
                var10.method2111();
                var9 = var10;
            } else {
                var9 = var10.method2114(this.field890 + 64, this.field908 + 768, -50, -10, -50);
            }
            field886.method3539(var9, var7);
        }
        if (this.field903) {
            var9 = ((class100) var9).method2098();
        }
        if (this.field884 >= 0) {
            if (var9 instanceof class105) {
                var9 = ((class105) var9).method2185(arg2, arg3, arg4, arg5, true, this.field884);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2099(arg2, arg3, arg4, arg5, true, this.field884);
            }
        }
        return var9;
    }

    @ObfuscatedName("az.g(II[[IIIII)Ldb;")
    public final class105 method833(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field891 == null) {
            var7 = (long) ((this.field931 << 10) + arg1);
        } else {
            var7 = (long) ((this.field931 << 10) + (arg0 << 3) + arg1);
        }
        class105 var9 = (class105) field887.method3537(var7);
        if (var9 == null) {
            class100 var10 = this.method820(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2114(this.field890 + 64, this.field908 + 768, -50, -10, -50);
            field887.method3539(var9, var7);
        }
        if (this.field884 >= 0) {
            var9 = var9.method2185(arg2, arg3, arg4, arg5, true, this.field884);
        }
        return var9;
    }

    @ObfuscatedName("az.e(II[[IIIILaf;II)Ldb;")
    public final class105 method819(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field891 == null) {
            var9 = (long) ((this.field931 << 10) + arg1);
        } else {
            var9 = (long) ((this.field931 << 10) + (arg0 << 3) + arg1);
        }
        class105 var11 = (class105) field887.method3537(var9);
        if (var11 == null) {
            class100 var12 = this.method820(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2114(this.field890 + 64, this.field908 + 768, -50, -10, -50);
            field887.method3539(var11, var9);
        }
        if (arg6 == null && this.field884 == -1) {
            return var11;
        }
        class105 var13;
        if (arg6 == null) {
            var13 = var11.method2203(true);
        } else {
            var13 = arg6.method883(var11, arg7, arg1);
        }
        if (this.field884 >= 0) {
            var13 = var13.method2185(arg2, arg3, arg4, arg5, false, this.field884);
        }
        return var13;
    }

    @ObfuscatedName("az.p(III)Lcy;")
    public final class100 method820(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field891 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field925 == null) {
                return null;
            }
            boolean var4 = this.field912;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field925.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field925[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field885.method3537((long) var7);
                if (var3 == null) {
                    var3 = class100.method2097(Statics.field883, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2108();
                    }
                    field885.method3539(var3, (long) var7);
                }
                if (var5 > 1) {
                    field888[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field888, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field891.length; var9++) {
                if (this.field891[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field925[var8];
            boolean var11 = this.field912 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field885.method3537((long) var10);
            if (var3 == null) {
                var3 = class100.method2097(Statics.field883, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2108();
                }
                field885.method3539(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field918 == 128 && this.field915 == 128 && this.field933 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field917 == 0 && this.field916 == 0 && this.field919 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field893 == null, this.field895 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2104(256);
            var14.method2105(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2101();
        } else if (var15 == 2) {
            var14.method2102();
        } else if (var15 == 3) {
            var14.method2103();
        }
        if (this.field893 != null) {
            for (int var16 = 0; var16 < this.field893.length; var16++) {
                var14.method2106(this.field893[var16], this.field894[var16]);
            }
        }
        if (this.field895 != null) {
            for (int var17 = 0; var17 < this.field895.length; var17++) {
                var14.method2107(this.field895[var17], this.field896[var17]);
            }
        }
        if (var12) {
            var14.method2109(this.field918, this.field915, this.field933);
        }
        if (var13) {
            var14.method2105(this.field917, this.field916, this.field919);
        }
        return var14;
    }

    @ObfuscatedName("az.a(B)Laz;")
    public final class41 method832() {
        int var1 = -1;
        if (this.field924 != -1) {
            var1 = class176.method2171(this.field924);
        } else if (this.field926 != -1) {
            var1 = class176.field2878[this.field926];
        }
        return var1 < 0 || var1 >= this.field923.length || this.field923[var1] == -1 ? null : method85(this.field923[var1]);
    }

    @ObfuscatedName("t.v(I)V")
    public static void method654() {
        field882.method3540();
        field885.method3540();
        field886.method3540();
        field887.method3540();
    }

    @ObfuscatedName("az.c(I)Z")
    public boolean method846() {
        if (this.field923 == null) {
            return this.field914 != -1 || this.field905 != null;
        }
        for (int var1 = 0; var1 < this.field923.length; var1++) {
            if (this.field923[var1] != -1) {
                class41 var2 = method85(this.field923[var1]);
                if (var2.field914 != -1 || var2.field905 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
