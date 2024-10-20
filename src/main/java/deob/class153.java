package deob;

@ObfuscatedName("ep")
public class class153 extends class180 {

    @ObfuscatedName("ep.k")
    public int field2488;

    @ObfuscatedName("ep.z")
    public boolean field2489;

    @ObfuscatedName("ep.i")
    public int field2492;

    @ObfuscatedName("ep.x")
    public int field2494;

    @ObfuscatedName("ep.ar")
    public int field2495;

    @ObfuscatedName("ep.au")
    public int field2496;

    @ObfuscatedName("ep.an")
    public int field2497;

    @ObfuscatedName("ep.ad")
    public boolean field2498;

    @ObfuscatedName("ep.at")
    public int field2508;

    @ObfuscatedName("ep.ac")
    public int field2500;

    @ObfuscatedName("ep.ae")
    public int field2485;

    @ObfuscatedName("ep.ah")
    public int field2502;

    @ObfuscatedName("ep.aq")
    public String field2514;

    @ObfuscatedName("ep.ax")
    public String field2504;

    @ObfuscatedName("ep.am")
    public String field2505;

    @ObfuscatedName("ep.af")
    public String field2506;

    @ObfuscatedName("ep.ao")
    public int field2507;

    @ObfuscatedName("ep.ab")
    public int field2509;

    @ObfuscatedName("ep.aj")
    public int field2503;

    @ObfuscatedName("ep.ag")
    public int field2511;

    @ObfuscatedName("ep.aw")
    public String field2484;

    @ObfuscatedName("ep.az")
    public String field2512;

    @ObfuscatedName("ep.al")
    public int[] field2513 = new int[3];

    @ObfuscatedName("ep.as")
    public int field2499;

    public class153(boolean arg0) {
        if (arg0) {
            if (Statics.field1505.startsWith("win")) {
                this.field2488 = 1;
            } else if (Statics.field1505.startsWith("mac")) {
                this.field2488 = 2;
            } else if (Statics.field1505.startsWith("linux")) {
                this.field2488 = 3;
            } else {
                this.field2488 = 4;
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
                this.field2489 = true;
            } else {
                this.field2489 = false;
            }
            if (this.field2488 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2492 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2492 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2492 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2492 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2492 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2492 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2492 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2492 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2492 = 9;
                }
            } else if (this.field2488 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2492 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2492 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2492 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2492 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2494 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2494 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2494 = 4;
            } else {
                this.field2494 = 3;
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
            this.field2495 = var10;
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
            this.field2496 = var14;
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
            this.field2497 = var18;
            this.field2498 = false;
            this.field2508 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2495 > 3) {
                this.field2500 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2500 = 0;
            }
            this.field2485 = 0;
        }
        if (this.field2514 == null) {
            this.field2514 = "";
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
        if (this.field2484 == null) {
            this.field2484 = "";
        }
        if (this.field2512 == null) {
            this.field2512 = "";
        }
        this.method3017();
    }

    @ObfuscatedName("ep.l(I)V")
    public void method3017() {
        if (this.field2514.length() > 40) {
            this.field2514 = this.field2514.substring(0, 40);
        }
        if (this.field2504.length() > 40) {
            this.field2504 = this.field2504.substring(0, 40);
        }
        if (this.field2505.length() > 10) {
            this.field2505 = this.field2505.substring(0, 10);
        }
        if (this.field2506.length() > 10) {
            this.field2506 = this.field2506.substring(0, 10);
        }
    }

    @ObfuscatedName("ep.b(Ldm;B)V")
    public void method3025(class127 arg0) {
        arg0.method2493(6);
        arg0.method2493(this.field2488);
        arg0.method2493(this.field2489 ? 1 : 0);
        arg0.method2493(this.field2492);
        arg0.method2493(this.field2494);
        arg0.method2493(this.field2495);
        arg0.method2493(this.field2496);
        arg0.method2493(this.field2497);
        arg0.method2493(this.field2498 ? 1 : 0);
        arg0.method2424(this.field2508);
        arg0.method2493(this.field2500);
        arg0.method2425(this.field2485);
        arg0.method2424(this.field2502);
        arg0.method2429(this.field2514);
        arg0.method2429(this.field2504);
        arg0.method2429(this.field2505);
        arg0.method2429(this.field2506);
        arg0.method2493(this.field2509);
        arg0.method2424(this.field2507);
        arg0.method2429(this.field2484);
        arg0.method2429(this.field2512);
        arg0.method2493(this.field2503);
        arg0.method2493(this.field2511);
        for (int var2 = 0; var2 < this.field2513.length; var2++) {
            arg0.method2540(this.field2513[var2]);
        }
        arg0.method2540(this.field2499);
    }

    @ObfuscatedName("ep.o(I)I")
    public int method3020() {
        byte var1 = 38;
        String var3 = this.field2514;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2504;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2505;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2506;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2484;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2512;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
