package deob;

@ObfuscatedName("ce")
public class class98 extends class78 {

    @ObfuscatedName("ce.g")
    public static class98 field1737 = new class98();

    @ObfuscatedName("ce.i")
    public static byte[] field1696 = new byte[1];

    @ObfuscatedName("ce.k")
    public static class98 field1701 = new class98();

    @ObfuscatedName("ce.e")
    public static byte[] field1754 = new byte[1];

    @ObfuscatedName("ce.w")
    public int field1699 = 0;

    @ObfuscatedName("ce.m")
    public int[] field1711;

    @ObfuscatedName("ce.u")
    public int[] field1695;

    @ObfuscatedName("ce.j")
    public int[] field1702;

    @ObfuscatedName("ce.o")
    public int field1741 = 0;

    @ObfuscatedName("ce.h")
    public int[] field1704;

    @ObfuscatedName("ce.b")
    public int[] field1697;

    @ObfuscatedName("ce.r")
    public int[] field1706;

    @ObfuscatedName("ce.l")
    public int[] field1703;

    @ObfuscatedName("ce.x")
    public int[] field1708;

    @ObfuscatedName("ce.q")
    public int[] field1715;

    @ObfuscatedName("ce.t")
    public byte[] field1710;

    @ObfuscatedName("ce.y")
    public byte[] field1750;

    @ObfuscatedName("ce.d")
    public byte[] field1698;

    @ObfuscatedName("ce.z")
    public short[] field1713;

    @ObfuscatedName("ce.n")
    public byte field1714 = 0;

    @ObfuscatedName("ce.v")
    public int field1744 = 0;

    @ObfuscatedName("ce.f")
    public int[] field1716;

    @ObfuscatedName("ce.a")
    public int[] field1717;

    @ObfuscatedName("ce.p")
    public int[] field1755;

    @ObfuscatedName("ce.s")
    public int[][] field1719;

    @ObfuscatedName("ce.c")
    public int[][] field1720;

    @ObfuscatedName("ce.ar")
    public boolean field1721 = false;

    @ObfuscatedName("ce.ac")
    public int field1722;

    @ObfuscatedName("ce.ah")
    public int field1723;

    @ObfuscatedName("ce.ap")
    public int field1724;

    @ObfuscatedName("ce.aj")
    public int field1725;

    @ObfuscatedName("ce.as")
    public int field1726;

    @ObfuscatedName("ce.am")
    public static boolean[] field1728 = new boolean[4096];

    @ObfuscatedName("ce.ae")
    public static boolean[] field1729 = new boolean[4096];

    @ObfuscatedName("ce.ai")
    public static int[] field1730 = new int[4096];

    @ObfuscatedName("ce.ay")
    public static int[] field1731 = new int[4096];

    @ObfuscatedName("ce.ax")
    public static int[] field1732 = new int[4096];

    @ObfuscatedName("ce.au")
    public static int[] field1733 = new int[4096];

    @ObfuscatedName("ce.az")
    public static int[] field1705 = new int[4096];

    @ObfuscatedName("ce.aw")
    public static int[] field1735 = new int[4096];

    @ObfuscatedName("ce.ao")
    public static int[] field1734 = new int[1600];

    @ObfuscatedName("ce.aq")
    public static int[][] field1738 = new int[1600][512];

    @ObfuscatedName("ce.ak")
    public static int[] field1718 = new int[12];

    @ObfuscatedName("ce.al")
    public static int[][] field1740 = new int[12][2000];

    @ObfuscatedName("ce.at")
    public static int[] field1712 = new int[2000];

    @ObfuscatedName("ce.an")
    public static int[] field1742 = new int[2000];

    @ObfuscatedName("ce.av")
    public static int[] field1736 = new int[12];

    @ObfuscatedName("ce.ab")
    public static int[] field1760 = new int[10];

    @ObfuscatedName("ce.ad")
    public static int[] field1745 = new int[10];

    @ObfuscatedName("ce.af")
    public static int[] field1707 = new int[10];

    @ObfuscatedName("ce.bq")
    public static boolean field1709 = false;

    @ObfuscatedName("ce.ba")
    public static int field1751 = 0;

    @ObfuscatedName("ce.bf")
    public static int field1752 = 0;

    @ObfuscatedName("ce.bw")
    public static int field1753 = 0;

    @ObfuscatedName("ce.bz")
    public static int[] field1743 = new int[1000];

    @ObfuscatedName("ce.be")
    public static int[] field1749 = class84.field1491;

    @ObfuscatedName("ce.bc")
    public static int[] field1756 = class84.field1492;

    @ObfuscatedName("ce.bn")
    public static int[] field1757 = class84.field1480;

    @ObfuscatedName("ce.bb")
    public static int[] field1758 = class84.field1486;

    public class98() {
    }

    public class98(class98[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1699 = 0;
        this.field1741 = 0;
        this.field1744 = 0;
        this.field1714 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class98 var8 = arg0[var7];
            if (var8 != null) {
                this.field1699 += var8.field1699;
                this.field1741 += var8.field1741;
                this.field1744 += var8.field1744;
                if (var8.field1710 == null) {
                    if (this.field1714 == -1) {
                        this.field1714 = var8.field1714;
                    }
                    if (this.field1714 != var8.field1714) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1750 != null;
                var5 |= var8.field1713 != null;
                var6 |= var8.field1698 != null;
            }
        }
        this.field1711 = new int[this.field1699];
        this.field1695 = new int[this.field1699];
        this.field1702 = new int[this.field1699];
        this.field1704 = new int[this.field1741];
        this.field1697 = new int[this.field1741];
        this.field1706 = new int[this.field1741];
        this.field1703 = new int[this.field1741];
        this.field1708 = new int[this.field1741];
        this.field1715 = new int[this.field1741];
        if (var3) {
            this.field1710 = new byte[this.field1741];
        }
        if (var4) {
            this.field1750 = new byte[this.field1741];
        }
        if (var5) {
            this.field1713 = new short[this.field1741];
        }
        if (var6) {
            this.field1698 = new byte[this.field1741];
        }
        if (this.field1744 > 0) {
            this.field1716 = new int[this.field1744];
            this.field1717 = new int[this.field1744];
            this.field1755 = new int[this.field1744];
        }
        this.field1699 = 0;
        this.field1741 = 0;
        this.field1744 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class98 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1741; var11++) {
                    this.field1704[this.field1741] = var10.field1704[var11] + this.field1699;
                    this.field1697[this.field1741] = var10.field1697[var11] + this.field1699;
                    this.field1706[this.field1741] = var10.field1706[var11] + this.field1699;
                    this.field1703[this.field1741] = var10.field1703[var11];
                    this.field1708[this.field1741] = var10.field1708[var11];
                    this.field1715[this.field1741] = var10.field1715[var11];
                    if (var3) {
                        if (var10.field1710 == null) {
                            this.field1710[this.field1741] = var10.field1714;
                        } else {
                            this.field1710[this.field1741] = var10.field1710[var11];
                        }
                    }
                    if (var4 && var10.field1750 != null) {
                        this.field1750[this.field1741] = var10.field1750[var11];
                    }
                    if (var5) {
                        if (var10.field1713 == null) {
                            this.field1713[this.field1741] = -1;
                        } else {
                            this.field1713[this.field1741] = var10.field1713[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1698 == null || var10.field1698[var11] == -1) {
                            this.field1698[this.field1741] = -1;
                        } else {
                            this.field1698[this.field1741] = (byte) (var10.field1698[var11] + this.field1744);
                        }
                    }
                    this.field1741++;
                }
                for (int var12 = 0; var12 < var10.field1744; var12++) {
                    this.field1716[this.field1744] = var10.field1716[var12] + this.field1699;
                    this.field1717[this.field1744] = var10.field1717[var12] + this.field1699;
                    this.field1755[this.field1744] = var10.field1755[var12] + this.field1699;
                    this.field1744++;
                }
                for (int var13 = 0; var13 < var10.field1699; var13++) {
                    this.field1711[this.field1699] = var10.field1711[var13];
                    this.field1695[this.field1699] = var10.field1695[var13];
                    this.field1702[this.field1699] = var10.field1702[var13];
                    this.field1699++;
                }
            }
        }
    }

    @ObfuscatedName("ce.g([[IIIIZI)Lce;")
    public class98 method2002(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1955();
        int var7 = arg1 - this.field1724;
        int var8 = this.field1724 + arg1;
        int var9 = arg3 - this.field1724;
        int var10 = this.field1724 + arg3;
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
            var15.field1699 = this.field1699;
            var15.field1741 = this.field1741;
            var15.field1744 = this.field1744;
            var15.field1711 = this.field1711;
            var15.field1702 = this.field1702;
            var15.field1704 = this.field1704;
            var15.field1697 = this.field1697;
            var15.field1706 = this.field1706;
            var15.field1703 = this.field1703;
            var15.field1708 = this.field1708;
            var15.field1715 = this.field1715;
            var15.field1710 = this.field1710;
            var15.field1750 = this.field1750;
            var15.field1698 = this.field1698;
            var15.field1713 = this.field1713;
            var15.field1714 = this.field1714;
            var15.field1716 = this.field1716;
            var15.field1717 = this.field1717;
            var15.field1755 = this.field1755;
            var15.field1719 = this.field1719;
            var15.field1720 = this.field1720;
            var15.field1721 = this.field1721;
            var15.field1695 = new int[var15.field1699];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1699; var16++) {
                int var17 = this.field1711[var16] + arg1;
                int var18 = this.field1702[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1695[var16] = this.field1695[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1699; var26++) {
                int var27 = (-this.field1695[var26] << 16) / this.field1360;
                if (var27 < arg5) {
                    int var28 = this.field1711[var26] + arg1;
                    int var29 = this.field1702[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1695[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1695[var26];
                }
            }
        }
        var15.field1722 = 0;
        return var15;
    }

    @ObfuscatedName("ce.k(Z)Lce;")
    public class98 method1983(boolean arg0) {
        if (!arg0 && field1696.length < this.field1741) {
            field1696 = new byte[this.field1741 + 100];
        }
        return this.method1973(arg0, field1737, field1696);
    }

    @ObfuscatedName("ce.e(Z)Lce;")
    public class98 method1953(boolean arg0) {
        if (!arg0 && field1754.length < this.field1741) {
            field1754 = new byte[this.field1741 + 100];
        }
        return this.method1973(arg0, field1701, field1754);
    }

    @ObfuscatedName("ce.w(ZLce;[B)Lce;")
    public class98 method1973(boolean arg0, class98 arg1, byte[] arg2) {
        arg1.field1699 = this.field1699;
        arg1.field1741 = this.field1741;
        arg1.field1744 = this.field1744;
        if (arg1.field1711 == null || arg1.field1711.length < this.field1699) {
            arg1.field1711 = new int[this.field1699 + 100];
            arg1.field1695 = new int[this.field1699 + 100];
            arg1.field1702 = new int[this.field1699 + 100];
        }
        for (int var4 = 0; var4 < this.field1699; var4++) {
            arg1.field1711[var4] = this.field1711[var4];
            arg1.field1695[var4] = this.field1695[var4];
            arg1.field1702[var4] = this.field1702[var4];
        }
        if (arg0) {
            arg1.field1750 = this.field1750;
        } else {
            arg1.field1750 = arg2;
            if (this.field1750 == null) {
                for (int var5 = 0; var5 < this.field1741; var5++) {
                    arg1.field1750[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1741; var6++) {
                    arg1.field1750[var6] = this.field1750[var6];
                }
            }
        }
        arg1.field1704 = this.field1704;
        arg1.field1697 = this.field1697;
        arg1.field1706 = this.field1706;
        arg1.field1703 = this.field1703;
        arg1.field1708 = this.field1708;
        arg1.field1715 = this.field1715;
        arg1.field1710 = this.field1710;
        arg1.field1698 = this.field1698;
        arg1.field1713 = this.field1713;
        arg1.field1714 = this.field1714;
        arg1.field1716 = this.field1716;
        arg1.field1717 = this.field1717;
        arg1.field1755 = this.field1755;
        arg1.field1719 = this.field1719;
        arg1.field1720 = this.field1720;
        arg1.field1721 = this.field1721;
        arg1.field1722 = 0;
        return arg1;
    }

    @ObfuscatedName("ce.m()V")
    public void method1955() {
        if (this.field1722 == 1) {
            return;
        }
        this.field1722 = 1;
        this.field1360 = 0;
        this.field1723 = 0;
        this.field1724 = 0;
        for (int var1 = 0; var1 < this.field1699; var1++) {
            int var2 = this.field1711[var1];
            int var3 = this.field1695[var1];
            int var4 = this.field1702[var1];
            if (-var3 > this.field1360) {
                this.field1360 = -var3;
            }
            if (var3 > this.field1723) {
                this.field1723 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1724) {
                this.field1724 = var5;
            }
        }
        this.field1724 = (int) (Math.sqrt((double) this.field1724) + 0.99D);
        this.field1726 = (int) (Math.sqrt((double) (this.field1360 * this.field1360 + this.field1724 * this.field1724)) + 0.99D);
        this.field1725 = this.field1726 + (int) (Math.sqrt((double) (this.field1724 * this.field1724 + this.field1723 * this.field1723)) + 0.99D);
    }

    @ObfuscatedName("ce.u()V")
    public void method1956() {
        if (this.field1722 == 2) {
            return;
        }
        this.field1722 = 2;
        this.field1724 = 0;
        for (int var1 = 0; var1 < this.field1699; var1++) {
            int var2 = this.field1711[var1];
            int var3 = this.field1695[var1];
            int var4 = this.field1702[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1724) {
                this.field1724 = var5;
            }
        }
        this.field1724 = (int) (Math.sqrt((double) this.field1724) + 0.99D);
        this.field1726 = this.field1724;
        this.field1725 = this.field1724 + this.field1724;
    }

    @ObfuscatedName("ce.j()I")
    public int method1976() {
        this.method1955();
        return this.field1724;
    }

    @ObfuscatedName("ce.b(Lcj;I)V")
    public void method1957(class96 arg0, int arg1) {
        if (this.field1719 == null || arg1 == -1) {
            return;
        }
        class81 var3 = arg0.field1670[arg1];
        class95 var4 = var3.field1443;
        Statics.field1747 = 0;
        Statics.field1748 = 0;
        Statics.field1700 = 0;
        for (int var5 = 0; var5 < var3.field1448; var5++) {
            int var6 = var3.field1444[var5];
            this.method1959(var4.field1661[var6], var4.field1662[var6], var3.field1445[var5], var3.field1446[var5], var3.field1447[var5]);
        }
        this.field1722 = 0;
    }

    @ObfuscatedName("ce.r(Lcj;ILcj;I[I)V")
    public void method2013(class96 arg0, int arg1, class96 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1957(arg0, arg1);
            return;
        }
        class81 var6 = arg0.field1670[arg1];
        class81 var7 = arg2.field1670[arg3];
        class95 var8 = var6.field1443;
        Statics.field1747 = 0;
        Statics.field1748 = 0;
        Statics.field1700 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1448; var11++) {
            int var12 = var6.field1444[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1661[var12] == 0) {
                this.method1959(var8.field1661[var12], var8.field1662[var12], var6.field1445[var11], var6.field1446[var11], var6.field1447[var11]);
            }
        }
        Statics.field1747 = 0;
        Statics.field1748 = 0;
        Statics.field1700 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1448; var15++) {
            int var16 = var7.field1444[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1661[var16] == 0) {
                this.method1959(var8.field1661[var16], var8.field1662[var16], var7.field1445[var15], var7.field1446[var15], var7.field1447[var15]);
            }
        }
        this.field1722 = 0;
    }

    @ObfuscatedName("ce.l(I[IIII)V")
    public void method1959(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1747 = 0;
            Statics.field1748 = 0;
            Statics.field1700 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1719.length) {
                    int[] var10 = this.field1719[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1747 += this.field1711[var12];
                        Statics.field1748 += this.field1695[var12];
                        Statics.field1700 += this.field1702[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1747 = Statics.field1747 / var7 + arg2;
                Statics.field1748 = Statics.field1748 / var7 + arg3;
                Statics.field1700 = Statics.field1700 / var7 + arg4;
            } else {
                Statics.field1747 = arg2;
                Statics.field1748 = arg3;
                Statics.field1700 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1719.length) {
                    int[] var15 = this.field1719[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1711[var17] += arg2;
                        this.field1695[var17] += arg3;
                        this.field1702[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1719.length) {
                    int[] var20 = this.field1719[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1711[var22] -= Statics.field1747;
                        this.field1695[var22] -= Statics.field1748;
                        this.field1702[var22] -= Statics.field1700;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1749[var25];
                            int var27 = field1756[var25];
                            int var28 = this.field1711[var22] * var27 + this.field1695[var22] * var26 >> 16;
                            this.field1695[var22] = this.field1695[var22] * var27 - this.field1711[var22] * var26 >> 16;
                            this.field1711[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1749[var23];
                            int var30 = field1756[var23];
                            int var31 = this.field1695[var22] * var30 - this.field1702[var22] * var29 >> 16;
                            this.field1702[var22] = this.field1702[var22] * var30 + this.field1695[var22] * var29 >> 16;
                            this.field1695[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1749[var24];
                            int var33 = field1756[var24];
                            int var34 = this.field1711[var22] * var33 + this.field1702[var22] * var32 >> 16;
                            this.field1702[var22] = this.field1702[var22] * var33 - this.field1711[var22] * var32 >> 16;
                            this.field1711[var22] = var34;
                        }
                        this.field1711[var22] += Statics.field1747;
                        this.field1695[var22] += Statics.field1748;
                        this.field1702[var22] += Statics.field1700;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1719.length) {
                    int[] var37 = this.field1719[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1711[var39] -= Statics.field1747;
                        this.field1695[var39] -= Statics.field1748;
                        this.field1702[var39] -= Statics.field1700;
                        this.field1711[var39] = this.field1711[var39] * arg2 / 128;
                        this.field1695[var39] = this.field1695[var39] * arg3 / 128;
                        this.field1702[var39] = this.field1702[var39] * arg4 / 128;
                        this.field1711[var39] += Statics.field1747;
                        this.field1695[var39] += Statics.field1748;
                        this.field1702[var39] += Statics.field1700;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1720 != null && this.field1750 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1720.length) {
                    int[] var42 = this.field1720[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1750[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1750[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ce.x()V")
    public void method1978() {
        for (int var1 = 0; var1 < this.field1699; var1++) {
            int var2 = this.field1711[var1];
            this.field1711[var1] = this.field1702[var1];
            this.field1702[var1] = -var2;
        }
        this.field1722 = 0;
    }

    @ObfuscatedName("ce.q()V")
    public void method1961() {
        for (int var1 = 0; var1 < this.field1699; var1++) {
            this.field1711[var1] = -this.field1711[var1];
            this.field1702[var1] = -this.field1702[var1];
        }
        this.field1722 = 0;
    }

    @ObfuscatedName("ce.t()V")
    public void method1962() {
        for (int var1 = 0; var1 < this.field1699; var1++) {
            int var2 = this.field1702[var1];
            this.field1702[var1] = this.field1711[var1];
            this.field1711[var1] = -var2;
        }
        this.field1722 = 0;
    }

    @ObfuscatedName("ce.y(I)V")
    public void method1971(int arg0) {
        int var2 = field1749[arg0];
        int var3 = field1756[arg0];
        for (int var4 = 0; var4 < this.field1699; var4++) {
            int var5 = this.field1695[var4] * var3 - this.field1702[var4] * var2 >> 16;
            this.field1702[var4] = this.field1702[var4] * var3 + this.field1695[var4] * var2 >> 16;
            this.field1695[var4] = var5;
        }
        this.field1722 = 0;
    }

    @ObfuscatedName("ce.d(III)V")
    public void method1966(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1699; var4++) {
            this.field1711[var4] += arg0;
            this.field1695[var4] += arg1;
            this.field1702[var4] += arg2;
        }
        this.field1722 = 0;
    }

    @ObfuscatedName("ce.z(III)V")
    public void method1968(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1699; var4++) {
            this.field1711[var4] = this.field1711[var4] * arg0 / 128;
            this.field1695[var4] = this.field1695[var4] * arg1 / 128;
            this.field1702[var4] = this.field1702[var4] * arg2 / 128;
        }
        this.field1722 = 0;
    }

    @ObfuscatedName("ce.n(IIIIIII)V")
    public final void method2025(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1734[0] = -1;
        if (this.field1722 != 2 && this.field1722 != 1) {
            this.method1956();
        }
        int var8 = Statics.field1478;
        int var9 = Statics.field1482;
        int var10 = field1749[arg0];
        int var11 = field1756[arg0];
        int var12 = field1749[arg1];
        int var13 = field1756[arg1];
        int var14 = field1749[arg2];
        int var15 = field1756[arg2];
        int var16 = field1749[arg3];
        int var17 = field1756[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1699; var19++) {
            int var20 = this.field1711[var19];
            int var21 = this.field1695[var19];
            int var22 = this.field1702[var19];
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
            field1732[var19] = var30 - var18;
            field1730[var19] = (var26 << 9) / var30 + var8;
            field1731[var19] = (var29 << 9) / var30 + var9;
            if (this.field1744 > 0) {
                field1733[var19] = var26;
                field1705[var19] = var29;
                field1735[var19] = var30;
            }
        }
        try {
            this.method1969(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ce.v(IIIIIIII)V")
    public final void method1967(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1734[0] = -1;
        if (this.field1722 != 2 && this.field1722 != 1) {
            this.method1956();
        }
        int var9 = Statics.field1478;
        int var10 = Statics.field1482;
        int var11 = field1749[arg0];
        int var12 = field1756[arg0];
        int var13 = field1749[arg1];
        int var14 = field1756[arg1];
        int var15 = field1749[arg2];
        int var16 = field1756[arg2];
        int var17 = field1749[arg3];
        int var18 = field1756[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1699; var20++) {
            int var21 = this.field1711[var20];
            int var22 = this.field1695[var20];
            int var23 = this.field1702[var20];
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
            field1732[var20] = var31 - var19;
            field1730[var20] = (var27 << 9) / arg7 + var9;
            field1731[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1744 > 0) {
                field1733[var20] = var27;
                field1705[var20] = var30;
                field1735[var20] = var31;
            }
        }
        try {
            this.method1969(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ce.ac(IIIIIIIII)V")
    public void method1572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1734[0] = -1;
        if (this.field1722 != 1) {
            this.method1955();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1724 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1724 << 9;
        if (var15 / var13 >= Statics.field1483) {
            return;
        }
        int var16 = this.field1724 + var14 << 9;
        if (var16 / var13 <= Statics.field1473) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1724 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1490) {
            return;
        }
        int var20 = (this.field1360 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1481) {
            return;
        }
        int var22 = (this.field1360 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1744 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1709) {
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
            int var32 = field1751 - Statics.field1478;
            int var33 = field1752 - Statics.field1482;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1721) {
                    field1743[field1753++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1478;
        int var35 = Statics.field1482;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1749[arg0];
            var37 = field1756[arg0];
        }
        for (int var38 = 0; var38 < this.field1699; var38++) {
            int var39 = this.field1711[var38];
            int var40 = this.field1695[var38];
            int var41 = this.field1702[var38];
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
            field1732[var38] = var50 - var11;
            if (var50 >= 50) {
                field1730[var38] = (var46 << 9) / var50 + var34;
                field1731[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1730[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1733[var38] = var46;
                field1705[var38] = var49;
                field1735[var38] = var50;
            }
        }
        try {
            this.method1969(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("ce.f(ZZI)V")
    public final void method1969(boolean arg0, boolean arg1, int arg2) {
        if (this.field1725 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1725; var4++) {
            field1734[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1741; var5++) {
            if (this.field1715[var5] != -2) {
                int var6 = this.field1704[var5];
                int var7 = this.field1697[var5];
                int var8 = this.field1706[var5];
                int var9 = field1730[var6];
                int var10 = field1730[var7];
                int var11 = field1730[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1733[var6];
                    int var13 = field1733[var7];
                    int var14 = field1733[var8];
                    int var15 = field1705[var6];
                    int var16 = field1705[var7];
                    int var17 = field1705[var8];
                    int var18 = field1735[var6];
                    int var19 = field1735[var7];
                    int var20 = field1735[var8];
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
                        field1729[var5] = true;
                        int var30 = (field1732[var6] + field1732[var7] + field1732[var8]) / 3 + this.field1726;
                        field1738[var30][field1734[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method1972(field1751, field1752, field1731[var6], field1731[var7], field1731[var8], var9, var10, var11)) {
                        field1743[field1753++] = arg2;
                        arg1 = false;
                    }
                    if ((field1731[var8] - field1731[var7]) * (var9 - var10) - (field1731[var6] - field1731[var7]) * (var11 - var10) > 0) {
                        field1729[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1468 && var10 <= Statics.field1468 && var11 <= Statics.field1468) {
                            field1728[var5] = false;
                        } else {
                            field1728[var5] = true;
                        }
                        int var31 = (field1732[var6] + field1732[var7] + field1732[var8]) / 3 + this.field1726;
                        field1738[var31][field1734[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1710 == null) {
            for (int var32 = this.field1725 - 1; var32 >= 0; var32--) {
                int var33 = field1734[var32];
                if (var33 > 0) {
                    int[] var34 = field1738[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method1970(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1718[var36] = 0;
            field1736[var36] = 0;
        }
        for (int var37 = this.field1725 - 1; var37 >= 0; var37--) {
            int var38 = field1734[var37];
            if (var38 > 0) {
                int[] var39 = field1738[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1710[var41];
                    int var43 = field1718[var42]++;
                    field1740[var42][var43] = var41;
                    if (var42 < 10) {
                        field1736[var42] += var37;
                    } else if (var42 == 10) {
                        field1712[var43] = var37;
                    } else {
                        field1742[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1718[1] > 0 || field1718[2] > 0) {
            var44 = (field1736[1] + field1736[2]) / (field1718[1] + field1718[2]);
        }
        int var45 = 0;
        if (field1718[3] > 0 || field1718[4] > 0) {
            var45 = (field1736[3] + field1736[4]) / (field1718[3] + field1718[4]);
        }
        int var46 = 0;
        if (field1718[6] > 0 || field1718[8] > 0) {
            var46 = (field1736[6] + field1736[8]) / (field1718[6] + field1718[8]);
        }
        int var47 = 0;
        int var48 = field1718[10];
        int[] var49 = field1740[10];
        int[] var50 = field1712;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1718[11];
            var49 = field1740[11];
            var50 = field1742;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method1970(var49[var47++]);
                if (var47 == var48 && field1740[11] != var49) {
                    var47 = 0;
                    var48 = field1718[11];
                    var49 = field1740[11];
                    var50 = field1742;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method1970(var49[var47++]);
                if (var47 == var48 && field1740[11] != var49) {
                    var47 = 0;
                    var48 = field1718[11];
                    var49 = field1740[11];
                    var50 = field1742;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method1970(var49[var47++]);
                if (var47 == var48 && field1740[11] != var49) {
                    var47 = 0;
                    var48 = field1718[11];
                    var49 = field1740[11];
                    var50 = field1742;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1718[var52];
            int[] var54 = field1740[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method1970(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method1970(var49[var47++]);
            if (var47 == var48 && field1740[11] != var49) {
                var47 = 0;
                var49 = field1740[11];
                var48 = field1718[11];
                var50 = field1742;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("ce.a(I)V")
    public final void method1970(int arg0) {
        if (field1729[arg0]) {
            this.method1958(arg0);
            return;
        }
        int var2 = this.field1704[arg0];
        int var3 = this.field1697[arg0];
        int var4 = this.field1706[arg0];
        class84.field1477 = field1728[arg0];
        if (this.field1750 == null) {
            class84.field1472 = 0;
        } else {
            class84.field1472 = this.field1750[arg0] & 0xFF;
        }
        if (this.field1713 != null && this.field1713[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1698 == null || this.field1698[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1698[arg0] & 0xFF;
                var6 = this.field1716[var5];
                var7 = this.field1717[var5];
                var8 = this.field1755[var5];
            }
            if (this.field1715[arg0] == -1) {
                class84.method1759(field1731[var2], field1731[var3], field1731[var4], field1730[var2], field1730[var3], field1730[var4], this.field1703[arg0], this.field1703[arg0], this.field1703[arg0], field1733[var6], field1733[var7], field1733[var8], field1705[var6], field1705[var7], field1705[var8], field1735[var6], field1735[var7], field1735[var8], this.field1713[arg0]);
            } else {
                class84.method1759(field1731[var2], field1731[var3], field1731[var4], field1730[var2], field1730[var3], field1730[var4], this.field1703[arg0], this.field1708[arg0], this.field1715[arg0], field1733[var6], field1733[var7], field1733[var8], field1705[var6], field1705[var7], field1705[var8], field1735[var6], field1735[var7], field1735[var8], this.field1713[arg0]);
            }
        } else if (this.field1715[arg0] == -1) {
            class84.method1757(field1731[var2], field1731[var3], field1731[var4], field1730[var2], field1730[var3], field1730[var4], field1757[this.field1703[arg0]]);
        } else {
            class84.method1811(field1731[var2], field1731[var3], field1731[var4], field1730[var2], field1730[var3], field1730[var4], this.field1703[arg0], this.field1708[arg0], this.field1715[arg0]);
        }
    }

    @ObfuscatedName("ce.p(I)V")
    public final void method1958(int arg0) {
        int var2 = Statics.field1478;
        int var3 = Statics.field1482;
        int var4 = 0;
        int var5 = this.field1704[arg0];
        int var6 = this.field1697[arg0];
        int var7 = this.field1706[arg0];
        int var8 = field1735[var5];
        int var9 = field1735[var6];
        int var10 = field1735[var7];
        if (this.field1750 == null) {
            class84.field1472 = 0;
        } else {
            class84.field1472 = this.field1750[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1760[var4] = field1730[var5];
            field1745[var4] = field1731[var5];
            field1707[var4++] = this.field1703[arg0];
        } else {
            int var11 = field1733[var5];
            int var12 = field1705[var5];
            int var13 = this.field1703[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1758[var10 - var8];
                field1760[var4] = (((field1733[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1745[var4] = (((field1705[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1707[var4++] = ((this.field1715[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1758[var9 - var8];
                field1760[var4] = (((field1733[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1745[var4] = (((field1705[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1707[var4++] = ((this.field1708[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1760[var4] = field1730[var6];
            field1745[var4] = field1731[var6];
            field1707[var4++] = this.field1708[arg0];
        } else {
            int var16 = field1733[var6];
            int var17 = field1705[var6];
            int var18 = this.field1708[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1758[var8 - var9];
                field1760[var4] = (((field1733[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1745[var4] = (((field1705[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1707[var4++] = ((this.field1703[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1758[var10 - var9];
                field1760[var4] = (((field1733[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1745[var4] = (((field1705[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1707[var4++] = ((this.field1715[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1760[var4] = field1730[var7];
            field1745[var4] = field1731[var7];
            field1707[var4++] = this.field1715[arg0];
        } else {
            int var21 = field1733[var7];
            int var22 = field1705[var7];
            int var23 = this.field1715[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1758[var9 - var10];
                field1760[var4] = (((field1733[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1745[var4] = (((field1705[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1707[var4++] = ((this.field1708[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1758[var8 - var10];
                field1760[var4] = (((field1733[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1745[var4] = (((field1705[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1707[var4++] = ((this.field1703[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1760[0];
        int var27 = field1760[1];
        int var28 = field1760[2];
        int var29 = field1745[0];
        int var30 = field1745[1];
        int var31 = field1745[2];
        class84.field1477 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1468 || var27 > Statics.field1468 || var28 > Statics.field1468) {
                class84.field1477 = true;
            }
            if (this.field1713 != null && this.field1713[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1698 == null || this.field1698[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1698[arg0] & 0xFF;
                    var33 = this.field1716[var32];
                    var34 = this.field1717[var32];
                    var35 = this.field1755[var32];
                }
                if (this.field1715[arg0] == -1) {
                    class84.method1759(var29, var30, var31, var26, var27, var28, this.field1703[arg0], this.field1703[arg0], this.field1703[arg0], field1733[var33], field1733[var34], field1733[var35], field1705[var33], field1705[var34], field1705[var35], field1735[var33], field1735[var34], field1735[var35], this.field1713[arg0]);
                } else {
                    class84.method1759(var29, var30, var31, var26, var27, var28, field1707[0], field1707[1], field1707[2], field1733[var33], field1733[var34], field1733[var35], field1705[var33], field1705[var34], field1705[var35], field1735[var33], field1735[var34], field1735[var35], this.field1713[arg0]);
                }
            } else if (this.field1715[arg0] == -1) {
                class84.method1757(var29, var30, var31, var26, var27, var28, field1757[this.field1703[arg0]]);
            } else {
                class84.method1811(var29, var30, var31, var26, var27, var28, field1707[0], field1707[1], field1707[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1468 || var27 > Statics.field1468 || var28 > Statics.field1468 || field1760[3] < 0 || field1760[3] > Statics.field1468) {
            class84.field1477 = true;
        }
        if (this.field1713 != null && this.field1713[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1698 == null || this.field1698[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1698[arg0] & 0xFF;
                var37 = this.field1716[var36];
                var38 = this.field1717[var36];
                var39 = this.field1755[var36];
            }
            short var40 = this.field1713[arg0];
            if (this.field1715[arg0] == -1) {
                class84.method1759(var29, var30, var31, var26, var27, var28, this.field1703[arg0], this.field1703[arg0], this.field1703[arg0], field1733[var37], field1733[var38], field1733[var39], field1705[var37], field1705[var38], field1705[var39], field1735[var37], field1735[var38], field1735[var39], var40);
                class84.method1759(var29, var31, field1745[3], var26, var28, field1760[3], this.field1703[arg0], this.field1703[arg0], this.field1703[arg0], field1733[var37], field1733[var38], field1733[var39], field1705[var37], field1705[var38], field1705[var39], field1735[var37], field1735[var38], field1735[var39], var40);
            } else {
                class84.method1759(var29, var30, var31, var26, var27, var28, field1707[0], field1707[1], field1707[2], field1733[var37], field1733[var38], field1733[var39], field1705[var37], field1705[var38], field1705[var39], field1735[var37], field1735[var38], field1735[var39], var40);
                class84.method1759(var29, var31, field1745[3], var26, var28, field1760[3], field1707[0], field1707[2], field1707[3], field1733[var37], field1733[var38], field1733[var39], field1705[var37], field1705[var38], field1705[var39], field1735[var37], field1735[var38], field1735[var39], var40);
            }
        } else if (this.field1715[arg0] == -1) {
            int var41 = field1757[this.field1703[arg0]];
            class84.method1757(var29, var30, var31, var26, var27, var28, var41);
            class84.method1757(var29, var31, field1745[3], var26, var28, field1760[3], var41);
        } else {
            class84.method1811(var29, var30, var31, var26, var27, var28, field1707[0], field1707[1], field1707[2]);
            class84.method1811(var29, var31, field1745[3], var26, var28, field1760[3], field1707[0], field1707[2], field1707[3]);
        }
    }

    @ObfuscatedName("ce.s(IIIIIIII)Z")
    public final boolean method1972(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
