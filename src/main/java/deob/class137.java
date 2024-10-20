package deob;

@ObfuscatedName("er")
public class class137 extends class145 {

    @ObfuscatedName("er.z")
    public static class137 field1756 = new class137();

    @ObfuscatedName("er.k")
    public static byte[] field1703 = new byte[1];

    @ObfuscatedName("er.s")
    public static class137 field1697 = new class137();

    @ObfuscatedName("er.t")
    public static byte[] field1738 = new byte[1];

    @ObfuscatedName("er.i")
    public int field1734 = 0;

    @ObfuscatedName("er.o")
    public int[] field1700;

    @ObfuscatedName("er.x")
    public int[] field1698;

    @ObfuscatedName("er.w")
    public int[] field1736;

    @ObfuscatedName("er.g")
    public int field1699 = 0;

    @ObfuscatedName("er.m")
    public int[] field1704;

    @ObfuscatedName("er.n")
    public int[] field1705;

    @ObfuscatedName("er.d")
    public int[] field1710;

    @ObfuscatedName("er.h")
    public int[] field1707;

    @ObfuscatedName("er.a")
    public int[] field1708;

    @ObfuscatedName("er.q")
    public int[] field1709;

    @ObfuscatedName("er.c")
    public byte[] field1730;

    @ObfuscatedName("er.f")
    public byte[] field1711;

    @ObfuscatedName("er.y")
    public byte[] field1758;

    @ObfuscatedName("er.v")
    public short[] field1713;

    @ObfuscatedName("er.j")
    public byte field1721 = 0;

    @ObfuscatedName("er.r")
    public int field1715 = 0;

    @ObfuscatedName("er.u")
    public int[] field1716;

    @ObfuscatedName("er.p")
    public int[] field1717;

    @ObfuscatedName("er.b")
    public int[] field1718;

    @ObfuscatedName("er.l")
    public int[][] field1719;

    @ObfuscatedName("er.e")
    public int[][] field1720;

    @ObfuscatedName("er.ab")
    public boolean field1712 = false;

    @ObfuscatedName("er.ag")
    public int field1722;

    @ObfuscatedName("er.ao")
    public int field1728;

    @ObfuscatedName("er.ae")
    public int field1724;

    @ObfuscatedName("er.an")
    public int field1725;

    @ObfuscatedName("er.am")
    public int field1726;

    @ObfuscatedName("er.ap")
    public int field1727;

    @ObfuscatedName("er.au")
    public int field1739;

    @ObfuscatedName("er.aa")
    public int field1714;

    @ObfuscatedName("er.ar")
    public int field1731 = -1;

    @ObfuscatedName("er.at")
    public int field1759 = -1;

    @ObfuscatedName("er.aq")
    public int field1732 = -1;

    @ObfuscatedName("er.ah")
    public static boolean[] field1748 = new boolean[4700];

    @ObfuscatedName("er.av")
    public static boolean[] field1735 = new boolean[4700];

    @ObfuscatedName("er.ax")
    public static int[] field1723 = new int[4700];

    @ObfuscatedName("er.as")
    public static int[] field1737 = new int[4700];

    @ObfuscatedName("er.az")
    public static int[] field1761 = new int[4700];

    @ObfuscatedName("er.ad")
    public static int[] field1729 = new int[4700];

    @ObfuscatedName("er.ai")
    public static int[] field1740 = new int[4700];

    @ObfuscatedName("er.ay")
    public static int[] field1741 = new int[4700];

    @ObfuscatedName("er.aw")
    public static int[] field1743 = new int[1600];

    @ObfuscatedName("er.af")
    public static int[][] field1744 = new int[1600][512];

    @ObfuscatedName("er.ak")
    public static int[] field1745 = new int[12];

    @ObfuscatedName("er.ac")
    public static int[][] field1746 = new int[12][2000];

    @ObfuscatedName("er.bl")
    public static int[] field1747 = new int[2000];

    @ObfuscatedName("er.bc")
    public static int[] field1702 = new int[2000];

    @ObfuscatedName("er.bz")
    public static int[] field1749 = new int[12];

    @ObfuscatedName("er.bj")
    public static int[] field1750 = new int[10];

    @ObfuscatedName("er.bh")
    public static int[] field1751 = new int[10];

    @ObfuscatedName("er.bi")
    public static int[] field1752 = new int[10];

    @ObfuscatedName("er.bn")
    public static boolean field1701 = true;

    @ObfuscatedName("er.bu")
    public static int[] field1695 = class140.field1811;

    @ObfuscatedName("er.ba")
    public static int[] field1760 = class140.field1794;

    @ObfuscatedName("er.bm")
    public static int[] field1757 = class140.field1807;

    @ObfuscatedName("er.bd")
    public static int[] field1762 = class140.field1810;

    public class137() {
    }

    public class137(class137[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1734 = 0;
        this.field1699 = 0;
        this.field1715 = 0;
        this.field1721 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class137 var8 = arg0[var7];
            if (var8 != null) {
                this.field1734 += var8.field1734;
                this.field1699 += var8.field1699;
                this.field1715 += var8.field1715;
                if (var8.field1730 == null) {
                    if (this.field1721 == -1) {
                        this.field1721 = var8.field1721;
                    }
                    if (this.field1721 != var8.field1721) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1711 != null;
                var5 |= var8.field1713 != null;
                var6 |= var8.field1758 != null;
            }
        }
        this.field1700 = new int[this.field1734];
        this.field1698 = new int[this.field1734];
        this.field1736 = new int[this.field1734];
        this.field1704 = new int[this.field1699];
        this.field1705 = new int[this.field1699];
        this.field1710 = new int[this.field1699];
        this.field1707 = new int[this.field1699];
        this.field1708 = new int[this.field1699];
        this.field1709 = new int[this.field1699];
        if (var3) {
            this.field1730 = new byte[this.field1699];
        }
        if (var4) {
            this.field1711 = new byte[this.field1699];
        }
        if (var5) {
            this.field1713 = new short[this.field1699];
        }
        if (var6) {
            this.field1758 = new byte[this.field1699];
        }
        if (this.field1715 > 0) {
            this.field1716 = new int[this.field1715];
            this.field1717 = new int[this.field1715];
            this.field1718 = new int[this.field1715];
        }
        this.field1734 = 0;
        this.field1699 = 0;
        this.field1715 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class137 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1699; var11++) {
                    this.field1704[this.field1699] = var10.field1704[var11] + this.field1734;
                    this.field1705[this.field1699] = var10.field1705[var11] + this.field1734;
                    this.field1710[this.field1699] = var10.field1710[var11] + this.field1734;
                    this.field1707[this.field1699] = var10.field1707[var11];
                    this.field1708[this.field1699] = var10.field1708[var11];
                    this.field1709[this.field1699] = var10.field1709[var11];
                    if (var3) {
                        if (var10.field1730 == null) {
                            this.field1730[this.field1699] = var10.field1721;
                        } else {
                            this.field1730[this.field1699] = var10.field1730[var11];
                        }
                    }
                    if (var4 && var10.field1711 != null) {
                        this.field1711[this.field1699] = var10.field1711[var11];
                    }
                    if (var5) {
                        if (var10.field1713 == null) {
                            this.field1713[this.field1699] = -1;
                        } else {
                            this.field1713[this.field1699] = var10.field1713[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1758 == null || var10.field1758[var11] == -1) {
                            this.field1758[this.field1699] = -1;
                        } else {
                            this.field1758[this.field1699] = (byte) (var10.field1758[var11] + this.field1715);
                        }
                    }
                    this.field1699++;
                }
                for (int var12 = 0; var12 < var10.field1715; var12++) {
                    this.field1716[this.field1715] = var10.field1716[var12] + this.field1734;
                    this.field1717[this.field1715] = var10.field1717[var12] + this.field1734;
                    this.field1718[this.field1715] = var10.field1718[var12] + this.field1734;
                    this.field1715++;
                }
                for (int var13 = 0; var13 < var10.field1734; var13++) {
                    this.field1700[this.field1734] = var10.field1700[var13];
                    this.field1698[this.field1734] = var10.field1698[var13];
                    this.field1736[this.field1734] = var10.field1736[var13];
                    this.field1734++;
                }
            }
        }
    }

    @ObfuscatedName("er.z([[IIIIZI)Ler;")
    public class137 method2742(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2758();
        int var7 = arg1 - this.field1724;
        int var8 = this.field1724 + arg1;
        int var9 = arg3 - this.field1724;
        int var10 = this.field1724 + arg3;
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
            var15.field1734 = this.field1734;
            var15.field1699 = this.field1699;
            var15.field1715 = this.field1715;
            var15.field1700 = this.field1700;
            var15.field1736 = this.field1736;
            var15.field1704 = this.field1704;
            var15.field1705 = this.field1705;
            var15.field1710 = this.field1710;
            var15.field1707 = this.field1707;
            var15.field1708 = this.field1708;
            var15.field1709 = this.field1709;
            var15.field1730 = this.field1730;
            var15.field1711 = this.field1711;
            var15.field1758 = this.field1758;
            var15.field1713 = this.field1713;
            var15.field1721 = this.field1721;
            var15.field1716 = this.field1716;
            var15.field1717 = this.field1717;
            var15.field1718 = this.field1718;
            var15.field1719 = this.field1719;
            var15.field1720 = this.field1720;
            var15.field1712 = this.field1712;
            var15.field1698 = new int[var15.field1734];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1734; var16++) {
                int var17 = this.field1700[var16] + arg1;
                int var18 = this.field1736[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1698[var16] = this.field1698[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1734; var26++) {
                int var27 = (-this.field1698[var26] << 16) / this.field1906;
                if (var27 < arg5) {
                    int var28 = this.field1700[var26] + arg1;
                    int var29 = this.field1736[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1698[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1698[var26];
                }
            }
        }
        var15.method2752();
        return var15;
    }

    @ObfuscatedName("er.k(Z)Ler;")
    public class137 method2745(boolean arg0) {
        if (!arg0 && field1703.length < this.field1699) {
            field1703 = new byte[this.field1699 + 100];
        }
        return this.method2747(arg0, field1756, field1703);
    }

    @ObfuscatedName("er.s(Z)Ler;")
    public class137 method2793(boolean arg0) {
        if (!arg0 && field1738.length < this.field1699) {
            field1738 = new byte[this.field1699 + 100];
        }
        return this.method2747(arg0, field1697, field1738);
    }

    @ObfuscatedName("er.t(ZLer;[B)Ler;")
    public class137 method2747(boolean arg0, class137 arg1, byte[] arg2) {
        arg1.field1734 = this.field1734;
        arg1.field1699 = this.field1699;
        arg1.field1715 = this.field1715;
        if (arg1.field1700 == null || arg1.field1700.length < this.field1734) {
            arg1.field1700 = new int[this.field1734 + 100];
            arg1.field1698 = new int[this.field1734 + 100];
            arg1.field1736 = new int[this.field1734 + 100];
        }
        for (int var4 = 0; var4 < this.field1734; var4++) {
            arg1.field1700[var4] = this.field1700[var4];
            arg1.field1698[var4] = this.field1698[var4];
            arg1.field1736[var4] = this.field1736[var4];
        }
        if (arg0) {
            arg1.field1711 = this.field1711;
        } else {
            arg1.field1711 = arg2;
            if (this.field1711 == null) {
                for (int var5 = 0; var5 < this.field1699; var5++) {
                    arg1.field1711[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1699; var6++) {
                    arg1.field1711[var6] = this.field1711[var6];
                }
            }
        }
        arg1.field1704 = this.field1704;
        arg1.field1705 = this.field1705;
        arg1.field1710 = this.field1710;
        arg1.field1707 = this.field1707;
        arg1.field1708 = this.field1708;
        arg1.field1709 = this.field1709;
        arg1.field1730 = this.field1730;
        arg1.field1758 = this.field1758;
        arg1.field1713 = this.field1713;
        arg1.field1721 = this.field1721;
        arg1.field1716 = this.field1716;
        arg1.field1717 = this.field1717;
        arg1.field1718 = this.field1718;
        arg1.field1719 = this.field1719;
        arg1.field1720 = this.field1720;
        arg1.field1712 = this.field1712;
        arg1.method2752();
        return arg1;
    }

    @ObfuscatedName("er.i(I)V")
    public void method2748(int arg0) {
        if (this.field1731 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1760[arg0];
        int var9 = field1695[arg0];
        for (int var10 = 0; var10 < this.field1734; var10++) {
            int var11 = class140.method2887(this.field1700[var10], this.field1736[var10], var8, var9);
            int var12 = this.field1698[var10];
            int var13 = class140.method2888(this.field1700[var10], this.field1736[var10], var8, var9);
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
        this.field1727 = (var2 + var5) / 2;
        this.field1739 = (var3 + var6) / 2;
        this.field1714 = (var4 + var7) / 2;
        this.field1731 = (var5 - var2 + 1) / 2;
        this.field1759 = (var6 - var3 + 1) / 2;
        this.field1732 = (var7 - var4 + 1) / 2;
        if (this.field1731 < 32) {
            this.field1731 = 32;
        }
        if (this.field1732 < 32) {
            this.field1732 = 32;
        }
        if (this.field1712) {
            this.field1731 += 8;
            this.field1732 += 8;
        }
    }

    @ObfuscatedName("er.o()V")
    public void method2758() {
        if (this.field1722 == 1) {
            return;
        }
        this.field1722 = 1;
        this.field1906 = 0;
        this.field1728 = 0;
        this.field1724 = 0;
        for (int var1 = 0; var1 < this.field1734; var1++) {
            int var2 = this.field1700[var1];
            int var3 = this.field1698[var1];
            int var4 = this.field1736[var1];
            if (-var3 > this.field1906) {
                this.field1906 = -var3;
            }
            if (var3 > this.field1728) {
                this.field1728 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1724) {
                this.field1724 = var5;
            }
        }
        this.field1724 = (int) (Math.sqrt((double) this.field1724) + 0.99D);
        this.field1726 = (int) (Math.sqrt((double) (this.field1906 * this.field1906 + this.field1724 * this.field1724)) + 0.99D);
        this.field1725 = this.field1726 + (int) (Math.sqrt((double) (this.field1728 * this.field1728 + this.field1724 * this.field1724)) + 0.99D);
    }

    @ObfuscatedName("er.x()V")
    public void method2750() {
        if (this.field1722 == 2) {
            return;
        }
        this.field1722 = 2;
        this.field1724 = 0;
        for (int var1 = 0; var1 < this.field1734; var1++) {
            int var2 = this.field1700[var1];
            int var3 = this.field1698[var1];
            int var4 = this.field1736[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1724) {
                this.field1724 = var5;
            }
        }
        this.field1724 = (int) (Math.sqrt((double) this.field1724) + 0.99D);
        this.field1726 = this.field1724;
        this.field1725 = this.field1724 + this.field1724;
    }

    @ObfuscatedName("er.w()I")
    public int method2774() {
        this.method2758();
        return this.field1724;
    }

    @ObfuscatedName("er.m()V")
    public void method2752() {
        this.field1722 = 0;
        this.field1731 = -1;
    }

    @ObfuscatedName("er.n(Lef;I)V")
    public void method2753(class148 arg0, int arg1) {
        if (this.field1719 == null || arg1 == -1) {
            return;
        }
        class135 var3 = arg0.field1929[arg1];
        class142 var4 = var3.field1662;
        Statics.field1753 = 0;
        Statics.field1754 = 0;
        Statics.field1755 = 0;
        for (int var5 = 0; var5 < var3.field1663; var5++) {
            int var6 = var3.field1658[var5];
            this.method2808(var4.field1826[var6], var4.field1832[var6], var3.field1665[var5], var3.field1666[var5], var3.field1667[var5]);
        }
        this.method2752();
    }

    @ObfuscatedName("er.d(Lef;ILef;I[I)V")
    public void method2754(class148 arg0, int arg1, class148 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2753(arg0, arg1);
            return;
        }
        class135 var6 = arg0.field1929[arg1];
        class135 var7 = arg2.field1929[arg3];
        class142 var8 = var6.field1662;
        Statics.field1753 = 0;
        Statics.field1754 = 0;
        Statics.field1755 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1663; var11++) {
            int var12 = var6.field1658[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1826[var12] == 0) {
                this.method2808(var8.field1826[var12], var8.field1832[var12], var6.field1665[var11], var6.field1666[var11], var6.field1667[var11]);
            }
        }
        Statics.field1753 = 0;
        Statics.field1754 = 0;
        Statics.field1755 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1663; var15++) {
            int var16 = var7.field1658[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1826[var16] == 0) {
                this.method2808(var8.field1826[var16], var8.field1832[var16], var7.field1665[var15], var7.field1666[var15], var7.field1667[var15]);
            }
        }
        this.method2752();
    }

    @ObfuscatedName("er.h(I[IIII)V")
    public void method2808(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1753 = 0;
            Statics.field1754 = 0;
            Statics.field1755 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1719.length) {
                    int[] var10 = this.field1719[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1753 += this.field1700[var12];
                        Statics.field1754 += this.field1698[var12];
                        Statics.field1755 += this.field1736[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1753 = Statics.field1753 / var7 + arg2;
                Statics.field1754 = Statics.field1754 / var7 + arg3;
                Statics.field1755 = Statics.field1755 / var7 + arg4;
            } else {
                Statics.field1753 = arg2;
                Statics.field1754 = arg3;
                Statics.field1755 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1719.length) {
                    int[] var15 = this.field1719[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1700[var17] += arg2;
                        this.field1698[var17] += arg3;
                        this.field1736[var17] += arg4;
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
                        this.field1700[var22] -= Statics.field1753;
                        this.field1698[var22] -= Statics.field1754;
                        this.field1736[var22] -= Statics.field1755;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1695[var25];
                            int var27 = field1760[var25];
                            int var28 = this.field1700[var22] * var27 + this.field1698[var22] * var26 >> 16;
                            this.field1698[var22] = this.field1698[var22] * var27 - this.field1700[var22] * var26 >> 16;
                            this.field1700[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1695[var23];
                            int var30 = field1760[var23];
                            int var31 = this.field1698[var22] * var30 - this.field1736[var22] * var29 >> 16;
                            this.field1736[var22] = this.field1736[var22] * var30 + this.field1698[var22] * var29 >> 16;
                            this.field1698[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1695[var24];
                            int var33 = field1760[var24];
                            int var34 = this.field1736[var22] * var32 + this.field1700[var22] * var33 >> 16;
                            this.field1736[var22] = this.field1736[var22] * var33 - this.field1700[var22] * var32 >> 16;
                            this.field1700[var22] = var34;
                        }
                        this.field1700[var22] += Statics.field1753;
                        this.field1698[var22] += Statics.field1754;
                        this.field1736[var22] += Statics.field1755;
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
                        this.field1700[var39] -= Statics.field1753;
                        this.field1698[var39] -= Statics.field1754;
                        this.field1736[var39] -= Statics.field1755;
                        this.field1700[var39] = this.field1700[var39] * arg2 / 128;
                        this.field1698[var39] = this.field1698[var39] * arg3 / 128;
                        this.field1736[var39] = this.field1736[var39] * arg4 / 128;
                        this.field1700[var39] += Statics.field1753;
                        this.field1698[var39] += Statics.field1754;
                        this.field1736[var39] += Statics.field1755;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1720 != null && this.field1711 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1720.length) {
                    int[] var42 = this.field1720[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1711[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1711[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("er.a()V")
    public void method2756() {
        for (int var1 = 0; var1 < this.field1734; var1++) {
            int var2 = this.field1700[var1];
            this.field1700[var1] = this.field1736[var1];
            this.field1736[var1] = -var2;
        }
        this.method2752();
    }

    @ObfuscatedName("er.q()V")
    public void method2757() {
        for (int var1 = 0; var1 < this.field1734; var1++) {
            this.field1700[var1] = -this.field1700[var1];
            this.field1736[var1] = -this.field1736[var1];
        }
        this.method2752();
    }

    @ObfuscatedName("er.c()V")
    public void method2744() {
        for (int var1 = 0; var1 < this.field1734; var1++) {
            int var2 = this.field1736[var1];
            this.field1736[var1] = this.field1700[var1];
            this.field1700[var1] = -var2;
        }
        this.method2752();
    }

    @ObfuscatedName("er.j(I)V")
    public void method2759(int arg0) {
        int var2 = field1695[arg0];
        int var3 = field1760[arg0];
        for (int var4 = 0; var4 < this.field1734; var4++) {
            int var5 = this.field1698[var4] * var3 - this.field1736[var4] * var2 >> 16;
            this.field1736[var4] = this.field1736[var4] * var3 + this.field1698[var4] * var2 >> 16;
            this.field1698[var4] = var5;
        }
        this.method2752();
    }

    @ObfuscatedName("er.r(III)V")
    public void method2760(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1734; var4++) {
            this.field1700[var4] += arg0;
            this.field1698[var4] += arg1;
            this.field1736[var4] += arg2;
        }
        this.method2752();
    }

    @ObfuscatedName("er.u(III)V")
    public void method2804(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1734; var4++) {
            this.field1700[var4] = this.field1700[var4] * arg0 / 128;
            this.field1698[var4] = this.field1698[var4] * arg1 / 128;
            this.field1736[var4] = this.field1736[var4] * arg2 / 128;
        }
        this.method2752();
    }

    @ObfuscatedName("er.p(IIIIIII)V")
    public final void method2761(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1743[0] = -1;
        if (this.field1722 != 2 && this.field1722 != 1) {
            this.method2750();
        }
        int var8 = Statics.field1800;
        int var9 = Statics.field1799;
        int var10 = field1695[arg0];
        int var11 = field1760[arg0];
        int var12 = field1695[arg1];
        int var13 = field1760[arg1];
        int var14 = field1695[arg2];
        int var15 = field1760[arg2];
        int var16 = field1695[arg3];
        int var17 = field1760[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1734; var19++) {
            int var20 = this.field1700[var19];
            int var21 = this.field1698[var19];
            int var22 = this.field1736[var19];
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
            field1761[var19] = var30 - var18;
            field1723[var19] = class140.field1797 * var26 / var30 + var8;
            field1737[var19] = class140.field1797 * var29 / var30 + var9;
            if (this.field1715 > 0) {
                field1729[var19] = var26;
                field1740[var19] = var29;
                field1741[var19] = var30;
            }
        }
        try {
            this.method2765(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("er.b(IIIIIIII)V")
    public final void method2763(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1743[0] = -1;
        if (this.field1722 != 2 && this.field1722 != 1) {
            this.method2750();
        }
        int var9 = Statics.field1800;
        int var10 = Statics.field1799;
        int var11 = field1695[arg0];
        int var12 = field1760[arg0];
        int var13 = field1695[arg1];
        int var14 = field1760[arg1];
        int var15 = field1695[arg2];
        int var16 = field1760[arg2];
        int var17 = field1695[arg3];
        int var18 = field1760[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1734; var20++) {
            int var21 = this.field1700[var20];
            int var22 = this.field1698[var20];
            int var23 = this.field1736[var20];
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
            field1761[var20] = var31 - var19;
            field1723[var20] = class140.field1797 * var27 / arg7 + var9;
            field1737[var20] = class140.field1797 * var30 / arg7 + var10;
            if (this.field1715 > 0) {
                field1729[var20] = var27;
                field1740[var20] = var30;
                field1741[var20] = var31;
            }
        }
        try {
            this.method2765(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("er.cb(IIIIIIIIJ)V")
    public void method2764(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1743[0] = -1;
        if (this.field1722 != 1) {
            this.method2758();
        }
        this.method2748(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1724 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1724) * class140.field1797;
        if (var16 / var14 >= Statics.field1802) {
            return;
        }
        int var17 = (this.field1724 + var15) * class140.field1797;
        if (var17 / var14 <= Statics.field1803) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1724 * arg1 >> 16;
        int var20 = (var18 + var19) * class140.field1797;
        if (var20 / var14 <= Statics.field1812) {
            return;
        }
        int var21 = (this.field1906 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class140.field1797;
        if (var22 / var14 >= Statics.field1805) {
            return;
        }
        int var23 = (this.field1906 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1715 > 0;
        int var27 = class138.field1766;
        int var29 = class138.field1779;
        boolean var31 = class138.method3460();
        boolean var32 = class138.method139(arg8);
        boolean var33 = false;
        if (var32 && var31) {
            boolean var34 = false;
            if (field1701) {
                var34 = class138.method3840(this, arg5, arg6, arg7);
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
                int var40 = var27 - Statics.field1800;
                int var41 = var29 - Statics.field1799;
                if (var40 > var36 && var40 < var37 && var41 > var38 && var41 < var39) {
                    var34 = true;
                }
            }
            if (var34) {
                if (this.field1712) {
                    class138.method2143(arg8);
                } else {
                    var33 = true;
                }
            }
        }
        int var42 = Statics.field1800;
        int var43 = Statics.field1799;
        int var44 = 0;
        int var45 = 0;
        if (arg0 != 0) {
            var44 = field1695[arg0];
            var45 = field1760[arg0];
        }
        for (int var46 = 0; var46 < this.field1734; var46++) {
            int var47 = this.field1700[var46];
            int var48 = this.field1698[var46];
            int var49 = this.field1736[var46];
            if (arg0 != 0) {
                int var50 = var44 * var49 + var45 * var47 >> 16;
                var49 = var45 * var49 - var44 * var47 >> 16;
                var47 = var50;
            }
            int var51 = arg5 + var47;
            int var52 = arg6 + var48;
            int var53 = arg7 + var49;
            int var54 = arg3 * var53 + arg4 * var51 >> 16;
            int var55 = arg4 * var53 - arg3 * var51 >> 16;
            int var57 = arg2 * var52 - arg1 * var55 >> 16;
            int var58 = arg1 * var52 + arg2 * var55 >> 16;
            field1761[var46] = var58 - var12;
            if (var58 >= 50) {
                field1723[var46] = class140.field1797 * var54 / var58 + var42;
                field1737[var46] = class140.field1797 * var57 / var58 + var43;
            } else {
                field1723[var46] = -5000;
                var24 = true;
            }
            if (var26) {
                field1729[var46] = var54;
                field1740[var46] = var57;
                field1741[var46] = var58;
            }
        }
        try {
            this.method2765(var24, var33, this.field1712, arg8);
        } catch (Exception var61) {
        }
    }

    @ObfuscatedName("er.l(ZZZJ)V")
    public final void method2765(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1725 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1725; var6++) {
            field1743[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1699; var8++) {
            if (this.field1709[var8] != -2) {
                int var9 = this.field1704[var8];
                int var10 = this.field1705[var8];
                int var11 = this.field1710[var8];
                int var12 = field1723[var9];
                int var13 = field1723[var10];
                int var14 = field1723[var11];
                if (arg0 && (var12 == -5000 || var13 == -5000 || var14 == -5000)) {
                    int var15 = field1729[var9];
                    int var16 = field1729[var10];
                    int var17 = field1729[var11];
                    int var18 = field1740[var9];
                    int var19 = field1740[var10];
                    int var20 = field1740[var11];
                    int var21 = field1741[var9];
                    int var22 = field1741[var10];
                    int var23 = field1741[var11];
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
                        field1735[var8] = true;
                        int var33 = (field1761[var9] + field1761[var10] + field1761[var11]) / 3 + this.field1726;
                        field1744[var33][field1743[var33]++] = var8;
                    }
                } else {
                    if (arg1 && class138.method2380(field1737[var9], field1737[var10], field1737[var11], var12, var13, var14, var7)) {
                        class138.method2143(arg3);
                        arg1 = false;
                    }
                    if ((field1737[var11] - field1737[var10]) * (var12 - var13) - (field1737[var9] - field1737[var10]) * (var14 - var13) > 0) {
                        field1735[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1790 && var13 <= Statics.field1790 && var14 <= Statics.field1790) {
                            field1748[var8] = false;
                        } else {
                            field1748[var8] = true;
                        }
                        int var34 = (field1761[var9] + field1761[var10] + field1761[var11]) / 3 + this.field1726;
                        field1744[var34][field1743[var34]++] = var8;
                    }
                }
            }
        }
        if (this.field1730 == null) {
            for (int var35 = this.field1725 - 1; var35 >= 0; var35--) {
                int var36 = field1743[var35];
                if (var36 > 0) {
                    int[] var37 = field1744[var35];
                    for (int var38 = 0; var38 < var36; var38++) {
                        this.method2766(var37[var38]);
                    }
                }
            }
            return;
        }
        for (int var39 = 0; var39 < 12; var39++) {
            field1745[var39] = 0;
            field1749[var39] = 0;
        }
        for (int var40 = this.field1725 - 1; var40 >= 0; var40--) {
            int var41 = field1743[var40];
            if (var41 > 0) {
                int[] var42 = field1744[var40];
                for (int var43 = 0; var43 < var41; var43++) {
                    int var44 = var42[var43];
                    byte var45 = this.field1730[var44];
                    int var46 = field1745[var45]++;
                    field1746[var45][var46] = var44;
                    if (var45 < 10) {
                        field1749[var45] += var40;
                    } else if (var45 == 10) {
                        field1747[var46] = var40;
                    } else {
                        field1702[var46] = var40;
                    }
                }
            }
        }
        int var47 = 0;
        if (field1745[1] > 0 || field1745[2] > 0) {
            var47 = (field1749[1] + field1749[2]) / (field1745[1] + field1745[2]);
        }
        int var48 = 0;
        if (field1745[3] > 0 || field1745[4] > 0) {
            var48 = (field1749[3] + field1749[4]) / (field1745[3] + field1745[4]);
        }
        int var49 = 0;
        if (field1745[6] > 0 || field1745[8] > 0) {
            var49 = (field1749[6] + field1749[8]) / (field1745[6] + field1745[8]);
        }
        int var50 = 0;
        int var51 = field1745[10];
        int[] var52 = field1746[10];
        int[] var53 = field1747;
        if (var50 == var51) {
            var50 = 0;
            var51 = field1745[11];
            var52 = field1746[11];
            var53 = field1702;
        }
        int var54;
        if (var50 < var51) {
            var54 = var53[var50];
        } else {
            var54 = -1000;
        }
        for (int var55 = 0; var55 < 10; var55++) {
            while (var55 == 0 && var54 > var47) {
                this.method2766(var52[var50++]);
                if (var50 == var51 && field1746[11] != var52) {
                    var50 = 0;
                    var51 = field1745[11];
                    var52 = field1746[11];
                    var53 = field1702;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 3 && var54 > var48) {
                this.method2766(var52[var50++]);
                if (var50 == var51 && field1746[11] != var52) {
                    var50 = 0;
                    var51 = field1745[11];
                    var52 = field1746[11];
                    var53 = field1702;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 5 && var54 > var49) {
                this.method2766(var52[var50++]);
                if (var50 == var51 && field1746[11] != var52) {
                    var50 = 0;
                    var51 = field1745[11];
                    var52 = field1746[11];
                    var53 = field1702;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            int var56 = field1745[var55];
            int[] var57 = field1746[var55];
            for (int var58 = 0; var58 < var56; var58++) {
                this.method2766(var57[var58]);
            }
        }
        while (var54 != -1000) {
            this.method2766(var52[var50++]);
            if (var50 == var51 && field1746[11] != var52) {
                var50 = 0;
                var52 = field1746[11];
                var51 = field1745[11];
                var53 = field1702;
            }
            if (var50 < var51) {
                var54 = var53[var50];
            } else {
                var54 = -1000;
            }
        }
    }

    @ObfuscatedName("er.e(I)V")
    public final void method2766(int arg0) {
        if (field1735[arg0]) {
            this.method2809(arg0);
            return;
        }
        int var2 = this.field1704[arg0];
        int var3 = this.field1705[arg0];
        int var4 = this.field1710[arg0];
        class140.field1792 = field1748[arg0];
        if (this.field1711 == null) {
            class140.field1787 = 0;
        } else {
            class140.field1787 = this.field1711[arg0] & 0xFF;
        }
        if (this.field1713 != null && this.field1713[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1758 == null || this.field1758[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1758[arg0] & 0xFF;
                var6 = this.field1716[var5];
                var7 = this.field1717[var5];
                var8 = this.field1718[var5];
            }
            if (this.field1709[arg0] == -1) {
                class140.method2902(field1737[var2], field1737[var3], field1737[var4], field1723[var2], field1723[var3], field1723[var4], this.field1707[arg0], this.field1707[arg0], this.field1707[arg0], field1729[var6], field1729[var7], field1729[var8], field1740[var6], field1740[var7], field1740[var8], field1741[var6], field1741[var7], field1741[var8], this.field1713[arg0]);
            } else {
                class140.method2902(field1737[var2], field1737[var3], field1737[var4], field1723[var2], field1723[var3], field1723[var4], this.field1707[arg0], this.field1708[arg0], this.field1709[arg0], field1729[var6], field1729[var7], field1729[var8], field1740[var6], field1740[var7], field1740[var8], field1741[var6], field1741[var7], field1741[var8], this.field1713[arg0]);
            }
        } else if (this.field1709[arg0] == -1) {
            class140.method2930(field1737[var2], field1737[var3], field1737[var4], field1723[var2], field1723[var3], field1723[var4], field1757[this.field1707[arg0]]);
        } else {
            class140.method2875(field1737[var2], field1737[var3], field1737[var4], field1723[var2], field1723[var3], field1723[var4], this.field1707[arg0], this.field1708[arg0], this.field1709[arg0]);
        }
    }

    @ObfuscatedName("er.ab(I)V")
    public final void method2809(int arg0) {
        int var2 = Statics.field1800;
        int var3 = Statics.field1799;
        int var4 = 0;
        int var5 = this.field1704[arg0];
        int var6 = this.field1705[arg0];
        int var7 = this.field1710[arg0];
        int var8 = field1741[var5];
        int var9 = field1741[var6];
        int var10 = field1741[var7];
        if (this.field1711 == null) {
            class140.field1787 = 0;
        } else {
            class140.field1787 = this.field1711[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1750[var4] = field1723[var5];
            field1751[var4] = field1737[var5];
            field1752[var4++] = this.field1707[arg0];
        } else {
            int var11 = field1729[var5];
            int var12 = field1740[var5];
            int var13 = this.field1707[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1762[var10 - var8];
                field1750[var4] = (((field1729[var7] - var11) * var14 >> 16) + var11) * class140.field1797 / 50 + var2;
                field1751[var4] = (((field1740[var7] - var12) * var14 >> 16) + var12) * class140.field1797 / 50 + var3;
                field1752[var4++] = ((this.field1709[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1762[var9 - var8];
                field1750[var4] = (((field1729[var6] - var11) * var15 >> 16) + var11) * class140.field1797 / 50 + var2;
                field1751[var4] = (((field1740[var6] - var12) * var15 >> 16) + var12) * class140.field1797 / 50 + var3;
                field1752[var4++] = ((this.field1708[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1750[var4] = field1723[var6];
            field1751[var4] = field1737[var6];
            field1752[var4++] = this.field1708[arg0];
        } else {
            int var16 = field1729[var6];
            int var17 = field1740[var6];
            int var18 = this.field1708[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1762[var8 - var9];
                field1750[var4] = (((field1729[var5] - var16) * var19 >> 16) + var16) * class140.field1797 / 50 + var2;
                field1751[var4] = (((field1740[var5] - var17) * var19 >> 16) + var17) * class140.field1797 / 50 + var3;
                field1752[var4++] = ((this.field1707[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1762[var10 - var9];
                field1750[var4] = (((field1729[var7] - var16) * var20 >> 16) + var16) * class140.field1797 / 50 + var2;
                field1751[var4] = (((field1740[var7] - var17) * var20 >> 16) + var17) * class140.field1797 / 50 + var3;
                field1752[var4++] = ((this.field1709[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1750[var4] = field1723[var7];
            field1751[var4] = field1737[var7];
            field1752[var4++] = this.field1709[arg0];
        } else {
            int var21 = field1729[var7];
            int var22 = field1740[var7];
            int var23 = this.field1709[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1762[var9 - var10];
                field1750[var4] = (((field1729[var6] - var21) * var24 >> 16) + var21) * class140.field1797 / 50 + var2;
                field1751[var4] = (((field1740[var6] - var22) * var24 >> 16) + var22) * class140.field1797 / 50 + var3;
                field1752[var4++] = ((this.field1708[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1762[var8 - var10];
                field1750[var4] = (((field1729[var5] - var21) * var25 >> 16) + var21) * class140.field1797 / 50 + var2;
                field1751[var4] = (((field1740[var5] - var22) * var25 >> 16) + var22) * class140.field1797 / 50 + var3;
                field1752[var4++] = ((this.field1707[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1750[0];
        int var27 = field1750[1];
        int var28 = field1750[2];
        int var29 = field1751[0];
        int var30 = field1751[1];
        int var31 = field1751[2];
        class140.field1792 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1790 || var27 > Statics.field1790 || var28 > Statics.field1790) {
                class140.field1792 = true;
            }
            if (this.field1713 != null && this.field1713[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1758 == null || this.field1758[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1758[arg0] & 0xFF;
                    var33 = this.field1716[var32];
                    var34 = this.field1717[var32];
                    var35 = this.field1718[var32];
                }
                if (this.field1709[arg0] == -1) {
                    class140.method2902(var29, var30, var31, var26, var27, var28, this.field1707[arg0], this.field1707[arg0], this.field1707[arg0], field1729[var33], field1729[var34], field1729[var35], field1740[var33], field1740[var34], field1740[var35], field1741[var33], field1741[var34], field1741[var35], this.field1713[arg0]);
                } else {
                    class140.method2902(var29, var30, var31, var26, var27, var28, field1752[0], field1752[1], field1752[2], field1729[var33], field1729[var34], field1729[var35], field1740[var33], field1740[var34], field1740[var35], field1741[var33], field1741[var34], field1741[var35], this.field1713[arg0]);
                }
            } else if (this.field1709[arg0] == -1) {
                class140.method2930(var29, var30, var31, var26, var27, var28, field1757[this.field1707[arg0]]);
            } else {
                class140.method2875(var29, var30, var31, var26, var27, var28, field1752[0], field1752[1], field1752[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1790 || var27 > Statics.field1790 || var28 > Statics.field1790 || field1750[3] < 0 || field1750[3] > Statics.field1790) {
            class140.field1792 = true;
        }
        if (this.field1713 != null && this.field1713[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1758 == null || this.field1758[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1758[arg0] & 0xFF;
                var37 = this.field1716[var36];
                var38 = this.field1717[var36];
                var39 = this.field1718[var36];
            }
            short var40 = this.field1713[arg0];
            if (this.field1709[arg0] == -1) {
                class140.method2902(var29, var30, var31, var26, var27, var28, this.field1707[arg0], this.field1707[arg0], this.field1707[arg0], field1729[var37], field1729[var38], field1729[var39], field1740[var37], field1740[var38], field1740[var39], field1741[var37], field1741[var38], field1741[var39], var40);
                class140.method2902(var29, var31, field1751[3], var26, var28, field1750[3], this.field1707[arg0], this.field1707[arg0], this.field1707[arg0], field1729[var37], field1729[var38], field1729[var39], field1740[var37], field1740[var38], field1740[var39], field1741[var37], field1741[var38], field1741[var39], var40);
            } else {
                class140.method2902(var29, var30, var31, var26, var27, var28, field1752[0], field1752[1], field1752[2], field1729[var37], field1729[var38], field1729[var39], field1740[var37], field1740[var38], field1740[var39], field1741[var37], field1741[var38], field1741[var39], var40);
                class140.method2902(var29, var31, field1751[3], var26, var28, field1750[3], field1752[0], field1752[2], field1752[3], field1729[var37], field1729[var38], field1729[var39], field1740[var37], field1740[var38], field1740[var39], field1741[var37], field1741[var38], field1741[var39], var40);
            }
        } else if (this.field1709[arg0] == -1) {
            int var41 = field1757[this.field1707[arg0]];
            class140.method2930(var29, var30, var31, var26, var27, var28, var41);
            class140.method2930(var29, var31, field1751[3], var26, var28, field1750[3], var41);
        } else {
            class140.method2875(var29, var30, var31, var26, var27, var28, field1752[0], field1752[1], field1752[2]);
            class140.method2875(var29, var31, field1751[3], var26, var28, field1750[3], field1752[0], field1752[2], field1752[3]);
        }
    }
}
