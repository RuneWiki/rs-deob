package deob;

@ObfuscatedName("ev")
public class class151 extends class199 {

    @ObfuscatedName("ev.e")
    public int field2519;

    @ObfuscatedName("ev.q")
    public boolean field2515;

    @ObfuscatedName("ev.d")
    public int field2520;

    @ObfuscatedName("ev.am")
    public int field2528;

    @ObfuscatedName("ev.ar")
    public int field2529;

    @ObfuscatedName("ev.an")
    public int field2530;

    @ObfuscatedName("ev.az")
    public int field2531;

    @ObfuscatedName("ev.at")
    public boolean field2523;

    @ObfuscatedName("ev.ag")
    public int field2533;

    @ObfuscatedName("ev.ao")
    public int field2547;

    @ObfuscatedName("ev.ay")
    public int field2535;

    @ObfuscatedName("ev.aq")
    public int field2536;

    @ObfuscatedName("ev.aw")
    public String field2537;

    @ObfuscatedName("ev.al")
    public String field2518;

    @ObfuscatedName("ev.ap")
    public String field2526;

    @ObfuscatedName("ev.ac")
    public String field2540;

    @ObfuscatedName("ev.av")
    public int field2541;

    @ObfuscatedName("ev.ai")
    public int field2542;

    @ObfuscatedName("ev.ax")
    public int field2532;

    @ObfuscatedName("ev.ae")
    public int field2527;

    @ObfuscatedName("ev.aa")
    public String field2545;

    @ObfuscatedName("ev.ak")
    public String field2546;

    @ObfuscatedName("ev.ad")
    public int[] field2538 = new int[3];

    @ObfuscatedName("ev.bt")
    public int field2548;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field1953.startsWith("win")) {
                this.field2519 = 1;
            } else if (Statics.field1953.startsWith("mac")) {
                this.field2519 = 2;
            } else if (Statics.field1953.startsWith("linux")) {
                this.field2519 = 3;
            } else {
                this.field2519 = 4;
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
                this.field2515 = true;
            } else {
                this.field2515 = false;
            }
            if (this.field2519 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2520 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2520 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2520 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2520 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2520 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2520 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2520 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2520 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2520 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2520 = 10;
                }
            } else if (this.field2519 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2520 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2520 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2520 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2520 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2520 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2520 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2520 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2528 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2528 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2528 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2528 = 4;
            } else {
                this.field2528 = 5;
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
            this.field2529 = var10;
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
            this.field2530 = var14;
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
            this.field2531 = var18;
            this.field2523 = false;
            this.field2533 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2529 > 3) {
                this.field2547 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2547 = 0;
            }
            this.field2535 = 0;
        }
        if (this.field2537 == null) {
            this.field2537 = "";
        }
        if (this.field2518 == null) {
            this.field2518 = "";
        }
        if (this.field2526 == null) {
            this.field2526 = "";
        }
        if (this.field2540 == null) {
            this.field2540 = "";
        }
        if (this.field2545 == null) {
            this.field2545 = "";
        }
        if (this.field2546 == null) {
            this.field2546 = "";
        }
        this.method2799();
    }

    @ObfuscatedName("ev.y(I)V")
    public void method2799() {
        if (this.field2537.length() > 40) {
            this.field2537 = this.field2537.substring(0, 40);
        }
        if (this.field2518.length() > 40) {
            this.field2518 = this.field2518.substring(0, 40);
        }
        if (this.field2526.length() > 10) {
            this.field2526 = this.field2526.substring(0, 10);
        }
        if (this.field2540.length() > 10) {
            this.field2540 = this.field2540.substring(0, 10);
        }
    }

    @ObfuscatedName("ev.k(Ldw;I)V")
    public void method2806(class111 arg0) {
        arg0.method2145(6);
        arg0.method2145(this.field2519);
        arg0.method2145(this.field2515 ? 1 : 0);
        arg0.method2145(this.field2520);
        arg0.method2145(this.field2528);
        arg0.method2145(this.field2529);
        arg0.method2145(this.field2530);
        arg0.method2145(this.field2531);
        arg0.method2145(this.field2523 ? 1 : 0);
        arg0.method2319(this.field2533);
        arg0.method2145(this.field2547);
        arg0.method2147(this.field2535);
        arg0.method2319(this.field2536);
        arg0.method2290(this.field2537);
        arg0.method2290(this.field2518);
        arg0.method2290(this.field2526);
        arg0.method2290(this.field2540);
        arg0.method2145(this.field2542);
        arg0.method2319(this.field2541);
        arg0.method2290(this.field2545);
        arg0.method2290(this.field2546);
        arg0.method2145(this.field2532);
        arg0.method2145(this.field2527);
        for (int var2 = 0; var2 < this.field2538.length; var2++) {
            arg0.method2148(this.field2538[var2]);
        }
        arg0.method2148(this.field2548);
    }

    @ObfuscatedName("ev.g(I)I")
    public int method2801() {
        byte var1 = 38;
        String var3 = this.field2537;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2518;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2526;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2540;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2545;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2546;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
