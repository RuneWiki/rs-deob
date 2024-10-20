package deob;

@ObfuscatedName("ex")
public class class145 extends class186 {

    @ObfuscatedName("ex.r")
    public int field2409;

    @ObfuscatedName("ex.l")
    public boolean field2410;

    @ObfuscatedName("ex.z")
    public int field2418;

    @ObfuscatedName("ex.m")
    public int field2408;

    @ObfuscatedName("ex.ay")
    public int field2417;

    @ObfuscatedName("ex.ae")
    public int field2416;

    @ObfuscatedName("ex.af")
    public int field2419;

    @ObfuscatedName("ex.ab")
    public boolean field2413;

    @ObfuscatedName("ex.ao")
    public int field2436;

    @ObfuscatedName("ex.ah")
    public int field2428;

    @ObfuscatedName("ex.al")
    public int field2423;

    @ObfuscatedName("ex.av")
    public int field2424;

    @ObfuscatedName("ex.ap")
    public String field2415;

    @ObfuscatedName("ex.ar")
    public String field2426;

    @ObfuscatedName("ex.au")
    public String field2422;

    @ObfuscatedName("ex.aq")
    public String field2425;

    @ObfuscatedName("ex.at")
    public int field2429;

    @ObfuscatedName("ex.ag")
    public int field2430;

    @ObfuscatedName("ex.am")
    public int field2431;

    @ObfuscatedName("ex.aw")
    public int field2432;

    @ObfuscatedName("ex.ac")
    public String field2433;

    @ObfuscatedName("ex.as")
    public String field2434;

    @ObfuscatedName("ex.az")
    public int[] field2404 = new int[3];

    @ObfuscatedName("ex.ad")
    public int field2427;

    public class145(boolean arg0) {
        if (arg0) {
            if (Statics.field1928.startsWith("win")) {
                this.field2409 = 1;
            } else if (Statics.field1928.startsWith("mac")) {
                this.field2409 = 2;
            } else if (Statics.field1928.startsWith("linux")) {
                this.field2409 = 3;
            } else {
                this.field2409 = 4;
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
                this.field2410 = true;
            } else {
                this.field2410 = false;
            }
            if (this.field2409 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2418 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2418 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2418 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2418 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2418 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2418 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2418 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2418 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2418 = 9;
                }
            } else if (this.field2409 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2418 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2418 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2418 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2418 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2408 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2408 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2408 = 4;
            } else {
                this.field2408 = 3;
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
            this.field2417 = var10;
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
            this.field2416 = var14;
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
            this.field2419 = var18;
            this.field2413 = false;
            this.field2436 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2417 > 3) {
                this.field2428 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2428 = 0;
            }
            this.field2423 = 0;
        }
        if (this.field2415 == null) {
            this.field2415 = "";
        }
        if (this.field2426 == null) {
            this.field2426 = "";
        }
        if (this.field2422 == null) {
            this.field2422 = "";
        }
        if (this.field2425 == null) {
            this.field2425 = "";
        }
        if (this.field2433 == null) {
            this.field2433 = "";
        }
        if (this.field2434 == null) {
            this.field2434 = "";
        }
        this.method2625();
    }

    @ObfuscatedName("ex.e(B)V")
    public void method2625() {
        if (this.field2415.length() > 40) {
            this.field2415 = this.field2415.substring(0, 40);
        }
        if (this.field2426.length() > 40) {
            this.field2426 = this.field2426.substring(0, 40);
        }
        if (this.field2422.length() > 10) {
            this.field2422 = this.field2422.substring(0, 10);
        }
        if (this.field2425.length() > 10) {
            this.field2425 = this.field2425.substring(0, 10);
        }
    }

    @ObfuscatedName("ex.o(Ldl;B)V")
    public void method2631(class107 arg0) {
        arg0.method2051(6);
        arg0.method2051(this.field2409);
        arg0.method2051(this.field2410 ? 1 : 0);
        arg0.method2051(this.field2418);
        arg0.method2051(this.field2408);
        arg0.method2051(this.field2417);
        arg0.method2051(this.field2416);
        arg0.method2051(this.field2419);
        arg0.method2051(this.field2413 ? 1 : 0);
        arg0.method2052(this.field2436);
        arg0.method2051(this.field2428);
        arg0.method2053(this.field2423);
        arg0.method2052(this.field2424);
        arg0.method2240(this.field2415);
        arg0.method2240(this.field2426);
        arg0.method2240(this.field2422);
        arg0.method2240(this.field2425);
        arg0.method2051(this.field2430);
        arg0.method2052(this.field2429);
        arg0.method2240(this.field2433);
        arg0.method2240(this.field2434);
        arg0.method2051(this.field2431);
        arg0.method2051(this.field2432);
        for (int var2 = 0; var2 < this.field2404.length; var2++) {
            arg0.method2054(this.field2404[var2]);
        }
        arg0.method2054(this.field2427);
    }

    @ObfuscatedName("ex.y(I)I")
    public int method2624() {
        byte var1 = 38;
        int var2 = var1 + class107.method571(this.field2415);
        int var3 = var2 + class107.method571(this.field2426);
        int var4 = var3 + class107.method571(this.field2422);
        int var5 = var4 + class107.method571(this.field2425);
        int var6 = var5 + class107.method571(this.field2433);
        return var6 + class107.method571(this.field2434);
    }
}
