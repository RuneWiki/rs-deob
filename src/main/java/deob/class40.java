package deob;

@ObfuscatedName("ao")
public class class40 extends class204 {

    @ObfuscatedName("ao.c")
    public static class193 field878 = new class193(64);

    @ObfuscatedName("ao.l")
    public static class193 field912 = new class193(50);

    @ObfuscatedName("ao.r")
    public int field877;

    @ObfuscatedName("ao.u")
    public String field881 = "null";

    @ObfuscatedName("ao.j")
    public int field882 = 1;

    @ObfuscatedName("ao.w")
    public int[] field883;

    @ObfuscatedName("ao.y")
    public int[] field890;

    @ObfuscatedName("ao.o")
    public int field885 = -1;

    @ObfuscatedName("ao.h")
    public int field897 = -1;

    @ObfuscatedName("ao.e")
    public int field887 = -1;

    @ObfuscatedName("ao.v")
    public int field888 = -1;

    @ObfuscatedName("ao.p")
    public int field879 = -1;

    @ObfuscatedName("ao.m")
    public int field889 = -1;

    @ObfuscatedName("ao.b")
    public int field891 = -1;

    @ObfuscatedName("ao.s")
    public short[] field892;

    @ObfuscatedName("ao.x")
    public short[] field893;

    @ObfuscatedName("ao.z")
    public short[] field894;

    @ObfuscatedName("ao.d")
    public short[] field895;

    @ObfuscatedName("ao.a")
    public String[] field896 = new String[5];

    @ObfuscatedName("ao.t")
    public boolean field906 = true;

    @ObfuscatedName("ao.k")
    public int field898 = -1;

    @ObfuscatedName("ao.f")
    public int field899 = 128;

    @ObfuscatedName("ao.g")
    public int field900 = 128;

    @ObfuscatedName("ao.i")
    public boolean field905 = false;

    @ObfuscatedName("ao.ah")
    public int field902 = 0;

    @ObfuscatedName("ao.ag")
    public int field903 = 0;

    @ObfuscatedName("ao.ac")
    public int field904 = -1;

    @ObfuscatedName("ao.al")
    public int field911 = 32;

    @ObfuscatedName("ao.aj")
    public int[] field901;

    @ObfuscatedName("ao.at")
    public int field907 = -1;

    @ObfuscatedName("ao.ap")
    public int field908 = -1;

    @ObfuscatedName("ao.aa")
    public boolean field909 = true;

    @ObfuscatedName("ao.ak")
    public boolean field910 = true;

    @ObfuscatedName("ao.an")
    public boolean field880 = false;

    @ObfuscatedName("ao.au")
    public int field884 = 30;

    @ObfuscatedName("b.n(II)Lao;")
    public static class40 method177(int arg0) {
        class40 var1 = (class40) field878.method3475((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field886.method3094(9, arg0);
        class40 var3 = new class40();
        var3.field877 = arg0;
        if (var2 != null) {
            var3.method766(new class119(var2));
        }
        var3.method767();
        field878.method3488(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.q(B)V")
    public void method767() {
    }

    @ObfuscatedName("ao.c(Ldc;I)V")
    public void method766(class119 arg0) {
        while (true) {
            int var2 = arg0.method2360();
            if (var2 == 0) {
                return;
            }
            this.method769(arg0, var2);
        }
    }

    @ObfuscatedName("ao.l(Ldc;IB)V")
    public void method769(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2360();
            this.field883 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field883[var4] = arg0.method2430();
            }
        } else if (arg1 == 2) {
            this.field881 = arg0.method2368();
        } else if (arg1 == 12) {
            this.field882 = arg0.method2360();
        } else if (arg1 == 13) {
            this.field885 = arg0.method2430();
        } else if (arg1 == 14) {
            this.field888 = arg0.method2430();
        } else if (arg1 == 15) {
            this.field897 = arg0.method2430();
        } else if (arg1 == 16) {
            this.field887 = arg0.method2430();
        } else if (arg1 == 17) {
            this.field888 = arg0.method2430();
            this.field879 = arg0.method2430();
            this.field889 = arg0.method2430();
            this.field891 = arg0.method2430();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field896[arg1 - 30] = arg0.method2368();
            if (this.field896[arg1 - 30].equalsIgnoreCase(class157.field2302)) {
                this.field896[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2360();
            this.field892 = new short[var5];
            this.field893 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field892[var6] = (short) arg0.method2430();
                this.field893[var6] = (short) arg0.method2430();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2360();
            this.field894 = new short[var7];
            this.field895 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field894[var8] = (short) arg0.method2430();
                this.field895[var8] = (short) arg0.method2430();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2360();
            this.field890 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field890[var10] = arg0.method2430();
            }
        } else if (arg1 == 93) {
            this.field906 = false;
        } else if (arg1 == 95) {
            this.field898 = arg0.method2430();
        } else if (arg1 == 97) {
            this.field899 = arg0.method2430();
        } else if (arg1 == 98) {
            this.field900 = arg0.method2430();
        } else if (arg1 == 99) {
            this.field905 = true;
        } else if (arg1 == 100) {
            this.field902 = arg0.method2512();
        } else if (arg1 == 101) {
            this.field903 = arg0.method2512() * 5;
        } else if (arg1 == 102) {
            this.field904 = arg0.method2430();
        } else if (arg1 == 103) {
            this.field911 = arg0.method2430();
        } else if (arg1 == 106) {
            this.field907 = arg0.method2430();
            if (this.field907 == 65535) {
                this.field907 = -1;
            }
            this.field908 = arg0.method2430();
            if (this.field908 == 65535) {
                this.field908 = -1;
            }
            int var11 = arg0.method2360();
            this.field901 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field901[var12] = arg0.method2430();
                if (this.field901[var12] == 65535) {
                    this.field901[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field909 = false;
        } else if (arg1 == 109) {
            this.field910 = false;
        } else if (arg1 == 111) {
            this.field880 = true;
        } else if (arg1 == 112) {
            this.field884 = arg0.method2360();
        }
    }

    @ObfuscatedName("ao.r(Laf;ILaf;IB)Ldt;")
    public final class105 method770(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field901 != null) {
            class40 var5 = this.method772();
            return var5 == null ? null : var5.method770(arg0, arg1, arg2, arg3);
        }
        class105 var6 = (class105) field912.method3475((long) this.field877);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field883.length; var8++) {
                if (!Statics.field876.method3022(this.field883[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field883.length];
            for (int var10 = 0; var10 < this.field883.length; var10++) {
                var9[var10] = class100.method2075(Statics.field876, this.field883[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field892 != null) {
                for (int var12 = 0; var12 < this.field892.length; var12++) {
                    var11.method2085(this.field892[var12], this.field893[var12]);
                }
            }
            if (this.field894 != null) {
                for (int var13 = 0; var13 < this.field894.length; var13++) {
                    var11.method2124(this.field894[var13], this.field895[var13]);
                }
            }
            var6 = var11.method2079(this.field902 + 64, this.field903 + 850, -30, -50, -30);
            field912.method3488(var6, (long) this.field877);
        }
        class105 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method863(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method869(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2173(true);
        } else {
            var14 = arg2.method869(var6, arg3);
        }
        if (this.field899 != 128 || this.field900 != 128) {
            var14.method2174(this.field899, this.field900, this.field899);
        }
        return var14;
    }

    @ObfuscatedName("ao.u(S)Lcg;")
    public final class100 method795() {
        if (this.field901 != null) {
            class40 var1 = this.method772();
            return var1 == null ? null : var1.method795();
        } else if (this.field890 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field890.length; var3++) {
                if (!Statics.field876.method3022(this.field890[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field890.length];
            for (int var5 = 0; var5 < this.field890.length; var5++) {
                var4[var5] = class100.method2075(Statics.field876, this.field890[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field892 != null) {
                for (int var7 = 0; var7 < this.field892.length; var7++) {
                    var6.method2085(this.field892[var7], this.field893[var7]);
                }
            }
            if (this.field894 != null) {
                for (int var8 = 0; var8 < this.field894.length; var8++) {
                    var6.method2124(this.field894[var8], this.field895[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ao.j(S)Lao;")
    public final class40 method772() {
        int var1 = -1;
        if (this.field907 != -1) {
            var1 = class176.method2038(this.field907);
        } else if (this.field908 != -1) {
            var1 = class176.field2896[this.field908];
        }
        return var1 < 0 || var1 >= this.field901.length || this.field901[var1] == -1 ? null : method177(this.field901[var1]);
    }

    @ObfuscatedName("ao.w(I)Z")
    public boolean method787() {
        if (this.field901 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field907 != -1) {
            var1 = class176.method2038(this.field907);
        } else if (this.field908 != -1) {
            var1 = class176.field2896[this.field908];
        }
        return var1 >= 0 && var1 < this.field901.length && this.field901[var1] != -1;
    }
}
