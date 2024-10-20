package deob;

@ObfuscatedName("cg")
public class class95 extends class80 {

    @ObfuscatedName("cg.t")
    public int field1605 = 0;

    @ObfuscatedName("cg.b")
    public int[] field1617;

    @ObfuscatedName("cg.p")
    public int[] field1610;

    @ObfuscatedName("cg.e")
    public int[] field1606;

    @ObfuscatedName("cg.i")
    public int field1611 = 0;

    @ObfuscatedName("cg.o")
    public int[] field1608;

    @ObfuscatedName("cg.f")
    public int[] field1609;

    @ObfuscatedName("cg.d")
    public int[] field1627;

    @ObfuscatedName("cg.j")
    public byte[] field1644;

    @ObfuscatedName("cg.x")
    public byte[] field1612;

    @ObfuscatedName("cg.v")
    public byte[] field1613;

    @ObfuscatedName("cg.a")
    public byte[] field1614;

    @ObfuscatedName("cg.l")
    public short[] field1642;

    @ObfuscatedName("cg.h")
    public short[] field1616;

    @ObfuscatedName("cg.c")
    public byte field1624 = 0;

    @ObfuscatedName("cg.u")
    public int field1618;

    @ObfuscatedName("cg.r")
    public byte[] field1619;

    @ObfuscatedName("cg.k")
    public short[] field1620;

    @ObfuscatedName("cg.w")
    public short[] field1621;

    @ObfuscatedName("cg.q")
    public short[] field1631;

    @ObfuscatedName("cg.g")
    public short[] field1615;

    @ObfuscatedName("cg.z")
    public short[] field1626;

    @ObfuscatedName("cg.m")
    public short[] field1625;

    @ObfuscatedName("cg.y")
    public short[] field1637;

    @ObfuscatedName("cg.n")
    public short[] field1607;

    @ObfuscatedName("cg.s")
    public short[] field1628;

    @ObfuscatedName("cg.ac")
    public byte[] field1629;

    @ObfuscatedName("cg.au")
    public int[] field1630;

    @ObfuscatedName("cg.ap")
    public int[] field1622;

    @ObfuscatedName("cg.ah")
    public int[][] field1632;

    @ObfuscatedName("cg.ae")
    public int[][] field1633;

    @ObfuscatedName("cg.ag")
    public class79[] field1634;

    @ObfuscatedName("cg.as")
    public class91[] field1641;

    @ObfuscatedName("cg.at")
    public class91[] field1636;

    @ObfuscatedName("cg.aw")
    public short field1645;

    @ObfuscatedName("cg.ay")
    public short field1638;

    @ObfuscatedName("cg.ao")
    public boolean field1639 = false;

    @ObfuscatedName("cg.al")
    public int field1640;

    @ObfuscatedName("cg.ab")
    public int field1603;

    @ObfuscatedName("cg.aj")
    public int field1604;

    @ObfuscatedName("cg.ak")
    public int field1643;

    @ObfuscatedName("cg.ar")
    public int field1623;

    @ObfuscatedName("cg.ai")
    public static int[] field1635 = new int[10000];

    @ObfuscatedName("cg.ax")
    public static int[] field1646 = new int[10000];

    @ObfuscatedName("cg.az")
    public static int field1647 = 0;

    @ObfuscatedName("cg.aq")
    public static int[] field1648 = class86.field1504;

    @ObfuscatedName("cg.ad")
    public static int[] field1649 = class86.field1491;

    public class95() {
    }

    @ObfuscatedName("cg.t(Lfj;II)Lcg;")
    public static class95 method1964(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2881(arg1, arg2);
        return var3 == null ? null : new class95(var3);
    }

    public class95(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1975(arg0);
        } else {
            this.method1932(arg0);
        }
    }

    @ObfuscatedName("cg.p([B)V")
    public void method1975(byte[] arg0) {
        class111 var2 = new class111(arg0);
        class111 var3 = new class111(arg0);
        class111 var4 = new class111(arg0);
        class111 var5 = new class111(arg0);
        class111 var6 = new class111(arg0);
        class111 var7 = new class111(arg0);
        class111 var8 = new class111(arg0);
        var2.field1867 = arg0.length - 23;
        int var9 = var2.method2255();
        int var10 = var2.method2255();
        int var11 = var2.method2172();
        int var12 = var2.method2172();
        int var13 = var2.method2172();
        int var14 = var2.method2172();
        int var15 = var2.method2172();
        int var16 = var2.method2172();
        int var17 = var2.method2172();
        int var18 = var2.method2255();
        int var19 = var2.method2255();
        int var20 = var2.method2255();
        int var21 = var2.method2255();
        int var22 = var2.method2255();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1619 = new byte[var11];
            var2.field1867 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1619[var26] = var2.method2358();
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
        this.field1605 = var9;
        this.field1611 = var10;
        this.field1618 = var11;
        this.field1617 = new int[var9];
        this.field1610 = new int[var9];
        this.field1606 = new int[var9];
        this.field1608 = new int[var10];
        this.field1609 = new int[var10];
        this.field1627 = new int[var10];
        if (var17 == 1) {
            this.field1630 = new int[var9];
        }
        if (var12 == 1) {
            this.field1644 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1612 = new byte[var10];
        } else {
            this.field1624 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1613 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1622 = new int[var10];
        }
        if (var16 == 1) {
            this.field1616 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1614 = new byte[var10];
        }
        this.field1642 = new short[var10];
        if (var11 > 0) {
            this.field1620 = new short[var11];
            this.field1621 = new short[var11];
            this.field1631 = new short[var11];
            if (var24 > 0) {
                this.field1615 = new short[var24];
                this.field1626 = new short[var24];
                this.field1625 = new short[var24];
                this.field1637 = new short[var24];
                this.field1629 = new byte[var24];
                this.field1607 = new short[var24];
            }
            if (var25 > 0) {
                this.field1628 = new short[var25];
            }
        }
        var2.field1867 = var11;
        var3.field1867 = var44;
        var4.field1867 = var46;
        var5.field1867 = var48;
        var6.field1867 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2172();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2184();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2184();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2184();
            }
            this.field1617[var67] = var64 + var69;
            this.field1610[var67] = var65 + var70;
            this.field1606[var67] = var66 + var71;
            var64 = this.field1617[var67];
            var65 = this.field1610[var67];
            var66 = this.field1606[var67];
            if (var17 == 1) {
                this.field1630[var67] = var6.method2172();
            }
        }
        var2.field1867 = var42;
        var3.field1867 = var31;
        var4.field1867 = var34;
        var5.field1867 = var37;
        var6.field1867 = var35;
        var7.field1867 = var40;
        var8.field1867 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1642[var72] = (short) var2.method2255();
            if (var12 == 1) {
                this.field1644[var72] = var3.method2358();
            }
            if (var13 == 255) {
                this.field1612[var72] = var4.method2358();
            }
            if (var14 == 1) {
                this.field1613[var72] = var5.method2358();
            }
            if (var15 == 1) {
                this.field1622[var72] = var6.method2172();
            }
            if (var16 == 1) {
                this.field1616[var72] = (short) (var7.method2255() - 1);
            }
            if (this.field1614 != null && this.field1616[var72] != -1) {
                this.field1614[var72] = (byte) (var8.method2172() - 1);
            }
        }
        var2.field1867 = var33;
        var3.field1867 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2172();
            if (var78 == 1) {
                var73 = var2.method2184() + var76;
                var74 = var2.method2184() + var73;
                var75 = var2.method2184() + var74;
                var76 = var75;
                this.field1608[var77] = var73;
                this.field1609[var77] = var74;
                this.field1627[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2184() + var76;
                var76 = var75;
                this.field1608[var77] = var73;
                this.field1609[var77] = var74;
                this.field1627[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2184() + var76;
                var76 = var75;
                this.field1608[var77] = var73;
                this.field1609[var77] = var74;
                this.field1627[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2184() + var76;
                var76 = var75;
                this.field1608[var77] = var73;
                this.field1609[var77] = var81;
                this.field1627[var77] = var75;
            }
        }
        var2.field1867 = var50;
        var3.field1867 = var52;
        var4.field1867 = var54;
        var5.field1867 = var56;
        var6.field1867 = var58;
        var7.field1867 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1619[var82] & 0xFF;
            if (var83 == 0) {
                this.field1620[var82] = (short) var2.method2255();
                this.field1621[var82] = (short) var2.method2255();
                this.field1631[var82] = (short) var2.method2255();
            }
            if (var83 == 1) {
                this.field1620[var82] = (short) var3.method2255();
                this.field1621[var82] = (short) var3.method2255();
                this.field1631[var82] = (short) var3.method2255();
                this.field1615[var82] = (short) var4.method2255();
                this.field1626[var82] = (short) var4.method2255();
                this.field1625[var82] = (short) var4.method2255();
                this.field1637[var82] = (short) var5.method2255();
                this.field1629[var82] = var6.method2358();
                this.field1607[var82] = (short) var7.method2255();
            }
            if (var83 == 2) {
                this.field1620[var82] = (short) var3.method2255();
                this.field1621[var82] = (short) var3.method2255();
                this.field1631[var82] = (short) var3.method2255();
                this.field1615[var82] = (short) var4.method2255();
                this.field1626[var82] = (short) var4.method2255();
                this.field1625[var82] = (short) var4.method2255();
                this.field1637[var82] = (short) var5.method2255();
                this.field1629[var82] = var6.method2358();
                this.field1607[var82] = (short) var7.method2255();
                this.field1628[var82] = (short) var7.method2255();
            }
            if (var83 == 3) {
                this.field1620[var82] = (short) var3.method2255();
                this.field1621[var82] = (short) var3.method2255();
                this.field1631[var82] = (short) var3.method2255();
                this.field1615[var82] = (short) var4.method2255();
                this.field1626[var82] = (short) var4.method2255();
                this.field1625[var82] = (short) var4.method2255();
                this.field1637[var82] = (short) var5.method2255();
                this.field1629[var82] = var6.method2358();
                this.field1607[var82] = (short) var7.method2255();
            }
        }
        var2.field1867 = var62;
        int var84 = var2.method2172();
        if (var84 == 0) {
            return;
        }
        new class85();
        var2.method2255();
        var2.method2255();
        var2.method2255();
        var2.method2177();
    }

    @ObfuscatedName("cg.e([B)V")
    public void method1932(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class111 var4 = new class111(arg0);
        class111 var5 = new class111(arg0);
        class111 var6 = new class111(arg0);
        class111 var7 = new class111(arg0);
        class111 var8 = new class111(arg0);
        var4.field1867 = arg0.length - 18;
        int var9 = var4.method2255();
        int var10 = var4.method2255();
        int var11 = var4.method2172();
        int var12 = var4.method2172();
        int var13 = var4.method2172();
        int var14 = var4.method2172();
        int var15 = var4.method2172();
        int var16 = var4.method2172();
        int var17 = var4.method2255();
        int var18 = var4.method2255();
        int var19 = var4.method2255();
        int var20 = var4.method2255();
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
        this.field1605 = var9;
        this.field1611 = var10;
        this.field1618 = var11;
        this.field1617 = new int[var9];
        this.field1610 = new int[var9];
        this.field1606 = new int[var9];
        this.field1608 = new int[var10];
        this.field1609 = new int[var10];
        this.field1627 = new int[var10];
        if (var11 > 0) {
            this.field1619 = new byte[var11];
            this.field1620 = new short[var11];
            this.field1621 = new short[var11];
            this.field1631 = new short[var11];
        }
        if (var16 == 1) {
            this.field1630 = new int[var9];
        }
        if (var12 == 1) {
            this.field1644 = new byte[var10];
            this.field1614 = new byte[var10];
            this.field1616 = new short[var10];
        }
        if (var13 == 255) {
            this.field1612 = new byte[var10];
        } else {
            this.field1624 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1613 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1622 = new int[var10];
        }
        this.field1642 = new short[var10];
        var4.field1867 = var21;
        var5.field1867 = var36;
        var6.field1867 = var38;
        var7.field1867 = var40;
        var8.field1867 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2172();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2184();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2184();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2184();
            }
            this.field1617[var46] = var43 + var48;
            this.field1610[var46] = var44 + var49;
            this.field1606[var46] = var45 + var50;
            var43 = this.field1617[var46];
            var44 = this.field1610[var46];
            var45 = this.field1606[var46];
            if (var16 == 1) {
                this.field1630[var46] = var8.method2172();
            }
        }
        var4.field1867 = var32;
        var5.field1867 = var28;
        var6.field1867 = var26;
        var7.field1867 = var30;
        var8.field1867 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1642[var51] = (short) var4.method2255();
            if (var12 == 1) {
                int var52 = var5.method2172();
                if ((var52 & 0x1) == 1) {
                    this.field1644[var51] = 1;
                    var2 = true;
                } else {
                    this.field1644[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1614[var51] = (byte) (var52 >> 2);
                    this.field1616[var51] = this.field1642[var51];
                    this.field1642[var51] = 127;
                    if (this.field1616[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1614[var51] = -1;
                    this.field1616[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1612[var51] = var6.method2358();
            }
            if (var14 == 1) {
                this.field1613[var51] = var7.method2358();
            }
            if (var15 == 1) {
                this.field1622[var51] = var8.method2172();
            }
        }
        var4.field1867 = var25;
        var5.field1867 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2172();
            if (var58 == 1) {
                var53 = var4.method2184() + var56;
                var54 = var4.method2184() + var53;
                var55 = var4.method2184() + var54;
                var56 = var55;
                this.field1608[var57] = var53;
                this.field1609[var57] = var54;
                this.field1627[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2184() + var56;
                var56 = var55;
                this.field1608[var57] = var53;
                this.field1609[var57] = var54;
                this.field1627[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2184() + var56;
                var56 = var55;
                this.field1608[var57] = var53;
                this.field1609[var57] = var54;
                this.field1627[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2184() + var56;
                var56 = var55;
                this.field1608[var57] = var53;
                this.field1609[var57] = var61;
                this.field1627[var57] = var55;
            }
        }
        var4.field1867 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1619[var62] = 0;
            this.field1620[var62] = (short) var4.method2255();
            this.field1621[var62] = (short) var4.method2255();
            this.field1631[var62] = (short) var4.method2255();
        }
        if (this.field1614 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1614[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1620[var65] & 0xFFFF) == this.field1608[var64] && (this.field1621[var65] & 0xFFFF) == this.field1609[var64] && (this.field1631[var65] & 0xFFFF) == this.field1627[var64]) {
                        this.field1614[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1614 = null;
            }
        }
        if (!var3) {
            this.field1616 = null;
        }
        if (!var2) {
            this.field1644 = null;
        }
    }

    public class95(class95[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1605 = 0;
        this.field1611 = 0;
        this.field1618 = 0;
        this.field1624 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class95 var10 = arg0[var9];
            if (var10 != null) {
                this.field1605 += var10.field1605;
                this.field1611 += var10.field1611;
                this.field1618 += var10.field1618;
                if (var10.field1612 == null) {
                    if (this.field1624 == -1) {
                        this.field1624 = var10.field1624;
                    }
                    if (this.field1624 != var10.field1624) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1644 != null;
                var5 |= var10.field1613 != null;
                var6 |= var10.field1622 != null;
                var7 |= var10.field1616 != null;
                var8 |= var10.field1614 != null;
            }
        }
        this.field1617 = new int[this.field1605];
        this.field1610 = new int[this.field1605];
        this.field1606 = new int[this.field1605];
        this.field1630 = new int[this.field1605];
        this.field1608 = new int[this.field1611];
        this.field1609 = new int[this.field1611];
        this.field1627 = new int[this.field1611];
        if (var3) {
            this.field1644 = new byte[this.field1611];
        }
        if (var4) {
            this.field1612 = new byte[this.field1611];
        }
        if (var5) {
            this.field1613 = new byte[this.field1611];
        }
        if (var6) {
            this.field1622 = new int[this.field1611];
        }
        if (var7) {
            this.field1616 = new short[this.field1611];
        }
        if (var8) {
            this.field1614 = new byte[this.field1611];
        }
        this.field1642 = new short[this.field1611];
        if (this.field1618 > 0) {
            this.field1619 = new byte[this.field1618];
            this.field1620 = new short[this.field1618];
            this.field1621 = new short[this.field1618];
            this.field1631 = new short[this.field1618];
            this.field1615 = new short[this.field1618];
            this.field1626 = new short[this.field1618];
            this.field1625 = new short[this.field1618];
            this.field1637 = new short[this.field1618];
            this.field1629 = new byte[this.field1618];
            this.field1607 = new short[this.field1618];
            this.field1628 = new short[this.field1618];
        }
        this.field1605 = 0;
        this.field1611 = 0;
        this.field1618 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class95 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1611; var13++) {
                    if (var3 && var12.field1644 != null) {
                        this.field1644[this.field1611] = var12.field1644[var13];
                    }
                    if (var4) {
                        if (var12.field1612 == null) {
                            this.field1612[this.field1611] = var12.field1624;
                        } else {
                            this.field1612[this.field1611] = var12.field1612[var13];
                        }
                    }
                    if (var5 && var12.field1613 != null) {
                        this.field1613[this.field1611] = var12.field1613[var13];
                    }
                    if (var6 && var12.field1622 != null) {
                        this.field1622[this.field1611] = var12.field1622[var13];
                    }
                    if (var7) {
                        if (var12.field1616 == null) {
                            this.field1616[this.field1611] = -1;
                        } else {
                            this.field1616[this.field1611] = var12.field1616[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1614 == null || var12.field1614[var13] == -1) {
                            this.field1614[this.field1611] = -1;
                        } else {
                            this.field1614[this.field1611] = (byte) (var12.field1614[var13] + this.field1618);
                        }
                    }
                    this.field1642[this.field1611] = var12.field1642[var13];
                    this.field1608[this.field1611] = this.method1961(var12, var12.field1608[var13]);
                    this.field1609[this.field1611] = this.method1961(var12, var12.field1609[var13]);
                    this.field1627[this.field1611] = this.method1961(var12, var12.field1627[var13]);
                    this.field1611++;
                }
                for (int var14 = 0; var14 < var12.field1618; var14++) {
                    byte var15 = this.field1619[this.field1618] = var12.field1619[var14];
                    if (var15 == 0) {
                        this.field1620[this.field1618] = (short) this.method1961(var12, var12.field1620[var14]);
                        this.field1621[this.field1618] = (short) this.method1961(var12, var12.field1621[var14]);
                        this.field1631[this.field1618] = (short) this.method1961(var12, var12.field1631[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1620[this.field1618] = var12.field1620[var14];
                        this.field1621[this.field1618] = var12.field1621[var14];
                        this.field1631[this.field1618] = var12.field1631[var14];
                        this.field1615[this.field1618] = var12.field1615[var14];
                        this.field1626[this.field1618] = var12.field1626[var14];
                        this.field1625[this.field1618] = var12.field1625[var14];
                        this.field1637[this.field1618] = var12.field1637[var14];
                        this.field1629[this.field1618] = var12.field1629[var14];
                        this.field1607[this.field1618] = var12.field1607[var14];
                    }
                    if (var15 == 2) {
                        this.field1628[this.field1618] = var12.field1628[var14];
                    }
                    this.field1618++;
                }
            }
        }
    }

    @ObfuscatedName("cg.i(Lcg;I)I")
    public final int method1961(class95 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1617[arg1];
        int var5 = arg0.field1610[arg1];
        int var6 = arg0.field1606[arg1];
        for (int var7 = 0; var7 < this.field1605; var7++) {
            if (this.field1617[var7] == var4 && this.field1610[var7] == var5 && this.field1606[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1617[this.field1605] = var4;
            this.field1610[this.field1605] = var5;
            this.field1606[this.field1605] = var6;
            if (arg0.field1630 != null) {
                this.field1630[this.field1605] = arg0.field1630[arg1];
            }
            var3 = this.field1605++;
        }
        return var3;
    }

    public class95(class95 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1605 = arg0.field1605;
        this.field1611 = arg0.field1611;
        this.field1618 = arg0.field1618;
        if (arg1) {
            this.field1617 = arg0.field1617;
            this.field1610 = arg0.field1610;
            this.field1606 = arg0.field1606;
        } else {
            this.field1617 = new int[this.field1605];
            this.field1610 = new int[this.field1605];
            this.field1606 = new int[this.field1605];
            for (int var6 = 0; var6 < this.field1605; var6++) {
                this.field1617[var6] = arg0.field1617[var6];
                this.field1610[var6] = arg0.field1610[var6];
                this.field1606[var6] = arg0.field1606[var6];
            }
        }
        if (arg2) {
            this.field1642 = arg0.field1642;
        } else {
            this.field1642 = new short[this.field1611];
            for (int var7 = 0; var7 < this.field1611; var7++) {
                this.field1642[var7] = arg0.field1642[var7];
            }
        }
        if (arg3 || arg0.field1616 == null) {
            this.field1616 = arg0.field1616;
        } else {
            this.field1616 = new short[this.field1611];
            for (int var8 = 0; var8 < this.field1611; var8++) {
                this.field1616[var8] = arg0.field1616[var8];
            }
        }
        if (arg4) {
            this.field1613 = arg0.field1613;
        } else {
            this.field1613 = new byte[this.field1611];
            if (arg0.field1613 == null) {
                for (int var9 = 0; var9 < this.field1611; var9++) {
                    this.field1613[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1611; var10++) {
                    this.field1613[var10] = arg0.field1613[var10];
                }
            }
        }
        this.field1608 = arg0.field1608;
        this.field1609 = arg0.field1609;
        this.field1627 = arg0.field1627;
        this.field1644 = arg0.field1644;
        this.field1612 = arg0.field1612;
        this.field1614 = arg0.field1614;
        this.field1624 = arg0.field1624;
        this.field1619 = arg0.field1619;
        this.field1620 = arg0.field1620;
        this.field1621 = arg0.field1621;
        this.field1631 = arg0.field1631;
        this.field1615 = arg0.field1615;
        this.field1626 = arg0.field1626;
        this.field1625 = arg0.field1625;
        this.field1637 = arg0.field1637;
        this.field1629 = arg0.field1629;
        this.field1607 = arg0.field1607;
        this.field1628 = arg0.field1628;
        this.field1630 = arg0.field1630;
        this.field1622 = arg0.field1622;
        this.field1632 = arg0.field1632;
        this.field1633 = arg0.field1633;
        this.field1641 = arg0.field1641;
        this.field1634 = arg0.field1634;
        this.field1636 = arg0.field1636;
        this.field1645 = arg0.field1645;
        this.field1638 = arg0.field1638;
    }

    @ObfuscatedName("cg.f()Lcg;")
    public class95 method1934() {
        class95 var1 = new class95();
        if (this.field1644 != null) {
            var1.field1644 = new byte[this.field1611];
            for (int var2 = 0; var2 < this.field1611; var2++) {
                var1.field1644[var2] = this.field1644[var2];
            }
        }
        var1.field1605 = this.field1605;
        var1.field1611 = this.field1611;
        var1.field1618 = this.field1618;
        var1.field1617 = this.field1617;
        var1.field1610 = this.field1610;
        var1.field1606 = this.field1606;
        var1.field1608 = this.field1608;
        var1.field1609 = this.field1609;
        var1.field1627 = this.field1627;
        var1.field1612 = this.field1612;
        var1.field1613 = this.field1613;
        var1.field1614 = this.field1614;
        var1.field1642 = this.field1642;
        var1.field1616 = this.field1616;
        var1.field1624 = this.field1624;
        var1.field1619 = this.field1619;
        var1.field1620 = this.field1620;
        var1.field1621 = this.field1621;
        var1.field1631 = this.field1631;
        var1.field1615 = this.field1615;
        var1.field1626 = this.field1626;
        var1.field1625 = this.field1625;
        var1.field1637 = this.field1637;
        var1.field1629 = this.field1629;
        var1.field1607 = this.field1607;
        var1.field1628 = this.field1628;
        var1.field1630 = this.field1630;
        var1.field1622 = this.field1622;
        var1.field1632 = this.field1632;
        var1.field1633 = this.field1633;
        var1.field1641 = this.field1641;
        var1.field1634 = this.field1634;
        var1.field1645 = this.field1645;
        var1.field1638 = this.field1638;
        return var1;
    }

    @ObfuscatedName("cg.d([[IIIIZI)Lcg;")
    public class95 method1935(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1948();
        int var7 = this.field1603 + arg1;
        int var8 = this.field1604 + arg1;
        int var9 = this.field1623 + arg3;
        int var10 = this.field1643 + arg3;
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
        class95 var15;
        if (arg4) {
            var15 = new class95();
            var15.field1605 = this.field1605;
            var15.field1611 = this.field1611;
            var15.field1618 = this.field1618;
            var15.field1617 = this.field1617;
            var15.field1606 = this.field1606;
            var15.field1608 = this.field1608;
            var15.field1609 = this.field1609;
            var15.field1627 = this.field1627;
            var15.field1644 = this.field1644;
            var15.field1612 = this.field1612;
            var15.field1613 = this.field1613;
            var15.field1614 = this.field1614;
            var15.field1642 = this.field1642;
            var15.field1616 = this.field1616;
            var15.field1624 = this.field1624;
            var15.field1619 = this.field1619;
            var15.field1620 = this.field1620;
            var15.field1621 = this.field1621;
            var15.field1631 = this.field1631;
            var15.field1615 = this.field1615;
            var15.field1626 = this.field1626;
            var15.field1625 = this.field1625;
            var15.field1637 = this.field1637;
            var15.field1629 = this.field1629;
            var15.field1607 = this.field1607;
            var15.field1628 = this.field1628;
            var15.field1630 = this.field1630;
            var15.field1622 = this.field1622;
            var15.field1632 = this.field1632;
            var15.field1633 = this.field1633;
            var15.field1645 = this.field1645;
            var15.field1638 = this.field1638;
            var15.field1610 = new int[var15.field1605];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1605; var16++) {
                int var17 = this.field1617[var16] + arg1;
                int var18 = this.field1606[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1610[var16] = this.field1610[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1605; var26++) {
                int var27 = (-this.field1610[var26] << 16) / this.field1364;
                if (var27 < arg5) {
                    int var28 = this.field1617[var26] + arg1;
                    int var29 = this.field1606[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1610[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1610[var26];
                }
            }
        }
        var15.method1947();
        return var15;
    }

    @ObfuscatedName("cg.j()V")
    public void method1938() {
        int var10002;
        if (this.field1630 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1605; var3++) {
                int var4 = this.field1630[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1632 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1632[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1605) {
                int var7 = this.field1630[var6];
                this.field1632[var7][var1[var7]++] = var6++;
            }
            this.field1630 = null;
        }
        if (this.field1622 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1611; var10++) {
            int var11 = this.field1622[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1633 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1633[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1611) {
            int var14 = this.field1622[var13];
            this.field1633[var14][var8[var14]++] = var13++;
        }
        this.field1622 = null;
    }

    @ObfuscatedName("cg.x()V")
    public void method1937() {
        for (int var1 = 0; var1 < this.field1605; var1++) {
            int var2 = this.field1617[var1];
            this.field1617[var1] = this.field1606[var1];
            this.field1606[var1] = -var2;
        }
        this.method1947();
    }

    @ObfuscatedName("cg.v()V")
    public void method1985() {
        for (int var1 = 0; var1 < this.field1605; var1++) {
            this.field1617[var1] = -this.field1617[var1];
            this.field1606[var1] = -this.field1606[var1];
        }
        this.method1947();
    }

    @ObfuscatedName("cg.a()V")
    public void method1965() {
        for (int var1 = 0; var1 < this.field1605; var1++) {
            int var2 = this.field1606[var1];
            this.field1606[var1] = this.field1617[var1];
            this.field1617[var1] = -var2;
        }
        this.method1947();
    }

    @ObfuscatedName("cg.l(I)V")
    public void method1940(int arg0) {
        int var2 = field1648[arg0];
        int var3 = field1649[arg0];
        for (int var4 = 0; var4 < this.field1605; var4++) {
            int var5 = this.field1617[var4] * var3 + this.field1606[var4] * var2 >> 16;
            this.field1606[var4] = this.field1606[var4] * var3 - this.field1617[var4] * var2 >> 16;
            this.field1617[var4] = var5;
        }
        this.method1947();
    }

    @ObfuscatedName("cg.h(III)V")
    public void method1941(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1605; var4++) {
            this.field1617[var4] += arg0;
            this.field1610[var4] += arg1;
            this.field1606[var4] += arg2;
        }
        this.method1947();
    }

    @ObfuscatedName("cg.c(SS)V")
    public void method1995(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1611; var3++) {
            if (this.field1642[var3] == arg0) {
                this.field1642[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cg.u(SS)V")
    public void method1943(short arg0, short arg1) {
        if (this.field1616 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1611; var3++) {
            if (this.field1616[var3] == arg0) {
                this.field1616[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cg.r()V")
    public void method1944() {
        for (int var1 = 0; var1 < this.field1605; var1++) {
            this.field1606[var1] = -this.field1606[var1];
        }
        for (int var2 = 0; var2 < this.field1611; var2++) {
            int var3 = this.field1608[var2];
            this.field1608[var2] = this.field1627[var2];
            this.field1627[var2] = var3;
        }
        this.method1947();
    }

    @ObfuscatedName("cg.k(III)V")
    public void method1945(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1605; var4++) {
            this.field1617[var4] = this.field1617[var4] * arg0 / 128;
            this.field1610[var4] = this.field1610[var4] * arg1 / 128;
            this.field1606[var4] = this.field1606[var4] * arg2 / 128;
        }
        this.method1947();
    }

    @ObfuscatedName("cg.w()V")
    public void method1946() {
        if (this.field1641 != null) {
            return;
        }
        this.field1641 = new class91[this.field1605];
        for (int var1 = 0; var1 < this.field1605; var1++) {
            this.field1641[var1] = new class91();
        }
        for (int var2 = 0; var2 < this.field1611; var2++) {
            int var3 = this.field1608[var2];
            int var4 = this.field1609[var2];
            int var5 = this.field1627[var2];
            int var6 = this.field1617[var4] - this.field1617[var3];
            int var7 = this.field1610[var4] - this.field1610[var3];
            int var8 = this.field1606[var4] - this.field1606[var3];
            int var9 = this.field1617[var5] - this.field1617[var3];
            int var10 = this.field1610[var5] - this.field1610[var3];
            int var11 = this.field1606[var5] - this.field1606[var3];
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
            if (this.field1644 == null) {
                var19 = 0;
            } else {
                var19 = this.field1644[var2];
            }
            if (var19 == 0) {
                class91 var20 = this.field1641[var3];
                var20.field1547 += var16;
                var20.field1538 += var17;
                var20.field1537 += var18;
                var20.field1536++;
                class91 var21 = this.field1641[var4];
                var21.field1547 += var16;
                var21.field1538 += var17;
                var21.field1537 += var18;
                var21.field1536++;
                class91 var22 = this.field1641[var5];
                var22.field1547 += var16;
                var22.field1538 += var17;
                var22.field1537 += var18;
                var22.field1536++;
            } else if (var19 == 1) {
                if (this.field1634 == null) {
                    this.field1634 = new class79[this.field1611];
                }
                class79 var23 = this.field1634[var2] = new class79();
                var23.field1363 = var16;
                var23.field1358 = var17;
                var23.field1359 = var18;
            }
        }
    }

    @ObfuscatedName("cg.q()V")
    public void method1947() {
        this.field1641 = null;
        this.field1636 = null;
        this.field1634 = null;
        this.field1639 = false;
    }

    @ObfuscatedName("cg.g()V")
    public void method1948() {
        if (this.field1639) {
            return;
        }
        this.field1364 = 0;
        this.field1640 = 0;
        this.field1603 = 999999;
        this.field1604 = -999999;
        this.field1643 = -99999;
        this.field1623 = 99999;
        for (int var1 = 0; var1 < this.field1605; var1++) {
            int var2 = this.field1617[var1];
            int var3 = this.field1610[var1];
            int var4 = this.field1606[var1];
            if (var2 < this.field1603) {
                this.field1603 = var2;
            }
            if (var2 > this.field1604) {
                this.field1604 = var2;
            }
            if (var4 < this.field1623) {
                this.field1623 = var4;
            }
            if (var4 > this.field1643) {
                this.field1643 = var4;
            }
            if (-var3 > this.field1364) {
                this.field1364 = -var3;
            }
            if (var3 > this.field1640) {
                this.field1640 = var3;
            }
        }
        this.field1639 = true;
    }

    @ObfuscatedName("cg.z(Lcg;Lcg;IIIZ)V")
    public static void method1949(class95 arg0, class95 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1948();
        arg0.method1946();
        arg1.method1948();
        arg1.method1946();
        field1647++;
        int var6 = 0;
        int[] var7 = arg1.field1617;
        int var8 = arg1.field1605;
        for (int var9 = 0; var9 < arg0.field1605; var9++) {
            class91 var10 = arg0.field1641[var9];
            if (var10.field1536 != 0) {
                int var11 = arg0.field1610[var9] - arg3;
                if (var11 <= arg1.field1640) {
                    int var12 = arg0.field1617[var9] - arg2;
                    if (var12 >= arg1.field1603 && var12 <= arg1.field1604) {
                        int var13 = arg0.field1606[var9] - arg4;
                        if (var13 >= arg1.field1623 && var13 <= arg1.field1643) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class91 var15 = arg1.field1641[var14];
                                if (var7[var14] == var12 && arg1.field1606[var14] == var13 && arg1.field1610[var14] == var11 && var15.field1536 != 0) {
                                    if (arg0.field1636 == null) {
                                        arg0.field1636 = new class91[arg0.field1605];
                                    }
                                    if (arg1.field1636 == null) {
                                        arg1.field1636 = new class91[var8];
                                    }
                                    class91 var16 = arg0.field1636[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1636[var9] = new class91(var10);
                                    }
                                    class91 var17 = arg1.field1636[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1636[var14] = new class91(var15);
                                    }
                                    var16.field1547 += var15.field1547;
                                    var16.field1538 += var15.field1538;
                                    var16.field1537 += var15.field1537;
                                    var16.field1536 += var15.field1536;
                                    var17.field1547 += var10.field1547;
                                    var17.field1538 += var10.field1538;
                                    var17.field1537 += var10.field1537;
                                    var17.field1536 += var10.field1536;
                                    var6++;
                                    field1635[var9] = field1647;
                                    field1646[var14] = field1647;
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
        for (int var18 = 0; var18 < arg0.field1611; var18++) {
            if (field1635[arg0.field1608[var18]] == field1647 && field1635[arg0.field1609[var18]] == field1647 && field1635[arg0.field1627[var18]] == field1647) {
                if (arg0.field1644 == null) {
                    arg0.field1644 = new byte[arg0.field1611];
                }
                arg0.field1644[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1611; var19++) {
            if (field1646[arg1.field1608[var19]] == field1647 && field1646[arg1.field1609[var19]] == field1647 && field1646[arg1.field1627[var19]] == field1647) {
                if (arg1.field1644 == null) {
                    arg1.field1644 = new byte[arg1.field1611];
                }
                arg1.field1644[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cg.m(IIIII)Lcs;")
    public final class100 method1950(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1946();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class100 var8 = new class100();
        var8.field1777 = new int[this.field1611];
        var8.field1753 = new int[this.field1611];
        var8.field1731 = new int[this.field1611];
        if (this.field1618 > 0 && this.field1614 != null) {
            int[] var9 = new int[this.field1618];
            for (int var10 = 0; var10 < this.field1611; var10++) {
                if (this.field1614[var10] != -1) {
                    var9[this.field1614[var10] & 0xFF]++;
                }
            }
            var8.field1737 = 0;
            for (int var11 = 0; var11 < this.field1618; var11++) {
                if (var9[var11] > 0 && this.field1619[var11] == 0) {
                    var8.field1737++;
                }
            }
            var8.field1766 = new int[var8.field1737];
            var8.field1739 = new int[var8.field1737];
            var8.field1740 = new int[var8.field1737];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1618; var13++) {
                if (var9[var13] > 0 && this.field1619[var13] == 0) {
                    var8.field1766[var12] = this.field1620[var13] & 0xFFFF;
                    var8.field1739[var12] = this.field1621[var13] & 0xFFFF;
                    var8.field1740[var12] = this.field1631[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1734 = new byte[this.field1611];
            for (int var14 = 0; var14 < this.field1611; var14++) {
                if (this.field1614[var14] == -1) {
                    var8.field1734[var14] = -1;
                } else {
                    var8.field1734[var14] = (byte) var9[this.field1614[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1611; var15++) {
            byte var16;
            if (this.field1644 == null) {
                var16 = 0;
            } else {
                var16 = this.field1644[var15];
            }
            byte var17;
            if (this.field1613 == null) {
                var17 = 0;
            } else {
                var17 = this.field1613[var15];
            }
            short var18;
            if (this.field1616 == null) {
                var18 = -1;
            } else {
                var18 = this.field1616[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1642[var15] & 0xFFFF;
                    class91 var20;
                    if (this.field1636 == null || this.field1636[this.field1608[var15]] == null) {
                        var20 = this.field1641[this.field1608[var15]];
                    } else {
                        var20 = this.field1636[this.field1608[var15]];
                    }
                    int var21 = (var20.field1537 * arg4 + var20.field1547 * arg2 + var20.field1538 * arg3) / (var20.field1536 * var7) + arg0;
                    var8.field1777[var15] = method1951(var19, var21);
                    class91 var22;
                    if (this.field1636 == null || this.field1636[this.field1609[var15]] == null) {
                        var22 = this.field1641[this.field1609[var15]];
                    } else {
                        var22 = this.field1636[this.field1609[var15]];
                    }
                    int var23 = (var22.field1537 * arg4 + var22.field1547 * arg2 + var22.field1538 * arg3) / (var22.field1536 * var7) + arg0;
                    var8.field1753[var15] = method1951(var19, var23);
                    class91 var24;
                    if (this.field1636 == null || this.field1636[this.field1627[var15]] == null) {
                        var24 = this.field1641[this.field1627[var15]];
                    } else {
                        var24 = this.field1636[this.field1627[var15]];
                    }
                    int var25 = (var24.field1537 * arg4 + var24.field1547 * arg2 + var24.field1538 * arg3) / (var24.field1536 * var7) + arg0;
                    var8.field1731[var15] = method1951(var19, var25);
                } else if (var16 == 1) {
                    class79 var26 = this.field1634[var15];
                    int var27 = (var26.field1359 * arg4 + var26.field1363 * arg2 + var26.field1358 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1777[var15] = method1951(this.field1642[var15] & 0xFFFF, var27);
                    var8.field1731[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1777[var15] = 128;
                    var8.field1731[var15] = -1;
                } else {
                    var8.field1731[var15] = -2;
                }
            } else if (var16 == 0) {
                class91 var28;
                if (this.field1636 == null || this.field1636[this.field1608[var15]] == null) {
                    var28 = this.field1641[this.field1608[var15]];
                } else {
                    var28 = this.field1636[this.field1608[var15]];
                }
                int var29 = (var28.field1537 * arg4 + var28.field1547 * arg2 + var28.field1538 * arg3) / (var28.field1536 * var7) + arg0;
                var8.field1777[var15] = method1933(var29);
                class91 var30;
                if (this.field1636 == null || this.field1636[this.field1609[var15]] == null) {
                    var30 = this.field1641[this.field1609[var15]];
                } else {
                    var30 = this.field1636[this.field1609[var15]];
                }
                int var31 = (var30.field1537 * arg4 + var30.field1547 * arg2 + var30.field1538 * arg3) / (var30.field1536 * var7) + arg0;
                var8.field1753[var15] = method1933(var31);
                class91 var32;
                if (this.field1636 == null || this.field1636[this.field1627[var15]] == null) {
                    var32 = this.field1641[this.field1627[var15]];
                } else {
                    var32 = this.field1636[this.field1627[var15]];
                }
                int var33 = (var32.field1537 * arg4 + var32.field1547 * arg2 + var32.field1538 * arg3) / (var32.field1536 * var7) + arg0;
                var8.field1731[var15] = method1933(var33);
            } else if (var16 == 1) {
                class79 var34 = this.field1634[var15];
                int var35 = (var34.field1359 * arg4 + var34.field1363 * arg2 + var34.field1358 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1777[var15] = method1933(var35);
                var8.field1731[var15] = -1;
            } else {
                var8.field1731[var15] = -2;
            }
        }
        this.method1938();
        var8.field1752 = this.field1605;
        var8.field1722 = this.field1617;
        var8.field1772 = this.field1610;
        var8.field1724 = this.field1606;
        var8.field1725 = this.field1611;
        var8.field1726 = this.field1608;
        var8.field1727 = this.field1609;
        var8.field1718 = this.field1627;
        var8.field1732 = this.field1612;
        var8.field1733 = this.field1613;
        var8.field1736 = this.field1624;
        var8.field1741 = this.field1632;
        var8.field1742 = this.field1633;
        var8.field1773 = this.field1616;
        return var8;
    }

    @ObfuscatedName("cg.y(II)I")
    public static final int method1951(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cg.n(I)I")
    public static final int method1933(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
