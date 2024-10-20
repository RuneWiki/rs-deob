package deob;

@ObfuscatedName("cv")
public class class90 extends class75 {

    @ObfuscatedName("cv.z")
    public int field1573 = 0;

    @ObfuscatedName("cv.n")
    public int[] field1555;

    @ObfuscatedName("cv.u")
    public int[] field1570;

    @ObfuscatedName("cv.t")
    public int[] field1557;

    @ObfuscatedName("cv.e")
    public int field1594 = 0;

    @ObfuscatedName("cv.a")
    public int[] field1559;

    @ObfuscatedName("cv.l")
    public int[] field1599;

    @ObfuscatedName("cv.v")
    public int[] field1580;

    @ObfuscatedName("cv.j")
    public byte[] field1562;

    @ObfuscatedName("cv.k")
    public byte[] field1598;

    @ObfuscatedName("cv.g")
    public byte[] field1564;

    @ObfuscatedName("cv.d")
    public byte[] field1561;

    @ObfuscatedName("cv.b")
    public short[] field1563;

    @ObfuscatedName("cv.i")
    public short[] field1567;

    @ObfuscatedName("cv.o")
    public byte field1597 = 0;

    @ObfuscatedName("cv.x")
    public int field1569;

    @ObfuscatedName("cv.m")
    public byte[] field1600;

    @ObfuscatedName("cv.f")
    public short[] field1571;

    @ObfuscatedName("cv.q")
    public short[] field1572;

    @ObfuscatedName("cv.c")
    public short[] field1575;

    @ObfuscatedName("cv.h")
    public short[] field1574;

    @ObfuscatedName("cv.y")
    public short[] field1554;

    @ObfuscatedName("cv.r")
    public short[] field1576;

    @ObfuscatedName("cv.w")
    public short[] field1577;

    @ObfuscatedName("cv.p")
    public short[] field1578;

    @ObfuscatedName("cv.s")
    public short[] field1579;

    @ObfuscatedName("cv.ag")
    public byte[] field1588;

    @ObfuscatedName("cv.ad")
    public int[] field1581;

    @ObfuscatedName("cv.ak")
    public int[] field1582;

    @ObfuscatedName("cv.ai")
    public int[][] field1583;

    @ObfuscatedName("cv.ac")
    public int[][] field1558;

    @ObfuscatedName("cv.as")
    public class74[] field1585;

    @ObfuscatedName("cv.ar")
    public class86[] field1586;

    @ObfuscatedName("cv.an")
    public class86[] field1587;

    @ObfuscatedName("cv.ah")
    public short field1556;

    @ObfuscatedName("cv.ax")
    public short field1589;

    @ObfuscatedName("cv.ae")
    public boolean field1590 = false;

    @ObfuscatedName("cv.ao")
    public int field1591;

    @ObfuscatedName("cv.aj")
    public int field1592;

    @ObfuscatedName("cv.ap")
    public int field1560;

    @ObfuscatedName("cv.am")
    public int field1593;

    @ObfuscatedName("cv.az")
    public int field1565;

    @ObfuscatedName("cv.aa")
    public static int[] field1596 = new int[10000];

    @ObfuscatedName("cv.ab")
    public static int[] field1568 = new int[10000];

    @ObfuscatedName("cv.aw")
    public static int field1584 = 0;

    @ObfuscatedName("cv.av")
    public static int[] field1566 = class81.field1425;

    @ObfuscatedName("cv.al")
    public static int[] field1595 = class81.field1446;

    public class90() {
    }

    @ObfuscatedName("cv.z(Lel;II)Lcv;")
    public static class90 method1964(class142 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2768(arg1, arg2);
        return var3 == null ? null : new class90(var3);
    }

    public class90(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1896(arg0);
        } else {
            this.method1923(arg0);
        }
    }

    @ObfuscatedName("cv.u([B)V")
    public void method1896(byte[] arg0) {
        class104 var2 = new class104(arg0);
        class104 var3 = new class104(arg0);
        class104 var4 = new class104(arg0);
        class104 var5 = new class104(arg0);
        class104 var6 = new class104(arg0);
        class104 var7 = new class104(arg0);
        class104 var8 = new class104(arg0);
        var2.field1815 = arg0.length - 23;
        int var9 = var2.method2206();
        int var10 = var2.method2206();
        int var11 = var2.method2257();
        int var12 = var2.method2257();
        int var13 = var2.method2257();
        int var14 = var2.method2257();
        int var15 = var2.method2257();
        int var16 = var2.method2257();
        int var17 = var2.method2257();
        int var18 = var2.method2206();
        int var19 = var2.method2206();
        int var20 = var2.method2206();
        int var21 = var2.method2206();
        int var22 = var2.method2206();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1600 = new byte[var11];
            var2.field1815 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1600[var26] = var2.method2237();
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
        this.field1573 = var9;
        this.field1594 = var10;
        this.field1569 = var11;
        this.field1555 = new int[var9];
        this.field1570 = new int[var9];
        this.field1557 = new int[var9];
        this.field1559 = new int[var10];
        this.field1599 = new int[var10];
        this.field1580 = new int[var10];
        if (var17 == 1) {
            this.field1581 = new int[var9];
        }
        if (var12 == 1) {
            this.field1562 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1598 = new byte[var10];
        } else {
            this.field1597 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1564 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1582 = new int[var10];
        }
        if (var16 == 1) {
            this.field1567 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1561 = new byte[var10];
        }
        this.field1563 = new short[var10];
        if (var11 > 0) {
            this.field1571 = new short[var11];
            this.field1572 = new short[var11];
            this.field1575 = new short[var11];
            if (var24 > 0) {
                this.field1574 = new short[var24];
                this.field1554 = new short[var24];
                this.field1576 = new short[var24];
                this.field1577 = new short[var24];
                this.field1588 = new byte[var24];
                this.field1578 = new short[var24];
            }
            if (var25 > 0) {
                this.field1579 = new short[var25];
            }
        }
        var2.field1815 = var11;
        var3.field1815 = var44;
        var4.field1815 = var46;
        var5.field1815 = var48;
        var6.field1815 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2257();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2139();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2139();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2139();
            }
            this.field1555[var67] = var64 + var69;
            this.field1570[var67] = var65 + var70;
            this.field1557[var67] = var66 + var71;
            var64 = this.field1555[var67];
            var65 = this.field1570[var67];
            var66 = this.field1557[var67];
            if (var17 == 1) {
                this.field1581[var67] = var6.method2257();
            }
        }
        var2.field1815 = var42;
        var3.field1815 = var31;
        var4.field1815 = var34;
        var5.field1815 = var37;
        var6.field1815 = var35;
        var7.field1815 = var40;
        var8.field1815 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1563[var72] = (short) var2.method2206();
            if (var12 == 1) {
                this.field1562[var72] = var3.method2237();
            }
            if (var13 == 255) {
                this.field1598[var72] = var4.method2237();
            }
            if (var14 == 1) {
                this.field1564[var72] = var5.method2237();
            }
            if (var15 == 1) {
                this.field1582[var72] = var6.method2257();
            }
            if (var16 == 1) {
                this.field1567[var72] = (short) (var7.method2206() - 1);
            }
            if (this.field1561 != null && this.field1567[var72] != -1) {
                this.field1561[var72] = (byte) (var8.method2257() - 1);
            }
        }
        var2.field1815 = var33;
        var3.field1815 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2257();
            if (var78 == 1) {
                var73 = var2.method2139() + var76;
                var74 = var2.method2139() + var73;
                var75 = var2.method2139() + var74;
                var76 = var75;
                this.field1559[var77] = var73;
                this.field1599[var77] = var74;
                this.field1580[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2139() + var76;
                var76 = var75;
                this.field1559[var77] = var73;
                this.field1599[var77] = var74;
                this.field1580[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2139() + var76;
                var76 = var75;
                this.field1559[var77] = var73;
                this.field1599[var77] = var74;
                this.field1580[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2139() + var76;
                var76 = var75;
                this.field1559[var77] = var73;
                this.field1599[var77] = var81;
                this.field1580[var77] = var75;
            }
        }
        var2.field1815 = var50;
        var3.field1815 = var52;
        var4.field1815 = var54;
        var5.field1815 = var56;
        var6.field1815 = var58;
        var7.field1815 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1600[var82] & 0xFF;
            if (var83 == 0) {
                this.field1571[var82] = (short) var2.method2206();
                this.field1572[var82] = (short) var2.method2206();
                this.field1575[var82] = (short) var2.method2206();
            }
            if (var83 == 1) {
                this.field1571[var82] = (short) var3.method2206();
                this.field1572[var82] = (short) var3.method2206();
                this.field1575[var82] = (short) var3.method2206();
                this.field1574[var82] = (short) var4.method2206();
                this.field1554[var82] = (short) var4.method2206();
                this.field1576[var82] = (short) var4.method2206();
                this.field1577[var82] = (short) var5.method2206();
                this.field1588[var82] = var6.method2237();
                this.field1578[var82] = (short) var7.method2206();
            }
            if (var83 == 2) {
                this.field1571[var82] = (short) var3.method2206();
                this.field1572[var82] = (short) var3.method2206();
                this.field1575[var82] = (short) var3.method2206();
                this.field1574[var82] = (short) var4.method2206();
                this.field1554[var82] = (short) var4.method2206();
                this.field1576[var82] = (short) var4.method2206();
                this.field1577[var82] = (short) var5.method2206();
                this.field1588[var82] = var6.method2237();
                this.field1578[var82] = (short) var7.method2206();
                this.field1579[var82] = (short) var7.method2206();
            }
            if (var83 == 3) {
                this.field1571[var82] = (short) var3.method2206();
                this.field1572[var82] = (short) var3.method2206();
                this.field1575[var82] = (short) var3.method2206();
                this.field1574[var82] = (short) var4.method2206();
                this.field1554[var82] = (short) var4.method2206();
                this.field1576[var82] = (short) var4.method2206();
                this.field1577[var82] = (short) var5.method2206();
                this.field1588[var82] = var6.method2237();
                this.field1578[var82] = (short) var7.method2206();
            }
        }
        var2.field1815 = var62;
        int var84 = var2.method2257();
        if (var84 == 0) {
            return;
        }
        new class80();
        var2.method2206();
        var2.method2206();
        var2.method2206();
        var2.method2130();
    }

    @ObfuscatedName("cv.t([B)V")
    public void method1923(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class104 var4 = new class104(arg0);
        class104 var5 = new class104(arg0);
        class104 var6 = new class104(arg0);
        class104 var7 = new class104(arg0);
        class104 var8 = new class104(arg0);
        var4.field1815 = arg0.length - 18;
        int var9 = var4.method2206();
        int var10 = var4.method2206();
        int var11 = var4.method2257();
        int var12 = var4.method2257();
        int var13 = var4.method2257();
        int var14 = var4.method2257();
        int var15 = var4.method2257();
        int var16 = var4.method2257();
        int var17 = var4.method2206();
        int var18 = var4.method2206();
        int var19 = var4.method2206();
        int var20 = var4.method2206();
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
        this.field1573 = var9;
        this.field1594 = var10;
        this.field1569 = var11;
        this.field1555 = new int[var9];
        this.field1570 = new int[var9];
        this.field1557 = new int[var9];
        this.field1559 = new int[var10];
        this.field1599 = new int[var10];
        this.field1580 = new int[var10];
        if (var11 > 0) {
            this.field1600 = new byte[var11];
            this.field1571 = new short[var11];
            this.field1572 = new short[var11];
            this.field1575 = new short[var11];
        }
        if (var16 == 1) {
            this.field1581 = new int[var9];
        }
        if (var12 == 1) {
            this.field1562 = new byte[var10];
            this.field1561 = new byte[var10];
            this.field1567 = new short[var10];
        }
        if (var13 == 255) {
            this.field1598 = new byte[var10];
        } else {
            this.field1597 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1564 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1582 = new int[var10];
        }
        this.field1563 = new short[var10];
        var4.field1815 = var21;
        var5.field1815 = var36;
        var6.field1815 = var38;
        var7.field1815 = var40;
        var8.field1815 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2257();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2139();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2139();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2139();
            }
            this.field1555[var46] = var43 + var48;
            this.field1570[var46] = var44 + var49;
            this.field1557[var46] = var45 + var50;
            var43 = this.field1555[var46];
            var44 = this.field1570[var46];
            var45 = this.field1557[var46];
            if (var16 == 1) {
                this.field1581[var46] = var8.method2257();
            }
        }
        var4.field1815 = var32;
        var5.field1815 = var28;
        var6.field1815 = var26;
        var7.field1815 = var30;
        var8.field1815 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1563[var51] = (short) var4.method2206();
            if (var12 == 1) {
                int var52 = var5.method2257();
                if ((var52 & 0x1) == 1) {
                    this.field1562[var51] = 1;
                    var2 = true;
                } else {
                    this.field1562[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1561[var51] = (byte) (var52 >> 2);
                    this.field1567[var51] = this.field1563[var51];
                    this.field1563[var51] = 127;
                    if (this.field1567[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1561[var51] = -1;
                    this.field1567[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1598[var51] = var6.method2237();
            }
            if (var14 == 1) {
                this.field1564[var51] = var7.method2237();
            }
            if (var15 == 1) {
                this.field1582[var51] = var8.method2257();
            }
        }
        var4.field1815 = var25;
        var5.field1815 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2257();
            if (var58 == 1) {
                var53 = var4.method2139() + var56;
                var54 = var4.method2139() + var53;
                var55 = var4.method2139() + var54;
                var56 = var55;
                this.field1559[var57] = var53;
                this.field1599[var57] = var54;
                this.field1580[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2139() + var56;
                var56 = var55;
                this.field1559[var57] = var53;
                this.field1599[var57] = var54;
                this.field1580[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2139() + var56;
                var56 = var55;
                this.field1559[var57] = var53;
                this.field1599[var57] = var54;
                this.field1580[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2139() + var56;
                var56 = var55;
                this.field1559[var57] = var53;
                this.field1599[var57] = var61;
                this.field1580[var57] = var55;
            }
        }
        var4.field1815 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1600[var62] = 0;
            this.field1571[var62] = (short) var4.method2206();
            this.field1572[var62] = (short) var4.method2206();
            this.field1575[var62] = (short) var4.method2206();
        }
        if (this.field1561 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1561[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1571[var65] & 0xFFFF) == this.field1559[var64] && (this.field1572[var65] & 0xFFFF) == this.field1599[var64] && (this.field1575[var65] & 0xFFFF) == this.field1580[var64]) {
                        this.field1561[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1561 = null;
            }
        }
        if (!var3) {
            this.field1567 = null;
        }
        if (!var2) {
            this.field1562 = null;
        }
    }

    public class90(class90[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1573 = 0;
        this.field1594 = 0;
        this.field1569 = 0;
        this.field1597 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class90 var10 = arg0[var9];
            if (var10 != null) {
                this.field1573 += var10.field1573;
                this.field1594 += var10.field1594;
                this.field1569 += var10.field1569;
                if (var10.field1598 == null) {
                    if (this.field1597 == -1) {
                        this.field1597 = var10.field1597;
                    }
                    if (this.field1597 != var10.field1597) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1562 != null;
                var5 |= var10.field1564 != null;
                var6 |= var10.field1582 != null;
                var7 |= var10.field1567 != null;
                var8 |= var10.field1561 != null;
            }
        }
        this.field1555 = new int[this.field1573];
        this.field1570 = new int[this.field1573];
        this.field1557 = new int[this.field1573];
        this.field1581 = new int[this.field1573];
        this.field1559 = new int[this.field1594];
        this.field1599 = new int[this.field1594];
        this.field1580 = new int[this.field1594];
        if (var3) {
            this.field1562 = new byte[this.field1594];
        }
        if (var4) {
            this.field1598 = new byte[this.field1594];
        }
        if (var5) {
            this.field1564 = new byte[this.field1594];
        }
        if (var6) {
            this.field1582 = new int[this.field1594];
        }
        if (var7) {
            this.field1567 = new short[this.field1594];
        }
        if (var8) {
            this.field1561 = new byte[this.field1594];
        }
        this.field1563 = new short[this.field1594];
        if (this.field1569 > 0) {
            this.field1600 = new byte[this.field1569];
            this.field1571 = new short[this.field1569];
            this.field1572 = new short[this.field1569];
            this.field1575 = new short[this.field1569];
            this.field1574 = new short[this.field1569];
            this.field1554 = new short[this.field1569];
            this.field1576 = new short[this.field1569];
            this.field1577 = new short[this.field1569];
            this.field1588 = new byte[this.field1569];
            this.field1578 = new short[this.field1569];
            this.field1579 = new short[this.field1569];
        }
        this.field1573 = 0;
        this.field1594 = 0;
        this.field1569 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class90 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1594; var13++) {
                    if (var3 && var12.field1562 != null) {
                        this.field1562[this.field1594] = var12.field1562[var13];
                    }
                    if (var4) {
                        if (var12.field1598 == null) {
                            this.field1598[this.field1594] = var12.field1597;
                        } else {
                            this.field1598[this.field1594] = var12.field1598[var13];
                        }
                    }
                    if (var5 && var12.field1564 != null) {
                        this.field1564[this.field1594] = var12.field1564[var13];
                    }
                    if (var6 && var12.field1582 != null) {
                        this.field1582[this.field1594] = var12.field1582[var13];
                    }
                    if (var7) {
                        if (var12.field1567 == null) {
                            this.field1567[this.field1594] = -1;
                        } else {
                            this.field1567[this.field1594] = var12.field1567[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1561 == null || var12.field1561[var13] == -1) {
                            this.field1561[this.field1594] = -1;
                        } else {
                            this.field1561[this.field1594] = (byte) (var12.field1561[var13] + this.field1569);
                        }
                    }
                    this.field1563[this.field1594] = var12.field1563[var13];
                    this.field1559[this.field1594] = this.method1978(var12, var12.field1559[var13]);
                    this.field1599[this.field1594] = this.method1978(var12, var12.field1599[var13]);
                    this.field1580[this.field1594] = this.method1978(var12, var12.field1580[var13]);
                    this.field1594++;
                }
                for (int var14 = 0; var14 < var12.field1569; var14++) {
                    byte var15 = this.field1600[this.field1569] = var12.field1600[var14];
                    if (var15 == 0) {
                        this.field1571[this.field1569] = (short) this.method1978(var12, var12.field1571[var14]);
                        this.field1572[this.field1569] = (short) this.method1978(var12, var12.field1572[var14]);
                        this.field1575[this.field1569] = (short) this.method1978(var12, var12.field1575[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1571[this.field1569] = var12.field1571[var14];
                        this.field1572[this.field1569] = var12.field1572[var14];
                        this.field1575[this.field1569] = var12.field1575[var14];
                        this.field1574[this.field1569] = var12.field1574[var14];
                        this.field1554[this.field1569] = var12.field1554[var14];
                        this.field1576[this.field1569] = var12.field1576[var14];
                        this.field1577[this.field1569] = var12.field1577[var14];
                        this.field1588[this.field1569] = var12.field1588[var14];
                        this.field1578[this.field1569] = var12.field1578[var14];
                    }
                    if (var15 == 2) {
                        this.field1579[this.field1569] = var12.field1579[var14];
                    }
                    this.field1569++;
                }
            }
        }
    }

    @ObfuscatedName("cv.e(Lcv;I)I")
    public final int method1978(class90 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1555[arg1];
        int var5 = arg0.field1570[arg1];
        int var6 = arg0.field1557[arg1];
        for (int var7 = 0; var7 < this.field1573; var7++) {
            if (this.field1555[var7] == var4 && this.field1570[var7] == var5 && this.field1557[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1555[this.field1573] = var4;
            this.field1570[this.field1573] = var5;
            this.field1557[this.field1573] = var6;
            if (arg0.field1581 != null) {
                this.field1581[this.field1573] = arg0.field1581[arg1];
            }
            var3 = this.field1573++;
        }
        return var3;
    }

    public class90(class90 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1573 = arg0.field1573;
        this.field1594 = arg0.field1594;
        this.field1569 = arg0.field1569;
        if (arg1) {
            this.field1555 = arg0.field1555;
            this.field1570 = arg0.field1570;
            this.field1557 = arg0.field1557;
        } else {
            this.field1555 = new int[this.field1573];
            this.field1570 = new int[this.field1573];
            this.field1557 = new int[this.field1573];
            for (int var6 = 0; var6 < this.field1573; var6++) {
                this.field1555[var6] = arg0.field1555[var6];
                this.field1570[var6] = arg0.field1570[var6];
                this.field1557[var6] = arg0.field1557[var6];
            }
        }
        if (arg2) {
            this.field1563 = arg0.field1563;
        } else {
            this.field1563 = new short[this.field1594];
            for (int var7 = 0; var7 < this.field1594; var7++) {
                this.field1563[var7] = arg0.field1563[var7];
            }
        }
        if (arg3 || arg0.field1567 == null) {
            this.field1567 = arg0.field1567;
        } else {
            this.field1567 = new short[this.field1594];
            for (int var8 = 0; var8 < this.field1594; var8++) {
                this.field1567[var8] = arg0.field1567[var8];
            }
        }
        if (arg4) {
            this.field1564 = arg0.field1564;
        } else {
            this.field1564 = new byte[this.field1594];
            if (arg0.field1564 == null) {
                for (int var9 = 0; var9 < this.field1594; var9++) {
                    this.field1564[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1594; var10++) {
                    this.field1564[var10] = arg0.field1564[var10];
                }
            }
        }
        this.field1559 = arg0.field1559;
        this.field1599 = arg0.field1599;
        this.field1580 = arg0.field1580;
        this.field1562 = arg0.field1562;
        this.field1598 = arg0.field1598;
        this.field1561 = arg0.field1561;
        this.field1597 = arg0.field1597;
        this.field1600 = arg0.field1600;
        this.field1571 = arg0.field1571;
        this.field1572 = arg0.field1572;
        this.field1575 = arg0.field1575;
        this.field1574 = arg0.field1574;
        this.field1554 = arg0.field1554;
        this.field1576 = arg0.field1576;
        this.field1577 = arg0.field1577;
        this.field1588 = arg0.field1588;
        this.field1578 = arg0.field1578;
        this.field1579 = arg0.field1579;
        this.field1581 = arg0.field1581;
        this.field1582 = arg0.field1582;
        this.field1583 = arg0.field1583;
        this.field1558 = arg0.field1558;
        this.field1586 = arg0.field1586;
        this.field1585 = arg0.field1585;
        this.field1587 = arg0.field1587;
        this.field1556 = arg0.field1556;
        this.field1589 = arg0.field1589;
    }

    @ObfuscatedName("cv.a()Lcv;")
    public class90 method1901() {
        class90 var1 = new class90();
        if (this.field1562 != null) {
            var1.field1562 = new byte[this.field1594];
            for (int var2 = 0; var2 < this.field1594; var2++) {
                var1.field1562[var2] = this.field1562[var2];
            }
        }
        var1.field1573 = this.field1573;
        var1.field1594 = this.field1594;
        var1.field1569 = this.field1569;
        var1.field1555 = this.field1555;
        var1.field1570 = this.field1570;
        var1.field1557 = this.field1557;
        var1.field1559 = this.field1559;
        var1.field1599 = this.field1599;
        var1.field1580 = this.field1580;
        var1.field1598 = this.field1598;
        var1.field1564 = this.field1564;
        var1.field1561 = this.field1561;
        var1.field1563 = this.field1563;
        var1.field1567 = this.field1567;
        var1.field1597 = this.field1597;
        var1.field1600 = this.field1600;
        var1.field1571 = this.field1571;
        var1.field1572 = this.field1572;
        var1.field1575 = this.field1575;
        var1.field1574 = this.field1574;
        var1.field1554 = this.field1554;
        var1.field1576 = this.field1576;
        var1.field1577 = this.field1577;
        var1.field1588 = this.field1588;
        var1.field1578 = this.field1578;
        var1.field1579 = this.field1579;
        var1.field1581 = this.field1581;
        var1.field1582 = this.field1582;
        var1.field1583 = this.field1583;
        var1.field1558 = this.field1558;
        var1.field1586 = this.field1586;
        var1.field1585 = this.field1585;
        var1.field1556 = this.field1556;
        var1.field1589 = this.field1589;
        return var1;
    }

    @ObfuscatedName("cv.g([[IIIIZI)Lcv;")
    public class90 method1972(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1915();
        int var7 = this.field1592 + arg1;
        int var8 = this.field1560 + arg1;
        int var9 = this.field1565 + arg3;
        int var10 = this.field1593 + arg3;
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
        class90 var15;
        if (arg4) {
            var15 = new class90();
            var15.field1573 = this.field1573;
            var15.field1594 = this.field1594;
            var15.field1569 = this.field1569;
            var15.field1555 = this.field1555;
            var15.field1557 = this.field1557;
            var15.field1559 = this.field1559;
            var15.field1599 = this.field1599;
            var15.field1580 = this.field1580;
            var15.field1562 = this.field1562;
            var15.field1598 = this.field1598;
            var15.field1564 = this.field1564;
            var15.field1561 = this.field1561;
            var15.field1563 = this.field1563;
            var15.field1567 = this.field1567;
            var15.field1597 = this.field1597;
            var15.field1600 = this.field1600;
            var15.field1571 = this.field1571;
            var15.field1572 = this.field1572;
            var15.field1575 = this.field1575;
            var15.field1574 = this.field1574;
            var15.field1554 = this.field1554;
            var15.field1576 = this.field1576;
            var15.field1577 = this.field1577;
            var15.field1588 = this.field1588;
            var15.field1578 = this.field1578;
            var15.field1579 = this.field1579;
            var15.field1581 = this.field1581;
            var15.field1582 = this.field1582;
            var15.field1583 = this.field1583;
            var15.field1558 = this.field1558;
            var15.field1556 = this.field1556;
            var15.field1589 = this.field1589;
            var15.field1570 = new int[var15.field1573];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1573; var16++) {
                int var17 = this.field1555[var16] + arg1;
                int var18 = this.field1557[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1570[var16] = this.field1570[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1573; var26++) {
                int var27 = (-this.field1570[var26] << 16) / this.field1315;
                if (var27 < arg5) {
                    int var28 = this.field1555[var26] + arg1;
                    int var29 = this.field1557[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1570[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1570[var26];
                }
            }
        }
        var15.method1914();
        return var15;
    }

    @ObfuscatedName("cv.d()V")
    public void method1903() {
        int var10002;
        if (this.field1581 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1573; var3++) {
                int var4 = this.field1581[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1583 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1583[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1573) {
                int var7 = this.field1581[var6];
                this.field1583[var7][var1[var7]++] = var6++;
            }
            this.field1581 = null;
        }
        if (this.field1582 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1594; var10++) {
            int var11 = this.field1582[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1558 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1558[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1594) {
            int var14 = this.field1582[var13];
            this.field1558[var14][var8[var14]++] = var13++;
        }
        this.field1582 = null;
    }

    @ObfuscatedName("cv.b()V")
    public void method1904() {
        for (int var1 = 0; var1 < this.field1573; var1++) {
            int var2 = this.field1555[var1];
            this.field1555[var1] = this.field1557[var1];
            this.field1557[var1] = -var2;
        }
        this.method1914();
    }

    @ObfuscatedName("cv.i()V")
    public void method1905() {
        for (int var1 = 0; var1 < this.field1573; var1++) {
            this.field1555[var1] = -this.field1555[var1];
            this.field1557[var1] = -this.field1557[var1];
        }
        this.method1914();
    }

    @ObfuscatedName("cv.o()V")
    public void method1906() {
        for (int var1 = 0; var1 < this.field1573; var1++) {
            int var2 = this.field1557[var1];
            this.field1557[var1] = this.field1555[var1];
            this.field1555[var1] = -var2;
        }
        this.method1914();
    }

    @ObfuscatedName("cv.x(I)V")
    public void method1907(int arg0) {
        int var2 = field1566[arg0];
        int var3 = field1595[arg0];
        for (int var4 = 0; var4 < this.field1573; var4++) {
            int var5 = this.field1557[var4] * var2 + this.field1555[var4] * var3 >> 16;
            this.field1557[var4] = this.field1557[var4] * var3 - this.field1555[var4] * var2 >> 16;
            this.field1555[var4] = var5;
        }
        this.method1914();
    }

    @ObfuscatedName("cv.m(III)V")
    public void method1908(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1573; var4++) {
            this.field1555[var4] += arg0;
            this.field1570[var4] += arg1;
            this.field1557[var4] += arg2;
        }
        this.method1914();
    }

    @ObfuscatedName("cv.f(SS)V")
    public void method1909(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1594; var3++) {
            if (this.field1563[var3] == arg0) {
                this.field1563[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cv.q(SS)V")
    public void method1898(short arg0, short arg1) {
        if (this.field1567 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1594; var3++) {
            if (this.field1567[var3] == arg0) {
                this.field1567[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cv.c()V")
    public void method1911() {
        for (int var1 = 0; var1 < this.field1573; var1++) {
            this.field1557[var1] = -this.field1557[var1];
        }
        for (int var2 = 0; var2 < this.field1594; var2++) {
            int var3 = this.field1559[var2];
            this.field1559[var2] = this.field1580[var2];
            this.field1580[var2] = var3;
        }
        this.method1914();
    }

    @ObfuscatedName("cv.h(III)V")
    public void method1899(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1573; var4++) {
            this.field1555[var4] = this.field1555[var4] * arg0 / 128;
            this.field1570[var4] = this.field1570[var4] * arg1 / 128;
            this.field1557[var4] = this.field1557[var4] * arg2 / 128;
        }
        this.method1914();
    }

    @ObfuscatedName("cv.y()V")
    public void method1976() {
        if (this.field1586 != null) {
            return;
        }
        this.field1586 = new class86[this.field1573];
        for (int var1 = 0; var1 < this.field1573; var1++) {
            this.field1586[var1] = new class86();
        }
        for (int var2 = 0; var2 < this.field1594; var2++) {
            int var3 = this.field1559[var2];
            int var4 = this.field1599[var2];
            int var5 = this.field1580[var2];
            int var6 = this.field1555[var4] - this.field1555[var3];
            int var7 = this.field1570[var4] - this.field1570[var3];
            int var8 = this.field1557[var4] - this.field1557[var3];
            int var9 = this.field1555[var5] - this.field1555[var3];
            int var10 = this.field1570[var5] - this.field1570[var3];
            int var11 = this.field1557[var5] - this.field1557[var3];
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
            if (this.field1562 == null) {
                var19 = 0;
            } else {
                var19 = this.field1562[var2];
            }
            if (var19 == 0) {
                class86 var20 = this.field1586[var3];
                var20.field1494 += var16;
                var20.field1492 += var17;
                var20.field1495 += var18;
                var20.field1493++;
                class86 var21 = this.field1586[var4];
                var21.field1494 += var16;
                var21.field1492 += var17;
                var21.field1495 += var18;
                var21.field1493++;
                class86 var22 = this.field1586[var5];
                var22.field1494 += var16;
                var22.field1492 += var17;
                var22.field1495 += var18;
                var22.field1493++;
            } else if (var19 == 1) {
                if (this.field1585 == null) {
                    this.field1585 = new class74[this.field1594];
                }
                class74 var23 = this.field1585[var2] = new class74();
                var23.field1310 = var16;
                var23.field1309 = var17;
                var23.field1311 = var18;
            }
        }
    }

    @ObfuscatedName("cv.r()V")
    public void method1914() {
        this.field1586 = null;
        this.field1587 = null;
        this.field1585 = null;
        this.field1590 = false;
    }

    @ObfuscatedName("cv.w()V")
    public void method1915() {
        if (this.field1590) {
            return;
        }
        this.field1315 = 0;
        this.field1591 = 0;
        this.field1592 = 999999;
        this.field1560 = -999999;
        this.field1593 = -99999;
        this.field1565 = 99999;
        for (int var1 = 0; var1 < this.field1573; var1++) {
            int var2 = this.field1555[var1];
            int var3 = this.field1570[var1];
            int var4 = this.field1557[var1];
            if (var2 < this.field1592) {
                this.field1592 = var2;
            }
            if (var2 > this.field1560) {
                this.field1560 = var2;
            }
            if (var4 < this.field1565) {
                this.field1565 = var4;
            }
            if (var4 > this.field1593) {
                this.field1593 = var4;
            }
            if (-var3 > this.field1315) {
                this.field1315 = -var3;
            }
            if (var3 > this.field1591) {
                this.field1591 = var3;
            }
        }
        this.field1590 = true;
    }

    @ObfuscatedName("cv.p(Lcv;Lcv;IIIZ)V")
    public static void method1935(class90 arg0, class90 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1915();
        arg0.method1976();
        arg1.method1915();
        arg1.method1976();
        field1584++;
        int var6 = 0;
        int[] var7 = arg1.field1555;
        int var8 = arg1.field1573;
        for (int var9 = 0; var9 < arg0.field1573; var9++) {
            class86 var10 = arg0.field1586[var9];
            if (var10.field1493 != 0) {
                int var11 = arg0.field1570[var9] - arg3;
                if (var11 <= arg1.field1591) {
                    int var12 = arg0.field1555[var9] - arg2;
                    if (var12 >= arg1.field1592 && var12 <= arg1.field1560) {
                        int var13 = arg0.field1557[var9] - arg4;
                        if (var13 >= arg1.field1565 && var13 <= arg1.field1593) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class86 var15 = arg1.field1586[var14];
                                if (var7[var14] == var12 && arg1.field1557[var14] == var13 && arg1.field1570[var14] == var11 && var15.field1493 != 0) {
                                    if (arg0.field1587 == null) {
                                        arg0.field1587 = new class86[arg0.field1573];
                                    }
                                    if (arg1.field1587 == null) {
                                        arg1.field1587 = new class86[var8];
                                    }
                                    class86 var16 = arg0.field1587[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1587[var9] = new class86(var10);
                                    }
                                    class86 var17 = arg1.field1587[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1587[var14] = new class86(var15);
                                    }
                                    var16.field1494 += var15.field1494;
                                    var16.field1492 += var15.field1492;
                                    var16.field1495 += var15.field1495;
                                    var16.field1493 += var15.field1493;
                                    var17.field1494 += var10.field1494;
                                    var17.field1492 += var10.field1492;
                                    var17.field1495 += var10.field1495;
                                    var17.field1493 += var10.field1493;
                                    var6++;
                                    field1596[var9] = field1584;
                                    field1568[var14] = field1584;
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
        for (int var18 = 0; var18 < arg0.field1594; var18++) {
            if (field1596[arg0.field1559[var18]] == field1584 && field1596[arg0.field1599[var18]] == field1584 && field1596[arg0.field1580[var18]] == field1584) {
                if (arg0.field1562 == null) {
                    arg0.field1562 = new byte[arg0.field1594];
                }
                arg0.field1562[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1594; var19++) {
            if (field1568[arg1.field1559[var19]] == field1584 && field1568[arg1.field1599[var19]] == field1584 && field1568[arg1.field1580[var19]] == field1584) {
                if (arg1.field1562 == null) {
                    arg1.field1562 = new byte[arg1.field1594];
                }
                arg1.field1562[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cv.ac(IIIII)Lcp;")
    public final class95 method1975(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1976();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class95 var8 = new class95();
        var8.field1714 = new int[this.field1594];
        var8.field1731 = new int[this.field1594];
        var8.field1683 = new int[this.field1594];
        if (this.field1569 > 0 && this.field1561 != null) {
            int[] var9 = new int[this.field1569];
            for (int var10 = 0; var10 < this.field1594; var10++) {
                if (this.field1561[var10] != -1) {
                    var9[this.field1561[var10] & 0xFF]++;
                }
            }
            var8.field1670 = 0;
            for (int var11 = 0; var11 < this.field1569; var11++) {
                if (var9[var11] > 0 && this.field1600[var11] == 0) {
                    var8.field1670++;
                }
            }
            var8.field1696 = new int[var8.field1670];
            var8.field1688 = new int[var8.field1670];
            var8.field1729 = new int[var8.field1670];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1569; var13++) {
                if (var9[var13] > 0 && this.field1600[var13] == 0) {
                    var8.field1696[var12] = this.field1571[var13] & 0xFFFF;
                    var8.field1688[var12] = this.field1572[var13] & 0xFFFF;
                    var8.field1729[var12] = this.field1575[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1732 = new byte[this.field1594];
            for (int var14 = 0; var14 < this.field1594; var14++) {
                if (this.field1561[var14] == -1) {
                    var8.field1732[var14] = -1;
                } else {
                    var8.field1732[var14] = (byte) var9[this.field1561[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1594; var15++) {
            byte var16;
            if (this.field1562 == null) {
                var16 = 0;
            } else {
                var16 = this.field1562[var15];
            }
            byte var17;
            if (this.field1564 == null) {
                var17 = 0;
            } else {
                var17 = this.field1564[var15];
            }
            short var18;
            if (this.field1567 == null) {
                var18 = -1;
            } else {
                var18 = this.field1567[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1563[var15] & 0xFFFF;
                    class86 var20;
                    if (this.field1587 == null || this.field1587[this.field1559[var15]] == null) {
                        var20 = this.field1586[this.field1559[var15]];
                    } else {
                        var20 = this.field1587[this.field1559[var15]];
                    }
                    int var21 = (var20.field1495 * arg4 + var20.field1494 * arg2 + var20.field1492 * arg3) / (var20.field1493 * var7) + arg0;
                    var8.field1714[var15] = method1918(var19, var21);
                    class86 var22;
                    if (this.field1587 == null || this.field1587[this.field1599[var15]] == null) {
                        var22 = this.field1586[this.field1599[var15]];
                    } else {
                        var22 = this.field1587[this.field1599[var15]];
                    }
                    int var23 = (var22.field1495 * arg4 + var22.field1494 * arg2 + var22.field1492 * arg3) / (var22.field1493 * var7) + arg0;
                    var8.field1731[var15] = method1918(var19, var23);
                    class86 var24;
                    if (this.field1587 == null || this.field1587[this.field1580[var15]] == null) {
                        var24 = this.field1586[this.field1580[var15]];
                    } else {
                        var24 = this.field1587[this.field1580[var15]];
                    }
                    int var25 = (var24.field1495 * arg4 + var24.field1494 * arg2 + var24.field1492 * arg3) / (var24.field1493 * var7) + arg0;
                    var8.field1683[var15] = method1918(var19, var25);
                } else if (var16 == 1) {
                    class74 var26 = this.field1585[var15];
                    int var27 = (var26.field1311 * arg4 + var26.field1310 * arg2 + var26.field1309 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1714[var15] = method1918(this.field1563[var15] & 0xFFFF, var27);
                    var8.field1683[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1714[var15] = 128;
                    var8.field1683[var15] = -1;
                } else {
                    var8.field1683[var15] = -2;
                }
            } else if (var16 == 0) {
                class86 var28;
                if (this.field1587 == null || this.field1587[this.field1559[var15]] == null) {
                    var28 = this.field1586[this.field1559[var15]];
                } else {
                    var28 = this.field1587[this.field1559[var15]];
                }
                int var29 = (var28.field1495 * arg4 + var28.field1494 * arg2 + var28.field1492 * arg3) / (var28.field1493 * var7) + arg0;
                var8.field1714[var15] = method1919(var29);
                class86 var30;
                if (this.field1587 == null || this.field1587[this.field1599[var15]] == null) {
                    var30 = this.field1586[this.field1599[var15]];
                } else {
                    var30 = this.field1587[this.field1599[var15]];
                }
                int var31 = (var30.field1495 * arg4 + var30.field1494 * arg2 + var30.field1492 * arg3) / (var30.field1493 * var7) + arg0;
                var8.field1731[var15] = method1919(var31);
                class86 var32;
                if (this.field1587 == null || this.field1587[this.field1580[var15]] == null) {
                    var32 = this.field1586[this.field1580[var15]];
                } else {
                    var32 = this.field1587[this.field1580[var15]];
                }
                int var33 = (var32.field1495 * arg4 + var32.field1494 * arg2 + var32.field1492 * arg3) / (var32.field1493 * var7) + arg0;
                var8.field1683[var15] = method1919(var33);
            } else if (var16 == 1) {
                class74 var34 = this.field1585[var15];
                int var35 = (var34.field1311 * arg4 + var34.field1310 * arg2 + var34.field1309 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1714[var15] = method1919(var35);
                var8.field1683[var15] = -1;
            } else {
                var8.field1683[var15] = -2;
            }
        }
        this.method1903();
        var8.field1671 = this.field1573;
        var8.field1719 = this.field1555;
        var8.field1672 = this.field1570;
        var8.field1673 = this.field1557;
        var8.field1720 = this.field1594;
        var8.field1675 = this.field1559;
        var8.field1676 = this.field1599;
        var8.field1677 = this.field1580;
        var8.field1687 = this.field1598;
        var8.field1668 = this.field1564;
        var8.field1685 = this.field1597;
        var8.field1690 = this.field1583;
        var8.field1691 = this.field1558;
        var8.field1684 = this.field1567;
        return var8;
    }

    @ObfuscatedName("cv.as(II)I")
    public static final int method1918(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cv.ar(I)I")
    public static final int method1919(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
