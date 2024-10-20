package deob;

@ObfuscatedName("hv")
public class class214 {

    @ObfuscatedName("hv.d")
    public int[] field2631;

    @ObfuscatedName("hv.k")
    public int[] field2630;

    @ObfuscatedName("hv.e")
    public boolean field2638;

    @ObfuscatedName("hv.p")
    public int field2632;

    @ObfuscatedName("hv.q")
    public long field2633;

    @ObfuscatedName("hv.s")
    public long field2634;

    @ObfuscatedName("hv.y")
    public static final int[] field2635 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hv.o")
    public static class190 field2629 = new class190(260);

    @ObfuscatedName("hv.d([I[IZIB)V")
    public void method3763(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3351; var6++) {
                    class248 var7 = class248.method3771(var6);
                    if (var7 != null && !var7.field3352 && var5 + (arg2 ? 7 : 0) == var7.field3353) {
                        arg0[field2635[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2631 = arg0;
        this.field2630 = arg1;
        this.field2638 = arg2;
        this.field2632 = arg3;
        this.method3742();
    }

    @ObfuscatedName("hv.k(IZB)V")
    public void method3745(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2638) {
            return;
        }
        int var3 = this.field2631[field2635[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class248 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3351) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3351 - 1;
                }
            }
            var4 = class248.method3771(var3);
        } while (var4 == null || var4.field3352 || var4.field3353 != arg0 + (this.field2638 ? 7 : 0));
        this.field2631[field2635[arg0]] = var3 + 256;
        this.method3742();
    }

    @ObfuscatedName("hv.e(IZI)V")
    public void method3740(int arg0, boolean arg1) {
        int var3 = this.field2630[arg0];
        boolean var4;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2605[arg0].length) {
                    var3 = 0;
                }
            } while (!class215.method1759(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2605[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2630[arg0] = var3;
        this.method3742();
    }

    @ObfuscatedName("hv.p(ZI)V")
    public void method3744(boolean arg0) {
        if (this.field2638 != arg0) {
            this.method3763((int[]) null, this.field2630, arg0, -1);
        }
    }

    @ObfuscatedName("hv.q(Lfg;I)V")
    public void method3741(class174 arg0) {
        arg0.method2970(this.field2638 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2631[field2635[var2]];
            if (var3 == 0) {
                arg0.method2970(-1);
            } else {
                arg0.method2970(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2970(this.field2630[var4]);
        }
    }

    @ObfuscatedName("hv.s(I)V")
    public void method3742() {
        long var1 = this.field2633;
        int var3 = this.field2631[5];
        int var4 = this.field2631[9];
        this.field2631[5] = var4;
        this.field2631[9] = var3;
        this.field2633 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2633 <<= 0x4;
            if (this.field2631[var5] >= 256) {
                this.field2633 += (long) (this.field2631[var5] - 256);
            }
        }
        if (this.field2631[0] >= 256) {
            this.field2633 += (long) (this.field2631[0] - 256 >> 4);
        }
        if (this.field2631[1] >= 256) {
            this.field2633 += (long) (this.field2631[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2633 <<= 0x3;
            this.field2633 += (long) this.field2630[var6];
        }
        this.field2633 <<= 0x1;
        this.field2633 += (long) (this.field2638 ? 1 : 0);
        this.field2631[5] = var3;
        this.field2631[9] = var4;
        if (var1 != 0L && this.field2633 != var1) {
            field2629.method3342(var1);
        }
    }

    @ObfuscatedName("hv.r(Ljl;ILjl;II)Leb;")
    public class132 method3739(class261 arg0, int arg1, class261 arg2, int arg3) {
        if (this.field2632 != -1) {
            return class259.method1066(this.field2632).method4367(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2633;
        int[] var7 = this.field2631;
        if (arg0 != null && (arg0.field3617 >= 0 || arg0.field3618 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2631[var8];
            }
            if (arg0.field3617 >= 0) {
                var5 += (long) (arg0.field3617 - this.field2631[5] << 40);
                var7[5] = arg0.field3617;
            }
            if (arg0.field3618 >= 0) {
                var5 += (long) (arg0.field3618 - this.field2631[3] << 48);
                var7[3] = arg0.field3618;
            }
        }
        class132 var9 = (class132) field2629.method3341(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class248.method3771(var12 - 256).method4102()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class257.method637(var12 - 512).method4311(this.field2638)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2634 != -1L) {
                    var9 = (class132) field2629.method3341(this.field2634);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class126[] var13 = new class126[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class126 var17 = class248.method3771(var16 - 256).method4103();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class126 var18 = class257.method637(var16 - 512).method4312(this.field2638);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class126 var19 = new class126(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2630[var20] < Statics.field2605[var20].length) {
                        var19.method2284(Statics.field2229[var20], Statics.field2605[var20][this.field2630[var20]]);
                    }
                    if (this.field2630[var20] < Statics.field1649[var20].length) {
                        var19.method2284(Statics.field1768[var20], Statics.field1649[var20][this.field2630[var20]]);
                    }
                }
                var9 = var19.method2290(64, 850, -30, -50, -30);
                field2629.method3343(var9, var5);
                this.field2634 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class132 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4419(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4439(var9, arg3);
        } else {
            var21 = arg0.method4439(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hv.g(B)Ldl;")
    public class126 method3753() {
        if (this.field2632 != -1) {
            return class259.method1066(this.field2632).method4384();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2631[var2];
            if (var3 >= 256 && var3 < 512 && !class248.method3771(var3 - 256).method4104()) {
                var1 = true;
            }
            if (var3 >= 512 && !class257.method637(var3 - 512).method4329(this.field2638)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class126[] var4 = new class126[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2631[var6];
            if (var7 >= 256 && var7 < 512) {
                class126 var8 = class248.method3771(var7 - 256).method4118();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class126 var9 = class257.method637(var7 - 512).method4313(this.field2638);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class126 var10 = new class126(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2630[var11] < Statics.field2605[var11].length) {
                var10.method2284(Statics.field2229[var11], Statics.field2605[var11][this.field2630[var11]]);
            }
            if (this.field2630[var11] < Statics.field1649[var11].length) {
                var10.method2284(Statics.field1768[var11], Statics.field1649[var11][this.field2630[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hv.v(B)I")
    public int method3737() {
        return this.field2632 == -1 ? (this.field2631[11] << 5) + (this.field2631[8] << 10) + (this.field2631[0] << 15) + (this.field2630[4] << 20) + (this.field2630[0] << 25) + this.field2631[1] : 305419896 + class259.method1066(this.field2632).field3574;
    }
}
