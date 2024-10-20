package deob;

@ObfuscatedName("er")
public class class151 extends class199 {

    @ObfuscatedName("er.j")
    public int field2498;

    @ObfuscatedName("er.f")
    public boolean field2525;

    @ObfuscatedName("er.d")
    public int field2499;

    @ObfuscatedName("er.ah")
    public int field2516;

    @ObfuscatedName("er.ag")
    public int field2505;

    @ObfuscatedName("er.ad")
    public int field2506;

    @ObfuscatedName("er.ao")
    public int field2507;

    @ObfuscatedName("er.am")
    public boolean field2508;

    @ObfuscatedName("er.ax")
    public int field2529;

    @ObfuscatedName("er.ar")
    public int field2503;

    @ObfuscatedName("er.aw")
    public int field2511;

    @ObfuscatedName("er.ak")
    public int field2501;

    @ObfuscatedName("er.an")
    public String field2513;

    @ObfuscatedName("er.av")
    public String field2509;

    @ObfuscatedName("er.af")
    public String field2515;

    @ObfuscatedName("er.ae")
    public String field2494;

    @ObfuscatedName("er.au")
    public int field2523;

    @ObfuscatedName("er.aa")
    public int field2518;

    @ObfuscatedName("er.ay")
    public int field2519;

    @ObfuscatedName("er.ac")
    public int field2520;

    @ObfuscatedName("er.ab")
    public String field2521;

    @ObfuscatedName("er.ap")
    public String field2522;

    @ObfuscatedName("er.as")
    public int[] field2510 = new int[3];

    @ObfuscatedName("er.bi")
    public int field2524;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field18.startsWith("win")) {
                this.field2498 = 1;
            } else if (Statics.field18.startsWith("mac")) {
                this.field2498 = 2;
            } else if (Statics.field18.startsWith("linux")) {
                this.field2498 = 3;
            } else {
                this.field2498 = 4;
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
                this.field2525 = true;
            } else {
                this.field2525 = false;
            }
            if (this.field2498 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2499 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2499 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2499 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2499 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2499 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2499 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2499 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2499 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2499 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2499 = 10;
                }
            } else if (this.field2498 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2499 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2499 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2499 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2499 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2499 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2499 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2499 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2516 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2516 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2516 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2516 = 4;
            } else {
                this.field2516 = 5;
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
            this.field2505 = var10;
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
            this.field2507 = var18;
            this.field2508 = false;
            this.field2529 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2505 > 3) {
                this.field2503 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2503 = 0;
            }
            this.field2511 = 0;
        }
        if (this.field2513 == null) {
            this.field2513 = "";
        }
        if (this.field2509 == null) {
            this.field2509 = "";
        }
        if (this.field2515 == null) {
            this.field2515 = "";
        }
        if (this.field2494 == null) {
            this.field2494 = "";
        }
        if (this.field2521 == null) {
            this.field2521 = "";
        }
        if (this.field2522 == null) {
            this.field2522 = "";
        }
        this.method2834();
    }

    @ObfuscatedName("er.n(I)V")
    public void method2834() {
        if (this.field2513.length() > 40) {
            this.field2513 = this.field2513.substring(0, 40);
        }
        if (this.field2509.length() > 40) {
            this.field2509 = this.field2509.substring(0, 40);
        }
        if (this.field2515.length() > 10) {
            this.field2515 = this.field2515.substring(0, 10);
        }
        if (this.field2494.length() > 10) {
            this.field2494 = this.field2494.substring(0, 10);
        }
    }

    @ObfuscatedName("er.g(Ldp;I)V")
    public void method2835(class111 arg0) {
        arg0.method2326(6);
        arg0.method2326(this.field2498);
        arg0.method2326(this.field2525 ? 1 : 0);
        arg0.method2326(this.field2499);
        arg0.method2326(this.field2516);
        arg0.method2326(this.field2505);
        arg0.method2326(this.field2506);
        arg0.method2326(this.field2507);
        arg0.method2326(this.field2508 ? 1 : 0);
        arg0.method2202(this.field2529);
        arg0.method2326(this.field2503);
        arg0.method2323(this.field2511);
        arg0.method2202(this.field2501);
        arg0.method2208(this.field2513);
        arg0.method2208(this.field2509);
        arg0.method2208(this.field2515);
        arg0.method2208(this.field2494);
        arg0.method2326(this.field2518);
        arg0.method2202(this.field2523);
        arg0.method2208(this.field2521);
        arg0.method2208(this.field2522);
        arg0.method2326(this.field2519);
        arg0.method2326(this.field2520);
        for (int var2 = 0; var2 < this.field2510.length; var2++) {
            arg0.method2204(this.field2510[var2]);
        }
        arg0.method2204(this.field2524);
    }

    @ObfuscatedName("er.a(I)I")
    public int method2843() {
        byte var1 = 38;
        String var3 = this.field2513;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2509;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2515;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2494;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2521;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2522;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
