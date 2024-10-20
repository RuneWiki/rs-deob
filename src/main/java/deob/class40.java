package deob;

@ObfuscatedName("az")
public class class40 extends class204 {

    @ObfuscatedName("az.g")
    public static class193 field873 = new class193(64);

    @ObfuscatedName("az.w")
    public static class193 field874 = new class193(50);

    @ObfuscatedName("az.e")
    public int field898;

    @ObfuscatedName("az.c")
    public String field876 = "null";

    @ObfuscatedName("az.a")
    public int field889 = 1;

    @ObfuscatedName("az.q")
    public int[] field878;

    @ObfuscatedName("az.m")
    public int[] field899;

    @ObfuscatedName("az.n")
    public int field880 = -1;

    @ObfuscatedName("az.k")
    public int field881 = -1;

    @ObfuscatedName("az.o")
    public int field882 = -1;

    @ObfuscatedName("az.f")
    public int field883 = -1;

    @ObfuscatedName("az.s")
    public int field904 = -1;

    @ObfuscatedName("az.z")
    public int field885 = -1;

    @ObfuscatedName("az.b")
    public int field886 = -1;

    @ObfuscatedName("az.p")
    public short[] field887;

    @ObfuscatedName("az.r")
    public short[] field913;

    @ObfuscatedName("az.x")
    public short[] field884;

    @ObfuscatedName("az.h")
    public short[] field890;

    @ObfuscatedName("az.j")
    public String[] field877 = new String[5];

    @ObfuscatedName("az.v")
    public boolean field892 = true;

    @ObfuscatedName("az.l")
    public int field893 = -1;

    @ObfuscatedName("az.u")
    public int field900 = 128;

    @ObfuscatedName("az.t")
    public int field895 = 128;

    @ObfuscatedName("az.i")
    public boolean field896 = false;

    @ObfuscatedName("az.ah")
    public int field891 = 0;

    @ObfuscatedName("az.aa")
    public int field897 = 0;

    @ObfuscatedName("az.ao")
    public int field905 = -1;

    @ObfuscatedName("az.ai")
    public int field901 = 32;

    @ObfuscatedName("az.ab")
    public int[] field871;

    @ObfuscatedName("az.ae")
    public int field902 = -1;

    @ObfuscatedName("az.aw")
    public int field903 = -1;

    @ObfuscatedName("az.aj")
    public boolean field888 = true;

    @ObfuscatedName("az.ay")
    public boolean field879 = true;

    @ObfuscatedName("az.af")
    public boolean field894 = false;

    @ObfuscatedName("az.al")
    public int field907 = 30;

    @ObfuscatedName("cw.y(II)Laz;")
    public static class40 method2027(int arg0) {
        class40 var1 = (class40) field873.method3425((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field875.method3045(9, arg0);
        class40 var3 = new class40();
        var3.field898 = arg0;
        if (var2 != null) {
            var3.method740(new class119(var2));
        }
        var3.method739();
        field873.method3427(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.d(I)V")
    public void method739() {
    }

    @ObfuscatedName("az.g(Ldd;B)V")
    public void method740(class119 arg0) {
        while (true) {
            int var2 = arg0.method2326();
            if (var2 == 0) {
                return;
            }
            this.method741(arg0, var2);
        }
    }

    @ObfuscatedName("az.w(Ldd;II)V")
    public void method741(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2326();
            this.field878 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field878[var4] = arg0.method2525();
            }
        } else if (arg1 == 2) {
            this.field876 = arg0.method2334();
        } else if (arg1 == 12) {
            this.field889 = arg0.method2326();
        } else if (arg1 == 13) {
            this.field880 = arg0.method2525();
        } else if (arg1 == 14) {
            this.field883 = arg0.method2525();
        } else if (arg1 == 15) {
            this.field881 = arg0.method2525();
        } else if (arg1 == 16) {
            this.field882 = arg0.method2525();
        } else if (arg1 == 17) {
            this.field883 = arg0.method2525();
            this.field904 = arg0.method2525();
            this.field885 = arg0.method2525();
            this.field886 = arg0.method2525();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field877[arg1 - 30] = arg0.method2334();
            if (this.field877[arg1 - 30].equalsIgnoreCase(class157.field2295)) {
                this.field877[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2326();
            this.field887 = new short[var5];
            this.field913 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field887[var6] = (short) arg0.method2525();
                this.field913[var6] = (short) arg0.method2525();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2326();
            this.field884 = new short[var7];
            this.field890 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field884[var8] = (short) arg0.method2525();
                this.field890[var8] = (short) arg0.method2525();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2326();
            this.field899 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field899[var10] = arg0.method2525();
            }
        } else if (arg1 == 93) {
            this.field892 = false;
        } else if (arg1 == 95) {
            this.field893 = arg0.method2525();
        } else if (arg1 == 97) {
            this.field900 = arg0.method2525();
        } else if (arg1 == 98) {
            this.field895 = arg0.method2525();
        } else if (arg1 == 99) {
            this.field896 = true;
        } else if (arg1 == 100) {
            this.field891 = arg0.method2461();
        } else if (arg1 == 101) {
            this.field897 = arg0.method2461();
        } else if (arg1 == 102) {
            this.field905 = arg0.method2525();
        } else if (arg1 == 103) {
            this.field901 = arg0.method2525();
        } else if (arg1 == 106) {
            this.field902 = arg0.method2525();
            if (this.field902 == 65535) {
                this.field902 = -1;
            }
            this.field903 = arg0.method2525();
            if (this.field903 == 65535) {
                this.field903 = -1;
            }
            int var11 = arg0.method2326();
            this.field871 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field871[var12] = arg0.method2525();
                if (this.field871[var12] == 65535) {
                    this.field871[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field888 = false;
        } else if (arg1 == 109) {
            this.field879 = false;
        } else if (arg1 == 111) {
            this.field894 = true;
        } else if (arg1 == 112) {
            this.field907 = arg0.method2326();
        }
    }

    @ObfuscatedName("az.e(Lam;ILam;II)Ldg;")
    public final class105 method763(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field871 != null) {
            class40 var5 = this.method744();
            return var5 == null ? null : var5.method763(arg0, arg1, arg2, arg3);
        }
        class105 var6 = (class105) field874.method3425((long) this.field898);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field878.length; var8++) {
                if (!Statics.field872.method2998(this.field878[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field878.length];
            for (int var10 = 0; var10 < this.field878.length; var10++) {
                var9[var10] = class100.method2031(Statics.field872, this.field878[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field887 != null) {
                for (int var12 = 0; var12 < this.field887.length; var12++) {
                    var11.method2089(this.field887[var12], this.field913[var12]);
                }
            }
            if (this.field884 != null) {
                for (int var13 = 0; var13 < this.field884.length; var13++) {
                    var11.method2044(this.field884[var13], this.field890[var13]);
                }
            }
            var6 = var11.method2051(this.field891 + 64, this.field897 * 5 + 850, -30, -50, -30);
            field874.method3427(var6, (long) this.field898);
        }
        class105 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method836(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method833(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2181(true);
        } else {
            var14 = arg2.method833(var6, arg3);
        }
        if (this.field900 != 128 || this.field895 != 128) {
            var14.method2139(this.field900, this.field895, this.field900);
        }
        return var14;
    }

    @ObfuscatedName("az.c(I)Lcl;")
    public final class100 method743() {
        if (this.field871 != null) {
            class40 var1 = this.method744();
            return var1 == null ? null : var1.method743();
        } else if (this.field899 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field899.length; var3++) {
                if (!Statics.field872.method2998(this.field899[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field899.length];
            for (int var5 = 0; var5 < this.field899.length; var5++) {
                var4[var5] = class100.method2031(Statics.field872, this.field899[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field887 != null) {
                for (int var7 = 0; var7 < this.field887.length; var7++) {
                    var6.method2089(this.field887[var7], this.field913[var7]);
                }
            }
            if (this.field884 != null) {
                for (int var8 = 0; var8 < this.field884.length; var8++) {
                    var6.method2044(this.field884[var8], this.field890[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("az.a(I)Laz;")
    public final class40 method744() {
        int var1 = -1;
        if (this.field902 != -1) {
            var1 = class176.method2749(this.field902);
        } else if (this.field903 != -1) {
            var1 = class176.field2875[this.field903];
        }
        return var1 < 0 || var1 >= this.field871.length || this.field871[var1] == -1 ? null : method2027(this.field871[var1]);
    }

    @ObfuscatedName("az.q(I)Z")
    public boolean method738() {
        if (this.field871 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field902 != -1) {
            var1 = class176.method2749(this.field902);
        } else if (this.field903 != -1) {
            var1 = class176.field2875[this.field903];
        }
        return var1 >= 0 && var1 < this.field871.length && this.field871[var1] != -1;
    }

    @ObfuscatedName("e.m(I)V")
    public static void method47() {
        field873.method3428();
        field874.method3428();
    }
}
