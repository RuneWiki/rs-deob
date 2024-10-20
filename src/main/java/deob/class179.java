package deob;

@ObfuscatedName("gv")
public class class179 extends class488 {

    @ObfuscatedName("gv.ai")
    public static class304 field1869 = new class304(256);

    @ObfuscatedName("gv.ar")
    public final int field1870;

    @ObfuscatedName("gv.as")
    public int field1871 = -1;

    @ObfuscatedName("gv.aa")
    public int field1872 = -1;

    @ObfuscatedName("gv.az")
    public String field1873;

    @ObfuscatedName("gv.ao")
    public int field1874;

    @ObfuscatedName("gv.au")
    public int field1886 = 0;

    @ObfuscatedName("gv.ah")
    public boolean field1868 = true;

    @ObfuscatedName("gv.aj")
    public boolean field1877 = false;

    @ObfuscatedName("gv.af")
    public String[] field1878 = new String[5];

    @ObfuscatedName("gv.ax")
    public String field1889;

    @ObfuscatedName("gv.an")
    public int[] field1879;

    @ObfuscatedName("gv.ag")
    public int field1881 = Integer.MAX_VALUE;

    @ObfuscatedName("gv.am")
    public int field1882 = Integer.MAX_VALUE;

    @ObfuscatedName("gv.ad")
    public int field1883 = Integer.MIN_VALUE;

    @ObfuscatedName("gv.at")
    public int field1884 = Integer.MIN_VALUE;

    @ObfuscatedName("gv.ay")
    public class188 field1885 = class188.field1956;

    @ObfuscatedName("gv.ae")
    public class192 field1875 = class192.field2015;

    @ObfuscatedName("gv.ac")
    public int[] field1887;

    @ObfuscatedName("gv.ab")
    public byte[] field1866;

    @ObfuscatedName("gv.av")
    public int field1867 = -1;

    public class179(int arg0) {
        this.field1870 = arg0;
    }

    @ObfuscatedName("fd.aq(II)Lgv;")
    public static class179 method2995(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1876.length || Statics.field1876[arg0] == null ? new class179(arg0) : Statics.field1876[arg0];
    }

    @ObfuscatedName("gv.aw(Luq;I)V")
    public void method3240(class534 arg0) {
        while (true) {
            int var2 = arg0.method8591();
            if (var2 == 0) {
                return;
            }
            this.method3250(arg0, var2);
        }
    }

    @ObfuscatedName("gv.al(Luq;IS)V")
    public void method3250(class534 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1871 = arg0.method8811();
        } else if (arg1 == 2) {
            this.field1872 = arg0.method8811();
        } else if (arg1 == 3) {
            this.field1873 = arg0.method8741();
        } else if (arg1 == 4) {
            this.field1874 = arg0.method8595();
        } else if (arg1 == 5) {
            arg0.method8595();
        } else if (arg1 == 6) {
            this.field1886 = arg0.method8591();
        } else if (arg1 == 7) {
            int var3 = arg0.method8591();
            if ((var3 & 0x1) == 0) {
                this.field1868 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1877 = true;
            }
        } else if (arg1 == 8) {
            arg0.method8591();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1878[arg1 - 10] = arg0.method8741();
        } else if (arg1 == 15) {
            int var4 = arg0.method8591();
            this.field1879 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1879[var5] = arg0.method8594();
            }
            arg0.method8597();
            int var6 = arg0.method8591();
            this.field1887 = new int[var6];
            for (int var7 = 0; var7 < this.field1887.length; var7++) {
                this.field1887[var7] = arg0.method8597();
            }
            this.field1866 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1866[var8] = arg0.method8592();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1889 = arg0.method8741();
            } else if (arg1 == 18) {
                arg0.method8811();
            } else if (arg1 == 19) {
                this.field1867 = arg0.method8593();
            } else if (arg1 == 21) {
                arg0.method8597();
            } else if (arg1 == 22) {
                arg0.method8597();
            } else if (arg1 == 23) {
                arg0.method8591();
                arg0.method8591();
                arg0.method8591();
            } else if (arg1 == 24) {
                arg0.method8594();
                arg0.method8594();
            } else if (arg1 == 25) {
                arg0.method8811();
            } else if (arg1 == 28) {
                arg0.method8591();
            } else if (arg1 == 29) {
                this.field1885 = (class188) class392.method6317(class188.method1859(), arg0.method8591());
            } else if (arg1 == 30) {
                class192[] var9 = new class192[] { class192.field2016, class192.field2015, class192.field2020 };
                this.field1875 = (class192) class392.method6317(var9, arg0.method8591());
            }
        }
    }

    @ObfuscatedName("gv.ai(I)V")
    public void method3265() {
        if (this.field1879 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1879.length; var1 += 2) {
            if (this.field1879[var1] < this.field1881) {
                this.field1881 = this.field1879[var1];
            } else if (this.field1879[var1] > this.field1883) {
                this.field1883 = this.field1879[var1];
            }
            if (this.field1879[var1 + 1] < this.field1882) {
                this.field1882 = this.field1879[var1 + 1];
            } else if (this.field1879[var1 + 1] > this.field1884) {
                this.field1884 = this.field1879[var1 + 1];
            }
        }
    }

    @ObfuscatedName("gv.ar(ZB)Lvd;")
    public class548 method3242(boolean arg0) {
        int var2 = arg0 ? this.field1872 : this.field1871;
        return this.method3258(var2);
    }

    @ObfuscatedName("gv.as(IB)Lvd;")
    public class548 method3258(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class548 var2 = (class548) field1869.method5414((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class548 var3 = class549.method3899(Statics.field1888, arg0, 0);
        if (var3 != null) {
            field1869.method5421(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("gv.aa(I)I")
    public int method3244() {
        return this.field1870;
    }

    @ObfuscatedName("bq.az(I)V")
    public static void method415() {
        field1869.method5418();
    }
}
