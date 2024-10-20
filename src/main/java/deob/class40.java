package deob;

@ObfuscatedName("ah")
public class class40 extends class194 {

    @ObfuscatedName("ah.c")
    public static class183 field896 = new class183(64);

    @ObfuscatedName("ah.u")
    public static class183 field897 = new class183(100);

    @ObfuscatedName("ah.w")
    public int[] field898;

    @ObfuscatedName("ah.i")
    public int[] field899;

    @ObfuscatedName("ah.r")
    public int[] field894;

    @ObfuscatedName("ah.f")
    public int[] field901;

    @ObfuscatedName("ah.g")
    public int field902 = -1;

    @ObfuscatedName("ah.o")
    public int[] field908;

    @ObfuscatedName("ah.h")
    public boolean field904 = false;

    @ObfuscatedName("ah.s")
    public int field900 = 5;

    @ObfuscatedName("ah.j")
    public int field912 = -1;

    @ObfuscatedName("ah.m")
    public int field907 = -1;

    @ObfuscatedName("ah.t")
    public int field893 = 99;

    @ObfuscatedName("ah.z")
    public int field909 = -1;

    @ObfuscatedName("ah.y")
    public int field910 = -1;

    @ObfuscatedName("ah.q")
    public int field905 = 2;

    @ObfuscatedName("cd.e(II)Lah;")
    public static class40 method1826(int arg0) {
        class40 var1 = (class40) field896.method3302((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field903.method2843(12, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method741(new class111(var2));
        }
        var3.method751();
        field896.method3304(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.a(Ldh;I)V")
    public void method741(class111 arg0) {
        while (true) {
            int var2 = arg0.method2176();
            if (var2 == 0) {
                return;
            }
            this.method742(arg0, var2);
        }
    }

    @ObfuscatedName("ah.l(Ldh;II)V")
    public void method742(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2178();
            this.field894 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field894[var4] = arg0.method2178();
            }
            this.field898 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field898[var5] = arg0.method2178();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field898[var6] += arg0.method2178() << 16;
            }
        } else if (arg1 == 2) {
            this.field902 = arg0.method2178();
        } else if (arg1 == 3) {
            int var7 = arg0.method2176();
            this.field908 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field908[var8] = arg0.method2176();
            }
            this.field908[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field904 = true;
        } else if (arg1 == 5) {
            this.field900 = arg0.method2176();
        } else if (arg1 == 6) {
            this.field912 = arg0.method2178();
        } else if (arg1 == 7) {
            this.field907 = arg0.method2178();
        } else if (arg1 == 8) {
            this.field893 = arg0.method2176();
        } else if (arg1 == 9) {
            this.field909 = arg0.method2176();
        } else if (arg1 == 10) {
            this.field910 = arg0.method2176();
        } else if (arg1 == 11) {
            this.field905 = arg0.method2176();
        } else if (arg1 == 12) {
            int var9 = arg0.method2176();
            this.field899 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field899[var10] = arg0.method2178();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field899[var11] += arg0.method2178() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2176();
            this.field901 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field901[var13] = arg0.method2179();
            }
        }
    }

    @ObfuscatedName("ah.c(B)V")
    public void method751() {
        if (this.field909 == -1) {
            if (this.field908 == null) {
                this.field909 = 0;
            } else {
                this.field909 = 2;
            }
        }
        if (this.field910 != -1) {
            return;
        }
        if (this.field908 == null) {
            this.field910 = 0;
        } else {
            this.field910 = 2;
        }
    }

    @ObfuscatedName("ah.u(Lcy;II)Lcy;")
    public class100 method749(class100 arg0, int arg1) {
        int var3 = this.field898[arg1];
        class98 var4 = method2099(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2058(true);
        } else {
            class100 var6 = arg0.method2058(!var4.method2011(var5));
            var6.method2017(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ah.w(Lcy;III)Lcy;")
    public class100 method745(class100 arg0, int arg1, int arg2) {
        int var4 = this.field898[arg1];
        class98 var5 = method2099(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2058(true);
        }
        class100 var7 = arg0.method2058(!var5.method2011(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2024();
        } else if (var8 == 2) {
            var7.method2027();
        } else if (var8 == 3) {
            var7.method2038();
        }
        var7.method2017(var5, var6);
        if (var8 == 1) {
            var7.method2038();
        } else if (var8 == 2) {
            var7.method2027();
        } else if (var8 == 3) {
            var7.method2024();
        }
        return var7;
    }

    @ObfuscatedName("ah.i(Lcy;II)Lcy;")
    public class100 method746(class100 arg0, int arg1) {
        int var3 = this.field898[arg1];
        class98 var4 = method2099(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2070(true);
        } else {
            class100 var6 = arg0.method2070(!var4.method2011(var5));
            var6.method2017(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ah.r(Lcy;ILah;II)Lcy;")
    public class100 method747(class100 arg0, int arg1, class40 arg2, int arg3) {
        int var5 = this.field898[arg1];
        class98 var6 = method2099(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method749(arg0, arg3);
        }
        int var8 = arg2.field898[arg3];
        class98 var9 = method2099(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class100 var11 = arg0.method2058(!var6.method2011(var7));
            var11.method2017(var6, var7);
            return var11;
        } else {
            class100 var12 = arg0.method2058(!var6.method2011(var7) & !var9.method2011(var10));
            var12.method2082(var6, var7, var9, var10, this.field908);
            return var12;
        }
    }

    @ObfuscatedName("ah.f(Lcy;II)Lcy;")
    public class100 method748(class100 arg0, int arg1) {
        int var3 = this.field898[arg1];
        class98 var4 = method2099(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2058(true);
        }
        class98 var6 = null;
        int var7 = 0;
        if (this.field899 != null && arg1 < this.field899.length) {
            int var8 = this.field899[arg1];
            var6 = method2099(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class100 var10 = arg0.method2058(!var4.method2011(var5));
            var10.method2017(var4, var5);
            return var10;
        } else {
            class100 var9 = arg0.method2058(!var4.method2011(var5) & !var6.method2011(var7));
            var9.method2017(var4, var5);
            var9.method2017(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("dd.g(IB)Lco;")
    public static class98 method2099(int arg0) {
        class98 var1 = (class98) field897.method3302((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class158 var2 = Statics.field911;
        class158 var3 = Statics.field895;
        boolean var4 = true;
        int[] var5 = var2.method2852(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2849(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2849(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class98 var10;
        if (var4) {
            try {
                var10 = new class98(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field897.method3304(var10, (long) arg0);
        }
        return var10;
    }
}
