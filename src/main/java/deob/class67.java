package deob;

@ObfuscatedName("fa")
public class class67 {

    @ObfuscatedName("fa.b")
    public boolean field977;

    @ObfuscatedName("fa.c")
    public int[] field980;

    @ObfuscatedName("fa.a")
    public static class75 field984 = new class75(260);

    @ObfuscatedName("fa.m")
    public long field979;

    @ObfuscatedName("fa.i")
    public int field982;

    @ObfuscatedName("fa.v")
    public int[] field976;

    @ObfuscatedName("fa.z")
    public long field978;

    @ObfuscatedName("fa.y")
    public static final int[] field983 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fa.v([I[IZII)V")
    public void method1037(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field2863; var6++) {
                    class185 var7 = class185.method1470(var6);
                    if (var7 != null && !var7.field2852 && var5 + (arg2 ? 7 : 0) == var7.field2854) {
                        arg0[field983[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field976 = arg0;
        this.field980 = arg1;
        this.field977 = arg2;
        this.field982 = arg3;
        this.method1042();
    }

    @ObfuscatedName("fa.c(IZI)V")
    public void method1038(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field977) {
            return;
        }
        int var3 = this.field976[field983[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class185 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field2863) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2863 - 1;
                }
            }
            var4 = class185.method1470(var3);
        } while (var4 == null || var4.field2852 || arg0 + (this.field977 ? 7 : 0) != var4.field2854);
        this.field976[field983[arg0]] = var3 + 256;
        this.method1042();
    }

    @ObfuscatedName("fa.b(IZB)V")
    public void method1039(int arg0, boolean arg1) {
        int var3 = this.field980[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field987[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field987[arg0].length - 1;
            }
        }
        this.field980[arg0] = var3;
        this.method1042();
    }

    @ObfuscatedName("fa.z(I)V")
    public void method1042() {
        long var1 = this.field979;
        int var3 = this.field976[5];
        int var4 = this.field976[9];
        this.field976[5] = var4;
        this.field976[9] = var3;
        this.field979 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field979 <<= 0x4;
            if (this.field976[var5] >= 256) {
                this.field979 += (long) (this.field976[var5] - 256);
            }
        }
        if (this.field976[0] >= 256) {
            this.field979 += (long) (this.field976[0] - 256 >> 4);
        }
        if (this.field976[1] >= 256) {
            this.field979 += (long) (this.field976[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field979 <<= 0x3;
            this.field979 += (long) this.field980[var6];
        }
        this.field979 <<= 0x1;
        this.field979 += (long) (this.field977 ? 1 : 0);
        this.field976[5] = var3;
        this.field976[9] = var4;
        if (var1 != 0L && this.field979 != var1) {
            field984.method1187(var1);
        }
    }

    @ObfuscatedName("fa.j(I)I")
    public int method1045() {
        return this.field982 == -1 ? (this.field976[11] << 5) + (this.field976[8] << 10) + (this.field976[0] << 15) + (this.field980[4] << 20) + (this.field980[0] << 25) + this.field976[1] : 305419896 + class184.method3428(this.field982).field2821;
    }

    @ObfuscatedName("fa.i(ZI)V")
    public void method1051(boolean arg0) {
        if (this.field977 != arg0) {
            this.method1037((int[]) null, this.field980, arg0, -1);
        }
    }

    @ObfuscatedName("fa.m(Ldv;I)V")
    public void method1063(class28 arg0) {
        arg0.method443(this.field977 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field976[field983[var2]];
            if (var3 == 0) {
                arg0.method443(-1);
            } else {
                arg0.method443(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method443(this.field980[var4]);
        }
    }

    @ObfuscatedName("fa.x(Lar;ILar;IB)Ldk;")
    public class43 method1067(class165 arg0, int arg1, class165 arg2, int arg3) {
        if (this.field982 != -1) {
            return class184.method3428(this.field982).method3437(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field979;
        int[] var7 = this.field976;
        if (arg0 != null && (arg0.field2520 >= 0 || arg0.field2531 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field976[var8];
            }
            if (arg0.field2520 >= 0) {
                var5 += (long) (arg0.field2520 - this.field976[5] << 40);
                var7[5] = arg0.field2520;
            }
            if (arg0.field2531 >= 0) {
                var5 += (long) (arg0.field2531 - this.field976[3] << 48);
                var7[3] = arg0.field2531;
            }
        }
        class43 var9 = (class43) field984.method1196(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class185.method1470(var12 - 256).method3470()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class172.method934(var12 - 512).method3091(this.field977)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field978 != -1L) {
                    var9 = (class43) field984.method1196(this.field978);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class151[] var13 = new class151[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class151 var17 = class185.method1470(var16 - 256).method3471();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class151 var18 = class172.method934(var16 - 512).method3092(this.field977);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class151 var19 = new class151(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field980[var20] < Statics.field987[var20].length) {
                        var19.method2668(Statics.field981[var20], Statics.field987[var20][this.field980[var20]]);
                    }
                    if (this.field980[var20] < Statics.field1926[var20].length) {
                        var19.method2668(Statics.field557[var20], Statics.field1926[var20][this.field980[var20]]);
                    }
                }
                var9 = var19.method2675(64, 850, -30, -50, -30);
                field984.method1184(var9, var5);
                this.field978 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class43 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method3010(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method2980(var9, arg3);
        } else {
            var21 = arg0.method2980(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fa.d(B)Lcl;")
    public class151 method1068() {
        if (this.field982 != -1) {
            return class184.method3428(this.field982).method3438();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field976[var2];
            if (var3 >= 256 && var3 < 512 && !class185.method1470(var3 - 256).method3472()) {
                var1 = true;
            }
            if (var3 >= 512 && !class172.method934(var3 - 512).method3130(this.field977)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class151[] var4 = new class151[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field976[var6];
            if (var7 >= 256 && var7 < 512) {
                class151 var8 = class185.method1470(var7 - 256).method3473();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class151 var9 = class172.method934(var7 - 512).method3094(this.field977);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class151 var10 = new class151(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field980[var11] < Statics.field987[var11].length) {
                var10.method2668(Statics.field981[var11], Statics.field987[var11][this.field980[var11]]);
            }
            if (this.field980[var11] < Statics.field1926[var11].length) {
                var10.method2668(Statics.field557[var11], Statics.field1926[var11][this.field980[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ca.g(B)V")
    public static void method1587() {
        field984.method1188();
    }
}
