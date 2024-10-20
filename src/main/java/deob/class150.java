package deob;

@ObfuscatedName("es")
public class class150 extends class178 {

    @ObfuscatedName("es.q")
    public int field2466;

    @ObfuscatedName("es.a")
    public boolean field2456;

    @ObfuscatedName("es.f")
    public int field2459;

    @ObfuscatedName("es.o")
    public int field2464;

    @ObfuscatedName("es.ax")
    public int field2462;

    @ObfuscatedName("es.aa")
    public int field2463;

    @ObfuscatedName("es.af")
    public int field2471;

    @ObfuscatedName("es.al")
    public boolean field2465;

    @ObfuscatedName("es.av")
    public int field2474;

    @ObfuscatedName("es.ad")
    public int field2468;

    @ObfuscatedName("es.ak")
    public int field2469;

    @ObfuscatedName("es.ao")
    public int field2455;

    @ObfuscatedName("es.aq")
    public String field2458;

    @ObfuscatedName("es.aj")
    public String field2472;

    @ObfuscatedName("es.ag")
    public String field2470;

    @ObfuscatedName("es.ap")
    public String field2461;

    @ObfuscatedName("es.an")
    public int field2475;

    @ObfuscatedName("es.as")
    public int field2476;

    @ObfuscatedName("es.au")
    public int field2477;

    @ObfuscatedName("es.ay")
    public int field2478;

    @ObfuscatedName("es.ah")
    public String field2479;

    @ObfuscatedName("es.aw")
    public String field2480;

    @ObfuscatedName("es.ac")
    public int[] field2481 = new int[3];

    @ObfuscatedName("es.az")
    public int field2482;

    public class150(boolean arg0) {
        if (arg0) {
            if (Statics.field1413.startsWith("win")) {
                this.field2466 = 1;
            } else if (Statics.field1413.startsWith("mac")) {
                this.field2466 = 2;
            } else if (Statics.field1413.startsWith("linux")) {
                this.field2466 = 3;
            } else {
                this.field2466 = 4;
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
            if (this.field2466 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2459 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2459 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2459 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2459 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2459 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2459 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2459 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2459 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2459 = 9;
                }
            } else if (this.field2466 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2459 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2459 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2459 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2459 = 23;
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
            this.field2462 = var10;
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
            this.field2463 = var14;
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
            this.field2471 = var18;
            this.field2465 = false;
            this.field2474 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2462 > 3) {
                this.field2468 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2468 = 0;
            }
            this.field2469 = 0;
        }
        if (this.field2458 == null) {
            this.field2458 = "";
        }
        if (this.field2472 == null) {
            this.field2472 = "";
        }
        if (this.field2470 == null) {
            this.field2470 = "";
        }
        if (this.field2461 == null) {
            this.field2461 = "";
        }
        if (this.field2479 == null) {
            this.field2479 = "";
        }
        if (this.field2480 == null) {
            this.field2480 = "";
        }
        this.method2954();
    }

    @ObfuscatedName("es.u(I)V")
    public void method2954() {
        if (this.field2458.length() > 40) {
            this.field2458 = this.field2458.substring(0, 40);
        }
        if (this.field2472.length() > 40) {
            this.field2472 = this.field2472.substring(0, 40);
        }
        if (this.field2470.length() > 10) {
            this.field2470 = this.field2470.substring(0, 10);
        }
        if (this.field2461.length() > 10) {
            this.field2461 = this.field2461.substring(0, 10);
        }
    }

    @ObfuscatedName("es.k(Ldl;I)V")
    public void method2959(class126 arg0) {
        arg0.method2554(6);
        arg0.method2554(this.field2466);
        arg0.method2554(this.field2456 ? 1 : 0);
        arg0.method2554(this.field2459);
        arg0.method2554(this.field2464);
        arg0.method2554(this.field2462);
        arg0.method2554(this.field2463);
        arg0.method2554(this.field2471);
        arg0.method2554(this.field2465 ? 1 : 0);
        arg0.method2435(this.field2474);
        arg0.method2554(this.field2468);
        arg0.method2436(this.field2469);
        arg0.method2435(this.field2455);
        arg0.method2440(this.field2458);
        arg0.method2440(this.field2472);
        arg0.method2440(this.field2470);
        arg0.method2440(this.field2461);
        arg0.method2554(this.field2476);
        arg0.method2435(this.field2475);
        arg0.method2440(this.field2479);
        arg0.method2440(this.field2480);
        arg0.method2554(this.field2477);
        arg0.method2554(this.field2478);
        for (int var2 = 0; var2 < this.field2481.length; var2++) {
            arg0.method2551(this.field2481[var2]);
        }
        arg0.method2551(this.field2482);
    }

    @ObfuscatedName("es.x(I)I")
    public int method2956() {
        byte var1 = 38;
        String var3 = this.field2458;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2472;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2470;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2461;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2479;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2480;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
