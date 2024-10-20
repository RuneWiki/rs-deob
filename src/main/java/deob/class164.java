package deob;

@ObfuscatedName("fq")
public class class164 {

    @ObfuscatedName("fq.b")
    public int[] field2749;

    @ObfuscatedName("fq.e")
    public int[] field2743;

    @ObfuscatedName("fq.g")
    public boolean field2744;

    @ObfuscatedName("fq.o")
    public int field2742;

    @ObfuscatedName("fq.a")
    public long field2746;

    @ObfuscatedName("fq.h")
    public long field2745;

    @ObfuscatedName("fq.d")
    public static final int[] field2751 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fq.z")
    public static class170 field2752 = new class170(260);

    @ObfuscatedName("fq.b([I[IZII)V")
    public void method3230(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field905; var6++) {
                    class36 var7 = class36.method1351(var6);
                    if (var7 != null && !var7.field914 && var7.field907 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2751[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2749 = arg0;
        this.field2743 = arg1;
        this.field2744 = arg2;
        this.field2742 = arg3;
        this.method3224();
    }

    @ObfuscatedName("fq.e(IZS)V")
    public void method3210(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2744) {
            return;
        }
        int var3 = this.field2749[field2751[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class36 var4;
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
            var4 = class36.method1351(var3);
        } while (var4 == null || var4.field914 || var4.field907 != arg0 + (this.field2744 ? 7 : 0));
        this.field2749[field2751[arg0]] = var3 + 256;
        this.method3224();
    }

    @ObfuscatedName("fq.g(IZI)V")
    public void method3225(int arg0, boolean arg1) {
        int var3 = this.field2743[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2747[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2747[arg0].length - 1;
            }
        }
        this.field2743[arg0] = var3;
        this.method3224();
    }

    @ObfuscatedName("fq.o(ZB)V")
    public void method3211(boolean arg0) {
        if (this.field2744 != arg0) {
            this.method3230((int[]) null, this.field2743, arg0, -1);
        }
    }

    @ObfuscatedName("fq.a(Ldv;I)V")
    public void method3219(class126 arg0) {
        arg0.method2422(this.field2744 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2749[field2751[var2]];
            if (var3 == 0) {
                arg0.method2422(-1);
            } else {
                arg0.method2422(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2422(this.field2743[var4]);
        }
    }

    @ObfuscatedName("fq.h(I)V")
    public void method3224() {
        long var1 = this.field2746;
        int var3 = this.field2749[5];
        int var4 = this.field2749[9];
        this.field2749[5] = var4;
        this.field2749[9] = var3;
        this.field2746 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2746 <<= 0x4;
            if (this.field2749[var5] >= 256) {
                this.field2746 += (long) (this.field2749[var5] - 256);
            }
        }
        if (this.field2749[0] >= 256) {
            this.field2746 += (long) (this.field2749[0] - 256 >> 4);
        }
        if (this.field2749[1] >= 256) {
            this.field2746 += (long) (this.field2749[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2746 <<= 0x3;
            this.field2746 += (long) this.field2743[var6];
        }
        this.field2746 <<= 0x1;
        this.field2746 += (long) (this.field2744 ? 1 : 0);
        this.field2749[5] = var3;
        this.field2749[9] = var4;
        if (var1 != 0L && this.field2746 != var1) {
            field2752.method3257(var1);
        }
    }

    @ObfuscatedName("fq.j(Lab;ILab;IB)Ldp;")
    public class112 method3213(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field2742 != -1) {
            return class31.method120(this.field2742).method597(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2746;
        int[] var7 = this.field2749;
        if (arg0 != null && (arg0.field875 >= 0 || arg0.field876 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2749[var8];
            }
            if (arg0.field875 >= 0) {
                var5 += (long) (arg0.field875 - this.field2749[5] << 40);
                var7[5] = arg0.field875;
            }
            if (arg0.field876 >= 0) {
                var5 += (long) (arg0.field876 - this.field2749[3] << 48);
                var7[3] = arg0.field876;
            }
        }
        class112 var9 = (class112) field2752.method3248(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class36.method1351(var12 - 256).method751()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class40.method672(var12 - 512).method821(this.field2744)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2745 != -1L) {
                    var9 = (class112) field2752.method3248(this.field2745);
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
                        class101 var17 = class36.method1351(var16 - 256).method766();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class40.method672(var16 - 512).method838(this.field2744);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2743[var20] < Statics.field2747[var20].length) {
                        var19.method2047(Statics.field2748[var20], Statics.field2747[var20][this.field2743[var20]]);
                    }
                    if (this.field2743[var20] < Statics.field2750[var20].length) {
                        var19.method2047(Statics.field1511[var20], Statics.field2750[var20][this.field2743[var20]]);
                    }
                }
                var9 = var19.method2056(64, 850, -30, -50, -30);
                field2752.method3252(var9, var5);
                this.field2745 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class112 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method697(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method726(var9, arg3);
        } else {
            var21 = arg0.method726(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fq.f(B)Lcu;")
    public class101 method3214() {
        if (this.field2742 != -1) {
            return class31.method120(this.field2742).method598();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2749[var2];
            if (var3 >= 256 && var3 < 512 && !class36.method1351(var3 - 256).method753()) {
                var1 = true;
            }
            if (var3 >= 512 && !class40.method672(var3 - 512).method822(this.field2744)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2749[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class36.method1351(var7 - 256).method754();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class40.method672(var7 - 512).method823(this.field2744);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2743[var11] < Statics.field2747[var11].length) {
                var10.method2047(Statics.field2748[var11], Statics.field2747[var11][this.field2743[var11]]);
            }
            if (this.field2743[var11] < Statics.field2750[var11].length) {
                var10.method2047(Statics.field1511[var11], Statics.field2750[var11][this.field2743[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fq.q(I)I")
    public int method3215() {
        return this.field2742 == -1 ? (this.field2749[11] << 5) + (this.field2749[8] << 10) + (this.field2749[0] << 15) + (this.field2743[0] << 25) + (this.field2743[4] << 20) + this.field2749[1] : 305419896 + class31.method120(this.field2742).field767;
    }
}
