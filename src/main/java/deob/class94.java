package deob;

@ObfuscatedName("cu")
public class class94 extends class79 {

    @ObfuscatedName("cu.v")
    public int field1585 = 0;

    @ObfuscatedName("cu.t")
    public int[] field1596;

    @ObfuscatedName("cu.f")
    public int[] field1587;

    @ObfuscatedName("cu.j")
    public int[] field1607;

    @ObfuscatedName("cu.l")
    public int field1620 = 0;

    @ObfuscatedName("cu.g")
    public int[] field1590;

    @ObfuscatedName("cu.k")
    public int[] field1591;

    @ObfuscatedName("cu.p")
    public int[] field1592;

    @ObfuscatedName("cu.y")
    public byte[] field1593;

    @ObfuscatedName("cu.m")
    public byte[] field1594;

    @ObfuscatedName("cu.o")
    public byte[] field1597;

    @ObfuscatedName("cu.c")
    public byte[] field1600;

    @ObfuscatedName("cu.r")
    public short[] field1599;

    @ObfuscatedName("cu.s")
    public short[] field1598;

    @ObfuscatedName("cu.n")
    public byte field1589 = 0;

    @ObfuscatedName("cu.q")
    public int field1588;

    @ObfuscatedName("cu.e")
    public byte[] field1601;

    @ObfuscatedName("cu.d")
    public short[] field1602;

    @ObfuscatedName("cu.b")
    public short[] field1603;

    @ObfuscatedName("cu.a")
    public short[] field1622;

    @ObfuscatedName("cu.i")
    public short[] field1614;

    @ObfuscatedName("cu.w")
    public short[] field1606;

    @ObfuscatedName("cu.x")
    public short[] field1609;

    @ObfuscatedName("cu.h")
    public short[] field1608;

    @ObfuscatedName("cu.z")
    public short[] field1618;

    @ObfuscatedName("cu.u")
    public short[] field1610;

    @ObfuscatedName("cu.ad")
    public byte[] field1611;

    @ObfuscatedName("cu.ah")
    public int[] field1612;

    @ObfuscatedName("cu.ao")
    public int[] field1613;

    @ObfuscatedName("cu.as")
    public int[][] field1619;

    @ObfuscatedName("cu.at")
    public int[][] field1615;

    @ObfuscatedName("cu.ai")
    public class78[] field1616;

    @ObfuscatedName("cu.aj")
    public class90[] field1617;

    @ObfuscatedName("cu.aq")
    public class90[] field1626;

    @ObfuscatedName("cu.an")
    public short field1586;

    @ObfuscatedName("cu.ac")
    public short field1605;

    @ObfuscatedName("cu.ap")
    public boolean field1604 = false;

    @ObfuscatedName("cu.az")
    public int field1595;

    @ObfuscatedName("cu.ax")
    public int field1623;

    @ObfuscatedName("cu.al")
    public int field1624;

    @ObfuscatedName("cu.am")
    public int field1625;

    @ObfuscatedName("cu.av")
    public int field1621;

    @ObfuscatedName("cu.ar")
    public static int[] field1627 = new int[10000];

    @ObfuscatedName("cu.ak")
    public static int[] field1628 = new int[10000];

    @ObfuscatedName("cu.aw")
    public static int field1629 = 0;

    @ObfuscatedName("cu.ag")
    public static int[] field1630 = class85.field1468;

    @ObfuscatedName("cu.ay")
    public static int[] field1631 = class85.field1483;

    public class94() {
    }

    @ObfuscatedName("cu.v(Lem;II)Lcu;")
    public static class94 method1899(class151 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2852(arg1, arg2);
        return var3 == null ? null : new class94(var3);
    }

    public class94(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1900(arg0);
        } else {
            this.method1898(arg0);
        }
    }

    @ObfuscatedName("cu.f([B)V")
    public void method1900(byte[] arg0) {
        class110 var2 = new class110(arg0);
        class110 var3 = new class110(arg0);
        class110 var4 = new class110(arg0);
        class110 var5 = new class110(arg0);
        class110 var6 = new class110(arg0);
        class110 var7 = new class110(arg0);
        class110 var8 = new class110(arg0);
        var2.field1847 = arg0.length - 23;
        int var9 = var2.method2194();
        int var10 = var2.method2194();
        int var11 = var2.method2257();
        int var12 = var2.method2257();
        int var13 = var2.method2257();
        int var14 = var2.method2257();
        int var15 = var2.method2257();
        int var16 = var2.method2257();
        int var17 = var2.method2257();
        int var18 = var2.method2194();
        int var19 = var2.method2194();
        int var20 = var2.method2194();
        int var21 = var2.method2194();
        int var22 = var2.method2194();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1601 = new byte[var11];
            var2.field1847 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1601[var26] = var2.method2162();
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
        this.field1585 = var9;
        this.field1620 = var10;
        this.field1588 = var11;
        this.field1596 = new int[var9];
        this.field1587 = new int[var9];
        this.field1607 = new int[var9];
        this.field1590 = new int[var10];
        this.field1591 = new int[var10];
        this.field1592 = new int[var10];
        if (var17 == 1) {
            this.field1612 = new int[var9];
        }
        if (var12 == 1) {
            this.field1593 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1594 = new byte[var10];
        } else {
            this.field1589 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1597 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1613 = new int[var10];
        }
        if (var16 == 1) {
            this.field1598 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1600 = new byte[var10];
        }
        this.field1599 = new short[var10];
        if (var11 > 0) {
            this.field1602 = new short[var11];
            this.field1603 = new short[var11];
            this.field1622 = new short[var11];
            if (var24 > 0) {
                this.field1614 = new short[var24];
                this.field1606 = new short[var24];
                this.field1609 = new short[var24];
                this.field1608 = new short[var24];
                this.field1611 = new byte[var24];
                this.field1618 = new short[var24];
            }
            if (var25 > 0) {
                this.field1610 = new short[var25];
            }
        }
        var2.field1847 = var11;
        var3.field1847 = var44;
        var4.field1847 = var46;
        var5.field1847 = var48;
        var6.field1847 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2257();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2151();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2151();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2151();
            }
            this.field1596[var67] = var64 + var69;
            this.field1587[var67] = var65 + var70;
            this.field1607[var67] = var66 + var71;
            var64 = this.field1596[var67];
            var65 = this.field1587[var67];
            var66 = this.field1607[var67];
            if (var17 == 1) {
                this.field1612[var67] = var6.method2257();
            }
        }
        var2.field1847 = var42;
        var3.field1847 = var31;
        var4.field1847 = var34;
        var5.field1847 = var37;
        var6.field1847 = var35;
        var7.field1847 = var40;
        var8.field1847 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1599[var72] = (short) var2.method2194();
            if (var12 == 1) {
                this.field1593[var72] = var3.method2162();
            }
            if (var13 == 255) {
                this.field1594[var72] = var4.method2162();
            }
            if (var14 == 1) {
                this.field1597[var72] = var5.method2162();
            }
            if (var15 == 1) {
                this.field1613[var72] = var6.method2257();
            }
            if (var16 == 1) {
                this.field1598[var72] = (short) (var7.method2194() - 1);
            }
            if (this.field1600 != null && this.field1598[var72] != -1) {
                this.field1600[var72] = (byte) (var8.method2257() - 1);
            }
        }
        var2.field1847 = var33;
        var3.field1847 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2257();
            if (var78 == 1) {
                var73 = var2.method2151() + var76;
                var74 = var2.method2151() + var73;
                var75 = var2.method2151() + var74;
                var76 = var75;
                this.field1590[var77] = var73;
                this.field1591[var77] = var74;
                this.field1592[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2151() + var76;
                var76 = var75;
                this.field1590[var77] = var73;
                this.field1591[var77] = var74;
                this.field1592[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2151() + var76;
                var76 = var75;
                this.field1590[var77] = var73;
                this.field1591[var77] = var74;
                this.field1592[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2151() + var76;
                var76 = var75;
                this.field1590[var77] = var73;
                this.field1591[var77] = var81;
                this.field1592[var77] = var75;
            }
        }
        var2.field1847 = var50;
        var3.field1847 = var52;
        var4.field1847 = var54;
        var5.field1847 = var56;
        var6.field1847 = var58;
        var7.field1847 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1601[var82] & 0xFF;
            if (var83 == 0) {
                this.field1602[var82] = (short) var2.method2194();
                this.field1603[var82] = (short) var2.method2194();
                this.field1622[var82] = (short) var2.method2194();
            }
            if (var83 == 1) {
                this.field1602[var82] = (short) var3.method2194();
                this.field1603[var82] = (short) var3.method2194();
                this.field1622[var82] = (short) var3.method2194();
                this.field1614[var82] = (short) var4.method2194();
                this.field1606[var82] = (short) var4.method2194();
                this.field1609[var82] = (short) var4.method2194();
                this.field1608[var82] = (short) var5.method2194();
                this.field1611[var82] = var6.method2162();
                this.field1618[var82] = (short) var7.method2194();
            }
            if (var83 == 2) {
                this.field1602[var82] = (short) var3.method2194();
                this.field1603[var82] = (short) var3.method2194();
                this.field1622[var82] = (short) var3.method2194();
                this.field1614[var82] = (short) var4.method2194();
                this.field1606[var82] = (short) var4.method2194();
                this.field1609[var82] = (short) var4.method2194();
                this.field1608[var82] = (short) var5.method2194();
                this.field1611[var82] = var6.method2162();
                this.field1618[var82] = (short) var7.method2194();
                this.field1610[var82] = (short) var7.method2194();
            }
            if (var83 == 3) {
                this.field1602[var82] = (short) var3.method2194();
                this.field1603[var82] = (short) var3.method2194();
                this.field1622[var82] = (short) var3.method2194();
                this.field1614[var82] = (short) var4.method2194();
                this.field1606[var82] = (short) var4.method2194();
                this.field1609[var82] = (short) var4.method2194();
                this.field1608[var82] = (short) var5.method2194();
                this.field1611[var82] = var6.method2162();
                this.field1618[var82] = (short) var7.method2194();
            }
        }
        var2.field1847 = var62;
        int var84 = var2.method2257();
        if (var84 == 0) {
            return;
        }
        new class84();
        var2.method2194();
        var2.method2194();
        var2.method2194();
        var2.method2297();
    }

    @ObfuscatedName("cu.j([B)V")
    public void method1898(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class110 var4 = new class110(arg0);
        class110 var5 = new class110(arg0);
        class110 var6 = new class110(arg0);
        class110 var7 = new class110(arg0);
        class110 var8 = new class110(arg0);
        var4.field1847 = arg0.length - 18;
        int var9 = var4.method2194();
        int var10 = var4.method2194();
        int var11 = var4.method2257();
        int var12 = var4.method2257();
        int var13 = var4.method2257();
        int var14 = var4.method2257();
        int var15 = var4.method2257();
        int var16 = var4.method2257();
        int var17 = var4.method2194();
        int var18 = var4.method2194();
        int var19 = var4.method2194();
        int var20 = var4.method2194();
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
        this.field1585 = var9;
        this.field1620 = var10;
        this.field1588 = var11;
        this.field1596 = new int[var9];
        this.field1587 = new int[var9];
        this.field1607 = new int[var9];
        this.field1590 = new int[var10];
        this.field1591 = new int[var10];
        this.field1592 = new int[var10];
        if (var11 > 0) {
            this.field1601 = new byte[var11];
            this.field1602 = new short[var11];
            this.field1603 = new short[var11];
            this.field1622 = new short[var11];
        }
        if (var16 == 1) {
            this.field1612 = new int[var9];
        }
        if (var12 == 1) {
            this.field1593 = new byte[var10];
            this.field1600 = new byte[var10];
            this.field1598 = new short[var10];
        }
        if (var13 == 255) {
            this.field1594 = new byte[var10];
        } else {
            this.field1589 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1597 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1613 = new int[var10];
        }
        this.field1599 = new short[var10];
        var4.field1847 = var21;
        var5.field1847 = var36;
        var6.field1847 = var38;
        var7.field1847 = var40;
        var8.field1847 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2257();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2151();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2151();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2151();
            }
            this.field1596[var46] = var43 + var48;
            this.field1587[var46] = var44 + var49;
            this.field1607[var46] = var45 + var50;
            var43 = this.field1596[var46];
            var44 = this.field1587[var46];
            var45 = this.field1607[var46];
            if (var16 == 1) {
                this.field1612[var46] = var8.method2257();
            }
        }
        var4.field1847 = var32;
        var5.field1847 = var28;
        var6.field1847 = var26;
        var7.field1847 = var30;
        var8.field1847 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1599[var51] = (short) var4.method2194();
            if (var12 == 1) {
                int var52 = var5.method2257();
                if ((var52 & 0x1) == 1) {
                    this.field1593[var51] = 1;
                    var2 = true;
                } else {
                    this.field1593[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1600[var51] = (byte) (var52 >> 2);
                    this.field1598[var51] = this.field1599[var51];
                    this.field1599[var51] = 127;
                    if (this.field1598[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1600[var51] = -1;
                    this.field1598[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1594[var51] = var6.method2162();
            }
            if (var14 == 1) {
                this.field1597[var51] = var7.method2162();
            }
            if (var15 == 1) {
                this.field1613[var51] = var8.method2257();
            }
        }
        var4.field1847 = var25;
        var5.field1847 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2257();
            if (var58 == 1) {
                var53 = var4.method2151() + var56;
                var54 = var4.method2151() + var53;
                var55 = var4.method2151() + var54;
                var56 = var55;
                this.field1590[var57] = var53;
                this.field1591[var57] = var54;
                this.field1592[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2151() + var56;
                var56 = var55;
                this.field1590[var57] = var53;
                this.field1591[var57] = var54;
                this.field1592[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2151() + var56;
                var56 = var55;
                this.field1590[var57] = var53;
                this.field1591[var57] = var54;
                this.field1592[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2151() + var56;
                var56 = var55;
                this.field1590[var57] = var53;
                this.field1591[var57] = var61;
                this.field1592[var57] = var55;
            }
        }
        var4.field1847 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1601[var62] = 0;
            this.field1602[var62] = (short) var4.method2194();
            this.field1603[var62] = (short) var4.method2194();
            this.field1622[var62] = (short) var4.method2194();
        }
        if (this.field1600 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1600[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1602[var65] & 0xFFFF) == this.field1590[var64] && (this.field1603[var65] & 0xFFFF) == this.field1591[var64] && (this.field1622[var65] & 0xFFFF) == this.field1592[var64]) {
                        this.field1600[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1600 = null;
            }
        }
        if (!var3) {
            this.field1598 = null;
        }
        if (!var2) {
            this.field1593 = null;
        }
    }

    public class94(class94[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1585 = 0;
        this.field1620 = 0;
        this.field1588 = 0;
        this.field1589 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class94 var10 = arg0[var9];
            if (var10 != null) {
                this.field1585 += var10.field1585;
                this.field1620 += var10.field1620;
                this.field1588 += var10.field1588;
                if (var10.field1594 == null) {
                    if (this.field1589 == -1) {
                        this.field1589 = var10.field1589;
                    }
                    if (this.field1589 != var10.field1589) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1593 != null;
                var5 |= var10.field1597 != null;
                var6 |= var10.field1613 != null;
                var7 |= var10.field1598 != null;
                var8 |= var10.field1600 != null;
            }
        }
        this.field1596 = new int[this.field1585];
        this.field1587 = new int[this.field1585];
        this.field1607 = new int[this.field1585];
        this.field1612 = new int[this.field1585];
        this.field1590 = new int[this.field1620];
        this.field1591 = new int[this.field1620];
        this.field1592 = new int[this.field1620];
        if (var3) {
            this.field1593 = new byte[this.field1620];
        }
        if (var4) {
            this.field1594 = new byte[this.field1620];
        }
        if (var5) {
            this.field1597 = new byte[this.field1620];
        }
        if (var6) {
            this.field1613 = new int[this.field1620];
        }
        if (var7) {
            this.field1598 = new short[this.field1620];
        }
        if (var8) {
            this.field1600 = new byte[this.field1620];
        }
        this.field1599 = new short[this.field1620];
        if (this.field1588 > 0) {
            this.field1601 = new byte[this.field1588];
            this.field1602 = new short[this.field1588];
            this.field1603 = new short[this.field1588];
            this.field1622 = new short[this.field1588];
            this.field1614 = new short[this.field1588];
            this.field1606 = new short[this.field1588];
            this.field1609 = new short[this.field1588];
            this.field1608 = new short[this.field1588];
            this.field1611 = new byte[this.field1588];
            this.field1618 = new short[this.field1588];
            this.field1610 = new short[this.field1588];
        }
        this.field1585 = 0;
        this.field1620 = 0;
        this.field1588 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class94 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1620; var13++) {
                    if (var3 && var12.field1593 != null) {
                        this.field1593[this.field1620] = var12.field1593[var13];
                    }
                    if (var4) {
                        if (var12.field1594 == null) {
                            this.field1594[this.field1620] = var12.field1589;
                        } else {
                            this.field1594[this.field1620] = var12.field1594[var13];
                        }
                    }
                    if (var5 && var12.field1597 != null) {
                        this.field1597[this.field1620] = var12.field1597[var13];
                    }
                    if (var6 && var12.field1613 != null) {
                        this.field1613[this.field1620] = var12.field1613[var13];
                    }
                    if (var7) {
                        if (var12.field1598 == null) {
                            this.field1598[this.field1620] = -1;
                        } else {
                            this.field1598[this.field1620] = var12.field1598[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1600 == null || var12.field1600[var13] == -1) {
                            this.field1600[this.field1620] = -1;
                        } else {
                            this.field1600[this.field1620] = (byte) (var12.field1600[var13] + this.field1588);
                        }
                    }
                    this.field1599[this.field1620] = var12.field1599[var13];
                    this.field1590[this.field1620] = this.method1974(var12, var12.field1590[var13]);
                    this.field1591[this.field1620] = this.method1974(var12, var12.field1591[var13]);
                    this.field1592[this.field1620] = this.method1974(var12, var12.field1592[var13]);
                    this.field1620++;
                }
                for (int var14 = 0; var14 < var12.field1588; var14++) {
                    byte var15 = this.field1601[this.field1588] = var12.field1601[var14];
                    if (var15 == 0) {
                        this.field1602[this.field1588] = (short) this.method1974(var12, var12.field1602[var14]);
                        this.field1603[this.field1588] = (short) this.method1974(var12, var12.field1603[var14]);
                        this.field1622[this.field1588] = (short) this.method1974(var12, var12.field1622[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1602[this.field1588] = var12.field1602[var14];
                        this.field1603[this.field1588] = var12.field1603[var14];
                        this.field1622[this.field1588] = var12.field1622[var14];
                        this.field1614[this.field1588] = var12.field1614[var14];
                        this.field1606[this.field1588] = var12.field1606[var14];
                        this.field1609[this.field1588] = var12.field1609[var14];
                        this.field1608[this.field1588] = var12.field1608[var14];
                        this.field1611[this.field1588] = var12.field1611[var14];
                        this.field1618[this.field1588] = var12.field1618[var14];
                    }
                    if (var15 == 2) {
                        this.field1610[this.field1588] = var12.field1610[var14];
                    }
                    this.field1588++;
                }
            }
        }
    }

    @ObfuscatedName("cu.l(Lcu;I)I")
    public final int method1974(class94 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1596[arg1];
        int var5 = arg0.field1587[arg1];
        int var6 = arg0.field1607[arg1];
        for (int var7 = 0; var7 < this.field1585; var7++) {
            if (this.field1596[var7] == var4 && this.field1587[var7] == var5 && this.field1607[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1596[this.field1585] = var4;
            this.field1587[this.field1585] = var5;
            this.field1607[this.field1585] = var6;
            if (arg0.field1612 != null) {
                this.field1612[this.field1585] = arg0.field1612[arg1];
            }
            var3 = this.field1585++;
        }
        return var3;
    }

    public class94(class94 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1585 = arg0.field1585;
        this.field1620 = arg0.field1620;
        this.field1588 = arg0.field1588;
        if (arg1) {
            this.field1596 = arg0.field1596;
            this.field1587 = arg0.field1587;
            this.field1607 = arg0.field1607;
        } else {
            this.field1596 = new int[this.field1585];
            this.field1587 = new int[this.field1585];
            this.field1607 = new int[this.field1585];
            for (int var6 = 0; var6 < this.field1585; var6++) {
                this.field1596[var6] = arg0.field1596[var6];
                this.field1587[var6] = arg0.field1587[var6];
                this.field1607[var6] = arg0.field1607[var6];
            }
        }
        if (arg2) {
            this.field1599 = arg0.field1599;
        } else {
            this.field1599 = new short[this.field1620];
            for (int var7 = 0; var7 < this.field1620; var7++) {
                this.field1599[var7] = arg0.field1599[var7];
            }
        }
        if (arg3 || arg0.field1598 == null) {
            this.field1598 = arg0.field1598;
        } else {
            this.field1598 = new short[this.field1620];
            for (int var8 = 0; var8 < this.field1620; var8++) {
                this.field1598[var8] = arg0.field1598[var8];
            }
        }
        if (arg4) {
            this.field1597 = arg0.field1597;
        } else {
            this.field1597 = new byte[this.field1620];
            if (arg0.field1597 == null) {
                for (int var9 = 0; var9 < this.field1620; var9++) {
                    this.field1597[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1620; var10++) {
                    this.field1597[var10] = arg0.field1597[var10];
                }
            }
        }
        this.field1590 = arg0.field1590;
        this.field1591 = arg0.field1591;
        this.field1592 = arg0.field1592;
        this.field1593 = arg0.field1593;
        this.field1594 = arg0.field1594;
        this.field1600 = arg0.field1600;
        this.field1589 = arg0.field1589;
        this.field1601 = arg0.field1601;
        this.field1602 = arg0.field1602;
        this.field1603 = arg0.field1603;
        this.field1622 = arg0.field1622;
        this.field1614 = arg0.field1614;
        this.field1606 = arg0.field1606;
        this.field1609 = arg0.field1609;
        this.field1608 = arg0.field1608;
        this.field1611 = arg0.field1611;
        this.field1618 = arg0.field1618;
        this.field1610 = arg0.field1610;
        this.field1612 = arg0.field1612;
        this.field1613 = arg0.field1613;
        this.field1619 = arg0.field1619;
        this.field1615 = arg0.field1615;
        this.field1617 = arg0.field1617;
        this.field1616 = arg0.field1616;
        this.field1626 = arg0.field1626;
        this.field1586 = arg0.field1586;
        this.field1605 = arg0.field1605;
    }

    @ObfuscatedName("cu.g()Lcu;")
    public class94 method1904() {
        class94 var1 = new class94();
        if (this.field1593 != null) {
            var1.field1593 = new byte[this.field1620];
            for (int var2 = 0; var2 < this.field1620; var2++) {
                var1.field1593[var2] = this.field1593[var2];
            }
        }
        var1.field1585 = this.field1585;
        var1.field1620 = this.field1620;
        var1.field1588 = this.field1588;
        var1.field1596 = this.field1596;
        var1.field1587 = this.field1587;
        var1.field1607 = this.field1607;
        var1.field1590 = this.field1590;
        var1.field1591 = this.field1591;
        var1.field1592 = this.field1592;
        var1.field1594 = this.field1594;
        var1.field1597 = this.field1597;
        var1.field1600 = this.field1600;
        var1.field1599 = this.field1599;
        var1.field1598 = this.field1598;
        var1.field1589 = this.field1589;
        var1.field1601 = this.field1601;
        var1.field1602 = this.field1602;
        var1.field1603 = this.field1603;
        var1.field1622 = this.field1622;
        var1.field1614 = this.field1614;
        var1.field1606 = this.field1606;
        var1.field1609 = this.field1609;
        var1.field1608 = this.field1608;
        var1.field1611 = this.field1611;
        var1.field1618 = this.field1618;
        var1.field1610 = this.field1610;
        var1.field1612 = this.field1612;
        var1.field1613 = this.field1613;
        var1.field1619 = this.field1619;
        var1.field1615 = this.field1615;
        var1.field1617 = this.field1617;
        var1.field1616 = this.field1616;
        var1.field1586 = this.field1586;
        var1.field1605 = this.field1605;
        return var1;
    }

    @ObfuscatedName("cu.p([[IIIIZI)Lcu;")
    public class94 method1951(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1916();
        int var7 = this.field1623 + arg1;
        int var8 = this.field1624 + arg1;
        int var9 = this.field1621 + arg3;
        int var10 = this.field1625 + arg3;
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
        class94 var15;
        if (arg4) {
            var15 = new class94();
            var15.field1585 = this.field1585;
            var15.field1620 = this.field1620;
            var15.field1588 = this.field1588;
            var15.field1596 = this.field1596;
            var15.field1607 = this.field1607;
            var15.field1590 = this.field1590;
            var15.field1591 = this.field1591;
            var15.field1592 = this.field1592;
            var15.field1593 = this.field1593;
            var15.field1594 = this.field1594;
            var15.field1597 = this.field1597;
            var15.field1600 = this.field1600;
            var15.field1599 = this.field1599;
            var15.field1598 = this.field1598;
            var15.field1589 = this.field1589;
            var15.field1601 = this.field1601;
            var15.field1602 = this.field1602;
            var15.field1603 = this.field1603;
            var15.field1622 = this.field1622;
            var15.field1614 = this.field1614;
            var15.field1606 = this.field1606;
            var15.field1609 = this.field1609;
            var15.field1608 = this.field1608;
            var15.field1611 = this.field1611;
            var15.field1618 = this.field1618;
            var15.field1610 = this.field1610;
            var15.field1612 = this.field1612;
            var15.field1613 = this.field1613;
            var15.field1619 = this.field1619;
            var15.field1615 = this.field1615;
            var15.field1586 = this.field1586;
            var15.field1605 = this.field1605;
            var15.field1587 = new int[var15.field1585];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1585; var16++) {
                int var17 = this.field1596[var16] + arg1;
                int var18 = this.field1607[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1587[var16] = this.field1587[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1585; var26++) {
                int var27 = (-this.field1587[var26] << 16) / this.field1355;
                if (var27 < arg5) {
                    int var28 = this.field1596[var26] + arg1;
                    int var29 = this.field1607[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1587[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1587[var26];
                }
            }
        }
        var15.method1947();
        return var15;
    }

    @ObfuscatedName("cu.y()V")
    public void method1905() {
        int var10002;
        if (this.field1612 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1585; var3++) {
                int var4 = this.field1612[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1619 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1619[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1585) {
                int var7 = this.field1612[var6];
                this.field1619[var7][var1[var7]++] = var6++;
            }
            this.field1612 = null;
        }
        if (this.field1613 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1620; var10++) {
            int var11 = this.field1613[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1615 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1615[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1620) {
            int var14 = this.field1613[var13];
            this.field1615[var14][var8[var14]++] = var13++;
        }
        this.field1613 = null;
    }

    @ObfuscatedName("cu.m()V")
    public void method1906() {
        for (int var1 = 0; var1 < this.field1585; var1++) {
            int var2 = this.field1596[var1];
            this.field1596[var1] = this.field1607[var1];
            this.field1607[var1] = -var2;
        }
        this.method1947();
    }

    @ObfuscatedName("cu.o()V")
    public void method1961() {
        for (int var1 = 0; var1 < this.field1585; var1++) {
            this.field1596[var1] = -this.field1596[var1];
            this.field1607[var1] = -this.field1607[var1];
        }
        this.method1947();
    }

    @ObfuscatedName("cu.c()V")
    public void method1908() {
        for (int var1 = 0; var1 < this.field1585; var1++) {
            int var2 = this.field1607[var1];
            this.field1607[var1] = this.field1596[var1];
            this.field1596[var1] = -var2;
        }
        this.method1947();
    }

    @ObfuscatedName("cu.r(I)V")
    public void method1909(int arg0) {
        int var2 = field1630[arg0];
        int var3 = field1631[arg0];
        for (int var4 = 0; var4 < this.field1585; var4++) {
            int var5 = this.field1607[var4] * var2 + this.field1596[var4] * var3 >> 16;
            this.field1607[var4] = this.field1607[var4] * var3 - this.field1596[var4] * var2 >> 16;
            this.field1596[var4] = var5;
        }
        this.method1947();
    }

    @ObfuscatedName("cu.s(III)V")
    public void method1910(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1585; var4++) {
            this.field1596[var4] += arg0;
            this.field1587[var4] += arg1;
            this.field1607[var4] += arg2;
        }
        this.method1947();
    }

    @ObfuscatedName("cu.n(SS)V")
    public void method1976(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1620; var3++) {
            if (this.field1599[var3] == arg0) {
                this.field1599[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cu.q(SS)V")
    public void method1981(short arg0, short arg1) {
        if (this.field1598 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1620; var3++) {
            if (this.field1598[var3] == arg0) {
                this.field1598[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cu.e()V")
    public void method1912() {
        for (int var1 = 0; var1 < this.field1585; var1++) {
            this.field1607[var1] = -this.field1607[var1];
        }
        for (int var2 = 0; var2 < this.field1620; var2++) {
            int var3 = this.field1590[var2];
            this.field1590[var2] = this.field1592[var2];
            this.field1592[var2] = var3;
        }
        this.method1947();
    }

    @ObfuscatedName("cu.d(III)V")
    public void method1913(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1585; var4++) {
            this.field1596[var4] = this.field1596[var4] * arg0 / 128;
            this.field1587[var4] = this.field1587[var4] * arg1 / 128;
            this.field1607[var4] = this.field1607[var4] * arg2 / 128;
        }
        this.method1947();
    }

    @ObfuscatedName("cu.b()V")
    public void method1914() {
        if (this.field1617 != null) {
            return;
        }
        this.field1617 = new class90[this.field1585];
        for (int var1 = 0; var1 < this.field1585; var1++) {
            this.field1617[var1] = new class90();
        }
        for (int var2 = 0; var2 < this.field1620; var2++) {
            int var3 = this.field1590[var2];
            int var4 = this.field1591[var2];
            int var5 = this.field1592[var2];
            int var6 = this.field1596[var4] - this.field1596[var3];
            int var7 = this.field1587[var4] - this.field1587[var3];
            int var8 = this.field1607[var4] - this.field1607[var3];
            int var9 = this.field1596[var5] - this.field1596[var3];
            int var10 = this.field1587[var5] - this.field1587[var3];
            int var11 = this.field1607[var5] - this.field1607[var3];
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
            if (this.field1593 == null) {
                var19 = 0;
            } else {
                var19 = this.field1593[var2];
            }
            if (var19 == 0) {
                class90 var20 = this.field1617[var3];
                var20.field1534 += var16;
                var20.field1526 += var17;
                var20.field1527 += var18;
                var20.field1528++;
                class90 var21 = this.field1617[var4];
                var21.field1534 += var16;
                var21.field1526 += var17;
                var21.field1527 += var18;
                var21.field1528++;
                class90 var22 = this.field1617[var5];
                var22.field1534 += var16;
                var22.field1526 += var17;
                var22.field1527 += var18;
                var22.field1528++;
            } else if (var19 == 1) {
                if (this.field1616 == null) {
                    this.field1616 = new class78[this.field1620];
                }
                class78 var23 = this.field1616[var2] = new class78();
                var23.field1352 = var16;
                var23.field1347 = var17;
                var23.field1348 = var18;
            }
        }
    }

    @ObfuscatedName("cu.h()V")
    public void method1947() {
        this.field1617 = null;
        this.field1626 = null;
        this.field1616 = null;
        this.field1604 = false;
    }

    @ObfuscatedName("cu.z()V")
    public void method1916() {
        if (this.field1604) {
            return;
        }
        this.field1355 = 0;
        this.field1595 = 0;
        this.field1623 = 999999;
        this.field1624 = -999999;
        this.field1625 = -99999;
        this.field1621 = 99999;
        for (int var1 = 0; var1 < this.field1585; var1++) {
            int var2 = this.field1596[var1];
            int var3 = this.field1587[var1];
            int var4 = this.field1607[var1];
            if (var2 < this.field1623) {
                this.field1623 = var2;
            }
            if (var2 > this.field1624) {
                this.field1624 = var2;
            }
            if (var4 < this.field1621) {
                this.field1621 = var4;
            }
            if (var4 > this.field1625) {
                this.field1625 = var4;
            }
            if (-var3 > this.field1355) {
                this.field1355 = -var3;
            }
            if (var3 > this.field1595) {
                this.field1595 = var3;
            }
        }
        this.field1604 = true;
    }

    @ObfuscatedName("cu.u(Lcu;Lcu;IIIZ)V")
    public static void method1917(class94 arg0, class94 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1916();
        arg0.method1914();
        arg1.method1916();
        arg1.method1914();
        field1629++;
        int var6 = 0;
        int[] var7 = arg1.field1596;
        int var8 = arg1.field1585;
        for (int var9 = 0; var9 < arg0.field1585; var9++) {
            class90 var10 = arg0.field1617[var9];
            if (var10.field1528 != 0) {
                int var11 = arg0.field1587[var9] - arg3;
                if (var11 <= arg1.field1595) {
                    int var12 = arg0.field1596[var9] - arg2;
                    if (var12 >= arg1.field1623 && var12 <= arg1.field1624) {
                        int var13 = arg0.field1607[var9] - arg4;
                        if (var13 >= arg1.field1621 && var13 <= arg1.field1625) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class90 var15 = arg1.field1617[var14];
                                if (var7[var14] == var12 && arg1.field1607[var14] == var13 && arg1.field1587[var14] == var11 && var15.field1528 != 0) {
                                    if (arg0.field1626 == null) {
                                        arg0.field1626 = new class90[arg0.field1585];
                                    }
                                    if (arg1.field1626 == null) {
                                        arg1.field1626 = new class90[var8];
                                    }
                                    class90 var16 = arg0.field1626[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1626[var9] = new class90(var10);
                                    }
                                    class90 var17 = arg1.field1626[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1626[var14] = new class90(var15);
                                    }
                                    var16.field1534 += var15.field1534;
                                    var16.field1526 += var15.field1526;
                                    var16.field1527 += var15.field1527;
                                    var16.field1528 += var15.field1528;
                                    var17.field1534 += var10.field1534;
                                    var17.field1526 += var10.field1526;
                                    var17.field1527 += var10.field1527;
                                    var17.field1528 += var10.field1528;
                                    var6++;
                                    field1627[var9] = field1629;
                                    field1628[var14] = field1629;
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
            if (field1627[arg0.field1590[var18]] == field1629 && field1627[arg0.field1591[var18]] == field1629 && field1627[arg0.field1592[var18]] == field1629) {
                if (arg0.field1593 == null) {
                    arg0.field1593 = new byte[arg0.field1620];
                }
                arg0.field1593[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1620; var19++) {
            if (field1628[arg1.field1590[var19]] == field1629 && field1628[arg1.field1591[var19]] == field1629 && field1628[arg1.field1592[var19]] == field1629) {
                if (arg1.field1593 == null) {
                    arg1.field1593 = new byte[arg1.field1620];
                }
                arg1.field1593[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cu.ad(IIIII)Lcy;")
    public final class99 method1918(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1914();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class99 var8 = new class99();
        var8.field1703 = new int[this.field1620];
        var8.field1704 = new int[this.field1620];
        var8.field1691 = new int[this.field1620];
        if (this.field1588 > 0 && this.field1600 != null) {
            int[] var9 = new int[this.field1588];
            for (int var10 = 0; var10 < this.field1620; var10++) {
                if (this.field1600[var10] != -1) {
                    var9[this.field1600[var10] & 0xFF]++;
                }
            }
            var8.field1711 = 0;
            for (int var11 = 0; var11 < this.field1588; var11++) {
                if (var9[var11] > 0 && this.field1601[var11] == 0) {
                    var8.field1711++;
                }
            }
            var8.field1712 = new int[var8.field1711];
            var8.field1713 = new int[var8.field1711];
            var8.field1692 = new int[var8.field1711];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1588; var13++) {
                if (var9[var13] > 0 && this.field1601[var13] == 0) {
                    var8.field1712[var12] = this.field1602[var13] & 0xFFFF;
                    var8.field1713[var12] = this.field1603[var13] & 0xFFFF;
                    var8.field1692[var12] = this.field1622[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1752 = new byte[this.field1620];
            for (int var14 = 0; var14 < this.field1620; var14++) {
                if (this.field1600[var14] == -1) {
                    var8.field1752[var14] = -1;
                } else {
                    var8.field1752[var14] = (byte) var9[this.field1600[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1620; var15++) {
            byte var16;
            if (this.field1593 == null) {
                var16 = 0;
            } else {
                var16 = this.field1593[var15];
            }
            byte var17;
            if (this.field1597 == null) {
                var17 = 0;
            } else {
                var17 = this.field1597[var15];
            }
            short var18;
            if (this.field1598 == null) {
                var18 = -1;
            } else {
                var18 = this.field1598[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1599[var15] & 0xFFFF;
                    class90 var20;
                    if (this.field1626 == null || this.field1626[this.field1590[var15]] == null) {
                        var20 = this.field1617[this.field1590[var15]];
                    } else {
                        var20 = this.field1626[this.field1590[var15]];
                    }
                    int var21 = (var20.field1527 * arg4 + var20.field1534 * arg2 + var20.field1526 * arg3) / (var20.field1528 * var7) + arg0;
                    var8.field1703[var15] = method1915(var19, var21);
                    class90 var22;
                    if (this.field1626 == null || this.field1626[this.field1591[var15]] == null) {
                        var22 = this.field1617[this.field1591[var15]];
                    } else {
                        var22 = this.field1626[this.field1591[var15]];
                    }
                    int var23 = (var22.field1527 * arg4 + var22.field1534 * arg2 + var22.field1526 * arg3) / (var22.field1528 * var7) + arg0;
                    var8.field1704[var15] = method1915(var19, var23);
                    class90 var24;
                    if (this.field1626 == null || this.field1626[this.field1592[var15]] == null) {
                        var24 = this.field1617[this.field1592[var15]];
                    } else {
                        var24 = this.field1626[this.field1592[var15]];
                    }
                    int var25 = (var24.field1527 * arg4 + var24.field1534 * arg2 + var24.field1526 * arg3) / (var24.field1528 * var7) + arg0;
                    var8.field1691[var15] = method1915(var19, var25);
                } else if (var16 == 1) {
                    class78 var26 = this.field1616[var15];
                    int var27 = (var26.field1348 * arg4 + var26.field1352 * arg2 + var26.field1347 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1703[var15] = method1915(this.field1599[var15] & 0xFFFF, var27);
                    var8.field1691[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1703[var15] = 128;
                    var8.field1691[var15] = -1;
                } else {
                    var8.field1691[var15] = -2;
                }
            } else if (var16 == 0) {
                class90 var28;
                if (this.field1626 == null || this.field1626[this.field1590[var15]] == null) {
                    var28 = this.field1617[this.field1590[var15]];
                } else {
                    var28 = this.field1626[this.field1590[var15]];
                }
                int var29 = (var28.field1527 * arg4 + var28.field1534 * arg2 + var28.field1526 * arg3) / (var28.field1528 * var7) + arg0;
                var8.field1703[var15] = method1958(var29);
                class90 var30;
                if (this.field1626 == null || this.field1626[this.field1591[var15]] == null) {
                    var30 = this.field1617[this.field1591[var15]];
                } else {
                    var30 = this.field1626[this.field1591[var15]];
                }
                int var31 = (var30.field1527 * arg4 + var30.field1534 * arg2 + var30.field1526 * arg3) / (var30.field1528 * var7) + arg0;
                var8.field1704[var15] = method1958(var31);
                class90 var32;
                if (this.field1626 == null || this.field1626[this.field1592[var15]] == null) {
                    var32 = this.field1617[this.field1592[var15]];
                } else {
                    var32 = this.field1626[this.field1592[var15]];
                }
                int var33 = (var32.field1527 * arg4 + var32.field1534 * arg2 + var32.field1526 * arg3) / (var32.field1528 * var7) + arg0;
                var8.field1691[var15] = method1958(var33);
            } else if (var16 == 1) {
                class78 var34 = this.field1616[var15];
                int var35 = (var34.field1348 * arg4 + var34.field1352 * arg2 + var34.field1347 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1703[var15] = method1958(var35);
                var8.field1691[var15] = -1;
            } else {
                var8.field1691[var15] = -2;
            }
        }
        this.method1905();
        var8.field1695 = this.field1585;
        var8.field1696 = this.field1596;
        var8.field1694 = this.field1587;
        var8.field1717 = this.field1607;
        var8.field1699 = this.field1620;
        var8.field1700 = this.field1590;
        var8.field1698 = this.field1591;
        var8.field1702 = this.field1592;
        var8.field1706 = this.field1594;
        var8.field1707 = this.field1597;
        var8.field1716 = this.field1589;
        var8.field1741 = this.field1619;
        var8.field1723 = this.field1615;
        var8.field1709 = this.field1598;
        return var8;
    }

    @ObfuscatedName("cu.ah(II)I")
    public static final int method1915(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cu.ao(I)I")
    public static final int method1958(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
