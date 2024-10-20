package deob;

@ObfuscatedName("fj")
public class class164 extends class382 {

    @ObfuscatedName("fj.m")
    public static class249 field1752 = new class249(256);

    @ObfuscatedName("fj.t")
    public final int field1753;

    @ObfuscatedName("fj.s")
    public int field1754 = -1;

    @ObfuscatedName("fj.j")
    public int field1755 = -1;

    @ObfuscatedName("fj.w")
    public String field1756;

    @ObfuscatedName("fj.n")
    public int field1757;

    @ObfuscatedName("fj.r")
    public int field1761 = 0;

    @ObfuscatedName("fj.v")
    public boolean field1759 = true;

    @ObfuscatedName("fj.d")
    public boolean field1760 = false;

    @ObfuscatedName("fj.h")
    public String[] field1758 = new String[5];

    @ObfuscatedName("fj.g")
    public String field1773;

    @ObfuscatedName("fj.e")
    public int[] field1763;

    @ObfuscatedName("fj.a")
    public int field1771 = Integer.MAX_VALUE;

    @ObfuscatedName("fj.u")
    public int field1765 = Integer.MAX_VALUE;

    @ObfuscatedName("fj.k")
    public int field1764 = Integer.MIN_VALUE;

    @ObfuscatedName("fj.f")
    public int field1767 = Integer.MIN_VALUE;

    @ObfuscatedName("fj.l")
    public class170 field1768 = class170.field1826;

    @ObfuscatedName("fj.q")
    public class172 field1769 = class172.field1877;

    @ObfuscatedName("fj.x")
    public int[] field1750;

    @ObfuscatedName("fj.z")
    public byte[] field1770;

    @ObfuscatedName("fj.i")
    public int field1772 = -1;

    public class164(int arg0) {
        this.field1753 = arg0;
    }

    @ObfuscatedName("ce.c(IB)Lfj;")
    public static class164 method2044(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1751.length || Statics.field1751[arg0] == null ? new class164(arg0) : Statics.field1751[arg0];
    }

    @ObfuscatedName("fj.b(Lpi;B)V")
    public void method2872(class419 arg0) {
        while (true) {
            int var2 = arg0.method6781();
            if (var2 == 0) {
                return;
            }
            this.method2873(arg0, var2);
        }
    }

    @ObfuscatedName("fj.p(Lpi;IS)V")
    public void method2873(class419 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1754 = arg0.method6708();
        } else if (arg1 == 2) {
            this.field1755 = arg0.method6708();
        } else if (arg1 == 3) {
            this.field1756 = arg0.method6707();
        } else if (arg1 == 4) {
            this.field1757 = arg0.method6674();
        } else if (arg1 == 5) {
            arg0.method6674();
        } else if (arg1 == 6) {
            this.field1761 = arg0.method6781();
        } else if (arg1 == 7) {
            int var3 = arg0.method6781();
            if ((var3 & 0x1) == 0) {
                this.field1759 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1760 = true;
            }
        } else if (arg1 == 8) {
            arg0.method6781();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1758[arg1 - 10] = arg0.method6707();
        } else if (arg1 == 15) {
            int var4 = arg0.method6781();
            this.field1763 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1763[var5] = arg0.method6673();
            }
            arg0.method6675();
            int var6 = arg0.method6781();
            this.field1750 = new int[var6];
            for (int var7 = 0; var7 < this.field1750.length; var7++) {
                this.field1750[var7] = arg0.method6675();
            }
            this.field1770 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1770[var8] = arg0.method6846();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1773 = arg0.method6707();
            } else if (arg1 == 18) {
                arg0.method6708();
            } else if (arg1 == 19) {
                this.field1772 = arg0.method6672();
            } else if (arg1 == 21) {
                arg0.method6675();
            } else if (arg1 == 22) {
                arg0.method6675();
            } else if (arg1 == 23) {
                arg0.method6781();
                arg0.method6781();
                arg0.method6781();
            } else if (arg1 == 24) {
                arg0.method6673();
                arg0.method6673();
            } else if (arg1 == 25) {
                arg0.method6708();
            } else if (arg1 == 28) {
                arg0.method6781();
            } else if (arg1 == 29) {
                this.field1768 = (class170) class316.method2616(class170.method3423(), arg0.method6781());
            } else if (arg1 == 30) {
                this.field1769 = (class172) class316.method2616(class172.method643(), arg0.method6781());
            }
        }
    }

    @ObfuscatedName("fj.m(I)V")
    public void method2874() {
        if (this.field1763 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1763.length; var1 += 2) {
            if (this.field1763[var1] < this.field1771) {
                this.field1771 = this.field1763[var1];
            } else if (this.field1763[var1] > this.field1764) {
                this.field1764 = this.field1763[var1];
            }
            if (this.field1763[var1 + 1] < this.field1765) {
                this.field1765 = this.field1763[var1 + 1];
            } else if (this.field1763[var1 + 1] > this.field1767) {
                this.field1767 = this.field1763[var1 + 1];
            }
        }
    }

    @ObfuscatedName("fj.t(ZI)Lpl;")
    public class432 method2886(boolean arg0) {
        int var2 = arg0 ? this.field1755 : this.field1754;
        return this.method2894(var2);
    }

    @ObfuscatedName("fj.s(II)Lpl;")
    public class432 method2894(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class432 var2 = (class432) field1752.method4514((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class432 var3 = class433.method55(Statics.field1766, arg0, 0);
        if (var3 != null) {
            field1752.method4515(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("fj.j(B)I")
    public int method2875() {
        return this.field1753;
    }
}
