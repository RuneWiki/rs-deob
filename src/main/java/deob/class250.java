package deob;

@ObfuscatedName("ih")
public abstract class class250 {

    @ObfuscatedName("ih.q")
    public int field3192;

    @ObfuscatedName("ih.m")
    public int[] field3193;

    @ObfuscatedName("ih.j")
    public int[] field3194;

    @ObfuscatedName("ih.g")
    public class201 field3195;

    @ObfuscatedName("ih.i")
    public int[] field3208;

    @ObfuscatedName("ih.h")
    public int[] field3197;

    @ObfuscatedName("ih.l")
    public int[] field3198;

    @ObfuscatedName("ih.d")
    public int[][] field3199;

    @ObfuscatedName("ih.o")
    public int[][] field3196;

    @ObfuscatedName("ih.s")
    public class201[] field3201;

    @ObfuscatedName("ih.k")
    public Object[] field3204;

    @ObfuscatedName("ih.v")
    public Object[][] field3203;

    @ObfuscatedName("ih.p")
    public static class178 field3205 = new class178();

    @ObfuscatedName("ih.n")
    public int field3209;

    @ObfuscatedName("ih.t")
    public boolean field3206;

    @ObfuscatedName("ih.r")
    public boolean field3202;

    @ObfuscatedName("ih.x")
    public static int field3200 = 0;

    public class250(boolean arg0, boolean arg1) {
        this.field3206 = arg0;
        this.field3202 = arg1;
    }

    @ObfuscatedName("ih.c([BI)V")
    public void method4234(byte[] arg0) {
        this.field3209 = class185.method1653(arg0, arg0.length);
        class185 var2 = new class185(method1646(arg0));
        int var3 = var2.method3243();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method3323();
        }
        int var4 = var2.method3243();
        if (var3 >= 7) {
            this.field3192 = var2.method3258();
        } else {
            this.field3192 = var2.method3245();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3193 = new int[this.field3192];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3192; var7++) {
                this.field3193[var7] = var5 += var2.method3258();
                if (this.field3193[var7] > var6) {
                    var6 = this.field3193[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3192; var8++) {
                this.field3193[var8] = var5 += var2.method3245();
                if (this.field3193[var8] > var6) {
                    var6 = this.field3193[var8];
                }
            }
        }
        this.field3208 = new int[var6 + 1];
        this.field3197 = new int[var6 + 1];
        this.field3198 = new int[var6 + 1];
        this.field3199 = new int[var6 + 1][];
        this.field3204 = new Object[var6 + 1];
        this.field3203 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3194 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3192; var9++) {
                this.field3194[this.field3193[var9]] = var2.method3323();
            }
            this.field3195 = new class201(this.field3194);
        }
        for (int var10 = 0; var10 < this.field3192; var10++) {
            this.field3208[this.field3193[var10]] = var2.method3323();
        }
        for (int var11 = 0; var11 < this.field3192; var11++) {
            this.field3197[this.field3193[var11]] = var2.method3323();
        }
        for (int var12 = 0; var12 < this.field3192; var12++) {
            this.field3198[this.field3193[var12]] = var2.method3245();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3192; var13++) {
                int var14 = this.field3193[var13];
                int var15 = this.field3198[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3199[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3199[var14][var18] = var16 += var2.method3258();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3203[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3192; var20++) {
                int var21 = this.field3193[var20];
                int var22 = this.field3198[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3199[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3199[var21][var25] = var23 += var2.method3245();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3203[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3196 = new int[var6 + 1][];
        this.field3201 = new class201[var6 + 1];
        for (int var27 = 0; var27 < this.field3192; var27++) {
            int var28 = this.field3193[var27];
            int var29 = this.field3198[var28];
            this.field3196[var28] = new int[this.field3203[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3196[var28][this.field3199[var28][var30]] = var2.method3323();
            }
            this.field3201[var28] = new class201(this.field3196[var28]);
        }
    }

    @ObfuscatedName("ih.q(IB)V")
    public void method4209(int arg0) {
    }

    @ObfuscatedName("ih.m(III)[B")
    public byte[] method4210(int arg0, int arg1) {
        return this.method4211(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ih.j(II[II)[B")
    public byte[] method4211(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3203.length || this.field3203[arg0] == null || arg1 < 0 || arg1 >= this.field3203[arg0].length) {
            return null;
        }
        if (this.field3203[arg0][arg1] == null) {
            boolean var4 = this.method4227(arg0, arg2);
            if (!var4) {
                this.method4275(arg0);
                boolean var5 = this.method4227(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class189.method973(this.field3203[arg0][arg1], false);
        if (this.field3202) {
            this.field3203[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ih.g(III)Z")
    public boolean method4300(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3203.length || this.field3203[arg0] == null || arg1 < 0 || arg1 >= this.field3203[arg0].length) {
            return false;
        } else if (this.field3203[arg0][arg1] != null) {
            return true;
        } else if (this.field3204[arg0] == null) {
            this.method4275(arg0);
            return this.field3204[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ih.i(IB)Z")
    public boolean method4249(int arg0) {
        if (this.field3203.length == 1) {
            return this.method4300(0, arg0);
        } else if (this.field3203[arg0].length == 1) {
            return this.method4300(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ih.h(II)Z")
    public boolean method4214(int arg0) {
        if (this.field3204[arg0] == null) {
            this.method4275(arg0);
            return this.field3204[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ih.l(I)Z")
    public boolean method4215() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3193.length; var2++) {
            int var3 = this.field3193[var2];
            if (this.field3204[var3] == null) {
                this.method4275(var3);
                if (this.field3204[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ih.o(IB)I")
    public int method4216(int arg0) {
        return this.field3204[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ih.k(II)[B")
    public byte[] method4217(int arg0) {
        if (this.field3203.length == 1) {
            return this.method4210(0, arg0);
        } else if (this.field3203[arg0].length == 1) {
            return this.method4210(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ih.v(IIB)[B")
    public byte[] method4229(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3203.length || this.field3203[arg0] == null || arg1 < 0 || arg1 >= this.field3203[arg0].length) {
            return null;
        }
        if (this.field3203[arg0][arg1] == null) {
            boolean var3 = this.method4227(arg0, (int[]) null);
            if (!var3) {
                this.method4275(arg0);
                boolean var4 = this.method4227(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class189.method973(this.field3203[arg0][arg1], false);
    }

    @ObfuscatedName("ih.p(II)[B")
    public byte[] method4219(int arg0) {
        if (this.field3203.length == 1) {
            return this.method4229(0, arg0);
        } else if (this.field3203[arg0].length == 1) {
            return this.method4229(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ih.n(II)V")
    public void method4275(int arg0) {
    }

    @ObfuscatedName("ih.t(IB)[I")
    public int[] method4221(int arg0) {
        return this.field3199[arg0];
    }

    @ObfuscatedName("ih.r(II)I")
    public int method4222(int arg0) {
        return this.field3203[arg0].length;
    }

    @ObfuscatedName("ih.x(B)I")
    public int method4223() {
        return this.field3203.length;
    }

    @ObfuscatedName("ih.b(I)V")
    public void method4224() {
        for (int var1 = 0; var1 < this.field3204.length; var1++) {
            this.field3204[var1] = null;
        }
    }

    @ObfuscatedName("ih.w(II)V")
    public void method4297(int arg0) {
        for (int var2 = 0; var2 < this.field3203[arg0].length; var2++) {
            this.field3203[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ih.a(B)V")
    public void method4242() {
        for (int var1 = 0; var1 < this.field3203.length; var1++) {
            if (this.field3203[var1] != null) {
                for (int var2 = 0; var2 < this.field3203[var1].length; var2++) {
                    this.field3203[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ih.z(I[II)Z")
    public boolean method4227(int arg0, int[] arg1) {
        if (this.field3204[arg0] == null) {
            return false;
        }
        int var3 = this.field3198[arg0];
        int[] var4 = this.field3199[arg0];
        Object[] var5 = this.field3203[arg0];
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
            var8 = class189.method973(this.field3204[arg0], true);
            class185 var9 = new class185(var8);
            var9.method3340(arg1, 5, var9.field2388.length);
        } else {
            var8 = class189.method973(this.field3204[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1646(var8);
        } catch (RuntimeException var27) {
            throw Statics.method4031(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class185.method1653(var8, var8.length) + "," + class185.method1653(var8, var8.length - 2) + "," + this.field3208[arg0] + "," + this.field3209);
        }
        if (this.field3206) {
            this.field3204[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class185 var15 = new class185(var10);
            int[] var16 = new int[var3];
            var15.field2386 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method3323();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2386 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method3323();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field3202) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class189.method1638(var20[var26], false);
                }
            }
        } else if (this.field3202) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class189.method1638(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ih.y(Ljava/lang/String;B)I")
    public int method4228(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3195.method3636(class308.method47(var2));
    }

    @ObfuscatedName("ih.u(ILjava/lang/String;B)I")
    public int method4255(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3201[arg0].method3636(class308.method47(var3));
    }

    @ObfuscatedName("ih.f(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4230(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3195.method3636(class308.method47(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3201[var5].method3636(class308.method47(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ih.at(Ljava/lang/String;Ljava/lang/String;S)[B")
    public byte[] method4294(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3195.method3636(class308.method47(var3));
        int var6 = this.field3201[var5].method3636(class308.method47(var4));
        return this.method4210(var5, var6);
    }

    @ObfuscatedName("ih.ay(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method4298(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3195.method3636(class308.method47(var3));
        int var6 = this.field3201[var5].method3636(class308.method47(var4));
        return this.method4300(var5, var6);
    }

    @ObfuscatedName("ih.ak(Ljava/lang/String;I)Z")
    public boolean method4233(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3195.method3636(class308.method47(var2));
        return this.method4214(var3);
    }

    @ObfuscatedName("ih.az(Ljava/lang/String;I)V")
    public void method4253(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3195.method3636(class308.method47(var2));
        if (var3 >= 0) {
            this.method4209(var3);
        }
    }

    @ObfuscatedName("ih.aj(Ljava/lang/String;I)I")
    public int method4235(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3195.method3636(class308.method47(var2));
        return this.method4216(var3);
    }

    @ObfuscatedName("bd.af([BB)[B")
    public static final byte[] method1646(byte[] arg0) {
        class185 var1 = new class185(arg0);
        int var2 = var1.method3243();
        int var3 = var1.method3323();
        if (var3 < 0 || !(field3200 == 0 || var3 <= field3200)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3373(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3323();
            if (var5 < 0 || field3200 != 0 && var5 > field3200) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class179.method3177(var6, var5, arg0, var3, 9);
            } else {
                field3205.method3173(var1, var6);
            }
            return var6;
        }
    }
}
