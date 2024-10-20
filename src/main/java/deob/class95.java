package deob;

@ObfuscatedName("cy")
public class class95 extends class80 {

    @ObfuscatedName("cy.n")
    public int field1623 = 0;

    @ObfuscatedName("cy.d")
    public int[] field1628;

    @ObfuscatedName("cy.z")
    public int[] field1630;

    @ObfuscatedName("cy.y")
    public int[] field1624;

    @ObfuscatedName("cy.e")
    public int field1640 = 0;

    @ObfuscatedName("cy.g")
    public int[] field1626;

    @ObfuscatedName("cy.f")
    public int[] field1627;

    @ObfuscatedName("cy.m")
    public int[] field1663;

    @ObfuscatedName("cy.a")
    public byte[] field1629;

    @ObfuscatedName("cy.h")
    public byte[] field1661;

    @ObfuscatedName("cy.l")
    public byte[] field1642;

    @ObfuscatedName("cy.u")
    public byte[] field1622;

    @ObfuscatedName("cy.q")
    public short[] field1633;

    @ObfuscatedName("cy.k")
    public short[] field1634;

    @ObfuscatedName("cy.x")
    public byte field1635 = 0;

    @ObfuscatedName("cy.r")
    public int field1643;

    @ObfuscatedName("cy.j")
    public byte[] field1645;

    @ObfuscatedName("cy.s")
    public short[] field1638;

    @ObfuscatedName("cy.v")
    public short[] field1625;

    @ObfuscatedName("cy.c")
    public short[] field1657;

    @ObfuscatedName("cy.p")
    public short[] field1641;

    @ObfuscatedName("cy.o")
    public short[] field1631;

    @ObfuscatedName("cy.b")
    public short[] field1667;

    @ObfuscatedName("cy.t")
    public short[] field1644;

    @ObfuscatedName("cy.w")
    public short[] field1665;

    @ObfuscatedName("cy.i")
    public short[] field1637;

    @ObfuscatedName("cy.ad")
    public byte[] field1647;

    @ObfuscatedName("cy.ak")
    public int[] field1648;

    @ObfuscatedName("cy.ae")
    public int[] field1649;

    @ObfuscatedName("cy.ax")
    public int[][] field1650;

    @ObfuscatedName("cy.al")
    public int[][] field1651;

    @ObfuscatedName("cy.ar")
    public class79[] field1652;

    @ObfuscatedName("cy.as")
    public class91[] field1653;

    @ObfuscatedName("cy.ab")
    public class91[] field1654;

    @ObfuscatedName("cy.ao")
    public short field1655;

    @ObfuscatedName("cy.ac")
    public short field1656;

    @ObfuscatedName("cy.az")
    public boolean field1621 = false;

    @ObfuscatedName("cy.at")
    public int field1658;

    @ObfuscatedName("cy.aa")
    public int field1659;

    @ObfuscatedName("cy.an")
    public int field1660;

    @ObfuscatedName("cy.aw")
    public int field1646;

    @ObfuscatedName("cy.ai")
    public int field1662;

    @ObfuscatedName("cy.ah")
    public static int[] field1636 = new int[10000];

    @ObfuscatedName("cy.aq")
    public static int[] field1664 = new int[10000];

    @ObfuscatedName("cy.ay")
    public static int field1639 = 0;

    @ObfuscatedName("cy.am")
    public static int[] field1666 = class86.field1515;

    @ObfuscatedName("cy.aj")
    public static int[] field1632 = class86.field1516;

    public class95() {
    }

    @ObfuscatedName("cy.n(Lfs;II)Lcy;")
    public static class95 method1969(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2948(arg1, arg2);
        return var3 == null ? null : new class95(var3);
    }

    public class95(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1971(arg0);
        } else {
            this.method1990(arg0);
        }
    }

    @ObfuscatedName("cy.z([B)V")
    public void method1971(byte[] arg0) {
        class111 var2 = new class111(arg0);
        class111 var3 = new class111(arg0);
        class111 var4 = new class111(arg0);
        class111 var5 = new class111(arg0);
        class111 var6 = new class111(arg0);
        class111 var7 = new class111(arg0);
        class111 var8 = new class111(arg0);
        var2.field1889 = arg0.length - 23;
        int var9 = var2.method2231();
        int var10 = var2.method2231();
        int var11 = var2.method2228();
        int var12 = var2.method2228();
        int var13 = var2.method2228();
        int var14 = var2.method2228();
        int var15 = var2.method2228();
        int var16 = var2.method2228();
        int var17 = var2.method2228();
        int var18 = var2.method2231();
        int var19 = var2.method2231();
        int var20 = var2.method2231();
        int var21 = var2.method2231();
        int var22 = var2.method2231();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1645 = new byte[var11];
            var2.field1889 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1645[var26] = var2.method2409();
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
        this.field1623 = var9;
        this.field1640 = var10;
        this.field1643 = var11;
        this.field1628 = new int[var9];
        this.field1630 = new int[var9];
        this.field1624 = new int[var9];
        this.field1626 = new int[var10];
        this.field1627 = new int[var10];
        this.field1663 = new int[var10];
        if (var17 == 1) {
            this.field1648 = new int[var9];
        }
        if (var12 == 1) {
            this.field1629 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1661 = new byte[var10];
        } else {
            this.field1635 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1642 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1649 = new int[var10];
        }
        if (var16 == 1) {
            this.field1634 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1622 = new byte[var10];
        }
        this.field1633 = new short[var10];
        if (var11 > 0) {
            this.field1638 = new short[var11];
            this.field1625 = new short[var11];
            this.field1657 = new short[var11];
            if (var24 > 0) {
                this.field1641 = new short[var24];
                this.field1631 = new short[var24];
                this.field1667 = new short[var24];
                this.field1644 = new short[var24];
                this.field1647 = new byte[var24];
                this.field1665 = new short[var24];
            }
            if (var25 > 0) {
                this.field1637 = new short[var25];
            }
        }
        var2.field1889 = var11;
        var3.field1889 = var44;
        var4.field1889 = var46;
        var5.field1889 = var48;
        var6.field1889 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2228();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2240();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2240();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2240();
            }
            this.field1628[var67] = var64 + var69;
            this.field1630[var67] = var65 + var70;
            this.field1624[var67] = var66 + var71;
            var64 = this.field1628[var67];
            var65 = this.field1630[var67];
            var66 = this.field1624[var67];
            if (var17 == 1) {
                this.field1648[var67] = var6.method2228();
            }
        }
        var2.field1889 = var42;
        var3.field1889 = var31;
        var4.field1889 = var34;
        var5.field1889 = var37;
        var6.field1889 = var35;
        var7.field1889 = var40;
        var8.field1889 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1633[var72] = (short) var2.method2231();
            if (var12 == 1) {
                this.field1629[var72] = var3.method2409();
            }
            if (var13 == 255) {
                this.field1661[var72] = var4.method2409();
            }
            if (var14 == 1) {
                this.field1642[var72] = var5.method2409();
            }
            if (var15 == 1) {
                this.field1649[var72] = var6.method2228();
            }
            if (var16 == 1) {
                this.field1634[var72] = (short) (var7.method2231() - 1);
            }
            if (this.field1622 != null && this.field1634[var72] != -1) {
                this.field1622[var72] = (byte) (var8.method2228() - 1);
            }
        }
        var2.field1889 = var33;
        var3.field1889 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2228();
            if (var78 == 1) {
                var73 = var2.method2240() + var76;
                var74 = var2.method2240() + var73;
                var75 = var2.method2240() + var74;
                var76 = var75;
                this.field1626[var77] = var73;
                this.field1627[var77] = var74;
                this.field1663[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2240() + var76;
                var76 = var75;
                this.field1626[var77] = var73;
                this.field1627[var77] = var74;
                this.field1663[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2240() + var76;
                var76 = var75;
                this.field1626[var77] = var73;
                this.field1627[var77] = var74;
                this.field1663[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2240() + var76;
                var76 = var75;
                this.field1626[var77] = var73;
                this.field1627[var77] = var81;
                this.field1663[var77] = var75;
            }
        }
        var2.field1889 = var50;
        var3.field1889 = var52;
        var4.field1889 = var54;
        var5.field1889 = var56;
        var6.field1889 = var58;
        var7.field1889 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1645[var82] & 0xFF;
            if (var83 == 0) {
                this.field1638[var82] = (short) var2.method2231();
                this.field1625[var82] = (short) var2.method2231();
                this.field1657[var82] = (short) var2.method2231();
            }
            if (var83 == 1) {
                this.field1638[var82] = (short) var3.method2231();
                this.field1625[var82] = (short) var3.method2231();
                this.field1657[var82] = (short) var3.method2231();
                this.field1641[var82] = (short) var4.method2231();
                this.field1631[var82] = (short) var4.method2231();
                this.field1667[var82] = (short) var4.method2231();
                this.field1644[var82] = (short) var5.method2231();
                this.field1647[var82] = var6.method2409();
                this.field1665[var82] = (short) var7.method2231();
            }
            if (var83 == 2) {
                this.field1638[var82] = (short) var3.method2231();
                this.field1625[var82] = (short) var3.method2231();
                this.field1657[var82] = (short) var3.method2231();
                this.field1641[var82] = (short) var4.method2231();
                this.field1631[var82] = (short) var4.method2231();
                this.field1667[var82] = (short) var4.method2231();
                this.field1644[var82] = (short) var5.method2231();
                this.field1647[var82] = var6.method2409();
                this.field1665[var82] = (short) var7.method2231();
                this.field1637[var82] = (short) var7.method2231();
            }
            if (var83 == 3) {
                this.field1638[var82] = (short) var3.method2231();
                this.field1625[var82] = (short) var3.method2231();
                this.field1657[var82] = (short) var3.method2231();
                this.field1641[var82] = (short) var4.method2231();
                this.field1631[var82] = (short) var4.method2231();
                this.field1667[var82] = (short) var4.method2231();
                this.field1644[var82] = (short) var5.method2231();
                this.field1647[var82] = var6.method2409();
                this.field1665[var82] = (short) var7.method2231();
            }
        }
        var2.field1889 = var62;
        int var84 = var2.method2228();
        if (var84 == 0) {
            return;
        }
        new class85();
        var2.method2231();
        var2.method2231();
        var2.method2231();
        var2.method2233();
    }

    @ObfuscatedName("cy.y([B)V")
    public void method1990(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class111 var4 = new class111(arg0);
        class111 var5 = new class111(arg0);
        class111 var6 = new class111(arg0);
        class111 var7 = new class111(arg0);
        class111 var8 = new class111(arg0);
        var4.field1889 = arg0.length - 18;
        int var9 = var4.method2231();
        int var10 = var4.method2231();
        int var11 = var4.method2228();
        int var12 = var4.method2228();
        int var13 = var4.method2228();
        int var14 = var4.method2228();
        int var15 = var4.method2228();
        int var16 = var4.method2228();
        int var17 = var4.method2231();
        int var18 = var4.method2231();
        int var19 = var4.method2231();
        int var20 = var4.method2231();
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
        this.field1623 = var9;
        this.field1640 = var10;
        this.field1643 = var11;
        this.field1628 = new int[var9];
        this.field1630 = new int[var9];
        this.field1624 = new int[var9];
        this.field1626 = new int[var10];
        this.field1627 = new int[var10];
        this.field1663 = new int[var10];
        if (var11 > 0) {
            this.field1645 = new byte[var11];
            this.field1638 = new short[var11];
            this.field1625 = new short[var11];
            this.field1657 = new short[var11];
        }
        if (var16 == 1) {
            this.field1648 = new int[var9];
        }
        if (var12 == 1) {
            this.field1629 = new byte[var10];
            this.field1622 = new byte[var10];
            this.field1634 = new short[var10];
        }
        if (var13 == 255) {
            this.field1661 = new byte[var10];
        } else {
            this.field1635 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1642 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1649 = new int[var10];
        }
        this.field1633 = new short[var10];
        var4.field1889 = var21;
        var5.field1889 = var36;
        var6.field1889 = var38;
        var7.field1889 = var40;
        var8.field1889 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2228();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2240();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2240();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2240();
            }
            this.field1628[var46] = var43 + var48;
            this.field1630[var46] = var44 + var49;
            this.field1624[var46] = var45 + var50;
            var43 = this.field1628[var46];
            var44 = this.field1630[var46];
            var45 = this.field1624[var46];
            if (var16 == 1) {
                this.field1648[var46] = var8.method2228();
            }
        }
        var4.field1889 = var32;
        var5.field1889 = var28;
        var6.field1889 = var26;
        var7.field1889 = var30;
        var8.field1889 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1633[var51] = (short) var4.method2231();
            if (var12 == 1) {
                int var52 = var5.method2228();
                if ((var52 & 0x1) == 1) {
                    this.field1629[var51] = 1;
                    var2 = true;
                } else {
                    this.field1629[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1622[var51] = (byte) (var52 >> 2);
                    this.field1634[var51] = this.field1633[var51];
                    this.field1633[var51] = 127;
                    if (this.field1634[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1622[var51] = -1;
                    this.field1634[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1661[var51] = var6.method2409();
            }
            if (var14 == 1) {
                this.field1642[var51] = var7.method2409();
            }
            if (var15 == 1) {
                this.field1649[var51] = var8.method2228();
            }
        }
        var4.field1889 = var25;
        var5.field1889 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2228();
            if (var58 == 1) {
                var53 = var4.method2240() + var56;
                var54 = var4.method2240() + var53;
                var55 = var4.method2240() + var54;
                var56 = var55;
                this.field1626[var57] = var53;
                this.field1627[var57] = var54;
                this.field1663[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2240() + var56;
                var56 = var55;
                this.field1626[var57] = var53;
                this.field1627[var57] = var54;
                this.field1663[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2240() + var56;
                var56 = var55;
                this.field1626[var57] = var53;
                this.field1627[var57] = var54;
                this.field1663[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2240() + var56;
                var56 = var55;
                this.field1626[var57] = var53;
                this.field1627[var57] = var61;
                this.field1663[var57] = var55;
            }
        }
        var4.field1889 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1645[var62] = 0;
            this.field1638[var62] = (short) var4.method2231();
            this.field1625[var62] = (short) var4.method2231();
            this.field1657[var62] = (short) var4.method2231();
        }
        if (this.field1622 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1622[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1638[var65] & 0xFFFF) == this.field1626[var64] && (this.field1625[var65] & 0xFFFF) == this.field1627[var64] && (this.field1657[var65] & 0xFFFF) == this.field1663[var64]) {
                        this.field1622[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1622 = null;
            }
        }
        if (!var3) {
            this.field1634 = null;
        }
        if (!var2) {
            this.field1629 = null;
        }
    }

    public class95(class95[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1623 = 0;
        this.field1640 = 0;
        this.field1643 = 0;
        this.field1635 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class95 var10 = arg0[var9];
            if (var10 != null) {
                this.field1623 += var10.field1623;
                this.field1640 += var10.field1640;
                this.field1643 += var10.field1643;
                if (var10.field1661 == null) {
                    if (this.field1635 == -1) {
                        this.field1635 = var10.field1635;
                    }
                    if (this.field1635 != var10.field1635) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1629 != null;
                var5 |= var10.field1642 != null;
                var6 |= var10.field1649 != null;
                var7 |= var10.field1634 != null;
                var8 |= var10.field1622 != null;
            }
        }
        this.field1628 = new int[this.field1623];
        this.field1630 = new int[this.field1623];
        this.field1624 = new int[this.field1623];
        this.field1648 = new int[this.field1623];
        this.field1626 = new int[this.field1640];
        this.field1627 = new int[this.field1640];
        this.field1663 = new int[this.field1640];
        if (var3) {
            this.field1629 = new byte[this.field1640];
        }
        if (var4) {
            this.field1661 = new byte[this.field1640];
        }
        if (var5) {
            this.field1642 = new byte[this.field1640];
        }
        if (var6) {
            this.field1649 = new int[this.field1640];
        }
        if (var7) {
            this.field1634 = new short[this.field1640];
        }
        if (var8) {
            this.field1622 = new byte[this.field1640];
        }
        this.field1633 = new short[this.field1640];
        if (this.field1643 > 0) {
            this.field1645 = new byte[this.field1643];
            this.field1638 = new short[this.field1643];
            this.field1625 = new short[this.field1643];
            this.field1657 = new short[this.field1643];
            this.field1641 = new short[this.field1643];
            this.field1631 = new short[this.field1643];
            this.field1667 = new short[this.field1643];
            this.field1644 = new short[this.field1643];
            this.field1647 = new byte[this.field1643];
            this.field1665 = new short[this.field1643];
            this.field1637 = new short[this.field1643];
        }
        this.field1623 = 0;
        this.field1640 = 0;
        this.field1643 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class95 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1640; var13++) {
                    if (var3 && var12.field1629 != null) {
                        this.field1629[this.field1640] = var12.field1629[var13];
                    }
                    if (var4) {
                        if (var12.field1661 == null) {
                            this.field1661[this.field1640] = var12.field1635;
                        } else {
                            this.field1661[this.field1640] = var12.field1661[var13];
                        }
                    }
                    if (var5 && var12.field1642 != null) {
                        this.field1642[this.field1640] = var12.field1642[var13];
                    }
                    if (var6 && var12.field1649 != null) {
                        this.field1649[this.field1640] = var12.field1649[var13];
                    }
                    if (var7) {
                        if (var12.field1634 == null) {
                            this.field1634[this.field1640] = -1;
                        } else {
                            this.field1634[this.field1640] = var12.field1634[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1622 == null || var12.field1622[var13] == -1) {
                            this.field1622[this.field1640] = -1;
                        } else {
                            this.field1622[this.field1640] = (byte) (var12.field1622[var13] + this.field1643);
                        }
                    }
                    this.field1633[this.field1640] = var12.field1633[var13];
                    this.field1626[this.field1640] = this.method2027(var12, var12.field1626[var13]);
                    this.field1627[this.field1640] = this.method2027(var12, var12.field1627[var13]);
                    this.field1663[this.field1640] = this.method2027(var12, var12.field1663[var13]);
                    this.field1640++;
                }
                for (int var14 = 0; var14 < var12.field1643; var14++) {
                    byte var15 = this.field1645[this.field1643] = var12.field1645[var14];
                    if (var15 == 0) {
                        this.field1638[this.field1643] = (short) this.method2027(var12, var12.field1638[var14]);
                        this.field1625[this.field1643] = (short) this.method2027(var12, var12.field1625[var14]);
                        this.field1657[this.field1643] = (short) this.method2027(var12, var12.field1657[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1638[this.field1643] = var12.field1638[var14];
                        this.field1625[this.field1643] = var12.field1625[var14];
                        this.field1657[this.field1643] = var12.field1657[var14];
                        this.field1641[this.field1643] = var12.field1641[var14];
                        this.field1631[this.field1643] = var12.field1631[var14];
                        this.field1667[this.field1643] = var12.field1667[var14];
                        this.field1644[this.field1643] = var12.field1644[var14];
                        this.field1647[this.field1643] = var12.field1647[var14];
                        this.field1665[this.field1643] = var12.field1665[var14];
                    }
                    if (var15 == 2) {
                        this.field1637[this.field1643] = var12.field1637[var14];
                    }
                    this.field1643++;
                }
            }
        }
    }

    @ObfuscatedName("cy.e(Lcy;I)I")
    public final int method2027(class95 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1628[arg1];
        int var5 = arg0.field1630[arg1];
        int var6 = arg0.field1624[arg1];
        for (int var7 = 0; var7 < this.field1623; var7++) {
            if (this.field1628[var7] == var4 && this.field1630[var7] == var5 && this.field1624[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1628[this.field1623] = var4;
            this.field1630[this.field1623] = var5;
            this.field1624[this.field1623] = var6;
            if (arg0.field1648 != null) {
                this.field1648[this.field1623] = arg0.field1648[arg1];
            }
            var3 = this.field1623++;
        }
        return var3;
    }

    public class95(class95 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1623 = arg0.field1623;
        this.field1640 = arg0.field1640;
        this.field1643 = arg0.field1643;
        if (arg1) {
            this.field1628 = arg0.field1628;
            this.field1630 = arg0.field1630;
            this.field1624 = arg0.field1624;
        } else {
            this.field1628 = new int[this.field1623];
            this.field1630 = new int[this.field1623];
            this.field1624 = new int[this.field1623];
            for (int var6 = 0; var6 < this.field1623; var6++) {
                this.field1628[var6] = arg0.field1628[var6];
                this.field1630[var6] = arg0.field1630[var6];
                this.field1624[var6] = arg0.field1624[var6];
            }
        }
        if (arg2) {
            this.field1633 = arg0.field1633;
        } else {
            this.field1633 = new short[this.field1640];
            for (int var7 = 0; var7 < this.field1640; var7++) {
                this.field1633[var7] = arg0.field1633[var7];
            }
        }
        if (arg3 || arg0.field1634 == null) {
            this.field1634 = arg0.field1634;
        } else {
            this.field1634 = new short[this.field1640];
            for (int var8 = 0; var8 < this.field1640; var8++) {
                this.field1634[var8] = arg0.field1634[var8];
            }
        }
        if (arg4) {
            this.field1642 = arg0.field1642;
        } else {
            this.field1642 = new byte[this.field1640];
            if (arg0.field1642 == null) {
                for (int var9 = 0; var9 < this.field1640; var9++) {
                    this.field1642[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1640; var10++) {
                    this.field1642[var10] = arg0.field1642[var10];
                }
            }
        }
        this.field1626 = arg0.field1626;
        this.field1627 = arg0.field1627;
        this.field1663 = arg0.field1663;
        this.field1629 = arg0.field1629;
        this.field1661 = arg0.field1661;
        this.field1622 = arg0.field1622;
        this.field1635 = arg0.field1635;
        this.field1645 = arg0.field1645;
        this.field1638 = arg0.field1638;
        this.field1625 = arg0.field1625;
        this.field1657 = arg0.field1657;
        this.field1641 = arg0.field1641;
        this.field1631 = arg0.field1631;
        this.field1667 = arg0.field1667;
        this.field1644 = arg0.field1644;
        this.field1647 = arg0.field1647;
        this.field1665 = arg0.field1665;
        this.field1637 = arg0.field1637;
        this.field1648 = arg0.field1648;
        this.field1649 = arg0.field1649;
        this.field1650 = arg0.field1650;
        this.field1651 = arg0.field1651;
        this.field1653 = arg0.field1653;
        this.field1652 = arg0.field1652;
        this.field1654 = arg0.field1654;
        this.field1655 = arg0.field1655;
        this.field1656 = arg0.field1656;
    }

    @ObfuscatedName("cy.m()Lcy;")
    public class95 method1974() {
        class95 var1 = new class95();
        if (this.field1629 != null) {
            var1.field1629 = new byte[this.field1640];
            for (int var2 = 0; var2 < this.field1640; var2++) {
                var1.field1629[var2] = this.field1629[var2];
            }
        }
        var1.field1623 = this.field1623;
        var1.field1640 = this.field1640;
        var1.field1643 = this.field1643;
        var1.field1628 = this.field1628;
        var1.field1630 = this.field1630;
        var1.field1624 = this.field1624;
        var1.field1626 = this.field1626;
        var1.field1627 = this.field1627;
        var1.field1663 = this.field1663;
        var1.field1661 = this.field1661;
        var1.field1642 = this.field1642;
        var1.field1622 = this.field1622;
        var1.field1633 = this.field1633;
        var1.field1634 = this.field1634;
        var1.field1635 = this.field1635;
        var1.field1645 = this.field1645;
        var1.field1638 = this.field1638;
        var1.field1625 = this.field1625;
        var1.field1657 = this.field1657;
        var1.field1641 = this.field1641;
        var1.field1631 = this.field1631;
        var1.field1667 = this.field1667;
        var1.field1644 = this.field1644;
        var1.field1647 = this.field1647;
        var1.field1665 = this.field1665;
        var1.field1637 = this.field1637;
        var1.field1648 = this.field1648;
        var1.field1649 = this.field1649;
        var1.field1650 = this.field1650;
        var1.field1651 = this.field1651;
        var1.field1653 = this.field1653;
        var1.field1652 = this.field1652;
        var1.field1655 = this.field1655;
        var1.field1656 = this.field1656;
        return var1;
    }

    @ObfuscatedName("cy.a([[IIIIZI)Lcy;")
    public class95 method1975(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1988();
        int var7 = this.field1659 + arg1;
        int var8 = this.field1660 + arg1;
        int var9 = this.field1662 + arg3;
        int var10 = this.field1646 + arg3;
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
            var15.field1623 = this.field1623;
            var15.field1640 = this.field1640;
            var15.field1643 = this.field1643;
            var15.field1628 = this.field1628;
            var15.field1624 = this.field1624;
            var15.field1626 = this.field1626;
            var15.field1627 = this.field1627;
            var15.field1663 = this.field1663;
            var15.field1629 = this.field1629;
            var15.field1661 = this.field1661;
            var15.field1642 = this.field1642;
            var15.field1622 = this.field1622;
            var15.field1633 = this.field1633;
            var15.field1634 = this.field1634;
            var15.field1635 = this.field1635;
            var15.field1645 = this.field1645;
            var15.field1638 = this.field1638;
            var15.field1625 = this.field1625;
            var15.field1657 = this.field1657;
            var15.field1641 = this.field1641;
            var15.field1631 = this.field1631;
            var15.field1667 = this.field1667;
            var15.field1644 = this.field1644;
            var15.field1647 = this.field1647;
            var15.field1665 = this.field1665;
            var15.field1637 = this.field1637;
            var15.field1648 = this.field1648;
            var15.field1649 = this.field1649;
            var15.field1650 = this.field1650;
            var15.field1651 = this.field1651;
            var15.field1655 = this.field1655;
            var15.field1656 = this.field1656;
            var15.field1630 = new int[var15.field1623];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1623; var16++) {
                int var17 = this.field1628[var16] + arg1;
                int var18 = this.field1624[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1630[var16] = this.field1630[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1623; var26++) {
                int var27 = (-this.field1630[var26] << 16) / this.field1388;
                if (var27 < arg5) {
                    int var28 = this.field1628[var26] + arg1;
                    int var29 = this.field1624[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1630[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1630[var26];
                }
            }
        }
        var15.method1987();
        return var15;
    }

    @ObfuscatedName("cy.h()V")
    public void method2024() {
        int var10002;
        if (this.field1648 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1623; var3++) {
                int var4 = this.field1648[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1650 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1650[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1623) {
                int var7 = this.field1648[var6];
                this.field1650[var7][var1[var7]++] = var6++;
            }
            this.field1648 = null;
        }
        if (this.field1649 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1640; var10++) {
            int var11 = this.field1649[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1651 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1651[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1640) {
            int var14 = this.field1649[var13];
            this.field1651[var14][var8[var14]++] = var13++;
        }
        this.field1649 = null;
    }

    @ObfuscatedName("cy.l()V")
    public void method1977() {
        for (int var1 = 0; var1 < this.field1623; var1++) {
            int var2 = this.field1628[var1];
            this.field1628[var1] = this.field1624[var1];
            this.field1624[var1] = -var2;
        }
        this.method1987();
    }

    @ObfuscatedName("cy.u()V")
    public void method1978() {
        for (int var1 = 0; var1 < this.field1623; var1++) {
            this.field1628[var1] = -this.field1628[var1];
            this.field1624[var1] = -this.field1624[var1];
        }
        this.method1987();
    }

    @ObfuscatedName("cy.q()V")
    public void method1979() {
        for (int var1 = 0; var1 < this.field1623; var1++) {
            int var2 = this.field1624[var1];
            this.field1624[var1] = this.field1628[var1];
            this.field1628[var1] = -var2;
        }
        this.method1987();
    }

    @ObfuscatedName("cy.k(I)V")
    public void method1973(int arg0) {
        int var2 = field1666[arg0];
        int var3 = field1632[arg0];
        for (int var4 = 0; var4 < this.field1623; var4++) {
            int var5 = this.field1628[var4] * var3 + this.field1624[var4] * var2 >> 16;
            this.field1624[var4] = this.field1624[var4] * var3 - this.field1628[var4] * var2 >> 16;
            this.field1628[var4] = var5;
        }
        this.method1987();
    }

    @ObfuscatedName("cy.x(III)V")
    public void method1981(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1623; var4++) {
            this.field1628[var4] += arg0;
            this.field1630[var4] += arg1;
            this.field1624[var4] += arg2;
        }
        this.method1987();
    }

    @ObfuscatedName("cy.r(SS)V")
    public void method2001(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1640; var3++) {
            if (this.field1633[var3] == arg0) {
                this.field1633[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cy.j(SS)V")
    public void method2000(short arg0, short arg1) {
        if (this.field1634 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1640; var3++) {
            if (this.field1634[var3] == arg0) {
                this.field1634[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cy.s()V")
    public void method2026() {
        for (int var1 = 0; var1 < this.field1623; var1++) {
            this.field1624[var1] = -this.field1624[var1];
        }
        for (int var2 = 0; var2 < this.field1640; var2++) {
            int var3 = this.field1626[var2];
            this.field1626[var2] = this.field1663[var2];
            this.field1663[var2] = var3;
        }
        this.method1987();
    }

    @ObfuscatedName("cy.v(III)V")
    public void method1985(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1623; var4++) {
            this.field1628[var4] = this.field1628[var4] * arg0 / 128;
            this.field1630[var4] = this.field1630[var4] * arg1 / 128;
            this.field1624[var4] = this.field1624[var4] * arg2 / 128;
        }
        this.method1987();
    }

    @ObfuscatedName("cy.c()V")
    public void method1986() {
        if (this.field1653 != null) {
            return;
        }
        this.field1653 = new class91[this.field1623];
        for (int var1 = 0; var1 < this.field1623; var1++) {
            this.field1653[var1] = new class91();
        }
        for (int var2 = 0; var2 < this.field1640; var2++) {
            int var3 = this.field1626[var2];
            int var4 = this.field1627[var2];
            int var5 = this.field1663[var2];
            int var6 = this.field1628[var4] - this.field1628[var3];
            int var7 = this.field1630[var4] - this.field1630[var3];
            int var8 = this.field1624[var4] - this.field1624[var3];
            int var9 = this.field1628[var5] - this.field1628[var3];
            int var10 = this.field1630[var5] - this.field1630[var3];
            int var11 = this.field1624[var5] - this.field1624[var3];
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
            if (this.field1629 == null) {
                var19 = 0;
            } else {
                var19 = this.field1629[var2];
            }
            if (var19 == 0) {
                class91 var20 = this.field1653[var3];
                var20.field1564 += var16;
                var20.field1563 += var17;
                var20.field1557 += var18;
                var20.field1558++;
                class91 var21 = this.field1653[var4];
                var21.field1564 += var16;
                var21.field1563 += var17;
                var21.field1557 += var18;
                var21.field1558++;
                class91 var22 = this.field1653[var5];
                var22.field1564 += var16;
                var22.field1563 += var17;
                var22.field1557 += var18;
                var22.field1558++;
            } else if (var19 == 1) {
                if (this.field1652 == null) {
                    this.field1652 = new class79[this.field1640];
                }
                class79 var23 = this.field1652[var2] = new class79();
                var23.field1378 = var16;
                var23.field1379 = var17;
                var23.field1380 = var18;
            }
        }
    }

    @ObfuscatedName("cy.p()V")
    public void method1987() {
        this.field1653 = null;
        this.field1654 = null;
        this.field1652 = null;
        this.field1621 = false;
    }

    @ObfuscatedName("cy.w()V")
    public void method1988() {
        if (this.field1621) {
            return;
        }
        this.field1388 = 0;
        this.field1658 = 0;
        this.field1659 = 999999;
        this.field1660 = -999999;
        this.field1646 = -99999;
        this.field1662 = 99999;
        for (int var1 = 0; var1 < this.field1623; var1++) {
            int var2 = this.field1628[var1];
            int var3 = this.field1630[var1];
            int var4 = this.field1624[var1];
            if (var2 < this.field1659) {
                this.field1659 = var2;
            }
            if (var2 > this.field1660) {
                this.field1660 = var2;
            }
            if (var4 < this.field1662) {
                this.field1662 = var4;
            }
            if (var4 > this.field1646) {
                this.field1646 = var4;
            }
            if (-var3 > this.field1388) {
                this.field1388 = -var3;
            }
            if (var3 > this.field1658) {
                this.field1658 = var3;
            }
        }
        this.field1621 = true;
    }

    @ObfuscatedName("cy.i(Lcy;Lcy;IIIZ)V")
    public static void method1989(class95 arg0, class95 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1988();
        arg0.method1986();
        arg1.method1988();
        arg1.method1986();
        field1639++;
        int var6 = 0;
        int[] var7 = arg1.field1628;
        int var8 = arg1.field1623;
        for (int var9 = 0; var9 < arg0.field1623; var9++) {
            class91 var10 = arg0.field1653[var9];
            if (var10.field1558 != 0) {
                int var11 = arg0.field1630[var9] - arg3;
                if (var11 <= arg1.field1658) {
                    int var12 = arg0.field1628[var9] - arg2;
                    if (var12 >= arg1.field1659 && var12 <= arg1.field1660) {
                        int var13 = arg0.field1624[var9] - arg4;
                        if (var13 >= arg1.field1662 && var13 <= arg1.field1646) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class91 var15 = arg1.field1653[var14];
                                if (var7[var14] == var12 && arg1.field1624[var14] == var13 && arg1.field1630[var14] == var11 && var15.field1558 != 0) {
                                    if (arg0.field1654 == null) {
                                        arg0.field1654 = new class91[arg0.field1623];
                                    }
                                    if (arg1.field1654 == null) {
                                        arg1.field1654 = new class91[var8];
                                    }
                                    class91 var16 = arg0.field1654[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1654[var9] = new class91(var10);
                                    }
                                    class91 var17 = arg1.field1654[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1654[var14] = new class91(var15);
                                    }
                                    var16.field1564 += var15.field1564;
                                    var16.field1563 += var15.field1563;
                                    var16.field1557 += var15.field1557;
                                    var16.field1558 += var15.field1558;
                                    var17.field1564 += var10.field1564;
                                    var17.field1563 += var10.field1563;
                                    var17.field1557 += var10.field1557;
                                    var17.field1558 += var10.field1558;
                                    var6++;
                                    field1636[var9] = field1639;
                                    field1664[var14] = field1639;
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
        for (int var18 = 0; var18 < arg0.field1640; var18++) {
            if (field1636[arg0.field1626[var18]] == field1639 && field1636[arg0.field1627[var18]] == field1639 && field1636[arg0.field1663[var18]] == field1639) {
                if (arg0.field1629 == null) {
                    arg0.field1629 = new byte[arg0.field1640];
                }
                arg0.field1629[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1640; var19++) {
            if (field1664[arg1.field1626[var19]] == field1639 && field1664[arg1.field1627[var19]] == field1639 && field1664[arg1.field1663[var19]] == field1639) {
                if (arg1.field1629 == null) {
                    arg1.field1629 = new byte[arg1.field1640];
                }
                arg1.field1629[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cy.ad(IIIII)Lcg;")
    public final class100 method1994(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1986();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class100 var8 = new class100();
        var8.field1748 = new int[this.field1640];
        var8.field1763 = new int[this.field1640];
        var8.field1749 = new int[this.field1640];
        if (this.field1643 > 0 && this.field1622 != null) {
            int[] var9 = new int[this.field1643];
            for (int var10 = 0; var10 < this.field1640; var10++) {
                if (this.field1622[var10] != -1) {
                    var9[this.field1622[var10] & 0xFF]++;
                }
            }
            var8.field1770 = 0;
            for (int var11 = 0; var11 < this.field1643; var11++) {
                if (var9[var11] > 0 && this.field1645[var11] == 0) {
                    var8.field1770++;
                }
            }
            var8.field1769 = new int[var8.field1770];
            var8.field1757 = new int[var8.field1770];
            var8.field1735 = new int[var8.field1770];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1643; var13++) {
                if (var9[var13] > 0 && this.field1645[var13] == 0) {
                    var8.field1769[var12] = this.field1638[var13] & 0xFFFF;
                    var8.field1757[var12] = this.field1625[var13] & 0xFFFF;
                    var8.field1735[var12] = this.field1657[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1785 = new byte[this.field1640];
            for (int var14 = 0; var14 < this.field1640; var14++) {
                if (this.field1622[var14] == -1) {
                    var8.field1785[var14] = -1;
                } else {
                    var8.field1785[var14] = (byte) var9[this.field1622[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1640; var15++) {
            byte var16;
            if (this.field1629 == null) {
                var16 = 0;
            } else {
                var16 = this.field1629[var15];
            }
            byte var17;
            if (this.field1642 == null) {
                var17 = 0;
            } else {
                var17 = this.field1642[var15];
            }
            short var18;
            if (this.field1634 == null) {
                var18 = -1;
            } else {
                var18 = this.field1634[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1633[var15] & 0xFFFF;
                    class91 var20;
                    if (this.field1654 == null || this.field1654[this.field1626[var15]] == null) {
                        var20 = this.field1653[this.field1626[var15]];
                    } else {
                        var20 = this.field1654[this.field1626[var15]];
                    }
                    int var21 = (var20.field1557 * arg4 + var20.field1564 * arg2 + var20.field1563 * arg3) / (var20.field1558 * var7) + arg0;
                    var8.field1748[var15] = method2022(var19, var21);
                    class91 var22;
                    if (this.field1654 == null || this.field1654[this.field1627[var15]] == null) {
                        var22 = this.field1653[this.field1627[var15]];
                    } else {
                        var22 = this.field1654[this.field1627[var15]];
                    }
                    int var23 = (var22.field1557 * arg4 + var22.field1564 * arg2 + var22.field1563 * arg3) / (var22.field1558 * var7) + arg0;
                    var8.field1763[var15] = method2022(var19, var23);
                    class91 var24;
                    if (this.field1654 == null || this.field1654[this.field1663[var15]] == null) {
                        var24 = this.field1653[this.field1663[var15]];
                    } else {
                        var24 = this.field1654[this.field1663[var15]];
                    }
                    int var25 = (var24.field1557 * arg4 + var24.field1564 * arg2 + var24.field1563 * arg3) / (var24.field1558 * var7) + arg0;
                    var8.field1749[var15] = method2022(var19, var25);
                } else if (var16 == 1) {
                    class79 var26 = this.field1652[var15];
                    int var27 = (var26.field1380 * arg4 + var26.field1379 * arg3 + var26.field1378 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1748[var15] = method2022(this.field1633[var15] & 0xFFFF, var27);
                    var8.field1749[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1748[var15] = 128;
                    var8.field1749[var15] = -1;
                } else {
                    var8.field1749[var15] = -2;
                }
            } else if (var16 == 0) {
                class91 var28;
                if (this.field1654 == null || this.field1654[this.field1626[var15]] == null) {
                    var28 = this.field1653[this.field1626[var15]];
                } else {
                    var28 = this.field1654[this.field1626[var15]];
                }
                int var29 = (var28.field1557 * arg4 + var28.field1564 * arg2 + var28.field1563 * arg3) / (var28.field1558 * var7) + arg0;
                var8.field1748[var15] = method1992(var29);
                class91 var30;
                if (this.field1654 == null || this.field1654[this.field1627[var15]] == null) {
                    var30 = this.field1653[this.field1627[var15]];
                } else {
                    var30 = this.field1654[this.field1627[var15]];
                }
                int var31 = (var30.field1557 * arg4 + var30.field1564 * arg2 + var30.field1563 * arg3) / (var30.field1558 * var7) + arg0;
                var8.field1763[var15] = method1992(var31);
                class91 var32;
                if (this.field1654 == null || this.field1654[this.field1663[var15]] == null) {
                    var32 = this.field1653[this.field1663[var15]];
                } else {
                    var32 = this.field1654[this.field1663[var15]];
                }
                int var33 = (var32.field1557 * arg4 + var32.field1564 * arg2 + var32.field1563 * arg3) / (var32.field1558 * var7) + arg0;
                var8.field1749[var15] = method1992(var33);
            } else if (var16 == 1) {
                class79 var34 = this.field1652[var15];
                int var35 = (var34.field1380 * arg4 + var34.field1379 * arg3 + var34.field1378 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1748[var15] = method1992(var35);
                var8.field1749[var15] = -1;
            } else {
                var8.field1749[var15] = -2;
            }
        }
        this.method2024();
        var8.field1739 = this.field1623;
        var8.field1740 = this.field1628;
        var8.field1776 = this.field1630;
        var8.field1737 = this.field1624;
        var8.field1743 = this.field1640;
        var8.field1744 = this.field1626;
        var8.field1745 = this.field1627;
        var8.field1746 = this.field1663;
        var8.field1750 = this.field1661;
        var8.field1780 = this.field1642;
        var8.field1754 = this.field1635;
        var8.field1759 = this.field1650;
        var8.field1760 = this.field1651;
        var8.field1761 = this.field1634;
        return var8;
    }

    @ObfuscatedName("cy.ak(II)I")
    public static final int method2022(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cy.ae(I)I")
    public static final int method1992(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
