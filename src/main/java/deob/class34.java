package deob;

@ObfuscatedName("ao")
public class class34 extends class174 {

    @ObfuscatedName("ao.a")
    public static class170 field861 = new class170(64);

    @ObfuscatedName("ao.q")
    public static class170 field850 = new class170(100);

    @ObfuscatedName("ao.j")
    public int[] field851;

    @ObfuscatedName("ao.v")
    public int[] field852;

    @ObfuscatedName("ao.w")
    public int[] field853;

    @ObfuscatedName("ao.l")
    public int[] field854;

    @ObfuscatedName("ao.s")
    public int field864 = -1;

    @ObfuscatedName("ao.n")
    public int[] field856;

    @ObfuscatedName("ao.c")
    public boolean field857 = false;

    @ObfuscatedName("ao.h")
    public int field858 = 5;

    @ObfuscatedName("ao.u")
    public int field859 = -1;

    @ObfuscatedName("ao.y")
    public int field867 = -1;

    @ObfuscatedName("ao.b")
    public int field847 = 99;

    @ObfuscatedName("ao.t")
    public int field862 = -1;

    @ObfuscatedName("ao.r")
    public int field868 = -1;

    @ObfuscatedName("ao.g")
    public int field863 = 2;

    @ObfuscatedName("u.x(Lej;Lej;Lej;I)V")
    public static void method133(class152 arg0, class152 arg1, class152 arg2) {
        Statics.field860 = arg0;
        Statics.field2429 = arg1;
        Statics.field848 = arg2;
    }

    @ObfuscatedName("client.p(II)Lao;")
    public static class34 method516(int arg0) {
        class34 var1 = (class34) field861.method3196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field860.method2920(12, arg0);
        class34 var3 = new class34();
        if (var2 != null) {
            var3.method685(new class127(var2));
        }
        var3.method680();
        field861.method3197(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.k(Ldg;I)V")
    public void method685(class127 arg0) {
        while (true) {
            int var2 = arg0.method2484();
            if (var2 == 0) {
                return;
            }
            this.method688(arg0, var2);
        }
    }

    @ObfuscatedName("ao.a(Ldg;II)V")
    public void method688(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2539();
            this.field853 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field853[var4] = arg0.method2539();
            }
            this.field851 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field851[var5] = arg0.method2539();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field851[var6] += arg0.method2539() << 16;
            }
        } else if (arg1 == 2) {
            this.field864 = arg0.method2539();
        } else if (arg1 == 3) {
            int var7 = arg0.method2484();
            this.field856 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field856[var8] = arg0.method2484();
            }
            this.field856[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field857 = true;
        } else if (arg1 == 5) {
            this.field858 = arg0.method2484();
        } else if (arg1 == 6) {
            this.field859 = arg0.method2539();
        } else if (arg1 == 7) {
            this.field867 = arg0.method2539();
        } else if (arg1 == 8) {
            this.field847 = arg0.method2484();
        } else if (arg1 == 9) {
            this.field862 = arg0.method2484();
        } else if (arg1 == 10) {
            this.field868 = arg0.method2484();
        } else if (arg1 == 11) {
            this.field863 = arg0.method2484();
        } else if (arg1 == 12) {
            int var9 = arg0.method2484();
            this.field852 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field852[var10] = arg0.method2539();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field852[var11] += arg0.method2539() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2484();
            this.field854 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field854[var13] = arg0.method2403();
            }
        }
    }

    @ObfuscatedName("ao.q(B)V")
    public void method680() {
        if (this.field862 == -1) {
            if (this.field856 == null) {
                this.field862 = 0;
            } else {
                this.field862 = 2;
            }
        }
        if (this.field868 != -1) {
            return;
        }
        if (this.field856 == null) {
            this.field868 = 0;
        } else {
            this.field868 = 2;
        }
    }

    @ObfuscatedName("ao.j(Ldi;II)Ldi;")
    public class112 method686(class112 arg0, int arg1) {
        int var3 = this.field851[arg1];
        class109 var4 = method144(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2207(true);
        } else {
            class112 var6 = arg0.method2207(!var4.method2169(var5));
            var6.method2197(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ao.v(Ldi;III)Ldi;")
    public class112 method682(class112 arg0, int arg1, int arg2) {
        int var4 = this.field851[arg1];
        class109 var5 = method144(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2207(true);
        }
        class112 var7 = arg0.method2207(!var5.method2169(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2202();
        } else if (var8 == 2) {
            var7.method2201();
        } else if (var8 == 3) {
            var7.method2200();
        }
        var7.method2197(var5, var6);
        if (var8 == 1) {
            var7.method2200();
        } else if (var8 == 2) {
            var7.method2201();
        } else if (var8 == 3) {
            var7.method2202();
        }
        return var7;
    }

    @ObfuscatedName("ao.w(Ldi;II)Ldi;")
    public class112 method683(class112 arg0, int arg1) {
        int var3 = this.field851[arg1];
        class109 var4 = method144(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2193(true);
        } else {
            class112 var6 = arg0.method2193(!var4.method2169(var5));
            var6.method2197(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ao.l(Ldi;ILao;IB)Ldi;")
    public class112 method684(class112 arg0, int arg1, class34 arg2, int arg3) {
        int var5 = this.field851[arg1];
        class109 var6 = method144(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method686(arg0, arg3);
        }
        int var8 = arg2.field851[arg3];
        class109 var9 = method144(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class112 var11 = arg0.method2207(!var6.method2169(var7));
            var11.method2197(var6, var7);
            return var11;
        } else {
            class112 var12 = arg0.method2207(!var6.method2169(var7) & !var9.method2169(var10));
            var12.method2198(var6, var7, var9, var10, this.field856);
            return var12;
        }
    }

    @ObfuscatedName("ao.s(Ldi;II)Ldi;")
    public class112 method706(class112 arg0, int arg1) {
        int var3 = this.field851[arg1];
        class109 var4 = method144(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2207(true);
        }
        class109 var6 = null;
        int var7 = 0;
        if (this.field852 != null && arg1 < this.field852.length) {
            int var8 = this.field852[arg1];
            var6 = method144(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class112 var10 = arg0.method2207(!var4.method2169(var5));
            var10.method2197(var4, var5);
            return var10;
        } else {
            class112 var9 = arg0.method2207(!var4.method2169(var5) & !var6.method2169(var7));
            var9.method2197(var4, var5);
            var9.method2197(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("r.n(II)Ldv;")
    public static class109 method144(int arg0) {
        class109 var1 = (class109) field850.method3196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class152 var2 = Statics.field2429;
        class152 var3 = Statics.field848;
        boolean var4 = true;
        int[] var5 = var2.method2982(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2922(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2922(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class109 var10;
        if (var4) {
            try {
                var10 = new class109(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field850.method3197(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("o.c(I)V")
    public static void method194() {
        field861.method3198();
        field850.method3198();
    }
}
