package deob;

@ObfuscatedName("fh")
public class class157 extends class349 {

    @ObfuscatedName("fh.x")
    public static class223 field1790 = new class223(64);

    @ObfuscatedName("fh.r")
    public static class223 field1791 = new class223(50);

    @ObfuscatedName("fh.p")
    public static class223 field1837 = new class223(200);

    @ObfuscatedName("fh.k")
    public int field1802;

    @ObfuscatedName("fh.a")
    public int field1795;

    @ObfuscatedName("fh.q")
    public String field1836 = class270.field3234;

    @ObfuscatedName("fh.u")
    public short[] field1796;

    @ObfuscatedName("fh.e")
    public short[] field1797;

    @ObfuscatedName("fh.c")
    public short[] field1798;

    @ObfuscatedName("fh.i")
    public short[] field1799;

    @ObfuscatedName("fh.m")
    public int field1800 = 2000;

    @ObfuscatedName("fh.b")
    public int field1801 = 0;

    @ObfuscatedName("fh.z")
    public int field1822 = 0;

    @ObfuscatedName("fh.d")
    public int field1803 = 0;

    @ObfuscatedName("fh.y")
    public int field1804 = 0;

    @ObfuscatedName("fh.g")
    public int field1805 = 0;

    @ObfuscatedName("fh.ae")
    public int field1806 = 0;

    @ObfuscatedName("fh.an")
    public int field1807 = 1;

    @ObfuscatedName("fh.am")
    public boolean field1808 = false;

    @ObfuscatedName("fh.al")
    public String[] field1809 = new String[] { null, null, class270.field3227, null, null };

    @ObfuscatedName("fh.aq")
    public String[] field1810 = new String[] { null, null, null, null, class270.field3228 };

    @ObfuscatedName("fh.ab")
    public int field1792 = -2;

    @ObfuscatedName("fh.ax")
    public int field1812 = -1;

    @ObfuscatedName("fh.au")
    public int field1813 = -1;

    @ObfuscatedName("fh.av")
    public int field1841 = 0;

    @ObfuscatedName("fh.as")
    public int field1815 = -1;

    @ObfuscatedName("fh.ao")
    public int field1811 = -1;

    @ObfuscatedName("fh.az")
    public int field1817 = 0;

    @ObfuscatedName("fh.ak")
    public int field1818 = -1;

    @ObfuscatedName("fh.aj")
    public int field1819 = -1;

    @ObfuscatedName("fh.at")
    public int field1816 = -1;

    @ObfuscatedName("fh.af")
    public int field1821 = -1;

    @ObfuscatedName("fh.ar")
    public int field1835 = -1;

    @ObfuscatedName("fh.ay")
    public int field1823 = -1;

    @ObfuscatedName("fh.ap")
    public int[] field1824;

    @ObfuscatedName("fh.ah")
    public int[] field1825;

    @ObfuscatedName("fh.ag")
    public int field1827 = -1;

    @ObfuscatedName("fh.ai")
    public int field1789 = -1;

    @ObfuscatedName("fh.ad")
    public int field1839 = 128;

    @ObfuscatedName("fh.ac")
    public int field1826 = 128;

    @ObfuscatedName("fh.aw")
    public int field1830 = 128;

    @ObfuscatedName("fh.bt")
    public int field1793 = 0;

    @ObfuscatedName("fh.bk")
    public int field1832 = 0;

    @ObfuscatedName("fh.br")
    public int field1833 = 0;

    @ObfuscatedName("fh.by")
    public class363 field1831;

    @ObfuscatedName("fh.bv")
    public boolean field1834 = false;

    @ObfuscatedName("fh.bf")
    public int field1829 = -1;

    @ObfuscatedName("fh.bd")
    public int field1786 = -1;

    @ObfuscatedName("fh.bg")
    public int field1838 = -1;

    @ObfuscatedName("fh.bw")
    public int field1820 = -1;

    @ObfuscatedName("gr.s(Ljy;Ljy;ZLkt;B)V")
    public static void method3299(class277 arg0, class277 arg1, boolean arg2, class302 arg3) {
        Statics.field217 = arg0;
        Statics.field3935 = arg1;
        Statics.field1595 = arg2;
        Statics.field1687 = Statics.field217.method4484(10);
        Statics.field928 = arg3;
    }

    @ObfuscatedName("r.t(II)Lfh;")
    public static class157 method101(int arg0) {
        class157 var1 = (class157) field1790.method3927((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field217.method4459(10, arg0);
        class157 var3 = new class157();
        var3.field1802 = arg0;
        if (var2 != null) {
            var3.method2730(new class385(var2));
        }
        var3.method2729();
        if (var3.field1789 != -1) {
            var3.method2732(method101(var3.field1789), method101(var3.field1827));
        }
        if (var3.field1786 != -1) {
            var3.method2733(method101(var3.field1786), method101(var3.field1829));
        }
        if (var3.field1820 != -1) {
            var3.method2734(method101(var3.field1820), method101(var3.field1838));
        }
        if (!Statics.field1595 && var3.field1808) {
            var3.field1836 = class270.field3229;
            var3.field1834 = false;
            for (int var4 = 0; var4 < var3.field1809.length; var4++) {
                var3.field1809[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field1810.length; var5++) {
                if (var5 != 4) {
                    var3.field1810[var5] = null;
                }
            }
            var3.field1792 = -2;
            var3.field1833 = 0;
            if (var3.field1831 != null) {
                boolean var6 = false;
                for (class354 var7 = var3.field1831.method5729(); var7 != null; var7 = var3.field1831.method5730()) {
                    class153 var8 = class153.method5938((int) var7.field3966);
                    if (var8.field1699) {
                        var7.method5447();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field1831 = null;
                }
            }
        }
        field1790.method3929(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fh.v(I)V")
    public void method2729() {
    }

    @ObfuscatedName("fh.j(Lnv;I)V")
    public void method2730(class385 arg0) {
        while (true) {
            int var2 = arg0.method5958();
            if (var2 == 0) {
                return;
            }
            this.method2731(arg0, var2);
        }
    }

    @ObfuscatedName("fh.l(Lnv;II)V")
    public void method2731(class385 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1795 = arg0.method6053();
        } else if (arg1 == 2) {
            this.field1836 = arg0.method5967();
        } else if (arg1 == 4) {
            this.field1800 = arg0.method6053();
        } else if (arg1 == 5) {
            this.field1801 = arg0.method6053();
        } else if (arg1 == 6) {
            this.field1822 = arg0.method6053();
        } else if (arg1 == 7) {
            this.field1804 = arg0.method6053();
            if (this.field1804 > 32767) {
                this.field1804 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1805 = arg0.method6053();
            if (this.field1805 > 32767) {
                this.field1805 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method5967();
        } else if (arg1 == 11) {
            this.field1806 = 1;
        } else if (arg1 == 12) {
            this.field1807 = arg0.method6182();
        } else if (arg1 == 16) {
            this.field1808 = true;
        } else if (arg1 == 23) {
            this.field1812 = arg0.method6053();
            this.field1841 = arg0.method5958();
        } else if (arg1 == 24) {
            this.field1813 = arg0.method6053();
        } else if (arg1 == 25) {
            this.field1815 = arg0.method6053();
            this.field1817 = arg0.method5958();
        } else if (arg1 == 26) {
            this.field1811 = arg0.method6053();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1809[arg1 - 30] = arg0.method5967();
            if (this.field1809[arg1 - 30].equalsIgnoreCase(class270.field3525)) {
                this.field1809[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1810[arg1 - 35] = arg0.method5967();
        } else if (arg1 == 40) {
            int var3 = arg0.method5958();
            this.field1796 = new short[var3];
            this.field1797 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1796[var4] = (short) arg0.method6053();
                this.field1797[var4] = (short) arg0.method6053();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5958();
            this.field1798 = new short[var5];
            this.field1799 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1798[var6] = (short) arg0.method6053();
                this.field1799[var6] = (short) arg0.method6053();
            }
        } else if (arg1 == 42) {
            this.field1792 = arg0.method5959();
        } else if (arg1 == 65) {
            this.field1834 = true;
        } else if (arg1 == 78) {
            this.field1818 = arg0.method6053();
        } else if (arg1 == 79) {
            this.field1819 = arg0.method6053();
        } else if (arg1 == 90) {
            this.field1816 = arg0.method6053();
        } else if (arg1 == 91) {
            this.field1835 = arg0.method6053();
        } else if (arg1 == 92) {
            this.field1821 = arg0.method6053();
        } else if (arg1 == 93) {
            this.field1823 = arg0.method6053();
        } else if (arg1 == 94) {
            arg0.method6053();
        } else if (arg1 == 95) {
            this.field1803 = arg0.method6053();
        } else if (arg1 == 97) {
            this.field1827 = arg0.method6053();
        } else if (arg1 == 98) {
            this.field1789 = arg0.method6053();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1824 == null) {
                this.field1824 = new int[10];
                this.field1825 = new int[10];
            }
            this.field1824[arg1 - 100] = arg0.method6053();
            this.field1825[arg1 - 100] = arg0.method6053();
        } else if (arg1 == 110) {
            this.field1839 = arg0.method6053();
        } else if (arg1 == 111) {
            this.field1826 = arg0.method6053();
        } else if (arg1 == 112) {
            this.field1830 = arg0.method6053();
        } else if (arg1 == 113) {
            this.field1793 = arg0.method5959();
        } else if (arg1 == 114) {
            this.field1832 = arg0.method5959() * 5;
        } else if (arg1 == 115) {
            this.field1833 = arg0.method5958();
        } else if (arg1 == 139) {
            this.field1829 = arg0.method6053();
        } else if (arg1 == 140) {
            this.field1786 = arg0.method6053();
        } else if (arg1 == 148) {
            this.field1838 = arg0.method6053();
        } else if (arg1 == 149) {
            this.field1820 = arg0.method6053();
        } else if (arg1 == 249) {
            this.field1831 = class145.method1414(arg0, this.field1831);
        }
    }

    @ObfuscatedName("fh.n(Lfh;Lfh;I)V")
    public void method2732(class157 arg0, class157 arg1) {
        this.field1795 = arg0.field1795;
        this.field1800 = arg0.field1800;
        this.field1801 = arg0.field1801;
        this.field1822 = arg0.field1822;
        this.field1803 = arg0.field1803;
        this.field1804 = arg0.field1804;
        this.field1805 = arg0.field1805;
        this.field1796 = arg0.field1796;
        this.field1797 = arg0.field1797;
        this.field1798 = arg0.field1798;
        this.field1799 = arg0.field1799;
        this.field1836 = arg1.field1836;
        this.field1808 = arg1.field1808;
        this.field1807 = arg1.field1807;
        this.field1806 = 1;
    }

    @ObfuscatedName("fh.w(Lfh;Lfh;S)V")
    public void method2733(class157 arg0, class157 arg1) {
        this.field1795 = arg0.field1795;
        this.field1800 = arg0.field1800;
        this.field1801 = arg0.field1801;
        this.field1822 = arg0.field1822;
        this.field1803 = arg0.field1803;
        this.field1804 = arg0.field1804;
        this.field1805 = arg0.field1805;
        this.field1796 = arg1.field1796;
        this.field1797 = arg1.field1797;
        this.field1798 = arg1.field1798;
        this.field1799 = arg1.field1799;
        this.field1836 = arg1.field1836;
        this.field1808 = arg1.field1808;
        this.field1806 = arg1.field1806;
        this.field1812 = arg1.field1812;
        this.field1813 = arg1.field1813;
        this.field1818 = arg1.field1818;
        this.field1815 = arg1.field1815;
        this.field1811 = arg1.field1811;
        this.field1819 = arg1.field1819;
        this.field1816 = arg1.field1816;
        this.field1821 = arg1.field1821;
        this.field1835 = arg1.field1835;
        this.field1823 = arg1.field1823;
        this.field1833 = arg1.field1833;
        this.field1809 = arg1.field1809;
        this.field1810 = new String[5];
        if (arg1.field1810 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1810[var3] = arg1.field1810[var3];
            }
        }
        this.field1810[4] = class270.field3408;
        this.field1807 = 0;
    }

    @ObfuscatedName("fh.f(Lfh;Lfh;I)V")
    public void method2734(class157 arg0, class157 arg1) {
        this.field1795 = arg0.field1795;
        this.field1800 = arg0.field1800;
        this.field1801 = arg0.field1801;
        this.field1822 = arg0.field1822;
        this.field1803 = arg0.field1803;
        this.field1804 = arg0.field1804;
        this.field1805 = arg0.field1805;
        this.field1796 = arg0.field1796;
        this.field1797 = arg0.field1797;
        this.field1798 = arg0.field1798;
        this.field1799 = arg0.field1799;
        this.field1806 = arg0.field1806;
        this.field1836 = arg1.field1836;
        this.field1807 = 0;
        this.field1808 = false;
        this.field1834 = false;
    }

    @ObfuscatedName("fh.o(IB)Lgz;")
    public final class193 method2735(int arg0) {
        if (this.field1824 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1825[var3] && this.field1825[var3] != 0) {
                    var2 = this.field1824[var3];
                }
            }
            if (var2 != -1) {
                return method101(var2).method2735(1);
            }
        }
        class193 var4 = class193.method3357(Statics.field3935, this.field1795, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1839 != 128 || this.field1826 != 128 || this.field1830 != 128) {
            var4.method3409(this.field1839, this.field1826, this.field1830);
        }
        if (this.field1796 != null) {
            for (int var5 = 0; var5 < this.field1796.length; var5++) {
                var4.method3403(this.field1796[var5], this.field1797[var5]);
            }
        }
        if (this.field1798 != null) {
            for (int var6 = 0; var6 < this.field1798.length; var6++) {
                var4.method3370(this.field1798[var6], this.field1799[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fh.x(IB)Lgl;")
    public final class207 method2764(int arg0) {
        if (this.field1824 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1825[var3] && this.field1825[var3] != 0) {
                    var2 = this.field1824[var3];
                }
            }
            if (var2 != -1) {
                return method101(var2).method2764(1);
            }
        }
        class207 var4 = (class207) field1791.method3927((long) this.field1802);
        if (var4 != null) {
            return var4;
        }
        class193 var5 = class193.method3357(Statics.field3935, this.field1795, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1839 != 128 || this.field1826 != 128 || this.field1830 != 128) {
            var5.method3409(this.field1839, this.field1826, this.field1830);
        }
        if (this.field1796 != null) {
            for (int var6 = 0; var6 < this.field1796.length; var6++) {
                var5.method3403(this.field1796[var6], this.field1797[var6]);
            }
        }
        if (this.field1798 != null) {
            for (int var7 = 0; var7 < this.field1798.length; var7++) {
                var5.method3370(this.field1798[var7], this.field1799[var7]);
            }
        }
        class207 var8 = var5.method3377(this.field1793 + 64, this.field1832 + 768, -50, -10, -50);
        var8.field2430 = true;
        field1791.method3929(var8, (long) this.field1802);
        return var8;
    }

    @ObfuscatedName("fh.r(II)Lfh;")
    public class157 method2737(int arg0) {
        if (this.field1824 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1825[var3] && this.field1825[var3] != 0) {
                    var2 = this.field1824[var3];
                }
            }
            if (var2 != -1) {
                return method101(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("dp.p(IIIIIZI)Lom;")
    public static final class398 method2271(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class398 var8 = (class398) field1837.method3927(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class157 var9 = method101(arg0);
        if (arg1 > 1 && var9.field1824 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1825[var11] && var9.field1825[var11] != 0) {
                    var10 = var9.field1824[var11];
                }
            }
            if (var10 != -1) {
                var9 = method101(var10);
            }
        }
        class207 var12 = var9.method2764(1);
        if (var12 == null) {
            return null;
        }
        class398 var13 = null;
        if (var9.field1789 != -1) {
            var13 = method2271(var9.field1827, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1786 != -1) {
            var13 = method2271(var9.field1829, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1820 != -1) {
            var13 = method2271(var9.field1838, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field4250;
        int var15 = Statics.field4245;
        int var16 = Statics.field4246;
        int[] var17 = new int[4];
        class394.method6266(var17);
        class398 var18 = new class398(36, 32);
        class394.method6319(var18.field4280, 36, 32);
        class394.method6268();
        class198.method3456();
        class198.method3459(16, 16);
        class198.field2250 = false;
        if (var9.field1820 != -1) {
            var13.method6403(0, 0);
        }
        int var19 = var9.field1800;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class198.field2266[var9.field1801] * var19 >> 16;
        int var21 = class198.field2273[var9.field1801] * var19 >> 16;
        var12.method3772();
        var12.method3820(0, var9.field1822, var9.field1803, var9.field1801, var9.field1804, var9.field1805 + var12.field2346 / 2 + var20, var9.field1805 + var21);
        if (var9.field1786 != -1) {
            var13.method6403(0, 0);
        }
        if (arg2 >= 1) {
            var18.method6374(1);
        }
        if (arg2 >= 2) {
            var18.method6374(16777215);
        }
        if (arg3 != 0) {
            var18.method6375(arg3);
        }
        class394.method6319(var18.field4280, 36, 32);
        if (var9.field1789 != -1) {
            var13.method6403(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1806 == 1) {
            Statics.field928.method4891(method4322(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1837.method3929(var18, var6);
        }
        class394.method6319(var14, var15, var16);
        class394.method6267(var17);
        class198.method3456();
        class198.field2250 = true;
        return var18;
    }

    @ObfuscatedName("ik.h(IB)Ljava/lang/String;")
    public static final String method4322(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class270.field3394 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class270.field3392 + "</col>";
        }
    }

    @ObfuscatedName("fh.k(ZI)Z")
    public final boolean method2741(boolean arg0) {
        int var2 = this.field1812;
        int var3 = this.field1813;
        int var4 = this.field1818;
        if (arg0) {
            var2 = this.field1815;
            var3 = this.field1811;
            var4 = this.field1819;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3935.method4539(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3935.method4539(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3935.method4539(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("fh.a(ZI)Lgz;")
    public final class193 method2739(boolean arg0) {
        int var2 = this.field1812;
        int var3 = this.field1813;
        int var4 = this.field1818;
        if (arg0) {
            var2 = this.field1815;
            var3 = this.field1811;
            var4 = this.field1819;
        }
        if (var2 == -1) {
            return null;
        }
        class193 var5 = class193.method3357(Statics.field3935, var2, 0);
        if (var3 != -1) {
            class193 var6 = class193.method3357(Statics.field3935, var3, 0);
            if (var4 == -1) {
                class193[] var9 = new class193[] { var5, var6 };
                var5 = new class193(var9, 2);
            } else {
                class193 var7 = class193.method3357(Statics.field3935, var4, 0);
                class193[] var8 = new class193[] { var5, var6, var7 };
                var5 = new class193(var8, 3);
            }
        }
        if (!arg0 && this.field1841 != 0) {
            var5.method3368(0, this.field1841, 0);
        }
        if (arg0 && this.field1817 != 0) {
            var5.method3368(0, this.field1817, 0);
        }
        if (this.field1796 != null) {
            for (int var10 = 0; var10 < this.field1796.length; var10++) {
                var5.method3403(this.field1796[var10], this.field1797[var10]);
            }
        }
        if (this.field1798 != null) {
            for (int var11 = 0; var11 < this.field1798.length; var11++) {
                var5.method3370(this.field1798[var11], this.field1799[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("fh.q(ZB)Z")
    public final boolean method2740(boolean arg0) {
        int var2 = this.field1816;
        int var3 = this.field1821;
        if (arg0) {
            var2 = this.field1835;
            var3 = this.field1823;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3935.method4539(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3935.method4539(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("fh.u(ZB)Lgz;")
    public final class193 method2728(boolean arg0) {
        int var2 = this.field1816;
        int var3 = this.field1821;
        if (arg0) {
            var2 = this.field1835;
            var3 = this.field1823;
        }
        if (var2 == -1) {
            return null;
        }
        class193 var4 = class193.method3357(Statics.field3935, var2, 0);
        if (var3 != -1) {
            class193 var5 = class193.method3357(Statics.field3935, var3, 0);
            class193[] var6 = new class193[] { var4, var5 };
            var4 = new class193(var6, 2);
        }
        if (this.field1796 != null) {
            for (int var7 = 0; var7 < this.field1796.length; var7++) {
                var4.method3403(this.field1796[var7], this.field1797[var7]);
            }
        }
        if (this.field1798 != null) {
            for (int var8 = 0; var8 < this.field1798.length; var8++) {
                var4.method3370(this.field1798[var8], this.field1799[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fh.e(III)I")
    public int method2784(int arg0, int arg1) {
        class363 var3 = this.field1831;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class353 var5 = (class353) var3.method5726((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field3964;
            }
        }
        return var4;
    }

    @ObfuscatedName("fh.c(ILjava/lang/String;B)Ljava/lang/String;")
    public String method2743(int arg0, String arg1) {
        class363 var3 = this.field1831;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class350 var5 = (class350) var3.method5726((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field3961;
            }
        }
        return var4;
    }

    @ObfuscatedName("fh.i(I)I")
    public int method2744() {
        if (this.field1792 == -1 || this.field1810 == null) {
            return -1;
        } else if (this.field1792 >= 0) {
            return this.field1810[this.field1792] == null ? -1 : this.field1792;
        } else if (class270.field3228.equalsIgnoreCase(this.field1810[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ec.m(I)V")
    public static void method2579() {
        field1790.method3930();
        field1791.method3930();
        field1837.method3930();
    }

    @ObfuscatedName("en.b(ZI)V")
    public static void method2573(boolean arg0) {
        if (Statics.field1595 != arg0) {
            method2579();
            Statics.field1595 = arg0;
        }
    }

    @ObfuscatedName("fh.z(I)Z")
    public boolean method2745() {
        return this.field1797 != null;
    }

    @ObfuscatedName("fh.d(B)Z")
    public boolean method2746() {
        return this.field1799 != null;
    }
}
