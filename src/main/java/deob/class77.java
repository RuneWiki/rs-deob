package deob;

@ObfuscatedName("bp")
public class class77 extends class90 {

    @ObfuscatedName("bp.f")
    public int field1251 = 0;

    @ObfuscatedName("bp.i")
    public int[] field1246;

    @ObfuscatedName("bp.u")
    public int[] field1247;

    @ObfuscatedName("bp.h")
    public int[] field1248;

    @ObfuscatedName("bp.r")
    public int field1290 = 0;

    @ObfuscatedName("bp.o")
    public int[] field1250;

    @ObfuscatedName("bp.l")
    public int[] field1253;

    @ObfuscatedName("bp.n")
    public int[] field1252;

    @ObfuscatedName("bp.m")
    public byte[] field1266;

    @ObfuscatedName("bp.w")
    public byte[] field1254;

    @ObfuscatedName("bp.j")
    public byte[] field1255;

    @ObfuscatedName("bp.s")
    public byte[] field1256;

    @ObfuscatedName("bp.q")
    public short[] field1280;

    @ObfuscatedName("bp.d")
    public short[] field1284;

    @ObfuscatedName("bp.p")
    public byte field1259 = 0;

    @ObfuscatedName("bp.y")
    public int field1245;

    @ObfuscatedName("bp.a")
    public byte[] field1261;

    @ObfuscatedName("bp.v")
    public short[] field1262;

    @ObfuscatedName("bp.z")
    public short[] field1260;

    @ObfuscatedName("bp.x")
    public short[] field1264;

    @ObfuscatedName("bp.g")
    public short[] field1265;

    @ObfuscatedName("bp.b")
    public short[] field1282;

    @ObfuscatedName("bp.k")
    public short[] field1267;

    @ObfuscatedName("bp.t")
    public short[] field1276;

    @ObfuscatedName("bp.c")
    public short[] field1281;

    @ObfuscatedName("bp.e")
    public short[] field1270;

    @ObfuscatedName("bp.am")
    public byte[] field1271;

    @ObfuscatedName("bp.an")
    public int[] field1272;

    @ObfuscatedName("bp.aq")
    public int[] field1273;

    @ObfuscatedName("bp.ah")
    public int[][] field1274;

    @ObfuscatedName("bp.ag")
    public int[][] field1249;

    @ObfuscatedName("bp.ab")
    public class92[] field1263;

    @ObfuscatedName("bp.aw")
    public class84[] field1277;

    @ObfuscatedName("bp.ax")
    public class84[] field1278;

    @ObfuscatedName("bp.ar")
    public short field1279;

    @ObfuscatedName("bp.ak")
    public short field1268;

    @ObfuscatedName("bp.ai")
    public boolean field1283 = false;

    @ObfuscatedName("bp.ap")
    public int field1257;

    @ObfuscatedName("bp.au")
    public int field1269;

    @ObfuscatedName("bp.aj")
    public int field1275;

    @ObfuscatedName("bp.at")
    public int field1285;

    @ObfuscatedName("bp.ad")
    public int field1286;

    @ObfuscatedName("bp.av")
    public static int[] field1287 = new int[10000];

    @ObfuscatedName("bp.ao")
    public static int[] field1288 = new int[10000];

    @ObfuscatedName("bp.ae")
    public static int field1289 = 0;

    @ObfuscatedName("bp.aa")
    public static int[] field1258 = class85.field1476;

    @ObfuscatedName("bp.as")
    public static int[] field1291 = class85.field1470;

    public class77() {
    }

    @ObfuscatedName("bp.f(Lgb;II)Lbp;")
    public static class77 method1408(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3163(arg1, arg2);
        return var3 == null ? null : new class77(var3);
    }

    public class77(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1428(arg0);
        } else {
            this.method1420(arg0);
        }
    }

    @ObfuscatedName("bp.i([B)V")
    public void method1428(byte[] arg0) {
        class154 var2 = new class154(arg0);
        class154 var3 = new class154(arg0);
        class154 var4 = new class154(arg0);
        class154 var5 = new class154(arg0);
        class154 var6 = new class154(arg0);
        class154 var7 = new class154(arg0);
        class154 var8 = new class154(arg0);
        var2.field2111 = arg0.length - 23;
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
            this.field1261 = new byte[var11];
            var2.field2111 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1261[var26] = var2.method2667();
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
        this.field1251 = var9;
        this.field1290 = var10;
        this.field1245 = var11;
        this.field1246 = new int[var9];
        this.field1247 = new int[var9];
        this.field1248 = new int[var9];
        this.field1250 = new int[var10];
        this.field1253 = new int[var10];
        this.field1252 = new int[var10];
        if (var17 == 1) {
            this.field1272 = new int[var9];
        }
        if (var12 == 1) {
            this.field1266 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1254 = new byte[var10];
        } else {
            this.field1259 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1255 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1273 = new int[var10];
        }
        if (var16 == 1) {
            this.field1284 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1256 = new byte[var10];
        }
        this.field1280 = new short[var10];
        if (var11 > 0) {
            this.field1262 = new short[var11];
            this.field1260 = new short[var11];
            this.field1264 = new short[var11];
            if (var24 > 0) {
                this.field1265 = new short[var24];
                this.field1282 = new short[var24];
                this.field1267 = new short[var24];
                this.field1276 = new short[var24];
                this.field1271 = new byte[var24];
                this.field1281 = new short[var24];
            }
            if (var25 > 0) {
                this.field1270 = new short[var25];
            }
        }
        var2.field2111 = var11;
        var3.field2111 = var44;
        var4.field2111 = var46;
        var5.field2111 = var48;
        var6.field2111 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2666();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2719();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2719();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2719();
            }
            this.field1246[var67] = var64 + var69;
            this.field1247[var67] = var65 + var70;
            this.field1248[var67] = var66 + var71;
            var64 = this.field1246[var67];
            var65 = this.field1247[var67];
            var66 = this.field1248[var67];
            if (var17 == 1) {
                this.field1272[var67] = var6.method2666();
            }
        }
        var2.field2111 = var42;
        var3.field2111 = var31;
        var4.field2111 = var34;
        var5.field2111 = var37;
        var6.field2111 = var35;
        var7.field2111 = var40;
        var8.field2111 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1280[var72] = (short) var2.method2668();
            if (var12 == 1) {
                this.field1266[var72] = var3.method2667();
            }
            if (var13 == 255) {
                this.field1254[var72] = var4.method2667();
            }
            if (var14 == 1) {
                this.field1255[var72] = var5.method2667();
            }
            if (var15 == 1) {
                this.field1273[var72] = var6.method2666();
            }
            if (var16 == 1) {
                this.field1284[var72] = (short) (var7.method2668() - 1);
            }
            if (this.field1256 != null && this.field1284[var72] != -1) {
                this.field1256[var72] = (byte) (var8.method2666() - 1);
            }
        }
        var2.field2111 = var33;
        var3.field2111 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2666();
            if (var78 == 1) {
                var73 = var2.method2719() + var76;
                var74 = var2.method2719() + var73;
                var75 = var2.method2719() + var74;
                var76 = var75;
                this.field1250[var77] = var73;
                this.field1253[var77] = var74;
                this.field1252[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2719() + var76;
                var76 = var75;
                this.field1250[var77] = var73;
                this.field1253[var77] = var74;
                this.field1252[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2719() + var76;
                var76 = var75;
                this.field1250[var77] = var73;
                this.field1253[var77] = var74;
                this.field1252[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2719() + var76;
                var76 = var75;
                this.field1250[var77] = var73;
                this.field1253[var77] = var81;
                this.field1252[var77] = var75;
            }
        }
        var2.field2111 = var50;
        var3.field2111 = var52;
        var4.field2111 = var54;
        var5.field2111 = var56;
        var6.field2111 = var58;
        var7.field2111 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1261[var82] & 0xFF;
            if (var83 == 0) {
                this.field1262[var82] = (short) var2.method2668();
                this.field1260[var82] = (short) var2.method2668();
                this.field1264[var82] = (short) var2.method2668();
            }
            if (var83 == 1) {
                this.field1262[var82] = (short) var3.method2668();
                this.field1260[var82] = (short) var3.method2668();
                this.field1264[var82] = (short) var3.method2668();
                this.field1265[var82] = (short) var4.method2668();
                this.field1282[var82] = (short) var4.method2668();
                this.field1267[var82] = (short) var4.method2668();
                this.field1276[var82] = (short) var5.method2668();
                this.field1271[var82] = var6.method2667();
                this.field1281[var82] = (short) var7.method2668();
            }
            if (var83 == 2) {
                this.field1262[var82] = (short) var3.method2668();
                this.field1260[var82] = (short) var3.method2668();
                this.field1264[var82] = (short) var3.method2668();
                this.field1265[var82] = (short) var4.method2668();
                this.field1282[var82] = (short) var4.method2668();
                this.field1267[var82] = (short) var4.method2668();
                this.field1276[var82] = (short) var5.method2668();
                this.field1271[var82] = var6.method2667();
                this.field1281[var82] = (short) var7.method2668();
                this.field1270[var82] = (short) var7.method2668();
            }
            if (var83 == 3) {
                this.field1262[var82] = (short) var3.method2668();
                this.field1260[var82] = (short) var3.method2668();
                this.field1264[var82] = (short) var3.method2668();
                this.field1265[var82] = (short) var4.method2668();
                this.field1282[var82] = (short) var4.method2668();
                this.field1267[var82] = (short) var4.method2668();
                this.field1276[var82] = (short) var5.method2668();
                this.field1271[var82] = var6.method2667();
                this.field1281[var82] = (short) var7.method2668();
            }
        }
        var2.field2111 = var62;
        int var84 = var2.method2666();
        if (var84 == 0) {
            return;
        }
        new class89();
        var2.method2668();
        var2.method2668();
        var2.method2668();
        var2.method2695();
    }

    @ObfuscatedName("bp.r([B)V")
    public void method1420(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class154 var4 = new class154(arg0);
        class154 var5 = new class154(arg0);
        class154 var6 = new class154(arg0);
        class154 var7 = new class154(arg0);
        class154 var8 = new class154(arg0);
        var4.field2111 = arg0.length - 18;
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
        this.field1251 = var9;
        this.field1290 = var10;
        this.field1245 = var11;
        this.field1246 = new int[var9];
        this.field1247 = new int[var9];
        this.field1248 = new int[var9];
        this.field1250 = new int[var10];
        this.field1253 = new int[var10];
        this.field1252 = new int[var10];
        if (var11 > 0) {
            this.field1261 = new byte[var11];
            this.field1262 = new short[var11];
            this.field1260 = new short[var11];
            this.field1264 = new short[var11];
        }
        if (var16 == 1) {
            this.field1272 = new int[var9];
        }
        if (var12 == 1) {
            this.field1266 = new byte[var10];
            this.field1256 = new byte[var10];
            this.field1284 = new short[var10];
        }
        if (var13 == 255) {
            this.field1254 = new byte[var10];
        } else {
            this.field1259 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1255 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1273 = new int[var10];
        }
        this.field1280 = new short[var10];
        var4.field2111 = var21;
        var5.field2111 = var36;
        var6.field2111 = var38;
        var7.field2111 = var40;
        var8.field2111 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2666();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2719();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2719();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2719();
            }
            this.field1246[var46] = var43 + var48;
            this.field1247[var46] = var44 + var49;
            this.field1248[var46] = var45 + var50;
            var43 = this.field1246[var46];
            var44 = this.field1247[var46];
            var45 = this.field1248[var46];
            if (var16 == 1) {
                this.field1272[var46] = var8.method2666();
            }
        }
        var4.field2111 = var32;
        var5.field2111 = var28;
        var6.field2111 = var26;
        var7.field2111 = var30;
        var8.field2111 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1280[var51] = (short) var4.method2668();
            if (var12 == 1) {
                int var52 = var5.method2666();
                if ((var52 & 0x1) == 1) {
                    this.field1266[var51] = 1;
                    var2 = true;
                } else {
                    this.field1266[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1256[var51] = (byte) (var52 >> 2);
                    this.field1284[var51] = this.field1280[var51];
                    this.field1280[var51] = 127;
                    if (this.field1284[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1256[var51] = -1;
                    this.field1284[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1254[var51] = var6.method2667();
            }
            if (var14 == 1) {
                this.field1255[var51] = var7.method2667();
            }
            if (var15 == 1) {
                this.field1273[var51] = var8.method2666();
            }
        }
        var4.field2111 = var25;
        var5.field2111 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2666();
            if (var58 == 1) {
                var53 = var4.method2719() + var56;
                var54 = var4.method2719() + var53;
                var55 = var4.method2719() + var54;
                var56 = var55;
                this.field1250[var57] = var53;
                this.field1253[var57] = var54;
                this.field1252[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2719() + var56;
                var56 = var55;
                this.field1250[var57] = var53;
                this.field1253[var57] = var54;
                this.field1252[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2719() + var56;
                var56 = var55;
                this.field1250[var57] = var53;
                this.field1253[var57] = var54;
                this.field1252[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2719() + var56;
                var56 = var55;
                this.field1250[var57] = var53;
                this.field1253[var57] = var61;
                this.field1252[var57] = var55;
            }
        }
        var4.field2111 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1261[var62] = 0;
            this.field1262[var62] = (short) var4.method2668();
            this.field1260[var62] = (short) var4.method2668();
            this.field1264[var62] = (short) var4.method2668();
        }
        if (this.field1256 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1256[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1262[var65] & 0xFFFF) == this.field1250[var64] && (this.field1260[var65] & 0xFFFF) == this.field1253[var64] && (this.field1264[var65] & 0xFFFF) == this.field1252[var64]) {
                        this.field1256[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1256 = null;
            }
        }
        if (!var3) {
            this.field1284 = null;
        }
        if (!var2) {
            this.field1266 = null;
        }
    }

    public class77(class77[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1251 = 0;
        this.field1290 = 0;
        this.field1245 = 0;
        this.field1259 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class77 var10 = arg0[var9];
            if (var10 != null) {
                this.field1251 += var10.field1251;
                this.field1290 += var10.field1290;
                this.field1245 += var10.field1245;
                if (var10.field1254 == null) {
                    if (this.field1259 == -1) {
                        this.field1259 = var10.field1259;
                    }
                    if (this.field1259 != var10.field1259) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1266 != null;
                var5 |= var10.field1255 != null;
                var6 |= var10.field1273 != null;
                var7 |= var10.field1284 != null;
                var8 |= var10.field1256 != null;
            }
        }
        this.field1246 = new int[this.field1251];
        this.field1247 = new int[this.field1251];
        this.field1248 = new int[this.field1251];
        this.field1272 = new int[this.field1251];
        this.field1250 = new int[this.field1290];
        this.field1253 = new int[this.field1290];
        this.field1252 = new int[this.field1290];
        if (var3) {
            this.field1266 = new byte[this.field1290];
        }
        if (var4) {
            this.field1254 = new byte[this.field1290];
        }
        if (var5) {
            this.field1255 = new byte[this.field1290];
        }
        if (var6) {
            this.field1273 = new int[this.field1290];
        }
        if (var7) {
            this.field1284 = new short[this.field1290];
        }
        if (var8) {
            this.field1256 = new byte[this.field1290];
        }
        this.field1280 = new short[this.field1290];
        if (this.field1245 > 0) {
            this.field1261 = new byte[this.field1245];
            this.field1262 = new short[this.field1245];
            this.field1260 = new short[this.field1245];
            this.field1264 = new short[this.field1245];
            this.field1265 = new short[this.field1245];
            this.field1282 = new short[this.field1245];
            this.field1267 = new short[this.field1245];
            this.field1276 = new short[this.field1245];
            this.field1271 = new byte[this.field1245];
            this.field1281 = new short[this.field1245];
            this.field1270 = new short[this.field1245];
        }
        this.field1251 = 0;
        this.field1290 = 0;
        this.field1245 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class77 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1290; var13++) {
                    if (var3 && var12.field1266 != null) {
                        this.field1266[this.field1290] = var12.field1266[var13];
                    }
                    if (var4) {
                        if (var12.field1254 == null) {
                            this.field1254[this.field1290] = var12.field1259;
                        } else {
                            this.field1254[this.field1290] = var12.field1254[var13];
                        }
                    }
                    if (var5 && var12.field1255 != null) {
                        this.field1255[this.field1290] = var12.field1255[var13];
                    }
                    if (var6 && var12.field1273 != null) {
                        this.field1273[this.field1290] = var12.field1273[var13];
                    }
                    if (var7) {
                        if (var12.field1284 == null) {
                            this.field1284[this.field1290] = -1;
                        } else {
                            this.field1284[this.field1290] = var12.field1284[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1256 == null || var12.field1256[var13] == -1) {
                            this.field1256[this.field1290] = -1;
                        } else {
                            this.field1256[this.field1290] = (byte) (var12.field1256[var13] + this.field1245);
                        }
                    }
                    this.field1280[this.field1290] = var12.field1280[var13];
                    this.field1250[this.field1290] = this.method1412(var12, var12.field1250[var13]);
                    this.field1253[this.field1290] = this.method1412(var12, var12.field1253[var13]);
                    this.field1252[this.field1290] = this.method1412(var12, var12.field1252[var13]);
                    this.field1290++;
                }
                for (int var14 = 0; var14 < var12.field1245; var14++) {
                    byte var15 = this.field1261[this.field1245] = var12.field1261[var14];
                    if (var15 == 0) {
                        this.field1262[this.field1245] = (short) this.method1412(var12, var12.field1262[var14]);
                        this.field1260[this.field1245] = (short) this.method1412(var12, var12.field1260[var14]);
                        this.field1264[this.field1245] = (short) this.method1412(var12, var12.field1264[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1262[this.field1245] = var12.field1262[var14];
                        this.field1260[this.field1245] = var12.field1260[var14];
                        this.field1264[this.field1245] = var12.field1264[var14];
                        this.field1265[this.field1245] = var12.field1265[var14];
                        this.field1282[this.field1245] = var12.field1282[var14];
                        this.field1267[this.field1245] = var12.field1267[var14];
                        this.field1276[this.field1245] = var12.field1276[var14];
                        this.field1271[this.field1245] = var12.field1271[var14];
                        this.field1281[this.field1245] = var12.field1281[var14];
                    }
                    if (var15 == 2) {
                        this.field1270[this.field1245] = var12.field1270[var14];
                    }
                    this.field1245++;
                }
            }
        }
    }

    @ObfuscatedName("bp.o(Lbp;I)I")
    public final int method1412(class77 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1246[arg1];
        int var5 = arg0.field1247[arg1];
        int var6 = arg0.field1248[arg1];
        for (int var7 = 0; var7 < this.field1251; var7++) {
            if (this.field1246[var7] == var4 && this.field1247[var7] == var5 && this.field1248[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1246[this.field1251] = var4;
            this.field1247[this.field1251] = var5;
            this.field1248[this.field1251] = var6;
            if (arg0.field1272 != null) {
                this.field1272[this.field1251] = arg0.field1272[arg1];
            }
            var3 = this.field1251++;
        }
        return var3;
    }

    public class77(class77 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1251 = arg0.field1251;
        this.field1290 = arg0.field1290;
        this.field1245 = arg0.field1245;
        if (arg1) {
            this.field1246 = arg0.field1246;
            this.field1247 = arg0.field1247;
            this.field1248 = arg0.field1248;
        } else {
            this.field1246 = new int[this.field1251];
            this.field1247 = new int[this.field1251];
            this.field1248 = new int[this.field1251];
            for (int var6 = 0; var6 < this.field1251; var6++) {
                this.field1246[var6] = arg0.field1246[var6];
                this.field1247[var6] = arg0.field1247[var6];
                this.field1248[var6] = arg0.field1248[var6];
            }
        }
        if (arg2) {
            this.field1280 = arg0.field1280;
        } else {
            this.field1280 = new short[this.field1290];
            for (int var7 = 0; var7 < this.field1290; var7++) {
                this.field1280[var7] = arg0.field1280[var7];
            }
        }
        if (arg3 || arg0.field1284 == null) {
            this.field1284 = arg0.field1284;
        } else {
            this.field1284 = new short[this.field1290];
            for (int var8 = 0; var8 < this.field1290; var8++) {
                this.field1284[var8] = arg0.field1284[var8];
            }
        }
        if (arg4) {
            this.field1255 = arg0.field1255;
        } else {
            this.field1255 = new byte[this.field1290];
            if (arg0.field1255 == null) {
                for (int var9 = 0; var9 < this.field1290; var9++) {
                    this.field1255[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1290; var10++) {
                    this.field1255[var10] = arg0.field1255[var10];
                }
            }
        }
        this.field1250 = arg0.field1250;
        this.field1253 = arg0.field1253;
        this.field1252 = arg0.field1252;
        this.field1266 = arg0.field1266;
        this.field1254 = arg0.field1254;
        this.field1256 = arg0.field1256;
        this.field1259 = arg0.field1259;
        this.field1261 = arg0.field1261;
        this.field1262 = arg0.field1262;
        this.field1260 = arg0.field1260;
        this.field1264 = arg0.field1264;
        this.field1265 = arg0.field1265;
        this.field1282 = arg0.field1282;
        this.field1267 = arg0.field1267;
        this.field1276 = arg0.field1276;
        this.field1271 = arg0.field1271;
        this.field1281 = arg0.field1281;
        this.field1270 = arg0.field1270;
        this.field1272 = arg0.field1272;
        this.field1273 = arg0.field1273;
        this.field1274 = arg0.field1274;
        this.field1249 = arg0.field1249;
        this.field1277 = arg0.field1277;
        this.field1263 = arg0.field1263;
        this.field1278 = arg0.field1278;
        this.field1279 = arg0.field1279;
        this.field1268 = arg0.field1268;
    }

    @ObfuscatedName("bp.l()Lbp;")
    public class77 method1414() {
        class77 var1 = new class77();
        if (this.field1266 != null) {
            var1.field1266 = new byte[this.field1290];
            for (int var2 = 0; var2 < this.field1290; var2++) {
                var1.field1266[var2] = this.field1266[var2];
            }
        }
        var1.field1251 = this.field1251;
        var1.field1290 = this.field1290;
        var1.field1245 = this.field1245;
        var1.field1246 = this.field1246;
        var1.field1247 = this.field1247;
        var1.field1248 = this.field1248;
        var1.field1250 = this.field1250;
        var1.field1253 = this.field1253;
        var1.field1252 = this.field1252;
        var1.field1254 = this.field1254;
        var1.field1255 = this.field1255;
        var1.field1256 = this.field1256;
        var1.field1280 = this.field1280;
        var1.field1284 = this.field1284;
        var1.field1259 = this.field1259;
        var1.field1261 = this.field1261;
        var1.field1262 = this.field1262;
        var1.field1260 = this.field1260;
        var1.field1264 = this.field1264;
        var1.field1265 = this.field1265;
        var1.field1282 = this.field1282;
        var1.field1267 = this.field1267;
        var1.field1276 = this.field1276;
        var1.field1271 = this.field1271;
        var1.field1281 = this.field1281;
        var1.field1270 = this.field1270;
        var1.field1272 = this.field1272;
        var1.field1273 = this.field1273;
        var1.field1274 = this.field1274;
        var1.field1249 = this.field1249;
        var1.field1277 = this.field1277;
        var1.field1263 = this.field1263;
        var1.field1279 = this.field1279;
        var1.field1268 = this.field1268;
        return var1;
    }

    @ObfuscatedName("bp.n([[IIIIZI)Lbp;")
    public class77 method1415(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1430();
        int var7 = this.field1269 + arg1;
        int var8 = this.field1275 + arg1;
        int var9 = this.field1286 + arg3;
        int var10 = this.field1285 + arg3;
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
            var15.field1251 = this.field1251;
            var15.field1290 = this.field1290;
            var15.field1245 = this.field1245;
            var15.field1246 = this.field1246;
            var15.field1248 = this.field1248;
            var15.field1250 = this.field1250;
            var15.field1253 = this.field1253;
            var15.field1252 = this.field1252;
            var15.field1266 = this.field1266;
            var15.field1254 = this.field1254;
            var15.field1255 = this.field1255;
            var15.field1256 = this.field1256;
            var15.field1280 = this.field1280;
            var15.field1284 = this.field1284;
            var15.field1259 = this.field1259;
            var15.field1261 = this.field1261;
            var15.field1262 = this.field1262;
            var15.field1260 = this.field1260;
            var15.field1264 = this.field1264;
            var15.field1265 = this.field1265;
            var15.field1282 = this.field1282;
            var15.field1267 = this.field1267;
            var15.field1276 = this.field1276;
            var15.field1271 = this.field1271;
            var15.field1281 = this.field1281;
            var15.field1270 = this.field1270;
            var15.field1272 = this.field1272;
            var15.field1273 = this.field1273;
            var15.field1274 = this.field1274;
            var15.field1249 = this.field1249;
            var15.field1279 = this.field1279;
            var15.field1268 = this.field1268;
            var15.field1247 = new int[var15.field1251];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1251; var16++) {
                int var17 = this.field1246[var16] + arg1;
                int var18 = this.field1248[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1247[var16] = this.field1247[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1251; var26++) {
                int var27 = (-this.field1247[var26] << 16) / this.field1564;
                if (var27 < arg5) {
                    int var28 = this.field1246[var26] + arg1;
                    int var29 = this.field1248[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1247[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1247[var26];
                }
            }
        }
        var15.method1436();
        return var15;
    }

    @ObfuscatedName("bp.m()V")
    public void method1416() {
        int var10002;
        if (this.field1272 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1251; var3++) {
                int var4 = this.field1272[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1274 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1274[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1251) {
                int var7 = this.field1272[var6];
                this.field1274[var7][var1[var7]++] = var6++;
            }
            this.field1272 = null;
        }
        if (this.field1273 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1290; var10++) {
            int var11 = this.field1273[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1249 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1249[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1290) {
            int var14 = this.field1273[var13];
            this.field1249[var14][var8[var14]++] = var13++;
        }
        this.field1273 = null;
    }

    @ObfuscatedName("bp.w()V")
    public void method1417() {
        for (int var1 = 0; var1 < this.field1251; var1++) {
            int var2 = this.field1246[var1];
            this.field1246[var1] = this.field1248[var1];
            this.field1248[var1] = -var2;
        }
        this.method1436();
    }

    @ObfuscatedName("bp.j()V")
    public void method1418() {
        for (int var1 = 0; var1 < this.field1251; var1++) {
            this.field1246[var1] = -this.field1246[var1];
            this.field1248[var1] = -this.field1248[var1];
        }
        this.method1436();
    }

    @ObfuscatedName("bp.s()V")
    public void method1419() {
        for (int var1 = 0; var1 < this.field1251; var1++) {
            int var2 = this.field1248[var1];
            this.field1248[var1] = this.field1246[var1];
            this.field1246[var1] = -var2;
        }
        this.method1436();
    }

    @ObfuscatedName("bp.q(I)V")
    public void method1413(int arg0) {
        int var2 = field1258[arg0];
        int var3 = field1291[arg0];
        for (int var4 = 0; var4 < this.field1251; var4++) {
            int var5 = this.field1248[var4] * var2 + this.field1246[var4] * var3 >> 16;
            this.field1248[var4] = this.field1248[var4] * var3 - this.field1246[var4] * var2 >> 16;
            this.field1246[var4] = var5;
        }
        this.method1436();
    }

    @ObfuscatedName("bp.y(III)V")
    public void method1421(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1251; var4++) {
            this.field1246[var4] += arg0;
            this.field1247[var4] += arg1;
            this.field1248[var4] += arg2;
        }
        this.method1436();
    }

    @ObfuscatedName("bp.a(SS)V")
    public void method1422(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1290; var3++) {
            if (this.field1280[var3] == arg0) {
                this.field1280[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("bp.v(SS)V")
    public void method1423(short arg0, short arg1) {
        if (this.field1284 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1290; var3++) {
            if (this.field1284[var3] == arg0) {
                this.field1284[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("bp.z()V")
    public void method1424() {
        for (int var1 = 0; var1 < this.field1251; var1++) {
            this.field1248[var1] = -this.field1248[var1];
        }
        for (int var2 = 0; var2 < this.field1290; var2++) {
            int var3 = this.field1250[var2];
            this.field1250[var2] = this.field1252[var2];
            this.field1252[var2] = var3;
        }
        this.method1436();
    }

    @ObfuscatedName("bp.x(III)V")
    public void method1407(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1251; var4++) {
            this.field1246[var4] = this.field1246[var4] * arg0 / 128;
            this.field1247[var4] = this.field1247[var4] * arg1 / 128;
            this.field1248[var4] = this.field1248[var4] * arg2 / 128;
        }
        this.method1436();
    }

    @ObfuscatedName("bp.g()V")
    public void method1426() {
        if (this.field1277 != null) {
            return;
        }
        this.field1277 = new class84[this.field1251];
        for (int var1 = 0; var1 < this.field1251; var1++) {
            this.field1277[var1] = new class84();
        }
        for (int var2 = 0; var2 < this.field1290; var2++) {
            int var3 = this.field1250[var2];
            int var4 = this.field1253[var2];
            int var5 = this.field1252[var2];
            int var6 = this.field1246[var4] - this.field1246[var3];
            int var7 = this.field1247[var4] - this.field1247[var3];
            int var8 = this.field1248[var4] - this.field1248[var3];
            int var9 = this.field1246[var5] - this.field1246[var3];
            int var10 = this.field1247[var5] - this.field1247[var3];
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
            if (this.field1266 == null) {
                var19 = 0;
            } else {
                var19 = this.field1266[var2];
            }
            if (var19 == 0) {
                class84 var20 = this.field1277[var3];
                var20.field1452 += var16;
                var20.field1444 += var17;
                var20.field1445 += var18;
                var20.field1446++;
                class84 var21 = this.field1277[var4];
                var21.field1452 += var16;
                var21.field1444 += var17;
                var21.field1445 += var18;
                var21.field1446++;
                class84 var22 = this.field1277[var5];
                var22.field1452 += var16;
                var22.field1444 += var17;
                var22.field1445 += var18;
                var22.field1446++;
            } else if (var19 == 1) {
                if (this.field1263 == null) {
                    this.field1263 = new class92[this.field1290];
                }
                class92 var23 = this.field1263[var2] = new class92();
                var23.field1586 = var16;
                var23.field1590 = var17;
                var23.field1585 = var18;
            }
        }
    }

    @ObfuscatedName("bp.b()V")
    public void method1436() {
        this.field1277 = null;
        this.field1278 = null;
        this.field1263 = null;
        this.field1283 = false;
    }

    @ObfuscatedName("bp.k()V")
    public void method1430() {
        if (this.field1283) {
            return;
        }
        this.field1564 = 0;
        this.field1257 = 0;
        this.field1269 = 999999;
        this.field1275 = -999999;
        this.field1285 = -99999;
        this.field1286 = 99999;
        for (int var1 = 0; var1 < this.field1251; var1++) {
            int var2 = this.field1246[var1];
            int var3 = this.field1247[var1];
            int var4 = this.field1248[var1];
            if (var2 < this.field1269) {
                this.field1269 = var2;
            }
            if (var2 > this.field1275) {
                this.field1275 = var2;
            }
            if (var4 < this.field1286) {
                this.field1286 = var4;
            }
            if (var4 > this.field1285) {
                this.field1285 = var4;
            }
            if (-var3 > this.field1564) {
                this.field1564 = -var3;
            }
            if (var3 > this.field1257) {
                this.field1257 = var3;
            }
        }
        this.field1283 = true;
    }

    @ObfuscatedName("bp.t(Lbp;Lbp;IIIZ)V")
    public static void method1429(class77 arg0, class77 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1430();
        arg0.method1426();
        arg1.method1430();
        arg1.method1426();
        field1289++;
        int var6 = 0;
        int[] var7 = arg1.field1246;
        int var8 = arg1.field1251;
        for (int var9 = 0; var9 < arg0.field1251; var9++) {
            class84 var10 = arg0.field1277[var9];
            if (var10.field1446 != 0) {
                int var11 = arg0.field1247[var9] - arg3;
                if (var11 <= arg1.field1257) {
                    int var12 = arg0.field1246[var9] - arg2;
                    if (var12 >= arg1.field1269 && var12 <= arg1.field1275) {
                        int var13 = arg0.field1248[var9] - arg4;
                        if (var13 >= arg1.field1286 && var13 <= arg1.field1285) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class84 var15 = arg1.field1277[var14];
                                if (var7[var14] == var12 && arg1.field1248[var14] == var13 && arg1.field1247[var14] == var11 && var15.field1446 != 0) {
                                    if (arg0.field1278 == null) {
                                        arg0.field1278 = new class84[arg0.field1251];
                                    }
                                    if (arg1.field1278 == null) {
                                        arg1.field1278 = new class84[var8];
                                    }
                                    class84 var16 = arg0.field1278[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1278[var9] = new class84(var10);
                                    }
                                    class84 var17 = arg1.field1278[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1278[var14] = new class84(var15);
                                    }
                                    var16.field1452 += var15.field1452;
                                    var16.field1444 += var15.field1444;
                                    var16.field1445 += var15.field1445;
                                    var16.field1446 += var15.field1446;
                                    var17.field1452 += var10.field1452;
                                    var17.field1444 += var10.field1444;
                                    var17.field1445 += var10.field1445;
                                    var17.field1446 += var10.field1446;
                                    var6++;
                                    field1287[var9] = field1289;
                                    field1288[var14] = field1289;
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
        for (int var18 = 0; var18 < arg0.field1290; var18++) {
            if (field1287[arg0.field1250[var18]] == field1289 && field1287[arg0.field1253[var18]] == field1289 && field1287[arg0.field1252[var18]] == field1289) {
                if (arg0.field1266 == null) {
                    arg0.field1266 = new byte[arg0.field1290];
                }
                arg0.field1266[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1290; var19++) {
            if (field1288[arg1.field1250[var19]] == field1289 && field1288[arg1.field1253[var19]] == field1289 && field1288[arg1.field1252[var19]] == field1289) {
                if (arg1.field1266 == null) {
                    arg1.field1266 = new byte[arg1.field1290];
                }
                arg1.field1266[var19] = 2;
            }
        }
    }

    @ObfuscatedName("bp.c(IIIII)Lce;")
    public final class83 method1437(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1426();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class83 var8 = new class83();
        var8.field1389 = new int[this.field1290];
        var8.field1390 = new int[this.field1290];
        var8.field1378 = new int[this.field1290];
        if (this.field1245 > 0 && this.field1256 != null) {
            int[] var9 = new int[this.field1245];
            for (int var10 = 0; var10 < this.field1290; var10++) {
                if (this.field1256[var10] != -1) {
                    var9[this.field1256[var10] & 0xFF]++;
                }
            }
            var8.field1402 = 0;
            for (int var11 = 0; var11 < this.field1245; var11++) {
                if (var9[var11] > 0 && this.field1261[var11] == 0) {
                    var8.field1402++;
                }
            }
            var8.field1398 = new int[var8.field1402];
            var8.field1399 = new int[var8.field1402];
            var8.field1407 = new int[var8.field1402];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1245; var13++) {
                if (var9[var13] > 0 && this.field1261[var13] == 0) {
                    var8.field1398[var12] = this.field1262[var13] & 0xFFFF;
                    var8.field1399[var12] = this.field1260[var13] & 0xFFFF;
                    var8.field1407[var12] = this.field1264[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1388 = new byte[this.field1290];
            for (int var14 = 0; var14 < this.field1290; var14++) {
                if (this.field1256[var14] == -1) {
                    var8.field1388[var14] = -1;
                } else {
                    var8.field1388[var14] = (byte) var9[this.field1256[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1290; var15++) {
            byte var16;
            if (this.field1266 == null) {
                var16 = 0;
            } else {
                var16 = this.field1266[var15];
            }
            byte var17;
            if (this.field1255 == null) {
                var17 = 0;
            } else {
                var17 = this.field1255[var15];
            }
            short var18;
            if (this.field1284 == null) {
                var18 = -1;
            } else {
                var18 = this.field1284[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1280[var15] & 0xFFFF;
                    class84 var20;
                    if (this.field1278 == null || this.field1278[this.field1250[var15]] == null) {
                        var20 = this.field1277[this.field1250[var15]];
                    } else {
                        var20 = this.field1278[this.field1250[var15]];
                    }
                    int var21 = (var20.field1445 * arg4 + var20.field1452 * arg2 + var20.field1444 * arg3) / (var20.field1446 * var7) + arg0;
                    var8.field1389[var15] = method1425(var19, var21);
                    class84 var22;
                    if (this.field1278 == null || this.field1278[this.field1253[var15]] == null) {
                        var22 = this.field1277[this.field1253[var15]];
                    } else {
                        var22 = this.field1278[this.field1253[var15]];
                    }
                    int var23 = (var22.field1445 * arg4 + var22.field1452 * arg2 + var22.field1444 * arg3) / (var22.field1446 * var7) + arg0;
                    var8.field1390[var15] = method1425(var19, var23);
                    class84 var24;
                    if (this.field1278 == null || this.field1278[this.field1252[var15]] == null) {
                        var24 = this.field1277[this.field1252[var15]];
                    } else {
                        var24 = this.field1278[this.field1252[var15]];
                    }
                    int var25 = (var24.field1445 * arg4 + var24.field1452 * arg2 + var24.field1444 * arg3) / (var24.field1446 * var7) + arg0;
                    var8.field1378[var15] = method1425(var19, var25);
                } else if (var16 == 1) {
                    class92 var26 = this.field1263[var15];
                    int var27 = (var26.field1585 * arg4 + var26.field1590 * arg3 + var26.field1586 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1389[var15] = method1425(this.field1280[var15] & 0xFFFF, var27);
                    var8.field1378[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1389[var15] = 128;
                    var8.field1378[var15] = -1;
                } else {
                    var8.field1378[var15] = -2;
                }
            } else if (var16 == 0) {
                class84 var28;
                if (this.field1278 == null || this.field1278[this.field1250[var15]] == null) {
                    var28 = this.field1277[this.field1250[var15]];
                } else {
                    var28 = this.field1278[this.field1250[var15]];
                }
                int var29 = (var28.field1445 * arg4 + var28.field1452 * arg2 + var28.field1444 * arg3) / (var28.field1446 * var7) + arg0;
                var8.field1389[var15] = method1432(var29);
                class84 var30;
                if (this.field1278 == null || this.field1278[this.field1253[var15]] == null) {
                    var30 = this.field1277[this.field1253[var15]];
                } else {
                    var30 = this.field1278[this.field1253[var15]];
                }
                int var31 = (var30.field1445 * arg4 + var30.field1452 * arg2 + var30.field1444 * arg3) / (var30.field1446 * var7) + arg0;
                var8.field1390[var15] = method1432(var31);
                class84 var32;
                if (this.field1278 == null || this.field1278[this.field1252[var15]] == null) {
                    var32 = this.field1277[this.field1252[var15]];
                } else {
                    var32 = this.field1278[this.field1252[var15]];
                }
                int var33 = (var32.field1445 * arg4 + var32.field1452 * arg2 + var32.field1444 * arg3) / (var32.field1446 * var7) + arg0;
                var8.field1378[var15] = method1432(var33);
            } else if (var16 == 1) {
                class92 var34 = this.field1263[var15];
                int var35 = (var34.field1585 * arg4 + var34.field1590 * arg3 + var34.field1586 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1389[var15] = method1432(var35);
                var8.field1378[var15] = -1;
            } else {
                var8.field1378[var15] = -2;
            }
        }
        this.method1416();
        var8.field1381 = this.field1251;
        var8.field1433 = this.field1246;
        var8.field1383 = this.field1247;
        var8.field1384 = this.field1248;
        var8.field1385 = this.field1290;
        var8.field1386 = this.field1250;
        var8.field1415 = this.field1253;
        var8.field1377 = this.field1252;
        var8.field1404 = this.field1254;
        var8.field1393 = this.field1255;
        var8.field1387 = this.field1259;
        var8.field1401 = this.field1274;
        var8.field1406 = this.field1249;
        var8.field1400 = this.field1284;
        return var8;
    }

    @ObfuscatedName("bp.e(II)I")
    public static final int method1425(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("bp.am(I)I")
    public static final int method1432(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
