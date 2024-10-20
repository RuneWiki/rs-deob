package deob;

@ObfuscatedName("aj")
public class class42 extends class208 {

    @ObfuscatedName("aj.t")
    public static class197 field871 = new class197(64);

    @ObfuscatedName("aj.y")
    public static class197 field904 = new class197(50);

    @ObfuscatedName("aj.p")
    public int field881;

    @ObfuscatedName("aj.g")
    public String field873 = "null";

    @ObfuscatedName("aj.m")
    public int field903 = 1;

    @ObfuscatedName("aj.f")
    public int[] field882;

    @ObfuscatedName("aj.k")
    public int[] field876;

    @ObfuscatedName("aj.h")
    public int field877 = -1;

    @ObfuscatedName("aj.r")
    public int field878 = -1;

    @ObfuscatedName("aj.w")
    public int field879 = -1;

    @ObfuscatedName("aj.u")
    public int field900 = -1;

    @ObfuscatedName("aj.n")
    public int field880 = -1;

    @ObfuscatedName("aj.d")
    public int field889 = -1;

    @ObfuscatedName("aj.a")
    public int field883 = -1;

    @ObfuscatedName("aj.b")
    public short[] field884;

    @ObfuscatedName("aj.q")
    public short[] field885;

    @ObfuscatedName("aj.o")
    public short[] field886;

    @ObfuscatedName("aj.c")
    public short[] field887;

    @ObfuscatedName("aj.i")
    public String[] field906 = new String[5];

    @ObfuscatedName("aj.x")
    public boolean field869 = true;

    @ObfuscatedName("aj.v")
    public int field890 = -1;

    @ObfuscatedName("aj.l")
    public int field891 = 128;

    @ObfuscatedName("aj.e")
    public int field892 = 128;

    @ObfuscatedName("aj.j")
    public boolean field868 = false;

    @ObfuscatedName("aj.ae")
    public int field894 = 0;

    @ObfuscatedName("aj.ah")
    public int field895 = 0;

    @ObfuscatedName("aj.am")
    public int field896 = -1;

    @ObfuscatedName("aj.aa")
    public int field897 = 32;

    @ObfuscatedName("aj.ax")
    public int[] field898;

    @ObfuscatedName("aj.ac")
    public int field899 = -1;

    @ObfuscatedName("aj.ar")
    public int field893 = -1;

    @ObfuscatedName("aj.an")
    public boolean field901 = true;

    @ObfuscatedName("aj.ag")
    public boolean field902 = true;

    @ObfuscatedName("aj.ab")
    public boolean field875 = false;

    @ObfuscatedName("dg.s(IB)Laj;")
    public static class42 method2674(int arg0) {
        class42 var1 = (class42) field871.method3523((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field870.method3091(9, arg0);
        class42 var3 = new class42();
        var3.field881 = arg0;
        if (var2 != null) {
            var3.method771(new class123(var2));
        }
        var3.method777();
        field871.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.z(I)V")
    public void method777() {
    }

    @ObfuscatedName("aj.t(Ldy;B)V")
    public void method771(class123 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method772(arg0, var2);
        }
    }

    @ObfuscatedName("aj.y(Ldy;IB)V")
    public void method772(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2363();
            this.field882 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field882[var4] = arg0.method2550();
            }
        } else if (arg1 == 2) {
            this.field873 = arg0.method2385();
        } else if (arg1 == 12) {
            this.field903 = arg0.method2363();
        } else if (arg1 == 13) {
            this.field877 = arg0.method2550();
        } else if (arg1 == 14) {
            this.field900 = arg0.method2550();
        } else if (arg1 == 15) {
            this.field878 = arg0.method2550();
        } else if (arg1 == 16) {
            this.field879 = arg0.method2550();
        } else if (arg1 == 17) {
            this.field900 = arg0.method2550();
            this.field880 = arg0.method2550();
            this.field889 = arg0.method2550();
            this.field883 = arg0.method2550();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field906[arg1 - 30] = arg0.method2385();
            if (this.field906[arg1 - 30].equalsIgnoreCase(class161.field2496)) {
                this.field906[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2363();
            this.field884 = new short[var5];
            this.field885 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field884[var6] = (short) arg0.method2550();
                this.field885[var6] = (short) arg0.method2550();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2363();
            this.field886 = new short[var7];
            this.field887 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field886[var8] = (short) arg0.method2550();
                this.field887[var8] = (short) arg0.method2550();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2363();
            this.field876 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field876[var10] = arg0.method2550();
            }
        } else if (arg1 == 93) {
            this.field869 = false;
        } else if (arg1 == 95) {
            this.field890 = arg0.method2550();
        } else if (arg1 == 97) {
            this.field891 = arg0.method2550();
        } else if (arg1 == 98) {
            this.field892 = arg0.method2550();
        } else if (arg1 == 99) {
            this.field868 = true;
        } else if (arg1 == 100) {
            this.field894 = arg0.method2483();
        } else if (arg1 == 101) {
            this.field895 = arg0.method2483() * 5;
        } else if (arg1 == 102) {
            this.field896 = arg0.method2550();
        } else if (arg1 == 103) {
            this.field897 = arg0.method2550();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field899 = arg0.method2550();
            if (this.field899 == 65535) {
                this.field899 = -1;
            }
            this.field893 = arg0.method2550();
            if (this.field893 == 65535) {
                this.field893 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2550();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2363();
            this.field898 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field898[var13] = arg0.method2550();
                if (this.field898[var13] == 65535) {
                    this.field898[var13] = -1;
                }
            }
            this.field898[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field901 = false;
        } else if (arg1 == 109) {
            this.field902 = false;
        } else if (arg1 == 111) {
            this.field875 = true;
        }
    }

    @ObfuscatedName("aj.p(Lay;ILay;II)Lde;")
    public final class109 method773(class45 arg0, int arg1, class45 arg2, int arg3) {
        if (this.field898 != null) {
            class42 var5 = this.method775();
            return var5 == null ? null : var5.method773(arg0, arg1, arg2, arg3);
        }
        class109 var6 = (class109) field904.method3523((long) this.field881);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field882.length; var8++) {
                if (!Statics.field888.method3071(this.field882[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class104[] var9 = new class104[this.field882.length];
            for (int var10 = 0; var10 < this.field882.length; var10++) {
                var9[var10] = class104.method2078(Statics.field888, this.field882[var10], 0);
            }
            class104 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class104(var9, var9.length);
            }
            if (this.field884 != null) {
                for (int var12 = 0; var12 < this.field884.length; var12++) {
                    var11.method2091(this.field884[var12], this.field885[var12]);
                }
            }
            if (this.field886 != null) {
                for (int var13 = 0; var13 < this.field886.length; var13++) {
                    var11.method2128(this.field886[var13], this.field887[var13]);
                }
            }
            var6 = var11.method2097(this.field894 + 64, this.field895 + 850, -30, -50, -30);
            field904.method3521(var6, (long) this.field881);
        }
        class109 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method869(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method893(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2166(true);
        } else {
            var14 = arg2.method893(var6, arg3);
        }
        if (this.field891 != 128 || this.field892 != 128) {
            var14.method2223(this.field891, this.field892, this.field891);
        }
        return var14;
    }

    @ObfuscatedName("aj.g(B)Lch;")
    public final class104 method769() {
        if (this.field898 != null) {
            class42 var1 = this.method775();
            return var1 == null ? null : var1.method769();
        } else if (this.field876 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field876.length; var3++) {
                if (!Statics.field888.method3071(this.field876[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class104[] var4 = new class104[this.field876.length];
            for (int var5 = 0; var5 < this.field876.length; var5++) {
                var4[var5] = class104.method2078(Statics.field888, this.field876[var5], 0);
            }
            class104 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class104(var4, var4.length);
            }
            if (this.field884 != null) {
                for (int var7 = 0; var7 < this.field884.length; var7++) {
                    var6.method2091(this.field884[var7], this.field885[var7]);
                }
            }
            if (this.field886 != null) {
                for (int var8 = 0; var8 < this.field886.length; var8++) {
                    var6.method2128(this.field886[var8], this.field887[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aj.m(B)Laj;")
    public final class42 method775() {
        int var1 = -1;
        if (this.field899 != -1) {
            var1 = class180.method3191(this.field899);
        } else if (this.field893 != -1) {
            var1 = class180.field2952[this.field893];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field898.length - 1) {
            var2 = this.field898[var1];
        } else {
            var2 = this.field898[this.field898.length - 1];
        }
        return var2 == -1 ? null : method2674(var2);
    }

    @ObfuscatedName("aj.f(I)Z")
    public boolean method786() {
        if (this.field898 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field899 != -1) {
            var1 = class180.method3191(this.field899);
        } else if (this.field893 != -1) {
            var1 = class180.field2952[this.field893];
        }
        if (var1 >= 0 && var1 < this.field898.length) {
            return this.field898[var1] != -1;
        } else {
            return this.field898[this.field898.length - 1] != -1;
        }
    }
}
