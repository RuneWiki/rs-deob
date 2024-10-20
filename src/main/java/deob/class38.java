package deob;

@ObfuscatedName("ao")
public class class38 extends class182 {

    @ObfuscatedName("ao.v")
    public static class171 field925 = new class171(64);

    @ObfuscatedName("ao.q")
    public static class171 field907 = new class171(100);

    @ObfuscatedName("ao.s")
    public int[] field919;

    @ObfuscatedName("ao.g")
    public int[] field909;

    @ObfuscatedName("ao.u")
    public int[] field906;

    @ObfuscatedName("ao.d")
    public int[] field911;

    @ObfuscatedName("ao.y")
    public int field913 = -1;

    @ObfuscatedName("ao.e")
    public int[] field908;

    @ObfuscatedName("ao.l")
    public boolean field914 = false;

    @ObfuscatedName("ao.o")
    public int field915 = 5;

    @ObfuscatedName("ao.w")
    public int field916 = -1;

    @ObfuscatedName("ao.t")
    public int field910 = -1;

    @ObfuscatedName("ao.z")
    public int field918 = 99;

    @ObfuscatedName("ao.b")
    public int field904 = -1;

    @ObfuscatedName("ao.a")
    public int field923 = -1;

    @ObfuscatedName("ao.r")
    public int field921 = 2;

    @ObfuscatedName("gu.i(II)Lao;")
    public static class38 method3551(int arg0) {
        class38 var1 = (class38) field925.method3185((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field917.method2811(12, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method716(new class107(var2));
        }
        var3.method717();
        field925.method3186(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.c(Ldm;I)V")
    public void method716(class107 arg0) {
        while (true) {
            int var2 = arg0.method2151();
            if (var2 == 0) {
                return;
            }
            this.method724(arg0, var2);
        }
    }

    @ObfuscatedName("ao.h(Ldm;II)V")
    public void method724(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2313();
            this.field906 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field906[var4] = arg0.method2313();
            }
            this.field919 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field919[var5] = arg0.method2313();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field919[var6] += arg0.method2313() << 16;
            }
        } else if (arg1 == 2) {
            this.field913 = arg0.method2313();
        } else if (arg1 == 3) {
            int var7 = arg0.method2151();
            this.field908 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field908[var8] = arg0.method2151();
            }
            this.field908[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field914 = true;
        } else if (arg1 == 5) {
            this.field915 = arg0.method2151();
        } else if (arg1 == 6) {
            this.field916 = arg0.method2313();
        } else if (arg1 == 7) {
            this.field910 = arg0.method2313();
        } else if (arg1 == 8) {
            this.field918 = arg0.method2151();
        } else if (arg1 == 9) {
            this.field904 = arg0.method2151();
        } else if (arg1 == 10) {
            this.field923 = arg0.method2151();
        } else if (arg1 == 11) {
            this.field921 = arg0.method2151();
        } else if (arg1 == 12) {
            int var9 = arg0.method2151();
            this.field909 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field909[var10] = arg0.method2313();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field909[var11] += arg0.method2313() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2151();
            this.field911 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field911[var13] = arg0.method2336();
            }
        }
    }

    @ObfuscatedName("ao.v(I)V")
    public void method717() {
        if (this.field904 == -1) {
            if (this.field908 == null) {
                this.field904 = 0;
            } else {
                this.field904 = 2;
            }
        }
        if (this.field923 != -1) {
            return;
        }
        if (this.field908 == null) {
            this.field923 = 0;
        } else {
            this.field923 = 2;
        }
    }

    @ObfuscatedName("ao.q(Lcc;II)Lcc;")
    public class98 method718(class98 arg0, int arg1) {
        int var3 = this.field919[arg1];
        class96 var4 = method2587(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2003(true);
        } else {
            class98 var6 = arg0.method2003(!var4.method1990(var5));
            var6.method2009(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ao.s(Lcc;IIB)Lcc;")
    public class98 method733(class98 arg0, int arg1, int arg2) {
        int var4 = this.field919[arg1];
        class96 var5 = method2587(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2003(true);
        }
        class98 var7 = arg0.method2003(!var5.method1990(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2014();
        } else if (var8 == 2) {
            var7.method2013();
        } else if (var8 == 3) {
            var7.method2050();
        }
        var7.method2009(var5, var6);
        if (var8 == 1) {
            var7.method2050();
        } else if (var8 == 2) {
            var7.method2013();
        } else if (var8 == 3) {
            var7.method2014();
        }
        return var7;
    }

    @ObfuscatedName("ao.g(Lcc;IB)Lcc;")
    public class98 method735(class98 arg0, int arg1) {
        int var3 = this.field919[arg1];
        class96 var4 = method2587(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2004(true);
        } else {
            class98 var6 = arg0.method2004(!var4.method1990(var5));
            var6.method2009(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ao.u(Lcc;ILao;II)Lcc;")
    public class98 method721(class98 arg0, int arg1, class38 arg2, int arg3) {
        int var5 = this.field919[arg1];
        class96 var6 = method2587(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method718(arg0, arg3);
        }
        int var8 = arg2.field919[arg3];
        class96 var9 = method2587(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class98 var11 = arg0.method2003(!var6.method1990(var7));
            var11.method2009(var6, var7);
            return var11;
        } else {
            class98 var12 = arg0.method2003(!var6.method1990(var7) & !var9.method1990(var10));
            var12.method2010(var6, var7, var9, var10, this.field908);
            return var12;
        }
    }

    @ObfuscatedName("ao.d(Lcc;II)Lcc;")
    public class98 method722(class98 arg0, int arg1) {
        int var3 = this.field919[arg1];
        class96 var4 = method2587(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2003(true);
        }
        class96 var6 = null;
        int var7 = 0;
        if (this.field909 != null && arg1 < this.field909.length) {
            int var8 = this.field909[arg1];
            var6 = method2587(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class98 var10 = arg0.method2003(!var4.method1990(var5));
            var10.method2009(var4, var5);
            return var10;
        } else {
            class98 var9 = arg0.method2003(!var4.method1990(var5) & !var6.method1990(var7));
            var9.method2009(var4, var5);
            var9.method2009(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("dv.y(II)Lci;")
    public static class96 method2587(int arg0) {
        class96 var1 = (class96) field907.method3185((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class96 var2 = class96.method2430(Statics.field905, Statics.field76, arg0, false);
        if (var2 != null) {
            field907.method3186(var2, (long) arg0);
        }
        return var2;
    }
}
