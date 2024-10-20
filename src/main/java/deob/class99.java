package deob;

@ObfuscatedName("cu")
public class class99 extends class79 {

    @ObfuscatedName("cu.e")
    public static class99 field1706 = new class99();

    @ObfuscatedName("cu.v")
    public static byte[] field1757 = new byte[1];

    @ObfuscatedName("cu.k")
    public static class99 field1707 = new class99();

    @ObfuscatedName("cu.g")
    public static byte[] field1708 = new byte[1];

    @ObfuscatedName("cu.q")
    public int field1729 = 0;

    @ObfuscatedName("cu.l")
    public int[] field1725;

    @ObfuscatedName("cu.a")
    public int[] field1763;

    @ObfuscatedName("cu.b")
    public int[] field1712;

    @ObfuscatedName("cu.z")
    public int field1713 = 0;

    @ObfuscatedName("cu.w")
    public int[] field1714;

    @ObfuscatedName("cu.j")
    public int[] field1744;

    @ObfuscatedName("cu.p")
    public int[] field1716;

    @ObfuscatedName("cu.n")
    public int[] field1721;

    @ObfuscatedName("cu.r")
    public int[] field1718;

    @ObfuscatedName("cu.s")
    public int[] field1719;

    @ObfuscatedName("cu.f")
    public byte[] field1720;

    @ObfuscatedName("cu.c")
    public byte[] field1711;

    @ObfuscatedName("cu.t")
    public byte[] field1705;

    @ObfuscatedName("cu.i")
    public short[] field1764;

    @ObfuscatedName("cu.u")
    public byte field1724 = 0;

    @ObfuscatedName("cu.y")
    public int field1765 = 0;

    @ObfuscatedName("cu.o")
    public int[] field1726;

    @ObfuscatedName("cu.m")
    public int[] field1727;

    @ObfuscatedName("cu.h")
    public int[] field1728;

    @ObfuscatedName("cu.x")
    public int[][] field1762;

    @ObfuscatedName("cu.d")
    public int[][] field1730;

    @ObfuscatedName("cu.ac")
    public boolean field1731 = false;

    @ObfuscatedName("cu.ax")
    public int field1767;

    @ObfuscatedName("cu.af")
    public int field1739;

    @ObfuscatedName("cu.am")
    public int field1734;

    @ObfuscatedName("cu.ah")
    public int field1735;

    @ObfuscatedName("cu.ar")
    public int field1740;

    @ObfuscatedName("cu.ao")
    public static boolean[] field1738 = new boolean[4096];

    @ObfuscatedName("cu.ae")
    public static boolean[] field1736 = new boolean[4096];

    @ObfuscatedName("cu.ab")
    public static int[] field1715 = new int[4096];

    @ObfuscatedName("cu.ai")
    public static int[] field1709 = new int[4096];

    @ObfuscatedName("cu.ag")
    public static int[] field1742 = new int[4096];

    @ObfuscatedName("cu.ap")
    public static int[] field1743 = new int[4096];

    @ObfuscatedName("cu.at")
    public static int[] field1754 = new int[4096];

    @ObfuscatedName("cu.az")
    public static int[] field1745 = new int[4096];

    @ObfuscatedName("cu.ay")
    public static int[] field1747 = new int[1600];

    @ObfuscatedName("cu.aw")
    public static int[][] field1748 = new int[1600][512];

    @ObfuscatedName("cu.ak")
    public static int[] field1749 = new int[12];

    @ObfuscatedName("cu.aq")
    public static int[][] field1710 = new int[12][2000];

    @ObfuscatedName("cu.aa")
    public static int[] field1751 = new int[2000];

    @ObfuscatedName("cu.aj")
    public static int[] field1752 = new int[2000];

    @ObfuscatedName("cu.au")
    public static int[] field1753 = new int[12];

    @ObfuscatedName("cu.al")
    public static int[] field1770 = new int[10];

    @ObfuscatedName("cu.as")
    public static int[] field1755 = new int[10];

    @ObfuscatedName("cu.av")
    public static int[] field1756 = new int[10];

    @ObfuscatedName("cu.bv")
    public static boolean field1760 = false;

    @ObfuscatedName("cu.br")
    public static int field1761 = 0;

    @ObfuscatedName("cu.bn")
    public static int field1717 = 0;

    @ObfuscatedName("cu.bc")
    public static int field1750 = 0;

    @ObfuscatedName("cu.bt")
    public static int[] field1741 = new int[1000];

    @ObfuscatedName("cu.bz")
    public static int[] field1723 = class85.field1500;

    @ObfuscatedName("cu.bb")
    public static int[] field1766 = class85.field1501;

    @ObfuscatedName("cu.bu")
    public static int[] field1733 = class85.field1499;

    @ObfuscatedName("cu.bm")
    public static int[] field1768 = class85.field1489;

    public class99() {
    }

    public class99(class99[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1729 = 0;
        this.field1713 = 0;
        this.field1765 = 0;
        this.field1724 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class99 var8 = arg0[var7];
            if (var8 != null) {
                this.field1729 += var8.field1729;
                this.field1713 += var8.field1713;
                this.field1765 += var8.field1765;
                if (var8.field1720 == null) {
                    if (this.field1724 == -1) {
                        this.field1724 = var8.field1724;
                    }
                    if (this.field1724 != var8.field1724) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1711 != null;
                var5 |= var8.field1764 != null;
                var6 |= var8.field1705 != null;
            }
        }
        this.field1725 = new int[this.field1729];
        this.field1763 = new int[this.field1729];
        this.field1712 = new int[this.field1729];
        this.field1714 = new int[this.field1713];
        this.field1744 = new int[this.field1713];
        this.field1716 = new int[this.field1713];
        this.field1721 = new int[this.field1713];
        this.field1718 = new int[this.field1713];
        this.field1719 = new int[this.field1713];
        if (var3) {
            this.field1720 = new byte[this.field1713];
        }
        if (var4) {
            this.field1711 = new byte[this.field1713];
        }
        if (var5) {
            this.field1764 = new short[this.field1713];
        }
        if (var6) {
            this.field1705 = new byte[this.field1713];
        }
        if (this.field1765 > 0) {
            this.field1726 = new int[this.field1765];
            this.field1727 = new int[this.field1765];
            this.field1728 = new int[this.field1765];
        }
        this.field1729 = 0;
        this.field1713 = 0;
        this.field1765 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class99 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1713; var11++) {
                    this.field1714[this.field1713] = var10.field1714[var11] + this.field1729;
                    this.field1744[this.field1713] = var10.field1744[var11] + this.field1729;
                    this.field1716[this.field1713] = var10.field1716[var11] + this.field1729;
                    this.field1721[this.field1713] = var10.field1721[var11];
                    this.field1718[this.field1713] = var10.field1718[var11];
                    this.field1719[this.field1713] = var10.field1719[var11];
                    if (var3) {
                        if (var10.field1720 == null) {
                            this.field1720[this.field1713] = var10.field1724;
                        } else {
                            this.field1720[this.field1713] = var10.field1720[var11];
                        }
                    }
                    if (var4 && var10.field1711 != null) {
                        this.field1711[this.field1713] = var10.field1711[var11];
                    }
                    if (var5) {
                        if (var10.field1764 == null) {
                            this.field1764[this.field1713] = -1;
                        } else {
                            this.field1764[this.field1713] = var10.field1764[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1705 == null || var10.field1705[var11] == -1) {
                            this.field1705[this.field1713] = -1;
                        } else {
                            this.field1705[this.field1713] = (byte) (var10.field1705[var11] + this.field1765);
                        }
                    }
                    this.field1713++;
                }
                for (int var12 = 0; var12 < var10.field1765; var12++) {
                    this.field1726[this.field1765] = var10.field1726[var12] + this.field1729;
                    this.field1727[this.field1765] = var10.field1727[var12] + this.field1729;
                    this.field1728[this.field1765] = var10.field1728[var12] + this.field1729;
                    this.field1765++;
                }
                for (int var13 = 0; var13 < var10.field1729; var13++) {
                    this.field1725[this.field1729] = var10.field1725[var13];
                    this.field1763[this.field1729] = var10.field1763[var13];
                    this.field1712[this.field1729] = var10.field1712[var13];
                    this.field1729++;
                }
            }
        }
    }

    @ObfuscatedName("cu.e([[IIIIZI)Lcu;")
    public class99 method1968(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1967();
        int var7 = arg1 - this.field1734;
        int var8 = this.field1734 + arg1;
        int var9 = arg3 - this.field1734;
        int var10 = this.field1734 + arg3;
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
        class99 var15;
        if (arg4) {
            var15 = new class99();
            var15.field1729 = this.field1729;
            var15.field1713 = this.field1713;
            var15.field1765 = this.field1765;
            var15.field1725 = this.field1725;
            var15.field1712 = this.field1712;
            var15.field1714 = this.field1714;
            var15.field1744 = this.field1744;
            var15.field1716 = this.field1716;
            var15.field1721 = this.field1721;
            var15.field1718 = this.field1718;
            var15.field1719 = this.field1719;
            var15.field1720 = this.field1720;
            var15.field1711 = this.field1711;
            var15.field1705 = this.field1705;
            var15.field1764 = this.field1764;
            var15.field1724 = this.field1724;
            var15.field1726 = this.field1726;
            var15.field1727 = this.field1727;
            var15.field1728 = this.field1728;
            var15.field1762 = this.field1762;
            var15.field1730 = this.field1730;
            var15.field1731 = this.field1731;
            var15.field1763 = new int[var15.field1729];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1729; var16++) {
                int var17 = this.field1725[var16] + arg1;
                int var18 = this.field1712[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1763[var16] = this.field1763[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1729; var26++) {
                int var27 = (-this.field1763[var26] << 16) / this.field1369;
                if (var27 < arg5) {
                    int var28 = this.field1725[var26] + arg1;
                    int var29 = this.field1712[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1763[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1763[var26];
                }
            }
        }
        var15.field1767 = 0;
        return var15;
    }

    @ObfuscatedName("cu.k(Z)Lcu;")
    public class99 method1996(boolean arg0) {
        if (!arg0 && field1757.length < this.field1713) {
            field1757 = new byte[this.field1713 + 100];
        }
        return this.method2028(arg0, field1706, field1757);
    }

    @ObfuscatedName("cu.g(Z)Lcu;")
    public class99 method1987(boolean arg0) {
        if (!arg0 && field1708.length < this.field1713) {
            field1708 = new byte[this.field1713 + 100];
        }
        return this.method2028(arg0, field1707, field1708);
    }

    @ObfuscatedName("cu.q(ZLcu;[B)Lcu;")
    public class99 method2028(boolean arg0, class99 arg1, byte[] arg2) {
        arg1.field1729 = this.field1729;
        arg1.field1713 = this.field1713;
        arg1.field1765 = this.field1765;
        if (arg1.field1725 == null || arg1.field1725.length < this.field1729) {
            arg1.field1725 = new int[this.field1729 + 100];
            arg1.field1763 = new int[this.field1729 + 100];
            arg1.field1712 = new int[this.field1729 + 100];
        }
        for (int var4 = 0; var4 < this.field1729; var4++) {
            arg1.field1725[var4] = this.field1725[var4];
            arg1.field1763[var4] = this.field1763[var4];
            arg1.field1712[var4] = this.field1712[var4];
        }
        if (arg0) {
            arg1.field1711 = this.field1711;
        } else {
            arg1.field1711 = arg2;
            if (this.field1711 == null) {
                for (int var5 = 0; var5 < this.field1713; var5++) {
                    arg1.field1711[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1713; var6++) {
                    arg1.field1711[var6] = this.field1711[var6];
                }
            }
        }
        arg1.field1714 = this.field1714;
        arg1.field1744 = this.field1744;
        arg1.field1716 = this.field1716;
        arg1.field1721 = this.field1721;
        arg1.field1718 = this.field1718;
        arg1.field1719 = this.field1719;
        arg1.field1720 = this.field1720;
        arg1.field1705 = this.field1705;
        arg1.field1764 = this.field1764;
        arg1.field1724 = this.field1724;
        arg1.field1726 = this.field1726;
        arg1.field1727 = this.field1727;
        arg1.field1728 = this.field1728;
        arg1.field1762 = this.field1762;
        arg1.field1730 = this.field1730;
        arg1.field1731 = this.field1731;
        arg1.field1767 = 0;
        return arg1;
    }

    @ObfuscatedName("cu.l()V")
    public void method1967() {
        if (this.field1767 == 1) {
            return;
        }
        this.field1767 = 1;
        this.field1369 = 0;
        this.field1739 = 0;
        this.field1734 = 0;
        for (int var1 = 0; var1 < this.field1729; var1++) {
            int var2 = this.field1725[var1];
            int var3 = this.field1763[var1];
            int var4 = this.field1712[var1];
            if (-var3 > this.field1369) {
                this.field1369 = -var3;
            }
            if (var3 > this.field1739) {
                this.field1739 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1734) {
                this.field1734 = var5;
            }
        }
        this.field1734 = (int) (Math.sqrt((double) this.field1734) + 0.99D);
        this.field1740 = (int) (Math.sqrt((double) (this.field1369 * this.field1369 + this.field1734 * this.field1734)) + 0.99D);
        this.field1735 = this.field1740 + (int) (Math.sqrt((double) (this.field1739 * this.field1739 + this.field1734 * this.field1734)) + 0.99D);
    }

    @ObfuscatedName("cu.a()V")
    public void method1973() {
        if (this.field1767 == 2) {
            return;
        }
        this.field1767 = 2;
        this.field1734 = 0;
        for (int var1 = 0; var1 < this.field1729; var1++) {
            int var2 = this.field1725[var1];
            int var3 = this.field1763[var1];
            int var4 = this.field1712[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1734) {
                this.field1734 = var5;
            }
        }
        this.field1734 = (int) (Math.sqrt((double) this.field1734) + 0.99D);
        this.field1740 = this.field1734;
        this.field1735 = this.field1734 + this.field1734;
    }

    @ObfuscatedName("cu.j()I")
    public int method1974() {
        this.method1967();
        return this.field1734;
    }

    @ObfuscatedName("cu.p(Lch;I)V")
    public void method2033(class97 arg0, int arg1) {
        if (this.field1762 == null || arg1 == -1) {
            return;
        }
        class82 var3 = arg0.field1681[arg1];
        class96 var4 = var3.field1451;
        Statics.field1746 = 0;
        Statics.field1758 = 0;
        Statics.field1759 = 0;
        for (int var5 = 0; var5 < var3.field1453; var5++) {
            int var6 = var3.field1455[var5];
            this.method1977(var4.field1670[var6], var4.field1671[var6], var3.field1456[var5], var3.field1449[var5], var3.field1458[var5]);
        }
        this.field1767 = 0;
    }

    @ObfuscatedName("cu.n(Lch;ILch;I[I)V")
    public void method2015(class97 arg0, int arg1, class97 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2033(arg0, arg1);
            return;
        }
        class82 var6 = arg0.field1681[arg1];
        class82 var7 = arg2.field1681[arg3];
        class96 var8 = var6.field1451;
        Statics.field1746 = 0;
        Statics.field1758 = 0;
        Statics.field1759 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1453; var11++) {
            int var12 = var6.field1455[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1670[var12] == 0) {
                this.method1977(var8.field1670[var12], var8.field1671[var12], var6.field1456[var11], var6.field1449[var11], var6.field1458[var11]);
            }
        }
        Statics.field1746 = 0;
        Statics.field1758 = 0;
        Statics.field1759 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1453; var15++) {
            int var16 = var7.field1455[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1670[var16] == 0) {
                this.method1977(var8.field1670[var16], var8.field1671[var16], var7.field1456[var15], var7.field1449[var15], var7.field1458[var15]);
            }
        }
        this.field1767 = 0;
    }

    @ObfuscatedName("cu.r(I[IIII)V")
    public void method1977(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1746 = 0;
            Statics.field1758 = 0;
            Statics.field1759 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1762.length) {
                    int[] var10 = this.field1762[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1746 += this.field1725[var12];
                        Statics.field1758 += this.field1763[var12];
                        Statics.field1759 += this.field1712[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1746 = Statics.field1746 / var7 + arg2;
                Statics.field1758 = Statics.field1758 / var7 + arg3;
                Statics.field1759 = Statics.field1759 / var7 + arg4;
            } else {
                Statics.field1746 = arg2;
                Statics.field1758 = arg3;
                Statics.field1759 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1762.length) {
                    int[] var15 = this.field1762[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1725[var17] += arg2;
                        this.field1763[var17] += arg3;
                        this.field1712[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1762.length) {
                    int[] var20 = this.field1762[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1725[var22] -= Statics.field1746;
                        this.field1763[var22] -= Statics.field1758;
                        this.field1712[var22] -= Statics.field1759;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1723[var25];
                            int var27 = field1766[var25];
                            int var28 = this.field1763[var22] * var26 + this.field1725[var22] * var27 >> 16;
                            this.field1763[var22] = this.field1763[var22] * var27 - this.field1725[var22] * var26 >> 16;
                            this.field1725[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1723[var23];
                            int var30 = field1766[var23];
                            int var31 = this.field1763[var22] * var30 - this.field1712[var22] * var29 >> 16;
                            this.field1712[var22] = this.field1763[var22] * var29 + this.field1712[var22] * var30 >> 16;
                            this.field1763[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1723[var24];
                            int var33 = field1766[var24];
                            int var34 = this.field1725[var22] * var33 + this.field1712[var22] * var32 >> 16;
                            this.field1712[var22] = this.field1712[var22] * var33 - this.field1725[var22] * var32 >> 16;
                            this.field1725[var22] = var34;
                        }
                        this.field1725[var22] += Statics.field1746;
                        this.field1763[var22] += Statics.field1758;
                        this.field1712[var22] += Statics.field1759;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1762.length) {
                    int[] var37 = this.field1762[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1725[var39] -= Statics.field1746;
                        this.field1763[var39] -= Statics.field1758;
                        this.field1712[var39] -= Statics.field1759;
                        this.field1725[var39] = this.field1725[var39] * arg2 / 128;
                        this.field1763[var39] = this.field1763[var39] * arg3 / 128;
                        this.field1712[var39] = this.field1712[var39] * arg4 / 128;
                        this.field1725[var39] += Statics.field1746;
                        this.field1763[var39] += Statics.field1758;
                        this.field1712[var39] += Statics.field1759;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1730 != null && this.field1711 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1730.length) {
                    int[] var42 = this.field1730[var41];
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

    @ObfuscatedName("cu.s()V")
    public void method1985() {
        for (int var1 = 0; var1 < this.field1729; var1++) {
            int var2 = this.field1725[var1];
            this.field1725[var1] = this.field1712[var1];
            this.field1712[var1] = -var2;
        }
        this.field1767 = 0;
    }

    @ObfuscatedName("cu.f()V")
    public void method1979() {
        for (int var1 = 0; var1 < this.field1729; var1++) {
            this.field1725[var1] = -this.field1725[var1];
            this.field1712[var1] = -this.field1712[var1];
        }
        this.field1767 = 0;
    }

    @ObfuscatedName("cu.c()V")
    public void method1980() {
        for (int var1 = 0; var1 < this.field1729; var1++) {
            int var2 = this.field1712[var1];
            this.field1712[var1] = this.field1725[var1];
            this.field1725[var1] = -var2;
        }
        this.field1767 = 0;
    }

    @ObfuscatedName("cu.t(I)V")
    public void method1981(int arg0) {
        int var2 = field1723[arg0];
        int var3 = field1766[arg0];
        for (int var4 = 0; var4 < this.field1729; var4++) {
            int var5 = this.field1763[var4] * var3 - this.field1712[var4] * var2 >> 16;
            this.field1712[var4] = this.field1763[var4] * var2 + this.field1712[var4] * var3 >> 16;
            this.field1763[var4] = var5;
        }
        this.field1767 = 0;
    }

    @ObfuscatedName("cu.i(III)V")
    public void method1982(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1729; var4++) {
            this.field1725[var4] += arg0;
            this.field1763[var4] += arg1;
            this.field1712[var4] += arg2;
        }
        this.field1767 = 0;
    }

    @ObfuscatedName("cu.u(III)V")
    public void method1983(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1729; var4++) {
            this.field1725[var4] = this.field1725[var4] * arg0 / 128;
            this.field1763[var4] = this.field1763[var4] * arg1 / 128;
            this.field1712[var4] = this.field1712[var4] * arg2 / 128;
        }
        this.field1767 = 0;
    }

    @ObfuscatedName("cu.y(IIIIIII)V")
    public final void method1992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1747[0] = -1;
        if (this.field1767 != 2 && this.field1767 != 1) {
            this.method1973();
        }
        int var8 = Statics.field1498;
        int var9 = Statics.field1488;
        int var10 = field1723[arg0];
        int var11 = field1766[arg0];
        int var12 = field1723[arg1];
        int var13 = field1766[arg1];
        int var14 = field1723[arg2];
        int var15 = field1766[arg2];
        int var16 = field1723[arg3];
        int var17 = field1766[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1729; var19++) {
            int var20 = this.field1725[var19];
            int var21 = this.field1763[var19];
            int var22 = this.field1712[var19];
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
            field1742[var19] = var30 - var18;
            field1715[var19] = (var26 << 9) / var30 + var8;
            field1709[var19] = (var29 << 9) / var30 + var9;
            if (this.field1765 > 0) {
                field1743[var19] = var26;
                field1754[var19] = var29;
                field1745[var19] = var30;
            }
        }
        try {
            this.method2006(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cu.o(IIIIIIII)V")
    public final void method1970(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1747[0] = -1;
        if (this.field1767 != 2 && this.field1767 != 1) {
            this.method1973();
        }
        int var9 = Statics.field1498;
        int var10 = Statics.field1488;
        int var11 = field1723[arg0];
        int var12 = field1766[arg0];
        int var13 = field1723[arg1];
        int var14 = field1766[arg1];
        int var15 = field1723[arg2];
        int var16 = field1766[arg2];
        int var17 = field1723[arg3];
        int var18 = field1766[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1729; var20++) {
            int var21 = this.field1725[var20];
            int var22 = this.field1763[var20];
            int var23 = this.field1712[var20];
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
            field1742[var20] = var31 - var19;
            field1715[var20] = (var27 << 9) / arg7 + var9;
            field1709[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1765 > 0) {
                field1743[var20] = var27;
                field1754[var20] = var30;
                field1745[var20] = var31;
            }
        }
        try {
            this.method2006(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cu.ac(IIIIIIIII)V")
    public void method1596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1747[0] = -1;
        if (this.field1767 != 1) {
            this.method1967();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1734 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1734 << 9;
        if (var15 / var13 >= Statics.field1493) {
            return;
        }
        int var16 = this.field1734 + var14 << 9;
        if (var16 / var13 <= Statics.field1491) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1734 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1495) {
            return;
        }
        int var20 = (this.field1369 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1494) {
            return;
        }
        int var22 = (this.field1369 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1765 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1760) {
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
            int var32 = field1761 - Statics.field1498;
            int var33 = field1717 - Statics.field1488;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1731) {
                    field1741[field1750++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1498;
        int var35 = Statics.field1488;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1723[arg0];
            var37 = field1766[arg0];
        }
        for (int var38 = 0; var38 < this.field1729; var38++) {
            int var39 = this.field1725[var38];
            int var40 = this.field1763[var38];
            int var41 = this.field1712[var38];
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
            field1742[var38] = var50 - var11;
            if (var50 >= 50) {
                field1715[var38] = (var46 << 9) / var50 + var34;
                field1709[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1715[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1743[var38] = var46;
                field1754[var38] = var49;
                field1745[var38] = var50;
            }
        }
        try {
            this.method2006(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cu.m(ZZI)V")
    public final void method2006(boolean arg0, boolean arg1, int arg2) {
        if (this.field1735 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1735; var4++) {
            field1747[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1713; var5++) {
            if (this.field1719[var5] != -2) {
                int var6 = this.field1714[var5];
                int var7 = this.field1744[var5];
                int var8 = this.field1716[var5];
                int var9 = field1715[var6];
                int var10 = field1715[var7];
                int var11 = field1715[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1743[var6];
                    int var13 = field1743[var7];
                    int var14 = field1743[var8];
                    int var15 = field1754[var6];
                    int var16 = field1754[var7];
                    int var17 = field1754[var8];
                    int var18 = field1745[var6];
                    int var19 = field1745[var7];
                    int var20 = field1745[var8];
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
                        int var30 = (field1742[var6] + field1742[var7] + field1742[var8]) / 3 + this.field1740;
                        field1748[var30][field1747[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method1990(field1761, field1717, field1709[var6], field1709[var7], field1709[var8], var9, var10, var11)) {
                        field1741[field1750++] = arg2;
                        arg1 = false;
                    }
                    if ((field1709[var8] - field1709[var7]) * (var9 - var10) - (field1709[var6] - field1709[var7]) * (var11 - var10) > 0) {
                        field1736[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1490 && var10 <= Statics.field1490 && var11 <= Statics.field1490) {
                            field1738[var5] = false;
                        } else {
                            field1738[var5] = true;
                        }
                        int var31 = (field1742[var6] + field1742[var7] + field1742[var8]) / 3 + this.field1740;
                        field1748[var31][field1747[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1720 == null) {
            for (int var32 = this.field1735 - 1; var32 >= 0; var32--) {
                int var33 = field1747[var32];
                if (var33 > 0) {
                    int[] var34 = field1748[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method1988(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1749[var36] = 0;
            field1753[var36] = 0;
        }
        for (int var37 = this.field1735 - 1; var37 >= 0; var37--) {
            int var38 = field1747[var37];
            if (var38 > 0) {
                int[] var39 = field1748[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1720[var41];
                    int var43 = field1749[var42]++;
                    field1710[var42][var43] = var41;
                    if (var42 < 10) {
                        field1753[var42] += var37;
                    } else if (var42 == 10) {
                        field1751[var43] = var37;
                    } else {
                        field1752[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1749[1] > 0 || field1749[2] > 0) {
            var44 = (field1753[1] + field1753[2]) / (field1749[1] + field1749[2]);
        }
        int var45 = 0;
        if (field1749[3] > 0 || field1749[4] > 0) {
            var45 = (field1753[3] + field1753[4]) / (field1749[3] + field1749[4]);
        }
        int var46 = 0;
        if (field1749[6] > 0 || field1749[8] > 0) {
            var46 = (field1753[6] + field1753[8]) / (field1749[6] + field1749[8]);
        }
        int var47 = 0;
        int var48 = field1749[10];
        int[] var49 = field1710[10];
        int[] var50 = field1751;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1749[11];
            var49 = field1710[11];
            var50 = field1752;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method1988(var49[var47++]);
                if (var47 == var48 && field1710[11] != var49) {
                    var47 = 0;
                    var48 = field1749[11];
                    var49 = field1710[11];
                    var50 = field1752;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method1988(var49[var47++]);
                if (var47 == var48 && field1710[11] != var49) {
                    var47 = 0;
                    var48 = field1749[11];
                    var49 = field1710[11];
                    var50 = field1752;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method1988(var49[var47++]);
                if (var47 == var48 && field1710[11] != var49) {
                    var47 = 0;
                    var48 = field1749[11];
                    var49 = field1710[11];
                    var50 = field1752;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1749[var52];
            int[] var54 = field1710[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method1988(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method1988(var49[var47++]);
            if (var47 == var48 && field1710[11] != var49) {
                var47 = 0;
                var49 = field1710[11];
                var48 = field1749[11];
                var50 = field1752;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cu.h(I)V")
    public final void method1988(int arg0) {
        if (field1736[arg0]) {
            this.method1989(arg0);
            return;
        }
        int var2 = this.field1714[arg0];
        int var3 = this.field1744[arg0];
        int var4 = this.field1716[arg0];
        class85.field1496 = field1738[arg0];
        if (this.field1711 == null) {
            class85.field1487 = 0;
        } else {
            class85.field1487 = this.field1711[arg0] & 0xFF;
        }
        if (this.field1764 != null && this.field1764[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1705 == null || this.field1705[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1705[arg0] & 0xFF;
                var6 = this.field1726[var5];
                var7 = this.field1727[var5];
                var8 = this.field1728[var5];
            }
            if (this.field1719[arg0] == -1) {
                class85.method1791(field1709[var2], field1709[var3], field1709[var4], field1715[var2], field1715[var3], field1715[var4], this.field1721[arg0], this.field1721[arg0], this.field1721[arg0], field1743[var6], field1743[var7], field1743[var8], field1754[var6], field1754[var7], field1754[var8], field1745[var6], field1745[var7], field1745[var8], this.field1764[arg0]);
            } else {
                class85.method1791(field1709[var2], field1709[var3], field1709[var4], field1715[var2], field1715[var3], field1715[var4], this.field1721[arg0], this.field1718[arg0], this.field1719[arg0], field1743[var6], field1743[var7], field1743[var8], field1754[var6], field1754[var7], field1754[var8], field1745[var6], field1745[var7], field1745[var8], this.field1764[arg0]);
            }
        } else if (this.field1719[arg0] == -1) {
            class85.method1789(field1709[var2], field1709[var3], field1709[var4], field1715[var2], field1715[var3], field1715[var4], field1733[this.field1721[arg0]]);
        } else {
            class85.method1778(field1709[var2], field1709[var3], field1709[var4], field1715[var2], field1715[var3], field1715[var4], this.field1721[arg0], this.field1718[arg0], this.field1719[arg0]);
        }
    }

    @ObfuscatedName("cu.x(I)V")
    public final void method1989(int arg0) {
        int var2 = Statics.field1498;
        int var3 = Statics.field1488;
        int var4 = 0;
        int var5 = this.field1714[arg0];
        int var6 = this.field1744[arg0];
        int var7 = this.field1716[arg0];
        int var8 = field1745[var5];
        int var9 = field1745[var6];
        int var10 = field1745[var7];
        if (this.field1711 == null) {
            class85.field1487 = 0;
        } else {
            class85.field1487 = this.field1711[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1770[var4] = field1715[var5];
            field1755[var4] = field1709[var5];
            field1756[var4++] = this.field1721[arg0];
        } else {
            int var11 = field1743[var5];
            int var12 = field1754[var5];
            int var13 = this.field1721[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1768[var10 - var8];
                field1770[var4] = (((field1743[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1755[var4] = (((field1754[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1756[var4++] = ((this.field1719[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1768[var9 - var8];
                field1770[var4] = (((field1743[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1755[var4] = (((field1754[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1756[var4++] = ((this.field1718[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1770[var4] = field1715[var6];
            field1755[var4] = field1709[var6];
            field1756[var4++] = this.field1718[arg0];
        } else {
            int var16 = field1743[var6];
            int var17 = field1754[var6];
            int var18 = this.field1718[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1768[var8 - var9];
                field1770[var4] = (((field1743[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1755[var4] = (((field1754[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1756[var4++] = ((this.field1721[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1768[var10 - var9];
                field1770[var4] = (((field1743[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1755[var4] = (((field1754[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1756[var4++] = ((this.field1719[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1770[var4] = field1715[var7];
            field1755[var4] = field1709[var7];
            field1756[var4++] = this.field1719[arg0];
        } else {
            int var21 = field1743[var7];
            int var22 = field1754[var7];
            int var23 = this.field1719[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1768[var9 - var10];
                field1770[var4] = (((field1743[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1755[var4] = (((field1754[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1756[var4++] = ((this.field1718[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1768[var8 - var10];
                field1770[var4] = (((field1743[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1755[var4] = (((field1754[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1756[var4++] = ((this.field1721[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1770[0];
        int var27 = field1770[1];
        int var28 = field1770[2];
        int var29 = field1755[0];
        int var30 = field1755[1];
        int var31 = field1755[2];
        class85.field1496 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1490 || var27 > Statics.field1490 || var28 > Statics.field1490) {
                class85.field1496 = true;
            }
            if (this.field1764 != null && this.field1764[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1705 == null || this.field1705[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1705[arg0] & 0xFF;
                    var33 = this.field1726[var32];
                    var34 = this.field1727[var32];
                    var35 = this.field1728[var32];
                }
                if (this.field1719[arg0] == -1) {
                    class85.method1791(var29, var30, var31, var26, var27, var28, this.field1721[arg0], this.field1721[arg0], this.field1721[arg0], field1743[var33], field1743[var34], field1743[var35], field1754[var33], field1754[var34], field1754[var35], field1745[var33], field1745[var34], field1745[var35], this.field1764[arg0]);
                } else {
                    class85.method1791(var29, var30, var31, var26, var27, var28, field1756[0], field1756[1], field1756[2], field1743[var33], field1743[var34], field1743[var35], field1754[var33], field1754[var34], field1754[var35], field1745[var33], field1745[var34], field1745[var35], this.field1764[arg0]);
                }
            } else if (this.field1719[arg0] == -1) {
                class85.method1789(var29, var30, var31, var26, var27, var28, field1733[this.field1721[arg0]]);
            } else {
                class85.method1778(var29, var30, var31, var26, var27, var28, field1756[0], field1756[1], field1756[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1490 || var27 > Statics.field1490 || var28 > Statics.field1490 || field1770[3] < 0 || field1770[3] > Statics.field1490) {
            class85.field1496 = true;
        }
        if (this.field1764 != null && this.field1764[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1705 == null || this.field1705[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1705[arg0] & 0xFF;
                var37 = this.field1726[var36];
                var38 = this.field1727[var36];
                var39 = this.field1728[var36];
            }
            short var40 = this.field1764[arg0];
            if (this.field1719[arg0] == -1) {
                class85.method1791(var29, var30, var31, var26, var27, var28, this.field1721[arg0], this.field1721[arg0], this.field1721[arg0], field1743[var37], field1743[var38], field1743[var39], field1754[var37], field1754[var38], field1754[var39], field1745[var37], field1745[var38], field1745[var39], var40);
                class85.method1791(var29, var31, field1755[3], var26, var28, field1770[3], this.field1721[arg0], this.field1721[arg0], this.field1721[arg0], field1743[var37], field1743[var38], field1743[var39], field1754[var37], field1754[var38], field1754[var39], field1745[var37], field1745[var38], field1745[var39], var40);
            } else {
                class85.method1791(var29, var30, var31, var26, var27, var28, field1756[0], field1756[1], field1756[2], field1743[var37], field1743[var38], field1743[var39], field1754[var37], field1754[var38], field1754[var39], field1745[var37], field1745[var38], field1745[var39], var40);
                class85.method1791(var29, var31, field1755[3], var26, var28, field1770[3], field1756[0], field1756[2], field1756[3], field1743[var37], field1743[var38], field1743[var39], field1754[var37], field1754[var38], field1754[var39], field1745[var37], field1745[var38], field1745[var39], var40);
            }
        } else if (this.field1719[arg0] == -1) {
            int var41 = field1733[this.field1721[arg0]];
            class85.method1789(var29, var30, var31, var26, var27, var28, var41);
            class85.method1789(var29, var31, field1755[3], var26, var28, field1770[3], var41);
        } else {
            class85.method1778(var29, var30, var31, var26, var27, var28, field1756[0], field1756[1], field1756[2]);
            class85.method1778(var29, var31, field1755[3], var26, var28, field1770[3], field1756[0], field1756[2], field1756[3]);
        }
    }

    @ObfuscatedName("cu.d(IIIIIIII)Z")
    public final boolean method1990(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
