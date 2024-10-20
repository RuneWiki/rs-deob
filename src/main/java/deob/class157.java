package deob;

@ObfuscatedName("fg")
public class class157 {

    @ObfuscatedName("fg.z")
    public int[] field2657;

    @ObfuscatedName("fg.j")
    public int[] field2666;

    @ObfuscatedName("fg.a")
    public boolean field2659;

    @ObfuscatedName("fg.y")
    public int field2660;

    @ObfuscatedName("fg.i")
    public long field2669;

    @ObfuscatedName("fg.b")
    public long field2662;

    @ObfuscatedName("fg.r")
    public static final int[] field2661 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fg.o")
    public static class171 field2665 = new class171(260);

    @ObfuscatedName("fg.z([I[IZIB)V")
    public void method2914(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field925; var6++) {
                    class40 var7 = class40.method19(var6);
                    if (var7 != null && !var7.field923 && var7.field912 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2661[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2657 = arg0;
        this.field2666 = arg1;
        this.field2659 = arg2;
        this.field2660 = arg3;
        this.method2932();
    }

    @ObfuscatedName("fg.j(IZI)V")
    public void method2915(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2659) {
            return;
        }
        int var3 = this.field2657[field2661[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class40 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field925) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field925 - 1;
                }
            }
            var4 = class40.method19(var3);
        } while (var4 == null || var4.field923 || var4.field912 != (this.field2659 ? 7 : 0) + arg0);
        this.field2657[field2661[arg0]] = var3 + 256;
        this.method2932();
    }

    @ObfuscatedName("fg.a(IZI)V")
    public void method2916(int arg0, boolean arg1) {
        int var3 = this.field2666[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2128[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2128[arg0].length - 1;
            }
        }
        this.field2666[arg0] = var3;
        this.method2932();
    }

    @ObfuscatedName("fg.y(ZI)V")
    public void method2923(boolean arg0) {
        if (this.field2659 != arg0) {
            this.method2914((int[]) null, this.field2666, arg0, -1);
        }
    }

    @ObfuscatedName("fg.i(Ldq;I)V")
    public void method2943(class107 arg0) {
        arg0.method2108(this.field2659 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2657[field2661[var2]];
            if (var3 == 0) {
                arg0.method2108(-1);
            } else {
                arg0.method2108(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2108(this.field2666[var4]);
        }
    }

    @ObfuscatedName("fg.b(B)V")
    public void method2932() {
        long var1 = this.field2669;
        int var3 = this.field2657[5];
        int var4 = this.field2657[9];
        this.field2657[5] = var4;
        this.field2657[9] = var3;
        this.field2669 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2669 <<= 0x4;
            if (this.field2657[var5] >= 256) {
                this.field2669 += (long) (this.field2657[var5] - 256);
            }
        }
        if (this.field2657[0] >= 256) {
            this.field2669 += (long) (this.field2657[0] - 256 >> 4);
        }
        if (this.field2657[1] >= 256) {
            this.field2669 += (long) (this.field2657[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2669 <<= 0x3;
            this.field2669 += (long) this.field2666[var6];
        }
        this.field2669 <<= 0x1;
        this.field2669 += (long) (this.field2659 ? 1 : 0);
        this.field2657[5] = var3;
        this.field2657[9] = var4;
        if (var1 != 0L && this.field2669 != var1) {
            field2665.method3163(var1);
        }
    }

    @ObfuscatedName("fg.s(Law;ILaw;II)Lcu;")
    public class98 method2920(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field2660 != -1) {
            return class35.method514(this.field2660).method603(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2669;
        int[] var7 = this.field2657;
        if (arg0 != null && (arg0.field884 >= 0 || arg0.field881 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2657[var8];
            }
            if (arg0.field884 >= 0) {
                var5 += (long) (arg0.field884 - this.field2657[5] << 40);
                var7[5] = arg0.field884;
            }
            if (arg0.field881 >= 0) {
                var5 += (long) (arg0.field881 - this.field2657[3] << 48);
                var7[3] = arg0.field881;
            }
        }
        class98 var9 = (class98) field2665.method3162(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class40.method19(var12 - 256).method739()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class45.method158(var12 - 512).method836(this.field2659)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2662 != -1L) {
                    var9 = (class98) field2665.method3162(this.field2662);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class93[] var13 = new class93[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class93 var17 = class40.method19(var16 - 256).method740();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class93 var18 = class45.method158(var16 - 512).method861(this.field2659);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class93 var19 = new class93(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2666[var20] < Statics.field2128[var20].length) {
                        var19.method1888(Statics.field2663[var20], Statics.field2128[var20][this.field2666[var20]]);
                    }
                    if (this.field2666[var20] < Statics.field2656[var20].length) {
                        var19.method1888(Statics.field1251[var20], Statics.field2656[var20][this.field2666[var20]]);
                    }
                }
                var9 = var19.method1897(64, 850, -30, -50, -30);
                field2665.method3171(var9, var5);
                this.field2662 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class98 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method690(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method718(var9, arg3);
        } else {
            var21 = arg0.method718(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fg.q(B)Lcy;")
    public class93 method2921() {
        if (this.field2660 != -1) {
            return class35.method514(this.field2660).method607();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2657[var2];
            if (var3 >= 256 && var3 < 512 && !class40.method19(var3 - 256).method756()) {
                var1 = true;
            }
            if (var3 >= 512 && !class45.method158(var3 - 512).method838(this.field2659)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class93[] var4 = new class93[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2657[var6];
            if (var7 >= 256 && var7 < 512) {
                class93 var8 = class40.method19(var7 - 256).method748();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class93 var9 = class45.method158(var7 - 512).method854(this.field2659);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class93 var10 = new class93(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2666[var11] < Statics.field2128[var11].length) {
                var10.method1888(Statics.field2663[var11], Statics.field2128[var11][this.field2666[var11]]);
            }
            if (this.field2666[var11] < Statics.field2656[var11].length) {
                var10.method1888(Statics.field1251[var11], Statics.field2656[var11][this.field2666[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fg.p(I)I")
    public int method2936() {
        return this.field2660 == -1 ? (this.field2657[11] << 5) + (this.field2657[8] << 10) + (this.field2657[0] << 15) + (this.field2666[0] << 25) + (this.field2666[4] << 20) + this.field2657[1] : 305419896 + class35.method514(this.field2660).field771;
    }

    @ObfuscatedName("dz.h(S)V")
    public static void method2536() {
        field2665.method3164();
    }
}
