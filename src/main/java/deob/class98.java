package deob;

@ObfuscatedName("ck")
public class class98 extends class78 {

    @ObfuscatedName("ck.k")
    public static class98 field1720 = new class98();

    @ObfuscatedName("ck.b")
    public static byte[] field1713 = new byte[1];

    @ObfuscatedName("ck.e")
    public static class98 field1714 = new class98();

    @ObfuscatedName("ck.i")
    public static byte[] field1715 = new byte[1];

    @ObfuscatedName("ck.t")
    public int field1716 = 0;

    @ObfuscatedName("ck.z")
    public int[] field1745;

    @ObfuscatedName("ck.g")
    public int[] field1751;

    @ObfuscatedName("ck.c")
    public int[] field1733;

    @ObfuscatedName("ck.o")
    public int field1770 = 0;

    @ObfuscatedName("ck.q")
    public int[] field1721;

    @ObfuscatedName("ck.w")
    public int[] field1722;

    @ObfuscatedName("ck.y")
    public int[] field1744;

    @ObfuscatedName("ck.p")
    public int[] field1724;

    @ObfuscatedName("ck.m")
    public int[] field1725;

    @ObfuscatedName("ck.a")
    public int[] field1726;

    @ObfuscatedName("ck.u")
    public byte[] field1727;

    @ObfuscatedName("ck.n")
    public byte[] field1728;

    @ObfuscatedName("ck.x")
    public byte[] field1729;

    @ObfuscatedName("ck.f")
    public short[] field1730;

    @ObfuscatedName("ck.v")
    public byte field1731 = 0;

    @ObfuscatedName("ck.s")
    public int field1732 = 0;

    @ObfuscatedName("ck.r")
    public int[] field1750;

    @ObfuscatedName("ck.j")
    public int[] field1734;

    @ObfuscatedName("ck.h")
    public int[] field1737;

    @ObfuscatedName("ck.d")
    public int[][] field1736;

    @ObfuscatedName("ck.l")
    public int[][] field1754;

    @ObfuscatedName("ck.ag")
    public boolean field1712 = false;

    @ObfuscatedName("ck.au")
    public int field1758;

    @ObfuscatedName("ck.ak")
    public int field1738;

    @ObfuscatedName("ck.aw")
    public int field1741;

    @ObfuscatedName("ck.at")
    public int field1760;

    @ObfuscatedName("ck.ah")
    public int field1743;

    @ObfuscatedName("ck.an")
    public static boolean[] field1752 = new boolean[4096];

    @ObfuscatedName("ck.as")
    public static boolean[] field1761 = new boolean[4096];

    @ObfuscatedName("ck.ap")
    public static int[] field1747 = new int[4096];

    @ObfuscatedName("ck.ai")
    public static int[] field1748 = new int[4096];

    @ObfuscatedName("ck.av")
    public static int[] field1749 = new int[4096];

    @ObfuscatedName("ck.ae")
    public static int[] field1717 = new int[4096];

    @ObfuscatedName("ck.ay")
    public static int[] field1763 = new int[4096];

    @ObfuscatedName("ck.ab")
    public static int[] field1723 = new int[4096];

    @ObfuscatedName("ck.ad")
    public static int[] field1739 = new int[1600];

    @ObfuscatedName("ck.ao")
    public static int[][] field1755 = new int[1600][512];

    @ObfuscatedName("ck.am")
    public static int[] field1756 = new int[12];

    @ObfuscatedName("ck.al")
    public static int[][] field1757 = new int[12][2000];

    @ObfuscatedName("ck.ac")
    public static int[] field1753 = new int[2000];

    @ObfuscatedName("ck.ax")
    public static int[] field1759 = new int[2000];

    @ObfuscatedName("ck.aa")
    public static int[] field1746 = new int[12];

    @ObfuscatedName("ck.aq")
    public static int[] field1766 = new int[10];

    @ObfuscatedName("ck.af")
    public static int[] field1762 = new int[10];

    @ObfuscatedName("ck.ar")
    public static int[] field1777 = new int[10];

    @ObfuscatedName("ck.bf")
    public static boolean field1767 = false;

    @ObfuscatedName("ck.bn")
    public static int field1768 = 0;

    @ObfuscatedName("ck.bi")
    public static int field1769 = 0;

    @ObfuscatedName("ck.bp")
    public static int field1740 = 0;

    @ObfuscatedName("ck.bh")
    public static int[] field1771 = new int[1000];

    @ObfuscatedName("ck.bq")
    public static int[] field1772 = class84.field1478;

    @ObfuscatedName("ck.bc")
    public static int[] field1773 = class84.field1489;

    @ObfuscatedName("ck.bw")
    public static int[] field1774 = class84.field1487;

    @ObfuscatedName("ck.bg")
    public static int[] field1775 = class84.field1476;

    public class98() {
    }

    public class98(class98[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1716 = 0;
        this.field1770 = 0;
        this.field1732 = 0;
        this.field1731 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class98 var8 = arg0[var7];
            if (var8 != null) {
                this.field1716 += var8.field1716;
                this.field1770 += var8.field1770;
                this.field1732 += var8.field1732;
                if (var8.field1727 == null) {
                    if (this.field1731 == -1) {
                        this.field1731 = var8.field1731;
                    }
                    if (this.field1731 != var8.field1731) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1728 != null;
                var5 |= var8.field1730 != null;
                var6 |= var8.field1729 != null;
            }
        }
        this.field1745 = new int[this.field1716];
        this.field1751 = new int[this.field1716];
        this.field1733 = new int[this.field1716];
        this.field1721 = new int[this.field1770];
        this.field1722 = new int[this.field1770];
        this.field1744 = new int[this.field1770];
        this.field1724 = new int[this.field1770];
        this.field1725 = new int[this.field1770];
        this.field1726 = new int[this.field1770];
        if (var3) {
            this.field1727 = new byte[this.field1770];
        }
        if (var4) {
            this.field1728 = new byte[this.field1770];
        }
        if (var5) {
            this.field1730 = new short[this.field1770];
        }
        if (var6) {
            this.field1729 = new byte[this.field1770];
        }
        if (this.field1732 > 0) {
            this.field1750 = new int[this.field1732];
            this.field1734 = new int[this.field1732];
            this.field1737 = new int[this.field1732];
        }
        this.field1716 = 0;
        this.field1770 = 0;
        this.field1732 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class98 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1770; var11++) {
                    this.field1721[this.field1770] = var10.field1721[var11] + this.field1716;
                    this.field1722[this.field1770] = var10.field1722[var11] + this.field1716;
                    this.field1744[this.field1770] = var10.field1744[var11] + this.field1716;
                    this.field1724[this.field1770] = var10.field1724[var11];
                    this.field1725[this.field1770] = var10.field1725[var11];
                    this.field1726[this.field1770] = var10.field1726[var11];
                    if (var3) {
                        if (var10.field1727 == null) {
                            this.field1727[this.field1770] = var10.field1731;
                        } else {
                            this.field1727[this.field1770] = var10.field1727[var11];
                        }
                    }
                    if (var4 && var10.field1728 != null) {
                        this.field1728[this.field1770] = var10.field1728[var11];
                    }
                    if (var5) {
                        if (var10.field1730 == null) {
                            this.field1730[this.field1770] = -1;
                        } else {
                            this.field1730[this.field1770] = var10.field1730[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1729 == null || var10.field1729[var11] == -1) {
                            this.field1729[this.field1770] = -1;
                        } else {
                            this.field1729[this.field1770] = (byte) (var10.field1729[var11] + this.field1732);
                        }
                    }
                    this.field1770++;
                }
                for (int var12 = 0; var12 < var10.field1732; var12++) {
                    this.field1750[this.field1732] = var10.field1750[var12] + this.field1716;
                    this.field1734[this.field1732] = var10.field1734[var12] + this.field1716;
                    this.field1737[this.field1732] = var10.field1737[var12] + this.field1716;
                    this.field1732++;
                }
                for (int var13 = 0; var13 < var10.field1716; var13++) {
                    this.field1745[this.field1716] = var10.field1745[var13];
                    this.field1751[this.field1716] = var10.field1751[var13];
                    this.field1733[this.field1716] = var10.field1733[var13];
                    this.field1716++;
                }
            }
        }
    }

    @ObfuscatedName("ck.k([[IIIIZI)Lck;")
    public class98 method1975(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1979();
        int var7 = arg1 - this.field1741;
        int var8 = this.field1741 + arg1;
        int var9 = arg3 - this.field1741;
        int var10 = this.field1741 + arg3;
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
            var15.field1716 = this.field1716;
            var15.field1770 = this.field1770;
            var15.field1732 = this.field1732;
            var15.field1745 = this.field1745;
            var15.field1733 = this.field1733;
            var15.field1721 = this.field1721;
            var15.field1722 = this.field1722;
            var15.field1744 = this.field1744;
            var15.field1724 = this.field1724;
            var15.field1725 = this.field1725;
            var15.field1726 = this.field1726;
            var15.field1727 = this.field1727;
            var15.field1728 = this.field1728;
            var15.field1729 = this.field1729;
            var15.field1730 = this.field1730;
            var15.field1731 = this.field1731;
            var15.field1750 = this.field1750;
            var15.field1734 = this.field1734;
            var15.field1737 = this.field1737;
            var15.field1736 = this.field1736;
            var15.field1754 = this.field1754;
            var15.field1712 = this.field1712;
            var15.field1751 = new int[var15.field1716];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1716; var16++) {
                int var17 = this.field1745[var16] + arg1;
                int var18 = this.field1733[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1751[var16] = this.field1751[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1716; var26++) {
                int var27 = (-this.field1751[var26] << 16) / this.field1353;
                if (var27 < arg5) {
                    int var28 = this.field1745[var26] + arg1;
                    int var29 = this.field1733[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1751[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1751[var26];
                }
            }
        }
        var15.field1758 = 0;
        return var15;
    }

    @ObfuscatedName("ck.e(Z)Lck;")
    public class98 method2001(boolean arg0) {
        if (!arg0 && field1713.length < this.field1770) {
            field1713 = new byte[this.field1770 + 100];
        }
        return this.method1978(arg0, field1720, field1713);
    }

    @ObfuscatedName("ck.i(Z)Lck;")
    public class98 method1977(boolean arg0) {
        if (!arg0 && field1715.length < this.field1770) {
            field1715 = new byte[this.field1770 + 100];
        }
        return this.method1978(arg0, field1714, field1715);
    }

    @ObfuscatedName("ck.t(ZLck;[B)Lck;")
    public class98 method1978(boolean arg0, class98 arg1, byte[] arg2) {
        arg1.field1716 = this.field1716;
        arg1.field1770 = this.field1770;
        arg1.field1732 = this.field1732;
        if (arg1.field1745 == null || arg1.field1745.length < this.field1716) {
            arg1.field1745 = new int[this.field1716 + 100];
            arg1.field1751 = new int[this.field1716 + 100];
            arg1.field1733 = new int[this.field1716 + 100];
        }
        for (int var4 = 0; var4 < this.field1716; var4++) {
            arg1.field1745[var4] = this.field1745[var4];
            arg1.field1751[var4] = this.field1751[var4];
            arg1.field1733[var4] = this.field1733[var4];
        }
        if (arg0) {
            arg1.field1728 = this.field1728;
        } else {
            arg1.field1728 = arg2;
            if (this.field1728 == null) {
                for (int var5 = 0; var5 < this.field1770; var5++) {
                    arg1.field1728[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1770; var6++) {
                    arg1.field1728[var6] = this.field1728[var6];
                }
            }
        }
        arg1.field1721 = this.field1721;
        arg1.field1722 = this.field1722;
        arg1.field1744 = this.field1744;
        arg1.field1724 = this.field1724;
        arg1.field1725 = this.field1725;
        arg1.field1726 = this.field1726;
        arg1.field1727 = this.field1727;
        arg1.field1729 = this.field1729;
        arg1.field1730 = this.field1730;
        arg1.field1731 = this.field1731;
        arg1.field1750 = this.field1750;
        arg1.field1734 = this.field1734;
        arg1.field1737 = this.field1737;
        arg1.field1736 = this.field1736;
        arg1.field1754 = this.field1754;
        arg1.field1712 = this.field1712;
        arg1.field1758 = 0;
        return arg1;
    }

    @ObfuscatedName("ck.z()V")
    public void method1979() {
        if (this.field1758 == 1) {
            return;
        }
        this.field1758 = 1;
        this.field1353 = 0;
        this.field1738 = 0;
        this.field1741 = 0;
        for (int var1 = 0; var1 < this.field1716; var1++) {
            int var2 = this.field1745[var1];
            int var3 = this.field1751[var1];
            int var4 = this.field1733[var1];
            if (-var3 > this.field1353) {
                this.field1353 = -var3;
            }
            if (var3 > this.field1738) {
                this.field1738 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1741) {
                this.field1741 = var5;
            }
        }
        this.field1741 = (int) (Math.sqrt((double) this.field1741) + 0.99D);
        this.field1743 = (int) (Math.sqrt((double) (this.field1353 * this.field1353 + this.field1741 * this.field1741)) + 0.99D);
        this.field1760 = this.field1743 + (int) (Math.sqrt((double) (this.field1741 * this.field1741 + this.field1738 * this.field1738)) + 0.99D);
    }

    @ObfuscatedName("ck.g()V")
    public void method1980() {
        if (this.field1758 == 2) {
            return;
        }
        this.field1758 = 2;
        this.field1741 = 0;
        for (int var1 = 0; var1 < this.field1716; var1++) {
            int var2 = this.field1745[var1];
            int var3 = this.field1751[var1];
            int var4 = this.field1733[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1741) {
                this.field1741 = var5;
            }
        }
        this.field1741 = (int) (Math.sqrt((double) this.field1741) + 0.99D);
        this.field1743 = this.field1741;
        this.field1760 = this.field1741 + this.field1741;
    }

    @ObfuscatedName("ck.q()I")
    public int method1981() {
        this.method1979();
        return this.field1741;
    }

    @ObfuscatedName("ck.w(Lcm;I)V")
    public void method1982(class96 arg0, int arg1) {
        if (this.field1736 == null || arg1 == -1) {
            return;
        }
        class81 var3 = arg0.field1687[arg1];
        class95 var4 = var3.field1435;
        Statics.field1764 = 0;
        Statics.field1765 = 0;
        Statics.field1735 = 0;
        for (int var5 = 0; var5 < var3.field1439; var5++) {
            int var6 = var3.field1440[var5];
            this.method2003(var4.field1669[var6], var4.field1678[var6], var3.field1442[var5], var3.field1443[var5], var3.field1438[var5]);
        }
        this.field1758 = 0;
    }

    @ObfuscatedName("ck.y(Lcm;ILcm;I[I)V")
    public void method1983(class96 arg0, int arg1, class96 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1982(arg0, arg1);
            return;
        }
        class81 var6 = arg0.field1687[arg1];
        class81 var7 = arg2.field1687[arg3];
        class95 var8 = var6.field1435;
        Statics.field1764 = 0;
        Statics.field1765 = 0;
        Statics.field1735 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1439; var11++) {
            int var12 = var6.field1440[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1669[var12] == 0) {
                this.method2003(var8.field1669[var12], var8.field1678[var12], var6.field1442[var11], var6.field1443[var11], var6.field1438[var11]);
            }
        }
        Statics.field1764 = 0;
        Statics.field1765 = 0;
        Statics.field1735 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1439; var15++) {
            int var16 = var7.field1440[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1669[var16] == 0) {
                this.method2003(var8.field1669[var16], var8.field1678[var16], var7.field1442[var15], var7.field1443[var15], var7.field1438[var15]);
            }
        }
        this.field1758 = 0;
    }

    @ObfuscatedName("ck.p(I[IIII)V")
    public void method2003(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1764 = 0;
            Statics.field1765 = 0;
            Statics.field1735 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1736.length) {
                    int[] var10 = this.field1736[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1764 += this.field1745[var12];
                        Statics.field1765 += this.field1751[var12];
                        Statics.field1735 += this.field1733[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1764 = Statics.field1764 / var7 + arg2;
                Statics.field1765 = Statics.field1765 / var7 + arg3;
                Statics.field1735 = Statics.field1735 / var7 + arg4;
            } else {
                Statics.field1764 = arg2;
                Statics.field1765 = arg3;
                Statics.field1735 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1736.length) {
                    int[] var15 = this.field1736[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1745[var17] += arg2;
                        this.field1751[var17] += arg3;
                        this.field1733[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1736.length) {
                    int[] var20 = this.field1736[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1745[var22] -= Statics.field1764;
                        this.field1751[var22] -= Statics.field1765;
                        this.field1733[var22] -= Statics.field1735;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1772[var25];
                            int var27 = field1773[var25];
                            int var28 = this.field1751[var22] * var26 + this.field1745[var22] * var27 >> 16;
                            this.field1751[var22] = this.field1751[var22] * var27 - this.field1745[var22] * var26 >> 16;
                            this.field1745[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1772[var23];
                            int var30 = field1773[var23];
                            int var31 = this.field1751[var22] * var30 - this.field1733[var22] * var29 >> 16;
                            this.field1733[var22] = this.field1751[var22] * var29 + this.field1733[var22] * var30 >> 16;
                            this.field1751[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1772[var24];
                            int var33 = field1773[var24];
                            int var34 = this.field1745[var22] * var33 + this.field1733[var22] * var32 >> 16;
                            this.field1733[var22] = this.field1733[var22] * var33 - this.field1745[var22] * var32 >> 16;
                            this.field1745[var22] = var34;
                        }
                        this.field1745[var22] += Statics.field1764;
                        this.field1751[var22] += Statics.field1765;
                        this.field1733[var22] += Statics.field1735;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1736.length) {
                    int[] var37 = this.field1736[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1745[var39] -= Statics.field1764;
                        this.field1751[var39] -= Statics.field1765;
                        this.field1733[var39] -= Statics.field1735;
                        this.field1745[var39] = this.field1745[var39] * arg2 / 128;
                        this.field1751[var39] = this.field1751[var39] * arg3 / 128;
                        this.field1733[var39] = this.field1733[var39] * arg4 / 128;
                        this.field1745[var39] += Statics.field1764;
                        this.field1751[var39] += Statics.field1765;
                        this.field1733[var39] += Statics.field1735;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1754 != null && this.field1728 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1754.length) {
                    int[] var42 = this.field1754[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1728[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1728[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ck.m()V")
    public void method1984() {
        for (int var1 = 0; var1 < this.field1716; var1++) {
            int var2 = this.field1745[var1];
            this.field1745[var1] = this.field1733[var1];
            this.field1733[var1] = -var2;
        }
        this.field1758 = 0;
    }

    @ObfuscatedName("ck.a()V")
    public void method2043() {
        for (int var1 = 0; var1 < this.field1716; var1++) {
            this.field1745[var1] = -this.field1745[var1];
            this.field1733[var1] = -this.field1733[var1];
        }
        this.field1758 = 0;
    }

    @ObfuscatedName("ck.u()V")
    public void method2041() {
        for (int var1 = 0; var1 < this.field1716; var1++) {
            int var2 = this.field1733[var1];
            this.field1733[var1] = this.field1745[var1];
            this.field1745[var1] = -var2;
        }
        this.field1758 = 0;
    }

    @ObfuscatedName("ck.n(I)V")
    public void method1994(int arg0) {
        int var2 = field1772[arg0];
        int var3 = field1773[arg0];
        for (int var4 = 0; var4 < this.field1716; var4++) {
            int var5 = this.field1751[var4] * var3 - this.field1733[var4] * var2 >> 16;
            this.field1733[var4] = this.field1751[var4] * var2 + this.field1733[var4] * var3 >> 16;
            this.field1751[var4] = var5;
        }
        this.field1758 = 0;
    }

    @ObfuscatedName("ck.x(III)V")
    public void method1987(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1716; var4++) {
            this.field1745[var4] += arg0;
            this.field1751[var4] += arg1;
            this.field1733[var4] += arg2;
        }
        this.field1758 = 0;
    }

    @ObfuscatedName("ck.f(III)V")
    public void method2020(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1716; var4++) {
            this.field1745[var4] = this.field1745[var4] * arg0 / 128;
            this.field1751[var4] = this.field1751[var4] * arg1 / 128;
            this.field1733[var4] = this.field1733[var4] * arg2 / 128;
        }
        this.field1758 = 0;
    }

    @ObfuscatedName("ck.h(IIIIIII)V")
    public final void method2036(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1739[0] = -1;
        if (this.field1758 != 2 && this.field1758 != 1) {
            this.method1980();
        }
        int var8 = Statics.field1475;
        int var9 = Statics.field1473;
        int var10 = field1772[arg0];
        int var11 = field1773[arg0];
        int var12 = field1772[arg1];
        int var13 = field1773[arg1];
        int var14 = field1772[arg2];
        int var15 = field1773[arg2];
        int var16 = field1772[arg3];
        int var17 = field1773[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1716; var19++) {
            int var20 = this.field1745[var19];
            int var21 = this.field1751[var19];
            int var22 = this.field1733[var19];
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
            field1749[var19] = var30 - var18;
            field1747[var19] = (var26 << 9) / var30 + var8;
            field1748[var19] = (var29 << 9) / var30 + var9;
            if (this.field1732 > 0) {
                field1717[var19] = var26;
                field1763[var19] = var29;
                field1723[var19] = var30;
            }
        }
        try {
            this.method1991(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ck.d(IIIIIIII)V")
    public final void method1988(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1739[0] = -1;
        if (this.field1758 != 2 && this.field1758 != 1) {
            this.method1980();
        }
        int var9 = Statics.field1475;
        int var10 = Statics.field1473;
        int var11 = field1772[arg0];
        int var12 = field1773[arg0];
        int var13 = field1772[arg1];
        int var14 = field1773[arg1];
        int var15 = field1772[arg2];
        int var16 = field1773[arg2];
        int var17 = field1772[arg3];
        int var18 = field1773[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1716; var20++) {
            int var21 = this.field1745[var20];
            int var22 = this.field1751[var20];
            int var23 = this.field1733[var20];
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
            field1749[var20] = var31 - var19;
            field1747[var20] = (var27 << 9) / arg7 + var9;
            field1748[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1732 > 0) {
                field1717[var20] = var27;
                field1763[var20] = var30;
                field1723[var20] = var31;
            }
        }
        try {
            this.method1991(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ck.v(IIIIIIIII)V")
    public void method1588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1739[0] = -1;
        if (this.field1758 != 1) {
            this.method1979();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1741 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1741 << 9;
        if (var15 / var13 >= Statics.field1480) {
            return;
        }
        int var16 = this.field1741 + var14 << 9;
        if (var16 / var13 <= Statics.field1479) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1741 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1481) {
            return;
        }
        int var20 = (this.field1353 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1471) {
            return;
        }
        int var22 = (this.field1353 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1732 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1767) {
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
            int var32 = field1768 - Statics.field1475;
            int var33 = field1769 - Statics.field1473;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1712) {
                    field1771[field1740++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1475;
        int var35 = Statics.field1473;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1772[arg0];
            var37 = field1773[arg0];
        }
        for (int var38 = 0; var38 < this.field1716; var38++) {
            int var39 = this.field1745[var38];
            int var40 = this.field1751[var38];
            int var41 = this.field1733[var38];
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
            field1749[var38] = var50 - var11;
            if (var50 >= 50) {
                field1747[var38] = (var46 << 9) / var50 + var34;
                field1748[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1747[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1717[var38] = var46;
                field1763[var38] = var49;
                field1723[var38] = var50;
            }
        }
        try {
            this.method1991(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("ck.l(ZZI)V")
    public final void method1991(boolean arg0, boolean arg1, int arg2) {
        if (this.field1760 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1760; var4++) {
            field1739[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1770; var5++) {
            if (this.field1726[var5] != -2) {
                int var6 = this.field1721[var5];
                int var7 = this.field1722[var5];
                int var8 = this.field1744[var5];
                int var9 = field1747[var6];
                int var10 = field1747[var7];
                int var11 = field1747[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1717[var6];
                    int var13 = field1717[var7];
                    int var14 = field1717[var8];
                    int var15 = field1763[var6];
                    int var16 = field1763[var7];
                    int var17 = field1763[var8];
                    int var18 = field1723[var6];
                    int var19 = field1723[var7];
                    int var20 = field1723[var8];
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
                        field1761[var5] = true;
                        int var30 = (field1749[var6] + field1749[var7] + field1749[var8]) / 3 + this.field1743;
                        field1755[var30][field1739[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2013(field1768, field1769, field1748[var6], field1748[var7], field1748[var8], var9, var10, var11)) {
                        field1771[field1740++] = arg2;
                        arg1 = false;
                    }
                    if ((field1748[var8] - field1748[var7]) * (var9 - var10) - (field1748[var6] - field1748[var7]) * (var11 - var10) > 0) {
                        field1761[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1477 && var10 <= Statics.field1477 && var11 <= Statics.field1477) {
                            field1752[var5] = false;
                        } else {
                            field1752[var5] = true;
                        }
                        int var31 = (field1749[var6] + field1749[var7] + field1749[var8]) / 3 + this.field1743;
                        field1755[var31][field1739[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1727 == null) {
            for (int var32 = this.field1760 - 1; var32 >= 0; var32--) {
                int var33 = field1739[var32];
                if (var33 > 0) {
                    int[] var34 = field1755[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method1992(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1756[var36] = 0;
            field1746[var36] = 0;
        }
        for (int var37 = this.field1760 - 1; var37 >= 0; var37--) {
            int var38 = field1739[var37];
            if (var38 > 0) {
                int[] var39 = field1755[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1727[var41];
                    int var43 = field1756[var42]++;
                    field1757[var42][var43] = var41;
                    if (var42 < 10) {
                        field1746[var42] += var37;
                    } else if (var42 == 10) {
                        field1753[var43] = var37;
                    } else {
                        field1759[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1756[1] > 0 || field1756[2] > 0) {
            var44 = (field1746[1] + field1746[2]) / (field1756[1] + field1756[2]);
        }
        int var45 = 0;
        if (field1756[3] > 0 || field1756[4] > 0) {
            var45 = (field1746[3] + field1746[4]) / (field1756[3] + field1756[4]);
        }
        int var46 = 0;
        if (field1756[6] > 0 || field1756[8] > 0) {
            var46 = (field1746[6] + field1746[8]) / (field1756[6] + field1756[8]);
        }
        int var47 = 0;
        int var48 = field1756[10];
        int[] var49 = field1757[10];
        int[] var50 = field1753;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1756[11];
            var49 = field1757[11];
            var50 = field1759;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method1992(var49[var47++]);
                if (var47 == var48 && field1757[11] != var49) {
                    var47 = 0;
                    var48 = field1756[11];
                    var49 = field1757[11];
                    var50 = field1759;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method1992(var49[var47++]);
                if (var47 == var48 && field1757[11] != var49) {
                    var47 = 0;
                    var48 = field1756[11];
                    var49 = field1757[11];
                    var50 = field1759;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method1992(var49[var47++]);
                if (var47 == var48 && field1757[11] != var49) {
                    var47 = 0;
                    var48 = field1756[11];
                    var49 = field1757[11];
                    var50 = field1759;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1756[var52];
            int[] var54 = field1757[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method1992(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method1992(var49[var47++]);
            if (var47 == var48 && field1757[11] != var49) {
                var47 = 0;
                var49 = field1757[11];
                var48 = field1756[11];
                var50 = field1759;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("ck.ag(I)V")
    public final void method1992(int arg0) {
        if (field1761[arg0]) {
            this.method1993(arg0);
            return;
        }
        int var2 = this.field1721[arg0];
        int var3 = this.field1722[arg0];
        int var4 = this.field1744[arg0];
        class84.field1482 = field1752[arg0];
        if (this.field1728 == null) {
            class84.field1469 = 0;
        } else {
            class84.field1469 = this.field1728[arg0] & 0xFF;
        }
        if (this.field1730 != null && this.field1730[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1729 == null || this.field1729[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1729[arg0] & 0xFF;
                var6 = this.field1750[var5];
                var7 = this.field1734[var5];
                var8 = this.field1737[var5];
            }
            if (this.field1726[arg0] == -1) {
                class84.method1775(field1748[var2], field1748[var3], field1748[var4], field1747[var2], field1747[var3], field1747[var4], this.field1724[arg0], this.field1724[arg0], this.field1724[arg0], field1717[var6], field1717[var7], field1717[var8], field1763[var6], field1763[var7], field1763[var8], field1723[var6], field1723[var7], field1723[var8], this.field1730[arg0]);
            } else {
                class84.method1775(field1748[var2], field1748[var3], field1748[var4], field1747[var2], field1747[var3], field1747[var4], this.field1724[arg0], this.field1725[arg0], this.field1726[arg0], field1717[var6], field1717[var7], field1717[var8], field1763[var6], field1763[var7], field1763[var8], field1723[var6], field1723[var7], field1723[var8], this.field1730[arg0]);
            }
        } else if (this.field1726[arg0] == -1) {
            class84.method1787(field1748[var2], field1748[var3], field1748[var4], field1747[var2], field1747[var3], field1747[var4], field1774[this.field1724[arg0]]);
        } else {
            class84.method1785(field1748[var2], field1748[var3], field1748[var4], field1747[var2], field1747[var3], field1747[var4], this.field1724[arg0], this.field1725[arg0], this.field1726[arg0]);
        }
    }

    @ObfuscatedName("ck.au(I)V")
    public final void method1993(int arg0) {
        int var2 = Statics.field1475;
        int var3 = Statics.field1473;
        int var4 = 0;
        int var5 = this.field1721[arg0];
        int var6 = this.field1722[arg0];
        int var7 = this.field1744[arg0];
        int var8 = field1723[var5];
        int var9 = field1723[var6];
        int var10 = field1723[var7];
        if (this.field1728 == null) {
            class84.field1469 = 0;
        } else {
            class84.field1469 = this.field1728[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1766[var4] = field1747[var5];
            field1762[var4] = field1748[var5];
            field1777[var4++] = this.field1724[arg0];
        } else {
            int var11 = field1717[var5];
            int var12 = field1763[var5];
            int var13 = this.field1724[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1775[var10 - var8];
                field1766[var4] = (((field1717[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1762[var4] = (((field1763[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1777[var4++] = ((this.field1726[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1775[var9 - var8];
                field1766[var4] = (((field1717[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1762[var4] = (((field1763[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1777[var4++] = ((this.field1725[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1766[var4] = field1747[var6];
            field1762[var4] = field1748[var6];
            field1777[var4++] = this.field1725[arg0];
        } else {
            int var16 = field1717[var6];
            int var17 = field1763[var6];
            int var18 = this.field1725[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1775[var8 - var9];
                field1766[var4] = (((field1717[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1762[var4] = (((field1763[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1777[var4++] = ((this.field1724[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1775[var10 - var9];
                field1766[var4] = (((field1717[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1762[var4] = (((field1763[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1777[var4++] = ((this.field1726[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1766[var4] = field1747[var7];
            field1762[var4] = field1748[var7];
            field1777[var4++] = this.field1726[arg0];
        } else {
            int var21 = field1717[var7];
            int var22 = field1763[var7];
            int var23 = this.field1726[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1775[var9 - var10];
                field1766[var4] = (((field1717[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1762[var4] = (((field1763[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1777[var4++] = ((this.field1725[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1775[var8 - var10];
                field1766[var4] = (((field1717[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1762[var4] = (((field1763[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1777[var4++] = ((this.field1724[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1766[0];
        int var27 = field1766[1];
        int var28 = field1766[2];
        int var29 = field1762[0];
        int var30 = field1762[1];
        int var31 = field1762[2];
        class84.field1482 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1477 || var27 > Statics.field1477 || var28 > Statics.field1477) {
                class84.field1482 = true;
            }
            if (this.field1730 != null && this.field1730[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1729 == null || this.field1729[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1729[arg0] & 0xFF;
                    var33 = this.field1750[var32];
                    var34 = this.field1734[var32];
                    var35 = this.field1737[var32];
                }
                if (this.field1726[arg0] == -1) {
                    class84.method1775(var29, var30, var31, var26, var27, var28, this.field1724[arg0], this.field1724[arg0], this.field1724[arg0], field1717[var33], field1717[var34], field1717[var35], field1763[var33], field1763[var34], field1763[var35], field1723[var33], field1723[var34], field1723[var35], this.field1730[arg0]);
                } else {
                    class84.method1775(var29, var30, var31, var26, var27, var28, field1777[0], field1777[1], field1777[2], field1717[var33], field1717[var34], field1717[var35], field1763[var33], field1763[var34], field1763[var35], field1723[var33], field1723[var34], field1723[var35], this.field1730[arg0]);
                }
            } else if (this.field1726[arg0] == -1) {
                class84.method1787(var29, var30, var31, var26, var27, var28, field1774[this.field1724[arg0]]);
            } else {
                class84.method1785(var29, var30, var31, var26, var27, var28, field1777[0], field1777[1], field1777[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1477 || var27 > Statics.field1477 || var28 > Statics.field1477 || field1766[3] < 0 || field1766[3] > Statics.field1477) {
            class84.field1482 = true;
        }
        if (this.field1730 != null && this.field1730[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1729 == null || this.field1729[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1729[arg0] & 0xFF;
                var37 = this.field1750[var36];
                var38 = this.field1734[var36];
                var39 = this.field1737[var36];
            }
            short var40 = this.field1730[arg0];
            if (this.field1726[arg0] == -1) {
                class84.method1775(var29, var30, var31, var26, var27, var28, this.field1724[arg0], this.field1724[arg0], this.field1724[arg0], field1717[var37], field1717[var38], field1717[var39], field1763[var37], field1763[var38], field1763[var39], field1723[var37], field1723[var38], field1723[var39], var40);
                class84.method1775(var29, var31, field1762[3], var26, var28, field1766[3], this.field1724[arg0], this.field1724[arg0], this.field1724[arg0], field1717[var37], field1717[var38], field1717[var39], field1763[var37], field1763[var38], field1763[var39], field1723[var37], field1723[var38], field1723[var39], var40);
            } else {
                class84.method1775(var29, var30, var31, var26, var27, var28, field1777[0], field1777[1], field1777[2], field1717[var37], field1717[var38], field1717[var39], field1763[var37], field1763[var38], field1763[var39], field1723[var37], field1723[var38], field1723[var39], var40);
                class84.method1775(var29, var31, field1762[3], var26, var28, field1766[3], field1777[0], field1777[2], field1777[3], field1717[var37], field1717[var38], field1717[var39], field1763[var37], field1763[var38], field1763[var39], field1723[var37], field1723[var38], field1723[var39], var40);
            }
        } else if (this.field1726[arg0] == -1) {
            int var41 = field1774[this.field1724[arg0]];
            class84.method1787(var29, var30, var31, var26, var27, var28, var41);
            class84.method1787(var29, var31, field1762[3], var26, var28, field1766[3], var41);
        } else {
            class84.method1785(var29, var30, var31, var26, var27, var28, field1777[0], field1777[1], field1777[2]);
            class84.method1785(var29, var31, field1762[3], var26, var28, field1766[3], field1777[0], field1777[2], field1777[3]);
        }
    }

    @ObfuscatedName("ck.ak(IIIIIIII)Z")
    public final boolean method2013(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
