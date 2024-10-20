package deob;

@ObfuscatedName("eg")
public class class154 extends class347 {

    @ObfuscatedName("eg.v")
    public static boolean field1758 = false;

    @ObfuscatedName("eg.y")
    public static class221 field1755 = new class221(4096);

    @ObfuscatedName("eg.p")
    public static class221 field1769 = new class221(500);

    @ObfuscatedName("eg.j")
    public static class221 field1757 = new class221(30);

    @ObfuscatedName("eg.r")
    public static class221 field1779 = new class221(30);

    @ObfuscatedName("eg.b")
    public static class191[] field1759 = new class191[4];

    @ObfuscatedName("eg.d")
    public int field1760;

    @ObfuscatedName("eg.s")
    public int[] field1787;

    @ObfuscatedName("eg.u")
    public int[] field1761;

    @ObfuscatedName("eg.l")
    public String field1763 = class268.field3242;

    @ObfuscatedName("eg.o")
    public short[] field1764;

    @ObfuscatedName("eg.c")
    public short[] field1753;

    @ObfuscatedName("eg.e")
    public short[] field1766;

    @ObfuscatedName("eg.g")
    public short[] field1785;

    @ObfuscatedName("eg.a")
    public int field1791 = 1;

    @ObfuscatedName("eg.k")
    public int field1803 = 1;

    @ObfuscatedName("eg.m")
    public int field1770 = 2;

    @ObfuscatedName("eg.x")
    public boolean field1789 = true;

    @ObfuscatedName("eg.z")
    public int field1772 = -1;

    @ObfuscatedName("eg.w")
    public int field1773 = -1;

    @ObfuscatedName("eg.t")
    public boolean field1774 = false;

    @ObfuscatedName("eg.h")
    public boolean field1768 = false;

    @ObfuscatedName("eg.q")
    public int field1776 = -1;

    @ObfuscatedName("eg.i")
    public int field1762 = 16;

    @ObfuscatedName("eg.ae")
    public int field1778 = 0;

    @ObfuscatedName("eg.ap")
    public int field1797 = 0;

    @ObfuscatedName("eg.ab")
    public String[] field1780 = new String[5];

    @ObfuscatedName("eg.al")
    public int field1767 = -1;

    @ObfuscatedName("eg.ad")
    public int field1782 = -1;

    @ObfuscatedName("eg.ai")
    public boolean field1783 = false;

    @ObfuscatedName("eg.ar")
    public boolean field1784 = true;

    @ObfuscatedName("eg.ag")
    public int field1788 = 128;

    @ObfuscatedName("eg.ax")
    public int field1786 = 128;

    @ObfuscatedName("eg.as")
    public int field1756 = 128;

    @ObfuscatedName("eg.aj")
    public int field1771 = 0;

    @ObfuscatedName("eg.am")
    public int field1792 = 0;

    @ObfuscatedName("eg.az")
    public int field1790 = 0;

    @ObfuscatedName("eg.av")
    public boolean field1795 = false;

    @ObfuscatedName("eg.ac")
    public boolean field1765 = false;

    @ObfuscatedName("eg.at")
    public int field1793 = -1;

    @ObfuscatedName("eg.ah")
    public int[] field1794;

    @ObfuscatedName("eg.ao")
    public int field1777 = -1;

    @ObfuscatedName("eg.aq")
    public int field1796 = -1;

    @ObfuscatedName("eg.aw")
    public int field1781 = -1;

    @ObfuscatedName("eg.af")
    public int field1798 = 0;

    @ObfuscatedName("eg.ak")
    public int field1799 = 0;

    @ObfuscatedName("eg.ay")
    public int field1800 = 0;

    @ObfuscatedName("eg.aa")
    public int[] field1801;

    @ObfuscatedName("eg.au")
    public boolean field1802 = true;

    @ObfuscatedName("eg.an")
    public class361 field1775;

    @ObfuscatedName("h.v(II)Leg;")
    public static class154 method175(int arg0) {
        class154 var1 = (class154) field1755.method3948((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1754.method4468(6, arg0);
        class154 var3 = new class154();
        var3.field1760 = arg0;
        if (var2 != null) {
            var3.method2713(new class383(var2));
        }
        var3.method2712();
        if (var3.field1765) {
            var3.field1770 = 0;
            var3.field1789 = false;
        }
        field1755.method3947(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("eg.n(B)V")
    public void method2712() {
        if (this.field1772 == -1) {
            this.field1772 = 0;
            if (this.field1787 != null && (this.field1761 == null || this.field1761[0] == 10)) {
                this.field1772 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field1780[var1] != null) {
                    this.field1772 = 1;
                }
            }
        }
        if (this.field1793 == -1) {
            this.field1793 = this.field1770 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("eg.f(Lnd;B)V")
    public void method2713(class383 arg0) {
        while (true) {
            int var2 = arg0.method5965();
            if (var2 == 0) {
                return;
            }
            this.method2714(arg0, var2);
        }
    }

    @ObfuscatedName("eg.y(Lnd;II)V")
    public void method2714(class383 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5965();
            if (var3 > 0) {
                if (this.field1787 == null || field1758) {
                    this.field1761 = new int[var3];
                    this.field1787 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field1787[var4] = arg0.method5967();
                        this.field1761[var4] = arg0.method5965();
                    }
                } else {
                    arg0.field4158 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field1763 = arg0.method5974();
        } else if (arg1 == 5) {
            int var5 = arg0.method5965();
            if (var5 > 0) {
                if (this.field1787 == null || field1758) {
                    this.field1761 = null;
                    this.field1787 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1787[var6] = arg0.method5967();
                    }
                } else {
                    arg0.field4158 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field1791 = arg0.method5965();
        } else if (arg1 == 15) {
            this.field1803 = arg0.method5965();
        } else if (arg1 == 17) {
            this.field1770 = 0;
            this.field1789 = false;
        } else if (arg1 == 18) {
            this.field1789 = false;
        } else if (arg1 == 19) {
            this.field1772 = arg0.method5965();
        } else if (arg1 == 21) {
            this.field1773 = 0;
        } else if (arg1 == 22) {
            this.field1774 = true;
        } else if (arg1 == 23) {
            this.field1768 = true;
        } else if (arg1 == 24) {
            this.field1776 = arg0.method5967();
            if (this.field1776 == 65535) {
                this.field1776 = -1;
            }
        } else if (arg1 == 27) {
            this.field1770 = 1;
        } else if (arg1 == 28) {
            this.field1762 = arg0.method5965();
        } else if (arg1 == 29) {
            this.field1778 = arg0.method5966();
        } else if (arg1 == 39) {
            this.field1797 = arg0.method5966() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1780[arg1 - 30] = arg0.method5974();
            if (this.field1780[arg1 - 30].equalsIgnoreCase(class268.field3237)) {
                this.field1780[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method5965();
            this.field1764 = new short[var7];
            this.field1753 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1764[var8] = (short) arg0.method5967();
                this.field1753[var8] = (short) arg0.method5967();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method5965();
            this.field1766 = new short[var9];
            this.field1785 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1766[var10] = (short) arg0.method5967();
                this.field1785[var10] = (short) arg0.method5967();
            }
        } else if (arg1 == 62) {
            this.field1783 = true;
        } else if (arg1 == 64) {
            this.field1784 = false;
        } else if (arg1 == 65) {
            this.field1788 = arg0.method5967();
        } else if (arg1 == 66) {
            this.field1786 = arg0.method5967();
        } else if (arg1 == 67) {
            this.field1756 = arg0.method5967();
        } else if (arg1 == 68) {
            this.field1782 = arg0.method5967();
        } else if (arg1 == 69) {
            arg0.method5965();
        } else if (arg1 == 70) {
            this.field1771 = arg0.method6102();
        } else if (arg1 == 71) {
            this.field1792 = arg0.method6102();
        } else if (arg1 == 72) {
            this.field1790 = arg0.method6102();
        } else if (arg1 == 73) {
            this.field1795 = true;
        } else if (arg1 == 74) {
            this.field1765 = true;
        } else if (arg1 == 75) {
            this.field1793 = arg0.method5965();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field1777 = arg0.method5967();
            if (this.field1777 == 65535) {
                this.field1777 = -1;
            }
            this.field1796 = arg0.method5967();
            if (this.field1796 == 65535) {
                this.field1796 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method5967();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method5965();
            this.field1794 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field1794[var15] = arg0.method5967();
                if (this.field1794[var15] == 65535) {
                    this.field1794[var15] = -1;
                }
            }
            this.field1794[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field1781 = arg0.method5967();
            this.field1798 = arg0.method5965();
        } else if (arg1 == 79) {
            this.field1799 = arg0.method5967();
            this.field1800 = arg0.method5967();
            this.field1798 = arg0.method5965();
            int var11 = arg0.method5965();
            this.field1801 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1801[var12] = arg0.method5967();
            }
        } else if (arg1 == 81) {
            this.field1773 = arg0.method5965() * 256;
        } else if (arg1 == 82) {
            this.field1767 = arg0.method5967();
        } else if (arg1 == 89) {
            this.field1802 = false;
        } else if (arg1 == 249) {
            this.field1775 = class143.method4696(arg0, this.field1775);
        }
    }

    @ObfuscatedName("eg.p(II)Z")
    public final boolean method2715(int arg0) {
        if (this.field1761 != null) {
            for (int var4 = 0; var4 < this.field1761.length; var4++) {
                if (this.field1761[var4] == arg0) {
                    return Statics.field3779.method4470(this.field1787[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field1787 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field1787.length; var3++) {
                var2 &= Statics.field3779.method4470(this.field1787[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eg.j(I)Z")
    public final boolean method2766() {
        if (this.field1787 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1787.length; var2++) {
            var1 &= Statics.field3779.method4470(this.field1787[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("eg.r(II[[IIIIB)Lgl;")
    public final class199 method2717(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field1761 == null) {
            var7 = (long) ((this.field1760 << 10) + arg1);
        } else {
            var7 = (long) ((this.field1760 << 10) + (arg0 << 3) + arg1);
        }
        class199 var9 = (class199) field1757.method3948(var7);
        if (var9 == null) {
            class191 var10 = this.method2765(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field1774) {
                var10.field2189 = (short) (this.field1778 + 64);
                var10.field2190 = (short) (this.field1797 + 768);
                var10.method3417();
                var9 = var10;
            } else {
                var9 = var10.method3421(this.field1778 + 64, this.field1797 + 768, -50, -10, -50);
            }
            field1757.method3947(var9, var7);
        }
        if (this.field1774) {
            var9 = ((class191) var9).method3406();
        }
        if (this.field1773 >= 0) {
            if (var9 instanceof class205) {
                var9 = ((class205) var9).method3786(arg2, arg3, arg4, arg5, true, this.field1773);
            } else if (var9 instanceof class191) {
                var9 = ((class191) var9).method3407(arg2, arg3, arg4, arg5, true, this.field1773);
            }
        }
        return var9;
    }

    @ObfuscatedName("eg.b(II[[IIIII)Lgr;")
    public final class205 method2718(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field1761 == null) {
            var7 = (long) ((this.field1760 << 10) + arg1);
        } else {
            var7 = (long) ((this.field1760 << 10) + (arg0 << 3) + arg1);
        }
        class205 var9 = (class205) field1779.method3948(var7);
        if (var9 == null) {
            class191 var10 = this.method2765(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3421(this.field1778 + 64, this.field1797 + 768, -50, -10, -50);
            field1779.method3947(var9, var7);
        }
        if (this.field1773 >= 0) {
            var9 = var9.method3786(arg2, arg3, arg4, arg5, true, this.field1773);
        }
        return var9;
    }

    @ObfuscatedName("eg.d(II[[IIIILfl;II)Lgr;")
    public final class205 method2759(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class157 arg6, int arg7) {
        long var9;
        if (this.field1761 == null) {
            var9 = (long) ((this.field1760 << 10) + arg1);
        } else {
            var9 = (long) ((this.field1760 << 10) + (arg0 << 3) + arg1);
        }
        class205 var11 = (class205) field1779.method3948(var9);
        if (var11 == null) {
            class191 var12 = this.method2765(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method3421(this.field1778 + 64, this.field1797 + 768, -50, -10, -50);
            field1779.method3947(var11, var9);
        }
        if (arg6 == null && this.field1773 == -1) {
            return var11;
        }
        class205 var13;
        if (arg6 == null) {
            var13 = var11.method3787(true);
        } else {
            var13 = arg6.method2870(var11, arg7, arg1);
        }
        if (this.field1773 >= 0) {
            var13 = var13.method3786(arg2, arg3, arg4, arg5, false, this.field1773);
        }
        return var13;
    }

    @ObfuscatedName("eg.s(III)Lgm;")
    public final class191 method2765(int arg0, int arg1) {
        class191 var3 = null;
        if (this.field1761 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field1787 == null) {
                return null;
            }
            boolean var4 = this.field1783;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field1787.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field1787[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class191) field1769.method3948((long) var7);
                if (var3 == null) {
                    var3 = class191.method3418(Statics.field3779, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method3415();
                    }
                    field1769.method3947(var3, (long) var7);
                }
                if (var5 > 1) {
                    field1759[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class191(field1759, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field1761.length; var9++) {
                if (this.field1761[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field1787[var8];
            boolean var11 = this.field1783 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class191) field1769.method3948((long) var10);
            if (var3 == null) {
                var3 = class191.method3418(Statics.field3779, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method3415();
                }
                field1769.method3947(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field1788 == 128 && this.field1786 == 128 && this.field1756 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field1771 == 0 && this.field1792 == 0 && this.field1790 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class191 var14 = new class191(var3, arg1 == 0 && !var12 && !var13, this.field1764 == null, this.field1766 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method3422(256);
            var14.method3425(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method3409();
        } else if (var15 == 2) {
            var14.method3475();
        } else if (var15 == 3) {
            var14.method3411();
        }
        if (this.field1764 != null) {
            for (int var16 = 0; var16 < this.field1764.length; var16++) {
                var14.method3414(this.field1764[var16], this.field1753[var16]);
            }
        }
        if (this.field1766 != null) {
            for (int var17 = 0; var17 < this.field1766.length; var17++) {
                var14.method3412(this.field1766[var17], this.field1785[var17]);
            }
        }
        if (var12) {
            var14.method3440(this.field1788, this.field1786, this.field1756);
        }
        if (var13) {
            var14.method3425(this.field1771, this.field1792, this.field1790);
        }
        return var14;
    }

    @ObfuscatedName("eg.u(I)Leg;")
    public final class154 method2720() {
        int var1 = -1;
        if (this.field1777 != -1) {
            var1 = class242.method3569(this.field1777);
        } else if (this.field1796 != -1) {
            var1 = class242.field2918[this.field1796];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1794.length - 1) {
            var2 = this.field1794[var1];
        } else {
            var2 = this.field1794[this.field1794.length - 1];
        }
        return var2 == -1 ? null : method175(var2);
    }

    @ObfuscatedName("eg.l(III)I")
    public int method2716(int arg0, int arg1) {
        return class143.method1790(this.field1775, arg0, arg1);
    }

    @ObfuscatedName("eg.o(ILjava/lang/String;I)Ljava/lang/String;")
    public String method2722(int arg0, String arg1) {
        return class143.method5166(this.field1775, arg0, arg1);
    }

    @ObfuscatedName("q.c(I)V")
    public static void method179() {
        field1755.method3957();
        field1769.method3957();
        field1757.method3957();
        field1779.method3957();
    }

    @ObfuscatedName("eg.e(B)Z")
    public boolean method2724() {
        if (this.field1794 == null) {
            return this.field1781 != -1 || this.field1801 != null;
        }
        for (int var1 = 0; var1 < this.field1794.length; var1++) {
            if (this.field1794[var1] != -1) {
                class154 var2 = method175(this.field1794[var1]);
                if (var2.field1781 != -1 || var2.field1801 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
