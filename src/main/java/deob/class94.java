package deob;

@ObfuscatedName("cs")
public class class94 extends class79 {

    @ObfuscatedName("cs.b")
    public int field1630 = 0;

    @ObfuscatedName("cs.e")
    public int[] field1585;

    @ObfuscatedName("cs.i")
    public int[] field1586;

    @ObfuscatedName("cs.k")
    public int[] field1587;

    @ObfuscatedName("cs.h")
    public int field1588 = 0;

    @ObfuscatedName("cs.p")
    public int[] field1621;

    @ObfuscatedName("cs.n")
    public int[] field1590;

    @ObfuscatedName("cs.o")
    public int[] field1591;

    @ObfuscatedName("cs.g")
    public byte[] field1592;

    @ObfuscatedName("cs.z")
    public byte[] field1608;

    @ObfuscatedName("cs.t")
    public byte[] field1627;

    @ObfuscatedName("cs.y")
    public byte[] field1620;

    @ObfuscatedName("cs.w")
    public short[] field1594;

    @ObfuscatedName("cs.x")
    public short[] field1597;

    @ObfuscatedName("cs.v")
    public byte field1598 = 0;

    @ObfuscatedName("cs.q")
    public int field1599;

    @ObfuscatedName("cs.f")
    public byte[] field1600;

    @ObfuscatedName("cs.s")
    public short[] field1584;

    @ObfuscatedName("cs.a")
    public short[] field1602;

    @ObfuscatedName("cs.m")
    public short[] field1603;

    @ObfuscatedName("cs.c")
    public short[] field1604;

    @ObfuscatedName("cs.j")
    public short[] field1605;

    @ObfuscatedName("cs.d")
    public short[] field1611;

    @ObfuscatedName("cs.l")
    public short[] field1607;

    @ObfuscatedName("cs.u")
    public short[] field1593;

    @ObfuscatedName("cs.r")
    public short[] field1617;

    @ObfuscatedName("cs.an")
    public byte[] field1610;

    @ObfuscatedName("cs.ao")
    public int[] field1606;

    @ObfuscatedName("cs.ah")
    public int[] field1612;

    @ObfuscatedName("cs.ai")
    public int[][] field1601;

    @ObfuscatedName("cs.aa")
    public int[][] field1613;

    @ObfuscatedName("cs.ag")
    public class78[] field1595;

    @ObfuscatedName("cs.ar")
    public class90[] field1616;

    @ObfuscatedName("cs.al")
    public class90[] field1589;

    @ObfuscatedName("cs.ae")
    public short field1618;

    @ObfuscatedName("cs.ak")
    public short field1619;

    @ObfuscatedName("cs.at")
    public boolean field1609 = false;

    @ObfuscatedName("cs.am")
    public int field1615;

    @ObfuscatedName("cs.aw")
    public int field1622;

    @ObfuscatedName("cs.as")
    public int field1623;

    @ObfuscatedName("cs.aq")
    public int field1624;

    @ObfuscatedName("cs.ac")
    public int field1625;

    @ObfuscatedName("cs.aj")
    public static int[] field1626 = new int[10000];

    @ObfuscatedName("cs.av")
    public static int[] field1614 = new int[10000];

    @ObfuscatedName("cs.ax")
    public static int field1628 = 0;

    @ObfuscatedName("cs.ap")
    public static int[] field1629 = class85.field1483;

    @ObfuscatedName("cs.af")
    public static int[] field1596 = class85.field1469;

    public class94() {
    }

    @ObfuscatedName("cs.b(Lex;II)Lcs;")
    public static class94 method1874(class151 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2761(arg1, arg2);
        return var3 == null ? null : new class94(var3);
    }

    public class94(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1876(arg0);
        } else {
            this.method1941(arg0);
        }
    }

    @ObfuscatedName("cs.i([B)V")
    public void method1876(byte[] arg0) {
        class110 var2 = new class110(arg0);
        class110 var3 = new class110(arg0);
        class110 var4 = new class110(arg0);
        class110 var5 = new class110(arg0);
        class110 var6 = new class110(arg0);
        class110 var7 = new class110(arg0);
        class110 var8 = new class110(arg0);
        var2.field1855 = arg0.length - 23;
        int var9 = var2.method2292();
        int var10 = var2.method2292();
        int var11 = var2.method2142();
        int var12 = var2.method2142();
        int var13 = var2.method2142();
        int var14 = var2.method2142();
        int var15 = var2.method2142();
        int var16 = var2.method2142();
        int var17 = var2.method2142();
        int var18 = var2.method2292();
        int var19 = var2.method2292();
        int var20 = var2.method2292();
        int var21 = var2.method2292();
        int var22 = var2.method2292();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1600 = new byte[var11];
            var2.field1855 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1600[var26] = var2.method2294();
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
        this.field1630 = var9;
        this.field1588 = var10;
        this.field1599 = var11;
        this.field1585 = new int[var9];
        this.field1586 = new int[var9];
        this.field1587 = new int[var9];
        this.field1621 = new int[var10];
        this.field1590 = new int[var10];
        this.field1591 = new int[var10];
        if (var17 == 1) {
            this.field1606 = new int[var9];
        }
        if (var12 == 1) {
            this.field1592 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1608 = new byte[var10];
        } else {
            this.field1598 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1627 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1612 = new int[var10];
        }
        if (var16 == 1) {
            this.field1597 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1620 = new byte[var10];
        }
        this.field1594 = new short[var10];
        if (var11 > 0) {
            this.field1584 = new short[var11];
            this.field1602 = new short[var11];
            this.field1603 = new short[var11];
            if (var24 > 0) {
                this.field1604 = new short[var24];
                this.field1605 = new short[var24];
                this.field1611 = new short[var24];
                this.field1607 = new short[var24];
                this.field1610 = new byte[var24];
                this.field1593 = new short[var24];
            }
            if (var25 > 0) {
                this.field1617 = new short[var25];
            }
        }
        var2.field1855 = var11;
        var3.field1855 = var44;
        var4.field1855 = var46;
        var5.field1855 = var48;
        var6.field1855 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2142();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2154();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2154();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2154();
            }
            this.field1585[var67] = var64 + var69;
            this.field1586[var67] = var65 + var70;
            this.field1587[var67] = var66 + var71;
            var64 = this.field1585[var67];
            var65 = this.field1586[var67];
            var66 = this.field1587[var67];
            if (var17 == 1) {
                this.field1606[var67] = var6.method2142();
            }
        }
        var2.field1855 = var42;
        var3.field1855 = var31;
        var4.field1855 = var34;
        var5.field1855 = var37;
        var6.field1855 = var35;
        var7.field1855 = var40;
        var8.field1855 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1594[var72] = (short) var2.method2292();
            if (var12 == 1) {
                this.field1592[var72] = var3.method2294();
            }
            if (var13 == 255) {
                this.field1608[var72] = var4.method2294();
            }
            if (var14 == 1) {
                this.field1627[var72] = var5.method2294();
            }
            if (var15 == 1) {
                this.field1612[var72] = var6.method2142();
            }
            if (var16 == 1) {
                this.field1597[var72] = (short) (var7.method2292() - 1);
            }
            if (this.field1620 != null && this.field1597[var72] != -1) {
                this.field1620[var72] = (byte) (var8.method2142() - 1);
            }
        }
        var2.field1855 = var33;
        var3.field1855 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2142();
            if (var78 == 1) {
                var73 = var2.method2154() + var76;
                var74 = var2.method2154() + var73;
                var75 = var2.method2154() + var74;
                var76 = var75;
                this.field1621[var77] = var73;
                this.field1590[var77] = var74;
                this.field1591[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2154() + var76;
                var76 = var75;
                this.field1621[var77] = var73;
                this.field1590[var77] = var74;
                this.field1591[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2154() + var76;
                var76 = var75;
                this.field1621[var77] = var73;
                this.field1590[var77] = var74;
                this.field1591[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2154() + var76;
                var76 = var75;
                this.field1621[var77] = var73;
                this.field1590[var77] = var81;
                this.field1591[var77] = var75;
            }
        }
        var2.field1855 = var50;
        var3.field1855 = var52;
        var4.field1855 = var54;
        var5.field1855 = var56;
        var6.field1855 = var58;
        var7.field1855 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1600[var82] & 0xFF;
            if (var83 == 0) {
                this.field1584[var82] = (short) var2.method2292();
                this.field1602[var82] = (short) var2.method2292();
                this.field1603[var82] = (short) var2.method2292();
            }
            if (var83 == 1) {
                this.field1584[var82] = (short) var3.method2292();
                this.field1602[var82] = (short) var3.method2292();
                this.field1603[var82] = (short) var3.method2292();
                this.field1604[var82] = (short) var4.method2292();
                this.field1605[var82] = (short) var4.method2292();
                this.field1611[var82] = (short) var4.method2292();
                this.field1607[var82] = (short) var5.method2292();
                this.field1610[var82] = var6.method2294();
                this.field1593[var82] = (short) var7.method2292();
            }
            if (var83 == 2) {
                this.field1584[var82] = (short) var3.method2292();
                this.field1602[var82] = (short) var3.method2292();
                this.field1603[var82] = (short) var3.method2292();
                this.field1604[var82] = (short) var4.method2292();
                this.field1605[var82] = (short) var4.method2292();
                this.field1611[var82] = (short) var4.method2292();
                this.field1607[var82] = (short) var5.method2292();
                this.field1610[var82] = var6.method2294();
                this.field1593[var82] = (short) var7.method2292();
                this.field1617[var82] = (short) var7.method2292();
            }
            if (var83 == 3) {
                this.field1584[var82] = (short) var3.method2292();
                this.field1602[var82] = (short) var3.method2292();
                this.field1603[var82] = (short) var3.method2292();
                this.field1604[var82] = (short) var4.method2292();
                this.field1605[var82] = (short) var4.method2292();
                this.field1611[var82] = (short) var4.method2292();
                this.field1607[var82] = (short) var5.method2292();
                this.field1610[var82] = var6.method2294();
                this.field1593[var82] = (short) var7.method2292();
            }
        }
        var2.field1855 = var62;
        int var84 = var2.method2142();
        if (var84 == 0) {
            return;
        }
        new class84();
        var2.method2292();
        var2.method2292();
        var2.method2292();
        var2.method2195();
    }

    @ObfuscatedName("cs.k([B)V")
    public void method1941(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class110 var4 = new class110(arg0);
        class110 var5 = new class110(arg0);
        class110 var6 = new class110(arg0);
        class110 var7 = new class110(arg0);
        class110 var8 = new class110(arg0);
        var4.field1855 = arg0.length - 18;
        int var9 = var4.method2292();
        int var10 = var4.method2292();
        int var11 = var4.method2142();
        int var12 = var4.method2142();
        int var13 = var4.method2142();
        int var14 = var4.method2142();
        int var15 = var4.method2142();
        int var16 = var4.method2142();
        int var17 = var4.method2292();
        int var18 = var4.method2292();
        int var19 = var4.method2292();
        int var20 = var4.method2292();
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
        this.field1630 = var9;
        this.field1588 = var10;
        this.field1599 = var11;
        this.field1585 = new int[var9];
        this.field1586 = new int[var9];
        this.field1587 = new int[var9];
        this.field1621 = new int[var10];
        this.field1590 = new int[var10];
        this.field1591 = new int[var10];
        if (var11 > 0) {
            this.field1600 = new byte[var11];
            this.field1584 = new short[var11];
            this.field1602 = new short[var11];
            this.field1603 = new short[var11];
        }
        if (var16 == 1) {
            this.field1606 = new int[var9];
        }
        if (var12 == 1) {
            this.field1592 = new byte[var10];
            this.field1620 = new byte[var10];
            this.field1597 = new short[var10];
        }
        if (var13 == 255) {
            this.field1608 = new byte[var10];
        } else {
            this.field1598 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1627 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1612 = new int[var10];
        }
        this.field1594 = new short[var10];
        var4.field1855 = var21;
        var5.field1855 = var36;
        var6.field1855 = var38;
        var7.field1855 = var40;
        var8.field1855 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2142();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2154();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2154();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2154();
            }
            this.field1585[var46] = var43 + var48;
            this.field1586[var46] = var44 + var49;
            this.field1587[var46] = var45 + var50;
            var43 = this.field1585[var46];
            var44 = this.field1586[var46];
            var45 = this.field1587[var46];
            if (var16 == 1) {
                this.field1606[var46] = var8.method2142();
            }
        }
        var4.field1855 = var32;
        var5.field1855 = var28;
        var6.field1855 = var26;
        var7.field1855 = var30;
        var8.field1855 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1594[var51] = (short) var4.method2292();
            if (var12 == 1) {
                int var52 = var5.method2142();
                if ((var52 & 0x1) == 1) {
                    this.field1592[var51] = 1;
                    var2 = true;
                } else {
                    this.field1592[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1620[var51] = (byte) (var52 >> 2);
                    this.field1597[var51] = this.field1594[var51];
                    this.field1594[var51] = 127;
                    if (this.field1597[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1620[var51] = -1;
                    this.field1597[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1608[var51] = var6.method2294();
            }
            if (var14 == 1) {
                this.field1627[var51] = var7.method2294();
            }
            if (var15 == 1) {
                this.field1612[var51] = var8.method2142();
            }
        }
        var4.field1855 = var25;
        var5.field1855 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2142();
            if (var58 == 1) {
                var53 = var4.method2154() + var56;
                var54 = var4.method2154() + var53;
                var55 = var4.method2154() + var54;
                var56 = var55;
                this.field1621[var57] = var53;
                this.field1590[var57] = var54;
                this.field1591[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2154() + var56;
                var56 = var55;
                this.field1621[var57] = var53;
                this.field1590[var57] = var54;
                this.field1591[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2154() + var56;
                var56 = var55;
                this.field1621[var57] = var53;
                this.field1590[var57] = var54;
                this.field1591[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2154() + var56;
                var56 = var55;
                this.field1621[var57] = var53;
                this.field1590[var57] = var61;
                this.field1591[var57] = var55;
            }
        }
        var4.field1855 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1600[var62] = 0;
            this.field1584[var62] = (short) var4.method2292();
            this.field1602[var62] = (short) var4.method2292();
            this.field1603[var62] = (short) var4.method2292();
        }
        if (this.field1620 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1620[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1584[var65] & 0xFFFF) == this.field1621[var64] && (this.field1602[var65] & 0xFFFF) == this.field1590[var64] && (this.field1603[var65] & 0xFFFF) == this.field1591[var64]) {
                        this.field1620[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1620 = null;
            }
        }
        if (!var3) {
            this.field1597 = null;
        }
        if (!var2) {
            this.field1592 = null;
        }
    }

    public class94(class94[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1630 = 0;
        this.field1588 = 0;
        this.field1599 = 0;
        this.field1598 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class94 var10 = arg0[var9];
            if (var10 != null) {
                this.field1630 += var10.field1630;
                this.field1588 += var10.field1588;
                this.field1599 += var10.field1599;
                if (var10.field1608 == null) {
                    if (this.field1598 == -1) {
                        this.field1598 = var10.field1598;
                    }
                    if (this.field1598 != var10.field1598) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1592 != null;
                var5 |= var10.field1627 != null;
                var6 |= var10.field1612 != null;
                var7 |= var10.field1597 != null;
                var8 |= var10.field1620 != null;
            }
        }
        this.field1585 = new int[this.field1630];
        this.field1586 = new int[this.field1630];
        this.field1587 = new int[this.field1630];
        this.field1606 = new int[this.field1630];
        this.field1621 = new int[this.field1588];
        this.field1590 = new int[this.field1588];
        this.field1591 = new int[this.field1588];
        if (var3) {
            this.field1592 = new byte[this.field1588];
        }
        if (var4) {
            this.field1608 = new byte[this.field1588];
        }
        if (var5) {
            this.field1627 = new byte[this.field1588];
        }
        if (var6) {
            this.field1612 = new int[this.field1588];
        }
        if (var7) {
            this.field1597 = new short[this.field1588];
        }
        if (var8) {
            this.field1620 = new byte[this.field1588];
        }
        this.field1594 = new short[this.field1588];
        if (this.field1599 > 0) {
            this.field1600 = new byte[this.field1599];
            this.field1584 = new short[this.field1599];
            this.field1602 = new short[this.field1599];
            this.field1603 = new short[this.field1599];
            this.field1604 = new short[this.field1599];
            this.field1605 = new short[this.field1599];
            this.field1611 = new short[this.field1599];
            this.field1607 = new short[this.field1599];
            this.field1610 = new byte[this.field1599];
            this.field1593 = new short[this.field1599];
            this.field1617 = new short[this.field1599];
        }
        this.field1630 = 0;
        this.field1588 = 0;
        this.field1599 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class94 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1588; var13++) {
                    if (var3 && var12.field1592 != null) {
                        this.field1592[this.field1588] = var12.field1592[var13];
                    }
                    if (var4) {
                        if (var12.field1608 == null) {
                            this.field1608[this.field1588] = var12.field1598;
                        } else {
                            this.field1608[this.field1588] = var12.field1608[var13];
                        }
                    }
                    if (var5 && var12.field1627 != null) {
                        this.field1627[this.field1588] = var12.field1627[var13];
                    }
                    if (var6 && var12.field1612 != null) {
                        this.field1612[this.field1588] = var12.field1612[var13];
                    }
                    if (var7) {
                        if (var12.field1597 == null) {
                            this.field1597[this.field1588] = -1;
                        } else {
                            this.field1597[this.field1588] = var12.field1597[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1620 == null || var12.field1620[var13] == -1) {
                            this.field1620[this.field1588] = -1;
                        } else {
                            this.field1620[this.field1588] = (byte) (var12.field1620[var13] + this.field1599);
                        }
                    }
                    this.field1594[this.field1588] = var12.field1594[var13];
                    this.field1621[this.field1588] = this.method1878(var12, var12.field1621[var13]);
                    this.field1590[this.field1588] = this.method1878(var12, var12.field1590[var13]);
                    this.field1591[this.field1588] = this.method1878(var12, var12.field1591[var13]);
                    this.field1588++;
                }
                for (int var14 = 0; var14 < var12.field1599; var14++) {
                    byte var15 = this.field1600[this.field1599] = var12.field1600[var14];
                    if (var15 == 0) {
                        this.field1584[this.field1599] = (short) this.method1878(var12, var12.field1584[var14]);
                        this.field1602[this.field1599] = (short) this.method1878(var12, var12.field1602[var14]);
                        this.field1603[this.field1599] = (short) this.method1878(var12, var12.field1603[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1584[this.field1599] = var12.field1584[var14];
                        this.field1602[this.field1599] = var12.field1602[var14];
                        this.field1603[this.field1599] = var12.field1603[var14];
                        this.field1604[this.field1599] = var12.field1604[var14];
                        this.field1605[this.field1599] = var12.field1605[var14];
                        this.field1611[this.field1599] = var12.field1611[var14];
                        this.field1607[this.field1599] = var12.field1607[var14];
                        this.field1610[this.field1599] = var12.field1610[var14];
                        this.field1593[this.field1599] = var12.field1593[var14];
                    }
                    if (var15 == 2) {
                        this.field1617[this.field1599] = var12.field1617[var14];
                    }
                    this.field1599++;
                }
            }
        }
    }

    @ObfuscatedName("cs.h(Lcs;I)I")
    public final int method1878(class94 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1585[arg1];
        int var5 = arg0.field1586[arg1];
        int var6 = arg0.field1587[arg1];
        for (int var7 = 0; var7 < this.field1630; var7++) {
            if (this.field1585[var7] == var4 && this.field1586[var7] == var5 && this.field1587[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1585[this.field1630] = var4;
            this.field1586[this.field1630] = var5;
            this.field1587[this.field1630] = var6;
            if (arg0.field1606 != null) {
                this.field1606[this.field1630] = arg0.field1606[arg1];
            }
            var3 = this.field1630++;
        }
        return var3;
    }

    public class94(class94 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1630 = arg0.field1630;
        this.field1588 = arg0.field1588;
        this.field1599 = arg0.field1599;
        if (arg1) {
            this.field1585 = arg0.field1585;
            this.field1586 = arg0.field1586;
            this.field1587 = arg0.field1587;
        } else {
            this.field1585 = new int[this.field1630];
            this.field1586 = new int[this.field1630];
            this.field1587 = new int[this.field1630];
            for (int var6 = 0; var6 < this.field1630; var6++) {
                this.field1585[var6] = arg0.field1585[var6];
                this.field1586[var6] = arg0.field1586[var6];
                this.field1587[var6] = arg0.field1587[var6];
            }
        }
        if (arg2) {
            this.field1594 = arg0.field1594;
        } else {
            this.field1594 = new short[this.field1588];
            for (int var7 = 0; var7 < this.field1588; var7++) {
                this.field1594[var7] = arg0.field1594[var7];
            }
        }
        if (arg3 || arg0.field1597 == null) {
            this.field1597 = arg0.field1597;
        } else {
            this.field1597 = new short[this.field1588];
            for (int var8 = 0; var8 < this.field1588; var8++) {
                this.field1597[var8] = arg0.field1597[var8];
            }
        }
        if (arg4) {
            this.field1627 = arg0.field1627;
        } else {
            this.field1627 = new byte[this.field1588];
            if (arg0.field1627 == null) {
                for (int var9 = 0; var9 < this.field1588; var9++) {
                    this.field1627[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1588; var10++) {
                    this.field1627[var10] = arg0.field1627[var10];
                }
            }
        }
        this.field1621 = arg0.field1621;
        this.field1590 = arg0.field1590;
        this.field1591 = arg0.field1591;
        this.field1592 = arg0.field1592;
        this.field1608 = arg0.field1608;
        this.field1620 = arg0.field1620;
        this.field1598 = arg0.field1598;
        this.field1600 = arg0.field1600;
        this.field1584 = arg0.field1584;
        this.field1602 = arg0.field1602;
        this.field1603 = arg0.field1603;
        this.field1604 = arg0.field1604;
        this.field1605 = arg0.field1605;
        this.field1611 = arg0.field1611;
        this.field1607 = arg0.field1607;
        this.field1610 = arg0.field1610;
        this.field1593 = arg0.field1593;
        this.field1617 = arg0.field1617;
        this.field1606 = arg0.field1606;
        this.field1612 = arg0.field1612;
        this.field1601 = arg0.field1601;
        this.field1613 = arg0.field1613;
        this.field1616 = arg0.field1616;
        this.field1595 = arg0.field1595;
        this.field1589 = arg0.field1589;
        this.field1618 = arg0.field1618;
        this.field1619 = arg0.field1619;
    }

    @ObfuscatedName("cs.p()Lcs;")
    public class94 method1888() {
        class94 var1 = new class94();
        if (this.field1592 != null) {
            var1.field1592 = new byte[this.field1588];
            for (int var2 = 0; var2 < this.field1588; var2++) {
                var1.field1592[var2] = this.field1592[var2];
            }
        }
        var1.field1630 = this.field1630;
        var1.field1588 = this.field1588;
        var1.field1599 = this.field1599;
        var1.field1585 = this.field1585;
        var1.field1586 = this.field1586;
        var1.field1587 = this.field1587;
        var1.field1621 = this.field1621;
        var1.field1590 = this.field1590;
        var1.field1591 = this.field1591;
        var1.field1608 = this.field1608;
        var1.field1627 = this.field1627;
        var1.field1620 = this.field1620;
        var1.field1594 = this.field1594;
        var1.field1597 = this.field1597;
        var1.field1598 = this.field1598;
        var1.field1600 = this.field1600;
        var1.field1584 = this.field1584;
        var1.field1602 = this.field1602;
        var1.field1603 = this.field1603;
        var1.field1604 = this.field1604;
        var1.field1605 = this.field1605;
        var1.field1611 = this.field1611;
        var1.field1607 = this.field1607;
        var1.field1610 = this.field1610;
        var1.field1593 = this.field1593;
        var1.field1617 = this.field1617;
        var1.field1606 = this.field1606;
        var1.field1612 = this.field1612;
        var1.field1601 = this.field1601;
        var1.field1613 = this.field1613;
        var1.field1616 = this.field1616;
        var1.field1595 = this.field1595;
        var1.field1618 = this.field1618;
        var1.field1619 = this.field1619;
        return var1;
    }

    @ObfuscatedName("cs.g([[IIIIZI)Lcs;")
    public class94 method1919(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1893();
        int var7 = this.field1622 + arg1;
        int var8 = this.field1623 + arg1;
        int var9 = this.field1625 + arg3;
        int var10 = this.field1624 + arg3;
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
            var15.field1630 = this.field1630;
            var15.field1588 = this.field1588;
            var15.field1599 = this.field1599;
            var15.field1585 = this.field1585;
            var15.field1587 = this.field1587;
            var15.field1621 = this.field1621;
            var15.field1590 = this.field1590;
            var15.field1591 = this.field1591;
            var15.field1592 = this.field1592;
            var15.field1608 = this.field1608;
            var15.field1627 = this.field1627;
            var15.field1620 = this.field1620;
            var15.field1594 = this.field1594;
            var15.field1597 = this.field1597;
            var15.field1598 = this.field1598;
            var15.field1600 = this.field1600;
            var15.field1584 = this.field1584;
            var15.field1602 = this.field1602;
            var15.field1603 = this.field1603;
            var15.field1604 = this.field1604;
            var15.field1605 = this.field1605;
            var15.field1611 = this.field1611;
            var15.field1607 = this.field1607;
            var15.field1610 = this.field1610;
            var15.field1593 = this.field1593;
            var15.field1617 = this.field1617;
            var15.field1606 = this.field1606;
            var15.field1612 = this.field1612;
            var15.field1601 = this.field1601;
            var15.field1613 = this.field1613;
            var15.field1618 = this.field1618;
            var15.field1619 = this.field1619;
            var15.field1586 = new int[var15.field1630];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1630; var16++) {
                int var17 = this.field1585[var16] + arg1;
                int var18 = this.field1587[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1586[var16] = this.field1586[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1630; var26++) {
                int var27 = (-this.field1586[var26] << 16) / this.field1354;
                if (var27 < arg5) {
                    int var28 = this.field1585[var26] + arg1;
                    int var29 = this.field1587[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1586[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1586[var26];
                }
            }
        }
        var15.method1906();
        return var15;
    }

    @ObfuscatedName("cs.z()V")
    public void method1881() {
        int var10002;
        if (this.field1606 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1630; var3++) {
                int var4 = this.field1606[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1601 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1601[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1630) {
                int var7 = this.field1606[var6];
                this.field1601[var7][var1[var7]++] = var6++;
            }
            this.field1606 = null;
        }
        if (this.field1612 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1588; var10++) {
            int var11 = this.field1612[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1613 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1613[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1588) {
            int var14 = this.field1612[var13];
            this.field1613[var14][var8[var14]++] = var13++;
        }
        this.field1612 = null;
    }

    @ObfuscatedName("cs.t()V")
    public void method1882() {
        for (int var1 = 0; var1 < this.field1630; var1++) {
            int var2 = this.field1585[var1];
            this.field1585[var1] = this.field1587[var1];
            this.field1587[var1] = -var2;
        }
        this.method1906();
    }

    @ObfuscatedName("cs.y()V")
    public void method1883() {
        for (int var1 = 0; var1 < this.field1630; var1++) {
            this.field1585[var1] = -this.field1585[var1];
            this.field1587[var1] = -this.field1587[var1];
        }
        this.method1906();
    }

    @ObfuscatedName("cs.w()V")
    public void method1884() {
        for (int var1 = 0; var1 < this.field1630; var1++) {
            int var2 = this.field1587[var1];
            this.field1587[var1] = this.field1585[var1];
            this.field1585[var1] = -var2;
        }
        this.method1906();
    }

    @ObfuscatedName("cs.x(I)V")
    public void method1877(int arg0) {
        int var2 = field1629[arg0];
        int var3 = field1596[arg0];
        for (int var4 = 0; var4 < this.field1630; var4++) {
            int var5 = this.field1587[var4] * var2 + this.field1585[var4] * var3 >> 16;
            this.field1587[var4] = this.field1587[var4] * var3 - this.field1585[var4] * var2 >> 16;
            this.field1585[var4] = var5;
        }
        this.method1906();
    }

    @ObfuscatedName("cs.v(III)V")
    public void method1932(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1630; var4++) {
            this.field1585[var4] += arg0;
            this.field1586[var4] += arg1;
            this.field1587[var4] += arg2;
        }
        this.method1906();
    }

    @ObfuscatedName("cs.q(SS)V")
    public void method1879(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1588; var3++) {
            if (this.field1594[var3] == arg0) {
                this.field1594[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cs.f(SS)V")
    public void method1892(short arg0, short arg1) {
        if (this.field1597 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1588; var3++) {
            if (this.field1597[var3] == arg0) {
                this.field1597[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cs.s()V")
    public void method1922() {
        for (int var1 = 0; var1 < this.field1630; var1++) {
            this.field1587[var1] = -this.field1587[var1];
        }
        for (int var2 = 0; var2 < this.field1588; var2++) {
            int var3 = this.field1621[var2];
            this.field1621[var2] = this.field1591[var2];
            this.field1591[var2] = var3;
        }
        this.method1906();
    }

    @ObfuscatedName("cs.a(III)V")
    public void method1890(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1630; var4++) {
            this.field1585[var4] = this.field1585[var4] * arg0 / 128;
            this.field1586[var4] = this.field1586[var4] * arg1 / 128;
            this.field1587[var4] = this.field1587[var4] * arg2 / 128;
        }
        this.method1906();
    }

    @ObfuscatedName("cs.m()V")
    public void method1891() {
        if (this.field1616 != null) {
            return;
        }
        this.field1616 = new class90[this.field1630];
        for (int var1 = 0; var1 < this.field1630; var1++) {
            this.field1616[var1] = new class90();
        }
        for (int var2 = 0; var2 < this.field1588; var2++) {
            int var3 = this.field1621[var2];
            int var4 = this.field1590[var2];
            int var5 = this.field1591[var2];
            int var6 = this.field1585[var4] - this.field1585[var3];
            int var7 = this.field1586[var4] - this.field1586[var3];
            int var8 = this.field1587[var4] - this.field1587[var3];
            int var9 = this.field1585[var5] - this.field1585[var3];
            int var10 = this.field1586[var5] - this.field1586[var3];
            int var11 = this.field1587[var5] - this.field1587[var3];
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
            if (this.field1592 == null) {
                var19 = 0;
            } else {
                var19 = this.field1592[var2];
            }
            if (var19 == 0) {
                class90 var20 = this.field1616[var3];
                var20.field1530 += var16;
                var20.field1525 += var17;
                var20.field1526 += var18;
                var20.field1527++;
                class90 var21 = this.field1616[var4];
                var21.field1530 += var16;
                var21.field1525 += var17;
                var21.field1526 += var18;
                var21.field1527++;
                class90 var22 = this.field1616[var5];
                var22.field1530 += var16;
                var22.field1525 += var17;
                var22.field1526 += var18;
                var22.field1527++;
            } else if (var19 == 1) {
                if (this.field1595 == null) {
                    this.field1595 = new class78[this.field1588];
                }
                class78 var23 = this.field1595[var2] = new class78();
                var23.field1348 = var16;
                var23.field1347 = var17;
                var23.field1352 = var18;
            }
        }
    }

    @ObfuscatedName("cs.c()V")
    public void method1906() {
        this.field1616 = null;
        this.field1589 = null;
        this.field1595 = null;
        this.field1609 = false;
    }

    @ObfuscatedName("cs.l()V")
    public void method1893() {
        if (this.field1609) {
            return;
        }
        this.field1354 = 0;
        this.field1615 = 0;
        this.field1622 = 999999;
        this.field1623 = -999999;
        this.field1624 = -99999;
        this.field1625 = 99999;
        for (int var1 = 0; var1 < this.field1630; var1++) {
            int var2 = this.field1585[var1];
            int var3 = this.field1586[var1];
            int var4 = this.field1587[var1];
            if (var2 < this.field1622) {
                this.field1622 = var2;
            }
            if (var2 > this.field1623) {
                this.field1623 = var2;
            }
            if (var4 < this.field1625) {
                this.field1625 = var4;
            }
            if (var4 > this.field1624) {
                this.field1624 = var4;
            }
            if (-var3 > this.field1354) {
                this.field1354 = -var3;
            }
            if (var3 > this.field1615) {
                this.field1615 = var3;
            }
        }
        this.field1609 = true;
    }

    @ObfuscatedName("cs.u(Lcs;Lcs;IIIZ)V")
    public static void method1885(class94 arg0, class94 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1893();
        arg0.method1891();
        arg1.method1893();
        arg1.method1891();
        field1628++;
        int var6 = 0;
        int[] var7 = arg1.field1585;
        int var8 = arg1.field1630;
        for (int var9 = 0; var9 < arg0.field1630; var9++) {
            class90 var10 = arg0.field1616[var9];
            if (var10.field1527 != 0) {
                int var11 = arg0.field1586[var9] - arg3;
                if (var11 <= arg1.field1615) {
                    int var12 = arg0.field1585[var9] - arg2;
                    if (var12 >= arg1.field1622 && var12 <= arg1.field1623) {
                        int var13 = arg0.field1587[var9] - arg4;
                        if (var13 >= arg1.field1625 && var13 <= arg1.field1624) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class90 var15 = arg1.field1616[var14];
                                if (var7[var14] == var12 && arg1.field1587[var14] == var13 && arg1.field1586[var14] == var11 && var15.field1527 != 0) {
                                    if (arg0.field1589 == null) {
                                        arg0.field1589 = new class90[arg0.field1630];
                                    }
                                    if (arg1.field1589 == null) {
                                        arg1.field1589 = new class90[var8];
                                    }
                                    class90 var16 = arg0.field1589[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1589[var9] = new class90(var10);
                                    }
                                    class90 var17 = arg1.field1589[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1589[var14] = new class90(var15);
                                    }
                                    var16.field1530 += var15.field1530;
                                    var16.field1525 += var15.field1525;
                                    var16.field1526 += var15.field1526;
                                    var16.field1527 += var15.field1527;
                                    var17.field1530 += var10.field1530;
                                    var17.field1525 += var10.field1525;
                                    var17.field1526 += var10.field1526;
                                    var17.field1527 += var10.field1527;
                                    var6++;
                                    field1626[var9] = field1628;
                                    field1614[var14] = field1628;
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
        for (int var18 = 0; var18 < arg0.field1588; var18++) {
            if (field1626[arg0.field1621[var18]] == field1628 && field1626[arg0.field1590[var18]] == field1628 && field1626[arg0.field1591[var18]] == field1628) {
                if (arg0.field1592 == null) {
                    arg0.field1592 = new byte[arg0.field1588];
                }
                arg0.field1592[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1588; var19++) {
            if (field1614[arg1.field1621[var19]] == field1628 && field1614[arg1.field1590[var19]] == field1628 && field1614[arg1.field1591[var19]] == field1628) {
                if (arg1.field1592 == null) {
                    arg1.field1592 = new byte[arg1.field1588];
                }
                arg1.field1592[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cs.r(IIIII)Lcr;")
    public final class99 method1940(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1891();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class99 var8 = new class99();
        var8.field1710 = new int[this.field1588];
        var8.field1711 = new int[this.field1588];
        var8.field1712 = new int[this.field1588];
        if (this.field1599 > 0 && this.field1620 != null) {
            int[] var9 = new int[this.field1599];
            for (int var10 = 0; var10 < this.field1588; var10++) {
                if (this.field1620[var10] != -1) {
                    var9[this.field1620[var10] & 0xFF]++;
                }
            }
            var8.field1718 = 0;
            for (int var11 = 0; var11 < this.field1599; var11++) {
                if (var9[var11] > 0 && this.field1600[var11] == 0) {
                    var8.field1718++;
                }
            }
            var8.field1757 = new int[var8.field1718];
            var8.field1720 = new int[var8.field1718];
            var8.field1721 = new int[var8.field1718];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1599; var13++) {
                if (var9[var13] > 0 && this.field1600[var13] == 0) {
                    var8.field1757[var12] = this.field1584[var13] & 0xFFFF;
                    var8.field1720[var12] = this.field1602[var13] & 0xFFFF;
                    var8.field1721[var12] = this.field1603[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1715 = new byte[this.field1588];
            for (int var14 = 0; var14 < this.field1588; var14++) {
                if (this.field1620[var14] == -1) {
                    var8.field1715[var14] = -1;
                } else {
                    var8.field1715[var14] = (byte) var9[this.field1620[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1588; var15++) {
            byte var16;
            if (this.field1592 == null) {
                var16 = 0;
            } else {
                var16 = this.field1592[var15];
            }
            byte var17;
            if (this.field1627 == null) {
                var17 = 0;
            } else {
                var17 = this.field1627[var15];
            }
            short var18;
            if (this.field1597 == null) {
                var18 = -1;
            } else {
                var18 = this.field1597[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1594[var15] & 0xFFFF;
                    class90 var20;
                    if (this.field1589 == null || this.field1589[this.field1621[var15]] == null) {
                        var20 = this.field1616[this.field1621[var15]];
                    } else {
                        var20 = this.field1589[this.field1621[var15]];
                    }
                    int var21 = (var20.field1526 * arg4 + var20.field1530 * arg2 + var20.field1525 * arg3) / (var20.field1527 * var7) + arg0;
                    var8.field1710[var15] = method1896(var19, var21);
                    class90 var22;
                    if (this.field1589 == null || this.field1589[this.field1590[var15]] == null) {
                        var22 = this.field1616[this.field1590[var15]];
                    } else {
                        var22 = this.field1589[this.field1590[var15]];
                    }
                    int var23 = (var22.field1526 * arg4 + var22.field1530 * arg2 + var22.field1525 * arg3) / (var22.field1527 * var7) + arg0;
                    var8.field1711[var15] = method1896(var19, var23);
                    class90 var24;
                    if (this.field1589 == null || this.field1589[this.field1591[var15]] == null) {
                        var24 = this.field1616[this.field1591[var15]];
                    } else {
                        var24 = this.field1589[this.field1591[var15]];
                    }
                    int var25 = (var24.field1526 * arg4 + var24.field1530 * arg2 + var24.field1525 * arg3) / (var24.field1527 * var7) + arg0;
                    var8.field1712[var15] = method1896(var19, var25);
                } else if (var16 == 1) {
                    class78 var26 = this.field1595[var15];
                    int var27 = (var26.field1352 * arg4 + var26.field1348 * arg2 + var26.field1347 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1710[var15] = method1896(this.field1594[var15] & 0xFFFF, var27);
                    var8.field1712[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1710[var15] = 128;
                    var8.field1712[var15] = -1;
                } else {
                    var8.field1712[var15] = -2;
                }
            } else if (var16 == 0) {
                class90 var28;
                if (this.field1589 == null || this.field1589[this.field1621[var15]] == null) {
                    var28 = this.field1616[this.field1621[var15]];
                } else {
                    var28 = this.field1589[this.field1621[var15]];
                }
                int var29 = (var28.field1526 * arg4 + var28.field1530 * arg2 + var28.field1525 * arg3) / (var28.field1527 * var7) + arg0;
                var8.field1710[var15] = method1934(var29);
                class90 var30;
                if (this.field1589 == null || this.field1589[this.field1590[var15]] == null) {
                    var30 = this.field1616[this.field1590[var15]];
                } else {
                    var30 = this.field1589[this.field1590[var15]];
                }
                int var31 = (var30.field1526 * arg4 + var30.field1530 * arg2 + var30.field1525 * arg3) / (var30.field1527 * var7) + arg0;
                var8.field1711[var15] = method1934(var31);
                class90 var32;
                if (this.field1589 == null || this.field1589[this.field1591[var15]] == null) {
                    var32 = this.field1616[this.field1591[var15]];
                } else {
                    var32 = this.field1589[this.field1591[var15]];
                }
                int var33 = (var32.field1526 * arg4 + var32.field1530 * arg2 + var32.field1525 * arg3) / (var32.field1527 * var7) + arg0;
                var8.field1712[var15] = method1934(var33);
            } else if (var16 == 1) {
                class78 var34 = this.field1595[var15];
                int var35 = (var34.field1352 * arg4 + var34.field1348 * arg2 + var34.field1347 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1710[var15] = method1934(var35);
                var8.field1712[var15] = -1;
            } else {
                var8.field1712[var15] = -2;
            }
        }
        this.method1881();
        var8.field1702 = this.field1630;
        var8.field1705 = this.field1585;
        var8.field1704 = this.field1586;
        var8.field1736 = this.field1587;
        var8.field1706 = this.field1588;
        var8.field1707 = this.field1621;
        var8.field1755 = this.field1590;
        var8.field1719 = this.field1591;
        var8.field1713 = this.field1608;
        var8.field1714 = this.field1627;
        var8.field1699 = this.field1598;
        var8.field1763 = this.field1601;
        var8.field1723 = this.field1613;
        var8.field1716 = this.field1597;
        return var8;
    }

    @ObfuscatedName("cs.an(II)I")
    public static final int method1896(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cs.ao(I)I")
    public static final int method1934(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
