package deob;

@ObfuscatedName("hn")
public class class215 {

    @ObfuscatedName("hn.e")
    public int[] field2601;

    @ObfuscatedName("hn.n")
    public int[] field2600;

    @ObfuscatedName("hn.g")
    public boolean field2596;

    @ObfuscatedName("hn.y")
    public int field2594;

    @ObfuscatedName("hn.w")
    public long field2598;

    @ObfuscatedName("hn.k")
    public long field2599;

    @ObfuscatedName("hn.d")
    public static final int[] field2602 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hn.o")
    public static class191 field2597 = new class191(260);

    @ObfuscatedName("hn.e([I[IZII)V")
    public void method3669(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3351; var6++) {
                    class249 var7 = Statics.method34(var6);
                    if (var7 != null && !var7.field3353 && var7.field3346 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2602[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2601 = arg0;
        this.field2600 = arg1;
        this.field2596 = arg2;
        this.field2594 = arg3;
        this.method3671();
    }

    @ObfuscatedName("hn.n(IZI)V")
    public void method3670(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2596) {
            return;
        }
        int var3 = this.field2601[field2602[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class249 var4;
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
            var4 = Statics.method34(var3);
        } while (var4 == null || var4.field3353 || var4.field3346 != arg0 + (this.field2596 ? 7 : 0));
        this.field2601[field2602[arg0]] = var3 + 256;
        this.method3671();
    }

    @ObfuscatedName("hn.g(IZB)V")
    public void method3681(int arg0, boolean arg1) {
        int var3 = this.field2600[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2595[arg0].length) {
                    var3 = 0;
                }
            } while (!class216.method2710(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2595[arg0].length - 1;
                }
            } while (!class216.method2710(arg0, var3));
        }
        this.field2600[arg0] = var3;
        this.method3671();
    }

    @ObfuscatedName("hn.y(ZI)V")
    public void method3674(boolean arg0) {
        if (this.field2596 != arg0) {
            this.method3669((int[]) null, this.field2600, arg0, -1);
        }
    }

    @ObfuscatedName("hn.w(Lfh;I)V")
    public void method3673(class175 arg0) {
        arg0.method2913(this.field2596 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2601[field2602[var2]];
            if (var3 == 0) {
                arg0.method2913(-1);
            } else {
                arg0.method2913(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2913(this.field2600[var4]);
        }
    }

    @ObfuscatedName("hn.k(I)V")
    public void method3671() {
        long var1 = this.field2598;
        int var3 = this.field2601[5];
        int var4 = this.field2601[9];
        this.field2601[5] = var4;
        this.field2601[9] = var3;
        this.field2598 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2598 <<= 0x4;
            if (this.field2601[var5] >= 256) {
                this.field2598 += (long) (this.field2601[var5] - 256);
            }
        }
        if (this.field2601[0] >= 256) {
            this.field2598 += (long) (this.field2601[0] - 256 >> 4);
        }
        if (this.field2601[1] >= 256) {
            this.field2598 += (long) (this.field2601[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2598 <<= 0x3;
            this.field2598 += (long) this.field2600[var6];
        }
        this.field2598 <<= 0x1;
        this.field2598 += (long) (this.field2596 ? 1 : 0);
        this.field2601[5] = var3;
        this.field2601[9] = var4;
        if (var1 != 0L && this.field2598 != var1) {
            field2597.method3280(var1);
        }
    }

    @ObfuscatedName("hn.v(Ljd;ILjd;IS)Lew;")
    public class135 method3694(class262 arg0, int arg1, class262 arg2, int arg3) {
        if (this.field2594 != -1) {
            return class260.method137(this.field2594).method4344(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2598;
        int[] var7 = this.field2601;
        if (arg0 != null && (arg0.field3605 >= 0 || arg0.field3606 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2601[var8];
            }
            if (arg0.field3605 >= 0) {
                var5 += (long) (arg0.field3605 - this.field2601[5] << 40);
                var7[5] = arg0.field3605;
            }
            if (arg0.field3606 >= 0) {
                var5 += (long) (arg0.field3606 - this.field2601[3] << 48);
                var7[3] = arg0.field3606;
            }
        }
        class135 var9 = (class135) field2597.method3288(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !Statics.method34(var12 - 256).method4075()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class258.method4627(var12 - 512).method4279(this.field2596)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2599 != -1L) {
                    var9 = (class135) field2597.method3288(this.field2599);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class129[] var13 = new class129[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class129 var17 = Statics.method34(var16 - 256).method4074();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class129 var18 = class258.method4627(var16 - 512).method4307(this.field2596);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class129 var19 = new class129(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2600[var20] < Statics.field2595[var20].length) {
                        var19.method2234(Statics.field3535[var20], Statics.field2595[var20][this.field2600[var20]]);
                    }
                    if (this.field2600[var20] < Statics.field3730[var20].length) {
                        var19.method2234(Statics.field1991[var20], Statics.field3730[var20][this.field2600[var20]]);
                    }
                }
                var9 = var19.method2242(64, 850, -30, -50, -30);
                field2597.method3278(var9, var5);
                this.field2599 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class135 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4402(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4399(var9, arg3);
        } else {
            var21 = arg0.method4399(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hn.z(I)Ldn;")
    public class129 method3680() {
        if (this.field2594 != -1) {
            return class260.method137(this.field2594).method4345();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2601[var2];
            if (var3 >= 256 && var3 < 512 && !Statics.method34(var3 - 256).method4080()) {
                var1 = true;
            }
            if (var3 >= 512 && !class258.method4627(var3 - 512).method4281(this.field2596)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class129[] var4 = new class129[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2601[var6];
            if (var7 >= 256 && var7 < 512) {
                class129 var8 = Statics.method34(var7 - 256).method4079();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class129 var9 = class258.method4627(var7 - 512).method4277(this.field2596);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class129 var10 = new class129(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2600[var11] < Statics.field2595[var11].length) {
                var10.method2234(Statics.field3535[var11], Statics.field2595[var11][this.field2600[var11]]);
            }
            if (this.field2600[var11] < Statics.field3730[var11].length) {
                var10.method2234(Statics.field1991[var11], Statics.field3730[var11][this.field2600[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hn.r(I)I")
    public int method3677() {
        return this.field2594 == -1 ? (this.field2601[11] << 5) + (this.field2601[8] << 10) + (this.field2601[0] << 15) + (this.field2600[0] << 25) + (this.field2600[4] << 20) + this.field2601[1] : 305419896 + class260.method137(this.field2594).field3546;
    }
}
