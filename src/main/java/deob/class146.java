package deob;

@ObfuscatedName("el")
public class class146 extends class187 {

    @ObfuscatedName("el.m")
    public int field2451;

    @ObfuscatedName("el.i")
    public boolean field2454;

    @ObfuscatedName("el.x")
    public int field2437;

    @ObfuscatedName("el.u")
    public int field2439;

    @ObfuscatedName("el.ab")
    public int field2440;

    @ObfuscatedName("el.ai")
    public int field2441;

    @ObfuscatedName("el.aj")
    public int field2442;

    @ObfuscatedName("el.as")
    public boolean field2443;

    @ObfuscatedName("el.ax")
    public int field2444;

    @ObfuscatedName("el.az")
    public int field2445;

    @ObfuscatedName("el.av")
    public int field2446;

    @ObfuscatedName("el.am")
    public int field2447;

    @ObfuscatedName("el.ao")
    public String field2448;

    @ObfuscatedName("el.aq")
    public String field2435;

    @ObfuscatedName("el.ay")
    public String field2450;

    @ObfuscatedName("el.an")
    public String field2463;

    @ObfuscatedName("el.ak")
    public int field2452;

    @ObfuscatedName("el.ae")
    public int field2453;

    @ObfuscatedName("el.ad")
    public int field2434;

    @ObfuscatedName("el.aw")
    public int field2433;

    @ObfuscatedName("el.ah")
    public String field2455;

    @ObfuscatedName("el.at")
    public String field2457;

    @ObfuscatedName("el.aa")
    public int[] field2458 = new int[3];

    @ObfuscatedName("el.ar")
    public int field2459;

    public class146(boolean arg0) {
        if (arg0) {
            if (Statics.field1955.startsWith("win")) {
                this.field2451 = 1;
            } else if (Statics.field1955.startsWith("mac")) {
                this.field2451 = 2;
            } else if (Statics.field1955.startsWith("linux")) {
                this.field2451 = 3;
            } else {
                this.field2451 = 4;
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
                this.field2454 = true;
            } else {
                this.field2454 = false;
            }
            if (this.field2451 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2437 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2437 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2437 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2437 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2437 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2437 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2437 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2437 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2437 = 9;
                }
            } else if (this.field2451 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2437 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2437 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2437 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2437 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2439 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2439 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2439 = 4;
            } else {
                this.field2439 = 3;
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
            this.field2440 = var10;
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
            this.field2441 = var14;
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
            this.field2442 = var18;
            this.field2443 = false;
            this.field2444 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2440 > 3) {
                this.field2445 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2445 = 0;
            }
            this.field2446 = 0;
        }
        if (this.field2448 == null) {
            this.field2448 = "";
        }
        if (this.field2435 == null) {
            this.field2435 = "";
        }
        if (this.field2450 == null) {
            this.field2450 = "";
        }
        if (this.field2463 == null) {
            this.field2463 = "";
        }
        if (this.field2455 == null) {
            this.field2455 = "";
        }
        if (this.field2457 == null) {
            this.field2457 = "";
        }
        this.method2642();
    }

    @ObfuscatedName("el.g(B)V")
    public void method2642() {
        if (this.field2448.length() > 40) {
            this.field2448 = this.field2448.substring(0, 40);
        }
        if (this.field2435.length() > 40) {
            this.field2435 = this.field2435.substring(0, 40);
        }
        if (this.field2450.length() > 10) {
            this.field2450 = this.field2450.substring(0, 10);
        }
        if (this.field2463.length() > 10) {
            this.field2463 = this.field2463.substring(0, 10);
        }
    }

    @ObfuscatedName("el.s(Lde;I)V")
    public void method2643(class107 arg0) {
        arg0.method2079(6);
        arg0.method2079(this.field2451);
        arg0.method2079(this.field2454 ? 1 : 0);
        arg0.method2079(this.field2437);
        arg0.method2079(this.field2439);
        arg0.method2079(this.field2440);
        arg0.method2079(this.field2441);
        arg0.method2079(this.field2442);
        arg0.method2079(this.field2443 ? 1 : 0);
        arg0.method2177(this.field2444);
        arg0.method2079(this.field2445);
        arg0.method2261(this.field2446);
        arg0.method2177(this.field2447);
        arg0.method2085(this.field2448);
        arg0.method2085(this.field2435);
        arg0.method2085(this.field2450);
        arg0.method2085(this.field2463);
        arg0.method2079(this.field2453);
        arg0.method2177(this.field2452);
        arg0.method2085(this.field2455);
        arg0.method2085(this.field2457);
        arg0.method2079(this.field2434);
        arg0.method2079(this.field2433);
        for (int var2 = 0; var2 < this.field2458.length; var2++) {
            arg0.method2082(this.field2458[var2]);
        }
        arg0.method2082(this.field2459);
    }

    @ObfuscatedName("el.v(I)I")
    public int method2646() {
        byte var1 = 38;
        int var2 = var1 + class107.method121(this.field2448);
        int var3 = var2 + class107.method121(this.field2435);
        int var4 = var3 + class107.method121(this.field2450);
        int var5 = var4 + class107.method121(this.field2463);
        int var6 = var5 + class107.method121(this.field2455);
        return var6 + class107.method121(this.field2457);
    }
}
