package deob;

@ObfuscatedName("ec")
public class class146 extends class187 {

    @ObfuscatedName("ec.s")
    public int field2445;

    @ObfuscatedName("ec.r")
    public boolean field2419;

    @ObfuscatedName("ec.j")
    public int field2422;

    @ObfuscatedName("ec.k")
    public int field2427;

    @ObfuscatedName("ec.an")
    public int field2424;

    @ObfuscatedName("ec.aw")
    public int field2425;

    @ObfuscatedName("ec.at")
    public int field2426;

    @ObfuscatedName("ec.al")
    public boolean field2434;

    @ObfuscatedName("ec.as")
    public int field2428;

    @ObfuscatedName("ec.aa")
    public int field2429;

    @ObfuscatedName("ec.af")
    public int field2414;

    @ObfuscatedName("ec.aj")
    public int field2431;

    @ObfuscatedName("ec.az")
    public String field2432;

    @ObfuscatedName("ec.ae")
    public String field2433;

    @ObfuscatedName("ec.av")
    public String field2439;

    @ObfuscatedName("ec.ax")
    public String field2435;

    @ObfuscatedName("ec.ai")
    public int field2436;

    @ObfuscatedName("ec.aq")
    public int field2430;

    @ObfuscatedName("ec.ad")
    public int field2438;

    @ObfuscatedName("ec.au")
    public int field2446;

    @ObfuscatedName("ec.ag")
    public String field2423;

    @ObfuscatedName("ec.ar")
    public String field2441;

    @ObfuscatedName("ec.am")
    public int[] field2442 = new int[3];

    @ObfuscatedName("ec.ab")
    public int field2440;

    public class146(boolean arg0) {
        if (arg0) {
            if (Statics.field2029.startsWith("win")) {
                this.field2445 = 1;
            } else if (Statics.field2029.startsWith("mac")) {
                this.field2445 = 2;
            } else if (Statics.field2029.startsWith("linux")) {
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
                this.field2419 = true;
            } else {
                this.field2419 = false;
            }
            if (this.field2445 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2422 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2422 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2422 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2422 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2422 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2422 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2422 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2422 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2422 = 9;
                }
            } else if (this.field2445 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2422 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2422 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2422 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2422 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2427 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2427 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2427 = 4;
            } else {
                this.field2427 = 3;
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
            this.field2424 = var10;
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
            this.field2425 = var14;
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
            this.field2426 = var18;
            this.field2434 = false;
            this.field2428 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2424 > 3) {
                this.field2429 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2429 = 0;
            }
            this.field2414 = 0;
        }
        if (this.field2432 == null) {
            this.field2432 = "";
        }
        if (this.field2433 == null) {
            this.field2433 = "";
        }
        if (this.field2439 == null) {
            this.field2439 = "";
        }
        if (this.field2435 == null) {
            this.field2435 = "";
        }
        if (this.field2423 == null) {
            this.field2423 = "";
        }
        if (this.field2441 == null) {
            this.field2441 = "";
        }
        this.method2772();
    }

    @ObfuscatedName("ec.p(I)V")
    public void method2772() {
        if (this.field2432.length() > 40) {
            this.field2432 = this.field2432.substring(0, 40);
        }
        if (this.field2433.length() > 40) {
            this.field2433 = this.field2433.substring(0, 40);
        }
        if (this.field2439.length() > 10) {
            this.field2439 = this.field2439.substring(0, 10);
        }
        if (this.field2435.length() > 10) {
            this.field2435 = this.field2435.substring(0, 10);
        }
    }

    @ObfuscatedName("ec.g(Ldp;I)V")
    public void method2773(class107 arg0) {
        arg0.method2159(6);
        arg0.method2159(this.field2445);
        arg0.method2159(this.field2419 ? 1 : 0);
        arg0.method2159(this.field2422);
        arg0.method2159(this.field2427);
        arg0.method2159(this.field2424);
        arg0.method2159(this.field2425);
        arg0.method2159(this.field2426);
        arg0.method2159(this.field2434 ? 1 : 0);
        arg0.method2364(this.field2428);
        arg0.method2159(this.field2429);
        arg0.method2161(this.field2414);
        arg0.method2364(this.field2431);
        arg0.method2165(this.field2432);
        arg0.method2165(this.field2433);
        arg0.method2165(this.field2439);
        arg0.method2165(this.field2435);
        arg0.method2159(this.field2430);
        arg0.method2364(this.field2436);
        arg0.method2165(this.field2423);
        arg0.method2165(this.field2441);
        arg0.method2159(this.field2438);
        arg0.method2159(this.field2446);
        for (int var2 = 0; var2 < this.field2442.length; var2++) {
            arg0.method2162(this.field2442[var2]);
        }
        arg0.method2162(this.field2440);
    }

    @ObfuscatedName("ec.x(I)I")
    public int method2774() {
        byte var1 = 38;
        int var2 = var1 + class107.method1464(this.field2432);
        int var3 = var2 + class107.method1464(this.field2433);
        int var4 = var3 + class107.method1464(this.field2439);
        int var5 = var4 + class107.method1464(this.field2435);
        int var6 = var5 + class107.method1464(this.field2423);
        return var6 + class107.method1464(this.field2441);
    }
}
