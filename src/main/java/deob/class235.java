package deob;

@ObfuscatedName("ie")
public class class235 extends class149 {

    @ObfuscatedName("ie.p")
    public int field3285;

    @ObfuscatedName("ie.u")
    public boolean field3286;

    @ObfuscatedName("ie.m")
    public int field3306;

    @ObfuscatedName("ie.ao")
    public int field3293;

    @ObfuscatedName("ie.ak")
    public int field3301;

    @ObfuscatedName("ie.aa")
    public int field3295;

    @ObfuscatedName("ie.aj")
    public int field3296;

    @ObfuscatedName("ie.ay")
    public boolean field3297;

    @ObfuscatedName("ie.ae")
    public int field3298;

    @ObfuscatedName("ie.av")
    public int field3313;

    @ObfuscatedName("ie.ag")
    public int field3300;

    @ObfuscatedName("ie.af")
    public int field3289;

    @ObfuscatedName("ie.ar")
    public String field3282;

    @ObfuscatedName("ie.ab")
    public String field3303;

    @ObfuscatedName("ie.as")
    public String field3304;

    @ObfuscatedName("ie.ai")
    public String field3305;

    @ObfuscatedName("ie.ad")
    public int field3307;

    @ObfuscatedName("ie.an")
    public int field3290;

    @ObfuscatedName("ie.al")
    public int field3308;

    @ObfuscatedName("ie.at")
    public int field3309;

    @ObfuscatedName("ie.ah")
    public String field3310;

    @ObfuscatedName("ie.ap")
    public String field3311;

    @ObfuscatedName("ie.au")
    public int[] field3312 = new int[3];

    @ObfuscatedName("ie.bu")
    public int field3288;

    public class235(boolean arg0) {
        if (arg0) {
            if (Statics.field1554.startsWith("win")) {
                this.field3285 = 1;
            } else if (Statics.field1554.startsWith("mac")) {
                this.field3285 = 2;
            } else if (Statics.field1554.startsWith("linux")) {
                this.field3285 = 3;
            } else {
                this.field3285 = 4;
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
                this.field3286 = true;
            } else {
                this.field3286 = false;
            }
            if (this.field3285 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3306 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3306 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3306 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3306 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3306 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3306 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3306 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3306 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3306 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3306 = 10;
                }
            } else if (this.field3285 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3306 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3306 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3306 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3306 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3306 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3306 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3306 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3293 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3293 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3293 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3293 = 4;
            } else {
                this.field3293 = 5;
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
            this.field3301 = var10;
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
            this.field3295 = var14;
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
            this.field3296 = var18;
            this.field3297 = false;
            this.field3298 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3301 > 3) {
                this.field3313 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3313 = 0;
            }
            this.field3300 = 0;
        }
        if (this.field3282 == null) {
            this.field3282 = "";
        }
        if (this.field3303 == null) {
            this.field3303 = "";
        }
        if (this.field3304 == null) {
            this.field3304 = "";
        }
        if (this.field3305 == null) {
            this.field3305 = "";
        }
        if (this.field3310 == null) {
            this.field3310 = "";
        }
        if (this.field3311 == null) {
            this.field3311 = "";
        }
        this.method4093();
    }

    @ObfuscatedName("ie.d(B)V")
    public void method4093() {
        if (this.field3282.length() > 40) {
            this.field3282 = this.field3282.substring(0, 40);
        }
        if (this.field3303.length() > 40) {
            this.field3303 = this.field3303.substring(0, 40);
        }
        if (this.field3304.length() > 10) {
            this.field3304 = this.field3304.substring(0, 10);
        }
        if (this.field3305.length() > 10) {
            this.field3305 = this.field3305.substring(0, 10);
        }
    }

    @ObfuscatedName("ie.c(Ldu;I)V")
    public void method4092(class130 arg0) {
        arg0.method2215(6);
        arg0.method2215(this.field3285);
        arg0.method2215(this.field3286 ? 1 : 0);
        arg0.method2215(this.field3306);
        arg0.method2215(this.field3293);
        arg0.method2215(this.field3301);
        arg0.method2215(this.field3295);
        arg0.method2215(this.field3296);
        arg0.method2215(this.field3297 ? 1 : 0);
        arg0.method2216(this.field3298);
        arg0.method2215(this.field3313);
        arg0.method2305(this.field3300);
        arg0.method2216(this.field3289);
        arg0.method2294(this.field3282);
        arg0.method2294(this.field3303);
        arg0.method2294(this.field3304);
        arg0.method2294(this.field3305);
        arg0.method2215(this.field3290);
        arg0.method2216(this.field3307);
        arg0.method2294(this.field3310);
        arg0.method2294(this.field3311);
        arg0.method2215(this.field3308);
        arg0.method2215(this.field3309);
        for (int var2 = 0; var2 < this.field3312.length; var2++) {
            arg0.method2218(this.field3312[var2]);
        }
        arg0.method2218(this.field3288);
    }

    @ObfuscatedName("ie.n(I)I")
    public int method4095() {
        byte var1 = 38;
        int var2 = var1 + class130.method1480(this.field3282);
        int var3 = var2 + class130.method1480(this.field3303);
        int var4 = var3 + class130.method1480(this.field3304);
        int var5 = var4 + class130.method1480(this.field3305);
        int var6 = var5 + class130.method1480(this.field3310);
        return var6 + class130.method1480(this.field3311);
    }
}
