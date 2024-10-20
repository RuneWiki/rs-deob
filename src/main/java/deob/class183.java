package deob;

@ObfuscatedName("hw")
public class class183 extends class444 {

    @ObfuscatedName("hw.ac")
    public static class280 field1916 = new class280(256);

    @ObfuscatedName("hw.au")
    public final int field1917;

    @ObfuscatedName("hw.ab")
    public int field1929 = -1;

    @ObfuscatedName("hw.aq")
    public int field1919 = -1;

    @ObfuscatedName("hw.al")
    public String field1920;

    @ObfuscatedName("hw.at")
    public int field1918;

    @ObfuscatedName("hw.aa")
    public int field1922 = 0;

    @ObfuscatedName("hw.ao")
    public boolean field1924 = true;

    @ObfuscatedName("hw.ax")
    public boolean field1926 = false;

    @ObfuscatedName("hw.ai")
    public String[] field1921 = new String[5];

    @ObfuscatedName("hw.ag")
    public String field1928;

    @ObfuscatedName("hw.ah")
    public int[] field1914;

    @ObfuscatedName("hw.av")
    public int field1934 = Integer.MAX_VALUE;

    @ObfuscatedName("hw.ar")
    public int field1925 = Integer.MAX_VALUE;

    @ObfuscatedName("hw.am")
    public int field1931 = Integer.MIN_VALUE;

    @ObfuscatedName("hw.as")
    public int field1932 = Integer.MIN_VALUE;

    @ObfuscatedName("hw.aj")
    public class189 field1933 = class189.field1992;

    @ObfuscatedName("hw.ak")
    public class192 field1927 = class192.field2059;

    @ObfuscatedName("hw.az")
    public int[] field1935;

    @ObfuscatedName("hw.ad")
    public byte[] field1936;

    @ObfuscatedName("hw.ae")
    public int field1937 = -1;

    public class183(int arg0) {
        this.field1917 = arg0;
    }

    @ObfuscatedName("bz.af(Lnm;Lnm;I)Z")
    public static boolean method502(class344 arg0, class344 arg1) {
        Statics.field1930 = arg1;
        if (!arg0.method6136()) {
            return false;
        }
        Statics.field3792 = arg0.method6081(35);
        Statics.field1915 = new class183[Statics.field3792];
        for (int var2 = 0; var2 < Statics.field3792; var2++) {
            byte[] var3 = arg0.method6090(35, var2);
            Statics.field1915[var2] = new class183(var2);
            if (var3 != null) {
                Statics.field1915[var2].method3347(new class489(var3));
                Statics.field1915[var2].method3349();
            }
        }
        return true;
    }

    @ObfuscatedName("nf.an(II)Lhw;")
    public static class183 method6285(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1915.length || Statics.field1915[arg0] == null ? new class183(arg0) : Statics.field1915[arg0];
    }

    @ObfuscatedName("hw.aw(Lsg;I)V")
    public void method3347(class489 arg0) {
        while (true) {
            int var2 = arg0.method8248();
            if (var2 == 0) {
                return;
            }
            this.method3368(arg0, var2);
        }
    }

    @ObfuscatedName("hw.ac(Lsg;II)V")
    public void method3368(class489 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1929 = arg0.method8300();
        } else if (arg1 == 2) {
            this.field1919 = arg0.method8300();
        } else if (arg1 == 3) {
            this.field1920 = arg0.method8259();
        } else if (arg1 == 4) {
            this.field1918 = arg0.method8252();
        } else if (arg1 == 5) {
            arg0.method8252();
        } else if (arg1 == 6) {
            this.field1922 = arg0.method8248();
        } else if (arg1 == 7) {
            int var3 = arg0.method8248();
            if ((var3 & 0x1) == 0) {
                this.field1924 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1926 = true;
            }
        } else if (arg1 == 8) {
            arg0.method8248();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1921[arg1 - 10] = arg0.method8259();
        } else if (arg1 == 15) {
            int var4 = arg0.method8248();
            this.field1914 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1914[var5] = arg0.method8445();
            }
            arg0.method8254();
            int var6 = arg0.method8248();
            this.field1935 = new int[var6];
            for (int var7 = 0; var7 < this.field1935.length; var7++) {
                this.field1935[var7] = arg0.method8254();
            }
            this.field1936 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1936[var8] = arg0.method8249();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1928 = arg0.method8259();
            } else if (arg1 == 18) {
                arg0.method8300();
            } else if (arg1 == 19) {
                this.field1937 = arg0.method8250();
            } else if (arg1 == 21) {
                arg0.method8254();
            } else if (arg1 == 22) {
                arg0.method8254();
            } else if (arg1 == 23) {
                arg0.method8248();
                arg0.method8248();
                arg0.method8248();
            } else if (arg1 == 24) {
                arg0.method8445();
                arg0.method8445();
            } else if (arg1 == 25) {
                arg0.method8300();
            } else if (arg1 == 28) {
                arg0.method8248();
            } else if (arg1 == 29) {
                this.field1933 = (class189) Statics.method3600(class189.method8071(), arg0.method8248());
            } else if (arg1 == 30) {
                class192[] var9 = new class192[] { class192.field2055, class192.field2059, class192.field2060 };
                this.field1927 = (class192) Statics.method3600(var9, arg0.method8248());
            }
        }
    }

    @ObfuscatedName("hw.au(I)V")
    public void method3349() {
        if (this.field1914 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1914.length; var1 += 2) {
            if (this.field1914[var1] < this.field1934) {
                this.field1934 = this.field1914[var1];
            } else if (this.field1914[var1] > this.field1931) {
                this.field1931 = this.field1914[var1];
            }
            if (this.field1914[var1 + 1] < this.field1925) {
                this.field1925 = this.field1914[var1 + 1];
            } else if (this.field1914[var1 + 1] > this.field1932) {
                this.field1932 = this.field1914[var1 + 1];
            }
        }
    }

    @ObfuscatedName("hw.ab(ZI)Ltq;")
    public class503 method3350(boolean arg0) {
        int var2 = arg0 ? this.field1919 : this.field1929;
        return this.method3366(var2);
    }

    @ObfuscatedName("hw.aq(II)Ltq;")
    public class503 method3366(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class503 var2 = (class503) field1916.method5119((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class503 var3 = class504.method8178(Statics.field1930, arg0, 0);
        if (var3 != null) {
            field1916.method5121(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("hw.al(I)I")
    public int method3351() {
        return this.field1917;
    }

    @ObfuscatedName("mk.at(I)V")
    public static void method5991() {
        field1916.method5125();
    }
}
