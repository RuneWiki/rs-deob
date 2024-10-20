package deob;

@ObfuscatedName("es")
public class class152 extends class179 {

    @ObfuscatedName("es.a")
    public int field2477;

    @ObfuscatedName("es.q")
    public boolean field2478;

    @ObfuscatedName("es.z")
    public int field2490;

    @ObfuscatedName("es.y")
    public int field2486;

    @ObfuscatedName("es.aw")
    public int field2487;

    @ObfuscatedName("es.ai")
    public int field2485;

    @ObfuscatedName("es.ah")
    public int field2476;

    @ObfuscatedName("es.ad")
    public boolean field2474;

    @ObfuscatedName("es.ak")
    public int field2491;

    @ObfuscatedName("es.al")
    public int field2502;

    @ObfuscatedName("es.ab")
    public int field2493;

    @ObfuscatedName("es.ax")
    public int field2507;

    @ObfuscatedName("es.az")
    public String field2484;

    @ObfuscatedName("es.at")
    public String field2496;

    @ObfuscatedName("es.as")
    public String field2497;

    @ObfuscatedName("es.aj")
    public String field2492;

    @ObfuscatedName("es.aa")
    public int field2499;

    @ObfuscatedName("es.au")
    public int field2500;

    @ObfuscatedName("es.ae")
    public int field2479;

    @ObfuscatedName("es.ao")
    public int field2495;

    @ObfuscatedName("es.af")
    public String field2503;

    @ObfuscatedName("es.ar")
    public String field2504;

    @ObfuscatedName("es.ay")
    public int[] field2505 = new int[3];

    @ObfuscatedName("es.av")
    public int field2506;

    public class152(boolean arg0) {
        if (arg0) {
            if (Statics.field112.startsWith("win")) {
                this.field2477 = 1;
            } else if (Statics.field112.startsWith("mac")) {
                this.field2477 = 2;
            } else if (Statics.field112.startsWith("linux")) {
                this.field2477 = 3;
            } else {
                this.field2477 = 4;
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
                this.field2478 = true;
            } else {
                this.field2478 = false;
            }
            if (this.field2477 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2490 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2490 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2490 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2490 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2490 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2490 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2490 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2490 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2490 = 9;
                }
            } else if (this.field2477 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2490 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2490 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2490 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2490 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2486 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2486 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2486 = 4;
            } else {
                this.field2486 = 3;
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
            this.field2487 = var10;
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
            this.field2485 = var14;
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
            this.field2476 = var18;
            this.field2474 = false;
            this.field2491 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2487 > 3) {
                this.field2502 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2502 = 0;
            }
            this.field2493 = 0;
        }
        if (this.field2484 == null) {
            this.field2484 = "";
        }
        if (this.field2496 == null) {
            this.field2496 = "";
        }
        if (this.field2497 == null) {
            this.field2497 = "";
        }
        if (this.field2492 == null) {
            this.field2492 = "";
        }
        if (this.field2503 == null) {
            this.field2503 = "";
        }
        if (this.field2504 == null) {
            this.field2504 = "";
        }
        this.method3010();
    }

    @ObfuscatedName("es.j(I)V")
    public void method3010() {
        if (this.field2484.length() > 40) {
            this.field2484 = this.field2484.substring(0, 40);
        }
        if (this.field2496.length() > 40) {
            this.field2496 = this.field2496.substring(0, 40);
        }
        if (this.field2497.length() > 10) {
            this.field2497 = this.field2497.substring(0, 10);
        }
        if (this.field2492.length() > 10) {
            this.field2492 = this.field2492.substring(0, 10);
        }
    }

    @ObfuscatedName("es.f(Ldq;I)V")
    public void method3014(class127 arg0) {
        arg0.method2450(6);
        arg0.method2450(this.field2477);
        arg0.method2450(this.field2478 ? 1 : 0);
        arg0.method2450(this.field2490);
        arg0.method2450(this.field2486);
        arg0.method2450(this.field2487);
        arg0.method2450(this.field2485);
        arg0.method2450(this.field2476);
        arg0.method2450(this.field2474 ? 1 : 0);
        arg0.method2593(this.field2491);
        arg0.method2450(this.field2502);
        arg0.method2452(this.field2493);
        arg0.method2593(this.field2507);
        arg0.method2456(this.field2484);
        arg0.method2456(this.field2496);
        arg0.method2456(this.field2497);
        arg0.method2456(this.field2492);
        arg0.method2450(this.field2500);
        arg0.method2593(this.field2499);
        arg0.method2456(this.field2503);
        arg0.method2456(this.field2504);
        arg0.method2450(this.field2479);
        arg0.method2450(this.field2495);
        for (int var2 = 0; var2 < this.field2505.length; var2++) {
            arg0.method2453(this.field2505[var2]);
        }
        arg0.method2453(this.field2506);
    }

    @ObfuscatedName("es.o(I)I")
    public int method3012() {
        byte var1 = 38;
        int var2 = var1 + class127.method56(this.field2484);
        int var3 = var2 + class127.method56(this.field2496);
        int var4 = var3 + class127.method56(this.field2497);
        int var5 = var4 + class127.method56(this.field2492);
        int var6 = var5 + class127.method56(this.field2503);
        return var6 + class127.method56(this.field2504);
    }
}
