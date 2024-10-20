package deob;

@ObfuscatedName("fw")
public class class161 extends class365 {

    @ObfuscatedName("fw.s")
    public static class236 field1703 = new class236(64);

    @ObfuscatedName("fw.a")
    public static class236 field1705 = new class236(50);

    @ObfuscatedName("fw.o")
    public int field1729;

    @ObfuscatedName("fw.g")
    public String field1716 = class283.field3566;

    @ObfuscatedName("fw.e")
    public int field1707 = 1;

    @ObfuscatedName("fw.p")
    public int[] field1715;

    @ObfuscatedName("fw.j")
    public int[] field1723;

    @ObfuscatedName("fw.b")
    public int field1724 = -1;

    @ObfuscatedName("fw.x")
    public int field1711 = -1;

    @ObfuscatedName("fw.y")
    public int field1712 = -1;

    @ObfuscatedName("fw.k")
    public int field1713 = -1;

    @ObfuscatedName("fw.t")
    public int field1714 = -1;

    @ObfuscatedName("fw.l")
    public int field1736 = -1;

    @ObfuscatedName("fw.u")
    public int field1710 = -1;

    @ObfuscatedName("fw.n")
    public short[] field1717;

    @ObfuscatedName("fw.z")
    public short[] field1721;

    @ObfuscatedName("fw.q")
    public short[] field1719;

    @ObfuscatedName("fw.d")
    public short[] field1708;

    @ObfuscatedName("fw.r")
    public String[] field1732 = new String[5];

    @ObfuscatedName("fw.m")
    public boolean field1722 = true;

    @ObfuscatedName("fw.c")
    public int field1718 = -1;

    @ObfuscatedName("fw.f")
    public int field1720 = 128;

    @ObfuscatedName("fw.h")
    public int field1725 = 128;

    @ObfuscatedName("fw.v")
    public boolean field1726 = false;

    @ObfuscatedName("fw.ag")
    public int field1727 = 0;

    @ObfuscatedName("fw.ae")
    public int field1728 = 0;

    @ObfuscatedName("fw.aq")
    public int field1706 = -1;

    @ObfuscatedName("fw.al")
    public int field1704 = 32;

    @ObfuscatedName("fw.am")
    public int[] field1731;

    @ObfuscatedName("fw.ai")
    public int field1730 = -1;

    @ObfuscatedName("fw.ah")
    public int field1733 = -1;

    @ObfuscatedName("fw.as")
    public boolean field1734 = true;

    @ObfuscatedName("fw.at")
    public boolean field1735 = true;

    @ObfuscatedName("fw.az")
    public boolean field1709 = false;

    @ObfuscatedName("fw.ac")
    public class379 field1737;

    @ObfuscatedName("bt.i(II)Lfw;")
    public static class161 method1044(int arg0) {
        class161 var1 = (class161) field1703.method4205((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1701.method4743(9, arg0);
        class161 var3 = new class161();
        var3.field1729 = arg0;
        if (var2 != null) {
            var3.method2835(new class401(var2));
        }
        var3.method2825();
        field1703.method4206(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fw.w(I)V")
    public void method2825() {
    }

    @ObfuscatedName("fw.s(Lop;I)V")
    public void method2835(class401 arg0) {
        while (true) {
            int var2 = arg0.method6240();
            if (var2 == 0) {
                return;
            }
            this.method2808(arg0, var2);
        }
    }

    @ObfuscatedName("fw.a(Lop;II)V")
    public void method2808(class401 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method6240();
            this.field1715 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1715[var4] = arg0.method6242();
            }
        } else if (arg1 == 2) {
            this.field1716 = arg0.method6335();
        } else if (arg1 == 12) {
            this.field1707 = arg0.method6240();
        } else if (arg1 == 13) {
            this.field1724 = arg0.method6242();
        } else if (arg1 == 14) {
            this.field1713 = arg0.method6242();
        } else if (arg1 == 15) {
            this.field1711 = arg0.method6242();
        } else if (arg1 == 16) {
            this.field1712 = arg0.method6242();
        } else if (arg1 == 17) {
            this.field1713 = arg0.method6242();
            this.field1714 = arg0.method6242();
            this.field1736 = arg0.method6242();
            this.field1710 = arg0.method6242();
        } else if (arg1 == 18) {
            arg0.method6242();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1732[arg1 - 30] = arg0.method6335();
            if (this.field1732[arg1 - 30].equalsIgnoreCase(class283.field3634)) {
                this.field1732[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method6240();
            this.field1717 = new short[var5];
            this.field1721 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1717[var6] = (short) arg0.method6242();
                this.field1721[var6] = (short) arg0.method6242();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method6240();
            this.field1719 = new short[var7];
            this.field1708 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1719[var8] = (short) arg0.method6242();
                this.field1708[var8] = (short) arg0.method6242();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method6240();
            this.field1723 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1723[var10] = arg0.method6242();
            }
        } else if (arg1 == 93) {
            this.field1722 = false;
        } else if (arg1 == 95) {
            this.field1718 = arg0.method6242();
        } else if (arg1 == 97) {
            this.field1720 = arg0.method6242();
        } else if (arg1 == 98) {
            this.field1725 = arg0.method6242();
        } else if (arg1 == 99) {
            this.field1726 = true;
        } else if (arg1 == 100) {
            this.field1727 = arg0.method6241();
        } else if (arg1 == 101) {
            this.field1728 = arg0.method6241();
        } else if (arg1 == 102) {
            this.field1706 = arg0.method6242();
        } else if (arg1 == 103) {
            this.field1704 = arg0.method6242();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field1730 = arg0.method6242();
            if (this.field1730 == 65535) {
                this.field1730 = -1;
            }
            this.field1733 = arg0.method6242();
            if (this.field1733 == 65535) {
                this.field1733 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method6242();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method6240();
            this.field1731 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field1731[var13] = arg0.method6242();
                if (this.field1731[var13] == 65535) {
                    this.field1731[var13] = -1;
                }
            }
            this.field1731[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field1734 = false;
        } else if (arg1 == 109) {
            this.field1735 = false;
        } else if (arg1 == 111) {
            this.field1709 = true;
        } else if (arg1 == 249) {
            this.field1737 = class158.method164(arg0, this.field1737);
        }
    }

    @ObfuscatedName("fw.o(Lfm;ILfm;IB)Lhl;")
    public final class220 method2806(class172 arg0, int arg1, class172 arg2, int arg3) {
        if (this.field1731 != null) {
            class161 var5 = this.method2813();
            return var5 == null ? null : var5.method2806(arg0, arg1, arg2, arg3);
        }
        class220 var6 = (class220) field1705.method4205((long) this.field1729);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1715.length; var8++) {
                if (!Statics.field1702.method4745(this.field1715[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class206[] var9 = new class206[this.field1715.length];
            for (int var10 = 0; var10 < this.field1715.length; var10++) {
                var9[var10] = class206.method3658(Statics.field1702, this.field1715[var10], 0);
            }
            class206 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class206(var9, var9.length);
            }
            if (this.field1717 != null) {
                for (int var12 = 0; var12 < this.field1717.length; var12++) {
                    var11.method3687(this.field1717[var12], this.field1721[var12]);
                }
            }
            if (this.field1719 != null) {
                for (int var13 = 0; var13 < this.field1719.length; var13++) {
                    var11.method3672(this.field1719[var13], this.field1708[var13]);
                }
            }
            var6 = var11.method3679(this.field1727 + 64, this.field1728 * 5 + 850, -30, -50, -30);
            field1705.method4206(var6, (long) this.field1729);
        }
        class220 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3118(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3115(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method4065(true);
        } else {
            var14 = arg2.method3115(var6, arg3);
        }
        if (this.field1720 != 128 || this.field1725 != 128) {
            var14.method4081(this.field1720, this.field1725, this.field1720);
        }
        return var14;
    }

    @ObfuscatedName("fw.g(B)Lgk;")
    public final class206 method2807() {
        if (this.field1731 != null) {
            class161 var1 = this.method2813();
            return var1 == null ? null : var1.method2807();
        } else if (this.field1723 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field1723.length; var3++) {
                if (!Statics.field1702.method4745(this.field1723[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class206[] var4 = new class206[this.field1723.length];
            for (int var5 = 0; var5 < this.field1723.length; var5++) {
                var4[var5] = class206.method3658(Statics.field1702, this.field1723[var5], 0);
            }
            class206 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class206(var4, var4.length);
            }
            if (this.field1717 != null) {
                for (int var7 = 0; var7 < this.field1717.length; var7++) {
                    var6.method3687(this.field1717[var7], this.field1721[var7]);
                }
            }
            if (this.field1719 != null) {
                for (int var8 = 0; var8 < this.field1719.length; var8++) {
                    var6.method3672(this.field1719[var8], this.field1708[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("fw.e(I)Lfw;")
    public final class161 method2813() {
        int var1 = -1;
        if (this.field1730 != -1) {
            var1 = class257.method2410(this.field1730);
        } else if (this.field1733 != -1) {
            var1 = class257.field3015[this.field1733];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1731.length - 1) {
            var2 = this.field1731[var1];
        } else {
            var2 = this.field1731[this.field1731.length - 1];
        }
        return var2 == -1 ? null : method1044(var2);
    }

    @ObfuscatedName("fw.p(I)Z")
    public boolean method2809() {
        if (this.field1731 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field1730 != -1) {
            var1 = class257.method2410(this.field1730);
        } else if (this.field1733 != -1) {
            var1 = class257.field3015[this.field1733];
        }
        if (var1 >= 0 && var1 < this.field1731.length) {
            return this.field1731[var1] != -1;
        } else {
            return this.field1731[this.field1731.length - 1] != -1;
        }
    }

    @ObfuscatedName("fw.j(III)I")
    public int method2810(int arg0, int arg1) {
        return class158.method2133(this.field1737, arg0, arg1);
    }

    @ObfuscatedName("fw.b(ILjava/lang/String;I)Ljava/lang/String;")
    public String method2811(int arg0, String arg1) {
        return class158.method2887(this.field1737, arg0, arg1);
    }
}
