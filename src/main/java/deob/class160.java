package deob;

@ObfuscatedName("fu")
public class class160 extends class208 {

    @ObfuscatedName("fu.m")
    public int field2617;

    @ObfuscatedName("fu.o")
    public boolean field2612;

    @ObfuscatedName("fu.e")
    public int field2623;

    @ObfuscatedName("fu.az")
    public int field2638;

    @ObfuscatedName("fu.ac")
    public int field2625;

    @ObfuscatedName("fu.ax")
    public int field2644;

    @ObfuscatedName("fu.ai")
    public int field2627;

    @ObfuscatedName("fu.ar")
    public boolean field2628;

    @ObfuscatedName("fu.aa")
    public int field2620;

    @ObfuscatedName("fu.ag")
    public int field2630;

    @ObfuscatedName("fu.ao")
    public int field2631;

    @ObfuscatedName("fu.an")
    public int field2632;

    @ObfuscatedName("fu.at")
    public String field2643;

    @ObfuscatedName("fu.al")
    public String field2634;

    @ObfuscatedName("fu.aq")
    public String field2635;

    @ObfuscatedName("fu.ae")
    public String field2636;

    @ObfuscatedName("fu.ap")
    public int field2637;

    @ObfuscatedName("fu.ad")
    public int field2618;

    @ObfuscatedName("fu.au")
    public int field2639;

    @ObfuscatedName("fu.ay")
    public int field2640;

    @ObfuscatedName("fu.av")
    public String field2641;

    @ObfuscatedName("fu.ah")
    public String field2642;

    @ObfuscatedName("fu.aj")
    public int[] field2622 = new int[3];

    @ObfuscatedName("fu.bs")
    public int field2619;

    public class160(boolean arg0) {
        if (arg0) {
            if (Statics.field791.startsWith("win")) {
                this.field2617 = 1;
            } else if (Statics.field791.startsWith("mac")) {
                this.field2617 = 2;
            } else if (Statics.field791.startsWith("linux")) {
                this.field2617 = 3;
            } else {
                this.field2617 = 4;
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
                this.field2612 = true;
            } else {
                this.field2612 = false;
            }
            if (this.field2617 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2623 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2623 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2623 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2623 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2623 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2623 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2623 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2623 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2623 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2623 = 10;
                }
            } else if (this.field2617 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2623 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2623 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2623 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2623 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2623 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2623 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2623 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2638 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2638 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2638 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2638 = 4;
            } else {
                this.field2638 = 5;
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
            this.field2625 = var10;
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
            this.field2644 = var14;
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
            this.field2627 = var18;
            this.field2628 = false;
            this.field2620 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2625 > 3) {
                this.field2630 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2630 = 0;
            }
            this.field2631 = 0;
        }
        if (this.field2643 == null) {
            this.field2643 = "";
        }
        if (this.field2634 == null) {
            this.field2634 = "";
        }
        if (this.field2635 == null) {
            this.field2635 = "";
        }
        if (this.field2636 == null) {
            this.field2636 = "";
        }
        if (this.field2641 == null) {
            this.field2641 = "";
        }
        if (this.field2642 == null) {
            this.field2642 = "";
        }
        this.method2918();
    }

    @ObfuscatedName("fu.j(I)V")
    public void method2918() {
        if (this.field2643.length() > 40) {
            this.field2643 = this.field2643.substring(0, 40);
        }
        if (this.field2634.length() > 40) {
            this.field2634 = this.field2634.substring(0, 40);
        }
        if (this.field2635.length() > 10) {
            this.field2635 = this.field2635.substring(0, 10);
        }
        if (this.field2636.length() > 10) {
            this.field2636 = this.field2636.substring(0, 10);
        }
    }

    @ObfuscatedName("fu.l(Ldc;I)V")
    public void method2919(class119 arg0) {
        arg0.method2301(6);
        arg0.method2301(this.field2617);
        arg0.method2301(this.field2612 ? 1 : 0);
        arg0.method2301(this.field2623);
        arg0.method2301(this.field2638);
        arg0.method2301(this.field2625);
        arg0.method2301(this.field2644);
        arg0.method2301(this.field2627);
        arg0.method2301(this.field2628 ? 1 : 0);
        arg0.method2404(this.field2620);
        arg0.method2301(this.field2630);
        arg0.method2320(this.field2631);
        arg0.method2404(this.field2632);
        arg0.method2361(this.field2643);
        arg0.method2361(this.field2634);
        arg0.method2361(this.field2635);
        arg0.method2361(this.field2636);
        arg0.method2301(this.field2618);
        arg0.method2404(this.field2637);
        arg0.method2361(this.field2641);
        arg0.method2361(this.field2642);
        arg0.method2301(this.field2639);
        arg0.method2301(this.field2640);
        for (int var2 = 0; var2 < this.field2622.length; var2++) {
            arg0.method2304(this.field2622[var2]);
        }
        arg0.method2304(this.field2619);
    }

    @ObfuscatedName("fu.a(I)I")
    public int method2920() {
        byte var1 = 38;
        int var2 = var1 + class119.method2547(this.field2643);
        int var3 = var2 + class119.method2547(this.field2634);
        int var4 = var3 + class119.method2547(this.field2635);
        int var5 = var4 + class119.method2547(this.field2636);
        int var6 = var5 + class119.method2547(this.field2641);
        return var6 + class119.method2547(this.field2642);
    }
}
