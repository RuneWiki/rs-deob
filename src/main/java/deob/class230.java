package deob;

@ObfuscatedName("hp")
public class class230 {

    @ObfuscatedName("hp.c")
    public int[] field2609;

    @ObfuscatedName("hp.q")
    public int[] field2605;

    @ObfuscatedName("hp.m")
    public boolean field2606;

    @ObfuscatedName("hp.j")
    public int field2604;

    @ObfuscatedName("hp.g")
    public long field2608;

    @ObfuscatedName("hp.i")
    public long field2610;

    @ObfuscatedName("hp.s")
    public static final int[] field2607 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hp.k")
    public static class203 field2611 = new class203(260);

    @ObfuscatedName("hp.c([I[IZIB)V")
    public void method4053(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3338; var6++) {
                    class263 var7 = class263.method4450(var6);
                    if (var7 != null && !var7.field3339 && var7.field3332 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2607[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2609 = arg0;
        this.field2605 = arg1;
        this.field2606 = arg2;
        this.field2604 = arg3;
        this.method4058();
    }

    @ObfuscatedName("hp.q(IZI)V")
    public void method4054(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2606) {
            return;
        }
        int var3 = this.field2609[field2607[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class263 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3338) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3338 - 1;
                }
            }
            var4 = class263.method4450(var3);
        } while (var4 == null || var4.field3339 || var4.field3332 != (this.field2606 ? 7 : 0) + arg0);
        this.field2609[field2607[arg0]] = var3 + 256;
        this.method4058();
    }

    @ObfuscatedName("hp.m(IZI)V")
    public void method4055(int arg0, boolean arg1) {
        int var3 = this.field2605[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1968[arg0].length) {
                    var3 = 0;
                }
            } while (!class231.method3139(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1968[arg0].length - 1;
                }
            } while (!class231.method3139(arg0, var3));
        }
        this.field2605[arg0] = var3;
        this.method4058();
    }

    @ObfuscatedName("hp.j(ZI)V")
    public void method4060(boolean arg0) {
        if (this.field2606 != arg0) {
            this.method4053((int[]) null, this.field2605, arg0, -1);
        }
    }

    @ObfuscatedName("hp.g(Lgg;I)V")
    public void method4059(class185 arg0) {
        arg0.method3227(this.field2606 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2609[field2607[var2]];
            if (var3 == 0) {
                arg0.method3227(-1);
            } else {
                arg0.method3227(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3227(this.field2605[var4]);
        }
    }

    @ObfuscatedName("hp.i(I)V")
    public void method4058() {
        long var1 = this.field2608;
        int var3 = this.field2609[5];
        int var4 = this.field2609[9];
        this.field2609[5] = var4;
        this.field2609[9] = var3;
        this.field2608 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2608 <<= 0x4;
            if (this.field2609[var5] >= 256) {
                this.field2608 += (long) (this.field2609[var5] - 256);
            }
        }
        if (this.field2609[0] >= 256) {
            this.field2608 += (long) (this.field2609[0] - 256 >> 4);
        }
        if (this.field2609[1] >= 256) {
            this.field2608 += (long) (this.field2609[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2608 <<= 0x3;
            this.field2608 += (long) this.field2605[var6];
        }
        this.field2608 <<= 0x1;
        this.field2608 += (long) (this.field2606 ? 1 : 0);
        this.field2609[5] = var3;
        this.field2609[9] = var4;
        if (var1 != 0L && this.field2608 != var1) {
            field2611.method3645(var1);
        }
    }

    @ObfuscatedName("hp.h(Ljk;ILjk;II)Ldx;")
    public class122 method4080(class276 arg0, int arg1, class276 arg2, int arg3) {
        if (this.field2604 != -1) {
            return class274.method1993(this.field2604).method4801(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2608;
        int[] var7 = this.field2609;
        if (arg0 != null && (arg0.field3593 >= 0 || arg0.field3589 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2609[var8];
            }
            if (arg0.field3593 >= 0) {
                var5 += (long) (arg0.field3593 - this.field2609[5] << 40);
                var7[5] = arg0.field3593;
            }
            if (arg0.field3589 >= 0) {
                var5 += (long) (arg0.field3589 - this.field2609[3] << 48);
                var7[3] = arg0.field3589;
            }
        }
        class122 var9 = (class122) field2611.method3654(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class263.method4450(var12 - 256).method4517()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class272.method1730(var12 - 512).method4736(this.field2606)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2610 != -1L) {
                    var9 = (class122) field2611.method3654(this.field2610);
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
                        class116 var17 = class263.method4450(var16 - 256).method4507();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class116 var18 = class272.method1730(var16 - 512).method4737(this.field2606);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class116 var19 = new class116(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2605[var20] < Statics.field1968[var20].length) {
                        var19.method2330(Statics.field72[var20], Statics.field1968[var20][this.field2605[var20]]);
                    }
                    if (this.field2605[var20] < Statics.field1129[var20].length) {
                        var19.method2330(Statics.field105[var20], Statics.field1129[var20][this.field2605[var20]]);
                    }
                }
                var9 = var19.method2338(64, 850, -30, -50, -30);
                field2611.method3646(var9, var5);
                this.field2610 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class122 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4850(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4852(var9, arg3);
        } else {
            var21 = arg0.method4852(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hp.l(B)Ldf;")
    public class116 method4063() {
        if (this.field2604 != -1) {
            return class274.method1993(this.field2604).method4810();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2609[var2];
            if (var3 >= 256 && var3 < 512 && !class263.method4450(var3 - 256).method4508()) {
                var1 = true;
            }
            if (var3 >= 512 && !class272.method1730(var3 - 512).method4738(this.field2606)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class116[] var4 = new class116[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2609[var6];
            if (var7 >= 256 && var7 < 512) {
                class116 var8 = class263.method4450(var7 - 256).method4509();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class116 var9 = class272.method1730(var7 - 512).method4730(this.field2606);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class116 var10 = new class116(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2605[var11] < Statics.field1968[var11].length) {
                var10.method2330(Statics.field72[var11], Statics.field1968[var11][this.field2605[var11]]);
            }
            if (this.field2605[var11] < Statics.field1129[var11].length) {
                var10.method2330(Statics.field105[var11], Statics.field1129[var11][this.field2605[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hp.o(S)I")
    public int method4056() {
        return this.field2604 == -1 ? (this.field2609[11] << 5) + (this.field2609[8] << 10) + (this.field2609[0] << 15) + (this.field2605[0] << 25) + (this.field2605[4] << 20) + this.field2609[1] : 305419896 + class274.method1993(this.field2604).field3536;
    }
}
