package deob;

@ObfuscatedName("ez")
public class class155 extends class348 {

    @ObfuscatedName("ez.f")
    public static boolean field1787 = false;

    @ObfuscatedName("ez.y")
    public static class222 field1759 = new class222(4096);

    @ObfuscatedName("ez.j")
    public static class222 field1760 = new class222(500);

    @ObfuscatedName("ez.o")
    public static class222 field1761 = new class222(30);

    @ObfuscatedName("ez.m")
    public static class222 field1762 = new class222(30);

    @ObfuscatedName("ez.r")
    public static class192[] field1782 = new class192[4];

    @ObfuscatedName("ez.h")
    public int field1779;

    @ObfuscatedName("ez.d")
    public int[] field1765;

    @ObfuscatedName("ez.z")
    public int[] field1766;

    @ObfuscatedName("ez.b")
    public String field1767 = class269.field3238;

    @ObfuscatedName("ez.i")
    public short[] field1768;

    @ObfuscatedName("ez.k")
    public short[] field1769;

    @ObfuscatedName("ez.g")
    public short[] field1770;

    @ObfuscatedName("ez.t")
    public short[] field1771;

    @ObfuscatedName("ez.x")
    public int field1772 = 1;

    @ObfuscatedName("ez.u")
    public int field1773 = 1;

    @ObfuscatedName("ez.q")
    public int field1774 = 2;

    @ObfuscatedName("ez.s")
    public boolean field1775 = true;

    @ObfuscatedName("ez.p")
    public int field1776 = -1;

    @ObfuscatedName("ez.c")
    public int field1777 = -1;

    @ObfuscatedName("ez.n")
    public boolean field1795 = false;

    @ObfuscatedName("ez.l")
    public boolean field1797 = false;

    @ObfuscatedName("ez.w")
    public int field1780 = -1;

    @ObfuscatedName("ez.a")
    public int field1781 = 16;

    @ObfuscatedName("ez.aw")
    public int field1786 = 0;

    @ObfuscatedName("ez.ak")
    public int field1783 = 0;

    @ObfuscatedName("ez.ad")
    public String[] field1794 = new String[5];

    @ObfuscatedName("ez.at")
    public int field1788 = -1;

    @ObfuscatedName("ez.ah")
    public int field1757 = -1;

    @ObfuscatedName("ez.az")
    public boolean field1792 = false;

    @ObfuscatedName("ez.ap")
    public boolean field1756 = true;

    @ObfuscatedName("ez.ag")
    public int field1789 = 128;

    @ObfuscatedName("ez.ab")
    public int field1790 = 128;

    @ObfuscatedName("ez.aq")
    public int field1778 = 128;

    @ObfuscatedName("ez.ae")
    public int field1764 = 0;

    @ObfuscatedName("ez.ao")
    public int field1793 = 0;

    @ObfuscatedName("ez.an")
    public int field1805 = 0;

    @ObfuscatedName("ez.al")
    public boolean field1800 = false;

    @ObfuscatedName("ez.aj")
    public boolean field1796 = false;

    @ObfuscatedName("ez.ac")
    public int field1784 = -1;

    @ObfuscatedName("ez.as")
    public int[] field1798;

    @ObfuscatedName("ez.au")
    public int field1799 = -1;

    @ObfuscatedName("ez.ay")
    public int field1763 = -1;

    @ObfuscatedName("ez.am")
    public int field1806 = -1;

    @ObfuscatedName("ez.aa")
    public int field1802 = 0;

    @ObfuscatedName("ez.ai")
    public int field1803 = 0;

    @ObfuscatedName("ez.av")
    public int field1804 = 0;

    @ObfuscatedName("ez.ax")
    public int[] field1801;

    @ObfuscatedName("ez.ar")
    public boolean field1785 = true;

    @ObfuscatedName("ez.af")
    public class362 field1807;

    @ObfuscatedName("cl.f(Ljp;Ljp;ZI)V")
    public static void method1999(class276 arg0, class276 arg1, boolean arg2) {
        Statics.field1791 = arg0;
        Statics.field1758 = arg1;
        field1787 = arg2;
    }

    @ObfuscatedName("ca.e(IB)Lez;")
    public static class155 method1864(int arg0) {
        class155 var1 = (class155) field1759.method3987((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1791.method4504(6, arg0);
        class155 var3 = new class155();
        var3.field1779 = arg0;
        if (var2 != null) {
            var3.method2704(new class384(var2));
        }
        var3.method2748();
        if (var3.field1796) {
            var3.field1774 = 0;
            var3.field1775 = false;
        }
        field1759.method3988(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ez.v(B)V")
    public void method2748() {
        if (this.field1776 == -1) {
            this.field1776 = 0;
            if (this.field1765 != null && (this.field1766 == null || this.field1766[0] == 10)) {
                this.field1776 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field1794[var1] != null) {
                    this.field1776 = 1;
                }
            }
        }
        if (this.field1784 == -1) {
            this.field1784 = this.field1774 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ez.y(Lnt;I)V")
    public void method2704(class384 arg0) {
        while (true) {
            int var2 = arg0.method5902();
            if (var2 == 0) {
                return;
            }
            this.method2705(arg0, var2);
        }
    }

    @ObfuscatedName("ez.j(Lnt;IB)V")
    public void method2705(class384 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5902();
            if (var3 > 0) {
                if (this.field1765 == null || field1787) {
                    this.field1766 = new int[var3];
                    this.field1765 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field1765[var4] = arg0.method5899();
                        this.field1766[var4] = arg0.method5902();
                    }
                } else {
                    arg0.field4161 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field1767 = arg0.method5906();
        } else if (arg1 == 5) {
            int var5 = arg0.method5902();
            if (var5 > 0) {
                if (this.field1765 == null || field1787) {
                    this.field1766 = null;
                    this.field1765 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1765[var6] = arg0.method5899();
                    }
                } else {
                    arg0.field4161 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field1772 = arg0.method5902();
        } else if (arg1 == 15) {
            this.field1773 = arg0.method5902();
        } else if (arg1 == 17) {
            this.field1774 = 0;
            this.field1775 = false;
        } else if (arg1 == 18) {
            this.field1775 = false;
        } else if (arg1 == 19) {
            this.field1776 = arg0.method5902();
        } else if (arg1 == 21) {
            this.field1777 = 0;
        } else if (arg1 == 22) {
            this.field1795 = true;
        } else if (arg1 == 23) {
            this.field1797 = true;
        } else if (arg1 == 24) {
            this.field1780 = arg0.method5899();
            if (this.field1780 == 65535) {
                this.field1780 = -1;
            }
        } else if (arg1 == 27) {
            this.field1774 = 1;
        } else if (arg1 == 28) {
            this.field1781 = arg0.method5902();
        } else if (arg1 == 29) {
            this.field1786 = arg0.method5968();
        } else if (arg1 == 39) {
            this.field1783 = arg0.method5968() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1794[arg1 - 30] = arg0.method5906();
            if (this.field1794[arg1 - 30].equalsIgnoreCase(class269.field3233)) {
                this.field1794[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method5902();
            this.field1768 = new short[var7];
            this.field1769 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1768[var8] = (short) arg0.method5899();
                this.field1769[var8] = (short) arg0.method5899();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method5902();
            this.field1770 = new short[var9];
            this.field1771 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1770[var10] = (short) arg0.method5899();
                this.field1771[var10] = (short) arg0.method5899();
            }
        } else if (arg1 == 61) {
            arg0.method5899();
        } else if (arg1 == 62) {
            this.field1792 = true;
        } else if (arg1 == 64) {
            this.field1756 = false;
        } else if (arg1 == 65) {
            this.field1789 = arg0.method5899();
        } else if (arg1 == 66) {
            this.field1790 = arg0.method5899();
        } else if (arg1 == 67) {
            this.field1778 = arg0.method5899();
        } else if (arg1 == 68) {
            this.field1757 = arg0.method5899();
        } else if (arg1 == 69) {
            arg0.method5902();
        } else if (arg1 == 70) {
            this.field1764 = arg0.method6109();
        } else if (arg1 == 71) {
            this.field1793 = arg0.method6109();
        } else if (arg1 == 72) {
            this.field1805 = arg0.method6109();
        } else if (arg1 == 73) {
            this.field1800 = true;
        } else if (arg1 == 74) {
            this.field1796 = true;
        } else if (arg1 == 75) {
            this.field1784 = arg0.method5902();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field1799 = arg0.method5899();
            if (this.field1799 == 65535) {
                this.field1799 = -1;
            }
            this.field1763 = arg0.method5899();
            if (this.field1763 == 65535) {
                this.field1763 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method5899();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method5902();
            this.field1798 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field1798[var15] = arg0.method5899();
                if (this.field1798[var15] == 65535) {
                    this.field1798[var15] = -1;
                }
            }
            this.field1798[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field1806 = arg0.method5899();
            this.field1802 = arg0.method5902();
        } else if (arg1 == 79) {
            this.field1803 = arg0.method5899();
            this.field1804 = arg0.method5899();
            this.field1802 = arg0.method5902();
            int var11 = arg0.method5902();
            this.field1801 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1801[var12] = arg0.method5899();
            }
        } else if (arg1 == 81) {
            this.field1777 = arg0.method5902() * 256;
        } else if (arg1 == 82) {
            this.field1788 = arg0.method5899();
        } else if (arg1 == 89) {
            this.field1785 = false;
        } else if (arg1 == 249) {
            this.field1807 = class144.method181(arg0, this.field1807);
        }
    }

    @ObfuscatedName("ez.o(II)Z")
    public final boolean method2706(int arg0) {
        if (this.field1766 != null) {
            for (int var4 = 0; var4 < this.field1766.length; var4++) {
                if (this.field1766[var4] == arg0) {
                    return Statics.field1758.method4506(this.field1765[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field1765 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field1765.length; var3++) {
                var2 &= Statics.field1758.method4506(this.field1765[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ez.m(B)Z")
    public final boolean method2707() {
        if (this.field1765 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1765.length; var2++) {
            var1 &= Statics.field1758.method4506(this.field1765[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ez.r(II[[IIIII)Lgr;")
    public final class200 method2737(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field1766 == null) {
            var7 = (long) ((this.field1779 << 10) + arg1);
        } else {
            var7 = (long) ((this.field1779 << 10) + (arg0 << 3) + arg1);
        }
        class200 var9 = (class200) field1761.method3987(var7);
        if (var9 == null) {
            class192 var10 = this.method2720(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field1795) {
                var10.field2190 = (short) (this.field1786 + 64);
                var10.field2191 = (short) (this.field1783 + 768);
                var10.method3424();
                var9 = var10;
            } else {
                var9 = var10.method3428(this.field1786 + 64, this.field1783 + 768, -50, -10, -50);
            }
            field1761.method3988(var9, var7);
        }
        if (this.field1795) {
            var9 = ((class192) var9).method3412();
        }
        if (this.field1777 >= 0) {
            if (var9 instanceof class206) {
                var9 = ((class206) var9).method3838(arg2, arg3, arg4, arg5, true, this.field1777);
            } else if (var9 instanceof class192) {
                var9 = ((class192) var9).method3475(arg2, arg3, arg4, arg5, true, this.field1777);
            }
        }
        return var9;
    }

    @ObfuscatedName("ez.h(II[[IIIII)Lgd;")
    public final class206 method2709(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field1766 == null) {
            var7 = (long) ((this.field1779 << 10) + arg1);
        } else {
            var7 = (long) ((this.field1779 << 10) + (arg0 << 3) + arg1);
        }
        class206 var9 = (class206) field1762.method3987(var7);
        if (var9 == null) {
            class192 var10 = this.method2720(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3428(this.field1786 + 64, this.field1783 + 768, -50, -10, -50);
            field1762.method3988(var9, var7);
        }
        if (this.field1777 >= 0) {
            var9 = var9.method3838(arg2, arg3, arg4, arg5, true, this.field1777);
        }
        return var9;
    }

    @ObfuscatedName("ez.d(II[[IIIILfm;IB)Lgd;")
    public final class206 method2710(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class158 arg6, int arg7) {
        long var9;
        if (this.field1766 == null) {
            var9 = (long) ((this.field1779 << 10) + arg1);
        } else {
            var9 = (long) ((this.field1779 << 10) + (arg0 << 3) + arg1);
        }
        class206 var11 = (class206) field1762.method3987(var9);
        if (var11 == null) {
            class192 var12 = this.method2720(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method3428(this.field1786 + 64, this.field1783 + 768, -50, -10, -50);
            field1762.method3988(var11, var9);
        }
        if (arg6 == null && this.field1777 == -1) {
            return var11;
        }
        class206 var13;
        if (arg6 == null) {
            var13 = var11.method3839(true);
        } else {
            var13 = arg6.method2861(var11, arg7, arg1);
        }
        if (this.field1777 >= 0) {
            var13 = var13.method3838(arg2, arg3, arg4, arg5, false, this.field1777);
        }
        return var13;
    }

    @ObfuscatedName("ez.z(III)Lga;")
    public final class192 method2720(int arg0, int arg1) {
        class192 var3 = null;
        if (this.field1766 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field1765 == null) {
                return null;
            }
            boolean var4 = this.field1792;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field1765.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field1765[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class192) field1760.method3987((long) var7);
                if (var3 == null) {
                    var3 = class192.method3422(Statics.field1758, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method3419();
                    }
                    field1760.method3988(var3, (long) var7);
                }
                if (var5 > 1) {
                    field1782[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class192(field1782, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field1766.length; var9++) {
                if (this.field1766[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field1765[var8];
            boolean var11 = this.field1792 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class192) field1760.method3987((long) var10);
            if (var3 == null) {
                var3 = class192.method3422(Statics.field1758, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method3419();
                }
                field1760.method3988(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field1789 == 128 && this.field1790 == 128 && this.field1778 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field1764 == 0 && this.field1793 == 0 && this.field1805 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class192 var14 = new class192(var3, arg1 == 0 && !var12 && !var13, this.field1768 == null, this.field1770 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method3406(256);
            var14.method3473(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method3415();
        } else if (var15 == 2) {
            var14.method3416();
        } else if (var15 == 3) {
            var14.method3417();
        }
        if (this.field1768 != null) {
            for (int var16 = 0; var16 < this.field1768.length; var16++) {
                var14.method3420(this.field1768[var16], this.field1769[var16]);
            }
        }
        if (this.field1770 != null) {
            for (int var17 = 0; var17 < this.field1770.length; var17++) {
                var14.method3474(this.field1770[var17], this.field1771[var17]);
            }
        }
        if (var12) {
            var14.method3423(this.field1789, this.field1790, this.field1778);
        }
        if (var13) {
            var14.method3473(this.field1764, this.field1793, this.field1805);
        }
        return var14;
    }

    @ObfuscatedName("ez.b(B)Lez;")
    public final class155 method2712() {
        int var1 = -1;
        if (this.field1799 != -1) {
            var1 = class243.method1005(this.field1799);
        } else if (this.field1763 != -1) {
            var1 = class243.field2924[this.field1763];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1798.length - 1) {
            var2 = this.field1798[var1];
        } else {
            var2 = this.field1798[this.field1798.length - 1];
        }
        return var2 == -1 ? null : method1864(var2);
    }

    @ObfuscatedName("ez.i(III)I")
    public int method2713(int arg0, int arg1) {
        class362 var3 = this.field1807;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class352 var5 = (class352) var3.method5668((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field3934;
            }
        }
        return var4;
    }

    @ObfuscatedName("ez.k(ILjava/lang/String;B)Ljava/lang/String;")
    public String method2714(int arg0, String arg1) {
        return class144.method2439(this.field1807, arg0, arg1);
    }

    @ObfuscatedName("fl.g(I)V")
    public static void method2932() {
        field1759.method3989();
        field1760.method3989();
        field1761.method3989();
        field1762.method3989();
    }

    @ObfuscatedName("ez.t(B)Z")
    public boolean method2715() {
        if (this.field1798 == null) {
            return this.field1806 != -1 || this.field1801 != null;
        }
        for (int var1 = 0; var1 < this.field1798.length; var1++) {
            if (this.field1798[var1] != -1) {
                class155 var2 = method1864(this.field1798[var1]);
                if (var2.field1806 != -1 || var2.field1801 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
