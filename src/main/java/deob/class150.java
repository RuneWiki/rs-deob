package deob;

@ObfuscatedName("em")
public class class150 extends class178 {

    @ObfuscatedName("em.k")
    public int field2454;

    @ObfuscatedName("em.e")
    public boolean field2457;

    @ObfuscatedName("em.a")
    public int field2463;

    @ObfuscatedName("em.y")
    public int field2464;

    @ObfuscatedName("em.au")
    public int field2481;

    @ObfuscatedName("em.az")
    public int field2466;

    @ObfuscatedName("em.ak")
    public int field2467;

    @ObfuscatedName("em.ah")
    public boolean field2468;

    @ObfuscatedName("em.aa")
    public int field2469;

    @ObfuscatedName("em.al")
    public int field2470;

    @ObfuscatedName("em.ab")
    public int field2471;

    @ObfuscatedName("em.as")
    public int field2472;

    @ObfuscatedName("em.ai")
    public String field2473;

    @ObfuscatedName("em.aj")
    public String field2474;

    @ObfuscatedName("em.an")
    public String field2475;

    @ObfuscatedName("em.av")
    public String field2482;

    @ObfuscatedName("em.af")
    public int field2453;

    @ObfuscatedName("em.ax")
    public int field2478;

    @ObfuscatedName("em.ao")
    public int field2455;

    @ObfuscatedName("em.aw")
    public int field2480;

    @ObfuscatedName("em.ap")
    public String field2452;

    @ObfuscatedName("em.ay")
    public String field2476;

    @ObfuscatedName("em.ag")
    public int[] field2483 = new int[3];

    @ObfuscatedName("em.ar")
    public int field2458;

    public class150(boolean arg0) {
        if (arg0) {
            if (Statics.field109.startsWith("win")) {
                this.field2454 = 1;
            } else if (Statics.field109.startsWith("mac")) {
                this.field2454 = 2;
            } else if (Statics.field109.startsWith("linux")) {
                this.field2454 = 3;
            } else {
                this.field2454 = 4;
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
                this.field2457 = true;
            } else {
                this.field2457 = false;
            }
            if (this.field2454 == 1) {
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
                }
            } else if (this.field2454 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2463 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2463 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2463 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2463 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2464 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2464 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2464 = 4;
            } else {
                this.field2464 = 3;
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
            this.field2481 = var10;
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
            this.field2466 = var14;
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
            this.field2467 = var18;
            this.field2468 = false;
            this.field2469 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2481 > 3) {
                this.field2470 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2470 = 0;
            }
            this.field2471 = 0;
        }
        if (this.field2473 == null) {
            this.field2473 = "";
        }
        if (this.field2474 == null) {
            this.field2474 = "";
        }
        if (this.field2475 == null) {
            this.field2475 = "";
        }
        if (this.field2482 == null) {
            this.field2482 = "";
        }
        if (this.field2452 == null) {
            this.field2452 = "";
        }
        if (this.field2476 == null) {
            this.field2476 = "";
        }
        this.method2950();
    }

    @ObfuscatedName("em.v(I)V")
    public void method2950() {
        if (this.field2473.length() > 40) {
            this.field2473 = this.field2473.substring(0, 40);
        }
        if (this.field2474.length() > 40) {
            this.field2474 = this.field2474.substring(0, 40);
        }
        if (this.field2475.length() > 10) {
            this.field2475 = this.field2475.substring(0, 10);
        }
        if (this.field2482.length() > 10) {
            this.field2482 = this.field2482.substring(0, 10);
        }
    }

    @ObfuscatedName("em.f(Ldr;I)V")
    public void method2954(class126 arg0) {
        arg0.method2452(6);
        arg0.method2452(this.field2454);
        arg0.method2452(this.field2457 ? 1 : 0);
        arg0.method2452(this.field2463);
        arg0.method2452(this.field2464);
        arg0.method2452(this.field2481);
        arg0.method2452(this.field2466);
        arg0.method2452(this.field2467);
        arg0.method2452(this.field2468 ? 1 : 0);
        arg0.method2642(this.field2469);
        arg0.method2452(this.field2470);
        arg0.method2568(this.field2471);
        arg0.method2642(this.field2472);
        arg0.method2629(this.field2473);
        arg0.method2629(this.field2474);
        arg0.method2629(this.field2475);
        arg0.method2629(this.field2482);
        arg0.method2452(this.field2478);
        arg0.method2642(this.field2453);
        arg0.method2629(this.field2452);
        arg0.method2629(this.field2476);
        arg0.method2452(this.field2455);
        arg0.method2452(this.field2480);
        for (int var2 = 0; var2 < this.field2483.length; var2++) {
            arg0.method2455(this.field2483[var2]);
        }
        arg0.method2455(this.field2458);
    }

    @ObfuscatedName("em.n(I)I")
    public int method2952() {
        byte var1 = 38;
        int var2 = var1 + class126.method1308(this.field2473);
        int var3 = var2 + class126.method1308(this.field2474);
        int var4 = var3 + class126.method1308(this.field2475);
        int var5 = var4 + class126.method1308(this.field2482);
        int var6 = var5 + class126.method1308(this.field2452);
        return var6 + class126.method1308(this.field2476);
    }
}
