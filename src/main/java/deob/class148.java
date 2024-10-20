package deob;

@ObfuscatedName("eg")
public class class148 extends class189 {

    @ObfuscatedName("eg.a")
    public int field2438;

    @ObfuscatedName("eg.n")
    public boolean field2439;

    @ObfuscatedName("eg.m")
    public int field2456;

    @ObfuscatedName("eg.i")
    public int field2469;

    @ObfuscatedName("eg.ah")
    public int field2448;

    @ObfuscatedName("eg.aj")
    public int field2449;

    @ObfuscatedName("eg.ar")
    public int field2450;

    @ObfuscatedName("eg.al")
    public boolean field2451;

    @ObfuscatedName("eg.aw")
    public int field2464;

    @ObfuscatedName("eg.ax")
    public int field2453;

    @ObfuscatedName("eg.av")
    public int field2454;

    @ObfuscatedName("eg.ae")
    public int field2455;

    @ObfuscatedName("eg.ak")
    public String field2447;

    @ObfuscatedName("eg.ay")
    public String field2452;

    @ObfuscatedName("eg.at")
    public String field2458;

    @ObfuscatedName("eg.ap")
    public String field2459;

    @ObfuscatedName("eg.an")
    public int field2460;

    @ObfuscatedName("eg.ad")
    public int field2444;

    @ObfuscatedName("eg.ag")
    public int field2462;

    @ObfuscatedName("eg.am")
    public int field2436;

    @ObfuscatedName("eg.ai")
    public String field2463;

    @ObfuscatedName("eg.ab")
    public String field2437;

    @ObfuscatedName("eg.af")
    public int[] field2466 = new int[3];

    @ObfuscatedName("eg.ac")
    public int field2467;

    public class148(boolean arg0) {
        if (arg0) {
            if (Statics.field805.startsWith("win")) {
                this.field2438 = 1;
            } else if (Statics.field805.startsWith("mac")) {
                this.field2438 = 2;
            } else if (Statics.field805.startsWith("linux")) {
                this.field2438 = 3;
            } else {
                this.field2438 = 4;
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
                this.field2439 = true;
            } else {
                this.field2439 = false;
            }
            if (this.field2438 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2456 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2456 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2456 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2456 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2456 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2456 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2456 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2456 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2456 = 9;
                }
            } else if (this.field2438 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2456 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2456 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2456 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2456 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2469 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2469 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2469 = 4;
            } else {
                this.field2469 = 3;
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
            this.field2448 = var10;
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
            this.field2449 = var14;
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
            this.field2450 = var18;
            this.field2451 = false;
            this.field2464 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2448 > 3) {
                this.field2453 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2453 = 0;
            }
            this.field2454 = 0;
        }
        if (this.field2447 == null) {
            this.field2447 = "";
        }
        if (this.field2452 == null) {
            this.field2452 = "";
        }
        if (this.field2458 == null) {
            this.field2458 = "";
        }
        if (this.field2459 == null) {
            this.field2459 = "";
        }
        if (this.field2463 == null) {
            this.field2463 = "";
        }
        if (this.field2437 == null) {
            this.field2437 = "";
        }
        this.method2755();
    }

    @ObfuscatedName("eg.f(B)V")
    public void method2755() {
        if (this.field2447.length() > 40) {
            this.field2447 = this.field2447.substring(0, 40);
        }
        if (this.field2452.length() > 40) {
            this.field2452 = this.field2452.substring(0, 40);
        }
        if (this.field2458.length() > 10) {
            this.field2458 = this.field2458.substring(0, 10);
        }
        if (this.field2459.length() > 10) {
            this.field2459 = this.field2459.substring(0, 10);
        }
    }

    @ObfuscatedName("eg.k(Ldu;B)V")
    public void method2759(class108 arg0) {
        arg0.method2144(6);
        arg0.method2144(this.field2438);
        arg0.method2144(this.field2439 ? 1 : 0);
        arg0.method2144(this.field2456);
        arg0.method2144(this.field2469);
        arg0.method2144(this.field2448);
        arg0.method2144(this.field2449);
        arg0.method2144(this.field2450);
        arg0.method2144(this.field2451 ? 1 : 0);
        arg0.method2145(this.field2464);
        arg0.method2144(this.field2453);
        arg0.method2146(this.field2454);
        arg0.method2145(this.field2455);
        arg0.method2150(this.field2447);
        arg0.method2150(this.field2452);
        arg0.method2150(this.field2458);
        arg0.method2150(this.field2459);
        arg0.method2144(this.field2444);
        arg0.method2145(this.field2460);
        arg0.method2150(this.field2463);
        arg0.method2150(this.field2437);
        arg0.method2144(this.field2462);
        arg0.method2144(this.field2436);
        for (int var2 = 0; var2 < this.field2466.length; var2++) {
            arg0.method2147(this.field2466[var2]);
        }
        arg0.method2147(this.field2467);
    }

    @ObfuscatedName("eg.y(I)I")
    public int method2754() {
        byte var1 = 38;
        String var3 = this.field2447;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2452;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2458;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2459;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2463;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2437;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
