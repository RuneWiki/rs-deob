package deob;

@ObfuscatedName("cr")
public class class95 extends class80 {

    @ObfuscatedName("cr.e")
    public int field1593 = 0;

    @ObfuscatedName("cr.a")
    public int[] field1564;

    @ObfuscatedName("cr.l")
    public int[] field1565;

    @ObfuscatedName("cr.c")
    public int[] field1566;

    @ObfuscatedName("cr.u")
    public int field1586 = 0;

    @ObfuscatedName("cr.w")
    public int[] field1605;

    @ObfuscatedName("cr.i")
    public int[] field1583;

    @ObfuscatedName("cr.r")
    public int[] field1568;

    @ObfuscatedName("cr.f")
    public byte[] field1591;

    @ObfuscatedName("cr.g")
    public byte[] field1572;

    @ObfuscatedName("cr.o")
    public byte[] field1571;

    @ObfuscatedName("cr.h")
    public byte[] field1563;

    @ObfuscatedName("cr.s")
    public short[] field1575;

    @ObfuscatedName("cr.j")
    public short[] field1576;

    @ObfuscatedName("cr.m")
    public byte field1590 = 0;

    @ObfuscatedName("cr.t")
    public int field1589;

    @ObfuscatedName("cr.z")
    public byte[] field1579;

    @ObfuscatedName("cr.y")
    public short[] field1580;

    @ObfuscatedName("cr.q")
    public short[] field1581;

    @ObfuscatedName("cr.d")
    public short[] field1582;

    @ObfuscatedName("cr.b")
    public short[] field1603;

    @ObfuscatedName("cr.x")
    public short[] field1584;

    @ObfuscatedName("cr.n")
    public short[] field1585;

    @ObfuscatedName("cr.v")
    public short[] field1574;

    @ObfuscatedName("cr.p")
    public short[] field1587;

    @ObfuscatedName("cr.k")
    public short[] field1588;

    @ObfuscatedName("cr.ax")
    public byte[] field1577;

    @ObfuscatedName("cr.ap")
    public int[] field1595;

    @ObfuscatedName("cr.ao")
    public int[] field1570;

    @ObfuscatedName("cr.ai")
    public int[][] field1592;

    @ObfuscatedName("cr.aw")
    public int[][] field1569;

    @ObfuscatedName("cr.am")
    public class79[] field1594;

    @ObfuscatedName("cr.au")
    public class91[] field1567;

    @ObfuscatedName("cr.ae")
    public class91[] field1596;

    @ObfuscatedName("cr.ab")
    public short field1597;

    @ObfuscatedName("cr.av")
    public short field1598;

    @ObfuscatedName("cr.ay")
    public boolean field1599 = false;

    @ObfuscatedName("cr.ag")
    public int field1600;

    @ObfuscatedName("cr.aj")
    public int field1601;

    @ObfuscatedName("cr.ah")
    public int field1602;

    @ObfuscatedName("cr.at")
    public int field1607;

    @ObfuscatedName("cr.al")
    public int field1604;

    @ObfuscatedName("cr.ak")
    public static int[] field1578 = new int[10000];

    @ObfuscatedName("cr.ar")
    public static int[] field1606 = new int[10000];

    @ObfuscatedName("cr.aq")
    public static int field1573 = 0;

    @ObfuscatedName("cr.ac")
    public static int[] field1608 = class86.field1449;

    @ObfuscatedName("cr.ad")
    public static int[] field1609 = class86.field1440;

    public class95() {
    }

    @ObfuscatedName("cr.e(Lfv;II)Lcr;")
    public static class95 method1937(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2843(arg1, arg2);
        return var3 == null ? null : new class95(var3);
    }

    public class95(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1986(arg0);
        } else {
            this.method1939(arg0);
        }
    }

    @ObfuscatedName("cr.l([B)V")
    public void method1986(byte[] arg0) {
        class111 var2 = new class111(arg0);
        class111 var3 = new class111(arg0);
        class111 var4 = new class111(arg0);
        class111 var5 = new class111(arg0);
        class111 var6 = new class111(arg0);
        class111 var7 = new class111(arg0);
        class111 var8 = new class111(arg0);
        var2.field1834 = arg0.length - 23;
        int var9 = var2.method2178();
        int var10 = var2.method2178();
        int var11 = var2.method2176();
        int var12 = var2.method2176();
        int var13 = var2.method2176();
        int var14 = var2.method2176();
        int var15 = var2.method2176();
        int var16 = var2.method2176();
        int var17 = var2.method2176();
        int var18 = var2.method2178();
        int var19 = var2.method2178();
        int var20 = var2.method2178();
        int var21 = var2.method2178();
        int var22 = var2.method2178();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1579 = new byte[var11];
            var2.field1834 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1579[var26] = var2.method2162();
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
        this.field1593 = var9;
        this.field1586 = var10;
        this.field1589 = var11;
        this.field1564 = new int[var9];
        this.field1565 = new int[var9];
        this.field1566 = new int[var9];
        this.field1605 = new int[var10];
        this.field1583 = new int[var10];
        this.field1568 = new int[var10];
        if (var17 == 1) {
            this.field1595 = new int[var9];
        }
        if (var12 == 1) {
            this.field1591 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1572 = new byte[var10];
        } else {
            this.field1590 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1571 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1570 = new int[var10];
        }
        if (var16 == 1) {
            this.field1576 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1563 = new byte[var10];
        }
        this.field1575 = new short[var10];
        if (var11 > 0) {
            this.field1580 = new short[var11];
            this.field1581 = new short[var11];
            this.field1582 = new short[var11];
            if (var24 > 0) {
                this.field1603 = new short[var24];
                this.field1584 = new short[var24];
                this.field1585 = new short[var24];
                this.field1574 = new short[var24];
                this.field1577 = new byte[var24];
                this.field1587 = new short[var24];
            }
            if (var25 > 0) {
                this.field1588 = new short[var25];
            }
        }
        var2.field1834 = var11;
        var3.field1834 = var44;
        var4.field1834 = var46;
        var5.field1834 = var48;
        var6.field1834 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2176();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2332();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2332();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2332();
            }
            this.field1564[var67] = var64 + var69;
            this.field1565[var67] = var65 + var70;
            this.field1566[var67] = var66 + var71;
            var64 = this.field1564[var67];
            var65 = this.field1565[var67];
            var66 = this.field1566[var67];
            if (var17 == 1) {
                this.field1595[var67] = var6.method2176();
            }
        }
        var2.field1834 = var42;
        var3.field1834 = var31;
        var4.field1834 = var34;
        var5.field1834 = var37;
        var6.field1834 = var35;
        var7.field1834 = var40;
        var8.field1834 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1575[var72] = (short) var2.method2178();
            if (var12 == 1) {
                this.field1591[var72] = var3.method2162();
            }
            if (var13 == 255) {
                this.field1572[var72] = var4.method2162();
            }
            if (var14 == 1) {
                this.field1571[var72] = var5.method2162();
            }
            if (var15 == 1) {
                this.field1570[var72] = var6.method2176();
            }
            if (var16 == 1) {
                this.field1576[var72] = (short) (var7.method2178() - 1);
            }
            if (this.field1563 != null && this.field1576[var72] != -1) {
                this.field1563[var72] = (byte) (var8.method2176() - 1);
            }
        }
        var2.field1834 = var33;
        var3.field1834 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2176();
            if (var78 == 1) {
                var73 = var2.method2332() + var76;
                var74 = var2.method2332() + var73;
                var75 = var2.method2332() + var74;
                var76 = var75;
                this.field1605[var77] = var73;
                this.field1583[var77] = var74;
                this.field1568[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2332() + var76;
                var76 = var75;
                this.field1605[var77] = var73;
                this.field1583[var77] = var74;
                this.field1568[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2332() + var76;
                var76 = var75;
                this.field1605[var77] = var73;
                this.field1583[var77] = var74;
                this.field1568[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2332() + var76;
                var76 = var75;
                this.field1605[var77] = var73;
                this.field1583[var77] = var81;
                this.field1568[var77] = var75;
            }
        }
        var2.field1834 = var50;
        var3.field1834 = var52;
        var4.field1834 = var54;
        var5.field1834 = var56;
        var6.field1834 = var58;
        var7.field1834 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1579[var82] & 0xFF;
            if (var83 == 0) {
                this.field1580[var82] = (short) var2.method2178();
                this.field1581[var82] = (short) var2.method2178();
                this.field1582[var82] = (short) var2.method2178();
            }
            if (var83 == 1) {
                this.field1580[var82] = (short) var3.method2178();
                this.field1581[var82] = (short) var3.method2178();
                this.field1582[var82] = (short) var3.method2178();
                this.field1603[var82] = (short) var4.method2178();
                this.field1584[var82] = (short) var4.method2178();
                this.field1585[var82] = (short) var4.method2178();
                this.field1574[var82] = (short) var5.method2178();
                this.field1577[var82] = var6.method2162();
                this.field1587[var82] = (short) var7.method2178();
            }
            if (var83 == 2) {
                this.field1580[var82] = (short) var3.method2178();
                this.field1581[var82] = (short) var3.method2178();
                this.field1582[var82] = (short) var3.method2178();
                this.field1603[var82] = (short) var4.method2178();
                this.field1584[var82] = (short) var4.method2178();
                this.field1585[var82] = (short) var4.method2178();
                this.field1574[var82] = (short) var5.method2178();
                this.field1577[var82] = var6.method2162();
                this.field1587[var82] = (short) var7.method2178();
                this.field1588[var82] = (short) var7.method2178();
            }
            if (var83 == 3) {
                this.field1580[var82] = (short) var3.method2178();
                this.field1581[var82] = (short) var3.method2178();
                this.field1582[var82] = (short) var3.method2178();
                this.field1603[var82] = (short) var4.method2178();
                this.field1584[var82] = (short) var4.method2178();
                this.field1585[var82] = (short) var4.method2178();
                this.field1574[var82] = (short) var5.method2178();
                this.field1577[var82] = var6.method2162();
                this.field1587[var82] = (short) var7.method2178();
            }
        }
        var2.field1834 = var62;
        int var84 = var2.method2176();
        if (var84 == 0) {
            return;
        }
        new class85();
        var2.method2178();
        var2.method2178();
        var2.method2178();
        var2.method2378();
    }

    @ObfuscatedName("cr.c([B)V")
    public void method1939(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class111 var4 = new class111(arg0);
        class111 var5 = new class111(arg0);
        class111 var6 = new class111(arg0);
        class111 var7 = new class111(arg0);
        class111 var8 = new class111(arg0);
        var4.field1834 = arg0.length - 18;
        int var9 = var4.method2178();
        int var10 = var4.method2178();
        int var11 = var4.method2176();
        int var12 = var4.method2176();
        int var13 = var4.method2176();
        int var14 = var4.method2176();
        int var15 = var4.method2176();
        int var16 = var4.method2176();
        int var17 = var4.method2178();
        int var18 = var4.method2178();
        int var19 = var4.method2178();
        int var20 = var4.method2178();
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
        this.field1593 = var9;
        this.field1586 = var10;
        this.field1589 = var11;
        this.field1564 = new int[var9];
        this.field1565 = new int[var9];
        this.field1566 = new int[var9];
        this.field1605 = new int[var10];
        this.field1583 = new int[var10];
        this.field1568 = new int[var10];
        if (var11 > 0) {
            this.field1579 = new byte[var11];
            this.field1580 = new short[var11];
            this.field1581 = new short[var11];
            this.field1582 = new short[var11];
        }
        if (var16 == 1) {
            this.field1595 = new int[var9];
        }
        if (var12 == 1) {
            this.field1591 = new byte[var10];
            this.field1563 = new byte[var10];
            this.field1576 = new short[var10];
        }
        if (var13 == 255) {
            this.field1572 = new byte[var10];
        } else {
            this.field1590 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1571 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1570 = new int[var10];
        }
        this.field1575 = new short[var10];
        var4.field1834 = var21;
        var5.field1834 = var36;
        var6.field1834 = var38;
        var7.field1834 = var40;
        var8.field1834 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2176();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2332();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2332();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2332();
            }
            this.field1564[var46] = var43 + var48;
            this.field1565[var46] = var44 + var49;
            this.field1566[var46] = var45 + var50;
            var43 = this.field1564[var46];
            var44 = this.field1565[var46];
            var45 = this.field1566[var46];
            if (var16 == 1) {
                this.field1595[var46] = var8.method2176();
            }
        }
        var4.field1834 = var32;
        var5.field1834 = var28;
        var6.field1834 = var26;
        var7.field1834 = var30;
        var8.field1834 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1575[var51] = (short) var4.method2178();
            if (var12 == 1) {
                int var52 = var5.method2176();
                if ((var52 & 0x1) == 1) {
                    this.field1591[var51] = 1;
                    var2 = true;
                } else {
                    this.field1591[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1563[var51] = (byte) (var52 >> 2);
                    this.field1576[var51] = this.field1575[var51];
                    this.field1575[var51] = 127;
                    if (this.field1576[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1563[var51] = -1;
                    this.field1576[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1572[var51] = var6.method2162();
            }
            if (var14 == 1) {
                this.field1571[var51] = var7.method2162();
            }
            if (var15 == 1) {
                this.field1570[var51] = var8.method2176();
            }
        }
        var4.field1834 = var25;
        var5.field1834 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2176();
            if (var58 == 1) {
                var53 = var4.method2332() + var56;
                var54 = var4.method2332() + var53;
                var55 = var4.method2332() + var54;
                var56 = var55;
                this.field1605[var57] = var53;
                this.field1583[var57] = var54;
                this.field1568[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2332() + var56;
                var56 = var55;
                this.field1605[var57] = var53;
                this.field1583[var57] = var54;
                this.field1568[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2332() + var56;
                var56 = var55;
                this.field1605[var57] = var53;
                this.field1583[var57] = var54;
                this.field1568[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2332() + var56;
                var56 = var55;
                this.field1605[var57] = var53;
                this.field1583[var57] = var61;
                this.field1568[var57] = var55;
            }
        }
        var4.field1834 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1579[var62] = 0;
            this.field1580[var62] = (short) var4.method2178();
            this.field1581[var62] = (short) var4.method2178();
            this.field1582[var62] = (short) var4.method2178();
        }
        if (this.field1563 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1563[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1580[var65] & 0xFFFF) == this.field1605[var64] && (this.field1581[var65] & 0xFFFF) == this.field1583[var64] && (this.field1582[var65] & 0xFFFF) == this.field1568[var64]) {
                        this.field1563[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1563 = null;
            }
        }
        if (!var3) {
            this.field1576 = null;
        }
        if (!var2) {
            this.field1591 = null;
        }
    }

    public class95(class95[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1593 = 0;
        this.field1586 = 0;
        this.field1589 = 0;
        this.field1590 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class95 var10 = arg0[var9];
            if (var10 != null) {
                this.field1593 += var10.field1593;
                this.field1586 += var10.field1586;
                this.field1589 += var10.field1589;
                if (var10.field1572 == null) {
                    if (this.field1590 == -1) {
                        this.field1590 = var10.field1590;
                    }
                    if (this.field1590 != var10.field1590) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1591 != null;
                var5 |= var10.field1571 != null;
                var6 |= var10.field1570 != null;
                var7 |= var10.field1576 != null;
                var8 |= var10.field1563 != null;
            }
        }
        this.field1564 = new int[this.field1593];
        this.field1565 = new int[this.field1593];
        this.field1566 = new int[this.field1593];
        this.field1595 = new int[this.field1593];
        this.field1605 = new int[this.field1586];
        this.field1583 = new int[this.field1586];
        this.field1568 = new int[this.field1586];
        if (var3) {
            this.field1591 = new byte[this.field1586];
        }
        if (var4) {
            this.field1572 = new byte[this.field1586];
        }
        if (var5) {
            this.field1571 = new byte[this.field1586];
        }
        if (var6) {
            this.field1570 = new int[this.field1586];
        }
        if (var7) {
            this.field1576 = new short[this.field1586];
        }
        if (var8) {
            this.field1563 = new byte[this.field1586];
        }
        this.field1575 = new short[this.field1586];
        if (this.field1589 > 0) {
            this.field1579 = new byte[this.field1589];
            this.field1580 = new short[this.field1589];
            this.field1581 = new short[this.field1589];
            this.field1582 = new short[this.field1589];
            this.field1603 = new short[this.field1589];
            this.field1584 = new short[this.field1589];
            this.field1585 = new short[this.field1589];
            this.field1574 = new short[this.field1589];
            this.field1577 = new byte[this.field1589];
            this.field1587 = new short[this.field1589];
            this.field1588 = new short[this.field1589];
        }
        this.field1593 = 0;
        this.field1586 = 0;
        this.field1589 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class95 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1586; var13++) {
                    if (var3 && var12.field1591 != null) {
                        this.field1591[this.field1586] = var12.field1591[var13];
                    }
                    if (var4) {
                        if (var12.field1572 == null) {
                            this.field1572[this.field1586] = var12.field1590;
                        } else {
                            this.field1572[this.field1586] = var12.field1572[var13];
                        }
                    }
                    if (var5 && var12.field1571 != null) {
                        this.field1571[this.field1586] = var12.field1571[var13];
                    }
                    if (var6 && var12.field1570 != null) {
                        this.field1570[this.field1586] = var12.field1570[var13];
                    }
                    if (var7) {
                        if (var12.field1576 == null) {
                            this.field1576[this.field1586] = -1;
                        } else {
                            this.field1576[this.field1586] = var12.field1576[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1563 == null || var12.field1563[var13] == -1) {
                            this.field1563[this.field1586] = -1;
                        } else {
                            this.field1563[this.field1586] = (byte) (var12.field1563[var13] + this.field1589);
                        }
                    }
                    this.field1575[this.field1586] = var12.field1575[var13];
                    this.field1605[this.field1586] = this.method1949(var12, var12.field1605[var13]);
                    this.field1583[this.field1586] = this.method1949(var12, var12.field1583[var13]);
                    this.field1568[this.field1586] = this.method1949(var12, var12.field1568[var13]);
                    this.field1586++;
                }
                for (int var14 = 0; var14 < var12.field1589; var14++) {
                    byte var15 = this.field1579[this.field1589] = var12.field1579[var14];
                    if (var15 == 0) {
                        this.field1580[this.field1589] = (short) this.method1949(var12, var12.field1580[var14]);
                        this.field1581[this.field1589] = (short) this.method1949(var12, var12.field1581[var14]);
                        this.field1582[this.field1589] = (short) this.method1949(var12, var12.field1582[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1580[this.field1589] = var12.field1580[var14];
                        this.field1581[this.field1589] = var12.field1581[var14];
                        this.field1582[this.field1589] = var12.field1582[var14];
                        this.field1603[this.field1589] = var12.field1603[var14];
                        this.field1584[this.field1589] = var12.field1584[var14];
                        this.field1585[this.field1589] = var12.field1585[var14];
                        this.field1574[this.field1589] = var12.field1574[var14];
                        this.field1577[this.field1589] = var12.field1577[var14];
                        this.field1587[this.field1589] = var12.field1587[var14];
                    }
                    if (var15 == 2) {
                        this.field1588[this.field1589] = var12.field1588[var14];
                    }
                    this.field1589++;
                }
            }
        }
    }

    @ObfuscatedName("cr.u(Lcr;I)I")
    public final int method1949(class95 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1564[arg1];
        int var5 = arg0.field1565[arg1];
        int var6 = arg0.field1566[arg1];
        for (int var7 = 0; var7 < this.field1593; var7++) {
            if (this.field1564[var7] == var4 && this.field1565[var7] == var5 && this.field1566[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1564[this.field1593] = var4;
            this.field1565[this.field1593] = var5;
            this.field1566[this.field1593] = var6;
            if (arg0.field1595 != null) {
                this.field1595[this.field1593] = arg0.field1595[arg1];
            }
            var3 = this.field1593++;
        }
        return var3;
    }

    public class95(class95 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1593 = arg0.field1593;
        this.field1586 = arg0.field1586;
        this.field1589 = arg0.field1589;
        if (arg1) {
            this.field1564 = arg0.field1564;
            this.field1565 = arg0.field1565;
            this.field1566 = arg0.field1566;
        } else {
            this.field1564 = new int[this.field1593];
            this.field1565 = new int[this.field1593];
            this.field1566 = new int[this.field1593];
            for (int var6 = 0; var6 < this.field1593; var6++) {
                this.field1564[var6] = arg0.field1564[var6];
                this.field1565[var6] = arg0.field1565[var6];
                this.field1566[var6] = arg0.field1566[var6];
            }
        }
        if (arg2) {
            this.field1575 = arg0.field1575;
        } else {
            this.field1575 = new short[this.field1586];
            for (int var7 = 0; var7 < this.field1586; var7++) {
                this.field1575[var7] = arg0.field1575[var7];
            }
        }
        if (arg3 || arg0.field1576 == null) {
            this.field1576 = arg0.field1576;
        } else {
            this.field1576 = new short[this.field1586];
            for (int var8 = 0; var8 < this.field1586; var8++) {
                this.field1576[var8] = arg0.field1576[var8];
            }
        }
        if (arg4) {
            this.field1571 = arg0.field1571;
        } else {
            this.field1571 = new byte[this.field1586];
            if (arg0.field1571 == null) {
                for (int var9 = 0; var9 < this.field1586; var9++) {
                    this.field1571[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1586; var10++) {
                    this.field1571[var10] = arg0.field1571[var10];
                }
            }
        }
        this.field1605 = arg0.field1605;
        this.field1583 = arg0.field1583;
        this.field1568 = arg0.field1568;
        this.field1591 = arg0.field1591;
        this.field1572 = arg0.field1572;
        this.field1563 = arg0.field1563;
        this.field1590 = arg0.field1590;
        this.field1579 = arg0.field1579;
        this.field1580 = arg0.field1580;
        this.field1581 = arg0.field1581;
        this.field1582 = arg0.field1582;
        this.field1603 = arg0.field1603;
        this.field1584 = arg0.field1584;
        this.field1585 = arg0.field1585;
        this.field1574 = arg0.field1574;
        this.field1577 = arg0.field1577;
        this.field1587 = arg0.field1587;
        this.field1588 = arg0.field1588;
        this.field1595 = arg0.field1595;
        this.field1570 = arg0.field1570;
        this.field1592 = arg0.field1592;
        this.field1569 = arg0.field1569;
        this.field1567 = arg0.field1567;
        this.field1594 = arg0.field1594;
        this.field1596 = arg0.field1596;
        this.field1597 = arg0.field1597;
        this.field1598 = arg0.field1598;
    }

    @ObfuscatedName("cr.w()Lcr;")
    public class95 method1942() {
        class95 var1 = new class95();
        if (this.field1591 != null) {
            var1.field1591 = new byte[this.field1586];
            for (int var2 = 0; var2 < this.field1586; var2++) {
                var1.field1591[var2] = this.field1591[var2];
            }
        }
        var1.field1593 = this.field1593;
        var1.field1586 = this.field1586;
        var1.field1589 = this.field1589;
        var1.field1564 = this.field1564;
        var1.field1565 = this.field1565;
        var1.field1566 = this.field1566;
        var1.field1605 = this.field1605;
        var1.field1583 = this.field1583;
        var1.field1568 = this.field1568;
        var1.field1572 = this.field1572;
        var1.field1571 = this.field1571;
        var1.field1563 = this.field1563;
        var1.field1575 = this.field1575;
        var1.field1576 = this.field1576;
        var1.field1590 = this.field1590;
        var1.field1579 = this.field1579;
        var1.field1580 = this.field1580;
        var1.field1581 = this.field1581;
        var1.field1582 = this.field1582;
        var1.field1603 = this.field1603;
        var1.field1584 = this.field1584;
        var1.field1585 = this.field1585;
        var1.field1574 = this.field1574;
        var1.field1577 = this.field1577;
        var1.field1587 = this.field1587;
        var1.field1588 = this.field1588;
        var1.field1595 = this.field1595;
        var1.field1570 = this.field1570;
        var1.field1592 = this.field1592;
        var1.field1569 = this.field1569;
        var1.field1567 = this.field1567;
        var1.field1594 = this.field1594;
        var1.field1597 = this.field1597;
        var1.field1598 = this.field1598;
        return var1;
    }

    @ObfuscatedName("cr.g([[IIIIZI)Lcr;")
    public class95 method1983(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1946();
        int var7 = this.field1601 + arg1;
        int var8 = this.field1602 + arg1;
        int var9 = this.field1604 + arg3;
        int var10 = this.field1607 + arg3;
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
            var15.field1593 = this.field1593;
            var15.field1586 = this.field1586;
            var15.field1589 = this.field1589;
            var15.field1564 = this.field1564;
            var15.field1566 = this.field1566;
            var15.field1605 = this.field1605;
            var15.field1583 = this.field1583;
            var15.field1568 = this.field1568;
            var15.field1591 = this.field1591;
            var15.field1572 = this.field1572;
            var15.field1571 = this.field1571;
            var15.field1563 = this.field1563;
            var15.field1575 = this.field1575;
            var15.field1576 = this.field1576;
            var15.field1590 = this.field1590;
            var15.field1579 = this.field1579;
            var15.field1580 = this.field1580;
            var15.field1581 = this.field1581;
            var15.field1582 = this.field1582;
            var15.field1603 = this.field1603;
            var15.field1584 = this.field1584;
            var15.field1585 = this.field1585;
            var15.field1574 = this.field1574;
            var15.field1577 = this.field1577;
            var15.field1587 = this.field1587;
            var15.field1588 = this.field1588;
            var15.field1595 = this.field1595;
            var15.field1570 = this.field1570;
            var15.field1592 = this.field1592;
            var15.field1569 = this.field1569;
            var15.field1597 = this.field1597;
            var15.field1598 = this.field1598;
            var15.field1565 = new int[var15.field1593];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1593; var16++) {
                int var17 = this.field1564[var16] + arg1;
                int var18 = this.field1566[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1565[var16] = this.field1565[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1593; var26++) {
                int var27 = (-this.field1565[var26] << 16) / this.field1324;
                if (var27 < arg5) {
                    int var28 = this.field1564[var26] + arg1;
                    int var29 = this.field1566[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1565[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1565[var26];
                }
            }
        }
        var15.method1970();
        return var15;
    }

    @ObfuscatedName("cr.o()V")
    public void method1944() {
        int var10002;
        if (this.field1595 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1593; var3++) {
                int var4 = this.field1595[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1592 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1592[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1593) {
                int var7 = this.field1595[var6];
                this.field1592[var7][var1[var7]++] = var6++;
            }
            this.field1595 = null;
        }
        if (this.field1570 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1586; var10++) {
            int var11 = this.field1570[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1569 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1569[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1586) {
            int var14 = this.field1570[var13];
            this.field1569[var14][var8[var14]++] = var13++;
        }
        this.field1570 = null;
    }

    @ObfuscatedName("cr.h()V")
    public void method1940() {
        for (int var1 = 0; var1 < this.field1593; var1++) {
            int var2 = this.field1564[var1];
            this.field1564[var1] = this.field1566[var1];
            this.field1566[var1] = -var2;
        }
        this.method1970();
    }

    @ObfuscatedName("cr.s()V")
    public void method1985() {
        for (int var1 = 0; var1 < this.field1593; var1++) {
            this.field1564[var1] = -this.field1564[var1];
            this.field1566[var1] = -this.field1566[var1];
        }
        this.method1970();
    }

    @ObfuscatedName("cr.j()V")
    public void method1947() {
        for (int var1 = 0; var1 < this.field1593; var1++) {
            int var2 = this.field1566[var1];
            this.field1566[var1] = this.field1564[var1];
            this.field1564[var1] = -var2;
        }
        this.method1970();
    }

    @ObfuscatedName("cr.m(I)V")
    public void method1948(int arg0) {
        int var2 = field1608[arg0];
        int var3 = field1609[arg0];
        for (int var4 = 0; var4 < this.field1593; var4++) {
            int var5 = this.field1566[var4] * var2 + this.field1564[var4] * var3 >> 16;
            this.field1566[var4] = this.field1566[var4] * var3 - this.field1564[var4] * var2 >> 16;
            this.field1564[var4] = var5;
        }
        this.method1970();
    }

    @ObfuscatedName("cr.t(III)V")
    public void method1997(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1593; var4++) {
            this.field1564[var4] += arg0;
            this.field1565[var4] += arg1;
            this.field1566[var4] += arg2;
        }
        this.method1970();
    }

    @ObfuscatedName("cr.z(SS)V")
    public void method1936(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1586; var3++) {
            if (this.field1575[var3] == arg0) {
                this.field1575[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cr.y(SS)V")
    public void method1951(short arg0, short arg1) {
        if (this.field1576 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1586; var3++) {
            if (this.field1576[var3] == arg0) {
                this.field1576[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cr.q()V")
    public void method1945() {
        for (int var1 = 0; var1 < this.field1593; var1++) {
            this.field1566[var1] = -this.field1566[var1];
        }
        for (int var2 = 0; var2 < this.field1586; var2++) {
            int var3 = this.field1605[var2];
            this.field1605[var2] = this.field1568[var2];
            this.field1568[var2] = var3;
        }
        this.method1970();
    }

    @ObfuscatedName("cr.d(III)V")
    public void method1953(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1593; var4++) {
            this.field1564[var4] = this.field1564[var4] * arg0 / 128;
            this.field1565[var4] = this.field1565[var4] * arg1 / 128;
            this.field1566[var4] = this.field1566[var4] * arg2 / 128;
        }
        this.method1970();
    }

    @ObfuscatedName("cr.b()V")
    public void method1954() {
        if (this.field1567 != null) {
            return;
        }
        this.field1567 = new class91[this.field1593];
        for (int var1 = 0; var1 < this.field1593; var1++) {
            this.field1567[var1] = new class91();
        }
        for (int var2 = 0; var2 < this.field1586; var2++) {
            int var3 = this.field1605[var2];
            int var4 = this.field1583[var2];
            int var5 = this.field1568[var2];
            int var6 = this.field1564[var4] - this.field1564[var3];
            int var7 = this.field1565[var4] - this.field1565[var3];
            int var8 = this.field1566[var4] - this.field1566[var3];
            int var9 = this.field1564[var5] - this.field1564[var3];
            int var10 = this.field1565[var5] - this.field1565[var3];
            int var11 = this.field1566[var5] - this.field1566[var3];
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
                class91 var20 = this.field1567[var3];
                var20.field1505 += var16;
                var20.field1507 += var17;
                var20.field1506 += var18;
                var20.field1508++;
                class91 var21 = this.field1567[var4];
                var21.field1505 += var16;
                var21.field1507 += var17;
                var21.field1506 += var18;
                var21.field1508++;
                class91 var22 = this.field1567[var5];
                var22.field1505 += var16;
                var22.field1507 += var17;
                var22.field1506 += var18;
                var22.field1508++;
            } else if (var19 == 1) {
                if (this.field1594 == null) {
                    this.field1594 = new class79[this.field1586];
                }
                class79 var23 = this.field1594[var2] = new class79();
                var23.field1319 = var16;
                var23.field1315 = var17;
                var23.field1316 = var18;
            }
        }
    }

    @ObfuscatedName("cr.x()V")
    public void method1970() {
        this.field1567 = null;
        this.field1596 = null;
        this.field1594 = null;
        this.field1599 = false;
    }

    @ObfuscatedName("cr.n()V")
    public void method1946() {
        if (this.field1599) {
            return;
        }
        this.field1324 = 0;
        this.field1600 = 0;
        this.field1601 = 999999;
        this.field1602 = -999999;
        this.field1607 = -99999;
        this.field1604 = 99999;
        for (int var1 = 0; var1 < this.field1593; var1++) {
            int var2 = this.field1564[var1];
            int var3 = this.field1565[var1];
            int var4 = this.field1566[var1];
            if (var2 < this.field1601) {
                this.field1601 = var2;
            }
            if (var2 > this.field1602) {
                this.field1602 = var2;
            }
            if (var4 < this.field1604) {
                this.field1604 = var4;
            }
            if (var4 > this.field1607) {
                this.field1607 = var4;
            }
            if (-var3 > this.field1324) {
                this.field1324 = -var3;
            }
            if (var3 > this.field1600) {
                this.field1600 = var3;
            }
        }
        this.field1599 = true;
    }

    @ObfuscatedName("cr.v(Lcr;Lcr;IIIZ)V")
    public static void method1956(class95 arg0, class95 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1946();
        arg0.method1954();
        arg1.method1946();
        arg1.method1954();
        field1573++;
        int var6 = 0;
        int[] var7 = arg1.field1564;
        int var8 = arg1.field1593;
        for (int var9 = 0; var9 < arg0.field1593; var9++) {
            class91 var10 = arg0.field1567[var9];
            if (var10.field1508 != 0) {
                int var11 = arg0.field1565[var9] - arg3;
                if (var11 <= arg1.field1600) {
                    int var12 = arg0.field1564[var9] - arg2;
                    if (var12 >= arg1.field1601 && var12 <= arg1.field1602) {
                        int var13 = arg0.field1566[var9] - arg4;
                        if (var13 >= arg1.field1604 && var13 <= arg1.field1607) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class91 var15 = arg1.field1567[var14];
                                if (var7[var14] == var12 && arg1.field1566[var14] == var13 && arg1.field1565[var14] == var11 && var15.field1508 != 0) {
                                    if (arg0.field1596 == null) {
                                        arg0.field1596 = new class91[arg0.field1593];
                                    }
                                    if (arg1.field1596 == null) {
                                        arg1.field1596 = new class91[var8];
                                    }
                                    class91 var16 = arg0.field1596[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1596[var9] = new class91(var10);
                                    }
                                    class91 var17 = arg1.field1596[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1596[var14] = new class91(var15);
                                    }
                                    var16.field1505 += var15.field1505;
                                    var16.field1507 += var15.field1507;
                                    var16.field1506 += var15.field1506;
                                    var16.field1508 += var15.field1508;
                                    var17.field1505 += var10.field1505;
                                    var17.field1507 += var10.field1507;
                                    var17.field1506 += var10.field1506;
                                    var17.field1508 += var10.field1508;
                                    var6++;
                                    field1578[var9] = field1573;
                                    field1606[var14] = field1573;
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
        for (int var18 = 0; var18 < arg0.field1586; var18++) {
            if (field1578[arg0.field1605[var18]] == field1573 && field1578[arg0.field1583[var18]] == field1573 && field1578[arg0.field1568[var18]] == field1573) {
                if (arg0.field1591 == null) {
                    arg0.field1591 = new byte[arg0.field1586];
                }
                arg0.field1591[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1586; var19++) {
            if (field1606[arg1.field1605[var19]] == field1573 && field1606[arg1.field1583[var19]] == field1573 && field1606[arg1.field1568[var19]] == field1573) {
                if (arg1.field1591 == null) {
                    arg1.field1591 = new byte[arg1.field1586];
                }
                arg1.field1591[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cr.p(IIIII)Lcy;")
    public final class100 method1957(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1954();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class100 var8 = new class100();
        var8.field1687 = new int[this.field1586];
        var8.field1688 = new int[this.field1586];
        var8.field1740 = new int[this.field1586];
        if (this.field1589 > 0 && this.field1563 != null) {
            int[] var9 = new int[this.field1589];
            for (int var10 = 0; var10 < this.field1586; var10++) {
                if (this.field1563[var10] != -1) {
                    var9[this.field1563[var10] & 0xFF]++;
                }
            }
            var8.field1695 = 0;
            for (int var11 = 0; var11 < this.field1589; var11++) {
                if (var9[var11] > 0 && this.field1579[var11] == 0) {
                    var8.field1695++;
                }
            }
            var8.field1725 = new int[var8.field1695];
            var8.field1722 = new int[var8.field1695];
            var8.field1698 = new int[var8.field1695];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1589; var13++) {
                if (var9[var13] > 0 && this.field1579[var13] == 0) {
                    var8.field1725[var12] = this.field1580[var13] & 0xFFFF;
                    var8.field1722[var12] = this.field1581[var13] & 0xFFFF;
                    var8.field1698[var12] = this.field1582[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1692 = new byte[this.field1586];
            for (int var14 = 0; var14 < this.field1586; var14++) {
                if (this.field1563[var14] == -1) {
                    var8.field1692[var14] = -1;
                } else {
                    var8.field1692[var14] = (byte) var9[this.field1563[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1586; var15++) {
            byte var16;
            if (this.field1591 == null) {
                var16 = 0;
            } else {
                var16 = this.field1591[var15];
            }
            byte var17;
            if (this.field1571 == null) {
                var17 = 0;
            } else {
                var17 = this.field1571[var15];
            }
            short var18;
            if (this.field1576 == null) {
                var18 = -1;
            } else {
                var18 = this.field1576[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1575[var15] & 0xFFFF;
                    class91 var20;
                    if (this.field1596 == null || this.field1596[this.field1605[var15]] == null) {
                        var20 = this.field1567[this.field1605[var15]];
                    } else {
                        var20 = this.field1596[this.field1605[var15]];
                    }
                    int var21 = (var20.field1506 * arg4 + var20.field1507 * arg3 + var20.field1505 * arg2) / (var20.field1508 * var7) + arg0;
                    var8.field1687[var15] = method1958(var19, var21);
                    class91 var22;
                    if (this.field1596 == null || this.field1596[this.field1583[var15]] == null) {
                        var22 = this.field1567[this.field1583[var15]];
                    } else {
                        var22 = this.field1596[this.field1583[var15]];
                    }
                    int var23 = (var22.field1506 * arg4 + var22.field1507 * arg3 + var22.field1505 * arg2) / (var22.field1508 * var7) + arg0;
                    var8.field1688[var15] = method1958(var19, var23);
                    class91 var24;
                    if (this.field1596 == null || this.field1596[this.field1568[var15]] == null) {
                        var24 = this.field1567[this.field1568[var15]];
                    } else {
                        var24 = this.field1596[this.field1568[var15]];
                    }
                    int var25 = (var24.field1506 * arg4 + var24.field1507 * arg3 + var24.field1505 * arg2) / (var24.field1508 * var7) + arg0;
                    var8.field1740[var15] = method1958(var19, var25);
                } else if (var16 == 1) {
                    class79 var26 = this.field1594[var15];
                    int var27 = (var26.field1316 * arg4 + var26.field1319 * arg2 + var26.field1315 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1687[var15] = method1958(this.field1575[var15] & 0xFFFF, var27);
                    var8.field1740[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1687[var15] = 128;
                    var8.field1740[var15] = -1;
                } else {
                    var8.field1740[var15] = -2;
                }
            } else if (var16 == 0) {
                class91 var28;
                if (this.field1596 == null || this.field1596[this.field1605[var15]] == null) {
                    var28 = this.field1567[this.field1605[var15]];
                } else {
                    var28 = this.field1596[this.field1605[var15]];
                }
                int var29 = (var28.field1506 * arg4 + var28.field1507 * arg3 + var28.field1505 * arg2) / (var28.field1508 * var7) + arg0;
                var8.field1687[var15] = method1959(var29);
                class91 var30;
                if (this.field1596 == null || this.field1596[this.field1583[var15]] == null) {
                    var30 = this.field1567[this.field1583[var15]];
                } else {
                    var30 = this.field1596[this.field1583[var15]];
                }
                int var31 = (var30.field1506 * arg4 + var30.field1507 * arg3 + var30.field1505 * arg2) / (var30.field1508 * var7) + arg0;
                var8.field1688[var15] = method1959(var31);
                class91 var32;
                if (this.field1596 == null || this.field1596[this.field1568[var15]] == null) {
                    var32 = this.field1567[this.field1568[var15]];
                } else {
                    var32 = this.field1596[this.field1568[var15]];
                }
                int var33 = (var32.field1506 * arg4 + var32.field1507 * arg3 + var32.field1505 * arg2) / (var32.field1508 * var7) + arg0;
                var8.field1740[var15] = method1959(var33);
            } else if (var16 == 1) {
                class79 var34 = this.field1594[var15];
                int var35 = (var34.field1316 * arg4 + var34.field1319 * arg2 + var34.field1315 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1687[var15] = method1959(var35);
                var8.field1740[var15] = -1;
            } else {
                var8.field1740[var15] = -2;
            }
        }
        this.method1944();
        var8.field1675 = this.field1593;
        var8.field1711 = this.field1564;
        var8.field1681 = this.field1565;
        var8.field1682 = this.field1566;
        var8.field1683 = this.field1586;
        var8.field1684 = this.field1605;
        var8.field1685 = this.field1583;
        var8.field1686 = this.field1568;
        var8.field1690 = this.field1572;
        var8.field1679 = this.field1571;
        var8.field1694 = this.field1590;
        var8.field1699 = this.field1592;
        var8.field1723 = this.field1569;
        var8.field1709 = this.field1576;
        return var8;
    }

    @ObfuscatedName("cr.ai(II)I")
    public static final int method1958(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cr.aw(I)I")
    public static final int method1959(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
