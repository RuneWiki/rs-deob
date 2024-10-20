package deob;

@ObfuscatedName("ck")
public class class99 extends class79 {

    @ObfuscatedName("ck.l")
    public static class99 field1721 = new class99();

    @ObfuscatedName("ck.y")
    public static byte[] field1678 = new byte[1];

    @ObfuscatedName("ck.g")
    public static class99 field1708 = new class99();

    @ObfuscatedName("ck.j")
    public static byte[] field1710 = new byte[1];

    @ObfuscatedName("ck.w")
    public int field1681 = 0;

    @ObfuscatedName("ck.c")
    public int[] field1680;

    @ObfuscatedName("ck.x")
    public int[] field1683;

    @ObfuscatedName("ck.f")
    public int[] field1684;

    @ObfuscatedName("ck.t")
    public int field1685 = 0;

    @ObfuscatedName("ck.n")
    public int[] field1686;

    @ObfuscatedName("ck.p")
    public int[] field1729;

    @ObfuscatedName("ck.a")
    public int[] field1688;

    @ObfuscatedName("ck.o")
    public int[] field1689;

    @ObfuscatedName("ck.b")
    public int[] field1699;

    @ObfuscatedName("ck.r")
    public int[] field1687;

    @ObfuscatedName("ck.z")
    public byte[] field1692;

    @ObfuscatedName("ck.u")
    public byte[] field1709;

    @ObfuscatedName("ck.s")
    public byte[] field1697;

    @ObfuscatedName("ck.i")
    public short[] field1690;

    @ObfuscatedName("ck.e")
    public byte field1704 = 0;

    @ObfuscatedName("ck.h")
    public int field1726 = 0;

    @ObfuscatedName("ck.k")
    public int[] field1698;

    @ObfuscatedName("ck.v")
    public int[] field1694;

    @ObfuscatedName("ck.m")
    public int[] field1700;

    @ObfuscatedName("ck.d")
    public int[][] field1701;

    @ObfuscatedName("ck.q")
    public int[][] field1702;

    @ObfuscatedName("ck.ak")
    public boolean field1703 = false;

    @ObfuscatedName("ck.ah")
    public int field1712;

    @ObfuscatedName("ck.an")
    public int field1705;

    @ObfuscatedName("ck.aw")
    public int field1682;

    @ObfuscatedName("ck.az")
    public int field1707;

    @ObfuscatedName("ck.ad")
    public int field1679;

    @ObfuscatedName("ck.aa")
    public static boolean[] field1727 = new boolean[4096];

    @ObfuscatedName("ck.au")
    public static boolean[] field1695 = new boolean[4096];

    @ObfuscatedName("ck.aq")
    public static int[] field1741 = new int[4096];

    @ObfuscatedName("ck.am")
    public static int[] field1713 = new int[4096];

    @ObfuscatedName("ck.ax")
    public static int[] field1711 = new int[4096];

    @ObfuscatedName("ck.af")
    public static int[] field1725 = new int[4096];

    @ObfuscatedName("ck.av")
    public static int[] field1716 = new int[4096];

    @ObfuscatedName("ck.ao")
    public static int[] field1717 = new int[4096];

    @ObfuscatedName("ck.aj")
    public static int[] field1719 = new int[1600];

    @ObfuscatedName("ck.ae")
    public static int[][] field1720 = new int[1600][512];

    @ObfuscatedName("ck.ai")
    public static int[] field1715 = new int[12];

    @ObfuscatedName("ck.ay")
    public static int[][] field1722 = new int[12][2000];

    @ObfuscatedName("ck.ab")
    public static int[] field1723 = new int[2000];

    @ObfuscatedName("ck.ar")
    public static int[] field1724 = new int[2000];

    @ObfuscatedName("ck.as")
    public static int[] field1732 = new int[12];

    @ObfuscatedName("ck.at")
    public static int[] field1693 = new int[10];

    @ObfuscatedName("ck.ac")
    public static int[] field1696 = new int[10];

    @ObfuscatedName("ck.ap")
    public static int[] field1691 = new int[10];

    @ObfuscatedName("ck.bv")
    public static boolean field1677 = false;

    @ObfuscatedName("ck.be")
    public static int field1733 = 0;

    @ObfuscatedName("ck.bd")
    public static int field1734 = 0;

    @ObfuscatedName("ck.ba")
    public static int field1735 = 0;

    @ObfuscatedName("ck.bn")
    public static int[] field1736 = new int[1000];

    @ObfuscatedName("ck.bc")
    public static int[] field1737 = class85.field1468;

    @ObfuscatedName("ck.bk")
    public static int[] field1738 = class85.field1469;

    @ObfuscatedName("ck.bf")
    public static int[] field1739 = class85.field1451;

    @ObfuscatedName("ck.bt")
    public static int[] field1740 = class85.field1467;

    public class99() {
    }

    public class99(class99[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1681 = 0;
        this.field1685 = 0;
        this.field1726 = 0;
        this.field1704 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class99 var8 = arg0[var7];
            if (var8 != null) {
                this.field1681 += var8.field1681;
                this.field1685 += var8.field1685;
                this.field1726 += var8.field1726;
                if (var8.field1692 == null) {
                    if (this.field1704 == -1) {
                        this.field1704 = var8.field1704;
                    }
                    if (this.field1704 != var8.field1704) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1709 != null;
                var5 |= var8.field1690 != null;
                var6 |= var8.field1697 != null;
            }
        }
        this.field1680 = new int[this.field1681];
        this.field1683 = new int[this.field1681];
        this.field1684 = new int[this.field1681];
        this.field1686 = new int[this.field1685];
        this.field1729 = new int[this.field1685];
        this.field1688 = new int[this.field1685];
        this.field1689 = new int[this.field1685];
        this.field1699 = new int[this.field1685];
        this.field1687 = new int[this.field1685];
        if (var3) {
            this.field1692 = new byte[this.field1685];
        }
        if (var4) {
            this.field1709 = new byte[this.field1685];
        }
        if (var5) {
            this.field1690 = new short[this.field1685];
        }
        if (var6) {
            this.field1697 = new byte[this.field1685];
        }
        if (this.field1726 > 0) {
            this.field1698 = new int[this.field1726];
            this.field1694 = new int[this.field1726];
            this.field1700 = new int[this.field1726];
        }
        this.field1681 = 0;
        this.field1685 = 0;
        this.field1726 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class99 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1685; var11++) {
                    this.field1686[this.field1685] = var10.field1686[var11] + this.field1681;
                    this.field1729[this.field1685] = var10.field1729[var11] + this.field1681;
                    this.field1688[this.field1685] = var10.field1688[var11] + this.field1681;
                    this.field1689[this.field1685] = var10.field1689[var11];
                    this.field1699[this.field1685] = var10.field1699[var11];
                    this.field1687[this.field1685] = var10.field1687[var11];
                    if (var3) {
                        if (var10.field1692 == null) {
                            this.field1692[this.field1685] = var10.field1704;
                        } else {
                            this.field1692[this.field1685] = var10.field1692[var11];
                        }
                    }
                    if (var4 && var10.field1709 != null) {
                        this.field1709[this.field1685] = var10.field1709[var11];
                    }
                    if (var5) {
                        if (var10.field1690 == null) {
                            this.field1690[this.field1685] = -1;
                        } else {
                            this.field1690[this.field1685] = var10.field1690[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1697 == null || var10.field1697[var11] == -1) {
                            this.field1697[this.field1685] = -1;
                        } else {
                            this.field1697[this.field1685] = (byte) (var10.field1697[var11] + this.field1726);
                        }
                    }
                    this.field1685++;
                }
                for (int var12 = 0; var12 < var10.field1726; var12++) {
                    this.field1698[this.field1726] = var10.field1698[var12] + this.field1681;
                    this.field1694[this.field1726] = var10.field1694[var12] + this.field1681;
                    this.field1700[this.field1726] = var10.field1700[var12] + this.field1681;
                    this.field1726++;
                }
                for (int var13 = 0; var13 < var10.field1681; var13++) {
                    this.field1680[this.field1681] = var10.field1680[var13];
                    this.field1683[this.field1681] = var10.field1683[var13];
                    this.field1684[this.field1681] = var10.field1684[var13];
                    this.field1681++;
                }
            }
        }
    }

    @ObfuscatedName("ck.l([[IIIIZI)Lck;")
    public class99 method2000(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2064();
        int var7 = arg1 - this.field1682;
        int var8 = this.field1682 + arg1;
        int var9 = arg3 - this.field1682;
        int var10 = this.field1682 + arg3;
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
            var15.field1681 = this.field1681;
            var15.field1685 = this.field1685;
            var15.field1726 = this.field1726;
            var15.field1680 = this.field1680;
            var15.field1684 = this.field1684;
            var15.field1686 = this.field1686;
            var15.field1729 = this.field1729;
            var15.field1688 = this.field1688;
            var15.field1689 = this.field1689;
            var15.field1699 = this.field1699;
            var15.field1687 = this.field1687;
            var15.field1692 = this.field1692;
            var15.field1709 = this.field1709;
            var15.field1697 = this.field1697;
            var15.field1690 = this.field1690;
            var15.field1704 = this.field1704;
            var15.field1698 = this.field1698;
            var15.field1694 = this.field1694;
            var15.field1700 = this.field1700;
            var15.field1701 = this.field1701;
            var15.field1702 = this.field1702;
            var15.field1703 = this.field1703;
            var15.field1683 = new int[var15.field1681];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1681; var16++) {
                int var17 = this.field1680[var16] + arg1;
                int var18 = this.field1684[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1683[var16] = this.field1683[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1681; var26++) {
                int var27 = (-this.field1683[var26] << 16) / this.field1340;
                if (var27 < arg5) {
                    int var28 = this.field1680[var26] + arg1;
                    int var29 = this.field1684[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1683[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1683[var26];
                }
            }
        }
        var15.field1712 = 0;
        return var15;
    }

    @ObfuscatedName("ck.g(Z)Lck;")
    public class99 method2074(boolean arg0) {
        if (!arg0 && field1678.length < this.field1685) {
            field1678 = new byte[this.field1685 + 100];
        }
        return this.method2003(arg0, field1721, field1678);
    }

    @ObfuscatedName("ck.j(Z)Lck;")
    public class99 method2002(boolean arg0) {
        if (!arg0 && field1710.length < this.field1685) {
            field1710 = new byte[this.field1685 + 100];
        }
        return this.method2003(arg0, field1708, field1710);
    }

    @ObfuscatedName("ck.w(ZLck;[B)Lck;")
    public class99 method2003(boolean arg0, class99 arg1, byte[] arg2) {
        arg1.field1681 = this.field1681;
        arg1.field1685 = this.field1685;
        arg1.field1726 = this.field1726;
        if (arg1.field1680 == null || arg1.field1680.length < this.field1681) {
            arg1.field1680 = new int[this.field1681 + 100];
            arg1.field1683 = new int[this.field1681 + 100];
            arg1.field1684 = new int[this.field1681 + 100];
        }
        for (int var4 = 0; var4 < this.field1681; var4++) {
            arg1.field1680[var4] = this.field1680[var4];
            arg1.field1683[var4] = this.field1683[var4];
            arg1.field1684[var4] = this.field1684[var4];
        }
        if (arg0) {
            arg1.field1709 = this.field1709;
        } else {
            arg1.field1709 = arg2;
            if (this.field1709 == null) {
                for (int var5 = 0; var5 < this.field1685; var5++) {
                    arg1.field1709[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1685; var6++) {
                    arg1.field1709[var6] = this.field1709[var6];
                }
            }
        }
        arg1.field1686 = this.field1686;
        arg1.field1729 = this.field1729;
        arg1.field1688 = this.field1688;
        arg1.field1689 = this.field1689;
        arg1.field1699 = this.field1699;
        arg1.field1687 = this.field1687;
        arg1.field1692 = this.field1692;
        arg1.field1697 = this.field1697;
        arg1.field1690 = this.field1690;
        arg1.field1704 = this.field1704;
        arg1.field1698 = this.field1698;
        arg1.field1694 = this.field1694;
        arg1.field1700 = this.field1700;
        arg1.field1701 = this.field1701;
        arg1.field1702 = this.field1702;
        arg1.field1703 = this.field1703;
        arg1.field1712 = 0;
        return arg1;
    }

    @ObfuscatedName("ck.c()V")
    public void method2064() {
        if (this.field1712 == 1) {
            return;
        }
        this.field1712 = 1;
        this.field1340 = 0;
        this.field1705 = 0;
        this.field1682 = 0;
        for (int var1 = 0; var1 < this.field1681; var1++) {
            int var2 = this.field1680[var1];
            int var3 = this.field1683[var1];
            int var4 = this.field1684[var1];
            if (-var3 > this.field1340) {
                this.field1340 = -var3;
            }
            if (var3 > this.field1705) {
                this.field1705 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1682) {
                this.field1682 = var5;
            }
        }
        this.field1682 = (int) (Math.sqrt((double) this.field1682) + 0.99D);
        this.field1679 = (int) (Math.sqrt((double) (this.field1340 * this.field1340 + this.field1682 * this.field1682)) + 0.99D);
        this.field1707 = this.field1679 + (int) (Math.sqrt((double) (this.field1705 * this.field1705 + this.field1682 * this.field1682)) + 0.99D);
    }

    @ObfuscatedName("ck.x()V")
    public void method2005() {
        if (this.field1712 == 2) {
            return;
        }
        this.field1712 = 2;
        this.field1682 = 0;
        for (int var1 = 0; var1 < this.field1681; var1++) {
            int var2 = this.field1680[var1];
            int var3 = this.field1683[var1];
            int var4 = this.field1684[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1682) {
                this.field1682 = var5;
            }
        }
        this.field1682 = (int) (Math.sqrt((double) this.field1682) + 0.99D);
        this.field1679 = this.field1682;
        this.field1707 = this.field1682 + this.field1682;
    }

    @ObfuscatedName("ck.f()I")
    public int method2046() {
        this.method2064();
        return this.field1682;
    }

    @ObfuscatedName("ck.t(Lcz;I)V")
    public void method2016(class97 arg0, int arg1) {
        if (this.field1701 == null || arg1 == -1) {
            return;
        }
        class82 var3 = arg0.field1653[arg1];
        class96 var4 = var3.field1423;
        Statics.field1714 = 0;
        Statics.field1730 = 0;
        Statics.field1731 = 0;
        for (int var5 = 0; var5 < var3.field1424; var5++) {
            int var6 = var3.field1425[var5];
            this.method2009(var4.field1644[var6], var4.field1645[var6], var3.field1429[var5], var3.field1427[var5], var3.field1419[var5]);
        }
        this.field1712 = 0;
    }

    @ObfuscatedName("ck.n(Lcz;ILcz;I[I)V")
    public void method2008(class97 arg0, int arg1, class97 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2016(arg0, arg1);
            return;
        }
        class82 var6 = arg0.field1653[arg1];
        class82 var7 = arg2.field1653[arg3];
        class96 var8 = var6.field1423;
        Statics.field1714 = 0;
        Statics.field1730 = 0;
        Statics.field1731 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1424; var11++) {
            int var12 = var6.field1425[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1644[var12] == 0) {
                this.method2009(var8.field1644[var12], var8.field1645[var12], var6.field1429[var11], var6.field1427[var11], var6.field1419[var11]);
            }
        }
        Statics.field1714 = 0;
        Statics.field1730 = 0;
        Statics.field1731 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1424; var15++) {
            int var16 = var7.field1425[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1644[var16] == 0) {
                this.method2009(var8.field1644[var16], var8.field1645[var16], var7.field1429[var15], var7.field1427[var15], var7.field1419[var15]);
            }
        }
        this.field1712 = 0;
    }

    @ObfuscatedName("ck.p(I[IIII)V")
    public void method2009(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1714 = 0;
            Statics.field1730 = 0;
            Statics.field1731 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1701.length) {
                    int[] var10 = this.field1701[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1714 += this.field1680[var12];
                        Statics.field1730 += this.field1683[var12];
                        Statics.field1731 += this.field1684[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1714 = Statics.field1714 / var7 + arg2;
                Statics.field1730 = Statics.field1730 / var7 + arg3;
                Statics.field1731 = Statics.field1731 / var7 + arg4;
            } else {
                Statics.field1714 = arg2;
                Statics.field1730 = arg3;
                Statics.field1731 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1701.length) {
                    int[] var15 = this.field1701[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1680[var17] += arg2;
                        this.field1683[var17] += arg3;
                        this.field1684[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1701.length) {
                    int[] var20 = this.field1701[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1680[var22] -= Statics.field1714;
                        this.field1683[var22] -= Statics.field1730;
                        this.field1684[var22] -= Statics.field1731;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1737[var25];
                            int var27 = field1738[var25];
                            int var28 = this.field1683[var22] * var26 + this.field1680[var22] * var27 >> 16;
                            this.field1683[var22] = this.field1683[var22] * var27 - this.field1680[var22] * var26 >> 16;
                            this.field1680[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1737[var23];
                            int var30 = field1738[var23];
                            int var31 = this.field1683[var22] * var30 - this.field1684[var22] * var29 >> 16;
                            this.field1684[var22] = this.field1684[var22] * var30 + this.field1683[var22] * var29 >> 16;
                            this.field1683[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1737[var24];
                            int var33 = field1738[var24];
                            int var34 = this.field1684[var22] * var32 + this.field1680[var22] * var33 >> 16;
                            this.field1684[var22] = this.field1684[var22] * var33 - this.field1680[var22] * var32 >> 16;
                            this.field1680[var22] = var34;
                        }
                        this.field1680[var22] += Statics.field1714;
                        this.field1683[var22] += Statics.field1730;
                        this.field1684[var22] += Statics.field1731;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1701.length) {
                    int[] var37 = this.field1701[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1680[var39] -= Statics.field1714;
                        this.field1683[var39] -= Statics.field1730;
                        this.field1684[var39] -= Statics.field1731;
                        this.field1680[var39] = this.field1680[var39] * arg2 / 128;
                        this.field1683[var39] = this.field1683[var39] * arg3 / 128;
                        this.field1684[var39] = this.field1684[var39] * arg4 / 128;
                        this.field1680[var39] += Statics.field1714;
                        this.field1683[var39] += Statics.field1730;
                        this.field1684[var39] += Statics.field1731;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1702 != null && this.field1709 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1702.length) {
                    int[] var42 = this.field1702[var41];
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

    @ObfuscatedName("ck.u()V")
    public void method2010() {
        for (int var1 = 0; var1 < this.field1681; var1++) {
            int var2 = this.field1680[var1];
            this.field1680[var1] = this.field1684[var1];
            this.field1684[var1] = -var2;
        }
        this.field1712 = 0;
    }

    @ObfuscatedName("ck.s()V")
    public void method2011() {
        for (int var1 = 0; var1 < this.field1681; var1++) {
            this.field1680[var1] = -this.field1680[var1];
            this.field1684[var1] = -this.field1684[var1];
        }
        this.field1712 = 0;
    }

    @ObfuscatedName("ck.i()V")
    public void method2029() {
        for (int var1 = 0; var1 < this.field1681; var1++) {
            int var2 = this.field1684[var1];
            this.field1684[var1] = this.field1680[var1];
            this.field1680[var1] = -var2;
        }
        this.field1712 = 0;
    }

    @ObfuscatedName("ck.e(I)V")
    public void method2043(int arg0) {
        int var2 = field1737[arg0];
        int var3 = field1738[arg0];
        for (int var4 = 0; var4 < this.field1681; var4++) {
            int var5 = this.field1683[var4] * var3 - this.field1684[var4] * var2 >> 16;
            this.field1684[var4] = this.field1684[var4] * var3 + this.field1683[var4] * var2 >> 16;
            this.field1683[var4] = var5;
        }
        this.field1712 = 0;
    }

    @ObfuscatedName("ck.h(III)V")
    public void method2060(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1681; var4++) {
            this.field1680[var4] += arg0;
            this.field1683[var4] += arg1;
            this.field1684[var4] += arg2;
        }
        this.field1712 = 0;
    }

    @ObfuscatedName("ck.k(III)V")
    public void method2015(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1681; var4++) {
            this.field1680[var4] = this.field1680[var4] * arg0 / 128;
            this.field1683[var4] = this.field1683[var4] * arg1 / 128;
            this.field1684[var4] = this.field1684[var4] * arg2 / 128;
        }
        this.field1712 = 0;
    }

    @ObfuscatedName("ck.v(IIIIIII)V")
    public final void method2075(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1719[0] = -1;
        if (this.field1712 != 2 && this.field1712 != 1) {
            this.method2005();
        }
        int var8 = Statics.field1449;
        int var9 = Statics.field1456;
        int var10 = field1737[arg0];
        int var11 = field1738[arg0];
        int var12 = field1737[arg1];
        int var13 = field1738[arg1];
        int var14 = field1737[arg2];
        int var15 = field1738[arg2];
        int var16 = field1737[arg3];
        int var17 = field1738[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1681; var19++) {
            int var20 = this.field1680[var19];
            int var21 = this.field1683[var19];
            int var22 = this.field1684[var19];
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
            field1711[var19] = var30 - var18;
            field1741[var19] = (var26 << 9) / var30 + var8;
            field1713[var19] = (var29 << 9) / var30 + var9;
            if (this.field1726 > 0) {
                field1725[var19] = var26;
                field1716[var19] = var29;
                field1717[var19] = var30;
            }
        }
        try {
            this.method2018(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ck.m(IIIIIIII)V")
    public final void method1999(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1719[0] = -1;
        if (this.field1712 != 2 && this.field1712 != 1) {
            this.method2005();
        }
        int var9 = Statics.field1449;
        int var10 = Statics.field1456;
        int var11 = field1737[arg0];
        int var12 = field1738[arg0];
        int var13 = field1737[arg1];
        int var14 = field1738[arg1];
        int var15 = field1737[arg2];
        int var16 = field1738[arg2];
        int var17 = field1737[arg3];
        int var18 = field1738[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1681; var20++) {
            int var21 = this.field1680[var20];
            int var22 = this.field1683[var20];
            int var23 = this.field1684[var20];
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
            field1711[var20] = var31 - var19;
            field1741[var20] = (var27 << 9) / arg7 + var9;
            field1713[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1726 > 0) {
                field1725[var20] = var27;
                field1716[var20] = var30;
                field1717[var20] = var31;
            }
        }
        try {
            this.method2018(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ck.ag(IIIIIIIII)V")
    public void method1611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1719[0] = -1;
        if (this.field1712 != 1) {
            this.method2064();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1682 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1682 << 9;
        if (var15 / var13 >= Statics.field1460) {
            return;
        }
        int var16 = this.field1682 + var14 << 9;
        if (var16 / var13 <= Statics.field1459) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1682 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1461) {
            return;
        }
        int var20 = (this.field1340 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1462) {
            return;
        }
        int var22 = (this.field1340 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1726 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1677) {
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
            int var32 = field1733 - Statics.field1449;
            int var33 = field1734 - Statics.field1456;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1703) {
                    field1736[field1735++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1449;
        int var35 = Statics.field1456;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1737[arg0];
            var37 = field1738[arg0];
        }
        for (int var38 = 0; var38 < this.field1681; var38++) {
            int var39 = this.field1680[var38];
            int var40 = this.field1683[var38];
            int var41 = this.field1684[var38];
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
            field1711[var38] = var50 - var11;
            if (var50 >= 50) {
                field1741[var38] = (var46 << 9) / var50 + var34;
                field1713[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1741[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1725[var38] = var46;
                field1716[var38] = var49;
                field1717[var38] = var50;
            }
        }
        try {
            this.method2018(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("ck.d(ZZI)V")
    public final void method2018(boolean arg0, boolean arg1, int arg2) {
        if (this.field1707 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1707; var4++) {
            field1719[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1685; var5++) {
            if (this.field1687[var5] != -2) {
                int var6 = this.field1686[var5];
                int var7 = this.field1729[var5];
                int var8 = this.field1688[var5];
                int var9 = field1741[var6];
                int var10 = field1741[var7];
                int var11 = field1741[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1725[var6];
                    int var13 = field1725[var7];
                    int var14 = field1725[var8];
                    int var15 = field1716[var6];
                    int var16 = field1716[var7];
                    int var17 = field1716[var8];
                    int var18 = field1717[var6];
                    int var19 = field1717[var7];
                    int var20 = field1717[var8];
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
                        field1695[var5] = true;
                        int var30 = (field1711[var6] + field1711[var7] + field1711[var8]) / 3 + this.field1679;
                        field1720[var30][field1719[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2021(field1733, field1734, field1713[var6], field1713[var7], field1713[var8], var9, var10, var11)) {
                        field1736[field1735++] = arg2;
                        arg1 = false;
                    }
                    if ((field1713[var8] - field1713[var7]) * (var9 - var10) - (field1713[var6] - field1713[var7]) * (var11 - var10) > 0) {
                        field1695[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1464 && var10 <= Statics.field1464 && var11 <= Statics.field1464) {
                            field1727[var5] = false;
                        } else {
                            field1727[var5] = true;
                        }
                        int var31 = (field1711[var6] + field1711[var7] + field1711[var8]) / 3 + this.field1679;
                        field1720[var31][field1719[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1692 == null) {
            for (int var32 = this.field1707 - 1; var32 >= 0; var32--) {
                int var33 = field1719[var32];
                if (var33 > 0) {
                    int[] var34 = field1720[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2019(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1715[var36] = 0;
            field1732[var36] = 0;
        }
        for (int var37 = this.field1707 - 1; var37 >= 0; var37--) {
            int var38 = field1719[var37];
            if (var38 > 0) {
                int[] var39 = field1720[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1692[var41];
                    int var43 = field1715[var42]++;
                    field1722[var42][var43] = var41;
                    if (var42 < 10) {
                        field1732[var42] += var37;
                    } else if (var42 == 10) {
                        field1723[var43] = var37;
                    } else {
                        field1724[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1715[1] > 0 || field1715[2] > 0) {
            var44 = (field1732[1] + field1732[2]) / (field1715[1] + field1715[2]);
        }
        int var45 = 0;
        if (field1715[3] > 0 || field1715[4] > 0) {
            var45 = (field1732[3] + field1732[4]) / (field1715[3] + field1715[4]);
        }
        int var46 = 0;
        if (field1715[6] > 0 || field1715[8] > 0) {
            var46 = (field1732[6] + field1732[8]) / (field1715[6] + field1715[8]);
        }
        int var47 = 0;
        int var48 = field1715[10];
        int[] var49 = field1722[10];
        int[] var50 = field1723;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1715[11];
            var49 = field1722[11];
            var50 = field1724;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2019(var49[var47++]);
                if (var47 == var48 && field1722[11] != var49) {
                    var47 = 0;
                    var48 = field1715[11];
                    var49 = field1722[11];
                    var50 = field1724;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2019(var49[var47++]);
                if (var47 == var48 && field1722[11] != var49) {
                    var47 = 0;
                    var48 = field1715[11];
                    var49 = field1722[11];
                    var50 = field1724;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2019(var49[var47++]);
                if (var47 == var48 && field1722[11] != var49) {
                    var47 = 0;
                    var48 = field1715[11];
                    var49 = field1722[11];
                    var50 = field1724;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1715[var52];
            int[] var54 = field1722[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2019(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2019(var49[var47++]);
            if (var47 == var48 && field1722[11] != var49) {
                var47 = 0;
                var49 = field1722[11];
                var48 = field1715[11];
                var50 = field1724;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("ck.q(I)V")
    public final void method2019(int arg0) {
        if (field1695[arg0]) {
            this.method2020(arg0);
            return;
        }
        int var2 = this.field1686[arg0];
        int var3 = this.field1729[arg0];
        int var4 = this.field1688[arg0];
        class85.field1452 = field1727[arg0];
        if (this.field1709 == null) {
            class85.field1454 = 0;
        } else {
            class85.field1454 = this.field1709[arg0] & 0xFF;
        }
        if (this.field1690 != null && this.field1690[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1697 == null || this.field1697[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1697[arg0] & 0xFF;
                var6 = this.field1698[var5];
                var7 = this.field1694[var5];
                var8 = this.field1700[var5];
            }
            if (this.field1687[arg0] == -1) {
                class85.method1800(field1713[var2], field1713[var3], field1713[var4], field1741[var2], field1741[var3], field1741[var4], this.field1689[arg0], this.field1689[arg0], this.field1689[arg0], field1725[var6], field1725[var7], field1725[var8], field1716[var6], field1716[var7], field1716[var8], field1717[var6], field1717[var7], field1717[var8], this.field1690[arg0]);
            } else {
                class85.method1800(field1713[var2], field1713[var3], field1713[var4], field1741[var2], field1741[var3], field1741[var4], this.field1689[arg0], this.field1699[arg0], this.field1687[arg0], field1725[var6], field1725[var7], field1725[var8], field1716[var6], field1716[var7], field1716[var8], field1717[var6], field1717[var7], field1717[var8], this.field1690[arg0]);
            }
        } else if (this.field1687[arg0] == -1) {
            class85.method1798(field1713[var2], field1713[var3], field1713[var4], field1741[var2], field1741[var3], field1741[var4], field1739[this.field1689[arg0]]);
        } else {
            class85.method1796(field1713[var2], field1713[var3], field1713[var4], field1741[var2], field1741[var3], field1741[var4], this.field1689[arg0], this.field1699[arg0], this.field1687[arg0]);
        }
    }

    @ObfuscatedName("ck.ak(I)V")
    public final void method2020(int arg0) {
        int var2 = Statics.field1449;
        int var3 = Statics.field1456;
        int var4 = 0;
        int var5 = this.field1686[arg0];
        int var6 = this.field1729[arg0];
        int var7 = this.field1688[arg0];
        int var8 = field1717[var5];
        int var9 = field1717[var6];
        int var10 = field1717[var7];
        if (this.field1709 == null) {
            class85.field1454 = 0;
        } else {
            class85.field1454 = this.field1709[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1693[var4] = field1741[var5];
            field1696[var4] = field1713[var5];
            field1691[var4++] = this.field1689[arg0];
        } else {
            int var11 = field1725[var5];
            int var12 = field1716[var5];
            int var13 = this.field1689[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1740[var10 - var8];
                field1693[var4] = (((field1725[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1696[var4] = (((field1716[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1691[var4++] = ((this.field1687[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1740[var9 - var8];
                field1693[var4] = (((field1725[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1696[var4] = (((field1716[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1691[var4++] = ((this.field1699[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1693[var4] = field1741[var6];
            field1696[var4] = field1713[var6];
            field1691[var4++] = this.field1699[arg0];
        } else {
            int var16 = field1725[var6];
            int var17 = field1716[var6];
            int var18 = this.field1699[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1740[var8 - var9];
                field1693[var4] = (((field1725[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1696[var4] = (((field1716[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1691[var4++] = ((this.field1689[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1740[var10 - var9];
                field1693[var4] = (((field1725[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1696[var4] = (((field1716[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1691[var4++] = ((this.field1687[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1693[var4] = field1741[var7];
            field1696[var4] = field1713[var7];
            field1691[var4++] = this.field1687[arg0];
        } else {
            int var21 = field1725[var7];
            int var22 = field1716[var7];
            int var23 = this.field1687[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1740[var9 - var10];
                field1693[var4] = (((field1725[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1696[var4] = (((field1716[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1691[var4++] = ((this.field1699[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1740[var8 - var10];
                field1693[var4] = (((field1725[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1696[var4] = (((field1716[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1691[var4++] = ((this.field1689[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1693[0];
        int var27 = field1693[1];
        int var28 = field1693[2];
        int var29 = field1696[0];
        int var30 = field1696[1];
        int var31 = field1696[2];
        class85.field1452 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1464 || var27 > Statics.field1464 || var28 > Statics.field1464) {
                class85.field1452 = true;
            }
            if (this.field1690 != null && this.field1690[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1697 == null || this.field1697[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1697[arg0] & 0xFF;
                    var33 = this.field1698[var32];
                    var34 = this.field1694[var32];
                    var35 = this.field1700[var32];
                }
                if (this.field1687[arg0] == -1) {
                    class85.method1800(var29, var30, var31, var26, var27, var28, this.field1689[arg0], this.field1689[arg0], this.field1689[arg0], field1725[var33], field1725[var34], field1725[var35], field1716[var33], field1716[var34], field1716[var35], field1717[var33], field1717[var34], field1717[var35], this.field1690[arg0]);
                } else {
                    class85.method1800(var29, var30, var31, var26, var27, var28, field1691[0], field1691[1], field1691[2], field1725[var33], field1725[var34], field1725[var35], field1716[var33], field1716[var34], field1716[var35], field1717[var33], field1717[var34], field1717[var35], this.field1690[arg0]);
                }
            } else if (this.field1687[arg0] == -1) {
                class85.method1798(var29, var30, var31, var26, var27, var28, field1739[this.field1689[arg0]]);
            } else {
                class85.method1796(var29, var30, var31, var26, var27, var28, field1691[0], field1691[1], field1691[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1464 || var27 > Statics.field1464 || var28 > Statics.field1464 || field1693[3] < 0 || field1693[3] > Statics.field1464) {
            class85.field1452 = true;
        }
        if (this.field1690 != null && this.field1690[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1697 == null || this.field1697[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1697[arg0] & 0xFF;
                var37 = this.field1698[var36];
                var38 = this.field1694[var36];
                var39 = this.field1700[var36];
            }
            short var40 = this.field1690[arg0];
            if (this.field1687[arg0] == -1) {
                class85.method1800(var29, var30, var31, var26, var27, var28, this.field1689[arg0], this.field1689[arg0], this.field1689[arg0], field1725[var37], field1725[var38], field1725[var39], field1716[var37], field1716[var38], field1716[var39], field1717[var37], field1717[var38], field1717[var39], var40);
                class85.method1800(var29, var31, field1696[3], var26, var28, field1693[3], this.field1689[arg0], this.field1689[arg0], this.field1689[arg0], field1725[var37], field1725[var38], field1725[var39], field1716[var37], field1716[var38], field1716[var39], field1717[var37], field1717[var38], field1717[var39], var40);
            } else {
                class85.method1800(var29, var30, var31, var26, var27, var28, field1691[0], field1691[1], field1691[2], field1725[var37], field1725[var38], field1725[var39], field1716[var37], field1716[var38], field1716[var39], field1717[var37], field1717[var38], field1717[var39], var40);
                class85.method1800(var29, var31, field1696[3], var26, var28, field1693[3], field1691[0], field1691[2], field1691[3], field1725[var37], field1725[var38], field1725[var39], field1716[var37], field1716[var38], field1716[var39], field1717[var37], field1717[var38], field1717[var39], var40);
            }
        } else if (this.field1687[arg0] == -1) {
            int var41 = field1739[this.field1689[arg0]];
            class85.method1798(var29, var30, var31, var26, var27, var28, var41);
            class85.method1798(var29, var31, field1696[3], var26, var28, field1693[3], var41);
        } else {
            class85.method1796(var29, var30, var31, var26, var27, var28, field1691[0], field1691[1], field1691[2]);
            class85.method1796(var29, var31, field1696[3], var26, var28, field1693[3], field1691[0], field1691[2], field1691[3]);
        }
    }

    @ObfuscatedName("ck.ah(IIIIIIII)Z")
    public final boolean method2021(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
