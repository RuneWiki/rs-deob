package deob;

@ObfuscatedName("cy")
public class class98 extends class78 {

    @ObfuscatedName("cy.n")
    public static class98 field1687 = new class98();

    @ObfuscatedName("cy.x")
    public static byte[] field1680 = new byte[1];

    @ObfuscatedName("cy.k")
    public static class98 field1726 = new class98();

    @ObfuscatedName("cy.i")
    public static byte[] field1689 = new byte[1];

    @ObfuscatedName("cy.d")
    public int field1683 = 0;

    @ObfuscatedName("cy.q")
    public int[] field1691;

    @ObfuscatedName("cy.m")
    public int[] field1679;

    @ObfuscatedName("cy.a")
    public int[] field1694;

    @ObfuscatedName("cy.w")
    public int field1696 = 0;

    @ObfuscatedName("cy.e")
    public int[] field1688;

    @ObfuscatedName("cy.o")
    public int[] field1714;

    @ObfuscatedName("cy.v")
    public int[] field1690;

    @ObfuscatedName("cy.z")
    public int[] field1738;

    @ObfuscatedName("cy.j")
    public int[] field1692;

    @ObfuscatedName("cy.r")
    public int[] field1693;

    @ObfuscatedName("cy.c")
    public byte[] field1720;

    @ObfuscatedName("cy.u")
    public byte[] field1684;

    @ObfuscatedName("cy.h")
    public byte[] field1737;

    @ObfuscatedName("cy.t")
    public short[] field1706;

    @ObfuscatedName("cy.f")
    public byte field1698 = 0;

    @ObfuscatedName("cy.g")
    public int field1699 = 0;

    @ObfuscatedName("cy.s")
    public int[] field1700;

    @ObfuscatedName("cy.y")
    public int[] field1701;

    @ObfuscatedName("cy.p")
    public int[] field1728;

    @ObfuscatedName("cy.b")
    public int[][] field1703;

    @ObfuscatedName("cy.l")
    public int[][] field1704;

    @ObfuscatedName("cy.al")
    public boolean field1705 = false;

    @ObfuscatedName("cy.aa")
    public int field1729;

    @ObfuscatedName("cy.ar")
    public int field1707;

    @ObfuscatedName("cy.ak")
    public int field1708;

    @ObfuscatedName("cy.ay")
    public int field1709;

    @ObfuscatedName("cy.aw")
    public int field1710;

    @ObfuscatedName("cy.at")
    public static boolean[] field1712 = new boolean[4096];

    @ObfuscatedName("cy.af")
    public static boolean[] field1713 = new boolean[4096];

    @ObfuscatedName("cy.ae")
    public static int[] field1685 = new int[4096];

    @ObfuscatedName("cy.ai")
    public static int[] field1715 = new int[4096];

    @ObfuscatedName("cy.as")
    public static int[] field1716 = new int[4096];

    @ObfuscatedName("cy.aj")
    public static int[] field1717 = new int[4096];

    @ObfuscatedName("cy.au")
    public static int[] field1718 = new int[4096];

    @ObfuscatedName("cy.az")
    public static int[] field1719 = new int[4096];

    @ObfuscatedName("cy.ag")
    public static int[] field1702 = new int[1600];

    @ObfuscatedName("cy.aq")
    public static int[][] field1722 = new int[1600][512];

    @ObfuscatedName("cy.an")
    public static int[] field1723 = new int[12];

    @ObfuscatedName("cy.ax")
    public static int[][] field1721 = new int[12][2000];

    @ObfuscatedName("cy.ap")
    public static int[] field1725 = new int[2000];

    @ObfuscatedName("cy.ac")
    public static int[] field1686 = new int[2000];

    @ObfuscatedName("cy.ab")
    public static int[] field1727 = new int[12];

    @ObfuscatedName("cy.am")
    public static int[] field1681 = new int[10];

    @ObfuscatedName("cy.ad")
    public static int[] field1695 = new int[10];

    @ObfuscatedName("cy.ah")
    public static int[] field1730 = new int[10];

    @ObfuscatedName("cy.bv")
    public static boolean field1734 = false;

    @ObfuscatedName("cy.bi")
    public static int field1735 = 0;

    @ObfuscatedName("cy.bd")
    public static int field1736 = 0;

    @ObfuscatedName("cy.bh")
    public static int field1682 = 0;

    @ObfuscatedName("cy.bn")
    public static int[] field1724 = new int[1000];

    @ObfuscatedName("cy.bo")
    public static int[] field1739 = class84.field1466;

    @ObfuscatedName("cy.br")
    public static int[] field1740 = class84.field1467;

    @ObfuscatedName("cy.bg")
    public static int[] field1741 = class84.field1462;

    @ObfuscatedName("cy.bs")
    public static int[] field1742 = class84.field1447;

    public class98() {
    }

    public class98(class98[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1683 = 0;
        this.field1696 = 0;
        this.field1699 = 0;
        this.field1698 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class98 var8 = arg0[var7];
            if (var8 != null) {
                this.field1683 += var8.field1683;
                this.field1696 += var8.field1696;
                this.field1699 += var8.field1699;
                if (var8.field1720 == null) {
                    if (this.field1698 == -1) {
                        this.field1698 = var8.field1698;
                    }
                    if (this.field1698 != var8.field1698) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1684 != null;
                var5 |= var8.field1706 != null;
                var6 |= var8.field1737 != null;
            }
        }
        this.field1691 = new int[this.field1683];
        this.field1679 = new int[this.field1683];
        this.field1694 = new int[this.field1683];
        this.field1688 = new int[this.field1696];
        this.field1714 = new int[this.field1696];
        this.field1690 = new int[this.field1696];
        this.field1738 = new int[this.field1696];
        this.field1692 = new int[this.field1696];
        this.field1693 = new int[this.field1696];
        if (var3) {
            this.field1720 = new byte[this.field1696];
        }
        if (var4) {
            this.field1684 = new byte[this.field1696];
        }
        if (var5) {
            this.field1706 = new short[this.field1696];
        }
        if (var6) {
            this.field1737 = new byte[this.field1696];
        }
        if (this.field1699 > 0) {
            this.field1700 = new int[this.field1699];
            this.field1701 = new int[this.field1699];
            this.field1728 = new int[this.field1699];
        }
        this.field1683 = 0;
        this.field1696 = 0;
        this.field1699 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class98 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1696; var11++) {
                    this.field1688[this.field1696] = var10.field1688[var11] + this.field1683;
                    this.field1714[this.field1696] = var10.field1714[var11] + this.field1683;
                    this.field1690[this.field1696] = var10.field1690[var11] + this.field1683;
                    this.field1738[this.field1696] = var10.field1738[var11];
                    this.field1692[this.field1696] = var10.field1692[var11];
                    this.field1693[this.field1696] = var10.field1693[var11];
                    if (var3) {
                        if (var10.field1720 == null) {
                            this.field1720[this.field1696] = var10.field1698;
                        } else {
                            this.field1720[this.field1696] = var10.field1720[var11];
                        }
                    }
                    if (var4 && var10.field1684 != null) {
                        this.field1684[this.field1696] = var10.field1684[var11];
                    }
                    if (var5) {
                        if (var10.field1706 == null) {
                            this.field1706[this.field1696] = -1;
                        } else {
                            this.field1706[this.field1696] = var10.field1706[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1737 == null || var10.field1737[var11] == -1) {
                            this.field1737[this.field1696] = -1;
                        } else {
                            this.field1737[this.field1696] = (byte) (var10.field1737[var11] + this.field1699);
                        }
                    }
                    this.field1696++;
                }
                for (int var12 = 0; var12 < var10.field1699; var12++) {
                    this.field1700[this.field1699] = var10.field1700[var12] + this.field1683;
                    this.field1701[this.field1699] = var10.field1701[var12] + this.field1683;
                    this.field1728[this.field1699] = var10.field1728[var12] + this.field1683;
                    this.field1699++;
                }
                for (int var13 = 0; var13 < var10.field1683; var13++) {
                    this.field1691[this.field1683] = var10.field1691[var13];
                    this.field1679[this.field1683] = var10.field1679[var13];
                    this.field1694[this.field1683] = var10.field1694[var13];
                    this.field1683++;
                }
            }
        }
    }

    @ObfuscatedName("cy.n([[IIIIZI)Lcy;")
    public class98 method2009(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1989();
        int var7 = arg1 - this.field1708;
        int var8 = this.field1708 + arg1;
        int var9 = arg3 - this.field1708;
        int var10 = this.field1708 + arg3;
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
        class98 var15;
        if (arg4) {
            var15 = new class98();
            var15.field1683 = this.field1683;
            var15.field1696 = this.field1696;
            var15.field1699 = this.field1699;
            var15.field1691 = this.field1691;
            var15.field1694 = this.field1694;
            var15.field1688 = this.field1688;
            var15.field1714 = this.field1714;
            var15.field1690 = this.field1690;
            var15.field1738 = this.field1738;
            var15.field1692 = this.field1692;
            var15.field1693 = this.field1693;
            var15.field1720 = this.field1720;
            var15.field1684 = this.field1684;
            var15.field1737 = this.field1737;
            var15.field1706 = this.field1706;
            var15.field1698 = this.field1698;
            var15.field1700 = this.field1700;
            var15.field1701 = this.field1701;
            var15.field1728 = this.field1728;
            var15.field1703 = this.field1703;
            var15.field1704 = this.field1704;
            var15.field1705 = this.field1705;
            var15.field1679 = new int[var15.field1683];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1683; var16++) {
                int var17 = this.field1691[var16] + arg1;
                int var18 = this.field1694[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1679[var16] = this.field1679[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1683; var26++) {
                int var27 = (-this.field1679[var26] << 16) / this.field1339;
                if (var27 < arg5) {
                    int var28 = this.field1691[var26] + arg1;
                    int var29 = this.field1694[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1679[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1679[var26];
                }
            }
        }
        var15.field1729 = 0;
        return var15;
    }

    @ObfuscatedName("cy.k(Z)Lcy;")
    public class98 method1988(boolean arg0) {
        if (!arg0 && field1680.length < this.field1696) {
            field1680 = new byte[this.field1696 + 100];
        }
        return this.method2048(arg0, field1687, field1680);
    }

    @ObfuscatedName("cy.i(Z)Lcy;")
    public class98 method2018(boolean arg0) {
        if (!arg0 && field1689.length < this.field1696) {
            field1689 = new byte[this.field1696 + 100];
        }
        return this.method2048(arg0, field1726, field1689);
    }

    @ObfuscatedName("cy.d(ZLcy;[B)Lcy;")
    public class98 method2048(boolean arg0, class98 arg1, byte[] arg2) {
        arg1.field1683 = this.field1683;
        arg1.field1696 = this.field1696;
        arg1.field1699 = this.field1699;
        if (arg1.field1691 == null || arg1.field1691.length < this.field1683) {
            arg1.field1691 = new int[this.field1683 + 100];
            arg1.field1679 = new int[this.field1683 + 100];
            arg1.field1694 = new int[this.field1683 + 100];
        }
        for (int var4 = 0; var4 < this.field1683; var4++) {
            arg1.field1691[var4] = this.field1691[var4];
            arg1.field1679[var4] = this.field1679[var4];
            arg1.field1694[var4] = this.field1694[var4];
        }
        if (arg0) {
            arg1.field1684 = this.field1684;
        } else {
            arg1.field1684 = arg2;
            if (this.field1684 == null) {
                for (int var5 = 0; var5 < this.field1696; var5++) {
                    arg1.field1684[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1696; var6++) {
                    arg1.field1684[var6] = this.field1684[var6];
                }
            }
        }
        arg1.field1688 = this.field1688;
        arg1.field1714 = this.field1714;
        arg1.field1690 = this.field1690;
        arg1.field1738 = this.field1738;
        arg1.field1692 = this.field1692;
        arg1.field1693 = this.field1693;
        arg1.field1720 = this.field1720;
        arg1.field1737 = this.field1737;
        arg1.field1706 = this.field1706;
        arg1.field1698 = this.field1698;
        arg1.field1700 = this.field1700;
        arg1.field1701 = this.field1701;
        arg1.field1728 = this.field1728;
        arg1.field1703 = this.field1703;
        arg1.field1704 = this.field1704;
        arg1.field1705 = this.field1705;
        arg1.field1729 = 0;
        return arg1;
    }

    @ObfuscatedName("cy.w()V")
    public void method1989() {
        if (this.field1729 == 1) {
            return;
        }
        this.field1729 = 1;
        this.field1339 = 0;
        this.field1707 = 0;
        this.field1708 = 0;
        for (int var1 = 0; var1 < this.field1683; var1++) {
            int var2 = this.field1691[var1];
            int var3 = this.field1679[var1];
            int var4 = this.field1694[var1];
            if (-var3 > this.field1339) {
                this.field1339 = -var3;
            }
            if (var3 > this.field1707) {
                this.field1707 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1708) {
                this.field1708 = var5;
            }
        }
        this.field1708 = (int) (Math.sqrt((double) this.field1708) + 0.99D);
        this.field1710 = (int) (Math.sqrt((double) (this.field1339 * this.field1339 + this.field1708 * this.field1708)) + 0.99D);
        this.field1709 = this.field1710 + (int) (Math.sqrt((double) (this.field1708 * this.field1708 + this.field1707 * this.field1707)) + 0.99D);
    }

    @ObfuscatedName("cy.e()V")
    public void method1991() {
        if (this.field1729 == 2) {
            return;
        }
        this.field1729 = 2;
        this.field1708 = 0;
        for (int var1 = 0; var1 < this.field1683; var1++) {
            int var2 = this.field1691[var1];
            int var3 = this.field1679[var1];
            int var4 = this.field1694[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1708) {
                this.field1708 = var5;
            }
        }
        this.field1708 = (int) (Math.sqrt((double) this.field1708) + 0.99D);
        this.field1710 = this.field1708;
        this.field1709 = this.field1708 + this.field1708;
    }

    @ObfuscatedName("cy.o()I")
    public int method1992() {
        this.method1989();
        return this.field1708;
    }

    @ObfuscatedName("cy.v(Lci;I)V")
    public void method1993(class96 arg0, int arg1) {
        if (this.field1703 == null || arg1 == -1) {
            return;
        }
        class81 var3 = arg0.field1648[arg1];
        class95 var4 = var3.field1420;
        Statics.field1731 = 0;
        Statics.field1732 = 0;
        Statics.field1733 = 0;
        for (int var5 = 0; var5 < var3.field1423; var5++) {
            int var6 = var3.field1424[var5];
            this.method1995(var4.field1638[var6], var4.field1639[var6], var3.field1422[var5], var3.field1425[var5], var3.field1427[var5]);
        }
        this.field1729 = 0;
    }

    @ObfuscatedName("cy.z(Lci;ILci;I[I)V")
    public void method2050(class96 arg0, int arg1, class96 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1993(arg0, arg1);
            return;
        }
        class81 var6 = arg0.field1648[arg1];
        class81 var7 = arg2.field1648[arg3];
        class95 var8 = var6.field1420;
        Statics.field1731 = 0;
        Statics.field1732 = 0;
        Statics.field1733 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1423; var11++) {
            int var12 = var6.field1424[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1638[var12] == 0) {
                this.method1995(var8.field1638[var12], var8.field1639[var12], var6.field1422[var11], var6.field1425[var11], var6.field1427[var11]);
            }
        }
        Statics.field1731 = 0;
        Statics.field1732 = 0;
        Statics.field1733 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1423; var15++) {
            int var16 = var7.field1424[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1638[var16] == 0) {
                this.method1995(var8.field1638[var16], var8.field1639[var16], var7.field1422[var15], var7.field1425[var15], var7.field1427[var15]);
            }
        }
        this.field1729 = 0;
    }

    @ObfuscatedName("cy.j(I[IIII)V")
    public void method1995(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1731 = 0;
            Statics.field1732 = 0;
            Statics.field1733 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1703.length) {
                    int[] var10 = this.field1703[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1731 += this.field1691[var12];
                        Statics.field1732 += this.field1679[var12];
                        Statics.field1733 += this.field1694[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1731 = Statics.field1731 / var7 + arg2;
                Statics.field1732 = Statics.field1732 / var7 + arg3;
                Statics.field1733 = Statics.field1733 / var7 + arg4;
            } else {
                Statics.field1731 = arg2;
                Statics.field1732 = arg3;
                Statics.field1733 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1703.length) {
                    int[] var15 = this.field1703[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1691[var17] += arg2;
                        this.field1679[var17] += arg3;
                        this.field1694[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1703.length) {
                    int[] var20 = this.field1703[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1691[var22] -= Statics.field1731;
                        this.field1679[var22] -= Statics.field1732;
                        this.field1694[var22] -= Statics.field1733;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1739[var25];
                            int var27 = field1740[var25];
                            int var28 = this.field1691[var22] * var27 + this.field1679[var22] * var26 >> 16;
                            this.field1679[var22] = this.field1679[var22] * var27 - this.field1691[var22] * var26 >> 16;
                            this.field1691[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1739[var23];
                            int var30 = field1740[var23];
                            int var31 = this.field1679[var22] * var30 - this.field1694[var22] * var29 >> 16;
                            this.field1694[var22] = this.field1694[var22] * var30 + this.field1679[var22] * var29 >> 16;
                            this.field1679[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1739[var24];
                            int var33 = field1740[var24];
                            int var34 = this.field1694[var22] * var32 + this.field1691[var22] * var33 >> 16;
                            this.field1694[var22] = this.field1694[var22] * var33 - this.field1691[var22] * var32 >> 16;
                            this.field1691[var22] = var34;
                        }
                        this.field1691[var22] += Statics.field1731;
                        this.field1679[var22] += Statics.field1732;
                        this.field1694[var22] += Statics.field1733;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1703.length) {
                    int[] var37 = this.field1703[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1691[var39] -= Statics.field1731;
                        this.field1679[var39] -= Statics.field1732;
                        this.field1694[var39] -= Statics.field1733;
                        this.field1691[var39] = this.field1691[var39] * arg2 / 128;
                        this.field1679[var39] = this.field1679[var39] * arg3 / 128;
                        this.field1694[var39] = this.field1694[var39] * arg4 / 128;
                        this.field1691[var39] += Statics.field1731;
                        this.field1679[var39] += Statics.field1732;
                        this.field1694[var39] += Statics.field1733;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1704 != null && this.field1684 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1704.length) {
                    int[] var42 = this.field1704[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1684[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1684[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cy.r()V")
    public void method1996() {
        for (int var1 = 0; var1 < this.field1683; var1++) {
            int var2 = this.field1691[var1];
            this.field1691[var1] = this.field1694[var1];
            this.field1694[var1] = -var2;
        }
        this.field1729 = 0;
    }

    @ObfuscatedName("cy.c()V")
    public void method2022() {
        for (int var1 = 0; var1 < this.field1683; var1++) {
            this.field1691[var1] = -this.field1691[var1];
            this.field1694[var1] = -this.field1694[var1];
        }
        this.field1729 = 0;
    }

    @ObfuscatedName("cy.u()V")
    public void method2012() {
        for (int var1 = 0; var1 < this.field1683; var1++) {
            int var2 = this.field1694[var1];
            this.field1694[var1] = this.field1691[var1];
            this.field1691[var1] = -var2;
        }
        this.field1729 = 0;
    }

    @ObfuscatedName("cy.h(I)V")
    public void method2059(int arg0) {
        int var2 = field1739[arg0];
        int var3 = field1740[arg0];
        for (int var4 = 0; var4 < this.field1683; var4++) {
            int var5 = this.field1679[var4] * var3 - this.field1694[var4] * var2 >> 16;
            this.field1694[var4] = this.field1694[var4] * var3 + this.field1679[var4] * var2 >> 16;
            this.field1679[var4] = var5;
        }
        this.field1729 = 0;
    }

    @ObfuscatedName("cy.t(III)V")
    public void method2000(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1683; var4++) {
            this.field1691[var4] += arg0;
            this.field1679[var4] += arg1;
            this.field1694[var4] += arg2;
        }
        this.field1729 = 0;
    }

    @ObfuscatedName("cy.f(III)V")
    public void method2001(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1683; var4++) {
            this.field1691[var4] = this.field1691[var4] * arg0 / 128;
            this.field1679[var4] = this.field1679[var4] * arg1 / 128;
            this.field1694[var4] = this.field1694[var4] * arg2 / 128;
        }
        this.field1729 = 0;
    }

    @ObfuscatedName("cy.g(IIIIIII)V")
    public final void method2002(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1702[0] = -1;
        if (this.field1729 != 2 && this.field1729 != 1) {
            this.method1991();
        }
        int var8 = Statics.field1461;
        int var9 = Statics.field1454;
        int var10 = field1739[arg0];
        int var11 = field1740[arg0];
        int var12 = field1739[arg1];
        int var13 = field1740[arg1];
        int var14 = field1739[arg2];
        int var15 = field1740[arg2];
        int var16 = field1739[arg3];
        int var17 = field1740[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1683; var19++) {
            int var20 = this.field1691[var19];
            int var21 = this.field1679[var19];
            int var22 = this.field1694[var19];
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
            field1716[var19] = var30 - var18;
            field1685[var19] = (var26 << 9) / var30 + var8;
            field1715[var19] = (var29 << 9) / var30 + var9;
            if (this.field1699 > 0) {
                field1717[var19] = var26;
                field1718[var19] = var29;
                field1719[var19] = var30;
            }
        }
        try {
            this.method2004(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cy.s(IIIIIIII)V")
    public final void method2003(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1702[0] = -1;
        if (this.field1729 != 2 && this.field1729 != 1) {
            this.method1991();
        }
        int var9 = Statics.field1461;
        int var10 = Statics.field1454;
        int var11 = field1739[arg0];
        int var12 = field1740[arg0];
        int var13 = field1739[arg1];
        int var14 = field1740[arg1];
        int var15 = field1739[arg2];
        int var16 = field1740[arg2];
        int var17 = field1739[arg3];
        int var18 = field1740[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1683; var20++) {
            int var21 = this.field1691[var20];
            int var22 = this.field1679[var20];
            int var23 = this.field1694[var20];
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
            field1716[var20] = var31 - var19;
            field1685[var20] = (var27 << 9) / arg7 + var9;
            field1715[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1699 > 0) {
                field1717[var20] = var27;
                field1718[var20] = var30;
                field1719[var20] = var31;
            }
        }
        try {
            this.method2004(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cy.l(IIIIIIIII)V")
    public void method1609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1702[0] = -1;
        if (this.field1729 != 1) {
            this.method1989();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1708 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1708 << 9;
        if (var15 / var13 >= Statics.field1458) {
            return;
        }
        int var16 = this.field1708 + var14 << 9;
        if (var16 / var13 <= Statics.field1457) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1708 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1459) {
            return;
        }
        int var20 = (this.field1339 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1451) {
            return;
        }
        int var22 = (this.field1339 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1699 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1734) {
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
            int var32 = field1735 - Statics.field1461;
            int var33 = field1736 - Statics.field1454;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1705) {
                    field1724[field1682++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1461;
        int var35 = Statics.field1454;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1739[arg0];
            var37 = field1740[arg0];
        }
        for (int var38 = 0; var38 < this.field1683; var38++) {
            int var39 = this.field1691[var38];
            int var40 = this.field1679[var38];
            int var41 = this.field1694[var38];
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
            field1716[var38] = var50 - var11;
            if (var50 >= 50) {
                field1685[var38] = (var46 << 9) / var50 + var34;
                field1715[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1685[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1717[var38] = var46;
                field1718[var38] = var49;
                field1719[var38] = var50;
            }
        }
        try {
            this.method2004(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cy.y(ZZI)V")
    public final void method2004(boolean arg0, boolean arg1, int arg2) {
        if (this.field1709 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1709; var4++) {
            field1702[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1696; var5++) {
            if (this.field1693[var5] != -2) {
                int var6 = this.field1688[var5];
                int var7 = this.field1714[var5];
                int var8 = this.field1690[var5];
                int var9 = field1685[var6];
                int var10 = field1685[var7];
                int var11 = field1685[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1717[var6];
                    int var13 = field1717[var7];
                    int var14 = field1717[var8];
                    int var15 = field1718[var6];
                    int var16 = field1718[var7];
                    int var17 = field1718[var8];
                    int var18 = field1719[var6];
                    int var19 = field1719[var7];
                    int var20 = field1719[var8];
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
                        field1713[var5] = true;
                        int var30 = (field1716[var6] + field1716[var7] + field1716[var8]) / 3 + this.field1710;
                        field1722[var30][field1702[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2007(field1735, field1736, field1715[var6], field1715[var7], field1715[var8], var9, var10, var11)) {
                        field1724[field1682++] = arg2;
                        arg1 = false;
                    }
                    if ((field1715[var8] - field1715[var7]) * (var9 - var10) - (field1715[var6] - field1715[var7]) * (var11 - var10) > 0) {
                        field1713[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1455 && var10 <= Statics.field1455 && var11 <= Statics.field1455) {
                            field1712[var5] = false;
                        } else {
                            field1712[var5] = true;
                        }
                        int var31 = (field1716[var6] + field1716[var7] + field1716[var8]) / 3 + this.field1710;
                        field1722[var31][field1702[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1720 == null) {
            for (int var32 = this.field1709 - 1; var32 >= 0; var32--) {
                int var33 = field1702[var32];
                if (var33 > 0) {
                    int[] var34 = field1722[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2005(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1723[var36] = 0;
            field1727[var36] = 0;
        }
        for (int var37 = this.field1709 - 1; var37 >= 0; var37--) {
            int var38 = field1702[var37];
            if (var38 > 0) {
                int[] var39 = field1722[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1720[var41];
                    int var43 = field1723[var42]++;
                    field1721[var42][var43] = var41;
                    if (var42 < 10) {
                        field1727[var42] += var37;
                    } else if (var42 == 10) {
                        field1725[var43] = var37;
                    } else {
                        field1686[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1723[1] > 0 || field1723[2] > 0) {
            var44 = (field1727[1] + field1727[2]) / (field1723[1] + field1723[2]);
        }
        int var45 = 0;
        if (field1723[3] > 0 || field1723[4] > 0) {
            var45 = (field1727[3] + field1727[4]) / (field1723[3] + field1723[4]);
        }
        int var46 = 0;
        if (field1723[6] > 0 || field1723[8] > 0) {
            var46 = (field1727[6] + field1727[8]) / (field1723[6] + field1723[8]);
        }
        int var47 = 0;
        int var48 = field1723[10];
        int[] var49 = field1721[10];
        int[] var50 = field1725;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1723[11];
            var49 = field1721[11];
            var50 = field1686;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2005(var49[var47++]);
                if (var47 == var48 && field1721[11] != var49) {
                    var47 = 0;
                    var48 = field1723[11];
                    var49 = field1721[11];
                    var50 = field1686;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2005(var49[var47++]);
                if (var47 == var48 && field1721[11] != var49) {
                    var47 = 0;
                    var48 = field1723[11];
                    var49 = field1721[11];
                    var50 = field1686;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2005(var49[var47++]);
                if (var47 == var48 && field1721[11] != var49) {
                    var47 = 0;
                    var48 = field1723[11];
                    var49 = field1721[11];
                    var50 = field1686;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1723[var52];
            int[] var54 = field1721[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2005(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2005(var49[var47++]);
            if (var47 == var48 && field1721[11] != var49) {
                var47 = 0;
                var49 = field1721[11];
                var48 = field1723[11];
                var50 = field1686;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cy.p(I)V")
    public final void method2005(int arg0) {
        if (field1713[arg0]) {
            this.method1986(arg0);
            return;
        }
        int var2 = this.field1688[arg0];
        int var3 = this.field1714[arg0];
        int var4 = this.field1690[arg0];
        class84.field1444 = field1712[arg0];
        if (this.field1684 == null) {
            class84.field1453 = 0;
        } else {
            class84.field1453 = this.field1684[arg0] & 0xFF;
        }
        if (this.field1706 != null && this.field1706[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1737 == null || this.field1737[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1737[arg0] & 0xFF;
                var6 = this.field1700[var5];
                var7 = this.field1701[var5];
                var8 = this.field1728[var5];
            }
            if (this.field1693[arg0] == -1) {
                class84.method1797(field1715[var2], field1715[var3], field1715[var4], field1685[var2], field1685[var3], field1685[var4], this.field1738[arg0], this.field1738[arg0], this.field1738[arg0], field1717[var6], field1717[var7], field1717[var8], field1718[var6], field1718[var7], field1718[var8], field1719[var6], field1719[var7], field1719[var8], this.field1706[arg0]);
            } else {
                class84.method1797(field1715[var2], field1715[var3], field1715[var4], field1685[var2], field1685[var3], field1685[var4], this.field1738[arg0], this.field1692[arg0], this.field1693[arg0], field1717[var6], field1717[var7], field1717[var8], field1718[var6], field1718[var7], field1718[var8], field1719[var6], field1719[var7], field1719[var8], this.field1706[arg0]);
            }
        } else if (this.field1693[arg0] == -1) {
            class84.method1827(field1715[var2], field1715[var3], field1715[var4], field1685[var2], field1685[var3], field1685[var4], field1741[this.field1738[arg0]]);
        } else {
            class84.method1793(field1715[var2], field1715[var3], field1715[var4], field1685[var2], field1685[var3], field1685[var4], this.field1738[arg0], this.field1692[arg0], this.field1693[arg0]);
        }
    }

    @ObfuscatedName("cy.b(I)V")
    public final void method1986(int arg0) {
        int var2 = Statics.field1461;
        int var3 = Statics.field1454;
        int var4 = 0;
        int var5 = this.field1688[arg0];
        int var6 = this.field1714[arg0];
        int var7 = this.field1690[arg0];
        int var8 = field1719[var5];
        int var9 = field1719[var6];
        int var10 = field1719[var7];
        if (this.field1684 == null) {
            class84.field1453 = 0;
        } else {
            class84.field1453 = this.field1684[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1681[var4] = field1685[var5];
            field1695[var4] = field1715[var5];
            field1730[var4++] = this.field1738[arg0];
        } else {
            int var11 = field1717[var5];
            int var12 = field1718[var5];
            int var13 = this.field1738[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1742[var10 - var8];
                field1681[var4] = (((field1717[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1695[var4] = (((field1718[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1730[var4++] = ((this.field1693[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1742[var9 - var8];
                field1681[var4] = (((field1717[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1695[var4] = (((field1718[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1730[var4++] = ((this.field1692[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1681[var4] = field1685[var6];
            field1695[var4] = field1715[var6];
            field1730[var4++] = this.field1692[arg0];
        } else {
            int var16 = field1717[var6];
            int var17 = field1718[var6];
            int var18 = this.field1692[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1742[var8 - var9];
                field1681[var4] = (((field1717[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1695[var4] = (((field1718[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1730[var4++] = ((this.field1738[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1742[var10 - var9];
                field1681[var4] = (((field1717[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1695[var4] = (((field1718[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1730[var4++] = ((this.field1693[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1681[var4] = field1685[var7];
            field1695[var4] = field1715[var7];
            field1730[var4++] = this.field1693[arg0];
        } else {
            int var21 = field1717[var7];
            int var22 = field1718[var7];
            int var23 = this.field1693[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1742[var9 - var10];
                field1681[var4] = (((field1717[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1695[var4] = (((field1718[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1730[var4++] = ((this.field1692[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1742[var8 - var10];
                field1681[var4] = (((field1717[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1695[var4] = (((field1718[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1730[var4++] = ((this.field1738[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1681[0];
        int var27 = field1681[1];
        int var28 = field1681[2];
        int var29 = field1695[0];
        int var30 = field1695[1];
        int var31 = field1695[2];
        class84.field1444 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1455 || var27 > Statics.field1455 || var28 > Statics.field1455) {
                class84.field1444 = true;
            }
            if (this.field1706 != null && this.field1706[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1737 == null || this.field1737[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1737[arg0] & 0xFF;
                    var33 = this.field1700[var32];
                    var34 = this.field1701[var32];
                    var35 = this.field1728[var32];
                }
                if (this.field1693[arg0] == -1) {
                    class84.method1797(var29, var30, var31, var26, var27, var28, this.field1738[arg0], this.field1738[arg0], this.field1738[arg0], field1717[var33], field1717[var34], field1717[var35], field1718[var33], field1718[var34], field1718[var35], field1719[var33], field1719[var34], field1719[var35], this.field1706[arg0]);
                } else {
                    class84.method1797(var29, var30, var31, var26, var27, var28, field1730[0], field1730[1], field1730[2], field1717[var33], field1717[var34], field1717[var35], field1718[var33], field1718[var34], field1718[var35], field1719[var33], field1719[var34], field1719[var35], this.field1706[arg0]);
                }
            } else if (this.field1693[arg0] == -1) {
                class84.method1827(var29, var30, var31, var26, var27, var28, field1741[this.field1738[arg0]]);
            } else {
                class84.method1793(var29, var30, var31, var26, var27, var28, field1730[0], field1730[1], field1730[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1455 || var27 > Statics.field1455 || var28 > Statics.field1455 || field1681[3] < 0 || field1681[3] > Statics.field1455) {
            class84.field1444 = true;
        }
        if (this.field1706 != null && this.field1706[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1737 == null || this.field1737[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1737[arg0] & 0xFF;
                var37 = this.field1700[var36];
                var38 = this.field1701[var36];
                var39 = this.field1728[var36];
            }
            short var40 = this.field1706[arg0];
            if (this.field1693[arg0] == -1) {
                class84.method1797(var29, var30, var31, var26, var27, var28, this.field1738[arg0], this.field1738[arg0], this.field1738[arg0], field1717[var37], field1717[var38], field1717[var39], field1718[var37], field1718[var38], field1718[var39], field1719[var37], field1719[var38], field1719[var39], var40);
                class84.method1797(var29, var31, field1695[3], var26, var28, field1681[3], this.field1738[arg0], this.field1738[arg0], this.field1738[arg0], field1717[var37], field1717[var38], field1717[var39], field1718[var37], field1718[var38], field1718[var39], field1719[var37], field1719[var38], field1719[var39], var40);
            } else {
                class84.method1797(var29, var30, var31, var26, var27, var28, field1730[0], field1730[1], field1730[2], field1717[var37], field1717[var38], field1717[var39], field1718[var37], field1718[var38], field1718[var39], field1719[var37], field1719[var38], field1719[var39], var40);
                class84.method1797(var29, var31, field1695[3], var26, var28, field1681[3], field1730[0], field1730[2], field1730[3], field1717[var37], field1717[var38], field1717[var39], field1718[var37], field1718[var38], field1718[var39], field1719[var37], field1719[var38], field1719[var39], var40);
            }
        } else if (this.field1693[arg0] == -1) {
            int var41 = field1741[this.field1738[arg0]];
            class84.method1827(var29, var30, var31, var26, var27, var28, var41);
            class84.method1827(var29, var31, field1695[3], var26, var28, field1681[3], var41);
        } else {
            class84.method1793(var29, var30, var31, var26, var27, var28, field1730[0], field1730[1], field1730[2]);
            class84.method1793(var29, var31, field1695[3], var26, var28, field1681[3], field1730[0], field1730[2], field1730[3]);
        }
    }

    @ObfuscatedName("cy.ar(IIIIIIII)Z")
    public final boolean method2007(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
