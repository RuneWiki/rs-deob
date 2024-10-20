package deob;

@ObfuscatedName("hw")
public class class214 {

    @ObfuscatedName("hw.i")
    public int[] field2618;

    @ObfuscatedName("hw.h")
    public int[] field2607;

    @ObfuscatedName("hw.u")
    public boolean field2608;

    @ObfuscatedName("hw.q")
    public int field2609;

    @ObfuscatedName("hw.g")
    public long field2610;

    @ObfuscatedName("hw.v")
    public long field2611;

    @ObfuscatedName("hw.k")
    public static final int[] field2613 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hw.r")
    public static class190 field2614 = new class190(260);

    @ObfuscatedName("hw.i([I[IZIB)V")
    public void method3702(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3339; var6++) {
                    class248 var7 = class248.method1963(var6);
                    if (var7 != null && !var7.field3349 && var7.field3338 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2613[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2618 = arg0;
        this.field2607 = arg1;
        this.field2608 = arg2;
        this.field2609 = arg3;
        this.method3715();
    }

    @ObfuscatedName("hw.h(IZI)V")
    public void method3716(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2608) {
            return;
        }
        int var3 = this.field2618[field2613[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class248 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3339) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3339 - 1;
                }
            }
            var4 = class248.method1963(var3);
        } while (var4 == null || var4.field3349 || var4.field3338 != arg0 + (this.field2608 ? 7 : 0));
        this.field2618[field2613[arg0]] = var3 + 256;
        this.method3715();
    }

    @ObfuscatedName("hw.u(IZI)V")
    public void method3690(int arg0, boolean arg1) {
        int var3 = this.field2607[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2612[arg0].length) {
                    var3 = 0;
                }
            } while (!class215.method75(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2612[arg0].length - 1;
                }
            } while (!class215.method75(arg0, var3));
        }
        this.field2607[arg0] = var3;
        this.method3715();
    }

    @ObfuscatedName("hw.q(ZI)V")
    public void method3691(boolean arg0) {
        if (this.field2608 != arg0) {
            this.method3702((int[]) null, this.field2607, arg0, -1);
        }
    }

    @ObfuscatedName("hw.g(Lfv;I)V")
    public void method3700(class174 arg0) {
        arg0.method3031(this.field2608 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2618[field2613[var2]];
            if (var3 == 0) {
                arg0.method3031(-1);
            } else {
                arg0.method3031(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3031(this.field2607[var4]);
        }
    }

    @ObfuscatedName("hw.v(B)V")
    public void method3715() {
        long var1 = this.field2610;
        int var3 = this.field2618[5];
        int var4 = this.field2618[9];
        this.field2618[5] = var4;
        this.field2618[9] = var3;
        this.field2610 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2610 <<= 0x4;
            if (this.field2618[var5] >= 256) {
                this.field2610 += (long) (this.field2618[var5] - 256);
            }
        }
        if (this.field2618[0] >= 256) {
            this.field2610 += (long) (this.field2618[0] - 256 >> 4);
        }
        if (this.field2618[1] >= 256) {
            this.field2610 += (long) (this.field2618[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2610 <<= 0x3;
            this.field2610 += (long) this.field2607[var6];
        }
        this.field2610 <<= 0x1;
        this.field2610 += (long) (this.field2608 ? 1 : 0);
        this.field2618[5] = var3;
        this.field2618[9] = var4;
        if (var1 != 0L && this.field2610 != var1) {
            field2614.method3307(var1);
        }
    }

    @ObfuscatedName("hw.t(Lje;ILje;IB)Lew;")
    public class134 method3694(class261 arg0, int arg1, class261 arg2, int arg3) {
        if (this.field2609 != -1) {
            return Statics.method3810(this.field2609).method4343(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2610;
        int[] var7 = this.field2618;
        if (arg0 != null && (arg0.field3601 >= 0 || arg0.field3608 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2618[var8];
            }
            if (arg0.field3601 >= 0) {
                var5 += (long) (arg0.field3601 - this.field2618[5] << 40);
                var7[5] = arg0.field3601;
            }
            if (arg0.field3608 >= 0) {
                var5 += (long) (arg0.field3608 - this.field2618[3] << 48);
                var7[3] = arg0.field3608;
            }
        }
        class134 var9 = (class134) field2614.method3308(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class248.method1963(var12 - 256).method4089()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class257.method678(var12 - 512).method4282(this.field2608)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2611 != -1L) {
                    var9 = (class134) field2614.method3308(this.field2611);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class128[] var13 = new class128[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class128 var17 = class248.method1963(var16 - 256).method4086();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class128 var18 = class257.method678(var16 - 512).method4283(this.field2608);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class128 var19 = new class128(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2607[var20] < Statics.field2612[var20].length) {
                        var19.method2289(Statics.field2616[var20], Statics.field2612[var20][this.field2607[var20]]);
                    }
                    if (this.field2607[var20] < Statics.field1522[var20].length) {
                        var19.method2289(Statics.field1364[var20], Statics.field1522[var20][this.field2607[var20]]);
                    }
                }
                var9 = var19.method2271(64, 850, -30, -50, -30);
                field2614.method3316(var9, var5);
                this.field2611 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class134 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4398(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4395(var9, arg3);
        } else {
            var21 = arg0.method4395(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hw.p(I)Ldf;")
    public class128 method3695() {
        if (this.field2609 != -1) {
            return Statics.method3810(this.field2609).method4344();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2618[var2];
            if (var3 >= 256 && var3 < 512 && !class248.method1963(var3 - 256).method4091()) {
                var1 = true;
            }
            if (var3 >= 512 && !class257.method678(var3 - 512).method4284(this.field2608)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class128[] var4 = new class128[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2618[var6];
            if (var7 >= 256 && var7 < 512) {
                class128 var8 = class248.method1963(var7 - 256).method4096();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class128 var9 = class257.method678(var7 - 512).method4287(this.field2608);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class128 var10 = new class128(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2607[var11] < Statics.field2612[var11].length) {
                var10.method2289(Statics.field2616[var11], Statics.field2612[var11][this.field2607[var11]]);
            }
            if (this.field2607[var11] < Statics.field1522[var11].length) {
                var10.method2289(Statics.field1364[var11], Statics.field1522[var11][this.field2607[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hw.l(I)I")
    public int method3714() {
        return this.field2609 == -1 ? (this.field2618[11] << 5) + (this.field2618[8] << 10) + (this.field2618[0] << 15) + (this.field2607[0] << 25) + (this.field2607[4] << 20) + this.field2618[1] : 305419896 + Statics.method3810(this.field2609).field3547;
    }

    @ObfuscatedName("er.a(B)V")
    public static void method2691() {
        field2614.method3311();
    }
}
