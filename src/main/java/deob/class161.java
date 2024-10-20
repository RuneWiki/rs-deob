package deob;

@ObfuscatedName("fy")
public class class161 extends class209 {

    @ObfuscatedName("fy.d")
    public int field2610;

    @ObfuscatedName("fy.n")
    public boolean field2633;

    @ObfuscatedName("fy.z")
    public int field2617;

    @ObfuscatedName("fy.aj")
    public int field2623;

    @ObfuscatedName("fy.an")
    public int field2629;

    @ObfuscatedName("fy.al")
    public int field2620;

    @ObfuscatedName("fy.as")
    public int field2621;

    @ObfuscatedName("fy.av")
    public boolean field2622;

    @ObfuscatedName("fy.am")
    public int field2628;

    @ObfuscatedName("fy.ai")
    public int field2619;

    @ObfuscatedName("fy.ah")
    public int field2625;

    @ObfuscatedName("fy.ap")
    public int field2626;

    @ObfuscatedName("fy.af")
    public String field2627;

    @ObfuscatedName("fy.aa")
    public String field2616;

    @ObfuscatedName("fy.ay")
    public String field2639;

    @ObfuscatedName("fy.aw")
    public String field2630;

    @ObfuscatedName("fy.ak")
    public int field2631;

    @ObfuscatedName("fy.ae")
    public int field2632;

    @ObfuscatedName("fy.ad")
    public int field2611;

    @ObfuscatedName("fy.au")
    public int field2634;

    @ObfuscatedName("fy.ar")
    public String field2635;

    @ObfuscatedName("fy.at")
    public String field2636;

    @ObfuscatedName("fy.ab")
    public int[] field2637 = new int[3];

    @ObfuscatedName("fy.bp")
    public int field2638;

    public class161(boolean arg0) {
        if (arg0) {
            if (Statics.field275.startsWith("win")) {
                this.field2610 = 1;
            } else if (Statics.field275.startsWith("mac")) {
                this.field2610 = 2;
            } else if (Statics.field275.startsWith("linux")) {
                this.field2610 = 3;
            } else {
                this.field2610 = 4;
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
                this.field2633 = true;
            } else {
                this.field2633 = false;
            }
            if (this.field2610 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2617 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2617 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2617 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2617 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2617 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2617 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2617 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2617 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2617 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2617 = 10;
                }
            } else if (this.field2610 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2617 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2617 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2617 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2617 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2617 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2617 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2617 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2623 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2623 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2623 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2623 = 4;
            } else {
                this.field2623 = 5;
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
            this.field2629 = var10;
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
            this.field2620 = var14;
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
            this.field2621 = var18;
            this.field2622 = false;
            this.field2628 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2629 > 3) {
                this.field2619 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2619 = 0;
            }
            this.field2625 = 0;
        }
        if (this.field2627 == null) {
            this.field2627 = "";
        }
        if (this.field2616 == null) {
            this.field2616 = "";
        }
        if (this.field2639 == null) {
            this.field2639 = "";
        }
        if (this.field2630 == null) {
            this.field2630 = "";
        }
        if (this.field2635 == null) {
            this.field2635 = "";
        }
        if (this.field2636 == null) {
            this.field2636 = "";
        }
        this.method2973();
    }

    @ObfuscatedName("fy.f(B)V")
    public void method2973() {
        if (this.field2627.length() > 40) {
            this.field2627 = this.field2627.substring(0, 40);
        }
        if (this.field2616.length() > 40) {
            this.field2616 = this.field2616.substring(0, 40);
        }
        if (this.field2639.length() > 10) {
            this.field2639 = this.field2639.substring(0, 10);
        }
        if (this.field2630.length() > 10) {
            this.field2630 = this.field2630.substring(0, 10);
        }
    }

    @ObfuscatedName("fy.u(Ldj;I)V")
    public void method2978(class120 arg0) {
        arg0.method2485(6);
        arg0.method2485(this.field2610);
        arg0.method2485(this.field2633 ? 1 : 0);
        arg0.method2485(this.field2617);
        arg0.method2485(this.field2623);
        arg0.method2485(this.field2629);
        arg0.method2485(this.field2620);
        arg0.method2485(this.field2621);
        arg0.method2485(this.field2622 ? 1 : 0);
        arg0.method2371(this.field2628);
        arg0.method2485(this.field2619);
        arg0.method2372(this.field2625);
        arg0.method2371(this.field2626);
        arg0.method2377(this.field2627);
        arg0.method2377(this.field2616);
        arg0.method2377(this.field2639);
        arg0.method2377(this.field2630);
        arg0.method2485(this.field2632);
        arg0.method2371(this.field2631);
        arg0.method2377(this.field2635);
        arg0.method2377(this.field2636);
        arg0.method2485(this.field2611);
        arg0.method2485(this.field2634);
        for (int var2 = 0; var2 < this.field2637.length; var2++) {
            arg0.method2370(this.field2637[var2]);
        }
        arg0.method2370(this.field2638);
    }

    @ObfuscatedName("fy.x(B)I")
    public int method2975() {
        byte var1 = 38;
        int var2 = var1 + class120.method748(this.field2627);
        int var3 = var2 + class120.method748(this.field2616);
        int var4 = var3 + class120.method748(this.field2639);
        int var5 = var4 + class120.method748(this.field2630);
        int var6 = var5 + class120.method748(this.field2635);
        return var6 + class120.method748(this.field2636);
    }
}
