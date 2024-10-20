package deob;

@ObfuscatedName("ix")
public class class259 extends class176 {

    @ObfuscatedName("ix.u")
    public static class146 field3517 = new class146(64);

    @ObfuscatedName("ix.r")
    public static class146 field3503 = new class146(100);

    @ObfuscatedName("ix.p")
    public int[] field3515;

    @ObfuscatedName("ix.q")
    public int[] field3506;

    @ObfuscatedName("ix.m")
    public int[] field3507;

    @ObfuscatedName("ix.y")
    public int[] field3508;

    @ObfuscatedName("ix.i")
    public int field3509 = -1;

    @ObfuscatedName("ix.c")
    public int[] field3510;

    @ObfuscatedName("ix.b")
    public boolean field3505 = false;

    @ObfuscatedName("ix.o")
    public int field3512 = 5;

    @ObfuscatedName("ix.a")
    public int field3513 = -1;

    @ObfuscatedName("ix.e")
    public int field3514 = -1;

    @ObfuscatedName("ix.w")
    public int field3504 = 99;

    @ObfuscatedName("ix.t")
    public int field3516 = -1;

    @ObfuscatedName("ix.g")
    public int field3511 = -1;

    @ObfuscatedName("ix.x")
    public int field3518 = 2;

    @ObfuscatedName("bz.z(Lhp;Lhp;Lhp;I)V")
    public static void method1034(class234 arg0, class234 arg1, class234 arg2) {
        Statics.field3519 = arg0;
        Statics.field3502 = arg1;
        Statics.field2325 = arg2;
    }

    @ObfuscatedName("c.n(II)Lix;")
    public static class259 method122(int arg0) {
        class259 var1 = (class259) field3517.method2992((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3519.method3726(12, arg0);
        class259 var3 = new class259();
        if (var2 != null) {
            var3.method4315(new class300(var2));
        }
        var3.method4344();
        field3517.method2994(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.v(Lkl;B)V")
    public void method4315(class300 arg0) {
        while (true) {
            int var2 = arg0.method4990();
            if (var2 == 0) {
                return;
            }
            this.method4331(arg0, var2);
        }
    }

    @ObfuscatedName("ix.u(Lkl;II)V")
    public void method4331(class300 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method4992();
            this.field3507 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3507[var4] = arg0.method4992();
            }
            this.field3515 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3515[var5] = arg0.method4992();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3515[var6] += arg0.method4992() << 16;
            }
        } else if (arg1 == 2) {
            this.field3509 = arg0.method4992();
        } else if (arg1 == 3) {
            int var7 = arg0.method4990();
            this.field3510 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3510[var8] = arg0.method4990();
            }
            this.field3510[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3505 = true;
        } else if (arg1 == 5) {
            this.field3512 = arg0.method4990();
        } else if (arg1 == 6) {
            this.field3513 = arg0.method4992();
        } else if (arg1 == 7) {
            this.field3514 = arg0.method4992();
        } else if (arg1 == 8) {
            this.field3504 = arg0.method4990();
        } else if (arg1 == 9) {
            this.field3516 = arg0.method4990();
        } else if (arg1 == 10) {
            this.field3511 = arg0.method4990();
        } else if (arg1 == 11) {
            this.field3518 = arg0.method4990();
        } else if (arg1 == 12) {
            int var9 = arg0.method4990();
            this.field3506 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3506[var10] = arg0.method4992();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3506[var11] += arg0.method4992() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method4990();
            this.field3508 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3508[var13] = arg0.method4994();
            }
        }
    }

    @ObfuscatedName("ix.r(S)V")
    public void method4344() {
        if (this.field3516 == -1) {
            if (this.field3510 == null) {
                this.field3516 = 0;
            } else {
                this.field3516 = 2;
            }
        }
        if (this.field3511 != -1) {
            return;
        }
        if (this.field3510 == null) {
            this.field3511 = 0;
        } else {
            this.field3511 = 2;
        }
    }

    @ObfuscatedName("ix.p(Ldh;II)Ldh;")
    public class128 method4318(class128 arg0, int arg1) {
        int var3 = this.field3515[arg1];
        class139 var4 = method3711(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2588(true);
        } else {
            class128 var6 = arg0.method2588(!var4.method2959(var5));
            var6.method2596(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ix.q(Ldh;IIB)Ldh;")
    public class128 method4319(class128 arg0, int arg1, int arg2) {
        int var4 = this.field3515[arg1];
        class139 var5 = method3711(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2588(true);
        }
        class128 var7 = arg0.method2588(!var5.method2959(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2601();
        } else if (var8 == 2) {
            var7.method2600();
        } else if (var8 == 3) {
            var7.method2599();
        }
        var7.method2596(var5, var6);
        if (var8 == 1) {
            var7.method2599();
        } else if (var8 == 2) {
            var7.method2600();
        } else if (var8 == 3) {
            var7.method2601();
        }
        return var7;
    }

    @ObfuscatedName("ix.m(Ldh;II)Ldh;")
    public class128 method4320(class128 arg0, int arg1) {
        int var3 = this.field3515[arg1];
        class139 var4 = method3711(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2595(true);
        } else {
            class128 var6 = arg0.method2595(!var4.method2959(var5));
            var6.method2596(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ix.y(Ldh;ILix;IB)Ldh;")
    public class128 method4317(class128 arg0, int arg1, class259 arg2, int arg3) {
        int var5 = this.field3515[arg1];
        class139 var6 = method3711(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4318(arg0, arg3);
        }
        int var8 = arg2.field3515[arg3];
        class139 var9 = method3711(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class128 var11 = arg0.method2588(!var6.method2959(var7));
            var11.method2596(var6, var7);
            return var11;
        } else {
            class128 var12 = arg0.method2588(!var6.method2959(var7) & !var9.method2959(var10));
            var12.method2652(var6, var7, var9, var10, this.field3510);
            return var12;
        }
    }

    @ObfuscatedName("ix.i(Ldh;IB)Ldh;")
    public class128 method4326(class128 arg0, int arg1) {
        int var3 = this.field3515[arg1];
        class139 var4 = method3711(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2588(true);
        }
        class139 var6 = null;
        int var7 = 0;
        if (this.field3506 != null && arg1 < this.field3506.length) {
            int var8 = this.field3506[arg1];
            var6 = method3711(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class128 var10 = arg0.method2588(!var4.method2959(var5));
            var10.method2596(var4, var5);
            return var10;
        } else {
            class128 var9 = arg0.method2588(!var4.method2959(var5) & !var6.method2959(var7));
            var9.method2596(var4, var5);
            var9.method2596(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("hd.c(II)Lep;")
    public static class139 method3711(int arg0) {
        class139 var1 = (class139) field3503.method2992((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class234 var2 = Statics.field3502;
        class234 var3 = Statics.field2325;
        boolean var4 = true;
        int[] var5 = var2.method3748(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3734(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3734(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class139 var10;
        if (var4) {
            try {
                var10 = new class139(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field3503.method2994(var10, (long) arg0);
        }
        return var10;
    }
}
