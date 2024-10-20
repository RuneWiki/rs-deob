package deob;

@ObfuscatedName("ht")
public class class187 extends class457 {

    @ObfuscatedName("ht.as")
    public static class287 field1923 = new class287(256);

    @ObfuscatedName("ht.ax")
    public final int field1911;

    @ObfuscatedName("ht.ap")
    public int field1912 = -1;

    @ObfuscatedName("ht.ab")
    public int field1915 = -1;

    @ObfuscatedName("ht.ak")
    public String field1914;

    @ObfuscatedName("ht.ae")
    public int field1910;

    @ObfuscatedName("ht.af")
    public int field1916 = 0;

    @ObfuscatedName("ht.aa")
    public boolean field1913 = true;

    @ObfuscatedName("ht.aj")
    public boolean field1909 = false;

    @ObfuscatedName("ht.ad")
    public String[] field1920 = new String[5];

    @ObfuscatedName("ht.ac")
    public String field1930;

    @ObfuscatedName("ht.ag")
    public int[] field1921;

    @ObfuscatedName("ht.ar")
    public int field1922 = Integer.MAX_VALUE;

    @ObfuscatedName("ht.ah")
    public int field1919 = Integer.MAX_VALUE;

    @ObfuscatedName("ht.az")
    public int field1924 = Integer.MIN_VALUE;

    @ObfuscatedName("ht.au")
    public int field1925 = Integer.MIN_VALUE;

    @ObfuscatedName("ht.ai")
    public class193 field1926 = class193.field1984;

    @ObfuscatedName("ht.aq")
    public class196 field1927 = class196.field2043;

    @ObfuscatedName("ht.aw")
    public int[] field1928;

    @ObfuscatedName("ht.ay")
    public byte[] field1929;

    @ObfuscatedName("ht.al")
    public int field1918 = -1;

    public class187(int arg0) {
        this.field1911 = arg0;
    }

    @ObfuscatedName("fo.an(II)Lht;")
    public static class187 method2956(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1917.length || Statics.field1917[arg0] == null ? new class187(arg0) : Statics.field1917[arg0];
    }

    @ObfuscatedName("ht.av(Ltz;B)V")
    public void method3283(class501 arg0) {
        while (true) {
            int var2 = arg0.method8129();
            if (var2 == 0) {
                return;
            }
            this.method3275(arg0, var2);
        }
    }

    @ObfuscatedName("ht.as(Ltz;II)V")
    public void method3275(class501 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1912 = arg0.method8148();
        } else if (arg1 == 2) {
            this.field1915 = arg0.method8148();
        } else if (arg1 == 3) {
            this.field1914 = arg0.method8253();
        } else if (arg1 == 4) {
            this.field1910 = arg0.method8133();
        } else if (arg1 == 5) {
            arg0.method8133();
        } else if (arg1 == 6) {
            this.field1916 = arg0.method8129();
        } else if (arg1 == 7) {
            int var3 = arg0.method8129();
            if ((var3 & 0x1) == 0) {
                this.field1913 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1909 = true;
            }
        } else if (arg1 == 8) {
            arg0.method8129();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1920[arg1 - 10] = arg0.method8253();
        } else if (arg1 == 15) {
            int var4 = arg0.method8129();
            this.field1921 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1921[var5] = arg0.method8268();
            }
            arg0.method8134();
            int var6 = arg0.method8129();
            this.field1928 = new int[var6];
            for (int var7 = 0; var7 < this.field1928.length; var7++) {
                this.field1928[var7] = arg0.method8134();
            }
            this.field1929 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1929[var8] = arg0.method8130();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1930 = arg0.method8253();
            } else if (arg1 == 18) {
                arg0.method8148();
            } else if (arg1 == 19) {
                this.field1918 = arg0.method8195();
            } else if (arg1 == 21) {
                arg0.method8134();
            } else if (arg1 == 22) {
                arg0.method8134();
            } else if (arg1 == 23) {
                arg0.method8129();
                arg0.method8129();
                arg0.method8129();
            } else if (arg1 == 24) {
                arg0.method8268();
                arg0.method8268();
            } else if (arg1 == 25) {
                arg0.method8148();
            } else if (arg1 == 28) {
                arg0.method8129();
            } else if (arg1 == 29) {
                class193[] var9 = new class193[] { class193.field1982, class193.field1983, class193.field1984 };
                this.field1926 = (class193) class371.method4632(var9, arg0.method8129());
            } else if (arg1 == 30) {
                class196[] var10 = new class196[] { class196.field2043, class196.field2044, class196.field2046 };
                this.field1927 = (class196) class371.method4632(var10, arg0.method8129());
            }
        }
    }

    @ObfuscatedName("ht.ax(I)V")
    public void method3276() {
        if (this.field1921 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1921.length; var1 += 2) {
            if (this.field1921[var1] < this.field1922) {
                this.field1922 = this.field1921[var1];
            } else if (this.field1921[var1] > this.field1924) {
                this.field1924 = this.field1921[var1];
            }
            if (this.field1921[var1 + 1] < this.field1919) {
                this.field1919 = this.field1921[var1 + 1];
            } else if (this.field1921[var1 + 1] > this.field1925) {
                this.field1925 = this.field1921[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ht.ap(ZI)Ltm;")
    public class515 method3277(boolean arg0) {
        int var2 = arg0 ? this.field1915 : this.field1912;
        return this.method3278(var2);
    }

    @ObfuscatedName("ht.ab(II)Ltm;")
    public class515 method3278(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class515 var2 = (class515) field1923.method5121((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class515 var3 = class516.method2561(Statics.field4553, arg0, 0);
        if (var3 != null) {
            field1923.method5123(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ht.ak(I)I")
    public int method3279() {
        return this.field1911;
    }
}
