package deob;

@ObfuscatedName("ae")
public class class40 extends class204 {

    @ObfuscatedName("ae.k")
    public static class193 field874 = new class193(64);

    @ObfuscatedName("ae.f")
    public static class193 field875 = new class193(50);

    @ObfuscatedName("ae.d")
    public int field887;

    @ObfuscatedName("ae.l")
    public String field877 = "null";

    @ObfuscatedName("ae.r")
    public int field878 = 1;

    @ObfuscatedName("ae.g")
    public int[] field902;

    @ObfuscatedName("ae.h")
    public int[] field880;

    @ObfuscatedName("ae.n")
    public int field886 = -1;

    @ObfuscatedName("ae.j")
    public int field903 = -1;

    @ObfuscatedName("ae.a")
    public int field883 = -1;

    @ObfuscatedName("ae.b")
    public int field884 = -1;

    @ObfuscatedName("ae.c")
    public int field885 = -1;

    @ObfuscatedName("ae.v")
    public int field911 = -1;

    @ObfuscatedName("ae.p")
    public int field882 = -1;

    @ObfuscatedName("ae.i")
    public short[] field898;

    @ObfuscatedName("ae.t")
    public short[] field888;

    @ObfuscatedName("ae.u")
    public short[] field890;

    @ObfuscatedName("ae.e")
    public short[] field891;

    @ObfuscatedName("ae.m")
    public String[] field892 = new String[5];

    @ObfuscatedName("ae.s")
    public boolean field893 = true;

    @ObfuscatedName("ae.x")
    public int field894 = -1;

    @ObfuscatedName("ae.y")
    public int field872 = 128;

    @ObfuscatedName("ae.w")
    public int field889 = 128;

    @ObfuscatedName("ae.o")
    public boolean field897 = false;

    @ObfuscatedName("ae.aw")
    public int field873 = 0;

    @ObfuscatedName("ae.an")
    public int field899 = 0;

    @ObfuscatedName("ae.ab")
    public int field900 = -1;

    @ObfuscatedName("ae.al")
    public int field901 = 32;

    @ObfuscatedName("ae.ay")
    public int[] field876;

    @ObfuscatedName("ae.aq")
    public int field881 = -1;

    @ObfuscatedName("ae.ac")
    public int field904 = -1;

    @ObfuscatedName("ae.ak")
    public boolean field905 = true;

    @ObfuscatedName("ae.am")
    public boolean field906 = true;

    @ObfuscatedName("ae.aj")
    public boolean field907 = false;

    @ObfuscatedName("ae.au")
    public int field908 = 30;

    @ObfuscatedName("df.z(IB)Lae;")
    public static class40 method2177(int arg0) {
        class40 var1 = (class40) field874.method3439((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field896.method2986(9, arg0);
        class40 var3 = new class40();
        var3.field887 = arg0;
        if (var2 != null) {
            var3.method728(new class119(var2));
        }
        var3.method754();
        field874.method3429(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.q(I)V")
    public void method754() {
    }

    @ObfuscatedName("ae.k(Lda;I)V")
    public void method728(class119 arg0) {
        while (true) {
            int var2 = arg0.method2457();
            if (var2 == 0) {
                return;
            }
            this.method729(arg0, var2);
        }
    }

    @ObfuscatedName("ae.f(Lda;II)V")
    public void method729(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2457();
            this.field902 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field902[var4] = arg0.method2415();
            }
        } else if (arg1 == 2) {
            this.field877 = arg0.method2309();
        } else if (arg1 == 12) {
            this.field878 = arg0.method2457();
        } else if (arg1 == 13) {
            this.field886 = arg0.method2415();
        } else if (arg1 == 14) {
            this.field884 = arg0.method2415();
        } else if (arg1 == 15) {
            this.field903 = arg0.method2415();
        } else if (arg1 == 16) {
            this.field883 = arg0.method2415();
        } else if (arg1 == 17) {
            this.field884 = arg0.method2415();
            this.field885 = arg0.method2415();
            this.field911 = arg0.method2415();
            this.field882 = arg0.method2415();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field892[arg1 - 30] = arg0.method2309();
            if (this.field892[arg1 - 30].equalsIgnoreCase(class157.field2554)) {
                this.field892[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2457();
            this.field898 = new short[var5];
            this.field888 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field898[var6] = (short) arg0.method2415();
                this.field888[var6] = (short) arg0.method2415();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2457();
            this.field890 = new short[var7];
            this.field891 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field890[var8] = (short) arg0.method2415();
                this.field891[var8] = (short) arg0.method2415();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2457();
            this.field880 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field880[var10] = arg0.method2415();
            }
        } else if (arg1 == 93) {
            this.field893 = false;
        } else if (arg1 == 95) {
            this.field894 = arg0.method2415();
        } else if (arg1 == 97) {
            this.field872 = arg0.method2415();
        } else if (arg1 == 98) {
            this.field889 = arg0.method2415();
        } else if (arg1 == 99) {
            this.field897 = true;
        } else if (arg1 == 100) {
            this.field873 = arg0.method2423();
        } else if (arg1 == 101) {
            this.field899 = arg0.method2423() * 5;
        } else if (arg1 == 102) {
            this.field900 = arg0.method2415();
        } else if (arg1 == 103) {
            this.field901 = arg0.method2415();
        } else if (arg1 == 106) {
            this.field881 = arg0.method2415();
            if (this.field881 == 65535) {
                this.field881 = -1;
            }
            this.field904 = arg0.method2415();
            if (this.field904 == 65535) {
                this.field904 = -1;
            }
            int var11 = arg0.method2457();
            this.field876 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field876[var12] = arg0.method2415();
                if (this.field876[var12] == 65535) {
                    this.field876[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field905 = false;
        } else if (arg1 == 109) {
            this.field906 = false;
        } else if (arg1 == 111) {
            this.field907 = true;
        } else if (arg1 == 112) {
            this.field908 = arg0.method2457();
        }
    }

    @ObfuscatedName("ae.d(Lah;ILah;IB)Ldb;")
    public final class105 method730(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field876 != null) {
            class40 var5 = this.method732();
            return var5 == null ? null : var5.method730(arg0, arg1, arg2, arg3);
        }
        class105 var6 = (class105) field875.method3439((long) this.field887);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field902.length; var8++) {
                if (!Statics.field895.method3067(this.field902[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field902.length];
            for (int var10 = 0; var10 < this.field902.length; var10++) {
                var9[var10] = class100.method2071(Statics.field895, this.field902[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field898 != null) {
                for (int var12 = 0; var12 < this.field898.length; var12++) {
                    var11.method2010(this.field898[var12], this.field888[var12]);
                }
            }
            if (this.field890 != null) {
                for (int var13 = 0; var13 < this.field890.length; var13++) {
                    var11.method2011(this.field890[var13], this.field891[var13]);
                }
            }
            var6 = var11.method2019(this.field873 + 64, this.field899 + 850, -30, -50, -30);
            field875.method3429(var6, (long) this.field887);
        }
        class105 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method843(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method825(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2123(true);
        } else {
            var14 = arg2.method825(var6, arg3);
        }
        if (this.field872 != 128 || this.field889 != 128) {
            var14.method2156(this.field872, this.field889, this.field872);
        }
        return var14;
    }

    @ObfuscatedName("ae.l(B)Lcn;")
    public final class100 method731() {
        if (this.field876 != null) {
            class40 var1 = this.method732();
            return var1 == null ? null : var1.method731();
        } else if (this.field880 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field880.length; var3++) {
                if (!Statics.field895.method3067(this.field880[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field880.length];
            for (int var5 = 0; var5 < this.field880.length; var5++) {
                var4[var5] = class100.method2071(Statics.field895, this.field880[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field898 != null) {
                for (int var7 = 0; var7 < this.field898.length; var7++) {
                    var6.method2010(this.field898[var7], this.field888[var7]);
                }
            }
            if (this.field890 != null) {
                for (int var8 = 0; var8 < this.field890.length; var8++) {
                    var6.method2011(this.field890[var8], this.field891[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ae.r(B)Lae;")
    public final class40 method732() {
        int var1 = -1;
        if (this.field881 != -1) {
            var1 = class176.method951(this.field881);
        } else if (this.field904 != -1) {
            var1 = class176.field2892[this.field904];
        }
        return var1 < 0 || var1 >= this.field876.length || this.field876[var1] == -1 ? null : method2177(this.field876[var1]);
    }

    @ObfuscatedName("ae.g(I)Z")
    public boolean method733() {
        if (this.field876 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field881 != -1) {
            var1 = class176.method951(this.field881);
        } else if (this.field904 != -1) {
            var1 = class176.field2892[this.field904];
        }
        return var1 >= 0 && var1 < this.field876.length && this.field876[var1] != -1;
    }

    @ObfuscatedName("y.h(I)V")
    public static void method563() {
        field874.method3430();
        field875.method3430();
    }
}
