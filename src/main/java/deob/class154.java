package deob;

@ObfuscatedName("ek")
public class class154 extends class181 {

    @ObfuscatedName("ek.d")
    public int field2510;

    @ObfuscatedName("ek.e")
    public boolean field2511;

    @ObfuscatedName("ek.n")
    public int field2520;

    @ObfuscatedName("ek.j")
    public int field2519;

    @ObfuscatedName("ek.af")
    public int field2515;

    @ObfuscatedName("ek.ar")
    public int field2506;

    @ObfuscatedName("ek.ax")
    public int field2521;

    @ObfuscatedName("ek.at")
    public boolean field2518;

    @ObfuscatedName("ek.ah")
    public int field2507;

    @ObfuscatedName("ek.ay")
    public int field2522;

    @ObfuscatedName("ek.ai")
    public int field2525;

    @ObfuscatedName("ek.aw")
    public int field2526;

    @ObfuscatedName("ek.am")
    public String field2527;

    @ObfuscatedName("ek.an")
    public String field2528;

    @ObfuscatedName("ek.as")
    public String field2516;

    @ObfuscatedName("ek.au")
    public String field2536;

    @ObfuscatedName("ek.aq")
    public int field2531;

    @ObfuscatedName("ek.ac")
    public int field2532;

    @ObfuscatedName("ek.ae")
    public int field2533;

    @ObfuscatedName("ek.ad")
    public int field2534;

    @ObfuscatedName("ek.ao")
    public String field2535;

    @ObfuscatedName("ek.aj")
    public String field2529;

    @ObfuscatedName("ek.aa")
    public int[] field2537 = new int[3];

    @ObfuscatedName("ek.al")
    public int field2523;

    public class154(boolean arg0) {
        if (arg0) {
            if (Statics.field1446.startsWith("win")) {
                this.field2510 = 1;
            } else if (Statics.field1446.startsWith("mac")) {
                this.field2510 = 2;
            } else if (Statics.field1446.startsWith("linux")) {
                this.field2510 = 3;
            } else {
                this.field2510 = 4;
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
                this.field2511 = true;
            } else {
                this.field2511 = false;
            }
            if (this.field2510 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2520 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2520 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2520 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2520 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2520 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2520 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2520 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2520 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2520 = 9;
                }
            } else if (this.field2510 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2520 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2520 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2520 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2520 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2519 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2519 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2519 = 4;
            } else {
                this.field2519 = 3;
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
            this.field2515 = var10;
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
            this.field2506 = var14;
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
            this.field2521 = var18;
            this.field2518 = false;
            this.field2507 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2515 > 3) {
                this.field2522 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2522 = 0;
            }
            this.field2525 = 0;
        }
        if (this.field2527 == null) {
            this.field2527 = "";
        }
        if (this.field2528 == null) {
            this.field2528 = "";
        }
        if (this.field2516 == null) {
            this.field2516 = "";
        }
        if (this.field2536 == null) {
            this.field2536 = "";
        }
        if (this.field2535 == null) {
            this.field2535 = "";
        }
        if (this.field2529 == null) {
            this.field2529 = "";
        }
        this.method3029();
    }

    @ObfuscatedName("ek.i(B)V")
    public void method3029() {
        if (this.field2527.length() > 40) {
            this.field2527 = this.field2527.substring(0, 40);
        }
        if (this.field2528.length() > 40) {
            this.field2528 = this.field2528.substring(0, 40);
        }
        if (this.field2516.length() > 10) {
            this.field2516 = this.field2516.substring(0, 10);
        }
        if (this.field2536.length() > 10) {
            this.field2536 = this.field2536.substring(0, 10);
        }
    }

    @ObfuscatedName("ek.b(Lds;B)V")
    public void method3030(class128 arg0) {
        arg0.method2449(6);
        arg0.method2449(this.field2510);
        arg0.method2449(this.field2511 ? 1 : 0);
        arg0.method2449(this.field2520);
        arg0.method2449(this.field2519);
        arg0.method2449(this.field2515);
        arg0.method2449(this.field2506);
        arg0.method2449(this.field2521);
        arg0.method2449(this.field2518 ? 1 : 0);
        arg0.method2529(this.field2507);
        arg0.method2449(this.field2522);
        arg0.method2501(this.field2525);
        arg0.method2529(this.field2526);
        arg0.method2455(this.field2527);
        arg0.method2455(this.field2528);
        arg0.method2455(this.field2516);
        arg0.method2455(this.field2536);
        arg0.method2449(this.field2532);
        arg0.method2529(this.field2531);
        arg0.method2455(this.field2535);
        arg0.method2455(this.field2529);
        arg0.method2449(this.field2533);
        arg0.method2449(this.field2534);
        for (int var2 = 0; var2 < this.field2537.length; var2++) {
            arg0.method2452(this.field2537[var2]);
        }
        arg0.method2452(this.field2523);
    }

    @ObfuscatedName("ek.r(B)I")
    public int method3035() {
        byte var1 = 38;
        int var2 = var1 + class128.method188(this.field2527);
        int var3 = var2 + class128.method188(this.field2528);
        int var4 = var3 + class128.method188(this.field2516);
        int var5 = var4 + class128.method188(this.field2536);
        int var6 = var5 + class128.method188(this.field2535);
        return var6 + class128.method188(this.field2529);
    }
}
