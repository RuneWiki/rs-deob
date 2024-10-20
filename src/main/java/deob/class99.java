package deob;

@ObfuscatedName("cl")
public class class99 extends class79 {

    @ObfuscatedName("cl.a")
    public static class99 field1745 = new class99();

    @ObfuscatedName("cl.v")
    public static byte[] field1747 = new byte[1];

    @ObfuscatedName("cl.i")
    public static class99 field1698 = new class99();

    @ObfuscatedName("cl.b")
    public static byte[] field1699 = new byte[1];

    @ObfuscatedName("cl.l")
    public int field1700 = 0;

    @ObfuscatedName("cl.m")
    public int[] field1701;

    @ObfuscatedName("cl.w")
    public int[] field1702;

    @ObfuscatedName("cl.e")
    public int[] field1703;

    @ObfuscatedName("cl.n")
    public int field1704 = 0;

    @ObfuscatedName("cl.s")
    public int[] field1705;

    @ObfuscatedName("cl.k")
    public int[] field1706;

    @ObfuscatedName("cl.f")
    public int[] field1760;

    @ObfuscatedName("cl.d")
    public int[] field1740;

    @ObfuscatedName("cl.x")
    public int[] field1716;

    @ObfuscatedName("cl.o")
    public int[] field1753;

    @ObfuscatedName("cl.q")
    public byte[] field1712;

    @ObfuscatedName("cl.t")
    public byte[] field1761;

    @ObfuscatedName("cl.h")
    public byte[] field1746;

    @ObfuscatedName("cl.u")
    public short[] field1714;

    @ObfuscatedName("cl.j")
    public byte field1748 = 0;

    @ObfuscatedName("cl.g")
    public int field1762 = 0;

    @ObfuscatedName("cl.y")
    public int[] field1717;

    @ObfuscatedName("cl.p")
    public int[] field1718;

    @ObfuscatedName("cl.r")
    public int[] field1719;

    @ObfuscatedName("cl.z")
    public int[][] field1720;

    @ObfuscatedName("cl.c")
    public int[][] field1758;

    @ObfuscatedName("cl.an")
    public boolean field1722 = false;

    @ObfuscatedName("cl.as")
    public int field1723;

    @ObfuscatedName("cl.ah")
    public int field1724;

    @ObfuscatedName("cl.ar")
    public int field1725;

    @ObfuscatedName("cl.ae")
    public int field1711;

    @ObfuscatedName("cl.av")
    public int field1727;

    @ObfuscatedName("cl.aq")
    public static boolean[] field1729 = new boolean[4096];

    @ObfuscatedName("cl.am")
    public static boolean[] field1710 = new boolean[4096];

    @ObfuscatedName("cl.ax")
    public static int[] field1731 = new int[4096];

    @ObfuscatedName("cl.az")
    public static int[] field1732 = new int[4096];

    @ObfuscatedName("cl.ai")
    public static int[] field1733 = new int[4096];

    @ObfuscatedName("cl.aa")
    public static int[] field1734 = new int[4096];

    @ObfuscatedName("cl.at")
    public static int[] field1735 = new int[4096];

    @ObfuscatedName("cl.aw")
    public static int[] field1736 = new int[4096];

    @ObfuscatedName("cl.ag")
    public static int[] field1738 = new int[1600];

    @ObfuscatedName("cl.ad")
    public static int[][] field1739 = new int[1600][512];

    @ObfuscatedName("cl.au")
    public static int[] field1730 = new int[12];

    @ObfuscatedName("cl.ak")
    public static int[][] field1741 = new int[12][2000];

    @ObfuscatedName("cl.aj")
    public static int[] field1708 = new int[2000];

    @ObfuscatedName("cl.af")
    public static int[] field1726 = new int[2000];

    @ObfuscatedName("cl.ab")
    public static int[] field1744 = new int[12];

    @ObfuscatedName("cl.ac")
    public static int[] field1715 = new int[10];

    @ObfuscatedName("cl.ap")
    public static int[] field1751 = new int[10];

    @ObfuscatedName("cl.ay")
    public static int[] field1709 = new int[10];

    @ObfuscatedName("cl.bs")
    public static boolean field1743 = false;

    @ObfuscatedName("cl.bl")
    public static int field1752 = 0;

    @ObfuscatedName("cl.bp")
    public static int field1713 = 0;

    @ObfuscatedName("cl.bw")
    public static int field1754 = 0;

    @ObfuscatedName("cl.bm")
    public static int[] field1755 = new int[1000];

    @ObfuscatedName("cl.bz")
    public static int[] field1756 = class85.field1482;

    @ObfuscatedName("cl.br")
    public static int[] field1697 = class85.field1483;

    @ObfuscatedName("cl.be")
    public static int[] field1742 = class85.field1478;

    @ObfuscatedName("cl.bb")
    public static int[] field1759 = class85.field1474;

    public class99() {
    }

    public class99(class99[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1700 = 0;
        this.field1704 = 0;
        this.field1762 = 0;
        this.field1748 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class99 var8 = arg0[var7];
            if (var8 != null) {
                this.field1700 += var8.field1700;
                this.field1704 += var8.field1704;
                this.field1762 += var8.field1762;
                if (var8.field1712 == null) {
                    if (this.field1748 == -1) {
                        this.field1748 = var8.field1748;
                    }
                    if (this.field1748 != var8.field1748) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1761 != null;
                var5 |= var8.field1714 != null;
                var6 |= var8.field1746 != null;
            }
        }
        this.field1701 = new int[this.field1700];
        this.field1702 = new int[this.field1700];
        this.field1703 = new int[this.field1700];
        this.field1705 = new int[this.field1704];
        this.field1706 = new int[this.field1704];
        this.field1760 = new int[this.field1704];
        this.field1740 = new int[this.field1704];
        this.field1716 = new int[this.field1704];
        this.field1753 = new int[this.field1704];
        if (var3) {
            this.field1712 = new byte[this.field1704];
        }
        if (var4) {
            this.field1761 = new byte[this.field1704];
        }
        if (var5) {
            this.field1714 = new short[this.field1704];
        }
        if (var6) {
            this.field1746 = new byte[this.field1704];
        }
        if (this.field1762 > 0) {
            this.field1717 = new int[this.field1762];
            this.field1718 = new int[this.field1762];
            this.field1719 = new int[this.field1762];
        }
        this.field1700 = 0;
        this.field1704 = 0;
        this.field1762 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class99 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1704; var11++) {
                    this.field1705[this.field1704] = var10.field1705[var11] + this.field1700;
                    this.field1706[this.field1704] = var10.field1706[var11] + this.field1700;
                    this.field1760[this.field1704] = var10.field1760[var11] + this.field1700;
                    this.field1740[this.field1704] = var10.field1740[var11];
                    this.field1716[this.field1704] = var10.field1716[var11];
                    this.field1753[this.field1704] = var10.field1753[var11];
                    if (var3) {
                        if (var10.field1712 == null) {
                            this.field1712[this.field1704] = var10.field1748;
                        } else {
                            this.field1712[this.field1704] = var10.field1712[var11];
                        }
                    }
                    if (var4 && var10.field1761 != null) {
                        this.field1761[this.field1704] = var10.field1761[var11];
                    }
                    if (var5) {
                        if (var10.field1714 == null) {
                            this.field1714[this.field1704] = -1;
                        } else {
                            this.field1714[this.field1704] = var10.field1714[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1746 == null || var10.field1746[var11] == -1) {
                            this.field1746[this.field1704] = -1;
                        } else {
                            this.field1746[this.field1704] = (byte) (var10.field1746[var11] + this.field1762);
                        }
                    }
                    this.field1704++;
                }
                for (int var12 = 0; var12 < var10.field1762; var12++) {
                    this.field1717[this.field1762] = var10.field1717[var12] + this.field1700;
                    this.field1718[this.field1762] = var10.field1718[var12] + this.field1700;
                    this.field1719[this.field1762] = var10.field1719[var12] + this.field1700;
                    this.field1762++;
                }
                for (int var13 = 0; var13 < var10.field1700; var13++) {
                    this.field1701[this.field1700] = var10.field1701[var13];
                    this.field1702[this.field1700] = var10.field1702[var13];
                    this.field1703[this.field1700] = var10.field1703[var13];
                    this.field1700++;
                }
            }
        }
    }

    @ObfuscatedName("cl.a([[IIIIZI)Lcl;")
    public class99 method2030(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1980();
        int var7 = arg1 - this.field1725;
        int var8 = this.field1725 + arg1;
        int var9 = arg3 - this.field1725;
        int var10 = this.field1725 + arg3;
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
            var15.field1700 = this.field1700;
            var15.field1704 = this.field1704;
            var15.field1762 = this.field1762;
            var15.field1701 = this.field1701;
            var15.field1703 = this.field1703;
            var15.field1705 = this.field1705;
            var15.field1706 = this.field1706;
            var15.field1760 = this.field1760;
            var15.field1740 = this.field1740;
            var15.field1716 = this.field1716;
            var15.field1753 = this.field1753;
            var15.field1712 = this.field1712;
            var15.field1761 = this.field1761;
            var15.field1746 = this.field1746;
            var15.field1714 = this.field1714;
            var15.field1748 = this.field1748;
            var15.field1717 = this.field1717;
            var15.field1718 = this.field1718;
            var15.field1719 = this.field1719;
            var15.field1720 = this.field1720;
            var15.field1758 = this.field1758;
            var15.field1722 = this.field1722;
            var15.field1702 = new int[var15.field1700];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1700; var16++) {
                int var17 = this.field1701[var16] + arg1;
                int var18 = this.field1703[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1702[var16] = this.field1702[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1700; var26++) {
                int var27 = (-this.field1702[var26] << 16) / this.field1356;
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
                    var15.field1702[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1702[var26];
                }
            }
        }
        var15.field1723 = 0;
        return var15;
    }

    @ObfuscatedName("cl.i(Z)Lcl;")
    public class99 method1977(boolean arg0) {
        if (!arg0 && field1747.length < this.field1704) {
            field1747 = new byte[this.field1704 + 100];
        }
        return this.method1979(arg0, field1745, field1747);
    }

    @ObfuscatedName("cl.b(Z)Lcl;")
    public class99 method1997(boolean arg0) {
        if (!arg0 && field1699.length < this.field1704) {
            field1699 = new byte[this.field1704 + 100];
        }
        return this.method1979(arg0, field1698, field1699);
    }

    @ObfuscatedName("cl.l(ZLcl;[B)Lcl;")
    public class99 method1979(boolean arg0, class99 arg1, byte[] arg2) {
        arg1.field1700 = this.field1700;
        arg1.field1704 = this.field1704;
        arg1.field1762 = this.field1762;
        if (arg1.field1701 == null || arg1.field1701.length < this.field1700) {
            arg1.field1701 = new int[this.field1700 + 100];
            arg1.field1702 = new int[this.field1700 + 100];
            arg1.field1703 = new int[this.field1700 + 100];
        }
        for (int var4 = 0; var4 < this.field1700; var4++) {
            arg1.field1701[var4] = this.field1701[var4];
            arg1.field1702[var4] = this.field1702[var4];
            arg1.field1703[var4] = this.field1703[var4];
        }
        if (arg0) {
            arg1.field1761 = this.field1761;
        } else {
            arg1.field1761 = arg2;
            if (this.field1761 == null) {
                for (int var5 = 0; var5 < this.field1704; var5++) {
                    arg1.field1761[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1704; var6++) {
                    arg1.field1761[var6] = this.field1761[var6];
                }
            }
        }
        arg1.field1705 = this.field1705;
        arg1.field1706 = this.field1706;
        arg1.field1760 = this.field1760;
        arg1.field1740 = this.field1740;
        arg1.field1716 = this.field1716;
        arg1.field1753 = this.field1753;
        arg1.field1712 = this.field1712;
        arg1.field1746 = this.field1746;
        arg1.field1714 = this.field1714;
        arg1.field1748 = this.field1748;
        arg1.field1717 = this.field1717;
        arg1.field1718 = this.field1718;
        arg1.field1719 = this.field1719;
        arg1.field1720 = this.field1720;
        arg1.field1758 = this.field1758;
        arg1.field1722 = this.field1722;
        arg1.field1723 = 0;
        return arg1;
    }

    @ObfuscatedName("cl.m()V")
    public void method1980() {
        if (this.field1723 == 1) {
            return;
        }
        this.field1723 = 1;
        this.field1356 = 0;
        this.field1724 = 0;
        this.field1725 = 0;
        for (int var1 = 0; var1 < this.field1700; var1++) {
            int var2 = this.field1701[var1];
            int var3 = this.field1702[var1];
            int var4 = this.field1703[var1];
            if (-var3 > this.field1356) {
                this.field1356 = -var3;
            }
            if (var3 > this.field1724) {
                this.field1724 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1725) {
                this.field1725 = var5;
            }
        }
        this.field1725 = (int) (Math.sqrt((double) this.field1725) + 0.99D);
        this.field1727 = (int) (Math.sqrt((double) (this.field1356 * this.field1356 + this.field1725 * this.field1725)) + 0.99D);
        this.field1711 = this.field1727 + (int) (Math.sqrt((double) (this.field1725 * this.field1725 + this.field1724 * this.field1724)) + 0.99D);
    }

    @ObfuscatedName("cl.e()V")
    public void method1981() {
        if (this.field1723 == 2) {
            return;
        }
        this.field1723 = 2;
        this.field1725 = 0;
        for (int var1 = 0; var1 < this.field1700; var1++) {
            int var2 = this.field1701[var1];
            int var3 = this.field1702[var1];
            int var4 = this.field1703[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1725) {
                this.field1725 = var5;
            }
        }
        this.field1725 = (int) (Math.sqrt((double) this.field1725) + 0.99D);
        this.field1727 = this.field1725;
        this.field1711 = this.field1725 + this.field1725;
    }

    @ObfuscatedName("cl.n()I")
    public int method2020() {
        this.method1980();
        return this.field1725;
    }

    @ObfuscatedName("cl.s(Lcx;I)V")
    public void method1983(class97 arg0, int arg1) {
        if (this.field1720 == null || arg1 == -1) {
            return;
        }
        class82 var3 = arg0.field1671[arg1];
        class96 var4 = var3.field1441;
        Statics.field1696 = 0;
        Statics.field1749 = 0;
        Statics.field1750 = 0;
        for (int var5 = 0; var5 < var3.field1437; var5++) {
            int var6 = var3.field1432[var5];
            this.method1989(var4.field1665[var6], var4.field1663[var6], var3.field1439[var5], var3.field1438[var5], var3.field1436[var5]);
        }
        this.field1723 = 0;
    }

    @ObfuscatedName("cl.k(Lcx;ILcx;I[I)V")
    public void method2029(class97 arg0, int arg1, class97 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1983(arg0, arg1);
            return;
        }
        class82 var6 = arg0.field1671[arg1];
        class82 var7 = arg2.field1671[arg3];
        class96 var8 = var6.field1441;
        Statics.field1696 = 0;
        Statics.field1749 = 0;
        Statics.field1750 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1437; var11++) {
            int var12 = var6.field1432[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1665[var12] == 0) {
                this.method1989(var8.field1665[var12], var8.field1663[var12], var6.field1439[var11], var6.field1438[var11], var6.field1436[var11]);
            }
        }
        Statics.field1696 = 0;
        Statics.field1749 = 0;
        Statics.field1750 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1437; var15++) {
            int var16 = var7.field1432[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1665[var16] == 0) {
                this.method1989(var8.field1665[var16], var8.field1663[var16], var7.field1439[var15], var7.field1438[var15], var7.field1436[var15]);
            }
        }
        this.field1723 = 0;
    }

    @ObfuscatedName("cl.f(I[IIII)V")
    public void method1989(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1696 = 0;
            Statics.field1749 = 0;
            Statics.field1750 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1720.length) {
                    int[] var10 = this.field1720[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1696 += this.field1701[var12];
                        Statics.field1749 += this.field1702[var12];
                        Statics.field1750 += this.field1703[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1696 = Statics.field1696 / var7 + arg2;
                Statics.field1749 = Statics.field1749 / var7 + arg3;
                Statics.field1750 = Statics.field1750 / var7 + arg4;
            } else {
                Statics.field1696 = arg2;
                Statics.field1749 = arg3;
                Statics.field1750 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1720.length) {
                    int[] var15 = this.field1720[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1701[var17] += arg2;
                        this.field1702[var17] += arg3;
                        this.field1703[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1720.length) {
                    int[] var20 = this.field1720[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1701[var22] -= Statics.field1696;
                        this.field1702[var22] -= Statics.field1749;
                        this.field1703[var22] -= Statics.field1750;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1756[var25];
                            int var27 = field1697[var25];
                            int var28 = this.field1702[var22] * var26 + this.field1701[var22] * var27 >> 16;
                            this.field1702[var22] = this.field1702[var22] * var27 - this.field1701[var22] * var26 >> 16;
                            this.field1701[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1756[var23];
                            int var30 = field1697[var23];
                            int var31 = this.field1702[var22] * var30 - this.field1703[var22] * var29 >> 16;
                            this.field1703[var22] = this.field1703[var22] * var30 + this.field1702[var22] * var29 >> 16;
                            this.field1702[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1756[var24];
                            int var33 = field1697[var24];
                            int var34 = this.field1703[var22] * var32 + this.field1701[var22] * var33 >> 16;
                            this.field1703[var22] = this.field1703[var22] * var33 - this.field1701[var22] * var32 >> 16;
                            this.field1701[var22] = var34;
                        }
                        this.field1701[var22] += Statics.field1696;
                        this.field1702[var22] += Statics.field1749;
                        this.field1703[var22] += Statics.field1750;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1720.length) {
                    int[] var37 = this.field1720[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1701[var39] -= Statics.field1696;
                        this.field1702[var39] -= Statics.field1749;
                        this.field1703[var39] -= Statics.field1750;
                        this.field1701[var39] = this.field1701[var39] * arg2 / 128;
                        this.field1702[var39] = this.field1702[var39] * arg3 / 128;
                        this.field1703[var39] = this.field1703[var39] * arg4 / 128;
                        this.field1701[var39] += Statics.field1696;
                        this.field1702[var39] += Statics.field1749;
                        this.field1703[var39] += Statics.field1750;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1758 != null && this.field1761 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1758.length) {
                    int[] var42 = this.field1758[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1761[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1761[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cl.d()V")
    public void method1985() {
        for (int var1 = 0; var1 < this.field1700; var1++) {
            int var2 = this.field1701[var1];
            this.field1701[var1] = this.field1703[var1];
            this.field1703[var1] = -var2;
        }
        this.field1723 = 0;
    }

    @ObfuscatedName("cl.x()V")
    public void method1986() {
        for (int var1 = 0; var1 < this.field1700; var1++) {
            this.field1701[var1] = -this.field1701[var1];
            this.field1703[var1] = -this.field1703[var1];
        }
        this.field1723 = 0;
    }

    @ObfuscatedName("cl.o()V")
    public void method1975() {
        for (int var1 = 0; var1 < this.field1700; var1++) {
            int var2 = this.field1703[var1];
            this.field1703[var1] = this.field1701[var1];
            this.field1701[var1] = -var2;
        }
        this.field1723 = 0;
    }

    @ObfuscatedName("cl.q(I)V")
    public void method1988(int arg0) {
        int var2 = field1756[arg0];
        int var3 = field1697[arg0];
        for (int var4 = 0; var4 < this.field1700; var4++) {
            int var5 = this.field1702[var4] * var3 - this.field1703[var4] * var2 >> 16;
            this.field1703[var4] = this.field1703[var4] * var3 + this.field1702[var4] * var2 >> 16;
            this.field1702[var4] = var5;
        }
        this.field1723 = 0;
    }

    @ObfuscatedName("cl.t(III)V")
    public void method2008(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1700; var4++) {
            this.field1701[var4] += arg0;
            this.field1702[var4] += arg1;
            this.field1703[var4] += arg2;
        }
        this.field1723 = 0;
    }

    @ObfuscatedName("cl.h(III)V")
    public void method2036(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1700; var4++) {
            this.field1701[var4] = this.field1701[var4] * arg0 / 128;
            this.field1702[var4] = this.field1702[var4] * arg1 / 128;
            this.field1703[var4] = this.field1703[var4] * arg2 / 128;
        }
        this.field1723 = 0;
    }

    @ObfuscatedName("cl.u(IIIIIII)V")
    public final void method1976(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1738[0] = -1;
        if (this.field1723 != 2 && this.field1723 != 1) {
            this.method1981();
        }
        int var8 = Statics.field1469;
        int var9 = Statics.field1470;
        int var10 = field1756[arg0];
        int var11 = field1697[arg0];
        int var12 = field1756[arg1];
        int var13 = field1697[arg1];
        int var14 = field1756[arg2];
        int var15 = field1697[arg2];
        int var16 = field1756[arg3];
        int var17 = field1697[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1700; var19++) {
            int var20 = this.field1701[var19];
            int var21 = this.field1702[var19];
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
            field1733[var19] = var30 - var18;
            field1731[var19] = (var26 << 9) / var30 + var8;
            field1732[var19] = (var29 << 9) / var30 + var9;
            if (this.field1762 > 0) {
                field1734[var19] = var26;
                field1735[var19] = var29;
                field1736[var19] = var30;
            }
        }
        try {
            this.method1993(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cl.j(IIIIIIII)V")
    public final void method2014(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1738[0] = -1;
        if (this.field1723 != 2 && this.field1723 != 1) {
            this.method1981();
        }
        int var9 = Statics.field1469;
        int var10 = Statics.field1470;
        int var11 = field1756[arg0];
        int var12 = field1697[arg0];
        int var13 = field1756[arg1];
        int var14 = field1697[arg1];
        int var15 = field1756[arg2];
        int var16 = field1697[arg2];
        int var17 = field1756[arg3];
        int var18 = field1697[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1700; var20++) {
            int var21 = this.field1701[var20];
            int var22 = this.field1702[var20];
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
            field1733[var20] = var31 - var19;
            field1731[var20] = (var27 << 9) / arg7 + var9;
            field1732[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1762 > 0) {
                field1734[var20] = var27;
                field1735[var20] = var30;
                field1736[var20] = var31;
            }
        }
        try {
            this.method1993(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cl.r(IIIIIIIII)V")
    public void method1586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1738[0] = -1;
        if (this.field1723 != 1) {
            this.method1980();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1725 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1725 << 9;
        if (var15 / var13 >= Statics.field1475) {
            return;
        }
        int var16 = this.field1725 + var14 << 9;
        if (var16 / var13 <= Statics.field1460) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1725 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1476) {
            return;
        }
        int var20 = (this.field1356 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1477) {
            return;
        }
        int var22 = (this.field1356 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1762 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1743) {
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
            int var32 = field1752 - Statics.field1469;
            int var33 = field1713 - Statics.field1470;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1722) {
                    field1755[field1754++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1469;
        int var35 = Statics.field1470;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1756[arg0];
            var37 = field1697[arg0];
        }
        for (int var38 = 0; var38 < this.field1700; var38++) {
            int var39 = this.field1701[var38];
            int var40 = this.field1702[var38];
            int var41 = this.field1703[var38];
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
            field1733[var38] = var50 - var11;
            if (var50 >= 50) {
                field1731[var38] = (var46 << 9) / var50 + var34;
                field1732[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1731[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1734[var38] = var46;
                field1735[var38] = var49;
                field1736[var38] = var50;
            }
        }
        try {
            this.method1993(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cl.g(ZZI)V")
    public final void method1993(boolean arg0, boolean arg1, int arg2) {
        if (this.field1711 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1711; var4++) {
            field1738[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1704; var5++) {
            if (this.field1753[var5] != -2) {
                int var6 = this.field1705[var5];
                int var7 = this.field1706[var5];
                int var8 = this.field1760[var5];
                int var9 = field1731[var6];
                int var10 = field1731[var7];
                int var11 = field1731[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1734[var6];
                    int var13 = field1734[var7];
                    int var14 = field1734[var8];
                    int var15 = field1735[var6];
                    int var16 = field1735[var7];
                    int var17 = field1735[var8];
                    int var18 = field1736[var6];
                    int var19 = field1736[var7];
                    int var20 = field1736[var8];
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
                        field1710[var5] = true;
                        int var30 = (field1733[var6] + field1733[var7] + field1733[var8]) / 3 + this.field1727;
                        field1739[var30][field1738[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method1996(field1752, field1713, field1732[var6], field1732[var7], field1732[var8], var9, var10, var11)) {
                        field1755[field1754++] = arg2;
                        arg1 = false;
                    }
                    if ((field1732[var8] - field1732[var7]) * (var9 - var10) - (field1732[var6] - field1732[var7]) * (var11 - var10) > 0) {
                        field1710[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1471 && var10 <= Statics.field1471 && var11 <= Statics.field1471) {
                            field1729[var5] = false;
                        } else {
                            field1729[var5] = true;
                        }
                        int var31 = (field1733[var6] + field1733[var7] + field1733[var8]) / 3 + this.field1727;
                        field1739[var31][field1738[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1712 == null) {
            for (int var32 = this.field1711 - 1; var32 >= 0; var32--) {
                int var33 = field1738[var32];
                if (var33 > 0) {
                    int[] var34 = field1739[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method1994(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1730[var36] = 0;
            field1744[var36] = 0;
        }
        for (int var37 = this.field1711 - 1; var37 >= 0; var37--) {
            int var38 = field1738[var37];
            if (var38 > 0) {
                int[] var39 = field1739[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1712[var41];
                    int var43 = field1730[var42]++;
                    field1741[var42][var43] = var41;
                    if (var42 < 10) {
                        field1744[var42] += var37;
                    } else if (var42 == 10) {
                        field1708[var43] = var37;
                    } else {
                        field1726[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1730[1] > 0 || field1730[2] > 0) {
            var44 = (field1744[1] + field1744[2]) / (field1730[1] + field1730[2]);
        }
        int var45 = 0;
        if (field1730[3] > 0 || field1730[4] > 0) {
            var45 = (field1744[3] + field1744[4]) / (field1730[3] + field1730[4]);
        }
        int var46 = 0;
        if (field1730[6] > 0 || field1730[8] > 0) {
            var46 = (field1744[6] + field1744[8]) / (field1730[6] + field1730[8]);
        }
        int var47 = 0;
        int var48 = field1730[10];
        int[] var49 = field1741[10];
        int[] var50 = field1708;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1730[11];
            var49 = field1741[11];
            var50 = field1726;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method1994(var49[var47++]);
                if (var47 == var48 && field1741[11] != var49) {
                    var47 = 0;
                    var48 = field1730[11];
                    var49 = field1741[11];
                    var50 = field1726;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method1994(var49[var47++]);
                if (var47 == var48 && field1741[11] != var49) {
                    var47 = 0;
                    var48 = field1730[11];
                    var49 = field1741[11];
                    var50 = field1726;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method1994(var49[var47++]);
                if (var47 == var48 && field1741[11] != var49) {
                    var47 = 0;
                    var48 = field1730[11];
                    var49 = field1741[11];
                    var50 = field1726;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1730[var52];
            int[] var54 = field1741[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method1994(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method1994(var49[var47++]);
            if (var47 == var48 && field1741[11] != var49) {
                var47 = 0;
                var49 = field1741[11];
                var48 = field1730[11];
                var50 = field1726;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cl.y(I)V")
    public final void method1994(int arg0) {
        if (field1710[arg0]) {
            this.method1995(arg0);
            return;
        }
        int var2 = this.field1705[arg0];
        int var3 = this.field1706[arg0];
        int var4 = this.field1760[arg0];
        class85.field1481 = field1729[arg0];
        if (this.field1761 == null) {
            class85.field1463 = 0;
        } else {
            class85.field1463 = this.field1761[arg0] & 0xFF;
        }
        if (this.field1714 != null && this.field1714[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1746 == null || this.field1746[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1746[arg0] & 0xFF;
                var6 = this.field1717[var5];
                var7 = this.field1718[var5];
                var8 = this.field1719[var5];
            }
            if (this.field1753[arg0] == -1) {
                class85.method1772(field1732[var2], field1732[var3], field1732[var4], field1731[var2], field1731[var3], field1731[var4], this.field1740[arg0], this.field1740[arg0], this.field1740[arg0], field1734[var6], field1734[var7], field1734[var8], field1735[var6], field1735[var7], field1735[var8], field1736[var6], field1736[var7], field1736[var8], this.field1714[arg0]);
            } else {
                class85.method1772(field1732[var2], field1732[var3], field1732[var4], field1731[var2], field1731[var3], field1731[var4], this.field1740[arg0], this.field1716[arg0], this.field1753[arg0], field1734[var6], field1734[var7], field1734[var8], field1735[var6], field1735[var7], field1735[var8], field1736[var6], field1736[var7], field1736[var8], this.field1714[arg0]);
            }
        } else if (this.field1753[arg0] == -1) {
            class85.method1809(field1732[var2], field1732[var3], field1732[var4], field1731[var2], field1731[var3], field1731[var4], field1742[this.field1740[arg0]]);
        } else {
            class85.method1778(field1732[var2], field1732[var3], field1732[var4], field1731[var2], field1731[var3], field1731[var4], this.field1740[arg0], this.field1716[arg0], this.field1753[arg0]);
        }
    }

    @ObfuscatedName("cl.p(I)V")
    public final void method1995(int arg0) {
        int var2 = Statics.field1469;
        int var3 = Statics.field1470;
        int var4 = 0;
        int var5 = this.field1705[arg0];
        int var6 = this.field1706[arg0];
        int var7 = this.field1760[arg0];
        int var8 = field1736[var5];
        int var9 = field1736[var6];
        int var10 = field1736[var7];
        if (this.field1761 == null) {
            class85.field1463 = 0;
        } else {
            class85.field1463 = this.field1761[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1715[var4] = field1731[var5];
            field1751[var4] = field1732[var5];
            field1709[var4++] = this.field1740[arg0];
        } else {
            int var11 = field1734[var5];
            int var12 = field1735[var5];
            int var13 = this.field1740[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1759[var10 - var8];
                field1715[var4] = (((field1734[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1751[var4] = (((field1735[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1709[var4++] = ((this.field1753[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1759[var9 - var8];
                field1715[var4] = (((field1734[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1751[var4] = (((field1735[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1709[var4++] = ((this.field1716[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1715[var4] = field1731[var6];
            field1751[var4] = field1732[var6];
            field1709[var4++] = this.field1716[arg0];
        } else {
            int var16 = field1734[var6];
            int var17 = field1735[var6];
            int var18 = this.field1716[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1759[var8 - var9];
                field1715[var4] = (((field1734[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1751[var4] = (((field1735[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1709[var4++] = ((this.field1740[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1759[var10 - var9];
                field1715[var4] = (((field1734[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1751[var4] = (((field1735[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1709[var4++] = ((this.field1753[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1715[var4] = field1731[var7];
            field1751[var4] = field1732[var7];
            field1709[var4++] = this.field1753[arg0];
        } else {
            int var21 = field1734[var7];
            int var22 = field1735[var7];
            int var23 = this.field1753[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1759[var9 - var10];
                field1715[var4] = (((field1734[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1751[var4] = (((field1735[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1709[var4++] = ((this.field1716[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1759[var8 - var10];
                field1715[var4] = (((field1734[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1751[var4] = (((field1735[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1709[var4++] = ((this.field1740[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1715[0];
        int var27 = field1715[1];
        int var28 = field1715[2];
        int var29 = field1751[0];
        int var30 = field1751[1];
        int var31 = field1751[2];
        class85.field1481 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1471 || var27 > Statics.field1471 || var28 > Statics.field1471) {
                class85.field1481 = true;
            }
            if (this.field1714 != null && this.field1714[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1746 == null || this.field1746[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1746[arg0] & 0xFF;
                    var33 = this.field1717[var32];
                    var34 = this.field1718[var32];
                    var35 = this.field1719[var32];
                }
                if (this.field1753[arg0] == -1) {
                    class85.method1772(var29, var30, var31, var26, var27, var28, this.field1740[arg0], this.field1740[arg0], this.field1740[arg0], field1734[var33], field1734[var34], field1734[var35], field1735[var33], field1735[var34], field1735[var35], field1736[var33], field1736[var34], field1736[var35], this.field1714[arg0]);
                } else {
                    class85.method1772(var29, var30, var31, var26, var27, var28, field1709[0], field1709[1], field1709[2], field1734[var33], field1734[var34], field1734[var35], field1735[var33], field1735[var34], field1735[var35], field1736[var33], field1736[var34], field1736[var35], this.field1714[arg0]);
                }
            } else if (this.field1753[arg0] == -1) {
                class85.method1809(var29, var30, var31, var26, var27, var28, field1742[this.field1740[arg0]]);
            } else {
                class85.method1778(var29, var30, var31, var26, var27, var28, field1709[0], field1709[1], field1709[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1471 || var27 > Statics.field1471 || var28 > Statics.field1471 || field1715[3] < 0 || field1715[3] > Statics.field1471) {
            class85.field1481 = true;
        }
        if (this.field1714 != null && this.field1714[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1746 == null || this.field1746[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1746[arg0] & 0xFF;
                var37 = this.field1717[var36];
                var38 = this.field1718[var36];
                var39 = this.field1719[var36];
            }
            short var40 = this.field1714[arg0];
            if (this.field1753[arg0] == -1) {
                class85.method1772(var29, var30, var31, var26, var27, var28, this.field1740[arg0], this.field1740[arg0], this.field1740[arg0], field1734[var37], field1734[var38], field1734[var39], field1735[var37], field1735[var38], field1735[var39], field1736[var37], field1736[var38], field1736[var39], var40);
                class85.method1772(var29, var31, field1751[3], var26, var28, field1715[3], this.field1740[arg0], this.field1740[arg0], this.field1740[arg0], field1734[var37], field1734[var38], field1734[var39], field1735[var37], field1735[var38], field1735[var39], field1736[var37], field1736[var38], field1736[var39], var40);
            } else {
                class85.method1772(var29, var30, var31, var26, var27, var28, field1709[0], field1709[1], field1709[2], field1734[var37], field1734[var38], field1734[var39], field1735[var37], field1735[var38], field1735[var39], field1736[var37], field1736[var38], field1736[var39], var40);
                class85.method1772(var29, var31, field1751[3], var26, var28, field1715[3], field1709[0], field1709[2], field1709[3], field1734[var37], field1734[var38], field1734[var39], field1735[var37], field1735[var38], field1735[var39], field1736[var37], field1736[var38], field1736[var39], var40);
            }
        } else if (this.field1753[arg0] == -1) {
            int var41 = field1742[this.field1740[arg0]];
            class85.method1809(var29, var30, var31, var26, var27, var28, var41);
            class85.method1809(var29, var31, field1751[3], var26, var28, field1715[3], var41);
        } else {
            class85.method1778(var29, var30, var31, var26, var27, var28, field1709[0], field1709[1], field1709[2]);
            class85.method1778(var29, var31, field1751[3], var26, var28, field1715[3], field1709[0], field1709[2], field1709[3]);
        }
    }

    @ObfuscatedName("cl.as(IIIIIIII)Z")
    public final boolean method1996(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
