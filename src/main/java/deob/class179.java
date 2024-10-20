package deob;

@ObfuscatedName("fa")
public class class179 {

    @ObfuscatedName("fa.f")
    public int[] field2908;

    @ObfuscatedName("fa.s")
    public int[] field2909;

    @ObfuscatedName("fa.q")
    public boolean field2910;

    @ObfuscatedName("fa.g")
    public int field2911;

    @ObfuscatedName("fa.m")
    public long field2912;

    @ObfuscatedName("fa.t")
    public long field2914;

    @ObfuscatedName("fa.w")
    public static final int[] field2918 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fa.v")
    public static class193 field2916 = new class193(260);

    @ObfuscatedName("fa.f([I[IZIB)V")
    public void method3280(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1039; var6++) {
                    class45 var7 = class45.method715(var6);
                    if (var7 != null && !var7.field1042 && var5 + (arg2 ? 7 : 0) == var7.field1036) {
                        arg0[field2918[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2908 = arg0;
        this.field2909 = arg1;
        this.field2910 = arg2;
        this.field2911 = arg3;
        this.method3268();
    }

    @ObfuscatedName("fa.s(IZI)V")
    public void method3285(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2910) {
            return;
        }
        int var3 = this.field2908[field2918[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1039) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1039 - 1;
                }
            }
            var4 = class45.method715(var3);
        } while (var4 == null || var4.field1042 || var4.field1036 != arg0 + (this.field2910 ? 7 : 0));
        this.field2908[field2918[arg0]] = var3 + 256;
        this.method3268();
    }

    @ObfuscatedName("fa.q(IZI)V")
    public void method3277(int arg0, boolean arg1) {
        int var3 = this.field2909[arg0];
        boolean var4;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1970[arg0].length) {
                    var3 = 0;
                }
            } while (!class174.method1499(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1970[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2909[arg0] = var3;
        this.method3268();
    }

    @ObfuscatedName("fa.g(ZI)V")
    public void method3266(boolean arg0) {
        if (this.field2910 != arg0) {
            this.method3280((int[]) null, this.field2909, arg0, -1);
        }
    }

    @ObfuscatedName("fa.m(Ldn;I)V")
    public void method3267(class119 arg0) {
        arg0.method2426(this.field2910 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2908[field2918[var2]];
            if (var3 == 0) {
                arg0.method2426(-1);
            } else {
                arg0.method2426(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2426(this.field2909[var4]);
        }
    }

    @ObfuscatedName("fa.t(I)V")
    public void method3268() {
        long var1 = this.field2912;
        int var3 = this.field2908[5];
        int var4 = this.field2908[9];
        this.field2908[5] = var4;
        this.field2908[9] = var3;
        this.field2912 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2912 <<= 0x4;
            if (this.field2908[var5] >= 256) {
                this.field2912 += (long) (this.field2908[var5] - 256);
            }
        }
        if (this.field2908[0] >= 256) {
            this.field2912 += (long) (this.field2908[0] - 256 >> 4);
        }
        if (this.field2908[1] >= 256) {
            this.field2912 += (long) (this.field2908[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2912 <<= 0x3;
            this.field2912 += (long) this.field2909[var6];
        }
        this.field2912 <<= 0x1;
        this.field2912 += (long) (this.field2910 ? 1 : 0);
        this.field2908[5] = var3;
        this.field2908[9] = var4;
        if (var1 != 0L && this.field2912 != var1) {
            field2916.method3498(var1);
        }
    }

    @ObfuscatedName("fa.j(Lai;ILai;II)Ldu;")
    public class105 method3271(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2911 != -1) {
            return class40.method2058(this.field2911).method753(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2912;
        int[] var7 = this.field2908;
        if (arg0 != null && (arg0.field991 >= 0 || arg0.field1001 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2908[var8];
            }
            if (arg0.field991 >= 0) {
                var5 += (long) (arg0.field991 - this.field2908[5] << 40);
                var7[5] = arg0.field991;
            }
            if (arg0.field1001 >= 0) {
                var5 += (long) (arg0.field1001 - this.field2908[3] << 48);
                var7[3] = arg0.field1001;
            }
        }
        class105 var9 = (class105) field2916.method3497(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method715(var12 - 256).method898()) {
                    var10 = true;
                }
                if (var12 >= 512 && !Statics.method975(var12 - 512).method1015(this.field2910)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2914 != -1L) {
                    var9 = (class105) field2916.method3497(this.field2914);
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
                        class100 var17 = class45.method715(var16 - 256).method902();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = Statics.method975(var16 - 512).method1021(this.field2910);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2909[var20] < Statics.field1970[var20].length) {
                        var19.method2082(Statics.field80[var20], Statics.field1970[var20][this.field2909[var20]]);
                    }
                    if (this.field2909[var20] < Statics.field2897[var20].length) {
                        var19.method2082(Statics.field2913[var20], Statics.field2897[var20][this.field2909[var20]]);
                    }
                }
                var9 = var19.method2090(64, 850, -30, -50, -30);
                field2916.method3508(var9, var5);
                this.field2914 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class105 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method852(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method849(var9, arg3);
        } else {
            var21 = arg0.method849(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fa.n(B)Lcx;")
    public class100 method3269() {
        if (this.field2911 != -1) {
            return class40.method2058(this.field2911).method749();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2908[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method715(var3 - 256).method919()) {
                var1 = true;
            }
            if (var3 >= 512 && !Statics.method975(var3 - 512).method1022(this.field2910)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2908[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class45.method715(var7 - 256).method903();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = Statics.method975(var7 - 512).method1023(this.field2910);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2909[var11] < Statics.field1970[var11].length) {
                var10.method2082(Statics.field80[var11], Statics.field1970[var11][this.field2909[var11]]);
            }
            if (this.field2909[var11] < Statics.field2897[var11].length) {
                var10.method2082(Statics.field2913[var11], Statics.field2897[var11][this.field2909[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fa.l(B)I")
    public int method3263() {
        return this.field2911 == -1 ? (this.field2908[11] << 5) + (this.field2908[8] << 10) + (this.field2908[0] << 15) + (this.field2909[0] << 25) + (this.field2909[4] << 20) + this.field2908[1] : 305419896 + class40.method2058(this.field2911).field915;
    }
}
