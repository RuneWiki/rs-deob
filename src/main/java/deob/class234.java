package deob;

@ObfuscatedName("hp")
public abstract class class234 {

    @ObfuscatedName("hp.w")
    public int field3143;

    @ObfuscatedName("hp.e")
    public int[] field3129;

    @ObfuscatedName("hp.p")
    public int[] field3130;

    @ObfuscatedName("hp.k")
    public class336 field3136;

    @ObfuscatedName("hp.l")
    public int[] field3132;

    @ObfuscatedName("hp.b")
    public int[] field3133;

    @ObfuscatedName("hp.i")
    public int[] field3134;

    @ObfuscatedName("hp.c")
    public int[][] field3138;

    @ObfuscatedName("hp.f")
    public int[][] field3128;

    @ObfuscatedName("hp.m")
    public class336[] field3141;

    @ObfuscatedName("hp.u")
    public Object[] field3127;

    @ObfuscatedName("hp.x")
    public Object[][] field3139;

    @ObfuscatedName("hp.r")
    public static class335 field3140 = new class335();

    @ObfuscatedName("hp.v")
    public int field3137;

    @ObfuscatedName("hp.y")
    public boolean field3142;

    @ObfuscatedName("hp.g")
    public boolean field3131;

    @ObfuscatedName("hp.a")
    public static int field3144 = 0;

    public class234(boolean arg0, boolean arg1) {
        this.field3142 = arg0;
        this.field3131 = arg1;
    }

    @ObfuscatedName("hp.q([BI)V")
    public void method3773(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class301.method14(arg0, 0, var2);
        this.field3137 = var3;
        class301 var4 = new class301(method1513(arg0));
        int var5 = var4.method5077();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method5072();
        }
        int var6 = var4.method5077();
        if (var5 >= 7) {
            this.field3143 = var4.method5258();
        } else {
            this.field3143 = var4.method5069();
        }
        int var7 = 0;
        int var8 = -1;
        this.field3129 = new int[this.field3143];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field3143; var9++) {
                this.field3129[var9] = var7 += var4.method5258();
                if (this.field3129[var9] > var8) {
                    var8 = this.field3129[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field3143; var10++) {
                this.field3129[var10] = var7 += var4.method5069();
                if (this.field3129[var10] > var8) {
                    var8 = this.field3129[var10];
                }
            }
        }
        this.field3132 = new int[var8 + 1];
        this.field3133 = new int[var8 + 1];
        this.field3134 = new int[var8 + 1];
        this.field3138 = new int[var8 + 1][];
        this.field3127 = new Object[var8 + 1];
        this.field3139 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field3130 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field3143; var11++) {
                this.field3130[this.field3129[var11]] = var4.method5072();
            }
            this.field3136 = new class336(this.field3130);
        }
        for (int var12 = 0; var12 < this.field3143; var12++) {
            this.field3132[this.field3129[var12]] = var4.method5072();
        }
        for (int var13 = 0; var13 < this.field3143; var13++) {
            this.field3133[this.field3129[var13]] = var4.method5072();
        }
        for (int var14 = 0; var14 < this.field3143; var14++) {
            this.field3134[this.field3129[var14]] = var4.method5069();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field3143; var15++) {
                int var16 = this.field3129[var15];
                int var17 = this.field3134[var16];
                int var18 = 0;
                int var19 = -1;
                this.field3138[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field3138[var16][var20] = var18 += var4.method5258();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field3139[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field3143; var22++) {
                int var23 = this.field3129[var22];
                int var24 = this.field3134[var23];
                int var25 = 0;
                int var26 = -1;
                this.field3138[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field3138[var23][var27] = var25 += var4.method5069();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field3139[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field3128 = new int[var8 + 1][];
        this.field3141 = new class336[var8 + 1];
        for (int var29 = 0; var29 < this.field3143; var29++) {
            int var30 = this.field3129[var29];
            int var31 = this.field3134[var30];
            this.field3128[var30] = new int[this.field3139[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field3128[var30][this.field3138[var30][var32]] = var4.method5072();
            }
            this.field3141[var30] = new class336(this.field3128[var30]);
        }
    }

    @ObfuscatedName("hp.w(II)V")
    public void method3825(int arg0) {
    }

    @ObfuscatedName("hp.e(III)[B")
    public byte[] method3775(int arg0, int arg1) {
        return this.method3812(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("hp.p(II[II)[B")
    public byte[] method3812(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3139.length || this.field3139[arg0] == null || arg1 < 0 || arg1 >= this.field3139[arg0].length) {
            return null;
        }
        if (this.field3139[arg0][arg1] == null) {
            boolean var4 = this.method3866(arg0, arg2);
            if (!var4) {
                this.method3783(arg0);
                boolean var5 = this.method3866(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class206.method5402(this.field3139[arg0][arg1], false);
        if (this.field3131) {
            this.field3139[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("hp.k(III)Z")
    public boolean method3777(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3139.length || this.field3139[arg0] == null || arg1 < 0 || arg1 >= this.field3139[arg0].length) {
            return false;
        } else if (this.field3139[arg0][arg1] != null) {
            return true;
        } else if (this.field3127[arg0] == null) {
            this.method3783(arg0);
            return this.field3127[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("hp.l(II)Z")
    public boolean method3778(int arg0) {
        if (this.field3139.length == 1) {
            return this.method3777(0, arg0);
        } else if (this.field3139[arg0].length == 1) {
            return this.method3777(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hp.b(II)Z")
    public boolean method3830(int arg0) {
        if (this.field3127[arg0] == null) {
            this.method3783(arg0);
            return this.field3127[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("hp.i(I)Z")
    public boolean method3779() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3129.length; var2++) {
            int var3 = this.field3129[var2];
            if (this.field3127[var3] == null) {
                this.method3783(var3);
                if (this.field3127[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("hp.c(IB)I")
    public int method3798(int arg0) {
        return this.field3127[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("hp.u(II)[B")
    public byte[] method3839(int arg0) {
        if (this.field3139.length == 1) {
            return this.method3775(0, arg0);
        } else if (this.field3139[arg0].length == 1) {
            return this.method3775(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hp.x(III)[B")
    public byte[] method3781(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3139.length || this.field3139[arg0] == null || arg1 < 0 || arg1 >= this.field3139[arg0].length) {
            return null;
        }
        if (this.field3139[arg0][arg1] == null) {
            boolean var3 = this.method3866(arg0, (int[]) null);
            if (!var3) {
                this.method3783(arg0);
                boolean var4 = this.method3866(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class206.method5402(this.field3139[arg0][arg1], false);
    }

    @ObfuscatedName("hp.r(II)[B")
    public byte[] method3847(int arg0) {
        if (this.field3139.length == 1) {
            return this.method3781(0, arg0);
        } else if (this.field3139[arg0].length == 1) {
            return this.method3781(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hp.v(IS)V")
    public void method3783(int arg0) {
    }

    @ObfuscatedName("hp.y(II)[I")
    public int[] method3784(int arg0) {
        return arg0 >= 0 && arg0 < this.field3138.length ? this.field3138[arg0] : null;
    }

    @ObfuscatedName("hp.g(II)I")
    public int method3785(int arg0) {
        return this.field3139[arg0].length;
    }

    @ObfuscatedName("hp.a(I)I")
    public int method3863() {
        return this.field3139.length;
    }

    @ObfuscatedName("hp.j(I)V")
    public void method3787() {
        for (int var1 = 0; var1 < this.field3127.length; var1++) {
            this.field3127[var1] = null;
        }
    }

    @ObfuscatedName("hp.o(II)V")
    public void method3788(int arg0) {
        for (int var2 = 0; var2 < this.field3139[arg0].length; var2++) {
            this.field3139[arg0][var2] = null;
        }
    }

    @ObfuscatedName("hp.d(I)V")
    public void method3789() {
        for (int var1 = 0; var1 < this.field3139.length; var1++) {
            if (this.field3139[var1] != null) {
                for (int var2 = 0; var2 < this.field3139[var1].length; var2++) {
                    this.field3139[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("hp.s(I[II)Z")
    public boolean method3866(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("hp.z(Ljava/lang/String;I)I")
    public int method3791(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3136.method6017(class292.method134(var2));
    }

    @ObfuscatedName("hp.al(ILjava/lang/String;B)I")
    public int method3792(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3141[arg0].method6017(class292.method134(var3));
    }

    @ObfuscatedName("hp.av(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3793(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3136.method6017(class292.method134(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3141[var5].method6017(class292.method134(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("hp.as(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3794(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3136.method6017(class292.method134(var3));
        int var6 = this.field3141[var5].method6017(class292.method134(var4));
        return this.method3775(var5, var6);
    }

    @ObfuscatedName("hp.aw(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3795(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3136.method6017(class292.method134(var3));
        int var6 = this.field3141[var5].method6017(class292.method134(var4));
        return this.method3777(var5, var6);
    }

    @ObfuscatedName("hp.ad(Ljava/lang/String;I)Z")
    public boolean method3796(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3136.method6017(class292.method134(var2));
        return this.method3830(var3);
    }

    @ObfuscatedName("hp.ag(Ljava/lang/String;B)V")
    public void method3797(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3136.method6017(class292.method134(var2));
        if (var3 >= 0) {
            this.method3825(var3);
        }
    }

    @ObfuscatedName("hp.ar(Ljava/lang/String;B)I")
    public int method3869(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3136.method6017(class292.method134(var2));
        return this.method3798(var3);
    }

    @ObfuscatedName("bu.ax([BI)[B")
    public static final byte[] method1513(byte[] arg0) {
        class301 var1 = new class301(arg0);
        int var2 = var1.method5077();
        int var3 = var1.method5072();
        if (var3 < 0 || !(field3144 == 0 || var3 <= field3144)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method5270(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method5072();
            if (var5 < 0 || field3144 != 0 && var5 > field3144) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class305.method5345(var6, var5, arg0, var3, 9);
            } else {
                field3140.method6013(var1, var6);
            }
            return var6;
        }
    }
}
