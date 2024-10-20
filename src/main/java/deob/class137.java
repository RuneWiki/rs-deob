package deob;

@ObfuscatedName("ef")
public class class137 extends class145 {

    @ObfuscatedName("ef.m")
    public static class137 field1763 = new class137();

    @ObfuscatedName("ef.o")
    public static byte[] field1698 = new byte[1];

    @ObfuscatedName("ef.q")
    public static class137 field1735 = new class137();

    @ObfuscatedName("ef.j")
    public static byte[] field1697 = new byte[1];

    @ObfuscatedName("ef.p")
    public int field1701 = 0;

    @ObfuscatedName("ef.g")
    public int[] field1702;

    @ObfuscatedName("ef.n")
    public int[] field1703;

    @ObfuscatedName("ef.u")
    public int[] field1704;

    @ObfuscatedName("ef.a")
    public int field1705 = 0;

    @ObfuscatedName("ef.z")
    public int[] field1761;

    @ObfuscatedName("ef.w")
    public int[] field1707;

    @ObfuscatedName("ef.y")
    public int[] field1708;

    @ObfuscatedName("ef.c")
    public int[] field1709;

    @ObfuscatedName("ef.h")
    public int[] field1710;

    @ObfuscatedName("ef.k")
    public int[] field1711;

    @ObfuscatedName("ef.r")
    public byte[] field1712;

    @ObfuscatedName("ef.s")
    public byte[] field1713;

    @ObfuscatedName("ef.v")
    public byte[] field1732;

    @ObfuscatedName("ef.d")
    public short[] field1715;

    @ObfuscatedName("ef.e")
    public byte field1716 = 0;

    @ObfuscatedName("ef.l")
    public int field1731 = 0;

    @ObfuscatedName("ef.t")
    public int[] field1718;

    @ObfuscatedName("ef.x")
    public int[] field1719;

    @ObfuscatedName("ef.b")
    public int[] field1720;

    @ObfuscatedName("ef.i")
    public int[][] field1721;

    @ObfuscatedName("ef.f")
    public int[][] field1749;

    @ObfuscatedName("ef.ah")
    public boolean field1755 = false;

    @ObfuscatedName("ef.ai")
    public int field1724;

    @ObfuscatedName("ef.ao")
    public int field1725;

    @ObfuscatedName("ef.ae")
    public int field1726;

    @ObfuscatedName("ef.ax")
    public int field1727;

    @ObfuscatedName("ef.ag")
    public int field1728;

    @ObfuscatedName("ef.ab")
    public int field1744;

    @ObfuscatedName("ef.am")
    public int field1706;

    @ObfuscatedName("ef.ak")
    public int field1750;

    @ObfuscatedName("ef.ad")
    public int field1754 = -1;

    @ObfuscatedName("ef.as")
    public int field1733 = -1;

    @ObfuscatedName("ef.ar")
    public int field1734 = -1;

    @ObfuscatedName("ef.al")
    public static boolean[] field1736 = new boolean[4700];

    @ObfuscatedName("ef.an")
    public static boolean[] field1753 = new boolean[4700];

    @ObfuscatedName("ef.ac")
    public static int[] field1738 = new int[4700];

    @ObfuscatedName("ef.av")
    public static int[] field1739 = new int[4700];

    @ObfuscatedName("ef.af")
    public static int[] field1740 = new int[4700];

    @ObfuscatedName("ef.at")
    public static int[] field1741 = new int[4700];

    @ObfuscatedName("ef.aa")
    public static int[] field1737 = new int[4700];

    @ObfuscatedName("ef.aw")
    public static int[] field1743 = new int[4700];

    @ObfuscatedName("ef.aq")
    public static int[] field1745 = new int[1600];

    @ObfuscatedName("ef.ay")
    public static int[][] field1746 = new int[1600][512];

    @ObfuscatedName("ef.au")
    public static int[] field1700 = new int[12];

    @ObfuscatedName("ef.aj")
    public static int[][] field1748 = new int[12][2000];

    @ObfuscatedName("ef.bk")
    public static int[] field1699 = new int[2000];

    @ObfuscatedName("ef.bh")
    public static int[] field1723 = new int[2000];

    @ObfuscatedName("ef.bg")
    public static int[] field1751 = new int[12];

    @ObfuscatedName("ef.be")
    public static int[] field1752 = new int[10];

    @ObfuscatedName("ef.bf")
    public static int[] field1717 = new int[10];

    @ObfuscatedName("ef.ba")
    public static int[] field1729 = new int[10];

    @ObfuscatedName("ef.bq")
    public static boolean field1714 = true;

    @ObfuscatedName("ef.bo")
    public static int[] field1730 = class140.field1812;

    @ObfuscatedName("ef.bp")
    public static int[] field1762 = class140.field1813;

    @ObfuscatedName("ef.bm")
    public static int[] field1758 = class140.field1789;

    @ObfuscatedName("ef.bl")
    public static int[] field1764 = class140.field1792;

    public class137() {
    }

    public class137(class137[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1701 = 0;
        this.field1705 = 0;
        this.field1731 = 0;
        this.field1716 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class137 var8 = arg0[var7];
            if (var8 != null) {
                this.field1701 += var8.field1701;
                this.field1705 += var8.field1705;
                this.field1731 += var8.field1731;
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
                var5 |= var8.field1715 != null;
                var6 |= var8.field1732 != null;
            }
        }
        this.field1702 = new int[this.field1701];
        this.field1703 = new int[this.field1701];
        this.field1704 = new int[this.field1701];
        this.field1761 = new int[this.field1705];
        this.field1707 = new int[this.field1705];
        this.field1708 = new int[this.field1705];
        this.field1709 = new int[this.field1705];
        this.field1710 = new int[this.field1705];
        this.field1711 = new int[this.field1705];
        if (var3) {
            this.field1712 = new byte[this.field1705];
        }
        if (var4) {
            this.field1713 = new byte[this.field1705];
        }
        if (var5) {
            this.field1715 = new short[this.field1705];
        }
        if (var6) {
            this.field1732 = new byte[this.field1705];
        }
        if (this.field1731 > 0) {
            this.field1718 = new int[this.field1731];
            this.field1719 = new int[this.field1731];
            this.field1720 = new int[this.field1731];
        }
        this.field1701 = 0;
        this.field1705 = 0;
        this.field1731 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class137 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1705; var11++) {
                    this.field1761[this.field1705] = var10.field1761[var11] + this.field1701;
                    this.field1707[this.field1705] = var10.field1707[var11] + this.field1701;
                    this.field1708[this.field1705] = var10.field1708[var11] + this.field1701;
                    this.field1709[this.field1705] = var10.field1709[var11];
                    this.field1710[this.field1705] = var10.field1710[var11];
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
                        if (var10.field1715 == null) {
                            this.field1715[this.field1705] = -1;
                        } else {
                            this.field1715[this.field1705] = var10.field1715[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1732 == null || var10.field1732[var11] == -1) {
                            this.field1732[this.field1705] = -1;
                        } else {
                            this.field1732[this.field1705] = (byte) (var10.field1732[var11] + this.field1731);
                        }
                    }
                    this.field1705++;
                }
                for (int var12 = 0; var12 < var10.field1731; var12++) {
                    this.field1718[this.field1731] = var10.field1718[var12] + this.field1701;
                    this.field1719[this.field1731] = var10.field1719[var12] + this.field1701;
                    this.field1720[this.field1731] = var10.field1720[var12] + this.field1701;
                    this.field1731++;
                }
                for (int var13 = 0; var13 < var10.field1701; var13++) {
                    this.field1702[this.field1701] = var10.field1702[var13];
                    this.field1703[this.field1701] = var10.field1703[var13];
                    this.field1704[this.field1701] = var10.field1704[var13];
                    this.field1701++;
                }
            }
        }
    }

    @ObfuscatedName("ef.m([[IIIIZI)Lef;")
    public class137 method2706(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2711();
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
        class137 var15;
        if (arg4) {
            var15 = new class137();
            var15.field1701 = this.field1701;
            var15.field1705 = this.field1705;
            var15.field1731 = this.field1731;
            var15.field1702 = this.field1702;
            var15.field1704 = this.field1704;
            var15.field1761 = this.field1761;
            var15.field1707 = this.field1707;
            var15.field1708 = this.field1708;
            var15.field1709 = this.field1709;
            var15.field1710 = this.field1710;
            var15.field1711 = this.field1711;
            var15.field1712 = this.field1712;
            var15.field1713 = this.field1713;
            var15.field1732 = this.field1732;
            var15.field1715 = this.field1715;
            var15.field1716 = this.field1716;
            var15.field1718 = this.field1718;
            var15.field1719 = this.field1719;
            var15.field1720 = this.field1720;
            var15.field1721 = this.field1721;
            var15.field1749 = this.field1749;
            var15.field1755 = this.field1755;
            var15.field1703 = new int[var15.field1701];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1701; var16++) {
                int var17 = this.field1702[var16] + arg1;
                int var18 = this.field1704[var16] + arg3;
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
                int var27 = (-this.field1703[var26] << 16) / this.field1898;
                if (var27 < arg5) {
                    int var28 = this.field1702[var26] + arg1;
                    int var29 = this.field1704[var26] + arg3;
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
        var15.method2714();
        return var15;
    }

    @ObfuscatedName("ef.o(Z)Lef;")
    public class137 method2770(boolean arg0) {
        if (!arg0 && field1698.length < this.field1705) {
            field1698 = new byte[this.field1705 + 100];
        }
        return this.method2772(arg0, field1763, field1698);
    }

    @ObfuscatedName("ef.q(Z)Lef;")
    public class137 method2762(boolean arg0) {
        if (!arg0 && field1697.length < this.field1705) {
            field1697 = new byte[this.field1705 + 100];
        }
        return this.method2772(arg0, field1735, field1697);
    }

    @ObfuscatedName("ef.j(ZLef;[B)Lef;")
    public class137 method2772(boolean arg0, class137 arg1, byte[] arg2) {
        arg1.field1701 = this.field1701;
        arg1.field1705 = this.field1705;
        arg1.field1731 = this.field1731;
        if (arg1.field1702 == null || arg1.field1702.length < this.field1701) {
            arg1.field1702 = new int[this.field1701 + 100];
            arg1.field1703 = new int[this.field1701 + 100];
            arg1.field1704 = new int[this.field1701 + 100];
        }
        for (int var4 = 0; var4 < this.field1701; var4++) {
            arg1.field1702[var4] = this.field1702[var4];
            arg1.field1703[var4] = this.field1703[var4];
            arg1.field1704[var4] = this.field1704[var4];
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
        arg1.field1761 = this.field1761;
        arg1.field1707 = this.field1707;
        arg1.field1708 = this.field1708;
        arg1.field1709 = this.field1709;
        arg1.field1710 = this.field1710;
        arg1.field1711 = this.field1711;
        arg1.field1712 = this.field1712;
        arg1.field1732 = this.field1732;
        arg1.field1715 = this.field1715;
        arg1.field1716 = this.field1716;
        arg1.field1718 = this.field1718;
        arg1.field1719 = this.field1719;
        arg1.field1720 = this.field1720;
        arg1.field1721 = this.field1721;
        arg1.field1749 = this.field1749;
        arg1.field1755 = this.field1755;
        arg1.method2714();
        return arg1;
    }

    @ObfuscatedName("ef.p(I)V")
    public void method2764(int arg0) {
        if (this.field1754 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1762[arg0];
        int var9 = field1730[arg0];
        for (int var10 = 0; var10 < this.field1701; var10++) {
            int var11 = class140.method2845(this.field1702[var10], this.field1704[var10], var8, var9);
            int var12 = this.field1703[var10];
            int var13 = class140.method2832(this.field1702[var10], this.field1704[var10], var8, var9);
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
        this.field1744 = (var2 + var5) / 2;
        this.field1706 = (var3 + var6) / 2;
        this.field1750 = (var4 + var7) / 2;
        this.field1754 = (var5 - var2 + 1) / 2;
        this.field1733 = (var6 - var3 + 1) / 2;
        this.field1734 = (var7 - var4 + 1) / 2;
        if (this.field1754 < 32) {
            this.field1754 = 32;
        }
        if (this.field1734 < 32) {
            this.field1734 = 32;
        }
        if (this.field1755) {
            this.field1754 += 8;
            this.field1734 += 8;
        }
    }

    @ObfuscatedName("ef.g()V")
    public void method2711() {
        if (this.field1724 == 1) {
            return;
        }
        this.field1724 = 1;
        this.field1898 = 0;
        this.field1725 = 0;
        this.field1726 = 0;
        for (int var1 = 0; var1 < this.field1701; var1++) {
            int var2 = this.field1702[var1];
            int var3 = this.field1703[var1];
            int var4 = this.field1704[var1];
            if (-var3 > this.field1898) {
                this.field1898 = -var3;
            }
            if (var3 > this.field1725) {
                this.field1725 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1726) {
                this.field1726 = var5;
            }
        }
        this.field1726 = (int) (Math.sqrt((double) this.field1726) + 0.99D);
        this.field1728 = (int) (Math.sqrt((double) (this.field1898 * this.field1898 + this.field1726 * this.field1726)) + 0.99D);
        this.field1727 = this.field1728 + (int) (Math.sqrt((double) (this.field1726 * this.field1726 + this.field1725 * this.field1725)) + 0.99D);
    }

    @ObfuscatedName("ef.n()V")
    public void method2712() {
        if (this.field1724 == 2) {
            return;
        }
        this.field1724 = 2;
        this.field1726 = 0;
        for (int var1 = 0; var1 < this.field1701; var1++) {
            int var2 = this.field1702[var1];
            int var3 = this.field1703[var1];
            int var4 = this.field1704[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1726) {
                this.field1726 = var5;
            }
        }
        this.field1726 = (int) (Math.sqrt((double) this.field1726) + 0.99D);
        this.field1728 = this.field1726;
        this.field1727 = this.field1726 + this.field1726;
    }

    @ObfuscatedName("ef.u()I")
    public int method2713() {
        this.method2711();
        return this.field1726;
    }

    @ObfuscatedName("ef.z()V")
    public void method2714() {
        this.field1724 = 0;
        this.field1754 = -1;
    }

    @ObfuscatedName("ef.w(Leg;I)V")
    public void method2708(class148 arg0, int arg1) {
        if (this.field1721 == null || arg1 == -1) {
            return;
        }
        class135 var3 = arg0.field1915[arg1];
        class142 var4 = var3.field1667;
        Statics.field1722 = 0;
        Statics.field1756 = 0;
        Statics.field1757 = 0;
        for (int var5 = 0; var5 < var3.field1661; var5++) {
            int var6 = var3.field1666[var5];
            this.method2717(var4.field1828[var6], var4.field1825[var6], var3.field1668[var5], var3.field1669[var5], var3.field1670[var5]);
        }
        this.method2714();
    }

    @ObfuscatedName("ef.y(Leg;ILeg;I[I)V")
    public void method2763(class148 arg0, int arg1, class148 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2708(arg0, arg1);
            return;
        }
        class135 var6 = arg0.field1915[arg1];
        class135 var7 = arg2.field1915[arg3];
        class142 var8 = var6.field1667;
        Statics.field1722 = 0;
        Statics.field1756 = 0;
        Statics.field1757 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1661; var11++) {
            int var12 = var6.field1666[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1828[var12] == 0) {
                this.method2717(var8.field1828[var12], var8.field1825[var12], var6.field1668[var11], var6.field1669[var11], var6.field1670[var11]);
            }
        }
        Statics.field1722 = 0;
        Statics.field1756 = 0;
        Statics.field1757 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1661; var15++) {
            int var16 = var7.field1666[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1828[var16] == 0) {
                this.method2717(var8.field1828[var16], var8.field1825[var16], var7.field1668[var15], var7.field1669[var15], var7.field1670[var15]);
            }
        }
        this.method2714();
    }

    @ObfuscatedName("ef.c(I[IIII)V")
    public void method2717(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1722 = 0;
            Statics.field1756 = 0;
            Statics.field1757 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1721.length) {
                    int[] var10 = this.field1721[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1722 += this.field1702[var12];
                        Statics.field1756 += this.field1703[var12];
                        Statics.field1757 += this.field1704[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1722 = Statics.field1722 / var7 + arg2;
                Statics.field1756 = Statics.field1756 / var7 + arg3;
                Statics.field1757 = Statics.field1757 / var7 + arg4;
            } else {
                Statics.field1722 = arg2;
                Statics.field1756 = arg3;
                Statics.field1757 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1721.length) {
                    int[] var15 = this.field1721[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1702[var17] += arg2;
                        this.field1703[var17] += arg3;
                        this.field1704[var17] += arg4;
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
                        this.field1702[var22] -= Statics.field1722;
                        this.field1703[var22] -= Statics.field1756;
                        this.field1704[var22] -= Statics.field1757;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1730[var25];
                            int var27 = field1762[var25];
                            int var28 = this.field1703[var22] * var26 + this.field1702[var22] * var27 >> 16;
                            this.field1703[var22] = this.field1703[var22] * var27 - this.field1702[var22] * var26 >> 16;
                            this.field1702[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1730[var23];
                            int var30 = field1762[var23];
                            int var31 = this.field1703[var22] * var30 - this.field1704[var22] * var29 >> 16;
                            this.field1704[var22] = this.field1704[var22] * var30 + this.field1703[var22] * var29 >> 16;
                            this.field1703[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1730[var24];
                            int var33 = field1762[var24];
                            int var34 = this.field1704[var22] * var32 + this.field1702[var22] * var33 >> 16;
                            this.field1704[var22] = this.field1704[var22] * var33 - this.field1702[var22] * var32 >> 16;
                            this.field1702[var22] = var34;
                        }
                        this.field1702[var22] += Statics.field1722;
                        this.field1703[var22] += Statics.field1756;
                        this.field1704[var22] += Statics.field1757;
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
                        this.field1702[var39] -= Statics.field1722;
                        this.field1703[var39] -= Statics.field1756;
                        this.field1704[var39] -= Statics.field1757;
                        this.field1702[var39] = this.field1702[var39] * arg2 / 128;
                        this.field1703[var39] = this.field1703[var39] * arg3 / 128;
                        this.field1704[var39] = this.field1704[var39] * arg4 / 128;
                        this.field1702[var39] += Statics.field1722;
                        this.field1703[var39] += Statics.field1756;
                        this.field1704[var39] += Statics.field1757;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1749 != null && this.field1713 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1749.length) {
                    int[] var42 = this.field1749[var41];
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

    @ObfuscatedName("ef.h()V")
    public void method2718() {
        for (int var1 = 0; var1 < this.field1701; var1++) {
            int var2 = this.field1702[var1];
            this.field1702[var1] = this.field1704[var1];
            this.field1704[var1] = -var2;
        }
        this.method2714();
    }

    @ObfuscatedName("ef.k()V")
    public void method2719() {
        for (int var1 = 0; var1 < this.field1701; var1++) {
            this.field1702[var1] = -this.field1702[var1];
            this.field1704[var1] = -this.field1704[var1];
        }
        this.method2714();
    }

    @ObfuscatedName("ef.r()V")
    public void method2709() {
        for (int var1 = 0; var1 < this.field1701; var1++) {
            int var2 = this.field1704[var1];
            this.field1704[var1] = this.field1702[var1];
            this.field1702[var1] = -var2;
        }
        this.method2714();
    }

    @ObfuscatedName("ef.d(I)V")
    public void method2721(int arg0) {
        int var2 = field1730[arg0];
        int var3 = field1762[arg0];
        for (int var4 = 0; var4 < this.field1701; var4++) {
            int var5 = this.field1703[var4] * var3 - this.field1704[var4] * var2 >> 16;
            this.field1704[var4] = this.field1704[var4] * var3 + this.field1703[var4] * var2 >> 16;
            this.field1703[var4] = var5;
        }
        this.method2714();
    }

    @ObfuscatedName("ef.e(III)V")
    public void method2779(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1701; var4++) {
            this.field1702[var4] += arg0;
            this.field1703[var4] += arg1;
            this.field1704[var4] += arg2;
        }
        this.method2714();
    }

    @ObfuscatedName("ef.l(III)V")
    public void method2723(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1701; var4++) {
            this.field1702[var4] = this.field1702[var4] * arg0 / 128;
            this.field1703[var4] = this.field1703[var4] * arg1 / 128;
            this.field1704[var4] = this.field1704[var4] * arg2 / 128;
        }
        this.method2714();
    }

    @ObfuscatedName("ef.t(IIIIIII)V")
    public final void method2724(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1745[0] = -1;
        if (this.field1724 != 2 && this.field1724 != 1) {
            this.method2712();
        }
        int var8 = Statics.field1809;
        int var9 = Statics.field1800;
        int var10 = field1730[arg0];
        int var11 = field1762[arg0];
        int var12 = field1730[arg1];
        int var13 = field1762[arg1];
        int var14 = field1730[arg2];
        int var15 = field1762[arg2];
        int var16 = field1730[arg3];
        int var17 = field1762[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1701; var19++) {
            int var20 = this.field1702[var19];
            int var21 = this.field1703[var19];
            int var22 = this.field1704[var19];
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
            field1740[var19] = var30 - var18;
            field1738[var19] = class140.field1798 * var26 / var30 + var8;
            field1739[var19] = class140.field1798 * var29 / var30 + var9;
            if (this.field1731 > 0) {
                field1741[var19] = var26;
                field1737[var19] = var29;
                field1743[var19] = var30;
            }
        }
        try {
            this.method2727(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ef.x(IIIIIIII)V")
    public final void method2725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1745[0] = -1;
        if (this.field1724 != 2 && this.field1724 != 1) {
            this.method2712();
        }
        int var9 = Statics.field1809;
        int var10 = Statics.field1800;
        int var11 = field1730[arg0];
        int var12 = field1762[arg0];
        int var13 = field1730[arg1];
        int var14 = field1762[arg1];
        int var15 = field1730[arg2];
        int var16 = field1762[arg2];
        int var17 = field1730[arg3];
        int var18 = field1762[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1701; var20++) {
            int var21 = this.field1702[var20];
            int var22 = this.field1703[var20];
            int var23 = this.field1704[var20];
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
            field1740[var20] = var31 - var19;
            field1738[var20] = class140.field1798 * var27 / arg7 + var9;
            field1739[var20] = class140.field1798 * var30 / arg7 + var10;
            if (this.field1731 > 0) {
                field1741[var20] = var27;
                field1737[var20] = var30;
                field1743[var20] = var31;
            }
        }
        try {
            this.method2727(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ef.cz(IIIIIIIIJ)V")
    public void method2752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1745[0] = -1;
        if (this.field1724 != 1) {
            this.method2711();
        }
        this.method2764(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1726 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1726) * class140.field1798;
        if (var16 / var14 >= Statics.field1811) {
            return;
        }
        int var17 = (this.field1726 + var15) * class140.field1798;
        if (var17 / var14 <= Statics.field1803) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1726 * arg1 >> 16;
        int var20 = (var18 + var19) * class140.field1798;
        if (var20 / var14 <= Statics.field1805) {
            return;
        }
        int var21 = (this.field1898 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class140.field1798;
        if (var22 / var14 >= Statics.field1806) {
            return;
        }
        int var23 = (this.field1898 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1731 > 0;
        int var27 = class138.method12();
        int var28 = class138.method1012();
        boolean var29 = class138.field1767;
        boolean var31 = arg8 != 0L;
        if (var31) {
            boolean var32 = (int) (arg8 >>> 16 & 0x1L) == 1;
            var31 = !var32;
        }
        boolean var35 = false;
        if (var31 && var29) {
            boolean var36 = false;
            if (field1714) {
                var36 = class138.method3875(this, arg5, arg6, arg7);
            } else {
                int var37 = var12 - var13;
                if (var37 <= 50) {
                    var37 = 50;
                }
                int var38;
                int var39;
                if (var15 > 0) {
                    var38 = var16 / var14;
                    var39 = var17 / var37;
                } else {
                    var39 = var17 / var14;
                    var38 = var16 / var37;
                }
                int var40;
                int var41;
                if (var18 > 0) {
                    var40 = var22 / var14;
                    var41 = var20 / var37;
                } else {
                    var41 = var20 / var14;
                    var40 = var22 / var37;
                }
                int var42 = var27 - Statics.field1809;
                int var43 = var28 - Statics.field1800;
                if (var42 > var38 && var42 < var39 && var43 > var40 && var43 < var41) {
                    var36 = true;
                }
            }
            if (var36) {
                if (this.field1755) {
                    class138.method1816(arg8);
                } else {
                    var35 = true;
                }
            }
        }
        int var44 = Statics.field1809;
        int var45 = Statics.field1800;
        int var46 = 0;
        int var47 = 0;
        if (arg0 != 0) {
            var46 = field1730[arg0];
            var47 = field1762[arg0];
        }
        for (int var48 = 0; var48 < this.field1701; var48++) {
            int var49 = this.field1702[var48];
            int var50 = this.field1703[var48];
            int var51 = this.field1704[var48];
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
            field1740[var48] = var60 - var12;
            if (var60 >= 50) {
                field1738[var48] = class140.field1798 * var56 / var60 + var44;
                field1739[var48] = class140.field1798 * var59 / var60 + var45;
            } else {
                field1738[var48] = -5000;
                var24 = true;
            }
            if (var26) {
                field1741[var48] = var56;
                field1737[var48] = var59;
                field1743[var48] = var60;
            }
        }
        try {
            this.method2727(var24, var35, this.field1755, arg8);
        } catch (Exception var63) {
        }
    }

    @ObfuscatedName("ef.ah(ZZZJ)V")
    public final void method2727(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1727 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1727; var6++) {
            field1745[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1705; var8++) {
            if (this.field1711[var8] != -2) {
                int var9 = this.field1761[var8];
                int var10 = this.field1707[var8];
                int var11 = this.field1708[var8];
                int var12 = field1738[var9];
                int var13 = field1738[var10];
                int var14 = field1738[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field1741[var9];
                    int var16 = field1741[var10];
                    int var17 = field1741[var11];
                    int var18 = field1737[var9];
                    int var19 = field1737[var10];
                    int var20 = field1737[var11];
                    int var21 = field1743[var9];
                    int var22 = field1743[var10];
                    int var23 = field1743[var11];
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
                        field1753[var8] = true;
                        int var33 = (field1740[var9] + field1740[var10] + field1740[var11]) / 3 + this.field1728;
                        field1746[var33][field1745[var33]++] = var8;
                    }
                } else {
                    if (arg1) {
                        int var34 = field1739[var9];
                        int var35 = field1739[var10];
                        int var36 = field1739[var11];
                        int var37 = class138.field1769 + var7;
                        boolean var38;
                        if (var37 < var34 && var37 < var35 && var37 < var36) {
                            var38 = false;
                        } else {
                            int var39 = class138.field1769 - var7;
                            if (var39 > var34 && var39 > var35 && var39 > var36) {
                                var38 = false;
                            } else {
                                int var40 = class138.field1770 + var7;
                                if (var40 < var12 && var40 < var13 && var40 < var14) {
                                    var38 = false;
                                } else {
                                    int var41 = class138.field1770 - var7;
                                    if (var41 > var12 && var41 > var13 && var41 > var14) {
                                        var38 = false;
                                    } else {
                                        var38 = true;
                                    }
                                }
                            }
                        }
                        if (var38) {
                            class138.method1816(arg3);
                            arg1 = false;
                        }
                    }
                    if ((field1739[var11] - field1739[var10]) * (var12 - var13) - (field1739[var9] - field1739[var10]) * (var14 - var13) > 0) {
                        field1753[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1801 && var13 <= Statics.field1801 && var14 <= Statics.field1801) {
                            field1736[var8] = false;
                        } else {
                            field1736[var8] = true;
                        }
                        int var42 = (field1740[var9] + field1740[var10] + field1740[var11]) / 3 + this.field1728;
                        field1746[var42][field1745[var42]++] = var8;
                    }
                }
            }
        }
        if (this.field1712 == null) {
            for (int var43 = this.field1727 - 1; var43 >= 0; var43--) {
                int var44 = field1745[var43];
                if (var44 > 0) {
                    int[] var45 = field1746[var43];
                    for (int var46 = 0; var46 < var44; var46++) {
                        this.method2759(var45[var46]);
                    }
                }
            }
            return;
        }
        for (int var47 = 0; var47 < 12; var47++) {
            field1700[var47] = 0;
            field1751[var47] = 0;
        }
        for (int var48 = this.field1727 - 1; var48 >= 0; var48--) {
            int var49 = field1745[var48];
            if (var49 > 0) {
                int[] var50 = field1746[var48];
                for (int var51 = 0; var51 < var49; var51++) {
                    int var52 = var50[var51];
                    byte var53 = this.field1712[var52];
                    int var54 = field1700[var53]++;
                    field1748[var53][var54] = var52;
                    if (var53 < 10) {
                        field1751[var53] += var48;
                    } else if (var53 == 10) {
                        field1699[var54] = var48;
                    } else {
                        field1723[var54] = var48;
                    }
                }
            }
        }
        int var55 = 0;
        if (field1700[1] > 0 || field1700[2] > 0) {
            var55 = (field1751[1] + field1751[2]) / (field1700[1] + field1700[2]);
        }
        int var56 = 0;
        if (field1700[3] > 0 || field1700[4] > 0) {
            var56 = (field1751[3] + field1751[4]) / (field1700[3] + field1700[4]);
        }
        int var57 = 0;
        if (field1700[6] > 0 || field1700[8] > 0) {
            var57 = (field1751[6] + field1751[8]) / (field1700[6] + field1700[8]);
        }
        int var58 = 0;
        int var59 = field1700[10];
        int[] var60 = field1748[10];
        int[] var61 = field1699;
        if (var58 == var59) {
            var58 = 0;
            var59 = field1700[11];
            var60 = field1748[11];
            var61 = field1723;
        }
        int var62;
        if (var58 < var59) {
            var62 = var61[var58];
        } else {
            var62 = -1000;
        }
        for (int var63 = 0; var63 < 10; var63++) {
            while (var63 == 0 && var62 > var55) {
                this.method2759(var60[var58++]);
                if (var58 == var59 && field1748[11] != var60) {
                    var58 = 0;
                    var59 = field1700[11];
                    var60 = field1748[11];
                    var61 = field1723;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            while (var63 == 3 && var62 > var56) {
                this.method2759(var60[var58++]);
                if (var58 == var59 && field1748[11] != var60) {
                    var58 = 0;
                    var59 = field1700[11];
                    var60 = field1748[11];
                    var61 = field1723;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            while (var63 == 5 && var62 > var57) {
                this.method2759(var60[var58++]);
                if (var58 == var59 && field1748[11] != var60) {
                    var58 = 0;
                    var59 = field1700[11];
                    var60 = field1748[11];
                    var61 = field1723;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            int var64 = field1700[var63];
            int[] var65 = field1748[var63];
            for (int var66 = 0; var66 < var64; var66++) {
                this.method2759(var65[var66]);
            }
        }
        while (var62 != -1000) {
            this.method2759(var60[var58++]);
            if (var58 == var59 && field1748[11] != var60) {
                var58 = 0;
                var60 = field1748[11];
                var59 = field1700[11];
                var61 = field1723;
            }
            if (var58 < var59) {
                var62 = var61[var58];
            } else {
                var62 = -1000;
            }
        }
    }

    @ObfuscatedName("ef.ai(I)V")
    public final void method2759(int arg0) {
        if (field1753[arg0]) {
            this.method2729(arg0);
            return;
        }
        int var2 = this.field1761[arg0];
        int var3 = this.field1707[arg0];
        int var4 = this.field1708[arg0];
        class140.field1797 = field1736[arg0];
        if (this.field1713 == null) {
            class140.field1788 = 0;
        } else {
            class140.field1788 = this.field1713[arg0] & 0xFF;
        }
        if (this.field1715 != null && this.field1715[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1732 == null || this.field1732[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1732[arg0] & 0xFF;
                var6 = this.field1718[var5];
                var7 = this.field1719[var5];
                var8 = this.field1720[var5];
            }
            if (this.field1711[arg0] == -1) {
                class140.method2840(field1739[var2], field1739[var3], field1739[var4], field1738[var2], field1738[var3], field1738[var4], this.field1709[arg0], this.field1709[arg0], this.field1709[arg0], field1741[var6], field1741[var7], field1741[var8], field1737[var6], field1737[var7], field1737[var8], field1743[var6], field1743[var7], field1743[var8], this.field1715[arg0]);
            } else {
                class140.method2840(field1739[var2], field1739[var3], field1739[var4], field1738[var2], field1738[var3], field1738[var4], this.field1709[arg0], this.field1710[arg0], this.field1711[arg0], field1741[var6], field1741[var7], field1741[var8], field1737[var6], field1737[var7], field1737[var8], field1743[var6], field1743[var7], field1743[var8], this.field1715[arg0]);
            }
        } else if (this.field1711[arg0] == -1) {
            class140.method2838(field1739[var2], field1739[var3], field1739[var4], field1738[var2], field1738[var3], field1738[var4], field1758[this.field1709[arg0]]);
        } else {
            class140.method2836(field1739[var2], field1739[var3], field1739[var4], field1738[var2], field1738[var3], field1738[var4], this.field1709[arg0], this.field1710[arg0], this.field1711[arg0]);
        }
    }

    @ObfuscatedName("ef.ao(I)V")
    public final void method2729(int arg0) {
        int var2 = Statics.field1809;
        int var3 = Statics.field1800;
        int var4 = 0;
        int var5 = this.field1761[arg0];
        int var6 = this.field1707[arg0];
        int var7 = this.field1708[arg0];
        int var8 = field1743[var5];
        int var9 = field1743[var6];
        int var10 = field1743[var7];
        if (this.field1713 == null) {
            class140.field1788 = 0;
        } else {
            class140.field1788 = this.field1713[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1752[var4] = field1738[var5];
            field1717[var4] = field1739[var5];
            field1729[var4++] = this.field1709[arg0];
        } else {
            int var11 = field1741[var5];
            int var12 = field1737[var5];
            int var13 = this.field1709[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1764[var10 - var8];
                field1752[var4] = (((field1741[var7] - var11) * var14 >> 16) + var11) * class140.field1798 / 50 + var2;
                field1717[var4] = (((field1737[var7] - var12) * var14 >> 16) + var12) * class140.field1798 / 50 + var3;
                field1729[var4++] = ((this.field1711[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1764[var9 - var8];
                field1752[var4] = (((field1741[var6] - var11) * var15 >> 16) + var11) * class140.field1798 / 50 + var2;
                field1717[var4] = (((field1737[var6] - var12) * var15 >> 16) + var12) * class140.field1798 / 50 + var3;
                field1729[var4++] = ((this.field1710[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1752[var4] = field1738[var6];
            field1717[var4] = field1739[var6];
            field1729[var4++] = this.field1710[arg0];
        } else {
            int var16 = field1741[var6];
            int var17 = field1737[var6];
            int var18 = this.field1710[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1764[var8 - var9];
                field1752[var4] = (((field1741[var5] - var16) * var19 >> 16) + var16) * class140.field1798 / 50 + var2;
                field1717[var4] = (((field1737[var5] - var17) * var19 >> 16) + var17) * class140.field1798 / 50 + var3;
                field1729[var4++] = ((this.field1709[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1764[var10 - var9];
                field1752[var4] = (((field1741[var7] - var16) * var20 >> 16) + var16) * class140.field1798 / 50 + var2;
                field1717[var4] = (((field1737[var7] - var17) * var20 >> 16) + var17) * class140.field1798 / 50 + var3;
                field1729[var4++] = ((this.field1711[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1752[var4] = field1738[var7];
            field1717[var4] = field1739[var7];
            field1729[var4++] = this.field1711[arg0];
        } else {
            int var21 = field1741[var7];
            int var22 = field1737[var7];
            int var23 = this.field1711[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1764[var9 - var10];
                field1752[var4] = (((field1741[var6] - var21) * var24 >> 16) + var21) * class140.field1798 / 50 + var2;
                field1717[var4] = (((field1737[var6] - var22) * var24 >> 16) + var22) * class140.field1798 / 50 + var3;
                field1729[var4++] = ((this.field1710[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1764[var8 - var10];
                field1752[var4] = (((field1741[var5] - var21) * var25 >> 16) + var21) * class140.field1798 / 50 + var2;
                field1717[var4] = (((field1737[var5] - var22) * var25 >> 16) + var22) * class140.field1798 / 50 + var3;
                field1729[var4++] = ((this.field1709[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1752[0];
        int var27 = field1752[1];
        int var28 = field1752[2];
        int var29 = field1717[0];
        int var30 = field1717[1];
        int var31 = field1717[2];
        class140.field1797 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1801 || var27 > Statics.field1801 || var28 > Statics.field1801) {
                class140.field1797 = true;
            }
            if (this.field1715 != null && this.field1715[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1732 == null || this.field1732[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1732[arg0] & 0xFF;
                    var33 = this.field1718[var32];
                    var34 = this.field1719[var32];
                    var35 = this.field1720[var32];
                }
                if (this.field1711[arg0] == -1) {
                    class140.method2840(var29, var30, var31, var26, var27, var28, this.field1709[arg0], this.field1709[arg0], this.field1709[arg0], field1741[var33], field1741[var34], field1741[var35], field1737[var33], field1737[var34], field1737[var35], field1743[var33], field1743[var34], field1743[var35], this.field1715[arg0]);
                } else {
                    class140.method2840(var29, var30, var31, var26, var27, var28, field1729[0], field1729[1], field1729[2], field1741[var33], field1741[var34], field1741[var35], field1737[var33], field1737[var34], field1737[var35], field1743[var33], field1743[var34], field1743[var35], this.field1715[arg0]);
                }
            } else if (this.field1711[arg0] == -1) {
                class140.method2838(var29, var30, var31, var26, var27, var28, field1758[this.field1709[arg0]]);
            } else {
                class140.method2836(var29, var30, var31, var26, var27, var28, field1729[0], field1729[1], field1729[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1801 || var27 > Statics.field1801 || var28 > Statics.field1801 || field1752[3] < 0 || field1752[3] > Statics.field1801) {
            class140.field1797 = true;
        }
        if (this.field1715 != null && this.field1715[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1732 == null || this.field1732[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1732[arg0] & 0xFF;
                var37 = this.field1718[var36];
                var38 = this.field1719[var36];
                var39 = this.field1720[var36];
            }
            short var40 = this.field1715[arg0];
            if (this.field1711[arg0] == -1) {
                class140.method2840(var29, var30, var31, var26, var27, var28, this.field1709[arg0], this.field1709[arg0], this.field1709[arg0], field1741[var37], field1741[var38], field1741[var39], field1737[var37], field1737[var38], field1737[var39], field1743[var37], field1743[var38], field1743[var39], var40);
                class140.method2840(var29, var31, field1717[3], var26, var28, field1752[3], this.field1709[arg0], this.field1709[arg0], this.field1709[arg0], field1741[var37], field1741[var38], field1741[var39], field1737[var37], field1737[var38], field1737[var39], field1743[var37], field1743[var38], field1743[var39], var40);
            } else {
                class140.method2840(var29, var30, var31, var26, var27, var28, field1729[0], field1729[1], field1729[2], field1741[var37], field1741[var38], field1741[var39], field1737[var37], field1737[var38], field1737[var39], field1743[var37], field1743[var38], field1743[var39], var40);
                class140.method2840(var29, var31, field1717[3], var26, var28, field1752[3], field1729[0], field1729[2], field1729[3], field1741[var37], field1741[var38], field1741[var39], field1737[var37], field1737[var38], field1737[var39], field1743[var37], field1743[var38], field1743[var39], var40);
            }
        } else if (this.field1711[arg0] == -1) {
            int var41 = field1758[this.field1709[arg0]];
            class140.method2838(var29, var30, var31, var26, var27, var28, var41);
            class140.method2838(var29, var31, field1717[3], var26, var28, field1752[3], var41);
        } else {
            class140.method2836(var29, var30, var31, var26, var27, var28, field1729[0], field1729[1], field1729[2]);
            class140.method2836(var29, var31, field1717[3], var26, var28, field1752[3], field1729[0], field1729[2], field1729[3]);
        }
    }
}
