package deob;

@ObfuscatedName("fv")
public class class167 {

    @ObfuscatedName("fv.x")
    public int[] field2180;

    @ObfuscatedName("fv.n")
    public int[] field2173;

    @ObfuscatedName("fv.g")
    public boolean field2176;

    @ObfuscatedName("fv.v")
    public int field2172;

    @ObfuscatedName("fv.y")
    public long field2174;

    @ObfuscatedName("fv.p")
    public long field2178;

    @ObfuscatedName("fv.s")
    public static final int[] field2169 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fv.k")
    public static class125 field2177 = new class125(260);

    @ObfuscatedName("fv.x([I[IZII)V")
    public void method3074(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field2832; var6++) {
                    class193 var7 = class193.method3035(var6);
                    if (var7 != null && !var7.field2825 && var7.field2826 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2169[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2180 = arg0;
        this.field2173 = arg1;
        this.field2176 = arg2;
        this.field2172 = arg3;
        this.method3045();
    }

    @ObfuscatedName("fv.n(IZI)V")
    public void method3070(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2176) {
            return;
        }
        int var3 = this.field2180[field2169[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class193 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field2832) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2832 - 1;
                }
            }
            var4 = class193.method3035(var3);
        } while (var4 == null || var4.field2825 || var4.field2826 != arg0 + (this.field2176 ? 7 : 0));
        this.field2180[field2169[arg0]] = var3 + 256;
        this.method3045();
    }

    @ObfuscatedName("fv.g(IZI)V")
    public void method3067(int arg0, boolean arg1) {
        int var3 = this.field2173[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2160[arg0].length) {
                    var3 = 0;
                }
            } while (!class168.method814(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2160[arg0].length - 1;
                }
            } while (!class168.method814(arg0, var3));
        }
        this.field2173[arg0] = var3;
        this.method3045();
    }

    @ObfuscatedName("fv.v(ZI)V")
    public void method3041(boolean arg0) {
        if (this.field2176 != arg0) {
            this.method3074((int[]) null, this.field2173, arg0, -1);
        }
    }

    @ObfuscatedName("fv.y(Leq;I)V")
    public void method3039(class154 arg0) {
        arg0.method2688(this.field2176 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2180[field2169[var2]];
            if (var3 == 0) {
                arg0.method2688(-1);
            } else {
                arg0.method2688(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2688(this.field2173[var4]);
        }
    }

    @ObfuscatedName("fv.p(I)V")
    public void method3045() {
        long var1 = this.field2174;
        int var3 = this.field2180[5];
        int var4 = this.field2180[9];
        this.field2180[5] = var4;
        this.field2180[9] = var3;
        this.field2174 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2174 <<= 0x4;
            if (this.field2180[var5] >= 256) {
                this.field2174 += (long) (this.field2180[var5] - 256);
            }
        }
        if (this.field2180[0] >= 256) {
            this.field2174 += (long) (this.field2180[0] - 256 >> 4);
        }
        if (this.field2180[1] >= 256) {
            this.field2174 += (long) (this.field2180[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2174 <<= 0x3;
            this.field2174 += (long) this.field2173[var6];
        }
        this.field2174 <<= 0x1;
        this.field2174 += (long) (this.field2176 ? 1 : 0);
        this.field2180[5] = var3;
        this.field2180[9] = var4;
        if (var1 != 0L && this.field2174 != var1) {
            field2177.method2276(var1);
        }
    }

    @ObfuscatedName("fv.j(Lgk;ILgk;II)Lcj;")
    public class83 method3046(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field2172 != -1) {
            return class200.method2965(this.field2172).method3568(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2174;
        int[] var7 = this.field2180;
        if (arg0 != null && (arg0.field3071 >= 0 || arg0.field3072 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2180[var8];
            }
            if (arg0.field3071 >= 0) {
                var5 += (long) (arg0.field3071 - this.field2180[5] << 40);
                var7[5] = arg0.field3071;
            }
            if (arg0.field3072 >= 0) {
                var5 += (long) (arg0.field3072 - this.field2180[3] << 48);
                var7[3] = arg0.field3072;
            }
        }
        class83 var9 = (class83) field2177.method2275(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class193.method3035(var12 - 256).method3352()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class199.method973(var12 - 512).method3505(this.field2176)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2178 != -1L) {
                    var9 = (class83) field2177.method2275(this.field2178);
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
                        class77 var17 = class193.method3035(var16 - 256).method3355();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class77 var18 = class199.method973(var16 - 512).method3506(this.field2176);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class77 var19 = new class77(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2173[var20] < Statics.field2160[var20].length) {
                        var19.method1539(Statics.field2175[var20], Statics.field2160[var20][this.field2173[var20]]);
                    }
                    if (this.field2173[var20] < Statics.field1125[var20].length) {
                        var19.method1539(Statics.field2034[var20], Statics.field1125[var20][this.field2173[var20]]);
                    }
                }
                var9 = var19.method1546(64, 850, -30, -50, -30);
                field2177.method2282(var9, var5);
                this.field2178 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class83 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method3622(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method3609(var9, arg3);
        } else {
            var21 = arg0.method3609(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fv.s(I)Lbc;")
    public class77 method3047() {
        if (this.field2172 != -1) {
            return class200.method2965(this.field2172).method3586();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2180[var2];
            if (var3 >= 256 && var3 < 512 && !class193.method3035(var3 - 256).method3354()) {
                var1 = true;
            }
            if (var3 >= 512 && !class199.method973(var3 - 512).method3500(this.field2176)) {
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
                class77 var8 = class193.method3035(var7 - 256).method3377();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class77 var9 = class199.method973(var7 - 512).method3515(this.field2176);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class77 var10 = new class77(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2173[var11] < Statics.field2160[var11].length) {
                var10.method1539(Statics.field2175[var11], Statics.field2160[var11][this.field2173[var11]]);
            }
            if (this.field2173[var11] < Statics.field1125[var11].length) {
                var10.method1539(Statics.field2034[var11], Statics.field1125[var11][this.field2173[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fv.k(I)I")
    public int method3048() {
        return this.field2172 == -1 ? (this.field2180[11] << 5) + (this.field2180[8] << 10) + (this.field2180[0] << 15) + (this.field2173[0] << 25) + (this.field2173[4] << 20) + this.field2180[1] : 305419896 + class200.method2965(this.field2172).field3011;
    }
}
