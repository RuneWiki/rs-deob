package deob;

@ObfuscatedName("ep")
public class class151 extends class179 {

    @ObfuscatedName("ep.c")
    public int field2500;

    @ObfuscatedName("ep.p")
    public boolean field2479;

    @ObfuscatedName("ep.e")
    public int field2482;

    @ObfuscatedName("ep.j")
    public int field2484;

    @ObfuscatedName("ep.ae")
    public int field2485;

    @ObfuscatedName("ep.aq")
    public int field2476;

    @ObfuscatedName("ep.ap")
    public int field2486;

    @ObfuscatedName("ep.ah")
    public boolean field2506;

    @ObfuscatedName("ep.ax")
    public int field2489;

    @ObfuscatedName("ep.aa")
    public int field2491;

    @ObfuscatedName("ep.ak")
    public int field2492;

    @ObfuscatedName("ep.al")
    public int field2487;

    @ObfuscatedName("ep.au")
    public String field2494;

    @ObfuscatedName("ep.aj")
    public String field2495;

    @ObfuscatedName("ep.az")
    public String field2496;

    @ObfuscatedName("ep.ac")
    public String field2497;

    @ObfuscatedName("ep.ay")
    public int field2498;

    @ObfuscatedName("ep.as")
    public int field2499;

    @ObfuscatedName("ep.af")
    public int field2493;

    @ObfuscatedName("ep.an")
    public int field2501;

    @ObfuscatedName("ep.am")
    public String field2502;

    @ObfuscatedName("ep.av")
    public String field2504;

    @ObfuscatedName("ep.aw")
    public int[] field2488 = new int[3];

    @ObfuscatedName("ep.ao")
    public int field2473;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field1793.startsWith("win")) {
                this.field2500 = 1;
            } else if (Statics.field1793.startsWith("mac")) {
                this.field2500 = 2;
            } else if (Statics.field1793.startsWith("linux")) {
                this.field2500 = 3;
            } else {
                this.field2500 = 4;
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
                this.field2479 = true;
            } else {
                this.field2479 = false;
            }
            if (this.field2500 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2482 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2482 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2482 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2482 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2482 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2482 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2482 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2482 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2482 = 9;
                }
            } else if (this.field2500 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2482 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2482 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2482 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2482 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2484 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2484 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2484 = 4;
            } else {
                this.field2484 = 3;
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
            this.field2485 = var10;
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
            this.field2486 = var18;
            this.field2506 = false;
            this.field2489 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2485 > 3) {
                this.field2491 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2491 = 0;
            }
            this.field2492 = 0;
        }
        if (this.field2494 == null) {
            this.field2494 = "";
        }
        if (this.field2495 == null) {
            this.field2495 = "";
        }
        if (this.field2496 == null) {
            this.field2496 = "";
        }
        if (this.field2497 == null) {
            this.field2497 = "";
        }
        if (this.field2502 == null) {
            this.field2502 = "";
        }
        if (this.field2504 == null) {
            this.field2504 = "";
        }
        this.method2921();
    }

    @ObfuscatedName("ep.d(I)V")
    public void method2921() {
        if (this.field2494.length() > 40) {
            this.field2494 = this.field2494.substring(0, 40);
        }
        if (this.field2495.length() > 40) {
            this.field2495 = this.field2495.substring(0, 40);
        }
        if (this.field2496.length() > 10) {
            this.field2496 = this.field2496.substring(0, 10);
        }
        if (this.field2497.length() > 10) {
            this.field2497 = this.field2497.substring(0, 10);
        }
    }

    @ObfuscatedName("ep.g(Ldo;I)V")
    public void method2922(class127 arg0) {
        arg0.method2386(6);
        arg0.method2386(this.field2500);
        arg0.method2386(this.field2479 ? 1 : 0);
        arg0.method2386(this.field2482);
        arg0.method2386(this.field2484);
        arg0.method2386(this.field2485);
        arg0.method2386(this.field2476);
        arg0.method2386(this.field2486);
        arg0.method2386(this.field2506 ? 1 : 0);
        arg0.method2387(this.field2489);
        arg0.method2386(this.field2491);
        arg0.method2460(this.field2492);
        arg0.method2387(this.field2487);
        arg0.method2392(this.field2494);
        arg0.method2392(this.field2495);
        arg0.method2392(this.field2496);
        arg0.method2392(this.field2497);
        arg0.method2386(this.field2499);
        arg0.method2387(this.field2498);
        arg0.method2392(this.field2502);
        arg0.method2392(this.field2504);
        arg0.method2386(this.field2493);
        arg0.method2386(this.field2501);
        for (int var2 = 0; var2 < this.field2488.length; var2++) {
            arg0.method2389(this.field2488[var2]);
        }
        arg0.method2389(this.field2473);
    }

    @ObfuscatedName("ep.a(I)I")
    public int method2925() {
        byte var1 = 38;
        int var2 = var1 + class127.method1537(this.field2494);
        int var3 = var2 + class127.method1537(this.field2495);
        int var4 = var3 + class127.method1537(this.field2496);
        int var5 = var4 + class127.method1537(this.field2497);
        int var6 = var5 + class127.method1537(this.field2502);
        return var6 + class127.method1537(this.field2504);
    }
}
