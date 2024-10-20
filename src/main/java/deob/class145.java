package deob;

@ObfuscatedName("eb")
public class class145 extends class186 {

    @ObfuscatedName("eb.z")
    public int field2422;

    @ObfuscatedName("eb.g")
    public boolean field2423;

    @ObfuscatedName("eb.s")
    public int field2428;

    @ObfuscatedName("eb.l")
    public int field2430;

    @ObfuscatedName("eb.ag")
    public int field2431;

    @ObfuscatedName("eb.au")
    public int field2435;

    @ObfuscatedName("eb.ak")
    public int field2433;

    @ObfuscatedName("eb.aw")
    public boolean field2434;

    @ObfuscatedName("eb.at")
    public int field2442;

    @ObfuscatedName("eb.aj")
    public int field2436;

    @ObfuscatedName("eb.as")
    public int field2438;

    @ObfuscatedName("eb.ap")
    public int field2439;

    @ObfuscatedName("eb.ai")
    public String field2440;

    @ObfuscatedName("eb.av")
    public String field2425;

    @ObfuscatedName("eb.ae")
    public String field2418;

    @ObfuscatedName("eb.ay")
    public String field2443;

    @ObfuscatedName("eb.ab")
    public int field2429;

    @ObfuscatedName("eb.az")
    public int field2450;

    @ObfuscatedName("eb.ad")
    public int field2446;

    @ObfuscatedName("eb.ao")
    public int field2451;

    @ObfuscatedName("eb.am")
    public String field2448;

    @ObfuscatedName("eb.al")
    public String field2449;

    @ObfuscatedName("eb.ac")
    public int[] field2444 = new int[3];

    @ObfuscatedName("eb.ax")
    public int field2441;

    public class145(boolean arg0) {
        if (arg0) {
            if (Statics.field2095.startsWith("win")) {
                this.field2422 = 1;
            } else if (Statics.field2095.startsWith("mac")) {
                this.field2422 = 2;
            } else if (Statics.field2095.startsWith("linux")) {
                this.field2422 = 3;
            } else {
                this.field2422 = 4;
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
            if (this.field2422 == 1) {
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
            } else if (this.field2422 == 2) {
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
                this.field2430 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2430 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2430 = 4;
            } else {
                this.field2430 = 3;
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
            this.field2431 = var10;
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
            this.field2435 = var14;
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
            this.field2433 = var18;
            this.field2434 = false;
            this.field2442 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2431 > 3) {
                this.field2436 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2436 = 0;
            }
            this.field2438 = 0;
        }
        if (this.field2440 == null) {
            this.field2440 = "";
        }
        if (this.field2425 == null) {
            this.field2425 = "";
        }
        if (this.field2418 == null) {
            this.field2418 = "";
        }
        if (this.field2443 == null) {
            this.field2443 = "";
        }
        if (this.field2448 == null) {
            this.field2448 = "";
        }
        if (this.field2449 == null) {
            this.field2449 = "";
        }
        this.method2688();
    }

    @ObfuscatedName("eb.k(I)V")
    public void method2688() {
        if (this.field2440.length() > 40) {
            this.field2440 = this.field2440.substring(0, 40);
        }
        if (this.field2425.length() > 40) {
            this.field2425 = this.field2425.substring(0, 40);
        }
        if (this.field2418.length() > 10) {
            this.field2418 = this.field2418.substring(0, 10);
        }
        if (this.field2443.length() > 10) {
            this.field2443 = this.field2443.substring(0, 10);
        }
    }

    @ObfuscatedName("eb.b(Ldi;B)V")
    public void method2689(class107 arg0) {
        arg0.method2102(6);
        arg0.method2102(this.field2422);
        arg0.method2102(this.field2423 ? 1 : 0);
        arg0.method2102(this.field2428);
        arg0.method2102(this.field2430);
        arg0.method2102(this.field2431);
        arg0.method2102(this.field2435);
        arg0.method2102(this.field2433);
        arg0.method2102(this.field2434 ? 1 : 0);
        arg0.method2275(this.field2442);
        arg0.method2102(this.field2436);
        arg0.method2104(this.field2438);
        arg0.method2275(this.field2439);
        arg0.method2108(this.field2440);
        arg0.method2108(this.field2425);
        arg0.method2108(this.field2418);
        arg0.method2108(this.field2443);
        arg0.method2102(this.field2450);
        arg0.method2275(this.field2429);
        arg0.method2108(this.field2448);
        arg0.method2108(this.field2449);
        arg0.method2102(this.field2446);
        arg0.method2102(this.field2451);
        for (int var2 = 0; var2 < this.field2444.length; var2++) {
            arg0.method2303(this.field2444[var2]);
        }
        arg0.method2303(this.field2441);
    }

    @ObfuscatedName("eb.e(B)I")
    public int method2690() {
        byte var1 = 38;
        String var3 = this.field2440;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2425;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2418;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2443;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2448;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2449;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
