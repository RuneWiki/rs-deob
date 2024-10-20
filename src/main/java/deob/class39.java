package deob;

@ObfuscatedName("af")
public class class39 extends class185 {

    @ObfuscatedName("af.j")
    public static class174 field900 = new class174(64);

    @ObfuscatedName("af.w")
    public static class174 field898 = new class174(100);

    @ObfuscatedName("af.c")
    public int[] field902;

    @ObfuscatedName("af.x")
    public int[] field903;

    @ObfuscatedName("af.f")
    public int[] field904;

    @ObfuscatedName("af.t")
    public int[] field897;

    @ObfuscatedName("af.n")
    public int field906 = -1;

    @ObfuscatedName("af.p")
    public int[] field912;

    @ObfuscatedName("af.a")
    public boolean field908 = false;

    @ObfuscatedName("af.o")
    public int field909 = 5;

    @ObfuscatedName("af.b")
    public int field905 = -1;

    @ObfuscatedName("af.r")
    public int field911 = -1;

    @ObfuscatedName("af.z")
    public int field907 = 99;

    @ObfuscatedName("af.u")
    public int field913 = -1;

    @ObfuscatedName("af.s")
    public int field914 = -1;

    @ObfuscatedName("af.i")
    public int field915 = 2;

    @ObfuscatedName("aj.l(IB)Laf;")
    public static class39 method821(int arg0) {
        class39 var1 = (class39) field900.method3225((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field918.method2752(12, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method710(new class108(var2));
        }
        var3.method734();
        field900.method3211(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.y(Ldk;I)V")
    public void method710(class108 arg0) {
        while (true) {
            int var2 = arg0.method2291();
            if (var2 == 0) {
                return;
            }
            this.method747(arg0, var2);
        }
    }

    @ObfuscatedName("af.g(Ldk;IB)V")
    public void method747(class108 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2163();
            this.field904 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field904[var4] = arg0.method2163();
            }
            this.field902 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field902[var5] = arg0.method2163();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field902[var6] += arg0.method2163() << 16;
            }
        } else if (arg1 == 2) {
            this.field906 = arg0.method2163();
        } else if (arg1 == 3) {
            int var7 = arg0.method2291();
            this.field912 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field912[var8] = arg0.method2291();
            }
            this.field912[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field908 = true;
        } else if (arg1 == 5) {
            this.field909 = arg0.method2291();
        } else if (arg1 == 6) {
            this.field905 = arg0.method2163();
        } else if (arg1 == 7) {
            this.field911 = arg0.method2163();
        } else if (arg1 == 8) {
            this.field907 = arg0.method2291();
        } else if (arg1 == 9) {
            this.field913 = arg0.method2291();
        } else if (arg1 == 10) {
            this.field914 = arg0.method2291();
        } else if (arg1 == 11) {
            this.field915 = arg0.method2291();
        } else if (arg1 == 12) {
            int var9 = arg0.method2291();
            this.field903 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field903[var10] = arg0.method2163();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field903[var11] += arg0.method2163() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2291();
            this.field897 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field897[var13] = arg0.method2214();
            }
        }
    }

    @ObfuscatedName("af.j(I)V")
    public void method734() {
        if (this.field913 == -1) {
            if (this.field912 == null) {
                this.field913 = 0;
            } else {
                this.field913 = 2;
            }
        }
        if (this.field914 != -1) {
            return;
        }
        if (this.field912 == null) {
            this.field914 = 0;
        } else {
            this.field914 = 2;
        }
    }

    @ObfuscatedName("af.w(Lck;IB)Lck;")
    public class99 method713(class99 arg0, int arg1) {
        int var3 = this.field902[arg1];
        class97 var4 = method616(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2074(true);
        } else {
            class99 var6 = arg0.method2074(!var4.method1993(var5));
            var6.method2016(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("af.c(Lck;III)Lck;")
    public class99 method714(class99 arg0, int arg1, int arg2) {
        int var4 = this.field902[arg1];
        class97 var5 = method616(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2074(true);
        }
        class99 var7 = arg0.method2074(!var5.method1993(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2029();
        } else if (var8 == 2) {
            var7.method2011();
        } else if (var8 == 3) {
            var7.method2010();
        }
        var7.method2016(var5, var6);
        if (var8 == 1) {
            var7.method2010();
        } else if (var8 == 2) {
            var7.method2011();
        } else if (var8 == 3) {
            var7.method2029();
        }
        return var7;
    }

    @ObfuscatedName("af.x(Lck;II)Lck;")
    public class99 method741(class99 arg0, int arg1) {
        int var3 = this.field902[arg1];
        class97 var4 = method616(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2002(true);
        } else {
            class99 var6 = arg0.method2002(!var4.method1993(var5));
            var6.method2016(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("af.f(Lck;ILaf;IB)Lck;")
    public class99 method711(class99 arg0, int arg1, class39 arg2, int arg3) {
        int var5 = this.field902[arg1];
        class97 var6 = method616(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method713(arg0, arg3);
        }
        int var8 = arg2.field902[arg3];
        class97 var9 = method616(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class99 var11 = arg0.method2074(!var6.method1993(var7));
            var11.method2016(var6, var7);
            return var11;
        } else {
            class99 var12 = arg0.method2074(!var6.method1993(var7) & !var9.method1993(var10));
            var12.method2008(var6, var7, var9, var10, this.field912);
            return var12;
        }
    }

    @ObfuscatedName("af.t(Lck;II)Lck;")
    public class99 method717(class99 arg0, int arg1) {
        int var3 = this.field902[arg1];
        class97 var4 = method616(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2074(true);
        }
        class97 var6 = null;
        int var7 = 0;
        if (this.field903 != null && arg1 < this.field903.length) {
            int var8 = this.field903[arg1];
            var6 = method616(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class99 var10 = arg0.method2074(!var4.method1993(var5));
            var10.method2016(var4, var5);
            return var10;
        } else {
            class99 var9 = arg0.method2074(!var4.method1993(var5) & !var6.method1993(var7));
            var9.method2016(var4, var5);
            var9.method2016(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("aa.n(II)Lcz;")
    public static class97 method616(int arg0) {
        class97 var1 = (class97) field898.method3225((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class149 var2 = Statics.field910;
        class149 var3 = Statics.field899;
        boolean var4 = true;
        int[] var5 = var2.method2789(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2811(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2811(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class97 var10;
        if (var4) {
            try {
                var10 = new class97(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field898.method3211(var10, (long) arg0);
        }
        return var10;
    }
}
