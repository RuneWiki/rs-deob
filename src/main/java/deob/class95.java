package deob;

@ObfuscatedName("ce")
public class class95 extends class80 {

    @ObfuscatedName("ce.n")
    public int field1631 = 0;

    @ObfuscatedName("ce.w")
    public int[] field1622;

    @ObfuscatedName("ce.i")
    public int[] field1623;

    @ObfuscatedName("ce.e")
    public int[] field1624;

    @ObfuscatedName("ce.h")
    public int field1625 = 0;

    @ObfuscatedName("ce.q")
    public int[] field1626;

    @ObfuscatedName("ce.l")
    public int[] field1638;

    @ObfuscatedName("ce.c")
    public int[] field1628;

    @ObfuscatedName("ce.f")
    public byte[] field1647;

    @ObfuscatedName("ce.s")
    public byte[] field1630;

    @ObfuscatedName("ce.m")
    public byte[] field1644;

    @ObfuscatedName("ce.y")
    public byte[] field1640;

    @ObfuscatedName("ce.b")
    public short[] field1633;

    @ObfuscatedName("ce.v")
    public short[] field1634;

    @ObfuscatedName("ce.z")
    public byte field1635 = 0;

    @ObfuscatedName("ce.u")
    public int field1636;

    @ObfuscatedName("ce.g")
    public byte[] field1637;

    @ObfuscatedName("ce.k")
    public short[] field1621;

    @ObfuscatedName("ce.o")
    public short[] field1639;

    @ObfuscatedName("ce.a")
    public short[] field1660;

    @ObfuscatedName("ce.p")
    public short[] field1641;

    @ObfuscatedName("ce.t")
    public short[] field1642;

    @ObfuscatedName("ce.x")
    public short[] field1651;

    @ObfuscatedName("ce.d")
    public short[] field1662;

    @ObfuscatedName("ce.j")
    public short[] field1645;

    @ObfuscatedName("ce.r")
    public short[] field1646;

    @ObfuscatedName("ce.at")
    public byte[] field1653;

    @ObfuscatedName("ce.av")
    public int[] field1648;

    @ObfuscatedName("ce.ar")
    public int[] field1652;

    @ObfuscatedName("ce.aq")
    public int[][] field1643;

    @ObfuscatedName("ce.as")
    public int[][] field1657;

    @ObfuscatedName("ce.ad")
    public class79[] field1629;

    @ObfuscatedName("ce.ap")
    public class91[] field1664;

    @ObfuscatedName("ce.an")
    public class91[] field1654;

    @ObfuscatedName("ce.au")
    public short field1655;

    @ObfuscatedName("ce.aw")
    public short field1632;

    @ObfuscatedName("ce.ag")
    public boolean field1656 = false;

    @ObfuscatedName("ce.ah")
    public int field1658;

    @ObfuscatedName("ce.ao")
    public int field1659;

    @ObfuscatedName("ce.ac")
    public int field1667;

    @ObfuscatedName("ce.af")
    public int field1661;

    @ObfuscatedName("ce.ab")
    public int field1650;

    @ObfuscatedName("ce.ai")
    public static int[] field1663 = new int[10000];

    @ObfuscatedName("ce.ay")
    public static int[] field1627 = new int[10000];

    @ObfuscatedName("ce.ak")
    public static int field1665 = 0;

    @ObfuscatedName("ce.aj")
    public static int[] field1666 = class86.field1512;

    @ObfuscatedName("ce.az")
    public static int[] field1649 = class86.field1513;

    public class95() {
    }

    @ObfuscatedName("ce.n(Lfd;II)Lce;")
    public static class95 method1905(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2859(arg1, arg2);
        return var3 == null ? null : new class95(var3);
    }

    public class95(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1907(arg0);
        } else {
            this.method1908(arg0);
        }
    }

    @ObfuscatedName("ce.i([B)V")
    public void method1907(byte[] arg0) {
        class111 var2 = new class111(arg0);
        class111 var3 = new class111(arg0);
        class111 var4 = new class111(arg0);
        class111 var5 = new class111(arg0);
        class111 var6 = new class111(arg0);
        class111 var7 = new class111(arg0);
        class111 var8 = new class111(arg0);
        var2.field1888 = arg0.length - 23;
        int var9 = var2.method2157();
        int var10 = var2.method2157();
        int var11 = var2.method2155();
        int var12 = var2.method2155();
        int var13 = var2.method2155();
        int var14 = var2.method2155();
        int var15 = var2.method2155();
        int var16 = var2.method2155();
        int var17 = var2.method2155();
        int var18 = var2.method2157();
        int var19 = var2.method2157();
        int var20 = var2.method2157();
        int var21 = var2.method2157();
        int var22 = var2.method2157();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1637 = new byte[var11];
            var2.field1888 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1637[var26] = var2.method2173();
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
        this.field1631 = var9;
        this.field1625 = var10;
        this.field1636 = var11;
        this.field1622 = new int[var9];
        this.field1623 = new int[var9];
        this.field1624 = new int[var9];
        this.field1626 = new int[var10];
        this.field1638 = new int[var10];
        this.field1628 = new int[var10];
        if (var17 == 1) {
            this.field1648 = new int[var9];
        }
        if (var12 == 1) {
            this.field1647 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1630 = new byte[var10];
        } else {
            this.field1635 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1644 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1652 = new int[var10];
        }
        if (var16 == 1) {
            this.field1634 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1640 = new byte[var10];
        }
        this.field1633 = new short[var10];
        if (var11 > 0) {
            this.field1621 = new short[var11];
            this.field1639 = new short[var11];
            this.field1660 = new short[var11];
            if (var24 > 0) {
                this.field1641 = new short[var24];
                this.field1642 = new short[var24];
                this.field1651 = new short[var24];
                this.field1662 = new short[var24];
                this.field1653 = new byte[var24];
                this.field1645 = new short[var24];
            }
            if (var25 > 0) {
                this.field1646 = new short[var25];
            }
        }
        var2.field1888 = var11;
        var3.field1888 = var44;
        var4.field1888 = var46;
        var5.field1888 = var48;
        var6.field1888 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2155();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2167();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2167();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2167();
            }
            this.field1622[var67] = var64 + var69;
            this.field1623[var67] = var65 + var70;
            this.field1624[var67] = var66 + var71;
            var64 = this.field1622[var67];
            var65 = this.field1623[var67];
            var66 = this.field1624[var67];
            if (var17 == 1) {
                this.field1648[var67] = var6.method2155();
            }
        }
        var2.field1888 = var42;
        var3.field1888 = var31;
        var4.field1888 = var34;
        var5.field1888 = var37;
        var6.field1888 = var35;
        var7.field1888 = var40;
        var8.field1888 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1633[var72] = (short) var2.method2157();
            if (var12 == 1) {
                this.field1647[var72] = var3.method2173();
            }
            if (var13 == 255) {
                this.field1630[var72] = var4.method2173();
            }
            if (var14 == 1) {
                this.field1644[var72] = var5.method2173();
            }
            if (var15 == 1) {
                this.field1652[var72] = var6.method2155();
            }
            if (var16 == 1) {
                this.field1634[var72] = (short) (var7.method2157() - 1);
            }
            if (this.field1640 != null && this.field1634[var72] != -1) {
                this.field1640[var72] = (byte) (var8.method2155() - 1);
            }
        }
        var2.field1888 = var33;
        var3.field1888 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2155();
            if (var78 == 1) {
                var73 = var2.method2167() + var76;
                var74 = var2.method2167() + var73;
                var75 = var2.method2167() + var74;
                var76 = var75;
                this.field1626[var77] = var73;
                this.field1638[var77] = var74;
                this.field1628[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2167() + var76;
                var76 = var75;
                this.field1626[var77] = var73;
                this.field1638[var77] = var74;
                this.field1628[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2167() + var76;
                var76 = var75;
                this.field1626[var77] = var73;
                this.field1638[var77] = var74;
                this.field1628[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2167() + var76;
                var76 = var75;
                this.field1626[var77] = var73;
                this.field1638[var77] = var81;
                this.field1628[var77] = var75;
            }
        }
        var2.field1888 = var50;
        var3.field1888 = var52;
        var4.field1888 = var54;
        var5.field1888 = var56;
        var6.field1888 = var58;
        var7.field1888 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1637[var82] & 0xFF;
            if (var83 == 0) {
                this.field1621[var82] = (short) var2.method2157();
                this.field1639[var82] = (short) var2.method2157();
                this.field1660[var82] = (short) var2.method2157();
            }
            if (var83 == 1) {
                this.field1621[var82] = (short) var3.method2157();
                this.field1639[var82] = (short) var3.method2157();
                this.field1660[var82] = (short) var3.method2157();
                this.field1641[var82] = (short) var4.method2157();
                this.field1642[var82] = (short) var4.method2157();
                this.field1651[var82] = (short) var4.method2157();
                this.field1662[var82] = (short) var5.method2157();
                this.field1653[var82] = var6.method2173();
                this.field1645[var82] = (short) var7.method2157();
            }
            if (var83 == 2) {
                this.field1621[var82] = (short) var3.method2157();
                this.field1639[var82] = (short) var3.method2157();
                this.field1660[var82] = (short) var3.method2157();
                this.field1641[var82] = (short) var4.method2157();
                this.field1642[var82] = (short) var4.method2157();
                this.field1651[var82] = (short) var4.method2157();
                this.field1662[var82] = (short) var5.method2157();
                this.field1653[var82] = var6.method2173();
                this.field1645[var82] = (short) var7.method2157();
                this.field1646[var82] = (short) var7.method2157();
            }
            if (var83 == 3) {
                this.field1621[var82] = (short) var3.method2157();
                this.field1639[var82] = (short) var3.method2157();
                this.field1660[var82] = (short) var3.method2157();
                this.field1641[var82] = (short) var4.method2157();
                this.field1642[var82] = (short) var4.method2157();
                this.field1651[var82] = (short) var4.method2157();
                this.field1662[var82] = (short) var5.method2157();
                this.field1653[var82] = var6.method2173();
                this.field1645[var82] = (short) var7.method2157();
            }
        }
        var2.field1888 = var62;
        int var84 = var2.method2155();
        if (var84 == 0) {
            return;
        }
        new class85();
        var2.method2157();
        var2.method2157();
        var2.method2157();
        var2.method2160();
    }

    @ObfuscatedName("ce.e([B)V")
    public void method1908(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class111 var4 = new class111(arg0);
        class111 var5 = new class111(arg0);
        class111 var6 = new class111(arg0);
        class111 var7 = new class111(arg0);
        class111 var8 = new class111(arg0);
        var4.field1888 = arg0.length - 18;
        int var9 = var4.method2157();
        int var10 = var4.method2157();
        int var11 = var4.method2155();
        int var12 = var4.method2155();
        int var13 = var4.method2155();
        int var14 = var4.method2155();
        int var15 = var4.method2155();
        int var16 = var4.method2155();
        int var17 = var4.method2157();
        int var18 = var4.method2157();
        int var19 = var4.method2157();
        int var20 = var4.method2157();
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
        this.field1631 = var9;
        this.field1625 = var10;
        this.field1636 = var11;
        this.field1622 = new int[var9];
        this.field1623 = new int[var9];
        this.field1624 = new int[var9];
        this.field1626 = new int[var10];
        this.field1638 = new int[var10];
        this.field1628 = new int[var10];
        if (var11 > 0) {
            this.field1637 = new byte[var11];
            this.field1621 = new short[var11];
            this.field1639 = new short[var11];
            this.field1660 = new short[var11];
        }
        if (var16 == 1) {
            this.field1648 = new int[var9];
        }
        if (var12 == 1) {
            this.field1647 = new byte[var10];
            this.field1640 = new byte[var10];
            this.field1634 = new short[var10];
        }
        if (var13 == 255) {
            this.field1630 = new byte[var10];
        } else {
            this.field1635 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1644 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1652 = new int[var10];
        }
        this.field1633 = new short[var10];
        var4.field1888 = var21;
        var5.field1888 = var36;
        var6.field1888 = var38;
        var7.field1888 = var40;
        var8.field1888 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2155();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2167();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2167();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2167();
            }
            this.field1622[var46] = var43 + var48;
            this.field1623[var46] = var44 + var49;
            this.field1624[var46] = var45 + var50;
            var43 = this.field1622[var46];
            var44 = this.field1623[var46];
            var45 = this.field1624[var46];
            if (var16 == 1) {
                this.field1648[var46] = var8.method2155();
            }
        }
        var4.field1888 = var32;
        var5.field1888 = var28;
        var6.field1888 = var26;
        var7.field1888 = var30;
        var8.field1888 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1633[var51] = (short) var4.method2157();
            if (var12 == 1) {
                int var52 = var5.method2155();
                if ((var52 & 0x1) == 1) {
                    this.field1647[var51] = 1;
                    var2 = true;
                } else {
                    this.field1647[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1640[var51] = (byte) (var52 >> 2);
                    this.field1634[var51] = this.field1633[var51];
                    this.field1633[var51] = 127;
                    if (this.field1634[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1640[var51] = -1;
                    this.field1634[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1630[var51] = var6.method2173();
            }
            if (var14 == 1) {
                this.field1644[var51] = var7.method2173();
            }
            if (var15 == 1) {
                this.field1652[var51] = var8.method2155();
            }
        }
        var4.field1888 = var25;
        var5.field1888 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2155();
            if (var58 == 1) {
                var53 = var4.method2167() + var56;
                var54 = var4.method2167() + var53;
                var55 = var4.method2167() + var54;
                var56 = var55;
                this.field1626[var57] = var53;
                this.field1638[var57] = var54;
                this.field1628[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2167() + var56;
                var56 = var55;
                this.field1626[var57] = var53;
                this.field1638[var57] = var54;
                this.field1628[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2167() + var56;
                var56 = var55;
                this.field1626[var57] = var53;
                this.field1638[var57] = var54;
                this.field1628[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2167() + var56;
                var56 = var55;
                this.field1626[var57] = var53;
                this.field1638[var57] = var61;
                this.field1628[var57] = var55;
            }
        }
        var4.field1888 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1637[var62] = 0;
            this.field1621[var62] = (short) var4.method2157();
            this.field1639[var62] = (short) var4.method2157();
            this.field1660[var62] = (short) var4.method2157();
        }
        if (this.field1640 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1640[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1621[var65] & 0xFFFF) == this.field1626[var64] && (this.field1639[var65] & 0xFFFF) == this.field1638[var64] && (this.field1660[var65] & 0xFFFF) == this.field1628[var64]) {
                        this.field1640[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1640 = null;
            }
        }
        if (!var3) {
            this.field1634 = null;
        }
        if (!var2) {
            this.field1647 = null;
        }
    }

    public class95(class95[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1631 = 0;
        this.field1625 = 0;
        this.field1636 = 0;
        this.field1635 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class95 var10 = arg0[var9];
            if (var10 != null) {
                this.field1631 += var10.field1631;
                this.field1625 += var10.field1625;
                this.field1636 += var10.field1636;
                if (var10.field1630 == null) {
                    if (this.field1635 == -1) {
                        this.field1635 = var10.field1635;
                    }
                    if (this.field1635 != var10.field1635) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1647 != null;
                var5 |= var10.field1644 != null;
                var6 |= var10.field1652 != null;
                var7 |= var10.field1634 != null;
                var8 |= var10.field1640 != null;
            }
        }
        this.field1622 = new int[this.field1631];
        this.field1623 = new int[this.field1631];
        this.field1624 = new int[this.field1631];
        this.field1648 = new int[this.field1631];
        this.field1626 = new int[this.field1625];
        this.field1638 = new int[this.field1625];
        this.field1628 = new int[this.field1625];
        if (var3) {
            this.field1647 = new byte[this.field1625];
        }
        if (var4) {
            this.field1630 = new byte[this.field1625];
        }
        if (var5) {
            this.field1644 = new byte[this.field1625];
        }
        if (var6) {
            this.field1652 = new int[this.field1625];
        }
        if (var7) {
            this.field1634 = new short[this.field1625];
        }
        if (var8) {
            this.field1640 = new byte[this.field1625];
        }
        this.field1633 = new short[this.field1625];
        if (this.field1636 > 0) {
            this.field1637 = new byte[this.field1636];
            this.field1621 = new short[this.field1636];
            this.field1639 = new short[this.field1636];
            this.field1660 = new short[this.field1636];
            this.field1641 = new short[this.field1636];
            this.field1642 = new short[this.field1636];
            this.field1651 = new short[this.field1636];
            this.field1662 = new short[this.field1636];
            this.field1653 = new byte[this.field1636];
            this.field1645 = new short[this.field1636];
            this.field1646 = new short[this.field1636];
        }
        this.field1631 = 0;
        this.field1625 = 0;
        this.field1636 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class95 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1625; var13++) {
                    if (var3 && var12.field1647 != null) {
                        this.field1647[this.field1625] = var12.field1647[var13];
                    }
                    if (var4) {
                        if (var12.field1630 == null) {
                            this.field1630[this.field1625] = var12.field1635;
                        } else {
                            this.field1630[this.field1625] = var12.field1630[var13];
                        }
                    }
                    if (var5 && var12.field1644 != null) {
                        this.field1644[this.field1625] = var12.field1644[var13];
                    }
                    if (var6 && var12.field1652 != null) {
                        this.field1652[this.field1625] = var12.field1652[var13];
                    }
                    if (var7) {
                        if (var12.field1634 == null) {
                            this.field1634[this.field1625] = -1;
                        } else {
                            this.field1634[this.field1625] = var12.field1634[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1640 == null || var12.field1640[var13] == -1) {
                            this.field1640[this.field1625] = -1;
                        } else {
                            this.field1640[this.field1625] = (byte) (var12.field1640[var13] + this.field1636);
                        }
                    }
                    this.field1633[this.field1625] = var12.field1633[var13];
                    this.field1626[this.field1625] = this.method1970(var12, var12.field1626[var13]);
                    this.field1638[this.field1625] = this.method1970(var12, var12.field1638[var13]);
                    this.field1628[this.field1625] = this.method1970(var12, var12.field1628[var13]);
                    this.field1625++;
                }
                for (int var14 = 0; var14 < var12.field1636; var14++) {
                    byte var15 = this.field1637[this.field1636] = var12.field1637[var14];
                    if (var15 == 0) {
                        this.field1621[this.field1636] = (short) this.method1970(var12, var12.field1621[var14]);
                        this.field1639[this.field1636] = (short) this.method1970(var12, var12.field1639[var14]);
                        this.field1660[this.field1636] = (short) this.method1970(var12, var12.field1660[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1621[this.field1636] = var12.field1621[var14];
                        this.field1639[this.field1636] = var12.field1639[var14];
                        this.field1660[this.field1636] = var12.field1660[var14];
                        this.field1641[this.field1636] = var12.field1641[var14];
                        this.field1642[this.field1636] = var12.field1642[var14];
                        this.field1651[this.field1636] = var12.field1651[var14];
                        this.field1662[this.field1636] = var12.field1662[var14];
                        this.field1653[this.field1636] = var12.field1653[var14];
                        this.field1645[this.field1636] = var12.field1645[var14];
                    }
                    if (var15 == 2) {
                        this.field1646[this.field1636] = var12.field1646[var14];
                    }
                    this.field1636++;
                }
            }
        }
    }

    @ObfuscatedName("ce.h(Lce;I)I")
    public final int method1970(class95 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1622[arg1];
        int var5 = arg0.field1623[arg1];
        int var6 = arg0.field1624[arg1];
        for (int var7 = 0; var7 < this.field1631; var7++) {
            if (this.field1622[var7] == var4 && this.field1623[var7] == var5 && this.field1624[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1622[this.field1631] = var4;
            this.field1623[this.field1631] = var5;
            this.field1624[this.field1631] = var6;
            if (arg0.field1648 != null) {
                this.field1648[this.field1631] = arg0.field1648[arg1];
            }
            var3 = this.field1631++;
        }
        return var3;
    }

    public class95(class95 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1631 = arg0.field1631;
        this.field1625 = arg0.field1625;
        this.field1636 = arg0.field1636;
        if (arg1) {
            this.field1622 = arg0.field1622;
            this.field1623 = arg0.field1623;
            this.field1624 = arg0.field1624;
        } else {
            this.field1622 = new int[this.field1631];
            this.field1623 = new int[this.field1631];
            this.field1624 = new int[this.field1631];
            for (int var6 = 0; var6 < this.field1631; var6++) {
                this.field1622[var6] = arg0.field1622[var6];
                this.field1623[var6] = arg0.field1623[var6];
                this.field1624[var6] = arg0.field1624[var6];
            }
        }
        if (arg2) {
            this.field1633 = arg0.field1633;
        } else {
            this.field1633 = new short[this.field1625];
            for (int var7 = 0; var7 < this.field1625; var7++) {
                this.field1633[var7] = arg0.field1633[var7];
            }
        }
        if (arg3 || arg0.field1634 == null) {
            this.field1634 = arg0.field1634;
        } else {
            this.field1634 = new short[this.field1625];
            for (int var8 = 0; var8 < this.field1625; var8++) {
                this.field1634[var8] = arg0.field1634[var8];
            }
        }
        if (arg4) {
            this.field1644 = arg0.field1644;
        } else {
            this.field1644 = new byte[this.field1625];
            if (arg0.field1644 == null) {
                for (int var9 = 0; var9 < this.field1625; var9++) {
                    this.field1644[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1625; var10++) {
                    this.field1644[var10] = arg0.field1644[var10];
                }
            }
        }
        this.field1626 = arg0.field1626;
        this.field1638 = arg0.field1638;
        this.field1628 = arg0.field1628;
        this.field1647 = arg0.field1647;
        this.field1630 = arg0.field1630;
        this.field1640 = arg0.field1640;
        this.field1635 = arg0.field1635;
        this.field1637 = arg0.field1637;
        this.field1621 = arg0.field1621;
        this.field1639 = arg0.field1639;
        this.field1660 = arg0.field1660;
        this.field1641 = arg0.field1641;
        this.field1642 = arg0.field1642;
        this.field1651 = arg0.field1651;
        this.field1662 = arg0.field1662;
        this.field1653 = arg0.field1653;
        this.field1645 = arg0.field1645;
        this.field1646 = arg0.field1646;
        this.field1648 = arg0.field1648;
        this.field1652 = arg0.field1652;
        this.field1643 = arg0.field1643;
        this.field1657 = arg0.field1657;
        this.field1664 = arg0.field1664;
        this.field1629 = arg0.field1629;
        this.field1654 = arg0.field1654;
        this.field1655 = arg0.field1655;
        this.field1632 = arg0.field1632;
    }

    @ObfuscatedName("ce.q()Lce;")
    public class95 method1981() {
        class95 var1 = new class95();
        if (this.field1647 != null) {
            var1.field1647 = new byte[this.field1625];
            for (int var2 = 0; var2 < this.field1625; var2++) {
                var1.field1647[var2] = this.field1647[var2];
            }
        }
        var1.field1631 = this.field1631;
        var1.field1625 = this.field1625;
        var1.field1636 = this.field1636;
        var1.field1622 = this.field1622;
        var1.field1623 = this.field1623;
        var1.field1624 = this.field1624;
        var1.field1626 = this.field1626;
        var1.field1638 = this.field1638;
        var1.field1628 = this.field1628;
        var1.field1630 = this.field1630;
        var1.field1644 = this.field1644;
        var1.field1640 = this.field1640;
        var1.field1633 = this.field1633;
        var1.field1634 = this.field1634;
        var1.field1635 = this.field1635;
        var1.field1637 = this.field1637;
        var1.field1621 = this.field1621;
        var1.field1639 = this.field1639;
        var1.field1660 = this.field1660;
        var1.field1641 = this.field1641;
        var1.field1642 = this.field1642;
        var1.field1651 = this.field1651;
        var1.field1662 = this.field1662;
        var1.field1653 = this.field1653;
        var1.field1645 = this.field1645;
        var1.field1646 = this.field1646;
        var1.field1648 = this.field1648;
        var1.field1652 = this.field1652;
        var1.field1643 = this.field1643;
        var1.field1657 = this.field1657;
        var1.field1664 = this.field1664;
        var1.field1629 = this.field1629;
        var1.field1655 = this.field1655;
        var1.field1632 = this.field1632;
        return var1;
    }

    @ObfuscatedName("ce.l([[IIIIZI)Lce;")
    public class95 method1927(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1925();
        int var7 = this.field1659 + arg1;
        int var8 = this.field1667 + arg1;
        int var9 = this.field1650 + arg3;
        int var10 = this.field1661 + arg3;
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
            var15.field1631 = this.field1631;
            var15.field1625 = this.field1625;
            var15.field1636 = this.field1636;
            var15.field1622 = this.field1622;
            var15.field1624 = this.field1624;
            var15.field1626 = this.field1626;
            var15.field1638 = this.field1638;
            var15.field1628 = this.field1628;
            var15.field1647 = this.field1647;
            var15.field1630 = this.field1630;
            var15.field1644 = this.field1644;
            var15.field1640 = this.field1640;
            var15.field1633 = this.field1633;
            var15.field1634 = this.field1634;
            var15.field1635 = this.field1635;
            var15.field1637 = this.field1637;
            var15.field1621 = this.field1621;
            var15.field1639 = this.field1639;
            var15.field1660 = this.field1660;
            var15.field1641 = this.field1641;
            var15.field1642 = this.field1642;
            var15.field1651 = this.field1651;
            var15.field1662 = this.field1662;
            var15.field1653 = this.field1653;
            var15.field1645 = this.field1645;
            var15.field1646 = this.field1646;
            var15.field1648 = this.field1648;
            var15.field1652 = this.field1652;
            var15.field1643 = this.field1643;
            var15.field1657 = this.field1657;
            var15.field1655 = this.field1655;
            var15.field1632 = this.field1632;
            var15.field1623 = new int[var15.field1631];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1631; var16++) {
                int var17 = this.field1622[var16] + arg1;
                int var18 = this.field1624[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1623[var16] = this.field1623[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1631; var26++) {
                int var27 = (-this.field1623[var26] << 16) / this.field1383;
                if (var27 < arg5) {
                    int var28 = this.field1622[var26] + arg1;
                    int var29 = this.field1624[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1623[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1623[var26];
                }
            }
        }
        var15.method1924();
        return var15;
    }

    @ObfuscatedName("ce.s()V")
    public void method1913() {
        int var10002;
        if (this.field1648 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1631; var3++) {
                int var4 = this.field1648[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1643 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1643[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1631) {
                int var7 = this.field1648[var6];
                this.field1643[var7][var1[var7]++] = var6++;
            }
            this.field1648 = null;
        }
        if (this.field1652 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1625; var10++) {
            int var11 = this.field1652[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1657 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1657[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1625) {
            int var14 = this.field1652[var13];
            this.field1657[var14][var8[var14]++] = var13++;
        }
        this.field1652 = null;
    }

    @ObfuscatedName("ce.m()V")
    public void method1914() {
        for (int var1 = 0; var1 < this.field1631; var1++) {
            int var2 = this.field1622[var1];
            this.field1622[var1] = this.field1624[var1];
            this.field1624[var1] = -var2;
        }
        this.method1924();
    }

    @ObfuscatedName("ce.y()V")
    public void method1966() {
        for (int var1 = 0; var1 < this.field1631; var1++) {
            this.field1622[var1] = -this.field1622[var1];
            this.field1624[var1] = -this.field1624[var1];
        }
        this.method1924();
    }

    @ObfuscatedName("ce.b()V")
    public void method1916() {
        for (int var1 = 0; var1 < this.field1631; var1++) {
            int var2 = this.field1624[var1];
            this.field1624[var1] = this.field1622[var1];
            this.field1622[var1] = -var2;
        }
        this.method1924();
    }

    @ObfuscatedName("ce.v(I)V")
    public void method1984(int arg0) {
        int var2 = field1666[arg0];
        int var3 = field1649[arg0];
        for (int var4 = 0; var4 < this.field1631; var4++) {
            int var5 = this.field1624[var4] * var2 + this.field1622[var4] * var3 >> 16;
            this.field1624[var4] = this.field1624[var4] * var3 - this.field1622[var4] * var2 >> 16;
            this.field1622[var4] = var5;
        }
        this.method1924();
    }

    @ObfuscatedName("ce.z(III)V")
    public void method1964(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1631; var4++) {
            this.field1622[var4] += arg0;
            this.field1623[var4] += arg1;
            this.field1624[var4] += arg2;
        }
        this.method1924();
    }

    @ObfuscatedName("ce.u(SS)V")
    public void method1919(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1625; var3++) {
            if (this.field1633[var3] == arg0) {
                this.field1633[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ce.g(SS)V")
    public void method1920(short arg0, short arg1) {
        if (this.field1634 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1625; var3++) {
            if (this.field1634[var3] == arg0) {
                this.field1634[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ce.k()V")
    public void method1921() {
        for (int var1 = 0; var1 < this.field1631; var1++) {
            this.field1624[var1] = -this.field1624[var1];
        }
        for (int var2 = 0; var2 < this.field1625; var2++) {
            int var3 = this.field1626[var2];
            this.field1626[var2] = this.field1628[var2];
            this.field1628[var2] = var3;
        }
        this.method1924();
    }

    @ObfuscatedName("ce.o(III)V")
    public void method1922(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1631; var4++) {
            this.field1622[var4] = this.field1622[var4] * arg0 / 128;
            this.field1623[var4] = this.field1623[var4] * arg1 / 128;
            this.field1624[var4] = this.field1624[var4] * arg2 / 128;
        }
        this.method1924();
    }

    @ObfuscatedName("ce.a()V")
    public void method1923() {
        if (this.field1664 != null) {
            return;
        }
        this.field1664 = new class91[this.field1631];
        for (int var1 = 0; var1 < this.field1631; var1++) {
            this.field1664[var1] = new class91();
        }
        for (int var2 = 0; var2 < this.field1625; var2++) {
            int var3 = this.field1626[var2];
            int var4 = this.field1638[var2];
            int var5 = this.field1628[var2];
            int var6 = this.field1622[var4] - this.field1622[var3];
            int var7 = this.field1623[var4] - this.field1623[var3];
            int var8 = this.field1624[var4] - this.field1624[var3];
            int var9 = this.field1622[var5] - this.field1622[var3];
            int var10 = this.field1623[var5] - this.field1623[var3];
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
            if (this.field1647 == null) {
                var19 = 0;
            } else {
                var19 = this.field1647[var2];
            }
            if (var19 == 0) {
                class91 var20 = this.field1664[var3];
                var20.field1561 += var16;
                var20.field1560 += var17;
                var20.field1558 += var18;
                var20.field1559++;
                class91 var21 = this.field1664[var4];
                var21.field1561 += var16;
                var21.field1560 += var17;
                var21.field1558 += var18;
                var21.field1559++;
                class91 var22 = this.field1664[var5];
                var22.field1561 += var16;
                var22.field1560 += var17;
                var22.field1558 += var18;
                var22.field1559++;
            } else if (var19 == 1) {
                if (this.field1629 == null) {
                    this.field1629 = new class79[this.field1625];
                }
                class79 var23 = this.field1629[var2] = new class79();
                var23.field1372 = var16;
                var23.field1374 = var17;
                var23.field1380 = var18;
            }
        }
    }

    @ObfuscatedName("ce.p()V")
    public void method1924() {
        this.field1664 = null;
        this.field1654 = null;
        this.field1629 = null;
        this.field1656 = false;
    }

    @ObfuscatedName("ce.t()V")
    public void method1925() {
        if (this.field1656) {
            return;
        }
        this.field1383 = 0;
        this.field1658 = 0;
        this.field1659 = 999999;
        this.field1667 = -999999;
        this.field1661 = -99999;
        this.field1650 = 99999;
        for (int var1 = 0; var1 < this.field1631; var1++) {
            int var2 = this.field1622[var1];
            int var3 = this.field1623[var1];
            int var4 = this.field1624[var1];
            if (var2 < this.field1659) {
                this.field1659 = var2;
            }
            if (var2 > this.field1667) {
                this.field1667 = var2;
            }
            if (var4 < this.field1650) {
                this.field1650 = var4;
            }
            if (var4 > this.field1661) {
                this.field1661 = var4;
            }
            if (-var3 > this.field1383) {
                this.field1383 = -var3;
            }
            if (var3 > this.field1658) {
                this.field1658 = var3;
            }
        }
        this.field1656 = true;
    }

    @ObfuscatedName("ce.x(Lce;Lce;IIIZ)V")
    public static void method1926(class95 arg0, class95 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1925();
        arg0.method1923();
        arg1.method1925();
        arg1.method1923();
        field1665++;
        int var6 = 0;
        int[] var7 = arg1.field1622;
        int var8 = arg1.field1631;
        for (int var9 = 0; var9 < arg0.field1631; var9++) {
            class91 var10 = arg0.field1664[var9];
            if (var10.field1559 != 0) {
                int var11 = arg0.field1623[var9] - arg3;
                if (var11 <= arg1.field1658) {
                    int var12 = arg0.field1622[var9] - arg2;
                    if (var12 >= arg1.field1659 && var12 <= arg1.field1667) {
                        int var13 = arg0.field1624[var9] - arg4;
                        if (var13 >= arg1.field1650 && var13 <= arg1.field1661) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class91 var15 = arg1.field1664[var14];
                                if (var7[var14] == var12 && arg1.field1624[var14] == var13 && arg1.field1623[var14] == var11 && var15.field1559 != 0) {
                                    if (arg0.field1654 == null) {
                                        arg0.field1654 = new class91[arg0.field1631];
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
                                    var16.field1561 += var15.field1561;
                                    var16.field1560 += var15.field1560;
                                    var16.field1558 += var15.field1558;
                                    var16.field1559 += var15.field1559;
                                    var17.field1561 += var10.field1561;
                                    var17.field1560 += var10.field1560;
                                    var17.field1558 += var10.field1558;
                                    var17.field1559 += var10.field1559;
                                    var6++;
                                    field1663[var9] = field1665;
                                    field1627[var14] = field1665;
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
        for (int var18 = 0; var18 < arg0.field1625; var18++) {
            if (field1663[arg0.field1626[var18]] == field1665 && field1663[arg0.field1638[var18]] == field1665 && field1663[arg0.field1628[var18]] == field1665) {
                if (arg0.field1647 == null) {
                    arg0.field1647 = new byte[arg0.field1625];
                }
                arg0.field1647[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1625; var19++) {
            if (field1627[arg1.field1626[var19]] == field1665 && field1627[arg1.field1638[var19]] == field1665 && field1627[arg1.field1628[var19]] == field1665) {
                if (arg1.field1647 == null) {
                    arg1.field1647 = new byte[arg1.field1625];
                }
                arg1.field1647[var19] = 2;
            }
        }
    }

    @ObfuscatedName("ce.at(IIIII)Lcw;")
    public final class100 method1982(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1923();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class100 var8 = new class100();
        var8.field1736 = new int[this.field1625];
        var8.field1775 = new int[this.field1625];
        var8.field1738 = new int[this.field1625];
        if (this.field1636 > 0 && this.field1640 != null) {
            int[] var9 = new int[this.field1636];
            for (int var10 = 0; var10 < this.field1625; var10++) {
                if (this.field1640[var10] != -1) {
                    var9[this.field1640[var10] & 0xFF]++;
                }
            }
            var8.field1744 = 0;
            for (int var11 = 0; var11 < this.field1636; var11++) {
                if (var9[var11] > 0 && this.field1637[var11] == 0) {
                    var8.field1744++;
                }
            }
            var8.field1745 = new int[var8.field1744];
            var8.field1746 = new int[var8.field1744];
            var8.field1759 = new int[var8.field1744];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1636; var13++) {
                if (var9[var13] > 0 && this.field1637[var13] == 0) {
                    var8.field1745[var12] = this.field1621[var13] & 0xFFFF;
                    var8.field1746[var12] = this.field1639[var13] & 0xFFFF;
                    var8.field1759[var12] = this.field1660[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1741 = new byte[this.field1625];
            for (int var14 = 0; var14 < this.field1625; var14++) {
                if (this.field1640[var14] == -1) {
                    var8.field1741[var14] = -1;
                } else {
                    var8.field1741[var14] = (byte) var9[this.field1640[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1625; var15++) {
            byte var16;
            if (this.field1647 == null) {
                var16 = 0;
            } else {
                var16 = this.field1647[var15];
            }
            byte var17;
            if (this.field1644 == null) {
                var17 = 0;
            } else {
                var17 = this.field1644[var15];
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
                        var20 = this.field1664[this.field1626[var15]];
                    } else {
                        var20 = this.field1654[this.field1626[var15]];
                    }
                    int var21 = (var20.field1558 * arg4 + var20.field1561 * arg2 + var20.field1560 * arg3) / (var20.field1559 * var7) + arg0;
                    var8.field1736[var15] = method1956(var19, var21);
                    class91 var22;
                    if (this.field1654 == null || this.field1654[this.field1638[var15]] == null) {
                        var22 = this.field1664[this.field1638[var15]];
                    } else {
                        var22 = this.field1654[this.field1638[var15]];
                    }
                    int var23 = (var22.field1558 * arg4 + var22.field1561 * arg2 + var22.field1560 * arg3) / (var22.field1559 * var7) + arg0;
                    var8.field1775[var15] = method1956(var19, var23);
                    class91 var24;
                    if (this.field1654 == null || this.field1654[this.field1628[var15]] == null) {
                        var24 = this.field1664[this.field1628[var15]];
                    } else {
                        var24 = this.field1654[this.field1628[var15]];
                    }
                    int var25 = (var24.field1558 * arg4 + var24.field1561 * arg2 + var24.field1560 * arg3) / (var24.field1559 * var7) + arg0;
                    var8.field1738[var15] = method1956(var19, var25);
                } else if (var16 == 1) {
                    class79 var26 = this.field1629[var15];
                    int var27 = (var26.field1380 * arg4 + var26.field1374 * arg3 + var26.field1372 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1736[var15] = method1956(this.field1633[var15] & 0xFFFF, var27);
                    var8.field1738[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1736[var15] = 128;
                    var8.field1738[var15] = -1;
                } else {
                    var8.field1738[var15] = -2;
                }
            } else if (var16 == 0) {
                class91 var28;
                if (this.field1654 == null || this.field1654[this.field1626[var15]] == null) {
                    var28 = this.field1664[this.field1626[var15]];
                } else {
                    var28 = this.field1654[this.field1626[var15]];
                }
                int var29 = (var28.field1558 * arg4 + var28.field1561 * arg2 + var28.field1560 * arg3) / (var28.field1559 * var7) + arg0;
                var8.field1736[var15] = method1928(var29);
                class91 var30;
                if (this.field1654 == null || this.field1654[this.field1638[var15]] == null) {
                    var30 = this.field1664[this.field1638[var15]];
                } else {
                    var30 = this.field1654[this.field1638[var15]];
                }
                int var31 = (var30.field1558 * arg4 + var30.field1561 * arg2 + var30.field1560 * arg3) / (var30.field1559 * var7) + arg0;
                var8.field1775[var15] = method1928(var31);
                class91 var32;
                if (this.field1654 == null || this.field1654[this.field1628[var15]] == null) {
                    var32 = this.field1664[this.field1628[var15]];
                } else {
                    var32 = this.field1654[this.field1628[var15]];
                }
                int var33 = (var32.field1558 * arg4 + var32.field1561 * arg2 + var32.field1560 * arg3) / (var32.field1559 * var7) + arg0;
                var8.field1738[var15] = method1928(var33);
            } else if (var16 == 1) {
                class79 var34 = this.field1629[var15];
                int var35 = (var34.field1380 * arg4 + var34.field1374 * arg3 + var34.field1372 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1736[var15] = method1928(var35);
                var8.field1738[var15] = -1;
            } else {
                var8.field1738[var15] = -2;
            }
        }
        this.method1913();
        var8.field1728 = this.field1631;
        var8.field1753 = this.field1622;
        var8.field1772 = this.field1623;
        var8.field1743 = this.field1624;
        var8.field1731 = this.field1625;
        var8.field1733 = this.field1626;
        var8.field1768 = this.field1638;
        var8.field1735 = this.field1628;
        var8.field1739 = this.field1630;
        var8.field1784 = this.field1644;
        var8.field1724 = this.field1635;
        var8.field1748 = this.field1643;
        var8.field1749 = this.field1657;
        var8.field1742 = this.field1634;
        return var8;
    }

    @ObfuscatedName("ce.av(II)I")
    public static final int method1956(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ce.ar(I)I")
    public static final int method1928(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
