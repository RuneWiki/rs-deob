package deob;

@ObfuscatedName("ef")
public class class151 extends class199 {

    @ObfuscatedName("ef.g")
    public int field2501;

    @ObfuscatedName("ef.f")
    public boolean field2515;

    @ObfuscatedName("ef.w")
    public int field2511;

    @ObfuscatedName("ef.al")
    public int field2512;

    @ObfuscatedName("ef.ar")
    public int field2497;

    @ObfuscatedName("ef.as")
    public int field2499;

    @ObfuscatedName("ef.ab")
    public int field2528;

    @ObfuscatedName("ef.ao")
    public boolean field2508;

    @ObfuscatedName("ef.ac")
    public int field2517;

    @ObfuscatedName("ef.at")
    public int field2518;

    @ObfuscatedName("ef.an")
    public int field2519;

    @ObfuscatedName("ef.aw")
    public int field2520;

    @ObfuscatedName("ef.ai")
    public String field2521;

    @ObfuscatedName("ef.ah")
    public String field2522;

    @ObfuscatedName("ef.aq")
    public String field2523;

    @ObfuscatedName("ef.ay")
    public String field2524;

    @ObfuscatedName("ef.am")
    public int field2525;

    @ObfuscatedName("ef.aj")
    public int field2506;

    @ObfuscatedName("ef.ag")
    public int field2527;

    @ObfuscatedName("ef.ap")
    public int field2505;

    @ObfuscatedName("ef.af")
    public String field2532;

    @ObfuscatedName("ef.au")
    public String field2530;

    @ObfuscatedName("ef.av")
    public int[] field2531 = new int[3];

    @ObfuscatedName("ef.bs")
    public int field2516;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field2142.startsWith("win")) {
                this.field2501 = 1;
            } else if (Statics.field2142.startsWith("mac")) {
                this.field2501 = 2;
            } else if (Statics.field2142.startsWith("linux")) {
                this.field2501 = 3;
            } else {
                this.field2501 = 4;
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
                this.field2515 = true;
            } else {
                this.field2515 = false;
            }
            if (this.field2501 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2511 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2511 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2511 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2511 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2511 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2511 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2511 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2511 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2511 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2511 = 10;
                }
            } else if (this.field2501 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2511 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2511 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2511 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2511 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2511 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2511 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2511 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2512 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2512 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2512 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2512 = 4;
            } else {
                this.field2512 = 5;
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
            this.field2497 = var10;
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
            this.field2528 = var18;
            this.field2508 = false;
            this.field2517 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2497 > 3) {
                this.field2518 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2518 = 0;
            }
            this.field2519 = 0;
        }
        if (this.field2521 == null) {
            this.field2521 = "";
        }
        if (this.field2522 == null) {
            this.field2522 = "";
        }
        if (this.field2523 == null) {
            this.field2523 = "";
        }
        if (this.field2524 == null) {
            this.field2524 = "";
        }
        if (this.field2532 == null) {
            this.field2532 = "";
        }
        if (this.field2530 == null) {
            this.field2530 = "";
        }
        this.method2858();
    }

    @ObfuscatedName("ef.n(I)V")
    public void method2858() {
        if (this.field2521.length() > 40) {
            this.field2521 = this.field2521.substring(0, 40);
        }
        if (this.field2522.length() > 40) {
            this.field2522 = this.field2522.substring(0, 40);
        }
        if (this.field2523.length() > 10) {
            this.field2523 = this.field2523.substring(0, 10);
        }
        if (this.field2524.length() > 10) {
            this.field2524 = this.field2524.substring(0, 10);
        }
    }

    @ObfuscatedName("ef.d(Ldl;I)V")
    public void method2865(class111 arg0) {
        arg0.method2213(6);
        arg0.method2213(this.field2501);
        arg0.method2213(this.field2515 ? 1 : 0);
        arg0.method2213(this.field2511);
        arg0.method2213(this.field2512);
        arg0.method2213(this.field2497);
        arg0.method2213(this.field2499);
        arg0.method2213(this.field2528);
        arg0.method2213(this.field2508 ? 1 : 0);
        arg0.method2214(this.field2517);
        arg0.method2213(this.field2518);
        arg0.method2234(this.field2519);
        arg0.method2214(this.field2520);
        arg0.method2220(this.field2521);
        arg0.method2220(this.field2522);
        arg0.method2220(this.field2523);
        arg0.method2220(this.field2524);
        arg0.method2213(this.field2506);
        arg0.method2214(this.field2525);
        arg0.method2220(this.field2532);
        arg0.method2220(this.field2530);
        arg0.method2213(this.field2527);
        arg0.method2213(this.field2505);
        for (int var2 = 0; var2 < this.field2531.length; var2++) {
            arg0.method2216(this.field2531[var2]);
        }
        arg0.method2216(this.field2516);
    }

    @ObfuscatedName("ef.z(B)I")
    public int method2860() {
        byte var1 = 38;
        int var2 = var1 + class111.method5(this.field2521);
        int var3 = var2 + class111.method5(this.field2522);
        int var4 = var3 + class111.method5(this.field2523);
        int var5 = var4 + class111.method5(this.field2524);
        int var6 = var5 + class111.method5(this.field2532);
        return var6 + class111.method5(this.field2530);
    }
}
