package deob;

@ObfuscatedName("fe")
public class class157 {

    @ObfuscatedName("fe.e")
    public int[] field2676;

    @ObfuscatedName("fe.v")
    public int[] field2666;

    @ObfuscatedName("fe.i")
    public boolean field2665;

    @ObfuscatedName("fe.g")
    public int field2667;

    @ObfuscatedName("fe.x")
    public long field2669;

    @ObfuscatedName("fe.b")
    public long field2668;

    @ObfuscatedName("fe.s")
    public static final int[] field2671 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fe.f")
    public static class171 field2670 = new class171(260);

    @ObfuscatedName("fe.e([I[IZIB)V")
    public void method2908(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field934; var6++) {
                    class40 var7 = class40.method2048(var6);
                    if (var7 != null && !var7.field943 && var5 + (arg2 ? 7 : 0) == var7.field942) {
                        arg0[field2671[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2676 = arg0;
        this.field2666 = arg1;
        this.field2665 = arg2;
        this.field2667 = arg3;
        this.method2903();
    }

    @ObfuscatedName("fe.v(IZI)V")
    public void method2900(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2665) {
            return;
        }
        int var3 = this.field2676[field2671[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class40 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field934) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field934 - 1;
                }
            }
            var4 = class40.method2048(var3);
        } while (var4 == null || var4.field943 || var4.field942 != (this.field2665 ? 7 : 0) + arg0);
        this.field2676[field2671[arg0]] = var3 + 256;
        this.method2903();
    }

    @ObfuscatedName("fe.i(IZI)V")
    public void method2921(int arg0, boolean arg1) {
        int var3 = this.field2666[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field1523[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field1523[arg0].length - 1;
            }
        }
        this.field2666[arg0] = var3;
        this.method2903();
    }

    @ObfuscatedName("fe.g(ZI)V")
    public void method2902(boolean arg0) {
        if (this.field2665 != arg0) {
            this.method2908((int[]) null, this.field2666, arg0, -1);
        }
    }

    @ObfuscatedName("fe.x(Ldk;I)V")
    public void method2912(class107 arg0) {
        arg0.method2102(this.field2665 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2676[field2671[var2]];
            if (var3 == 0) {
                arg0.method2102(-1);
            } else {
                arg0.method2102(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2102(this.field2666[var4]);
        }
    }

    @ObfuscatedName("fe.b(I)V")
    public void method2903() {
        long var1 = this.field2669;
        int var3 = this.field2676[5];
        int var4 = this.field2676[9];
        this.field2676[5] = var4;
        this.field2676[9] = var3;
        this.field2669 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2669 <<= 0x4;
            if (this.field2676[var5] >= 256) {
                this.field2669 += (long) (this.field2676[var5] - 256);
            }
        }
        if (this.field2676[0] >= 256) {
            this.field2669 += (long) (this.field2676[0] - 256 >> 4);
        }
        if (this.field2676[1] >= 256) {
            this.field2669 += (long) (this.field2676[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2669 <<= 0x3;
            this.field2669 += (long) this.field2666[var6];
        }
        this.field2669 <<= 0x1;
        this.field2669 += (long) (this.field2665 ? 1 : 0);
        this.field2676[5] = var3;
        this.field2676[9] = var4;
        if (var1 != 0L && this.field2669 != var1) {
            field2670.method3126(var1);
        }
    }

    @ObfuscatedName("fe.q(Laq;ILaq;II)Lcz;")
    public class98 method2905(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field2667 != -1) {
            return class35.method562(this.field2667).method598(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2669;
        int[] var7 = this.field2676;
        if (arg0 != null && (arg0.field893 >= 0 || arg0.field901 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2676[var8];
            }
            if (arg0.field893 >= 0) {
                var5 += (long) (arg0.field893 - this.field2676[5] << 40);
                var7[5] = arg0.field893;
            }
            if (arg0.field901 >= 0) {
                var5 += (long) (arg0.field901 - this.field2676[3] << 48);
                var7[3] = arg0.field901;
            }
        }
        class98 var9 = (class98) field2670.method3136(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class40.method2048(var12 - 256).method772()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class45.method28(var12 - 512).method829(this.field2665)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2668 != -1L) {
                    var9 = (class98) field2670.method3136(this.field2668);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class93[] var13 = new class93[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class93 var17 = class40.method2048(var16 - 256).method750();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class93 var18 = class45.method28(var16 - 512).method830(this.field2665);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class93 var19 = new class93(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2666[var20] < Statics.field1523[var20].length) {
                        var19.method1890(Statics.field228[var20], Statics.field1523[var20][this.field2666[var20]]);
                    }
                    if (this.field2666[var20] < Statics.field1830[var20].length) {
                        var19.method1890(Statics.field203[var20], Statics.field1830[var20][this.field2666[var20]]);
                    }
                }
                var9 = var19.method1897(64, 850, -30, -50, -30);
                field2670.method3127(var9, var5);
                this.field2668 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class98 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method700(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method697(var9, arg3);
        } else {
            var21 = arg0.method697(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fe.l(I)Lcr;")
    public class93 method2917() {
        if (this.field2667 != -1) {
            return class35.method562(this.field2667).method599();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2676[var2];
            if (var3 >= 256 && var3 < 512 && !class40.method2048(var3 - 256).method751()) {
                var1 = true;
            }
            if (var3 >= 512 && !class45.method28(var3 - 512).method865(this.field2665)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class93[] var4 = new class93[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2676[var6];
            if (var7 >= 256 && var7 < 512) {
                class93 var8 = class40.method2048(var7 - 256).method757();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class93 var9 = class45.method28(var7 - 512).method832(this.field2665);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class93 var10 = new class93(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2666[var11] < Statics.field1523[var11].length) {
                var10.method1890(Statics.field228[var11], Statics.field1523[var11][this.field2666[var11]]);
            }
            if (this.field2666[var11] < Statics.field1830[var11].length) {
                var10.method1890(Statics.field203[var11], Statics.field1830[var11][this.field2666[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fe.m(I)I")
    public int method2906() {
        return this.field2667 == -1 ? (this.field2676[11] << 5) + (this.field2676[8] << 10) + (this.field2676[0] << 15) + (this.field2666[0] << 25) + (this.field2666[4] << 20) + this.field2676[1] : 305419896 + class35.method562(this.field2667).field792;
    }
}
