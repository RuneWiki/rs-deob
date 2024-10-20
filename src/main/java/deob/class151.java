package deob;

@ObfuscatedName("eo")
public class class151 extends class179 {

    @ObfuscatedName("eo.x")
    public int field2464;

    @ObfuscatedName("eo.v")
    public boolean field2465;

    @ObfuscatedName("eo.h")
    public int field2470;

    @ObfuscatedName("eo.y")
    public int field2460;

    @ObfuscatedName("eo.ah")
    public int field2483;

    @ObfuscatedName("eo.ad")
    public int field2473;

    @ObfuscatedName("eo.au")
    public int field2474;

    @ObfuscatedName("eo.as")
    public boolean field2475;

    @ObfuscatedName("eo.ag")
    public int field2476;

    @ObfuscatedName("eo.aq")
    public int field2478;

    @ObfuscatedName("eo.ay")
    public int field2472;

    @ObfuscatedName("eo.ax")
    public int field2494;

    @ObfuscatedName("eo.aa")
    public String field2481;

    @ObfuscatedName("eo.ak")
    public String field2463;

    @ObfuscatedName("eo.ac")
    public String field2482;

    @ObfuscatedName("eo.aj")
    public String field2484;

    @ObfuscatedName("eo.av")
    public int field2485;

    @ObfuscatedName("eo.al")
    public int field2486;

    @ObfuscatedName("eo.an")
    public int field2487;

    @ObfuscatedName("eo.ap")
    public int field2492;

    @ObfuscatedName("eo.at")
    public String field2489;

    @ObfuscatedName("eo.ae")
    public String field2480;

    @ObfuscatedName("eo.aw")
    public int[] field2491 = new int[3];

    @ObfuscatedName("eo.am")
    public int field2490;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field229.startsWith("win")) {
                this.field2464 = 1;
            } else if (Statics.field229.startsWith("mac")) {
                this.field2464 = 2;
            } else if (Statics.field229.startsWith("linux")) {
                this.field2464 = 3;
            } else {
                this.field2464 = 4;
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
                this.field2465 = true;
            } else {
                this.field2465 = false;
            }
            if (this.field2464 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2470 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2470 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2470 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2470 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2470 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2470 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2470 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2470 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2470 = 9;
                }
            } else if (this.field2464 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2470 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2470 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2470 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2470 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2460 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2460 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2460 = 4;
            } else {
                this.field2460 = 3;
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
            this.field2483 = var10;
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
            this.field2473 = var14;
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
            this.field2474 = var18;
            this.field2475 = false;
            this.field2476 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2483 > 3) {
                this.field2478 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2478 = 0;
            }
            this.field2472 = 0;
        }
        if (this.field2481 == null) {
            this.field2481 = "";
        }
        if (this.field2463 == null) {
            this.field2463 = "";
        }
        if (this.field2482 == null) {
            this.field2482 = "";
        }
        if (this.field2484 == null) {
            this.field2484 = "";
        }
        if (this.field2489 == null) {
            this.field2489 = "";
        }
        if (this.field2480 == null) {
            this.field2480 = "";
        }
        this.method2932();
    }

    @ObfuscatedName("eo.a(I)V")
    public void method2932() {
        if (this.field2481.length() > 40) {
            this.field2481 = this.field2481.substring(0, 40);
        }
        if (this.field2463.length() > 40) {
            this.field2463 = this.field2463.substring(0, 40);
        }
        if (this.field2482.length() > 10) {
            this.field2482 = this.field2482.substring(0, 10);
        }
        if (this.field2484.length() > 10) {
            this.field2484 = this.field2484.substring(0, 10);
        }
    }

    @ObfuscatedName("eo.r(Ldf;B)V")
    public void method2931(class126 arg0) {
        arg0.method2364(6);
        arg0.method2364(this.field2464);
        arg0.method2364(this.field2465 ? 1 : 0);
        arg0.method2364(this.field2470);
        arg0.method2364(this.field2460);
        arg0.method2364(this.field2483);
        arg0.method2364(this.field2473);
        arg0.method2364(this.field2474);
        arg0.method2364(this.field2475 ? 1 : 0);
        arg0.method2365(this.field2476);
        arg0.method2364(this.field2478);
        arg0.method2366(this.field2472);
        arg0.method2365(this.field2494);
        arg0.method2370(this.field2481);
        arg0.method2370(this.field2463);
        arg0.method2370(this.field2482);
        arg0.method2370(this.field2484);
        arg0.method2364(this.field2486);
        arg0.method2365(this.field2485);
        arg0.method2370(this.field2489);
        arg0.method2370(this.field2480);
        arg0.method2364(this.field2487);
        arg0.method2364(this.field2492);
        for (int var2 = 0; var2 < this.field2491.length; var2++) {
            arg0.method2367(this.field2491[var2]);
        }
        arg0.method2367(this.field2490);
    }

    @ObfuscatedName("eo.u(I)I")
    public int method2933() {
        byte var1 = 38;
        int var2 = var1 + class126.method1608(this.field2481);
        int var3 = var2 + class126.method1608(this.field2463);
        int var4 = var3 + class126.method1608(this.field2482);
        int var5 = var4 + class126.method1608(this.field2484);
        int var6 = var5 + class126.method1608(this.field2489);
        return var6 + class126.method1608(this.field2480);
    }
}
