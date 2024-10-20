package deob;

@ObfuscatedName("fg")
public class class161 extends class365 {

    @ObfuscatedName("fg.f")
    public static class236 field1713 = new class236(64);

    @ObfuscatedName("fg.j")
    public static class236 field1712 = new class236(50);

    @ObfuscatedName("fg.m")
    public int field1715;

    @ObfuscatedName("fg.k")
    public String field1716 = class283.field3360;

    @ObfuscatedName("fg.t")
    public int field1717 = 1;

    @ObfuscatedName("fg.a")
    public int[] field1736;

    @ObfuscatedName("fg.e")
    public int[] field1719;

    @ObfuscatedName("fg.i")
    public int field1720 = -1;

    @ObfuscatedName("fg.y")
    public int field1743 = -1;

    @ObfuscatedName("fg.w")
    public int field1722 = -1;

    @ObfuscatedName("fg.g")
    public int field1723 = -1;

    @ObfuscatedName("fg.v")
    public int field1724 = -1;

    @ObfuscatedName("fg.s")
    public int field1721 = -1;

    @ObfuscatedName("fg.c")
    public int field1726 = -1;

    @ObfuscatedName("fg.b")
    public short[] field1727;

    @ObfuscatedName("fg.x")
    public short[] field1714;

    @ObfuscatedName("fg.p")
    public short[] field1729;

    @ObfuscatedName("fg.z")
    public short[] field1730;

    @ObfuscatedName("fg.h")
    public String[] field1741 = new String[5];

    @ObfuscatedName("fg.o")
    public boolean field1732 = true;

    @ObfuscatedName("fg.r")
    public int field1733 = -1;

    @ObfuscatedName("fg.n")
    public int field1725 = 128;

    @ObfuscatedName("fg.u")
    public int field1735 = 128;

    @ObfuscatedName("fg.d")
    public boolean field1728 = false;

    @ObfuscatedName("fg.ab")
    public int field1718 = 0;

    @ObfuscatedName("fg.ad")
    public int field1734 = 0;

    @ObfuscatedName("fg.as")
    public int field1739 = -1;

    @ObfuscatedName("fg.ak")
    public int field1740 = 32;

    @ObfuscatedName("fg.ah")
    public int[] field1738;

    @ObfuscatedName("fg.ay")
    public int field1742 = -1;

    @ObfuscatedName("fg.al")
    public int field1737 = -1;

    @ObfuscatedName("fg.ao")
    public boolean field1744 = true;

    @ObfuscatedName("fg.au")
    public boolean field1745 = true;

    @ObfuscatedName("fg.aa")
    public boolean field1746 = false;

    @ObfuscatedName("fg.ag")
    public class379 field1747;

    @ObfuscatedName("dz.l(Lkl;Lkl;I)V")
    public static void method2485(class290 arg0, class290 arg1) {
        Statics.field3747 = arg0;
        Statics.field1731 = arg1;
    }

    @ObfuscatedName("dl.q(II)Lfg;")
    public static class161 method2362(int arg0) {
        class161 var1 = (class161) field1713.method4223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3747.method4756(9, arg0);
        class161 var3 = new class161();
        var3.field1715 = arg0;
        if (var2 != null) {
            var3.method2767(new class401(var2));
        }
        var3.method2765();
        field1713.method4225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fg.f(I)V")
    public void method2765() {
    }

    @ObfuscatedName("fg.j(Lot;I)V")
    public void method2767(class401 arg0) {
        while (true) {
            int var2 = arg0.method6272();
            if (var2 == 0) {
                return;
            }
            this.method2768(arg0, var2);
        }
    }

    @ObfuscatedName("fg.m(Lot;IB)V")
    public void method2768(class401 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method6272();
            this.field1736 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1736[var4] = arg0.method6284();
            }
        } else if (arg1 == 2) {
            this.field1716 = arg0.method6474();
        } else if (arg1 == 12) {
            this.field1717 = arg0.method6272();
        } else if (arg1 == 13) {
            this.field1720 = arg0.method6284();
        } else if (arg1 == 14) {
            this.field1723 = arg0.method6284();
        } else if (arg1 == 15) {
            this.field1743 = arg0.method6284();
        } else if (arg1 == 16) {
            this.field1722 = arg0.method6284();
        } else if (arg1 == 17) {
            this.field1723 = arg0.method6284();
            this.field1724 = arg0.method6284();
            this.field1721 = arg0.method6284();
            this.field1726 = arg0.method6284();
        } else if (arg1 == 18) {
            arg0.method6284();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1741[arg1 - 30] = arg0.method6474();
            if (this.field1741[arg1 - 30].equalsIgnoreCase(class283.field3329)) {
                this.field1741[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method6272();
            this.field1727 = new short[var5];
            this.field1714 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1727[var6] = (short) arg0.method6284();
                this.field1714[var6] = (short) arg0.method6284();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method6272();
            this.field1729 = new short[var7];
            this.field1730 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1729[var8] = (short) arg0.method6284();
                this.field1730[var8] = (short) arg0.method6284();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method6272();
            this.field1719 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1719[var10] = arg0.method6284();
            }
        } else if (arg1 == 93) {
            this.field1732 = false;
        } else if (arg1 == 95) {
            this.field1733 = arg0.method6284();
        } else if (arg1 == 97) {
            this.field1725 = arg0.method6284();
        } else if (arg1 == 98) {
            this.field1735 = arg0.method6284();
        } else if (arg1 == 99) {
            this.field1728 = true;
        } else if (arg1 == 100) {
            this.field1718 = arg0.method6273();
        } else if (arg1 == 101) {
            this.field1734 = arg0.method6273();
        } else if (arg1 == 102) {
            this.field1739 = arg0.method6284();
        } else if (arg1 == 103) {
            this.field1740 = arg0.method6284();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field1742 = arg0.method6284();
            if (this.field1742 == 65535) {
                this.field1742 = -1;
            }
            this.field1737 = arg0.method6284();
            if (this.field1737 == 65535) {
                this.field1737 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method6284();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method6272();
            this.field1738 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field1738[var13] = arg0.method6284();
                if (this.field1738[var13] == 65535) {
                    this.field1738[var13] = -1;
                }
            }
            this.field1738[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field1744 = false;
        } else if (arg1 == 109) {
            this.field1745 = false;
        } else if (arg1 == 111) {
            this.field1746 = true;
        } else if (arg1 == 249) {
            this.field1747 = class158.method360(arg0, this.field1747);
        }
    }

    @ObfuscatedName("fg.k(Lfe;ILfe;IB)Lhl;")
    public final class220 method2769(class172 arg0, int arg1, class172 arg2, int arg3) {
        if (this.field1738 != null) {
            class161 var5 = this.method2771();
            return var5 == null ? null : var5.method2769(arg0, arg1, arg2, arg3);
        }
        class220 var6 = (class220) field1712.method4223((long) this.field1715);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1736.length; var8++) {
                if (!Statics.field1731.method4758(this.field1736[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class206[] var9 = new class206[this.field1736.length];
            for (int var10 = 0; var10 < this.field1736.length; var10++) {
                var9[var10] = class206.method3692(Statics.field1731, this.field1736[var10], 0);
            }
            class206 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class206(var9, var9.length);
            }
            if (this.field1727 != null) {
                for (int var12 = 0; var12 < this.field1727.length; var12++) {
                    var11.method3663(this.field1727[var12], this.field1714[var12]);
                }
            }
            if (this.field1729 != null) {
                for (int var13 = 0; var13 < this.field1729.length; var13++) {
                    var11.method3664(this.field1729[var13], this.field1730[var13]);
                }
            }
            var6 = var11.method3671(this.field1718 + 64, this.field1734 * 5 + 850, -30, -50, -30);
            field1712.method4225(var6, (long) this.field1715);
        }
        class220 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3096(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3093(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method4062(true);
        } else {
            var14 = arg2.method3093(var6, arg3);
        }
        if (this.field1725 != 128 || this.field1735 != 128) {
            var14.method4068(this.field1725, this.field1735, this.field1725);
        }
        return var14;
    }

    @ObfuscatedName("fg.t(B)Lgi;")
    public final class206 method2790() {
        if (this.field1738 != null) {
            class161 var1 = this.method2771();
            return var1 == null ? null : var1.method2790();
        } else if (this.field1719 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field1719.length; var3++) {
                if (!Statics.field1731.method4758(this.field1719[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class206[] var4 = new class206[this.field1719.length];
            for (int var5 = 0; var5 < this.field1719.length; var5++) {
                var4[var5] = class206.method3692(Statics.field1731, this.field1719[var5], 0);
            }
            class206 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class206(var4, var4.length);
            }
            if (this.field1727 != null) {
                for (int var7 = 0; var7 < this.field1727.length; var7++) {
                    var6.method3663(this.field1727[var7], this.field1714[var7]);
                }
            }
            if (this.field1729 != null) {
                for (int var8 = 0; var8 < this.field1729.length; var8++) {
                    var6.method3664(this.field1729[var8], this.field1730[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("fg.a(I)Lfg;")
    public final class161 method2771() {
        int var1 = -1;
        if (this.field1742 != -1) {
            var1 = class257.method2185(this.field1742);
        } else if (this.field1737 != -1) {
            var1 = class257.field3009[this.field1737];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1738.length - 1) {
            var2 = this.field1738[var1];
        } else {
            var2 = this.field1738[this.field1738.length - 1];
        }
        return var2 == -1 ? null : method2362(var2);
    }

    @ObfuscatedName("fg.e(S)Z")
    public boolean method2797() {
        if (this.field1738 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field1742 != -1) {
            var1 = class257.method2185(this.field1742);
        } else if (this.field1737 != -1) {
            var1 = class257.field3009[this.field1737];
        }
        if (var1 >= 0 && var1 < this.field1738.length) {
            return this.field1738[var1] != -1;
        } else {
            return this.field1738[this.field1738.length - 1] != -1;
        }
    }

    @ObfuscatedName("fg.i(IIB)I")
    public int method2779(int arg0, int arg1) {
        class379 var3 = this.field1747;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class369 var5 = (class369) var3.method6049((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4074;
            }
        }
        return var4;
    }

    @ObfuscatedName("fg.y(ILjava/lang/String;I)Ljava/lang/String;")
    public String method2774(int arg0, String arg1) {
        class379 var3 = this.field1747;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class366 var5 = (class366) var3.method6049((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4071;
            }
        }
        return var4;
    }
}
