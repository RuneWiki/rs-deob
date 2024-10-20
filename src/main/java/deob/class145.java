package deob;

@ObfuscatedName("ew")
public class class145 extends class186 {

    @ObfuscatedName("ew.b")
    public int field2409;

    @ObfuscatedName("ew.q")
    public boolean field2423;

    @ObfuscatedName("ew.o")
    public int field2412;

    @ObfuscatedName("ew.z")
    public int field2415;

    @ObfuscatedName("ew.av")
    public int field2410;

    @ObfuscatedName("ew.ao")
    public int field2430;

    @ObfuscatedName("ew.am")
    public int field2418;

    @ObfuscatedName("ew.ac")
    public boolean field2419;

    @ObfuscatedName("ew.ak")
    public int field2420;

    @ObfuscatedName("ew.ap")
    public int field2422;

    @ObfuscatedName("ew.an")
    public int field2413;

    @ObfuscatedName("ew.ay")
    public int field2424;

    @ObfuscatedName("ew.af")
    public String field2417;

    @ObfuscatedName("ew.aq")
    public String field2426;

    @ObfuscatedName("ew.aj")
    public String field2416;

    @ObfuscatedName("ew.at")
    public String field2425;

    @ObfuscatedName("ew.aw")
    public int field2405;

    @ObfuscatedName("ew.ar")
    public int field2429;

    @ObfuscatedName("ew.az")
    public int field2431;

    @ObfuscatedName("ew.au")
    public int field2432;

    @ObfuscatedName("ew.ai")
    public String field2433;

    @ObfuscatedName("ew.ad")
    public String field2434;

    @ObfuscatedName("ew.al")
    public int[] field2435 = new int[3];

    @ObfuscatedName("ew.ae")
    public int field2436;

    public class145(boolean arg0) {
        if (arg0) {
            if (Statics.field244.startsWith("win")) {
                this.field2409 = 1;
            } else if (Statics.field244.startsWith("mac")) {
                this.field2409 = 2;
            } else if (Statics.field244.startsWith("linux")) {
                this.field2409 = 3;
            } else {
                this.field2409 = 4;
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
                this.field2423 = true;
            } else {
                this.field2423 = false;
            }
            if (this.field2409 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2412 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2412 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2412 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2412 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2412 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2412 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2412 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2412 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2412 = 9;
                }
            } else if (this.field2409 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2412 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2412 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2412 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2412 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2415 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2415 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2415 = 4;
            } else {
                this.field2415 = 3;
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
            this.field2410 = var10;
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
            this.field2430 = var14;
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
            this.field2418 = var18;
            this.field2419 = false;
            this.field2420 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2410 > 3) {
                this.field2422 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2422 = 0;
            }
            this.field2413 = 0;
        }
        if (this.field2417 == null) {
            this.field2417 = "";
        }
        if (this.field2426 == null) {
            this.field2426 = "";
        }
        if (this.field2416 == null) {
            this.field2416 = "";
        }
        if (this.field2425 == null) {
            this.field2425 = "";
        }
        if (this.field2433 == null) {
            this.field2433 = "";
        }
        if (this.field2434 == null) {
            this.field2434 = "";
        }
        this.method2677();
    }

    @ObfuscatedName("ew.e(I)V")
    public void method2677() {
        if (this.field2417.length() > 40) {
            this.field2417 = this.field2417.substring(0, 40);
        }
        if (this.field2426.length() > 40) {
            this.field2426 = this.field2426.substring(0, 40);
        }
        if (this.field2416.length() > 10) {
            this.field2416 = this.field2416.substring(0, 10);
        }
        if (this.field2425.length() > 10) {
            this.field2425 = this.field2425.substring(0, 10);
        }
    }

    @ObfuscatedName("ew.v(Ldk;I)V")
    public void method2678(class107 arg0) {
        arg0.method2102(6);
        arg0.method2102(this.field2409);
        arg0.method2102(this.field2423 ? 1 : 0);
        arg0.method2102(this.field2412);
        arg0.method2102(this.field2415);
        arg0.method2102(this.field2410);
        arg0.method2102(this.field2430);
        arg0.method2102(this.field2418);
        arg0.method2102(this.field2419 ? 1 : 0);
        arg0.method2223(this.field2420);
        arg0.method2102(this.field2422);
        arg0.method2217(this.field2413);
        arg0.method2223(this.field2424);
        arg0.method2108(this.field2417);
        arg0.method2108(this.field2426);
        arg0.method2108(this.field2416);
        arg0.method2108(this.field2425);
        arg0.method2102(this.field2429);
        arg0.method2223(this.field2405);
        arg0.method2108(this.field2433);
        arg0.method2108(this.field2434);
        arg0.method2102(this.field2431);
        arg0.method2102(this.field2432);
        for (int var2 = 0; var2 < this.field2435.length; var2++) {
            arg0.method2137(this.field2435[var2]);
        }
        arg0.method2137(this.field2436);
    }

    @ObfuscatedName("ew.i(B)I")
    public int method2679() {
        byte var1 = 38;
        int var2 = var1 + class107.method2058(this.field2417);
        int var3 = var2 + class107.method2058(this.field2426);
        int var4 = var3 + class107.method2058(this.field2416);
        int var5 = var4 + class107.method2058(this.field2425);
        int var6 = var5 + class107.method2058(this.field2433);
        return var6 + class107.method2058(this.field2434);
    }
}
