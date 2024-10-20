package deob;

@ObfuscatedName("fb")
public class class164 {

    @ObfuscatedName("fb.g")
    public int[] field2756;

    @ObfuscatedName("fb.h")
    public int[] field2750;

    @ObfuscatedName("fb.s")
    public boolean field2751;

    @ObfuscatedName("fb.o")
    public int field2760;

    @ObfuscatedName("fb.p")
    public long field2754;

    @ObfuscatedName("fb.x")
    public long field2755;

    @ObfuscatedName("fb.j")
    public static final int[] field2758 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fb.b")
    public static class170 field2759 = new class170(260);

    @ObfuscatedName("fb.g([I[IZII)V")
    public void method3266(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field929; var6++) {
                    class36 var7 = class36.method250(var6);
                    if (var7 != null && !var7.field939 && var5 + (arg2 ? 7 : 0) == var7.field932) {
                        arg0[field2758[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2756 = arg0;
        this.field2750 = arg1;
        this.field2751 = arg2;
        this.field2760 = arg3;
        this.method3271();
    }

    @ObfuscatedName("fb.h(IZI)V")
    public void method3267(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2751) {
            return;
        }
        int var3 = this.field2756[field2758[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class36 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field929) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field929 - 1;
                }
            }
            var4 = class36.method250(var3);
        } while (var4 == null || var4.field939 || var4.field932 != (this.field2751 ? 7 : 0) + arg0);
        this.field2756[field2758[arg0]] = var3 + 256;
        this.method3271();
    }

    @ObfuscatedName("fb.s(IZI)V")
    public void method3268(int arg0, boolean arg1) {
        int var3 = this.field2750[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2753[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2753[arg0].length - 1;
            }
        }
        this.field2750[arg0] = var3;
        this.method3271();
    }

    @ObfuscatedName("fb.o(ZI)V")
    public void method3269(boolean arg0) {
        if (this.field2751 != arg0) {
            this.method3266((int[]) null, this.field2750, arg0, -1);
        }
    }

    @ObfuscatedName("fb.p(Ldw;I)V")
    public void method3291(class127 arg0) {
        arg0.method2485(this.field2751 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2756[field2758[var2]];
            if (var3 == 0) {
                arg0.method2485(-1);
            } else {
                arg0.method2485(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2485(this.field2750[var4]);
        }
    }

    @ObfuscatedName("fb.x(I)V")
    public void method3271() {
        long var1 = this.field2754;
        int var3 = this.field2756[5];
        int var4 = this.field2756[9];
        this.field2756[5] = var4;
        this.field2756[9] = var3;
        this.field2754 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2754 <<= 0x4;
            if (this.field2756[var5] >= 256) {
                this.field2754 += (long) (this.field2756[var5] - 256);
            }
        }
        if (this.field2756[0] >= 256) {
            this.field2754 += (long) (this.field2756[0] - 256 >> 4);
        }
        if (this.field2756[1] >= 256) {
            this.field2754 += (long) (this.field2756[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2754 <<= 0x3;
            this.field2754 += (long) this.field2750[var6];
        }
        this.field2754 <<= 0x1;
        this.field2754 += (long) (this.field2751 ? 1 : 0);
        this.field2756[5] = var3;
        this.field2756[9] = var4;
        if (var1 != 0L && this.field2754 != var1) {
            field2759.method3316(var1);
        }
    }

    @ObfuscatedName("fb.k(Laz;ILaz;IB)Ldn;")
    public class112 method3272(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field2760 != -1) {
            return class31.method898(this.field2760).method610(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2754;
        int[] var7 = this.field2756;
        if (arg0 != null && (arg0.field895 >= 0 || arg0.field884 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2756[var8];
            }
            if (arg0.field895 >= 0) {
                var5 += (long) (arg0.field895 - this.field2756[5] << 40);
                var7[5] = arg0.field895;
            }
            if (arg0.field884 >= 0) {
                var5 += (long) (arg0.field884 - this.field2756[3] << 48);
                var7[3] = arg0.field884;
            }
        }
        class112 var9 = (class112) field2759.method3303(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class36.method250(var12 - 256).method766()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class40.method1333(var12 - 512).method840(this.field2751)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2755 != -1L) {
                    var9 = (class112) field2759.method3303(this.field2755);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class101[] var13 = new class101[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class101 var17 = class36.method250(var16 - 256).method767();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class40.method1333(var16 - 512).method841(this.field2751);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2750[var20] < Statics.field2753[var20].length) {
                        var19.method2097(Statics.field2749[var20], Statics.field2753[var20][this.field2750[var20]]);
                    }
                    if (this.field2750[var20] < Statics.field2757[var20].length) {
                        var19.method2097(Statics.field1236[var20], Statics.field2757[var20][this.field2750[var20]]);
                    }
                }
                var9 = var19.method2104(64, 850, -30, -50, -30);
                field2759.method3313(var9, var5);
                this.field2755 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class112 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method719(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method712(var9, arg3);
        } else {
            var21 = arg0.method712(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fb.r(I)Lcz;")
    public class101 method3273() {
        if (this.field2760 != -1) {
            return class31.method898(this.field2760).method611();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2756[var2];
            if (var3 >= 256 && var3 < 512 && !class36.method250(var3 - 256).method775()) {
                var1 = true;
            }
            if (var3 >= 512 && !class40.method1333(var3 - 512).method842(this.field2751)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2756[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class36.method250(var7 - 256).method773();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class40.method1333(var7 - 512).method870(this.field2751);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2750[var11] < Statics.field2753[var11].length) {
                var10.method2097(Statics.field2749[var11], Statics.field2753[var11][this.field2750[var11]]);
            }
            if (this.field2750[var11] < Statics.field2757[var11].length) {
                var10.method2097(Statics.field1236[var11], Statics.field2757[var11][this.field2750[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fb.z(I)I")
    public int method3274() {
        return this.field2760 == -1 ? (this.field2756[11] << 5) + (this.field2756[8] << 10) + (this.field2756[0] << 15) + (this.field2750[0] << 25) + (this.field2750[4] << 20) + this.field2756[1] : 305419896 + class31.method898(this.field2760).field784;
    }
}
