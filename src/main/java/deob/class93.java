package deob;

@ObfuscatedName("cx")
public class class93 extends class78 {

    @ObfuscatedName("cx.n")
    public int field1590 = 0;

    @ObfuscatedName("cx.x")
    public int[] field1564;

    @ObfuscatedName("cx.k")
    public int[] field1565;

    @ObfuscatedName("cx.i")
    public int[] field1566;

    @ObfuscatedName("cx.d")
    public int field1571 = 0;

    @ObfuscatedName("cx.q")
    public int[] field1570;

    @ObfuscatedName("cx.m")
    public int[] field1607;

    @ObfuscatedName("cx.a")
    public int[] field1586;

    @ObfuscatedName("cx.w")
    public byte[] field1608;

    @ObfuscatedName("cx.e")
    public byte[] field1572;

    @ObfuscatedName("cx.o")
    public byte[] field1573;

    @ObfuscatedName("cx.v")
    public byte[] field1574;

    @ObfuscatedName("cx.z")
    public short[] field1567;

    @ObfuscatedName("cx.j")
    public short[] field1576;

    @ObfuscatedName("cx.r")
    public byte field1577 = 0;

    @ObfuscatedName("cx.c")
    public int field1578;

    @ObfuscatedName("cx.u")
    public byte[] field1579;

    @ObfuscatedName("cx.h")
    public short[] field1580;

    @ObfuscatedName("cx.t")
    public short[] field1563;

    @ObfuscatedName("cx.f")
    public short[] field1582;

    @ObfuscatedName("cx.g")
    public short[] field1593;

    @ObfuscatedName("cx.s")
    public short[] field1584;

    @ObfuscatedName("cx.y")
    public short[] field1585;

    @ObfuscatedName("cx.p")
    public short[] field1591;

    @ObfuscatedName("cx.b")
    public short[] field1587;

    @ObfuscatedName("cx.l")
    public short[] field1588;

    @ObfuscatedName("cx.al")
    public byte[] field1575;

    @ObfuscatedName("cx.aa")
    public int[] field1569;

    @ObfuscatedName("cx.ar")
    public int[] field1609;

    @ObfuscatedName("cx.ak")
    public int[][] field1592;

    @ObfuscatedName("cx.ay")
    public int[][] field1600;

    @ObfuscatedName("cx.aw")
    public class77[] field1594;

    @ObfuscatedName("cx.av")
    public class89[] field1595;

    @ObfuscatedName("cx.at")
    public class89[] field1596;

    @ObfuscatedName("cx.af")
    public short field1597;

    @ObfuscatedName("cx.ae")
    public short field1598;

    @ObfuscatedName("cx.ai")
    public boolean field1599 = false;

    @ObfuscatedName("cx.as")
    public int field1583;

    @ObfuscatedName("cx.aj")
    public int field1601;

    @ObfuscatedName("cx.au")
    public int field1602;

    @ObfuscatedName("cx.az")
    public int field1603;

    @ObfuscatedName("cx.ao")
    public int field1604;

    @ObfuscatedName("cx.ag")
    public static int[] field1605 = new int[10000];

    @ObfuscatedName("cx.aq")
    public static int[] field1606 = new int[10000];

    @ObfuscatedName("cx.an")
    public static int field1568 = 0;

    @ObfuscatedName("cx.ax")
    public static int[] field1581 = class84.field1466;

    @ObfuscatedName("cx.ap")
    public static int[] field1589 = class84.field1467;

    public class93() {
    }

    @ObfuscatedName("cx.n(Lej;II)Lcx;")
    public static class93 method1894(class147 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2738(arg1, arg2);
        return var3 == null ? null : new class93(var3);
    }

    public class93(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1888(arg0);
        } else {
            this.method1965(arg0);
        }
    }

    @ObfuscatedName("cx.k([B)V")
    public void method1888(byte[] arg0) {
        class107 var2 = new class107(arg0);
        class107 var3 = new class107(arg0);
        class107 var4 = new class107(arg0);
        class107 var5 = new class107(arg0);
        class107 var6 = new class107(arg0);
        class107 var7 = new class107(arg0);
        class107 var8 = new class107(arg0);
        var2.field1826 = arg0.length - 23;
        int var9 = var2.method2140();
        int var10 = var2.method2140();
        int var11 = var2.method2148();
        int var12 = var2.method2148();
        int var13 = var2.method2148();
        int var14 = var2.method2148();
        int var15 = var2.method2148();
        int var16 = var2.method2148();
        int var17 = var2.method2148();
        int var18 = var2.method2140();
        int var19 = var2.method2140();
        int var20 = var2.method2140();
        int var21 = var2.method2140();
        int var22 = var2.method2140();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1579 = new byte[var11];
            var2.field1826 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1579[var26] = var2.method2175();
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
        this.field1590 = var9;
        this.field1571 = var10;
        this.field1578 = var11;
        this.field1564 = new int[var9];
        this.field1565 = new int[var9];
        this.field1566 = new int[var9];
        this.field1570 = new int[var10];
        this.field1607 = new int[var10];
        this.field1586 = new int[var10];
        if (var17 == 1) {
            this.field1569 = new int[var9];
        }
        if (var12 == 1) {
            this.field1608 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1572 = new byte[var10];
        } else {
            this.field1577 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1573 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1609 = new int[var10];
        }
        if (var16 == 1) {
            this.field1576 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1574 = new byte[var10];
        }
        this.field1567 = new short[var10];
        if (var11 > 0) {
            this.field1580 = new short[var11];
            this.field1563 = new short[var11];
            this.field1582 = new short[var11];
            if (var24 > 0) {
                this.field1593 = new short[var24];
                this.field1584 = new short[var24];
                this.field1585 = new short[var24];
                this.field1591 = new short[var24];
                this.field1575 = new byte[var24];
                this.field1587 = new short[var24];
            }
            if (var25 > 0) {
                this.field1588 = new short[var25];
            }
        }
        var2.field1826 = var11;
        var3.field1826 = var44;
        var4.field1826 = var46;
        var5.field1826 = var48;
        var6.field1826 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2148();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2150();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2150();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2150();
            }
            this.field1564[var67] = var64 + var69;
            this.field1565[var67] = var65 + var70;
            this.field1566[var67] = var66 + var71;
            var64 = this.field1564[var67];
            var65 = this.field1565[var67];
            var66 = this.field1566[var67];
            if (var17 == 1) {
                this.field1569[var67] = var6.method2148();
            }
        }
        var2.field1826 = var42;
        var3.field1826 = var31;
        var4.field1826 = var34;
        var5.field1826 = var37;
        var6.field1826 = var35;
        var7.field1826 = var40;
        var8.field1826 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1567[var72] = (short) var2.method2140();
            if (var12 == 1) {
                this.field1608[var72] = var3.method2175();
            }
            if (var13 == 255) {
                this.field1572[var72] = var4.method2175();
            }
            if (var14 == 1) {
                this.field1573[var72] = var5.method2175();
            }
            if (var15 == 1) {
                this.field1609[var72] = var6.method2148();
            }
            if (var16 == 1) {
                this.field1576[var72] = (short) (var7.method2140() - 1);
            }
            if (this.field1574 != null && this.field1576[var72] != -1) {
                this.field1574[var72] = (byte) (var8.method2148() - 1);
            }
        }
        var2.field1826 = var33;
        var3.field1826 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2148();
            if (var78 == 1) {
                var73 = var2.method2150() + var76;
                var74 = var2.method2150() + var73;
                var75 = var2.method2150() + var74;
                var76 = var75;
                this.field1570[var77] = var73;
                this.field1607[var77] = var74;
                this.field1586[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2150() + var76;
                var76 = var75;
                this.field1570[var77] = var73;
                this.field1607[var77] = var74;
                this.field1586[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2150() + var76;
                var76 = var75;
                this.field1570[var77] = var73;
                this.field1607[var77] = var74;
                this.field1586[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2150() + var76;
                var76 = var75;
                this.field1570[var77] = var73;
                this.field1607[var77] = var81;
                this.field1586[var77] = var75;
            }
        }
        var2.field1826 = var50;
        var3.field1826 = var52;
        var4.field1826 = var54;
        var5.field1826 = var56;
        var6.field1826 = var58;
        var7.field1826 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1579[var82] & 0xFF;
            if (var83 == 0) {
                this.field1580[var82] = (short) var2.method2140();
                this.field1563[var82] = (short) var2.method2140();
                this.field1582[var82] = (short) var2.method2140();
            }
            if (var83 == 1) {
                this.field1580[var82] = (short) var3.method2140();
                this.field1563[var82] = (short) var3.method2140();
                this.field1582[var82] = (short) var3.method2140();
                this.field1593[var82] = (short) var4.method2140();
                this.field1584[var82] = (short) var4.method2140();
                this.field1585[var82] = (short) var4.method2140();
                this.field1591[var82] = (short) var5.method2140();
                this.field1575[var82] = var6.method2175();
                this.field1587[var82] = (short) var7.method2140();
            }
            if (var83 == 2) {
                this.field1580[var82] = (short) var3.method2140();
                this.field1563[var82] = (short) var3.method2140();
                this.field1582[var82] = (short) var3.method2140();
                this.field1593[var82] = (short) var4.method2140();
                this.field1584[var82] = (short) var4.method2140();
                this.field1585[var82] = (short) var4.method2140();
                this.field1591[var82] = (short) var5.method2140();
                this.field1575[var82] = var6.method2175();
                this.field1587[var82] = (short) var7.method2140();
                this.field1588[var82] = (short) var7.method2140();
            }
            if (var83 == 3) {
                this.field1580[var82] = (short) var3.method2140();
                this.field1563[var82] = (short) var3.method2140();
                this.field1582[var82] = (short) var3.method2140();
                this.field1593[var82] = (short) var4.method2140();
                this.field1584[var82] = (short) var4.method2140();
                this.field1585[var82] = (short) var4.method2140();
                this.field1591[var82] = (short) var5.method2140();
                this.field1575[var82] = var6.method2175();
                this.field1587[var82] = (short) var7.method2140();
            }
        }
        var2.field1826 = var62;
        int var84 = var2.method2148();
        if (var84 == 0) {
            return;
        }
        new class83();
        var2.method2140();
        var2.method2140();
        var2.method2140();
        var2.method2183();
    }

    @ObfuscatedName("cx.i([B)V")
    public void method1965(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class107 var4 = new class107(arg0);
        class107 var5 = new class107(arg0);
        class107 var6 = new class107(arg0);
        class107 var7 = new class107(arg0);
        class107 var8 = new class107(arg0);
        var4.field1826 = arg0.length - 18;
        int var9 = var4.method2140();
        int var10 = var4.method2140();
        int var11 = var4.method2148();
        int var12 = var4.method2148();
        int var13 = var4.method2148();
        int var14 = var4.method2148();
        int var15 = var4.method2148();
        int var16 = var4.method2148();
        int var17 = var4.method2140();
        int var18 = var4.method2140();
        int var19 = var4.method2140();
        int var20 = var4.method2140();
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
        this.field1590 = var9;
        this.field1571 = var10;
        this.field1578 = var11;
        this.field1564 = new int[var9];
        this.field1565 = new int[var9];
        this.field1566 = new int[var9];
        this.field1570 = new int[var10];
        this.field1607 = new int[var10];
        this.field1586 = new int[var10];
        if (var11 > 0) {
            this.field1579 = new byte[var11];
            this.field1580 = new short[var11];
            this.field1563 = new short[var11];
            this.field1582 = new short[var11];
        }
        if (var16 == 1) {
            this.field1569 = new int[var9];
        }
        if (var12 == 1) {
            this.field1608 = new byte[var10];
            this.field1574 = new byte[var10];
            this.field1576 = new short[var10];
        }
        if (var13 == 255) {
            this.field1572 = new byte[var10];
        } else {
            this.field1577 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1573 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1609 = new int[var10];
        }
        this.field1567 = new short[var10];
        var4.field1826 = var21;
        var5.field1826 = var36;
        var6.field1826 = var38;
        var7.field1826 = var40;
        var8.field1826 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2148();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2150();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2150();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2150();
            }
            this.field1564[var46] = var43 + var48;
            this.field1565[var46] = var44 + var49;
            this.field1566[var46] = var45 + var50;
            var43 = this.field1564[var46];
            var44 = this.field1565[var46];
            var45 = this.field1566[var46];
            if (var16 == 1) {
                this.field1569[var46] = var8.method2148();
            }
        }
        var4.field1826 = var32;
        var5.field1826 = var28;
        var6.field1826 = var26;
        var7.field1826 = var30;
        var8.field1826 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1567[var51] = (short) var4.method2140();
            if (var12 == 1) {
                int var52 = var5.method2148();
                if ((var52 & 0x1) == 1) {
                    this.field1608[var51] = 1;
                    var2 = true;
                } else {
                    this.field1608[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1574[var51] = (byte) (var52 >> 2);
                    this.field1576[var51] = this.field1567[var51];
                    this.field1567[var51] = 127;
                    if (this.field1576[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1574[var51] = -1;
                    this.field1576[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1572[var51] = var6.method2175();
            }
            if (var14 == 1) {
                this.field1573[var51] = var7.method2175();
            }
            if (var15 == 1) {
                this.field1609[var51] = var8.method2148();
            }
        }
        var4.field1826 = var25;
        var5.field1826 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2148();
            if (var58 == 1) {
                var53 = var4.method2150() + var56;
                var54 = var4.method2150() + var53;
                var55 = var4.method2150() + var54;
                var56 = var55;
                this.field1570[var57] = var53;
                this.field1607[var57] = var54;
                this.field1586[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2150() + var56;
                var56 = var55;
                this.field1570[var57] = var53;
                this.field1607[var57] = var54;
                this.field1586[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2150() + var56;
                var56 = var55;
                this.field1570[var57] = var53;
                this.field1607[var57] = var54;
                this.field1586[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2150() + var56;
                var56 = var55;
                this.field1570[var57] = var53;
                this.field1607[var57] = var61;
                this.field1586[var57] = var55;
            }
        }
        var4.field1826 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1579[var62] = 0;
            this.field1580[var62] = (short) var4.method2140();
            this.field1563[var62] = (short) var4.method2140();
            this.field1582[var62] = (short) var4.method2140();
        }
        if (this.field1574 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1574[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1580[var65] & 0xFFFF) == this.field1570[var64] && (this.field1563[var65] & 0xFFFF) == this.field1607[var64] && (this.field1582[var65] & 0xFFFF) == this.field1586[var64]) {
                        this.field1574[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1574 = null;
            }
        }
        if (!var3) {
            this.field1576 = null;
        }
        if (!var2) {
            this.field1608 = null;
        }
    }

    public class93(class93[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1590 = 0;
        this.field1571 = 0;
        this.field1578 = 0;
        this.field1577 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class93 var10 = arg0[var9];
            if (var10 != null) {
                this.field1590 += var10.field1590;
                this.field1571 += var10.field1571;
                this.field1578 += var10.field1578;
                if (var10.field1572 == null) {
                    if (this.field1577 == -1) {
                        this.field1577 = var10.field1577;
                    }
                    if (this.field1577 != var10.field1577) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1608 != null;
                var5 |= var10.field1573 != null;
                var6 |= var10.field1609 != null;
                var7 |= var10.field1576 != null;
                var8 |= var10.field1574 != null;
            }
        }
        this.field1564 = new int[this.field1590];
        this.field1565 = new int[this.field1590];
        this.field1566 = new int[this.field1590];
        this.field1569 = new int[this.field1590];
        this.field1570 = new int[this.field1571];
        this.field1607 = new int[this.field1571];
        this.field1586 = new int[this.field1571];
        if (var3) {
            this.field1608 = new byte[this.field1571];
        }
        if (var4) {
            this.field1572 = new byte[this.field1571];
        }
        if (var5) {
            this.field1573 = new byte[this.field1571];
        }
        if (var6) {
            this.field1609 = new int[this.field1571];
        }
        if (var7) {
            this.field1576 = new short[this.field1571];
        }
        if (var8) {
            this.field1574 = new byte[this.field1571];
        }
        this.field1567 = new short[this.field1571];
        if (this.field1578 > 0) {
            this.field1579 = new byte[this.field1578];
            this.field1580 = new short[this.field1578];
            this.field1563 = new short[this.field1578];
            this.field1582 = new short[this.field1578];
            this.field1593 = new short[this.field1578];
            this.field1584 = new short[this.field1578];
            this.field1585 = new short[this.field1578];
            this.field1591 = new short[this.field1578];
            this.field1575 = new byte[this.field1578];
            this.field1587 = new short[this.field1578];
            this.field1588 = new short[this.field1578];
        }
        this.field1590 = 0;
        this.field1571 = 0;
        this.field1578 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class93 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1571; var13++) {
                    if (var3 && var12.field1608 != null) {
                        this.field1608[this.field1571] = var12.field1608[var13];
                    }
                    if (var4) {
                        if (var12.field1572 == null) {
                            this.field1572[this.field1571] = var12.field1577;
                        } else {
                            this.field1572[this.field1571] = var12.field1572[var13];
                        }
                    }
                    if (var5 && var12.field1573 != null) {
                        this.field1573[this.field1571] = var12.field1573[var13];
                    }
                    if (var6 && var12.field1609 != null) {
                        this.field1609[this.field1571] = var12.field1609[var13];
                    }
                    if (var7) {
                        if (var12.field1576 == null) {
                            this.field1576[this.field1571] = -1;
                        } else {
                            this.field1576[this.field1571] = var12.field1576[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1574 == null || var12.field1574[var13] == -1) {
                            this.field1574[this.field1571] = -1;
                        } else {
                            this.field1574[this.field1571] = (byte) (var12.field1574[var13] + this.field1578);
                        }
                    }
                    this.field1567[this.field1571] = var12.field1567[var13];
                    this.field1570[this.field1571] = this.method1897(var12, var12.field1570[var13]);
                    this.field1607[this.field1571] = this.method1897(var12, var12.field1607[var13]);
                    this.field1586[this.field1571] = this.method1897(var12, var12.field1586[var13]);
                    this.field1571++;
                }
                for (int var14 = 0; var14 < var12.field1578; var14++) {
                    byte var15 = this.field1579[this.field1578] = var12.field1579[var14];
                    if (var15 == 0) {
                        this.field1580[this.field1578] = (short) this.method1897(var12, var12.field1580[var14]);
                        this.field1563[this.field1578] = (short) this.method1897(var12, var12.field1563[var14]);
                        this.field1582[this.field1578] = (short) this.method1897(var12, var12.field1582[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1580[this.field1578] = var12.field1580[var14];
                        this.field1563[this.field1578] = var12.field1563[var14];
                        this.field1582[this.field1578] = var12.field1582[var14];
                        this.field1593[this.field1578] = var12.field1593[var14];
                        this.field1584[this.field1578] = var12.field1584[var14];
                        this.field1585[this.field1578] = var12.field1585[var14];
                        this.field1591[this.field1578] = var12.field1591[var14];
                        this.field1575[this.field1578] = var12.field1575[var14];
                        this.field1587[this.field1578] = var12.field1587[var14];
                    }
                    if (var15 == 2) {
                        this.field1588[this.field1578] = var12.field1588[var14];
                    }
                    this.field1578++;
                }
            }
        }
    }

    @ObfuscatedName("cx.d(Lcx;I)I")
    public final int method1897(class93 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1564[arg1];
        int var5 = arg0.field1565[arg1];
        int var6 = arg0.field1566[arg1];
        for (int var7 = 0; var7 < this.field1590; var7++) {
            if (this.field1564[var7] == var4 && this.field1565[var7] == var5 && this.field1566[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1564[this.field1590] = var4;
            this.field1565[this.field1590] = var5;
            this.field1566[this.field1590] = var6;
            if (arg0.field1569 != null) {
                this.field1569[this.field1590] = arg0.field1569[arg1];
            }
            var3 = this.field1590++;
        }
        return var3;
    }

    public class93(class93 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1590 = arg0.field1590;
        this.field1571 = arg0.field1571;
        this.field1578 = arg0.field1578;
        if (arg1) {
            this.field1564 = arg0.field1564;
            this.field1565 = arg0.field1565;
            this.field1566 = arg0.field1566;
        } else {
            this.field1564 = new int[this.field1590];
            this.field1565 = new int[this.field1590];
            this.field1566 = new int[this.field1590];
            for (int var6 = 0; var6 < this.field1590; var6++) {
                this.field1564[var6] = arg0.field1564[var6];
                this.field1565[var6] = arg0.field1565[var6];
                this.field1566[var6] = arg0.field1566[var6];
            }
        }
        if (arg2) {
            this.field1567 = arg0.field1567;
        } else {
            this.field1567 = new short[this.field1571];
            for (int var7 = 0; var7 < this.field1571; var7++) {
                this.field1567[var7] = arg0.field1567[var7];
            }
        }
        if (arg3 || arg0.field1576 == null) {
            this.field1576 = arg0.field1576;
        } else {
            this.field1576 = new short[this.field1571];
            for (int var8 = 0; var8 < this.field1571; var8++) {
                this.field1576[var8] = arg0.field1576[var8];
            }
        }
        if (arg4) {
            this.field1573 = arg0.field1573;
        } else {
            this.field1573 = new byte[this.field1571];
            if (arg0.field1573 == null) {
                for (int var9 = 0; var9 < this.field1571; var9++) {
                    this.field1573[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1571; var10++) {
                    this.field1573[var10] = arg0.field1573[var10];
                }
            }
        }
        this.field1570 = arg0.field1570;
        this.field1607 = arg0.field1607;
        this.field1586 = arg0.field1586;
        this.field1608 = arg0.field1608;
        this.field1572 = arg0.field1572;
        this.field1574 = arg0.field1574;
        this.field1577 = arg0.field1577;
        this.field1579 = arg0.field1579;
        this.field1580 = arg0.field1580;
        this.field1563 = arg0.field1563;
        this.field1582 = arg0.field1582;
        this.field1593 = arg0.field1593;
        this.field1584 = arg0.field1584;
        this.field1585 = arg0.field1585;
        this.field1591 = arg0.field1591;
        this.field1575 = arg0.field1575;
        this.field1587 = arg0.field1587;
        this.field1588 = arg0.field1588;
        this.field1569 = arg0.field1569;
        this.field1609 = arg0.field1609;
        this.field1592 = arg0.field1592;
        this.field1600 = arg0.field1600;
        this.field1595 = arg0.field1595;
        this.field1594 = arg0.field1594;
        this.field1596 = arg0.field1596;
        this.field1597 = arg0.field1597;
        this.field1598 = arg0.field1598;
    }

    @ObfuscatedName("cx.w()Lcx;")
    public class93 method1891() {
        class93 var1 = new class93();
        if (this.field1608 != null) {
            var1.field1608 = new byte[this.field1571];
            for (int var2 = 0; var2 < this.field1571; var2++) {
                var1.field1608[var2] = this.field1608[var2];
            }
        }
        var1.field1590 = this.field1590;
        var1.field1571 = this.field1571;
        var1.field1578 = this.field1578;
        var1.field1564 = this.field1564;
        var1.field1565 = this.field1565;
        var1.field1566 = this.field1566;
        var1.field1570 = this.field1570;
        var1.field1607 = this.field1607;
        var1.field1586 = this.field1586;
        var1.field1572 = this.field1572;
        var1.field1573 = this.field1573;
        var1.field1574 = this.field1574;
        var1.field1567 = this.field1567;
        var1.field1576 = this.field1576;
        var1.field1577 = this.field1577;
        var1.field1579 = this.field1579;
        var1.field1580 = this.field1580;
        var1.field1563 = this.field1563;
        var1.field1582 = this.field1582;
        var1.field1593 = this.field1593;
        var1.field1584 = this.field1584;
        var1.field1585 = this.field1585;
        var1.field1591 = this.field1591;
        var1.field1575 = this.field1575;
        var1.field1587 = this.field1587;
        var1.field1588 = this.field1588;
        var1.field1569 = this.field1569;
        var1.field1609 = this.field1609;
        var1.field1592 = this.field1592;
        var1.field1600 = this.field1600;
        var1.field1595 = this.field1595;
        var1.field1594 = this.field1594;
        var1.field1597 = this.field1597;
        var1.field1598 = this.field1598;
        return var1;
    }

    @ObfuscatedName("cx.e([[IIIIZI)Lcx;")
    public class93 method1906(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1902();
        int var7 = this.field1601 + arg1;
        int var8 = this.field1602 + arg1;
        int var9 = this.field1604 + arg3;
        int var10 = this.field1603 + arg3;
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
            var15.field1590 = this.field1590;
            var15.field1571 = this.field1571;
            var15.field1578 = this.field1578;
            var15.field1564 = this.field1564;
            var15.field1566 = this.field1566;
            var15.field1570 = this.field1570;
            var15.field1607 = this.field1607;
            var15.field1586 = this.field1586;
            var15.field1608 = this.field1608;
            var15.field1572 = this.field1572;
            var15.field1573 = this.field1573;
            var15.field1574 = this.field1574;
            var15.field1567 = this.field1567;
            var15.field1576 = this.field1576;
            var15.field1577 = this.field1577;
            var15.field1579 = this.field1579;
            var15.field1580 = this.field1580;
            var15.field1563 = this.field1563;
            var15.field1582 = this.field1582;
            var15.field1593 = this.field1593;
            var15.field1584 = this.field1584;
            var15.field1585 = this.field1585;
            var15.field1591 = this.field1591;
            var15.field1575 = this.field1575;
            var15.field1587 = this.field1587;
            var15.field1588 = this.field1588;
            var15.field1569 = this.field1569;
            var15.field1609 = this.field1609;
            var15.field1592 = this.field1592;
            var15.field1600 = this.field1600;
            var15.field1597 = this.field1597;
            var15.field1598 = this.field1598;
            var15.field1565 = new int[var15.field1590];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1590; var16++) {
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
            for (int var26 = 0; var26 < var15.field1590; var26++) {
                int var27 = (-this.field1565[var26] << 16) / this.field1339;
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
        var15.method1905();
        return var15;
    }

    @ObfuscatedName("cx.o()V")
    public void method1901() {
        int var10002;
        if (this.field1569 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1590; var3++) {
                int var4 = this.field1569[var3];
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
            while (var6 < this.field1590) {
                int var7 = this.field1569[var6];
                this.field1592[var7][var1[var7]++] = var6++;
            }
            this.field1569 = null;
        }
        if (this.field1609 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1571; var10++) {
            int var11 = this.field1609[var10];
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
        while (var13 < this.field1571) {
            int var14 = this.field1609[var13];
            this.field1600[var14][var8[var14]++] = var13++;
        }
        this.field1609 = null;
    }

    @ObfuscatedName("cx.v()V")
    public void method1886() {
        for (int var1 = 0; var1 < this.field1590; var1++) {
            int var2 = this.field1564[var1];
            this.field1564[var1] = this.field1566[var1];
            this.field1566[var1] = -var2;
        }
        this.method1905();
    }

    @ObfuscatedName("cx.z()V")
    public void method1892() {
        for (int var1 = 0; var1 < this.field1590; var1++) {
            this.field1564[var1] = -this.field1564[var1];
            this.field1566[var1] = -this.field1566[var1];
        }
        this.method1905();
    }

    @ObfuscatedName("cx.j()V")
    public void method1940() {
        for (int var1 = 0; var1 < this.field1590; var1++) {
            int var2 = this.field1566[var1];
            this.field1566[var1] = this.field1564[var1];
            this.field1564[var1] = -var2;
        }
        this.method1905();
    }

    @ObfuscatedName("cx.r(I)V")
    public void method1898(int arg0) {
        int var2 = field1581[arg0];
        int var3 = field1589[arg0];
        for (int var4 = 0; var4 < this.field1590; var4++) {
            int var5 = this.field1566[var4] * var2 + this.field1564[var4] * var3 >> 16;
            this.field1566[var4] = this.field1566[var4] * var3 - this.field1564[var4] * var2 >> 16;
            this.field1564[var4] = var5;
        }
        this.method1905();
    }

    @ObfuscatedName("cx.c(III)V")
    public void method1899(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1590; var4++) {
            this.field1564[var4] += arg0;
            this.field1565[var4] += arg1;
            this.field1566[var4] += arg2;
        }
        this.method1905();
    }

    @ObfuscatedName("cx.u(SS)V")
    public void method1907(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1571; var3++) {
            if (this.field1567[var3] == arg0) {
                this.field1567[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cx.h(SS)V")
    public void method1953(short arg0, short arg1) {
        if (this.field1576 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1571; var3++) {
            if (this.field1576[var3] == arg0) {
                this.field1576[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cx.t()V")
    public void method1890() {
        for (int var1 = 0; var1 < this.field1590; var1++) {
            this.field1566[var1] = -this.field1566[var1];
        }
        for (int var2 = 0; var2 < this.field1571; var2++) {
            int var3 = this.field1570[var2];
            this.field1570[var2] = this.field1586[var2];
            this.field1586[var2] = var3;
        }
        this.method1905();
    }

    @ObfuscatedName("cx.f(III)V")
    public void method1903(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1590; var4++) {
            this.field1564[var4] = this.field1564[var4] * arg0 / 128;
            this.field1565[var4] = this.field1565[var4] * arg1 / 128;
            this.field1566[var4] = this.field1566[var4] * arg2 / 128;
        }
        this.method1905();
    }

    @ObfuscatedName("cx.g()V")
    public void method1957() {
        if (this.field1595 != null) {
            return;
        }
        this.field1595 = new class89[this.field1590];
        for (int var1 = 0; var1 < this.field1590; var1++) {
            this.field1595[var1] = new class89();
        }
        for (int var2 = 0; var2 < this.field1571; var2++) {
            int var3 = this.field1570[var2];
            int var4 = this.field1607[var2];
            int var5 = this.field1586[var2];
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
            if (this.field1608 == null) {
                var19 = 0;
            } else {
                var19 = this.field1608[var2];
            }
            if (var19 == 0) {
                class89 var20 = this.field1595[var3];
                var20.field1512 += var16;
                var20.field1513 += var17;
                var20.field1505 += var18;
                var20.field1506++;
                class89 var21 = this.field1595[var4];
                var21.field1512 += var16;
                var21.field1513 += var17;
                var21.field1505 += var18;
                var21.field1506++;
                class89 var22 = this.field1595[var5];
                var22.field1512 += var16;
                var22.field1513 += var17;
                var22.field1505 += var18;
                var22.field1506++;
            } else if (var19 == 1) {
                if (this.field1594 == null) {
                    this.field1594 = new class77[this.field1571];
                }
                class77 var23 = this.field1594[var2] = new class77();
                var23.field1338 = var16;
                var23.field1332 = var17;
                var23.field1334 = var18;
            }
        }
    }

    @ObfuscatedName("cx.s()V")
    public void method1905() {
        this.field1595 = null;
        this.field1596 = null;
        this.field1594 = null;
        this.field1599 = false;
    }

    @ObfuscatedName("cx.y()V")
    public void method1902() {
        if (this.field1599) {
            return;
        }
        this.field1339 = 0;
        this.field1583 = 0;
        this.field1601 = 999999;
        this.field1602 = -999999;
        this.field1603 = -99999;
        this.field1604 = 99999;
        for (int var1 = 0; var1 < this.field1590; var1++) {
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
            if (var4 > this.field1603) {
                this.field1603 = var4;
            }
            if (-var3 > this.field1339) {
                this.field1339 = -var3;
            }
            if (var3 > this.field1583) {
                this.field1583 = var3;
            }
        }
        this.field1599 = true;
    }

    @ObfuscatedName("cx.p(Lcx;Lcx;IIIZ)V")
    public static void method1900(class93 arg0, class93 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1902();
        arg0.method1957();
        arg1.method1902();
        arg1.method1957();
        field1568++;
        int var6 = 0;
        int[] var7 = arg1.field1564;
        int var8 = arg1.field1590;
        for (int var9 = 0; var9 < arg0.field1590; var9++) {
            class89 var10 = arg0.field1595[var9];
            if (var10.field1506 != 0) {
                int var11 = arg0.field1565[var9] - arg3;
                if (var11 <= arg1.field1583) {
                    int var12 = arg0.field1564[var9] - arg2;
                    if (var12 >= arg1.field1601 && var12 <= arg1.field1602) {
                        int var13 = arg0.field1566[var9] - arg4;
                        if (var13 >= arg1.field1604 && var13 <= arg1.field1603) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class89 var15 = arg1.field1595[var14];
                                if (var7[var14] == var12 && arg1.field1566[var14] == var13 && arg1.field1565[var14] == var11 && var15.field1506 != 0) {
                                    if (arg0.field1596 == null) {
                                        arg0.field1596 = new class89[arg0.field1590];
                                    }
                                    if (arg1.field1596 == null) {
                                        arg1.field1596 = new class89[var8];
                                    }
                                    class89 var16 = arg0.field1596[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1596[var9] = new class89(var10);
                                    }
                                    class89 var17 = arg1.field1596[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1596[var14] = new class89(var15);
                                    }
                                    var16.field1512 += var15.field1512;
                                    var16.field1513 += var15.field1513;
                                    var16.field1505 += var15.field1505;
                                    var16.field1506 += var15.field1506;
                                    var17.field1512 += var10.field1512;
                                    var17.field1513 += var10.field1513;
                                    var17.field1505 += var10.field1505;
                                    var17.field1506 += var10.field1506;
                                    var6++;
                                    field1605[var9] = field1568;
                                    field1606[var14] = field1568;
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
        for (int var18 = 0; var18 < arg0.field1571; var18++) {
            if (field1605[arg0.field1570[var18]] == field1568 && field1605[arg0.field1607[var18]] == field1568 && field1605[arg0.field1586[var18]] == field1568) {
                if (arg0.field1608 == null) {
                    arg0.field1608 = new byte[arg0.field1571];
                }
                arg0.field1608[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1571; var19++) {
            if (field1606[arg1.field1570[var19]] == field1568 && field1606[arg1.field1607[var19]] == field1568 && field1606[arg1.field1586[var19]] == field1568) {
                if (arg1.field1608 == null) {
                    arg1.field1608 = new byte[arg1.field1571];
                }
                arg1.field1608[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cx.b(IIIII)Lcy;")
    public final class98 method1908(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1957();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class98 var8 = new class98();
        var8.field1738 = new int[this.field1571];
        var8.field1692 = new int[this.field1571];
        var8.field1693 = new int[this.field1571];
        if (this.field1578 > 0 && this.field1574 != null) {
            int[] var9 = new int[this.field1578];
            for (int var10 = 0; var10 < this.field1571; var10++) {
                if (this.field1574[var10] != -1) {
                    var9[this.field1574[var10] & 0xFF]++;
                }
            }
            var8.field1699 = 0;
            for (int var11 = 0; var11 < this.field1578; var11++) {
                if (var9[var11] > 0 && this.field1579[var11] == 0) {
                    var8.field1699++;
                }
            }
            var8.field1700 = new int[var8.field1699];
            var8.field1701 = new int[var8.field1699];
            var8.field1728 = new int[var8.field1699];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1578; var13++) {
                if (var9[var13] > 0 && this.field1579[var13] == 0) {
                    var8.field1700[var12] = this.field1580[var13] & 0xFFFF;
                    var8.field1701[var12] = this.field1563[var13] & 0xFFFF;
                    var8.field1728[var12] = this.field1582[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1737 = new byte[this.field1571];
            for (int var14 = 0; var14 < this.field1571; var14++) {
                if (this.field1574[var14] == -1) {
                    var8.field1737[var14] = -1;
                } else {
                    var8.field1737[var14] = (byte) var9[this.field1574[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1571; var15++) {
            byte var16;
            if (this.field1608 == null) {
                var16 = 0;
            } else {
                var16 = this.field1608[var15];
            }
            byte var17;
            if (this.field1573 == null) {
                var17 = 0;
            } else {
                var17 = this.field1573[var15];
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
                    int var19 = this.field1567[var15] & 0xFFFF;
                    class89 var20;
                    if (this.field1596 == null || this.field1596[this.field1570[var15]] == null) {
                        var20 = this.field1595[this.field1570[var15]];
                    } else {
                        var20 = this.field1596[this.field1570[var15]];
                    }
                    int var21 = (var20.field1505 * arg4 + var20.field1513 * arg3 + var20.field1512 * arg2) / (var20.field1506 * var7) + arg0;
                    var8.field1738[var15] = method1909(var19, var21);
                    class89 var22;
                    if (this.field1596 == null || this.field1596[this.field1607[var15]] == null) {
                        var22 = this.field1595[this.field1607[var15]];
                    } else {
                        var22 = this.field1596[this.field1607[var15]];
                    }
                    int var23 = (var22.field1505 * arg4 + var22.field1513 * arg3 + var22.field1512 * arg2) / (var22.field1506 * var7) + arg0;
                    var8.field1692[var15] = method1909(var19, var23);
                    class89 var24;
                    if (this.field1596 == null || this.field1596[this.field1586[var15]] == null) {
                        var24 = this.field1595[this.field1586[var15]];
                    } else {
                        var24 = this.field1596[this.field1586[var15]];
                    }
                    int var25 = (var24.field1505 * arg4 + var24.field1513 * arg3 + var24.field1512 * arg2) / (var24.field1506 * var7) + arg0;
                    var8.field1693[var15] = method1909(var19, var25);
                } else if (var16 == 1) {
                    class77 var26 = this.field1594[var15];
                    int var27 = (var26.field1334 * arg4 + var26.field1338 * arg2 + var26.field1332 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1738[var15] = method1909(this.field1567[var15] & 0xFFFF, var27);
                    var8.field1693[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1738[var15] = 128;
                    var8.field1693[var15] = -1;
                } else {
                    var8.field1693[var15] = -2;
                }
            } else if (var16 == 0) {
                class89 var28;
                if (this.field1596 == null || this.field1596[this.field1570[var15]] == null) {
                    var28 = this.field1595[this.field1570[var15]];
                } else {
                    var28 = this.field1596[this.field1570[var15]];
                }
                int var29 = (var28.field1505 * arg4 + var28.field1513 * arg3 + var28.field1512 * arg2) / (var28.field1506 * var7) + arg0;
                var8.field1738[var15] = method1921(var29);
                class89 var30;
                if (this.field1596 == null || this.field1596[this.field1607[var15]] == null) {
                    var30 = this.field1595[this.field1607[var15]];
                } else {
                    var30 = this.field1596[this.field1607[var15]];
                }
                int var31 = (var30.field1505 * arg4 + var30.field1513 * arg3 + var30.field1512 * arg2) / (var30.field1506 * var7) + arg0;
                var8.field1692[var15] = method1921(var31);
                class89 var32;
                if (this.field1596 == null || this.field1596[this.field1586[var15]] == null) {
                    var32 = this.field1595[this.field1586[var15]];
                } else {
                    var32 = this.field1596[this.field1586[var15]];
                }
                int var33 = (var32.field1505 * arg4 + var32.field1513 * arg3 + var32.field1512 * arg2) / (var32.field1506 * var7) + arg0;
                var8.field1693[var15] = method1921(var33);
            } else if (var16 == 1) {
                class77 var34 = this.field1594[var15];
                int var35 = (var34.field1334 * arg4 + var34.field1338 * arg2 + var34.field1332 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1738[var15] = method1921(var35);
                var8.field1693[var15] = -1;
            } else {
                var8.field1693[var15] = -2;
            }
        }
        this.method1901();
        var8.field1683 = this.field1590;
        var8.field1691 = this.field1564;
        var8.field1679 = this.field1565;
        var8.field1694 = this.field1566;
        var8.field1696 = this.field1571;
        var8.field1688 = this.field1570;
        var8.field1714 = this.field1607;
        var8.field1690 = this.field1586;
        var8.field1720 = this.field1572;
        var8.field1684 = this.field1573;
        var8.field1698 = this.field1577;
        var8.field1703 = this.field1592;
        var8.field1704 = this.field1600;
        var8.field1706 = this.field1576;
        return var8;
    }

    @ObfuscatedName("cx.ar(II)I")
    public static final int method1909(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cx.ak(I)I")
    public static final int method1921(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
