package deob;

@ObfuscatedName("ej")
public class class145 extends class186 {

    @ObfuscatedName("ej.j")
    public int field2419;

    @ObfuscatedName("ej.g")
    public boolean field2430;

    @ObfuscatedName("ej.e")
    public int field2425;

    @ObfuscatedName("ej.z")
    public int field2424;

    @ObfuscatedName("ej.aa")
    public int field2423;

    @ObfuscatedName("ej.ak")
    public int field2440;

    @ObfuscatedName("ej.al")
    public int field2444;

    @ObfuscatedName("ej.aw")
    public boolean field2428;

    @ObfuscatedName("ej.ai")
    public int field2429;

    @ObfuscatedName("ej.an")
    public int field2431;

    @ObfuscatedName("ej.aj")
    public int field2432;

    @ObfuscatedName("ej.az")
    public int field2433;

    @ObfuscatedName("ej.ax")
    public String field2434;

    @ObfuscatedName("ej.ap")
    public String field2435;

    @ObfuscatedName("ej.ar")
    public String field2427;

    @ObfuscatedName("ej.am")
    public String field2414;

    @ObfuscatedName("ej.ae")
    public int field2438;

    @ObfuscatedName("ej.as")
    public int field2439;

    @ObfuscatedName("ej.ad")
    public int field2437;

    @ObfuscatedName("ej.af")
    public int field2441;

    @ObfuscatedName("ej.ab")
    public String field2442;

    @ObfuscatedName("ej.at")
    public String field2426;

    @ObfuscatedName("ej.ag")
    public int[] field2418 = new int[3];

    @ObfuscatedName("ej.ah")
    public int field2445;

    public class145(boolean arg0) {
        if (arg0) {
            if (Statics.field2090.startsWith("win")) {
                this.field2419 = 1;
            } else if (Statics.field2090.startsWith("mac")) {
                this.field2419 = 2;
            } else if (Statics.field2090.startsWith("linux")) {
                this.field2419 = 3;
            } else {
                this.field2419 = 4;
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
                this.field2430 = true;
            } else {
                this.field2430 = false;
            }
            if (this.field2419 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2425 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2425 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2425 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2425 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2425 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2425 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2425 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2425 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2425 = 9;
                }
            } else if (this.field2419 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2425 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2425 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2425 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2425 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2424 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2424 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2424 = 4;
            } else {
                this.field2424 = 3;
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
            this.field2423 = var10;
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
            this.field2440 = var14;
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
            this.field2428 = false;
            this.field2429 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2423 > 3) {
                this.field2431 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2431 = 0;
            }
            this.field2432 = 0;
        }
        if (this.field2434 == null) {
            this.field2434 = "";
        }
        if (this.field2435 == null) {
            this.field2435 = "";
        }
        if (this.field2427 == null) {
            this.field2427 = "";
        }
        if (this.field2414 == null) {
            this.field2414 = "";
        }
        if (this.field2442 == null) {
            this.field2442 = "";
        }
        if (this.field2426 == null) {
            this.field2426 = "";
        }
        this.method2675();
    }

    @ObfuscatedName("ej.k(I)V")
    public void method2675() {
        if (this.field2434.length() > 40) {
            this.field2434 = this.field2434.substring(0, 40);
        }
        if (this.field2435.length() > 40) {
            this.field2435 = this.field2435.substring(0, 40);
        }
        if (this.field2427.length() > 10) {
            this.field2427 = this.field2427.substring(0, 10);
        }
        if (this.field2414.length() > 10) {
            this.field2414 = this.field2414.substring(0, 10);
        }
    }

    @ObfuscatedName("ej.r(Lde;I)V")
    public void method2674(class107 arg0) {
        arg0.method2097(6);
        arg0.method2097(this.field2419);
        arg0.method2097(this.field2430 ? 1 : 0);
        arg0.method2097(this.field2425);
        arg0.method2097(this.field2424);
        arg0.method2097(this.field2423);
        arg0.method2097(this.field2440);
        arg0.method2097(this.field2444);
        arg0.method2097(this.field2428 ? 1 : 0);
        arg0.method2098(this.field2429);
        arg0.method2097(this.field2431);
        arg0.method2182(this.field2432);
        arg0.method2098(this.field2433);
        arg0.method2293(this.field2434);
        arg0.method2293(this.field2435);
        arg0.method2293(this.field2427);
        arg0.method2293(this.field2414);
        arg0.method2097(this.field2439);
        arg0.method2098(this.field2438);
        arg0.method2293(this.field2442);
        arg0.method2293(this.field2426);
        arg0.method2097(this.field2437);
        arg0.method2097(this.field2441);
        for (int var2 = 0; var2 < this.field2418.length; var2++) {
            arg0.method2100(this.field2418[var2]);
        }
        arg0.method2100(this.field2445);
    }

    @ObfuscatedName("ej.y(B)I")
    public int method2667() {
        byte var1 = 38;
        int var2 = var1 + class107.method1339(this.field2434);
        int var3 = var2 + class107.method1339(this.field2435);
        int var4 = var3 + class107.method1339(this.field2427);
        int var5 = var4 + class107.method1339(this.field2414);
        int var6 = var5 + class107.method1339(this.field2442);
        return var6 + class107.method1339(this.field2426);
    }
}
