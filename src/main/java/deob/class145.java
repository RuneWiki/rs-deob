package deob;

@ObfuscatedName("ev")
public class class145 extends class186 {

    @ObfuscatedName("ev.n")
    public int field2406;

    @ObfuscatedName("ev.v")
    public boolean field2407;

    @ObfuscatedName("ev.k")
    public int field2410;

    @ObfuscatedName("ev.m")
    public int field2411;

    @ObfuscatedName("ev.ak")
    public int field2412;

    @ObfuscatedName("ev.aw")
    public int field2413;

    @ObfuscatedName("ev.af")
    public int field2408;

    @ObfuscatedName("ev.ab")
    public boolean field2427;

    @ObfuscatedName("ev.ao")
    public int field2416;

    @ObfuscatedName("ev.ae")
    public int field2431;

    @ObfuscatedName("ev.ar")
    public int field2415;

    @ObfuscatedName("ev.aq")
    public int field2419;

    @ObfuscatedName("ev.am")
    public String field2420;

    @ObfuscatedName("ev.az")
    public String field2417;

    @ObfuscatedName("ev.an")
    public String field2430;

    @ObfuscatedName("ev.at")
    public String field2423;

    @ObfuscatedName("ev.av")
    public int field2424;

    @ObfuscatedName("ev.aa")
    public int field2425;

    @ObfuscatedName("ev.ag")
    public int field2426;

    @ObfuscatedName("ev.au")
    public int field2414;

    @ObfuscatedName("ev.aj")
    public String field2433;

    @ObfuscatedName("ev.ay")
    public String field2429;

    @ObfuscatedName("ev.ac")
    public int[] field2434 = new int[3];

    @ObfuscatedName("ev.al")
    public int field2402;

    public class145(boolean arg0) {
        if (arg0) {
            if (Statics.field1442.startsWith("win")) {
                this.field2406 = 1;
            } else if (Statics.field1442.startsWith("mac")) {
                this.field2406 = 2;
            } else if (Statics.field1442.startsWith("linux")) {
                this.field2406 = 3;
            } else {
                this.field2406 = 4;
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
                this.field2407 = true;
            } else {
                this.field2407 = false;
            }
            if (this.field2406 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2410 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2410 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2410 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2410 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2410 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2410 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2410 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2410 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2410 = 9;
                }
            } else if (this.field2406 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2410 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2410 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2410 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2410 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2411 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2411 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2411 = 4;
            } else {
                this.field2411 = 3;
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
            this.field2412 = var10;
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
            this.field2413 = var14;
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
            this.field2408 = var18;
            this.field2427 = false;
            this.field2416 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2412 > 3) {
                this.field2431 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2431 = 0;
            }
            this.field2415 = 0;
        }
        if (this.field2420 == null) {
            this.field2420 = "";
        }
        if (this.field2417 == null) {
            this.field2417 = "";
        }
        if (this.field2430 == null) {
            this.field2430 = "";
        }
        if (this.field2423 == null) {
            this.field2423 = "";
        }
        if (this.field2433 == null) {
            this.field2433 = "";
        }
        if (this.field2429 == null) {
            this.field2429 = "";
        }
        this.method2695();
    }

    @ObfuscatedName("ev.t(I)V")
    public void method2695() {
        if (this.field2420.length() > 40) {
            this.field2420 = this.field2420.substring(0, 40);
        }
        if (this.field2417.length() > 40) {
            this.field2417 = this.field2417.substring(0, 40);
        }
        if (this.field2430.length() > 10) {
            this.field2430 = this.field2430.substring(0, 10);
        }
        if (this.field2423.length() > 10) {
            this.field2423 = this.field2423.substring(0, 10);
        }
    }

    @ObfuscatedName("ev.s(Ldb;I)V")
    public void method2696(class107 arg0) {
        arg0.method2214(6);
        arg0.method2214(this.field2406);
        arg0.method2214(this.field2407 ? 1 : 0);
        arg0.method2214(this.field2410);
        arg0.method2214(this.field2411);
        arg0.method2214(this.field2412);
        arg0.method2214(this.field2413);
        arg0.method2214(this.field2408);
        arg0.method2214(this.field2427 ? 1 : 0);
        arg0.method2251(this.field2416);
        arg0.method2214(this.field2431);
        arg0.method2176(this.field2415);
        arg0.method2251(this.field2419);
        arg0.method2200(this.field2420);
        arg0.method2200(this.field2417);
        arg0.method2200(this.field2430);
        arg0.method2200(this.field2423);
        arg0.method2214(this.field2425);
        arg0.method2251(this.field2424);
        arg0.method2200(this.field2433);
        arg0.method2200(this.field2429);
        arg0.method2214(this.field2426);
        arg0.method2214(this.field2414);
        for (int var2 = 0; var2 < this.field2434.length; var2++) {
            arg0.method2090(this.field2434[var2]);
        }
        arg0.method2090(this.field2402);
    }

    @ObfuscatedName("ev.f(I)I")
    public int method2697() {
        byte var1 = 38;
        String var3 = this.field2420;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2417;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2430;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2423;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2433;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2429;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
