package deob;

@ObfuscatedName("hm")
public class class205 extends class469 {

    @ObfuscatedName("hm.at")
    public static class288 field2169 = new class288(64);

    @ObfuscatedName("hm.ac")
    public static class288 field2150 = new class288(64);

    @ObfuscatedName("hm.ai")
    public static class288 field2161 = new class288(20);

    @ObfuscatedName("hm.aq")
    public int field2153 = -1;

    @ObfuscatedName("hm.al")
    public int field2151 = 16777215;

    @ObfuscatedName("hm.an")
    public int field2162 = 70;

    @ObfuscatedName("hm.ar")
    public int field2156 = -1;

    @ObfuscatedName("hm.ab")
    public int field2157 = -1;

    @ObfuscatedName("hm.ag")
    public int field2158 = -1;

    @ObfuscatedName("hm.am")
    public int field2159 = -1;

    @ObfuscatedName("hm.ax")
    public int field2160 = 0;

    @ObfuscatedName("hm.ah")
    public int field2154 = 0;

    @ObfuscatedName("hm.as")
    public int field2148 = -1;

    @ObfuscatedName("hm.ay")
    public String field2163 = "";

    @ObfuscatedName("hm.aj")
    public int field2155 = -1;

    @ObfuscatedName("hm.av")
    public int field2164 = 0;

    @ObfuscatedName("hm.aw")
    public int[] field2166;

    @ObfuscatedName("hm.ak")
    public int field2167 = -1;

    @ObfuscatedName("hm.bh")
    public int field2168 = -1;

    @ObfuscatedName("kr.au(IB)Lhm;")
    public static class205 method5085(int arg0) {
        class205 var1 = (class205) field2169.method5182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2165.method6128(32, arg0);
        class205 var3 = new class205();
        if (var2 != null) {
            var3.method3560(new class515(var2));
        }
        field2169.method5177(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hm.ae(Ltm;B)V")
    public void method3560(class515 arg0) {
        while (true) {
            int var2 = arg0.method8300();
            if (var2 == 0) {
                return;
            }
            this.method3576(arg0, var2);
        }
    }

    @ObfuscatedName("hm.ao(Ltm;IB)V")
    public void method3576(class515 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2153 = arg0.method8440();
        } else if (arg1 == 2) {
            this.field2151 = arg0.method8466();
        } else if (arg1 == 3) {
            this.field2156 = arg0.method8440();
        } else if (arg1 == 4) {
            this.field2158 = arg0.method8440();
        } else if (arg1 == 5) {
            this.field2157 = arg0.method8440();
        } else if (arg1 == 6) {
            this.field2159 = arg0.method8440();
        } else if (arg1 == 7) {
            this.field2160 = arg0.method8303();
        } else if (arg1 == 8) {
            this.field2163 = arg0.method8452();
        } else if (arg1 == 9) {
            this.field2162 = arg0.method8448();
        } else if (arg1 == 10) {
            this.field2154 = arg0.method8303();
        } else if (arg1 == 11) {
            this.field2148 = 0;
        } else if (arg1 == 12) {
            this.field2155 = arg0.method8300();
        } else if (arg1 == 13) {
            this.field2164 = arg0.method8303();
        } else if (arg1 == 14) {
            this.field2148 = arg0.method8448();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2167 = arg0.method8448();
            if (this.field2167 == 65535) {
                this.field2167 = -1;
            }
            this.field2168 = arg0.method8448();
            if (this.field2168 == 65535) {
                this.field2168 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method8448();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method8300();
            this.field2166 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2166[var5] = arg0.method8448();
                if (this.field2166[var5] == 65535) {
                    this.field2166[var5] = -1;
                }
            }
            this.field2166[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("hm.at(I)Lhm;")
    public final class205 method3562() {
        int var1 = -1;
        if (this.field2167 != -1) {
            var1 = class322.method2448(this.field2167);
        } else if (this.field2168 != -1) {
            var1 = class322.field3540[this.field2168];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2166.length - 1) {
            var2 = this.field2166[var1];
        } else {
            var2 = this.field2166[this.field2166.length - 1];
        }
        return var2 == -1 ? null : method5085(var2);
    }

    @ObfuscatedName("hm.ac(IB)Ljava/lang/String;")
    public String method3572(int arg0) {
        String var2 = this.field2163;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class387.method1108(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("hm.ai(I)Lui;")
    public class529 method3563() {
        if (this.field2156 < 0) {
            return null;
        }
        class529 var1 = (class529) field2150.method5182((long) this.field2156);
        if (var1 != null) {
            return var1;
        }
        class529 var2 = class530.method2154(Statics.field2147, this.field2156, 0);
        if (var2 != null) {
            field2150.method5177(var2, (long) this.field2156);
        }
        return var2;
    }

    @ObfuscatedName("hm.az(I)Lui;")
    public class529 method3559() {
        if (this.field2157 < 0) {
            return null;
        }
        class529 var1 = (class529) field2150.method5182((long) this.field2157);
        if (var1 != null) {
            return var1;
        }
        class529 var2 = class530.method2154(Statics.field2147, this.field2157, 0);
        if (var2 != null) {
            field2150.method5177(var2, (long) this.field2157);
        }
        return var2;
    }

    @ObfuscatedName("hm.ap(I)Lui;")
    public class529 method3565() {
        if (this.field2158 < 0) {
            return null;
        }
        class529 var1 = (class529) field2150.method5182((long) this.field2158);
        if (var1 != null) {
            return var1;
        }
        class529 var2 = class530.method2154(Statics.field2147, this.field2158, 0);
        if (var2 != null) {
            field2150.method5177(var2, (long) this.field2158);
        }
        return var2;
    }

    @ObfuscatedName("hm.aa(B)Lui;")
    public class529 method3566() {
        if (this.field2159 < 0) {
            return null;
        }
        class529 var1 = (class529) field2150.method5182((long) this.field2159);
        if (var1 != null) {
            return var1;
        }
        class529 var2 = class530.method2154(Statics.field2147, this.field2159, 0);
        if (var2 != null) {
            field2150.method5177(var2, (long) this.field2159);
        }
        return var2;
    }

    @ObfuscatedName("hm.af(I)Lpi;")
    public class394 method3599() {
        if (this.field2153 == -1) {
            return null;
        }
        class394 var1 = (class394) field2161.method5182((long) this.field2153);
        if (var1 != null) {
            return var1;
        }
        class394 var2 = class530.method5206(Statics.field2147, Statics.field2149, this.field2153, 0);
        if (var2 != null) {
            field2161.method5177(var2, (long) this.field2153);
        }
        return var2;
    }

    @ObfuscatedName("pj.ad(I)V")
    public static void method6796() {
        field2169.method5175();
        field2150.method5175();
        field2161.method5175();
    }
}
