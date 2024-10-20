package deob;

@ObfuscatedName("ex")
public class class154 extends class181 {

    @ObfuscatedName("ex.z")
    public int field2516;

    @ObfuscatedName("ex.m")
    public boolean field2517;

    @ObfuscatedName("ex.y")
    public int field2513;

    @ObfuscatedName("ex.v")
    public int field2524;

    @ObfuscatedName("ex.ax")
    public int field2525;

    @ObfuscatedName("ex.ao")
    public int field2526;

    @ObfuscatedName("ex.al")
    public int field2527;

    @ObfuscatedName("ex.ap")
    public boolean field2528;

    @ObfuscatedName("ex.ak")
    public int field2522;

    @ObfuscatedName("ex.av")
    public int field2534;

    @ObfuscatedName("ex.ae")
    public int field2532;

    @ObfuscatedName("ex.am")
    public int field2520;

    @ObfuscatedName("ex.aq")
    public String field2531;

    @ObfuscatedName("ex.ai")
    public String field2533;

    @ObfuscatedName("ex.an")
    public String field2535;

    @ObfuscatedName("ex.aa")
    public String field2536;

    @ObfuscatedName("ex.ad")
    public int field2530;

    @ObfuscatedName("ex.az")
    public int field2538;

    @ObfuscatedName("ex.ar")
    public int field2539;

    @ObfuscatedName("ex.at")
    public int field2518;

    @ObfuscatedName("ex.af")
    public String field2544;

    @ObfuscatedName("ex.ay")
    public String field2542;

    @ObfuscatedName("ex.as")
    public int[] field2543 = new int[3];

    @ObfuscatedName("ex.ag")
    public int field2529;

    public class154(boolean arg0) {
        if (arg0) {
            if (Statics.field290.startsWith("win")) {
                this.field2516 = 1;
            } else if (Statics.field290.startsWith("mac")) {
                this.field2516 = 2;
            } else if (Statics.field290.startsWith("linux")) {
                this.field2516 = 3;
            } else {
                this.field2516 = 4;
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
                this.field2517 = true;
            } else {
                this.field2517 = false;
            }
            if (this.field2516 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2513 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2513 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2513 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2513 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2513 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2513 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2513 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2513 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2513 = 9;
                }
            } else if (this.field2516 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2513 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2513 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2513 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2513 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2524 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2524 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2524 = 4;
            } else {
                this.field2524 = 3;
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
            this.field2525 = var10;
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
            this.field2526 = var14;
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
            this.field2527 = var18;
            this.field2528 = false;
            this.field2522 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2525 > 3) {
                this.field2534 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2534 = 0;
            }
            this.field2532 = 0;
        }
        if (this.field2531 == null) {
            this.field2531 = "";
        }
        if (this.field2533 == null) {
            this.field2533 = "";
        }
        if (this.field2535 == null) {
            this.field2535 = "";
        }
        if (this.field2536 == null) {
            this.field2536 = "";
        }
        if (this.field2544 == null) {
            this.field2544 = "";
        }
        if (this.field2542 == null) {
            this.field2542 = "";
        }
        this.method3004();
    }

    @ObfuscatedName("ex.e(I)V")
    public void method3004() {
        if (this.field2531.length() > 40) {
            this.field2531 = this.field2531.substring(0, 40);
        }
        if (this.field2533.length() > 40) {
            this.field2533 = this.field2533.substring(0, 40);
        }
        if (this.field2535.length() > 10) {
            this.field2535 = this.field2535.substring(0, 10);
        }
        if (this.field2536.length() > 10) {
            this.field2536 = this.field2536.substring(0, 10);
        }
    }

    @ObfuscatedName("ex.i(Ldl;S)V")
    public void method3005(class128 arg0) {
        arg0.method2634(6);
        arg0.method2634(this.field2516);
        arg0.method2634(this.field2517 ? 1 : 0);
        arg0.method2634(this.field2513);
        arg0.method2634(this.field2524);
        arg0.method2634(this.field2525);
        arg0.method2634(this.field2526);
        arg0.method2634(this.field2527);
        arg0.method2634(this.field2528 ? 1 : 0);
        arg0.method2603(this.field2522);
        arg0.method2634(this.field2534);
        arg0.method2486(this.field2532);
        arg0.method2603(this.field2520);
        arg0.method2446(this.field2531);
        arg0.method2446(this.field2533);
        arg0.method2446(this.field2535);
        arg0.method2446(this.field2536);
        arg0.method2634(this.field2538);
        arg0.method2603(this.field2530);
        arg0.method2446(this.field2544);
        arg0.method2446(this.field2542);
        arg0.method2634(this.field2539);
        arg0.method2634(this.field2518);
        for (int var2 = 0; var2 < this.field2543.length; var2++) {
            arg0.method2454(this.field2543[var2]);
        }
        arg0.method2454(this.field2529);
    }

    @ObfuscatedName("ex.k(B)I")
    public int method3006() {
        byte var1 = 38;
        String var3 = this.field2531;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2533;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2535;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2536;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2544;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2542;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
