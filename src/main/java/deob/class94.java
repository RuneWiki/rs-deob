package deob;

@ObfuscatedName("cd")
public class class94 extends class79 {

    @ObfuscatedName("cd.e")
    public int field1612 = 0;

    @ObfuscatedName("cd.v")
    public int[] field1596;

    @ObfuscatedName("cd.k")
    public int[] field1639;

    @ObfuscatedName("cd.g")
    public int[] field1598;

    @ObfuscatedName("cd.q")
    public int field1599 = 0;

    @ObfuscatedName("cd.l")
    public int[] field1597;

    @ObfuscatedName("cd.a")
    public int[] field1601;

    @ObfuscatedName("cd.b")
    public int[] field1602;

    @ObfuscatedName("cd.z")
    public byte[] field1603;

    @ObfuscatedName("cd.w")
    public byte[] field1636;

    @ObfuscatedName("cd.j")
    public byte[] field1605;

    @ObfuscatedName("cd.p")
    public byte[] field1606;

    @ObfuscatedName("cd.n")
    public short[] field1607;

    @ObfuscatedName("cd.r")
    public short[] field1608;

    @ObfuscatedName("cd.s")
    public byte field1609 = 0;

    @ObfuscatedName("cd.f")
    public int field1610;

    @ObfuscatedName("cd.c")
    public byte[] field1611;

    @ObfuscatedName("cd.t")
    public short[] field1614;

    @ObfuscatedName("cd.i")
    public short[] field1604;

    @ObfuscatedName("cd.u")
    public short[] field1595;

    @ObfuscatedName("cd.y")
    public short[] field1615;

    @ObfuscatedName("cd.o")
    public short[] field1637;

    @ObfuscatedName("cd.m")
    public short[] field1617;

    @ObfuscatedName("cd.h")
    public short[] field1618;

    @ObfuscatedName("cd.x")
    public short[] field1619;

    @ObfuscatedName("cd.d")
    public short[] field1620;

    @ObfuscatedName("cd.ac")
    public byte[] field1641;

    @ObfuscatedName("cd.ax")
    public int[] field1622;

    @ObfuscatedName("cd.af")
    public int[] field1623;

    @ObfuscatedName("cd.am")
    public int[][] field1624;

    @ObfuscatedName("cd.ah")
    public int[][] field1625;

    @ObfuscatedName("cd.ar")
    public class78[] field1626;

    @ObfuscatedName("cd.ad")
    public class90[] field1627;

    @ObfuscatedName("cd.ao")
    public class90[] field1628;

    @ObfuscatedName("cd.ae")
    public short field1613;

    @ObfuscatedName("cd.ab")
    public short field1640;

    @ObfuscatedName("cd.ai")
    public boolean field1631 = false;

    @ObfuscatedName("cd.ag")
    public int field1632;

    @ObfuscatedName("cd.ap")
    public int field1633;

    @ObfuscatedName("cd.at")
    public int field1634;

    @ObfuscatedName("cd.az")
    public int field1629;

    @ObfuscatedName("cd.an")
    public int field1616;

    @ObfuscatedName("cd.ay")
    public static int[] field1630 = new int[10000];

    @ObfuscatedName("cd.aw")
    public static int[] field1638 = new int[10000];

    @ObfuscatedName("cd.ak")
    public static int field1600 = 0;

    @ObfuscatedName("cd.aq")
    public static int[] field1621 = class85.field1500;

    @ObfuscatedName("cd.aa")
    public static int[] field1635 = class85.field1501;

    public class94() {
    }

    @ObfuscatedName("cd.e(Lep;II)Lcd;")
    public static class94 method1890(class149 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2721(arg1, arg2);
        return var3 == null ? null : new class94(var3);
    }

    public class94(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1892(arg0);
        } else {
            this.method1893(arg0);
        }
    }

    @ObfuscatedName("cd.k([B)V")
    public void method1892(byte[] arg0) {
        class108 var2 = new class108(arg0);
        class108 var3 = new class108(arg0);
        class108 var4 = new class108(arg0);
        class108 var5 = new class108(arg0);
        class108 var6 = new class108(arg0);
        class108 var7 = new class108(arg0);
        class108 var8 = new class108(arg0);
        var2.field1841 = arg0.length - 23;
        int var9 = var2.method2124();
        int var10 = var2.method2124();
        int var11 = var2.method2122();
        int var12 = var2.method2122();
        int var13 = var2.method2122();
        int var14 = var2.method2122();
        int var15 = var2.method2122();
        int var16 = var2.method2122();
        int var17 = var2.method2122();
        int var18 = var2.method2124();
        int var19 = var2.method2124();
        int var20 = var2.method2124();
        int var21 = var2.method2124();
        int var22 = var2.method2124();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1611 = new byte[var11];
            var2.field1841 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1611[var26] = var2.method2190();
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
        this.field1612 = var9;
        this.field1599 = var10;
        this.field1610 = var11;
        this.field1596 = new int[var9];
        this.field1639 = new int[var9];
        this.field1598 = new int[var9];
        this.field1597 = new int[var10];
        this.field1601 = new int[var10];
        this.field1602 = new int[var10];
        if (var17 == 1) {
            this.field1622 = new int[var9];
        }
        if (var12 == 1) {
            this.field1603 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1636 = new byte[var10];
        } else {
            this.field1609 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1605 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1623 = new int[var10];
        }
        if (var16 == 1) {
            this.field1608 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1606 = new byte[var10];
        }
        this.field1607 = new short[var10];
        if (var11 > 0) {
            this.field1614 = new short[var11];
            this.field1604 = new short[var11];
            this.field1595 = new short[var11];
            if (var24 > 0) {
                this.field1615 = new short[var24];
                this.field1637 = new short[var24];
                this.field1617 = new short[var24];
                this.field1618 = new short[var24];
                this.field1641 = new byte[var24];
                this.field1619 = new short[var24];
            }
            if (var25 > 0) {
                this.field1620 = new short[var25];
            }
        }
        var2.field1841 = var11;
        var3.field1841 = var44;
        var4.field1841 = var46;
        var5.field1841 = var48;
        var6.field1841 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2122();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2210();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2210();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2210();
            }
            this.field1596[var67] = var64 + var69;
            this.field1639[var67] = var65 + var70;
            this.field1598[var67] = var66 + var71;
            var64 = this.field1596[var67];
            var65 = this.field1639[var67];
            var66 = this.field1598[var67];
            if (var17 == 1) {
                this.field1622[var67] = var6.method2122();
            }
        }
        var2.field1841 = var42;
        var3.field1841 = var31;
        var4.field1841 = var34;
        var5.field1841 = var37;
        var6.field1841 = var35;
        var7.field1841 = var40;
        var8.field1841 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1607[var72] = (short) var2.method2124();
            if (var12 == 1) {
                this.field1603[var72] = var3.method2190();
            }
            if (var13 == 255) {
                this.field1636[var72] = var4.method2190();
            }
            if (var14 == 1) {
                this.field1605[var72] = var5.method2190();
            }
            if (var15 == 1) {
                this.field1623[var72] = var6.method2122();
            }
            if (var16 == 1) {
                this.field1608[var72] = (short) (var7.method2124() - 1);
            }
            if (this.field1606 != null && this.field1608[var72] != -1) {
                this.field1606[var72] = (byte) (var8.method2122() - 1);
            }
        }
        var2.field1841 = var33;
        var3.field1841 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2122();
            if (var78 == 1) {
                var73 = var2.method2210() + var76;
                var74 = var2.method2210() + var73;
                var75 = var2.method2210() + var74;
                var76 = var75;
                this.field1597[var77] = var73;
                this.field1601[var77] = var74;
                this.field1602[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2210() + var76;
                var76 = var75;
                this.field1597[var77] = var73;
                this.field1601[var77] = var74;
                this.field1602[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2210() + var76;
                var76 = var75;
                this.field1597[var77] = var73;
                this.field1601[var77] = var74;
                this.field1602[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2210() + var76;
                var76 = var75;
                this.field1597[var77] = var73;
                this.field1601[var77] = var81;
                this.field1602[var77] = var75;
            }
        }
        var2.field1841 = var50;
        var3.field1841 = var52;
        var4.field1841 = var54;
        var5.field1841 = var56;
        var6.field1841 = var58;
        var7.field1841 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1611[var82] & 0xFF;
            if (var83 == 0) {
                this.field1614[var82] = (short) var2.method2124();
                this.field1604[var82] = (short) var2.method2124();
                this.field1595[var82] = (short) var2.method2124();
            }
            if (var83 == 1) {
                this.field1614[var82] = (short) var3.method2124();
                this.field1604[var82] = (short) var3.method2124();
                this.field1595[var82] = (short) var3.method2124();
                this.field1615[var82] = (short) var4.method2124();
                this.field1637[var82] = (short) var4.method2124();
                this.field1617[var82] = (short) var4.method2124();
                this.field1618[var82] = (short) var5.method2124();
                this.field1641[var82] = var6.method2190();
                this.field1619[var82] = (short) var7.method2124();
            }
            if (var83 == 2) {
                this.field1614[var82] = (short) var3.method2124();
                this.field1604[var82] = (short) var3.method2124();
                this.field1595[var82] = (short) var3.method2124();
                this.field1615[var82] = (short) var4.method2124();
                this.field1637[var82] = (short) var4.method2124();
                this.field1617[var82] = (short) var4.method2124();
                this.field1618[var82] = (short) var5.method2124();
                this.field1641[var82] = var6.method2190();
                this.field1619[var82] = (short) var7.method2124();
                this.field1620[var82] = (short) var7.method2124();
            }
            if (var83 == 3) {
                this.field1614[var82] = (short) var3.method2124();
                this.field1604[var82] = (short) var3.method2124();
                this.field1595[var82] = (short) var3.method2124();
                this.field1615[var82] = (short) var4.method2124();
                this.field1637[var82] = (short) var4.method2124();
                this.field1617[var82] = (short) var4.method2124();
                this.field1618[var82] = (short) var5.method2124();
                this.field1641[var82] = var6.method2190();
                this.field1619[var82] = (short) var7.method2124();
            }
        }
        var2.field1841 = var62;
        int var84 = var2.method2122();
        if (var84 == 0) {
            return;
        }
        new class84();
        var2.method2124();
        var2.method2124();
        var2.method2124();
        var2.method2127();
    }

    @ObfuscatedName("cd.g([B)V")
    public void method1893(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class108 var4 = new class108(arg0);
        class108 var5 = new class108(arg0);
        class108 var6 = new class108(arg0);
        class108 var7 = new class108(arg0);
        class108 var8 = new class108(arg0);
        var4.field1841 = arg0.length - 18;
        int var9 = var4.method2124();
        int var10 = var4.method2124();
        int var11 = var4.method2122();
        int var12 = var4.method2122();
        int var13 = var4.method2122();
        int var14 = var4.method2122();
        int var15 = var4.method2122();
        int var16 = var4.method2122();
        int var17 = var4.method2124();
        int var18 = var4.method2124();
        int var19 = var4.method2124();
        int var20 = var4.method2124();
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
        this.field1612 = var9;
        this.field1599 = var10;
        this.field1610 = var11;
        this.field1596 = new int[var9];
        this.field1639 = new int[var9];
        this.field1598 = new int[var9];
        this.field1597 = new int[var10];
        this.field1601 = new int[var10];
        this.field1602 = new int[var10];
        if (var11 > 0) {
            this.field1611 = new byte[var11];
            this.field1614 = new short[var11];
            this.field1604 = new short[var11];
            this.field1595 = new short[var11];
        }
        if (var16 == 1) {
            this.field1622 = new int[var9];
        }
        if (var12 == 1) {
            this.field1603 = new byte[var10];
            this.field1606 = new byte[var10];
            this.field1608 = new short[var10];
        }
        if (var13 == 255) {
            this.field1636 = new byte[var10];
        } else {
            this.field1609 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1605 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1623 = new int[var10];
        }
        this.field1607 = new short[var10];
        var4.field1841 = var21;
        var5.field1841 = var36;
        var6.field1841 = var38;
        var7.field1841 = var40;
        var8.field1841 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2122();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2210();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2210();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2210();
            }
            this.field1596[var46] = var43 + var48;
            this.field1639[var46] = var44 + var49;
            this.field1598[var46] = var45 + var50;
            var43 = this.field1596[var46];
            var44 = this.field1639[var46];
            var45 = this.field1598[var46];
            if (var16 == 1) {
                this.field1622[var46] = var8.method2122();
            }
        }
        var4.field1841 = var32;
        var5.field1841 = var28;
        var6.field1841 = var26;
        var7.field1841 = var30;
        var8.field1841 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1607[var51] = (short) var4.method2124();
            if (var12 == 1) {
                int var52 = var5.method2122();
                if ((var52 & 0x1) == 1) {
                    this.field1603[var51] = 1;
                    var2 = true;
                } else {
                    this.field1603[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1606[var51] = (byte) (var52 >> 2);
                    this.field1608[var51] = this.field1607[var51];
                    this.field1607[var51] = 127;
                    if (this.field1608[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1606[var51] = -1;
                    this.field1608[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1636[var51] = var6.method2190();
            }
            if (var14 == 1) {
                this.field1605[var51] = var7.method2190();
            }
            if (var15 == 1) {
                this.field1623[var51] = var8.method2122();
            }
        }
        var4.field1841 = var25;
        var5.field1841 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2122();
            if (var58 == 1) {
                var53 = var4.method2210() + var56;
                var54 = var4.method2210() + var53;
                var55 = var4.method2210() + var54;
                var56 = var55;
                this.field1597[var57] = var53;
                this.field1601[var57] = var54;
                this.field1602[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2210() + var56;
                var56 = var55;
                this.field1597[var57] = var53;
                this.field1601[var57] = var54;
                this.field1602[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2210() + var56;
                var56 = var55;
                this.field1597[var57] = var53;
                this.field1601[var57] = var54;
                this.field1602[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2210() + var56;
                var56 = var55;
                this.field1597[var57] = var53;
                this.field1601[var57] = var61;
                this.field1602[var57] = var55;
            }
        }
        var4.field1841 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1611[var62] = 0;
            this.field1614[var62] = (short) var4.method2124();
            this.field1604[var62] = (short) var4.method2124();
            this.field1595[var62] = (short) var4.method2124();
        }
        if (this.field1606 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1606[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1614[var65] & 0xFFFF) == this.field1597[var64] && (this.field1604[var65] & 0xFFFF) == this.field1601[var64] && (this.field1595[var65] & 0xFFFF) == this.field1602[var64]) {
                        this.field1606[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1606 = null;
            }
        }
        if (!var3) {
            this.field1608 = null;
        }
        if (!var2) {
            this.field1603 = null;
        }
    }

    public class94(class94[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1612 = 0;
        this.field1599 = 0;
        this.field1610 = 0;
        this.field1609 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class94 var10 = arg0[var9];
            if (var10 != null) {
                this.field1612 += var10.field1612;
                this.field1599 += var10.field1599;
                this.field1610 += var10.field1610;
                if (var10.field1636 == null) {
                    if (this.field1609 == -1) {
                        this.field1609 = var10.field1609;
                    }
                    if (this.field1609 != var10.field1609) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1603 != null;
                var5 |= var10.field1605 != null;
                var6 |= var10.field1623 != null;
                var7 |= var10.field1608 != null;
                var8 |= var10.field1606 != null;
            }
        }
        this.field1596 = new int[this.field1612];
        this.field1639 = new int[this.field1612];
        this.field1598 = new int[this.field1612];
        this.field1622 = new int[this.field1612];
        this.field1597 = new int[this.field1599];
        this.field1601 = new int[this.field1599];
        this.field1602 = new int[this.field1599];
        if (var3) {
            this.field1603 = new byte[this.field1599];
        }
        if (var4) {
            this.field1636 = new byte[this.field1599];
        }
        if (var5) {
            this.field1605 = new byte[this.field1599];
        }
        if (var6) {
            this.field1623 = new int[this.field1599];
        }
        if (var7) {
            this.field1608 = new short[this.field1599];
        }
        if (var8) {
            this.field1606 = new byte[this.field1599];
        }
        this.field1607 = new short[this.field1599];
        if (this.field1610 > 0) {
            this.field1611 = new byte[this.field1610];
            this.field1614 = new short[this.field1610];
            this.field1604 = new short[this.field1610];
            this.field1595 = new short[this.field1610];
            this.field1615 = new short[this.field1610];
            this.field1637 = new short[this.field1610];
            this.field1617 = new short[this.field1610];
            this.field1618 = new short[this.field1610];
            this.field1641 = new byte[this.field1610];
            this.field1619 = new short[this.field1610];
            this.field1620 = new short[this.field1610];
        }
        this.field1612 = 0;
        this.field1599 = 0;
        this.field1610 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class94 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1599; var13++) {
                    if (var3 && var12.field1603 != null) {
                        this.field1603[this.field1599] = var12.field1603[var13];
                    }
                    if (var4) {
                        if (var12.field1636 == null) {
                            this.field1636[this.field1599] = var12.field1609;
                        } else {
                            this.field1636[this.field1599] = var12.field1636[var13];
                        }
                    }
                    if (var5 && var12.field1605 != null) {
                        this.field1605[this.field1599] = var12.field1605[var13];
                    }
                    if (var6 && var12.field1623 != null) {
                        this.field1623[this.field1599] = var12.field1623[var13];
                    }
                    if (var7) {
                        if (var12.field1608 == null) {
                            this.field1608[this.field1599] = -1;
                        } else {
                            this.field1608[this.field1599] = var12.field1608[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1606 == null || var12.field1606[var13] == -1) {
                            this.field1606[this.field1599] = -1;
                        } else {
                            this.field1606[this.field1599] = (byte) (var12.field1606[var13] + this.field1610);
                        }
                    }
                    this.field1607[this.field1599] = var12.field1607[var13];
                    this.field1597[this.field1599] = this.method1894(var12, var12.field1597[var13]);
                    this.field1601[this.field1599] = this.method1894(var12, var12.field1601[var13]);
                    this.field1602[this.field1599] = this.method1894(var12, var12.field1602[var13]);
                    this.field1599++;
                }
                for (int var14 = 0; var14 < var12.field1610; var14++) {
                    byte var15 = this.field1611[this.field1610] = var12.field1611[var14];
                    if (var15 == 0) {
                        this.field1614[this.field1610] = (short) this.method1894(var12, var12.field1614[var14]);
                        this.field1604[this.field1610] = (short) this.method1894(var12, var12.field1604[var14]);
                        this.field1595[this.field1610] = (short) this.method1894(var12, var12.field1595[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1614[this.field1610] = var12.field1614[var14];
                        this.field1604[this.field1610] = var12.field1604[var14];
                        this.field1595[this.field1610] = var12.field1595[var14];
                        this.field1615[this.field1610] = var12.field1615[var14];
                        this.field1637[this.field1610] = var12.field1637[var14];
                        this.field1617[this.field1610] = var12.field1617[var14];
                        this.field1618[this.field1610] = var12.field1618[var14];
                        this.field1641[this.field1610] = var12.field1641[var14];
                        this.field1619[this.field1610] = var12.field1619[var14];
                    }
                    if (var15 == 2) {
                        this.field1620[this.field1610] = var12.field1620[var14];
                    }
                    this.field1610++;
                }
            }
        }
    }

    @ObfuscatedName("cd.q(Lcd;I)I")
    public final int method1894(class94 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1596[arg1];
        int var5 = arg0.field1639[arg1];
        int var6 = arg0.field1598[arg1];
        for (int var7 = 0; var7 < this.field1612; var7++) {
            if (this.field1596[var7] == var4 && this.field1639[var7] == var5 && this.field1598[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1596[this.field1612] = var4;
            this.field1639[this.field1612] = var5;
            this.field1598[this.field1612] = var6;
            if (arg0.field1622 != null) {
                this.field1622[this.field1612] = arg0.field1622[arg1];
            }
            var3 = this.field1612++;
        }
        return var3;
    }

    public class94(class94 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1612 = arg0.field1612;
        this.field1599 = arg0.field1599;
        this.field1610 = arg0.field1610;
        if (arg1) {
            this.field1596 = arg0.field1596;
            this.field1639 = arg0.field1639;
            this.field1598 = arg0.field1598;
        } else {
            this.field1596 = new int[this.field1612];
            this.field1639 = new int[this.field1612];
            this.field1598 = new int[this.field1612];
            for (int var6 = 0; var6 < this.field1612; var6++) {
                this.field1596[var6] = arg0.field1596[var6];
                this.field1639[var6] = arg0.field1639[var6];
                this.field1598[var6] = arg0.field1598[var6];
            }
        }
        if (arg2) {
            this.field1607 = arg0.field1607;
        } else {
            this.field1607 = new short[this.field1599];
            for (int var7 = 0; var7 < this.field1599; var7++) {
                this.field1607[var7] = arg0.field1607[var7];
            }
        }
        if (arg3 || arg0.field1608 == null) {
            this.field1608 = arg0.field1608;
        } else {
            this.field1608 = new short[this.field1599];
            for (int var8 = 0; var8 < this.field1599; var8++) {
                this.field1608[var8] = arg0.field1608[var8];
            }
        }
        if (arg4) {
            this.field1605 = arg0.field1605;
        } else {
            this.field1605 = new byte[this.field1599];
            if (arg0.field1605 == null) {
                for (int var9 = 0; var9 < this.field1599; var9++) {
                    this.field1605[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1599; var10++) {
                    this.field1605[var10] = arg0.field1605[var10];
                }
            }
        }
        this.field1597 = arg0.field1597;
        this.field1601 = arg0.field1601;
        this.field1602 = arg0.field1602;
        this.field1603 = arg0.field1603;
        this.field1636 = arg0.field1636;
        this.field1606 = arg0.field1606;
        this.field1609 = arg0.field1609;
        this.field1611 = arg0.field1611;
        this.field1614 = arg0.field1614;
        this.field1604 = arg0.field1604;
        this.field1595 = arg0.field1595;
        this.field1615 = arg0.field1615;
        this.field1637 = arg0.field1637;
        this.field1617 = arg0.field1617;
        this.field1618 = arg0.field1618;
        this.field1641 = arg0.field1641;
        this.field1619 = arg0.field1619;
        this.field1620 = arg0.field1620;
        this.field1622 = arg0.field1622;
        this.field1623 = arg0.field1623;
        this.field1624 = arg0.field1624;
        this.field1625 = arg0.field1625;
        this.field1627 = arg0.field1627;
        this.field1626 = arg0.field1626;
        this.field1628 = arg0.field1628;
        this.field1613 = arg0.field1613;
        this.field1640 = arg0.field1640;
    }

    @ObfuscatedName("cd.l()Lcd;")
    public class94 method1897() {
        class94 var1 = new class94();
        if (this.field1603 != null) {
            var1.field1603 = new byte[this.field1599];
            for (int var2 = 0; var2 < this.field1599; var2++) {
                var1.field1603[var2] = this.field1603[var2];
            }
        }
        var1.field1612 = this.field1612;
        var1.field1599 = this.field1599;
        var1.field1610 = this.field1610;
        var1.field1596 = this.field1596;
        var1.field1639 = this.field1639;
        var1.field1598 = this.field1598;
        var1.field1597 = this.field1597;
        var1.field1601 = this.field1601;
        var1.field1602 = this.field1602;
        var1.field1636 = this.field1636;
        var1.field1605 = this.field1605;
        var1.field1606 = this.field1606;
        var1.field1607 = this.field1607;
        var1.field1608 = this.field1608;
        var1.field1609 = this.field1609;
        var1.field1611 = this.field1611;
        var1.field1614 = this.field1614;
        var1.field1604 = this.field1604;
        var1.field1595 = this.field1595;
        var1.field1615 = this.field1615;
        var1.field1637 = this.field1637;
        var1.field1617 = this.field1617;
        var1.field1618 = this.field1618;
        var1.field1641 = this.field1641;
        var1.field1619 = this.field1619;
        var1.field1620 = this.field1620;
        var1.field1622 = this.field1622;
        var1.field1623 = this.field1623;
        var1.field1624 = this.field1624;
        var1.field1625 = this.field1625;
        var1.field1627 = this.field1627;
        var1.field1626 = this.field1626;
        var1.field1613 = this.field1613;
        var1.field1640 = this.field1640;
        return var1;
    }

    @ObfuscatedName("cd.a([[IIIIZI)Lcd;")
    public class94 method1935(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1907();
        int var7 = this.field1633 + arg1;
        int var8 = this.field1634 + arg1;
        int var9 = this.field1616 + arg3;
        int var10 = this.field1629 + arg3;
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
            var15.field1612 = this.field1612;
            var15.field1599 = this.field1599;
            var15.field1610 = this.field1610;
            var15.field1596 = this.field1596;
            var15.field1598 = this.field1598;
            var15.field1597 = this.field1597;
            var15.field1601 = this.field1601;
            var15.field1602 = this.field1602;
            var15.field1603 = this.field1603;
            var15.field1636 = this.field1636;
            var15.field1605 = this.field1605;
            var15.field1606 = this.field1606;
            var15.field1607 = this.field1607;
            var15.field1608 = this.field1608;
            var15.field1609 = this.field1609;
            var15.field1611 = this.field1611;
            var15.field1614 = this.field1614;
            var15.field1604 = this.field1604;
            var15.field1595 = this.field1595;
            var15.field1615 = this.field1615;
            var15.field1637 = this.field1637;
            var15.field1617 = this.field1617;
            var15.field1618 = this.field1618;
            var15.field1641 = this.field1641;
            var15.field1619 = this.field1619;
            var15.field1620 = this.field1620;
            var15.field1622 = this.field1622;
            var15.field1623 = this.field1623;
            var15.field1624 = this.field1624;
            var15.field1625 = this.field1625;
            var15.field1613 = this.field1613;
            var15.field1640 = this.field1640;
            var15.field1639 = new int[var15.field1612];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1612; var16++) {
                int var17 = this.field1596[var16] + arg1;
                int var18 = this.field1598[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1639[var16] = this.field1639[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1612; var26++) {
                int var27 = (-this.field1639[var26] << 16) / this.field1369;
                if (var27 < arg5) {
                    int var28 = this.field1596[var26] + arg1;
                    int var29 = this.field1598[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1639[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1639[var26];
                }
            }
        }
        var15.method1906();
        return var15;
    }

    @ObfuscatedName("cd.j()V")
    public void method1896() {
        int var10002;
        if (this.field1622 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1612; var3++) {
                int var4 = this.field1622[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1624 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1624[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1612) {
                int var7 = this.field1622[var6];
                this.field1624[var7][var1[var7]++] = var6++;
            }
            this.field1622 = null;
        }
        if (this.field1623 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1599; var10++) {
            int var11 = this.field1623[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1625 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1625[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1599) {
            int var14 = this.field1623[var13];
            this.field1625[var14][var8[var14]++] = var13++;
        }
        this.field1623 = null;
    }

    @ObfuscatedName("cd.p()V")
    public void method1911() {
        for (int var1 = 0; var1 < this.field1612; var1++) {
            int var2 = this.field1596[var1];
            this.field1596[var1] = this.field1598[var1];
            this.field1598[var1] = -var2;
        }
        this.method1906();
    }

    @ObfuscatedName("cd.n()V")
    public void method1916() {
        for (int var1 = 0; var1 < this.field1612; var1++) {
            this.field1596[var1] = -this.field1596[var1];
            this.field1598[var1] = -this.field1598[var1];
        }
        this.method1906();
    }

    @ObfuscatedName("cd.r()V")
    public void method1898() {
        for (int var1 = 0; var1 < this.field1612; var1++) {
            int var2 = this.field1598[var1];
            this.field1598[var1] = this.field1596[var1];
            this.field1596[var1] = -var2;
        }
        this.method1906();
    }

    @ObfuscatedName("cd.s(I)V")
    public void method1899(int arg0) {
        int var2 = field1621[arg0];
        int var3 = field1635[arg0];
        for (int var4 = 0; var4 < this.field1612; var4++) {
            int var5 = this.field1598[var4] * var2 + this.field1596[var4] * var3 >> 16;
            this.field1598[var4] = this.field1598[var4] * var3 - this.field1596[var4] * var2 >> 16;
            this.field1596[var4] = var5;
        }
        this.method1906();
    }

    @ObfuscatedName("cd.f(III)V")
    public void method1900(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1612; var4++) {
            this.field1596[var4] += arg0;
            this.field1639[var4] += arg1;
            this.field1598[var4] += arg2;
        }
        this.method1906();
    }

    @ObfuscatedName("cd.c(SS)V")
    public void method1901(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1599; var3++) {
            if (this.field1607[var3] == arg0) {
                this.field1607[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cd.t(SS)V")
    public void method1902(short arg0, short arg1) {
        if (this.field1608 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1599; var3++) {
            if (this.field1608[var3] == arg0) {
                this.field1608[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cd.i()V")
    public void method1903() {
        for (int var1 = 0; var1 < this.field1612; var1++) {
            this.field1598[var1] = -this.field1598[var1];
        }
        for (int var2 = 0; var2 < this.field1599; var2++) {
            int var3 = this.field1597[var2];
            this.field1597[var2] = this.field1602[var2];
            this.field1602[var2] = var3;
        }
        this.method1906();
    }

    @ObfuscatedName("cd.u(III)V")
    public void method1904(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1612; var4++) {
            this.field1596[var4] = this.field1596[var4] * arg0 / 128;
            this.field1639[var4] = this.field1639[var4] * arg1 / 128;
            this.field1598[var4] = this.field1598[var4] * arg2 / 128;
        }
        this.method1906();
    }

    @ObfuscatedName("cd.y()V")
    public void method1905() {
        if (this.field1627 != null) {
            return;
        }
        this.field1627 = new class90[this.field1612];
        for (int var1 = 0; var1 < this.field1612; var1++) {
            this.field1627[var1] = new class90();
        }
        for (int var2 = 0; var2 < this.field1599; var2++) {
            int var3 = this.field1597[var2];
            int var4 = this.field1601[var2];
            int var5 = this.field1602[var2];
            int var6 = this.field1596[var4] - this.field1596[var3];
            int var7 = this.field1639[var4] - this.field1639[var3];
            int var8 = this.field1598[var4] - this.field1598[var3];
            int var9 = this.field1596[var5] - this.field1596[var3];
            int var10 = this.field1639[var5] - this.field1639[var3];
            int var11 = this.field1598[var5] - this.field1598[var3];
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
            if (this.field1603 == null) {
                var19 = 0;
            } else {
                var19 = this.field1603[var2];
            }
            if (var19 == 0) {
                class90 var20 = this.field1627[var3];
                var20.field1538 += var16;
                var20.field1543 += var17;
                var20.field1544 += var18;
                var20.field1539++;
                class90 var21 = this.field1627[var4];
                var21.field1538 += var16;
                var21.field1543 += var17;
                var21.field1544 += var18;
                var21.field1539++;
                class90 var22 = this.field1627[var5];
                var22.field1538 += var16;
                var22.field1543 += var17;
                var22.field1544 += var18;
                var22.field1539++;
            } else if (var19 == 1) {
                if (this.field1626 == null) {
                    this.field1626 = new class78[this.field1599];
                }
                class78 var23 = this.field1626[var2] = new class78();
                var23.field1362 = var16;
                var23.field1367 = var17;
                var23.field1363 = var18;
            }
        }
    }

    @ObfuscatedName("cd.o()V")
    public void method1906() {
        this.field1627 = null;
        this.field1628 = null;
        this.field1626 = null;
        this.field1631 = false;
    }

    @ObfuscatedName("cd.m()V")
    public void method1907() {
        if (this.field1631) {
            return;
        }
        this.field1369 = 0;
        this.field1632 = 0;
        this.field1633 = 999999;
        this.field1634 = -999999;
        this.field1629 = -99999;
        this.field1616 = 99999;
        for (int var1 = 0; var1 < this.field1612; var1++) {
            int var2 = this.field1596[var1];
            int var3 = this.field1639[var1];
            int var4 = this.field1598[var1];
            if (var2 < this.field1633) {
                this.field1633 = var2;
            }
            if (var2 > this.field1634) {
                this.field1634 = var2;
            }
            if (var4 < this.field1616) {
                this.field1616 = var4;
            }
            if (var4 > this.field1629) {
                this.field1629 = var4;
            }
            if (-var3 > this.field1369) {
                this.field1369 = -var3;
            }
            if (var3 > this.field1632) {
                this.field1632 = var3;
            }
        }
        this.field1631 = true;
    }

    @ObfuscatedName("cd.h(Lcd;Lcd;IIIZ)V")
    public static void method1908(class94 arg0, class94 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1907();
        arg0.method1905();
        arg1.method1907();
        arg1.method1905();
        field1600++;
        int var6 = 0;
        int[] var7 = arg1.field1596;
        int var8 = arg1.field1612;
        for (int var9 = 0; var9 < arg0.field1612; var9++) {
            class90 var10 = arg0.field1627[var9];
            if (var10.field1539 != 0) {
                int var11 = arg0.field1639[var9] - arg3;
                if (var11 <= arg1.field1632) {
                    int var12 = arg0.field1596[var9] - arg2;
                    if (var12 >= arg1.field1633 && var12 <= arg1.field1634) {
                        int var13 = arg0.field1598[var9] - arg4;
                        if (var13 >= arg1.field1616 && var13 <= arg1.field1629) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class90 var15 = arg1.field1627[var14];
                                if (var7[var14] == var12 && arg1.field1598[var14] == var13 && arg1.field1639[var14] == var11 && var15.field1539 != 0) {
                                    if (arg0.field1628 == null) {
                                        arg0.field1628 = new class90[arg0.field1612];
                                    }
                                    if (arg1.field1628 == null) {
                                        arg1.field1628 = new class90[var8];
                                    }
                                    class90 var16 = arg0.field1628[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1628[var9] = new class90(var10);
                                    }
                                    class90 var17 = arg1.field1628[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1628[var14] = new class90(var15);
                                    }
                                    var16.field1538 += var15.field1538;
                                    var16.field1543 += var15.field1543;
                                    var16.field1544 += var15.field1544;
                                    var16.field1539 += var15.field1539;
                                    var17.field1538 += var10.field1538;
                                    var17.field1543 += var10.field1543;
                                    var17.field1544 += var10.field1544;
                                    var17.field1539 += var10.field1539;
                                    var6++;
                                    field1630[var9] = field1600;
                                    field1638[var14] = field1600;
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
        for (int var18 = 0; var18 < arg0.field1599; var18++) {
            if (field1630[arg0.field1597[var18]] == field1600 && field1630[arg0.field1601[var18]] == field1600 && field1630[arg0.field1602[var18]] == field1600) {
                if (arg0.field1603 == null) {
                    arg0.field1603 = new byte[arg0.field1599];
                }
                arg0.field1603[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1599; var19++) {
            if (field1638[arg1.field1597[var19]] == field1600 && field1638[arg1.field1601[var19]] == field1600 && field1638[arg1.field1602[var19]] == field1600) {
                if (arg1.field1603 == null) {
                    arg1.field1603 = new byte[arg1.field1599];
                }
                arg1.field1603[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cd.x(IIIII)Lcu;")
    public final class99 method1909(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1905();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class99 var8 = new class99();
        var8.field1721 = new int[this.field1599];
        var8.field1718 = new int[this.field1599];
        var8.field1719 = new int[this.field1599];
        if (this.field1610 > 0 && this.field1606 != null) {
            int[] var9 = new int[this.field1610];
            for (int var10 = 0; var10 < this.field1599; var10++) {
                if (this.field1606[var10] != -1) {
                    var9[this.field1606[var10] & 0xFF]++;
                }
            }
            var8.field1765 = 0;
            for (int var11 = 0; var11 < this.field1610; var11++) {
                if (var9[var11] > 0 && this.field1611[var11] == 0) {
                    var8.field1765++;
                }
            }
            var8.field1726 = new int[var8.field1765];
            var8.field1727 = new int[var8.field1765];
            var8.field1728 = new int[var8.field1765];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1610; var13++) {
                if (var9[var13] > 0 && this.field1611[var13] == 0) {
                    var8.field1726[var12] = this.field1614[var13] & 0xFFFF;
                    var8.field1727[var12] = this.field1604[var13] & 0xFFFF;
                    var8.field1728[var12] = this.field1595[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1705 = new byte[this.field1599];
            for (int var14 = 0; var14 < this.field1599; var14++) {
                if (this.field1606[var14] == -1) {
                    var8.field1705[var14] = -1;
                } else {
                    var8.field1705[var14] = (byte) var9[this.field1606[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1599; var15++) {
            byte var16;
            if (this.field1603 == null) {
                var16 = 0;
            } else {
                var16 = this.field1603[var15];
            }
            byte var17;
            if (this.field1605 == null) {
                var17 = 0;
            } else {
                var17 = this.field1605[var15];
            }
            short var18;
            if (this.field1608 == null) {
                var18 = -1;
            } else {
                var18 = this.field1608[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1607[var15] & 0xFFFF;
                    class90 var20;
                    if (this.field1628 == null || this.field1628[this.field1597[var15]] == null) {
                        var20 = this.field1627[this.field1597[var15]];
                    } else {
                        var20 = this.field1628[this.field1597[var15]];
                    }
                    int var21 = (var20.field1544 * arg4 + var20.field1543 * arg3 + var20.field1538 * arg2) / (var20.field1539 * var7) + arg0;
                    var8.field1721[var15] = method1910(var19, var21);
                    class90 var22;
                    if (this.field1628 == null || this.field1628[this.field1601[var15]] == null) {
                        var22 = this.field1627[this.field1601[var15]];
                    } else {
                        var22 = this.field1628[this.field1601[var15]];
                    }
                    int var23 = (var22.field1544 * arg4 + var22.field1543 * arg3 + var22.field1538 * arg2) / (var22.field1539 * var7) + arg0;
                    var8.field1718[var15] = method1910(var19, var23);
                    class90 var24;
                    if (this.field1628 == null || this.field1628[this.field1602[var15]] == null) {
                        var24 = this.field1627[this.field1602[var15]];
                    } else {
                        var24 = this.field1628[this.field1602[var15]];
                    }
                    int var25 = (var24.field1544 * arg4 + var24.field1543 * arg3 + var24.field1538 * arg2) / (var24.field1539 * var7) + arg0;
                    var8.field1719[var15] = method1910(var19, var25);
                } else if (var16 == 1) {
                    class78 var26 = this.field1626[var15];
                    int var27 = (var26.field1363 * arg4 + var26.field1367 * arg3 + var26.field1362 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1721[var15] = method1910(this.field1607[var15] & 0xFFFF, var27);
                    var8.field1719[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1721[var15] = 128;
                    var8.field1719[var15] = -1;
                } else {
                    var8.field1719[var15] = -2;
                }
            } else if (var16 == 0) {
                class90 var28;
                if (this.field1628 == null || this.field1628[this.field1597[var15]] == null) {
                    var28 = this.field1627[this.field1597[var15]];
                } else {
                    var28 = this.field1628[this.field1597[var15]];
                }
                int var29 = (var28.field1544 * arg4 + var28.field1543 * arg3 + var28.field1538 * arg2) / (var28.field1539 * var7) + arg0;
                var8.field1721[var15] = method1946(var29);
                class90 var30;
                if (this.field1628 == null || this.field1628[this.field1601[var15]] == null) {
                    var30 = this.field1627[this.field1601[var15]];
                } else {
                    var30 = this.field1628[this.field1601[var15]];
                }
                int var31 = (var30.field1544 * arg4 + var30.field1543 * arg3 + var30.field1538 * arg2) / (var30.field1539 * var7) + arg0;
                var8.field1718[var15] = method1946(var31);
                class90 var32;
                if (this.field1628 == null || this.field1628[this.field1602[var15]] == null) {
                    var32 = this.field1627[this.field1602[var15]];
                } else {
                    var32 = this.field1628[this.field1602[var15]];
                }
                int var33 = (var32.field1544 * arg4 + var32.field1543 * arg3 + var32.field1538 * arg2) / (var32.field1539 * var7) + arg0;
                var8.field1719[var15] = method1946(var33);
            } else if (var16 == 1) {
                class78 var34 = this.field1626[var15];
                int var35 = (var34.field1363 * arg4 + var34.field1367 * arg3 + var34.field1362 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1721[var15] = method1946(var35);
                var8.field1719[var15] = -1;
            } else {
                var8.field1719[var15] = -2;
            }
        }
        this.method1896();
        var8.field1729 = this.field1612;
        var8.field1725 = this.field1596;
        var8.field1763 = this.field1639;
        var8.field1712 = this.field1598;
        var8.field1713 = this.field1599;
        var8.field1714 = this.field1597;
        var8.field1744 = this.field1601;
        var8.field1716 = this.field1602;
        var8.field1720 = this.field1636;
        var8.field1711 = this.field1605;
        var8.field1724 = this.field1609;
        var8.field1762 = this.field1624;
        var8.field1730 = this.field1625;
        var8.field1764 = this.field1608;
        return var8;
    }

    @ObfuscatedName("cd.d(II)I")
    public static final int method1910(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cd.ah(I)I")
    public static final int method1946(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
