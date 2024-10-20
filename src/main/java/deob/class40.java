package deob;

@ObfuscatedName("at")
public class class40 extends class204 {

    @ObfuscatedName("at.q")
    public static class193 field886 = new class193(64);

    @ObfuscatedName("at.g")
    public static class193 field887 = new class193(50);

    @ObfuscatedName("at.m")
    public int field915;

    @ObfuscatedName("at.t")
    public String field889 = "null";

    @ObfuscatedName("at.j")
    public int field917 = 1;

    @ObfuscatedName("at.n")
    public int[] field884;

    @ObfuscatedName("at.l")
    public int[] field892;

    @ObfuscatedName("at.i")
    public int field911 = -1;

    @ObfuscatedName("at.w")
    public int field888 = -1;

    @ObfuscatedName("at.v")
    public int field906 = -1;

    @ObfuscatedName("at.o")
    public int field896 = -1;

    @ObfuscatedName("at.p")
    public int field897 = -1;

    @ObfuscatedName("at.b")
    public int field898 = -1;

    @ObfuscatedName("at.z")
    public int field899 = -1;

    @ObfuscatedName("at.k")
    public short[] field913;

    @ObfuscatedName("at.r")
    public short[] field901;

    @ObfuscatedName("at.d")
    public short[] field902;

    @ObfuscatedName("at.u")
    public short[] field909;

    @ObfuscatedName("at.a")
    public String[] field904 = new String[5];

    @ObfuscatedName("at.x")
    public boolean field905 = true;

    @ObfuscatedName("at.y")
    public int field910 = -1;

    @ObfuscatedName("at.c")
    public int field907 = 128;

    @ObfuscatedName("at.h")
    public int field908 = 128;

    @ObfuscatedName("at.e")
    public boolean field893 = false;

    @ObfuscatedName("at.ab")
    public int field895 = 0;

    @ObfuscatedName("at.af")
    public int field922 = 0;

    @ObfuscatedName("at.au")
    public int field912 = -1;

    @ObfuscatedName("at.ae")
    public int field890 = 32;

    @ObfuscatedName("at.ax")
    public int[] field914;

    @ObfuscatedName("at.az")
    public int field900 = -1;

    @ObfuscatedName("at.aa")
    public int field903 = -1;

    @ObfuscatedName("at.ak")
    public boolean field919 = true;

    @ObfuscatedName("at.ac")
    public boolean field918 = true;

    @ObfuscatedName("at.ar")
    public boolean field891 = false;

    @ObfuscatedName("at.ah")
    public int field920 = 30;

    @ObfuscatedName("cn.f(II)Lat;")
    public static class40 method2058(int arg0) {
        class40 var1 = (class40) field886.method3497((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field894.method3038(9, arg0);
        class40 var3 = new class40();
        var3.field915 = arg0;
        if (var2 != null) {
            var3.method746(new class119(var2));
        }
        var3.method745();
        field886.method3508(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.s(I)V")
    public void method745() {
    }

    @ObfuscatedName("at.q(Ldn;I)V")
    public void method746(class119 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method747(arg0, var2);
        }
    }

    @ObfuscatedName("at.g(Ldn;II)V")
    public void method747(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2363();
            this.field884 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field884[var4] = arg0.method2353();
            }
        } else if (arg1 == 2) {
            this.field889 = arg0.method2365();
        } else if (arg1 == 12) {
            this.field917 = arg0.method2363();
        } else if (arg1 == 13) {
            this.field911 = arg0.method2353();
        } else if (arg1 == 14) {
            this.field896 = arg0.method2353();
        } else if (arg1 == 15) {
            this.field888 = arg0.method2353();
        } else if (arg1 == 16) {
            this.field906 = arg0.method2353();
        } else if (arg1 == 17) {
            this.field896 = arg0.method2353();
            this.field897 = arg0.method2353();
            this.field898 = arg0.method2353();
            this.field899 = arg0.method2353();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field904[arg1 - 30] = arg0.method2365();
            if (this.field904[arg1 - 30].equalsIgnoreCase(class157.field2503)) {
                this.field904[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2363();
            this.field913 = new short[var5];
            this.field901 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field913[var6] = (short) arg0.method2353();
                this.field901[var6] = (short) arg0.method2353();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2363();
            this.field902 = new short[var7];
            this.field909 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field902[var8] = (short) arg0.method2353();
                this.field909[var8] = (short) arg0.method2353();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2363();
            this.field892 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field892[var10] = arg0.method2353();
            }
        } else if (arg1 == 93) {
            this.field905 = false;
        } else if (arg1 == 95) {
            this.field910 = arg0.method2353();
        } else if (arg1 == 97) {
            this.field907 = arg0.method2353();
        } else if (arg1 == 98) {
            this.field908 = arg0.method2353();
        } else if (arg1 == 99) {
            this.field893 = true;
        } else if (arg1 == 100) {
            this.field895 = arg0.method2364();
        } else if (arg1 == 101) {
            this.field922 = arg0.method2364() * 5;
        } else if (arg1 == 102) {
            this.field912 = arg0.method2353();
        } else if (arg1 == 103) {
            this.field890 = arg0.method2353();
        } else if (arg1 == 106) {
            this.field900 = arg0.method2353();
            if (this.field900 == 65535) {
                this.field900 = -1;
            }
            this.field903 = arg0.method2353();
            if (this.field903 == 65535) {
                this.field903 = -1;
            }
            int var11 = arg0.method2363();
            this.field914 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field914[var12] = arg0.method2353();
                if (this.field914[var12] == 65535) {
                    this.field914[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field919 = false;
        } else if (arg1 == 109) {
            this.field918 = false;
        } else if (arg1 == 111) {
            this.field891 = true;
        } else if (arg1 == 112) {
            this.field920 = arg0.method2363();
        }
    }

    @ObfuscatedName("at.m(Lai;ILai;II)Ldu;")
    public final class105 method753(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field914 != null) {
            class40 var5 = this.method750();
            return var5 == null ? null : var5.method753(arg0, arg1, arg2, arg3);
        }
        class105 var6 = (class105) field887.method3497((long) this.field915);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field884.length; var8++) {
                if (!Statics.field885.method3061(this.field884[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field884.length];
            for (int var10 = 0; var10 < this.field884.length; var10++) {
                var9[var10] = class100.method2068(Statics.field885, this.field884[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field913 != null) {
                for (int var12 = 0; var12 < this.field913.length; var12++) {
                    var11.method2082(this.field913[var12], this.field901[var12]);
                }
            }
            if (this.field902 != null) {
                for (int var13 = 0; var13 < this.field902.length; var13++) {
                    var11.method2083(this.field902[var13], this.field909[var13]);
                }
            }
            var6 = var11.method2090(this.field895 + 64, this.field922 + 850, -30, -50, -30);
            field887.method3508(var6, (long) this.field915);
        }
        class105 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method852(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method849(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2166(true);
        } else {
            var14 = arg2.method849(var6, arg3);
        }
        if (this.field907 != 128 || this.field908 != 128) {
            var14.method2222(this.field907, this.field908, this.field907);
        }
        return var14;
    }

    @ObfuscatedName("at.t(I)Lcx;")
    public final class100 method749() {
        if (this.field914 != null) {
            class40 var1 = this.method750();
            return var1 == null ? null : var1.method749();
        } else if (this.field892 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field892.length; var3++) {
                if (!Statics.field885.method3061(this.field892[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field892.length];
            for (int var5 = 0; var5 < this.field892.length; var5++) {
                var4[var5] = class100.method2068(Statics.field885, this.field892[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field913 != null) {
                for (int var7 = 0; var7 < this.field913.length; var7++) {
                    var6.method2082(this.field913[var7], this.field901[var7]);
                }
            }
            if (this.field902 != null) {
                for (int var8 = 0; var8 < this.field902.length; var8++) {
                    var6.method2083(this.field902[var8], this.field909[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("at.j(I)Lat;")
    public final class40 method750() {
        int var1 = -1;
        if (this.field900 != -1) {
            var1 = class176.method1774(this.field900);
        } else if (this.field903 != -1) {
            var1 = class176.field2900[this.field903];
        }
        return var1 < 0 || var1 >= this.field914.length || this.field914[var1] == -1 ? null : method2058(this.field914[var1]);
    }

    @ObfuscatedName("at.n(I)Z")
    public boolean method751() {
        if (this.field914 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field900 != -1) {
            var1 = class176.method1774(this.field900);
        } else if (this.field903 != -1) {
            var1 = class176.field2900[this.field903];
        }
        return var1 >= 0 && var1 < this.field914.length && this.field914[var1] != -1;
    }
}
