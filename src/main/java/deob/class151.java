package deob;

@ObfuscatedName("eh")
public class class151 extends class199 {

    @ObfuscatedName("eh.t")
    public int field2510;

    @ObfuscatedName("eh.s")
    public boolean field2511;

    @ObfuscatedName("eh.b")
    public int field2517;

    @ObfuscatedName("eh.aq")
    public int field2505;

    @ObfuscatedName("eh.ak")
    public int field2520;

    @ObfuscatedName("eh.ar")
    public int field2522;

    @ObfuscatedName("eh.al")
    public int field2528;

    @ObfuscatedName("eh.au")
    public boolean field2523;

    @ObfuscatedName("eh.ao")
    public int field2524;

    @ObfuscatedName("eh.ai")
    public int field2525;

    @ObfuscatedName("eh.aw")
    public int field2526;

    @ObfuscatedName("eh.ab")
    public int field2508;

    @ObfuscatedName("eh.ad")
    public String field2519;

    @ObfuscatedName("eh.ae")
    public String field2529;

    @ObfuscatedName("eh.ay")
    public String field2530;

    @ObfuscatedName("eh.ap")
    public String field2531;

    @ObfuscatedName("eh.av")
    public int field2536;

    @ObfuscatedName("eh.ah")
    public int field2533;

    @ObfuscatedName("eh.at")
    public int field2534;

    @ObfuscatedName("eh.an")
    public int field2535;

    @ObfuscatedName("eh.ac")
    public String field2532;

    @ObfuscatedName("eh.as")
    public String field2515;

    @ObfuscatedName("eh.ax")
    public int[] field2538 = new int[3];

    @ObfuscatedName("eh.bg")
    public int field2539;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field2138.startsWith("win")) {
                this.field2510 = 1;
            } else if (Statics.field2138.startsWith("mac")) {
                this.field2510 = 2;
            } else if (Statics.field2138.startsWith("linux")) {
                this.field2510 = 3;
            } else {
                this.field2510 = 4;
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
                this.field2511 = true;
            } else {
                this.field2511 = false;
            }
            if (this.field2510 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2517 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2517 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2517 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2517 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2517 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2517 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2517 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2517 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2517 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2517 = 10;
                }
            } else if (this.field2510 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2517 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2517 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2517 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2517 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2517 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2517 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2517 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2505 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2505 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2505 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2505 = 4;
            } else {
                this.field2505 = 5;
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
            this.field2520 = var10;
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
            this.field2522 = var14;
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
            this.field2528 = var18;
            this.field2523 = false;
            this.field2524 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2520 > 3) {
                this.field2525 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2525 = 0;
            }
            this.field2526 = 0;
        }
        if (this.field2519 == null) {
            this.field2519 = "";
        }
        if (this.field2529 == null) {
            this.field2529 = "";
        }
        if (this.field2530 == null) {
            this.field2530 = "";
        }
        if (this.field2531 == null) {
            this.field2531 = "";
        }
        if (this.field2532 == null) {
            this.field2532 = "";
        }
        if (this.field2515 == null) {
            this.field2515 = "";
        }
        this.method2815();
    }

    @ObfuscatedName("eh.p(I)V")
    public void method2815() {
        if (this.field2519.length() > 40) {
            this.field2519 = this.field2519.substring(0, 40);
        }
        if (this.field2529.length() > 40) {
            this.field2529 = this.field2529.substring(0, 40);
        }
        if (this.field2530.length() > 10) {
            this.field2530 = this.field2530.substring(0, 10);
        }
        if (this.field2531.length() > 10) {
            this.field2531 = this.field2531.substring(0, 10);
        }
    }

    @ObfuscatedName("eh.k(Lde;I)V")
    public void method2801(class111 arg0) {
        arg0.method2160(6);
        arg0.method2160(this.field2510);
        arg0.method2160(this.field2511 ? 1 : 0);
        arg0.method2160(this.field2517);
        arg0.method2160(this.field2505);
        arg0.method2160(this.field2520);
        arg0.method2160(this.field2522);
        arg0.method2160(this.field2528);
        arg0.method2160(this.field2523 ? 1 : 0);
        arg0.method2365(this.field2524);
        arg0.method2160(this.field2525);
        arg0.method2260(this.field2526);
        arg0.method2365(this.field2508);
        arg0.method2255(this.field2519);
        arg0.method2255(this.field2529);
        arg0.method2255(this.field2530);
        arg0.method2255(this.field2531);
        arg0.method2160(this.field2533);
        arg0.method2365(this.field2536);
        arg0.method2255(this.field2532);
        arg0.method2255(this.field2515);
        arg0.method2160(this.field2534);
        arg0.method2160(this.field2535);
        for (int var2 = 0; var2 < this.field2538.length; var2++) {
            arg0.method2161(this.field2538[var2]);
        }
        arg0.method2161(this.field2539);
    }

    @ObfuscatedName("eh.e(I)I")
    public int method2813() {
        byte var1 = 38;
        int var2 = var1 + class111.method1100(this.field2519);
        int var3 = var2 + class111.method1100(this.field2529);
        int var4 = var3 + class111.method1100(this.field2530);
        int var5 = var4 + class111.method1100(this.field2531);
        int var6 = var5 + class111.method1100(this.field2532);
        return var6 + class111.method1100(this.field2515);
    }
}
