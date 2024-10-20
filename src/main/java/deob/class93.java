package deob;

@ObfuscatedName("cf")
public class class93 extends class78 {

    @ObfuscatedName("cf.k")
    public int field1605 = 0;

    @ObfuscatedName("cf.y")
    public int[] field1567;

    @ObfuscatedName("cf.s")
    public int[] field1568;

    @ObfuscatedName("cf.g")
    public int[] field1569;

    @ObfuscatedName("cf.h")
    public int field1570 = 0;

    @ObfuscatedName("cf.l")
    public int[] field1611;

    @ObfuscatedName("cf.e")
    public int[] field1577;

    @ObfuscatedName("cf.u")
    public int[] field1601;

    @ObfuscatedName("cf.j")
    public byte[] field1574;

    @ObfuscatedName("cf.c")
    public byte[] field1575;

    @ObfuscatedName("cf.d")
    public byte[] field1598;

    @ObfuscatedName("cf.v")
    public byte[] field1580;

    @ObfuscatedName("cf.n")
    public short[] field1578;

    @ObfuscatedName("cf.z")
    public short[] field1571;

    @ObfuscatedName("cf.a")
    public byte field1573 = 0;

    @ObfuscatedName("cf.t")
    public int field1581;

    @ObfuscatedName("cf.p")
    public byte[] field1582;

    @ObfuscatedName("cf.i")
    public short[] field1583;

    @ObfuscatedName("cf.r")
    public short[] field1584;

    @ObfuscatedName("cf.w")
    public short[] field1585;

    @ObfuscatedName("cf.b")
    public short[] field1586;

    @ObfuscatedName("cf.x")
    public short[] field1587;

    @ObfuscatedName("cf.q")
    public short[] field1592;

    @ObfuscatedName("cf.o")
    public short[] field1589;

    @ObfuscatedName("cf.m")
    public short[] field1590;

    @ObfuscatedName("cf.f")
    public short[] field1591;

    @ObfuscatedName("cf.ab")
    public byte[] field1579;

    @ObfuscatedName("cf.al")
    public int[] field1593;

    @ObfuscatedName("cf.an")
    public int[] field1576;

    @ObfuscatedName("cf.aw")
    public int[][] field1595;

    @ObfuscatedName("cf.ar")
    public int[][] field1596;

    @ObfuscatedName("cf.ai")
    public class77[] field1588;

    @ObfuscatedName("cf.aj")
    public class89[] field1603;

    @ObfuscatedName("cf.ao")
    public class89[] field1566;

    @ObfuscatedName("cf.ap")
    public short field1600;

    @ObfuscatedName("cf.as")
    public short field1572;

    @ObfuscatedName("cf.au")
    public boolean field1597 = false;

    @ObfuscatedName("cf.ac")
    public int field1599;

    @ObfuscatedName("cf.ay")
    public int field1594;

    @ObfuscatedName("cf.av")
    public int field1604;

    @ObfuscatedName("cf.ak")
    public int field1606;

    @ObfuscatedName("cf.ae")
    public int field1607;

    @ObfuscatedName("cf.at")
    public static int[] field1608 = new int[10000];

    @ObfuscatedName("cf.az")
    public static int[] field1609 = new int[10000];

    @ObfuscatedName("cf.ag")
    public static int field1610 = 0;

    @ObfuscatedName("cf.af")
    public static int[] field1602 = class84.field1435;

    @ObfuscatedName("cf.am")
    public static int[] field1612 = class84.field1457;

    public class93() {
    }

    @ObfuscatedName("cf.k(Lei;II)Lcf;")
    public static class93 method1891(class147 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2729(arg1, arg2);
        return var3 == null ? null : new class93(var3);
    }

    public class93(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1916(arg0);
        } else {
            this.method1894(arg0);
        }
    }

    @ObfuscatedName("cf.s([B)V")
    public void method1916(byte[] arg0) {
        class107 var2 = new class107(arg0);
        class107 var3 = new class107(arg0);
        class107 var4 = new class107(arg0);
        class107 var5 = new class107(arg0);
        class107 var6 = new class107(arg0);
        class107 var7 = new class107(arg0);
        class107 var8 = new class107(arg0);
        var2.field1838 = arg0.length - 23;
        int var9 = var2.method2239();
        int var10 = var2.method2239();
        int var11 = var2.method2138();
        int var12 = var2.method2138();
        int var13 = var2.method2138();
        int var14 = var2.method2138();
        int var15 = var2.method2138();
        int var16 = var2.method2138();
        int var17 = var2.method2138();
        int var18 = var2.method2239();
        int var19 = var2.method2239();
        int var20 = var2.method2239();
        int var21 = var2.method2239();
        int var22 = var2.method2239();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1582 = new byte[var11];
            var2.field1838 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1582[var26] = var2.method2139();
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
        this.field1570 = var10;
        this.field1581 = var11;
        this.field1567 = new int[var9];
        this.field1568 = new int[var9];
        this.field1569 = new int[var9];
        this.field1611 = new int[var10];
        this.field1577 = new int[var10];
        this.field1601 = new int[var10];
        if (var17 == 1) {
            this.field1593 = new int[var9];
        }
        if (var12 == 1) {
            this.field1574 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1575 = new byte[var10];
        } else {
            this.field1573 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1598 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1576 = new int[var10];
        }
        if (var16 == 1) {
            this.field1571 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1580 = new byte[var10];
        }
        this.field1578 = new short[var10];
        if (var11 > 0) {
            this.field1583 = new short[var11];
            this.field1584 = new short[var11];
            this.field1585 = new short[var11];
            if (var24 > 0) {
                this.field1586 = new short[var24];
                this.field1587 = new short[var24];
                this.field1592 = new short[var24];
                this.field1589 = new short[var24];
                this.field1579 = new byte[var24];
                this.field1590 = new short[var24];
            }
            if (var25 > 0) {
                this.field1591 = new short[var25];
            }
        }
        var2.field1838 = var11;
        var3.field1838 = var44;
        var4.field1838 = var46;
        var5.field1838 = var48;
        var6.field1838 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2138();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2307();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2307();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2307();
            }
            this.field1567[var67] = var64 + var69;
            this.field1568[var67] = var65 + var70;
            this.field1569[var67] = var66 + var71;
            var64 = this.field1567[var67];
            var65 = this.field1568[var67];
            var66 = this.field1569[var67];
            if (var17 == 1) {
                this.field1593[var67] = var6.method2138();
            }
        }
        var2.field1838 = var42;
        var3.field1838 = var31;
        var4.field1838 = var34;
        var5.field1838 = var37;
        var6.field1838 = var35;
        var7.field1838 = var40;
        var8.field1838 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1578[var72] = (short) var2.method2239();
            if (var12 == 1) {
                this.field1574[var72] = var3.method2139();
            }
            if (var13 == 255) {
                this.field1575[var72] = var4.method2139();
            }
            if (var14 == 1) {
                this.field1598[var72] = var5.method2139();
            }
            if (var15 == 1) {
                this.field1576[var72] = var6.method2138();
            }
            if (var16 == 1) {
                this.field1571[var72] = (short) (var7.method2239() - 1);
            }
            if (this.field1580 != null && this.field1571[var72] != -1) {
                this.field1580[var72] = (byte) (var8.method2138() - 1);
            }
        }
        var2.field1838 = var33;
        var3.field1838 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2138();
            if (var78 == 1) {
                var73 = var2.method2307() + var76;
                var74 = var2.method2307() + var73;
                var75 = var2.method2307() + var74;
                var76 = var75;
                this.field1611[var77] = var73;
                this.field1577[var77] = var74;
                this.field1601[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2307() + var76;
                var76 = var75;
                this.field1611[var77] = var73;
                this.field1577[var77] = var74;
                this.field1601[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2307() + var76;
                var76 = var75;
                this.field1611[var77] = var73;
                this.field1577[var77] = var74;
                this.field1601[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2307() + var76;
                var76 = var75;
                this.field1611[var77] = var73;
                this.field1577[var77] = var81;
                this.field1601[var77] = var75;
            }
        }
        var2.field1838 = var50;
        var3.field1838 = var52;
        var4.field1838 = var54;
        var5.field1838 = var56;
        var6.field1838 = var58;
        var7.field1838 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1582[var82] & 0xFF;
            if (var83 == 0) {
                this.field1583[var82] = (short) var2.method2239();
                this.field1584[var82] = (short) var2.method2239();
                this.field1585[var82] = (short) var2.method2239();
            }
            if (var83 == 1) {
                this.field1583[var82] = (short) var3.method2239();
                this.field1584[var82] = (short) var3.method2239();
                this.field1585[var82] = (short) var3.method2239();
                this.field1586[var82] = (short) var4.method2239();
                this.field1587[var82] = (short) var4.method2239();
                this.field1592[var82] = (short) var4.method2239();
                this.field1589[var82] = (short) var5.method2239();
                this.field1579[var82] = var6.method2139();
                this.field1590[var82] = (short) var7.method2239();
            }
            if (var83 == 2) {
                this.field1583[var82] = (short) var3.method2239();
                this.field1584[var82] = (short) var3.method2239();
                this.field1585[var82] = (short) var3.method2239();
                this.field1586[var82] = (short) var4.method2239();
                this.field1587[var82] = (short) var4.method2239();
                this.field1592[var82] = (short) var4.method2239();
                this.field1589[var82] = (short) var5.method2239();
                this.field1579[var82] = var6.method2139();
                this.field1590[var82] = (short) var7.method2239();
                this.field1591[var82] = (short) var7.method2239();
            }
            if (var83 == 3) {
                this.field1583[var82] = (short) var3.method2239();
                this.field1584[var82] = (short) var3.method2239();
                this.field1585[var82] = (short) var3.method2239();
                this.field1586[var82] = (short) var4.method2239();
                this.field1587[var82] = (short) var4.method2239();
                this.field1592[var82] = (short) var4.method2239();
                this.field1589[var82] = (short) var5.method2239();
                this.field1579[var82] = var6.method2139();
                this.field1590[var82] = (short) var7.method2239();
            }
        }
        var2.field1838 = var62;
        int var84 = var2.method2138();
        if (var84 == 0) {
            return;
        }
        new class83();
        var2.method2239();
        var2.method2239();
        var2.method2239();
        var2.method2143();
    }

    @ObfuscatedName("cf.g([B)V")
    public void method1894(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class107 var4 = new class107(arg0);
        class107 var5 = new class107(arg0);
        class107 var6 = new class107(arg0);
        class107 var7 = new class107(arg0);
        class107 var8 = new class107(arg0);
        var4.field1838 = arg0.length - 18;
        int var9 = var4.method2239();
        int var10 = var4.method2239();
        int var11 = var4.method2138();
        int var12 = var4.method2138();
        int var13 = var4.method2138();
        int var14 = var4.method2138();
        int var15 = var4.method2138();
        int var16 = var4.method2138();
        int var17 = var4.method2239();
        int var18 = var4.method2239();
        int var19 = var4.method2239();
        int var20 = var4.method2239();
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
        this.field1570 = var10;
        this.field1581 = var11;
        this.field1567 = new int[var9];
        this.field1568 = new int[var9];
        this.field1569 = new int[var9];
        this.field1611 = new int[var10];
        this.field1577 = new int[var10];
        this.field1601 = new int[var10];
        if (var11 > 0) {
            this.field1582 = new byte[var11];
            this.field1583 = new short[var11];
            this.field1584 = new short[var11];
            this.field1585 = new short[var11];
        }
        if (var16 == 1) {
            this.field1593 = new int[var9];
        }
        if (var12 == 1) {
            this.field1574 = new byte[var10];
            this.field1580 = new byte[var10];
            this.field1571 = new short[var10];
        }
        if (var13 == 255) {
            this.field1575 = new byte[var10];
        } else {
            this.field1573 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1598 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1576 = new int[var10];
        }
        this.field1578 = new short[var10];
        var4.field1838 = var21;
        var5.field1838 = var36;
        var6.field1838 = var38;
        var7.field1838 = var40;
        var8.field1838 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2138();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2307();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2307();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2307();
            }
            this.field1567[var46] = var43 + var48;
            this.field1568[var46] = var44 + var49;
            this.field1569[var46] = var45 + var50;
            var43 = this.field1567[var46];
            var44 = this.field1568[var46];
            var45 = this.field1569[var46];
            if (var16 == 1) {
                this.field1593[var46] = var8.method2138();
            }
        }
        var4.field1838 = var32;
        var5.field1838 = var28;
        var6.field1838 = var26;
        var7.field1838 = var30;
        var8.field1838 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1578[var51] = (short) var4.method2239();
            if (var12 == 1) {
                int var52 = var5.method2138();
                if ((var52 & 0x1) == 1) {
                    this.field1574[var51] = 1;
                    var2 = true;
                } else {
                    this.field1574[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1580[var51] = (byte) (var52 >> 2);
                    this.field1571[var51] = this.field1578[var51];
                    this.field1578[var51] = 127;
                    if (this.field1571[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1580[var51] = -1;
                    this.field1571[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1575[var51] = var6.method2139();
            }
            if (var14 == 1) {
                this.field1598[var51] = var7.method2139();
            }
            if (var15 == 1) {
                this.field1576[var51] = var8.method2138();
            }
        }
        var4.field1838 = var25;
        var5.field1838 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2138();
            if (var58 == 1) {
                var53 = var4.method2307() + var56;
                var54 = var4.method2307() + var53;
                var55 = var4.method2307() + var54;
                var56 = var55;
                this.field1611[var57] = var53;
                this.field1577[var57] = var54;
                this.field1601[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2307() + var56;
                var56 = var55;
                this.field1611[var57] = var53;
                this.field1577[var57] = var54;
                this.field1601[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2307() + var56;
                var56 = var55;
                this.field1611[var57] = var53;
                this.field1577[var57] = var54;
                this.field1601[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2307() + var56;
                var56 = var55;
                this.field1611[var57] = var53;
                this.field1577[var57] = var61;
                this.field1601[var57] = var55;
            }
        }
        var4.field1838 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1582[var62] = 0;
            this.field1583[var62] = (short) var4.method2239();
            this.field1584[var62] = (short) var4.method2239();
            this.field1585[var62] = (short) var4.method2239();
        }
        if (this.field1580 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1580[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1583[var65] & 0xFFFF) == this.field1611[var64] && (this.field1584[var65] & 0xFFFF) == this.field1577[var64] && (this.field1585[var65] & 0xFFFF) == this.field1601[var64]) {
                        this.field1580[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1580 = null;
            }
        }
        if (!var3) {
            this.field1571 = null;
        }
        if (!var2) {
            this.field1574 = null;
        }
    }

    public class93(class93[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1605 = 0;
        this.field1570 = 0;
        this.field1581 = 0;
        this.field1573 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class93 var10 = arg0[var9];
            if (var10 != null) {
                this.field1605 += var10.field1605;
                this.field1570 += var10.field1570;
                this.field1581 += var10.field1581;
                if (var10.field1575 == null) {
                    if (this.field1573 == -1) {
                        this.field1573 = var10.field1573;
                    }
                    if (this.field1573 != var10.field1573) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1574 != null;
                var5 |= var10.field1598 != null;
                var6 |= var10.field1576 != null;
                var7 |= var10.field1571 != null;
                var8 |= var10.field1580 != null;
            }
        }
        this.field1567 = new int[this.field1605];
        this.field1568 = new int[this.field1605];
        this.field1569 = new int[this.field1605];
        this.field1593 = new int[this.field1605];
        this.field1611 = new int[this.field1570];
        this.field1577 = new int[this.field1570];
        this.field1601 = new int[this.field1570];
        if (var3) {
            this.field1574 = new byte[this.field1570];
        }
        if (var4) {
            this.field1575 = new byte[this.field1570];
        }
        if (var5) {
            this.field1598 = new byte[this.field1570];
        }
        if (var6) {
            this.field1576 = new int[this.field1570];
        }
        if (var7) {
            this.field1571 = new short[this.field1570];
        }
        if (var8) {
            this.field1580 = new byte[this.field1570];
        }
        this.field1578 = new short[this.field1570];
        if (this.field1581 > 0) {
            this.field1582 = new byte[this.field1581];
            this.field1583 = new short[this.field1581];
            this.field1584 = new short[this.field1581];
            this.field1585 = new short[this.field1581];
            this.field1586 = new short[this.field1581];
            this.field1587 = new short[this.field1581];
            this.field1592 = new short[this.field1581];
            this.field1589 = new short[this.field1581];
            this.field1579 = new byte[this.field1581];
            this.field1590 = new short[this.field1581];
            this.field1591 = new short[this.field1581];
        }
        this.field1605 = 0;
        this.field1570 = 0;
        this.field1581 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class93 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1570; var13++) {
                    if (var3 && var12.field1574 != null) {
                        this.field1574[this.field1570] = var12.field1574[var13];
                    }
                    if (var4) {
                        if (var12.field1575 == null) {
                            this.field1575[this.field1570] = var12.field1573;
                        } else {
                            this.field1575[this.field1570] = var12.field1575[var13];
                        }
                    }
                    if (var5 && var12.field1598 != null) {
                        this.field1598[this.field1570] = var12.field1598[var13];
                    }
                    if (var6 && var12.field1576 != null) {
                        this.field1576[this.field1570] = var12.field1576[var13];
                    }
                    if (var7) {
                        if (var12.field1571 == null) {
                            this.field1571[this.field1570] = -1;
                        } else {
                            this.field1571[this.field1570] = var12.field1571[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1580 == null || var12.field1580[var13] == -1) {
                            this.field1580[this.field1570] = -1;
                        } else {
                            this.field1580[this.field1570] = (byte) (var12.field1580[var13] + this.field1581);
                        }
                    }
                    this.field1578[this.field1570] = var12.field1578[var13];
                    this.field1611[this.field1570] = this.method1895(var12, var12.field1611[var13]);
                    this.field1577[this.field1570] = this.method1895(var12, var12.field1577[var13]);
                    this.field1601[this.field1570] = this.method1895(var12, var12.field1601[var13]);
                    this.field1570++;
                }
                for (int var14 = 0; var14 < var12.field1581; var14++) {
                    byte var15 = this.field1582[this.field1581] = var12.field1582[var14];
                    if (var15 == 0) {
                        this.field1583[this.field1581] = (short) this.method1895(var12, var12.field1583[var14]);
                        this.field1584[this.field1581] = (short) this.method1895(var12, var12.field1584[var14]);
                        this.field1585[this.field1581] = (short) this.method1895(var12, var12.field1585[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1583[this.field1581] = var12.field1583[var14];
                        this.field1584[this.field1581] = var12.field1584[var14];
                        this.field1585[this.field1581] = var12.field1585[var14];
                        this.field1586[this.field1581] = var12.field1586[var14];
                        this.field1587[this.field1581] = var12.field1587[var14];
                        this.field1592[this.field1581] = var12.field1592[var14];
                        this.field1589[this.field1581] = var12.field1589[var14];
                        this.field1579[this.field1581] = var12.field1579[var14];
                        this.field1590[this.field1581] = var12.field1590[var14];
                    }
                    if (var15 == 2) {
                        this.field1591[this.field1581] = var12.field1591[var14];
                    }
                    this.field1581++;
                }
            }
        }
    }

    @ObfuscatedName("cf.h(Lcf;I)I")
    public final int method1895(class93 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1567[arg1];
        int var5 = arg0.field1568[arg1];
        int var6 = arg0.field1569[arg1];
        for (int var7 = 0; var7 < this.field1605; var7++) {
            if (this.field1567[var7] == var4 && this.field1568[var7] == var5 && this.field1569[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1567[this.field1605] = var4;
            this.field1568[this.field1605] = var5;
            this.field1569[this.field1605] = var6;
            if (arg0.field1593 != null) {
                this.field1593[this.field1605] = arg0.field1593[arg1];
            }
            var3 = this.field1605++;
        }
        return var3;
    }

    public class93(class93 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1605 = arg0.field1605;
        this.field1570 = arg0.field1570;
        this.field1581 = arg0.field1581;
        if (arg1) {
            this.field1567 = arg0.field1567;
            this.field1568 = arg0.field1568;
            this.field1569 = arg0.field1569;
        } else {
            this.field1567 = new int[this.field1605];
            this.field1568 = new int[this.field1605];
            this.field1569 = new int[this.field1605];
            for (int var6 = 0; var6 < this.field1605; var6++) {
                this.field1567[var6] = arg0.field1567[var6];
                this.field1568[var6] = arg0.field1568[var6];
                this.field1569[var6] = arg0.field1569[var6];
            }
        }
        if (arg2) {
            this.field1578 = arg0.field1578;
        } else {
            this.field1578 = new short[this.field1570];
            for (int var7 = 0; var7 < this.field1570; var7++) {
                this.field1578[var7] = arg0.field1578[var7];
            }
        }
        if (arg3 || arg0.field1571 == null) {
            this.field1571 = arg0.field1571;
        } else {
            this.field1571 = new short[this.field1570];
            for (int var8 = 0; var8 < this.field1570; var8++) {
                this.field1571[var8] = arg0.field1571[var8];
            }
        }
        if (arg4) {
            this.field1598 = arg0.field1598;
        } else {
            this.field1598 = new byte[this.field1570];
            if (arg0.field1598 == null) {
                for (int var9 = 0; var9 < this.field1570; var9++) {
                    this.field1598[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1570; var10++) {
                    this.field1598[var10] = arg0.field1598[var10];
                }
            }
        }
        this.field1611 = arg0.field1611;
        this.field1577 = arg0.field1577;
        this.field1601 = arg0.field1601;
        this.field1574 = arg0.field1574;
        this.field1575 = arg0.field1575;
        this.field1580 = arg0.field1580;
        this.field1573 = arg0.field1573;
        this.field1582 = arg0.field1582;
        this.field1583 = arg0.field1583;
        this.field1584 = arg0.field1584;
        this.field1585 = arg0.field1585;
        this.field1586 = arg0.field1586;
        this.field1587 = arg0.field1587;
        this.field1592 = arg0.field1592;
        this.field1589 = arg0.field1589;
        this.field1579 = arg0.field1579;
        this.field1590 = arg0.field1590;
        this.field1591 = arg0.field1591;
        this.field1593 = arg0.field1593;
        this.field1576 = arg0.field1576;
        this.field1595 = arg0.field1595;
        this.field1596 = arg0.field1596;
        this.field1603 = arg0.field1603;
        this.field1588 = arg0.field1588;
        this.field1566 = arg0.field1566;
        this.field1600 = arg0.field1600;
        this.field1572 = arg0.field1572;
    }

    @ObfuscatedName("cf.l()Lcf;")
    public class93 method1897() {
        class93 var1 = new class93();
        if (this.field1574 != null) {
            var1.field1574 = new byte[this.field1570];
            for (int var2 = 0; var2 < this.field1570; var2++) {
                var1.field1574[var2] = this.field1574[var2];
            }
        }
        var1.field1605 = this.field1605;
        var1.field1570 = this.field1570;
        var1.field1581 = this.field1581;
        var1.field1567 = this.field1567;
        var1.field1568 = this.field1568;
        var1.field1569 = this.field1569;
        var1.field1611 = this.field1611;
        var1.field1577 = this.field1577;
        var1.field1601 = this.field1601;
        var1.field1575 = this.field1575;
        var1.field1598 = this.field1598;
        var1.field1580 = this.field1580;
        var1.field1578 = this.field1578;
        var1.field1571 = this.field1571;
        var1.field1573 = this.field1573;
        var1.field1582 = this.field1582;
        var1.field1583 = this.field1583;
        var1.field1584 = this.field1584;
        var1.field1585 = this.field1585;
        var1.field1586 = this.field1586;
        var1.field1587 = this.field1587;
        var1.field1592 = this.field1592;
        var1.field1589 = this.field1589;
        var1.field1579 = this.field1579;
        var1.field1590 = this.field1590;
        var1.field1591 = this.field1591;
        var1.field1593 = this.field1593;
        var1.field1576 = this.field1576;
        var1.field1595 = this.field1595;
        var1.field1596 = this.field1596;
        var1.field1603 = this.field1603;
        var1.field1588 = this.field1588;
        var1.field1600 = this.field1600;
        var1.field1572 = this.field1572;
        return var1;
    }

    @ObfuscatedName("cf.j([[IIIIZI)Lcf;")
    public class93 method1898(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1959();
        int var7 = this.field1594 + arg1;
        int var8 = this.field1604 + arg1;
        int var9 = this.field1607 + arg3;
        int var10 = this.field1606 + arg3;
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
        class93 var15;
        if (arg4) {
            var15 = new class93();
            var15.field1605 = this.field1605;
            var15.field1570 = this.field1570;
            var15.field1581 = this.field1581;
            var15.field1567 = this.field1567;
            var15.field1569 = this.field1569;
            var15.field1611 = this.field1611;
            var15.field1577 = this.field1577;
            var15.field1601 = this.field1601;
            var15.field1574 = this.field1574;
            var15.field1575 = this.field1575;
            var15.field1598 = this.field1598;
            var15.field1580 = this.field1580;
            var15.field1578 = this.field1578;
            var15.field1571 = this.field1571;
            var15.field1573 = this.field1573;
            var15.field1582 = this.field1582;
            var15.field1583 = this.field1583;
            var15.field1584 = this.field1584;
            var15.field1585 = this.field1585;
            var15.field1586 = this.field1586;
            var15.field1587 = this.field1587;
            var15.field1592 = this.field1592;
            var15.field1589 = this.field1589;
            var15.field1579 = this.field1579;
            var15.field1590 = this.field1590;
            var15.field1591 = this.field1591;
            var15.field1593 = this.field1593;
            var15.field1576 = this.field1576;
            var15.field1595 = this.field1595;
            var15.field1596 = this.field1596;
            var15.field1600 = this.field1600;
            var15.field1572 = this.field1572;
            var15.field1568 = new int[var15.field1605];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1605; var16++) {
                int var17 = this.field1567[var16] + arg1;
                int var18 = this.field1569[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1568[var16] = this.field1568[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1605; var26++) {
                int var27 = (-this.field1568[var26] << 16) / this.field1332;
                if (var27 < arg5) {
                    int var28 = this.field1567[var26] + arg1;
                    int var29 = this.field1569[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1568[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1568[var26];
                }
            }
        }
        var15.method1910();
        return var15;
    }

    @ObfuscatedName("cf.c()V")
    public void method1899() {
        int var10002;
        if (this.field1593 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1605; var3++) {
                int var4 = this.field1593[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1595 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1595[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1605) {
                int var7 = this.field1593[var6];
                this.field1595[var7][var1[var7]++] = var6++;
            }
            this.field1593 = null;
        }
        if (this.field1576 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1570; var10++) {
            int var11 = this.field1576[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1596 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1596[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1570) {
            int var14 = this.field1576[var13];
            this.field1596[var14][var8[var14]++] = var13++;
        }
        this.field1576 = null;
    }

    @ObfuscatedName("cf.d()V")
    public void method1900() {
        for (int var1 = 0; var1 < this.field1605; var1++) {
            int var2 = this.field1567[var1];
            this.field1567[var1] = this.field1569[var1];
            this.field1569[var1] = -var2;
        }
        this.method1910();
    }

    @ObfuscatedName("cf.v()V")
    public void method1946() {
        for (int var1 = 0; var1 < this.field1605; var1++) {
            this.field1567[var1] = -this.field1567[var1];
            this.field1569[var1] = -this.field1569[var1];
        }
        this.method1910();
    }

    @ObfuscatedName("cf.n()V")
    public void method1896() {
        for (int var1 = 0; var1 < this.field1605; var1++) {
            int var2 = this.field1569[var1];
            this.field1569[var1] = this.field1567[var1];
            this.field1567[var1] = -var2;
        }
        this.method1910();
    }

    @ObfuscatedName("cf.z(I)V")
    public void method1939(int arg0) {
        int var2 = field1602[arg0];
        int var3 = field1612[arg0];
        for (int var4 = 0; var4 < this.field1605; var4++) {
            int var5 = this.field1569[var4] * var2 + this.field1567[var4] * var3 >> 16;
            this.field1569[var4] = this.field1569[var4] * var3 - this.field1567[var4] * var2 >> 16;
            this.field1567[var4] = var5;
        }
        this.method1910();
    }

    @ObfuscatedName("cf.a(III)V")
    public void method1904(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1605; var4++) {
            this.field1567[var4] += arg0;
            this.field1568[var4] += arg1;
            this.field1569[var4] += arg2;
        }
        this.method1910();
    }

    @ObfuscatedName("cf.t(SS)V")
    public void method1905(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1570; var3++) {
            if (this.field1578[var3] == arg0) {
                this.field1578[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cf.p(SS)V")
    public void method1956(short arg0, short arg1) {
        if (this.field1571 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1570; var3++) {
            if (this.field1571[var3] == arg0) {
                this.field1571[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cf.i()V")
    public void method1907() {
        for (int var1 = 0; var1 < this.field1605; var1++) {
            this.field1569[var1] = -this.field1569[var1];
        }
        for (int var2 = 0; var2 < this.field1570; var2++) {
            int var3 = this.field1611[var2];
            this.field1611[var2] = this.field1601[var2];
            this.field1601[var2] = var3;
        }
        this.method1910();
    }

    @ObfuscatedName("cf.r(III)V")
    public void method1908(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1605; var4++) {
            this.field1567[var4] = this.field1567[var4] * arg0 / 128;
            this.field1568[var4] = this.field1568[var4] * arg1 / 128;
            this.field1569[var4] = this.field1569[var4] * arg2 / 128;
        }
        this.method1910();
    }

    @ObfuscatedName("cf.w()V")
    public void method1968() {
        if (this.field1603 != null) {
            return;
        }
        this.field1603 = new class89[this.field1605];
        for (int var1 = 0; var1 < this.field1605; var1++) {
            this.field1603[var1] = new class89();
        }
        for (int var2 = 0; var2 < this.field1570; var2++) {
            int var3 = this.field1611[var2];
            int var4 = this.field1577[var2];
            int var5 = this.field1601[var2];
            int var6 = this.field1567[var4] - this.field1567[var3];
            int var7 = this.field1568[var4] - this.field1568[var3];
            int var8 = this.field1569[var4] - this.field1569[var3];
            int var9 = this.field1567[var5] - this.field1567[var3];
            int var10 = this.field1568[var5] - this.field1568[var3];
            int var11 = this.field1569[var5] - this.field1569[var3];
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
            if (this.field1574 == null) {
                var19 = 0;
            } else {
                var19 = this.field1574[var2];
            }
            if (var19 == 0) {
                class89 var20 = this.field1603[var3];
                var20.field1497 += var16;
                var20.field1496 += var17;
                var20.field1502 += var18;
                var20.field1498++;
                class89 var21 = this.field1603[var4];
                var21.field1497 += var16;
                var21.field1496 += var17;
                var21.field1502 += var18;
                var21.field1498++;
                class89 var22 = this.field1603[var5];
                var22.field1497 += var16;
                var22.field1496 += var17;
                var22.field1502 += var18;
                var22.field1498++;
            } else if (var19 == 1) {
                if (this.field1588 == null) {
                    this.field1588 = new class77[this.field1570];
                }
                class77 var23 = this.field1588[var2] = new class77();
                var23.field1330 = var16;
                var23.field1324 = var17;
                var23.field1326 = var18;
            }
        }
    }

    @ObfuscatedName("cf.b()V")
    public void method1910() {
        this.field1603 = null;
        this.field1566 = null;
        this.field1588 = null;
        this.field1597 = false;
    }

    @ObfuscatedName("cf.x()V")
    public void method1959() {
        if (this.field1597) {
            return;
        }
        this.field1332 = 0;
        this.field1599 = 0;
        this.field1594 = 999999;
        this.field1604 = -999999;
        this.field1606 = -99999;
        this.field1607 = 99999;
        for (int var1 = 0; var1 < this.field1605; var1++) {
            int var2 = this.field1567[var1];
            int var3 = this.field1568[var1];
            int var4 = this.field1569[var1];
            if (var2 < this.field1594) {
                this.field1594 = var2;
            }
            if (var2 > this.field1604) {
                this.field1604 = var2;
            }
            if (var4 < this.field1607) {
                this.field1607 = var4;
            }
            if (var4 > this.field1606) {
                this.field1606 = var4;
            }
            if (-var3 > this.field1332) {
                this.field1332 = -var3;
            }
            if (var3 > this.field1599) {
                this.field1599 = var3;
            }
        }
        this.field1597 = true;
    }

    @ObfuscatedName("cf.q(Lcf;Lcf;IIIZ)V")
    public static void method1912(class93 arg0, class93 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1959();
        arg0.method1968();
        arg1.method1959();
        arg1.method1968();
        field1610++;
        int var6 = 0;
        int[] var7 = arg1.field1567;
        int var8 = arg1.field1605;
        for (int var9 = 0; var9 < arg0.field1605; var9++) {
            class89 var10 = arg0.field1603[var9];
            if (var10.field1498 != 0) {
                int var11 = arg0.field1568[var9] - arg3;
                if (var11 <= arg1.field1599) {
                    int var12 = arg0.field1567[var9] - arg2;
                    if (var12 >= arg1.field1594 && var12 <= arg1.field1604) {
                        int var13 = arg0.field1569[var9] - arg4;
                        if (var13 >= arg1.field1607 && var13 <= arg1.field1606) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class89 var15 = arg1.field1603[var14];
                                if (var7[var14] == var12 && arg1.field1569[var14] == var13 && arg1.field1568[var14] == var11 && var15.field1498 != 0) {
                                    if (arg0.field1566 == null) {
                                        arg0.field1566 = new class89[arg0.field1605];
                                    }
                                    if (arg1.field1566 == null) {
                                        arg1.field1566 = new class89[var8];
                                    }
                                    class89 var16 = arg0.field1566[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1566[var9] = new class89(var10);
                                    }
                                    class89 var17 = arg1.field1566[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1566[var14] = new class89(var15);
                                    }
                                    var16.field1497 += var15.field1497;
                                    var16.field1496 += var15.field1496;
                                    var16.field1502 += var15.field1502;
                                    var16.field1498 += var15.field1498;
                                    var17.field1497 += var10.field1497;
                                    var17.field1496 += var10.field1496;
                                    var17.field1502 += var10.field1502;
                                    var17.field1498 += var10.field1498;
                                    var6++;
                                    field1608[var9] = field1610;
                                    field1609[var14] = field1610;
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
        for (int var18 = 0; var18 < arg0.field1570; var18++) {
            if (field1608[arg0.field1611[var18]] == field1610 && field1608[arg0.field1577[var18]] == field1610 && field1608[arg0.field1601[var18]] == field1610) {
                if (arg0.field1574 == null) {
                    arg0.field1574 = new byte[arg0.field1570];
                }
                arg0.field1574[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1570; var19++) {
            if (field1609[arg1.field1611[var19]] == field1610 && field1609[arg1.field1577[var19]] == field1610 && field1609[arg1.field1601[var19]] == field1610) {
                if (arg1.field1574 == null) {
                    arg1.field1574 = new byte[arg1.field1570];
                }
                arg1.field1574[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cf.o(IIIII)Lck;")
    public final class98 method1913(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1968();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class98 var8 = new class98();
        var8.field1692 = new int[this.field1570];
        var8.field1702 = new int[this.field1570];
        var8.field1736 = new int[this.field1570];
        if (this.field1581 > 0 && this.field1580 != null) {
            int[] var9 = new int[this.field1581];
            for (int var10 = 0; var10 < this.field1570; var10++) {
                if (this.field1580[var10] != -1) {
                    var9[this.field1580[var10] & 0xFF]++;
                }
            }
            var8.field1720 = 0;
            for (int var11 = 0; var11 < this.field1581; var11++) {
                if (var9[var11] > 0 && this.field1582[var11] == 0) {
                    var8.field1720++;
                }
            }
            var8.field1701 = new int[var8.field1720];
            var8.field1721 = new int[var8.field1720];
            var8.field1703 = new int[var8.field1720];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1581; var13++) {
                if (var9[var13] > 0 && this.field1582[var13] == 0) {
                    var8.field1701[var12] = this.field1583[var13] & 0xFFFF;
                    var8.field1721[var12] = this.field1584[var13] & 0xFFFF;
                    var8.field1703[var12] = this.field1585[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1717 = new byte[this.field1570];
            for (int var14 = 0; var14 < this.field1570; var14++) {
                if (this.field1580[var14] == -1) {
                    var8.field1717[var14] = -1;
                } else {
                    var8.field1717[var14] = (byte) var9[this.field1580[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1570; var15++) {
            byte var16;
            if (this.field1574 == null) {
                var16 = 0;
            } else {
                var16 = this.field1574[var15];
            }
            byte var17;
            if (this.field1598 == null) {
                var17 = 0;
            } else {
                var17 = this.field1598[var15];
            }
            short var18;
            if (this.field1571 == null) {
                var18 = -1;
            } else {
                var18 = this.field1571[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1578[var15] & 0xFFFF;
                    class89 var20;
                    if (this.field1566 == null || this.field1566[this.field1611[var15]] == null) {
                        var20 = this.field1603[this.field1611[var15]];
                    } else {
                        var20 = this.field1566[this.field1611[var15]];
                    }
                    int var21 = (var20.field1502 * arg4 + var20.field1497 * arg2 + var20.field1496 * arg3) / (var20.field1498 * var7) + arg0;
                    var8.field1692[var15] = method1955(var19, var21);
                    class89 var22;
                    if (this.field1566 == null || this.field1566[this.field1577[var15]] == null) {
                        var22 = this.field1603[this.field1577[var15]];
                    } else {
                        var22 = this.field1566[this.field1577[var15]];
                    }
                    int var23 = (var22.field1502 * arg4 + var22.field1497 * arg2 + var22.field1496 * arg3) / (var22.field1498 * var7) + arg0;
                    var8.field1702[var15] = method1955(var19, var23);
                    class89 var24;
                    if (this.field1566 == null || this.field1566[this.field1601[var15]] == null) {
                        var24 = this.field1603[this.field1601[var15]];
                    } else {
                        var24 = this.field1566[this.field1601[var15]];
                    }
                    int var25 = (var24.field1502 * arg4 + var24.field1497 * arg2 + var24.field1496 * arg3) / (var24.field1498 * var7) + arg0;
                    var8.field1736[var15] = method1955(var19, var25);
                } else if (var16 == 1) {
                    class77 var26 = this.field1588[var15];
                    int var27 = (var26.field1326 * arg4 + var26.field1330 * arg2 + var26.field1324 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1692[var15] = method1955(this.field1578[var15] & 0xFFFF, var27);
                    var8.field1736[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1692[var15] = 128;
                    var8.field1736[var15] = -1;
                } else {
                    var8.field1736[var15] = -2;
                }
            } else if (var16 == 0) {
                class89 var28;
                if (this.field1566 == null || this.field1566[this.field1611[var15]] == null) {
                    var28 = this.field1603[this.field1611[var15]];
                } else {
                    var28 = this.field1566[this.field1611[var15]];
                }
                int var29 = (var28.field1502 * arg4 + var28.field1497 * arg2 + var28.field1496 * arg3) / (var28.field1498 * var7) + arg0;
                var8.field1692[var15] = method1901(var29);
                class89 var30;
                if (this.field1566 == null || this.field1566[this.field1577[var15]] == null) {
                    var30 = this.field1603[this.field1577[var15]];
                } else {
                    var30 = this.field1566[this.field1577[var15]];
                }
                int var31 = (var30.field1502 * arg4 + var30.field1497 * arg2 + var30.field1496 * arg3) / (var30.field1498 * var7) + arg0;
                var8.field1702[var15] = method1901(var31);
                class89 var32;
                if (this.field1566 == null || this.field1566[this.field1601[var15]] == null) {
                    var32 = this.field1603[this.field1601[var15]];
                } else {
                    var32 = this.field1566[this.field1601[var15]];
                }
                int var33 = (var32.field1502 * arg4 + var32.field1497 * arg2 + var32.field1496 * arg3) / (var32.field1498 * var7) + arg0;
                var8.field1736[var15] = method1901(var33);
            } else if (var16 == 1) {
                class77 var34 = this.field1588[var15];
                int var35 = (var34.field1326 * arg4 + var34.field1330 * arg2 + var34.field1324 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1692[var15] = method1901(var35);
                var8.field1736[var15] = -1;
            } else {
                var8.field1736[var15] = -2;
            }
        }
        this.method1899();
        var8.field1705 = this.field1605;
        var8.field1685 = this.field1567;
        var8.field1686 = this.field1568;
        var8.field1687 = this.field1569;
        var8.field1727 = this.field1570;
        var8.field1689 = this.field1611;
        var8.field1690 = this.field1577;
        var8.field1708 = this.field1601;
        var8.field1735 = this.field1575;
        var8.field1691 = this.field1598;
        var8.field1699 = this.field1573;
        var8.field1704 = this.field1595;
        var8.field1711 = this.field1596;
        var8.field1698 = this.field1571;
        return var8;
    }

    @ObfuscatedName("cf.m(II)I")
    public static final int method1955(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cf.f(I)I")
    public static final int method1901(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
