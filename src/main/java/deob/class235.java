package deob;

@ObfuscatedName("ii")
public abstract class class235 {

    @ObfuscatedName("ii.t")
    public int field3133;

    @ObfuscatedName("ii.o")
    public int[] field3134;

    @ObfuscatedName("ii.e")
    public int[] field3135;

    @ObfuscatedName("ii.i")
    public class336 field3138;

    @ObfuscatedName("ii.g")
    public int[] field3145;

    @ObfuscatedName("ii.d")
    public int[] field3132;

    @ObfuscatedName("ii.l")
    public int[] field3139;

    @ObfuscatedName("ii.j")
    public int[][] field3140;

    @ObfuscatedName("ii.m")
    public int[][] field3141;

    @ObfuscatedName("ii.p")
    public class336[] field3142;

    @ObfuscatedName("ii.h")
    public Object[] field3148;

    @ObfuscatedName("ii.v")
    public Object[][] field3144;

    @ObfuscatedName("ii.n")
    public static class335 field3137 = new class335();

    @ObfuscatedName("ii.x")
    public int field3143;

    @ObfuscatedName("ii.w")
    public boolean field3147;

    @ObfuscatedName("ii.k")
    public boolean field3136;

    @ObfuscatedName("ii.q")
    public static int field3149 = 0;

    public class235(boolean arg0, boolean arg1) {
        this.field3147 = arg0;
        this.field3136 = arg1;
    }

    @ObfuscatedName("ii.c([BI)V")
    public void method3834(byte[] arg0) {
        this.field3143 = class301.method4666(arg0, arg0.length);
        class301 var2 = new class301(method20(arg0));
        int var3 = var2.method5129();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method5134();
        }
        int var4 = var2.method5129();
        if (var3 >= 7) {
            this.field3133 = var2.method5145();
        } else {
            this.field3133 = var2.method5124();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3134 = new int[this.field3133];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3133; var7++) {
                this.field3134[var7] = var5 += var2.method5145();
                if (this.field3134[var7] > var6) {
                    var6 = this.field3134[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3133; var8++) {
                this.field3134[var8] = var5 += var2.method5124();
                if (this.field3134[var8] > var6) {
                    var6 = this.field3134[var8];
                }
            }
        }
        this.field3145 = new int[var6 + 1];
        this.field3132 = new int[var6 + 1];
        this.field3139 = new int[var6 + 1];
        this.field3140 = new int[var6 + 1][];
        this.field3148 = new Object[var6 + 1];
        this.field3144 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3135 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3133; var9++) {
                this.field3135[this.field3134[var9]] = var2.method5134();
            }
            this.field3138 = new class336(this.field3135);
        }
        for (int var10 = 0; var10 < this.field3133; var10++) {
            this.field3145[this.field3134[var10]] = var2.method5134();
        }
        for (int var11 = 0; var11 < this.field3133; var11++) {
            this.field3132[this.field3134[var11]] = var2.method5134();
        }
        for (int var12 = 0; var12 < this.field3133; var12++) {
            this.field3139[this.field3134[var12]] = var2.method5124();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3133; var13++) {
                int var14 = this.field3134[var13];
                int var15 = this.field3139[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3140[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3140[var14][var18] = var16 += var2.method5145();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3144[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3133; var20++) {
                int var21 = this.field3134[var20];
                int var22 = this.field3139[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3140[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3140[var21][var25] = var23 += var2.method5124();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3144[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3141 = new int[var6 + 1][];
        this.field3142 = new class336[var6 + 1];
        for (int var27 = 0; var27 < this.field3133; var27++) {
            int var28 = this.field3134[var27];
            int var29 = this.field3139[var28];
            this.field3141[var28] = new int[this.field3144[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3141[var28][this.field3140[var28][var30]] = var2.method5134();
            }
            this.field3142[var28] = new class336(this.field3141[var28]);
        }
    }

    @ObfuscatedName("ii.t(II)V")
    public void method3835(int arg0) {
    }

    @ObfuscatedName("ii.o(IIS)[B")
    public byte[] method3845(int arg0, int arg1) {
        return this.method3837(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ii.e(II[IS)[B")
    public byte[] method3837(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3144.length || this.field3144[arg0] == null || arg1 < 0 || arg1 >= this.field3144[arg0].length) {
            return null;
        }
        if (this.field3144[arg0][arg1] == null) {
            boolean var4 = this.method3853(arg0, arg2);
            if (!var4) {
                this.method3846(arg0);
                boolean var5 = this.method3853(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        Object var6 = this.field3144[arg0][arg1];
        byte[] var7;
        if (var6 == null) {
            var7 = null;
        } else if (var6 instanceof byte[]) {
            byte[] var8 = (byte[]) ((byte[]) var6);
            var7 = var8;
        } else if ((var6 instanceof class206)) {
            class206 var9 = (class206) var6;
            var7 = var9.method3628();
        } else {
            throw new IllegalArgumentException();
        }
        if (this.field3136) {
            this.field3144[arg0][arg1] = null;
        }
        return var7;
    }

    @ObfuscatedName("ii.i(IIB)Z")
    public boolean method3838(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3144.length || this.field3144[arg0] == null || arg1 < 0 || arg1 >= this.field3144[arg0].length) {
            return false;
        } else if (this.field3144[arg0][arg1] != null) {
            return true;
        } else if (this.field3148[arg0] == null) {
            this.method3846(arg0);
            return this.field3148[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ii.g(IB)Z")
    public boolean method3839(int arg0) {
        if (this.field3144.length == 1) {
            return this.method3838(0, arg0);
        } else if (this.field3144[arg0].length == 1) {
            return this.method3838(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ii.d(II)Z")
    public boolean method3836(int arg0) {
        if (this.field3148[arg0] == null) {
            this.method3846(arg0);
            return this.field3148[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ii.l(B)Z")
    public boolean method3841() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3134.length; var2++) {
            int var3 = this.field3134[var2];
            if (this.field3148[var3] == null) {
                this.method3846(var3);
                if (this.field3148[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ii.j(IB)I")
    public int method3913(int arg0) {
        return this.field3148[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ii.m(II)[B")
    public byte[] method3898(int arg0) {
        if (this.field3144.length == 1) {
            return this.method3845(0, arg0);
        } else if (this.field3144[arg0].length == 1) {
            return this.method3845(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ii.p(IIB)[B")
    public byte[] method3885(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3144.length || this.field3144[arg0] == null || arg1 < 0 || arg1 >= this.field3144[arg0].length) {
            return null;
        }
        if (this.field3144[arg0][arg1] == null) {
            boolean var3 = this.method3853(arg0, (int[]) null);
            if (!var3) {
                this.method3846(arg0);
                boolean var4 = this.method3853(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        Object var5 = this.field3144[arg0][arg1];
        byte[] var6;
        if (var5 == null) {
            var6 = null;
        } else if (var5 instanceof byte[]) {
            byte[] var7 = (byte[]) ((byte[]) var5);
            var6 = var7;
        } else if ((var5 instanceof class206)) {
            class206 var8 = (class206) var5;
            var6 = var8.method3628();
        } else {
            throw new IllegalArgumentException();
        }
        return var6;
    }

    @ObfuscatedName("ii.h(IB)[B")
    public byte[] method3905(int arg0) {
        if (this.field3144.length == 1) {
            return this.method3885(0, arg0);
        } else if (this.field3144[arg0].length == 1) {
            return this.method3885(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ii.v(II)V")
    public void method3846(int arg0) {
    }

    @ObfuscatedName("ii.n(II)[I")
    public int[] method3847(int arg0) {
        return arg0 >= 0 && arg0 < this.field3140.length ? this.field3140[arg0] : null;
    }

    @ObfuscatedName("ii.x(IB)I")
    public int method3848(int arg0) {
        return this.field3144[arg0].length;
    }

    @ObfuscatedName("ii.w(I)I")
    public int method3849() {
        return this.field3144.length;
    }

    @ObfuscatedName("ii.q(I)V")
    public void method3850() {
        for (int var1 = 0; var1 < this.field3148.length; var1++) {
            this.field3148[var1] = null;
        }
    }

    @ObfuscatedName("ii.z(II)V")
    public void method3844(int arg0) {
        for (int var2 = 0; var2 < this.field3144[arg0].length; var2++) {
            this.field3144[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ii.y(I)V")
    public void method3852() {
        for (int var1 = 0; var1 < this.field3144.length; var1++) {
            if (this.field3144[var1] != null) {
                for (int var2 = 0; var2 < this.field3144[var1].length; var2++) {
                    this.field3144[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ii.f(I[IB)Z")
    public boolean method3853(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ii.a(Ljava/lang/String;I)I")
    public int method3854(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3138.method6082(class292.method922(var2));
    }

    @ObfuscatedName("ii.u(ILjava/lang/String;I)I")
    public int method3855(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3142[arg0].method6082(class292.method922(var3));
    }

    @ObfuscatedName("ii.ae(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3928(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3138.method6082(class292.method922(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3142[var5].method6082(class292.method922(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ii.af(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3914(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3138.method6082(class292.method922(var3));
        int var6 = this.field3142[var5].method6082(class292.method922(var4));
        return this.method3845(var5, var6);
    }

    @ObfuscatedName("ii.az(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3858(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3138.method6082(class292.method922(var3));
        int var6 = this.field3142[var5].method6082(class292.method922(var4));
        return this.method3838(var5, var6);
    }

    @ObfuscatedName("ii.ax(Ljava/lang/String;I)Z")
    public boolean method3926(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3138.method6082(class292.method922(var2));
        return this.method3836(var3);
    }

    @ObfuscatedName("ii.aj(Ljava/lang/String;I)V")
    public void method3860(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3138.method6082(class292.method922(var2));
        if (var3 >= 0) {
            this.method3835(var3);
        }
    }

    @ObfuscatedName("ii.au(Ljava/lang/String;I)I")
    public int method3833(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3138.method6082(class292.method922(var2));
        return this.method3913(var3);
    }

    @ObfuscatedName("o.ay([BB)[B")
    public static final byte[] method20(byte[] arg0) {
        class301 var1 = new class301(arg0);
        int var2 = var1.method5129();
        int var3 = var1.method5134();
        if (var3 < 0 || !(field3149 == 0 || var3 <= field3149)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method5288(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method5134();
            if (var5 < 0 || field3149 != 0 && var5 > field3149) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class305.method5407(var6, var5, arg0, var3, 9);
            } else {
                field3137.method6078(var1, var6);
            }
            return var6;
        }
    }
}
