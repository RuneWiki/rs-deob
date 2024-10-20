package deob;

@ObfuscatedName("cc")
public class class98 extends class78 {

    @ObfuscatedName("cc.i")
    public static class98 field1699 = new class98();

    @ObfuscatedName("cc.c")
    public static byte[] field1691 = new byte[1];

    @ObfuscatedName("cc.h")
    public static class98 field1725 = new class98();

    @ObfuscatedName("cc.v")
    public static byte[] field1693 = new byte[1];

    @ObfuscatedName("cc.q")
    public int field1694 = 0;

    @ObfuscatedName("cc.s")
    public int[] field1695;

    @ObfuscatedName("cc.g")
    public int[] field1728;

    @ObfuscatedName("cc.u")
    public int[] field1731;

    @ObfuscatedName("cc.d")
    public int field1698 = 0;

    @ObfuscatedName("cc.y")
    public int[] field1756;

    @ObfuscatedName("cc.e")
    public int[] field1700;

    @ObfuscatedName("cc.l")
    public int[] field1750;

    @ObfuscatedName("cc.o")
    public int[] field1702;

    @ObfuscatedName("cc.w")
    public int[] field1703;

    @ObfuscatedName("cc.t")
    public int[] field1704;

    @ObfuscatedName("cc.z")
    public byte[] field1705;

    @ObfuscatedName("cc.b")
    public byte[] field1706;

    @ObfuscatedName("cc.a")
    public byte[] field1707;

    @ObfuscatedName("cc.r")
    public short[] field1690;

    @ObfuscatedName("cc.m")
    public byte field1709 = 0;

    @ObfuscatedName("cc.f")
    public int field1710 = 0;

    @ObfuscatedName("cc.k")
    public int[] field1711;

    @ObfuscatedName("cc.p")
    public int[] field1739;

    @ObfuscatedName("cc.n")
    public int[] field1714;

    @ObfuscatedName("cc.j")
    public int[][] field1735;

    @ObfuscatedName("cc.x")
    public int[][] field1748;

    @ObfuscatedName("cc.al")
    public boolean field1701 = false;

    @ObfuscatedName("cc.au")
    public int field1717;

    @ObfuscatedName("cc.az")
    public int field1718;

    @ObfuscatedName("cc.ag")
    public int field1719;

    @ObfuscatedName("cc.aj")
    public int field1720;

    @ObfuscatedName("cc.af")
    public int field1721;

    @ObfuscatedName("cc.aa")
    public static boolean[] field1723 = new boolean[4096];

    @ObfuscatedName("cc.ab")
    public static boolean[] field1724 = new boolean[4096];

    @ObfuscatedName("cc.ai")
    public static int[] field1716 = new int[4096];

    @ObfuscatedName("cc.ak")
    public static int[] field1726 = new int[4096];

    @ObfuscatedName("cc.ao")
    public static int[] field1715 = new int[4096];

    @ObfuscatedName("cc.ar")
    public static int[] field1722 = new int[4096];

    @ObfuscatedName("cc.aq")
    public static int[] field1697 = new int[4096];

    @ObfuscatedName("cc.an")
    public static int[] field1732 = new int[4096];

    @ObfuscatedName("cc.ac")
    public static int[] field1729 = new int[1600];

    @ObfuscatedName("cc.ay")
    public static int[][] field1733 = new int[1600][512];

    @ObfuscatedName("cc.ae")
    public static int[] field1734 = new int[12];

    @ObfuscatedName("cc.ah")
    public static int[][] field1752 = new int[12][2000];

    @ObfuscatedName("cc.aw")
    public static int[] field1736 = new int[2000];

    @ObfuscatedName("cc.ax")
    public static int[] field1737 = new int[2000];

    @ObfuscatedName("cc.at")
    public static int[] field1738 = new int[12];

    @ObfuscatedName("cc.ad")
    public static int[] field1712 = new int[10];

    @ObfuscatedName("cc.as")
    public static int[] field1740 = new int[10];

    @ObfuscatedName("cc.ap")
    public static int[] field1741 = new int[10];

    @ObfuscatedName("cc.bg")
    public static boolean field1745 = false;

    @ObfuscatedName("cc.bv")
    public static int field1708 = 0;

    @ObfuscatedName("cc.bf")
    public static int field1747 = 0;

    @ObfuscatedName("cc.bq")
    public static int field1692 = 0;

    @ObfuscatedName("cc.bk")
    public static int[] field1749 = new int[1000];

    @ObfuscatedName("cc.bu")
    public static int[] field1696 = class84.field1464;

    @ObfuscatedName("cc.br")
    public static int[] field1751 = class84.field1463;

    @ObfuscatedName("cc.bi")
    public static int[] field1746 = class84.field1482;

    @ObfuscatedName("cc.bl")
    public static int[] field1753 = class84.field1481;

    public class98() {
    }

    public class98(class98[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1694 = 0;
        this.field1698 = 0;
        this.field1710 = 0;
        this.field1709 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class98 var8 = arg0[var7];
            if (var8 != null) {
                this.field1694 += var8.field1694;
                this.field1698 += var8.field1698;
                this.field1710 += var8.field1710;
                if (var8.field1705 == null) {
                    if (this.field1709 == -1) {
                        this.field1709 = var8.field1709;
                    }
                    if (this.field1709 != var8.field1709) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1706 != null;
                var5 |= var8.field1690 != null;
                var6 |= var8.field1707 != null;
            }
        }
        this.field1695 = new int[this.field1694];
        this.field1728 = new int[this.field1694];
        this.field1731 = new int[this.field1694];
        this.field1756 = new int[this.field1698];
        this.field1700 = new int[this.field1698];
        this.field1750 = new int[this.field1698];
        this.field1702 = new int[this.field1698];
        this.field1703 = new int[this.field1698];
        this.field1704 = new int[this.field1698];
        if (var3) {
            this.field1705 = new byte[this.field1698];
        }
        if (var4) {
            this.field1706 = new byte[this.field1698];
        }
        if (var5) {
            this.field1690 = new short[this.field1698];
        }
        if (var6) {
            this.field1707 = new byte[this.field1698];
        }
        if (this.field1710 > 0) {
            this.field1711 = new int[this.field1710];
            this.field1739 = new int[this.field1710];
            this.field1714 = new int[this.field1710];
        }
        this.field1694 = 0;
        this.field1698 = 0;
        this.field1710 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class98 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1698; var11++) {
                    this.field1756[this.field1698] = var10.field1756[var11] + this.field1694;
                    this.field1700[this.field1698] = var10.field1700[var11] + this.field1694;
                    this.field1750[this.field1698] = var10.field1750[var11] + this.field1694;
                    this.field1702[this.field1698] = var10.field1702[var11];
                    this.field1703[this.field1698] = var10.field1703[var11];
                    this.field1704[this.field1698] = var10.field1704[var11];
                    if (var3) {
                        if (var10.field1705 == null) {
                            this.field1705[this.field1698] = var10.field1709;
                        } else {
                            this.field1705[this.field1698] = var10.field1705[var11];
                        }
                    }
                    if (var4 && var10.field1706 != null) {
                        this.field1706[this.field1698] = var10.field1706[var11];
                    }
                    if (var5) {
                        if (var10.field1690 == null) {
                            this.field1690[this.field1698] = -1;
                        } else {
                            this.field1690[this.field1698] = var10.field1690[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1707 == null || var10.field1707[var11] == -1) {
                            this.field1707[this.field1698] = -1;
                        } else {
                            this.field1707[this.field1698] = (byte) (var10.field1707[var11] + this.field1710);
                        }
                    }
                    this.field1698++;
                }
                for (int var12 = 0; var12 < var10.field1710; var12++) {
                    this.field1711[this.field1710] = var10.field1711[var12] + this.field1694;
                    this.field1739[this.field1710] = var10.field1739[var12] + this.field1694;
                    this.field1714[this.field1710] = var10.field1714[var12] + this.field1694;
                    this.field1710++;
                }
                for (int var13 = 0; var13 < var10.field1694; var13++) {
                    this.field1695[this.field1694] = var10.field1695[var13];
                    this.field1728[this.field1694] = var10.field1728[var13];
                    this.field1731[this.field1694] = var10.field1731[var13];
                    this.field1694++;
                }
            }
        }
    }

    @ObfuscatedName("cc.i([[IIIIZI)Lcc;")
    public class98 method2002(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2006();
        int var7 = arg1 - this.field1719;
        int var8 = this.field1719 + arg1;
        int var9 = arg3 - this.field1719;
        int var10 = this.field1719 + arg3;
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
            var15.field1694 = this.field1694;
            var15.field1698 = this.field1698;
            var15.field1710 = this.field1710;
            var15.field1695 = this.field1695;
            var15.field1731 = this.field1731;
            var15.field1756 = this.field1756;
            var15.field1700 = this.field1700;
            var15.field1750 = this.field1750;
            var15.field1702 = this.field1702;
            var15.field1703 = this.field1703;
            var15.field1704 = this.field1704;
            var15.field1705 = this.field1705;
            var15.field1706 = this.field1706;
            var15.field1707 = this.field1707;
            var15.field1690 = this.field1690;
            var15.field1709 = this.field1709;
            var15.field1711 = this.field1711;
            var15.field1739 = this.field1739;
            var15.field1714 = this.field1714;
            var15.field1735 = this.field1735;
            var15.field1748 = this.field1748;
            var15.field1701 = this.field1701;
            var15.field1728 = new int[var15.field1694];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1694; var16++) {
                int var17 = this.field1695[var16] + arg1;
                int var18 = this.field1731[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1728[var16] = this.field1728[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1694; var26++) {
                int var27 = (-this.field1728[var26] << 16) / this.field1358;
                if (var27 < arg5) {
                    int var28 = this.field1695[var26] + arg1;
                    int var29 = this.field1731[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1728[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1728[var26];
                }
            }
        }
        var15.field1717 = 0;
        return var15;
    }

    @ObfuscatedName("cc.h(Z)Lcc;")
    public class98 method2003(boolean arg0) {
        if (!arg0 && field1691.length < this.field1698) {
            field1691 = new byte[this.field1698 + 100];
        }
        return this.method2005(arg0, field1699, field1691);
    }

    @ObfuscatedName("cc.v(Z)Lcc;")
    public class98 method2004(boolean arg0) {
        if (!arg0 && field1693.length < this.field1698) {
            field1693 = new byte[this.field1698 + 100];
        }
        return this.method2005(arg0, field1725, field1693);
    }

    @ObfuscatedName("cc.q(ZLcc;[B)Lcc;")
    public class98 method2005(boolean arg0, class98 arg1, byte[] arg2) {
        arg1.field1694 = this.field1694;
        arg1.field1698 = this.field1698;
        arg1.field1710 = this.field1710;
        if (arg1.field1695 == null || arg1.field1695.length < this.field1694) {
            arg1.field1695 = new int[this.field1694 + 100];
            arg1.field1728 = new int[this.field1694 + 100];
            arg1.field1731 = new int[this.field1694 + 100];
        }
        for (int var4 = 0; var4 < this.field1694; var4++) {
            arg1.field1695[var4] = this.field1695[var4];
            arg1.field1728[var4] = this.field1728[var4];
            arg1.field1731[var4] = this.field1731[var4];
        }
        if (arg0) {
            arg1.field1706 = this.field1706;
        } else {
            arg1.field1706 = arg2;
            if (this.field1706 == null) {
                for (int var5 = 0; var5 < this.field1698; var5++) {
                    arg1.field1706[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1698; var6++) {
                    arg1.field1706[var6] = this.field1706[var6];
                }
            }
        }
        arg1.field1756 = this.field1756;
        arg1.field1700 = this.field1700;
        arg1.field1750 = this.field1750;
        arg1.field1702 = this.field1702;
        arg1.field1703 = this.field1703;
        arg1.field1704 = this.field1704;
        arg1.field1705 = this.field1705;
        arg1.field1707 = this.field1707;
        arg1.field1690 = this.field1690;
        arg1.field1709 = this.field1709;
        arg1.field1711 = this.field1711;
        arg1.field1739 = this.field1739;
        arg1.field1714 = this.field1714;
        arg1.field1735 = this.field1735;
        arg1.field1748 = this.field1748;
        arg1.field1701 = this.field1701;
        arg1.field1717 = 0;
        return arg1;
    }

    @ObfuscatedName("cc.u()V")
    public void method2006() {
        if (this.field1717 == 1) {
            return;
        }
        this.field1717 = 1;
        this.field1358 = 0;
        this.field1718 = 0;
        this.field1719 = 0;
        for (int var1 = 0; var1 < this.field1694; var1++) {
            int var2 = this.field1695[var1];
            int var3 = this.field1728[var1];
            int var4 = this.field1731[var1];
            if (-var3 > this.field1358) {
                this.field1358 = -var3;
            }
            if (var3 > this.field1718) {
                this.field1718 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1719) {
                this.field1719 = var5;
            }
        }
        this.field1719 = (int) (Math.sqrt((double) this.field1719) + 0.99D);
        this.field1721 = (int) (Math.sqrt((double) (this.field1358 * this.field1358 + this.field1719 * this.field1719)) + 0.99D);
        this.field1720 = this.field1721 + (int) (Math.sqrt((double) (this.field1719 * this.field1719 + this.field1718 * this.field1718)) + 0.99D);
    }

    @ObfuscatedName("cc.d()V")
    public void method2007() {
        if (this.field1717 == 2) {
            return;
        }
        this.field1717 = 2;
        this.field1719 = 0;
        for (int var1 = 0; var1 < this.field1694; var1++) {
            int var2 = this.field1695[var1];
            int var3 = this.field1728[var1];
            int var4 = this.field1731[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1719) {
                this.field1719 = var5;
            }
        }
        this.field1719 = (int) (Math.sqrt((double) this.field1719) + 0.99D);
        this.field1721 = this.field1719;
        this.field1720 = this.field1719 + this.field1719;
    }

    @ObfuscatedName("cc.y()I")
    public int method2008() {
        this.method2006();
        return this.field1719;
    }

    @ObfuscatedName("cc.e(Lci;I)V")
    public void method2009(class96 arg0, int arg1) {
        if (this.field1735 == null || arg1 == -1) {
            return;
        }
        class81 var3 = arg0.field1663[arg1];
        class95 var4 = var3.field1436;
        Statics.field1742 = 0;
        Statics.field1743 = 0;
        Statics.field1744 = 0;
        for (int var5 = 0; var5 < var3.field1439; var5++) {
            int var6 = var3.field1440[var5];
            this.method2049(var4.field1656[var6], var4.field1660[var6], var3.field1438[var5], var3.field1442[var5], var3.field1443[var5]);
        }
        this.field1717 = 0;
    }

    @ObfuscatedName("cc.l(Lci;ILci;I[I)V")
    public void method2010(class96 arg0, int arg1, class96 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2009(arg0, arg1);
            return;
        }
        class81 var6 = arg0.field1663[arg1];
        class81 var7 = arg2.field1663[arg3];
        class95 var8 = var6.field1436;
        Statics.field1742 = 0;
        Statics.field1743 = 0;
        Statics.field1744 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1439; var11++) {
            int var12 = var6.field1440[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1656[var12] == 0) {
                this.method2049(var8.field1656[var12], var8.field1660[var12], var6.field1438[var11], var6.field1442[var11], var6.field1443[var11]);
            }
        }
        Statics.field1742 = 0;
        Statics.field1743 = 0;
        Statics.field1744 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1439; var15++) {
            int var16 = var7.field1440[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1656[var16] == 0) {
                this.method2049(var8.field1656[var16], var8.field1660[var16], var7.field1438[var15], var7.field1442[var15], var7.field1443[var15]);
            }
        }
        this.field1717 = 0;
    }

    @ObfuscatedName("cc.o(I[IIII)V")
    public void method2049(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1742 = 0;
            Statics.field1743 = 0;
            Statics.field1744 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1735.length) {
                    int[] var10 = this.field1735[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1742 += this.field1695[var12];
                        Statics.field1743 += this.field1728[var12];
                        Statics.field1744 += this.field1731[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1742 = Statics.field1742 / var7 + arg2;
                Statics.field1743 = Statics.field1743 / var7 + arg3;
                Statics.field1744 = Statics.field1744 / var7 + arg4;
            } else {
                Statics.field1742 = arg2;
                Statics.field1743 = arg3;
                Statics.field1744 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1735.length) {
                    int[] var15 = this.field1735[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1695[var17] += arg2;
                        this.field1728[var17] += arg3;
                        this.field1731[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1735.length) {
                    int[] var20 = this.field1735[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1695[var22] -= Statics.field1742;
                        this.field1728[var22] -= Statics.field1743;
                        this.field1731[var22] -= Statics.field1744;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1696[var25];
                            int var27 = field1751[var25];
                            int var28 = this.field1728[var22] * var26 + this.field1695[var22] * var27 >> 16;
                            this.field1728[var22] = this.field1728[var22] * var27 - this.field1695[var22] * var26 >> 16;
                            this.field1695[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1696[var23];
                            int var30 = field1751[var23];
                            int var31 = this.field1728[var22] * var30 - this.field1731[var22] * var29 >> 16;
                            this.field1731[var22] = this.field1731[var22] * var30 + this.field1728[var22] * var29 >> 16;
                            this.field1728[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1696[var24];
                            int var33 = field1751[var24];
                            int var34 = this.field1731[var22] * var32 + this.field1695[var22] * var33 >> 16;
                            this.field1731[var22] = this.field1731[var22] * var33 - this.field1695[var22] * var32 >> 16;
                            this.field1695[var22] = var34;
                        }
                        this.field1695[var22] += Statics.field1742;
                        this.field1728[var22] += Statics.field1743;
                        this.field1731[var22] += Statics.field1744;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1735.length) {
                    int[] var37 = this.field1735[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1695[var39] -= Statics.field1742;
                        this.field1728[var39] -= Statics.field1743;
                        this.field1731[var39] -= Statics.field1744;
                        this.field1695[var39] = this.field1695[var39] * arg2 / 128;
                        this.field1728[var39] = this.field1728[var39] * arg3 / 128;
                        this.field1731[var39] = this.field1731[var39] * arg4 / 128;
                        this.field1695[var39] += Statics.field1742;
                        this.field1728[var39] += Statics.field1743;
                        this.field1731[var39] += Statics.field1744;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1748 != null && this.field1706 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1748.length) {
                    int[] var42 = this.field1748[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1706[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1706[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cc.w()V")
    public void method2050() {
        for (int var1 = 0; var1 < this.field1694; var1++) {
            int var2 = this.field1695[var1];
            this.field1695[var1] = this.field1731[var1];
            this.field1731[var1] = -var2;
        }
        this.field1717 = 0;
    }

    @ObfuscatedName("cc.t()V")
    public void method2013() {
        for (int var1 = 0; var1 < this.field1694; var1++) {
            this.field1695[var1] = -this.field1695[var1];
            this.field1731[var1] = -this.field1731[var1];
        }
        this.field1717 = 0;
    }

    @ObfuscatedName("cc.z()V")
    public void method2014() {
        for (int var1 = 0; var1 < this.field1694; var1++) {
            int var2 = this.field1731[var1];
            this.field1731[var1] = this.field1695[var1];
            this.field1695[var1] = -var2;
        }
        this.field1717 = 0;
    }

    @ObfuscatedName("cc.b(I)V")
    public void method2015(int arg0) {
        int var2 = field1696[arg0];
        int var3 = field1751[arg0];
        for (int var4 = 0; var4 < this.field1694; var4++) {
            int var5 = this.field1728[var4] * var3 - this.field1731[var4] * var2 >> 16;
            this.field1731[var4] = this.field1731[var4] * var3 + this.field1728[var4] * var2 >> 16;
            this.field1728[var4] = var5;
        }
        this.field1717 = 0;
    }

    @ObfuscatedName("cc.a(III)V")
    public void method2016(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1694; var4++) {
            this.field1695[var4] += arg0;
            this.field1728[var4] += arg1;
            this.field1731[var4] += arg2;
        }
        this.field1717 = 0;
    }

    @ObfuscatedName("cc.r(III)V")
    public void method2017(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1694; var4++) {
            this.field1695[var4] = this.field1695[var4] * arg0 / 128;
            this.field1728[var4] = this.field1728[var4] * arg1 / 128;
            this.field1731[var4] = this.field1731[var4] * arg2 / 128;
        }
        this.field1717 = 0;
    }

    @ObfuscatedName("cc.m(IIIIIII)V")
    public final void method2018(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1729[0] = -1;
        if (this.field1717 != 2 && this.field1717 != 1) {
            this.method2007();
        }
        int var8 = Statics.field1469;
        int var9 = Statics.field1470;
        int var10 = field1696[arg0];
        int var11 = field1751[arg0];
        int var12 = field1696[arg1];
        int var13 = field1751[arg1];
        int var14 = field1696[arg2];
        int var15 = field1751[arg2];
        int var16 = field1696[arg3];
        int var17 = field1751[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1694; var19++) {
            int var20 = this.field1695[var19];
            int var21 = this.field1728[var19];
            int var22 = this.field1731[var19];
            if (arg2 != 0) {
                int var23 = var14 * var21 + var15 * var20 >> 16;
                var21 = var15 * var21 - var14 * var20 >> 16;
                var20 = var23;
            }
            if (arg0 != 0) {
                int var24 = var11 * var21 - var10 * var22 >> 16;
                var22 = var10 * var21 + var11 * var22 >> 16;
                var21 = var24;
            }
            if (arg1 != 0) {
                int var25 = var12 * var22 + var13 * var20 >> 16;
                var22 = var13 * var22 - var12 * var20 >> 16;
                var20 = var25;
            }
            int var26 = arg4 + var20;
            int var27 = arg5 + var21;
            int var28 = arg6 + var22;
            int var29 = var17 * var27 - var16 * var28 >> 16;
            int var30 = var16 * var27 + var17 * var28 >> 16;
            field1715[var19] = var30 - var18;
            field1716[var19] = (var26 << 9) / var30 + var8;
            field1726[var19] = (var29 << 9) / var30 + var9;
            if (this.field1710 > 0) {
                field1722[var19] = var26;
                field1697[var19] = var29;
                field1732[var19] = var30;
            }
        }
        try {
            this.method2021(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cc.f(IIIIIIII)V")
    public final void method2056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1729[0] = -1;
        if (this.field1717 != 2 && this.field1717 != 1) {
            this.method2007();
        }
        int var9 = Statics.field1469;
        int var10 = Statics.field1470;
        int var11 = field1696[arg0];
        int var12 = field1751[arg0];
        int var13 = field1696[arg1];
        int var14 = field1751[arg1];
        int var15 = field1696[arg2];
        int var16 = field1751[arg2];
        int var17 = field1696[arg3];
        int var18 = field1751[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1694; var20++) {
            int var21 = this.field1695[var20];
            int var22 = this.field1728[var20];
            int var23 = this.field1731[var20];
            if (arg2 != 0) {
                int var24 = var15 * var22 + var16 * var21 >> 16;
                var22 = var16 * var22 - var15 * var21 >> 16;
                var21 = var24;
            }
            if (arg0 != 0) {
                int var25 = var12 * var22 - var11 * var23 >> 16;
                var23 = var11 * var22 + var12 * var23 >> 16;
                var22 = var25;
            }
            if (arg1 != 0) {
                int var26 = var13 * var23 + var14 * var21 >> 16;
                var23 = var14 * var23 - var13 * var21 >> 16;
                var21 = var26;
            }
            int var27 = arg4 + var21;
            int var28 = arg5 + var22;
            int var29 = arg6 + var23;
            int var30 = var18 * var28 - var17 * var29 >> 16;
            int var31 = var17 * var28 + var18 * var29 >> 16;
            field1715[var20] = var31 - var19;
            field1716[var20] = (var27 << 9) / arg7 + var9;
            field1726[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1710 > 0) {
                field1722[var20] = var27;
                field1697[var20] = var30;
                field1732[var20] = var31;
            }
        }
        try {
            this.method2021(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cc.al(IIIIIIIII)V")
    public void method1624(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1729[0] = -1;
        if (this.field1717 != 1) {
            this.method2006();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1719 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1719 << 9;
        if (var15 / var13 >= Statics.field1474) {
            return;
        }
        int var16 = this.field1719 + var14 << 9;
        if (var16 / var13 <= Statics.field1473) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1719 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1475) {
            return;
        }
        int var20 = (this.field1358 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1476) {
            return;
        }
        int var22 = (this.field1358 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1710 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1745) {
            int var27 = var11 - var12;
            if (var27 <= 50) {
                var27 = 50;
            }
            int var28;
            int var29;
            if (var14 > 0) {
                var28 = var15 / var13;
                var29 = var16 / var27;
            } else {
                var29 = var16 / var13;
                var28 = var15 / var27;
            }
            int var30;
            int var31;
            if (var17 > 0) {
                var30 = var21 / var13;
                var31 = var19 / var27;
            } else {
                var31 = var19 / var13;
                var30 = var21 / var27;
            }
            int var32 = field1708 - Statics.field1469;
            int var33 = field1747 - Statics.field1470;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1701) {
                    field1749[field1692++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1469;
        int var35 = Statics.field1470;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1696[arg0];
            var37 = field1751[arg0];
        }
        for (int var38 = 0; var38 < this.field1694; var38++) {
            int var39 = this.field1695[var38];
            int var40 = this.field1728[var38];
            int var41 = this.field1731[var38];
            if (arg0 != 0) {
                int var42 = var36 * var41 + var37 * var39 >> 16;
                var41 = var37 * var41 - var36 * var39 >> 16;
                var39 = var42;
            }
            int var43 = arg5 + var39;
            int var44 = arg6 + var40;
            int var45 = arg7 + var41;
            int var46 = arg3 * var45 + arg4 * var43 >> 16;
            int var47 = arg4 * var45 - arg3 * var43 >> 16;
            int var49 = arg2 * var44 - arg1 * var47 >> 16;
            int var50 = arg1 * var44 + arg2 * var47 >> 16;
            field1715[var38] = var50 - var11;
            if (var50 >= 50) {
                field1716[var38] = (var46 << 9) / var50 + var34;
                field1726[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1716[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1722[var38] = var46;
                field1697[var38] = var49;
                field1732[var38] = var50;
            }
        }
        try {
            this.method2021(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cc.k(ZZI)V")
    public final void method2021(boolean arg0, boolean arg1, int arg2) {
        if (this.field1720 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1720; var4++) {
            field1729[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1698; var5++) {
            if (this.field1704[var5] != -2) {
                int var6 = this.field1756[var5];
                int var7 = this.field1700[var5];
                int var8 = this.field1750[var5];
                int var9 = field1716[var6];
                int var10 = field1716[var7];
                int var11 = field1716[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1722[var6];
                    int var13 = field1722[var7];
                    int var14 = field1722[var8];
                    int var15 = field1697[var6];
                    int var16 = field1697[var7];
                    int var17 = field1697[var8];
                    int var18 = field1732[var6];
                    int var19 = field1732[var7];
                    int var20 = field1732[var8];
                    int var21 = var12 - var13;
                    int var22 = var14 - var13;
                    int var23 = var15 - var16;
                    int var24 = var17 - var16;
                    int var25 = var18 - var19;
                    int var26 = var20 - var19;
                    int var27 = var23 * var26 - var24 * var25;
                    int var28 = var22 * var25 - var21 * var26;
                    int var29 = var21 * var24 - var22 * var23;
                    if (var19 * var29 + var13 * var27 + var16 * var28 > 0) {
                        field1724[var5] = true;
                        int var30 = (field1715[var6] + field1715[var7] + field1715[var8]) / 3 + this.field1721;
                        field1733[var30][field1729[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2023(field1708, field1747, field1726[var6], field1726[var7], field1726[var8], var9, var10, var11)) {
                        field1749[field1692++] = arg2;
                        arg1 = false;
                    }
                    if ((field1726[var8] - field1726[var7]) * (var9 - var10) - (field1726[var6] - field1726[var7]) * (var11 - var10) > 0) {
                        field1724[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1471 && var10 <= Statics.field1471 && var11 <= Statics.field1471) {
                            field1723[var5] = false;
                        } else {
                            field1723[var5] = true;
                        }
                        int var31 = (field1715[var6] + field1715[var7] + field1715[var8]) / 3 + this.field1721;
                        field1733[var31][field1729[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1705 == null) {
            for (int var32 = this.field1720 - 1; var32 >= 0; var32--) {
                int var33 = field1729[var32];
                if (var33 > 0) {
                    int[] var34 = field1733[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2080(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1734[var36] = 0;
            field1738[var36] = 0;
        }
        for (int var37 = this.field1720 - 1; var37 >= 0; var37--) {
            int var38 = field1729[var37];
            if (var38 > 0) {
                int[] var39 = field1733[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1705[var41];
                    int var43 = field1734[var42]++;
                    field1752[var42][var43] = var41;
                    if (var42 < 10) {
                        field1738[var42] += var37;
                    } else if (var42 == 10) {
                        field1736[var43] = var37;
                    } else {
                        field1737[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1734[1] > 0 || field1734[2] > 0) {
            var44 = (field1738[1] + field1738[2]) / (field1734[1] + field1734[2]);
        }
        int var45 = 0;
        if (field1734[3] > 0 || field1734[4] > 0) {
            var45 = (field1738[3] + field1738[4]) / (field1734[3] + field1734[4]);
        }
        int var46 = 0;
        if (field1734[6] > 0 || field1734[8] > 0) {
            var46 = (field1738[6] + field1738[8]) / (field1734[6] + field1734[8]);
        }
        int var47 = 0;
        int var48 = field1734[10];
        int[] var49 = field1752[10];
        int[] var50 = field1736;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1734[11];
            var49 = field1752[11];
            var50 = field1737;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2080(var49[var47++]);
                if (var47 == var48 && field1752[11] != var49) {
                    var47 = 0;
                    var48 = field1734[11];
                    var49 = field1752[11];
                    var50 = field1737;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2080(var49[var47++]);
                if (var47 == var48 && field1752[11] != var49) {
                    var47 = 0;
                    var48 = field1734[11];
                    var49 = field1752[11];
                    var50 = field1737;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2080(var49[var47++]);
                if (var47 == var48 && field1752[11] != var49) {
                    var47 = 0;
                    var48 = field1734[11];
                    var49 = field1752[11];
                    var50 = field1737;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1734[var52];
            int[] var54 = field1752[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2080(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2080(var49[var47++]);
            if (var47 == var48 && field1752[11] != var49) {
                var47 = 0;
                var49 = field1752[11];
                var48 = field1734[11];
                var50 = field1737;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cc.p(I)V")
    public final void method2080(int arg0) {
        if (field1724[arg0]) {
            this.method2022(arg0);
            return;
        }
        int var2 = this.field1756[arg0];
        int var3 = this.field1700[arg0];
        int var4 = this.field1750[arg0];
        class84.field1460 = field1723[arg0];
        if (this.field1706 == null) {
            class84.field1462 = 0;
        } else {
            class84.field1462 = this.field1706[arg0] & 0xFF;
        }
        if (this.field1690 != null && this.field1690[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1707 == null || this.field1707[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1707[arg0] & 0xFF;
                var6 = this.field1711[var5];
                var7 = this.field1739[var5];
                var8 = this.field1714[var5];
            }
            if (this.field1704[arg0] == -1) {
                class84.method1852(field1726[var2], field1726[var3], field1726[var4], field1716[var2], field1716[var3], field1716[var4], this.field1702[arg0], this.field1702[arg0], this.field1702[arg0], field1722[var6], field1722[var7], field1722[var8], field1697[var6], field1697[var7], field1697[var8], field1732[var6], field1732[var7], field1732[var8], this.field1690[arg0]);
            } else {
                class84.method1852(field1726[var2], field1726[var3], field1726[var4], field1716[var2], field1716[var3], field1716[var4], this.field1702[arg0], this.field1703[arg0], this.field1704[arg0], field1722[var6], field1722[var7], field1722[var8], field1697[var6], field1697[var7], field1697[var8], field1732[var6], field1732[var7], field1732[var8], this.field1690[arg0]);
            }
        } else if (this.field1704[arg0] == -1) {
            class84.method1808(field1726[var2], field1726[var3], field1726[var4], field1716[var2], field1716[var3], field1716[var4], field1746[this.field1702[arg0]]);
        } else {
            class84.method1806(field1726[var2], field1726[var3], field1726[var4], field1716[var2], field1716[var3], field1716[var4], this.field1702[arg0], this.field1703[arg0], this.field1704[arg0]);
        }
    }

    @ObfuscatedName("cc.n(I)V")
    public final void method2022(int arg0) {
        int var2 = Statics.field1469;
        int var3 = Statics.field1470;
        int var4 = 0;
        int var5 = this.field1756[arg0];
        int var6 = this.field1700[arg0];
        int var7 = this.field1750[arg0];
        int var8 = field1732[var5];
        int var9 = field1732[var6];
        int var10 = field1732[var7];
        if (this.field1706 == null) {
            class84.field1462 = 0;
        } else {
            class84.field1462 = this.field1706[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1712[var4] = field1716[var5];
            field1740[var4] = field1726[var5];
            field1741[var4++] = this.field1702[arg0];
        } else {
            int var11 = field1722[var5];
            int var12 = field1697[var5];
            int var13 = this.field1702[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1753[var10 - var8];
                field1712[var4] = (((field1722[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1740[var4] = (((field1697[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1741[var4++] = ((this.field1704[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1753[var9 - var8];
                field1712[var4] = (((field1722[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1740[var4] = (((field1697[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1741[var4++] = ((this.field1703[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1712[var4] = field1716[var6];
            field1740[var4] = field1726[var6];
            field1741[var4++] = this.field1703[arg0];
        } else {
            int var16 = field1722[var6];
            int var17 = field1697[var6];
            int var18 = this.field1703[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1753[var8 - var9];
                field1712[var4] = (((field1722[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1740[var4] = (((field1697[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1741[var4++] = ((this.field1702[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1753[var10 - var9];
                field1712[var4] = (((field1722[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1740[var4] = (((field1697[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1741[var4++] = ((this.field1704[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1712[var4] = field1716[var7];
            field1740[var4] = field1726[var7];
            field1741[var4++] = this.field1704[arg0];
        } else {
            int var21 = field1722[var7];
            int var22 = field1697[var7];
            int var23 = this.field1704[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1753[var9 - var10];
                field1712[var4] = (((field1722[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1740[var4] = (((field1697[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1741[var4++] = ((this.field1703[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1753[var8 - var10];
                field1712[var4] = (((field1722[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1740[var4] = (((field1697[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1741[var4++] = ((this.field1702[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1712[0];
        int var27 = field1712[1];
        int var28 = field1712[2];
        int var29 = field1740[0];
        int var30 = field1740[1];
        int var31 = field1740[2];
        class84.field1460 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1471 || var27 > Statics.field1471 || var28 > Statics.field1471) {
                class84.field1460 = true;
            }
            if (this.field1690 != null && this.field1690[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1707 == null || this.field1707[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1707[arg0] & 0xFF;
                    var33 = this.field1711[var32];
                    var34 = this.field1739[var32];
                    var35 = this.field1714[var32];
                }
                if (this.field1704[arg0] == -1) {
                    class84.method1852(var29, var30, var31, var26, var27, var28, this.field1702[arg0], this.field1702[arg0], this.field1702[arg0], field1722[var33], field1722[var34], field1722[var35], field1697[var33], field1697[var34], field1697[var35], field1732[var33], field1732[var34], field1732[var35], this.field1690[arg0]);
                } else {
                    class84.method1852(var29, var30, var31, var26, var27, var28, field1741[0], field1741[1], field1741[2], field1722[var33], field1722[var34], field1722[var35], field1697[var33], field1697[var34], field1697[var35], field1732[var33], field1732[var34], field1732[var35], this.field1690[arg0]);
                }
            } else if (this.field1704[arg0] == -1) {
                class84.method1808(var29, var30, var31, var26, var27, var28, field1746[this.field1702[arg0]]);
            } else {
                class84.method1806(var29, var30, var31, var26, var27, var28, field1741[0], field1741[1], field1741[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1471 || var27 > Statics.field1471 || var28 > Statics.field1471 || field1712[3] < 0 || field1712[3] > Statics.field1471) {
            class84.field1460 = true;
        }
        if (this.field1690 != null && this.field1690[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1707 == null || this.field1707[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1707[arg0] & 0xFF;
                var37 = this.field1711[var36];
                var38 = this.field1739[var36];
                var39 = this.field1714[var36];
            }
            short var40 = this.field1690[arg0];
            if (this.field1704[arg0] == -1) {
                class84.method1852(var29, var30, var31, var26, var27, var28, this.field1702[arg0], this.field1702[arg0], this.field1702[arg0], field1722[var37], field1722[var38], field1722[var39], field1697[var37], field1697[var38], field1697[var39], field1732[var37], field1732[var38], field1732[var39], var40);
                class84.method1852(var29, var31, field1740[3], var26, var28, field1712[3], this.field1702[arg0], this.field1702[arg0], this.field1702[arg0], field1722[var37], field1722[var38], field1722[var39], field1697[var37], field1697[var38], field1697[var39], field1732[var37], field1732[var38], field1732[var39], var40);
            } else {
                class84.method1852(var29, var30, var31, var26, var27, var28, field1741[0], field1741[1], field1741[2], field1722[var37], field1722[var38], field1722[var39], field1697[var37], field1697[var38], field1697[var39], field1732[var37], field1732[var38], field1732[var39], var40);
                class84.method1852(var29, var31, field1740[3], var26, var28, field1712[3], field1741[0], field1741[2], field1741[3], field1722[var37], field1722[var38], field1722[var39], field1697[var37], field1697[var38], field1697[var39], field1732[var37], field1732[var38], field1732[var39], var40);
            }
        } else if (this.field1704[arg0] == -1) {
            int var41 = field1746[this.field1702[arg0]];
            class84.method1808(var29, var30, var31, var26, var27, var28, var41);
            class84.method1808(var29, var31, field1740[3], var26, var28, field1712[3], var41);
        } else {
            class84.method1806(var29, var30, var31, var26, var27, var28, field1741[0], field1741[1], field1741[2]);
            class84.method1806(var29, var31, field1740[3], var26, var28, field1712[3], field1741[0], field1741[2], field1741[3]);
        }
    }

    @ObfuscatedName("cc.j(IIIIIIII)Z")
    public final boolean method2023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }
}
