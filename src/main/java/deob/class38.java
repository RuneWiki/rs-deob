package deob;

@ObfuscatedName("ao")
public class class38 extends class182 {

    @ObfuscatedName("ao.h")
    public static class171 field913 = new class171(64);

    @ObfuscatedName("ao.k")
    public static class171 field898 = new class171(100);

    @ObfuscatedName("ao.l")
    public int[] field901;

    @ObfuscatedName("ao.e")
    public int[] field896;

    @ObfuscatedName("ao.j")
    public int[] field903;

    @ObfuscatedName("ao.n")
    public int[] field904;

    @ObfuscatedName("ao.f")
    public int field905 = -1;

    @ObfuscatedName("ao.a")
    public int[] field906;

    @ObfuscatedName("ao.i")
    public boolean field907 = false;

    @ObfuscatedName("ao.y")
    public int field908 = 5;

    @ObfuscatedName("ao.p")
    public int field909 = -1;

    @ObfuscatedName("ao.q")
    public int field912 = -1;

    @ObfuscatedName("ao.t")
    public int field911 = 99;

    @ObfuscatedName("ao.r")
    public int field919 = -1;

    @ObfuscatedName("ao.x")
    public int field900 = -1;

    @ObfuscatedName("ao.s")
    public int field914 = 2;

    @ObfuscatedName("cx.g(II)Lao;")
    public static class38 method1996(int arg0) {
        class38 var1 = (class38) field913.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field918.method2708(12, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method714(new class107(var2));
        }
        var3.method710();
        field913.method3167(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.v(Ldm;B)V")
    public void method714(class107 arg0) {
        while (true) {
            int var2 = arg0.method2139();
            if (var2 == 0) {
                return;
            }
            this.method709(arg0, var2);
        }
    }

    @ObfuscatedName("ao.z(Ldm;II)V")
    public void method709(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2141();
            this.field903 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field903[var4] = arg0.method2141();
            }
            this.field901 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field901[var5] = arg0.method2141();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field901[var6] += arg0.method2141() << 16;
            }
        } else if (arg1 == 2) {
            this.field905 = arg0.method2141();
        } else if (arg1 == 3) {
            int var7 = arg0.method2139();
            this.field906 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field906[var8] = arg0.method2139();
            }
            this.field906[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field907 = true;
        } else if (arg1 == 5) {
            this.field908 = arg0.method2139();
        } else if (arg1 == 6) {
            this.field909 = arg0.method2141();
        } else if (arg1 == 7) {
            this.field912 = arg0.method2141();
        } else if (arg1 == 8) {
            this.field911 = arg0.method2139();
        } else if (arg1 == 9) {
            this.field919 = arg0.method2139();
        } else if (arg1 == 10) {
            this.field900 = arg0.method2139();
        } else if (arg1 == 11) {
            this.field914 = arg0.method2139();
        } else if (arg1 == 12) {
            int var9 = arg0.method2139();
            this.field896 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field896[var10] = arg0.method2141();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field896[var11] += arg0.method2141() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2139();
            this.field904 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field904[var13] = arg0.method2230();
            }
        }
    }

    @ObfuscatedName("ao.h(I)V")
    public void method710() {
        if (this.field919 == -1) {
            if (this.field906 == null) {
                this.field919 = 0;
            } else {
                this.field919 = 2;
            }
        }
        if (this.field900 != -1) {
            return;
        }
        if (this.field906 == null) {
            this.field900 = 0;
        } else {
            this.field900 = 2;
        }
    }

    @ObfuscatedName("ao.k(Lce;II)Lce;")
    public class98 method711(class98 arg0, int arg1) {
        int var3 = this.field901[arg1];
        class96 var4 = method516(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2000(true);
        } else {
            class98 var6 = arg0.method2000(!var4.method1992(var5));
            var6.method2006(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ao.l(Lce;III)Lce;")
    public class98 method717(class98 arg0, int arg1, int arg2) {
        int var4 = this.field901[arg1];
        class96 var5 = method516(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2000(true);
        }
        class98 var7 = arg0.method2000(!var5.method1992(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2011();
        } else if (var8 == 2) {
            var7.method2010();
        } else if (var8 == 3) {
            var7.method2052();
        }
        var7.method2006(var5, var6);
        if (var8 == 1) {
            var7.method2052();
        } else if (var8 == 2) {
            var7.method2010();
        } else if (var8 == 3) {
            var7.method2011();
        }
        return var7;
    }

    @ObfuscatedName("ao.e(Lce;II)Lce;")
    public class98 method713(class98 arg0, int arg1) {
        int var3 = this.field901[arg1];
        class96 var4 = method516(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2055(true);
        } else {
            class98 var6 = arg0.method2055(!var4.method1992(var5));
            var6.method2006(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ao.j(Lce;ILao;IB)Lce;")
    public class98 method747(class98 arg0, int arg1, class38 arg2, int arg3) {
        int var5 = this.field901[arg1];
        class96 var6 = method516(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method711(arg0, arg3);
        }
        int var8 = arg2.field901[arg3];
        class96 var9 = method516(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class98 var11 = arg0.method2000(!var6.method1992(var7));
            var11.method2006(var6, var7);
            return var11;
        } else {
            class98 var12 = arg0.method2000(!var6.method1992(var7) & !var9.method1992(var10));
            var12.method2007(var6, var7, var9, var10, this.field906);
            return var12;
        }
    }

    @ObfuscatedName("ao.n(Lce;IB)Lce;")
    public class98 method715(class98 arg0, int arg1) {
        int var3 = this.field901[arg1];
        class96 var4 = method516(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2000(true);
        }
        class96 var6 = null;
        int var7 = 0;
        if (this.field896 != null && arg1 < this.field896.length) {
            int var8 = this.field896[arg1];
            var6 = method516(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class98 var10 = arg0.method2000(!var4.method1992(var5));
            var10.method2006(var4, var5);
            return var10;
        } else {
            class98 var9 = arg0.method2000(!var4.method1992(var5) & !var6.method1992(var7));
            var9.method2006(var4, var5);
            var9.method2006(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("u.f(II)Lcl;")
    public static class96 method516(int arg0) {
        class96 var1 = (class96) field898.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class96 var2 = class96.method71(Statics.field897, Statics.field902, arg0, false);
        if (var2 != null) {
            field898.method3167(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("ap.a(B)V")
    public static void method557() {
        field913.method3176();
        field898.method3176();
    }
}
