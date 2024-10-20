package deob;

@ObfuscatedName("an")
public class class43 extends class204 {

    @ObfuscatedName("an.s")
    public static class193 field987 = new class193(64);

    @ObfuscatedName("an.y")
    public static class193 field1005 = new class193(100);

    @ObfuscatedName("an.e")
    public int[] field989;

    @ObfuscatedName("an.g")
    public int[] field998;

    @ObfuscatedName("an.m")
    public int[] field991;

    @ObfuscatedName("an.j")
    public int[] field988;

    @ObfuscatedName("an.n")
    public int field1001 = -1;

    @ObfuscatedName("an.l")
    public int[] field994;

    @ObfuscatedName("an.h")
    public boolean field995 = false;

    @ObfuscatedName("an.i")
    public int field984 = 5;

    @ObfuscatedName("an.v")
    public int field997 = -1;

    @ObfuscatedName("an.z")
    public int field996 = -1;

    @ObfuscatedName("an.u")
    public int field999 = 99;

    @ObfuscatedName("an.t")
    public int field1000 = -1;

    @ObfuscatedName("an.b")
    public int field993 = -1;

    @ObfuscatedName("an.c")
    public int field1002 = 2;

    @ObfuscatedName("u.a(Lfz;Lfz;Lfz;I)V")
    public static void method187(class167 arg0, class167 arg1, class167 arg2) {
        Statics.field992 = arg0;
        Statics.field985 = arg1;
        Statics.field986 = arg2;
    }

    @ObfuscatedName("ey.r(II)Lan;")
    public static class43 method2701(int arg0) {
        class43 var1 = (class43) field987.method3507((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field992.method3025(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method849(new class119(var2));
        }
        var3.method845();
        field987.method3509(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.f(Lds;I)V")
    public void method849(class119 arg0) {
        while (true) {
            int var2 = arg0.method2412();
            if (var2 == 0) {
                return;
            }
            this.method846(arg0, var2);
        }
    }

    @ObfuscatedName("an.s(Lds;II)V")
    public void method846(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2347();
            this.field991 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field991[var4] = arg0.method2347();
            }
            this.field989 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field989[var5] = arg0.method2347();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field989[var6] += arg0.method2347() << 16;
            }
        } else if (arg1 == 2) {
            this.field1001 = arg0.method2347();
        } else if (arg1 == 3) {
            int var7 = arg0.method2412();
            this.field994 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field994[var8] = arg0.method2412();
            }
            this.field994[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field995 = true;
        } else if (arg1 == 5) {
            this.field984 = arg0.method2412();
        } else if (arg1 == 6) {
            this.field997 = arg0.method2347();
        } else if (arg1 == 7) {
            this.field996 = arg0.method2347();
        } else if (arg1 == 8) {
            this.field999 = arg0.method2412();
        } else if (arg1 == 9) {
            this.field1000 = arg0.method2412();
        } else if (arg1 == 10) {
            this.field993 = arg0.method2412();
        } else if (arg1 == 11) {
            this.field1002 = arg0.method2412();
        } else if (arg1 == 12) {
            int var9 = arg0.method2412();
            this.field998 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field998[var10] = arg0.method2347();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field998[var11] += arg0.method2347() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2412();
            this.field988 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field988[var13] = arg0.method2349();
            }
        }
    }

    @ObfuscatedName("an.y(I)V")
    public void method845() {
        if (this.field1000 == -1) {
            if (this.field994 == null) {
                this.field1000 = 0;
            } else {
                this.field1000 = 2;
            }
        }
        if (this.field993 != -1) {
            return;
        }
        if (this.field994 == null) {
            this.field993 = 0;
        } else {
            this.field993 = 2;
        }
    }

    @ObfuscatedName("an.e(Ldn;II)Ldn;")
    public class105 method848(class105 arg0, int arg1) {
        int var3 = this.field989[arg1];
        class103 var4 = method84(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2194(true);
        } else {
            class105 var6 = arg0.method2194(!var4.method2142(var5));
            var6.method2209(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("an.g(Ldn;III)Ldn;")
    public class105 method857(class105 arg0, int arg1, int arg2) {
        int var4 = this.field989[arg1];
        class103 var5 = method84(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2194(true);
        }
        class105 var7 = arg0.method2194(!var5.method2142(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2164();
        } else if (var8 == 2) {
            var7.method2207();
        } else if (var8 == 3) {
            var7.method2162();
        }
        var7.method2209(var5, var6);
        if (var8 == 1) {
            var7.method2162();
        } else if (var8 == 2) {
            var7.method2207();
        } else if (var8 == 3) {
            var7.method2164();
        }
        return var7;
    }

    @ObfuscatedName("an.m(Ldn;II)Ldn;")
    public class105 method850(class105 arg0, int arg1) {
        int var3 = this.field989[arg1];
        class103 var4 = method84(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2155(true);
        } else {
            class105 var6 = arg0.method2155(!var4.method2142(var5));
            var6.method2209(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("an.j(Ldn;ILan;IB)Ldn;")
    public class105 method878(class105 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field989[arg1];
        class103 var6 = method84(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method848(arg0, arg3);
        }
        int var8 = arg2.field989[arg3];
        class103 var9 = method84(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class105 var11 = arg0.method2194(!var6.method2142(var7));
            var11.method2209(var6, var7);
            return var11;
        } else {
            class105 var12 = arg0.method2194(!var6.method2142(var7) & !var9.method2142(var10));
            var12.method2160(var6, var7, var9, var10, this.field994);
            return var12;
        }
    }

    @ObfuscatedName("an.n(Ldn;IB)Ldn;")
    public class105 method852(class105 arg0, int arg1) {
        int var3 = this.field989[arg1];
        class103 var4 = method84(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2194(true);
        }
        class103 var6 = null;
        int var7 = 0;
        if (this.field998 != null && arg1 < this.field998.length) {
            int var8 = this.field998[arg1];
            var6 = method84(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class105 var10 = arg0.method2194(!var4.method2142(var5));
            var10.method2209(var4, var5);
            return var10;
        } else {
            class105 var9 = arg0.method2194(!var4.method2142(var5) & !var6.method2142(var7));
            var9.method2209(var4, var5);
            var9.method2209(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("e.l(II)Lcw;")
    public static class103 method84(int arg0) {
        class103 var1 = (class103) field1005.method3507((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class103 var2 = class103.method568(Statics.field985, Statics.field986, arg0, false);
        if (var2 != null) {
            field1005.method3509(var2, (long) arg0);
        }
        return var2;
    }
}
