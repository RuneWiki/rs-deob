package deob;

@ObfuscatedName("fp")
public class class169 {

    @ObfuscatedName("fp.d")
    public int[] field2189;

    @ObfuscatedName("fp.c")
    public int[] field2179;

    @ObfuscatedName("fp.n")
    public boolean field2180;

    @ObfuscatedName("fp.q")
    public int field2183;

    @ObfuscatedName("fp.t")
    public long field2181;

    @ObfuscatedName("fp.p")
    public long field2178;

    @ObfuscatedName("fp.g")
    public static final int[] field2185 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fp.w")
    public static class146 field2186 = new class146(260);

    @ObfuscatedName("fp.d([I[IZII)V")
    public void method2946(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field2841; var6++) {
                    class195 var7 = class195.method152(var6);
                    if (var7 != null && !var7.field2842 && var7.field2835 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2185[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2189 = arg0;
        this.field2179 = arg1;
        this.field2180 = arg2;
        this.field2183 = arg3;
        this.method2951();
    }

    @ObfuscatedName("fp.c(IZI)V")
    public void method2966(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2180) {
            return;
        }
        int var3 = this.field2189[field2185[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class195 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field2841) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2841 - 1;
                }
            }
            var4 = class195.method152(var3);
        } while (var4 == null || var4.field2842 || var4.field2835 != arg0 + (this.field2180 ? 7 : 0));
        this.field2189[field2185[arg0]] = var3 + 256;
        this.method2951();
    }

    @ObfuscatedName("fp.n(IZI)V")
    public void method2958(int arg0, boolean arg1) {
        int var3 = this.field2179[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1762[arg0].length) {
                    var3 = 0;
                }
            } while (!class170.method1934(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1762[arg0].length - 1;
                }
            } while (!class170.method1934(arg0, var3));
        }
        this.field2179[arg0] = var3;
        this.method2951();
    }

    @ObfuscatedName("fp.q(ZS)V")
    public void method2949(boolean arg0) {
        if (this.field2180 != arg0) {
            this.method2946((int[]) null, this.field2179, arg0, -1);
        }
    }

    @ObfuscatedName("fp.t(Ldu;I)V")
    public void method2947(class130 arg0) {
        arg0.method2215(this.field2180 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2189[field2185[var2]];
            if (var3 == 0) {
                arg0.method2215(-1);
            } else {
                arg0.method2215(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2215(this.field2179[var4]);
        }
    }

    @ObfuscatedName("fp.p(I)V")
    public void method2951() {
        long var1 = this.field2181;
        int var3 = this.field2189[5];
        int var4 = this.field2189[9];
        this.field2189[5] = var4;
        this.field2189[9] = var3;
        this.field2181 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2181 <<= 0x4;
            if (this.field2189[var5] >= 256) {
                this.field2181 += (long) (this.field2189[var5] - 256);
            }
        }
        if (this.field2189[0] >= 256) {
            this.field2181 += (long) (this.field2189[0] - 256 >> 4);
        }
        if (this.field2189[1] >= 256) {
            this.field2181 += (long) (this.field2189[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2181 <<= 0x3;
            this.field2181 += (long) this.field2179[var6];
        }
        this.field2181 <<= 0x1;
        this.field2181 += (long) (this.field2180 ? 1 : 0);
        this.field2189[5] = var3;
        this.field2189[9] = var4;
        if (var1 != 0L && this.field2181 != var1) {
            field2186.method2608(var1);
        }
    }

    @ObfuscatedName("fp.u(Lgg;ILgg;II)Lcf;")
    public class83 method2972(class207 arg0, int arg1, class207 arg2, int arg3) {
        if (this.field2183 != -1) {
            return class205.method3033(this.field2183).method3600(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2181;
        int[] var7 = this.field2189;
        if (arg0 != null && (arg0.field3098 >= 0 || arg0.field3085 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2189[var8];
            }
            if (arg0.field3098 >= 0) {
                var5 += (long) (arg0.field3098 - this.field2189[5] << 40);
                var7[5] = arg0.field3098;
            }
            if (arg0.field3085 >= 0) {
                var5 += (long) (arg0.field3085 - this.field2189[3] << 48);
                var7[3] = arg0.field3085;
            }
        }
        class83 var9 = (class83) field2186.method2598(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class195.method152(var12 - 256).method3314()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class204.method868(var12 - 512).method3549(this.field2180)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2178 != -1L) {
                    var9 = (class83) field2186.method2598(this.field2178);
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
                        class77 var17 = class195.method152(var16 - 256).method3298();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class77 var18 = class204.method868(var16 - 512).method3533(this.field2180);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class77 var19 = new class77(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2179[var20] < Statics.field1762[var20].length) {
                        var19.method1406(Statics.field156[var20], Statics.field1762[var20][this.field2179[var20]]);
                    }
                    if (this.field2179[var20] < Statics.field2184[var20].length) {
                        var19.method1406(Statics.field1795[var20], Statics.field2184[var20][this.field2179[var20]]);
                    }
                }
                var9 = var19.method1417(64, 850, -30, -50, -30);
                field2186.method2607(var9, var5);
                this.field2178 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class83 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method3662(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method3649(var9, arg3);
        } else {
            var21 = arg0.method3649(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fp.w(I)Lbd;")
    public class77 method2955() {
        if (this.field2183 != -1) {
            return class205.method3033(this.field2183).method3619();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2189[var2];
            if (var3 >= 256 && var3 < 512 && !class195.method152(var3 - 256).method3320()) {
                var1 = true;
            }
            if (var3 >= 512 && !class204.method868(var3 - 512).method3534(this.field2180)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class77[] var4 = new class77[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2189[var6];
            if (var7 >= 256 && var7 < 512) {
                class77 var8 = class195.method152(var7 - 256).method3326();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class77 var9 = class204.method868(var7 - 512).method3535(this.field2180);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class77 var10 = new class77(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2179[var11] < Statics.field1762[var11].length) {
                var10.method1406(Statics.field156[var11], Statics.field1762[var11][this.field2179[var11]]);
            }
            if (this.field2179[var11] < Statics.field2184[var11].length) {
                var10.method1406(Statics.field1795[var11], Statics.field2184[var11][this.field2179[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fp.r(I)I")
    public int method2970() {
        return this.field2183 == -1 ? (this.field2189[11] << 5) + (this.field2189[8] << 10) + (this.field2189[0] << 15) + (this.field2179[0] << 25) + (this.field2179[4] << 20) + this.field2189[1] : 305419896 + class205.method3033(this.field2183).field3038;
    }
}
