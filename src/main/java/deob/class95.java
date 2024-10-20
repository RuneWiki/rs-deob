package deob;

@ObfuscatedName("ci")
public class class95 extends class80 {

    @ObfuscatedName("ci.n")
    public int field1670 = 0;

    @ObfuscatedName("ci.g")
    public int[] field1635;

    @ObfuscatedName("ci.a")
    public int[] field1636;

    @ObfuscatedName("ci.m")
    public int[] field1637;

    @ObfuscatedName("ci.s")
    public int field1638 = 0;

    @ObfuscatedName("ci.j")
    public int[] field1639;

    @ObfuscatedName("ci.f")
    public int[] field1640;

    @ObfuscatedName("ci.b")
    public int[] field1641;

    @ObfuscatedName("ci.t")
    public byte[] field1679;

    @ObfuscatedName("ci.i")
    public byte[] field1643;

    @ObfuscatedName("ci.c")
    public byte[] field1659;

    @ObfuscatedName("ci.k")
    public byte[] field1645;

    @ObfuscatedName("ci.x")
    public short[] field1651;

    @ObfuscatedName("ci.e")
    public short[] field1646;

    @ObfuscatedName("ci.q")
    public byte field1648 = 0;

    @ObfuscatedName("ci.o")
    public int field1649;

    @ObfuscatedName("ci.r")
    public byte[] field1647;

    @ObfuscatedName("ci.v")
    public short[] field1665;

    @ObfuscatedName("ci.h")
    public short[] field1652;

    @ObfuscatedName("ci.p")
    public short[] field1653;

    @ObfuscatedName("ci.y")
    public short[] field1675;

    @ObfuscatedName("ci.z")
    public short[] field1644;

    @ObfuscatedName("ci.u")
    public short[] field1656;

    @ObfuscatedName("ci.w")
    public short[] field1650;

    @ObfuscatedName("ci.d")
    public short[] field1658;

    @ObfuscatedName("ci.l")
    public short[] field1634;

    @ObfuscatedName("ci.aj")
    public byte[] field1660;

    @ObfuscatedName("ci.aq")
    public int[] field1661;

    @ObfuscatedName("ci.al")
    public int[] field1662;

    @ObfuscatedName("ci.az")
    public int[][] field1663;

    @ObfuscatedName("ci.ah")
    public int[][] field1664;

    @ObfuscatedName("ci.ag")
    public class79[] field1655;

    @ObfuscatedName("ci.ad")
    public class91[] field1666;

    @ObfuscatedName("ci.ao")
    public class91[] field1667;

    @ObfuscatedName("ci.am")
    public short field1668;

    @ObfuscatedName("ci.ax")
    public short field1669;

    @ObfuscatedName("ci.at")
    public boolean field1678 = false;

    @ObfuscatedName("ci.ar")
    public int field1671;

    @ObfuscatedName("ci.ai")
    public int field1672;

    @ObfuscatedName("ci.aw")
    public int field1673;

    @ObfuscatedName("ci.ak")
    public int field1674;

    @ObfuscatedName("ci.an")
    public int field1657;

    @ObfuscatedName("ci.av")
    public static int[] field1676 = new int[10000];

    @ObfuscatedName("ci.af")
    public static int[] field1654 = new int[10000];

    @ObfuscatedName("ci.ae")
    public static int field1677 = 0;

    @ObfuscatedName("ci.au")
    public static int[] field1642 = class86.field1539;

    @ObfuscatedName("ci.aa")
    public static int[] field1680 = class86.field1540;

    public class95() {
    }

    @ObfuscatedName("ci.n(Lfi;II)Lci;")
    public static class95 method2011(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2929(arg1, arg2);
        return var3 == null ? null : new class95(var3);
    }

    public class95(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1963(arg0);
        } else {
            this.method2038(arg0);
        }
    }

    @ObfuscatedName("ci.a([B)V")
    public void method1963(byte[] arg0) {
        class111 var2 = new class111(arg0);
        class111 var3 = new class111(arg0);
        class111 var4 = new class111(arg0);
        class111 var5 = new class111(arg0);
        class111 var6 = new class111(arg0);
        class111 var7 = new class111(arg0);
        class111 var8 = new class111(arg0);
        var2.field1896 = arg0.length - 23;
        int var9 = var2.method2395();
        int var10 = var2.method2395();
        int var11 = var2.method2211();
        int var12 = var2.method2211();
        int var13 = var2.method2211();
        int var14 = var2.method2211();
        int var15 = var2.method2211();
        int var16 = var2.method2211();
        int var17 = var2.method2211();
        int var18 = var2.method2395();
        int var19 = var2.method2395();
        int var20 = var2.method2395();
        int var21 = var2.method2395();
        int var22 = var2.method2395();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1647 = new byte[var11];
            var2.field1896 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1647[var26] = var2.method2217();
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
        this.field1670 = var9;
        this.field1638 = var10;
        this.field1649 = var11;
        this.field1635 = new int[var9];
        this.field1636 = new int[var9];
        this.field1637 = new int[var9];
        this.field1639 = new int[var10];
        this.field1640 = new int[var10];
        this.field1641 = new int[var10];
        if (var17 == 1) {
            this.field1661 = new int[var9];
        }
        if (var12 == 1) {
            this.field1679 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1643 = new byte[var10];
        } else {
            this.field1648 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1659 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1662 = new int[var10];
        }
        if (var16 == 1) {
            this.field1646 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1645 = new byte[var10];
        }
        this.field1651 = new short[var10];
        if (var11 > 0) {
            this.field1665 = new short[var11];
            this.field1652 = new short[var11];
            this.field1653 = new short[var11];
            if (var24 > 0) {
                this.field1675 = new short[var24];
                this.field1644 = new short[var24];
                this.field1656 = new short[var24];
                this.field1650 = new short[var24];
                this.field1660 = new byte[var24];
                this.field1658 = new short[var24];
            }
            if (var25 > 0) {
                this.field1634 = new short[var25];
            }
        }
        var2.field1896 = var11;
        var3.field1896 = var44;
        var4.field1896 = var46;
        var5.field1896 = var48;
        var6.field1896 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2211();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2207();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2207();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2207();
            }
            this.field1635[var67] = var64 + var69;
            this.field1636[var67] = var65 + var70;
            this.field1637[var67] = var66 + var71;
            var64 = this.field1635[var67];
            var65 = this.field1636[var67];
            var66 = this.field1637[var67];
            if (var17 == 1) {
                this.field1661[var67] = var6.method2211();
            }
        }
        var2.field1896 = var42;
        var3.field1896 = var31;
        var4.field1896 = var34;
        var5.field1896 = var37;
        var6.field1896 = var35;
        var7.field1896 = var40;
        var8.field1896 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1651[var72] = (short) var2.method2395();
            if (var12 == 1) {
                this.field1679[var72] = var3.method2217();
            }
            if (var13 == 255) {
                this.field1643[var72] = var4.method2217();
            }
            if (var14 == 1) {
                this.field1659[var72] = var5.method2217();
            }
            if (var15 == 1) {
                this.field1662[var72] = var6.method2211();
            }
            if (var16 == 1) {
                this.field1646[var72] = (short) (var7.method2395() - 1);
            }
            if (this.field1645 != null && this.field1646[var72] != -1) {
                this.field1645[var72] = (byte) (var8.method2211() - 1);
            }
        }
        var2.field1896 = var33;
        var3.field1896 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2211();
            if (var78 == 1) {
                var73 = var2.method2207() + var76;
                var74 = var2.method2207() + var73;
                var75 = var2.method2207() + var74;
                var76 = var75;
                this.field1639[var77] = var73;
                this.field1640[var77] = var74;
                this.field1641[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2207() + var76;
                var76 = var75;
                this.field1639[var77] = var73;
                this.field1640[var77] = var74;
                this.field1641[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2207() + var76;
                var76 = var75;
                this.field1639[var77] = var73;
                this.field1640[var77] = var74;
                this.field1641[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2207() + var76;
                var76 = var75;
                this.field1639[var77] = var73;
                this.field1640[var77] = var81;
                this.field1641[var77] = var75;
            }
        }
        var2.field1896 = var50;
        var3.field1896 = var52;
        var4.field1896 = var54;
        var5.field1896 = var56;
        var6.field1896 = var58;
        var7.field1896 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1647[var82] & 0xFF;
            if (var83 == 0) {
                this.field1665[var82] = (short) var2.method2395();
                this.field1652[var82] = (short) var2.method2395();
                this.field1653[var82] = (short) var2.method2395();
            }
            if (var83 == 1) {
                this.field1665[var82] = (short) var3.method2395();
                this.field1652[var82] = (short) var3.method2395();
                this.field1653[var82] = (short) var3.method2395();
                this.field1675[var82] = (short) var4.method2395();
                this.field1644[var82] = (short) var4.method2395();
                this.field1656[var82] = (short) var4.method2395();
                this.field1650[var82] = (short) var5.method2395();
                this.field1660[var82] = var6.method2217();
                this.field1658[var82] = (short) var7.method2395();
            }
            if (var83 == 2) {
                this.field1665[var82] = (short) var3.method2395();
                this.field1652[var82] = (short) var3.method2395();
                this.field1653[var82] = (short) var3.method2395();
                this.field1675[var82] = (short) var4.method2395();
                this.field1644[var82] = (short) var4.method2395();
                this.field1656[var82] = (short) var4.method2395();
                this.field1650[var82] = (short) var5.method2395();
                this.field1660[var82] = var6.method2217();
                this.field1658[var82] = (short) var7.method2395();
                this.field1634[var82] = (short) var7.method2395();
            }
            if (var83 == 3) {
                this.field1665[var82] = (short) var3.method2395();
                this.field1652[var82] = (short) var3.method2395();
                this.field1653[var82] = (short) var3.method2395();
                this.field1675[var82] = (short) var4.method2395();
                this.field1644[var82] = (short) var4.method2395();
                this.field1656[var82] = (short) var4.method2395();
                this.field1650[var82] = (short) var5.method2395();
                this.field1660[var82] = var6.method2217();
                this.field1658[var82] = (short) var7.method2395();
            }
        }
        var2.field1896 = var62;
        int var84 = var2.method2211();
        if (var84 == 0) {
            return;
        }
        new class85();
        var2.method2395();
        var2.method2395();
        var2.method2395();
        var2.method2366();
    }

    @ObfuscatedName("ci.m([B)V")
    public void method2038(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class111 var4 = new class111(arg0);
        class111 var5 = new class111(arg0);
        class111 var6 = new class111(arg0);
        class111 var7 = new class111(arg0);
        class111 var8 = new class111(arg0);
        var4.field1896 = arg0.length - 18;
        int var9 = var4.method2395();
        int var10 = var4.method2395();
        int var11 = var4.method2211();
        int var12 = var4.method2211();
        int var13 = var4.method2211();
        int var14 = var4.method2211();
        int var15 = var4.method2211();
        int var16 = var4.method2211();
        int var17 = var4.method2395();
        int var18 = var4.method2395();
        int var19 = var4.method2395();
        int var20 = var4.method2395();
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
        this.field1670 = var9;
        this.field1638 = var10;
        this.field1649 = var11;
        this.field1635 = new int[var9];
        this.field1636 = new int[var9];
        this.field1637 = new int[var9];
        this.field1639 = new int[var10];
        this.field1640 = new int[var10];
        this.field1641 = new int[var10];
        if (var11 > 0) {
            this.field1647 = new byte[var11];
            this.field1665 = new short[var11];
            this.field1652 = new short[var11];
            this.field1653 = new short[var11];
        }
        if (var16 == 1) {
            this.field1661 = new int[var9];
        }
        if (var12 == 1) {
            this.field1679 = new byte[var10];
            this.field1645 = new byte[var10];
            this.field1646 = new short[var10];
        }
        if (var13 == 255) {
            this.field1643 = new byte[var10];
        } else {
            this.field1648 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1659 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1662 = new int[var10];
        }
        this.field1651 = new short[var10];
        var4.field1896 = var21;
        var5.field1896 = var36;
        var6.field1896 = var38;
        var7.field1896 = var40;
        var8.field1896 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2211();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2207();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2207();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2207();
            }
            this.field1635[var46] = var43 + var48;
            this.field1636[var46] = var44 + var49;
            this.field1637[var46] = var45 + var50;
            var43 = this.field1635[var46];
            var44 = this.field1636[var46];
            var45 = this.field1637[var46];
            if (var16 == 1) {
                this.field1661[var46] = var8.method2211();
            }
        }
        var4.field1896 = var32;
        var5.field1896 = var28;
        var6.field1896 = var26;
        var7.field1896 = var30;
        var8.field1896 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1651[var51] = (short) var4.method2395();
            if (var12 == 1) {
                int var52 = var5.method2211();
                if ((var52 & 0x1) == 1) {
                    this.field1679[var51] = 1;
                    var2 = true;
                } else {
                    this.field1679[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1645[var51] = (byte) (var52 >> 2);
                    this.field1646[var51] = this.field1651[var51];
                    this.field1651[var51] = 127;
                    if (this.field1646[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1645[var51] = -1;
                    this.field1646[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1643[var51] = var6.method2217();
            }
            if (var14 == 1) {
                this.field1659[var51] = var7.method2217();
            }
            if (var15 == 1) {
                this.field1662[var51] = var8.method2211();
            }
        }
        var4.field1896 = var25;
        var5.field1896 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2211();
            if (var58 == 1) {
                var53 = var4.method2207() + var56;
                var54 = var4.method2207() + var53;
                var55 = var4.method2207() + var54;
                var56 = var55;
                this.field1639[var57] = var53;
                this.field1640[var57] = var54;
                this.field1641[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2207() + var56;
                var56 = var55;
                this.field1639[var57] = var53;
                this.field1640[var57] = var54;
                this.field1641[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2207() + var56;
                var56 = var55;
                this.field1639[var57] = var53;
                this.field1640[var57] = var54;
                this.field1641[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2207() + var56;
                var56 = var55;
                this.field1639[var57] = var53;
                this.field1640[var57] = var61;
                this.field1641[var57] = var55;
            }
        }
        var4.field1896 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1647[var62] = 0;
            this.field1665[var62] = (short) var4.method2395();
            this.field1652[var62] = (short) var4.method2395();
            this.field1653[var62] = (short) var4.method2395();
        }
        if (this.field1645 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1645[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1665[var65] & 0xFFFF) == this.field1639[var64] && (this.field1652[var65] & 0xFFFF) == this.field1640[var64] && (this.field1653[var65] & 0xFFFF) == this.field1641[var64]) {
                        this.field1645[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1645 = null;
            }
        }
        if (!var3) {
            this.field1646 = null;
        }
        if (!var2) {
            this.field1679 = null;
        }
    }

    public class95(class95[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1670 = 0;
        this.field1638 = 0;
        this.field1649 = 0;
        this.field1648 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class95 var10 = arg0[var9];
            if (var10 != null) {
                this.field1670 += var10.field1670;
                this.field1638 += var10.field1638;
                this.field1649 += var10.field1649;
                if (var10.field1643 == null) {
                    if (this.field1648 == -1) {
                        this.field1648 = var10.field1648;
                    }
                    if (this.field1648 != var10.field1648) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1679 != null;
                var5 |= var10.field1659 != null;
                var6 |= var10.field1662 != null;
                var7 |= var10.field1646 != null;
                var8 |= var10.field1645 != null;
            }
        }
        this.field1635 = new int[this.field1670];
        this.field1636 = new int[this.field1670];
        this.field1637 = new int[this.field1670];
        this.field1661 = new int[this.field1670];
        this.field1639 = new int[this.field1638];
        this.field1640 = new int[this.field1638];
        this.field1641 = new int[this.field1638];
        if (var3) {
            this.field1679 = new byte[this.field1638];
        }
        if (var4) {
            this.field1643 = new byte[this.field1638];
        }
        if (var5) {
            this.field1659 = new byte[this.field1638];
        }
        if (var6) {
            this.field1662 = new int[this.field1638];
        }
        if (var7) {
            this.field1646 = new short[this.field1638];
        }
        if (var8) {
            this.field1645 = new byte[this.field1638];
        }
        this.field1651 = new short[this.field1638];
        if (this.field1649 > 0) {
            this.field1647 = new byte[this.field1649];
            this.field1665 = new short[this.field1649];
            this.field1652 = new short[this.field1649];
            this.field1653 = new short[this.field1649];
            this.field1675 = new short[this.field1649];
            this.field1644 = new short[this.field1649];
            this.field1656 = new short[this.field1649];
            this.field1650 = new short[this.field1649];
            this.field1660 = new byte[this.field1649];
            this.field1658 = new short[this.field1649];
            this.field1634 = new short[this.field1649];
        }
        this.field1670 = 0;
        this.field1638 = 0;
        this.field1649 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class95 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1638; var13++) {
                    if (var3 && var12.field1679 != null) {
                        this.field1679[this.field1638] = var12.field1679[var13];
                    }
                    if (var4) {
                        if (var12.field1643 == null) {
                            this.field1643[this.field1638] = var12.field1648;
                        } else {
                            this.field1643[this.field1638] = var12.field1643[var13];
                        }
                    }
                    if (var5 && var12.field1659 != null) {
                        this.field1659[this.field1638] = var12.field1659[var13];
                    }
                    if (var6 && var12.field1662 != null) {
                        this.field1662[this.field1638] = var12.field1662[var13];
                    }
                    if (var7) {
                        if (var12.field1646 == null) {
                            this.field1646[this.field1638] = -1;
                        } else {
                            this.field1646[this.field1638] = var12.field1646[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1645 == null || var12.field1645[var13] == -1) {
                            this.field1645[this.field1638] = -1;
                        } else {
                            this.field1645[this.field1638] = (byte) (var12.field1645[var13] + this.field1649);
                        }
                    }
                    this.field1651[this.field1638] = var12.field1651[var13];
                    this.field1639[this.field1638] = this.method1966(var12, var12.field1639[var13]);
                    this.field1640[this.field1638] = this.method1966(var12, var12.field1640[var13]);
                    this.field1641[this.field1638] = this.method1966(var12, var12.field1641[var13]);
                    this.field1638++;
                }
                for (int var14 = 0; var14 < var12.field1649; var14++) {
                    byte var15 = this.field1647[this.field1649] = var12.field1647[var14];
                    if (var15 == 0) {
                        this.field1665[this.field1649] = (short) this.method1966(var12, var12.field1665[var14]);
                        this.field1652[this.field1649] = (short) this.method1966(var12, var12.field1652[var14]);
                        this.field1653[this.field1649] = (short) this.method1966(var12, var12.field1653[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1665[this.field1649] = var12.field1665[var14];
                        this.field1652[this.field1649] = var12.field1652[var14];
                        this.field1653[this.field1649] = var12.field1653[var14];
                        this.field1675[this.field1649] = var12.field1675[var14];
                        this.field1644[this.field1649] = var12.field1644[var14];
                        this.field1656[this.field1649] = var12.field1656[var14];
                        this.field1650[this.field1649] = var12.field1650[var14];
                        this.field1660[this.field1649] = var12.field1660[var14];
                        this.field1658[this.field1649] = var12.field1658[var14];
                    }
                    if (var15 == 2) {
                        this.field1634[this.field1649] = var12.field1634[var14];
                    }
                    this.field1649++;
                }
            }
        }
    }

    @ObfuscatedName("ci.b(Lci;I)I")
    public final int method1966(class95 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1635[arg1];
        int var5 = arg0.field1636[arg1];
        int var6 = arg0.field1637[arg1];
        for (int var7 = 0; var7 < this.field1670; var7++) {
            if (this.field1635[var7] == var4 && this.field1636[var7] == var5 && this.field1637[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1635[this.field1670] = var4;
            this.field1636[this.field1670] = var5;
            this.field1637[this.field1670] = var6;
            if (arg0.field1661 != null) {
                this.field1661[this.field1670] = arg0.field1661[arg1];
            }
            var3 = this.field1670++;
        }
        return var3;
    }

    public class95(class95 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1670 = arg0.field1670;
        this.field1638 = arg0.field1638;
        this.field1649 = arg0.field1649;
        if (arg1) {
            this.field1635 = arg0.field1635;
            this.field1636 = arg0.field1636;
            this.field1637 = arg0.field1637;
        } else {
            this.field1635 = new int[this.field1670];
            this.field1636 = new int[this.field1670];
            this.field1637 = new int[this.field1670];
            for (int var6 = 0; var6 < this.field1670; var6++) {
                this.field1635[var6] = arg0.field1635[var6];
                this.field1636[var6] = arg0.field1636[var6];
                this.field1637[var6] = arg0.field1637[var6];
            }
        }
        if (arg2) {
            this.field1651 = arg0.field1651;
        } else {
            this.field1651 = new short[this.field1638];
            for (int var7 = 0; var7 < this.field1638; var7++) {
                this.field1651[var7] = arg0.field1651[var7];
            }
        }
        if (arg3 || arg0.field1646 == null) {
            this.field1646 = arg0.field1646;
        } else {
            this.field1646 = new short[this.field1638];
            for (int var8 = 0; var8 < this.field1638; var8++) {
                this.field1646[var8] = arg0.field1646[var8];
            }
        }
        if (arg4) {
            this.field1659 = arg0.field1659;
        } else {
            this.field1659 = new byte[this.field1638];
            if (arg0.field1659 == null) {
                for (int var9 = 0; var9 < this.field1638; var9++) {
                    this.field1659[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1638; var10++) {
                    this.field1659[var10] = arg0.field1659[var10];
                }
            }
        }
        this.field1639 = arg0.field1639;
        this.field1640 = arg0.field1640;
        this.field1641 = arg0.field1641;
        this.field1679 = arg0.field1679;
        this.field1643 = arg0.field1643;
        this.field1645 = arg0.field1645;
        this.field1648 = arg0.field1648;
        this.field1647 = arg0.field1647;
        this.field1665 = arg0.field1665;
        this.field1652 = arg0.field1652;
        this.field1653 = arg0.field1653;
        this.field1675 = arg0.field1675;
        this.field1644 = arg0.field1644;
        this.field1656 = arg0.field1656;
        this.field1650 = arg0.field1650;
        this.field1660 = arg0.field1660;
        this.field1658 = arg0.field1658;
        this.field1634 = arg0.field1634;
        this.field1661 = arg0.field1661;
        this.field1662 = arg0.field1662;
        this.field1663 = arg0.field1663;
        this.field1664 = arg0.field1664;
        this.field1666 = arg0.field1666;
        this.field1655 = arg0.field1655;
        this.field1667 = arg0.field1667;
        this.field1668 = arg0.field1668;
        this.field1669 = arg0.field1669;
    }

    @ObfuscatedName("ci.t()Lci;")
    public class95 method1967() {
        class95 var1 = new class95();
        if (this.field1679 != null) {
            var1.field1679 = new byte[this.field1638];
            for (int var2 = 0; var2 < this.field1638; var2++) {
                var1.field1679[var2] = this.field1679[var2];
            }
        }
        var1.field1670 = this.field1670;
        var1.field1638 = this.field1638;
        var1.field1649 = this.field1649;
        var1.field1635 = this.field1635;
        var1.field1636 = this.field1636;
        var1.field1637 = this.field1637;
        var1.field1639 = this.field1639;
        var1.field1640 = this.field1640;
        var1.field1641 = this.field1641;
        var1.field1643 = this.field1643;
        var1.field1659 = this.field1659;
        var1.field1645 = this.field1645;
        var1.field1651 = this.field1651;
        var1.field1646 = this.field1646;
        var1.field1648 = this.field1648;
        var1.field1647 = this.field1647;
        var1.field1665 = this.field1665;
        var1.field1652 = this.field1652;
        var1.field1653 = this.field1653;
        var1.field1675 = this.field1675;
        var1.field1644 = this.field1644;
        var1.field1656 = this.field1656;
        var1.field1650 = this.field1650;
        var1.field1660 = this.field1660;
        var1.field1658 = this.field1658;
        var1.field1634 = this.field1634;
        var1.field1661 = this.field1661;
        var1.field1662 = this.field1662;
        var1.field1663 = this.field1663;
        var1.field1664 = this.field1664;
        var1.field1666 = this.field1666;
        var1.field1655 = this.field1655;
        var1.field1668 = this.field1668;
        var1.field1669 = this.field1669;
        return var1;
    }

    @ObfuscatedName("ci.i([[IIIIZI)Lci;")
    public class95 method2015(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1980();
        int var7 = this.field1672 + arg1;
        int var8 = this.field1673 + arg1;
        int var9 = this.field1657 + arg3;
        int var10 = this.field1674 + arg3;
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
            var15.field1670 = this.field1670;
            var15.field1638 = this.field1638;
            var15.field1649 = this.field1649;
            var15.field1635 = this.field1635;
            var15.field1637 = this.field1637;
            var15.field1639 = this.field1639;
            var15.field1640 = this.field1640;
            var15.field1641 = this.field1641;
            var15.field1679 = this.field1679;
            var15.field1643 = this.field1643;
            var15.field1659 = this.field1659;
            var15.field1645 = this.field1645;
            var15.field1651 = this.field1651;
            var15.field1646 = this.field1646;
            var15.field1648 = this.field1648;
            var15.field1647 = this.field1647;
            var15.field1665 = this.field1665;
            var15.field1652 = this.field1652;
            var15.field1653 = this.field1653;
            var15.field1675 = this.field1675;
            var15.field1644 = this.field1644;
            var15.field1656 = this.field1656;
            var15.field1650 = this.field1650;
            var15.field1660 = this.field1660;
            var15.field1658 = this.field1658;
            var15.field1634 = this.field1634;
            var15.field1661 = this.field1661;
            var15.field1662 = this.field1662;
            var15.field1663 = this.field1663;
            var15.field1664 = this.field1664;
            var15.field1668 = this.field1668;
            var15.field1669 = this.field1669;
            var15.field1636 = new int[var15.field1670];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1670; var16++) {
                int var17 = this.field1635[var16] + arg1;
                int var18 = this.field1637[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1636[var16] = this.field1636[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1670; var26++) {
                int var27 = (-this.field1636[var26] << 16) / this.field1409;
                if (var27 < arg5) {
                    int var28 = this.field1635[var26] + arg1;
                    int var29 = this.field1637[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1636[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1636[var26];
                }
            }
        }
        var15.method2033();
        return var15;
    }

    @ObfuscatedName("ci.c()V")
    public void method2019() {
        int var10002;
        if (this.field1661 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1670; var3++) {
                int var4 = this.field1661[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1663 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1663[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1670) {
                int var7 = this.field1661[var6];
                this.field1663[var7][var1[var7]++] = var6++;
            }
            this.field1661 = null;
        }
        if (this.field1662 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1638; var10++) {
            int var11 = this.field1662[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1664 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1664[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1638) {
            int var14 = this.field1662[var13];
            this.field1664[var14][var8[var14]++] = var13++;
        }
        this.field1662 = null;
    }

    @ObfuscatedName("ci.k()V")
    public void method1970() {
        for (int var1 = 0; var1 < this.field1670; var1++) {
            int var2 = this.field1635[var1];
            this.field1635[var1] = this.field1637[var1];
            this.field1637[var1] = -var2;
        }
        this.method2033();
    }

    @ObfuscatedName("ci.x()V")
    public void method1971() {
        for (int var1 = 0; var1 < this.field1670; var1++) {
            this.field1635[var1] = -this.field1635[var1];
            this.field1637[var1] = -this.field1637[var1];
        }
        this.method2033();
    }

    @ObfuscatedName("ci.e()V")
    public void method2021() {
        for (int var1 = 0; var1 < this.field1670; var1++) {
            int var2 = this.field1637[var1];
            this.field1637[var1] = this.field1635[var1];
            this.field1635[var1] = -var2;
        }
        this.method2033();
    }

    @ObfuscatedName("ci.q(I)V")
    public void method1973(int arg0) {
        int var2 = field1642[arg0];
        int var3 = field1680[arg0];
        for (int var4 = 0; var4 < this.field1670; var4++) {
            int var5 = this.field1637[var4] * var2 + this.field1635[var4] * var3 >> 16;
            this.field1637[var4] = this.field1637[var4] * var3 - this.field1635[var4] * var2 >> 16;
            this.field1635[var4] = var5;
        }
        this.method2033();
    }

    @ObfuscatedName("ci.o(III)V")
    public void method1974(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1670; var4++) {
            this.field1635[var4] += arg0;
            this.field1636[var4] += arg1;
            this.field1637[var4] += arg2;
        }
        this.method2033();
    }

    @ObfuscatedName("ci.r(SS)V")
    public void method1991(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1638; var3++) {
            if (this.field1651[var3] == arg0) {
                this.field1651[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ci.v(SS)V")
    public void method2030(short arg0, short arg1) {
        if (this.field1646 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1638; var3++) {
            if (this.field1646[var3] == arg0) {
                this.field1646[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ci.h()V")
    public void method1961() {
        for (int var1 = 0; var1 < this.field1670; var1++) {
            this.field1637[var1] = -this.field1637[var1];
        }
        for (int var2 = 0; var2 < this.field1638; var2++) {
            int var3 = this.field1639[var2];
            this.field1639[var2] = this.field1641[var2];
            this.field1641[var2] = var3;
        }
        this.method2033();
    }

    @ObfuscatedName("ci.p(III)V")
    public void method2020(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1670; var4++) {
            this.field1635[var4] = this.field1635[var4] * arg0 / 128;
            this.field1636[var4] = this.field1636[var4] * arg1 / 128;
            this.field1637[var4] = this.field1637[var4] * arg2 / 128;
        }
        this.method2033();
    }

    @ObfuscatedName("ci.y()V")
    public void method1978() {
        if (this.field1666 != null) {
            return;
        }
        this.field1666 = new class91[this.field1670];
        for (int var1 = 0; var1 < this.field1670; var1++) {
            this.field1666[var1] = new class91();
        }
        for (int var2 = 0; var2 < this.field1638; var2++) {
            int var3 = this.field1639[var2];
            int var4 = this.field1640[var2];
            int var5 = this.field1641[var2];
            int var6 = this.field1635[var4] - this.field1635[var3];
            int var7 = this.field1636[var4] - this.field1636[var3];
            int var8 = this.field1637[var4] - this.field1637[var3];
            int var9 = this.field1635[var5] - this.field1635[var3];
            int var10 = this.field1636[var5] - this.field1636[var3];
            int var11 = this.field1637[var5] - this.field1637[var3];
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
            if (this.field1679 == null) {
                var19 = 0;
            } else {
                var19 = this.field1679[var2];
            }
            if (var19 == 0) {
                class91 var20 = this.field1666[var3];
                var20.field1578 += var16;
                var20.field1576 += var17;
                var20.field1577 += var18;
                var20.field1579++;
                class91 var21 = this.field1666[var4];
                var21.field1578 += var16;
                var21.field1576 += var17;
                var21.field1577 += var18;
                var21.field1579++;
                class91 var22 = this.field1666[var5];
                var22.field1578 += var16;
                var22.field1576 += var17;
                var22.field1577 += var18;
                var22.field1579++;
            } else if (var19 == 1) {
                if (this.field1655 == null) {
                    this.field1655 = new class79[this.field1638];
                }
                class79 var23 = this.field1655[var2] = new class79();
                var23.field1407 = var16;
                var23.field1400 = var17;
                var23.field1399 = var18;
            }
        }
    }

    @ObfuscatedName("ci.d()V")
    public void method2033() {
        this.field1666 = null;
        this.field1667 = null;
        this.field1655 = null;
        this.field1678 = false;
    }

    @ObfuscatedName("ci.l()V")
    public void method1980() {
        if (this.field1678) {
            return;
        }
        this.field1409 = 0;
        this.field1671 = 0;
        this.field1672 = 999999;
        this.field1673 = -999999;
        this.field1674 = -99999;
        this.field1657 = 99999;
        for (int var1 = 0; var1 < this.field1670; var1++) {
            int var2 = this.field1635[var1];
            int var3 = this.field1636[var1];
            int var4 = this.field1637[var1];
            if (var2 < this.field1672) {
                this.field1672 = var2;
            }
            if (var2 > this.field1673) {
                this.field1673 = var2;
            }
            if (var4 < this.field1657) {
                this.field1657 = var4;
            }
            if (var4 > this.field1674) {
                this.field1674 = var4;
            }
            if (-var3 > this.field1409) {
                this.field1409 = -var3;
            }
            if (var3 > this.field1671) {
                this.field1671 = var3;
            }
        }
        this.field1678 = true;
    }

    @ObfuscatedName("ci.aj(Lci;Lci;IIIZ)V")
    public static void method1992(class95 arg0, class95 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1980();
        arg0.method1978();
        arg1.method1980();
        arg1.method1978();
        field1677++;
        int var6 = 0;
        int[] var7 = arg1.field1635;
        int var8 = arg1.field1670;
        for (int var9 = 0; var9 < arg0.field1670; var9++) {
            class91 var10 = arg0.field1666[var9];
            if (var10.field1579 != 0) {
                int var11 = arg0.field1636[var9] - arg3;
                if (var11 <= arg1.field1671) {
                    int var12 = arg0.field1635[var9] - arg2;
                    if (var12 >= arg1.field1672 && var12 <= arg1.field1673) {
                        int var13 = arg0.field1637[var9] - arg4;
                        if (var13 >= arg1.field1657 && var13 <= arg1.field1674) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class91 var15 = arg1.field1666[var14];
                                if (var7[var14] == var12 && arg1.field1637[var14] == var13 && arg1.field1636[var14] == var11 && var15.field1579 != 0) {
                                    if (arg0.field1667 == null) {
                                        arg0.field1667 = new class91[arg0.field1670];
                                    }
                                    if (arg1.field1667 == null) {
                                        arg1.field1667 = new class91[var8];
                                    }
                                    class91 var16 = arg0.field1667[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1667[var9] = new class91(var10);
                                    }
                                    class91 var17 = arg1.field1667[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1667[var14] = new class91(var15);
                                    }
                                    var16.field1578 += var15.field1578;
                                    var16.field1576 += var15.field1576;
                                    var16.field1577 += var15.field1577;
                                    var16.field1579 += var15.field1579;
                                    var17.field1578 += var10.field1578;
                                    var17.field1576 += var10.field1576;
                                    var17.field1577 += var10.field1577;
                                    var17.field1579 += var10.field1579;
                                    var6++;
                                    field1676[var9] = field1677;
                                    field1654[var14] = field1677;
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
        for (int var18 = 0; var18 < arg0.field1638; var18++) {
            if (field1676[arg0.field1639[var18]] == field1677 && field1676[arg0.field1640[var18]] == field1677 && field1676[arg0.field1641[var18]] == field1677) {
                if (arg0.field1679 == null) {
                    arg0.field1679 = new byte[arg0.field1638];
                }
                arg0.field1679[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1638; var19++) {
            if (field1654[arg1.field1639[var19]] == field1677 && field1654[arg1.field1640[var19]] == field1677 && field1654[arg1.field1641[var19]] == field1677) {
                if (arg1.field1679 == null) {
                    arg1.field1679 = new byte[arg1.field1638];
                }
                arg1.field1679[var19] = 2;
            }
        }
    }

    @ObfuscatedName("ci.aq(IIIII)Lcs;")
    public final class100 method1982(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1978();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class100 var8 = new class100();
        var8.field1751 = new int[this.field1638];
        var8.field1752 = new int[this.field1638];
        var8.field1753 = new int[this.field1638];
        if (this.field1649 > 0 && this.field1645 != null) {
            int[] var9 = new int[this.field1649];
            for (int var10 = 0; var10 < this.field1638; var10++) {
                if (this.field1645[var10] != -1) {
                    var9[this.field1645[var10] & 0xFF]++;
                }
            }
            var8.field1801 = 0;
            for (int var11 = 0; var11 < this.field1649; var11++) {
                if (var9[var11] > 0 && this.field1647[var11] == 0) {
                    var8.field1801++;
                }
            }
            var8.field1760 = new int[var8.field1801];
            var8.field1761 = new int[var8.field1801];
            var8.field1762 = new int[var8.field1801];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1649; var13++) {
                if (var9[var13] > 0 && this.field1647[var13] == 0) {
                    var8.field1760[var12] = this.field1665[var13] & 0xFFFF;
                    var8.field1761[var12] = this.field1652[var13] & 0xFFFF;
                    var8.field1762[var12] = this.field1653[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1794 = new byte[this.field1638];
            for (int var14 = 0; var14 < this.field1638; var14++) {
                if (this.field1645[var14] == -1) {
                    var8.field1794[var14] = -1;
                } else {
                    var8.field1794[var14] = (byte) var9[this.field1645[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1638; var15++) {
            byte var16;
            if (this.field1679 == null) {
                var16 = 0;
            } else {
                var16 = this.field1679[var15];
            }
            byte var17;
            if (this.field1659 == null) {
                var17 = 0;
            } else {
                var17 = this.field1659[var15];
            }
            short var18;
            if (this.field1646 == null) {
                var18 = -1;
            } else {
                var18 = this.field1646[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1651[var15] & 0xFFFF;
                    class91 var20;
                    if (this.field1667 == null || this.field1667[this.field1639[var15]] == null) {
                        var20 = this.field1666[this.field1639[var15]];
                    } else {
                        var20 = this.field1667[this.field1639[var15]];
                    }
                    int var21 = (var20.field1577 * arg4 + var20.field1578 * arg2 + var20.field1576 * arg3) / (var20.field1579 * var7) + arg0;
                    var8.field1751[var15] = method1983(var19, var21);
                    class91 var22;
                    if (this.field1667 == null || this.field1667[this.field1640[var15]] == null) {
                        var22 = this.field1666[this.field1640[var15]];
                    } else {
                        var22 = this.field1667[this.field1640[var15]];
                    }
                    int var23 = (var22.field1577 * arg4 + var22.field1578 * arg2 + var22.field1576 * arg3) / (var22.field1579 * var7) + arg0;
                    var8.field1752[var15] = method1983(var19, var23);
                    class91 var24;
                    if (this.field1667 == null || this.field1667[this.field1641[var15]] == null) {
                        var24 = this.field1666[this.field1641[var15]];
                    } else {
                        var24 = this.field1667[this.field1641[var15]];
                    }
                    int var25 = (var24.field1577 * arg4 + var24.field1578 * arg2 + var24.field1576 * arg3) / (var24.field1579 * var7) + arg0;
                    var8.field1753[var15] = method1983(var19, var25);
                } else if (var16 == 1) {
                    class79 var26 = this.field1655[var15];
                    int var27 = (var26.field1399 * arg4 + var26.field1407 * arg2 + var26.field1400 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1751[var15] = method1983(this.field1651[var15] & 0xFFFF, var27);
                    var8.field1753[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1751[var15] = 128;
                    var8.field1753[var15] = -1;
                } else {
                    var8.field1753[var15] = -2;
                }
            } else if (var16 == 0) {
                class91 var28;
                if (this.field1667 == null || this.field1667[this.field1639[var15]] == null) {
                    var28 = this.field1666[this.field1639[var15]];
                } else {
                    var28 = this.field1667[this.field1639[var15]];
                }
                int var29 = (var28.field1577 * arg4 + var28.field1578 * arg2 + var28.field1576 * arg3) / (var28.field1579 * var7) + arg0;
                var8.field1751[var15] = method1984(var29);
                class91 var30;
                if (this.field1667 == null || this.field1667[this.field1640[var15]] == null) {
                    var30 = this.field1666[this.field1640[var15]];
                } else {
                    var30 = this.field1667[this.field1640[var15]];
                }
                int var31 = (var30.field1577 * arg4 + var30.field1578 * arg2 + var30.field1576 * arg3) / (var30.field1579 * var7) + arg0;
                var8.field1752[var15] = method1984(var31);
                class91 var32;
                if (this.field1667 == null || this.field1667[this.field1641[var15]] == null) {
                    var32 = this.field1666[this.field1641[var15]];
                } else {
                    var32 = this.field1667[this.field1641[var15]];
                }
                int var33 = (var32.field1577 * arg4 + var32.field1578 * arg2 + var32.field1576 * arg3) / (var32.field1579 * var7) + arg0;
                var8.field1753[var15] = method1984(var33);
            } else if (var16 == 1) {
                class79 var34 = this.field1655[var15];
                int var35 = (var34.field1399 * arg4 + var34.field1407 * arg2 + var34.field1400 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1751[var15] = method1984(var35);
                var8.field1753[var15] = -1;
            } else {
                var8.field1753[var15] = -2;
            }
        }
        this.method2019();
        var8.field1743 = this.field1670;
        var8.field1744 = this.field1635;
        var8.field1781 = this.field1636;
        var8.field1758 = this.field1637;
        var8.field1747 = this.field1638;
        var8.field1748 = this.field1639;
        var8.field1749 = this.field1640;
        var8.field1764 = this.field1641;
        var8.field1754 = this.field1643;
        var8.field1763 = this.field1659;
        var8.field1798 = this.field1648;
        var8.field1803 = this.field1663;
        var8.field1755 = this.field1664;
        var8.field1757 = this.field1646;
        return var8;
    }

    @ObfuscatedName("ci.al(II)I")
    public static final int method1983(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ci.az(I)I")
    public static final int method1984(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
