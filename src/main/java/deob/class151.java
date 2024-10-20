package deob;

@ObfuscatedName("ex")
public class class151 extends class199 {

    @ObfuscatedName("ex.q")
    public int field2505;

    @ObfuscatedName("ex.l")
    public boolean field2512;

    @ObfuscatedName("ex.j")
    public int field2527;

    @ObfuscatedName("ex.as")
    public int field2536;

    @ObfuscatedName("ex.ad")
    public int field2520;

    @ObfuscatedName("ex.ap")
    public int field2517;

    @ObfuscatedName("ex.an")
    public int field2518;

    @ObfuscatedName("ex.au")
    public boolean field2519;

    @ObfuscatedName("ex.aw")
    public int field2534;

    @ObfuscatedName("ex.ah")
    public int field2509;

    @ObfuscatedName("ex.ac")
    public int field2522;

    @ObfuscatedName("ex.af")
    public int field2523;

    @ObfuscatedName("ex.ab")
    public String field2524;

    @ObfuscatedName("ex.ai")
    public String field2525;

    @ObfuscatedName("ex.ay")
    public String field2533;

    @ObfuscatedName("ex.ak")
    public String field2502;

    @ObfuscatedName("ex.aj")
    public int field2528;

    @ObfuscatedName("ex.az")
    public int field2521;

    @ObfuscatedName("ex.am")
    public int field2530;

    @ObfuscatedName("ex.ax")
    public int field2531;

    @ObfuscatedName("ex.al")
    public String field2506;

    @ObfuscatedName("ex.aa")
    public String field2532;

    @ObfuscatedName("ex.ae")
    public int[] field2529 = new int[3];

    @ObfuscatedName("ex.bj")
    public int field2535;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field3045.startsWith("win")) {
                this.field2505 = 1;
            } else if (Statics.field3045.startsWith("mac")) {
                this.field2505 = 2;
            } else if (Statics.field3045.startsWith("linux")) {
                this.field2505 = 3;
            } else {
                this.field2505 = 4;
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
                this.field2512 = true;
            } else {
                this.field2512 = false;
            }
            if (this.field2505 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2527 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2527 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2527 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2527 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2527 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2527 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2527 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2527 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2527 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2527 = 10;
                }
            } else if (this.field2505 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2527 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2527 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2527 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2527 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2527 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2527 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2527 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2536 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2536 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2536 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2536 = 4;
            } else {
                this.field2536 = 5;
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
            this.field2517 = var14;
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
            this.field2519 = false;
            this.field2534 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2520 > 3) {
                this.field2509 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2509 = 0;
            }
            this.field2522 = 0;
        }
        if (this.field2524 == null) {
            this.field2524 = "";
        }
        if (this.field2525 == null) {
            this.field2525 = "";
        }
        if (this.field2533 == null) {
            this.field2533 = "";
        }
        if (this.field2502 == null) {
            this.field2502 = "";
        }
        if (this.field2506 == null) {
            this.field2506 = "";
        }
        if (this.field2532 == null) {
            this.field2532 = "";
        }
        this.method2794();
    }

    @ObfuscatedName("ex.n(I)V")
    public void method2794() {
        if (this.field2524.length() > 40) {
            this.field2524 = this.field2524.substring(0, 40);
        }
        if (this.field2525.length() > 40) {
            this.field2525 = this.field2525.substring(0, 40);
        }
        if (this.field2533.length() > 10) {
            this.field2533 = this.field2533.substring(0, 10);
        }
        if (this.field2502.length() > 10) {
            this.field2502 = this.field2502.substring(0, 10);
        }
    }

    @ObfuscatedName("ex.w(Ldo;I)V")
    public void method2790(class111 arg0) {
        arg0.method2140(6);
        arg0.method2140(this.field2505);
        arg0.method2140(this.field2512 ? 1 : 0);
        arg0.method2140(this.field2527);
        arg0.method2140(this.field2536);
        arg0.method2140(this.field2520);
        arg0.method2140(this.field2517);
        arg0.method2140(this.field2518);
        arg0.method2140(this.field2519 ? 1 : 0);
        arg0.method2322(this.field2534);
        arg0.method2140(this.field2509);
        arg0.method2273(this.field2522);
        arg0.method2322(this.field2523);
        arg0.method2147(this.field2524);
        arg0.method2147(this.field2525);
        arg0.method2147(this.field2533);
        arg0.method2147(this.field2502);
        arg0.method2140(this.field2521);
        arg0.method2322(this.field2528);
        arg0.method2147(this.field2506);
        arg0.method2147(this.field2532);
        arg0.method2140(this.field2530);
        arg0.method2140(this.field2531);
        for (int var2 = 0; var2 < this.field2529.length; var2++) {
            arg0.method2143(this.field2529[var2]);
        }
        arg0.method2143(this.field2535);
    }

    @ObfuscatedName("ex.i(B)I")
    public int method2792() {
        byte var1 = 38;
        String var3 = this.field2524;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2525;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2533;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2502;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2506;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2532;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
