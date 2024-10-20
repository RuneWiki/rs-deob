package deob;

@ObfuscatedName("ib")
public abstract class class247 {

    @ObfuscatedName("ib.a")
    public int field3319;

    @ObfuscatedName("ib.w")
    public int[] field3323;

    @ObfuscatedName("ib.e")
    public int[] field3311;

    @ObfuscatedName("ib.k")
    public class199 field3309;

    @ObfuscatedName("ib.u")
    public int[] field3325;

    @ObfuscatedName("ib.z")
    public int[] field3314;

    @ObfuscatedName("ib.t")
    public int[] field3315;

    @ObfuscatedName("ib.f")
    public int[][] field3310;

    @ObfuscatedName("ib.g")
    public int[][] field3317;

    @ObfuscatedName("ib.j")
    public class199[] field3318;

    @ObfuscatedName("ib.x")
    public Object[] field3313;

    @ObfuscatedName("ib.c")
    public Object[][] field3320;

    @ObfuscatedName("ib.s")
    public static class178 field3321 = new class178();

    @ObfuscatedName("ib.n")
    public int field3322;

    @ObfuscatedName("ib.y")
    public boolean field3312;

    @ObfuscatedName("ib.o")
    public boolean field3324;

    @ObfuscatedName("ib.r")
    public static int field3316 = 0;

    public class247(boolean arg0, boolean arg1) {
        this.field3312 = arg0;
        this.field3324 = arg1;
    }

    @ObfuscatedName("ib.a([BI)V")
    public void method3906(byte[] arg0) {
        this.field3322 = class185.method2883(arg0, arg0.length);
        class185 var2 = new class185(method3715(arg0));
        int var3 = var2.method2962();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2967();
        }
        int var4 = var2.method2962();
        if (var3 >= 7) {
            this.field3319 = var2.method2976();
        } else {
            this.field3319 = var2.method3194();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3323 = new int[this.field3319];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3319; var7++) {
                this.field3323[var7] = var5 += var2.method2976();
                if (this.field3323[var7] > var6) {
                    var6 = this.field3323[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3319; var8++) {
                this.field3323[var8] = var5 += var2.method3194();
                if (this.field3323[var8] > var6) {
                    var6 = this.field3323[var8];
                }
            }
        }
        this.field3325 = new int[var6 + 1];
        this.field3314 = new int[var6 + 1];
        this.field3315 = new int[var6 + 1];
        this.field3310 = new int[var6 + 1][];
        this.field3313 = new Object[var6 + 1];
        this.field3320 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3311 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3319; var9++) {
                this.field3311[this.field3323[var9]] = var2.method2967();
            }
            this.field3309 = new class199(this.field3311);
        }
        for (int var10 = 0; var10 < this.field3319; var10++) {
            this.field3325[this.field3323[var10]] = var2.method2967();
        }
        for (int var11 = 0; var11 < this.field3319; var11++) {
            this.field3314[this.field3323[var11]] = var2.method2967();
        }
        for (int var12 = 0; var12 < this.field3319; var12++) {
            this.field3315[this.field3323[var12]] = var2.method3194();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3319; var13++) {
                int var14 = this.field3323[var13];
                int var15 = this.field3315[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3310[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3310[var14][var18] = var16 += var2.method2976();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3320[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3319; var20++) {
                int var21 = this.field3323[var20];
                int var22 = this.field3315[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3310[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3310[var21][var25] = var23 += var2.method3194();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3320[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3317 = new int[var6 + 1][];
        this.field3318 = new class199[var6 + 1];
        for (int var27 = 0; var27 < this.field3319; var27++) {
            int var28 = this.field3323[var27];
            int var29 = this.field3315[var28];
            this.field3317[var28] = new int[this.field3320[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3317[var28][this.field3310[var28][var30]] = var2.method2967();
            }
            this.field3318[var28] = new class199(this.field3317[var28]);
        }
    }

    @ObfuscatedName("ib.w(II)V")
    public void method3896(int arg0) {
    }

    @ObfuscatedName("ib.e(IIB)[B")
    public byte[] method3897(int arg0, int arg1) {
        return this.method3912(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ib.k(II[II)[B")
    public byte[] method3912(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3320.length || this.field3320[arg0] == null || arg1 < 0 || arg1 >= this.field3320[arg0].length) {
            return null;
        }
        if (this.field3320[arg0][arg1] == null) {
            boolean var4 = this.method3911(arg0, arg2);
            if (!var4) {
                this.method3905(arg0);
                boolean var5 = this.method3911(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class188.method2201(this.field3320[arg0][arg1], false);
        if (this.field3324) {
            this.field3320[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ib.u(III)Z")
    public boolean method3901(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3320.length || this.field3320[arg0] == null || arg1 < 0 || arg1 >= this.field3320[arg0].length) {
            return false;
        } else if (this.field3320[arg0][arg1] != null) {
            return true;
        } else if (this.field3313[arg0] == null) {
            this.method3905(arg0);
            return this.field3313[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ib.z(IB)Z")
    public boolean method3899(int arg0) {
        if (this.field3313[arg0] == null) {
            this.method3905(arg0);
            return this.field3313[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ib.t(I)Z")
    public boolean method3900() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3323.length; var2++) {
            int var3 = this.field3323[var2];
            if (this.field3313[var3] == null) {
                this.method3905(var3);
                if (this.field3313[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ib.f(II)I")
    public int method3944(int arg0) {
        return this.field3313[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ib.g(II)[B")
    public byte[] method3902(int arg0) {
        if (this.field3320.length == 1) {
            return this.method3897(0, arg0);
        } else if (this.field3320[arg0].length == 1) {
            return this.method3897(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ib.x(IIB)[B")
    public byte[] method3903(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3320.length || this.field3320[arg0] == null || arg1 < 0 || arg1 >= this.field3320[arg0].length) {
            return null;
        }
        if (this.field3320[arg0][arg1] == null) {
            boolean var3 = this.method3911(arg0, (int[]) null);
            if (!var3) {
                this.method3905(arg0);
                boolean var4 = this.method3911(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class188.method2201(this.field3320[arg0][arg1], false);
    }

    @ObfuscatedName("ib.c(II)[B")
    public byte[] method3970(int arg0) {
        if (this.field3320.length == 1) {
            return this.method3903(0, arg0);
        } else if (this.field3320[arg0].length == 1) {
            return this.method3903(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ib.n(II)V")
    public void method3905(int arg0) {
    }

    @ObfuscatedName("ib.y(II)[I")
    public int[] method3983(int arg0) {
        return this.field3310[arg0];
    }

    @ObfuscatedName("ib.o(II)I")
    public int method3907(int arg0) {
        return this.field3320[arg0].length;
    }

    @ObfuscatedName("ib.r(B)I")
    public int method3908() {
        return this.field3320.length;
    }

    @ObfuscatedName("ib.i(IB)V")
    public void method3968(int arg0) {
        for (int var2 = 0; var2 < this.field3320[arg0].length; var2++) {
            this.field3320[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ib.q(B)V")
    public void method3924() {
        for (int var1 = 0; var1 < this.field3320.length; var1++) {
            if (this.field3320[var1] != null) {
                for (int var2 = 0; var2 < this.field3320[var1].length; var2++) {
                    this.field3320[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ib.b(I[II)Z")
    public boolean method3911(int arg0, int[] arg1) {
        if (this.field3313[arg0] == null) {
            return false;
        }
        int var3 = this.field3315[arg0];
        int[] var4 = this.field3310[arg0];
        Object[] var5 = this.field3320[arg0];
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            if (var5[var4[var7]] == null) {
                var6 = false;
                break;
            }
        }
        if (var6) {
            return true;
        }
        byte[] var8;
        if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
            var8 = class188.method2201(this.field3313[arg0], true);
            class185 var9 = new class185(var8);
            var9.method2982(arg1, 5, var9.field2512.length);
        } else {
            var8 = class188.method2201(this.field3313[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method3715(var8);
        } catch (RuntimeException var27) {
            throw class155.method152(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class185.method2883(var8, var8.length) + "," + class185.method2883(var8, var8.length - 2) + "," + this.field3325[arg0] + "," + this.field3322);
        }
        if (this.field3312) {
            this.field3313[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class185 var15 = new class185(var10);
            int[] var16 = new int[var3];
            var15.field2509 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2967();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2509 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2967();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field3324) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class188.method205(var20[var26], false);
                }
            }
        } else if (this.field3324) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class188.method205(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ib.h(Ljava/lang/String;S)I")
    public int method3962(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3309.method3358(class282.method233(var2));
    }

    @ObfuscatedName("ib.d(ILjava/lang/String;I)I")
    public int method3913(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3318[arg0].method3358(class282.method233(var3));
    }

    @ObfuscatedName("ib.v(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3914(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3309.method3358(class282.method233(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3318[var5].method3358(class282.method233(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ib.p(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3978(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3309.method3358(class282.method233(var3));
        int var6 = this.field3318[var5].method3358(class282.method233(var4));
        return this.method3897(var5, var6);
    }

    @ObfuscatedName("ib.ab(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3920(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3309.method3358(class282.method233(var3));
        int var6 = this.field3318[var5].method3358(class282.method233(var4));
        return this.method3901(var5, var6);
    }

    @ObfuscatedName("ib.ad(Ljava/lang/String;I)Z")
    public boolean method3917(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3309.method3358(class282.method233(var2));
        return this.method3899(var3);
    }

    @ObfuscatedName("ib.ag(Ljava/lang/String;B)V")
    public void method3918(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3309.method3358(class282.method233(var2));
        if (var3 >= 0) {
            this.method3896(var3);
        }
    }

    @ObfuscatedName("ib.ak(Ljava/lang/String;B)I")
    public int method3919(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3309.method3358(class282.method233(var2));
        return this.method3944(var3);
    }

    @ObfuscatedName("ho.as([BI)[B")
    public static final byte[] method3715(byte[] arg0) {
        class185 var1 = new class185(arg0);
        int var2 = var1.method2962();
        int var3 = var1.method2967();
        if (var3 < 0 || !(field3316 == 0 || var3 <= field3316)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2973(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2967();
            if (var5 < 0 || field3316 != 0 && var5 > field3316) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class179.method2904(var6, var5, arg0, var3, 9);
            } else {
                field3321.method2901(var1, var6);
            }
            return var6;
        }
    }
}
