package deob;

@ObfuscatedName("hj")
public class class230 {

    @ObfuscatedName("hj.f")
    public int[] field2628;

    @ObfuscatedName("hj.h")
    public int[] field2625;

    @ObfuscatedName("hj.e")
    public boolean field2632;

    @ObfuscatedName("hj.b")
    public int field2626;

    @ObfuscatedName("hj.l")
    public long field2635;

    @ObfuscatedName("hj.w")
    public long field2629;

    @ObfuscatedName("hj.a")
    public static final int[] field2633 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hj.r")
    public static class203 field2636 = new class203(260);

    @ObfuscatedName("hj.f([I[IZII)V")
    public void method4137(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3347; var6++) {
                    class263 var7 = class263.method1480(var6);
                    if (var7 != null && !var7.field3351 && var5 + (arg2 ? 7 : 0) == var7.field3349) {
                        arg0[field2633[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2628 = arg0;
        this.field2625 = arg1;
        this.field2632 = arg2;
        this.field2626 = arg3;
        this.method4140();
    }

    @ObfuscatedName("hj.h(IZB)V")
    public void method4156(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2632) {
            return;
        }
        int var3 = this.field2628[field2633[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class263 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3347) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3347 - 1;
                }
            }
            var4 = class263.method1480(var3);
        } while (var4 == null || var4.field3351 || (this.field2632 ? 7 : 0) + arg0 != var4.field3349);
        this.field2628[field2633[arg0]] = var3 + 256;
        this.method4140();
    }

    @ObfuscatedName("hj.e(IZI)V")
    public void method4134(int arg0, boolean arg1) {
        int var3 = this.field2625[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2631[arg0].length) {
                    var3 = 0;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var5 = false;
                } else {
                    var5 = true;
                }
            } while (!var5);
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2631[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2625[arg0] = var3;
        this.method4140();
    }

    @ObfuscatedName("hj.b(ZI)V")
    public void method4135(boolean arg0) {
        if (this.field2632 != arg0) {
            this.method4137((int[]) null, this.field2625, arg0, -1);
        }
    }

    @ObfuscatedName("hj.l(Lgx;I)V")
    public void method4141(class185 arg0) {
        arg0.method3531(this.field2632 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2628[field2633[var2]];
            if (var3 == 0) {
                arg0.method3531(-1);
            } else {
                arg0.method3531(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3531(this.field2625[var4]);
        }
    }

    @ObfuscatedName("hj.w(I)V")
    public void method4140() {
        long var1 = this.field2635;
        int var3 = this.field2628[5];
        int var4 = this.field2628[9];
        this.field2628[5] = var4;
        this.field2628[9] = var3;
        this.field2635 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2635 <<= 0x4;
            if (this.field2628[var5] >= 256) {
                this.field2635 += (long) (this.field2628[var5] - 256);
            }
        }
        if (this.field2628[0] >= 256) {
            this.field2635 += (long) (this.field2628[0] - 256 >> 4);
        }
        if (this.field2628[1] >= 256) {
            this.field2635 += (long) (this.field2628[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2635 <<= 0x3;
            this.field2635 += (long) this.field2625[var6];
        }
        this.field2635 <<= 0x1;
        this.field2635 += (long) (this.field2632 ? 1 : 0);
        this.field2628[5] = var3;
        this.field2628[9] = var4;
        if (var1 != 0L && this.field2635 != var1) {
            field2636.method3732(var1);
        }
    }

    @ObfuscatedName("hj.d(Ljv;ILjv;II)Lds;")
    public class122 method4138(class276 arg0, int arg1, class276 arg2, int arg3) {
        if (this.field2626 != -1) {
            return class274.method3290(this.field2626).method4819(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2635;
        int[] var7 = this.field2628;
        if (arg0 != null && (arg0.field3605 >= 0 || arg0.field3606 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2628[var8];
            }
            if (arg0.field3605 >= 0) {
                var5 += (long) (arg0.field3605 - this.field2628[5] << 40);
                var7[5] = arg0.field3605;
            }
            if (arg0.field3606 >= 0) {
                var5 += (long) (arg0.field3606 - this.field2628[3] << 48);
                var7[3] = arg0.field3606;
            }
        }
        class122 var9 = (class122) field2636.method3724(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class263.method1480(var12 - 256).method4535()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class272.method2892(var12 - 512).method4732(this.field2632)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2629 != -1L) {
                    var9 = (class122) field2636.method3724(this.field2629);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class116[] var13 = new class116[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class116 var17 = class263.method1480(var16 - 256).method4527();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class116 var18 = class272.method2892(var16 - 512).method4778(this.field2632);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class116 var19 = new class116(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2625[var20] < Statics.field2631[var20].length) {
                        var19.method2398(Statics.field2630[var20], Statics.field2631[var20][this.field2625[var20]]);
                    }
                    if (this.field2625[var20] < Statics.field1072[var20].length) {
                        var19.method2398(Statics.field2624[var20], Statics.field1072[var20][this.field2625[var20]]);
                    }
                }
                var9 = var19.method2406(64, 850, -30, -50, -30);
                field2636.method3723(var9, var5);
                this.field2629 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class122 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4846(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4848(var9, arg3);
        } else {
            var21 = arg0.method4848(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hj.n(I)Ldt;")
    public class116 method4139() {
        if (this.field2626 != -1) {
            return class274.method3290(this.field2626).method4811();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2628[var2];
            if (var3 >= 256 && var3 < 512 && !class263.method1480(var3 - 256).method4528()) {
                var1 = true;
            }
            if (var3 >= 512 && !class272.method2892(var3 - 512).method4734(this.field2632)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class116[] var4 = new class116[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2628[var6];
            if (var7 >= 256 && var7 < 512) {
                class116 var8 = class263.method1480(var7 - 256).method4529();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class116 var9 = class272.method2892(var7 - 512).method4735(this.field2632);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class116 var10 = new class116(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2625[var11] < Statics.field2631[var11].length) {
                var10.method2398(Statics.field2630[var11], Statics.field2631[var11][this.field2625[var11]]);
            }
            if (this.field2625[var11] < Statics.field1072[var11].length) {
                var10.method2398(Statics.field2624[var11], Statics.field1072[var11][this.field2625[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hj.s(I)I")
    public int method4154() {
        return this.field2626 == -1 ? (this.field2628[11] << 5) + (this.field2628[8] << 10) + (this.field2628[0] << 15) + (this.field2625[4] << 20) + (this.field2625[0] << 25) + this.field2628[1] : 305419896 + class274.method3290(this.field2626).field3558;
    }

    @ObfuscatedName("he.g(I)V")
    public static void method4013() {
        field2636.method3725();
    }
}
