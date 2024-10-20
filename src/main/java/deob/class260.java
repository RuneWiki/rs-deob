package deob;

@ObfuscatedName("it")
public class class260 {

    @ObfuscatedName("it.i")
    public int[] field3025;

    @ObfuscatedName("it.w")
    public int[] field3023;

    @ObfuscatedName("it.s")
    public boolean field3024;

    @ObfuscatedName("it.a")
    public int field3029;

    @ObfuscatedName("it.o")
    public long field3026;

    @ObfuscatedName("it.g")
    public long field3022;

    @ObfuscatedName("it.e")
    public class151[] field3028;

    @ObfuscatedName("it.p")
    public boolean field3027 = false;

    @ObfuscatedName("it.k")
    public static final int[] field3030 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("it.t")
    public static class236 field3031 = new class236(260);

    @ObfuscatedName("it.i([I[Ley;Z[IZII)V")
    public void method4532(int[] arg0, class151[] arg1, boolean arg2, int[] arg3, boolean arg4, int arg5) {
        this.field3028 = arg1;
        this.field3027 = arg2;
        this.method4507(arg0, arg3, arg4, arg5);
    }

    @ObfuscatedName("it.w([I[IZII)V")
    public void method4507(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field845; var6++) {
                    class156 var7 = class156.method1041(var6);
                    if (var7 != null && !var7.field1650 && var7.field1651 == (arg2 ? 7 : 0) + var5) {
                        arg0[field3030[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field3025 = arg0;
        this.field3023 = arg1;
        this.field3024 = arg2;
        this.field3029 = arg3;
        this.method4513();
    }

    @ObfuscatedName("it.s(IZI)V")
    public void method4509(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field3024) {
            return;
        }
        int var3 = this.field3025[field3030[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class156 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field845) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field845 - 1;
                }
            }
            var4 = class156.method1041(var3);
        } while (var4 == null || var4.field1650 || arg0 + (this.field3024 ? 7 : 0) != var4.field1651);
        this.field3025[field3030[arg0]] = var3 + 256;
        this.method4513();
    }

    @ObfuscatedName("it.a(IZB)V")
    public void method4515(int arg0, boolean arg1) {
        int var3 = this.field3023[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1520[arg0].length) {
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
                    var3 = Statics.field1520[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field3023[arg0] = var3;
        this.method4513();
    }

    @ObfuscatedName("it.o(ZI)V")
    public void method4511(boolean arg0) {
        if (this.field3024 != arg0) {
            this.method4507((int[]) null, this.field3023, arg0, -1);
        }
    }

    @ObfuscatedName("it.g(Lop;I)V")
    public void method4512(class401 arg0) {
        arg0.method6223(this.field3024 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3025[field3030[var2]];
            if (var3 == 0) {
                arg0.method6223(-1);
            } else {
                arg0.method6223(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method6223(this.field3023[var4]);
        }
    }

    @ObfuscatedName("it.e(I)V")
    public void method4513() {
        long var1 = this.field3026;
        int var3 = this.field3025[5];
        int var4 = this.field3025[9];
        this.field3025[5] = var4;
        this.field3025[9] = var3;
        this.field3026 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3026 <<= 0x4;
            if (this.field3025[var5] >= 256) {
                this.field3026 += (long) (this.field3025[var5] - 256);
            }
        }
        if (this.field3025[0] >= 256) {
            this.field3026 += (long) (this.field3025[0] - 256 >> 4);
        }
        if (this.field3025[1] >= 256) {
            this.field3026 += (long) (this.field3025[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3026 <<= 0x3;
            this.field3026 += (long) this.field3023[var6];
        }
        this.field3026 <<= 0x1;
        this.field3026 += (long) (this.field3024 ? 1 : 0);
        this.field3025[5] = var3;
        this.field3025[9] = var4;
        if (var1 != 0L && this.field3026 != var1 || this.field3027) {
            field3031.method4208(var1);
        }
    }

    @ObfuscatedName("it.p(Lfm;ILfm;II)Lhl;")
    public class220 method4514(class172 arg0, int arg1, class172 arg2, int arg3) {
        if (this.field3029 != -1) {
            return class161.method1044(this.field3029).method2806(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field3026;
        int[] var7 = this.field3025;
        if (arg0 != null && (arg0.field1965 >= 0 || arg0.field1962 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3025[var8];
            }
            if (arg0.field1965 >= 0) {
                var5 += (long) (arg0.field1965 - this.field3025[5] << 40);
                var7[5] = arg0.field1965;
            }
            if (arg0.field1962 >= 0) {
                var5 += (long) (arg0.field1962 - this.field3025[3] << 48);
                var7[3] = arg0.field1962;
            }
        }
        class220 var9 = (class220) field3031.method4205(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class156.method1041(var12 - 256).method2736()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class170.method2586(var12 - 512).method3063(this.field3024)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3022 != -1L) {
                    var9 = (class220) field3031.method4205(this.field3022);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class206[] var13 = new class206[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class206 var17 = class156.method1041(var16 - 256).method2727();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class170 var18 = class170.method2586(var16 - 512);
                        class206 var19 = var18.method3079(this.field3024);
                        if (var19 != null) {
                            if (this.field3028 != null) {
                                class151 var20 = this.field3028[var15];
                                if (var20 != null) {
                                    if (var20.field1599 != null && var18.field1901 != null && var18.field1907.length == var20.field1599.length) {
                                        for (int var21 = 0; var21 < var18.field1901.length; var21++) {
                                            var19.method3687(var18.field1907[var21], var20.field1599[var21]);
                                        }
                                    }
                                    if (var20.field1601 != null && var18.field1890 != null && var18.field1891.length == var20.field1601.length) {
                                        for (int var22 = 0; var22 < var18.field1890.length; var22++) {
                                            var19.method3672(var18.field1891[var22], var20.field1601[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class206 var23 = new class206(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field3023[var24] < Statics.field1520[var24].length) {
                        var23.method3687(Statics.field4082[var24], Statics.field1520[var24][this.field3023[var24]]);
                    }
                    if (this.field3023[var24] < Statics.field1513[var24].length) {
                        var23.method3687(Statics.field3014[var24], Statics.field1513[var24][this.field3023[var24]]);
                    }
                }
                var9 = var23.method3679(64, 850, -30, -50, -30);
                field3031.method4206(var9, var5);
                this.field3022 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class220 var25;
        if (arg0 != null && arg2 != null) {
            var25 = arg0.method3118(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method3115(var9, arg3);
        } else {
            var25 = arg0.method3115(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("it.j(I)Lgk;")
    public class206 method4533() {
        if (this.field3029 != -1) {
            return class161.method1044(this.field3029).method2807();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3025[var2];
            if (var3 >= 256 && var3 < 512 && !class156.method1041(var3 - 256).method2743()) {
                var1 = true;
            }
            if (var3 >= 512 && !class170.method2586(var3 - 512).method3024(this.field3024)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class206[] var4 = new class206[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field3025[var6];
            if (var7 >= 256 && var7 < 512) {
                class206 var8 = class156.method1041(var7 - 256).method2729();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class206 var9 = class170.method2586(var7 - 512).method3091(this.field3024);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class206 var10 = new class206(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3023[var11] < Statics.field1520[var11].length) {
                var10.method3687(Statics.field4082[var11], Statics.field1520[var11][this.field3023[var11]]);
            }
            if (this.field3023[var11] < Statics.field1513[var11].length) {
                var10.method3687(Statics.field3014[var11], Statics.field1513[var11][this.field3023[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("it.b(I)I")
    public int method4516() {
        return this.field3029 == -1 ? (this.field3025[11] << 5) + (this.field3025[8] << 10) + (this.field3025[0] << 15) + (this.field3023[4] << 20) + (this.field3023[0] << 25) + this.field3025[1] : 305419896 + class161.method1044(this.field3029).field1729;
    }
}
