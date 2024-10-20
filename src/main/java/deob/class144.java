package deob;

@ObfuscatedName("ee")
public class class144 extends class183 {

    @ObfuscatedName("ee.k")
    public int field2397;

    @ObfuscatedName("ee.m")
    public boolean field2414;

    @ObfuscatedName("ee.q")
    public int field2404;

    @ObfuscatedName("ee.h")
    public int field2407;

    @ObfuscatedName("ee.ak")
    public int field2408;

    @ObfuscatedName("ee.ab")
    public int field2409;

    @ObfuscatedName("ee.as")
    public int field2416;

    @ObfuscatedName("ee.aq")
    public boolean field2417;

    @ObfuscatedName("ee.ai")
    public int field2398;

    @ObfuscatedName("ee.aj")
    public int field2413;

    @ObfuscatedName("ee.ar")
    public int field2430;

    @ObfuscatedName("ee.ac")
    public int field2421;

    @ObfuscatedName("ee.ap")
    public String field2396;

    @ObfuscatedName("ee.az")
    public String field2425;

    @ObfuscatedName("ee.ae")
    public String field2415;

    @ObfuscatedName("ee.ah")
    public String field2418;

    @ObfuscatedName("ee.ad")
    public int field2420;

    @ObfuscatedName("ee.ay")
    public int field2419;

    @ObfuscatedName("ee.at")
    public int field2422;

    @ObfuscatedName("ee.au")
    public int field2410;

    @ObfuscatedName("ee.an")
    public String field2424;

    @ObfuscatedName("ee.al")
    public String field2412;

    @ObfuscatedName("ee.am")
    public int[] field2426 = new int[3];

    @ObfuscatedName("ee.av")
    public int field2427;

    public class144(boolean arg0) {
        if (arg0) {
            if (Statics.field1421.startsWith("win")) {
                this.field2397 = 1;
            } else if (Statics.field1421.startsWith("mac")) {
                this.field2397 = 2;
            } else if (Statics.field1421.startsWith("linux")) {
                this.field2397 = 3;
            } else {
                this.field2397 = 4;
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
                this.field2414 = true;
            } else {
                this.field2414 = false;
            }
            if (this.field2397 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2404 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2404 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2404 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2404 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2404 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2404 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2404 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2404 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2404 = 9;
                }
            } else if (this.field2397 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2404 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2404 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2404 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2404 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2407 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2407 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2407 = 4;
            } else {
                this.field2407 = 3;
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
            this.field2408 = var10;
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
            this.field2409 = var14;
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
            this.field2416 = var18;
            this.field2417 = false;
            this.field2398 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2408 > 3) {
                this.field2413 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2413 = 0;
            }
            this.field2430 = 0;
        }
        if (this.field2396 == null) {
            this.field2396 = "";
        }
        if (this.field2425 == null) {
            this.field2425 = "";
        }
        if (this.field2415 == null) {
            this.field2415 = "";
        }
        if (this.field2418 == null) {
            this.field2418 = "";
        }
        if (this.field2424 == null) {
            this.field2424 = "";
        }
        if (this.field2412 == null) {
            this.field2412 = "";
        }
        this.method2704();
    }

    @ObfuscatedName("ee.e(I)V")
    public void method2704() {
        if (this.field2396.length() > 40) {
            this.field2396 = this.field2396.substring(0, 40);
        }
        if (this.field2425.length() > 40) {
            this.field2425 = this.field2425.substring(0, 40);
        }
        if (this.field2415.length() > 10) {
            this.field2415 = this.field2415.substring(0, 10);
        }
        if (this.field2418.length() > 10) {
            this.field2418 = this.field2418.substring(0, 10);
        }
    }

    @ObfuscatedName("ee.p(Ldp;I)V")
    public void method2707(class107 arg0) {
        arg0.method2249(6);
        arg0.method2249(this.field2397);
        arg0.method2249(this.field2414 ? 1 : 0);
        arg0.method2249(this.field2404);
        arg0.method2249(this.field2407);
        arg0.method2249(this.field2408);
        arg0.method2249(this.field2409);
        arg0.method2249(this.field2416);
        arg0.method2249(this.field2417 ? 1 : 0);
        arg0.method2128(this.field2398);
        arg0.method2249(this.field2413);
        arg0.method2129(this.field2430);
        arg0.method2128(this.field2421);
        arg0.method2133(this.field2396);
        arg0.method2133(this.field2425);
        arg0.method2133(this.field2415);
        arg0.method2133(this.field2418);
        arg0.method2249(this.field2419);
        arg0.method2128(this.field2420);
        arg0.method2133(this.field2424);
        arg0.method2133(this.field2412);
        arg0.method2249(this.field2422);
        arg0.method2249(this.field2410);
        for (int var2 = 0; var2 < this.field2426.length; var2++) {
            arg0.method2130(this.field2426[var2]);
        }
        arg0.method2130(this.field2427);
    }

    @ObfuscatedName("ee.a(I)I")
    public int method2706() {
        byte var1 = 38;
        String var3 = this.field2396;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2425;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2415;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2418;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2424;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2412;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
