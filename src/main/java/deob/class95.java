package deob;

@ObfuscatedName("cv")
public class class95 extends class80 {

    @ObfuscatedName("cv.p")
    public int field1662 = 0;

    @ObfuscatedName("cv.k")
    public int[] field1626;

    @ObfuscatedName("cv.e")
    public int[] field1637;

    @ObfuscatedName("cv.f")
    public int[] field1628;

    @ObfuscatedName("cv.w")
    public int field1629 = 0;

    @ObfuscatedName("cv.t")
    public int[] field1630;

    @ObfuscatedName("cv.s")
    public int[] field1666;

    @ObfuscatedName("cv.c")
    public int[] field1632;

    @ObfuscatedName("cv.d")
    public byte[] field1650;

    @ObfuscatedName("cv.v")
    public byte[] field1634;

    @ObfuscatedName("cv.m")
    public byte[] field1635;

    @ObfuscatedName("cv.h")
    public byte[] field1636;

    @ObfuscatedName("cv.n")
    public short[] field1640;

    @ObfuscatedName("cv.x")
    public short[] field1638;

    @ObfuscatedName("cv.o")
    public byte field1639 = 0;

    @ObfuscatedName("cv.r")
    public int field1658;

    @ObfuscatedName("cv.y")
    public byte[] field1645;

    @ObfuscatedName("cv.i")
    public short[] field1642;

    @ObfuscatedName("cv.q")
    public short[] field1643;

    @ObfuscatedName("cv.g")
    public short[] field1644;

    @ObfuscatedName("cv.l")
    public short[] field1671;

    @ObfuscatedName("cv.u")
    public short[] field1646;

    @ObfuscatedName("cv.j")
    public short[] field1647;

    @ObfuscatedName("cv.z")
    public short[] field1648;

    @ObfuscatedName("cv.b")
    public short[] field1649;

    @ObfuscatedName("cv.a")
    public short[] field1653;

    @ObfuscatedName("cv.ag")
    public byte[] field1651;

    @ObfuscatedName("cv.am")
    public int[] field1652;

    @ObfuscatedName("cv.aa")
    public int[] field1633;

    @ObfuscatedName("cv.az")
    public int[][] field1654;

    @ObfuscatedName("cv.aq")
    public int[][] field1655;

    @ObfuscatedName("cv.ak")
    public class79[] field1656;

    @ObfuscatedName("cv.ar")
    public class91[] field1657;

    @ObfuscatedName("cv.al")
    public class91[] field1664;

    @ObfuscatedName("cv.au")
    public short field1641;

    @ObfuscatedName("cv.ao")
    public short field1660;

    @ObfuscatedName("cv.af")
    public boolean field1661 = false;

    @ObfuscatedName("cv.ai")
    public int field1670;

    @ObfuscatedName("cv.aj")
    public int field1663;

    @ObfuscatedName("cv.aw")
    public int field1627;

    @ObfuscatedName("cv.ab")
    public int field1665;

    @ObfuscatedName("cv.ad")
    public int field1631;

    @ObfuscatedName("cv.ae")
    public static int[] field1667 = new int[10000];

    @ObfuscatedName("cv.ay")
    public static int[] field1668 = new int[10000];

    @ObfuscatedName("cv.ap")
    public static int field1669 = 0;

    @ObfuscatedName("cv.av")
    public static int[] field1625 = class86.field1519;

    @ObfuscatedName("cv.ah")
    public static int[] field1659 = class86.field1516;

    public class95() {
    }

    @ObfuscatedName("cv.p(Lff;II)Lcv;")
    public static class95 method1916(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2896(arg1, arg2);
        return var3 == null ? null : new class95(var3);
    }

    public class95(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1917(arg0);
        } else {
            this.method1918(arg0);
        }
    }

    @ObfuscatedName("cv.e([B)V")
    public void method1917(byte[] arg0) {
        class111 var2 = new class111(arg0);
        class111 var3 = new class111(arg0);
        class111 var4 = new class111(arg0);
        class111 var5 = new class111(arg0);
        class111 var6 = new class111(arg0);
        class111 var7 = new class111(arg0);
        class111 var8 = new class111(arg0);
        var2.field1885 = arg0.length - 23;
        int var9 = var2.method2177();
        int var10 = var2.method2177();
        int var11 = var2.method2314();
        int var12 = var2.method2314();
        int var13 = var2.method2314();
        int var14 = var2.method2314();
        int var15 = var2.method2314();
        int var16 = var2.method2314();
        int var17 = var2.method2314();
        int var18 = var2.method2177();
        int var19 = var2.method2177();
        int var20 = var2.method2177();
        int var21 = var2.method2177();
        int var22 = var2.method2177();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1645 = new byte[var11];
            var2.field1885 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1645[var26] = var2.method2176();
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
        this.field1662 = var9;
        this.field1629 = var10;
        this.field1658 = var11;
        this.field1626 = new int[var9];
        this.field1637 = new int[var9];
        this.field1628 = new int[var9];
        this.field1630 = new int[var10];
        this.field1666 = new int[var10];
        this.field1632 = new int[var10];
        if (var17 == 1) {
            this.field1652 = new int[var9];
        }
        if (var12 == 1) {
            this.field1650 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1634 = new byte[var10];
        } else {
            this.field1639 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1635 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1633 = new int[var10];
        }
        if (var16 == 1) {
            this.field1638 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1636 = new byte[var10];
        }
        this.field1640 = new short[var10];
        if (var11 > 0) {
            this.field1642 = new short[var11];
            this.field1643 = new short[var11];
            this.field1644 = new short[var11];
            if (var24 > 0) {
                this.field1671 = new short[var24];
                this.field1646 = new short[var24];
                this.field1647 = new short[var24];
                this.field1648 = new short[var24];
                this.field1651 = new byte[var24];
                this.field1649 = new short[var24];
            }
            if (var25 > 0) {
                this.field1653 = new short[var25];
            }
        }
        var2.field1885 = var11;
        var3.field1885 = var44;
        var4.field1885 = var46;
        var5.field1885 = var48;
        var6.field1885 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2314();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2183();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2183();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2183();
            }
            this.field1626[var67] = var64 + var69;
            this.field1637[var67] = var65 + var70;
            this.field1628[var67] = var66 + var71;
            var64 = this.field1626[var67];
            var65 = this.field1637[var67];
            var66 = this.field1628[var67];
            if (var17 == 1) {
                this.field1652[var67] = var6.method2314();
            }
        }
        var2.field1885 = var42;
        var3.field1885 = var31;
        var4.field1885 = var34;
        var5.field1885 = var37;
        var6.field1885 = var35;
        var7.field1885 = var40;
        var8.field1885 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1640[var72] = (short) var2.method2177();
            if (var12 == 1) {
                this.field1650[var72] = var3.method2176();
            }
            if (var13 == 255) {
                this.field1634[var72] = var4.method2176();
            }
            if (var14 == 1) {
                this.field1635[var72] = var5.method2176();
            }
            if (var15 == 1) {
                this.field1633[var72] = var6.method2314();
            }
            if (var16 == 1) {
                this.field1638[var72] = (short) (var7.method2177() - 1);
            }
            if (this.field1636 != null && this.field1638[var72] != -1) {
                this.field1636[var72] = (byte) (var8.method2314() - 1);
            }
        }
        var2.field1885 = var33;
        var3.field1885 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2314();
            if (var78 == 1) {
                var73 = var2.method2183() + var76;
                var74 = var2.method2183() + var73;
                var75 = var2.method2183() + var74;
                var76 = var75;
                this.field1630[var77] = var73;
                this.field1666[var77] = var74;
                this.field1632[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2183() + var76;
                var76 = var75;
                this.field1630[var77] = var73;
                this.field1666[var77] = var74;
                this.field1632[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2183() + var76;
                var76 = var75;
                this.field1630[var77] = var73;
                this.field1666[var77] = var74;
                this.field1632[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2183() + var76;
                var76 = var75;
                this.field1630[var77] = var73;
                this.field1666[var77] = var81;
                this.field1632[var77] = var75;
            }
        }
        var2.field1885 = var50;
        var3.field1885 = var52;
        var4.field1885 = var54;
        var5.field1885 = var56;
        var6.field1885 = var58;
        var7.field1885 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1645[var82] & 0xFF;
            if (var83 == 0) {
                this.field1642[var82] = (short) var2.method2177();
                this.field1643[var82] = (short) var2.method2177();
                this.field1644[var82] = (short) var2.method2177();
            }
            if (var83 == 1) {
                this.field1642[var82] = (short) var3.method2177();
                this.field1643[var82] = (short) var3.method2177();
                this.field1644[var82] = (short) var3.method2177();
                this.field1671[var82] = (short) var4.method2177();
                this.field1646[var82] = (short) var4.method2177();
                this.field1647[var82] = (short) var4.method2177();
                this.field1648[var82] = (short) var5.method2177();
                this.field1651[var82] = var6.method2176();
                this.field1649[var82] = (short) var7.method2177();
            }
            if (var83 == 2) {
                this.field1642[var82] = (short) var3.method2177();
                this.field1643[var82] = (short) var3.method2177();
                this.field1644[var82] = (short) var3.method2177();
                this.field1671[var82] = (short) var4.method2177();
                this.field1646[var82] = (short) var4.method2177();
                this.field1647[var82] = (short) var4.method2177();
                this.field1648[var82] = (short) var5.method2177();
                this.field1651[var82] = var6.method2176();
                this.field1649[var82] = (short) var7.method2177();
                this.field1653[var82] = (short) var7.method2177();
            }
            if (var83 == 3) {
                this.field1642[var82] = (short) var3.method2177();
                this.field1643[var82] = (short) var3.method2177();
                this.field1644[var82] = (short) var3.method2177();
                this.field1671[var82] = (short) var4.method2177();
                this.field1646[var82] = (short) var4.method2177();
                this.field1647[var82] = (short) var4.method2177();
                this.field1648[var82] = (short) var5.method2177();
                this.field1651[var82] = var6.method2176();
                this.field1649[var82] = (short) var7.method2177();
            }
        }
        var2.field1885 = var62;
        int var84 = var2.method2314();
        if (var84 == 0) {
            return;
        }
        new class85();
        var2.method2177();
        var2.method2177();
        var2.method2177();
        var2.method2350();
    }

    @ObfuscatedName("cv.f([B)V")
    public void method1918(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class111 var4 = new class111(arg0);
        class111 var5 = new class111(arg0);
        class111 var6 = new class111(arg0);
        class111 var7 = new class111(arg0);
        class111 var8 = new class111(arg0);
        var4.field1885 = arg0.length - 18;
        int var9 = var4.method2177();
        int var10 = var4.method2177();
        int var11 = var4.method2314();
        int var12 = var4.method2314();
        int var13 = var4.method2314();
        int var14 = var4.method2314();
        int var15 = var4.method2314();
        int var16 = var4.method2314();
        int var17 = var4.method2177();
        int var18 = var4.method2177();
        int var19 = var4.method2177();
        int var20 = var4.method2177();
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
        this.field1662 = var9;
        this.field1629 = var10;
        this.field1658 = var11;
        this.field1626 = new int[var9];
        this.field1637 = new int[var9];
        this.field1628 = new int[var9];
        this.field1630 = new int[var10];
        this.field1666 = new int[var10];
        this.field1632 = new int[var10];
        if (var11 > 0) {
            this.field1645 = new byte[var11];
            this.field1642 = new short[var11];
            this.field1643 = new short[var11];
            this.field1644 = new short[var11];
        }
        if (var16 == 1) {
            this.field1652 = new int[var9];
        }
        if (var12 == 1) {
            this.field1650 = new byte[var10];
            this.field1636 = new byte[var10];
            this.field1638 = new short[var10];
        }
        if (var13 == 255) {
            this.field1634 = new byte[var10];
        } else {
            this.field1639 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1635 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1633 = new int[var10];
        }
        this.field1640 = new short[var10];
        var4.field1885 = var21;
        var5.field1885 = var36;
        var6.field1885 = var38;
        var7.field1885 = var40;
        var8.field1885 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2314();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2183();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2183();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2183();
            }
            this.field1626[var46] = var43 + var48;
            this.field1637[var46] = var44 + var49;
            this.field1628[var46] = var45 + var50;
            var43 = this.field1626[var46];
            var44 = this.field1637[var46];
            var45 = this.field1628[var46];
            if (var16 == 1) {
                this.field1652[var46] = var8.method2314();
            }
        }
        var4.field1885 = var32;
        var5.field1885 = var28;
        var6.field1885 = var26;
        var7.field1885 = var30;
        var8.field1885 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1640[var51] = (short) var4.method2177();
            if (var12 == 1) {
                int var52 = var5.method2314();
                if ((var52 & 0x1) == 1) {
                    this.field1650[var51] = 1;
                    var2 = true;
                } else {
                    this.field1650[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1636[var51] = (byte) (var52 >> 2);
                    this.field1638[var51] = this.field1640[var51];
                    this.field1640[var51] = 127;
                    if (this.field1638[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1636[var51] = -1;
                    this.field1638[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1634[var51] = var6.method2176();
            }
            if (var14 == 1) {
                this.field1635[var51] = var7.method2176();
            }
            if (var15 == 1) {
                this.field1633[var51] = var8.method2314();
            }
        }
        var4.field1885 = var25;
        var5.field1885 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2314();
            if (var58 == 1) {
                var53 = var4.method2183() + var56;
                var54 = var4.method2183() + var53;
                var55 = var4.method2183() + var54;
                var56 = var55;
                this.field1630[var57] = var53;
                this.field1666[var57] = var54;
                this.field1632[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2183() + var56;
                var56 = var55;
                this.field1630[var57] = var53;
                this.field1666[var57] = var54;
                this.field1632[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2183() + var56;
                var56 = var55;
                this.field1630[var57] = var53;
                this.field1666[var57] = var54;
                this.field1632[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2183() + var56;
                var56 = var55;
                this.field1630[var57] = var53;
                this.field1666[var57] = var61;
                this.field1632[var57] = var55;
            }
        }
        var4.field1885 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1645[var62] = 0;
            this.field1642[var62] = (short) var4.method2177();
            this.field1643[var62] = (short) var4.method2177();
            this.field1644[var62] = (short) var4.method2177();
        }
        if (this.field1636 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1636[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1642[var65] & 0xFFFF) == this.field1630[var64] && (this.field1643[var65] & 0xFFFF) == this.field1666[var64] && (this.field1644[var65] & 0xFFFF) == this.field1632[var64]) {
                        this.field1636[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1636 = null;
            }
        }
        if (!var3) {
            this.field1638 = null;
        }
        if (!var2) {
            this.field1650 = null;
        }
    }

    public class95(class95[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1662 = 0;
        this.field1629 = 0;
        this.field1658 = 0;
        this.field1639 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class95 var10 = arg0[var9];
            if (var10 != null) {
                this.field1662 += var10.field1662;
                this.field1629 += var10.field1629;
                this.field1658 += var10.field1658;
                if (var10.field1634 == null) {
                    if (this.field1639 == -1) {
                        this.field1639 = var10.field1639;
                    }
                    if (this.field1639 != var10.field1639) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1650 != null;
                var5 |= var10.field1635 != null;
                var6 |= var10.field1633 != null;
                var7 |= var10.field1638 != null;
                var8 |= var10.field1636 != null;
            }
        }
        this.field1626 = new int[this.field1662];
        this.field1637 = new int[this.field1662];
        this.field1628 = new int[this.field1662];
        this.field1652 = new int[this.field1662];
        this.field1630 = new int[this.field1629];
        this.field1666 = new int[this.field1629];
        this.field1632 = new int[this.field1629];
        if (var3) {
            this.field1650 = new byte[this.field1629];
        }
        if (var4) {
            this.field1634 = new byte[this.field1629];
        }
        if (var5) {
            this.field1635 = new byte[this.field1629];
        }
        if (var6) {
            this.field1633 = new int[this.field1629];
        }
        if (var7) {
            this.field1638 = new short[this.field1629];
        }
        if (var8) {
            this.field1636 = new byte[this.field1629];
        }
        this.field1640 = new short[this.field1629];
        if (this.field1658 > 0) {
            this.field1645 = new byte[this.field1658];
            this.field1642 = new short[this.field1658];
            this.field1643 = new short[this.field1658];
            this.field1644 = new short[this.field1658];
            this.field1671 = new short[this.field1658];
            this.field1646 = new short[this.field1658];
            this.field1647 = new short[this.field1658];
            this.field1648 = new short[this.field1658];
            this.field1651 = new byte[this.field1658];
            this.field1649 = new short[this.field1658];
            this.field1653 = new short[this.field1658];
        }
        this.field1662 = 0;
        this.field1629 = 0;
        this.field1658 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class95 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1629; var13++) {
                    if (var3 && var12.field1650 != null) {
                        this.field1650[this.field1629] = var12.field1650[var13];
                    }
                    if (var4) {
                        if (var12.field1634 == null) {
                            this.field1634[this.field1629] = var12.field1639;
                        } else {
                            this.field1634[this.field1629] = var12.field1634[var13];
                        }
                    }
                    if (var5 && var12.field1635 != null) {
                        this.field1635[this.field1629] = var12.field1635[var13];
                    }
                    if (var6 && var12.field1633 != null) {
                        this.field1633[this.field1629] = var12.field1633[var13];
                    }
                    if (var7) {
                        if (var12.field1638 == null) {
                            this.field1638[this.field1629] = -1;
                        } else {
                            this.field1638[this.field1629] = var12.field1638[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1636 == null || var12.field1636[var13] == -1) {
                            this.field1636[this.field1629] = -1;
                        } else {
                            this.field1636[this.field1629] = (byte) (var12.field1636[var13] + this.field1658);
                        }
                    }
                    this.field1640[this.field1629] = var12.field1640[var13];
                    this.field1630[this.field1629] = this.method1946(var12, var12.field1630[var13]);
                    this.field1666[this.field1629] = this.method1946(var12, var12.field1666[var13]);
                    this.field1632[this.field1629] = this.method1946(var12, var12.field1632[var13]);
                    this.field1629++;
                }
                for (int var14 = 0; var14 < var12.field1658; var14++) {
                    byte var15 = this.field1645[this.field1658] = var12.field1645[var14];
                    if (var15 == 0) {
                        this.field1642[this.field1658] = (short) this.method1946(var12, var12.field1642[var14]);
                        this.field1643[this.field1658] = (short) this.method1946(var12, var12.field1643[var14]);
                        this.field1644[this.field1658] = (short) this.method1946(var12, var12.field1644[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1642[this.field1658] = var12.field1642[var14];
                        this.field1643[this.field1658] = var12.field1643[var14];
                        this.field1644[this.field1658] = var12.field1644[var14];
                        this.field1671[this.field1658] = var12.field1671[var14];
                        this.field1646[this.field1658] = var12.field1646[var14];
                        this.field1647[this.field1658] = var12.field1647[var14];
                        this.field1648[this.field1658] = var12.field1648[var14];
                        this.field1651[this.field1658] = var12.field1651[var14];
                        this.field1649[this.field1658] = var12.field1649[var14];
                    }
                    if (var15 == 2) {
                        this.field1653[this.field1658] = var12.field1653[var14];
                    }
                    this.field1658++;
                }
            }
        }
    }

    @ObfuscatedName("cv.w(Lcv;I)I")
    public final int method1946(class95 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1626[arg1];
        int var5 = arg0.field1637[arg1];
        int var6 = arg0.field1628[arg1];
        for (int var7 = 0; var7 < this.field1662; var7++) {
            if (this.field1626[var7] == var4 && this.field1637[var7] == var5 && this.field1628[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1626[this.field1662] = var4;
            this.field1637[this.field1662] = var5;
            this.field1628[this.field1662] = var6;
            if (arg0.field1652 != null) {
                this.field1652[this.field1662] = arg0.field1652[arg1];
            }
            var3 = this.field1662++;
        }
        return var3;
    }

    public class95(class95 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1662 = arg0.field1662;
        this.field1629 = arg0.field1629;
        this.field1658 = arg0.field1658;
        if (arg1) {
            this.field1626 = arg0.field1626;
            this.field1637 = arg0.field1637;
            this.field1628 = arg0.field1628;
        } else {
            this.field1626 = new int[this.field1662];
            this.field1637 = new int[this.field1662];
            this.field1628 = new int[this.field1662];
            for (int var6 = 0; var6 < this.field1662; var6++) {
                this.field1626[var6] = arg0.field1626[var6];
                this.field1637[var6] = arg0.field1637[var6];
                this.field1628[var6] = arg0.field1628[var6];
            }
        }
        if (arg2) {
            this.field1640 = arg0.field1640;
        } else {
            this.field1640 = new short[this.field1629];
            for (int var7 = 0; var7 < this.field1629; var7++) {
                this.field1640[var7] = arg0.field1640[var7];
            }
        }
        if (arg3 || arg0.field1638 == null) {
            this.field1638 = arg0.field1638;
        } else {
            this.field1638 = new short[this.field1629];
            for (int var8 = 0; var8 < this.field1629; var8++) {
                this.field1638[var8] = arg0.field1638[var8];
            }
        }
        if (arg4) {
            this.field1635 = arg0.field1635;
        } else {
            this.field1635 = new byte[this.field1629];
            if (arg0.field1635 == null) {
                for (int var9 = 0; var9 < this.field1629; var9++) {
                    this.field1635[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1629; var10++) {
                    this.field1635[var10] = arg0.field1635[var10];
                }
            }
        }
        this.field1630 = arg0.field1630;
        this.field1666 = arg0.field1666;
        this.field1632 = arg0.field1632;
        this.field1650 = arg0.field1650;
        this.field1634 = arg0.field1634;
        this.field1636 = arg0.field1636;
        this.field1639 = arg0.field1639;
        this.field1645 = arg0.field1645;
        this.field1642 = arg0.field1642;
        this.field1643 = arg0.field1643;
        this.field1644 = arg0.field1644;
        this.field1671 = arg0.field1671;
        this.field1646 = arg0.field1646;
        this.field1647 = arg0.field1647;
        this.field1648 = arg0.field1648;
        this.field1651 = arg0.field1651;
        this.field1649 = arg0.field1649;
        this.field1653 = arg0.field1653;
        this.field1652 = arg0.field1652;
        this.field1633 = arg0.field1633;
        this.field1654 = arg0.field1654;
        this.field1655 = arg0.field1655;
        this.field1657 = arg0.field1657;
        this.field1656 = arg0.field1656;
        this.field1664 = arg0.field1664;
        this.field1641 = arg0.field1641;
        this.field1660 = arg0.field1660;
    }

    @ObfuscatedName("cv.t()Lcv;")
    public class95 method1982() {
        class95 var1 = new class95();
        if (this.field1650 != null) {
            var1.field1650 = new byte[this.field1629];
            for (int var2 = 0; var2 < this.field1629; var2++) {
                var1.field1650[var2] = this.field1650[var2];
            }
        }
        var1.field1662 = this.field1662;
        var1.field1629 = this.field1629;
        var1.field1658 = this.field1658;
        var1.field1626 = this.field1626;
        var1.field1637 = this.field1637;
        var1.field1628 = this.field1628;
        var1.field1630 = this.field1630;
        var1.field1666 = this.field1666;
        var1.field1632 = this.field1632;
        var1.field1634 = this.field1634;
        var1.field1635 = this.field1635;
        var1.field1636 = this.field1636;
        var1.field1640 = this.field1640;
        var1.field1638 = this.field1638;
        var1.field1639 = this.field1639;
        var1.field1645 = this.field1645;
        var1.field1642 = this.field1642;
        var1.field1643 = this.field1643;
        var1.field1644 = this.field1644;
        var1.field1671 = this.field1671;
        var1.field1646 = this.field1646;
        var1.field1647 = this.field1647;
        var1.field1648 = this.field1648;
        var1.field1651 = this.field1651;
        var1.field1649 = this.field1649;
        var1.field1653 = this.field1653;
        var1.field1652 = this.field1652;
        var1.field1633 = this.field1633;
        var1.field1654 = this.field1654;
        var1.field1655 = this.field1655;
        var1.field1657 = this.field1657;
        var1.field1656 = this.field1656;
        var1.field1641 = this.field1641;
        var1.field1660 = this.field1660;
        return var1;
    }

    @ObfuscatedName("cv.d([[IIIIZI)Lcv;")
    public class95 method2000(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1935();
        int var7 = this.field1663 + arg1;
        int var8 = this.field1627 + arg1;
        int var9 = this.field1631 + arg3;
        int var10 = this.field1665 + arg3;
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
            var15.field1662 = this.field1662;
            var15.field1629 = this.field1629;
            var15.field1658 = this.field1658;
            var15.field1626 = this.field1626;
            var15.field1628 = this.field1628;
            var15.field1630 = this.field1630;
            var15.field1666 = this.field1666;
            var15.field1632 = this.field1632;
            var15.field1650 = this.field1650;
            var15.field1634 = this.field1634;
            var15.field1635 = this.field1635;
            var15.field1636 = this.field1636;
            var15.field1640 = this.field1640;
            var15.field1638 = this.field1638;
            var15.field1639 = this.field1639;
            var15.field1645 = this.field1645;
            var15.field1642 = this.field1642;
            var15.field1643 = this.field1643;
            var15.field1644 = this.field1644;
            var15.field1671 = this.field1671;
            var15.field1646 = this.field1646;
            var15.field1647 = this.field1647;
            var15.field1648 = this.field1648;
            var15.field1651 = this.field1651;
            var15.field1649 = this.field1649;
            var15.field1653 = this.field1653;
            var15.field1652 = this.field1652;
            var15.field1633 = this.field1633;
            var15.field1654 = this.field1654;
            var15.field1655 = this.field1655;
            var15.field1641 = this.field1641;
            var15.field1660 = this.field1660;
            var15.field1637 = new int[var15.field1662];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1662; var16++) {
                int var17 = this.field1626[var16] + arg1;
                int var18 = this.field1628[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1637[var16] = this.field1637[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1662; var26++) {
                int var27 = (-this.field1637[var26] << 16) / this.field1390;
                if (var27 < arg5) {
                    int var28 = this.field1626[var26] + arg1;
                    int var29 = this.field1628[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1637[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1637[var26];
                }
            }
        }
        var15.method1952();
        return var15;
    }

    @ObfuscatedName("cv.v()V")
    public void method1924() {
        int var10002;
        if (this.field1652 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1662; var3++) {
                int var4 = this.field1652[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1654 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1654[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1662) {
                int var7 = this.field1652[var6];
                this.field1654[var7][var1[var7]++] = var6++;
            }
            this.field1652 = null;
        }
        if (this.field1633 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1629; var10++) {
            int var11 = this.field1633[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1655 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1655[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1629) {
            int var14 = this.field1633[var13];
            this.field1655[var14][var8[var14]++] = var13++;
        }
        this.field1633 = null;
    }

    @ObfuscatedName("cv.m()V")
    public void method1991() {
        for (int var1 = 0; var1 < this.field1662; var1++) {
            int var2 = this.field1626[var1];
            this.field1626[var1] = this.field1628[var1];
            this.field1628[var1] = -var2;
        }
        this.method1952();
    }

    @ObfuscatedName("cv.h()V")
    public void method1925() {
        for (int var1 = 0; var1 < this.field1662; var1++) {
            this.field1626[var1] = -this.field1626[var1];
            this.field1628[var1] = -this.field1628[var1];
        }
        this.method1952();
    }

    @ObfuscatedName("cv.n()V")
    public void method1944() {
        for (int var1 = 0; var1 < this.field1662; var1++) {
            int var2 = this.field1628[var1];
            this.field1628[var1] = this.field1626[var1];
            this.field1626[var1] = -var2;
        }
        this.method1952();
    }

    @ObfuscatedName("cv.x(I)V")
    public void method1927(int arg0) {
        int var2 = field1625[arg0];
        int var3 = field1659[arg0];
        for (int var4 = 0; var4 < this.field1662; var4++) {
            int var5 = this.field1628[var4] * var2 + this.field1626[var4] * var3 >> 16;
            this.field1628[var4] = this.field1628[var4] * var3 - this.field1626[var4] * var2 >> 16;
            this.field1626[var4] = var5;
        }
        this.method1952();
    }

    @ObfuscatedName("cv.o(III)V")
    public void method1928(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1662; var4++) {
            this.field1626[var4] += arg0;
            this.field1637[var4] += arg1;
            this.field1628[var4] += arg2;
        }
        this.method1952();
    }

    @ObfuscatedName("cv.r(SS)V")
    public void method1929(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1629; var3++) {
            if (this.field1640[var3] == arg0) {
                this.field1640[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cv.y(SS)V")
    public void method1930(short arg0, short arg1) {
        if (this.field1638 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1629; var3++) {
            if (this.field1638[var3] == arg0) {
                this.field1638[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cv.i()V")
    public void method1931() {
        for (int var1 = 0; var1 < this.field1662; var1++) {
            this.field1628[var1] = -this.field1628[var1];
        }
        for (int var2 = 0; var2 < this.field1629; var2++) {
            int var3 = this.field1630[var2];
            this.field1630[var2] = this.field1632[var2];
            this.field1632[var2] = var3;
        }
        this.method1952();
    }

    @ObfuscatedName("cv.q(III)V")
    public void method1932(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1662; var4++) {
            this.field1626[var4] = this.field1626[var4] * arg0 / 128;
            this.field1637[var4] = this.field1637[var4] * arg1 / 128;
            this.field1628[var4] = this.field1628[var4] * arg2 / 128;
        }
        this.method1952();
    }

    @ObfuscatedName("cv.g()V")
    public void method1933() {
        if (this.field1657 != null) {
            return;
        }
        this.field1657 = new class91[this.field1662];
        for (int var1 = 0; var1 < this.field1662; var1++) {
            this.field1657[var1] = new class91();
        }
        for (int var2 = 0; var2 < this.field1629; var2++) {
            int var3 = this.field1630[var2];
            int var4 = this.field1666[var2];
            int var5 = this.field1632[var2];
            int var6 = this.field1626[var4] - this.field1626[var3];
            int var7 = this.field1637[var4] - this.field1637[var3];
            int var8 = this.field1628[var4] - this.field1628[var3];
            int var9 = this.field1626[var5] - this.field1626[var3];
            int var10 = this.field1637[var5] - this.field1637[var3];
            int var11 = this.field1628[var5] - this.field1628[var3];
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
            if (this.field1650 == null) {
                var19 = 0;
            } else {
                var19 = this.field1650[var2];
            }
            if (var19 == 0) {
                class91 var20 = this.field1657[var3];
                var20.field1572 += var16;
                var20.field1568 += var17;
                var20.field1569 += var18;
                var20.field1570++;
                class91 var21 = this.field1657[var4];
                var21.field1572 += var16;
                var21.field1568 += var17;
                var21.field1569 += var18;
                var21.field1570++;
                class91 var22 = this.field1657[var5];
                var22.field1572 += var16;
                var22.field1568 += var17;
                var22.field1569 += var18;
                var22.field1570++;
            } else if (var19 == 1) {
                if (this.field1656 == null) {
                    this.field1656 = new class79[this.field1629];
                }
                class79 var23 = this.field1656[var2] = new class79();
                var23.field1382 = var16;
                var23.field1389 = var17;
                var23.field1383 = var18;
            }
        }
    }

    @ObfuscatedName("cv.l()V")
    public void method1952() {
        this.field1657 = null;
        this.field1664 = null;
        this.field1656 = null;
        this.field1661 = false;
    }

    @ObfuscatedName("cv.u()V")
    public void method1935() {
        if (this.field1661) {
            return;
        }
        this.field1390 = 0;
        this.field1670 = 0;
        this.field1663 = 999999;
        this.field1627 = -999999;
        this.field1665 = -99999;
        this.field1631 = 99999;
        for (int var1 = 0; var1 < this.field1662; var1++) {
            int var2 = this.field1626[var1];
            int var3 = this.field1637[var1];
            int var4 = this.field1628[var1];
            if (var2 < this.field1663) {
                this.field1663 = var2;
            }
            if (var2 > this.field1627) {
                this.field1627 = var2;
            }
            if (var4 < this.field1631) {
                this.field1631 = var4;
            }
            if (var4 > this.field1665) {
                this.field1665 = var4;
            }
            if (-var3 > this.field1390) {
                this.field1390 = -var3;
            }
            if (var3 > this.field1670) {
                this.field1670 = var3;
            }
        }
        this.field1661 = true;
    }

    @ObfuscatedName("cv.j(Lcv;Lcv;IIIZ)V")
    public static void method1936(class95 arg0, class95 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1935();
        arg0.method1933();
        arg1.method1935();
        arg1.method1933();
        field1669++;
        int var6 = 0;
        int[] var7 = arg1.field1626;
        int var8 = arg1.field1662;
        for (int var9 = 0; var9 < arg0.field1662; var9++) {
            class91 var10 = arg0.field1657[var9];
            if (var10.field1570 != 0) {
                int var11 = arg0.field1637[var9] - arg3;
                if (var11 <= arg1.field1670) {
                    int var12 = arg0.field1626[var9] - arg2;
                    if (var12 >= arg1.field1663 && var12 <= arg1.field1627) {
                        int var13 = arg0.field1628[var9] - arg4;
                        if (var13 >= arg1.field1631 && var13 <= arg1.field1665) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class91 var15 = arg1.field1657[var14];
                                if (var7[var14] == var12 && arg1.field1628[var14] == var13 && arg1.field1637[var14] == var11 && var15.field1570 != 0) {
                                    if (arg0.field1664 == null) {
                                        arg0.field1664 = new class91[arg0.field1662];
                                    }
                                    if (arg1.field1664 == null) {
                                        arg1.field1664 = new class91[var8];
                                    }
                                    class91 var16 = arg0.field1664[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1664[var9] = new class91(var10);
                                    }
                                    class91 var17 = arg1.field1664[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1664[var14] = new class91(var15);
                                    }
                                    var16.field1572 += var15.field1572;
                                    var16.field1568 += var15.field1568;
                                    var16.field1569 += var15.field1569;
                                    var16.field1570 += var15.field1570;
                                    var17.field1572 += var10.field1572;
                                    var17.field1568 += var10.field1568;
                                    var17.field1569 += var10.field1569;
                                    var17.field1570 += var10.field1570;
                                    var6++;
                                    field1667[var9] = field1669;
                                    field1668[var14] = field1669;
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
        for (int var18 = 0; var18 < arg0.field1629; var18++) {
            if (field1667[arg0.field1630[var18]] == field1669 && field1667[arg0.field1666[var18]] == field1669 && field1667[arg0.field1632[var18]] == field1669) {
                if (arg0.field1650 == null) {
                    arg0.field1650 = new byte[arg0.field1629];
                }
                arg0.field1650[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1629; var19++) {
            if (field1668[arg1.field1630[var19]] == field1669 && field1668[arg1.field1666[var19]] == field1669 && field1668[arg1.field1632[var19]] == field1669) {
                if (arg1.field1650 == null) {
                    arg1.field1650 = new byte[arg1.field1629];
                }
                arg1.field1650[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cv.z(IIIII)Lcm;")
    public final class100 method1937(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1933();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class100 var8 = new class100();
        var8.field1741 = new int[this.field1629];
        var8.field1742 = new int[this.field1629];
        var8.field1750 = new int[this.field1629];
        if (this.field1658 > 0 && this.field1636 != null) {
            int[] var9 = new int[this.field1658];
            for (int var10 = 0; var10 < this.field1629; var10++) {
                if (this.field1636[var10] != -1) {
                    var9[this.field1636[var10] & 0xFF]++;
                }
            }
            var8.field1749 = 0;
            for (int var11 = 0; var11 < this.field1658; var11++) {
                if (var9[var11] > 0 && this.field1645[var11] == 0) {
                    var8.field1749++;
                }
            }
            var8.field1762 = new int[var8.field1749];
            var8.field1751 = new int[var8.field1749];
            var8.field1743 = new int[var8.field1749];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1658; var13++) {
                if (var9[var13] > 0 && this.field1645[var13] == 0) {
                    var8.field1762[var12] = this.field1642[var13] & 0xFFFF;
                    var8.field1751[var12] = this.field1643[var13] & 0xFFFF;
                    var8.field1743[var12] = this.field1644[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1746 = new byte[this.field1629];
            for (int var14 = 0; var14 < this.field1629; var14++) {
                if (this.field1636[var14] == -1) {
                    var8.field1746[var14] = -1;
                } else {
                    var8.field1746[var14] = (byte) var9[this.field1636[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1629; var15++) {
            byte var16;
            if (this.field1650 == null) {
                var16 = 0;
            } else {
                var16 = this.field1650[var15];
            }
            byte var17;
            if (this.field1635 == null) {
                var17 = 0;
            } else {
                var17 = this.field1635[var15];
            }
            short var18;
            if (this.field1638 == null) {
                var18 = -1;
            } else {
                var18 = this.field1638[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1640[var15] & 0xFFFF;
                    class91 var20;
                    if (this.field1664 == null || this.field1664[this.field1630[var15]] == null) {
                        var20 = this.field1657[this.field1630[var15]];
                    } else {
                        var20 = this.field1664[this.field1630[var15]];
                    }
                    int var21 = (var20.field1569 * arg4 + var20.field1572 * arg2 + var20.field1568 * arg3) / (var20.field1570 * var7) + arg0;
                    var8.field1741[var15] = method1938(var19, var21);
                    class91 var22;
                    if (this.field1664 == null || this.field1664[this.field1666[var15]] == null) {
                        var22 = this.field1657[this.field1666[var15]];
                    } else {
                        var22 = this.field1664[this.field1666[var15]];
                    }
                    int var23 = (var22.field1569 * arg4 + var22.field1572 * arg2 + var22.field1568 * arg3) / (var22.field1570 * var7) + arg0;
                    var8.field1742[var15] = method1938(var19, var23);
                    class91 var24;
                    if (this.field1664 == null || this.field1664[this.field1632[var15]] == null) {
                        var24 = this.field1657[this.field1632[var15]];
                    } else {
                        var24 = this.field1664[this.field1632[var15]];
                    }
                    int var25 = (var24.field1569 * arg4 + var24.field1572 * arg2 + var24.field1568 * arg3) / (var24.field1570 * var7) + arg0;
                    var8.field1750[var15] = method1938(var19, var25);
                } else if (var16 == 1) {
                    class79 var26 = this.field1656[var15];
                    int var27 = (var26.field1383 * arg4 + var26.field1389 * arg3 + var26.field1382 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1741[var15] = method1938(this.field1640[var15] & 0xFFFF, var27);
                    var8.field1750[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1741[var15] = 128;
                    var8.field1750[var15] = -1;
                } else {
                    var8.field1750[var15] = -2;
                }
            } else if (var16 == 0) {
                class91 var28;
                if (this.field1664 == null || this.field1664[this.field1630[var15]] == null) {
                    var28 = this.field1657[this.field1630[var15]];
                } else {
                    var28 = this.field1664[this.field1630[var15]];
                }
                int var29 = (var28.field1569 * arg4 + var28.field1572 * arg2 + var28.field1568 * arg3) / (var28.field1570 * var7) + arg0;
                var8.field1741[var15] = method1976(var29);
                class91 var30;
                if (this.field1664 == null || this.field1664[this.field1666[var15]] == null) {
                    var30 = this.field1657[this.field1666[var15]];
                } else {
                    var30 = this.field1664[this.field1666[var15]];
                }
                int var31 = (var30.field1569 * arg4 + var30.field1572 * arg2 + var30.field1568 * arg3) / (var30.field1570 * var7) + arg0;
                var8.field1742[var15] = method1976(var31);
                class91 var32;
                if (this.field1664 == null || this.field1664[this.field1632[var15]] == null) {
                    var32 = this.field1657[this.field1632[var15]];
                } else {
                    var32 = this.field1664[this.field1632[var15]];
                }
                int var33 = (var32.field1569 * arg4 + var32.field1572 * arg2 + var32.field1568 * arg3) / (var32.field1570 * var7) + arg0;
                var8.field1750[var15] = method1976(var33);
            } else if (var16 == 1) {
                class79 var34 = this.field1656[var15];
                int var35 = (var34.field1383 * arg4 + var34.field1389 * arg3 + var34.field1382 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1741[var15] = method1976(var35);
                var8.field1750[var15] = -1;
            } else {
                var8.field1750[var15] = -2;
            }
        }
        this.method1924();
        var8.field1733 = this.field1662;
        var8.field1734 = this.field1626;
        var8.field1735 = this.field1637;
        var8.field1736 = this.field1628;
        var8.field1748 = this.field1629;
        var8.field1738 = this.field1630;
        var8.field1760 = this.field1666;
        var8.field1740 = this.field1632;
        var8.field1737 = this.field1634;
        var8.field1730 = this.field1635;
        var8.field1745 = this.field1639;
        var8.field1756 = this.field1654;
        var8.field1729 = this.field1655;
        var8.field1747 = this.field1638;
        return var8;
    }

    @ObfuscatedName("cv.am(II)I")
    public static final int method1938(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cv.aa(I)I")
    public static final int method1976(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
