package deob;

@ObfuscatedName("fs")
public class class163 {

    @ObfuscatedName("fs.i")
    public int[] field2735;

    @ObfuscatedName("fs.p")
    public int[] field2734;

    @ObfuscatedName("fs.a")
    public boolean field2743;

    @ObfuscatedName("fs.l")
    public int field2736;

    @ObfuscatedName("fs.q")
    public long field2737;

    @ObfuscatedName("fs.b")
    public long field2738;

    @ObfuscatedName("fs.j")
    public static final int[] field2739 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fs.f")
    public static class170 field2742 = new class170(260);

    @ObfuscatedName("fs.i([I[IZII)V")
    public void method3137(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field930; var6++) {
                    class36 var7 = class36.method156(var6);
                    if (var7 != null && !var7.field939 && var7.field941 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2739[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2735 = arg0;
        this.field2734 = arg1;
        this.field2743 = arg2;
        this.field2736 = arg3;
        this.method3159();
    }

    @ObfuscatedName("fs.p(IZI)V")
    public void method3138(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2743) {
            return;
        }
        int var3 = this.field2735[field2739[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class36 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field930) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field930 - 1;
                }
            }
            var4 = class36.method156(var3);
        } while (var4 == null || var4.field939 || (this.field2743 ? 7 : 0) + arg0 != var4.field941);
        this.field2735[field2739[arg0]] = var3 + 256;
        this.method3159();
    }

    @ObfuscatedName("fs.a(IZB)V")
    public void method3139(int arg0, boolean arg1) {
        int var3 = this.field2734[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field1997[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field1997[arg0].length - 1;
            }
        }
        this.field2734[arg0] = var3;
        this.method3159();
    }

    @ObfuscatedName("fs.l(ZI)V")
    public void method3140(boolean arg0) {
        if (this.field2743 != arg0) {
            this.method3137((int[]) null, this.field2734, arg0, -1);
        }
    }

    @ObfuscatedName("fs.q(Ldn;I)V")
    public void method3141(class127 arg0) {
        arg0.method2397(this.field2743 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2735[field2739[var2]];
            if (var3 == 0) {
                arg0.method2397(-1);
            } else {
                arg0.method2397(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2397(this.field2734[var4]);
        }
    }

    @ObfuscatedName("fs.b(I)V")
    public void method3159() {
        long var1 = this.field2737;
        int var3 = this.field2735[5];
        int var4 = this.field2735[9];
        this.field2735[5] = var4;
        this.field2735[9] = var3;
        this.field2737 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2737 <<= 0x4;
            if (this.field2735[var5] >= 256) {
                this.field2737 += (long) (this.field2735[var5] - 256);
            }
        }
        if (this.field2735[0] >= 256) {
            this.field2737 += (long) (this.field2735[0] - 256 >> 4);
        }
        if (this.field2735[1] >= 256) {
            this.field2737 += (long) (this.field2735[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2737 <<= 0x3;
            this.field2737 += (long) this.field2734[var6];
        }
        this.field2737 <<= 0x1;
        this.field2737 += (long) (this.field2743 ? 1 : 0);
        this.field2735[5] = var3;
        this.field2735[9] = var4;
        if (var1 != 0L && this.field2737 != var1) {
            field2742.method3224(var1);
        }
    }

    @ObfuscatedName("fs.u(Lag;ILag;IS)Ldc;")
    public class112 method3161(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field2736 != -1) {
            return class31.method246(this.field2736).method600(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2737;
        int[] var7 = this.field2735;
        if (arg0 != null && (arg0.field885 >= 0 || arg0.field899 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2735[var8];
            }
            if (arg0.field885 >= 0) {
                var5 += (long) (arg0.field885 - this.field2735[5] << 40);
                var7[5] = arg0.field885;
            }
            if (arg0.field899 >= 0) {
                var5 += (long) (arg0.field899 - this.field2735[3] << 48);
                var7[3] = arg0.field899;
            }
        }
        class112 var9 = (class112) field2742.method3223(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class36.method156(var12 - 256).method748()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class40.method44(var12 - 512).method819(this.field2743)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2738 != -1L) {
                    var9 = (class112) field2742.method3223(this.field2738);
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
                        class101 var17 = class36.method156(var16 - 256).method749();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class40.method44(var16 - 512).method856(this.field2743);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2734[var20] < Statics.field1997[var20].length) {
                        var19.method1999(Statics.field1311[var20], Statics.field1997[var20][this.field2734[var20]]);
                    }
                    if (this.field2734[var20] < Statics.field28[var20].length) {
                        var19.method1999(Statics.field1794[var20], Statics.field28[var20][this.field2734[var20]]);
                    }
                }
                var9 = var19.method2006(64, 850, -30, -50, -30);
                field2742.method3225(var9, var5);
                this.field2738 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class112 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method695(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method692(var9, arg3);
        } else {
            var21 = arg0.method692(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fs.d(I)Lcm;")
    public class101 method3143() {
        if (this.field2736 != -1) {
            return class31.method246(this.field2736).method604();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2735[var2];
            if (var3 >= 256 && var3 < 512 && !class36.method156(var3 - 256).method745()) {
                var1 = true;
            }
            if (var3 >= 512 && !class40.method44(var3 - 512).method821(this.field2743)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2735[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class36.method156(var7 - 256).method751();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class40.method44(var7 - 512).method822(this.field2743);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2734[var11] < Statics.field1997[var11].length) {
                var10.method1999(Statics.field1311[var11], Statics.field1997[var11][this.field2734[var11]]);
            }
            if (this.field2734[var11] < Statics.field28[var11].length) {
                var10.method1999(Statics.field1794[var11], Statics.field28[var11][this.field2734[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fs.m(B)I")
    public int method3144() {
        return this.field2736 == -1 ? (this.field2735[11] << 5) + (this.field2735[8] << 10) + (this.field2735[0] << 15) + (this.field2734[0] << 25) + (this.field2734[4] << 20) + this.field2735[1] : 305419896 + class31.method246(this.field2736).field786;
    }

    @ObfuscatedName("df.v(I)V")
    public static void method2642() {
        field2742.method3226();
    }
}
