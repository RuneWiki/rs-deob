package deob;

@ObfuscatedName("ac")
public class class40 extends class204 {

    @ObfuscatedName("ac.f")
    public static class193 field880 = new class193(64);

    @ObfuscatedName("ac.l")
    public static class193 field885 = new class193(50);

    @ObfuscatedName("ac.u")
    public int field870;

    @ObfuscatedName("ac.a")
    public String field871 = "null";

    @ObfuscatedName("ac.h")
    public int field872 = 1;

    @ObfuscatedName("ac.i")
    public int[] field876;

    @ObfuscatedName("ac.t")
    public int[] field874;

    @ObfuscatedName("ac.k")
    public int field873 = -1;

    @ObfuscatedName("ac.s")
    public int field867 = -1;

    @ObfuscatedName("ac.w")
    public int field868 = -1;

    @ObfuscatedName("ac.e")
    public int field878 = -1;

    @ObfuscatedName("ac.z")
    public int field905 = -1;

    @ObfuscatedName("ac.p")
    public int field897 = -1;

    @ObfuscatedName("ac.r")
    public int field881 = -1;

    @ObfuscatedName("ac.g")
    public short[] field869;

    @ObfuscatedName("ac.n")
    public short[] field883;

    @ObfuscatedName("ac.y")
    public short[] field884;

    @ObfuscatedName("ac.v")
    public short[] field901;

    @ObfuscatedName("ac.q")
    public String[] field886 = new String[5];

    @ObfuscatedName("ac.x")
    public boolean field887 = true;

    @ObfuscatedName("ac.d")
    public int field888 = -1;

    @ObfuscatedName("ac.o")
    public int field889 = 128;

    @ObfuscatedName("ac.c")
    public int field877 = 128;

    @ObfuscatedName("ac.b")
    public boolean field891 = false;

    @ObfuscatedName("ac.aa")
    public int field892 = 0;

    @ObfuscatedName("ac.ao")
    public int field893 = 0;

    @ObfuscatedName("ac.as")
    public int field894 = -1;

    @ObfuscatedName("ac.ae")
    public int field895 = 32;

    @ObfuscatedName("ac.ai")
    public int[] field896;

    @ObfuscatedName("ac.am")
    public int field875 = -1;

    @ObfuscatedName("ac.ax")
    public int field898 = -1;

    @ObfuscatedName("ac.ay")
    public boolean field882 = true;

    @ObfuscatedName("ac.az")
    public boolean field900 = true;

    @ObfuscatedName("ac.av")
    public boolean field899 = false;

    @ObfuscatedName("ac.ap")
    public int field902 = 30;

    @ObfuscatedName("dt.j(Lfa;Lfa;I)V")
    public static void method2252(class167 arg0, class167 arg1) {
        Statics.field904 = arg0;
        Statics.field2896 = arg1;
    }

    @ObfuscatedName("d.m(II)Lac;")
    public static class40 method609(int arg0) {
        class40 var1 = (class40) field880.method3543((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field904.method3124(9, arg0);
        class40 var3 = new class40();
        var3.field870 = arg0;
        if (var2 != null) {
            var3.method775(new class119(var2));
        }
        var3.method806();
        field880.method3540(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.f(B)V")
    public void method806() {
    }

    @ObfuscatedName("ac.l(Ldc;I)V")
    public void method775(class119 arg0) {
        while (true) {
            int var2 = arg0.method2372();
            if (var2 == 0) {
                return;
            }
            this.method776(arg0, var2);
        }
    }

    @ObfuscatedName("ac.u(Ldc;IB)V")
    public void method776(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2372();
            this.field876 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field876[var4] = arg0.method2374();
            }
        } else if (arg1 == 2) {
            this.field871 = arg0.method2380();
        } else if (arg1 == 12) {
            this.field872 = arg0.method2372();
        } else if (arg1 == 13) {
            this.field873 = arg0.method2374();
        } else if (arg1 == 14) {
            this.field878 = arg0.method2374();
        } else if (arg1 == 15) {
            this.field867 = arg0.method2374();
        } else if (arg1 == 16) {
            this.field868 = arg0.method2374();
        } else if (arg1 == 17) {
            this.field878 = arg0.method2374();
            this.field905 = arg0.method2374();
            this.field897 = arg0.method2374();
            this.field881 = arg0.method2374();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field886[arg1 - 30] = arg0.method2380();
            if (this.field886[arg1 - 30].equalsIgnoreCase(class157.field2300)) {
                this.field886[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2372();
            this.field869 = new short[var5];
            this.field883 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field869[var6] = (short) arg0.method2374();
                this.field883[var6] = (short) arg0.method2374();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2372();
            this.field884 = new short[var7];
            this.field901 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field884[var8] = (short) arg0.method2374();
                this.field901[var8] = (short) arg0.method2374();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2372();
            this.field874 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field874[var10] = arg0.method2374();
            }
        } else if (arg1 == 93) {
            this.field887 = false;
        } else if (arg1 == 95) {
            this.field888 = arg0.method2374();
        } else if (arg1 == 97) {
            this.field889 = arg0.method2374();
        } else if (arg1 == 98) {
            this.field877 = arg0.method2374();
        } else if (arg1 == 99) {
            this.field891 = true;
        } else if (arg1 == 100) {
            this.field892 = arg0.method2373();
        } else if (arg1 == 101) {
            this.field893 = arg0.method2373();
        } else if (arg1 == 102) {
            this.field894 = arg0.method2374();
        } else if (arg1 == 103) {
            this.field895 = arg0.method2374();
        } else if (arg1 == 106) {
            this.field875 = arg0.method2374();
            if (this.field875 == 65535) {
                this.field875 = -1;
            }
            this.field898 = arg0.method2374();
            if (this.field898 == 65535) {
                this.field898 = -1;
            }
            int var11 = arg0.method2372();
            this.field896 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field896[var12] = arg0.method2374();
                if (this.field896[var12] == 65535) {
                    this.field896[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field882 = false;
        } else if (arg1 == 109) {
            this.field900 = false;
        } else if (arg1 == 111) {
            this.field899 = true;
        } else if (arg1 == 112) {
            this.field902 = arg0.method2372();
        }
    }

    @ObfuscatedName("ac.a(Lak;ILak;II)Lda;")
    public final class105 method789(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field896 != null) {
            class40 var5 = this.method779();
            return var5 == null ? null : var5.method789(arg0, arg1, arg2, arg3);
        }
        class105 var6 = (class105) field885.method3543((long) this.field870);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field876.length; var8++) {
                if (!Statics.field2896.method3086(this.field876[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field876.length];
            for (int var10 = 0; var10 < this.field876.length; var10++) {
                var9[var10] = class100.method2063(Statics.field2896, this.field876[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field869 != null) {
                for (int var12 = 0; var12 < this.field869.length; var12++) {
                    var11.method2143(this.field869[var12], this.field883[var12]);
                }
            }
            if (this.field884 != null) {
                for (int var13 = 0; var13 < this.field884.length; var13++) {
                    var11.method2078(this.field884[var13], this.field901[var13]);
                }
            }
            var6 = var11.method2092(this.field892 + 64, this.field893 * 5 + 850, -30, -50, -30);
            field885.method3540(var6, (long) this.field870);
        }
        class105 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method884(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method871(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2209(true);
        } else {
            var14 = arg2.method871(var6, arg3);
        }
        if (this.field889 != 128 || this.field877 != 128) {
            var14.method2198(this.field889, this.field877, this.field889);
        }
        return var14;
    }

    @ObfuscatedName("ac.h(I)Lcy;")
    public final class100 method778() {
        if (this.field896 != null) {
            class40 var1 = this.method779();
            return var1 == null ? null : var1.method778();
        } else if (this.field874 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field874.length; var3++) {
                if (!Statics.field2896.method3086(this.field874[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field874.length];
            for (int var5 = 0; var5 < this.field874.length; var5++) {
                var4[var5] = class100.method2063(Statics.field2896, this.field874[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field869 != null) {
                for (int var7 = 0; var7 < this.field869.length; var7++) {
                    var6.method2143(this.field869[var7], this.field883[var7]);
                }
            }
            if (this.field884 != null) {
                for (int var8 = 0; var8 < this.field884.length; var8++) {
                    var6.method2078(this.field884[var8], this.field901[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ac.i(I)Lac;")
    public final class40 method779() {
        int var1 = -1;
        if (this.field875 != -1) {
            var1 = class176.method2999(this.field875);
        } else if (this.field898 != -1) {
            var1 = class176.field2885[this.field898];
        }
        return var1 < 0 || var1 >= this.field896.length || this.field896[var1] == -1 ? null : method609(this.field896[var1]);
    }

    @ObfuscatedName("ac.t(I)Z")
    public boolean method793() {
        if (this.field896 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field875 != -1) {
            var1 = class176.method2999(this.field875);
        } else if (this.field898 != -1) {
            var1 = class176.field2885[this.field898];
        }
        return var1 >= 0 && var1 < this.field896.length && this.field896[var1] != -1;
    }

    @ObfuscatedName("i.k(I)V")
    public static void method117() {
        field880.method3541();
        field885.method3541();
    }
}
