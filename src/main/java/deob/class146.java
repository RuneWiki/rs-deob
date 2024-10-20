package deob;

@ObfuscatedName("en")
public class class146 extends class187 {

    @ObfuscatedName("en.l")
    public int field2456;

    @ObfuscatedName("en.e")
    public boolean field2433;

    @ObfuscatedName("en.b")
    public int field2445;

    @ObfuscatedName("en.f")
    public int field2434;

    @ObfuscatedName("en.ab")
    public int field2437;

    @ObfuscatedName("en.al")
    public int field2442;

    @ObfuscatedName("en.an")
    public int field2443;

    @ObfuscatedName("en.aw")
    public boolean field2441;

    @ObfuscatedName("en.ar")
    public int field2460;

    @ObfuscatedName("en.aj")
    public int field2446;

    @ObfuscatedName("en.ap")
    public int field2447;

    @ObfuscatedName("en.as")
    public int field2448;

    @ObfuscatedName("en.au")
    public String field2461;

    @ObfuscatedName("en.ac")
    public String field2450;

    @ObfuscatedName("en.ay")
    public String field2451;

    @ObfuscatedName("en.av")
    public String field2452;

    @ObfuscatedName("en.ak")
    public int field2462;

    @ObfuscatedName("en.ae")
    public int field2449;

    @ObfuscatedName("en.at")
    public int field2438;

    @ObfuscatedName("en.az")
    public int field2454;

    @ObfuscatedName("en.ag")
    public String field2457;

    @ObfuscatedName("en.af")
    public String field2458;

    @ObfuscatedName("en.am")
    public int[] field2459 = new int[3];

    @ObfuscatedName("en.ah")
    public int field2444;

    public class146(boolean arg0) {
        if (arg0) {
            if (Statics.field2973.startsWith("win")) {
                this.field2456 = 1;
            } else if (Statics.field2973.startsWith("mac")) {
                this.field2456 = 2;
            } else if (Statics.field2973.startsWith("linux")) {
                this.field2456 = 3;
            } else {
                this.field2456 = 4;
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
                this.field2433 = true;
            } else {
                this.field2433 = false;
            }
            if (this.field2456 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2445 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2445 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2445 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2445 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2445 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2445 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2445 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2445 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2445 = 9;
                }
            } else if (this.field2456 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2445 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2445 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2445 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2445 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2434 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2434 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2434 = 4;
            } else {
                this.field2434 = 3;
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
            this.field2437 = var10;
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
            this.field2442 = var14;
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
            this.field2443 = var18;
            this.field2441 = false;
            this.field2460 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2437 > 3) {
                this.field2446 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2446 = 0;
            }
            this.field2447 = 0;
        }
        if (this.field2461 == null) {
            this.field2461 = "";
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
        if (this.field2458 == null) {
            this.field2458 = "";
        }
        this.method2717();
    }

    @ObfuscatedName("en.k(I)V")
    public void method2717() {
        if (this.field2461.length() > 40) {
            this.field2461 = this.field2461.substring(0, 40);
        }
        if (this.field2450.length() > 40) {
            this.field2450 = this.field2450.substring(0, 40);
        }
        if (this.field2451.length() > 10) {
            this.field2451 = this.field2451.substring(0, 10);
        }
        if (this.field2452.length() > 10) {
            this.field2452 = this.field2452.substring(0, 10);
        }
    }

    @ObfuscatedName("en.y(Ldy;I)V")
    public void method2715(class107 arg0) {
        arg0.method2124(6);
        arg0.method2124(this.field2456);
        arg0.method2124(this.field2433 ? 1 : 0);
        arg0.method2124(this.field2445);
        arg0.method2124(this.field2434);
        arg0.method2124(this.field2437);
        arg0.method2124(this.field2442);
        arg0.method2124(this.field2443);
        arg0.method2124(this.field2441 ? 1 : 0);
        arg0.method2132(this.field2460);
        arg0.method2124(this.field2446);
        arg0.method2126(this.field2447);
        arg0.method2132(this.field2448);
        arg0.method2130(this.field2461);
        arg0.method2130(this.field2450);
        arg0.method2130(this.field2451);
        arg0.method2130(this.field2452);
        arg0.method2124(this.field2449);
        arg0.method2132(this.field2462);
        arg0.method2130(this.field2457);
        arg0.method2130(this.field2458);
        arg0.method2124(this.field2438);
        arg0.method2124(this.field2454);
        for (int var2 = 0; var2 < this.field2459.length; var2++) {
            arg0.method2127(this.field2459[var2]);
        }
        arg0.method2127(this.field2444);
    }

    @ObfuscatedName("en.s(I)I")
    public int method2716() {
        byte var1 = 38;
        String var3 = this.field2461;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2450;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2451;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2452;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2457;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2458;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
