package deob;

@ObfuscatedName("ek")
public abstract class class89 {

    @ObfuscatedName("ek.f")
    public int[][] field1274;

    @ObfuscatedName("ek.g")
    public Object[][] field1267;

    @ObfuscatedName("ek.d")
    public int[] field1261;

    @ObfuscatedName("ek.e")
    public int field1269;

    @ObfuscatedName("ek.b")
    public int field1265;

    @ObfuscatedName("ek.o")
    public static class46 field1262 = new class46();

    @ObfuscatedName("ek.l")
    public int[] field1257;

    @ObfuscatedName("ek.j")
    public class14[] field1270;

    @ObfuscatedName("ek.k")
    public int[] field1258;

    @ObfuscatedName("ek.h")
    public int[] field1259;

    @ObfuscatedName("ek.i")
    public static int field1272 = 0;

    @ObfuscatedName("ek.w")
    public class14 field1263;

    @ObfuscatedName("ek.t")
    public int[] field1260;

    @ObfuscatedName("ek.s")
    public int[][] field1264;

    @ObfuscatedName("ek.q")
    public boolean field1268;

    @ObfuscatedName("ek.z")
    public boolean field1271;

    @ObfuscatedName("ek.x")
    public Object[] field1266;

    public class89(boolean arg0, boolean arg1) {
        this.field1268 = arg0;
        this.field1271 = arg1;
    }

    @ObfuscatedName("ek.b([BI)V")
    public void method1265(byte[] arg0) {
        this.field1269 = class50.method2517(arg0, arg0.length);
        class50 var2 = new class50(method1166(arg0));
        int var3 = var2.method726();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method685();
        }
        int var4 = var2.method726();
        if (var3 >= 7) {
            this.field1265 = var2.method694();
        } else {
            this.field1265 = var2.method720();
        }
        int var5 = 0;
        int var6 = -1;
        this.field1259 = new int[this.field1265];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field1265; var7++) {
                this.field1259[var7] = var5 += var2.method694();
                if (this.field1259[var7] > var6) {
                    var6 = this.field1259[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field1265; var8++) {
                this.field1259[var8] = var5 += var2.method720();
                if (this.field1259[var8] > var6) {
                    var6 = this.field1259[var8];
                }
            }
        }
        this.field1260 = new int[var6 + 1];
        this.field1261 = new int[var6 + 1];
        this.field1257 = new int[var6 + 1];
        this.field1274 = new int[var6 + 1][];
        this.field1266 = new Object[var6 + 1];
        this.field1267 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field1258 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field1265; var9++) {
                this.field1258[this.field1259[var9]] = var2.method685();
            }
            this.field1263 = new class14(this.field1258);
        }
        for (int var10 = 0; var10 < this.field1265; var10++) {
            this.field1260[this.field1259[var10]] = var2.method685();
        }
        for (int var11 = 0; var11 < this.field1265; var11++) {
            this.field1261[this.field1259[var11]] = var2.method685();
        }
        for (int var12 = 0; var12 < this.field1265; var12++) {
            this.field1257[this.field1259[var12]] = var2.method720();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field1265; var13++) {
                int var14 = this.field1259[var13];
                int var15 = this.field1257[var14];
                int var16 = 0;
                int var17 = -1;
                this.field1274[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field1274[var14][var18] = var16 += var2.method694();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field1267[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field1265; var20++) {
                int var21 = this.field1259[var20];
                int var22 = this.field1257[var21];
                int var23 = 0;
                int var24 = -1;
                this.field1274[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field1274[var21][var25] = var23 += var2.method720();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field1267[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field1264 = new int[var6 + 1][];
        this.field1270 = new class14[var6 + 1];
        for (int var27 = 0; var27 < this.field1265; var27++) {
            int var28 = this.field1259[var27];
            int var29 = this.field1257[var28];
            this.field1264[var28] = new int[this.field1267[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field1264[var28][this.field1274[var28][var30]] = var2.method685();
            }
            this.field1270[var28] = new class14(this.field1264[var28]);
        }
    }

    @ObfuscatedName("ek.h(IB)V")
    public void method489(int arg0) {
    }

    @ObfuscatedName("ek.k(III)[B")
    public byte[] method1266(int arg0, int arg1) {
        return this.method1296(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ek.t(III)Z")
    public boolean method1268(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field1267.length || this.field1267[arg0] == null || arg1 < 0 || arg1 >= this.field1267[arg0].length) {
            return false;
        } else if (this.field1267[arg0][arg1] != null) {
            return true;
        } else if (this.field1266[arg0] == null) {
            this.method490(arg0);
            return this.field1266[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ek.l(I)Z")
    public boolean method1270() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1259.length; var2++) {
            int var3 = this.field1259[var2];
            if (this.field1266[var3] == null) {
                this.method490(var3);
                if (this.field1266[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ek.f(II)[B")
    public byte[] method1271(int arg0) {
        if (this.field1267.length == 1) {
            return this.method1266(0, arg0);
        } else if (this.field1267[arg0].length == 1) {
            return this.method1266(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ek.s(III)[B")
    public byte[] method1272(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field1267.length || this.field1267[arg0] == null || arg1 < 0 || arg1 >= this.field1267[arg0].length) {
            return null;
        }
        if (this.field1267[arg0][arg1] == null) {
            boolean var3 = this.method1280(arg0, (int[]) null);
            if (!var3) {
                this.method490(arg0);
                boolean var4 = this.method1280(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return Statics.method2949(this.field1267[arg0][arg1], false);
    }

    @ObfuscatedName("ek.j(IS)[B")
    public byte[] method1273(int arg0) {
        if (this.field1267.length == 1) {
            return this.method1272(0, arg0);
        } else if (this.field1267[arg0].length == 1) {
            return this.method1272(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ek.a(Ljava/lang/String;B)V")
    public void method1274(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field1263.method190(class91.method1120(var2));
        if (var3 >= 0) {
            this.method489(var3);
        }
    }

    @ObfuscatedName("ek.g(II)[I")
    public int[] method1275(int arg0) {
        return this.field1274[arg0];
    }

    @ObfuscatedName("ek.o(IB)I")
    public int method1276(int arg0) {
        return this.field1267[arg0].length;
    }

    @ObfuscatedName("ek.e(I)I")
    public int method1277() {
        return this.field1267.length;
    }

    @ObfuscatedName("ek.q(IB)V")
    public void method1278(int arg0) {
        for (int var2 = 0; var2 < this.field1267[arg0].length; var2++) {
            this.field1267[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ek.i(I[IB)Z")
    public boolean method1280(int arg0, int[] arg1) {
        if (this.field1266[arg0] == null) {
            return false;
        }
        int var3 = this.field1257[arg0];
        int[] var4 = this.field1274[arg0];
        Object[] var5 = this.field1267[arg0];
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
            var8 = Statics.method2949(this.field1266[arg0], true);
            class50 var9 = new class50(var8);
            var9.method697(arg1, 5, var9.field541.length);
        } else {
            var8 = Statics.method2949(this.field1266[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1166(var8);
        } catch (RuntimeException var27) {
            throw Statics.method2942(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class50.method2517(var8, var8.length) + "," + class50.method2517(var8, var8.length - 2) + "," + this.field1260[arg0] + "," + this.field1269);
        }
        if (this.field1268) {
            this.field1266[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class50 var15 = new class50(var10);
            int[] var16 = new int[var3];
            var15.field540 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method685();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field540 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method685();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field1271) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class51.method2870(var20[var26], false);
                }
            }
        } else if (this.field1271) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class51.method2870(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ek.n(ILjava/lang/String;B)I")
    public int method1282(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field1270[arg0].method190(class91.method1120(var3));
    }

    @ObfuscatedName("ek.r(Ljava/lang/String;I)I")
    public int method1283(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field1263.method190(class91.method1120(var2));
    }

    @ObfuscatedName("ek.y(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method1284(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field1263.method190(class91.method1120(var3));
        int var6 = this.field1270[var5].method190(class91.method1120(var4));
        return this.method1268(var5, var6);
    }

    @ObfuscatedName("ek.u(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method1288(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field1263.method190(class91.method1120(var3));
        int var6 = this.field1270[var5].method190(class91.method1120(var4));
        return this.method1266(var5, var6);
    }

    @ObfuscatedName("ek.z(I)V")
    public void method1291() {
        for (int var1 = 0; var1 < this.field1267.length; var1++) {
            if (this.field1267[var1] != null) {
                for (int var2 = 0; var2 < this.field1267[var1].length; var2++) {
                    this.field1267[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ek.w(II[II)[B")
    public byte[] method1296(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field1267.length || this.field1267[arg0] == null || arg1 < 0 || arg1 >= this.field1267[arg0].length) {
            return null;
        }
        if (this.field1267[arg0][arg1] == null) {
            boolean var4 = this.method1280(arg0, arg2);
            if (!var4) {
                this.method490(arg0);
                boolean var5 = this.method1280(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = Statics.method2949(this.field1267[arg0][arg1], false);
        if (this.field1271) {
            this.field1267[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ek.x(II)V")
    public void method490(int arg0) {
    }

    @ObfuscatedName("ek.d(IB)Z")
    public boolean method1318(int arg0) {
        if (this.field1266[arg0] == null) {
            this.method490(arg0);
            return this.field1266[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("j.p([BB)[B")
    public static final byte[] method1166(byte[] arg0) {
        class50 var1 = new class50(arg0);
        int var2 = var1.method726();
        int var3 = var1.method685();
        if (var3 < 0 || !(field1272 == 0 || var3 <= field1272)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method691(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method685();
            if (var5 < 0 || field1272 != 0 && var5 > field1272) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class42.method580(var6, var5, arg0, var3, 9);
            } else {
                field1262.method605(var1, var6);
            }
            return var6;
        }
    }
}
