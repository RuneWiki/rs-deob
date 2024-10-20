package deob;

@ObfuscatedName("ea")
public class class145 extends class186 {

    @ObfuscatedName("ea.y")
    public int field2416;

    @ObfuscatedName("ea.g")
    public boolean field2401;

    @ObfuscatedName("ea.d")
    public int field2419;

    @ObfuscatedName("ea.q")
    public int field2403;

    @ObfuscatedName("ea.al")
    public int field2404;

    @ObfuscatedName("ea.ao")
    public int field2405;

    @ObfuscatedName("ea.ap")
    public int field2413;

    @ObfuscatedName("ea.aa")
    public boolean field2394;

    @ObfuscatedName("ea.ak")
    public int field2408;

    @ObfuscatedName("ea.as")
    public int field2409;

    @ObfuscatedName("ea.aj")
    public int field2410;

    @ObfuscatedName("ea.af")
    public int field2411;

    @ObfuscatedName("ea.am")
    public String field2399;

    @ObfuscatedName("ea.ab")
    public String field2393;

    @ObfuscatedName("ea.ai")
    public String field2414;

    @ObfuscatedName("ea.an")
    public String field2415;

    @ObfuscatedName("ea.ac")
    public int field2397;

    @ObfuscatedName("ea.au")
    public int field2417;

    @ObfuscatedName("ea.av")
    public int field2406;

    @ObfuscatedName("ea.at")
    public int field2412;

    @ObfuscatedName("ea.ax")
    public String field2420;

    @ObfuscatedName("ea.ae")
    public String field2421;

    @ObfuscatedName("ea.az")
    public int[] field2422 = new int[3];

    @ObfuscatedName("ea.ar")
    public int field2423;

    public class145(boolean arg0) {
        if (arg0) {
            if (Statics.field2050.startsWith("win")) {
                this.field2416 = 1;
            } else if (Statics.field2050.startsWith("mac")) {
                this.field2416 = 2;
            } else if (Statics.field2050.startsWith("linux")) {
                this.field2416 = 3;
            } else {
                this.field2416 = 4;
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
                this.field2401 = true;
            } else {
                this.field2401 = false;
            }
            if (this.field2416 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2419 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2419 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2419 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2419 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2419 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2419 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2419 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2419 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2419 = 9;
                }
            } else if (this.field2416 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2419 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2419 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2419 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2419 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2403 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2403 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2403 = 4;
            } else {
                this.field2403 = 3;
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
            this.field2404 = var10;
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
            this.field2405 = var14;
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
            this.field2413 = var18;
            this.field2394 = false;
            this.field2408 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2404 > 3) {
                this.field2409 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2409 = 0;
            }
            this.field2410 = 0;
        }
        if (this.field2399 == null) {
            this.field2399 = "";
        }
        if (this.field2393 == null) {
            this.field2393 = "";
        }
        if (this.field2414 == null) {
            this.field2414 = "";
        }
        if (this.field2415 == null) {
            this.field2415 = "";
        }
        if (this.field2420 == null) {
            this.field2420 = "";
        }
        if (this.field2421 == null) {
            this.field2421 = "";
        }
        this.method2657();
    }

    @ObfuscatedName("ea.t(B)V")
    public void method2657() {
        if (this.field2399.length() > 40) {
            this.field2399 = this.field2399.substring(0, 40);
        }
        if (this.field2393.length() > 40) {
            this.field2393 = this.field2393.substring(0, 40);
        }
        if (this.field2414.length() > 10) {
            this.field2414 = this.field2414.substring(0, 10);
        }
        if (this.field2415.length() > 10) {
            this.field2415 = this.field2415.substring(0, 10);
        }
    }

    @ObfuscatedName("ea.o(Ldg;I)V")
    public void method2659(class107 arg0) {
        arg0.method2168(6);
        arg0.method2168(this.field2416);
        arg0.method2168(this.field2401 ? 1 : 0);
        arg0.method2168(this.field2419);
        arg0.method2168(this.field2403);
        arg0.method2168(this.field2404);
        arg0.method2168(this.field2405);
        arg0.method2168(this.field2413);
        arg0.method2168(this.field2394 ? 1 : 0);
        arg0.method2185(this.field2408);
        arg0.method2168(this.field2409);
        arg0.method2106(this.field2410);
        arg0.method2185(this.field2411);
        arg0.method2188(this.field2399);
        arg0.method2188(this.field2393);
        arg0.method2188(this.field2414);
        arg0.method2188(this.field2415);
        arg0.method2168(this.field2417);
        arg0.method2185(this.field2397);
        arg0.method2188(this.field2420);
        arg0.method2188(this.field2421);
        arg0.method2168(this.field2406);
        arg0.method2168(this.field2412);
        for (int var2 = 0; var2 < this.field2422.length; var2++) {
            arg0.method2174(this.field2422[var2]);
        }
        arg0.method2174(this.field2423);
    }

    @ObfuscatedName("ea.i(B)I")
    public int method2658() {
        byte var1 = 38;
        String var3 = this.field2399;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2393;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2414;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2415;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2420;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2421;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
