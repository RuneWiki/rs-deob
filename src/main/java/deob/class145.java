package deob;

@ObfuscatedName("eq")
public class class145 extends class186 {

    @ObfuscatedName("eq.s")
    public int field2435;

    @ObfuscatedName("eq.g")
    public boolean field2441;

    @ObfuscatedName("eq.f")
    public int field2415;

    @ObfuscatedName("eq.x")
    public int field2423;

    @ObfuscatedName("eq.al")
    public int field2427;

    @ObfuscatedName("eq.au")
    public int field2424;

    @ObfuscatedName("eq.az")
    public int field2426;

    @ObfuscatedName("eq.ag")
    public boolean field2421;

    @ObfuscatedName("eq.aj")
    public int field2428;

    @ObfuscatedName("eq.am")
    public int field2429;

    @ObfuscatedName("eq.ab")
    public int field2430;

    @ObfuscatedName("eq.ai")
    public int field2431;

    @ObfuscatedName("eq.ak")
    public String field2432;

    @ObfuscatedName("eq.ao")
    public String field2433;

    @ObfuscatedName("eq.ar")
    public String field2434;

    @ObfuscatedName("eq.aq")
    public String field2416;

    @ObfuscatedName("eq.an")
    public int field2436;

    @ObfuscatedName("eq.av")
    public int field2411;

    @ObfuscatedName("eq.ac")
    public int field2438;

    @ObfuscatedName("eq.ay")
    public int field2439;

    @ObfuscatedName("eq.ae")
    public String field2440;

    @ObfuscatedName("eq.ah")
    public String field2444;

    @ObfuscatedName("eq.aw")
    public int[] field2442 = new int[3];

    @ObfuscatedName("eq.ax")
    public int field2413;

    public class145(boolean arg0) {
        if (arg0) {
            if (Statics.field2086.startsWith("win")) {
                this.field2435 = 1;
            } else if (Statics.field2086.startsWith("mac")) {
                this.field2435 = 2;
            } else if (Statics.field2086.startsWith("linux")) {
                this.field2435 = 3;
            } else {
                this.field2435 = 4;
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
                this.field2441 = true;
            } else {
                this.field2441 = false;
            }
            if (this.field2435 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2415 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2415 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2415 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2415 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2415 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2415 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2415 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2415 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2415 = 9;
                }
            } else if (this.field2435 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2415 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2415 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2415 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2415 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2423 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2423 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2423 = 4;
            } else {
                this.field2423 = 3;
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
            this.field2427 = var10;
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
            this.field2426 = var18;
            this.field2421 = false;
            this.field2428 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2427 > 3) {
                this.field2429 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2429 = 0;
            }
            this.field2430 = 0;
        }
        if (this.field2432 == null) {
            this.field2432 = "";
        }
        if (this.field2433 == null) {
            this.field2433 = "";
        }
        if (this.field2434 == null) {
            this.field2434 = "";
        }
        if (this.field2416 == null) {
            this.field2416 = "";
        }
        if (this.field2440 == null) {
            this.field2440 = "";
        }
        if (this.field2444 == null) {
            this.field2444 = "";
        }
        this.method2727();
    }

    @ObfuscatedName("eq.i(B)V")
    public void method2727() {
        if (this.field2432.length() > 40) {
            this.field2432 = this.field2432.substring(0, 40);
        }
        if (this.field2433.length() > 40) {
            this.field2433 = this.field2433.substring(0, 40);
        }
        if (this.field2434.length() > 10) {
            this.field2434 = this.field2434.substring(0, 10);
        }
        if (this.field2416.length() > 10) {
            this.field2416 = this.field2416.substring(0, 10);
        }
    }

    @ObfuscatedName("eq.c(Ldm;I)V")
    public void method2726(class107 arg0) {
        arg0.method2137(6);
        arg0.method2137(this.field2435);
        arg0.method2137(this.field2441 ? 1 : 0);
        arg0.method2137(this.field2415);
        arg0.method2137(this.field2423);
        arg0.method2137(this.field2427);
        arg0.method2137(this.field2424);
        arg0.method2137(this.field2426);
        arg0.method2137(this.field2421 ? 1 : 0);
        arg0.method2235(this.field2428);
        arg0.method2137(this.field2429);
        arg0.method2283(this.field2430);
        arg0.method2235(this.field2431);
        arg0.method2270(this.field2432);
        arg0.method2270(this.field2433);
        arg0.method2270(this.field2434);
        arg0.method2270(this.field2416);
        arg0.method2137(this.field2411);
        arg0.method2235(this.field2436);
        arg0.method2270(this.field2440);
        arg0.method2270(this.field2444);
        arg0.method2137(this.field2438);
        arg0.method2137(this.field2439);
        for (int var2 = 0; var2 < this.field2442.length; var2++) {
            arg0.method2140(this.field2442[var2]);
        }
        arg0.method2140(this.field2413);
    }

    @ObfuscatedName("eq.h(I)I")
    public int method2736() {
        byte var1 = 38;
        String var3 = this.field2432;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2433;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2434;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2416;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2440;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2444;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
