package deob;

@ObfuscatedName("gm")
public class class202 extends class130 {

    @ObfuscatedName("gm.h")
    public static class125 field3046 = new class125(64);

    @ObfuscatedName("gm.w")
    public static class125 field3047 = new class125(100);

    @ObfuscatedName("gm.r")
    public int[] field3048;

    @ObfuscatedName("gm.c")
    public int[] field3049;

    @ObfuscatedName("gm.p")
    public int[] field3051;

    @ObfuscatedName("gm.g")
    public int[] field3057;

    @ObfuscatedName("gm.z")
    public int field3062 = -1;

    @ObfuscatedName("gm.q")
    public int[] field3053;

    @ObfuscatedName("gm.l")
    public boolean field3054 = false;

    @ObfuscatedName("gm.y")
    public int field3055 = 5;

    @ObfuscatedName("gm.e")
    public int field3060 = -1;

    @ObfuscatedName("gm.x")
    public int field3052 = -1;

    @ObfuscatedName("gm.f")
    public int field3056 = 99;

    @ObfuscatedName("gm.s")
    public int field3059 = -1;

    @ObfuscatedName("gm.o")
    public int field3063 = -1;

    @ObfuscatedName("gm.i")
    public int field3061 = 2;

    @ObfuscatedName("z.n(II)Lgm;")
    public static class202 method119(int arg0) {
        class202 var1 = (class202) field3046.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3050.method3093(12, arg0);
        class202 var3 = new class202();
        if (var2 != null) {
            var3.method3554(new class161(var2));
        }
        var3.method3556();
        field3046.method2219(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gm.d(Lfa;I)V")
    public void method3554(class161 arg0) {
        while (true) {
            int var2 = arg0.method2823();
            if (var2 == 0) {
                return;
            }
            this.method3555(arg0, var2);
        }
    }

    @ObfuscatedName("gm.m(Lfa;IB)V")
    public void method3555(class161 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2887();
            this.field3051 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3051[var4] = arg0.method2887();
            }
            this.field3048 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3048[var5] = arg0.method2887();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3048[var6] += arg0.method2887() << 16;
            }
        } else if (arg1 == 2) {
            this.field3062 = arg0.method2887();
        } else if (arg1 == 3) {
            int var7 = arg0.method2823();
            this.field3053 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3053[var8] = arg0.method2823();
            }
            this.field3053[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3054 = true;
        } else if (arg1 == 5) {
            this.field3055 = arg0.method2823();
        } else if (arg1 == 6) {
            this.field3060 = arg0.method2887();
        } else if (arg1 == 7) {
            this.field3052 = arg0.method2887();
        } else if (arg1 == 8) {
            this.field3056 = arg0.method2823();
        } else if (arg1 == 9) {
            this.field3059 = arg0.method2823();
        } else if (arg1 == 10) {
            this.field3063 = arg0.method2823();
        } else if (arg1 == 11) {
            this.field3061 = arg0.method2823();
        } else if (arg1 == 12) {
            int var9 = arg0.method2823();
            this.field3049 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3049[var10] = arg0.method2887();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3049[var11] += arg0.method2887() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2823();
            this.field3057 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3057[var13] = arg0.method2784();
            }
        }
    }

    @ObfuscatedName("gm.h(I)V")
    public void method3556() {
        if (this.field3059 == -1) {
            if (this.field3053 == null) {
                this.field3059 = 0;
            } else {
                this.field3059 = 2;
            }
        }
        if (this.field3063 != -1) {
            return;
        }
        if (this.field3053 == null) {
            this.field3063 = 0;
        } else {
            this.field3063 = 2;
        }
    }

    @ObfuscatedName("gm.w(Lca;II)Lca;")
    public class83 method3557(class83 arg0, int arg1) {
        int var3 = this.field3048[arg1];
        class93 var4 = method3163(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1492(true);
        } else {
            class83 var6 = arg0.method1492(!var4.method1826(var5));
            var6.method1563(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gm.r(Lca;III)Lca;")
    public class83 method3558(class83 arg0, int arg1, int arg2) {
        int var4 = this.field3048[arg1];
        class93 var5 = method3163(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1492(true);
        }
        class83 var7 = arg0.method1492(!var5.method1826(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1502();
        } else if (var8 == 2) {
            var7.method1499();
        } else if (var8 == 3) {
            var7.method1500();
        }
        var7.method1563(var5, var6);
        if (var8 == 1) {
            var7.method1500();
        } else if (var8 == 2) {
            var7.method1499();
        } else if (var8 == 3) {
            var7.method1502();
        }
        return var7;
    }

    @ObfuscatedName("gm.c(Lca;II)Lca;")
    public class83 method3567(class83 arg0, int arg1) {
        int var3 = this.field3048[arg1];
        class93 var4 = method3163(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1493(true);
        } else {
            class83 var6 = arg0.method1493(!var4.method1826(var5));
            var6.method1563(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gm.z(Lca;ILgm;IS)Lca;")
    public class83 method3563(class83 arg0, int arg1, class202 arg2, int arg3) {
        int var5 = this.field3048[arg1];
        class93 var6 = method3163(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3557(arg0, arg3);
        }
        int var8 = arg2.field3048[arg3];
        class93 var9 = method3163(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class83 var11 = arg0.method1492(!var6.method1826(var7));
            var11.method1563(var6, var7);
            return var11;
        } else {
            class83 var12 = arg0.method1492(!var6.method1826(var7) & !var9.method1826(var10));
            var12.method1539(var6, var7, var9, var10, this.field3053);
            return var12;
        }
    }

    @ObfuscatedName("gm.q(Lca;II)Lca;")
    public class83 method3579(class83 arg0, int arg1) {
        int var3 = this.field3048[arg1];
        class93 var4 = method3163(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1492(true);
        }
        class93 var6 = null;
        int var7 = 0;
        if (this.field3049 != null && arg1 < this.field3049.length) {
            int var8 = this.field3049[arg1];
            var6 = method3163(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class83 var10 = arg0.method1492(!var4.method1826(var5));
            var10.method1563(var4, var5);
            return var10;
        } else {
            class83 var9 = arg0.method1492(!var4.method1826(var5) & !var6.method1826(var7));
            var9.method1563(var4, var5);
            var9.method1563(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("gj.l(II)Lcj;")
    public static class93 method3163(int arg0) {
        class93 var1 = (class93) field3047.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class183 var2 = Statics.field3282;
        class183 var3 = Statics.field3045;
        boolean var4 = true;
        int[] var5 = var2.method3102(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3099(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3099(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class93 var10;
        if (var4) {
            try {
                var10 = new class93(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field3047.method2219(var10, (long) arg0);
        }
        return var10;
    }
}
