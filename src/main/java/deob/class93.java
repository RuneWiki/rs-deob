package deob;

@ObfuscatedName("ca")
public class class93 extends class78 {

    @ObfuscatedName("ca.t")
    public int field1580 = 0;

    @ObfuscatedName("ca.s")
    public int[] field1575;

    @ObfuscatedName("ca.f")
    public int[] field1607;

    @ObfuscatedName("ca.e")
    public int[] field1577;

    @ObfuscatedName("ca.d")
    public int field1578 = 0;

    @ObfuscatedName("ca.n")
    public int[] field1579;

    @ObfuscatedName("ca.v")
    public int[] field1615;

    @ObfuscatedName("ca.z")
    public int[] field1581;

    @ObfuscatedName("ca.j")
    public byte[] field1582;

    @ObfuscatedName("ca.u")
    public byte[] field1614;

    @ObfuscatedName("ca.g")
    public byte[] field1616;

    @ObfuscatedName("ca.a")
    public byte[] field1585;

    @ObfuscatedName("ca.c")
    public short[] field1574;

    @ObfuscatedName("ca.w")
    public short[] field1587;

    @ObfuscatedName("ca.l")
    public byte field1620 = 0;

    @ObfuscatedName("ca.q")
    public int field1589;

    @ObfuscatedName("ca.x")
    public byte[] field1583;

    @ObfuscatedName("ca.p")
    public short[] field1590;

    @ObfuscatedName("ca.y")
    public short[] field1592;

    @ObfuscatedName("ca.r")
    public short[] field1602;

    @ObfuscatedName("ca.k")
    public short[] field1594;

    @ObfuscatedName("ca.b")
    public short[] field1595;

    @ObfuscatedName("ca.h")
    public short[] field1586;

    @ObfuscatedName("ca.i")
    public short[] field1597;

    @ObfuscatedName("ca.o")
    public short[] field1598;

    @ObfuscatedName("ca.m")
    public short[] field1593;

    @ObfuscatedName("ca.ak")
    public byte[] field1600;

    @ObfuscatedName("ca.aw")
    public int[] field1601;

    @ObfuscatedName("ca.af")
    public int[] field1576;

    @ObfuscatedName("ca.ab")
    public int[][] field1603;

    @ObfuscatedName("ca.ao")
    public int[][] field1604;

    @ObfuscatedName("ca.ah")
    public class77[] field1605;

    @ObfuscatedName("ca.ae")
    public class89[] field1606;

    @ObfuscatedName("ca.ax")
    public class89[] field1599;

    @ObfuscatedName("ca.ar")
    public short field1588;

    @ObfuscatedName("ca.aq")
    public short field1609;

    @ObfuscatedName("ca.am")
    public boolean field1610 = false;

    @ObfuscatedName("ca.az")
    public int field1611;

    @ObfuscatedName("ca.an")
    public int field1612;

    @ObfuscatedName("ca.at")
    public int field1613;

    @ObfuscatedName("ca.av")
    public int field1584;

    @ObfuscatedName("ca.aa")
    public int field1596;

    @ObfuscatedName("ca.ag")
    public static int[] field1608 = new int[10000];

    @ObfuscatedName("ca.au")
    public static int[] field1617 = new int[10000];

    @ObfuscatedName("ca.aj")
    public static int field1618 = 0;

    @ObfuscatedName("ca.ay")
    public static int[] field1619 = class84.field1461;

    @ObfuscatedName("ca.ac")
    public static int[] field1591 = class84.field1471;

    public class93() {
    }

    @ObfuscatedName("ca.t(Leg;II)Lca;")
    public static class93 method1872(class146 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2709(arg1, arg2);
        return var3 == null ? null : new class93(var3);
    }

    public class93(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1874(arg0);
        } else {
            this.method1852(arg0);
        }
    }

    @ObfuscatedName("ca.f([B)V")
    public void method1874(byte[] arg0) {
        class107 var2 = new class107(arg0);
        class107 var3 = new class107(arg0);
        class107 var4 = new class107(arg0);
        class107 var5 = new class107(arg0);
        class107 var6 = new class107(arg0);
        class107 var7 = new class107(arg0);
        class107 var8 = new class107(arg0);
        var2.field1830 = arg0.length - 23;
        int var9 = var2.method2103();
        int var10 = var2.method2103();
        int var11 = var2.method2101();
        int var12 = var2.method2101();
        int var13 = var2.method2101();
        int var14 = var2.method2101();
        int var15 = var2.method2101();
        int var16 = var2.method2101();
        int var17 = var2.method2101();
        int var18 = var2.method2103();
        int var19 = var2.method2103();
        int var20 = var2.method2103();
        int var21 = var2.method2103();
        int var22 = var2.method2103();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1583 = new byte[var11];
            var2.field1830 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1583[var26] = var2.method2102();
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
        this.field1580 = var9;
        this.field1578 = var10;
        this.field1589 = var11;
        this.field1575 = new int[var9];
        this.field1607 = new int[var9];
        this.field1577 = new int[var9];
        this.field1579 = new int[var10];
        this.field1615 = new int[var10];
        this.field1581 = new int[var10];
        if (var17 == 1) {
            this.field1601 = new int[var9];
        }
        if (var12 == 1) {
            this.field1582 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1614 = new byte[var10];
        } else {
            this.field1620 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1616 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1576 = new int[var10];
        }
        if (var16 == 1) {
            this.field1587 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1585 = new byte[var10];
        }
        this.field1574 = new short[var10];
        if (var11 > 0) {
            this.field1590 = new short[var11];
            this.field1592 = new short[var11];
            this.field1602 = new short[var11];
            if (var24 > 0) {
                this.field1594 = new short[var24];
                this.field1595 = new short[var24];
                this.field1586 = new short[var24];
                this.field1597 = new short[var24];
                this.field1600 = new byte[var24];
                this.field1598 = new short[var24];
            }
            if (var25 > 0) {
                this.field1593 = new short[var25];
            }
        }
        var2.field1830 = var11;
        var3.field1830 = var44;
        var4.field1830 = var46;
        var5.field1830 = var48;
        var6.field1830 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2101();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2213();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2213();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2213();
            }
            this.field1575[var67] = var64 + var69;
            this.field1607[var67] = var65 + var70;
            this.field1577[var67] = var66 + var71;
            var64 = this.field1575[var67];
            var65 = this.field1607[var67];
            var66 = this.field1577[var67];
            if (var17 == 1) {
                this.field1601[var67] = var6.method2101();
            }
        }
        var2.field1830 = var42;
        var3.field1830 = var31;
        var4.field1830 = var34;
        var5.field1830 = var37;
        var6.field1830 = var35;
        var7.field1830 = var40;
        var8.field1830 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1574[var72] = (short) var2.method2103();
            if (var12 == 1) {
                this.field1582[var72] = var3.method2102();
            }
            if (var13 == 255) {
                this.field1614[var72] = var4.method2102();
            }
            if (var14 == 1) {
                this.field1616[var72] = var5.method2102();
            }
            if (var15 == 1) {
                this.field1576[var72] = var6.method2101();
            }
            if (var16 == 1) {
                this.field1587[var72] = (short) (var7.method2103() - 1);
            }
            if (this.field1585 != null && this.field1587[var72] != -1) {
                this.field1585[var72] = (byte) (var8.method2101() - 1);
            }
        }
        var2.field1830 = var33;
        var3.field1830 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2101();
            if (var78 == 1) {
                var73 = var2.method2213() + var76;
                var74 = var2.method2213() + var73;
                var75 = var2.method2213() + var74;
                var76 = var75;
                this.field1579[var77] = var73;
                this.field1615[var77] = var74;
                this.field1581[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2213() + var76;
                var76 = var75;
                this.field1579[var77] = var73;
                this.field1615[var77] = var74;
                this.field1581[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2213() + var76;
                var76 = var75;
                this.field1579[var77] = var73;
                this.field1615[var77] = var74;
                this.field1581[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2213() + var76;
                var76 = var75;
                this.field1579[var77] = var73;
                this.field1615[var77] = var81;
                this.field1581[var77] = var75;
            }
        }
        var2.field1830 = var50;
        var3.field1830 = var52;
        var4.field1830 = var54;
        var5.field1830 = var56;
        var6.field1830 = var58;
        var7.field1830 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1583[var82] & 0xFF;
            if (var83 == 0) {
                this.field1590[var82] = (short) var2.method2103();
                this.field1592[var82] = (short) var2.method2103();
                this.field1602[var82] = (short) var2.method2103();
            }
            if (var83 == 1) {
                this.field1590[var82] = (short) var3.method2103();
                this.field1592[var82] = (short) var3.method2103();
                this.field1602[var82] = (short) var3.method2103();
                this.field1594[var82] = (short) var4.method2103();
                this.field1595[var82] = (short) var4.method2103();
                this.field1586[var82] = (short) var4.method2103();
                this.field1597[var82] = (short) var5.method2103();
                this.field1600[var82] = var6.method2102();
                this.field1598[var82] = (short) var7.method2103();
            }
            if (var83 == 2) {
                this.field1590[var82] = (short) var3.method2103();
                this.field1592[var82] = (short) var3.method2103();
                this.field1602[var82] = (short) var3.method2103();
                this.field1594[var82] = (short) var4.method2103();
                this.field1595[var82] = (short) var4.method2103();
                this.field1586[var82] = (short) var4.method2103();
                this.field1597[var82] = (short) var5.method2103();
                this.field1600[var82] = var6.method2102();
                this.field1598[var82] = (short) var7.method2103();
                this.field1593[var82] = (short) var7.method2103();
            }
            if (var83 == 3) {
                this.field1590[var82] = (short) var3.method2103();
                this.field1592[var82] = (short) var3.method2103();
                this.field1602[var82] = (short) var3.method2103();
                this.field1594[var82] = (short) var4.method2103();
                this.field1595[var82] = (short) var4.method2103();
                this.field1586[var82] = (short) var4.method2103();
                this.field1597[var82] = (short) var5.method2103();
                this.field1600[var82] = var6.method2102();
                this.field1598[var82] = (short) var7.method2103();
            }
        }
        var2.field1830 = var62;
        int var84 = var2.method2101();
        if (var84 == 0) {
            return;
        }
        new class83();
        var2.method2103();
        var2.method2103();
        var2.method2103();
        var2.method2106();
    }

    @ObfuscatedName("ca.e([B)V")
    public void method1852(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class107 var4 = new class107(arg0);
        class107 var5 = new class107(arg0);
        class107 var6 = new class107(arg0);
        class107 var7 = new class107(arg0);
        class107 var8 = new class107(arg0);
        var4.field1830 = arg0.length - 18;
        int var9 = var4.method2103();
        int var10 = var4.method2103();
        int var11 = var4.method2101();
        int var12 = var4.method2101();
        int var13 = var4.method2101();
        int var14 = var4.method2101();
        int var15 = var4.method2101();
        int var16 = var4.method2101();
        int var17 = var4.method2103();
        int var18 = var4.method2103();
        int var19 = var4.method2103();
        int var20 = var4.method2103();
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
        this.field1580 = var9;
        this.field1578 = var10;
        this.field1589 = var11;
        this.field1575 = new int[var9];
        this.field1607 = new int[var9];
        this.field1577 = new int[var9];
        this.field1579 = new int[var10];
        this.field1615 = new int[var10];
        this.field1581 = new int[var10];
        if (var11 > 0) {
            this.field1583 = new byte[var11];
            this.field1590 = new short[var11];
            this.field1592 = new short[var11];
            this.field1602 = new short[var11];
        }
        if (var16 == 1) {
            this.field1601 = new int[var9];
        }
        if (var12 == 1) {
            this.field1582 = new byte[var10];
            this.field1585 = new byte[var10];
            this.field1587 = new short[var10];
        }
        if (var13 == 255) {
            this.field1614 = new byte[var10];
        } else {
            this.field1620 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1616 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1576 = new int[var10];
        }
        this.field1574 = new short[var10];
        var4.field1830 = var21;
        var5.field1830 = var36;
        var6.field1830 = var38;
        var7.field1830 = var40;
        var8.field1830 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2101();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2213();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2213();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2213();
            }
            this.field1575[var46] = var43 + var48;
            this.field1607[var46] = var44 + var49;
            this.field1577[var46] = var45 + var50;
            var43 = this.field1575[var46];
            var44 = this.field1607[var46];
            var45 = this.field1577[var46];
            if (var16 == 1) {
                this.field1601[var46] = var8.method2101();
            }
        }
        var4.field1830 = var32;
        var5.field1830 = var28;
        var6.field1830 = var26;
        var7.field1830 = var30;
        var8.field1830 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1574[var51] = (short) var4.method2103();
            if (var12 == 1) {
                int var52 = var5.method2101();
                if ((var52 & 0x1) == 1) {
                    this.field1582[var51] = 1;
                    var2 = true;
                } else {
                    this.field1582[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1585[var51] = (byte) (var52 >> 2);
                    this.field1587[var51] = this.field1574[var51];
                    this.field1574[var51] = 127;
                    if (this.field1587[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1585[var51] = -1;
                    this.field1587[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1614[var51] = var6.method2102();
            }
            if (var14 == 1) {
                this.field1616[var51] = var7.method2102();
            }
            if (var15 == 1) {
                this.field1576[var51] = var8.method2101();
            }
        }
        var4.field1830 = var25;
        var5.field1830 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2101();
            if (var58 == 1) {
                var53 = var4.method2213() + var56;
                var54 = var4.method2213() + var53;
                var55 = var4.method2213() + var54;
                var56 = var55;
                this.field1579[var57] = var53;
                this.field1615[var57] = var54;
                this.field1581[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2213() + var56;
                var56 = var55;
                this.field1579[var57] = var53;
                this.field1615[var57] = var54;
                this.field1581[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2213() + var56;
                var56 = var55;
                this.field1579[var57] = var53;
                this.field1615[var57] = var54;
                this.field1581[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2213() + var56;
                var56 = var55;
                this.field1579[var57] = var53;
                this.field1615[var57] = var61;
                this.field1581[var57] = var55;
            }
        }
        var4.field1830 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1583[var62] = 0;
            this.field1590[var62] = (short) var4.method2103();
            this.field1592[var62] = (short) var4.method2103();
            this.field1602[var62] = (short) var4.method2103();
        }
        if (this.field1585 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1585[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1590[var65] & 0xFFFF) == this.field1579[var64] && (this.field1592[var65] & 0xFFFF) == this.field1615[var64] && (this.field1602[var65] & 0xFFFF) == this.field1581[var64]) {
                        this.field1585[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1585 = null;
            }
        }
        if (!var3) {
            this.field1587 = null;
        }
        if (!var2) {
            this.field1582 = null;
        }
    }

    public class93(class93[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1580 = 0;
        this.field1578 = 0;
        this.field1589 = 0;
        this.field1620 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class93 var10 = arg0[var9];
            if (var10 != null) {
                this.field1580 += var10.field1580;
                this.field1578 += var10.field1578;
                this.field1589 += var10.field1589;
                if (var10.field1614 == null) {
                    if (this.field1620 == -1) {
                        this.field1620 = var10.field1620;
                    }
                    if (this.field1620 != var10.field1620) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1582 != null;
                var5 |= var10.field1616 != null;
                var6 |= var10.field1576 != null;
                var7 |= var10.field1587 != null;
                var8 |= var10.field1585 != null;
            }
        }
        this.field1575 = new int[this.field1580];
        this.field1607 = new int[this.field1580];
        this.field1577 = new int[this.field1580];
        this.field1601 = new int[this.field1580];
        this.field1579 = new int[this.field1578];
        this.field1615 = new int[this.field1578];
        this.field1581 = new int[this.field1578];
        if (var3) {
            this.field1582 = new byte[this.field1578];
        }
        if (var4) {
            this.field1614 = new byte[this.field1578];
        }
        if (var5) {
            this.field1616 = new byte[this.field1578];
        }
        if (var6) {
            this.field1576 = new int[this.field1578];
        }
        if (var7) {
            this.field1587 = new short[this.field1578];
        }
        if (var8) {
            this.field1585 = new byte[this.field1578];
        }
        this.field1574 = new short[this.field1578];
        if (this.field1589 > 0) {
            this.field1583 = new byte[this.field1589];
            this.field1590 = new short[this.field1589];
            this.field1592 = new short[this.field1589];
            this.field1602 = new short[this.field1589];
            this.field1594 = new short[this.field1589];
            this.field1595 = new short[this.field1589];
            this.field1586 = new short[this.field1589];
            this.field1597 = new short[this.field1589];
            this.field1600 = new byte[this.field1589];
            this.field1598 = new short[this.field1589];
            this.field1593 = new short[this.field1589];
        }
        this.field1580 = 0;
        this.field1578 = 0;
        this.field1589 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class93 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1578; var13++) {
                    if (var3 && var12.field1582 != null) {
                        this.field1582[this.field1578] = var12.field1582[var13];
                    }
                    if (var4) {
                        if (var12.field1614 == null) {
                            this.field1614[this.field1578] = var12.field1620;
                        } else {
                            this.field1614[this.field1578] = var12.field1614[var13];
                        }
                    }
                    if (var5 && var12.field1616 != null) {
                        this.field1616[this.field1578] = var12.field1616[var13];
                    }
                    if (var6 && var12.field1576 != null) {
                        this.field1576[this.field1578] = var12.field1576[var13];
                    }
                    if (var7) {
                        if (var12.field1587 == null) {
                            this.field1587[this.field1578] = -1;
                        } else {
                            this.field1587[this.field1578] = var12.field1587[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1585 == null || var12.field1585[var13] == -1) {
                            this.field1585[this.field1578] = -1;
                        } else {
                            this.field1585[this.field1578] = (byte) (var12.field1585[var13] + this.field1589);
                        }
                    }
                    this.field1574[this.field1578] = var12.field1574[var13];
                    this.field1579[this.field1578] = this.method1884(var12, var12.field1579[var13]);
                    this.field1615[this.field1578] = this.method1884(var12, var12.field1615[var13]);
                    this.field1581[this.field1578] = this.method1884(var12, var12.field1581[var13]);
                    this.field1578++;
                }
                for (int var14 = 0; var14 < var12.field1589; var14++) {
                    byte var15 = this.field1583[this.field1589] = var12.field1583[var14];
                    if (var15 == 0) {
                        this.field1590[this.field1589] = (short) this.method1884(var12, var12.field1590[var14]);
                        this.field1592[this.field1589] = (short) this.method1884(var12, var12.field1592[var14]);
                        this.field1602[this.field1589] = (short) this.method1884(var12, var12.field1602[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1590[this.field1589] = var12.field1590[var14];
                        this.field1592[this.field1589] = var12.field1592[var14];
                        this.field1602[this.field1589] = var12.field1602[var14];
                        this.field1594[this.field1589] = var12.field1594[var14];
                        this.field1595[this.field1589] = var12.field1595[var14];
                        this.field1586[this.field1589] = var12.field1586[var14];
                        this.field1597[this.field1589] = var12.field1597[var14];
                        this.field1600[this.field1589] = var12.field1600[var14];
                        this.field1598[this.field1589] = var12.field1598[var14];
                    }
                    if (var15 == 2) {
                        this.field1593[this.field1589] = var12.field1593[var14];
                    }
                    this.field1589++;
                }
            }
        }
    }

    @ObfuscatedName("ca.n(Lca;I)I")
    public final int method1884(class93 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1575[arg1];
        int var5 = arg0.field1607[arg1];
        int var6 = arg0.field1577[arg1];
        for (int var7 = 0; var7 < this.field1580; var7++) {
            if (this.field1575[var7] == var4 && this.field1607[var7] == var5 && this.field1577[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1575[this.field1580] = var4;
            this.field1607[this.field1580] = var5;
            this.field1577[this.field1580] = var6;
            if (arg0.field1601 != null) {
                this.field1601[this.field1580] = arg0.field1601[arg1];
            }
            var3 = this.field1580++;
        }
        return var3;
    }

    public class93(class93 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1580 = arg0.field1580;
        this.field1578 = arg0.field1578;
        this.field1589 = arg0.field1589;
        if (arg1) {
            this.field1575 = arg0.field1575;
            this.field1607 = arg0.field1607;
            this.field1577 = arg0.field1577;
        } else {
            this.field1575 = new int[this.field1580];
            this.field1607 = new int[this.field1580];
            this.field1577 = new int[this.field1580];
            for (int var6 = 0; var6 < this.field1580; var6++) {
                this.field1575[var6] = arg0.field1575[var6];
                this.field1607[var6] = arg0.field1607[var6];
                this.field1577[var6] = arg0.field1577[var6];
            }
        }
        if (arg2) {
            this.field1574 = arg0.field1574;
        } else {
            this.field1574 = new short[this.field1578];
            for (int var7 = 0; var7 < this.field1578; var7++) {
                this.field1574[var7] = arg0.field1574[var7];
            }
        }
        if (arg3 || arg0.field1587 == null) {
            this.field1587 = arg0.field1587;
        } else {
            this.field1587 = new short[this.field1578];
            for (int var8 = 0; var8 < this.field1578; var8++) {
                this.field1587[var8] = arg0.field1587[var8];
            }
        }
        if (arg4) {
            this.field1616 = arg0.field1616;
        } else {
            this.field1616 = new byte[this.field1578];
            if (arg0.field1616 == null) {
                for (int var9 = 0; var9 < this.field1578; var9++) {
                    this.field1616[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1578; var10++) {
                    this.field1616[var10] = arg0.field1616[var10];
                }
            }
        }
        this.field1579 = arg0.field1579;
        this.field1615 = arg0.field1615;
        this.field1581 = arg0.field1581;
        this.field1582 = arg0.field1582;
        this.field1614 = arg0.field1614;
        this.field1585 = arg0.field1585;
        this.field1620 = arg0.field1620;
        this.field1583 = arg0.field1583;
        this.field1590 = arg0.field1590;
        this.field1592 = arg0.field1592;
        this.field1602 = arg0.field1602;
        this.field1594 = arg0.field1594;
        this.field1595 = arg0.field1595;
        this.field1586 = arg0.field1586;
        this.field1597 = arg0.field1597;
        this.field1600 = arg0.field1600;
        this.field1598 = arg0.field1598;
        this.field1593 = arg0.field1593;
        this.field1601 = arg0.field1601;
        this.field1576 = arg0.field1576;
        this.field1603 = arg0.field1603;
        this.field1604 = arg0.field1604;
        this.field1606 = arg0.field1606;
        this.field1605 = arg0.field1605;
        this.field1599 = arg0.field1599;
        this.field1588 = arg0.field1588;
        this.field1609 = arg0.field1609;
    }

    @ObfuscatedName("ca.v()Lca;")
    public class93 method1856() {
        class93 var1 = new class93();
        if (this.field1582 != null) {
            var1.field1582 = new byte[this.field1578];
            for (int var2 = 0; var2 < this.field1578; var2++) {
                var1.field1582[var2] = this.field1582[var2];
            }
        }
        var1.field1580 = this.field1580;
        var1.field1578 = this.field1578;
        var1.field1589 = this.field1589;
        var1.field1575 = this.field1575;
        var1.field1607 = this.field1607;
        var1.field1577 = this.field1577;
        var1.field1579 = this.field1579;
        var1.field1615 = this.field1615;
        var1.field1581 = this.field1581;
        var1.field1614 = this.field1614;
        var1.field1616 = this.field1616;
        var1.field1585 = this.field1585;
        var1.field1574 = this.field1574;
        var1.field1587 = this.field1587;
        var1.field1620 = this.field1620;
        var1.field1583 = this.field1583;
        var1.field1590 = this.field1590;
        var1.field1592 = this.field1592;
        var1.field1602 = this.field1602;
        var1.field1594 = this.field1594;
        var1.field1595 = this.field1595;
        var1.field1586 = this.field1586;
        var1.field1597 = this.field1597;
        var1.field1600 = this.field1600;
        var1.field1598 = this.field1598;
        var1.field1593 = this.field1593;
        var1.field1601 = this.field1601;
        var1.field1576 = this.field1576;
        var1.field1603 = this.field1603;
        var1.field1604 = this.field1604;
        var1.field1606 = this.field1606;
        var1.field1605 = this.field1605;
        var1.field1588 = this.field1588;
        var1.field1609 = this.field1609;
        return var1;
    }

    @ObfuscatedName("ca.z([[IIIIZI)Lca;")
    public class93 method1853(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1870();
        int var7 = this.field1612 + arg1;
        int var8 = this.field1613 + arg1;
        int var9 = this.field1596 + arg3;
        int var10 = this.field1584 + arg3;
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
        class93 var15;
        if (arg4) {
            var15 = new class93();
            var15.field1580 = this.field1580;
            var15.field1578 = this.field1578;
            var15.field1589 = this.field1589;
            var15.field1575 = this.field1575;
            var15.field1577 = this.field1577;
            var15.field1579 = this.field1579;
            var15.field1615 = this.field1615;
            var15.field1581 = this.field1581;
            var15.field1582 = this.field1582;
            var15.field1614 = this.field1614;
            var15.field1616 = this.field1616;
            var15.field1585 = this.field1585;
            var15.field1574 = this.field1574;
            var15.field1587 = this.field1587;
            var15.field1620 = this.field1620;
            var15.field1583 = this.field1583;
            var15.field1590 = this.field1590;
            var15.field1592 = this.field1592;
            var15.field1602 = this.field1602;
            var15.field1594 = this.field1594;
            var15.field1595 = this.field1595;
            var15.field1586 = this.field1586;
            var15.field1597 = this.field1597;
            var15.field1600 = this.field1600;
            var15.field1598 = this.field1598;
            var15.field1593 = this.field1593;
            var15.field1601 = this.field1601;
            var15.field1576 = this.field1576;
            var15.field1603 = this.field1603;
            var15.field1604 = this.field1604;
            var15.field1588 = this.field1588;
            var15.field1609 = this.field1609;
            var15.field1607 = new int[var15.field1580];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1580; var16++) {
                int var17 = this.field1575[var16] + arg1;
                int var18 = this.field1577[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1607[var16] = this.field1607[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1580; var26++) {
                int var27 = (-this.field1607[var26] << 16) / this.field1341;
                if (var27 < arg5) {
                    int var28 = this.field1575[var26] + arg1;
                    int var29 = this.field1577[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1607[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1607[var26];
                }
            }
        }
        var15.method1854();
        return var15;
    }

    @ObfuscatedName("ca.j()V")
    public void method1858() {
        int var10002;
        if (this.field1601 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1580; var3++) {
                int var4 = this.field1601[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1603 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1603[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1580) {
                int var7 = this.field1601[var6];
                this.field1603[var7][var1[var7]++] = var6++;
            }
            this.field1601 = null;
        }
        if (this.field1576 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1578; var10++) {
            int var11 = this.field1576[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1604 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1604[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1578) {
            int var14 = this.field1576[var13];
            this.field1604[var14][var8[var14]++] = var13++;
        }
        this.field1576 = null;
    }

    @ObfuscatedName("ca.u()V")
    public void method1859() {
        for (int var1 = 0; var1 < this.field1580; var1++) {
            int var2 = this.field1575[var1];
            this.field1575[var1] = this.field1577[var1];
            this.field1577[var1] = -var2;
        }
        this.method1854();
    }

    @ObfuscatedName("ca.g()V")
    public void method1918() {
        for (int var1 = 0; var1 < this.field1580; var1++) {
            this.field1575[var1] = -this.field1575[var1];
            this.field1577[var1] = -this.field1577[var1];
        }
        this.method1854();
    }

    @ObfuscatedName("ca.a()V")
    public void method1861() {
        for (int var1 = 0; var1 < this.field1580; var1++) {
            int var2 = this.field1577[var1];
            this.field1577[var1] = this.field1575[var1];
            this.field1575[var1] = -var2;
        }
        this.method1854();
    }

    @ObfuscatedName("ca.c(I)V")
    public void method1889(int arg0) {
        int var2 = field1619[arg0];
        int var3 = field1591[arg0];
        for (int var4 = 0; var4 < this.field1580; var4++) {
            int var5 = this.field1577[var4] * var2 + this.field1575[var4] * var3 >> 16;
            this.field1577[var4] = this.field1577[var4] * var3 - this.field1575[var4] * var2 >> 16;
            this.field1575[var4] = var5;
        }
        this.method1854();
    }

    @ObfuscatedName("ca.w(III)V")
    public void method1863(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1580; var4++) {
            this.field1575[var4] += arg0;
            this.field1607[var4] += arg1;
            this.field1577[var4] += arg2;
        }
        this.method1854();
    }

    @ObfuscatedName("ca.l(SS)V")
    public void method1864(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1578; var3++) {
            if (this.field1574[var3] == arg0) {
                this.field1574[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ca.q(SS)V")
    public void method1865(short arg0, short arg1) {
        if (this.field1587 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1578; var3++) {
            if (this.field1587[var3] == arg0) {
                this.field1587[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ca.x()V")
    public void method1866() {
        for (int var1 = 0; var1 < this.field1580; var1++) {
            this.field1577[var1] = -this.field1577[var1];
        }
        for (int var2 = 0; var2 < this.field1578; var2++) {
            int var3 = this.field1579[var2];
            this.field1579[var2] = this.field1581[var2];
            this.field1581[var2] = var3;
        }
        this.method1854();
    }

    @ObfuscatedName("ca.p(III)V")
    public void method1867(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1580; var4++) {
            this.field1575[var4] = this.field1575[var4] * arg0 / 128;
            this.field1607[var4] = this.field1607[var4] * arg1 / 128;
            this.field1577[var4] = this.field1577[var4] * arg2 / 128;
        }
        this.method1854();
    }

    @ObfuscatedName("ca.y()V")
    public void method1868() {
        if (this.field1606 != null) {
            return;
        }
        this.field1606 = new class89[this.field1580];
        for (int var1 = 0; var1 < this.field1580; var1++) {
            this.field1606[var1] = new class89();
        }
        for (int var2 = 0; var2 < this.field1578; var2++) {
            int var3 = this.field1579[var2];
            int var4 = this.field1615[var2];
            int var5 = this.field1581[var2];
            int var6 = this.field1575[var4] - this.field1575[var3];
            int var7 = this.field1607[var4] - this.field1607[var3];
            int var8 = this.field1577[var4] - this.field1577[var3];
            int var9 = this.field1575[var5] - this.field1575[var3];
            int var10 = this.field1607[var5] - this.field1607[var3];
            int var11 = this.field1577[var5] - this.field1577[var3];
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
            if (this.field1582 == null) {
                var19 = 0;
            } else {
                var19 = this.field1582[var2];
            }
            if (var19 == 0) {
                class89 var20 = this.field1606[var3];
                var20.field1519 += var16;
                var20.field1520 += var17;
                var20.field1522 += var18;
                var20.field1521++;
                class89 var21 = this.field1606[var4];
                var21.field1519 += var16;
                var21.field1520 += var17;
                var21.field1522 += var18;
                var21.field1521++;
                class89 var22 = this.field1606[var5];
                var22.field1519 += var16;
                var22.field1520 += var17;
                var22.field1522 += var18;
                var22.field1521++;
            } else if (var19 == 1) {
                if (this.field1605 == null) {
                    this.field1605 = new class77[this.field1578];
                }
                class77 var23 = this.field1605[var2] = new class77();
                var23.field1336 = var16;
                var23.field1331 = var17;
                var23.field1332 = var18;
            }
        }
    }

    @ObfuscatedName("ca.r()V")
    public void method1854() {
        this.field1606 = null;
        this.field1599 = null;
        this.field1605 = null;
        this.field1610 = false;
    }

    @ObfuscatedName("ca.k()V")
    public void method1870() {
        if (this.field1610) {
            return;
        }
        this.field1341 = 0;
        this.field1611 = 0;
        this.field1612 = 999999;
        this.field1613 = -999999;
        this.field1584 = -99999;
        this.field1596 = 99999;
        for (int var1 = 0; var1 < this.field1580; var1++) {
            int var2 = this.field1575[var1];
            int var3 = this.field1607[var1];
            int var4 = this.field1577[var1];
            if (var2 < this.field1612) {
                this.field1612 = var2;
            }
            if (var2 > this.field1613) {
                this.field1613 = var2;
            }
            if (var4 < this.field1596) {
                this.field1596 = var4;
            }
            if (var4 > this.field1584) {
                this.field1584 = var4;
            }
            if (-var3 > this.field1341) {
                this.field1341 = -var3;
            }
            if (var3 > this.field1611) {
                this.field1611 = var3;
            }
        }
        this.field1610 = true;
    }

    @ObfuscatedName("ca.b(Lca;Lca;IIIZ)V")
    public static void method1869(class93 arg0, class93 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1870();
        arg0.method1868();
        arg1.method1870();
        arg1.method1868();
        field1618++;
        int var6 = 0;
        int[] var7 = arg1.field1575;
        int var8 = arg1.field1580;
        for (int var9 = 0; var9 < arg0.field1580; var9++) {
            class89 var10 = arg0.field1606[var9];
            if (var10.field1521 != 0) {
                int var11 = arg0.field1607[var9] - arg3;
                if (var11 <= arg1.field1611) {
                    int var12 = arg0.field1575[var9] - arg2;
                    if (var12 >= arg1.field1612 && var12 <= arg1.field1613) {
                        int var13 = arg0.field1577[var9] - arg4;
                        if (var13 >= arg1.field1596 && var13 <= arg1.field1584) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class89 var15 = arg1.field1606[var14];
                                if (var7[var14] == var12 && arg1.field1577[var14] == var13 && arg1.field1607[var14] == var11 && var15.field1521 != 0) {
                                    if (arg0.field1599 == null) {
                                        arg0.field1599 = new class89[arg0.field1580];
                                    }
                                    if (arg1.field1599 == null) {
                                        arg1.field1599 = new class89[var8];
                                    }
                                    class89 var16 = arg0.field1599[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1599[var9] = new class89(var10);
                                    }
                                    class89 var17 = arg1.field1599[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1599[var14] = new class89(var15);
                                    }
                                    var16.field1519 += var15.field1519;
                                    var16.field1520 += var15.field1520;
                                    var16.field1522 += var15.field1522;
                                    var16.field1521 += var15.field1521;
                                    var17.field1519 += var10.field1519;
                                    var17.field1520 += var10.field1520;
                                    var17.field1522 += var10.field1522;
                                    var17.field1521 += var10.field1521;
                                    var6++;
                                    field1608[var9] = field1618;
                                    field1617[var14] = field1618;
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
        for (int var18 = 0; var18 < arg0.field1578; var18++) {
            if (field1608[arg0.field1579[var18]] == field1618 && field1608[arg0.field1615[var18]] == field1618 && field1608[arg0.field1581[var18]] == field1618) {
                if (arg0.field1582 == null) {
                    arg0.field1582 = new byte[arg0.field1578];
                }
                arg0.field1582[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1578; var19++) {
            if (field1617[arg1.field1579[var19]] == field1618 && field1617[arg1.field1615[var19]] == field1618 && field1617[arg1.field1581[var19]] == field1618) {
                if (arg1.field1582 == null) {
                    arg1.field1582 = new byte[arg1.field1578];
                }
                arg1.field1582[var19] = 2;
            }
        }
    }

    @ObfuscatedName("ca.h(IIIII)Lcc;")
    public final class98 method1871(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1868();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class98 var8 = new class98();
        var8.field1696 = new int[this.field1578];
        var8.field1697 = new int[this.field1578];
        var8.field1698 = new int[this.field1578];
        if (this.field1589 > 0 && this.field1585 != null) {
            int[] var9 = new int[this.field1589];
            for (int var10 = 0; var10 < this.field1578; var10++) {
                if (this.field1585[var10] != -1) {
                    var9[this.field1585[var10] & 0xFF]++;
                }
            }
            var8.field1707 = 0;
            for (int var11 = 0; var11 < this.field1589; var11++) {
                if (var9[var11] > 0 && this.field1583[var11] == 0) {
                    var8.field1707++;
                }
            }
            var8.field1705 = new int[var8.field1707];
            var8.field1706 = new int[var8.field1707];
            var8.field1748 = new int[var8.field1707];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1589; var13++) {
                if (var9[var13] > 0 && this.field1583[var13] == 0) {
                    var8.field1705[var12] = this.field1590[var13] & 0xFFFF;
                    var8.field1706[var12] = this.field1592[var13] & 0xFFFF;
                    var8.field1748[var12] = this.field1602[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1701 = new byte[this.field1578];
            for (int var14 = 0; var14 < this.field1578; var14++) {
                if (this.field1585[var14] == -1) {
                    var8.field1701[var14] = -1;
                } else {
                    var8.field1701[var14] = (byte) var9[this.field1585[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1578; var15++) {
            byte var16;
            if (this.field1582 == null) {
                var16 = 0;
            } else {
                var16 = this.field1582[var15];
            }
            byte var17;
            if (this.field1616 == null) {
                var17 = 0;
            } else {
                var17 = this.field1616[var15];
            }
            short var18;
            if (this.field1587 == null) {
                var18 = -1;
            } else {
                var18 = this.field1587[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1574[var15] & 0xFFFF;
                    class89 var20;
                    if (this.field1599 == null || this.field1599[this.field1579[var15]] == null) {
                        var20 = this.field1606[this.field1579[var15]];
                    } else {
                        var20 = this.field1599[this.field1579[var15]];
                    }
                    int var21 = (var20.field1522 * arg4 + var20.field1520 * arg3 + var20.field1519 * arg2) / (var20.field1521 * var7) + arg0;
                    var8.field1696[var15] = method1849(var19, var21);
                    class89 var22;
                    if (this.field1599 == null || this.field1599[this.field1615[var15]] == null) {
                        var22 = this.field1606[this.field1615[var15]];
                    } else {
                        var22 = this.field1599[this.field1615[var15]];
                    }
                    int var23 = (var22.field1522 * arg4 + var22.field1520 * arg3 + var22.field1519 * arg2) / (var22.field1521 * var7) + arg0;
                    var8.field1697[var15] = method1849(var19, var23);
                    class89 var24;
                    if (this.field1599 == null || this.field1599[this.field1581[var15]] == null) {
                        var24 = this.field1606[this.field1581[var15]];
                    } else {
                        var24 = this.field1599[this.field1581[var15]];
                    }
                    int var25 = (var24.field1522 * arg4 + var24.field1520 * arg3 + var24.field1519 * arg2) / (var24.field1521 * var7) + arg0;
                    var8.field1698[var15] = method1849(var19, var25);
                } else if (var16 == 1) {
                    class77 var26 = this.field1605[var15];
                    int var27 = (var26.field1332 * arg4 + var26.field1336 * arg2 + var26.field1331 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1696[var15] = method1849(this.field1574[var15] & 0xFFFF, var27);
                    var8.field1698[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1696[var15] = 128;
                    var8.field1698[var15] = -1;
                } else {
                    var8.field1698[var15] = -2;
                }
            } else if (var16 == 0) {
                class89 var28;
                if (this.field1599 == null || this.field1599[this.field1579[var15]] == null) {
                    var28 = this.field1606[this.field1579[var15]];
                } else {
                    var28 = this.field1599[this.field1579[var15]];
                }
                int var29 = (var28.field1522 * arg4 + var28.field1520 * arg3 + var28.field1519 * arg2) / (var28.field1521 * var7) + arg0;
                var8.field1696[var15] = method1873(var29);
                class89 var30;
                if (this.field1599 == null || this.field1599[this.field1615[var15]] == null) {
                    var30 = this.field1606[this.field1615[var15]];
                } else {
                    var30 = this.field1599[this.field1615[var15]];
                }
                int var31 = (var30.field1522 * arg4 + var30.field1520 * arg3 + var30.field1519 * arg2) / (var30.field1521 * var7) + arg0;
                var8.field1697[var15] = method1873(var31);
                class89 var32;
                if (this.field1599 == null || this.field1599[this.field1581[var15]] == null) {
                    var32 = this.field1606[this.field1581[var15]];
                } else {
                    var32 = this.field1599[this.field1581[var15]];
                }
                int var33 = (var32.field1522 * arg4 + var32.field1520 * arg3 + var32.field1519 * arg2) / (var32.field1521 * var7) + arg0;
                var8.field1698[var15] = method1873(var33);
            } else if (var16 == 1) {
                class77 var34 = this.field1605[var15];
                int var35 = (var34.field1332 * arg4 + var34.field1336 * arg2 + var34.field1331 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1696[var15] = method1873(var35);
                var8.field1698[var15] = -1;
            } else {
                var8.field1698[var15] = -2;
            }
        }
        this.method1858();
        var8.field1688 = this.field1580;
        var8.field1747 = this.field1575;
        var8.field1690 = this.field1607;
        var8.field1749 = this.field1577;
        var8.field1704 = this.field1578;
        var8.field1693 = this.field1579;
        var8.field1713 = this.field1615;
        var8.field1695 = this.field1581;
        var8.field1699 = this.field1614;
        var8.field1700 = this.field1616;
        var8.field1703 = this.field1620;
        var8.field1715 = this.field1603;
        var8.field1691 = this.field1604;
        var8.field1689 = this.field1587;
        return var8;
    }

    @ObfuscatedName("ca.i(II)I")
    public static final int method1849(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ca.aw(I)I")
    public static final int method1873(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
