package deob;

@ObfuscatedName("fs")
public class class180 {

    @ObfuscatedName("fs.t")
    public int[] field2947;

    @ObfuscatedName("fs.i")
    public int[] field2940;

    @ObfuscatedName("fs.g")
    public boolean field2943;

    @ObfuscatedName("fs.h")
    public int field2942;

    @ObfuscatedName("fs.z")
    public long field2939;

    @ObfuscatedName("fs.r")
    public long field2944;

    @ObfuscatedName("fs.y")
    public static final int[] field2946 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fs.p")
    public static class194 field2945 = new class194(260);

    @ObfuscatedName("fs.t([I[IZIB)V")
    public void method3204(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1031; var6++) {
                    class45 var7 = class45.method2085(var6);
                    if (var7 != null && !var7.field1035 && var7.field1028 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2946[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2947 = arg0;
        this.field2940 = arg1;
        this.field2943 = arg2;
        this.field2942 = arg3;
        this.method3208();
    }

    @ObfuscatedName("fs.i(IZI)V")
    public void method3205(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2943) {
            return;
        }
        int var3 = this.field2947[field2946[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1031) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1031 - 1;
                }
            }
            var4 = class45.method2085(var3);
        } while (var4 == null || var4.field1035 || var4.field1028 != (this.field2943 ? 7 : 0) + arg0);
        this.field2947[field2946[arg0]] = var3 + 256;
        this.method3208();
    }

    @ObfuscatedName("fs.g(IZB)V")
    public void method3222(int arg0, boolean arg1) {
        int var3 = this.field2940[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2061[arg0].length) {
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
                    var3 = Statics.field2061[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2940[arg0] = var3;
        this.method3208();
    }

    @ObfuscatedName("fs.h(ZB)V")
    public void method3225(boolean arg0) {
        if (this.field2943 != arg0) {
            this.method3204((int[]) null, this.field2940, arg0, -1);
        }
    }

    @ObfuscatedName("fs.z(Ldr;I)V")
    public void method3214(class120 arg0) {
        arg0.method2293(this.field2943 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2947[field2946[var2]];
            if (var3 == 0) {
                arg0.method2293(-1);
            } else {
                arg0.method2293(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2293(this.field2940[var4]);
        }
    }

    @ObfuscatedName("fs.r(I)V")
    public void method3208() {
        long var1 = this.field2939;
        int var3 = this.field2947[5];
        int var4 = this.field2947[9];
        this.field2947[5] = var4;
        this.field2947[9] = var3;
        this.field2939 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2939 <<= 0x4;
            if (this.field2947[var5] >= 256) {
                this.field2939 += (long) (this.field2947[var5] - 256);
            }
        }
        if (this.field2947[0] >= 256) {
            this.field2939 += (long) (this.field2947[0] - 256 >> 4);
        }
        if (this.field2947[1] >= 256) {
            this.field2939 += (long) (this.field2947[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2939 <<= 0x3;
            this.field2939 += (long) this.field2940[var6];
        }
        this.field2939 <<= 0x1;
        this.field2939 += (long) (this.field2943 ? 1 : 0);
        this.field2947[5] = var3;
        this.field2947[9] = var4;
        if (var1 != 0L && this.field2939 != var1) {
            field2945.method3452(var1);
        }
    }

    @ObfuscatedName("fs.f(Lah;ILah;IB)Ldk;")
    public class106 method3209(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2942 != -1) {
            return class40.method160(this.field2942).method714(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2939;
        int[] var7 = this.field2947;
        if (arg0 != null && (arg0.field983 >= 0 || arg0.field995 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2947[var8];
            }
            if (arg0.field983 >= 0) {
                var5 += (long) (arg0.field983 - this.field2947[5] << 40);
                var7[5] = arg0.field983;
            }
            if (arg0.field995 >= 0) {
                var5 += (long) (arg0.field995 - this.field2947[3] << 48);
                var7[3] = arg0.field995;
            }
        }
        class106 var9 = (class106) field2945.method3453(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method2085(var12 - 256).method868()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method2583(var12 - 512).method989(this.field2943)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2944 != -1L) {
                    var9 = (class106) field2945.method3453(this.field2944);
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
                        class101 var17 = class45.method2085(var16 - 256).method866();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class52.method2583(var16 - 512).method968(this.field2943);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2940[var20] < Statics.field2061[var20].length) {
                        var19.method2050(Statics.field1050[var20], Statics.field2061[var20][this.field2940[var20]]);
                    }
                    if (this.field2940[var20] < Statics.field2941[var20].length) {
                        var19.method2050(Statics.field2107[var20], Statics.field2941[var20][this.field2940[var20]]);
                    }
                }
                var9 = var19.method2030(64, 850, -30, -50, -30);
                field2945.method3461(var9, var5);
                this.field2944 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class106 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method823(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method816(var9, arg3);
        } else {
            var21 = arg0.method816(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fs.s(I)Lca;")
    public class101 method3210() {
        if (this.field2942 != -1) {
            return class40.method160(this.field2942).method719();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2947[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method2085(var3 - 256).method867()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method2583(var3 - 512).method970(this.field2943)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2947[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class45.method2085(var7 - 256).method869();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class52.method2583(var7 - 512).method971(this.field2943);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2940[var11] < Statics.field2061[var11].length) {
                var10.method2050(Statics.field1050[var11], Statics.field2061[var11][this.field2940[var11]]);
            }
            if (this.field2940[var11] < Statics.field2941[var11].length) {
                var10.method2050(Statics.field2107[var11], Statics.field2941[var11][this.field2940[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fs.d(I)I")
    public int method3211() {
        return this.field2942 == -1 ? (this.field2947[11] << 5) + (this.field2947[8] << 10) + (this.field2947[0] << 15) + (this.field2940[0] << 25) + (this.field2940[4] << 20) + this.field2947[1] : 305419896 + class40.method160(this.field2942).field912;
    }
}
