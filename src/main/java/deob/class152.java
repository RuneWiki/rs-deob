package deob;

@ObfuscatedName("eq")
public class class152 extends class179 {

    @ObfuscatedName("eq.j")
    public int field2476;

    @ObfuscatedName("eq.l")
    public boolean field2481;

    @ObfuscatedName("eq.o")
    public int field2486;

    @ObfuscatedName("eq.c")
    public int field2496;

    @ObfuscatedName("eq.aw")
    public int field2488;

    @ObfuscatedName("eq.ap")
    public int field2489;

    @ObfuscatedName("eq.am")
    public int field2490;

    @ObfuscatedName("eq.az")
    public boolean field2492;

    @ObfuscatedName("eq.ax")
    public int field2479;

    @ObfuscatedName("eq.aa")
    public int field2493;

    @ObfuscatedName("eq.aj")
    public int field2494;

    @ObfuscatedName("eq.aq")
    public int field2495;

    @ObfuscatedName("eq.ah")
    public String field2483;

    @ObfuscatedName("eq.ae")
    public String field2480;

    @ObfuscatedName("eq.ar")
    public String field2484;

    @ObfuscatedName("eq.ab")
    public String field2499;

    @ObfuscatedName("eq.ay")
    public int field2478;

    @ObfuscatedName("eq.ac")
    public int field2501;

    @ObfuscatedName("eq.ad")
    public int field2502;

    @ObfuscatedName("eq.al")
    public int field2503;

    @ObfuscatedName("eq.an")
    public String field2504;

    @ObfuscatedName("eq.at")
    public String field2491;

    @ObfuscatedName("eq.ak")
    public int[] field2506 = new int[3];

    @ObfuscatedName("eq.as")
    public int field2507;

    public class152(boolean arg0) {
        if (arg0) {
            if (Statics.field1678.startsWith("win")) {
                this.field2476 = 1;
            } else if (Statics.field1678.startsWith("mac")) {
                this.field2476 = 2;
            } else if (Statics.field1678.startsWith("linux")) {
                this.field2476 = 3;
            } else {
                this.field2476 = 4;
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
                this.field2481 = true;
            } else {
                this.field2481 = false;
            }
            if (this.field2476 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2486 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2486 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2486 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2486 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2486 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2486 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2486 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2486 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2486 = 9;
                }
            } else if (this.field2476 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2486 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2486 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2486 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2486 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2496 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2496 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2496 = 4;
            } else {
                this.field2496 = 3;
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
            this.field2488 = var10;
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
            this.field2489 = var14;
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
            this.field2490 = var18;
            this.field2492 = false;
            this.field2479 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2488 > 3) {
                this.field2493 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2493 = 0;
            }
            this.field2494 = 0;
        }
        if (this.field2483 == null) {
            this.field2483 = "";
        }
        if (this.field2480 == null) {
            this.field2480 = "";
        }
        if (this.field2484 == null) {
            this.field2484 = "";
        }
        if (this.field2499 == null) {
            this.field2499 = "";
        }
        if (this.field2504 == null) {
            this.field2504 = "";
        }
        if (this.field2491 == null) {
            this.field2491 = "";
        }
        this.method3035();
    }

    @ObfuscatedName("eq.p(I)V")
    public void method3035() {
        if (this.field2483.length() > 40) {
            this.field2483 = this.field2483.substring(0, 40);
        }
        if (this.field2480.length() > 40) {
            this.field2480 = this.field2480.substring(0, 40);
        }
        if (this.field2484.length() > 10) {
            this.field2484 = this.field2484.substring(0, 10);
        }
        if (this.field2499.length() > 10) {
            this.field2499 = this.field2499.substring(0, 10);
        }
    }

    @ObfuscatedName("eq.e(Ldj;B)V")
    public void method3044(class127 arg0) {
        arg0.method2657(6);
        arg0.method2657(this.field2476);
        arg0.method2657(this.field2481 ? 1 : 0);
        arg0.method2657(this.field2486);
        arg0.method2657(this.field2496);
        arg0.method2657(this.field2488);
        arg0.method2657(this.field2489);
        arg0.method2657(this.field2490);
        arg0.method2657(this.field2492 ? 1 : 0);
        arg0.method2481(this.field2479);
        arg0.method2657(this.field2493);
        arg0.method2482(this.field2494);
        arg0.method2481(this.field2495);
        arg0.method2541(this.field2483);
        arg0.method2541(this.field2480);
        arg0.method2541(this.field2484);
        arg0.method2541(this.field2499);
        arg0.method2657(this.field2501);
        arg0.method2481(this.field2478);
        arg0.method2541(this.field2504);
        arg0.method2541(this.field2491);
        arg0.method2657(this.field2502);
        arg0.method2657(this.field2503);
        for (int var2 = 0; var2 < this.field2506.length; var2++) {
            arg0.method2483(this.field2506[var2]);
        }
        arg0.method2483(this.field2507);
    }

    @ObfuscatedName("eq.a(I)I")
    public int method3034() {
        byte var1 = 38;
        int var2 = var1 + class127.method1883(this.field2483);
        int var3 = var2 + class127.method1883(this.field2480);
        int var4 = var3 + class127.method1883(this.field2484);
        int var5 = var4 + class127.method1883(this.field2499);
        int var6 = var5 + class127.method1883(this.field2504);
        return var6 + class127.method1883(this.field2491);
    }
}
