package deob;

@ObfuscatedName("hx")
public class class230 {

    @ObfuscatedName("hx.y")
    public int[] field2618;

    @ObfuscatedName("hx.c")
    public int[] field2612;

    @ObfuscatedName("hx.n")
    public boolean field2613;

    @ObfuscatedName("hx.u")
    public int field2614;

    @ObfuscatedName("hx.i")
    public long field2615;

    @ObfuscatedName("hx.r")
    public long field2616;

    @ObfuscatedName("hx.v")
    public static final int[] field2611 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hx.k")
    public static class203 field2619 = new class203(260);

    @ObfuscatedName("hx.y([I[IZIB)V")
    public void method4090(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3351; var6++) {
                    class263 var7 = class263.method1702(var6);
                    if (var7 != null && !var7.field3342 && var7.field3344 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2611[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2618 = arg0;
        this.field2612 = arg1;
        this.field2613 = arg2;
        this.field2614 = arg3;
        this.method4095();
    }

    @ObfuscatedName("hx.c(IZI)V")
    public void method4091(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2613) {
            return;
        }
        int var3 = this.field2618[field2611[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class263 var4;
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
            var4 = class263.method1702(var3);
        } while (var4 == null || var4.field3342 || var4.field3344 != arg0 + (this.field2613 ? 7 : 0));
        this.field2618[field2611[arg0]] = var3 + 256;
        this.method4095();
    }

    @ObfuscatedName("hx.n(IZB)V")
    public void method4092(int arg0, boolean arg1) {
        int var3 = this.field2612[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field989[arg0].length) {
                    var3 = 0;
                }
            } while (!class231.method4971(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field989[arg0].length - 1;
                }
            } while (!class231.method4971(arg0, var3));
        }
        this.field2612[arg0] = var3;
        this.method4095();
    }

    @ObfuscatedName("hx.u(ZI)V")
    public void method4093(boolean arg0) {
        if (this.field2613 != arg0) {
            this.method4090((int[]) null, this.field2612, arg0, -1);
        }
    }

    @ObfuscatedName("hx.i(Lge;I)V")
    public void method4094(class185 arg0) {
        arg0.method3253(this.field2613 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2618[field2611[var2]];
            if (var3 == 0) {
                arg0.method3253(-1);
            } else {
                arg0.method3253(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3253(this.field2612[var4]);
        }
    }

    @ObfuscatedName("hx.p(I)V")
    public void method4095() {
        long var1 = this.field2615;
        int var3 = this.field2618[5];
        int var4 = this.field2618[9];
        this.field2618[5] = var4;
        this.field2618[9] = var3;
        this.field2615 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2615 <<= 0x4;
            if (this.field2618[var5] >= 256) {
                this.field2615 += (long) (this.field2618[var5] - 256);
            }
        }
        if (this.field2618[0] >= 256) {
            this.field2615 += (long) (this.field2618[0] - 256 >> 4);
        }
        if (this.field2618[1] >= 256) {
            this.field2615 += (long) (this.field2618[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2615 <<= 0x3;
            this.field2615 += (long) this.field2612[var6];
        }
        this.field2615 <<= 0x1;
        this.field2615 += (long) (this.field2613 ? 1 : 0);
        this.field2618[5] = var3;
        this.field2618[9] = var4;
        if (var1 != 0L && this.field2615 != var1) {
            field2619.method3686(var1);
        }
    }

    @ObfuscatedName("hx.e(Ljo;ILjo;II)Lde;")
    public class122 method4096(class276 arg0, int arg1, class276 arg2, int arg3) {
        if (this.field2614 != -1) {
            return Statics.method4448(this.field2614).method4803(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2615;
        int[] var7 = this.field2618;
        if (arg0 != null && (arg0.field3596 >= 0 || arg0.field3597 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2618[var8];
            }
            if (arg0.field3596 >= 0) {
                var5 += (long) (arg0.field3596 - this.field2618[5] << 40);
                var7[5] = arg0.field3596;
            }
            if (arg0.field3597 >= 0) {
                var5 += (long) (arg0.field3597 - this.field2618[3] << 48);
                var7[3] = arg0.field3597;
            }
        }
        class122 var9 = (class122) field2619.method3685(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class263.method1702(var12 - 256).method4530()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class272.method4572(var12 - 512).method4764(this.field2613)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2616 != -1L) {
                    var9 = (class122) field2619.method3685(this.field2616);
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
                        class116 var17 = class263.method1702(var16 - 256).method4531();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class116 var18 = class272.method4572(var16 - 512).method4736(this.field2613);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class116 var19 = new class116(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2612[var20] < Statics.field989[var20].length) {
                        var19.method2386(Statics.field2617[var20], Statics.field989[var20][this.field2612[var20]]);
                    }
                    if (this.field2612[var20] < Statics.field2003[var20].length) {
                        var19.method2386(Statics.field1075[var20], Statics.field2003[var20][this.field2612[var20]]);
                    }
                }
                var9 = var19.method2399(64, 850, -30, -50, -30);
                field2619.method3687(var9, var5);
                this.field2616 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class122 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4866(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4890(var9, arg3);
        } else {
            var21 = arg0.method4890(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hx.s(B)Ldz;")
    public class116 method4097() {
        if (this.field2614 != -1) {
            return Statics.method4448(this.field2614).method4804();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2618[var2];
            if (var3 >= 256 && var3 < 512 && !class263.method1702(var3 - 256).method4532()) {
                var1 = true;
            }
            if (var3 >= 512 && !class272.method4572(var3 - 512).method4735(this.field2613)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class116[] var4 = new class116[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2618[var6];
            if (var7 >= 256 && var7 < 512) {
                class116 var8 = class263.method1702(var7 - 256).method4533();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class116 var9 = class272.method4572(var7 - 512).method4742(this.field2613);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class116 var10 = new class116(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2612[var11] < Statics.field989[var11].length) {
                var10.method2386(Statics.field2617[var11], Statics.field989[var11][this.field2612[var11]]);
            }
            if (this.field2612[var11] < Statics.field2003[var11].length) {
                var10.method2386(Statics.field1075[var11], Statics.field2003[var11][this.field2612[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hx.v(I)I")
    public int method4098() {
        return this.field2614 == -1 ? (this.field2618[11] << 5) + (this.field2618[8] << 10) + (this.field2618[0] << 15) + (this.field2612[4] << 20) + (this.field2612[0] << 25) + this.field2618[1] : 305419896 + Statics.method4448(this.field2614).field3539;
    }
}
