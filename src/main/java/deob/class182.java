package deob;

@ObfuscatedName("gg")
public class class182 extends class501 {

    @ObfuscatedName("gg.ak")
    public static class313 field1889 = new class313(256);

    @ObfuscatedName("gg.ap")
    public final int field1890;

    @ObfuscatedName("gg.an")
    public int field1910 = -1;

    @ObfuscatedName("gg.aj")
    public int field1898 = -1;

    @ObfuscatedName("gg.av")
    public String field1891;

    @ObfuscatedName("gg.ab")
    public int field1892;

    @ObfuscatedName("gg.ai")
    public int field1894 = 0;

    @ObfuscatedName("gg.au")
    public boolean field1897 = true;

    @ObfuscatedName("gg.ah")
    public boolean field1901 = false;

    @ObfuscatedName("gg.az")
    public String[] field1899 = new String[5];

    @ObfuscatedName("gg.ax")
    public String field1900;

    @ObfuscatedName("gg.ac")
    public int[] field1896;

    @ObfuscatedName("gg.al")
    public int field1895 = Integer.MAX_VALUE;

    @ObfuscatedName("gg.ay")
    public int field1903 = Integer.MAX_VALUE;

    @ObfuscatedName("gg.ao")
    public int field1904 = Integer.MIN_VALUE;

    @ObfuscatedName("gg.aa")
    public int field1902 = Integer.MIN_VALUE;

    @ObfuscatedName("gg.as")
    public class191 field1906 = class191.field1970;

    @ObfuscatedName("gg.aw")
    public class195 field1907 = class195.field2040;

    @ObfuscatedName("gg.at")
    public int[] field1908;

    @ObfuscatedName("gg.af")
    public byte[] field1909;

    @ObfuscatedName("gg.am")
    public int field1893 = -1;

    public class182(int arg0) {
        this.field1890 = arg0;
    }

    @ObfuscatedName("gn.aq(II)Lgg;")
    public static class182 method3196(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1886.length || Statics.field1886[arg0] == null ? new class182(arg0) : Statics.field1886[arg0];
    }

    @ObfuscatedName("gg.ad(Lvp;I)V")
    public void method3292(class547 arg0) {
        while (true) {
            int var2 = arg0.method8804();
            if (var2 == 0) {
                return;
            }
            this.method3299(arg0, var2);
        }
    }

    @ObfuscatedName("gg.ag(Lvp;II)V")
    public void method3299(class547 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1910 = arg0.method8773();
        } else if (arg1 == 2) {
            this.field1898 = arg0.method8773();
        } else if (arg1 == 3) {
            this.field1891 = arg0.method8739();
        } else if (arg1 == 4) {
            this.field1892 = arg0.method8732();
        } else if (arg1 == 5) {
            arg0.method8732();
        } else if (arg1 == 6) {
            this.field1894 = arg0.method8804();
        } else if (arg1 == 7) {
            int var3 = arg0.method8804();
            if ((var3 & 0x1) == 0) {
                this.field1897 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1901 = true;
            }
        } else if (arg1 == 8) {
            arg0.method8804();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1899[arg1 - 10] = arg0.method8739();
        } else if (arg1 == 15) {
            int var4 = arg0.method8804();
            this.field1896 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1896[var5] = arg0.method8731();
            }
            arg0.method8734();
            int var6 = arg0.method8804();
            this.field1908 = new int[var6];
            for (int var7 = 0; var7 < this.field1908.length; var7++) {
                this.field1908[var7] = arg0.method8734();
            }
            this.field1909 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1909[var8] = arg0.method8857();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1900 = arg0.method8739();
            } else if (arg1 == 18) {
                arg0.method8773();
            } else if (arg1 == 19) {
                this.field1893 = arg0.method8899();
            } else if (arg1 == 21) {
                arg0.method8734();
            } else if (arg1 == 22) {
                arg0.method8734();
            } else if (arg1 == 23) {
                arg0.method8804();
                arg0.method8804();
                arg0.method8804();
            } else if (arg1 == 24) {
                arg0.method8731();
                arg0.method8731();
            } else if (arg1 == 25) {
                arg0.method8773();
            } else if (arg1 == 28) {
                arg0.method8804();
            } else if (arg1 == 29) {
                class191[] var9 = new class191[] { class191.field1970, class191.field1971, class191.field1977 };
                this.field1906 = (class191) class402.method3799(var9, arg0.method8804());
            } else if (arg1 == 30) {
                this.field1907 = (class195) class402.method3799(class195.method4595(), arg0.method8804());
            }
        }
    }

    @ObfuscatedName("gg.ak(I)V")
    public void method3286() {
        if (this.field1896 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1896.length; var1 += 2) {
            if (this.field1896[var1] < this.field1895) {
                this.field1895 = this.field1896[var1];
            } else if (this.field1896[var1] > this.field1904) {
                this.field1904 = this.field1896[var1];
            }
            if (this.field1896[var1 + 1] < this.field1903) {
                this.field1903 = this.field1896[var1 + 1];
            } else if (this.field1896[var1 + 1] > this.field1902) {
                this.field1902 = this.field1896[var1 + 1];
            }
        }
    }

    @ObfuscatedName("gg.ap(ZI)Lvg;")
    public class561 method3287(boolean arg0) {
        int var2 = arg0 ? this.field1898 : this.field1910;
        return this.method3288(var2);
    }

    @ObfuscatedName("gg.an(II)Lvg;")
    public class561 method3288(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class561 var2 = (class561) field1889.method5495((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class561 var3 = class562.method6477(Statics.field1905, arg0, 0);
        if (var3 != null) {
            field1889.method5498(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("gg.aj(S)I")
    public int method3289() {
        return this.field1890;
    }

    @ObfuscatedName("aa.av(I)V")
    public static void method281() {
        field1889.method5500();
    }
}
