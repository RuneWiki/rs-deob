package deob;

@ObfuscatedName("gs")
public class class183 {

    @ObfuscatedName("gs.k")
    public int[] field2973;

    @ObfuscatedName("gs.q")
    public int[] field2972;

    @ObfuscatedName("gs.f")
    public boolean field2971;

    @ObfuscatedName("gs.c")
    public int field2976;

    @ObfuscatedName("gs.v")
    public long field2965;

    @ObfuscatedName("gs.j")
    public long field2970;

    @ObfuscatedName("gs.l")
    public static final int[] field2968 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("gs.b")
    public static class197 field2966 = new class197(260);

    @ObfuscatedName("gs.k([I[IZII)V")
    public void method3294(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field671; var6++) {
                    class47 var7 = class47.method659(var6);
                    if (var7 != null && !var7.field1059 && var7.field1054 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2968[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2973 = arg0;
        this.field2972 = arg1;
        this.field2971 = arg2;
        this.field2976 = arg3;
        this.method3299();
    }

    @ObfuscatedName("gs.q(IZI)V")
    public void method3295(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2971) {
            return;
        }
        int var3 = this.field2973[field2968[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class47 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field671) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field671 - 1;
                }
            }
            var4 = class47.method659(var3);
        } while (var4 == null || var4.field1059 || var4.field1054 != arg0 + (this.field2971 ? 7 : 0));
        this.field2973[field2968[arg0]] = var3 + 256;
        this.method3299();
    }

    @ObfuscatedName("gs.f(IZI)V")
    public void method3316(int arg0, boolean arg1) {
        int var3 = this.field2972[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2969[arg0].length) {
                    var3 = 0;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var5 = false;
                } else {
                    var5 = true;
                }
            } while (!var5);
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2969[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2972[arg0] = var3;
        this.method3299();
    }

    @ObfuscatedName("gs.c(ZI)V")
    public void method3298(boolean arg0) {
        if (this.field2971 != arg0) {
            this.method3294((int[]) null, this.field2972, arg0, -1);
        }
    }

    @ObfuscatedName("gs.v(Lde;I)V")
    public void method3323(class123 arg0) {
        arg0.method2412(this.field2971 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2973[field2968[var2]];
            if (var3 == 0) {
                arg0.method2412(-1);
            } else {
                arg0.method2412(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2412(this.field2972[var4]);
        }
    }

    @ObfuscatedName("gs.j(I)V")
    public void method3299() {
        long var1 = this.field2965;
        int var3 = this.field2973[5];
        int var4 = this.field2973[9];
        this.field2973[5] = var4;
        this.field2973[9] = var3;
        this.field2965 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2965 <<= 0x4;
            if (this.field2973[var5] >= 256) {
                this.field2965 += (long) (this.field2973[var5] - 256);
            }
        }
        if (this.field2973[0] >= 256) {
            this.field2965 += (long) (this.field2973[0] - 256 >> 4);
        }
        if (this.field2973[1] >= 256) {
            this.field2965 += (long) (this.field2973[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2965 <<= 0x3;
            this.field2965 += (long) this.field2972[var6];
        }
        this.field2965 <<= 0x1;
        this.field2965 += (long) (this.field2971 ? 1 : 0);
        this.field2973[5] = var3;
        this.field2973[9] = var4;
        if (var1 != 0L && this.field2965 != var1) {
            field2966.method3536(var1);
        }
    }

    @ObfuscatedName("gs.m(Lan;ILan;II)Ldj;")
    public class109 method3300(class45 arg0, int arg1, class45 arg2, int arg3) {
        if (this.field2976 != -1) {
            return class42.method2307(this.field2976).method774(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2965;
        int[] var7 = this.field2973;
        if (arg0 != null && (arg0.field1015 >= 0 || arg0.field1016 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2973[var8];
            }
            if (arg0.field1015 >= 0) {
                var5 += (long) (arg0.field1015 - this.field2973[5] << 40);
                var7[5] = arg0.field1015;
            }
            if (arg0.field1016 >= 0) {
                var5 += (long) (arg0.field1016 - this.field2973[3] << 48);
                var7[3] = arg0.field1016;
            }
        }
        class109 var9 = (class109) field2966.method3535(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class47.method659(var12 - 256).method933()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class56.method576(var12 - 512).method1114(this.field2971)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2970 != -1L) {
                    var9 = (class109) field2966.method3535(this.field2970);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class104[] var13 = new class104[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class104 var17 = class47.method659(var16 - 256).method920();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class104 var18 = class56.method576(var16 - 512).method1082(this.field2971);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class104 var19 = new class104(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2972[var20] < Statics.field2969[var20].length) {
                        var19.method2152(Statics.field1926[var20], Statics.field2969[var20][this.field2972[var20]]);
                    }
                    if (this.field2972[var20] < Statics.field73[var20].length) {
                        var19.method2152(Statics.field1967[var20], Statics.field73[var20][this.field2972[var20]]);
                    }
                }
                var9 = var19.method2160(64, 850, -30, -50, -30);
                field2966.method3537(var9, var5);
                this.field2970 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class109 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method883(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method864(var9, arg3);
        } else {
            var21 = arg0.method864(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("gs.y(I)Lcr;")
    public class104 method3301() {
        if (this.field2976 != -1) {
            return class42.method2307(this.field2976).method766();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2973[var2];
            if (var3 >= 256 && var3 < 512 && !class47.method659(var3 - 256).method922()) {
                var1 = true;
            }
            if (var3 >= 512 && !class56.method576(var3 - 512).method1090(this.field2971)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class104[] var4 = new class104[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2973[var6];
            if (var7 >= 256 && var7 < 512) {
                class104 var8 = class47.method659(var7 - 256).method923();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class104 var9 = class56.method576(var7 - 512).method1091(this.field2971);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class104 var10 = new class104(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2972[var11] < Statics.field2969[var11].length) {
                var10.method2152(Statics.field1926[var11], Statics.field2969[var11][this.field2972[var11]]);
            }
            if (this.field2972[var11] < Statics.field73[var11].length) {
                var10.method2152(Statics.field1967[var11], Statics.field73[var11][this.field2972[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("gs.u(I)I")
    public int method3302() {
        return this.field2976 == -1 ? (this.field2973[11] << 5) + (this.field2973[8] << 10) + (this.field2973[0] << 15) + (this.field2972[4] << 20) + (this.field2972[0] << 25) + this.field2973[1] : 305419896 + class42.method2307(this.field2976).field898;
    }

    @ObfuscatedName("fn.h(I)V")
    public static void method3022() {
        field2966.method3538();
    }
}
