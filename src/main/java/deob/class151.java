package deob;

@ObfuscatedName("ef")
public class class151 extends class199 {

    @ObfuscatedName("ef.o")
    public int field2483;

    @ObfuscatedName("ef.f")
    public boolean field2500;

    @ObfuscatedName("ef.n")
    public int field2494;

    @ObfuscatedName("ef.ae")
    public int field2495;

    @ObfuscatedName("ef.ag")
    public int field2492;

    @ObfuscatedName("ef.as")
    public int field2497;

    @ObfuscatedName("ef.at")
    public int field2498;

    @ObfuscatedName("ef.aw")
    public boolean field2480;

    @ObfuscatedName("ef.ay")
    public int field2496;

    @ObfuscatedName("ef.al")
    public int field2501;

    @ObfuscatedName("ef.aj")
    public int field2502;

    @ObfuscatedName("ef.ak")
    public int field2493;

    @ObfuscatedName("ef.ar")
    public String field2504;

    @ObfuscatedName("ef.ai")
    public String field2505;

    @ObfuscatedName("ef.ax")
    public String field2506;

    @ObfuscatedName("ef.az")
    public String field2507;

    @ObfuscatedName("ef.aq")
    public int field2508;

    @ObfuscatedName("ef.ad")
    public int field2486;

    @ObfuscatedName("ef.af")
    public int field2510;

    @ObfuscatedName("ef.aa")
    public int field2482;

    @ObfuscatedName("ef.av")
    public String field2512;

    @ObfuscatedName("ef.an")
    public String field2513;

    @ObfuscatedName("ef.am")
    public int[] field2514 = new int[3];

    @ObfuscatedName("ef.bt")
    public int field2499;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field1307.startsWith("win")) {
                this.field2483 = 1;
            } else if (Statics.field1307.startsWith("mac")) {
                this.field2483 = 2;
            } else if (Statics.field1307.startsWith("linux")) {
                this.field2483 = 3;
            } else {
                this.field2483 = 4;
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
                this.field2500 = true;
            } else {
                this.field2500 = false;
            }
            if (this.field2483 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2494 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2494 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2494 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2494 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2494 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2494 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2494 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2494 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2494 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2494 = 10;
                }
            } else if (this.field2483 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2494 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2494 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2494 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2494 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2494 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2494 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2494 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2495 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2495 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2495 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2495 = 4;
            } else {
                this.field2495 = 5;
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
            this.field2492 = var10;
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
            this.field2480 = false;
            this.field2496 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2492 > 3) {
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
        if (this.field2506 == null) {
            this.field2506 = "";
        }
        if (this.field2507 == null) {
            this.field2507 = "";
        }
        if (this.field2512 == null) {
            this.field2512 = "";
        }
        if (this.field2513 == null) {
            this.field2513 = "";
        }
        this.method2799();
    }

    @ObfuscatedName("ef.t(I)V")
    public void method2799() {
        if (this.field2504.length() > 40) {
            this.field2504 = this.field2504.substring(0, 40);
        }
        if (this.field2505.length() > 40) {
            this.field2505 = this.field2505.substring(0, 40);
        }
        if (this.field2506.length() > 10) {
            this.field2506 = this.field2506.substring(0, 10);
        }
        if (this.field2507.length() > 10) {
            this.field2507 = this.field2507.substring(0, 10);
        }
    }

    @ObfuscatedName("ef.b(Ldc;I)V")
    public void method2804(class111 arg0) {
        arg0.method2158(6);
        arg0.method2158(this.field2483);
        arg0.method2158(this.field2500 ? 1 : 0);
        arg0.method2158(this.field2494);
        arg0.method2158(this.field2495);
        arg0.method2158(this.field2492);
        arg0.method2158(this.field2497);
        arg0.method2158(this.field2498);
        arg0.method2158(this.field2480 ? 1 : 0);
        arg0.method2159(this.field2496);
        arg0.method2158(this.field2501);
        arg0.method2160(this.field2502);
        arg0.method2159(this.field2493);
        arg0.method2164(this.field2504);
        arg0.method2164(this.field2505);
        arg0.method2164(this.field2506);
        arg0.method2164(this.field2507);
        arg0.method2158(this.field2486);
        arg0.method2159(this.field2508);
        arg0.method2164(this.field2512);
        arg0.method2164(this.field2513);
        arg0.method2158(this.field2510);
        arg0.method2158(this.field2482);
        for (int var2 = 0; var2 < this.field2514.length; var2++) {
            arg0.method2174(this.field2514[var2]);
        }
        arg0.method2174(this.field2499);
    }

    @ObfuscatedName("ef.p(B)I")
    public int method2801() {
        byte var1 = 38;
        String var3 = this.field2504;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2505;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2506;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2507;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2512;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2513;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
