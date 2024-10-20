package deob;

@ObfuscatedName("fl")
public class class161 {

    @ObfuscatedName("fl.z")
    public int[] field2666;

    @ObfuscatedName("fl.h")
    public int[] field2655;

    @ObfuscatedName("fl.c")
    public boolean field2656;

    @ObfuscatedName("fl.p")
    public int field2654;

    @ObfuscatedName("fl.i")
    public long field2658;

    @ObfuscatedName("fl.v")
    public long field2659;

    @ObfuscatedName("fl.o")
    public static final int[] field2663 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fl.b")
    public static class168 field2661 = new class168(260);

    @ObfuscatedName("fl.z([I[IZII)V")
    public void method3159(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field917; var6++) {
                    class35 var7 = class35.method561(var6);
                    if (var7 != null && !var7.field926 && var7.field919 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2663[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2666 = arg0;
        this.field2655 = arg1;
        this.field2656 = arg2;
        this.field2654 = arg3;
        this.method3158();
    }

    @ObfuscatedName("fl.h(IZI)V")
    public void method3167(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2656) {
            return;
        }
        int var3 = this.field2666[field2663[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class35 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field917) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field917 - 1;
                }
            }
            var4 = class35.method561(var3);
        } while (var4 == null || var4.field926 || var4.field919 != arg0 + (this.field2656 ? 7 : 0));
        this.field2666[field2663[arg0]] = var3 + 256;
        this.method3158();
    }

    @ObfuscatedName("fl.c(IZB)V")
    public void method3175(int arg0, boolean arg1) {
        int var3 = this.field2655[arg0];
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
        this.field2655[arg0] = var3;
        this.method3158();
    }

    @ObfuscatedName("fl.p(ZI)V")
    public void method3160(boolean arg0) {
        if (this.field2656 != arg0) {
            this.method3159((int[]) null, this.field2655, arg0, -1);
        }
    }

    @ObfuscatedName("fl.i(Ldq;I)V")
    public void method3163(class126 arg0) {
        arg0.method2462(this.field2656 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2666[field2663[var2]];
            if (var3 == 0) {
                arg0.method2462(-1);
            } else {
                arg0.method2462(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2462(this.field2655[var4]);
        }
    }

    @ObfuscatedName("fl.v(I)V")
    public void method3158() {
        long var1 = this.field2658;
        int var3 = this.field2666[5];
        int var4 = this.field2666[9];
        this.field2666[5] = var4;
        this.field2666[9] = var3;
        this.field2658 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2658 <<= 0x4;
            if (this.field2666[var5] >= 256) {
                this.field2658 += (long) (this.field2666[var5] - 256);
            }
        }
        if (this.field2666[0] >= 256) {
            this.field2658 += (long) (this.field2666[0] - 256 >> 4);
        }
        if (this.field2666[1] >= 256) {
            this.field2658 += (long) (this.field2666[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2658 <<= 0x3;
            this.field2658 += (long) this.field2655[var6];
        }
        this.field2658 <<= 0x1;
        this.field2658 += (long) (this.field2656 ? 1 : 0);
        this.field2666[5] = var3;
        this.field2666[9] = var4;
        if (var1 != 0L && this.field2658 != var1) {
            field2661.method3238(var1);
        }
    }

    @ObfuscatedName("fl.l(Las;ILas;II)Ldh;")
    public class111 method3165(class33 arg0, int arg1, class33 arg2, int arg3) {
        if (this.field2654 != -1) {
            return class30.method154(this.field2654).method629(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2658;
        int[] var7 = this.field2666;
        if (arg0 != null && (arg0.field879 >= 0 || arg0.field893 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2666[var8];
            }
            if (arg0.field879 >= 0) {
                var5 += (long) (arg0.field879 - this.field2666[5] << 40);
                var7[5] = arg0.field879;
            }
            if (arg0.field893 >= 0) {
                var5 += (long) (arg0.field893 - this.field2666[3] << 48);
                var7[3] = arg0.field893;
            }
        }
        class111 var9 = (class111) field2661.method3240(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class35.method561(var12 - 256).method764()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class39.method2704(var12 - 512).method832(this.field2656)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2659 != -1L) {
                    var9 = (class111) field2661.method3240(this.field2659);
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
                        class100 var17 = class35.method561(var16 - 256).method765();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class39.method2704(var16 - 512).method833(this.field2656);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2655[var20] < Statics.field2665[var20].length) {
                        var19.method2059(Statics.field2660[var20], Statics.field2665[var20][this.field2655[var20]]);
                    }
                    if (this.field2655[var20] < Statics.field1512[var20].length) {
                        var19.method2059(Statics.field2662[var20], Statics.field1512[var20][this.field2655[var20]]);
                    }
                }
                var9 = var19.method2046(64, 850, -30, -50, -30);
                field2661.method3237(var9, var5);
                this.field2659 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class111 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method738(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method710(var9, arg3);
        } else {
            var21 = arg0.method710(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fl.m(I)Lcj;")
    public class100 method3166() {
        if (this.field2654 != -1) {
            return class30.method154(this.field2654).method630();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2666[var2];
            if (var3 >= 256 && var3 < 512 && !class35.method561(var3 - 256).method781()) {
                var1 = true;
            }
            if (var3 >= 512 && !class39.method2704(var3 - 512).method834(this.field2656)) {
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
                class100 var8 = class35.method561(var7 - 256).method766();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class39.method2704(var7 - 512).method835(this.field2656);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2655[var11] < Statics.field2665[var11].length) {
                var10.method2059(Statics.field2660[var11], Statics.field2665[var11][this.field2655[var11]]);
            }
            if (this.field2655[var11] < Statics.field1512[var11].length) {
                var10.method2059(Statics.field2662[var11], Statics.field1512[var11][this.field2655[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fl.g(I)I")
    public int method3178() {
        return this.field2654 == -1 ? (this.field2666[11] << 5) + (this.field2666[8] << 10) + (this.field2666[0] << 15) + (this.field2655[0] << 25) + (this.field2655[4] << 20) + this.field2666[1] : 305419896 + class30.method154(this.field2654).field812;
    }
}
