package deob;

@ObfuscatedName("fh")
public class class165 {

    @ObfuscatedName("fh.l")
    public int[] field2757;

    @ObfuscatedName("fh.b")
    public int[] field2761;

    @ObfuscatedName("fh.o")
    public boolean field2759;

    @ObfuscatedName("fh.w")
    public int field2758;

    @ObfuscatedName("fh.r")
    public long field2765;

    @ObfuscatedName("fh.k")
    public long field2762;

    @ObfuscatedName("fh.c")
    public static final int[] field2760 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fh.m")
    public static class171 field2766 = new class171(260);

    @ObfuscatedName("fh.l([I[IZII)V")
    public void method3217(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1369; var6++) {
                    class36 var7 = class36.method2715(var6);
                    if (var7 != null && !var7.field921 && var7.field915 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2760[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2757 = arg0;
        this.field2761 = arg1;
        this.field2759 = arg2;
        this.field2758 = arg3;
        this.method3222();
    }

    @ObfuscatedName("fh.b(IZB)V")
    public void method3218(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2759) {
            return;
        }
        int var3 = this.field2757[field2760[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class36 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1369) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1369 - 1;
                }
            }
            var4 = class36.method2715(var3);
        } while (var4 == null || var4.field921 || arg0 + (this.field2759 ? 7 : 0) != var4.field915);
        this.field2757[field2760[arg0]] = var3 + 256;
        this.method3222();
    }

    @ObfuscatedName("fh.o(IZI)V")
    public void method3219(int arg0, boolean arg1) {
        int var3 = this.field2761[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2764[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2764[arg0].length - 1;
            }
        }
        this.field2761[arg0] = var3;
        this.method3222();
    }

    @ObfuscatedName("fh.w(ZI)V")
    public void method3220(boolean arg0) {
        if (this.field2759 != arg0) {
            this.method3217((int[]) null, this.field2761, arg0, -1);
        }
    }

    @ObfuscatedName("fh.r(Ldm;I)V")
    public void method3221(class127 arg0) {
        arg0.method2493(this.field2759 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2757[field2760[var2]];
            if (var3 == 0) {
                arg0.method2493(-1);
            } else {
                arg0.method2493(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2493(this.field2761[var4]);
        }
    }

    @ObfuscatedName("fh.k(I)V")
    public void method3222() {
        long var1 = this.field2765;
        int var3 = this.field2757[5];
        int var4 = this.field2757[9];
        this.field2757[5] = var4;
        this.field2757[9] = var3;
        this.field2765 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2765 <<= 0x4;
            if (this.field2757[var5] >= 256) {
                this.field2765 += (long) (this.field2757[var5] - 256);
            }
        }
        if (this.field2757[0] >= 256) {
            this.field2765 += (long) (this.field2757[0] - 256 >> 4);
        }
        if (this.field2757[1] >= 256) {
            this.field2765 += (long) (this.field2757[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2765 <<= 0x3;
            this.field2765 += (long) this.field2761[var6];
        }
        this.field2765 <<= 0x1;
        this.field2765 += (long) (this.field2759 ? 1 : 0);
        this.field2757[5] = var3;
        this.field2757[9] = var4;
        if (var1 != 0L && this.field2765 != var1) {
            field2766.method3252(var1);
        }
    }

    @ObfuscatedName("fh.z(Lav;ILav;IS)Ldt;")
    public class112 method3223(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field2758 != -1) {
            return class31.method3247(this.field2758).method609(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2765;
        int[] var7 = this.field2757;
        if (arg0 != null && (arg0.field880 >= 0 || arg0.field881 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2757[var8];
            }
            if (arg0.field880 >= 0) {
                var5 += (long) (arg0.field880 - this.field2757[5] << 40);
                var7[5] = arg0.field880;
            }
            if (arg0.field881 >= 0) {
                var5 += (long) (arg0.field881 - this.field2757[3] << 48);
                var7[3] = arg0.field881;
            }
        }
        class112 var9 = (class112) field2766.method3255(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class36.method2715(var12 - 256).method757()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class40.method1243(var12 - 512).method866(this.field2759)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2762 != -1L) {
                    var9 = (class112) field2766.method3255(this.field2762);
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
                        class101 var17 = class36.method2715(var16 - 256).method787();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class40.method1243(var16 - 512).method839(this.field2759);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2761[var20] < Statics.field2764[var20].length) {
                        var19.method2071(Statics.field2763[var20], Statics.field2764[var20][this.field2761[var20]]);
                    }
                    if (this.field2761[var20] < Statics.field1264[var20].length) {
                        var19.method2071(Statics.field197[var20], Statics.field1264[var20][this.field2761[var20]]);
                    }
                }
                var9 = var19.method2105(64, 850, -30, -50, -30);
                field2766.method3253(var9, var5);
                this.field2762 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class112 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method733(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method706(var9, arg3);
        } else {
            var21 = arg0.method706(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fh.g(I)Lcc;")
    public class101 method3236() {
        if (this.field2758 != -1) {
            return class31.method3247(this.field2758).method610();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2757[var2];
            if (var3 >= 256 && var3 < 512 && !class36.method2715(var3 - 256).method777()) {
                var1 = true;
            }
            if (var3 >= 512 && !class40.method1243(var3 - 512).method847(this.field2759)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2757[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class36.method2715(var7 - 256).method759();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class40.method1243(var7 - 512).method848(this.field2759);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2761[var11] < Statics.field2764[var11].length) {
                var10.method2071(Statics.field2763[var11], Statics.field2764[var11][this.field2761[var11]]);
            }
            if (this.field2761[var11] < Statics.field1264[var11].length) {
                var10.method2071(Statics.field197[var11], Statics.field1264[var11][this.field2761[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fh.n(I)I")
    public int method3225() {
        return this.field2758 == -1 ? (this.field2757[11] << 5) + (this.field2757[8] << 10) + (this.field2757[0] << 15) + (this.field2761[0] << 25) + (this.field2761[4] << 20) + this.field2757[1] : 305419896 + class31.method3247(this.field2758).field800;
    }

    @ObfuscatedName("ab.j(I)V")
    public static void method902() {
        field2766.method3254();
    }
}
