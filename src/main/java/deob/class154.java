package deob;

@ObfuscatedName("ey")
public class class154 extends class202 {

    @ObfuscatedName("ey.d")
    public int field2526;

    @ObfuscatedName("ey.f")
    public boolean field2544;

    @ObfuscatedName("ey.b")
    public int field2531;

    @ObfuscatedName("ey.an")
    public int field2533;

    @ObfuscatedName("ey.ad")
    public int field2538;

    @ObfuscatedName("ey.ap")
    public int field2553;

    @ObfuscatedName("ey.ag")
    public int field2536;

    @ObfuscatedName("ey.aj")
    public boolean field2537;

    @ObfuscatedName("ey.av")
    public int field2535;

    @ObfuscatedName("ey.ab")
    public int field2539;

    @ObfuscatedName("ey.ae")
    public int field2540;

    @ObfuscatedName("ey.ax")
    public int field2554;

    @ObfuscatedName("ey.aw")
    public String field2542;

    @ObfuscatedName("ey.ac")
    public String field2543;

    @ObfuscatedName("ey.al")
    public String field2550;

    @ObfuscatedName("ey.az")
    public String field2545;

    @ObfuscatedName("ey.as")
    public int field2541;

    @ObfuscatedName("ey.am")
    public int field2534;

    @ObfuscatedName("ey.ay")
    public int field2528;

    @ObfuscatedName("ey.ao")
    public int field2549;

    @ObfuscatedName("ey.aq")
    public String field2523;

    @ObfuscatedName("ey.af")
    public String field2551;

    @ObfuscatedName("ey.ah")
    public int[] field2552 = new int[3];

    @ObfuscatedName("ey.bz")
    public int field2527;

    public class154(boolean arg0) {
        if (arg0) {
            if (Statics.field1356.startsWith("win")) {
                this.field2526 = 1;
            } else if (Statics.field1356.startsWith("mac")) {
                this.field2526 = 2;
            } else if (Statics.field1356.startsWith("linux")) {
                this.field2526 = 3;
            } else {
                this.field2526 = 4;
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
                this.field2544 = true;
            } else {
                this.field2544 = false;
            }
            if (this.field2526 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2531 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2531 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2531 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2531 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2531 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2531 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2531 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2531 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2531 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2531 = 10;
                }
            } else if (this.field2526 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2531 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2531 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2531 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2531 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2531 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2531 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2531 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2533 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2533 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2533 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2533 = 4;
            } else {
                this.field2533 = 5;
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
            this.field2538 = var10;
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
            this.field2553 = var14;
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
            this.field2536 = var18;
            this.field2537 = false;
            this.field2535 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2538 > 3) {
                this.field2539 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2539 = 0;
            }
            this.field2540 = 0;
        }
        if (this.field2542 == null) {
            this.field2542 = "";
        }
        if (this.field2543 == null) {
            this.field2543 = "";
        }
        if (this.field2550 == null) {
            this.field2550 = "";
        }
        if (this.field2545 == null) {
            this.field2545 = "";
        }
        if (this.field2523 == null) {
            this.field2523 = "";
        }
        if (this.field2551 == null) {
            this.field2551 = "";
        }
        this.method2895();
    }

    @ObfuscatedName("ey.j(B)V")
    public void method2895() {
        if (this.field2542.length() > 40) {
            this.field2542 = this.field2542.substring(0, 40);
        }
        if (this.field2543.length() > 40) {
            this.field2543 = this.field2543.substring(0, 40);
        }
        if (this.field2550.length() > 10) {
            this.field2550 = this.field2550.substring(0, 10);
        }
        if (this.field2545.length() > 10) {
            this.field2545 = this.field2545.substring(0, 10);
        }
    }

    @ObfuscatedName("ey.y(Lde;B)V")
    public void method2898(class114 arg0) {
        arg0.method2307(6);
        arg0.method2307(this.field2526);
        arg0.method2307(this.field2544 ? 1 : 0);
        arg0.method2307(this.field2531);
        arg0.method2307(this.field2533);
        arg0.method2307(this.field2538);
        arg0.method2307(this.field2553);
        arg0.method2307(this.field2536);
        arg0.method2307(this.field2537 ? 1 : 0);
        arg0.method2367(this.field2535);
        arg0.method2307(this.field2539);
        arg0.method2309(this.field2540);
        arg0.method2367(this.field2554);
        arg0.method2464(this.field2542);
        arg0.method2464(this.field2543);
        arg0.method2464(this.field2550);
        arg0.method2464(this.field2545);
        arg0.method2307(this.field2534);
        arg0.method2367(this.field2541);
        arg0.method2464(this.field2523);
        arg0.method2464(this.field2551);
        arg0.method2307(this.field2528);
        arg0.method2307(this.field2549);
        for (int var2 = 0; var2 < this.field2552.length; var2++) {
            arg0.method2310(this.field2552[var2]);
        }
        arg0.method2310(this.field2527);
    }

    @ObfuscatedName("ey.z(I)I")
    public int method2897() {
        byte var1 = 38;
        int var2 = var1 + class114.method731(this.field2542);
        int var3 = var2 + class114.method731(this.field2543);
        int var4 = var3 + class114.method731(this.field2550);
        int var5 = var4 + class114.method731(this.field2545);
        int var6 = var5 + class114.method731(this.field2523);
        return var6 + class114.method731(this.field2551);
    }
}
