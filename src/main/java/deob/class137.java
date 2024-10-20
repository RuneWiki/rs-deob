package deob;

@ObfuscatedName("eh")
public class class137 extends class145 {

    @ObfuscatedName("eh.f")
    public static class137 field1702 = new class137();

    @ObfuscatedName("eh.b")
    public static byte[] field1697 = new byte[1];

    @ObfuscatedName("eh.l")
    public static class137 field1700 = new class137();

    @ObfuscatedName("eh.m")
    public static byte[] field1760 = new byte[1];

    @ObfuscatedName("eh.z")
    public int field1739 = 0;

    @ObfuscatedName("eh.q")
    public int[] field1701;

    @ObfuscatedName("eh.k")
    public int[] field1750;

    @ObfuscatedName("eh.c")
    public int[] field1703;

    @ObfuscatedName("eh.u")
    public int field1704 = 0;

    @ObfuscatedName("eh.t")
    public int[] field1705;

    @ObfuscatedName("eh.e")
    public int[] field1706;

    @ObfuscatedName("eh.o")
    public int[] field1707;

    @ObfuscatedName("eh.n")
    public int[] field1708;

    @ObfuscatedName("eh.x")
    public int[] field1715;

    @ObfuscatedName("eh.p")
    public int[] field1737;

    @ObfuscatedName("eh.r")
    public byte[] field1711;

    @ObfuscatedName("eh.y")
    public byte[] field1712;

    @ObfuscatedName("eh.s")
    public byte[] field1713;

    @ObfuscatedName("eh.j")
    public short[] field1714;

    @ObfuscatedName("eh.w")
    public byte field1752 = 0;

    @ObfuscatedName("eh.v")
    public int field1722 = 0;

    @ObfuscatedName("eh.d")
    public int[] field1717;

    @ObfuscatedName("eh.a")
    public int[] field1718;

    @ObfuscatedName("eh.g")
    public int[] field1719;

    @ObfuscatedName("eh.h")
    public int[][] field1709;

    @ObfuscatedName("eh.i")
    public int[][] field1721;

    @ObfuscatedName("eh.ab")
    public boolean field1726 = false;

    @ObfuscatedName("eh.ac")
    public int field1723;

    @ObfuscatedName("eh.ao")
    public int field1724;

    @ObfuscatedName("eh.af")
    public int field1756;

    @ObfuscatedName("eh.av")
    public int field1698;

    @ObfuscatedName("eh.ar")
    public int field1727;

    @ObfuscatedName("eh.ay")
    public int field1728;

    @ObfuscatedName("eh.ah")
    public int field1729;

    @ObfuscatedName("eh.az")
    public int field1730;

    @ObfuscatedName("eh.ak")
    public int field1731 = -1;

    @ObfuscatedName("eh.au")
    public int field1732 = -1;

    @ObfuscatedName("eh.ai")
    public int field1733 = -1;

    @ObfuscatedName("eh.ag")
    public static boolean[] field1735 = new boolean[4700];

    @ObfuscatedName("eh.aq")
    public static boolean[] field1736 = new boolean[4700];

    @ObfuscatedName("eh.aw")
    public static int[] field1734 = new int[4700];

    @ObfuscatedName("eh.an")
    public static int[] field1738 = new int[4700];

    @ObfuscatedName("eh.am")
    public static int[] field1753 = new int[4700];

    @ObfuscatedName("eh.aa")
    public static int[] field1740 = new int[4700];

    @ObfuscatedName("eh.at")
    public static int[] field1710 = new int[4700];

    @ObfuscatedName("eh.as")
    public static int[] field1742 = new int[4700];

    @ObfuscatedName("eh.ae")
    public static int[] field1744 = new int[1600];

    @ObfuscatedName("eh.al")
    public static int[][] field1745 = new int[1600][512];

    @ObfuscatedName("eh.ap")
    public static int[] field1720 = new int[12];

    @ObfuscatedName("eh.ad")
    public static int[][] field1747 = new int[12][2000];

    @ObfuscatedName("eh.bb")
    public static int[] field1748 = new int[2000];

    @ObfuscatedName("eh.bf")
    public static int[] field1749 = new int[2000];

    @ObfuscatedName("eh.bp")
    public static int[] field1751 = new int[12];

    @ObfuscatedName("eh.bg")
    public static int[] field1696 = new int[10];

    @ObfuscatedName("eh.bc")
    public static int[] field1725 = new int[10];

    @ObfuscatedName("eh.bj")
    public static int[] field1755 = new int[10];

    @ObfuscatedName("eh.be")
    public static boolean field1757 = true;

    @ObfuscatedName("eh.bw")
    public static int[] field1741 = class140.field1815;

    @ObfuscatedName("eh.bm")
    public static int[] field1761 = class140.field1800;

    @ObfuscatedName("eh.by")
    public static int[] field1762 = class140.field1811;

    @ObfuscatedName("eh.bq")
    public static int[] field1763 = class140.field1814;

    public class137() {
    }

    public class137(class137[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1739 = 0;
        this.field1704 = 0;
        this.field1722 = 0;
        this.field1752 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class137 var8 = arg0[var7];
            if (var8 != null) {
                this.field1739 += var8.field1739;
                this.field1704 += var8.field1704;
                this.field1722 += var8.field1722;
                if (var8.field1711 == null) {
                    if (this.field1752 == -1) {
                        this.field1752 = var8.field1752;
                    }
                    if (this.field1752 != var8.field1752) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1712 != null;
                var5 |= var8.field1714 != null;
                var6 |= var8.field1713 != null;
            }
        }
        this.field1701 = new int[this.field1739];
        this.field1750 = new int[this.field1739];
        this.field1703 = new int[this.field1739];
        this.field1705 = new int[this.field1704];
        this.field1706 = new int[this.field1704];
        this.field1707 = new int[this.field1704];
        this.field1708 = new int[this.field1704];
        this.field1715 = new int[this.field1704];
        this.field1737 = new int[this.field1704];
        if (var3) {
            this.field1711 = new byte[this.field1704];
        }
        if (var4) {
            this.field1712 = new byte[this.field1704];
        }
        if (var5) {
            this.field1714 = new short[this.field1704];
        }
        if (var6) {
            this.field1713 = new byte[this.field1704];
        }
        if (this.field1722 > 0) {
            this.field1717 = new int[this.field1722];
            this.field1718 = new int[this.field1722];
            this.field1719 = new int[this.field1722];
        }
        this.field1739 = 0;
        this.field1704 = 0;
        this.field1722 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class137 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1704; var11++) {
                    this.field1705[this.field1704] = var10.field1705[var11] + this.field1739;
                    this.field1706[this.field1704] = var10.field1706[var11] + this.field1739;
                    this.field1707[this.field1704] = var10.field1707[var11] + this.field1739;
                    this.field1708[this.field1704] = var10.field1708[var11];
                    this.field1715[this.field1704] = var10.field1715[var11];
                    this.field1737[this.field1704] = var10.field1737[var11];
                    if (var3) {
                        if (var10.field1711 == null) {
                            this.field1711[this.field1704] = var10.field1752;
                        } else {
                            this.field1711[this.field1704] = var10.field1711[var11];
                        }
                    }
                    if (var4 && var10.field1712 != null) {
                        this.field1712[this.field1704] = var10.field1712[var11];
                    }
                    if (var5) {
                        if (var10.field1714 == null) {
                            this.field1714[this.field1704] = -1;
                        } else {
                            this.field1714[this.field1704] = var10.field1714[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1713 == null || var10.field1713[var11] == -1) {
                            this.field1713[this.field1704] = -1;
                        } else {
                            this.field1713[this.field1704] = (byte) (var10.field1713[var11] + this.field1722);
                        }
                    }
                    this.field1704++;
                }
                for (int var12 = 0; var12 < var10.field1722; var12++) {
                    this.field1717[this.field1722] = var10.field1717[var12] + this.field1739;
                    this.field1718[this.field1722] = var10.field1718[var12] + this.field1739;
                    this.field1719[this.field1722] = var10.field1719[var12] + this.field1739;
                    this.field1722++;
                }
                for (int var13 = 0; var13 < var10.field1739; var13++) {
                    this.field1701[this.field1739] = var10.field1701[var13];
                    this.field1750[this.field1739] = var10.field1750[var13];
                    this.field1703[this.field1739] = var10.field1703[var13];
                    this.field1739++;
                }
            }
        }
    }

    @ObfuscatedName("eh.f([[IIIIZI)Leh;")
    public class137 method2741(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2746();
        int var7 = arg1 - this.field1756;
        int var8 = this.field1756 + arg1;
        int var9 = arg3 - this.field1756;
        int var10 = this.field1756 + arg3;
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
            var15.field1739 = this.field1739;
            var15.field1704 = this.field1704;
            var15.field1722 = this.field1722;
            var15.field1701 = this.field1701;
            var15.field1703 = this.field1703;
            var15.field1705 = this.field1705;
            var15.field1706 = this.field1706;
            var15.field1707 = this.field1707;
            var15.field1708 = this.field1708;
            var15.field1715 = this.field1715;
            var15.field1737 = this.field1737;
            var15.field1711 = this.field1711;
            var15.field1712 = this.field1712;
            var15.field1713 = this.field1713;
            var15.field1714 = this.field1714;
            var15.field1752 = this.field1752;
            var15.field1717 = this.field1717;
            var15.field1718 = this.field1718;
            var15.field1719 = this.field1719;
            var15.field1709 = this.field1709;
            var15.field1721 = this.field1721;
            var15.field1726 = this.field1726;
            var15.field1750 = new int[var15.field1739];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1739; var16++) {
                int var17 = this.field1701[var16] + arg1;
                int var18 = this.field1703[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1750[var16] = this.field1750[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1739; var26++) {
                int var27 = (-this.field1750[var26] << 16) / this.field1900;
                if (var27 < arg5) {
                    int var28 = this.field1701[var26] + arg1;
                    int var29 = this.field1703[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1750[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1750[var26];
                }
            }
        }
        var15.method2749();
        return var15;
    }

    @ObfuscatedName("eh.b(Z)Leh;")
    public class137 method2766(boolean arg0) {
        if (!arg0 && field1697.length < this.field1704) {
            field1697 = new byte[this.field1704 + 100];
        }
        return this.method2744(arg0, field1702, field1697);
    }

    @ObfuscatedName("eh.l(Z)Leh;")
    public class137 method2780(boolean arg0) {
        if (!arg0 && field1760.length < this.field1704) {
            field1760 = new byte[this.field1704 + 100];
        }
        return this.method2744(arg0, field1700, field1760);
    }

    @ObfuscatedName("eh.m(ZLeh;[B)Leh;")
    public class137 method2744(boolean arg0, class137 arg1, byte[] arg2) {
        arg1.field1739 = this.field1739;
        arg1.field1704 = this.field1704;
        arg1.field1722 = this.field1722;
        if (arg1.field1701 == null || arg1.field1701.length < this.field1739) {
            arg1.field1701 = new int[this.field1739 + 100];
            arg1.field1750 = new int[this.field1739 + 100];
            arg1.field1703 = new int[this.field1739 + 100];
        }
        for (int var4 = 0; var4 < this.field1739; var4++) {
            arg1.field1701[var4] = this.field1701[var4];
            arg1.field1750[var4] = this.field1750[var4];
            arg1.field1703[var4] = this.field1703[var4];
        }
        if (arg0) {
            arg1.field1712 = this.field1712;
        } else {
            arg1.field1712 = arg2;
            if (this.field1712 == null) {
                for (int var5 = 0; var5 < this.field1704; var5++) {
                    arg1.field1712[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1704; var6++) {
                    arg1.field1712[var6] = this.field1712[var6];
                }
            }
        }
        arg1.field1705 = this.field1705;
        arg1.field1706 = this.field1706;
        arg1.field1707 = this.field1707;
        arg1.field1708 = this.field1708;
        arg1.field1715 = this.field1715;
        arg1.field1737 = this.field1737;
        arg1.field1711 = this.field1711;
        arg1.field1713 = this.field1713;
        arg1.field1714 = this.field1714;
        arg1.field1752 = this.field1752;
        arg1.field1717 = this.field1717;
        arg1.field1718 = this.field1718;
        arg1.field1719 = this.field1719;
        arg1.field1709 = this.field1709;
        arg1.field1721 = this.field1721;
        arg1.field1726 = this.field1726;
        arg1.method2749();
        return arg1;
    }

    @ObfuscatedName("eh.z(I)V")
    public void method2745(int arg0) {
        if (this.field1731 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1761[arg0];
        int var9 = field1741[arg0];
        for (int var10 = 0; var10 < this.field1739; var10++) {
            int var11 = class140.method2892(this.field1701[var10], this.field1703[var10], var8, var9);
            int var12 = this.field1750[var10];
            int var13 = class140.method2914(this.field1701[var10], this.field1703[var10], var8, var9);
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
        this.field1728 = (var2 + var5) / 2;
        this.field1729 = (var3 + var6) / 2;
        this.field1730 = (var4 + var7) / 2;
        this.field1731 = (var5 - var2 + 1) / 2;
        this.field1732 = (var6 - var3 + 1) / 2;
        this.field1733 = (var7 - var4 + 1) / 2;
        if (this.field1731 < 32) {
            this.field1731 = 32;
        }
        if (this.field1733 < 32) {
            this.field1733 = 32;
        }
        if (this.field1726) {
            this.field1731 += 8;
            this.field1733 += 8;
        }
    }

    @ObfuscatedName("eh.q()V")
    public void method2746() {
        if (this.field1723 == 1) {
            return;
        }
        this.field1723 = 1;
        this.field1900 = 0;
        this.field1724 = 0;
        this.field1756 = 0;
        for (int var1 = 0; var1 < this.field1739; var1++) {
            int var2 = this.field1701[var1];
            int var3 = this.field1750[var1];
            int var4 = this.field1703[var1];
            if (-var3 > this.field1900) {
                this.field1900 = -var3;
            }
            if (var3 > this.field1724) {
                this.field1724 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1756) {
                this.field1756 = var5;
            }
        }
        this.field1756 = (int) (Math.sqrt((double) this.field1756) + 0.99D);
        this.field1727 = (int) (Math.sqrt((double) (this.field1900 * this.field1900 + this.field1756 * this.field1756)) + 0.99D);
        this.field1698 = this.field1727 + (int) (Math.sqrt((double) (this.field1756 * this.field1756 + this.field1724 * this.field1724)) + 0.99D);
    }

    @ObfuscatedName("eh.k()V")
    public void method2804() {
        if (this.field1723 == 2) {
            return;
        }
        this.field1723 = 2;
        this.field1756 = 0;
        for (int var1 = 0; var1 < this.field1739; var1++) {
            int var2 = this.field1701[var1];
            int var3 = this.field1750[var1];
            int var4 = this.field1703[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1756) {
                this.field1756 = var5;
            }
        }
        this.field1756 = (int) (Math.sqrt((double) this.field1756) + 0.99D);
        this.field1727 = this.field1756;
        this.field1698 = this.field1756 + this.field1756;
    }

    @ObfuscatedName("eh.c()I")
    public int method2748() {
        this.method2746();
        return this.field1756;
    }

    @ObfuscatedName("eh.t()V")
    public void method2749() {
        this.field1723 = 0;
        this.field1731 = -1;
    }

    @ObfuscatedName("eh.e(Lex;I)V")
    public void method2740(class148 arg0, int arg1) {
        if (this.field1709 == null || arg1 == -1) {
            return;
        }
        class135 var3 = arg0.field1919[arg1];
        class142 var4 = var3.field1665;
        Statics.field1746 = 0;
        Statics.field1716 = 0;
        Statics.field1754 = 0;
        for (int var5 = 0; var5 < var3.field1661; var5++) {
            int var6 = var3.field1667[var5];
            this.method2752(var4.field1827[var6], var4.field1826[var6], var3.field1668[var5], var3.field1666[var5], var3.field1669[var5]);
        }
        this.method2749();
    }

    @ObfuscatedName("eh.o(Lex;ILex;I[I)V")
    public void method2767(class148 arg0, int arg1, class148 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2740(arg0, arg1);
            return;
        }
        class135 var6 = arg0.field1919[arg1];
        class135 var7 = arg2.field1919[arg3];
        class142 var8 = var6.field1665;
        Statics.field1746 = 0;
        Statics.field1716 = 0;
        Statics.field1754 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1661; var11++) {
            int var12 = var6.field1667[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1827[var12] == 0) {
                this.method2752(var8.field1827[var12], var8.field1826[var12], var6.field1668[var11], var6.field1666[var11], var6.field1669[var11]);
            }
        }
        Statics.field1746 = 0;
        Statics.field1716 = 0;
        Statics.field1754 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1661; var15++) {
            int var16 = var7.field1667[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1827[var16] == 0) {
                this.method2752(var8.field1827[var16], var8.field1826[var16], var7.field1668[var15], var7.field1666[var15], var7.field1669[var15]);
            }
        }
        this.method2749();
    }

    @ObfuscatedName("eh.n(I[IIII)V")
    public void method2752(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1746 = 0;
            Statics.field1716 = 0;
            Statics.field1754 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1709.length) {
                    int[] var10 = this.field1709[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1746 += this.field1701[var12];
                        Statics.field1716 += this.field1750[var12];
                        Statics.field1754 += this.field1703[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1746 = Statics.field1746 / var7 + arg2;
                Statics.field1716 = Statics.field1716 / var7 + arg3;
                Statics.field1754 = Statics.field1754 / var7 + arg4;
            } else {
                Statics.field1746 = arg2;
                Statics.field1716 = arg3;
                Statics.field1754 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1709.length) {
                    int[] var15 = this.field1709[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1701[var17] += arg2;
                        this.field1750[var17] += arg3;
                        this.field1703[var17] += arg4;
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
                        this.field1701[var22] -= Statics.field1746;
                        this.field1750[var22] -= Statics.field1716;
                        this.field1703[var22] -= Statics.field1754;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1741[var25];
                            int var27 = field1761[var25];
                            int var28 = this.field1750[var22] * var26 + this.field1701[var22] * var27 >> 16;
                            this.field1750[var22] = this.field1750[var22] * var27 - this.field1701[var22] * var26 >> 16;
                            this.field1701[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1741[var23];
                            int var30 = field1761[var23];
                            int var31 = this.field1750[var22] * var30 - this.field1703[var22] * var29 >> 16;
                            this.field1703[var22] = this.field1750[var22] * var29 + this.field1703[var22] * var30 >> 16;
                            this.field1750[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1741[var24];
                            int var33 = field1761[var24];
                            int var34 = this.field1703[var22] * var32 + this.field1701[var22] * var33 >> 16;
                            this.field1703[var22] = this.field1703[var22] * var33 - this.field1701[var22] * var32 >> 16;
                            this.field1701[var22] = var34;
                        }
                        this.field1701[var22] += Statics.field1746;
                        this.field1750[var22] += Statics.field1716;
                        this.field1703[var22] += Statics.field1754;
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
                        this.field1701[var39] -= Statics.field1746;
                        this.field1750[var39] -= Statics.field1716;
                        this.field1703[var39] -= Statics.field1754;
                        this.field1701[var39] = this.field1701[var39] * arg2 / 128;
                        this.field1750[var39] = this.field1750[var39] * arg3 / 128;
                        this.field1703[var39] = this.field1703[var39] * arg4 / 128;
                        this.field1701[var39] += Statics.field1746;
                        this.field1750[var39] += Statics.field1716;
                        this.field1703[var39] += Statics.field1754;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1721 != null && this.field1712 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1721.length) {
                    int[] var42 = this.field1721[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1712[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1712[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("eh.x()V")
    public void method2753() {
        for (int var1 = 0; var1 < this.field1739; var1++) {
            int var2 = this.field1701[var1];
            this.field1701[var1] = this.field1703[var1];
            this.field1703[var1] = -var2;
        }
        this.method2749();
    }

    @ObfuscatedName("eh.p()V")
    public void method2754() {
        for (int var1 = 0; var1 < this.field1739; var1++) {
            this.field1701[var1] = -this.field1701[var1];
            this.field1703[var1] = -this.field1703[var1];
        }
        this.method2749();
    }

    @ObfuscatedName("eh.r()V")
    public void method2796() {
        for (int var1 = 0; var1 < this.field1739; var1++) {
            int var2 = this.field1703[var1];
            this.field1703[var1] = this.field1701[var1];
            this.field1701[var1] = -var2;
        }
        this.method2749();
    }

    @ObfuscatedName("eh.y(I)V")
    public void method2795(int arg0) {
        int var2 = field1741[arg0];
        int var3 = field1761[arg0];
        for (int var4 = 0; var4 < this.field1739; var4++) {
            int var5 = this.field1750[var4] * var3 - this.field1703[var4] * var2 >> 16;
            this.field1703[var4] = this.field1750[var4] * var2 + this.field1703[var4] * var3 >> 16;
            this.field1750[var4] = var5;
        }
        this.method2749();
    }

    @ObfuscatedName("eh.s(III)V")
    public void method2757(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1739; var4++) {
            this.field1701[var4] += arg0;
            this.field1750[var4] += arg1;
            this.field1703[var4] += arg2;
        }
        this.method2749();
    }

    @ObfuscatedName("eh.j(III)V")
    public void method2758(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1739; var4++) {
            this.field1701[var4] = this.field1701[var4] * arg0 / 128;
            this.field1750[var4] = this.field1750[var4] * arg1 / 128;
            this.field1703[var4] = this.field1703[var4] * arg2 / 128;
        }
        this.method2749();
    }

    @ObfuscatedName("eh.d(IIIIIII)V")
    public final void method2799(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1744[0] = -1;
        if (this.field1723 != 2 && this.field1723 != 1) {
            this.method2804();
        }
        int var8 = Statics.field1790;
        int var9 = Statics.field1803;
        int var10 = field1741[arg0];
        int var11 = field1761[arg0];
        int var12 = field1741[arg1];
        int var13 = field1761[arg1];
        int var14 = field1741[arg2];
        int var15 = field1761[arg2];
        int var16 = field1741[arg3];
        int var17 = field1761[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1739; var19++) {
            int var20 = this.field1701[var19];
            int var21 = this.field1750[var19];
            int var22 = this.field1703[var19];
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
            field1753[var19] = var30 - var18;
            field1734[var19] = class140.field1792 * var26 / var30 + var8;
            field1738[var19] = class140.field1792 * var29 / var30 + var9;
            if (this.field1722 > 0) {
                field1740[var19] = var26;
                field1710[var19] = var29;
                field1742[var19] = var30;
            }
        }
        try {
            this.method2756(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("eh.a(IIIIIIII)V")
    public final void method2760(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1744[0] = -1;
        if (this.field1723 != 2 && this.field1723 != 1) {
            this.method2804();
        }
        int var9 = Statics.field1790;
        int var10 = Statics.field1803;
        int var11 = field1741[arg0];
        int var12 = field1761[arg0];
        int var13 = field1741[arg1];
        int var14 = field1761[arg1];
        int var15 = field1741[arg2];
        int var16 = field1761[arg2];
        int var17 = field1741[arg3];
        int var18 = field1761[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1739; var20++) {
            int var21 = this.field1701[var20];
            int var22 = this.field1750[var20];
            int var23 = this.field1703[var20];
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
            field1753[var20] = var31 - var19;
            field1734[var20] = class140.field1792 * var27 / arg7 + var9;
            field1738[var20] = class140.field1792 * var30 / arg7 + var10;
            if (this.field1722 > 0) {
                field1740[var20] = var27;
                field1710[var20] = var30;
                field1742[var20] = var31;
            }
        }
        try {
            this.method2756(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("eh.cg(IIIIIIIIJ)V")
    public void method2807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1744[0] = -1;
        if (this.field1723 != 1) {
            this.method2746();
        }
        this.method2745(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1756 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1756) * class140.field1792;
        if (var16 / var14 >= Statics.field1807) {
            return;
        }
        int var17 = (this.field1756 + var15) * class140.field1792;
        if (var17 / var14 <= Statics.field1816) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1756 * arg1 >> 16;
        int var20 = (var18 + var19) * class140.field1792;
        if (var20 / var14 <= Statics.field1808) {
            return;
        }
        int var21 = (this.field1900 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class140.field1792;
        if (var22 / var14 >= Statics.field1809) {
            return;
        }
        int var23 = (this.field1900 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1722 > 0;
        int var27 = class138.method3898();
        int var28 = class138.field1768;
        boolean var30 = class138.method349();
        boolean var31 = class138.method782(arg8);
        boolean var32 = false;
        if (var31 && var30) {
            boolean var33 = false;
            if (field1757) {
                var33 = class138.method3485(this, arg5, arg6, arg7);
            } else {
                int var34 = var12 - var13;
                if (var34 <= 50) {
                    var34 = 50;
                }
                int var35;
                int var36;
                if (var15 > 0) {
                    var35 = var16 / var14;
                    var36 = var17 / var34;
                } else {
                    var36 = var17 / var14;
                    var35 = var16 / var34;
                }
                int var37;
                int var38;
                if (var18 > 0) {
                    var37 = var22 / var14;
                    var38 = var20 / var34;
                } else {
                    var38 = var20 / var14;
                    var37 = var22 / var34;
                }
                int var39 = var27 - Statics.field1790;
                int var40 = var28 - Statics.field1803;
                if (var39 > var35 && var39 < var36 && var40 > var37 && var40 < var38) {
                    var33 = true;
                }
            }
            if (var33) {
                if (this.field1726) {
                    class138.method1156(arg8);
                } else {
                    var32 = true;
                }
            }
        }
        int var41 = Statics.field1790;
        int var42 = Statics.field1803;
        int var43 = 0;
        int var44 = 0;
        if (arg0 != 0) {
            var43 = field1741[arg0];
            var44 = field1761[arg0];
        }
        for (int var45 = 0; var45 < this.field1739; var45++) {
            int var46 = this.field1701[var45];
            int var47 = this.field1750[var45];
            int var48 = this.field1703[var45];
            if (arg0 != 0) {
                int var49 = var43 * var48 + var44 * var46 >> 16;
                var48 = var44 * var48 - var43 * var46 >> 16;
                var46 = var49;
            }
            int var50 = arg5 + var46;
            int var51 = arg6 + var47;
            int var52 = arg7 + var48;
            int var53 = arg3 * var52 + arg4 * var50 >> 16;
            int var54 = arg4 * var52 - arg3 * var50 >> 16;
            int var56 = arg2 * var51 - arg1 * var54 >> 16;
            int var57 = arg1 * var51 + arg2 * var54 >> 16;
            field1753[var45] = var57 - var12;
            if (var57 >= 50) {
                field1734[var45] = class140.field1792 * var53 / var57 + var41;
                field1738[var45] = class140.field1792 * var56 / var57 + var42;
            } else {
                field1734[var45] = -5000;
                var24 = true;
            }
            if (var26) {
                field1740[var45] = var53;
                field1710[var45] = var56;
                field1742[var45] = var57;
            }
        }
        try {
            this.method2756(var24, var32, this.field1726, arg8);
        } catch (Exception var60) {
        }
    }

    @ObfuscatedName("eh.g(ZZZJ)V")
    public final void method2756(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1698 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1698; var6++) {
            field1744[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1704; var8++) {
            if (this.field1737[var8] != -2) {
                int var9 = this.field1705[var8];
                int var10 = this.field1706[var8];
                int var11 = this.field1707[var8];
                int var12 = field1734[var9];
                int var13 = field1734[var10];
                int var14 = field1734[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field1740[var9];
                    int var16 = field1740[var10];
                    int var17 = field1740[var11];
                    int var18 = field1710[var9];
                    int var19 = field1710[var10];
                    int var20 = field1710[var11];
                    int var21 = field1742[var9];
                    int var22 = field1742[var10];
                    int var23 = field1742[var11];
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
                        field1736[var8] = true;
                        int var33 = (field1753[var9] + field1753[var10] + field1753[var11]) / 3 + this.field1727;
                        field1745[var33][field1744[var33]++] = var8;
                    }
                } else {
                    if (arg1) {
                        int var34 = field1738[var9];
                        int var35 = field1738[var10];
                        int var36 = field1738[var11];
                        int var37 = class138.field1768 + var7;
                        boolean var38;
                        if (var37 < var34 && var37 < var35 && var37 < var36) {
                            var38 = false;
                        } else {
                            int var39 = class138.field1768 - var7;
                            if (var39 > var34 && var39 > var35 && var39 > var36) {
                                var38 = false;
                            } else {
                                int var40 = class138.field1767 + var7;
                                if (var40 < var12 && var40 < var13 && var40 < var14) {
                                    var38 = false;
                                } else {
                                    int var41 = class138.field1767 - var7;
                                    if (var41 > var12 && var41 > var13 && var41 > var14) {
                                        var38 = false;
                                    } else {
                                        var38 = true;
                                    }
                                }
                            }
                        }
                        if (var38) {
                            class138.method1156(arg3);
                            arg1 = false;
                        }
                    }
                    if ((field1738[var11] - field1738[var10]) * (var12 - var13) - (field1738[var9] - field1738[var10]) * (var14 - var13) > 0) {
                        field1736[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1804 && var13 <= Statics.field1804 && var14 <= Statics.field1804) {
                            field1735[var8] = false;
                        } else {
                            field1735[var8] = true;
                        }
                        int var42 = (field1753[var9] + field1753[var10] + field1753[var11]) / 3 + this.field1727;
                        field1745[var42][field1744[var42]++] = var8;
                    }
                }
            }
        }
        if (this.field1711 == null) {
            for (int var43 = this.field1698 - 1; var43 >= 0; var43--) {
                int var44 = field1744[var43];
                if (var44 > 0) {
                    int[] var45 = field1745[var43];
                    for (int var46 = 0; var46 < var44; var46++) {
                        this.method2763(var45[var46]);
                    }
                }
            }
            return;
        }
        for (int var47 = 0; var47 < 12; var47++) {
            field1720[var47] = 0;
            field1751[var47] = 0;
        }
        for (int var48 = this.field1698 - 1; var48 >= 0; var48--) {
            int var49 = field1744[var48];
            if (var49 > 0) {
                int[] var50 = field1745[var48];
                for (int var51 = 0; var51 < var49; var51++) {
                    int var52 = var50[var51];
                    byte var53 = this.field1711[var52];
                    int var54 = field1720[var53]++;
                    field1747[var53][var54] = var52;
                    if (var53 < 10) {
                        field1751[var53] += var48;
                    } else if (var53 == 10) {
                        field1748[var54] = var48;
                    } else {
                        field1749[var54] = var48;
                    }
                }
            }
        }
        int var55 = 0;
        if (field1720[1] > 0 || field1720[2] > 0) {
            var55 = (field1751[1] + field1751[2]) / (field1720[1] + field1720[2]);
        }
        int var56 = 0;
        if (field1720[3] > 0 || field1720[4] > 0) {
            var56 = (field1751[3] + field1751[4]) / (field1720[3] + field1720[4]);
        }
        int var57 = 0;
        if (field1720[6] > 0 || field1720[8] > 0) {
            var57 = (field1751[6] + field1751[8]) / (field1720[6] + field1720[8]);
        }
        int var58 = 0;
        int var59 = field1720[10];
        int[] var60 = field1747[10];
        int[] var61 = field1748;
        if (var58 == var59) {
            var58 = 0;
            var59 = field1720[11];
            var60 = field1747[11];
            var61 = field1749;
        }
        int var62;
        if (var58 < var59) {
            var62 = var61[var58];
        } else {
            var62 = -1000;
        }
        for (int var63 = 0; var63 < 10; var63++) {
            while (var63 == 0 && var62 > var55) {
                this.method2763(var60[var58++]);
                if (var58 == var59 && field1747[11] != var60) {
                    var58 = 0;
                    var59 = field1720[11];
                    var60 = field1747[11];
                    var61 = field1749;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            while (var63 == 3 && var62 > var56) {
                this.method2763(var60[var58++]);
                if (var58 == var59 && field1747[11] != var60) {
                    var58 = 0;
                    var59 = field1720[11];
                    var60 = field1747[11];
                    var61 = field1749;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            while (var63 == 5 && var62 > var57) {
                this.method2763(var60[var58++]);
                if (var58 == var59 && field1747[11] != var60) {
                    var58 = 0;
                    var59 = field1720[11];
                    var60 = field1747[11];
                    var61 = field1749;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            int var64 = field1720[var63];
            int[] var65 = field1747[var63];
            for (int var66 = 0; var66 < var64; var66++) {
                this.method2763(var65[var66]);
            }
        }
        while (var62 != -1000) {
            this.method2763(var60[var58++]);
            if (var58 == var59 && field1747[11] != var60) {
                var58 = 0;
                var60 = field1747[11];
                var59 = field1720[11];
                var61 = field1749;
            }
            if (var58 < var59) {
                var62 = var61[var58];
            } else {
                var62 = -1000;
            }
        }
    }

    @ObfuscatedName("eh.h(I)V")
    public final void method2763(int arg0) {
        if (field1736[arg0]) {
            this.method2764(arg0);
            return;
        }
        int var2 = this.field1705[arg0];
        int var3 = this.field1706[arg0];
        int var4 = this.field1707[arg0];
        class140.field1801 = field1735[arg0];
        if (this.field1712 == null) {
            class140.field1794 = 0;
        } else {
            class140.field1794 = this.field1712[arg0] & 0xFF;
        }
        if (this.field1714 != null && this.field1714[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1713 == null || this.field1713[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1713[arg0] & 0xFF;
                var6 = this.field1717[var5];
                var7 = this.field1718[var5];
                var8 = this.field1719[var5];
            }
            if (this.field1737[arg0] == -1) {
                class140.method2891(field1738[var2], field1738[var3], field1738[var4], field1734[var2], field1734[var3], field1734[var4], this.field1708[arg0], this.field1708[arg0], this.field1708[arg0], field1740[var6], field1740[var7], field1740[var8], field1710[var6], field1710[var7], field1710[var8], field1742[var6], field1742[var7], field1742[var8], this.field1714[arg0]);
            } else {
                class140.method2891(field1738[var2], field1738[var3], field1738[var4], field1734[var2], field1734[var3], field1734[var4], this.field1708[arg0], this.field1715[arg0], this.field1737[arg0], field1740[var6], field1740[var7], field1740[var8], field1710[var6], field1710[var7], field1710[var8], field1742[var6], field1742[var7], field1742[var8], this.field1714[arg0]);
            }
        } else if (this.field1737[arg0] == -1) {
            class140.method2884(field1738[var2], field1738[var3], field1738[var4], field1734[var2], field1734[var3], field1734[var4], field1762[this.field1708[arg0]]);
        } else {
            class140.method2890(field1738[var2], field1738[var3], field1738[var4], field1734[var2], field1734[var3], field1734[var4], this.field1708[arg0], this.field1715[arg0], this.field1737[arg0]);
        }
    }

    @ObfuscatedName("eh.ab(I)V")
    public final void method2764(int arg0) {
        int var2 = Statics.field1790;
        int var3 = Statics.field1803;
        int var4 = 0;
        int var5 = this.field1705[arg0];
        int var6 = this.field1706[arg0];
        int var7 = this.field1707[arg0];
        int var8 = field1742[var5];
        int var9 = field1742[var6];
        int var10 = field1742[var7];
        if (this.field1712 == null) {
            class140.field1794 = 0;
        } else {
            class140.field1794 = this.field1712[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1696[var4] = field1734[var5];
            field1725[var4] = field1738[var5];
            field1755[var4++] = this.field1708[arg0];
        } else {
            int var11 = field1740[var5];
            int var12 = field1710[var5];
            int var13 = this.field1708[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1763[var10 - var8];
                field1696[var4] = (((field1740[var7] - var11) * var14 >> 16) + var11) * class140.field1792 / 50 + var2;
                field1725[var4] = (((field1710[var7] - var12) * var14 >> 16) + var12) * class140.field1792 / 50 + var3;
                field1755[var4++] = ((this.field1737[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1763[var9 - var8];
                field1696[var4] = (((field1740[var6] - var11) * var15 >> 16) + var11) * class140.field1792 / 50 + var2;
                field1725[var4] = (((field1710[var6] - var12) * var15 >> 16) + var12) * class140.field1792 / 50 + var3;
                field1755[var4++] = ((this.field1715[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1696[var4] = field1734[var6];
            field1725[var4] = field1738[var6];
            field1755[var4++] = this.field1715[arg0];
        } else {
            int var16 = field1740[var6];
            int var17 = field1710[var6];
            int var18 = this.field1715[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1763[var8 - var9];
                field1696[var4] = (((field1740[var5] - var16) * var19 >> 16) + var16) * class140.field1792 / 50 + var2;
                field1725[var4] = (((field1710[var5] - var17) * var19 >> 16) + var17) * class140.field1792 / 50 + var3;
                field1755[var4++] = ((this.field1708[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1763[var10 - var9];
                field1696[var4] = (((field1740[var7] - var16) * var20 >> 16) + var16) * class140.field1792 / 50 + var2;
                field1725[var4] = (((field1710[var7] - var17) * var20 >> 16) + var17) * class140.field1792 / 50 + var3;
                field1755[var4++] = ((this.field1737[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1696[var4] = field1734[var7];
            field1725[var4] = field1738[var7];
            field1755[var4++] = this.field1737[arg0];
        } else {
            int var21 = field1740[var7];
            int var22 = field1710[var7];
            int var23 = this.field1737[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1763[var9 - var10];
                field1696[var4] = (((field1740[var6] - var21) * var24 >> 16) + var21) * class140.field1792 / 50 + var2;
                field1725[var4] = (((field1710[var6] - var22) * var24 >> 16) + var22) * class140.field1792 / 50 + var3;
                field1755[var4++] = ((this.field1715[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1763[var8 - var10];
                field1696[var4] = (((field1740[var5] - var21) * var25 >> 16) + var21) * class140.field1792 / 50 + var2;
                field1725[var4] = (((field1710[var5] - var22) * var25 >> 16) + var22) * class140.field1792 / 50 + var3;
                field1755[var4++] = ((this.field1708[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1696[0];
        int var27 = field1696[1];
        int var28 = field1696[2];
        int var29 = field1725[0];
        int var30 = field1725[1];
        int var31 = field1725[2];
        class140.field1801 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1804 || var27 > Statics.field1804 || var28 > Statics.field1804) {
                class140.field1801 = true;
            }
            if (this.field1714 != null && this.field1714[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1713 == null || this.field1713[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1713[arg0] & 0xFF;
                    var33 = this.field1717[var32];
                    var34 = this.field1718[var32];
                    var35 = this.field1719[var32];
                }
                if (this.field1737[arg0] == -1) {
                    class140.method2891(var29, var30, var31, var26, var27, var28, this.field1708[arg0], this.field1708[arg0], this.field1708[arg0], field1740[var33], field1740[var34], field1740[var35], field1710[var33], field1710[var34], field1710[var35], field1742[var33], field1742[var34], field1742[var35], this.field1714[arg0]);
                } else {
                    class140.method2891(var29, var30, var31, var26, var27, var28, field1755[0], field1755[1], field1755[2], field1740[var33], field1740[var34], field1740[var35], field1710[var33], field1710[var34], field1710[var35], field1742[var33], field1742[var34], field1742[var35], this.field1714[arg0]);
                }
            } else if (this.field1737[arg0] == -1) {
                class140.method2884(var29, var30, var31, var26, var27, var28, field1762[this.field1708[arg0]]);
            } else {
                class140.method2890(var29, var30, var31, var26, var27, var28, field1755[0], field1755[1], field1755[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1804 || var27 > Statics.field1804 || var28 > Statics.field1804 || field1696[3] < 0 || field1696[3] > Statics.field1804) {
            class140.field1801 = true;
        }
        if (this.field1714 != null && this.field1714[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1713 == null || this.field1713[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1713[arg0] & 0xFF;
                var37 = this.field1717[var36];
                var38 = this.field1718[var36];
                var39 = this.field1719[var36];
            }
            short var40 = this.field1714[arg0];
            if (this.field1737[arg0] == -1) {
                class140.method2891(var29, var30, var31, var26, var27, var28, this.field1708[arg0], this.field1708[arg0], this.field1708[arg0], field1740[var37], field1740[var38], field1740[var39], field1710[var37], field1710[var38], field1710[var39], field1742[var37], field1742[var38], field1742[var39], var40);
                class140.method2891(var29, var31, field1725[3], var26, var28, field1696[3], this.field1708[arg0], this.field1708[arg0], this.field1708[arg0], field1740[var37], field1740[var38], field1740[var39], field1710[var37], field1710[var38], field1710[var39], field1742[var37], field1742[var38], field1742[var39], var40);
            } else {
                class140.method2891(var29, var30, var31, var26, var27, var28, field1755[0], field1755[1], field1755[2], field1740[var37], field1740[var38], field1740[var39], field1710[var37], field1710[var38], field1710[var39], field1742[var37], field1742[var38], field1742[var39], var40);
                class140.method2891(var29, var31, field1725[3], var26, var28, field1696[3], field1755[0], field1755[2], field1755[3], field1740[var37], field1740[var38], field1740[var39], field1710[var37], field1710[var38], field1710[var39], field1742[var37], field1742[var38], field1742[var39], var40);
            }
        } else if (this.field1737[arg0] == -1) {
            int var41 = field1762[this.field1708[arg0]];
            class140.method2884(var29, var30, var31, var26, var27, var28, var41);
            class140.method2884(var29, var31, field1725[3], var26, var28, field1696[3], var41);
        } else {
            class140.method2890(var29, var30, var31, var26, var27, var28, field1755[0], field1755[1], field1755[2]);
            class140.method2890(var29, var31, field1725[3], var26, var28, field1696[3], field1755[0], field1755[2], field1755[3]);
        }
    }
}
