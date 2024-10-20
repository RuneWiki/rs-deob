package deob;

@ObfuscatedName("ci")
public class class99 extends class79 {

    @ObfuscatedName("ci.f")
    public static class99 field1762 = new class99();

    @ObfuscatedName("ci.k")
    public static byte[] field1715 = new byte[1];

    @ObfuscatedName("ci.y")
    public static class99 field1766 = new class99();

    @ObfuscatedName("ci.e")
    public static byte[] field1709 = new byte[1];

    @ObfuscatedName("ci.r")
    public int field1733 = 0;

    @ObfuscatedName("ci.a")
    public int[] field1711;

    @ObfuscatedName("ci.n")
    public int[] field1746;

    @ObfuscatedName("ci.x")
    public int[] field1717;

    @ObfuscatedName("ci.g")
    public int field1714 = 0;

    @ObfuscatedName("ci.o")
    public int[] field1706;

    @ObfuscatedName("ci.p")
    public int[] field1743;

    @ObfuscatedName("ci.v")
    public int[] field1708;

    @ObfuscatedName("ci.w")
    public int[] field1718;

    @ObfuscatedName("ci.t")
    public int[] field1719;

    @ObfuscatedName("ci.s")
    public int[] field1720;

    @ObfuscatedName("ci.b")
    public byte[] field1721;

    @ObfuscatedName("ci.u")
    public byte[] field1738;

    @ObfuscatedName("ci.j")
    public byte[] field1723;

    @ObfuscatedName("ci.d")
    public short[] field1740;

    @ObfuscatedName("ci.l")
    public byte field1725 = 0;

    @ObfuscatedName("ci.m")
    public int field1726 = 0;

    @ObfuscatedName("ci.q")
    public int[] field1727;

    @ObfuscatedName("ci.h")
    public int[] field1728;

    @ObfuscatedName("ci.c")
    public int[] field1729;

    @ObfuscatedName("ci.z")
    public int[][] field1730;

    @ObfuscatedName("ci.i")
    public int[][] field1748;

    @ObfuscatedName("ci.ah")
    public boolean field1732 = false;

    @ObfuscatedName("ci.aj")
    public int field1771;

    @ObfuscatedName("ci.ar")
    public int field1734;

    @ObfuscatedName("ci.al")
    public int field1735;

    @ObfuscatedName("ci.aw")
    public int field1736;

    @ObfuscatedName("ci.ao")
    public int field1737;

    @ObfuscatedName("ci.au")
    public static boolean[] field1739 = new boolean[4096];

    @ObfuscatedName("ci.av")
    public static boolean[] field1767 = new boolean[4096];

    @ObfuscatedName("ci.ae")
    public static int[] field1741 = new int[4096];

    @ObfuscatedName("ci.ak")
    public static int[] field1742 = new int[4096];

    @ObfuscatedName("ci.ay")
    public static int[] field1744 = new int[4096];

    @ObfuscatedName("ci.at")
    public static int[] field1710 = new int[4096];

    @ObfuscatedName("ci.ap")
    public static int[] field1745 = new int[4096];

    @ObfuscatedName("ci.an")
    public static int[] field1724 = new int[4096];

    @ObfuscatedName("ci.ag")
    public static int[] field1768 = new int[1600];

    @ObfuscatedName("ci.am")
    public static int[][] field1749 = new int[1600][512];

    @ObfuscatedName("ci.ai")
    public static int[] field1712 = new int[12];

    @ObfuscatedName("ci.ab")
    public static int[][] field1751 = new int[12][2000];

    @ObfuscatedName("ci.af")
    public static int[] field1752 = new int[2000];

    @ObfuscatedName("ci.ac")
    public static int[] field1753 = new int[2000];

    @ObfuscatedName("ci.aq")
    public static int[] field1754 = new int[12];

    @ObfuscatedName("ci.as")
    public static int[] field1755 = new int[10];

    @ObfuscatedName("ci.az")
    public static int[] field1707 = new int[10];

    @ObfuscatedName("ci.aa")
    public static int[] field1757 = new int[10];

    @ObfuscatedName("ci.bf")
    public static boolean field1761 = false;

    @ObfuscatedName("ci.bu")
    public static int field1763 = 0;

    @ObfuscatedName("ci.bo")
    public static int field1731 = 0;

    @ObfuscatedName("ci.be")
    public static int field1764 = 0;

    @ObfuscatedName("ci.bx")
    public static int[] field1765 = new int[1000];

    @ObfuscatedName("ci.bh")
    public static int[] field1713 = class85.field1497;

    @ObfuscatedName("ci.bj")
    public static int[] field1716 = class85.field1498;

    @ObfuscatedName("ci.bm")
    public static int[] field1722 = class85.field1493;

    @ObfuscatedName("ci.bz")
    public static int[] field1769 = class85.field1496;

    public class99() {
    }

    public class99(class99[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1733 = 0;
        this.field1714 = 0;
        this.field1726 = 0;
        this.field1725 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class99 var8 = arg0[var7];
            if (var8 != null) {
                this.field1733 += var8.field1733;
                this.field1714 += var8.field1714;
                this.field1726 += var8.field1726;
                if (var8.field1721 == null) {
                    if (this.field1725 == -1) {
                        this.field1725 = var8.field1725;
                    }
                    if (this.field1725 != var8.field1725) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1738 != null;
                var5 |= var8.field1740 != null;
                var6 |= var8.field1723 != null;
            }
        }
        this.field1711 = new int[this.field1733];
        this.field1746 = new int[this.field1733];
        this.field1717 = new int[this.field1733];
        this.field1706 = new int[this.field1714];
        this.field1743 = new int[this.field1714];
        this.field1708 = new int[this.field1714];
        this.field1718 = new int[this.field1714];
        this.field1719 = new int[this.field1714];
        this.field1720 = new int[this.field1714];
        if (var3) {
            this.field1721 = new byte[this.field1714];
        }
        if (var4) {
            this.field1738 = new byte[this.field1714];
        }
        if (var5) {
            this.field1740 = new short[this.field1714];
        }
        if (var6) {
            this.field1723 = new byte[this.field1714];
        }
        if (this.field1726 > 0) {
            this.field1727 = new int[this.field1726];
            this.field1728 = new int[this.field1726];
            this.field1729 = new int[this.field1726];
        }
        this.field1733 = 0;
        this.field1714 = 0;
        this.field1726 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class99 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1714; var11++) {
                    this.field1706[this.field1714] = var10.field1706[var11] + this.field1733;
                    this.field1743[this.field1714] = var10.field1743[var11] + this.field1733;
                    this.field1708[this.field1714] = var10.field1708[var11] + this.field1733;
                    this.field1718[this.field1714] = var10.field1718[var11];
                    this.field1719[this.field1714] = var10.field1719[var11];
                    this.field1720[this.field1714] = var10.field1720[var11];
                    if (var3) {
                        if (var10.field1721 == null) {
                            this.field1721[this.field1714] = var10.field1725;
                        } else {
                            this.field1721[this.field1714] = var10.field1721[var11];
                        }
                    }
                    if (var4 && var10.field1738 != null) {
                        this.field1738[this.field1714] = var10.field1738[var11];
                    }
                    if (var5) {
                        if (var10.field1740 == null) {
                            this.field1740[this.field1714] = -1;
                        } else {
                            this.field1740[this.field1714] = var10.field1740[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1723 == null || var10.field1723[var11] == -1) {
                            this.field1723[this.field1714] = -1;
                        } else {
                            this.field1723[this.field1714] = (byte) (var10.field1723[var11] + this.field1726);
                        }
                    }
                    this.field1714++;
                }
                for (int var12 = 0; var12 < var10.field1726; var12++) {
                    this.field1727[this.field1726] = var10.field1727[var12] + this.field1733;
                    this.field1728[this.field1726] = var10.field1728[var12] + this.field1733;
                    this.field1729[this.field1726] = var10.field1729[var12] + this.field1733;
                    this.field1726++;
                }
                for (int var13 = 0; var13 < var10.field1733; var13++) {
                    this.field1711[this.field1733] = var10.field1711[var13];
                    this.field1746[this.field1733] = var10.field1746[var13];
                    this.field1717[this.field1733] = var10.field1717[var13];
                    this.field1733++;
                }
            }
        }
    }

    @ObfuscatedName("ci.f([[IIIIZI)Lci;")
    public class99 method2066(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2024();
        int var7 = arg1 - this.field1735;
        int var8 = this.field1735 + arg1;
        int var9 = arg3 - this.field1735;
        int var10 = this.field1735 + arg3;
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
            var15.field1733 = this.field1733;
            var15.field1714 = this.field1714;
            var15.field1726 = this.field1726;
            var15.field1711 = this.field1711;
            var15.field1717 = this.field1717;
            var15.field1706 = this.field1706;
            var15.field1743 = this.field1743;
            var15.field1708 = this.field1708;
            var15.field1718 = this.field1718;
            var15.field1719 = this.field1719;
            var15.field1720 = this.field1720;
            var15.field1721 = this.field1721;
            var15.field1738 = this.field1738;
            var15.field1723 = this.field1723;
            var15.field1740 = this.field1740;
            var15.field1725 = this.field1725;
            var15.field1727 = this.field1727;
            var15.field1728 = this.field1728;
            var15.field1729 = this.field1729;
            var15.field1730 = this.field1730;
            var15.field1748 = this.field1748;
            var15.field1732 = this.field1732;
            var15.field1746 = new int[var15.field1733];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1733; var16++) {
                int var17 = this.field1711[var16] + arg1;
                int var18 = this.field1717[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1746[var16] = this.field1746[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1733; var26++) {
                int var27 = (-this.field1746[var26] << 16) / this.field1365;
                if (var27 < arg5) {
                    int var28 = this.field1711[var26] + arg1;
                    int var29 = this.field1717[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1746[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1746[var26];
                }
            }
        }
        var15.field1771 = 0;
        return var15;
    }

    @ObfuscatedName("ci.y(Z)Lci;")
    public class99 method2021(boolean arg0) {
        if (!arg0 && field1715.length < this.field1714) {
            field1715 = new byte[this.field1714 + 100];
        }
        return this.method2023(arg0, field1762, field1715);
    }

    @ObfuscatedName("ci.e(Z)Lci;")
    public class99 method2033(boolean arg0) {
        if (!arg0 && field1709.length < this.field1714) {
            field1709 = new byte[this.field1714 + 100];
        }
        return this.method2023(arg0, field1766, field1709);
    }

    @ObfuscatedName("ci.r(ZLci;[B)Lci;")
    public class99 method2023(boolean arg0, class99 arg1, byte[] arg2) {
        arg1.field1733 = this.field1733;
        arg1.field1714 = this.field1714;
        arg1.field1726 = this.field1726;
        if (arg1.field1711 == null || arg1.field1711.length < this.field1733) {
            arg1.field1711 = new int[this.field1733 + 100];
            arg1.field1746 = new int[this.field1733 + 100];
            arg1.field1717 = new int[this.field1733 + 100];
        }
        for (int var4 = 0; var4 < this.field1733; var4++) {
            arg1.field1711[var4] = this.field1711[var4];
            arg1.field1746[var4] = this.field1746[var4];
            arg1.field1717[var4] = this.field1717[var4];
        }
        if (arg0) {
            arg1.field1738 = this.field1738;
        } else {
            arg1.field1738 = arg2;
            if (this.field1738 == null) {
                for (int var5 = 0; var5 < this.field1714; var5++) {
                    arg1.field1738[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1714; var6++) {
                    arg1.field1738[var6] = this.field1738[var6];
                }
            }
        }
        arg1.field1706 = this.field1706;
        arg1.field1743 = this.field1743;
        arg1.field1708 = this.field1708;
        arg1.field1718 = this.field1718;
        arg1.field1719 = this.field1719;
        arg1.field1720 = this.field1720;
        arg1.field1721 = this.field1721;
        arg1.field1723 = this.field1723;
        arg1.field1740 = this.field1740;
        arg1.field1725 = this.field1725;
        arg1.field1727 = this.field1727;
        arg1.field1728 = this.field1728;
        arg1.field1729 = this.field1729;
        arg1.field1730 = this.field1730;
        arg1.field1748 = this.field1748;
        arg1.field1732 = this.field1732;
        arg1.field1771 = 0;
        return arg1;
    }

    @ObfuscatedName("ci.g()V")
    public void method2024() {
        if (this.field1771 == 1) {
            return;
        }
        this.field1771 = 1;
        this.field1365 = 0;
        this.field1734 = 0;
        this.field1735 = 0;
        for (int var1 = 0; var1 < this.field1733; var1++) {
            int var2 = this.field1711[var1];
            int var3 = this.field1746[var1];
            int var4 = this.field1717[var1];
            if (-var3 > this.field1365) {
                this.field1365 = -var3;
            }
            if (var3 > this.field1734) {
                this.field1734 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1735) {
                this.field1735 = var5;
            }
        }
        this.field1735 = (int) (Math.sqrt((double) this.field1735) + 0.99D);
        this.field1737 = (int) (Math.sqrt((double) (this.field1365 * this.field1365 + this.field1735 * this.field1735)) + 0.99D);
        this.field1736 = this.field1737 + (int) (Math.sqrt((double) (this.field1735 * this.field1735 + this.field1734 * this.field1734)) + 0.99D);
    }

    @ObfuscatedName("ci.o()V")
    public void method2032() {
        if (this.field1771 == 2) {
            return;
        }
        this.field1771 = 2;
        this.field1735 = 0;
        for (int var1 = 0; var1 < this.field1733; var1++) {
            int var2 = this.field1711[var1];
            int var3 = this.field1746[var1];
            int var4 = this.field1717[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1735) {
                this.field1735 = var5;
            }
        }
        this.field1735 = (int) (Math.sqrt((double) this.field1735) + 0.99D);
        this.field1737 = this.field1735;
        this.field1736 = this.field1735 + this.field1735;
    }

    @ObfuscatedName("ci.p()I")
    public int method2026() {
        this.method2024();
        return this.field1735;
    }

    @ObfuscatedName("ci.v(Lcc;I)V")
    public void method2027(class97 arg0, int arg1) {
        if (this.field1730 == null || arg1 == -1) {
            return;
        }
        class82 var3 = arg0.field1680[arg1];
        class96 var4 = var3.field1450;
        Statics.field1758 = 0;
        Statics.field1759 = 0;
        Statics.field1760 = 0;
        for (int var5 = 0; var5 < var3.field1451; var5++) {
            int var6 = var3.field1452[var5];
            this.method2063(var4.field1676[var6], var4.field1673[var6], var3.field1455[var5], var3.field1454[var5], var3.field1446[var5]);
        }
        this.field1771 = 0;
    }

    @ObfuscatedName("ci.w(Lcc;ILcc;I[I)V")
    public void method2042(class97 arg0, int arg1, class97 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2027(arg0, arg1);
            return;
        }
        class82 var6 = arg0.field1680[arg1];
        class82 var7 = arg2.field1680[arg3];
        class96 var8 = var6.field1450;
        Statics.field1758 = 0;
        Statics.field1759 = 0;
        Statics.field1760 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1451; var11++) {
            int var12 = var6.field1452[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1676[var12] == 0) {
                this.method2063(var8.field1676[var12], var8.field1673[var12], var6.field1455[var11], var6.field1454[var11], var6.field1446[var11]);
            }
        }
        Statics.field1758 = 0;
        Statics.field1759 = 0;
        Statics.field1760 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1451; var15++) {
            int var16 = var7.field1452[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1676[var16] == 0) {
                this.method2063(var8.field1676[var16], var8.field1673[var16], var7.field1455[var15], var7.field1454[var15], var7.field1446[var15]);
            }
        }
        this.field1771 = 0;
    }

    @ObfuscatedName("ci.t(I[IIII)V")
    public void method2063(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1758 = 0;
            Statics.field1759 = 0;
            Statics.field1760 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1730.length) {
                    int[] var10 = this.field1730[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1758 += this.field1711[var12];
                        Statics.field1759 += this.field1746[var12];
                        Statics.field1760 += this.field1717[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1758 = Statics.field1758 / var7 + arg2;
                Statics.field1759 = Statics.field1759 / var7 + arg3;
                Statics.field1760 = Statics.field1760 / var7 + arg4;
            } else {
                Statics.field1758 = arg2;
                Statics.field1759 = arg3;
                Statics.field1760 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1730.length) {
                    int[] var15 = this.field1730[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1711[var17] += arg2;
                        this.field1746[var17] += arg3;
                        this.field1717[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1730.length) {
                    int[] var20 = this.field1730[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1711[var22] -= Statics.field1758;
                        this.field1746[var22] -= Statics.field1759;
                        this.field1717[var22] -= Statics.field1760;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1713[var25];
                            int var27 = field1716[var25];
                            int var28 = this.field1746[var22] * var26 + this.field1711[var22] * var27 >> 16;
                            this.field1746[var22] = this.field1746[var22] * var27 - this.field1711[var22] * var26 >> 16;
                            this.field1711[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1713[var23];
                            int var30 = field1716[var23];
                            int var31 = this.field1746[var22] * var30 - this.field1717[var22] * var29 >> 16;
                            this.field1717[var22] = this.field1746[var22] * var29 + this.field1717[var22] * var30 >> 16;
                            this.field1746[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1713[var24];
                            int var33 = field1716[var24];
                            int var34 = this.field1717[var22] * var32 + this.field1711[var22] * var33 >> 16;
                            this.field1717[var22] = this.field1717[var22] * var33 - this.field1711[var22] * var32 >> 16;
                            this.field1711[var22] = var34;
                        }
                        this.field1711[var22] += Statics.field1758;
                        this.field1746[var22] += Statics.field1759;
                        this.field1717[var22] += Statics.field1760;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1730.length) {
                    int[] var37 = this.field1730[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1711[var39] -= Statics.field1758;
                        this.field1746[var39] -= Statics.field1759;
                        this.field1717[var39] -= Statics.field1760;
                        this.field1711[var39] = this.field1711[var39] * arg2 / 128;
                        this.field1746[var39] = this.field1746[var39] * arg3 / 128;
                        this.field1717[var39] = this.field1717[var39] * arg4 / 128;
                        this.field1711[var39] += Statics.field1758;
                        this.field1746[var39] += Statics.field1759;
                        this.field1717[var39] += Statics.field1760;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1748 != null && this.field1738 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1748.length) {
                    int[] var42 = this.field1748[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1738[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1738[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ci.s()V")
    public void method2030() {
        for (int var1 = 0; var1 < this.field1733; var1++) {
            int var2 = this.field1711[var1];
            this.field1711[var1] = this.field1717[var1];
            this.field1717[var1] = -var2;
        }
        this.field1771 = 0;
    }

    @ObfuscatedName("ci.b()V")
    public void method2031() {
        for (int var1 = 0; var1 < this.field1733; var1++) {
            this.field1711[var1] = -this.field1711[var1];
            this.field1717[var1] = -this.field1717[var1];
        }
        this.field1771 = 0;
    }

    @ObfuscatedName("ci.u()V")
    public void method2022() {
        for (int var1 = 0; var1 < this.field1733; var1++) {
            int var2 = this.field1717[var1];
            this.field1717[var1] = this.field1711[var1];
            this.field1711[var1] = -var2;
        }
        this.field1771 = 0;
    }

    @ObfuscatedName("ci.j(I)V")
    public void method2081(int arg0) {
        int var2 = field1713[arg0];
        int var3 = field1716[arg0];
        for (int var4 = 0; var4 < this.field1733; var4++) {
            int var5 = this.field1746[var4] * var3 - this.field1717[var4] * var2 >> 16;
            this.field1717[var4] = this.field1746[var4] * var2 + this.field1717[var4] * var3 >> 16;
            this.field1746[var4] = var5;
        }
        this.field1771 = 0;
    }

    @ObfuscatedName("ci.d(III)V")
    public void method2034(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1733; var4++) {
            this.field1711[var4] += arg0;
            this.field1746[var4] += arg1;
            this.field1717[var4] += arg2;
        }
        this.field1771 = 0;
    }

    @ObfuscatedName("ci.l(III)V")
    public void method2035(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1733; var4++) {
            this.field1711[var4] = this.field1711[var4] * arg0 / 128;
            this.field1746[var4] = this.field1746[var4] * arg1 / 128;
            this.field1717[var4] = this.field1717[var4] * arg2 / 128;
        }
        this.field1771 = 0;
    }

    @ObfuscatedName("ci.m(IIIIIII)V")
    public final void method2025(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1768[0] = -1;
        if (this.field1771 != 2 && this.field1771 != 1) {
            this.method2032();
        }
        int var8 = Statics.field1478;
        int var9 = Statics.field1485;
        int var10 = field1713[arg0];
        int var11 = field1716[arg0];
        int var12 = field1713[arg1];
        int var13 = field1716[arg1];
        int var14 = field1713[arg2];
        int var15 = field1716[arg2];
        int var16 = field1713[arg3];
        int var17 = field1716[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1733; var19++) {
            int var20 = this.field1711[var19];
            int var21 = this.field1746[var19];
            int var22 = this.field1717[var19];
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
            field1744[var19] = var30 - var18;
            field1741[var19] = (var26 << 9) / var30 + var8;
            field1742[var19] = (var29 << 9) / var30 + var9;
            if (this.field1726 > 0) {
                field1710[var19] = var26;
                field1745[var19] = var29;
                field1724[var19] = var30;
            }
        }
        try {
            this.method2073(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ci.q(IIIIIIII)V")
    public final void method2060(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1768[0] = -1;
        if (this.field1771 != 2 && this.field1771 != 1) {
            this.method2032();
        }
        int var9 = Statics.field1478;
        int var10 = Statics.field1485;
        int var11 = field1713[arg0];
        int var12 = field1716[arg0];
        int var13 = field1713[arg1];
        int var14 = field1716[arg1];
        int var15 = field1713[arg2];
        int var16 = field1716[arg2];
        int var17 = field1713[arg3];
        int var18 = field1716[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1733; var20++) {
            int var21 = this.field1711[var20];
            int var22 = this.field1746[var20];
            int var23 = this.field1717[var20];
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
            field1744[var20] = var31 - var19;
            field1741[var20] = (var27 << 9) / arg7 + var9;
            field1742[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1726 > 0) {
                field1710[var20] = var27;
                field1745[var20] = var30;
                field1724[var20] = var31;
            }
        }
        try {
            this.method2073(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ci.al(IIIIIIIII)V")
    public void method1646(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1768[0] = -1;
        if (this.field1771 != 1) {
            this.method2024();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1735 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1735 << 9;
        if (var15 / var13 >= Statics.field1489) {
            return;
        }
        int var16 = this.field1735 + var14 << 9;
        if (var16 / var13 <= Statics.field1484) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1735 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1490) {
            return;
        }
        int var20 = (this.field1365 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1491) {
            return;
        }
        int var22 = (this.field1365 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1726 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1761) {
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
            int var32 = field1763 - Statics.field1478;
            int var33 = field1731 - Statics.field1485;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1732) {
                    field1765[field1764++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1478;
        int var35 = Statics.field1485;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1713[arg0];
            var37 = field1716[arg0];
        }
        for (int var38 = 0; var38 < this.field1733; var38++) {
            int var39 = this.field1711[var38];
            int var40 = this.field1746[var38];
            int var41 = this.field1717[var38];
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
            field1744[var38] = var50 - var11;
            if (var50 >= 50) {
                field1741[var38] = (var46 << 9) / var50 + var34;
                field1742[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1741[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1710[var38] = var46;
                field1745[var38] = var49;
                field1724[var38] = var50;
            }
        }
        try {
            this.method2073(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("ci.h(ZZI)V")
    public final void method2073(boolean arg0, boolean arg1, int arg2) {
        if (this.field1736 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1736; var4++) {
            field1768[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1714; var5++) {
            if (this.field1720[var5] != -2) {
                int var6 = this.field1706[var5];
                int var7 = this.field1743[var5];
                int var8 = this.field1708[var5];
                int var9 = field1741[var6];
                int var10 = field1741[var7];
                int var11 = field1741[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1710[var6];
                    int var13 = field1710[var7];
                    int var14 = field1710[var8];
                    int var15 = field1745[var6];
                    int var16 = field1745[var7];
                    int var17 = field1745[var8];
                    int var18 = field1724[var6];
                    int var19 = field1724[var7];
                    int var20 = field1724[var8];
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
                        field1767[var5] = true;
                        int var30 = (field1744[var6] + field1744[var7] + field1744[var8]) / 3 + this.field1737;
                        field1749[var30][field1768[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2040(field1763, field1731, field1742[var6], field1742[var7], field1742[var8], var9, var10, var11)) {
                        field1765[field1764++] = arg2;
                        arg1 = false;
                    }
                    if ((field1742[var8] - field1742[var7]) * (var9 - var10) - (field1742[var6] - field1742[var7]) * (var11 - var10) > 0) {
                        field1767[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1486 && var10 <= Statics.field1486 && var11 <= Statics.field1486) {
                            field1739[var5] = false;
                        } else {
                            field1739[var5] = true;
                        }
                        int var31 = (field1744[var6] + field1744[var7] + field1744[var8]) / 3 + this.field1737;
                        field1749[var31][field1768[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1721 == null) {
            for (int var32 = this.field1736 - 1; var32 >= 0; var32--) {
                int var33 = field1768[var32];
                if (var33 > 0) {
                    int[] var34 = field1749[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2038(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1712[var36] = 0;
            field1754[var36] = 0;
        }
        for (int var37 = this.field1736 - 1; var37 >= 0; var37--) {
            int var38 = field1768[var37];
            if (var38 > 0) {
                int[] var39 = field1749[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1721[var41];
                    int var43 = field1712[var42]++;
                    field1751[var42][var43] = var41;
                    if (var42 < 10) {
                        field1754[var42] += var37;
                    } else if (var42 == 10) {
                        field1752[var43] = var37;
                    } else {
                        field1753[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1712[1] > 0 || field1712[2] > 0) {
            var44 = (field1754[1] + field1754[2]) / (field1712[1] + field1712[2]);
        }
        int var45 = 0;
        if (field1712[3] > 0 || field1712[4] > 0) {
            var45 = (field1754[3] + field1754[4]) / (field1712[3] + field1712[4]);
        }
        int var46 = 0;
        if (field1712[6] > 0 || field1712[8] > 0) {
            var46 = (field1754[6] + field1754[8]) / (field1712[6] + field1712[8]);
        }
        int var47 = 0;
        int var48 = field1712[10];
        int[] var49 = field1751[10];
        int[] var50 = field1752;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1712[11];
            var49 = field1751[11];
            var50 = field1753;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2038(var49[var47++]);
                if (var47 == var48 && field1751[11] != var49) {
                    var47 = 0;
                    var48 = field1712[11];
                    var49 = field1751[11];
                    var50 = field1753;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2038(var49[var47++]);
                if (var47 == var48 && field1751[11] != var49) {
                    var47 = 0;
                    var48 = field1712[11];
                    var49 = field1751[11];
                    var50 = field1753;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2038(var49[var47++]);
                if (var47 == var48 && field1751[11] != var49) {
                    var47 = 0;
                    var48 = field1712[11];
                    var49 = field1751[11];
                    var50 = field1753;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1712[var52];
            int[] var54 = field1751[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2038(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2038(var49[var47++]);
            if (var47 == var48 && field1751[11] != var49) {
                var47 = 0;
                var49 = field1751[11];
                var48 = field1712[11];
                var50 = field1753;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("ci.c(I)V")
    public final void method2038(int arg0) {
        if (field1767[arg0]) {
            this.method2039(arg0);
            return;
        }
        int var2 = this.field1706[arg0];
        int var3 = this.field1743[arg0];
        int var4 = this.field1708[arg0];
        class85.field1487 = field1739[arg0];
        if (this.field1738 == null) {
            class85.field1495 = 0;
        } else {
            class85.field1495 = this.field1738[arg0] & 0xFF;
        }
        if (this.field1740 != null && this.field1740[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1723 == null || this.field1723[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1723[arg0] & 0xFF;
                var6 = this.field1727[var5];
                var7 = this.field1728[var5];
                var8 = this.field1729[var5];
            }
            if (this.field1720[arg0] == -1) {
                class85.method1833(field1742[var2], field1742[var3], field1742[var4], field1741[var2], field1741[var3], field1741[var4], this.field1718[arg0], this.field1718[arg0], this.field1718[arg0], field1710[var6], field1710[var7], field1710[var8], field1745[var6], field1745[var7], field1745[var8], field1724[var6], field1724[var7], field1724[var8], this.field1740[arg0]);
            } else {
                class85.method1833(field1742[var2], field1742[var3], field1742[var4], field1741[var2], field1741[var3], field1741[var4], this.field1718[arg0], this.field1719[arg0], this.field1720[arg0], field1710[var6], field1710[var7], field1710[var8], field1745[var6], field1745[var7], field1745[var8], field1724[var6], field1724[var7], field1724[var8], this.field1740[arg0]);
            }
        } else if (this.field1720[arg0] == -1) {
            class85.method1831(field1742[var2], field1742[var3], field1742[var4], field1741[var2], field1741[var3], field1741[var4], field1722[this.field1718[arg0]]);
        } else {
            class85.method1829(field1742[var2], field1742[var3], field1742[var4], field1741[var2], field1741[var3], field1741[var4], this.field1718[arg0], this.field1719[arg0], this.field1720[arg0]);
        }
    }

    @ObfuscatedName("ci.z(I)V")
    public final void method2039(int arg0) {
        int var2 = Statics.field1478;
        int var3 = Statics.field1485;
        int var4 = 0;
        int var5 = this.field1706[arg0];
        int var6 = this.field1743[arg0];
        int var7 = this.field1708[arg0];
        int var8 = field1724[var5];
        int var9 = field1724[var6];
        int var10 = field1724[var7];
        if (this.field1738 == null) {
            class85.field1495 = 0;
        } else {
            class85.field1495 = this.field1738[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1755[var4] = field1741[var5];
            field1707[var4] = field1742[var5];
            field1757[var4++] = this.field1718[arg0];
        } else {
            int var11 = field1710[var5];
            int var12 = field1745[var5];
            int var13 = this.field1718[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1769[var10 - var8];
                field1755[var4] = (((field1710[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1707[var4] = (((field1745[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1757[var4++] = ((this.field1720[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1769[var9 - var8];
                field1755[var4] = (((field1710[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1707[var4] = (((field1745[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1757[var4++] = ((this.field1719[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1755[var4] = field1741[var6];
            field1707[var4] = field1742[var6];
            field1757[var4++] = this.field1719[arg0];
        } else {
            int var16 = field1710[var6];
            int var17 = field1745[var6];
            int var18 = this.field1719[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1769[var8 - var9];
                field1755[var4] = (((field1710[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1707[var4] = (((field1745[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1757[var4++] = ((this.field1718[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1769[var10 - var9];
                field1755[var4] = (((field1710[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1707[var4] = (((field1745[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1757[var4++] = ((this.field1720[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1755[var4] = field1741[var7];
            field1707[var4] = field1742[var7];
            field1757[var4++] = this.field1720[arg0];
        } else {
            int var21 = field1710[var7];
            int var22 = field1745[var7];
            int var23 = this.field1720[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1769[var9 - var10];
                field1755[var4] = (((field1710[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1707[var4] = (((field1745[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1757[var4++] = ((this.field1719[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1769[var8 - var10];
                field1755[var4] = (((field1710[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1707[var4] = (((field1745[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1757[var4++] = ((this.field1718[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1755[0];
        int var27 = field1755[1];
        int var28 = field1755[2];
        int var29 = field1707[0];
        int var30 = field1707[1];
        int var31 = field1707[2];
        class85.field1487 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1486 || var27 > Statics.field1486 || var28 > Statics.field1486) {
                class85.field1487 = true;
            }
            if (this.field1740 != null && this.field1740[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1723 == null || this.field1723[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1723[arg0] & 0xFF;
                    var33 = this.field1727[var32];
                    var34 = this.field1728[var32];
                    var35 = this.field1729[var32];
                }
                if (this.field1720[arg0] == -1) {
                    class85.method1833(var29, var30, var31, var26, var27, var28, this.field1718[arg0], this.field1718[arg0], this.field1718[arg0], field1710[var33], field1710[var34], field1710[var35], field1745[var33], field1745[var34], field1745[var35], field1724[var33], field1724[var34], field1724[var35], this.field1740[arg0]);
                } else {
                    class85.method1833(var29, var30, var31, var26, var27, var28, field1757[0], field1757[1], field1757[2], field1710[var33], field1710[var34], field1710[var35], field1745[var33], field1745[var34], field1745[var35], field1724[var33], field1724[var34], field1724[var35], this.field1740[arg0]);
                }
            } else if (this.field1720[arg0] == -1) {
                class85.method1831(var29, var30, var31, var26, var27, var28, field1722[this.field1718[arg0]]);
            } else {
                class85.method1829(var29, var30, var31, var26, var27, var28, field1757[0], field1757[1], field1757[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1486 || var27 > Statics.field1486 || var28 > Statics.field1486 || field1755[3] < 0 || field1755[3] > Statics.field1486) {
            class85.field1487 = true;
        }
        if (this.field1740 != null && this.field1740[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1723 == null || this.field1723[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1723[arg0] & 0xFF;
                var37 = this.field1727[var36];
                var38 = this.field1728[var36];
                var39 = this.field1729[var36];
            }
            short var40 = this.field1740[arg0];
            if (this.field1720[arg0] == -1) {
                class85.method1833(var29, var30, var31, var26, var27, var28, this.field1718[arg0], this.field1718[arg0], this.field1718[arg0], field1710[var37], field1710[var38], field1710[var39], field1745[var37], field1745[var38], field1745[var39], field1724[var37], field1724[var38], field1724[var39], var40);
                class85.method1833(var29, var31, field1707[3], var26, var28, field1755[3], this.field1718[arg0], this.field1718[arg0], this.field1718[arg0], field1710[var37], field1710[var38], field1710[var39], field1745[var37], field1745[var38], field1745[var39], field1724[var37], field1724[var38], field1724[var39], var40);
            } else {
                class85.method1833(var29, var30, var31, var26, var27, var28, field1757[0], field1757[1], field1757[2], field1710[var37], field1710[var38], field1710[var39], field1745[var37], field1745[var38], field1745[var39], field1724[var37], field1724[var38], field1724[var39], var40);
                class85.method1833(var29, var31, field1707[3], var26, var28, field1755[3], field1757[0], field1757[2], field1757[3], field1710[var37], field1710[var38], field1710[var39], field1745[var37], field1745[var38], field1745[var39], field1724[var37], field1724[var38], field1724[var39], var40);
            }
        } else if (this.field1720[arg0] == -1) {
            int var41 = field1722[this.field1718[arg0]];
            class85.method1831(var29, var30, var31, var26, var27, var28, var41);
            class85.method1831(var29, var31, field1707[3], var26, var28, field1755[3], var41);
        } else {
            class85.method1829(var29, var30, var31, var26, var27, var28, field1757[0], field1757[1], field1757[2]);
            class85.method1829(var29, var31, field1707[3], var26, var28, field1755[3], field1757[0], field1757[2], field1757[3]);
        }
    }

    @ObfuscatedName("ci.i(IIIIIIII)Z")
    public final boolean method2040(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
