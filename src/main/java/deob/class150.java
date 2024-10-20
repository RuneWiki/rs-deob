package deob;

@ObfuscatedName("ea")
public class class150 extends class191 {

    @ObfuscatedName("ea.p")
    public int field2445;

    @ObfuscatedName("ea.n")
    public boolean field2451;

    @ObfuscatedName("ea.c")
    public int field2453;

    @ObfuscatedName("ea.r")
    public int field2450;

    @ObfuscatedName("ea.an")
    public int field2454;

    @ObfuscatedName("ea.ao")
    public int field2455;

    @ObfuscatedName("ea.ah")
    public int field2456;

    @ObfuscatedName("ea.ai")
    public boolean field2457;

    @ObfuscatedName("ea.aa")
    public int field2458;

    @ObfuscatedName("ea.ar")
    public int field2443;

    @ObfuscatedName("ea.ae")
    public int field2464;

    @ObfuscatedName("ea.ak")
    public int field2446;

    @ObfuscatedName("ea.at")
    public String field2462;

    @ObfuscatedName("ea.am")
    public String field2449;

    @ObfuscatedName("ea.aw")
    public String field2463;

    @ObfuscatedName("ea.as")
    public String field2465;

    @ObfuscatedName("ea.aq")
    public int field2466;

    @ObfuscatedName("ea.ac")
    public int field2467;

    @ObfuscatedName("ea.aj")
    public int field2468;

    @ObfuscatedName("ea.av")
    public int field2469;

    @ObfuscatedName("ea.ax")
    public String field2461;

    @ObfuscatedName("ea.ap")
    public String field2471;

    @ObfuscatedName("ea.af")
    public int[] field2472 = new int[3];

    @ObfuscatedName("ea.az")
    public int field2473;

    public class150(boolean arg0) {
        if (arg0) {
            if (Statics.field2701.startsWith("win")) {
                this.field2445 = 1;
            } else if (Statics.field2701.startsWith("mac")) {
                this.field2445 = 2;
            } else if (Statics.field2701.startsWith("linux")) {
                this.field2445 = 3;
            } else {
                this.field2445 = 4;
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
                this.field2451 = true;
            } else {
                this.field2451 = false;
            }
            if (this.field2445 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2453 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2453 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2453 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2453 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2453 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2453 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2453 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2453 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2453 = 9;
                }
            } else if (this.field2445 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2453 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2453 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2453 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2453 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2450 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2450 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2450 = 4;
            } else {
                this.field2450 = 3;
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
            this.field2454 = var10;
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
            this.field2455 = var14;
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
            this.field2456 = var18;
            this.field2457 = false;
            this.field2458 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2454 > 3) {
                this.field2443 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2443 = 0;
            }
            this.field2464 = 0;
        }
        if (this.field2462 == null) {
            this.field2462 = "";
        }
        if (this.field2449 == null) {
            this.field2449 = "";
        }
        if (this.field2463 == null) {
            this.field2463 = "";
        }
        if (this.field2465 == null) {
            this.field2465 = "";
        }
        if (this.field2461 == null) {
            this.field2461 = "";
        }
        if (this.field2471 == null) {
            this.field2471 = "";
        }
        this.method2751();
    }

    @ObfuscatedName("ea.b(B)V")
    public void method2751() {
        if (this.field2462.length() > 40) {
            this.field2462 = this.field2462.substring(0, 40);
        }
        if (this.field2449.length() > 40) {
            this.field2449 = this.field2449.substring(0, 40);
        }
        if (this.field2463.length() > 10) {
            this.field2463 = this.field2463.substring(0, 10);
        }
        if (this.field2465.length() > 10) {
            this.field2465 = this.field2465.substring(0, 10);
        }
    }

    @ObfuscatedName("ea.e(Ldc;B)V")
    public void method2752(class110 arg0) {
        arg0.method2203(6);
        arg0.method2203(this.field2445);
        arg0.method2203(this.field2451 ? 1 : 0);
        arg0.method2203(this.field2453);
        arg0.method2203(this.field2450);
        arg0.method2203(this.field2454);
        arg0.method2203(this.field2455);
        arg0.method2203(this.field2456);
        arg0.method2203(this.field2457 ? 1 : 0);
        arg0.method2267(this.field2458);
        arg0.method2203(this.field2443);
        arg0.method2130(this.field2464);
        arg0.method2267(this.field2446);
        arg0.method2134(this.field2462);
        arg0.method2134(this.field2449);
        arg0.method2134(this.field2463);
        arg0.method2134(this.field2465);
        arg0.method2203(this.field2467);
        arg0.method2267(this.field2466);
        arg0.method2134(this.field2461);
        arg0.method2134(this.field2471);
        arg0.method2203(this.field2468);
        arg0.method2203(this.field2469);
        for (int var2 = 0; var2 < this.field2472.length; var2++) {
            arg0.method2131(this.field2472[var2]);
        }
        arg0.method2131(this.field2473);
    }

    @ObfuscatedName("ea.i(I)I")
    public int method2753() {
        byte var1 = 38;
        int var2 = var1 + class110.method3207(this.field2462);
        int var3 = var2 + class110.method3207(this.field2449);
        int var4 = var3 + class110.method3207(this.field2463);
        int var5 = var4 + class110.method3207(this.field2465);
        int var6 = var5 + class110.method3207(this.field2461);
        return var6 + class110.method3207(this.field2471);
    }
}
