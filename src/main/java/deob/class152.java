package deob;

@ObfuscatedName("ez")
public class class152 extends class179 {

    @ObfuscatedName("ez.h")
    public int field2491;

    @ObfuscatedName("ez.j")
    public boolean field2486;

    @ObfuscatedName("ez.p")
    public int field2513;

    @ObfuscatedName("ez.u")
    public int field2495;

    @ObfuscatedName("ez.at")
    public int field2515;

    @ObfuscatedName("ez.as")
    public int field2497;

    @ObfuscatedName("ez.ax")
    public int field2498;

    @ObfuscatedName("ez.ao")
    public boolean field2499;

    @ObfuscatedName("ez.aq")
    public int field2500;

    @ObfuscatedName("ez.al")
    public int field2501;

    @ObfuscatedName("ez.aw")
    public int field2502;

    @ObfuscatedName("ez.ah")
    public int field2510;

    @ObfuscatedName("ez.aa")
    public String field2504;

    @ObfuscatedName("ez.ay")
    public String field2505;

    @ObfuscatedName("ez.ak")
    public String field2494;

    @ObfuscatedName("ez.az")
    public String field2506;

    @ObfuscatedName("ez.ap")
    public int field2508;

    @ObfuscatedName("ez.af")
    public int field2509;

    @ObfuscatedName("ez.au")
    public int field2496;

    @ObfuscatedName("ez.an")
    public int field2511;

    @ObfuscatedName("ez.av")
    public String field2512;

    @ObfuscatedName("ez.ac")
    public String field2503;

    @ObfuscatedName("ez.ae")
    public int[] field2492 = new int[3];

    @ObfuscatedName("ez.ai")
    public int field2489;

    public class152(boolean arg0) {
        if (arg0) {
            if (Statics.field2729.startsWith("win")) {
                this.field2491 = 1;
            } else if (Statics.field2729.startsWith("mac")) {
                this.field2491 = 2;
            } else if (Statics.field2729.startsWith("linux")) {
                this.field2491 = 3;
            } else {
                this.field2491 = 4;
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
                this.field2486 = true;
            } else {
                this.field2486 = false;
            }
            if (this.field2491 == 1) {
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
            } else if (this.field2491 == 2) {
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
                this.field2495 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2495 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2495 = 4;
            } else {
                this.field2495 = 3;
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
            this.field2497 = var14;
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
            this.field2498 = var18;
            this.field2499 = false;
            this.field2500 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2515 > 3) {
                this.field2501 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2501 = 0;
            }
            this.field2502 = 0;
        }
        if (this.field2504 == null) {
            this.field2504 = "";
        }
        if (this.field2505 == null) {
            this.field2505 = "";
        }
        if (this.field2494 == null) {
            this.field2494 = "";
        }
        if (this.field2506 == null) {
            this.field2506 = "";
        }
        if (this.field2512 == null) {
            this.field2512 = "";
        }
        if (this.field2503 == null) {
            this.field2503 = "";
        }
        this.method2990();
    }

    @ObfuscatedName("ez.b(I)V")
    public void method2990() {
        if (this.field2504.length() > 40) {
            this.field2504 = this.field2504.substring(0, 40);
        }
        if (this.field2505.length() > 40) {
            this.field2505 = this.field2505.substring(0, 40);
        }
        if (this.field2494.length() > 10) {
            this.field2494 = this.field2494.substring(0, 10);
        }
        if (this.field2506.length() > 10) {
            this.field2506 = this.field2506.substring(0, 10);
        }
    }

    @ObfuscatedName("ez.e(Ldv;I)V")
    public void method2982(class126 arg0) {
        arg0.method2422(6);
        arg0.method2422(this.field2491);
        arg0.method2422(this.field2486 ? 1 : 0);
        arg0.method2422(this.field2513);
        arg0.method2422(this.field2495);
        arg0.method2422(this.field2515);
        arg0.method2422(this.field2497);
        arg0.method2422(this.field2498);
        arg0.method2422(this.field2499 ? 1 : 0);
        arg0.method2423(this.field2500);
        arg0.method2422(this.field2501);
        arg0.method2451(this.field2502);
        arg0.method2423(this.field2510);
        arg0.method2428(this.field2504);
        arg0.method2428(this.field2505);
        arg0.method2428(this.field2494);
        arg0.method2428(this.field2506);
        arg0.method2422(this.field2509);
        arg0.method2423(this.field2508);
        arg0.method2428(this.field2512);
        arg0.method2428(this.field2503);
        arg0.method2422(this.field2496);
        arg0.method2422(this.field2511);
        for (int var2 = 0; var2 < this.field2492.length; var2++) {
            arg0.method2425(this.field2492[var2]);
        }
        arg0.method2425(this.field2489);
    }

    @ObfuscatedName("ez.g(I)I")
    public int method2983() {
        byte var1 = 38;
        int var2 = var1 + class126.method2419(this.field2504);
        int var3 = var2 + class126.method2419(this.field2505);
        int var4 = var3 + class126.method2419(this.field2494);
        int var5 = var4 + class126.method2419(this.field2506);
        int var6 = var5 + class126.method2419(this.field2512);
        return var6 + class126.method2419(this.field2503);
    }
}
