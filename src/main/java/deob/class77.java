package deob;

@ObfuscatedName("bx")
public class class77 extends class90 {

    @ObfuscatedName("bx.q")
    public int field1265 = 0;

    @ObfuscatedName("bx.d")
    public int[] field1240;

    @ObfuscatedName("bx.h")
    public int[] field1241;

    @ObfuscatedName("bx.p")
    public int[] field1248;

    @ObfuscatedName("bx.j")
    public int field1278 = 0;

    @ObfuscatedName("bx.n")
    public int[] field1244;

    @ObfuscatedName("bx.r")
    public int[] field1245;

    @ObfuscatedName("bx.c")
    public int[] field1250;

    @ObfuscatedName("bx.i")
    public byte[] field1247;

    @ObfuscatedName("bx.o")
    public byte[] field1239;

    @ObfuscatedName("bx.m")
    public byte[] field1270;

    @ObfuscatedName("bx.s")
    public byte[] field1277;

    @ObfuscatedName("bx.u")
    public short[] field1251;

    @ObfuscatedName("bx.b")
    public short[] field1252;

    @ObfuscatedName("bx.v")
    public byte field1253 = 0;

    @ObfuscatedName("bx.f")
    public int field1280;

    @ObfuscatedName("bx.z")
    public byte[] field1255;

    @ObfuscatedName("bx.t")
    public short[] field1266;

    @ObfuscatedName("bx.y")
    public short[] field1256;

    @ObfuscatedName("bx.w")
    public short[] field1258;

    @ObfuscatedName("bx.a")
    public short[] field1259;

    @ObfuscatedName("bx.k")
    public short[] field1260;

    @ObfuscatedName("bx.l")
    public short[] field1261;

    @ObfuscatedName("bx.x")
    public short[] field1262;

    @ObfuscatedName("bx.g")
    public short[] field1285;

    @ObfuscatedName("bx.e")
    public short[] field1264;

    @ObfuscatedName("bx.ae")
    public byte[] field1275;

    @ObfuscatedName("bx.aq")
    public int[] field1249;

    @ObfuscatedName("bx.at")
    public int[] field1267;

    @ObfuscatedName("bx.au")
    public int[][] field1268;

    @ObfuscatedName("bx.am")
    public int[][] field1269;

    @ObfuscatedName("bx.ad")
    public class92[] field1254;

    @ObfuscatedName("bx.ai")
    public class84[] field1271;

    @ObfuscatedName("bx.ac")
    public class84[] field1272;

    @ObfuscatedName("bx.ao")
    public short field1273;

    @ObfuscatedName("bx.as")
    public short field1274;

    @ObfuscatedName("bx.aa")
    public boolean field1246 = false;

    @ObfuscatedName("bx.ah")
    public int field1276;

    @ObfuscatedName("bx.aj")
    public int field1279;

    @ObfuscatedName("bx.aw")
    public int field1257;

    @ObfuscatedName("bx.ap")
    public int field1282;

    @ObfuscatedName("bx.ak")
    public int field1263;

    @ObfuscatedName("bx.ag")
    public static int[] field1242 = new int[10000];

    @ObfuscatedName("bx.al")
    public static int[] field1281 = new int[10000];

    @ObfuscatedName("bx.an")
    public static int field1283 = 0;

    @ObfuscatedName("bx.ar")
    public static int[] field1284 = class85.field1469;

    @ObfuscatedName("bx.ab")
    public static int[] field1243 = class85.field1463;

    public class77() {
    }

    @ObfuscatedName("bx.q(Lgj;II)Lbx;")
    public static class77 method1494(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3133(arg1, arg2);
        return var3 == null ? null : new class77(var3);
    }

    public class77(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1449(arg0);
        } else {
            this.method1450(arg0);
        }
    }

    @ObfuscatedName("bx.d([B)V")
    public void method1449(byte[] arg0) {
        class154 var2 = new class154(arg0);
        class154 var3 = new class154(arg0);
        class154 var4 = new class154(arg0);
        class154 var5 = new class154(arg0);
        class154 var6 = new class154(arg0);
        class154 var7 = new class154(arg0);
        class154 var8 = new class154(arg0);
        var2.field2091 = arg0.length - 23;
        int var9 = var2.method2668();
        int var10 = var2.method2668();
        int var11 = var2.method2666();
        int var12 = var2.method2666();
        int var13 = var2.method2666();
        int var14 = var2.method2666();
        int var15 = var2.method2666();
        int var16 = var2.method2666();
        int var17 = var2.method2666();
        int var18 = var2.method2668();
        int var19 = var2.method2668();
        int var20 = var2.method2668();
        int var21 = var2.method2668();
        int var22 = var2.method2668();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1255 = new byte[var11];
            var2.field2091 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1255[var26] = var2.method2835();
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
        this.field1265 = var9;
        this.field1278 = var10;
        this.field1280 = var11;
        this.field1240 = new int[var9];
        this.field1241 = new int[var9];
        this.field1248 = new int[var9];
        this.field1244 = new int[var10];
        this.field1245 = new int[var10];
        this.field1250 = new int[var10];
        if (var17 == 1) {
            this.field1249 = new int[var9];
        }
        if (var12 == 1) {
            this.field1247 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1239 = new byte[var10];
        } else {
            this.field1253 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1270 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1267 = new int[var10];
        }
        if (var16 == 1) {
            this.field1252 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1277 = new byte[var10];
        }
        this.field1251 = new short[var10];
        if (var11 > 0) {
            this.field1266 = new short[var11];
            this.field1256 = new short[var11];
            this.field1258 = new short[var11];
            if (var24 > 0) {
                this.field1259 = new short[var24];
                this.field1260 = new short[var24];
                this.field1261 = new short[var24];
                this.field1262 = new short[var24];
                this.field1275 = new byte[var24];
                this.field1285 = new short[var24];
            }
            if (var25 > 0) {
                this.field1264 = new short[var25];
            }
        }
        var2.field2091 = var11;
        var3.field2091 = var44;
        var4.field2091 = var46;
        var5.field2091 = var48;
        var6.field2091 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2666();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2678();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2678();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2678();
            }
            this.field1240[var67] = var64 + var69;
            this.field1241[var67] = var65 + var70;
            this.field1248[var67] = var66 + var71;
            var64 = this.field1240[var67];
            var65 = this.field1241[var67];
            var66 = this.field1248[var67];
            if (var17 == 1) {
                this.field1249[var67] = var6.method2666();
            }
        }
        var2.field2091 = var42;
        var3.field2091 = var31;
        var4.field2091 = var34;
        var5.field2091 = var37;
        var6.field2091 = var35;
        var7.field2091 = var40;
        var8.field2091 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1251[var72] = (short) var2.method2668();
            if (var12 == 1) {
                this.field1247[var72] = var3.method2835();
            }
            if (var13 == 255) {
                this.field1239[var72] = var4.method2835();
            }
            if (var14 == 1) {
                this.field1270[var72] = var5.method2835();
            }
            if (var15 == 1) {
                this.field1267[var72] = var6.method2666();
            }
            if (var16 == 1) {
                this.field1252[var72] = (short) (var7.method2668() - 1);
            }
            if (this.field1277 != null && this.field1252[var72] != -1) {
                this.field1277[var72] = (byte) (var8.method2666() - 1);
            }
        }
        var2.field2091 = var33;
        var3.field2091 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2666();
            if (var78 == 1) {
                var73 = var2.method2678() + var76;
                var74 = var2.method2678() + var73;
                var75 = var2.method2678() + var74;
                var76 = var75;
                this.field1244[var77] = var73;
                this.field1245[var77] = var74;
                this.field1250[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2678() + var76;
                var76 = var75;
                this.field1244[var77] = var73;
                this.field1245[var77] = var74;
                this.field1250[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2678() + var76;
                var76 = var75;
                this.field1244[var77] = var73;
                this.field1245[var77] = var74;
                this.field1250[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2678() + var76;
                var76 = var75;
                this.field1244[var77] = var73;
                this.field1245[var77] = var81;
                this.field1250[var77] = var75;
            }
        }
        var2.field2091 = var50;
        var3.field2091 = var52;
        var4.field2091 = var54;
        var5.field2091 = var56;
        var6.field2091 = var58;
        var7.field2091 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1255[var82] & 0xFF;
            if (var83 == 0) {
                this.field1266[var82] = (short) var2.method2668();
                this.field1256[var82] = (short) var2.method2668();
                this.field1258[var82] = (short) var2.method2668();
            }
            if (var83 == 1) {
                this.field1266[var82] = (short) var3.method2668();
                this.field1256[var82] = (short) var3.method2668();
                this.field1258[var82] = (short) var3.method2668();
                this.field1259[var82] = (short) var4.method2668();
                this.field1260[var82] = (short) var4.method2668();
                this.field1261[var82] = (short) var4.method2668();
                this.field1262[var82] = (short) var5.method2668();
                this.field1275[var82] = var6.method2835();
                this.field1285[var82] = (short) var7.method2668();
            }
            if (var83 == 2) {
                this.field1266[var82] = (short) var3.method2668();
                this.field1256[var82] = (short) var3.method2668();
                this.field1258[var82] = (short) var3.method2668();
                this.field1259[var82] = (short) var4.method2668();
                this.field1260[var82] = (short) var4.method2668();
                this.field1261[var82] = (short) var4.method2668();
                this.field1262[var82] = (short) var5.method2668();
                this.field1275[var82] = var6.method2835();
                this.field1285[var82] = (short) var7.method2668();
                this.field1264[var82] = (short) var7.method2668();
            }
            if (var83 == 3) {
                this.field1266[var82] = (short) var3.method2668();
                this.field1256[var82] = (short) var3.method2668();
                this.field1258[var82] = (short) var3.method2668();
                this.field1259[var82] = (short) var4.method2668();
                this.field1260[var82] = (short) var4.method2668();
                this.field1261[var82] = (short) var4.method2668();
                this.field1262[var82] = (short) var5.method2668();
                this.field1275[var82] = var6.method2835();
                this.field1285[var82] = (short) var7.method2668();
            }
        }
        var2.field2091 = var62;
        int var84 = var2.method2666();
        if (var84 == 0) {
            return;
        }
        new class89();
        var2.method2668();
        var2.method2668();
        var2.method2668();
        var2.method2798();
    }

    @ObfuscatedName("bx.p([B)V")
    public void method1450(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class154 var4 = new class154(arg0);
        class154 var5 = new class154(arg0);
        class154 var6 = new class154(arg0);
        class154 var7 = new class154(arg0);
        class154 var8 = new class154(arg0);
        var4.field2091 = arg0.length - 18;
        int var9 = var4.method2668();
        int var10 = var4.method2668();
        int var11 = var4.method2666();
        int var12 = var4.method2666();
        int var13 = var4.method2666();
        int var14 = var4.method2666();
        int var15 = var4.method2666();
        int var16 = var4.method2666();
        int var17 = var4.method2668();
        int var18 = var4.method2668();
        int var19 = var4.method2668();
        int var20 = var4.method2668();
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
        this.field1265 = var9;
        this.field1278 = var10;
        this.field1280 = var11;
        this.field1240 = new int[var9];
        this.field1241 = new int[var9];
        this.field1248 = new int[var9];
        this.field1244 = new int[var10];
        this.field1245 = new int[var10];
        this.field1250 = new int[var10];
        if (var11 > 0) {
            this.field1255 = new byte[var11];
            this.field1266 = new short[var11];
            this.field1256 = new short[var11];
            this.field1258 = new short[var11];
        }
        if (var16 == 1) {
            this.field1249 = new int[var9];
        }
        if (var12 == 1) {
            this.field1247 = new byte[var10];
            this.field1277 = new byte[var10];
            this.field1252 = new short[var10];
        }
        if (var13 == 255) {
            this.field1239 = new byte[var10];
        } else {
            this.field1253 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1270 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1267 = new int[var10];
        }
        this.field1251 = new short[var10];
        var4.field2091 = var21;
        var5.field2091 = var36;
        var6.field2091 = var38;
        var7.field2091 = var40;
        var8.field2091 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2666();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2678();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2678();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2678();
            }
            this.field1240[var46] = var43 + var48;
            this.field1241[var46] = var44 + var49;
            this.field1248[var46] = var45 + var50;
            var43 = this.field1240[var46];
            var44 = this.field1241[var46];
            var45 = this.field1248[var46];
            if (var16 == 1) {
                this.field1249[var46] = var8.method2666();
            }
        }
        var4.field2091 = var32;
        var5.field2091 = var28;
        var6.field2091 = var26;
        var7.field2091 = var30;
        var8.field2091 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1251[var51] = (short) var4.method2668();
            if (var12 == 1) {
                int var52 = var5.method2666();
                if ((var52 & 0x1) == 1) {
                    this.field1247[var51] = 1;
                    var2 = true;
                } else {
                    this.field1247[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1277[var51] = (byte) (var52 >> 2);
                    this.field1252[var51] = this.field1251[var51];
                    this.field1251[var51] = 127;
                    if (this.field1252[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1277[var51] = -1;
                    this.field1252[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1239[var51] = var6.method2835();
            }
            if (var14 == 1) {
                this.field1270[var51] = var7.method2835();
            }
            if (var15 == 1) {
                this.field1267[var51] = var8.method2666();
            }
        }
        var4.field2091 = var25;
        var5.field2091 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2666();
            if (var58 == 1) {
                var53 = var4.method2678() + var56;
                var54 = var4.method2678() + var53;
                var55 = var4.method2678() + var54;
                var56 = var55;
                this.field1244[var57] = var53;
                this.field1245[var57] = var54;
                this.field1250[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2678() + var56;
                var56 = var55;
                this.field1244[var57] = var53;
                this.field1245[var57] = var54;
                this.field1250[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2678() + var56;
                var56 = var55;
                this.field1244[var57] = var53;
                this.field1245[var57] = var54;
                this.field1250[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2678() + var56;
                var56 = var55;
                this.field1244[var57] = var53;
                this.field1245[var57] = var61;
                this.field1250[var57] = var55;
            }
        }
        var4.field2091 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1255[var62] = 0;
            this.field1266[var62] = (short) var4.method2668();
            this.field1256[var62] = (short) var4.method2668();
            this.field1258[var62] = (short) var4.method2668();
        }
        if (this.field1277 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1277[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1266[var65] & 0xFFFF) == this.field1244[var64] && (this.field1256[var65] & 0xFFFF) == this.field1245[var64] && (this.field1258[var65] & 0xFFFF) == this.field1250[var64]) {
                        this.field1277[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1277 = null;
            }
        }
        if (!var3) {
            this.field1252 = null;
        }
        if (!var2) {
            this.field1247 = null;
        }
    }

    public class77(class77[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1265 = 0;
        this.field1278 = 0;
        this.field1280 = 0;
        this.field1253 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class77 var10 = arg0[var9];
            if (var10 != null) {
                this.field1265 += var10.field1265;
                this.field1278 += var10.field1278;
                this.field1280 += var10.field1280;
                if (var10.field1239 == null) {
                    if (this.field1253 == -1) {
                        this.field1253 = var10.field1253;
                    }
                    if (this.field1253 != var10.field1253) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1247 != null;
                var5 |= var10.field1270 != null;
                var6 |= var10.field1267 != null;
                var7 |= var10.field1252 != null;
                var8 |= var10.field1277 != null;
            }
        }
        this.field1240 = new int[this.field1265];
        this.field1241 = new int[this.field1265];
        this.field1248 = new int[this.field1265];
        this.field1249 = new int[this.field1265];
        this.field1244 = new int[this.field1278];
        this.field1245 = new int[this.field1278];
        this.field1250 = new int[this.field1278];
        if (var3) {
            this.field1247 = new byte[this.field1278];
        }
        if (var4) {
            this.field1239 = new byte[this.field1278];
        }
        if (var5) {
            this.field1270 = new byte[this.field1278];
        }
        if (var6) {
            this.field1267 = new int[this.field1278];
        }
        if (var7) {
            this.field1252 = new short[this.field1278];
        }
        if (var8) {
            this.field1277 = new byte[this.field1278];
        }
        this.field1251 = new short[this.field1278];
        if (this.field1280 > 0) {
            this.field1255 = new byte[this.field1280];
            this.field1266 = new short[this.field1280];
            this.field1256 = new short[this.field1280];
            this.field1258 = new short[this.field1280];
            this.field1259 = new short[this.field1280];
            this.field1260 = new short[this.field1280];
            this.field1261 = new short[this.field1280];
            this.field1262 = new short[this.field1280];
            this.field1275 = new byte[this.field1280];
            this.field1285 = new short[this.field1280];
            this.field1264 = new short[this.field1280];
        }
        this.field1265 = 0;
        this.field1278 = 0;
        this.field1280 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class77 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1278; var13++) {
                    if (var3 && var12.field1247 != null) {
                        this.field1247[this.field1278] = var12.field1247[var13];
                    }
                    if (var4) {
                        if (var12.field1239 == null) {
                            this.field1239[this.field1278] = var12.field1253;
                        } else {
                            this.field1239[this.field1278] = var12.field1239[var13];
                        }
                    }
                    if (var5 && var12.field1270 != null) {
                        this.field1270[this.field1278] = var12.field1270[var13];
                    }
                    if (var6 && var12.field1267 != null) {
                        this.field1267[this.field1278] = var12.field1267[var13];
                    }
                    if (var7) {
                        if (var12.field1252 == null) {
                            this.field1252[this.field1278] = -1;
                        } else {
                            this.field1252[this.field1278] = var12.field1252[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1277 == null || var12.field1277[var13] == -1) {
                            this.field1277[this.field1278] = -1;
                        } else {
                            this.field1277[this.field1278] = (byte) (var12.field1277[var13] + this.field1280);
                        }
                    }
                    this.field1251[this.field1278] = var12.field1251[var13];
                    this.field1244[this.field1278] = this.method1452(var12, var12.field1244[var13]);
                    this.field1245[this.field1278] = this.method1452(var12, var12.field1245[var13]);
                    this.field1250[this.field1278] = this.method1452(var12, var12.field1250[var13]);
                    this.field1278++;
                }
                for (int var14 = 0; var14 < var12.field1280; var14++) {
                    byte var15 = this.field1255[this.field1280] = var12.field1255[var14];
                    if (var15 == 0) {
                        this.field1266[this.field1280] = (short) this.method1452(var12, var12.field1266[var14]);
                        this.field1256[this.field1280] = (short) this.method1452(var12, var12.field1256[var14]);
                        this.field1258[this.field1280] = (short) this.method1452(var12, var12.field1258[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1266[this.field1280] = var12.field1266[var14];
                        this.field1256[this.field1280] = var12.field1256[var14];
                        this.field1258[this.field1280] = var12.field1258[var14];
                        this.field1259[this.field1280] = var12.field1259[var14];
                        this.field1260[this.field1280] = var12.field1260[var14];
                        this.field1261[this.field1280] = var12.field1261[var14];
                        this.field1262[this.field1280] = var12.field1262[var14];
                        this.field1275[this.field1280] = var12.field1275[var14];
                        this.field1285[this.field1280] = var12.field1285[var14];
                    }
                    if (var15 == 2) {
                        this.field1264[this.field1280] = var12.field1264[var14];
                    }
                    this.field1280++;
                }
            }
        }
    }

    @ObfuscatedName("bx.j(Lbx;I)I")
    public final int method1452(class77 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1240[arg1];
        int var5 = arg0.field1241[arg1];
        int var6 = arg0.field1248[arg1];
        for (int var7 = 0; var7 < this.field1265; var7++) {
            if (this.field1240[var7] == var4 && this.field1241[var7] == var5 && this.field1248[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1240[this.field1265] = var4;
            this.field1241[this.field1265] = var5;
            this.field1248[this.field1265] = var6;
            if (arg0.field1249 != null) {
                this.field1249[this.field1265] = arg0.field1249[arg1];
            }
            var3 = this.field1265++;
        }
        return var3;
    }

    public class77(class77 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1265 = arg0.field1265;
        this.field1278 = arg0.field1278;
        this.field1280 = arg0.field1280;
        if (arg1) {
            this.field1240 = arg0.field1240;
            this.field1241 = arg0.field1241;
            this.field1248 = arg0.field1248;
        } else {
            this.field1240 = new int[this.field1265];
            this.field1241 = new int[this.field1265];
            this.field1248 = new int[this.field1265];
            for (int var6 = 0; var6 < this.field1265; var6++) {
                this.field1240[var6] = arg0.field1240[var6];
                this.field1241[var6] = arg0.field1241[var6];
                this.field1248[var6] = arg0.field1248[var6];
            }
        }
        if (arg2) {
            this.field1251 = arg0.field1251;
        } else {
            this.field1251 = new short[this.field1278];
            for (int var7 = 0; var7 < this.field1278; var7++) {
                this.field1251[var7] = arg0.field1251[var7];
            }
        }
        if (arg3 || arg0.field1252 == null) {
            this.field1252 = arg0.field1252;
        } else {
            this.field1252 = new short[this.field1278];
            for (int var8 = 0; var8 < this.field1278; var8++) {
                this.field1252[var8] = arg0.field1252[var8];
            }
        }
        if (arg4) {
            this.field1270 = arg0.field1270;
        } else {
            this.field1270 = new byte[this.field1278];
            if (arg0.field1270 == null) {
                for (int var9 = 0; var9 < this.field1278; var9++) {
                    this.field1270[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1278; var10++) {
                    this.field1270[var10] = arg0.field1270[var10];
                }
            }
        }
        this.field1244 = arg0.field1244;
        this.field1245 = arg0.field1245;
        this.field1250 = arg0.field1250;
        this.field1247 = arg0.field1247;
        this.field1239 = arg0.field1239;
        this.field1277 = arg0.field1277;
        this.field1253 = arg0.field1253;
        this.field1255 = arg0.field1255;
        this.field1266 = arg0.field1266;
        this.field1256 = arg0.field1256;
        this.field1258 = arg0.field1258;
        this.field1259 = arg0.field1259;
        this.field1260 = arg0.field1260;
        this.field1261 = arg0.field1261;
        this.field1262 = arg0.field1262;
        this.field1275 = arg0.field1275;
        this.field1285 = arg0.field1285;
        this.field1264 = arg0.field1264;
        this.field1249 = arg0.field1249;
        this.field1267 = arg0.field1267;
        this.field1268 = arg0.field1268;
        this.field1269 = arg0.field1269;
        this.field1271 = arg0.field1271;
        this.field1254 = arg0.field1254;
        this.field1272 = arg0.field1272;
        this.field1273 = arg0.field1273;
        this.field1274 = arg0.field1274;
    }

    @ObfuscatedName("bx.n()Lbx;")
    public class77 method1453() {
        class77 var1 = new class77();
        if (this.field1247 != null) {
            var1.field1247 = new byte[this.field1278];
            for (int var2 = 0; var2 < this.field1278; var2++) {
                var1.field1247[var2] = this.field1247[var2];
            }
        }
        var1.field1265 = this.field1265;
        var1.field1278 = this.field1278;
        var1.field1280 = this.field1280;
        var1.field1240 = this.field1240;
        var1.field1241 = this.field1241;
        var1.field1248 = this.field1248;
        var1.field1244 = this.field1244;
        var1.field1245 = this.field1245;
        var1.field1250 = this.field1250;
        var1.field1239 = this.field1239;
        var1.field1270 = this.field1270;
        var1.field1277 = this.field1277;
        var1.field1251 = this.field1251;
        var1.field1252 = this.field1252;
        var1.field1253 = this.field1253;
        var1.field1255 = this.field1255;
        var1.field1266 = this.field1266;
        var1.field1256 = this.field1256;
        var1.field1258 = this.field1258;
        var1.field1259 = this.field1259;
        var1.field1260 = this.field1260;
        var1.field1261 = this.field1261;
        var1.field1262 = this.field1262;
        var1.field1275 = this.field1275;
        var1.field1285 = this.field1285;
        var1.field1264 = this.field1264;
        var1.field1249 = this.field1249;
        var1.field1267 = this.field1267;
        var1.field1268 = this.field1268;
        var1.field1269 = this.field1269;
        var1.field1271 = this.field1271;
        var1.field1254 = this.field1254;
        var1.field1273 = this.field1273;
        var1.field1274 = this.field1274;
        return var1;
    }

    @ObfuscatedName("bx.c([[IIIIZI)Lbx;")
    public class77 method1454(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1467();
        int var7 = this.field1279 + arg1;
        int var8 = this.field1257 + arg1;
        int var9 = this.field1263 + arg3;
        int var10 = this.field1282 + arg3;
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
            var15.field1265 = this.field1265;
            var15.field1278 = this.field1278;
            var15.field1280 = this.field1280;
            var15.field1240 = this.field1240;
            var15.field1248 = this.field1248;
            var15.field1244 = this.field1244;
            var15.field1245 = this.field1245;
            var15.field1250 = this.field1250;
            var15.field1247 = this.field1247;
            var15.field1239 = this.field1239;
            var15.field1270 = this.field1270;
            var15.field1277 = this.field1277;
            var15.field1251 = this.field1251;
            var15.field1252 = this.field1252;
            var15.field1253 = this.field1253;
            var15.field1255 = this.field1255;
            var15.field1266 = this.field1266;
            var15.field1256 = this.field1256;
            var15.field1258 = this.field1258;
            var15.field1259 = this.field1259;
            var15.field1260 = this.field1260;
            var15.field1261 = this.field1261;
            var15.field1262 = this.field1262;
            var15.field1275 = this.field1275;
            var15.field1285 = this.field1285;
            var15.field1264 = this.field1264;
            var15.field1249 = this.field1249;
            var15.field1267 = this.field1267;
            var15.field1268 = this.field1268;
            var15.field1269 = this.field1269;
            var15.field1273 = this.field1273;
            var15.field1274 = this.field1274;
            var15.field1241 = new int[var15.field1265];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1265; var16++) {
                int var17 = this.field1240[var16] + arg1;
                int var18 = this.field1248[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1241[var16] = this.field1241[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1265; var26++) {
                int var27 = (-this.field1241[var26] << 16) / this.field1558;
                if (var27 < arg5) {
                    int var28 = this.field1240[var26] + arg1;
                    int var29 = this.field1248[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1241[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1241[var26];
                }
            }
        }
        var15.method1466();
        return var15;
    }

    @ObfuscatedName("bx.o()V")
    public void method1455() {
        int var10002;
        if (this.field1249 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1265; var3++) {
                int var4 = this.field1249[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1268 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1268[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1265) {
                int var7 = this.field1249[var6];
                this.field1268[var7][var1[var7]++] = var6++;
            }
            this.field1249 = null;
        }
        if (this.field1267 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1278; var10++) {
            int var11 = this.field1267[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1269 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1269[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1278) {
            int var14 = this.field1267[var13];
            this.field1269[var14][var8[var14]++] = var13++;
        }
        this.field1267 = null;
    }

    @ObfuscatedName("bx.s()V")
    public void method1456() {
        for (int var1 = 0; var1 < this.field1265; var1++) {
            int var2 = this.field1240[var1];
            this.field1240[var1] = this.field1248[var1];
            this.field1248[var1] = -var2;
        }
        this.method1466();
    }

    @ObfuscatedName("bx.u()V")
    public void method1474() {
        for (int var1 = 0; var1 < this.field1265; var1++) {
            this.field1240[var1] = -this.field1240[var1];
            this.field1248[var1] = -this.field1248[var1];
        }
        this.method1466();
    }

    @ObfuscatedName("bx.b()V")
    public void method1457() {
        for (int var1 = 0; var1 < this.field1265; var1++) {
            int var2 = this.field1248[var1];
            this.field1248[var1] = this.field1240[var1];
            this.field1240[var1] = -var2;
        }
        this.method1466();
    }

    @ObfuscatedName("bx.f(I)V")
    public void method1459(int arg0) {
        int var2 = field1284[arg0];
        int var3 = field1243[arg0];
        for (int var4 = 0; var4 < this.field1265; var4++) {
            int var5 = this.field1248[var4] * var2 + this.field1240[var4] * var3 >> 16;
            this.field1248[var4] = this.field1248[var4] * var3 - this.field1240[var4] * var2 >> 16;
            this.field1240[var4] = var5;
        }
        this.method1466();
    }

    @ObfuscatedName("bx.z(III)V")
    public void method1496(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1265; var4++) {
            this.field1240[var4] += arg0;
            this.field1241[var4] += arg1;
            this.field1248[var4] += arg2;
        }
        this.method1466();
    }

    @ObfuscatedName("bx.t(SS)V")
    public void method1461(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1278; var3++) {
            if (this.field1251[var3] == arg0) {
                this.field1251[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("bx.y(SS)V")
    public void method1499(short arg0, short arg1) {
        if (this.field1252 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1278; var3++) {
            if (this.field1252[var3] == arg0) {
                this.field1252[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("bx.w()V")
    public void method1463() {
        for (int var1 = 0; var1 < this.field1265; var1++) {
            this.field1248[var1] = -this.field1248[var1];
        }
        for (int var2 = 0; var2 < this.field1278; var2++) {
            int var3 = this.field1244[var2];
            this.field1244[var2] = this.field1250[var2];
            this.field1250[var2] = var3;
        }
        this.method1466();
    }

    @ObfuscatedName("bx.a(III)V")
    public void method1464(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1265; var4++) {
            this.field1240[var4] = this.field1240[var4] * arg0 / 128;
            this.field1241[var4] = this.field1241[var4] * arg1 / 128;
            this.field1248[var4] = this.field1248[var4] * arg2 / 128;
        }
        this.method1466();
    }

    @ObfuscatedName("bx.k()V")
    public void method1465() {
        if (this.field1271 != null) {
            return;
        }
        this.field1271 = new class84[this.field1265];
        for (int var1 = 0; var1 < this.field1265; var1++) {
            this.field1271[var1] = new class84();
        }
        for (int var2 = 0; var2 < this.field1278; var2++) {
            int var3 = this.field1244[var2];
            int var4 = this.field1245[var2];
            int var5 = this.field1250[var2];
            int var6 = this.field1240[var4] - this.field1240[var3];
            int var7 = this.field1241[var4] - this.field1241[var3];
            int var8 = this.field1248[var4] - this.field1248[var3];
            int var9 = this.field1240[var5] - this.field1240[var3];
            int var10 = this.field1241[var5] - this.field1241[var3];
            int var11 = this.field1248[var5] - this.field1248[var3];
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
            if (this.field1247 == null) {
                var19 = 0;
            } else {
                var19 = this.field1247[var2];
            }
            if (var19 == 0) {
                class84 var20 = this.field1271[var3];
                var20.field1440 += var16;
                var20.field1441 += var17;
                var20.field1442 += var18;
                var20.field1443++;
                class84 var21 = this.field1271[var4];
                var21.field1440 += var16;
                var21.field1441 += var17;
                var21.field1442 += var18;
                var21.field1443++;
                class84 var22 = this.field1271[var5];
                var22.field1440 += var16;
                var22.field1441 += var17;
                var22.field1442 += var18;
                var22.field1443++;
            } else if (var19 == 1) {
                if (this.field1254 == null) {
                    this.field1254 = new class92[this.field1278];
                }
                class92 var23 = this.field1254[var2] = new class92();
                var23.field1572 = var16;
                var23.field1571 = var17;
                var23.field1575 = var18;
            }
        }
    }

    @ObfuscatedName("bx.l()V")
    public void method1466() {
        this.field1271 = null;
        this.field1272 = null;
        this.field1254 = null;
        this.field1246 = false;
    }

    @ObfuscatedName("bx.x()V")
    public void method1467() {
        if (this.field1246) {
            return;
        }
        this.field1558 = 0;
        this.field1276 = 0;
        this.field1279 = 999999;
        this.field1257 = -999999;
        this.field1282 = -99999;
        this.field1263 = 99999;
        for (int var1 = 0; var1 < this.field1265; var1++) {
            int var2 = this.field1240[var1];
            int var3 = this.field1241[var1];
            int var4 = this.field1248[var1];
            if (var2 < this.field1279) {
                this.field1279 = var2;
            }
            if (var2 > this.field1257) {
                this.field1257 = var2;
            }
            if (var4 < this.field1263) {
                this.field1263 = var4;
            }
            if (var4 > this.field1282) {
                this.field1282 = var4;
            }
            if (-var3 > this.field1558) {
                this.field1558 = -var3;
            }
            if (var3 > this.field1276) {
                this.field1276 = var3;
            }
        }
        this.field1246 = true;
    }

    @ObfuscatedName("bx.g(Lbx;Lbx;IIIZ)V")
    public static void method1501(class77 arg0, class77 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1467();
        arg0.method1465();
        arg1.method1467();
        arg1.method1465();
        field1283++;
        int var6 = 0;
        int[] var7 = arg1.field1240;
        int var8 = arg1.field1265;
        for (int var9 = 0; var9 < arg0.field1265; var9++) {
            class84 var10 = arg0.field1271[var9];
            if (var10.field1443 != 0) {
                int var11 = arg0.field1241[var9] - arg3;
                if (var11 <= arg1.field1276) {
                    int var12 = arg0.field1240[var9] - arg2;
                    if (var12 >= arg1.field1279 && var12 <= arg1.field1257) {
                        int var13 = arg0.field1248[var9] - arg4;
                        if (var13 >= arg1.field1263 && var13 <= arg1.field1282) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class84 var15 = arg1.field1271[var14];
                                if (var7[var14] == var12 && arg1.field1248[var14] == var13 && arg1.field1241[var14] == var11 && var15.field1443 != 0) {
                                    if (arg0.field1272 == null) {
                                        arg0.field1272 = new class84[arg0.field1265];
                                    }
                                    if (arg1.field1272 == null) {
                                        arg1.field1272 = new class84[var8];
                                    }
                                    class84 var16 = arg0.field1272[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1272[var9] = new class84(var10);
                                    }
                                    class84 var17 = arg1.field1272[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1272[var14] = new class84(var15);
                                    }
                                    var16.field1440 += var15.field1440;
                                    var16.field1441 += var15.field1441;
                                    var16.field1442 += var15.field1442;
                                    var16.field1443 += var15.field1443;
                                    var17.field1440 += var10.field1440;
                                    var17.field1441 += var10.field1441;
                                    var17.field1442 += var10.field1442;
                                    var17.field1443 += var10.field1443;
                                    var6++;
                                    field1242[var9] = field1283;
                                    field1281[var14] = field1283;
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
        for (int var18 = 0; var18 < arg0.field1278; var18++) {
            if (field1242[arg0.field1244[var18]] == field1283 && field1242[arg0.field1245[var18]] == field1283 && field1242[arg0.field1250[var18]] == field1283) {
                if (arg0.field1247 == null) {
                    arg0.field1247 = new byte[arg0.field1278];
                }
                arg0.field1247[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1278; var19++) {
            if (field1281[arg1.field1244[var19]] == field1283 && field1281[arg1.field1245[var19]] == field1283 && field1281[arg1.field1250[var19]] == field1283) {
                if (arg1.field1247 == null) {
                    arg1.field1247 = new byte[arg1.field1278];
                }
                arg1.field1247[var19] = 2;
            }
        }
    }

    @ObfuscatedName("bx.e(IIIII)Lcf;")
    public final class83 method1469(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1465();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class83 var8 = new class83();
        var8.field1386 = new int[this.field1278];
        var8.field1438 = new int[this.field1278];
        var8.field1414 = new int[this.field1278];
        if (this.field1280 > 0 && this.field1277 != null) {
            int[] var9 = new int[this.field1280];
            for (int var10 = 0; var10 < this.field1278; var10++) {
                if (this.field1277[var10] != -1) {
                    var9[this.field1277[var10] & 0xFF]++;
                }
            }
            var8.field1394 = 0;
            for (int var11 = 0; var11 < this.field1280; var11++) {
                if (var9[var11] > 0 && this.field1255[var11] == 0) {
                    var8.field1394++;
                }
            }
            var8.field1395 = new int[var8.field1394];
            var8.field1396 = new int[var8.field1394];
            var8.field1381 = new int[var8.field1394];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1280; var13++) {
                if (var9[var13] > 0 && this.field1255[var13] == 0) {
                    var8.field1395[var12] = this.field1266[var13] & 0xFFFF;
                    var8.field1396[var12] = this.field1256[var13] & 0xFFFF;
                    var8.field1381[var12] = this.field1258[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1391 = new byte[this.field1278];
            for (int var14 = 0; var14 < this.field1278; var14++) {
                if (this.field1277[var14] == -1) {
                    var8.field1391[var14] = -1;
                } else {
                    var8.field1391[var14] = (byte) var9[this.field1277[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1278; var15++) {
            byte var16;
            if (this.field1247 == null) {
                var16 = 0;
            } else {
                var16 = this.field1247[var15];
            }
            byte var17;
            if (this.field1270 == null) {
                var17 = 0;
            } else {
                var17 = this.field1270[var15];
            }
            short var18;
            if (this.field1252 == null) {
                var18 = -1;
            } else {
                var18 = this.field1252[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1251[var15] & 0xFFFF;
                    class84 var20;
                    if (this.field1272 == null || this.field1272[this.field1244[var15]] == null) {
                        var20 = this.field1271[this.field1244[var15]];
                    } else {
                        var20 = this.field1272[this.field1244[var15]];
                    }
                    int var21 = (var20.field1442 * arg4 + var20.field1441 * arg3 + var20.field1440 * arg2) / (var20.field1443 * var7) + arg0;
                    var8.field1386[var15] = method1493(var19, var21);
                    class84 var22;
                    if (this.field1272 == null || this.field1272[this.field1245[var15]] == null) {
                        var22 = this.field1271[this.field1245[var15]];
                    } else {
                        var22 = this.field1272[this.field1245[var15]];
                    }
                    int var23 = (var22.field1442 * arg4 + var22.field1441 * arg3 + var22.field1440 * arg2) / (var22.field1443 * var7) + arg0;
                    var8.field1438[var15] = method1493(var19, var23);
                    class84 var24;
                    if (this.field1272 == null || this.field1272[this.field1250[var15]] == null) {
                        var24 = this.field1271[this.field1250[var15]];
                    } else {
                        var24 = this.field1272[this.field1250[var15]];
                    }
                    int var25 = (var24.field1442 * arg4 + var24.field1441 * arg3 + var24.field1440 * arg2) / (var24.field1443 * var7) + arg0;
                    var8.field1414[var15] = method1493(var19, var25);
                } else if (var16 == 1) {
                    class92 var26 = this.field1254[var15];
                    int var27 = (var26.field1575 * arg4 + var26.field1572 * arg2 + var26.field1571 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1386[var15] = method1493(this.field1251[var15] & 0xFFFF, var27);
                    var8.field1414[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1386[var15] = 128;
                    var8.field1414[var15] = -1;
                } else {
                    var8.field1414[var15] = -2;
                }
            } else if (var16 == 0) {
                class84 var28;
                if (this.field1272 == null || this.field1272[this.field1244[var15]] == null) {
                    var28 = this.field1271[this.field1244[var15]];
                } else {
                    var28 = this.field1272[this.field1244[var15]];
                }
                int var29 = (var28.field1442 * arg4 + var28.field1441 * arg3 + var28.field1440 * arg2) / (var28.field1443 * var7) + arg0;
                var8.field1386[var15] = method1470(var29);
                class84 var30;
                if (this.field1272 == null || this.field1272[this.field1245[var15]] == null) {
                    var30 = this.field1271[this.field1245[var15]];
                } else {
                    var30 = this.field1272[this.field1245[var15]];
                }
                int var31 = (var30.field1442 * arg4 + var30.field1441 * arg3 + var30.field1440 * arg2) / (var30.field1443 * var7) + arg0;
                var8.field1438[var15] = method1470(var31);
                class84 var32;
                if (this.field1272 == null || this.field1272[this.field1250[var15]] == null) {
                    var32 = this.field1271[this.field1250[var15]];
                } else {
                    var32 = this.field1272[this.field1250[var15]];
                }
                int var33 = (var32.field1442 * arg4 + var32.field1441 * arg3 + var32.field1440 * arg2) / (var32.field1443 * var7) + arg0;
                var8.field1414[var15] = method1470(var33);
            } else if (var16 == 1) {
                class92 var34 = this.field1254[var15];
                int var35 = (var34.field1575 * arg4 + var34.field1572 * arg2 + var34.field1571 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1386[var15] = method1470(var35);
                var8.field1414[var15] = -1;
            } else {
                var8.field1414[var15] = -2;
            }
        }
        this.method1455();
        var8.field1378 = this.field1265;
        var8.field1379 = this.field1240;
        var8.field1387 = this.field1241;
        var8.field1382 = this.field1248;
        var8.field1389 = this.field1278;
        var8.field1420 = this.field1244;
        var8.field1384 = this.field1245;
        var8.field1385 = this.field1250;
        var8.field1417 = this.field1239;
        var8.field1390 = this.field1270;
        var8.field1393 = this.field1253;
        var8.field1398 = this.field1268;
        var8.field1399 = this.field1269;
        var8.field1433 = this.field1252;
        return var8;
    }

    @ObfuscatedName("bx.ae(II)I")
    public static final int method1493(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("bx.aq(I)I")
    public static final int method1470(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
