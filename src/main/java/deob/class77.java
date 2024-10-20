package deob;

@ObfuscatedName("bh")
public class class77 extends class90 {

    @ObfuscatedName("bh.b")
    public int field1232 = 0;

    @ObfuscatedName("bh.l")
    public int[] field1207;

    @ObfuscatedName("bh.i")
    public int[] field1208;

    @ObfuscatedName("bh.t")
    public int[] field1209;

    @ObfuscatedName("bh.k")
    public int field1210 = 0;

    @ObfuscatedName("bh.h")
    public int[] field1242;

    @ObfuscatedName("bh.n")
    public int[] field1212;

    @ObfuscatedName("bh.f")
    public int[] field1213;

    @ObfuscatedName("bh.a")
    public byte[] field1214;

    @ObfuscatedName("bh.r")
    public byte[] field1215;

    @ObfuscatedName("bh.x")
    public byte[] field1220;

    @ObfuscatedName("bh.z")
    public byte[] field1240;

    @ObfuscatedName("bh.p")
    public short[] field1218;

    @ObfuscatedName("bh.s")
    public short[] field1219;

    @ObfuscatedName("bh.o")
    public byte field1211 = 0;

    @ObfuscatedName("bh.y")
    public int field1221;

    @ObfuscatedName("bh.w")
    public byte[] field1222;

    @ObfuscatedName("bh.m")
    public short[] field1244;

    @ObfuscatedName("bh.u")
    public short[] field1224;

    @ObfuscatedName("bh.q")
    public short[] field1247;

    @ObfuscatedName("bh.c")
    public short[] field1226;

    @ObfuscatedName("bh.v")
    public short[] field1227;

    @ObfuscatedName("bh.e")
    public short[] field1228;

    @ObfuscatedName("bh.j")
    public short[] field1250;

    @ObfuscatedName("bh.d")
    public short[] field1216;

    @ObfuscatedName("bh.g")
    public short[] field1231;

    @ObfuscatedName("bh.ap")
    public byte[] field1233;

    @ObfuscatedName("bh.aj")
    public int[] field1238;

    @ObfuscatedName("bh.ab")
    public int[] field1234;

    @ObfuscatedName("bh.af")
    public int[][] field1235;

    @ObfuscatedName("bh.aw")
    public int[][] field1236;

    @ObfuscatedName("bh.ac")
    public class92[] field1237;

    @ObfuscatedName("bh.an")
    public class84[] field1249;

    @ObfuscatedName("bh.ae")
    public class84[] field1239;

    @ObfuscatedName("bh.au")
    public short field1217;

    @ObfuscatedName("bh.am")
    public short field1241;

    @ObfuscatedName("bh.as")
    public boolean field1223 = false;

    @ObfuscatedName("bh.ay")
    public int field1243;

    @ObfuscatedName("bh.at")
    public int field1225;

    @ObfuscatedName("bh.ai")
    public int field1245;

    @ObfuscatedName("bh.aa")
    public int field1246;

    @ObfuscatedName("bh.ar")
    public int field1229;

    @ObfuscatedName("bh.ag")
    public static int[] field1248 = new int[10000];

    @ObfuscatedName("bh.ad")
    public static int[] field1230 = new int[10000];

    @ObfuscatedName("bh.al")
    public static int field1206 = 0;

    @ObfuscatedName("bh.ah")
    public static int[] field1251 = class85.field1436;

    @ObfuscatedName("bh.ak")
    public static int[] field1252 = class85.field1433;

    public class77() {
    }

    @ObfuscatedName("bh.b(Lgj;II)Lbh;")
    public static class77 method1486(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3226(arg1, arg2);
        return var3 == null ? null : new class77(var3);
    }

    public class77(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1446(arg0);
        } else {
            this.method1447(arg0);
        }
    }

    @ObfuscatedName("bh.l([B)V")
    public void method1446(byte[] arg0) {
        class154 var2 = new class154(arg0);
        class154 var3 = new class154(arg0);
        class154 var4 = new class154(arg0);
        class154 var5 = new class154(arg0);
        class154 var6 = new class154(arg0);
        class154 var7 = new class154(arg0);
        class154 var8 = new class154(arg0);
        var2.field2085 = arg0.length - 23;
        int var9 = var2.method2801();
        int var10 = var2.method2801();
        int var11 = var2.method2678();
        int var12 = var2.method2678();
        int var13 = var2.method2678();
        int var14 = var2.method2678();
        int var15 = var2.method2678();
        int var16 = var2.method2678();
        int var17 = var2.method2678();
        int var18 = var2.method2801();
        int var19 = var2.method2801();
        int var20 = var2.method2801();
        int var21 = var2.method2801();
        int var22 = var2.method2801();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1222 = new byte[var11];
            var2.field2085 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1222[var26] = var2.method2679();
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 * 2 + var56;
        int var60 = var24 + var58;
        int var62 = var24 * 2 + var25 * 2 + var60;
        this.field1232 = var9;
        this.field1210 = var10;
        this.field1221 = var11;
        this.field1207 = new int[var9];
        this.field1208 = new int[var9];
        this.field1209 = new int[var9];
        this.field1242 = new int[var10];
        this.field1212 = new int[var10];
        this.field1213 = new int[var10];
        if (var17 == 1) {
            this.field1238 = new int[var9];
        }
        if (var12 == 1) {
            this.field1214 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1215 = new byte[var10];
        } else {
            this.field1211 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1220 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1234 = new int[var10];
        }
        if (var16 == 1) {
            this.field1219 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1240 = new byte[var10];
        }
        this.field1218 = new short[var10];
        if (var11 > 0) {
            this.field1244 = new short[var11];
            this.field1224 = new short[var11];
            this.field1247 = new short[var11];
            if (var24 > 0) {
                this.field1226 = new short[var24];
                this.field1227 = new short[var24];
                this.field1228 = new short[var24];
                this.field1250 = new short[var24];
                this.field1233 = new byte[var24];
                this.field1216 = new short[var24];
            }
            if (var25 > 0) {
                this.field1231 = new short[var25];
            }
        }
        var2.field2085 = var11;
        var3.field2085 = var44;
        var4.field2085 = var46;
        var5.field2085 = var48;
        var6.field2085 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2678();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2690();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2690();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2690();
            }
            this.field1207[var67] = var64 + var69;
            this.field1208[var67] = var65 + var70;
            this.field1209[var67] = var66 + var71;
            var64 = this.field1207[var67];
            var65 = this.field1208[var67];
            var66 = this.field1209[var67];
            if (var17 == 1) {
                this.field1238[var67] = var6.method2678();
            }
        }
        var2.field2085 = var42;
        var3.field2085 = var31;
        var4.field2085 = var34;
        var5.field2085 = var37;
        var6.field2085 = var35;
        var7.field2085 = var40;
        var8.field2085 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1218[var72] = (short) var2.method2801();
            if (var12 == 1) {
                this.field1214[var72] = var3.method2679();
            }
            if (var13 == 255) {
                this.field1215[var72] = var4.method2679();
            }
            if (var14 == 1) {
                this.field1220[var72] = var5.method2679();
            }
            if (var15 == 1) {
                this.field1234[var72] = var6.method2678();
            }
            if (var16 == 1) {
                this.field1219[var72] = (short) (var7.method2801() - 1);
            }
            if (this.field1240 != null && this.field1219[var72] != -1) {
                this.field1240[var72] = (byte) (var8.method2678() - 1);
            }
        }
        var2.field2085 = var33;
        var3.field2085 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2678();
            if (var78 == 1) {
                var73 = var2.method2690() + var76;
                var74 = var2.method2690() + var73;
                var75 = var2.method2690() + var74;
                var76 = var75;
                this.field1242[var77] = var73;
                this.field1212[var77] = var74;
                this.field1213[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2690() + var76;
                var76 = var75;
                this.field1242[var77] = var73;
                this.field1212[var77] = var74;
                this.field1213[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2690() + var76;
                var76 = var75;
                this.field1242[var77] = var73;
                this.field1212[var77] = var74;
                this.field1213[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2690() + var76;
                var76 = var75;
                this.field1242[var77] = var73;
                this.field1212[var77] = var81;
                this.field1213[var77] = var75;
            }
        }
        var2.field2085 = var50;
        var3.field2085 = var52;
        var4.field2085 = var54;
        var5.field2085 = var56;
        var6.field2085 = var58;
        var7.field2085 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1222[var82] & 0xFF;
            if (var83 == 0) {
                this.field1244[var82] = (short) var2.method2801();
                this.field1224[var82] = (short) var2.method2801();
                this.field1247[var82] = (short) var2.method2801();
            }
            if (var83 == 1) {
                this.field1244[var82] = (short) var3.method2801();
                this.field1224[var82] = (short) var3.method2801();
                this.field1247[var82] = (short) var3.method2801();
                this.field1226[var82] = (short) var4.method2801();
                this.field1227[var82] = (short) var4.method2801();
                this.field1228[var82] = (short) var4.method2801();
                this.field1250[var82] = (short) var5.method2801();
                this.field1233[var82] = var6.method2679();
                this.field1216[var82] = (short) var7.method2801();
            }
            if (var83 == 2) {
                this.field1244[var82] = (short) var3.method2801();
                this.field1224[var82] = (short) var3.method2801();
                this.field1247[var82] = (short) var3.method2801();
                this.field1226[var82] = (short) var4.method2801();
                this.field1227[var82] = (short) var4.method2801();
                this.field1228[var82] = (short) var4.method2801();
                this.field1250[var82] = (short) var5.method2801();
                this.field1233[var82] = var6.method2679();
                this.field1216[var82] = (short) var7.method2801();
                this.field1231[var82] = (short) var7.method2801();
            }
            if (var83 == 3) {
                this.field1244[var82] = (short) var3.method2801();
                this.field1224[var82] = (short) var3.method2801();
                this.field1247[var82] = (short) var3.method2801();
                this.field1226[var82] = (short) var4.method2801();
                this.field1227[var82] = (short) var4.method2801();
                this.field1228[var82] = (short) var4.method2801();
                this.field1250[var82] = (short) var5.method2801();
                this.field1233[var82] = var6.method2679();
                this.field1216[var82] = (short) var7.method2801();
            }
        }
        var2.field2085 = var62;
        int var84 = var2.method2678();
        if (var84 == 0) {
            return;
        }
        new class89();
        var2.method2801();
        var2.method2801();
        var2.method2801();
        var2.method2683();
    }

    @ObfuscatedName("bh.t([B)V")
    public void method1447(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class154 var4 = new class154(arg0);
        class154 var5 = new class154(arg0);
        class154 var6 = new class154(arg0);
        class154 var7 = new class154(arg0);
        class154 var8 = new class154(arg0);
        var4.field2085 = arg0.length - 18;
        int var9 = var4.method2801();
        int var10 = var4.method2801();
        int var11 = var4.method2678();
        int var12 = var4.method2678();
        int var13 = var4.method2678();
        int var14 = var4.method2678();
        int var15 = var4.method2678();
        int var16 = var4.method2678();
        int var17 = var4.method2801();
        int var18 = var4.method2801();
        int var19 = var4.method2801();
        int var20 = var4.method2801();
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field1232 = var9;
        this.field1210 = var10;
        this.field1221 = var11;
        this.field1207 = new int[var9];
        this.field1208 = new int[var9];
        this.field1209 = new int[var9];
        this.field1242 = new int[var10];
        this.field1212 = new int[var10];
        this.field1213 = new int[var10];
        if (var11 > 0) {
            this.field1222 = new byte[var11];
            this.field1244 = new short[var11];
            this.field1224 = new short[var11];
            this.field1247 = new short[var11];
        }
        if (var16 == 1) {
            this.field1238 = new int[var9];
        }
        if (var12 == 1) {
            this.field1214 = new byte[var10];
            this.field1240 = new byte[var10];
            this.field1219 = new short[var10];
        }
        if (var13 == 255) {
            this.field1215 = new byte[var10];
        } else {
            this.field1211 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1220 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1234 = new int[var10];
        }
        this.field1218 = new short[var10];
        var4.field2085 = var21;
        var5.field2085 = var36;
        var6.field2085 = var38;
        var7.field2085 = var40;
        var8.field2085 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2678();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2690();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2690();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2690();
            }
            this.field1207[var46] = var43 + var48;
            this.field1208[var46] = var44 + var49;
            this.field1209[var46] = var45 + var50;
            var43 = this.field1207[var46];
            var44 = this.field1208[var46];
            var45 = this.field1209[var46];
            if (var16 == 1) {
                this.field1238[var46] = var8.method2678();
            }
        }
        var4.field2085 = var32;
        var5.field2085 = var28;
        var6.field2085 = var26;
        var7.field2085 = var30;
        var8.field2085 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1218[var51] = (short) var4.method2801();
            if (var12 == 1) {
                int var52 = var5.method2678();
                if ((var52 & 0x1) == 1) {
                    this.field1214[var51] = 1;
                    var2 = true;
                } else {
                    this.field1214[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1240[var51] = (byte) (var52 >> 2);
                    this.field1219[var51] = this.field1218[var51];
                    this.field1218[var51] = 127;
                    if (this.field1219[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1240[var51] = -1;
                    this.field1219[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1215[var51] = var6.method2679();
            }
            if (var14 == 1) {
                this.field1220[var51] = var7.method2679();
            }
            if (var15 == 1) {
                this.field1234[var51] = var8.method2678();
            }
        }
        var4.field2085 = var25;
        var5.field2085 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2678();
            if (var58 == 1) {
                var53 = var4.method2690() + var56;
                var54 = var4.method2690() + var53;
                var55 = var4.method2690() + var54;
                var56 = var55;
                this.field1242[var57] = var53;
                this.field1212[var57] = var54;
                this.field1213[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2690() + var56;
                var56 = var55;
                this.field1242[var57] = var53;
                this.field1212[var57] = var54;
                this.field1213[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2690() + var56;
                var56 = var55;
                this.field1242[var57] = var53;
                this.field1212[var57] = var54;
                this.field1213[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2690() + var56;
                var56 = var55;
                this.field1242[var57] = var53;
                this.field1212[var57] = var61;
                this.field1213[var57] = var55;
            }
        }
        var4.field2085 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1222[var62] = 0;
            this.field1244[var62] = (short) var4.method2801();
            this.field1224[var62] = (short) var4.method2801();
            this.field1247[var62] = (short) var4.method2801();
        }
        if (this.field1240 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1240[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1244[var65] & 0xFFFF) == this.field1242[var64] && (this.field1224[var65] & 0xFFFF) == this.field1212[var64] && (this.field1247[var65] & 0xFFFF) == this.field1213[var64]) {
                        this.field1240[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1240 = null;
            }
        }
        if (!var3) {
            this.field1219 = null;
        }
        if (!var2) {
            this.field1214 = null;
        }
    }

    public class77(class77[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1232 = 0;
        this.field1210 = 0;
        this.field1221 = 0;
        this.field1211 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class77 var10 = arg0[var9];
            if (var10 != null) {
                this.field1232 += var10.field1232;
                this.field1210 += var10.field1210;
                this.field1221 += var10.field1221;
                if (var10.field1215 == null) {
                    if (this.field1211 == -1) {
                        this.field1211 = var10.field1211;
                    }
                    if (this.field1211 != var10.field1211) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1214 != null;
                var5 |= var10.field1220 != null;
                var6 |= var10.field1234 != null;
                var7 |= var10.field1219 != null;
                var8 |= var10.field1240 != null;
            }
        }
        this.field1207 = new int[this.field1232];
        this.field1208 = new int[this.field1232];
        this.field1209 = new int[this.field1232];
        this.field1238 = new int[this.field1232];
        this.field1242 = new int[this.field1210];
        this.field1212 = new int[this.field1210];
        this.field1213 = new int[this.field1210];
        if (var3) {
            this.field1214 = new byte[this.field1210];
        }
        if (var4) {
            this.field1215 = new byte[this.field1210];
        }
        if (var5) {
            this.field1220 = new byte[this.field1210];
        }
        if (var6) {
            this.field1234 = new int[this.field1210];
        }
        if (var7) {
            this.field1219 = new short[this.field1210];
        }
        if (var8) {
            this.field1240 = new byte[this.field1210];
        }
        this.field1218 = new short[this.field1210];
        if (this.field1221 > 0) {
            this.field1222 = new byte[this.field1221];
            this.field1244 = new short[this.field1221];
            this.field1224 = new short[this.field1221];
            this.field1247 = new short[this.field1221];
            this.field1226 = new short[this.field1221];
            this.field1227 = new short[this.field1221];
            this.field1228 = new short[this.field1221];
            this.field1250 = new short[this.field1221];
            this.field1233 = new byte[this.field1221];
            this.field1216 = new short[this.field1221];
            this.field1231 = new short[this.field1221];
        }
        this.field1232 = 0;
        this.field1210 = 0;
        this.field1221 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class77 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1210; var13++) {
                    if (var3 && var12.field1214 != null) {
                        this.field1214[this.field1210] = var12.field1214[var13];
                    }
                    if (var4) {
                        if (var12.field1215 == null) {
                            this.field1215[this.field1210] = var12.field1211;
                        } else {
                            this.field1215[this.field1210] = var12.field1215[var13];
                        }
                    }
                    if (var5 && var12.field1220 != null) {
                        this.field1220[this.field1210] = var12.field1220[var13];
                    }
                    if (var6 && var12.field1234 != null) {
                        this.field1234[this.field1210] = var12.field1234[var13];
                    }
                    if (var7) {
                        if (var12.field1219 == null) {
                            this.field1219[this.field1210] = -1;
                        } else {
                            this.field1219[this.field1210] = var12.field1219[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1240 == null || var12.field1240[var13] == -1) {
                            this.field1240[this.field1210] = -1;
                        } else {
                            this.field1240[this.field1210] = (byte) (var12.field1240[var13] + this.field1221);
                        }
                    }
                    this.field1218[this.field1210] = var12.field1218[var13];
                    this.field1242[this.field1210] = this.method1521(var12, var12.field1242[var13]);
                    this.field1212[this.field1210] = this.method1521(var12, var12.field1212[var13]);
                    this.field1213[this.field1210] = this.method1521(var12, var12.field1213[var13]);
                    this.field1210++;
                }
                for (int var14 = 0; var14 < var12.field1221; var14++) {
                    byte var15 = this.field1222[this.field1221] = var12.field1222[var14];
                    if (var15 == 0) {
                        this.field1244[this.field1221] = (short) this.method1521(var12, var12.field1244[var14]);
                        this.field1224[this.field1221] = (short) this.method1521(var12, var12.field1224[var14]);
                        this.field1247[this.field1221] = (short) this.method1521(var12, var12.field1247[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1244[this.field1221] = var12.field1244[var14];
                        this.field1224[this.field1221] = var12.field1224[var14];
                        this.field1247[this.field1221] = var12.field1247[var14];
                        this.field1226[this.field1221] = var12.field1226[var14];
                        this.field1227[this.field1221] = var12.field1227[var14];
                        this.field1228[this.field1221] = var12.field1228[var14];
                        this.field1250[this.field1221] = var12.field1250[var14];
                        this.field1233[this.field1221] = var12.field1233[var14];
                        this.field1216[this.field1221] = var12.field1216[var14];
                    }
                    if (var15 == 2) {
                        this.field1231[this.field1221] = var12.field1231[var14];
                    }
                    this.field1221++;
                }
            }
        }
    }

    @ObfuscatedName("bh.k(Lbh;I)I")
    public final int method1521(class77 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1207[arg1];
        int var5 = arg0.field1208[arg1];
        int var6 = arg0.field1209[arg1];
        for (int var7 = 0; var7 < this.field1232; var7++) {
            if (this.field1207[var7] == var4 && this.field1208[var7] == var5 && this.field1209[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1207[this.field1232] = var4;
            this.field1208[this.field1232] = var5;
            this.field1209[this.field1232] = var6;
            if (arg0.field1238 != null) {
                this.field1238[this.field1232] = arg0.field1238[arg1];
            }
            var3 = this.field1232++;
        }
        return var3;
    }

    public class77(class77 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1232 = arg0.field1232;
        this.field1210 = arg0.field1210;
        this.field1221 = arg0.field1221;
        if (arg1) {
            this.field1207 = arg0.field1207;
            this.field1208 = arg0.field1208;
            this.field1209 = arg0.field1209;
        } else {
            this.field1207 = new int[this.field1232];
            this.field1208 = new int[this.field1232];
            this.field1209 = new int[this.field1232];
            for (int var6 = 0; var6 < this.field1232; var6++) {
                this.field1207[var6] = arg0.field1207[var6];
                this.field1208[var6] = arg0.field1208[var6];
                this.field1209[var6] = arg0.field1209[var6];
            }
        }
        if (arg2) {
            this.field1218 = arg0.field1218;
        } else {
            this.field1218 = new short[this.field1210];
            for (int var7 = 0; var7 < this.field1210; var7++) {
                this.field1218[var7] = arg0.field1218[var7];
            }
        }
        if (arg3 || arg0.field1219 == null) {
            this.field1219 = arg0.field1219;
        } else {
            this.field1219 = new short[this.field1210];
            for (int var8 = 0; var8 < this.field1210; var8++) {
                this.field1219[var8] = arg0.field1219[var8];
            }
        }
        if (arg4) {
            this.field1220 = arg0.field1220;
        } else {
            this.field1220 = new byte[this.field1210];
            if (arg0.field1220 == null) {
                for (int var9 = 0; var9 < this.field1210; var9++) {
                    this.field1220[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1210; var10++) {
                    this.field1220[var10] = arg0.field1220[var10];
                }
            }
        }
        this.field1242 = arg0.field1242;
        this.field1212 = arg0.field1212;
        this.field1213 = arg0.field1213;
        this.field1214 = arg0.field1214;
        this.field1215 = arg0.field1215;
        this.field1240 = arg0.field1240;
        this.field1211 = arg0.field1211;
        this.field1222 = arg0.field1222;
        this.field1244 = arg0.field1244;
        this.field1224 = arg0.field1224;
        this.field1247 = arg0.field1247;
        this.field1226 = arg0.field1226;
        this.field1227 = arg0.field1227;
        this.field1228 = arg0.field1228;
        this.field1250 = arg0.field1250;
        this.field1233 = arg0.field1233;
        this.field1216 = arg0.field1216;
        this.field1231 = arg0.field1231;
        this.field1238 = arg0.field1238;
        this.field1234 = arg0.field1234;
        this.field1235 = arg0.field1235;
        this.field1236 = arg0.field1236;
        this.field1249 = arg0.field1249;
        this.field1237 = arg0.field1237;
        this.field1239 = arg0.field1239;
        this.field1217 = arg0.field1217;
        this.field1241 = arg0.field1241;
    }

    @ObfuscatedName("bh.x()Lbh;")
    public class77 method1449() {
        class77 var1 = new class77();
        if (this.field1214 != null) {
            var1.field1214 = new byte[this.field1210];
            for (int var2 = 0; var2 < this.field1210; var2++) {
                var1.field1214[var2] = this.field1214[var2];
            }
        }
        var1.field1232 = this.field1232;
        var1.field1210 = this.field1210;
        var1.field1221 = this.field1221;
        var1.field1207 = this.field1207;
        var1.field1208 = this.field1208;
        var1.field1209 = this.field1209;
        var1.field1242 = this.field1242;
        var1.field1212 = this.field1212;
        var1.field1213 = this.field1213;
        var1.field1215 = this.field1215;
        var1.field1220 = this.field1220;
        var1.field1240 = this.field1240;
        var1.field1218 = this.field1218;
        var1.field1219 = this.field1219;
        var1.field1211 = this.field1211;
        var1.field1222 = this.field1222;
        var1.field1244 = this.field1244;
        var1.field1224 = this.field1224;
        var1.field1247 = this.field1247;
        var1.field1226 = this.field1226;
        var1.field1227 = this.field1227;
        var1.field1228 = this.field1228;
        var1.field1250 = this.field1250;
        var1.field1233 = this.field1233;
        var1.field1216 = this.field1216;
        var1.field1231 = this.field1231;
        var1.field1238 = this.field1238;
        var1.field1234 = this.field1234;
        var1.field1235 = this.field1235;
        var1.field1236 = this.field1236;
        var1.field1249 = this.field1249;
        var1.field1237 = this.field1237;
        var1.field1217 = this.field1217;
        var1.field1241 = this.field1241;
        return var1;
    }

    @ObfuscatedName("bh.z([[IIIIZI)Lbh;")
    public class77 method1483(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1489();
        int var7 = this.field1225 + arg1;
        int var8 = this.field1245 + arg1;
        int var9 = this.field1229 + arg3;
        int var10 = this.field1246 + arg3;
        if (var7 < 0 || var8 + 128 >> 7 >= arg0.length || var9 < 0 || var10 + 128 >> 7 >= arg0[0].length) {
            return this;
        }
        int var11 = var7 >> 7;
        int var12 = var8 + 127 >> 7;
        int var13 = var9 >> 7;
        int var14 = var10 + 127 >> 7;
        if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
            return this;
        }
        class77 var15;
        if (arg4) {
            var15 = new class77();
            var15.field1232 = this.field1232;
            var15.field1210 = this.field1210;
            var15.field1221 = this.field1221;
            var15.field1207 = this.field1207;
            var15.field1209 = this.field1209;
            var15.field1242 = this.field1242;
            var15.field1212 = this.field1212;
            var15.field1213 = this.field1213;
            var15.field1214 = this.field1214;
            var15.field1215 = this.field1215;
            var15.field1220 = this.field1220;
            var15.field1240 = this.field1240;
            var15.field1218 = this.field1218;
            var15.field1219 = this.field1219;
            var15.field1211 = this.field1211;
            var15.field1222 = this.field1222;
            var15.field1244 = this.field1244;
            var15.field1224 = this.field1224;
            var15.field1247 = this.field1247;
            var15.field1226 = this.field1226;
            var15.field1227 = this.field1227;
            var15.field1228 = this.field1228;
            var15.field1250 = this.field1250;
            var15.field1233 = this.field1233;
            var15.field1216 = this.field1216;
            var15.field1231 = this.field1231;
            var15.field1238 = this.field1238;
            var15.field1234 = this.field1234;
            var15.field1235 = this.field1235;
            var15.field1236 = this.field1236;
            var15.field1217 = this.field1217;
            var15.field1241 = this.field1241;
            var15.field1208 = new int[var15.field1232];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1232; var16++) {
                int var17 = this.field1207[var16] + arg1;
                int var18 = this.field1209[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1208[var16] = this.field1208[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1232; var26++) {
                int var27 = (-this.field1208[var26] << 16) / this.field1530;
                if (var27 < arg5) {
                    int var28 = this.field1207[var26] + arg1;
                    int var29 = this.field1209[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1208[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1208[var26];
                }
            }
        }
        var15.method1461();
        return var15;
    }

    @ObfuscatedName("bh.p()V")
    public void method1451() {
        int var10002;
        if (this.field1238 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1232; var3++) {
                int var4 = this.field1238[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1235 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1235[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1232) {
                int var7 = this.field1238[var6];
                this.field1235[var7][var1[var7]++] = var6++;
            }
            this.field1238 = null;
        }
        if (this.field1234 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1210; var10++) {
            int var11 = this.field1234[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1236 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1236[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1210) {
            int var14 = this.field1234[var13];
            this.field1236[var14][var8[var14]++] = var13++;
        }
        this.field1234 = null;
    }

    @ObfuscatedName("bh.s()V")
    public void method1452() {
        for (int var1 = 0; var1 < this.field1232; var1++) {
            int var2 = this.field1207[var1];
            this.field1207[var1] = this.field1209[var1];
            this.field1209[var1] = -var2;
        }
        this.method1461();
    }

    @ObfuscatedName("bh.o()V")
    public void method1453() {
        for (int var1 = 0; var1 < this.field1232; var1++) {
            this.field1207[var1] = -this.field1207[var1];
            this.field1209[var1] = -this.field1209[var1];
        }
        this.method1461();
    }

    @ObfuscatedName("bh.y()V")
    public void method1454() {
        for (int var1 = 0; var1 < this.field1232; var1++) {
            int var2 = this.field1209[var1];
            this.field1209[var1] = this.field1207[var1];
            this.field1207[var1] = -var2;
        }
        this.method1461();
    }

    @ObfuscatedName("bh.w(I)V")
    public void method1455(int arg0) {
        int var2 = field1251[arg0];
        int var3 = field1252[arg0];
        for (int var4 = 0; var4 < this.field1232; var4++) {
            int var5 = this.field1209[var4] * var2 + this.field1207[var4] * var3 >> 16;
            this.field1209[var4] = this.field1209[var4] * var3 - this.field1207[var4] * var2 >> 16;
            this.field1207[var4] = var5;
        }
        this.method1461();
    }

    @ObfuscatedName("bh.c(III)V")
    public void method1481(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1232; var4++) {
            this.field1207[var4] += arg0;
            this.field1208[var4] += arg1;
            this.field1209[var4] += arg2;
        }
        this.method1461();
    }

    @ObfuscatedName("bh.v(SS)V")
    public void method1502(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1210; var3++) {
            if (this.field1218[var3] == arg0) {
                this.field1218[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("bh.e(SS)V")
    public void method1464(short arg0, short arg1) {
        if (this.field1219 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1210; var3++) {
            if (this.field1219[var3] == arg0) {
                this.field1219[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("bh.j()V")
    public void method1458() {
        for (int var1 = 0; var1 < this.field1232; var1++) {
            this.field1209[var1] = -this.field1209[var1];
        }
        for (int var2 = 0; var2 < this.field1210; var2++) {
            int var3 = this.field1242[var2];
            this.field1242[var2] = this.field1213[var2];
            this.field1213[var2] = var3;
        }
        this.method1461();
    }

    @ObfuscatedName("bh.d(III)V")
    public void method1459(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1232; var4++) {
            this.field1207[var4] = this.field1207[var4] * arg0 / 128;
            this.field1208[var4] = this.field1208[var4] * arg1 / 128;
            this.field1209[var4] = this.field1209[var4] * arg2 / 128;
        }
        this.method1461();
    }

    @ObfuscatedName("bh.g()V")
    public void method1460() {
        if (this.field1249 != null) {
            return;
        }
        this.field1249 = new class84[this.field1232];
        for (int var1 = 0; var1 < this.field1232; var1++) {
            this.field1249[var1] = new class84();
        }
        for (int var2 = 0; var2 < this.field1210; var2++) {
            int var3 = this.field1242[var2];
            int var4 = this.field1212[var2];
            int var5 = this.field1213[var2];
            int var6 = this.field1207[var4] - this.field1207[var3];
            int var7 = this.field1208[var4] - this.field1208[var3];
            int var8 = this.field1209[var4] - this.field1209[var3];
            int var9 = this.field1207[var5] - this.field1207[var3];
            int var10 = this.field1208[var5] - this.field1208[var3];
            int var11 = this.field1209[var5] - this.field1209[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field1214 == null) {
                var19 = 0;
            } else {
                var19 = this.field1214[var2];
            }
            if (var19 == 0) {
                class84 var20 = this.field1249[var3];
                var20.field1409 += var16;
                var20.field1404 += var17;
                var20.field1405 += var18;
                var20.field1406++;
                class84 var21 = this.field1249[var4];
                var21.field1409 += var16;
                var21.field1404 += var17;
                var21.field1405 += var18;
                var21.field1406++;
                class84 var22 = this.field1249[var5];
                var22.field1409 += var16;
                var22.field1404 += var17;
                var22.field1405 += var18;
                var22.field1406++;
            } else if (var19 == 1) {
                if (this.field1237 == null) {
                    this.field1237 = new class92[this.field1210];
                }
                class92 var23 = this.field1237[var2] = new class92();
                var23.field1558 = var16;
                var23.field1559 = var17;
                var23.field1555 = var18;
            }
        }
    }

    @ObfuscatedName("bh.ap()V")
    public void method1461() {
        this.field1249 = null;
        this.field1239 = null;
        this.field1237 = null;
        this.field1223 = false;
    }

    @ObfuscatedName("bh.aj()V")
    public void method1489() {
        if (this.field1223) {
            return;
        }
        this.field1530 = 0;
        this.field1243 = 0;
        this.field1225 = 999999;
        this.field1245 = -999999;
        this.field1246 = -99999;
        this.field1229 = 99999;
        for (int var1 = 0; var1 < this.field1232; var1++) {
            int var2 = this.field1207[var1];
            int var3 = this.field1208[var1];
            int var4 = this.field1209[var1];
            if (var2 < this.field1225) {
                this.field1225 = var2;
            }
            if (var2 > this.field1245) {
                this.field1245 = var2;
            }
            if (var4 < this.field1229) {
                this.field1229 = var4;
            }
            if (var4 > this.field1246) {
                this.field1246 = var4;
            }
            if (-var3 > this.field1530) {
                this.field1530 = -var3;
            }
            if (var3 > this.field1243) {
                this.field1243 = var3;
            }
        }
        this.field1223 = true;
    }

    @ObfuscatedName("bh.ab(Lbh;Lbh;IIIZ)V")
    public static void method1463(class77 arg0, class77 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1489();
        arg0.method1460();
        arg1.method1489();
        arg1.method1460();
        field1206++;
        int var6 = 0;
        int[] var7 = arg1.field1207;
        int var8 = arg1.field1232;
        for (int var9 = 0; var9 < arg0.field1232; var9++) {
            class84 var10 = arg0.field1249[var9];
            if (var10.field1406 != 0) {
                int var11 = arg0.field1208[var9] - arg3;
                if (var11 <= arg1.field1243) {
                    int var12 = arg0.field1207[var9] - arg2;
                    if (var12 >= arg1.field1225 && var12 <= arg1.field1245) {
                        int var13 = arg0.field1209[var9] - arg4;
                        if (var13 >= arg1.field1229 && var13 <= arg1.field1246) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class84 var15 = arg1.field1249[var14];
                                if (var7[var14] == var12 && arg1.field1209[var14] == var13 && arg1.field1208[var14] == var11 && var15.field1406 != 0) {
                                    if (arg0.field1239 == null) {
                                        arg0.field1239 = new class84[arg0.field1232];
                                    }
                                    if (arg1.field1239 == null) {
                                        arg1.field1239 = new class84[var8];
                                    }
                                    class84 var16 = arg0.field1239[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1239[var9] = new class84(var10);
                                    }
                                    class84 var17 = arg1.field1239[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1239[var14] = new class84(var15);
                                    }
                                    var16.field1409 += var15.field1409;
                                    var16.field1404 += var15.field1404;
                                    var16.field1405 += var15.field1405;
                                    var16.field1406 += var15.field1406;
                                    var17.field1409 += var10.field1409;
                                    var17.field1404 += var10.field1404;
                                    var17.field1405 += var10.field1405;
                                    var17.field1406 += var10.field1406;
                                    var6++;
                                    field1248[var9] = field1206;
                                    field1230[var14] = field1206;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 < 3 || !arg5) {
            return;
        }
        for (int var18 = 0; var18 < arg0.field1210; var18++) {
            if (field1248[arg0.field1242[var18]] == field1206 && field1248[arg0.field1212[var18]] == field1206 && field1248[arg0.field1213[var18]] == field1206) {
                if (arg0.field1214 == null) {
                    arg0.field1214 = new byte[arg0.field1210];
                }
                arg0.field1214[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1210; var19++) {
            if (field1230[arg1.field1242[var19]] == field1206 && field1230[arg1.field1212[var19]] == field1206 && field1230[arg1.field1213[var19]] == field1206) {
                if (arg1.field1214 == null) {
                    arg1.field1214 = new byte[arg1.field1210];
                }
                arg1.field1214[var19] = 2;
            }
        }
    }

    @ObfuscatedName("bh.af(IIIII)Lcs;")
    public final class83 method1467(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1460();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class83 var8 = new class83();
        var8.field1349 = new int[this.field1210];
        var8.field1350 = new int[this.field1210];
        var8.field1351 = new int[this.field1210];
        if (this.field1221 > 0 && this.field1240 != null) {
            int[] var9 = new int[this.field1221];
            for (int var10 = 0; var10 < this.field1210; var10++) {
                if (this.field1240[var10] != -1) {
                    var9[this.field1240[var10] & 0xFF]++;
                }
            }
            var8.field1398 = 0;
            for (int var11 = 0; var11 < this.field1221; var11++) {
                if (var9[var11] > 0 && this.field1222[var11] == 0) {
                    var8.field1398++;
                }
            }
            var8.field1397 = new int[var8.field1398];
            var8.field1359 = new int[var8.field1398];
            var8.field1360 = new int[var8.field1398];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1221; var13++) {
                if (var9[var13] > 0 && this.field1222[var13] == 0) {
                    var8.field1397[var12] = this.field1244[var13] & 0xFFFF;
                    var8.field1359[var12] = this.field1224[var13] & 0xFFFF;
                    var8.field1360[var12] = this.field1247[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1354 = new byte[this.field1210];
            for (int var14 = 0; var14 < this.field1210; var14++) {
                if (this.field1240[var14] == -1) {
                    var8.field1354[var14] = -1;
                } else {
                    var8.field1354[var14] = (byte) var9[this.field1240[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1210; var15++) {
            byte var16;
            if (this.field1214 == null) {
                var16 = 0;
            } else {
                var16 = this.field1214[var15];
            }
            byte var17;
            if (this.field1220 == null) {
                var17 = 0;
            } else {
                var17 = this.field1220[var15];
            }
            short var18;
            if (this.field1219 == null) {
                var18 = -1;
            } else {
                var18 = this.field1219[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1218[var15] & 0xFFFF;
                    class84 var20;
                    if (this.field1239 == null || this.field1239[this.field1242[var15]] == null) {
                        var20 = this.field1249[this.field1242[var15]];
                    } else {
                        var20 = this.field1239[this.field1242[var15]];
                    }
                    int var21 = (var20.field1405 * arg4 + var20.field1409 * arg2 + var20.field1404 * arg3) / (var20.field1406 * var7) + arg0;
                    var8.field1349[var15] = method1500(var19, var21);
                    class84 var22;
                    if (this.field1239 == null || this.field1239[this.field1212[var15]] == null) {
                        var22 = this.field1249[this.field1212[var15]];
                    } else {
                        var22 = this.field1239[this.field1212[var15]];
                    }
                    int var23 = (var22.field1405 * arg4 + var22.field1409 * arg2 + var22.field1404 * arg3) / (var22.field1406 * var7) + arg0;
                    var8.field1350[var15] = method1500(var19, var23);
                    class84 var24;
                    if (this.field1239 == null || this.field1239[this.field1213[var15]] == null) {
                        var24 = this.field1249[this.field1213[var15]];
                    } else {
                        var24 = this.field1239[this.field1213[var15]];
                    }
                    int var25 = (var24.field1405 * arg4 + var24.field1409 * arg2 + var24.field1404 * arg3) / (var24.field1406 * var7) + arg0;
                    var8.field1351[var15] = method1500(var19, var25);
                } else if (var16 == 1) {
                    class92 var26 = this.field1237[var15];
                    int var27 = (var26.field1555 * arg4 + var26.field1559 * arg3 + var26.field1558 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1349[var15] = method1500(this.field1218[var15] & 0xFFFF, var27);
                    var8.field1351[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1349[var15] = 128;
                    var8.field1351[var15] = -1;
                } else {
                    var8.field1351[var15] = -2;
                }
            } else if (var16 == 0) {
                class84 var28;
                if (this.field1239 == null || this.field1239[this.field1242[var15]] == null) {
                    var28 = this.field1249[this.field1242[var15]];
                } else {
                    var28 = this.field1239[this.field1242[var15]];
                }
                int var29 = (var28.field1405 * arg4 + var28.field1409 * arg2 + var28.field1404 * arg3) / (var28.field1406 * var7) + arg0;
                var8.field1349[var15] = method1466(var29);
                class84 var30;
                if (this.field1239 == null || this.field1239[this.field1212[var15]] == null) {
                    var30 = this.field1249[this.field1212[var15]];
                } else {
                    var30 = this.field1239[this.field1212[var15]];
                }
                int var31 = (var30.field1405 * arg4 + var30.field1409 * arg2 + var30.field1404 * arg3) / (var30.field1406 * var7) + arg0;
                var8.field1350[var15] = method1466(var31);
                class84 var32;
                if (this.field1239 == null || this.field1239[this.field1213[var15]] == null) {
                    var32 = this.field1249[this.field1213[var15]];
                } else {
                    var32 = this.field1239[this.field1213[var15]];
                }
                int var33 = (var32.field1405 * arg4 + var32.field1409 * arg2 + var32.field1404 * arg3) / (var32.field1406 * var7) + arg0;
                var8.field1351[var15] = method1466(var33);
            } else if (var16 == 1) {
                class92 var34 = this.field1237[var15];
                int var35 = (var34.field1555 * arg4 + var34.field1559 * arg3 + var34.field1558 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1349[var15] = method1466(var35);
                var8.field1351[var15] = -1;
            } else {
                var8.field1351[var15] = -2;
            }
        }
        this.method1451();
        var8.field1341 = this.field1232;
        var8.field1388 = this.field1207;
        var8.field1367 = this.field1208;
        var8.field1372 = this.field1209;
        var8.field1345 = this.field1210;
        var8.field1346 = this.field1242;
        var8.field1347 = this.field1212;
        var8.field1348 = this.field1213;
        var8.field1357 = this.field1215;
        var8.field1353 = this.field1220;
        var8.field1356 = this.field1211;
        var8.field1343 = this.field1235;
        var8.field1362 = this.field1236;
        var8.field1355 = this.field1219;
        return var8;
    }

    @ObfuscatedName("bh.aw(II)I")
    public static final int method1500(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("bh.ac(I)I")
    public static final int method1466(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
