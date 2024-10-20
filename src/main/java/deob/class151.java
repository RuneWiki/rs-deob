package deob;

@ObfuscatedName("ed")
public class class151 extends class179 {

    @ObfuscatedName("ed.i")
    public int field2485;

    @ObfuscatedName("ed.p")
    public boolean field2503;

    @ObfuscatedName("ed.g")
    public int field2499;

    @ObfuscatedName("ed.e")
    public int field2492;

    @ObfuscatedName("ed.ar")
    public int field2493;

    @ObfuscatedName("ed.ak")
    public int field2487;

    @ObfuscatedName("ed.ap")
    public int field2511;

    @ObfuscatedName("ed.aa")
    public boolean field2496;

    @ObfuscatedName("ed.av")
    public int field2484;

    @ObfuscatedName("ed.an")
    public int field2498;

    @ObfuscatedName("ed.ax")
    public int field2497;

    @ObfuscatedName("ed.as")
    public int field2500;

    @ObfuscatedName("ed.ah")
    public String field2490;

    @ObfuscatedName("ed.ae")
    public String field2502;

    @ObfuscatedName("ed.ac")
    public String field2504;

    @ObfuscatedName("ed.af")
    public String field2510;

    @ObfuscatedName("ed.aj")
    public int field2505;

    @ObfuscatedName("ed.ao")
    public int field2506;

    @ObfuscatedName("ed.au")
    public int field2507;

    @ObfuscatedName("ed.at")
    public int field2508;

    @ObfuscatedName("ed.az")
    public String field2509;

    @ObfuscatedName("ed.ag")
    public String field2491;

    @ObfuscatedName("ed.am")
    public int[] field2494 = new int[3];

    @ObfuscatedName("ed.ai")
    public int field2512;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field2073.startsWith("win")) {
                this.field2485 = 1;
            } else if (Statics.field2073.startsWith("mac")) {
                this.field2485 = 2;
            } else if (Statics.field2073.startsWith("linux")) {
                this.field2485 = 3;
            } else {
                this.field2485 = 4;
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
                this.field2503 = true;
            } else {
                this.field2503 = false;
            }
            if (this.field2485 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2499 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2499 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2499 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2499 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2499 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2499 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2499 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2499 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2499 = 9;
                }
            } else if (this.field2485 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2499 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2499 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2499 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2499 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2492 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2492 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2492 = 4;
            } else {
                this.field2492 = 3;
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
            this.field2493 = var10;
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
            this.field2511 = var18;
            this.field2496 = false;
            this.field2484 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2493 > 3) {
                this.field2498 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2498 = 0;
            }
            this.field2497 = 0;
        }
        if (this.field2490 == null) {
            this.field2490 = "";
        }
        if (this.field2502 == null) {
            this.field2502 = "";
        }
        if (this.field2504 == null) {
            this.field2504 = "";
        }
        if (this.field2510 == null) {
            this.field2510 = "";
        }
        if (this.field2509 == null) {
            this.field2509 = "";
        }
        if (this.field2491 == null) {
            this.field2491 = "";
        }
        this.method2969();
    }

    @ObfuscatedName("ed.t(I)V")
    public void method2969() {
        if (this.field2490.length() > 40) {
            this.field2490 = this.field2490.substring(0, 40);
        }
        if (this.field2502.length() > 40) {
            this.field2502 = this.field2502.substring(0, 40);
        }
        if (this.field2504.length() > 10) {
            this.field2504 = this.field2504.substring(0, 10);
        }
        if (this.field2510.length() > 10) {
            this.field2510 = this.field2510.substring(0, 10);
        }
    }

    @ObfuscatedName("ed.l(Ldo;B)V")
    public void method2970(class127 arg0) {
        arg0.method2424(6);
        arg0.method2424(this.field2485);
        arg0.method2424(this.field2503 ? 1 : 0);
        arg0.method2424(this.field2499);
        arg0.method2424(this.field2492);
        arg0.method2424(this.field2493);
        arg0.method2424(this.field2487);
        arg0.method2424(this.field2511);
        arg0.method2424(this.field2496 ? 1 : 0);
        arg0.method2641(this.field2484);
        arg0.method2424(this.field2498);
        arg0.method2431(this.field2497);
        arg0.method2641(this.field2500);
        arg0.method2606(this.field2490);
        arg0.method2606(this.field2502);
        arg0.method2606(this.field2504);
        arg0.method2606(this.field2510);
        arg0.method2424(this.field2506);
        arg0.method2641(this.field2505);
        arg0.method2606(this.field2509);
        arg0.method2606(this.field2491);
        arg0.method2424(this.field2507);
        arg0.method2424(this.field2508);
        for (int var2 = 0; var2 < this.field2494.length; var2++) {
            arg0.method2633(this.field2494[var2]);
        }
        arg0.method2633(this.field2512);
    }

    @ObfuscatedName("ed.c(I)I")
    public int method2971() {
        byte var1 = 38;
        int var2 = var1 + class127.method2039(this.field2490);
        int var3 = var2 + class127.method2039(this.field2502);
        int var4 = var3 + class127.method2039(this.field2504);
        int var5 = var4 + class127.method2039(this.field2510);
        int var6 = var5 + class127.method2039(this.field2509);
        return var6 + class127.method2039(this.field2491);
    }
}
