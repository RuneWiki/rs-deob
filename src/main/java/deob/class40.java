package deob;

@ObfuscatedName("aq")
public class class40 extends class205 {

    @ObfuscatedName("aq.p")
    public static class194 field889 = new class194(64);

    @ObfuscatedName("aq.x")
    public static class194 field886 = new class194(50);

    @ObfuscatedName("aq.d")
    public int field887;

    @ObfuscatedName("aq.u")
    public String field919 = "null";

    @ObfuscatedName("aq.o")
    public int field888 = 1;

    @ObfuscatedName("aq.b")
    public int[] field890;

    @ObfuscatedName("aq.k")
    public int[] field891;

    @ObfuscatedName("aq.c")
    public int field915 = -1;

    @ObfuscatedName("aq.l")
    public int field900 = -1;

    @ObfuscatedName("aq.t")
    public int field894 = -1;

    @ObfuscatedName("aq.i")
    public int field895 = -1;

    @ObfuscatedName("aq.r")
    public int field910 = -1;

    @ObfuscatedName("aq.m")
    public int field893 = -1;

    @ObfuscatedName("aq.e")
    public int field898 = -1;

    @ObfuscatedName("aq.h")
    public short[] field899;

    @ObfuscatedName("aq.z")
    public short[] field912;

    @ObfuscatedName("aq.a")
    public short[] field892;

    @ObfuscatedName("aq.w")
    public short[] field902;

    @ObfuscatedName("aq.g")
    public String[] field903 = new String[5];

    @ObfuscatedName("aq.y")
    public boolean field904 = true;

    @ObfuscatedName("aq.f")
    public int field901 = -1;

    @ObfuscatedName("aq.q")
    public int field906 = 128;

    @ObfuscatedName("aq.n")
    public int field907 = 128;

    @ObfuscatedName("aq.v")
    public boolean field908 = false;

    @ObfuscatedName("aq.ab")
    public int field909 = 0;

    @ObfuscatedName("aq.ad")
    public int field905 = 0;

    @ObfuscatedName("aq.an")
    public int field911 = -1;

    @ObfuscatedName("aq.au")
    public int field896 = 32;

    @ObfuscatedName("aq.ap")
    public int[] field922;

    @ObfuscatedName("aq.am")
    public int field914 = -1;

    @ObfuscatedName("aq.ae")
    public int field884 = -1;

    @ObfuscatedName("aq.ao")
    public boolean field916 = true;

    @ObfuscatedName("aq.as")
    public boolean field917 = true;

    @ObfuscatedName("aq.ai")
    public boolean field897 = false;

    @ObfuscatedName("aq.ah")
    public int field918 = 30;

    @ObfuscatedName("cy.s(IB)Laq;")
    public static class40 method2038(int arg0) {
        class40 var1 = (class40) field889.method3484((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field885.method3014(9, arg0);
        class40 var3 = new class40();
        var3.field887 = arg0;
        if (var2 != null) {
            var3.method726(new class120(var2));
        }
        var3.method725();
        field889.method3486(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.j(I)V")
    public void method725() {
    }

    @ObfuscatedName("aq.p(Lds;I)V")
    public void method726(class120 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method721(arg0, var2);
        }
    }

    @ObfuscatedName("aq.x(Lds;II)V")
    public void method721(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2338();
            this.field890 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field890[var4] = arg0.method2430();
            }
        } else if (arg1 == 2) {
            this.field919 = arg0.method2346();
        } else if (arg1 == 12) {
            this.field888 = arg0.method2338();
        } else if (arg1 == 13) {
            this.field915 = arg0.method2430();
        } else if (arg1 == 14) {
            this.field895 = arg0.method2430();
        } else if (arg1 == 15) {
            this.field900 = arg0.method2430();
        } else if (arg1 == 16) {
            this.field894 = arg0.method2430();
        } else if (arg1 == 17) {
            this.field895 = arg0.method2430();
            this.field910 = arg0.method2430();
            this.field893 = arg0.method2430();
            this.field898 = arg0.method2430();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field903[arg1 - 30] = arg0.method2346();
            if (this.field903[arg1 - 30].equalsIgnoreCase(class158.field2346)) {
                this.field903[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2338();
            this.field899 = new short[var5];
            this.field912 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field899[var6] = (short) arg0.method2430();
                this.field912[var6] = (short) arg0.method2430();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2338();
            this.field892 = new short[var7];
            this.field902 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field892[var8] = (short) arg0.method2430();
                this.field902[var8] = (short) arg0.method2430();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2338();
            this.field891 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field891[var10] = arg0.method2430();
            }
        } else if (arg1 == 93) {
            this.field904 = false;
        } else if (arg1 == 95) {
            this.field901 = arg0.method2430();
        } else if (arg1 == 97) {
            this.field906 = arg0.method2430();
        } else if (arg1 == 98) {
            this.field907 = arg0.method2430();
        } else if (arg1 == 99) {
            this.field908 = true;
        } else if (arg1 == 100) {
            this.field909 = arg0.method2339();
        } else if (arg1 == 101) {
            this.field905 = arg0.method2339() * 5;
        } else if (arg1 == 102) {
            this.field911 = arg0.method2430();
        } else if (arg1 == 103) {
            this.field896 = arg0.method2430();
        } else if (arg1 == 106) {
            this.field914 = arg0.method2430();
            if (this.field914 == 65535) {
                this.field914 = -1;
            }
            this.field884 = arg0.method2430();
            if (this.field884 == 65535) {
                this.field884 = -1;
            }
            int var11 = arg0.method2338();
            this.field922 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field922[var12] = arg0.method2430();
                if (this.field922[var12] == 65535) {
                    this.field922[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field916 = false;
        } else if (arg1 == 109) {
            this.field917 = false;
        } else if (arg1 == 111) {
            this.field897 = true;
        } else if (arg1 == 112) {
            this.field918 = arg0.method2338();
        }
    }

    @ObfuscatedName("aq.d(Lar;ILar;IS)Ldh;")
    public final class106 method722(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field922 != null) {
            class40 var5 = this.method720();
            return var5 == null ? null : var5.method722(arg0, arg1, arg2, arg3);
        }
        class106 var6 = (class106) field886.method3484((long) this.field887);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field890.length; var8++) {
                if (!Statics.field913.method3047(this.field890[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field890.length];
            for (int var10 = 0; var10 < this.field890.length; var10++) {
                var9[var10] = class101.method2040(Statics.field913, this.field890[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field899 != null) {
                for (int var12 = 0; var12 < this.field899.length; var12++) {
                    var11.method2053(this.field899[var12], this.field912[var12]);
                }
            }
            if (this.field892 != null) {
                for (int var13 = 0; var13 < this.field892.length; var13++) {
                    var11.method2054(this.field892[var13], this.field902[var13]);
                }
            }
            var6 = var11.method2061(this.field909 + 64, this.field905 + 850, -30, -50, -30);
            field886.method3486(var6, (long) this.field887);
        }
        class106 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method824(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method821(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2142(true);
        } else {
            var14 = arg2.method821(var6, arg3);
        }
        if (this.field906 != 128 || this.field907 != 128) {
            var14.method2159(this.field906, this.field907, this.field906);
        }
        return var14;
    }

    @ObfuscatedName("aq.u(I)Lcq;")
    public final class101 method723() {
        if (this.field922 != null) {
            class40 var1 = this.method720();
            return var1 == null ? null : var1.method723();
        } else if (this.field891 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field891.length; var3++) {
                if (!Statics.field913.method3047(this.field891[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field891.length];
            for (int var5 = 0; var5 < this.field891.length; var5++) {
                var4[var5] = class101.method2040(Statics.field913, this.field891[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field899 != null) {
                for (int var7 = 0; var7 < this.field899.length; var7++) {
                    var6.method2053(this.field899[var7], this.field912[var7]);
                }
            }
            if (this.field892 != null) {
                for (int var8 = 0; var8 < this.field892.length; var8++) {
                    var6.method2054(this.field892[var8], this.field902[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aq.o(B)Laq;")
    public final class40 method720() {
        int var1 = -1;
        if (this.field914 != -1) {
            var1 = class177.method680(this.field914);
        } else if (this.field884 != -1) {
            var1 = class177.field2921[this.field884];
        }
        return var1 < 0 || var1 >= this.field922.length || this.field922[var1] == -1 ? null : method2038(this.field922[var1]);
    }

    @ObfuscatedName("aq.b(B)Z")
    public boolean method719() {
        if (this.field922 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field914 != -1) {
            var1 = class177.method680(this.field914);
        } else if (this.field884 != -1) {
            var1 = class177.field2921[this.field884];
        }
        return var1 >= 0 && var1 < this.field922.length && this.field922[var1] != -1;
    }

    @ObfuscatedName("fk.k(I)V")
    public static void method3193() {
        field889.method3491();
        field886.method3491();
    }
}
