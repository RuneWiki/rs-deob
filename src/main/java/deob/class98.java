package deob;

@ObfuscatedName("cx")
public class class98 extends class78 {

    @ObfuscatedName("cx.t")
    public static class98 field1694 = new class98();

    @ObfuscatedName("cx.o")
    public static byte[] field1689 = new byte[1];

    @ObfuscatedName("cx.i")
    public static class98 field1735 = new class98();

    @ObfuscatedName("cx.p")
    public static byte[] field1704 = new byte[1];

    @ObfuscatedName("cx.c")
    public int field1692 = 0;

    @ObfuscatedName("cx.y")
    public int[] field1693;

    @ObfuscatedName("cx.g")
    public int[] field1699;

    @ObfuscatedName("cx.l")
    public int[] field1695;

    @ObfuscatedName("cx.h")
    public int field1696 = 0;

    @ObfuscatedName("cx.n")
    public int[] field1691;

    @ObfuscatedName("cx.w")
    public int[] field1698;

    @ObfuscatedName("cx.m")
    public int[] field1737;

    @ObfuscatedName("cx.x")
    public int[] field1700;

    @ObfuscatedName("cx.b")
    public int[] field1701;

    @ObfuscatedName("cx.u")
    public int[] field1702;

    @ObfuscatedName("cx.r")
    public byte[] field1703;

    @ObfuscatedName("cx.z")
    public byte[] field1697;

    @ObfuscatedName("cx.v")
    public byte[] field1705;

    @ObfuscatedName("cx.k")
    public short[] field1706;

    @ObfuscatedName("cx.a")
    public byte field1740 = 0;

    @ObfuscatedName("cx.d")
    public int field1749 = 0;

    @ObfuscatedName("cx.j")
    public int[] field1709;

    @ObfuscatedName("cx.s")
    public int[] field1710;

    @ObfuscatedName("cx.f")
    public int[] field1711;

    @ObfuscatedName("cx.e")
    public int[][] field1712;

    @ObfuscatedName("cx.q")
    public int[][] field1713;

    @ObfuscatedName("cx.al")
    public boolean field1688 = false;

    @ObfuscatedName("cx.ao")
    public int field1715;

    @ObfuscatedName("cx.ap")
    public int field1716;

    @ObfuscatedName("cx.aa")
    public int field1717;

    @ObfuscatedName("cx.ak")
    public int field1718;

    @ObfuscatedName("cx.ah")
    public int field1719;

    @ObfuscatedName("cx.aw")
    public static boolean[] field1722 = new boolean[4096];

    @ObfuscatedName("cx.aj")
    public static boolean[] field1748 = new boolean[4096];

    @ObfuscatedName("cx.af")
    public static int[] field1723 = new int[4096];

    @ObfuscatedName("cx.am")
    public static int[] field1724 = new int[4096];

    @ObfuscatedName("cx.ab")
    public static int[] field1725 = new int[4096];

    @ObfuscatedName("cx.ai")
    public static int[] field1726 = new int[4096];

    @ObfuscatedName("cx.an")
    public static int[] field1727 = new int[4096];

    @ObfuscatedName("cx.ac")
    public static int[] field1690 = new int[4096];

    @ObfuscatedName("cx.av")
    public static int[] field1730 = new int[1600];

    @ObfuscatedName("cx.at")
    public static int[][] field1721 = new int[1600][512];

    @ObfuscatedName("cx.ax")
    public static int[] field1732 = new int[12];

    @ObfuscatedName("cx.ae")
    public static int[][] field1708 = new int[12][2000];

    @ObfuscatedName("cx.az")
    public static int[] field1734 = new int[2000];

    @ObfuscatedName("cx.ar")
    public static int[] field1736 = new int[2000];

    @ObfuscatedName("cx.aq")
    public static int[] field1731 = new int[12];

    @ObfuscatedName("cx.ag")
    public static int[] field1753 = new int[10];

    @ObfuscatedName("cx.ay")
    public static int[] field1738 = new int[10];

    @ObfuscatedName("cx.ad")
    public static int[] field1739 = new int[10];

    @ObfuscatedName("cx.bc")
    public static boolean field1754 = false;

    @ObfuscatedName("cx.bn")
    public static int field1707 = 0;

    @ObfuscatedName("cx.bb")
    public static int field1745 = 0;

    @ObfuscatedName("cx.bu")
    public static int field1746 = 0;

    @ObfuscatedName("cx.bq")
    public static int[] field1744 = new int[1000];

    @ObfuscatedName("cx.bk")
    public static int[] field1728 = class84.field1483;

    @ObfuscatedName("cx.bv")
    public static int[] field1747 = class84.field1484;

    @ObfuscatedName("cx.bj")
    public static int[] field1750 = class84.field1473;

    @ObfuscatedName("cx.bh")
    public static int[] field1751 = class84.field1482;

    public class98() {
    }

    public class98(class98[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1692 = 0;
        this.field1696 = 0;
        this.field1749 = 0;
        this.field1740 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class98 var8 = arg0[var7];
            if (var8 != null) {
                this.field1692 += var8.field1692;
                this.field1696 += var8.field1696;
                this.field1749 += var8.field1749;
                if (var8.field1703 == null) {
                    if (this.field1740 == -1) {
                        this.field1740 = var8.field1740;
                    }
                    if (this.field1740 != var8.field1740) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1697 != null;
                var5 |= var8.field1706 != null;
                var6 |= var8.field1705 != null;
            }
        }
        this.field1693 = new int[this.field1692];
        this.field1699 = new int[this.field1692];
        this.field1695 = new int[this.field1692];
        this.field1691 = new int[this.field1696];
        this.field1698 = new int[this.field1696];
        this.field1737 = new int[this.field1696];
        this.field1700 = new int[this.field1696];
        this.field1701 = new int[this.field1696];
        this.field1702 = new int[this.field1696];
        if (var3) {
            this.field1703 = new byte[this.field1696];
        }
        if (var4) {
            this.field1697 = new byte[this.field1696];
        }
        if (var5) {
            this.field1706 = new short[this.field1696];
        }
        if (var6) {
            this.field1705 = new byte[this.field1696];
        }
        if (this.field1749 > 0) {
            this.field1709 = new int[this.field1749];
            this.field1710 = new int[this.field1749];
            this.field1711 = new int[this.field1749];
        }
        this.field1692 = 0;
        this.field1696 = 0;
        this.field1749 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class98 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1696; var11++) {
                    this.field1691[this.field1696] = var10.field1691[var11] + this.field1692;
                    this.field1698[this.field1696] = var10.field1698[var11] + this.field1692;
                    this.field1737[this.field1696] = var10.field1737[var11] + this.field1692;
                    this.field1700[this.field1696] = var10.field1700[var11];
                    this.field1701[this.field1696] = var10.field1701[var11];
                    this.field1702[this.field1696] = var10.field1702[var11];
                    if (var3) {
                        if (var10.field1703 == null) {
                            this.field1703[this.field1696] = var10.field1740;
                        } else {
                            this.field1703[this.field1696] = var10.field1703[var11];
                        }
                    }
                    if (var4 && var10.field1697 != null) {
                        this.field1697[this.field1696] = var10.field1697[var11];
                    }
                    if (var5) {
                        if (var10.field1706 == null) {
                            this.field1706[this.field1696] = -1;
                        } else {
                            this.field1706[this.field1696] = var10.field1706[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1705 == null || var10.field1705[var11] == -1) {
                            this.field1705[this.field1696] = -1;
                        } else {
                            this.field1705[this.field1696] = (byte) (var10.field1705[var11] + this.field1749);
                        }
                    }
                    this.field1696++;
                }
                for (int var12 = 0; var12 < var10.field1749; var12++) {
                    this.field1709[this.field1749] = var10.field1709[var12] + this.field1692;
                    this.field1710[this.field1749] = var10.field1710[var12] + this.field1692;
                    this.field1711[this.field1749] = var10.field1711[var12] + this.field1692;
                    this.field1749++;
                }
                for (int var13 = 0; var13 < var10.field1692; var13++) {
                    this.field1693[this.field1692] = var10.field1693[var13];
                    this.field1699[this.field1692] = var10.field1699[var13];
                    this.field1695[this.field1692] = var10.field1695[var13];
                    this.field1692++;
                }
            }
        }
    }

    @ObfuscatedName("cx.t([[IIIIZI)Lcx;")
    public class98 method2044(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1974();
        int var7 = arg1 - this.field1717;
        int var8 = this.field1717 + arg1;
        int var9 = arg3 - this.field1717;
        int var10 = this.field1717 + arg3;
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
            var15.field1692 = this.field1692;
            var15.field1696 = this.field1696;
            var15.field1749 = this.field1749;
            var15.field1693 = this.field1693;
            var15.field1695 = this.field1695;
            var15.field1691 = this.field1691;
            var15.field1698 = this.field1698;
            var15.field1737 = this.field1737;
            var15.field1700 = this.field1700;
            var15.field1701 = this.field1701;
            var15.field1702 = this.field1702;
            var15.field1703 = this.field1703;
            var15.field1697 = this.field1697;
            var15.field1705 = this.field1705;
            var15.field1706 = this.field1706;
            var15.field1740 = this.field1740;
            var15.field1709 = this.field1709;
            var15.field1710 = this.field1710;
            var15.field1711 = this.field1711;
            var15.field1712 = this.field1712;
            var15.field1713 = this.field1713;
            var15.field1688 = this.field1688;
            var15.field1699 = new int[var15.field1692];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1692; var16++) {
                int var17 = this.field1693[var16] + arg1;
                int var18 = this.field1695[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1699[var16] = this.field1699[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1692; var26++) {
                int var27 = (-this.field1699[var26] << 16) / this.field1351;
                if (var27 < arg5) {
                    int var28 = this.field1693[var26] + arg1;
                    int var29 = this.field1695[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1699[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1699[var26];
                }
            }
        }
        var15.field1715 = 0;
        return var15;
    }

    @ObfuscatedName("cx.i(Z)Lcx;")
    public class98 method1971(boolean arg0) {
        if (!arg0 && field1689.length < this.field1696) {
            field1689 = new byte[this.field1696 + 100];
        }
        return this.method1973(arg0, field1694, field1689);
    }

    @ObfuscatedName("cx.p(Z)Lcx;")
    public class98 method1990(boolean arg0) {
        if (!arg0 && field1704.length < this.field1696) {
            field1704 = new byte[this.field1696 + 100];
        }
        return this.method1973(arg0, field1735, field1704);
    }

    @ObfuscatedName("cx.c(ZLcx;[B)Lcx;")
    public class98 method1973(boolean arg0, class98 arg1, byte[] arg2) {
        arg1.field1692 = this.field1692;
        arg1.field1696 = this.field1696;
        arg1.field1749 = this.field1749;
        if (arg1.field1693 == null || arg1.field1693.length < this.field1692) {
            arg1.field1693 = new int[this.field1692 + 100];
            arg1.field1699 = new int[this.field1692 + 100];
            arg1.field1695 = new int[this.field1692 + 100];
        }
        for (int var4 = 0; var4 < this.field1692; var4++) {
            arg1.field1693[var4] = this.field1693[var4];
            arg1.field1699[var4] = this.field1699[var4];
            arg1.field1695[var4] = this.field1695[var4];
        }
        if (arg0) {
            arg1.field1697 = this.field1697;
        } else {
            arg1.field1697 = arg2;
            if (this.field1697 == null) {
                for (int var5 = 0; var5 < this.field1696; var5++) {
                    arg1.field1697[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1696; var6++) {
                    arg1.field1697[var6] = this.field1697[var6];
                }
            }
        }
        arg1.field1691 = this.field1691;
        arg1.field1698 = this.field1698;
        arg1.field1737 = this.field1737;
        arg1.field1700 = this.field1700;
        arg1.field1701 = this.field1701;
        arg1.field1702 = this.field1702;
        arg1.field1703 = this.field1703;
        arg1.field1705 = this.field1705;
        arg1.field1706 = this.field1706;
        arg1.field1740 = this.field1740;
        arg1.field1709 = this.field1709;
        arg1.field1710 = this.field1710;
        arg1.field1711 = this.field1711;
        arg1.field1712 = this.field1712;
        arg1.field1713 = this.field1713;
        arg1.field1688 = this.field1688;
        arg1.field1715 = 0;
        return arg1;
    }

    @ObfuscatedName("cx.y()V")
    public void method1974() {
        if (this.field1715 == 1) {
            return;
        }
        this.field1715 = 1;
        this.field1351 = 0;
        this.field1716 = 0;
        this.field1717 = 0;
        for (int var1 = 0; var1 < this.field1692; var1++) {
            int var2 = this.field1693[var1];
            int var3 = this.field1699[var1];
            int var4 = this.field1695[var1];
            if (-var3 > this.field1351) {
                this.field1351 = -var3;
            }
            if (var3 > this.field1716) {
                this.field1716 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1717) {
                this.field1717 = var5;
            }
        }
        this.field1717 = (int) (Math.sqrt((double) this.field1717) + 0.99D);
        this.field1719 = (int) (Math.sqrt((double) (this.field1351 * this.field1351 + this.field1717 * this.field1717)) + 0.99D);
        this.field1718 = this.field1719 + (int) (Math.sqrt((double) (this.field1717 * this.field1717 + this.field1716 * this.field1716)) + 0.99D);
    }

    @ObfuscatedName("cx.g()V")
    public void method1975() {
        if (this.field1715 == 2) {
            return;
        }
        this.field1715 = 2;
        this.field1717 = 0;
        for (int var1 = 0; var1 < this.field1692; var1++) {
            int var2 = this.field1693[var1];
            int var3 = this.field1699[var1];
            int var4 = this.field1695[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1717) {
                this.field1717 = var5;
            }
        }
        this.field1717 = (int) (Math.sqrt((double) this.field1717) + 0.99D);
        this.field1719 = this.field1717;
        this.field1718 = this.field1717 + this.field1717;
    }

    @ObfuscatedName("cx.l()I")
    public int method2003() {
        this.method1974();
        return this.field1717;
    }

    @ObfuscatedName("cx.h(Lcb;I)V")
    public void method1987(class96 arg0, int arg1) {
        if (this.field1712 == null || arg1 == -1) {
            return;
        }
        class81 var3 = arg0.field1661[arg1];
        class95 var4 = var3.field1436;
        Statics.field1743 = 0;
        Statics.field1741 = 0;
        Statics.field1742 = 0;
        for (int var5 = 0; var5 < var3.field1437; var5++) {
            int var6 = var3.field1438[var5];
            this.method1982(var4.field1650[var6], var4.field1656[var6], var3.field1439[var5], var3.field1440[var5], var3.field1434[var5]);
        }
        this.field1715 = 0;
    }

    @ObfuscatedName("cx.n(Lcb;ILcb;I[I)V")
    public void method1978(class96 arg0, int arg1, class96 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1987(arg0, arg1);
            return;
        }
        class81 var6 = arg0.field1661[arg1];
        class81 var7 = arg2.field1661[arg3];
        class95 var8 = var6.field1436;
        Statics.field1743 = 0;
        Statics.field1741 = 0;
        Statics.field1742 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1437; var11++) {
            int var12 = var6.field1438[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1650[var12] == 0) {
                this.method1982(var8.field1650[var12], var8.field1656[var12], var6.field1439[var11], var6.field1440[var11], var6.field1434[var11]);
            }
        }
        Statics.field1743 = 0;
        Statics.field1741 = 0;
        Statics.field1742 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1437; var15++) {
            int var16 = var7.field1438[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1650[var16] == 0) {
                this.method1982(var8.field1650[var16], var8.field1656[var16], var7.field1439[var15], var7.field1440[var15], var7.field1434[var15]);
            }
        }
        this.field1715 = 0;
    }

    @ObfuscatedName("cx.b(I[IIII)V")
    public void method1982(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1743 = 0;
            Statics.field1741 = 0;
            Statics.field1742 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1712.length) {
                    int[] var10 = this.field1712[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1743 += this.field1693[var12];
                        Statics.field1741 += this.field1699[var12];
                        Statics.field1742 += this.field1695[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1743 = Statics.field1743 / var7 + arg2;
                Statics.field1741 = Statics.field1741 / var7 + arg3;
                Statics.field1742 = Statics.field1742 / var7 + arg4;
            } else {
                Statics.field1743 = arg2;
                Statics.field1741 = arg3;
                Statics.field1742 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1712.length) {
                    int[] var15 = this.field1712[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1693[var17] += arg2;
                        this.field1699[var17] += arg3;
                        this.field1695[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1712.length) {
                    int[] var20 = this.field1712[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1693[var22] -= Statics.field1743;
                        this.field1699[var22] -= Statics.field1741;
                        this.field1695[var22] -= Statics.field1742;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1728[var25];
                            int var27 = field1747[var25];
                            int var28 = this.field1699[var22] * var26 + this.field1693[var22] * var27 >> 16;
                            this.field1699[var22] = this.field1699[var22] * var27 - this.field1693[var22] * var26 >> 16;
                            this.field1693[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1728[var23];
                            int var30 = field1747[var23];
                            int var31 = this.field1699[var22] * var30 - this.field1695[var22] * var29 >> 16;
                            this.field1695[var22] = this.field1699[var22] * var29 + this.field1695[var22] * var30 >> 16;
                            this.field1699[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1728[var24];
                            int var33 = field1747[var24];
                            int var34 = this.field1695[var22] * var32 + this.field1693[var22] * var33 >> 16;
                            this.field1695[var22] = this.field1695[var22] * var33 - this.field1693[var22] * var32 >> 16;
                            this.field1693[var22] = var34;
                        }
                        this.field1693[var22] += Statics.field1743;
                        this.field1699[var22] += Statics.field1741;
                        this.field1695[var22] += Statics.field1742;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1712.length) {
                    int[] var37 = this.field1712[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1693[var39] -= Statics.field1743;
                        this.field1699[var39] -= Statics.field1741;
                        this.field1695[var39] -= Statics.field1742;
                        this.field1693[var39] = this.field1693[var39] * arg2 / 128;
                        this.field1699[var39] = this.field1699[var39] * arg3 / 128;
                        this.field1695[var39] = this.field1695[var39] * arg4 / 128;
                        this.field1693[var39] += Statics.field1743;
                        this.field1699[var39] += Statics.field1741;
                        this.field1695[var39] += Statics.field1742;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1713 != null && this.field1697 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1713.length) {
                    int[] var42 = this.field1713[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1697[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1697[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cx.u()V")
    public void method1980() {
        for (int var1 = 0; var1 < this.field1692; var1++) {
            int var2 = this.field1693[var1];
            this.field1693[var1] = this.field1695[var1];
            this.field1695[var1] = -var2;
        }
        this.field1715 = 0;
    }

    @ObfuscatedName("cx.r()V")
    public void method2011() {
        for (int var1 = 0; var1 < this.field1692; var1++) {
            this.field1693[var1] = -this.field1693[var1];
            this.field1695[var1] = -this.field1695[var1];
        }
        this.field1715 = 0;
    }

    @ObfuscatedName("cx.z()V")
    public void method1981() {
        for (int var1 = 0; var1 < this.field1692; var1++) {
            int var2 = this.field1695[var1];
            this.field1695[var1] = this.field1693[var1];
            this.field1693[var1] = -var2;
        }
        this.field1715 = 0;
    }

    @ObfuscatedName("cx.v(I)V")
    public void method2033(int arg0) {
        int var2 = field1728[arg0];
        int var3 = field1747[arg0];
        for (int var4 = 0; var4 < this.field1692; var4++) {
            int var5 = this.field1699[var4] * var3 - this.field1695[var4] * var2 >> 16;
            this.field1695[var4] = this.field1699[var4] * var2 + this.field1695[var4] * var3 >> 16;
            this.field1699[var4] = var5;
        }
        this.field1715 = 0;
    }

    @ObfuscatedName("cx.k(III)V")
    public void method2036(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1692; var4++) {
            this.field1693[var4] += arg0;
            this.field1699[var4] += arg1;
            this.field1695[var4] += arg2;
        }
        this.field1715 = 0;
    }

    @ObfuscatedName("cx.a(III)V")
    public void method2018(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1692; var4++) {
            this.field1693[var4] = this.field1693[var4] * arg0 / 128;
            this.field1699[var4] = this.field1699[var4] * arg1 / 128;
            this.field1695[var4] = this.field1695[var4] * arg2 / 128;
        }
        this.field1715 = 0;
    }

    @ObfuscatedName("cx.d(IIIIIII)V")
    public final void method1984(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1730[0] = -1;
        if (this.field1715 != 2 && this.field1715 != 1) {
            this.method1975();
        }
        int var8 = Statics.field1470;
        int var9 = Statics.field1471;
        int var10 = field1728[arg0];
        int var11 = field1747[arg0];
        int var12 = field1728[arg1];
        int var13 = field1747[arg1];
        int var14 = field1728[arg2];
        int var15 = field1747[arg2];
        int var16 = field1728[arg3];
        int var17 = field1747[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1692; var19++) {
            int var20 = this.field1693[var19];
            int var21 = this.field1699[var19];
            int var22 = this.field1695[var19];
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
            field1725[var19] = var30 - var18;
            field1723[var19] = (var26 << 9) / var30 + var8;
            field1724[var19] = (var29 << 9) / var30 + var9;
            if (this.field1749 > 0) {
                field1726[var19] = var26;
                field1727[var19] = var29;
                field1690[var19] = var30;
            }
        }
        try {
            this.method1986(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cx.j(IIIIIIII)V")
    public final void method1985(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1730[0] = -1;
        if (this.field1715 != 2 && this.field1715 != 1) {
            this.method1975();
        }
        int var9 = Statics.field1470;
        int var10 = Statics.field1471;
        int var11 = field1728[arg0];
        int var12 = field1747[arg0];
        int var13 = field1728[arg1];
        int var14 = field1747[arg1];
        int var15 = field1728[arg2];
        int var16 = field1747[arg2];
        int var17 = field1728[arg3];
        int var18 = field1747[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1692; var20++) {
            int var21 = this.field1693[var20];
            int var22 = this.field1699[var20];
            int var23 = this.field1695[var20];
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
            field1725[var20] = var31 - var19;
            field1723[var20] = (var27 << 9) / arg7 + var9;
            field1724[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1749 > 0) {
                field1726[var20] = var27;
                field1727[var20] = var30;
                field1690[var20] = var31;
            }
        }
        try {
            this.method1986(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cx.ap(IIIIIIIII)V")
    public void method1582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1730[0] = -1;
        if (this.field1715 != 1) {
            this.method1974();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1717 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1717 << 9;
        if (var15 / var13 >= Statics.field1467) {
            return;
        }
        int var16 = this.field1717 + var14 << 9;
        if (var16 / var13 <= Statics.field1474) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1717 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1476) {
            return;
        }
        int var20 = (this.field1351 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1477) {
            return;
        }
        int var22 = (this.field1351 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1749 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1754) {
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
            int var32 = field1707 - Statics.field1470;
            int var33 = field1745 - Statics.field1471;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1688) {
                    field1744[field1746++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1470;
        int var35 = Statics.field1471;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1728[arg0];
            var37 = field1747[arg0];
        }
        for (int var38 = 0; var38 < this.field1692; var38++) {
            int var39 = this.field1693[var38];
            int var40 = this.field1699[var38];
            int var41 = this.field1695[var38];
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
            field1725[var38] = var50 - var11;
            if (var50 >= 50) {
                field1723[var38] = (var46 << 9) / var50 + var34;
                field1724[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1723[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1726[var38] = var46;
                field1727[var38] = var49;
                field1690[var38] = var50;
            }
        }
        try {
            this.method1986(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cx.s(ZZI)V")
    public final void method1986(boolean arg0, boolean arg1, int arg2) {
        if (this.field1718 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1718; var4++) {
            field1730[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1696; var5++) {
            if (this.field1702[var5] != -2) {
                int var6 = this.field1691[var5];
                int var7 = this.field1698[var5];
                int var8 = this.field1737[var5];
                int var9 = field1723[var6];
                int var10 = field1723[var7];
                int var11 = field1723[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1726[var6];
                    int var13 = field1726[var7];
                    int var14 = field1726[var8];
                    int var15 = field1727[var6];
                    int var16 = field1727[var7];
                    int var17 = field1727[var8];
                    int var18 = field1690[var6];
                    int var19 = field1690[var7];
                    int var20 = field1690[var8];
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
                        field1748[var5] = true;
                        int var30 = (field1725[var6] + field1725[var7] + field1725[var8]) / 3 + this.field1719;
                        field1721[var30][field1730[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method1989(field1707, field1745, field1724[var6], field1724[var7], field1724[var8], var9, var10, var11)) {
                        field1744[field1746++] = arg2;
                        arg1 = false;
                    }
                    if ((field1724[var8] - field1724[var7]) * (var9 - var10) - (field1724[var6] - field1724[var7]) * (var11 - var10) > 0) {
                        field1748[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1465 && var10 <= Statics.field1465 && var11 <= Statics.field1465) {
                            field1722[var5] = false;
                        } else {
                            field1722[var5] = true;
                        }
                        int var31 = (field1725[var6] + field1725[var7] + field1725[var8]) / 3 + this.field1719;
                        field1721[var31][field1730[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1703 == null) {
            for (int var32 = this.field1718 - 1; var32 >= 0; var32--) {
                int var33 = field1730[var32];
                if (var33 > 0) {
                    int[] var34 = field1721[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2020(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1732[var36] = 0;
            field1731[var36] = 0;
        }
        for (int var37 = this.field1718 - 1; var37 >= 0; var37--) {
            int var38 = field1730[var37];
            if (var38 > 0) {
                int[] var39 = field1721[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1703[var41];
                    int var43 = field1732[var42]++;
                    field1708[var42][var43] = var41;
                    if (var42 < 10) {
                        field1731[var42] += var37;
                    } else if (var42 == 10) {
                        field1734[var43] = var37;
                    } else {
                        field1736[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1732[1] > 0 || field1732[2] > 0) {
            var44 = (field1731[1] + field1731[2]) / (field1732[1] + field1732[2]);
        }
        int var45 = 0;
        if (field1732[3] > 0 || field1732[4] > 0) {
            var45 = (field1731[3] + field1731[4]) / (field1732[3] + field1732[4]);
        }
        int var46 = 0;
        if (field1732[6] > 0 || field1732[8] > 0) {
            var46 = (field1731[6] + field1731[8]) / (field1732[6] + field1732[8]);
        }
        int var47 = 0;
        int var48 = field1732[10];
        int[] var49 = field1708[10];
        int[] var50 = field1734;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1732[11];
            var49 = field1708[11];
            var50 = field1736;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2020(var49[var47++]);
                if (var47 == var48 && field1708[11] != var49) {
                    var47 = 0;
                    var48 = field1732[11];
                    var49 = field1708[11];
                    var50 = field1736;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2020(var49[var47++]);
                if (var47 == var48 && field1708[11] != var49) {
                    var47 = 0;
                    var48 = field1732[11];
                    var49 = field1708[11];
                    var50 = field1736;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2020(var49[var47++]);
                if (var47 == var48 && field1708[11] != var49) {
                    var47 = 0;
                    var48 = field1732[11];
                    var49 = field1708[11];
                    var50 = field1736;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1732[var52];
            int[] var54 = field1708[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2020(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2020(var49[var47++]);
            if (var47 == var48 && field1708[11] != var49) {
                var47 = 0;
                var49 = field1708[11];
                var48 = field1732[11];
                var50 = field1736;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cx.f(I)V")
    public final void method2020(int arg0) {
        if (field1748[arg0]) {
            this.method1988(arg0);
            return;
        }
        int var2 = this.field1691[arg0];
        int var3 = this.field1698[arg0];
        int var4 = this.field1737[arg0];
        class84.field1475 = field1722[arg0];
        if (this.field1697 == null) {
            class84.field1460 = 0;
        } else {
            class84.field1460 = this.field1697[arg0] & 0xFF;
        }
        if (this.field1706 != null && this.field1706[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1705 == null || this.field1705[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1705[arg0] & 0xFF;
                var6 = this.field1709[var5];
                var7 = this.field1710[var5];
                var8 = this.field1711[var5];
            }
            if (this.field1702[arg0] == -1) {
                class84.method1786(field1724[var2], field1724[var3], field1724[var4], field1723[var2], field1723[var3], field1723[var4], this.field1700[arg0], this.field1700[arg0], this.field1700[arg0], field1726[var6], field1726[var7], field1726[var8], field1727[var6], field1727[var7], field1727[var8], field1690[var6], field1690[var7], field1690[var8], this.field1706[arg0]);
            } else {
                class84.method1786(field1724[var2], field1724[var3], field1724[var4], field1723[var2], field1723[var3], field1723[var4], this.field1700[arg0], this.field1701[arg0], this.field1702[arg0], field1726[var6], field1726[var7], field1726[var8], field1727[var6], field1727[var7], field1727[var8], field1690[var6], field1690[var7], field1690[var8], this.field1706[arg0]);
            }
        } else if (this.field1702[arg0] == -1) {
            class84.method1784(field1724[var2], field1724[var3], field1724[var4], field1723[var2], field1723[var3], field1723[var4], field1750[this.field1700[arg0]]);
        } else {
            class84.method1772(field1724[var2], field1724[var3], field1724[var4], field1723[var2], field1723[var3], field1723[var4], this.field1700[arg0], this.field1701[arg0], this.field1702[arg0]);
        }
    }

    @ObfuscatedName("cx.e(I)V")
    public final void method1988(int arg0) {
        int var2 = Statics.field1470;
        int var3 = Statics.field1471;
        int var4 = 0;
        int var5 = this.field1691[arg0];
        int var6 = this.field1698[arg0];
        int var7 = this.field1737[arg0];
        int var8 = field1690[var5];
        int var9 = field1690[var6];
        int var10 = field1690[var7];
        if (this.field1697 == null) {
            class84.field1460 = 0;
        } else {
            class84.field1460 = this.field1697[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1753[var4] = field1723[var5];
            field1738[var4] = field1724[var5];
            field1739[var4++] = this.field1700[arg0];
        } else {
            int var11 = field1726[var5];
            int var12 = field1727[var5];
            int var13 = this.field1700[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1751[var10 - var8];
                field1753[var4] = (((field1726[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1738[var4] = (((field1727[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1739[var4++] = ((this.field1702[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1751[var9 - var8];
                field1753[var4] = (((field1726[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1738[var4] = (((field1727[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1739[var4++] = ((this.field1701[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1753[var4] = field1723[var6];
            field1738[var4] = field1724[var6];
            field1739[var4++] = this.field1701[arg0];
        } else {
            int var16 = field1726[var6];
            int var17 = field1727[var6];
            int var18 = this.field1701[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1751[var8 - var9];
                field1753[var4] = (((field1726[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1738[var4] = (((field1727[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1739[var4++] = ((this.field1700[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1751[var10 - var9];
                field1753[var4] = (((field1726[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1738[var4] = (((field1727[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1739[var4++] = ((this.field1702[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1753[var4] = field1723[var7];
            field1738[var4] = field1724[var7];
            field1739[var4++] = this.field1702[arg0];
        } else {
            int var21 = field1726[var7];
            int var22 = field1727[var7];
            int var23 = this.field1702[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1751[var9 - var10];
                field1753[var4] = (((field1726[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1738[var4] = (((field1727[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1739[var4++] = ((this.field1701[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1751[var8 - var10];
                field1753[var4] = (((field1726[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1738[var4] = (((field1727[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1739[var4++] = ((this.field1700[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1753[0];
        int var27 = field1753[1];
        int var28 = field1753[2];
        int var29 = field1738[0];
        int var30 = field1738[1];
        int var31 = field1738[2];
        class84.field1475 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1465 || var27 > Statics.field1465 || var28 > Statics.field1465) {
                class84.field1475 = true;
            }
            if (this.field1706 != null && this.field1706[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1705 == null || this.field1705[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1705[arg0] & 0xFF;
                    var33 = this.field1709[var32];
                    var34 = this.field1710[var32];
                    var35 = this.field1711[var32];
                }
                if (this.field1702[arg0] == -1) {
                    class84.method1786(var29, var30, var31, var26, var27, var28, this.field1700[arg0], this.field1700[arg0], this.field1700[arg0], field1726[var33], field1726[var34], field1726[var35], field1727[var33], field1727[var34], field1727[var35], field1690[var33], field1690[var34], field1690[var35], this.field1706[arg0]);
                } else {
                    class84.method1786(var29, var30, var31, var26, var27, var28, field1739[0], field1739[1], field1739[2], field1726[var33], field1726[var34], field1726[var35], field1727[var33], field1727[var34], field1727[var35], field1690[var33], field1690[var34], field1690[var35], this.field1706[arg0]);
                }
            } else if (this.field1702[arg0] == -1) {
                class84.method1784(var29, var30, var31, var26, var27, var28, field1750[this.field1700[arg0]]);
            } else {
                class84.method1772(var29, var30, var31, var26, var27, var28, field1739[0], field1739[1], field1739[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1465 || var27 > Statics.field1465 || var28 > Statics.field1465 || field1753[3] < 0 || field1753[3] > Statics.field1465) {
            class84.field1475 = true;
        }
        if (this.field1706 != null && this.field1706[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1705 == null || this.field1705[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1705[arg0] & 0xFF;
                var37 = this.field1709[var36];
                var38 = this.field1710[var36];
                var39 = this.field1711[var36];
            }
            short var40 = this.field1706[arg0];
            if (this.field1702[arg0] == -1) {
                class84.method1786(var29, var30, var31, var26, var27, var28, this.field1700[arg0], this.field1700[arg0], this.field1700[arg0], field1726[var37], field1726[var38], field1726[var39], field1727[var37], field1727[var38], field1727[var39], field1690[var37], field1690[var38], field1690[var39], var40);
                class84.method1786(var29, var31, field1738[3], var26, var28, field1753[3], this.field1700[arg0], this.field1700[arg0], this.field1700[arg0], field1726[var37], field1726[var38], field1726[var39], field1727[var37], field1727[var38], field1727[var39], field1690[var37], field1690[var38], field1690[var39], var40);
            } else {
                class84.method1786(var29, var30, var31, var26, var27, var28, field1739[0], field1739[1], field1739[2], field1726[var37], field1726[var38], field1726[var39], field1727[var37], field1727[var38], field1727[var39], field1690[var37], field1690[var38], field1690[var39], var40);
                class84.method1786(var29, var31, field1738[3], var26, var28, field1753[3], field1739[0], field1739[2], field1739[3], field1726[var37], field1726[var38], field1726[var39], field1727[var37], field1727[var38], field1727[var39], field1690[var37], field1690[var38], field1690[var39], var40);
            }
        } else if (this.field1702[arg0] == -1) {
            int var41 = field1750[this.field1700[arg0]];
            class84.method1784(var29, var30, var31, var26, var27, var28, var41);
            class84.method1784(var29, var31, field1738[3], var26, var28, field1753[3], var41);
        } else {
            class84.method1772(var29, var30, var31, var26, var27, var28, field1739[0], field1739[1], field1739[2]);
            class84.method1772(var29, var31, field1738[3], var26, var28, field1753[3], field1739[0], field1739[2], field1739[3]);
        }
    }

    @ObfuscatedName("cx.q(IIIIIIII)Z")
    public final boolean method1989(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
