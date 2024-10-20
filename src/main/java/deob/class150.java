package deob;

@ObfuscatedName("eu")
public class class150 extends class191 {

    @ObfuscatedName("eu.f")
    public int field2436;

    @ObfuscatedName("eu.z")
    public boolean field2459;

    @ObfuscatedName("eu.t")
    public int field2455;

    @ObfuscatedName("eu.ax")
    public int field2462;

    @ObfuscatedName("eu.av")
    public int field2433;

    @ObfuscatedName("eu.al")
    public int field2445;

    @ObfuscatedName("eu.ab")
    public int field2434;

    @ObfuscatedName("eu.ac")
    public boolean field2447;

    @ObfuscatedName("eu.aq")
    public int field2448;

    @ObfuscatedName("eu.ah")
    public int field2431;

    @ObfuscatedName("eu.ap")
    public int field2450;

    @ObfuscatedName("eu.as")
    public int field2451;

    @ObfuscatedName("eu.au")
    public String field2452;

    @ObfuscatedName("eu.ag")
    public String field2443;

    @ObfuscatedName("eu.an")
    public String field2454;

    @ObfuscatedName("eu.ad")
    public String field2458;

    @ObfuscatedName("eu.ae")
    public int field2456;

    @ObfuscatedName("eu.ak")
    public int field2457;

    @ObfuscatedName("eu.ay")
    public int field2444;

    @ObfuscatedName("eu.ao")
    public int field2453;

    @ObfuscatedName("eu.ai")
    public String field2460;

    @ObfuscatedName("eu.aa")
    public String field2464;

    @ObfuscatedName("eu.aj")
    public int[] field2446 = new int[3];

    @ObfuscatedName("eu.be")
    public int field2463;

    public class150(boolean arg0) {
        if (arg0) {
            if (Statics.field935.startsWith("win")) {
                this.field2436 = 1;
            } else if (Statics.field935.startsWith("mac")) {
                this.field2436 = 2;
            } else if (Statics.field935.startsWith("linux")) {
                this.field2436 = 3;
            } else {
                this.field2436 = 4;
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
                this.field2459 = true;
            } else {
                this.field2459 = false;
            }
            if (this.field2436 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2455 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2455 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2455 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2455 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2455 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2455 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2455 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2455 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2455 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2455 = 10;
                }
            } else if (this.field2436 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2455 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2455 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2455 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2455 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2455 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2455 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2455 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2462 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2462 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2462 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2462 = 4;
            } else {
                this.field2462 = 5;
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
            this.field2433 = var10;
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
            this.field2445 = var14;
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
            this.field2434 = var18;
            this.field2447 = false;
            this.field2448 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2433 > 3) {
                this.field2431 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2431 = 0;
            }
            this.field2450 = 0;
        }
        if (this.field2452 == null) {
            this.field2452 = "";
        }
        if (this.field2443 == null) {
            this.field2443 = "";
        }
        if (this.field2454 == null) {
            this.field2454 = "";
        }
        if (this.field2458 == null) {
            this.field2458 = "";
        }
        if (this.field2460 == null) {
            this.field2460 = "";
        }
        if (this.field2464 == null) {
            this.field2464 = "";
        }
        this.method2733();
    }

    @ObfuscatedName("eu.p(B)V")
    public void method2733() {
        if (this.field2452.length() > 40) {
            this.field2452 = this.field2452.substring(0, 40);
        }
        if (this.field2443.length() > 40) {
            this.field2443 = this.field2443.substring(0, 40);
        }
        if (this.field2454.length() > 10) {
            this.field2454 = this.field2454.substring(0, 10);
        }
        if (this.field2458.length() > 10) {
            this.field2458 = this.field2458.substring(0, 10);
        }
    }

    @ObfuscatedName("eu.y(Ldg;I)V")
    public void method2735(class110 arg0) {
        arg0.method2110(6);
        arg0.method2110(this.field2436);
        arg0.method2110(this.field2459 ? 1 : 0);
        arg0.method2110(this.field2455);
        arg0.method2110(this.field2462);
        arg0.method2110(this.field2433);
        arg0.method2110(this.field2445);
        arg0.method2110(this.field2434);
        arg0.method2110(this.field2447 ? 1 : 0);
        arg0.method2111(this.field2448);
        arg0.method2110(this.field2431);
        arg0.method2112(this.field2450);
        arg0.method2111(this.field2451);
        arg0.method2116(this.field2452);
        arg0.method2116(this.field2443);
        arg0.method2116(this.field2454);
        arg0.method2116(this.field2458);
        arg0.method2110(this.field2457);
        arg0.method2111(this.field2456);
        arg0.method2116(this.field2460);
        arg0.method2116(this.field2464);
        arg0.method2110(this.field2444);
        arg0.method2110(this.field2453);
        for (int var2 = 0; var2 < this.field2446.length; var2++) {
            arg0.method2113(this.field2446[var2]);
        }
        arg0.method2113(this.field2463);
    }

    @ObfuscatedName("eu.d(I)I")
    public int method2736() {
        byte var1 = 38;
        int var2 = var1 + class110.method855(this.field2452);
        int var3 = var2 + class110.method855(this.field2443);
        int var4 = var3 + class110.method855(this.field2454);
        int var5 = var4 + class110.method855(this.field2458);
        int var6 = var5 + class110.method855(this.field2460);
        return var6 + class110.method855(this.field2464);
    }
}
