package deob;

@ObfuscatedName("cn")
public class class98 extends class78 {

    @ObfuscatedName("cn.p")
    public static class98 field1760 = new class98();

    @ObfuscatedName("cn.g")
    public static byte[] field1732 = new byte[1];

    @ObfuscatedName("cn.x")
    public static class98 field1699 = new class98();

    @ObfuscatedName("cn.c")
    public static byte[] field1700 = new byte[1];

    @ObfuscatedName("cn.n")
    public int field1701 = 0;

    @ObfuscatedName("cn.s")
    public int[] field1741;

    @ObfuscatedName("cn.r")
    public int[] field1703;

    @ObfuscatedName("cn.w")
    public int[] field1718;

    @ObfuscatedName("cn.u")
    public int field1705 = 0;

    @ObfuscatedName("cn.d")
    public int[] field1706;

    @ObfuscatedName("cn.h")
    public int[] field1707;

    @ObfuscatedName("cn.a")
    public int[] field1708;

    @ObfuscatedName("cn.y")
    public int[] field1709;

    @ObfuscatedName("cn.v")
    public int[] field1704;

    @ObfuscatedName("cn.e")
    public int[] field1711;

    @ObfuscatedName("cn.b")
    public byte[] field1712;

    @ObfuscatedName("cn.z")
    public byte[] field1713;

    @ObfuscatedName("cn.l")
    public byte[] field1750;

    @ObfuscatedName("cn.t")
    public short[] field1733;

    @ObfuscatedName("cn.q")
    public byte field1716 = 0;

    @ObfuscatedName("cn.j")
    public int field1717 = 0;

    @ObfuscatedName("cn.o")
    public int[] field1736;

    @ObfuscatedName("cn.i")
    public int[] field1728;

    @ObfuscatedName("cn.m")
    public int[] field1720;

    @ObfuscatedName("cn.f")
    public int[][] field1721;

    @ObfuscatedName("cn.k")
    public int[][] field1722;

    @ObfuscatedName("cn.an")
    public boolean field1719 = false;

    @ObfuscatedName("cn.aw")
    public int field1724;

    @ObfuscatedName("cn.at")
    public int field1697;

    @ObfuscatedName("cn.al")
    public int field1726;

    @ObfuscatedName("cn.as")
    public int field1727;

    @ObfuscatedName("cn.ak")
    public int field1755;

    @ObfuscatedName("cn.ao")
    public static boolean[] field1758 = new boolean[4096];

    @ObfuscatedName("cn.af")
    public static boolean[] field1731 = new boolean[4096];

    @ObfuscatedName("cn.aj")
    public static int[] field1715 = new int[4096];

    @ObfuscatedName("cn.az")
    public static int[] field1730 = new int[4096];

    @ObfuscatedName("cn.ae")
    public static int[] field1734 = new int[4096];

    @ObfuscatedName("cn.av")
    public static int[] field1735 = new int[4096];

    @ObfuscatedName("cn.ax")
    public static int[] field1714 = new int[4096];

    @ObfuscatedName("cn.ai")
    public static int[] field1737 = new int[4096];

    @ObfuscatedName("cn.ad")
    public static int[] field1751 = new int[1600];

    @ObfuscatedName("cn.au")
    public static int[][] field1725 = new int[1600][512];

    @ObfuscatedName("cn.ag")
    public static int[] field1723 = new int[12];

    @ObfuscatedName("cn.ar")
    public static int[][] field1742 = new int[12][2000];

    @ObfuscatedName("cn.am")
    public static int[] field1743 = new int[2000];

    @ObfuscatedName("cn.ab")
    public static int[] field1744 = new int[2000];

    @ObfuscatedName("cn.ac")
    public static int[] field1745 = new int[12];

    @ObfuscatedName("cn.ah")
    public static int[] field1746 = new int[10];

    @ObfuscatedName("cn.ay")
    public static int[] field1747 = new int[10];

    @ObfuscatedName("cn.ap")
    public static int[] field1748 = new int[10];

    @ObfuscatedName("cn.bp")
    public static boolean field1752 = false;

    @ObfuscatedName("cn.bc")
    public static int field1753 = 0;

    @ObfuscatedName("cn.bd")
    public static int field1754 = 0;

    @ObfuscatedName("cn.bk")
    public static int field1740 = 0;

    @ObfuscatedName("cn.bn")
    public static int[] field1756 = new int[1000];

    @ObfuscatedName("cn.bt")
    public static int[] field1757 = class84.field1489;

    @ObfuscatedName("cn.bz")
    public static int[] field1698 = class84.field1470;

    @ObfuscatedName("cn.bh")
    public static int[] field1759 = class84.field1476;

    @ObfuscatedName("cn.bo")
    public static int[] field1710 = class84.field1488;

    public class98() {
    }

    public class98(class98[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1701 = 0;
        this.field1705 = 0;
        this.field1717 = 0;
        this.field1716 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class98 var8 = arg0[var7];
            if (var8 != null) {
                this.field1701 += var8.field1701;
                this.field1705 += var8.field1705;
                this.field1717 += var8.field1717;
                if (var8.field1712 == null) {
                    if (this.field1716 == -1) {
                        this.field1716 = var8.field1716;
                    }
                    if (this.field1716 != var8.field1716) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1713 != null;
                var5 |= var8.field1733 != null;
                var6 |= var8.field1750 != null;
            }
        }
        this.field1741 = new int[this.field1701];
        this.field1703 = new int[this.field1701];
        this.field1718 = new int[this.field1701];
        this.field1706 = new int[this.field1705];
        this.field1707 = new int[this.field1705];
        this.field1708 = new int[this.field1705];
        this.field1709 = new int[this.field1705];
        this.field1704 = new int[this.field1705];
        this.field1711 = new int[this.field1705];
        if (var3) {
            this.field1712 = new byte[this.field1705];
        }
        if (var4) {
            this.field1713 = new byte[this.field1705];
        }
        if (var5) {
            this.field1733 = new short[this.field1705];
        }
        if (var6) {
            this.field1750 = new byte[this.field1705];
        }
        if (this.field1717 > 0) {
            this.field1736 = new int[this.field1717];
            this.field1728 = new int[this.field1717];
            this.field1720 = new int[this.field1717];
        }
        this.field1701 = 0;
        this.field1705 = 0;
        this.field1717 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class98 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1705; var11++) {
                    this.field1706[this.field1705] = var10.field1706[var11] + this.field1701;
                    this.field1707[this.field1705] = var10.field1707[var11] + this.field1701;
                    this.field1708[this.field1705] = var10.field1708[var11] + this.field1701;
                    this.field1709[this.field1705] = var10.field1709[var11];
                    this.field1704[this.field1705] = var10.field1704[var11];
                    this.field1711[this.field1705] = var10.field1711[var11];
                    if (var3) {
                        if (var10.field1712 == null) {
                            this.field1712[this.field1705] = var10.field1716;
                        } else {
                            this.field1712[this.field1705] = var10.field1712[var11];
                        }
                    }
                    if (var4 && var10.field1713 != null) {
                        this.field1713[this.field1705] = var10.field1713[var11];
                    }
                    if (var5) {
                        if (var10.field1733 == null) {
                            this.field1733[this.field1705] = -1;
                        } else {
                            this.field1733[this.field1705] = var10.field1733[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1750 == null || var10.field1750[var11] == -1) {
                            this.field1750[this.field1705] = -1;
                        } else {
                            this.field1750[this.field1705] = (byte) (var10.field1750[var11] + this.field1717);
                        }
                    }
                    this.field1705++;
                }
                for (int var12 = 0; var12 < var10.field1717; var12++) {
                    this.field1736[this.field1717] = var10.field1736[var12] + this.field1701;
                    this.field1728[this.field1717] = var10.field1728[var12] + this.field1701;
                    this.field1720[this.field1717] = var10.field1720[var12] + this.field1701;
                    this.field1717++;
                }
                for (int var13 = 0; var13 < var10.field1701; var13++) {
                    this.field1741[this.field1701] = var10.field1741[var13];
                    this.field1703[this.field1701] = var10.field1703[var13];
                    this.field1718[this.field1701] = var10.field1718[var13];
                    this.field1701++;
                }
            }
        }
    }

    @ObfuscatedName("cn.p([[IIIIZI)Lcn;")
    public class98 method2030(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2034();
        int var7 = arg1 - this.field1726;
        int var8 = this.field1726 + arg1;
        int var9 = arg3 - this.field1726;
        int var10 = this.field1726 + arg3;
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
            var15.field1701 = this.field1701;
            var15.field1705 = this.field1705;
            var15.field1717 = this.field1717;
            var15.field1741 = this.field1741;
            var15.field1718 = this.field1718;
            var15.field1706 = this.field1706;
            var15.field1707 = this.field1707;
            var15.field1708 = this.field1708;
            var15.field1709 = this.field1709;
            var15.field1704 = this.field1704;
            var15.field1711 = this.field1711;
            var15.field1712 = this.field1712;
            var15.field1713 = this.field1713;
            var15.field1750 = this.field1750;
            var15.field1733 = this.field1733;
            var15.field1716 = this.field1716;
            var15.field1736 = this.field1736;
            var15.field1728 = this.field1728;
            var15.field1720 = this.field1720;
            var15.field1721 = this.field1721;
            var15.field1722 = this.field1722;
            var15.field1719 = this.field1719;
            var15.field1703 = new int[var15.field1701];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1701; var16++) {
                int var17 = this.field1741[var16] + arg1;
                int var18 = this.field1718[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1703[var16] = this.field1703[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1701; var26++) {
                int var27 = (-this.field1703[var26] << 16) / this.field1357;
                if (var27 < arg5) {
                    int var28 = this.field1741[var26] + arg1;
                    int var29 = this.field1718[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1703[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1703[var26];
                }
            }
        }
        var15.field1724 = 0;
        return var15;
    }

    @ObfuscatedName("cn.x(Z)Lcn;")
    public class98 method2046(boolean arg0) {
        if (!arg0 && field1732.length < this.field1705) {
            field1732 = new byte[this.field1705 + 100];
        }
        return this.method2033(arg0, field1760, field1732);
    }

    @ObfuscatedName("cn.c(Z)Lcn;")
    public class98 method2032(boolean arg0) {
        if (!arg0 && field1700.length < this.field1705) {
            field1700 = new byte[this.field1705 + 100];
        }
        return this.method2033(arg0, field1699, field1700);
    }

    @ObfuscatedName("cn.n(ZLcn;[B)Lcn;")
    public class98 method2033(boolean arg0, class98 arg1, byte[] arg2) {
        arg1.field1701 = this.field1701;
        arg1.field1705 = this.field1705;
        arg1.field1717 = this.field1717;
        if (arg1.field1741 == null || arg1.field1741.length < this.field1701) {
            arg1.field1741 = new int[this.field1701 + 100];
            arg1.field1703 = new int[this.field1701 + 100];
            arg1.field1718 = new int[this.field1701 + 100];
        }
        for (int var4 = 0; var4 < this.field1701; var4++) {
            arg1.field1741[var4] = this.field1741[var4];
            arg1.field1703[var4] = this.field1703[var4];
            arg1.field1718[var4] = this.field1718[var4];
        }
        if (arg0) {
            arg1.field1713 = this.field1713;
        } else {
            arg1.field1713 = arg2;
            if (this.field1713 == null) {
                for (int var5 = 0; var5 < this.field1705; var5++) {
                    arg1.field1713[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1705; var6++) {
                    arg1.field1713[var6] = this.field1713[var6];
                }
            }
        }
        arg1.field1706 = this.field1706;
        arg1.field1707 = this.field1707;
        arg1.field1708 = this.field1708;
        arg1.field1709 = this.field1709;
        arg1.field1704 = this.field1704;
        arg1.field1711 = this.field1711;
        arg1.field1712 = this.field1712;
        arg1.field1750 = this.field1750;
        arg1.field1733 = this.field1733;
        arg1.field1716 = this.field1716;
        arg1.field1736 = this.field1736;
        arg1.field1728 = this.field1728;
        arg1.field1720 = this.field1720;
        arg1.field1721 = this.field1721;
        arg1.field1722 = this.field1722;
        arg1.field1719 = this.field1719;
        arg1.field1724 = 0;
        return arg1;
    }

    @ObfuscatedName("cn.u()V")
    public void method2034() {
        if (this.field1724 == 1) {
            return;
        }
        this.field1724 = 1;
        this.field1357 = 0;
        this.field1697 = 0;
        this.field1726 = 0;
        for (int var1 = 0; var1 < this.field1701; var1++) {
            int var2 = this.field1741[var1];
            int var3 = this.field1703[var1];
            int var4 = this.field1718[var1];
            if (-var3 > this.field1357) {
                this.field1357 = -var3;
            }
            if (var3 > this.field1697) {
                this.field1697 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1726) {
                this.field1726 = var5;
            }
        }
        this.field1726 = (int) (Math.sqrt((double) this.field1726) + 0.99D);
        this.field1755 = (int) (Math.sqrt((double) (this.field1357 * this.field1357 + this.field1726 * this.field1726)) + 0.99D);
        this.field1727 = this.field1755 + (int) (Math.sqrt((double) (this.field1726 * this.field1726 + this.field1697 * this.field1697)) + 0.99D);
    }

    @ObfuscatedName("cn.d()V")
    public void method2056() {
        if (this.field1724 == 2) {
            return;
        }
        this.field1724 = 2;
        this.field1726 = 0;
        for (int var1 = 0; var1 < this.field1701; var1++) {
            int var2 = this.field1741[var1];
            int var3 = this.field1703[var1];
            int var4 = this.field1718[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1726) {
                this.field1726 = var5;
            }
        }
        this.field1726 = (int) (Math.sqrt((double) this.field1726) + 0.99D);
        this.field1755 = this.field1726;
        this.field1727 = this.field1726 + this.field1726;
    }

    @ObfuscatedName("cn.h()I")
    public int method2036() {
        this.method2034();
        return this.field1726;
    }

    @ObfuscatedName("cn.a(Lcz;I)V")
    public void method2059(class96 arg0, int arg1) {
        if (this.field1721 == null || arg1 == -1) {
            return;
        }
        class81 var3 = arg0.field1673[arg1];
        class95 var4 = var3.field1438;
        Statics.field1749 = 0;
        Statics.field1739 = 0;
        Statics.field1763 = 0;
        for (int var5 = 0; var5 < var3.field1439; var5++) {
            int var6 = var3.field1442[var5];
            this.method2039(var4.field1664[var6], var4.field1671[var6], var3.field1443[var5], var3.field1434[var5], var3.field1440[var5]);
        }
        this.field1724 = 0;
    }

    @ObfuscatedName("cn.y(Lcz;ILcz;I[I)V")
    public void method2057(class96 arg0, int arg1, class96 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2059(arg0, arg1);
            return;
        }
        class81 var6 = arg0.field1673[arg1];
        class81 var7 = arg2.field1673[arg3];
        class95 var8 = var6.field1438;
        Statics.field1749 = 0;
        Statics.field1739 = 0;
        Statics.field1763 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1439; var11++) {
            int var12 = var6.field1442[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1664[var12] == 0) {
                this.method2039(var8.field1664[var12], var8.field1671[var12], var6.field1443[var11], var6.field1434[var11], var6.field1440[var11]);
            }
        }
        Statics.field1749 = 0;
        Statics.field1739 = 0;
        Statics.field1763 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1439; var15++) {
            int var16 = var7.field1442[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1664[var16] == 0) {
                this.method2039(var8.field1664[var16], var8.field1671[var16], var7.field1443[var15], var7.field1434[var15], var7.field1440[var15]);
            }
        }
        this.field1724 = 0;
    }

    @ObfuscatedName("cn.v(I[IIII)V")
    public void method2039(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1749 = 0;
            Statics.field1739 = 0;
            Statics.field1763 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1721.length) {
                    int[] var10 = this.field1721[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1749 += this.field1741[var12];
                        Statics.field1739 += this.field1703[var12];
                        Statics.field1763 += this.field1718[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1749 = Statics.field1749 / var7 + arg2;
                Statics.field1739 = Statics.field1739 / var7 + arg3;
                Statics.field1763 = Statics.field1763 / var7 + arg4;
            } else {
                Statics.field1749 = arg2;
                Statics.field1739 = arg3;
                Statics.field1763 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1721.length) {
                    int[] var15 = this.field1721[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1741[var17] += arg2;
                        this.field1703[var17] += arg3;
                        this.field1718[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1721.length) {
                    int[] var20 = this.field1721[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1741[var22] -= Statics.field1749;
                        this.field1703[var22] -= Statics.field1739;
                        this.field1718[var22] -= Statics.field1763;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1757[var25];
                            int var27 = field1698[var25];
                            int var28 = this.field1741[var22] * var27 + this.field1703[var22] * var26 >> 16;
                            this.field1703[var22] = this.field1703[var22] * var27 - this.field1741[var22] * var26 >> 16;
                            this.field1741[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1757[var23];
                            int var30 = field1698[var23];
                            int var31 = this.field1703[var22] * var30 - this.field1718[var22] * var29 >> 16;
                            this.field1718[var22] = this.field1718[var22] * var30 + this.field1703[var22] * var29 >> 16;
                            this.field1703[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1757[var24];
                            int var33 = field1698[var24];
                            int var34 = this.field1741[var22] * var33 + this.field1718[var22] * var32 >> 16;
                            this.field1718[var22] = this.field1718[var22] * var33 - this.field1741[var22] * var32 >> 16;
                            this.field1741[var22] = var34;
                        }
                        this.field1741[var22] += Statics.field1749;
                        this.field1703[var22] += Statics.field1739;
                        this.field1718[var22] += Statics.field1763;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1721.length) {
                    int[] var37 = this.field1721[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1741[var39] -= Statics.field1749;
                        this.field1703[var39] -= Statics.field1739;
                        this.field1718[var39] -= Statics.field1763;
                        this.field1741[var39] = this.field1741[var39] * arg2 / 128;
                        this.field1703[var39] = this.field1703[var39] * arg3 / 128;
                        this.field1718[var39] = this.field1718[var39] * arg4 / 128;
                        this.field1741[var39] += Statics.field1749;
                        this.field1703[var39] += Statics.field1739;
                        this.field1718[var39] += Statics.field1763;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1722 != null && this.field1713 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1722.length) {
                    int[] var42 = this.field1722[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1713[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1713[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cn.e()V")
    public void method2082() {
        for (int var1 = 0; var1 < this.field1701; var1++) {
            int var2 = this.field1741[var1];
            this.field1741[var1] = this.field1718[var1];
            this.field1718[var1] = -var2;
        }
        this.field1724 = 0;
    }

    @ObfuscatedName("cn.b()V")
    public void method2041() {
        for (int var1 = 0; var1 < this.field1701; var1++) {
            this.field1741[var1] = -this.field1741[var1];
            this.field1718[var1] = -this.field1718[var1];
        }
        this.field1724 = 0;
    }

    @ObfuscatedName("cn.z()V")
    public void method2042() {
        for (int var1 = 0; var1 < this.field1701; var1++) {
            int var2 = this.field1718[var1];
            this.field1718[var1] = this.field1741[var1];
            this.field1741[var1] = -var2;
        }
        this.field1724 = 0;
    }

    @ObfuscatedName("cn.l(I)V")
    public void method2043(int arg0) {
        int var2 = field1757[arg0];
        int var3 = field1698[arg0];
        for (int var4 = 0; var4 < this.field1701; var4++) {
            int var5 = this.field1703[var4] * var3 - this.field1718[var4] * var2 >> 16;
            this.field1718[var4] = this.field1718[var4] * var3 + this.field1703[var4] * var2 >> 16;
            this.field1703[var4] = var5;
        }
        this.field1724 = 0;
    }

    @ObfuscatedName("cn.t(III)V")
    public void method2044(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1701; var4++) {
            this.field1741[var4] += arg0;
            this.field1703[var4] += arg1;
            this.field1718[var4] += arg2;
        }
        this.field1724 = 0;
    }

    @ObfuscatedName("cn.q(III)V")
    public void method2045(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1701; var4++) {
            this.field1741[var4] = this.field1741[var4] * arg0 / 128;
            this.field1703[var4] = this.field1703[var4] * arg1 / 128;
            this.field1718[var4] = this.field1718[var4] * arg2 / 128;
        }
        this.field1724 = 0;
    }

    @ObfuscatedName("cn.j(IIIIIII)V")
    public final void method2086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1751[0] = -1;
        if (this.field1724 != 2 && this.field1724 != 1) {
            this.method2056();
        }
        int var8 = Statics.field1483;
        int var9 = Statics.field1477;
        int var10 = field1757[arg0];
        int var11 = field1698[arg0];
        int var12 = field1757[arg1];
        int var13 = field1698[arg1];
        int var14 = field1757[arg2];
        int var15 = field1698[arg2];
        int var16 = field1757[arg3];
        int var17 = field1698[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1701; var19++) {
            int var20 = this.field1741[var19];
            int var21 = this.field1703[var19];
            int var22 = this.field1718[var19];
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
            field1734[var19] = var30 - var18;
            field1715[var19] = (var26 << 9) / var30 + var8;
            field1730[var19] = (var29 << 9) / var30 + var9;
            if (this.field1717 > 0) {
                field1735[var19] = var26;
                field1714[var19] = var29;
                field1737[var19] = var30;
            }
        }
        try {
            this.method2048(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cn.o(IIIIIIII)V")
    public final void method2047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1751[0] = -1;
        if (this.field1724 != 2 && this.field1724 != 1) {
            this.method2056();
        }
        int var9 = Statics.field1483;
        int var10 = Statics.field1477;
        int var11 = field1757[arg0];
        int var12 = field1698[arg0];
        int var13 = field1757[arg1];
        int var14 = field1698[arg1];
        int var15 = field1757[arg2];
        int var16 = field1698[arg2];
        int var17 = field1757[arg3];
        int var18 = field1698[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1701; var20++) {
            int var21 = this.field1741[var20];
            int var22 = this.field1703[var20];
            int var23 = this.field1718[var20];
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
            field1734[var20] = var31 - var19;
            field1715[var20] = (var27 << 9) / arg7 + var9;
            field1730[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1717 > 0) {
                field1735[var20] = var27;
                field1714[var20] = var30;
                field1737[var20] = var31;
            }
        }
        try {
            this.method2048(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cn.at(IIIIIIIII)V")
    public void method1652(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1751[0] = -1;
        if (this.field1724 != 1) {
            this.method2034();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1726 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1726 << 9;
        if (var15 / var13 >= Statics.field1481) {
            return;
        }
        int var16 = this.field1726 + var14 << 9;
        if (var16 / var13 <= Statics.field1480) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1726 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1482) {
            return;
        }
        int var20 = (this.field1357 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1471) {
            return;
        }
        int var22 = (this.field1357 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1717 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1752) {
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
            int var32 = field1753 - Statics.field1483;
            int var33 = field1754 - Statics.field1477;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1719) {
                    field1756[field1740++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1483;
        int var35 = Statics.field1477;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1757[arg0];
            var37 = field1698[arg0];
        }
        for (int var38 = 0; var38 < this.field1701; var38++) {
            int var39 = this.field1741[var38];
            int var40 = this.field1703[var38];
            int var41 = this.field1718[var38];
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
            field1734[var38] = var50 - var11;
            if (var50 >= 50) {
                field1715[var38] = (var46 << 9) / var50 + var34;
                field1730[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1715[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1735[var38] = var46;
                field1714[var38] = var49;
                field1737[var38] = var50;
            }
        }
        try {
            this.method2048(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cn.i(ZZI)V")
    public final void method2048(boolean arg0, boolean arg1, int arg2) {
        if (this.field1727 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1727; var4++) {
            field1751[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1705; var5++) {
            if (this.field1711[var5] != -2) {
                int var6 = this.field1706[var5];
                int var7 = this.field1707[var5];
                int var8 = this.field1708[var5];
                int var9 = field1715[var6];
                int var10 = field1715[var7];
                int var11 = field1715[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1735[var6];
                    int var13 = field1735[var7];
                    int var14 = field1735[var8];
                    int var15 = field1714[var6];
                    int var16 = field1714[var7];
                    int var17 = field1714[var8];
                    int var18 = field1737[var6];
                    int var19 = field1737[var7];
                    int var20 = field1737[var8];
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
                        field1731[var5] = true;
                        int var30 = (field1734[var6] + field1734[var7] + field1734[var8]) / 3 + this.field1755;
                        field1725[var30][field1751[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2051(field1753, field1754, field1730[var6], field1730[var7], field1730[var8], var9, var10, var11)) {
                        field1756[field1740++] = arg2;
                        arg1 = false;
                    }
                    if ((field1730[var8] - field1730[var7]) * (var9 - var10) - (field1730[var6] - field1730[var7]) * (var11 - var10) > 0) {
                        field1731[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1478 && var10 <= Statics.field1478 && var11 <= Statics.field1478) {
                            field1758[var5] = false;
                        } else {
                            field1758[var5] = true;
                        }
                        int var31 = (field1734[var6] + field1734[var7] + field1734[var8]) / 3 + this.field1755;
                        field1725[var31][field1751[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1712 == null) {
            for (int var32 = this.field1727 - 1; var32 >= 0; var32--) {
                int var33 = field1751[var32];
                if (var33 > 0) {
                    int[] var34 = field1725[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2069(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1723[var36] = 0;
            field1745[var36] = 0;
        }
        for (int var37 = this.field1727 - 1; var37 >= 0; var37--) {
            int var38 = field1751[var37];
            if (var38 > 0) {
                int[] var39 = field1725[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1712[var41];
                    int var43 = field1723[var42]++;
                    field1742[var42][var43] = var41;
                    if (var42 < 10) {
                        field1745[var42] += var37;
                    } else if (var42 == 10) {
                        field1743[var43] = var37;
                    } else {
                        field1744[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1723[1] > 0 || field1723[2] > 0) {
            var44 = (field1745[1] + field1745[2]) / (field1723[1] + field1723[2]);
        }
        int var45 = 0;
        if (field1723[3] > 0 || field1723[4] > 0) {
            var45 = (field1745[3] + field1745[4]) / (field1723[3] + field1723[4]);
        }
        int var46 = 0;
        if (field1723[6] > 0 || field1723[8] > 0) {
            var46 = (field1745[6] + field1745[8]) / (field1723[6] + field1723[8]);
        }
        int var47 = 0;
        int var48 = field1723[10];
        int[] var49 = field1742[10];
        int[] var50 = field1743;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1723[11];
            var49 = field1742[11];
            var50 = field1744;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2069(var49[var47++]);
                if (var47 == var48 && field1742[11] != var49) {
                    var47 = 0;
                    var48 = field1723[11];
                    var49 = field1742[11];
                    var50 = field1744;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2069(var49[var47++]);
                if (var47 == var48 && field1742[11] != var49) {
                    var47 = 0;
                    var48 = field1723[11];
                    var49 = field1742[11];
                    var50 = field1744;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2069(var49[var47++]);
                if (var47 == var48 && field1742[11] != var49) {
                    var47 = 0;
                    var48 = field1723[11];
                    var49 = field1742[11];
                    var50 = field1744;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1723[var52];
            int[] var54 = field1742[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2069(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2069(var49[var47++]);
            if (var47 == var48 && field1742[11] != var49) {
                var47 = 0;
                var49 = field1742[11];
                var48 = field1723[11];
                var50 = field1744;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cn.m(I)V")
    public final void method2069(int arg0) {
        if (field1731[arg0]) {
            this.method2050(arg0);
            return;
        }
        int var2 = this.field1706[arg0];
        int var3 = this.field1707[arg0];
        int var4 = this.field1708[arg0];
        class84.field1490 = field1758[arg0];
        if (this.field1713 == null) {
            class84.field1473 = 0;
        } else {
            class84.field1473 = this.field1713[arg0] & 0xFF;
        }
        if (this.field1733 != null && this.field1733[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1750 == null || this.field1750[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1750[arg0] & 0xFF;
                var6 = this.field1736[var5];
                var7 = this.field1728[var5];
                var8 = this.field1720[var5];
            }
            if (this.field1711[arg0] == -1) {
                class84.method1848(field1730[var2], field1730[var3], field1730[var4], field1715[var2], field1715[var3], field1715[var4], this.field1709[arg0], this.field1709[arg0], this.field1709[arg0], field1735[var6], field1735[var7], field1735[var8], field1714[var6], field1714[var7], field1714[var8], field1737[var6], field1737[var7], field1737[var8], this.field1733[arg0]);
            } else {
                class84.method1848(field1730[var2], field1730[var3], field1730[var4], field1715[var2], field1715[var3], field1715[var4], this.field1709[arg0], this.field1704[arg0], this.field1711[arg0], field1735[var6], field1735[var7], field1735[var8], field1714[var6], field1714[var7], field1714[var8], field1737[var6], field1737[var7], field1737[var8], this.field1733[arg0]);
            }
        } else if (this.field1711[arg0] == -1) {
            class84.method1846(field1730[var2], field1730[var3], field1730[var4], field1715[var2], field1715[var3], field1715[var4], field1759[this.field1709[arg0]]);
        } else {
            class84.method1844(field1730[var2], field1730[var3], field1730[var4], field1715[var2], field1715[var3], field1715[var4], this.field1709[arg0], this.field1704[arg0], this.field1711[arg0]);
        }
    }

    @ObfuscatedName("cn.f(I)V")
    public final void method2050(int arg0) {
        int var2 = Statics.field1483;
        int var3 = Statics.field1477;
        int var4 = 0;
        int var5 = this.field1706[arg0];
        int var6 = this.field1707[arg0];
        int var7 = this.field1708[arg0];
        int var8 = field1737[var5];
        int var9 = field1737[var6];
        int var10 = field1737[var7];
        if (this.field1713 == null) {
            class84.field1473 = 0;
        } else {
            class84.field1473 = this.field1713[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1746[var4] = field1715[var5];
            field1747[var4] = field1730[var5];
            field1748[var4++] = this.field1709[arg0];
        } else {
            int var11 = field1735[var5];
            int var12 = field1714[var5];
            int var13 = this.field1709[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1710[var10 - var8];
                field1746[var4] = (((field1735[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1747[var4] = (((field1714[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1748[var4++] = ((this.field1711[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1710[var9 - var8];
                field1746[var4] = (((field1735[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1747[var4] = (((field1714[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1748[var4++] = ((this.field1704[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1746[var4] = field1715[var6];
            field1747[var4] = field1730[var6];
            field1748[var4++] = this.field1704[arg0];
        } else {
            int var16 = field1735[var6];
            int var17 = field1714[var6];
            int var18 = this.field1704[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1710[var8 - var9];
                field1746[var4] = (((field1735[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1747[var4] = (((field1714[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1748[var4++] = ((this.field1709[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1710[var10 - var9];
                field1746[var4] = (((field1735[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1747[var4] = (((field1714[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1748[var4++] = ((this.field1711[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1746[var4] = field1715[var7];
            field1747[var4] = field1730[var7];
            field1748[var4++] = this.field1711[arg0];
        } else {
            int var21 = field1735[var7];
            int var22 = field1714[var7];
            int var23 = this.field1711[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1710[var9 - var10];
                field1746[var4] = (((field1735[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1747[var4] = (((field1714[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1748[var4++] = ((this.field1704[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1710[var8 - var10];
                field1746[var4] = (((field1735[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1747[var4] = (((field1714[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1748[var4++] = ((this.field1709[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1746[0];
        int var27 = field1746[1];
        int var28 = field1746[2];
        int var29 = field1747[0];
        int var30 = field1747[1];
        int var31 = field1747[2];
        class84.field1490 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1478 || var27 > Statics.field1478 || var28 > Statics.field1478) {
                class84.field1490 = true;
            }
            if (this.field1733 != null && this.field1733[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1750 == null || this.field1750[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1750[arg0] & 0xFF;
                    var33 = this.field1736[var32];
                    var34 = this.field1728[var32];
                    var35 = this.field1720[var32];
                }
                if (this.field1711[arg0] == -1) {
                    class84.method1848(var29, var30, var31, var26, var27, var28, this.field1709[arg0], this.field1709[arg0], this.field1709[arg0], field1735[var33], field1735[var34], field1735[var35], field1714[var33], field1714[var34], field1714[var35], field1737[var33], field1737[var34], field1737[var35], this.field1733[arg0]);
                } else {
                    class84.method1848(var29, var30, var31, var26, var27, var28, field1748[0], field1748[1], field1748[2], field1735[var33], field1735[var34], field1735[var35], field1714[var33], field1714[var34], field1714[var35], field1737[var33], field1737[var34], field1737[var35], this.field1733[arg0]);
                }
            } else if (this.field1711[arg0] == -1) {
                class84.method1846(var29, var30, var31, var26, var27, var28, field1759[this.field1709[arg0]]);
            } else {
                class84.method1844(var29, var30, var31, var26, var27, var28, field1748[0], field1748[1], field1748[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1478 || var27 > Statics.field1478 || var28 > Statics.field1478 || field1746[3] < 0 || field1746[3] > Statics.field1478) {
            class84.field1490 = true;
        }
        if (this.field1733 != null && this.field1733[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1750 == null || this.field1750[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1750[arg0] & 0xFF;
                var37 = this.field1736[var36];
                var38 = this.field1728[var36];
                var39 = this.field1720[var36];
            }
            short var40 = this.field1733[arg0];
            if (this.field1711[arg0] == -1) {
                class84.method1848(var29, var30, var31, var26, var27, var28, this.field1709[arg0], this.field1709[arg0], this.field1709[arg0], field1735[var37], field1735[var38], field1735[var39], field1714[var37], field1714[var38], field1714[var39], field1737[var37], field1737[var38], field1737[var39], var40);
                class84.method1848(var29, var31, field1747[3], var26, var28, field1746[3], this.field1709[arg0], this.field1709[arg0], this.field1709[arg0], field1735[var37], field1735[var38], field1735[var39], field1714[var37], field1714[var38], field1714[var39], field1737[var37], field1737[var38], field1737[var39], var40);
            } else {
                class84.method1848(var29, var30, var31, var26, var27, var28, field1748[0], field1748[1], field1748[2], field1735[var37], field1735[var38], field1735[var39], field1714[var37], field1714[var38], field1714[var39], field1737[var37], field1737[var38], field1737[var39], var40);
                class84.method1848(var29, var31, field1747[3], var26, var28, field1746[3], field1748[0], field1748[2], field1748[3], field1735[var37], field1735[var38], field1735[var39], field1714[var37], field1714[var38], field1714[var39], field1737[var37], field1737[var38], field1737[var39], var40);
            }
        } else if (this.field1711[arg0] == -1) {
            int var41 = field1759[this.field1709[arg0]];
            class84.method1846(var29, var30, var31, var26, var27, var28, var41);
            class84.method1846(var29, var31, field1747[3], var26, var28, field1746[3], var41);
        } else {
            class84.method1844(var29, var30, var31, var26, var27, var28, field1748[0], field1748[1], field1748[2]);
            class84.method1844(var29, var31, field1747[3], var26, var28, field1746[3], field1748[0], field1748[2], field1748[3]);
        }
    }

    @ObfuscatedName("cn.k(IIIIIIII)Z")
    public final boolean method2051(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
