package deob;

@ObfuscatedName("eq")
public class class151 extends class179 {

    @ObfuscatedName("eq.n")
    public int field2464;

    @ObfuscatedName("eq.o")
    public boolean field2465;

    @ObfuscatedName("eq.b")
    public int field2470;

    @ObfuscatedName("eq.i")
    public int field2463;

    @ObfuscatedName("eq.ah")
    public int field2474;

    @ObfuscatedName("eq.ag")
    public int field2483;

    @ObfuscatedName("eq.ay")
    public int field2476;

    @ObfuscatedName("eq.as")
    public boolean field2477;

    @ObfuscatedName("eq.aq")
    public int field2489;

    @ObfuscatedName("eq.an")
    public int field2479;

    @ObfuscatedName("eq.at")
    public int field2481;

    @ObfuscatedName("eq.ap")
    public int field2473;

    @ObfuscatedName("eq.ae")
    public String field2475;

    @ObfuscatedName("eq.af")
    public String field2484;

    @ObfuscatedName("eq.ai")
    public String field2485;

    @ObfuscatedName("eq.aj")
    public String field2482;

    @ObfuscatedName("eq.ax")
    public int field2487;

    @ObfuscatedName("eq.ak")
    public int field2488;

    @ObfuscatedName("eq.az")
    public int field2461;

    @ObfuscatedName("eq.aa")
    public int field2490;

    @ObfuscatedName("eq.au")
    public String field2480;

    @ObfuscatedName("eq.ar")
    public String field2462;

    @ObfuscatedName("eq.ao")
    public int[] field2493 = new int[3];

    @ObfuscatedName("eq.aw")
    public int field2478;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field2389.startsWith("win")) {
                this.field2464 = 1;
            } else if (Statics.field2389.startsWith("mac")) {
                this.field2464 = 2;
            } else if (Statics.field2389.startsWith("linux")) {
                this.field2464 = 3;
            } else {
                this.field2464 = 4;
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
                this.field2465 = true;
            } else {
                this.field2465 = false;
            }
            if (this.field2464 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2470 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2470 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2470 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2470 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2470 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2470 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2470 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2470 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2470 = 9;
                }
            } else if (this.field2464 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2470 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2470 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2470 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2470 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2463 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2463 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2463 = 4;
            } else {
                this.field2463 = 3;
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
            this.field2483 = var14;
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
            this.field2477 = false;
            this.field2489 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2474 > 3) {
                this.field2479 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2479 = 0;
            }
            this.field2481 = 0;
        }
        if (this.field2475 == null) {
            this.field2475 = "";
        }
        if (this.field2484 == null) {
            this.field2484 = "";
        }
        if (this.field2485 == null) {
            this.field2485 = "";
        }
        if (this.field2482 == null) {
            this.field2482 = "";
        }
        if (this.field2480 == null) {
            this.field2480 = "";
        }
        if (this.field2462 == null) {
            this.field2462 = "";
        }
        this.method2930();
    }

    @ObfuscatedName("eq.a(B)V")
    public void method2930() {
        if (this.field2475.length() > 40) {
            this.field2475 = this.field2475.substring(0, 40);
        }
        if (this.field2484.length() > 40) {
            this.field2484 = this.field2484.substring(0, 40);
        }
        if (this.field2485.length() > 10) {
            this.field2485 = this.field2485.substring(0, 10);
        }
        if (this.field2482.length() > 10) {
            this.field2482 = this.field2482.substring(0, 10);
        }
    }

    @ObfuscatedName("eq.x(Ldy;B)V")
    public void method2927(class127 arg0) {
        arg0.method2455(6);
        arg0.method2455(this.field2464);
        arg0.method2455(this.field2465 ? 1 : 0);
        arg0.method2455(this.field2470);
        arg0.method2455(this.field2463);
        arg0.method2455(this.field2474);
        arg0.method2455(this.field2483);
        arg0.method2455(this.field2476);
        arg0.method2455(this.field2477 ? 1 : 0);
        arg0.method2398(this.field2489);
        arg0.method2455(this.field2479);
        arg0.method2399(this.field2481);
        arg0.method2398(this.field2473);
        arg0.method2475(this.field2475);
        arg0.method2475(this.field2484);
        arg0.method2475(this.field2485);
        arg0.method2475(this.field2482);
        arg0.method2455(this.field2488);
        arg0.method2398(this.field2487);
        arg0.method2475(this.field2480);
        arg0.method2475(this.field2462);
        arg0.method2455(this.field2461);
        arg0.method2455(this.field2490);
        for (int var2 = 0; var2 < this.field2493.length; var2++) {
            arg0.method2400(this.field2493[var2]);
        }
        arg0.method2400(this.field2478);
    }

    @ObfuscatedName("eq.e(B)I")
    public int method2928() {
        byte var1 = 38;
        int var2 = var1 + class127.method604(this.field2475);
        int var3 = var2 + class127.method604(this.field2484);
        int var4 = var3 + class127.method604(this.field2485);
        int var5 = var4 + class127.method604(this.field2482);
        int var6 = var5 + class127.method604(this.field2480);
        return var6 + class127.method604(this.field2462);
    }
}
