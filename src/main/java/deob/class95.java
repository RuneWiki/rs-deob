package deob;

@ObfuscatedName("cl")
public class class95 extends class75 {

    @ObfuscatedName("cl.m")
    public static class95 field1713 = new class95();

    @ObfuscatedName("cl.k")
    public static byte[] field1663 = new byte[1];

    @ObfuscatedName("cl.y")
    public static class95 field1664 = new class95();

    @ObfuscatedName("cl.g")
    public static byte[] field1665 = new byte[1];

    @ObfuscatedName("cl.r")
    public int field1700 = 0;

    @ObfuscatedName("cl.i")
    public int[] field1676;

    @ObfuscatedName("cl.f")
    public int[] field1668;

    @ObfuscatedName("cl.a")
    public int[] field1669;

    @ObfuscatedName("cl.w")
    public int field1670 = 0;

    @ObfuscatedName("cl.u")
    public int[] field1695;

    @ObfuscatedName("cl.d")
    public int[] field1672;

    @ObfuscatedName("cl.t")
    public int[] field1673;

    @ObfuscatedName("cl.j")
    public int[] field1674;

    @ObfuscatedName("cl.q")
    public int[] field1675;

    @ObfuscatedName("cl.p")
    public int[] field1687;

    @ObfuscatedName("cl.v")
    public byte[] field1688;

    @ObfuscatedName("cl.n")
    public byte[] field1678;

    @ObfuscatedName("cl.l")
    public byte[] field1679;

    @ObfuscatedName("cl.c")
    public short[] field1680;

    @ObfuscatedName("cl.b")
    public byte field1662 = 0;

    @ObfuscatedName("cl.s")
    public int field1717 = 0;

    @ObfuscatedName("cl.o")
    public int[] field1683;

    @ObfuscatedName("cl.h")
    public int[] field1704;

    @ObfuscatedName("cl.x")
    public int[] field1686;

    @ObfuscatedName("cl.e")
    public int[][] field1719;

    @ObfuscatedName("cl.z")
    public int[][] field1703;

    @ObfuscatedName("cl.az")
    public boolean field1667 = false;

    @ObfuscatedName("cl.av")
    public int field1689;

    @ObfuscatedName("cl.ay")
    public int field1690;

    @ObfuscatedName("cl.ah")
    public int field1714;

    @ObfuscatedName("cl.ao")
    public int field1692;

    @ObfuscatedName("cl.aj")
    public int field1693;

    @ObfuscatedName("cl.ai")
    public static boolean[] field1722 = new boolean[4096];

    @ObfuscatedName("cl.af")
    public static boolean[] field1696 = new boolean[4096];

    @ObfuscatedName("cl.am")
    public static int[] field1706 = new int[4096];

    @ObfuscatedName("cl.aq")
    public static int[] field1718 = new int[4096];

    @ObfuscatedName("cl.ar")
    public static int[] field1699 = new int[4096];

    @ObfuscatedName("cl.an")
    public static int[] field1698 = new int[4096];

    @ObfuscatedName("cl.au")
    public static int[] field1701 = new int[4096];

    @ObfuscatedName("cl.aa")
    public static int[] field1726 = new int[4096];

    @ObfuscatedName("cl.al")
    public static int[] field1685 = new int[1600];

    @ObfuscatedName("cl.ap")
    public static int[][] field1705 = new int[1600][512];

    @ObfuscatedName("cl.ac")
    public static int[] field1684 = new int[12];

    @ObfuscatedName("cl.ak")
    public static int[][] field1707 = new int[12][2000];

    @ObfuscatedName("cl.ax")
    public static int[] field1708 = new int[2000];

    @ObfuscatedName("cl.ab")
    public static int[] field1709 = new int[2000];

    @ObfuscatedName("cl.aw")
    public static int[] field1710 = new int[12];

    @ObfuscatedName("cl.at")
    public static int[] field1711 = new int[10];

    @ObfuscatedName("cl.as")
    public static int[] field1712 = new int[10];

    @ObfuscatedName("cl.ae")
    public static int[] field1702 = new int[10];

    @ObfuscatedName("cl.bv")
    public static boolean field1671 = false;

    @ObfuscatedName("cl.bm")
    public static int field1666 = 0;

    @ObfuscatedName("cl.bi")
    public static int field1691 = 0;

    @ObfuscatedName("cl.bd")
    public static int field1720 = 0;

    @ObfuscatedName("cl.bt")
    public static int[] field1721 = new int[1000];

    @ObfuscatedName("cl.br")
    public static int[] field1681 = class81.field1448;

    @ObfuscatedName("cl.bq")
    public static int[] field1723 = class81.field1449;

    @ObfuscatedName("cl.bp")
    public static int[] field1724 = class81.field1444;

    @ObfuscatedName("cl.bo")
    public static int[] field1725 = class81.field1447;

    public class95() {
    }

    public class95(class95[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1700 = 0;
        this.field1670 = 0;
        this.field1717 = 0;
        this.field1662 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class95 var8 = arg0[var7];
            if (var8 != null) {
                this.field1700 += var8.field1700;
                this.field1670 += var8.field1670;
                this.field1717 += var8.field1717;
                if (var8.field1688 == null) {
                    if (this.field1662 == -1) {
                        this.field1662 = var8.field1662;
                    }
                    if (this.field1662 != var8.field1662) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1678 != null;
                var5 |= var8.field1680 != null;
                var6 |= var8.field1679 != null;
            }
        }
        this.field1676 = new int[this.field1700];
        this.field1668 = new int[this.field1700];
        this.field1669 = new int[this.field1700];
        this.field1695 = new int[this.field1670];
        this.field1672 = new int[this.field1670];
        this.field1673 = new int[this.field1670];
        this.field1674 = new int[this.field1670];
        this.field1675 = new int[this.field1670];
        this.field1687 = new int[this.field1670];
        if (var3) {
            this.field1688 = new byte[this.field1670];
        }
        if (var4) {
            this.field1678 = new byte[this.field1670];
        }
        if (var5) {
            this.field1680 = new short[this.field1670];
        }
        if (var6) {
            this.field1679 = new byte[this.field1670];
        }
        if (this.field1717 > 0) {
            this.field1683 = new int[this.field1717];
            this.field1704 = new int[this.field1717];
            this.field1686 = new int[this.field1717];
        }
        this.field1700 = 0;
        this.field1670 = 0;
        this.field1717 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class95 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1670; var11++) {
                    this.field1695[this.field1670] = var10.field1695[var11] + this.field1700;
                    this.field1672[this.field1670] = var10.field1672[var11] + this.field1700;
                    this.field1673[this.field1670] = var10.field1673[var11] + this.field1700;
                    this.field1674[this.field1670] = var10.field1674[var11];
                    this.field1675[this.field1670] = var10.field1675[var11];
                    this.field1687[this.field1670] = var10.field1687[var11];
                    if (var3) {
                        if (var10.field1688 == null) {
                            this.field1688[this.field1670] = var10.field1662;
                        } else {
                            this.field1688[this.field1670] = var10.field1688[var11];
                        }
                    }
                    if (var4 && var10.field1678 != null) {
                        this.field1678[this.field1670] = var10.field1678[var11];
                    }
                    if (var5) {
                        if (var10.field1680 == null) {
                            this.field1680[this.field1670] = -1;
                        } else {
                            this.field1680[this.field1670] = var10.field1680[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1679 == null || var10.field1679[var11] == -1) {
                            this.field1679[this.field1670] = -1;
                        } else {
                            this.field1679[this.field1670] = (byte) (var10.field1679[var11] + this.field1717);
                        }
                    }
                    this.field1670++;
                }
                for (int var12 = 0; var12 < var10.field1717; var12++) {
                    this.field1683[this.field1717] = var10.field1683[var12] + this.field1700;
                    this.field1704[this.field1717] = var10.field1704[var12] + this.field1700;
                    this.field1686[this.field1717] = var10.field1686[var12] + this.field1700;
                    this.field1717++;
                }
                for (int var13 = 0; var13 < var10.field1700; var13++) {
                    this.field1676[this.field1700] = var10.field1676[var13];
                    this.field1668[this.field1700] = var10.field1668[var13];
                    this.field1669[this.field1700] = var10.field1669[var13];
                    this.field1700++;
                }
            }
        }
    }

    @ObfuscatedName("cl.m([[IIIIZI)Lcl;")
    public class95 method2036(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1975();
        int var7 = arg1 - this.field1714;
        int var8 = this.field1714 + arg1;
        int var9 = arg3 - this.field1714;
        int var10 = this.field1714 + arg3;
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
            var15.field1700 = this.field1700;
            var15.field1670 = this.field1670;
            var15.field1717 = this.field1717;
            var15.field1676 = this.field1676;
            var15.field1669 = this.field1669;
            var15.field1695 = this.field1695;
            var15.field1672 = this.field1672;
            var15.field1673 = this.field1673;
            var15.field1674 = this.field1674;
            var15.field1675 = this.field1675;
            var15.field1687 = this.field1687;
            var15.field1688 = this.field1688;
            var15.field1678 = this.field1678;
            var15.field1679 = this.field1679;
            var15.field1680 = this.field1680;
            var15.field1662 = this.field1662;
            var15.field1683 = this.field1683;
            var15.field1704 = this.field1704;
            var15.field1686 = this.field1686;
            var15.field1719 = this.field1719;
            var15.field1703 = this.field1703;
            var15.field1667 = this.field1667;
            var15.field1668 = new int[var15.field1700];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1700; var16++) {
                int var17 = this.field1676[var16] + arg1;
                int var18 = this.field1669[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1668[var16] = this.field1668[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1700; var26++) {
                int var27 = (-this.field1668[var26] << 16) / this.field1315;
                if (var27 < arg5) {
                    int var28 = this.field1676[var26] + arg1;
                    int var29 = this.field1669[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1668[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1668[var26];
                }
            }
        }
        var15.field1689 = 0;
        return var15;
    }

    @ObfuscatedName("cl.y(Z)Lcl;")
    public class95 method1982(boolean arg0) {
        if (!arg0 && field1663.length < this.field1670) {
            field1663 = new byte[this.field1670 + 100];
        }
        return this.method1974(arg0, field1713, field1663);
    }

    @ObfuscatedName("cl.g(Z)Lcl;")
    public class95 method2048(boolean arg0) {
        if (!arg0 && field1665.length < this.field1670) {
            field1665 = new byte[this.field1670 + 100];
        }
        return this.method1974(arg0, field1664, field1665);
    }

    @ObfuscatedName("cl.r(ZLcl;[B)Lcl;")
    public class95 method1974(boolean arg0, class95 arg1, byte[] arg2) {
        arg1.field1700 = this.field1700;
        arg1.field1670 = this.field1670;
        arg1.field1717 = this.field1717;
        if (arg1.field1676 == null || arg1.field1676.length < this.field1700) {
            arg1.field1676 = new int[this.field1700 + 100];
            arg1.field1668 = new int[this.field1700 + 100];
            arg1.field1669 = new int[this.field1700 + 100];
        }
        for (int var4 = 0; var4 < this.field1700; var4++) {
            arg1.field1676[var4] = this.field1676[var4];
            arg1.field1668[var4] = this.field1668[var4];
            arg1.field1669[var4] = this.field1669[var4];
        }
        if (arg0) {
            arg1.field1678 = this.field1678;
        } else {
            arg1.field1678 = arg2;
            if (this.field1678 == null) {
                for (int var5 = 0; var5 < this.field1670; var5++) {
                    arg1.field1678[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1670; var6++) {
                    arg1.field1678[var6] = this.field1678[var6];
                }
            }
        }
        arg1.field1695 = this.field1695;
        arg1.field1672 = this.field1672;
        arg1.field1673 = this.field1673;
        arg1.field1674 = this.field1674;
        arg1.field1675 = this.field1675;
        arg1.field1687 = this.field1687;
        arg1.field1688 = this.field1688;
        arg1.field1679 = this.field1679;
        arg1.field1680 = this.field1680;
        arg1.field1662 = this.field1662;
        arg1.field1683 = this.field1683;
        arg1.field1704 = this.field1704;
        arg1.field1686 = this.field1686;
        arg1.field1719 = this.field1719;
        arg1.field1703 = this.field1703;
        arg1.field1667 = this.field1667;
        arg1.field1689 = 0;
        return arg1;
    }

    @ObfuscatedName("cl.u()V")
    public void method1975() {
        if (this.field1689 == 1) {
            return;
        }
        this.field1689 = 1;
        this.field1315 = 0;
        this.field1690 = 0;
        this.field1714 = 0;
        for (int var1 = 0; var1 < this.field1700; var1++) {
            int var2 = this.field1676[var1];
            int var3 = this.field1668[var1];
            int var4 = this.field1669[var1];
            if (-var3 > this.field1315) {
                this.field1315 = -var3;
            }
            if (var3 > this.field1690) {
                this.field1690 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1714) {
                this.field1714 = var5;
            }
        }
        this.field1714 = (int) (Math.sqrt((double) this.field1714) + 0.99D);
        this.field1693 = (int) (Math.sqrt((double) (this.field1315 * this.field1315 + this.field1714 * this.field1714)) + 0.99D);
        this.field1692 = this.field1693 + (int) (Math.sqrt((double) (this.field1714 * this.field1714 + this.field1690 * this.field1690)) + 0.99D);
    }

    @ObfuscatedName("cl.d()V")
    public void method1976() {
        if (this.field1689 == 2) {
            return;
        }
        this.field1689 = 2;
        this.field1714 = 0;
        for (int var1 = 0; var1 < this.field1700; var1++) {
            int var2 = this.field1676[var1];
            int var3 = this.field1668[var1];
            int var4 = this.field1669[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1714) {
                this.field1714 = var5;
            }
        }
        this.field1714 = (int) (Math.sqrt((double) this.field1714) + 0.99D);
        this.field1693 = this.field1714;
        this.field1692 = this.field1714 + this.field1714;
    }

    @ObfuscatedName("cl.t()I")
    public int method1977() {
        this.method1975();
        return this.field1714;
    }

    @ObfuscatedName("cl.j(Lca;I)V")
    public void method1978(class93 arg0, int arg1) {
        if (this.field1719 == null || arg1 == -1) {
            return;
        }
        class78 var3 = arg0.field1639[arg1];
        class92 var4 = var3.field1407;
        Statics.field1677 = 0;
        Statics.field1715 = 0;
        Statics.field1716 = 0;
        for (int var5 = 0; var5 < var3.field1403; var5++) {
            int var6 = var3.field1404[var5];
            this.method2003(var4.field1628[var6], var4.field1626[var6], var3.field1405[var5], var3.field1408[var5], var3.field1399[var5]);
        }
        this.field1689 = 0;
    }

    @ObfuscatedName("cl.q(Lca;ILca;I[I)V")
    public void method1979(class93 arg0, int arg1, class93 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1978(arg0, arg1);
            return;
        }
        class78 var6 = arg0.field1639[arg1];
        class78 var7 = arg2.field1639[arg3];
        class92 var8 = var6.field1407;
        Statics.field1677 = 0;
        Statics.field1715 = 0;
        Statics.field1716 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1403; var11++) {
            int var12 = var6.field1404[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1628[var12] == 0) {
                this.method2003(var8.field1628[var12], var8.field1626[var12], var6.field1405[var11], var6.field1408[var11], var6.field1399[var11]);
            }
        }
        Statics.field1677 = 0;
        Statics.field1715 = 0;
        Statics.field1716 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1403; var15++) {
            int var16 = var7.field1404[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1628[var16] == 0) {
                this.method2003(var8.field1628[var16], var8.field1626[var16], var7.field1405[var15], var7.field1408[var15], var7.field1399[var15]);
            }
        }
        this.field1689 = 0;
    }

    @ObfuscatedName("cl.p(I[IIII)V")
    public void method2003(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1677 = 0;
            Statics.field1715 = 0;
            Statics.field1716 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1719.length) {
                    int[] var10 = this.field1719[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1677 += this.field1676[var12];
                        Statics.field1715 += this.field1668[var12];
                        Statics.field1716 += this.field1669[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1677 = Statics.field1677 / var7 + arg2;
                Statics.field1715 = Statics.field1715 / var7 + arg3;
                Statics.field1716 = Statics.field1716 / var7 + arg4;
            } else {
                Statics.field1677 = arg2;
                Statics.field1715 = arg3;
                Statics.field1716 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1719.length) {
                    int[] var15 = this.field1719[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1676[var17] += arg2;
                        this.field1668[var17] += arg3;
                        this.field1669[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1719.length) {
                    int[] var20 = this.field1719[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1676[var22] -= Statics.field1677;
                        this.field1668[var22] -= Statics.field1715;
                        this.field1669[var22] -= Statics.field1716;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1681[var25];
                            int var27 = field1723[var25];
                            int var28 = this.field1676[var22] * var27 + this.field1668[var22] * var26 >> 16;
                            this.field1668[var22] = this.field1668[var22] * var27 - this.field1676[var22] * var26 >> 16;
                            this.field1676[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1681[var23];
                            int var30 = field1723[var23];
                            int var31 = this.field1668[var22] * var30 - this.field1669[var22] * var29 >> 16;
                            this.field1669[var22] = this.field1669[var22] * var30 + this.field1668[var22] * var29 >> 16;
                            this.field1668[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1681[var24];
                            int var33 = field1723[var24];
                            int var34 = this.field1676[var22] * var33 + this.field1669[var22] * var32 >> 16;
                            this.field1669[var22] = this.field1669[var22] * var33 - this.field1676[var22] * var32 >> 16;
                            this.field1676[var22] = var34;
                        }
                        this.field1676[var22] += Statics.field1677;
                        this.field1668[var22] += Statics.field1715;
                        this.field1669[var22] += Statics.field1716;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1719.length) {
                    int[] var37 = this.field1719[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1676[var39] -= Statics.field1677;
                        this.field1668[var39] -= Statics.field1715;
                        this.field1669[var39] -= Statics.field1716;
                        this.field1676[var39] = this.field1676[var39] * arg2 / 128;
                        this.field1668[var39] = this.field1668[var39] * arg3 / 128;
                        this.field1669[var39] = this.field1669[var39] * arg4 / 128;
                        this.field1676[var39] += Statics.field1677;
                        this.field1668[var39] += Statics.field1715;
                        this.field1669[var39] += Statics.field1716;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1703 != null && this.field1678 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1703.length) {
                    int[] var42 = this.field1703[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1678[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1678[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cl.v()V")
    public void method1981() {
        for (int var1 = 0; var1 < this.field1700; var1++) {
            int var2 = this.field1676[var1];
            this.field1676[var1] = this.field1669[var1];
            this.field1669[var1] = -var2;
        }
        this.field1689 = 0;
    }

    @ObfuscatedName("cl.n()V")
    public void method1987() {
        for (int var1 = 0; var1 < this.field1700; var1++) {
            this.field1676[var1] = -this.field1676[var1];
            this.field1669[var1] = -this.field1669[var1];
        }
        this.field1689 = 0;
    }

    @ObfuscatedName("cl.l()V")
    public void method1983() {
        for (int var1 = 0; var1 < this.field1700; var1++) {
            int var2 = this.field1669[var1];
            this.field1669[var1] = this.field1676[var1];
            this.field1676[var1] = -var2;
        }
        this.field1689 = 0;
    }

    @ObfuscatedName("cl.c(I)V")
    public void method1984(int arg0) {
        int var2 = field1681[arg0];
        int var3 = field1723[arg0];
        for (int var4 = 0; var4 < this.field1700; var4++) {
            int var5 = this.field1668[var4] * var3 - this.field1669[var4] * var2 >> 16;
            this.field1669[var4] = this.field1669[var4] * var3 + this.field1668[var4] * var2 >> 16;
            this.field1668[var4] = var5;
        }
        this.field1689 = 0;
    }

    @ObfuscatedName("cl.b(III)V")
    public void method1980(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1700; var4++) {
            this.field1676[var4] += arg0;
            this.field1668[var4] += arg1;
            this.field1669[var4] += arg2;
        }
        this.field1689 = 0;
    }

    @ObfuscatedName("cl.s(III)V")
    public void method2046(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1700; var4++) {
            this.field1676[var4] = this.field1676[var4] * arg0 / 128;
            this.field1668[var4] = this.field1668[var4] * arg1 / 128;
            this.field1669[var4] = this.field1669[var4] * arg2 / 128;
        }
        this.field1689 = 0;
    }

    @ObfuscatedName("cl.az(IIIIIII)V")
    public final void method2004(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1685[0] = -1;
        if (this.field1689 != 2 && this.field1689 != 1) {
            this.method1976();
        }
        int var8 = Statics.field1435;
        int var9 = Statics.field1436;
        int var10 = field1681[arg0];
        int var11 = field1723[arg0];
        int var12 = field1681[arg1];
        int var13 = field1723[arg1];
        int var14 = field1681[arg2];
        int var15 = field1723[arg2];
        int var16 = field1681[arg3];
        int var17 = field1723[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1700; var19++) {
            int var20 = this.field1676[var19];
            int var21 = this.field1668[var19];
            int var22 = this.field1669[var19];
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
            field1699[var19] = var30 - var18;
            field1706[var19] = (var26 << 9) / var30 + var8;
            field1718[var19] = (var29 << 9) / var30 + var9;
            if (this.field1717 > 0) {
                field1698[var19] = var26;
                field1701[var19] = var29;
                field1726[var19] = var30;
            }
        }
        try {
            this.method1989(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cl.av(IIIIIIII)V")
    public final void method1988(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1685[0] = -1;
        if (this.field1689 != 2 && this.field1689 != 1) {
            this.method1976();
        }
        int var9 = Statics.field1435;
        int var10 = Statics.field1436;
        int var11 = field1681[arg0];
        int var12 = field1723[arg0];
        int var13 = field1681[arg1];
        int var14 = field1723[arg1];
        int var15 = field1681[arg2];
        int var16 = field1723[arg2];
        int var17 = field1681[arg3];
        int var18 = field1723[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1700; var20++) {
            int var21 = this.field1676[var20];
            int var22 = this.field1668[var20];
            int var23 = this.field1669[var20];
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
            field1699[var20] = var31 - var19;
            field1706[var20] = (var27 << 9) / arg7 + var9;
            field1718[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1717 > 0) {
                field1698[var20] = var27;
                field1701[var20] = var30;
                field1726[var20] = var31;
            }
        }
        try {
            this.method1989(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cl.o(IIIIIIIII)V")
    public void method1576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1685[0] = -1;
        if (this.field1689 != 1) {
            this.method1975();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1714 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1714 << 9;
        if (var15 / var13 >= Statics.field1440) {
            return;
        }
        int var16 = this.field1714 + var14 << 9;
        if (var16 / var13 <= Statics.field1441) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1714 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1425) {
            return;
        }
        int var20 = (this.field1315 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1442) {
            return;
        }
        int var22 = (this.field1315 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1717 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1671) {
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
            int var32 = field1666 - Statics.field1435;
            int var33 = field1691 - Statics.field1436;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1667) {
                    field1721[field1720++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1435;
        int var35 = Statics.field1436;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1681[arg0];
            var37 = field1723[arg0];
        }
        for (int var38 = 0; var38 < this.field1700; var38++) {
            int var39 = this.field1676[var38];
            int var40 = this.field1668[var38];
            int var41 = this.field1669[var38];
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
            field1699[var38] = var50 - var11;
            if (var50 >= 50) {
                field1706[var38] = (var46 << 9) / var50 + var34;
                field1718[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1706[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1698[var38] = var46;
                field1701[var38] = var49;
                field1726[var38] = var50;
            }
        }
        try {
            this.method1989(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cl.ay(ZZI)V")
    public final void method1989(boolean arg0, boolean arg1, int arg2) {
        if (this.field1692 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1692; var4++) {
            field1685[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1670; var5++) {
            if (this.field1687[var5] != -2) {
                int var6 = this.field1695[var5];
                int var7 = this.field1672[var5];
                int var8 = this.field1673[var5];
                int var9 = field1706[var6];
                int var10 = field1706[var7];
                int var11 = field1706[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1698[var6];
                    int var13 = field1698[var7];
                    int var14 = field1698[var8];
                    int var15 = field1701[var6];
                    int var16 = field1701[var7];
                    int var17 = field1701[var8];
                    int var18 = field1726[var6];
                    int var19 = field1726[var7];
                    int var20 = field1726[var8];
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
                        field1696[var5] = true;
                        int var30 = (field1699[var6] + field1699[var7] + field1699[var8]) / 3 + this.field1693;
                        field1705[var30][field1685[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2023(field1666, field1691, field1718[var6], field1718[var7], field1718[var8], var9, var10, var11)) {
                        field1721[field1720++] = arg2;
                        arg1 = false;
                    }
                    if ((field1718[var8] - field1718[var7]) * (var9 - var10) - (field1718[var6] - field1718[var7]) * (var11 - var10) > 0) {
                        field1696[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1439 && var10 <= Statics.field1439 && var11 <= Statics.field1439) {
                            field1722[var5] = false;
                        } else {
                            field1722[var5] = true;
                        }
                        int var31 = (field1699[var6] + field1699[var7] + field1699[var8]) / 3 + this.field1693;
                        field1705[var31][field1685[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1688 == null) {
            for (int var32 = this.field1692 - 1; var32 >= 0; var32--) {
                int var33 = field1685[var32];
                if (var33 > 0) {
                    int[] var34 = field1705[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method1990(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1684[var36] = 0;
            field1710[var36] = 0;
        }
        for (int var37 = this.field1692 - 1; var37 >= 0; var37--) {
            int var38 = field1685[var37];
            if (var38 > 0) {
                int[] var39 = field1705[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1688[var41];
                    int var43 = field1684[var42]++;
                    field1707[var42][var43] = var41;
                    if (var42 < 10) {
                        field1710[var42] += var37;
                    } else if (var42 == 10) {
                        field1708[var43] = var37;
                    } else {
                        field1709[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1684[1] > 0 || field1684[2] > 0) {
            var44 = (field1710[1] + field1710[2]) / (field1684[1] + field1684[2]);
        }
        int var45 = 0;
        if (field1684[3] > 0 || field1684[4] > 0) {
            var45 = (field1710[3] + field1710[4]) / (field1684[3] + field1684[4]);
        }
        int var46 = 0;
        if (field1684[6] > 0 || field1684[8] > 0) {
            var46 = (field1710[6] + field1710[8]) / (field1684[6] + field1684[8]);
        }
        int var47 = 0;
        int var48 = field1684[10];
        int[] var49 = field1707[10];
        int[] var50 = field1708;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1684[11];
            var49 = field1707[11];
            var50 = field1709;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method1990(var49[var47++]);
                if (var47 == var48 && field1707[11] != var49) {
                    var47 = 0;
                    var48 = field1684[11];
                    var49 = field1707[11];
                    var50 = field1709;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method1990(var49[var47++]);
                if (var47 == var48 && field1707[11] != var49) {
                    var47 = 0;
                    var48 = field1684[11];
                    var49 = field1707[11];
                    var50 = field1709;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method1990(var49[var47++]);
                if (var47 == var48 && field1707[11] != var49) {
                    var47 = 0;
                    var48 = field1684[11];
                    var49 = field1707[11];
                    var50 = field1709;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1684[var52];
            int[] var54 = field1707[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method1990(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method1990(var49[var47++]);
            if (var47 == var48 && field1707[11] != var49) {
                var47 = 0;
                var49 = field1707[11];
                var48 = field1684[11];
                var50 = field1709;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cl.ah(I)V")
    public final void method1990(int arg0) {
        if (field1696[arg0]) {
            this.method1991(arg0);
            return;
        }
        int var2 = this.field1695[arg0];
        int var3 = this.field1672[arg0];
        int var4 = this.field1673[arg0];
        class81.field1428 = field1722[arg0];
        if (this.field1678 == null) {
            class81.field1437 = 0;
        } else {
            class81.field1437 = this.field1678[arg0] & 0xFF;
        }
        if (this.field1680 != null && this.field1680[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1679 == null || this.field1679[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1679[arg0] & 0xFF;
                var6 = this.field1683[var5];
                var7 = this.field1704[var5];
                var8 = this.field1686[var5];
            }
            if (this.field1687[arg0] == -1) {
                class81.method1828(field1718[var2], field1718[var3], field1718[var4], field1706[var2], field1706[var3], field1706[var4], this.field1674[arg0], this.field1674[arg0], this.field1674[arg0], field1698[var6], field1698[var7], field1698[var8], field1701[var6], field1701[var7], field1701[var8], field1726[var6], field1726[var7], field1726[var8], this.field1680[arg0]);
            } else {
                class81.method1828(field1718[var2], field1718[var3], field1718[var4], field1706[var2], field1706[var3], field1706[var4], this.field1674[arg0], this.field1675[arg0], this.field1687[arg0], field1698[var6], field1698[var7], field1698[var8], field1701[var6], field1701[var7], field1701[var8], field1726[var6], field1726[var7], field1726[var8], this.field1680[arg0]);
            }
        } else if (this.field1687[arg0] == -1) {
            class81.method1805(field1718[var2], field1718[var3], field1718[var4], field1706[var2], field1706[var3], field1706[var4], field1724[this.field1674[arg0]]);
        } else {
            class81.method1832(field1718[var2], field1718[var3], field1718[var4], field1706[var2], field1706[var3], field1706[var4], this.field1674[arg0], this.field1675[arg0], this.field1687[arg0]);
        }
    }

    @ObfuscatedName("cl.ao(I)V")
    public final void method1991(int arg0) {
        int var2 = Statics.field1435;
        int var3 = Statics.field1436;
        int var4 = 0;
        int var5 = this.field1695[arg0];
        int var6 = this.field1672[arg0];
        int var7 = this.field1673[arg0];
        int var8 = field1726[var5];
        int var9 = field1726[var6];
        int var10 = field1726[var7];
        if (this.field1678 == null) {
            class81.field1437 = 0;
        } else {
            class81.field1437 = this.field1678[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1711[var4] = field1706[var5];
            field1712[var4] = field1718[var5];
            field1702[var4++] = this.field1674[arg0];
        } else {
            int var11 = field1698[var5];
            int var12 = field1701[var5];
            int var13 = this.field1674[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1725[var10 - var8];
                field1711[var4] = (((field1698[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1712[var4] = (((field1701[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1702[var4++] = ((this.field1687[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1725[var9 - var8];
                field1711[var4] = (((field1698[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1712[var4] = (((field1701[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1702[var4++] = ((this.field1675[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1711[var4] = field1706[var6];
            field1712[var4] = field1718[var6];
            field1702[var4++] = this.field1675[arg0];
        } else {
            int var16 = field1698[var6];
            int var17 = field1701[var6];
            int var18 = this.field1675[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1725[var8 - var9];
                field1711[var4] = (((field1698[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1712[var4] = (((field1701[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1702[var4++] = ((this.field1674[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1725[var10 - var9];
                field1711[var4] = (((field1698[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1712[var4] = (((field1701[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1702[var4++] = ((this.field1687[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1711[var4] = field1706[var7];
            field1712[var4] = field1718[var7];
            field1702[var4++] = this.field1687[arg0];
        } else {
            int var21 = field1698[var7];
            int var22 = field1701[var7];
            int var23 = this.field1687[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1725[var9 - var10];
                field1711[var4] = (((field1698[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1712[var4] = (((field1701[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1702[var4++] = ((this.field1675[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1725[var8 - var10];
                field1711[var4] = (((field1698[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1712[var4] = (((field1701[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1702[var4++] = ((this.field1674[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1711[0];
        int var27 = field1711[1];
        int var28 = field1711[2];
        int var29 = field1712[0];
        int var30 = field1712[1];
        int var31 = field1712[2];
        class81.field1428 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1439 || var27 > Statics.field1439 || var28 > Statics.field1439) {
                class81.field1428 = true;
            }
            if (this.field1680 != null && this.field1680[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1679 == null || this.field1679[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1679[arg0] & 0xFF;
                    var33 = this.field1683[var32];
                    var34 = this.field1704[var32];
                    var35 = this.field1686[var32];
                }
                if (this.field1687[arg0] == -1) {
                    class81.method1828(var29, var30, var31, var26, var27, var28, this.field1674[arg0], this.field1674[arg0], this.field1674[arg0], field1698[var33], field1698[var34], field1698[var35], field1701[var33], field1701[var34], field1701[var35], field1726[var33], field1726[var34], field1726[var35], this.field1680[arg0]);
                } else {
                    class81.method1828(var29, var30, var31, var26, var27, var28, field1702[0], field1702[1], field1702[2], field1698[var33], field1698[var34], field1698[var35], field1701[var33], field1701[var34], field1701[var35], field1726[var33], field1726[var34], field1726[var35], this.field1680[arg0]);
                }
            } else if (this.field1687[arg0] == -1) {
                class81.method1805(var29, var30, var31, var26, var27, var28, field1724[this.field1674[arg0]]);
            } else {
                class81.method1832(var29, var30, var31, var26, var27, var28, field1702[0], field1702[1], field1702[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1439 || var27 > Statics.field1439 || var28 > Statics.field1439 || field1711[3] < 0 || field1711[3] > Statics.field1439) {
            class81.field1428 = true;
        }
        if (this.field1680 != null && this.field1680[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1679 == null || this.field1679[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1679[arg0] & 0xFF;
                var37 = this.field1683[var36];
                var38 = this.field1704[var36];
                var39 = this.field1686[var36];
            }
            short var40 = this.field1680[arg0];
            if (this.field1687[arg0] == -1) {
                class81.method1828(var29, var30, var31, var26, var27, var28, this.field1674[arg0], this.field1674[arg0], this.field1674[arg0], field1698[var37], field1698[var38], field1698[var39], field1701[var37], field1701[var38], field1701[var39], field1726[var37], field1726[var38], field1726[var39], var40);
                class81.method1828(var29, var31, field1712[3], var26, var28, field1711[3], this.field1674[arg0], this.field1674[arg0], this.field1674[arg0], field1698[var37], field1698[var38], field1698[var39], field1701[var37], field1701[var38], field1701[var39], field1726[var37], field1726[var38], field1726[var39], var40);
            } else {
                class81.method1828(var29, var30, var31, var26, var27, var28, field1702[0], field1702[1], field1702[2], field1698[var37], field1698[var38], field1698[var39], field1701[var37], field1701[var38], field1701[var39], field1726[var37], field1726[var38], field1726[var39], var40);
                class81.method1828(var29, var31, field1712[3], var26, var28, field1711[3], field1702[0], field1702[2], field1702[3], field1698[var37], field1698[var38], field1698[var39], field1701[var37], field1701[var38], field1701[var39], field1726[var37], field1726[var38], field1726[var39], var40);
            }
        } else if (this.field1687[arg0] == -1) {
            int var41 = field1724[this.field1674[arg0]];
            class81.method1805(var29, var30, var31, var26, var27, var28, var41);
            class81.method1805(var29, var31, field1712[3], var26, var28, field1711[3], var41);
        } else {
            class81.method1832(var29, var30, var31, var26, var27, var28, field1702[0], field1702[1], field1702[2]);
            class81.method1832(var29, var31, field1712[3], var26, var28, field1711[3], field1702[0], field1702[2], field1702[3]);
        }
    }

    @ObfuscatedName("cl.aj(IIIIIIII)Z")
    public final boolean method2023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
