package deob;

@ObfuscatedName("fe")
public class class167 {

    @ObfuscatedName("fe.i")
    public int[] field2180;

    @ObfuscatedName("fe.e")
    public int[] field2175;

    @ObfuscatedName("fe.f")
    public boolean field2174;

    @ObfuscatedName("fe.k")
    public int field2177;

    @ObfuscatedName("fe.g")
    public long field2178;

    @ObfuscatedName("fe.n")
    public long field2179;

    @ObfuscatedName("fe.h")
    public static final int[] field2181 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fe.p")
    public static class125 field2176 = new class125(260);

    @ObfuscatedName("fe.i([I[IZII)V")
    public void method2871(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field2818; var6++) {
                    class193 var7 = class193.method1778(var6);
                    if (var7 != null && !var7.field2830 && var7.field2820 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2181[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2180 = arg0;
        this.field2175 = arg1;
        this.field2174 = arg2;
        this.field2177 = arg3;
        this.method2876();
    }

    @ObfuscatedName("fe.e(IZI)V")
    public void method2872(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2174) {
            return;
        }
        int var3 = this.field2180[field2181[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class193 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field2818) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2818 - 1;
                }
            }
            var4 = class193.method1778(var3);
        } while (var4 == null || var4.field2830 || var4.field2820 != (this.field2174 ? 7 : 0) + arg0);
        this.field2180[field2181[arg0]] = var3 + 256;
        this.method2876();
    }

    @ObfuscatedName("fe.f(IZI)V")
    public void method2873(int arg0, boolean arg1) {
        int var3 = this.field2175[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field3170[arg0].length) {
                    var3 = 0;
                }
            } while (!class168.method165(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3170[arg0].length - 1;
                }
            } while (!class168.method165(arg0, var3));
        }
        this.field2175[arg0] = var3;
        this.method2876();
    }

    @ObfuscatedName("fe.k(ZI)V")
    public void method2874(boolean arg0) {
        if (this.field2174 != arg0) {
            this.method2871((int[]) null, this.field2175, arg0, -1);
        }
    }

    @ObfuscatedName("fe.a(Let;I)V")
    public void method2875(class154 arg0) {
        arg0.method2746(this.field2174 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2180[field2181[var2]];
            if (var3 == 0) {
                arg0.method2746(-1);
            } else {
                arg0.method2746(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2746(this.field2175[var4]);
        }
    }

    @ObfuscatedName("fe.q(I)V")
    public void method2876() {
        long var1 = this.field2178;
        int var3 = this.field2180[5];
        int var4 = this.field2180[9];
        this.field2180[5] = var4;
        this.field2180[9] = var3;
        this.field2178 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2178 <<= 0x4;
            if (this.field2180[var5] >= 256) {
                this.field2178 += (long) (this.field2180[var5] - 256);
            }
        }
        if (this.field2180[0] >= 256) {
            this.field2178 += (long) (this.field2180[0] - 256 >> 4);
        }
        if (this.field2180[1] >= 256) {
            this.field2178 += (long) (this.field2180[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2178 <<= 0x3;
            this.field2178 += (long) this.field2175[var6];
        }
        this.field2178 <<= 0x1;
        this.field2178 += (long) (this.field2174 ? 1 : 0);
        this.field2180[5] = var3;
        this.field2180[9] = var4;
        if (var1 != 0L && this.field2178 != var1) {
            field2176.method2151(var1);
        }
    }

    @ObfuscatedName("fe.w(Lgd;ILgd;II)Lch;")
    public class83 method2870(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field2177 != -1) {
            return class200.method1368(this.field2177).method3428(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2178;
        int[] var7 = this.field2180;
        if (arg0 != null && (arg0.field3061 >= 0 || arg0.field3050 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2180[var8];
            }
            if (arg0.field3061 >= 0) {
                var5 += (long) (arg0.field3061 - this.field2180[5] << 40);
                var7[5] = arg0.field3061;
            }
            if (arg0.field3050 >= 0) {
                var5 += (long) (arg0.field3050 - this.field2180[3] << 48);
                var7[3] = arg0.field3050;
            }
        }
        class83 var9 = (class83) field2176.method2150(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class193.method1778(var12 - 256).method3234()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class199.method96(var12 - 512).method3397(this.field2174)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2179 != -1L) {
                    var9 = (class83) field2176.method2150(this.field2179);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class77[] var13 = new class77[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class77 var17 = class193.method1778(var16 - 256).method3249();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class77 var18 = class199.method96(var16 - 512).method3386(this.field2174);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class77 var19 = new class77(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2175[var20] < Statics.field3170[var20].length) {
                        var19.method1405(Statics.field1196[var20], Statics.field3170[var20][this.field2175[var20]]);
                    }
                    if (this.field2175[var20] < Statics.field2184[var20].length) {
                        var19.method1405(Statics.field5[var20], Statics.field2184[var20][this.field2175[var20]]);
                    }
                }
                var9 = var19.method1402(64, 850, -30, -50, -30);
                field2176.method2152(var9, var5);
                this.field2179 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class83 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method3478(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method3475(var9, arg3);
        } else {
            var21 = arg0.method3475(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fe.v(I)Lbv;")
    public class77 method2878() {
        if (this.field2177 != -1) {
            return class200.method1368(this.field2177).method3448();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2180[var2];
            if (var3 >= 256 && var3 < 512 && !class193.method1778(var3 - 256).method3236()) {
                var1 = true;
            }
            if (var3 >= 512 && !class199.method96(var3 - 512).method3381(this.field2174)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class77[] var4 = new class77[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2180[var6];
            if (var7 >= 256 && var7 < 512) {
                class77 var8 = class193.method1778(var7 - 256).method3237();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class77 var9 = class199.method96(var7 - 512).method3417(this.field2174);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class77 var10 = new class77(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2175[var11] < Statics.field3170[var11].length) {
                var10.method1405(Statics.field1196[var11], Statics.field3170[var11][this.field2175[var11]]);
            }
            if (this.field2175[var11] < Statics.field2184[var11].length) {
                var10.method1405(Statics.field5[var11], Statics.field2184[var11][this.field2175[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fe.h(I)I")
    public int method2894() {
        return this.field2177 == -1 ? (this.field2180[11] << 5) + (this.field2180[8] << 10) + (this.field2180[0] << 15) + (this.field2175[4] << 20) + (this.field2175[0] << 25) + this.field2180[1] : 305419896 + class200.method1368(this.field2177).field3027;
    }
}
