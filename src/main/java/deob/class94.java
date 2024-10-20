package deob;

@ObfuscatedName("cy")
public class class94 extends class79 {

    @ObfuscatedName("cy.a")
    public int field1627 = 0;

    @ObfuscatedName("cy.v")
    public int[] field1584;

    @ObfuscatedName("cy.i")
    public int[] field1610;

    @ObfuscatedName("cy.b")
    public int[] field1583;

    @ObfuscatedName("cy.l")
    public int field1587 = 0;

    @ObfuscatedName("cy.m")
    public int[] field1626;

    @ObfuscatedName("cy.w")
    public int[] field1589;

    @ObfuscatedName("cy.e")
    public int[] field1628;

    @ObfuscatedName("cy.n")
    public byte[] field1591;

    @ObfuscatedName("cy.s")
    public byte[] field1592;

    @ObfuscatedName("cy.k")
    public byte[] field1593;

    @ObfuscatedName("cy.f")
    public byte[] field1594;

    @ObfuscatedName("cy.d")
    public short[] field1595;

    @ObfuscatedName("cy.x")
    public short[] field1596;

    @ObfuscatedName("cy.o")
    public byte field1597 = 0;

    @ObfuscatedName("cy.q")
    public int field1590;

    @ObfuscatedName("cy.t")
    public byte[] field1608;

    @ObfuscatedName("cy.h")
    public short[] field1600;

    @ObfuscatedName("cy.u")
    public short[] field1604;

    @ObfuscatedName("cy.j")
    public short[] field1588;

    @ObfuscatedName("cy.g")
    public short[] field1603;

    @ObfuscatedName("cy.y")
    public short[] field1586;

    @ObfuscatedName("cy.p")
    public short[] field1605;

    @ObfuscatedName("cy.r")
    public short[] field1606;

    @ObfuscatedName("cy.z")
    public short[] field1607;

    @ObfuscatedName("cy.c")
    public short[] field1616;

    @ObfuscatedName("cy.an")
    public byte[] field1609;

    @ObfuscatedName("cy.as")
    public int[] field1585;

    @ObfuscatedName("cy.ah")
    public int[] field1611;

    @ObfuscatedName("cy.ar")
    public int[][] field1621;

    @ObfuscatedName("cy.ae")
    public int[][] field1613;

    @ObfuscatedName("cy.av")
    public class78[] field1614;

    @ObfuscatedName("cy.al")
    public class90[] field1615;

    @ObfuscatedName("cy.aq")
    public class90[] field1602;

    @ObfuscatedName("cy.am")
    public short field1617;

    @ObfuscatedName("cy.ax")
    public short field1618;

    @ObfuscatedName("cy.az")
    public boolean field1619 = false;

    @ObfuscatedName("cy.ai")
    public int field1620;

    @ObfuscatedName("cy.aa")
    public int field1601;

    @ObfuscatedName("cy.at")
    public int field1622;

    @ObfuscatedName("cy.aw")
    public int field1623;

    @ObfuscatedName("cy.ao")
    public int field1624;

    @ObfuscatedName("cy.ag")
    public static int[] field1625 = new int[10000];

    @ObfuscatedName("cy.ad")
    public static int[] field1599 = new int[10000];

    @ObfuscatedName("cy.au")
    public static int field1612 = 0;

    @ObfuscatedName("cy.ak")
    public static int[] field1598 = class85.field1482;

    @ObfuscatedName("cy.aj")
    public static int[] field1629 = class85.field1483;

    public class94() {
    }

    @ObfuscatedName("cy.a(Lek;II)Lcy;")
    public static class94 method1882(class151 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2731(arg1, arg2);
        return var3 == null ? null : new class94(var3);
    }

    public class94(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1881(arg0);
        } else {
            this.method1947(arg0);
        }
    }

    @ObfuscatedName("cy.i([B)V")
    public void method1881(byte[] arg0) {
        class110 var2 = new class110(arg0);
        class110 var3 = new class110(arg0);
        class110 var4 = new class110(arg0);
        class110 var5 = new class110(arg0);
        class110 var6 = new class110(arg0);
        class110 var7 = new class110(arg0);
        class110 var8 = new class110(arg0);
        var2.field1861 = arg0.length - 23;
        int var9 = var2.method2282();
        int var10 = var2.method2282();
        int var11 = var2.method2199();
        int var12 = var2.method2199();
        int var13 = var2.method2199();
        int var14 = var2.method2199();
        int var15 = var2.method2199();
        int var16 = var2.method2199();
        int var17 = var2.method2199();
        int var18 = var2.method2282();
        int var19 = var2.method2282();
        int var20 = var2.method2282();
        int var21 = var2.method2282();
        int var22 = var2.method2282();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1608 = new byte[var11];
            var2.field1861 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1608[var26] = var2.method2132();
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
        this.field1627 = var9;
        this.field1587 = var10;
        this.field1590 = var11;
        this.field1584 = new int[var9];
        this.field1610 = new int[var9];
        this.field1583 = new int[var9];
        this.field1626 = new int[var10];
        this.field1589 = new int[var10];
        this.field1628 = new int[var10];
        if (var17 == 1) {
            this.field1585 = new int[var9];
        }
        if (var12 == 1) {
            this.field1591 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1592 = new byte[var10];
        } else {
            this.field1597 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1593 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1611 = new int[var10];
        }
        if (var16 == 1) {
            this.field1596 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1594 = new byte[var10];
        }
        this.field1595 = new short[var10];
        if (var11 > 0) {
            this.field1600 = new short[var11];
            this.field1604 = new short[var11];
            this.field1588 = new short[var11];
            if (var24 > 0) {
                this.field1603 = new short[var24];
                this.field1586 = new short[var24];
                this.field1605 = new short[var24];
                this.field1606 = new short[var24];
                this.field1609 = new byte[var24];
                this.field1607 = new short[var24];
            }
            if (var25 > 0) {
                this.field1616 = new short[var25];
            }
        }
        var2.field1861 = var11;
        var3.field1861 = var44;
        var4.field1861 = var46;
        var5.field1861 = var48;
        var6.field1861 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2199();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2231();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2231();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2231();
            }
            this.field1584[var67] = var64 + var69;
            this.field1610[var67] = var65 + var70;
            this.field1583[var67] = var66 + var71;
            var64 = this.field1584[var67];
            var65 = this.field1610[var67];
            var66 = this.field1583[var67];
            if (var17 == 1) {
                this.field1585[var67] = var6.method2199();
            }
        }
        var2.field1861 = var42;
        var3.field1861 = var31;
        var4.field1861 = var34;
        var5.field1861 = var37;
        var6.field1861 = var35;
        var7.field1861 = var40;
        var8.field1861 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1595[var72] = (short) var2.method2282();
            if (var12 == 1) {
                this.field1591[var72] = var3.method2132();
            }
            if (var13 == 255) {
                this.field1592[var72] = var4.method2132();
            }
            if (var14 == 1) {
                this.field1593[var72] = var5.method2132();
            }
            if (var15 == 1) {
                this.field1611[var72] = var6.method2199();
            }
            if (var16 == 1) {
                this.field1596[var72] = (short) (var7.method2282() - 1);
            }
            if (this.field1594 != null && this.field1596[var72] != -1) {
                this.field1594[var72] = (byte) (var8.method2199() - 1);
            }
        }
        var2.field1861 = var33;
        var3.field1861 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2199();
            if (var78 == 1) {
                var73 = var2.method2231() + var76;
                var74 = var2.method2231() + var73;
                var75 = var2.method2231() + var74;
                var76 = var75;
                this.field1626[var77] = var73;
                this.field1589[var77] = var74;
                this.field1628[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2231() + var76;
                var76 = var75;
                this.field1626[var77] = var73;
                this.field1589[var77] = var74;
                this.field1628[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2231() + var76;
                var76 = var75;
                this.field1626[var77] = var73;
                this.field1589[var77] = var74;
                this.field1628[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2231() + var76;
                var76 = var75;
                this.field1626[var77] = var73;
                this.field1589[var77] = var81;
                this.field1628[var77] = var75;
            }
        }
        var2.field1861 = var50;
        var3.field1861 = var52;
        var4.field1861 = var54;
        var5.field1861 = var56;
        var6.field1861 = var58;
        var7.field1861 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1608[var82] & 0xFF;
            if (var83 == 0) {
                this.field1600[var82] = (short) var2.method2282();
                this.field1604[var82] = (short) var2.method2282();
                this.field1588[var82] = (short) var2.method2282();
            }
            if (var83 == 1) {
                this.field1600[var82] = (short) var3.method2282();
                this.field1604[var82] = (short) var3.method2282();
                this.field1588[var82] = (short) var3.method2282();
                this.field1603[var82] = (short) var4.method2282();
                this.field1586[var82] = (short) var4.method2282();
                this.field1605[var82] = (short) var4.method2282();
                this.field1606[var82] = (short) var5.method2282();
                this.field1609[var82] = var6.method2132();
                this.field1607[var82] = (short) var7.method2282();
            }
            if (var83 == 2) {
                this.field1600[var82] = (short) var3.method2282();
                this.field1604[var82] = (short) var3.method2282();
                this.field1588[var82] = (short) var3.method2282();
                this.field1603[var82] = (short) var4.method2282();
                this.field1586[var82] = (short) var4.method2282();
                this.field1605[var82] = (short) var4.method2282();
                this.field1606[var82] = (short) var5.method2282();
                this.field1609[var82] = var6.method2132();
                this.field1607[var82] = (short) var7.method2282();
                this.field1616[var82] = (short) var7.method2282();
            }
            if (var83 == 3) {
                this.field1600[var82] = (short) var3.method2282();
                this.field1604[var82] = (short) var3.method2282();
                this.field1588[var82] = (short) var3.method2282();
                this.field1603[var82] = (short) var4.method2282();
                this.field1586[var82] = (short) var4.method2282();
                this.field1605[var82] = (short) var4.method2282();
                this.field1606[var82] = (short) var5.method2282();
                this.field1609[var82] = var6.method2132();
                this.field1607[var82] = (short) var7.method2282();
            }
        }
        var2.field1861 = var62;
        int var84 = var2.method2199();
        if (var84 == 0) {
            return;
        }
        new class84();
        var2.method2282();
        var2.method2282();
        var2.method2282();
        var2.method2136();
    }

    @ObfuscatedName("cy.b([B)V")
    public void method1947(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class110 var4 = new class110(arg0);
        class110 var5 = new class110(arg0);
        class110 var6 = new class110(arg0);
        class110 var7 = new class110(arg0);
        class110 var8 = new class110(arg0);
        var4.field1861 = arg0.length - 18;
        int var9 = var4.method2282();
        int var10 = var4.method2282();
        int var11 = var4.method2199();
        int var12 = var4.method2199();
        int var13 = var4.method2199();
        int var14 = var4.method2199();
        int var15 = var4.method2199();
        int var16 = var4.method2199();
        int var17 = var4.method2282();
        int var18 = var4.method2282();
        int var19 = var4.method2282();
        int var20 = var4.method2282();
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
        this.field1627 = var9;
        this.field1587 = var10;
        this.field1590 = var11;
        this.field1584 = new int[var9];
        this.field1610 = new int[var9];
        this.field1583 = new int[var9];
        this.field1626 = new int[var10];
        this.field1589 = new int[var10];
        this.field1628 = new int[var10];
        if (var11 > 0) {
            this.field1608 = new byte[var11];
            this.field1600 = new short[var11];
            this.field1604 = new short[var11];
            this.field1588 = new short[var11];
        }
        if (var16 == 1) {
            this.field1585 = new int[var9];
        }
        if (var12 == 1) {
            this.field1591 = new byte[var10];
            this.field1594 = new byte[var10];
            this.field1596 = new short[var10];
        }
        if (var13 == 255) {
            this.field1592 = new byte[var10];
        } else {
            this.field1597 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1593 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1611 = new int[var10];
        }
        this.field1595 = new short[var10];
        var4.field1861 = var21;
        var5.field1861 = var36;
        var6.field1861 = var38;
        var7.field1861 = var40;
        var8.field1861 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2199();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2231();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2231();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2231();
            }
            this.field1584[var46] = var43 + var48;
            this.field1610[var46] = var44 + var49;
            this.field1583[var46] = var45 + var50;
            var43 = this.field1584[var46];
            var44 = this.field1610[var46];
            var45 = this.field1583[var46];
            if (var16 == 1) {
                this.field1585[var46] = var8.method2199();
            }
        }
        var4.field1861 = var32;
        var5.field1861 = var28;
        var6.field1861 = var26;
        var7.field1861 = var30;
        var8.field1861 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1595[var51] = (short) var4.method2282();
            if (var12 == 1) {
                int var52 = var5.method2199();
                if ((var52 & 0x1) == 1) {
                    this.field1591[var51] = 1;
                    var2 = true;
                } else {
                    this.field1591[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1594[var51] = (byte) (var52 >> 2);
                    this.field1596[var51] = this.field1595[var51];
                    this.field1595[var51] = 127;
                    if (this.field1596[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1594[var51] = -1;
                    this.field1596[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1592[var51] = var6.method2132();
            }
            if (var14 == 1) {
                this.field1593[var51] = var7.method2132();
            }
            if (var15 == 1) {
                this.field1611[var51] = var8.method2199();
            }
        }
        var4.field1861 = var25;
        var5.field1861 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2199();
            if (var58 == 1) {
                var53 = var4.method2231() + var56;
                var54 = var4.method2231() + var53;
                var55 = var4.method2231() + var54;
                var56 = var55;
                this.field1626[var57] = var53;
                this.field1589[var57] = var54;
                this.field1628[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2231() + var56;
                var56 = var55;
                this.field1626[var57] = var53;
                this.field1589[var57] = var54;
                this.field1628[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2231() + var56;
                var56 = var55;
                this.field1626[var57] = var53;
                this.field1589[var57] = var54;
                this.field1628[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2231() + var56;
                var56 = var55;
                this.field1626[var57] = var53;
                this.field1589[var57] = var61;
                this.field1628[var57] = var55;
            }
        }
        var4.field1861 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1608[var62] = 0;
            this.field1600[var62] = (short) var4.method2282();
            this.field1604[var62] = (short) var4.method2282();
            this.field1588[var62] = (short) var4.method2282();
        }
        if (this.field1594 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1594[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1600[var65] & 0xFFFF) == this.field1626[var64] && (this.field1604[var65] & 0xFFFF) == this.field1589[var64] && (this.field1588[var65] & 0xFFFF) == this.field1628[var64]) {
                        this.field1594[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1594 = null;
            }
        }
        if (!var3) {
            this.field1596 = null;
        }
        if (!var2) {
            this.field1591 = null;
        }
    }

    public class94(class94[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1627 = 0;
        this.field1587 = 0;
        this.field1590 = 0;
        this.field1597 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class94 var10 = arg0[var9];
            if (var10 != null) {
                this.field1627 += var10.field1627;
                this.field1587 += var10.field1587;
                this.field1590 += var10.field1590;
                if (var10.field1592 == null) {
                    if (this.field1597 == -1) {
                        this.field1597 = var10.field1597;
                    }
                    if (this.field1597 != var10.field1597) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1591 != null;
                var5 |= var10.field1593 != null;
                var6 |= var10.field1611 != null;
                var7 |= var10.field1596 != null;
                var8 |= var10.field1594 != null;
            }
        }
        this.field1584 = new int[this.field1627];
        this.field1610 = new int[this.field1627];
        this.field1583 = new int[this.field1627];
        this.field1585 = new int[this.field1627];
        this.field1626 = new int[this.field1587];
        this.field1589 = new int[this.field1587];
        this.field1628 = new int[this.field1587];
        if (var3) {
            this.field1591 = new byte[this.field1587];
        }
        if (var4) {
            this.field1592 = new byte[this.field1587];
        }
        if (var5) {
            this.field1593 = new byte[this.field1587];
        }
        if (var6) {
            this.field1611 = new int[this.field1587];
        }
        if (var7) {
            this.field1596 = new short[this.field1587];
        }
        if (var8) {
            this.field1594 = new byte[this.field1587];
        }
        this.field1595 = new short[this.field1587];
        if (this.field1590 > 0) {
            this.field1608 = new byte[this.field1590];
            this.field1600 = new short[this.field1590];
            this.field1604 = new short[this.field1590];
            this.field1588 = new short[this.field1590];
            this.field1603 = new short[this.field1590];
            this.field1586 = new short[this.field1590];
            this.field1605 = new short[this.field1590];
            this.field1606 = new short[this.field1590];
            this.field1609 = new byte[this.field1590];
            this.field1607 = new short[this.field1590];
            this.field1616 = new short[this.field1590];
        }
        this.field1627 = 0;
        this.field1587 = 0;
        this.field1590 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class94 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1587; var13++) {
                    if (var3 && var12.field1591 != null) {
                        this.field1591[this.field1587] = var12.field1591[var13];
                    }
                    if (var4) {
                        if (var12.field1592 == null) {
                            this.field1592[this.field1587] = var12.field1597;
                        } else {
                            this.field1592[this.field1587] = var12.field1592[var13];
                        }
                    }
                    if (var5 && var12.field1593 != null) {
                        this.field1593[this.field1587] = var12.field1593[var13];
                    }
                    if (var6 && var12.field1611 != null) {
                        this.field1611[this.field1587] = var12.field1611[var13];
                    }
                    if (var7) {
                        if (var12.field1596 == null) {
                            this.field1596[this.field1587] = -1;
                        } else {
                            this.field1596[this.field1587] = var12.field1596[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1594 == null || var12.field1594[var13] == -1) {
                            this.field1594[this.field1587] = -1;
                        } else {
                            this.field1594[this.field1587] = (byte) (var12.field1594[var13] + this.field1590);
                        }
                    }
                    this.field1595[this.field1587] = var12.field1595[var13];
                    this.field1626[this.field1587] = this.method1883(var12, var12.field1626[var13]);
                    this.field1589[this.field1587] = this.method1883(var12, var12.field1589[var13]);
                    this.field1628[this.field1587] = this.method1883(var12, var12.field1628[var13]);
                    this.field1587++;
                }
                for (int var14 = 0; var14 < var12.field1590; var14++) {
                    byte var15 = this.field1608[this.field1590] = var12.field1608[var14];
                    if (var15 == 0) {
                        this.field1600[this.field1590] = (short) this.method1883(var12, var12.field1600[var14]);
                        this.field1604[this.field1590] = (short) this.method1883(var12, var12.field1604[var14]);
                        this.field1588[this.field1590] = (short) this.method1883(var12, var12.field1588[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1600[this.field1590] = var12.field1600[var14];
                        this.field1604[this.field1590] = var12.field1604[var14];
                        this.field1588[this.field1590] = var12.field1588[var14];
                        this.field1603[this.field1590] = var12.field1603[var14];
                        this.field1586[this.field1590] = var12.field1586[var14];
                        this.field1605[this.field1590] = var12.field1605[var14];
                        this.field1606[this.field1590] = var12.field1606[var14];
                        this.field1609[this.field1590] = var12.field1609[var14];
                        this.field1607[this.field1590] = var12.field1607[var14];
                    }
                    if (var15 == 2) {
                        this.field1616[this.field1590] = var12.field1616[var14];
                    }
                    this.field1590++;
                }
            }
        }
    }

    @ObfuscatedName("cy.l(Lcy;I)I")
    public final int method1883(class94 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1584[arg1];
        int var5 = arg0.field1610[arg1];
        int var6 = arg0.field1583[arg1];
        for (int var7 = 0; var7 < this.field1627; var7++) {
            if (this.field1584[var7] == var4 && this.field1610[var7] == var5 && this.field1583[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1584[this.field1627] = var4;
            this.field1610[this.field1627] = var5;
            this.field1583[this.field1627] = var6;
            if (arg0.field1585 != null) {
                this.field1585[this.field1627] = arg0.field1585[arg1];
            }
            var3 = this.field1627++;
        }
        return var3;
    }

    public class94(class94 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1627 = arg0.field1627;
        this.field1587 = arg0.field1587;
        this.field1590 = arg0.field1590;
        if (arg1) {
            this.field1584 = arg0.field1584;
            this.field1610 = arg0.field1610;
            this.field1583 = arg0.field1583;
        } else {
            this.field1584 = new int[this.field1627];
            this.field1610 = new int[this.field1627];
            this.field1583 = new int[this.field1627];
            for (int var6 = 0; var6 < this.field1627; var6++) {
                this.field1584[var6] = arg0.field1584[var6];
                this.field1610[var6] = arg0.field1610[var6];
                this.field1583[var6] = arg0.field1583[var6];
            }
        }
        if (arg2) {
            this.field1595 = arg0.field1595;
        } else {
            this.field1595 = new short[this.field1587];
            for (int var7 = 0; var7 < this.field1587; var7++) {
                this.field1595[var7] = arg0.field1595[var7];
            }
        }
        if (arg3 || arg0.field1596 == null) {
            this.field1596 = arg0.field1596;
        } else {
            this.field1596 = new short[this.field1587];
            for (int var8 = 0; var8 < this.field1587; var8++) {
                this.field1596[var8] = arg0.field1596[var8];
            }
        }
        if (arg4) {
            this.field1593 = arg0.field1593;
        } else {
            this.field1593 = new byte[this.field1587];
            if (arg0.field1593 == null) {
                for (int var9 = 0; var9 < this.field1587; var9++) {
                    this.field1593[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1587; var10++) {
                    this.field1593[var10] = arg0.field1593[var10];
                }
            }
        }
        this.field1626 = arg0.field1626;
        this.field1589 = arg0.field1589;
        this.field1628 = arg0.field1628;
        this.field1591 = arg0.field1591;
        this.field1592 = arg0.field1592;
        this.field1594 = arg0.field1594;
        this.field1597 = arg0.field1597;
        this.field1608 = arg0.field1608;
        this.field1600 = arg0.field1600;
        this.field1604 = arg0.field1604;
        this.field1588 = arg0.field1588;
        this.field1603 = arg0.field1603;
        this.field1586 = arg0.field1586;
        this.field1605 = arg0.field1605;
        this.field1606 = arg0.field1606;
        this.field1609 = arg0.field1609;
        this.field1607 = arg0.field1607;
        this.field1616 = arg0.field1616;
        this.field1585 = arg0.field1585;
        this.field1611 = arg0.field1611;
        this.field1621 = arg0.field1621;
        this.field1613 = arg0.field1613;
        this.field1615 = arg0.field1615;
        this.field1614 = arg0.field1614;
        this.field1602 = arg0.field1602;
        this.field1617 = arg0.field1617;
        this.field1618 = arg0.field1618;
    }

    @ObfuscatedName("cy.m()Lcy;")
    public class94 method1884() {
        class94 var1 = new class94();
        if (this.field1591 != null) {
            var1.field1591 = new byte[this.field1587];
            for (int var2 = 0; var2 < this.field1587; var2++) {
                var1.field1591[var2] = this.field1591[var2];
            }
        }
        var1.field1627 = this.field1627;
        var1.field1587 = this.field1587;
        var1.field1590 = this.field1590;
        var1.field1584 = this.field1584;
        var1.field1610 = this.field1610;
        var1.field1583 = this.field1583;
        var1.field1626 = this.field1626;
        var1.field1589 = this.field1589;
        var1.field1628 = this.field1628;
        var1.field1592 = this.field1592;
        var1.field1593 = this.field1593;
        var1.field1594 = this.field1594;
        var1.field1595 = this.field1595;
        var1.field1596 = this.field1596;
        var1.field1597 = this.field1597;
        var1.field1608 = this.field1608;
        var1.field1600 = this.field1600;
        var1.field1604 = this.field1604;
        var1.field1588 = this.field1588;
        var1.field1603 = this.field1603;
        var1.field1586 = this.field1586;
        var1.field1605 = this.field1605;
        var1.field1606 = this.field1606;
        var1.field1609 = this.field1609;
        var1.field1607 = this.field1607;
        var1.field1616 = this.field1616;
        var1.field1585 = this.field1585;
        var1.field1611 = this.field1611;
        var1.field1621 = this.field1621;
        var1.field1613 = this.field1613;
        var1.field1615 = this.field1615;
        var1.field1614 = this.field1614;
        var1.field1617 = this.field1617;
        var1.field1618 = this.field1618;
        return var1;
    }

    @ObfuscatedName("cy.e([[IIIIZI)Lcy;")
    public class94 method1885(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1957();
        int var7 = this.field1601 + arg1;
        int var8 = this.field1622 + arg1;
        int var9 = this.field1624 + arg3;
        int var10 = this.field1623 + arg3;
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
            var15.field1627 = this.field1627;
            var15.field1587 = this.field1587;
            var15.field1590 = this.field1590;
            var15.field1584 = this.field1584;
            var15.field1583 = this.field1583;
            var15.field1626 = this.field1626;
            var15.field1589 = this.field1589;
            var15.field1628 = this.field1628;
            var15.field1591 = this.field1591;
            var15.field1592 = this.field1592;
            var15.field1593 = this.field1593;
            var15.field1594 = this.field1594;
            var15.field1595 = this.field1595;
            var15.field1596 = this.field1596;
            var15.field1597 = this.field1597;
            var15.field1608 = this.field1608;
            var15.field1600 = this.field1600;
            var15.field1604 = this.field1604;
            var15.field1588 = this.field1588;
            var15.field1603 = this.field1603;
            var15.field1586 = this.field1586;
            var15.field1605 = this.field1605;
            var15.field1606 = this.field1606;
            var15.field1609 = this.field1609;
            var15.field1607 = this.field1607;
            var15.field1616 = this.field1616;
            var15.field1585 = this.field1585;
            var15.field1611 = this.field1611;
            var15.field1621 = this.field1621;
            var15.field1613 = this.field1613;
            var15.field1617 = this.field1617;
            var15.field1618 = this.field1618;
            var15.field1610 = new int[var15.field1627];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1627; var16++) {
                int var17 = this.field1584[var16] + arg1;
                int var18 = this.field1583[var16] + arg3;
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
            for (int var26 = 0; var26 < var15.field1627; var26++) {
                int var27 = (-this.field1610[var26] << 16) / this.field1356;
                if (var27 < arg5) {
                    int var28 = this.field1584[var26] + arg1;
                    int var29 = this.field1583[var26] + arg3;
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
        var15.method1897();
        return var15;
    }

    @ObfuscatedName("cy.n()V")
    public void method1900() {
        int var10002;
        if (this.field1585 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1627; var3++) {
                int var4 = this.field1585[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1621 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1621[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1627) {
                int var7 = this.field1585[var6];
                this.field1621[var7][var1[var7]++] = var6++;
            }
            this.field1585 = null;
        }
        if (this.field1611 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1587; var10++) {
            int var11 = this.field1611[var10];
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
        while (var13 < this.field1587) {
            int var14 = this.field1611[var13];
            this.field1613[var14][var8[var14]++] = var13++;
        }
        this.field1611 = null;
    }

    @ObfuscatedName("cy.s()V")
    public void method1887() {
        for (int var1 = 0; var1 < this.field1627; var1++) {
            int var2 = this.field1584[var1];
            this.field1584[var1] = this.field1583[var1];
            this.field1583[var1] = -var2;
        }
        this.method1897();
    }

    @ObfuscatedName("cy.k()V")
    public void method1888() {
        for (int var1 = 0; var1 < this.field1627; var1++) {
            this.field1584[var1] = -this.field1584[var1];
            this.field1583[var1] = -this.field1583[var1];
        }
        this.method1897();
    }

    @ObfuscatedName("cy.f()V")
    public void method1889() {
        for (int var1 = 0; var1 < this.field1627; var1++) {
            int var2 = this.field1583[var1];
            this.field1583[var1] = this.field1584[var1];
            this.field1584[var1] = -var2;
        }
        this.method1897();
    }

    @ObfuscatedName("cy.d(I)V")
    public void method1890(int arg0) {
        int var2 = field1598[arg0];
        int var3 = field1629[arg0];
        for (int var4 = 0; var4 < this.field1627; var4++) {
            int var5 = this.field1584[var4] * var3 + this.field1583[var4] * var2 >> 16;
            this.field1583[var4] = this.field1583[var4] * var3 - this.field1584[var4] * var2 >> 16;
            this.field1584[var4] = var5;
        }
        this.method1897();
    }

    @ObfuscatedName("cy.x(III)V")
    public void method1933(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1627; var4++) {
            this.field1584[var4] += arg0;
            this.field1610[var4] += arg1;
            this.field1583[var4] += arg2;
        }
        this.method1897();
    }

    @ObfuscatedName("cy.o(SS)V")
    public void method1892(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1587; var3++) {
            if (this.field1595[var3] == arg0) {
                this.field1595[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cy.q(SS)V")
    public void method1907(short arg0, short arg1) {
        if (this.field1596 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1587; var3++) {
            if (this.field1596[var3] == arg0) {
                this.field1596[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cy.t()V")
    public void method1894() {
        for (int var1 = 0; var1 < this.field1627; var1++) {
            this.field1583[var1] = -this.field1583[var1];
        }
        for (int var2 = 0; var2 < this.field1587; var2++) {
            int var3 = this.field1626[var2];
            this.field1626[var2] = this.field1628[var2];
            this.field1628[var2] = var3;
        }
        this.method1897();
    }

    @ObfuscatedName("cy.h(III)V")
    public void method1913(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1627; var4++) {
            this.field1584[var4] = this.field1584[var4] * arg0 / 128;
            this.field1610[var4] = this.field1610[var4] * arg1 / 128;
            this.field1583[var4] = this.field1583[var4] * arg2 / 128;
        }
        this.method1897();
    }

    @ObfuscatedName("cy.u()V")
    public void method1896() {
        if (this.field1615 != null) {
            return;
        }
        this.field1615 = new class90[this.field1627];
        for (int var1 = 0; var1 < this.field1627; var1++) {
            this.field1615[var1] = new class90();
        }
        for (int var2 = 0; var2 < this.field1587; var2++) {
            int var3 = this.field1626[var2];
            int var4 = this.field1589[var2];
            int var5 = this.field1628[var2];
            int var6 = this.field1584[var4] - this.field1584[var3];
            int var7 = this.field1610[var4] - this.field1610[var3];
            int var8 = this.field1583[var4] - this.field1583[var3];
            int var9 = this.field1584[var5] - this.field1584[var3];
            int var10 = this.field1610[var5] - this.field1610[var3];
            int var11 = this.field1583[var5] - this.field1583[var3];
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
            if (this.field1591 == null) {
                var19 = 0;
            } else {
                var19 = this.field1591[var2];
            }
            if (var19 == 0) {
                class90 var20 = this.field1615[var3];
                var20.field1527 += var16;
                var20.field1521 += var17;
                var20.field1522 += var18;
                var20.field1520++;
                class90 var21 = this.field1615[var4];
                var21.field1527 += var16;
                var21.field1521 += var17;
                var21.field1522 += var18;
                var21.field1520++;
                class90 var22 = this.field1615[var5];
                var22.field1527 += var16;
                var22.field1521 += var17;
                var22.field1522 += var18;
                var22.field1520++;
            } else if (var19 == 1) {
                if (this.field1614 == null) {
                    this.field1614 = new class78[this.field1587];
                }
                class78 var23 = this.field1614[var2] = new class78();
                var23.field1351 = var16;
                var23.field1350 = var17;
                var23.field1355 = var18;
            }
        }
    }

    @ObfuscatedName("cy.j()V")
    public void method1897() {
        this.field1615 = null;
        this.field1602 = null;
        this.field1614 = null;
        this.field1619 = false;
    }

    @ObfuscatedName("cy.g()V")
    public void method1957() {
        if (this.field1619) {
            return;
        }
        this.field1356 = 0;
        this.field1620 = 0;
        this.field1601 = 999999;
        this.field1622 = -999999;
        this.field1623 = -99999;
        this.field1624 = 99999;
        for (int var1 = 0; var1 < this.field1627; var1++) {
            int var2 = this.field1584[var1];
            int var3 = this.field1610[var1];
            int var4 = this.field1583[var1];
            if (var2 < this.field1601) {
                this.field1601 = var2;
            }
            if (var2 > this.field1622) {
                this.field1622 = var2;
            }
            if (var4 < this.field1624) {
                this.field1624 = var4;
            }
            if (var4 > this.field1623) {
                this.field1623 = var4;
            }
            if (-var3 > this.field1356) {
                this.field1356 = -var3;
            }
            if (var3 > this.field1620) {
                this.field1620 = var3;
            }
        }
        this.field1619 = true;
    }

    @ObfuscatedName("cy.y(Lcy;Lcy;IIIZ)V")
    public static void method1899(class94 arg0, class94 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1957();
        arg0.method1896();
        arg1.method1957();
        arg1.method1896();
        field1612++;
        int var6 = 0;
        int[] var7 = arg1.field1584;
        int var8 = arg1.field1627;
        for (int var9 = 0; var9 < arg0.field1627; var9++) {
            class90 var10 = arg0.field1615[var9];
            if (var10.field1520 != 0) {
                int var11 = arg0.field1610[var9] - arg3;
                if (var11 <= arg1.field1620) {
                    int var12 = arg0.field1584[var9] - arg2;
                    if (var12 >= arg1.field1601 && var12 <= arg1.field1622) {
                        int var13 = arg0.field1583[var9] - arg4;
                        if (var13 >= arg1.field1624 && var13 <= arg1.field1623) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class90 var15 = arg1.field1615[var14];
                                if (var7[var14] == var12 && arg1.field1583[var14] == var13 && arg1.field1610[var14] == var11 && var15.field1520 != 0) {
                                    if (arg0.field1602 == null) {
                                        arg0.field1602 = new class90[arg0.field1627];
                                    }
                                    if (arg1.field1602 == null) {
                                        arg1.field1602 = new class90[var8];
                                    }
                                    class90 var16 = arg0.field1602[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1602[var9] = new class90(var10);
                                    }
                                    class90 var17 = arg1.field1602[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1602[var14] = new class90(var15);
                                    }
                                    var16.field1527 += var15.field1527;
                                    var16.field1521 += var15.field1521;
                                    var16.field1522 += var15.field1522;
                                    var16.field1520 += var15.field1520;
                                    var17.field1527 += var10.field1527;
                                    var17.field1521 += var10.field1521;
                                    var17.field1522 += var10.field1522;
                                    var17.field1520 += var10.field1520;
                                    var6++;
                                    field1625[var9] = field1612;
                                    field1599[var14] = field1612;
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
        for (int var18 = 0; var18 < arg0.field1587; var18++) {
            if (field1625[arg0.field1626[var18]] == field1612 && field1625[arg0.field1589[var18]] == field1612 && field1625[arg0.field1628[var18]] == field1612) {
                if (arg0.field1591 == null) {
                    arg0.field1591 = new byte[arg0.field1587];
                }
                arg0.field1591[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1587; var19++) {
            if (field1599[arg1.field1626[var19]] == field1612 && field1599[arg1.field1589[var19]] == field1612 && field1599[arg1.field1628[var19]] == field1612) {
                if (arg1.field1591 == null) {
                    arg1.field1591 = new byte[arg1.field1587];
                }
                arg1.field1591[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cy.p(IIIII)Lcl;")
    public final class99 method1879(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1896();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class99 var8 = new class99();
        var8.field1740 = new int[this.field1587];
        var8.field1716 = new int[this.field1587];
        var8.field1753 = new int[this.field1587];
        if (this.field1590 > 0 && this.field1594 != null) {
            int[] var9 = new int[this.field1590];
            for (int var10 = 0; var10 < this.field1587; var10++) {
                if (this.field1594[var10] != -1) {
                    var9[this.field1594[var10] & 0xFF]++;
                }
            }
            var8.field1762 = 0;
            for (int var11 = 0; var11 < this.field1590; var11++) {
                if (var9[var11] > 0 && this.field1608[var11] == 0) {
                    var8.field1762++;
                }
            }
            var8.field1717 = new int[var8.field1762];
            var8.field1718 = new int[var8.field1762];
            var8.field1719 = new int[var8.field1762];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1590; var13++) {
                if (var9[var13] > 0 && this.field1608[var13] == 0) {
                    var8.field1717[var12] = this.field1600[var13] & 0xFFFF;
                    var8.field1718[var12] = this.field1604[var13] & 0xFFFF;
                    var8.field1719[var12] = this.field1588[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1746 = new byte[this.field1587];
            for (int var14 = 0; var14 < this.field1587; var14++) {
                if (this.field1594[var14] == -1) {
                    var8.field1746[var14] = -1;
                } else {
                    var8.field1746[var14] = (byte) var9[this.field1594[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1587; var15++) {
            byte var16;
            if (this.field1591 == null) {
                var16 = 0;
            } else {
                var16 = this.field1591[var15];
            }
            byte var17;
            if (this.field1593 == null) {
                var17 = 0;
            } else {
                var17 = this.field1593[var15];
            }
            short var18;
            if (this.field1596 == null) {
                var18 = -1;
            } else {
                var18 = this.field1596[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1595[var15] & 0xFFFF;
                    class90 var20;
                    if (this.field1602 == null || this.field1602[this.field1626[var15]] == null) {
                        var20 = this.field1615[this.field1626[var15]];
                    } else {
                        var20 = this.field1602[this.field1626[var15]];
                    }
                    int var21 = (var20.field1522 * arg4 + var20.field1527 * arg2 + var20.field1521 * arg3) / (var20.field1520 * var7) + arg0;
                    var8.field1740[var15] = method1901(var19, var21);
                    class90 var22;
                    if (this.field1602 == null || this.field1602[this.field1589[var15]] == null) {
                        var22 = this.field1615[this.field1589[var15]];
                    } else {
                        var22 = this.field1602[this.field1589[var15]];
                    }
                    int var23 = (var22.field1522 * arg4 + var22.field1527 * arg2 + var22.field1521 * arg3) / (var22.field1520 * var7) + arg0;
                    var8.field1716[var15] = method1901(var19, var23);
                    class90 var24;
                    if (this.field1602 == null || this.field1602[this.field1628[var15]] == null) {
                        var24 = this.field1615[this.field1628[var15]];
                    } else {
                        var24 = this.field1602[this.field1628[var15]];
                    }
                    int var25 = (var24.field1522 * arg4 + var24.field1527 * arg2 + var24.field1521 * arg3) / (var24.field1520 * var7) + arg0;
                    var8.field1753[var15] = method1901(var19, var25);
                } else if (var16 == 1) {
                    class78 var26 = this.field1614[var15];
                    int var27 = (var26.field1355 * arg4 + var26.field1351 * arg2 + var26.field1350 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1740[var15] = method1901(this.field1595[var15] & 0xFFFF, var27);
                    var8.field1753[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1740[var15] = 128;
                    var8.field1753[var15] = -1;
                } else {
                    var8.field1753[var15] = -2;
                }
            } else if (var16 == 0) {
                class90 var28;
                if (this.field1602 == null || this.field1602[this.field1626[var15]] == null) {
                    var28 = this.field1615[this.field1626[var15]];
                } else {
                    var28 = this.field1602[this.field1626[var15]];
                }
                int var29 = (var28.field1522 * arg4 + var28.field1527 * arg2 + var28.field1521 * arg3) / (var28.field1520 * var7) + arg0;
                var8.field1740[var15] = method1902(var29);
                class90 var30;
                if (this.field1602 == null || this.field1602[this.field1589[var15]] == null) {
                    var30 = this.field1615[this.field1589[var15]];
                } else {
                    var30 = this.field1602[this.field1589[var15]];
                }
                int var31 = (var30.field1522 * arg4 + var30.field1527 * arg2 + var30.field1521 * arg3) / (var30.field1520 * var7) + arg0;
                var8.field1716[var15] = method1902(var31);
                class90 var32;
                if (this.field1602 == null || this.field1602[this.field1628[var15]] == null) {
                    var32 = this.field1615[this.field1628[var15]];
                } else {
                    var32 = this.field1602[this.field1628[var15]];
                }
                int var33 = (var32.field1522 * arg4 + var32.field1527 * arg2 + var32.field1521 * arg3) / (var32.field1520 * var7) + arg0;
                var8.field1753[var15] = method1902(var33);
            } else if (var16 == 1) {
                class78 var34 = this.field1614[var15];
                int var35 = (var34.field1355 * arg4 + var34.field1351 * arg2 + var34.field1350 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1740[var15] = method1902(var35);
                var8.field1753[var15] = -1;
            } else {
                var8.field1753[var15] = -2;
            }
        }
        this.method1900();
        var8.field1700 = this.field1627;
        var8.field1701 = this.field1584;
        var8.field1702 = this.field1610;
        var8.field1703 = this.field1583;
        var8.field1704 = this.field1587;
        var8.field1705 = this.field1626;
        var8.field1706 = this.field1589;
        var8.field1760 = this.field1628;
        var8.field1712 = this.field1592;
        var8.field1761 = this.field1593;
        var8.field1748 = this.field1597;
        var8.field1720 = this.field1621;
        var8.field1758 = this.field1613;
        var8.field1714 = this.field1596;
        return var8;
    }

    @ObfuscatedName("cy.as(II)I")
    public static final int method1901(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cy.ah(I)I")
    public static final int method1902(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
