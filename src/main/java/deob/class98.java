package deob;

@ObfuscatedName("cc")
public class class98 extends class78 {

    @ObfuscatedName("cc.t")
    public static class98 field1735 = new class98();

    @ObfuscatedName("cc.s")
    public static byte[] field1685 = new byte[1];

    @ObfuscatedName("cc.f")
    public static class98 field1686 = new class98();

    @ObfuscatedName("cc.e")
    public static byte[] field1687 = new byte[1];

    @ObfuscatedName("cc.d")
    public int field1688 = 0;

    @ObfuscatedName("cc.n")
    public int[] field1747;

    @ObfuscatedName("cc.v")
    public int[] field1690;

    @ObfuscatedName("cc.z")
    public int[] field1749;

    @ObfuscatedName("cc.j")
    public int field1704 = 0;

    @ObfuscatedName("cc.u")
    public int[] field1693;

    @ObfuscatedName("cc.g")
    public int[] field1713;

    @ObfuscatedName("cc.a")
    public int[] field1695;

    @ObfuscatedName("cc.c")
    public int[] field1696;

    @ObfuscatedName("cc.w")
    public int[] field1697;

    @ObfuscatedName("cc.l")
    public int[] field1698;

    @ObfuscatedName("cc.q")
    public byte[] field1699;

    @ObfuscatedName("cc.x")
    public byte[] field1700;

    @ObfuscatedName("cc.p")
    public byte[] field1701;

    @ObfuscatedName("cc.y")
    public short[] field1689;

    @ObfuscatedName("cc.r")
    public byte field1703 = 0;

    @ObfuscatedName("cc.k")
    public int field1707 = 0;

    @ObfuscatedName("cc.b")
    public int[] field1705;

    @ObfuscatedName("cc.h")
    public int[] field1706;

    @ObfuscatedName("cc.i")
    public int[] field1748;

    @ObfuscatedName("cc.o")
    public int[][] field1715;

    @ObfuscatedName("cc.m")
    public int[][] field1691;

    @ObfuscatedName("cc.ak")
    public boolean field1710 = false;

    @ObfuscatedName("cc.aw")
    public int field1711;

    @ObfuscatedName("cc.af")
    public int field1712;

    @ObfuscatedName("cc.ab")
    public int field1719;

    @ObfuscatedName("cc.ao")
    public int field1714;

    @ObfuscatedName("cc.ah")
    public int field1694;

    @ObfuscatedName("cc.ax")
    public static boolean[] field1717 = new boolean[4096];

    @ObfuscatedName("cc.ar")
    public static boolean[] field1718 = new boolean[4096];

    @ObfuscatedName("cc.aq")
    public static int[] field1722 = new int[4096];

    @ObfuscatedName("cc.am")
    public static int[] field1720 = new int[4096];

    @ObfuscatedName("cc.az")
    public static int[] field1721 = new int[4096];

    @ObfuscatedName("cc.an")
    public static int[] field1734 = new int[4096];

    @ObfuscatedName("cc.at")
    public static int[] field1744 = new int[4096];

    @ObfuscatedName("cc.av")
    public static int[] field1724 = new int[4096];

    @ObfuscatedName("cc.ag")
    public static int[] field1726 = new int[1600];

    @ObfuscatedName("cc.au")
    public static int[][] field1727 = new int[1600][512];

    @ObfuscatedName("cc.aj")
    public static int[] field1728 = new int[12];

    @ObfuscatedName("cc.ay")
    public static int[][] field1729 = new int[12][2000];

    @ObfuscatedName("cc.ac")
    public static int[] field1730 = new int[2000];

    @ObfuscatedName("cc.al")
    public static int[] field1742 = new int[2000];

    @ObfuscatedName("cc.as")
    public static int[] field1732 = new int[12];

    @ObfuscatedName("cc.ai")
    public static int[] field1733 = new int[10];

    @ObfuscatedName("cc.ad")
    public static int[] field1708 = new int[10];

    @ObfuscatedName("cc.ap")
    public static int[] field1739 = new int[10];

    @ObfuscatedName("cc.ba")
    public static boolean field1731 = false;

    @ObfuscatedName("cc.bt")
    public static int field1740 = 0;

    @ObfuscatedName("cc.bo")
    public static int field1741 = 0;

    @ObfuscatedName("cc.br")
    public static int field1745 = 0;

    @ObfuscatedName("cc.be")
    public static int[] field1723 = new int[1000];

    @ObfuscatedName("cc.bp")
    public static int[] field1743 = class84.field1461;

    @ObfuscatedName("cc.bc")
    public static int[] field1702 = class84.field1471;

    @ObfuscatedName("cc.bn")
    public static int[] field1746 = class84.field1470;

    @ObfuscatedName("cc.bd")
    public static int[] field1684 = class84.field1472;

    public class98() {
    }

    public class98(class98[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1688 = 0;
        this.field1704 = 0;
        this.field1707 = 0;
        this.field1703 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class98 var8 = arg0[var7];
            if (var8 != null) {
                this.field1688 += var8.field1688;
                this.field1704 += var8.field1704;
                this.field1707 += var8.field1707;
                if (var8.field1699 == null) {
                    if (this.field1703 == -1) {
                        this.field1703 = var8.field1703;
                    }
                    if (this.field1703 != var8.field1703) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1700 != null;
                var5 |= var8.field1689 != null;
                var6 |= var8.field1701 != null;
            }
        }
        this.field1747 = new int[this.field1688];
        this.field1690 = new int[this.field1688];
        this.field1749 = new int[this.field1688];
        this.field1693 = new int[this.field1704];
        this.field1713 = new int[this.field1704];
        this.field1695 = new int[this.field1704];
        this.field1696 = new int[this.field1704];
        this.field1697 = new int[this.field1704];
        this.field1698 = new int[this.field1704];
        if (var3) {
            this.field1699 = new byte[this.field1704];
        }
        if (var4) {
            this.field1700 = new byte[this.field1704];
        }
        if (var5) {
            this.field1689 = new short[this.field1704];
        }
        if (var6) {
            this.field1701 = new byte[this.field1704];
        }
        if (this.field1707 > 0) {
            this.field1705 = new int[this.field1707];
            this.field1706 = new int[this.field1707];
            this.field1748 = new int[this.field1707];
        }
        this.field1688 = 0;
        this.field1704 = 0;
        this.field1707 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class98 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1704; var11++) {
                    this.field1693[this.field1704] = var10.field1693[var11] + this.field1688;
                    this.field1713[this.field1704] = var10.field1713[var11] + this.field1688;
                    this.field1695[this.field1704] = var10.field1695[var11] + this.field1688;
                    this.field1696[this.field1704] = var10.field1696[var11];
                    this.field1697[this.field1704] = var10.field1697[var11];
                    this.field1698[this.field1704] = var10.field1698[var11];
                    if (var3) {
                        if (var10.field1699 == null) {
                            this.field1699[this.field1704] = var10.field1703;
                        } else {
                            this.field1699[this.field1704] = var10.field1699[var11];
                        }
                    }
                    if (var4 && var10.field1700 != null) {
                        this.field1700[this.field1704] = var10.field1700[var11];
                    }
                    if (var5) {
                        if (var10.field1689 == null) {
                            this.field1689[this.field1704] = -1;
                        } else {
                            this.field1689[this.field1704] = var10.field1689[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1701 == null || var10.field1701[var11] == -1) {
                            this.field1701[this.field1704] = -1;
                        } else {
                            this.field1701[this.field1704] = (byte) (var10.field1701[var11] + this.field1707);
                        }
                    }
                    this.field1704++;
                }
                for (int var12 = 0; var12 < var10.field1707; var12++) {
                    this.field1705[this.field1707] = var10.field1705[var12] + this.field1688;
                    this.field1706[this.field1707] = var10.field1706[var12] + this.field1688;
                    this.field1748[this.field1707] = var10.field1748[var12] + this.field1688;
                    this.field1707++;
                }
                for (int var13 = 0; var13 < var10.field1688; var13++) {
                    this.field1747[this.field1688] = var10.field1747[var13];
                    this.field1690[this.field1688] = var10.field1690[var13];
                    this.field1749[this.field1688] = var10.field1749[var13];
                    this.field1688++;
                }
            }
        }
    }

    @ObfuscatedName("cc.t([[IIIIZI)Lcc;")
    public class98 method2022(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1949();
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
            var15.field1688 = this.field1688;
            var15.field1704 = this.field1704;
            var15.field1707 = this.field1707;
            var15.field1747 = this.field1747;
            var15.field1749 = this.field1749;
            var15.field1693 = this.field1693;
            var15.field1713 = this.field1713;
            var15.field1695 = this.field1695;
            var15.field1696 = this.field1696;
            var15.field1697 = this.field1697;
            var15.field1698 = this.field1698;
            var15.field1699 = this.field1699;
            var15.field1700 = this.field1700;
            var15.field1701 = this.field1701;
            var15.field1689 = this.field1689;
            var15.field1703 = this.field1703;
            var15.field1705 = this.field1705;
            var15.field1706 = this.field1706;
            var15.field1748 = this.field1748;
            var15.field1715 = this.field1715;
            var15.field1691 = this.field1691;
            var15.field1710 = this.field1710;
            var15.field1690 = new int[var15.field1688];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1688; var16++) {
                int var17 = this.field1747[var16] + arg1;
                int var18 = this.field1749[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1690[var16] = this.field1690[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1688; var26++) {
                int var27 = (-this.field1690[var26] << 16) / this.field1341;
                if (var27 < arg5) {
                    int var28 = this.field1747[var26] + arg1;
                    int var29 = this.field1749[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1690[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1690[var26];
                }
            }
        }
        var15.field1711 = 0;
        return var15;
    }

    @ObfuscatedName("cc.f(Z)Lcc;")
    public class98 method1975(boolean arg0) {
        if (!arg0 && field1685.length < this.field1704) {
            field1685 = new byte[this.field1704 + 100];
        }
        return this.method1946(arg0, field1735, field1685);
    }

    @ObfuscatedName("cc.e(Z)Lcc;")
    public class98 method1955(boolean arg0) {
        if (!arg0 && field1687.length < this.field1704) {
            field1687 = new byte[this.field1704 + 100];
        }
        return this.method1946(arg0, field1686, field1687);
    }

    @ObfuscatedName("cc.n(ZLcc;[B)Lcc;")
    public class98 method1946(boolean arg0, class98 arg1, byte[] arg2) {
        arg1.field1688 = this.field1688;
        arg1.field1704 = this.field1704;
        arg1.field1707 = this.field1707;
        if (arg1.field1747 == null || arg1.field1747.length < this.field1688) {
            arg1.field1747 = new int[this.field1688 + 100];
            arg1.field1690 = new int[this.field1688 + 100];
            arg1.field1749 = new int[this.field1688 + 100];
        }
        for (int var4 = 0; var4 < this.field1688; var4++) {
            arg1.field1747[var4] = this.field1747[var4];
            arg1.field1690[var4] = this.field1690[var4];
            arg1.field1749[var4] = this.field1749[var4];
        }
        if (arg0) {
            arg1.field1700 = this.field1700;
        } else {
            arg1.field1700 = arg2;
            if (this.field1700 == null) {
                for (int var5 = 0; var5 < this.field1704; var5++) {
                    arg1.field1700[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1704; var6++) {
                    arg1.field1700[var6] = this.field1700[var6];
                }
            }
        }
        arg1.field1693 = this.field1693;
        arg1.field1713 = this.field1713;
        arg1.field1695 = this.field1695;
        arg1.field1696 = this.field1696;
        arg1.field1697 = this.field1697;
        arg1.field1698 = this.field1698;
        arg1.field1699 = this.field1699;
        arg1.field1701 = this.field1701;
        arg1.field1689 = this.field1689;
        arg1.field1703 = this.field1703;
        arg1.field1705 = this.field1705;
        arg1.field1706 = this.field1706;
        arg1.field1748 = this.field1748;
        arg1.field1715 = this.field1715;
        arg1.field1691 = this.field1691;
        arg1.field1710 = this.field1710;
        arg1.field1711 = 0;
        return arg1;
    }

    @ObfuscatedName("cc.v()V")
    public void method1949() {
        if (this.field1711 == 1) {
            return;
        }
        this.field1711 = 1;
        this.field1341 = 0;
        this.field1712 = 0;
        this.field1719 = 0;
        for (int var1 = 0; var1 < this.field1688; var1++) {
            int var2 = this.field1747[var1];
            int var3 = this.field1690[var1];
            int var4 = this.field1749[var1];
            if (-var3 > this.field1341) {
                this.field1341 = -var3;
            }
            if (var3 > this.field1712) {
                this.field1712 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1719) {
                this.field1719 = var5;
            }
        }
        this.field1719 = (int) (Math.sqrt((double) this.field1719) + 0.99D);
        this.field1694 = (int) (Math.sqrt((double) (this.field1341 * this.field1341 + this.field1719 * this.field1719)) + 0.99D);
        this.field1714 = this.field1694 + (int) (Math.sqrt((double) (this.field1719 * this.field1719 + this.field1712 * this.field1712)) + 0.99D);
    }

    @ObfuscatedName("cc.z()V")
    public void method1947() {
        if (this.field1711 == 2) {
            return;
        }
        this.field1711 = 2;
        this.field1719 = 0;
        for (int var1 = 0; var1 < this.field1688; var1++) {
            int var2 = this.field1747[var1];
            int var3 = this.field1690[var1];
            int var4 = this.field1749[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1719) {
                this.field1719 = var5;
            }
        }
        this.field1719 = (int) (Math.sqrt((double) this.field1719) + 0.99D);
        this.field1694 = this.field1719;
        this.field1714 = this.field1719 + this.field1719;
    }

    @ObfuscatedName("cc.j()I")
    public int method1962() {
        this.method1949();
        return this.field1719;
    }

    @ObfuscatedName("cc.u(Lcf;I)V")
    public void method2003(class96 arg0, int arg1) {
        if (this.field1715 == null || arg1 == -1) {
            return;
        }
        class81 var3 = arg0.field1663[arg1];
        class95 var4 = var3.field1426;
        Statics.field1736 = 0;
        Statics.field1737 = 0;
        Statics.field1738 = 0;
        for (int var5 = 0; var5 < var3.field1425; var5++) {
            int var6 = var3.field1421[var5];
            this.method1972(var4.field1648[var6], var4.field1650[var6], var3.field1427[var5], var3.field1428[var5], var3.field1420[var5]);
        }
        this.field1711 = 0;
    }

    @ObfuscatedName("cc.g(Lcf;ILcf;I[I)V")
    public void method1950(class96 arg0, int arg1, class96 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2003(arg0, arg1);
            return;
        }
        class81 var6 = arg0.field1663[arg1];
        class81 var7 = arg2.field1663[arg3];
        class95 var8 = var6.field1426;
        Statics.field1736 = 0;
        Statics.field1737 = 0;
        Statics.field1738 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1425; var11++) {
            int var12 = var6.field1421[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1648[var12] == 0) {
                this.method1972(var8.field1648[var12], var8.field1650[var12], var6.field1427[var11], var6.field1428[var11], var6.field1420[var11]);
            }
        }
        Statics.field1736 = 0;
        Statics.field1737 = 0;
        Statics.field1738 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1425; var15++) {
            int var16 = var7.field1421[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1648[var16] == 0) {
                this.method1972(var8.field1648[var16], var8.field1650[var16], var7.field1427[var15], var7.field1428[var15], var7.field1420[var15]);
            }
        }
        this.field1711 = 0;
    }

    @ObfuscatedName("cc.a(I[IIII)V")
    public void method1972(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1736 = 0;
            Statics.field1737 = 0;
            Statics.field1738 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1715.length) {
                    int[] var10 = this.field1715[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1736 += this.field1747[var12];
                        Statics.field1737 += this.field1690[var12];
                        Statics.field1738 += this.field1749[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1736 = Statics.field1736 / var7 + arg2;
                Statics.field1737 = Statics.field1737 / var7 + arg3;
                Statics.field1738 = Statics.field1738 / var7 + arg4;
            } else {
                Statics.field1736 = arg2;
                Statics.field1737 = arg3;
                Statics.field1738 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1715.length) {
                    int[] var15 = this.field1715[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1747[var17] += arg2;
                        this.field1690[var17] += arg3;
                        this.field1749[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1715.length) {
                    int[] var20 = this.field1715[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1747[var22] -= Statics.field1736;
                        this.field1690[var22] -= Statics.field1737;
                        this.field1749[var22] -= Statics.field1738;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1743[var25];
                            int var27 = field1702[var25];
                            int var28 = this.field1747[var22] * var27 + this.field1690[var22] * var26 >> 16;
                            this.field1690[var22] = this.field1690[var22] * var27 - this.field1747[var22] * var26 >> 16;
                            this.field1747[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1743[var23];
                            int var30 = field1702[var23];
                            int var31 = this.field1690[var22] * var30 - this.field1749[var22] * var29 >> 16;
                            this.field1749[var22] = this.field1749[var22] * var30 + this.field1690[var22] * var29 >> 16;
                            this.field1690[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1743[var24];
                            int var33 = field1702[var24];
                            int var34 = this.field1749[var22] * var32 + this.field1747[var22] * var33 >> 16;
                            this.field1749[var22] = this.field1749[var22] * var33 - this.field1747[var22] * var32 >> 16;
                            this.field1747[var22] = var34;
                        }
                        this.field1747[var22] += Statics.field1736;
                        this.field1690[var22] += Statics.field1737;
                        this.field1749[var22] += Statics.field1738;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1715.length) {
                    int[] var37 = this.field1715[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1747[var39] -= Statics.field1736;
                        this.field1690[var39] -= Statics.field1737;
                        this.field1749[var39] -= Statics.field1738;
                        this.field1747[var39] = this.field1747[var39] * arg2 / 128;
                        this.field1690[var39] = this.field1690[var39] * arg3 / 128;
                        this.field1749[var39] = this.field1749[var39] * arg4 / 128;
                        this.field1747[var39] += Statics.field1736;
                        this.field1690[var39] += Statics.field1737;
                        this.field1749[var39] += Statics.field1738;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1691 != null && this.field1700 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1691.length) {
                    int[] var42 = this.field1691[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1700[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1700[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cc.c()V")
    public void method1967() {
        for (int var1 = 0; var1 < this.field1688; var1++) {
            int var2 = this.field1747[var1];
            this.field1747[var1] = this.field1749[var1];
            this.field1749[var1] = -var2;
        }
        this.field1711 = 0;
    }

    @ObfuscatedName("cc.w()V")
    public void method1953() {
        for (int var1 = 0; var1 < this.field1688; var1++) {
            this.field1747[var1] = -this.field1747[var1];
            this.field1749[var1] = -this.field1749[var1];
        }
        this.field1711 = 0;
    }

    @ObfuscatedName("cc.l()V")
    public void method1954() {
        for (int var1 = 0; var1 < this.field1688; var1++) {
            int var2 = this.field1749[var1];
            this.field1749[var1] = this.field1747[var1];
            this.field1747[var1] = -var2;
        }
        this.field1711 = 0;
    }

    @ObfuscatedName("cc.q(I)V")
    public void method1983(int arg0) {
        int var2 = field1743[arg0];
        int var3 = field1702[arg0];
        for (int var4 = 0; var4 < this.field1688; var4++) {
            int var5 = this.field1690[var4] * var3 - this.field1749[var4] * var2 >> 16;
            this.field1749[var4] = this.field1749[var4] * var3 + this.field1690[var4] * var2 >> 16;
            this.field1690[var4] = var5;
        }
        this.field1711 = 0;
    }

    @ObfuscatedName("cc.x(III)V")
    public void method1956(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1688; var4++) {
            this.field1747[var4] += arg0;
            this.field1690[var4] += arg1;
            this.field1749[var4] += arg2;
        }
        this.field1711 = 0;
    }

    @ObfuscatedName("cc.p(III)V")
    public void method1957(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1688; var4++) {
            this.field1747[var4] = this.field1747[var4] * arg0 / 128;
            this.field1690[var4] = this.field1690[var4] * arg1 / 128;
            this.field1749[var4] = this.field1749[var4] * arg2 / 128;
        }
        this.field1711 = 0;
    }

    @ObfuscatedName("cc.y(IIIIIII)V")
    public final void method1958(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1726[0] = -1;
        if (this.field1711 != 2 && this.field1711 != 1) {
            this.method1947();
        }
        int var8 = Statics.field1463;
        int var9 = Statics.field1464;
        int var10 = field1743[arg0];
        int var11 = field1702[arg0];
        int var12 = field1743[arg1];
        int var13 = field1702[arg1];
        int var14 = field1743[arg2];
        int var15 = field1702[arg2];
        int var16 = field1743[arg3];
        int var17 = field1702[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1688; var19++) {
            int var20 = this.field1747[var19];
            int var21 = this.field1690[var19];
            int var22 = this.field1749[var19];
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
            field1721[var19] = var30 - var18;
            field1722[var19] = (var26 << 9) / var30 + var8;
            field1720[var19] = (var29 << 9) / var30 + var9;
            if (this.field1707 > 0) {
                field1734[var19] = var26;
                field1744[var19] = var29;
                field1724[var19] = var30;
            }
        }
        try {
            this.method1960(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cc.r(IIIIIIII)V")
    public final void method1959(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1726[0] = -1;
        if (this.field1711 != 2 && this.field1711 != 1) {
            this.method1947();
        }
        int var9 = Statics.field1463;
        int var10 = Statics.field1464;
        int var11 = field1743[arg0];
        int var12 = field1702[arg0];
        int var13 = field1743[arg1];
        int var14 = field1702[arg1];
        int var15 = field1743[arg2];
        int var16 = field1702[arg2];
        int var17 = field1743[arg3];
        int var18 = field1702[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1688; var20++) {
            int var21 = this.field1747[var20];
            int var22 = this.field1690[var20];
            int var23 = this.field1749[var20];
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
            field1721[var20] = var31 - var19;
            field1722[var20] = (var27 << 9) / arg7 + var9;
            field1720[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1707 > 0) {
                field1734[var20] = var27;
                field1744[var20] = var30;
                field1724[var20] = var31;
            }
        }
        try {
            this.method1960(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cc.o(IIIIIIIII)V")
    public void method1575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1726[0] = -1;
        if (this.field1711 != 1) {
            this.method1949();
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
        if (var15 / var13 >= Statics.field1453) {
            return;
        }
        int var16 = this.field1719 + var14 << 9;
        if (var16 / var13 <= Statics.field1467) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1719 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1469) {
            return;
        }
        int var20 = (this.field1341 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1468) {
            return;
        }
        int var22 = (this.field1341 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1707 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1731) {
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
            int var32 = field1740 - Statics.field1463;
            int var33 = field1741 - Statics.field1464;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1710) {
                    field1723[field1745++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1463;
        int var35 = Statics.field1464;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1743[arg0];
            var37 = field1702[arg0];
        }
        for (int var38 = 0; var38 < this.field1688; var38++) {
            int var39 = this.field1747[var38];
            int var40 = this.field1690[var38];
            int var41 = this.field1749[var38];
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
            field1721[var38] = var50 - var11;
            if (var50 >= 50) {
                field1722[var38] = (var46 << 9) / var50 + var34;
                field1720[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1722[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1734[var38] = var46;
                field1744[var38] = var49;
                field1724[var38] = var50;
            }
        }
        try {
            this.method1960(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cc.k(ZZI)V")
    public final void method1960(boolean arg0, boolean arg1, int arg2) {
        if (this.field1714 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1714; var4++) {
            field1726[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1704; var5++) {
            if (this.field1698[var5] != -2) {
                int var6 = this.field1693[var5];
                int var7 = this.field1713[var5];
                int var8 = this.field1695[var5];
                int var9 = field1722[var6];
                int var10 = field1722[var7];
                int var11 = field1722[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1734[var6];
                    int var13 = field1734[var7];
                    int var14 = field1734[var8];
                    int var15 = field1744[var6];
                    int var16 = field1744[var7];
                    int var17 = field1744[var8];
                    int var18 = field1724[var6];
                    int var19 = field1724[var7];
                    int var20 = field1724[var8];
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
                        field1718[var5] = true;
                        int var30 = (field1721[var6] + field1721[var7] + field1721[var8]) / 3 + this.field1694;
                        field1727[var30][field1726[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method1963(field1740, field1741, field1720[var6], field1720[var7], field1720[var8], var9, var10, var11)) {
                        field1723[field1745++] = arg2;
                        arg1 = false;
                    }
                    if ((field1720[var8] - field1720[var7]) * (var9 - var10) - (field1720[var6] - field1720[var7]) * (var11 - var10) > 0) {
                        field1718[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1465 && var10 <= Statics.field1465 && var11 <= Statics.field1465) {
                            field1717[var5] = false;
                        } else {
                            field1717[var5] = true;
                        }
                        int var31 = (field1721[var6] + field1721[var7] + field1721[var8]) / 3 + this.field1694;
                        field1727[var31][field1726[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1699 == null) {
            for (int var32 = this.field1714 - 1; var32 >= 0; var32--) {
                int var33 = field1726[var32];
                if (var33 > 0) {
                    int[] var34 = field1727[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method1961(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1728[var36] = 0;
            field1732[var36] = 0;
        }
        for (int var37 = this.field1714 - 1; var37 >= 0; var37--) {
            int var38 = field1726[var37];
            if (var38 > 0) {
                int[] var39 = field1727[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1699[var41];
                    int var43 = field1728[var42]++;
                    field1729[var42][var43] = var41;
                    if (var42 < 10) {
                        field1732[var42] += var37;
                    } else if (var42 == 10) {
                        field1730[var43] = var37;
                    } else {
                        field1742[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1728[1] > 0 || field1728[2] > 0) {
            var44 = (field1732[1] + field1732[2]) / (field1728[1] + field1728[2]);
        }
        int var45 = 0;
        if (field1728[3] > 0 || field1728[4] > 0) {
            var45 = (field1732[3] + field1732[4]) / (field1728[3] + field1728[4]);
        }
        int var46 = 0;
        if (field1728[6] > 0 || field1728[8] > 0) {
            var46 = (field1732[6] + field1732[8]) / (field1728[6] + field1728[8]);
        }
        int var47 = 0;
        int var48 = field1728[10];
        int[] var49 = field1729[10];
        int[] var50 = field1730;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1728[11];
            var49 = field1729[11];
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
                this.method1961(var49[var47++]);
                if (var47 == var48 && field1729[11] != var49) {
                    var47 = 0;
                    var48 = field1728[11];
                    var49 = field1729[11];
                    var50 = field1742;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method1961(var49[var47++]);
                if (var47 == var48 && field1729[11] != var49) {
                    var47 = 0;
                    var48 = field1728[11];
                    var49 = field1729[11];
                    var50 = field1742;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method1961(var49[var47++]);
                if (var47 == var48 && field1729[11] != var49) {
                    var47 = 0;
                    var48 = field1728[11];
                    var49 = field1729[11];
                    var50 = field1742;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1728[var52];
            int[] var54 = field1729[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method1961(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method1961(var49[var47++]);
            if (var47 == var48 && field1729[11] != var49) {
                var47 = 0;
                var49 = field1729[11];
                var48 = field1728[11];
                var50 = field1742;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cc.b(I)V")
    public final void method1961(int arg0) {
        if (field1718[arg0]) {
            this.method1980(arg0);
            return;
        }
        int var2 = this.field1693[arg0];
        int var3 = this.field1713[arg0];
        int var4 = this.field1695[arg0];
        class84.field1475 = field1717[arg0];
        if (this.field1700 == null) {
            class84.field1457 = 0;
        } else {
            class84.field1457 = this.field1700[arg0] & 0xFF;
        }
        if (this.field1689 != null && this.field1689[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1701 == null || this.field1701[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1701[arg0] & 0xFF;
                var6 = this.field1705[var5];
                var7 = this.field1706[var5];
                var8 = this.field1748[var5];
            }
            if (this.field1698[arg0] == -1) {
                class84.method1775(field1720[var2], field1720[var3], field1720[var4], field1722[var2], field1722[var3], field1722[var4], this.field1696[arg0], this.field1696[arg0], this.field1696[arg0], field1734[var6], field1734[var7], field1734[var8], field1744[var6], field1744[var7], field1744[var8], field1724[var6], field1724[var7], field1724[var8], this.field1689[arg0]);
            } else {
                class84.method1775(field1720[var2], field1720[var3], field1720[var4], field1722[var2], field1722[var3], field1722[var4], this.field1696[arg0], this.field1697[arg0], this.field1698[arg0], field1734[var6], field1734[var7], field1734[var8], field1744[var6], field1744[var7], field1744[var8], field1724[var6], field1724[var7], field1724[var8], this.field1689[arg0]);
            }
        } else if (this.field1698[arg0] == -1) {
            class84.method1762(field1720[var2], field1720[var3], field1720[var4], field1722[var2], field1722[var3], field1722[var4], field1746[this.field1696[arg0]]);
        } else {
            class84.method1769(field1720[var2], field1720[var3], field1720[var4], field1722[var2], field1722[var3], field1722[var4], this.field1696[arg0], this.field1697[arg0], this.field1698[arg0]);
        }
    }

    @ObfuscatedName("cc.h(I)V")
    public final void method1980(int arg0) {
        int var2 = Statics.field1463;
        int var3 = Statics.field1464;
        int var4 = 0;
        int var5 = this.field1693[arg0];
        int var6 = this.field1713[arg0];
        int var7 = this.field1695[arg0];
        int var8 = field1724[var5];
        int var9 = field1724[var6];
        int var10 = field1724[var7];
        if (this.field1700 == null) {
            class84.field1457 = 0;
        } else {
            class84.field1457 = this.field1700[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1733[var4] = field1722[var5];
            field1708[var4] = field1720[var5];
            field1739[var4++] = this.field1696[arg0];
        } else {
            int var11 = field1734[var5];
            int var12 = field1744[var5];
            int var13 = this.field1696[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1684[var10 - var8];
                field1733[var4] = (((field1734[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1708[var4] = (((field1744[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1739[var4++] = ((this.field1698[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1684[var9 - var8];
                field1733[var4] = (((field1734[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1708[var4] = (((field1744[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1739[var4++] = ((this.field1697[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1733[var4] = field1722[var6];
            field1708[var4] = field1720[var6];
            field1739[var4++] = this.field1697[arg0];
        } else {
            int var16 = field1734[var6];
            int var17 = field1744[var6];
            int var18 = this.field1697[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1684[var8 - var9];
                field1733[var4] = (((field1734[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1708[var4] = (((field1744[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1739[var4++] = ((this.field1696[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1684[var10 - var9];
                field1733[var4] = (((field1734[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1708[var4] = (((field1744[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1739[var4++] = ((this.field1698[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1733[var4] = field1722[var7];
            field1708[var4] = field1720[var7];
            field1739[var4++] = this.field1698[arg0];
        } else {
            int var21 = field1734[var7];
            int var22 = field1744[var7];
            int var23 = this.field1698[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1684[var9 - var10];
                field1733[var4] = (((field1734[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1708[var4] = (((field1744[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1739[var4++] = ((this.field1697[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1684[var8 - var10];
                field1733[var4] = (((field1734[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1708[var4] = (((field1744[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1739[var4++] = ((this.field1696[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1733[0];
        int var27 = field1733[1];
        int var28 = field1733[2];
        int var29 = field1708[0];
        int var30 = field1708[1];
        int var31 = field1708[2];
        class84.field1475 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1465 || var27 > Statics.field1465 || var28 > Statics.field1465) {
                class84.field1475 = true;
            }
            if (this.field1689 != null && this.field1689[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1701 == null || this.field1701[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1701[arg0] & 0xFF;
                    var33 = this.field1705[var32];
                    var34 = this.field1706[var32];
                    var35 = this.field1748[var32];
                }
                if (this.field1698[arg0] == -1) {
                    class84.method1775(var29, var30, var31, var26, var27, var28, this.field1696[arg0], this.field1696[arg0], this.field1696[arg0], field1734[var33], field1734[var34], field1734[var35], field1744[var33], field1744[var34], field1744[var35], field1724[var33], field1724[var34], field1724[var35], this.field1689[arg0]);
                } else {
                    class84.method1775(var29, var30, var31, var26, var27, var28, field1739[0], field1739[1], field1739[2], field1734[var33], field1734[var34], field1734[var35], field1744[var33], field1744[var34], field1744[var35], field1724[var33], field1724[var34], field1724[var35], this.field1689[arg0]);
                }
            } else if (this.field1698[arg0] == -1) {
                class84.method1762(var29, var30, var31, var26, var27, var28, field1746[this.field1696[arg0]]);
            } else {
                class84.method1769(var29, var30, var31, var26, var27, var28, field1739[0], field1739[1], field1739[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1465 || var27 > Statics.field1465 || var28 > Statics.field1465 || field1733[3] < 0 || field1733[3] > Statics.field1465) {
            class84.field1475 = true;
        }
        if (this.field1689 != null && this.field1689[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1701 == null || this.field1701[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1701[arg0] & 0xFF;
                var37 = this.field1705[var36];
                var38 = this.field1706[var36];
                var39 = this.field1748[var36];
            }
            short var40 = this.field1689[arg0];
            if (this.field1698[arg0] == -1) {
                class84.method1775(var29, var30, var31, var26, var27, var28, this.field1696[arg0], this.field1696[arg0], this.field1696[arg0], field1734[var37], field1734[var38], field1734[var39], field1744[var37], field1744[var38], field1744[var39], field1724[var37], field1724[var38], field1724[var39], var40);
                class84.method1775(var29, var31, field1708[3], var26, var28, field1733[3], this.field1696[arg0], this.field1696[arg0], this.field1696[arg0], field1734[var37], field1734[var38], field1734[var39], field1744[var37], field1744[var38], field1744[var39], field1724[var37], field1724[var38], field1724[var39], var40);
            } else {
                class84.method1775(var29, var30, var31, var26, var27, var28, field1739[0], field1739[1], field1739[2], field1734[var37], field1734[var38], field1734[var39], field1744[var37], field1744[var38], field1744[var39], field1724[var37], field1724[var38], field1724[var39], var40);
                class84.method1775(var29, var31, field1708[3], var26, var28, field1733[3], field1739[0], field1739[2], field1739[3], field1734[var37], field1734[var38], field1734[var39], field1744[var37], field1744[var38], field1744[var39], field1724[var37], field1724[var38], field1724[var39], var40);
            }
        } else if (this.field1698[arg0] == -1) {
            int var41 = field1746[this.field1696[arg0]];
            class84.method1762(var29, var30, var31, var26, var27, var28, var41);
            class84.method1762(var29, var31, field1708[3], var26, var28, field1733[3], var41);
        } else {
            class84.method1769(var29, var30, var31, var26, var27, var28, field1739[0], field1739[1], field1739[2]);
            class84.method1769(var29, var31, field1708[3], var26, var28, field1733[3], field1739[0], field1739[2], field1739[3]);
        }
    }

    @ObfuscatedName("cc.i(IIIIIIII)Z")
    public final boolean method1963(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
