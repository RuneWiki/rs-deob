package deob;

@ObfuscatedName("cd")
public class class98 extends class83 {

    @ObfuscatedName("cd.j")
    public int field1647 = 0;

    @ObfuscatedName("cd.y")
    public int[] field1675;

    @ObfuscatedName("cd.z")
    public int[] field1637;

    @ObfuscatedName("cd.l")
    public int[] field1638;

    @ObfuscatedName("cd.w")
    public int field1649 = 0;

    @ObfuscatedName("cd.d")
    public int[] field1640;

    @ObfuscatedName("cd.f")
    public int[] field1671;

    @ObfuscatedName("cd.i")
    public int[] field1642;

    @ObfuscatedName("cd.a")
    public byte[] field1643;

    @ObfuscatedName("cd.o")
    public byte[] field1646;

    @ObfuscatedName("cd.u")
    public byte[] field1645;

    @ObfuscatedName("cd.m")
    public byte[] field1681;

    @ObfuscatedName("cd.e")
    public short[] field1641;

    @ObfuscatedName("cd.v")
    public short[] field1648;

    @ObfuscatedName("cd.r")
    public byte field1635 = 0;

    @ObfuscatedName("cd.t")
    public int field1650;

    @ObfuscatedName("cd.g")
    public byte[] field1659;

    @ObfuscatedName("cd.s")
    public short[] field1652;

    @ObfuscatedName("cd.n")
    public short[] field1653;

    @ObfuscatedName("cd.h")
    public short[] field1654;

    @ObfuscatedName("cd.p")
    public short[] field1644;

    @ObfuscatedName("cd.c")
    public short[] field1656;

    @ObfuscatedName("cd.x")
    public short[] field1657;

    @ObfuscatedName("cd.q")
    public short[] field1636;

    @ObfuscatedName("cd.b")
    public short[] field1680;

    @ObfuscatedName("cd.k")
    public short[] field1660;

    @ObfuscatedName("cd.at")
    public byte[] field1661;

    @ObfuscatedName("cd.au")
    public int[] field1662;

    @ObfuscatedName("cd.aa")
    public int[] field1663;

    @ObfuscatedName("cd.ak")
    public int[][] field1664;

    @ObfuscatedName("cd.an")
    public int[][] field1674;

    @ObfuscatedName("cd.ad")
    public class82[] field1666;

    @ObfuscatedName("cd.ap")
    public class94[] field1667;

    @ObfuscatedName("cd.ag")
    public class94[] field1668;

    @ObfuscatedName("cd.aj")
    public short field1669;

    @ObfuscatedName("cd.av")
    public short field1670;

    @ObfuscatedName("cd.ar")
    public boolean field1679 = false;

    @ObfuscatedName("cd.ab")
    public int field1672;

    @ObfuscatedName("cd.ai")
    public int field1673;

    @ObfuscatedName("cd.ae")
    public int field1665;

    @ObfuscatedName("cd.ax")
    public int field1655;

    @ObfuscatedName("cd.aw")
    public int field1676;

    @ObfuscatedName("cd.ac")
    public static int[] field1677 = new int[10000];

    @ObfuscatedName("cd.al")
    public static int[] field1678 = new int[10000];

    @ObfuscatedName("cd.az")
    public static int field1651 = 0;

    @ObfuscatedName("cd.as")
    public static int[] field1658 = class89.field1542;

    @ObfuscatedName("cd.am")
    public static int[] field1639 = class89.field1543;

    public class98() {
    }

    @ObfuscatedName("cd.j(Lfh;II)Lcd;")
    public static class98 method2092(class161 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2995(arg1, arg2);
        return var3 == null ? null : new class98(var3);
    }

    public class98(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2075(arg0);
        } else {
            this.method2107(arg0);
        }
    }

    @ObfuscatedName("cd.z([B)V")
    public void method2075(byte[] arg0) {
        class114 var2 = new class114(arg0);
        class114 var3 = new class114(arg0);
        class114 var4 = new class114(arg0);
        class114 var5 = new class114(arg0);
        class114 var6 = new class114(arg0);
        class114 var7 = new class114(arg0);
        class114 var8 = new class114(arg0);
        var2.field1894 = arg0.length - 23;
        int var9 = var2.method2324();
        int var10 = var2.method2324();
        int var11 = var2.method2322();
        int var12 = var2.method2322();
        int var13 = var2.method2322();
        int var14 = var2.method2322();
        int var15 = var2.method2322();
        int var16 = var2.method2322();
        int var17 = var2.method2322();
        int var18 = var2.method2324();
        int var19 = var2.method2324();
        int var20 = var2.method2324();
        int var21 = var2.method2324();
        int var22 = var2.method2324();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1659 = new byte[var11];
            var2.field1894 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1659[var26] = var2.method2323();
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
        this.field1647 = var9;
        this.field1649 = var10;
        this.field1650 = var11;
        this.field1675 = new int[var9];
        this.field1637 = new int[var9];
        this.field1638 = new int[var9];
        this.field1640 = new int[var10];
        this.field1671 = new int[var10];
        this.field1642 = new int[var10];
        if (var17 == 1) {
            this.field1662 = new int[var9];
        }
        if (var12 == 1) {
            this.field1643 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1646 = new byte[var10];
        } else {
            this.field1635 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1645 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1663 = new int[var10];
        }
        if (var16 == 1) {
            this.field1648 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1681 = new byte[var10];
        }
        this.field1641 = new short[var10];
        if (var11 > 0) {
            this.field1652 = new short[var11];
            this.field1653 = new short[var11];
            this.field1654 = new short[var11];
            if (var24 > 0) {
                this.field1644 = new short[var24];
                this.field1656 = new short[var24];
                this.field1657 = new short[var24];
                this.field1636 = new short[var24];
                this.field1661 = new byte[var24];
                this.field1680 = new short[var24];
            }
            if (var25 > 0) {
                this.field1660 = new short[var25];
            }
        }
        var2.field1894 = var11;
        var3.field1894 = var44;
        var4.field1894 = var46;
        var5.field1894 = var48;
        var6.field1894 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2322();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2473();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2473();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2473();
            }
            this.field1675[var67] = var64 + var69;
            this.field1637[var67] = var65 + var70;
            this.field1638[var67] = var66 + var71;
            var64 = this.field1675[var67];
            var65 = this.field1637[var67];
            var66 = this.field1638[var67];
            if (var17 == 1) {
                this.field1662[var67] = var6.method2322();
            }
        }
        var2.field1894 = var42;
        var3.field1894 = var31;
        var4.field1894 = var34;
        var5.field1894 = var37;
        var6.field1894 = var35;
        var7.field1894 = var40;
        var8.field1894 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1641[var72] = (short) var2.method2324();
            if (var12 == 1) {
                this.field1643[var72] = var3.method2323();
            }
            if (var13 == 255) {
                this.field1646[var72] = var4.method2323();
            }
            if (var14 == 1) {
                this.field1645[var72] = var5.method2323();
            }
            if (var15 == 1) {
                this.field1663[var72] = var6.method2322();
            }
            if (var16 == 1) {
                this.field1648[var72] = (short) (var7.method2324() - 1);
            }
            if (this.field1681 != null && this.field1648[var72] != -1) {
                this.field1681[var72] = (byte) (var8.method2322() - 1);
            }
        }
        var2.field1894 = var33;
        var3.field1894 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2322();
            if (var78 == 1) {
                var73 = var2.method2473() + var76;
                var74 = var2.method2473() + var73;
                var75 = var2.method2473() + var74;
                var76 = var75;
                this.field1640[var77] = var73;
                this.field1671[var77] = var74;
                this.field1642[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2473() + var76;
                var76 = var75;
                this.field1640[var77] = var73;
                this.field1671[var77] = var74;
                this.field1642[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2473() + var76;
                var76 = var75;
                this.field1640[var77] = var73;
                this.field1671[var77] = var74;
                this.field1642[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2473() + var76;
                var76 = var75;
                this.field1640[var77] = var73;
                this.field1671[var77] = var81;
                this.field1642[var77] = var75;
            }
        }
        var2.field1894 = var50;
        var3.field1894 = var52;
        var4.field1894 = var54;
        var5.field1894 = var56;
        var6.field1894 = var58;
        var7.field1894 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1659[var82] & 0xFF;
            if (var83 == 0) {
                this.field1652[var82] = (short) var2.method2324();
                this.field1653[var82] = (short) var2.method2324();
                this.field1654[var82] = (short) var2.method2324();
            }
            if (var83 == 1) {
                this.field1652[var82] = (short) var3.method2324();
                this.field1653[var82] = (short) var3.method2324();
                this.field1654[var82] = (short) var3.method2324();
                this.field1644[var82] = (short) var4.method2324();
                this.field1656[var82] = (short) var4.method2324();
                this.field1657[var82] = (short) var4.method2324();
                this.field1636[var82] = (short) var5.method2324();
                this.field1661[var82] = var6.method2323();
                this.field1680[var82] = (short) var7.method2324();
            }
            if (var83 == 2) {
                this.field1652[var82] = (short) var3.method2324();
                this.field1653[var82] = (short) var3.method2324();
                this.field1654[var82] = (short) var3.method2324();
                this.field1644[var82] = (short) var4.method2324();
                this.field1656[var82] = (short) var4.method2324();
                this.field1657[var82] = (short) var4.method2324();
                this.field1636[var82] = (short) var5.method2324();
                this.field1661[var82] = var6.method2323();
                this.field1680[var82] = (short) var7.method2324();
                this.field1660[var82] = (short) var7.method2324();
            }
            if (var83 == 3) {
                this.field1652[var82] = (short) var3.method2324();
                this.field1653[var82] = (short) var3.method2324();
                this.field1654[var82] = (short) var3.method2324();
                this.field1644[var82] = (short) var4.method2324();
                this.field1656[var82] = (short) var4.method2324();
                this.field1657[var82] = (short) var4.method2324();
                this.field1636[var82] = (short) var5.method2324();
                this.field1661[var82] = var6.method2323();
                this.field1680[var82] = (short) var7.method2324();
            }
        }
        var2.field1894 = var62;
        int var84 = var2.method2322();
        if (var84 == 0) {
            return;
        }
        new class88();
        var2.method2324();
        var2.method2324();
        var2.method2324();
        var2.method2327();
    }

    @ObfuscatedName("cd.l([B)V")
    public void method2107(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class114 var4 = new class114(arg0);
        class114 var5 = new class114(arg0);
        class114 var6 = new class114(arg0);
        class114 var7 = new class114(arg0);
        class114 var8 = new class114(arg0);
        var4.field1894 = arg0.length - 18;
        int var9 = var4.method2324();
        int var10 = var4.method2324();
        int var11 = var4.method2322();
        int var12 = var4.method2322();
        int var13 = var4.method2322();
        int var14 = var4.method2322();
        int var15 = var4.method2322();
        int var16 = var4.method2322();
        int var17 = var4.method2324();
        int var18 = var4.method2324();
        int var19 = var4.method2324();
        int var20 = var4.method2324();
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
        this.field1647 = var9;
        this.field1649 = var10;
        this.field1650 = var11;
        this.field1675 = new int[var9];
        this.field1637 = new int[var9];
        this.field1638 = new int[var9];
        this.field1640 = new int[var10];
        this.field1671 = new int[var10];
        this.field1642 = new int[var10];
        if (var11 > 0) {
            this.field1659 = new byte[var11];
            this.field1652 = new short[var11];
            this.field1653 = new short[var11];
            this.field1654 = new short[var11];
        }
        if (var16 == 1) {
            this.field1662 = new int[var9];
        }
        if (var12 == 1) {
            this.field1643 = new byte[var10];
            this.field1681 = new byte[var10];
            this.field1648 = new short[var10];
        }
        if (var13 == 255) {
            this.field1646 = new byte[var10];
        } else {
            this.field1635 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1645 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1663 = new int[var10];
        }
        this.field1641 = new short[var10];
        var4.field1894 = var21;
        var5.field1894 = var36;
        var6.field1894 = var38;
        var7.field1894 = var40;
        var8.field1894 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2322();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2473();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2473();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2473();
            }
            this.field1675[var46] = var43 + var48;
            this.field1637[var46] = var44 + var49;
            this.field1638[var46] = var45 + var50;
            var43 = this.field1675[var46];
            var44 = this.field1637[var46];
            var45 = this.field1638[var46];
            if (var16 == 1) {
                this.field1662[var46] = var8.method2322();
            }
        }
        var4.field1894 = var32;
        var5.field1894 = var28;
        var6.field1894 = var26;
        var7.field1894 = var30;
        var8.field1894 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1641[var51] = (short) var4.method2324();
            if (var12 == 1) {
                int var52 = var5.method2322();
                if ((var52 & 0x1) == 1) {
                    this.field1643[var51] = 1;
                    var2 = true;
                } else {
                    this.field1643[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1681[var51] = (byte) (var52 >> 2);
                    this.field1648[var51] = this.field1641[var51];
                    this.field1641[var51] = 127;
                    if (this.field1648[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1681[var51] = -1;
                    this.field1648[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1646[var51] = var6.method2323();
            }
            if (var14 == 1) {
                this.field1645[var51] = var7.method2323();
            }
            if (var15 == 1) {
                this.field1663[var51] = var8.method2322();
            }
        }
        var4.field1894 = var25;
        var5.field1894 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2322();
            if (var58 == 1) {
                var53 = var4.method2473() + var56;
                var54 = var4.method2473() + var53;
                var55 = var4.method2473() + var54;
                var56 = var55;
                this.field1640[var57] = var53;
                this.field1671[var57] = var54;
                this.field1642[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2473() + var56;
                var56 = var55;
                this.field1640[var57] = var53;
                this.field1671[var57] = var54;
                this.field1642[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2473() + var56;
                var56 = var55;
                this.field1640[var57] = var53;
                this.field1671[var57] = var54;
                this.field1642[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2473() + var56;
                var56 = var55;
                this.field1640[var57] = var53;
                this.field1671[var57] = var61;
                this.field1642[var57] = var55;
            }
        }
        var4.field1894 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1659[var62] = 0;
            this.field1652[var62] = (short) var4.method2324();
            this.field1653[var62] = (short) var4.method2324();
            this.field1654[var62] = (short) var4.method2324();
        }
        if (this.field1681 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1681[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1652[var65] & 0xFFFF) == this.field1640[var64] && (this.field1653[var65] & 0xFFFF) == this.field1671[var64] && (this.field1654[var65] & 0xFFFF) == this.field1642[var64]) {
                        this.field1681[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1681 = null;
            }
        }
        if (!var3) {
            this.field1648 = null;
        }
        if (!var2) {
            this.field1643 = null;
        }
    }

    public class98(class98[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1647 = 0;
        this.field1649 = 0;
        this.field1650 = 0;
        this.field1635 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class98 var10 = arg0[var9];
            if (var10 != null) {
                this.field1647 += var10.field1647;
                this.field1649 += var10.field1649;
                this.field1650 += var10.field1650;
                if (var10.field1646 == null) {
                    if (this.field1635 == -1) {
                        this.field1635 = var10.field1635;
                    }
                    if (this.field1635 != var10.field1635) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1643 != null;
                var5 |= var10.field1645 != null;
                var6 |= var10.field1663 != null;
                var7 |= var10.field1648 != null;
                var8 |= var10.field1681 != null;
            }
        }
        this.field1675 = new int[this.field1647];
        this.field1637 = new int[this.field1647];
        this.field1638 = new int[this.field1647];
        this.field1662 = new int[this.field1647];
        this.field1640 = new int[this.field1649];
        this.field1671 = new int[this.field1649];
        this.field1642 = new int[this.field1649];
        if (var3) {
            this.field1643 = new byte[this.field1649];
        }
        if (var4) {
            this.field1646 = new byte[this.field1649];
        }
        if (var5) {
            this.field1645 = new byte[this.field1649];
        }
        if (var6) {
            this.field1663 = new int[this.field1649];
        }
        if (var7) {
            this.field1648 = new short[this.field1649];
        }
        if (var8) {
            this.field1681 = new byte[this.field1649];
        }
        this.field1641 = new short[this.field1649];
        if (this.field1650 > 0) {
            this.field1659 = new byte[this.field1650];
            this.field1652 = new short[this.field1650];
            this.field1653 = new short[this.field1650];
            this.field1654 = new short[this.field1650];
            this.field1644 = new short[this.field1650];
            this.field1656 = new short[this.field1650];
            this.field1657 = new short[this.field1650];
            this.field1636 = new short[this.field1650];
            this.field1661 = new byte[this.field1650];
            this.field1680 = new short[this.field1650];
            this.field1660 = new short[this.field1650];
        }
        this.field1647 = 0;
        this.field1649 = 0;
        this.field1650 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class98 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1649; var13++) {
                    if (var3 && var12.field1643 != null) {
                        this.field1643[this.field1649] = var12.field1643[var13];
                    }
                    if (var4) {
                        if (var12.field1646 == null) {
                            this.field1646[this.field1649] = var12.field1635;
                        } else {
                            this.field1646[this.field1649] = var12.field1646[var13];
                        }
                    }
                    if (var5 && var12.field1645 != null) {
                        this.field1645[this.field1649] = var12.field1645[var13];
                    }
                    if (var6 && var12.field1663 != null) {
                        this.field1663[this.field1649] = var12.field1663[var13];
                    }
                    if (var7) {
                        if (var12.field1648 == null) {
                            this.field1648[this.field1649] = -1;
                        } else {
                            this.field1648[this.field1649] = var12.field1648[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1681 == null || var12.field1681[var13] == -1) {
                            this.field1681[this.field1649] = -1;
                        } else {
                            this.field1681[this.field1649] = (byte) (var12.field1681[var13] + this.field1650);
                        }
                    }
                    this.field1641[this.field1649] = var12.field1641[var13];
                    this.field1640[this.field1649] = this.method2104(var12, var12.field1640[var13]);
                    this.field1671[this.field1649] = this.method2104(var12, var12.field1671[var13]);
                    this.field1642[this.field1649] = this.method2104(var12, var12.field1642[var13]);
                    this.field1649++;
                }
                for (int var14 = 0; var14 < var12.field1650; var14++) {
                    byte var15 = this.field1659[this.field1650] = var12.field1659[var14];
                    if (var15 == 0) {
                        this.field1652[this.field1650] = (short) this.method2104(var12, var12.field1652[var14]);
                        this.field1653[this.field1650] = (short) this.method2104(var12, var12.field1653[var14]);
                        this.field1654[this.field1650] = (short) this.method2104(var12, var12.field1654[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1652[this.field1650] = var12.field1652[var14];
                        this.field1653[this.field1650] = var12.field1653[var14];
                        this.field1654[this.field1650] = var12.field1654[var14];
                        this.field1644[this.field1650] = var12.field1644[var14];
                        this.field1656[this.field1650] = var12.field1656[var14];
                        this.field1657[this.field1650] = var12.field1657[var14];
                        this.field1636[this.field1650] = var12.field1636[var14];
                        this.field1661[this.field1650] = var12.field1661[var14];
                        this.field1680[this.field1650] = var12.field1680[var14];
                    }
                    if (var15 == 2) {
                        this.field1660[this.field1650] = var12.field1660[var14];
                    }
                    this.field1650++;
                }
            }
        }
    }

    @ObfuscatedName("cd.w(Lcd;I)I")
    public final int method2104(class98 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1675[arg1];
        int var5 = arg0.field1637[arg1];
        int var6 = arg0.field1638[arg1];
        for (int var7 = 0; var7 < this.field1647; var7++) {
            if (this.field1675[var7] == var4 && this.field1637[var7] == var5 && this.field1638[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1675[this.field1647] = var4;
            this.field1637[this.field1647] = var5;
            this.field1638[this.field1647] = var6;
            if (arg0.field1662 != null) {
                this.field1662[this.field1647] = arg0.field1662[arg1];
            }
            var3 = this.field1647++;
        }
        return var3;
    }

    public class98(class98 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1647 = arg0.field1647;
        this.field1649 = arg0.field1649;
        this.field1650 = arg0.field1650;
        if (arg1) {
            this.field1675 = arg0.field1675;
            this.field1637 = arg0.field1637;
            this.field1638 = arg0.field1638;
        } else {
            this.field1675 = new int[this.field1647];
            this.field1637 = new int[this.field1647];
            this.field1638 = new int[this.field1647];
            for (int var6 = 0; var6 < this.field1647; var6++) {
                this.field1675[var6] = arg0.field1675[var6];
                this.field1637[var6] = arg0.field1637[var6];
                this.field1638[var6] = arg0.field1638[var6];
            }
        }
        if (arg2) {
            this.field1641 = arg0.field1641;
        } else {
            this.field1641 = new short[this.field1649];
            for (int var7 = 0; var7 < this.field1649; var7++) {
                this.field1641[var7] = arg0.field1641[var7];
            }
        }
        if (arg3 || arg0.field1648 == null) {
            this.field1648 = arg0.field1648;
        } else {
            this.field1648 = new short[this.field1649];
            for (int var8 = 0; var8 < this.field1649; var8++) {
                this.field1648[var8] = arg0.field1648[var8];
            }
        }
        if (arg4) {
            this.field1645 = arg0.field1645;
        } else {
            this.field1645 = new byte[this.field1649];
            if (arg0.field1645 == null) {
                for (int var9 = 0; var9 < this.field1649; var9++) {
                    this.field1645[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1649; var10++) {
                    this.field1645[var10] = arg0.field1645[var10];
                }
            }
        }
        this.field1640 = arg0.field1640;
        this.field1671 = arg0.field1671;
        this.field1642 = arg0.field1642;
        this.field1643 = arg0.field1643;
        this.field1646 = arg0.field1646;
        this.field1681 = arg0.field1681;
        this.field1635 = arg0.field1635;
        this.field1659 = arg0.field1659;
        this.field1652 = arg0.field1652;
        this.field1653 = arg0.field1653;
        this.field1654 = arg0.field1654;
        this.field1644 = arg0.field1644;
        this.field1656 = arg0.field1656;
        this.field1657 = arg0.field1657;
        this.field1636 = arg0.field1636;
        this.field1661 = arg0.field1661;
        this.field1680 = arg0.field1680;
        this.field1660 = arg0.field1660;
        this.field1662 = arg0.field1662;
        this.field1663 = arg0.field1663;
        this.field1664 = arg0.field1664;
        this.field1674 = arg0.field1674;
        this.field1667 = arg0.field1667;
        this.field1666 = arg0.field1666;
        this.field1668 = arg0.field1668;
        this.field1669 = arg0.field1669;
        this.field1670 = arg0.field1670;
    }

    @ObfuscatedName("cd.d()Lcd;")
    public class98 method2078() {
        class98 var1 = new class98();
        if (this.field1643 != null) {
            var1.field1643 = new byte[this.field1649];
            for (int var2 = 0; var2 < this.field1649; var2++) {
                var1.field1643[var2] = this.field1643[var2];
            }
        }
        var1.field1647 = this.field1647;
        var1.field1649 = this.field1649;
        var1.field1650 = this.field1650;
        var1.field1675 = this.field1675;
        var1.field1637 = this.field1637;
        var1.field1638 = this.field1638;
        var1.field1640 = this.field1640;
        var1.field1671 = this.field1671;
        var1.field1642 = this.field1642;
        var1.field1646 = this.field1646;
        var1.field1645 = this.field1645;
        var1.field1681 = this.field1681;
        var1.field1641 = this.field1641;
        var1.field1648 = this.field1648;
        var1.field1635 = this.field1635;
        var1.field1659 = this.field1659;
        var1.field1652 = this.field1652;
        var1.field1653 = this.field1653;
        var1.field1654 = this.field1654;
        var1.field1644 = this.field1644;
        var1.field1656 = this.field1656;
        var1.field1657 = this.field1657;
        var1.field1636 = this.field1636;
        var1.field1661 = this.field1661;
        var1.field1680 = this.field1680;
        var1.field1660 = this.field1660;
        var1.field1662 = this.field1662;
        var1.field1663 = this.field1663;
        var1.field1664 = this.field1664;
        var1.field1674 = this.field1674;
        var1.field1667 = this.field1667;
        var1.field1666 = this.field1666;
        var1.field1669 = this.field1669;
        var1.field1670 = this.field1670;
        return var1;
    }

    @ObfuscatedName("cd.a([[IIIIZI)Lcd;")
    public class98 method2079(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2110();
        int var7 = this.field1673 + arg1;
        int var8 = this.field1665 + arg1;
        int var9 = this.field1676 + arg3;
        int var10 = this.field1655 + arg3;
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
        class98 var15;
        if (arg4) {
            var15 = new class98();
            var15.field1647 = this.field1647;
            var15.field1649 = this.field1649;
            var15.field1650 = this.field1650;
            var15.field1675 = this.field1675;
            var15.field1638 = this.field1638;
            var15.field1640 = this.field1640;
            var15.field1671 = this.field1671;
            var15.field1642 = this.field1642;
            var15.field1643 = this.field1643;
            var15.field1646 = this.field1646;
            var15.field1645 = this.field1645;
            var15.field1681 = this.field1681;
            var15.field1641 = this.field1641;
            var15.field1648 = this.field1648;
            var15.field1635 = this.field1635;
            var15.field1659 = this.field1659;
            var15.field1652 = this.field1652;
            var15.field1653 = this.field1653;
            var15.field1654 = this.field1654;
            var15.field1644 = this.field1644;
            var15.field1656 = this.field1656;
            var15.field1657 = this.field1657;
            var15.field1636 = this.field1636;
            var15.field1661 = this.field1661;
            var15.field1680 = this.field1680;
            var15.field1660 = this.field1660;
            var15.field1662 = this.field1662;
            var15.field1663 = this.field1663;
            var15.field1664 = this.field1664;
            var15.field1674 = this.field1674;
            var15.field1669 = this.field1669;
            var15.field1670 = this.field1670;
            var15.field1637 = new int[var15.field1647];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1647; var16++) {
                int var17 = this.field1675[var16] + arg1;
                int var18 = this.field1638[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1637[var16] = this.field1637[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1647; var26++) {
                int var27 = (-this.field1637[var26] << 16) / this.field1419;
                if (var27 < arg5) {
                    int var28 = this.field1675[var26] + arg1;
                    int var29 = this.field1638[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1637[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1637[var26];
                }
            }
        }
        var15.method2091();
        return var15;
    }

    @ObfuscatedName("cd.o()V")
    public void method2080() {
        int var10002;
        if (this.field1662 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1647; var3++) {
                int var4 = this.field1662[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1664 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1664[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1647) {
                int var7 = this.field1662[var6];
                this.field1664[var7][var1[var7]++] = var6++;
            }
            this.field1662 = null;
        }
        if (this.field1663 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1649; var10++) {
            int var11 = this.field1663[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1674 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1674[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1649) {
            int var14 = this.field1663[var13];
            this.field1674[var14][var8[var14]++] = var13++;
        }
        this.field1663 = null;
    }

    @ObfuscatedName("cd.u()V")
    public void method2081() {
        for (int var1 = 0; var1 < this.field1647; var1++) {
            int var2 = this.field1675[var1];
            this.field1675[var1] = this.field1638[var1];
            this.field1638[var1] = -var2;
        }
        this.method2091();
    }

    @ObfuscatedName("cd.m()V")
    public void method2082() {
        for (int var1 = 0; var1 < this.field1647; var1++) {
            this.field1675[var1] = -this.field1675[var1];
            this.field1638[var1] = -this.field1638[var1];
        }
        this.method2091();
    }

    @ObfuscatedName("cd.e()V")
    public void method2083() {
        for (int var1 = 0; var1 < this.field1647; var1++) {
            int var2 = this.field1638[var1];
            this.field1638[var1] = this.field1675[var1];
            this.field1675[var1] = -var2;
        }
        this.method2091();
    }

    @ObfuscatedName("cd.v(I)V")
    public void method2084(int arg0) {
        int var2 = field1658[arg0];
        int var3 = field1639[arg0];
        for (int var4 = 0; var4 < this.field1647; var4++) {
            int var5 = this.field1675[var4] * var3 + this.field1638[var4] * var2 >> 16;
            this.field1638[var4] = this.field1638[var4] * var3 - this.field1675[var4] * var2 >> 16;
            this.field1675[var4] = var5;
        }
        this.method2091();
    }

    @ObfuscatedName("cd.r(III)V")
    public void method2085(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1647; var4++) {
            this.field1675[var4] += arg0;
            this.field1637[var4] += arg1;
            this.field1638[var4] += arg2;
        }
        this.method2091();
    }

    @ObfuscatedName("cd.t(SS)V")
    public void method2140(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1649; var3++) {
            if (this.field1641[var3] == arg0) {
                this.field1641[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cd.g(SS)V")
    public void method2087(short arg0, short arg1) {
        if (this.field1648 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1649; var3++) {
            if (this.field1648[var3] == arg0) {
                this.field1648[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cd.s()V")
    public void method2088() {
        for (int var1 = 0; var1 < this.field1647; var1++) {
            this.field1638[var1] = -this.field1638[var1];
        }
        for (int var2 = 0; var2 < this.field1649; var2++) {
            int var3 = this.field1640[var2];
            this.field1640[var2] = this.field1642[var2];
            this.field1642[var2] = var3;
        }
        this.method2091();
    }

    @ObfuscatedName("cd.n(III)V")
    public void method2089(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1647; var4++) {
            this.field1675[var4] = this.field1675[var4] * arg0 / 128;
            this.field1637[var4] = this.field1637[var4] * arg1 / 128;
            this.field1638[var4] = this.field1638[var4] * arg2 / 128;
        }
        this.method2091();
    }

    @ObfuscatedName("cd.h()V")
    public void method2139() {
        if (this.field1667 != null) {
            return;
        }
        this.field1667 = new class94[this.field1647];
        for (int var1 = 0; var1 < this.field1647; var1++) {
            this.field1667[var1] = new class94();
        }
        for (int var2 = 0; var2 < this.field1649; var2++) {
            int var3 = this.field1640[var2];
            int var4 = this.field1671[var2];
            int var5 = this.field1642[var2];
            int var6 = this.field1675[var4] - this.field1675[var3];
            int var7 = this.field1637[var4] - this.field1637[var3];
            int var8 = this.field1638[var4] - this.field1638[var3];
            int var9 = this.field1675[var5] - this.field1675[var3];
            int var10 = this.field1637[var5] - this.field1637[var3];
            int var11 = this.field1638[var5] - this.field1638[var3];
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
            if (this.field1643 == null) {
                var19 = 0;
            } else {
                var19 = this.field1643[var2];
            }
            if (var19 == 0) {
                class94 var20 = this.field1667[var3];
                var20.field1582 += var16;
                var20.field1579 += var17;
                var20.field1580 += var18;
                var20.field1586++;
                class94 var21 = this.field1667[var4];
                var21.field1582 += var16;
                var21.field1579 += var17;
                var21.field1580 += var18;
                var21.field1586++;
                class94 var22 = this.field1667[var5];
                var22.field1582 += var16;
                var22.field1579 += var17;
                var22.field1580 += var18;
                var22.field1586++;
            } else if (var19 == 1) {
                if (this.field1666 == null) {
                    this.field1666 = new class82[this.field1649];
                }
                class82 var23 = this.field1666[var2] = new class82();
                var23.field1415 = var16;
                var23.field1414 = var17;
                var23.field1413 = var18;
            }
        }
    }

    @ObfuscatedName("cd.p()V")
    public void method2091() {
        this.field1667 = null;
        this.field1668 = null;
        this.field1666 = null;
        this.field1679 = false;
    }

    @ObfuscatedName("cd.c()V")
    public void method2110() {
        if (this.field1679) {
            return;
        }
        this.field1419 = 0;
        this.field1672 = 0;
        this.field1673 = 999999;
        this.field1665 = -999999;
        this.field1655 = -99999;
        this.field1676 = 99999;
        for (int var1 = 0; var1 < this.field1647; var1++) {
            int var2 = this.field1675[var1];
            int var3 = this.field1637[var1];
            int var4 = this.field1638[var1];
            if (var2 < this.field1673) {
                this.field1673 = var2;
            }
            if (var2 > this.field1665) {
                this.field1665 = var2;
            }
            if (var4 < this.field1676) {
                this.field1676 = var4;
            }
            if (var4 > this.field1655) {
                this.field1655 = var4;
            }
            if (-var3 > this.field1419) {
                this.field1419 = -var3;
            }
            if (var3 > this.field1672) {
                this.field1672 = var3;
            }
        }
        this.field1679 = true;
    }

    @ObfuscatedName("cd.x(Lcd;Lcd;IIIZ)V")
    public static void method2093(class98 arg0, class98 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2110();
        arg0.method2139();
        arg1.method2110();
        arg1.method2139();
        field1651++;
        int var6 = 0;
        int[] var7 = arg1.field1675;
        int var8 = arg1.field1647;
        for (int var9 = 0; var9 < arg0.field1647; var9++) {
            class94 var10 = arg0.field1667[var9];
            if (var10.field1586 != 0) {
                int var11 = arg0.field1637[var9] - arg3;
                if (var11 <= arg1.field1672) {
                    int var12 = arg0.field1675[var9] - arg2;
                    if (var12 >= arg1.field1673 && var12 <= arg1.field1665) {
                        int var13 = arg0.field1638[var9] - arg4;
                        if (var13 >= arg1.field1676 && var13 <= arg1.field1655) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class94 var15 = arg1.field1667[var14];
                                if (var7[var14] == var12 && arg1.field1638[var14] == var13 && arg1.field1637[var14] == var11 && var15.field1586 != 0) {
                                    if (arg0.field1668 == null) {
                                        arg0.field1668 = new class94[arg0.field1647];
                                    }
                                    if (arg1.field1668 == null) {
                                        arg1.field1668 = new class94[var8];
                                    }
                                    class94 var16 = arg0.field1668[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1668[var9] = new class94(var10);
                                    }
                                    class94 var17 = arg1.field1668[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1668[var14] = new class94(var15);
                                    }
                                    var16.field1582 += var15.field1582;
                                    var16.field1579 += var15.field1579;
                                    var16.field1580 += var15.field1580;
                                    var16.field1586 += var15.field1586;
                                    var17.field1582 += var10.field1582;
                                    var17.field1579 += var10.field1579;
                                    var17.field1580 += var10.field1580;
                                    var17.field1586 += var10.field1586;
                                    var6++;
                                    field1677[var9] = field1651;
                                    field1678[var14] = field1651;
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
        for (int var18 = 0; var18 < arg0.field1649; var18++) {
            if (field1677[arg0.field1640[var18]] == field1651 && field1677[arg0.field1671[var18]] == field1651 && field1677[arg0.field1642[var18]] == field1651) {
                if (arg0.field1643 == null) {
                    arg0.field1643 = new byte[arg0.field1649];
                }
                arg0.field1643[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1649; var19++) {
            if (field1678[arg1.field1640[var19]] == field1651 && field1678[arg1.field1671[var19]] == field1651 && field1678[arg1.field1642[var19]] == field1651) {
                if (arg1.field1643 == null) {
                    arg1.field1643 = new byte[arg1.field1649];
                }
                arg1.field1643[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cd.q(IIIII)Lcw;")
    public final class103 method2094(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2139();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class103 var8 = new class103();
        var8.field1774 = new int[this.field1649];
        var8.field1783 = new int[this.field1649];
        var8.field1753 = new int[this.field1649];
        if (this.field1650 > 0 && this.field1681 != null) {
            int[] var9 = new int[this.field1650];
            for (int var10 = 0; var10 < this.field1649; var10++) {
                if (this.field1681[var10] != -1) {
                    var9[this.field1681[var10] & 0xFF]++;
                }
            }
            var8.field1766 = 0;
            for (int var11 = 0; var11 < this.field1650; var11++) {
                if (var9[var11] > 0 && this.field1659[var11] == 0) {
                    var8.field1766++;
                }
            }
            var8.field1760 = new int[var8.field1766];
            var8.field1761 = new int[var8.field1766];
            var8.field1762 = new int[var8.field1766];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1650; var13++) {
                if (var9[var13] > 0 && this.field1659[var13] == 0) {
                    var8.field1760[var12] = this.field1652[var13] & 0xFFFF;
                    var8.field1761[var12] = this.field1653[var13] & 0xFFFF;
                    var8.field1762[var12] = this.field1654[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1756 = new byte[this.field1649];
            for (int var14 = 0; var14 < this.field1649; var14++) {
                if (this.field1681[var14] == -1) {
                    var8.field1756[var14] = -1;
                } else {
                    var8.field1756[var14] = (byte) var9[this.field1681[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1649; var15++) {
            byte var16;
            if (this.field1643 == null) {
                var16 = 0;
            } else {
                var16 = this.field1643[var15];
            }
            byte var17;
            if (this.field1645 == null) {
                var17 = 0;
            } else {
                var17 = this.field1645[var15];
            }
            short var18;
            if (this.field1648 == null) {
                var18 = -1;
            } else {
                var18 = this.field1648[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1641[var15] & 0xFFFF;
                    class94 var20;
                    if (this.field1668 == null || this.field1668[this.field1640[var15]] == null) {
                        var20 = this.field1667[this.field1640[var15]];
                    } else {
                        var20 = this.field1668[this.field1640[var15]];
                    }
                    int var21 = (var20.field1580 * arg4 + var20.field1582 * arg2 + var20.field1579 * arg3) / (var20.field1586 * var7) + arg0;
                    var8.field1774[var15] = method2134(var19, var21);
                    class94 var22;
                    if (this.field1668 == null || this.field1668[this.field1671[var15]] == null) {
                        var22 = this.field1667[this.field1671[var15]];
                    } else {
                        var22 = this.field1668[this.field1671[var15]];
                    }
                    int var23 = (var22.field1580 * arg4 + var22.field1582 * arg2 + var22.field1579 * arg3) / (var22.field1586 * var7) + arg0;
                    var8.field1783[var15] = method2134(var19, var23);
                    class94 var24;
                    if (this.field1668 == null || this.field1668[this.field1642[var15]] == null) {
                        var24 = this.field1667[this.field1642[var15]];
                    } else {
                        var24 = this.field1668[this.field1642[var15]];
                    }
                    int var25 = (var24.field1580 * arg4 + var24.field1582 * arg2 + var24.field1579 * arg3) / (var24.field1586 * var7) + arg0;
                    var8.field1753[var15] = method2134(var19, var25);
                } else if (var16 == 1) {
                    class82 var26 = this.field1666[var15];
                    int var27 = (var26.field1413 * arg4 + var26.field1415 * arg2 + var26.field1414 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1774[var15] = method2134(this.field1641[var15] & 0xFFFF, var27);
                    var8.field1753[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1774[var15] = 128;
                    var8.field1753[var15] = -1;
                } else {
                    var8.field1753[var15] = -2;
                }
            } else if (var16 == 0) {
                class94 var28;
                if (this.field1668 == null || this.field1668[this.field1640[var15]] == null) {
                    var28 = this.field1667[this.field1640[var15]];
                } else {
                    var28 = this.field1668[this.field1640[var15]];
                }
                int var29 = (var28.field1580 * arg4 + var28.field1582 * arg2 + var28.field1579 * arg3) / (var28.field1586 * var7) + arg0;
                var8.field1774[var15] = method2086(var29);
                class94 var30;
                if (this.field1668 == null || this.field1668[this.field1671[var15]] == null) {
                    var30 = this.field1667[this.field1671[var15]];
                } else {
                    var30 = this.field1668[this.field1671[var15]];
                }
                int var31 = (var30.field1580 * arg4 + var30.field1582 * arg2 + var30.field1579 * arg3) / (var30.field1586 * var7) + arg0;
                var8.field1783[var15] = method2086(var31);
                class94 var32;
                if (this.field1668 == null || this.field1668[this.field1642[var15]] == null) {
                    var32 = this.field1667[this.field1642[var15]];
                } else {
                    var32 = this.field1668[this.field1642[var15]];
                }
                int var33 = (var32.field1580 * arg4 + var32.field1582 * arg2 + var32.field1579 * arg3) / (var32.field1586 * var7) + arg0;
                var8.field1753[var15] = method2086(var33);
            } else if (var16 == 1) {
                class82 var34 = this.field1666[var15];
                int var35 = (var34.field1413 * arg4 + var34.field1415 * arg2 + var34.field1414 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1774[var15] = method2086(var35);
                var8.field1753[var15] = -1;
            } else {
                var8.field1753[var15] = -2;
            }
        }
        this.method2080();
        var8.field1743 = this.field1647;
        var8.field1744 = this.field1675;
        var8.field1739 = this.field1637;
        var8.field1746 = this.field1638;
        var8.field1745 = this.field1649;
        var8.field1748 = this.field1640;
        var8.field1749 = this.field1671;
        var8.field1750 = this.field1642;
        var8.field1754 = this.field1646;
        var8.field1755 = this.field1645;
        var8.field1758 = this.field1635;
        var8.field1752 = this.field1664;
        var8.field1764 = this.field1674;
        var8.field1765 = this.field1648;
        return var8;
    }

    @ObfuscatedName("cd.aa(II)I")
    public static final int method2134(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cd.ak(I)I")
    public static final int method2086(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
