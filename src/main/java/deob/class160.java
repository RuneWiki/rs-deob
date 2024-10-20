package deob;

@ObfuscatedName("fj")
public class class160 extends class208 {

    @ObfuscatedName("fj.c")
    public int field2620;

    @ObfuscatedName("fj.p")
    public boolean field2621;

    @ObfuscatedName("fj.t")
    public int field2626;

    @ObfuscatedName("fj.au")
    public int field2627;

    @ObfuscatedName("fj.ar")
    public int field2637;

    @ObfuscatedName("fj.aw")
    public int field2634;

    @ObfuscatedName("fj.at")
    public int field2630;

    @ObfuscatedName("fj.al")
    public boolean field2638;

    @ObfuscatedName("fj.aj")
    public int field2642;

    @ObfuscatedName("fj.ay")
    public int field2616;

    @ObfuscatedName("fj.ac")
    public int field2628;

    @ObfuscatedName("fj.aa")
    public int field2635;

    @ObfuscatedName("fj.ao")
    public String field2636;

    @ObfuscatedName("fj.av")
    public String field2617;

    @ObfuscatedName("fj.am")
    public String field2644;

    @ObfuscatedName("fj.an")
    public String field2639;

    @ObfuscatedName("fj.ae")
    public int field2625;

    @ObfuscatedName("fj.ap")
    public int field2641;

    @ObfuscatedName("fj.ax")
    public int field2633;

    @ObfuscatedName("fj.ab")
    public int field2643;

    @ObfuscatedName("fj.as")
    public String field2647;

    @ObfuscatedName("fj.ah")
    public String field2645;

    @ObfuscatedName("fj.aq")
    public int[] field2646 = new int[3];

    @ObfuscatedName("fj.bw")
    public int field2629;

    public class160(boolean arg0) {
        if (arg0) {
            if (Statics.field2651.startsWith("win")) {
                this.field2620 = 1;
            } else if (Statics.field2651.startsWith("mac")) {
                this.field2620 = 2;
            } else if (Statics.field2651.startsWith("linux")) {
                this.field2620 = 3;
            } else {
                this.field2620 = 4;
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
                this.field2621 = true;
            } else {
                this.field2621 = false;
            }
            if (this.field2620 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2626 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2626 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2626 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2626 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2626 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2626 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2626 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2626 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2626 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2626 = 10;
                }
            } else if (this.field2620 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2626 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2626 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2626 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2626 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2626 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2626 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2626 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2627 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2627 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2627 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2627 = 4;
            } else {
                this.field2627 = 5;
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
            this.field2637 = var10;
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
            this.field2634 = var14;
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
            this.field2630 = var18;
            this.field2638 = false;
            this.field2642 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2637 > 3) {
                this.field2616 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2616 = 0;
            }
            this.field2628 = 0;
        }
        if (this.field2636 == null) {
            this.field2636 = "";
        }
        if (this.field2617 == null) {
            this.field2617 = "";
        }
        if (this.field2644 == null) {
            this.field2644 = "";
        }
        if (this.field2639 == null) {
            this.field2639 = "";
        }
        if (this.field2647 == null) {
            this.field2647 = "";
        }
        if (this.field2645 == null) {
            this.field2645 = "";
        }
        this.method2936();
    }

    @ObfuscatedName("fj.v(I)V")
    public void method2936() {
        if (this.field2636.length() > 40) {
            this.field2636 = this.field2636.substring(0, 40);
        }
        if (this.field2617.length() > 40) {
            this.field2617 = this.field2617.substring(0, 40);
        }
        if (this.field2644.length() > 10) {
            this.field2644 = this.field2644.substring(0, 10);
        }
        if (this.field2639.length() > 10) {
            this.field2639 = this.field2639.substring(0, 10);
        }
    }

    @ObfuscatedName("fj.f(Ldx;I)V")
    public void method2937(class119 arg0) {
        arg0.method2398(6);
        arg0.method2398(this.field2620);
        arg0.method2398(this.field2621 ? 1 : 0);
        arg0.method2398(this.field2626);
        arg0.method2398(this.field2627);
        arg0.method2398(this.field2637);
        arg0.method2398(this.field2634);
        arg0.method2398(this.field2630);
        arg0.method2398(this.field2638 ? 1 : 0);
        arg0.method2336(this.field2642);
        arg0.method2398(this.field2616);
        arg0.method2451(this.field2628);
        arg0.method2336(this.field2635);
        arg0.method2342(this.field2636);
        arg0.method2342(this.field2617);
        arg0.method2342(this.field2644);
        arg0.method2342(this.field2639);
        arg0.method2398(this.field2641);
        arg0.method2336(this.field2625);
        arg0.method2342(this.field2647);
        arg0.method2342(this.field2645);
        arg0.method2398(this.field2633);
        arg0.method2398(this.field2643);
        for (int var2 = 0; var2 < this.field2646.length; var2++) {
            arg0.method2338(this.field2646[var2]);
        }
        arg0.method2338(this.field2629);
    }

    @ObfuscatedName("fj.i(B)I")
    public int method2948() {
        byte var1 = 38;
        String var3 = this.field2636;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2617;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2644;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2639;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2647;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2645;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
