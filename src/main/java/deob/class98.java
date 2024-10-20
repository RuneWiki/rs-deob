package deob;

@ObfuscatedName("cs")
public class class98 extends class78 {

    @ObfuscatedName("cs.e")
    public static class98 field1734 = new class98();

    @ObfuscatedName("cs.p")
    public static byte[] field1685 = new byte[1];

    @ObfuscatedName("cs.a")
    public static class98 field1699 = new class98();

    @ObfuscatedName("cs.g")
    public static byte[] field1730 = new byte[1];

    @ObfuscatedName("cs.u")
    public int field1688 = 0;

    @ObfuscatedName("cs.k")
    public int[] field1746;

    @ObfuscatedName("cs.m")
    public int[] field1690;

    @ObfuscatedName("cs.t")
    public int[] field1691;

    @ObfuscatedName("cs.l")
    public int field1692 = 0;

    @ObfuscatedName("cs.f")
    public int[] field1693;

    @ObfuscatedName("cs.c")
    public int[] field1694;

    @ObfuscatedName("cs.i")
    public int[] field1695;

    @ObfuscatedName("cs.o")
    public int[] field1745;

    @ObfuscatedName("cs.d")
    public int[] field1697;

    @ObfuscatedName("cs.b")
    public int[] field1698;

    @ObfuscatedName("cs.v")
    public byte[] field1721;

    @ObfuscatedName("cs.n")
    public byte[] field1724;

    @ObfuscatedName("cs.w")
    public byte[] field1701;

    @ObfuscatedName("cs.z")
    public short[] field1702;

    @ObfuscatedName("cs.x")
    public byte field1703 = 0;

    @ObfuscatedName("cs.q")
    public int field1704 = 0;

    @ObfuscatedName("cs.s")
    public int[] field1705;

    @ObfuscatedName("cs.j")
    public int[] field1741;

    @ObfuscatedName("cs.y")
    public int[] field1707;

    @ObfuscatedName("cs.r")
    public int[][] field1716;

    @ObfuscatedName("cs.h")
    public int[][] field1709;

    @ObfuscatedName("cs.ak")
    public boolean field1710 = false;

    @ObfuscatedName("cs.ab")
    public int field1711;

    @ObfuscatedName("cs.as")
    public int field1712;

    @ObfuscatedName("cs.aq")
    public int field1713;

    @ObfuscatedName("cs.ai")
    public int field1714;

    @ObfuscatedName("cs.aw")
    public int field1715;

    @ObfuscatedName("cs.ax")
    public static boolean[] field1717 = new boolean[4096];

    @ObfuscatedName("cs.ar")
    public static boolean[] field1718 = new boolean[4096];

    @ObfuscatedName("cs.ac")
    public static int[] field1737 = new int[4096];

    @ObfuscatedName("cs.ap")
    public static int[] field1687 = new int[4096];

    @ObfuscatedName("cs.az")
    public static int[] field1719 = new int[4096];

    @ObfuscatedName("cs.ae")
    public static int[] field1689 = new int[4096];

    @ObfuscatedName("cs.ah")
    public static int[] field1700 = new int[4096];

    @ObfuscatedName("cs.ad")
    public static int[] field1725 = new int[4096];

    @ObfuscatedName("cs.at")
    public static int[] field1726 = new int[1600];

    @ObfuscatedName("cs.au")
    public static int[][] field1727 = new int[1600][512];

    @ObfuscatedName("cs.an")
    public static int[] field1684 = new int[12];

    @ObfuscatedName("cs.al")
    public static int[][] field1729 = new int[12][2000];

    @ObfuscatedName("cs.am")
    public static int[] field1744 = new int[2000];

    @ObfuscatedName("cs.av")
    public static int[] field1731 = new int[2000];

    @ObfuscatedName("cs.ag")
    public static int[] field1732 = new int[12];

    @ObfuscatedName("cs.af")
    public static int[] field1733 = new int[10];

    @ObfuscatedName("cs.ao")
    public static int[] field1747 = new int[10];

    @ObfuscatedName("cs.aa")
    public static int[] field1735 = new int[10];

    @ObfuscatedName("cs.bo")
    public static boolean field1739 = false;

    @ObfuscatedName("cs.bg")
    public static int field1696 = 0;

    @ObfuscatedName("cs.bh")
    public static int field1722 = 0;

    @ObfuscatedName("cs.bi")
    public static int field1742 = 0;

    @ObfuscatedName("cs.bc")
    public static int[] field1743 = new int[1000];

    @ObfuscatedName("cs.bn")
    public static int[] field1708 = class84.field1469;

    @ObfuscatedName("cs.ba")
    public static int[] field1728 = class84.field1470;

    @ObfuscatedName("cs.bm")
    public static int[] field1748 = class84.field1463;

    @ObfuscatedName("cs.bf")
    public static int[] field1720 = class84.field1468;

    public class98() {
    }

    public class98(class98[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1688 = 0;
        this.field1692 = 0;
        this.field1704 = 0;
        this.field1703 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class98 var8 = arg0[var7];
            if (var8 != null) {
                this.field1688 += var8.field1688;
                this.field1692 += var8.field1692;
                this.field1704 += var8.field1704;
                if (var8.field1721 == null) {
                    if (this.field1703 == -1) {
                        this.field1703 = var8.field1703;
                    }
                    if (this.field1703 != var8.field1703) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1724 != null;
                var5 |= var8.field1702 != null;
                var6 |= var8.field1701 != null;
            }
        }
        this.field1746 = new int[this.field1688];
        this.field1690 = new int[this.field1688];
        this.field1691 = new int[this.field1688];
        this.field1693 = new int[this.field1692];
        this.field1694 = new int[this.field1692];
        this.field1695 = new int[this.field1692];
        this.field1745 = new int[this.field1692];
        this.field1697 = new int[this.field1692];
        this.field1698 = new int[this.field1692];
        if (var3) {
            this.field1721 = new byte[this.field1692];
        }
        if (var4) {
            this.field1724 = new byte[this.field1692];
        }
        if (var5) {
            this.field1702 = new short[this.field1692];
        }
        if (var6) {
            this.field1701 = new byte[this.field1692];
        }
        if (this.field1704 > 0) {
            this.field1705 = new int[this.field1704];
            this.field1741 = new int[this.field1704];
            this.field1707 = new int[this.field1704];
        }
        this.field1688 = 0;
        this.field1692 = 0;
        this.field1704 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class98 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1692; var11++) {
                    this.field1693[this.field1692] = var10.field1693[var11] + this.field1688;
                    this.field1694[this.field1692] = var10.field1694[var11] + this.field1688;
                    this.field1695[this.field1692] = var10.field1695[var11] + this.field1688;
                    this.field1745[this.field1692] = var10.field1745[var11];
                    this.field1697[this.field1692] = var10.field1697[var11];
                    this.field1698[this.field1692] = var10.field1698[var11];
                    if (var3) {
                        if (var10.field1721 == null) {
                            this.field1721[this.field1692] = var10.field1703;
                        } else {
                            this.field1721[this.field1692] = var10.field1721[var11];
                        }
                    }
                    if (var4 && var10.field1724 != null) {
                        this.field1724[this.field1692] = var10.field1724[var11];
                    }
                    if (var5) {
                        if (var10.field1702 == null) {
                            this.field1702[this.field1692] = -1;
                        } else {
                            this.field1702[this.field1692] = var10.field1702[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1701 == null || var10.field1701[var11] == -1) {
                            this.field1701[this.field1692] = -1;
                        } else {
                            this.field1701[this.field1692] = (byte) (var10.field1701[var11] + this.field1704);
                        }
                    }
                    this.field1692++;
                }
                for (int var12 = 0; var12 < var10.field1704; var12++) {
                    this.field1705[this.field1704] = var10.field1705[var12] + this.field1688;
                    this.field1741[this.field1704] = var10.field1741[var12] + this.field1688;
                    this.field1707[this.field1704] = var10.field1707[var12] + this.field1688;
                    this.field1704++;
                }
                for (int var13 = 0; var13 < var10.field1688; var13++) {
                    this.field1746[this.field1688] = var10.field1746[var13];
                    this.field1690[this.field1688] = var10.field1690[var13];
                    this.field1691[this.field1688] = var10.field1691[var13];
                    this.field1688++;
                }
            }
        }
    }

    @ObfuscatedName("cs.e([[IIIIZI)Lcs;")
    public class98 method2063(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1988();
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
        class98 var15;
        if (arg4) {
            var15 = new class98();
            var15.field1688 = this.field1688;
            var15.field1692 = this.field1692;
            var15.field1704 = this.field1704;
            var15.field1746 = this.field1746;
            var15.field1691 = this.field1691;
            var15.field1693 = this.field1693;
            var15.field1694 = this.field1694;
            var15.field1695 = this.field1695;
            var15.field1745 = this.field1745;
            var15.field1697 = this.field1697;
            var15.field1698 = this.field1698;
            var15.field1721 = this.field1721;
            var15.field1724 = this.field1724;
            var15.field1701 = this.field1701;
            var15.field1702 = this.field1702;
            var15.field1703 = this.field1703;
            var15.field1705 = this.field1705;
            var15.field1741 = this.field1741;
            var15.field1707 = this.field1707;
            var15.field1716 = this.field1716;
            var15.field1709 = this.field1709;
            var15.field1710 = this.field1710;
            var15.field1690 = new int[var15.field1688];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1688; var16++) {
                int var17 = this.field1746[var16] + arg1;
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
                int var27 = (-this.field1690[var26] << 16) / this.field1343;
                if (var27 < arg5) {
                    int var28 = this.field1746[var26] + arg1;
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
        var15.field1711 = 0;
        return var15;
    }

    @ObfuscatedName("cs.a(Z)Lcs;")
    public class98 method1985(boolean arg0) {
        if (!arg0 && field1685.length < this.field1692) {
            field1685 = new byte[this.field1692 + 100];
        }
        return this.method1987(arg0, field1734, field1685);
    }

    @ObfuscatedName("cs.g(Z)Lcs;")
    public class98 method2010(boolean arg0) {
        if (!arg0 && field1730.length < this.field1692) {
            field1730 = new byte[this.field1692 + 100];
        }
        return this.method1987(arg0, field1699, field1730);
    }

    @ObfuscatedName("cs.u(ZLcs;[B)Lcs;")
    public class98 method1987(boolean arg0, class98 arg1, byte[] arg2) {
        arg1.field1688 = this.field1688;
        arg1.field1692 = this.field1692;
        arg1.field1704 = this.field1704;
        if (arg1.field1746 == null || arg1.field1746.length < this.field1688) {
            arg1.field1746 = new int[this.field1688 + 100];
            arg1.field1690 = new int[this.field1688 + 100];
            arg1.field1691 = new int[this.field1688 + 100];
        }
        for (int var4 = 0; var4 < this.field1688; var4++) {
            arg1.field1746[var4] = this.field1746[var4];
            arg1.field1690[var4] = this.field1690[var4];
            arg1.field1691[var4] = this.field1691[var4];
        }
        if (arg0) {
            arg1.field1724 = this.field1724;
        } else {
            arg1.field1724 = arg2;
            if (this.field1724 == null) {
                for (int var5 = 0; var5 < this.field1692; var5++) {
                    arg1.field1724[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1692; var6++) {
                    arg1.field1724[var6] = this.field1724[var6];
                }
            }
        }
        arg1.field1693 = this.field1693;
        arg1.field1694 = this.field1694;
        arg1.field1695 = this.field1695;
        arg1.field1745 = this.field1745;
        arg1.field1697 = this.field1697;
        arg1.field1698 = this.field1698;
        arg1.field1721 = this.field1721;
        arg1.field1701 = this.field1701;
        arg1.field1702 = this.field1702;
        arg1.field1703 = this.field1703;
        arg1.field1705 = this.field1705;
        arg1.field1741 = this.field1741;
        arg1.field1707 = this.field1707;
        arg1.field1716 = this.field1716;
        arg1.field1709 = this.field1709;
        arg1.field1710 = this.field1710;
        arg1.field1711 = 0;
        return arg1;
    }

    @ObfuscatedName("cs.m()V")
    public void method1988() {
        if (this.field1711 == 1) {
            return;
        }
        this.field1711 = 1;
        this.field1343 = 0;
        this.field1712 = 0;
        this.field1713 = 0;
        for (int var1 = 0; var1 < this.field1688; var1++) {
            int var2 = this.field1746[var1];
            int var3 = this.field1690[var1];
            int var4 = this.field1691[var1];
            if (-var3 > this.field1343) {
                this.field1343 = -var3;
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
        this.field1715 = (int) (Math.sqrt((double) (this.field1343 * this.field1343 + this.field1713 * this.field1713)) + 0.99D);
        this.field1714 = this.field1715 + (int) (Math.sqrt((double) (this.field1713 * this.field1713 + this.field1712 * this.field1712)) + 0.99D);
    }

    @ObfuscatedName("cs.t()V")
    public void method2004() {
        if (this.field1711 == 2) {
            return;
        }
        this.field1711 = 2;
        this.field1713 = 0;
        for (int var1 = 0; var1 < this.field1688; var1++) {
            int var2 = this.field1746[var1];
            int var3 = this.field1690[var1];
            int var4 = this.field1691[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1713) {
                this.field1713 = var5;
            }
        }
        this.field1713 = (int) (Math.sqrt((double) this.field1713) + 0.99D);
        this.field1715 = this.field1713;
        this.field1714 = this.field1713 + this.field1713;
    }

    @ObfuscatedName("cs.l()I")
    public int method2028() {
        this.method1988();
        return this.field1713;
    }

    @ObfuscatedName("cs.f(Lcp;I)V")
    public void method1991(class96 arg0, int arg1) {
        if (this.field1716 == null || arg1 == -1) {
            return;
        }
        class81 var3 = arg0.field1656[arg1];
        class95 var4 = var3.field1426;
        Statics.field1736 = 0;
        Statics.field1706 = 0;
        Statics.field1740 = 0;
        for (int var5 = 0; var5 < var3.field1427; var5++) {
            int var6 = var3.field1422[var5];
            this.method2000(var4.field1647[var6], var4.field1648[var6], var3.field1429[var5], var3.field1428[var5], var3.field1431[var5]);
        }
        this.field1711 = 0;
    }

    @ObfuscatedName("cs.c(Lcp;ILcp;I[I)V")
    public void method1992(class96 arg0, int arg1, class96 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1991(arg0, arg1);
            return;
        }
        class81 var6 = arg0.field1656[arg1];
        class81 var7 = arg2.field1656[arg3];
        class95 var8 = var6.field1426;
        Statics.field1736 = 0;
        Statics.field1706 = 0;
        Statics.field1740 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1427; var11++) {
            int var12 = var6.field1422[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1647[var12] == 0) {
                this.method2000(var8.field1647[var12], var8.field1648[var12], var6.field1429[var11], var6.field1428[var11], var6.field1431[var11]);
            }
        }
        Statics.field1736 = 0;
        Statics.field1706 = 0;
        Statics.field1740 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1427; var15++) {
            int var16 = var7.field1422[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1647[var16] == 0) {
                this.method2000(var8.field1647[var16], var8.field1648[var16], var7.field1429[var15], var7.field1428[var15], var7.field1431[var15]);
            }
        }
        this.field1711 = 0;
    }

    @ObfuscatedName("cs.i(I[IIII)V")
    public void method2000(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1736 = 0;
            Statics.field1706 = 0;
            Statics.field1740 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1716.length) {
                    int[] var10 = this.field1716[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1736 += this.field1746[var12];
                        Statics.field1706 += this.field1690[var12];
                        Statics.field1740 += this.field1691[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1736 = Statics.field1736 / var7 + arg2;
                Statics.field1706 = Statics.field1706 / var7 + arg3;
                Statics.field1740 = Statics.field1740 / var7 + arg4;
            } else {
                Statics.field1736 = arg2;
                Statics.field1706 = arg3;
                Statics.field1740 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1716.length) {
                    int[] var15 = this.field1716[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1746[var17] += arg2;
                        this.field1690[var17] += arg3;
                        this.field1691[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1716.length) {
                    int[] var20 = this.field1716[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1746[var22] -= Statics.field1736;
                        this.field1690[var22] -= Statics.field1706;
                        this.field1691[var22] -= Statics.field1740;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1708[var25];
                            int var27 = field1728[var25];
                            int var28 = this.field1746[var22] * var27 + this.field1690[var22] * var26 >> 16;
                            this.field1690[var22] = this.field1690[var22] * var27 - this.field1746[var22] * var26 >> 16;
                            this.field1746[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1708[var23];
                            int var30 = field1728[var23];
                            int var31 = this.field1690[var22] * var30 - this.field1691[var22] * var29 >> 16;
                            this.field1691[var22] = this.field1691[var22] * var30 + this.field1690[var22] * var29 >> 16;
                            this.field1690[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1708[var24];
                            int var33 = field1728[var24];
                            int var34 = this.field1746[var22] * var33 + this.field1691[var22] * var32 >> 16;
                            this.field1691[var22] = this.field1691[var22] * var33 - this.field1746[var22] * var32 >> 16;
                            this.field1746[var22] = var34;
                        }
                        this.field1746[var22] += Statics.field1736;
                        this.field1690[var22] += Statics.field1706;
                        this.field1691[var22] += Statics.field1740;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1716.length) {
                    int[] var37 = this.field1716[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1746[var39] -= Statics.field1736;
                        this.field1690[var39] -= Statics.field1706;
                        this.field1691[var39] -= Statics.field1740;
                        this.field1746[var39] = this.field1746[var39] * arg2 / 128;
                        this.field1690[var39] = this.field1690[var39] * arg3 / 128;
                        this.field1691[var39] = this.field1691[var39] * arg4 / 128;
                        this.field1746[var39] += Statics.field1736;
                        this.field1690[var39] += Statics.field1706;
                        this.field1691[var39] += Statics.field1740;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1709 != null && this.field1724 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1709.length) {
                    int[] var42 = this.field1709[var41];
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

    @ObfuscatedName("cs.o()V")
    public void method2030() {
        for (int var1 = 0; var1 < this.field1688; var1++) {
            int var2 = this.field1746[var1];
            this.field1746[var1] = this.field1691[var1];
            this.field1691[var1] = -var2;
        }
        this.field1711 = 0;
    }

    @ObfuscatedName("cs.d()V")
    public void method1995() {
        for (int var1 = 0; var1 < this.field1688; var1++) {
            this.field1746[var1] = -this.field1746[var1];
            this.field1691[var1] = -this.field1691[var1];
        }
        this.field1711 = 0;
    }

    @ObfuscatedName("cs.b()V")
    public void method1996() {
        for (int var1 = 0; var1 < this.field1688; var1++) {
            int var2 = this.field1691[var1];
            this.field1691[var1] = this.field1746[var1];
            this.field1746[var1] = -var2;
        }
        this.field1711 = 0;
    }

    @ObfuscatedName("cs.v(I)V")
    public void method1997(int arg0) {
        int var2 = field1708[arg0];
        int var3 = field1728[arg0];
        for (int var4 = 0; var4 < this.field1688; var4++) {
            int var5 = this.field1690[var4] * var3 - this.field1691[var4] * var2 >> 16;
            this.field1691[var4] = this.field1691[var4] * var3 + this.field1690[var4] * var2 >> 16;
            this.field1690[var4] = var5;
        }
        this.field1711 = 0;
    }

    @ObfuscatedName("cs.n(III)V")
    public void method1993(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1688; var4++) {
            this.field1746[var4] += arg0;
            this.field1690[var4] += arg1;
            this.field1691[var4] += arg2;
        }
        this.field1711 = 0;
    }

    @ObfuscatedName("cs.w(III)V")
    public void method1999(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1688; var4++) {
            this.field1746[var4] = this.field1746[var4] * arg0 / 128;
            this.field1690[var4] = this.field1690[var4] * arg1 / 128;
            this.field1691[var4] = this.field1691[var4] * arg2 / 128;
        }
        this.field1711 = 0;
    }

    @ObfuscatedName("cs.z(IIIIIII)V")
    public final void method1983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1726[0] = -1;
        if (this.field1711 != 2 && this.field1711 != 1) {
            this.method2004();
        }
        int var8 = Statics.field1464;
        int var9 = Statics.field1457;
        int var10 = field1708[arg0];
        int var11 = field1728[arg0];
        int var12 = field1708[arg1];
        int var13 = field1728[arg1];
        int var14 = field1708[arg2];
        int var15 = field1728[arg2];
        int var16 = field1708[arg3];
        int var17 = field1728[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1688; var19++) {
            int var20 = this.field1746[var19];
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
            field1719[var19] = var30 - var18;
            field1737[var19] = (var26 << 9) / var30 + var8;
            field1687[var19] = (var29 << 9) / var30 + var9;
            if (this.field1704 > 0) {
                field1689[var19] = var26;
                field1700[var19] = var29;
                field1725[var19] = var30;
            }
        }
        try {
            this.method1984(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cs.x(IIIIIIII)V")
    public final void method2001(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1726[0] = -1;
        if (this.field1711 != 2 && this.field1711 != 1) {
            this.method2004();
        }
        int var9 = Statics.field1464;
        int var10 = Statics.field1457;
        int var11 = field1708[arg0];
        int var12 = field1728[arg0];
        int var13 = field1708[arg1];
        int var14 = field1728[arg1];
        int var15 = field1708[arg2];
        int var16 = field1728[arg2];
        int var17 = field1708[arg3];
        int var18 = field1728[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1688; var20++) {
            int var21 = this.field1746[var20];
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
            field1719[var20] = var31 - var19;
            field1737[var20] = (var27 << 9) / arg7 + var9;
            field1687[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1704 > 0) {
                field1689[var20] = var27;
                field1700[var20] = var30;
                field1725[var20] = var31;
            }
        }
        try {
            this.method1984(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cs.j(IIIIIIIII)V")
    public void method1603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1726[0] = -1;
        if (this.field1711 != 1) {
            this.method1988();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1713 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1713 << 9;
        if (var15 / var13 >= Statics.field1461) {
            return;
        }
        int var16 = this.field1713 + var14 << 9;
        if (var16 / var13 <= Statics.field1460) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1713 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1462) {
            return;
        }
        int var20 = (this.field1343 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1456) {
            return;
        }
        int var22 = (this.field1343 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1704 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1739) {
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
            int var32 = field1696 - Statics.field1464;
            int var33 = field1722 - Statics.field1457;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1710) {
                    field1743[field1742++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1464;
        int var35 = Statics.field1457;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1708[arg0];
            var37 = field1728[arg0];
        }
        for (int var38 = 0; var38 < this.field1688; var38++) {
            int var39 = this.field1746[var38];
            int var40 = this.field1690[var38];
            int var41 = this.field1691[var38];
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
            field1719[var38] = var50 - var11;
            if (var50 >= 50) {
                field1737[var38] = (var46 << 9) / var50 + var34;
                field1687[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1737[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1689[var38] = var46;
                field1700[var38] = var49;
                field1725[var38] = var50;
            }
        }
        try {
            this.method1984(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cs.q(ZZI)V")
    public final void method1984(boolean arg0, boolean arg1, int arg2) {
        if (this.field1714 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1714; var4++) {
            field1726[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1692; var5++) {
            if (this.field1698[var5] != -2) {
                int var6 = this.field1693[var5];
                int var7 = this.field1694[var5];
                int var8 = this.field1695[var5];
                int var9 = field1737[var6];
                int var10 = field1737[var7];
                int var11 = field1737[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1689[var6];
                    int var13 = field1689[var7];
                    int var14 = field1689[var8];
                    int var15 = field1700[var6];
                    int var16 = field1700[var7];
                    int var17 = field1700[var8];
                    int var18 = field1725[var6];
                    int var19 = field1725[var7];
                    int var20 = field1725[var8];
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
                        int var30 = (field1719[var6] + field1719[var7] + field1719[var8]) / 3 + this.field1715;
                        field1727[var30][field1726[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2025(field1696, field1722, field1687[var6], field1687[var7], field1687[var8], var9, var10, var11)) {
                        field1743[field1742++] = arg2;
                        arg1 = false;
                    }
                    if ((field1687[var8] - field1687[var7]) * (var9 - var10) - (field1687[var6] - field1687[var7]) * (var11 - var10) > 0) {
                        field1718[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1458 && var10 <= Statics.field1458 && var11 <= Statics.field1458) {
                            field1717[var5] = false;
                        } else {
                            field1717[var5] = true;
                        }
                        int var31 = (field1719[var6] + field1719[var7] + field1719[var8]) / 3 + this.field1715;
                        field1727[var31][field1726[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1721 == null) {
            for (int var32 = this.field1714 - 1; var32 >= 0; var32--) {
                int var33 = field1726[var32];
                if (var33 > 0) {
                    int[] var34 = field1727[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2003(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1684[var36] = 0;
            field1732[var36] = 0;
        }
        for (int var37 = this.field1714 - 1; var37 >= 0; var37--) {
            int var38 = field1726[var37];
            if (var38 > 0) {
                int[] var39 = field1727[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1721[var41];
                    int var43 = field1684[var42]++;
                    field1729[var42][var43] = var41;
                    if (var42 < 10) {
                        field1732[var42] += var37;
                    } else if (var42 == 10) {
                        field1744[var43] = var37;
                    } else {
                        field1731[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1684[1] > 0 || field1684[2] > 0) {
            var44 = (field1732[1] + field1732[2]) / (field1684[1] + field1684[2]);
        }
        int var45 = 0;
        if (field1684[3] > 0 || field1684[4] > 0) {
            var45 = (field1732[3] + field1732[4]) / (field1684[3] + field1684[4]);
        }
        int var46 = 0;
        if (field1684[6] > 0 || field1684[8] > 0) {
            var46 = (field1732[6] + field1732[8]) / (field1684[6] + field1684[8]);
        }
        int var47 = 0;
        int var48 = field1684[10];
        int[] var49 = field1729[10];
        int[] var50 = field1744;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1684[11];
            var49 = field1729[11];
            var50 = field1731;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2003(var49[var47++]);
                if (var47 == var48 && field1729[11] != var49) {
                    var47 = 0;
                    var48 = field1684[11];
                    var49 = field1729[11];
                    var50 = field1731;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2003(var49[var47++]);
                if (var47 == var48 && field1729[11] != var49) {
                    var47 = 0;
                    var48 = field1684[11];
                    var49 = field1729[11];
                    var50 = field1731;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2003(var49[var47++]);
                if (var47 == var48 && field1729[11] != var49) {
                    var47 = 0;
                    var48 = field1684[11];
                    var49 = field1729[11];
                    var50 = field1731;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1684[var52];
            int[] var54 = field1729[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2003(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2003(var49[var47++]);
            if (var47 == var48 && field1729[11] != var49) {
                var47 = 0;
                var49 = field1729[11];
                var48 = field1684[11];
                var50 = field1731;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cs.s(I)V")
    public final void method2003(int arg0) {
        if (field1718[arg0]) {
            this.method2002(arg0);
            return;
        }
        int var2 = this.field1693[arg0];
        int var3 = this.field1694[arg0];
        int var4 = this.field1695[arg0];
        class84.field1454 = field1717[arg0];
        if (this.field1724 == null) {
            class84.field1450 = 0;
        } else {
            class84.field1450 = this.field1724[arg0] & 0xFF;
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
                var6 = this.field1705[var5];
                var7 = this.field1741[var5];
                var8 = this.field1707[var5];
            }
            if (this.field1698[arg0] == -1) {
                class84.method1810(field1687[var2], field1687[var3], field1687[var4], field1737[var2], field1737[var3], field1737[var4], this.field1745[arg0], this.field1745[arg0], this.field1745[arg0], field1689[var6], field1689[var7], field1689[var8], field1700[var6], field1700[var7], field1700[var8], field1725[var6], field1725[var7], field1725[var8], this.field1702[arg0]);
            } else {
                class84.method1810(field1687[var2], field1687[var3], field1687[var4], field1737[var2], field1737[var3], field1737[var4], this.field1745[arg0], this.field1697[arg0], this.field1698[arg0], field1689[var6], field1689[var7], field1689[var8], field1700[var6], field1700[var7], field1700[var8], field1725[var6], field1725[var7], field1725[var8], this.field1702[arg0]);
            }
        } else if (this.field1698[arg0] == -1) {
            class84.method1795(field1687[var2], field1687[var3], field1687[var4], field1737[var2], field1737[var3], field1737[var4], field1748[this.field1745[arg0]]);
        } else {
            class84.method1819(field1687[var2], field1687[var3], field1687[var4], field1737[var2], field1737[var3], field1737[var4], this.field1745[arg0], this.field1697[arg0], this.field1698[arg0]);
        }
    }

    @ObfuscatedName("cs.h(I)V")
    public final void method2002(int arg0) {
        int var2 = Statics.field1464;
        int var3 = Statics.field1457;
        int var4 = 0;
        int var5 = this.field1693[arg0];
        int var6 = this.field1694[arg0];
        int var7 = this.field1695[arg0];
        int var8 = field1725[var5];
        int var9 = field1725[var6];
        int var10 = field1725[var7];
        if (this.field1724 == null) {
            class84.field1450 = 0;
        } else {
            class84.field1450 = this.field1724[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1733[var4] = field1737[var5];
            field1747[var4] = field1687[var5];
            field1735[var4++] = this.field1745[arg0];
        } else {
            int var11 = field1689[var5];
            int var12 = field1700[var5];
            int var13 = this.field1745[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1720[var10 - var8];
                field1733[var4] = (((field1689[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1747[var4] = (((field1700[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1735[var4++] = ((this.field1698[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1720[var9 - var8];
                field1733[var4] = (((field1689[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1747[var4] = (((field1700[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1735[var4++] = ((this.field1697[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1733[var4] = field1737[var6];
            field1747[var4] = field1687[var6];
            field1735[var4++] = this.field1697[arg0];
        } else {
            int var16 = field1689[var6];
            int var17 = field1700[var6];
            int var18 = this.field1697[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1720[var8 - var9];
                field1733[var4] = (((field1689[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1747[var4] = (((field1700[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1735[var4++] = ((this.field1745[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1720[var10 - var9];
                field1733[var4] = (((field1689[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1747[var4] = (((field1700[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1735[var4++] = ((this.field1698[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1733[var4] = field1737[var7];
            field1747[var4] = field1687[var7];
            field1735[var4++] = this.field1698[arg0];
        } else {
            int var21 = field1689[var7];
            int var22 = field1700[var7];
            int var23 = this.field1698[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1720[var9 - var10];
                field1733[var4] = (((field1689[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1747[var4] = (((field1700[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1735[var4++] = ((this.field1697[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1720[var8 - var10];
                field1733[var4] = (((field1689[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1747[var4] = (((field1700[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1735[var4++] = ((this.field1745[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1733[0];
        int var27 = field1733[1];
        int var28 = field1733[2];
        int var29 = field1747[0];
        int var30 = field1747[1];
        int var31 = field1747[2];
        class84.field1454 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1458 || var27 > Statics.field1458 || var28 > Statics.field1458) {
                class84.field1454 = true;
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
                    var33 = this.field1705[var32];
                    var34 = this.field1741[var32];
                    var35 = this.field1707[var32];
                }
                if (this.field1698[arg0] == -1) {
                    class84.method1810(var29, var30, var31, var26, var27, var28, this.field1745[arg0], this.field1745[arg0], this.field1745[arg0], field1689[var33], field1689[var34], field1689[var35], field1700[var33], field1700[var34], field1700[var35], field1725[var33], field1725[var34], field1725[var35], this.field1702[arg0]);
                } else {
                    class84.method1810(var29, var30, var31, var26, var27, var28, field1735[0], field1735[1], field1735[2], field1689[var33], field1689[var34], field1689[var35], field1700[var33], field1700[var34], field1700[var35], field1725[var33], field1725[var34], field1725[var35], this.field1702[arg0]);
                }
            } else if (this.field1698[arg0] == -1) {
                class84.method1795(var29, var30, var31, var26, var27, var28, field1748[this.field1745[arg0]]);
            } else {
                class84.method1819(var29, var30, var31, var26, var27, var28, field1735[0], field1735[1], field1735[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1458 || var27 > Statics.field1458 || var28 > Statics.field1458 || field1733[3] < 0 || field1733[3] > Statics.field1458) {
            class84.field1454 = true;
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
                var37 = this.field1705[var36];
                var38 = this.field1741[var36];
                var39 = this.field1707[var36];
            }
            short var40 = this.field1702[arg0];
            if (this.field1698[arg0] == -1) {
                class84.method1810(var29, var30, var31, var26, var27, var28, this.field1745[arg0], this.field1745[arg0], this.field1745[arg0], field1689[var37], field1689[var38], field1689[var39], field1700[var37], field1700[var38], field1700[var39], field1725[var37], field1725[var38], field1725[var39], var40);
                class84.method1810(var29, var31, field1747[3], var26, var28, field1733[3], this.field1745[arg0], this.field1745[arg0], this.field1745[arg0], field1689[var37], field1689[var38], field1689[var39], field1700[var37], field1700[var38], field1700[var39], field1725[var37], field1725[var38], field1725[var39], var40);
            } else {
                class84.method1810(var29, var30, var31, var26, var27, var28, field1735[0], field1735[1], field1735[2], field1689[var37], field1689[var38], field1689[var39], field1700[var37], field1700[var38], field1700[var39], field1725[var37], field1725[var38], field1725[var39], var40);
                class84.method1810(var29, var31, field1747[3], var26, var28, field1733[3], field1735[0], field1735[2], field1735[3], field1689[var37], field1689[var38], field1689[var39], field1700[var37], field1700[var38], field1700[var39], field1725[var37], field1725[var38], field1725[var39], var40);
            }
        } else if (this.field1698[arg0] == -1) {
            int var41 = field1748[this.field1745[arg0]];
            class84.method1795(var29, var30, var31, var26, var27, var28, var41);
            class84.method1795(var29, var31, field1747[3], var26, var28, field1733[3], var41);
        } else {
            class84.method1819(var29, var30, var31, var26, var27, var28, field1735[0], field1735[1], field1735[2]);
            class84.method1819(var29, var31, field1747[3], var26, var28, field1733[3], field1735[0], field1735[2], field1735[3]);
        }
    }

    @ObfuscatedName("cs.ak(IIIIIIII)Z")
    public final boolean method2025(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
