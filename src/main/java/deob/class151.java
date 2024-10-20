package deob;

@ObfuscatedName("eu")
public class class151 extends class199 {

    @ObfuscatedName("eu.h")
    public int field2514;

    @ObfuscatedName("eu.i")
    public boolean field2509;

    @ObfuscatedName("eu.c")
    public int field2515;

    @ObfuscatedName("eu.ao")
    public int field2516;

    @ObfuscatedName("eu.aj")
    public int field2525;

    @ObfuscatedName("eu.ax")
    public int field2511;

    @ObfuscatedName("eu.ac")
    public int field2533;

    @ObfuscatedName("eu.al")
    public boolean field2504;

    @ObfuscatedName("eu.au")
    public int field2521;

    @ObfuscatedName("eu.ar")
    public int field2536;

    @ObfuscatedName("eu.ae")
    public int field2523;

    @ObfuscatedName("eu.ay")
    public int field2524;

    @ObfuscatedName("eu.ab")
    public String field2534;

    @ObfuscatedName("eu.at")
    public String field2517;

    @ObfuscatedName("eu.as")
    public String field2527;

    @ObfuscatedName("eu.af")
    public String field2528;

    @ObfuscatedName("eu.aa")
    public int field2520;

    @ObfuscatedName("eu.ad")
    public int field2530;

    @ObfuscatedName("eu.ai")
    public int field2531;

    @ObfuscatedName("eu.aw")
    public int field2532;

    @ObfuscatedName("eu.ak")
    public String field2518;

    @ObfuscatedName("eu.az")
    public String field2529;

    @ObfuscatedName("eu.am")
    public int[] field2535 = new int[3];

    @ObfuscatedName("eu.bj")
    public int field2508;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field2843.startsWith("win")) {
                this.field2514 = 1;
            } else if (Statics.field2843.startsWith("mac")) {
                this.field2514 = 2;
            } else if (Statics.field2843.startsWith("linux")) {
                this.field2514 = 3;
            } else {
                this.field2514 = 4;
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
                this.field2509 = true;
            } else {
                this.field2509 = false;
            }
            if (this.field2514 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2515 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2515 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2515 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2515 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2515 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2515 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2515 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2515 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2515 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2515 = 10;
                }
            } else if (this.field2514 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2515 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2515 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2515 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2515 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2515 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2515 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2515 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2516 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2516 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2516 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2516 = 4;
            } else {
                this.field2516 = 5;
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
            this.field2525 = var10;
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
            this.field2511 = var14;
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
            this.field2533 = var18;
            this.field2504 = false;
            this.field2521 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2525 > 3) {
                this.field2536 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2536 = 0;
            }
            this.field2523 = 0;
        }
        if (this.field2534 == null) {
            this.field2534 = "";
        }
        if (this.field2517 == null) {
            this.field2517 = "";
        }
        if (this.field2527 == null) {
            this.field2527 = "";
        }
        if (this.field2528 == null) {
            this.field2528 = "";
        }
        if (this.field2518 == null) {
            this.field2518 = "";
        }
        if (this.field2529 == null) {
            this.field2529 = "";
        }
        this.method2842();
    }

    @ObfuscatedName("eu.n(I)V")
    public void method2842() {
        if (this.field2534.length() > 40) {
            this.field2534 = this.field2534.substring(0, 40);
        }
        if (this.field2517.length() > 40) {
            this.field2517 = this.field2517.substring(0, 40);
        }
        if (this.field2527.length() > 10) {
            this.field2527 = this.field2527.substring(0, 10);
        }
        if (this.field2528.length() > 10) {
            this.field2528 = this.field2528.substring(0, 10);
        }
    }

    @ObfuscatedName("eu.o(Ldl;I)V")
    public void method2849(class111 arg0) {
        arg0.method2219(6);
        arg0.method2219(this.field2514);
        arg0.method2219(this.field2509 ? 1 : 0);
        arg0.method2219(this.field2515);
        arg0.method2219(this.field2516);
        arg0.method2219(this.field2525);
        arg0.method2219(this.field2511);
        arg0.method2219(this.field2533);
        arg0.method2219(this.field2504 ? 1 : 0);
        arg0.method2220(this.field2521);
        arg0.method2219(this.field2536);
        arg0.method2221(this.field2523);
        arg0.method2220(this.field2524);
        arg0.method2226(this.field2534);
        arg0.method2226(this.field2517);
        arg0.method2226(this.field2527);
        arg0.method2226(this.field2528);
        arg0.method2219(this.field2530);
        arg0.method2220(this.field2520);
        arg0.method2226(this.field2518);
        arg0.method2226(this.field2529);
        arg0.method2219(this.field2531);
        arg0.method2219(this.field2532);
        for (int var2 = 0; var2 < this.field2535.length; var2++) {
            arg0.method2222(this.field2535[var2]);
        }
        arg0.method2222(this.field2508);
    }

    @ObfuscatedName("eu.a(I)I")
    public int method2845() {
        byte var1 = 38;
        String var3 = this.field2534;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2517;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2527;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2528;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2518;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2529;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
