package deob;

@ObfuscatedName("fe")
public class class73 {

    @ObfuscatedName("fe.o")
    public boolean field695;

    @ObfuscatedName("fe.j")
    public int[] field700;

    @ObfuscatedName("fe.h")
    public long field694;

    @ObfuscatedName("fe.t")
    public int field699;

    @ObfuscatedName("fe.r")
    public long field690;

    @ObfuscatedName("fe.p")
    public int[] field697;

    @ObfuscatedName("fe.z")
    public static class67 field692 = new class67(260);

    @ObfuscatedName("fe.x")
    public static final int[] field698 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fe.j([I[IZII)V")
    public void method960(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field161; var6++) {
                    class161 var7 = class161.method2754(var6);
                    if (var7 != null && !var7.field2413 && var7.field2402 == (arg2 ? 7 : 0) + var5) {
                        arg0[field698[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field700 = arg0;
        this.field697 = arg1;
        this.field695 = arg2;
        this.field699 = arg3;
        this.method965();
    }

    @ObfuscatedName("fe.o(IZB)V")
    public void method962(int arg0, boolean arg1) {
        int var3 = this.field697[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field696[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field696[arg0].length - 1;
            }
        }
        this.field697[arg0] = var3;
        this.method965();
    }

    @ObfuscatedName("fe.r(I)V")
    public void method965() {
        long var1 = this.field694;
        int var3 = this.field700[5];
        int var4 = this.field700[9];
        this.field700[5] = var4;
        this.field700[9] = var3;
        this.field694 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field694 <<= 0x4;
            if (this.field700[var5] >= 256) {
                this.field694 += (long) (this.field700[var5] - 256);
            }
        }
        if (this.field700[0] >= 256) {
            this.field694 += (long) (this.field700[0] - 256 >> 4);
        }
        if (this.field700[1] >= 256) {
            this.field694 += (long) (this.field700[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field694 <<= 0x3;
            this.field694 += (long) this.field697[var6];
        }
        this.field694 <<= 0x1;
        this.field694 += (long) (this.field695 ? 1 : 0);
        this.field700[5] = var3;
        this.field700[9] = var4;
        if (var1 != 0L && this.field694 != var1) {
            field692.method909(var1);
        }
    }

    @ObfuscatedName("fe.n(Laq;ILaq;II)Ldi;")
    public class41 method966(class166 arg0, int arg1, class166 arg2, int arg3) {
        if (this.field699 != -1) {
            return class183.method616(this.field699).method3476(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field694;
        int[] var7 = this.field700;
        if (arg0 != null && (arg0.field2542 >= 0 || arg0.field2536 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field700[var8];
            }
            if (arg0.field2542 >= 0) {
                var5 += (long) (arg0.field2542 - this.field700[5] << 40);
                var7[5] = arg0.field2542;
            }
            if (arg0.field2536 >= 0) {
                var5 += (long) (arg0.field2536 - this.field700[3] << 48);
                var7[3] = arg0.field2536;
            }
        }
        class41 var9 = (class41) field692.method908(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class161.method2754(var12 - 256).method3045()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class165.method3520(var12 - 512).method3129(this.field695)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field690 != -1L) {
                    var9 = (class41) field692.method908(this.field690);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class142[] var13 = new class142[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class142 var17 = class161.method2754(var16 - 256).method3046();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class142 var18 = class165.method3520(var16 - 512).method3154(this.field695);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class142 var19 = new class142(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field697[var20] < Statics.field696[var20].length) {
                        var19.method2542(Statics.field235[var20], Statics.field696[var20][this.field697[var20]]);
                    }
                    if (this.field697[var20] < Statics.field693[var20].length) {
                        var19.method2542(Statics.field2864[var20], Statics.field693[var20][this.field697[var20]]);
                    }
                }
                var9 = var19.method2603(64, 850, -30, -50, -30);
                field692.method907(var9, var5);
                this.field690 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class41 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method3187(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method3175(var9, arg3);
        } else {
            var21 = arg0.method3175(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fe.e(B)I")
    public int method968() {
        return this.field699 == -1 ? (this.field700[11] << 5) + (this.field700[8] << 10) + (this.field700[0] << 15) + (this.field697[0] << 25) + (this.field697[4] << 20) + this.field700[1] : 305419896 + class183.method616(this.field699).field2754;
    }

    @ObfuscatedName("fe.p(IZI)V")
    public void method972(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field695) {
            return;
        }
        int var3 = this.field700[field698[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class161 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field161) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field161 - 1;
                }
            }
            var4 = class161.method2754(var3);
        } while (var4 == null || var4.field2413 || var4.field2402 != arg0 + (this.field695 ? 7 : 0));
        this.field700[field698[arg0]] = var3 + 256;
        this.method965();
    }

    @ObfuscatedName("fe.t(ZI)V")
    public void method979(boolean arg0) {
        if (this.field695 != arg0) {
            this.method960((int[]) null, this.field697, arg0, -1);
        }
    }

    @ObfuscatedName("fe.h(Ldy;I)V")
    public void method988(class31 arg0) {
        arg0.method357(this.field695 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field700[field698[var2]];
            if (var3 == 0) {
                arg0.method357(-1);
            } else {
                arg0.method357(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method357(this.field697[var4]);
        }
    }

    @ObfuscatedName("fe.g(I)Lct;")
    public class142 method995() {
        if (this.field699 != -1) {
            return class183.method616(this.field699).method3474();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field700[var2];
            if (var3 >= 256 && var3 < 512 && !class161.method2754(var3 - 256).method3047()) {
                var1 = true;
            }
            if (var3 >= 512 && !class165.method3520(var3 - 512).method3130(this.field695)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class142[] var4 = new class142[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field700[var6];
            if (var7 >= 256 && var7 < 512) {
                class142 var8 = class161.method2754(var7 - 256).method3048();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class142 var9 = class165.method3520(var7 - 512).method3132(this.field695);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class142 var10 = new class142(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field697[var11] < Statics.field696[var11].length) {
                var10.method2542(Statics.field235[var11], Statics.field696[var11][this.field697[var11]]);
            }
            if (this.field697[var11] < Statics.field693[var11].length) {
                var10.method2542(Statics.field2864[var11], Statics.field693[var11][this.field697[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ay.f(I)V")
    public static void method3076() {
        field692.method910();
    }
}
