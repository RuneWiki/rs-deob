package deob;

@ObfuscatedName("hb")
public class class231 extends class128 {

    @ObfuscatedName("hb.h")
    public int field3271;

    @ObfuscatedName("hb.n")
    public boolean field3272;

    @ObfuscatedName("hb.d")
    public int field3278;

    @ObfuscatedName("hb.aw")
    public int field3279;

    @ObfuscatedName("hb.ac")
    public int field3280;

    @ObfuscatedName("hb.an")
    public int field3281;

    @ObfuscatedName("hb.ae")
    public int field3291;

    @ObfuscatedName("hb.au")
    public boolean field3286;

    @ObfuscatedName("hb.am")
    public int field3284;

    @ObfuscatedName("hb.ay")
    public int field3285;

    @ObfuscatedName("hb.ai")
    public int field3268;

    @ObfuscatedName("hb.aa")
    public int field3283;

    @ObfuscatedName("hb.ar")
    public String field3288;

    @ObfuscatedName("hb.ag")
    public String field3298;

    @ObfuscatedName("hb.ad")
    public String field3290;

    @ObfuscatedName("hb.al")
    public String field3292;

    @ObfuscatedName("hb.ah")
    public int field3282;

    @ObfuscatedName("hb.ak")
    public int field3293;

    @ObfuscatedName("hb.ax")
    public int field3294;

    @ObfuscatedName("hb.av")
    public int field3295;

    @ObfuscatedName("hb.az")
    public String field3299;

    @ObfuscatedName("hb.ao")
    public String field3297;

    @ObfuscatedName("hb.aq")
    public int[] field3273 = new int[3];

    @ObfuscatedName("hb.by")
    public int field3289;

    public class231(boolean arg0) {
        if (arg0) {
            if (Statics.field1686.startsWith("win")) {
                this.field3271 = 1;
            } else if (Statics.field1686.startsWith("mac")) {
                this.field3271 = 2;
            } else if (Statics.field1686.startsWith("linux")) {
                this.field3271 = 3;
            } else {
                this.field3271 = 4;
            }
            String var2;
            try {
                var2 = System.getProperty("os.arch").toLowerCase();
            } catch (Exception var23) {
                var2 = "";
            }
            String var4;
            try {
                var4 = System.getProperty("os.version").toLowerCase();
            } catch (Exception var22) {
                var4 = "";
            }
            String var6 = "Unknown";
            String var7 = "1.1";
            try {
                var6 = System.getProperty("java.vendor");
                var7 = System.getProperty("java.version");
            } catch (Exception var21) {
            }
            if (var2.startsWith("amd64") || var2.startsWith("x86_64")) {
                this.field3272 = true;
            } else {
                this.field3272 = false;
            }
            if (this.field3271 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3278 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3278 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3278 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3278 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3278 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3278 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3278 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3278 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3278 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3278 = 10;
                }
            } else if (this.field3271 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3278 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3278 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3278 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3278 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3278 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3278 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3278 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3279 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3279 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3279 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3279 = 4;
            } else {
                this.field3279 = 5;
            }
            int var9 = 2;
            int var10 = 0;
            try {
                while (var9 < var7.length()) {
                    char var11 = var7.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10 = var10 * 10 + (var11 - '0');
                    var9++;
                }
            } catch (Exception var26) {
            }
            this.field3280 = var10;
            int var13 = var7.indexOf(46, 2) + 1;
            int var14 = 0;
            try {
                while (var13 < var7.length()) {
                    char var15 = var7.charAt(var13);
                    if (var15 < '0' || var15 > '9') {
                        break;
                    }
                    var14 = var14 * 10 + (var15 - '0');
                    var13++;
                }
            } catch (Exception var25) {
            }
            this.field3281 = var14;
            int var17 = var7.indexOf(95, 4) + 1;
            int var18 = 0;
            try {
                while (var17 < var7.length()) {
                    char var19 = var7.charAt(var17);
                    if (var19 < '0' || var19 > '9') {
                        break;
                    }
                    var18 = var18 * 10 + (var19 - '0');
                    var17++;
                }
            } catch (Exception var24) {
            }
            this.field3291 = var18;
            this.field3286 = false;
            this.field3284 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3280 > 3) {
                this.field3285 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3285 = 0;
            }
            this.field3268 = 0;
        }
        if (this.field3288 == null) {
            this.field3288 = "";
        }
        if (this.field3298 == null) {
            this.field3298 = "";
        }
        if (this.field3290 == null) {
            this.field3290 = "";
        }
        if (this.field3292 == null) {
            this.field3292 = "";
        }
        if (this.field3299 == null) {
            this.field3299 = "";
        }
        if (this.field3297 == null) {
            this.field3297 = "";
        }
        this.method4134();
    }

    @ObfuscatedName("hb.b(I)V")
    public void method4134() {
        if (this.field3288.length() > 40) {
            this.field3288 = this.field3288.substring(0, 40);
        }
        if (this.field3298.length() > 40) {
            this.field3298 = this.field3298.substring(0, 40);
        }
        if (this.field3290.length() > 10) {
            this.field3290 = this.field3290.substring(0, 10);
        }
        if (this.field3292.length() > 10) {
            this.field3292 = this.field3292.substring(0, 10);
        }
    }

    @ObfuscatedName("hb.l(Leg;I)V")
    public void method4139(class154 arg0) {
        arg0.method2832(6);
        arg0.method2832(this.field3271);
        arg0.method2832(this.field3272 ? 1 : 0);
        arg0.method2832(this.field3278);
        arg0.method2832(this.field3279);
        arg0.method2832(this.field3280);
        arg0.method2832(this.field3281);
        arg0.method2832(this.field3291);
        arg0.method2832(this.field3286 ? 1 : 0);
        arg0.method2664(this.field3284);
        arg0.method2832(this.field3285);
        arg0.method2684(this.field3268);
        arg0.method2664(this.field3283);
        arg0.method2877(this.field3288);
        arg0.method2877(this.field3298);
        arg0.method2877(this.field3290);
        arg0.method2877(this.field3292);
        arg0.method2832(this.field3293);
        arg0.method2664(this.field3282);
        arg0.method2877(this.field3299);
        arg0.method2877(this.field3297);
        arg0.method2832(this.field3294);
        arg0.method2832(this.field3295);
        for (int var2 = 0; var2 < this.field3273.length; var2++) {
            arg0.method2666(this.field3273[var2]);
        }
        arg0.method2666(this.field3289);
    }

    @ObfuscatedName("hb.i(I)I")
    public int method4133() {
        byte var1 = 38;
        int var2 = var1 + class154.method3849(this.field3288);
        int var3 = var2 + class154.method3849(this.field3298);
        int var4 = var3 + class154.method3849(this.field3290);
        int var5 = var4 + class154.method3849(this.field3292);
        int var6 = var5 + class154.method3849(this.field3299);
        return var6 + class154.method3849(this.field3297);
    }
}
