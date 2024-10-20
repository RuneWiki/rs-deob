package deob;

@ObfuscatedName("hp")
public class class195 extends class484 {

    @ObfuscatedName("hp.ax")
    public static class302 field1934 = new class302(256);

    @ObfuscatedName("hp.ao")
    public final int field1956;

    @ObfuscatedName("hp.ah")
    public int field1936 = -1;

    @ObfuscatedName("hp.ar")
    public int field1948 = -1;

    @ObfuscatedName("hp.ab")
    public String field1937;

    @ObfuscatedName("hp.am")
    public int field1954;

    @ObfuscatedName("hp.av")
    public int field1939 = 0;

    @ObfuscatedName("hp.aa")
    public boolean field1941 = true;

    @ObfuscatedName("hp.ap")
    public boolean field1942 = false;

    @ObfuscatedName("hp.ay")
    public String[] field1943 = new String[5];

    @ObfuscatedName("hp.as")
    public String field1944;

    @ObfuscatedName("hp.aj")
    public int[] field1945;

    @ObfuscatedName("hp.an")
    public int field1946 = Integer.MAX_VALUE;

    @ObfuscatedName("hp.au")
    public int field1951 = Integer.MAX_VALUE;

    @ObfuscatedName("hp.ai")
    public int field1938 = Integer.MIN_VALUE;

    @ObfuscatedName("hp.ae")
    public int field1949 = Integer.MIN_VALUE;

    @ObfuscatedName("hp.aw")
    public class204 field1950 = class204.field2030;

    @ObfuscatedName("hp.aq")
    public class208 field1932 = class208.field2093;

    @ObfuscatedName("hp.az")
    public int[] field1947;

    @ObfuscatedName("hp.at")
    public byte[] field1953;

    @ObfuscatedName("hp.af")
    public int field1935 = -1;

    public class195(int arg0) {
        this.field1956 = arg0;
    }

    @ObfuscatedName("ff.ac(II)Lhp;")
    public static class195 method2991(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1933.length || Statics.field1933[arg0] == null ? new class195(arg0) : Statics.field1933[arg0];
    }

    @ObfuscatedName("hp.al(Lul;B)V")
    public void method3341(class530 arg0) {
        while (true) {
            int var2 = arg0.method8365();
            if (var2 == 0) {
                return;
            }
            this.method3342(arg0, var2);
        }
    }

    @ObfuscatedName("hp.ak(Lul;IB)V")
    public void method3342(class530 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1936 = arg0.method8385();
        } else if (arg1 == 2) {
            this.field1948 = arg0.method8385();
        } else if (arg1 == 3) {
            this.field1937 = arg0.method8588();
        } else if (arg1 == 4) {
            this.field1954 = arg0.method8445();
        } else if (arg1 == 5) {
            arg0.method8445();
        } else if (arg1 == 6) {
            this.field1939 = arg0.method8365();
        } else if (arg1 == 7) {
            int var3 = arg0.method8365();
            if ((var3 & 0x1) == 0) {
                this.field1941 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1942 = true;
            }
        } else if (arg1 == 8) {
            arg0.method8365();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1943[arg1 - 10] = arg0.method8588();
        } else if (arg1 == 15) {
            int var4 = arg0.method8365();
            this.field1945 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1945[var5] = arg0.method8368();
            }
            arg0.method8371();
            int var6 = arg0.method8365();
            this.field1947 = new int[var6];
            for (int var7 = 0; var7 < this.field1947.length; var7++) {
                this.field1947[var7] = arg0.method8371();
            }
            this.field1953 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1953[var8] = arg0.method8366();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1944 = arg0.method8588();
            } else if (arg1 == 18) {
                arg0.method8385();
            } else if (arg1 == 19) {
                this.field1935 = arg0.method8598();
            } else if (arg1 == 21) {
                arg0.method8371();
            } else if (arg1 == 22) {
                arg0.method8371();
            } else if (arg1 == 23) {
                arg0.method8365();
                arg0.method8365();
                arg0.method8365();
            } else if (arg1 == 24) {
                arg0.method8368();
                arg0.method8368();
            } else if (arg1 == 25) {
                arg0.method8385();
            } else if (arg1 == 28) {
                arg0.method8365();
            } else if (arg1 == 29) {
                this.field1950 = (class204) class388.method3894(class204.method3462(), arg0.method8365());
            } else if (arg1 == 30) {
                class208[] var9 = new class208[] { class208.field2093, class208.field2097, class208.field2095 };
                this.field1932 = (class208) class388.method3894(var9, arg0.method8365());
            }
        }
    }

    @ObfuscatedName("hp.ax(B)V")
    public void method3361() {
        if (this.field1945 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1945.length; var1 += 2) {
            if (this.field1945[var1] < this.field1946) {
                this.field1946 = this.field1945[var1];
            } else if (this.field1945[var1] > this.field1938) {
                this.field1938 = this.field1945[var1];
            }
            if (this.field1945[var1 + 1] < this.field1951) {
                this.field1951 = this.field1945[var1 + 1];
            } else if (this.field1945[var1 + 1] > this.field1949) {
                this.field1949 = this.field1945[var1 + 1];
            }
        }
    }

    @ObfuscatedName("hp.ao(ZI)Lud;")
    public class544 method3344(boolean arg0) {
        int var2 = arg0 ? this.field1948 : this.field1936;
        return this.method3365(var2);
    }

    @ObfuscatedName("hp.ah(IB)Lud;")
    public class544 method3365(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class544 var2 = (class544) field1934.method5286((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class544 var3 = class545.method842(Statics.field1952, arg0, 0);
        if (var3 != null) {
            field1934.method5289(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("hp.ar(B)I")
    public int method3346() {
        return this.field1956;
    }

    @ObfuscatedName("bz.ab(I)V")
    public static void method467() {
        field1934.method5288();
    }
}
