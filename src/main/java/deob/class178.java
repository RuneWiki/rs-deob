package deob;

@ObfuscatedName("gw")
public class class178 extends class485 {

    @ObfuscatedName("gw.aj")
    public static class302 field1841 = new class302(256);

    @ObfuscatedName("gw.aq")
    public final int field1842;

    @ObfuscatedName("gw.ar")
    public int field1843 = -1;

    @ObfuscatedName("gw.ag")
    public int field1855 = -1;

    @ObfuscatedName("gw.ao")
    public String field1845;

    @ObfuscatedName("gw.ae")
    public int field1846;

    @ObfuscatedName("gw.aa")
    public int field1844 = 0;

    @ObfuscatedName("gw.an")
    public boolean field1849 = true;

    @ObfuscatedName("gw.ad")
    public boolean field1850 = false;

    @ObfuscatedName("gw.ax")
    public String[] field1852 = new String[5];

    @ObfuscatedName("gw.aw")
    public String field1856;

    @ObfuscatedName("gw.az")
    public int[] field1863;

    @ObfuscatedName("gw.av")
    public int field1854 = Integer.MAX_VALUE;

    @ObfuscatedName("gw.ak")
    public int field1840 = Integer.MAX_VALUE;

    @ObfuscatedName("gw.ay")
    public int field1839 = Integer.MIN_VALUE;

    @ObfuscatedName("gw.as")
    public int field1857 = Integer.MIN_VALUE;

    @ObfuscatedName("gw.ab")
    public class187 field1858 = class187.field1935;

    @ObfuscatedName("gw.ah")
    public class191 field1859 = class191.field2002;

    @ObfuscatedName("gw.ai")
    public int[] field1860;

    @ObfuscatedName("gw.ac")
    public byte[] field1861;

    @ObfuscatedName("gw.al")
    public int field1862 = -1;

    public class178(int arg0) {
        this.field1842 = arg0;
    }

    @ObfuscatedName("qy.am(IS)Lgw;")
    public static class178 method7281(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1851.length || Statics.field1851[arg0] == null ? new class178(arg0) : Statics.field1851[arg0];
    }

    @ObfuscatedName("gw.ap(Luk;I)V")
    public void method3303(class531 arg0) {
        while (true) {
            int var2 = arg0.method8561();
            if (var2 == 0) {
                return;
            }
            this.method3276(arg0, var2);
        }
    }

    @ObfuscatedName("gw.af(Luk;II)V")
    public void method3276(class531 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1843 = arg0.method8721();
        } else if (arg1 == 2) {
            this.field1855 = arg0.method8721();
        } else if (arg1 == 3) {
            this.field1845 = arg0.method8641();
        } else if (arg1 == 4) {
            this.field1846 = arg0.method8688();
        } else if (arg1 == 5) {
            arg0.method8688();
        } else if (arg1 == 6) {
            this.field1844 = arg0.method8561();
        } else if (arg1 == 7) {
            int var3 = arg0.method8561();
            if ((var3 & 0x1) == 0) {
                this.field1849 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1850 = true;
            }
        } else if (arg1 == 8) {
            arg0.method8561();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1852[arg1 - 10] = arg0.method8641();
        } else if (arg1 == 15) {
            int var4 = arg0.method8561();
            this.field1863 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1863[var5] = arg0.method8564();
            }
            arg0.method8566();
            int var6 = arg0.method8561();
            this.field1860 = new int[var6];
            for (int var7 = 0; var7 < this.field1860.length; var7++) {
                this.field1860[var7] = arg0.method8566();
            }
            this.field1861 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1861[var8] = arg0.method8562();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1856 = arg0.method8641();
            } else if (arg1 == 18) {
                arg0.method8721();
            } else if (arg1 == 19) {
                this.field1862 = arg0.method8775();
            } else if (arg1 == 21) {
                arg0.method8566();
            } else if (arg1 == 22) {
                arg0.method8566();
            } else if (arg1 == 23) {
                arg0.method8561();
                arg0.method8561();
                arg0.method8561();
            } else if (arg1 == 24) {
                arg0.method8564();
                arg0.method8564();
            } else if (arg1 == 25) {
                arg0.method8721();
            } else if (arg1 == 28) {
                arg0.method8561();
            } else if (arg1 == 29) {
                class187[] var9 = new class187[] { class187.field1938, class187.field1936, class187.field1935 };
                this.field1858 = (class187) class389.method6514(var9, arg0.method8561());
            } else if (arg1 == 30) {
                class191[] var10 = new class191[] { class191.field2005, class191.field2002, class191.field2007 };
                this.field1859 = (class191) class389.method6514(var10, arg0.method8561());
            }
        }
    }

    @ObfuscatedName("gw.aj(B)V")
    public void method3278() {
        if (this.field1863 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1863.length; var1 += 2) {
            if (this.field1863[var1] < this.field1854) {
                this.field1854 = this.field1863[var1];
            } else if (this.field1863[var1] > this.field1839) {
                this.field1839 = this.field1863[var1];
            }
            if (this.field1863[var1 + 1] < this.field1840) {
                this.field1840 = this.field1863[var1 + 1];
            } else if (this.field1863[var1 + 1] > this.field1857) {
                this.field1857 = this.field1863[var1 + 1];
            }
        }
    }

    @ObfuscatedName("gw.aq(ZI)Luc;")
    public class545 method3275(boolean arg0) {
        int var2 = arg0 ? this.field1855 : this.field1843;
        return this.method3280(var2);
    }

    @ObfuscatedName("gw.ar(II)Luc;")
    public class545 method3280(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class545 var2 = (class545) field1841.method5400((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class545 var3 = class546.method3015(Statics.field1847, arg0, 0);
        if (var3 != null) {
            field1841.method5402(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("gw.ag(I)I")
    public int method3277() {
        return this.field1842;
    }

    @ObfuscatedName("jn.ao(B)V")
    public static void method4570() {
        field1841.method5403();
    }
}
