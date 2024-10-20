package deob;

@ObfuscatedName("ab")
public class class40 extends class204 {

    @ObfuscatedName("ab.q")
    public static class193 field883 = new class193(64);

    @ObfuscatedName("ab.o")
    public static class193 field914 = new class193(50);

    @ObfuscatedName("ab.g")
    public int field885;

    @ObfuscatedName("ab.m")
    public String field886 = "null";

    @ObfuscatedName("ab.b")
    public int field887 = 1;

    @ObfuscatedName("ab.p")
    public int[] field902;

    @ObfuscatedName("ab.t")
    public int[] field889;

    @ObfuscatedName("ab.w")
    public int field890 = -1;

    @ObfuscatedName("ab.x")
    public int field891 = -1;

    @ObfuscatedName("ab.k")
    public int field917 = -1;

    @ObfuscatedName("ab.z")
    public int field893 = -1;

    @ObfuscatedName("ab.v")
    public int field884 = -1;

    @ObfuscatedName("ab.j")
    public int field916 = -1;

    @ObfuscatedName("ab.f")
    public int field896 = -1;

    @ObfuscatedName("ab.c")
    public short[] field897;

    @ObfuscatedName("ab.s")
    public short[] field898;

    @ObfuscatedName("ab.r")
    public short[] field881;

    @ObfuscatedName("ab.u")
    public short[] field900;

    @ObfuscatedName("ab.a")
    public String[] field901 = new String[5];

    @ObfuscatedName("ab.h")
    public boolean field911 = true;

    @ObfuscatedName("ab.y")
    public int field903 = -1;

    @ObfuscatedName("ab.d")
    public int field904 = 128;

    @ObfuscatedName("ab.n")
    public int field905 = 128;

    @ObfuscatedName("ab.i")
    public boolean field895 = false;

    @ObfuscatedName("ab.ad")
    public int field907 = 0;

    @ObfuscatedName("ab.aq")
    public int field908 = 0;

    @ObfuscatedName("ab.ak")
    public int field909 = -1;

    @ObfuscatedName("ab.au")
    public int field910 = 32;

    @ObfuscatedName("ab.ao")
    public int[] field892;

    @ObfuscatedName("ab.am")
    public int field912 = -1;

    @ObfuscatedName("ab.ah")
    public int field913 = -1;

    @ObfuscatedName("ab.aj")
    public boolean field888 = true;

    @ObfuscatedName("ab.ar")
    public boolean field915 = true;

    @ObfuscatedName("ab.ae")
    public boolean field919 = false;

    @ObfuscatedName("ab.al")
    public int field894 = 30;

    @ObfuscatedName("ah.l(II)Lab;")
    public static class40 method710(int arg0) {
        class40 var1 = (class40) field883.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field906.method3050(9, arg0);
        class40 var3 = new class40();
        var3.field885 = arg0;
        if (var2 != null) {
            var3.method763(new class119(var2));
        }
        var3.method769();
        field883.method3479(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.e(B)V")
    public void method769() {
    }

    @ObfuscatedName("ab.q(Ldl;I)V")
    public void method763(class119 arg0) {
        while (true) {
            int var2 = arg0.method2388();
            if (var2 == 0) {
                return;
            }
            this.method768(arg0, var2);
        }
    }

    @ObfuscatedName("ab.o(Ldl;II)V")
    public void method768(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2388();
            this.field902 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field902[var4] = arg0.method2440();
            }
        } else if (arg1 == 2) {
            this.field886 = arg0.method2396();
        } else if (arg1 == 12) {
            this.field887 = arg0.method2388();
        } else if (arg1 == 13) {
            this.field890 = arg0.method2440();
        } else if (arg1 == 14) {
            this.field893 = arg0.method2440();
        } else if (arg1 == 15) {
            this.field891 = arg0.method2440();
        } else if (arg1 == 16) {
            this.field917 = arg0.method2440();
        } else if (arg1 == 17) {
            this.field893 = arg0.method2440();
            this.field884 = arg0.method2440();
            this.field916 = arg0.method2440();
            this.field896 = arg0.method2440();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field901[arg1 - 30] = arg0.method2396();
            if (this.field901[arg1 - 30].equalsIgnoreCase(class157.field2300)) {
                this.field901[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2388();
            this.field897 = new short[var5];
            this.field898 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field897[var6] = (short) arg0.method2440();
                this.field898[var6] = (short) arg0.method2440();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2388();
            this.field881 = new short[var7];
            this.field900 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field881[var8] = (short) arg0.method2440();
                this.field900[var8] = (short) arg0.method2440();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2388();
            this.field889 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field889[var10] = arg0.method2440();
            }
        } else if (arg1 == 93) {
            this.field911 = false;
        } else if (arg1 == 95) {
            this.field903 = arg0.method2440();
        } else if (arg1 == 97) {
            this.field904 = arg0.method2440();
        } else if (arg1 == 98) {
            this.field905 = arg0.method2440();
        } else if (arg1 == 99) {
            this.field895 = true;
        } else if (arg1 == 100) {
            this.field907 = arg0.method2389();
        } else if (arg1 == 101) {
            this.field908 = arg0.method2389() * 5;
        } else if (arg1 == 102) {
            this.field909 = arg0.method2440();
        } else if (arg1 == 103) {
            this.field910 = arg0.method2440();
        } else if (arg1 == 106) {
            this.field912 = arg0.method2440();
            if (this.field912 == 65535) {
                this.field912 = -1;
            }
            this.field913 = arg0.method2440();
            if (this.field913 == 65535) {
                this.field913 = -1;
            }
            int var11 = arg0.method2388();
            this.field892 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field892[var12] = arg0.method2440();
                if (this.field892[var12] == 65535) {
                    this.field892[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field888 = false;
        } else if (arg1 == 109) {
            this.field915 = false;
        } else if (arg1 == 111) {
            this.field919 = true;
        } else if (arg1 == 112) {
            this.field894 = arg0.method2388();
        }
    }

    @ObfuscatedName("ab.g(Las;ILas;II)Ldt;")
    public final class105 method760(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field892 != null) {
            class40 var5 = this.method762();
            return var5 == null ? null : var5.method760(arg0, arg1, arg2, arg3);
        }
        class105 var6 = (class105) field914.method3478((long) this.field885);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field902.length; var8++) {
                if (!Statics.field882.method3088(this.field902[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field902.length];
            for (int var10 = 0; var10 < this.field902.length; var10++) {
                var9[var10] = class100.method2077(Statics.field882, this.field902[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field897 != null) {
                for (int var12 = 0; var12 < this.field897.length; var12++) {
                    var11.method2090(this.field897[var12], this.field898[var12]);
                }
            }
            if (this.field881 != null) {
                for (int var13 = 0; var13 < this.field881.length; var13++) {
                    var11.method2091(this.field881[var13], this.field900[var13]);
                }
            }
            var6 = var11.method2085(this.field907 + 64, this.field908 + 850, -30, -50, -30);
            field914.method3479(var6, (long) this.field885);
        }
        class105 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method869(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method864(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2243(true);
        } else {
            var14 = arg2.method864(var6, arg3);
        }
        if (this.field904 != 128 || this.field905 != 128) {
            var14.method2205(this.field904, this.field905, this.field904);
        }
        return var14;
    }

    @ObfuscatedName("ab.m(B)Lcm;")
    public final class100 method759() {
        if (this.field892 != null) {
            class40 var1 = this.method762();
            return var1 == null ? null : var1.method759();
        } else if (this.field889 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field889.length; var3++) {
                if (!Statics.field882.method3088(this.field889[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field889.length];
            for (int var5 = 0; var5 < this.field889.length; var5++) {
                var4[var5] = class100.method2077(Statics.field882, this.field889[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field897 != null) {
                for (int var7 = 0; var7 < this.field897.length; var7++) {
                    var6.method2090(this.field897[var7], this.field898[var7]);
                }
            }
            if (this.field881 != null) {
                for (int var8 = 0; var8 < this.field881.length; var8++) {
                    var6.method2091(this.field881[var8], this.field900[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ab.b(S)Lab;")
    public final class40 method762() {
        int var1 = -1;
        if (this.field912 != -1) {
            var1 = Statics.method1245(this.field912);
        } else if (this.field913 != -1) {
            var1 = class176.field2889[this.field913];
        }
        return var1 < 0 || var1 >= this.field892.length || this.field892[var1] == -1 ? null : method710(this.field892[var1]);
    }

    @ObfuscatedName("ab.p(B)Z")
    public boolean method783() {
        if (this.field892 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field912 != -1) {
            var1 = Statics.method1245(this.field912);
        } else if (this.field913 != -1) {
            var1 = class176.field2889[this.field913];
        }
        return var1 >= 0 && var1 < this.field892.length && this.field892[var1] != -1;
    }
}
