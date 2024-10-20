package deob;

@ObfuscatedName("cv")
public abstract class class87 {

    @ObfuscatedName("cv.q")
    public int field1185;

    @ObfuscatedName("cv.l")
    public int[] field1171;

    @ObfuscatedName("cv.a")
    public int[] field1172;

    @ObfuscatedName("cv.o")
    public class100 field1177;

    @ObfuscatedName("cv.c")
    public int[] field1174;

    @ObfuscatedName("cv.h")
    public int[] field1175;

    @ObfuscatedName("cv.r")
    public int[] field1176;

    @ObfuscatedName("cv.d")
    public int[][] field1179;

    @ObfuscatedName("cv.k")
    public int[][] field1178;

    @ObfuscatedName("cv.u")
    public class100[] field1173;

    @ObfuscatedName("cv.v")
    public Object[] field1180;

    @ObfuscatedName("cv.f")
    public Object[][] field1181;

    @ObfuscatedName("cv.s")
    public static class65 field1183 = new class65();

    @ObfuscatedName("cv.j")
    public int field1170;

    @ObfuscatedName("cv.e")
    public boolean field1184;

    @ObfuscatedName("cv.t")
    public boolean field1188;

    @ObfuscatedName("cv.y")
    public static int field1186 = 0;

    public class87(boolean arg0, boolean arg1) {
        this.field1184 = arg0;
        this.field1188 = arg1;
    }

    @ObfuscatedName("cv.q([BI)V")
    public void method1018(byte[] arg0) {
        this.field1170 = class136.method1584(arg0, arg0.length);
        class136 var2 = new class136(method1007(arg0));
        int var3 = var2.method1602();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method1607();
        }
        int var4 = var2.method1602();
        if (var3 >= 7) {
            this.field1185 = var2.method1616();
        } else {
            this.field1185 = var2.method1712();
        }
        int var5 = 0;
        int var6 = -1;
        this.field1171 = new int[this.field1185];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field1185; var7++) {
                this.field1171[var7] = var5 += var2.method1616();
                if (this.field1171[var7] > var6) {
                    var6 = this.field1171[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field1185; var8++) {
                this.field1171[var8] = var5 += var2.method1712();
                if (this.field1171[var8] > var6) {
                    var6 = this.field1171[var8];
                }
            }
        }
        this.field1174 = new int[var6 + 1];
        this.field1175 = new int[var6 + 1];
        this.field1176 = new int[var6 + 1];
        this.field1179 = new int[var6 + 1][];
        this.field1180 = new Object[var6 + 1];
        this.field1181 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field1172 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field1185; var9++) {
                this.field1172[this.field1171[var9]] = var2.method1607();
            }
            this.field1177 = new class100(this.field1172);
        }
        for (int var10 = 0; var10 < this.field1185; var10++) {
            this.field1174[this.field1171[var10]] = var2.method1607();
        }
        for (int var11 = 0; var11 < this.field1185; var11++) {
            this.field1175[this.field1171[var11]] = var2.method1607();
        }
        for (int var12 = 0; var12 < this.field1185; var12++) {
            this.field1176[this.field1171[var12]] = var2.method1712();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field1185; var13++) {
                int var14 = this.field1171[var13];
                int var15 = this.field1176[var14];
                int var16 = 0;
                int var17 = -1;
                this.field1179[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field1179[var14][var18] = var16 += var2.method1616();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field1181[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field1185; var20++) {
                int var21 = this.field1171[var20];
                int var22 = this.field1176[var21];
                int var23 = 0;
                int var24 = -1;
                this.field1179[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field1179[var21][var25] = var23 += var2.method1712();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field1181[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field1178 = new int[var6 + 1][];
        this.field1173 = new class100[var6 + 1];
        for (int var27 = 0; var27 < this.field1185; var27++) {
            int var28 = this.field1171[var27];
            int var29 = this.field1176[var28];
            this.field1178[var28] = new int[this.field1181[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field1178[var28][this.field1179[var28][var30]] = var2.method1607();
            }
            this.field1173[var28] = new class100(this.field1178[var28]);
        }
    }

    @ObfuscatedName("cv.l(IB)V")
    public void method1068(int arg0) {
    }

    @ObfuscatedName("cv.a(III)[B")
    public byte[] method1024(int arg0, int arg1) {
        return this.method1021(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("cv.o(II[II)[B")
    public byte[] method1021(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field1181.length || this.field1181[arg0] == null || arg1 < 0 || arg1 >= this.field1181[arg0].length) {
            return null;
        }
        if (this.field1181[arg0][arg1] == null) {
            boolean var4 = this.method1033(arg0, arg2);
            if (!var4) {
                this.method1080(arg0);
                boolean var5 = this.method1033(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class62.method695(this.field1181[arg0][arg1], false);
        if (this.field1188) {
            this.field1181[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("cv.c(III)Z")
    public boolean method1020(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field1181.length || this.field1181[arg0] == null || arg1 < 0 || arg1 >= this.field1181[arg0].length) {
            return false;
        } else if (this.field1181[arg0][arg1] != null) {
            return true;
        } else if (this.field1180[arg0] == null) {
            this.method1080(arg0);
            return this.field1180[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("cv.h(II)Z")
    public boolean method1023(int arg0) {
        if (this.field1180[arg0] == null) {
            this.method1080(arg0);
            return this.field1180[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("cv.r(I)Z")
    public boolean method1022() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1171.length; var2++) {
            int var3 = this.field1171[var2];
            if (this.field1180[var3] == null) {
                this.method1080(var3);
                if (this.field1180[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("cv.d(IB)[B")
    public byte[] method1078(int arg0) {
        if (this.field1181.length == 1) {
            return this.method1024(0, arg0);
        } else if (this.field1181[arg0].length == 1) {
            return this.method1024(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cv.k(IIB)[B")
    public byte[] method1026(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field1181.length || this.field1181[arg0] == null || arg1 < 0 || arg1 >= this.field1181[arg0].length) {
            return null;
        }
        if (this.field1181[arg0][arg1] == null) {
            boolean var3 = this.method1033(arg0, (int[]) null);
            if (!var3) {
                this.method1080(arg0);
                boolean var4 = this.method1033(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class62.method695(this.field1181[arg0][arg1], false);
    }

    @ObfuscatedName("cv.u(IB)[B")
    public byte[] method1027(int arg0) {
        if (this.field1181.length == 1) {
            return this.method1026(0, arg0);
        } else if (this.field1181[arg0].length == 1) {
            return this.method1026(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cv.v(II)V")
    public void method1080(int arg0) {
    }

    @ObfuscatedName("cv.f(IB)[I")
    public int[] method1084(int arg0) {
        return this.field1179[arg0];
    }

    @ObfuscatedName("cv.s(IB)I")
    public int method1028(int arg0) {
        return this.field1181[arg0].length;
    }

    @ObfuscatedName("cv.j(I)I")
    public int method1030() {
        return this.field1181.length;
    }

    @ObfuscatedName("cv.e(II)V")
    public void method1031(int arg0) {
        for (int var2 = 0; var2 < this.field1181[arg0].length; var2++) {
            this.field1181[arg0][var2] = null;
        }
    }

    @ObfuscatedName("cv.t(I)V")
    public void method1032() {
        for (int var1 = 0; var1 < this.field1181.length; var1++) {
            if (this.field1181[var1] != null) {
                for (int var2 = 0; var2 < this.field1181[var1].length; var2++) {
                    this.field1181[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("cv.y(I[II)Z")
    public boolean method1033(int arg0, int[] arg1) {
        if (this.field1180[arg0] == null) {
            return false;
        }
        int var3 = this.field1176[arg0];
        int[] var4 = this.field1179[arg0];
        Object[] var5 = this.field1181[arg0];
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
            var8 = class62.method695(this.field1180[arg0], true);
            class136 var9 = new class136(var8);
            var9.method1715(arg1, 5, var9.field1725.length);
        } else {
            var8 = class62.method695(this.field1180[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1007(var8);
        } catch (RuntimeException var27) {
            throw class170.method2572(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class136.method1584(var8, var8.length) + "," + class136.method1584(var8, var8.length - 2) + "," + this.field1174[arg0] + "," + this.field1170);
        }
        if (this.field1184) {
            this.field1180[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class136 var15 = new class136(var10);
            int[] var16 = new int[var3];
            var15.field1722 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method1607();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1722 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method1607();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field1188) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class62.method698(var20[var26], false);
                }
            }
        } else if (this.field1188) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class62.method698(var10, false);
        }
        return true;
    }

    @ObfuscatedName("cv.b(Ljava/lang/String;B)I")
    public int method1034(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field1177.method1233(class83.method365(var2));
    }

    @ObfuscatedName("cv.w(ILjava/lang/String;I)I")
    public int method1035(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field1173[arg0].method1233(class83.method365(var3));
    }

    @ObfuscatedName("cv.g(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method1083(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field1177.method1233(class83.method365(var3));
        int var6 = this.field1173[var5].method1233(class83.method365(var4));
        return this.method1024(var5, var6);
    }

    @ObfuscatedName("cv.p(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method1037(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field1177.method1233(class83.method365(var3));
        int var6 = this.field1173[var5].method1233(class83.method365(var4));
        return this.method1020(var5, var6);
    }

    @ObfuscatedName("cv.z(Ljava/lang/String;I)V")
    public void method1038(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field1177.method1233(class83.method365(var2));
        if (var3 >= 0) {
            this.method1068(var3);
        }
    }

    @ObfuscatedName("cq.n([BB)[B")
    public static final byte[] method1007(byte[] arg0) {
        class136 var1 = new class136(arg0);
        int var2 = var1.method1602();
        int var3 = var1.method1607();
        if (var3 < 0 || !(field1186 == 0 || var3 <= field1186)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method1626(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method1607();
            if (var5 < 0 || field1186 != 0 && var5 > field1186) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class66.method808(var6, var5, arg0, var3, 9);
            } else {
                field1183.method801(var1, var6);
            }
            return var6;
        }
    }
}
