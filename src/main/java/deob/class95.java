package deob;

@ObfuscatedName("cc")
public class class95 extends class80 {

    @ObfuscatedName("cc.y")
    public int field1639 = 0;

    @ObfuscatedName("cc.k")
    public int[] field1617;

    @ObfuscatedName("cc.g")
    public int[] field1650;

    @ObfuscatedName("cc.n")
    public int[] field1619;

    @ObfuscatedName("cc.t")
    public int field1620 = 0;

    @ObfuscatedName("cc.e")
    public int[] field1625;

    @ObfuscatedName("cc.q")
    public int[] field1622;

    @ObfuscatedName("cc.z")
    public int[] field1623;

    @ObfuscatedName("cc.v")
    public byte[] field1624;

    @ObfuscatedName("cc.b")
    public byte[] field1630;

    @ObfuscatedName("cc.f")
    public byte[] field1658;

    @ObfuscatedName("cc.i")
    public byte[] field1629;

    @ObfuscatedName("cc.w")
    public short[] field1628;

    @ObfuscatedName("cc.l")
    public short[] field1645;

    @ObfuscatedName("cc.j")
    public byte field1659 = 0;

    @ObfuscatedName("cc.s")
    public int field1621;

    @ObfuscatedName("cc.r")
    public byte[] field1632;

    @ObfuscatedName("cc.h")
    public short[] field1633;

    @ObfuscatedName("cc.x")
    public short[] field1634;

    @ObfuscatedName("cc.m")
    public short[] field1635;

    @ObfuscatedName("cc.a")
    public short[] field1636;

    @ObfuscatedName("cc.p")
    public short[] field1637;

    @ObfuscatedName("cc.c")
    public short[] field1631;

    @ObfuscatedName("cc.u")
    public short[] field1627;

    @ObfuscatedName("cc.d")
    public short[] field1640;

    @ObfuscatedName("cc.o")
    public short[] field1626;

    @ObfuscatedName("cc.aj")
    public byte[] field1638;

    @ObfuscatedName("cc.au")
    public int[] field1643;

    @ObfuscatedName("cc.ah")
    public int[] field1644;

    @ObfuscatedName("cc.ab")
    public int[][] field1642;

    @ObfuscatedName("cc.am")
    public int[][] field1646;

    @ObfuscatedName("cc.ar")
    public class79[] field1647;

    @ObfuscatedName("cc.an")
    public class91[] field1654;

    @ObfuscatedName("cc.az")
    public class91[] field1649;

    @ObfuscatedName("cc.at")
    public short field1616;

    @ObfuscatedName("cc.ag")
    public short field1651;

    @ObfuscatedName("cc.as")
    public boolean field1652 = false;

    @ObfuscatedName("cc.ao")
    public int field1653;

    @ObfuscatedName("cc.af")
    public int field1641;

    @ObfuscatedName("cc.ay")
    public int field1655;

    @ObfuscatedName("cc.aq")
    public int field1656;

    @ObfuscatedName("cc.aw")
    public int field1657;

    @ObfuscatedName("cc.al")
    public static int[] field1661 = new int[10000];

    @ObfuscatedName("cc.ap")
    public static int[] field1662 = new int[10000];

    @ObfuscatedName("cc.ac")
    public static int field1660 = 0;

    @ObfuscatedName("cc.av")
    public static int[] field1618 = class86.field1510;

    @ObfuscatedName("cc.ai")
    public static int[] field1648 = class86.field1501;

    public class95() {
    }

    @ObfuscatedName("cc.y(Lfd;II)Lcc;")
    public static class95 method1900(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2874(arg1, arg2);
        return var3 == null ? null : new class95(var3);
    }

    public class95(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1905(arg0);
        } else {
            this.method1973(arg0);
        }
    }

    @ObfuscatedName("cc.g([B)V")
    public void method1905(byte[] arg0) {
        class111 var2 = new class111(arg0);
        class111 var3 = new class111(arg0);
        class111 var4 = new class111(arg0);
        class111 var5 = new class111(arg0);
        class111 var6 = new class111(arg0);
        class111 var7 = new class111(arg0);
        class111 var8 = new class111(arg0);
        var2.field1902 = arg0.length - 23;
        int var9 = var2.method2339();
        int var10 = var2.method2339();
        int var11 = var2.method2205();
        int var12 = var2.method2205();
        int var13 = var2.method2205();
        int var14 = var2.method2205();
        int var15 = var2.method2205();
        int var16 = var2.method2205();
        int var17 = var2.method2205();
        int var18 = var2.method2339();
        int var19 = var2.method2339();
        int var20 = var2.method2339();
        int var21 = var2.method2339();
        int var22 = var2.method2339();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1632 = new byte[var11];
            var2.field1902 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1632[var26] = var2.method2199();
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
        this.field1639 = var9;
        this.field1620 = var10;
        this.field1621 = var11;
        this.field1617 = new int[var9];
        this.field1650 = new int[var9];
        this.field1619 = new int[var9];
        this.field1625 = new int[var10];
        this.field1622 = new int[var10];
        this.field1623 = new int[var10];
        if (var17 == 1) {
            this.field1643 = new int[var9];
        }
        if (var12 == 1) {
            this.field1624 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1630 = new byte[var10];
        } else {
            this.field1659 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1658 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1644 = new int[var10];
        }
        if (var16 == 1) {
            this.field1645 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1629 = new byte[var10];
        }
        this.field1628 = new short[var10];
        if (var11 > 0) {
            this.field1633 = new short[var11];
            this.field1634 = new short[var11];
            this.field1635 = new short[var11];
            if (var24 > 0) {
                this.field1636 = new short[var24];
                this.field1637 = new short[var24];
                this.field1631 = new short[var24];
                this.field1627 = new short[var24];
                this.field1638 = new byte[var24];
                this.field1640 = new short[var24];
            }
            if (var25 > 0) {
                this.field1626 = new short[var25];
            }
        }
        var2.field1902 = var11;
        var3.field1902 = var44;
        var4.field1902 = var46;
        var5.field1902 = var48;
        var6.field1902 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2205();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2172();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2172();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2172();
            }
            this.field1617[var67] = var64 + var69;
            this.field1650[var67] = var65 + var70;
            this.field1619[var67] = var66 + var71;
            var64 = this.field1617[var67];
            var65 = this.field1650[var67];
            var66 = this.field1619[var67];
            if (var17 == 1) {
                this.field1643[var67] = var6.method2205();
            }
        }
        var2.field1902 = var42;
        var3.field1902 = var31;
        var4.field1902 = var34;
        var5.field1902 = var37;
        var6.field1902 = var35;
        var7.field1902 = var40;
        var8.field1902 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1628[var72] = (short) var2.method2339();
            if (var12 == 1) {
                this.field1624[var72] = var3.method2199();
            }
            if (var13 == 255) {
                this.field1630[var72] = var4.method2199();
            }
            if (var14 == 1) {
                this.field1658[var72] = var5.method2199();
            }
            if (var15 == 1) {
                this.field1644[var72] = var6.method2205();
            }
            if (var16 == 1) {
                this.field1645[var72] = (short) (var7.method2339() - 1);
            }
            if (this.field1629 != null && this.field1645[var72] != -1) {
                this.field1629[var72] = (byte) (var8.method2205() - 1);
            }
        }
        var2.field1902 = var33;
        var3.field1902 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2205();
            if (var78 == 1) {
                var73 = var2.method2172() + var76;
                var74 = var2.method2172() + var73;
                var75 = var2.method2172() + var74;
                var76 = var75;
                this.field1625[var77] = var73;
                this.field1622[var77] = var74;
                this.field1623[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2172() + var76;
                var76 = var75;
                this.field1625[var77] = var73;
                this.field1622[var77] = var74;
                this.field1623[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2172() + var76;
                var76 = var75;
                this.field1625[var77] = var73;
                this.field1622[var77] = var74;
                this.field1623[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2172() + var76;
                var76 = var75;
                this.field1625[var77] = var73;
                this.field1622[var77] = var81;
                this.field1623[var77] = var75;
            }
        }
        var2.field1902 = var50;
        var3.field1902 = var52;
        var4.field1902 = var54;
        var5.field1902 = var56;
        var6.field1902 = var58;
        var7.field1902 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1632[var82] & 0xFF;
            if (var83 == 0) {
                this.field1633[var82] = (short) var2.method2339();
                this.field1634[var82] = (short) var2.method2339();
                this.field1635[var82] = (short) var2.method2339();
            }
            if (var83 == 1) {
                this.field1633[var82] = (short) var3.method2339();
                this.field1634[var82] = (short) var3.method2339();
                this.field1635[var82] = (short) var3.method2339();
                this.field1636[var82] = (short) var4.method2339();
                this.field1637[var82] = (short) var4.method2339();
                this.field1631[var82] = (short) var4.method2339();
                this.field1627[var82] = (short) var5.method2339();
                this.field1638[var82] = var6.method2199();
                this.field1640[var82] = (short) var7.method2339();
            }
            if (var83 == 2) {
                this.field1633[var82] = (short) var3.method2339();
                this.field1634[var82] = (short) var3.method2339();
                this.field1635[var82] = (short) var3.method2339();
                this.field1636[var82] = (short) var4.method2339();
                this.field1637[var82] = (short) var4.method2339();
                this.field1631[var82] = (short) var4.method2339();
                this.field1627[var82] = (short) var5.method2339();
                this.field1638[var82] = var6.method2199();
                this.field1640[var82] = (short) var7.method2339();
                this.field1626[var82] = (short) var7.method2339();
            }
            if (var83 == 3) {
                this.field1633[var82] = (short) var3.method2339();
                this.field1634[var82] = (short) var3.method2339();
                this.field1635[var82] = (short) var3.method2339();
                this.field1636[var82] = (short) var4.method2339();
                this.field1637[var82] = (short) var4.method2339();
                this.field1631[var82] = (short) var4.method2339();
                this.field1627[var82] = (short) var5.method2339();
                this.field1638[var82] = var6.method2199();
                this.field1640[var82] = (short) var7.method2339();
            }
        }
        var2.field1902 = var62;
        int var84 = var2.method2205();
        if (var84 == 0) {
            return;
        }
        new class85();
        var2.method2339();
        var2.method2339();
        var2.method2339();
        var2.method2165();
    }

    @ObfuscatedName("cc.n([B)V")
    public void method1973(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class111 var4 = new class111(arg0);
        class111 var5 = new class111(arg0);
        class111 var6 = new class111(arg0);
        class111 var7 = new class111(arg0);
        class111 var8 = new class111(arg0);
        var4.field1902 = arg0.length - 18;
        int var9 = var4.method2339();
        int var10 = var4.method2339();
        int var11 = var4.method2205();
        int var12 = var4.method2205();
        int var13 = var4.method2205();
        int var14 = var4.method2205();
        int var15 = var4.method2205();
        int var16 = var4.method2205();
        int var17 = var4.method2339();
        int var18 = var4.method2339();
        int var19 = var4.method2339();
        int var20 = var4.method2339();
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
        this.field1639 = var9;
        this.field1620 = var10;
        this.field1621 = var11;
        this.field1617 = new int[var9];
        this.field1650 = new int[var9];
        this.field1619 = new int[var9];
        this.field1625 = new int[var10];
        this.field1622 = new int[var10];
        this.field1623 = new int[var10];
        if (var11 > 0) {
            this.field1632 = new byte[var11];
            this.field1633 = new short[var11];
            this.field1634 = new short[var11];
            this.field1635 = new short[var11];
        }
        if (var16 == 1) {
            this.field1643 = new int[var9];
        }
        if (var12 == 1) {
            this.field1624 = new byte[var10];
            this.field1629 = new byte[var10];
            this.field1645 = new short[var10];
        }
        if (var13 == 255) {
            this.field1630 = new byte[var10];
        } else {
            this.field1659 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1658 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1644 = new int[var10];
        }
        this.field1628 = new short[var10];
        var4.field1902 = var21;
        var5.field1902 = var36;
        var6.field1902 = var38;
        var7.field1902 = var40;
        var8.field1902 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2205();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2172();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2172();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2172();
            }
            this.field1617[var46] = var43 + var48;
            this.field1650[var46] = var44 + var49;
            this.field1619[var46] = var45 + var50;
            var43 = this.field1617[var46];
            var44 = this.field1650[var46];
            var45 = this.field1619[var46];
            if (var16 == 1) {
                this.field1643[var46] = var8.method2205();
            }
        }
        var4.field1902 = var32;
        var5.field1902 = var28;
        var6.field1902 = var26;
        var7.field1902 = var30;
        var8.field1902 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1628[var51] = (short) var4.method2339();
            if (var12 == 1) {
                int var52 = var5.method2205();
                if ((var52 & 0x1) == 1) {
                    this.field1624[var51] = 1;
                    var2 = true;
                } else {
                    this.field1624[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1629[var51] = (byte) (var52 >> 2);
                    this.field1645[var51] = this.field1628[var51];
                    this.field1628[var51] = 127;
                    if (this.field1645[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1629[var51] = -1;
                    this.field1645[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1630[var51] = var6.method2199();
            }
            if (var14 == 1) {
                this.field1658[var51] = var7.method2199();
            }
            if (var15 == 1) {
                this.field1644[var51] = var8.method2205();
            }
        }
        var4.field1902 = var25;
        var5.field1902 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2205();
            if (var58 == 1) {
                var53 = var4.method2172() + var56;
                var54 = var4.method2172() + var53;
                var55 = var4.method2172() + var54;
                var56 = var55;
                this.field1625[var57] = var53;
                this.field1622[var57] = var54;
                this.field1623[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2172() + var56;
                var56 = var55;
                this.field1625[var57] = var53;
                this.field1622[var57] = var54;
                this.field1623[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2172() + var56;
                var56 = var55;
                this.field1625[var57] = var53;
                this.field1622[var57] = var54;
                this.field1623[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2172() + var56;
                var56 = var55;
                this.field1625[var57] = var53;
                this.field1622[var57] = var61;
                this.field1623[var57] = var55;
            }
        }
        var4.field1902 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1632[var62] = 0;
            this.field1633[var62] = (short) var4.method2339();
            this.field1634[var62] = (short) var4.method2339();
            this.field1635[var62] = (short) var4.method2339();
        }
        if (this.field1629 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1629[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1633[var65] & 0xFFFF) == this.field1625[var64] && (this.field1634[var65] & 0xFFFF) == this.field1622[var64] && (this.field1635[var65] & 0xFFFF) == this.field1623[var64]) {
                        this.field1629[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1629 = null;
            }
        }
        if (!var3) {
            this.field1645 = null;
        }
        if (!var2) {
            this.field1624 = null;
        }
    }

    public class95(class95[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1639 = 0;
        this.field1620 = 0;
        this.field1621 = 0;
        this.field1659 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class95 var10 = arg0[var9];
            if (var10 != null) {
                this.field1639 += var10.field1639;
                this.field1620 += var10.field1620;
                this.field1621 += var10.field1621;
                if (var10.field1630 == null) {
                    if (this.field1659 == -1) {
                        this.field1659 = var10.field1659;
                    }
                    if (this.field1659 != var10.field1659) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1624 != null;
                var5 |= var10.field1658 != null;
                var6 |= var10.field1644 != null;
                var7 |= var10.field1645 != null;
                var8 |= var10.field1629 != null;
            }
        }
        this.field1617 = new int[this.field1639];
        this.field1650 = new int[this.field1639];
        this.field1619 = new int[this.field1639];
        this.field1643 = new int[this.field1639];
        this.field1625 = new int[this.field1620];
        this.field1622 = new int[this.field1620];
        this.field1623 = new int[this.field1620];
        if (var3) {
            this.field1624 = new byte[this.field1620];
        }
        if (var4) {
            this.field1630 = new byte[this.field1620];
        }
        if (var5) {
            this.field1658 = new byte[this.field1620];
        }
        if (var6) {
            this.field1644 = new int[this.field1620];
        }
        if (var7) {
            this.field1645 = new short[this.field1620];
        }
        if (var8) {
            this.field1629 = new byte[this.field1620];
        }
        this.field1628 = new short[this.field1620];
        if (this.field1621 > 0) {
            this.field1632 = new byte[this.field1621];
            this.field1633 = new short[this.field1621];
            this.field1634 = new short[this.field1621];
            this.field1635 = new short[this.field1621];
            this.field1636 = new short[this.field1621];
            this.field1637 = new short[this.field1621];
            this.field1631 = new short[this.field1621];
            this.field1627 = new short[this.field1621];
            this.field1638 = new byte[this.field1621];
            this.field1640 = new short[this.field1621];
            this.field1626 = new short[this.field1621];
        }
        this.field1639 = 0;
        this.field1620 = 0;
        this.field1621 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class95 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1620; var13++) {
                    if (var3 && var12.field1624 != null) {
                        this.field1624[this.field1620] = var12.field1624[var13];
                    }
                    if (var4) {
                        if (var12.field1630 == null) {
                            this.field1630[this.field1620] = var12.field1659;
                        } else {
                            this.field1630[this.field1620] = var12.field1630[var13];
                        }
                    }
                    if (var5 && var12.field1658 != null) {
                        this.field1658[this.field1620] = var12.field1658[var13];
                    }
                    if (var6 && var12.field1644 != null) {
                        this.field1644[this.field1620] = var12.field1644[var13];
                    }
                    if (var7) {
                        if (var12.field1645 == null) {
                            this.field1645[this.field1620] = -1;
                        } else {
                            this.field1645[this.field1620] = var12.field1645[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1629 == null || var12.field1629[var13] == -1) {
                            this.field1629[this.field1620] = -1;
                        } else {
                            this.field1629[this.field1620] = (byte) (var12.field1629[var13] + this.field1621);
                        }
                    }
                    this.field1628[this.field1620] = var12.field1628[var13];
                    this.field1625[this.field1620] = this.method1967(var12, var12.field1625[var13]);
                    this.field1622[this.field1620] = this.method1967(var12, var12.field1622[var13]);
                    this.field1623[this.field1620] = this.method1967(var12, var12.field1623[var13]);
                    this.field1620++;
                }
                for (int var14 = 0; var14 < var12.field1621; var14++) {
                    byte var15 = this.field1632[this.field1621] = var12.field1632[var14];
                    if (var15 == 0) {
                        this.field1633[this.field1621] = (short) this.method1967(var12, var12.field1633[var14]);
                        this.field1634[this.field1621] = (short) this.method1967(var12, var12.field1634[var14]);
                        this.field1635[this.field1621] = (short) this.method1967(var12, var12.field1635[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1633[this.field1621] = var12.field1633[var14];
                        this.field1634[this.field1621] = var12.field1634[var14];
                        this.field1635[this.field1621] = var12.field1635[var14];
                        this.field1636[this.field1621] = var12.field1636[var14];
                        this.field1637[this.field1621] = var12.field1637[var14];
                        this.field1631[this.field1621] = var12.field1631[var14];
                        this.field1627[this.field1621] = var12.field1627[var14];
                        this.field1638[this.field1621] = var12.field1638[var14];
                        this.field1640[this.field1621] = var12.field1640[var14];
                    }
                    if (var15 == 2) {
                        this.field1626[this.field1621] = var12.field1626[var14];
                    }
                    this.field1621++;
                }
            }
        }
    }

    @ObfuscatedName("cc.z(Lcc;I)I")
    public final int method1967(class95 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1617[arg1];
        int var5 = arg0.field1650[arg1];
        int var6 = arg0.field1619[arg1];
        for (int var7 = 0; var7 < this.field1639; var7++) {
            if (this.field1617[var7] == var4 && this.field1650[var7] == var5 && this.field1619[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1617[this.field1639] = var4;
            this.field1650[this.field1639] = var5;
            this.field1619[this.field1639] = var6;
            if (arg0.field1643 != null) {
                this.field1643[this.field1639] = arg0.field1643[arg1];
            }
            var3 = this.field1639++;
        }
        return var3;
    }

    public class95(class95 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1639 = arg0.field1639;
        this.field1620 = arg0.field1620;
        this.field1621 = arg0.field1621;
        if (arg1) {
            this.field1617 = arg0.field1617;
            this.field1650 = arg0.field1650;
            this.field1619 = arg0.field1619;
        } else {
            this.field1617 = new int[this.field1639];
            this.field1650 = new int[this.field1639];
            this.field1619 = new int[this.field1639];
            for (int var6 = 0; var6 < this.field1639; var6++) {
                this.field1617[var6] = arg0.field1617[var6];
                this.field1650[var6] = arg0.field1650[var6];
                this.field1619[var6] = arg0.field1619[var6];
            }
        }
        if (arg2) {
            this.field1628 = arg0.field1628;
        } else {
            this.field1628 = new short[this.field1620];
            for (int var7 = 0; var7 < this.field1620; var7++) {
                this.field1628[var7] = arg0.field1628[var7];
            }
        }
        if (arg3 || arg0.field1645 == null) {
            this.field1645 = arg0.field1645;
        } else {
            this.field1645 = new short[this.field1620];
            for (int var8 = 0; var8 < this.field1620; var8++) {
                this.field1645[var8] = arg0.field1645[var8];
            }
        }
        if (arg4) {
            this.field1658 = arg0.field1658;
        } else {
            this.field1658 = new byte[this.field1620];
            if (arg0.field1658 == null) {
                for (int var9 = 0; var9 < this.field1620; var9++) {
                    this.field1658[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1620; var10++) {
                    this.field1658[var10] = arg0.field1658[var10];
                }
            }
        }
        this.field1625 = arg0.field1625;
        this.field1622 = arg0.field1622;
        this.field1623 = arg0.field1623;
        this.field1624 = arg0.field1624;
        this.field1630 = arg0.field1630;
        this.field1629 = arg0.field1629;
        this.field1659 = arg0.field1659;
        this.field1632 = arg0.field1632;
        this.field1633 = arg0.field1633;
        this.field1634 = arg0.field1634;
        this.field1635 = arg0.field1635;
        this.field1636 = arg0.field1636;
        this.field1637 = arg0.field1637;
        this.field1631 = arg0.field1631;
        this.field1627 = arg0.field1627;
        this.field1638 = arg0.field1638;
        this.field1640 = arg0.field1640;
        this.field1626 = arg0.field1626;
        this.field1643 = arg0.field1643;
        this.field1644 = arg0.field1644;
        this.field1642 = arg0.field1642;
        this.field1646 = arg0.field1646;
        this.field1654 = arg0.field1654;
        this.field1647 = arg0.field1647;
        this.field1649 = arg0.field1649;
        this.field1616 = arg0.field1616;
        this.field1651 = arg0.field1651;
    }

    @ObfuscatedName("cc.v()Lcc;")
    public class95 method1901() {
        class95 var1 = new class95();
        if (this.field1624 != null) {
            var1.field1624 = new byte[this.field1620];
            for (int var2 = 0; var2 < this.field1620; var2++) {
                var1.field1624[var2] = this.field1624[var2];
            }
        }
        var1.field1639 = this.field1639;
        var1.field1620 = this.field1620;
        var1.field1621 = this.field1621;
        var1.field1617 = this.field1617;
        var1.field1650 = this.field1650;
        var1.field1619 = this.field1619;
        var1.field1625 = this.field1625;
        var1.field1622 = this.field1622;
        var1.field1623 = this.field1623;
        var1.field1630 = this.field1630;
        var1.field1658 = this.field1658;
        var1.field1629 = this.field1629;
        var1.field1628 = this.field1628;
        var1.field1645 = this.field1645;
        var1.field1659 = this.field1659;
        var1.field1632 = this.field1632;
        var1.field1633 = this.field1633;
        var1.field1634 = this.field1634;
        var1.field1635 = this.field1635;
        var1.field1636 = this.field1636;
        var1.field1637 = this.field1637;
        var1.field1631 = this.field1631;
        var1.field1627 = this.field1627;
        var1.field1638 = this.field1638;
        var1.field1640 = this.field1640;
        var1.field1626 = this.field1626;
        var1.field1643 = this.field1643;
        var1.field1644 = this.field1644;
        var1.field1642 = this.field1642;
        var1.field1646 = this.field1646;
        var1.field1654 = this.field1654;
        var1.field1647 = this.field1647;
        var1.field1616 = this.field1616;
        var1.field1651 = this.field1651;
        return var1;
    }

    @ObfuscatedName("cc.b([[IIIIZI)Lcc;")
    public class95 method1908(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1920();
        int var7 = this.field1641 + arg1;
        int var8 = this.field1655 + arg1;
        int var9 = this.field1657 + arg3;
        int var10 = this.field1656 + arg3;
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
            var15.field1639 = this.field1639;
            var15.field1620 = this.field1620;
            var15.field1621 = this.field1621;
            var15.field1617 = this.field1617;
            var15.field1619 = this.field1619;
            var15.field1625 = this.field1625;
            var15.field1622 = this.field1622;
            var15.field1623 = this.field1623;
            var15.field1624 = this.field1624;
            var15.field1630 = this.field1630;
            var15.field1658 = this.field1658;
            var15.field1629 = this.field1629;
            var15.field1628 = this.field1628;
            var15.field1645 = this.field1645;
            var15.field1659 = this.field1659;
            var15.field1632 = this.field1632;
            var15.field1633 = this.field1633;
            var15.field1634 = this.field1634;
            var15.field1635 = this.field1635;
            var15.field1636 = this.field1636;
            var15.field1637 = this.field1637;
            var15.field1631 = this.field1631;
            var15.field1627 = this.field1627;
            var15.field1638 = this.field1638;
            var15.field1640 = this.field1640;
            var15.field1626 = this.field1626;
            var15.field1643 = this.field1643;
            var15.field1644 = this.field1644;
            var15.field1642 = this.field1642;
            var15.field1646 = this.field1646;
            var15.field1616 = this.field1616;
            var15.field1651 = this.field1651;
            var15.field1650 = new int[var15.field1639];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1639; var16++) {
                int var17 = this.field1617[var16] + arg1;
                int var18 = this.field1619[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1650[var16] = this.field1650[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1639; var26++) {
                int var27 = (-this.field1650[var26] << 16) / this.field1383;
                if (var27 < arg5) {
                    int var28 = this.field1617[var26] + arg1;
                    int var29 = this.field1619[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1650[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1650[var26];
                }
            }
        }
        var15.method1911();
        return var15;
    }

    @ObfuscatedName("cc.f()V")
    public void method1919() {
        int var10002;
        if (this.field1643 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1639; var3++) {
                int var4 = this.field1643[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1642 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1642[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1639) {
                int var7 = this.field1643[var6];
                this.field1642[var7][var1[var7]++] = var6++;
            }
            this.field1643 = null;
        }
        if (this.field1644 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1620; var10++) {
            int var11 = this.field1644[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1646 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1646[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1620) {
            int var14 = this.field1644[var13];
            this.field1646[var14][var8[var14]++] = var13++;
        }
        this.field1644 = null;
    }

    @ObfuscatedName("cc.i()V")
    public void method1909() {
        for (int var1 = 0; var1 < this.field1639; var1++) {
            int var2 = this.field1617[var1];
            this.field1617[var1] = this.field1619[var1];
            this.field1619[var1] = -var2;
        }
        this.method1911();
    }

    @ObfuscatedName("cc.w()V")
    public void method1910() {
        for (int var1 = 0; var1 < this.field1639; var1++) {
            this.field1617[var1] = -this.field1617[var1];
            this.field1619[var1] = -this.field1619[var1];
        }
        this.method1911();
    }

    @ObfuscatedName("cc.l()V")
    public void method1940() {
        for (int var1 = 0; var1 < this.field1639; var1++) {
            int var2 = this.field1619[var1];
            this.field1619[var1] = this.field1617[var1];
            this.field1617[var1] = -var2;
        }
        this.method1911();
    }

    @ObfuscatedName("cc.j(I)V")
    public void method1912(int arg0) {
        int var2 = field1618[arg0];
        int var3 = field1648[arg0];
        for (int var4 = 0; var4 < this.field1639; var4++) {
            int var5 = this.field1619[var4] * var2 + this.field1617[var4] * var3 >> 16;
            this.field1619[var4] = this.field1619[var4] * var3 - this.field1617[var4] * var2 >> 16;
            this.field1617[var4] = var5;
        }
        this.method1911();
    }

    @ObfuscatedName("cc.s(III)V")
    public void method1913(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1639; var4++) {
            this.field1617[var4] += arg0;
            this.field1650[var4] += arg1;
            this.field1619[var4] += arg2;
        }
        this.method1911();
    }

    @ObfuscatedName("cc.r(SS)V")
    public void method1922(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1620; var3++) {
            if (this.field1628[var3] == arg0) {
                this.field1628[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cc.h(SS)V")
    public void method1915(short arg0, short arg1) {
        if (this.field1645 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1620; var3++) {
            if (this.field1645[var3] == arg0) {
                this.field1645[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cc.x()V")
    public void method1916() {
        for (int var1 = 0; var1 < this.field1639; var1++) {
            this.field1619[var1] = -this.field1619[var1];
        }
        for (int var2 = 0; var2 < this.field1620; var2++) {
            int var3 = this.field1625[var2];
            this.field1625[var2] = this.field1623[var2];
            this.field1623[var2] = var3;
        }
        this.method1911();
    }

    @ObfuscatedName("cc.d(III)V")
    public void method1899(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1639; var4++) {
            this.field1617[var4] = this.field1617[var4] * arg0 / 128;
            this.field1650[var4] = this.field1650[var4] * arg1 / 128;
            this.field1619[var4] = this.field1619[var4] * arg2 / 128;
        }
        this.method1911();
    }

    @ObfuscatedName("cc.o()V")
    public void method1907() {
        if (this.field1654 != null) {
            return;
        }
        this.field1654 = new class91[this.field1639];
        for (int var1 = 0; var1 < this.field1639; var1++) {
            this.field1654[var1] = new class91();
        }
        for (int var2 = 0; var2 < this.field1620; var2++) {
            int var3 = this.field1625[var2];
            int var4 = this.field1622[var2];
            int var5 = this.field1623[var2];
            int var6 = this.field1617[var4] - this.field1617[var3];
            int var7 = this.field1650[var4] - this.field1650[var3];
            int var8 = this.field1619[var4] - this.field1619[var3];
            int var9 = this.field1617[var5] - this.field1617[var3];
            int var10 = this.field1650[var5] - this.field1650[var3];
            int var11 = this.field1619[var5] - this.field1619[var3];
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
            if (this.field1624 == null) {
                var19 = 0;
            } else {
                var19 = this.field1624[var2];
            }
            if (var19 == 0) {
                class91 var20 = this.field1654[var3];
                var20.field1558 += var16;
                var20.field1556 += var17;
                var20.field1563 += var18;
                var20.field1557++;
                class91 var21 = this.field1654[var4];
                var21.field1558 += var16;
                var21.field1556 += var17;
                var21.field1563 += var18;
                var21.field1557++;
                class91 var22 = this.field1654[var5];
                var22.field1558 += var16;
                var22.field1556 += var17;
                var22.field1563 += var18;
                var22.field1557++;
            } else if (var19 == 1) {
                if (this.field1647 == null) {
                    this.field1647 = new class79[this.field1620];
                }
                class79 var23 = this.field1647[var2] = new class79();
                var23.field1379 = var16;
                var23.field1371 = var17;
                var23.field1372 = var18;
            }
        }
    }

    @ObfuscatedName("cc.aj()V")
    public void method1911() {
        this.field1654 = null;
        this.field1649 = null;
        this.field1647 = null;
        this.field1652 = false;
    }

    @ObfuscatedName("cc.au()V")
    public void method1920() {
        if (this.field1652) {
            return;
        }
        this.field1383 = 0;
        this.field1653 = 0;
        this.field1641 = 999999;
        this.field1655 = -999999;
        this.field1656 = -99999;
        this.field1657 = 99999;
        for (int var1 = 0; var1 < this.field1639; var1++) {
            int var2 = this.field1617[var1];
            int var3 = this.field1650[var1];
            int var4 = this.field1619[var1];
            if (var2 < this.field1641) {
                this.field1641 = var2;
            }
            if (var2 > this.field1655) {
                this.field1655 = var2;
            }
            if (var4 < this.field1657) {
                this.field1657 = var4;
            }
            if (var4 > this.field1656) {
                this.field1656 = var4;
            }
            if (-var3 > this.field1383) {
                this.field1383 = -var3;
            }
            if (var3 > this.field1653) {
                this.field1653 = var3;
            }
        }
        this.field1652 = true;
    }

    @ObfuscatedName("cc.ah(Lcc;Lcc;IIIZ)V")
    public static void method1921(class95 arg0, class95 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1920();
        arg0.method1907();
        arg1.method1920();
        arg1.method1907();
        field1660++;
        int var6 = 0;
        int[] var7 = arg1.field1617;
        int var8 = arg1.field1639;
        for (int var9 = 0; var9 < arg0.field1639; var9++) {
            class91 var10 = arg0.field1654[var9];
            if (var10.field1557 != 0) {
                int var11 = arg0.field1650[var9] - arg3;
                if (var11 <= arg1.field1653) {
                    int var12 = arg0.field1617[var9] - arg2;
                    if (var12 >= arg1.field1641 && var12 <= arg1.field1655) {
                        int var13 = arg0.field1619[var9] - arg4;
                        if (var13 >= arg1.field1657 && var13 <= arg1.field1656) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class91 var15 = arg1.field1654[var14];
                                if (var7[var14] == var12 && arg1.field1619[var14] == var13 && arg1.field1650[var14] == var11 && var15.field1557 != 0) {
                                    if (arg0.field1649 == null) {
                                        arg0.field1649 = new class91[arg0.field1639];
                                    }
                                    if (arg1.field1649 == null) {
                                        arg1.field1649 = new class91[var8];
                                    }
                                    class91 var16 = arg0.field1649[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1649[var9] = new class91(var10);
                                    }
                                    class91 var17 = arg1.field1649[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1649[var14] = new class91(var15);
                                    }
                                    var16.field1558 += var15.field1558;
                                    var16.field1556 += var15.field1556;
                                    var16.field1563 += var15.field1563;
                                    var16.field1557 += var15.field1557;
                                    var17.field1558 += var10.field1558;
                                    var17.field1556 += var10.field1556;
                                    var17.field1563 += var10.field1563;
                                    var17.field1557 += var10.field1557;
                                    var6++;
                                    field1661[var9] = field1660;
                                    field1662[var14] = field1660;
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
        for (int var18 = 0; var18 < arg0.field1620; var18++) {
            if (field1661[arg0.field1625[var18]] == field1660 && field1661[arg0.field1622[var18]] == field1660 && field1661[arg0.field1623[var18]] == field1660) {
                if (arg0.field1624 == null) {
                    arg0.field1624 = new byte[arg0.field1620];
                }
                arg0.field1624[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1620; var19++) {
            if (field1662[arg1.field1625[var19]] == field1660 && field1662[arg1.field1622[var19]] == field1660 && field1662[arg1.field1623[var19]] == field1660) {
                if (arg1.field1624 == null) {
                    arg1.field1624 = new byte[arg1.field1620];
                }
                arg1.field1624[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cc.ab(IIIII)Lch;")
    public final class100 method1953(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1907();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class100 var8 = new class100();
        var8.field1779 = new int[this.field1620];
        var8.field1746 = new int[this.field1620];
        var8.field1747 = new int[this.field1620];
        if (this.field1621 > 0 && this.field1629 != null) {
            int[] var9 = new int[this.field1621];
            for (int var10 = 0; var10 < this.field1620; var10++) {
                if (this.field1629[var10] != -1) {
                    var9[this.field1629[var10] & 0xFF]++;
                }
            }
            var8.field1753 = 0;
            for (int var11 = 0; var11 < this.field1621; var11++) {
                if (var9[var11] > 0 && this.field1632[var11] == 0) {
                    var8.field1753++;
                }
            }
            var8.field1754 = new int[var8.field1753];
            var8.field1755 = new int[var8.field1753];
            var8.field1792 = new int[var8.field1753];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1621; var13++) {
                if (var9[var13] > 0 && this.field1632[var13] == 0) {
                    var8.field1754[var12] = this.field1633[var13] & 0xFFFF;
                    var8.field1755[var12] = this.field1634[var13] & 0xFFFF;
                    var8.field1792[var12] = this.field1635[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1750 = new byte[this.field1620];
            for (int var14 = 0; var14 < this.field1620; var14++) {
                if (this.field1629[var14] == -1) {
                    var8.field1750[var14] = -1;
                } else {
                    var8.field1750[var14] = (byte) var9[this.field1629[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1620; var15++) {
            byte var16;
            if (this.field1624 == null) {
                var16 = 0;
            } else {
                var16 = this.field1624[var15];
            }
            byte var17;
            if (this.field1658 == null) {
                var17 = 0;
            } else {
                var17 = this.field1658[var15];
            }
            short var18;
            if (this.field1645 == null) {
                var18 = -1;
            } else {
                var18 = this.field1645[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1628[var15] & 0xFFFF;
                    class91 var20;
                    if (this.field1649 == null || this.field1649[this.field1625[var15]] == null) {
                        var20 = this.field1654[this.field1625[var15]];
                    } else {
                        var20 = this.field1649[this.field1625[var15]];
                    }
                    int var21 = (var20.field1563 * arg4 + var20.field1558 * arg2 + var20.field1556 * arg3) / (var20.field1557 * var7) + arg0;
                    var8.field1779[var15] = method1969(var19, var21);
                    class91 var22;
                    if (this.field1649 == null || this.field1649[this.field1622[var15]] == null) {
                        var22 = this.field1654[this.field1622[var15]];
                    } else {
                        var22 = this.field1649[this.field1622[var15]];
                    }
                    int var23 = (var22.field1563 * arg4 + var22.field1558 * arg2 + var22.field1556 * arg3) / (var22.field1557 * var7) + arg0;
                    var8.field1746[var15] = method1969(var19, var23);
                    class91 var24;
                    if (this.field1649 == null || this.field1649[this.field1623[var15]] == null) {
                        var24 = this.field1654[this.field1623[var15]];
                    } else {
                        var24 = this.field1649[this.field1623[var15]];
                    }
                    int var25 = (var24.field1563 * arg4 + var24.field1558 * arg2 + var24.field1556 * arg3) / (var24.field1557 * var7) + arg0;
                    var8.field1747[var15] = method1969(var19, var25);
                } else if (var16 == 1) {
                    class79 var26 = this.field1647[var15];
                    int var27 = (var26.field1372 * arg4 + var26.field1379 * arg2 + var26.field1371 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1779[var15] = method1969(this.field1628[var15] & 0xFFFF, var27);
                    var8.field1747[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1779[var15] = 128;
                    var8.field1747[var15] = -1;
                } else {
                    var8.field1747[var15] = -2;
                }
            } else if (var16 == 0) {
                class91 var28;
                if (this.field1649 == null || this.field1649[this.field1625[var15]] == null) {
                    var28 = this.field1654[this.field1625[var15]];
                } else {
                    var28 = this.field1649[this.field1625[var15]];
                }
                int var29 = (var28.field1563 * arg4 + var28.field1558 * arg2 + var28.field1556 * arg3) / (var28.field1557 * var7) + arg0;
                var8.field1779[var15] = method1946(var29);
                class91 var30;
                if (this.field1649 == null || this.field1649[this.field1622[var15]] == null) {
                    var30 = this.field1654[this.field1622[var15]];
                } else {
                    var30 = this.field1649[this.field1622[var15]];
                }
                int var31 = (var30.field1563 * arg4 + var30.field1558 * arg2 + var30.field1556 * arg3) / (var30.field1557 * var7) + arg0;
                var8.field1746[var15] = method1946(var31);
                class91 var32;
                if (this.field1649 == null || this.field1649[this.field1623[var15]] == null) {
                    var32 = this.field1654[this.field1623[var15]];
                } else {
                    var32 = this.field1649[this.field1623[var15]];
                }
                int var33 = (var32.field1563 * arg4 + var32.field1558 * arg2 + var32.field1556 * arg3) / (var32.field1557 * var7) + arg0;
                var8.field1747[var15] = method1946(var33);
            } else if (var16 == 1) {
                class79 var34 = this.field1647[var15];
                int var35 = (var34.field1372 * arg4 + var34.field1379 * arg2 + var34.field1371 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1779[var15] = method1946(var35);
                var8.field1747[var15] = -1;
            } else {
                var8.field1747[var15] = -2;
            }
        }
        this.method1919();
        var8.field1742 = this.field1639;
        var8.field1738 = this.field1617;
        var8.field1739 = this.field1650;
        var8.field1740 = this.field1619;
        var8.field1741 = this.field1620;
        var8.field1795 = this.field1625;
        var8.field1743 = this.field1622;
        var8.field1744 = this.field1623;
        var8.field1748 = this.field1630;
        var8.field1772 = this.field1658;
        var8.field1780 = this.field1659;
        var8.field1757 = this.field1642;
        var8.field1775 = this.field1646;
        var8.field1751 = this.field1645;
        return var8;
    }

    @ObfuscatedName("cc.am(II)I")
    public static final int method1969(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cc.ar(I)I")
    public static final int method1946(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
