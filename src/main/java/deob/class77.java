package deob;

@ObfuscatedName("bd")
public class class77 extends class90 {

    @ObfuscatedName("bd.d")
    public int field1248 = 0;

    @ObfuscatedName("bd.c")
    public int[] field1210;

    @ObfuscatedName("bd.n")
    public int[] field1211;

    @ObfuscatedName("bd.q")
    public int[] field1220;

    @ObfuscatedName("bd.t")
    public int field1213 = 0;

    @ObfuscatedName("bd.p")
    public int[] field1218;

    @ObfuscatedName("bd.u")
    public int[] field1215;

    @ObfuscatedName("bd.z")
    public int[] field1216;

    @ObfuscatedName("bd.l")
    public byte[] field1217;

    @ObfuscatedName("bd.v")
    public byte[] field1222;

    @ObfuscatedName("bd.g")
    public byte[] field1251;

    @ObfuscatedName("bd.w")
    public byte[] field1214;

    @ObfuscatedName("bd.r")
    public short[] field1221;

    @ObfuscatedName("bd.s")
    public short[] field1242;

    @ObfuscatedName("bd.k")
    public byte field1223 = 0;

    @ObfuscatedName("bd.e")
    public int field1240;

    @ObfuscatedName("bd.j")
    public byte[] field1225;

    @ObfuscatedName("bd.i")
    public short[] field1226;

    @ObfuscatedName("bd.a")
    public short[] field1243;

    @ObfuscatedName("bd.x")
    public short[] field1227;

    @ObfuscatedName("bd.h")
    public short[] field1229;

    @ObfuscatedName("bd.b")
    public short[] field1230;

    @ObfuscatedName("bd.f")
    public short[] field1231;

    @ObfuscatedName("bd.o")
    public short[] field1232;

    @ObfuscatedName("bd.m")
    public short[] field1233;

    @ObfuscatedName("bd.y")
    public short[] field1234;

    @ObfuscatedName("bd.am")
    public byte[] field1235;

    @ObfuscatedName("bd.ax")
    public int[] field1236;

    @ObfuscatedName("bd.ac")
    public int[] field1239;

    @ObfuscatedName("bd.az")
    public int[][] field1244;

    @ObfuscatedName("bd.ao")
    public int[][] field1209;

    @ObfuscatedName("bd.ak")
    public class92[] field1247;

    @ObfuscatedName("bd.aa")
    public class84[] field1238;

    @ObfuscatedName("bd.aj")
    public class84[] field1224;

    @ObfuscatedName("bd.ay")
    public short field1241;

    @ObfuscatedName("bd.ae")
    public short field1219;

    @ObfuscatedName("bd.aq")
    public boolean field1254 = false;

    @ObfuscatedName("bd.av")
    public int field1246;

    @ObfuscatedName("bd.aw")
    public int field1237;

    @ObfuscatedName("bd.ag")
    public int field1228;

    @ObfuscatedName("bd.af")
    public int field1249;

    @ObfuscatedName("bd.ar")
    public int field1250;

    @ObfuscatedName("bd.ab")
    public static int[] field1245 = new int[10000];

    @ObfuscatedName("bd.as")
    public static int[] field1252 = new int[10000];

    @ObfuscatedName("bd.ai")
    public static int field1253 = 0;

    @ObfuscatedName("bd.ad")
    public static int[] field1212 = class85.field1434;

    @ObfuscatedName("bd.an")
    public static int[] field1255 = class85.field1442;

    public class77() {
    }

    @ObfuscatedName("bd.d(Lgd;II)Lbd;")
    public static class77 method1394(class185 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3129(arg1, arg2);
        return var3 == null ? null : new class77(var3);
    }

    public class77(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1395(arg0);
        } else {
            this.method1426(arg0);
        }
    }

    @ObfuscatedName("bd.c([B)V")
    public void method1395(byte[] arg0) {
        class130 var2 = new class130(arg0);
        class130 var3 = new class130(arg0);
        class130 var4 = new class130(arg0);
        class130 var5 = new class130(arg0);
        class130 var6 = new class130(arg0);
        class130 var7 = new class130(arg0);
        class130 var8 = new class130(arg0);
        var2.field1956 = arg0.length - 23;
        int var9 = var2.method2232();
        int var10 = var2.method2232();
        int var11 = var2.method2379();
        int var12 = var2.method2379();
        int var13 = var2.method2379();
        int var14 = var2.method2379();
        int var15 = var2.method2379();
        int var16 = var2.method2379();
        int var17 = var2.method2379();
        int var18 = var2.method2232();
        int var19 = var2.method2232();
        int var20 = var2.method2232();
        int var21 = var2.method2232();
        int var22 = var2.method2232();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1225 = new byte[var11];
            var2.field1956 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1225[var26] = var2.method2230();
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
        this.field1248 = var9;
        this.field1213 = var10;
        this.field1240 = var11;
        this.field1210 = new int[var9];
        this.field1211 = new int[var9];
        this.field1220 = new int[var9];
        this.field1218 = new int[var10];
        this.field1215 = new int[var10];
        this.field1216 = new int[var10];
        if (var17 == 1) {
            this.field1236 = new int[var9];
        }
        if (var12 == 1) {
            this.field1217 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1222 = new byte[var10];
        } else {
            this.field1223 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1251 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1239 = new int[var10];
        }
        if (var16 == 1) {
            this.field1242 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1214 = new byte[var10];
        }
        this.field1221 = new short[var10];
        if (var11 > 0) {
            this.field1226 = new short[var11];
            this.field1243 = new short[var11];
            this.field1227 = new short[var11];
            if (var24 > 0) {
                this.field1229 = new short[var24];
                this.field1230 = new short[var24];
                this.field1231 = new short[var24];
                this.field1232 = new short[var24];
                this.field1235 = new byte[var24];
                this.field1233 = new short[var24];
            }
            if (var25 > 0) {
                this.field1234 = new short[var25];
            }
        }
        var2.field1956 = var11;
        var3.field1956 = var44;
        var4.field1956 = var46;
        var5.field1956 = var48;
        var6.field1956 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2379();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2241();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2241();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2241();
            }
            this.field1210[var67] = var64 + var69;
            this.field1211[var67] = var65 + var70;
            this.field1220[var67] = var66 + var71;
            var64 = this.field1210[var67];
            var65 = this.field1211[var67];
            var66 = this.field1220[var67];
            if (var17 == 1) {
                this.field1236[var67] = var6.method2379();
            }
        }
        var2.field1956 = var42;
        var3.field1956 = var31;
        var4.field1956 = var34;
        var5.field1956 = var37;
        var6.field1956 = var35;
        var7.field1956 = var40;
        var8.field1956 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1221[var72] = (short) var2.method2232();
            if (var12 == 1) {
                this.field1217[var72] = var3.method2230();
            }
            if (var13 == 255) {
                this.field1222[var72] = var4.method2230();
            }
            if (var14 == 1) {
                this.field1251[var72] = var5.method2230();
            }
            if (var15 == 1) {
                this.field1239[var72] = var6.method2379();
            }
            if (var16 == 1) {
                this.field1242[var72] = (short) (var7.method2232() - 1);
            }
            if (this.field1214 != null && this.field1242[var72] != -1) {
                this.field1214[var72] = (byte) (var8.method2379() - 1);
            }
        }
        var2.field1956 = var33;
        var3.field1956 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2379();
            if (var78 == 1) {
                var73 = var2.method2241() + var76;
                var74 = var2.method2241() + var73;
                var75 = var2.method2241() + var74;
                var76 = var75;
                this.field1218[var77] = var73;
                this.field1215[var77] = var74;
                this.field1216[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2241() + var76;
                var76 = var75;
                this.field1218[var77] = var73;
                this.field1215[var77] = var74;
                this.field1216[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2241() + var76;
                var76 = var75;
                this.field1218[var77] = var73;
                this.field1215[var77] = var74;
                this.field1216[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2241() + var76;
                var76 = var75;
                this.field1218[var77] = var73;
                this.field1215[var77] = var81;
                this.field1216[var77] = var75;
            }
        }
        var2.field1956 = var50;
        var3.field1956 = var52;
        var4.field1956 = var54;
        var5.field1956 = var56;
        var6.field1956 = var58;
        var7.field1956 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1225[var82] & 0xFF;
            if (var83 == 0) {
                this.field1226[var82] = (short) var2.method2232();
                this.field1243[var82] = (short) var2.method2232();
                this.field1227[var82] = (short) var2.method2232();
            }
            if (var83 == 1) {
                this.field1226[var82] = (short) var3.method2232();
                this.field1243[var82] = (short) var3.method2232();
                this.field1227[var82] = (short) var3.method2232();
                this.field1229[var82] = (short) var4.method2232();
                this.field1230[var82] = (short) var4.method2232();
                this.field1231[var82] = (short) var4.method2232();
                this.field1232[var82] = (short) var5.method2232();
                this.field1235[var82] = var6.method2230();
                this.field1233[var82] = (short) var7.method2232();
            }
            if (var83 == 2) {
                this.field1226[var82] = (short) var3.method2232();
                this.field1243[var82] = (short) var3.method2232();
                this.field1227[var82] = (short) var3.method2232();
                this.field1229[var82] = (short) var4.method2232();
                this.field1230[var82] = (short) var4.method2232();
                this.field1231[var82] = (short) var4.method2232();
                this.field1232[var82] = (short) var5.method2232();
                this.field1235[var82] = var6.method2230();
                this.field1233[var82] = (short) var7.method2232();
                this.field1234[var82] = (short) var7.method2232();
            }
            if (var83 == 3) {
                this.field1226[var82] = (short) var3.method2232();
                this.field1243[var82] = (short) var3.method2232();
                this.field1227[var82] = (short) var3.method2232();
                this.field1229[var82] = (short) var4.method2232();
                this.field1230[var82] = (short) var4.method2232();
                this.field1231[var82] = (short) var4.method2232();
                this.field1232[var82] = (short) var5.method2232();
                this.field1235[var82] = var6.method2230();
                this.field1233[var82] = (short) var7.method2232();
            }
        }
        var2.field1956 = var62;
        int var84 = var2.method2379();
        if (var84 == 0) {
            return;
        }
        new class89();
        var2.method2232();
        var2.method2232();
        var2.method2232();
        var2.method2246();
    }

    @ObfuscatedName("bd.q([B)V")
    public void method1426(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class130 var4 = new class130(arg0);
        class130 var5 = new class130(arg0);
        class130 var6 = new class130(arg0);
        class130 var7 = new class130(arg0);
        class130 var8 = new class130(arg0);
        var4.field1956 = arg0.length - 18;
        int var9 = var4.method2232();
        int var10 = var4.method2232();
        int var11 = var4.method2379();
        int var12 = var4.method2379();
        int var13 = var4.method2379();
        int var14 = var4.method2379();
        int var15 = var4.method2379();
        int var16 = var4.method2379();
        int var17 = var4.method2232();
        int var18 = var4.method2232();
        int var19 = var4.method2232();
        int var20 = var4.method2232();
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
        this.field1248 = var9;
        this.field1213 = var10;
        this.field1240 = var11;
        this.field1210 = new int[var9];
        this.field1211 = new int[var9];
        this.field1220 = new int[var9];
        this.field1218 = new int[var10];
        this.field1215 = new int[var10];
        this.field1216 = new int[var10];
        if (var11 > 0) {
            this.field1225 = new byte[var11];
            this.field1226 = new short[var11];
            this.field1243 = new short[var11];
            this.field1227 = new short[var11];
        }
        if (var16 == 1) {
            this.field1236 = new int[var9];
        }
        if (var12 == 1) {
            this.field1217 = new byte[var10];
            this.field1214 = new byte[var10];
            this.field1242 = new short[var10];
        }
        if (var13 == 255) {
            this.field1222 = new byte[var10];
        } else {
            this.field1223 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1251 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1239 = new int[var10];
        }
        this.field1221 = new short[var10];
        var4.field1956 = var21;
        var5.field1956 = var36;
        var6.field1956 = var38;
        var7.field1956 = var40;
        var8.field1956 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2379();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2241();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2241();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2241();
            }
            this.field1210[var46] = var43 + var48;
            this.field1211[var46] = var44 + var49;
            this.field1220[var46] = var45 + var50;
            var43 = this.field1210[var46];
            var44 = this.field1211[var46];
            var45 = this.field1220[var46];
            if (var16 == 1) {
                this.field1236[var46] = var8.method2379();
            }
        }
        var4.field1956 = var32;
        var5.field1956 = var28;
        var6.field1956 = var26;
        var7.field1956 = var30;
        var8.field1956 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1221[var51] = (short) var4.method2232();
            if (var12 == 1) {
                int var52 = var5.method2379();
                if ((var52 & 0x1) == 1) {
                    this.field1217[var51] = 1;
                    var2 = true;
                } else {
                    this.field1217[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1214[var51] = (byte) (var52 >> 2);
                    this.field1242[var51] = this.field1221[var51];
                    this.field1221[var51] = 127;
                    if (this.field1242[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1214[var51] = -1;
                    this.field1242[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1222[var51] = var6.method2230();
            }
            if (var14 == 1) {
                this.field1251[var51] = var7.method2230();
            }
            if (var15 == 1) {
                this.field1239[var51] = var8.method2379();
            }
        }
        var4.field1956 = var25;
        var5.field1956 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2379();
            if (var58 == 1) {
                var53 = var4.method2241() + var56;
                var54 = var4.method2241() + var53;
                var55 = var4.method2241() + var54;
                var56 = var55;
                this.field1218[var57] = var53;
                this.field1215[var57] = var54;
                this.field1216[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2241() + var56;
                var56 = var55;
                this.field1218[var57] = var53;
                this.field1215[var57] = var54;
                this.field1216[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2241() + var56;
                var56 = var55;
                this.field1218[var57] = var53;
                this.field1215[var57] = var54;
                this.field1216[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2241() + var56;
                var56 = var55;
                this.field1218[var57] = var53;
                this.field1215[var57] = var61;
                this.field1216[var57] = var55;
            }
        }
        var4.field1956 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1225[var62] = 0;
            this.field1226[var62] = (short) var4.method2232();
            this.field1243[var62] = (short) var4.method2232();
            this.field1227[var62] = (short) var4.method2232();
        }
        if (this.field1214 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1214[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1226[var65] & 0xFFFF) == this.field1218[var64] && (this.field1243[var65] & 0xFFFF) == this.field1215[var64] && (this.field1227[var65] & 0xFFFF) == this.field1216[var64]) {
                        this.field1214[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1214 = null;
            }
        }
        if (!var3) {
            this.field1242 = null;
        }
        if (!var2) {
            this.field1217 = null;
        }
    }

    public class77(class77[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1248 = 0;
        this.field1213 = 0;
        this.field1240 = 0;
        this.field1223 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class77 var10 = arg0[var9];
            if (var10 != null) {
                this.field1248 += var10.field1248;
                this.field1213 += var10.field1213;
                this.field1240 += var10.field1240;
                if (var10.field1222 == null) {
                    if (this.field1223 == -1) {
                        this.field1223 = var10.field1223;
                    }
                    if (this.field1223 != var10.field1223) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1217 != null;
                var5 |= var10.field1251 != null;
                var6 |= var10.field1239 != null;
                var7 |= var10.field1242 != null;
                var8 |= var10.field1214 != null;
            }
        }
        this.field1210 = new int[this.field1248];
        this.field1211 = new int[this.field1248];
        this.field1220 = new int[this.field1248];
        this.field1236 = new int[this.field1248];
        this.field1218 = new int[this.field1213];
        this.field1215 = new int[this.field1213];
        this.field1216 = new int[this.field1213];
        if (var3) {
            this.field1217 = new byte[this.field1213];
        }
        if (var4) {
            this.field1222 = new byte[this.field1213];
        }
        if (var5) {
            this.field1251 = new byte[this.field1213];
        }
        if (var6) {
            this.field1239 = new int[this.field1213];
        }
        if (var7) {
            this.field1242 = new short[this.field1213];
        }
        if (var8) {
            this.field1214 = new byte[this.field1213];
        }
        this.field1221 = new short[this.field1213];
        if (this.field1240 > 0) {
            this.field1225 = new byte[this.field1240];
            this.field1226 = new short[this.field1240];
            this.field1243 = new short[this.field1240];
            this.field1227 = new short[this.field1240];
            this.field1229 = new short[this.field1240];
            this.field1230 = new short[this.field1240];
            this.field1231 = new short[this.field1240];
            this.field1232 = new short[this.field1240];
            this.field1235 = new byte[this.field1240];
            this.field1233 = new short[this.field1240];
            this.field1234 = new short[this.field1240];
        }
        this.field1248 = 0;
        this.field1213 = 0;
        this.field1240 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class77 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1213; var13++) {
                    if (var3 && var12.field1217 != null) {
                        this.field1217[this.field1213] = var12.field1217[var13];
                    }
                    if (var4) {
                        if (var12.field1222 == null) {
                            this.field1222[this.field1213] = var12.field1223;
                        } else {
                            this.field1222[this.field1213] = var12.field1222[var13];
                        }
                    }
                    if (var5 && var12.field1251 != null) {
                        this.field1251[this.field1213] = var12.field1251[var13];
                    }
                    if (var6 && var12.field1239 != null) {
                        this.field1239[this.field1213] = var12.field1239[var13];
                    }
                    if (var7) {
                        if (var12.field1242 == null) {
                            this.field1242[this.field1213] = -1;
                        } else {
                            this.field1242[this.field1213] = var12.field1242[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1214 == null || var12.field1214[var13] == -1) {
                            this.field1214[this.field1213] = -1;
                        } else {
                            this.field1214[this.field1213] = (byte) (var12.field1214[var13] + this.field1240);
                        }
                    }
                    this.field1221[this.field1213] = var12.field1221[var13];
                    this.field1218[this.field1213] = this.method1440(var12, var12.field1218[var13]);
                    this.field1215[this.field1213] = this.method1440(var12, var12.field1215[var13]);
                    this.field1216[this.field1213] = this.method1440(var12, var12.field1216[var13]);
                    this.field1213++;
                }
                for (int var14 = 0; var14 < var12.field1240; var14++) {
                    byte var15 = this.field1225[this.field1240] = var12.field1225[var14];
                    if (var15 == 0) {
                        this.field1226[this.field1240] = (short) this.method1440(var12, var12.field1226[var14]);
                        this.field1243[this.field1240] = (short) this.method1440(var12, var12.field1243[var14]);
                        this.field1227[this.field1240] = (short) this.method1440(var12, var12.field1227[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1226[this.field1240] = var12.field1226[var14];
                        this.field1243[this.field1240] = var12.field1243[var14];
                        this.field1227[this.field1240] = var12.field1227[var14];
                        this.field1229[this.field1240] = var12.field1229[var14];
                        this.field1230[this.field1240] = var12.field1230[var14];
                        this.field1231[this.field1240] = var12.field1231[var14];
                        this.field1232[this.field1240] = var12.field1232[var14];
                        this.field1235[this.field1240] = var12.field1235[var14];
                        this.field1233[this.field1240] = var12.field1233[var14];
                    }
                    if (var15 == 2) {
                        this.field1234[this.field1240] = var12.field1234[var14];
                    }
                    this.field1240++;
                }
            }
        }
    }

    @ObfuscatedName("bd.t(Lbd;I)I")
    public final int method1440(class77 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1210[arg1];
        int var5 = arg0.field1211[arg1];
        int var6 = arg0.field1220[arg1];
        for (int var7 = 0; var7 < this.field1248; var7++) {
            if (this.field1210[var7] == var4 && this.field1211[var7] == var5 && this.field1220[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1210[this.field1248] = var4;
            this.field1211[this.field1248] = var5;
            this.field1220[this.field1248] = var6;
            if (arg0.field1236 != null) {
                this.field1236[this.field1248] = arg0.field1236[arg1];
            }
            var3 = this.field1248++;
        }
        return var3;
    }

    public class77(class77 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1248 = arg0.field1248;
        this.field1213 = arg0.field1213;
        this.field1240 = arg0.field1240;
        if (arg1) {
            this.field1210 = arg0.field1210;
            this.field1211 = arg0.field1211;
            this.field1220 = arg0.field1220;
        } else {
            this.field1210 = new int[this.field1248];
            this.field1211 = new int[this.field1248];
            this.field1220 = new int[this.field1248];
            for (int var6 = 0; var6 < this.field1248; var6++) {
                this.field1210[var6] = arg0.field1210[var6];
                this.field1211[var6] = arg0.field1211[var6];
                this.field1220[var6] = arg0.field1220[var6];
            }
        }
        if (arg2) {
            this.field1221 = arg0.field1221;
        } else {
            this.field1221 = new short[this.field1213];
            for (int var7 = 0; var7 < this.field1213; var7++) {
                this.field1221[var7] = arg0.field1221[var7];
            }
        }
        if (arg3 || arg0.field1242 == null) {
            this.field1242 = arg0.field1242;
        } else {
            this.field1242 = new short[this.field1213];
            for (int var8 = 0; var8 < this.field1213; var8++) {
                this.field1242[var8] = arg0.field1242[var8];
            }
        }
        if (arg4) {
            this.field1251 = arg0.field1251;
        } else {
            this.field1251 = new byte[this.field1213];
            if (arg0.field1251 == null) {
                for (int var9 = 0; var9 < this.field1213; var9++) {
                    this.field1251[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1213; var10++) {
                    this.field1251[var10] = arg0.field1251[var10];
                }
            }
        }
        this.field1218 = arg0.field1218;
        this.field1215 = arg0.field1215;
        this.field1216 = arg0.field1216;
        this.field1217 = arg0.field1217;
        this.field1222 = arg0.field1222;
        this.field1214 = arg0.field1214;
        this.field1223 = arg0.field1223;
        this.field1225 = arg0.field1225;
        this.field1226 = arg0.field1226;
        this.field1243 = arg0.field1243;
        this.field1227 = arg0.field1227;
        this.field1229 = arg0.field1229;
        this.field1230 = arg0.field1230;
        this.field1231 = arg0.field1231;
        this.field1232 = arg0.field1232;
        this.field1235 = arg0.field1235;
        this.field1233 = arg0.field1233;
        this.field1234 = arg0.field1234;
        this.field1236 = arg0.field1236;
        this.field1239 = arg0.field1239;
        this.field1244 = arg0.field1244;
        this.field1209 = arg0.field1209;
        this.field1238 = arg0.field1238;
        this.field1247 = arg0.field1247;
        this.field1224 = arg0.field1224;
        this.field1241 = arg0.field1241;
        this.field1219 = arg0.field1219;
    }

    @ObfuscatedName("bd.p()Lbd;")
    public class77 method1422() {
        class77 var1 = new class77();
        if (this.field1217 != null) {
            var1.field1217 = new byte[this.field1213];
            for (int var2 = 0; var2 < this.field1213; var2++) {
                var1.field1217[var2] = this.field1217[var2];
            }
        }
        var1.field1248 = this.field1248;
        var1.field1213 = this.field1213;
        var1.field1240 = this.field1240;
        var1.field1210 = this.field1210;
        var1.field1211 = this.field1211;
        var1.field1220 = this.field1220;
        var1.field1218 = this.field1218;
        var1.field1215 = this.field1215;
        var1.field1216 = this.field1216;
        var1.field1222 = this.field1222;
        var1.field1251 = this.field1251;
        var1.field1214 = this.field1214;
        var1.field1221 = this.field1221;
        var1.field1242 = this.field1242;
        var1.field1223 = this.field1223;
        var1.field1225 = this.field1225;
        var1.field1226 = this.field1226;
        var1.field1243 = this.field1243;
        var1.field1227 = this.field1227;
        var1.field1229 = this.field1229;
        var1.field1230 = this.field1230;
        var1.field1231 = this.field1231;
        var1.field1232 = this.field1232;
        var1.field1235 = this.field1235;
        var1.field1233 = this.field1233;
        var1.field1234 = this.field1234;
        var1.field1236 = this.field1236;
        var1.field1239 = this.field1239;
        var1.field1244 = this.field1244;
        var1.field1209 = this.field1209;
        var1.field1238 = this.field1238;
        var1.field1247 = this.field1247;
        var1.field1241 = this.field1241;
        var1.field1219 = this.field1219;
        return var1;
    }

    @ObfuscatedName("bd.u([[IIIIZI)Lbd;")
    public class77 method1399(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1412();
        int var7 = this.field1237 + arg1;
        int var8 = this.field1228 + arg1;
        int var9 = this.field1250 + arg3;
        int var10 = this.field1249 + arg3;
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
            var15.field1248 = this.field1248;
            var15.field1213 = this.field1213;
            var15.field1240 = this.field1240;
            var15.field1210 = this.field1210;
            var15.field1220 = this.field1220;
            var15.field1218 = this.field1218;
            var15.field1215 = this.field1215;
            var15.field1216 = this.field1216;
            var15.field1217 = this.field1217;
            var15.field1222 = this.field1222;
            var15.field1251 = this.field1251;
            var15.field1214 = this.field1214;
            var15.field1221 = this.field1221;
            var15.field1242 = this.field1242;
            var15.field1223 = this.field1223;
            var15.field1225 = this.field1225;
            var15.field1226 = this.field1226;
            var15.field1243 = this.field1243;
            var15.field1227 = this.field1227;
            var15.field1229 = this.field1229;
            var15.field1230 = this.field1230;
            var15.field1231 = this.field1231;
            var15.field1232 = this.field1232;
            var15.field1235 = this.field1235;
            var15.field1233 = this.field1233;
            var15.field1234 = this.field1234;
            var15.field1236 = this.field1236;
            var15.field1239 = this.field1239;
            var15.field1244 = this.field1244;
            var15.field1209 = this.field1209;
            var15.field1241 = this.field1241;
            var15.field1219 = this.field1219;
            var15.field1211 = new int[var15.field1248];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1248; var16++) {
                int var17 = this.field1210[var16] + arg1;
                int var18 = this.field1220[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1211[var16] = this.field1211[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1248; var26++) {
                int var27 = (-this.field1211[var26] << 16) / this.field1532;
                if (var27 < arg5) {
                    int var28 = this.field1210[var26] + arg1;
                    int var29 = this.field1220[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1211[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1211[var26];
                }
            }
        }
        var15.method1405();
        return var15;
    }

    @ObfuscatedName("bd.w()V")
    public void method1445() {
        int var10002;
        if (this.field1236 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1248; var3++) {
                int var4 = this.field1236[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1244 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1244[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1248) {
                int var7 = this.field1236[var6];
                this.field1244[var7][var1[var7]++] = var6++;
            }
            this.field1236 = null;
        }
        if (this.field1239 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1213; var10++) {
            int var11 = this.field1239[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1209 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1209[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1213) {
            int var14 = this.field1239[var13];
            this.field1209[var14][var8[var14]++] = var13++;
        }
        this.field1239 = null;
    }

    @ObfuscatedName("bd.r()V")
    public void method1457() {
        for (int var1 = 0; var1 < this.field1248; var1++) {
            int var2 = this.field1210[var1];
            this.field1210[var1] = this.field1220[var1];
            this.field1220[var1] = -var2;
        }
        this.method1405();
    }

    @ObfuscatedName("bd.s()V")
    public void method1402() {
        for (int var1 = 0; var1 < this.field1248; var1++) {
            this.field1210[var1] = -this.field1210[var1];
            this.field1220[var1] = -this.field1220[var1];
        }
        this.method1405();
    }

    @ObfuscatedName("bd.a()V")
    public void method1403() {
        for (int var1 = 0; var1 < this.field1248; var1++) {
            int var2 = this.field1220[var1];
            this.field1220[var1] = this.field1210[var1];
            this.field1210[var1] = -var2;
        }
        this.method1405();
    }

    @ObfuscatedName("bd.x(I)V")
    public void method1404(int arg0) {
        int var2 = field1212[arg0];
        int var3 = field1255[arg0];
        for (int var4 = 0; var4 < this.field1248; var4++) {
            int var5 = this.field1220[var4] * var2 + this.field1210[var4] * var3 >> 16;
            this.field1220[var4] = this.field1220[var4] * var3 - this.field1210[var4] * var2 >> 16;
            this.field1210[var4] = var5;
        }
        this.method1405();
    }

    @ObfuscatedName("bd.h(III)V")
    public void method1450(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1248; var4++) {
            this.field1210[var4] += arg0;
            this.field1211[var4] += arg1;
            this.field1220[var4] += arg2;
        }
        this.method1405();
    }

    @ObfuscatedName("bd.b(SS)V")
    public void method1406(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1213; var3++) {
            if (this.field1221[var3] == arg0) {
                this.field1221[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("bd.f(SS)V")
    public void method1407(short arg0, short arg1) {
        if (this.field1242 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1213; var3++) {
            if (this.field1242[var3] == arg0) {
                this.field1242[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("bd.o()V")
    public void method1408() {
        for (int var1 = 0; var1 < this.field1248; var1++) {
            this.field1220[var1] = -this.field1220[var1];
        }
        for (int var2 = 0; var2 < this.field1213; var2++) {
            int var3 = this.field1218[var2];
            this.field1218[var2] = this.field1216[var2];
            this.field1216[var2] = var3;
        }
        this.method1405();
    }

    @ObfuscatedName("bd.m(III)V")
    public void method1409(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1248; var4++) {
            this.field1210[var4] = this.field1210[var4] * arg0 / 128;
            this.field1211[var4] = this.field1211[var4] * arg1 / 128;
            this.field1220[var4] = this.field1220[var4] * arg2 / 128;
        }
        this.method1405();
    }

    @ObfuscatedName("bd.y()V")
    public void method1393() {
        if (this.field1238 != null) {
            return;
        }
        this.field1238 = new class84[this.field1248];
        for (int var1 = 0; var1 < this.field1248; var1++) {
            this.field1238[var1] = new class84();
        }
        for (int var2 = 0; var2 < this.field1213; var2++) {
            int var3 = this.field1218[var2];
            int var4 = this.field1215[var2];
            int var5 = this.field1216[var2];
            int var6 = this.field1210[var4] - this.field1210[var3];
            int var7 = this.field1211[var4] - this.field1211[var3];
            int var8 = this.field1220[var4] - this.field1220[var3];
            int var9 = this.field1210[var5] - this.field1210[var3];
            int var10 = this.field1211[var5] - this.field1211[var3];
            int var11 = this.field1220[var5] - this.field1220[var3];
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
            if (this.field1217 == null) {
                var19 = 0;
            } else {
                var19 = this.field1217[var2];
            }
            if (var19 == 0) {
                class84 var20 = this.field1238[var3];
                var20.field1414 += var16;
                var20.field1412 += var17;
                var20.field1416 += var18;
                var20.field1413++;
                class84 var21 = this.field1238[var4];
                var21.field1414 += var16;
                var21.field1412 += var17;
                var21.field1416 += var18;
                var21.field1413++;
                class84 var22 = this.field1238[var5];
                var22.field1414 += var16;
                var22.field1412 += var17;
                var22.field1416 += var18;
                var22.field1413++;
            } else if (var19 == 1) {
                if (this.field1247 == null) {
                    this.field1247 = new class92[this.field1213];
                }
                class92 var23 = this.field1247[var2] = new class92();
                var23.field1549 = var16;
                var23.field1548 = var17;
                var23.field1547 = var18;
            }
        }
    }

    @ObfuscatedName("bd.am()V")
    public void method1405() {
        this.field1238 = null;
        this.field1224 = null;
        this.field1247 = null;
        this.field1254 = false;
    }

    @ObfuscatedName("bd.ax()V")
    public void method1412() {
        if (this.field1254) {
            return;
        }
        this.field1532 = 0;
        this.field1246 = 0;
        this.field1237 = 999999;
        this.field1228 = -999999;
        this.field1249 = -99999;
        this.field1250 = 99999;
        for (int var1 = 0; var1 < this.field1248; var1++) {
            int var2 = this.field1210[var1];
            int var3 = this.field1211[var1];
            int var4 = this.field1220[var1];
            if (var2 < this.field1237) {
                this.field1237 = var2;
            }
            if (var2 > this.field1228) {
                this.field1228 = var2;
            }
            if (var4 < this.field1250) {
                this.field1250 = var4;
            }
            if (var4 > this.field1249) {
                this.field1249 = var4;
            }
            if (-var3 > this.field1532) {
                this.field1532 = -var3;
            }
            if (var3 > this.field1246) {
                this.field1246 = var3;
            }
        }
        this.field1254 = true;
    }

    @ObfuscatedName("bd.ac(Lbd;Lbd;IIIZ)V")
    public static void method1429(class77 arg0, class77 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1412();
        arg0.method1393();
        arg1.method1412();
        arg1.method1393();
        field1253++;
        int var6 = 0;
        int[] var7 = arg1.field1210;
        int var8 = arg1.field1248;
        for (int var9 = 0; var9 < arg0.field1248; var9++) {
            class84 var10 = arg0.field1238[var9];
            if (var10.field1413 != 0) {
                int var11 = arg0.field1211[var9] - arg3;
                if (var11 <= arg1.field1246) {
                    int var12 = arg0.field1210[var9] - arg2;
                    if (var12 >= arg1.field1237 && var12 <= arg1.field1228) {
                        int var13 = arg0.field1220[var9] - arg4;
                        if (var13 >= arg1.field1250 && var13 <= arg1.field1249) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class84 var15 = arg1.field1238[var14];
                                if (var7[var14] == var12 && arg1.field1220[var14] == var13 && arg1.field1211[var14] == var11 && var15.field1413 != 0) {
                                    if (arg0.field1224 == null) {
                                        arg0.field1224 = new class84[arg0.field1248];
                                    }
                                    if (arg1.field1224 == null) {
                                        arg1.field1224 = new class84[var8];
                                    }
                                    class84 var16 = arg0.field1224[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1224[var9] = new class84(var10);
                                    }
                                    class84 var17 = arg1.field1224[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1224[var14] = new class84(var15);
                                    }
                                    var16.field1414 += var15.field1414;
                                    var16.field1412 += var15.field1412;
                                    var16.field1416 += var15.field1416;
                                    var16.field1413 += var15.field1413;
                                    var17.field1414 += var10.field1414;
                                    var17.field1412 += var10.field1412;
                                    var17.field1416 += var10.field1416;
                                    var17.field1413 += var10.field1413;
                                    var6++;
                                    field1245[var9] = field1253;
                                    field1252[var14] = field1253;
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
        for (int var18 = 0; var18 < arg0.field1213; var18++) {
            if (field1245[arg0.field1218[var18]] == field1253 && field1245[arg0.field1215[var18]] == field1253 && field1245[arg0.field1216[var18]] == field1253) {
                if (arg0.field1217 == null) {
                    arg0.field1217 = new byte[arg0.field1213];
                }
                arg0.field1217[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1213; var19++) {
            if (field1252[arg1.field1218[var19]] == field1253 && field1252[arg1.field1215[var19]] == field1253 && field1252[arg1.field1216[var19]] == field1253) {
                if (arg1.field1217 == null) {
                    arg1.field1217 = new byte[arg1.field1213];
                }
                arg1.field1217[var19] = 2;
            }
        }
    }

    @ObfuscatedName("bd.az(IIIII)Lcf;")
    public final class83 method1417(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1393();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class83 var8 = new class83();
        var8.field1357 = new int[this.field1213];
        var8.field1358 = new int[this.field1213];
        var8.field1365 = new int[this.field1213];
        if (this.field1240 > 0 && this.field1214 != null) {
            int[] var9 = new int[this.field1240];
            for (int var10 = 0; var10 < this.field1213; var10++) {
                if (this.field1214[var10] != -1) {
                    var9[this.field1214[var10] & 0xFF]++;
                }
            }
            var8.field1349 = 0;
            for (int var11 = 0; var11 < this.field1240; var11++) {
                if (var9[var11] > 0 && this.field1225[var11] == 0) {
                    var8.field1349++;
                }
            }
            var8.field1384 = new int[var8.field1349];
            var8.field1359 = new int[var8.field1349];
            var8.field1373 = new int[var8.field1349];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1240; var13++) {
                if (var9[var13] > 0 && this.field1225[var13] == 0) {
                    var8.field1384[var12] = this.field1226[var13] & 0xFFFF;
                    var8.field1359[var12] = this.field1243[var13] & 0xFFFF;
                    var8.field1373[var12] = this.field1227[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1362 = new byte[this.field1213];
            for (int var14 = 0; var14 < this.field1213; var14++) {
                if (this.field1214[var14] == -1) {
                    var8.field1362[var14] = -1;
                } else {
                    var8.field1362[var14] = (byte) var9[this.field1214[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1213; var15++) {
            byte var16;
            if (this.field1217 == null) {
                var16 = 0;
            } else {
                var16 = this.field1217[var15];
            }
            byte var17;
            if (this.field1251 == null) {
                var17 = 0;
            } else {
                var17 = this.field1251[var15];
            }
            short var18;
            if (this.field1242 == null) {
                var18 = -1;
            } else {
                var18 = this.field1242[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1221[var15] & 0xFFFF;
                    class84 var20;
                    if (this.field1224 == null || this.field1224[this.field1218[var15]] == null) {
                        var20 = this.field1238[this.field1218[var15]];
                    } else {
                        var20 = this.field1224[this.field1218[var15]];
                    }
                    int var21 = (var20.field1416 * arg4 + var20.field1414 * arg2 + var20.field1412 * arg3) / (var20.field1413 * var7) + arg0;
                    var8.field1357[var15] = method1415(var19, var21);
                    class84 var22;
                    if (this.field1224 == null || this.field1224[this.field1215[var15]] == null) {
                        var22 = this.field1238[this.field1215[var15]];
                    } else {
                        var22 = this.field1224[this.field1215[var15]];
                    }
                    int var23 = (var22.field1416 * arg4 + var22.field1414 * arg2 + var22.field1412 * arg3) / (var22.field1413 * var7) + arg0;
                    var8.field1358[var15] = method1415(var19, var23);
                    class84 var24;
                    if (this.field1224 == null || this.field1224[this.field1216[var15]] == null) {
                        var24 = this.field1238[this.field1216[var15]];
                    } else {
                        var24 = this.field1224[this.field1216[var15]];
                    }
                    int var25 = (var24.field1416 * arg4 + var24.field1414 * arg2 + var24.field1412 * arg3) / (var24.field1413 * var7) + arg0;
                    var8.field1365[var15] = method1415(var19, var25);
                } else if (var16 == 1) {
                    class92 var26 = this.field1247[var15];
                    int var27 = (var26.field1547 * arg4 + var26.field1549 * arg2 + var26.field1548 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1357[var15] = method1415(this.field1221[var15] & 0xFFFF, var27);
                    var8.field1365[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1357[var15] = 128;
                    var8.field1365[var15] = -1;
                } else {
                    var8.field1365[var15] = -2;
                }
            } else if (var16 == 0) {
                class84 var28;
                if (this.field1224 == null || this.field1224[this.field1218[var15]] == null) {
                    var28 = this.field1238[this.field1218[var15]];
                } else {
                    var28 = this.field1224[this.field1218[var15]];
                }
                int var29 = (var28.field1416 * arg4 + var28.field1414 * arg2 + var28.field1412 * arg3) / (var28.field1413 * var7) + arg0;
                var8.field1357[var15] = method1416(var29);
                class84 var30;
                if (this.field1224 == null || this.field1224[this.field1215[var15]] == null) {
                    var30 = this.field1238[this.field1215[var15]];
                } else {
                    var30 = this.field1224[this.field1215[var15]];
                }
                int var31 = (var30.field1416 * arg4 + var30.field1414 * arg2 + var30.field1412 * arg3) / (var30.field1413 * var7) + arg0;
                var8.field1358[var15] = method1416(var31);
                class84 var32;
                if (this.field1224 == null || this.field1224[this.field1216[var15]] == null) {
                    var32 = this.field1238[this.field1216[var15]];
                } else {
                    var32 = this.field1224[this.field1216[var15]];
                }
                int var33 = (var32.field1416 * arg4 + var32.field1414 * arg2 + var32.field1412 * arg3) / (var32.field1413 * var7) + arg0;
                var8.field1365[var15] = method1416(var33);
            } else if (var16 == 1) {
                class92 var34 = this.field1247[var15];
                int var35 = (var34.field1547 * arg4 + var34.field1549 * arg2 + var34.field1548 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1357[var15] = method1416(var35);
                var8.field1365[var15] = -1;
            } else {
                var8.field1365[var15] = -2;
            }
        }
        this.method1445();
        var8.field1401 = this.field1248;
        var8.field1350 = this.field1210;
        var8.field1351 = this.field1211;
        var8.field1391 = this.field1220;
        var8.field1353 = this.field1213;
        var8.field1388 = this.field1218;
        var8.field1377 = this.field1215;
        var8.field1356 = this.field1216;
        var8.field1360 = this.field1222;
        var8.field1361 = this.field1251;
        var8.field1405 = this.field1223;
        var8.field1369 = this.field1244;
        var8.field1370 = this.field1209;
        var8.field1346 = this.field1242;
        return var8;
    }

    @ObfuscatedName("bd.ao(II)I")
    public static final int method1415(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("bd.ak(I)I")
    public static final int method1416(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
