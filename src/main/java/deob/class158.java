package deob;

@ObfuscatedName("fk")
public class class158 {

    @ObfuscatedName("fk.p")
    public int[] field2679;

    @ObfuscatedName("fk.g")
    public int[] field2677;

    @ObfuscatedName("fk.x")
    public boolean field2681;

    @ObfuscatedName("fk.c")
    public int field2689;

    @ObfuscatedName("fk.n")
    public long field2676;

    @ObfuscatedName("fk.s")
    public long field2678;

    @ObfuscatedName("fk.h")
    public static final int[] field2683 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fk.a")
    public static class172 field2684 = new class172(260);

    @ObfuscatedName("fk.p([I[IZIS)V")
    public void method2969(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field941; var6++) {
                    class40 var7 = class40.method2099(var6);
                    if (var7 != null && !var7.field944 && var7.field945 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2683[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2679 = arg0;
        this.field2677 = arg1;
        this.field2681 = arg2;
        this.field2689 = arg3;
        this.method2974();
    }

    @ObfuscatedName("fk.g(IZB)V")
    public void method2985(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2681) {
            return;
        }
        int var3 = this.field2679[field2683[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class40 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field941) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field941 - 1;
                }
            }
            var4 = class40.method2099(var3);
        } while (var4 == null || var4.field944 || arg0 + (this.field2681 ? 7 : 0) != var4.field945);
        this.field2679[field2683[arg0]] = var3 + 256;
        this.method2974();
    }

    @ObfuscatedName("fk.x(IZI)V")
    public void method2982(int arg0, boolean arg1) {
        int var3 = this.field2677[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1463[arg0].length) {
                    var3 = 0;
                }
            } while (!class154.method90(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1463[arg0].length - 1;
                }
            } while (!class154.method90(arg0, var3));
        }
        this.field2677[arg0] = var3;
        this.method2974();
    }

    @ObfuscatedName("fk.c(ZI)V")
    public void method2972(boolean arg0) {
        if (this.field2681 != arg0) {
            this.method2969((int[]) null, this.field2677, arg0, -1);
        }
    }

    @ObfuscatedName("fk.n(Ldp;B)V")
    public void method2973(class107 arg0) {
        arg0.method2159(this.field2681 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2679[field2683[var2]];
            if (var3 == 0) {
                arg0.method2159(-1);
            } else {
                arg0.method2159(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2159(this.field2677[var4]);
        }
    }

    @ObfuscatedName("fk.s(I)V")
    public void method2974() {
        long var1 = this.field2676;
        int var3 = this.field2679[5];
        int var4 = this.field2679[9];
        this.field2679[5] = var4;
        this.field2679[9] = var3;
        this.field2676 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2676 <<= 0x4;
            if (this.field2679[var5] >= 256) {
                this.field2676 += (long) (this.field2679[var5] - 256);
            }
        }
        if (this.field2679[0] >= 256) {
            this.field2676 += (long) (this.field2679[0] - 256 >> 4);
        }
        if (this.field2679[1] >= 256) {
            this.field2676 += (long) (this.field2679[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2676 <<= 0x3;
            this.field2676 += (long) this.field2677[var6];
        }
        this.field2676 <<= 0x1;
        this.field2676 += (long) (this.field2681 ? 1 : 0);
        this.field2679[5] = var3;
        this.field2679[9] = var4;
        if (var1 != 0L && this.field2676 != var1) {
            field2684.method3231(var1);
        }
    }

    @ObfuscatedName("fk.r(Lae;ILae;IB)Lcn;")
    public class98 method2975(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field2689 != -1) {
            return class35.method586(this.field2689).method631(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2676;
        int[] var7 = this.field2679;
        if (arg0 != null && (arg0.field913 >= 0 || arg0.field903 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2679[var8];
            }
            if (arg0.field913 >= 0) {
                var5 += (long) (arg0.field913 - this.field2679[5] << 40);
                var7[5] = arg0.field913;
            }
            if (arg0.field903 >= 0) {
                var5 += (long) (arg0.field903 - this.field2679[3] << 48);
                var7[3] = arg0.field903;
            }
        }
        class98 var9 = (class98) field2684.method3225(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class40.method2099(var12 - 256).method794()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class45.method588(var12 - 512).method886(this.field2681)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2678 != -1L) {
                    var9 = (class98) field2684.method3225(this.field2678);
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
                        class93 var17 = class40.method2099(var16 - 256).method795();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class93 var18 = class45.method588(var16 - 512).method918(this.field2681);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class93 var19 = new class93(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2677[var20] < Statics.field1463[var20].length) {
                        var19.method1955(Statics.field621[var20], Statics.field1463[var20][this.field2677[var20]]);
                    }
                    if (this.field2677[var20] < Statics.field686[var20].length) {
                        var19.method1955(Statics.field2682[var20], Statics.field686[var20][this.field2677[var20]]);
                    }
                }
                var9 = var19.method1952(64, 850, -30, -50, -30);
                field2684.method3234(var9, var5);
                this.field2678 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class98 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method742(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method741(var9, arg3);
        } else {
            var21 = arg0.method741(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fk.w(B)Lcq;")
    public class93 method2971() {
        if (this.field2689 != -1) {
            return class35.method586(this.field2689).method655();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2679[var2];
            if (var3 >= 256 && var3 < 512 && !class40.method2099(var3 - 256).method796()) {
                var1 = true;
            }
            if (var3 >= 512 && !class45.method588(var3 - 512).method888(this.field2681)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class93[] var4 = new class93[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2679[var6];
            if (var7 >= 256 && var7 < 512) {
                class93 var8 = class40.method2099(var7 - 256).method815();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class93 var9 = class45.method588(var7 - 512).method889(this.field2681);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class93 var10 = new class93(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2677[var11] < Statics.field1463[var11].length) {
                var10.method1955(Statics.field621[var11], Statics.field1463[var11][this.field2677[var11]]);
            }
            if (this.field2677[var11] < Statics.field686[var11].length) {
                var10.method1955(Statics.field2682[var11], Statics.field686[var11][this.field2677[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fk.u(I)I")
    public int method2977() {
        return this.field2689 == -1 ? (this.field2679[11] << 5) + (this.field2679[8] << 10) + (this.field2679[0] << 15) + (this.field2677[4] << 20) + (this.field2677[0] << 25) + this.field2679[1] : 305419896 + class35.method586(this.field2689).field809;
    }

    @ObfuscatedName("bv.d(B)V")
    public static void method1460() {
        field2684.method3227();
    }
}
