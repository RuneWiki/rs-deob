package deob;

@ObfuscatedName("hd")
public class class188 extends class469 {

    @ObfuscatedName("hd.at")
    public static class288 field1943 = new class288(256);

    @ObfuscatedName("hd.ac")
    public final int field1948;

    @ObfuscatedName("hd.ai")
    public int field1945 = -1;

    @ObfuscatedName("hd.az")
    public int field1946 = -1;

    @ObfuscatedName("hd.ap")
    public String field1947;

    @ObfuscatedName("hd.aa")
    public int field1954;

    @ObfuscatedName("hd.af")
    public int field1949 = 0;

    @ObfuscatedName("hd.aq")
    public boolean field1950 = true;

    @ObfuscatedName("hd.al")
    public boolean field1951 = false;

    @ObfuscatedName("hd.an")
    public String[] field1952 = new String[5];

    @ObfuscatedName("hd.ar")
    public String field1944;

    @ObfuscatedName("hd.ab")
    public int[] field1959;

    @ObfuscatedName("hd.ag")
    public int field1940 = Integer.MAX_VALUE;

    @ObfuscatedName("hd.am")
    public int field1956 = Integer.MAX_VALUE;

    @ObfuscatedName("hd.ax")
    public int field1955 = Integer.MIN_VALUE;

    @ObfuscatedName("hd.ah")
    public int field1958 = Integer.MIN_VALUE;

    @ObfuscatedName("hd.as")
    public class194 field1966 = class194.field2022;

    @ObfuscatedName("hd.ay")
    public class197 field1960 = class197.field2080;

    @ObfuscatedName("hd.aj")
    public int[] field1957;

    @ObfuscatedName("hd.av")
    public byte[] field1961;

    @ObfuscatedName("hd.aw")
    public int field1963 = -1;

    public class188(int arg0) {
        this.field1948 = arg0;
    }

    @ObfuscatedName("fb.au(II)Lhd;")
    public static class188 method2945(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1941.length || Statics.field1941[arg0] == null ? new class188(arg0) : Statics.field1941[arg0];
    }

    @ObfuscatedName("hd.ae(Ltm;I)V")
    public void method3297(class515 arg0) {
        while (true) {
            int var2 = arg0.method8300();
            if (var2 == 0) {
                return;
            }
            this.method3298(arg0, var2);
        }
    }

    @ObfuscatedName("hd.ao(Ltm;II)V")
    public void method3298(class515 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1945 = arg0.method8440();
        } else if (arg1 == 2) {
            this.field1946 = arg0.method8440();
        } else if (arg1 == 3) {
            this.field1947 = arg0.method8311();
        } else if (arg1 == 4) {
            this.field1954 = arg0.method8466();
        } else if (arg1 == 5) {
            arg0.method8466();
        } else if (arg1 == 6) {
            this.field1949 = arg0.method8300();
        } else if (arg1 == 7) {
            int var3 = arg0.method8300();
            if ((var3 & 0x1) == 0) {
                this.field1950 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1951 = true;
            }
        } else if (arg1 == 8) {
            arg0.method8300();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1952[arg1 - 10] = arg0.method8311();
        } else if (arg1 == 15) {
            int var4 = arg0.method8300();
            this.field1959 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1959[var5] = arg0.method8303();
            }
            arg0.method8306();
            int var6 = arg0.method8300();
            this.field1957 = new int[var6];
            for (int var7 = 0; var7 < this.field1957.length; var7++) {
                this.field1957[var7] = arg0.method8306();
            }
            this.field1961 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1961[var8] = arg0.method8301();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1944 = arg0.method8311();
            } else if (arg1 == 18) {
                arg0.method8440();
            } else if (arg1 == 19) {
                this.field1963 = arg0.method8448();
            } else if (arg1 == 21) {
                arg0.method8306();
            } else if (arg1 == 22) {
                arg0.method8306();
            } else if (arg1 == 23) {
                arg0.method8300();
                arg0.method8300();
                arg0.method8300();
            } else if (arg1 == 24) {
                arg0.method8303();
                arg0.method8303();
            } else if (arg1 == 25) {
                arg0.method8440();
            } else if (arg1 == 28) {
                arg0.method8300();
            } else if (arg1 == 29) {
                this.field1966 = (class194) class373.method371(class194.method2719(), arg0.method8300());
            } else if (arg1 == 30) {
                this.field1960 = (class197) class373.method371(class197.method2153(), arg0.method8300());
            }
        }
    }

    @ObfuscatedName("hd.at(B)V")
    public void method3299() {
        if (this.field1959 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1959.length; var1 += 2) {
            if (this.field1959[var1] < this.field1940) {
                this.field1940 = this.field1959[var1];
            } else if (this.field1959[var1] > this.field1955) {
                this.field1955 = this.field1959[var1];
            }
            if (this.field1959[var1 + 1] < this.field1956) {
                this.field1956 = this.field1959[var1 + 1];
            } else if (this.field1959[var1 + 1] > this.field1958) {
                this.field1958 = this.field1959[var1 + 1];
            }
        }
    }

    @ObfuscatedName("hd.ac(ZB)Lui;")
    public class529 method3300(boolean arg0) {
        int var2 = arg0 ? this.field1946 : this.field1945;
        return this.method3301(var2);
    }

    @ObfuscatedName("hd.ai(IB)Lui;")
    public class529 method3301(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class529 var2 = (class529) field1943.method5182((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class529 var3 = class530.method2154(Statics.field1953, arg0, 0);
        if (var3 != null) {
            field1943.method5177(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("hd.az(I)I")
    public int method3302() {
        return this.field1948;
    }
}
