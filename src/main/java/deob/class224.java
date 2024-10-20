package deob;

@ObfuscatedName("hu")
public class class224 {

    @ObfuscatedName("hu.n")
    public int[] field2564;

    @ObfuscatedName("hu.v")
    public int[] field2563;

    @ObfuscatedName("hu.d")
    public boolean field2565;

    @ObfuscatedName("hu.c")
    public int field2569;

    @ObfuscatedName("hu.y")
    public long field2567;

    @ObfuscatedName("hu.h")
    public long field2568;

    @ObfuscatedName("hu.s")
    public static final int[] field2570 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hu.b")
    public static class155 field2571 = new class155(260);

    @ObfuscatedName("hu.n([I[IZII)V")
    public void method3839(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3297; var6++) {
                    class257 var7 = Statics.method1681(var6);
                    if (var7 != null && !var7.field3308 && var5 + (arg2 ? 7 : 0) == var7.field3301) {
                        arg0[field2570[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2564 = arg0;
        this.field2563 = arg1;
        this.field2565 = arg2;
        this.field2569 = arg3;
        this.method3855();
    }

    @ObfuscatedName("hu.v(IZB)V")
    public void method3840(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2565) {
            return;
        }
        int var3 = this.field2564[field2570[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class257 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3297) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3297 - 1;
                }
            }
            var4 = Statics.method1681(var3);
        } while (var4 == null || var4.field3308 || var4.field3301 != arg0 + (this.field2565 ? 7 : 0));
        this.field2564[field2570[arg0]] = var3 + 256;
        this.method3855();
    }

    @ObfuscatedName("hu.d(IZI)V")
    public void method3841(int arg0, boolean arg1) {
        int var3 = this.field2563[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1340[arg0].length) {
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
                    var3 = Statics.field1340[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2563[arg0] = var3;
        this.method3855();
    }

    @ObfuscatedName("hu.c(ZB)V")
    public void method3842(boolean arg0) {
        if (this.field2565 != arg0) {
            this.method3839((int[]) null, this.field2563, arg0, -1);
        }
    }

    @ObfuscatedName("hu.y(Lkx;I)V")
    public void method3843(class311 arg0) {
        arg0.method5279(this.field2565 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2564[field2570[var2]];
            if (var3 == 0) {
                arg0.method5279(-1);
            } else {
                arg0.method5279(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method5279(this.field2563[var4]);
        }
    }

    @ObfuscatedName("hu.h(B)V")
    public void method3855() {
        long var1 = this.field2567;
        int var3 = this.field2564[5];
        int var4 = this.field2564[9];
        this.field2564[5] = var4;
        this.field2564[9] = var3;
        this.field2567 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2567 <<= 0x4;
            if (this.field2564[var5] >= 256) {
                this.field2567 += (long) (this.field2564[var5] - 256);
            }
        }
        if (this.field2564[0] >= 256) {
            this.field2567 += (long) (this.field2564[0] - 256 >> 4);
        }
        if (this.field2564[1] >= 256) {
            this.field2567 += (long) (this.field2564[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2567 <<= 0x3;
            this.field2567 += (long) this.field2563[var6];
        }
        this.field2567 <<= 0x1;
        this.field2567 += (long) (this.field2565 ? 1 : 0);
        this.field2564[5] = var3;
        this.field2564[9] = var4;
        if (var1 != 0L && this.field2567 != var1) {
            field2571.method3216(var1);
        }
    }

    @ObfuscatedName("hu.z(Ljs;ILjs;IB)Lef;")
    public class137 method3845(class270 arg0, int arg1, class270 arg2, int arg3) {
        if (this.field2569 != -1) {
            return class268.method2020(this.field2569).method4549(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2567;
        int[] var7 = this.field2564;
        if (arg0 != null && (arg0.field3559 >= 0 || arg0.field3567 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2564[var8];
            }
            if (arg0.field3559 >= 0) {
                var5 += (long) (arg0.field3559 - this.field2564[5] << 40);
                var7[5] = arg0.field3559;
            }
            if (arg0.field3567 >= 0) {
                var5 += (long) (arg0.field3567 - this.field2564[3] << 48);
                var7[3] = arg0.field3567;
            }
        }
        class137 var9 = (class137) field2571.method3220(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !Statics.method1681(var12 - 256).method4247()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class266.method4793(var12 - 512).method4470(this.field2565)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2568 != -1L) {
                    var9 = (class137) field2571.method3220(this.field2568);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class131[] var13 = new class131[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class131 var17 = Statics.method1681(var16 - 256).method4248();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class131 var18 = class266.method4793(var16 - 512).method4471(this.field2565);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class131 var19 = new class131(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2563[var20] < Statics.field1340[var20].length) {
                        var19.method2715(Statics.field2566[var20], Statics.field1340[var20][this.field2563[var20]]);
                    }
                    if (this.field2563[var20] < Statics.field260[var20].length) {
                        var19.method2715(Statics.field1144[var20], Statics.field260[var20][this.field2563[var20]]);
                    }
                }
                var9 = var19.method2721(64, 850, -30, -50, -30);
                field2571.method3217(var9, var5);
                this.field2568 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class137 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4590(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4587(var9, arg3);
        } else {
            var21 = arg0.method4587(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hu.e(I)Lek;")
    public class131 method3846() {
        if (this.field2569 != -1) {
            return class268.method2020(this.field2569).method4533();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2564[var2];
            if (var3 >= 256 && var3 < 512 && !Statics.method1681(var3 - 256).method4245()) {
                var1 = true;
            }
            if (var3 >= 512 && !class266.method4793(var3 - 512).method4484(this.field2565)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class131[] var4 = new class131[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2564[var6];
            if (var7 >= 256 && var7 < 512) {
                class131 var8 = Statics.method1681(var7 - 256).method4244();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class131 var9 = class266.method4793(var7 - 512).method4485(this.field2565);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class131 var10 = new class131(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2563[var11] < Statics.field1340[var11].length) {
                var10.method2715(Statics.field2566[var11], Statics.field1340[var11][this.field2563[var11]]);
            }
            if (this.field2563[var11] < Statics.field260[var11].length) {
                var10.method2715(Statics.field1144[var11], Statics.field260[var11][this.field2563[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hu.q(I)I")
    public int method3847() {
        return this.field2569 == -1 ? (this.field2564[11] << 5) + (this.field2564[8] << 10) + (this.field2564[0] << 15) + (this.field2563[0] << 25) + (this.field2563[4] << 20) + this.field2564[1] : 305419896 + class268.method2020(this.field2569).field3502;
    }
}
