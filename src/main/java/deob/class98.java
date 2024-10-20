package deob;

@ObfuscatedName("cg")
public class class98 extends class78 {

    @ObfuscatedName("cg.g")
    public static class98 field1747 = new class98();

    @ObfuscatedName("cg.s")
    public static byte[] field1709 = new byte[1];

    @ObfuscatedName("cg.v")
    public static class98 field1710 = new class98();

    @ObfuscatedName("cg.o")
    public static byte[] field1711 = new byte[1];

    @ObfuscatedName("cg.k")
    public int field1757 = 0;

    @ObfuscatedName("cg.m")
    public int[] field1713;

    @ObfuscatedName("cg.i")
    public int[] field1714;

    @ObfuscatedName("cg.t")
    public int[] field1770;

    @ObfuscatedName("cg.l")
    public int field1743 = 0;

    @ObfuscatedName("cg.p")
    public int[] field1716;

    @ObfuscatedName("cg.r")
    public int[] field1718;

    @ObfuscatedName("cg.j")
    public int[] field1719;

    @ObfuscatedName("cg.c")
    public int[] field1720;

    @ObfuscatedName("cg.q")
    public int[] field1721;

    @ObfuscatedName("cg.n")
    public int[] field1763;

    @ObfuscatedName("cg.h")
    public byte[] field1723;

    @ObfuscatedName("cg.d")
    public byte[] field1724;

    @ObfuscatedName("cg.b")
    public byte[] field1725;

    @ObfuscatedName("cg.w")
    public short[] field1765;

    @ObfuscatedName("cg.z")
    public byte field1727 = 0;

    @ObfuscatedName("cg.x")
    public int field1766 = 0;

    @ObfuscatedName("cg.e")
    public int[] field1729;

    @ObfuscatedName("cg.a")
    public int[] field1712;

    @ObfuscatedName("cg.y")
    public int[] field1731;

    @ObfuscatedName("cg.f")
    public int[][] field1752;

    @ObfuscatedName("cg.u")
    public int[][] field1733;

    @ObfuscatedName("cg.ab")
    public boolean field1734 = false;

    @ObfuscatedName("cg.ai")
    public int field1735;

    @ObfuscatedName("cg.aj")
    public int field1736;

    @ObfuscatedName("cg.as")
    public int field1737;

    @ObfuscatedName("cg.ax")
    public int field1738;

    @ObfuscatedName("cg.ac")
    public int field1739;

    @ObfuscatedName("cg.au")
    public static boolean[] field1771 = new boolean[4096];

    @ObfuscatedName("cg.av")
    public static boolean[] field1750 = new boolean[4096];

    @ObfuscatedName("cg.am")
    public static int[] field1715 = new int[4096];

    @ObfuscatedName("cg.ao")
    public static int[] field1744 = new int[4096];

    @ObfuscatedName("cg.aq")
    public static int[] field1761 = new int[4096];

    @ObfuscatedName("cg.ay")
    public static int[] field1746 = new int[4096];

    @ObfuscatedName("cg.an")
    public static int[] field1726 = new int[4096];

    @ObfuscatedName("cg.ak")
    public static int[] field1748 = new int[4096];

    @ObfuscatedName("cg.ad")
    public static int[] field1767 = new int[1600];

    @ObfuscatedName("cg.aw")
    public static int[][] field1751 = new int[1600][512];

    @ObfuscatedName("cg.ah")
    public static int[] field1774 = new int[12];

    @ObfuscatedName("cg.at")
    public static int[][] field1742 = new int[12][2000];

    @ObfuscatedName("cg.aa")
    public static int[] field1754 = new int[2000];

    @ObfuscatedName("cg.ar")
    public static int[] field1755 = new int[2000];

    @ObfuscatedName("cg.ap")
    public static int[] field1773 = new int[12];

    @ObfuscatedName("cg.ag")
    public static int[] field1732 = new int[10];

    @ObfuscatedName("cg.af")
    public static int[] field1758 = new int[10];

    @ObfuscatedName("cg.al")
    public static int[] field1759 = new int[10];

    @ObfuscatedName("cg.bk")
    public static boolean field1741 = false;

    @ObfuscatedName("cg.bn")
    public static int field1764 = 0;

    @ObfuscatedName("cg.bp")
    public static int field1745 = 0;

    @ObfuscatedName("cg.bx")
    public static int field1730 = 0;

    @ObfuscatedName("cg.bm")
    public static int[] field1756 = new int[1000];

    @ObfuscatedName("cg.ba")
    public static int[] field1768 = class84.field1490;

    @ObfuscatedName("cg.be")
    public static int[] field1769 = class84.field1491;

    @ObfuscatedName("cg.bl")
    public static int[] field1722 = class84.field1486;

    @ObfuscatedName("cg.bt")
    public static int[] field1753 = class84.field1489;

    public class98() {
    }

    public class98(class98[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1757 = 0;
        this.field1743 = 0;
        this.field1766 = 0;
        this.field1727 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class98 var8 = arg0[var7];
            if (var8 != null) {
                this.field1757 += var8.field1757;
                this.field1743 += var8.field1743;
                this.field1766 += var8.field1766;
                if (var8.field1723 == null) {
                    if (this.field1727 == -1) {
                        this.field1727 = var8.field1727;
                    }
                    if (this.field1727 != var8.field1727) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1724 != null;
                var5 |= var8.field1765 != null;
                var6 |= var8.field1725 != null;
            }
        }
        this.field1713 = new int[this.field1757];
        this.field1714 = new int[this.field1757];
        this.field1770 = new int[this.field1757];
        this.field1716 = new int[this.field1743];
        this.field1718 = new int[this.field1743];
        this.field1719 = new int[this.field1743];
        this.field1720 = new int[this.field1743];
        this.field1721 = new int[this.field1743];
        this.field1763 = new int[this.field1743];
        if (var3) {
            this.field1723 = new byte[this.field1743];
        }
        if (var4) {
            this.field1724 = new byte[this.field1743];
        }
        if (var5) {
            this.field1765 = new short[this.field1743];
        }
        if (var6) {
            this.field1725 = new byte[this.field1743];
        }
        if (this.field1766 > 0) {
            this.field1729 = new int[this.field1766];
            this.field1712 = new int[this.field1766];
            this.field1731 = new int[this.field1766];
        }
        this.field1757 = 0;
        this.field1743 = 0;
        this.field1766 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class98 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1743; var11++) {
                    this.field1716[this.field1743] = var10.field1716[var11] + this.field1757;
                    this.field1718[this.field1743] = var10.field1718[var11] + this.field1757;
                    this.field1719[this.field1743] = var10.field1719[var11] + this.field1757;
                    this.field1720[this.field1743] = var10.field1720[var11];
                    this.field1721[this.field1743] = var10.field1721[var11];
                    this.field1763[this.field1743] = var10.field1763[var11];
                    if (var3) {
                        if (var10.field1723 == null) {
                            this.field1723[this.field1743] = var10.field1727;
                        } else {
                            this.field1723[this.field1743] = var10.field1723[var11];
                        }
                    }
                    if (var4 && var10.field1724 != null) {
                        this.field1724[this.field1743] = var10.field1724[var11];
                    }
                    if (var5) {
                        if (var10.field1765 == null) {
                            this.field1765[this.field1743] = -1;
                        } else {
                            this.field1765[this.field1743] = var10.field1765[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1725 == null || var10.field1725[var11] == -1) {
                            this.field1725[this.field1743] = -1;
                        } else {
                            this.field1725[this.field1743] = (byte) (var10.field1725[var11] + this.field1766);
                        }
                    }
                    this.field1743++;
                }
                for (int var12 = 0; var12 < var10.field1766; var12++) {
                    this.field1729[this.field1766] = var10.field1729[var12] + this.field1757;
                    this.field1712[this.field1766] = var10.field1712[var12] + this.field1757;
                    this.field1731[this.field1766] = var10.field1731[var12] + this.field1757;
                    this.field1766++;
                }
                for (int var13 = 0; var13 < var10.field1757; var13++) {
                    this.field1713[this.field1757] = var10.field1713[var13];
                    this.field1714[this.field1757] = var10.field1714[var13];
                    this.field1770[this.field1757] = var10.field1770[var13];
                    this.field1757++;
                }
            }
        }
    }

    @ObfuscatedName("cg.g([[IIIIZI)Lcg;")
    public class98 method1968(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1950();
        int var7 = arg1 - this.field1737;
        int var8 = this.field1737 + arg1;
        int var9 = arg3 - this.field1737;
        int var10 = this.field1737 + arg3;
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
            var15.field1757 = this.field1757;
            var15.field1743 = this.field1743;
            var15.field1766 = this.field1766;
            var15.field1713 = this.field1713;
            var15.field1770 = this.field1770;
            var15.field1716 = this.field1716;
            var15.field1718 = this.field1718;
            var15.field1719 = this.field1719;
            var15.field1720 = this.field1720;
            var15.field1721 = this.field1721;
            var15.field1763 = this.field1763;
            var15.field1723 = this.field1723;
            var15.field1724 = this.field1724;
            var15.field1725 = this.field1725;
            var15.field1765 = this.field1765;
            var15.field1727 = this.field1727;
            var15.field1729 = this.field1729;
            var15.field1712 = this.field1712;
            var15.field1731 = this.field1731;
            var15.field1752 = this.field1752;
            var15.field1733 = this.field1733;
            var15.field1734 = this.field1734;
            var15.field1714 = new int[var15.field1757];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1757; var16++) {
                int var17 = this.field1713[var16] + arg1;
                int var18 = this.field1770[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1714[var16] = this.field1714[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1757; var26++) {
                int var27 = (-this.field1714[var26] << 16) / this.field1353;
                if (var27 < arg5) {
                    int var28 = this.field1713[var26] + arg1;
                    int var29 = this.field1770[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1714[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1714[var26];
                }
            }
        }
        var15.field1735 = 0;
        return var15;
    }

    @ObfuscatedName("cg.v(Z)Lcg;")
    public class98 method1947(boolean arg0) {
        if (!arg0 && field1709.length < this.field1743) {
            field1709 = new byte[this.field1743 + 100];
        }
        return this.method1949(arg0, field1747, field1709);
    }

    @ObfuscatedName("cg.o(Z)Lcg;")
    public class98 method1973(boolean arg0) {
        if (!arg0 && field1711.length < this.field1743) {
            field1711 = new byte[this.field1743 + 100];
        }
        return this.method1949(arg0, field1710, field1711);
    }

    @ObfuscatedName("cg.k(ZLcg;[B)Lcg;")
    public class98 method1949(boolean arg0, class98 arg1, byte[] arg2) {
        arg1.field1757 = this.field1757;
        arg1.field1743 = this.field1743;
        arg1.field1766 = this.field1766;
        if (arg1.field1713 == null || arg1.field1713.length < this.field1757) {
            arg1.field1713 = new int[this.field1757 + 100];
            arg1.field1714 = new int[this.field1757 + 100];
            arg1.field1770 = new int[this.field1757 + 100];
        }
        for (int var4 = 0; var4 < this.field1757; var4++) {
            arg1.field1713[var4] = this.field1713[var4];
            arg1.field1714[var4] = this.field1714[var4];
            arg1.field1770[var4] = this.field1770[var4];
        }
        if (arg0) {
            arg1.field1724 = this.field1724;
        } else {
            arg1.field1724 = arg2;
            if (this.field1724 == null) {
                for (int var5 = 0; var5 < this.field1743; var5++) {
                    arg1.field1724[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1743; var6++) {
                    arg1.field1724[var6] = this.field1724[var6];
                }
            }
        }
        arg1.field1716 = this.field1716;
        arg1.field1718 = this.field1718;
        arg1.field1719 = this.field1719;
        arg1.field1720 = this.field1720;
        arg1.field1721 = this.field1721;
        arg1.field1763 = this.field1763;
        arg1.field1723 = this.field1723;
        arg1.field1725 = this.field1725;
        arg1.field1765 = this.field1765;
        arg1.field1727 = this.field1727;
        arg1.field1729 = this.field1729;
        arg1.field1712 = this.field1712;
        arg1.field1731 = this.field1731;
        arg1.field1752 = this.field1752;
        arg1.field1733 = this.field1733;
        arg1.field1734 = this.field1734;
        arg1.field1735 = 0;
        return arg1;
    }

    @ObfuscatedName("cg.m()V")
    public void method1950() {
        if (this.field1735 == 1) {
            return;
        }
        this.field1735 = 1;
        this.field1353 = 0;
        this.field1736 = 0;
        this.field1737 = 0;
        for (int var1 = 0; var1 < this.field1757; var1++) {
            int var2 = this.field1713[var1];
            int var3 = this.field1714[var1];
            int var4 = this.field1770[var1];
            if (-var3 > this.field1353) {
                this.field1353 = -var3;
            }
            if (var3 > this.field1736) {
                this.field1736 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1737) {
                this.field1737 = var5;
            }
        }
        this.field1737 = (int) (Math.sqrt((double) this.field1737) + 0.99D);
        this.field1739 = (int) (Math.sqrt((double) (this.field1353 * this.field1353 + this.field1737 * this.field1737)) + 0.99D);
        this.field1738 = this.field1739 + (int) (Math.sqrt((double) (this.field1737 * this.field1737 + this.field1736 * this.field1736)) + 0.99D);
    }

    @ObfuscatedName("cg.i()V")
    public void method1951() {
        if (this.field1735 == 2) {
            return;
        }
        this.field1735 = 2;
        this.field1737 = 0;
        for (int var1 = 0; var1 < this.field1757; var1++) {
            int var2 = this.field1713[var1];
            int var3 = this.field1714[var1];
            int var4 = this.field1770[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1737) {
                this.field1737 = var5;
            }
        }
        this.field1737 = (int) (Math.sqrt((double) this.field1737) + 0.99D);
        this.field1739 = this.field1737;
        this.field1738 = this.field1737 + this.field1737;
    }

    @ObfuscatedName("cg.l()I")
    public int method1952() {
        this.method1950();
        return this.field1737;
    }

    @ObfuscatedName("cg.p(Lca;I)V")
    public void method1953(class96 arg0, int arg1) {
        if (this.field1752 == null || arg1 == -1) {
            return;
        }
        class81 var3 = arg0.field1686[arg1];
        class95 var4 = var3.field1434;
        Statics.field1760 = 0;
        Statics.field1717 = 0;
        Statics.field1762 = 0;
        for (int var5 = 0; var5 < var3.field1439; var5++) {
            int var6 = var3.field1440[var5];
            this.method1991(var4.field1676[var6], var4.field1677[var6], var3.field1441[var5], var3.field1442[var5], var3.field1443[var5]);
        }
        this.field1735 = 0;
    }

    @ObfuscatedName("cg.r(Lca;ILca;I[I)V")
    public void method2006(class96 arg0, int arg1, class96 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1953(arg0, arg1);
            return;
        }
        class81 var6 = arg0.field1686[arg1];
        class81 var7 = arg2.field1686[arg3];
        class95 var8 = var6.field1434;
        Statics.field1760 = 0;
        Statics.field1717 = 0;
        Statics.field1762 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1439; var11++) {
            int var12 = var6.field1440[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1676[var12] == 0) {
                this.method1991(var8.field1676[var12], var8.field1677[var12], var6.field1441[var11], var6.field1442[var11], var6.field1443[var11]);
            }
        }
        Statics.field1760 = 0;
        Statics.field1717 = 0;
        Statics.field1762 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1439; var15++) {
            int var16 = var7.field1440[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1676[var16] == 0) {
                this.method1991(var8.field1676[var16], var8.field1677[var16], var7.field1441[var15], var7.field1442[var15], var7.field1443[var15]);
            }
        }
        this.field1735 = 0;
    }

    @ObfuscatedName("cg.j(I[IIII)V")
    public void method1991(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1760 = 0;
            Statics.field1717 = 0;
            Statics.field1762 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1752.length) {
                    int[] var10 = this.field1752[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1760 += this.field1713[var12];
                        Statics.field1717 += this.field1714[var12];
                        Statics.field1762 += this.field1770[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1760 = Statics.field1760 / var7 + arg2;
                Statics.field1717 = Statics.field1717 / var7 + arg3;
                Statics.field1762 = Statics.field1762 / var7 + arg4;
            } else {
                Statics.field1760 = arg2;
                Statics.field1717 = arg3;
                Statics.field1762 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1752.length) {
                    int[] var15 = this.field1752[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1713[var17] += arg2;
                        this.field1714[var17] += arg3;
                        this.field1770[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1752.length) {
                    int[] var20 = this.field1752[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1713[var22] -= Statics.field1760;
                        this.field1714[var22] -= Statics.field1717;
                        this.field1770[var22] -= Statics.field1762;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1768[var25];
                            int var27 = field1769[var25];
                            int var28 = this.field1714[var22] * var26 + this.field1713[var22] * var27 >> 16;
                            this.field1714[var22] = this.field1714[var22] * var27 - this.field1713[var22] * var26 >> 16;
                            this.field1713[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1768[var23];
                            int var30 = field1769[var23];
                            int var31 = this.field1714[var22] * var30 - this.field1770[var22] * var29 >> 16;
                            this.field1770[var22] = this.field1770[var22] * var30 + this.field1714[var22] * var29 >> 16;
                            this.field1714[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1768[var24];
                            int var33 = field1769[var24];
                            int var34 = this.field1770[var22] * var32 + this.field1713[var22] * var33 >> 16;
                            this.field1770[var22] = this.field1770[var22] * var33 - this.field1713[var22] * var32 >> 16;
                            this.field1713[var22] = var34;
                        }
                        this.field1713[var22] += Statics.field1760;
                        this.field1714[var22] += Statics.field1717;
                        this.field1770[var22] += Statics.field1762;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1752.length) {
                    int[] var37 = this.field1752[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1713[var39] -= Statics.field1760;
                        this.field1714[var39] -= Statics.field1717;
                        this.field1770[var39] -= Statics.field1762;
                        this.field1713[var39] = this.field1713[var39] * arg2 / 128;
                        this.field1714[var39] = this.field1714[var39] * arg3 / 128;
                        this.field1770[var39] = this.field1770[var39] * arg4 / 128;
                        this.field1713[var39] += Statics.field1760;
                        this.field1714[var39] += Statics.field1717;
                        this.field1770[var39] += Statics.field1762;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1733 != null && this.field1724 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1733.length) {
                    int[] var42 = this.field1733[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1724[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1724[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cg.c()V")
    public void method2018() {
        for (int var1 = 0; var1 < this.field1757; var1++) {
            int var2 = this.field1713[var1];
            this.field1713[var1] = this.field1770[var1];
            this.field1770[var1] = -var2;
        }
        this.field1735 = 0;
    }

    @ObfuscatedName("cg.q()V")
    public void method1957() {
        for (int var1 = 0; var1 < this.field1757; var1++) {
            this.field1713[var1] = -this.field1713[var1];
            this.field1770[var1] = -this.field1770[var1];
        }
        this.field1735 = 0;
    }

    @ObfuscatedName("cg.n()V")
    public void method1958() {
        for (int var1 = 0; var1 < this.field1757; var1++) {
            int var2 = this.field1770[var1];
            this.field1770[var1] = this.field1713[var1];
            this.field1713[var1] = -var2;
        }
        this.field1735 = 0;
    }

    @ObfuscatedName("cg.h(I)V")
    public void method1959(int arg0) {
        int var2 = field1768[arg0];
        int var3 = field1769[arg0];
        for (int var4 = 0; var4 < this.field1757; var4++) {
            int var5 = this.field1714[var4] * var3 - this.field1770[var4] * var2 >> 16;
            this.field1770[var4] = this.field1770[var4] * var3 + this.field1714[var4] * var2 >> 16;
            this.field1714[var4] = var5;
        }
        this.field1735 = 0;
    }

    @ObfuscatedName("cg.d(III)V")
    public void method1989(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1757; var4++) {
            this.field1713[var4] += arg0;
            this.field1714[var4] += arg1;
            this.field1770[var4] += arg2;
        }
        this.field1735 = 0;
    }

    @ObfuscatedName("cg.b(III)V")
    public void method1954(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1757; var4++) {
            this.field1713[var4] = this.field1713[var4] * arg0 / 128;
            this.field1714[var4] = this.field1714[var4] * arg1 / 128;
            this.field1770[var4] = this.field1770[var4] * arg2 / 128;
        }
        this.field1735 = 0;
    }

    @ObfuscatedName("cg.w(IIIIIII)V")
    public final void method1962(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1767[0] = -1;
        if (this.field1735 != 2 && this.field1735 != 1) {
            this.method1951();
        }
        int var8 = Statics.field1477;
        int var9 = Statics.field1478;
        int var10 = field1768[arg0];
        int var11 = field1769[arg0];
        int var12 = field1768[arg1];
        int var13 = field1769[arg1];
        int var14 = field1768[arg2];
        int var15 = field1769[arg2];
        int var16 = field1768[arg3];
        int var17 = field1769[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1757; var19++) {
            int var20 = this.field1713[var19];
            int var21 = this.field1714[var19];
            int var22 = this.field1770[var19];
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
            field1761[var19] = var30 - var18;
            field1715[var19] = (var26 << 9) / var30 + var8;
            field1744[var19] = (var29 << 9) / var30 + var9;
            if (this.field1766 > 0) {
                field1746[var19] = var26;
                field1726[var19] = var29;
                field1748[var19] = var30;
            }
        }
        try {
            this.method1963(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cg.z(IIIIIIII)V")
    public final void method1982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1767[0] = -1;
        if (this.field1735 != 2 && this.field1735 != 1) {
            this.method1951();
        }
        int var9 = Statics.field1477;
        int var10 = Statics.field1478;
        int var11 = field1768[arg0];
        int var12 = field1769[arg0];
        int var13 = field1768[arg1];
        int var14 = field1769[arg1];
        int var15 = field1768[arg2];
        int var16 = field1769[arg2];
        int var17 = field1768[arg3];
        int var18 = field1769[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1757; var20++) {
            int var21 = this.field1713[var20];
            int var22 = this.field1714[var20];
            int var23 = this.field1770[var20];
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
            field1761[var20] = var31 - var19;
            field1715[var20] = (var27 << 9) / arg7 + var9;
            field1744[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1766 > 0) {
                field1746[var20] = var27;
                field1726[var20] = var30;
                field1748[var20] = var31;
            }
        }
        try {
            this.method1963(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cg.as(IIIIIIIII)V")
    public void method1570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1767[0] = -1;
        if (this.field1735 != 1) {
            this.method1950();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1737 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1737 << 9;
        if (var15 / var13 >= Statics.field1482) {
            return;
        }
        int var16 = this.field1737 + var14 << 9;
        if (var16 / var13 <= Statics.field1481) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1737 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1468) {
            return;
        }
        int var20 = (this.field1353 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1480) {
            return;
        }
        int var22 = (this.field1353 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1766 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1741) {
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
            int var32 = field1764 - Statics.field1477;
            int var33 = field1745 - Statics.field1478;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1734) {
                    field1756[field1730++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1477;
        int var35 = Statics.field1478;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1768[arg0];
            var37 = field1769[arg0];
        }
        for (int var38 = 0; var38 < this.field1757; var38++) {
            int var39 = this.field1713[var38];
            int var40 = this.field1714[var38];
            int var41 = this.field1770[var38];
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
            field1761[var38] = var50 - var11;
            if (var50 >= 50) {
                field1715[var38] = (var46 << 9) / var50 + var34;
                field1744[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1715[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1746[var38] = var46;
                field1726[var38] = var49;
                field1748[var38] = var50;
            }
        }
        try {
            this.method1963(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cg.x(ZZI)V")
    public final void method1963(boolean arg0, boolean arg1, int arg2) {
        if (this.field1738 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1738; var4++) {
            field1767[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1743; var5++) {
            if (this.field1763[var5] != -2) {
                int var6 = this.field1716[var5];
                int var7 = this.field1718[var5];
                int var8 = this.field1719[var5];
                int var9 = field1715[var6];
                int var10 = field1715[var7];
                int var11 = field1715[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1746[var6];
                    int var13 = field1746[var7];
                    int var14 = field1746[var8];
                    int var15 = field1726[var6];
                    int var16 = field1726[var7];
                    int var17 = field1726[var8];
                    int var18 = field1748[var6];
                    int var19 = field1748[var7];
                    int var20 = field1748[var8];
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
                        field1750[var5] = true;
                        int var30 = (field1761[var6] + field1761[var7] + field1761[var8]) / 3 + this.field1739;
                        field1751[var30][field1767[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method1984(field1764, field1745, field1744[var6], field1744[var7], field1744[var8], var9, var10, var11)) {
                        field1756[field1730++] = arg2;
                        arg1 = false;
                    }
                    if ((field1744[var8] - field1744[var7]) * (var9 - var10) - (field1744[var6] - field1744[var7]) * (var11 - var10) > 0) {
                        field1750[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1471 && var10 <= Statics.field1471 && var11 <= Statics.field1471) {
                            field1771[var5] = false;
                        } else {
                            field1771[var5] = true;
                        }
                        int var31 = (field1761[var6] + field1761[var7] + field1761[var8]) / 3 + this.field1739;
                        field1751[var31][field1767[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1723 == null) {
            for (int var32 = this.field1738 - 1; var32 >= 0; var32--) {
                int var33 = field1767[var32];
                if (var33 > 0) {
                    int[] var34 = field1751[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method1965(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1774[var36] = 0;
            field1773[var36] = 0;
        }
        for (int var37 = this.field1738 - 1; var37 >= 0; var37--) {
            int var38 = field1767[var37];
            if (var38 > 0) {
                int[] var39 = field1751[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1723[var41];
                    int var43 = field1774[var42]++;
                    field1742[var42][var43] = var41;
                    if (var42 < 10) {
                        field1773[var42] += var37;
                    } else if (var42 == 10) {
                        field1754[var43] = var37;
                    } else {
                        field1755[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1774[1] > 0 || field1774[2] > 0) {
            var44 = (field1773[1] + field1773[2]) / (field1774[1] + field1774[2]);
        }
        int var45 = 0;
        if (field1774[3] > 0 || field1774[4] > 0) {
            var45 = (field1773[3] + field1773[4]) / (field1774[3] + field1774[4]);
        }
        int var46 = 0;
        if (field1774[6] > 0 || field1774[8] > 0) {
            var46 = (field1773[6] + field1773[8]) / (field1774[6] + field1774[8]);
        }
        int var47 = 0;
        int var48 = field1774[10];
        int[] var49 = field1742[10];
        int[] var50 = field1754;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1774[11];
            var49 = field1742[11];
            var50 = field1755;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method1965(var49[var47++]);
                if (var47 == var48 && field1742[11] != var49) {
                    var47 = 0;
                    var48 = field1774[11];
                    var49 = field1742[11];
                    var50 = field1755;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method1965(var49[var47++]);
                if (var47 == var48 && field1742[11] != var49) {
                    var47 = 0;
                    var48 = field1774[11];
                    var49 = field1742[11];
                    var50 = field1755;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method1965(var49[var47++]);
                if (var47 == var48 && field1742[11] != var49) {
                    var47 = 0;
                    var48 = field1774[11];
                    var49 = field1742[11];
                    var50 = field1755;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1774[var52];
            int[] var54 = field1742[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method1965(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method1965(var49[var47++]);
            if (var47 == var48 && field1742[11] != var49) {
                var47 = 0;
                var49 = field1742[11];
                var48 = field1774[11];
                var50 = field1755;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cg.e(I)V")
    public final void method1965(int arg0) {
        if (field1750[arg0]) {
            this.method1966(arg0);
            return;
        }
        int var2 = this.field1716[arg0];
        int var3 = this.field1718[arg0];
        int var4 = this.field1719[arg0];
        class84.field1469 = field1771[arg0];
        if (this.field1724 == null) {
            class84.field1488 = 0;
        } else {
            class84.field1488 = this.field1724[arg0] & 0xFF;
        }
        if (this.field1765 != null && this.field1765[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1725 == null || this.field1725[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1725[arg0] & 0xFF;
                var6 = this.field1729[var5];
                var7 = this.field1712[var5];
                var8 = this.field1731[var5];
            }
            if (this.field1763[arg0] == -1) {
                class84.method1754(field1744[var2], field1744[var3], field1744[var4], field1715[var2], field1715[var3], field1715[var4], this.field1720[arg0], this.field1720[arg0], this.field1720[arg0], field1746[var6], field1746[var7], field1746[var8], field1726[var6], field1726[var7], field1726[var8], field1748[var6], field1748[var7], field1748[var8], this.field1765[arg0]);
            } else {
                class84.method1754(field1744[var2], field1744[var3], field1744[var4], field1715[var2], field1715[var3], field1715[var4], this.field1720[arg0], this.field1721[arg0], this.field1763[arg0], field1746[var6], field1746[var7], field1746[var8], field1726[var6], field1726[var7], field1726[var8], field1748[var6], field1748[var7], field1748[var8], this.field1765[arg0]);
            }
        } else if (this.field1763[arg0] == -1) {
            class84.method1752(field1744[var2], field1744[var3], field1744[var4], field1715[var2], field1715[var3], field1715[var4], field1722[this.field1720[arg0]]);
        } else {
            class84.method1750(field1744[var2], field1744[var3], field1744[var4], field1715[var2], field1715[var3], field1715[var4], this.field1720[arg0], this.field1721[arg0], this.field1763[arg0]);
        }
    }

    @ObfuscatedName("cg.a(I)V")
    public final void method1966(int arg0) {
        int var2 = Statics.field1477;
        int var3 = Statics.field1478;
        int var4 = 0;
        int var5 = this.field1716[arg0];
        int var6 = this.field1718[arg0];
        int var7 = this.field1719[arg0];
        int var8 = field1748[var5];
        int var9 = field1748[var6];
        int var10 = field1748[var7];
        if (this.field1724 == null) {
            class84.field1488 = 0;
        } else {
            class84.field1488 = this.field1724[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1732[var4] = field1715[var5];
            field1758[var4] = field1744[var5];
            field1759[var4++] = this.field1720[arg0];
        } else {
            int var11 = field1746[var5];
            int var12 = field1726[var5];
            int var13 = this.field1720[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1753[var10 - var8];
                field1732[var4] = (((field1746[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1758[var4] = (((field1726[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1759[var4++] = ((this.field1763[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1753[var9 - var8];
                field1732[var4] = (((field1746[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1758[var4] = (((field1726[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1759[var4++] = ((this.field1721[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1732[var4] = field1715[var6];
            field1758[var4] = field1744[var6];
            field1759[var4++] = this.field1721[arg0];
        } else {
            int var16 = field1746[var6];
            int var17 = field1726[var6];
            int var18 = this.field1721[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1753[var8 - var9];
                field1732[var4] = (((field1746[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1758[var4] = (((field1726[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1759[var4++] = ((this.field1720[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1753[var10 - var9];
                field1732[var4] = (((field1746[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1758[var4] = (((field1726[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1759[var4++] = ((this.field1763[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1732[var4] = field1715[var7];
            field1758[var4] = field1744[var7];
            field1759[var4++] = this.field1763[arg0];
        } else {
            int var21 = field1746[var7];
            int var22 = field1726[var7];
            int var23 = this.field1763[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1753[var9 - var10];
                field1732[var4] = (((field1746[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1758[var4] = (((field1726[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1759[var4++] = ((this.field1721[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1753[var8 - var10];
                field1732[var4] = (((field1746[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1758[var4] = (((field1726[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1759[var4++] = ((this.field1720[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1732[0];
        int var27 = field1732[1];
        int var28 = field1732[2];
        int var29 = field1758[0];
        int var30 = field1758[1];
        int var31 = field1758[2];
        class84.field1469 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1471 || var27 > Statics.field1471 || var28 > Statics.field1471) {
                class84.field1469 = true;
            }
            if (this.field1765 != null && this.field1765[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1725 == null || this.field1725[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1725[arg0] & 0xFF;
                    var33 = this.field1729[var32];
                    var34 = this.field1712[var32];
                    var35 = this.field1731[var32];
                }
                if (this.field1763[arg0] == -1) {
                    class84.method1754(var29, var30, var31, var26, var27, var28, this.field1720[arg0], this.field1720[arg0], this.field1720[arg0], field1746[var33], field1746[var34], field1746[var35], field1726[var33], field1726[var34], field1726[var35], field1748[var33], field1748[var34], field1748[var35], this.field1765[arg0]);
                } else {
                    class84.method1754(var29, var30, var31, var26, var27, var28, field1759[0], field1759[1], field1759[2], field1746[var33], field1746[var34], field1746[var35], field1726[var33], field1726[var34], field1726[var35], field1748[var33], field1748[var34], field1748[var35], this.field1765[arg0]);
                }
            } else if (this.field1763[arg0] == -1) {
                class84.method1752(var29, var30, var31, var26, var27, var28, field1722[this.field1720[arg0]]);
            } else {
                class84.method1750(var29, var30, var31, var26, var27, var28, field1759[0], field1759[1], field1759[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1471 || var27 > Statics.field1471 || var28 > Statics.field1471 || field1732[3] < 0 || field1732[3] > Statics.field1471) {
            class84.field1469 = true;
        }
        if (this.field1765 != null && this.field1765[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1725 == null || this.field1725[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1725[arg0] & 0xFF;
                var37 = this.field1729[var36];
                var38 = this.field1712[var36];
                var39 = this.field1731[var36];
            }
            short var40 = this.field1765[arg0];
            if (this.field1763[arg0] == -1) {
                class84.method1754(var29, var30, var31, var26, var27, var28, this.field1720[arg0], this.field1720[arg0], this.field1720[arg0], field1746[var37], field1746[var38], field1746[var39], field1726[var37], field1726[var38], field1726[var39], field1748[var37], field1748[var38], field1748[var39], var40);
                class84.method1754(var29, var31, field1758[3], var26, var28, field1732[3], this.field1720[arg0], this.field1720[arg0], this.field1720[arg0], field1746[var37], field1746[var38], field1746[var39], field1726[var37], field1726[var38], field1726[var39], field1748[var37], field1748[var38], field1748[var39], var40);
            } else {
                class84.method1754(var29, var30, var31, var26, var27, var28, field1759[0], field1759[1], field1759[2], field1746[var37], field1746[var38], field1746[var39], field1726[var37], field1726[var38], field1726[var39], field1748[var37], field1748[var38], field1748[var39], var40);
                class84.method1754(var29, var31, field1758[3], var26, var28, field1732[3], field1759[0], field1759[2], field1759[3], field1746[var37], field1746[var38], field1746[var39], field1726[var37], field1726[var38], field1726[var39], field1748[var37], field1748[var38], field1748[var39], var40);
            }
        } else if (this.field1763[arg0] == -1) {
            int var41 = field1722[this.field1720[arg0]];
            class84.method1752(var29, var30, var31, var26, var27, var28, var41);
            class84.method1752(var29, var31, field1758[3], var26, var28, field1732[3], var41);
        } else {
            class84.method1750(var29, var30, var31, var26, var27, var28, field1759[0], field1759[1], field1759[2]);
            class84.method1750(var29, var31, field1758[3], var26, var28, field1732[3], field1759[0], field1759[2], field1759[3]);
        }
    }

    @ObfuscatedName("cg.y(IIIIIIII)Z")
    public final boolean method1984(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
