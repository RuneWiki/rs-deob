package deob;

@ObfuscatedName("ea")
public class class151 extends class199 {

    @ObfuscatedName("ea.l")
    public int field2495;

    @ObfuscatedName("ea.u")
    public boolean field2496;

    @ObfuscatedName("ea.x")
    public int field2522;

    @ObfuscatedName("ea.aw")
    public int field2500;

    @ObfuscatedName("ea.ac")
    public int field2501;

    @ObfuscatedName("ea.ap")
    public int field2524;

    @ObfuscatedName("ea.al")
    public int field2518;

    @ObfuscatedName("ea.ak")
    public boolean field2504;

    @ObfuscatedName("ea.at")
    public int field2492;

    @ObfuscatedName("ea.am")
    public int field2506;

    @ObfuscatedName("ea.az")
    public int field2507;

    @ObfuscatedName("ea.ae")
    public int field2508;

    @ObfuscatedName("ea.ah")
    public String field2509;

    @ObfuscatedName("ea.an")
    public String field2510;

    @ObfuscatedName("ea.aq")
    public String field2511;

    @ObfuscatedName("ea.as")
    public String field2521;

    @ObfuscatedName("ea.ay")
    public int field2513;

    @ObfuscatedName("ea.ad")
    public int field2519;

    @ObfuscatedName("ea.af")
    public int field2520;

    @ObfuscatedName("ea.ab")
    public int field2516;

    @ObfuscatedName("ea.av")
    public String field2502;

    @ObfuscatedName("ea.ao")
    public String field2503;

    @ObfuscatedName("ea.aj")
    public int[] field2517 = new int[3];

    @ObfuscatedName("ea.bj")
    public int field2514;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field2140.startsWith("win")) {
                this.field2495 = 1;
            } else if (Statics.field2140.startsWith("mac")) {
                this.field2495 = 2;
            } else if (Statics.field2140.startsWith("linux")) {
                this.field2495 = 3;
            } else {
                this.field2495 = 4;
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
                this.field2496 = true;
            } else {
                this.field2496 = false;
            }
            if (this.field2495 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2522 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2522 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2522 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2522 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2522 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2522 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2522 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2522 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2522 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2522 = 10;
                }
            } else if (this.field2495 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2522 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2522 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2522 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2522 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2522 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2522 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2522 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2500 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2500 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2500 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2500 = 4;
            } else {
                this.field2500 = 5;
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
            this.field2501 = var10;
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
            this.field2524 = var14;
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
            this.field2518 = var18;
            this.field2504 = false;
            this.field2492 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2501 > 3) {
                this.field2506 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2506 = 0;
            }
            this.field2507 = 0;
        }
        if (this.field2509 == null) {
            this.field2509 = "";
        }
        if (this.field2510 == null) {
            this.field2510 = "";
        }
        if (this.field2511 == null) {
            this.field2511 = "";
        }
        if (this.field2521 == null) {
            this.field2521 = "";
        }
        if (this.field2502 == null) {
            this.field2502 = "";
        }
        if (this.field2503 == null) {
            this.field2503 = "";
        }
        this.method2745();
    }

    @ObfuscatedName("ea.b(I)V")
    public void method2745() {
        if (this.field2509.length() > 40) {
            this.field2509 = this.field2509.substring(0, 40);
        }
        if (this.field2510.length() > 40) {
            this.field2510 = this.field2510.substring(0, 40);
        }
        if (this.field2511.length() > 10) {
            this.field2511 = this.field2511.substring(0, 10);
        }
        if (this.field2521.length() > 10) {
            this.field2521 = this.field2521.substring(0, 10);
        }
    }

    @ObfuscatedName("ea.e(Ldj;I)V")
    public void method2753(class111 arg0) {
        arg0.method2112(6);
        arg0.method2112(this.field2495);
        arg0.method2112(this.field2496 ? 1 : 0);
        arg0.method2112(this.field2522);
        arg0.method2112(this.field2500);
        arg0.method2112(this.field2501);
        arg0.method2112(this.field2524);
        arg0.method2112(this.field2518);
        arg0.method2112(this.field2504 ? 1 : 0);
        arg0.method2201(this.field2492);
        arg0.method2112(this.field2506);
        arg0.method2114(this.field2507);
        arg0.method2201(this.field2508);
        arg0.method2299(this.field2509);
        arg0.method2299(this.field2510);
        arg0.method2299(this.field2511);
        arg0.method2299(this.field2521);
        arg0.method2112(this.field2519);
        arg0.method2201(this.field2513);
        arg0.method2299(this.field2502);
        arg0.method2299(this.field2503);
        arg0.method2112(this.field2520);
        arg0.method2112(this.field2516);
        for (int var2 = 0; var2 < this.field2517.length; var2++) {
            arg0.method2115(this.field2517[var2]);
        }
        arg0.method2115(this.field2514);
    }

    @ObfuscatedName("ea.a(S)I")
    public int method2747() {
        byte var1 = 38;
        String var3 = this.field2509;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2510;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        int var10 = var9 + class111.method111(this.field2511);
        String var12 = this.field2521;
        int var13 = var12.length() + 2;
        int var14 = var10 + var13;
        String var16 = this.field2502;
        int var17 = var16.length() + 2;
        int var18 = var14 + var17;
        String var20 = this.field2503;
        int var21 = var20.length() + 2;
        return var18 + var21;
    }
}
