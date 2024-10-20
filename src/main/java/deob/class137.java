package deob;

@ObfuscatedName("ef")
public class class137 extends class145 {

    @ObfuscatedName("ef.n")
    public static class137 field1705 = new class137();

    @ObfuscatedName("ef.v")
    public static byte[] field1685 = new byte[1];

    @ObfuscatedName("ef.d")
    public static class137 field1718 = new class137();

    @ObfuscatedName("ef.c")
    public static byte[] field1687 = new byte[1];

    @ObfuscatedName("ef.y")
    public int field1688 = 0;

    @ObfuscatedName("ef.h")
    public int[] field1689;

    @ObfuscatedName("ef.z")
    public int[] field1690;

    @ObfuscatedName("ef.e")
    public int[] field1691;

    @ObfuscatedName("ef.q")
    public int field1724 = 0;

    @ObfuscatedName("ef.l")
    public int[] field1721;

    @ObfuscatedName("ef.s")
    public int[] field1747;

    @ObfuscatedName("ef.b")
    public int[] field1752;

    @ObfuscatedName("ef.a")
    public int[] field1696;

    @ObfuscatedName("ef.w")
    public int[] field1738;

    @ObfuscatedName("ef.k")
    public int[] field1717;

    @ObfuscatedName("ef.i")
    public byte[] field1699;

    @ObfuscatedName("ef.x")
    public byte[] field1700;

    @ObfuscatedName("ef.f")
    public byte[] field1701;

    @ObfuscatedName("ef.g")
    public short[] field1702;

    @ObfuscatedName("ef.u")
    public byte field1703 = 0;

    @ObfuscatedName("ef.t")
    public int field1693 = 0;

    @ObfuscatedName("ef.p")
    public int[] field1719;

    @ObfuscatedName("ef.m")
    public int[] field1706;

    @ObfuscatedName("ef.r")
    public int[] field1750;

    @ObfuscatedName("ef.o")
    public int[][] field1707;

    @ObfuscatedName("ef.j")
    public int[][] field1709;

    @ObfuscatedName("ef.ay")
    public boolean field1697 = false;

    @ObfuscatedName("ef.am")
    public int field1711;

    @ObfuscatedName("ef.ag")
    public int field1712;

    @ObfuscatedName("ef.ae")
    public int field1713;

    @ObfuscatedName("ef.ac")
    public int field1746;

    @ObfuscatedName("ef.aq")
    public int field1715;

    @ObfuscatedName("ef.at")
    public int field1716;

    @ObfuscatedName("ef.ak")
    public int field1695;

    @ObfuscatedName("ef.ax")
    public int field1734;

    @ObfuscatedName("ef.ar")
    public int field1730 = -1;

    @ObfuscatedName("ef.al")
    public int field1720 = -1;

    @ObfuscatedName("ef.aa")
    public int field1710 = -1;

    @ObfuscatedName("ef.aw")
    public static boolean[] field1723 = new boolean[4700];

    @ObfuscatedName("ef.az")
    public static boolean[] field1686 = new boolean[4700];

    @ObfuscatedName("ef.ah")
    public static int[] field1753 = new int[4700];

    @ObfuscatedName("ef.ap")
    public static int[] field1726 = new int[4700];

    @ObfuscatedName("ef.aj")
    public static int[] field1727 = new int[4700];

    @ObfuscatedName("ef.an")
    public static int[] field1728 = new int[4700];

    @ObfuscatedName("ef.ai")
    public static int[] field1729 = new int[4700];

    @ObfuscatedName("ef.ab")
    public static int[] field1743 = new int[4700];

    @ObfuscatedName("ef.ad")
    public static int[] field1732 = new int[1600];

    @ObfuscatedName("ef.af")
    public static int[][] field1733 = new int[1600][512];

    @ObfuscatedName("ef.av")
    public static int[] field1708 = new int[12];

    @ObfuscatedName("ef.ao")
    public static int[][] field1735 = new int[12][2000];

    @ObfuscatedName("ef.bj")
    public static int[] field1736 = new int[2000];

    @ObfuscatedName("ef.bn")
    public static int[] field1737 = new int[2000];

    @ObfuscatedName("ef.bi")
    public static int[] field1731 = new int[12];

    @ObfuscatedName("ef.bp")
    public static int[] field1739 = new int[10];

    @ObfuscatedName("ef.br")
    public static int[] field1740 = new int[10];

    @ObfuscatedName("ef.bq")
    public static int[] field1741 = new int[10];

    @ObfuscatedName("ef.bv")
    public static boolean field1745 = true;

    @ObfuscatedName("ef.bh")
    public static int[] field1748 = class140.field1800;

    @ObfuscatedName("ef.bz")
    public static int[] field1749 = class140.field1801;

    @ObfuscatedName("ef.bg")
    public static int[] field1698 = class140.field1796;

    @ObfuscatedName("ef.bm")
    public static int[] field1751 = class140.field1775;

    public class137() {
    }

    public class137(class137[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1688 = 0;
        this.field1724 = 0;
        this.field1693 = 0;
        this.field1703 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class137 var8 = arg0[var7];
            if (var8 != null) {
                this.field1688 += var8.field1688;
                this.field1724 += var8.field1724;
                this.field1693 += var8.field1693;
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
                var5 |= var8.field1702 != null;
                var6 |= var8.field1701 != null;
            }
        }
        this.field1689 = new int[this.field1688];
        this.field1690 = new int[this.field1688];
        this.field1691 = new int[this.field1688];
        this.field1721 = new int[this.field1724];
        this.field1747 = new int[this.field1724];
        this.field1752 = new int[this.field1724];
        this.field1696 = new int[this.field1724];
        this.field1738 = new int[this.field1724];
        this.field1717 = new int[this.field1724];
        if (var3) {
            this.field1699 = new byte[this.field1724];
        }
        if (var4) {
            this.field1700 = new byte[this.field1724];
        }
        if (var5) {
            this.field1702 = new short[this.field1724];
        }
        if (var6) {
            this.field1701 = new byte[this.field1724];
        }
        if (this.field1693 > 0) {
            this.field1719 = new int[this.field1693];
            this.field1706 = new int[this.field1693];
            this.field1750 = new int[this.field1693];
        }
        this.field1688 = 0;
        this.field1724 = 0;
        this.field1693 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class137 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1724; var11++) {
                    this.field1721[this.field1724] = var10.field1721[var11] + this.field1688;
                    this.field1747[this.field1724] = var10.field1747[var11] + this.field1688;
                    this.field1752[this.field1724] = var10.field1752[var11] + this.field1688;
                    this.field1696[this.field1724] = var10.field1696[var11];
                    this.field1738[this.field1724] = var10.field1738[var11];
                    this.field1717[this.field1724] = var10.field1717[var11];
                    if (var3) {
                        if (var10.field1699 == null) {
                            this.field1699[this.field1724] = var10.field1703;
                        } else {
                            this.field1699[this.field1724] = var10.field1699[var11];
                        }
                    }
                    if (var4 && var10.field1700 != null) {
                        this.field1700[this.field1724] = var10.field1700[var11];
                    }
                    if (var5) {
                        if (var10.field1702 == null) {
                            this.field1702[this.field1724] = -1;
                        } else {
                            this.field1702[this.field1724] = var10.field1702[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1701 == null || var10.field1701[var11] == -1) {
                            this.field1701[this.field1724] = -1;
                        } else {
                            this.field1701[this.field1724] = (byte) (var10.field1701[var11] + this.field1693);
                        }
                    }
                    this.field1724++;
                }
                for (int var12 = 0; var12 < var10.field1693; var12++) {
                    this.field1719[this.field1693] = var10.field1719[var12] + this.field1688;
                    this.field1706[this.field1693] = var10.field1706[var12] + this.field1688;
                    this.field1750[this.field1693] = var10.field1750[var12] + this.field1688;
                    this.field1693++;
                }
                for (int var13 = 0; var13 < var10.field1688; var13++) {
                    this.field1689[this.field1688] = var10.field1689[var13];
                    this.field1690[this.field1688] = var10.field1690[var13];
                    this.field1691[this.field1688] = var10.field1691[var13];
                    this.field1688++;
                }
            }
        }
    }

    @ObfuscatedName("ef.n([[IIIIZI)Lef;")
    public class137 method2870(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2793();
        int var7 = arg1 - this.field1713;
        int var8 = this.field1713 + arg1;
        int var9 = arg3 - this.field1713;
        int var10 = this.field1713 + arg3;
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
        class137 var15;
        if (arg4) {
            var15 = new class137();
            var15.field1688 = this.field1688;
            var15.field1724 = this.field1724;
            var15.field1693 = this.field1693;
            var15.field1689 = this.field1689;
            var15.field1691 = this.field1691;
            var15.field1721 = this.field1721;
            var15.field1747 = this.field1747;
            var15.field1752 = this.field1752;
            var15.field1696 = this.field1696;
            var15.field1738 = this.field1738;
            var15.field1717 = this.field1717;
            var15.field1699 = this.field1699;
            var15.field1700 = this.field1700;
            var15.field1701 = this.field1701;
            var15.field1702 = this.field1702;
            var15.field1703 = this.field1703;
            var15.field1719 = this.field1719;
            var15.field1706 = this.field1706;
            var15.field1750 = this.field1750;
            var15.field1707 = this.field1707;
            var15.field1709 = this.field1709;
            var15.field1697 = this.field1697;
            var15.field1690 = new int[var15.field1688];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1688; var16++) {
                int var17 = this.field1689[var16] + arg1;
                int var18 = this.field1691[var16] + arg3;
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
                int var27 = (-this.field1690[var26] << 16) / this.field1885;
                if (var27 < arg5) {
                    int var28 = this.field1689[var26] + arg1;
                    int var29 = this.field1691[var26] + arg3;
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
        var15.method2794();
        return var15;
    }

    @ObfuscatedName("ef.v(Z)Lef;")
    public class137 method2826(boolean arg0) {
        if (!arg0 && field1685.length < this.field1724) {
            field1685 = new byte[this.field1724 + 100];
        }
        return this.method2798(arg0, field1705, field1685);
    }

    @ObfuscatedName("ef.d(Z)Lef;")
    public class137 method2797(boolean arg0) {
        if (!arg0 && field1687.length < this.field1724) {
            field1687 = new byte[this.field1724 + 100];
        }
        return this.method2798(arg0, field1718, field1687);
    }

    @ObfuscatedName("ef.c(ZLef;[B)Lef;")
    public class137 method2798(boolean arg0, class137 arg1, byte[] arg2) {
        arg1.field1688 = this.field1688;
        arg1.field1724 = this.field1724;
        arg1.field1693 = this.field1693;
        if (arg1.field1689 == null || arg1.field1689.length < this.field1688) {
            arg1.field1689 = new int[this.field1688 + 100];
            arg1.field1690 = new int[this.field1688 + 100];
            arg1.field1691 = new int[this.field1688 + 100];
        }
        for (int var4 = 0; var4 < this.field1688; var4++) {
            arg1.field1689[var4] = this.field1689[var4];
            arg1.field1690[var4] = this.field1690[var4];
            arg1.field1691[var4] = this.field1691[var4];
        }
        if (arg0) {
            arg1.field1700 = this.field1700;
        } else {
            arg1.field1700 = arg2;
            if (this.field1700 == null) {
                for (int var5 = 0; var5 < this.field1724; var5++) {
                    arg1.field1700[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1724; var6++) {
                    arg1.field1700[var6] = this.field1700[var6];
                }
            }
        }
        arg1.field1721 = this.field1721;
        arg1.field1747 = this.field1747;
        arg1.field1752 = this.field1752;
        arg1.field1696 = this.field1696;
        arg1.field1738 = this.field1738;
        arg1.field1717 = this.field1717;
        arg1.field1699 = this.field1699;
        arg1.field1701 = this.field1701;
        arg1.field1702 = this.field1702;
        arg1.field1703 = this.field1703;
        arg1.field1719 = this.field1719;
        arg1.field1706 = this.field1706;
        arg1.field1750 = this.field1750;
        arg1.field1707 = this.field1707;
        arg1.field1709 = this.field1709;
        arg1.field1697 = this.field1697;
        arg1.method2794();
        return arg1;
    }

    @ObfuscatedName("ef.y(I)V")
    public void method2859(int arg0) {
        if (this.field1730 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1749[arg0];
        int var9 = field1748[arg0];
        for (int var10 = 0; var10 < this.field1688; var10++) {
            int var11 = class140.method2993(this.field1689[var10], this.field1691[var10], var8, var9);
            int var12 = this.field1690[var10];
            int var13 = class140.method2945(this.field1689[var10], this.field1691[var10], var8, var9);
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
        }
        this.field1716 = (var2 + var5) / 2;
        this.field1695 = (var3 + var6) / 2;
        this.field1734 = (var4 + var7) / 2;
        this.field1730 = (var5 - var2 + 1) / 2;
        this.field1720 = (var6 - var3 + 1) / 2;
        this.field1710 = (var7 - var4 + 1) / 2;
        if (this.field1730 < 32) {
            this.field1730 = 32;
        }
        if (this.field1710 < 32) {
            this.field1710 = 32;
        }
        if (this.field1697) {
            this.field1730 += 8;
            this.field1710 += 8;
        }
    }

    @ObfuscatedName("ef.h()V")
    public void method2793() {
        if (this.field1711 == 1) {
            return;
        }
        this.field1711 = 1;
        this.field1885 = 0;
        this.field1712 = 0;
        this.field1713 = 0;
        for (int var1 = 0; var1 < this.field1688; var1++) {
            int var2 = this.field1689[var1];
            int var3 = this.field1690[var1];
            int var4 = this.field1691[var1];
            if (-var3 > this.field1885) {
                this.field1885 = -var3;
            }
            if (var3 > this.field1712) {
                this.field1712 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1713) {
                this.field1713 = var5;
            }
        }
        this.field1713 = (int) (Math.sqrt((double) this.field1713) + 0.99D);
        this.field1715 = (int) (Math.sqrt((double) (this.field1885 * this.field1885 + this.field1713 * this.field1713)) + 0.99D);
        this.field1746 = this.field1715 + (int) (Math.sqrt((double) (this.field1713 * this.field1713 + this.field1712 * this.field1712)) + 0.99D);
    }

    @ObfuscatedName("ef.z()V")
    public void method2848() {
        if (this.field1711 == 2) {
            return;
        }
        this.field1711 = 2;
        this.field1713 = 0;
        for (int var1 = 0; var1 < this.field1688; var1++) {
            int var2 = this.field1689[var1];
            int var3 = this.field1690[var1];
            int var4 = this.field1691[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1713) {
                this.field1713 = var5;
            }
        }
        this.field1713 = (int) (Math.sqrt((double) this.field1713) + 0.99D);
        this.field1715 = this.field1713;
        this.field1746 = this.field1713 + this.field1713;
    }

    @ObfuscatedName("ef.e()I")
    public int method2839() {
        this.method2793();
        return this.field1713;
    }

    @ObfuscatedName("ef.l()V")
    public void method2794() {
        this.field1711 = 0;
        this.field1730 = -1;
    }

    @ObfuscatedName("ef.s(Lel;I)V")
    public void method2804(class148 arg0, int arg1) {
        if (this.field1707 == null || arg1 == -1) {
            return;
        }
        class135 var3 = arg0.field1907[arg1];
        class142 var4 = var3.field1654;
        Statics.field1742 = 0;
        Statics.field1684 = 0;
        Statics.field1744 = 0;
        for (int var5 = 0; var5 < var3.field1658; var5++) {
            int var6 = var3.field1660[var5];
            this.method2852(var4.field1811[var6], var4.field1812[var6], var3.field1657[var5], var3.field1650[var5], var3.field1659[var5]);
        }
        this.method2794();
    }

    @ObfuscatedName("ef.b(Lel;ILel;I[I)V")
    public void method2805(class148 arg0, int arg1, class148 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2804(arg0, arg1);
            return;
        }
        class135 var6 = arg0.field1907[arg1];
        class135 var7 = arg2.field1907[arg3];
        class142 var8 = var6.field1654;
        Statics.field1742 = 0;
        Statics.field1684 = 0;
        Statics.field1744 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1658; var11++) {
            int var12 = var6.field1660[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1811[var12] == 0) {
                this.method2852(var8.field1811[var12], var8.field1812[var12], var6.field1657[var11], var6.field1650[var11], var6.field1659[var11]);
            }
        }
        Statics.field1742 = 0;
        Statics.field1684 = 0;
        Statics.field1744 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1658; var15++) {
            int var16 = var7.field1660[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1811[var16] == 0) {
                this.method2852(var8.field1811[var16], var8.field1812[var16], var7.field1657[var15], var7.field1650[var15], var7.field1659[var15]);
            }
        }
        this.method2794();
    }

    @ObfuscatedName("ef.a(I[IIII)V")
    public void method2852(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1742 = 0;
            Statics.field1684 = 0;
            Statics.field1744 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1707.length) {
                    int[] var10 = this.field1707[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1742 += this.field1689[var12];
                        Statics.field1684 += this.field1690[var12];
                        Statics.field1744 += this.field1691[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1742 = Statics.field1742 / var7 + arg2;
                Statics.field1684 = Statics.field1684 / var7 + arg3;
                Statics.field1744 = Statics.field1744 / var7 + arg4;
            } else {
                Statics.field1742 = arg2;
                Statics.field1684 = arg3;
                Statics.field1744 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1707.length) {
                    int[] var15 = this.field1707[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1689[var17] += arg2;
                        this.field1690[var17] += arg3;
                        this.field1691[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1707.length) {
                    int[] var20 = this.field1707[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1689[var22] -= Statics.field1742;
                        this.field1690[var22] -= Statics.field1684;
                        this.field1691[var22] -= Statics.field1744;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1748[var25];
                            int var27 = field1749[var25];
                            int var28 = this.field1690[var22] * var26 + this.field1689[var22] * var27 >> 16;
                            this.field1690[var22] = this.field1690[var22] * var27 - this.field1689[var22] * var26 >> 16;
                            this.field1689[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1748[var23];
                            int var30 = field1749[var23];
                            int var31 = this.field1690[var22] * var30 - this.field1691[var22] * var29 >> 16;
                            this.field1691[var22] = this.field1691[var22] * var30 + this.field1690[var22] * var29 >> 16;
                            this.field1690[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1748[var24];
                            int var33 = field1749[var24];
                            int var34 = this.field1691[var22] * var32 + this.field1689[var22] * var33 >> 16;
                            this.field1691[var22] = this.field1691[var22] * var33 - this.field1689[var22] * var32 >> 16;
                            this.field1689[var22] = var34;
                        }
                        this.field1689[var22] += Statics.field1742;
                        this.field1690[var22] += Statics.field1684;
                        this.field1691[var22] += Statics.field1744;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1707.length) {
                    int[] var37 = this.field1707[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1689[var39] -= Statics.field1742;
                        this.field1690[var39] -= Statics.field1684;
                        this.field1691[var39] -= Statics.field1744;
                        this.field1689[var39] = this.field1689[var39] * arg2 / 128;
                        this.field1690[var39] = this.field1690[var39] * arg3 / 128;
                        this.field1691[var39] = this.field1691[var39] * arg4 / 128;
                        this.field1689[var39] += Statics.field1742;
                        this.field1690[var39] += Statics.field1684;
                        this.field1691[var39] += Statics.field1744;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1709 != null && this.field1700 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1709.length) {
                    int[] var42 = this.field1709[var41];
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

    @ObfuscatedName("ef.w()V")
    public void method2806() {
        for (int var1 = 0; var1 < this.field1688; var1++) {
            int var2 = this.field1689[var1];
            this.field1689[var1] = this.field1691[var1];
            this.field1691[var1] = -var2;
        }
        this.method2794();
    }

    @ObfuscatedName("ef.k()V")
    public void method2862() {
        for (int var1 = 0; var1 < this.field1688; var1++) {
            this.field1689[var1] = -this.field1689[var1];
            this.field1691[var1] = -this.field1691[var1];
        }
        this.method2794();
    }

    @ObfuscatedName("ef.i()V")
    public void method2808() {
        for (int var1 = 0; var1 < this.field1688; var1++) {
            int var2 = this.field1691[var1];
            this.field1691[var1] = this.field1689[var1];
            this.field1689[var1] = -var2;
        }
        this.method2794();
    }

    @ObfuscatedName("ef.x(I)V")
    public void method2809(int arg0) {
        int var2 = field1748[arg0];
        int var3 = field1749[arg0];
        for (int var4 = 0; var4 < this.field1688; var4++) {
            int var5 = this.field1690[var4] * var3 - this.field1691[var4] * var2 >> 16;
            this.field1691[var4] = this.field1691[var4] * var3 + this.field1690[var4] * var2 >> 16;
            this.field1690[var4] = var5;
        }
        this.method2794();
    }

    @ObfuscatedName("ef.g(III)V")
    public void method2810(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1688; var4++) {
            this.field1689[var4] += arg0;
            this.field1690[var4] += arg1;
            this.field1691[var4] += arg2;
        }
        this.method2794();
    }

    @ObfuscatedName("ef.u(III)V")
    public void method2811(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1688; var4++) {
            this.field1689[var4] = this.field1689[var4] * arg0 / 128;
            this.field1690[var4] = this.field1690[var4] * arg1 / 128;
            this.field1691[var4] = this.field1691[var4] * arg2 / 128;
        }
        this.method2794();
    }

    @ObfuscatedName("ef.t(IIIIIII)V")
    public final void method2866(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1732[0] = -1;
        if (this.field1711 != 2 && this.field1711 != 1) {
            this.method2848();
        }
        int var8 = Statics.field1787;
        int var9 = Statics.field1788;
        int var10 = field1748[arg0];
        int var11 = field1749[arg0];
        int var12 = field1748[arg1];
        int var13 = field1749[arg1];
        int var14 = field1748[arg2];
        int var15 = field1749[arg2];
        int var16 = field1748[arg3];
        int var17 = field1749[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1688; var19++) {
            int var20 = this.field1689[var19];
            int var21 = this.field1690[var19];
            int var22 = this.field1691[var19];
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
            field1727[var19] = var30 - var18;
            field1753[var19] = class140.field1786 * var26 / var30 + var8;
            field1726[var19] = class140.field1786 * var29 / var30 + var9;
            if (this.field1693 > 0) {
                field1728[var19] = var26;
                field1729[var19] = var29;
                field1743[var19] = var30;
            }
        }
        try {
            this.method2815(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ef.p(IIIIIIII)V")
    public final void method2813(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1732[0] = -1;
        if (this.field1711 != 2 && this.field1711 != 1) {
            this.method2848();
        }
        int var9 = Statics.field1787;
        int var10 = Statics.field1788;
        int var11 = field1748[arg0];
        int var12 = field1749[arg0];
        int var13 = field1748[arg1];
        int var14 = field1749[arg1];
        int var15 = field1748[arg2];
        int var16 = field1749[arg2];
        int var17 = field1748[arg3];
        int var18 = field1749[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1688; var20++) {
            int var21 = this.field1689[var20];
            int var22 = this.field1690[var20];
            int var23 = this.field1691[var20];
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
            field1727[var20] = var31 - var19;
            field1753[var20] = class140.field1786 * var27 / arg7 + var9;
            field1726[var20] = class140.field1786 * var30 / arg7 + var10;
            if (this.field1693 > 0) {
                field1728[var20] = var27;
                field1729[var20] = var30;
                field1743[var20] = var31;
            }
        }
        try {
            this.method2815(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ef.cz(IIIIIIIIJ)V")
    public void method2814(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1732[0] = -1;
        if (this.field1711 != 1) {
            this.method2793();
        }
        this.method2859(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1713 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1713) * class140.field1786;
        if (var16 / var14 >= Statics.field1792) {
            return;
        }
        int var17 = (this.field1713 + var15) * class140.field1786;
        if (var17 / var14 <= Statics.field1791) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1713 * arg1 >> 16;
        int var20 = (var18 + var19) * class140.field1786;
        if (var20 / var14 <= Statics.field1794) {
            return;
        }
        int var21 = (this.field1885 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class140.field1786;
        if (var22 / var14 >= Statics.field1790) {
            return;
        }
        int var23 = (this.field1885 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1693 > 0;
        int var27 = class138.field1757;
        int var29 = class138.method3553();
        boolean var30 = class138.field1754;
        boolean var32 = class138.method2087(arg8);
        boolean var33 = false;
        if (var32 && var30) {
            boolean var34 = false;
            if (field1745) {
                var34 = class138.method435(this, arg5, arg6, arg7);
            } else {
                int var35 = var12 - var13;
                if (var35 <= 50) {
                    var35 = 50;
                }
                int var36;
                int var37;
                if (var15 > 0) {
                    var36 = var16 / var14;
                    var37 = var17 / var35;
                } else {
                    var37 = var17 / var14;
                    var36 = var16 / var35;
                }
                int var38;
                int var39;
                if (var18 > 0) {
                    var38 = var22 / var14;
                    var39 = var20 / var35;
                } else {
                    var39 = var20 / var14;
                    var38 = var22 / var35;
                }
                int var40 = var27 - Statics.field1787;
                int var41 = var29 - Statics.field1788;
                if (var40 > var36 && var40 < var37 && var41 > var38 && var41 < var39) {
                    var34 = true;
                }
            }
            if (var34) {
                if (this.field1697) {
                    class138.method106(arg8);
                } else {
                    var33 = true;
                }
            }
        }
        int var42 = Statics.field1787;
        int var43 = Statics.field1788;
        int var44 = 0;
        int var45 = 0;
        if (arg0 != 0) {
            var44 = field1748[arg0];
            var45 = field1749[arg0];
        }
        for (int var46 = 0; var46 < this.field1688; var46++) {
            int var47 = this.field1689[var46];
            int var48 = this.field1690[var46];
            int var49 = this.field1691[var46];
            if (arg0 != 0) {
                int var50 = var44 * var49 + var45 * var47 >> 16;
                var49 = var45 * var49 - var44 * var47 >> 16;
                var47 = var50;
            }
            int var51 = arg5 + var47;
            int var52 = arg6 + var48;
            int var53 = arg7 + var49;
            int var54 = arg3 * var53 + arg4 * var51 >> 16;
            int var55 = arg4 * var53 - arg3 * var51 >> 16;
            int var57 = arg2 * var52 - arg1 * var55 >> 16;
            int var58 = arg1 * var52 + arg2 * var55 >> 16;
            field1727[var46] = var58 - var12;
            if (var58 >= 50) {
                field1753[var46] = class140.field1786 * var54 / var58 + var42;
                field1726[var46] = class140.field1786 * var57 / var58 + var43;
            } else {
                field1753[var46] = -5000;
                var24 = true;
            }
            if (var26) {
                field1728[var46] = var54;
                field1729[var46] = var57;
                field1743[var46] = var58;
            }
        }
        try {
            this.method2815(var24, var33, this.field1697, arg8);
        } catch (Exception var61) {
        }
    }

    @ObfuscatedName("ef.o(ZZZJ)V")
    public final void method2815(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1746 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1746; var6++) {
            field1732[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1724; var8++) {
            if (this.field1717[var8] != -2) {
                int var9 = this.field1721[var8];
                int var10 = this.field1747[var8];
                int var11 = this.field1752[var8];
                int var12 = field1753[var9];
                int var13 = field1753[var10];
                int var14 = field1753[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field1728[var9];
                    int var16 = field1728[var10];
                    int var17 = field1728[var11];
                    int var18 = field1729[var9];
                    int var19 = field1729[var10];
                    int var20 = field1729[var11];
                    int var21 = field1743[var9];
                    int var22 = field1743[var10];
                    int var23 = field1743[var11];
                    int var24 = var15 - var16;
                    int var25 = var17 - var16;
                    int var26 = var18 - var19;
                    int var27 = var20 - var19;
                    int var28 = var21 - var22;
                    int var29 = var23 - var22;
                    int var30 = var26 * var29 - var27 * var28;
                    int var31 = var25 * var28 - var24 * var29;
                    int var32 = var24 * var27 - var25 * var26;
                    if (var22 * var32 + var16 * var30 + var19 * var31 > 0) {
                        field1686[var8] = true;
                        int var33 = (field1727[var9] + field1727[var10] + field1727[var11]) / 3 + this.field1715;
                        field1733[var33][field1732[var33]++] = var8;
                    }
                } else {
                    if (arg1 && class138.method3312(field1726[var9], field1726[var10], field1726[var11], var12, var13, var14, var7)) {
                        class138.method106(arg3);
                        arg1 = false;
                    }
                    if ((field1726[var11] - field1726[var10]) * (var12 - var13) - (field1726[var9] - field1726[var10]) * (var14 - var13) > 0) {
                        field1686[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1797 && var13 <= Statics.field1797 && var14 <= Statics.field1797) {
                            field1723[var8] = false;
                        } else {
                            field1723[var8] = true;
                        }
                        int var34 = (field1727[var9] + field1727[var10] + field1727[var11]) / 3 + this.field1715;
                        field1733[var34][field1732[var34]++] = var8;
                    }
                }
            }
        }
        if (this.field1699 == null) {
            for (int var35 = this.field1746 - 1; var35 >= 0; var35--) {
                int var36 = field1732[var35];
                if (var36 > 0) {
                    int[] var37 = field1733[var35];
                    for (int var38 = 0; var38 < var36; var38++) {
                        this.method2816(var37[var38]);
                    }
                }
            }
            return;
        }
        for (int var39 = 0; var39 < 12; var39++) {
            field1708[var39] = 0;
            field1731[var39] = 0;
        }
        for (int var40 = this.field1746 - 1; var40 >= 0; var40--) {
            int var41 = field1732[var40];
            if (var41 > 0) {
                int[] var42 = field1733[var40];
                for (int var43 = 0; var43 < var41; var43++) {
                    int var44 = var42[var43];
                    byte var45 = this.field1699[var44];
                    int var46 = field1708[var45]++;
                    field1735[var45][var46] = var44;
                    if (var45 < 10) {
                        field1731[var45] += var40;
                    } else if (var45 == 10) {
                        field1736[var46] = var40;
                    } else {
                        field1737[var46] = var40;
                    }
                }
            }
        }
        int var47 = 0;
        if (field1708[1] > 0 || field1708[2] > 0) {
            var47 = (field1731[1] + field1731[2]) / (field1708[1] + field1708[2]);
        }
        int var48 = 0;
        if (field1708[3] > 0 || field1708[4] > 0) {
            var48 = (field1731[3] + field1731[4]) / (field1708[3] + field1708[4]);
        }
        int var49 = 0;
        if (field1708[6] > 0 || field1708[8] > 0) {
            var49 = (field1731[6] + field1731[8]) / (field1708[6] + field1708[8]);
        }
        int var50 = 0;
        int var51 = field1708[10];
        int[] var52 = field1735[10];
        int[] var53 = field1736;
        if (var50 == var51) {
            var50 = 0;
            var51 = field1708[11];
            var52 = field1735[11];
            var53 = field1737;
        }
        int var54;
        if (var50 < var51) {
            var54 = var53[var50];
        } else {
            var54 = -1000;
        }
        for (int var55 = 0; var55 < 10; var55++) {
            while (var55 == 0 && var54 > var47) {
                this.method2816(var52[var50++]);
                if (var50 == var51 && field1735[11] != var52) {
                    var50 = 0;
                    var51 = field1708[11];
                    var52 = field1735[11];
                    var53 = field1737;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 3 && var54 > var48) {
                this.method2816(var52[var50++]);
                if (var50 == var51 && field1735[11] != var52) {
                    var50 = 0;
                    var51 = field1708[11];
                    var52 = field1735[11];
                    var53 = field1737;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 5 && var54 > var49) {
                this.method2816(var52[var50++]);
                if (var50 == var51 && field1735[11] != var52) {
                    var50 = 0;
                    var51 = field1708[11];
                    var52 = field1735[11];
                    var53 = field1737;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            int var56 = field1708[var55];
            int[] var57 = field1735[var55];
            for (int var58 = 0; var58 < var56; var58++) {
                this.method2816(var57[var58]);
            }
        }
        while (var54 != -1000) {
            this.method2816(var52[var50++]);
            if (var50 == var51 && field1735[11] != var52) {
                var50 = 0;
                var52 = field1735[11];
                var51 = field1708[11];
                var53 = field1737;
            }
            if (var50 < var51) {
                var54 = var53[var50];
            } else {
                var54 = -1000;
            }
        }
    }

    @ObfuscatedName("ef.ay(I)V")
    public final void method2816(int arg0) {
        if (field1686[arg0]) {
            this.method2817(arg0);
            return;
        }
        int var2 = this.field1721[arg0];
        int var3 = this.field1747[arg0];
        int var4 = this.field1752[arg0];
        class140.field1776 = field1723[arg0];
        if (this.field1700 == null) {
            class140.field1779 = 0;
        } else {
            class140.field1779 = this.field1700[arg0] & 0xFF;
        }
        if (this.field1702 != null && this.field1702[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1701 == null || this.field1701[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1701[arg0] & 0xFF;
                var6 = this.field1719[var5];
                var7 = this.field1706[var5];
                var8 = this.field1750[var5];
            }
            if (this.field1717[arg0] == -1) {
                class140.method2972(field1726[var2], field1726[var3], field1726[var4], field1753[var2], field1753[var3], field1753[var4], this.field1696[arg0], this.field1696[arg0], this.field1696[arg0], field1728[var6], field1728[var7], field1728[var8], field1729[var6], field1729[var7], field1729[var8], field1743[var6], field1743[var7], field1743[var8], this.field1702[arg0]);
            } else {
                class140.method2972(field1726[var2], field1726[var3], field1726[var4], field1753[var2], field1753[var3], field1753[var4], this.field1696[arg0], this.field1738[arg0], this.field1717[arg0], field1728[var6], field1728[var7], field1728[var8], field1729[var6], field1729[var7], field1729[var8], field1743[var6], field1743[var7], field1743[var8], this.field1702[arg0]);
            }
        } else if (this.field1717[arg0] == -1) {
            class140.method2939(field1726[var2], field1726[var3], field1726[var4], field1753[var2], field1753[var3], field1753[var4], field1698[this.field1696[arg0]]);
        } else {
            class140.method2935(field1726[var2], field1726[var3], field1726[var4], field1753[var2], field1753[var3], field1753[var4], this.field1696[arg0], this.field1738[arg0], this.field1717[arg0]);
        }
    }

    @ObfuscatedName("ef.am(I)V")
    public final void method2817(int arg0) {
        int var2 = Statics.field1787;
        int var3 = Statics.field1788;
        int var4 = 0;
        int var5 = this.field1721[arg0];
        int var6 = this.field1747[arg0];
        int var7 = this.field1752[arg0];
        int var8 = field1743[var5];
        int var9 = field1743[var6];
        int var10 = field1743[var7];
        if (this.field1700 == null) {
            class140.field1779 = 0;
        } else {
            class140.field1779 = this.field1700[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1739[var4] = field1753[var5];
            field1740[var4] = field1726[var5];
            field1741[var4++] = this.field1696[arg0];
        } else {
            int var11 = field1728[var5];
            int var12 = field1729[var5];
            int var13 = this.field1696[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1751[var10 - var8];
                field1739[var4] = (((field1728[var7] - var11) * var14 >> 16) + var11) * class140.field1786 / 50 + var2;
                field1740[var4] = (((field1729[var7] - var12) * var14 >> 16) + var12) * class140.field1786 / 50 + var3;
                field1741[var4++] = ((this.field1717[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1751[var9 - var8];
                field1739[var4] = (((field1728[var6] - var11) * var15 >> 16) + var11) * class140.field1786 / 50 + var2;
                field1740[var4] = (((field1729[var6] - var12) * var15 >> 16) + var12) * class140.field1786 / 50 + var3;
                field1741[var4++] = ((this.field1738[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1739[var4] = field1753[var6];
            field1740[var4] = field1726[var6];
            field1741[var4++] = this.field1738[arg0];
        } else {
            int var16 = field1728[var6];
            int var17 = field1729[var6];
            int var18 = this.field1738[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1751[var8 - var9];
                field1739[var4] = (((field1728[var5] - var16) * var19 >> 16) + var16) * class140.field1786 / 50 + var2;
                field1740[var4] = (((field1729[var5] - var17) * var19 >> 16) + var17) * class140.field1786 / 50 + var3;
                field1741[var4++] = ((this.field1696[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1751[var10 - var9];
                field1739[var4] = (((field1728[var7] - var16) * var20 >> 16) + var16) * class140.field1786 / 50 + var2;
                field1740[var4] = (((field1729[var7] - var17) * var20 >> 16) + var17) * class140.field1786 / 50 + var3;
                field1741[var4++] = ((this.field1717[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1739[var4] = field1753[var7];
            field1740[var4] = field1726[var7];
            field1741[var4++] = this.field1717[arg0];
        } else {
            int var21 = field1728[var7];
            int var22 = field1729[var7];
            int var23 = this.field1717[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1751[var9 - var10];
                field1739[var4] = (((field1728[var6] - var21) * var24 >> 16) + var21) * class140.field1786 / 50 + var2;
                field1740[var4] = (((field1729[var6] - var22) * var24 >> 16) + var22) * class140.field1786 / 50 + var3;
                field1741[var4++] = ((this.field1738[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1751[var8 - var10];
                field1739[var4] = (((field1728[var5] - var21) * var25 >> 16) + var21) * class140.field1786 / 50 + var2;
                field1740[var4] = (((field1729[var5] - var22) * var25 >> 16) + var22) * class140.field1786 / 50 + var3;
                field1741[var4++] = ((this.field1696[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1739[0];
        int var27 = field1739[1];
        int var28 = field1739[2];
        int var29 = field1740[0];
        int var30 = field1740[1];
        int var31 = field1740[2];
        class140.field1776 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1797 || var27 > Statics.field1797 || var28 > Statics.field1797) {
                class140.field1776 = true;
            }
            if (this.field1702 != null && this.field1702[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1701 == null || this.field1701[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1701[arg0] & 0xFF;
                    var33 = this.field1719[var32];
                    var34 = this.field1706[var32];
                    var35 = this.field1750[var32];
                }
                if (this.field1717[arg0] == -1) {
                    class140.method2972(var29, var30, var31, var26, var27, var28, this.field1696[arg0], this.field1696[arg0], this.field1696[arg0], field1728[var33], field1728[var34], field1728[var35], field1729[var33], field1729[var34], field1729[var35], field1743[var33], field1743[var34], field1743[var35], this.field1702[arg0]);
                } else {
                    class140.method2972(var29, var30, var31, var26, var27, var28, field1741[0], field1741[1], field1741[2], field1728[var33], field1728[var34], field1728[var35], field1729[var33], field1729[var34], field1729[var35], field1743[var33], field1743[var34], field1743[var35], this.field1702[arg0]);
                }
            } else if (this.field1717[arg0] == -1) {
                class140.method2939(var29, var30, var31, var26, var27, var28, field1698[this.field1696[arg0]]);
            } else {
                class140.method2935(var29, var30, var31, var26, var27, var28, field1741[0], field1741[1], field1741[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1797 || var27 > Statics.field1797 || var28 > Statics.field1797 || field1739[3] < 0 || field1739[3] > Statics.field1797) {
            class140.field1776 = true;
        }
        if (this.field1702 != null && this.field1702[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1701 == null || this.field1701[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1701[arg0] & 0xFF;
                var37 = this.field1719[var36];
                var38 = this.field1706[var36];
                var39 = this.field1750[var36];
            }
            short var40 = this.field1702[arg0];
            if (this.field1717[arg0] == -1) {
                class140.method2972(var29, var30, var31, var26, var27, var28, this.field1696[arg0], this.field1696[arg0], this.field1696[arg0], field1728[var37], field1728[var38], field1728[var39], field1729[var37], field1729[var38], field1729[var39], field1743[var37], field1743[var38], field1743[var39], var40);
                class140.method2972(var29, var31, field1740[3], var26, var28, field1739[3], this.field1696[arg0], this.field1696[arg0], this.field1696[arg0], field1728[var37], field1728[var38], field1728[var39], field1729[var37], field1729[var38], field1729[var39], field1743[var37], field1743[var38], field1743[var39], var40);
            } else {
                class140.method2972(var29, var30, var31, var26, var27, var28, field1741[0], field1741[1], field1741[2], field1728[var37], field1728[var38], field1728[var39], field1729[var37], field1729[var38], field1729[var39], field1743[var37], field1743[var38], field1743[var39], var40);
                class140.method2972(var29, var31, field1740[3], var26, var28, field1739[3], field1741[0], field1741[2], field1741[3], field1728[var37], field1728[var38], field1728[var39], field1729[var37], field1729[var38], field1729[var39], field1743[var37], field1743[var38], field1743[var39], var40);
            }
        } else if (this.field1717[arg0] == -1) {
            int var41 = field1698[this.field1696[arg0]];
            class140.method2939(var29, var30, var31, var26, var27, var28, var41);
            class140.method2939(var29, var31, field1740[3], var26, var28, field1739[3], var41);
        } else {
            class140.method2935(var29, var30, var31, var26, var27, var28, field1741[0], field1741[1], field1741[2]);
            class140.method2935(var29, var31, field1740[3], var26, var28, field1739[3], field1741[0], field1741[2], field1741[3]);
        }
    }
}
