package deob;

@ObfuscatedName("cp")
public class class95 extends class75 {

    @ObfuscatedName("cp.z")
    public static class95 field1703 = new class95();

    @ObfuscatedName("cp.n")
    public static byte[] field1667 = new byte[1];

    @ObfuscatedName("cp.u")
    public static class95 field1689 = new class95();

    @ObfuscatedName("cp.t")
    public static byte[] field1669 = new byte[1];

    @ObfuscatedName("cp.e")
    public int field1671 = 0;

    @ObfuscatedName("cp.a")
    public int[] field1719;

    @ObfuscatedName("cp.l")
    public int[] field1672;

    @ObfuscatedName("cp.v")
    public int[] field1673;

    @ObfuscatedName("cp.j")
    public int field1720 = 0;

    @ObfuscatedName("cp.k")
    public int[] field1675;

    @ObfuscatedName("cp.g")
    public int[] field1676;

    @ObfuscatedName("cp.d")
    public int[] field1677;

    @ObfuscatedName("cp.b")
    public int[] field1714;

    @ObfuscatedName("cp.i")
    public int[] field1731;

    @ObfuscatedName("cp.o")
    public int[] field1683;

    @ObfuscatedName("cp.x")
    public byte[] field1687;

    @ObfuscatedName("cp.m")
    public byte[] field1668;

    @ObfuscatedName("cp.f")
    public byte[] field1732;

    @ObfuscatedName("cp.q")
    public short[] field1684;

    @ObfuscatedName("cp.c")
    public byte field1685 = 0;

    @ObfuscatedName("cp.h")
    public int field1670 = 0;

    @ObfuscatedName("cp.y")
    public int[] field1696;

    @ObfuscatedName("cp.r")
    public int[] field1688;

    @ObfuscatedName("cp.w")
    public int[] field1729;

    @ObfuscatedName("cp.p")
    public int[][] field1690;

    @ObfuscatedName("cp.s")
    public int[][] field1691;

    @ObfuscatedName("cp.ag")
    public boolean field1692 = false;

    @ObfuscatedName("cp.ad")
    public int field1693;

    @ObfuscatedName("cp.ak")
    public int field1694;

    @ObfuscatedName("cp.ai")
    public int field1679;

    @ObfuscatedName("cp.ac")
    public int field1674;

    @ObfuscatedName("cp.as")
    public int field1697;

    @ObfuscatedName("cp.an")
    public static boolean[] field1699 = new boolean[4096];

    @ObfuscatedName("cp.ah")
    public static boolean[] field1700 = new boolean[4096];

    @ObfuscatedName("cp.ax")
    public static int[] field1701 = new int[4096];

    @ObfuscatedName("cp.ae")
    public static int[] field1702 = new int[4096];

    @ObfuscatedName("cp.ao")
    public static int[] field1678 = new int[4096];

    @ObfuscatedName("cp.aj")
    public static int[] field1704 = new int[4096];

    @ObfuscatedName("cp.ap")
    public static int[] field1698 = new int[4096];

    @ObfuscatedName("cp.am")
    public static int[] field1706 = new int[4096];

    @ObfuscatedName("cp.aa")
    public static int[] field1708 = new int[1600];

    @ObfuscatedName("cp.ab")
    public static int[][] field1709 = new int[1600][512];

    @ObfuscatedName("cp.aw")
    public static int[] field1710 = new int[12];

    @ObfuscatedName("cp.av")
    public static int[][] field1711 = new int[12][2000];

    @ObfuscatedName("cp.al")
    public static int[] field1686 = new int[2000];

    @ObfuscatedName("cp.aq")
    public static int[] field1713 = new int[2000];

    @ObfuscatedName("cp.au")
    public static int[] field1681 = new int[12];

    @ObfuscatedName("cp.ay")
    public static int[] field1712 = new int[10];

    @ObfuscatedName("cp.at")
    public static int[] field1666 = new int[10];

    @ObfuscatedName("cp.af")
    public static int[] field1680 = new int[10];

    @ObfuscatedName("cp.bq")
    public static boolean field1721 = false;

    @ObfuscatedName("cp.bt")
    public static int field1722 = 0;

    @ObfuscatedName("cp.br")
    public static int field1723 = 0;

    @ObfuscatedName("cp.bi")
    public static int field1724 = 0;

    @ObfuscatedName("cp.ba")
    public static int[] field1725 = new int[1000];

    @ObfuscatedName("cp.bf")
    public static int[] field1726 = class81.field1425;

    @ObfuscatedName("cp.bh")
    public static int[] field1727 = class81.field1446;

    @ObfuscatedName("cp.bo")
    public static int[] field1728 = class81.field1430;

    @ObfuscatedName("cp.bn")
    public static int[] field1695 = class81.field1444;

    public class95() {
    }

    public class95(class95[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1671 = 0;
        this.field1720 = 0;
        this.field1670 = 0;
        this.field1685 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class95 var8 = arg0[var7];
            if (var8 != null) {
                this.field1671 += var8.field1671;
                this.field1720 += var8.field1720;
                this.field1670 += var8.field1670;
                if (var8.field1687 == null) {
                    if (this.field1685 == -1) {
                        this.field1685 = var8.field1685;
                    }
                    if (this.field1685 != var8.field1685) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1668 != null;
                var5 |= var8.field1684 != null;
                var6 |= var8.field1732 != null;
            }
        }
        this.field1719 = new int[this.field1671];
        this.field1672 = new int[this.field1671];
        this.field1673 = new int[this.field1671];
        this.field1675 = new int[this.field1720];
        this.field1676 = new int[this.field1720];
        this.field1677 = new int[this.field1720];
        this.field1714 = new int[this.field1720];
        this.field1731 = new int[this.field1720];
        this.field1683 = new int[this.field1720];
        if (var3) {
            this.field1687 = new byte[this.field1720];
        }
        if (var4) {
            this.field1668 = new byte[this.field1720];
        }
        if (var5) {
            this.field1684 = new short[this.field1720];
        }
        if (var6) {
            this.field1732 = new byte[this.field1720];
        }
        if (this.field1670 > 0) {
            this.field1696 = new int[this.field1670];
            this.field1688 = new int[this.field1670];
            this.field1729 = new int[this.field1670];
        }
        this.field1671 = 0;
        this.field1720 = 0;
        this.field1670 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class95 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1720; var11++) {
                    this.field1675[this.field1720] = var10.field1675[var11] + this.field1671;
                    this.field1676[this.field1720] = var10.field1676[var11] + this.field1671;
                    this.field1677[this.field1720] = var10.field1677[var11] + this.field1671;
                    this.field1714[this.field1720] = var10.field1714[var11];
                    this.field1731[this.field1720] = var10.field1731[var11];
                    this.field1683[this.field1720] = var10.field1683[var11];
                    if (var3) {
                        if (var10.field1687 == null) {
                            this.field1687[this.field1720] = var10.field1685;
                        } else {
                            this.field1687[this.field1720] = var10.field1687[var11];
                        }
                    }
                    if (var4 && var10.field1668 != null) {
                        this.field1668[this.field1720] = var10.field1668[var11];
                    }
                    if (var5) {
                        if (var10.field1684 == null) {
                            this.field1684[this.field1720] = -1;
                        } else {
                            this.field1684[this.field1720] = var10.field1684[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1732 == null || var10.field1732[var11] == -1) {
                            this.field1732[this.field1720] = -1;
                        } else {
                            this.field1732[this.field1720] = (byte) (var10.field1732[var11] + this.field1670);
                        }
                    }
                    this.field1720++;
                }
                for (int var12 = 0; var12 < var10.field1670; var12++) {
                    this.field1696[this.field1670] = var10.field1696[var12] + this.field1671;
                    this.field1688[this.field1670] = var10.field1688[var12] + this.field1671;
                    this.field1729[this.field1670] = var10.field1729[var12] + this.field1671;
                    this.field1670++;
                }
                for (int var13 = 0; var13 < var10.field1671; var13++) {
                    this.field1719[this.field1671] = var10.field1719[var13];
                    this.field1672[this.field1671] = var10.field1672[var13];
                    this.field1673[this.field1671] = var10.field1673[var13];
                    this.field1671++;
                }
            }
        }
    }

    @ObfuscatedName("cp.z([[IIIIZI)Lcp;")
    public class95 method1988(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2051();
        int var7 = arg1 - this.field1679;
        int var8 = this.field1679 + arg1;
        int var9 = arg3 - this.field1679;
        int var10 = this.field1679 + arg3;
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
        class95 var15;
        if (arg4) {
            var15 = new class95();
            var15.field1671 = this.field1671;
            var15.field1720 = this.field1720;
            var15.field1670 = this.field1670;
            var15.field1719 = this.field1719;
            var15.field1673 = this.field1673;
            var15.field1675 = this.field1675;
            var15.field1676 = this.field1676;
            var15.field1677 = this.field1677;
            var15.field1714 = this.field1714;
            var15.field1731 = this.field1731;
            var15.field1683 = this.field1683;
            var15.field1687 = this.field1687;
            var15.field1668 = this.field1668;
            var15.field1732 = this.field1732;
            var15.field1684 = this.field1684;
            var15.field1685 = this.field1685;
            var15.field1696 = this.field1696;
            var15.field1688 = this.field1688;
            var15.field1729 = this.field1729;
            var15.field1690 = this.field1690;
            var15.field1691 = this.field1691;
            var15.field1692 = this.field1692;
            var15.field1672 = new int[var15.field1671];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1671; var16++) {
                int var17 = this.field1719[var16] + arg1;
                int var18 = this.field1673[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1672[var16] = this.field1672[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1671; var26++) {
                int var27 = (-this.field1672[var26] << 16) / this.field1315;
                if (var27 < arg5) {
                    int var28 = this.field1719[var26] + arg1;
                    int var29 = this.field1673[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1672[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1672[var26];
                }
            }
        }
        var15.field1693 = 0;
        return var15;
    }

    @ObfuscatedName("cp.u(Z)Lcp;")
    public class95 method2000(boolean arg0) {
        if (!arg0 && field1667.length < this.field1720) {
            field1667 = new byte[this.field1720 + 100];
        }
        return this.method2023(arg0, field1703, field1667);
    }

    @ObfuscatedName("cp.t(Z)Lcp;")
    public class95 method1990(boolean arg0) {
        if (!arg0 && field1669.length < this.field1720) {
            field1669 = new byte[this.field1720 + 100];
        }
        return this.method2023(arg0, field1689, field1669);
    }

    @ObfuscatedName("cp.e(ZLcp;[B)Lcp;")
    public class95 method2023(boolean arg0, class95 arg1, byte[] arg2) {
        arg1.field1671 = this.field1671;
        arg1.field1720 = this.field1720;
        arg1.field1670 = this.field1670;
        if (arg1.field1719 == null || arg1.field1719.length < this.field1671) {
            arg1.field1719 = new int[this.field1671 + 100];
            arg1.field1672 = new int[this.field1671 + 100];
            arg1.field1673 = new int[this.field1671 + 100];
        }
        for (int var4 = 0; var4 < this.field1671; var4++) {
            arg1.field1719[var4] = this.field1719[var4];
            arg1.field1672[var4] = this.field1672[var4];
            arg1.field1673[var4] = this.field1673[var4];
        }
        if (arg0) {
            arg1.field1668 = this.field1668;
        } else {
            arg1.field1668 = arg2;
            if (this.field1668 == null) {
                for (int var5 = 0; var5 < this.field1720; var5++) {
                    arg1.field1668[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1720; var6++) {
                    arg1.field1668[var6] = this.field1668[var6];
                }
            }
        }
        arg1.field1675 = this.field1675;
        arg1.field1676 = this.field1676;
        arg1.field1677 = this.field1677;
        arg1.field1714 = this.field1714;
        arg1.field1731 = this.field1731;
        arg1.field1683 = this.field1683;
        arg1.field1687 = this.field1687;
        arg1.field1732 = this.field1732;
        arg1.field1684 = this.field1684;
        arg1.field1685 = this.field1685;
        arg1.field1696 = this.field1696;
        arg1.field1688 = this.field1688;
        arg1.field1729 = this.field1729;
        arg1.field1690 = this.field1690;
        arg1.field1691 = this.field1691;
        arg1.field1692 = this.field1692;
        arg1.field1693 = 0;
        return arg1;
    }

    @ObfuscatedName("cp.a()V")
    public void method2051() {
        if (this.field1693 == 1) {
            return;
        }
        this.field1693 = 1;
        this.field1315 = 0;
        this.field1694 = 0;
        this.field1679 = 0;
        for (int var1 = 0; var1 < this.field1671; var1++) {
            int var2 = this.field1719[var1];
            int var3 = this.field1672[var1];
            int var4 = this.field1673[var1];
            if (-var3 > this.field1315) {
                this.field1315 = -var3;
            }
            if (var3 > this.field1694) {
                this.field1694 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1679) {
                this.field1679 = var5;
            }
        }
        this.field1679 = (int) (Math.sqrt((double) this.field1679) + 0.99D);
        this.field1697 = (int) (Math.sqrt((double) (this.field1315 * this.field1315 + this.field1679 * this.field1679)) + 0.99D);
        this.field1674 = this.field1697 + (int) (Math.sqrt((double) (this.field1694 * this.field1694 + this.field1679 * this.field1679)) + 0.99D);
    }

    @ObfuscatedName("cp.g()V")
    public void method1993() {
        if (this.field1693 == 2) {
            return;
        }
        this.field1693 = 2;
        this.field1679 = 0;
        for (int var1 = 0; var1 < this.field1671; var1++) {
            int var2 = this.field1719[var1];
            int var3 = this.field1672[var1];
            int var4 = this.field1673[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1679) {
                this.field1679 = var5;
            }
        }
        this.field1679 = (int) (Math.sqrt((double) this.field1679) + 0.99D);
        this.field1697 = this.field1679;
        this.field1674 = this.field1679 + this.field1679;
    }

    @ObfuscatedName("cp.d()I")
    public int method1996() {
        this.method2051();
        return this.field1679;
    }

    @ObfuscatedName("cp.b(Lcr;I)V")
    public void method1995(class93 arg0, int arg1) {
        if (this.field1690 == null || arg1 == -1) {
            return;
        }
        class78 var3 = arg0.field1644[arg1];
        class92 var4 = var3.field1397;
        Statics.field1682 = 0;
        Statics.field1717 = 0;
        Statics.field1718 = 0;
        for (int var5 = 0; var5 < var3.field1395; var5++) {
            int var6 = var3.field1390[var5];
            this.method1994(var4.field1631[var6], var4.field1632[var6], var3.field1393[var5], var3.field1398[var5], var3.field1399[var5]);
        }
        this.field1693 = 0;
    }

    @ObfuscatedName("cp.i(Lcr;ILcr;I[I)V")
    public void method2049(class93 arg0, int arg1, class93 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1995(arg0, arg1);
            return;
        }
        class78 var6 = arg0.field1644[arg1];
        class78 var7 = arg2.field1644[arg3];
        class92 var8 = var6.field1397;
        Statics.field1682 = 0;
        Statics.field1717 = 0;
        Statics.field1718 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1395; var11++) {
            int var12 = var6.field1390[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1631[var12] == 0) {
                this.method1994(var8.field1631[var12], var8.field1632[var12], var6.field1393[var11], var6.field1398[var11], var6.field1399[var11]);
            }
        }
        Statics.field1682 = 0;
        Statics.field1717 = 0;
        Statics.field1718 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1395; var15++) {
            int var16 = var7.field1390[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1631[var16] == 0) {
                this.method1994(var8.field1631[var16], var8.field1632[var16], var7.field1393[var15], var7.field1398[var15], var7.field1399[var15]);
            }
        }
        this.field1693 = 0;
    }

    @ObfuscatedName("cp.o(I[IIII)V")
    public void method1994(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1682 = 0;
            Statics.field1717 = 0;
            Statics.field1718 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1690.length) {
                    int[] var10 = this.field1690[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1682 += this.field1719[var12];
                        Statics.field1717 += this.field1672[var12];
                        Statics.field1718 += this.field1673[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1682 = Statics.field1682 / var7 + arg2;
                Statics.field1717 = Statics.field1717 / var7 + arg3;
                Statics.field1718 = Statics.field1718 / var7 + arg4;
            } else {
                Statics.field1682 = arg2;
                Statics.field1717 = arg3;
                Statics.field1718 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1690.length) {
                    int[] var15 = this.field1690[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1719[var17] += arg2;
                        this.field1672[var17] += arg3;
                        this.field1673[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1690.length) {
                    int[] var20 = this.field1690[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1719[var22] -= Statics.field1682;
                        this.field1672[var22] -= Statics.field1717;
                        this.field1673[var22] -= Statics.field1718;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1726[var25];
                            int var27 = field1727[var25];
                            int var28 = this.field1719[var22] * var27 + this.field1672[var22] * var26 >> 16;
                            this.field1672[var22] = this.field1672[var22] * var27 - this.field1719[var22] * var26 >> 16;
                            this.field1719[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1726[var23];
                            int var30 = field1727[var23];
                            int var31 = this.field1672[var22] * var30 - this.field1673[var22] * var29 >> 16;
                            this.field1673[var22] = this.field1673[var22] * var30 + this.field1672[var22] * var29 >> 16;
                            this.field1672[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1726[var24];
                            int var33 = field1727[var24];
                            int var34 = this.field1719[var22] * var33 + this.field1673[var22] * var32 >> 16;
                            this.field1673[var22] = this.field1673[var22] * var33 - this.field1719[var22] * var32 >> 16;
                            this.field1719[var22] = var34;
                        }
                        this.field1719[var22] += Statics.field1682;
                        this.field1672[var22] += Statics.field1717;
                        this.field1673[var22] += Statics.field1718;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1690.length) {
                    int[] var37 = this.field1690[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1719[var39] -= Statics.field1682;
                        this.field1672[var39] -= Statics.field1717;
                        this.field1673[var39] -= Statics.field1718;
                        this.field1719[var39] = this.field1719[var39] * arg2 / 128;
                        this.field1672[var39] = this.field1672[var39] * arg3 / 128;
                        this.field1673[var39] = this.field1673[var39] * arg4 / 128;
                        this.field1719[var39] += Statics.field1682;
                        this.field1672[var39] += Statics.field1717;
                        this.field1673[var39] += Statics.field1718;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1691 != null && this.field1668 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1691.length) {
                    int[] var42 = this.field1691[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1668[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1668[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cp.x()V")
    public void method1998() {
        for (int var1 = 0; var1 < this.field1671; var1++) {
            int var2 = this.field1719[var1];
            this.field1719[var1] = this.field1673[var1];
            this.field1673[var1] = -var2;
        }
        this.field1693 = 0;
    }

    @ObfuscatedName("cp.m()V")
    public void method1999() {
        for (int var1 = 0; var1 < this.field1671; var1++) {
            this.field1719[var1] = -this.field1719[var1];
            this.field1673[var1] = -this.field1673[var1];
        }
        this.field1693 = 0;
    }

    @ObfuscatedName("cp.f()V")
    public void method2015() {
        for (int var1 = 0; var1 < this.field1671; var1++) {
            int var2 = this.field1673[var1];
            this.field1673[var1] = this.field1719[var1];
            this.field1719[var1] = -var2;
        }
        this.field1693 = 0;
    }

    @ObfuscatedName("cp.q(I)V")
    public void method1991(int arg0) {
        int var2 = field1726[arg0];
        int var3 = field1727[arg0];
        for (int var4 = 0; var4 < this.field1671; var4++) {
            int var5 = this.field1672[var4] * var3 - this.field1673[var4] * var2 >> 16;
            this.field1673[var4] = this.field1673[var4] * var3 + this.field1672[var4] * var2 >> 16;
            this.field1672[var4] = var5;
        }
        this.field1693 = 0;
    }

    @ObfuscatedName("cp.c(III)V")
    public void method2016(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1671; var4++) {
            this.field1719[var4] += arg0;
            this.field1672[var4] += arg1;
            this.field1673[var4] += arg2;
        }
        this.field1693 = 0;
    }

    @ObfuscatedName("cp.h(III)V")
    public void method2020(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1671; var4++) {
            this.field1719[var4] = this.field1719[var4] * arg0 / 128;
            this.field1672[var4] = this.field1672[var4] * arg1 / 128;
            this.field1673[var4] = this.field1673[var4] * arg2 / 128;
        }
        this.field1693 = 0;
    }

    @ObfuscatedName("cp.y(IIIIIII)V")
    public final void method2003(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1708[0] = -1;
        if (this.field1693 != 2 && this.field1693 != 1) {
            this.method1993();
        }
        int var8 = Statics.field1432;
        int var9 = Statics.field1433;
        int var10 = field1726[arg0];
        int var11 = field1727[arg0];
        int var12 = field1726[arg1];
        int var13 = field1727[arg1];
        int var14 = field1726[arg2];
        int var15 = field1727[arg2];
        int var16 = field1726[arg3];
        int var17 = field1727[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1671; var19++) {
            int var20 = this.field1719[var19];
            int var21 = this.field1672[var19];
            int var22 = this.field1673[var19];
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
            field1678[var19] = var30 - var18;
            field1701[var19] = (var26 << 9) / var30 + var8;
            field1702[var19] = (var29 << 9) / var30 + var9;
            if (this.field1670 > 0) {
                field1704[var19] = var26;
                field1698[var19] = var29;
                field1706[var19] = var30;
            }
        }
        try {
            this.method2005(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cp.r(IIIIIIII)V")
    public final void method2024(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1708[0] = -1;
        if (this.field1693 != 2 && this.field1693 != 1) {
            this.method1993();
        }
        int var9 = Statics.field1432;
        int var10 = Statics.field1433;
        int var11 = field1726[arg0];
        int var12 = field1727[arg0];
        int var13 = field1726[arg1];
        int var14 = field1727[arg1];
        int var15 = field1726[arg2];
        int var16 = field1727[arg2];
        int var17 = field1726[arg3];
        int var18 = field1727[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1671; var20++) {
            int var21 = this.field1719[var20];
            int var22 = this.field1672[var20];
            int var23 = this.field1673[var20];
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
            field1678[var20] = var31 - var19;
            field1701[var20] = (var27 << 9) / arg7 + var9;
            field1702[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1670 > 0) {
                field1704[var20] = var27;
                field1698[var20] = var30;
                field1706[var20] = var31;
            }
        }
        try {
            this.method2005(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cp.s(IIIIIIIII)V")
    public void method1599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1708[0] = -1;
        if (this.field1693 != 1) {
            this.method2051();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1679 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1679 << 9;
        if (var15 / var13 >= Statics.field1437) {
            return;
        }
        int var16 = this.field1679 + var14 << 9;
        if (var16 / var13 <= Statics.field1436) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1679 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1438) {
            return;
        }
        int var20 = (this.field1315 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1439) {
            return;
        }
        int var22 = (this.field1315 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1670 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1721) {
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
            int var32 = field1722 - Statics.field1432;
            int var33 = field1723 - Statics.field1433;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1692) {
                    field1725[field1724++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1432;
        int var35 = Statics.field1433;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1726[arg0];
            var37 = field1727[arg0];
        }
        for (int var38 = 0; var38 < this.field1671; var38++) {
            int var39 = this.field1719[var38];
            int var40 = this.field1672[var38];
            int var41 = this.field1673[var38];
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
            field1678[var38] = var50 - var11;
            if (var50 >= 50) {
                field1701[var38] = (var46 << 9) / var50 + var34;
                field1702[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1701[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1704[var38] = var46;
                field1698[var38] = var49;
                field1706[var38] = var50;
            }
        }
        try {
            this.method2005(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cp.w(ZZI)V")
    public final void method2005(boolean arg0, boolean arg1, int arg2) {
        if (this.field1674 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1674; var4++) {
            field1708[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1720; var5++) {
            if (this.field1683[var5] != -2) {
                int var6 = this.field1675[var5];
                int var7 = this.field1676[var5];
                int var8 = this.field1677[var5];
                int var9 = field1701[var6];
                int var10 = field1701[var7];
                int var11 = field1701[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1704[var6];
                    int var13 = field1704[var7];
                    int var14 = field1704[var8];
                    int var15 = field1698[var6];
                    int var16 = field1698[var7];
                    int var17 = field1698[var8];
                    int var18 = field1706[var6];
                    int var19 = field1706[var7];
                    int var20 = field1706[var8];
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
                        field1700[var5] = true;
                        int var30 = (field1678[var6] + field1678[var7] + field1678[var8]) / 3 + this.field1697;
                        field1709[var30][field1708[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2008(field1722, field1723, field1702[var6], field1702[var7], field1702[var8], var9, var10, var11)) {
                        field1725[field1724++] = arg2;
                        arg1 = false;
                    }
                    if ((field1702[var8] - field1702[var7]) * (var9 - var10) - (field1702[var6] - field1702[var7]) * (var11 - var10) > 0) {
                        field1700[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1441 && var10 <= Statics.field1441 && var11 <= Statics.field1441) {
                            field1699[var5] = false;
                        } else {
                            field1699[var5] = true;
                        }
                        int var31 = (field1678[var6] + field1678[var7] + field1678[var8]) / 3 + this.field1697;
                        field1709[var31][field1708[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1687 == null) {
            for (int var32 = this.field1674 - 1; var32 >= 0; var32--) {
                int var33 = field1708[var32];
                if (var33 > 0) {
                    int[] var34 = field1709[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method1987(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1710[var36] = 0;
            field1681[var36] = 0;
        }
        for (int var37 = this.field1674 - 1; var37 >= 0; var37--) {
            int var38 = field1708[var37];
            if (var38 > 0) {
                int[] var39 = field1709[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1687[var41];
                    int var43 = field1710[var42]++;
                    field1711[var42][var43] = var41;
                    if (var42 < 10) {
                        field1681[var42] += var37;
                    } else if (var42 == 10) {
                        field1686[var43] = var37;
                    } else {
                        field1713[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1710[1] > 0 || field1710[2] > 0) {
            var44 = (field1681[1] + field1681[2]) / (field1710[1] + field1710[2]);
        }
        int var45 = 0;
        if (field1710[3] > 0 || field1710[4] > 0) {
            var45 = (field1681[3] + field1681[4]) / (field1710[3] + field1710[4]);
        }
        int var46 = 0;
        if (field1710[6] > 0 || field1710[8] > 0) {
            var46 = (field1681[6] + field1681[8]) / (field1710[6] + field1710[8]);
        }
        int var47 = 0;
        int var48 = field1710[10];
        int[] var49 = field1711[10];
        int[] var50 = field1686;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1710[11];
            var49 = field1711[11];
            var50 = field1713;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method1987(var49[var47++]);
                if (var47 == var48 && field1711[11] != var49) {
                    var47 = 0;
                    var48 = field1710[11];
                    var49 = field1711[11];
                    var50 = field1713;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method1987(var49[var47++]);
                if (var47 == var48 && field1711[11] != var49) {
                    var47 = 0;
                    var48 = field1710[11];
                    var49 = field1711[11];
                    var50 = field1713;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method1987(var49[var47++]);
                if (var47 == var48 && field1711[11] != var49) {
                    var47 = 0;
                    var48 = field1710[11];
                    var49 = field1711[11];
                    var50 = field1713;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1710[var52];
            int[] var54 = field1711[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method1987(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method1987(var49[var47++]);
            if (var47 == var48 && field1711[11] != var49) {
                var47 = 0;
                var49 = field1711[11];
                var48 = field1710[11];
                var50 = field1713;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cp.p(I)V")
    public final void method1987(int arg0) {
        if (field1700[arg0]) {
            this.method2007(arg0);
            return;
        }
        int var2 = this.field1675[arg0];
        int var3 = this.field1676[arg0];
        int var4 = this.field1677[arg0];
        class81.field1445 = field1699[arg0];
        if (this.field1668 == null) {
            class81.field1424 = 0;
        } else {
            class81.field1424 = this.field1668[arg0] & 0xFF;
        }
        if (this.field1684 != null && this.field1684[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1732 == null || this.field1732[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1732[arg0] & 0xFF;
                var6 = this.field1696[var5];
                var7 = this.field1688[var5];
                var8 = this.field1729[var5];
            }
            if (this.field1683[arg0] == -1) {
                class81.method1804(field1702[var2], field1702[var3], field1702[var4], field1701[var2], field1701[var3], field1701[var4], this.field1714[arg0], this.field1714[arg0], this.field1714[arg0], field1704[var6], field1704[var7], field1704[var8], field1698[var6], field1698[var7], field1698[var8], field1706[var6], field1706[var7], field1706[var8], this.field1684[arg0]);
            } else {
                class81.method1804(field1702[var2], field1702[var3], field1702[var4], field1701[var2], field1701[var3], field1701[var4], this.field1714[arg0], this.field1731[arg0], this.field1683[arg0], field1704[var6], field1704[var7], field1704[var8], field1698[var6], field1698[var7], field1698[var8], field1706[var6], field1706[var7], field1706[var8], this.field1684[arg0]);
            }
        } else if (this.field1683[arg0] == -1) {
            class81.method1802(field1702[var2], field1702[var3], field1702[var4], field1701[var2], field1701[var3], field1701[var4], field1728[this.field1714[arg0]]);
        } else {
            class81.method1800(field1702[var2], field1702[var3], field1702[var4], field1701[var2], field1701[var3], field1701[var4], this.field1714[arg0], this.field1731[arg0], this.field1683[arg0]);
        }
    }

    @ObfuscatedName("cp.ac(I)V")
    public final void method2007(int arg0) {
        int var2 = Statics.field1432;
        int var3 = Statics.field1433;
        int var4 = 0;
        int var5 = this.field1675[arg0];
        int var6 = this.field1676[arg0];
        int var7 = this.field1677[arg0];
        int var8 = field1706[var5];
        int var9 = field1706[var6];
        int var10 = field1706[var7];
        if (this.field1668 == null) {
            class81.field1424 = 0;
        } else {
            class81.field1424 = this.field1668[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1712[var4] = field1701[var5];
            field1666[var4] = field1702[var5];
            field1680[var4++] = this.field1714[arg0];
        } else {
            int var11 = field1704[var5];
            int var12 = field1698[var5];
            int var13 = this.field1714[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1695[var10 - var8];
                field1712[var4] = (((field1704[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1666[var4] = (((field1698[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1680[var4++] = ((this.field1683[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1695[var9 - var8];
                field1712[var4] = (((field1704[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1666[var4] = (((field1698[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1680[var4++] = ((this.field1731[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1712[var4] = field1701[var6];
            field1666[var4] = field1702[var6];
            field1680[var4++] = this.field1731[arg0];
        } else {
            int var16 = field1704[var6];
            int var17 = field1698[var6];
            int var18 = this.field1731[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1695[var8 - var9];
                field1712[var4] = (((field1704[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1666[var4] = (((field1698[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1680[var4++] = ((this.field1714[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1695[var10 - var9];
                field1712[var4] = (((field1704[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1666[var4] = (((field1698[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1680[var4++] = ((this.field1683[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1712[var4] = field1701[var7];
            field1666[var4] = field1702[var7];
            field1680[var4++] = this.field1683[arg0];
        } else {
            int var21 = field1704[var7];
            int var22 = field1698[var7];
            int var23 = this.field1683[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1695[var9 - var10];
                field1712[var4] = (((field1704[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1666[var4] = (((field1698[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1680[var4++] = ((this.field1731[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1695[var8 - var10];
                field1712[var4] = (((field1704[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1666[var4] = (((field1698[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1680[var4++] = ((this.field1714[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1712[0];
        int var27 = field1712[1];
        int var28 = field1712[2];
        int var29 = field1666[0];
        int var30 = field1666[1];
        int var31 = field1666[2];
        class81.field1445 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1441 || var27 > Statics.field1441 || var28 > Statics.field1441) {
                class81.field1445 = true;
            }
            if (this.field1684 != null && this.field1684[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1732 == null || this.field1732[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1732[arg0] & 0xFF;
                    var33 = this.field1696[var32];
                    var34 = this.field1688[var32];
                    var35 = this.field1729[var32];
                }
                if (this.field1683[arg0] == -1) {
                    class81.method1804(var29, var30, var31, var26, var27, var28, this.field1714[arg0], this.field1714[arg0], this.field1714[arg0], field1704[var33], field1704[var34], field1704[var35], field1698[var33], field1698[var34], field1698[var35], field1706[var33], field1706[var34], field1706[var35], this.field1684[arg0]);
                } else {
                    class81.method1804(var29, var30, var31, var26, var27, var28, field1680[0], field1680[1], field1680[2], field1704[var33], field1704[var34], field1704[var35], field1698[var33], field1698[var34], field1698[var35], field1706[var33], field1706[var34], field1706[var35], this.field1684[arg0]);
                }
            } else if (this.field1683[arg0] == -1) {
                class81.method1802(var29, var30, var31, var26, var27, var28, field1728[this.field1714[arg0]]);
            } else {
                class81.method1800(var29, var30, var31, var26, var27, var28, field1680[0], field1680[1], field1680[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1441 || var27 > Statics.field1441 || var28 > Statics.field1441 || field1712[3] < 0 || field1712[3] > Statics.field1441) {
            class81.field1445 = true;
        }
        if (this.field1684 != null && this.field1684[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1732 == null || this.field1732[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1732[arg0] & 0xFF;
                var37 = this.field1696[var36];
                var38 = this.field1688[var36];
                var39 = this.field1729[var36];
            }
            short var40 = this.field1684[arg0];
            if (this.field1683[arg0] == -1) {
                class81.method1804(var29, var30, var31, var26, var27, var28, this.field1714[arg0], this.field1714[arg0], this.field1714[arg0], field1704[var37], field1704[var38], field1704[var39], field1698[var37], field1698[var38], field1698[var39], field1706[var37], field1706[var38], field1706[var39], var40);
                class81.method1804(var29, var31, field1666[3], var26, var28, field1712[3], this.field1714[arg0], this.field1714[arg0], this.field1714[arg0], field1704[var37], field1704[var38], field1704[var39], field1698[var37], field1698[var38], field1698[var39], field1706[var37], field1706[var38], field1706[var39], var40);
            } else {
                class81.method1804(var29, var30, var31, var26, var27, var28, field1680[0], field1680[1], field1680[2], field1704[var37], field1704[var38], field1704[var39], field1698[var37], field1698[var38], field1698[var39], field1706[var37], field1706[var38], field1706[var39], var40);
                class81.method1804(var29, var31, field1666[3], var26, var28, field1712[3], field1680[0], field1680[2], field1680[3], field1704[var37], field1704[var38], field1704[var39], field1698[var37], field1698[var38], field1698[var39], field1706[var37], field1706[var38], field1706[var39], var40);
            }
        } else if (this.field1683[arg0] == -1) {
            int var41 = field1728[this.field1714[arg0]];
            class81.method1802(var29, var30, var31, var26, var27, var28, var41);
            class81.method1802(var29, var31, field1666[3], var26, var28, field1712[3], var41);
        } else {
            class81.method1800(var29, var30, var31, var26, var27, var28, field1680[0], field1680[1], field1680[2]);
            class81.method1800(var29, var31, field1666[3], var26, var28, field1712[3], field1680[0], field1680[2], field1680[3]);
        }
    }

    @ObfuscatedName("cp.as(IIIIIIII)Z")
    public final boolean method2008(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
