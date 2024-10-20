package deob;

@ObfuscatedName("fk")
public class class161 {

    @ObfuscatedName("fk.g")
    public int[] field2678;

    @ObfuscatedName("fk.e")
    public int[] field2681;

    @ObfuscatedName("fk.n")
    public boolean field2674;

    @ObfuscatedName("fk.j")
    public int field2675;

    @ObfuscatedName("fk.i")
    public long field2676;

    @ObfuscatedName("fk.o")
    public long field2677;

    @ObfuscatedName("fk.r")
    public static final int[] field2673 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fk.a")
    public static class168 field2682 = new class168(260);

    @ObfuscatedName("fk.g([I[IZIB)V")
    public void method3249(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field904; var6++) {
                    class35 var7 = class35.method3210(var6);
                    if (var7 != null && !var7.field910 && (arg2 ? 7 : 0) + var5 == var7.field906) {
                        arg0[field2673[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2678 = arg0;
        this.field2681 = arg1;
        this.field2674 = arg2;
        this.field2675 = arg3;
        this.method3234();
    }

    @ObfuscatedName("fk.e(IZI)V")
    public void method3240(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2674) {
            return;
        }
        int var3 = this.field2678[field2673[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class35 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field904) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field904 - 1;
                }
            }
            var4 = class35.method3210(var3);
        } while (var4 == null || var4.field910 || arg0 + (this.field2674 ? 7 : 0) != var4.field906);
        this.field2678[field2673[arg0]] = var3 + 256;
        this.method3234();
    }

    @ObfuscatedName("fk.n(IZI)V")
    public void method3230(int arg0, boolean arg1) {
        int var3 = this.field2681[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2679[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2679[arg0].length - 1;
            }
        }
        this.field2681[arg0] = var3;
        this.method3234();
    }

    @ObfuscatedName("fk.j(ZI)V")
    public void method3232(boolean arg0) {
        if (this.field2674 != arg0) {
            this.method3249((int[]) null, this.field2681, arg0, -1);
        }
    }

    @ObfuscatedName("fk.i(Ldu;I)V")
    public void method3233(class126 arg0) {
        arg0.method2472(this.field2674 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2678[field2673[var2]];
            if (var3 == 0) {
                arg0.method2472(-1);
            } else {
                arg0.method2472(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2472(this.field2681[var4]);
        }
    }

    @ObfuscatedName("fk.o(I)V")
    public void method3234() {
        long var1 = this.field2676;
        int var3 = this.field2678[5];
        int var4 = this.field2678[9];
        this.field2678[5] = var4;
        this.field2678[9] = var3;
        this.field2676 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2676 <<= 0x4;
            if (this.field2678[var5] >= 256) {
                this.field2676 += (long) (this.field2678[var5] - 256);
            }
        }
        if (this.field2678[0] >= 256) {
            this.field2676 += (long) (this.field2678[0] - 256 >> 4);
        }
        if (this.field2678[1] >= 256) {
            this.field2676 += (long) (this.field2678[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2676 <<= 0x3;
            this.field2676 += (long) this.field2681[var6];
        }
        this.field2676 <<= 0x1;
        this.field2676 += (long) (this.field2674 ? 1 : 0);
        this.field2678[5] = var3;
        this.field2678[9] = var4;
        if (var1 != 0L && this.field2676 != var1) {
            field2682.method3313(var1);
        }
    }

    @ObfuscatedName("fk.l(Lao;ILao;II)Ldk;")
    public class111 method3235(class33 arg0, int arg1, class33 arg2, int arg3) {
        if (this.field2675 != -1) {
            return class30.method763(this.field2675).method624(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2676;
        int[] var7 = this.field2678;
        if (arg0 != null && (arg0.field871 >= 0 || arg0.field872 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2678[var8];
            }
            if (arg0.field871 >= 0) {
                var5 += (long) (arg0.field871 - this.field2678[5] << 40);
                var7[5] = arg0.field871;
            }
            if (arg0.field872 >= 0) {
                var5 += (long) (arg0.field872 - this.field2678[3] << 48);
                var7[3] = arg0.field872;
            }
        }
        class111 var9 = (class111) field2682.method3311(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class35.method3210(var12 - 256).method791()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class39.method196(var12 - 512).method845(this.field2674)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2677 != -1L) {
                    var9 = (class111) field2682.method3311(this.field2677);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class100[] var13 = new class100[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class100 var17 = class35.method3210(var16 - 256).method770();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class39.method196(var16 - 512).method843(this.field2674);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2681[var20] < Statics.field2679[var20].length) {
                        var19.method2100(Statics.field2672[var20], Statics.field2679[var20][this.field2681[var20]]);
                    }
                    if (this.field2681[var20] < Statics.field254[var20].length) {
                        var19.method2100(Statics.field2680[var20], Statics.field254[var20][this.field2681[var20]]);
                    }
                }
                var9 = var19.method2067(64, 850, -30, -50, -30);
                field2682.method3314(var9, var5);
                this.field2677 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class111 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method708(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method717(var9, arg3);
        } else {
            var21 = arg0.method717(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fk.p(I)Lcm;")
    public class100 method3236() {
        if (this.field2675 != -1) {
            return class30.method763(this.field2675).method609();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2678[var2];
            if (var3 >= 256 && var3 < 512 && !class35.method3210(var3 - 256).method782()) {
                var1 = true;
            }
            if (var3 >= 512 && !class39.method196(var3 - 512).method847(this.field2674)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2678[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class35.method3210(var7 - 256).method774();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class39.method196(var7 - 512).method848(this.field2674);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2681[var11] < Statics.field2679[var11].length) {
                var10.method2100(Statics.field2672[var11], Statics.field2679[var11][this.field2681[var11]]);
            }
            if (this.field2681[var11] < Statics.field254[var11].length) {
                var10.method2100(Statics.field2680[var11], Statics.field254[var11][this.field2681[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fk.t(I)I")
    public int method3237() {
        return this.field2675 == -1 ? (this.field2678[11] << 5) + (this.field2678[8] << 10) + (this.field2678[0] << 15) + (this.field2681[0] << 25) + (this.field2681[4] << 20) + this.field2678[1] : 305419896 + class30.method763(this.field2675).field782;
    }
}
