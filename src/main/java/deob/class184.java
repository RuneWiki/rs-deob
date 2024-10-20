package deob;

@ObfuscatedName("hc")
public class class184 extends class511 {

    @ObfuscatedName("hc.aj")
    public static class316 field1916 = new class316(256);

    @ObfuscatedName("hc.ai")
    public final int field1911;

    @ObfuscatedName("hc.ay")
    public int field1912 = -1;

    @ObfuscatedName("hc.as")
    public int field1913 = -1;

    @ObfuscatedName("hc.ae")
    public String field1914;

    @ObfuscatedName("hc.am")
    public int field1915;

    @ObfuscatedName("hc.at")
    public int field1922 = 0;

    @ObfuscatedName("hc.an")
    public boolean field1908 = true;

    @ObfuscatedName("hc.ao")
    public boolean field1917 = false;

    @ObfuscatedName("hc.af")
    public String[] field1919 = new String[5];

    @ObfuscatedName("hc.ar")
    public String field1918;

    @ObfuscatedName("hc.ab")
    public int[] field1910;

    @ObfuscatedName("hc.az")
    public int field1926 = Integer.MAX_VALUE;

    @ObfuscatedName("hc.ag")
    public int field1923 = Integer.MAX_VALUE;

    @ObfuscatedName("hc.ad")
    public int field1924 = Integer.MIN_VALUE;

    @ObfuscatedName("hc.ac")
    public int field1925 = Integer.MIN_VALUE;

    @ObfuscatedName("hc.av")
    public class193 field1932 = class193.field1989;

    @ObfuscatedName("hc.ax")
    public class197 field1927 = class197.field2060;

    @ObfuscatedName("hc.aq")
    public int[] field1928;

    @ObfuscatedName("hc.al")
    public byte[] field1929;

    @ObfuscatedName("hc.aa")
    public int field1930 = -1;

    public class184(int arg0) {
        this.field1911 = arg0;
    }

    @ObfuscatedName("aw.ap(Lpe;Lpe;I)Z")
    public static boolean method11(class392 arg0, class392 arg1) {
        Statics.field1921 = arg1;
        if (!arg0.method6999()) {
            return false;
        }
        Statics.field3763 = arg0.method7004(35);
        Statics.field1909 = new class184[Statics.field3763];
        for (int var2 = 0; var2 < Statics.field3763; var2++) {
            byte[] var3 = arg0.method7009(35, var2);
            Statics.field1909[var2] = new class184(var2);
            if (var3 != null) {
                Statics.field1909[var2].method3628(new class558(var3));
                Statics.field1909[var2].method3626();
            }
        }
        return true;
    }

    @ObfuscatedName("ar.aw(II)Lhc;")
    public static class184 method174(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1909.length || Statics.field1909[arg0] == null ? new class184(arg0) : Statics.field1909[arg0];
    }

    @ObfuscatedName("hc.ak(Lvl;I)V")
    public void method3628(class558 arg0) {
        while (true) {
            int var2 = arg0.method9258();
            if (var2 == 0) {
                return;
            }
            this.method3613(arg0, var2);
        }
    }

    @ObfuscatedName("hc.aj(Lvl;II)V")
    public void method3613(class558 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1912 = arg0.method9278();
        } else if (arg1 == 2) {
            this.field1913 = arg0.method9278();
        } else if (arg1 == 3) {
            this.field1914 = arg0.method9269();
        } else if (arg1 == 4) {
            this.field1915 = arg0.method9380();
        } else if (arg1 == 5) {
            arg0.method9380();
        } else if (arg1 == 6) {
            this.field1922 = arg0.method9258();
        } else if (arg1 == 7) {
            int var3 = arg0.method9258();
            if ((var3 & 0x1) == 0) {
                this.field1908 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1917 = true;
            }
        } else if (arg1 == 8) {
            arg0.method9258();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1919[arg1 - 10] = arg0.method9269();
        } else if (arg1 == 15) {
            int var4 = arg0.method9258();
            this.field1910 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1910[var5] = arg0.method9261();
            }
            arg0.method9264();
            int var6 = arg0.method9258();
            this.field1928 = new int[var6];
            for (int var7 = 0; var7 < this.field1928.length; var7++) {
                this.field1928[var7] = arg0.method9264();
            }
            this.field1929 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1929[var8] = arg0.method9259();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1918 = arg0.method9269();
            } else if (arg1 == 18) {
                arg0.method9278();
            } else if (arg1 == 19) {
                this.field1930 = arg0.method9260();
            } else if (arg1 == 21) {
                arg0.method9264();
            } else if (arg1 == 22) {
                arg0.method9264();
            } else if (arg1 == 23) {
                arg0.method9258();
                arg0.method9258();
                arg0.method9258();
            } else if (arg1 == 24) {
                arg0.method9261();
                arg0.method9261();
            } else if (arg1 == 25) {
                arg0.method9278();
            } else if (arg1 == 28) {
                arg0.method9258();
            } else if (arg1 == 29) {
                class193[] var9 = new class193[] { class193.field1990, class193.field1991, class193.field1989 };
                this.field1932 = (class193) class406.method3580(var9, arg0.method9258());
            } else if (arg1 == 30) {
                this.field1927 = (class197) class406.method3580(class197.method8114(), arg0.method9258());
            }
        }
    }

    @ObfuscatedName("hc.ai(I)V")
    public void method3626() {
        if (this.field1910 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1910.length; var1 += 2) {
            if (this.field1910[var1] < this.field1926) {
                this.field1926 = this.field1910[var1];
            } else if (this.field1910[var1] > this.field1924) {
                this.field1924 = this.field1910[var1];
            }
            if (this.field1910[var1 + 1] < this.field1923) {
                this.field1923 = this.field1910[var1 + 1];
            } else if (this.field1910[var1 + 1] > this.field1925) {
                this.field1925 = this.field1910[var1 + 1];
            }
        }
    }

    @ObfuscatedName("hc.ay(ZI)Lvv;")
    public class572 method3615(boolean arg0) {
        int var2 = arg0 ? this.field1913 : this.field1912;
        return this.method3616(var2);
    }

    @ObfuscatedName("hc.as(II)Lvv;")
    public class572 method3616(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class572 var2 = (class572) field1916.method5928((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class572 var3 = class573.method8571(Statics.field1921, arg0, 0);
        if (var3 != null) {
            field1916.method5931(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("hc.ae(B)I")
    public int method3625() {
        return this.field1911;
    }
}
