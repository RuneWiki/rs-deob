package deob;

@ObfuscatedName("fy")
public class class171 extends class406 {

    @ObfuscatedName("fy.v")
    public static class256 field1811 = new class256(256);

    @ObfuscatedName("fy.c")
    public final int field1814;

    @ObfuscatedName("fy.q")
    public int field1822 = -1;

    @ObfuscatedName("fy.i")
    public int field1816 = -1;

    @ObfuscatedName("fy.k")
    public String field1817;

    @ObfuscatedName("fy.o")
    public int field1818;

    @ObfuscatedName("fy.n")
    public int field1826 = 0;

    @ObfuscatedName("fy.a")
    public boolean field1821 = true;

    @ObfuscatedName("fy.m")
    public boolean field1830 = false;

    @ObfuscatedName("fy.u")
    public String[] field1813 = new String[5];

    @ObfuscatedName("fy.l")
    public String field1824;

    @ObfuscatedName("fy.z")
    public int[] field1825;

    @ObfuscatedName("fy.r")
    public int field1819 = Integer.MAX_VALUE;

    @ObfuscatedName("fy.y")
    public int field1827 = Integer.MAX_VALUE;

    @ObfuscatedName("fy.p")
    public int field1828 = Integer.MIN_VALUE;

    @ObfuscatedName("fy.e")
    public int field1829 = Integer.MIN_VALUE;

    @ObfuscatedName("fy.b")
    public class177 field1815 = class177.field1895;

    @ObfuscatedName("fy.x")
    public class179 field1831 = class179.field1948;

    @ObfuscatedName("fy.f")
    public int[] field1832;

    @ObfuscatedName("fy.t")
    public byte[] field1835;

    @ObfuscatedName("fy.j")
    public int field1834 = -1;

    public class171(int arg0) {
        this.field1814 = arg0;
    }

    @ObfuscatedName("fn.s(II)Lfy;")
    public static class171 method3061(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1833.length || Statics.field1833[arg0] == null ? new class171(arg0) : Statics.field1833[arg0];
    }

    @ObfuscatedName("fy.h(Lqr;I)V")
    public void method2959(class444 arg0) {
        while (true) {
            int var2 = arg0.method6929();
            if (var2 == 0) {
                return;
            }
            this.method2976(arg0, var2);
        }
    }

    @ObfuscatedName("fy.w(Lqr;II)V")
    public void method2976(class444 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1822 = arg0.method6945();
        } else if (arg1 == 2) {
            this.field1816 = arg0.method6945();
        } else if (arg1 == 3) {
            this.field1817 = arg0.method6975();
        } else if (arg1 == 4) {
            this.field1818 = arg0.method7095();
        } else if (arg1 == 5) {
            arg0.method7095();
        } else if (arg1 == 6) {
            this.field1826 = arg0.method6929();
        } else if (arg1 == 7) {
            int var3 = arg0.method6929();
            if ((var3 & 0x1) == 0) {
                this.field1821 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1830 = true;
            }
        } else if (arg1 == 8) {
            arg0.method6929();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1813[arg1 - 10] = arg0.method6975();
        } else if (arg1 == 15) {
            int var4 = arg0.method6929();
            this.field1825 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1825[var5] = arg0.method6932();
            }
            arg0.method6934();
            int var6 = arg0.method6929();
            this.field1832 = new int[var6];
            for (int var7 = 0; var7 < this.field1832.length; var7++) {
                this.field1832[var7] = arg0.method6934();
            }
            this.field1835 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1835[var8] = arg0.method6930();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1824 = arg0.method6975();
            } else if (arg1 == 18) {
                arg0.method6945();
            } else if (arg1 == 19) {
                this.field1834 = arg0.method7120();
            } else if (arg1 == 21) {
                arg0.method6934();
            } else if (arg1 == 22) {
                arg0.method6934();
            } else if (arg1 == 23) {
                arg0.method6929();
                arg0.method6929();
                arg0.method6929();
            } else if (arg1 == 24) {
                arg0.method6932();
                arg0.method6932();
            } else if (arg1 == 25) {
                arg0.method6945();
            } else if (arg1 == 28) {
                arg0.method6929();
            } else if (arg1 == 29) {
                this.field1815 = (class177) class330.method525(class177.method1926(), arg0.method6929());
            } else if (arg1 == 30) {
                class179[] var9 = new class179[] { class179.field1948, class179.field1949, class179.field1954 };
                this.field1831 = (class179) class330.method525(var9, arg0.method6929());
            }
        }
    }

    @ObfuscatedName("fy.v(B)V")
    public void method2960() {
        if (this.field1825 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1825.length; var1 += 2) {
            if (this.field1825[var1] < this.field1819) {
                this.field1819 = this.field1825[var1];
            } else if (this.field1825[var1] > this.field1828) {
                this.field1828 = this.field1825[var1];
            }
            if (this.field1825[var1 + 1] < this.field1827) {
                this.field1827 = this.field1825[var1 + 1];
            } else if (this.field1825[var1 + 1] > this.field1829) {
                this.field1829 = this.field1825[var1 + 1];
            }
        }
    }

    @ObfuscatedName("fy.c(ZI)Lqn;")
    public class457 method2961(boolean arg0) {
        int var2 = arg0 ? this.field1816 : this.field1822;
        return this.method2962(var2);
    }

    @ObfuscatedName("fy.q(IB)Lqn;")
    public class457 method2962(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class457 var2 = (class457) field1811.method4599((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class457 var3 = class458.method4559(Statics.field165, arg0, 0);
        if (var3 != null) {
            field1811.method4600(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("fy.i(I)I")
    public int method2963() {
        return this.field1814;
    }
}
