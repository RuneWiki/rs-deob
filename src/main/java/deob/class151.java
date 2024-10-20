package deob;

@ObfuscatedName("eh")
public class class151 extends class179 {

    @ObfuscatedName("eh.b")
    public int field2478;

    @ObfuscatedName("eh.u")
    public boolean field2479;

    @ObfuscatedName("eh.t")
    public int field2485;

    @ObfuscatedName("eh.c")
    public int field2510;

    @ObfuscatedName("eh.az")
    public int field2501;

    @ObfuscatedName("eh.ax")
    public int field2477;

    @ObfuscatedName("eh.aq")
    public int field2489;

    @ObfuscatedName("eh.ap")
    public boolean field2490;

    @ObfuscatedName("eh.aa")
    public int field2492;

    @ObfuscatedName("eh.ar")
    public int field2473;

    @ObfuscatedName("eh.as")
    public int field2494;

    @ObfuscatedName("eh.ak")
    public int field2495;

    @ObfuscatedName("eh.al")
    public String field2496;

    @ObfuscatedName("eh.am")
    public String field2497;

    @ObfuscatedName("eh.ao")
    public String field2498;

    @ObfuscatedName("eh.ah")
    public String field2499;

    @ObfuscatedName("eh.aw")
    public int field2500;

    @ObfuscatedName("eh.av")
    public int field2491;

    @ObfuscatedName("eh.au")
    public int field2487;

    @ObfuscatedName("eh.af")
    public int field2503;

    @ObfuscatedName("eh.ab")
    public String field2504;

    @ObfuscatedName("eh.aj")
    public String field2505;

    @ObfuscatedName("eh.ac")
    public int[] field2506 = new int[3];

    @ObfuscatedName("eh.ay")
    public int field2507;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field87.startsWith("win")) {
                this.field2478 = 1;
            } else if (Statics.field87.startsWith("mac")) {
                this.field2478 = 2;
            } else if (Statics.field87.startsWith("linux")) {
                this.field2478 = 3;
            } else {
                this.field2478 = 4;
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
                this.field2479 = true;
            } else {
                this.field2479 = false;
            }
            if (this.field2478 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2485 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2485 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2485 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2485 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2485 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2485 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2485 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2485 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2485 = 9;
                }
            } else if (this.field2478 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2485 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2485 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2485 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2485 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2510 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2510 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2510 = 4;
            } else {
                this.field2510 = 3;
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
            this.field2477 = var14;
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
            this.field2489 = var18;
            this.field2490 = false;
            this.field2492 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2501 > 3) {
                this.field2473 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2473 = 0;
            }
            this.field2494 = 0;
        }
        if (this.field2496 == null) {
            this.field2496 = "";
        }
        if (this.field2497 == null) {
            this.field2497 = "";
        }
        if (this.field2498 == null) {
            this.field2498 = "";
        }
        if (this.field2499 == null) {
            this.field2499 = "";
        }
        if (this.field2504 == null) {
            this.field2504 = "";
        }
        if (this.field2505 == null) {
            this.field2505 = "";
        }
        this.method2919();
    }

    @ObfuscatedName("eh.i(I)V")
    public void method2919() {
        if (this.field2496.length() > 40) {
            this.field2496 = this.field2496.substring(0, 40);
        }
        if (this.field2497.length() > 40) {
            this.field2497 = this.field2497.substring(0, 40);
        }
        if (this.field2498.length() > 10) {
            this.field2498 = this.field2498.substring(0, 10);
        }
        if (this.field2499.length() > 10) {
            this.field2499 = this.field2499.substring(0, 10);
        }
    }

    @ObfuscatedName("eh.p(Ldn;B)V")
    public void method2923(class127 arg0) {
        arg0.method2397(6);
        arg0.method2397(this.field2478);
        arg0.method2397(this.field2479 ? 1 : 0);
        arg0.method2397(this.field2485);
        arg0.method2397(this.field2510);
        arg0.method2397(this.field2501);
        arg0.method2397(this.field2477);
        arg0.method2397(this.field2489);
        arg0.method2397(this.field2490 ? 1 : 0);
        arg0.method2398(this.field2492);
        arg0.method2397(this.field2473);
        arg0.method2399(this.field2494);
        arg0.method2398(this.field2495);
        arg0.method2497(this.field2496);
        arg0.method2497(this.field2497);
        arg0.method2497(this.field2498);
        arg0.method2497(this.field2499);
        arg0.method2397(this.field2491);
        arg0.method2398(this.field2500);
        arg0.method2497(this.field2504);
        arg0.method2497(this.field2505);
        arg0.method2397(this.field2487);
        arg0.method2397(this.field2503);
        for (int var2 = 0; var2 < this.field2506.length; var2++) {
            arg0.method2400(this.field2506[var2]);
        }
        arg0.method2400(this.field2507);
    }

    @ObfuscatedName("eh.a(B)I")
    public int method2925() {
        byte var1 = 38;
        String var3 = this.field2496;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2497;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2498;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2499;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2504;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2505;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
