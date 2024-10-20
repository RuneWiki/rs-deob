package deob;

@ObfuscatedName("eh")
public class class137 extends class145 {

    @ObfuscatedName("eh.h")
    public static class137 field1729 = new class137();

    @ObfuscatedName("eh.v")
    public static byte[] field1686 = new byte[1];

    @ObfuscatedName("eh.x")
    public static class137 field1687 = new class137();

    @ObfuscatedName("eh.w")
    public static byte[] field1688 = new byte[1];

    @ObfuscatedName("eh.t")
    public int field1689 = 0;

    @ObfuscatedName("eh.j")
    public int[] field1717;

    @ObfuscatedName("eh.n")
    public int[] field1691;

    @ObfuscatedName("eh.p")
    public int[] field1692;

    @ObfuscatedName("eh.l")
    public int field1749 = 0;

    @ObfuscatedName("eh.z")
    public int[] field1741;

    @ObfuscatedName("eh.u")
    public int[] field1695;

    @ObfuscatedName("eh.e")
    public int[] field1740;

    @ObfuscatedName("eh.m")
    public int[] field1697;

    @ObfuscatedName("eh.c")
    public int[] field1685;

    @ObfuscatedName("eh.i")
    public int[] field1699;

    @ObfuscatedName("eh.f")
    public byte[] field1700;

    @ObfuscatedName("eh.a")
    public byte[] field1694;

    @ObfuscatedName("eh.b")
    public byte[] field1702;

    @ObfuscatedName("eh.y")
    public short[] field1747;

    @ObfuscatedName("eh.r")
    public byte field1723 = 0;

    @ObfuscatedName("eh.q")
    public int field1705 = 0;

    @ObfuscatedName("eh.g")
    public int[] field1724;

    @ObfuscatedName("eh.s")
    public int[] field1746;

    @ObfuscatedName("eh.o")
    public int[] field1708;

    @ObfuscatedName("eh.k")
    public int[][] field1709;

    @ObfuscatedName("eh.d")
    public int[][] field1710;

    @ObfuscatedName("eh.an")
    public boolean field1711 = false;

    @ObfuscatedName("eh.aj")
    public int field1712;

    @ObfuscatedName("eh.ax")
    public int field1713;

    @ObfuscatedName("eh.ag")
    public int field1714;

    @ObfuscatedName("eh.au")
    public int field1715;

    @ObfuscatedName("eh.as")
    public int field1716;

    @ObfuscatedName("eh.ae")
    public int field1707;

    @ObfuscatedName("eh.ac")
    public int field1718;

    @ObfuscatedName("eh.ak")
    public int field1719;

    @ObfuscatedName("eh.av")
    public int field1720 = -1;

    @ObfuscatedName("eh.aq")
    public int field1721 = -1;

    @ObfuscatedName("eh.ah")
    public int field1743 = -1;

    @ObfuscatedName("eh.aa")
    public static boolean[] field1750 = new boolean[4700];

    @ObfuscatedName("eh.ao")
    public static boolean[] field1725 = new boolean[4700];

    @ObfuscatedName("eh.ab")
    public static int[] field1726 = new int[4700];

    @ObfuscatedName("eh.aw")
    public static int[] field1727 = new int[4700];

    @ObfuscatedName("eh.ap")
    public static int[] field1728 = new int[4700];

    @ObfuscatedName("eh.ad")
    public static int[] field1704 = new int[4700];

    @ObfuscatedName("eh.ai")
    public static int[] field1730 = new int[4700];

    @ObfuscatedName("eh.al")
    public static int[] field1731 = new int[4700];

    @ObfuscatedName("eh.af")
    public static int[] field1733 = new int[1600];

    @ObfuscatedName("eh.ar")
    public static int[][] field1734 = new int[1600][512];

    @ObfuscatedName("eh.az")
    public static int[] field1735 = new int[12];

    @ObfuscatedName("eh.at")
    public static int[][] field1736 = new int[12][2000];

    @ObfuscatedName("eh.bh")
    public static int[] field1737 = new int[2000];

    @ObfuscatedName("eh.by")
    public static int[] field1738 = new int[2000];

    @ObfuscatedName("eh.bs")
    public static int[] field1739 = new int[12];

    @ObfuscatedName("eh.br")
    public static int[] field1690 = new int[10];

    @ObfuscatedName("eh.bl")
    public static int[] field1703 = new int[10];

    @ObfuscatedName("eh.bx")
    public static int[] field1742 = new int[10];

    @ObfuscatedName("eh.bn")
    public static boolean field1732 = true;

    @ObfuscatedName("eh.bi")
    public static int[] field1698 = class140.field1798;

    @ObfuscatedName("eh.bk")
    public static int[] field1744 = class140.field1781;

    @ObfuscatedName("eh.bw")
    public static int[] field1751 = class140.field1801;

    @ObfuscatedName("eh.bo")
    public static int[] field1752 = class140.field1804;

    public class137() {
    }

    public class137(class137[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1689 = 0;
        this.field1749 = 0;
        this.field1705 = 0;
        this.field1723 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class137 var8 = arg0[var7];
            if (var8 != null) {
                this.field1689 += var8.field1689;
                this.field1749 += var8.field1749;
                this.field1705 += var8.field1705;
                if (var8.field1700 == null) {
                    if (this.field1723 == -1) {
                        this.field1723 = var8.field1723;
                    }
                    if (this.field1723 != var8.field1723) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1694 != null;
                var5 |= var8.field1747 != null;
                var6 |= var8.field1702 != null;
            }
        }
        this.field1717 = new int[this.field1689];
        this.field1691 = new int[this.field1689];
        this.field1692 = new int[this.field1689];
        this.field1741 = new int[this.field1749];
        this.field1695 = new int[this.field1749];
        this.field1740 = new int[this.field1749];
        this.field1697 = new int[this.field1749];
        this.field1685 = new int[this.field1749];
        this.field1699 = new int[this.field1749];
        if (var3) {
            this.field1700 = new byte[this.field1749];
        }
        if (var4) {
            this.field1694 = new byte[this.field1749];
        }
        if (var5) {
            this.field1747 = new short[this.field1749];
        }
        if (var6) {
            this.field1702 = new byte[this.field1749];
        }
        if (this.field1705 > 0) {
            this.field1724 = new int[this.field1705];
            this.field1746 = new int[this.field1705];
            this.field1708 = new int[this.field1705];
        }
        this.field1689 = 0;
        this.field1749 = 0;
        this.field1705 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class137 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1749; var11++) {
                    this.field1741[this.field1749] = var10.field1741[var11] + this.field1689;
                    this.field1695[this.field1749] = var10.field1695[var11] + this.field1689;
                    this.field1740[this.field1749] = var10.field1740[var11] + this.field1689;
                    this.field1697[this.field1749] = var10.field1697[var11];
                    this.field1685[this.field1749] = var10.field1685[var11];
                    this.field1699[this.field1749] = var10.field1699[var11];
                    if (var3) {
                        if (var10.field1700 == null) {
                            this.field1700[this.field1749] = var10.field1723;
                        } else {
                            this.field1700[this.field1749] = var10.field1700[var11];
                        }
                    }
                    if (var4 && var10.field1694 != null) {
                        this.field1694[this.field1749] = var10.field1694[var11];
                    }
                    if (var5) {
                        if (var10.field1747 == null) {
                            this.field1747[this.field1749] = -1;
                        } else {
                            this.field1747[this.field1749] = var10.field1747[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1702 == null || var10.field1702[var11] == -1) {
                            this.field1702[this.field1749] = -1;
                        } else {
                            this.field1702[this.field1749] = (byte) (var10.field1702[var11] + this.field1705);
                        }
                    }
                    this.field1749++;
                }
                for (int var12 = 0; var12 < var10.field1705; var12++) {
                    this.field1724[this.field1705] = var10.field1724[var12] + this.field1689;
                    this.field1746[this.field1705] = var10.field1746[var12] + this.field1689;
                    this.field1708[this.field1705] = var10.field1708[var12] + this.field1689;
                    this.field1705++;
                }
                for (int var13 = 0; var13 < var10.field1689; var13++) {
                    this.field1717[this.field1689] = var10.field1717[var13];
                    this.field1691[this.field1689] = var10.field1691[var13];
                    this.field1692[this.field1689] = var10.field1692[var13];
                    this.field1689++;
                }
            }
        }
    }

    @ObfuscatedName("eh.h([[IIIIZI)Leh;")
    public class137 method2775(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2744();
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
        class137 var15;
        if (arg4) {
            var15 = new class137();
            var15.field1689 = this.field1689;
            var15.field1749 = this.field1749;
            var15.field1705 = this.field1705;
            var15.field1717 = this.field1717;
            var15.field1692 = this.field1692;
            var15.field1741 = this.field1741;
            var15.field1695 = this.field1695;
            var15.field1740 = this.field1740;
            var15.field1697 = this.field1697;
            var15.field1685 = this.field1685;
            var15.field1699 = this.field1699;
            var15.field1700 = this.field1700;
            var15.field1694 = this.field1694;
            var15.field1702 = this.field1702;
            var15.field1747 = this.field1747;
            var15.field1723 = this.field1723;
            var15.field1724 = this.field1724;
            var15.field1746 = this.field1746;
            var15.field1708 = this.field1708;
            var15.field1709 = this.field1709;
            var15.field1710 = this.field1710;
            var15.field1711 = this.field1711;
            var15.field1691 = new int[var15.field1689];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1689; var16++) {
                int var17 = this.field1717[var16] + arg1;
                int var18 = this.field1692[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1691[var16] = this.field1691[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1689; var26++) {
                int var27 = (-this.field1691[var26] << 16) / this.field1895;
                if (var27 < arg5) {
                    int var28 = this.field1717[var26] + arg1;
                    int var29 = this.field1692[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1691[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1691[var26];
                }
            }
        }
        var15.method2726();
        return var15;
    }

    @ObfuscatedName("eh.v(Z)Leh;")
    public class137 method2719(boolean arg0) {
        if (!arg0 && field1686.length < this.field1749) {
            field1686 = new byte[this.field1749 + 100];
        }
        return this.method2718(arg0, field1729, field1686);
    }

    @ObfuscatedName("eh.x(Z)Leh;")
    public class137 method2720(boolean arg0) {
        if (!arg0 && field1688.length < this.field1749) {
            field1688 = new byte[this.field1749 + 100];
        }
        return this.method2718(arg0, field1687, field1688);
    }

    @ObfuscatedName("eh.w(ZLeh;[B)Leh;")
    public class137 method2718(boolean arg0, class137 arg1, byte[] arg2) {
        arg1.field1689 = this.field1689;
        arg1.field1749 = this.field1749;
        arg1.field1705 = this.field1705;
        if (arg1.field1717 == null || arg1.field1717.length < this.field1689) {
            arg1.field1717 = new int[this.field1689 + 100];
            arg1.field1691 = new int[this.field1689 + 100];
            arg1.field1692 = new int[this.field1689 + 100];
        }
        for (int var4 = 0; var4 < this.field1689; var4++) {
            arg1.field1717[var4] = this.field1717[var4];
            arg1.field1691[var4] = this.field1691[var4];
            arg1.field1692[var4] = this.field1692[var4];
        }
        if (arg0) {
            arg1.field1694 = this.field1694;
        } else {
            arg1.field1694 = arg2;
            if (this.field1694 == null) {
                for (int var5 = 0; var5 < this.field1749; var5++) {
                    arg1.field1694[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1749; var6++) {
                    arg1.field1694[var6] = this.field1694[var6];
                }
            }
        }
        arg1.field1741 = this.field1741;
        arg1.field1695 = this.field1695;
        arg1.field1740 = this.field1740;
        arg1.field1697 = this.field1697;
        arg1.field1685 = this.field1685;
        arg1.field1699 = this.field1699;
        arg1.field1700 = this.field1700;
        arg1.field1702 = this.field1702;
        arg1.field1747 = this.field1747;
        arg1.field1723 = this.field1723;
        arg1.field1724 = this.field1724;
        arg1.field1746 = this.field1746;
        arg1.field1708 = this.field1708;
        arg1.field1709 = this.field1709;
        arg1.field1710 = this.field1710;
        arg1.field1711 = this.field1711;
        arg1.method2726();
        return arg1;
    }

    @ObfuscatedName("eh.t(I)V")
    public void method2722(int arg0) {
        if (this.field1720 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1744[arg0];
        int var9 = field1698[arg0];
        for (int var10 = 0; var10 < this.field1689; var10++) {
            int var11 = class140.method2858(this.field1717[var10], this.field1692[var10], var8, var9);
            int var12 = this.field1691[var10];
            int var13 = class140.method2913(this.field1717[var10], this.field1692[var10], var8, var9);
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
        }
        this.field1707 = (var2 + var5) / 2;
        this.field1718 = (var3 + var6) / 2;
        this.field1719 = (var4 + var7) / 2;
        this.field1720 = (var5 - var2 + 1) / 2;
        this.field1721 = (var6 - var3 + 1) / 2;
        this.field1743 = (var7 - var4 + 1) / 2;
        if (this.field1720 < 32) {
            this.field1720 = 32;
        }
        if (this.field1743 < 32) {
            this.field1743 = 32;
        }
        if (this.field1711) {
            this.field1720 += 8;
            this.field1743 += 8;
        }
    }

    @ObfuscatedName("eh.j()V")
    public void method2744() {
        if (this.field1712 == 1) {
            return;
        }
        this.field1712 = 1;
        this.field1895 = 0;
        this.field1713 = 0;
        this.field1714 = 0;
        for (int var1 = 0; var1 < this.field1689; var1++) {
            int var2 = this.field1717[var1];
            int var3 = this.field1691[var1];
            int var4 = this.field1692[var1];
            if (-var3 > this.field1895) {
                this.field1895 = -var3;
            }
            if (var3 > this.field1713) {
                this.field1713 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1714) {
                this.field1714 = var5;
            }
        }
        this.field1714 = (int) (Math.sqrt((double) this.field1714) + 0.99D);
        this.field1716 = (int) (Math.sqrt((double) (this.field1895 * this.field1895 + this.field1714 * this.field1714)) + 0.99D);
        this.field1715 = this.field1716 + (int) (Math.sqrt((double) (this.field1714 * this.field1714 + this.field1713 * this.field1713)) + 0.99D);
    }

    @ObfuscatedName("eh.n()V")
    public void method2717() {
        if (this.field1712 == 2) {
            return;
        }
        this.field1712 = 2;
        this.field1714 = 0;
        for (int var1 = 0; var1 < this.field1689; var1++) {
            int var2 = this.field1717[var1];
            int var3 = this.field1691[var1];
            int var4 = this.field1692[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1714) {
                this.field1714 = var5;
            }
        }
        this.field1714 = (int) (Math.sqrt((double) this.field1714) + 0.99D);
        this.field1716 = this.field1714;
        this.field1715 = this.field1714 + this.field1714;
    }

    @ObfuscatedName("eh.p()I")
    public int method2761() {
        this.method2744();
        return this.field1714;
    }

    @ObfuscatedName("eh.z()V")
    public void method2726() {
        this.field1712 = 0;
        this.field1720 = -1;
    }

    @ObfuscatedName("eh.u(Lep;I)V")
    public void method2727(class148 arg0, int arg1) {
        if (this.field1709 == null || arg1 == -1) {
            return;
        }
        class135 var3 = arg0.field1910[arg1];
        class142 var4 = var3.field1655;
        Statics.field1706 = 0;
        Statics.field1696 = 0;
        Statics.field1745 = 0;
        for (int var5 = 0; var5 < var3.field1656; var5++) {
            int var6 = var3.field1657[var5];
            this.method2729(var4.field1819[var6], var4.field1820[var6], var3.field1651[var5], var3.field1659[var5], var3.field1654[var5]);
        }
        this.method2726();
    }

    @ObfuscatedName("eh.e(Lep;ILep;I[I)V")
    public void method2728(class148 arg0, int arg1, class148 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2727(arg0, arg1);
            return;
        }
        class135 var6 = arg0.field1910[arg1];
        class135 var7 = arg2.field1910[arg3];
        class142 var8 = var6.field1655;
        Statics.field1706 = 0;
        Statics.field1696 = 0;
        Statics.field1745 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1656; var11++) {
            int var12 = var6.field1657[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1819[var12] == 0) {
                this.method2729(var8.field1819[var12], var8.field1820[var12], var6.field1651[var11], var6.field1659[var11], var6.field1654[var11]);
            }
        }
        Statics.field1706 = 0;
        Statics.field1696 = 0;
        Statics.field1745 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1656; var15++) {
            int var16 = var7.field1657[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1819[var16] == 0) {
                this.method2729(var8.field1819[var16], var8.field1820[var16], var7.field1651[var15], var7.field1659[var15], var7.field1654[var15]);
            }
        }
        this.method2726();
    }

    @ObfuscatedName("eh.m(I[IIII)V")
    public void method2729(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1706 = 0;
            Statics.field1696 = 0;
            Statics.field1745 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1709.length) {
                    int[] var10 = this.field1709[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1706 += this.field1717[var12];
                        Statics.field1696 += this.field1691[var12];
                        Statics.field1745 += this.field1692[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1706 = Statics.field1706 / var7 + arg2;
                Statics.field1696 = Statics.field1696 / var7 + arg3;
                Statics.field1745 = Statics.field1745 / var7 + arg4;
            } else {
                Statics.field1706 = arg2;
                Statics.field1696 = arg3;
                Statics.field1745 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1709.length) {
                    int[] var15 = this.field1709[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1717[var17] += arg2;
                        this.field1691[var17] += arg3;
                        this.field1692[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1709.length) {
                    int[] var20 = this.field1709[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1717[var22] -= Statics.field1706;
                        this.field1691[var22] -= Statics.field1696;
                        this.field1692[var22] -= Statics.field1745;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1698[var25];
                            int var27 = field1744[var25];
                            int var28 = this.field1717[var22] * var27 + this.field1691[var22] * var26 >> 16;
                            this.field1691[var22] = this.field1691[var22] * var27 - this.field1717[var22] * var26 >> 16;
                            this.field1717[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1698[var23];
                            int var30 = field1744[var23];
                            int var31 = this.field1691[var22] * var30 - this.field1692[var22] * var29 >> 16;
                            this.field1692[var22] = this.field1692[var22] * var30 + this.field1691[var22] * var29 >> 16;
                            this.field1691[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1698[var24];
                            int var33 = field1744[var24];
                            int var34 = this.field1717[var22] * var33 + this.field1692[var22] * var32 >> 16;
                            this.field1692[var22] = this.field1692[var22] * var33 - this.field1717[var22] * var32 >> 16;
                            this.field1717[var22] = var34;
                        }
                        this.field1717[var22] += Statics.field1706;
                        this.field1691[var22] += Statics.field1696;
                        this.field1692[var22] += Statics.field1745;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1709.length) {
                    int[] var37 = this.field1709[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1717[var39] -= Statics.field1706;
                        this.field1691[var39] -= Statics.field1696;
                        this.field1692[var39] -= Statics.field1745;
                        this.field1717[var39] = this.field1717[var39] * arg2 / 128;
                        this.field1691[var39] = this.field1691[var39] * arg3 / 128;
                        this.field1692[var39] = this.field1692[var39] * arg4 / 128;
                        this.field1717[var39] += Statics.field1706;
                        this.field1691[var39] += Statics.field1696;
                        this.field1692[var39] += Statics.field1745;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1710 != null && this.field1694 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1710.length) {
                    int[] var42 = this.field1710[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1694[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1694[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("eh.c()V")
    public void method2743() {
        for (int var1 = 0; var1 < this.field1689; var1++) {
            int var2 = this.field1717[var1];
            this.field1717[var1] = this.field1692[var1];
            this.field1692[var1] = -var2;
        }
        this.method2726();
    }

    @ObfuscatedName("eh.i()V")
    public void method2731() {
        for (int var1 = 0; var1 < this.field1689; var1++) {
            this.field1717[var1] = -this.field1717[var1];
            this.field1692[var1] = -this.field1692[var1];
        }
        this.method2726();
    }

    @ObfuscatedName("eh.f()V")
    public void method2804() {
        for (int var1 = 0; var1 < this.field1689; var1++) {
            int var2 = this.field1692[var1];
            this.field1692[var1] = this.field1717[var1];
            this.field1717[var1] = -var2;
        }
        this.method2726();
    }

    @ObfuscatedName("eh.y(I)V")
    public void method2733(int arg0) {
        int var2 = field1698[arg0];
        int var3 = field1744[arg0];
        for (int var4 = 0; var4 < this.field1689; var4++) {
            int var5 = this.field1691[var4] * var3 - this.field1692[var4] * var2 >> 16;
            this.field1692[var4] = this.field1692[var4] * var3 + this.field1691[var4] * var2 >> 16;
            this.field1691[var4] = var5;
        }
        this.method2726();
    }

    @ObfuscatedName("eh.r(III)V")
    public void method2721(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1689; var4++) {
            this.field1717[var4] += arg0;
            this.field1691[var4] += arg1;
            this.field1692[var4] += arg2;
        }
        this.method2726();
    }

    @ObfuscatedName("eh.q(III)V")
    public void method2735(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1689; var4++) {
            this.field1717[var4] = this.field1717[var4] * arg0 / 128;
            this.field1691[var4] = this.field1691[var4] * arg1 / 128;
            this.field1692[var4] = this.field1692[var4] * arg2 / 128;
        }
        this.method2726();
    }

    @ObfuscatedName("eh.g(IIIIIII)V")
    public final void method2736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1733[0] = -1;
        if (this.field1712 != 2 && this.field1712 != 1) {
            this.method2717();
        }
        int var8 = Statics.field1786;
        int var9 = Statics.field1793;
        int var10 = field1698[arg0];
        int var11 = field1744[arg0];
        int var12 = field1698[arg1];
        int var13 = field1744[arg1];
        int var14 = field1698[arg2];
        int var15 = field1744[arg2];
        int var16 = field1698[arg3];
        int var17 = field1744[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1689; var19++) {
            int var20 = this.field1717[var19];
            int var21 = this.field1691[var19];
            int var22 = this.field1692[var19];
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
            field1728[var19] = var30 - var18;
            field1726[var19] = class140.field1797 * var26 / var30 + var8;
            field1727[var19] = class140.field1797 * var29 / var30 + var9;
            if (this.field1705 > 0) {
                field1704[var19] = var26;
                field1730[var19] = var29;
                field1731[var19] = var30;
            }
        }
        try {
            this.method2732(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("eh.o(IIIIIIII)V")
    public final void method2737(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1733[0] = -1;
        if (this.field1712 != 2 && this.field1712 != 1) {
            this.method2717();
        }
        int var9 = Statics.field1786;
        int var10 = Statics.field1793;
        int var11 = field1698[arg0];
        int var12 = field1744[arg0];
        int var13 = field1698[arg1];
        int var14 = field1744[arg1];
        int var15 = field1698[arg2];
        int var16 = field1744[arg2];
        int var17 = field1698[arg3];
        int var18 = field1744[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1689; var20++) {
            int var21 = this.field1717[var20];
            int var22 = this.field1691[var20];
            int var23 = this.field1692[var20];
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
            field1728[var20] = var31 - var19;
            field1726[var20] = class140.field1797 * var27 / arg7 + var9;
            field1727[var20] = class140.field1797 * var30 / arg7 + var10;
            if (this.field1705 > 0) {
                field1704[var20] = var27;
                field1730[var20] = var30;
                field1731[var20] = var31;
            }
        }
        try {
            this.method2732(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("eh.cf(IIIIIIIIJ)V")
    public void method2738(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1733[0] = -1;
        if (this.field1712 != 1) {
            this.method2744();
        }
        this.method2722(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1714 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1714) * class140.field1797;
        if (var16 / var14 >= Statics.field1806) {
            return;
        }
        int var17 = (this.field1714 + var15) * class140.field1797;
        if (var17 / var14 <= Statics.field1796) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1714 * arg1 >> 16;
        int var20 = (var18 + var19) * class140.field1797;
        if (var20 / var14 <= Statics.field1799) {
            return;
        }
        int var21 = (this.field1895 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class140.field1797;
        if (var22 / var14 >= Statics.field1791) {
            return;
        }
        int var23 = (this.field1895 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1705 > 0;
        int var27 = class138.method1845();
        int var28 = class138.field1756;
        boolean var30 = class138.method4936();
        boolean var31 = class138.method1795(arg8);
        boolean var32 = false;
        if (var31 && var30) {
            boolean var33 = false;
            if (field1732) {
                boolean var35 = class138.field1757;
                boolean var36;
                if (var35) {
                    if (!class138.field1758) {
                        int var37 = Statics.field1851;
                        int var38 = Statics.field1852;
                        int var39 = Statics.field1863;
                        int var40 = Statics.field1856;
                        byte var41 = 50;
                        short var42 = 3500;
                        int var43 = (class138.field1765 - Statics.field1786) * var41 / class140.field1797;
                        int var44 = (class138.field1756 - Statics.field1793) * var41 / class140.field1797;
                        int var45 = (class138.field1765 - Statics.field1786) * var42 / class140.field1797;
                        int var46 = (class138.field1756 - Statics.field1793) * var42 / class140.field1797;
                        int var47 = class140.method2862(var44, var41, var38, var37);
                        int var48 = class140.method2864(var44, var41, var38, var37);
                        int var50 = class140.method2862(var46, var42, var38, var37);
                        int var51 = class140.method2864(var46, var42, var38, var37);
                        int var53 = class140.method2860(var43, var48, var40, var39);
                        int var54 = class140.method2903(var43, var48, var40, var39);
                        int var56 = class140.method2860(var45, var51, var40, var39);
                        int var57 = class140.method2903(var45, var51, var40, var39);
                        Statics.field1759 = (var53 + var56) / 2;
                        Statics.field1760 = (var47 + var50) / 2;
                        Statics.field1766 = (var54 + var57) / 2;
                        Statics.field1762 = (var56 - var53) / 2;
                        Statics.field1763 = (var50 - var47) / 2;
                        Statics.field2779 = (var57 - var54) / 2;
                        Statics.field1066 = Math.abs(Statics.field1762);
                        Statics.field2536 = Math.abs(Statics.field1763);
                        Statics.field147 = Math.abs(Statics.field2779);
                    }
                    int var59 = this.field1707 + arg5;
                    int var60 = this.field1718 + arg6;
                    int var61 = this.field1719 + arg7;
                    int var62 = this.field1720;
                    int var63 = this.field1721;
                    int var64 = this.field1743;
                    int var65 = Statics.field1759 - var59;
                    int var66 = Statics.field1760 - var60;
                    int var67 = Statics.field1766 - var61;
                    if (Math.abs(var65) > Statics.field1066 + var62) {
                        var36 = false;
                    } else if (Math.abs(var66) > Statics.field2536 + var63) {
                        var36 = false;
                    } else if (Math.abs(var67) > Statics.field147 + var64) {
                        var36 = false;
                    } else if (Math.abs(Statics.field1763 * var67 - Statics.field2779 * var66) > Statics.field2536 * var64 + Statics.field147 * var63) {
                        var36 = false;
                    } else if (Math.abs(Statics.field2779 * var65 - Statics.field1762 * var67) > Statics.field147 * var62 + Statics.field1066 * var64) {
                        var36 = false;
                    } else if (Math.abs(Statics.field1762 * var66 - Statics.field1763 * var65) > Statics.field2536 * var62 + Statics.field1066 * var63) {
                        var36 = false;
                    } else {
                        var36 = true;
                    }
                } else {
                    var36 = false;
                }
                var33 = var36;
            } else {
                int var68 = var12 - var13;
                if (var68 <= 50) {
                    var68 = 50;
                }
                int var69;
                int var70;
                if (var15 > 0) {
                    var69 = var16 / var14;
                    var70 = var17 / var68;
                } else {
                    var70 = var17 / var14;
                    var69 = var16 / var68;
                }
                int var71;
                int var72;
                if (var18 > 0) {
                    var71 = var22 / var14;
                    var72 = var20 / var68;
                } else {
                    var72 = var20 / var14;
                    var71 = var22 / var68;
                }
                int var73 = var27 - Statics.field1786;
                int var74 = var28 - Statics.field1793;
                if (var73 > var69 && var73 < var70 && var74 > var71 && var74 < var72) {
                    var33 = true;
                }
            }
            if (var33) {
                if (this.field1711) {
                    class138.field1769[++class138.field1764 - 1] = arg8;
                } else {
                    var32 = true;
                }
            }
        }
        int var77 = Statics.field1786;
        int var78 = Statics.field1793;
        int var79 = 0;
        int var80 = 0;
        if (arg0 != 0) {
            var79 = field1698[arg0];
            var80 = field1744[arg0];
        }
        for (int var81 = 0; var81 < this.field1689; var81++) {
            int var82 = this.field1717[var81];
            int var83 = this.field1691[var81];
            int var84 = this.field1692[var81];
            if (arg0 != 0) {
                int var85 = var79 * var84 + var80 * var82 >> 16;
                var84 = var80 * var84 - var79 * var82 >> 16;
                var82 = var85;
            }
            int var86 = arg5 + var82;
            int var87 = arg6 + var83;
            int var88 = arg7 + var84;
            int var89 = arg3 * var88 + arg4 * var86 >> 16;
            int var90 = arg4 * var88 - arg3 * var86 >> 16;
            int var92 = arg2 * var87 - arg1 * var90 >> 16;
            int var93 = arg1 * var87 + arg2 * var90 >> 16;
            field1728[var81] = var93 - var12;
            if (var93 >= 50) {
                field1726[var81] = class140.field1797 * var89 / var93 + var77;
                field1727[var81] = class140.field1797 * var92 / var93 + var78;
            } else {
                field1726[var81] = -5000;
                var24 = true;
            }
            if (var26) {
                field1704[var81] = var89;
                field1730[var81] = var92;
                field1731[var81] = var93;
            }
        }
        try {
            this.method2732(var24, var32, this.field1711, arg8);
        } catch (Exception var96) {
        }
    }

    @ObfuscatedName("eh.an(ZZZJ)V")
    public final void method2732(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1715 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1715; var6++) {
            field1733[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1749; var8++) {
            if (this.field1699[var8] != -2) {
                int var9 = this.field1741[var8];
                int var10 = this.field1695[var8];
                int var11 = this.field1740[var8];
                int var12 = field1726[var9];
                int var13 = field1726[var10];
                int var14 = field1726[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field1704[var9];
                    int var16 = field1704[var10];
                    int var17 = field1704[var11];
                    int var18 = field1730[var9];
                    int var19 = field1730[var10];
                    int var20 = field1730[var11];
                    int var21 = field1731[var9];
                    int var22 = field1731[var10];
                    int var23 = field1731[var11];
                    int var24 = var15 - var16;
                    int var25 = var17 - var16;
                    int var26 = var18 - var19;
                    int var27 = var20 - var19;
                    int var28 = var21 - var22;
                    int var29 = var23 - var22;
                    int var30 = var26 * var29 - var27 * var28;
                    int var31 = var25 * var28 - var24 * var29;
                    int var32 = var24 * var27 - var25 * var26;
                    if (var22 * var32 + var16 * var30 + var19 * var31 > 0) {
                        field1725[var8] = true;
                        int var33 = (field1728[var9] + field1728[var10] + field1728[var11]) / 3 + this.field1716;
                        field1734[var33][field1733[var33]++] = var8;
                    }
                } else {
                    if (arg1) {
                        int var34 = field1727[var9];
                        int var35 = field1727[var10];
                        int var36 = field1727[var11];
                        int var37 = class138.field1756 + var7;
                        boolean var38;
                        if (var37 < var34 && var37 < var35 && var37 < var36) {
                            var38 = false;
                        } else {
                            int var39 = class138.field1756 - var7;
                            if (var39 > var34 && var39 > var35 && var39 > var36) {
                                var38 = false;
                            } else {
                                int var40 = class138.field1765 + var7;
                                if (var40 < var12 && var40 < var13 && var40 < var14) {
                                    var38 = false;
                                } else {
                                    int var41 = class138.field1765 - var7;
                                    if (var41 > var12 && var41 > var13 && var41 > var14) {
                                        var38 = false;
                                    } else {
                                        var38 = true;
                                    }
                                }
                            }
                        }
                        if (var38) {
                            class138.field1769[++class138.field1764 - 1] = arg3;
                            arg1 = false;
                        }
                    }
                    if ((field1727[var11] - field1727[var10]) * (var12 - var13) - (field1727[var9] - field1727[var10]) * (var14 - var13) > 0) {
                        field1725[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1794 && var13 <= Statics.field1794 && var14 <= Statics.field1794) {
                            field1750[var8] = false;
                        } else {
                            field1750[var8] = true;
                        }
                        int var44 = (field1728[var9] + field1728[var10] + field1728[var11]) / 3 + this.field1716;
                        field1734[var44][field1733[var44]++] = var8;
                    }
                }
            }
        }
        if (this.field1700 == null) {
            for (int var45 = this.field1715 - 1; var45 >= 0; var45--) {
                int var46 = field1733[var45];
                if (var46 > 0) {
                    int[] var47 = field1734[var45];
                    for (int var48 = 0; var48 < var46; var48++) {
                        this.method2734(var47[var48]);
                    }
                }
            }
            return;
        }
        for (int var49 = 0; var49 < 12; var49++) {
            field1735[var49] = 0;
            field1739[var49] = 0;
        }
        for (int var50 = this.field1715 - 1; var50 >= 0; var50--) {
            int var51 = field1733[var50];
            if (var51 > 0) {
                int[] var52 = field1734[var50];
                for (int var53 = 0; var53 < var51; var53++) {
                    int var54 = var52[var53];
                    byte var55 = this.field1700[var54];
                    int var56 = field1735[var55]++;
                    field1736[var55][var56] = var54;
                    if (var55 < 10) {
                        field1739[var55] += var50;
                    } else if (var55 == 10) {
                        field1737[var56] = var50;
                    } else {
                        field1738[var56] = var50;
                    }
                }
            }
        }
        int var57 = 0;
        if (field1735[1] > 0 || field1735[2] > 0) {
            var57 = (field1739[1] + field1739[2]) / (field1735[1] + field1735[2]);
        }
        int var58 = 0;
        if (field1735[3] > 0 || field1735[4] > 0) {
            var58 = (field1739[3] + field1739[4]) / (field1735[3] + field1735[4]);
        }
        int var59 = 0;
        if (field1735[6] > 0 || field1735[8] > 0) {
            var59 = (field1739[6] + field1739[8]) / (field1735[6] + field1735[8]);
        }
        int var60 = 0;
        int var61 = field1735[10];
        int[] var62 = field1736[10];
        int[] var63 = field1737;
        if (var60 == var61) {
            var60 = 0;
            var61 = field1735[11];
            var62 = field1736[11];
            var63 = field1738;
        }
        int var64;
        if (var60 < var61) {
            var64 = var63[var60];
        } else {
            var64 = -1000;
        }
        for (int var65 = 0; var65 < 10; var65++) {
            while (var65 == 0 && var64 > var57) {
                this.method2734(var62[var60++]);
                if (var60 == var61 && field1736[11] != var62) {
                    var60 = 0;
                    var61 = field1735[11];
                    var62 = field1736[11];
                    var63 = field1738;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            while (var65 == 3 && var64 > var58) {
                this.method2734(var62[var60++]);
                if (var60 == var61 && field1736[11] != var62) {
                    var60 = 0;
                    var61 = field1735[11];
                    var62 = field1736[11];
                    var63 = field1738;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            while (var65 == 5 && var64 > var59) {
                this.method2734(var62[var60++]);
                if (var60 == var61 && field1736[11] != var62) {
                    var60 = 0;
                    var61 = field1735[11];
                    var62 = field1736[11];
                    var63 = field1738;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            int var66 = field1735[var65];
            int[] var67 = field1736[var65];
            for (int var68 = 0; var68 < var66; var68++) {
                this.method2734(var67[var68]);
            }
        }
        while (var64 != -1000) {
            this.method2734(var62[var60++]);
            if (var60 == var61 && field1736[11] != var62) {
                var60 = 0;
                var62 = field1736[11];
                var61 = field1735[11];
                var63 = field1738;
            }
            if (var60 < var61) {
                var64 = var63[var60];
            } else {
                var64 = -1000;
            }
        }
    }

    @ObfuscatedName("eh.aj(I)V")
    public final void method2734(int arg0) {
        if (field1725[arg0]) {
            this.method2748(arg0);
            return;
        }
        int var2 = this.field1741[arg0];
        int var3 = this.field1695[arg0];
        int var4 = this.field1740[arg0];
        class140.field1792 = field1750[arg0];
        if (this.field1694 == null) {
            class140.field1784 = 0;
        } else {
            class140.field1784 = this.field1694[arg0] & 0xFF;
        }
        if (this.field1747 != null && this.field1747[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1702 == null || this.field1702[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1702[arg0] & 0xFF;
                var6 = this.field1724[var5];
                var7 = this.field1746[var5];
                var8 = this.field1708[var5];
            }
            if (this.field1699[arg0] == -1) {
                class140.method2853(field1727[var2], field1727[var3], field1727[var4], field1726[var2], field1726[var3], field1726[var4], this.field1697[arg0], this.field1697[arg0], this.field1697[arg0], field1704[var6], field1704[var7], field1704[var8], field1730[var6], field1730[var7], field1730[var8], field1731[var6], field1731[var7], field1731[var8], this.field1747[arg0]);
            } else {
                class140.method2853(field1727[var2], field1727[var3], field1727[var4], field1726[var2], field1726[var3], field1726[var4], this.field1697[arg0], this.field1685[arg0], this.field1699[arg0], field1704[var6], field1704[var7], field1704[var8], field1730[var6], field1730[var7], field1730[var8], field1731[var6], field1731[var7], field1731[var8], this.field1747[arg0]);
            }
        } else if (this.field1699[arg0] == -1) {
            class140.method2851(field1727[var2], field1727[var3], field1727[var4], field1726[var2], field1726[var3], field1726[var4], field1751[this.field1697[arg0]]);
        } else {
            class140.method2849(field1727[var2], field1727[var3], field1727[var4], field1726[var2], field1726[var3], field1726[var4], this.field1697[arg0], this.field1685[arg0], this.field1699[arg0]);
        }
    }

    @ObfuscatedName("eh.ax(I)V")
    public final void method2748(int arg0) {
        int var2 = Statics.field1786;
        int var3 = Statics.field1793;
        int var4 = 0;
        int var5 = this.field1741[arg0];
        int var6 = this.field1695[arg0];
        int var7 = this.field1740[arg0];
        int var8 = field1731[var5];
        int var9 = field1731[var6];
        int var10 = field1731[var7];
        if (this.field1694 == null) {
            class140.field1784 = 0;
        } else {
            class140.field1784 = this.field1694[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1690[var4] = field1726[var5];
            field1703[var4] = field1727[var5];
            field1742[var4++] = this.field1697[arg0];
        } else {
            int var11 = field1704[var5];
            int var12 = field1730[var5];
            int var13 = this.field1697[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1752[var10 - var8];
                field1690[var4] = (((field1704[var7] - var11) * var14 >> 16) + var11) * class140.field1797 / 50 + var2;
                field1703[var4] = (((field1730[var7] - var12) * var14 >> 16) + var12) * class140.field1797 / 50 + var3;
                field1742[var4++] = ((this.field1699[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1752[var9 - var8];
                field1690[var4] = (((field1704[var6] - var11) * var15 >> 16) + var11) * class140.field1797 / 50 + var2;
                field1703[var4] = (((field1730[var6] - var12) * var15 >> 16) + var12) * class140.field1797 / 50 + var3;
                field1742[var4++] = ((this.field1685[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1690[var4] = field1726[var6];
            field1703[var4] = field1727[var6];
            field1742[var4++] = this.field1685[arg0];
        } else {
            int var16 = field1704[var6];
            int var17 = field1730[var6];
            int var18 = this.field1685[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1752[var8 - var9];
                field1690[var4] = (((field1704[var5] - var16) * var19 >> 16) + var16) * class140.field1797 / 50 + var2;
                field1703[var4] = (((field1730[var5] - var17) * var19 >> 16) + var17) * class140.field1797 / 50 + var3;
                field1742[var4++] = ((this.field1697[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1752[var10 - var9];
                field1690[var4] = (((field1704[var7] - var16) * var20 >> 16) + var16) * class140.field1797 / 50 + var2;
                field1703[var4] = (((field1730[var7] - var17) * var20 >> 16) + var17) * class140.field1797 / 50 + var3;
                field1742[var4++] = ((this.field1699[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1690[var4] = field1726[var7];
            field1703[var4] = field1727[var7];
            field1742[var4++] = this.field1699[arg0];
        } else {
            int var21 = field1704[var7];
            int var22 = field1730[var7];
            int var23 = this.field1699[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1752[var9 - var10];
                field1690[var4] = (((field1704[var6] - var21) * var24 >> 16) + var21) * class140.field1797 / 50 + var2;
                field1703[var4] = (((field1730[var6] - var22) * var24 >> 16) + var22) * class140.field1797 / 50 + var3;
                field1742[var4++] = ((this.field1685[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1752[var8 - var10];
                field1690[var4] = (((field1704[var5] - var21) * var25 >> 16) + var21) * class140.field1797 / 50 + var2;
                field1703[var4] = (((field1730[var5] - var22) * var25 >> 16) + var22) * class140.field1797 / 50 + var3;
                field1742[var4++] = ((this.field1697[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1690[0];
        int var27 = field1690[1];
        int var28 = field1690[2];
        int var29 = field1703[0];
        int var30 = field1703[1];
        int var31 = field1703[2];
        class140.field1792 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1794 || var27 > Statics.field1794 || var28 > Statics.field1794) {
                class140.field1792 = true;
            }
            if (this.field1747 != null && this.field1747[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1702 == null || this.field1702[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1702[arg0] & 0xFF;
                    var33 = this.field1724[var32];
                    var34 = this.field1746[var32];
                    var35 = this.field1708[var32];
                }
                if (this.field1699[arg0] == -1) {
                    class140.method2853(var29, var30, var31, var26, var27, var28, this.field1697[arg0], this.field1697[arg0], this.field1697[arg0], field1704[var33], field1704[var34], field1704[var35], field1730[var33], field1730[var34], field1730[var35], field1731[var33], field1731[var34], field1731[var35], this.field1747[arg0]);
                } else {
                    class140.method2853(var29, var30, var31, var26, var27, var28, field1742[0], field1742[1], field1742[2], field1704[var33], field1704[var34], field1704[var35], field1730[var33], field1730[var34], field1730[var35], field1731[var33], field1731[var34], field1731[var35], this.field1747[arg0]);
                }
            } else if (this.field1699[arg0] == -1) {
                class140.method2851(var29, var30, var31, var26, var27, var28, field1751[this.field1697[arg0]]);
            } else {
                class140.method2849(var29, var30, var31, var26, var27, var28, field1742[0], field1742[1], field1742[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1794 || var27 > Statics.field1794 || var28 > Statics.field1794 || field1690[3] < 0 || field1690[3] > Statics.field1794) {
            class140.field1792 = true;
        }
        if (this.field1747 != null && this.field1747[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1702 == null || this.field1702[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1702[arg0] & 0xFF;
                var37 = this.field1724[var36];
                var38 = this.field1746[var36];
                var39 = this.field1708[var36];
            }
            short var40 = this.field1747[arg0];
            if (this.field1699[arg0] == -1) {
                class140.method2853(var29, var30, var31, var26, var27, var28, this.field1697[arg0], this.field1697[arg0], this.field1697[arg0], field1704[var37], field1704[var38], field1704[var39], field1730[var37], field1730[var38], field1730[var39], field1731[var37], field1731[var38], field1731[var39], var40);
                class140.method2853(var29, var31, field1703[3], var26, var28, field1690[3], this.field1697[arg0], this.field1697[arg0], this.field1697[arg0], field1704[var37], field1704[var38], field1704[var39], field1730[var37], field1730[var38], field1730[var39], field1731[var37], field1731[var38], field1731[var39], var40);
            } else {
                class140.method2853(var29, var30, var31, var26, var27, var28, field1742[0], field1742[1], field1742[2], field1704[var37], field1704[var38], field1704[var39], field1730[var37], field1730[var38], field1730[var39], field1731[var37], field1731[var38], field1731[var39], var40);
                class140.method2853(var29, var31, field1703[3], var26, var28, field1690[3], field1742[0], field1742[2], field1742[3], field1704[var37], field1704[var38], field1704[var39], field1730[var37], field1730[var38], field1730[var39], field1731[var37], field1731[var38], field1731[var39], var40);
            }
        } else if (this.field1699[arg0] == -1) {
            int var41 = field1751[this.field1697[arg0]];
            class140.method2851(var29, var30, var31, var26, var27, var28, var41);
            class140.method2851(var29, var31, field1703[3], var26, var28, field1690[3], var41);
        } else {
            class140.method2849(var29, var30, var31, var26, var27, var28, field1742[0], field1742[1], field1742[2]);
            class140.method2849(var29, var31, field1703[3], var26, var28, field1690[3], field1742[0], field1742[2], field1742[3]);
        }
    }
}
