package deob;

@ObfuscatedName("gs")
public class class183 {

    @ObfuscatedName("gs.e")
    public int[] field2957;

    @ObfuscatedName("gs.l")
    public int[] field2963;

    @ObfuscatedName("gs.c")
    public boolean field2958;

    @ObfuscatedName("gs.h")
    public int field2959;

    @ObfuscatedName("gs.r")
    public long field2960;

    @ObfuscatedName("gs.a")
    public long field2961;

    @ObfuscatedName("gs.i")
    public static final int[] field2962 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("gs.q")
    public static class197 field2965 = new class197(260);

    @ObfuscatedName("gs.e([I[IZII)V")
    public void method3352(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1062; var6++) {
                    class47 var7 = class47.method2061(var6);
                    if (var7 != null && !var7.field1071 && var5 + (arg2 ? 7 : 0) == var7.field1068) {
                        arg0[field2962[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2957 = arg0;
        this.field2963 = arg1;
        this.field2958 = arg2;
        this.field2959 = arg3;
        this.method3357();
    }

    @ObfuscatedName("gs.l(IZI)V")
    public void method3353(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2958) {
            return;
        }
        int var3 = this.field2957[field2962[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class47 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1062) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1062 - 1;
                }
            }
            var4 = class47.method2061(var3);
        } while (var4 == null || var4.field1071 || arg0 + (this.field2958 ? 7 : 0) != var4.field1068);
        this.field2957[field2962[arg0]] = var3 + 256;
        this.method3357();
    }

    @ObfuscatedName("gs.c(IZI)V")
    public void method3354(int arg0, boolean arg1) {
        int var3 = this.field2963[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field917[arg0].length) {
                    var3 = 0;
                }
            } while (!class178.method3104(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field917[arg0].length - 1;
                }
            } while (!class178.method3104(arg0, var3));
        }
        this.field2963[arg0] = var3;
        this.method3357();
    }

    @ObfuscatedName("gs.h(ZI)V")
    public void method3355(boolean arg0) {
        if (this.field2958 != arg0) {
            this.method3352((int[]) null, this.field2963, arg0, -1);
        }
    }

    @ObfuscatedName("gs.r(Ldd;B)V")
    public void method3356(class123 arg0) {
        arg0.method2649(this.field2958 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2957[field2962[var2]];
            if (var3 == 0) {
                arg0.method2649(-1);
            } else {
                arg0.method2649(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2649(this.field2963[var4]);
        }
    }

    @ObfuscatedName("gs.a(I)V")
    public void method3357() {
        long var1 = this.field2960;
        int var3 = this.field2957[5];
        int var4 = this.field2957[9];
        this.field2957[5] = var4;
        this.field2957[9] = var3;
        this.field2960 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2960 <<= 0x4;
            if (this.field2957[var5] >= 256) {
                this.field2960 += (long) (this.field2957[var5] - 256);
            }
        }
        if (this.field2957[0] >= 256) {
            this.field2960 += (long) (this.field2957[0] - 256 >> 4);
        }
        if (this.field2957[1] >= 256) {
            this.field2960 += (long) (this.field2957[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2960 <<= 0x3;
            this.field2960 += (long) this.field2963[var6];
        }
        this.field2960 <<= 0x1;
        this.field2960 += (long) (this.field2958 ? 1 : 0);
        this.field2957[5] = var3;
        this.field2957[9] = var4;
        if (var1 != 0L && this.field2960 != var1) {
            field2965.method3588(var1);
        }
    }

    @ObfuscatedName("gs.b(Lar;ILar;II)Lds;")
    public class109 method3366(class45 arg0, int arg1, class45 arg2, int arg3) {
        if (this.field2959 != -1) {
            return class42.method1250(this.field2959).method796(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2960;
        int[] var7 = this.field2957;
        if (arg0 != null && (arg0.field1020 >= 0 || arg0.field1033 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2957[var8];
            }
            if (arg0.field1020 >= 0) {
                var5 += (long) (arg0.field1020 - this.field2957[5] << 40);
                var7[5] = arg0.field1020;
            }
            if (arg0.field1033 >= 0) {
                var5 += (long) (arg0.field1033 - this.field2957[3] << 48);
                var7[3] = arg0.field1033;
            }
        }
        class109 var9 = (class109) field2965.method3589(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class47.method2061(var12 - 256).method954()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class56.method104(var12 - 512).method1138(this.field2958)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2961 != -1L) {
                    var9 = (class109) field2965.method3589(this.field2961);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class104[] var13 = new class104[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class104 var17 = class47.method2061(var16 - 256).method981();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class104 var18 = class56.method104(var16 - 512).method1175(this.field2958);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class104 var19 = new class104(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2963[var20] < Statics.field917[var20].length) {
                        var19.method2217(Statics.field1288[var20], Statics.field917[var20][this.field2963[var20]]);
                    }
                    if (this.field2963[var20] < Statics.field3169[var20].length) {
                        var19.method2217(Statics.field2341[var20], Statics.field3169[var20][this.field2963[var20]]);
                    }
                }
                var9 = var19.method2175(64, 850, -30, -50, -30);
                field2965.method3591(var9, var5);
                this.field2961 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class109 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method900(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method887(var9, arg3);
        } else {
            var21 = arg0.method887(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("gs.u(I)Lcv;")
    public class104 method3358() {
        if (this.field2959 != -1) {
            return class42.method1250(this.field2959).method779();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2957[var2];
            if (var3 >= 256 && var3 < 512 && !class47.method2061(var3 - 256).method956()) {
                var1 = true;
            }
            if (var3 >= 512 && !class56.method104(var3 - 512).method1140(this.field2958)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class104[] var4 = new class104[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2957[var6];
            if (var7 >= 256 && var7 < 512) {
                class104 var8 = class47.method2061(var7 - 256).method955();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class104 var9 = class56.method104(var7 - 512).method1184(this.field2958);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class104 var10 = new class104(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2963[var11] < Statics.field917[var11].length) {
                var10.method2217(Statics.field1288[var11], Statics.field917[var11][this.field2963[var11]]);
            }
            if (this.field2963[var11] < Statics.field3169[var11].length) {
                var10.method2217(Statics.field2341[var11], Statics.field3169[var11][this.field2963[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("gs.o(B)I")
    public int method3361() {
        return this.field2959 == -1 ? (this.field2957[11] << 5) + (this.field2957[8] << 10) + (this.field2957[0] << 15) + (this.field2963[0] << 25) + (this.field2963[4] << 20) + this.field2957[1] : 305419896 + class42.method1250(this.field2959).field923;
    }

    @ObfuscatedName("dr.p(I)V")
    public static void method2371() {
        field2965.method3590();
    }
}
