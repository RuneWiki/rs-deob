package deob;

@ObfuscatedName("ei")
public class class145 extends class186 {

    @ObfuscatedName("ei.l")
    public int field2423;

    @ObfuscatedName("ei.e")
    public boolean field2422;

    @ObfuscatedName("ei.m")
    public int field2428;

    @ObfuscatedName("ei.u")
    public int field2429;

    @ObfuscatedName("ei.ac")
    public int field2430;

    @ObfuscatedName("ei.ap")
    public int field2431;

    @ObfuscatedName("ei.ai")
    public int field2432;

    @ObfuscatedName("ei.as")
    public boolean field2441;

    @ObfuscatedName("ei.aa")
    public int field2434;

    @ObfuscatedName("ei.aw")
    public int field2449;

    @ObfuscatedName("ei.av")
    public int field2437;

    @ObfuscatedName("ei.an")
    public int field2438;

    @ObfuscatedName("ei.at")
    public String field2439;

    @ObfuscatedName("ei.ao")
    public String field2444;

    @ObfuscatedName("ei.ag")
    public String field2421;

    @ObfuscatedName("ei.ax")
    public String field2442;

    @ObfuscatedName("ei.ay")
    public int field2445;

    @ObfuscatedName("ei.ab")
    public int field2447;

    @ObfuscatedName("ei.al")
    public int field2435;

    @ObfuscatedName("ei.ae")
    public int field2446;

    @ObfuscatedName("ei.af")
    public String field2433;

    @ObfuscatedName("ei.aj")
    public String field2448;

    @ObfuscatedName("ei.ah")
    public int[] field2440 = new int[3];

    @ObfuscatedName("ei.au")
    public int field2450;

    public class145(boolean arg0) {
        if (arg0) {
            if (Statics.field1526.startsWith("win")) {
                this.field2423 = 1;
            } else if (Statics.field1526.startsWith("mac")) {
                this.field2423 = 2;
            } else if (Statics.field1526.startsWith("linux")) {
                this.field2423 = 3;
            } else {
                this.field2423 = 4;
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
                this.field2422 = true;
            } else {
                this.field2422 = false;
            }
            if (this.field2423 == 1) {
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
            } else if (this.field2423 == 2) {
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
                this.field2429 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2429 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2429 = 4;
            } else {
                this.field2429 = 3;
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
            this.field2430 = var10;
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
            this.field2431 = var14;
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
            this.field2432 = var18;
            this.field2441 = false;
            this.field2434 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2430 > 3) {
                this.field2449 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2449 = 0;
            }
            this.field2437 = 0;
        }
        if (this.field2439 == null) {
            this.field2439 = "";
        }
        if (this.field2444 == null) {
            this.field2444 = "";
        }
        if (this.field2421 == null) {
            this.field2421 = "";
        }
        if (this.field2442 == null) {
            this.field2442 = "";
        }
        if (this.field2433 == null) {
            this.field2433 = "";
        }
        if (this.field2448 == null) {
            this.field2448 = "";
        }
        this.method2694();
    }

    @ObfuscatedName("ei.g(B)V")
    public void method2694() {
        if (this.field2439.length() > 40) {
            this.field2439 = this.field2439.substring(0, 40);
        }
        if (this.field2444.length() > 40) {
            this.field2444 = this.field2444.substring(0, 40);
        }
        if (this.field2421.length() > 10) {
            this.field2421 = this.field2421.substring(0, 10);
        }
        if (this.field2442.length() > 10) {
            this.field2442 = this.field2442.substring(0, 10);
        }
    }

    @ObfuscatedName("ei.v(Ldm;B)V")
    public void method2698(class107 arg0) {
        arg0.method2126(6);
        arg0.method2126(this.field2423);
        arg0.method2126(this.field2422 ? 1 : 0);
        arg0.method2126(this.field2428);
        arg0.method2126(this.field2429);
        arg0.method2126(this.field2430);
        arg0.method2126(this.field2431);
        arg0.method2126(this.field2432);
        arg0.method2126(this.field2441 ? 1 : 0);
        arg0.method2151(this.field2434);
        arg0.method2126(this.field2449);
        arg0.method2226(this.field2437);
        arg0.method2151(this.field2438);
        arg0.method2274(this.field2439);
        arg0.method2274(this.field2444);
        arg0.method2274(this.field2421);
        arg0.method2274(this.field2442);
        arg0.method2126(this.field2447);
        arg0.method2151(this.field2445);
        arg0.method2274(this.field2433);
        arg0.method2274(this.field2448);
        arg0.method2126(this.field2435);
        arg0.method2126(this.field2446);
        for (int var2 = 0; var2 < this.field2440.length; var2++) {
            arg0.method2236(this.field2440[var2]);
        }
        arg0.method2236(this.field2450);
    }

    @ObfuscatedName("ei.z(B)I")
    public int method2701() {
        byte var1 = 38;
        String var3 = this.field2439;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2444;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2421;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2442;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2433;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2448;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
