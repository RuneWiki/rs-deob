package deob;

@ObfuscatedName("eg")
public abstract class class81 {

    @ObfuscatedName("eg.f")
    public class5[] field923;

    @ObfuscatedName("eg.g")
    public int[][] field916;

    @ObfuscatedName("eg.e")
    public int[][] field924;

    @ObfuscatedName("eg.n")
    public int[] field915;

    @ObfuscatedName("eg.o")
    public int[] field911;

    @ObfuscatedName("eg.l")
    public static class42 field921 = new class42();

    @ObfuscatedName("eg.m")
    public static int field925 = 0;

    @ObfuscatedName("eg.j")
    public int field918;

    @ObfuscatedName("eg.h")
    public int[] field913;

    @ObfuscatedName("eg.i")
    public boolean field917;

    @ObfuscatedName("eg.w")
    public int field922;

    @ObfuscatedName("eg.t")
    public class5 field912;

    @ObfuscatedName("eg.s")
    public boolean field909;

    @ObfuscatedName("eg.r")
    public int[] field914;

    @ObfuscatedName("eg.p")
    public int[] field910;

    @ObfuscatedName("eg.z")
    public Object[][] field920;

    @ObfuscatedName("eg.x")
    public Object[] field919;

    @ObfuscatedName("eg.j([BI)V")
    public void method1081(byte[] arg0) {
        this.field922 = class31.method2135(arg0, arg0.length);
        class31 var2 = new class31(method1057(arg0));
        int var3 = var2.method512();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method376();
        }
        int var4 = var2.method512();
        if (var3 >= 7) {
            this.field918 = var2.method576();
        } else {
            this.field918 = var2.method373();
        }
        int var5 = 0;
        int var6 = -1;
        this.field910 = new int[this.field918];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field918; var7++) {
                this.field910[var7] = var5 += var2.method576();
                if (this.field910[var7] > var6) {
                    var6 = this.field910[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field918; var8++) {
                this.field910[var8] = var5 += var2.method373();
                if (this.field910[var8] > var6) {
                    var6 = this.field910[var8];
                }
            }
        }
        this.field913 = new int[var6 + 1];
        this.field914 = new int[var6 + 1];
        this.field915 = new int[var6 + 1];
        this.field916 = new int[var6 + 1][];
        this.field919 = new Object[var6 + 1];
        this.field920 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field911 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field918; var9++) {
                this.field911[this.field910[var9]] = var2.method376();
            }
            this.field912 = new class5(this.field911);
        }
        for (int var10 = 0; var10 < this.field918; var10++) {
            this.field913[this.field910[var10]] = var2.method376();
        }
        for (int var11 = 0; var11 < this.field918; var11++) {
            this.field914[this.field910[var11]] = var2.method376();
        }
        for (int var12 = 0; var12 < this.field918; var12++) {
            this.field915[this.field910[var12]] = var2.method373();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field918; var13++) {
                int var14 = this.field910[var13];
                int var15 = this.field915[var14];
                int var16 = 0;
                int var17 = -1;
                this.field916[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field916[var14][var18] = var16 += var2.method576();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field920[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field918; var20++) {
                int var21 = this.field910[var20];
                int var22 = this.field915[var21];
                int var23 = 0;
                int var24 = -1;
                this.field916[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field916[var21][var25] = var23 += var2.method373();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field920[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field924 = new int[var6 + 1][];
        this.field923 = new class5[var6 + 1];
        for (int var27 = 0; var27 < this.field918; var27++) {
            int var28 = this.field910[var27];
            int var29 = this.field915[var28];
            this.field924[var28] = new int[this.field920[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field924[var28][this.field916[var28][var30]] = var2.method376();
            }
            this.field923[var28] = new class5(this.field924[var28]);
        }
    }

    @ObfuscatedName("eg.o(III)[B")
    public byte[] method1083(int arg0, int arg1) {
        return this.method1124(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("eg.h(III)Z")
    public boolean method1085(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field920.length || this.field920[arg0] == null || arg1 < 0 || arg1 >= this.field920[arg0].length) {
            return false;
        } else if (this.field920[arg0][arg1] != null) {
            return true;
        } else if (this.field919[arg0] == null) {
            this.method1091(arg0);
            return this.field919[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eg.r(II)Z")
    public boolean method1086(int arg0) {
        if (this.field919[arg0] == null) {
            this.method1091(arg0);
            return this.field919[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eg.n(B)Z")
    public boolean method1087() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field910.length; var2++) {
            int var3 = this.field910[var2];
            if (this.field919[var3] == null) {
                this.method1091(var3);
                if (this.field919[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("eg.x(IB)V")
    public void method1091(int arg0) {
    }

    @ObfuscatedName("eg.l(IB)I")
    public int method1093(int arg0) {
        return this.field920[arg0].length;
    }

    @ObfuscatedName("eg.w(B)I")
    public int method1094() {
        return this.field920.length;
    }

    @ObfuscatedName("eg.s(B)V")
    public void method1096() {
        for (int var1 = 0; var1 < this.field920.length; var1++) {
            if (this.field920[var1] != null) {
                for (int var2 = 0; var2 < this.field920[var1].length; var2++) {
                    this.field920[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("eg.m(I[II)Z")
    public boolean method1097(int arg0, int[] arg1) {
        if (this.field919[arg0] == null) {
            return false;
        }
        int var3 = this.field915[arg0];
        int[] var4 = this.field916[arg0];
        Object[] var5 = this.field920[arg0];
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
            var8 = class28.method3574(this.field919[arg0], true);
            class31 var9 = new class31(var8);
            var9.method388(arg1, 5, var9.field168.length);
        } else {
            var8 = class28.method3574(this.field919[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1057(var8);
        } catch (RuntimeException var27) {
            throw class156.method1078(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class31.method2135(var8, var8.length) + "," + class31.method2135(var8, var8.length - 2) + "," + this.field913[arg0] + "," + this.field922);
        }
        if (this.field917) {
            this.field919[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class31 var15 = new class31(var10);
            int[] var16 = new int[var3];
            var15.field172 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method376();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field172 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method376();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field909) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class28.method859(var20[var26], false);
                }
            }
        } else if (this.field909) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class28.method859(var10, false);
        }
        return true;
    }

    @ObfuscatedName("eg.v(Ljava/lang/String;I)I")
    public int method1098(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field912.method49(class99.method851(var2));
    }

    @ObfuscatedName("eg.c(ILjava/lang/String;I)I")
    public int method1099(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field923[arg0].method49(class99.method851(var3));
    }

    @ObfuscatedName("eg.y(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method1101(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field912.method49(class99.method851(var3));
        int var6 = this.field923[var5].method49(class99.method851(var4));
        return this.method1085(var5, var6);
    }

    @ObfuscatedName("eg.b(Ljava/lang/String;I)V")
    public void method1102(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field912.method49(class99.method851(var2));
        if (var3 >= 0) {
            this.method1125(var3);
        }
    }

    public class81(boolean arg0, boolean arg1) {
        this.field917 = arg0;
        this.field909 = arg1;
    }

    @ObfuscatedName("eg.u(Ljava/lang/String;Ljava/lang/String;S)[B")
    public byte[] method1106(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field912.method49(class99.method851(var3));
        int var6 = this.field923[var5].method49(class99.method851(var4));
        return this.method1083(var5, var6);
    }

    @ObfuscatedName("eg.z(II)[I")
    public int[] method1113(int arg0) {
        return this.field916[arg0];
    }

    @ObfuscatedName("eg.f(IB)[B")
    public byte[] method1115(int arg0) {
        if (this.field920.length == 1) {
            return this.method1145(0, arg0);
        } else if (this.field920[arg0].length == 1) {
            return this.method1145(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eg.t(II[II)[B")
    public byte[] method1124(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field920.length || this.field920[arg0] == null || arg1 < 0 || arg1 >= this.field920[arg0].length) {
            return null;
        }
        if (this.field920[arg0][arg1] == null) {
            boolean var4 = this.method1097(arg0, arg2);
            if (!var4) {
                this.method1091(arg0);
                boolean var5 = this.method1097(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class28.method3574(this.field920[arg0][arg1], false);
        if (this.field909) {
            this.field920[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("eg.p(IB)V")
    public void method1125(int arg0) {
    }

    @ObfuscatedName("eg.i(IB)V")
    public void method1140(int arg0) {
        for (int var2 = 0; var2 < this.field920[arg0].length; var2++) {
            this.field920[arg0][var2] = null;
        }
    }

    @ObfuscatedName("eg.e(III)[B")
    public byte[] method1145(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field920.length || this.field920[arg0] == null || arg1 < 0 || arg1 >= this.field920[arg0].length) {
            return null;
        }
        if (this.field920[arg0][arg1] == null) {
            boolean var3 = this.method1097(arg0, (int[]) null);
            if (!var3) {
                this.method1091(arg0);
                boolean var4 = this.method1097(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class28.method3574(this.field920[arg0][arg1], false);
    }

    @ObfuscatedName("eg.g(IB)[B")
    public byte[] method1151(int arg0) {
        if (this.field920.length == 1) {
            return this.method1083(0, arg0);
        } else if (this.field920[arg0].length == 1) {
            return this.method1083(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("i.k([BB)[B")
    public static final byte[] method1057(byte[] arg0) {
        class31 var1 = new class31(arg0);
        int var2 = var1.method512();
        int var3 = var1.method376();
        if (var3 < 0 || !(field925 == 0 || var3 <= field925)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method422(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method376();
            if (var5 < 0 || field925 != 0 && var5 > field925) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class133.method2246(var6, var5, arg0, var3, 9);
            } else {
                field921.method717(var1, var6);
            }
            return var6;
        }
    }
}
