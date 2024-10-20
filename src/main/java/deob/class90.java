package deob;

@ObfuscatedName("ck")
public class class90 extends class75 {

    @ObfuscatedName("ck.m")
    public int field1576 = 0;

    @ObfuscatedName("ck.k")
    public int[] field1559;

    @ObfuscatedName("ck.y")
    public int[] field1552;

    @ObfuscatedName("ck.g")
    public int[] field1553;

    @ObfuscatedName("ck.r")
    public int field1554 = 0;

    @ObfuscatedName("ck.i")
    public int[] field1555;

    @ObfuscatedName("ck.f")
    public int[] field1556;

    @ObfuscatedName("ck.a")
    public int[] field1557;

    @ObfuscatedName("ck.w")
    public byte[] field1558;

    @ObfuscatedName("ck.u")
    public byte[] field1595;

    @ObfuscatedName("ck.d")
    public byte[] field1550;

    @ObfuscatedName("ck.t")
    public byte[] field1561;

    @ObfuscatedName("ck.j")
    public short[] field1551;

    @ObfuscatedName("ck.q")
    public short[] field1563;

    @ObfuscatedName("ck.p")
    public byte field1564 = 0;

    @ObfuscatedName("ck.v")
    public int field1565;

    @ObfuscatedName("ck.n")
    public byte[] field1574;

    @ObfuscatedName("ck.l")
    public short[] field1567;

    @ObfuscatedName("ck.c")
    public short[] field1577;

    @ObfuscatedName("ck.b")
    public short[] field1569;

    @ObfuscatedName("ck.s")
    public short[] field1570;

    @ObfuscatedName("ck.o")
    public short[] field1571;

    @ObfuscatedName("ck.h")
    public short[] field1572;

    @ObfuscatedName("ck.x")
    public short[] field1573;

    @ObfuscatedName("ck.e")
    public short[] field1566;

    @ObfuscatedName("ck.z")
    public short[] field1575;

    @ObfuscatedName("ck.az")
    public byte[] field1592;

    @ObfuscatedName("ck.av")
    public int[] field1596;

    @ObfuscatedName("ck.ay")
    public int[] field1578;

    @ObfuscatedName("ck.ah")
    public int[][] field1579;

    @ObfuscatedName("ck.ao")
    public int[][] field1580;

    @ObfuscatedName("ck.aj")
    public class74[] field1591;

    @ObfuscatedName("ck.ad")
    public class86[] field1581;

    @ObfuscatedName("ck.ai")
    public class86[] field1583;

    @ObfuscatedName("ck.af")
    public short field1584;

    @ObfuscatedName("ck.am")
    public short field1560;

    @ObfuscatedName("ck.aq")
    public boolean field1586 = false;

    @ObfuscatedName("ck.ar")
    public int field1587;

    @ObfuscatedName("ck.an")
    public int field1588;

    @ObfuscatedName("ck.au")
    public int field1589;

    @ObfuscatedName("ck.aa")
    public int field1590;

    @ObfuscatedName("ck.ag")
    public int field1568;

    @ObfuscatedName("ck.al")
    public static int[] field1585 = new int[10000];

    @ObfuscatedName("ck.ap")
    public static int[] field1593 = new int[10000];

    @ObfuscatedName("ck.ac")
    public static int field1594 = 0;

    @ObfuscatedName("ck.ak")
    public static int[] field1582 = class81.field1448;

    @ObfuscatedName("ck.ax")
    public static int[] field1562 = class81.field1449;

    public class90() {
    }

    @ObfuscatedName("ck.m(Lek;II)Lck;")
    public static class90 method1944(class142 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2725(arg1, arg2);
        return var3 == null ? null : new class90(var3);
    }

    public class90(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1887(arg0);
        } else {
            this.method1876(arg0);
        }
    }

    @ObfuscatedName("ck.y([B)V")
    public void method1887(byte[] arg0) {
        class104 var2 = new class104(arg0);
        class104 var3 = new class104(arg0);
        class104 var4 = new class104(arg0);
        class104 var5 = new class104(arg0);
        class104 var6 = new class104(arg0);
        class104 var7 = new class104(arg0);
        class104 var8 = new class104(arg0);
        var2.field1806 = arg0.length - 23;
        int var9 = var2.method2132();
        int var10 = var2.method2132();
        int var11 = var2.method2190();
        int var12 = var2.method2190();
        int var13 = var2.method2190();
        int var14 = var2.method2190();
        int var15 = var2.method2190();
        int var16 = var2.method2190();
        int var17 = var2.method2190();
        int var18 = var2.method2132();
        int var19 = var2.method2132();
        int var20 = var2.method2132();
        int var21 = var2.method2132();
        int var22 = var2.method2132();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1574 = new byte[var11];
            var2.field1806 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1574[var26] = var2.method2159();
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
        this.field1576 = var9;
        this.field1554 = var10;
        this.field1565 = var11;
        this.field1559 = new int[var9];
        this.field1552 = new int[var9];
        this.field1553 = new int[var9];
        this.field1555 = new int[var10];
        this.field1556 = new int[var10];
        this.field1557 = new int[var10];
        if (var17 == 1) {
            this.field1596 = new int[var9];
        }
        if (var12 == 1) {
            this.field1558 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1595 = new byte[var10];
        } else {
            this.field1564 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1550 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1578 = new int[var10];
        }
        if (var16 == 1) {
            this.field1563 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1561 = new byte[var10];
        }
        this.field1551 = new short[var10];
        if (var11 > 0) {
            this.field1567 = new short[var11];
            this.field1577 = new short[var11];
            this.field1569 = new short[var11];
            if (var24 > 0) {
                this.field1570 = new short[var24];
                this.field1571 = new short[var24];
                this.field1572 = new short[var24];
                this.field1573 = new short[var24];
                this.field1592 = new byte[var24];
                this.field1566 = new short[var24];
            }
            if (var25 > 0) {
                this.field1575 = new short[var25];
            }
        }
        var2.field1806 = var11;
        var3.field1806 = var44;
        var4.field1806 = var46;
        var5.field1806 = var48;
        var6.field1806 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2190();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2142();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2142();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2142();
            }
            this.field1559[var67] = var64 + var69;
            this.field1552[var67] = var65 + var70;
            this.field1553[var67] = var66 + var71;
            var64 = this.field1559[var67];
            var65 = this.field1552[var67];
            var66 = this.field1553[var67];
            if (var17 == 1) {
                this.field1596[var67] = var6.method2190();
            }
        }
        var2.field1806 = var42;
        var3.field1806 = var31;
        var4.field1806 = var34;
        var5.field1806 = var37;
        var6.field1806 = var35;
        var7.field1806 = var40;
        var8.field1806 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1551[var72] = (short) var2.method2132();
            if (var12 == 1) {
                this.field1558[var72] = var3.method2159();
            }
            if (var13 == 255) {
                this.field1595[var72] = var4.method2159();
            }
            if (var14 == 1) {
                this.field1550[var72] = var5.method2159();
            }
            if (var15 == 1) {
                this.field1578[var72] = var6.method2190();
            }
            if (var16 == 1) {
                this.field1563[var72] = (short) (var7.method2132() - 1);
            }
            if (this.field1561 != null && this.field1563[var72] != -1) {
                this.field1561[var72] = (byte) (var8.method2190() - 1);
            }
        }
        var2.field1806 = var33;
        var3.field1806 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2190();
            if (var78 == 1) {
                var73 = var2.method2142() + var76;
                var74 = var2.method2142() + var73;
                var75 = var2.method2142() + var74;
                var76 = var75;
                this.field1555[var77] = var73;
                this.field1556[var77] = var74;
                this.field1557[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2142() + var76;
                var76 = var75;
                this.field1555[var77] = var73;
                this.field1556[var77] = var74;
                this.field1557[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2142() + var76;
                var76 = var75;
                this.field1555[var77] = var73;
                this.field1556[var77] = var74;
                this.field1557[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2142() + var76;
                var76 = var75;
                this.field1555[var77] = var73;
                this.field1556[var77] = var81;
                this.field1557[var77] = var75;
            }
        }
        var2.field1806 = var50;
        var3.field1806 = var52;
        var4.field1806 = var54;
        var5.field1806 = var56;
        var6.field1806 = var58;
        var7.field1806 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1574[var82] & 0xFF;
            if (var83 == 0) {
                this.field1567[var82] = (short) var2.method2132();
                this.field1577[var82] = (short) var2.method2132();
                this.field1569[var82] = (short) var2.method2132();
            }
            if (var83 == 1) {
                this.field1567[var82] = (short) var3.method2132();
                this.field1577[var82] = (short) var3.method2132();
                this.field1569[var82] = (short) var3.method2132();
                this.field1570[var82] = (short) var4.method2132();
                this.field1571[var82] = (short) var4.method2132();
                this.field1572[var82] = (short) var4.method2132();
                this.field1573[var82] = (short) var5.method2132();
                this.field1592[var82] = var6.method2159();
                this.field1566[var82] = (short) var7.method2132();
            }
            if (var83 == 2) {
                this.field1567[var82] = (short) var3.method2132();
                this.field1577[var82] = (short) var3.method2132();
                this.field1569[var82] = (short) var3.method2132();
                this.field1570[var82] = (short) var4.method2132();
                this.field1571[var82] = (short) var4.method2132();
                this.field1572[var82] = (short) var4.method2132();
                this.field1573[var82] = (short) var5.method2132();
                this.field1592[var82] = var6.method2159();
                this.field1566[var82] = (short) var7.method2132();
                this.field1575[var82] = (short) var7.method2132();
            }
            if (var83 == 3) {
                this.field1567[var82] = (short) var3.method2132();
                this.field1577[var82] = (short) var3.method2132();
                this.field1569[var82] = (short) var3.method2132();
                this.field1570[var82] = (short) var4.method2132();
                this.field1571[var82] = (short) var4.method2132();
                this.field1572[var82] = (short) var4.method2132();
                this.field1573[var82] = (short) var5.method2132();
                this.field1592[var82] = var6.method2159();
                this.field1566[var82] = (short) var7.method2132();
            }
        }
        var2.field1806 = var62;
        int var84 = var2.method2190();
        if (var84 == 0) {
            return;
        }
        new class80();
        var2.method2132();
        var2.method2132();
        var2.method2132();
        var2.method2135();
    }

    @ObfuscatedName("ck.g([B)V")
    public void method1876(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class104 var4 = new class104(arg0);
        class104 var5 = new class104(arg0);
        class104 var6 = new class104(arg0);
        class104 var7 = new class104(arg0);
        class104 var8 = new class104(arg0);
        var4.field1806 = arg0.length - 18;
        int var9 = var4.method2132();
        int var10 = var4.method2132();
        int var11 = var4.method2190();
        int var12 = var4.method2190();
        int var13 = var4.method2190();
        int var14 = var4.method2190();
        int var15 = var4.method2190();
        int var16 = var4.method2190();
        int var17 = var4.method2132();
        int var18 = var4.method2132();
        int var19 = var4.method2132();
        int var20 = var4.method2132();
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
        this.field1576 = var9;
        this.field1554 = var10;
        this.field1565 = var11;
        this.field1559 = new int[var9];
        this.field1552 = new int[var9];
        this.field1553 = new int[var9];
        this.field1555 = new int[var10];
        this.field1556 = new int[var10];
        this.field1557 = new int[var10];
        if (var11 > 0) {
            this.field1574 = new byte[var11];
            this.field1567 = new short[var11];
            this.field1577 = new short[var11];
            this.field1569 = new short[var11];
        }
        if (var16 == 1) {
            this.field1596 = new int[var9];
        }
        if (var12 == 1) {
            this.field1558 = new byte[var10];
            this.field1561 = new byte[var10];
            this.field1563 = new short[var10];
        }
        if (var13 == 255) {
            this.field1595 = new byte[var10];
        } else {
            this.field1564 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1550 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1578 = new int[var10];
        }
        this.field1551 = new short[var10];
        var4.field1806 = var21;
        var5.field1806 = var36;
        var6.field1806 = var38;
        var7.field1806 = var40;
        var8.field1806 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2190();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2142();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2142();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2142();
            }
            this.field1559[var46] = var43 + var48;
            this.field1552[var46] = var44 + var49;
            this.field1553[var46] = var45 + var50;
            var43 = this.field1559[var46];
            var44 = this.field1552[var46];
            var45 = this.field1553[var46];
            if (var16 == 1) {
                this.field1596[var46] = var8.method2190();
            }
        }
        var4.field1806 = var32;
        var5.field1806 = var28;
        var6.field1806 = var26;
        var7.field1806 = var30;
        var8.field1806 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1551[var51] = (short) var4.method2132();
            if (var12 == 1) {
                int var52 = var5.method2190();
                if ((var52 & 0x1) == 1) {
                    this.field1558[var51] = 1;
                    var2 = true;
                } else {
                    this.field1558[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1561[var51] = (byte) (var52 >> 2);
                    this.field1563[var51] = this.field1551[var51];
                    this.field1551[var51] = 127;
                    if (this.field1563[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1561[var51] = -1;
                    this.field1563[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1595[var51] = var6.method2159();
            }
            if (var14 == 1) {
                this.field1550[var51] = var7.method2159();
            }
            if (var15 == 1) {
                this.field1578[var51] = var8.method2190();
            }
        }
        var4.field1806 = var25;
        var5.field1806 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2190();
            if (var58 == 1) {
                var53 = var4.method2142() + var56;
                var54 = var4.method2142() + var53;
                var55 = var4.method2142() + var54;
                var56 = var55;
                this.field1555[var57] = var53;
                this.field1556[var57] = var54;
                this.field1557[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2142() + var56;
                var56 = var55;
                this.field1555[var57] = var53;
                this.field1556[var57] = var54;
                this.field1557[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2142() + var56;
                var56 = var55;
                this.field1555[var57] = var53;
                this.field1556[var57] = var54;
                this.field1557[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2142() + var56;
                var56 = var55;
                this.field1555[var57] = var53;
                this.field1556[var57] = var61;
                this.field1557[var57] = var55;
            }
        }
        var4.field1806 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1574[var62] = 0;
            this.field1567[var62] = (short) var4.method2132();
            this.field1577[var62] = (short) var4.method2132();
            this.field1569[var62] = (short) var4.method2132();
        }
        if (this.field1561 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1561[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1567[var65] & 0xFFFF) == this.field1555[var64] && (this.field1577[var65] & 0xFFFF) == this.field1556[var64] && (this.field1569[var65] & 0xFFFF) == this.field1557[var64]) {
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
            this.field1563 = null;
        }
        if (!var2) {
            this.field1558 = null;
        }
    }

    public class90(class90[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1576 = 0;
        this.field1554 = 0;
        this.field1565 = 0;
        this.field1564 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class90 var10 = arg0[var9];
            if (var10 != null) {
                this.field1576 += var10.field1576;
                this.field1554 += var10.field1554;
                this.field1565 += var10.field1565;
                if (var10.field1595 == null) {
                    if (this.field1564 == -1) {
                        this.field1564 = var10.field1564;
                    }
                    if (this.field1564 != var10.field1564) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1558 != null;
                var5 |= var10.field1550 != null;
                var6 |= var10.field1578 != null;
                var7 |= var10.field1563 != null;
                var8 |= var10.field1561 != null;
            }
        }
        this.field1559 = new int[this.field1576];
        this.field1552 = new int[this.field1576];
        this.field1553 = new int[this.field1576];
        this.field1596 = new int[this.field1576];
        this.field1555 = new int[this.field1554];
        this.field1556 = new int[this.field1554];
        this.field1557 = new int[this.field1554];
        if (var3) {
            this.field1558 = new byte[this.field1554];
        }
        if (var4) {
            this.field1595 = new byte[this.field1554];
        }
        if (var5) {
            this.field1550 = new byte[this.field1554];
        }
        if (var6) {
            this.field1578 = new int[this.field1554];
        }
        if (var7) {
            this.field1563 = new short[this.field1554];
        }
        if (var8) {
            this.field1561 = new byte[this.field1554];
        }
        this.field1551 = new short[this.field1554];
        if (this.field1565 > 0) {
            this.field1574 = new byte[this.field1565];
            this.field1567 = new short[this.field1565];
            this.field1577 = new short[this.field1565];
            this.field1569 = new short[this.field1565];
            this.field1570 = new short[this.field1565];
            this.field1571 = new short[this.field1565];
            this.field1572 = new short[this.field1565];
            this.field1573 = new short[this.field1565];
            this.field1592 = new byte[this.field1565];
            this.field1566 = new short[this.field1565];
            this.field1575 = new short[this.field1565];
        }
        this.field1576 = 0;
        this.field1554 = 0;
        this.field1565 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class90 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1554; var13++) {
                    if (var3 && var12.field1558 != null) {
                        this.field1558[this.field1554] = var12.field1558[var13];
                    }
                    if (var4) {
                        if (var12.field1595 == null) {
                            this.field1595[this.field1554] = var12.field1564;
                        } else {
                            this.field1595[this.field1554] = var12.field1595[var13];
                        }
                    }
                    if (var5 && var12.field1550 != null) {
                        this.field1550[this.field1554] = var12.field1550[var13];
                    }
                    if (var6 && var12.field1578 != null) {
                        this.field1578[this.field1554] = var12.field1578[var13];
                    }
                    if (var7) {
                        if (var12.field1563 == null) {
                            this.field1563[this.field1554] = -1;
                        } else {
                            this.field1563[this.field1554] = var12.field1563[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1561 == null || var12.field1561[var13] == -1) {
                            this.field1561[this.field1554] = -1;
                        } else {
                            this.field1561[this.field1554] = (byte) (var12.field1561[var13] + this.field1565);
                        }
                    }
                    this.field1551[this.field1554] = var12.field1551[var13];
                    this.field1555[this.field1554] = this.method1878(var12, var12.field1555[var13]);
                    this.field1556[this.field1554] = this.method1878(var12, var12.field1556[var13]);
                    this.field1557[this.field1554] = this.method1878(var12, var12.field1557[var13]);
                    this.field1554++;
                }
                for (int var14 = 0; var14 < var12.field1565; var14++) {
                    byte var15 = this.field1574[this.field1565] = var12.field1574[var14];
                    if (var15 == 0) {
                        this.field1567[this.field1565] = (short) this.method1878(var12, var12.field1567[var14]);
                        this.field1577[this.field1565] = (short) this.method1878(var12, var12.field1577[var14]);
                        this.field1569[this.field1565] = (short) this.method1878(var12, var12.field1569[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1567[this.field1565] = var12.field1567[var14];
                        this.field1577[this.field1565] = var12.field1577[var14];
                        this.field1569[this.field1565] = var12.field1569[var14];
                        this.field1570[this.field1565] = var12.field1570[var14];
                        this.field1571[this.field1565] = var12.field1571[var14];
                        this.field1572[this.field1565] = var12.field1572[var14];
                        this.field1573[this.field1565] = var12.field1573[var14];
                        this.field1592[this.field1565] = var12.field1592[var14];
                        this.field1566[this.field1565] = var12.field1566[var14];
                    }
                    if (var15 == 2) {
                        this.field1575[this.field1565] = var12.field1575[var14];
                    }
                    this.field1565++;
                }
            }
        }
    }

    @ObfuscatedName("ck.r(Lck;I)I")
    public final int method1878(class90 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1559[arg1];
        int var5 = arg0.field1552[arg1];
        int var6 = arg0.field1553[arg1];
        for (int var7 = 0; var7 < this.field1576; var7++) {
            if (this.field1559[var7] == var4 && this.field1552[var7] == var5 && this.field1553[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1559[this.field1576] = var4;
            this.field1552[this.field1576] = var5;
            this.field1553[this.field1576] = var6;
            if (arg0.field1596 != null) {
                this.field1596[this.field1576] = arg0.field1596[arg1];
            }
            var3 = this.field1576++;
        }
        return var3;
    }

    public class90(class90 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1576 = arg0.field1576;
        this.field1554 = arg0.field1554;
        this.field1565 = arg0.field1565;
        if (arg1) {
            this.field1559 = arg0.field1559;
            this.field1552 = arg0.field1552;
            this.field1553 = arg0.field1553;
        } else {
            this.field1559 = new int[this.field1576];
            this.field1552 = new int[this.field1576];
            this.field1553 = new int[this.field1576];
            for (int var6 = 0; var6 < this.field1576; var6++) {
                this.field1559[var6] = arg0.field1559[var6];
                this.field1552[var6] = arg0.field1552[var6];
                this.field1553[var6] = arg0.field1553[var6];
            }
        }
        if (arg2) {
            this.field1551 = arg0.field1551;
        } else {
            this.field1551 = new short[this.field1554];
            for (int var7 = 0; var7 < this.field1554; var7++) {
                this.field1551[var7] = arg0.field1551[var7];
            }
        }
        if (arg3 || arg0.field1563 == null) {
            this.field1563 = arg0.field1563;
        } else {
            this.field1563 = new short[this.field1554];
            for (int var8 = 0; var8 < this.field1554; var8++) {
                this.field1563[var8] = arg0.field1563[var8];
            }
        }
        if (arg4) {
            this.field1550 = arg0.field1550;
        } else {
            this.field1550 = new byte[this.field1554];
            if (arg0.field1550 == null) {
                for (int var9 = 0; var9 < this.field1554; var9++) {
                    this.field1550[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1554; var10++) {
                    this.field1550[var10] = arg0.field1550[var10];
                }
            }
        }
        this.field1555 = arg0.field1555;
        this.field1556 = arg0.field1556;
        this.field1557 = arg0.field1557;
        this.field1558 = arg0.field1558;
        this.field1595 = arg0.field1595;
        this.field1561 = arg0.field1561;
        this.field1564 = arg0.field1564;
        this.field1574 = arg0.field1574;
        this.field1567 = arg0.field1567;
        this.field1577 = arg0.field1577;
        this.field1569 = arg0.field1569;
        this.field1570 = arg0.field1570;
        this.field1571 = arg0.field1571;
        this.field1572 = arg0.field1572;
        this.field1573 = arg0.field1573;
        this.field1592 = arg0.field1592;
        this.field1566 = arg0.field1566;
        this.field1575 = arg0.field1575;
        this.field1596 = arg0.field1596;
        this.field1578 = arg0.field1578;
        this.field1579 = arg0.field1579;
        this.field1580 = arg0.field1580;
        this.field1581 = arg0.field1581;
        this.field1591 = arg0.field1591;
        this.field1583 = arg0.field1583;
        this.field1584 = arg0.field1584;
        this.field1560 = arg0.field1560;
    }

    @ObfuscatedName("ck.u()Lck;")
    public class90 method1879() {
        class90 var1 = new class90();
        if (this.field1558 != null) {
            var1.field1558 = new byte[this.field1554];
            for (int var2 = 0; var2 < this.field1554; var2++) {
                var1.field1558[var2] = this.field1558[var2];
            }
        }
        var1.field1576 = this.field1576;
        var1.field1554 = this.field1554;
        var1.field1565 = this.field1565;
        var1.field1559 = this.field1559;
        var1.field1552 = this.field1552;
        var1.field1553 = this.field1553;
        var1.field1555 = this.field1555;
        var1.field1556 = this.field1556;
        var1.field1557 = this.field1557;
        var1.field1595 = this.field1595;
        var1.field1550 = this.field1550;
        var1.field1561 = this.field1561;
        var1.field1551 = this.field1551;
        var1.field1563 = this.field1563;
        var1.field1564 = this.field1564;
        var1.field1574 = this.field1574;
        var1.field1567 = this.field1567;
        var1.field1577 = this.field1577;
        var1.field1569 = this.field1569;
        var1.field1570 = this.field1570;
        var1.field1571 = this.field1571;
        var1.field1572 = this.field1572;
        var1.field1573 = this.field1573;
        var1.field1592 = this.field1592;
        var1.field1566 = this.field1566;
        var1.field1575 = this.field1575;
        var1.field1596 = this.field1596;
        var1.field1578 = this.field1578;
        var1.field1579 = this.field1579;
        var1.field1580 = this.field1580;
        var1.field1581 = this.field1581;
        var1.field1591 = this.field1591;
        var1.field1584 = this.field1584;
        var1.field1560 = this.field1560;
        return var1;
    }

    @ObfuscatedName("ck.d([[IIIIZI)Lck;")
    public class90 method1946(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1893();
        int var7 = this.field1588 + arg1;
        int var8 = this.field1589 + arg1;
        int var9 = this.field1568 + arg3;
        int var10 = this.field1590 + arg3;
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
            var15.field1576 = this.field1576;
            var15.field1554 = this.field1554;
            var15.field1565 = this.field1565;
            var15.field1559 = this.field1559;
            var15.field1553 = this.field1553;
            var15.field1555 = this.field1555;
            var15.field1556 = this.field1556;
            var15.field1557 = this.field1557;
            var15.field1558 = this.field1558;
            var15.field1595 = this.field1595;
            var15.field1550 = this.field1550;
            var15.field1561 = this.field1561;
            var15.field1551 = this.field1551;
            var15.field1563 = this.field1563;
            var15.field1564 = this.field1564;
            var15.field1574 = this.field1574;
            var15.field1567 = this.field1567;
            var15.field1577 = this.field1577;
            var15.field1569 = this.field1569;
            var15.field1570 = this.field1570;
            var15.field1571 = this.field1571;
            var15.field1572 = this.field1572;
            var15.field1573 = this.field1573;
            var15.field1592 = this.field1592;
            var15.field1566 = this.field1566;
            var15.field1575 = this.field1575;
            var15.field1596 = this.field1596;
            var15.field1578 = this.field1578;
            var15.field1579 = this.field1579;
            var15.field1580 = this.field1580;
            var15.field1584 = this.field1584;
            var15.field1560 = this.field1560;
            var15.field1552 = new int[var15.field1576];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1576; var16++) {
                int var17 = this.field1559[var16] + arg1;
                int var18 = this.field1553[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1552[var16] = this.field1552[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1576; var26++) {
                int var27 = (-this.field1552[var26] << 16) / this.field1315;
                if (var27 < arg5) {
                    int var28 = this.field1559[var26] + arg1;
                    int var29 = this.field1553[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1552[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1552[var26];
                }
            }
        }
        var15.method1892();
        return var15;
    }

    @ObfuscatedName("ck.t()V")
    public void method1881() {
        int var10002;
        if (this.field1596 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1576; var3++) {
                int var4 = this.field1596[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1579 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1579[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1576) {
                int var7 = this.field1596[var6];
                this.field1579[var7][var1[var7]++] = var6++;
            }
            this.field1596 = null;
        }
        if (this.field1578 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1554; var10++) {
            int var11 = this.field1578[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1580 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1580[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1554) {
            int var14 = this.field1578[var13];
            this.field1580[var14][var8[var14]++] = var13++;
        }
        this.field1578 = null;
    }

    @ObfuscatedName("ck.j()V")
    public void method1882() {
        for (int var1 = 0; var1 < this.field1576; var1++) {
            int var2 = this.field1559[var1];
            this.field1559[var1] = this.field1553[var1];
            this.field1553[var1] = -var2;
        }
        this.method1892();
    }

    @ObfuscatedName("ck.q()V")
    public void method1894() {
        for (int var1 = 0; var1 < this.field1576; var1++) {
            this.field1559[var1] = -this.field1559[var1];
            this.field1553[var1] = -this.field1553[var1];
        }
        this.method1892();
    }

    @ObfuscatedName("ck.p()V")
    public void method1940() {
        for (int var1 = 0; var1 < this.field1576; var1++) {
            int var2 = this.field1553[var1];
            this.field1553[var1] = this.field1559[var1];
            this.field1559[var1] = -var2;
        }
        this.method1892();
    }

    @ObfuscatedName("ck.v(I)V")
    public void method1885(int arg0) {
        int var2 = field1582[arg0];
        int var3 = field1562[arg0];
        for (int var4 = 0; var4 < this.field1576; var4++) {
            int var5 = this.field1559[var4] * var3 + this.field1553[var4] * var2 >> 16;
            this.field1553[var4] = this.field1553[var4] * var3 - this.field1559[var4] * var2 >> 16;
            this.field1559[var4] = var5;
        }
        this.method1892();
    }

    @ObfuscatedName("ck.n(III)V")
    public void method1886(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1576; var4++) {
            this.field1559[var4] += arg0;
            this.field1552[var4] += arg1;
            this.field1553[var4] += arg2;
        }
        this.method1892();
    }

    @ObfuscatedName("ck.l(SS)V")
    public void method1957(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1554; var3++) {
            if (this.field1551[var3] == arg0) {
                this.field1551[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ck.c(SS)V")
    public void method1910(short arg0, short arg1) {
        if (this.field1563 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1554; var3++) {
            if (this.field1563[var3] == arg0) {
                this.field1563[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ck.b()V")
    public void method1889() {
        for (int var1 = 0; var1 < this.field1576; var1++) {
            this.field1553[var1] = -this.field1553[var1];
        }
        for (int var2 = 0; var2 < this.field1554; var2++) {
            int var3 = this.field1555[var2];
            this.field1555[var2] = this.field1557[var2];
            this.field1557[var2] = var3;
        }
        this.method1892();
    }

    @ObfuscatedName("ck.s(III)V")
    public void method1921(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1576; var4++) {
            this.field1559[var4] = this.field1559[var4] * arg0 / 128;
            this.field1552[var4] = this.field1552[var4] * arg1 / 128;
            this.field1553[var4] = this.field1553[var4] * arg2 / 128;
        }
        this.method1892();
    }

    @ObfuscatedName("ck.az()V")
    public void method1891() {
        if (this.field1581 != null) {
            return;
        }
        this.field1581 = new class86[this.field1576];
        for (int var1 = 0; var1 < this.field1576; var1++) {
            this.field1581[var1] = new class86();
        }
        for (int var2 = 0; var2 < this.field1554; var2++) {
            int var3 = this.field1555[var2];
            int var4 = this.field1556[var2];
            int var5 = this.field1557[var2];
            int var6 = this.field1559[var4] - this.field1559[var3];
            int var7 = this.field1552[var4] - this.field1552[var3];
            int var8 = this.field1553[var4] - this.field1553[var3];
            int var9 = this.field1559[var5] - this.field1559[var3];
            int var10 = this.field1552[var5] - this.field1552[var3];
            int var11 = this.field1553[var5] - this.field1553[var3];
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
            if (this.field1558 == null) {
                var19 = 0;
            } else {
                var19 = this.field1558[var2];
            }
            if (var19 == 0) {
                class86 var20 = this.field1581[var3];
                var20.field1494 += var16;
                var20.field1491 += var17;
                var20.field1492 += var18;
                var20.field1493++;
                class86 var21 = this.field1581[var4];
                var21.field1494 += var16;
                var21.field1491 += var17;
                var21.field1492 += var18;
                var21.field1493++;
                class86 var22 = this.field1581[var5];
                var22.field1494 += var16;
                var22.field1491 += var17;
                var22.field1492 += var18;
                var22.field1493++;
            } else if (var19 == 1) {
                if (this.field1591 == null) {
                    this.field1591 = new class74[this.field1554];
                }
                class74 var23 = this.field1591[var2] = new class74();
                var23.field1308 = var16;
                var23.field1312 = var17;
                var23.field1313 = var18;
            }
        }
    }

    @ObfuscatedName("ck.av()V")
    public void method1892() {
        this.field1581 = null;
        this.field1583 = null;
        this.field1591 = null;
        this.field1586 = false;
    }

    @ObfuscatedName("ck.ay()V")
    public void method1893() {
        if (this.field1586) {
            return;
        }
        this.field1315 = 0;
        this.field1587 = 0;
        this.field1588 = 999999;
        this.field1589 = -999999;
        this.field1590 = -99999;
        this.field1568 = 99999;
        for (int var1 = 0; var1 < this.field1576; var1++) {
            int var2 = this.field1559[var1];
            int var3 = this.field1552[var1];
            int var4 = this.field1553[var1];
            if (var2 < this.field1588) {
                this.field1588 = var2;
            }
            if (var2 > this.field1589) {
                this.field1589 = var2;
            }
            if (var4 < this.field1568) {
                this.field1568 = var4;
            }
            if (var4 > this.field1590) {
                this.field1590 = var4;
            }
            if (-var3 > this.field1315) {
                this.field1315 = -var3;
            }
            if (var3 > this.field1587) {
                this.field1587 = var3;
            }
        }
        this.field1586 = true;
    }

    @ObfuscatedName("ck.ah(Lck;Lck;IIIZ)V")
    public static void method1928(class90 arg0, class90 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1893();
        arg0.method1891();
        arg1.method1893();
        arg1.method1891();
        field1594++;
        int var6 = 0;
        int[] var7 = arg1.field1559;
        int var8 = arg1.field1576;
        for (int var9 = 0; var9 < arg0.field1576; var9++) {
            class86 var10 = arg0.field1581[var9];
            if (var10.field1493 != 0) {
                int var11 = arg0.field1552[var9] - arg3;
                if (var11 <= arg1.field1587) {
                    int var12 = arg0.field1559[var9] - arg2;
                    if (var12 >= arg1.field1588 && var12 <= arg1.field1589) {
                        int var13 = arg0.field1553[var9] - arg4;
                        if (var13 >= arg1.field1568 && var13 <= arg1.field1590) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class86 var15 = arg1.field1581[var14];
                                if (var7[var14] == var12 && arg1.field1553[var14] == var13 && arg1.field1552[var14] == var11 && var15.field1493 != 0) {
                                    if (arg0.field1583 == null) {
                                        arg0.field1583 = new class86[arg0.field1576];
                                    }
                                    if (arg1.field1583 == null) {
                                        arg1.field1583 = new class86[var8];
                                    }
                                    class86 var16 = arg0.field1583[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1583[var9] = new class86(var10);
                                    }
                                    class86 var17 = arg1.field1583[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1583[var14] = new class86(var15);
                                    }
                                    var16.field1494 += var15.field1494;
                                    var16.field1491 += var15.field1491;
                                    var16.field1492 += var15.field1492;
                                    var16.field1493 += var15.field1493;
                                    var17.field1494 += var10.field1494;
                                    var17.field1491 += var10.field1491;
                                    var17.field1492 += var10.field1492;
                                    var17.field1493 += var10.field1493;
                                    var6++;
                                    field1585[var9] = field1594;
                                    field1593[var14] = field1594;
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
        for (int var18 = 0; var18 < arg0.field1554; var18++) {
            if (field1585[arg0.field1555[var18]] == field1594 && field1585[arg0.field1556[var18]] == field1594 && field1585[arg0.field1557[var18]] == field1594) {
                if (arg0.field1558 == null) {
                    arg0.field1558 = new byte[arg0.field1554];
                }
                arg0.field1558[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1554; var19++) {
            if (field1593[arg1.field1555[var19]] == field1594 && field1593[arg1.field1556[var19]] == field1594 && field1593[arg1.field1557[var19]] == field1594) {
                if (arg1.field1558 == null) {
                    arg1.field1558 = new byte[arg1.field1554];
                }
                arg1.field1558[var19] = 2;
            }
        }
    }

    @ObfuscatedName("ck.ao(IIIII)Lcl;")
    public final class95 method1872(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1891();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class95 var8 = new class95();
        var8.field1674 = new int[this.field1554];
        var8.field1675 = new int[this.field1554];
        var8.field1687 = new int[this.field1554];
        if (this.field1565 > 0 && this.field1561 != null) {
            int[] var9 = new int[this.field1565];
            for (int var10 = 0; var10 < this.field1554; var10++) {
                if (this.field1561[var10] != -1) {
                    var9[this.field1561[var10] & 0xFF]++;
                }
            }
            var8.field1717 = 0;
            for (int var11 = 0; var11 < this.field1565; var11++) {
                if (var9[var11] > 0 && this.field1574[var11] == 0) {
                    var8.field1717++;
                }
            }
            var8.field1683 = new int[var8.field1717];
            var8.field1704 = new int[var8.field1717];
            var8.field1686 = new int[var8.field1717];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1565; var13++) {
                if (var9[var13] > 0 && this.field1574[var13] == 0) {
                    var8.field1683[var12] = this.field1567[var13] & 0xFFFF;
                    var8.field1704[var12] = this.field1577[var13] & 0xFFFF;
                    var8.field1686[var12] = this.field1569[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1679 = new byte[this.field1554];
            for (int var14 = 0; var14 < this.field1554; var14++) {
                if (this.field1561[var14] == -1) {
                    var8.field1679[var14] = -1;
                } else {
                    var8.field1679[var14] = (byte) var9[this.field1561[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1554; var15++) {
            byte var16;
            if (this.field1558 == null) {
                var16 = 0;
            } else {
                var16 = this.field1558[var15];
            }
            byte var17;
            if (this.field1550 == null) {
                var17 = 0;
            } else {
                var17 = this.field1550[var15];
            }
            short var18;
            if (this.field1563 == null) {
                var18 = -1;
            } else {
                var18 = this.field1563[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1551[var15] & 0xFFFF;
                    class86 var20;
                    if (this.field1583 == null || this.field1583[this.field1555[var15]] == null) {
                        var20 = this.field1581[this.field1555[var15]];
                    } else {
                        var20 = this.field1583[this.field1555[var15]];
                    }
                    int var21 = (var20.field1492 * arg4 + var20.field1494 * arg2 + var20.field1491 * arg3) / (var20.field1493 * var7) + arg0;
                    var8.field1674[var15] = method1896(var19, var21);
                    class86 var22;
                    if (this.field1583 == null || this.field1583[this.field1556[var15]] == null) {
                        var22 = this.field1581[this.field1556[var15]];
                    } else {
                        var22 = this.field1583[this.field1556[var15]];
                    }
                    int var23 = (var22.field1492 * arg4 + var22.field1494 * arg2 + var22.field1491 * arg3) / (var22.field1493 * var7) + arg0;
                    var8.field1675[var15] = method1896(var19, var23);
                    class86 var24;
                    if (this.field1583 == null || this.field1583[this.field1557[var15]] == null) {
                        var24 = this.field1581[this.field1557[var15]];
                    } else {
                        var24 = this.field1583[this.field1557[var15]];
                    }
                    int var25 = (var24.field1492 * arg4 + var24.field1494 * arg2 + var24.field1491 * arg3) / (var24.field1493 * var7) + arg0;
                    var8.field1687[var15] = method1896(var19, var25);
                } else if (var16 == 1) {
                    class74 var26 = this.field1591[var15];
                    int var27 = (var26.field1313 * arg4 + var26.field1312 * arg3 + var26.field1308 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1674[var15] = method1896(this.field1551[var15] & 0xFFFF, var27);
                    var8.field1687[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1674[var15] = 128;
                    var8.field1687[var15] = -1;
                } else {
                    var8.field1687[var15] = -2;
                }
            } else if (var16 == 0) {
                class86 var28;
                if (this.field1583 == null || this.field1583[this.field1555[var15]] == null) {
                    var28 = this.field1581[this.field1555[var15]];
                } else {
                    var28 = this.field1583[this.field1555[var15]];
                }
                int var29 = (var28.field1492 * arg4 + var28.field1494 * arg2 + var28.field1491 * arg3) / (var28.field1493 * var7) + arg0;
                var8.field1674[var15] = method1897(var29);
                class86 var30;
                if (this.field1583 == null || this.field1583[this.field1556[var15]] == null) {
                    var30 = this.field1581[this.field1556[var15]];
                } else {
                    var30 = this.field1583[this.field1556[var15]];
                }
                int var31 = (var30.field1492 * arg4 + var30.field1494 * arg2 + var30.field1491 * arg3) / (var30.field1493 * var7) + arg0;
                var8.field1675[var15] = method1897(var31);
                class86 var32;
                if (this.field1583 == null || this.field1583[this.field1557[var15]] == null) {
                    var32 = this.field1581[this.field1557[var15]];
                } else {
                    var32 = this.field1583[this.field1557[var15]];
                }
                int var33 = (var32.field1492 * arg4 + var32.field1494 * arg2 + var32.field1491 * arg3) / (var32.field1493 * var7) + arg0;
                var8.field1687[var15] = method1897(var33);
            } else if (var16 == 1) {
                class74 var34 = this.field1591[var15];
                int var35 = (var34.field1313 * arg4 + var34.field1312 * arg3 + var34.field1308 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1674[var15] = method1897(var35);
                var8.field1687[var15] = -1;
            } else {
                var8.field1687[var15] = -2;
            }
        }
        this.method1881();
        var8.field1700 = this.field1576;
        var8.field1676 = this.field1559;
        var8.field1668 = this.field1552;
        var8.field1669 = this.field1553;
        var8.field1670 = this.field1554;
        var8.field1695 = this.field1555;
        var8.field1672 = this.field1556;
        var8.field1673 = this.field1557;
        var8.field1688 = this.field1595;
        var8.field1678 = this.field1550;
        var8.field1662 = this.field1564;
        var8.field1719 = this.field1579;
        var8.field1703 = this.field1580;
        var8.field1680 = this.field1563;
        return var8;
    }

    @ObfuscatedName("ck.aj(II)I")
    public static final int method1896(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ck.ad(I)I")
    public static final int method1897(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
