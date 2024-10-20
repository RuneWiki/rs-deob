package deob;

@ObfuscatedName("en")
public class class151 extends class179 {

    @ObfuscatedName("en.d")
    public int field2490;

    @ObfuscatedName("en.p")
    public boolean field2489;

    @ObfuscatedName("en.q")
    public int field2487;

    @ObfuscatedName("en.x")
    public int field2477;

    @ObfuscatedName("en.ao")
    public int field2480;

    @ObfuscatedName("en.ae")
    public int field2481;

    @ObfuscatedName("en.aa")
    public int field2482;

    @ObfuscatedName("en.ah")
    public boolean field2483;

    @ObfuscatedName("en.aw")
    public int field2486;

    @ObfuscatedName("en.av")
    public int field2485;

    @ObfuscatedName("en.ax")
    public int field2469;

    @ObfuscatedName("en.ab")
    public int field2475;

    @ObfuscatedName("en.af")
    public String field2488;

    @ObfuscatedName("en.ai")
    public String field2465;

    @ObfuscatedName("en.at")
    public String field2478;

    @ObfuscatedName("en.aq")
    public String field2491;

    @ObfuscatedName("en.ac")
    public int field2492;

    @ObfuscatedName("en.al")
    public int field2493;

    @ObfuscatedName("en.ag")
    public int field2494;

    @ObfuscatedName("en.ap")
    public int field2495;

    @ObfuscatedName("en.am")
    public String field2484;

    @ObfuscatedName("en.as")
    public String field2497;

    @ObfuscatedName("en.aj")
    public int[] field2498 = new int[3];

    @ObfuscatedName("en.ar")
    public int field2499;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field200.startsWith("win")) {
                this.field2490 = 1;
            } else if (Statics.field200.startsWith("mac")) {
                this.field2490 = 2;
            } else if (Statics.field200.startsWith("linux")) {
                this.field2490 = 3;
            } else {
                this.field2490 = 4;
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
                this.field2489 = true;
            } else {
                this.field2489 = false;
            }
            if (this.field2490 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2487 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2487 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2487 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2487 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2487 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2487 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2487 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2487 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2487 = 9;
                }
            } else if (this.field2490 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2487 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2487 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2487 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2487 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2477 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2477 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2477 = 4;
            } else {
                this.field2477 = 3;
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
            this.field2480 = var10;
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
            this.field2481 = var14;
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
            this.field2482 = var18;
            this.field2483 = false;
            this.field2486 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2480 > 3) {
                this.field2485 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2485 = 0;
            }
            this.field2469 = 0;
        }
        if (this.field2488 == null) {
            this.field2488 = "";
        }
        if (this.field2465 == null) {
            this.field2465 = "";
        }
        if (this.field2478 == null) {
            this.field2478 = "";
        }
        if (this.field2491 == null) {
            this.field2491 = "";
        }
        if (this.field2484 == null) {
            this.field2484 = "";
        }
        if (this.field2497 == null) {
            this.field2497 = "";
        }
        this.method2946();
    }

    @ObfuscatedName("en.i(I)V")
    public void method2946() {
        if (this.field2488.length() > 40) {
            this.field2488 = this.field2488.substring(0, 40);
        }
        if (this.field2465.length() > 40) {
            this.field2465 = this.field2465.substring(0, 40);
        }
        if (this.field2478.length() > 10) {
            this.field2478 = this.field2478.substring(0, 10);
        }
        if (this.field2491.length() > 10) {
            this.field2491 = this.field2491.substring(0, 10);
        }
    }

    @ObfuscatedName("en.w(Ldz;I)V")
    public void method2947(class127 arg0) {
        arg0.method2438(6);
        arg0.method2438(this.field2490);
        arg0.method2438(this.field2489 ? 1 : 0);
        arg0.method2438(this.field2487);
        arg0.method2438(this.field2477);
        arg0.method2438(this.field2480);
        arg0.method2438(this.field2481);
        arg0.method2438(this.field2482);
        arg0.method2438(this.field2483 ? 1 : 0);
        arg0.method2585(this.field2486);
        arg0.method2438(this.field2485);
        arg0.method2527(this.field2469);
        arg0.method2585(this.field2475);
        arg0.method2444(this.field2488);
        arg0.method2444(this.field2465);
        arg0.method2444(this.field2478);
        arg0.method2444(this.field2491);
        arg0.method2438(this.field2493);
        arg0.method2585(this.field2492);
        arg0.method2444(this.field2484);
        arg0.method2444(this.field2497);
        arg0.method2438(this.field2494);
        arg0.method2438(this.field2495);
        for (int var2 = 0; var2 < this.field2498.length; var2++) {
            arg0.method2441(this.field2498[var2]);
        }
        arg0.method2441(this.field2499);
    }

    @ObfuscatedName("en.f(I)I")
    public int method2948() {
        byte var1 = 38;
        int var2 = var1 + class127.method2322(this.field2488);
        int var3 = var2 + class127.method2322(this.field2465);
        int var4 = var3 + class127.method2322(this.field2478);
        int var5 = var4 + class127.method2322(this.field2491);
        int var6 = var5 + class127.method2322(this.field2484);
        return var6 + class127.method2322(this.field2497);
    }
}
