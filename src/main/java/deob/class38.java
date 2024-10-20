package deob;

@ObfuscatedName("ab")
public class class38 extends class198 {

    @ObfuscatedName("ab.z")
    public static class187 field864 = new class187(64);

    @ObfuscatedName("ab.l")
    public static class187 field865 = new class187(50);

    @ObfuscatedName("ab.w")
    public int field866;

    @ObfuscatedName("ab.d")
    public String field867 = "null";

    @ObfuscatedName("ab.f")
    public int field868 = 1;

    @ObfuscatedName("ab.i")
    public int[] field869;

    @ObfuscatedName("ab.a")
    public int[] field890;

    @ObfuscatedName("ab.o")
    public int field871 = -1;

    @ObfuscatedName("ab.u")
    public int field872 = -1;

    @ObfuscatedName("ab.m")
    public int field873 = -1;

    @ObfuscatedName("ab.e")
    public int field874 = -1;

    @ObfuscatedName("ab.v")
    public int field875 = -1;

    @ObfuscatedName("ab.r")
    public int field882 = -1;

    @ObfuscatedName("ab.t")
    public int field877 = -1;

    @ObfuscatedName("ab.g")
    public short[] field878;

    @ObfuscatedName("ab.s")
    public short[] field879;

    @ObfuscatedName("ab.n")
    public short[] field894;

    @ObfuscatedName("ab.h")
    public short[] field881;

    @ObfuscatedName("ab.p")
    public String[] field893 = new String[5];

    @ObfuscatedName("ab.c")
    public boolean field880 = true;

    @ObfuscatedName("ab.x")
    public int field899 = -1;

    @ObfuscatedName("ab.q")
    public int field885 = 128;

    @ObfuscatedName("ab.b")
    public int field886 = 128;

    @ObfuscatedName("ab.k")
    public boolean field887 = false;

    @ObfuscatedName("ab.at")
    public int field863 = 0;

    @ObfuscatedName("ab.au")
    public int field889 = 0;

    @ObfuscatedName("ab.aa")
    public int field870 = -1;

    @ObfuscatedName("ab.ak")
    public int field892 = 32;

    @ObfuscatedName("ab.an")
    public int[] field891;

    @ObfuscatedName("ab.ad")
    public int field888 = -1;

    @ObfuscatedName("ab.ap")
    public int field900 = -1;

    @ObfuscatedName("ab.ag")
    public boolean field895 = true;

    @ObfuscatedName("ab.aj")
    public boolean field896 = true;

    @ObfuscatedName("ab.av")
    public boolean field897 = false;

    @ObfuscatedName("ab.ar")
    public int field898 = 30;

    @ObfuscatedName("u.j(Lfh;Lfh;I)V")
    public static void method138(class161 arg0, class161 arg1) {
        Statics.field876 = arg0;
        Statics.field2073 = arg1;
    }

    @ObfuscatedName("h.y(II)Lab;")
    public static class38 method564(int arg0) {
        class38 var1 = (class38) field864.method3432((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field876.method2995(9, arg0);
        class38 var3 = new class38();
        var3.field866 = arg0;
        if (var2 != null) {
            var3.method737(new class114(var2));
        }
        var3.method733();
        field864.method3434(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.z(I)V")
    public void method733() {
    }

    @ObfuscatedName("ab.l(Lde;I)V")
    public void method737(class114 arg0) {
        while (true) {
            int var2 = arg0.method2322();
            if (var2 == 0) {
                return;
            }
            this.method735(arg0, var2);
        }
    }

    @ObfuscatedName("ab.w(Lde;II)V")
    public void method735(class114 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2322();
            this.field869 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field869[var4] = arg0.method2324();
            }
        } else if (arg1 == 2) {
            this.field867 = arg0.method2440();
        } else if (arg1 == 12) {
            this.field868 = arg0.method2322();
        } else if (arg1 == 13) {
            this.field871 = arg0.method2324();
        } else if (arg1 == 14) {
            this.field874 = arg0.method2324();
        } else if (arg1 == 15) {
            this.field872 = arg0.method2324();
        } else if (arg1 == 16) {
            this.field873 = arg0.method2324();
        } else if (arg1 == 17) {
            this.field874 = arg0.method2324();
            this.field875 = arg0.method2324();
            this.field882 = arg0.method2324();
            this.field877 = arg0.method2324();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field893[arg1 - 30] = arg0.method2440();
            if (this.field893[arg1 - 30].equalsIgnoreCase(class151.field2231)) {
                this.field893[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2322();
            this.field878 = new short[var5];
            this.field879 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field878[var6] = (short) arg0.method2324();
                this.field879[var6] = (short) arg0.method2324();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2322();
            this.field894 = new short[var7];
            this.field881 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field894[var8] = (short) arg0.method2324();
                this.field881[var8] = (short) arg0.method2324();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2322();
            this.field890 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field890[var10] = arg0.method2324();
            }
        } else if (arg1 == 93) {
            this.field880 = false;
        } else if (arg1 == 95) {
            this.field899 = arg0.method2324();
        } else if (arg1 == 97) {
            this.field885 = arg0.method2324();
        } else if (arg1 == 98) {
            this.field886 = arg0.method2324();
        } else if (arg1 == 99) {
            this.field887 = true;
        } else if (arg1 == 100) {
            this.field863 = arg0.method2323();
        } else if (arg1 == 101) {
            this.field889 = arg0.method2323();
        } else if (arg1 == 102) {
            this.field870 = arg0.method2324();
        } else if (arg1 == 103) {
            this.field892 = arg0.method2324();
        } else if (arg1 == 106) {
            this.field888 = arg0.method2324();
            if (this.field888 == 65535) {
                this.field888 = -1;
            }
            this.field900 = arg0.method2324();
            if (this.field900 == 65535) {
                this.field900 = -1;
            }
            int var11 = arg0.method2322();
            this.field891 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field891[var12] = arg0.method2324();
                if (this.field891[var12] == 65535) {
                    this.field891[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field895 = false;
        } else if (arg1 == 109) {
            this.field896 = false;
        } else if (arg1 == 111) {
            this.field897 = true;
        } else if (arg1 == 112) {
            this.field898 = arg0.method2322();
        }
    }

    @ObfuscatedName("ab.d(Lax;ILax;IB)Lcw;")
    public final class103 method748(class41 arg0, int arg1, class41 arg2, int arg3) {
        if (this.field891 != null) {
            class38 var5 = this.method742();
            return var5 == null ? null : var5.method748(arg0, arg1, arg2, arg3);
        }
        class103 var6 = (class103) field865.method3432((long) this.field866);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field869.length; var8++) {
                if (!Statics.field2073.method2981(this.field869[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class98[] var9 = new class98[this.field869.length];
            for (int var10 = 0; var10 < this.field869.length; var10++) {
                var9[var10] = class98.method2092(Statics.field2073, this.field869[var10], 0);
            }
            class98 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class98(var9, var9.length);
            }
            if (this.field878 != null) {
                for (int var12 = 0; var12 < this.field878.length; var12++) {
                    var11.method2140(this.field878[var12], this.field879[var12]);
                }
            }
            if (this.field894 != null) {
                for (int var13 = 0; var13 < this.field894.length; var13++) {
                    var11.method2087(this.field894[var13], this.field881[var13]);
                }
            }
            var6 = var11.method2094(this.field863 + 64, this.field889 * 5 + 850, -30, -50, -30);
            field865.method3434(var6, (long) this.field866);
        }
        class103 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method854(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method851(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2167(true);
        } else {
            var14 = arg2.method851(var6, arg3);
        }
        if (this.field885 != 128 || this.field886 != 128) {
            var14.method2201(this.field885, this.field886, this.field885);
        }
        return var14;
    }

    @ObfuscatedName("ab.f(I)Lcd;")
    public final class98 method736() {
        if (this.field891 != null) {
            class38 var1 = this.method742();
            return var1 == null ? null : var1.method736();
        } else if (this.field890 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field890.length; var3++) {
                if (!Statics.field2073.method2981(this.field890[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class98[] var4 = new class98[this.field890.length];
            for (int var5 = 0; var5 < this.field890.length; var5++) {
                var4[var5] = class98.method2092(Statics.field2073, this.field890[var5], 0);
            }
            class98 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class98(var4, var4.length);
            }
            if (this.field878 != null) {
                for (int var7 = 0; var7 < this.field878.length; var7++) {
                    var6.method2140(this.field878[var7], this.field879[var7]);
                }
            }
            if (this.field894 != null) {
                for (int var8 = 0; var8 < this.field894.length; var8++) {
                    var6.method2087(this.field894[var8], this.field881[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ab.i(I)Lab;")
    public final class38 method742() {
        int var1 = -1;
        if (this.field888 != -1) {
            var1 = class170.method2874(this.field888);
        } else if (this.field900 != -1) {
            var1 = class170.field2823[this.field900];
        }
        return var1 < 0 || var1 >= this.field891.length || this.field891[var1] == -1 ? null : method564(this.field891[var1]);
    }

    @ObfuscatedName("ab.a(I)Z")
    public boolean method738() {
        if (this.field891 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field888 != -1) {
            var1 = class170.method2874(this.field888);
        } else if (this.field900 != -1) {
            var1 = class170.field2823[this.field900];
        }
        return var1 >= 0 && var1 < this.field891.length && this.field891[var1] != -1;
    }
}
