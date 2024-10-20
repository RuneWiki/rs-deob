package deob;

@ObfuscatedName("el")
public abstract class class87 {

    @ObfuscatedName("el.g")
    public class8[] field1243;

    @ObfuscatedName("el.d")
    public int[][] field1241;

    @ObfuscatedName("el.e")
    public boolean field1248;

    @ObfuscatedName("el.b")
    public int[] field1256;

    @ObfuscatedName("el.c")
    public int[] field1235;

    @ObfuscatedName("el.a")
    public Object[][] field1245;

    @ObfuscatedName("el.o")
    public static int field1250 = 0;

    @ObfuscatedName("el.m")
    public int[] field1238;

    @ObfuscatedName("el.j")
    public int[][] field1246;

    @ObfuscatedName("el.k")
    public int field1244;

    @ObfuscatedName("el.i")
    public class8 field1252;

    @ObfuscatedName("el.v")
    public int field1239;

    @ObfuscatedName("el.u")
    public static class27 field1240 = new class27();

    @ObfuscatedName("el.p")
    public boolean field1247;

    @ObfuscatedName("el.z")
    public int[] field1234;

    @ObfuscatedName("el.y")
    public Object[] field1236;

    @ObfuscatedName("el.x")
    public int[] field1237;

    @ObfuscatedName("el.v([BI)V")
    public void method1297(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class28.method673(arg0, 0, var2);
        this.field1244 = var3;
        class28 var4 = new class28(method1403(arg0));
        int var5 = var4.method450();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method504();
        }
        int var6 = var4.method450();
        if (var5 >= 7) {
            this.field1239 = var4.method326();
        } else {
            this.field1239 = var4.method349();
        }
        int var7 = 0;
        int var8 = -1;
        this.field1235 = new int[this.field1239];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field1239; var9++) {
                this.field1235[var9] = var7 += var4.method326();
                if (this.field1235[var9] > var8) {
                    var8 = this.field1235[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field1239; var10++) {
                this.field1235[var10] = var7 += var4.method349();
                if (this.field1235[var10] > var8) {
                    var8 = this.field1235[var10];
                }
            }
        }
        this.field1238 = new int[var8 + 1];
        this.field1234 = new int[var8 + 1];
        this.field1237 = new int[var8 + 1];
        this.field1241 = new int[var8 + 1][];
        this.field1236 = new Object[var8 + 1];
        this.field1245 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field1256 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field1239; var11++) {
                this.field1256[this.field1235[var11]] = var4.method504();
            }
            this.field1252 = new class8(this.field1256);
        }
        for (int var12 = 0; var12 < this.field1239; var12++) {
            this.field1238[this.field1235[var12]] = var4.method504();
        }
        for (int var13 = 0; var13 < this.field1239; var13++) {
            this.field1234[this.field1235[var13]] = var4.method504();
        }
        for (int var14 = 0; var14 < this.field1239; var14++) {
            this.field1237[this.field1235[var14]] = var4.method349();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field1239; var15++) {
                int var16 = this.field1235[var15];
                int var17 = this.field1237[var16];
                int var18 = 0;
                int var19 = -1;
                this.field1241[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field1241[var16][var20] = var18 += var4.method326();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field1245[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field1239; var22++) {
                int var23 = this.field1235[var22];
                int var24 = this.field1237[var23];
                int var25 = 0;
                int var26 = -1;
                this.field1241[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field1241[var23][var27] = var25 += var4.method349();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field1245[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field1246 = new int[var8 + 1][];
        this.field1243 = new class8[var8 + 1];
        for (int var29 = 0; var29 < this.field1239; var29++) {
            int var30 = this.field1235[var29];
            int var31 = this.field1237[var30];
            this.field1246[var30] = new int[this.field1245[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field1246[var30][this.field1241[var30][var32]] = var4.method504();
            }
            this.field1243[var30] = new class8(this.field1246[var30]);
        }
    }

    @ObfuscatedName("el.c(II)V")
    public void method1226(int arg0) {
    }

    @ObfuscatedName("el.b(III)[B")
    public byte[] method1298(int arg0, int arg1) {
        return this.method1299(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("el.i(II[II)[B")
    public byte[] method1299(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field1245.length || this.field1245[arg0] == null || arg1 < 0 || arg1 >= this.field1245[arg0].length) {
            return null;
        }
        if (this.field1245[arg0][arg1] == null) {
            boolean var4 = this.method1309(arg0, arg2);
            if (!var4) {
                this.method1229(arg0);
                boolean var5 = this.method1309(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class50.method1894(this.field1245[arg0][arg1], false);
        if (this.field1247) {
            this.field1245[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("el.m(III)Z")
    public boolean method1300(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field1245.length || this.field1245[arg0] == null || arg1 < 0 || arg1 >= this.field1245[arg0].length) {
            return false;
        } else if (this.field1245[arg0][arg1] != null) {
            return true;
        } else if (this.field1236[arg0] == null) {
            this.method1229(arg0);
            return this.field1236[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("el.z(II)Z")
    public boolean method1301(int arg0) {
        if (this.field1236[arg0] == null) {
            this.method1229(arg0);
            return this.field1236[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("el.x(I)Z")
    public boolean method1302() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1235.length; var2++) {
            int var3 = this.field1235[var2];
            if (this.field1236[var3] == null) {
                this.method1229(var3);
                if (this.field1236[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("el.j(IIB)[B")
    public byte[] method1304(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field1245.length || this.field1245[arg0] == null || arg1 < 0 || arg1 >= this.field1245[arg0].length) {
            return null;
        }
        if (this.field1245[arg0][arg1] == null) {
            boolean var3 = this.method1309(arg0, (int[]) null);
            if (!var3) {
                this.method1229(arg0);
                boolean var4 = this.method1309(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class50.method1894(this.field1245[arg0][arg1], false);
    }

    @ObfuscatedName("el.y(II)V")
    public void method1229(int arg0) {
    }

    @ObfuscatedName("el.k(I)I")
    public int method1307() {
        return this.field1245.length;
    }

    @ObfuscatedName("el.o(I[IS)Z")
    public boolean method1309(int arg0, int[] arg1) {
        if (this.field1236[arg0] == null) {
            return false;
        }
        int var3 = this.field1237[arg0];
        int[] var4 = this.field1241[arg0];
        Object[] var5 = this.field1245[arg0];
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
            var8 = class50.method1894(this.field1236[arg0], true);
            class28 var9 = new class28(var8);
            var9.method329(arg1, 5, var9.field306.length);
        } else {
            var8 = class50.method1894(this.field1236[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1403(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class28.method673(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class28.method673(var8, 0, var17);
            throw class136.method3247(var34, var16 + var18 + "," + this.field1238[arg0] + "," + this.field1244);
        }
        if (this.field1248) {
            this.field1236[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class28 var22 = new class28(var10);
            int[] var23 = new int[var3];
            var22.field303 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method504();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field303 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method504();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field1247) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class50.method1082(var27[var33], false);
                }
            }
        } else if (this.field1247) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class50.method1082(var10, false);
        }
        return true;
    }

    @ObfuscatedName("el.s(Ljava/lang/String;I)I")
    public int method1310(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field1252.method55(class97.method2037(var2));
    }

    @ObfuscatedName("el.f(ILjava/lang/String;I)I")
    public int method1311(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field1243[arg0].method55(class97.method2037(var3));
    }

    @ObfuscatedName("el.h(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method1312(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field1252.method55(class97.method2037(var3));
        int var6 = this.field1243[var5].method55(class97.method2037(var4));
        return this.method1298(var5, var6);
    }

    @ObfuscatedName("el.d(II)[B")
    public byte[] method1313(int arg0) {
        if (this.field1245.length == 1) {
            return this.method1298(0, arg0);
        } else if (this.field1245[arg0].length == 1) {
            return this.method1298(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("el.w(Ljava/lang/String;I)V")
    public void method1314(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field1252.method55(class97.method2037(var2));
        if (var3 >= 0) {
            this.method1226(var3);
        }
    }

    @ObfuscatedName("el.t(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method1318(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field1252.method55(class97.method2037(var3));
        int var6 = this.field1243[var5].method55(class97.method2037(var4));
        return this.method1300(var5, var6);
    }

    @ObfuscatedName("el.p(S)V")
    public void method1322() {
        for (int var1 = 0; var1 < this.field1245.length; var1++) {
            if (this.field1245[var1] != null) {
                for (int var2 = 0; var2 < this.field1245[var1].length; var2++) {
                    this.field1245[var1][var2] = null;
                }
            }
        }
    }

    public class87(boolean arg0, boolean arg1) {
        this.field1248 = arg0;
        this.field1247 = arg1;
    }

    @ObfuscatedName("el.a(IS)[I")
    public int[] method1335(int arg0) {
        return this.field1241[arg0];
    }

    @ObfuscatedName("el.g(II)[B")
    public byte[] method1337(int arg0) {
        if (this.field1245.length == 1) {
            return this.method1304(0, arg0);
        } else if (this.field1245[arg0].length == 1) {
            return this.method1304(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("el.e(II)V")
    public void method1338(int arg0) {
        for (int var2 = 0; var2 < this.field1245[arg0].length; var2++) {
            this.field1245[arg0][var2] = null;
        }
    }

    @ObfuscatedName("el.u(II)I")
    public int method1352(int arg0) {
        return this.field1245[arg0].length;
    }

    @ObfuscatedName("eo.r([BB)[B")
    public static final byte[] method1403(byte[] arg0) {
        class28 var1 = new class28(arg0);
        int var2 = var1.method450();
        int var3 = var1.method504();
        if (var3 < 0 || !(field1250 == 0 || var3 <= field1250)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method322(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method504();
            if (var5 < 0 || field1250 != 0 && var5 > field1250) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class30.method509(var6, var5, arg0, var3, 9);
            } else {
                field1240.method293(var1, var6);
            }
            return var6;
        }
    }
}
