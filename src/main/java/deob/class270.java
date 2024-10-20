package deob;

@ObfuscatedName("js")
public class class270 extends class185 {

    @ObfuscatedName("js.c")
    public static class155 field3552 = new class155(64);

    @ObfuscatedName("js.y")
    public static class155 field3551 = new class155(100);

    @ObfuscatedName("js.h")
    public int[] field3554;

    @ObfuscatedName("js.z")
    public int[] field3563;

    @ObfuscatedName("js.e")
    public int[] field3556;

    @ObfuscatedName("js.q")
    public int[] field3557;

    @ObfuscatedName("js.l")
    public int field3558 = -1;

    @ObfuscatedName("js.s")
    public int[] field3553;

    @ObfuscatedName("js.b")
    public boolean field3560 = false;

    @ObfuscatedName("js.a")
    public int field3561 = 5;

    @ObfuscatedName("js.w")
    public int field3559 = -1;

    @ObfuscatedName("js.k")
    public int field3567 = -1;

    @ObfuscatedName("js.i")
    public int field3564 = 99;

    @ObfuscatedName("js.x")
    public int field3565 = -1;

    @ObfuscatedName("js.f")
    public int field3566 = -1;

    @ObfuscatedName("js.g")
    public int field3549 = 2;

    @ObfuscatedName("da.n(Lig;Lig;Lig;I)V")
    public static void method2695(class245 arg0, class245 arg1, class245 arg2) {
        Statics.field3555 = arg0;
        Statics.field3550 = arg1;
        Statics.field3562 = arg2;
    }

    @ObfuscatedName("js.d(Lkx;I)V")
    public void method4588(class311 arg0) {
        while (true) {
            int var2 = arg0.method5310();
            if (var2 == 0) {
                return;
            }
            this.method4585(arg0, var2);
        }
    }

    @ObfuscatedName("js.c(Lkx;II)V")
    public void method4585(class311 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5247();
            this.field3556 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3556[var4] = arg0.method5247();
            }
            this.field3554 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3554[var5] = arg0.method5247();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3554[var6] += arg0.method5247() << 16;
            }
        } else if (arg1 == 2) {
            this.field3558 = arg0.method5247();
        } else if (arg1 == 3) {
            int var7 = arg0.method5310();
            this.field3553 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3553[var8] = arg0.method5310();
            }
            this.field3553[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3560 = true;
        } else if (arg1 == 5) {
            this.field3561 = arg0.method5310();
        } else if (arg1 == 6) {
            this.field3559 = arg0.method5247();
        } else if (arg1 == 7) {
            this.field3567 = arg0.method5247();
        } else if (arg1 == 8) {
            this.field3564 = arg0.method5310();
        } else if (arg1 == 9) {
            this.field3565 = arg0.method5310();
        } else if (arg1 == 10) {
            this.field3566 = arg0.method5310();
        } else if (arg1 == 11) {
            this.field3549 = arg0.method5310();
        } else if (arg1 == 12) {
            int var9 = arg0.method5310();
            this.field3563 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3563[var10] = arg0.method5247();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3563[var11] += arg0.method5247() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method5310();
            this.field3557 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3557[var13] = arg0.method5263();
            }
        }
    }

    @ObfuscatedName("js.y(B)V")
    public void method4600() {
        if (this.field3565 == -1) {
            if (this.field3553 == null) {
                this.field3565 = 0;
            } else {
                this.field3565 = 2;
            }
        }
        if (this.field3566 != -1) {
            return;
        }
        if (this.field3553 == null) {
            this.field3566 = 0;
        } else {
            this.field3566 = 2;
        }
    }

    @ObfuscatedName("js.h(Lef;II)Lef;")
    public class137 method4587(class137 arg0, int arg1) {
        int var3 = this.field3554[arg1];
        class148 var4 = method1809(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2826(true);
        } else {
            class137 var6 = arg0.method2826(!var4.method3177(var5));
            var6.method2804(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("js.z(Lef;IIS)Lef;")
    public class137 method4593(class137 arg0, int arg1, int arg2) {
        int var4 = this.field3554[arg1];
        class148 var5 = method1809(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2826(true);
        }
        class137 var7 = arg0.method2826(!var5.method3177(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2808();
        } else if (var8 == 2) {
            var7.method2862();
        } else if (var8 == 3) {
            var7.method2806();
        }
        var7.method2804(var5, var6);
        if (var8 == 1) {
            var7.method2806();
        } else if (var8 == 2) {
            var7.method2862();
        } else if (var8 == 3) {
            var7.method2808();
        }
        return var7;
    }

    @ObfuscatedName("js.e(Lef;IB)Lef;")
    public class137 method4589(class137 arg0, int arg1) {
        int var3 = this.field3554[arg1];
        class148 var4 = method1809(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2797(true);
        } else {
            class137 var6 = arg0.method2797(!var4.method3177(var5));
            var6.method2804(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("js.q(Lef;ILjs;II)Lef;")
    public class137 method4590(class137 arg0, int arg1, class270 arg2, int arg3) {
        int var5 = this.field3554[arg1];
        class148 var6 = method1809(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4587(arg0, arg3);
        }
        int var8 = arg2.field3554[arg3];
        class148 var9 = method1809(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class137 var11 = arg0.method2826(!var6.method3177(var7));
            var11.method2804(var6, var7);
            return var11;
        } else {
            class137 var12 = arg0.method2826(!var6.method3177(var7) & !var9.method3177(var10));
            var12.method2805(var6, var7, var9, var10, this.field3553);
            return var12;
        }
    }

    @ObfuscatedName("js.l(Lef;II)Lef;")
    public class137 method4591(class137 arg0, int arg1) {
        int var3 = this.field3554[arg1];
        class148 var4 = method1809(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2826(true);
        }
        class148 var6 = null;
        int var7 = 0;
        if (this.field3563 != null && arg1 < this.field3563.length) {
            int var8 = this.field3563[arg1];
            var6 = method1809(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class137 var10 = arg0.method2826(!var4.method3177(var5));
            var10.method2804(var4, var5);
            return var10;
        } else {
            class137 var9 = arg0.method2826(!var4.method3177(var5) & !var6.method3177(var7));
            var9.method2804(var4, var5);
            var9.method2804(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("cf.s(II)Lel;")
    public static class148 method1809(int arg0) {
        class148 var1 = (class148) field3551.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class148 var2 = class148.method3357(Statics.field3550, Statics.field3562, arg0, false);
        if (var2 != null) {
            field3551.method3217(var2, (long) arg0);
        }
        return var2;
    }
}
