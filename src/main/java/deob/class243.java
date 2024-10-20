package deob;

@ObfuscatedName("id")
public abstract class class243 {

    @ObfuscatedName("id.d")
    public int field3302;

    @ObfuscatedName("id.x")
    public int[] field3292;

    @ObfuscatedName("id.k")
    public int[] field3291;

    @ObfuscatedName("id.z")
    public class195 field3300;

    @ObfuscatedName("id.v")
    public int[] field3293;

    @ObfuscatedName("id.m")
    public int[] field3290;

    @ObfuscatedName("id.b")
    public int[] field3295;

    @ObfuscatedName("id.t")
    public int[][] field3294;

    @ObfuscatedName("id.p")
    public int[][] field3297;

    @ObfuscatedName("id.r")
    public class195[] field3298;

    @ObfuscatedName("id.l")
    public Object[] field3299;

    @ObfuscatedName("id.u")
    public Object[][] field3289;

    @ObfuscatedName("id.n")
    public static class174 field3301 = new class174();

    @ObfuscatedName("id.c")
    public int field3296;

    @ObfuscatedName("id.y")
    public boolean field3303;

    @ObfuscatedName("id.j")
    public boolean field3304;

    @ObfuscatedName("id.f")
    public static int field3305 = 0;

    public class243(boolean arg0, boolean arg1) {
        this.field3303 = arg0;
        this.field3304 = arg1;
    }

    @ObfuscatedName("id.d([BI)V")
    public void method3933(byte[] arg0) {
        this.field3296 = class181.method27(arg0, arg0.length);
        class181 var2 = new class181(method1(arg0));
        int var3 = var2.method3204();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method3041();
        }
        int var4 = var2.method3204();
        if (var3 >= 7) {
            this.field3302 = var2.method3143();
        } else {
            this.field3302 = var2.method3179();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3292 = new int[this.field3302];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3302; var7++) {
                this.field3292[var7] = var5 += var2.method3143();
                if (this.field3292[var7] > var6) {
                    var6 = this.field3292[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3302; var8++) {
                this.field3292[var8] = var5 += var2.method3179();
                if (this.field3292[var8] > var6) {
                    var6 = this.field3292[var8];
                }
            }
        }
        this.field3293 = new int[var6 + 1];
        this.field3290 = new int[var6 + 1];
        this.field3295 = new int[var6 + 1];
        this.field3294 = new int[var6 + 1][];
        this.field3299 = new Object[var6 + 1];
        this.field3289 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3291 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3302; var9++) {
                this.field3291[this.field3292[var9]] = var2.method3041();
            }
            this.field3300 = new class195(this.field3291);
        }
        for (int var10 = 0; var10 < this.field3302; var10++) {
            this.field3293[this.field3292[var10]] = var2.method3041();
        }
        for (int var11 = 0; var11 < this.field3302; var11++) {
            this.field3290[this.field3292[var11]] = var2.method3041();
        }
        for (int var12 = 0; var12 < this.field3302; var12++) {
            this.field3295[this.field3292[var12]] = var2.method3179();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3302; var13++) {
                int var14 = this.field3292[var13];
                int var15 = this.field3295[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3294[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3294[var14][var18] = var16 += var2.method3143();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3289[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3302; var20++) {
                int var21 = this.field3292[var20];
                int var22 = this.field3295[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3294[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3294[var21][var25] = var23 += var2.method3179();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3289[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3297 = new int[var6 + 1][];
        this.field3298 = new class195[var6 + 1];
        for (int var27 = 0; var27 < this.field3302; var27++) {
            int var28 = this.field3292[var27];
            int var29 = this.field3295[var28];
            this.field3297[var28] = new int[this.field3289[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3297[var28][this.field3294[var28][var30]] = var2.method3041();
            }
            this.field3298[var28] = new class195(this.field3297[var28]);
        }
    }

    @ObfuscatedName("id.x(II)V")
    public void method3934(int arg0) {
    }

    @ObfuscatedName("id.k(III)[B")
    public byte[] method3935(int arg0, int arg1) {
        return this.method3936(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("id.z(II[IB)[B")
    public byte[] method3936(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3289.length || this.field3289[arg0] == null || arg1 < 0 || arg1 >= this.field3289[arg0].length) {
            return null;
        }
        if (this.field3289[arg0][arg1] == null) {
            boolean var4 = this.method3996(arg0, arg2);
            if (!var4) {
                this.method3944(arg0);
                boolean var5 = this.method3996(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class184.method641(this.field3289[arg0][arg1], false);
        if (this.field3304) {
            this.field3289[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("id.v(III)Z")
    public boolean method3992(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3289.length || this.field3289[arg0] == null || arg1 < 0 || arg1 >= this.field3289[arg0].length) {
            return false;
        } else if (this.field3289[arg0][arg1] != null) {
            return true;
        } else if (this.field3299[arg0] == null) {
            this.method3944(arg0);
            return this.field3299[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("id.m(IB)Z")
    public boolean method3938(int arg0) {
        if (this.field3299[arg0] == null) {
            this.method3944(arg0);
            return this.field3299[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("id.b(B)Z")
    public boolean method3939() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3292.length; var2++) {
            int var3 = this.field3292[var2];
            if (this.field3299[var3] == null) {
                this.method3944(var3);
                if (this.field3299[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("id.t(IB)I")
    public int method3964(int arg0) {
        return this.field3299[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("id.p(II)[B")
    public byte[] method3941(int arg0) {
        if (this.field3289.length == 1) {
            return this.method3935(0, arg0);
        } else if (this.field3289[arg0].length == 1) {
            return this.method3935(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("id.r(III)[B")
    public byte[] method3942(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3289.length || this.field3289[arg0] == null || arg1 < 0 || arg1 >= this.field3289[arg0].length) {
            return null;
        }
        if (this.field3289[arg0][arg1] == null) {
            boolean var3 = this.method3996(arg0, (int[]) null);
            if (!var3) {
                this.method3944(arg0);
                boolean var4 = this.method3996(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class184.method641(this.field3289[arg0][arg1], false);
    }

    @ObfuscatedName("id.l(II)[B")
    public byte[] method3943(int arg0) {
        if (this.field3289.length == 1) {
            return this.method3942(0, arg0);
        } else if (this.field3289[arg0].length == 1) {
            return this.method3942(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("id.u(II)V")
    public void method3944(int arg0) {
    }

    @ObfuscatedName("id.c(II)[I")
    public int[] method3945(int arg0) {
        return this.field3294[arg0];
    }

    @ObfuscatedName("id.j(II)I")
    public int method3946(int arg0) {
        return this.field3289[arg0].length;
    }

    @ObfuscatedName("id.f(B)I")
    public int method3947() {
        return this.field3289.length;
    }

    @ObfuscatedName("id.s(II)V")
    public void method3948(int arg0) {
        for (int var2 = 0; var2 < this.field3289[arg0].length; var2++) {
            this.field3289[arg0][var2] = null;
        }
    }

    @ObfuscatedName("id.e(I)V")
    public void method3961() {
        for (int var1 = 0; var1 < this.field3289.length; var1++) {
            if (this.field3289[var1] != null) {
                for (int var2 = 0; var2 < this.field3289[var1].length; var2++) {
                    this.field3289[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("id.q(I[IB)Z")
    public boolean method3996(int arg0, int[] arg1) {
        if (this.field3299[arg0] == null) {
            return false;
        }
        int var3 = this.field3295[arg0];
        int[] var4 = this.field3294[arg0];
        Object[] var5 = this.field3289[arg0];
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
            var8 = class184.method641(this.field3299[arg0], true);
            class181 var9 = new class181(var8);
            var9.method3057(arg1, 5, var9.field2496.length);
        } else {
            var8 = class184.method641(this.field3299[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1(var8);
        } catch (RuntimeException var27) {
            throw Statics.method513(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class181.method27(var8, var8.length) + "," + class181.method27(var8, var8.length - 2) + "," + this.field3293[arg0] + "," + this.field3296);
        }
        if (this.field3303) {
            this.field3299[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class181 var15 = new class181(var10);
            int[] var16 = new int[var3];
            var15.field2498 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method3041();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2498 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method3041();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field3304) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class184.method148(var20[var26], false);
                }
            }
        } else if (this.field3304) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class184.method148(var10, false);
        }
        return true;
    }

    @ObfuscatedName("id.h(Ljava/lang/String;I)I")
    public int method3951(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3300.method3408(class278.method3914(var2));
    }

    @ObfuscatedName("id.i(ILjava/lang/String;I)I")
    public int method3952(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3298[arg0].method3408(class278.method3914(var3));
    }

    @ObfuscatedName("id.o(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3953(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3300.method3408(class278.method3914(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3298[var5].method3408(class278.method3914(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("id.w(Ljava/lang/String;Ljava/lang/String;S)[B")
    public byte[] method3954(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3300.method3408(class278.method3914(var3));
        int var6 = this.field3298[var5].method3408(class278.method3914(var4));
        return this.method3935(var5, var6);
    }

    @ObfuscatedName("id.ah(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3955(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3300.method3408(class278.method3914(var3));
        int var6 = this.field3298[var5].method3408(class278.method3914(var4));
        return this.method3992(var5, var6);
    }

    @ObfuscatedName("id.ak(Ljava/lang/String;B)Z")
    public boolean method3956(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3300.method3408(class278.method3914(var2));
        return this.method3938(var3);
    }

    @ObfuscatedName("id.aa(Ljava/lang/String;B)V")
    public void method3957(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3300.method3408(class278.method3914(var2));
        if (var3 >= 0) {
            this.method3934(var3);
        }
    }

    @ObfuscatedName("id.ax(Ljava/lang/String;I)I")
    public int method3966(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3300.method3408(class278.method3914(var2));
        return this.method3964(var3);
    }

    @ObfuscatedName("x.aq([BB)[B")
    public static final byte[] method1(byte[] arg0) {
        class181 var1 = new class181(arg0);
        int var2 = var1.method3204();
        int var3 = var1.method3041();
        if (var3 < 0 || !(field3305 == 0 || var3 <= field3305)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3129(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3041();
            if (var5 < 0 || field3305 != 0 && var5 > field3305) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class175.method2978(var6, var5, arg0, var3, 9);
            } else {
                field3301.method2975(var1, var6);
            }
            return var6;
        }
    }
}
