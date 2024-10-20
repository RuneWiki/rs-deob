package deob;

@ObfuscatedName("ei")
public class class146 extends class187 {

    @ObfuscatedName("ei.m")
    public int field2442;

    @ObfuscatedName("ei.u")
    public boolean field2449;

    @ObfuscatedName("ei.v")
    public int field2463;

    @ObfuscatedName("ei.c")
    public int field2465;

    @ObfuscatedName("ei.ar")
    public int field2443;

    @ObfuscatedName("ei.ac")
    public int field2454;

    @ObfuscatedName("ei.ah")
    public int field2467;

    @ObfuscatedName("ei.ap")
    public boolean field2456;

    @ObfuscatedName("ei.aj")
    public int field2457;

    @ObfuscatedName("ei.aa")
    public int field2458;

    @ObfuscatedName("ei.ae")
    public int field2459;

    @ObfuscatedName("ei.ai")
    public int field2460;

    @ObfuscatedName("ei.ay")
    public String field2468;

    @ObfuscatedName("ei.ax")
    public String field2469;

    @ObfuscatedName("ei.au")
    public String field2455;

    @ObfuscatedName("ei.az")
    public String field2464;

    @ObfuscatedName("ei.aw")
    public int field2438;

    @ObfuscatedName("ei.ag")
    public int field2466;

    @ObfuscatedName("ei.ao")
    public int field2471;

    @ObfuscatedName("ei.aq")
    public int field2462;

    @ObfuscatedName("ei.ak")
    public String field2461;

    @ObfuscatedName("ei.al")
    public String field2470;

    @ObfuscatedName("ei.at")
    public int[] field2446 = new int[3];

    @ObfuscatedName("ei.an")
    public int field2472;

    public class146(boolean arg0) {
        if (arg0) {
            if (Statics.field2117.startsWith("win")) {
                this.field2442 = 1;
            } else if (Statics.field2117.startsWith("mac")) {
                this.field2442 = 2;
            } else if (Statics.field2117.startsWith("linux")) {
                this.field2442 = 3;
            } else {
                this.field2442 = 4;
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
                this.field2449 = true;
            } else {
                this.field2449 = false;
            }
            if (this.field2442 == 1) {
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
            } else if (this.field2442 == 2) {
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
            this.field2443 = var10;
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
            this.field2454 = var14;
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
            this.field2456 = false;
            this.field2457 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2443 > 3) {
                this.field2458 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2458 = 0;
            }
            this.field2459 = 0;
        }
        if (this.field2468 == null) {
            this.field2468 = "";
        }
        if (this.field2469 == null) {
            this.field2469 = "";
        }
        if (this.field2455 == null) {
            this.field2455 = "";
        }
        if (this.field2464 == null) {
            this.field2464 = "";
        }
        if (this.field2461 == null) {
            this.field2461 = "";
        }
        if (this.field2470 == null) {
            this.field2470 = "";
        }
        this.method2673();
    }

    @ObfuscatedName("ei.g(B)V")
    public void method2673() {
        if (this.field2468.length() > 40) {
            this.field2468 = this.field2468.substring(0, 40);
        }
        if (this.field2469.length() > 40) {
            this.field2469 = this.field2469.substring(0, 40);
        }
        if (this.field2455.length() > 10) {
            this.field2455 = this.field2455.substring(0, 10);
        }
        if (this.field2464.length() > 10) {
            this.field2464 = this.field2464.substring(0, 10);
        }
    }

    @ObfuscatedName("ei.i(Ldk;I)V")
    public void method2670(class107 arg0) {
        arg0.method2079(6);
        arg0.method2079(this.field2442);
        arg0.method2079(this.field2449 ? 1 : 0);
        arg0.method2079(this.field2463);
        arg0.method2079(this.field2465);
        arg0.method2079(this.field2443);
        arg0.method2079(this.field2454);
        arg0.method2079(this.field2467);
        arg0.method2079(this.field2456 ? 1 : 0);
        arg0.method2100(this.field2457);
        arg0.method2079(this.field2458);
        arg0.method2080(this.field2459);
        arg0.method2100(this.field2460);
        arg0.method2084(this.field2468);
        arg0.method2084(this.field2469);
        arg0.method2084(this.field2455);
        arg0.method2084(this.field2464);
        arg0.method2079(this.field2466);
        arg0.method2100(this.field2438);
        arg0.method2084(this.field2461);
        arg0.method2084(this.field2470);
        arg0.method2079(this.field2471);
        arg0.method2079(this.field2462);
        for (int var2 = 0; var2 < this.field2446.length; var2++) {
            arg0.method2247(this.field2446[var2]);
        }
        arg0.method2247(this.field2472);
    }

    @ObfuscatedName("ei.k(I)I")
    public int method2674() {
        byte var1 = 38;
        int var2 = var1 + class107.method493(this.field2468);
        String var4 = this.field2469;
        int var5 = var4.length() + 2;
        int var6 = var2 + var5;
        String var8 = this.field2455;
        int var9 = var8.length() + 2;
        int var10 = var6 + var9;
        int var11 = var10 + class107.method493(this.field2464);
        String var13 = this.field2461;
        int var14 = var13.length() + 2;
        int var15 = var11 + var14;
        return var15 + class107.method493(this.field2470);
    }
}
