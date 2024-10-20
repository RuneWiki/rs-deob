package deob;

@ObfuscatedName("eg")
public class class150 extends class178 {

    @ObfuscatedName("eg.k")
    public int field2467;

    @ObfuscatedName("eg.g")
    public boolean field2468;

    @ObfuscatedName("eg.a")
    public int field2473;

    @ObfuscatedName("eg.q")
    public int field2475;

    @ObfuscatedName("eg.ae")
    public int field2481;

    @ObfuscatedName("eg.at")
    public int field2477;

    @ObfuscatedName("eg.aj")
    public int field2478;

    @ObfuscatedName("eg.aq")
    public boolean field2489;

    @ObfuscatedName("eg.ac")
    public int field2480;

    @ObfuscatedName("eg.ao")
    public int field2485;

    @ObfuscatedName("eg.ad")
    public int field2465;

    @ObfuscatedName("eg.an")
    public int field2471;

    @ObfuscatedName("eg.al")
    public String field2484;

    @ObfuscatedName("eg.ab")
    public String field2482;

    @ObfuscatedName("eg.af")
    public String field2496;

    @ObfuscatedName("eg.ap")
    public String field2479;

    @ObfuscatedName("eg.as")
    public int field2492;

    @ObfuscatedName("eg.av")
    public int field2464;

    @ObfuscatedName("eg.ay")
    public int field2490;

    @ObfuscatedName("eg.ah")
    public int field2491;

    @ObfuscatedName("eg.aa")
    public String field2463;

    @ObfuscatedName("eg.ag")
    public String field2493;

    @ObfuscatedName("eg.au")
    public int[] field2494 = new int[3];

    @ObfuscatedName("eg.aw")
    public int field2495;

    public class150(boolean arg0) {
        if (arg0) {
            if (Statics.field1437.startsWith("win")) {
                this.field2467 = 1;
            } else if (Statics.field1437.startsWith("mac")) {
                this.field2467 = 2;
            } else if (Statics.field1437.startsWith("linux")) {
                this.field2467 = 3;
            } else {
                this.field2467 = 4;
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
                this.field2468 = true;
            } else {
                this.field2468 = false;
            }
            if (this.field2467 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2473 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2473 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2473 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2473 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2473 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2473 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2473 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2473 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2473 = 9;
                }
            } else if (this.field2467 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2473 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2473 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2473 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2473 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2475 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2475 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2475 = 4;
            } else {
                this.field2475 = 3;
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
            this.field2477 = var14;
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
            this.field2478 = var18;
            this.field2489 = false;
            this.field2480 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2481 > 3) {
                this.field2485 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2485 = 0;
            }
            this.field2465 = 0;
        }
        if (this.field2484 == null) {
            this.field2484 = "";
        }
        if (this.field2482 == null) {
            this.field2482 = "";
        }
        if (this.field2496 == null) {
            this.field2496 = "";
        }
        if (this.field2479 == null) {
            this.field2479 = "";
        }
        if (this.field2463 == null) {
            this.field2463 = "";
        }
        if (this.field2493 == null) {
            this.field2493 = "";
        }
        this.method2905();
    }

    @ObfuscatedName("eg.p(I)V")
    public void method2905() {
        if (this.field2484.length() > 40) {
            this.field2484 = this.field2484.substring(0, 40);
        }
        if (this.field2482.length() > 40) {
            this.field2482 = this.field2482.substring(0, 40);
        }
        if (this.field2496.length() > 10) {
            this.field2496 = this.field2496.substring(0, 10);
        }
        if (this.field2479.length() > 10) {
            this.field2479 = this.field2479.substring(0, 10);
        }
    }

    @ObfuscatedName("eg.j(Ldv;I)V")
    public void method2907(class126 arg0) {
        arg0.method2362(6);
        arg0.method2362(this.field2467);
        arg0.method2362(this.field2468 ? 1 : 0);
        arg0.method2362(this.field2473);
        arg0.method2362(this.field2475);
        arg0.method2362(this.field2481);
        arg0.method2362(this.field2477);
        arg0.method2362(this.field2478);
        arg0.method2362(this.field2489 ? 1 : 0);
        arg0.method2363(this.field2480);
        arg0.method2362(this.field2485);
        arg0.method2364(this.field2465);
        arg0.method2363(this.field2471);
        arg0.method2367(this.field2484);
        arg0.method2367(this.field2482);
        arg0.method2367(this.field2496);
        arg0.method2367(this.field2479);
        arg0.method2362(this.field2464);
        arg0.method2363(this.field2492);
        arg0.method2367(this.field2463);
        arg0.method2367(this.field2493);
        arg0.method2362(this.field2490);
        arg0.method2362(this.field2491);
        for (int var2 = 0; var2 < this.field2494.length; var2++) {
            arg0.method2365(this.field2494[var2]);
        }
        arg0.method2365(this.field2495);
    }

    @ObfuscatedName("eg.w(B)I")
    public int method2903() {
        byte var1 = 38;
        int var2 = var1 + class126.method786(this.field2484);
        int var3 = var2 + class126.method786(this.field2482);
        int var4 = var3 + class126.method786(this.field2496);
        int var5 = var4 + class126.method786(this.field2479);
        int var6 = var5 + class126.method786(this.field2463);
        return var6 + class126.method786(this.field2493);
    }
}
