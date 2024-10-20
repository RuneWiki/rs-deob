package deob;

@ObfuscatedName("ce")
public class class94 extends class79 {

    @ObfuscatedName("ce.c")
    public int field1601 = 0;

    @ObfuscatedName("ce.j")
    public int[] field1573;

    @ObfuscatedName("ce.y")
    public int[] field1581;

    @ObfuscatedName("ce.r")
    public int[] field1575;

    @ObfuscatedName("ce.f")
    public int field1576 = 0;

    @ObfuscatedName("ce.l")
    public int[] field1577;

    @ObfuscatedName("ce.b")
    public int[] field1574;

    @ObfuscatedName("ce.k")
    public int[] field1583;

    @ObfuscatedName("ce.g")
    public byte[] field1580;

    @ObfuscatedName("ce.v")
    public byte[] field1606;

    @ObfuscatedName("ce.i")
    public byte[] field1582;

    @ObfuscatedName("ce.x")
    public byte[] field1598;

    @ObfuscatedName("ce.h")
    public short[] field1584;

    @ObfuscatedName("ce.w")
    public short[] field1585;

    @ObfuscatedName("ce.s")
    public byte field1586 = 0;

    @ObfuscatedName("ce.p")
    public int field1587;

    @ObfuscatedName("ce.z")
    public byte[] field1588;

    @ObfuscatedName("ce.n")
    public short[] field1589;

    @ObfuscatedName("ce.u")
    public short[] field1616;

    @ObfuscatedName("ce.a")
    public short[] field1591;

    @ObfuscatedName("ce.d")
    public short[] field1592;

    @ObfuscatedName("ce.m")
    public short[] field1615;

    @ObfuscatedName("ce.q")
    public short[] field1594;

    @ObfuscatedName("ce.e")
    public short[] field1595;

    @ObfuscatedName("ce.t")
    public short[] field1596;

    @ObfuscatedName("ce.o")
    public short[] field1572;

    @ObfuscatedName("ce.at")
    public byte[] field1613;

    @ObfuscatedName("ce.ag")
    public int[] field1599;

    @ObfuscatedName("ce.ae")
    public int[] field1600;

    @ObfuscatedName("ce.ak")
    public int[][] field1593;

    @ObfuscatedName("ce.ap")
    public int[][] field1602;

    @ObfuscatedName("ce.ao")
    public class78[] field1603;

    @ObfuscatedName("ce.ac")
    public class90[] field1604;

    @ObfuscatedName("ce.as")
    public class90[] field1605;

    @ObfuscatedName("ce.ai")
    public short field1618;

    @ObfuscatedName("ce.ab")
    public short field1607;

    @ObfuscatedName("ce.an")
    public boolean field1608 = false;

    @ObfuscatedName("ce.ah")
    public int field1609;

    @ObfuscatedName("ce.ad")
    public int field1610;

    @ObfuscatedName("ce.af")
    public int field1611;

    @ObfuscatedName("ce.aj")
    public int field1612;

    @ObfuscatedName("ce.am")
    public int field1578;

    @ObfuscatedName("ce.ay")
    public static int[] field1614 = new int[10000];

    @ObfuscatedName("ce.au")
    public static int[] field1597 = new int[10000];

    @ObfuscatedName("ce.aa")
    public static int field1579 = 0;

    @ObfuscatedName("ce.aq")
    public static int[] field1617 = class85.field1472;

    @ObfuscatedName("ce.av")
    public static int[] field1590 = class85.field1473;

    public class94() {
    }

    @ObfuscatedName("ce.c(Ler;II)Lce;")
    public static class94 method1955(class149 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2746(arg1, arg2);
        return var3 == null ? null : new class94(var3);
    }

    public class94(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1960(arg0);
        } else {
            this.method1902(arg0);
        }
    }

    @ObfuscatedName("ce.y([B)V")
    public void method1960(byte[] arg0) {
        class108 var2 = new class108(arg0);
        class108 var3 = new class108(arg0);
        class108 var4 = new class108(arg0);
        class108 var5 = new class108(arg0);
        class108 var6 = new class108(arg0);
        class108 var7 = new class108(arg0);
        class108 var8 = new class108(arg0);
        var2.field1826 = arg0.length - 23;
        int var9 = var2.method2136();
        int var10 = var2.method2136();
        int var11 = var2.method2134();
        int var12 = var2.method2134();
        int var13 = var2.method2134();
        int var14 = var2.method2134();
        int var15 = var2.method2134();
        int var16 = var2.method2134();
        int var17 = var2.method2134();
        int var18 = var2.method2136();
        int var19 = var2.method2136();
        int var20 = var2.method2136();
        int var21 = var2.method2136();
        int var22 = var2.method2136();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1588 = new byte[var11];
            var2.field1826 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1588[var26] = var2.method2229();
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
        this.field1576 = var10;
        this.field1587 = var11;
        this.field1573 = new int[var9];
        this.field1581 = new int[var9];
        this.field1575 = new int[var9];
        this.field1577 = new int[var10];
        this.field1574 = new int[var10];
        this.field1583 = new int[var10];
        if (var17 == 1) {
            this.field1599 = new int[var9];
        }
        if (var12 == 1) {
            this.field1580 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1606 = new byte[var10];
        } else {
            this.field1586 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1582 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1600 = new int[var10];
        }
        if (var16 == 1) {
            this.field1585 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1598 = new byte[var10];
        }
        this.field1584 = new short[var10];
        if (var11 > 0) {
            this.field1589 = new short[var11];
            this.field1616 = new short[var11];
            this.field1591 = new short[var11];
            if (var24 > 0) {
                this.field1592 = new short[var24];
                this.field1615 = new short[var24];
                this.field1594 = new short[var24];
                this.field1595 = new short[var24];
                this.field1613 = new byte[var24];
                this.field1596 = new short[var24];
            }
            if (var25 > 0) {
                this.field1572 = new short[var25];
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
            int var68 = var2.method2134();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2146();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2146();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2146();
            }
            this.field1573[var67] = var64 + var69;
            this.field1581[var67] = var65 + var70;
            this.field1575[var67] = var66 + var71;
            var64 = this.field1573[var67];
            var65 = this.field1581[var67];
            var66 = this.field1575[var67];
            if (var17 == 1) {
                this.field1599[var67] = var6.method2134();
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
            this.field1584[var72] = (short) var2.method2136();
            if (var12 == 1) {
                this.field1580[var72] = var3.method2229();
            }
            if (var13 == 255) {
                this.field1606[var72] = var4.method2229();
            }
            if (var14 == 1) {
                this.field1582[var72] = var5.method2229();
            }
            if (var15 == 1) {
                this.field1600[var72] = var6.method2134();
            }
            if (var16 == 1) {
                this.field1585[var72] = (short) (var7.method2136() - 1);
            }
            if (this.field1598 != null && this.field1585[var72] != -1) {
                this.field1598[var72] = (byte) (var8.method2134() - 1);
            }
        }
        var2.field1826 = var33;
        var3.field1826 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2134();
            if (var78 == 1) {
                var73 = var2.method2146() + var76;
                var74 = var2.method2146() + var73;
                var75 = var2.method2146() + var74;
                var76 = var75;
                this.field1577[var77] = var73;
                this.field1574[var77] = var74;
                this.field1583[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2146() + var76;
                var76 = var75;
                this.field1577[var77] = var73;
                this.field1574[var77] = var74;
                this.field1583[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2146() + var76;
                var76 = var75;
                this.field1577[var77] = var73;
                this.field1574[var77] = var74;
                this.field1583[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2146() + var76;
                var76 = var75;
                this.field1577[var77] = var73;
                this.field1574[var77] = var81;
                this.field1583[var77] = var75;
            }
        }
        var2.field1826 = var50;
        var3.field1826 = var52;
        var4.field1826 = var54;
        var5.field1826 = var56;
        var6.field1826 = var58;
        var7.field1826 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1588[var82] & 0xFF;
            if (var83 == 0) {
                this.field1589[var82] = (short) var2.method2136();
                this.field1616[var82] = (short) var2.method2136();
                this.field1591[var82] = (short) var2.method2136();
            }
            if (var83 == 1) {
                this.field1589[var82] = (short) var3.method2136();
                this.field1616[var82] = (short) var3.method2136();
                this.field1591[var82] = (short) var3.method2136();
                this.field1592[var82] = (short) var4.method2136();
                this.field1615[var82] = (short) var4.method2136();
                this.field1594[var82] = (short) var4.method2136();
                this.field1595[var82] = (short) var5.method2136();
                this.field1613[var82] = var6.method2229();
                this.field1596[var82] = (short) var7.method2136();
            }
            if (var83 == 2) {
                this.field1589[var82] = (short) var3.method2136();
                this.field1616[var82] = (short) var3.method2136();
                this.field1591[var82] = (short) var3.method2136();
                this.field1592[var82] = (short) var4.method2136();
                this.field1615[var82] = (short) var4.method2136();
                this.field1594[var82] = (short) var4.method2136();
                this.field1595[var82] = (short) var5.method2136();
                this.field1613[var82] = var6.method2229();
                this.field1596[var82] = (short) var7.method2136();
                this.field1572[var82] = (short) var7.method2136();
            }
            if (var83 == 3) {
                this.field1589[var82] = (short) var3.method2136();
                this.field1616[var82] = (short) var3.method2136();
                this.field1591[var82] = (short) var3.method2136();
                this.field1592[var82] = (short) var4.method2136();
                this.field1615[var82] = (short) var4.method2136();
                this.field1594[var82] = (short) var4.method2136();
                this.field1595[var82] = (short) var5.method2136();
                this.field1613[var82] = var6.method2229();
                this.field1596[var82] = (short) var7.method2136();
            }
        }
        var2.field1826 = var62;
        int var84 = var2.method2134();
        if (var84 == 0) {
            return;
        }
        new class84();
        var2.method2136();
        var2.method2136();
        var2.method2136();
        var2.method2144();
    }

    @ObfuscatedName("ce.r([B)V")
    public void method1902(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class108 var4 = new class108(arg0);
        class108 var5 = new class108(arg0);
        class108 var6 = new class108(arg0);
        class108 var7 = new class108(arg0);
        class108 var8 = new class108(arg0);
        var4.field1826 = arg0.length - 18;
        int var9 = var4.method2136();
        int var10 = var4.method2136();
        int var11 = var4.method2134();
        int var12 = var4.method2134();
        int var13 = var4.method2134();
        int var14 = var4.method2134();
        int var15 = var4.method2134();
        int var16 = var4.method2134();
        int var17 = var4.method2136();
        int var18 = var4.method2136();
        int var19 = var4.method2136();
        int var20 = var4.method2136();
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
        this.field1576 = var10;
        this.field1587 = var11;
        this.field1573 = new int[var9];
        this.field1581 = new int[var9];
        this.field1575 = new int[var9];
        this.field1577 = new int[var10];
        this.field1574 = new int[var10];
        this.field1583 = new int[var10];
        if (var11 > 0) {
            this.field1588 = new byte[var11];
            this.field1589 = new short[var11];
            this.field1616 = new short[var11];
            this.field1591 = new short[var11];
        }
        if (var16 == 1) {
            this.field1599 = new int[var9];
        }
        if (var12 == 1) {
            this.field1580 = new byte[var10];
            this.field1598 = new byte[var10];
            this.field1585 = new short[var10];
        }
        if (var13 == 255) {
            this.field1606 = new byte[var10];
        } else {
            this.field1586 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1582 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1600 = new int[var10];
        }
        this.field1584 = new short[var10];
        var4.field1826 = var21;
        var5.field1826 = var36;
        var6.field1826 = var38;
        var7.field1826 = var40;
        var8.field1826 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2134();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2146();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2146();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2146();
            }
            this.field1573[var46] = var43 + var48;
            this.field1581[var46] = var44 + var49;
            this.field1575[var46] = var45 + var50;
            var43 = this.field1573[var46];
            var44 = this.field1581[var46];
            var45 = this.field1575[var46];
            if (var16 == 1) {
                this.field1599[var46] = var8.method2134();
            }
        }
        var4.field1826 = var32;
        var5.field1826 = var28;
        var6.field1826 = var26;
        var7.field1826 = var30;
        var8.field1826 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1584[var51] = (short) var4.method2136();
            if (var12 == 1) {
                int var52 = var5.method2134();
                if ((var52 & 0x1) == 1) {
                    this.field1580[var51] = 1;
                    var2 = true;
                } else {
                    this.field1580[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1598[var51] = (byte) (var52 >> 2);
                    this.field1585[var51] = this.field1584[var51];
                    this.field1584[var51] = 127;
                    if (this.field1585[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1598[var51] = -1;
                    this.field1585[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1606[var51] = var6.method2229();
            }
            if (var14 == 1) {
                this.field1582[var51] = var7.method2229();
            }
            if (var15 == 1) {
                this.field1600[var51] = var8.method2134();
            }
        }
        var4.field1826 = var25;
        var5.field1826 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2134();
            if (var58 == 1) {
                var53 = var4.method2146() + var56;
                var54 = var4.method2146() + var53;
                var55 = var4.method2146() + var54;
                var56 = var55;
                this.field1577[var57] = var53;
                this.field1574[var57] = var54;
                this.field1583[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2146() + var56;
                var56 = var55;
                this.field1577[var57] = var53;
                this.field1574[var57] = var54;
                this.field1583[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2146() + var56;
                var56 = var55;
                this.field1577[var57] = var53;
                this.field1574[var57] = var54;
                this.field1583[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2146() + var56;
                var56 = var55;
                this.field1577[var57] = var53;
                this.field1574[var57] = var61;
                this.field1583[var57] = var55;
            }
        }
        var4.field1826 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1588[var62] = 0;
            this.field1589[var62] = (short) var4.method2136();
            this.field1616[var62] = (short) var4.method2136();
            this.field1591[var62] = (short) var4.method2136();
        }
        if (this.field1598 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1598[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1589[var65] & 0xFFFF) == this.field1577[var64] && (this.field1616[var65] & 0xFFFF) == this.field1574[var64] && (this.field1591[var65] & 0xFFFF) == this.field1583[var64]) {
                        this.field1598[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1598 = null;
            }
        }
        if (!var3) {
            this.field1585 = null;
        }
        if (!var2) {
            this.field1580 = null;
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
        this.field1576 = 0;
        this.field1587 = 0;
        this.field1586 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class94 var10 = arg0[var9];
            if (var10 != null) {
                this.field1601 += var10.field1601;
                this.field1576 += var10.field1576;
                this.field1587 += var10.field1587;
                if (var10.field1606 == null) {
                    if (this.field1586 == -1) {
                        this.field1586 = var10.field1586;
                    }
                    if (this.field1586 != var10.field1586) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1580 != null;
                var5 |= var10.field1582 != null;
                var6 |= var10.field1600 != null;
                var7 |= var10.field1585 != null;
                var8 |= var10.field1598 != null;
            }
        }
        this.field1573 = new int[this.field1601];
        this.field1581 = new int[this.field1601];
        this.field1575 = new int[this.field1601];
        this.field1599 = new int[this.field1601];
        this.field1577 = new int[this.field1576];
        this.field1574 = new int[this.field1576];
        this.field1583 = new int[this.field1576];
        if (var3) {
            this.field1580 = new byte[this.field1576];
        }
        if (var4) {
            this.field1606 = new byte[this.field1576];
        }
        if (var5) {
            this.field1582 = new byte[this.field1576];
        }
        if (var6) {
            this.field1600 = new int[this.field1576];
        }
        if (var7) {
            this.field1585 = new short[this.field1576];
        }
        if (var8) {
            this.field1598 = new byte[this.field1576];
        }
        this.field1584 = new short[this.field1576];
        if (this.field1587 > 0) {
            this.field1588 = new byte[this.field1587];
            this.field1589 = new short[this.field1587];
            this.field1616 = new short[this.field1587];
            this.field1591 = new short[this.field1587];
            this.field1592 = new short[this.field1587];
            this.field1615 = new short[this.field1587];
            this.field1594 = new short[this.field1587];
            this.field1595 = new short[this.field1587];
            this.field1613 = new byte[this.field1587];
            this.field1596 = new short[this.field1587];
            this.field1572 = new short[this.field1587];
        }
        this.field1601 = 0;
        this.field1576 = 0;
        this.field1587 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class94 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1576; var13++) {
                    if (var3 && var12.field1580 != null) {
                        this.field1580[this.field1576] = var12.field1580[var13];
                    }
                    if (var4) {
                        if (var12.field1606 == null) {
                            this.field1606[this.field1576] = var12.field1586;
                        } else {
                            this.field1606[this.field1576] = var12.field1606[var13];
                        }
                    }
                    if (var5 && var12.field1582 != null) {
                        this.field1582[this.field1576] = var12.field1582[var13];
                    }
                    if (var6 && var12.field1600 != null) {
                        this.field1600[this.field1576] = var12.field1600[var13];
                    }
                    if (var7) {
                        if (var12.field1585 == null) {
                            this.field1585[this.field1576] = -1;
                        } else {
                            this.field1585[this.field1576] = var12.field1585[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1598 == null || var12.field1598[var13] == -1) {
                            this.field1598[this.field1576] = -1;
                        } else {
                            this.field1598[this.field1576] = (byte) (var12.field1598[var13] + this.field1587);
                        }
                    }
                    this.field1584[this.field1576] = var12.field1584[var13];
                    this.field1577[this.field1576] = this.method1906(var12, var12.field1577[var13]);
                    this.field1574[this.field1576] = this.method1906(var12, var12.field1574[var13]);
                    this.field1583[this.field1576] = this.method1906(var12, var12.field1583[var13]);
                    this.field1576++;
                }
                for (int var14 = 0; var14 < var12.field1587; var14++) {
                    byte var15 = this.field1588[this.field1587] = var12.field1588[var14];
                    if (var15 == 0) {
                        this.field1589[this.field1587] = (short) this.method1906(var12, var12.field1589[var14]);
                        this.field1616[this.field1587] = (short) this.method1906(var12, var12.field1616[var14]);
                        this.field1591[this.field1587] = (short) this.method1906(var12, var12.field1591[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1589[this.field1587] = var12.field1589[var14];
                        this.field1616[this.field1587] = var12.field1616[var14];
                        this.field1591[this.field1587] = var12.field1591[var14];
                        this.field1592[this.field1587] = var12.field1592[var14];
                        this.field1615[this.field1587] = var12.field1615[var14];
                        this.field1594[this.field1587] = var12.field1594[var14];
                        this.field1595[this.field1587] = var12.field1595[var14];
                        this.field1613[this.field1587] = var12.field1613[var14];
                        this.field1596[this.field1587] = var12.field1596[var14];
                    }
                    if (var15 == 2) {
                        this.field1572[this.field1587] = var12.field1572[var14];
                    }
                    this.field1587++;
                }
            }
        }
    }

    @ObfuscatedName("ce.f(Lce;I)I")
    public final int method1906(class94 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1573[arg1];
        int var5 = arg0.field1581[arg1];
        int var6 = arg0.field1575[arg1];
        for (int var7 = 0; var7 < this.field1601; var7++) {
            if (this.field1573[var7] == var4 && this.field1581[var7] == var5 && this.field1575[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1573[this.field1601] = var4;
            this.field1581[this.field1601] = var5;
            this.field1575[this.field1601] = var6;
            if (arg0.field1599 != null) {
                this.field1599[this.field1601] = arg0.field1599[arg1];
            }
            var3 = this.field1601++;
        }
        return var3;
    }

    public class94(class94 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1601 = arg0.field1601;
        this.field1576 = arg0.field1576;
        this.field1587 = arg0.field1587;
        if (arg1) {
            this.field1573 = arg0.field1573;
            this.field1581 = arg0.field1581;
            this.field1575 = arg0.field1575;
        } else {
            this.field1573 = new int[this.field1601];
            this.field1581 = new int[this.field1601];
            this.field1575 = new int[this.field1601];
            for (int var6 = 0; var6 < this.field1601; var6++) {
                this.field1573[var6] = arg0.field1573[var6];
                this.field1581[var6] = arg0.field1581[var6];
                this.field1575[var6] = arg0.field1575[var6];
            }
        }
        if (arg2) {
            this.field1584 = arg0.field1584;
        } else {
            this.field1584 = new short[this.field1576];
            for (int var7 = 0; var7 < this.field1576; var7++) {
                this.field1584[var7] = arg0.field1584[var7];
            }
        }
        if (arg3 || arg0.field1585 == null) {
            this.field1585 = arg0.field1585;
        } else {
            this.field1585 = new short[this.field1576];
            for (int var8 = 0; var8 < this.field1576; var8++) {
                this.field1585[var8] = arg0.field1585[var8];
            }
        }
        if (arg4) {
            this.field1582 = arg0.field1582;
        } else {
            this.field1582 = new byte[this.field1576];
            if (arg0.field1582 == null) {
                for (int var9 = 0; var9 < this.field1576; var9++) {
                    this.field1582[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1576; var10++) {
                    this.field1582[var10] = arg0.field1582[var10];
                }
            }
        }
        this.field1577 = arg0.field1577;
        this.field1574 = arg0.field1574;
        this.field1583 = arg0.field1583;
        this.field1580 = arg0.field1580;
        this.field1606 = arg0.field1606;
        this.field1598 = arg0.field1598;
        this.field1586 = arg0.field1586;
        this.field1588 = arg0.field1588;
        this.field1589 = arg0.field1589;
        this.field1616 = arg0.field1616;
        this.field1591 = arg0.field1591;
        this.field1592 = arg0.field1592;
        this.field1615 = arg0.field1615;
        this.field1594 = arg0.field1594;
        this.field1595 = arg0.field1595;
        this.field1613 = arg0.field1613;
        this.field1596 = arg0.field1596;
        this.field1572 = arg0.field1572;
        this.field1599 = arg0.field1599;
        this.field1600 = arg0.field1600;
        this.field1593 = arg0.field1593;
        this.field1602 = arg0.field1602;
        this.field1604 = arg0.field1604;
        this.field1603 = arg0.field1603;
        this.field1605 = arg0.field1605;
        this.field1618 = arg0.field1618;
        this.field1607 = arg0.field1607;
    }

    @ObfuscatedName("ce.l()Lce;")
    public class94 method1933() {
        class94 var1 = new class94();
        if (this.field1580 != null) {
            var1.field1580 = new byte[this.field1576];
            for (int var2 = 0; var2 < this.field1576; var2++) {
                var1.field1580[var2] = this.field1580[var2];
            }
        }
        var1.field1601 = this.field1601;
        var1.field1576 = this.field1576;
        var1.field1587 = this.field1587;
        var1.field1573 = this.field1573;
        var1.field1581 = this.field1581;
        var1.field1575 = this.field1575;
        var1.field1577 = this.field1577;
        var1.field1574 = this.field1574;
        var1.field1583 = this.field1583;
        var1.field1606 = this.field1606;
        var1.field1582 = this.field1582;
        var1.field1598 = this.field1598;
        var1.field1584 = this.field1584;
        var1.field1585 = this.field1585;
        var1.field1586 = this.field1586;
        var1.field1588 = this.field1588;
        var1.field1589 = this.field1589;
        var1.field1616 = this.field1616;
        var1.field1591 = this.field1591;
        var1.field1592 = this.field1592;
        var1.field1615 = this.field1615;
        var1.field1594 = this.field1594;
        var1.field1595 = this.field1595;
        var1.field1613 = this.field1613;
        var1.field1596 = this.field1596;
        var1.field1572 = this.field1572;
        var1.field1599 = this.field1599;
        var1.field1600 = this.field1600;
        var1.field1593 = this.field1593;
        var1.field1602 = this.field1602;
        var1.field1604 = this.field1604;
        var1.field1603 = this.field1603;
        var1.field1618 = this.field1618;
        var1.field1607 = this.field1607;
        return var1;
    }

    @ObfuscatedName("ce.b([[IIIIZI)Lce;")
    public class94 method1907(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1935();
        int var7 = this.field1610 + arg1;
        int var8 = this.field1611 + arg1;
        int var9 = this.field1578 + arg3;
        int var10 = this.field1612 + arg3;
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
            var15.field1576 = this.field1576;
            var15.field1587 = this.field1587;
            var15.field1573 = this.field1573;
            var15.field1575 = this.field1575;
            var15.field1577 = this.field1577;
            var15.field1574 = this.field1574;
            var15.field1583 = this.field1583;
            var15.field1580 = this.field1580;
            var15.field1606 = this.field1606;
            var15.field1582 = this.field1582;
            var15.field1598 = this.field1598;
            var15.field1584 = this.field1584;
            var15.field1585 = this.field1585;
            var15.field1586 = this.field1586;
            var15.field1588 = this.field1588;
            var15.field1589 = this.field1589;
            var15.field1616 = this.field1616;
            var15.field1591 = this.field1591;
            var15.field1592 = this.field1592;
            var15.field1615 = this.field1615;
            var15.field1594 = this.field1594;
            var15.field1595 = this.field1595;
            var15.field1613 = this.field1613;
            var15.field1596 = this.field1596;
            var15.field1572 = this.field1572;
            var15.field1599 = this.field1599;
            var15.field1600 = this.field1600;
            var15.field1593 = this.field1593;
            var15.field1602 = this.field1602;
            var15.field1618 = this.field1618;
            var15.field1607 = this.field1607;
            var15.field1581 = new int[var15.field1601];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1601; var16++) {
                int var17 = this.field1573[var16] + arg1;
                int var18 = this.field1575[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1581[var16] = this.field1581[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1601; var26++) {
                int var27 = (-this.field1581[var26] << 16) / this.field1347;
                if (var27 < arg5) {
                    int var28 = this.field1573[var26] + arg1;
                    int var29 = this.field1575[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1581[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1581[var26];
                }
            }
        }
        var15.method1919();
        return var15;
    }

    @ObfuscatedName("ce.k()V")
    public void method1908() {
        int var10002;
        if (this.field1599 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1601; var3++) {
                int var4 = this.field1599[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1593 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1593[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1601) {
                int var7 = this.field1599[var6];
                this.field1593[var7][var1[var7]++] = var6++;
            }
            this.field1599 = null;
        }
        if (this.field1600 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1576; var10++) {
            int var11 = this.field1600[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1602 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1602[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1576) {
            int var14 = this.field1600[var13];
            this.field1602[var14][var8[var14]++] = var13++;
        }
        this.field1600 = null;
    }

    @ObfuscatedName("ce.v()V")
    public void method1909() {
        for (int var1 = 0; var1 < this.field1601; var1++) {
            int var2 = this.field1573[var1];
            this.field1573[var1] = this.field1575[var1];
            this.field1575[var1] = -var2;
        }
        this.method1919();
    }

    @ObfuscatedName("ce.i()V")
    public void method1904() {
        for (int var1 = 0; var1 < this.field1601; var1++) {
            this.field1573[var1] = -this.field1573[var1];
            this.field1575[var1] = -this.field1575[var1];
        }
        this.method1919();
    }

    @ObfuscatedName("ce.x()V")
    public void method1911() {
        for (int var1 = 0; var1 < this.field1601; var1++) {
            int var2 = this.field1575[var1];
            this.field1575[var1] = this.field1573[var1];
            this.field1573[var1] = -var2;
        }
        this.method1919();
    }

    @ObfuscatedName("ce.h(I)V")
    public void method1912(int arg0) {
        int var2 = field1617[arg0];
        int var3 = field1590[arg0];
        for (int var4 = 0; var4 < this.field1601; var4++) {
            int var5 = this.field1575[var4] * var2 + this.field1573[var4] * var3 >> 16;
            this.field1575[var4] = this.field1575[var4] * var3 - this.field1573[var4] * var2 >> 16;
            this.field1573[var4] = var5;
        }
        this.method1919();
    }

    @ObfuscatedName("ce.w(III)V")
    public void method1910(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1601; var4++) {
            this.field1573[var4] += arg0;
            this.field1581[var4] += arg1;
            this.field1575[var4] += arg2;
        }
        this.method1919();
    }

    @ObfuscatedName("ce.s(SS)V")
    public void method1914(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1576; var3++) {
            if (this.field1584[var3] == arg0) {
                this.field1584[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ce.p(SS)V")
    public void method1915(short arg0, short arg1) {
        if (this.field1585 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1576; var3++) {
            if (this.field1585[var3] == arg0) {
                this.field1585[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ce.z()V")
    public void method1901() {
        for (int var1 = 0; var1 < this.field1601; var1++) {
            this.field1575[var1] = -this.field1575[var1];
        }
        for (int var2 = 0; var2 < this.field1576; var2++) {
            int var3 = this.field1577[var2];
            this.field1577[var2] = this.field1583[var2];
            this.field1583[var2] = var3;
        }
        this.method1919();
    }

    @ObfuscatedName("ce.n(III)V")
    public void method1917(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1601; var4++) {
            this.field1573[var4] = this.field1573[var4] * arg0 / 128;
            this.field1581[var4] = this.field1581[var4] * arg1 / 128;
            this.field1575[var4] = this.field1575[var4] * arg2 / 128;
        }
        this.method1919();
    }

    @ObfuscatedName("ce.u()V")
    public void method1916() {
        if (this.field1604 != null) {
            return;
        }
        this.field1604 = new class90[this.field1601];
        for (int var1 = 0; var1 < this.field1601; var1++) {
            this.field1604[var1] = new class90();
        }
        for (int var2 = 0; var2 < this.field1576; var2++) {
            int var3 = this.field1577[var2];
            int var4 = this.field1574[var2];
            int var5 = this.field1583[var2];
            int var6 = this.field1573[var4] - this.field1573[var3];
            int var7 = this.field1581[var4] - this.field1581[var3];
            int var8 = this.field1575[var4] - this.field1575[var3];
            int var9 = this.field1573[var5] - this.field1573[var3];
            int var10 = this.field1581[var5] - this.field1581[var3];
            int var11 = this.field1575[var5] - this.field1575[var3];
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
            if (this.field1580 == null) {
                var19 = 0;
            } else {
                var19 = this.field1580[var2];
            }
            if (var19 == 0) {
                class90 var20 = this.field1604[var3];
                var20.field1511 += var16;
                var20.field1519 += var17;
                var20.field1512 += var18;
                var20.field1510++;
                class90 var21 = this.field1604[var4];
                var21.field1511 += var16;
                var21.field1519 += var17;
                var21.field1512 += var18;
                var21.field1510++;
                class90 var22 = this.field1604[var5];
                var22.field1511 += var16;
                var22.field1519 += var17;
                var22.field1512 += var18;
                var22.field1510++;
            } else if (var19 == 1) {
                if (this.field1603 == null) {
                    this.field1603 = new class78[this.field1576];
                }
                class78 var23 = this.field1603[var2] = new class78();
                var23.field1341 = var16;
                var23.field1338 = var17;
                var23.field1339 = var18;
            }
        }
    }

    @ObfuscatedName("ce.a()V")
    public void method1919() {
        this.field1604 = null;
        this.field1605 = null;
        this.field1603 = null;
        this.field1608 = false;
    }

    @ObfuscatedName("ce.d()V")
    public void method1935() {
        if (this.field1608) {
            return;
        }
        this.field1347 = 0;
        this.field1609 = 0;
        this.field1610 = 999999;
        this.field1611 = -999999;
        this.field1612 = -99999;
        this.field1578 = 99999;
        for (int var1 = 0; var1 < this.field1601; var1++) {
            int var2 = this.field1573[var1];
            int var3 = this.field1581[var1];
            int var4 = this.field1575[var1];
            if (var2 < this.field1610) {
                this.field1610 = var2;
            }
            if (var2 > this.field1611) {
                this.field1611 = var2;
            }
            if (var4 < this.field1578) {
                this.field1578 = var4;
            }
            if (var4 > this.field1612) {
                this.field1612 = var4;
            }
            if (-var3 > this.field1347) {
                this.field1347 = -var3;
            }
            if (var3 > this.field1609) {
                this.field1609 = var3;
            }
        }
        this.field1608 = true;
    }

    @ObfuscatedName("ce.m(Lce;Lce;IIIZ)V")
    public static void method1921(class94 arg0, class94 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1935();
        arg0.method1916();
        arg1.method1935();
        arg1.method1916();
        field1579++;
        int var6 = 0;
        int[] var7 = arg1.field1573;
        int var8 = arg1.field1601;
        for (int var9 = 0; var9 < arg0.field1601; var9++) {
            class90 var10 = arg0.field1604[var9];
            if (var10.field1510 != 0) {
                int var11 = arg0.field1581[var9] - arg3;
                if (var11 <= arg1.field1609) {
                    int var12 = arg0.field1573[var9] - arg2;
                    if (var12 >= arg1.field1610 && var12 <= arg1.field1611) {
                        int var13 = arg0.field1575[var9] - arg4;
                        if (var13 >= arg1.field1578 && var13 <= arg1.field1612) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class90 var15 = arg1.field1604[var14];
                                if (var7[var14] == var12 && arg1.field1575[var14] == var13 && arg1.field1581[var14] == var11 && var15.field1510 != 0) {
                                    if (arg0.field1605 == null) {
                                        arg0.field1605 = new class90[arg0.field1601];
                                    }
                                    if (arg1.field1605 == null) {
                                        arg1.field1605 = new class90[var8];
                                    }
                                    class90 var16 = arg0.field1605[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1605[var9] = new class90(var10);
                                    }
                                    class90 var17 = arg1.field1605[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1605[var14] = new class90(var15);
                                    }
                                    var16.field1511 += var15.field1511;
                                    var16.field1519 += var15.field1519;
                                    var16.field1512 += var15.field1512;
                                    var16.field1510 += var15.field1510;
                                    var17.field1511 += var10.field1511;
                                    var17.field1519 += var10.field1519;
                                    var17.field1512 += var10.field1512;
                                    var17.field1510 += var10.field1510;
                                    var6++;
                                    field1614[var9] = field1579;
                                    field1597[var14] = field1579;
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
        for (int var18 = 0; var18 < arg0.field1576; var18++) {
            if (field1614[arg0.field1577[var18]] == field1579 && field1614[arg0.field1574[var18]] == field1579 && field1614[arg0.field1583[var18]] == field1579) {
                if (arg0.field1580 == null) {
                    arg0.field1580 = new byte[arg0.field1576];
                }
                arg0.field1580[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1576; var19++) {
            if (field1597[arg1.field1577[var19]] == field1579 && field1597[arg1.field1574[var19]] == field1579 && field1597[arg1.field1583[var19]] == field1579) {
                if (arg1.field1580 == null) {
                    arg1.field1580 = new byte[arg1.field1576];
                }
                arg1.field1580[var19] = 2;
            }
        }
    }

    @ObfuscatedName("ce.q(IIIII)Lcl;")
    public final class99 method1922(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1916();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class99 var8 = new class99();
        var8.field1699 = new int[this.field1576];
        var8.field1698 = new int[this.field1576];
        var8.field1690 = new int[this.field1576];
        if (this.field1587 > 0 && this.field1598 != null) {
            int[] var9 = new int[this.field1587];
            for (int var10 = 0; var10 < this.field1576; var10++) {
                if (this.field1598[var10] != -1) {
                    var9[this.field1598[var10] & 0xFF]++;
                }
            }
            var8.field1696 = 0;
            for (int var11 = 0; var11 < this.field1587; var11++) {
                if (var9[var11] > 0 && this.field1588[var11] == 0) {
                    var8.field1696++;
                }
            }
            var8.field1697 = new int[var8.field1696];
            var8.field1740 = new int[var8.field1696];
            var8.field1732 = new int[var8.field1696];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1587; var13++) {
                if (var9[var13] > 0 && this.field1588[var13] == 0) {
                    var8.field1697[var12] = this.field1589[var13] & 0xFFFF;
                    var8.field1740[var12] = this.field1616[var13] & 0xFFFF;
                    var8.field1732[var12] = this.field1591[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1728 = new byte[this.field1576];
            for (int var14 = 0; var14 < this.field1576; var14++) {
                if (this.field1598[var14] == -1) {
                    var8.field1728[var14] = -1;
                } else {
                    var8.field1728[var14] = (byte) var9[this.field1598[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1576; var15++) {
            byte var16;
            if (this.field1580 == null) {
                var16 = 0;
            } else {
                var16 = this.field1580[var15];
            }
            byte var17;
            if (this.field1582 == null) {
                var17 = 0;
            } else {
                var17 = this.field1582[var15];
            }
            short var18;
            if (this.field1585 == null) {
                var18 = -1;
            } else {
                var18 = this.field1585[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1584[var15] & 0xFFFF;
                    class90 var20;
                    if (this.field1605 == null || this.field1605[this.field1577[var15]] == null) {
                        var20 = this.field1604[this.field1577[var15]];
                    } else {
                        var20 = this.field1605[this.field1577[var15]];
                    }
                    int var21 = (var20.field1512 * arg4 + var20.field1519 * arg3 + var20.field1511 * arg2) / (var20.field1510 * var7) + arg0;
                    var8.field1699[var15] = method1923(var19, var21);
                    class90 var22;
                    if (this.field1605 == null || this.field1605[this.field1574[var15]] == null) {
                        var22 = this.field1604[this.field1574[var15]];
                    } else {
                        var22 = this.field1605[this.field1574[var15]];
                    }
                    int var23 = (var22.field1512 * arg4 + var22.field1519 * arg3 + var22.field1511 * arg2) / (var22.field1510 * var7) + arg0;
                    var8.field1698[var15] = method1923(var19, var23);
                    class90 var24;
                    if (this.field1605 == null || this.field1605[this.field1583[var15]] == null) {
                        var24 = this.field1604[this.field1583[var15]];
                    } else {
                        var24 = this.field1605[this.field1583[var15]];
                    }
                    int var25 = (var24.field1512 * arg4 + var24.field1519 * arg3 + var24.field1511 * arg2) / (var24.field1510 * var7) + arg0;
                    var8.field1690[var15] = method1923(var19, var25);
                } else if (var16 == 1) {
                    class78 var26 = this.field1603[var15];
                    int var27 = (var26.field1339 * arg4 + var26.field1341 * arg2 + var26.field1338 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1699[var15] = method1923(this.field1584[var15] & 0xFFFF, var27);
                    var8.field1690[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1699[var15] = 128;
                    var8.field1690[var15] = -1;
                } else {
                    var8.field1690[var15] = -2;
                }
            } else if (var16 == 0) {
                class90 var28;
                if (this.field1605 == null || this.field1605[this.field1577[var15]] == null) {
                    var28 = this.field1604[this.field1577[var15]];
                } else {
                    var28 = this.field1605[this.field1577[var15]];
                }
                int var29 = (var28.field1512 * arg4 + var28.field1519 * arg3 + var28.field1511 * arg2) / (var28.field1510 * var7) + arg0;
                var8.field1699[var15] = method1964(var29);
                class90 var30;
                if (this.field1605 == null || this.field1605[this.field1574[var15]] == null) {
                    var30 = this.field1604[this.field1574[var15]];
                } else {
                    var30 = this.field1605[this.field1574[var15]];
                }
                int var31 = (var30.field1512 * arg4 + var30.field1519 * arg3 + var30.field1511 * arg2) / (var30.field1510 * var7) + arg0;
                var8.field1698[var15] = method1964(var31);
                class90 var32;
                if (this.field1605 == null || this.field1605[this.field1583[var15]] == null) {
                    var32 = this.field1604[this.field1583[var15]];
                } else {
                    var32 = this.field1605[this.field1583[var15]];
                }
                int var33 = (var32.field1512 * arg4 + var32.field1519 * arg3 + var32.field1511 * arg2) / (var32.field1510 * var7) + arg0;
                var8.field1690[var15] = method1964(var33);
            } else if (var16 == 1) {
                class78 var34 = this.field1603[var15];
                int var35 = (var34.field1339 * arg4 + var34.field1341 * arg2 + var34.field1338 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1699[var15] = method1964(var35);
                var8.field1690[var15] = -1;
            } else {
                var8.field1690[var15] = -2;
            }
        }
        this.method1908();
        var8.field1680 = this.field1601;
        var8.field1681 = this.field1573;
        var8.field1695 = this.field1581;
        var8.field1683 = this.field1575;
        var8.field1718 = this.field1576;
        var8.field1715 = this.field1577;
        var8.field1712 = this.field1574;
        var8.field1687 = this.field1583;
        var8.field1691 = this.field1606;
        var8.field1692 = this.field1582;
        var8.field1685 = this.field1586;
        var8.field1700 = this.field1593;
        var8.field1688 = this.field1602;
        var8.field1694 = this.field1585;
        return var8;
    }

    @ObfuscatedName("ce.e(II)I")
    public static final int method1923(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ce.t(I)I")
    public static final int method1964(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
