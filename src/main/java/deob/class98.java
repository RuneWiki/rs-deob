package deob;

@ObfuscatedName("cd")
public class class98 extends class78 {

    @ObfuscatedName("cd.e")
    public static class98 field1746 = new class98();

    @ObfuscatedName("cd.o")
    public static byte[] field1725 = new byte[1];

    @ObfuscatedName("cd.y")
    public static class98 field1740 = new class98();

    @ObfuscatedName("cd.b")
    public static byte[] field1697 = new byte[1];

    @ObfuscatedName("cd.w")
    public int field1735 = 0;

    @ObfuscatedName("cd.r")
    public int[] field1699;

    @ObfuscatedName("cd.l")
    public int[] field1700;

    @ObfuscatedName("cd.s")
    public int[] field1701;

    @ObfuscatedName("cd.f")
    public int field1702 = 0;

    @ObfuscatedName("cd.x")
    public int[] field1703;

    @ObfuscatedName("cd.h")
    public int[] field1704;

    @ObfuscatedName("cd.a")
    public int[] field1705;

    @ObfuscatedName("cd.u")
    public int[] field1706;

    @ObfuscatedName("cd.v")
    public int[] field1707;

    @ObfuscatedName("cd.i")
    public int[] field1708;

    @ObfuscatedName("cd.n")
    public byte[] field1731;

    @ObfuscatedName("cd.d")
    public byte[] field1719;

    @ObfuscatedName("cd.k")
    public byte[] field1715;

    @ObfuscatedName("cd.p")
    public short[] field1712;

    @ObfuscatedName("cd.j")
    public byte field1737 = 0;

    @ObfuscatedName("cd.z")
    public int field1749 = 0;

    @ObfuscatedName("cd.t")
    public int[] field1695;

    @ObfuscatedName("cd.c")
    public int[] field1716;

    @ObfuscatedName("cd.q")
    public int[] field1717;

    @ObfuscatedName("cd.g")
    public int[][] field1729;

    @ObfuscatedName("cd.m")
    public int[][] field1759;

    @ObfuscatedName("cd.ay")
    public boolean field1720 = false;

    @ObfuscatedName("cd.ae")
    public int field1721;

    @ObfuscatedName("cd.af")
    public int field1722;

    @ObfuscatedName("cd.ab")
    public int field1694;

    @ObfuscatedName("cd.ao")
    public int field1724;

    @ObfuscatedName("cd.ak")
    public int field1713;

    @ObfuscatedName("cd.ai")
    public static boolean[] field1727 = new boolean[4096];

    @ObfuscatedName("cd.al")
    public static boolean[] field1728 = new boolean[4096];

    @ObfuscatedName("cd.av")
    public static int[] field1711 = new int[4096];

    @ObfuscatedName("cd.ap")
    public static int[] field1730 = new int[4096];

    @ObfuscatedName("cd.ar")
    public static int[] field1696 = new int[4096];

    @ObfuscatedName("cd.au")
    public static int[] field1732 = new int[4096];

    @ObfuscatedName("cd.aq")
    public static int[] field1718 = new int[4096];

    @ObfuscatedName("cd.at")
    public static int[] field1734 = new int[4096];

    @ObfuscatedName("cd.am")
    public static int[] field1709 = new int[1600];

    @ObfuscatedName("cd.aw")
    public static int[][] field1723 = new int[1600][512];

    @ObfuscatedName("cd.ac")
    public static int[] field1738 = new int[12];

    @ObfuscatedName("cd.as")
    public static int[][] field1739 = new int[12][2000];

    @ObfuscatedName("cd.az")
    public static int[] field1758 = new int[2000];

    @ObfuscatedName("cd.ad")
    public static int[] field1714 = new int[2000];

    @ObfuscatedName("cd.ax")
    public static int[] field1742 = new int[12];

    @ObfuscatedName("cd.aa")
    public static int[] field1743 = new int[10];

    @ObfuscatedName("cd.aj")
    public static int[] field1744 = new int[10];

    @ObfuscatedName("cd.an")
    public static int[] field1745 = new int[10];

    @ObfuscatedName("cd.bt")
    public static boolean field1698 = false;

    @ObfuscatedName("cd.bo")
    public static int field1750 = 0;

    @ObfuscatedName("cd.bu")
    public static int field1751 = 0;

    @ObfuscatedName("cd.bh")
    public static int field1752 = 0;

    @ObfuscatedName("cd.bc")
    public static int[] field1753 = new int[1000];

    @ObfuscatedName("cd.bn")
    public static int[] field1754 = class84.field1465;

    @ObfuscatedName("cd.by")
    public static int[] field1755 = class84.field1486;

    @ObfuscatedName("cd.be")
    public static int[] field1756 = class84.field1481;

    @ObfuscatedName("cd.bd")
    public static int[] field1757 = class84.field1484;

    public class98() {
    }

    public class98(class98[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1735 = 0;
        this.field1702 = 0;
        this.field1749 = 0;
        this.field1737 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class98 var8 = arg0[var7];
            if (var8 != null) {
                this.field1735 += var8.field1735;
                this.field1702 += var8.field1702;
                this.field1749 += var8.field1749;
                if (var8.field1731 == null) {
                    if (this.field1737 == -1) {
                        this.field1737 = var8.field1737;
                    }
                    if (this.field1737 != var8.field1737) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1719 != null;
                var5 |= var8.field1712 != null;
                var6 |= var8.field1715 != null;
            }
        }
        this.field1699 = new int[this.field1735];
        this.field1700 = new int[this.field1735];
        this.field1701 = new int[this.field1735];
        this.field1703 = new int[this.field1702];
        this.field1704 = new int[this.field1702];
        this.field1705 = new int[this.field1702];
        this.field1706 = new int[this.field1702];
        this.field1707 = new int[this.field1702];
        this.field1708 = new int[this.field1702];
        if (var3) {
            this.field1731 = new byte[this.field1702];
        }
        if (var4) {
            this.field1719 = new byte[this.field1702];
        }
        if (var5) {
            this.field1712 = new short[this.field1702];
        }
        if (var6) {
            this.field1715 = new byte[this.field1702];
        }
        if (this.field1749 > 0) {
            this.field1695 = new int[this.field1749];
            this.field1716 = new int[this.field1749];
            this.field1717 = new int[this.field1749];
        }
        this.field1735 = 0;
        this.field1702 = 0;
        this.field1749 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class98 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1702; var11++) {
                    this.field1703[this.field1702] = var10.field1703[var11] + this.field1735;
                    this.field1704[this.field1702] = var10.field1704[var11] + this.field1735;
                    this.field1705[this.field1702] = var10.field1705[var11] + this.field1735;
                    this.field1706[this.field1702] = var10.field1706[var11];
                    this.field1707[this.field1702] = var10.field1707[var11];
                    this.field1708[this.field1702] = var10.field1708[var11];
                    if (var3) {
                        if (var10.field1731 == null) {
                            this.field1731[this.field1702] = var10.field1737;
                        } else {
                            this.field1731[this.field1702] = var10.field1731[var11];
                        }
                    }
                    if (var4 && var10.field1719 != null) {
                        this.field1719[this.field1702] = var10.field1719[var11];
                    }
                    if (var5) {
                        if (var10.field1712 == null) {
                            this.field1712[this.field1702] = -1;
                        } else {
                            this.field1712[this.field1702] = var10.field1712[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1715 == null || var10.field1715[var11] == -1) {
                            this.field1715[this.field1702] = -1;
                        } else {
                            this.field1715[this.field1702] = (byte) (var10.field1715[var11] + this.field1749);
                        }
                    }
                    this.field1702++;
                }
                for (int var12 = 0; var12 < var10.field1749; var12++) {
                    this.field1695[this.field1749] = var10.field1695[var12] + this.field1735;
                    this.field1716[this.field1749] = var10.field1716[var12] + this.field1735;
                    this.field1717[this.field1749] = var10.field1717[var12] + this.field1735;
                    this.field1749++;
                }
                for (int var13 = 0; var13 < var10.field1735; var13++) {
                    this.field1699[this.field1735] = var10.field1699[var13];
                    this.field1700[this.field1735] = var10.field1700[var13];
                    this.field1701[this.field1735] = var10.field1701[var13];
                    this.field1735++;
                }
            }
        }
    }

    @ObfuscatedName("cd.e([[IIIIZI)Lcd;")
    public class98 method1960(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1923();
        int var7 = arg1 - this.field1694;
        int var8 = this.field1694 + arg1;
        int var9 = arg3 - this.field1694;
        int var10 = this.field1694 + arg3;
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
            var15.field1735 = this.field1735;
            var15.field1702 = this.field1702;
            var15.field1749 = this.field1749;
            var15.field1699 = this.field1699;
            var15.field1701 = this.field1701;
            var15.field1703 = this.field1703;
            var15.field1704 = this.field1704;
            var15.field1705 = this.field1705;
            var15.field1706 = this.field1706;
            var15.field1707 = this.field1707;
            var15.field1708 = this.field1708;
            var15.field1731 = this.field1731;
            var15.field1719 = this.field1719;
            var15.field1715 = this.field1715;
            var15.field1712 = this.field1712;
            var15.field1737 = this.field1737;
            var15.field1695 = this.field1695;
            var15.field1716 = this.field1716;
            var15.field1717 = this.field1717;
            var15.field1729 = this.field1729;
            var15.field1759 = this.field1759;
            var15.field1720 = this.field1720;
            var15.field1700 = new int[var15.field1735];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1735; var16++) {
                int var17 = this.field1699[var16] + arg1;
                int var18 = this.field1701[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1700[var16] = this.field1700[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1735; var26++) {
                int var27 = (-this.field1700[var26] << 16) / this.field1353;
                if (var27 < arg5) {
                    int var28 = this.field1699[var26] + arg1;
                    int var29 = this.field1701[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1700[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1700[var26];
                }
            }
        }
        var15.field1721 = 0;
        return var15;
    }

    @ObfuscatedName("cd.y(Z)Lcd;")
    public class98 method1924(boolean arg0) {
        if (!arg0 && field1725.length < this.field1702) {
            field1725 = new byte[this.field1702 + 100];
        }
        return this.method1926(arg0, field1746, field1725);
    }

    @ObfuscatedName("cd.b(Z)Lcd;")
    public class98 method1925(boolean arg0) {
        if (!arg0 && field1697.length < this.field1702) {
            field1697 = new byte[this.field1702 + 100];
        }
        return this.method1926(arg0, field1740, field1697);
    }

    @ObfuscatedName("cd.r(ZLcd;[B)Lcd;")
    public class98 method1926(boolean arg0, class98 arg1, byte[] arg2) {
        arg1.field1735 = this.field1735;
        arg1.field1702 = this.field1702;
        arg1.field1749 = this.field1749;
        if (arg1.field1699 == null || arg1.field1699.length < this.field1735) {
            arg1.field1699 = new int[this.field1735 + 100];
            arg1.field1700 = new int[this.field1735 + 100];
            arg1.field1701 = new int[this.field1735 + 100];
        }
        for (int var4 = 0; var4 < this.field1735; var4++) {
            arg1.field1699[var4] = this.field1699[var4];
            arg1.field1700[var4] = this.field1700[var4];
            arg1.field1701[var4] = this.field1701[var4];
        }
        if (arg0) {
            arg1.field1719 = this.field1719;
        } else {
            arg1.field1719 = arg2;
            if (this.field1719 == null) {
                for (int var5 = 0; var5 < this.field1702; var5++) {
                    arg1.field1719[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1702; var6++) {
                    arg1.field1719[var6] = this.field1719[var6];
                }
            }
        }
        arg1.field1703 = this.field1703;
        arg1.field1704 = this.field1704;
        arg1.field1705 = this.field1705;
        arg1.field1706 = this.field1706;
        arg1.field1707 = this.field1707;
        arg1.field1708 = this.field1708;
        arg1.field1731 = this.field1731;
        arg1.field1715 = this.field1715;
        arg1.field1712 = this.field1712;
        arg1.field1737 = this.field1737;
        arg1.field1695 = this.field1695;
        arg1.field1716 = this.field1716;
        arg1.field1717 = this.field1717;
        arg1.field1729 = this.field1729;
        arg1.field1759 = this.field1759;
        arg1.field1720 = this.field1720;
        arg1.field1721 = 0;
        return arg1;
    }

    @ObfuscatedName("cd.l()V")
    public void method1923() {
        if (this.field1721 == 1) {
            return;
        }
        this.field1721 = 1;
        this.field1353 = 0;
        this.field1722 = 0;
        this.field1694 = 0;
        for (int var1 = 0; var1 < this.field1735; var1++) {
            int var2 = this.field1699[var1];
            int var3 = this.field1700[var1];
            int var4 = this.field1701[var1];
            if (-var3 > this.field1353) {
                this.field1353 = -var3;
            }
            if (var3 > this.field1722) {
                this.field1722 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1694) {
                this.field1694 = var5;
            }
        }
        this.field1694 = (int) (Math.sqrt((double) this.field1694) + 0.99D);
        this.field1713 = (int) (Math.sqrt((double) (this.field1353 * this.field1353 + this.field1694 * this.field1694)) + 0.99D);
        this.field1724 = this.field1713 + (int) (Math.sqrt((double) (this.field1722 * this.field1722 + this.field1694 * this.field1694)) + 0.99D);
    }

    @ObfuscatedName("cd.s()V")
    public void method1975() {
        if (this.field1721 == 2) {
            return;
        }
        this.field1721 = 2;
        this.field1694 = 0;
        for (int var1 = 0; var1 < this.field1735; var1++) {
            int var2 = this.field1699[var1];
            int var3 = this.field1700[var1];
            int var4 = this.field1701[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1694) {
                this.field1694 = var5;
            }
        }
        this.field1694 = (int) (Math.sqrt((double) this.field1694) + 0.99D);
        this.field1713 = this.field1694;
        this.field1724 = this.field1694 + this.field1694;
    }

    @ObfuscatedName("cd.f()I")
    public int method1929() {
        this.method1923();
        return this.field1694;
    }

    @ObfuscatedName("cd.x(Lcg;I)V")
    public void method1930(class96 arg0, int arg1) {
        if (this.field1729 == null || arg1 == -1) {
            return;
        }
        class81 var3 = arg0.field1671[arg1];
        class95 var4 = var3.field1434;
        Statics.field1733 = 0;
        Statics.field1747 = 0;
        Statics.field1748 = 0;
        for (int var5 = 0; var5 < var3.field1435; var5++) {
            int var6 = var3.field1436[var5];
            this.method1932(var4.field1660[var6], var4.field1658[var6], var3.field1437[var5], var3.field1430[var5], var3.field1431[var5]);
        }
        this.field1721 = 0;
    }

    @ObfuscatedName("cd.h(Lcg;ILcg;I[I)V")
    public void method1931(class96 arg0, int arg1, class96 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1930(arg0, arg1);
            return;
        }
        class81 var6 = arg0.field1671[arg1];
        class81 var7 = arg2.field1671[arg3];
        class95 var8 = var6.field1434;
        Statics.field1733 = 0;
        Statics.field1747 = 0;
        Statics.field1748 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1435; var11++) {
            int var12 = var6.field1436[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1660[var12] == 0) {
                this.method1932(var8.field1660[var12], var8.field1658[var12], var6.field1437[var11], var6.field1430[var11], var6.field1431[var11]);
            }
        }
        Statics.field1733 = 0;
        Statics.field1747 = 0;
        Statics.field1748 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1435; var15++) {
            int var16 = var7.field1436[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1660[var16] == 0) {
                this.method1932(var8.field1660[var16], var8.field1658[var16], var7.field1437[var15], var7.field1430[var15], var7.field1431[var15]);
            }
        }
        this.field1721 = 0;
    }

    @ObfuscatedName("cd.a(I[IIII)V")
    public void method1932(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1733 = 0;
            Statics.field1747 = 0;
            Statics.field1748 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1729.length) {
                    int[] var10 = this.field1729[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1733 += this.field1699[var12];
                        Statics.field1747 += this.field1700[var12];
                        Statics.field1748 += this.field1701[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1733 = Statics.field1733 / var7 + arg2;
                Statics.field1747 = Statics.field1747 / var7 + arg3;
                Statics.field1748 = Statics.field1748 / var7 + arg4;
            } else {
                Statics.field1733 = arg2;
                Statics.field1747 = arg3;
                Statics.field1748 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1729.length) {
                    int[] var15 = this.field1729[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1699[var17] += arg2;
                        this.field1700[var17] += arg3;
                        this.field1701[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1729.length) {
                    int[] var20 = this.field1729[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1699[var22] -= Statics.field1733;
                        this.field1700[var22] -= Statics.field1747;
                        this.field1701[var22] -= Statics.field1748;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1754[var25];
                            int var27 = field1755[var25];
                            int var28 = this.field1700[var22] * var26 + this.field1699[var22] * var27 >> 16;
                            this.field1700[var22] = this.field1700[var22] * var27 - this.field1699[var22] * var26 >> 16;
                            this.field1699[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1754[var23];
                            int var30 = field1755[var23];
                            int var31 = this.field1700[var22] * var30 - this.field1701[var22] * var29 >> 16;
                            this.field1701[var22] = this.field1701[var22] * var30 + this.field1700[var22] * var29 >> 16;
                            this.field1700[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1754[var24];
                            int var33 = field1755[var24];
                            int var34 = this.field1701[var22] * var32 + this.field1699[var22] * var33 >> 16;
                            this.field1701[var22] = this.field1701[var22] * var33 - this.field1699[var22] * var32 >> 16;
                            this.field1699[var22] = var34;
                        }
                        this.field1699[var22] += Statics.field1733;
                        this.field1700[var22] += Statics.field1747;
                        this.field1701[var22] += Statics.field1748;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1729.length) {
                    int[] var37 = this.field1729[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1699[var39] -= Statics.field1733;
                        this.field1700[var39] -= Statics.field1747;
                        this.field1701[var39] -= Statics.field1748;
                        this.field1699[var39] = this.field1699[var39] * arg2 / 128;
                        this.field1700[var39] = this.field1700[var39] * arg3 / 128;
                        this.field1701[var39] = this.field1701[var39] * arg4 / 128;
                        this.field1699[var39] += Statics.field1733;
                        this.field1700[var39] += Statics.field1747;
                        this.field1701[var39] += Statics.field1748;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1759 != null && this.field1719 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1759.length) {
                    int[] var42 = this.field1759[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1719[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1719[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cd.u()V")
    public void method1933() {
        for (int var1 = 0; var1 < this.field1735; var1++) {
            int var2 = this.field1699[var1];
            this.field1699[var1] = this.field1701[var1];
            this.field1701[var1] = -var2;
        }
        this.field1721 = 0;
    }

    @ObfuscatedName("cd.v()V")
    public void method1946() {
        for (int var1 = 0; var1 < this.field1735; var1++) {
            this.field1699[var1] = -this.field1699[var1];
            this.field1701[var1] = -this.field1701[var1];
        }
        this.field1721 = 0;
    }

    @ObfuscatedName("cd.i()V")
    public void method1935() {
        for (int var1 = 0; var1 < this.field1735; var1++) {
            int var2 = this.field1701[var1];
            this.field1701[var1] = this.field1699[var1];
            this.field1699[var1] = -var2;
        }
        this.field1721 = 0;
    }

    @ObfuscatedName("cd.n(I)V")
    public void method1973(int arg0) {
        int var2 = field1754[arg0];
        int var3 = field1755[arg0];
        for (int var4 = 0; var4 < this.field1735; var4++) {
            int var5 = this.field1700[var4] * var3 - this.field1701[var4] * var2 >> 16;
            this.field1701[var4] = this.field1701[var4] * var3 + this.field1700[var4] * var2 >> 16;
            this.field1700[var4] = var5;
        }
        this.field1721 = 0;
    }

    @ObfuscatedName("cd.t(III)V")
    public void method1937(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1735; var4++) {
            this.field1699[var4] += arg0;
            this.field1700[var4] += arg1;
            this.field1701[var4] += arg2;
        }
        this.field1721 = 0;
    }

    @ObfuscatedName("cd.c(III)V")
    public void method1989(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1735; var4++) {
            this.field1699[var4] = this.field1699[var4] * arg0 / 128;
            this.field1700[var4] = this.field1700[var4] * arg1 / 128;
            this.field1701[var4] = this.field1701[var4] * arg2 / 128;
        }
        this.field1721 = 0;
    }

    @ObfuscatedName("cd.q(IIIIIII)V")
    public final void method1939(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1709[0] = -1;
        if (this.field1721 != 2 && this.field1721 != 1) {
            this.method1975();
        }
        int var8 = Statics.field1472;
        int var9 = Statics.field1473;
        int var10 = field1754[arg0];
        int var11 = field1755[arg0];
        int var12 = field1754[arg1];
        int var13 = field1755[arg1];
        int var14 = field1754[arg2];
        int var15 = field1755[arg2];
        int var16 = field1754[arg3];
        int var17 = field1755[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1735; var19++) {
            int var20 = this.field1699[var19];
            int var21 = this.field1700[var19];
            int var22 = this.field1701[var19];
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
            field1696[var19] = var30 - var18;
            field1711[var19] = (var26 << 9) / var30 + var8;
            field1730[var19] = (var29 << 9) / var30 + var9;
            if (this.field1749 > 0) {
                field1732[var19] = var26;
                field1718[var19] = var29;
                field1734[var19] = var30;
            }
        }
        try {
            this.method1967(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cd.g(IIIIIIII)V")
    public final void method1940(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1709[0] = -1;
        if (this.field1721 != 2 && this.field1721 != 1) {
            this.method1975();
        }
        int var9 = Statics.field1472;
        int var10 = Statics.field1473;
        int var11 = field1754[arg0];
        int var12 = field1755[arg0];
        int var13 = field1754[arg1];
        int var14 = field1755[arg1];
        int var15 = field1754[arg2];
        int var16 = field1755[arg2];
        int var17 = field1754[arg3];
        int var18 = field1755[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1735; var20++) {
            int var21 = this.field1699[var20];
            int var22 = this.field1700[var20];
            int var23 = this.field1701[var20];
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
            field1696[var20] = var31 - var19;
            field1711[var20] = (var27 << 9) / arg7 + var9;
            field1730[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1749 > 0) {
                field1732[var20] = var27;
                field1718[var20] = var30;
                field1734[var20] = var31;
            }
        }
        try {
            this.method1967(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cd.d(IIIIIIIII)V")
    public void method1564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1709[0] = -1;
        if (this.field1721 != 1) {
            this.method1923();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1694 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1694 << 9;
        if (var15 / var13 >= Statics.field1477) {
            return;
        }
        int var16 = this.field1694 + var14 << 9;
        if (var16 / var13 <= Statics.field1485) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1694 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1480) {
            return;
        }
        int var20 = (this.field1353 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1479) {
            return;
        }
        int var22 = (this.field1353 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1749 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1698) {
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
            int var32 = field1750 - Statics.field1472;
            int var33 = field1751 - Statics.field1473;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1720) {
                    field1753[field1752++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1472;
        int var35 = Statics.field1473;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1754[arg0];
            var37 = field1755[arg0];
        }
        for (int var38 = 0; var38 < this.field1735; var38++) {
            int var39 = this.field1699[var38];
            int var40 = this.field1700[var38];
            int var41 = this.field1701[var38];
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
            field1696[var38] = var50 - var11;
            if (var50 >= 50) {
                field1711[var38] = (var46 << 9) / var50 + var34;
                field1730[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1711[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1732[var38] = var46;
                field1718[var38] = var49;
                field1734[var38] = var50;
            }
        }
        try {
            this.method1967(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cd.m(ZZI)V")
    public final void method1967(boolean arg0, boolean arg1, int arg2) {
        if (this.field1724 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1724; var4++) {
            field1709[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1702; var5++) {
            if (this.field1708[var5] != -2) {
                int var6 = this.field1703[var5];
                int var7 = this.field1704[var5];
                int var8 = this.field1705[var5];
                int var9 = field1711[var6];
                int var10 = field1711[var7];
                int var11 = field1711[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1732[var6];
                    int var13 = field1732[var7];
                    int var14 = field1732[var8];
                    int var15 = field1718[var6];
                    int var16 = field1718[var7];
                    int var17 = field1718[var8];
                    int var18 = field1734[var6];
                    int var19 = field1734[var7];
                    int var20 = field1734[var8];
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
                        field1728[var5] = true;
                        int var30 = (field1696[var6] + field1696[var7] + field1696[var8]) / 3 + this.field1713;
                        field1723[var30][field1709[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method1961(field1750, field1751, field1730[var6], field1730[var7], field1730[var8], var9, var10, var11)) {
                        field1753[field1752++] = arg2;
                        arg1 = false;
                    }
                    if ((field1730[var8] - field1730[var7]) * (var9 - var10) - (field1730[var6] - field1730[var7]) * (var11 - var10) > 0) {
                        field1728[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1474 && var10 <= Statics.field1474 && var11 <= Statics.field1474) {
                            field1727[var5] = false;
                        } else {
                            field1727[var5] = true;
                        }
                        int var31 = (field1696[var6] + field1696[var7] + field1696[var8]) / 3 + this.field1713;
                        field1723[var31][field1709[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1731 == null) {
            for (int var32 = this.field1724 - 1; var32 >= 0; var32--) {
                int var33 = field1709[var32];
                if (var33 > 0) {
                    int[] var34 = field1723[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method1941(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1738[var36] = 0;
            field1742[var36] = 0;
        }
        for (int var37 = this.field1724 - 1; var37 >= 0; var37--) {
            int var38 = field1709[var37];
            if (var38 > 0) {
                int[] var39 = field1723[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1731[var41];
                    int var43 = field1738[var42]++;
                    field1739[var42][var43] = var41;
                    if (var42 < 10) {
                        field1742[var42] += var37;
                    } else if (var42 == 10) {
                        field1758[var43] = var37;
                    } else {
                        field1714[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1738[1] > 0 || field1738[2] > 0) {
            var44 = (field1742[1] + field1742[2]) / (field1738[1] + field1738[2]);
        }
        int var45 = 0;
        if (field1738[3] > 0 || field1738[4] > 0) {
            var45 = (field1742[3] + field1742[4]) / (field1738[3] + field1738[4]);
        }
        int var46 = 0;
        if (field1738[6] > 0 || field1738[8] > 0) {
            var46 = (field1742[6] + field1742[8]) / (field1738[6] + field1738[8]);
        }
        int var47 = 0;
        int var48 = field1738[10];
        int[] var49 = field1739[10];
        int[] var50 = field1758;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1738[11];
            var49 = field1739[11];
            var50 = field1714;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method1941(var49[var47++]);
                if (var47 == var48 && field1739[11] != var49) {
                    var47 = 0;
                    var48 = field1738[11];
                    var49 = field1739[11];
                    var50 = field1714;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method1941(var49[var47++]);
                if (var47 == var48 && field1739[11] != var49) {
                    var47 = 0;
                    var48 = field1738[11];
                    var49 = field1739[11];
                    var50 = field1714;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method1941(var49[var47++]);
                if (var47 == var48 && field1739[11] != var49) {
                    var47 = 0;
                    var48 = field1738[11];
                    var49 = field1739[11];
                    var50 = field1714;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1738[var52];
            int[] var54 = field1739[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method1941(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method1941(var49[var47++]);
            if (var47 == var48 && field1739[11] != var49) {
                var47 = 0;
                var49 = field1739[11];
                var48 = field1738[11];
                var50 = field1714;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cd.ay(I)V")
    public final void method1941(int arg0) {
        if (field1728[arg0]) {
            this.method1942(arg0);
            return;
        }
        int var2 = this.field1703[arg0];
        int var3 = this.field1704[arg0];
        int var4 = this.field1705[arg0];
        class84.field1471 = field1727[arg0];
        if (this.field1719 == null) {
            class84.field1466 = 0;
        } else {
            class84.field1466 = this.field1719[arg0] & 0xFF;
        }
        if (this.field1712 != null && this.field1712[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1715 == null || this.field1715[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1715[arg0] & 0xFF;
                var6 = this.field1695[var5];
                var7 = this.field1716[var5];
                var8 = this.field1717[var5];
            }
            if (this.field1708[arg0] == -1) {
                class84.method1758(field1730[var2], field1730[var3], field1730[var4], field1711[var2], field1711[var3], field1711[var4], this.field1706[arg0], this.field1706[arg0], this.field1706[arg0], field1732[var6], field1732[var7], field1732[var8], field1718[var6], field1718[var7], field1718[var8], field1734[var6], field1734[var7], field1734[var8], this.field1712[arg0]);
            } else {
                class84.method1758(field1730[var2], field1730[var3], field1730[var4], field1711[var2], field1711[var3], field1711[var4], this.field1706[arg0], this.field1707[arg0], this.field1708[arg0], field1732[var6], field1732[var7], field1732[var8], field1718[var6], field1718[var7], field1718[var8], field1734[var6], field1734[var7], field1734[var8], this.field1712[arg0]);
            }
        } else if (this.field1708[arg0] == -1) {
            class84.method1749(field1730[var2], field1730[var3], field1730[var4], field1711[var2], field1711[var3], field1711[var4], field1756[this.field1706[arg0]]);
        } else {
            class84.method1747(field1730[var2], field1730[var3], field1730[var4], field1711[var2], field1711[var3], field1711[var4], this.field1706[arg0], this.field1707[arg0], this.field1708[arg0]);
        }
    }

    @ObfuscatedName("cd.ae(I)V")
    public final void method1942(int arg0) {
        int var2 = Statics.field1472;
        int var3 = Statics.field1473;
        int var4 = 0;
        int var5 = this.field1703[arg0];
        int var6 = this.field1704[arg0];
        int var7 = this.field1705[arg0];
        int var8 = field1734[var5];
        int var9 = field1734[var6];
        int var10 = field1734[var7];
        if (this.field1719 == null) {
            class84.field1466 = 0;
        } else {
            class84.field1466 = this.field1719[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1743[var4] = field1711[var5];
            field1744[var4] = field1730[var5];
            field1745[var4++] = this.field1706[arg0];
        } else {
            int var11 = field1732[var5];
            int var12 = field1718[var5];
            int var13 = this.field1706[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1757[var10 - var8];
                field1743[var4] = (((field1732[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1744[var4] = (((field1718[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1745[var4++] = ((this.field1708[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1757[var9 - var8];
                field1743[var4] = (((field1732[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1744[var4] = (((field1718[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1745[var4++] = ((this.field1707[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1743[var4] = field1711[var6];
            field1744[var4] = field1730[var6];
            field1745[var4++] = this.field1707[arg0];
        } else {
            int var16 = field1732[var6];
            int var17 = field1718[var6];
            int var18 = this.field1707[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1757[var8 - var9];
                field1743[var4] = (((field1732[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1744[var4] = (((field1718[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1745[var4++] = ((this.field1706[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1757[var10 - var9];
                field1743[var4] = (((field1732[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1744[var4] = (((field1718[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1745[var4++] = ((this.field1708[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1743[var4] = field1711[var7];
            field1744[var4] = field1730[var7];
            field1745[var4++] = this.field1708[arg0];
        } else {
            int var21 = field1732[var7];
            int var22 = field1718[var7];
            int var23 = this.field1708[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1757[var9 - var10];
                field1743[var4] = (((field1732[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1744[var4] = (((field1718[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1745[var4++] = ((this.field1707[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1757[var8 - var10];
                field1743[var4] = (((field1732[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1744[var4] = (((field1718[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1745[var4++] = ((this.field1706[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1743[0];
        int var27 = field1743[1];
        int var28 = field1743[2];
        int var29 = field1744[0];
        int var30 = field1744[1];
        int var31 = field1744[2];
        class84.field1471 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1474 || var27 > Statics.field1474 || var28 > Statics.field1474) {
                class84.field1471 = true;
            }
            if (this.field1712 != null && this.field1712[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1715 == null || this.field1715[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1715[arg0] & 0xFF;
                    var33 = this.field1695[var32];
                    var34 = this.field1716[var32];
                    var35 = this.field1717[var32];
                }
                if (this.field1708[arg0] == -1) {
                    class84.method1758(var29, var30, var31, var26, var27, var28, this.field1706[arg0], this.field1706[arg0], this.field1706[arg0], field1732[var33], field1732[var34], field1732[var35], field1718[var33], field1718[var34], field1718[var35], field1734[var33], field1734[var34], field1734[var35], this.field1712[arg0]);
                } else {
                    class84.method1758(var29, var30, var31, var26, var27, var28, field1745[0], field1745[1], field1745[2], field1732[var33], field1732[var34], field1732[var35], field1718[var33], field1718[var34], field1718[var35], field1734[var33], field1734[var34], field1734[var35], this.field1712[arg0]);
                }
            } else if (this.field1708[arg0] == -1) {
                class84.method1749(var29, var30, var31, var26, var27, var28, field1756[this.field1706[arg0]]);
            } else {
                class84.method1747(var29, var30, var31, var26, var27, var28, field1745[0], field1745[1], field1745[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1474 || var27 > Statics.field1474 || var28 > Statics.field1474 || field1743[3] < 0 || field1743[3] > Statics.field1474) {
            class84.field1471 = true;
        }
        if (this.field1712 != null && this.field1712[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1715 == null || this.field1715[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1715[arg0] & 0xFF;
                var37 = this.field1695[var36];
                var38 = this.field1716[var36];
                var39 = this.field1717[var36];
            }
            short var40 = this.field1712[arg0];
            if (this.field1708[arg0] == -1) {
                class84.method1758(var29, var30, var31, var26, var27, var28, this.field1706[arg0], this.field1706[arg0], this.field1706[arg0], field1732[var37], field1732[var38], field1732[var39], field1718[var37], field1718[var38], field1718[var39], field1734[var37], field1734[var38], field1734[var39], var40);
                class84.method1758(var29, var31, field1744[3], var26, var28, field1743[3], this.field1706[arg0], this.field1706[arg0], this.field1706[arg0], field1732[var37], field1732[var38], field1732[var39], field1718[var37], field1718[var38], field1718[var39], field1734[var37], field1734[var38], field1734[var39], var40);
            } else {
                class84.method1758(var29, var30, var31, var26, var27, var28, field1745[0], field1745[1], field1745[2], field1732[var37], field1732[var38], field1732[var39], field1718[var37], field1718[var38], field1718[var39], field1734[var37], field1734[var38], field1734[var39], var40);
                class84.method1758(var29, var31, field1744[3], var26, var28, field1743[3], field1745[0], field1745[2], field1745[3], field1732[var37], field1732[var38], field1732[var39], field1718[var37], field1718[var38], field1718[var39], field1734[var37], field1734[var38], field1734[var39], var40);
            }
        } else if (this.field1708[arg0] == -1) {
            int var41 = field1756[this.field1706[arg0]];
            class84.method1749(var29, var30, var31, var26, var27, var28, var41);
            class84.method1749(var29, var31, field1744[3], var26, var28, field1743[3], var41);
        } else {
            class84.method1747(var29, var30, var31, var26, var27, var28, field1745[0], field1745[1], field1745[2]);
            class84.method1747(var29, var31, field1744[3], var26, var28, field1743[3], field1745[0], field1745[2], field1745[3]);
        }
    }

    @ObfuscatedName("cd.af(IIIIIIII)Z")
    public final boolean method1961(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
