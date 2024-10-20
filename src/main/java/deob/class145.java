package deob;

@ObfuscatedName("ex")
public class class145 extends class184 {

    @ObfuscatedName("ex.n")
    public int field2413;

    @ObfuscatedName("ex.y")
    public boolean field2411;

    @ObfuscatedName("ex.w")
    public int field2428;

    @ObfuscatedName("ex.d")
    public int field2422;

    @ObfuscatedName("ex.al")
    public int field2432;

    @ObfuscatedName("ex.ab")
    public int field2424;

    @ObfuscatedName("ex.au")
    public int field2444;

    @ObfuscatedName("ex.az")
    public boolean field2426;

    @ObfuscatedName("ex.ai")
    public int field2427;

    @ObfuscatedName("ex.ar")
    public int field2418;

    @ObfuscatedName("ex.as")
    public int field2429;

    @ObfuscatedName("ex.ap")
    public int field2434;

    @ObfuscatedName("ex.aj")
    public String field2431;

    @ObfuscatedName("ex.ac")
    public String field2414;

    @ObfuscatedName("ex.aa")
    public String field2433;

    @ObfuscatedName("ex.ag")
    public String field2430;

    @ObfuscatedName("ex.ae")
    public int field2423;

    @ObfuscatedName("ex.ak")
    public int field2436;

    @ObfuscatedName("ex.aw")
    public int field2437;

    @ObfuscatedName("ex.ao")
    public int field2438;

    @ObfuscatedName("ex.aq")
    public String field2439;

    @ObfuscatedName("ex.av")
    public String field2440;

    @ObfuscatedName("ex.am")
    public int[] field2441 = new int[3];

    @ObfuscatedName("ex.at")
    public int field2442;

    public class145(boolean arg0) {
        if (arg0) {
            if (Statics.field2092.startsWith("win")) {
                this.field2413 = 1;
            } else if (Statics.field2092.startsWith("mac")) {
                this.field2413 = 2;
            } else if (Statics.field2092.startsWith("linux")) {
                this.field2413 = 3;
            } else {
                this.field2413 = 4;
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
                this.field2411 = true;
            } else {
                this.field2411 = false;
            }
            if (this.field2413 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2428 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2428 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2428 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2428 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2428 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2428 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2428 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2428 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2428 = 9;
                }
            } else if (this.field2413 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2428 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2428 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2428 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2428 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2422 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2422 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2422 = 4;
            } else {
                this.field2422 = 3;
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
            this.field2424 = var14;
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
            this.field2444 = var18;
            this.field2426 = false;
            this.field2427 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2432 > 3) {
                this.field2418 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2418 = 0;
            }
            this.field2429 = 0;
        }
        if (this.field2431 == null) {
            this.field2431 = "";
        }
        if (this.field2414 == null) {
            this.field2414 = "";
        }
        if (this.field2433 == null) {
            this.field2433 = "";
        }
        if (this.field2430 == null) {
            this.field2430 = "";
        }
        if (this.field2439 == null) {
            this.field2439 = "";
        }
        if (this.field2440 == null) {
            this.field2440 = "";
        }
        this.method2684();
    }

    @ObfuscatedName("ex.b(I)V")
    public void method2684() {
        if (this.field2431.length() > 40) {
            this.field2431 = this.field2431.substring(0, 40);
        }
        if (this.field2414.length() > 40) {
            this.field2414 = this.field2414.substring(0, 40);
        }
        if (this.field2433.length() > 10) {
            this.field2433 = this.field2433.substring(0, 10);
        }
        if (this.field2430.length() > 10) {
            this.field2430 = this.field2430.substring(0, 10);
        }
    }

    @ObfuscatedName("ex.u(Ldh;I)V")
    public void method2686(class107 arg0) {
        arg0.method2242(6);
        arg0.method2242(this.field2413);
        arg0.method2242(this.field2411 ? 1 : 0);
        arg0.method2242(this.field2428);
        arg0.method2242(this.field2422);
        arg0.method2242(this.field2432);
        arg0.method2242(this.field2424);
        arg0.method2242(this.field2444);
        arg0.method2242(this.field2426 ? 1 : 0);
        arg0.method2277(this.field2427);
        arg0.method2242(this.field2418);
        arg0.method2123(this.field2429);
        arg0.method2277(this.field2434);
        arg0.method2343(this.field2431);
        arg0.method2343(this.field2414);
        arg0.method2343(this.field2433);
        arg0.method2343(this.field2430);
        arg0.method2242(this.field2436);
        arg0.method2277(this.field2423);
        arg0.method2343(this.field2439);
        arg0.method2343(this.field2440);
        arg0.method2242(this.field2437);
        arg0.method2242(this.field2438);
        for (int var2 = 0; var2 < this.field2441.length; var2++) {
            arg0.method2124(this.field2441[var2]);
        }
        arg0.method2124(this.field2442);
    }

    @ObfuscatedName("ex.x(I)I")
    public int method2687() {
        byte var1 = 38;
        int var2 = var1 + class107.method563(this.field2431);
        int var3 = var2 + class107.method563(this.field2414);
        int var4 = var3 + class107.method563(this.field2433);
        int var5 = var4 + class107.method563(this.field2430);
        int var6 = var5 + class107.method563(this.field2439);
        return var6 + class107.method563(this.field2440);
    }
}
