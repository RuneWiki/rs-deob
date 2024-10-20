package deob;

@ObfuscatedName("em")
public class class151 extends class199 {

    @ObfuscatedName("em.r")
    public int field2519;

    @ObfuscatedName("em.v")
    public boolean field2496;

    @ObfuscatedName("em.b")
    public int field2499;

    @ObfuscatedName("em.ay")
    public int field2506;

    @ObfuscatedName("em.ac")
    public int field2498;

    @ObfuscatedName("em.ao")
    public int field2518;

    @ObfuscatedName("em.ab")
    public int field2504;

    @ObfuscatedName("em.at")
    public boolean field2505;

    @ObfuscatedName("em.ai")
    public int field2502;

    @ObfuscatedName("em.ap")
    public int field2503;

    @ObfuscatedName("em.aw")
    public int field2511;

    @ObfuscatedName("em.ax")
    public int field2510;

    @ObfuscatedName("em.az")
    public String field2495;

    @ObfuscatedName("em.af")
    public String field2512;

    @ObfuscatedName("em.al")
    public String field2508;

    @ObfuscatedName("em.ak")
    public String field2514;

    @ObfuscatedName("em.as")
    public int field2515;

    @ObfuscatedName("em.ag")
    public int field2513;

    @ObfuscatedName("em.an")
    public int field2517;

    @ObfuscatedName("em.au")
    public int field2507;

    @ObfuscatedName("em.am")
    public String field2493;

    @ObfuscatedName("em.aj")
    public String field2520;

    @ObfuscatedName("em.ah")
    public int[] field2516 = new int[3];

    @ObfuscatedName("em.ba")
    public int field2522;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field1278.startsWith("win")) {
                this.field2519 = 1;
            } else if (Statics.field1278.startsWith("mac")) {
                this.field2519 = 2;
            } else if (Statics.field1278.startsWith("linux")) {
                this.field2519 = 3;
            } else {
                this.field2519 = 4;
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
            if (this.field2519 == 1) {
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
            } else if (this.field2519 == 2) {
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
                this.field2506 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2506 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2506 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2506 = 4;
            } else {
                this.field2506 = 5;
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
            this.field2498 = var10;
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
            this.field2518 = var14;
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
            this.field2504 = var18;
            this.field2505 = false;
            this.field2502 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2498 > 3) {
                this.field2503 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2503 = 0;
            }
            this.field2511 = 0;
        }
        if (this.field2495 == null) {
            this.field2495 = "";
        }
        if (this.field2512 == null) {
            this.field2512 = "";
        }
        if (this.field2508 == null) {
            this.field2508 = "";
        }
        if (this.field2514 == null) {
            this.field2514 = "";
        }
        if (this.field2493 == null) {
            this.field2493 = "";
        }
        if (this.field2520 == null) {
            this.field2520 = "";
        }
        this.method2860();
    }

    @ObfuscatedName("em.o(B)V")
    public void method2860() {
        if (this.field2495.length() > 40) {
            this.field2495 = this.field2495.substring(0, 40);
        }
        if (this.field2512.length() > 40) {
            this.field2512 = this.field2512.substring(0, 40);
        }
        if (this.field2508.length() > 10) {
            this.field2508 = this.field2508.substring(0, 10);
        }
        if (this.field2514.length() > 10) {
            this.field2514 = this.field2514.substring(0, 10);
        }
    }

    @ObfuscatedName("em.l(Ldk;I)V")
    public void method2861(class111 arg0) {
        arg0.method2204(6);
        arg0.method2204(this.field2519);
        arg0.method2204(this.field2496 ? 1 : 0);
        arg0.method2204(this.field2499);
        arg0.method2204(this.field2506);
        arg0.method2204(this.field2498);
        arg0.method2204(this.field2518);
        arg0.method2204(this.field2504);
        arg0.method2204(this.field2505 ? 1 : 0);
        arg0.method2205(this.field2502);
        arg0.method2204(this.field2503);
        arg0.method2206(this.field2511);
        arg0.method2205(this.field2510);
        arg0.method2211(this.field2495);
        arg0.method2211(this.field2512);
        arg0.method2211(this.field2508);
        arg0.method2211(this.field2514);
        arg0.method2204(this.field2513);
        arg0.method2205(this.field2515);
        arg0.method2211(this.field2493);
        arg0.method2211(this.field2520);
        arg0.method2204(this.field2517);
        arg0.method2204(this.field2507);
        for (int var2 = 0; var2 < this.field2516.length; var2++) {
            arg0.method2369(this.field2516[var2]);
        }
        arg0.method2369(this.field2522);
    }

    @ObfuscatedName("em.g(B)I")
    public int method2862() {
        byte var1 = 38;
        String var3 = this.field2495;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2512;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2508;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2514;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2493;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2520;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
