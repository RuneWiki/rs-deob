package deob;

@ObfuscatedName("ij")
public class class259 extends class176 {

    @ObfuscatedName("ij.k")
    public static class146 field3494 = new class146(64);

    @ObfuscatedName("ij.u")
    public static class146 field3495 = new class146(100);

    @ObfuscatedName("ij.n")
    public int[] field3496;

    @ObfuscatedName("ij.t")
    public int[] field3497;

    @ObfuscatedName("ij.q")
    public int[] field3498;

    @ObfuscatedName("ij.x")
    public int[] field3499;

    @ObfuscatedName("ij.d")
    public int field3500 = -1;

    @ObfuscatedName("ij.f")
    public int[] field3501;

    @ObfuscatedName("ij.c")
    public boolean field3502 = false;

    @ObfuscatedName("ij.r")
    public int field3509 = 5;

    @ObfuscatedName("ij.y")
    public int field3504 = -1;

    @ObfuscatedName("ij.p")
    public int field3505 = -1;

    @ObfuscatedName("ij.b")
    public int field3503 = 99;

    @ObfuscatedName("ij.g")
    public int field3507 = -1;

    @ObfuscatedName("ij.e")
    public int field3506 = -1;

    @ObfuscatedName("ij.z")
    public int field3493 = 2;

    @ObfuscatedName("ij.i(Lky;B)V")
    public void method4360(class300 arg0) {
        while (true) {
            int var2 = arg0.method5179();
            if (var2 == 0) {
                return;
            }
            this.method4361(arg0, var2);
        }
    }

    @ObfuscatedName("ij.k(Lky;II)V")
    public void method4361(class300 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5054();
            this.field3498 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3498[var4] = arg0.method5054();
            }
            this.field3496 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3496[var5] = arg0.method5054();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3496[var6] += arg0.method5054() << 16;
            }
        } else if (arg1 == 2) {
            this.field3500 = arg0.method5054();
        } else if (arg1 == 3) {
            int var7 = arg0.method5179();
            this.field3501 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3501[var8] = arg0.method5179();
            }
            this.field3501[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3502 = true;
        } else if (arg1 == 5) {
            this.field3509 = arg0.method5179();
        } else if (arg1 == 6) {
            this.field3504 = arg0.method5054();
        } else if (arg1 == 7) {
            this.field3505 = arg0.method5054();
        } else if (arg1 == 8) {
            this.field3503 = arg0.method5179();
        } else if (arg1 == 9) {
            this.field3507 = arg0.method5179();
        } else if (arg1 == 10) {
            this.field3506 = arg0.method5179();
        } else if (arg1 == 11) {
            this.field3493 = arg0.method5179();
        } else if (arg1 == 12) {
            int var9 = arg0.method5179();
            this.field3497 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3497[var10] = arg0.method5054();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3497[var11] += arg0.method5054() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method5179();
            this.field3499 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3499[var13] = arg0.method5169();
            }
        }
    }

    @ObfuscatedName("ij.u(I)V")
    public void method4362() {
        if (this.field3507 == -1) {
            if (this.field3501 == null) {
                this.field3507 = 0;
            } else {
                this.field3507 = 2;
            }
        }
        if (this.field3506 != -1) {
            return;
        }
        if (this.field3501 == null) {
            this.field3506 = 0;
        } else {
            this.field3506 = 2;
        }
    }

    @ObfuscatedName("ij.n(Ldo;II)Ldo;")
    public class128 method4368(class128 arg0, int arg1) {
        int var3 = this.field3496[arg1];
        class139 var4 = method348(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2623(true);
        } else {
            class128 var6 = arg0.method2623(!var4.method3036(var5));
            var6.method2631(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ij.t(Ldo;III)Ldo;")
    public class128 method4364(class128 arg0, int arg1, int arg2) {
        int var4 = this.field3496[arg1];
        class139 var5 = method348(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2623(true);
        }
        class128 var7 = arg0.method2623(!var5.method3036(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2636();
        } else if (var8 == 2) {
            var7.method2660();
        } else if (var8 == 3) {
            var7.method2668();
        }
        var7.method2631(var5, var6);
        if (var8 == 1) {
            var7.method2668();
        } else if (var8 == 2) {
            var7.method2660();
        } else if (var8 == 3) {
            var7.method2636();
        }
        return var7;
    }

    @ObfuscatedName("ij.q(Ldo;IB)Ldo;")
    public class128 method4365(class128 arg0, int arg1) {
        int var3 = this.field3496[arg1];
        class139 var4 = method348(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2624(true);
        } else {
            class128 var6 = arg0.method2624(!var4.method3036(var5));
            var6.method2631(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ij.x(Ldo;ILij;II)Ldo;")
    public class128 method4366(class128 arg0, int arg1, class259 arg2, int arg3) {
        int var5 = this.field3496[arg1];
        class139 var6 = method348(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4368(arg0, arg3);
        }
        int var8 = arg2.field3496[arg3];
        class139 var9 = method348(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class128 var11 = arg0.method2623(!var6.method3036(var7));
            var11.method2631(var6, var7);
            return var11;
        } else {
            class128 var12 = arg0.method2623(!var6.method3036(var7) & !var9.method3036(var10));
            var12.method2632(var6, var7, var9, var10, this.field3501);
            return var12;
        }
    }

    @ObfuscatedName("ij.d(Ldo;II)Ldo;")
    public class128 method4367(class128 arg0, int arg1) {
        int var3 = this.field3496[arg1];
        class139 var4 = method348(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2623(true);
        }
        class139 var6 = null;
        int var7 = 0;
        if (this.field3497 != null && arg1 < this.field3497.length) {
            int var8 = this.field3497[arg1];
            var6 = method348(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class128 var10 = arg0.method2623(!var4.method3036(var5));
            var10.method2631(var4, var5);
            return var10;
        } else {
            class128 var9 = arg0.method2623(!var4.method3036(var5) & !var6.method3036(var7));
            var9.method2631(var4, var5);
            var9.method2631(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("am.f(II)Lee;")
    public static class139 method348(int arg0) {
        class139 var1 = (class139) field3495.method3065((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class234 var2 = Statics.field3491;
        class234 var3 = Statics.field3492;
        boolean var4 = true;
        int[] var5 = var2.method3770(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3856(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3856(var8, 0);
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
            field3495.method3067(var10, (long) arg0);
        }
        return var10;
    }
}
