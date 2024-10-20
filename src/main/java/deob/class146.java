package deob;

@ObfuscatedName("ev")
public class class146 extends class187 {

    @ObfuscatedName("ev.j")
    public int field2410;

    @ObfuscatedName("ev.b")
    public boolean field2424;

    @ObfuscatedName("ev.n")
    public int field2415;

    @ObfuscatedName("ev.i")
    public int field2407;

    @ObfuscatedName("ev.ah")
    public int field2425;

    @ObfuscatedName("ev.aj")
    public int field2438;

    @ObfuscatedName("ev.aq")
    public int field2417;

    @ObfuscatedName("ev.aa")
    public boolean field2421;

    @ObfuscatedName("ev.ar")
    public int field2418;

    @ObfuscatedName("ev.av")
    public int field2428;

    @ObfuscatedName("ev.ap")
    public int field2419;

    @ObfuscatedName("ev.ao")
    public int field2426;

    @ObfuscatedName("ev.az")
    public String field2427;

    @ObfuscatedName("ev.ac")
    public String field2430;

    @ObfuscatedName("ev.ad")
    public String field2411;

    @ObfuscatedName("ev.al")
    public String field2429;

    @ObfuscatedName("ev.ay")
    public int field2431;

    @ObfuscatedName("ev.ag")
    public int field2432;

    @ObfuscatedName("ev.ak")
    public int field2433;

    @ObfuscatedName("ev.an")
    public int field2434;

    @ObfuscatedName("ev.ab")
    public String field2435;

    @ObfuscatedName("ev.am")
    public String field2436;

    @ObfuscatedName("ev.aw")
    public int[] field2422 = new int[3];

    @ObfuscatedName("ev.as")
    public int field2423;

    public class146(boolean arg0) {
        if (arg0) {
            if (Statics.field936.startsWith("win")) {
                this.field2410 = 1;
            } else if (Statics.field936.startsWith("mac")) {
                this.field2410 = 2;
            } else if (Statics.field936.startsWith("linux")) {
                this.field2410 = 3;
            } else {
                this.field2410 = 4;
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
                this.field2424 = true;
            } else {
                this.field2424 = false;
            }
            if (this.field2410 == 1) {
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
            } else if (this.field2410 == 2) {
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
            this.field2425 = var10;
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
            this.field2438 = var14;
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
            this.field2417 = var18;
            this.field2421 = false;
            this.field2418 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2425 > 3) {
                this.field2428 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2428 = 0;
            }
            this.field2419 = 0;
        }
        if (this.field2427 == null) {
            this.field2427 = "";
        }
        if (this.field2430 == null) {
            this.field2430 = "";
        }
        if (this.field2411 == null) {
            this.field2411 = "";
        }
        if (this.field2429 == null) {
            this.field2429 = "";
        }
        if (this.field2435 == null) {
            this.field2435 = "";
        }
        if (this.field2436 == null) {
            this.field2436 = "";
        }
        this.method2653();
    }

    @ObfuscatedName("ev.g(B)V")
    public void method2653() {
        if (this.field2427.length() > 40) {
            this.field2427 = this.field2427.substring(0, 40);
        }
        if (this.field2430.length() > 40) {
            this.field2430 = this.field2430.substring(0, 40);
        }
        if (this.field2411.length() > 10) {
            this.field2411 = this.field2411.substring(0, 10);
        }
        if (this.field2429.length() > 10) {
            this.field2429 = this.field2429.substring(0, 10);
        }
    }

    @ObfuscatedName("ev.s(Ldi;I)V")
    public void method2654(class107 arg0) {
        arg0.method2087(6);
        arg0.method2087(this.field2410);
        arg0.method2087(this.field2424 ? 1 : 0);
        arg0.method2087(this.field2415);
        arg0.method2087(this.field2407);
        arg0.method2087(this.field2425);
        arg0.method2087(this.field2438);
        arg0.method2087(this.field2417);
        arg0.method2087(this.field2421 ? 1 : 0);
        arg0.method2088(this.field2418);
        arg0.method2087(this.field2428);
        arg0.method2089(this.field2419);
        arg0.method2088(this.field2426);
        arg0.method2093(this.field2427);
        arg0.method2093(this.field2430);
        arg0.method2093(this.field2411);
        arg0.method2093(this.field2429);
        arg0.method2087(this.field2432);
        arg0.method2088(this.field2431);
        arg0.method2093(this.field2435);
        arg0.method2093(this.field2436);
        arg0.method2087(this.field2433);
        arg0.method2087(this.field2434);
        for (int var2 = 0; var2 < this.field2422.length; var2++) {
            arg0.method2253(this.field2422[var2]);
        }
        arg0.method2253(this.field2423);
    }

    @ObfuscatedName("ev.h(I)I")
    public int method2656() {
        byte var1 = 38;
        String var3 = this.field2427;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2430;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2411;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2429;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2435;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2436;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
