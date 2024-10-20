package deob;

@ObfuscatedName("ez")
public class class151 extends class179 {

    @ObfuscatedName("ez.j")
    public int field2463;

    @ObfuscatedName("ez.v")
    public boolean field2460;

    @ObfuscatedName("ez.o")
    public int field2468;

    @ObfuscatedName("ez.z")
    public int field2469;

    @ObfuscatedName("ez.ai")
    public int field2470;

    @ObfuscatedName("ez.ag")
    public int field2477;

    @ObfuscatedName("ez.as")
    public int field2472;

    @ObfuscatedName("ez.al")
    public boolean field2473;

    @ObfuscatedName("ez.aj")
    public int field2474;

    @ObfuscatedName("ez.ab")
    public int field2475;

    @ObfuscatedName("ez.ac")
    public int field2459;

    @ObfuscatedName("ez.ap")
    public int field2461;

    @ObfuscatedName("ez.at")
    public String field2478;

    @ObfuscatedName("ez.az")
    public String field2464;

    @ObfuscatedName("ez.ae")
    public String field2491;

    @ObfuscatedName("ez.ad")
    public String field2487;

    @ObfuscatedName("ez.aw")
    public int field2482;

    @ObfuscatedName("ez.an")
    public int field2483;

    @ObfuscatedName("ez.aq")
    public int field2484;

    @ObfuscatedName("ez.ax")
    public int field2485;

    @ObfuscatedName("ez.af")
    public String field2486;

    @ObfuscatedName("ez.ar")
    public String field2481;

    @ObfuscatedName("ez.ay")
    public int[] field2488 = new int[3];

    @ObfuscatedName("ez.au")
    public int field2489;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field2455.startsWith("win")) {
                this.field2463 = 1;
            } else if (Statics.field2455.startsWith("mac")) {
                this.field2463 = 2;
            } else if (Statics.field2455.startsWith("linux")) {
                this.field2463 = 3;
            } else {
                this.field2463 = 4;
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
                this.field2460 = true;
            } else {
                this.field2460 = false;
            }
            if (this.field2463 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2468 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2468 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2468 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2468 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2468 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2468 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2468 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2468 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2468 = 9;
                }
            } else if (this.field2463 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2468 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2468 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2468 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2468 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2469 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2469 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2469 = 4;
            } else {
                this.field2469 = 3;
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
            this.field2470 = var10;
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
            this.field2477 = var14;
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
            this.field2472 = var18;
            this.field2473 = false;
            this.field2474 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2470 > 3) {
                this.field2475 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2475 = 0;
            }
            this.field2459 = 0;
        }
        if (this.field2478 == null) {
            this.field2478 = "";
        }
        if (this.field2464 == null) {
            this.field2464 = "";
        }
        if (this.field2491 == null) {
            this.field2491 = "";
        }
        if (this.field2487 == null) {
            this.field2487 = "";
        }
        if (this.field2486 == null) {
            this.field2486 = "";
        }
        if (this.field2481 == null) {
            this.field2481 = "";
        }
        this.method2906();
    }

    @ObfuscatedName("ez.x(I)V")
    public void method2906() {
        if (this.field2478.length() > 40) {
            this.field2478 = this.field2478.substring(0, 40);
        }
        if (this.field2464.length() > 40) {
            this.field2464 = this.field2464.substring(0, 40);
        }
        if (this.field2491.length() > 10) {
            this.field2491 = this.field2491.substring(0, 10);
        }
        if (this.field2487.length() > 10) {
            this.field2487 = this.field2487.substring(0, 10);
        }
    }

    @ObfuscatedName("ez.p(Ldg;I)V")
    public void method2907(class127 arg0) {
        arg0.method2396(6);
        arg0.method2396(this.field2463);
        arg0.method2396(this.field2460 ? 1 : 0);
        arg0.method2396(this.field2468);
        arg0.method2396(this.field2469);
        arg0.method2396(this.field2470);
        arg0.method2396(this.field2477);
        arg0.method2396(this.field2472);
        arg0.method2396(this.field2473 ? 1 : 0);
        arg0.method2397(this.field2474);
        arg0.method2396(this.field2475);
        arg0.method2398(this.field2459);
        arg0.method2397(this.field2461);
        arg0.method2402(this.field2478);
        arg0.method2402(this.field2464);
        arg0.method2402(this.field2491);
        arg0.method2402(this.field2487);
        arg0.method2396(this.field2483);
        arg0.method2397(this.field2482);
        arg0.method2402(this.field2486);
        arg0.method2402(this.field2481);
        arg0.method2396(this.field2484);
        arg0.method2396(this.field2485);
        for (int var2 = 0; var2 < this.field2488.length; var2++) {
            arg0.method2470(this.field2488[var2]);
        }
        arg0.method2470(this.field2489);
    }

    @ObfuscatedName("ez.k(I)I")
    public int method2908() {
        byte var1 = 38;
        int var2 = var1 + class127.method575(this.field2478);
        int var3 = var2 + class127.method575(this.field2464);
        int var4 = var3 + class127.method575(this.field2491);
        String var6 = this.field2487;
        int var7 = var6.length() + 2;
        int var8 = var4 + var7;
        int var9 = var8 + class127.method575(this.field2486);
        String var11 = this.field2481;
        int var12 = var11.length() + 2;
        return var9 + var12;
    }
}
