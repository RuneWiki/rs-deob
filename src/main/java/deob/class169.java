package deob;

@ObfuscatedName("fs")
public class class169 extends class177 {

    @ObfuscatedName("fs.f")
    public int field1796 = 0;

    @ObfuscatedName("fs.o")
    public int[] field1811;

    @ObfuscatedName("fs.u")
    public int[] field1798;

    @ObfuscatedName("fs.p")
    public int[] field1809;

    @ObfuscatedName("fs.b")
    public int field1800 = 0;

    @ObfuscatedName("fs.e")
    public int[] field1801;

    @ObfuscatedName("fs.k")
    public int[] field1805;

    @ObfuscatedName("fs.g")
    public int[] field1803;

    @ObfuscatedName("fs.h")
    public byte[] field1831;

    @ObfuscatedName("fs.n")
    public byte[] field1812;

    @ObfuscatedName("fs.l")
    public byte[] field1828;

    @ObfuscatedName("fs.m")
    public byte[] field1802;

    @ObfuscatedName("fs.d")
    public short[] field1808;

    @ObfuscatedName("fs.c")
    public short[] field1818;

    @ObfuscatedName("fs.j")
    public byte field1810 = 0;

    @ObfuscatedName("fs.r")
    public int field1799;

    @ObfuscatedName("fs.q")
    public byte[] field1797;

    @ObfuscatedName("fs.t")
    public short[] field1813;

    @ObfuscatedName("fs.v")
    public short[] field1814;

    @ObfuscatedName("fs.x")
    public short[] field1815;

    @ObfuscatedName("fs.z")
    public int[] field1816;

    @ObfuscatedName("fs.i")
    public int[] field1817;

    @ObfuscatedName("fs.a")
    public int[][] field1826;

    @ObfuscatedName("fs.w")
    public int[][] field1819;

    @ObfuscatedName("fs.s")
    public class178[] field1804;

    @ObfuscatedName("fs.y")
    public class185[] field1821;

    @ObfuscatedName("fs.ac")
    public class185[] field1822;

    @ObfuscatedName("fs.ay")
    public short field1807;

    @ObfuscatedName("fs.am")
    public short field1824;

    @ObfuscatedName("fs.ag")
    public boolean field1825 = false;

    @ObfuscatedName("fs.aq")
    public int field1820;

    @ObfuscatedName("fs.at")
    public int field1827;

    @ObfuscatedName("fs.aj")
    public int field1806;

    @ObfuscatedName("fs.aw")
    public int field1829;

    @ObfuscatedName("fs.ap")
    public int field1830;

    @ObfuscatedName("fs.ax")
    public static int[] field1823 = new int[10000];

    @ObfuscatedName("fs.as")
    public static int[] field1832 = new int[10000];

    @ObfuscatedName("fs.ad")
    public static int field1833 = 0;

    @ObfuscatedName("fs.af")
    public static int[] field1834 = class174.field1924;

    @ObfuscatedName("fs.ao")
    public static int[] field1835 = class174.field1909;

    public class169() {
    }

    @ObfuscatedName("fs.f(Lir;II)Lfs;")
    public static class169 method2839(class253 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3933(arg1, arg2);
        return var3 == null ? null : new class169(var3);
    }

    public class169(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2840(arg0);
        } else {
            this.method2868(arg0);
        }
    }

    @ObfuscatedName("fs.u([B)V")
    public void method2840(byte[] arg0) {
        class382 var2 = new class382(arg0);
        class382 var3 = new class382(arg0);
        class382 var4 = new class382(arg0);
        class382 var5 = new class382(arg0);
        class382 var6 = new class382(arg0);
        class382 var7 = new class382(arg0);
        class382 var8 = new class382(arg0);
        var2.field4155 = arg0.length - 23;
        int var9 = var2.method5858();
        int var10 = var2.method5858();
        int var11 = var2.method5856();
        int var12 = var2.method5856();
        int var13 = var2.method5856();
        int var14 = var2.method5856();
        int var15 = var2.method5856();
        int var16 = var2.method5856();
        int var17 = var2.method5856();
        int var18 = var2.method5858();
        int var19 = var2.method5858();
        int var20 = var2.method5858();
        int var21 = var2.method5858();
        int var22 = var2.method5858();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1797 = new byte[var11];
            var2.field4155 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1797[var26] = var2.method6045();
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
        this.field1796 = var9;
        this.field1800 = var10;
        this.field1799 = var11;
        this.field1811 = new int[var9];
        this.field1798 = new int[var9];
        this.field1809 = new int[var9];
        this.field1801 = new int[var10];
        this.field1805 = new int[var10];
        this.field1803 = new int[var10];
        if (var17 == 1) {
            this.field1816 = new int[var9];
        }
        if (var12 == 1) {
            this.field1831 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1812 = new byte[var10];
        } else {
            this.field1810 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1828 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1817 = new int[var10];
        }
        if (var16 == 1) {
            this.field1818 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1802 = new byte[var10];
        }
        this.field1808 = new short[var10];
        if (var11 > 0) {
            this.field1813 = new short[var11];
            this.field1814 = new short[var11];
            this.field1815 = new short[var11];
        }
        var2.field4155 = var11;
        var3.field4155 = var44;
        var4.field4155 = var46;
        var5.field4155 = var48;
        var6.field4155 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method5856();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method6063();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method6063();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method6063();
            }
            this.field1811[var67] = var64 + var69;
            this.field1798[var67] = var65 + var70;
            this.field1809[var67] = var66 + var71;
            var64 = this.field1811[var67];
            var65 = this.field1798[var67];
            var66 = this.field1809[var67];
            if (var17 == 1) {
                this.field1816[var67] = var6.method5856();
            }
        }
        var2.field4155 = var42;
        var3.field4155 = var31;
        var4.field4155 = var34;
        var5.field4155 = var37;
        var6.field4155 = var35;
        var7.field4155 = var40;
        var8.field4155 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1808[var72] = (short) var2.method5858();
            if (var12 == 1) {
                this.field1831[var72] = var3.method6045();
            }
            if (var13 == 255) {
                this.field1812[var72] = var4.method6045();
            }
            if (var14 == 1) {
                this.field1828[var72] = var5.method6045();
            }
            if (var15 == 1) {
                this.field1817[var72] = var6.method5856();
            }
            if (var16 == 1) {
                this.field1818[var72] = (short) (var7.method5858() - 1);
            }
            if (this.field1802 != null && this.field1818[var72] != -1) {
                this.field1802[var72] = (byte) (var8.method5856() - 1);
            }
        }
        var2.field4155 = var33;
        var3.field4155 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method5856();
            if (var78 == 1) {
                var73 = var2.method6063() + var76;
                var74 = var2.method6063() + var73;
                var75 = var2.method6063() + var74;
                var76 = var75;
                this.field1801[var77] = var73;
                this.field1805[var77] = var74;
                this.field1803[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method6063() + var76;
                var76 = var75;
                this.field1801[var77] = var73;
                this.field1805[var77] = var74;
                this.field1803[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method6063() + var76;
                var76 = var75;
                this.field1801[var77] = var73;
                this.field1805[var77] = var74;
                this.field1803[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method6063() + var76;
                var76 = var75;
                this.field1801[var77] = var73;
                this.field1805[var77] = var81;
                this.field1803[var77] = var75;
            }
        }
        var2.field4155 = var50;
        var3.field4155 = var52;
        var4.field4155 = var54;
        var5.field4155 = var56;
        var6.field4155 = var58;
        var7.field4155 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1797[var82] & 0xFF;
            if (var83 == 0) {
                this.field1813[var82] = (short) var2.method5858();
                this.field1814[var82] = (short) var2.method5858();
                this.field1815[var82] = (short) var2.method5858();
            }
        }
        var2.field4155 = var62;
        int var84 = var2.method5856();
        if (var84 == 0) {
            return;
        }
        new class187();
        var2.method5858();
        var2.method5858();
        var2.method5858();
        var2.method5861();
    }

    @ObfuscatedName("fs.p([B)V")
    public void method2868(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class382 var4 = new class382(arg0);
        class382 var5 = new class382(arg0);
        class382 var6 = new class382(arg0);
        class382 var7 = new class382(arg0);
        class382 var8 = new class382(arg0);
        var4.field4155 = arg0.length - 18;
        int var9 = var4.method5858();
        int var10 = var4.method5858();
        int var11 = var4.method5856();
        int var12 = var4.method5856();
        int var13 = var4.method5856();
        int var14 = var4.method5856();
        int var15 = var4.method5856();
        int var16 = var4.method5856();
        int var17 = var4.method5858();
        int var18 = var4.method5858();
        int var19 = var4.method5858();
        int var20 = var4.method5858();
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
        this.field1796 = var9;
        this.field1800 = var10;
        this.field1799 = var11;
        this.field1811 = new int[var9];
        this.field1798 = new int[var9];
        this.field1809 = new int[var9];
        this.field1801 = new int[var10];
        this.field1805 = new int[var10];
        this.field1803 = new int[var10];
        if (var11 > 0) {
            this.field1797 = new byte[var11];
            this.field1813 = new short[var11];
            this.field1814 = new short[var11];
            this.field1815 = new short[var11];
        }
        if (var16 == 1) {
            this.field1816 = new int[var9];
        }
        if (var12 == 1) {
            this.field1831 = new byte[var10];
            this.field1802 = new byte[var10];
            this.field1818 = new short[var10];
        }
        if (var13 == 255) {
            this.field1812 = new byte[var10];
        } else {
            this.field1810 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1828 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1817 = new int[var10];
        }
        this.field1808 = new short[var10];
        var4.field4155 = var21;
        var5.field4155 = var36;
        var6.field4155 = var38;
        var7.field4155 = var40;
        var8.field4155 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method5856();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method6063();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method6063();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method6063();
            }
            this.field1811[var46] = var43 + var48;
            this.field1798[var46] = var44 + var49;
            this.field1809[var46] = var45 + var50;
            var43 = this.field1811[var46];
            var44 = this.field1798[var46];
            var45 = this.field1809[var46];
            if (var16 == 1) {
                this.field1816[var46] = var8.method5856();
            }
        }
        var4.field4155 = var32;
        var5.field4155 = var28;
        var6.field4155 = var26;
        var7.field4155 = var30;
        var8.field4155 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1808[var51] = (short) var4.method5858();
            if (var12 == 1) {
                int var52 = var5.method5856();
                if ((var52 & 0x1) == 1) {
                    this.field1831[var51] = 1;
                    var2 = true;
                } else {
                    this.field1831[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1802[var51] = (byte) (var52 >> 2);
                    this.field1818[var51] = this.field1808[var51];
                    this.field1808[var51] = 127;
                    if (this.field1818[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1802[var51] = -1;
                    this.field1818[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1812[var51] = var6.method6045();
            }
            if (var14 == 1) {
                this.field1828[var51] = var7.method6045();
            }
            if (var15 == 1) {
                this.field1817[var51] = var8.method5856();
            }
        }
        var4.field4155 = var25;
        var5.field4155 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method5856();
            if (var58 == 1) {
                var53 = var4.method6063() + var56;
                var54 = var4.method6063() + var53;
                var55 = var4.method6063() + var54;
                var56 = var55;
                this.field1801[var57] = var53;
                this.field1805[var57] = var54;
                this.field1803[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method6063() + var56;
                var56 = var55;
                this.field1801[var57] = var53;
                this.field1805[var57] = var54;
                this.field1803[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method6063() + var56;
                var56 = var55;
                this.field1801[var57] = var53;
                this.field1805[var57] = var54;
                this.field1803[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method6063() + var56;
                var56 = var55;
                this.field1801[var57] = var53;
                this.field1805[var57] = var61;
                this.field1803[var57] = var55;
            }
        }
        var4.field4155 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1797[var62] = 0;
            this.field1813[var62] = (short) var4.method5858();
            this.field1814[var62] = (short) var4.method5858();
            this.field1815[var62] = (short) var4.method5858();
        }
        if (this.field1802 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1802[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1813[var65] & 0xFFFF) == this.field1801[var64] && (this.field1814[var65] & 0xFFFF) == this.field1805[var64] && (this.field1815[var65] & 0xFFFF) == this.field1803[var64]) {
                        this.field1802[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1802 = null;
            }
        }
        if (!var3) {
            this.field1818 = null;
        }
        if (!var2) {
            this.field1831 = null;
        }
    }

    public class169(class169[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1796 = 0;
        this.field1800 = 0;
        this.field1799 = 0;
        this.field1810 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class169 var10 = arg0[var9];
            if (var10 != null) {
                this.field1796 += var10.field1796;
                this.field1800 += var10.field1800;
                this.field1799 += var10.field1799;
                if (var10.field1812 == null) {
                    if (this.field1810 == -1) {
                        this.field1810 = var10.field1810;
                    }
                    if (this.field1810 != var10.field1810) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1831 != null;
                var5 |= var10.field1828 != null;
                var6 |= var10.field1817 != null;
                var7 |= var10.field1818 != null;
                var8 |= var10.field1802 != null;
            }
        }
        this.field1811 = new int[this.field1796];
        this.field1798 = new int[this.field1796];
        this.field1809 = new int[this.field1796];
        this.field1816 = new int[this.field1796];
        this.field1801 = new int[this.field1800];
        this.field1805 = new int[this.field1800];
        this.field1803 = new int[this.field1800];
        if (var3) {
            this.field1831 = new byte[this.field1800];
        }
        if (var4) {
            this.field1812 = new byte[this.field1800];
        }
        if (var5) {
            this.field1828 = new byte[this.field1800];
        }
        if (var6) {
            this.field1817 = new int[this.field1800];
        }
        if (var7) {
            this.field1818 = new short[this.field1800];
        }
        if (var8) {
            this.field1802 = new byte[this.field1800];
        }
        this.field1808 = new short[this.field1800];
        if (this.field1799 > 0) {
            this.field1797 = new byte[this.field1799];
            this.field1813 = new short[this.field1799];
            this.field1814 = new short[this.field1799];
            this.field1815 = new short[this.field1799];
        }
        this.field1796 = 0;
        this.field1800 = 0;
        this.field1799 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class169 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1800; var13++) {
                    if (var3 && var12.field1831 != null) {
                        this.field1831[this.field1800] = var12.field1831[var13];
                    }
                    if (var4) {
                        if (var12.field1812 == null) {
                            this.field1812[this.field1800] = var12.field1810;
                        } else {
                            this.field1812[this.field1800] = var12.field1812[var13];
                        }
                    }
                    if (var5 && var12.field1828 != null) {
                        this.field1828[this.field1800] = var12.field1828[var13];
                    }
                    if (var6 && var12.field1817 != null) {
                        this.field1817[this.field1800] = var12.field1817[var13];
                    }
                    if (var7) {
                        if (var12.field1818 == null) {
                            this.field1818[this.field1800] = -1;
                        } else {
                            this.field1818[this.field1800] = var12.field1818[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1802 == null || var12.field1802[var13] == -1) {
                            this.field1802[this.field1800] = -1;
                        } else {
                            this.field1802[this.field1800] = (byte) (var12.field1802[var13] + this.field1799);
                        }
                    }
                    this.field1808[this.field1800] = var12.field1808[var13];
                    this.field1801[this.field1800] = this.method2880(var12, var12.field1801[var13]);
                    this.field1805[this.field1800] = this.method2880(var12, var12.field1805[var13]);
                    this.field1803[this.field1800] = this.method2880(var12, var12.field1803[var13]);
                    this.field1800++;
                }
                for (int var14 = 0; var14 < var12.field1799; var14++) {
                    byte var15 = this.field1797[this.field1799] = var12.field1797[var14];
                    if (var15 == 0) {
                        this.field1813[this.field1799] = (short) this.method2880(var12, var12.field1813[var14]);
                        this.field1814[this.field1799] = (short) this.method2880(var12, var12.field1814[var14]);
                        this.field1815[this.field1799] = (short) this.method2880(var12, var12.field1815[var14]);
                    }
                    this.field1799++;
                }
            }
        }
    }

    @ObfuscatedName("fs.k(Lfs;I)I")
    public final int method2880(class169 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1811[arg1];
        int var5 = arg0.field1798[arg1];
        int var6 = arg0.field1809[arg1];
        for (int var7 = 0; var7 < this.field1796; var7++) {
            if (this.field1811[var7] == var4 && this.field1798[var7] == var5 && this.field1809[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1811[this.field1796] = var4;
            this.field1798[this.field1796] = var5;
            this.field1809[this.field1796] = var6;
            if (arg0.field1816 != null) {
                this.field1816[this.field1796] = arg0.field1816[arg1];
            }
            var3 = this.field1796++;
        }
        return var3;
    }

    public class169(class169 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1796 = arg0.field1796;
        this.field1800 = arg0.field1800;
        this.field1799 = arg0.field1799;
        if (arg1) {
            this.field1811 = arg0.field1811;
            this.field1798 = arg0.field1798;
            this.field1809 = arg0.field1809;
        } else {
            this.field1811 = new int[this.field1796];
            this.field1798 = new int[this.field1796];
            this.field1809 = new int[this.field1796];
            for (int var6 = 0; var6 < this.field1796; var6++) {
                this.field1811[var6] = arg0.field1811[var6];
                this.field1798[var6] = arg0.field1798[var6];
                this.field1809[var6] = arg0.field1809[var6];
            }
        }
        if (arg2) {
            this.field1808 = arg0.field1808;
        } else {
            this.field1808 = new short[this.field1800];
            for (int var7 = 0; var7 < this.field1800; var7++) {
                this.field1808[var7] = arg0.field1808[var7];
            }
        }
        if (arg3 || arg0.field1818 == null) {
            this.field1818 = arg0.field1818;
        } else {
            this.field1818 = new short[this.field1800];
            for (int var8 = 0; var8 < this.field1800; var8++) {
                this.field1818[var8] = arg0.field1818[var8];
            }
        }
        if (arg4) {
            this.field1828 = arg0.field1828;
        } else {
            this.field1828 = new byte[this.field1800];
            if (arg0.field1828 == null) {
                for (int var9 = 0; var9 < this.field1800; var9++) {
                    this.field1828[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1800; var10++) {
                    this.field1828[var10] = arg0.field1828[var10];
                }
            }
        }
        this.field1801 = arg0.field1801;
        this.field1805 = arg0.field1805;
        this.field1803 = arg0.field1803;
        this.field1831 = arg0.field1831;
        this.field1812 = arg0.field1812;
        this.field1802 = arg0.field1802;
        this.field1810 = arg0.field1810;
        this.field1797 = arg0.field1797;
        this.field1813 = arg0.field1813;
        this.field1814 = arg0.field1814;
        this.field1815 = arg0.field1815;
        this.field1816 = arg0.field1816;
        this.field1817 = arg0.field1817;
        this.field1826 = arg0.field1826;
        this.field1819 = arg0.field1819;
        this.field1821 = arg0.field1821;
        this.field1804 = arg0.field1804;
        this.field1822 = arg0.field1822;
        this.field1807 = arg0.field1807;
        this.field1824 = arg0.field1824;
    }

    @ObfuscatedName("fs.g()Lfs;")
    public class169 method2890() {
        class169 var1 = new class169();
        if (this.field1831 != null) {
            var1.field1831 = new byte[this.field1800];
            for (int var2 = 0; var2 < this.field1800; var2++) {
                var1.field1831[var2] = this.field1831[var2];
            }
        }
        var1.field1796 = this.field1796;
        var1.field1800 = this.field1800;
        var1.field1799 = this.field1799;
        var1.field1811 = this.field1811;
        var1.field1798 = this.field1798;
        var1.field1809 = this.field1809;
        var1.field1801 = this.field1801;
        var1.field1805 = this.field1805;
        var1.field1803 = this.field1803;
        var1.field1812 = this.field1812;
        var1.field1828 = this.field1828;
        var1.field1802 = this.field1802;
        var1.field1808 = this.field1808;
        var1.field1818 = this.field1818;
        var1.field1810 = this.field1810;
        var1.field1797 = this.field1797;
        var1.field1813 = this.field1813;
        var1.field1814 = this.field1814;
        var1.field1815 = this.field1815;
        var1.field1816 = this.field1816;
        var1.field1817 = this.field1817;
        var1.field1826 = this.field1826;
        var1.field1819 = this.field1819;
        var1.field1821 = this.field1821;
        var1.field1804 = this.field1804;
        var1.field1807 = this.field1807;
        var1.field1824 = this.field1824;
        return var1;
    }

    @ObfuscatedName("fs.h([[IIIIZI)Lfs;")
    public class169 method2878(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2858();
        int var7 = this.field1827 + arg1;
        int var8 = this.field1806 + arg1;
        int var9 = this.field1830 + arg3;
        int var10 = this.field1829 + arg3;
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
        class169 var15;
        if (arg4) {
            var15 = new class169();
            var15.field1796 = this.field1796;
            var15.field1800 = this.field1800;
            var15.field1799 = this.field1799;
            var15.field1811 = this.field1811;
            var15.field1809 = this.field1809;
            var15.field1801 = this.field1801;
            var15.field1805 = this.field1805;
            var15.field1803 = this.field1803;
            var15.field1831 = this.field1831;
            var15.field1812 = this.field1812;
            var15.field1828 = this.field1828;
            var15.field1802 = this.field1802;
            var15.field1808 = this.field1808;
            var15.field1818 = this.field1818;
            var15.field1810 = this.field1810;
            var15.field1797 = this.field1797;
            var15.field1813 = this.field1813;
            var15.field1814 = this.field1814;
            var15.field1815 = this.field1815;
            var15.field1816 = this.field1816;
            var15.field1817 = this.field1817;
            var15.field1826 = this.field1826;
            var15.field1819 = this.field1819;
            var15.field1807 = this.field1807;
            var15.field1824 = this.field1824;
            var15.field1798 = new int[var15.field1796];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1796; var16++) {
                int var17 = this.field1811[var16] + arg1;
                int var18 = this.field1809[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1798[var16] = this.field1798[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1796; var26++) {
                int var27 = (-this.field1798[var26] << 16) / this.field1999;
                if (var27 < arg5) {
                    int var28 = this.field1811[var26] + arg1;
                    int var29 = this.field1809[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1798[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1798[var26];
                }
            }
        }
        var15.method2853();
        return var15;
    }

    @ObfuscatedName("fs.n()V")
    public void method2846() {
        int var10002;
        if (this.field1816 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1796; var3++) {
                int var4 = this.field1816[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1826 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1826[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1796) {
                int var7 = this.field1816[var6];
                this.field1826[var7][var1[var7]++] = var6++;
            }
            this.field1816 = null;
        }
        if (this.field1817 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1800; var10++) {
            int var11 = this.field1817[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1819 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1819[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1800) {
            int var14 = this.field1817[var13];
            this.field1819[var14][var8[var14]++] = var13++;
        }
        this.field1817 = null;
    }

    @ObfuscatedName("fs.l()V")
    public void method2867() {
        for (int var1 = 0; var1 < this.field1796; var1++) {
            int var2 = this.field1811[var1];
            this.field1811[var1] = this.field1809[var1];
            this.field1809[var1] = -var2;
        }
        this.method2853();
    }

    @ObfuscatedName("fs.m()V")
    public void method2848() {
        for (int var1 = 0; var1 < this.field1796; var1++) {
            this.field1811[var1] = -this.field1811[var1];
            this.field1809[var1] = -this.field1809[var1];
        }
        this.method2853();
    }

    @ObfuscatedName("fs.d()V")
    public void method2849() {
        for (int var1 = 0; var1 < this.field1796; var1++) {
            int var2 = this.field1809[var1];
            this.field1809[var1] = this.field1811[var1];
            this.field1811[var1] = -var2;
        }
        this.method2853();
    }

    @ObfuscatedName("fs.c(I)V")
    public void method2850(int arg0) {
        int var2 = field1834[arg0];
        int var3 = field1835[arg0];
        for (int var4 = 0; var4 < this.field1796; var4++) {
            int var5 = this.field1811[var4] * var3 + this.field1809[var4] * var2 >> 16;
            this.field1809[var4] = this.field1809[var4] * var3 - this.field1811[var4] * var2 >> 16;
            this.field1811[var4] = var5;
        }
        this.method2853();
    }

    @ObfuscatedName("fs.j(III)V")
    public void method2851(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1796; var4++) {
            this.field1811[var4] += arg0;
            this.field1798[var4] += arg1;
            this.field1809[var4] += arg2;
        }
        this.method2853();
    }

    @ObfuscatedName("fs.r(SS)V")
    public void method2852(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1800; var3++) {
            if (this.field1808[var3] == arg0) {
                this.field1808[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("fs.q(SS)V")
    public void method2842(short arg0, short arg1) {
        if (this.field1818 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1800; var3++) {
            if (this.field1818[var3] == arg0) {
                this.field1818[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("fs.t()V")
    public void method2854() {
        for (int var1 = 0; var1 < this.field1796; var1++) {
            this.field1809[var1] = -this.field1809[var1];
        }
        for (int var2 = 0; var2 < this.field1800; var2++) {
            int var3 = this.field1801[var2];
            this.field1801[var2] = this.field1803[var2];
            this.field1803[var2] = var3;
        }
        this.method2853();
    }

    @ObfuscatedName("fs.v(III)V")
    public void method2855(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1796; var4++) {
            this.field1811[var4] = this.field1811[var4] * arg0 / 128;
            this.field1798[var4] = this.field1798[var4] * arg1 / 128;
            this.field1809[var4] = this.field1809[var4] * arg2 / 128;
        }
        this.method2853();
    }

    @ObfuscatedName("fs.x()V")
    public void method2898() {
        if (this.field1821 != null) {
            return;
        }
        this.field1821 = new class185[this.field1796];
        for (int var1 = 0; var1 < this.field1796; var1++) {
            this.field1821[var1] = new class185();
        }
        for (int var2 = 0; var2 < this.field1800; var2++) {
            int var3 = this.field1801[var2];
            int var4 = this.field1805[var2];
            int var5 = this.field1803[var2];
            int var6 = this.field1811[var4] - this.field1811[var3];
            int var7 = this.field1798[var4] - this.field1798[var3];
            int var8 = this.field1809[var4] - this.field1809[var3];
            int var9 = this.field1811[var5] - this.field1811[var3];
            int var10 = this.field1798[var5] - this.field1798[var3];
            int var11 = this.field1809[var5] - this.field1809[var3];
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
            if (this.field1831 == null) {
                var19 = 0;
            } else {
                var19 = this.field1831[var2];
            }
            if (var19 == 0) {
                class185 var20 = this.field1821[var3];
                var20.field2146 += var16;
                var20.field2145 += var17;
                var20.field2144 += var18;
                var20.field2147++;
                class185 var21 = this.field1821[var4];
                var21.field2146 += var16;
                var21.field2145 += var17;
                var21.field2144 += var18;
                var21.field2147++;
                class185 var22 = this.field1821[var5];
                var22.field2146 += var16;
                var22.field2145 += var17;
                var22.field2144 += var18;
                var22.field2147++;
            } else if (var19 == 1) {
                if (this.field1804 == null) {
                    this.field1804 = new class178[this.field1800];
                }
                class178 var23 = this.field1804[var2] = new class178();
                var23.field2006 = var16;
                var23.field2001 = var17;
                var23.field2002 = var18;
            }
        }
    }

    @ObfuscatedName("fs.z()V")
    public void method2853() {
        this.field1821 = null;
        this.field1822 = null;
        this.field1804 = null;
        this.field1825 = false;
    }

    @ObfuscatedName("fs.i()V")
    public void method2858() {
        if (this.field1825) {
            return;
        }
        this.field1999 = 0;
        this.field1820 = 0;
        this.field1827 = 999999;
        this.field1806 = -999999;
        this.field1829 = -99999;
        this.field1830 = 99999;
        for (int var1 = 0; var1 < this.field1796; var1++) {
            int var2 = this.field1811[var1];
            int var3 = this.field1798[var1];
            int var4 = this.field1809[var1];
            if (var2 < this.field1827) {
                this.field1827 = var2;
            }
            if (var2 > this.field1806) {
                this.field1806 = var2;
            }
            if (var4 < this.field1830) {
                this.field1830 = var4;
            }
            if (var4 > this.field1829) {
                this.field1829 = var4;
            }
            if (-var3 > this.field1999) {
                this.field1999 = -var3;
            }
            if (var3 > this.field1820) {
                this.field1820 = var3;
            }
        }
        this.field1825 = true;
    }

    @ObfuscatedName("fs.a(Lfs;Lfs;IIIZ)V")
    public static void method2907(class169 arg0, class169 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2858();
        arg0.method2898();
        arg1.method2858();
        arg1.method2898();
        field1833++;
        int var6 = 0;
        int[] var7 = arg1.field1811;
        int var8 = arg1.field1796;
        for (int var9 = 0; var9 < arg0.field1796; var9++) {
            class185 var10 = arg0.field1821[var9];
            if (var10.field2147 != 0) {
                int var11 = arg0.field1798[var9] - arg3;
                if (var11 <= arg1.field1820) {
                    int var12 = arg0.field1811[var9] - arg2;
                    if (var12 >= arg1.field1827 && var12 <= arg1.field1806) {
                        int var13 = arg0.field1809[var9] - arg4;
                        if (var13 >= arg1.field1830 && var13 <= arg1.field1829) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class185 var15 = arg1.field1821[var14];
                                if (var7[var14] == var12 && arg1.field1809[var14] == var13 && arg1.field1798[var14] == var11 && var15.field2147 != 0) {
                                    if (arg0.field1822 == null) {
                                        arg0.field1822 = new class185[arg0.field1796];
                                    }
                                    if (arg1.field1822 == null) {
                                        arg1.field1822 = new class185[var8];
                                    }
                                    class185 var16 = arg0.field1822[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1822[var9] = new class185(var10);
                                    }
                                    class185 var17 = arg1.field1822[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1822[var14] = new class185(var15);
                                    }
                                    var16.field2146 += var15.field2146;
                                    var16.field2145 += var15.field2145;
                                    var16.field2144 += var15.field2144;
                                    var16.field2147 += var15.field2147;
                                    var17.field2146 += var10.field2146;
                                    var17.field2145 += var10.field2145;
                                    var17.field2144 += var10.field2144;
                                    var17.field2147 += var10.field2147;
                                    var6++;
                                    field1823[var9] = field1833;
                                    field1832[var14] = field1833;
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
        for (int var18 = 0; var18 < arg0.field1800; var18++) {
            if (field1823[arg0.field1801[var18]] == field1833 && field1823[arg0.field1805[var18]] == field1833 && field1823[arg0.field1803[var18]] == field1833) {
                if (arg0.field1831 == null) {
                    arg0.field1831 = new byte[arg0.field1800];
                }
                arg0.field1831[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1800; var19++) {
            if (field1832[arg1.field1801[var19]] == field1833 && field1832[arg1.field1805[var19]] == field1833 && field1832[arg1.field1803[var19]] == field1833) {
                if (arg1.field1831 == null) {
                    arg1.field1831 = new byte[arg1.field1800];
                }
                arg1.field1831[var19] = 2;
            }
        }
    }

    @ObfuscatedName("fs.w(IIIII)Lgv;")
    public final class183 method2860(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2898();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class183 var8 = new class183();
        var8.field2074 = new int[this.field1800];
        var8.field2075 = new int[this.field1800];
        var8.field2076 = new int[this.field1800];
        if (this.field1799 > 0 && this.field1802 != null) {
            int[] var9 = new int[this.field1799];
            for (int var10 = 0; var10 < this.field1800; var10++) {
                if (this.field1802[var10] != -1) {
                    var9[this.field1802[var10] & 0xFF]++;
                }
            }
            var8.field2082 = 0;
            for (int var11 = 0; var11 < this.field1799; var11++) {
                if (var9[var11] > 0 && this.field1797[var11] == 0) {
                    var8.field2082++;
                }
            }
            var8.field2083 = new int[var8.field2082];
            var8.field2084 = new int[var8.field2082];
            var8.field2096 = new int[var8.field2082];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1799; var13++) {
                if (var9[var13] > 0 && this.field1797[var13] == 0) {
                    var8.field2083[var12] = this.field1813[var13] & 0xFFFF;
                    var8.field2084[var12] = this.field1814[var13] & 0xFFFF;
                    var8.field2096[var12] = this.field1815[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2079 = new byte[this.field1800];
            for (int var14 = 0; var14 < this.field1800; var14++) {
                if (this.field1802[var14] == -1) {
                    var8.field2079[var14] = -1;
                } else {
                    var8.field2079[var14] = (byte) var9[this.field1802[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1800; var15++) {
            byte var16;
            if (this.field1831 == null) {
                var16 = 0;
            } else {
                var16 = this.field1831[var15];
            }
            byte var17;
            if (this.field1828 == null) {
                var17 = 0;
            } else {
                var17 = this.field1828[var15];
            }
            short var18;
            if (this.field1818 == null) {
                var18 = -1;
            } else {
                var18 = this.field1818[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1808[var15] & 0xFFFF;
                    class185 var20;
                    if (this.field1822 == null || this.field1822[this.field1801[var15]] == null) {
                        var20 = this.field1821[this.field1801[var15]];
                    } else {
                        var20 = this.field1822[this.field1801[var15]];
                    }
                    int var21 = (var20.field2144 * arg4 + var20.field2146 * arg2 + var20.field2145 * arg3) / (var20.field2147 * var7) + arg0;
                    var8.field2074[var15] = method2861(var19, var21);
                    class185 var22;
                    if (this.field1822 == null || this.field1822[this.field1805[var15]] == null) {
                        var22 = this.field1821[this.field1805[var15]];
                    } else {
                        var22 = this.field1822[this.field1805[var15]];
                    }
                    int var23 = (var22.field2144 * arg4 + var22.field2146 * arg2 + var22.field2145 * arg3) / (var22.field2147 * var7) + arg0;
                    var8.field2075[var15] = method2861(var19, var23);
                    class185 var24;
                    if (this.field1822 == null || this.field1822[this.field1803[var15]] == null) {
                        var24 = this.field1821[this.field1803[var15]];
                    } else {
                        var24 = this.field1822[this.field1803[var15]];
                    }
                    int var25 = (var24.field2144 * arg4 + var24.field2146 * arg2 + var24.field2145 * arg3) / (var24.field2147 * var7) + arg0;
                    var8.field2076[var15] = method2861(var19, var25);
                } else if (var16 == 1) {
                    class178 var26 = this.field1804[var15];
                    int var27 = (var26.field2002 * arg4 + var26.field2006 * arg2 + var26.field2001 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2074[var15] = method2861(this.field1808[var15] & 0xFFFF, var27);
                    var8.field2076[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2074[var15] = 128;
                    var8.field2076[var15] = -1;
                } else {
                    var8.field2076[var15] = -2;
                }
            } else if (var16 == 0) {
                class185 var28;
                if (this.field1822 == null || this.field1822[this.field1801[var15]] == null) {
                    var28 = this.field1821[this.field1801[var15]];
                } else {
                    var28 = this.field1822[this.field1801[var15]];
                }
                int var29 = (var28.field2144 * arg4 + var28.field2146 * arg2 + var28.field2145 * arg3) / (var28.field2147 * var7) + arg0;
                var8.field2074[var15] = method2862(var29);
                class185 var30;
                if (this.field1822 == null || this.field1822[this.field1805[var15]] == null) {
                    var30 = this.field1821[this.field1805[var15]];
                } else {
                    var30 = this.field1822[this.field1805[var15]];
                }
                int var31 = (var30.field2144 * arg4 + var30.field2146 * arg2 + var30.field2145 * arg3) / (var30.field2147 * var7) + arg0;
                var8.field2075[var15] = method2862(var31);
                class185 var32;
                if (this.field1822 == null || this.field1822[this.field1803[var15]] == null) {
                    var32 = this.field1821[this.field1803[var15]];
                } else {
                    var32 = this.field1822[this.field1803[var15]];
                }
                int var33 = (var32.field2144 * arg4 + var32.field2146 * arg2 + var32.field2145 * arg3) / (var32.field2147 * var7) + arg0;
                var8.field2076[var15] = method2862(var33);
            } else if (var16 == 1) {
                class178 var34 = this.field1804[var15];
                int var35 = (var34.field2002 * arg4 + var34.field2006 * arg2 + var34.field2001 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field2074[var15] = method2862(var35);
                var8.field2076[var15] = -1;
            } else {
                var8.field2076[var15] = -2;
            }
        }
        this.method2846();
        var8.field2066 = this.field1796;
        var8.field2067 = this.field1811;
        var8.field2068 = this.field1798;
        var8.field2069 = this.field1809;
        var8.field2071 = this.field1800;
        var8.field2124 = this.field1801;
        var8.field2087 = this.field1805;
        var8.field2116 = this.field1803;
        var8.field2077 = this.field1812;
        var8.field2080 = this.field1828;
        var8.field2081 = this.field1810;
        var8.field2086 = this.field1826;
        var8.field2109 = this.field1819;
        var8.field2119 = this.field1818;
        return var8;
    }

    @ObfuscatedName("fs.s(II)I")
    public static final int method2861(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("fs.y(I)I")
    public static final int method2862(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
