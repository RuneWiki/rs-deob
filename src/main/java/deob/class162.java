package deob;

@ObfuscatedName("fw")
public class class162 {

    @ObfuscatedName("fw.v")
    public int[] field2715;

    @ObfuscatedName("fw.f")
    public int[] field2722;

    @ObfuscatedName("fw.n")
    public boolean field2711;

    @ObfuscatedName("fw.c")
    public int field2712;

    @ObfuscatedName("fw.r")
    public long field2714;

    @ObfuscatedName("fw.k")
    public long field2713;

    @ObfuscatedName("fw.l")
    public static final int[] field2718 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fw.o")
    public static class169 field2719 = new class169(260);

    @ObfuscatedName("fw.v([I[IZII)V")
    public void method3152(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field900; var6++) {
                    class35 var7 = class35.method150(var6);
                    if (var7 != null && !var7.field898 && var7.field907 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2718[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2715 = arg0;
        this.field2722 = arg1;
        this.field2711 = arg2;
        this.field2712 = arg3;
        this.method3156();
    }

    @ObfuscatedName("fw.f(IZI)V")
    public void method3175(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2711) {
            return;
        }
        int var3 = this.field2715[field2718[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class35 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field900) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field900 - 1;
                }
            }
            var4 = class35.method150(var3);
        } while (var4 == null || var4.field898 || var4.field907 != (this.field2711 ? 7 : 0) + arg0);
        this.field2715[field2718[arg0]] = var3 + 256;
        this.method3156();
    }

    @ObfuscatedName("fw.n(IZI)V")
    public void method3153(int arg0, boolean arg1) {
        int var3 = this.field2722[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2710[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2710[arg0].length - 1;
            }
        }
        this.field2722[arg0] = var3;
        this.method3156();
    }

    @ObfuscatedName("fw.c(ZI)V")
    public void method3154(boolean arg0) {
        if (this.field2711 != arg0) {
            this.method3152((int[]) null, this.field2722, arg0, -1);
        }
    }

    @ObfuscatedName("fw.r(Ldr;I)V")
    public void method3165(class126 arg0) {
        arg0.method2452(this.field2711 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2715[field2718[var2]];
            if (var3 == 0) {
                arg0.method2452(-1);
            } else {
                arg0.method2452(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2452(this.field2722[var4]);
        }
    }

    @ObfuscatedName("fw.k(I)V")
    public void method3156() {
        long var1 = this.field2714;
        int var3 = this.field2715[5];
        int var4 = this.field2715[9];
        this.field2715[5] = var4;
        this.field2715[9] = var3;
        this.field2714 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2714 <<= 0x4;
            if (this.field2715[var5] >= 256) {
                this.field2714 += (long) (this.field2715[var5] - 256);
            }
        }
        if (this.field2715[0] >= 256) {
            this.field2714 += (long) (this.field2715[0] - 256 >> 4);
        }
        if (this.field2715[1] >= 256) {
            this.field2714 += (long) (this.field2715[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2714 <<= 0x3;
            this.field2714 += (long) this.field2722[var6];
        }
        this.field2714 <<= 0x1;
        this.field2714 += (long) (this.field2711 ? 1 : 0);
        this.field2715[5] = var3;
        this.field2715[9] = var4;
        if (var1 != 0L && this.field2714 != var1) {
            field2719.method3225(var1);
        }
    }

    @ObfuscatedName("fw.e(Lal;ILal;IB)Ldf;")
    public class111 method3157(class33 arg0, int arg1, class33 arg2, int arg3) {
        if (this.field2712 != -1) {
            return class30.method3061(this.field2712).method601(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2714;
        int[] var7 = this.field2715;
        if (arg0 != null && (arg0.field869 >= 0 || arg0.field870 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2715[var8];
            }
            if (arg0.field869 >= 0) {
                var5 += (long) (arg0.field869 - this.field2715[5] << 40);
                var7[5] = arg0.field869;
            }
            if (arg0.field870 >= 0) {
                var5 += (long) (arg0.field870 - this.field2715[3] << 48);
                var7[3] = arg0.field870;
            }
        }
        class111 var9 = (class111) field2719.method3224(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class35.method150(var12 - 256).method761()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class39.method1211(var12 - 512).method871(this.field2711)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2713 != -1L) {
                    var9 = (class111) field2719.method3224(this.field2713);
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
                        class100 var17 = class35.method150(var16 - 256).method773();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class39.method1211(var16 - 512).method842(this.field2711);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2722[var20] < Statics.field2710[var20].length) {
                        var19.method2082(Statics.field2561[var20], Statics.field2710[var20][this.field2722[var20]]);
                    }
                    if (this.field2722[var20] < Statics.field2717[var20].length) {
                        var19.method2082(Statics.field2716[var20], Statics.field2717[var20][this.field2722[var20]]);
                    }
                }
                var9 = var19.method2080(64, 850, -30, -50, -30);
                field2719.method3231(var9, var5);
                this.field2713 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class111 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method709(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method710(var9, arg3);
        } else {
            var21 = arg0.method710(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fw.q(I)Lcw;")
    public class100 method3158() {
        if (this.field2712 != -1) {
            return class30.method3061(this.field2712).method606();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2715[var2];
            if (var3 >= 256 && var3 < 512 && !class35.method150(var3 - 256).method769()) {
                var1 = true;
            }
            if (var3 >= 512 && !class39.method1211(var3 - 512).method850(this.field2711)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2715[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class35.method150(var7 - 256).method758();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class39.method1211(var7 - 512).method844(this.field2711);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2722[var11] < Statics.field2710[var11].length) {
                var10.method2082(Statics.field2561[var11], Statics.field2710[var11][this.field2722[var11]]);
            }
            if (this.field2722[var11] < Statics.field2717[var11].length) {
                var10.method2082(Statics.field2716[var11], Statics.field2717[var11][this.field2722[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fw.u(I)I")
    public int method3160() {
        return this.field2712 == -1 ? (this.field2715[11] << 5) + (this.field2715[8] << 10) + (this.field2715[0] << 15) + (this.field2722[0] << 25) + (this.field2722[4] << 20) + this.field2715[1] : 305419896 + class30.method3061(this.field2712).field790;
    }
}
