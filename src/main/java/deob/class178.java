package deob;

@ObfuscatedName("gr")
public class class178 extends class481 {

    @ObfuscatedName("gr.ao")
    public static class299 field1842 = new class299(256);

    @ObfuscatedName("gr.ab")
    public final int field1827;

    @ObfuscatedName("gr.au")
    public int field1828 = -1;

    @ObfuscatedName("gr.aa")
    public int field1843 = -1;

    @ObfuscatedName("gr.ac")
    public String field1830;

    @ObfuscatedName("gr.al")
    public int field1831;

    @ObfuscatedName("gr.az")
    public int field1834 = 0;

    @ObfuscatedName("gr.av")
    public boolean field1826 = true;

    @ObfuscatedName("gr.ax")
    public boolean field1825 = false;

    @ObfuscatedName("gr.as")
    public String[] field1836 = new String[5];

    @ObfuscatedName("gr.ay")
    public String field1837;

    @ObfuscatedName("gr.ak")
    public int[] field1838;

    @ObfuscatedName("gr.aj")
    public int field1835 = Integer.MAX_VALUE;

    @ObfuscatedName("gr.am")
    public int field1840 = Integer.MAX_VALUE;

    @ObfuscatedName("gr.aq")
    public int field1841 = Integer.MIN_VALUE;

    @ObfuscatedName("gr.ai")
    public int field1832 = Integer.MIN_VALUE;

    @ObfuscatedName("gr.aw")
    public class187 field1839 = class187.field1908;

    @ObfuscatedName("gr.ae")
    public class191 field1844 = class191.field1972;

    @ObfuscatedName("gr.an")
    public int[] field1845;

    @ObfuscatedName("gr.ag")
    public byte[] field1846;

    @ObfuscatedName("gr.ad")
    public int field1847 = -1;

    public class178(int arg0) {
        this.field1827 = arg0;
    }

    @ObfuscatedName("fj.at(II)Lgr;")
    public static class178 method3048(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1829.length || Statics.field1829[arg0] == null ? new class178(arg0) : Statics.field1829[arg0];
    }

    @ObfuscatedName("gr.ah(Luj;I)V")
    public void method3251(class527 arg0) {
        while (true) {
            int var2 = arg0.method8410();
            if (var2 == 0) {
                return;
            }
            this.method3252(arg0, var2);
        }
    }

    @ObfuscatedName("gr.ar(Luj;IB)V")
    public void method3252(class527 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1828 = arg0.method8430();
        } else if (arg1 == 2) {
            this.field1843 = arg0.method8430();
        } else if (arg1 == 3) {
            this.field1830 = arg0.method8535();
        } else if (arg1 == 4) {
            this.field1831 = arg0.method8414();
        } else if (arg1 == 5) {
            arg0.method8414();
        } else if (arg1 == 6) {
            this.field1834 = arg0.method8410();
        } else if (arg1 == 7) {
            int var3 = arg0.method8410();
            if ((var3 & 0x1) == 0) {
                this.field1826 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1825 = true;
            }
        } else if (arg1 == 8) {
            arg0.method8410();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1836[arg1 - 10] = arg0.method8535();
        } else if (arg1 == 15) {
            int var4 = arg0.method8410();
            this.field1838 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1838[var5] = arg0.method8508();
            }
            arg0.method8416();
            int var6 = arg0.method8410();
            this.field1845 = new int[var6];
            for (int var7 = 0; var7 < this.field1845.length; var7++) {
                this.field1845[var7] = arg0.method8416();
            }
            this.field1846 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1846[var8] = arg0.method8616();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1837 = arg0.method8535();
            } else if (arg1 == 18) {
                arg0.method8430();
            } else if (arg1 == 19) {
                this.field1847 = arg0.method8412();
            } else if (arg1 == 21) {
                arg0.method8416();
            } else if (arg1 == 22) {
                arg0.method8416();
            } else if (arg1 == 23) {
                arg0.method8410();
                arg0.method8410();
                arg0.method8410();
            } else if (arg1 == 24) {
                arg0.method8508();
                arg0.method8508();
            } else if (arg1 == 25) {
                arg0.method8430();
            } else if (arg1 == 28) {
                arg0.method8410();
            } else if (arg1 == 29) {
                class187[] var9 = new class187[] { class187.field1910, class187.field1906, class187.field1908 };
                this.field1839 = (class187) class385.method164(var9, arg0.method8410());
            } else if (arg1 == 30) {
                class191[] var10 = new class191[] { class191.field1972, class191.field1973, class191.field1971 };
                this.field1844 = (class191) class385.method164(var10, arg0.method8410());
            }
        }
    }

    @ObfuscatedName("gr.ao(I)V")
    public void method3269() {
        if (this.field1838 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1838.length; var1 += 2) {
            if (this.field1838[var1] < this.field1835) {
                this.field1835 = this.field1838[var1];
            } else if (this.field1838[var1] > this.field1841) {
                this.field1841 = this.field1838[var1];
            }
            if (this.field1838[var1 + 1] < this.field1840) {
                this.field1840 = this.field1838[var1 + 1];
            } else if (this.field1838[var1 + 1] > this.field1832) {
                this.field1832 = this.field1838[var1 + 1];
            }
        }
    }

    @ObfuscatedName("gr.ab(ZB)Luz;")
    public class541 method3253(boolean arg0) {
        int var2 = arg0 ? this.field1843 : this.field1828;
        return this.method3254(var2);
    }

    @ObfuscatedName("gr.au(II)Luz;")
    public class541 method3254(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class541 var2 = (class541) field1842.method5289((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class541 var3 = class542.method7349(Statics.field4643, arg0, 0);
        if (var3 != null) {
            field1842.method5303(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("gr.aa(I)I")
    public int method3258() {
        return this.field1827;
    }
}
