package deob;

@ObfuscatedName("ab")
public class class40 extends class204 {

    @ObfuscatedName("ab.u")
    public static class193 field897 = new class193(64);

    @ObfuscatedName("ab.b")
    public static class193 field880 = new class193(50);

    @ObfuscatedName("ab.p")
    public int field881;

    @ObfuscatedName("ab.s")
    public String field882 = "null";

    @ObfuscatedName("ab.y")
    public int field895 = 1;

    @ObfuscatedName("ab.t")
    public int[] field886;

    @ObfuscatedName("ab.w")
    public int[] field893;

    @ObfuscatedName("ab.h")
    public int field885 = -1;

    @ObfuscatedName("ab.d")
    public int field887 = -1;

    @ObfuscatedName("ab.l")
    public int field888 = -1;

    @ObfuscatedName("ab.n")
    public int field889 = -1;

    @ObfuscatedName("ab.q")
    public int field890 = -1;

    @ObfuscatedName("ab.f")
    public int field891 = -1;

    @ObfuscatedName("ab.v")
    public int field892 = -1;

    @ObfuscatedName("ab.a")
    public short[] field914;

    @ObfuscatedName("ab.k")
    public short[] field894;

    @ObfuscatedName("ab.r")
    public short[] field884;

    @ObfuscatedName("ab.i")
    public short[] field896;

    @ObfuscatedName("ab.j")
    public String[] field916 = new String[5];

    @ObfuscatedName("ab.z")
    public boolean field898 = true;

    @ObfuscatedName("ab.m")
    public int field899 = -1;

    @ObfuscatedName("ab.g")
    public int field912 = 128;

    @ObfuscatedName("ab.c")
    public int field901 = 128;

    @ObfuscatedName("ab.x")
    public boolean field878 = false;

    @ObfuscatedName("ab.ah")
    public int field903 = 0;

    @ObfuscatedName("ab.ap")
    public int field904 = 0;

    @ObfuscatedName("ab.aa")
    public int field905 = -1;

    @ObfuscatedName("ab.ay")
    public int field906 = 32;

    @ObfuscatedName("ab.ak")
    public int[] field907;

    @ObfuscatedName("ab.an")
    public int field908 = -1;

    @ObfuscatedName("ab.af")
    public int field909 = -1;

    @ObfuscatedName("ab.ao")
    public boolean field883 = true;

    @ObfuscatedName("ab.as")
    public boolean field911 = true;

    @ObfuscatedName("ab.am")
    public boolean field910 = false;

    @ObfuscatedName("ab.ae")
    public int field913 = 30;

    @ObfuscatedName("f.o(Lfq;Lfq;I)V")
    public static void method171(class167 arg0, class167 arg1) {
        Statics.field3152 = arg0;
        Statics.field879 = arg1;
    }

    @ObfuscatedName("gk.e(II)Lab;")
    public static class40 method3484(int arg0) {
        class40 var1 = (class40) field897.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3152.method3057(9, arg0);
        class40 var3 = new class40();
        var3.field881 = arg0;
        if (var2 != null) {
            var3.method754(new class119(var2));
        }
        var3.method753();
        field897.method3512(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.u(I)V")
    public void method753() {
    }

    @ObfuscatedName("ab.b(Ldi;I)V")
    public void method754(class119 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method755(arg0, var2);
        }
    }

    @ObfuscatedName("ab.p(Ldi;II)V")
    public void method755(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2427();
            this.field886 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field886[var4] = arg0.method2339();
            }
        } else if (arg1 == 2) {
            this.field882 = arg0.method2528();
        } else if (arg1 == 12) {
            this.field895 = arg0.method2427();
        } else if (arg1 == 13) {
            this.field885 = arg0.method2339();
        } else if (arg1 == 14) {
            this.field889 = arg0.method2339();
        } else if (arg1 == 15) {
            this.field887 = arg0.method2339();
        } else if (arg1 == 16) {
            this.field888 = arg0.method2339();
        } else if (arg1 == 17) {
            this.field889 = arg0.method2339();
            this.field890 = arg0.method2339();
            this.field891 = arg0.method2339();
            this.field892 = arg0.method2339();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field916[arg1 - 30] = arg0.method2528();
            if (this.field916[arg1 - 30].equalsIgnoreCase(class157.field2334)) {
                this.field916[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2427();
            this.field914 = new short[var5];
            this.field894 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field914[var6] = (short) arg0.method2339();
                this.field894[var6] = (short) arg0.method2339();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2427();
            this.field884 = new short[var7];
            this.field896 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field884[var8] = (short) arg0.method2339();
                this.field896[var8] = (short) arg0.method2339();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2427();
            this.field893 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field893[var10] = arg0.method2339();
            }
        } else if (arg1 == 93) {
            this.field898 = false;
        } else if (arg1 == 95) {
            this.field899 = arg0.method2339();
        } else if (arg1 == 97) {
            this.field912 = arg0.method2339();
        } else if (arg1 == 98) {
            this.field901 = arg0.method2339();
        } else if (arg1 == 99) {
            this.field878 = true;
        } else if (arg1 == 100) {
            this.field903 = arg0.method2338();
        } else if (arg1 == 101) {
            this.field904 = arg0.method2338();
        } else if (arg1 == 102) {
            this.field905 = arg0.method2339();
        } else if (arg1 == 103) {
            this.field906 = arg0.method2339();
        } else if (arg1 == 106) {
            this.field908 = arg0.method2339();
            if (this.field908 == 65535) {
                this.field908 = -1;
            }
            this.field909 = arg0.method2339();
            if (this.field909 == 65535) {
                this.field909 = -1;
            }
            int var11 = arg0.method2427();
            this.field907 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field907[var12] = arg0.method2339();
                if (this.field907[var12] == 65535) {
                    this.field907[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field883 = false;
        } else if (arg1 == 109) {
            this.field911 = false;
        } else if (arg1 == 111) {
            this.field910 = true;
        } else if (arg1 == 112) {
            this.field913 = arg0.method2427();
        }
    }

    @ObfuscatedName("ab.s(Lac;ILac;IB)Ldk;")
    public final class105 method770(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field907 != null) {
            class40 var5 = this.method758();
            return var5 == null ? null : var5.method770(arg0, arg1, arg2, arg3);
        }
        class105 var6 = (class105) field880.method3510((long) this.field881);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field886.length; var8++) {
                if (!Statics.field879.method3122(this.field886[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field886.length];
            for (int var10 = 0; var10 < this.field886.length; var10++) {
                var9[var10] = class100.method2040(Statics.field879, this.field886[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field914 != null) {
                for (int var12 = 0; var12 < this.field914.length; var12++) {
                    var11.method2062(this.field914[var12], this.field894[var12]);
                }
            }
            if (this.field884 != null) {
                for (int var13 = 0; var13 < this.field884.length; var13++) {
                    var11.method2052(this.field884[var13], this.field896[var13]);
                }
            }
            var6 = var11.method2059(this.field903 + 64, this.field904 * 5 + 850, -30, -50, -30);
            field880.method3512(var6, (long) this.field881);
        }
        class105 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method872(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method846(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2189(true);
        } else {
            var14 = arg2.method846(var6, arg3);
        }
        if (this.field912 != 128 || this.field901 != 128) {
            var14.method2136(this.field912, this.field901, this.field912);
        }
        return var14;
    }

    @ObfuscatedName("ab.y(S)Lcf;")
    public final class100 method760() {
        if (this.field907 != null) {
            class40 var1 = this.method758();
            return var1 == null ? null : var1.method760();
        } else if (this.field893 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field893.length; var3++) {
                if (!Statics.field879.method3122(this.field893[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field893.length];
            for (int var5 = 0; var5 < this.field893.length; var5++) {
                var4[var5] = class100.method2040(Statics.field879, this.field893[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field914 != null) {
                for (int var7 = 0; var7 < this.field914.length; var7++) {
                    var6.method2062(this.field914[var7], this.field894[var7]);
                }
            }
            if (this.field884 != null) {
                for (int var8 = 0; var8 < this.field884.length; var8++) {
                    var6.method2052(this.field884[var8], this.field896[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ab.t(I)Lab;")
    public final class40 method758() {
        int var1 = -1;
        if (this.field908 != -1) {
            var1 = class176.method2678(this.field908);
        } else if (this.field909 != -1) {
            var1 = class176.field2906[this.field909];
        }
        return var1 < 0 || var1 >= this.field907.length || this.field907[var1] == -1 ? null : method3484(this.field907[var1]);
    }

    @ObfuscatedName("ab.w(I)Z")
    public boolean method759() {
        if (this.field907 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field908 != -1) {
            var1 = class176.method2678(this.field908);
        } else if (this.field909 != -1) {
            var1 = class176.field2906[this.field909];
        }
        return var1 >= 0 && var1 < this.field907.length && this.field907[var1] != -1;
    }

    @ObfuscatedName("aj.h(I)V")
    public static void method750() {
        field897.method3522();
        field880.method3522();
    }
}
