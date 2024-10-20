package deob;

@ObfuscatedName("ab")
public class class40 extends class205 {

    @ObfuscatedName("ab.d")
    public static class194 field913 = new class194(64);

    @ObfuscatedName("ab.c")
    public static class194 field890 = new class194(50);

    @ObfuscatedName("ab.y")
    public int field891;

    @ObfuscatedName("ab.k")
    public String field918 = "null";

    @ObfuscatedName("ab.r")
    public int field888 = 1;

    @ObfuscatedName("ab.p")
    public int[] field894;

    @ObfuscatedName("ab.q")
    public int[] field887;

    @ObfuscatedName("ab.m")
    public int field896 = -1;

    @ObfuscatedName("ab.e")
    public int field914 = -1;

    @ObfuscatedName("ab.x")
    public int field898 = -1;

    @ObfuscatedName("ab.z")
    public int field905 = -1;

    @ObfuscatedName("ab.i")
    public int field912 = -1;

    @ObfuscatedName("ab.t")
    public int field901 = -1;

    @ObfuscatedName("ab.n")
    public int field902 = -1;

    @ObfuscatedName("ab.u")
    public short[] field903;

    @ObfuscatedName("ab.g")
    public short[] field904;

    @ObfuscatedName("ab.j")
    public short[] field897;

    @ObfuscatedName("ab.h")
    public short[] field892;

    @ObfuscatedName("ab.s")
    public String[] field907 = new String[5];

    @ObfuscatedName("ab.f")
    public boolean field908 = true;

    @ObfuscatedName("ab.b")
    public int field906 = -1;

    @ObfuscatedName("ab.l")
    public int field910 = 128;

    @ObfuscatedName("ab.o")
    public int field911 = 128;

    @ObfuscatedName("ab.v")
    public boolean field889 = false;

    @ObfuscatedName("ab.ad")
    public int field900 = 0;

    @ObfuscatedName("ab.ar")
    public int field920 = 0;

    @ObfuscatedName("ab.ah")
    public int field915 = -1;

    @ObfuscatedName("ab.ay")
    public int field916 = 32;

    @ObfuscatedName("ab.af")
    public int[] field917;

    @ObfuscatedName("ab.al")
    public int field909 = -1;

    @ObfuscatedName("ab.ai")
    public int field919 = -1;

    @ObfuscatedName("ab.an")
    public boolean field899 = true;

    @ObfuscatedName("ab.az")
    public boolean field921 = true;

    @ObfuscatedName("ab.ac")
    public boolean field922 = false;

    @ObfuscatedName("ab.ao")
    public int field923 = 30;

    @ObfuscatedName("ah.a(II)Lab;")
    public static class40 method726(int arg0) {
        class40 var1 = (class40) field913.method3579((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field893.method3188(9, arg0);
        class40 var3 = new class40();
        var3.field891 = arg0;
        if (var2 != null) {
            var3.method836(new class120(var2));
        }
        var3.method855();
        field913.method3581(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.w(B)V")
    public void method855() {
    }

    @ObfuscatedName("ab.d(Ldx;S)V")
    public void method836(class120 arg0) {
        while (true) {
            int var2 = arg0.method2462();
            if (var2 == 0) {
                return;
            }
            this.method837(arg0, var2);
        }
    }

    @ObfuscatedName("ab.c(Ldx;II)V")
    public void method837(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2462();
            this.field894 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field894[var4] = arg0.method2464();
            }
        } else if (arg1 == 2) {
            this.field918 = arg0.method2470();
        } else if (arg1 == 12) {
            this.field888 = arg0.method2462();
        } else if (arg1 == 13) {
            this.field896 = arg0.method2464();
        } else if (arg1 == 14) {
            this.field905 = arg0.method2464();
        } else if (arg1 == 15) {
            this.field914 = arg0.method2464();
        } else if (arg1 == 16) {
            this.field898 = arg0.method2464();
        } else if (arg1 == 17) {
            this.field905 = arg0.method2464();
            this.field912 = arg0.method2464();
            this.field901 = arg0.method2464();
            this.field902 = arg0.method2464();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field907[arg1 - 30] = arg0.method2470();
            if (this.field907[arg1 - 30].equalsIgnoreCase(class158.field2304)) {
                this.field907[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2462();
            this.field903 = new short[var5];
            this.field904 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field903[var6] = (short) arg0.method2464();
                this.field904[var6] = (short) arg0.method2464();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2462();
            this.field897 = new short[var7];
            this.field892 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field897[var8] = (short) arg0.method2464();
                this.field892[var8] = (short) arg0.method2464();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2462();
            this.field887 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field887[var10] = arg0.method2464();
            }
        } else if (arg1 == 93) {
            this.field908 = false;
        } else if (arg1 == 95) {
            this.field906 = arg0.method2464();
        } else if (arg1 == 97) {
            this.field910 = arg0.method2464();
        } else if (arg1 == 98) {
            this.field911 = arg0.method2464();
        } else if (arg1 == 99) {
            this.field889 = true;
        } else if (arg1 == 100) {
            this.field900 = arg0.method2548();
        } else if (arg1 == 101) {
            this.field920 = arg0.method2548();
        } else if (arg1 == 102) {
            this.field915 = arg0.method2464();
        } else if (arg1 == 103) {
            this.field916 = arg0.method2464();
        } else if (arg1 == 106) {
            this.field909 = arg0.method2464();
            if (this.field909 == 65535) {
                this.field909 = -1;
            }
            this.field919 = arg0.method2464();
            if (this.field919 == 65535) {
                this.field919 = -1;
            }
            int var11 = arg0.method2462();
            this.field917 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field917[var12] = arg0.method2464();
                if (this.field917[var12] == 65535) {
                    this.field917[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field899 = false;
        } else if (arg1 == 109) {
            this.field921 = false;
        } else if (arg1 == 111) {
            this.field922 = true;
        } else if (arg1 == 112) {
            this.field923 = arg0.method2462();
        }
    }

    @ObfuscatedName("ab.y(Lam;ILam;II)Ldr;")
    public final class106 method838(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field917 != null) {
            class40 var5 = this.method840();
            return var5 == null ? null : var5.method838(arg0, arg1, arg2, arg3);
        }
        class106 var6 = (class106) field890.method3579((long) this.field891);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field894.length; var8++) {
                if (!Statics.field895.method3214(this.field894[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field894.length];
            for (int var10 = 0; var10 < this.field894.length; var10++) {
                var9[var10] = class101.method2165(Statics.field895, this.field894[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field903 != null) {
                for (int var12 = 0; var12 < this.field903.length; var12++) {
                    var11.method2161(this.field903[var12], this.field904[var12]);
                }
            }
            if (this.field897 != null) {
                for (int var13 = 0; var13 < this.field897.length; var13++) {
                    var11.method2162(this.field897[var13], this.field892[var13]);
                }
            }
            var6 = var11.method2226(this.field900 + 64, this.field920 * 5 + 850, -30, -50, -30);
            field890.method3581(var6, (long) this.field891);
        }
        class106 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method935(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method932(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2326(true);
        } else {
            var14 = arg2.method932(var6, arg3);
        }
        if (this.field910 != 128 || this.field911 != 128) {
            var14.method2261(this.field910, this.field911, this.field910);
        }
        return var14;
    }

    @ObfuscatedName("ab.k(I)Lcx;")
    public final class101 method839() {
        if (this.field917 != null) {
            class40 var1 = this.method840();
            return var1 == null ? null : var1.method839();
        } else if (this.field887 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field887.length; var3++) {
                if (!Statics.field895.method3214(this.field887[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field887.length];
            for (int var5 = 0; var5 < this.field887.length; var5++) {
                var4[var5] = class101.method2165(Statics.field895, this.field887[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field903 != null) {
                for (int var7 = 0; var7 < this.field903.length; var7++) {
                    var6.method2161(this.field903[var7], this.field904[var7]);
                }
            }
            if (this.field897 != null) {
                for (int var8 = 0; var8 < this.field897.length; var8++) {
                    var6.method2162(this.field897[var8], this.field892[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ab.r(I)Lab;")
    public final class40 method840() {
        int var1 = -1;
        if (this.field909 != -1) {
            var1 = class177.method2119(this.field909);
        } else if (this.field919 != -1) {
            var1 = class177.field2906[this.field919];
        }
        return var1 < 0 || var1 >= this.field917.length || this.field917[var1] == -1 ? null : method726(this.field917[var1]);
    }

    @ObfuscatedName("ab.p(I)Z")
    public boolean method841() {
        if (this.field917 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field909 != -1) {
            var1 = class177.method2119(this.field909);
        } else if (this.field919 != -1) {
            var1 = class177.field2906[this.field919];
        }
        return var1 >= 0 && var1 < this.field917.length && this.field917[var1] != -1;
    }
}
