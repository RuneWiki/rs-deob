package deob;

@ObfuscatedName("hd")
public class class185 extends class439 {

    @ObfuscatedName("hd.ab")
    public static class276 field1902 = new class276(256);

    @ObfuscatedName("hd.an")
    public final int field1903;

    @ObfuscatedName("hd.ao")
    public int field1904 = -1;

    @ObfuscatedName("hd.av")
    public int field1914 = -1;

    @ObfuscatedName("hd.aq")
    public String field1906;

    @ObfuscatedName("hd.ap")
    public int field1900;

    @ObfuscatedName("hd.ar")
    public int field1908 = 0;

    @ObfuscatedName("hd.ax")
    public boolean field1910 = true;

    @ObfuscatedName("hd.as")
    public boolean field1919 = false;

    @ObfuscatedName("hd.ay")
    public String[] field1905 = new String[5];

    @ObfuscatedName("hd.am")
    public String field1913;

    @ObfuscatedName("hd.az")
    public int[] field1907;

    @ObfuscatedName("hd.ae")
    public int field1915 = Integer.MAX_VALUE;

    @ObfuscatedName("hd.au")
    public int field1916 = Integer.MAX_VALUE;

    @ObfuscatedName("hd.ag")
    public int field1917 = Integer.MIN_VALUE;

    @ObfuscatedName("hd.at")
    public int field1918 = Integer.MIN_VALUE;

    @ObfuscatedName("hd.af")
    public class191 field1912 = class191.field1977;

    @ObfuscatedName("hd.ai")
    public class194 field1911 = class194.field2036;

    @ObfuscatedName("hd.aw")
    public int[] field1921;

    @ObfuscatedName("hd.aa")
    public byte[] field1922;

    @ObfuscatedName("hd.ah")
    public int field1923 = -1;

    public class185(int arg0) {
        this.field1903 = arg0;
    }

    @ObfuscatedName("ds.aj(Lne;Lne;I)Z")
    public static boolean method2172(class340 arg0, class340 arg1) {
        Statics.field1909 = arg1;
        if (!arg0.method5884()) {
            return false;
        }
        Statics.field1901 = arg0.method5934(35);
        Statics.field1899 = new class185[Statics.field1901];
        for (int var2 = 0; var2 < Statics.field1901; var2++) {
            byte[] var3 = arg0.method5860(35, var2);
            Statics.field1899[var2] = new class185(var2);
            if (var3 != null) {
                Statics.field1899[var2].method3248(new class478(var3));
                Statics.field1899[var2].method3250();
            }
        }
        return true;
    }

    @ObfuscatedName("eh.al(IB)Lhd;")
    public static class185 method2778(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1899.length || Statics.field1899[arg0] == null ? new class185(arg0) : Statics.field1899[arg0];
    }

    @ObfuscatedName("hd.ac(Lsy;I)V")
    public void method3248(class478 arg0) {
        while (true) {
            int var2 = arg0.method7909();
            if (var2 == 0) {
                return;
            }
            this.method3268(arg0, var2);
        }
    }

    @ObfuscatedName("hd.ab(Lsy;II)V")
    public void method3268(class478 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1904 = arg0.method7922();
        } else if (arg1 == 2) {
            this.field1914 = arg0.method7922();
        } else if (arg1 == 3) {
            this.field1906 = arg0.method7950();
        } else if (arg1 == 4) {
            this.field1900 = arg0.method7907();
        } else if (arg1 == 5) {
            arg0.method7907();
        } else if (arg1 == 6) {
            this.field1908 = arg0.method7909();
        } else if (arg1 == 7) {
            int var3 = arg0.method7909();
            if ((var3 & 0x1) == 0) {
                this.field1910 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1919 = true;
            }
        } else if (arg1 == 8) {
            arg0.method7909();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1905[arg1 - 10] = arg0.method7950();
        } else if (arg1 == 15) {
            int var4 = arg0.method7909();
            this.field1907 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1907[var5] = arg0.method7882();
            }
            arg0.method7908();
            int var6 = arg0.method7909();
            this.field1921 = new int[var6];
            for (int var7 = 0; var7 < this.field1921.length; var7++) {
                this.field1921[var7] = arg0.method7908();
            }
            this.field1922 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1922[var8] = arg0.method8163();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1913 = arg0.method7950();
            } else if (arg1 == 18) {
                arg0.method7922();
            } else if (arg1 == 19) {
                this.field1923 = arg0.method7905();
            } else if (arg1 == 21) {
                arg0.method7908();
            } else if (arg1 == 22) {
                arg0.method7908();
            } else if (arg1 == 23) {
                arg0.method7909();
                arg0.method7909();
                arg0.method7909();
            } else if (arg1 == 24) {
                arg0.method7882();
                arg0.method7882();
            } else if (arg1 == 25) {
                arg0.method7922();
            } else if (arg1 == 28) {
                arg0.method7909();
            } else if (arg1 == 29) {
                this.field1912 = (class191) class354.method5197(Statics.method1137(), arg0.method7909());
            } else if (arg1 == 30) {
                this.field1911 = (class194) class354.method5197(class194.method4421(), arg0.method7909());
            }
        }
    }

    @ObfuscatedName("hd.an(I)V")
    public void method3250() {
        if (this.field1907 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1907.length; var1 += 2) {
            if (this.field1907[var1] < this.field1915) {
                this.field1915 = this.field1907[var1];
            } else if (this.field1907[var1] > this.field1917) {
                this.field1917 = this.field1907[var1];
            }
            if (this.field1907[var1 + 1] < this.field1916) {
                this.field1916 = this.field1907[var1 + 1];
            } else if (this.field1907[var1 + 1] > this.field1918) {
                this.field1918 = this.field1907[var1 + 1];
            }
        }
    }

    @ObfuscatedName("hd.ao(ZB)Lsn;")
    public class492 method3251(boolean arg0) {
        int var2 = arg0 ? this.field1914 : this.field1904;
        return this.method3252(var2);
    }

    @ObfuscatedName("hd.av(IB)Lsn;")
    public class492 method3252(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class492 var2 = (class492) field1902.method4921((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class492 var3 = class493.method4861(Statics.field1909, arg0, 0);
        if (var3 != null) {
            field1902.method4923(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("hd.aq(B)I")
    public int method3253() {
        return this.field1903;
    }
}
