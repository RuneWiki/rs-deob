package deob;

@ObfuscatedName("cp")
public class class98 extends class78 {

    @ObfuscatedName("cp.k")
    public static class98 field1759 = new class98();

    @ObfuscatedName("cp.r")
    public static byte[] field1709 = new byte[1];

    @ObfuscatedName("cp.y")
    public static class98 field1764 = new class98();

    @ObfuscatedName("cp.w")
    public static byte[] field1725 = new byte[1];

    @ObfuscatedName("cp.m")
    public int field1712 = 0;

    @ObfuscatedName("cp.j")
    public int[] field1732;

    @ObfuscatedName("cp.g")
    public int[] field1714;

    @ObfuscatedName("cp.p")
    public int[] field1715;

    @ObfuscatedName("cp.o")
    public int field1766 = 0;

    @ObfuscatedName("cp.b")
    public int[] field1717;

    @ObfuscatedName("cp.x")
    public int[] field1761;

    @ObfuscatedName("cp.n")
    public int[] field1719;

    @ObfuscatedName("cp.d")
    public int[] field1710;

    @ObfuscatedName("cp.s")
    public int[] field1749;

    @ObfuscatedName("cp.v")
    public int[] field1721;

    @ObfuscatedName("cp.t")
    public byte[] field1723;

    @ObfuscatedName("cp.u")
    public byte[] field1770;

    @ObfuscatedName("cp.l")
    public byte[] field1752;

    @ObfuscatedName("cp.i")
    public short[] field1774;

    @ObfuscatedName("cp.h")
    public byte field1727 = 0;

    @ObfuscatedName("cp.e")
    public int field1728 = 0;

    @ObfuscatedName("cp.a")
    public int[] field1729;

    @ObfuscatedName("cp.c")
    public int[] field1730;

    @ObfuscatedName("cp.f")
    public int[] field1731;

    @ObfuscatedName("cp.q")
    public int[][] field1720;

    @ObfuscatedName("cp.z")
    public int[][] field1733;

    @ObfuscatedName("cp.aa")
    public boolean field1734 = false;

    @ObfuscatedName("cp.ak")
    public int field1735;

    @ObfuscatedName("cp.al")
    public int field1736;

    @ObfuscatedName("cp.aw")
    public int field1737;

    @ObfuscatedName("cp.ai")
    public int field1738;

    @ObfuscatedName("cp.av")
    public int field1739;

    @ObfuscatedName("cp.aq")
    public static boolean[] field1741 = new boolean[4096];

    @ObfuscatedName("cp.aj")
    public static boolean[] field1742 = new boolean[4096];

    @ObfuscatedName("cp.az")
    public static int[] field1743 = new int[4096];

    @ObfuscatedName("cp.ax")
    public static int[] field1744 = new int[4096];

    @ObfuscatedName("cp.ap")
    public static int[] field1745 = new int[4096];

    @ObfuscatedName("cp.ar")
    public static int[] field1746 = new int[4096];

    @ObfuscatedName("cp.am")
    public static int[] field1747 = new int[4096];

    @ObfuscatedName("cp.ae")
    public static int[] field1748 = new int[4096];

    @ObfuscatedName("cp.ad")
    public static int[] field1708 = new int[1600];

    @ObfuscatedName("cp.af")
    public static int[][] field1751 = new int[1600][512];

    @ObfuscatedName("cp.ab")
    public static int[] field1726 = new int[12];

    @ObfuscatedName("cp.at")
    public static int[][] field1713 = new int[12][2000];

    @ObfuscatedName("cp.ag")
    public static int[] field1754 = new int[2000];

    @ObfuscatedName("cp.ah")
    public static int[] field1755 = new int[2000];

    @ObfuscatedName("cp.ac")
    public static int[] field1762 = new int[12];

    @ObfuscatedName("cp.ay")
    public static int[] field1757 = new int[10];

    @ObfuscatedName("cp.au")
    public static int[] field1767 = new int[10];

    @ObfuscatedName("cp.ao")
    public static int[] field1756 = new int[10];

    @ObfuscatedName("cp.bw")
    public static boolean field1763 = false;

    @ObfuscatedName("cp.be")
    public static int field1711 = 0;

    @ObfuscatedName("cp.bd")
    public static int field1765 = 0;

    @ObfuscatedName("cp.bo")
    public static int field1758 = 0;

    @ObfuscatedName("cp.bz")
    public static int[] field1760 = new int[1000];

    @ObfuscatedName("cp.bq")
    public static int[] field1768 = class84.field1470;

    @ObfuscatedName("cp.bu")
    public static int[] field1769 = class84.field1491;

    @ObfuscatedName("cp.bk")
    public static int[] field1750 = class84.field1483;

    @ObfuscatedName("cp.bc")
    public static int[] field1771 = class84.field1489;

    public class98() {
    }

    public class98(class98[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1712 = 0;
        this.field1766 = 0;
        this.field1728 = 0;
        this.field1727 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class98 var8 = arg0[var7];
            if (var8 != null) {
                this.field1712 += var8.field1712;
                this.field1766 += var8.field1766;
                this.field1728 += var8.field1728;
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
                var4 |= var8.field1770 != null;
                var5 |= var8.field1774 != null;
                var6 |= var8.field1752 != null;
            }
        }
        this.field1732 = new int[this.field1712];
        this.field1714 = new int[this.field1712];
        this.field1715 = new int[this.field1712];
        this.field1717 = new int[this.field1766];
        this.field1761 = new int[this.field1766];
        this.field1719 = new int[this.field1766];
        this.field1710 = new int[this.field1766];
        this.field1749 = new int[this.field1766];
        this.field1721 = new int[this.field1766];
        if (var3) {
            this.field1723 = new byte[this.field1766];
        }
        if (var4) {
            this.field1770 = new byte[this.field1766];
        }
        if (var5) {
            this.field1774 = new short[this.field1766];
        }
        if (var6) {
            this.field1752 = new byte[this.field1766];
        }
        if (this.field1728 > 0) {
            this.field1729 = new int[this.field1728];
            this.field1730 = new int[this.field1728];
            this.field1731 = new int[this.field1728];
        }
        this.field1712 = 0;
        this.field1766 = 0;
        this.field1728 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class98 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1766; var11++) {
                    this.field1717[this.field1766] = var10.field1717[var11] + this.field1712;
                    this.field1761[this.field1766] = var10.field1761[var11] + this.field1712;
                    this.field1719[this.field1766] = var10.field1719[var11] + this.field1712;
                    this.field1710[this.field1766] = var10.field1710[var11];
                    this.field1749[this.field1766] = var10.field1749[var11];
                    this.field1721[this.field1766] = var10.field1721[var11];
                    if (var3) {
                        if (var10.field1723 == null) {
                            this.field1723[this.field1766] = var10.field1727;
                        } else {
                            this.field1723[this.field1766] = var10.field1723[var11];
                        }
                    }
                    if (var4 && var10.field1770 != null) {
                        this.field1770[this.field1766] = var10.field1770[var11];
                    }
                    if (var5) {
                        if (var10.field1774 == null) {
                            this.field1774[this.field1766] = -1;
                        } else {
                            this.field1774[this.field1766] = var10.field1774[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1752 == null || var10.field1752[var11] == -1) {
                            this.field1752[this.field1766] = -1;
                        } else {
                            this.field1752[this.field1766] = (byte) (var10.field1752[var11] + this.field1728);
                        }
                    }
                    this.field1766++;
                }
                for (int var12 = 0; var12 < var10.field1728; var12++) {
                    this.field1729[this.field1728] = var10.field1729[var12] + this.field1712;
                    this.field1730[this.field1728] = var10.field1730[var12] + this.field1712;
                    this.field1731[this.field1728] = var10.field1731[var12] + this.field1712;
                    this.field1728++;
                }
                for (int var13 = 0; var13 < var10.field1712; var13++) {
                    this.field1732[this.field1712] = var10.field1732[var13];
                    this.field1714[this.field1712] = var10.field1714[var13];
                    this.field1715[this.field1712] = var10.field1715[var13];
                    this.field1712++;
                }
            }
        }
    }

    @ObfuscatedName("cp.k([[IIIIZI)Lcp;")
    public class98 method1976(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1998();
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
            var15.field1712 = this.field1712;
            var15.field1766 = this.field1766;
            var15.field1728 = this.field1728;
            var15.field1732 = this.field1732;
            var15.field1715 = this.field1715;
            var15.field1717 = this.field1717;
            var15.field1761 = this.field1761;
            var15.field1719 = this.field1719;
            var15.field1710 = this.field1710;
            var15.field1749 = this.field1749;
            var15.field1721 = this.field1721;
            var15.field1723 = this.field1723;
            var15.field1770 = this.field1770;
            var15.field1752 = this.field1752;
            var15.field1774 = this.field1774;
            var15.field1727 = this.field1727;
            var15.field1729 = this.field1729;
            var15.field1730 = this.field1730;
            var15.field1731 = this.field1731;
            var15.field1720 = this.field1720;
            var15.field1733 = this.field1733;
            var15.field1734 = this.field1734;
            var15.field1714 = new int[var15.field1712];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1712; var16++) {
                int var17 = this.field1732[var16] + arg1;
                int var18 = this.field1715[var16] + arg3;
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
            for (int var26 = 0; var26 < var15.field1712; var26++) {
                int var27 = (-this.field1714[var26] << 16) / this.field1354;
                if (var27 < arg5) {
                    int var28 = this.field1732[var26] + arg1;
                    int var29 = this.field1715[var26] + arg3;
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

    @ObfuscatedName("cp.y(Z)Lcp;")
    public class98 method1977(boolean arg0) {
        if (!arg0 && field1709.length < this.field1766) {
            field1709 = new byte[this.field1766 + 100];
        }
        return this.method1979(arg0, field1759, field1709);
    }

    @ObfuscatedName("cp.w(Z)Lcp;")
    public class98 method2010(boolean arg0) {
        if (!arg0 && field1725.length < this.field1766) {
            field1725 = new byte[this.field1766 + 100];
        }
        return this.method1979(arg0, field1764, field1725);
    }

    @ObfuscatedName("cp.m(ZLcp;[B)Lcp;")
    public class98 method1979(boolean arg0, class98 arg1, byte[] arg2) {
        arg1.field1712 = this.field1712;
        arg1.field1766 = this.field1766;
        arg1.field1728 = this.field1728;
        if (arg1.field1732 == null || arg1.field1732.length < this.field1712) {
            arg1.field1732 = new int[this.field1712 + 100];
            arg1.field1714 = new int[this.field1712 + 100];
            arg1.field1715 = new int[this.field1712 + 100];
        }
        for (int var4 = 0; var4 < this.field1712; var4++) {
            arg1.field1732[var4] = this.field1732[var4];
            arg1.field1714[var4] = this.field1714[var4];
            arg1.field1715[var4] = this.field1715[var4];
        }
        if (arg0) {
            arg1.field1770 = this.field1770;
        } else {
            arg1.field1770 = arg2;
            if (this.field1770 == null) {
                for (int var5 = 0; var5 < this.field1766; var5++) {
                    arg1.field1770[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1766; var6++) {
                    arg1.field1770[var6] = this.field1770[var6];
                }
            }
        }
        arg1.field1717 = this.field1717;
        arg1.field1761 = this.field1761;
        arg1.field1719 = this.field1719;
        arg1.field1710 = this.field1710;
        arg1.field1749 = this.field1749;
        arg1.field1721 = this.field1721;
        arg1.field1723 = this.field1723;
        arg1.field1752 = this.field1752;
        arg1.field1774 = this.field1774;
        arg1.field1727 = this.field1727;
        arg1.field1729 = this.field1729;
        arg1.field1730 = this.field1730;
        arg1.field1731 = this.field1731;
        arg1.field1720 = this.field1720;
        arg1.field1733 = this.field1733;
        arg1.field1734 = this.field1734;
        arg1.field1735 = 0;
        return arg1;
    }

    @ObfuscatedName("cp.o()V")
    public void method1998() {
        if (this.field1735 == 1) {
            return;
        }
        this.field1735 = 1;
        this.field1354 = 0;
        this.field1736 = 0;
        this.field1737 = 0;
        for (int var1 = 0; var1 < this.field1712; var1++) {
            int var2 = this.field1732[var1];
            int var3 = this.field1714[var1];
            int var4 = this.field1715[var1];
            if (-var3 > this.field1354) {
                this.field1354 = -var3;
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
        this.field1739 = (int) (Math.sqrt((double) (this.field1354 * this.field1354 + this.field1737 * this.field1737)) + 0.99D);
        this.field1738 = this.field1739 + (int) (Math.sqrt((double) (this.field1737 * this.field1737 + this.field1736 * this.field1736)) + 0.99D);
    }

    @ObfuscatedName("cp.b()V")
    public void method2008() {
        if (this.field1735 == 2) {
            return;
        }
        this.field1735 = 2;
        this.field1737 = 0;
        for (int var1 = 0; var1 < this.field1712; var1++) {
            int var2 = this.field1732[var1];
            int var3 = this.field1714[var1];
            int var4 = this.field1715[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1737) {
                this.field1737 = var5;
            }
        }
        this.field1737 = (int) (Math.sqrt((double) this.field1737) + 0.99D);
        this.field1739 = this.field1737;
        this.field1738 = this.field1737 + this.field1737;
    }

    @ObfuscatedName("cp.x()I")
    public int method1982() {
        this.method1998();
        return this.field1737;
    }

    @ObfuscatedName("cp.n(Lcv;I)V")
    public void method1983(class96 arg0, int arg1) {
        if (this.field1720 == null || arg1 == -1) {
            return;
        }
        class81 var3 = arg0.field1684[arg1];
        class95 var4 = var3.field1437;
        Statics.field1718 = 0;
        Statics.field1724 = 0;
        Statics.field1722 = 0;
        for (int var5 = 0; var5 < var3.field1438; var5++) {
            int var6 = var3.field1433[var5];
            this.method1981(var4.field1671[var6], var4.field1670[var6], var3.field1440[var5], var3.field1441[var5], var3.field1442[var5]);
        }
        this.field1735 = 0;
    }

    @ObfuscatedName("cp.d(Lcv;ILcv;I[I)V")
    public void method2030(class96 arg0, int arg1, class96 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1983(arg0, arg1);
            return;
        }
        class81 var6 = arg0.field1684[arg1];
        class81 var7 = arg2.field1684[arg3];
        class95 var8 = var6.field1437;
        Statics.field1718 = 0;
        Statics.field1724 = 0;
        Statics.field1722 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1438; var11++) {
            int var12 = var6.field1433[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1671[var12] == 0) {
                this.method1981(var8.field1671[var12], var8.field1670[var12], var6.field1440[var11], var6.field1441[var11], var6.field1442[var11]);
            }
        }
        Statics.field1718 = 0;
        Statics.field1724 = 0;
        Statics.field1722 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1438; var15++) {
            int var16 = var7.field1433[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1671[var16] == 0) {
                this.method1981(var8.field1671[var16], var8.field1670[var16], var7.field1440[var15], var7.field1441[var15], var7.field1442[var15]);
            }
        }
        this.field1735 = 0;
    }

    @ObfuscatedName("cp.s(I[IIII)V")
    public void method1981(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1718 = 0;
            Statics.field1724 = 0;
            Statics.field1722 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1720.length) {
                    int[] var10 = this.field1720[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1718 += this.field1732[var12];
                        Statics.field1724 += this.field1714[var12];
                        Statics.field1722 += this.field1715[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1718 = Statics.field1718 / var7 + arg2;
                Statics.field1724 = Statics.field1724 / var7 + arg3;
                Statics.field1722 = Statics.field1722 / var7 + arg4;
            } else {
                Statics.field1718 = arg2;
                Statics.field1724 = arg3;
                Statics.field1722 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1720.length) {
                    int[] var15 = this.field1720[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1732[var17] += arg2;
                        this.field1714[var17] += arg3;
                        this.field1715[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1720.length) {
                    int[] var20 = this.field1720[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1732[var22] -= Statics.field1718;
                        this.field1714[var22] -= Statics.field1724;
                        this.field1715[var22] -= Statics.field1722;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1768[var25];
                            int var27 = field1769[var25];
                            int var28 = this.field1732[var22] * var27 + this.field1714[var22] * var26 >> 16;
                            this.field1714[var22] = this.field1714[var22] * var27 - this.field1732[var22] * var26 >> 16;
                            this.field1732[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1768[var23];
                            int var30 = field1769[var23];
                            int var31 = this.field1714[var22] * var30 - this.field1715[var22] * var29 >> 16;
                            this.field1715[var22] = this.field1715[var22] * var30 + this.field1714[var22] * var29 >> 16;
                            this.field1714[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1768[var24];
                            int var33 = field1769[var24];
                            int var34 = this.field1732[var22] * var33 + this.field1715[var22] * var32 >> 16;
                            this.field1715[var22] = this.field1715[var22] * var33 - this.field1732[var22] * var32 >> 16;
                            this.field1732[var22] = var34;
                        }
                        this.field1732[var22] += Statics.field1718;
                        this.field1714[var22] += Statics.field1724;
                        this.field1715[var22] += Statics.field1722;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1720.length) {
                    int[] var37 = this.field1720[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1732[var39] -= Statics.field1718;
                        this.field1714[var39] -= Statics.field1724;
                        this.field1715[var39] -= Statics.field1722;
                        this.field1732[var39] = this.field1732[var39] * arg2 / 128;
                        this.field1714[var39] = this.field1714[var39] * arg3 / 128;
                        this.field1715[var39] = this.field1715[var39] * arg4 / 128;
                        this.field1732[var39] += Statics.field1718;
                        this.field1714[var39] += Statics.field1724;
                        this.field1715[var39] += Statics.field1722;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1733 != null && this.field1770 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1733.length) {
                    int[] var42 = this.field1733[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1770[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1770[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cp.v()V")
    public void method2004() {
        for (int var1 = 0; var1 < this.field1712; var1++) {
            int var2 = this.field1732[var1];
            this.field1732[var1] = this.field1715[var1];
            this.field1715[var1] = -var2;
        }
        this.field1735 = 0;
    }

    @ObfuscatedName("cp.t()V")
    public void method2001() {
        for (int var1 = 0; var1 < this.field1712; var1++) {
            this.field1732[var1] = -this.field1732[var1];
            this.field1715[var1] = -this.field1715[var1];
        }
        this.field1735 = 0;
    }

    @ObfuscatedName("cp.u()V")
    public void method1988() {
        for (int var1 = 0; var1 < this.field1712; var1++) {
            int var2 = this.field1715[var1];
            this.field1715[var1] = this.field1732[var1];
            this.field1732[var1] = -var2;
        }
        this.field1735 = 0;
    }

    @ObfuscatedName("cp.l(I)V")
    public void method1989(int arg0) {
        int var2 = field1768[arg0];
        int var3 = field1769[arg0];
        for (int var4 = 0; var4 < this.field1712; var4++) {
            int var5 = this.field1714[var4] * var3 - this.field1715[var4] * var2 >> 16;
            this.field1715[var4] = this.field1715[var4] * var3 + this.field1714[var4] * var2 >> 16;
            this.field1714[var4] = var5;
        }
        this.field1735 = 0;
    }

    @ObfuscatedName("cp.e(III)V")
    public void method1990(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1712; var4++) {
            this.field1732[var4] += arg0;
            this.field1714[var4] += arg1;
            this.field1715[var4] += arg2;
        }
        this.field1735 = 0;
    }

    @ObfuscatedName("cp.a(III)V")
    public void method1991(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1712; var4++) {
            this.field1732[var4] = this.field1732[var4] * arg0 / 128;
            this.field1714[var4] = this.field1714[var4] * arg1 / 128;
            this.field1715[var4] = this.field1715[var4] * arg2 / 128;
        }
        this.field1735 = 0;
    }

    @ObfuscatedName("cp.c(IIIIIII)V")
    public final void method1992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1708[0] = -1;
        if (this.field1735 != 2 && this.field1735 != 1) {
            this.method2008();
        }
        int var8 = Statics.field1469;
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
        for (int var19 = 0; var19 < this.field1712; var19++) {
            int var20 = this.field1732[var19];
            int var21 = this.field1714[var19];
            int var22 = this.field1715[var19];
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
            field1745[var19] = var30 - var18;
            field1743[var19] = (var26 << 9) / var30 + var8;
            field1744[var19] = (var29 << 9) / var30 + var9;
            if (this.field1728 > 0) {
                field1746[var19] = var26;
                field1747[var19] = var29;
                field1748[var19] = var30;
            }
        }
        try {
            this.method1995(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cp.f(IIIIIIII)V")
    public final void method1993(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1708[0] = -1;
        if (this.field1735 != 2 && this.field1735 != 1) {
            this.method2008();
        }
        int var9 = Statics.field1469;
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
        for (int var20 = 0; var20 < this.field1712; var20++) {
            int var21 = this.field1732[var20];
            int var22 = this.field1714[var20];
            int var23 = this.field1715[var20];
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
            field1745[var20] = var31 - var19;
            field1743[var20] = (var27 << 9) / arg7 + var9;
            field1744[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1728 > 0) {
                field1746[var20] = var27;
                field1747[var20] = var30;
                field1748[var20] = var31;
            }
        }
        try {
            this.method1995(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cp.i(IIIIIIIII)V")
    public void method1603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1708[0] = -1;
        if (this.field1735 != 1) {
            this.method1998();
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
        if (var19 / var13 <= Statics.field1486) {
            return;
        }
        int var20 = (this.field1354 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1484) {
            return;
        }
        int var22 = (this.field1354 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1728 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1763) {
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
            int var32 = field1711 - Statics.field1469;
            int var33 = field1765 - Statics.field1478;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1734) {
                    field1760[field1758++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1469;
        int var35 = Statics.field1478;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1768[arg0];
            var37 = field1769[arg0];
        }
        for (int var38 = 0; var38 < this.field1712; var38++) {
            int var39 = this.field1732[var38];
            int var40 = this.field1714[var38];
            int var41 = this.field1715[var38];
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
            field1745[var38] = var50 - var11;
            if (var50 >= 50) {
                field1743[var38] = (var46 << 9) / var50 + var34;
                field1744[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1743[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1746[var38] = var46;
                field1747[var38] = var49;
                field1748[var38] = var50;
            }
        }
        try {
            this.method1995(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cp.q(ZZI)V")
    public final void method1995(boolean arg0, boolean arg1, int arg2) {
        if (this.field1738 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1738; var4++) {
            field1708[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1766; var5++) {
            if (this.field1721[var5] != -2) {
                int var6 = this.field1717[var5];
                int var7 = this.field1761[var5];
                int var8 = this.field1719[var5];
                int var9 = field1743[var6];
                int var10 = field1743[var7];
                int var11 = field1743[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1746[var6];
                    int var13 = field1746[var7];
                    int var14 = field1746[var8];
                    int var15 = field1747[var6];
                    int var16 = field1747[var7];
                    int var17 = field1747[var8];
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
                        field1742[var5] = true;
                        int var30 = (field1745[var6] + field1745[var7] + field1745[var8]) / 3 + this.field1739;
                        field1751[var30][field1708[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2017(field1711, field1765, field1744[var6], field1744[var7], field1744[var8], var9, var10, var11)) {
                        field1760[field1758++] = arg2;
                        arg1 = false;
                    }
                    if ((field1744[var8] - field1744[var7]) * (var9 - var10) - (field1744[var6] - field1744[var7]) * (var11 - var10) > 0) {
                        field1742[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1467 && var10 <= Statics.field1467 && var11 <= Statics.field1467) {
                            field1741[var5] = false;
                        } else {
                            field1741[var5] = true;
                        }
                        int var31 = (field1745[var6] + field1745[var7] + field1745[var8]) / 3 + this.field1739;
                        field1751[var31][field1708[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1723 == null) {
            for (int var32 = this.field1738 - 1; var32 >= 0; var32--) {
                int var33 = field1708[var32];
                if (var33 > 0) {
                    int[] var34 = field1751[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method1985(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1726[var36] = 0;
            field1762[var36] = 0;
        }
        for (int var37 = this.field1738 - 1; var37 >= 0; var37--) {
            int var38 = field1708[var37];
            if (var38 > 0) {
                int[] var39 = field1751[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1723[var41];
                    int var43 = field1726[var42]++;
                    field1713[var42][var43] = var41;
                    if (var42 < 10) {
                        field1762[var42] += var37;
                    } else if (var42 == 10) {
                        field1754[var43] = var37;
                    } else {
                        field1755[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1726[1] > 0 || field1726[2] > 0) {
            var44 = (field1762[1] + field1762[2]) / (field1726[1] + field1726[2]);
        }
        int var45 = 0;
        if (field1726[3] > 0 || field1726[4] > 0) {
            var45 = (field1762[3] + field1762[4]) / (field1726[3] + field1726[4]);
        }
        int var46 = 0;
        if (field1726[6] > 0 || field1726[8] > 0) {
            var46 = (field1762[6] + field1762[8]) / (field1726[6] + field1726[8]);
        }
        int var47 = 0;
        int var48 = field1726[10];
        int[] var49 = field1713[10];
        int[] var50 = field1754;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1726[11];
            var49 = field1713[11];
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
                this.method1985(var49[var47++]);
                if (var47 == var48 && field1713[11] != var49) {
                    var47 = 0;
                    var48 = field1726[11];
                    var49 = field1713[11];
                    var50 = field1755;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method1985(var49[var47++]);
                if (var47 == var48 && field1713[11] != var49) {
                    var47 = 0;
                    var48 = field1726[11];
                    var49 = field1713[11];
                    var50 = field1755;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method1985(var49[var47++]);
                if (var47 == var48 && field1713[11] != var49) {
                    var47 = 0;
                    var48 = field1726[11];
                    var49 = field1713[11];
                    var50 = field1755;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1726[var52];
            int[] var54 = field1713[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method1985(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method1985(var49[var47++]);
            if (var47 == var48 && field1713[11] != var49) {
                var47 = 0;
                var49 = field1713[11];
                var48 = field1726[11];
                var50 = field1755;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cp.z(I)V")
    public final void method1985(int arg0) {
        if (field1742[arg0]) {
            this.method1997(arg0);
            return;
        }
        int var2 = this.field1717[arg0];
        int var3 = this.field1761[arg0];
        int var4 = this.field1719[arg0];
        class84.field1471 = field1741[arg0];
        if (this.field1770 == null) {
            class84.field1488 = 0;
        } else {
            class84.field1488 = this.field1770[arg0] & 0xFF;
        }
        if (this.field1774 != null && this.field1774[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1752 == null || this.field1752[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1752[arg0] & 0xFF;
                var6 = this.field1729[var5];
                var7 = this.field1730[var5];
                var8 = this.field1731[var5];
            }
            if (this.field1721[arg0] == -1) {
                class84.method1802(field1744[var2], field1744[var3], field1744[var4], field1743[var2], field1743[var3], field1743[var4], this.field1710[arg0], this.field1710[arg0], this.field1710[arg0], field1746[var6], field1746[var7], field1746[var8], field1747[var6], field1747[var7], field1747[var8], field1748[var6], field1748[var7], field1748[var8], this.field1774[arg0]);
            } else {
                class84.method1802(field1744[var2], field1744[var3], field1744[var4], field1743[var2], field1743[var3], field1743[var4], this.field1710[arg0], this.field1749[arg0], this.field1721[arg0], field1746[var6], field1746[var7], field1746[var8], field1747[var6], field1747[var7], field1747[var8], field1748[var6], field1748[var7], field1748[var8], this.field1774[arg0]);
            }
        } else if (this.field1721[arg0] == -1) {
            class84.method1829(field1744[var2], field1744[var3], field1744[var4], field1743[var2], field1743[var3], field1743[var4], field1750[this.field1710[arg0]]);
        } else {
            class84.method1798(field1744[var2], field1744[var3], field1744[var4], field1743[var2], field1743[var3], field1743[var4], this.field1710[arg0], this.field1749[arg0], this.field1721[arg0]);
        }
    }

    @ObfuscatedName("cp.aa(I)V")
    public final void method1997(int arg0) {
        int var2 = Statics.field1469;
        int var3 = Statics.field1478;
        int var4 = 0;
        int var5 = this.field1717[arg0];
        int var6 = this.field1761[arg0];
        int var7 = this.field1719[arg0];
        int var8 = field1748[var5];
        int var9 = field1748[var6];
        int var10 = field1748[var7];
        if (this.field1770 == null) {
            class84.field1488 = 0;
        } else {
            class84.field1488 = this.field1770[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1757[var4] = field1743[var5];
            field1767[var4] = field1744[var5];
            field1756[var4++] = this.field1710[arg0];
        } else {
            int var11 = field1746[var5];
            int var12 = field1747[var5];
            int var13 = this.field1710[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1771[var10 - var8];
                field1757[var4] = (((field1746[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1767[var4] = (((field1747[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1756[var4++] = ((this.field1721[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1771[var9 - var8];
                field1757[var4] = (((field1746[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1767[var4] = (((field1747[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1756[var4++] = ((this.field1749[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1757[var4] = field1743[var6];
            field1767[var4] = field1744[var6];
            field1756[var4++] = this.field1749[arg0];
        } else {
            int var16 = field1746[var6];
            int var17 = field1747[var6];
            int var18 = this.field1749[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1771[var8 - var9];
                field1757[var4] = (((field1746[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1767[var4] = (((field1747[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1756[var4++] = ((this.field1710[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1771[var10 - var9];
                field1757[var4] = (((field1746[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1767[var4] = (((field1747[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1756[var4++] = ((this.field1721[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1757[var4] = field1743[var7];
            field1767[var4] = field1744[var7];
            field1756[var4++] = this.field1721[arg0];
        } else {
            int var21 = field1746[var7];
            int var22 = field1747[var7];
            int var23 = this.field1721[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1771[var9 - var10];
                field1757[var4] = (((field1746[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1767[var4] = (((field1747[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1756[var4++] = ((this.field1749[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1771[var8 - var10];
                field1757[var4] = (((field1746[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1767[var4] = (((field1747[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1756[var4++] = ((this.field1710[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1757[0];
        int var27 = field1757[1];
        int var28 = field1757[2];
        int var29 = field1767[0];
        int var30 = field1767[1];
        int var31 = field1767[2];
        class84.field1471 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1467 || var27 > Statics.field1467 || var28 > Statics.field1467) {
                class84.field1471 = true;
            }
            if (this.field1774 != null && this.field1774[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1752 == null || this.field1752[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1752[arg0] & 0xFF;
                    var33 = this.field1729[var32];
                    var34 = this.field1730[var32];
                    var35 = this.field1731[var32];
                }
                if (this.field1721[arg0] == -1) {
                    class84.method1802(var29, var30, var31, var26, var27, var28, this.field1710[arg0], this.field1710[arg0], this.field1710[arg0], field1746[var33], field1746[var34], field1746[var35], field1747[var33], field1747[var34], field1747[var35], field1748[var33], field1748[var34], field1748[var35], this.field1774[arg0]);
                } else {
                    class84.method1802(var29, var30, var31, var26, var27, var28, field1756[0], field1756[1], field1756[2], field1746[var33], field1746[var34], field1746[var35], field1747[var33], field1747[var34], field1747[var35], field1748[var33], field1748[var34], field1748[var35], this.field1774[arg0]);
                }
            } else if (this.field1721[arg0] == -1) {
                class84.method1829(var29, var30, var31, var26, var27, var28, field1750[this.field1710[arg0]]);
            } else {
                class84.method1798(var29, var30, var31, var26, var27, var28, field1756[0], field1756[1], field1756[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1467 || var27 > Statics.field1467 || var28 > Statics.field1467 || field1757[3] < 0 || field1757[3] > Statics.field1467) {
            class84.field1471 = true;
        }
        if (this.field1774 != null && this.field1774[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1752 == null || this.field1752[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1752[arg0] & 0xFF;
                var37 = this.field1729[var36];
                var38 = this.field1730[var36];
                var39 = this.field1731[var36];
            }
            short var40 = this.field1774[arg0];
            if (this.field1721[arg0] == -1) {
                class84.method1802(var29, var30, var31, var26, var27, var28, this.field1710[arg0], this.field1710[arg0], this.field1710[arg0], field1746[var37], field1746[var38], field1746[var39], field1747[var37], field1747[var38], field1747[var39], field1748[var37], field1748[var38], field1748[var39], var40);
                class84.method1802(var29, var31, field1767[3], var26, var28, field1757[3], this.field1710[arg0], this.field1710[arg0], this.field1710[arg0], field1746[var37], field1746[var38], field1746[var39], field1747[var37], field1747[var38], field1747[var39], field1748[var37], field1748[var38], field1748[var39], var40);
            } else {
                class84.method1802(var29, var30, var31, var26, var27, var28, field1756[0], field1756[1], field1756[2], field1746[var37], field1746[var38], field1746[var39], field1747[var37], field1747[var38], field1747[var39], field1748[var37], field1748[var38], field1748[var39], var40);
                class84.method1802(var29, var31, field1767[3], var26, var28, field1757[3], field1756[0], field1756[2], field1756[3], field1746[var37], field1746[var38], field1746[var39], field1747[var37], field1747[var38], field1747[var39], field1748[var37], field1748[var38], field1748[var39], var40);
            }
        } else if (this.field1721[arg0] == -1) {
            int var41 = field1750[this.field1710[arg0]];
            class84.method1829(var29, var30, var31, var26, var27, var28, var41);
            class84.method1829(var29, var31, field1767[3], var26, var28, field1757[3], var41);
        } else {
            class84.method1798(var29, var30, var31, var26, var27, var28, field1756[0], field1756[1], field1756[2]);
            class84.method1798(var29, var31, field1767[3], var26, var28, field1757[3], field1756[0], field1756[2], field1756[3]);
        }
    }

    @ObfuscatedName("cp.ak(IIIIIIII)Z")
    public final boolean method2017(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
