package deob;

@ObfuscatedName("cz")
public class class98 extends class78 {

    @ObfuscatedName("cz.y")
    public static class98 field1731 = new class98();

    @ObfuscatedName("cz.u")
    public static byte[] field1748 = new byte[1];

    @ObfuscatedName("cz.k")
    public static class98 field1704 = new class98();

    @ObfuscatedName("cz.v")
    public static byte[] field1705 = new byte[1];

    @ObfuscatedName("cz.l")
    public int field1706 = 0;

    @ObfuscatedName("cz.g")
    public int[] field1707;

    @ObfuscatedName("cz.a")
    public int[] field1708;

    @ObfuscatedName("cz.x")
    public int[] field1709;

    @ObfuscatedName("cz.r")
    public int field1710 = 0;

    @ObfuscatedName("cz.w")
    public int[] field1750;

    @ObfuscatedName("cz.c")
    public int[] field1712;

    @ObfuscatedName("cz.f")
    public int[] field1764;

    @ObfuscatedName("cz.o")
    public int[] field1714;

    @ObfuscatedName("cz.p")
    public int[] field1715;

    @ObfuscatedName("cz.n")
    public int[] field1757;

    @ObfuscatedName("cz.m")
    public byte[] field1717;

    @ObfuscatedName("cz.s")
    public byte[] field1718;

    @ObfuscatedName("cz.t")
    public byte[] field1721;

    @ObfuscatedName("cz.j")
    public short[] field1725;

    @ObfuscatedName("cz.b")
    public byte field1749 = 0;

    @ObfuscatedName("cz.i")
    public int field1722 = 0;

    @ObfuscatedName("cz.h")
    public int[] field1747;

    @ObfuscatedName("cz.q")
    public int[] field1724;

    @ObfuscatedName("cz.d")
    public int[] field1719;

    @ObfuscatedName("cz.z")
    public int[][] field1726;

    @ObfuscatedName("cz.e")
    public int[][] field1733;

    @ObfuscatedName("cz.av")
    public boolean field1728 = false;

    @ObfuscatedName("cz.al")
    public int field1729;

    @ObfuscatedName("cz.aq")
    public int field1730;

    @ObfuscatedName("cz.aa")
    public int field1703;

    @ObfuscatedName("cz.ah")
    public int field1732;

    @ObfuscatedName("cz.au")
    public int field1768;

    @ObfuscatedName("cz.ab")
    public static boolean[] field1711 = new boolean[4096];

    @ObfuscatedName("cz.ag")
    public static boolean[] field1736 = new boolean[4096];

    @ObfuscatedName("cz.ax")
    public static int[] field1753 = new int[4096];

    @ObfuscatedName("cz.af")
    public static int[] field1738 = new int[4096];

    @ObfuscatedName("cz.ao")
    public static int[] field1739 = new int[4096];

    @ObfuscatedName("cz.ac")
    public static int[] field1745 = new int[4096];

    @ObfuscatedName("cz.aj")
    public static int[] field1765 = new int[4096];

    @ObfuscatedName("cz.ap")
    public static int[] field1742 = new int[4096];

    @ObfuscatedName("cz.at")
    public static int[] field1744 = new int[1600];

    @ObfuscatedName("cz.as")
    public static int[][] field1754 = new int[1600][512];

    @ObfuscatedName("cz.aw")
    public static int[] field1746 = new int[12];

    @ObfuscatedName("cz.ak")
    public static int[][] field1716 = new int[12][2000];

    @ObfuscatedName("cz.az")
    public static int[] field1720 = new int[2000];

    @ObfuscatedName("cz.ay")
    public static int[] field1702 = new int[2000];

    @ObfuscatedName("cz.ad")
    public static int[] field1723 = new int[12];

    @ObfuscatedName("cz.ar")
    public static int[] field1751 = new int[10];

    @ObfuscatedName("cz.an")
    public static int[] field1752 = new int[10];

    @ObfuscatedName("cz.am")
    public static int[] field1727 = new int[10];

    @ObfuscatedName("cz.bh")
    public static boolean field1713 = false;

    @ObfuscatedName("cz.bd")
    public static int field1758 = 0;

    @ObfuscatedName("cz.bn")
    public static int field1759 = 0;

    @ObfuscatedName("cz.bm")
    public static int field1760 = 0;

    @ObfuscatedName("cz.ba")
    public static int[] field1761 = new int[1000];

    @ObfuscatedName("cz.bp")
    public static int[] field1762 = class84.field1472;

    @ObfuscatedName("cz.bt")
    public static int[] field1763 = class84.field1449;

    @ObfuscatedName("cz.bz")
    public static int[] field1741 = class84.field1468;

    @ObfuscatedName("cz.bf")
    public static int[] field1756 = class84.field1471;

    public class98() {
    }

    public class98(class98[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1706 = 0;
        this.field1710 = 0;
        this.field1722 = 0;
        this.field1749 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class98 var8 = arg0[var7];
            if (var8 != null) {
                this.field1706 += var8.field1706;
                this.field1710 += var8.field1710;
                this.field1722 += var8.field1722;
                if (var8.field1717 == null) {
                    if (this.field1749 == -1) {
                        this.field1749 = var8.field1749;
                    }
                    if (this.field1749 != var8.field1749) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1718 != null;
                var5 |= var8.field1725 != null;
                var6 |= var8.field1721 != null;
            }
        }
        this.field1707 = new int[this.field1706];
        this.field1708 = new int[this.field1706];
        this.field1709 = new int[this.field1706];
        this.field1750 = new int[this.field1710];
        this.field1712 = new int[this.field1710];
        this.field1764 = new int[this.field1710];
        this.field1714 = new int[this.field1710];
        this.field1715 = new int[this.field1710];
        this.field1757 = new int[this.field1710];
        if (var3) {
            this.field1717 = new byte[this.field1710];
        }
        if (var4) {
            this.field1718 = new byte[this.field1710];
        }
        if (var5) {
            this.field1725 = new short[this.field1710];
        }
        if (var6) {
            this.field1721 = new byte[this.field1710];
        }
        if (this.field1722 > 0) {
            this.field1747 = new int[this.field1722];
            this.field1724 = new int[this.field1722];
            this.field1719 = new int[this.field1722];
        }
        this.field1706 = 0;
        this.field1710 = 0;
        this.field1722 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class98 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1710; var11++) {
                    this.field1750[this.field1710] = var10.field1750[var11] + this.field1706;
                    this.field1712[this.field1710] = var10.field1712[var11] + this.field1706;
                    this.field1764[this.field1710] = var10.field1764[var11] + this.field1706;
                    this.field1714[this.field1710] = var10.field1714[var11];
                    this.field1715[this.field1710] = var10.field1715[var11];
                    this.field1757[this.field1710] = var10.field1757[var11];
                    if (var3) {
                        if (var10.field1717 == null) {
                            this.field1717[this.field1710] = var10.field1749;
                        } else {
                            this.field1717[this.field1710] = var10.field1717[var11];
                        }
                    }
                    if (var4 && var10.field1718 != null) {
                        this.field1718[this.field1710] = var10.field1718[var11];
                    }
                    if (var5) {
                        if (var10.field1725 == null) {
                            this.field1725[this.field1710] = -1;
                        } else {
                            this.field1725[this.field1710] = var10.field1725[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1721 == null || var10.field1721[var11] == -1) {
                            this.field1721[this.field1710] = -1;
                        } else {
                            this.field1721[this.field1710] = (byte) (var10.field1721[var11] + this.field1722);
                        }
                    }
                    this.field1710++;
                }
                for (int var12 = 0; var12 < var10.field1722; var12++) {
                    this.field1747[this.field1722] = var10.field1747[var12] + this.field1706;
                    this.field1724[this.field1722] = var10.field1724[var12] + this.field1706;
                    this.field1719[this.field1722] = var10.field1719[var12] + this.field1706;
                    this.field1722++;
                }
                for (int var13 = 0; var13 < var10.field1706; var13++) {
                    this.field1707[this.field1706] = var10.field1707[var13];
                    this.field1708[this.field1706] = var10.field1708[var13];
                    this.field1709[this.field1706] = var10.field1709[var13];
                    this.field1706++;
                }
            }
        }
    }

    @ObfuscatedName("cz.y([[IIIIZI)Lcz;")
    public class98 method1976(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1966();
        int var7 = arg1 - this.field1703;
        int var8 = this.field1703 + arg1;
        int var9 = arg3 - this.field1703;
        int var10 = this.field1703 + arg3;
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
            var15.field1706 = this.field1706;
            var15.field1710 = this.field1710;
            var15.field1722 = this.field1722;
            var15.field1707 = this.field1707;
            var15.field1709 = this.field1709;
            var15.field1750 = this.field1750;
            var15.field1712 = this.field1712;
            var15.field1764 = this.field1764;
            var15.field1714 = this.field1714;
            var15.field1715 = this.field1715;
            var15.field1757 = this.field1757;
            var15.field1717 = this.field1717;
            var15.field1718 = this.field1718;
            var15.field1721 = this.field1721;
            var15.field1725 = this.field1725;
            var15.field1749 = this.field1749;
            var15.field1747 = this.field1747;
            var15.field1724 = this.field1724;
            var15.field1719 = this.field1719;
            var15.field1726 = this.field1726;
            var15.field1733 = this.field1733;
            var15.field1728 = this.field1728;
            var15.field1708 = new int[var15.field1706];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1706; var16++) {
                int var17 = this.field1707[var16] + arg1;
                int var18 = this.field1709[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1708[var16] = this.field1708[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1706; var26++) {
                int var27 = (-this.field1708[var26] << 16) / this.field1344;
                if (var27 < arg5) {
                    int var28 = this.field1707[var26] + arg1;
                    int var29 = this.field1709[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1708[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1708[var26];
                }
            }
        }
        var15.field1729 = 0;
        return var15;
    }

    @ObfuscatedName("cz.k(Z)Lcz;")
    public class98 method1987(boolean arg0) {
        if (!arg0 && field1748.length < this.field1710) {
            field1748 = new byte[this.field1710 + 100];
        }
        return this.method1965(arg0, field1731, field1748);
    }

    @ObfuscatedName("cz.v(Z)Lcz;")
    public class98 method1964(boolean arg0) {
        if (!arg0 && field1705.length < this.field1710) {
            field1705 = new byte[this.field1710 + 100];
        }
        return this.method1965(arg0, field1704, field1705);
    }

    @ObfuscatedName("cz.g(ZLcz;[B)Lcz;")
    public class98 method1965(boolean arg0, class98 arg1, byte[] arg2) {
        arg1.field1706 = this.field1706;
        arg1.field1710 = this.field1710;
        arg1.field1722 = this.field1722;
        if (arg1.field1707 == null || arg1.field1707.length < this.field1706) {
            arg1.field1707 = new int[this.field1706 + 100];
            arg1.field1708 = new int[this.field1706 + 100];
            arg1.field1709 = new int[this.field1706 + 100];
        }
        for (int var4 = 0; var4 < this.field1706; var4++) {
            arg1.field1707[var4] = this.field1707[var4];
            arg1.field1708[var4] = this.field1708[var4];
            arg1.field1709[var4] = this.field1709[var4];
        }
        if (arg0) {
            arg1.field1718 = this.field1718;
        } else {
            arg1.field1718 = arg2;
            if (this.field1718 == null) {
                for (int var5 = 0; var5 < this.field1710; var5++) {
                    arg1.field1718[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1710; var6++) {
                    arg1.field1718[var6] = this.field1718[var6];
                }
            }
        }
        arg1.field1750 = this.field1750;
        arg1.field1712 = this.field1712;
        arg1.field1764 = this.field1764;
        arg1.field1714 = this.field1714;
        arg1.field1715 = this.field1715;
        arg1.field1757 = this.field1757;
        arg1.field1717 = this.field1717;
        arg1.field1721 = this.field1721;
        arg1.field1725 = this.field1725;
        arg1.field1749 = this.field1749;
        arg1.field1747 = this.field1747;
        arg1.field1724 = this.field1724;
        arg1.field1719 = this.field1719;
        arg1.field1726 = this.field1726;
        arg1.field1733 = this.field1733;
        arg1.field1728 = this.field1728;
        arg1.field1729 = 0;
        return arg1;
    }

    @ObfuscatedName("cz.a()V")
    public void method1966() {
        if (this.field1729 == 1) {
            return;
        }
        this.field1729 = 1;
        this.field1344 = 0;
        this.field1730 = 0;
        this.field1703 = 0;
        for (int var1 = 0; var1 < this.field1706; var1++) {
            int var2 = this.field1707[var1];
            int var3 = this.field1708[var1];
            int var4 = this.field1709[var1];
            if (-var3 > this.field1344) {
                this.field1344 = -var3;
            }
            if (var3 > this.field1730) {
                this.field1730 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1703) {
                this.field1703 = var5;
            }
        }
        this.field1703 = (int) (Math.sqrt((double) this.field1703) + 0.99D);
        this.field1768 = (int) (Math.sqrt((double) (this.field1344 * this.field1344 + this.field1703 * this.field1703)) + 0.99D);
        this.field1732 = this.field1768 + (int) (Math.sqrt((double) (this.field1730 * this.field1730 + this.field1703 * this.field1703)) + 0.99D);
    }

    @ObfuscatedName("cz.x()V")
    public void method1967() {
        if (this.field1729 == 2) {
            return;
        }
        this.field1729 = 2;
        this.field1703 = 0;
        for (int var1 = 0; var1 < this.field1706; var1++) {
            int var2 = this.field1707[var1];
            int var3 = this.field1708[var1];
            int var4 = this.field1709[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1703) {
                this.field1703 = var5;
            }
        }
        this.field1703 = (int) (Math.sqrt((double) this.field1703) + 0.99D);
        this.field1768 = this.field1703;
        this.field1732 = this.field1703 + this.field1703;
    }

    @ObfuscatedName("cz.r()I")
    public int method2000() {
        this.method1966();
        return this.field1703;
    }

    @ObfuscatedName("cz.w(Lcb;I)V")
    public void method2020(class96 arg0, int arg1) {
        if (this.field1726 == null || arg1 == -1) {
            return;
        }
        class81 var3 = arg0.field1672[arg1];
        class95 var4 = var3.field1423;
        Statics.field1737 = 0;
        Statics.field1755 = 0;
        Statics.field1740 = 0;
        for (int var5 = 0; var5 < var3.field1424; var5++) {
            int var6 = var3.field1422[var5];
            this.method1971(var4.field1658[var6], var4.field1660[var6], var3.field1426[var5], var3.field1429[var5], var3.field1425[var5]);
        }
        this.field1729 = 0;
    }

    @ObfuscatedName("cz.c(Lcb;ILcb;I[I)V")
    public void method1970(class96 arg0, int arg1, class96 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2020(arg0, arg1);
            return;
        }
        class81 var6 = arg0.field1672[arg1];
        class81 var7 = arg2.field1672[arg3];
        class95 var8 = var6.field1423;
        Statics.field1737 = 0;
        Statics.field1755 = 0;
        Statics.field1740 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1424; var11++) {
            int var12 = var6.field1422[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1658[var12] == 0) {
                this.method1971(var8.field1658[var12], var8.field1660[var12], var6.field1426[var11], var6.field1429[var11], var6.field1425[var11]);
            }
        }
        Statics.field1737 = 0;
        Statics.field1755 = 0;
        Statics.field1740 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1424; var15++) {
            int var16 = var7.field1422[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1658[var16] == 0) {
                this.method1971(var8.field1658[var16], var8.field1660[var16], var7.field1426[var15], var7.field1429[var15], var7.field1425[var15]);
            }
        }
        this.field1729 = 0;
    }

    @ObfuscatedName("cz.f(I[IIII)V")
    public void method1971(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1737 = 0;
            Statics.field1755 = 0;
            Statics.field1740 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1726.length) {
                    int[] var10 = this.field1726[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1737 += this.field1707[var12];
                        Statics.field1755 += this.field1708[var12];
                        Statics.field1740 += this.field1709[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1737 = Statics.field1737 / var7 + arg2;
                Statics.field1755 = Statics.field1755 / var7 + arg3;
                Statics.field1740 = Statics.field1740 / var7 + arg4;
            } else {
                Statics.field1737 = arg2;
                Statics.field1755 = arg3;
                Statics.field1740 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1726.length) {
                    int[] var15 = this.field1726[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1707[var17] += arg2;
                        this.field1708[var17] += arg3;
                        this.field1709[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1726.length) {
                    int[] var20 = this.field1726[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1707[var22] -= Statics.field1737;
                        this.field1708[var22] -= Statics.field1755;
                        this.field1709[var22] -= Statics.field1740;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1762[var25];
                            int var27 = field1763[var25];
                            int var28 = this.field1708[var22] * var26 + this.field1707[var22] * var27 >> 16;
                            this.field1708[var22] = this.field1708[var22] * var27 - this.field1707[var22] * var26 >> 16;
                            this.field1707[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1762[var23];
                            int var30 = field1763[var23];
                            int var31 = this.field1708[var22] * var30 - this.field1709[var22] * var29 >> 16;
                            this.field1709[var22] = this.field1709[var22] * var30 + this.field1708[var22] * var29 >> 16;
                            this.field1708[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1762[var24];
                            int var33 = field1763[var24];
                            int var34 = this.field1709[var22] * var32 + this.field1707[var22] * var33 >> 16;
                            this.field1709[var22] = this.field1709[var22] * var33 - this.field1707[var22] * var32 >> 16;
                            this.field1707[var22] = var34;
                        }
                        this.field1707[var22] += Statics.field1737;
                        this.field1708[var22] += Statics.field1755;
                        this.field1709[var22] += Statics.field1740;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1726.length) {
                    int[] var37 = this.field1726[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1707[var39] -= Statics.field1737;
                        this.field1708[var39] -= Statics.field1755;
                        this.field1709[var39] -= Statics.field1740;
                        this.field1707[var39] = this.field1707[var39] * arg2 / 128;
                        this.field1708[var39] = this.field1708[var39] * arg3 / 128;
                        this.field1709[var39] = this.field1709[var39] * arg4 / 128;
                        this.field1707[var39] += Statics.field1737;
                        this.field1708[var39] += Statics.field1755;
                        this.field1709[var39] += Statics.field1740;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1733 != null && this.field1718 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1733.length) {
                    int[] var42 = this.field1733[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1718[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1718[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cz.o()V")
    public void method1972() {
        for (int var1 = 0; var1 < this.field1706; var1++) {
            int var2 = this.field1707[var1];
            this.field1707[var1] = this.field1709[var1];
            this.field1709[var1] = -var2;
        }
        this.field1729 = 0;
    }

    @ObfuscatedName("cz.p()V")
    public void method1977() {
        for (int var1 = 0; var1 < this.field1706; var1++) {
            this.field1707[var1] = -this.field1707[var1];
            this.field1709[var1] = -this.field1709[var1];
        }
        this.field1729 = 0;
    }

    @ObfuscatedName("cz.n()V")
    public void method1974() {
        for (int var1 = 0; var1 < this.field1706; var1++) {
            int var2 = this.field1709[var1];
            this.field1709[var1] = this.field1707[var1];
            this.field1707[var1] = -var2;
        }
        this.field1729 = 0;
    }

    @ObfuscatedName("cz.m(I)V")
    public void method2001(int arg0) {
        int var2 = field1762[arg0];
        int var3 = field1763[arg0];
        for (int var4 = 0; var4 < this.field1706; var4++) {
            int var5 = this.field1708[var4] * var3 - this.field1709[var4] * var2 >> 16;
            this.field1709[var4] = this.field1709[var4] * var3 + this.field1708[var4] * var2 >> 16;
            this.field1708[var4] = var5;
        }
        this.field1729 = 0;
    }

    @ObfuscatedName("cz.s(III)V")
    public void method2035(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1706; var4++) {
            this.field1707[var4] += arg0;
            this.field1708[var4] += arg1;
            this.field1709[var4] += arg2;
        }
        this.field1729 = 0;
    }

    @ObfuscatedName("cz.t(III)V")
    public void method1978(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1706; var4++) {
            this.field1707[var4] = this.field1707[var4] * arg0 / 128;
            this.field1708[var4] = this.field1708[var4] * arg1 / 128;
            this.field1709[var4] = this.field1709[var4] * arg2 / 128;
        }
        this.field1729 = 0;
    }

    @ObfuscatedName("cz.j(IIIIIII)V")
    public final void method1961(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1744[0] = -1;
        if (this.field1729 != 2 && this.field1729 != 1) {
            this.method1967();
        }
        int var8 = Statics.field1469;
        int var9 = Statics.field1460;
        int var10 = field1762[arg0];
        int var11 = field1763[arg0];
        int var12 = field1762[arg1];
        int var13 = field1763[arg1];
        int var14 = field1762[arg2];
        int var15 = field1763[arg2];
        int var16 = field1762[arg3];
        int var17 = field1763[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1706; var19++) {
            int var20 = this.field1707[var19];
            int var21 = this.field1708[var19];
            int var22 = this.field1709[var19];
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
            field1739[var19] = var30 - var18;
            field1753[var19] = (var26 << 9) / var30 + var8;
            field1738[var19] = (var29 << 9) / var30 + var9;
            if (this.field1722 > 0) {
                field1745[var19] = var26;
                field1765[var19] = var29;
                field1742[var19] = var30;
            }
        }
        try {
            this.method1980(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cz.b(IIIIIIII)V")
    public final void method1962(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1744[0] = -1;
        if (this.field1729 != 2 && this.field1729 != 1) {
            this.method1967();
        }
        int var9 = Statics.field1469;
        int var10 = Statics.field1460;
        int var11 = field1762[arg0];
        int var12 = field1763[arg0];
        int var13 = field1762[arg1];
        int var14 = field1763[arg1];
        int var15 = field1762[arg2];
        int var16 = field1763[arg2];
        int var17 = field1762[arg3];
        int var18 = field1763[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1706; var20++) {
            int var21 = this.field1707[var20];
            int var22 = this.field1708[var20];
            int var23 = this.field1709[var20];
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
            field1739[var20] = var31 - var19;
            field1753[var20] = (var27 << 9) / arg7 + var9;
            field1738[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1722 > 0) {
                field1745[var20] = var27;
                field1765[var20] = var30;
                field1742[var20] = var31;
            }
        }
        try {
            this.method1980(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cz.q(IIIIIIIII)V")
    public void method1597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1744[0] = -1;
        if (this.field1729 != 1) {
            this.method1966();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1703 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1703 << 9;
        if (var15 / var13 >= Statics.field1464) {
            return;
        }
        int var16 = this.field1703 + var14 << 9;
        if (var16 / var13 <= Statics.field1473) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1703 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1465) {
            return;
        }
        int var20 = (this.field1344 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1466) {
            return;
        }
        int var22 = (this.field1344 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1722 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1713) {
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
            int var32 = field1758 - Statics.field1469;
            int var33 = field1759 - Statics.field1460;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1728) {
                    field1761[field1760++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1469;
        int var35 = Statics.field1460;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1762[arg0];
            var37 = field1763[arg0];
        }
        for (int var38 = 0; var38 < this.field1706; var38++) {
            int var39 = this.field1707[var38];
            int var40 = this.field1708[var38];
            int var41 = this.field1709[var38];
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
            field1739[var38] = var50 - var11;
            if (var50 >= 50) {
                field1753[var38] = (var46 << 9) / var50 + var34;
                field1738[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1753[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1745[var38] = var46;
                field1765[var38] = var49;
                field1742[var38] = var50;
            }
        }
        try {
            this.method1980(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cz.i(ZZI)V")
    public final void method1980(boolean arg0, boolean arg1, int arg2) {
        if (this.field1732 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1732; var4++) {
            field1744[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1710; var5++) {
            if (this.field1757[var5] != -2) {
                int var6 = this.field1750[var5];
                int var7 = this.field1712[var5];
                int var8 = this.field1764[var5];
                int var9 = field1753[var6];
                int var10 = field1753[var7];
                int var11 = field1753[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1745[var6];
                    int var13 = field1745[var7];
                    int var14 = field1745[var8];
                    int var15 = field1765[var6];
                    int var16 = field1765[var7];
                    int var17 = field1765[var8];
                    int var18 = field1742[var6];
                    int var19 = field1742[var7];
                    int var20 = field1742[var8];
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
                        field1736[var5] = true;
                        int var30 = (field1739[var6] + field1739[var7] + field1739[var8]) / 3 + this.field1768;
                        field1754[var30][field1744[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method1983(field1758, field1759, field1738[var6], field1738[var7], field1738[var8], var9, var10, var11)) {
                        field1761[field1760++] = arg2;
                        arg1 = false;
                    }
                    if ((field1738[var8] - field1738[var7]) * (var9 - var10) - (field1738[var6] - field1738[var7]) * (var11 - var10) > 0) {
                        field1736[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1463 && var10 <= Statics.field1463 && var11 <= Statics.field1463) {
                            field1711[var5] = false;
                        } else {
                            field1711[var5] = true;
                        }
                        int var31 = (field1739[var6] + field1739[var7] + field1739[var8]) / 3 + this.field1768;
                        field1754[var31][field1744[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1717 == null) {
            for (int var32 = this.field1732 - 1; var32 >= 0; var32--) {
                int var33 = field1744[var32];
                if (var33 > 0) {
                    int[] var34 = field1754[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method1981(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1746[var36] = 0;
            field1723[var36] = 0;
        }
        for (int var37 = this.field1732 - 1; var37 >= 0; var37--) {
            int var38 = field1744[var37];
            if (var38 > 0) {
                int[] var39 = field1754[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1717[var41];
                    int var43 = field1746[var42]++;
                    field1716[var42][var43] = var41;
                    if (var42 < 10) {
                        field1723[var42] += var37;
                    } else if (var42 == 10) {
                        field1720[var43] = var37;
                    } else {
                        field1702[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1746[1] > 0 || field1746[2] > 0) {
            var44 = (field1723[1] + field1723[2]) / (field1746[1] + field1746[2]);
        }
        int var45 = 0;
        if (field1746[3] > 0 || field1746[4] > 0) {
            var45 = (field1723[3] + field1723[4]) / (field1746[3] + field1746[4]);
        }
        int var46 = 0;
        if (field1746[6] > 0 || field1746[8] > 0) {
            var46 = (field1723[6] + field1723[8]) / (field1746[6] + field1746[8]);
        }
        int var47 = 0;
        int var48 = field1746[10];
        int[] var49 = field1716[10];
        int[] var50 = field1720;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1746[11];
            var49 = field1716[11];
            var50 = field1702;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method1981(var49[var47++]);
                if (var47 == var48 && field1716[11] != var49) {
                    var47 = 0;
                    var48 = field1746[11];
                    var49 = field1716[11];
                    var50 = field1702;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method1981(var49[var47++]);
                if (var47 == var48 && field1716[11] != var49) {
                    var47 = 0;
                    var48 = field1746[11];
                    var49 = field1716[11];
                    var50 = field1702;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method1981(var49[var47++]);
                if (var47 == var48 && field1716[11] != var49) {
                    var47 = 0;
                    var48 = field1746[11];
                    var49 = field1716[11];
                    var50 = field1702;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1746[var52];
            int[] var54 = field1716[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method1981(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method1981(var49[var47++]);
            if (var47 == var48 && field1716[11] != var49) {
                var47 = 0;
                var49 = field1716[11];
                var48 = field1746[11];
                var50 = field1702;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cz.h(I)V")
    public final void method1981(int arg0) {
        if (field1736[arg0]) {
            this.method2026(arg0);
            return;
        }
        int var2 = this.field1750[arg0];
        int var3 = this.field1712[arg0];
        int var4 = this.field1764[arg0];
        class84.field1459 = field1711[arg0];
        if (this.field1718 == null) {
            class84.field1453 = 0;
        } else {
            class84.field1453 = this.field1718[arg0] & 0xFF;
        }
        if (this.field1725 != null && this.field1725[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1721 == null || this.field1721[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1721[arg0] & 0xFF;
                var6 = this.field1747[var5];
                var7 = this.field1724[var5];
                var8 = this.field1719[var5];
            }
            if (this.field1757[arg0] == -1) {
                class84.method1784(field1738[var2], field1738[var3], field1738[var4], field1753[var2], field1753[var3], field1753[var4], this.field1714[arg0], this.field1714[arg0], this.field1714[arg0], field1745[var6], field1745[var7], field1745[var8], field1765[var6], field1765[var7], field1765[var8], field1742[var6], field1742[var7], field1742[var8], this.field1725[arg0]);
            } else {
                class84.method1784(field1738[var2], field1738[var3], field1738[var4], field1753[var2], field1753[var3], field1753[var4], this.field1714[arg0], this.field1715[arg0], this.field1757[arg0], field1745[var6], field1745[var7], field1745[var8], field1765[var6], field1765[var7], field1765[var8], field1742[var6], field1742[var7], field1742[var8], this.field1725[arg0]);
            }
        } else if (this.field1757[arg0] == -1) {
            class84.method1774(field1738[var2], field1738[var3], field1738[var4], field1753[var2], field1753[var3], field1753[var4], field1741[this.field1714[arg0]]);
        } else {
            class84.method1780(field1738[var2], field1738[var3], field1738[var4], field1753[var2], field1753[var3], field1753[var4], this.field1714[arg0], this.field1715[arg0], this.field1757[arg0]);
        }
    }

    @ObfuscatedName("cz.e(I)V")
    public final void method2026(int arg0) {
        int var2 = Statics.field1469;
        int var3 = Statics.field1460;
        int var4 = 0;
        int var5 = this.field1750[arg0];
        int var6 = this.field1712[arg0];
        int var7 = this.field1764[arg0];
        int var8 = field1742[var5];
        int var9 = field1742[var6];
        int var10 = field1742[var7];
        if (this.field1718 == null) {
            class84.field1453 = 0;
        } else {
            class84.field1453 = this.field1718[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1751[var4] = field1753[var5];
            field1752[var4] = field1738[var5];
            field1727[var4++] = this.field1714[arg0];
        } else {
            int var11 = field1745[var5];
            int var12 = field1765[var5];
            int var13 = this.field1714[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1756[var10 - var8];
                field1751[var4] = (((field1745[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1752[var4] = (((field1765[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1727[var4++] = ((this.field1757[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1756[var9 - var8];
                field1751[var4] = (((field1745[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1752[var4] = (((field1765[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1727[var4++] = ((this.field1715[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1751[var4] = field1753[var6];
            field1752[var4] = field1738[var6];
            field1727[var4++] = this.field1715[arg0];
        } else {
            int var16 = field1745[var6];
            int var17 = field1765[var6];
            int var18 = this.field1715[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1756[var8 - var9];
                field1751[var4] = (((field1745[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1752[var4] = (((field1765[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1727[var4++] = ((this.field1714[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1756[var10 - var9];
                field1751[var4] = (((field1745[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1752[var4] = (((field1765[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1727[var4++] = ((this.field1757[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1751[var4] = field1753[var7];
            field1752[var4] = field1738[var7];
            field1727[var4++] = this.field1757[arg0];
        } else {
            int var21 = field1745[var7];
            int var22 = field1765[var7];
            int var23 = this.field1757[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1756[var9 - var10];
                field1751[var4] = (((field1745[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1752[var4] = (((field1765[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1727[var4++] = ((this.field1715[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1756[var8 - var10];
                field1751[var4] = (((field1745[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1752[var4] = (((field1765[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1727[var4++] = ((this.field1714[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1751[0];
        int var27 = field1751[1];
        int var28 = field1751[2];
        int var29 = field1752[0];
        int var30 = field1752[1];
        int var31 = field1752[2];
        class84.field1459 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1463 || var27 > Statics.field1463 || var28 > Statics.field1463) {
                class84.field1459 = true;
            }
            if (this.field1725 != null && this.field1725[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1721 == null || this.field1721[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1721[arg0] & 0xFF;
                    var33 = this.field1747[var32];
                    var34 = this.field1724[var32];
                    var35 = this.field1719[var32];
                }
                if (this.field1757[arg0] == -1) {
                    class84.method1784(var29, var30, var31, var26, var27, var28, this.field1714[arg0], this.field1714[arg0], this.field1714[arg0], field1745[var33], field1745[var34], field1745[var35], field1765[var33], field1765[var34], field1765[var35], field1742[var33], field1742[var34], field1742[var35], this.field1725[arg0]);
                } else {
                    class84.method1784(var29, var30, var31, var26, var27, var28, field1727[0], field1727[1], field1727[2], field1745[var33], field1745[var34], field1745[var35], field1765[var33], field1765[var34], field1765[var35], field1742[var33], field1742[var34], field1742[var35], this.field1725[arg0]);
                }
            } else if (this.field1757[arg0] == -1) {
                class84.method1774(var29, var30, var31, var26, var27, var28, field1741[this.field1714[arg0]]);
            } else {
                class84.method1780(var29, var30, var31, var26, var27, var28, field1727[0], field1727[1], field1727[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1463 || var27 > Statics.field1463 || var28 > Statics.field1463 || field1751[3] < 0 || field1751[3] > Statics.field1463) {
            class84.field1459 = true;
        }
        if (this.field1725 != null && this.field1725[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1721 == null || this.field1721[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1721[arg0] & 0xFF;
                var37 = this.field1747[var36];
                var38 = this.field1724[var36];
                var39 = this.field1719[var36];
            }
            short var40 = this.field1725[arg0];
            if (this.field1757[arg0] == -1) {
                class84.method1784(var29, var30, var31, var26, var27, var28, this.field1714[arg0], this.field1714[arg0], this.field1714[arg0], field1745[var37], field1745[var38], field1745[var39], field1765[var37], field1765[var38], field1765[var39], field1742[var37], field1742[var38], field1742[var39], var40);
                class84.method1784(var29, var31, field1752[3], var26, var28, field1751[3], this.field1714[arg0], this.field1714[arg0], this.field1714[arg0], field1745[var37], field1745[var38], field1745[var39], field1765[var37], field1765[var38], field1765[var39], field1742[var37], field1742[var38], field1742[var39], var40);
            } else {
                class84.method1784(var29, var30, var31, var26, var27, var28, field1727[0], field1727[1], field1727[2], field1745[var37], field1745[var38], field1745[var39], field1765[var37], field1765[var38], field1765[var39], field1742[var37], field1742[var38], field1742[var39], var40);
                class84.method1784(var29, var31, field1752[3], var26, var28, field1751[3], field1727[0], field1727[2], field1727[3], field1745[var37], field1745[var38], field1745[var39], field1765[var37], field1765[var38], field1765[var39], field1742[var37], field1742[var38], field1742[var39], var40);
            }
        } else if (this.field1757[arg0] == -1) {
            int var41 = field1741[this.field1714[arg0]];
            class84.method1774(var29, var30, var31, var26, var27, var28, var41);
            class84.method1774(var29, var31, field1752[3], var26, var28, field1751[3], var41);
        } else {
            class84.method1780(var29, var30, var31, var26, var27, var28, field1727[0], field1727[1], field1727[2]);
            class84.method1780(var29, var31, field1752[3], var26, var28, field1751[3], field1727[0], field1727[2], field1727[3]);
        }
    }

    @ObfuscatedName("cz.av(IIIIIIII)Z")
    public final boolean method1983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
