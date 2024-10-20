package deob;

@ObfuscatedName("ew")
public class class145 extends class184 {

    @ObfuscatedName("ew.b")
    public int field2404;

    @ObfuscatedName("ew.s")
    public boolean field2405;

    @ObfuscatedName("ew.e")
    public int field2413;

    @ObfuscatedName("ew.g")
    public int field2414;

    @ObfuscatedName("ew.aq")
    public int field2415;

    @ObfuscatedName("ew.ao")
    public int field2434;

    @ObfuscatedName("ew.af")
    public int field2400;

    @ObfuscatedName("ew.ag")
    public boolean field2418;

    @ObfuscatedName("ew.ad")
    public int field2416;

    @ObfuscatedName("ew.aj")
    public int field2435;

    @ObfuscatedName("ew.al")
    public int field2422;

    @ObfuscatedName("ew.ai")
    public int field2423;

    @ObfuscatedName("ew.az")
    public String field2401;

    @ObfuscatedName("ew.aw")
    public String field2425;

    @ObfuscatedName("ew.ay")
    public String field2426;

    @ObfuscatedName("ew.au")
    public String field2427;

    @ObfuscatedName("ew.ar")
    public int field2428;

    @ObfuscatedName("ew.ap")
    public int field2429;

    @ObfuscatedName("ew.an")
    public int field2430;

    @ObfuscatedName("ew.ae")
    public int field2431;

    @ObfuscatedName("ew.aa")
    public String field2408;

    @ObfuscatedName("ew.ax")
    public String field2437;

    @ObfuscatedName("ew.am")
    public int[] field2424 = new int[3];

    @ObfuscatedName("ew.ab")
    public int field2432;

    public class145(boolean arg0) {
        if (arg0) {
            if (Statics.field18.startsWith("win")) {
                this.field2404 = 1;
            } else if (Statics.field18.startsWith("mac")) {
                this.field2404 = 2;
            } else if (Statics.field18.startsWith("linux")) {
                this.field2404 = 3;
            } else {
                this.field2404 = 4;
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
                this.field2405 = true;
            } else {
                this.field2405 = false;
            }
            if (this.field2404 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2413 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2413 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2413 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2413 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2413 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2413 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2413 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2413 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2413 = 9;
                }
            } else if (this.field2404 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2413 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2413 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2413 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2413 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2414 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2414 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2414 = 4;
            } else {
                this.field2414 = 3;
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
            this.field2415 = var10;
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
            this.field2434 = var14;
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
            this.field2400 = var18;
            this.field2418 = false;
            this.field2416 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2415 > 3) {
                this.field2435 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2435 = 0;
            }
            this.field2422 = 0;
        }
        if (this.field2401 == null) {
            this.field2401 = "";
        }
        if (this.field2425 == null) {
            this.field2425 = "";
        }
        if (this.field2426 == null) {
            this.field2426 = "";
        }
        if (this.field2427 == null) {
            this.field2427 = "";
        }
        if (this.field2408 == null) {
            this.field2408 = "";
        }
        if (this.field2437 == null) {
            this.field2437 = "";
        }
        this.method2693();
    }

    @ObfuscatedName("ew.z(I)V")
    public void method2693() {
        if (this.field2401.length() > 40) {
            this.field2401 = this.field2401.substring(0, 40);
        }
        if (this.field2425.length() > 40) {
            this.field2425 = this.field2425.substring(0, 40);
        }
        if (this.field2426.length() > 10) {
            this.field2426 = this.field2426.substring(0, 10);
        }
        if (this.field2427.length() > 10) {
            this.field2427 = this.field2427.substring(0, 10);
        }
    }

    @ObfuscatedName("ew.j(Ldq;I)V")
    public void method2694(class107 arg0) {
        arg0.method2108(6);
        arg0.method2108(this.field2404);
        arg0.method2108(this.field2405 ? 1 : 0);
        arg0.method2108(this.field2413);
        arg0.method2108(this.field2414);
        arg0.method2108(this.field2415);
        arg0.method2108(this.field2434);
        arg0.method2108(this.field2400);
        arg0.method2108(this.field2418 ? 1 : 0);
        arg0.method2109(this.field2416);
        arg0.method2108(this.field2435);
        arg0.method2276(this.field2422);
        arg0.method2109(this.field2423);
        arg0.method2114(this.field2401);
        arg0.method2114(this.field2425);
        arg0.method2114(this.field2426);
        arg0.method2114(this.field2427);
        arg0.method2108(this.field2429);
        arg0.method2109(this.field2428);
        arg0.method2114(this.field2408);
        arg0.method2114(this.field2437);
        arg0.method2108(this.field2430);
        arg0.method2108(this.field2431);
        for (int var2 = 0; var2 < this.field2424.length; var2++) {
            arg0.method2111(this.field2424[var2]);
        }
        arg0.method2111(this.field2432);
    }

    @ObfuscatedName("ew.a(I)I")
    public int method2695() {
        byte var1 = 38;
        int var2 = var1 + class107.method387(this.field2401);
        int var3 = var2 + class107.method387(this.field2425);
        int var4 = var3 + class107.method387(this.field2426);
        int var5 = var4 + class107.method387(this.field2427);
        int var6 = var5 + class107.method387(this.field2408);
        return var6 + class107.method387(this.field2437);
    }
}
