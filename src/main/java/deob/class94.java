package deob;

@ObfuscatedName("cm")
public class class94 extends class79 {

    @ObfuscatedName("cm.l")
    public int field1601 = 0;

    @ObfuscatedName("cm.y")
    public int[] field1598;

    @ObfuscatedName("cm.g")
    public int[] field1570;

    @ObfuscatedName("cm.j")
    public int[] field1581;

    @ObfuscatedName("cm.w")
    public int field1574 = 0;

    @ObfuscatedName("cm.c")
    public int[] field1575;

    @ObfuscatedName("cm.x")
    public int[] field1576;

    @ObfuscatedName("cm.f")
    public int[] field1577;

    @ObfuscatedName("cm.t")
    public byte[] field1585;

    @ObfuscatedName("cm.n")
    public byte[] field1579;

    @ObfuscatedName("cm.p")
    public byte[] field1580;

    @ObfuscatedName("cm.a")
    public byte[] field1615;

    @ObfuscatedName("cm.o")
    public short[] field1572;

    @ObfuscatedName("cm.b")
    public short[] field1583;

    @ObfuscatedName("cm.r")
    public byte field1605 = 0;

    @ObfuscatedName("cm.z")
    public int field1590;

    @ObfuscatedName("cm.u")
    public byte[] field1607;

    @ObfuscatedName("cm.s")
    public short[] field1587;

    @ObfuscatedName("cm.i")
    public short[] field1602;

    @ObfuscatedName("cm.e")
    public short[] field1589;

    @ObfuscatedName("cm.h")
    public short[] field1582;

    @ObfuscatedName("cm.k")
    public short[] field1591;

    @ObfuscatedName("cm.v")
    public short[] field1571;

    @ObfuscatedName("cm.m")
    public short[] field1593;

    @ObfuscatedName("cm.d")
    public short[] field1594;

    @ObfuscatedName("cm.q")
    public short[] field1595;

    @ObfuscatedName("cm.ak")
    public byte[] field1596;

    @ObfuscatedName("cm.ah")
    public int[] field1597;

    @ObfuscatedName("cm.an")
    public int[] field1584;

    @ObfuscatedName("cm.aw")
    public int[][] field1599;

    @ObfuscatedName("cm.az")
    public int[][] field1600;

    @ObfuscatedName("cm.ad")
    public class78[] field1586;

    @ObfuscatedName("cm.ag")
    public class90[] field1573;

    @ObfuscatedName("cm.aa")
    public class90[] field1603;

    @ObfuscatedName("cm.au")
    public short field1604;

    @ObfuscatedName("cm.aq")
    public short field1592;

    @ObfuscatedName("cm.am")
    public boolean field1606 = false;

    @ObfuscatedName("cm.ax")
    public int field1609;

    @ObfuscatedName("cm.af")
    public int field1608;

    @ObfuscatedName("cm.av")
    public int field1616;

    @ObfuscatedName("cm.ao")
    public int field1610;

    @ObfuscatedName("cm.al")
    public int field1611;

    @ObfuscatedName("cm.aj")
    public static int[] field1612 = new int[10000];

    @ObfuscatedName("cm.ae")
    public static int[] field1613 = new int[10000];

    @ObfuscatedName("cm.ai")
    public static int field1614 = 0;

    @ObfuscatedName("cm.ay")
    public static int[] field1588 = class85.field1468;

    @ObfuscatedName("cm.ab")
    public static int[] field1578 = class85.field1469;

    public class94() {
    }

    @ObfuscatedName("cm.l(Leo;II)Lcm;")
    public static class94 method1902(class149 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2752(arg1, arg2);
        return var3 == null ? null : new class94(var3);
    }

    public class94(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1896(arg0);
        } else {
            this.method1897(arg0);
        }
    }

    @ObfuscatedName("cm.g([B)V")
    public void method1896(byte[] arg0) {
        class108 var2 = new class108(arg0);
        class108 var3 = new class108(arg0);
        class108 var4 = new class108(arg0);
        class108 var5 = new class108(arg0);
        class108 var6 = new class108(arg0);
        class108 var7 = new class108(arg0);
        class108 var8 = new class108(arg0);
        var2.field1823 = arg0.length - 23;
        int var9 = var2.method2163();
        int var10 = var2.method2163();
        int var11 = var2.method2291();
        int var12 = var2.method2291();
        int var13 = var2.method2291();
        int var14 = var2.method2291();
        int var15 = var2.method2291();
        int var16 = var2.method2291();
        int var17 = var2.method2291();
        int var18 = var2.method2163();
        int var19 = var2.method2163();
        int var20 = var2.method2163();
        int var21 = var2.method2163();
        int var22 = var2.method2163();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1607 = new byte[var11];
            var2.field1823 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1607[var26] = var2.method2292();
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
        this.field1601 = var9;
        this.field1574 = var10;
        this.field1590 = var11;
        this.field1598 = new int[var9];
        this.field1570 = new int[var9];
        this.field1581 = new int[var9];
        this.field1575 = new int[var10];
        this.field1576 = new int[var10];
        this.field1577 = new int[var10];
        if (var17 == 1) {
            this.field1597 = new int[var9];
        }
        if (var12 == 1) {
            this.field1585 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1579 = new byte[var10];
        } else {
            this.field1605 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1580 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1584 = new int[var10];
        }
        if (var16 == 1) {
            this.field1583 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1615 = new byte[var10];
        }
        this.field1572 = new short[var10];
        if (var11 > 0) {
            this.field1587 = new short[var11];
            this.field1602 = new short[var11];
            this.field1589 = new short[var11];
            if (var24 > 0) {
                this.field1582 = new short[var24];
                this.field1591 = new short[var24];
                this.field1571 = new short[var24];
                this.field1593 = new short[var24];
                this.field1596 = new byte[var24];
                this.field1594 = new short[var24];
            }
            if (var25 > 0) {
                this.field1595 = new short[var25];
            }
        }
        var2.field1823 = var11;
        var3.field1823 = var44;
        var4.field1823 = var46;
        var5.field1823 = var48;
        var6.field1823 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2291();
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
            this.field1598[var67] = var64 + var69;
            this.field1570[var67] = var65 + var70;
            this.field1581[var67] = var66 + var71;
            var64 = this.field1598[var67];
            var65 = this.field1570[var67];
            var66 = this.field1581[var67];
            if (var17 == 1) {
                this.field1597[var67] = var6.method2291();
            }
        }
        var2.field1823 = var42;
        var3.field1823 = var31;
        var4.field1823 = var34;
        var5.field1823 = var37;
        var6.field1823 = var35;
        var7.field1823 = var40;
        var8.field1823 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1572[var72] = (short) var2.method2163();
            if (var12 == 1) {
                this.field1585[var72] = var3.method2292();
            }
            if (var13 == 255) {
                this.field1579[var72] = var4.method2292();
            }
            if (var14 == 1) {
                this.field1580[var72] = var5.method2292();
            }
            if (var15 == 1) {
                this.field1584[var72] = var6.method2291();
            }
            if (var16 == 1) {
                this.field1583[var72] = (short) (var7.method2163() - 1);
            }
            if (this.field1615 != null && this.field1583[var72] != -1) {
                this.field1615[var72] = (byte) (var8.method2291() - 1);
            }
        }
        var2.field1823 = var33;
        var3.field1823 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2291();
            if (var78 == 1) {
                var73 = var2.method2172() + var76;
                var74 = var2.method2172() + var73;
                var75 = var2.method2172() + var74;
                var76 = var75;
                this.field1575[var77] = var73;
                this.field1576[var77] = var74;
                this.field1577[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2172() + var76;
                var76 = var75;
                this.field1575[var77] = var73;
                this.field1576[var77] = var74;
                this.field1577[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2172() + var76;
                var76 = var75;
                this.field1575[var77] = var73;
                this.field1576[var77] = var74;
                this.field1577[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2172() + var76;
                var76 = var75;
                this.field1575[var77] = var73;
                this.field1576[var77] = var81;
                this.field1577[var77] = var75;
            }
        }
        var2.field1823 = var50;
        var3.field1823 = var52;
        var4.field1823 = var54;
        var5.field1823 = var56;
        var6.field1823 = var58;
        var7.field1823 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1607[var82] & 0xFF;
            if (var83 == 0) {
                this.field1587[var82] = (short) var2.method2163();
                this.field1602[var82] = (short) var2.method2163();
                this.field1589[var82] = (short) var2.method2163();
            }
            if (var83 == 1) {
                this.field1587[var82] = (short) var3.method2163();
                this.field1602[var82] = (short) var3.method2163();
                this.field1589[var82] = (short) var3.method2163();
                this.field1582[var82] = (short) var4.method2163();
                this.field1591[var82] = (short) var4.method2163();
                this.field1571[var82] = (short) var4.method2163();
                this.field1593[var82] = (short) var5.method2163();
                this.field1596[var82] = var6.method2292();
                this.field1594[var82] = (short) var7.method2163();
            }
            if (var83 == 2) {
                this.field1587[var82] = (short) var3.method2163();
                this.field1602[var82] = (short) var3.method2163();
                this.field1589[var82] = (short) var3.method2163();
                this.field1582[var82] = (short) var4.method2163();
                this.field1591[var82] = (short) var4.method2163();
                this.field1571[var82] = (short) var4.method2163();
                this.field1593[var82] = (short) var5.method2163();
                this.field1596[var82] = var6.method2292();
                this.field1594[var82] = (short) var7.method2163();
                this.field1595[var82] = (short) var7.method2163();
            }
            if (var83 == 3) {
                this.field1587[var82] = (short) var3.method2163();
                this.field1602[var82] = (short) var3.method2163();
                this.field1589[var82] = (short) var3.method2163();
                this.field1582[var82] = (short) var4.method2163();
                this.field1591[var82] = (short) var4.method2163();
                this.field1571[var82] = (short) var4.method2163();
                this.field1593[var82] = (short) var5.method2163();
                this.field1596[var82] = var6.method2292();
                this.field1594[var82] = (short) var7.method2163();
            }
        }
        var2.field1823 = var62;
        int var84 = var2.method2291();
        if (var84 == 0) {
            return;
        }
        new class84();
        var2.method2163();
        var2.method2163();
        var2.method2163();
        var2.method2297();
    }

    @ObfuscatedName("cm.j([B)V")
    public void method1897(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class108 var4 = new class108(arg0);
        class108 var5 = new class108(arg0);
        class108 var6 = new class108(arg0);
        class108 var7 = new class108(arg0);
        class108 var8 = new class108(arg0);
        var4.field1823 = arg0.length - 18;
        int var9 = var4.method2163();
        int var10 = var4.method2163();
        int var11 = var4.method2291();
        int var12 = var4.method2291();
        int var13 = var4.method2291();
        int var14 = var4.method2291();
        int var15 = var4.method2291();
        int var16 = var4.method2291();
        int var17 = var4.method2163();
        int var18 = var4.method2163();
        int var19 = var4.method2163();
        int var20 = var4.method2163();
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
        this.field1601 = var9;
        this.field1574 = var10;
        this.field1590 = var11;
        this.field1598 = new int[var9];
        this.field1570 = new int[var9];
        this.field1581 = new int[var9];
        this.field1575 = new int[var10];
        this.field1576 = new int[var10];
        this.field1577 = new int[var10];
        if (var11 > 0) {
            this.field1607 = new byte[var11];
            this.field1587 = new short[var11];
            this.field1602 = new short[var11];
            this.field1589 = new short[var11];
        }
        if (var16 == 1) {
            this.field1597 = new int[var9];
        }
        if (var12 == 1) {
            this.field1585 = new byte[var10];
            this.field1615 = new byte[var10];
            this.field1583 = new short[var10];
        }
        if (var13 == 255) {
            this.field1579 = new byte[var10];
        } else {
            this.field1605 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1580 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1584 = new int[var10];
        }
        this.field1572 = new short[var10];
        var4.field1823 = var21;
        var5.field1823 = var36;
        var6.field1823 = var38;
        var7.field1823 = var40;
        var8.field1823 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2291();
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
            this.field1598[var46] = var43 + var48;
            this.field1570[var46] = var44 + var49;
            this.field1581[var46] = var45 + var50;
            var43 = this.field1598[var46];
            var44 = this.field1570[var46];
            var45 = this.field1581[var46];
            if (var16 == 1) {
                this.field1597[var46] = var8.method2291();
            }
        }
        var4.field1823 = var32;
        var5.field1823 = var28;
        var6.field1823 = var26;
        var7.field1823 = var30;
        var8.field1823 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1572[var51] = (short) var4.method2163();
            if (var12 == 1) {
                int var52 = var5.method2291();
                if ((var52 & 0x1) == 1) {
                    this.field1585[var51] = 1;
                    var2 = true;
                } else {
                    this.field1585[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1615[var51] = (byte) (var52 >> 2);
                    this.field1583[var51] = this.field1572[var51];
                    this.field1572[var51] = 127;
                    if (this.field1583[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1615[var51] = -1;
                    this.field1583[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1579[var51] = var6.method2292();
            }
            if (var14 == 1) {
                this.field1580[var51] = var7.method2292();
            }
            if (var15 == 1) {
                this.field1584[var51] = var8.method2291();
            }
        }
        var4.field1823 = var25;
        var5.field1823 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2291();
            if (var58 == 1) {
                var53 = var4.method2172() + var56;
                var54 = var4.method2172() + var53;
                var55 = var4.method2172() + var54;
                var56 = var55;
                this.field1575[var57] = var53;
                this.field1576[var57] = var54;
                this.field1577[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2172() + var56;
                var56 = var55;
                this.field1575[var57] = var53;
                this.field1576[var57] = var54;
                this.field1577[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2172() + var56;
                var56 = var55;
                this.field1575[var57] = var53;
                this.field1576[var57] = var54;
                this.field1577[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2172() + var56;
                var56 = var55;
                this.field1575[var57] = var53;
                this.field1576[var57] = var61;
                this.field1577[var57] = var55;
            }
        }
        var4.field1823 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1607[var62] = 0;
            this.field1587[var62] = (short) var4.method2163();
            this.field1602[var62] = (short) var4.method2163();
            this.field1589[var62] = (short) var4.method2163();
        }
        if (this.field1615 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1615[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1587[var65] & 0xFFFF) == this.field1575[var64] && (this.field1602[var65] & 0xFFFF) == this.field1576[var64] && (this.field1589[var65] & 0xFFFF) == this.field1577[var64]) {
                        this.field1615[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1615 = null;
            }
        }
        if (!var3) {
            this.field1583 = null;
        }
        if (!var2) {
            this.field1585 = null;
        }
    }

    public class94(class94[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1601 = 0;
        this.field1574 = 0;
        this.field1590 = 0;
        this.field1605 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class94 var10 = arg0[var9];
            if (var10 != null) {
                this.field1601 += var10.field1601;
                this.field1574 += var10.field1574;
                this.field1590 += var10.field1590;
                if (var10.field1579 == null) {
                    if (this.field1605 == -1) {
                        this.field1605 = var10.field1605;
                    }
                    if (this.field1605 != var10.field1605) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1585 != null;
                var5 |= var10.field1580 != null;
                var6 |= var10.field1584 != null;
                var7 |= var10.field1583 != null;
                var8 |= var10.field1615 != null;
            }
        }
        this.field1598 = new int[this.field1601];
        this.field1570 = new int[this.field1601];
        this.field1581 = new int[this.field1601];
        this.field1597 = new int[this.field1601];
        this.field1575 = new int[this.field1574];
        this.field1576 = new int[this.field1574];
        this.field1577 = new int[this.field1574];
        if (var3) {
            this.field1585 = new byte[this.field1574];
        }
        if (var4) {
            this.field1579 = new byte[this.field1574];
        }
        if (var5) {
            this.field1580 = new byte[this.field1574];
        }
        if (var6) {
            this.field1584 = new int[this.field1574];
        }
        if (var7) {
            this.field1583 = new short[this.field1574];
        }
        if (var8) {
            this.field1615 = new byte[this.field1574];
        }
        this.field1572 = new short[this.field1574];
        if (this.field1590 > 0) {
            this.field1607 = new byte[this.field1590];
            this.field1587 = new short[this.field1590];
            this.field1602 = new short[this.field1590];
            this.field1589 = new short[this.field1590];
            this.field1582 = new short[this.field1590];
            this.field1591 = new short[this.field1590];
            this.field1571 = new short[this.field1590];
            this.field1593 = new short[this.field1590];
            this.field1596 = new byte[this.field1590];
            this.field1594 = new short[this.field1590];
            this.field1595 = new short[this.field1590];
        }
        this.field1601 = 0;
        this.field1574 = 0;
        this.field1590 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class94 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1574; var13++) {
                    if (var3 && var12.field1585 != null) {
                        this.field1585[this.field1574] = var12.field1585[var13];
                    }
                    if (var4) {
                        if (var12.field1579 == null) {
                            this.field1579[this.field1574] = var12.field1605;
                        } else {
                            this.field1579[this.field1574] = var12.field1579[var13];
                        }
                    }
                    if (var5 && var12.field1580 != null) {
                        this.field1580[this.field1574] = var12.field1580[var13];
                    }
                    if (var6 && var12.field1584 != null) {
                        this.field1584[this.field1574] = var12.field1584[var13];
                    }
                    if (var7) {
                        if (var12.field1583 == null) {
                            this.field1583[this.field1574] = -1;
                        } else {
                            this.field1583[this.field1574] = var12.field1583[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1615 == null || var12.field1615[var13] == -1) {
                            this.field1615[this.field1574] = -1;
                        } else {
                            this.field1615[this.field1574] = (byte) (var12.field1615[var13] + this.field1590);
                        }
                    }
                    this.field1572[this.field1574] = var12.field1572[var13];
                    this.field1575[this.field1574] = this.method1898(var12, var12.field1575[var13]);
                    this.field1576[this.field1574] = this.method1898(var12, var12.field1576[var13]);
                    this.field1577[this.field1574] = this.method1898(var12, var12.field1577[var13]);
                    this.field1574++;
                }
                for (int var14 = 0; var14 < var12.field1590; var14++) {
                    byte var15 = this.field1607[this.field1590] = var12.field1607[var14];
                    if (var15 == 0) {
                        this.field1587[this.field1590] = (short) this.method1898(var12, var12.field1587[var14]);
                        this.field1602[this.field1590] = (short) this.method1898(var12, var12.field1602[var14]);
                        this.field1589[this.field1590] = (short) this.method1898(var12, var12.field1589[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1587[this.field1590] = var12.field1587[var14];
                        this.field1602[this.field1590] = var12.field1602[var14];
                        this.field1589[this.field1590] = var12.field1589[var14];
                        this.field1582[this.field1590] = var12.field1582[var14];
                        this.field1591[this.field1590] = var12.field1591[var14];
                        this.field1571[this.field1590] = var12.field1571[var14];
                        this.field1593[this.field1590] = var12.field1593[var14];
                        this.field1596[this.field1590] = var12.field1596[var14];
                        this.field1594[this.field1590] = var12.field1594[var14];
                    }
                    if (var15 == 2) {
                        this.field1595[this.field1590] = var12.field1595[var14];
                    }
                    this.field1590++;
                }
            }
        }
    }

    @ObfuscatedName("cm.w(Lcm;I)I")
    public final int method1898(class94 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1598[arg1];
        int var5 = arg0.field1570[arg1];
        int var6 = arg0.field1581[arg1];
        for (int var7 = 0; var7 < this.field1601; var7++) {
            if (this.field1598[var7] == var4 && this.field1570[var7] == var5 && this.field1581[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1598[this.field1601] = var4;
            this.field1570[this.field1601] = var5;
            this.field1581[this.field1601] = var6;
            if (arg0.field1597 != null) {
                this.field1597[this.field1601] = arg0.field1597[arg1];
            }
            var3 = this.field1601++;
        }
        return var3;
    }

    public class94(class94 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1601 = arg0.field1601;
        this.field1574 = arg0.field1574;
        this.field1590 = arg0.field1590;
        if (arg1) {
            this.field1598 = arg0.field1598;
            this.field1570 = arg0.field1570;
            this.field1581 = arg0.field1581;
        } else {
            this.field1598 = new int[this.field1601];
            this.field1570 = new int[this.field1601];
            this.field1581 = new int[this.field1601];
            for (int var6 = 0; var6 < this.field1601; var6++) {
                this.field1598[var6] = arg0.field1598[var6];
                this.field1570[var6] = arg0.field1570[var6];
                this.field1581[var6] = arg0.field1581[var6];
            }
        }
        if (arg2) {
            this.field1572 = arg0.field1572;
        } else {
            this.field1572 = new short[this.field1574];
            for (int var7 = 0; var7 < this.field1574; var7++) {
                this.field1572[var7] = arg0.field1572[var7];
            }
        }
        if (arg3 || arg0.field1583 == null) {
            this.field1583 = arg0.field1583;
        } else {
            this.field1583 = new short[this.field1574];
            for (int var8 = 0; var8 < this.field1574; var8++) {
                this.field1583[var8] = arg0.field1583[var8];
            }
        }
        if (arg4) {
            this.field1580 = arg0.field1580;
        } else {
            this.field1580 = new byte[this.field1574];
            if (arg0.field1580 == null) {
                for (int var9 = 0; var9 < this.field1574; var9++) {
                    this.field1580[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1574; var10++) {
                    this.field1580[var10] = arg0.field1580[var10];
                }
            }
        }
        this.field1575 = arg0.field1575;
        this.field1576 = arg0.field1576;
        this.field1577 = arg0.field1577;
        this.field1585 = arg0.field1585;
        this.field1579 = arg0.field1579;
        this.field1615 = arg0.field1615;
        this.field1605 = arg0.field1605;
        this.field1607 = arg0.field1607;
        this.field1587 = arg0.field1587;
        this.field1602 = arg0.field1602;
        this.field1589 = arg0.field1589;
        this.field1582 = arg0.field1582;
        this.field1591 = arg0.field1591;
        this.field1571 = arg0.field1571;
        this.field1593 = arg0.field1593;
        this.field1596 = arg0.field1596;
        this.field1594 = arg0.field1594;
        this.field1595 = arg0.field1595;
        this.field1597 = arg0.field1597;
        this.field1584 = arg0.field1584;
        this.field1599 = arg0.field1599;
        this.field1600 = arg0.field1600;
        this.field1573 = arg0.field1573;
        this.field1586 = arg0.field1586;
        this.field1603 = arg0.field1603;
        this.field1604 = arg0.field1604;
        this.field1592 = arg0.field1592;
    }

    @ObfuscatedName("cm.c()Lcm;")
    public class94 method1900() {
        class94 var1 = new class94();
        if (this.field1585 != null) {
            var1.field1585 = new byte[this.field1574];
            for (int var2 = 0; var2 < this.field1574; var2++) {
                var1.field1585[var2] = this.field1585[var2];
            }
        }
        var1.field1601 = this.field1601;
        var1.field1574 = this.field1574;
        var1.field1590 = this.field1590;
        var1.field1598 = this.field1598;
        var1.field1570 = this.field1570;
        var1.field1581 = this.field1581;
        var1.field1575 = this.field1575;
        var1.field1576 = this.field1576;
        var1.field1577 = this.field1577;
        var1.field1579 = this.field1579;
        var1.field1580 = this.field1580;
        var1.field1615 = this.field1615;
        var1.field1572 = this.field1572;
        var1.field1583 = this.field1583;
        var1.field1605 = this.field1605;
        var1.field1607 = this.field1607;
        var1.field1587 = this.field1587;
        var1.field1602 = this.field1602;
        var1.field1589 = this.field1589;
        var1.field1582 = this.field1582;
        var1.field1591 = this.field1591;
        var1.field1571 = this.field1571;
        var1.field1593 = this.field1593;
        var1.field1596 = this.field1596;
        var1.field1594 = this.field1594;
        var1.field1595 = this.field1595;
        var1.field1597 = this.field1597;
        var1.field1584 = this.field1584;
        var1.field1599 = this.field1599;
        var1.field1600 = this.field1600;
        var1.field1573 = this.field1573;
        var1.field1586 = this.field1586;
        var1.field1604 = this.field1604;
        var1.field1592 = this.field1592;
        return var1;
    }

    @ObfuscatedName("cm.x([[IIIIZI)Lcm;")
    public class94 method1901(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1977();
        int var7 = this.field1608 + arg1;
        int var8 = this.field1616 + arg1;
        int var9 = this.field1611 + arg3;
        int var10 = this.field1610 + arg3;
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
            var15.field1601 = this.field1601;
            var15.field1574 = this.field1574;
            var15.field1590 = this.field1590;
            var15.field1598 = this.field1598;
            var15.field1581 = this.field1581;
            var15.field1575 = this.field1575;
            var15.field1576 = this.field1576;
            var15.field1577 = this.field1577;
            var15.field1585 = this.field1585;
            var15.field1579 = this.field1579;
            var15.field1580 = this.field1580;
            var15.field1615 = this.field1615;
            var15.field1572 = this.field1572;
            var15.field1583 = this.field1583;
            var15.field1605 = this.field1605;
            var15.field1607 = this.field1607;
            var15.field1587 = this.field1587;
            var15.field1602 = this.field1602;
            var15.field1589 = this.field1589;
            var15.field1582 = this.field1582;
            var15.field1591 = this.field1591;
            var15.field1571 = this.field1571;
            var15.field1593 = this.field1593;
            var15.field1596 = this.field1596;
            var15.field1594 = this.field1594;
            var15.field1595 = this.field1595;
            var15.field1597 = this.field1597;
            var15.field1584 = this.field1584;
            var15.field1599 = this.field1599;
            var15.field1600 = this.field1600;
            var15.field1604 = this.field1604;
            var15.field1592 = this.field1592;
            var15.field1570 = new int[var15.field1601];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1601; var16++) {
                int var17 = this.field1598[var16] + arg1;
                int var18 = this.field1581[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1570[var16] = this.field1570[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1601; var26++) {
                int var27 = (-this.field1570[var26] << 16) / this.field1340;
                if (var27 < arg5) {
                    int var28 = this.field1598[var26] + arg1;
                    int var29 = this.field1581[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1570[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1570[var26];
                }
            }
        }
        var15.method1912();
        return var15;
    }

    @ObfuscatedName("cm.f()V")
    public void method1965() {
        int var10002;
        if (this.field1597 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1601; var3++) {
                int var4 = this.field1597[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1599 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1599[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1601) {
                int var7 = this.field1597[var6];
                this.field1599[var7][var1[var7]++] = var6++;
            }
            this.field1597 = null;
        }
        if (this.field1584 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1574; var10++) {
            int var11 = this.field1584[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1600 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1600[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1574) {
            int var14 = this.field1584[var13];
            this.field1600[var14][var8[var14]++] = var13++;
        }
        this.field1584 = null;
    }

    @ObfuscatedName("cm.t()V")
    public void method1925() {
        for (int var1 = 0; var1 < this.field1601; var1++) {
            int var2 = this.field1598[var1];
            this.field1598[var1] = this.field1581[var1];
            this.field1581[var1] = -var2;
        }
        this.method1912();
    }

    @ObfuscatedName("cm.n()V")
    public void method1904() {
        for (int var1 = 0; var1 < this.field1601; var1++) {
            this.field1598[var1] = -this.field1598[var1];
            this.field1581[var1] = -this.field1581[var1];
        }
        this.method1912();
    }

    @ObfuscatedName("cm.p()V")
    public void method1905() {
        for (int var1 = 0; var1 < this.field1601; var1++) {
            int var2 = this.field1581[var1];
            this.field1581[var1] = this.field1598[var1];
            this.field1598[var1] = -var2;
        }
        this.method1912();
    }

    @ObfuscatedName("cm.u(I)V")
    public void method1962(int arg0) {
        int var2 = field1588[arg0];
        int var3 = field1578[arg0];
        for (int var4 = 0; var4 < this.field1601; var4++) {
            int var5 = this.field1598[var4] * var3 + this.field1581[var4] * var2 >> 16;
            this.field1581[var4] = this.field1581[var4] * var3 - this.field1598[var4] * var2 >> 16;
            this.field1598[var4] = var5;
        }
        this.method1912();
    }

    @ObfuscatedName("cm.s(III)V")
    public void method1907(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1601; var4++) {
            this.field1598[var4] += arg0;
            this.field1570[var4] += arg1;
            this.field1581[var4] += arg2;
        }
        this.method1912();
    }

    @ObfuscatedName("cm.i(SS)V")
    public void method1908(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1574; var3++) {
            if (this.field1572[var3] == arg0) {
                this.field1572[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cm.e(SS)V")
    public void method1899(short arg0, short arg1) {
        if (this.field1583 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1574; var3++) {
            if (this.field1583[var3] == arg0) {
                this.field1583[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cm.h()V")
    public void method1910() {
        for (int var1 = 0; var1 < this.field1601; var1++) {
            this.field1581[var1] = -this.field1581[var1];
        }
        for (int var2 = 0; var2 < this.field1574; var2++) {
            int var3 = this.field1575[var2];
            this.field1575[var2] = this.field1577[var2];
            this.field1577[var2] = var3;
        }
        this.method1912();
    }

    @ObfuscatedName("cm.k(III)V")
    public void method1894(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1601; var4++) {
            this.field1598[var4] = this.field1598[var4] * arg0 / 128;
            this.field1570[var4] = this.field1570[var4] * arg1 / 128;
            this.field1581[var4] = this.field1581[var4] * arg2 / 128;
        }
        this.method1912();
    }

    @ObfuscatedName("cm.v()V")
    public void method1931() {
        if (this.field1573 != null) {
            return;
        }
        this.field1573 = new class90[this.field1601];
        for (int var1 = 0; var1 < this.field1601; var1++) {
            this.field1573[var1] = new class90();
        }
        for (int var2 = 0; var2 < this.field1574; var2++) {
            int var3 = this.field1575[var2];
            int var4 = this.field1576[var2];
            int var5 = this.field1577[var2];
            int var6 = this.field1598[var4] - this.field1598[var3];
            int var7 = this.field1570[var4] - this.field1570[var3];
            int var8 = this.field1581[var4] - this.field1581[var3];
            int var9 = this.field1598[var5] - this.field1598[var3];
            int var10 = this.field1570[var5] - this.field1570[var3];
            int var11 = this.field1581[var5] - this.field1581[var3];
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
            if (this.field1585 == null) {
                var19 = 0;
            } else {
                var19 = this.field1585[var2];
            }
            if (var19 == 0) {
                class90 var20 = this.field1573[var3];
                var20.field1505 += var16;
                var20.field1512 += var17;
                var20.field1506 += var18;
                var20.field1507++;
                class90 var21 = this.field1573[var4];
                var21.field1505 += var16;
                var21.field1512 += var17;
                var21.field1506 += var18;
                var21.field1507++;
                class90 var22 = this.field1573[var5];
                var22.field1505 += var16;
                var22.field1512 += var17;
                var22.field1506 += var18;
                var22.field1507++;
            } else if (var19 == 1) {
                if (this.field1586 == null) {
                    this.field1586 = new class78[this.field1574];
                }
                class78 var23 = this.field1586[var2] = new class78();
                var23.field1329 = var16;
                var23.field1330 = var17;
                var23.field1331 = var18;
            }
        }
    }

    @ObfuscatedName("cm.m()V")
    public void method1912() {
        this.field1573 = null;
        this.field1603 = null;
        this.field1586 = null;
        this.field1606 = false;
    }

    @ObfuscatedName("cm.d()V")
    public void method1977() {
        if (this.field1606) {
            return;
        }
        this.field1340 = 0;
        this.field1609 = 0;
        this.field1608 = 999999;
        this.field1616 = -999999;
        this.field1610 = -99999;
        this.field1611 = 99999;
        for (int var1 = 0; var1 < this.field1601; var1++) {
            int var2 = this.field1598[var1];
            int var3 = this.field1570[var1];
            int var4 = this.field1581[var1];
            if (var2 < this.field1608) {
                this.field1608 = var2;
            }
            if (var2 > this.field1616) {
                this.field1616 = var2;
            }
            if (var4 < this.field1611) {
                this.field1611 = var4;
            }
            if (var4 > this.field1610) {
                this.field1610 = var4;
            }
            if (-var3 > this.field1340) {
                this.field1340 = -var3;
            }
            if (var3 > this.field1609) {
                this.field1609 = var3;
            }
        }
        this.field1606 = true;
    }

    @ObfuscatedName("cm.q(Lcm;Lcm;IIIZ)V")
    public static void method1959(class94 arg0, class94 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1977();
        arg0.method1931();
        arg1.method1977();
        arg1.method1931();
        field1614++;
        int var6 = 0;
        int[] var7 = arg1.field1598;
        int var8 = arg1.field1601;
        for (int var9 = 0; var9 < arg0.field1601; var9++) {
            class90 var10 = arg0.field1573[var9];
            if (var10.field1507 != 0) {
                int var11 = arg0.field1570[var9] - arg3;
                if (var11 <= arg1.field1609) {
                    int var12 = arg0.field1598[var9] - arg2;
                    if (var12 >= arg1.field1608 && var12 <= arg1.field1616) {
                        int var13 = arg0.field1581[var9] - arg4;
                        if (var13 >= arg1.field1611 && var13 <= arg1.field1610) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class90 var15 = arg1.field1573[var14];
                                if (var7[var14] == var12 && arg1.field1581[var14] == var13 && arg1.field1570[var14] == var11 && var15.field1507 != 0) {
                                    if (arg0.field1603 == null) {
                                        arg0.field1603 = new class90[arg0.field1601];
                                    }
                                    if (arg1.field1603 == null) {
                                        arg1.field1603 = new class90[var8];
                                    }
                                    class90 var16 = arg0.field1603[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1603[var9] = new class90(var10);
                                    }
                                    class90 var17 = arg1.field1603[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1603[var14] = new class90(var15);
                                    }
                                    var16.field1505 += var15.field1505;
                                    var16.field1512 += var15.field1512;
                                    var16.field1506 += var15.field1506;
                                    var16.field1507 += var15.field1507;
                                    var17.field1505 += var10.field1505;
                                    var17.field1512 += var10.field1512;
                                    var17.field1506 += var10.field1506;
                                    var17.field1507 += var10.field1507;
                                    var6++;
                                    field1612[var9] = field1614;
                                    field1613[var14] = field1614;
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
        for (int var18 = 0; var18 < arg0.field1574; var18++) {
            if (field1612[arg0.field1575[var18]] == field1614 && field1612[arg0.field1576[var18]] == field1614 && field1612[arg0.field1577[var18]] == field1614) {
                if (arg0.field1585 == null) {
                    arg0.field1585 = new byte[arg0.field1574];
                }
                arg0.field1585[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1574; var19++) {
            if (field1613[arg1.field1575[var19]] == field1614 && field1613[arg1.field1576[var19]] == field1614 && field1613[arg1.field1577[var19]] == field1614) {
                if (arg1.field1585 == null) {
                    arg1.field1585 = new byte[arg1.field1574];
                }
                arg1.field1585[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cm.ak(IIIII)Lck;")
    public final class99 method1915(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1931();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class99 var8 = new class99();
        var8.field1689 = new int[this.field1574];
        var8.field1699 = new int[this.field1574];
        var8.field1687 = new int[this.field1574];
        if (this.field1590 > 0 && this.field1615 != null) {
            int[] var9 = new int[this.field1590];
            for (int var10 = 0; var10 < this.field1574; var10++) {
                if (this.field1615[var10] != -1) {
                    var9[this.field1615[var10] & 0xFF]++;
                }
            }
            var8.field1726 = 0;
            for (int var11 = 0; var11 < this.field1590; var11++) {
                if (var9[var11] > 0 && this.field1607[var11] == 0) {
                    var8.field1726++;
                }
            }
            var8.field1698 = new int[var8.field1726];
            var8.field1694 = new int[var8.field1726];
            var8.field1700 = new int[var8.field1726];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1590; var13++) {
                if (var9[var13] > 0 && this.field1607[var13] == 0) {
                    var8.field1698[var12] = this.field1587[var13] & 0xFFFF;
                    var8.field1694[var12] = this.field1602[var13] & 0xFFFF;
                    var8.field1700[var12] = this.field1589[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1697 = new byte[this.field1574];
            for (int var14 = 0; var14 < this.field1574; var14++) {
                if (this.field1615[var14] == -1) {
                    var8.field1697[var14] = -1;
                } else {
                    var8.field1697[var14] = (byte) var9[this.field1615[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1574; var15++) {
            byte var16;
            if (this.field1585 == null) {
                var16 = 0;
            } else {
                var16 = this.field1585[var15];
            }
            byte var17;
            if (this.field1580 == null) {
                var17 = 0;
            } else {
                var17 = this.field1580[var15];
            }
            short var18;
            if (this.field1583 == null) {
                var18 = -1;
            } else {
                var18 = this.field1583[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1572[var15] & 0xFFFF;
                    class90 var20;
                    if (this.field1603 == null || this.field1603[this.field1575[var15]] == null) {
                        var20 = this.field1573[this.field1575[var15]];
                    } else {
                        var20 = this.field1603[this.field1575[var15]];
                    }
                    int var21 = (var20.field1506 * arg4 + var20.field1512 * arg3 + var20.field1505 * arg2) / (var20.field1507 * var7) + arg0;
                    var8.field1689[var15] = method1916(var19, var21);
                    class90 var22;
                    if (this.field1603 == null || this.field1603[this.field1576[var15]] == null) {
                        var22 = this.field1573[this.field1576[var15]];
                    } else {
                        var22 = this.field1603[this.field1576[var15]];
                    }
                    int var23 = (var22.field1506 * arg4 + var22.field1512 * arg3 + var22.field1505 * arg2) / (var22.field1507 * var7) + arg0;
                    var8.field1699[var15] = method1916(var19, var23);
                    class90 var24;
                    if (this.field1603 == null || this.field1603[this.field1577[var15]] == null) {
                        var24 = this.field1573[this.field1577[var15]];
                    } else {
                        var24 = this.field1603[this.field1577[var15]];
                    }
                    int var25 = (var24.field1506 * arg4 + var24.field1512 * arg3 + var24.field1505 * arg2) / (var24.field1507 * var7) + arg0;
                    var8.field1687[var15] = method1916(var19, var25);
                } else if (var16 == 1) {
                    class78 var26 = this.field1586[var15];
                    int var27 = (var26.field1331 * arg4 + var26.field1330 * arg3 + var26.field1329 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1689[var15] = method1916(this.field1572[var15] & 0xFFFF, var27);
                    var8.field1687[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1689[var15] = 128;
                    var8.field1687[var15] = -1;
                } else {
                    var8.field1687[var15] = -2;
                }
            } else if (var16 == 0) {
                class90 var28;
                if (this.field1603 == null || this.field1603[this.field1575[var15]] == null) {
                    var28 = this.field1573[this.field1575[var15]];
                } else {
                    var28 = this.field1603[this.field1575[var15]];
                }
                int var29 = (var28.field1506 * arg4 + var28.field1512 * arg3 + var28.field1505 * arg2) / (var28.field1507 * var7) + arg0;
                var8.field1689[var15] = method1917(var29);
                class90 var30;
                if (this.field1603 == null || this.field1603[this.field1576[var15]] == null) {
                    var30 = this.field1573[this.field1576[var15]];
                } else {
                    var30 = this.field1603[this.field1576[var15]];
                }
                int var31 = (var30.field1506 * arg4 + var30.field1512 * arg3 + var30.field1505 * arg2) / (var30.field1507 * var7) + arg0;
                var8.field1699[var15] = method1917(var31);
                class90 var32;
                if (this.field1603 == null || this.field1603[this.field1577[var15]] == null) {
                    var32 = this.field1573[this.field1577[var15]];
                } else {
                    var32 = this.field1603[this.field1577[var15]];
                }
                int var33 = (var32.field1506 * arg4 + var32.field1512 * arg3 + var32.field1505 * arg2) / (var32.field1507 * var7) + arg0;
                var8.field1687[var15] = method1917(var33);
            } else if (var16 == 1) {
                class78 var34 = this.field1586[var15];
                int var35 = (var34.field1331 * arg4 + var34.field1330 * arg3 + var34.field1329 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1689[var15] = method1917(var35);
                var8.field1687[var15] = -1;
            } else {
                var8.field1687[var15] = -2;
            }
        }
        this.method1965();
        var8.field1681 = this.field1601;
        var8.field1680 = this.field1598;
        var8.field1683 = this.field1570;
        var8.field1684 = this.field1581;
        var8.field1685 = this.field1574;
        var8.field1686 = this.field1575;
        var8.field1729 = this.field1576;
        var8.field1688 = this.field1577;
        var8.field1692 = this.field1579;
        var8.field1709 = this.field1580;
        var8.field1704 = this.field1605;
        var8.field1701 = this.field1599;
        var8.field1702 = this.field1600;
        var8.field1690 = this.field1583;
        return var8;
    }

    @ObfuscatedName("cm.ah(II)I")
    public static final int method1916(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cm.an(I)I")
    public static final int method1917(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
