package deob;

@ObfuscatedName("fk")
public class class160 {

    @ObfuscatedName("fk.e")
    public int[] field2699;

    @ObfuscatedName("fk.v")
    public int[] field2690;

    @ObfuscatedName("fk.k")
    public boolean field2689;

    @ObfuscatedName("fk.g")
    public int field2697;

    @ObfuscatedName("fk.q")
    public long field2693;

    @ObfuscatedName("fk.l")
    public long field2691;

    @ObfuscatedName("fk.j")
    public static final int[] field2692 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fk.p")
    public static class174 field2694 = new class174(260);

    @ObfuscatedName("fk.e([I[IZII)V")
    public void method2937(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field967; var6++) {
                    class41 var7 = class41.method30(var6);
                    if (var7 != null && !var7.field968 && var7.field961 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2692[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2699 = arg0;
        this.field2690 = arg1;
        this.field2689 = arg2;
        this.field2697 = arg3;
        this.method2913();
    }

    @ObfuscatedName("fk.v(IZB)V")
    public void method2910(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2689) {
            return;
        }
        int var3 = this.field2699[field2692[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class41 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field967) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field967 - 1;
                }
            }
            var4 = class41.method30(var3);
        } while (var4 == null || var4.field968 || (this.field2689 ? 7 : 0) + arg0 != var4.field961);
        this.field2699[field2692[arg0]] = var3 + 256;
        this.method2913();
    }

    @ObfuscatedName("fk.k(IZB)V")
    public void method2920(int arg0, boolean arg1) {
        int var3 = this.field2690[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1889[arg0].length) {
                    var3 = 0;
                }
            } while (!class156.method2703(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1889[arg0].length - 1;
                }
            } while (!class156.method2703(arg0, var3));
        }
        this.field2690[arg0] = var3;
        this.method2913();
    }

    @ObfuscatedName("fk.g(ZI)V")
    public void method2911(boolean arg0) {
        if (this.field2689 != arg0) {
            this.method2937((int[]) null, this.field2690, arg0, -1);
        }
    }

    @ObfuscatedName("fk.q(Ldd;B)V")
    public void method2912(class108 arg0) {
        arg0.method2123(this.field2689 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2699[field2692[var2]];
            if (var3 == 0) {
                arg0.method2123(-1);
            } else {
                arg0.method2123(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2123(this.field2690[var4]);
        }
    }

    @ObfuscatedName("fk.l(I)V")
    public void method2913() {
        long var1 = this.field2693;
        int var3 = this.field2699[5];
        int var4 = this.field2699[9];
        this.field2699[5] = var4;
        this.field2699[9] = var3;
        this.field2693 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2693 <<= 0x4;
            if (this.field2699[var5] >= 256) {
                this.field2693 += (long) (this.field2699[var5] - 256);
            }
        }
        if (this.field2699[0] >= 256) {
            this.field2693 += (long) (this.field2699[0] - 256 >> 4);
        }
        if (this.field2699[1] >= 256) {
            this.field2693 += (long) (this.field2699[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2693 <<= 0x3;
            this.field2693 += (long) this.field2690[var6];
        }
        this.field2693 <<= 0x1;
        this.field2693 += (long) (this.field2689 ? 1 : 0);
        this.field2699[5] = var3;
        this.field2699[9] = var4;
        if (var1 != 0L && this.field2693 != var1) {
            field2694.method3155(var1);
        }
    }

    @ObfuscatedName("fk.a(Lap;ILap;IB)Lcu;")
    public class99 method2908(class39 arg0, int arg1, class39 arg2, int arg3) {
        if (this.field2697 != -1) {
            return class36.method571(this.field2697).method599(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2693;
        int[] var7 = this.field2699;
        if (arg0 != null && (arg0.field923 >= 0 || arg0.field920 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2699[var8];
            }
            if (arg0.field923 >= 0) {
                var5 += (long) (arg0.field923 - this.field2699[5] << 40);
                var7[5] = arg0.field923;
            }
            if (arg0.field920 >= 0) {
                var5 += (long) (arg0.field920 - this.field2699[3] << 48);
                var7[3] = arg0.field920;
            }
        }
        class99 var9 = (class99) field2694.method3154(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class41.method30(var12 - 256).method768()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class46.method476(var12 - 512).method845(this.field2689)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2691 != -1L) {
                    var9 = (class99) field2694.method3154(this.field2691);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class94[] var13 = new class94[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class94 var17 = class41.method30(var16 - 256).method755();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class94 var18 = class46.method476(var16 - 512).method846(this.field2689);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class94 var19 = new class94(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2690[var20] < Statics.field1889[var20].length) {
                        var19.method1901(Statics.field2515[var20], Statics.field1889[var20][this.field2690[var20]]);
                    }
                    if (this.field2690[var20] < Statics.field2695[var20].length) {
                        var19.method1901(Statics.field138[var20], Statics.field2695[var20][this.field2690[var20]]);
                    }
                }
                var9 = var19.method1909(64, 850, -30, -50, -30);
                field2694.method3156(var9, var5);
                this.field2691 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class99 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method706(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method712(var9, arg3);
        } else {
            var21 = arg0.method712(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fk.b(B)Lcd;")
    public class94 method2915() {
        if (this.field2697 != -1) {
            return class36.method571(this.field2697).method620();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2699[var2];
            if (var3 >= 256 && var3 < 512 && !class41.method30(var3 - 256).method769()) {
                var1 = true;
            }
            if (var3 >= 512 && !class46.method476(var3 - 512).method847(this.field2689)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class94[] var4 = new class94[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2699[var6];
            if (var7 >= 256 && var7 < 512) {
                class94 var8 = class41.method30(var7 - 256).method756();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class94 var9 = class46.method476(var7 - 512).method848(this.field2689);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class94 var10 = new class94(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2690[var11] < Statics.field1889[var11].length) {
                var10.method1901(Statics.field2515[var11], Statics.field1889[var11][this.field2690[var11]]);
            }
            if (this.field2690[var11] < Statics.field2695[var11].length) {
                var10.method1901(Statics.field138[var11], Statics.field2695[var11][this.field2690[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fk.z(I)I")
    public int method2914() {
        return this.field2697 == -1 ? (this.field2699[11] << 5) + (this.field2699[8] << 10) + (this.field2699[0] << 15) + (this.field2690[0] << 25) + (this.field2690[4] << 20) + this.field2699[1] : 305419896 + class36.method571(this.field2697).field806;
    }

    @ObfuscatedName("eq.w(I)V")
    public static void method2689() {
        field2694.method3157();
    }
}
