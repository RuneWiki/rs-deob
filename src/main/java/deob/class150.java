package deob;

@ObfuscatedName("ec")
public class class150 extends class191 {

    @ObfuscatedName("ec.g")
    public int field2430;

    @ObfuscatedName("ec.k")
    public boolean field2432;

    @ObfuscatedName("ec.z")
    public int field2442;

    @ObfuscatedName("ec.at")
    public int field2441;

    @ObfuscatedName("ec.ai")
    public int field2463;

    @ObfuscatedName("ec.aj")
    public int field2447;

    @ObfuscatedName("ec.aq")
    public int field2460;

    @ObfuscatedName("ec.an")
    public boolean field2445;

    @ObfuscatedName("ec.ac")
    public int field2446;

    @ObfuscatedName("ec.az")
    public int field2453;

    @ObfuscatedName("ec.al")
    public int field2431;

    @ObfuscatedName("ec.am")
    public int field2449;

    @ObfuscatedName("ec.av")
    public String field2450;

    @ObfuscatedName("ec.ar")
    public String field2451;

    @ObfuscatedName("ec.ak")
    public String field2452;

    @ObfuscatedName("ec.aw")
    public String field2457;

    @ObfuscatedName("ec.ag")
    public int field2454;

    @ObfuscatedName("ec.ay")
    public int field2439;

    @ObfuscatedName("ec.af")
    public int field2456;

    @ObfuscatedName("ec.au")
    public int field2444;

    @ObfuscatedName("ec.aa")
    public String field2437;

    @ObfuscatedName("ec.ab")
    public String field2459;

    @ObfuscatedName("ec.ae")
    public int[] field2462 = new int[3];

    @ObfuscatedName("ec.bx")
    public int field2461;

    public class150(boolean arg0) {
        if (arg0) {
            if (Statics.field2106.startsWith("win")) {
                this.field2430 = 1;
            } else if (Statics.field2106.startsWith("mac")) {
                this.field2430 = 2;
            } else if (Statics.field2106.startsWith("linux")) {
                this.field2430 = 3;
            } else {
                this.field2430 = 4;
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
                this.field2432 = true;
            } else {
                this.field2432 = false;
            }
            if (this.field2430 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2442 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2442 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2442 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2442 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2442 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2442 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2442 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2442 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2442 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2442 = 10;
                }
            } else if (this.field2430 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2442 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2442 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2442 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2442 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2442 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2442 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2442 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2441 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2441 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2441 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2441 = 4;
            } else {
                this.field2441 = 5;
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
            this.field2463 = var10;
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
            this.field2447 = var14;
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
            this.field2460 = var18;
            this.field2445 = false;
            this.field2446 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2463 > 3) {
                this.field2453 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2453 = 0;
            }
            this.field2431 = 0;
        }
        if (this.field2450 == null) {
            this.field2450 = "";
        }
        if (this.field2451 == null) {
            this.field2451 = "";
        }
        if (this.field2452 == null) {
            this.field2452 = "";
        }
        if (this.field2457 == null) {
            this.field2457 = "";
        }
        if (this.field2437 == null) {
            this.field2437 = "";
        }
        if (this.field2459 == null) {
            this.field2459 = "";
        }
        this.method2771();
    }

    @ObfuscatedName("ec.v(I)V")
    public void method2771() {
        if (this.field2450.length() > 40) {
            this.field2450 = this.field2450.substring(0, 40);
        }
        if (this.field2451.length() > 40) {
            this.field2451 = this.field2451.substring(0, 40);
        }
        if (this.field2452.length() > 10) {
            this.field2452 = this.field2452.substring(0, 10);
        }
        if (this.field2457.length() > 10) {
            this.field2457 = this.field2457.substring(0, 10);
        }
    }

    @ObfuscatedName("ec.t(Ldp;I)V")
    public void method2775(class110 arg0) {
        arg0.method2263(6);
        arg0.method2263(this.field2430);
        arg0.method2263(this.field2432 ? 1 : 0);
        arg0.method2263(this.field2442);
        arg0.method2263(this.field2441);
        arg0.method2263(this.field2463);
        arg0.method2263(this.field2447);
        arg0.method2263(this.field2460);
        arg0.method2263(this.field2445 ? 1 : 0);
        arg0.method2148(this.field2446);
        arg0.method2263(this.field2453);
        arg0.method2149(this.field2431);
        arg0.method2148(this.field2449);
        arg0.method2153(this.field2450);
        arg0.method2153(this.field2451);
        arg0.method2153(this.field2452);
        arg0.method2153(this.field2457);
        arg0.method2263(this.field2439);
        arg0.method2148(this.field2454);
        arg0.method2153(this.field2437);
        arg0.method2153(this.field2459);
        arg0.method2263(this.field2456);
        arg0.method2263(this.field2444);
        for (int var2 = 0; var2 < this.field2462.length; var2++) {
            arg0.method2260(this.field2462[var2]);
        }
        arg0.method2260(this.field2461);
    }

    @ObfuscatedName("ec.f(B)I")
    public int method2773() {
        byte var1 = 38;
        String var3 = this.field2450;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2451;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2452;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2457;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2437;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2459;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
