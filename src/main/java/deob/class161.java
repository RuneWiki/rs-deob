package deob;

@ObfuscatedName("fi")
public class class161 {

    @ObfuscatedName("fi.j")
    public int[] field2666;

    @ObfuscatedName("fi.y")
    public int[] field2670;

    @ObfuscatedName("fi.x")
    public boolean field2664;

    @ObfuscatedName("fi.z")
    public int field2662;

    @ObfuscatedName("fi.c")
    public long field2663;

    @ObfuscatedName("fi.e")
    public long field2668;

    @ObfuscatedName("fi.w")
    public static final int[] field2667 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fi.k")
    public static class168 field2671 = new class168(260);

    @ObfuscatedName("fi.j([I[IZII)V")
    public void method3126(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field905; var6++) {
                    class35 var7 = class35.method2078(var6);
                    if (var7 != null && !var7.field914 && (arg2 ? 7 : 0) + var5 == var7.field907) {
                        arg0[field2667[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2666 = arg0;
        this.field2670 = arg1;
        this.field2664 = arg2;
        this.field2662 = arg3;
        this.method3112();
    }

    @ObfuscatedName("fi.y(IZI)V")
    public void method3108(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2664) {
            return;
        }
        int var3 = this.field2666[field2667[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class35 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field905) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field905 - 1;
                }
            }
            var4 = class35.method2078(var3);
        } while (var4 == null || var4.field914 || var4.field907 != (this.field2664 ? 7 : 0) + arg0);
        this.field2666[field2667[arg0]] = var3 + 256;
        this.method3112();
    }

    @ObfuscatedName("fi.x(IZI)V")
    public void method3113(int arg0, boolean arg1) {
        int var3 = this.field2670[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2665[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2665[arg0].length - 1;
            }
        }
        this.field2670[arg0] = var3;
        this.method3112();
    }

    @ObfuscatedName("fi.z(ZI)V")
    public void method3110(boolean arg0) {
        if (this.field2664 != arg0) {
            this.method3126((int[]) null, this.field2670, arg0, -1);
        }
    }

    @ObfuscatedName("fi.c(Ldr;B)V")
    public void method3111(class126 arg0) {
        arg0.method2369(this.field2664 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2666[field2667[var2]];
            if (var3 == 0) {
                arg0.method2369(-1);
            } else {
                arg0.method2369(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2369(this.field2670[var4]);
        }
    }

    @ObfuscatedName("fi.e(I)V")
    public void method3112() {
        long var1 = this.field2663;
        int var3 = this.field2666[5];
        int var4 = this.field2666[9];
        this.field2666[5] = var4;
        this.field2666[9] = var3;
        this.field2663 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2663 <<= 0x4;
            if (this.field2666[var5] >= 256) {
                this.field2663 += (long) (this.field2666[var5] - 256);
            }
        }
        if (this.field2666[0] >= 256) {
            this.field2663 += (long) (this.field2666[0] - 256 >> 4);
        }
        if (this.field2666[1] >= 256) {
            this.field2663 += (long) (this.field2666[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2663 <<= 0x3;
            this.field2663 += (long) this.field2670[var6];
        }
        this.field2663 <<= 0x1;
        this.field2663 += (long) (this.field2664 ? 1 : 0);
        this.field2666[5] = var3;
        this.field2666[9] = var4;
        if (var1 != 0L && this.field2663 != var1) {
            field2671.method3183(var1);
        }
    }

    @ObfuscatedName("fi.s(Lam;ILam;II)Ldh;")
    public class111 method3114(class33 arg0, int arg1, class33 arg2, int arg3) {
        if (this.field2662 != -1) {
            return class30.method117(this.field2662).method598(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2663;
        int[] var7 = this.field2666;
        if (arg0 != null && (arg0.field876 >= 0 || arg0.field867 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2666[var8];
            }
            if (arg0.field876 >= 0) {
                var5 += (long) (arg0.field876 - this.field2666[5] << 40);
                var7[5] = arg0.field876;
            }
            if (arg0.field867 >= 0) {
                var5 += (long) (arg0.field867 - this.field2666[3] << 48);
                var7[3] = arg0.field867;
            }
        }
        class111 var9 = (class111) field2671.method3191(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class35.method2078(var12 - 256).method736()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class39.method1818(var12 - 512).method823(this.field2664)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2668 != -1L) {
                    var9 = (class111) field2671.method3191(this.field2668);
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
                        class100 var17 = class35.method2078(var16 - 256).method737();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class39.method1818(var16 - 512).method824(this.field2664);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2670[var20] < Statics.field2665[var20].length) {
                        var19.method2013(Statics.field1294[var20], Statics.field2665[var20][this.field2670[var20]]);
                    }
                    if (this.field2670[var20] < Statics.field2669[var20].length) {
                        var19.method2013(Statics.field1240[var20], Statics.field2669[var20][this.field2670[var20]]);
                    }
                }
                var9 = var19.method2057(64, 850, -30, -50, -30);
                field2671.method3181(var9, var5);
                this.field2668 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class111 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method707(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method686(var9, arg3);
        } else {
            var21 = arg0.method686(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fi.i(I)Lck;")
    public class100 method3107() {
        if (this.field2662 != -1) {
            return class30.method117(this.field2662).method600();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2666[var2];
            if (var3 >= 256 && var3 < 512 && !class35.method2078(var3 - 256).method738()) {
                var1 = true;
            }
            if (var3 >= 512 && !class39.method1818(var3 - 512).method815(this.field2664)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2666[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class35.method2078(var7 - 256).method739();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class39.method1818(var7 - 512).method826(this.field2664);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2670[var11] < Statics.field2665[var11].length) {
                var10.method2013(Statics.field1294[var11], Statics.field2665[var11][this.field2670[var11]]);
            }
            if (this.field2670[var11] < Statics.field2669[var11].length) {
                var10.method2013(Statics.field1240[var11], Statics.field2669[var11][this.field2670[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fi.g(I)I")
    public int method3115() {
        return this.field2662 == -1 ? (this.field2666[11] << 5) + (this.field2666[8] << 10) + (this.field2666[0] << 15) + (this.field2670[0] << 25) + (this.field2670[4] << 20) + this.field2666[1] : 305419896 + class30.method117(this.field2662).field783;
    }
}
