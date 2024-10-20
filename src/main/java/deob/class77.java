package deob;

@ObfuscatedName("bz")
public class class77 extends class90 {

    @ObfuscatedName("bz.p")
    public int field1243 = 0;

    @ObfuscatedName("bz.g")
    public int[] field1222;

    @ObfuscatedName("bz.x")
    public int[] field1223;

    @ObfuscatedName("bz.q")
    public int[] field1224;

    @ObfuscatedName("bz.d")
    public int field1225 = 0;

    @ObfuscatedName("bz.k")
    public int[] field1258;

    @ObfuscatedName("bz.j")
    public int[] field1245;

    @ObfuscatedName("bz.s")
    public int[] field1228;

    @ObfuscatedName("bz.o")
    public byte[] field1264;

    @ObfuscatedName("bz.a")
    public byte[] field1233;

    @ObfuscatedName("bz.c")
    public byte[] field1231;

    @ObfuscatedName("bz.m")
    public byte[] field1232;

    @ObfuscatedName("bz.h")
    public short[] field1230;

    @ObfuscatedName("bz.r")
    public short[] field1246;

    @ObfuscatedName("bz.u")
    public byte field1235 = 0;

    @ObfuscatedName("bz.i")
    public int field1236;

    @ObfuscatedName("bz.z")
    public byte[] field1229;

    @ObfuscatedName("bz.n")
    public short[] field1238;

    @ObfuscatedName("bz.w")
    public short[] field1257;

    @ObfuscatedName("bz.y")
    public short[] field1239;

    @ObfuscatedName("bz.v")
    public short[] field1241;

    @ObfuscatedName("bz.f")
    public short[] field1242;

    @ObfuscatedName("bz.l")
    public short[] field1247;

    @ObfuscatedName("bz.t")
    public short[] field1244;

    @ObfuscatedName("bz.b")
    public short[] field1221;

    @ObfuscatedName("bz.e")
    public short[] field1263;

    @ObfuscatedName("bz.ai")
    public byte[] field1261;

    @ObfuscatedName("bz.am")
    public int[] field1248;

    @ObfuscatedName("bz.ad")
    public int[] field1249;

    @ObfuscatedName("bz.ah")
    public int[][] field1250;

    @ObfuscatedName("bz.aj")
    public int[][] field1251;

    @ObfuscatedName("bz.ax")
    public class92[] field1252;

    @ObfuscatedName("bz.ak")
    public class84[] field1253;

    @ObfuscatedName("bz.ar")
    public class84[] field1254;

    @ObfuscatedName("bz.aw")
    public short field1255;

    @ObfuscatedName("bz.ay")
    public short field1256;

    @ObfuscatedName("bz.af")
    public boolean field1234 = false;

    @ObfuscatedName("bz.av")
    public int field1226;

    @ObfuscatedName("bz.aa")
    public int field1259;

    @ObfuscatedName("bz.ag")
    public int field1227;

    @ObfuscatedName("bz.ao")
    public int field1240;

    @ObfuscatedName("bz.ab")
    public int field1262;

    @ObfuscatedName("bz.an")
    public static int[] field1260 = new int[10000];

    @ObfuscatedName("bz.ac")
    public static int[] field1237 = new int[10000];

    @ObfuscatedName("bz.al")
    public static int field1265 = 0;

    @ObfuscatedName("bz.ae")
    public static int[] field1266 = class85.field1439;

    @ObfuscatedName("bz.ap")
    public static int[] field1267 = class85.field1453;

    public class77() {
    }

    @ObfuscatedName("bz.p(Lgp;II)Lbz;")
    public static class77 method1361(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3044(arg1, arg2);
        return var3 == null ? null : new class77(var3);
    }

    public class77(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1363(arg0);
        } else {
            this.method1421(arg0);
        }
    }

    @ObfuscatedName("bz.g([B)V")
    public void method1363(byte[] arg0) {
        class154 var2 = new class154(arg0);
        class154 var3 = new class154(arg0);
        class154 var4 = new class154(arg0);
        class154 var5 = new class154(arg0);
        class154 var6 = new class154(arg0);
        class154 var7 = new class154(arg0);
        class154 var8 = new class154(arg0);
        var2.field2098 = arg0.length - 23;
        int var9 = var2.method2595();
        int var10 = var2.method2595();
        int var11 = var2.method2593();
        int var12 = var2.method2593();
        int var13 = var2.method2593();
        int var14 = var2.method2593();
        int var15 = var2.method2593();
        int var16 = var2.method2593();
        int var17 = var2.method2593();
        int var18 = var2.method2595();
        int var19 = var2.method2595();
        int var20 = var2.method2595();
        int var21 = var2.method2595();
        int var22 = var2.method2595();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1229 = new byte[var11];
            var2.field2098 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1229[var26] = var2.method2631();
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
        this.field1243 = var9;
        this.field1225 = var10;
        this.field1236 = var11;
        this.field1222 = new int[var9];
        this.field1223 = new int[var9];
        this.field1224 = new int[var9];
        this.field1258 = new int[var10];
        this.field1245 = new int[var10];
        this.field1228 = new int[var10];
        if (var17 == 1) {
            this.field1248 = new int[var9];
        }
        if (var12 == 1) {
            this.field1264 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1233 = new byte[var10];
        } else {
            this.field1235 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1231 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1249 = new int[var10];
        }
        if (var16 == 1) {
            this.field1246 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1232 = new byte[var10];
        }
        this.field1230 = new short[var10];
        if (var11 > 0) {
            this.field1238 = new short[var11];
            this.field1257 = new short[var11];
            this.field1239 = new short[var11];
            if (var24 > 0) {
                this.field1241 = new short[var24];
                this.field1242 = new short[var24];
                this.field1247 = new short[var24];
                this.field1244 = new short[var24];
                this.field1261 = new byte[var24];
                this.field1221 = new short[var24];
            }
            if (var25 > 0) {
                this.field1263 = new short[var25];
            }
        }
        var2.field2098 = var11;
        var3.field2098 = var44;
        var4.field2098 = var46;
        var5.field2098 = var48;
        var6.field2098 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2593();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2607();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2607();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2607();
            }
            this.field1222[var67] = var64 + var69;
            this.field1223[var67] = var65 + var70;
            this.field1224[var67] = var66 + var71;
            var64 = this.field1222[var67];
            var65 = this.field1223[var67];
            var66 = this.field1224[var67];
            if (var17 == 1) {
                this.field1248[var67] = var6.method2593();
            }
        }
        var2.field2098 = var42;
        var3.field2098 = var31;
        var4.field2098 = var34;
        var5.field2098 = var37;
        var6.field2098 = var35;
        var7.field2098 = var40;
        var8.field2098 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1230[var72] = (short) var2.method2595();
            if (var12 == 1) {
                this.field1264[var72] = var3.method2631();
            }
            if (var13 == 255) {
                this.field1233[var72] = var4.method2631();
            }
            if (var14 == 1) {
                this.field1231[var72] = var5.method2631();
            }
            if (var15 == 1) {
                this.field1249[var72] = var6.method2593();
            }
            if (var16 == 1) {
                this.field1246[var72] = (short) (var7.method2595() - 1);
            }
            if (this.field1232 != null && this.field1246[var72] != -1) {
                this.field1232[var72] = (byte) (var8.method2593() - 1);
            }
        }
        var2.field2098 = var33;
        var3.field2098 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2593();
            if (var78 == 1) {
                var73 = var2.method2607() + var76;
                var74 = var2.method2607() + var73;
                var75 = var2.method2607() + var74;
                var76 = var75;
                this.field1258[var77] = var73;
                this.field1245[var77] = var74;
                this.field1228[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2607() + var76;
                var76 = var75;
                this.field1258[var77] = var73;
                this.field1245[var77] = var74;
                this.field1228[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2607() + var76;
                var76 = var75;
                this.field1258[var77] = var73;
                this.field1245[var77] = var74;
                this.field1228[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2607() + var76;
                var76 = var75;
                this.field1258[var77] = var73;
                this.field1245[var77] = var81;
                this.field1228[var77] = var75;
            }
        }
        var2.field2098 = var50;
        var3.field2098 = var52;
        var4.field2098 = var54;
        var5.field2098 = var56;
        var6.field2098 = var58;
        var7.field2098 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1229[var82] & 0xFF;
            if (var83 == 0) {
                this.field1238[var82] = (short) var2.method2595();
                this.field1257[var82] = (short) var2.method2595();
                this.field1239[var82] = (short) var2.method2595();
            }
            if (var83 == 1) {
                this.field1238[var82] = (short) var3.method2595();
                this.field1257[var82] = (short) var3.method2595();
                this.field1239[var82] = (short) var3.method2595();
                this.field1241[var82] = (short) var4.method2595();
                this.field1242[var82] = (short) var4.method2595();
                this.field1247[var82] = (short) var4.method2595();
                this.field1244[var82] = (short) var5.method2595();
                this.field1261[var82] = var6.method2631();
                this.field1221[var82] = (short) var7.method2595();
            }
            if (var83 == 2) {
                this.field1238[var82] = (short) var3.method2595();
                this.field1257[var82] = (short) var3.method2595();
                this.field1239[var82] = (short) var3.method2595();
                this.field1241[var82] = (short) var4.method2595();
                this.field1242[var82] = (short) var4.method2595();
                this.field1247[var82] = (short) var4.method2595();
                this.field1244[var82] = (short) var5.method2595();
                this.field1261[var82] = var6.method2631();
                this.field1221[var82] = (short) var7.method2595();
                this.field1263[var82] = (short) var7.method2595();
            }
            if (var83 == 3) {
                this.field1238[var82] = (short) var3.method2595();
                this.field1257[var82] = (short) var3.method2595();
                this.field1239[var82] = (short) var3.method2595();
                this.field1241[var82] = (short) var4.method2595();
                this.field1242[var82] = (short) var4.method2595();
                this.field1247[var82] = (short) var4.method2595();
                this.field1244[var82] = (short) var5.method2595();
                this.field1261[var82] = var6.method2631();
                this.field1221[var82] = (short) var7.method2595();
            }
        }
        var2.field2098 = var62;
        int var84 = var2.method2593();
        if (var84 == 0) {
            return;
        }
        new class89();
        var2.method2595();
        var2.method2595();
        var2.method2595();
        var2.method2598();
    }

    @ObfuscatedName("bz.q([B)V")
    public void method1421(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class154 var4 = new class154(arg0);
        class154 var5 = new class154(arg0);
        class154 var6 = new class154(arg0);
        class154 var7 = new class154(arg0);
        class154 var8 = new class154(arg0);
        var4.field2098 = arg0.length - 18;
        int var9 = var4.method2595();
        int var10 = var4.method2595();
        int var11 = var4.method2593();
        int var12 = var4.method2593();
        int var13 = var4.method2593();
        int var14 = var4.method2593();
        int var15 = var4.method2593();
        int var16 = var4.method2593();
        int var17 = var4.method2595();
        int var18 = var4.method2595();
        int var19 = var4.method2595();
        int var20 = var4.method2595();
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
        this.field1243 = var9;
        this.field1225 = var10;
        this.field1236 = var11;
        this.field1222 = new int[var9];
        this.field1223 = new int[var9];
        this.field1224 = new int[var9];
        this.field1258 = new int[var10];
        this.field1245 = new int[var10];
        this.field1228 = new int[var10];
        if (var11 > 0) {
            this.field1229 = new byte[var11];
            this.field1238 = new short[var11];
            this.field1257 = new short[var11];
            this.field1239 = new short[var11];
        }
        if (var16 == 1) {
            this.field1248 = new int[var9];
        }
        if (var12 == 1) {
            this.field1264 = new byte[var10];
            this.field1232 = new byte[var10];
            this.field1246 = new short[var10];
        }
        if (var13 == 255) {
            this.field1233 = new byte[var10];
        } else {
            this.field1235 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1231 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1249 = new int[var10];
        }
        this.field1230 = new short[var10];
        var4.field2098 = var21;
        var5.field2098 = var36;
        var6.field2098 = var38;
        var7.field2098 = var40;
        var8.field2098 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2593();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2607();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2607();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2607();
            }
            this.field1222[var46] = var43 + var48;
            this.field1223[var46] = var44 + var49;
            this.field1224[var46] = var45 + var50;
            var43 = this.field1222[var46];
            var44 = this.field1223[var46];
            var45 = this.field1224[var46];
            if (var16 == 1) {
                this.field1248[var46] = var8.method2593();
            }
        }
        var4.field2098 = var32;
        var5.field2098 = var28;
        var6.field2098 = var26;
        var7.field2098 = var30;
        var8.field2098 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1230[var51] = (short) var4.method2595();
            if (var12 == 1) {
                int var52 = var5.method2593();
                if ((var52 & 0x1) == 1) {
                    this.field1264[var51] = 1;
                    var2 = true;
                } else {
                    this.field1264[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1232[var51] = (byte) (var52 >> 2);
                    this.field1246[var51] = this.field1230[var51];
                    this.field1230[var51] = 127;
                    if (this.field1246[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1232[var51] = -1;
                    this.field1246[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1233[var51] = var6.method2631();
            }
            if (var14 == 1) {
                this.field1231[var51] = var7.method2631();
            }
            if (var15 == 1) {
                this.field1249[var51] = var8.method2593();
            }
        }
        var4.field2098 = var25;
        var5.field2098 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2593();
            if (var58 == 1) {
                var53 = var4.method2607() + var56;
                var54 = var4.method2607() + var53;
                var55 = var4.method2607() + var54;
                var56 = var55;
                this.field1258[var57] = var53;
                this.field1245[var57] = var54;
                this.field1228[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2607() + var56;
                var56 = var55;
                this.field1258[var57] = var53;
                this.field1245[var57] = var54;
                this.field1228[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2607() + var56;
                var56 = var55;
                this.field1258[var57] = var53;
                this.field1245[var57] = var54;
                this.field1228[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2607() + var56;
                var56 = var55;
                this.field1258[var57] = var53;
                this.field1245[var57] = var61;
                this.field1228[var57] = var55;
            }
        }
        var4.field2098 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1229[var62] = 0;
            this.field1238[var62] = (short) var4.method2595();
            this.field1257[var62] = (short) var4.method2595();
            this.field1239[var62] = (short) var4.method2595();
        }
        if (this.field1232 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1232[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1238[var65] & 0xFFFF) == this.field1258[var64] && (this.field1257[var65] & 0xFFFF) == this.field1245[var64] && (this.field1239[var65] & 0xFFFF) == this.field1228[var64]) {
                        this.field1232[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1232 = null;
            }
        }
        if (!var3) {
            this.field1246 = null;
        }
        if (!var2) {
            this.field1264 = null;
        }
    }

    public class77(class77[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1243 = 0;
        this.field1225 = 0;
        this.field1236 = 0;
        this.field1235 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class77 var10 = arg0[var9];
            if (var10 != null) {
                this.field1243 += var10.field1243;
                this.field1225 += var10.field1225;
                this.field1236 += var10.field1236;
                if (var10.field1233 == null) {
                    if (this.field1235 == -1) {
                        this.field1235 = var10.field1235;
                    }
                    if (this.field1235 != var10.field1235) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1264 != null;
                var5 |= var10.field1231 != null;
                var6 |= var10.field1249 != null;
                var7 |= var10.field1246 != null;
                var8 |= var10.field1232 != null;
            }
        }
        this.field1222 = new int[this.field1243];
        this.field1223 = new int[this.field1243];
        this.field1224 = new int[this.field1243];
        this.field1248 = new int[this.field1243];
        this.field1258 = new int[this.field1225];
        this.field1245 = new int[this.field1225];
        this.field1228 = new int[this.field1225];
        if (var3) {
            this.field1264 = new byte[this.field1225];
        }
        if (var4) {
            this.field1233 = new byte[this.field1225];
        }
        if (var5) {
            this.field1231 = new byte[this.field1225];
        }
        if (var6) {
            this.field1249 = new int[this.field1225];
        }
        if (var7) {
            this.field1246 = new short[this.field1225];
        }
        if (var8) {
            this.field1232 = new byte[this.field1225];
        }
        this.field1230 = new short[this.field1225];
        if (this.field1236 > 0) {
            this.field1229 = new byte[this.field1236];
            this.field1238 = new short[this.field1236];
            this.field1257 = new short[this.field1236];
            this.field1239 = new short[this.field1236];
            this.field1241 = new short[this.field1236];
            this.field1242 = new short[this.field1236];
            this.field1247 = new short[this.field1236];
            this.field1244 = new short[this.field1236];
            this.field1261 = new byte[this.field1236];
            this.field1221 = new short[this.field1236];
            this.field1263 = new short[this.field1236];
        }
        this.field1243 = 0;
        this.field1225 = 0;
        this.field1236 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class77 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1225; var13++) {
                    if (var3 && var12.field1264 != null) {
                        this.field1264[this.field1225] = var12.field1264[var13];
                    }
                    if (var4) {
                        if (var12.field1233 == null) {
                            this.field1233[this.field1225] = var12.field1235;
                        } else {
                            this.field1233[this.field1225] = var12.field1233[var13];
                        }
                    }
                    if (var5 && var12.field1231 != null) {
                        this.field1231[this.field1225] = var12.field1231[var13];
                    }
                    if (var6 && var12.field1249 != null) {
                        this.field1249[this.field1225] = var12.field1249[var13];
                    }
                    if (var7) {
                        if (var12.field1246 == null) {
                            this.field1246[this.field1225] = -1;
                        } else {
                            this.field1246[this.field1225] = var12.field1246[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1232 == null || var12.field1232[var13] == -1) {
                            this.field1232[this.field1225] = -1;
                        } else {
                            this.field1232[this.field1225] = (byte) (var12.field1232[var13] + this.field1236);
                        }
                    }
                    this.field1230[this.field1225] = var12.field1230[var13];
                    this.field1258[this.field1225] = this.method1365(var12, var12.field1258[var13]);
                    this.field1245[this.field1225] = this.method1365(var12, var12.field1245[var13]);
                    this.field1228[this.field1225] = this.method1365(var12, var12.field1228[var13]);
                    this.field1225++;
                }
                for (int var14 = 0; var14 < var12.field1236; var14++) {
                    byte var15 = this.field1229[this.field1236] = var12.field1229[var14];
                    if (var15 == 0) {
                        this.field1238[this.field1236] = (short) this.method1365(var12, var12.field1238[var14]);
                        this.field1257[this.field1236] = (short) this.method1365(var12, var12.field1257[var14]);
                        this.field1239[this.field1236] = (short) this.method1365(var12, var12.field1239[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1238[this.field1236] = var12.field1238[var14];
                        this.field1257[this.field1236] = var12.field1257[var14];
                        this.field1239[this.field1236] = var12.field1239[var14];
                        this.field1241[this.field1236] = var12.field1241[var14];
                        this.field1242[this.field1236] = var12.field1242[var14];
                        this.field1247[this.field1236] = var12.field1247[var14];
                        this.field1244[this.field1236] = var12.field1244[var14];
                        this.field1261[this.field1236] = var12.field1261[var14];
                        this.field1221[this.field1236] = var12.field1221[var14];
                    }
                    if (var15 == 2) {
                        this.field1263[this.field1236] = var12.field1263[var14];
                    }
                    this.field1236++;
                }
            }
        }
    }

    @ObfuscatedName("bz.d(Lbz;I)I")
    public final int method1365(class77 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1222[arg1];
        int var5 = arg0.field1223[arg1];
        int var6 = arg0.field1224[arg1];
        for (int var7 = 0; var7 < this.field1243; var7++) {
            if (this.field1222[var7] == var4 && this.field1223[var7] == var5 && this.field1224[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1222[this.field1243] = var4;
            this.field1223[this.field1243] = var5;
            this.field1224[this.field1243] = var6;
            if (arg0.field1248 != null) {
                this.field1248[this.field1243] = arg0.field1248[arg1];
            }
            var3 = this.field1243++;
        }
        return var3;
    }

    public class77(class77 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1243 = arg0.field1243;
        this.field1225 = arg0.field1225;
        this.field1236 = arg0.field1236;
        if (arg1) {
            this.field1222 = arg0.field1222;
            this.field1223 = arg0.field1223;
            this.field1224 = arg0.field1224;
        } else {
            this.field1222 = new int[this.field1243];
            this.field1223 = new int[this.field1243];
            this.field1224 = new int[this.field1243];
            for (int var6 = 0; var6 < this.field1243; var6++) {
                this.field1222[var6] = arg0.field1222[var6];
                this.field1223[var6] = arg0.field1223[var6];
                this.field1224[var6] = arg0.field1224[var6];
            }
        }
        if (arg2) {
            this.field1230 = arg0.field1230;
        } else {
            this.field1230 = new short[this.field1225];
            for (int var7 = 0; var7 < this.field1225; var7++) {
                this.field1230[var7] = arg0.field1230[var7];
            }
        }
        if (arg3 || arg0.field1246 == null) {
            this.field1246 = arg0.field1246;
        } else {
            this.field1246 = new short[this.field1225];
            for (int var8 = 0; var8 < this.field1225; var8++) {
                this.field1246[var8] = arg0.field1246[var8];
            }
        }
        if (arg4) {
            this.field1231 = arg0.field1231;
        } else {
            this.field1231 = new byte[this.field1225];
            if (arg0.field1231 == null) {
                for (int var9 = 0; var9 < this.field1225; var9++) {
                    this.field1231[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1225; var10++) {
                    this.field1231[var10] = arg0.field1231[var10];
                }
            }
        }
        this.field1258 = arg0.field1258;
        this.field1245 = arg0.field1245;
        this.field1228 = arg0.field1228;
        this.field1264 = arg0.field1264;
        this.field1233 = arg0.field1233;
        this.field1232 = arg0.field1232;
        this.field1235 = arg0.field1235;
        this.field1229 = arg0.field1229;
        this.field1238 = arg0.field1238;
        this.field1257 = arg0.field1257;
        this.field1239 = arg0.field1239;
        this.field1241 = arg0.field1241;
        this.field1242 = arg0.field1242;
        this.field1247 = arg0.field1247;
        this.field1244 = arg0.field1244;
        this.field1261 = arg0.field1261;
        this.field1221 = arg0.field1221;
        this.field1263 = arg0.field1263;
        this.field1248 = arg0.field1248;
        this.field1249 = arg0.field1249;
        this.field1250 = arg0.field1250;
        this.field1251 = arg0.field1251;
        this.field1253 = arg0.field1253;
        this.field1252 = arg0.field1252;
        this.field1254 = arg0.field1254;
        this.field1255 = arg0.field1255;
        this.field1256 = arg0.field1256;
    }

    @ObfuscatedName("bz.k()Lbz;")
    public class77 method1366() {
        class77 var1 = new class77();
        if (this.field1264 != null) {
            var1.field1264 = new byte[this.field1225];
            for (int var2 = 0; var2 < this.field1225; var2++) {
                var1.field1264[var2] = this.field1264[var2];
            }
        }
        var1.field1243 = this.field1243;
        var1.field1225 = this.field1225;
        var1.field1236 = this.field1236;
        var1.field1222 = this.field1222;
        var1.field1223 = this.field1223;
        var1.field1224 = this.field1224;
        var1.field1258 = this.field1258;
        var1.field1245 = this.field1245;
        var1.field1228 = this.field1228;
        var1.field1233 = this.field1233;
        var1.field1231 = this.field1231;
        var1.field1232 = this.field1232;
        var1.field1230 = this.field1230;
        var1.field1246 = this.field1246;
        var1.field1235 = this.field1235;
        var1.field1229 = this.field1229;
        var1.field1238 = this.field1238;
        var1.field1257 = this.field1257;
        var1.field1239 = this.field1239;
        var1.field1241 = this.field1241;
        var1.field1242 = this.field1242;
        var1.field1247 = this.field1247;
        var1.field1244 = this.field1244;
        var1.field1261 = this.field1261;
        var1.field1221 = this.field1221;
        var1.field1263 = this.field1263;
        var1.field1248 = this.field1248;
        var1.field1249 = this.field1249;
        var1.field1250 = this.field1250;
        var1.field1251 = this.field1251;
        var1.field1253 = this.field1253;
        var1.field1252 = this.field1252;
        var1.field1255 = this.field1255;
        var1.field1256 = this.field1256;
        return var1;
    }

    @ObfuscatedName("bz.j([[IIIIZI)Lbz;")
    public class77 method1367(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1379();
        int var7 = this.field1259 + arg1;
        int var8 = this.field1227 + arg1;
        int var9 = this.field1262 + arg3;
        int var10 = this.field1240 + arg3;
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
            var15.field1243 = this.field1243;
            var15.field1225 = this.field1225;
            var15.field1236 = this.field1236;
            var15.field1222 = this.field1222;
            var15.field1224 = this.field1224;
            var15.field1258 = this.field1258;
            var15.field1245 = this.field1245;
            var15.field1228 = this.field1228;
            var15.field1264 = this.field1264;
            var15.field1233 = this.field1233;
            var15.field1231 = this.field1231;
            var15.field1232 = this.field1232;
            var15.field1230 = this.field1230;
            var15.field1246 = this.field1246;
            var15.field1235 = this.field1235;
            var15.field1229 = this.field1229;
            var15.field1238 = this.field1238;
            var15.field1257 = this.field1257;
            var15.field1239 = this.field1239;
            var15.field1241 = this.field1241;
            var15.field1242 = this.field1242;
            var15.field1247 = this.field1247;
            var15.field1244 = this.field1244;
            var15.field1261 = this.field1261;
            var15.field1221 = this.field1221;
            var15.field1263 = this.field1263;
            var15.field1248 = this.field1248;
            var15.field1249 = this.field1249;
            var15.field1250 = this.field1250;
            var15.field1251 = this.field1251;
            var15.field1255 = this.field1255;
            var15.field1256 = this.field1256;
            var15.field1223 = new int[var15.field1243];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1243; var16++) {
                int var17 = this.field1222[var16] + arg1;
                int var18 = this.field1224[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1223[var16] = this.field1223[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1243; var26++) {
                int var27 = (-this.field1223[var26] << 16) / this.field1544;
                if (var27 < arg5) {
                    int var28 = this.field1222[var26] + arg1;
                    int var29 = this.field1224[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1223[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1223[var26];
                }
            }
        }
        var15.method1397();
        return var15;
    }

    @ObfuscatedName("bz.s()V")
    public void method1432() {
        int var10002;
        if (this.field1248 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1243; var3++) {
                int var4 = this.field1248[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1250 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1250[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1243) {
                int var7 = this.field1248[var6];
                this.field1250[var7][var1[var7]++] = var6++;
            }
            this.field1248 = null;
        }
        if (this.field1249 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1225; var10++) {
            int var11 = this.field1249[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1251 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1251[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1225) {
            int var14 = this.field1249[var13];
            this.field1251[var14][var8[var14]++] = var13++;
        }
        this.field1249 = null;
    }

    @ObfuscatedName("bz.o()V")
    public void method1369() {
        for (int var1 = 0; var1 < this.field1243; var1++) {
            int var2 = this.field1222[var1];
            this.field1222[var1] = this.field1224[var1];
            this.field1224[var1] = -var2;
        }
        this.method1397();
    }

    @ObfuscatedName("bz.a()V")
    public void method1435() {
        for (int var1 = 0; var1 < this.field1243; var1++) {
            this.field1222[var1] = -this.field1222[var1];
            this.field1224[var1] = -this.field1224[var1];
        }
        this.method1397();
    }

    @ObfuscatedName("bz.c()V")
    public void method1370() {
        for (int var1 = 0; var1 < this.field1243; var1++) {
            int var2 = this.field1224[var1];
            this.field1224[var1] = this.field1222[var1];
            this.field1222[var1] = -var2;
        }
        this.method1397();
    }

    @ObfuscatedName("bz.u(I)V")
    public void method1368(int arg0) {
        int var2 = field1266[arg0];
        int var3 = field1267[arg0];
        for (int var4 = 0; var4 < this.field1243; var4++) {
            int var5 = this.field1224[var4] * var2 + this.field1222[var4] * var3 >> 16;
            this.field1224[var4] = this.field1224[var4] * var3 - this.field1222[var4] * var2 >> 16;
            this.field1222[var4] = var5;
        }
        this.method1397();
    }

    @ObfuscatedName("bz.i(III)V")
    public void method1371(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1243; var4++) {
            this.field1222[var4] += arg0;
            this.field1223[var4] += arg1;
            this.field1224[var4] += arg2;
        }
        this.method1397();
    }

    @ObfuscatedName("bz.z(SS)V")
    public void method1373(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1225; var3++) {
            if (this.field1230[var3] == arg0) {
                this.field1230[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("bz.n(SS)V")
    public void method1374(short arg0, short arg1) {
        if (this.field1246 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1225; var3++) {
            if (this.field1246[var3] == arg0) {
                this.field1246[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("bz.l()V")
    public void method1375() {
        for (int var1 = 0; var1 < this.field1243; var1++) {
            this.field1224[var1] = -this.field1224[var1];
        }
        for (int var2 = 0; var2 < this.field1225; var2++) {
            int var3 = this.field1258[var2];
            this.field1258[var2] = this.field1228[var2];
            this.field1228[var2] = var3;
        }
        this.method1397();
    }

    @ObfuscatedName("bz.t(III)V")
    public void method1418(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1243; var4++) {
            this.field1222[var4] = this.field1222[var4] * arg0 / 128;
            this.field1223[var4] = this.field1223[var4] * arg1 / 128;
            this.field1224[var4] = this.field1224[var4] * arg2 / 128;
        }
        this.method1397();
    }

    @ObfuscatedName("bz.b()V")
    public void method1377() {
        if (this.field1253 != null) {
            return;
        }
        this.field1253 = new class84[this.field1243];
        for (int var1 = 0; var1 < this.field1243; var1++) {
            this.field1253[var1] = new class84();
        }
        for (int var2 = 0; var2 < this.field1225; var2++) {
            int var3 = this.field1258[var2];
            int var4 = this.field1245[var2];
            int var5 = this.field1228[var2];
            int var6 = this.field1222[var4] - this.field1222[var3];
            int var7 = this.field1223[var4] - this.field1223[var3];
            int var8 = this.field1224[var4] - this.field1224[var3];
            int var9 = this.field1222[var5] - this.field1222[var3];
            int var10 = this.field1223[var5] - this.field1223[var3];
            int var11 = this.field1224[var5] - this.field1224[var3];
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
            if (this.field1264 == null) {
                var19 = 0;
            } else {
                var19 = this.field1264[var2];
            }
            if (var19 == 0) {
                class84 var20 = this.field1253[var3];
                var20.field1421 += var16;
                var20.field1423 += var17;
                var20.field1424 += var18;
                var20.field1427++;
                class84 var21 = this.field1253[var4];
                var21.field1421 += var16;
                var21.field1423 += var17;
                var21.field1424 += var18;
                var21.field1427++;
                class84 var22 = this.field1253[var5];
                var22.field1421 += var16;
                var22.field1423 += var17;
                var22.field1424 += var18;
                var22.field1427++;
            } else if (var19 == 1) {
                if (this.field1252 == null) {
                    this.field1252 = new class92[this.field1225];
                }
                class92 var23 = this.field1252[var2] = new class92();
                var23.field1564 = var16;
                var23.field1563 = var17;
                var23.field1568 = var18;
            }
        }
    }

    @ObfuscatedName("bz.e()V")
    public void method1397() {
        this.field1253 = null;
        this.field1254 = null;
        this.field1252 = null;
        this.field1234 = false;
    }

    @ObfuscatedName("bz.ai()V")
    public void method1379() {
        if (this.field1234) {
            return;
        }
        this.field1544 = 0;
        this.field1226 = 0;
        this.field1259 = 999999;
        this.field1227 = -999999;
        this.field1240 = -99999;
        this.field1262 = 99999;
        for (int var1 = 0; var1 < this.field1243; var1++) {
            int var2 = this.field1222[var1];
            int var3 = this.field1223[var1];
            int var4 = this.field1224[var1];
            if (var2 < this.field1259) {
                this.field1259 = var2;
            }
            if (var2 > this.field1227) {
                this.field1227 = var2;
            }
            if (var4 < this.field1262) {
                this.field1262 = var4;
            }
            if (var4 > this.field1240) {
                this.field1240 = var4;
            }
            if (-var3 > this.field1544) {
                this.field1544 = -var3;
            }
            if (var3 > this.field1226) {
                this.field1226 = var3;
            }
        }
        this.field1234 = true;
    }

    @ObfuscatedName("bz.am(Lbz;Lbz;IIIZ)V")
    public static void method1362(class77 arg0, class77 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1379();
        arg0.method1377();
        arg1.method1379();
        arg1.method1377();
        field1265++;
        int var6 = 0;
        int[] var7 = arg1.field1222;
        int var8 = arg1.field1243;
        for (int var9 = 0; var9 < arg0.field1243; var9++) {
            class84 var10 = arg0.field1253[var9];
            if (var10.field1427 != 0) {
                int var11 = arg0.field1223[var9] - arg3;
                if (var11 <= arg1.field1226) {
                    int var12 = arg0.field1222[var9] - arg2;
                    if (var12 >= arg1.field1259 && var12 <= arg1.field1227) {
                        int var13 = arg0.field1224[var9] - arg4;
                        if (var13 >= arg1.field1262 && var13 <= arg1.field1240) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class84 var15 = arg1.field1253[var14];
                                if (var7[var14] == var12 && arg1.field1224[var14] == var13 && arg1.field1223[var14] == var11 && var15.field1427 != 0) {
                                    if (arg0.field1254 == null) {
                                        arg0.field1254 = new class84[arg0.field1243];
                                    }
                                    if (arg1.field1254 == null) {
                                        arg1.field1254 = new class84[var8];
                                    }
                                    class84 var16 = arg0.field1254[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1254[var9] = new class84(var10);
                                    }
                                    class84 var17 = arg1.field1254[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1254[var14] = new class84(var15);
                                    }
                                    var16.field1421 += var15.field1421;
                                    var16.field1423 += var15.field1423;
                                    var16.field1424 += var15.field1424;
                                    var16.field1427 += var15.field1427;
                                    var17.field1421 += var10.field1421;
                                    var17.field1423 += var10.field1423;
                                    var17.field1424 += var10.field1424;
                                    var17.field1427 += var10.field1427;
                                    var6++;
                                    field1260[var9] = field1265;
                                    field1237[var14] = field1265;
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
        for (int var18 = 0; var18 < arg0.field1225; var18++) {
            if (field1260[arg0.field1258[var18]] == field1265 && field1260[arg0.field1245[var18]] == field1265 && field1260[arg0.field1228[var18]] == field1265) {
                if (arg0.field1264 == null) {
                    arg0.field1264 = new byte[arg0.field1225];
                }
                arg0.field1264[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1225; var19++) {
            if (field1237[arg1.field1258[var19]] == field1265 && field1237[arg1.field1245[var19]] == field1265 && field1237[arg1.field1228[var19]] == field1265) {
                if (arg1.field1264 == null) {
                    arg1.field1264 = new byte[arg1.field1225];
                }
                arg1.field1264[var19] = 2;
            }
        }
    }

    @ObfuscatedName("bz.ad(IIIII)Lcw;")
    public final class83 method1381(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1377();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class83 var8 = new class83();
        var8.field1355 = new int[this.field1225];
        var8.field1368 = new int[this.field1225];
        var8.field1370 = new int[this.field1225];
        if (this.field1236 > 0 && this.field1232 != null) {
            int[] var9 = new int[this.field1236];
            for (int var10 = 0; var10 < this.field1225; var10++) {
                if (this.field1232[var10] != -1) {
                    var9[this.field1232[var10] & 0xFF]++;
                }
            }
            var8.field1375 = 0;
            for (int var11 = 0; var11 < this.field1236; var11++) {
                if (var9[var11] > 0 && this.field1229[var11] == 0) {
                    var8.field1375++;
                }
            }
            var8.field1380 = new int[var8.field1375];
            var8.field1407 = new int[var8.field1375];
            var8.field1378 = new int[var8.field1375];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1236; var13++) {
                if (var9[var13] > 0 && this.field1229[var13] == 0) {
                    var8.field1380[var12] = this.field1238[var13] & 0xFFFF;
                    var8.field1407[var12] = this.field1257[var13] & 0xFFFF;
                    var8.field1378[var12] = this.field1239[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1372 = new byte[this.field1225];
            for (int var14 = 0; var14 < this.field1225; var14++) {
                if (this.field1232[var14] == -1) {
                    var8.field1372[var14] = -1;
                } else {
                    var8.field1372[var14] = (byte) var9[this.field1232[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1225; var15++) {
            byte var16;
            if (this.field1264 == null) {
                var16 = 0;
            } else {
                var16 = this.field1264[var15];
            }
            byte var17;
            if (this.field1231 == null) {
                var17 = 0;
            } else {
                var17 = this.field1231[var15];
            }
            short var18;
            if (this.field1246 == null) {
                var18 = -1;
            } else {
                var18 = this.field1246[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1230[var15] & 0xFFFF;
                    class84 var20;
                    if (this.field1254 == null || this.field1254[this.field1258[var15]] == null) {
                        var20 = this.field1253[this.field1258[var15]];
                    } else {
                        var20 = this.field1254[this.field1258[var15]];
                    }
                    int var21 = (var20.field1424 * arg4 + var20.field1423 * arg3 + var20.field1421 * arg2) / (var20.field1427 * var7) + arg0;
                    var8.field1355[var15] = method1382(var19, var21);
                    class84 var22;
                    if (this.field1254 == null || this.field1254[this.field1245[var15]] == null) {
                        var22 = this.field1253[this.field1245[var15]];
                    } else {
                        var22 = this.field1254[this.field1245[var15]];
                    }
                    int var23 = (var22.field1424 * arg4 + var22.field1423 * arg3 + var22.field1421 * arg2) / (var22.field1427 * var7) + arg0;
                    var8.field1368[var15] = method1382(var19, var23);
                    class84 var24;
                    if (this.field1254 == null || this.field1254[this.field1228[var15]] == null) {
                        var24 = this.field1253[this.field1228[var15]];
                    } else {
                        var24 = this.field1254[this.field1228[var15]];
                    }
                    int var25 = (var24.field1424 * arg4 + var24.field1423 * arg3 + var24.field1421 * arg2) / (var24.field1427 * var7) + arg0;
                    var8.field1370[var15] = method1382(var19, var25);
                } else if (var16 == 1) {
                    class92 var26 = this.field1252[var15];
                    int var27 = (var26.field1568 * arg4 + var26.field1564 * arg2 + var26.field1563 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1355[var15] = method1382(this.field1230[var15] & 0xFFFF, var27);
                    var8.field1370[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1355[var15] = 128;
                    var8.field1370[var15] = -1;
                } else {
                    var8.field1370[var15] = -2;
                }
            } else if (var16 == 0) {
                class84 var28;
                if (this.field1254 == null || this.field1254[this.field1258[var15]] == null) {
                    var28 = this.field1253[this.field1258[var15]];
                } else {
                    var28 = this.field1254[this.field1258[var15]];
                }
                int var29 = (var28.field1424 * arg4 + var28.field1423 * arg3 + var28.field1421 * arg2) / (var28.field1427 * var7) + arg0;
                var8.field1355[var15] = method1383(var29);
                class84 var30;
                if (this.field1254 == null || this.field1254[this.field1245[var15]] == null) {
                    var30 = this.field1253[this.field1245[var15]];
                } else {
                    var30 = this.field1254[this.field1245[var15]];
                }
                int var31 = (var30.field1424 * arg4 + var30.field1423 * arg3 + var30.field1421 * arg2) / (var30.field1427 * var7) + arg0;
                var8.field1368[var15] = method1383(var31);
                class84 var32;
                if (this.field1254 == null || this.field1254[this.field1228[var15]] == null) {
                    var32 = this.field1253[this.field1228[var15]];
                } else {
                    var32 = this.field1254[this.field1228[var15]];
                }
                int var33 = (var32.field1424 * arg4 + var32.field1423 * arg3 + var32.field1421 * arg2) / (var32.field1427 * var7) + arg0;
                var8.field1370[var15] = method1383(var33);
            } else if (var16 == 1) {
                class92 var34 = this.field1252[var15];
                int var35 = (var34.field1568 * arg4 + var34.field1564 * arg2 + var34.field1563 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1355[var15] = method1383(var35);
                var8.field1370[var15] = -1;
            } else {
                var8.field1370[var15] = -2;
            }
        }
        this.method1432();
        var8.field1359 = this.field1243;
        var8.field1360 = this.field1222;
        var8.field1376 = this.field1223;
        var8.field1362 = this.field1224;
        var8.field1367 = this.field1225;
        var8.field1363 = this.field1258;
        var8.field1412 = this.field1245;
        var8.field1366 = this.field1228;
        var8.field1416 = this.field1233;
        var8.field1371 = this.field1231;
        var8.field1374 = this.field1235;
        var8.field1379 = this.field1250;
        var8.field1394 = this.field1251;
        var8.field1373 = this.field1246;
        return var8;
    }

    @ObfuscatedName("bz.ah(II)I")
    public static final int method1382(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("bz.aj(I)I")
    public static final int method1383(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
