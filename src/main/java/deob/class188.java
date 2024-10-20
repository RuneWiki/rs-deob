package deob;

@ObfuscatedName("ho")
public class class188 extends class470 {

    @ObfuscatedName("ho.am")
    public static class289 field1913 = new class289(256);

    @ObfuscatedName("ho.as")
    public final int field1921;

    @ObfuscatedName("ho.aj")
    public int field1915 = -1;

    @ObfuscatedName("ho.ag")
    public int field1916 = -1;

    @ObfuscatedName("ho.az")
    public String field1917;

    @ObfuscatedName("ho.av")
    public int field1923;

    @ObfuscatedName("ho.ap")
    public int field1919 = 0;

    @ObfuscatedName("ho.at")
    public boolean field1920 = true;

    @ObfuscatedName("ho.ah")
    public boolean field1934 = false;

    @ObfuscatedName("ho.ax")
    public String[] field1912 = new String[5];

    @ObfuscatedName("ho.aa")
    public String field1922;

    @ObfuscatedName("ho.au")
    public int[] field1924;

    @ObfuscatedName("ho.ae")
    public int field1925 = Integer.MAX_VALUE;

    @ObfuscatedName("ho.ab")
    public int field1926 = Integer.MAX_VALUE;

    @ObfuscatedName("ho.ad")
    public int field1930 = Integer.MIN_VALUE;

    @ObfuscatedName("ho.ao")
    public int field1928 = Integer.MIN_VALUE;

    @ObfuscatedName("ho.ac")
    public class194 field1929 = class194.field1984;

    @ObfuscatedName("ho.ak")
    public class197 field1927 = class197.field2051;

    @ObfuscatedName("ho.an")
    public int[] field1918;

    @ObfuscatedName("ho.af")
    public byte[] field1932;

    @ObfuscatedName("ho.ai")
    public int field1933 = -1;

    public class188(int arg0) {
        this.field1921 = arg0;
    }

    @ObfuscatedName("ig.aw(II)Lho;")
    public static class188 method3780(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field3784.length || Statics.field3784[arg0] == null ? new class188(arg0) : Statics.field3784[arg0];
    }

    @ObfuscatedName("ho.ay(Lty;B)V")
    public void method3278(class514 arg0) {
        while (true) {
            int var2 = arg0.method8244();
            if (var2 == 0) {
                return;
            }
            this.method3279(arg0, var2);
        }
    }

    @ObfuscatedName("ho.ar(Lty;IB)V")
    public void method3279(class514 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1915 = arg0.method8310();
        } else if (arg1 == 2) {
            this.field1916 = arg0.method8310();
        } else if (arg1 == 3) {
            this.field1917 = arg0.method8369();
        } else if (arg1 == 4) {
            this.field1923 = arg0.method8248();
        } else if (arg1 == 5) {
            arg0.method8248();
        } else if (arg1 == 6) {
            this.field1919 = arg0.method8244();
        } else if (arg1 == 7) {
            int var3 = arg0.method8244();
            if ((var3 & 0x1) == 0) {
                this.field1920 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1934 = true;
            }
        } else if (arg1 == 8) {
            arg0.method8244();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1912[arg1 - 10] = arg0.method8369();
        } else if (arg1 == 15) {
            int var4 = arg0.method8244();
            this.field1924 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1924[var5] = arg0.method8497();
            }
            arg0.method8496();
            int var6 = arg0.method8244();
            this.field1918 = new int[var6];
            for (int var7 = 0; var7 < this.field1918.length; var7++) {
                this.field1918[var7] = arg0.method8496();
            }
            this.field1932 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1932[var8] = arg0.method8264();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1922 = arg0.method8369();
            } else if (arg1 == 18) {
                arg0.method8310();
            } else if (arg1 == 19) {
                this.field1933 = arg0.method8246();
            } else if (arg1 == 21) {
                arg0.method8496();
            } else if (arg1 == 22) {
                arg0.method8496();
            } else if (arg1 == 23) {
                arg0.method8244();
                arg0.method8244();
                arg0.method8244();
            } else if (arg1 == 24) {
                arg0.method8497();
                arg0.method8497();
            } else if (arg1 == 25) {
                arg0.method8310();
            } else if (arg1 == 28) {
                arg0.method8244();
            } else if (arg1 == 29) {
                class194[] var9 = new class194[] { class194.field1984, class194.field1990, class194.field1986 };
                this.field1929 = (class194) class374.method2465(var9, arg0.method8244());
            } else if (arg1 == 30) {
                this.field1927 = (class197) class374.method2465(class197.method7159(), arg0.method8244());
            }
        }
    }

    @ObfuscatedName("ho.am(I)V")
    public void method3287() {
        if (this.field1924 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1924.length; var1 += 2) {
            if (this.field1924[var1] < this.field1925) {
                this.field1925 = this.field1924[var1];
            } else if (this.field1924[var1] > this.field1930) {
                this.field1930 = this.field1924[var1];
            }
            if (this.field1924[var1 + 1] < this.field1926) {
                this.field1926 = this.field1924[var1 + 1];
            } else if (this.field1924[var1 + 1] > this.field1928) {
                this.field1928 = this.field1924[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ho.as(ZI)Lud;")
    public class528 method3280(boolean arg0) {
        int var2 = arg0 ? this.field1916 : this.field1915;
        return this.method3299(var2);
    }

    @ObfuscatedName("ho.aj(II)Lud;")
    public class528 method3299(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class528 var2 = (class528) field1913.method5152((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class528 var3 = class529.method7931(Statics.field1914, arg0, 0);
        if (var3 != null) {
            field1913.method5149(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ho.ag(B)I")
    public int method3283() {
        return this.field1921;
    }
}
