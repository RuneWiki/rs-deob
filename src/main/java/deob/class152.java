package deob;

@ObfuscatedName("ep")
public class class152 extends class179 {

    @ObfuscatedName("ep.a")
    public int field2488;

    @ObfuscatedName("ep.w")
    public boolean field2489;

    @ObfuscatedName("ep.t")
    public int field2492;

    @ObfuscatedName("ep.z")
    public int field2485;

    @ObfuscatedName("ep.af")
    public int field2503;

    @ObfuscatedName("ep.ap")
    public int field2497;

    @ObfuscatedName("ep.ah")
    public int field2498;

    @ObfuscatedName("ep.at")
    public boolean field2499;

    @ObfuscatedName("ep.aa")
    public int field2500;

    @ObfuscatedName("ep.aw")
    public int field2501;

    @ObfuscatedName("ep.ai")
    public int field2487;

    @ObfuscatedName("ep.au")
    public int field2504;

    @ObfuscatedName("ep.ay")
    public String field2505;

    @ObfuscatedName("ep.an")
    public String field2490;

    @ObfuscatedName("ep.al")
    public String field2507;

    @ObfuscatedName("ep.as")
    public String field2495;

    @ObfuscatedName("ep.az")
    public int field2509;

    @ObfuscatedName("ep.aq")
    public int field2510;

    @ObfuscatedName("ep.ag")
    public int field2511;

    @ObfuscatedName("ep.aj")
    public int field2512;

    @ObfuscatedName("ep.ak")
    public String field2513;

    @ObfuscatedName("ep.ac")
    public String field2514;

    @ObfuscatedName("ep.ab")
    public int[] field2517 = new int[3];

    @ObfuscatedName("ep.ax")
    public int field2516;

    public class152(boolean arg0) {
        if (arg0) {
            if (Statics.field945.startsWith("win")) {
                this.field2488 = 1;
            } else if (Statics.field945.startsWith("mac")) {
                this.field2488 = 2;
            } else if (Statics.field945.startsWith("linux")) {
                this.field2488 = 3;
            } else {
                this.field2488 = 4;
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
            if (this.field2488 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2492 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2492 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2492 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2492 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2492 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2492 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2492 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2492 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2492 = 9;
                }
            } else if (this.field2488 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2492 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2492 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2492 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2492 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2485 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2485 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2485 = 4;
            } else {
                this.field2485 = 3;
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
            this.field2503 = var10;
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
            this.field2497 = var14;
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
            this.field2498 = var18;
            this.field2499 = false;
            this.field2500 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2503 > 3) {
                this.field2501 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2501 = 0;
            }
            this.field2487 = 0;
        }
        if (this.field2505 == null) {
            this.field2505 = "";
        }
        if (this.field2490 == null) {
            this.field2490 = "";
        }
        if (this.field2507 == null) {
            this.field2507 = "";
        }
        if (this.field2495 == null) {
            this.field2495 = "";
        }
        if (this.field2513 == null) {
            this.field2513 = "";
        }
        if (this.field2514 == null) {
            this.field2514 = "";
        }
        this.method3063();
    }

    @ObfuscatedName("ep.p(B)V")
    public void method3063() {
        if (this.field2505.length() > 40) {
            this.field2505 = this.field2505.substring(0, 40);
        }
        if (this.field2490.length() > 40) {
            this.field2490 = this.field2490.substring(0, 40);
        }
        if (this.field2507.length() > 10) {
            this.field2507 = this.field2507.substring(0, 10);
        }
        if (this.field2495.length() > 10) {
            this.field2495 = this.field2495.substring(0, 10);
        }
    }

    @ObfuscatedName("ep.l(Lds;I)V")
    public void method3064(class127 arg0) {
        arg0.method2484(6);
        arg0.method2484(this.field2488);
        arg0.method2484(this.field2489 ? 1 : 0);
        arg0.method2484(this.field2492);
        arg0.method2484(this.field2485);
        arg0.method2484(this.field2503);
        arg0.method2484(this.field2497);
        arg0.method2484(this.field2498);
        arg0.method2484(this.field2499 ? 1 : 0);
        arg0.method2485(this.field2500);
        arg0.method2484(this.field2501);
        arg0.method2486(this.field2487);
        arg0.method2485(this.field2504);
        arg0.method2490(this.field2505);
        arg0.method2490(this.field2490);
        arg0.method2490(this.field2507);
        arg0.method2490(this.field2495);
        arg0.method2484(this.field2510);
        arg0.method2485(this.field2509);
        arg0.method2490(this.field2513);
        arg0.method2490(this.field2514);
        arg0.method2484(this.field2511);
        arg0.method2484(this.field2512);
        for (int var2 = 0; var2 < this.field2517.length; var2++) {
            arg0.method2487(this.field2517[var2]);
        }
        arg0.method2487(this.field2516);
    }

    @ObfuscatedName("ep.d(B)I")
    public int method3066() {
        byte var1 = 38;
        int var2 = var1 + class127.method2428(this.field2505);
        int var3 = var2 + class127.method2428(this.field2490);
        int var4 = var3 + class127.method2428(this.field2507);
        int var5 = var4 + class127.method2428(this.field2495);
        int var6 = var5 + class127.method2428(this.field2513);
        return var6 + class127.method2428(this.field2514);
    }
}
