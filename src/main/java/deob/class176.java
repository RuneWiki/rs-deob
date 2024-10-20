package deob;

@ObfuscatedName("gm")
public class class176 extends class189 {

    @ObfuscatedName("gm.au")
    public int field1839 = 0;

    @ObfuscatedName("gm.ax")
    public int[] field1873;

    @ObfuscatedName("gm.ao")
    public int[] field1841;

    @ObfuscatedName("gm.am")
    public int[] field1879;

    @ObfuscatedName("gm.ac")
    public int field1843 = 0;

    @ObfuscatedName("gm.ae")
    public int[] field1844;

    @ObfuscatedName("gm.ad")
    public int[] field1859;

    @ObfuscatedName("gm.aq")
    public int[] field1849;

    @ObfuscatedName("gm.al")
    public byte[] field1847;

    @ObfuscatedName("gm.aj")
    public byte[] field1848;

    @ObfuscatedName("gm.as")
    public byte[] field1878;

    @ObfuscatedName("gm.aw")
    public byte[] field1850;

    @ObfuscatedName("gm.af")
    public short[] field1851;

    @ObfuscatedName("gm.aa")
    public short[] field1852;

    @ObfuscatedName("gm.ah")
    public byte field1853 = 0;

    @ObfuscatedName("gm.ag")
    public int field1854;

    @ObfuscatedName("gm.av")
    public byte[] field1855;

    @ObfuscatedName("gm.ar")
    public short[] field1856;

    @ObfuscatedName("gm.ap")
    public short[] field1857;

    @ObfuscatedName("gm.ak")
    public short[] field1858;

    @ObfuscatedName("gm.ai")
    public int[] field1868;

    @ObfuscatedName("gm.at")
    public int[] field1876;

    @ObfuscatedName("gm.az")
    public int[][] field1861;

    @ObfuscatedName("gm.bg")
    public int[][] field1862;

    @ObfuscatedName("gm.bz")
    public int[][] field1863;

    @ObfuscatedName("gm.bj")
    public int[][] field1864;

    @ObfuscatedName("gm.bc")
    public class190[] field1846;

    @ObfuscatedName("gm.bo")
    public class199[] field1866;

    @ObfuscatedName("gm.bm")
    public class199[] field1872;

    @ObfuscatedName("gm.bd")
    public short field1860;

    @ObfuscatedName("gm.bh")
    public short field1869;

    @ObfuscatedName("gm.bx")
    public boolean field1867 = false;

    @ObfuscatedName("gm.bv")
    public int field1871;

    @ObfuscatedName("gm.bu")
    public int field1870;

    @ObfuscatedName("gm.bp")
    public int field1845;

    @ObfuscatedName("gm.br")
    public int field1874;

    @ObfuscatedName("gm.bf")
    public int field1875;

    @ObfuscatedName("gm.bq")
    public static int[] field1840 = new int[10000];

    @ObfuscatedName("gm.bt")
    public static int[] field1880 = new int[10000];

    @ObfuscatedName("gm.bi")
    public static int field1877 = 0;

    @ObfuscatedName("gm.be")
    public static int[] field1836 = class181.field1941;

    @ObfuscatedName("gm.ba")
    public static int[] field1865 = class181.field1942;

    public class176() {
    }

    @ObfuscatedName("gm.ab(Lob;II)Lgm;")
    public static class176 method3343(class389 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6670(arg1, arg2);
        return var3 == null ? null : new class176(var3);
    }

    public class176(byte[] arg0) {
        class549 var2 = new class549(10);
        var2.method8782(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method3344(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method3414(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method3346(arg0);
        } else {
            this.method3347(arg0);
        }
    }

    @ObfuscatedName("gm.ay([B)V")
    public void method3344(byte[] arg0) {
        class549 var2 = new class549(arg0);
        class549 var3 = new class549(arg0);
        class549 var4 = new class549(arg0);
        class549 var5 = new class549(arg0);
        class549 var6 = new class549(arg0);
        class549 var7 = new class549(arg0);
        class549 var8 = new class549(arg0);
        var2.field5378 = arg0.length - 26;
        int var9 = var2.method8968();
        int var10 = var2.method8968();
        int var11 = var2.method9025();
        int var12 = var2.method9025();
        int var13 = var2.method9025();
        int var14 = var2.method9025();
        int var15 = var2.method9025();
        int var16 = var2.method9025();
        int var17 = var2.method9025();
        int var18 = var2.method9025();
        int var19 = var2.method8968();
        int var20 = var2.method8968();
        int var21 = var2.method8968();
        int var22 = var2.method8968();
        int var23 = var2.method8968();
        int var24 = var2.method8968();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field1855 = new byte[var11];
            var2.field5378 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field1855[var28] = var2.method8798();
                if (var29 == 0) {
                    var25++;
                }
                if (var29 >= 1 && var29 <= 3) {
                    var26++;
                }
                if (var29 == 2) {
                    var27++;
                }
            }
        }
        int var32 = var9 + var11;
        int var33 = var32;
        if (var12 == 1) {
            var32 += var10;
        }
        int var35 = var10 + var32;
        int var36 = var35;
        if (var13 == 255) {
            var35 += var10;
        }
        int var37 = var35;
        if (var15 == 1) {
            var35 += var10;
        }
        int var39 = var24 + var35;
        int var40 = var39;
        if (var14 == 1) {
            var39 += var10;
        }
        int var42 = var22 + var39;
        int var43 = var42;
        if (var16 == 1) {
            var42 += var10 * 2;
        }
        int var45 = var23 + var42;
        int var47 = var10 * 2 + var45;
        int var49 = var19 + var47;
        int var51 = var20 + var49;
        int var53 = var21 + var51;
        int var55 = var25 * 6 + var53;
        int var57 = var26 * 6 + var55;
        int var59 = var26 * 6 + var57;
        int var61 = var26 * 2 + var59;
        int var63 = var26 + var61;
        int var65 = var26 * 2 + var27 * 2 + var63;
        this.field1839 = var9;
        this.field1843 = var10;
        this.field1854 = var11;
        this.field1873 = new int[var9];
        this.field1841 = new int[var9];
        this.field1879 = new int[var9];
        this.field1844 = new int[var10];
        this.field1859 = new int[var10];
        this.field1849 = new int[var10];
        if (var17 == 1) {
            this.field1868 = new int[var9];
        }
        if (var12 == 1) {
            this.field1847 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1848 = new byte[var10];
        } else {
            this.field1853 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1878 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1876 = new int[var10];
        }
        if (var16 == 1) {
            this.field1852 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1850 = new byte[var10];
        }
        if (var18 == 1) {
            this.field1863 = new int[var9][];
            this.field1864 = new int[var9][];
        }
        this.field1851 = new short[var10];
        if (var11 > 0) {
            this.field1856 = new short[var11];
            this.field1857 = new short[var11];
            this.field1858 = new short[var11];
        }
        var2.field5378 = var11;
        var3.field5378 = var47;
        var4.field5378 = var49;
        var5.field5378 = var51;
        var6.field5378 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method9025();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method8812();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method8812();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method8812();
            }
            this.field1873[var70] = var67 + var72;
            this.field1841[var70] = var68 + var73;
            this.field1879[var70] = var69 + var74;
            var67 = this.field1873[var70];
            var68 = this.field1841[var70];
            var69 = this.field1879[var70];
            if (var17 == 1) {
                this.field1868[var70] = var6.method9025();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method9025();
                this.field1863[var75] = new int[var76];
                this.field1864[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field1863[var75][var77] = var6.method9025();
                    this.field1864[var75][var77] = var6.method9025();
                }
            }
        }
        var2.field5378 = var45;
        var3.field5378 = var33;
        var4.field5378 = var36;
        var5.field5378 = var40;
        var6.field5378 = var37;
        var7.field5378 = var43;
        var8.field5378 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field1851[var78] = (short) var2.method8968();
            if (var12 == 1) {
                this.field1847[var78] = var3.method8798();
            }
            if (var13 == 255) {
                this.field1848[var78] = var4.method8798();
            }
            if (var14 == 1) {
                this.field1878[var78] = var5.method8798();
            }
            if (var15 == 1) {
                this.field1876[var78] = var6.method9025();
            }
            if (var16 == 1) {
                this.field1852[var78] = (short) (var7.method8968() - 1);
            }
            if (this.field1850 != null && this.field1852[var78] != -1) {
                this.field1850[var78] = (byte) (var8.method9025() - 1);
            }
        }
        var2.field5378 = var39;
        var3.field5378 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method9025();
            if (var84 == 1) {
                var79 = var2.method8812() + var82;
                var80 = var2.method8812() + var79;
                var81 = var2.method8812() + var80;
                var82 = var81;
                this.field1844[var83] = var79;
                this.field1859[var83] = var80;
                this.field1849[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method8812() + var82;
                var82 = var81;
                this.field1844[var83] = var79;
                this.field1859[var83] = var80;
                this.field1849[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method8812() + var82;
                var82 = var81;
                this.field1844[var83] = var79;
                this.field1859[var83] = var80;
                this.field1849[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method8812() + var82;
                var82 = var81;
                this.field1844[var83] = var79;
                this.field1859[var83] = var87;
                this.field1849[var83] = var81;
            }
        }
        var2.field5378 = var53;
        var3.field5378 = var55;
        var4.field5378 = var57;
        var5.field5378 = var59;
        var6.field5378 = var61;
        var7.field5378 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field1855[var88] & 0xFF;
            if (var89 == 0) {
                this.field1856[var88] = (short) var2.method8968();
                this.field1857[var88] = (short) var2.method8968();
                this.field1858[var88] = (short) var2.method8968();
            }
        }
        var2.field5378 = var65;
        int var90 = var2.method9025();
        if (var90 == 0) {
            return;
        }
        new class204();
        var2.method8968();
        var2.method8968();
        var2.method8968();
        var2.method8803();
    }

    @ObfuscatedName("gm.an([B)V")
    public void method3414(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class549 var4 = new class549(arg0);
        class549 var5 = new class549(arg0);
        class549 var6 = new class549(arg0);
        class549 var7 = new class549(arg0);
        class549 var8 = new class549(arg0);
        var4.field5378 = arg0.length - 23;
        int var9 = var4.method8968();
        int var10 = var4.method8968();
        int var11 = var4.method9025();
        int var12 = var4.method9025();
        int var13 = var4.method9025();
        int var14 = var4.method9025();
        int var15 = var4.method9025();
        int var16 = var4.method9025();
        int var17 = var4.method9025();
        int var18 = var4.method8968();
        int var19 = var4.method8968();
        int var20 = var4.method8968();
        int var21 = var4.method8968();
        int var22 = var4.method8968();
        byte var23 = 0;
        int var25 = var9 + var23;
        int var27 = var10 + var25;
        int var28 = var27;
        if (var13 == 255) {
            var27 += var10;
        }
        int var29 = var27;
        if (var15 == 1) {
            var27 += var10;
        }
        int var30 = var27;
        if (var12 == 1) {
            var27 += var10;
        }
        int var32 = var22 + var27;
        int var33 = var32;
        if (var14 == 1) {
            var32 += var10;
        }
        int var35 = var21 + var32;
        int var37 = var10 * 2 + var35;
        int var39 = var11 * 6 + var37;
        int var41 = var18 + var39;
        int var43 = var19 + var41;
        int var10000 = var20 + var43;
        this.field1839 = var9;
        this.field1843 = var10;
        this.field1854 = var11;
        this.field1873 = new int[var9];
        this.field1841 = new int[var9];
        this.field1879 = new int[var9];
        this.field1844 = new int[var10];
        this.field1859 = new int[var10];
        this.field1849 = new int[var10];
        if (var11 > 0) {
            this.field1855 = new byte[var11];
            this.field1856 = new short[var11];
            this.field1857 = new short[var11];
            this.field1858 = new short[var11];
        }
        if (var16 == 1) {
            this.field1868 = new int[var9];
        }
        if (var12 == 1) {
            this.field1847 = new byte[var10];
            this.field1850 = new byte[var10];
            this.field1852 = new short[var10];
        }
        if (var13 == 255) {
            this.field1848 = new byte[var10];
        } else {
            this.field1853 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1878 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1876 = new int[var10];
        }
        if (var17 == 1) {
            this.field1863 = new int[var9][];
            this.field1864 = new int[var9][];
        }
        this.field1851 = new short[var10];
        var4.field5378 = var23;
        var5.field5378 = var39;
        var6.field5378 = var41;
        var7.field5378 = var43;
        var8.field5378 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method9025();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method8812();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method8812();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method8812();
            }
            this.field1873[var49] = var46 + var51;
            this.field1841[var49] = var47 + var52;
            this.field1879[var49] = var48 + var53;
            var46 = this.field1873[var49];
            var47 = this.field1841[var49];
            var48 = this.field1879[var49];
            if (var16 == 1) {
                this.field1868[var49] = var8.method9025();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method9025();
                this.field1863[var54] = new int[var55];
                this.field1864[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field1863[var54][var56] = var8.method9025();
                    this.field1864[var54][var56] = var8.method9025();
                }
            }
        }
        var4.field5378 = var35;
        var5.field5378 = var30;
        var6.field5378 = var28;
        var7.field5378 = var33;
        var8.field5378 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field1851[var57] = (short) var4.method8968();
            if (var12 == 1) {
                int var58 = var5.method9025();
                if ((var58 & 0x1) == 1) {
                    this.field1847[var57] = 1;
                    var2 = true;
                } else {
                    this.field1847[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field1850[var57] = (byte) (var58 >> 2);
                    this.field1852[var57] = this.field1851[var57];
                    this.field1851[var57] = 127;
                    if (this.field1852[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1850[var57] = -1;
                    this.field1852[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field1848[var57] = var6.method8798();
            }
            if (var14 == 1) {
                this.field1878[var57] = var7.method8798();
            }
            if (var15 == 1) {
                this.field1876[var57] = var8.method9025();
            }
        }
        var4.field5378 = var32;
        var5.field5378 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method9025();
            if (var64 == 1) {
                var59 = var4.method8812() + var62;
                var60 = var4.method8812() + var59;
                var61 = var4.method8812() + var60;
                var62 = var61;
                this.field1844[var63] = var59;
                this.field1859[var63] = var60;
                this.field1849[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method8812() + var62;
                var62 = var61;
                this.field1844[var63] = var59;
                this.field1859[var63] = var60;
                this.field1849[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method8812() + var62;
                var62 = var61;
                this.field1844[var63] = var59;
                this.field1859[var63] = var60;
                this.field1849[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method8812() + var62;
                var62 = var61;
                this.field1844[var63] = var59;
                this.field1859[var63] = var67;
                this.field1849[var63] = var61;
            }
        }
        var4.field5378 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field1855[var68] = 0;
            this.field1856[var68] = (short) var4.method8968();
            this.field1857[var68] = (short) var4.method8968();
            this.field1858[var68] = (short) var4.method8968();
        }
        if (this.field1850 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field1850[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field1856[var71] & 0xFFFF) == this.field1844[var70] && (this.field1857[var71] & 0xFFFF) == this.field1859[var70] && (this.field1858[var71] & 0xFFFF) == this.field1849[var70]) {
                        this.field1850[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field1850 = null;
            }
        }
        if (!var3) {
            this.field1852 = null;
        }
        if (!var2) {
            this.field1847 = null;
        }
    }

    @ObfuscatedName("gm.au([B)V")
    public void method3346(byte[] arg0) {
        class549 var2 = new class549(arg0);
        class549 var3 = new class549(arg0);
        class549 var4 = new class549(arg0);
        class549 var5 = new class549(arg0);
        class549 var6 = new class549(arg0);
        class549 var7 = new class549(arg0);
        class549 var8 = new class549(arg0);
        var2.field5378 = arg0.length - 23;
        int var9 = var2.method8968();
        int var10 = var2.method8968();
        int var11 = var2.method9025();
        int var12 = var2.method9025();
        int var13 = var2.method9025();
        int var14 = var2.method9025();
        int var15 = var2.method9025();
        int var16 = var2.method9025();
        int var17 = var2.method9025();
        int var18 = var2.method8968();
        int var19 = var2.method8968();
        int var20 = var2.method8968();
        int var21 = var2.method8968();
        int var22 = var2.method8968();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1855 = new byte[var11];
            var2.field5378 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1855[var26] = var2.method8798();
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 * 2 + var56;
        int var60 = var24 + var58;
        int var62 = var24 * 2 + var25 * 2 + var60;
        this.field1839 = var9;
        this.field1843 = var10;
        this.field1854 = var11;
        this.field1873 = new int[var9];
        this.field1841 = new int[var9];
        this.field1879 = new int[var9];
        this.field1844 = new int[var10];
        this.field1859 = new int[var10];
        this.field1849 = new int[var10];
        if (var17 == 1) {
            this.field1868 = new int[var9];
        }
        if (var12 == 1) {
            this.field1847 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1848 = new byte[var10];
        } else {
            this.field1853 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1878 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1876 = new int[var10];
        }
        if (var16 == 1) {
            this.field1852 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1850 = new byte[var10];
        }
        this.field1851 = new short[var10];
        if (var11 > 0) {
            this.field1856 = new short[var11];
            this.field1857 = new short[var11];
            this.field1858 = new short[var11];
        }
        var2.field5378 = var11;
        var3.field5378 = var44;
        var4.field5378 = var46;
        var5.field5378 = var48;
        var6.field5378 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method9025();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method8812();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method8812();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method8812();
            }
            this.field1873[var67] = var64 + var69;
            this.field1841[var67] = var65 + var70;
            this.field1879[var67] = var66 + var71;
            var64 = this.field1873[var67];
            var65 = this.field1841[var67];
            var66 = this.field1879[var67];
            if (var17 == 1) {
                this.field1868[var67] = var6.method9025();
            }
        }
        var2.field5378 = var42;
        var3.field5378 = var31;
        var4.field5378 = var34;
        var5.field5378 = var37;
        var6.field5378 = var35;
        var7.field5378 = var40;
        var8.field5378 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1851[var72] = (short) var2.method8968();
            if (var12 == 1) {
                this.field1847[var72] = var3.method8798();
            }
            if (var13 == 255) {
                this.field1848[var72] = var4.method8798();
            }
            if (var14 == 1) {
                this.field1878[var72] = var5.method8798();
            }
            if (var15 == 1) {
                this.field1876[var72] = var6.method9025();
            }
            if (var16 == 1) {
                this.field1852[var72] = (short) (var7.method8968() - 1);
            }
            if (this.field1850 != null && this.field1852[var72] != -1) {
                this.field1850[var72] = (byte) (var8.method9025() - 1);
            }
        }
        var2.field5378 = var33;
        var3.field5378 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method9025();
            if (var78 == 1) {
                var73 = var2.method8812() + var76;
                var74 = var2.method8812() + var73;
                var75 = var2.method8812() + var74;
                var76 = var75;
                this.field1844[var77] = var73;
                this.field1859[var77] = var74;
                this.field1849[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method8812() + var76;
                var76 = var75;
                this.field1844[var77] = var73;
                this.field1859[var77] = var74;
                this.field1849[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method8812() + var76;
                var76 = var75;
                this.field1844[var77] = var73;
                this.field1859[var77] = var74;
                this.field1849[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method8812() + var76;
                var76 = var75;
                this.field1844[var77] = var73;
                this.field1859[var77] = var81;
                this.field1849[var77] = var75;
            }
        }
        var2.field5378 = var50;
        var3.field5378 = var52;
        var4.field5378 = var54;
        var5.field5378 = var56;
        var6.field5378 = var58;
        var7.field5378 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1855[var82] & 0xFF;
            if (var83 == 0) {
                this.field1856[var82] = (short) var2.method8968();
                this.field1857[var82] = (short) var2.method8968();
                this.field1858[var82] = (short) var2.method8968();
            }
        }
        var2.field5378 = var62;
        int var84 = var2.method9025();
        if (var84 == 0) {
            return;
        }
        new class204();
        var2.method8968();
        var2.method8968();
        var2.method8968();
        var2.method8803();
    }

    @ObfuscatedName("gm.ax([B)V")
    public void method3347(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class549 var4 = new class549(arg0);
        class549 var5 = new class549(arg0);
        class549 var6 = new class549(arg0);
        class549 var7 = new class549(arg0);
        class549 var8 = new class549(arg0);
        var4.field5378 = arg0.length - 18;
        int var9 = var4.method8968();
        int var10 = var4.method8968();
        int var11 = var4.method9025();
        int var12 = var4.method9025();
        int var13 = var4.method9025();
        int var14 = var4.method9025();
        int var15 = var4.method9025();
        int var16 = var4.method9025();
        int var17 = var4.method8968();
        int var18 = var4.method8968();
        int var19 = var4.method8968();
        int var20 = var4.method8968();
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field1839 = var9;
        this.field1843 = var10;
        this.field1854 = var11;
        this.field1873 = new int[var9];
        this.field1841 = new int[var9];
        this.field1879 = new int[var9];
        this.field1844 = new int[var10];
        this.field1859 = new int[var10];
        this.field1849 = new int[var10];
        if (var11 > 0) {
            this.field1855 = new byte[var11];
            this.field1856 = new short[var11];
            this.field1857 = new short[var11];
            this.field1858 = new short[var11];
        }
        if (var16 == 1) {
            this.field1868 = new int[var9];
        }
        if (var12 == 1) {
            this.field1847 = new byte[var10];
            this.field1850 = new byte[var10];
            this.field1852 = new short[var10];
        }
        if (var13 == 255) {
            this.field1848 = new byte[var10];
        } else {
            this.field1853 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1878 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1876 = new int[var10];
        }
        this.field1851 = new short[var10];
        var4.field5378 = var21;
        var5.field5378 = var36;
        var6.field5378 = var38;
        var7.field5378 = var40;
        var8.field5378 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method9025();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method8812();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method8812();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method8812();
            }
            this.field1873[var46] = var43 + var48;
            this.field1841[var46] = var44 + var49;
            this.field1879[var46] = var45 + var50;
            var43 = this.field1873[var46];
            var44 = this.field1841[var46];
            var45 = this.field1879[var46];
            if (var16 == 1) {
                this.field1868[var46] = var8.method9025();
            }
        }
        var4.field5378 = var32;
        var5.field5378 = var28;
        var6.field5378 = var26;
        var7.field5378 = var30;
        var8.field5378 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1851[var51] = (short) var4.method8968();
            if (var12 == 1) {
                int var52 = var5.method9025();
                if ((var52 & 0x1) == 1) {
                    this.field1847[var51] = 1;
                    var2 = true;
                } else {
                    this.field1847[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1850[var51] = (byte) (var52 >> 2);
                    this.field1852[var51] = this.field1851[var51];
                    this.field1851[var51] = 127;
                    if (this.field1852[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1850[var51] = -1;
                    this.field1852[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1848[var51] = var6.method8798();
            }
            if (var14 == 1) {
                this.field1878[var51] = var7.method8798();
            }
            if (var15 == 1) {
                this.field1876[var51] = var8.method9025();
            }
        }
        var4.field5378 = var25;
        var5.field5378 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method9025();
            if (var58 == 1) {
                var53 = var4.method8812() + var56;
                var54 = var4.method8812() + var53;
                var55 = var4.method8812() + var54;
                var56 = var55;
                this.field1844[var57] = var53;
                this.field1859[var57] = var54;
                this.field1849[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method8812() + var56;
                var56 = var55;
                this.field1844[var57] = var53;
                this.field1859[var57] = var54;
                this.field1849[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method8812() + var56;
                var56 = var55;
                this.field1844[var57] = var53;
                this.field1859[var57] = var54;
                this.field1849[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method8812() + var56;
                var56 = var55;
                this.field1844[var57] = var53;
                this.field1859[var57] = var61;
                this.field1849[var57] = var55;
            }
        }
        var4.field5378 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1855[var62] = 0;
            this.field1856[var62] = (short) var4.method8968();
            this.field1857[var62] = (short) var4.method8968();
            this.field1858[var62] = (short) var4.method8968();
        }
        if (this.field1850 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1850[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1856[var65] & 0xFFFF) == this.field1844[var64] && (this.field1857[var65] & 0xFFFF) == this.field1859[var64] && (this.field1858[var65] & 0xFFFF) == this.field1849[var64]) {
                        this.field1850[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1850 = null;
            }
        }
        if (!var3) {
            this.field1852 = null;
        }
        if (!var2) {
            this.field1847 = null;
        }
    }

    public class176(class176[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field1839 = 0;
        this.field1843 = 0;
        this.field1854 = 0;
        this.field1853 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class176 var11 = arg0[var10];
            if (var11 != null) {
                this.field1839 += var11.field1839;
                this.field1843 += var11.field1843;
                this.field1854 += var11.field1854;
                if (var11.field1848 == null) {
                    if (this.field1853 == -1) {
                        this.field1853 = var11.field1853;
                    }
                    if (this.field1853 != var11.field1853) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field1847 != null;
                var5 |= var11.field1878 != null;
                var6 |= var11.field1876 != null;
                var7 |= var11.field1852 != null;
                var8 |= var11.field1850 != null;
                var9 |= var11.field1863 != null;
            }
        }
        this.field1873 = new int[this.field1839];
        this.field1841 = new int[this.field1839];
        this.field1879 = new int[this.field1839];
        this.field1868 = new int[this.field1839];
        this.field1844 = new int[this.field1843];
        this.field1859 = new int[this.field1843];
        this.field1849 = new int[this.field1843];
        if (var3) {
            this.field1847 = new byte[this.field1843];
        }
        if (var4) {
            this.field1848 = new byte[this.field1843];
        }
        if (var5) {
            this.field1878 = new byte[this.field1843];
        }
        if (var6) {
            this.field1876 = new int[this.field1843];
        }
        if (var7) {
            this.field1852 = new short[this.field1843];
        }
        if (var8) {
            this.field1850 = new byte[this.field1843];
        }
        if (var9) {
            this.field1863 = new int[this.field1839][];
            this.field1864 = new int[this.field1839][];
        }
        this.field1851 = new short[this.field1843];
        if (this.field1854 > 0) {
            this.field1855 = new byte[this.field1854];
            this.field1856 = new short[this.field1854];
            this.field1857 = new short[this.field1854];
            this.field1858 = new short[this.field1854];
        }
        this.field1839 = 0;
        this.field1843 = 0;
        this.field1854 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class176 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field1843; var14++) {
                    if (var3 && var13.field1847 != null) {
                        this.field1847[this.field1843] = var13.field1847[var14];
                    }
                    if (var4) {
                        if (var13.field1848 == null) {
                            this.field1848[this.field1843] = var13.field1853;
                        } else {
                            this.field1848[this.field1843] = var13.field1848[var14];
                        }
                    }
                    if (var5 && var13.field1878 != null) {
                        this.field1878[this.field1843] = var13.field1878[var14];
                    }
                    if (var6 && var13.field1876 != null) {
                        this.field1876[this.field1843] = var13.field1876[var14];
                    }
                    if (var7) {
                        if (var13.field1852 == null) {
                            this.field1852[this.field1843] = -1;
                        } else {
                            this.field1852[this.field1843] = var13.field1852[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field1850 == null || var13.field1850[var14] == -1) {
                            this.field1850[this.field1843] = -1;
                        } else {
                            this.field1850[this.field1843] = (byte) (var13.field1850[var14] + this.field1854);
                        }
                    }
                    this.field1851[this.field1843] = var13.field1851[var14];
                    this.field1844[this.field1843] = this.method3349(var13, var13.field1844[var14]);
                    this.field1859[this.field1843] = this.method3349(var13, var13.field1859[var14]);
                    this.field1849[this.field1843] = this.method3349(var13, var13.field1849[var14]);
                    this.field1843++;
                }
                for (int var15 = 0; var15 < var13.field1854; var15++) {
                    byte var16 = this.field1855[this.field1854] = var13.field1855[var15];
                    if (var16 == 0) {
                        this.field1856[this.field1854] = (short) this.method3349(var13, var13.field1856[var15]);
                        this.field1857[this.field1854] = (short) this.method3349(var13, var13.field1857[var15]);
                        this.field1858[this.field1854] = (short) this.method3349(var13, var13.field1858[var15]);
                    }
                    this.field1854++;
                }
            }
        }
    }

    @ObfuscatedName("gm.ao(Lgm;I)I")
    public final int method3349(class176 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1873[arg1];
        int var5 = arg0.field1841[arg1];
        int var6 = arg0.field1879[arg1];
        for (int var7 = 0; var7 < this.field1839; var7++) {
            if (this.field1873[var7] == var4 && this.field1841[var7] == var5 && this.field1879[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1873[this.field1839] = var4;
            this.field1841[this.field1839] = var5;
            this.field1879[this.field1839] = var6;
            if (arg0.field1868 != null) {
                this.field1868[this.field1839] = arg0.field1868[arg1];
            }
            if (arg0.field1863 != null) {
                this.field1863[this.field1839] = arg0.field1863[arg1];
                this.field1864[this.field1839] = arg0.field1864[arg1];
            }
            var3 = this.field1839++;
        }
        return var3;
    }

    public class176(class176 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1839 = arg0.field1839;
        this.field1843 = arg0.field1843;
        this.field1854 = arg0.field1854;
        if (arg1) {
            this.field1873 = arg0.field1873;
            this.field1841 = arg0.field1841;
            this.field1879 = arg0.field1879;
        } else {
            this.field1873 = new int[this.field1839];
            this.field1841 = new int[this.field1839];
            this.field1879 = new int[this.field1839];
            for (int var6 = 0; var6 < this.field1839; var6++) {
                this.field1873[var6] = arg0.field1873[var6];
                this.field1841[var6] = arg0.field1841[var6];
                this.field1879[var6] = arg0.field1879[var6];
            }
        }
        if (arg2) {
            this.field1851 = arg0.field1851;
        } else {
            this.field1851 = new short[this.field1843];
            for (int var7 = 0; var7 < this.field1843; var7++) {
                this.field1851[var7] = arg0.field1851[var7];
            }
        }
        if (arg3 || arg0.field1852 == null) {
            this.field1852 = arg0.field1852;
        } else {
            this.field1852 = new short[this.field1843];
            for (int var8 = 0; var8 < this.field1843; var8++) {
                this.field1852[var8] = arg0.field1852[var8];
            }
        }
        if (arg4) {
            this.field1878 = arg0.field1878;
        } else {
            this.field1878 = new byte[this.field1843];
            if (arg0.field1878 == null) {
                for (int var9 = 0; var9 < this.field1843; var9++) {
                    this.field1878[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1843; var10++) {
                    this.field1878[var10] = arg0.field1878[var10];
                }
            }
        }
        this.field1844 = arg0.field1844;
        this.field1859 = arg0.field1859;
        this.field1849 = arg0.field1849;
        this.field1847 = arg0.field1847;
        this.field1848 = arg0.field1848;
        this.field1850 = arg0.field1850;
        this.field1853 = arg0.field1853;
        this.field1855 = arg0.field1855;
        this.field1856 = arg0.field1856;
        this.field1857 = arg0.field1857;
        this.field1858 = arg0.field1858;
        this.field1868 = arg0.field1868;
        this.field1876 = arg0.field1876;
        this.field1861 = arg0.field1861;
        this.field1862 = arg0.field1862;
        this.field1866 = arg0.field1866;
        this.field1846 = arg0.field1846;
        this.field1872 = arg0.field1872;
        this.field1863 = arg0.field1863;
        this.field1864 = arg0.field1864;
        this.field1860 = arg0.field1860;
        this.field1869 = arg0.field1869;
    }

    @ObfuscatedName("gm.am()Lgm;")
    public class176 method3351() {
        class176 var1 = new class176();
        if (this.field1847 != null) {
            var1.field1847 = new byte[this.field1843];
            for (int var2 = 0; var2 < this.field1843; var2++) {
                var1.field1847[var2] = this.field1847[var2];
            }
        }
        var1.field1839 = this.field1839;
        var1.field1843 = this.field1843;
        var1.field1854 = this.field1854;
        var1.field1873 = this.field1873;
        var1.field1841 = this.field1841;
        var1.field1879 = this.field1879;
        var1.field1844 = this.field1844;
        var1.field1859 = this.field1859;
        var1.field1849 = this.field1849;
        var1.field1848 = this.field1848;
        var1.field1878 = this.field1878;
        var1.field1850 = this.field1850;
        var1.field1851 = this.field1851;
        var1.field1852 = this.field1852;
        var1.field1853 = this.field1853;
        var1.field1855 = this.field1855;
        var1.field1856 = this.field1856;
        var1.field1857 = this.field1857;
        var1.field1858 = this.field1858;
        var1.field1868 = this.field1868;
        var1.field1876 = this.field1876;
        var1.field1861 = this.field1861;
        var1.field1862 = this.field1862;
        var1.field1866 = this.field1866;
        var1.field1846 = this.field1846;
        var1.field1860 = this.field1860;
        var1.field1869 = this.field1869;
        return var1;
    }

    @ObfuscatedName("gm.ac([[IIIIZI)Lgm;")
    public class176 method3380(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3364();
        int var7 = this.field1870 + arg1;
        int var8 = this.field1845 + arg1;
        int var9 = this.field1875 + arg3;
        int var10 = this.field1874 + arg3;
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
        class176 var15;
        if (arg4) {
            var15 = new class176();
            var15.field1839 = this.field1839;
            var15.field1843 = this.field1843;
            var15.field1854 = this.field1854;
            var15.field1873 = this.field1873;
            var15.field1879 = this.field1879;
            var15.field1844 = this.field1844;
            var15.field1859 = this.field1859;
            var15.field1849 = this.field1849;
            var15.field1847 = this.field1847;
            var15.field1848 = this.field1848;
            var15.field1878 = this.field1878;
            var15.field1850 = this.field1850;
            var15.field1851 = this.field1851;
            var15.field1852 = this.field1852;
            var15.field1853 = this.field1853;
            var15.field1855 = this.field1855;
            var15.field1856 = this.field1856;
            var15.field1857 = this.field1857;
            var15.field1858 = this.field1858;
            var15.field1868 = this.field1868;
            var15.field1876 = this.field1876;
            var15.field1861 = this.field1861;
            var15.field1862 = this.field1862;
            var15.field1860 = this.field1860;
            var15.field1869 = this.field1869;
            var15.field1841 = new int[var15.field1839];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1839; var16++) {
                int var17 = this.field1873[var16] + arg1;
                int var18 = this.field1879[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1841[var16] = this.field1841[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1839; var26++) {
                int var27 = (-this.field1841[var26] << 16) / this.field2086;
                if (var27 < arg5) {
                    int var28 = this.field1873[var26] + arg1;
                    int var29 = this.field1879[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1841[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1841[var26];
                }
            }
        }
        var15.method3363();
        return var15;
    }

    @ObfuscatedName("gm.as()V")
    public void method3353() {
        int var10002;
        if (this.field1868 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1839; var3++) {
                int var4 = this.field1868[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1861 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1861[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1839) {
                int var7 = this.field1868[var6];
                this.field1861[var7][var1[var7]++] = var6++;
            }
            this.field1868 = null;
        }
        if (this.field1876 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1843; var10++) {
            int var11 = this.field1876[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1862 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1862[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1843) {
            int var14 = this.field1876[var13];
            this.field1862[var14][var8[var14]++] = var13++;
        }
        this.field1876 = null;
    }

    @ObfuscatedName("gm.aw()V")
    public void method3354() {
        for (int var1 = 0; var1 < this.field1839; var1++) {
            int var2 = this.field1873[var1];
            this.field1873[var1] = this.field1879[var1];
            this.field1879[var1] = -var2;
        }
        this.method3363();
    }

    @ObfuscatedName("gm.af()V")
    public void method3355() {
        for (int var1 = 0; var1 < this.field1839; var1++) {
            this.field1873[var1] = -this.field1873[var1];
            this.field1879[var1] = -this.field1879[var1];
        }
        this.method3363();
    }

    @ObfuscatedName("gm.aa()V")
    public void method3368() {
        for (int var1 = 0; var1 < this.field1839; var1++) {
            int var2 = this.field1879[var1];
            this.field1879[var1] = this.field1873[var1];
            this.field1873[var1] = -var2;
        }
        this.method3363();
    }

    @ObfuscatedName("gm.ah(I)V")
    public void method3357(int arg0) {
        int var2 = field1836[arg0];
        int var3 = field1865[arg0];
        for (int var4 = 0; var4 < this.field1839; var4++) {
            int var5 = this.field1879[var4] * var2 + this.field1873[var4] * var3 >> 16;
            this.field1879[var4] = this.field1879[var4] * var3 - this.field1873[var4] * var2 >> 16;
            this.field1873[var4] = var5;
        }
        this.method3363();
    }

    @ObfuscatedName("gm.ag(III)V")
    public void method3405(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1839; var4++) {
            this.field1873[var4] += arg0;
            this.field1841[var4] += arg1;
            this.field1879[var4] += arg2;
        }
        this.method3363();
    }

    @ObfuscatedName("gm.av(SS)V")
    public void method3350(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1843; var3++) {
            if (this.field1851[var3] == arg0) {
                this.field1851[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gm.ar(SS)V")
    public void method3360(short arg0, short arg1) {
        if (this.field1852 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1843; var3++) {
            if (this.field1852[var3] == arg0) {
                this.field1852[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gm.ap()V")
    public void method3361() {
        for (int var1 = 0; var1 < this.field1839; var1++) {
            this.field1879[var1] = -this.field1879[var1];
        }
        for (int var2 = 0; var2 < this.field1843; var2++) {
            int var3 = this.field1844[var2];
            this.field1844[var2] = this.field1849[var2];
            this.field1849[var2] = var3;
        }
        this.method3363();
    }

    @ObfuscatedName("gm.ak(III)V")
    public void method3370(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1839; var4++) {
            this.field1873[var4] = this.field1873[var4] * arg0 / 128;
            this.field1841[var4] = this.field1841[var4] * arg1 / 128;
            this.field1879[var4] = this.field1879[var4] * arg2 / 128;
        }
        this.method3363();
    }

    @ObfuscatedName("gm.ai()V")
    public void method3365() {
        if (this.field1866 != null) {
            return;
        }
        this.field1866 = new class199[this.field1839];
        for (int var1 = 0; var1 < this.field1839; var1++) {
            this.field1866[var1] = new class199();
        }
        for (int var2 = 0; var2 < this.field1843; var2++) {
            int var3 = this.field1844[var2];
            int var4 = this.field1859[var2];
            int var5 = this.field1849[var2];
            int var6 = this.field1873[var4] - this.field1873[var3];
            int var7 = this.field1841[var4] - this.field1841[var3];
            int var8 = this.field1879[var4] - this.field1879[var3];
            int var9 = this.field1873[var5] - this.field1873[var3];
            int var10 = this.field1841[var5] - this.field1841[var3];
            int var11 = this.field1879[var5] - this.field1879[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field1847 == null) {
                var19 = 0;
            } else {
                var19 = this.field1847[var2];
            }
            if (var19 == 0) {
                class199 var20 = this.field1866[var3];
                var20.field2247 += var16;
                var20.field2250 += var17;
                var20.field2248 += var18;
                var20.field2246++;
                class199 var21 = this.field1866[var4];
                var21.field2247 += var16;
                var21.field2250 += var17;
                var21.field2248 += var18;
                var21.field2246++;
                class199 var22 = this.field1866[var5];
                var22.field2247 += var16;
                var22.field2250 += var17;
                var22.field2248 += var18;
                var22.field2246++;
            } else if (var19 == 1) {
                if (this.field1846 == null) {
                    this.field1846 = new class190[this.field1843];
                }
                class190 var23 = this.field1846[var2] = new class190();
                var23.field2088 = var16;
                var23.field2089 = var17;
                var23.field2090 = var18;
            }
        }
    }

    @ObfuscatedName("gm.at()V")
    public void method3363() {
        this.field1866 = null;
        this.field1872 = null;
        this.field1846 = null;
        this.field1867 = false;
    }

    @ObfuscatedName("gm.az()V")
    public void method3364() {
        if (this.field1867) {
            return;
        }
        this.field2086 = 0;
        this.field1871 = 0;
        this.field1870 = 999999;
        this.field1845 = -999999;
        this.field1874 = -99999;
        this.field1875 = 99999;
        for (int var1 = 0; var1 < this.field1839; var1++) {
            int var2 = this.field1873[var1];
            int var3 = this.field1841[var1];
            int var4 = this.field1879[var1];
            if (var2 < this.field1870) {
                this.field1870 = var2;
            }
            if (var2 > this.field1845) {
                this.field1845 = var2;
            }
            if (var4 < this.field1875) {
                this.field1875 = var4;
            }
            if (var4 > this.field1874) {
                this.field1874 = var4;
            }
            if (-var3 > this.field2086) {
                this.field2086 = -var3;
            }
            if (var3 > this.field1871) {
                this.field1871 = var3;
            }
        }
        this.field1867 = true;
    }

    @ObfuscatedName("gm.bg(Lgm;Lgm;IIIZ)V")
    public static void method3359(class176 arg0, class176 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method3364();
        arg0.method3365();
        arg1.method3364();
        arg1.method3365();
        field1877++;
        int var6 = 0;
        int[] var7 = arg1.field1873;
        int var8 = arg1.field1839;
        for (int var9 = 0; var9 < arg0.field1839; var9++) {
            class199 var10 = arg0.field1866[var9];
            if (var10.field2246 != 0) {
                int var11 = arg0.field1841[var9] - arg3;
                if (var11 <= arg1.field1871) {
                    int var12 = arg0.field1873[var9] - arg2;
                    if (var12 >= arg1.field1870 && var12 <= arg1.field1845) {
                        int var13 = arg0.field1879[var9] - arg4;
                        if (var13 >= arg1.field1875 && var13 <= arg1.field1874) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class199 var15 = arg1.field1866[var14];
                                if (var7[var14] == var12 && arg1.field1879[var14] == var13 && arg1.field1841[var14] == var11 && var15.field2246 != 0) {
                                    if (arg0.field1872 == null) {
                                        arg0.field1872 = new class199[arg0.field1839];
                                    }
                                    if (arg1.field1872 == null) {
                                        arg1.field1872 = new class199[var8];
                                    }
                                    class199 var16 = arg0.field1872[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1872[var9] = new class199(var10);
                                    }
                                    class199 var17 = arg1.field1872[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1872[var14] = new class199(var15);
                                    }
                                    var16.field2247 += var15.field2247;
                                    var16.field2250 += var15.field2250;
                                    var16.field2248 += var15.field2248;
                                    var16.field2246 += var15.field2246;
                                    var17.field2247 += var10.field2247;
                                    var17.field2250 += var10.field2250;
                                    var17.field2248 += var10.field2248;
                                    var17.field2246 += var10.field2246;
                                    var6++;
                                    field1840[var9] = field1877;
                                    field1880[var14] = field1877;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 < 3 || !arg5) {
            return;
        }
        for (int var18 = 0; var18 < arg0.field1843; var18++) {
            if (field1840[arg0.field1844[var18]] == field1877 && field1840[arg0.field1859[var18]] == field1877 && field1840[arg0.field1849[var18]] == field1877) {
                if (arg0.field1847 == null) {
                    arg0.field1847 = new byte[arg0.field1843];
                }
                arg0.field1847[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1843; var19++) {
            if (field1880[arg1.field1844[var19]] == field1877 && field1880[arg1.field1859[var19]] == field1877 && field1880[arg1.field1849[var19]] == field1877) {
                if (arg1.field1847 == null) {
                    arg1.field1847 = new byte[arg1.field1843];
                }
                arg1.field1847[var19] = 2;
            }
        }
    }

    @ObfuscatedName("gm.bz(IIIII)Lhr;")
    public final class197 method3424(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3365();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class197 var8 = new class197();
        var8.field2167 = new int[this.field1843];
        var8.field2214 = new int[this.field1843];
        var8.field2220 = new int[this.field1843];
        if (this.field1854 > 0 && this.field1850 != null) {
            int[] var9 = new int[this.field1854];
            for (int var10 = 0; var10 < this.field1843; var10++) {
                if (this.field1850[var10] != -1) {
                    var9[this.field1850[var10] & 0xFF]++;
                }
            }
            var8.field2217 = 0;
            for (int var11 = 0; var11 < this.field1854; var11++) {
                if (var9[var11] > 0 && this.field1855[var11] == 0) {
                    var8.field2217++;
                }
            }
            var8.field2176 = new int[var8.field2217];
            var8.field2177 = new int[var8.field2217];
            var8.field2178 = new int[var8.field2217];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1854; var13++) {
                if (var9[var13] > 0 && this.field1855[var13] == 0) {
                    var8.field2176[var12] = this.field1856[var13] & 0xFFFF;
                    var8.field2177[var12] = this.field1857[var13] & 0xFFFF;
                    var8.field2178[var12] = this.field1858[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2172 = new byte[this.field1843];
            for (int var14 = 0; var14 < this.field1843; var14++) {
                if (this.field1850[var14] == -1) {
                    var8.field2172[var14] = -1;
                } else {
                    var8.field2172[var14] = (byte) var9[this.field1850[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1843; var15++) {
            byte var16;
            if (this.field1847 == null) {
                var16 = 0;
            } else {
                var16 = this.field1847[var15];
            }
            byte var17;
            if (this.field1878 == null) {
                var17 = 0;
            } else {
                var17 = this.field1878[var15];
            }
            short var18;
            if (this.field1852 == null) {
                var18 = -1;
            } else {
                var18 = this.field1852[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1851[var15] & 0xFFFF;
                    class199 var20;
                    if (this.field1872 == null || this.field1872[this.field1844[var15]] == null) {
                        var20 = this.field1866[this.field1844[var15]];
                    } else {
                        var20 = this.field1872[this.field1844[var15]];
                    }
                    int var21 = (var20.field2248 * arg4 + var20.field2250 * arg3 + var20.field2247 * arg2) / (var20.field2246 * var7) + arg0;
                    var8.field2167[var15] = method3367(var19, var21);
                    class199 var22;
                    if (this.field1872 == null || this.field1872[this.field1859[var15]] == null) {
                        var22 = this.field1866[this.field1859[var15]];
                    } else {
                        var22 = this.field1872[this.field1859[var15]];
                    }
                    int var23 = (var22.field2248 * arg4 + var22.field2250 * arg3 + var22.field2247 * arg2) / (var22.field2246 * var7) + arg0;
                    var8.field2214[var15] = method3367(var19, var23);
                    class199 var24;
                    if (this.field1872 == null || this.field1872[this.field1849[var15]] == null) {
                        var24 = this.field1866[this.field1849[var15]];
                    } else {
                        var24 = this.field1872[this.field1849[var15]];
                    }
                    int var25 = (var24.field2248 * arg4 + var24.field2250 * arg3 + var24.field2247 * arg2) / (var24.field2246 * var7) + arg0;
                    var8.field2220[var15] = method3367(var19, var25);
                } else if (var16 == 1) {
                    class190 var26 = this.field1846[var15];
                    int var27 = (var26.field2090 * arg4 + var26.field2089 * arg3 + var26.field2088 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field2167[var15] = method3367(this.field1851[var15] & 0xFFFF, var27);
                    var8.field2220[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2167[var15] = 128;
                    var8.field2220[var15] = -1;
                } else {
                    var8.field2220[var15] = -2;
                }
            } else if (var16 == 0) {
                class199 var28;
                if (this.field1872 == null || this.field1872[this.field1844[var15]] == null) {
                    var28 = this.field1866[this.field1844[var15]];
                } else {
                    var28 = this.field1872[this.field1844[var15]];
                }
                int var29 = (var28.field2248 * arg4 + var28.field2250 * arg3 + var28.field2247 * arg2) / (var28.field2246 * var7) + arg0;
                var8.field2167[var15] = method3404(var29);
                class199 var30;
                if (this.field1872 == null || this.field1872[this.field1859[var15]] == null) {
                    var30 = this.field1866[this.field1859[var15]];
                } else {
                    var30 = this.field1872[this.field1859[var15]];
                }
                int var31 = (var30.field2248 * arg4 + var30.field2250 * arg3 + var30.field2247 * arg2) / (var30.field2246 * var7) + arg0;
                var8.field2214[var15] = method3404(var31);
                class199 var32;
                if (this.field1872 == null || this.field1872[this.field1849[var15]] == null) {
                    var32 = this.field1866[this.field1849[var15]];
                } else {
                    var32 = this.field1872[this.field1849[var15]];
                }
                int var33 = (var32.field2248 * arg4 + var32.field2250 * arg3 + var32.field2247 * arg2) / (var32.field2246 * var7) + arg0;
                var8.field2220[var15] = method3404(var33);
            } else if (var16 == 1) {
                class190 var34 = this.field1846[var15];
                int var35 = (var34.field2090 * arg4 + var34.field2089 * arg3 + var34.field2088 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field2167[var15] = method3404(var35);
                var8.field2220[var15] = -1;
            } else {
                var8.field2220[var15] = -2;
            }
        }
        this.method3353();
        var8.field2179 = this.field1839;
        var8.field2158 = this.field1873;
        var8.field2161 = this.field1841;
        var8.field2162 = this.field1879;
        var8.field2163 = this.field1843;
        var8.field2229 = this.field1844;
        var8.field2165 = this.field1859;
        var8.field2166 = this.field1849;
        var8.field2223 = this.field1848;
        var8.field2171 = this.field1878;
        var8.field2174 = this.field1853;
        var8.field2204 = this.field1861;
        var8.field2180 = this.field1862;
        var8.field2173 = this.field1852;
        var8.field2160 = this.field1863;
        var8.field2183 = this.field1864;
        return var8;
    }

    @ObfuscatedName("gm.bj(II)I")
    public static final int method3367(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("gm.bc(I)I")
    public static final int method3404(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
