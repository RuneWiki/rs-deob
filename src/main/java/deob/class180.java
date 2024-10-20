package deob;

@ObfuscatedName("fq")
public class class180 {

    @ObfuscatedName("fq.s")
    public int[] field2939;

    @ObfuscatedName("fq.j")
    public int[] field2940;

    @ObfuscatedName("fq.p")
    public boolean field2937;

    @ObfuscatedName("fq.x")
    public int field2935;

    @ObfuscatedName("fq.d")
    public long field2938;

    @ObfuscatedName("fq.u")
    public long field2942;

    @ObfuscatedName("fq.l")
    public static final int[] field2941 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fq.t")
    public static class194 field2936 = new class194(260);

    @ObfuscatedName("fq.s([I[IZII)V")
    public void method3228(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1038; var6++) {
                    class45 var7 = class45.method163(var6);
                    if (var7 != null && !var7.field1034 && var7.field1027 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2941[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2939 = arg0;
        this.field2940 = arg1;
        this.field2937 = arg2;
        this.field2935 = arg3;
        this.method3233();
    }

    @ObfuscatedName("fq.j(IZB)V")
    public void method3229(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2937) {
            return;
        }
        int var3 = this.field2939[field2941[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1038) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1038 - 1;
                }
            }
            var4 = class45.method163(var3);
        } while (var4 == null || var4.field1034 || (this.field2937 ? 7 : 0) + arg0 != var4.field1027);
        this.field2939[field2941[arg0]] = var3 + 256;
        this.method3233();
    }

    @ObfuscatedName("fq.p(IZI)V")
    public void method3237(int arg0, boolean arg1) {
        int var3 = this.field2940[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2674[arg0].length) {
                    var3 = 0;
                }
            } while (!class175.method2034(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2674[arg0].length - 1;
                }
            } while (!class175.method2034(arg0, var3));
        }
        this.field2940[arg0] = var3;
        this.method3233();
    }

    @ObfuscatedName("fq.x(ZI)V")
    public void method3231(boolean arg0) {
        if (this.field2937 != arg0) {
            this.method3228((int[]) null, this.field2940, arg0, -1);
        }
    }

    @ObfuscatedName("fq.d(Lds;I)V")
    public void method3250(class120 arg0) {
        arg0.method2323(this.field2937 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2939[field2941[var2]];
            if (var3 == 0) {
                arg0.method2323(-1);
            } else {
                arg0.method2323(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2323(this.field2940[var4]);
        }
    }

    @ObfuscatedName("fq.u(B)V")
    public void method3233() {
        long var1 = this.field2938;
        int var3 = this.field2939[5];
        int var4 = this.field2939[9];
        this.field2939[5] = var4;
        this.field2939[9] = var3;
        this.field2938 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2938 <<= 0x4;
            if (this.field2939[var5] >= 256) {
                this.field2938 += (long) (this.field2939[var5] - 256);
            }
        }
        if (this.field2939[0] >= 256) {
            this.field2938 += (long) (this.field2939[0] - 256 >> 4);
        }
        if (this.field2939[1] >= 256) {
            this.field2938 += (long) (this.field2939[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2938 <<= 0x3;
            this.field2938 += (long) this.field2940[var6];
        }
        this.field2938 <<= 0x1;
        this.field2938 += (long) (this.field2937 ? 1 : 0);
        this.field2939[5] = var3;
        this.field2939[9] = var4;
        if (var1 != 0L && this.field2938 != var1) {
            field2936.method3483(var1);
        }
    }

    @ObfuscatedName("fq.o(Lar;ILar;II)Ldh;")
    public class106 method3234(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2935 != -1) {
            return class40.method2038(this.field2935).method722(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2938;
        int[] var7 = this.field2939;
        if (arg0 != null && (arg0.field995 >= 0 || arg0.field996 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2939[var8];
            }
            if (arg0.field995 >= 0) {
                var5 += (long) (arg0.field995 - this.field2939[5] << 40);
                var7[5] = arg0.field995;
            }
            if (arg0.field996 >= 0) {
                var5 += (long) (arg0.field996 - this.field2939[3] << 48);
                var7[3] = arg0.field996;
            }
        }
        class106 var9 = (class106) field2936.method3484(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method163(var12 - 256).method901()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method126(var12 - 512).method982(this.field2937)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2942 != -1L) {
                    var9 = (class106) field2936.method3484(this.field2942);
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
                        class101 var17 = class45.method163(var16 - 256).method879();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class52.method126(var16 - 512).method983(this.field2937);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2940[var20] < Statics.field2674[var20].length) {
                        var19.method2053(Statics.field2926[var20], Statics.field2674[var20][this.field2940[var20]]);
                    }
                    if (this.field2940[var20] < Statics.field191[var20].length) {
                        var19.method2053(Statics.field2934[var20], Statics.field191[var20][this.field2940[var20]]);
                    }
                }
                var9 = var19.method2061(64, 850, -30, -50, -30);
                field2936.method3486(var9, var5);
                this.field2942 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class106 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method824(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method821(var9, arg3);
        } else {
            var21 = arg0.method821(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fq.b(B)Lcq;")
    public class101 method3257() {
        if (this.field2935 != -1) {
            return class40.method2038(this.field2935).method723();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2939[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method163(var3 - 256).method880()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method126(var3 - 512).method984(this.field2937)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2939[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class45.method163(var7 - 256).method899();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class52.method126(var7 - 512).method986(this.field2937);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2940[var11] < Statics.field2674[var11].length) {
                var10.method2053(Statics.field2926[var11], Statics.field2674[var11][this.field2940[var11]]);
            }
            if (this.field2940[var11] < Statics.field191[var11].length) {
                var10.method2053(Statics.field2934[var11], Statics.field191[var11][this.field2940[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fq.k(B)I")
    public int method3262() {
        return this.field2935 == -1 ? (this.field2939[11] << 5) + (this.field2939[8] << 10) + (this.field2939[0] << 15) + (this.field2940[4] << 20) + (this.field2940[0] << 25) + this.field2939[1] : 305419896 + class40.method2038(this.field2935).field887;
    }

    @ObfuscatedName("du.c(I)V")
    public static void method2271() {
        field2936.method3491();
    }
}
