package deob;

@ObfuscatedName("fo")
public class class160 extends class208 {

    @ObfuscatedName("fo.s")
    public int field2625;

    @ObfuscatedName("fo.p")
    public boolean field2623;

    @ObfuscatedName("fo.t")
    public int field2613;

    @ObfuscatedName("fo.at")
    public int field2611;

    @ObfuscatedName("fo.au")
    public int field2612;

    @ObfuscatedName("fo.ae")
    public int field2602;

    @ObfuscatedName("fo.ax")
    public int field2616;

    @ObfuscatedName("fo.aq")
    public boolean field2614;

    @ObfuscatedName("fo.az")
    public int field2601;

    @ObfuscatedName("fo.ai")
    public int field2617;

    @ObfuscatedName("fo.aj")
    public int field2618;

    @ObfuscatedName("fo.af")
    public int field2609;

    @ObfuscatedName("fo.ar")
    public String field2629;

    @ObfuscatedName("fo.ag")
    public String field2621;

    @ObfuscatedName("fo.ah")
    public String field2622;

    @ObfuscatedName("fo.am")
    public String field2627;

    @ObfuscatedName("fo.aa")
    public int field2624;

    @ObfuscatedName("fo.aw")
    public int field2615;

    @ObfuscatedName("fo.an")
    public int field2626;

    @ObfuscatedName("fo.as")
    public int field2620;

    @ObfuscatedName("fo.av")
    public String field2628;

    @ObfuscatedName("fo.ao")
    public String field2605;

    @ObfuscatedName("fo.ad")
    public int[] field2630 = new int[3];

    @ObfuscatedName("fo.bi")
    public int field2631;

    public class160(boolean arg0) {
        if (arg0) {
            if (Statics.field818.startsWith("win")) {
                this.field2625 = 1;
            } else if (Statics.field818.startsWith("mac")) {
                this.field2625 = 2;
            } else if (Statics.field818.startsWith("linux")) {
                this.field2625 = 3;
            } else {
                this.field2625 = 4;
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
                this.field2623 = true;
            } else {
                this.field2623 = false;
            }
            if (this.field2625 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2613 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2613 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2613 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2613 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2613 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2613 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2613 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2613 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2613 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2613 = 10;
                }
            } else if (this.field2625 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2613 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2613 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2613 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2613 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2613 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2613 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2613 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2611 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2611 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2611 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2611 = 4;
            } else {
                this.field2611 = 5;
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
            this.field2612 = var10;
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
            this.field2602 = var14;
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
            this.field2616 = var18;
            this.field2614 = false;
            this.field2601 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2612 > 3) {
                this.field2617 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2617 = 0;
            }
            this.field2618 = 0;
        }
        if (this.field2629 == null) {
            this.field2629 = "";
        }
        if (this.field2621 == null) {
            this.field2621 = "";
        }
        if (this.field2622 == null) {
            this.field2622 = "";
        }
        if (this.field2627 == null) {
            this.field2627 = "";
        }
        if (this.field2628 == null) {
            this.field2628 = "";
        }
        if (this.field2605 == null) {
            this.field2605 = "";
        }
        this.method2915();
    }

    @ObfuscatedName("fo.i(I)V")
    public void method2915() {
        if (this.field2629.length() > 40) {
            this.field2629 = this.field2629.substring(0, 40);
        }
        if (this.field2621.length() > 40) {
            this.field2621 = this.field2621.substring(0, 40);
        }
        if (this.field2622.length() > 10) {
            this.field2622 = this.field2622.substring(0, 10);
        }
        if (this.field2627.length() > 10) {
            this.field2627 = this.field2627.substring(0, 10);
        }
    }

    @ObfuscatedName("fo.v(Ldj;I)V")
    public void method2916(class119 arg0) {
        arg0.method2296(6);
        arg0.method2296(this.field2625);
        arg0.method2296(this.field2623 ? 1 : 0);
        arg0.method2296(this.field2613);
        arg0.method2296(this.field2611);
        arg0.method2296(this.field2612);
        arg0.method2296(this.field2602);
        arg0.method2296(this.field2616);
        arg0.method2296(this.field2614 ? 1 : 0);
        arg0.method2381(this.field2601);
        arg0.method2296(this.field2617);
        arg0.method2298(this.field2618);
        arg0.method2381(this.field2609);
        arg0.method2432(this.field2629);
        arg0.method2432(this.field2621);
        arg0.method2432(this.field2622);
        arg0.method2432(this.field2627);
        arg0.method2296(this.field2615);
        arg0.method2381(this.field2624);
        arg0.method2432(this.field2628);
        arg0.method2432(this.field2605);
        arg0.method2296(this.field2626);
        arg0.method2296(this.field2620);
        for (int var2 = 0; var2 < this.field2630.length; var2++) {
            arg0.method2299(this.field2630[var2]);
        }
        arg0.method2299(this.field2631);
    }

    @ObfuscatedName("fo.f(B)I")
    public int method2914() {
        byte var1 = 38;
        int var2 = var1 + class119.method1187(this.field2629);
        int var3 = var2 + class119.method1187(this.field2621);
        int var4 = var3 + class119.method1187(this.field2622);
        int var5 = var4 + class119.method1187(this.field2627);
        int var6 = var5 + class119.method1187(this.field2628);
        return var6 + class119.method1187(this.field2605);
    }
}
