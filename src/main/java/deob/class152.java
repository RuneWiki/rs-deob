package deob;

@ObfuscatedName("ei")
public class class152 extends class179 {

    @ObfuscatedName("ei.d")
    public int field2492;

    @ObfuscatedName("ei.r")
    public boolean field2482;

    @ObfuscatedName("ei.w")
    public int field2486;

    @ObfuscatedName("ei.i")
    public int field2488;

    @ObfuscatedName("ei.aa")
    public int field2489;

    @ObfuscatedName("ei.ax")
    public int field2499;

    @ObfuscatedName("ei.ad")
    public int field2503;

    @ObfuscatedName("ei.af")
    public boolean field2476;

    @ObfuscatedName("ei.ai")
    public int field2483;

    @ObfuscatedName("ei.an")
    public int field2494;

    @ObfuscatedName("ei.al")
    public int field2495;

    @ObfuscatedName("ei.at")
    public int field2496;

    @ObfuscatedName("ei.ah")
    public String field2500;

    @ObfuscatedName("ei.am")
    public String field2498;

    @ObfuscatedName("ei.ab")
    public String field2507;

    @ObfuscatedName("ei.aq")
    public String field2491;

    @ObfuscatedName("ei.ap")
    public int field2508;

    @ObfuscatedName("ei.ar")
    public int field2490;

    @ObfuscatedName("ei.as")
    public int field2481;

    @ObfuscatedName("ei.az")
    public int field2504;

    @ObfuscatedName("ei.aw")
    public String field2505;

    @ObfuscatedName("ei.av")
    public String field2506;

    @ObfuscatedName("ei.ay")
    public int[] field2497 = new int[3];

    @ObfuscatedName("ei.aj")
    public int field2487;

    public class152(boolean arg0) {
        if (arg0) {
            if (Statics.field2833.startsWith("win")) {
                this.field2492 = 1;
            } else if (Statics.field2833.startsWith("mac")) {
                this.field2492 = 2;
            } else if (Statics.field2833.startsWith("linux")) {
                this.field2492 = 3;
            } else {
                this.field2492 = 4;
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
                this.field2482 = true;
            } else {
                this.field2482 = false;
            }
            if (this.field2492 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2486 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2486 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2486 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2486 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2486 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2486 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2486 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2486 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2486 = 9;
                }
            } else if (this.field2492 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2486 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2486 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2486 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2486 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2488 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2488 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2488 = 4;
            } else {
                this.field2488 = 3;
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
            this.field2489 = var10;
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
            this.field2499 = var14;
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
            this.field2503 = var18;
            this.field2476 = false;
            this.field2483 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2489 > 3) {
                this.field2494 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2494 = 0;
            }
            this.field2495 = 0;
        }
        if (this.field2500 == null) {
            this.field2500 = "";
        }
        if (this.field2498 == null) {
            this.field2498 = "";
        }
        if (this.field2507 == null) {
            this.field2507 = "";
        }
        if (this.field2491 == null) {
            this.field2491 = "";
        }
        if (this.field2505 == null) {
            this.field2505 = "";
        }
        if (this.field2506 == null) {
            this.field2506 = "";
        }
        this.method3024();
    }

    @ObfuscatedName("ei.f(I)V")
    public void method3024() {
        if (this.field2500.length() > 40) {
            this.field2500 = this.field2500.substring(0, 40);
        }
        if (this.field2498.length() > 40) {
            this.field2498 = this.field2498.substring(0, 40);
        }
        if (this.field2507.length() > 10) {
            this.field2507 = this.field2507.substring(0, 10);
        }
        if (this.field2491.length() > 10) {
            this.field2491 = this.field2491.substring(0, 10);
        }
    }

    @ObfuscatedName("ei.t(Ldq;I)V")
    public void method3025(class127 arg0) {
        arg0.method2536(6);
        arg0.method2536(this.field2492);
        arg0.method2536(this.field2482 ? 1 : 0);
        arg0.method2536(this.field2486);
        arg0.method2536(this.field2488);
        arg0.method2536(this.field2489);
        arg0.method2536(this.field2499);
        arg0.method2536(this.field2503);
        arg0.method2536(this.field2476 ? 1 : 0);
        arg0.method2563(this.field2483);
        arg0.method2536(this.field2494);
        arg0.method2446(this.field2495);
        arg0.method2563(this.field2496);
        arg0.method2450(this.field2500);
        arg0.method2450(this.field2498);
        arg0.method2450(this.field2507);
        arg0.method2450(this.field2491);
        arg0.method2536(this.field2490);
        arg0.method2563(this.field2508);
        arg0.method2450(this.field2505);
        arg0.method2450(this.field2506);
        arg0.method2536(this.field2481);
        arg0.method2536(this.field2504);
        for (int var2 = 0; var2 < this.field2497.length; var2++) {
            arg0.method2447(this.field2497[var2]);
        }
        arg0.method2447(this.field2487);
    }

    @ObfuscatedName("ei.n(S)I")
    public int method3026() {
        byte var1 = 38;
        String var3 = this.field2500;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2498;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2507;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2491;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2505;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2506;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
