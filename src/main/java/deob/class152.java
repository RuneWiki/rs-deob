package deob;

@ObfuscatedName("ex")
public class class152 extends class179 {

    @ObfuscatedName("ex.q")
    public int field2525;

    @ObfuscatedName("ex.t")
    public boolean field2513;

    @ObfuscatedName("ex.f")
    public int field2517;

    @ObfuscatedName("ex.r")
    public int field2535;

    @ObfuscatedName("ex.av")
    public int field2520;

    @ObfuscatedName("ex.an")
    public int field2521;

    @ObfuscatedName("ex.ae")
    public int field2537;

    @ObfuscatedName("ex.au")
    public boolean field2523;

    @ObfuscatedName("ex.ag")
    public int field2524;

    @ObfuscatedName("ex.ac")
    public int field2516;

    @ObfuscatedName("ex.ah")
    public int field2526;

    @ObfuscatedName("ex.ai")
    public int field2531;

    @ObfuscatedName("ex.ap")
    public String field2528;

    @ObfuscatedName("ex.ad")
    public String field2529;

    @ObfuscatedName("ex.ay")
    public String field2530;

    @ObfuscatedName("ex.az")
    public String field2507;

    @ObfuscatedName("ex.ab")
    public int field2540;

    @ObfuscatedName("ex.am")
    public int field2522;

    @ObfuscatedName("ex.as")
    public int field2534;

    @ObfuscatedName("ex.aa")
    public int field2510;

    @ObfuscatedName("ex.af")
    public String field2533;

    @ObfuscatedName("ex.ax")
    public String field2512;

    @ObfuscatedName("ex.aq")
    public int[] field2527 = new int[3];

    @ObfuscatedName("ex.ao")
    public int field2539;

    public class152(boolean arg0) {
        if (arg0) {
            if (Statics.field880.startsWith("win")) {
                this.field2525 = 1;
            } else if (Statics.field880.startsWith("mac")) {
                this.field2525 = 2;
            } else if (Statics.field880.startsWith("linux")) {
                this.field2525 = 3;
            } else {
                this.field2525 = 4;
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
                this.field2513 = true;
            } else {
                this.field2513 = false;
            }
            if (this.field2525 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2517 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2517 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2517 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2517 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2517 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2517 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2517 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2517 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2517 = 9;
                }
            } else if (this.field2525 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2517 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2517 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2517 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2517 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2535 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2535 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2535 = 4;
            } else {
                this.field2535 = 3;
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
            this.field2520 = var10;
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
            this.field2521 = var14;
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
            this.field2537 = var18;
            this.field2523 = false;
            this.field2524 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2520 > 3) {
                this.field2516 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2516 = 0;
            }
            this.field2526 = 0;
        }
        if (this.field2528 == null) {
            this.field2528 = "";
        }
        if (this.field2529 == null) {
            this.field2529 = "";
        }
        if (this.field2530 == null) {
            this.field2530 = "";
        }
        if (this.field2507 == null) {
            this.field2507 = "";
        }
        if (this.field2533 == null) {
            this.field2533 = "";
        }
        if (this.field2512 == null) {
            this.field2512 = "";
        }
        this.method2951();
    }

    @ObfuscatedName("ex.b(I)V")
    public void method2951() {
        if (this.field2528.length() > 40) {
            this.field2528 = this.field2528.substring(0, 40);
        }
        if (this.field2529.length() > 40) {
            this.field2529 = this.field2529.substring(0, 40);
        }
        if (this.field2530.length() > 10) {
            this.field2530 = this.field2530.substring(0, 10);
        }
        if (this.field2507.length() > 10) {
            this.field2507 = this.field2507.substring(0, 10);
        }
    }

    @ObfuscatedName("ex.c(Ldv;I)V")
    public void method2953(class127 arg0) {
        arg0.method2590(6);
        arg0.method2590(this.field2525);
        arg0.method2590(this.field2513 ? 1 : 0);
        arg0.method2590(this.field2517);
        arg0.method2590(this.field2535);
        arg0.method2590(this.field2520);
        arg0.method2590(this.field2521);
        arg0.method2590(this.field2537);
        arg0.method2590(this.field2523 ? 1 : 0);
        arg0.method2576(this.field2524);
        arg0.method2590(this.field2516);
        arg0.method2404(this.field2526);
        arg0.method2576(this.field2531);
        arg0.method2388(this.field2528);
        arg0.method2388(this.field2529);
        arg0.method2388(this.field2530);
        arg0.method2388(this.field2507);
        arg0.method2590(this.field2522);
        arg0.method2576(this.field2540);
        arg0.method2388(this.field2533);
        arg0.method2388(this.field2512);
        arg0.method2590(this.field2534);
        arg0.method2590(this.field2510);
        for (int var2 = 0; var2 < this.field2527.length; var2++) {
            arg0.method2385(this.field2527[var2]);
        }
        arg0.method2385(this.field2539);
    }

    @ObfuscatedName("ex.j(I)I")
    public int method2952() {
        byte var1 = 38;
        int var2 = var1 + class127.method2169(this.field2528);
        int var3 = var2 + class127.method2169(this.field2529);
        int var4 = var3 + class127.method2169(this.field2530);
        int var5 = var4 + class127.method2169(this.field2507);
        int var6 = var5 + class127.method2169(this.field2533);
        return var6 + class127.method2169(this.field2512);
    }
}
