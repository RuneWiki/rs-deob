package deob;

@ObfuscatedName("er")
public class class151 extends class198 {

    @ObfuscatedName("er.w")
    public int field2462;

    @ObfuscatedName("er.i")
    public boolean field2458;

    @ObfuscatedName("er.p")
    public int field2463;

    @ObfuscatedName("er.aw")
    public int field2465;

    @ObfuscatedName("er.am")
    public int field2483;

    @ObfuscatedName("er.au")
    public int field2467;

    @ObfuscatedName("er.ae")
    public int field2468;

    @ObfuscatedName("er.ab")
    public boolean field2478;

    @ObfuscatedName("er.av")
    public int field2470;

    @ObfuscatedName("er.ag")
    public int field2471;

    @ObfuscatedName("er.ah")
    public int field2472;

    @ObfuscatedName("er.at")
    public int field2473;

    @ObfuscatedName("er.al")
    public String field2459;

    @ObfuscatedName("er.ak")
    public String field2464;

    @ObfuscatedName("er.ar")
    public String field2476;

    @ObfuscatedName("er.aq")
    public String field2477;

    @ObfuscatedName("er.ac")
    public int field2481;

    @ObfuscatedName("er.ad")
    public int field2479;

    @ObfuscatedName("er.an")
    public int field2480;

    @ObfuscatedName("er.az")
    public int field2484;

    @ObfuscatedName("er.af")
    public String field2469;

    @ObfuscatedName("er.as")
    public String field2456;

    @ObfuscatedName("er.aa")
    public int[] field2475 = new int[3];

    @ObfuscatedName("er.bl")
    public int field2485;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field2566.startsWith("win")) {
                this.field2462 = 1;
            } else if (Statics.field2566.startsWith("mac")) {
                this.field2462 = 2;
            } else if (Statics.field2566.startsWith("linux")) {
                this.field2462 = 3;
            } else {
                this.field2462 = 4;
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
                this.field2458 = true;
            } else {
                this.field2458 = false;
            }
            if (this.field2462 == 1) {
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
            } else if (this.field2462 == 2) {
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
                this.field2465 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2465 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2465 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2465 = 4;
            } else {
                this.field2465 = 5;
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
            this.field2478 = false;
            this.field2470 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2483 > 3) {
                this.field2471 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2471 = 0;
            }
            this.field2472 = 0;
        }
        if (this.field2459 == null) {
            this.field2459 = "";
        }
        if (this.field2464 == null) {
            this.field2464 = "";
        }
        if (this.field2476 == null) {
            this.field2476 = "";
        }
        if (this.field2477 == null) {
            this.field2477 = "";
        }
        if (this.field2469 == null) {
            this.field2469 = "";
        }
        if (this.field2456 == null) {
            this.field2456 = "";
        }
        this.method2785();
    }

    @ObfuscatedName("er.e(I)V")
    public void method2785() {
        if (this.field2459.length() > 40) {
            this.field2459 = this.field2459.substring(0, 40);
        }
        if (this.field2464.length() > 40) {
            this.field2464 = this.field2464.substring(0, 40);
        }
        if (this.field2476.length() > 10) {
            this.field2476 = this.field2476.substring(0, 10);
        }
        if (this.field2477.length() > 10) {
            this.field2477 = this.field2477.substring(0, 10);
        }
    }

    @ObfuscatedName("er.a(Ldh;B)V")
    public void method2787(class111 arg0) {
        arg0.method2366(6);
        arg0.method2366(this.field2462);
        arg0.method2366(this.field2458 ? 1 : 0);
        arg0.method2366(this.field2463);
        arg0.method2366(this.field2465);
        arg0.method2366(this.field2483);
        arg0.method2366(this.field2467);
        arg0.method2366(this.field2468);
        arg0.method2366(this.field2478 ? 1 : 0);
        arg0.method2190(this.field2470);
        arg0.method2366(this.field2471);
        arg0.method2163(this.field2472);
        arg0.method2190(this.field2473);
        arg0.method2264(this.field2459);
        arg0.method2264(this.field2464);
        arg0.method2264(this.field2476);
        arg0.method2264(this.field2477);
        arg0.method2366(this.field2479);
        arg0.method2190(this.field2481);
        arg0.method2264(this.field2469);
        arg0.method2264(this.field2456);
        arg0.method2366(this.field2480);
        arg0.method2366(this.field2484);
        for (int var2 = 0; var2 < this.field2475.length; var2++) {
            arg0.method2229(this.field2475[var2]);
        }
        arg0.method2229(this.field2485);
    }

    @ObfuscatedName("er.l(I)I")
    public int method2788() {
        byte var1 = 38;
        int var2 = var1 + class111.method1927(this.field2459);
        int var3 = var2 + class111.method1927(this.field2464);
        int var4 = var3 + class111.method1927(this.field2476);
        int var5 = var4 + class111.method1927(this.field2477);
        int var6 = var5 + class111.method1927(this.field2469);
        return var6 + class111.method1927(this.field2456);
    }
}
