package deob;

@ObfuscatedName("ep")
public class class151 extends class179 {

    @ObfuscatedName("ep.s")
    public int field2472;

    @ObfuscatedName("ep.x")
    public boolean field2495;

    @ObfuscatedName("ep.v")
    public int field2477;

    @ObfuscatedName("ep.e")
    public int field2481;

    @ObfuscatedName("ep.as")
    public int field2479;

    @ObfuscatedName("ep.an")
    public int field2480;

    @ObfuscatedName("ep.aj")
    public int field2470;

    @ObfuscatedName("ep.ax")
    public boolean field2482;

    @ObfuscatedName("ep.av")
    public int field2483;

    @ObfuscatedName("ep.am")
    public int field2484;

    @ObfuscatedName("ep.at")
    public int field2497;

    @ObfuscatedName("ep.ac")
    public int field2486;

    @ObfuscatedName("ep.al")
    public String field2487;

    @ObfuscatedName("ep.ab")
    public String field2488;

    @ObfuscatedName("ep.aa")
    public String field2489;

    @ObfuscatedName("ep.ao")
    public String field2490;

    @ObfuscatedName("ep.ah")
    public int field2491;

    @ObfuscatedName("ep.au")
    public int field2492;

    @ObfuscatedName("ep.aw")
    public int field2493;

    @ObfuscatedName("ep.az")
    public int field2494;

    @ObfuscatedName("ep.af")
    public String field2473;

    @ObfuscatedName("ep.ap")
    public String field2496;

    @ObfuscatedName("ep.ak")
    public int[] field2478 = new int[3];

    @ObfuscatedName("ep.ad")
    public int field2498;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field1381.startsWith("win")) {
                this.field2472 = 1;
            } else if (Statics.field1381.startsWith("mac")) {
                this.field2472 = 2;
            } else if (Statics.field1381.startsWith("linux")) {
                this.field2472 = 3;
            } else {
                this.field2472 = 4;
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
                this.field2495 = true;
            } else {
                this.field2495 = false;
            }
            if (this.field2472 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2477 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2477 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2477 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2477 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2477 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2477 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2477 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2477 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2477 = 9;
                }
            } else if (this.field2472 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2477 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2477 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2477 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2477 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2481 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2481 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2481 = 4;
            } else {
                this.field2481 = 3;
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
            this.field2479 = var10;
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
            this.field2480 = var14;
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
            this.field2470 = var18;
            this.field2482 = false;
            this.field2483 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2479 > 3) {
                this.field2484 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2484 = 0;
            }
            this.field2497 = 0;
        }
        if (this.field2487 == null) {
            this.field2487 = "";
        }
        if (this.field2488 == null) {
            this.field2488 = "";
        }
        if (this.field2489 == null) {
            this.field2489 = "";
        }
        if (this.field2490 == null) {
            this.field2490 = "";
        }
        if (this.field2473 == null) {
            this.field2473 = "";
        }
        if (this.field2496 == null) {
            this.field2496 = "";
        }
        this.method2981();
    }

    @ObfuscatedName("ep.y(B)V")
    public void method2981() {
        if (this.field2487.length() > 40) {
            this.field2487 = this.field2487.substring(0, 40);
        }
        if (this.field2488.length() > 40) {
            this.field2488 = this.field2488.substring(0, 40);
        }
        if (this.field2489.length() > 10) {
            this.field2489 = this.field2489.substring(0, 10);
        }
        if (this.field2490.length() > 10) {
            this.field2490 = this.field2490.substring(0, 10);
        }
    }

    @ObfuscatedName("ep.m(Ldp;I)V")
    public void method2978(class127 arg0) {
        arg0.method2444(6);
        arg0.method2444(this.field2472);
        arg0.method2444(this.field2495 ? 1 : 0);
        arg0.method2444(this.field2477);
        arg0.method2444(this.field2481);
        arg0.method2444(this.field2479);
        arg0.method2444(this.field2480);
        arg0.method2444(this.field2470);
        arg0.method2444(this.field2482 ? 1 : 0);
        arg0.method2445(this.field2483);
        arg0.method2444(this.field2484);
        arg0.method2446(this.field2497);
        arg0.method2445(this.field2486);
        arg0.method2450(this.field2487);
        arg0.method2450(this.field2488);
        arg0.method2450(this.field2489);
        arg0.method2450(this.field2490);
        arg0.method2444(this.field2492);
        arg0.method2445(this.field2491);
        arg0.method2450(this.field2473);
        arg0.method2450(this.field2496);
        arg0.method2444(this.field2493);
        arg0.method2444(this.field2494);
        for (int var2 = 0; var2 < this.field2478.length; var2++) {
            arg0.method2563(this.field2478[var2]);
        }
        arg0.method2563(this.field2498);
    }

    @ObfuscatedName("ep.d(B)I")
    public int method2977() {
        byte var1 = 38;
        int var2 = var1 + class127.method628(this.field2487);
        int var3 = var2 + class127.method628(this.field2488);
        int var4 = var3 + class127.method628(this.field2489);
        int var5 = var4 + class127.method628(this.field2490);
        int var6 = var5 + class127.method628(this.field2473);
        return var6 + class127.method628(this.field2496);
    }
}
