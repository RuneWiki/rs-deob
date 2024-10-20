package deob;

@ObfuscatedName("fh")
public class class172 extends class407 {

    @ObfuscatedName("fh.n")
    public static class257 field1849 = new class257(256);

    @ObfuscatedName("fh.k")
    public final int field1854;

    @ObfuscatedName("fh.w")
    public int field1851 = -1;

    @ObfuscatedName("fh.s")
    public int field1869 = -1;

    @ObfuscatedName("fh.q")
    public String field1861;

    @ObfuscatedName("fh.m")
    public int field1846;

    @ObfuscatedName("fh.x")
    public int field1855 = 0;

    @ObfuscatedName("fh.v")
    public boolean field1856 = true;

    @ObfuscatedName("fh.h")
    public boolean field1857 = false;

    @ObfuscatedName("fh.t")
    public String[] field1850 = new String[5];

    @ObfuscatedName("fh.u")
    public String field1859;

    @ObfuscatedName("fh.d")
    public int[] field1860;

    @ObfuscatedName("fh.b")
    public int field1862 = Integer.MAX_VALUE;

    @ObfuscatedName("fh.a")
    public int field1852 = Integer.MAX_VALUE;

    @ObfuscatedName("fh.l")
    public int field1858 = Integer.MIN_VALUE;

    @ObfuscatedName("fh.e")
    public int field1864 = Integer.MIN_VALUE;

    @ObfuscatedName("fh.g")
    public class178 field1865 = class178.field1923;

    @ObfuscatedName("fh.y")
    public class180 field1866 = class180.field1976;

    @ObfuscatedName("fh.i")
    public int[] field1867;

    @ObfuscatedName("fh.r")
    public byte[] field1868;

    @ObfuscatedName("fh.z")
    public int field1847 = -1;

    public class172(int arg0) {
        this.field1854 = arg0;
    }

    @ObfuscatedName("eg.c(II)Lfh;")
    public static class172 method2879(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1853.length || Statics.field1853[arg0] == null ? new class172(arg0) : Statics.field1853[arg0];
    }

    @ObfuscatedName("fh.p(Lqq;B)V")
    public void method3176(class445 arg0) {
        while (true) {
            int var2 = arg0.method7196();
            if (var2 == 0) {
                return;
            }
            this.method3175(arg0, var2);
        }
    }

    @ObfuscatedName("fh.f(Lqq;IB)V")
    public void method3175(class445 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1851 = arg0.method7301();
        } else if (arg1 == 2) {
            this.field1869 = arg0.method7301();
        } else if (arg1 == 3) {
            this.field1861 = arg0.method7206();
        } else if (arg1 == 4) {
            this.field1846 = arg0.method7340();
        } else if (arg1 == 5) {
            arg0.method7340();
        } else if (arg1 == 6) {
            this.field1855 = arg0.method7196();
        } else if (arg1 == 7) {
            int var3 = arg0.method7196();
            if ((var3 & 0x1) == 0) {
                this.field1856 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1857 = true;
            }
        } else if (arg1 == 8) {
            arg0.method7196();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1850[arg1 - 10] = arg0.method7206();
        } else if (arg1 == 15) {
            int var4 = arg0.method7196();
            this.field1860 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1860[var5] = arg0.method7199();
            }
            arg0.method7201();
            int var6 = arg0.method7196();
            this.field1867 = new int[var6];
            for (int var7 = 0; var7 < this.field1867.length; var7++) {
                this.field1867[var7] = arg0.method7201();
            }
            this.field1868 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1868[var8] = arg0.method7197();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1859 = arg0.method7206();
            } else if (arg1 == 18) {
                arg0.method7301();
            } else if (arg1 == 19) {
                this.field1847 = arg0.method7198();
            } else if (arg1 == 21) {
                arg0.method7201();
            } else if (arg1 == 22) {
                arg0.method7201();
            } else if (arg1 == 23) {
                arg0.method7196();
                arg0.method7196();
                arg0.method7196();
            } else if (arg1 == 24) {
                arg0.method7199();
                arg0.method7199();
            } else if (arg1 == 25) {
                arg0.method7301();
            } else if (arg1 == 28) {
                arg0.method7196();
            } else if (arg1 == 29) {
                this.field1865 = (class178) class331.method5118(class178.method807(), arg0.method7196());
            } else if (arg1 == 30) {
                this.field1866 = (class180) class331.method5118(class180.method1077(), arg0.method7196());
            }
        }
    }

    @ObfuscatedName("fh.n(B)V")
    public void method3177() {
        if (this.field1860 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1860.length; var1 += 2) {
            if (this.field1860[var1] < this.field1862) {
                this.field1862 = this.field1860[var1];
            } else if (this.field1860[var1] > this.field1858) {
                this.field1858 = this.field1860[var1];
            }
            if (this.field1860[var1 + 1] < this.field1852) {
                this.field1852 = this.field1860[var1 + 1];
            } else if (this.field1860[var1 + 1] > this.field1864) {
                this.field1864 = this.field1860[var1 + 1];
            }
        }
    }

    @ObfuscatedName("fh.k(ZB)Lqi;")
    public class458 method3188(boolean arg0) {
        int var2 = arg0 ? this.field1869 : this.field1851;
        return this.method3178(var2);
    }

    @ObfuscatedName("fh.w(II)Lqi;")
    public class458 method3178(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class458 var2 = (class458) field1849.method4789((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class458 var3 = class459.method2680(Statics.field1863, arg0, 0);
        if (var3 != null) {
            field1849.method4781(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("fh.s(S)I")
    public int method3179() {
        return this.field1854;
    }

    @ObfuscatedName("kx.q(B)V")
    public static void method5108() {
        field1849.method4782();
    }
}
