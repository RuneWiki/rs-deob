package deob;

@ObfuscatedName("fl")
public class class162 {

    @ObfuscatedName("fl.u")
    public int[] field2702;

    @ObfuscatedName("fl.k")
    public int[] field2709;

    @ObfuscatedName("fl.x")
    public boolean field2703;

    @ObfuscatedName("fl.m")
    public int field2704;

    @ObfuscatedName("fl.n")
    public long field2705;

    @ObfuscatedName("fl.q")
    public long field2706;

    @ObfuscatedName("fl.w")
    public static final int[] field2701 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fl.z")
    public static class169 field2711 = new class169(260);

    @ObfuscatedName("fl.u([I[IZIB)V")
    public void method3184(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field914; var6++) {
                    class35 var7 = class35.method3101(var6);
                    if (var7 != null && !var7.field915 && (arg2 ? 7 : 0) + var5 == var7.field912) {
                        arg0[field2701[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2702 = arg0;
        this.field2709 = arg1;
        this.field2703 = arg2;
        this.field2704 = arg3;
        this.method3180();
    }

    @ObfuscatedName("fl.k(IZI)V")
    public void method3176(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2703) {
            return;
        }
        int var3 = this.field2702[field2701[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class35 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field914) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field914 - 1;
                }
            }
            var4 = class35.method3101(var3);
        } while (var4 == null || var4.field915 || var4.field912 != (this.field2703 ? 7 : 0) + arg0);
        this.field2702[field2701[arg0]] = var3 + 256;
        this.method3180();
    }

    @ObfuscatedName("fl.x(IZI)V")
    public void method3177(int arg0, boolean arg1) {
        int var3 = this.field2709[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2708[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2708[arg0].length - 1;
            }
        }
        this.field2709[arg0] = var3;
        this.method3180();
    }

    @ObfuscatedName("fl.m(ZI)V")
    public void method3178(boolean arg0) {
        if (this.field2703 != arg0) {
            this.method3184((int[]) null, this.field2709, arg0, -1);
        }
    }

    @ObfuscatedName("fl.n(Ldl;B)V")
    public void method3179(class126 arg0) {
        arg0.method2554(this.field2703 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2702[field2701[var2]];
            if (var3 == 0) {
                arg0.method2554(-1);
            } else {
                arg0.method2554(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2554(this.field2709[var4]);
        }
    }

    @ObfuscatedName("fl.q(I)V")
    public void method3180() {
        long var1 = this.field2705;
        int var3 = this.field2702[5];
        int var4 = this.field2702[9];
        this.field2702[5] = var4;
        this.field2702[9] = var3;
        this.field2705 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2705 <<= 0x4;
            if (this.field2702[var5] >= 256) {
                this.field2705 += (long) (this.field2702[var5] - 256);
            }
        }
        if (this.field2702[0] >= 256) {
            this.field2705 += (long) (this.field2702[0] - 256 >> 4);
        }
        if (this.field2702[1] >= 256) {
            this.field2705 += (long) (this.field2702[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2705 <<= 0x3;
            this.field2705 += (long) this.field2709[var6];
        }
        this.field2705 <<= 0x1;
        this.field2705 += (long) (this.field2703 ? 1 : 0);
        this.field2702[5] = var3;
        this.field2702[9] = var4;
        if (var1 != 0L && this.field2705 != var1) {
            field2711.method3262(var1);
        }
    }

    @ObfuscatedName("fl.a(Lad;ILad;II)Ldd;")
    public class111 method3201(class33 arg0, int arg1, class33 arg2, int arg3) {
        if (this.field2704 != -1) {
            return Statics.method202(this.field2704).method585(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2705;
        int[] var7 = this.field2702;
        if (arg0 != null && (arg0.field881 >= 0 || arg0.field885 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2702[var8];
            }
            if (arg0.field881 >= 0) {
                var5 += (long) (arg0.field881 - this.field2702[5] << 40);
                var7[5] = arg0.field881;
            }
            if (arg0.field885 >= 0) {
                var5 += (long) (arg0.field885 - this.field2702[3] << 48);
                var7[3] = arg0.field885;
            }
        }
        class111 var9 = (class111) field2711.method3263(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class35.method3101(var12 - 256).method734()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class39.method525(var12 - 512).method819(this.field2703)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2706 != -1L) {
                    var9 = (class111) field2711.method3263(this.field2706);
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
                        class100 var17 = class35.method3101(var16 - 256).method735();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class39.method525(var16 - 512).method827(this.field2703);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2709[var20] < Statics.field2708[var20].length) {
                        var19.method2107(Statics.field2707[var20], Statics.field2708[var20][this.field2709[var20]]);
                    }
                    if (this.field2709[var20] < Statics.field2698[var20].length) {
                        var19.method2107(Statics.field1995[var20], Statics.field2698[var20][this.field2709[var20]]);
                    }
                }
                var9 = var19.method2064(64, 850, -30, -50, -30);
                field2711.method3260(var9, var5);
                this.field2706 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class111 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method678(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method692(var9, arg3);
        } else {
            var21 = arg0.method692(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fl.g(B)Lcj;")
    public class100 method3182() {
        if (this.field2704 != -1) {
            return Statics.method202(this.field2704).method581();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2702[var2];
            if (var3 >= 256 && var3 < 512 && !class35.method3101(var3 - 256).method736()) {
                var1 = true;
            }
            if (var3 >= 512 && !class39.method525(var3 - 512).method858(this.field2703)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2702[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class35.method3101(var7 - 256).method756();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class39.method525(var7 - 512).method820(this.field2703);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2709[var11] < Statics.field2708[var11].length) {
                var10.method2107(Statics.field2707[var11], Statics.field2708[var11][this.field2709[var11]]);
            }
            if (this.field2709[var11] < Statics.field2698[var11].length) {
                var10.method2107(Statics.field1995[var11], Statics.field2698[var11][this.field2709[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fl.j(I)I")
    public int method3203() {
        return this.field2704 == -1 ? (this.field2702[11] << 5) + (this.field2702[8] << 10) + (this.field2702[0] << 15) + (this.field2709[4] << 20) + (this.field2709[0] << 25) + this.field2702[1] : 305419896 + Statics.method202(this.field2704).field791;
    }

    @ObfuscatedName("d.l(B)V")
    public static void method150() {
        field2711.method3261();
    }
}
