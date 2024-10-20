package deob;

@ObfuscatedName("cu")
public class class98 extends class78 {

    @ObfuscatedName("cu.z")
    public static class98 field1691 = new class98();

    @ObfuscatedName("cu.j")
    public static byte[] field1675 = new byte[1];

    @ObfuscatedName("cu.a")
    public static class98 field1676 = new class98();

    @ObfuscatedName("cu.y")
    public static byte[] field1677 = new byte[1];

    @ObfuscatedName("cu.i")
    public int field1697 = 0;

    @ObfuscatedName("cu.b")
    public int[] field1679;

    @ObfuscatedName("cu.s")
    public int[] field1680;

    @ObfuscatedName("cu.q")
    public int[] field1681;

    @ObfuscatedName("cu.p")
    public int field1722 = 0;

    @ObfuscatedName("cu.h")
    public int[] field1683;

    @ObfuscatedName("cu.r")
    public int[] field1684;

    @ObfuscatedName("cu.o")
    public int[] field1718;

    @ObfuscatedName("cu.f")
    public int[] field1686;

    @ObfuscatedName("cu.u")
    public int[] field1687;

    @ObfuscatedName("cu.c")
    public int[] field1711;

    @ObfuscatedName("cu.l")
    public byte[] field1728;

    @ObfuscatedName("cu.w")
    public byte[] field1690;

    @ObfuscatedName("cu.x")
    public byte[] field1699;

    @ObfuscatedName("cu.t")
    public short[] field1692;

    @ObfuscatedName("cu.k")
    public byte field1693 = 0;

    @ObfuscatedName("cu.e")
    public int field1694 = 0;

    @ObfuscatedName("cu.v")
    public int[] field1729;

    @ObfuscatedName("cu.n")
    public int[] field1727;

    @ObfuscatedName("cu.d")
    public int[] field1682;

    @ObfuscatedName("cu.m")
    public int[][] field1698;

    @ObfuscatedName("cu.g")
    public int[][] field1736;

    @ObfuscatedName("cu.aq")
    public boolean field1700 = false;

    @ObfuscatedName("cu.ao")
    public int field1701;

    @ObfuscatedName("cu.af")
    public int field1702;

    @ObfuscatedName("cu.ag")
    public int field1720;

    @ObfuscatedName("cu.ad")
    public int field1704;

    @ObfuscatedName("cu.ak")
    public int field1705;

    @ObfuscatedName("cu.as")
    public static boolean[] field1707 = new boolean[4096];

    @ObfuscatedName("cu.al")
    public static boolean[] field1708 = new boolean[4096];

    @ObfuscatedName("cu.ai")
    public static int[] field1709 = new int[4096];

    @ObfuscatedName("cu.az")
    public static int[] field1710 = new int[4096];

    @ObfuscatedName("cu.aw")
    public static int[] field1734 = new int[4096];

    @ObfuscatedName("cu.ay")
    public static int[] field1712 = new int[4096];

    @ObfuscatedName("cu.au")
    public static int[] field1713 = new int[4096];

    @ObfuscatedName("cu.ar")
    public static int[] field1714 = new int[4096];

    @ObfuscatedName("cu.an")
    public static int[] field1716 = new int[1600];

    @ObfuscatedName("cu.ae")
    public static int[][] field1717 = new int[1600][512];

    @ObfuscatedName("cu.aa")
    public static int[] field1688 = new int[12];

    @ObfuscatedName("cu.ax")
    public static int[][] field1733 = new int[12][2000];

    @ObfuscatedName("cu.am")
    public static int[] field1674 = new int[2000];

    @ObfuscatedName("cu.ab")
    public static int[] field1695 = new int[2000];

    @ObfuscatedName("cu.at")
    public static int[] field1719 = new int[12];

    @ObfuscatedName("cu.ah")
    public static int[] field1723 = new int[10];

    @ObfuscatedName("cu.ac")
    public static int[] field1724 = new int[10];

    @ObfuscatedName("cu.av")
    public static int[] field1703 = new int[10];

    @ObfuscatedName("cu.bi")
    public static boolean field1738 = false;

    @ObfuscatedName("cu.bz")
    public static int field1730 = 0;

    @ObfuscatedName("cu.be")
    public static int field1731 = 0;

    @ObfuscatedName("cu.bm")
    public static int field1732 = 0;

    @ObfuscatedName("cu.bq")
    public static int[] field1685 = new int[1000];

    @ObfuscatedName("cu.bu")
    public static int[] field1721 = class84.field1447;

    @ObfuscatedName("cu.bo")
    public static int[] field1735 = class84.field1454;

    @ObfuscatedName("cu.bh")
    public static int[] field1678 = class84.field1449;

    @ObfuscatedName("cu.bb")
    public static int[] field1737 = class84.field1452;

    public class98() {
    }

    public class98(class98[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1697 = 0;
        this.field1722 = 0;
        this.field1694 = 0;
        this.field1693 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class98 var8 = arg0[var7];
            if (var8 != null) {
                this.field1697 += var8.field1697;
                this.field1722 += var8.field1722;
                this.field1694 += var8.field1694;
                if (var8.field1728 == null) {
                    if (this.field1693 == -1) {
                        this.field1693 = var8.field1693;
                    }
                    if (this.field1693 != var8.field1693) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1690 != null;
                var5 |= var8.field1692 != null;
                var6 |= var8.field1699 != null;
            }
        }
        this.field1679 = new int[this.field1697];
        this.field1680 = new int[this.field1697];
        this.field1681 = new int[this.field1697];
        this.field1683 = new int[this.field1722];
        this.field1684 = new int[this.field1722];
        this.field1718 = new int[this.field1722];
        this.field1686 = new int[this.field1722];
        this.field1687 = new int[this.field1722];
        this.field1711 = new int[this.field1722];
        if (var3) {
            this.field1728 = new byte[this.field1722];
        }
        if (var4) {
            this.field1690 = new byte[this.field1722];
        }
        if (var5) {
            this.field1692 = new short[this.field1722];
        }
        if (var6) {
            this.field1699 = new byte[this.field1722];
        }
        if (this.field1694 > 0) {
            this.field1729 = new int[this.field1694];
            this.field1727 = new int[this.field1694];
            this.field1682 = new int[this.field1694];
        }
        this.field1697 = 0;
        this.field1722 = 0;
        this.field1694 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class98 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1722; var11++) {
                    this.field1683[this.field1722] = var10.field1683[var11] + this.field1697;
                    this.field1684[this.field1722] = var10.field1684[var11] + this.field1697;
                    this.field1718[this.field1722] = var10.field1718[var11] + this.field1697;
                    this.field1686[this.field1722] = var10.field1686[var11];
                    this.field1687[this.field1722] = var10.field1687[var11];
                    this.field1711[this.field1722] = var10.field1711[var11];
                    if (var3) {
                        if (var10.field1728 == null) {
                            this.field1728[this.field1722] = var10.field1693;
                        } else {
                            this.field1728[this.field1722] = var10.field1728[var11];
                        }
                    }
                    if (var4 && var10.field1690 != null) {
                        this.field1690[this.field1722] = var10.field1690[var11];
                    }
                    if (var5) {
                        if (var10.field1692 == null) {
                            this.field1692[this.field1722] = -1;
                        } else {
                            this.field1692[this.field1722] = var10.field1692[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1699 == null || var10.field1699[var11] == -1) {
                            this.field1699[this.field1722] = -1;
                        } else {
                            this.field1699[this.field1722] = (byte) (var10.field1699[var11] + this.field1694);
                        }
                    }
                    this.field1722++;
                }
                for (int var12 = 0; var12 < var10.field1694; var12++) {
                    this.field1729[this.field1694] = var10.field1729[var12] + this.field1697;
                    this.field1727[this.field1694] = var10.field1727[var12] + this.field1697;
                    this.field1682[this.field1694] = var10.field1682[var12] + this.field1697;
                    this.field1694++;
                }
                for (int var13 = 0; var13 < var10.field1697; var13++) {
                    this.field1679[this.field1697] = var10.field1679[var13];
                    this.field1680[this.field1697] = var10.field1680[var13];
                    this.field1681[this.field1697] = var10.field1681[var13];
                    this.field1697++;
                }
            }
        }
    }

    @ObfuscatedName("cu.z([[IIIIZI)Lcu;")
    public class98 method1977(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1981();
        int var7 = arg1 - this.field1720;
        int var8 = this.field1720 + arg1;
        int var9 = arg3 - this.field1720;
        int var10 = this.field1720 + arg3;
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
            var15.field1697 = this.field1697;
            var15.field1722 = this.field1722;
            var15.field1694 = this.field1694;
            var15.field1679 = this.field1679;
            var15.field1681 = this.field1681;
            var15.field1683 = this.field1683;
            var15.field1684 = this.field1684;
            var15.field1718 = this.field1718;
            var15.field1686 = this.field1686;
            var15.field1687 = this.field1687;
            var15.field1711 = this.field1711;
            var15.field1728 = this.field1728;
            var15.field1690 = this.field1690;
            var15.field1699 = this.field1699;
            var15.field1692 = this.field1692;
            var15.field1693 = this.field1693;
            var15.field1729 = this.field1729;
            var15.field1727 = this.field1727;
            var15.field1682 = this.field1682;
            var15.field1698 = this.field1698;
            var15.field1736 = this.field1736;
            var15.field1700 = this.field1700;
            var15.field1680 = new int[var15.field1697];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1697; var16++) {
                int var17 = this.field1679[var16] + arg1;
                int var18 = this.field1681[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1680[var16] = this.field1680[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1697; var26++) {
                int var27 = (-this.field1680[var26] << 16) / this.field1328;
                if (var27 < arg5) {
                    int var28 = this.field1679[var26] + arg1;
                    int var29 = this.field1681[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1680[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1680[var26];
                }
            }
        }
        var15.field1701 = 0;
        return var15;
    }

    @ObfuscatedName("cu.a(Z)Lcu;")
    public class98 method1999(boolean arg0) {
        if (!arg0 && field1675.length < this.field1722) {
            field1675 = new byte[this.field1722 + 100];
        }
        return this.method1980(arg0, field1691, field1675);
    }

    @ObfuscatedName("cu.y(Z)Lcu;")
    public class98 method1979(boolean arg0) {
        if (!arg0 && field1677.length < this.field1722) {
            field1677 = new byte[this.field1722 + 100];
        }
        return this.method1980(arg0, field1676, field1677);
    }

    @ObfuscatedName("cu.i(ZLcu;[B)Lcu;")
    public class98 method1980(boolean arg0, class98 arg1, byte[] arg2) {
        arg1.field1697 = this.field1697;
        arg1.field1722 = this.field1722;
        arg1.field1694 = this.field1694;
        if (arg1.field1679 == null || arg1.field1679.length < this.field1697) {
            arg1.field1679 = new int[this.field1697 + 100];
            arg1.field1680 = new int[this.field1697 + 100];
            arg1.field1681 = new int[this.field1697 + 100];
        }
        for (int var4 = 0; var4 < this.field1697; var4++) {
            arg1.field1679[var4] = this.field1679[var4];
            arg1.field1680[var4] = this.field1680[var4];
            arg1.field1681[var4] = this.field1681[var4];
        }
        if (arg0) {
            arg1.field1690 = this.field1690;
        } else {
            arg1.field1690 = arg2;
            if (this.field1690 == null) {
                for (int var5 = 0; var5 < this.field1722; var5++) {
                    arg1.field1690[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1722; var6++) {
                    arg1.field1690[var6] = this.field1690[var6];
                }
            }
        }
        arg1.field1683 = this.field1683;
        arg1.field1684 = this.field1684;
        arg1.field1718 = this.field1718;
        arg1.field1686 = this.field1686;
        arg1.field1687 = this.field1687;
        arg1.field1711 = this.field1711;
        arg1.field1728 = this.field1728;
        arg1.field1699 = this.field1699;
        arg1.field1692 = this.field1692;
        arg1.field1693 = this.field1693;
        arg1.field1729 = this.field1729;
        arg1.field1727 = this.field1727;
        arg1.field1682 = this.field1682;
        arg1.field1698 = this.field1698;
        arg1.field1736 = this.field1736;
        arg1.field1700 = this.field1700;
        arg1.field1701 = 0;
        return arg1;
    }

    @ObfuscatedName("cu.p()V")
    public void method1981() {
        if (this.field1701 == 1) {
            return;
        }
        this.field1701 = 1;
        this.field1328 = 0;
        this.field1702 = 0;
        this.field1720 = 0;
        for (int var1 = 0; var1 < this.field1697; var1++) {
            int var2 = this.field1679[var1];
            int var3 = this.field1680[var1];
            int var4 = this.field1681[var1];
            if (-var3 > this.field1328) {
                this.field1328 = -var3;
            }
            if (var3 > this.field1702) {
                this.field1702 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1720) {
                this.field1720 = var5;
            }
        }
        this.field1720 = (int) (Math.sqrt((double) this.field1720) + 0.99D);
        this.field1705 = (int) (Math.sqrt((double) (this.field1328 * this.field1328 + this.field1720 * this.field1720)) + 0.99D);
        this.field1704 = this.field1705 + (int) (Math.sqrt((double) (this.field1720 * this.field1720 + this.field1702 * this.field1702)) + 0.99D);
    }

    @ObfuscatedName("cu.h()V")
    public void method1982() {
        if (this.field1701 == 2) {
            return;
        }
        this.field1701 = 2;
        this.field1720 = 0;
        for (int var1 = 0; var1 < this.field1697; var1++) {
            int var2 = this.field1679[var1];
            int var3 = this.field1680[var1];
            int var4 = this.field1681[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1720) {
                this.field1720 = var5;
            }
        }
        this.field1720 = (int) (Math.sqrt((double) this.field1720) + 0.99D);
        this.field1705 = this.field1720;
        this.field1704 = this.field1720 + this.field1720;
    }

    @ObfuscatedName("cu.r()I")
    public int method1983() {
        this.method1981();
        return this.field1720;
    }

    @ObfuscatedName("cu.o(Lch;I)V")
    public void method1984(class96 arg0, int arg1) {
        if (this.field1698 == null || arg1 == -1) {
            return;
        }
        class81 var3 = arg0.field1646[arg1];
        class95 var4 = var3.field1406;
        Statics.field1726 = 0;
        Statics.field1725 = 0;
        Statics.field1696 = 0;
        for (int var5 = 0; var5 < var3.field1405; var5++) {
            int var6 = var3.field1409[var5];
            this.method1986(var4.field1639[var6], var4.field1645[var6], var3.field1410[var5], var3.field1411[var5], var3.field1412[var5]);
        }
        this.field1701 = 0;
    }

    @ObfuscatedName("cu.f(Lch;ILch;I[I)V")
    public void method1985(class96 arg0, int arg1, class96 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1984(arg0, arg1);
            return;
        }
        class81 var6 = arg0.field1646[arg1];
        class81 var7 = arg2.field1646[arg3];
        class95 var8 = var6.field1406;
        Statics.field1726 = 0;
        Statics.field1725 = 0;
        Statics.field1696 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1405; var11++) {
            int var12 = var6.field1409[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1639[var12] == 0) {
                this.method1986(var8.field1639[var12], var8.field1645[var12], var6.field1410[var11], var6.field1411[var11], var6.field1412[var11]);
            }
        }
        Statics.field1726 = 0;
        Statics.field1725 = 0;
        Statics.field1696 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1405; var15++) {
            int var16 = var7.field1409[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1639[var16] == 0) {
                this.method1986(var8.field1639[var16], var8.field1645[var16], var7.field1410[var15], var7.field1411[var15], var7.field1412[var15]);
            }
        }
        this.field1701 = 0;
    }

    @ObfuscatedName("cu.u(I[IIII)V")
    public void method1986(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1726 = 0;
            Statics.field1725 = 0;
            Statics.field1696 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1698.length) {
                    int[] var10 = this.field1698[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1726 += this.field1679[var12];
                        Statics.field1725 += this.field1680[var12];
                        Statics.field1696 += this.field1681[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1726 = Statics.field1726 / var7 + arg2;
                Statics.field1725 = Statics.field1725 / var7 + arg3;
                Statics.field1696 = Statics.field1696 / var7 + arg4;
            } else {
                Statics.field1726 = arg2;
                Statics.field1725 = arg3;
                Statics.field1696 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1698.length) {
                    int[] var15 = this.field1698[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1679[var17] += arg2;
                        this.field1680[var17] += arg3;
                        this.field1681[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1698.length) {
                    int[] var20 = this.field1698[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1679[var22] -= Statics.field1726;
                        this.field1680[var22] -= Statics.field1725;
                        this.field1681[var22] -= Statics.field1696;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1721[var25];
                            int var27 = field1735[var25];
                            int var28 = this.field1680[var22] * var26 + this.field1679[var22] * var27 >> 16;
                            this.field1680[var22] = this.field1680[var22] * var27 - this.field1679[var22] * var26 >> 16;
                            this.field1679[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1721[var23];
                            int var30 = field1735[var23];
                            int var31 = this.field1680[var22] * var30 - this.field1681[var22] * var29 >> 16;
                            this.field1681[var22] = this.field1681[var22] * var30 + this.field1680[var22] * var29 >> 16;
                            this.field1680[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1721[var24];
                            int var33 = field1735[var24];
                            int var34 = this.field1681[var22] * var32 + this.field1679[var22] * var33 >> 16;
                            this.field1681[var22] = this.field1681[var22] * var33 - this.field1679[var22] * var32 >> 16;
                            this.field1679[var22] = var34;
                        }
                        this.field1679[var22] += Statics.field1726;
                        this.field1680[var22] += Statics.field1725;
                        this.field1681[var22] += Statics.field1696;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1698.length) {
                    int[] var37 = this.field1698[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1679[var39] -= Statics.field1726;
                        this.field1680[var39] -= Statics.field1725;
                        this.field1681[var39] -= Statics.field1696;
                        this.field1679[var39] = this.field1679[var39] * arg2 / 128;
                        this.field1680[var39] = this.field1680[var39] * arg3 / 128;
                        this.field1681[var39] = this.field1681[var39] * arg4 / 128;
                        this.field1679[var39] += Statics.field1726;
                        this.field1680[var39] += Statics.field1725;
                        this.field1681[var39] += Statics.field1696;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1736 != null && this.field1690 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1736.length) {
                    int[] var42 = this.field1736[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1690[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1690[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cu.c()V")
    public void method2045() {
        for (int var1 = 0; var1 < this.field1697; var1++) {
            int var2 = this.field1679[var1];
            this.field1679[var1] = this.field1681[var1];
            this.field1681[var1] = -var2;
        }
        this.field1701 = 0;
    }

    @ObfuscatedName("cu.l()V")
    public void method1988() {
        for (int var1 = 0; var1 < this.field1697; var1++) {
            this.field1679[var1] = -this.field1679[var1];
            this.field1681[var1] = -this.field1681[var1];
        }
        this.field1701 = 0;
    }

    @ObfuscatedName("cu.w()V")
    public void method1989() {
        for (int var1 = 0; var1 < this.field1697; var1++) {
            int var2 = this.field1681[var1];
            this.field1681[var1] = this.field1679[var1];
            this.field1679[var1] = -var2;
        }
        this.field1701 = 0;
    }

    @ObfuscatedName("cu.x(I)V")
    public void method2044(int arg0) {
        int var2 = field1721[arg0];
        int var3 = field1735[arg0];
        for (int var4 = 0; var4 < this.field1697; var4++) {
            int var5 = this.field1680[var4] * var3 - this.field1681[var4] * var2 >> 16;
            this.field1681[var4] = this.field1681[var4] * var3 + this.field1680[var4] * var2 >> 16;
            this.field1680[var4] = var5;
        }
        this.field1701 = 0;
    }

    @ObfuscatedName("cu.t(III)V")
    public void method2000(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1697; var4++) {
            this.field1679[var4] += arg0;
            this.field1680[var4] += arg1;
            this.field1681[var4] += arg2;
        }
        this.field1701 = 0;
    }

    @ObfuscatedName("cu.k(III)V")
    public void method2008(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1697; var4++) {
            this.field1679[var4] = this.field1679[var4] * arg0 / 128;
            this.field1680[var4] = this.field1680[var4] * arg1 / 128;
            this.field1681[var4] = this.field1681[var4] * arg2 / 128;
        }
        this.field1701 = 0;
    }

    @ObfuscatedName("cu.g(IIIIIII)V")
    public final void method1993(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1716[0] = -1;
        if (this.field1701 != 2 && this.field1701 != 1) {
            this.method1982();
        }
        int var8 = Statics.field1440;
        int var9 = Statics.field1441;
        int var10 = field1721[arg0];
        int var11 = field1735[arg0];
        int var12 = field1721[arg1];
        int var13 = field1735[arg1];
        int var14 = field1721[arg2];
        int var15 = field1735[arg2];
        int var16 = field1721[arg3];
        int var17 = field1735[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1697; var19++) {
            int var20 = this.field1679[var19];
            int var21 = this.field1680[var19];
            int var22 = this.field1681[var19];
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
            field1734[var19] = var30 - var18;
            field1709[var19] = (var26 << 9) / var30 + var8;
            field1710[var19] = (var29 << 9) / var30 + var9;
            if (this.field1694 > 0) {
                field1712[var19] = var26;
                field1713[var19] = var29;
                field1714[var19] = var30;
            }
        }
        try {
            this.method1996(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cu.aq(IIIIIIII)V")
    public final void method1994(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1716[0] = -1;
        if (this.field1701 != 2 && this.field1701 != 1) {
            this.method1982();
        }
        int var9 = Statics.field1440;
        int var10 = Statics.field1441;
        int var11 = field1721[arg0];
        int var12 = field1735[arg0];
        int var13 = field1721[arg1];
        int var14 = field1735[arg1];
        int var15 = field1721[arg2];
        int var16 = field1735[arg2];
        int var17 = field1721[arg3];
        int var18 = field1735[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1697; var20++) {
            int var21 = this.field1679[var20];
            int var22 = this.field1680[var20];
            int var23 = this.field1681[var20];
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
            field1734[var20] = var31 - var19;
            field1709[var20] = (var27 << 9) / arg7 + var9;
            field1710[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1694 > 0) {
                field1712[var20] = var27;
                field1713[var20] = var30;
                field1714[var20] = var31;
            }
        }
        try {
            this.method1996(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cu.e(IIIIIIIII)V")
    public void method1595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1716[0] = -1;
        if (this.field1701 != 1) {
            this.method1981();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1720 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1720 << 9;
        if (var15 / var13 >= Statics.field1445) {
            return;
        }
        int var16 = this.field1720 + var14 << 9;
        if (var16 / var13 <= Statics.field1436) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1720 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1444) {
            return;
        }
        int var20 = (this.field1328 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1434) {
            return;
        }
        int var22 = (this.field1328 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1694 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1738) {
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
            int var32 = field1730 - Statics.field1440;
            int var33 = field1731 - Statics.field1441;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1700) {
                    field1685[field1732++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1440;
        int var35 = Statics.field1441;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1721[arg0];
            var37 = field1735[arg0];
        }
        for (int var38 = 0; var38 < this.field1697; var38++) {
            int var39 = this.field1679[var38];
            int var40 = this.field1680[var38];
            int var41 = this.field1681[var38];
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
            field1734[var38] = var50 - var11;
            if (var50 >= 50) {
                field1709[var38] = (var46 << 9) / var50 + var34;
                field1710[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1709[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1712[var38] = var46;
                field1713[var38] = var49;
                field1714[var38] = var50;
            }
        }
        try {
            this.method1996(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cu.ao(ZZI)V")
    public final void method1996(boolean arg0, boolean arg1, int arg2) {
        if (this.field1704 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1704; var4++) {
            field1716[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1722; var5++) {
            if (this.field1711[var5] != -2) {
                int var6 = this.field1683[var5];
                int var7 = this.field1684[var5];
                int var8 = this.field1718[var5];
                int var9 = field1709[var6];
                int var10 = field1709[var7];
                int var11 = field1709[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1712[var6];
                    int var13 = field1712[var7];
                    int var14 = field1712[var8];
                    int var15 = field1713[var6];
                    int var16 = field1713[var7];
                    int var17 = field1713[var8];
                    int var18 = field1714[var6];
                    int var19 = field1714[var7];
                    int var20 = field1714[var8];
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
                        field1708[var5] = true;
                        int var30 = (field1734[var6] + field1734[var7] + field1734[var8]) / 3 + this.field1705;
                        field1717[var30][field1716[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method1995(field1730, field1731, field1710[var6], field1710[var7], field1710[var8], var9, var10, var11)) {
                        field1685[field1732++] = arg2;
                        arg1 = false;
                    }
                    if ((field1710[var8] - field1710[var7]) * (var9 - var10) - (field1710[var6] - field1710[var7]) * (var11 - var10) > 0) {
                        field1708[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1442 && var10 <= Statics.field1442 && var11 <= Statics.field1442) {
                            field1707[var5] = false;
                        } else {
                            field1707[var5] = true;
                        }
                        int var31 = (field1734[var6] + field1734[var7] + field1734[var8]) / 3 + this.field1705;
                        field1717[var31][field1716[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1728 == null) {
            for (int var32 = this.field1704 - 1; var32 >= 0; var32--) {
                int var33 = field1716[var32];
                if (var33 > 0) {
                    int[] var34 = field1717[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method1997(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1688[var36] = 0;
            field1719[var36] = 0;
        }
        for (int var37 = this.field1704 - 1; var37 >= 0; var37--) {
            int var38 = field1716[var37];
            if (var38 > 0) {
                int[] var39 = field1717[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1728[var41];
                    int var43 = field1688[var42]++;
                    field1733[var42][var43] = var41;
                    if (var42 < 10) {
                        field1719[var42] += var37;
                    } else if (var42 == 10) {
                        field1674[var43] = var37;
                    } else {
                        field1695[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1688[1] > 0 || field1688[2] > 0) {
            var44 = (field1719[1] + field1719[2]) / (field1688[1] + field1688[2]);
        }
        int var45 = 0;
        if (field1688[3] > 0 || field1688[4] > 0) {
            var45 = (field1719[3] + field1719[4]) / (field1688[3] + field1688[4]);
        }
        int var46 = 0;
        if (field1688[6] > 0 || field1688[8] > 0) {
            var46 = (field1719[6] + field1719[8]) / (field1688[6] + field1688[8]);
        }
        int var47 = 0;
        int var48 = field1688[10];
        int[] var49 = field1733[10];
        int[] var50 = field1674;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1688[11];
            var49 = field1733[11];
            var50 = field1695;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method1997(var49[var47++]);
                if (var47 == var48 && field1733[11] != var49) {
                    var47 = 0;
                    var48 = field1688[11];
                    var49 = field1733[11];
                    var50 = field1695;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method1997(var49[var47++]);
                if (var47 == var48 && field1733[11] != var49) {
                    var47 = 0;
                    var48 = field1688[11];
                    var49 = field1733[11];
                    var50 = field1695;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method1997(var49[var47++]);
                if (var47 == var48 && field1733[11] != var49) {
                    var47 = 0;
                    var48 = field1688[11];
                    var49 = field1733[11];
                    var50 = field1695;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1688[var52];
            int[] var54 = field1733[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method1997(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method1997(var49[var47++]);
            if (var47 == var48 && field1733[11] != var49) {
                var47 = 0;
                var49 = field1733[11];
                var48 = field1688[11];
                var50 = field1695;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cu.af(I)V")
    public final void method1997(int arg0) {
        if (field1708[arg0]) {
            this.method1992(arg0);
            return;
        }
        int var2 = this.field1683[arg0];
        int var3 = this.field1684[arg0];
        int var4 = this.field1718[arg0];
        class84.field1437 = field1707[arg0];
        if (this.field1690 == null) {
            class84.field1453 = 0;
        } else {
            class84.field1453 = this.field1690[arg0] & 0xFF;
        }
        if (this.field1692 != null && this.field1692[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1699 == null || this.field1699[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1699[arg0] & 0xFF;
                var6 = this.field1729[var5];
                var7 = this.field1727[var5];
                var8 = this.field1682[var5];
            }
            if (this.field1711[arg0] == -1) {
                class84.method1815(field1710[var2], field1710[var3], field1710[var4], field1709[var2], field1709[var3], field1709[var4], this.field1686[arg0], this.field1686[arg0], this.field1686[arg0], field1712[var6], field1712[var7], field1712[var8], field1713[var6], field1713[var7], field1713[var8], field1714[var6], field1714[var7], field1714[var8], this.field1692[arg0]);
            } else {
                class84.method1815(field1710[var2], field1710[var3], field1710[var4], field1709[var2], field1709[var3], field1709[var4], this.field1686[arg0], this.field1687[arg0], this.field1711[arg0], field1712[var6], field1712[var7], field1712[var8], field1713[var6], field1713[var7], field1713[var8], field1714[var6], field1714[var7], field1714[var8], this.field1692[arg0]);
            }
        } else if (this.field1711[arg0] == -1) {
            class84.method1793(field1710[var2], field1710[var3], field1710[var4], field1709[var2], field1709[var3], field1709[var4], field1678[this.field1686[arg0]]);
        } else {
            class84.method1791(field1710[var2], field1710[var3], field1710[var4], field1709[var2], field1709[var3], field1709[var4], this.field1686[arg0], this.field1687[arg0], this.field1711[arg0]);
        }
    }

    @ObfuscatedName("cu.ag(I)V")
    public final void method1992(int arg0) {
        int var2 = Statics.field1440;
        int var3 = Statics.field1441;
        int var4 = 0;
        int var5 = this.field1683[arg0];
        int var6 = this.field1684[arg0];
        int var7 = this.field1718[arg0];
        int var8 = field1714[var5];
        int var9 = field1714[var6];
        int var10 = field1714[var7];
        if (this.field1690 == null) {
            class84.field1453 = 0;
        } else {
            class84.field1453 = this.field1690[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1723[var4] = field1709[var5];
            field1724[var4] = field1710[var5];
            field1703[var4++] = this.field1686[arg0];
        } else {
            int var11 = field1712[var5];
            int var12 = field1713[var5];
            int var13 = this.field1686[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1737[var10 - var8];
                field1723[var4] = (((field1712[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1724[var4] = (((field1713[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1703[var4++] = ((this.field1711[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1737[var9 - var8];
                field1723[var4] = (((field1712[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1724[var4] = (((field1713[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1703[var4++] = ((this.field1687[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1723[var4] = field1709[var6];
            field1724[var4] = field1710[var6];
            field1703[var4++] = this.field1687[arg0];
        } else {
            int var16 = field1712[var6];
            int var17 = field1713[var6];
            int var18 = this.field1687[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1737[var8 - var9];
                field1723[var4] = (((field1712[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1724[var4] = (((field1713[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1703[var4++] = ((this.field1686[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1737[var10 - var9];
                field1723[var4] = (((field1712[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1724[var4] = (((field1713[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1703[var4++] = ((this.field1711[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1723[var4] = field1709[var7];
            field1724[var4] = field1710[var7];
            field1703[var4++] = this.field1711[arg0];
        } else {
            int var21 = field1712[var7];
            int var22 = field1713[var7];
            int var23 = this.field1711[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1737[var9 - var10];
                field1723[var4] = (((field1712[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1724[var4] = (((field1713[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1703[var4++] = ((this.field1687[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1737[var8 - var10];
                field1723[var4] = (((field1712[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1724[var4] = (((field1713[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1703[var4++] = ((this.field1686[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1723[0];
        int var27 = field1723[1];
        int var28 = field1723[2];
        int var29 = field1724[0];
        int var30 = field1724[1];
        int var31 = field1724[2];
        class84.field1437 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1442 || var27 > Statics.field1442 || var28 > Statics.field1442) {
                class84.field1437 = true;
            }
            if (this.field1692 != null && this.field1692[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1699 == null || this.field1699[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1699[arg0] & 0xFF;
                    var33 = this.field1729[var32];
                    var34 = this.field1727[var32];
                    var35 = this.field1682[var32];
                }
                if (this.field1711[arg0] == -1) {
                    class84.method1815(var29, var30, var31, var26, var27, var28, this.field1686[arg0], this.field1686[arg0], this.field1686[arg0], field1712[var33], field1712[var34], field1712[var35], field1713[var33], field1713[var34], field1713[var35], field1714[var33], field1714[var34], field1714[var35], this.field1692[arg0]);
                } else {
                    class84.method1815(var29, var30, var31, var26, var27, var28, field1703[0], field1703[1], field1703[2], field1712[var33], field1712[var34], field1712[var35], field1713[var33], field1713[var34], field1713[var35], field1714[var33], field1714[var34], field1714[var35], this.field1692[arg0]);
                }
            } else if (this.field1711[arg0] == -1) {
                class84.method1793(var29, var30, var31, var26, var27, var28, field1678[this.field1686[arg0]]);
            } else {
                class84.method1791(var29, var30, var31, var26, var27, var28, field1703[0], field1703[1], field1703[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1442 || var27 > Statics.field1442 || var28 > Statics.field1442 || field1723[3] < 0 || field1723[3] > Statics.field1442) {
            class84.field1437 = true;
        }
        if (this.field1692 != null && this.field1692[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1699 == null || this.field1699[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1699[arg0] & 0xFF;
                var37 = this.field1729[var36];
                var38 = this.field1727[var36];
                var39 = this.field1682[var36];
            }
            short var40 = this.field1692[arg0];
            if (this.field1711[arg0] == -1) {
                class84.method1815(var29, var30, var31, var26, var27, var28, this.field1686[arg0], this.field1686[arg0], this.field1686[arg0], field1712[var37], field1712[var38], field1712[var39], field1713[var37], field1713[var38], field1713[var39], field1714[var37], field1714[var38], field1714[var39], var40);
                class84.method1815(var29, var31, field1724[3], var26, var28, field1723[3], this.field1686[arg0], this.field1686[arg0], this.field1686[arg0], field1712[var37], field1712[var38], field1712[var39], field1713[var37], field1713[var38], field1713[var39], field1714[var37], field1714[var38], field1714[var39], var40);
            } else {
                class84.method1815(var29, var30, var31, var26, var27, var28, field1703[0], field1703[1], field1703[2], field1712[var37], field1712[var38], field1712[var39], field1713[var37], field1713[var38], field1713[var39], field1714[var37], field1714[var38], field1714[var39], var40);
                class84.method1815(var29, var31, field1724[3], var26, var28, field1723[3], field1703[0], field1703[2], field1703[3], field1712[var37], field1712[var38], field1712[var39], field1713[var37], field1713[var38], field1713[var39], field1714[var37], field1714[var38], field1714[var39], var40);
            }
        } else if (this.field1711[arg0] == -1) {
            int var41 = field1678[this.field1686[arg0]];
            class84.method1793(var29, var30, var31, var26, var27, var28, var41);
            class84.method1793(var29, var31, field1724[3], var26, var28, field1723[3], var41);
        } else {
            class84.method1791(var29, var30, var31, var26, var27, var28, field1703[0], field1703[1], field1703[2]);
            class84.method1791(var29, var31, field1724[3], var26, var28, field1723[3], field1703[0], field1703[2], field1703[3]);
        }
    }

    @ObfuscatedName("cu.ad(IIIIIIII)Z")
    public final boolean method1995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
