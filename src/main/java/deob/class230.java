package deob;

@ObfuscatedName("hm")
public class class230 {

    @ObfuscatedName("hm.v")
    public int[] field2608;

    @ObfuscatedName("hm.s")
    public int[] field2615;

    @ObfuscatedName("hm.o")
    public boolean field2609;

    @ObfuscatedName("hm.k")
    public int field2610;

    @ObfuscatedName("hm.u")
    public long field2612;

    @ObfuscatedName("hm.i")
    public long field2607;

    @ObfuscatedName("hm.c")
    public static final int[] field2616 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hm.d")
    public static class203 field2611 = new class203(260);

    @ObfuscatedName("hm.v([I[IZII)V")
    public void method4131(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3320; var6++) {
                    class263 var7 = Statics.method3039(var6);
                    if (var7 != null && !var7.field3330 && var7.field3323 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2616[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2608 = arg0;
        this.field2615 = arg1;
        this.field2609 = arg2;
        this.field2610 = arg3;
        this.method4145();
    }

    @ObfuscatedName("hm.s(IZB)V")
    public void method4148(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2609) {
            return;
        }
        int var3 = this.field2608[field2616[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class263 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3320) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3320 - 1;
                }
            }
            var4 = Statics.method3039(var3);
        } while (var4 == null || var4.field3330 || var4.field3323 != (this.field2609 ? 7 : 0) + arg0);
        this.field2608[field2616[arg0]] = var3 + 256;
        this.method4145();
    }

    @ObfuscatedName("hm.o(IZI)V")
    public void method4133(int arg0, boolean arg1) {
        int var3 = this.field2615[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1923[arg0].length) {
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
                    var3 = Statics.field1923[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2615[arg0] = var3;
        this.method4145();
    }

    @ObfuscatedName("hm.k(ZI)V")
    public void method4147(boolean arg0) {
        if (this.field2609 != arg0) {
            this.method4131((int[]) null, this.field2615, arg0, -1);
        }
    }

    @ObfuscatedName("hm.u(Lgx;I)V")
    public void method4135(class185 arg0) {
        arg0.method3258(this.field2609 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2608[field2616[var2]];
            if (var3 == 0) {
                arg0.method3258(-1);
            } else {
                arg0.method3258(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3258(this.field2615[var4]);
        }
    }

    @ObfuscatedName("hm.i(I)V")
    public void method4145() {
        long var1 = this.field2612;
        int var3 = this.field2608[5];
        int var4 = this.field2608[9];
        this.field2608[5] = var4;
        this.field2608[9] = var3;
        this.field2612 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2612 <<= 0x4;
            if (this.field2608[var5] >= 256) {
                this.field2612 += (long) (this.field2608[var5] - 256);
            }
        }
        if (this.field2608[0] >= 256) {
            this.field2612 += (long) (this.field2608[0] - 256 >> 4);
        }
        if (this.field2608[1] >= 256) {
            this.field2612 += (long) (this.field2608[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2612 <<= 0x3;
            this.field2612 += (long) this.field2615[var6];
        }
        this.field2612 <<= 0x1;
        this.field2612 += (long) (this.field2609 ? 1 : 0);
        this.field2608[5] = var3;
        this.field2608[9] = var4;
        if (var1 != 0L && this.field2612 != var1) {
            field2611.method3688(var1);
        }
    }

    @ObfuscatedName("hm.t(Ljb;ILjb;II)Lda;")
    public class122 method4137(class276 arg0, int arg1, class276 arg2, int arg3) {
        if (this.field2610 != -1) {
            return class274.method1807(this.field2610).method4812(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2612;
        int[] var7 = this.field2608;
        if (arg0 != null && (arg0.field3577 >= 0 || arg0.field3574 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2608[var8];
            }
            if (arg0.field3577 >= 0) {
                var5 += (long) (arg0.field3577 - this.field2608[5] << 40);
                var7[5] = arg0.field3577;
            }
            if (arg0.field3574 >= 0) {
                var5 += (long) (arg0.field3574 - this.field2608[3] << 48);
                var7[3] = arg0.field3574;
            }
        }
        class122 var9 = (class122) field2611.method3687(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !Statics.method3039(var12 - 256).method4567()) {
                    var10 = true;
                }
                if (var12 >= 512 && !Statics.method945(var12 - 512).method4804(this.field2609)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2607 != -1L) {
                    var9 = (class122) field2611.method3687(this.field2607);
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
                        class116 var17 = Statics.method3039(var16 - 256).method4564();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class116 var18 = Statics.method945(var16 - 512).method4751(this.field2609);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class116 var19 = new class116(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2615[var20] < Statics.field1923[var20].length) {
                        var19.method2391(Statics.field2613[var20], Statics.field1923[var20][this.field2615[var20]]);
                    }
                    if (this.field2615[var20] < Statics.field2617[var20].length) {
                        var19.method2391(Statics.field2614[var20], Statics.field2617[var20][this.field2615[var20]]);
                    }
                }
                var9 = var19.method2399(64, 850, -30, -50, -30);
                field2611.method3689(var9, var5);
                this.field2607 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class122 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4865(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4862(var9, arg3);
        } else {
            var21 = arg0.method4862(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hm.c(B)Ldc;")
    public class116 method4138() {
        if (this.field2610 != -1) {
            return class274.method1807(this.field2610).method4828();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2608[var2];
            if (var3 >= 256 && var3 < 512 && !Statics.method3039(var3 - 256).method4559()) {
                var1 = true;
            }
            if (var3 >= 512 && !Statics.method945(var3 - 512).method4798(this.field2609)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class116[] var4 = new class116[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2608[var6];
            if (var7 >= 256 && var7 < 512) {
                class116 var8 = Statics.method3039(var7 - 256).method4560();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class116 var9 = Statics.method945(var7 - 512).method4745(this.field2609);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class116 var10 = new class116(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2615[var11] < Statics.field1923[var11].length) {
                var10.method2391(Statics.field2613[var11], Statics.field1923[var11][this.field2615[var11]]);
            }
            if (this.field2615[var11] < Statics.field2617[var11].length) {
                var10.method2391(Statics.field2614[var11], Statics.field2617[var11][this.field2615[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hm.w(B)I")
    public int method4144() {
        return this.field2610 == -1 ? (this.field2608[11] << 5) + (this.field2608[8] << 10) + (this.field2608[0] << 15) + (this.field2615[0] << 25) + (this.field2615[4] << 20) + this.field2608[1] : 305419896 + class274.method1807(this.field2610).field3532;
    }
}
