package deob;

@ObfuscatedName("fe")
public class class172 extends class404 {

    @ObfuscatedName("fe.f")
    public static class257 field1815 = new class257(256);

    @ObfuscatedName("fe.b")
    public final int field1831;

    @ObfuscatedName("fe.n")
    public int field1814 = -1;

    @ObfuscatedName("fe.s")
    public int field1818 = -1;

    @ObfuscatedName("fe.l")
    public String field1826;

    @ObfuscatedName("fe.q")
    public int field1820;

    @ObfuscatedName("fe.o")
    public int field1829 = 0;

    @ObfuscatedName("fe.p")
    public boolean field1823 = true;

    @ObfuscatedName("fe.w")
    public boolean field1824 = false;

    @ObfuscatedName("fe.k")
    public String[] field1834 = new String[5];

    @ObfuscatedName("fe.d")
    public String field1821;

    @ObfuscatedName("fe.m")
    public int[] field1827;

    @ObfuscatedName("fe.u")
    public int field1828 = Integer.MAX_VALUE;

    @ObfuscatedName("fe.t")
    public int field1819 = Integer.MAX_VALUE;

    @ObfuscatedName("fe.g")
    public int field1830 = Integer.MIN_VALUE;

    @ObfuscatedName("fe.x")
    public int field1817 = Integer.MIN_VALUE;

    @ObfuscatedName("fe.a")
    public class178 field1832 = class178.field1887;

    @ObfuscatedName("fe.y")
    public class180 field1833 = class180.field1931;

    @ObfuscatedName("fe.j")
    public int[] field1822;

    @ObfuscatedName("fe.e")
    public byte[] field1835;

    @ObfuscatedName("fe.z")
    public int field1836 = -1;

    public class172(int arg0) {
        this.field1831 = arg0;
    }

    @ObfuscatedName("ez.v(Lln;Lln;I)Z")
    public static boolean method2864(class316 arg0, class316 arg1) {
        Statics.field1816 = arg1;
        if (!arg0.method5374()) {
            return false;
        }
        Statics.field1825 = arg0.method5305(35);
        Statics.field1813 = new class172[Statics.field1825];
        for (int var2 = 0; var2 < Statics.field1825; var2++) {
            byte[] var3 = arg0.method5296(35, var2);
            Statics.field1813[var2] = new class172(var2);
            if (var3 != null) {
                Statics.field1813[var2].method3071(new class438(var3));
                Statics.field1813[var2].method3050();
            }
        }
        return true;
    }

    @ObfuscatedName("dj.c(IB)Lfe;")
    public static class172 method2469(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1813.length || Statics.field1813[arg0] == null ? new class172(arg0) : Statics.field1813[arg0];
    }

    @ObfuscatedName("fe.i(Lpi;B)V")
    public void method3071(class438 arg0) {
        while (true) {
            int var2 = arg0.method6971();
            if (var2 == 0) {
                return;
            }
            this.method3069(arg0, var2);
        }
    }

    @ObfuscatedName("fe.f(Lpi;II)V")
    public void method3069(class438 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1814 = arg0.method6989();
        } else if (arg1 == 2) {
            this.field1818 = arg0.method6989();
        } else if (arg1 == 3) {
            this.field1826 = arg0.method6981();
        } else if (arg1 == 4) {
            this.field1820 = arg0.method6975();
        } else if (arg1 == 5) {
            arg0.method6975();
        } else if (arg1 == 6) {
            this.field1829 = arg0.method6971();
        } else if (arg1 == 7) {
            int var3 = arg0.method6971();
            if ((var3 & 0x1) == 0) {
                this.field1823 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1824 = true;
            }
        } else if (arg1 == 8) {
            arg0.method6971();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1834[arg1 - 10] = arg0.method6981();
        } else if (arg1 == 15) {
            int var4 = arg0.method6971();
            this.field1827 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1827[var5] = arg0.method6974();
            }
            arg0.method6976();
            int var6 = arg0.method6971();
            this.field1822 = new int[var6];
            for (int var7 = 0; var7 < this.field1822.length; var7++) {
                this.field1822[var7] = arg0.method6976();
            }
            this.field1835 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1835[var8] = arg0.method7093();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1821 = arg0.method6981();
            } else if (arg1 == 18) {
                arg0.method6989();
            } else if (arg1 == 19) {
                this.field1836 = arg0.method7148();
            } else if (arg1 == 21) {
                arg0.method6976();
            } else if (arg1 == 22) {
                arg0.method6976();
            } else if (arg1 == 23) {
                arg0.method6971();
                arg0.method6971();
                arg0.method6971();
            } else if (arg1 == 24) {
                arg0.method6974();
                arg0.method6974();
            } else if (arg1 == 25) {
                arg0.method6989();
            } else if (arg1 == 28) {
                arg0.method6971();
            } else if (arg1 == 29) {
                class178[] var9 = new class178[] { class178.field1891, class178.field1887, class178.field1890 };
                this.field1832 = (class178) class330.method4919(var9, arg0.method6971());
            } else if (arg1 == 30) {
                this.field1833 = (class180) class330.method4919(class180.method5195(), arg0.method6971());
            }
        }
    }

    @ObfuscatedName("fe.b(B)V")
    public void method3050() {
        if (this.field1827 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1827.length; var1 += 2) {
            if (this.field1827[var1] < this.field1828) {
                this.field1828 = this.field1827[var1];
            } else if (this.field1827[var1] > this.field1830) {
                this.field1830 = this.field1827[var1];
            }
            if (this.field1827[var1 + 1] < this.field1819) {
                this.field1819 = this.field1827[var1 + 1];
            } else if (this.field1827[var1 + 1] > this.field1817) {
                this.field1817 = this.field1827[var1 + 1];
            }
        }
    }

    @ObfuscatedName("fe.n(ZI)Lqi;")
    public class451 method3051(boolean arg0) {
        int var2 = arg0 ? this.field1818 : this.field1814;
        return this.method3052(var2);
    }

    @ObfuscatedName("fe.s(II)Lqi;")
    public class451 method3052(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class451 var2 = (class451) field1815.method4644((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class451 var3 = class452.method35(Statics.field1816, arg0, 0);
        if (var3 != null) {
            field1815.method4651(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("fe.l(I)I")
    public int method3053() {
        return this.field1831;
    }
}
