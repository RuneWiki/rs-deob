package deob;

@ObfuscatedName("ez")
public class class151 extends class198 {

    @ObfuscatedName("ez.t")
    public int field2451;

    @ObfuscatedName("ez.l")
    public boolean field2452;

    @ObfuscatedName("ez.c")
    public int field2463;

    @ObfuscatedName("ez.aq")
    public int field2469;

    @ObfuscatedName("ez.av")
    public int field2457;

    @ObfuscatedName("ez.am")
    public int field2474;

    @ObfuscatedName("ez.ac")
    public int field2462;

    @ObfuscatedName("ez.ak")
    public boolean field2461;

    @ObfuscatedName("ez.aa")
    public int field2479;

    @ObfuscatedName("ez.ao")
    public int field2465;

    @ObfuscatedName("ez.as")
    public int field2466;

    @ObfuscatedName("ez.ab")
    public int field2458;

    @ObfuscatedName("ez.ay")
    public String field2468;

    @ObfuscatedName("ez.ax")
    public String field2464;

    @ObfuscatedName("ez.au")
    public String field2448;

    @ObfuscatedName("ez.ap")
    public String field2475;

    @ObfuscatedName("ez.aw")
    public int field2472;

    @ObfuscatedName("ez.ar")
    public int field2467;

    @ObfuscatedName("ez.at")
    public int field2459;

    @ObfuscatedName("ez.ah")
    public int field2460;

    @ObfuscatedName("ez.ag")
    public String field2476;

    @ObfuscatedName("ez.aj")
    public String field2477;

    @ObfuscatedName("ez.az")
    public int[] field2471 = new int[3];

    @ObfuscatedName("ez.bu")
    public int field2470;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field723.startsWith("win")) {
                this.field2451 = 1;
            } else if (Statics.field723.startsWith("mac")) {
                this.field2451 = 2;
            } else if (Statics.field723.startsWith("linux")) {
                this.field2451 = 3;
            } else {
                this.field2451 = 4;
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
                this.field2452 = true;
            } else {
                this.field2452 = false;
            }
            if (this.field2451 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2463 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2463 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2463 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2463 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2463 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2463 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2463 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2463 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2463 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2463 = 10;
                }
            } else if (this.field2451 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2463 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2463 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2463 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2463 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2463 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2463 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2463 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2469 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2469 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2469 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2469 = 4;
            } else {
                this.field2469 = 5;
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
            this.field2457 = var10;
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
            this.field2474 = var14;
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
            this.field2462 = var18;
            this.field2461 = false;
            this.field2479 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2457 > 3) {
                this.field2465 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2465 = 0;
            }
            this.field2466 = 0;
        }
        if (this.field2468 == null) {
            this.field2468 = "";
        }
        if (this.field2464 == null) {
            this.field2464 = "";
        }
        if (this.field2448 == null) {
            this.field2448 = "";
        }
        if (this.field2475 == null) {
            this.field2475 = "";
        }
        if (this.field2476 == null) {
            this.field2476 = "";
        }
        if (this.field2477 == null) {
            this.field2477 = "";
        }
        this.method2711();
    }

    @ObfuscatedName("ez.q(I)V")
    public void method2711() {
        if (this.field2468.length() > 40) {
            this.field2468 = this.field2468.substring(0, 40);
        }
        if (this.field2464.length() > 40) {
            this.field2464 = this.field2464.substring(0, 40);
        }
        if (this.field2448.length() > 10) {
            this.field2448 = this.field2448.substring(0, 10);
        }
        if (this.field2475.length() > 10) {
            this.field2475 = this.field2475.substring(0, 10);
        }
    }

    @ObfuscatedName("ez.s(Ldx;I)V")
    public void method2710(class111 arg0) {
        arg0.method2133(6);
        arg0.method2133(this.field2451);
        arg0.method2133(this.field2452 ? 1 : 0);
        arg0.method2133(this.field2463);
        arg0.method2133(this.field2469);
        arg0.method2133(this.field2457);
        arg0.method2133(this.field2474);
        arg0.method2133(this.field2462);
        arg0.method2133(this.field2461 ? 1 : 0);
        arg0.method2134(this.field2479);
        arg0.method2133(this.field2465);
        arg0.method2135(this.field2466);
        arg0.method2134(this.field2458);
        arg0.method2329(this.field2468);
        arg0.method2329(this.field2464);
        arg0.method2329(this.field2448);
        arg0.method2329(this.field2475);
        arg0.method2133(this.field2467);
        arg0.method2134(this.field2472);
        arg0.method2329(this.field2476);
        arg0.method2329(this.field2477);
        arg0.method2133(this.field2459);
        arg0.method2133(this.field2460);
        for (int var2 = 0; var2 < this.field2471.length; var2++) {
            arg0.method2136(this.field2471[var2]);
        }
        arg0.method2136(this.field2470);
    }

    @ObfuscatedName("ez.h(I)I")
    public int method2713() {
        byte var1 = 38;
        int var2 = var1 + class111.method831(this.field2468);
        int var3 = var2 + class111.method831(this.field2464);
        int var4 = var3 + class111.method831(this.field2448);
        int var5 = var4 + class111.method831(this.field2475);
        int var6 = var5 + class111.method831(this.field2476);
        return var6 + class111.method831(this.field2477);
    }
}
