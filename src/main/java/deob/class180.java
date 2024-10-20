package deob;

@ObfuscatedName("fa")
public class class180 {

    @ObfuscatedName("fa.f")
    public int[] field2914;

    @ObfuscatedName("fa.u")
    public int[] field2915;

    @ObfuscatedName("fa.x")
    public boolean field2918;

    @ObfuscatedName("fa.b")
    public int field2917;

    @ObfuscatedName("fa.l")
    public long field2922;

    @ObfuscatedName("fa.d")
    public long field2916;

    @ObfuscatedName("fa.r")
    public static final int[] field2919 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fa.k")
    public static class194 field2923 = new class194(260);

    @ObfuscatedName("fa.f([I[IZII)V")
    public void method3277(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3163; var6++) {
                    class45 var7 = class45.method686(var6);
                    if (var7 != null && !var7.field1050 && var7.field1043 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2919[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2914 = arg0;
        this.field2915 = arg1;
        this.field2918 = arg2;
        this.field2917 = arg3;
        this.method3276();
    }

    @ObfuscatedName("fa.u(IZI)V")
    public void method3290(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2918) {
            return;
        }
        int var3 = this.field2914[field2919[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3163) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3163 - 1;
                }
            }
            var4 = class45.method686(var3);
        } while (var4 == null || var4.field1050 || (this.field2918 ? 7 : 0) + arg0 != var4.field1043);
        this.field2914[field2919[arg0]] = var3 + 256;
        this.method3276();
    }

    @ObfuscatedName("fa.x(IZI)V")
    public void method3279(int arg0, boolean arg1) {
        int var3 = this.field2915[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2702[arg0].length) {
                    var3 = 0;
                }
            } while (!class175.method2081(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2702[arg0].length - 1;
                }
            } while (!class175.method2081(arg0, var3));
        }
        this.field2915[arg0] = var3;
        this.method3276();
    }

    @ObfuscatedName("fa.b(ZB)V")
    public void method3280(boolean arg0) {
        if (this.field2918 != arg0) {
            this.method3277((int[]) null, this.field2915, arg0, -1);
        }
    }

    @ObfuscatedName("fa.l(Ldj;I)V")
    public void method3281(class120 arg0) {
        arg0.method2485(this.field2918 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2914[field2919[var2]];
            if (var3 == 0) {
                arg0.method2485(-1);
            } else {
                arg0.method2485(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2485(this.field2915[var4]);
        }
    }

    @ObfuscatedName("fa.d(I)V")
    public void method3276() {
        long var1 = this.field2922;
        int var3 = this.field2914[5];
        int var4 = this.field2914[9];
        this.field2914[5] = var4;
        this.field2914[9] = var3;
        this.field2922 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2922 <<= 0x4;
            if (this.field2914[var5] >= 256) {
                this.field2922 += (long) (this.field2914[var5] - 256);
            }
        }
        if (this.field2914[0] >= 256) {
            this.field2922 += (long) (this.field2914[0] - 256 >> 4);
        }
        if (this.field2914[1] >= 256) {
            this.field2922 += (long) (this.field2914[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2922 <<= 0x3;
            this.field2922 += (long) this.field2915[var6];
        }
        this.field2922 <<= 0x1;
        this.field2922 += (long) (this.field2918 ? 1 : 0);
        this.field2914[5] = var3;
        this.field2914[9] = var4;
        if (var1 != 0L && this.field2922 != var1) {
            field2923.method3522(var1);
        }
    }

    @ObfuscatedName("fa.n(Laa;ILaa;II)Ldr;")
    public class106 method3283(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2917 != -1) {
            return class40.method3193(this.field2917).method784(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2922;
        int[] var7 = this.field2914;
        if (arg0 != null && (arg0.field1011 >= 0 || arg0.field1007 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2914[var8];
            }
            if (arg0.field1011 >= 0) {
                var5 += (long) (arg0.field1011 - this.field2914[5] << 40);
                var7[5] = arg0.field1011;
            }
            if (arg0.field1007 >= 0) {
                var5 += (long) (arg0.field1007 - this.field2914[3] << 48);
                var7[3] = arg0.field1007;
            }
        }
        class106 var9 = (class106) field2923.method3530(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method686(var12 - 256).method954()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method2827(var12 - 512).method1057(this.field2918)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2916 != -1L) {
                    var9 = (class106) field2923.method3530(this.field2916);
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
                        class101 var17 = class45.method686(var16 - 256).method932();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class52.method2827(var16 - 512).method1088(this.field2918);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2915[var20] < Statics.field2702[var20].length) {
                        var19.method2179(Statics.field2920[var20], Statics.field2702[var20][this.field2915[var20]]);
                    }
                    if (this.field2915[var20] < Statics.field2921[var20].length) {
                        var19.method2179(Statics.field1621[var20], Statics.field2921[var20][this.field2915[var20]]);
                    }
                }
                var9 = var19.method2128(64, 850, -30, -50, -30);
                field2923.method3521(var9, var5);
                this.field2916 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class106 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method878(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method901(var9, arg3);
        } else {
            var21 = arg0.method901(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fa.m(B)Lct;")
    public class101 method3307() {
        if (this.field2917 != -1) {
            return class40.method3193(this.field2917).method785();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2914[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method686(var3 - 256).method948()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method2827(var3 - 512).method1073(this.field2918)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2914[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class45.method686(var7 - 256).method934();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class52.method2827(var7 - 512).method1072(this.field2918);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2915[var11] < Statics.field2702[var11].length) {
                var10.method2179(Statics.field2920[var11], Statics.field2702[var11][this.field2915[var11]]);
            }
            if (this.field2915[var11] < Statics.field2921[var11].length) {
                var10.method2179(Statics.field1621[var11], Statics.field2921[var11][this.field2915[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fa.g(I)I")
    public int method3285() {
        return this.field2917 == -1 ? (this.field2914[11] << 5) + (this.field2914[8] << 10) + (this.field2914[0] << 15) + (this.field2915[4] << 20) + (this.field2915[0] << 25) + this.field2914[1] : 305419896 + class40.method3193(this.field2917).field900;
    }

    @ObfuscatedName("cu.s(B)V")
    public static void method2181() {
        field2923.method3529();
    }
}
