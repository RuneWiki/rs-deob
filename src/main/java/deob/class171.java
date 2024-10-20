package deob;

@ObfuscatedName("fa")
public class class171 extends class405 {

    @ObfuscatedName("fa.f")
    public static class256 field1839 = new class256(256);

    @ObfuscatedName("fa.j")
    public final int field1849;

    @ObfuscatedName("fa.e")
    public int field1832 = -1;

    @ObfuscatedName("fa.g")
    public int field1833 = -1;

    @ObfuscatedName("fa.w")
    public String field1830;

    @ObfuscatedName("fa.y")
    public int field1835;

    @ObfuscatedName("fa.i")
    public int field1848 = 0;

    @ObfuscatedName("fa.t")
    public boolean field1831 = true;

    @ObfuscatedName("fa.z")
    public boolean field1838 = false;

    @ObfuscatedName("fa.r")
    public String[] field1837 = new String[5];

    @ObfuscatedName("fa.u")
    public String field1840;

    @ObfuscatedName("fa.k")
    public int[] field1841;

    @ObfuscatedName("fa.h")
    public int field1842 = Integer.MAX_VALUE;

    @ObfuscatedName("fa.x")
    public int field1843 = Integer.MAX_VALUE;

    @ObfuscatedName("fa.l")
    public int field1844 = Integer.MIN_VALUE;

    @ObfuscatedName("fa.a")
    public int field1828 = Integer.MIN_VALUE;

    @ObfuscatedName("fa.p")
    public class177 field1846 = class177.field1907;

    @ObfuscatedName("fa.b")
    public class179 field1847 = class179.field1963;

    @ObfuscatedName("fa.n")
    public int[] field1834;

    @ObfuscatedName("fa.o")
    public byte[] field1845;

    @ObfuscatedName("fa.m")
    public int field1850 = -1;

    public class171(int arg0) {
        this.field1849 = arg0;
    }

    @ObfuscatedName("dc.c(Llh;Llh;I)Z")
    public static boolean method2566(class315 arg0, class315 arg1) {
        Statics.field1512 = arg1;
        if (!arg0.method5301()) {
            return false;
        }
        Statics.field1836 = arg0.method5313(35);
        Statics.field1829 = new class171[Statics.field1836];
        for (int var2 = 0; var2 < Statics.field1836; var2++) {
            byte[] var3 = arg0.method5305(35, var2);
            Statics.field1829[var2] = new class171(var2);
            if (var3 != null) {
                Statics.field1829[var2].method3057(new class443(var3));
                Statics.field1829[var2].method3058();
            }
        }
        return true;
    }

    @ObfuscatedName("pv.v(IB)Lfa;")
    public static class171 method6889(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1829.length || Statics.field1829[arg0] == null ? new class171(arg0) : Statics.field1829[arg0];
    }

    @ObfuscatedName("fa.q(Lqt;I)V")
    public void method3057(class443 arg0) {
        while (true) {
            int var2 = arg0.method7047();
            if (var2 == 0) {
                return;
            }
            this.method3065(arg0, var2);
        }
    }

    @ObfuscatedName("fa.f(Lqt;II)V")
    public void method3065(class443 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1832 = arg0.method7066();
        } else if (arg1 == 2) {
            this.field1833 = arg0.method7066();
        } else if (arg1 == 3) {
            this.field1830 = arg0.method7057();
        } else if (arg1 == 4) {
            this.field1835 = arg0.method7051();
        } else if (arg1 == 5) {
            arg0.method7051();
        } else if (arg1 == 6) {
            this.field1848 = arg0.method7047();
        } else if (arg1 == 7) {
            int var3 = arg0.method7047();
            if ((var3 & 0x1) == 0) {
                this.field1831 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1838 = true;
            }
        } else if (arg1 == 8) {
            arg0.method7047();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1837[arg1 - 10] = arg0.method7057();
        } else if (arg1 == 15) {
            int var4 = arg0.method7047();
            this.field1841 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1841[var5] = arg0.method7216();
            }
            arg0.method7052();
            int var6 = arg0.method7047();
            this.field1834 = new int[var6];
            for (int var7 = 0; var7 < this.field1834.length; var7++) {
                this.field1834[var7] = arg0.method7052();
            }
            this.field1845 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1845[var8] = arg0.method7048();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1840 = arg0.method7057();
            } else if (arg1 == 18) {
                arg0.method7066();
            } else if (arg1 == 19) {
                this.field1850 = arg0.method7049();
            } else if (arg1 == 21) {
                arg0.method7052();
            } else if (arg1 == 22) {
                arg0.method7052();
            } else if (arg1 == 23) {
                arg0.method7047();
                arg0.method7047();
                arg0.method7047();
            } else if (arg1 == 24) {
                arg0.method7216();
                arg0.method7216();
            } else if (arg1 == 25) {
                arg0.method7066();
            } else if (arg1 == 28) {
                arg0.method7047();
            } else if (arg1 == 29) {
                this.field1846 = (class177) class329.method2087(class177.method5512(), arg0.method7047());
            } else if (arg1 == 30) {
                this.field1847 = (class179) class329.method2087(class179.method2680(), arg0.method7047());
            }
        }
    }

    @ObfuscatedName("fa.j(I)V")
    public void method3058() {
        if (this.field1841 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1841.length; var1 += 2) {
            if (this.field1841[var1] < this.field1842) {
                this.field1842 = this.field1841[var1];
            } else if (this.field1841[var1] > this.field1844) {
                this.field1844 = this.field1841[var1];
            }
            if (this.field1841[var1 + 1] < this.field1843) {
                this.field1843 = this.field1841[var1 + 1];
            } else if (this.field1841[var1 + 1] > this.field1828) {
                this.field1828 = this.field1841[var1 + 1];
            }
        }
    }

    @ObfuscatedName("fa.e(ZI)Lqe;")
    public class456 method3060(boolean arg0) {
        int var2 = arg0 ? this.field1833 : this.field1832;
        return this.method3061(var2);
    }

    @ObfuscatedName("fa.g(IB)Lqe;")
    public class456 method3061(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class456 var2 = (class456) field1839.method4691((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class456 var3 = class457.method52(Statics.field1512, arg0, 0);
        if (var3 != null) {
            field1839.method4693(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("fa.w(I)I")
    public int method3062() {
        return this.field1849;
    }

    @ObfuscatedName("aq.y(I)V")
    public static void method736() {
        field1839.method4695();
    }
}
