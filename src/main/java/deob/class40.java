package deob;

@ObfuscatedName("ay")
public class class40 extends class204 {

    @ObfuscatedName("ay.r")
    public static class193 field883 = new class193(64);

    @ObfuscatedName("ay.n")
    public static class193 field884 = new class193(50);

    @ObfuscatedName("ay.x")
    public int field885;

    @ObfuscatedName("ay.q")
    public String field919 = "null";

    @ObfuscatedName("ay.h")
    public int field906 = 1;

    @ObfuscatedName("ay.d")
    public int[] field888;

    @ObfuscatedName("ay.c")
    public int[] field889;

    @ObfuscatedName("ay.y")
    public int field890 = -1;

    @ObfuscatedName("ay.m")
    public int field891 = -1;

    @ObfuscatedName("ay.e")
    public int field904 = -1;

    @ObfuscatedName("ay.z")
    public int field899 = -1;

    @ObfuscatedName("ay.t")
    public int field894 = -1;

    @ObfuscatedName("ay.b")
    public int field895 = -1;

    @ObfuscatedName("ay.l")
    public int field916 = -1;

    @ObfuscatedName("ay.s")
    public short[] field897;

    @ObfuscatedName("ay.f")
    public short[] field898;

    @ObfuscatedName("ay.g")
    public short[] field892;

    @ObfuscatedName("ay.u")
    public short[] field900;

    @ObfuscatedName("ay.o")
    public String[] field901 = new String[5];

    @ObfuscatedName("ay.k")
    public boolean field886 = true;

    @ObfuscatedName("ay.a")
    public int field903 = -1;

    @ObfuscatedName("ay.j")
    public int field902 = 128;

    @ObfuscatedName("ay.p")
    public int field905 = 128;

    @ObfuscatedName("ay.w")
    public boolean field893 = false;

    @ObfuscatedName("ay.au")
    public int field907 = 0;

    @ObfuscatedName("ay.ar")
    public int field908 = 0;

    @ObfuscatedName("ay.ah")
    public int field909 = -1;

    @ObfuscatedName("ay.af")
    public int field881 = 32;

    @ObfuscatedName("ay.az")
    public int[] field911;

    @ObfuscatedName("ay.av")
    public int field912 = -1;

    @ObfuscatedName("ay.al")
    public int field913 = -1;

    @ObfuscatedName("ay.aw")
    public boolean field914 = true;

    @ObfuscatedName("ay.ac")
    public boolean field915 = true;

    @ObfuscatedName("ay.ai")
    public boolean field887 = false;

    @ObfuscatedName("ay.ab")
    public int field917 = 30;

    @ObfuscatedName("eb.i(II)Lay;")
    public static class40 method2940(int arg0) {
        class40 var1 = (class40) field883.method3464((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field896.method3035(9, arg0);
        class40 var3 = new class40();
        var3.field885 = arg0;
        if (var2 != null) {
            var3.method772(new class119(var2));
        }
        var3.method789();
        field883.method3466(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.v(I)V")
    public void method789() {
    }

    @ObfuscatedName("ay.r(Ldx;S)V")
    public void method772(class119 arg0) {
        while (true) {
            int var2 = arg0.method2380();
            if (var2 == 0) {
                return;
            }
            this.method773(arg0, var2);
        }
    }

    @ObfuscatedName("ay.n(Ldx;II)V")
    public void method773(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2380();
            this.field888 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field888[var4] = arg0.method2347();
            }
        } else if (arg1 == 2) {
            this.field919 = arg0.method2356();
        } else if (arg1 == 12) {
            this.field906 = arg0.method2380();
        } else if (arg1 == 13) {
            this.field890 = arg0.method2347();
        } else if (arg1 == 14) {
            this.field899 = arg0.method2347();
        } else if (arg1 == 15) {
            this.field891 = arg0.method2347();
        } else if (arg1 == 16) {
            this.field904 = arg0.method2347();
        } else if (arg1 == 17) {
            this.field899 = arg0.method2347();
            this.field894 = arg0.method2347();
            this.field895 = arg0.method2347();
            this.field916 = arg0.method2347();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field901[arg1 - 30] = arg0.method2356();
            if (this.field901[arg1 - 30].equalsIgnoreCase(class157.field2302)) {
                this.field901[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2380();
            this.field897 = new short[var5];
            this.field898 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field897[var6] = (short) arg0.method2347();
                this.field898[var6] = (short) arg0.method2347();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2380();
            this.field892 = new short[var7];
            this.field900 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field892[var8] = (short) arg0.method2347();
                this.field900[var8] = (short) arg0.method2347();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2380();
            this.field889 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field889[var10] = arg0.method2347();
            }
        } else if (arg1 == 93) {
            this.field886 = false;
        } else if (arg1 == 95) {
            this.field903 = arg0.method2347();
        } else if (arg1 == 97) {
            this.field902 = arg0.method2347();
        } else if (arg1 == 98) {
            this.field905 = arg0.method2347();
        } else if (arg1 == 99) {
            this.field893 = true;
        } else if (arg1 == 100) {
            this.field907 = arg0.method2346();
        } else if (arg1 == 101) {
            this.field908 = arg0.method2346();
        } else if (arg1 == 102) {
            this.field909 = arg0.method2347();
        } else if (arg1 == 103) {
            this.field881 = arg0.method2347();
        } else if (arg1 == 106) {
            this.field912 = arg0.method2347();
            if (this.field912 == 65535) {
                this.field912 = -1;
            }
            this.field913 = arg0.method2347();
            if (this.field913 == 65535) {
                this.field913 = -1;
            }
            int var11 = arg0.method2380();
            this.field911 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field911[var12] = arg0.method2347();
                if (this.field911[var12] == 65535) {
                    this.field911[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field914 = false;
        } else if (arg1 == 109) {
            this.field915 = false;
        } else if (arg1 == 111) {
            this.field887 = true;
        } else if (arg1 == 112) {
            this.field917 = arg0.method2380();
        }
    }

    @ObfuscatedName("ay.x(Laa;ILaa;II)Ldj;")
    public final class105 method774(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field911 != null) {
            class40 var5 = this.method776();
            return var5 == null ? null : var5.method774(arg0, arg1, arg2, arg3);
        }
        class105 var6 = (class105) field884.method3464((long) this.field885);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field888.length; var8++) {
                if (!Statics.field882.method3063(this.field888[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field888.length];
            for (int var10 = 0; var10 < this.field888.length; var10++) {
                var9[var10] = class100.method2042(Statics.field882, this.field888[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field897 != null) {
                for (int var12 = 0; var12 < this.field897.length; var12++) {
                    var11.method2054(this.field897[var12], this.field898[var12]);
                }
            }
            if (this.field892 != null) {
                for (int var13 = 0; var13 < this.field892.length; var13++) {
                    var11.method2055(this.field892[var13], this.field900[var13]);
                }
            }
            var6 = var11.method2062(this.field907 + 64, this.field908 * 5 + 850, -30, -50, -30);
            field884.method3466(var6, (long) this.field885);
        }
        class105 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method870(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method867(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2150(true);
        } else {
            var14 = arg2.method867(var6, arg3);
        }
        if (this.field902 != 128 || this.field905 != 128) {
            var14.method2174(this.field902, this.field905, this.field902);
        }
        return var14;
    }

    @ObfuscatedName("ay.q(B)Lcx;")
    public final class100 method775() {
        if (this.field911 != null) {
            class40 var1 = this.method776();
            return var1 == null ? null : var1.method775();
        } else if (this.field889 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field889.length; var3++) {
                if (!Statics.field882.method3063(this.field889[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field889.length];
            for (int var5 = 0; var5 < this.field889.length; var5++) {
                var4[var5] = class100.method2042(Statics.field882, this.field889[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field897 != null) {
                for (int var7 = 0; var7 < this.field897.length; var7++) {
                    var6.method2054(this.field897[var7], this.field898[var7]);
                }
            }
            if (this.field892 != null) {
                for (int var8 = 0; var8 < this.field892.length; var8++) {
                    var6.method2055(this.field892[var8], this.field900[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ay.h(I)Lay;")
    public final class40 method776() {
        int var1 = -1;
        if (this.field912 != -1) {
            var1 = class176.method140(this.field912);
        } else if (this.field913 != -1) {
            var1 = class176.field2886[this.field913];
        }
        return var1 < 0 || var1 >= this.field911.length || this.field911[var1] == -1 ? null : method2940(this.field911[var1]);
    }

    @ObfuscatedName("ay.d(B)Z")
    public boolean method795() {
        if (this.field911 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field912 != -1) {
            var1 = class176.method140(this.field912);
        } else if (this.field913 != -1) {
            var1 = class176.field2886[this.field913];
        }
        return var1 >= 0 && var1 < this.field911.length && this.field911[var1] != -1;
    }

    @ObfuscatedName("af.c(I)V")
    public static void method672() {
        field883.method3467();
        field884.method3467();
    }
}
