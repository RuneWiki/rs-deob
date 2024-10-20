package deob;

@ObfuscatedName("eu")
public class class148 extends class189 {

    @ObfuscatedName("eu.l")
    public int field2434;

    @ObfuscatedName("eu.a")
    public boolean field2435;

    @ObfuscatedName("eu.y")
    public int field2437;

    @ObfuscatedName("eu.d")
    public int field2439;

    @ObfuscatedName("eu.ac")
    public int field2432;

    @ObfuscatedName("eu.ax")
    public int field2465;

    @ObfuscatedName("eu.af")
    public int field2461;

    @ObfuscatedName("eu.am")
    public boolean field2458;

    @ObfuscatedName("eu.ah")
    public int field2444;

    @ObfuscatedName("eu.ad")
    public int field2446;

    @ObfuscatedName("eu.ae")
    public int field2440;

    @ObfuscatedName("eu.ab")
    public int field2460;

    @ObfuscatedName("eu.ai")
    public String field2449;

    @ObfuscatedName("eu.ag")
    public String field2450;

    @ObfuscatedName("eu.ap")
    public String field2451;

    @ObfuscatedName("eu.at")
    public String field2431;

    @ObfuscatedName("eu.az")
    public int field2453;

    @ObfuscatedName("eu.an")
    public int field2454;

    @ObfuscatedName("eu.ay")
    public int field2455;

    @ObfuscatedName("eu.aw")
    public int field2456;

    @ObfuscatedName("eu.ak")
    public String field2457;

    @ObfuscatedName("eu.aq")
    public String field2447;

    @ObfuscatedName("eu.aa")
    public int[] field2459 = new int[3];

    @ObfuscatedName("eu.aj")
    public int field2441;

    public class148(boolean arg0) {
        if (arg0) {
            if (Statics.field2097.startsWith("win")) {
                this.field2434 = 1;
            } else if (Statics.field2097.startsWith("mac")) {
                this.field2434 = 2;
            } else if (Statics.field2097.startsWith("linux")) {
                this.field2434 = 3;
            } else {
                this.field2434 = 4;
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
                this.field2435 = true;
            } else {
                this.field2435 = false;
            }
            if (this.field2434 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2437 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2437 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2437 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2437 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2437 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2437 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2437 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2437 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2437 = 9;
                }
            } else if (this.field2434 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2437 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2437 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2437 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2437 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2439 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2439 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2439 = 4;
            } else {
                this.field2439 = 3;
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
            this.field2432 = var10;
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
            this.field2461 = var18;
            this.field2458 = false;
            this.field2444 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2432 > 3) {
                this.field2446 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2446 = 0;
            }
            this.field2440 = 0;
        }
        if (this.field2449 == null) {
            this.field2449 = "";
        }
        if (this.field2450 == null) {
            this.field2450 = "";
        }
        if (this.field2451 == null) {
            this.field2451 = "";
        }
        if (this.field2431 == null) {
            this.field2431 = "";
        }
        if (this.field2457 == null) {
            this.field2457 = "";
        }
        if (this.field2447 == null) {
            this.field2447 = "";
        }
        this.method2710();
    }

    @ObfuscatedName("eu.e(I)V")
    public void method2710() {
        if (this.field2449.length() > 40) {
            this.field2449 = this.field2449.substring(0, 40);
        }
        if (this.field2450.length() > 40) {
            this.field2450 = this.field2450.substring(0, 40);
        }
        if (this.field2451.length() > 10) {
            this.field2451 = this.field2451.substring(0, 10);
        }
        if (this.field2431.length() > 10) {
            this.field2431 = this.field2431.substring(0, 10);
        }
    }

    @ObfuscatedName("eu.v(Ldd;I)V")
    public void method2709(class108 arg0) {
        arg0.method2123(6);
        arg0.method2123(this.field2434);
        arg0.method2123(this.field2435 ? 1 : 0);
        arg0.method2123(this.field2437);
        arg0.method2123(this.field2439);
        arg0.method2123(this.field2432);
        arg0.method2123(this.field2465);
        arg0.method2123(this.field2461);
        arg0.method2123(this.field2458 ? 1 : 0);
        arg0.method2109(this.field2444);
        arg0.method2123(this.field2446);
        arg0.method2110(this.field2440);
        arg0.method2109(this.field2460);
        arg0.method2114(this.field2449);
        arg0.method2114(this.field2450);
        arg0.method2114(this.field2451);
        arg0.method2114(this.field2431);
        arg0.method2123(this.field2454);
        arg0.method2109(this.field2453);
        arg0.method2114(this.field2457);
        arg0.method2114(this.field2447);
        arg0.method2123(this.field2455);
        arg0.method2123(this.field2456);
        for (int var2 = 0; var2 < this.field2459.length; var2++) {
            arg0.method2134(this.field2459[var2]);
        }
        arg0.method2134(this.field2441);
    }

    @ObfuscatedName("eu.k(I)I")
    public int method2712() {
        byte var1 = 38;
        int var2 = var1 + class108.method91(this.field2449);
        int var3 = var2 + class108.method91(this.field2450);
        int var4 = var3 + class108.method91(this.field2451);
        int var5 = var4 + class108.method91(this.field2431);
        int var6 = var5 + class108.method91(this.field2457);
        return var6 + class108.method91(this.field2447);
    }
}
