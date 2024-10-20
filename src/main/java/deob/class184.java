package deob;

@ObfuscatedName("hf")
public class class184 extends class504 {

    @ObfuscatedName("hf.am")
    public static class317 field1920 = new class317(256);

    @ObfuscatedName("hf.ax")
    public final int field1901;

    @ObfuscatedName("hf.aq")
    public int field1902 = -1;

    @ObfuscatedName("hf.af")
    public int field1903 = -1;

    @ObfuscatedName("hf.at")
    public String field1900;

    @ObfuscatedName("hf.au")
    public int field1905;

    @ObfuscatedName("hf.ar")
    public int field1906 = 0;

    @ObfuscatedName("hf.ad")
    public boolean field1907 = true;

    @ObfuscatedName("hf.ah")
    public boolean field1910 = false;

    @ObfuscatedName("hf.ap")
    public String[] field1909 = new String[5];

    @ObfuscatedName("hf.ab")
    public String field1912;

    @ObfuscatedName("hf.az")
    public int[] field1899;

    @ObfuscatedName("hf.aa")
    public int field1904 = Integer.MAX_VALUE;

    @ObfuscatedName("hf.ai")
    public int field1913 = Integer.MAX_VALUE;

    @ObfuscatedName("hf.ao")
    public int field1914 = Integer.MIN_VALUE;

    @ObfuscatedName("hf.as")
    public int field1915 = Integer.MIN_VALUE;

    @ObfuscatedName("hf.ay")
    public class193 field1916 = class193.field1992;

    @ObfuscatedName("hf.aj")
    public class197 field1917 = class197.field2057;

    @ObfuscatedName("hf.av")
    public int[] field1918;

    @ObfuscatedName("hf.aw")
    public byte[] field1919;

    @ObfuscatedName("hf.an")
    public int field1908 = -1;

    public class184(int arg0) {
        this.field1901 = arg0;
    }

    @ObfuscatedName("fq.ac(II)Lhf;")
    public static class184 method3200(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1911.length || Statics.field1911[arg0] == null ? new class184(arg0) : Statics.field1911[arg0];
    }

    @ObfuscatedName("hf.ae(Lvf;I)V")
    public void method3476(class551 arg0) {
        while (true) {
            int var2 = arg0.method8955();
            if (var2 == 0) {
                return;
            }
            this.method3464(arg0, var2);
        }
    }

    @ObfuscatedName("hf.ag(Lvf;II)V")
    public void method3464(class551 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1902 = arg0.method9205();
        } else if (arg1 == 2) {
            this.field1903 = arg0.method9205();
        } else if (arg1 == 3) {
            this.field1900 = arg0.method9166();
        } else if (arg1 == 4) {
            this.field1905 = arg0.method8978();
        } else if (arg1 == 5) {
            arg0.method8978();
        } else if (arg1 == 6) {
            this.field1906 = arg0.method8955();
        } else if (arg1 == 7) {
            int var3 = arg0.method8955();
            if ((var3 & 0x1) == 0) {
                this.field1907 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1910 = true;
            }
        } else if (arg1 == 8) {
            arg0.method8955();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1909[arg1 - 10] = arg0.method9166();
        } else if (arg1 == 15) {
            int var4 = arg0.method8955();
            this.field1899 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1899[var5] = arg0.method8977();
            }
            arg0.method9110();
            int var6 = arg0.method8955();
            this.field1918 = new int[var6];
            for (int var7 = 0; var7 < this.field1918.length; var7++) {
                this.field1918[var7] = arg0.method9110();
            }
            this.field1919 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1919[var8] = arg0.method8975();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1912 = arg0.method9166();
            } else if (arg1 == 18) {
                arg0.method9205();
            } else if (arg1 == 19) {
                this.field1908 = arg0.method9119();
            } else if (arg1 == 21) {
                arg0.method9110();
            } else if (arg1 == 22) {
                arg0.method9110();
            } else if (arg1 == 23) {
                arg0.method8955();
                arg0.method8955();
                arg0.method8955();
            } else if (arg1 == 24) {
                arg0.method8977();
                arg0.method8977();
            } else if (arg1 == 25) {
                arg0.method9205();
            } else if (arg1 == 28) {
                arg0.method8955();
            } else if (arg1 == 29) {
                class193[] var9 = new class193[] { class193.field1986, class193.field1985, class193.field1992 };
                this.field1916 = (class193) class405.method6719(var9, arg0.method8955());
            } else if (arg1 == 30) {
                class197[] var10 = new class197[] { class197.field2057, class197.field2061, class197.field2056 };
                this.field1917 = (class197) class405.method6719(var10, arg0.method8955());
            }
        }
    }

    @ObfuscatedName("hf.am(I)V")
    public void method3463() {
        if (this.field1899 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1899.length; var1 += 2) {
            if (this.field1899[var1] < this.field1904) {
                this.field1904 = this.field1899[var1];
            } else if (this.field1899[var1] > this.field1914) {
                this.field1914 = this.field1899[var1];
            }
            if (this.field1899[var1 + 1] < this.field1913) {
                this.field1913 = this.field1899[var1 + 1];
            } else if (this.field1899[var1 + 1] > this.field1915) {
                this.field1915 = this.field1899[var1 + 1];
            }
        }
    }

    @ObfuscatedName("hf.ax(ZI)Lvv;")
    public class565 method3467(boolean arg0) {
        int var2 = arg0 ? this.field1903 : this.field1902;
        return this.method3466(var2);
    }

    @ObfuscatedName("hf.aq(II)Lvv;")
    public class565 method3466(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class565 var2 = (class565) field1920.method5733((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class565 var3 = class566.method8084(Statics.field1667, arg0, 0);
        if (var3 != null) {
            field1920.method5735(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("hf.af(I)I")
    public int method3473() {
        return this.field1901;
    }
}
