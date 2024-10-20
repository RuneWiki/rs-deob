package deob;

@ObfuscatedName("cl")
public class class99 extends class79 {

    @ObfuscatedName("cl.c")
    public static class99 field1730 = new class99();

    @ObfuscatedName("cl.j")
    public static byte[] field1677 = new byte[1];

    @ObfuscatedName("cl.y")
    public static class99 field1678 = new class99();

    @ObfuscatedName("cl.r")
    public static byte[] field1679 = new byte[1];

    @ObfuscatedName("cl.f")
    public int field1680 = 0;

    @ObfuscatedName("cl.l")
    public int[] field1681;

    @ObfuscatedName("cl.b")
    public int[] field1695;

    @ObfuscatedName("cl.k")
    public int[] field1683;

    @ObfuscatedName("cl.g")
    public int field1718 = 0;

    @ObfuscatedName("cl.v")
    public int[] field1715;

    @ObfuscatedName("cl.i")
    public int[] field1712;

    @ObfuscatedName("cl.x")
    public int[] field1687;

    @ObfuscatedName("cl.h")
    public int[] field1699;

    @ObfuscatedName("cl.w")
    public int[] field1698;

    @ObfuscatedName("cl.s")
    public int[] field1690;

    @ObfuscatedName("cl.p")
    public byte[] field1691;

    @ObfuscatedName("cl.z")
    public byte[] field1692;

    @ObfuscatedName("cl.n")
    public byte[] field1728;

    @ObfuscatedName("cl.u")
    public short[] field1694;

    @ObfuscatedName("cl.a")
    public byte field1685 = 0;

    @ObfuscatedName("cl.d")
    public int field1696 = 0;

    @ObfuscatedName("cl.m")
    public int[] field1697;

    @ObfuscatedName("cl.q")
    public int[] field1740;

    @ObfuscatedName("cl.e")
    public int[] field1732;

    @ObfuscatedName("cl.t")
    public int[][] field1700;

    @ObfuscatedName("cl.o")
    public int[][] field1688;

    @ObfuscatedName("cl.at")
    public boolean field1702 = false;

    @ObfuscatedName("cl.ag")
    public int field1703;

    @ObfuscatedName("cl.ae")
    public int field1704;

    @ObfuscatedName("cl.ak")
    public int field1705;

    @ObfuscatedName("cl.ap")
    public int field1706;

    @ObfuscatedName("cl.ao")
    public int field1727;

    @ObfuscatedName("cl.as")
    public static boolean[] field1709 = new boolean[4096];

    @ObfuscatedName("cl.ai")
    public static boolean[] field1682 = new boolean[4096];

    @ObfuscatedName("cl.ab")
    public static int[] field1707 = new int[4096];

    @ObfuscatedName("cl.an")
    public static int[] field1724 = new int[4096];

    @ObfuscatedName("cl.ah")
    public static int[] field1713 = new int[4096];

    @ObfuscatedName("cl.ad")
    public static int[] field1714 = new int[4096];

    @ObfuscatedName("cl.af")
    public static int[] field1676 = new int[4096];

    @ObfuscatedName("cl.aj")
    public static int[] field1716 = new int[4096];

    @ObfuscatedName("cl.ay")
    public static int[] field1693 = new int[1600];

    @ObfuscatedName("cl.au")
    public static int[][] field1719 = new int[1600][512];

    @ObfuscatedName("cl.aa")
    public static int[] field1720 = new int[12];

    @ObfuscatedName("cl.aq")
    public static int[][] field1721 = new int[12][2000];

    @ObfuscatedName("cl.av")
    public static int[] field1722 = new int[2000];

    @ObfuscatedName("cl.aw")
    public static int[] field1723 = new int[2000];

    @ObfuscatedName("cl.az")
    public static int[] field1684 = new int[12];

    @ObfuscatedName("cl.al")
    public static int[] field1725 = new int[10];

    @ObfuscatedName("cl.ar")
    public static int[] field1711 = new int[10];

    @ObfuscatedName("cl.ax")
    public static int[] field1686 = new int[10];

    @ObfuscatedName("cl.by")
    public static boolean field1731 = false;

    @ObfuscatedName("cl.bg")
    public static int field1701 = 0;

    @ObfuscatedName("cl.bb")
    public static int field1733 = 0;

    @ObfuscatedName("cl.bm")
    public static int field1734 = 0;

    @ObfuscatedName("cl.bq")
    public static int[] field1735 = new int[1000];

    @ObfuscatedName("cl.br")
    public static int[] field1736 = class85.field1472;

    @ObfuscatedName("cl.bw")
    public static int[] field1737 = class85.field1473;

    @ObfuscatedName("cl.bf")
    public static int[] field1738 = class85.field1466;

    @ObfuscatedName("cl.bo")
    public static int[] field1739 = class85.field1471;

    public class99() {
    }

    public class99(class99[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1680 = 0;
        this.field1718 = 0;
        this.field1696 = 0;
        this.field1685 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class99 var8 = arg0[var7];
            if (var8 != null) {
                this.field1680 += var8.field1680;
                this.field1718 += var8.field1718;
                this.field1696 += var8.field1696;
                if (var8.field1691 == null) {
                    if (this.field1685 == -1) {
                        this.field1685 = var8.field1685;
                    }
                    if (this.field1685 != var8.field1685) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1692 != null;
                var5 |= var8.field1694 != null;
                var6 |= var8.field1728 != null;
            }
        }
        this.field1681 = new int[this.field1680];
        this.field1695 = new int[this.field1680];
        this.field1683 = new int[this.field1680];
        this.field1715 = new int[this.field1718];
        this.field1712 = new int[this.field1718];
        this.field1687 = new int[this.field1718];
        this.field1699 = new int[this.field1718];
        this.field1698 = new int[this.field1718];
        this.field1690 = new int[this.field1718];
        if (var3) {
            this.field1691 = new byte[this.field1718];
        }
        if (var4) {
            this.field1692 = new byte[this.field1718];
        }
        if (var5) {
            this.field1694 = new short[this.field1718];
        }
        if (var6) {
            this.field1728 = new byte[this.field1718];
        }
        if (this.field1696 > 0) {
            this.field1697 = new int[this.field1696];
            this.field1740 = new int[this.field1696];
            this.field1732 = new int[this.field1696];
        }
        this.field1680 = 0;
        this.field1718 = 0;
        this.field1696 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class99 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1718; var11++) {
                    this.field1715[this.field1718] = var10.field1715[var11] + this.field1680;
                    this.field1712[this.field1718] = var10.field1712[var11] + this.field1680;
                    this.field1687[this.field1718] = var10.field1687[var11] + this.field1680;
                    this.field1699[this.field1718] = var10.field1699[var11];
                    this.field1698[this.field1718] = var10.field1698[var11];
                    this.field1690[this.field1718] = var10.field1690[var11];
                    if (var3) {
                        if (var10.field1691 == null) {
                            this.field1691[this.field1718] = var10.field1685;
                        } else {
                            this.field1691[this.field1718] = var10.field1691[var11];
                        }
                    }
                    if (var4 && var10.field1692 != null) {
                        this.field1692[this.field1718] = var10.field1692[var11];
                    }
                    if (var5) {
                        if (var10.field1694 == null) {
                            this.field1694[this.field1718] = -1;
                        } else {
                            this.field1694[this.field1718] = var10.field1694[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1728 == null || var10.field1728[var11] == -1) {
                            this.field1728[this.field1718] = -1;
                        } else {
                            this.field1728[this.field1718] = (byte) (var10.field1728[var11] + this.field1696);
                        }
                    }
                    this.field1718++;
                }
                for (int var12 = 0; var12 < var10.field1696; var12++) {
                    this.field1697[this.field1696] = var10.field1697[var12] + this.field1680;
                    this.field1740[this.field1696] = var10.field1740[var12] + this.field1680;
                    this.field1732[this.field1696] = var10.field1732[var12] + this.field1680;
                    this.field1696++;
                }
                for (int var13 = 0; var13 < var10.field1680; var13++) {
                    this.field1681[this.field1680] = var10.field1681[var13];
                    this.field1695[this.field1680] = var10.field1695[var13];
                    this.field1683[this.field1680] = var10.field1683[var13];
                    this.field1680++;
                }
            }
        }
    }

    @ObfuscatedName("cl.c([[IIIIZI)Lcl;")
    public class99 method2018(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2022();
        int var7 = arg1 - this.field1705;
        int var8 = this.field1705 + arg1;
        int var9 = arg3 - this.field1705;
        int var10 = this.field1705 + arg3;
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
            var15.field1680 = this.field1680;
            var15.field1718 = this.field1718;
            var15.field1696 = this.field1696;
            var15.field1681 = this.field1681;
            var15.field1683 = this.field1683;
            var15.field1715 = this.field1715;
            var15.field1712 = this.field1712;
            var15.field1687 = this.field1687;
            var15.field1699 = this.field1699;
            var15.field1698 = this.field1698;
            var15.field1690 = this.field1690;
            var15.field1691 = this.field1691;
            var15.field1692 = this.field1692;
            var15.field1728 = this.field1728;
            var15.field1694 = this.field1694;
            var15.field1685 = this.field1685;
            var15.field1697 = this.field1697;
            var15.field1740 = this.field1740;
            var15.field1732 = this.field1732;
            var15.field1700 = this.field1700;
            var15.field1688 = this.field1688;
            var15.field1702 = this.field1702;
            var15.field1695 = new int[var15.field1680];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1680; var16++) {
                int var17 = this.field1681[var16] + arg1;
                int var18 = this.field1683[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1695[var16] = this.field1695[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1680; var26++) {
                int var27 = (-this.field1695[var26] << 16) / this.field1347;
                if (var27 < arg5) {
                    int var28 = this.field1681[var26] + arg1;
                    int var29 = this.field1683[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1695[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1695[var26];
                }
            }
        }
        var15.field1703 = 0;
        return var15;
    }

    @ObfuscatedName("cl.y(Z)Lcl;")
    public class99 method1986(boolean arg0) {
        if (!arg0 && field1677.length < this.field1718) {
            field1677 = new byte[this.field1718 + 100];
        }
        return this.method1987(arg0, field1730, field1677);
    }

    @ObfuscatedName("cl.r(Z)Lcl;")
    public class99 method1985(boolean arg0) {
        if (!arg0 && field1679.length < this.field1718) {
            field1679 = new byte[this.field1718 + 100];
        }
        return this.method1987(arg0, field1678, field1679);
    }

    @ObfuscatedName("cl.f(ZLcl;[B)Lcl;")
    public class99 method1987(boolean arg0, class99 arg1, byte[] arg2) {
        arg1.field1680 = this.field1680;
        arg1.field1718 = this.field1718;
        arg1.field1696 = this.field1696;
        if (arg1.field1681 == null || arg1.field1681.length < this.field1680) {
            arg1.field1681 = new int[this.field1680 + 100];
            arg1.field1695 = new int[this.field1680 + 100];
            arg1.field1683 = new int[this.field1680 + 100];
        }
        for (int var4 = 0; var4 < this.field1680; var4++) {
            arg1.field1681[var4] = this.field1681[var4];
            arg1.field1695[var4] = this.field1695[var4];
            arg1.field1683[var4] = this.field1683[var4];
        }
        if (arg0) {
            arg1.field1692 = this.field1692;
        } else {
            arg1.field1692 = arg2;
            if (this.field1692 == null) {
                for (int var5 = 0; var5 < this.field1718; var5++) {
                    arg1.field1692[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1718; var6++) {
                    arg1.field1692[var6] = this.field1692[var6];
                }
            }
        }
        arg1.field1715 = this.field1715;
        arg1.field1712 = this.field1712;
        arg1.field1687 = this.field1687;
        arg1.field1699 = this.field1699;
        arg1.field1698 = this.field1698;
        arg1.field1690 = this.field1690;
        arg1.field1691 = this.field1691;
        arg1.field1728 = this.field1728;
        arg1.field1694 = this.field1694;
        arg1.field1685 = this.field1685;
        arg1.field1697 = this.field1697;
        arg1.field1740 = this.field1740;
        arg1.field1732 = this.field1732;
        arg1.field1700 = this.field1700;
        arg1.field1688 = this.field1688;
        arg1.field1702 = this.field1702;
        arg1.field1703 = 0;
        return arg1;
    }

    @ObfuscatedName("cl.l()V")
    public void method2022() {
        if (this.field1703 == 1) {
            return;
        }
        this.field1703 = 1;
        this.field1347 = 0;
        this.field1704 = 0;
        this.field1705 = 0;
        for (int var1 = 0; var1 < this.field1680; var1++) {
            int var2 = this.field1681[var1];
            int var3 = this.field1695[var1];
            int var4 = this.field1683[var1];
            if (-var3 > this.field1347) {
                this.field1347 = -var3;
            }
            if (var3 > this.field1704) {
                this.field1704 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1705) {
                this.field1705 = var5;
            }
        }
        this.field1705 = (int) (Math.sqrt((double) this.field1705) + 0.99D);
        this.field1727 = (int) (Math.sqrt((double) (this.field1347 * this.field1347 + this.field1705 * this.field1705)) + 0.99D);
        this.field1706 = this.field1727 + (int) (Math.sqrt((double) (this.field1705 * this.field1705 + this.field1704 * this.field1704)) + 0.99D);
    }

    @ObfuscatedName("cl.b()V")
    public void method1989() {
        if (this.field1703 == 2) {
            return;
        }
        this.field1703 = 2;
        this.field1705 = 0;
        for (int var1 = 0; var1 < this.field1680; var1++) {
            int var2 = this.field1681[var1];
            int var3 = this.field1695[var1];
            int var4 = this.field1683[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1705) {
                this.field1705 = var5;
            }
        }
        this.field1705 = (int) (Math.sqrt((double) this.field1705) + 0.99D);
        this.field1727 = this.field1705;
        this.field1706 = this.field1705 + this.field1705;
    }

    @ObfuscatedName("cl.k()I")
    public int method1988() {
        this.method2022();
        return this.field1705;
    }

    @ObfuscatedName("cl.v(Lcr;I)V")
    public void method1990(class97 arg0, int arg1) {
        if (this.field1700 == null || arg1 == -1) {
            return;
        }
        class82 var3 = arg0.field1651[arg1];
        class96 var4 = var3.field1425;
        Statics.field1726 = 0;
        Statics.field1729 = 0;
        Statics.field1717 = 0;
        for (int var5 = 0; var5 < var3.field1426; var5++) {
            int var6 = var3.field1430[var5];
            this.method1992(var4.field1649[var6], var4.field1646[var6], var3.field1428[var5], var3.field1429[var5], var3.field1423[var5]);
        }
        this.field1703 = 0;
    }

    @ObfuscatedName("cl.i(Lcr;ILcr;I[I)V")
    public void method1991(class97 arg0, int arg1, class97 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1990(arg0, arg1);
            return;
        }
        class82 var6 = arg0.field1651[arg1];
        class82 var7 = arg2.field1651[arg3];
        class96 var8 = var6.field1425;
        Statics.field1726 = 0;
        Statics.field1729 = 0;
        Statics.field1717 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1426; var11++) {
            int var12 = var6.field1430[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1649[var12] == 0) {
                this.method1992(var8.field1649[var12], var8.field1646[var12], var6.field1428[var11], var6.field1429[var11], var6.field1423[var11]);
            }
        }
        Statics.field1726 = 0;
        Statics.field1729 = 0;
        Statics.field1717 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1426; var15++) {
            int var16 = var7.field1430[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1649[var16] == 0) {
                this.method1992(var8.field1649[var16], var8.field1646[var16], var7.field1428[var15], var7.field1429[var15], var7.field1423[var15]);
            }
        }
        this.field1703 = 0;
    }

    @ObfuscatedName("cl.x(I[IIII)V")
    public void method1992(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1726 = 0;
            Statics.field1729 = 0;
            Statics.field1717 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1700.length) {
                    int[] var10 = this.field1700[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1726 += this.field1681[var12];
                        Statics.field1729 += this.field1695[var12];
                        Statics.field1717 += this.field1683[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1726 = Statics.field1726 / var7 + arg2;
                Statics.field1729 = Statics.field1729 / var7 + arg3;
                Statics.field1717 = Statics.field1717 / var7 + arg4;
            } else {
                Statics.field1726 = arg2;
                Statics.field1729 = arg3;
                Statics.field1717 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1700.length) {
                    int[] var15 = this.field1700[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1681[var17] += arg2;
                        this.field1695[var17] += arg3;
                        this.field1683[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1700.length) {
                    int[] var20 = this.field1700[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1681[var22] -= Statics.field1726;
                        this.field1695[var22] -= Statics.field1729;
                        this.field1683[var22] -= Statics.field1717;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1736[var25];
                            int var27 = field1737[var25];
                            int var28 = this.field1695[var22] * var26 + this.field1681[var22] * var27 >> 16;
                            this.field1695[var22] = this.field1695[var22] * var27 - this.field1681[var22] * var26 >> 16;
                            this.field1681[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1736[var23];
                            int var30 = field1737[var23];
                            int var31 = this.field1695[var22] * var30 - this.field1683[var22] * var29 >> 16;
                            this.field1683[var22] = this.field1695[var22] * var29 + this.field1683[var22] * var30 >> 16;
                            this.field1695[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1736[var24];
                            int var33 = field1737[var24];
                            int var34 = this.field1683[var22] * var32 + this.field1681[var22] * var33 >> 16;
                            this.field1683[var22] = this.field1683[var22] * var33 - this.field1681[var22] * var32 >> 16;
                            this.field1681[var22] = var34;
                        }
                        this.field1681[var22] += Statics.field1726;
                        this.field1695[var22] += Statics.field1729;
                        this.field1683[var22] += Statics.field1717;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1700.length) {
                    int[] var37 = this.field1700[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1681[var39] -= Statics.field1726;
                        this.field1695[var39] -= Statics.field1729;
                        this.field1683[var39] -= Statics.field1717;
                        this.field1681[var39] = this.field1681[var39] * arg2 / 128;
                        this.field1695[var39] = this.field1695[var39] * arg3 / 128;
                        this.field1683[var39] = this.field1683[var39] * arg4 / 128;
                        this.field1681[var39] += Statics.field1726;
                        this.field1695[var39] += Statics.field1729;
                        this.field1683[var39] += Statics.field1717;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1688 != null && this.field1692 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1688.length) {
                    int[] var42 = this.field1688[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1692[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1692[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cl.h()V")
    public void method1993() {
        for (int var1 = 0; var1 < this.field1680; var1++) {
            int var2 = this.field1681[var1];
            this.field1681[var1] = this.field1683[var1];
            this.field1683[var1] = -var2;
        }
        this.field1703 = 0;
    }

    @ObfuscatedName("cl.w()V")
    public void method1994() {
        for (int var1 = 0; var1 < this.field1680; var1++) {
            this.field1681[var1] = -this.field1681[var1];
            this.field1683[var1] = -this.field1683[var1];
        }
        this.field1703 = 0;
    }

    @ObfuscatedName("cl.s()V")
    public void method1995() {
        for (int var1 = 0; var1 < this.field1680; var1++) {
            int var2 = this.field1683[var1];
            this.field1683[var1] = this.field1681[var1];
            this.field1681[var1] = -var2;
        }
        this.field1703 = 0;
    }

    @ObfuscatedName("cl.p(I)V")
    public void method2010(int arg0) {
        int var2 = field1736[arg0];
        int var3 = field1737[arg0];
        for (int var4 = 0; var4 < this.field1680; var4++) {
            int var5 = this.field1695[var4] * var3 - this.field1683[var4] * var2 >> 16;
            this.field1683[var4] = this.field1695[var4] * var2 + this.field1683[var4] * var3 >> 16;
            this.field1695[var4] = var5;
        }
        this.field1703 = 0;
    }

    @ObfuscatedName("cl.z(III)V")
    public void method1997(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1680; var4++) {
            this.field1681[var4] += arg0;
            this.field1695[var4] += arg1;
            this.field1683[var4] += arg2;
        }
        this.field1703 = 0;
    }

    @ObfuscatedName("cl.n(III)V")
    public void method2001(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1680; var4++) {
            this.field1681[var4] = this.field1681[var4] * arg0 / 128;
            this.field1695[var4] = this.field1695[var4] * arg1 / 128;
            this.field1683[var4] = this.field1683[var4] * arg2 / 128;
        }
        this.field1703 = 0;
    }

    @ObfuscatedName("cl.u(IIIIIII)V")
    public final void method1999(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1693[0] = -1;
        if (this.field1703 != 2 && this.field1703 != 1) {
            this.method1989();
        }
        int var8 = Statics.field1449;
        int var9 = Statics.field1468;
        int var10 = field1736[arg0];
        int var11 = field1737[arg0];
        int var12 = field1736[arg1];
        int var13 = field1737[arg1];
        int var14 = field1736[arg2];
        int var15 = field1737[arg2];
        int var16 = field1736[arg3];
        int var17 = field1737[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1680; var19++) {
            int var20 = this.field1681[var19];
            int var21 = this.field1695[var19];
            int var22 = this.field1683[var19];
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
            field1713[var19] = var30 - var18;
            field1707[var19] = (var26 << 9) / var30 + var8;
            field1724[var19] = (var29 << 9) / var30 + var9;
            if (this.field1696 > 0) {
                field1714[var19] = var26;
                field1676[var19] = var29;
                field1716[var19] = var30;
            }
        }
        try {
            this.method2016(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cl.a(IIIIIIII)V")
    public final void method2000(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1693[0] = -1;
        if (this.field1703 != 2 && this.field1703 != 1) {
            this.method1989();
        }
        int var9 = Statics.field1449;
        int var10 = Statics.field1468;
        int var11 = field1736[arg0];
        int var12 = field1737[arg0];
        int var13 = field1736[arg1];
        int var14 = field1737[arg1];
        int var15 = field1736[arg2];
        int var16 = field1737[arg2];
        int var17 = field1736[arg3];
        int var18 = field1737[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1680; var20++) {
            int var21 = this.field1681[var20];
            int var22 = this.field1695[var20];
            int var23 = this.field1683[var20];
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
            field1713[var20] = var31 - var19;
            field1707[var20] = (var27 << 9) / arg7 + var9;
            field1724[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1696 > 0) {
                field1714[var20] = var27;
                field1676[var20] = var30;
                field1716[var20] = var31;
            }
        }
        try {
            this.method2016(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cl.ag(IIIIIIIII)V")
    public void method1615(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1693[0] = -1;
        if (this.field1703 != 1) {
            this.method2022();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1705 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1705 << 9;
        if (var15 / var13 >= Statics.field1464) {
            return;
        }
        int var16 = this.field1705 + var14 << 9;
        if (var16 / var13 <= Statics.field1463) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1705 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1465) {
            return;
        }
        int var20 = (this.field1347 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1458) {
            return;
        }
        int var22 = (this.field1347 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1696 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1731) {
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
            int var32 = field1701 - Statics.field1449;
            int var33 = field1733 - Statics.field1468;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1702) {
                    field1735[field1734++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1449;
        int var35 = Statics.field1468;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1736[arg0];
            var37 = field1737[arg0];
        }
        for (int var38 = 0; var38 < this.field1680; var38++) {
            int var39 = this.field1681[var38];
            int var40 = this.field1695[var38];
            int var41 = this.field1683[var38];
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
            field1713[var38] = var50 - var11;
            if (var50 >= 50) {
                field1707[var38] = (var46 << 9) / var50 + var34;
                field1724[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1707[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1714[var38] = var46;
                field1676[var38] = var49;
                field1716[var38] = var50;
            }
        }
        try {
            this.method2016(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cl.d(ZZI)V")
    public final void method2016(boolean arg0, boolean arg1, int arg2) {
        if (this.field1706 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1706; var4++) {
            field1693[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1718; var5++) {
            if (this.field1690[var5] != -2) {
                int var6 = this.field1715[var5];
                int var7 = this.field1712[var5];
                int var8 = this.field1687[var5];
                int var9 = field1707[var6];
                int var10 = field1707[var7];
                int var11 = field1707[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1714[var6];
                    int var13 = field1714[var7];
                    int var14 = field1714[var8];
                    int var15 = field1676[var6];
                    int var16 = field1676[var7];
                    int var17 = field1676[var8];
                    int var18 = field1716[var6];
                    int var19 = field1716[var7];
                    int var20 = field1716[var8];
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
                        field1682[var5] = true;
                        int var30 = (field1713[var6] + field1713[var7] + field1713[var8]) / 3 + this.field1727;
                        field1719[var30][field1693[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2005(field1701, field1733, field1724[var6], field1724[var7], field1724[var8], var9, var10, var11)) {
                        field1735[field1734++] = arg2;
                        arg1 = false;
                    }
                    if ((field1724[var8] - field1724[var7]) * (var9 - var10) - (field1724[var6] - field1724[var7]) * (var11 - var10) > 0) {
                        field1682[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1461 && var10 <= Statics.field1461 && var11 <= Statics.field1461) {
                            field1709[var5] = false;
                        } else {
                            field1709[var5] = true;
                        }
                        int var31 = (field1713[var6] + field1713[var7] + field1713[var8]) / 3 + this.field1727;
                        field1719[var31][field1693[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1691 == null) {
            for (int var32 = this.field1706 - 1; var32 >= 0; var32--) {
                int var33 = field1693[var32];
                if (var33 > 0) {
                    int[] var34 = field1719[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2003(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1720[var36] = 0;
            field1684[var36] = 0;
        }
        for (int var37 = this.field1706 - 1; var37 >= 0; var37--) {
            int var38 = field1693[var37];
            if (var38 > 0) {
                int[] var39 = field1719[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1691[var41];
                    int var43 = field1720[var42]++;
                    field1721[var42][var43] = var41;
                    if (var42 < 10) {
                        field1684[var42] += var37;
                    } else if (var42 == 10) {
                        field1722[var43] = var37;
                    } else {
                        field1723[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1720[1] > 0 || field1720[2] > 0) {
            var44 = (field1684[1] + field1684[2]) / (field1720[1] + field1720[2]);
        }
        int var45 = 0;
        if (field1720[3] > 0 || field1720[4] > 0) {
            var45 = (field1684[3] + field1684[4]) / (field1720[3] + field1720[4]);
        }
        int var46 = 0;
        if (field1720[6] > 0 || field1720[8] > 0) {
            var46 = (field1684[6] + field1684[8]) / (field1720[6] + field1720[8]);
        }
        int var47 = 0;
        int var48 = field1720[10];
        int[] var49 = field1721[10];
        int[] var50 = field1722;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1720[11];
            var49 = field1721[11];
            var50 = field1723;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2003(var49[var47++]);
                if (var47 == var48 && field1721[11] != var49) {
                    var47 = 0;
                    var48 = field1720[11];
                    var49 = field1721[11];
                    var50 = field1723;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2003(var49[var47++]);
                if (var47 == var48 && field1721[11] != var49) {
                    var47 = 0;
                    var48 = field1720[11];
                    var49 = field1721[11];
                    var50 = field1723;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2003(var49[var47++]);
                if (var47 == var48 && field1721[11] != var49) {
                    var47 = 0;
                    var48 = field1720[11];
                    var49 = field1721[11];
                    var50 = field1723;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1720[var52];
            int[] var54 = field1721[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2003(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2003(var49[var47++]);
            if (var47 == var48 && field1721[11] != var49) {
                var47 = 0;
                var49 = field1721[11];
                var48 = field1720[11];
                var50 = field1723;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cl.m(I)V")
    public final void method2003(int arg0) {
        if (field1682[arg0]) {
            this.method1996(arg0);
            return;
        }
        int var2 = this.field1715[arg0];
        int var3 = this.field1712[arg0];
        int var4 = this.field1687[arg0];
        class85.field1454 = field1709[arg0];
        if (this.field1692 == null) {
            class85.field1452 = 0;
        } else {
            class85.field1452 = this.field1692[arg0] & 0xFF;
        }
        if (this.field1694 != null && this.field1694[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1728 == null || this.field1728[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1728[arg0] & 0xFF;
                var6 = this.field1697[var5];
                var7 = this.field1740[var5];
                var8 = this.field1732[var5];
            }
            if (this.field1690[arg0] == -1) {
                class85.method1859(field1724[var2], field1724[var3], field1724[var4], field1707[var2], field1707[var3], field1707[var4], this.field1699[arg0], this.field1699[arg0], this.field1699[arg0], field1714[var6], field1714[var7], field1714[var8], field1676[var6], field1676[var7], field1676[var8], field1716[var6], field1716[var7], field1716[var8], this.field1694[arg0]);
            } else {
                class85.method1859(field1724[var2], field1724[var3], field1724[var4], field1707[var2], field1707[var3], field1707[var4], this.field1699[arg0], this.field1698[arg0], this.field1690[arg0], field1714[var6], field1714[var7], field1714[var8], field1676[var6], field1676[var7], field1676[var8], field1716[var6], field1716[var7], field1716[var8], this.field1694[arg0]);
            }
        } else if (this.field1690[arg0] == -1) {
            class85.method1807(field1724[var2], field1724[var3], field1724[var4], field1707[var2], field1707[var3], field1707[var4], field1738[this.field1699[arg0]]);
        } else {
            class85.method1813(field1724[var2], field1724[var3], field1724[var4], field1707[var2], field1707[var3], field1707[var4], this.field1699[arg0], this.field1698[arg0], this.field1690[arg0]);
        }
    }

    @ObfuscatedName("cl.q(I)V")
    public final void method1996(int arg0) {
        int var2 = Statics.field1449;
        int var3 = Statics.field1468;
        int var4 = 0;
        int var5 = this.field1715[arg0];
        int var6 = this.field1712[arg0];
        int var7 = this.field1687[arg0];
        int var8 = field1716[var5];
        int var9 = field1716[var6];
        int var10 = field1716[var7];
        if (this.field1692 == null) {
            class85.field1452 = 0;
        } else {
            class85.field1452 = this.field1692[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1725[var4] = field1707[var5];
            field1711[var4] = field1724[var5];
            field1686[var4++] = this.field1699[arg0];
        } else {
            int var11 = field1714[var5];
            int var12 = field1676[var5];
            int var13 = this.field1699[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1739[var10 - var8];
                field1725[var4] = (((field1714[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1711[var4] = (((field1676[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1686[var4++] = ((this.field1690[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1739[var9 - var8];
                field1725[var4] = (((field1714[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1711[var4] = (((field1676[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1686[var4++] = ((this.field1698[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1725[var4] = field1707[var6];
            field1711[var4] = field1724[var6];
            field1686[var4++] = this.field1698[arg0];
        } else {
            int var16 = field1714[var6];
            int var17 = field1676[var6];
            int var18 = this.field1698[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1739[var8 - var9];
                field1725[var4] = (((field1714[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1711[var4] = (((field1676[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1686[var4++] = ((this.field1699[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1739[var10 - var9];
                field1725[var4] = (((field1714[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1711[var4] = (((field1676[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1686[var4++] = ((this.field1690[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1725[var4] = field1707[var7];
            field1711[var4] = field1724[var7];
            field1686[var4++] = this.field1690[arg0];
        } else {
            int var21 = field1714[var7];
            int var22 = field1676[var7];
            int var23 = this.field1690[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1739[var9 - var10];
                field1725[var4] = (((field1714[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1711[var4] = (((field1676[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1686[var4++] = ((this.field1698[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1739[var8 - var10];
                field1725[var4] = (((field1714[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1711[var4] = (((field1676[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1686[var4++] = ((this.field1699[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1725[0];
        int var27 = field1725[1];
        int var28 = field1725[2];
        int var29 = field1711[0];
        int var30 = field1711[1];
        int var31 = field1711[2];
        class85.field1454 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1461 || var27 > Statics.field1461 || var28 > Statics.field1461) {
                class85.field1454 = true;
            }
            if (this.field1694 != null && this.field1694[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1728 == null || this.field1728[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1728[arg0] & 0xFF;
                    var33 = this.field1697[var32];
                    var34 = this.field1740[var32];
                    var35 = this.field1732[var32];
                }
                if (this.field1690[arg0] == -1) {
                    class85.method1859(var29, var30, var31, var26, var27, var28, this.field1699[arg0], this.field1699[arg0], this.field1699[arg0], field1714[var33], field1714[var34], field1714[var35], field1676[var33], field1676[var34], field1676[var35], field1716[var33], field1716[var34], field1716[var35], this.field1694[arg0]);
                } else {
                    class85.method1859(var29, var30, var31, var26, var27, var28, field1686[0], field1686[1], field1686[2], field1714[var33], field1714[var34], field1714[var35], field1676[var33], field1676[var34], field1676[var35], field1716[var33], field1716[var34], field1716[var35], this.field1694[arg0]);
                }
            } else if (this.field1690[arg0] == -1) {
                class85.method1807(var29, var30, var31, var26, var27, var28, field1738[this.field1699[arg0]]);
            } else {
                class85.method1813(var29, var30, var31, var26, var27, var28, field1686[0], field1686[1], field1686[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1461 || var27 > Statics.field1461 || var28 > Statics.field1461 || field1725[3] < 0 || field1725[3] > Statics.field1461) {
            class85.field1454 = true;
        }
        if (this.field1694 != null && this.field1694[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1728 == null || this.field1728[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1728[arg0] & 0xFF;
                var37 = this.field1697[var36];
                var38 = this.field1740[var36];
                var39 = this.field1732[var36];
            }
            short var40 = this.field1694[arg0];
            if (this.field1690[arg0] == -1) {
                class85.method1859(var29, var30, var31, var26, var27, var28, this.field1699[arg0], this.field1699[arg0], this.field1699[arg0], field1714[var37], field1714[var38], field1714[var39], field1676[var37], field1676[var38], field1676[var39], field1716[var37], field1716[var38], field1716[var39], var40);
                class85.method1859(var29, var31, field1711[3], var26, var28, field1725[3], this.field1699[arg0], this.field1699[arg0], this.field1699[arg0], field1714[var37], field1714[var38], field1714[var39], field1676[var37], field1676[var38], field1676[var39], field1716[var37], field1716[var38], field1716[var39], var40);
            } else {
                class85.method1859(var29, var30, var31, var26, var27, var28, field1686[0], field1686[1], field1686[2], field1714[var37], field1714[var38], field1714[var39], field1676[var37], field1676[var38], field1676[var39], field1716[var37], field1716[var38], field1716[var39], var40);
                class85.method1859(var29, var31, field1711[3], var26, var28, field1725[3], field1686[0], field1686[2], field1686[3], field1714[var37], field1714[var38], field1714[var39], field1676[var37], field1676[var38], field1676[var39], field1716[var37], field1716[var38], field1716[var39], var40);
            }
        } else if (this.field1690[arg0] == -1) {
            int var41 = field1738[this.field1699[arg0]];
            class85.method1807(var29, var30, var31, var26, var27, var28, var41);
            class85.method1807(var29, var31, field1711[3], var26, var28, field1725[3], var41);
        } else {
            class85.method1813(var29, var30, var31, var26, var27, var28, field1686[0], field1686[1], field1686[2]);
            class85.method1813(var29, var31, field1711[3], var26, var28, field1725[3], field1686[0], field1686[2], field1686[3]);
        }
    }

    @ObfuscatedName("cl.e(IIIIIIII)Z")
    public final boolean method2005(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
