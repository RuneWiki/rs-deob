package deob;

@ObfuscatedName("ex")
public class class144 extends class183 {

    @ObfuscatedName("ex.g")
    public int field2396;

    @ObfuscatedName("ex.a")
    public boolean field2397;

    @ObfuscatedName("ex.i")
    public int field2401;

    @ObfuscatedName("ex.e")
    public int field2398;

    @ObfuscatedName("ex.av")
    public int field2405;

    @ObfuscatedName("ex.al")
    public int field2414;

    @ObfuscatedName("ex.aq")
    public int field2407;

    @ObfuscatedName("ex.aa")
    public boolean field2408;

    @ObfuscatedName("ex.ah")
    public int field2406;

    @ObfuscatedName("ex.ai")
    public int field2410;

    @ObfuscatedName("ex.ag")
    public int field2411;

    @ObfuscatedName("ex.ax")
    public int field2412;

    @ObfuscatedName("ex.af")
    public String field2413;

    @ObfuscatedName("ex.ao")
    public String field2421;

    @ObfuscatedName("ex.ac")
    public String field2415;

    @ObfuscatedName("ex.aj")
    public String field2404;

    @ObfuscatedName("ex.ap")
    public int field2417;

    @ObfuscatedName("ex.ae")
    public int field2418;

    @ObfuscatedName("ex.at")
    public int field2419;

    @ObfuscatedName("ex.as")
    public int field2392;

    @ObfuscatedName("ex.aw")
    public String field2420;

    @ObfuscatedName("ex.ak")
    public String field2422;

    @ObfuscatedName("ex.az")
    public int[] field2423 = new int[3];

    @ObfuscatedName("ex.ay")
    public int field2424;

    public class144(boolean arg0) {
        if (arg0) {
            if (Statics.field2884.startsWith("win")) {
                this.field2396 = 1;
            } else if (Statics.field2884.startsWith("mac")) {
                this.field2396 = 2;
            } else if (Statics.field2884.startsWith("linux")) {
                this.field2396 = 3;
            } else {
                this.field2396 = 4;
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
                this.field2397 = true;
            } else {
                this.field2397 = false;
            }
            if (this.field2396 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2401 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2401 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2401 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2401 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2401 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2401 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2401 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2401 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2401 = 9;
                }
            } else if (this.field2396 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2401 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2401 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2401 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2401 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2398 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2398 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2398 = 4;
            } else {
                this.field2398 = 3;
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
            this.field2405 = var10;
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
            this.field2414 = var14;
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
            this.field2407 = var18;
            this.field2408 = false;
            this.field2406 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2405 > 3) {
                this.field2410 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2410 = 0;
            }
            this.field2411 = 0;
        }
        if (this.field2413 == null) {
            this.field2413 = "";
        }
        if (this.field2421 == null) {
            this.field2421 = "";
        }
        if (this.field2415 == null) {
            this.field2415 = "";
        }
        if (this.field2404 == null) {
            this.field2404 = "";
        }
        if (this.field2420 == null) {
            this.field2420 = "";
        }
        if (this.field2422 == null) {
            this.field2422 = "";
        }
        this.method2696();
    }

    @ObfuscatedName("ex.y(B)V")
    public void method2696() {
        if (this.field2413.length() > 40) {
            this.field2413 = this.field2413.substring(0, 40);
        }
        if (this.field2421.length() > 40) {
            this.field2421 = this.field2421.substring(0, 40);
        }
        if (this.field2415.length() > 10) {
            this.field2415 = this.field2415.substring(0, 10);
        }
        if (this.field2404.length() > 10) {
            this.field2404 = this.field2404.substring(0, 10);
        }
    }

    @ObfuscatedName("ex.u(Ldo;I)V")
    public void method2693(class107 arg0) {
        arg0.method2278(6);
        arg0.method2278(this.field2396);
        arg0.method2278(this.field2397 ? 1 : 0);
        arg0.method2278(this.field2401);
        arg0.method2278(this.field2398);
        arg0.method2278(this.field2405);
        arg0.method2278(this.field2414);
        arg0.method2278(this.field2407);
        arg0.method2278(this.field2408 ? 1 : 0);
        arg0.method2096(this.field2406);
        arg0.method2278(this.field2410);
        arg0.method2097(this.field2411);
        arg0.method2096(this.field2412);
        arg0.method2101(this.field2413);
        arg0.method2101(this.field2421);
        arg0.method2101(this.field2415);
        arg0.method2101(this.field2404);
        arg0.method2278(this.field2418);
        arg0.method2096(this.field2417);
        arg0.method2101(this.field2420);
        arg0.method2101(this.field2422);
        arg0.method2278(this.field2419);
        arg0.method2278(this.field2392);
        for (int var2 = 0; var2 < this.field2423.length; var2++) {
            arg0.method2232(this.field2423[var2]);
        }
        arg0.method2232(this.field2424);
    }

    @ObfuscatedName("ex.k(B)I")
    public int method2691() {
        byte var1 = 38;
        int var2 = var1 + class107.method128(this.field2413);
        int var3 = var2 + class107.method128(this.field2421);
        int var4 = var3 + class107.method128(this.field2415);
        int var5 = var4 + class107.method128(this.field2404);
        int var6 = var5 + class107.method128(this.field2420);
        return var6 + class107.method128(this.field2422);
    }
}
