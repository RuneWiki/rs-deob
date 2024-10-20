package deob;

@ObfuscatedName("ed")
public class class150 extends class191 {

    @ObfuscatedName("ed.m")
    public int field2455;

    @ObfuscatedName("ed.w")
    public boolean field2456;

    @ObfuscatedName("ed.z")
    public int field2460;

    @ObfuscatedName("ed.ae")
    public int field2463;

    @ObfuscatedName("ed.av")
    public int field2464;

    @ObfuscatedName("ed.al")
    public int field2465;

    @ObfuscatedName("ed.aq")
    public int field2466;

    @ObfuscatedName("ed.am")
    public boolean field2467;

    @ObfuscatedName("ed.ax")
    public int field2452;

    @ObfuscatedName("ed.ai")
    public int field2469;

    @ObfuscatedName("ed.at")
    public int field2471;

    @ObfuscatedName("ed.aw")
    public int field2480;

    @ObfuscatedName("ed.ao")
    public String field2484;

    @ObfuscatedName("ed.ag")
    public String field2474;

    @ObfuscatedName("ed.ad")
    public String field2475;

    @ObfuscatedName("ed.au")
    public String field2476;

    @ObfuscatedName("ed.ak")
    public int field2477;

    @ObfuscatedName("ed.aj")
    public int field2478;

    @ObfuscatedName("ed.af")
    public int field2479;

    @ObfuscatedName("ed.ab")
    public int field2459;

    @ObfuscatedName("ed.ac")
    public String field2472;

    @ObfuscatedName("ed.ap")
    public String field2482;

    @ObfuscatedName("ed.ay")
    public int[] field2483 = new int[3];

    @ObfuscatedName("ed.bu")
    public int field2453;

    public class150(boolean arg0) {
        if (arg0) {
            if (Statics.field612.startsWith("win")) {
                this.field2455 = 1;
            } else if (Statics.field612.startsWith("mac")) {
                this.field2455 = 2;
            } else if (Statics.field612.startsWith("linux")) {
                this.field2455 = 3;
            } else {
                this.field2455 = 4;
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
                this.field2456 = true;
            } else {
                this.field2456 = false;
            }
            if (this.field2455 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2460 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2460 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2460 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2460 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2460 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2460 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2460 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2460 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2460 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2460 = 10;
                }
            } else if (this.field2455 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2460 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2460 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2460 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2460 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2460 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2460 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2460 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2463 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2463 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2463 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2463 = 4;
            } else {
                this.field2463 = 5;
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
            this.field2464 = var10;
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
            this.field2465 = var14;
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
            this.field2466 = var18;
            this.field2467 = false;
            this.field2452 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2464 > 3) {
                this.field2469 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2469 = 0;
            }
            this.field2471 = 0;
        }
        if (this.field2484 == null) {
            this.field2484 = "";
        }
        if (this.field2474 == null) {
            this.field2474 = "";
        }
        if (this.field2475 == null) {
            this.field2475 = "";
        }
        if (this.field2476 == null) {
            this.field2476 = "";
        }
        if (this.field2472 == null) {
            this.field2472 = "";
        }
        if (this.field2482 == null) {
            this.field2482 = "";
        }
        this.method2726();
    }

    @ObfuscatedName("ed.a(I)V")
    public void method2726() {
        if (this.field2484.length() > 40) {
            this.field2484 = this.field2484.substring(0, 40);
        }
        if (this.field2474.length() > 40) {
            this.field2474 = this.field2474.substring(0, 40);
        }
        if (this.field2475.length() > 10) {
            this.field2475 = this.field2475.substring(0, 10);
        }
        if (this.field2476.length() > 10) {
            this.field2476 = this.field2476.substring(0, 10);
        }
    }

    @ObfuscatedName("ed.v(Ldi;I)V")
    public void method2718(class110 arg0) {
        arg0.method2117(6);
        arg0.method2117(this.field2455);
        arg0.method2117(this.field2456 ? 1 : 0);
        arg0.method2117(this.field2460);
        arg0.method2117(this.field2463);
        arg0.method2117(this.field2464);
        arg0.method2117(this.field2465);
        arg0.method2117(this.field2466);
        arg0.method2117(this.field2467 ? 1 : 0);
        arg0.method2188(this.field2452);
        arg0.method2117(this.field2469);
        arg0.method2276(this.field2471);
        arg0.method2188(this.field2480);
        arg0.method2292(this.field2484);
        arg0.method2292(this.field2474);
        arg0.method2292(this.field2475);
        arg0.method2292(this.field2476);
        arg0.method2117(this.field2478);
        arg0.method2188(this.field2477);
        arg0.method2292(this.field2472);
        arg0.method2292(this.field2482);
        arg0.method2117(this.field2479);
        arg0.method2117(this.field2459);
        for (int var2 = 0; var2 < this.field2483.length; var2++) {
            arg0.method2120(this.field2483[var2]);
        }
        arg0.method2120(this.field2453);
    }

    @ObfuscatedName("ed.i(I)I")
    public int method2725() {
        byte var1 = 38;
        int var2 = var1 + class110.method1590(this.field2484);
        int var3 = var2 + class110.method1590(this.field2474);
        int var4 = var3 + class110.method1590(this.field2475);
        int var5 = var4 + class110.method1590(this.field2476);
        int var6 = var5 + class110.method1590(this.field2472);
        return var6 + class110.method1590(this.field2482);
    }
}
