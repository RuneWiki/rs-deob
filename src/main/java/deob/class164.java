package deob;

@ObfuscatedName("fr")
public class class164 extends class387 {

    @ObfuscatedName("fr.e")
    public static class249 field1760 = new class249(256);

    @ObfuscatedName("fr.r")
    public final int field1764;

    @ObfuscatedName("fr.o")
    public int field1765 = -1;

    @ObfuscatedName("fr.i")
    public int field1766 = -1;

    @ObfuscatedName("fr.w")
    public String field1782;

    @ObfuscatedName("fr.v")
    public int field1768;

    @ObfuscatedName("fr.a")
    public int field1779 = 0;

    @ObfuscatedName("fr.u")
    public boolean field1770 = true;

    @ObfuscatedName("fr.h")
    public boolean field1774 = false;

    @ObfuscatedName("fr.q")
    public String[] field1772 = new String[5];

    @ObfuscatedName("fr.x")
    public String field1773;

    @ObfuscatedName("fr.p")
    public int[] field1771;

    @ObfuscatedName("fr.n")
    public int field1763 = Integer.MAX_VALUE;

    @ObfuscatedName("fr.m")
    public int field1776 = Integer.MAX_VALUE;

    @ObfuscatedName("fr.d")
    public int field1777 = Integer.MIN_VALUE;

    @ObfuscatedName("fr.j")
    public int field1778 = Integer.MIN_VALUE;

    @ObfuscatedName("fr.f")
    public class170 field1767 = class170.field1842;

    @ObfuscatedName("fr.g")
    public class172 field1780 = class172.field1886;

    @ObfuscatedName("fr.t")
    public int[] field1781;

    @ObfuscatedName("fr.k")
    public byte[] field1769;

    @ObfuscatedName("fr.b")
    public int field1783 = -1;

    public class164(int arg0) {
        this.field1764 = arg0;
    }

    @ObfuscatedName("dx.c(II)Lfr;")
    public static class164 method2597(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1761.length || Statics.field1761[arg0] == null ? new class164(arg0) : Statics.field1761[arg0];
    }

    @ObfuscatedName("fr.l(Lpi;B)V")
    public void method2852(class421 arg0) {
        while (true) {
            int var2 = arg0.method6686();
            if (var2 == 0) {
                return;
            }
            this.method2870(arg0, var2);
        }
    }

    @ObfuscatedName("fr.s(Lpi;II)V")
    public void method2870(class421 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1765 = arg0.method6649();
        } else if (arg1 == 2) {
            this.field1766 = arg0.method6649();
        } else if (arg1 == 3) {
            this.field1782 = arg0.method6674();
        } else if (arg1 == 4) {
            this.field1768 = arg0.method6668();
        } else if (arg1 == 5) {
            arg0.method6668();
        } else if (arg1 == 6) {
            this.field1779 = arg0.method6686();
        } else if (arg1 == 7) {
            int var3 = arg0.method6686();
            if ((var3 & 0x1) == 0) {
                this.field1770 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1774 = true;
            }
        } else if (arg1 == 8) {
            arg0.method6686();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1772[arg1 - 10] = arg0.method6674();
        } else if (arg1 == 15) {
            int var4 = arg0.method6686();
            this.field1771 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1771[var5] = arg0.method6830();
            }
            arg0.method6669();
            int var6 = arg0.method6686();
            this.field1781 = new int[var6];
            for (int var7 = 0; var7 < this.field1781.length; var7++) {
                this.field1781[var7] = arg0.method6669();
            }
            this.field1769 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1769[var8] = arg0.method6664();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1773 = arg0.method6674();
            } else if (arg1 == 18) {
                arg0.method6649();
            } else if (arg1 == 19) {
                this.field1783 = arg0.method6666();
            } else if (arg1 == 21) {
                arg0.method6669();
            } else if (arg1 == 22) {
                arg0.method6669();
            } else if (arg1 == 23) {
                arg0.method6686();
                arg0.method6686();
                arg0.method6686();
            } else if (arg1 == 24) {
                arg0.method6830();
                arg0.method6830();
            } else if (arg1 == 25) {
                arg0.method6649();
            } else if (arg1 == 28) {
                arg0.method6686();
            } else if (arg1 == 29) {
                class170[] var9 = new class170[] { class170.field1845, class170.field1842, class170.field1843 };
                this.field1767 = (class170) class321.method2696(var9, arg0.method6686());
            } else if (arg1 == 30) {
                this.field1780 = (class172) class321.method2696(class172.method318(), arg0.method6686());
            }
        }
    }

    @ObfuscatedName("fr.e(B)V")
    public void method2854() {
        if (this.field1771 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1771.length; var1 += 2) {
            if (this.field1771[var1] < this.field1763) {
                this.field1763 = this.field1771[var1];
            } else if (this.field1771[var1] > this.field1777) {
                this.field1777 = this.field1771[var1];
            }
            if (this.field1771[var1 + 1] < this.field1776) {
                this.field1776 = this.field1771[var1 + 1];
            } else if (this.field1771[var1 + 1] > this.field1778) {
                this.field1778 = this.field1771[var1 + 1];
            }
        }
    }

    @ObfuscatedName("fr.r(ZI)Lpt;")
    public class434 method2855(boolean arg0) {
        int var2 = arg0 ? this.field1766 : this.field1765;
        return this.method2881(var2);
    }

    @ObfuscatedName("fr.o(II)Lpt;")
    public class434 method2881(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class434 var2 = (class434) field1760.method4472((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class434 var3 = class435.method2593(Statics.field1775, arg0, 0);
        if (var3 != null) {
            field1760.method4482(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("fr.i(I)I")
    public int method2873() {
        return this.field1764;
    }
}
