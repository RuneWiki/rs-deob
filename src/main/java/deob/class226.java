package deob;

@ObfuscatedName("hi")
public class class226 {

    @ObfuscatedName("hi.m")
    public int[] field2617;

    @ObfuscatedName("hi.f")
    public int[] field2610;

    @ObfuscatedName("hi.q")
    public boolean field2611;

    @ObfuscatedName("hi.w")
    public int field2615;

    @ObfuscatedName("hi.o")
    public long field2613;

    @ObfuscatedName("hi.u")
    public long field2614;

    @ObfuscatedName("hi.d")
    public static final int[] field2612 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hi.k")
    public static class146 field2616 = new class146(260);

    @ObfuscatedName("hi.m([I[IZII)V")
    public void method4026(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3350; var6++) {
                    class257 var7 = class257.method672(var6);
                    if (var7 != null && !var7.field3340 && var5 + (arg2 ? 7 : 0) == var7.field3342) {
                        arg0[field2612[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2617 = arg0;
        this.field2610 = arg1;
        this.field2611 = arg2;
        this.field2615 = arg3;
        this.method4045();
    }

    @ObfuscatedName("hi.f(IZI)V")
    public void method4027(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2611) {
            return;
        }
        int var3 = this.field2617[field2612[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class257 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3350) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3350 - 1;
                }
            }
            var4 = class257.method672(var3);
        } while (var4 == null || var4.field3340 || arg0 + (this.field2611 ? 7 : 0) != var4.field3342);
        this.field2617[field2612[arg0]] = var3 + 256;
        this.method4045();
    }

    @ObfuscatedName("hi.q(IZI)V")
    public void method4028(int arg0, boolean arg1) {
        int var3 = this.field2610[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2788[arg0].length) {
                    var3 = 0;
                }
            } while (!class227.method3704(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2788[arg0].length - 1;
                }
            } while (!class227.method3704(arg0, var3));
        }
        this.field2610[arg0] = var3;
        this.method4045();
    }

    @ObfuscatedName("hi.w(ZB)V")
    public void method4029(boolean arg0) {
        if (this.field2611 != arg0) {
            this.method4026((int[]) null, this.field2610, arg0, -1);
        }
    }

    @ObfuscatedName("hi.o(Lgr;I)V")
    public void method4030(class202 arg0) {
        arg0.method3565(this.field2611 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2617[field2612[var2]];
            if (var3 == 0) {
                arg0.method3565(-1);
            } else {
                arg0.method3565(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3565(this.field2610[var4]);
        }
    }

    @ObfuscatedName("hi.u(B)V")
    public void method4045() {
        long var1 = this.field2613;
        int var3 = this.field2617[5];
        int var4 = this.field2617[9];
        this.field2617[5] = var4;
        this.field2617[9] = var3;
        this.field2613 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2613 <<= 0x4;
            if (this.field2617[var5] >= 256) {
                this.field2613 += (long) (this.field2617[var5] - 256);
            }
        }
        if (this.field2617[0] >= 256) {
            this.field2613 += (long) (this.field2617[0] - 256 >> 4);
        }
        if (this.field2617[1] >= 256) {
            this.field2613 += (long) (this.field2617[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2613 <<= 0x3;
            this.field2613 += (long) this.field2610[var6];
        }
        this.field2613 <<= 0x1;
        this.field2613 += (long) (this.field2611 ? 1 : 0);
        this.field2617[5] = var3;
        this.field2617[9] = var4;
        if (var1 != 0L && this.field2613 != var1) {
            field2616.method3008(var1);
        }
    }

    @ObfuscatedName("hi.g(Ljh;ILjh;II)Ldu;")
    public class128 method4031(class270 arg0, int arg1, class270 arg2, int arg3) {
        if (this.field2615 != -1) {
            return class268.method4643(this.field2615).method4705(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2613;
        int[] var7 = this.field2617;
        if (arg0 != null && (arg0.field3595 >= 0 || arg0.field3584 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2617[var8];
            }
            if (arg0.field3595 >= 0) {
                var5 += (long) (arg0.field3595 - this.field2617[5] << 40);
                var7[5] = arg0.field3595;
            }
            if (arg0.field3584 >= 0) {
                var5 += (long) (arg0.field3584 - this.field2617[3] << 48);
                var7[3] = arg0.field3584;
            }
        }
        class128 var9 = (class128) field2616.method3011(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class257.method672(var12 - 256).method4438()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class266.method4129(var12 - 512).method4654(this.field2611)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2614 != -1L) {
                    var9 = (class128) field2616.method3011(this.field2614);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class122[] var13 = new class122[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class122 var17 = class257.method672(var16 - 256).method4464();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class122 var18 = class266.method4129(var16 - 512).method4655(this.field2611);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class122 var19 = new class122(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2610[var20] < Statics.field2788[var20].length) {
                        var19.method2538(Statics.field2609[var20], Statics.field2788[var20][this.field2610[var20]]);
                    }
                    if (this.field2610[var20] < Statics.field505[var20].length) {
                        var19.method2538(Statics.field2627[var20], Statics.field505[var20][this.field2610[var20]]);
                    }
                }
                var9 = var19.method2572(64, 850, -30, -50, -30);
                field2616.method3009(var9, var5);
                this.field2614 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class128 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4787(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4768(var9, arg3);
        } else {
            var21 = arg0.method4768(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hi.l(I)Ldw;")
    public class122 method4033() {
        if (this.field2615 != -1) {
            return class268.method4643(this.field2615).method4709();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2617[var2];
            if (var3 >= 256 && var3 < 512 && !class257.method672(var3 - 256).method4443()) {
                var1 = true;
            }
            if (var3 >= 512 && !class266.method4129(var3 - 512).method4656(this.field2611)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class122[] var4 = new class122[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2617[var6];
            if (var7 >= 256 && var7 < 512) {
                class122 var8 = class257.method672(var7 - 256).method4444();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class122 var9 = class266.method4129(var7 - 512).method4670(this.field2611);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class122 var10 = new class122(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2610[var11] < Statics.field2788[var11].length) {
                var10.method2538(Statics.field2609[var11], Statics.field2788[var11][this.field2610[var11]]);
            }
            if (this.field2610[var11] < Statics.field505[var11].length) {
                var10.method2538(Statics.field2627[var11], Statics.field505[var11][this.field2610[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hi.e(B)I")
    public int method4032() {
        return this.field2615 == -1 ? (this.field2617[11] << 5) + (this.field2617[8] << 10) + (this.field2617[0] << 15) + (this.field2610[0] << 25) + (this.field2610[4] << 20) + this.field2617[1] : 305419896 + class268.method4643(this.field2615).field3537;
    }
}
