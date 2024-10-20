package deob;

@ObfuscatedName("ep")
public class class151 extends class179 {

    @ObfuscatedName("ep.l")
    public int field2470;

    @ObfuscatedName("ep.g")
    public boolean field2471;

    @ObfuscatedName("ep.q")
    public int field2475;

    @ObfuscatedName("ep.s")
    public int field2486;

    @ObfuscatedName("ep.ah")
    public int field2477;

    @ObfuscatedName("ep.ar")
    public int field2476;

    @ObfuscatedName("ep.ac")
    public int field2479;

    @ObfuscatedName("ep.as")
    public boolean field2480;

    @ObfuscatedName("ep.ag")
    public int field2481;

    @ObfuscatedName("ep.am")
    public int field2482;

    @ObfuscatedName("ep.au")
    public int field2483;

    @ObfuscatedName("ep.aq")
    public int field2484;

    @ObfuscatedName("ep.at")
    public String field2485;

    @ObfuscatedName("ep.aw")
    public String field2491;

    @ObfuscatedName("ep.ai")
    public String field2487;

    @ObfuscatedName("ep.ae")
    public String field2474;

    @ObfuscatedName("ep.ab")
    public int field2489;

    @ObfuscatedName("ep.ay")
    public int field2490;

    @ObfuscatedName("ep.ax")
    public int field2472;

    @ObfuscatedName("ep.ao")
    public int field2492;

    @ObfuscatedName("ep.al")
    public String field2468;

    @ObfuscatedName("ep.az")
    public String field2494;

    @ObfuscatedName("ep.aj")
    public int[] field2495 = new int[3];

    @ObfuscatedName("ep.an")
    public int field2496;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field1046.startsWith("win")) {
                this.field2470 = 1;
            } else if (Statics.field1046.startsWith("mac")) {
                this.field2470 = 2;
            } else if (Statics.field1046.startsWith("linux")) {
                this.field2470 = 3;
            } else {
                this.field2470 = 4;
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
                this.field2471 = true;
            } else {
                this.field2471 = false;
            }
            if (this.field2470 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2475 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2475 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2475 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2475 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2475 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2475 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2475 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2475 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2475 = 9;
                }
            } else if (this.field2470 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2475 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2475 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2475 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2475 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2486 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2486 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2486 = 4;
            } else {
                this.field2486 = 3;
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
            this.field2477 = var10;
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
            this.field2476 = var14;
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
            this.field2479 = var18;
            this.field2480 = false;
            this.field2481 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2477 > 3) {
                this.field2482 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2482 = 0;
            }
            this.field2483 = 0;
        }
        if (this.field2485 == null) {
            this.field2485 = "";
        }
        if (this.field2491 == null) {
            this.field2491 = "";
        }
        if (this.field2487 == null) {
            this.field2487 = "";
        }
        if (this.field2474 == null) {
            this.field2474 = "";
        }
        if (this.field2468 == null) {
            this.field2468 = "";
        }
        if (this.field2494 == null) {
            this.field2494 = "";
        }
        this.method3024();
    }

    @ObfuscatedName("ep.i(B)V")
    public void method3024() {
        if (this.field2485.length() > 40) {
            this.field2485 = this.field2485.substring(0, 40);
        }
        if (this.field2491.length() > 40) {
            this.field2491 = this.field2491.substring(0, 40);
        }
        if (this.field2487.length() > 10) {
            this.field2487 = this.field2487.substring(0, 10);
        }
        if (this.field2474.length() > 10) {
            this.field2474 = this.field2474.substring(0, 10);
        }
    }

    @ObfuscatedName("ep.v(Lda;I)V")
    public void method3021(class127 arg0) {
        arg0.method2477(6);
        arg0.method2477(this.field2470);
        arg0.method2477(this.field2471 ? 1 : 0);
        arg0.method2477(this.field2475);
        arg0.method2477(this.field2486);
        arg0.method2477(this.field2477);
        arg0.method2477(this.field2476);
        arg0.method2477(this.field2479);
        arg0.method2477(this.field2480 ? 1 : 0);
        arg0.method2694(this.field2481);
        arg0.method2477(this.field2482);
        arg0.method2574(this.field2483);
        arg0.method2694(this.field2484);
        arg0.method2495(this.field2485);
        arg0.method2495(this.field2491);
        arg0.method2495(this.field2487);
        arg0.method2495(this.field2474);
        arg0.method2477(this.field2490);
        arg0.method2694(this.field2489);
        arg0.method2495(this.field2468);
        arg0.method2495(this.field2494);
        arg0.method2477(this.field2472);
        arg0.method2477(this.field2492);
        for (int var2 = 0; var2 < this.field2495.length; var2++) {
            arg0.method2480(this.field2495[var2]);
        }
        arg0.method2480(this.field2496);
    }

    @ObfuscatedName("ep.m(I)I")
    public int method3022() {
        byte var1 = 38;
        int var2 = var1 + class127.method2899(this.field2485);
        int var3 = var2 + class127.method2899(this.field2491);
        int var4 = var3 + class127.method2899(this.field2487);
        int var5 = var4 + class127.method2899(this.field2474);
        int var6 = var5 + class127.method2899(this.field2468);
        return var6 + class127.method2899(this.field2494);
    }
}
