package deob;

@ObfuscatedName("fg")
public class class160 extends class208 {

    @ObfuscatedName("fg.c")
    public int field2584;

    @ObfuscatedName("fg.a")
    public boolean field2585;

    @ObfuscatedName("fg.t")
    public int field2608;

    @ObfuscatedName("fg.ab")
    public int field2580;

    @ObfuscatedName("fg.ae")
    public int field2590;

    @ObfuscatedName("fg.aw")
    public int field2593;

    @ObfuscatedName("fg.aj")
    public int field2594;

    @ObfuscatedName("fg.ay")
    public boolean field2583;

    @ObfuscatedName("fg.af")
    public int field2581;

    @ObfuscatedName("fg.aq")
    public int field2601;

    @ObfuscatedName("fg.az")
    public int field2599;

    @ObfuscatedName("fg.ar")
    public int field2600;

    @ObfuscatedName("fg.as")
    public String field2592;

    @ObfuscatedName("fg.am")
    public String field2602;

    @ObfuscatedName("fg.an")
    public String field2603;

    @ObfuscatedName("fg.au")
    public String field2586;

    @ObfuscatedName("fg.av")
    public int field2605;

    @ObfuscatedName("fg.ac")
    public int field2598;

    @ObfuscatedName("fg.ap")
    public int field2607;

    @ObfuscatedName("fg.ad")
    public int field2595;

    @ObfuscatedName("fg.ag")
    public String field2609;

    @ObfuscatedName("fg.ax")
    public String field2610;

    @ObfuscatedName("fg.at")
    public int[] field2611 = new int[3];

    @ObfuscatedName("fg.bm")
    public int field2612;

    public class160(boolean arg0) {
        if (arg0) {
            if (Statics.field3011.startsWith("win")) {
                this.field2584 = 1;
            } else if (Statics.field3011.startsWith("mac")) {
                this.field2584 = 2;
            } else if (Statics.field3011.startsWith("linux")) {
                this.field2584 = 3;
            } else {
                this.field2584 = 4;
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
                this.field2585 = true;
            } else {
                this.field2585 = false;
            }
            if (this.field2584 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2608 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2608 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2608 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2608 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2608 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2608 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2608 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2608 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2608 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2608 = 10;
                }
            } else if (this.field2584 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2608 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2608 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2608 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2608 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2608 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2608 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2608 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2580 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2580 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2580 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2580 = 4;
            } else {
                this.field2580 = 5;
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
            this.field2590 = var10;
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
            this.field2593 = var14;
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
            this.field2594 = var18;
            this.field2583 = false;
            this.field2581 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2590 > 3) {
                this.field2601 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2601 = 0;
            }
            this.field2599 = 0;
        }
        if (this.field2592 == null) {
            this.field2592 = "";
        }
        if (this.field2602 == null) {
            this.field2602 = "";
        }
        if (this.field2603 == null) {
            this.field2603 = "";
        }
        if (this.field2586 == null) {
            this.field2586 = "";
        }
        if (this.field2609 == null) {
            this.field2609 = "";
        }
        if (this.field2610 == null) {
            this.field2610 = "";
        }
        this.method2924();
    }

    @ObfuscatedName("fg.y(I)V")
    public void method2924() {
        if (this.field2592.length() > 40) {
            this.field2592 = this.field2592.substring(0, 40);
        }
        if (this.field2602.length() > 40) {
            this.field2602 = this.field2602.substring(0, 40);
        }
        if (this.field2603.length() > 10) {
            this.field2603 = this.field2603.substring(0, 10);
        }
        if (this.field2586.length() > 10) {
            this.field2586 = this.field2586.substring(0, 10);
        }
    }

    @ObfuscatedName("fg.d(Ldd;I)V")
    public void method2918(class119 arg0) {
        arg0.method2354(6);
        arg0.method2354(this.field2584);
        arg0.method2354(this.field2585 ? 1 : 0);
        arg0.method2354(this.field2608);
        arg0.method2354(this.field2580);
        arg0.method2354(this.field2590);
        arg0.method2354(this.field2593);
        arg0.method2354(this.field2594);
        arg0.method2354(this.field2583 ? 1 : 0);
        arg0.method2312(this.field2581);
        arg0.method2354(this.field2601);
        arg0.method2494(this.field2599);
        arg0.method2312(this.field2600);
        arg0.method2318(this.field2592);
        arg0.method2318(this.field2602);
        arg0.method2318(this.field2603);
        arg0.method2318(this.field2586);
        arg0.method2354(this.field2598);
        arg0.method2312(this.field2605);
        arg0.method2318(this.field2609);
        arg0.method2318(this.field2610);
        arg0.method2354(this.field2607);
        arg0.method2354(this.field2595);
        for (int var2 = 0; var2 < this.field2611.length; var2++) {
            arg0.method2423(this.field2611[var2]);
        }
        arg0.method2423(this.field2612);
    }

    @ObfuscatedName("fg.g(B)I")
    public int method2917() {
        byte var1 = 38;
        int var2 = var1 + class119.method861(this.field2592);
        int var3 = var2 + class119.method861(this.field2602);
        int var4 = var3 + class119.method861(this.field2603);
        int var5 = var4 + class119.method861(this.field2586);
        int var6 = var5 + class119.method861(this.field2609);
        return var6 + class119.method861(this.field2610);
    }
}
