package deob;

@ObfuscatedName("el")
public class class137 extends class145 {

    @ObfuscatedName("el.x")
    public static class137 field1714 = new class137();

    @ObfuscatedName("el.m")
    public static byte[] field1684 = new byte[1];

    @ObfuscatedName("el.k")
    public static class137 field1685 = new class137();

    @ObfuscatedName("el.d")
    public static byte[] field1747 = new byte[1];

    @ObfuscatedName("el.w")
    public int field1687 = 0;

    @ObfuscatedName("el.v")
    public int[] field1688;

    @ObfuscatedName("el.q")
    public int[] field1689;

    @ObfuscatedName("el.z")
    public int[] field1733;

    @ObfuscatedName("el.t")
    public int field1691 = 0;

    @ObfuscatedName("el.e")
    public int[] field1692;

    @ObfuscatedName("el.s")
    public int[] field1683;

    @ObfuscatedName("el.p")
    public int[] field1726;

    @ObfuscatedName("el.n")
    public int[] field1695;

    @ObfuscatedName("el.u")
    public int[] field1696;

    @ObfuscatedName("el.h")
    public int[] field1748;

    @ObfuscatedName("el.g")
    public byte[] field1698;

    @ObfuscatedName("el.i")
    public byte[] field1709;

    @ObfuscatedName("el.a")
    public byte[] field1700;

    @ObfuscatedName("el.b")
    public short[] field1701;

    @ObfuscatedName("el.l")
    public byte field1702 = 0;

    @ObfuscatedName("el.r")
    public int field1699 = 0;

    @ObfuscatedName("el.o")
    public int[] field1686;

    @ObfuscatedName("el.c")
    public int[] field1705;

    @ObfuscatedName("el.j")
    public int[] field1706;

    @ObfuscatedName("el.y")
    public int[][] field1719;

    @ObfuscatedName("el.f")
    public int[][] field1731;

    @ObfuscatedName("el.ae")
    public boolean field1717 = false;

    @ObfuscatedName("el.an")
    public int field1745;

    @ObfuscatedName("el.ai")
    public int field1711;

    @ObfuscatedName("el.ap")
    public int field1712;

    @ObfuscatedName("el.ab")
    public int field1713;

    @ObfuscatedName("el.ar")
    public int field1742;

    @ObfuscatedName("el.af")
    public int field1690;

    @ObfuscatedName("el.at")
    public int field1716;

    @ObfuscatedName("el.al")
    public int field1710;

    @ObfuscatedName("el.as")
    public int field1730 = -1;

    @ObfuscatedName("el.am")
    public int field1718 = -1;

    @ObfuscatedName("el.au")
    public int field1720 = -1;

    @ObfuscatedName("el.aq")
    public static boolean[] field1722 = new boolean[4700];

    @ObfuscatedName("el.av")
    public static boolean[] field1723 = new boolean[4700];

    @ObfuscatedName("el.ak")
    public static int[] field1724 = new int[4700];

    @ObfuscatedName("el.aa")
    public static int[] field1725 = new int[4700];

    @ObfuscatedName("el.ax")
    public static int[] field1704 = new int[4700];

    @ObfuscatedName("el.az")
    public static int[] field1727 = new int[4700];

    @ObfuscatedName("el.aj")
    public static int[] field1708 = new int[4700];

    @ObfuscatedName("el.ay")
    public static int[] field1729 = new int[4700];

    @ObfuscatedName("el.ac")
    public static int[] field1738 = new int[1600];

    @ObfuscatedName("el.ah")
    public static int[][] field1732 = new int[1600][512];

    @ObfuscatedName("el.ag")
    public static int[] field1737 = new int[12];

    @ObfuscatedName("el.aw")
    public static int[][] field1728 = new int[12][2000];

    @ObfuscatedName("el.bf")
    public static int[] field1735 = new int[2000];

    @ObfuscatedName("el.bc")
    public static int[] field1736 = new int[2000];

    @ObfuscatedName("el.bo")
    public static int[] field1734 = new int[12];

    @ObfuscatedName("el.bd")
    public static int[] field1697 = new int[10];

    @ObfuscatedName("el.bk")
    public static int[] field1693 = new int[10];

    @ObfuscatedName("el.bu")
    public static int[] field1740 = new int[10];

    @ObfuscatedName("el.bh")
    public static boolean field1744 = true;

    @ObfuscatedName("el.ba")
    public static int[] field1703 = class140.field1795;

    @ObfuscatedName("el.bv")
    public static int[] field1694 = class140.field1796;

    @ObfuscatedName("el.bx")
    public static int[] field1749 = class140.field1791;

    @ObfuscatedName("el.bz")
    public static int[] field1750 = class140.field1794;

    public class137() {
    }

    public class137(class137[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1687 = 0;
        this.field1691 = 0;
        this.field1699 = 0;
        this.field1702 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class137 var8 = arg0[var7];
            if (var8 != null) {
                this.field1687 += var8.field1687;
                this.field1691 += var8.field1691;
                this.field1699 += var8.field1699;
                if (var8.field1698 == null) {
                    if (this.field1702 == -1) {
                        this.field1702 = var8.field1702;
                    }
                    if (this.field1702 != var8.field1702) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1709 != null;
                var5 |= var8.field1701 != null;
                var6 |= var8.field1700 != null;
            }
        }
        this.field1688 = new int[this.field1687];
        this.field1689 = new int[this.field1687];
        this.field1733 = new int[this.field1687];
        this.field1692 = new int[this.field1691];
        this.field1683 = new int[this.field1691];
        this.field1726 = new int[this.field1691];
        this.field1695 = new int[this.field1691];
        this.field1696 = new int[this.field1691];
        this.field1748 = new int[this.field1691];
        if (var3) {
            this.field1698 = new byte[this.field1691];
        }
        if (var4) {
            this.field1709 = new byte[this.field1691];
        }
        if (var5) {
            this.field1701 = new short[this.field1691];
        }
        if (var6) {
            this.field1700 = new byte[this.field1691];
        }
        if (this.field1699 > 0) {
            this.field1686 = new int[this.field1699];
            this.field1705 = new int[this.field1699];
            this.field1706 = new int[this.field1699];
        }
        this.field1687 = 0;
        this.field1691 = 0;
        this.field1699 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class137 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1691; var11++) {
                    this.field1692[this.field1691] = var10.field1692[var11] + this.field1687;
                    this.field1683[this.field1691] = var10.field1683[var11] + this.field1687;
                    this.field1726[this.field1691] = var10.field1726[var11] + this.field1687;
                    this.field1695[this.field1691] = var10.field1695[var11];
                    this.field1696[this.field1691] = var10.field1696[var11];
                    this.field1748[this.field1691] = var10.field1748[var11];
                    if (var3) {
                        if (var10.field1698 == null) {
                            this.field1698[this.field1691] = var10.field1702;
                        } else {
                            this.field1698[this.field1691] = var10.field1698[var11];
                        }
                    }
                    if (var4 && var10.field1709 != null) {
                        this.field1709[this.field1691] = var10.field1709[var11];
                    }
                    if (var5) {
                        if (var10.field1701 == null) {
                            this.field1701[this.field1691] = -1;
                        } else {
                            this.field1701[this.field1691] = var10.field1701[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1700 == null || var10.field1700[var11] == -1) {
                            this.field1700[this.field1691] = -1;
                        } else {
                            this.field1700[this.field1691] = (byte) (var10.field1700[var11] + this.field1699);
                        }
                    }
                    this.field1691++;
                }
                for (int var12 = 0; var12 < var10.field1699; var12++) {
                    this.field1686[this.field1699] = var10.field1686[var12] + this.field1687;
                    this.field1705[this.field1699] = var10.field1705[var12] + this.field1687;
                    this.field1706[this.field1699] = var10.field1706[var12] + this.field1687;
                    this.field1699++;
                }
                for (int var13 = 0; var13 < var10.field1687; var13++) {
                    this.field1688[this.field1687] = var10.field1688[var13];
                    this.field1689[this.field1687] = var10.field1689[var13];
                    this.field1733[this.field1687] = var10.field1733[var13];
                    this.field1687++;
                }
            }
        }
    }

    @ObfuscatedName("el.x([[IIIIZI)Lel;")
    public class137 method2735(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2705();
        int var7 = arg1 - this.field1712;
        int var8 = this.field1712 + arg1;
        int var9 = arg3 - this.field1712;
        int var10 = this.field1712 + arg3;
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
            var15.field1687 = this.field1687;
            var15.field1691 = this.field1691;
            var15.field1699 = this.field1699;
            var15.field1688 = this.field1688;
            var15.field1733 = this.field1733;
            var15.field1692 = this.field1692;
            var15.field1683 = this.field1683;
            var15.field1726 = this.field1726;
            var15.field1695 = this.field1695;
            var15.field1696 = this.field1696;
            var15.field1748 = this.field1748;
            var15.field1698 = this.field1698;
            var15.field1709 = this.field1709;
            var15.field1700 = this.field1700;
            var15.field1701 = this.field1701;
            var15.field1702 = this.field1702;
            var15.field1686 = this.field1686;
            var15.field1705 = this.field1705;
            var15.field1706 = this.field1706;
            var15.field1719 = this.field1719;
            var15.field1731 = this.field1731;
            var15.field1717 = this.field1717;
            var15.field1689 = new int[var15.field1687];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1687; var16++) {
                int var17 = this.field1688[var16] + arg1;
                int var18 = this.field1733[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1689[var16] = this.field1689[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1687; var26++) {
                int var27 = (-this.field1689[var26] << 16) / this.field1884;
                if (var27 < arg5) {
                    int var28 = this.field1688[var26] + arg1;
                    int var29 = this.field1733[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1689[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1689[var26];
                }
            }
        }
        var15.method2707();
        return var15;
    }

    @ObfuscatedName("el.m(Z)Lel;")
    public class137 method2721(boolean arg0) {
        if (!arg0 && field1684.length < this.field1691) {
            field1684 = new byte[this.field1691 + 100];
        }
        return this.method2703(arg0, field1714, field1684);
    }

    @ObfuscatedName("el.k(Z)Lel;")
    public class137 method2763(boolean arg0) {
        if (!arg0 && field1747.length < this.field1691) {
            field1747 = new byte[this.field1691 + 100];
        }
        return this.method2703(arg0, field1685, field1747);
    }

    @ObfuscatedName("el.d(ZLel;[B)Lel;")
    public class137 method2703(boolean arg0, class137 arg1, byte[] arg2) {
        arg1.field1687 = this.field1687;
        arg1.field1691 = this.field1691;
        arg1.field1699 = this.field1699;
        if (arg1.field1688 == null || arg1.field1688.length < this.field1687) {
            arg1.field1688 = new int[this.field1687 + 100];
            arg1.field1689 = new int[this.field1687 + 100];
            arg1.field1733 = new int[this.field1687 + 100];
        }
        for (int var4 = 0; var4 < this.field1687; var4++) {
            arg1.field1688[var4] = this.field1688[var4];
            arg1.field1689[var4] = this.field1689[var4];
            arg1.field1733[var4] = this.field1733[var4];
        }
        if (arg0) {
            arg1.field1709 = this.field1709;
        } else {
            arg1.field1709 = arg2;
            if (this.field1709 == null) {
                for (int var5 = 0; var5 < this.field1691; var5++) {
                    arg1.field1709[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1691; var6++) {
                    arg1.field1709[var6] = this.field1709[var6];
                }
            }
        }
        arg1.field1692 = this.field1692;
        arg1.field1683 = this.field1683;
        arg1.field1726 = this.field1726;
        arg1.field1695 = this.field1695;
        arg1.field1696 = this.field1696;
        arg1.field1748 = this.field1748;
        arg1.field1698 = this.field1698;
        arg1.field1700 = this.field1700;
        arg1.field1701 = this.field1701;
        arg1.field1702 = this.field1702;
        arg1.field1686 = this.field1686;
        arg1.field1705 = this.field1705;
        arg1.field1706 = this.field1706;
        arg1.field1719 = this.field1719;
        arg1.field1731 = this.field1731;
        arg1.field1717 = this.field1717;
        arg1.method2707();
        return arg1;
    }

    @ObfuscatedName("el.w(I)V")
    public void method2704(int arg0) {
        if (this.field1730 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1694[arg0];
        int var9 = field1703[arg0];
        for (int var10 = 0; var10 < this.field1687; var10++) {
            int var11 = class140.method2849(this.field1688[var10], this.field1733[var10], var8, var9);
            int var12 = this.field1689[var10];
            int var13 = class140.method2886(this.field1688[var10], this.field1733[var10], var8, var9);
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
        this.field1690 = (var2 + var5) / 2;
        this.field1716 = (var3 + var6) / 2;
        this.field1710 = (var4 + var7) / 2;
        this.field1730 = (var5 - var2 + 1) / 2;
        this.field1718 = (var6 - var3 + 1) / 2;
        this.field1720 = (var7 - var4 + 1) / 2;
        if (this.field1730 < 32) {
            this.field1730 = 32;
        }
        if (this.field1720 < 32) {
            this.field1720 = 32;
        }
        if (this.field1717) {
            this.field1730 += 8;
            this.field1720 += 8;
        }
    }

    @ObfuscatedName("el.v()V")
    public void method2705() {
        if (this.field1745 == 1) {
            return;
        }
        this.field1745 = 1;
        this.field1884 = 0;
        this.field1711 = 0;
        this.field1712 = 0;
        for (int var1 = 0; var1 < this.field1687; var1++) {
            int var2 = this.field1688[var1];
            int var3 = this.field1689[var1];
            int var4 = this.field1733[var1];
            if (-var3 > this.field1884) {
                this.field1884 = -var3;
            }
            if (var3 > this.field1711) {
                this.field1711 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1712) {
                this.field1712 = var5;
            }
        }
        this.field1712 = (int) (Math.sqrt((double) this.field1712) + 0.99D);
        this.field1742 = (int) (Math.sqrt((double) (this.field1884 * this.field1884 + this.field1712 * this.field1712)) + 0.99D);
        this.field1713 = this.field1742 + (int) (Math.sqrt((double) (this.field1712 * this.field1712 + this.field1711 * this.field1711)) + 0.99D);
    }

    @ObfuscatedName("el.q()V")
    public void method2734() {
        if (this.field1745 == 2) {
            return;
        }
        this.field1745 = 2;
        this.field1712 = 0;
        for (int var1 = 0; var1 < this.field1687; var1++) {
            int var2 = this.field1688[var1];
            int var3 = this.field1689[var1];
            int var4 = this.field1733[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1712) {
                this.field1712 = var5;
            }
        }
        this.field1712 = (int) (Math.sqrt((double) this.field1712) + 0.99D);
        this.field1742 = this.field1712;
        this.field1713 = this.field1712 + this.field1712;
    }

    @ObfuscatedName("el.z()I")
    public int method2729() {
        this.method2705();
        return this.field1712;
    }

    @ObfuscatedName("el.e()V")
    public void method2707() {
        this.field1745 = 0;
        this.field1730 = -1;
    }

    @ObfuscatedName("el.s(Lef;I)V")
    public void method2709(class148 arg0, int arg1) {
        if (this.field1719 == null || arg1 == -1) {
            return;
        }
        class135 var3 = arg0.field1901[arg1];
        class142 var4 = var3.field1653;
        Statics.field1741 = 0;
        Statics.field1707 = 0;
        Statics.field1743 = 0;
        for (int var5 = 0; var5 < var3.field1654; var5++) {
            int var6 = var3.field1650[var5];
            this.method2764(var4.field1810[var6], var4.field1809[var6], var3.field1649[var5], var3.field1657[var5], var3.field1658[var5]);
        }
        this.method2707();
    }

    @ObfuscatedName("el.p(Lef;ILef;I[I)V")
    public void method2710(class148 arg0, int arg1, class148 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2709(arg0, arg1);
            return;
        }
        class135 var6 = arg0.field1901[arg1];
        class135 var7 = arg2.field1901[arg3];
        class142 var8 = var6.field1653;
        Statics.field1741 = 0;
        Statics.field1707 = 0;
        Statics.field1743 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1654; var11++) {
            int var12 = var6.field1650[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1810[var12] == 0) {
                this.method2764(var8.field1810[var12], var8.field1809[var12], var6.field1649[var11], var6.field1657[var11], var6.field1658[var11]);
            }
        }
        Statics.field1741 = 0;
        Statics.field1707 = 0;
        Statics.field1743 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1654; var15++) {
            int var16 = var7.field1650[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1810[var16] == 0) {
                this.method2764(var8.field1810[var16], var8.field1809[var16], var7.field1649[var15], var7.field1657[var15], var7.field1658[var15]);
            }
        }
        this.method2707();
    }

    @ObfuscatedName("el.n(I[IIII)V")
    public void method2764(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1741 = 0;
            Statics.field1707 = 0;
            Statics.field1743 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1719.length) {
                    int[] var10 = this.field1719[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1741 += this.field1688[var12];
                        Statics.field1707 += this.field1689[var12];
                        Statics.field1743 += this.field1733[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1741 = Statics.field1741 / var7 + arg2;
                Statics.field1707 = Statics.field1707 / var7 + arg3;
                Statics.field1743 = Statics.field1743 / var7 + arg4;
            } else {
                Statics.field1741 = arg2;
                Statics.field1707 = arg3;
                Statics.field1743 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1719.length) {
                    int[] var15 = this.field1719[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1688[var17] += arg2;
                        this.field1689[var17] += arg3;
                        this.field1733[var17] += arg4;
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
                        this.field1688[var22] -= Statics.field1741;
                        this.field1689[var22] -= Statics.field1707;
                        this.field1733[var22] -= Statics.field1743;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1703[var25];
                            int var27 = field1694[var25];
                            int var28 = this.field1689[var22] * var26 + this.field1688[var22] * var27 >> 16;
                            this.field1689[var22] = this.field1689[var22] * var27 - this.field1688[var22] * var26 >> 16;
                            this.field1688[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1703[var23];
                            int var30 = field1694[var23];
                            int var31 = this.field1689[var22] * var30 - this.field1733[var22] * var29 >> 16;
                            this.field1733[var22] = this.field1733[var22] * var30 + this.field1689[var22] * var29 >> 16;
                            this.field1689[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1703[var24];
                            int var33 = field1694[var24];
                            int var34 = this.field1733[var22] * var32 + this.field1688[var22] * var33 >> 16;
                            this.field1733[var22] = this.field1733[var22] * var33 - this.field1688[var22] * var32 >> 16;
                            this.field1688[var22] = var34;
                        }
                        this.field1688[var22] += Statics.field1741;
                        this.field1689[var22] += Statics.field1707;
                        this.field1733[var22] += Statics.field1743;
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
                        this.field1688[var39] -= Statics.field1741;
                        this.field1689[var39] -= Statics.field1707;
                        this.field1733[var39] -= Statics.field1743;
                        this.field1688[var39] = this.field1688[var39] * arg2 / 128;
                        this.field1689[var39] = this.field1689[var39] * arg3 / 128;
                        this.field1733[var39] = this.field1733[var39] * arg4 / 128;
                        this.field1688[var39] += Statics.field1741;
                        this.field1689[var39] += Statics.field1707;
                        this.field1733[var39] += Statics.field1743;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1731 != null && this.field1709 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1731.length) {
                    int[] var42 = this.field1731[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1709[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1709[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("el.u()V")
    public void method2719() {
        for (int var1 = 0; var1 < this.field1687; var1++) {
            int var2 = this.field1688[var1];
            this.field1688[var1] = this.field1733[var1];
            this.field1733[var1] = -var2;
        }
        this.method2707();
    }

    @ObfuscatedName("el.h()V")
    public void method2706() {
        for (int var1 = 0; var1 < this.field1687; var1++) {
            this.field1688[var1] = -this.field1688[var1];
            this.field1733[var1] = -this.field1733[var1];
        }
        this.method2707();
    }

    @ObfuscatedName("el.g()V")
    public void method2714() {
        for (int var1 = 0; var1 < this.field1687; var1++) {
            int var2 = this.field1733[var1];
            this.field1733[var1] = this.field1688[var1];
            this.field1688[var1] = -var2;
        }
        this.method2707();
    }

    @ObfuscatedName("el.i(I)V")
    public void method2715(int arg0) {
        int var2 = field1703[arg0];
        int var3 = field1694[arg0];
        for (int var4 = 0; var4 < this.field1687; var4++) {
            int var5 = this.field1689[var4] * var3 - this.field1733[var4] * var2 >> 16;
            this.field1733[var4] = this.field1733[var4] * var3 + this.field1689[var4] * var2 >> 16;
            this.field1689[var4] = var5;
        }
        this.method2707();
    }

    @ObfuscatedName("el.a(III)V")
    public void method2716(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1687; var4++) {
            this.field1688[var4] += arg0;
            this.field1689[var4] += arg1;
            this.field1733[var4] += arg2;
        }
        this.method2707();
    }

    @ObfuscatedName("el.o(III)V")
    public void method2717(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1687; var4++) {
            this.field1688[var4] = this.field1688[var4] * arg0 / 128;
            this.field1689[var4] = this.field1689[var4] * arg1 / 128;
            this.field1733[var4] = this.field1733[var4] * arg2 / 128;
        }
        this.method2707();
    }

    @ObfuscatedName("el.c(IIIIIII)V")
    public final void method2718(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1738[0] = -1;
        if (this.field1745 != 2 && this.field1745 != 1) {
            this.method2734();
        }
        int var8 = Statics.field1776;
        int var9 = Statics.field1789;
        int var10 = field1703[arg0];
        int var11 = field1694[arg0];
        int var12 = field1703[arg1];
        int var13 = field1694[arg1];
        int var14 = field1703[arg2];
        int var15 = field1694[arg2];
        int var16 = field1703[arg3];
        int var17 = field1694[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1687; var19++) {
            int var20 = this.field1688[var19];
            int var21 = this.field1689[var19];
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
            field1704[var19] = var30 - var18;
            field1724[var19] = class140.field1781 * var26 / var30 + var8;
            field1725[var19] = class140.field1781 * var29 / var30 + var9;
            if (this.field1699 > 0) {
                field1727[var19] = var26;
                field1708[var19] = var29;
                field1729[var19] = var30;
            }
        }
        try {
            this.method2743(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("el.f(IIIIIIII)V")
    public final void method2749(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1738[0] = -1;
        if (this.field1745 != 2 && this.field1745 != 1) {
            this.method2734();
        }
        int var9 = Statics.field1776;
        int var10 = Statics.field1789;
        int var11 = field1703[arg0];
        int var12 = field1694[arg0];
        int var13 = field1703[arg1];
        int var14 = field1694[arg1];
        int var15 = field1703[arg2];
        int var16 = field1694[arg2];
        int var17 = field1703[arg3];
        int var18 = field1694[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1687; var20++) {
            int var21 = this.field1688[var20];
            int var22 = this.field1689[var20];
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
            field1704[var20] = var31 - var19;
            field1724[var20] = class140.field1781 * var27 / arg7 + var9;
            field1725[var20] = class140.field1781 * var30 / arg7 + var10;
            if (this.field1699 > 0) {
                field1727[var20] = var27;
                field1708[var20] = var30;
                field1729[var20] = var31;
            }
        }
        try {
            this.method2743(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("el.cq(IIIIIIIIJ)V")
    public void method2700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1738[0] = -1;
        if (this.field1745 != 1) {
            this.method2705();
        }
        this.method2704(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1712 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1712) * class140.field1781;
        if (var16 / var14 >= Statics.field1785) {
            return;
        }
        int var17 = (this.field1712 + var15) * class140.field1781;
        if (var17 / var14 <= Statics.field1786) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1712 * arg1 >> 16;
        int var20 = (var18 + var19) * class140.field1781;
        if (var20 / var14 <= Statics.field1788) {
            return;
        }
        int var21 = (this.field1884 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class140.field1781;
        if (var22 / var14 >= Statics.field1778) {
            return;
        }
        int var23 = (this.field1884 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1699 > 0;
        int var27 = class138.method749();
        int var28 = class138.field1753;
        boolean var30 = class138.field1762;
        boolean var32 = class138.method2405(arg8);
        boolean var33 = false;
        if (var32 && var30) {
            boolean var34 = false;
            if (field1744) {
                var34 = class138.method1096(this, arg5, arg6, arg7);
            } else {
                int var35 = var12 - var13;
                if (var35 <= 50) {
                    var35 = 50;
                }
                int var36;
                int var37;
                if (var15 > 0) {
                    var36 = var16 / var14;
                    var37 = var17 / var35;
                } else {
                    var37 = var17 / var14;
                    var36 = var16 / var35;
                }
                int var38;
                int var39;
                if (var18 > 0) {
                    var38 = var22 / var14;
                    var39 = var20 / var35;
                } else {
                    var39 = var20 / var14;
                    var38 = var22 / var35;
                }
                int var40 = var27 - Statics.field1776;
                int var41 = var28 - Statics.field1789;
                if (var40 > var36 && var40 < var37 && var41 > var38 && var41 < var39) {
                    var34 = true;
                }
            }
            if (var34) {
                if (this.field1717) {
                    class138.field1758[++class138.field1760 - 1] = arg8;
                } else {
                    var33 = true;
                }
            }
        }
        int var44 = Statics.field1776;
        int var45 = Statics.field1789;
        int var46 = 0;
        int var47 = 0;
        if (arg0 != 0) {
            var46 = field1703[arg0];
            var47 = field1694[arg0];
        }
        for (int var48 = 0; var48 < this.field1687; var48++) {
            int var49 = this.field1688[var48];
            int var50 = this.field1689[var48];
            int var51 = this.field1733[var48];
            if (arg0 != 0) {
                int var52 = var46 * var51 + var47 * var49 >> 16;
                var51 = var47 * var51 - var46 * var49 >> 16;
                var49 = var52;
            }
            int var53 = arg5 + var49;
            int var54 = arg6 + var50;
            int var55 = arg7 + var51;
            int var56 = arg3 * var55 + arg4 * var53 >> 16;
            int var57 = arg4 * var55 - arg3 * var53 >> 16;
            int var59 = arg2 * var54 - arg1 * var57 >> 16;
            int var60 = arg1 * var54 + arg2 * var57 >> 16;
            field1704[var48] = var60 - var12;
            if (var60 >= 50) {
                field1724[var48] = class140.field1781 * var56 / var60 + var44;
                field1725[var48] = class140.field1781 * var59 / var60 + var45;
            } else {
                field1724[var48] = -5000;
                var24 = true;
            }
            if (var26) {
                field1727[var48] = var56;
                field1708[var48] = var59;
                field1729[var48] = var60;
            }
        }
        try {
            this.method2743(var24, var33, this.field1717, arg8);
        } catch (Exception var63) {
        }
    }

    @ObfuscatedName("el.ae(ZZZJ)V")
    public final void method2743(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1713 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1713; var6++) {
            field1738[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1691; var8++) {
            if (this.field1748[var8] != -2) {
                int var9 = this.field1692[var8];
                int var10 = this.field1683[var8];
                int var11 = this.field1726[var8];
                int var12 = field1724[var9];
                int var13 = field1724[var10];
                int var14 = field1724[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field1727[var9];
                    int var16 = field1727[var10];
                    int var17 = field1727[var11];
                    int var18 = field1708[var9];
                    int var19 = field1708[var10];
                    int var20 = field1708[var11];
                    int var21 = field1729[var9];
                    int var22 = field1729[var10];
                    int var23 = field1729[var11];
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
                        field1723[var8] = true;
                        int var33 = (field1704[var9] + field1704[var10] + field1704[var11]) / 3 + this.field1742;
                        field1732[var33][field1738[var33]++] = var8;
                    }
                } else {
                    if (arg1) {
                        int var34 = field1725[var9];
                        int var35 = field1725[var10];
                        int var36 = field1725[var11];
                        int var37 = class138.field1753 + var7;
                        boolean var38;
                        if (var37 < var34 && var37 < var35 && var37 < var36) {
                            var38 = false;
                        } else {
                            int var39 = class138.field1753 - var7;
                            if (var39 > var34 && var39 > var35 && var39 > var36) {
                                var38 = false;
                            } else {
                                int var40 = class138.field1755 + var7;
                                if (var40 < var12 && var40 < var13 && var40 < var14) {
                                    var38 = false;
                                } else {
                                    int var41 = class138.field1755 - var7;
                                    if (var41 > var12 && var41 > var13 && var41 > var14) {
                                        var38 = false;
                                    } else {
                                        var38 = true;
                                    }
                                }
                            }
                        }
                        if (var38) {
                            class138.field1758[++class138.field1760 - 1] = arg3;
                            arg1 = false;
                        }
                    }
                    if ((field1725[var11] - field1725[var10]) * (var12 - var13) - (field1725[var9] - field1725[var10]) * (var14 - var13) > 0) {
                        field1723[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1784 && var13 <= Statics.field1784 && var14 <= Statics.field1784) {
                            field1722[var8] = false;
                        } else {
                            field1722[var8] = true;
                        }
                        int var44 = (field1704[var9] + field1704[var10] + field1704[var11]) / 3 + this.field1742;
                        field1732[var44][field1738[var44]++] = var8;
                    }
                }
            }
        }
        if (this.field1698 == null) {
            for (int var45 = this.field1713 - 1; var45 >= 0; var45--) {
                int var46 = field1738[var45];
                if (var46 > 0) {
                    int[] var47 = field1732[var45];
                    for (int var48 = 0; var48 < var46; var48++) {
                        this.method2722(var47[var48]);
                    }
                }
            }
            return;
        }
        for (int var49 = 0; var49 < 12; var49++) {
            field1737[var49] = 0;
            field1734[var49] = 0;
        }
        for (int var50 = this.field1713 - 1; var50 >= 0; var50--) {
            int var51 = field1738[var50];
            if (var51 > 0) {
                int[] var52 = field1732[var50];
                for (int var53 = 0; var53 < var51; var53++) {
                    int var54 = var52[var53];
                    byte var55 = this.field1698[var54];
                    int var56 = field1737[var55]++;
                    field1728[var55][var56] = var54;
                    if (var55 < 10) {
                        field1734[var55] += var50;
                    } else if (var55 == 10) {
                        field1735[var56] = var50;
                    } else {
                        field1736[var56] = var50;
                    }
                }
            }
        }
        int var57 = 0;
        if (field1737[1] > 0 || field1737[2] > 0) {
            var57 = (field1734[1] + field1734[2]) / (field1737[1] + field1737[2]);
        }
        int var58 = 0;
        if (field1737[3] > 0 || field1737[4] > 0) {
            var58 = (field1734[3] + field1734[4]) / (field1737[3] + field1737[4]);
        }
        int var59 = 0;
        if (field1737[6] > 0 || field1737[8] > 0) {
            var59 = (field1734[6] + field1734[8]) / (field1737[6] + field1737[8]);
        }
        int var60 = 0;
        int var61 = field1737[10];
        int[] var62 = field1728[10];
        int[] var63 = field1735;
        if (var60 == var61) {
            var60 = 0;
            var61 = field1737[11];
            var62 = field1728[11];
            var63 = field1736;
        }
        int var64;
        if (var60 < var61) {
            var64 = var63[var60];
        } else {
            var64 = -1000;
        }
        for (int var65 = 0; var65 < 10; var65++) {
            while (var65 == 0 && var64 > var57) {
                this.method2722(var62[var60++]);
                if (var60 == var61 && field1728[11] != var62) {
                    var60 = 0;
                    var61 = field1737[11];
                    var62 = field1728[11];
                    var63 = field1736;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            while (var65 == 3 && var64 > var58) {
                this.method2722(var62[var60++]);
                if (var60 == var61 && field1728[11] != var62) {
                    var60 = 0;
                    var61 = field1737[11];
                    var62 = field1728[11];
                    var63 = field1736;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            while (var65 == 5 && var64 > var59) {
                this.method2722(var62[var60++]);
                if (var60 == var61 && field1728[11] != var62) {
                    var60 = 0;
                    var61 = field1737[11];
                    var62 = field1728[11];
                    var63 = field1736;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            int var66 = field1737[var65];
            int[] var67 = field1728[var65];
            for (int var68 = 0; var68 < var66; var68++) {
                this.method2722(var67[var68]);
            }
        }
        while (var64 != -1000) {
            this.method2722(var62[var60++]);
            if (var60 == var61 && field1728[11] != var62) {
                var60 = 0;
                var62 = field1728[11];
                var61 = field1737[11];
                var63 = field1736;
            }
            if (var60 < var61) {
                var64 = var63[var60];
            } else {
                var64 = -1000;
            }
        }
    }

    @ObfuscatedName("el.an(I)V")
    public final void method2722(int arg0) {
        if (field1723[arg0]) {
            this.method2765(arg0);
            return;
        }
        int var2 = this.field1692[arg0];
        int var3 = this.field1683[arg0];
        int var4 = this.field1726[arg0];
        class140.field1779 = field1722[arg0];
        if (this.field1709 == null) {
            class140.field1790 = 0;
        } else {
            class140.field1790 = this.field1709[arg0] & 0xFF;
        }
        if (this.field1701 != null && this.field1701[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1700 == null || this.field1700[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1700[arg0] & 0xFF;
                var6 = this.field1686[var5];
                var7 = this.field1705[var5];
                var8 = this.field1706[var5];
            }
            if (this.field1748[arg0] == -1) {
                class140.method2845(field1725[var2], field1725[var3], field1725[var4], field1724[var2], field1724[var3], field1724[var4], this.field1695[arg0], this.field1695[arg0], this.field1695[arg0], field1727[var6], field1727[var7], field1727[var8], field1708[var6], field1708[var7], field1708[var8], field1729[var6], field1729[var7], field1729[var8], this.field1701[arg0]);
            } else {
                class140.method2845(field1725[var2], field1725[var3], field1725[var4], field1724[var2], field1724[var3], field1724[var4], this.field1695[arg0], this.field1696[arg0], this.field1748[arg0], field1727[var6], field1727[var7], field1727[var8], field1708[var6], field1708[var7], field1708[var8], field1729[var6], field1729[var7], field1729[var8], this.field1701[arg0]);
            }
        } else if (this.field1748[arg0] == -1) {
            class140.method2843(field1725[var2], field1725[var3], field1725[var4], field1724[var2], field1724[var3], field1724[var4], field1749[this.field1695[arg0]]);
        } else {
            class140.method2841(field1725[var2], field1725[var3], field1725[var4], field1724[var2], field1724[var3], field1724[var4], this.field1695[arg0], this.field1696[arg0], this.field1748[arg0]);
        }
    }

    @ObfuscatedName("el.ai(I)V")
    public final void method2765(int arg0) {
        int var2 = Statics.field1776;
        int var3 = Statics.field1789;
        int var4 = 0;
        int var5 = this.field1692[arg0];
        int var6 = this.field1683[arg0];
        int var7 = this.field1726[arg0];
        int var8 = field1729[var5];
        int var9 = field1729[var6];
        int var10 = field1729[var7];
        if (this.field1709 == null) {
            class140.field1790 = 0;
        } else {
            class140.field1790 = this.field1709[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1697[var4] = field1724[var5];
            field1693[var4] = field1725[var5];
            field1740[var4++] = this.field1695[arg0];
        } else {
            int var11 = field1727[var5];
            int var12 = field1708[var5];
            int var13 = this.field1695[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1750[var10 - var8];
                field1697[var4] = (((field1727[var7] - var11) * var14 >> 16) + var11) * class140.field1781 / 50 + var2;
                field1693[var4] = (((field1708[var7] - var12) * var14 >> 16) + var12) * class140.field1781 / 50 + var3;
                field1740[var4++] = ((this.field1748[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1750[var9 - var8];
                field1697[var4] = (((field1727[var6] - var11) * var15 >> 16) + var11) * class140.field1781 / 50 + var2;
                field1693[var4] = (((field1708[var6] - var12) * var15 >> 16) + var12) * class140.field1781 / 50 + var3;
                field1740[var4++] = ((this.field1696[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1697[var4] = field1724[var6];
            field1693[var4] = field1725[var6];
            field1740[var4++] = this.field1696[arg0];
        } else {
            int var16 = field1727[var6];
            int var17 = field1708[var6];
            int var18 = this.field1696[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1750[var8 - var9];
                field1697[var4] = (((field1727[var5] - var16) * var19 >> 16) + var16) * class140.field1781 / 50 + var2;
                field1693[var4] = (((field1708[var5] - var17) * var19 >> 16) + var17) * class140.field1781 / 50 + var3;
                field1740[var4++] = ((this.field1695[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1750[var10 - var9];
                field1697[var4] = (((field1727[var7] - var16) * var20 >> 16) + var16) * class140.field1781 / 50 + var2;
                field1693[var4] = (((field1708[var7] - var17) * var20 >> 16) + var17) * class140.field1781 / 50 + var3;
                field1740[var4++] = ((this.field1748[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1697[var4] = field1724[var7];
            field1693[var4] = field1725[var7];
            field1740[var4++] = this.field1748[arg0];
        } else {
            int var21 = field1727[var7];
            int var22 = field1708[var7];
            int var23 = this.field1748[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1750[var9 - var10];
                field1697[var4] = (((field1727[var6] - var21) * var24 >> 16) + var21) * class140.field1781 / 50 + var2;
                field1693[var4] = (((field1708[var6] - var22) * var24 >> 16) + var22) * class140.field1781 / 50 + var3;
                field1740[var4++] = ((this.field1696[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1750[var8 - var10];
                field1697[var4] = (((field1727[var5] - var21) * var25 >> 16) + var21) * class140.field1781 / 50 + var2;
                field1693[var4] = (((field1708[var5] - var22) * var25 >> 16) + var22) * class140.field1781 / 50 + var3;
                field1740[var4++] = ((this.field1695[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1697[0];
        int var27 = field1697[1];
        int var28 = field1697[2];
        int var29 = field1693[0];
        int var30 = field1693[1];
        int var31 = field1693[2];
        class140.field1779 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1784 || var27 > Statics.field1784 || var28 > Statics.field1784) {
                class140.field1779 = true;
            }
            if (this.field1701 != null && this.field1701[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1700 == null || this.field1700[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1700[arg0] & 0xFF;
                    var33 = this.field1686[var32];
                    var34 = this.field1705[var32];
                    var35 = this.field1706[var32];
                }
                if (this.field1748[arg0] == -1) {
                    class140.method2845(var29, var30, var31, var26, var27, var28, this.field1695[arg0], this.field1695[arg0], this.field1695[arg0], field1727[var33], field1727[var34], field1727[var35], field1708[var33], field1708[var34], field1708[var35], field1729[var33], field1729[var34], field1729[var35], this.field1701[arg0]);
                } else {
                    class140.method2845(var29, var30, var31, var26, var27, var28, field1740[0], field1740[1], field1740[2], field1727[var33], field1727[var34], field1727[var35], field1708[var33], field1708[var34], field1708[var35], field1729[var33], field1729[var34], field1729[var35], this.field1701[arg0]);
                }
            } else if (this.field1748[arg0] == -1) {
                class140.method2843(var29, var30, var31, var26, var27, var28, field1749[this.field1695[arg0]]);
            } else {
                class140.method2841(var29, var30, var31, var26, var27, var28, field1740[0], field1740[1], field1740[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1784 || var27 > Statics.field1784 || var28 > Statics.field1784 || field1697[3] < 0 || field1697[3] > Statics.field1784) {
            class140.field1779 = true;
        }
        if (this.field1701 != null && this.field1701[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1700 == null || this.field1700[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1700[arg0] & 0xFF;
                var37 = this.field1686[var36];
                var38 = this.field1705[var36];
                var39 = this.field1706[var36];
            }
            short var40 = this.field1701[arg0];
            if (this.field1748[arg0] == -1) {
                class140.method2845(var29, var30, var31, var26, var27, var28, this.field1695[arg0], this.field1695[arg0], this.field1695[arg0], field1727[var37], field1727[var38], field1727[var39], field1708[var37], field1708[var38], field1708[var39], field1729[var37], field1729[var38], field1729[var39], var40);
                class140.method2845(var29, var31, field1693[3], var26, var28, field1697[3], this.field1695[arg0], this.field1695[arg0], this.field1695[arg0], field1727[var37], field1727[var38], field1727[var39], field1708[var37], field1708[var38], field1708[var39], field1729[var37], field1729[var38], field1729[var39], var40);
            } else {
                class140.method2845(var29, var30, var31, var26, var27, var28, field1740[0], field1740[1], field1740[2], field1727[var37], field1727[var38], field1727[var39], field1708[var37], field1708[var38], field1708[var39], field1729[var37], field1729[var38], field1729[var39], var40);
                class140.method2845(var29, var31, field1693[3], var26, var28, field1697[3], field1740[0], field1740[2], field1740[3], field1727[var37], field1727[var38], field1727[var39], field1708[var37], field1708[var38], field1708[var39], field1729[var37], field1729[var38], field1729[var39], var40);
            }
        } else if (this.field1748[arg0] == -1) {
            int var41 = field1749[this.field1695[arg0]];
            class140.method2843(var29, var30, var31, var26, var27, var28, var41);
            class140.method2843(var29, var31, field1693[3], var26, var28, field1697[3], var41);
        } else {
            class140.method2841(var29, var30, var31, var26, var27, var28, field1740[0], field1740[1], field1740[2]);
            class140.method2841(var29, var31, field1693[3], var26, var28, field1697[3], field1740[0], field1740[2], field1740[3]);
        }
    }
}
