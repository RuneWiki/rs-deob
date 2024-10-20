package deob;

@ObfuscatedName("eg")
public class class151 extends class179 {

    @ObfuscatedName("eg.i")
    public int field2460;

    @ObfuscatedName("eg.s")
    public boolean field2461;

    @ObfuscatedName("eg.k")
    public int field2465;

    @ObfuscatedName("eg.u")
    public int field2467;

    @ObfuscatedName("eg.ah")
    public int field2469;

    @ObfuscatedName("eg.az")
    public int field2487;

    @ObfuscatedName("eg.au")
    public int field2476;

    @ObfuscatedName("eg.ae")
    public boolean field2472;

    @ObfuscatedName("eg.aa")
    public int field2473;

    @ObfuscatedName("eg.aq")
    public int field2474;

    @ObfuscatedName("eg.ad")
    public int field2470;

    @ObfuscatedName("eg.at")
    public int field2488;

    @ObfuscatedName("eg.an")
    public String field2468;

    @ObfuscatedName("eg.aw")
    public String field2478;

    @ObfuscatedName("eg.am")
    public String field2479;

    @ObfuscatedName("eg.af")
    public String field2480;

    @ObfuscatedName("eg.as")
    public int field2481;

    @ObfuscatedName("eg.ao")
    public int field2482;

    @ObfuscatedName("eg.ab")
    public int field2483;

    @ObfuscatedName("eg.ay")
    public int field2466;

    @ObfuscatedName("eg.ar")
    public String field2485;

    @ObfuscatedName("eg.aj")
    public String field2486;

    @ObfuscatedName("eg.ai")
    public int[] field2464 = new int[3];

    @ObfuscatedName("eg.ax")
    public int field2471;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field1394.startsWith("win")) {
                this.field2460 = 1;
            } else if (Statics.field1394.startsWith("mac")) {
                this.field2460 = 2;
            } else if (Statics.field1394.startsWith("linux")) {
                this.field2460 = 3;
            } else {
                this.field2460 = 4;
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
                this.field2461 = true;
            } else {
                this.field2461 = false;
            }
            if (this.field2460 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2465 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2465 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2465 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2465 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2465 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2465 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2465 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2465 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2465 = 9;
                }
            } else if (this.field2460 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2465 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2465 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2465 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2465 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2467 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2467 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2467 = 4;
            } else {
                this.field2467 = 3;
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
            this.field2469 = var10;
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
            this.field2487 = var14;
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
            this.field2476 = var18;
            this.field2472 = false;
            this.field2473 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2469 > 3) {
                this.field2474 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2474 = 0;
            }
            this.field2470 = 0;
        }
        if (this.field2468 == null) {
            this.field2468 = "";
        }
        if (this.field2478 == null) {
            this.field2478 = "";
        }
        if (this.field2479 == null) {
            this.field2479 = "";
        }
        if (this.field2480 == null) {
            this.field2480 = "";
        }
        if (this.field2485 == null) {
            this.field2485 = "";
        }
        if (this.field2486 == null) {
            this.field2486 = "";
        }
        this.method2956();
    }

    @ObfuscatedName("eg.g(I)V")
    public void method2956() {
        if (this.field2468.length() > 40) {
            this.field2468 = this.field2468.substring(0, 40);
        }
        if (this.field2478.length() > 40) {
            this.field2478 = this.field2478.substring(0, 40);
        }
        if (this.field2479.length() > 10) {
            this.field2479 = this.field2479.substring(0, 10);
        }
        if (this.field2480.length() > 10) {
            this.field2480 = this.field2480.substring(0, 10);
        }
    }

    @ObfuscatedName("eg.m(Ldr;S)V")
    public void method2957(class127 arg0) {
        arg0.method2498(6);
        arg0.method2498(this.field2460);
        arg0.method2498(this.field2461 ? 1 : 0);
        arg0.method2498(this.field2465);
        arg0.method2498(this.field2467);
        arg0.method2498(this.field2469);
        arg0.method2498(this.field2487);
        arg0.method2498(this.field2476);
        arg0.method2498(this.field2472 ? 1 : 0);
        arg0.method2401(this.field2473);
        arg0.method2498(this.field2474);
        arg0.method2402(this.field2470);
        arg0.method2401(this.field2488);
        arg0.method2406(this.field2468);
        arg0.method2406(this.field2478);
        arg0.method2406(this.field2479);
        arg0.method2406(this.field2480);
        arg0.method2498(this.field2482);
        arg0.method2401(this.field2481);
        arg0.method2406(this.field2485);
        arg0.method2406(this.field2486);
        arg0.method2498(this.field2483);
        arg0.method2498(this.field2466);
        for (int var2 = 0; var2 < this.field2464.length; var2++) {
            arg0.method2448(this.field2464[var2]);
        }
        arg0.method2448(this.field2471);
    }

    @ObfuscatedName("eg.v(I)I")
    public int method2958() {
        byte var1 = 38;
        String var3 = this.field2468;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2478;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2479;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2480;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2485;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2486;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
