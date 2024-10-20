package deob;

@ObfuscatedName("ed")
public class class151 extends class179 {

    @ObfuscatedName("ed.v")
    public int field2478;

    @ObfuscatedName("ed.g")
    public boolean field2475;

    @ObfuscatedName("ed.h")
    public int field2487;

    @ObfuscatedName("ed.z")
    public int field2482;

    @ObfuscatedName("ed.at")
    public int field2485;

    @ObfuscatedName("ed.ay")
    public int field2481;

    @ObfuscatedName("ed.ae")
    public int field2505;

    @ObfuscatedName("ed.af")
    public boolean field2486;

    @ObfuscatedName("ed.ao")
    public int field2479;

    @ObfuscatedName("ed.aj")
    public int field2488;

    @ObfuscatedName("ed.aq")
    public int field2495;

    @ObfuscatedName("ed.ar")
    public int field2490;

    @ObfuscatedName("ed.aa")
    public String field2491;

    @ObfuscatedName("ed.an")
    public String field2492;

    @ObfuscatedName("ed.ab")
    public String field2493;

    @ObfuscatedName("ed.ai")
    public String field2484;

    @ObfuscatedName("ed.ac")
    public int field2480;

    @ObfuscatedName("ed.ak")
    public int field2496;

    @ObfuscatedName("ed.au")
    public int field2497;

    @ObfuscatedName("ed.am")
    public int field2498;

    @ObfuscatedName("ed.ag")
    public String field2499;

    @ObfuscatedName("ed.al")
    public String field2500;

    @ObfuscatedName("ed.av")
    public int[] field2501 = new int[3];

    @ObfuscatedName("ed.aw")
    public int field2502;

    public class151(boolean arg0) {
        if (arg0) {
            if (Statics.field267.startsWith("win")) {
                this.field2478 = 1;
            } else if (Statics.field267.startsWith("mac")) {
                this.field2478 = 2;
            } else if (Statics.field267.startsWith("linux")) {
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
                this.field2475 = true;
            } else {
                this.field2475 = false;
            }
            if (this.field2478 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2487 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2487 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2487 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2487 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2487 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2487 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2487 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2487 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2487 = 9;
                }
            } else if (this.field2478 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2487 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2487 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2487 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2487 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2482 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2482 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2482 = 4;
            } else {
                this.field2482 = 3;
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
            this.field2485 = var10;
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
            this.field2481 = var14;
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
            this.field2505 = var18;
            this.field2486 = false;
            this.field2479 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2485 > 3) {
                this.field2488 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2488 = 0;
            }
            this.field2495 = 0;
        }
        if (this.field2491 == null) {
            this.field2491 = "";
        }
        if (this.field2492 == null) {
            this.field2492 = "";
        }
        if (this.field2493 == null) {
            this.field2493 = "";
        }
        if (this.field2484 == null) {
            this.field2484 = "";
        }
        if (this.field2499 == null) {
            this.field2499 = "";
        }
        if (this.field2500 == null) {
            this.field2500 = "";
        }
        this.method2985();
    }

    @ObfuscatedName("ed.p(I)V")
    public void method2985() {
        if (this.field2491.length() > 40) {
            this.field2491 = this.field2491.substring(0, 40);
        }
        if (this.field2492.length() > 40) {
            this.field2492 = this.field2492.substring(0, 40);
        }
        if (this.field2493.length() > 10) {
            this.field2493 = this.field2493.substring(0, 10);
        }
        if (this.field2484.length() > 10) {
            this.field2484 = this.field2484.substring(0, 10);
        }
    }

    @ObfuscatedName("ed.i(Ldt;B)V")
    public void method2986(class127 arg0) {
        arg0.method2474(6);
        arg0.method2474(this.field2478);
        arg0.method2474(this.field2475 ? 1 : 0);
        arg0.method2474(this.field2487);
        arg0.method2474(this.field2482);
        arg0.method2474(this.field2485);
        arg0.method2474(this.field2481);
        arg0.method2474(this.field2505);
        arg0.method2474(this.field2486 ? 1 : 0);
        arg0.method2475(this.field2479);
        arg0.method2474(this.field2488);
        arg0.method2476(this.field2495);
        arg0.method2475(this.field2490);
        arg0.method2480(this.field2491);
        arg0.method2480(this.field2492);
        arg0.method2480(this.field2493);
        arg0.method2480(this.field2484);
        arg0.method2474(this.field2496);
        arg0.method2475(this.field2480);
        arg0.method2480(this.field2499);
        arg0.method2480(this.field2500);
        arg0.method2474(this.field2497);
        arg0.method2474(this.field2498);
        for (int var2 = 0; var2 < this.field2501.length; var2++) {
            arg0.method2606(this.field2501[var2]);
        }
        arg0.method2606(this.field2502);
    }

    @ObfuscatedName("ed.o(I)I")
    public int method2987() {
        byte var1 = 38;
        String var3 = this.field2491;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2492;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2493;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2484;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2499;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2500;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
