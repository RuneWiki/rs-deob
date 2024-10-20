package deob;

@ObfuscatedName("er")
public class class151 extends class179 {

    @ObfuscatedName("er.d")
    public int field2457;

    @ObfuscatedName("er.y")
    public boolean field2479;

    @ObfuscatedName("er.m")
    public int field2464;

    @ObfuscatedName("er.c")
    public int field2465;

    @ObfuscatedName("er.am")
    public int field2474;

    @ObfuscatedName("er.ap")
    public int field2467;

    @ObfuscatedName("er.au")
    public int field2468;

    @ObfuscatedName("er.ab")
    public boolean field2469;

    @ObfuscatedName("er.ae")
    public int field2470;

    @ObfuscatedName("er.av")
    public int field2466;

    @ObfuscatedName("er.ad")
    public int field2472;

    @ObfuscatedName("er.ac")
    public int field2473;

    @ObfuscatedName("er.ax")
    public String field2477;

    @ObfuscatedName("er.ao")
    public String field2475;

    @ObfuscatedName("er.aj")
    public String field2476;

    @ObfuscatedName("er.al")
    public String field2459;

    @ObfuscatedName("er.ak")
    public int field2478;

    @ObfuscatedName("er.ag")
    public int field2487;

    @ObfuscatedName("er.ah")
    public int field2480;

    @ObfuscatedName("er.ay")
    public int field2463;

    @ObfuscatedName("er.an")
    public String field2482;

    @ObfuscatedName("er.aq")
    public String field2483;

    @ObfuscatedName("er.af")
    public int[] field2484 = new int[3];

    @ObfuscatedName("er.aw")
    public int field2485;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field1417.startsWith("win")) {
                this.field2457 = 1;
            } else if (Statics.field1417.startsWith("mac")) {
                this.field2457 = 2;
            } else if (Statics.field1417.startsWith("linux")) {
                this.field2457 = 3;
            } else {
                this.field2457 = 4;
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
            if (this.field2457 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2464 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2464 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2464 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2464 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2464 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2464 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2464 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2464 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2464 = 9;
                }
            } else if (this.field2457 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2464 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2464 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2464 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2464 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2465 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2465 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2465 = 4;
            } else {
                this.field2465 = 3;
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
            this.field2474 = var10;
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
            this.field2467 = var14;
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
            this.field2468 = var18;
            this.field2469 = false;
            this.field2470 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2474 > 3) {
                this.field2466 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2466 = 0;
            }
            this.field2472 = 0;
        }
        if (this.field2477 == null) {
            this.field2477 = "";
        }
        if (this.field2475 == null) {
            this.field2475 = "";
        }
        if (this.field2476 == null) {
            this.field2476 = "";
        }
        if (this.field2459 == null) {
            this.field2459 = "";
        }
        if (this.field2482 == null) {
            this.field2482 = "";
        }
        if (this.field2483 == null) {
            this.field2483 = "";
        }
        this.method2949();
    }

    @ObfuscatedName("er.j(I)V")
    public void method2949() {
        if (this.field2477.length() > 40) {
            this.field2477 = this.field2477.substring(0, 40);
        }
        if (this.field2475.length() > 40) {
            this.field2475 = this.field2475.substring(0, 40);
        }
        if (this.field2476.length() > 10) {
            this.field2476 = this.field2476.substring(0, 10);
        }
        if (this.field2459.length() > 10) {
            this.field2459 = this.field2459.substring(0, 10);
        }
    }

    @ObfuscatedName("er.r(Ldn;I)V")
    public void method2953(class127 arg0) {
        arg0.method2482(6);
        arg0.method2482(this.field2457);
        arg0.method2482(this.field2479 ? 1 : 0);
        arg0.method2482(this.field2464);
        arg0.method2482(this.field2465);
        arg0.method2482(this.field2474);
        arg0.method2482(this.field2467);
        arg0.method2482(this.field2468);
        arg0.method2482(this.field2469 ? 1 : 0);
        arg0.method2428(this.field2470);
        arg0.method2482(this.field2466);
        arg0.method2625(this.field2472);
        arg0.method2428(this.field2473);
        arg0.method2433(this.field2477);
        arg0.method2433(this.field2475);
        arg0.method2433(this.field2476);
        arg0.method2433(this.field2459);
        arg0.method2482(this.field2487);
        arg0.method2428(this.field2478);
        arg0.method2433(this.field2482);
        arg0.method2433(this.field2483);
        arg0.method2482(this.field2480);
        arg0.method2482(this.field2463);
        for (int var2 = 0; var2 < this.field2484.length; var2++) {
            arg0.method2430(this.field2484[var2]);
        }
        arg0.method2430(this.field2485);
    }

    @ObfuscatedName("er.v(I)I")
    public int method2945() {
        byte var1 = 38;
        int var2 = var1 + class127.method1412(this.field2477);
        String var4 = this.field2475;
        int var5 = var4.length() + 2;
        int var6 = var2 + var5;
        int var7 = var6 + class127.method1412(this.field2476);
        String var9 = this.field2459;
        int var10 = var9.length() + 2;
        int var11 = var7 + var10;
        int var12 = var11 + class127.method1412(this.field2482);
        return var12 + class127.method1412(this.field2483);
    }
}
