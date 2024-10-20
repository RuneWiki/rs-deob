package deob;

@ObfuscatedName("fh")
public class class161 extends class209 {

    @ObfuscatedName("fh.e")
    public int field2604;

    @ObfuscatedName("fh.i")
    public boolean field2603;

    @ObfuscatedName("fh.v")
    public int field2609;

    @ObfuscatedName("fh.an")
    public int field2627;

    @ObfuscatedName("fh.aj")
    public int field2613;

    @ObfuscatedName("fh.ay")
    public int field2614;

    @ObfuscatedName("fh.ao")
    public int field2615;

    @ObfuscatedName("fh.ag")
    public boolean field2616;

    @ObfuscatedName("fh.as")
    public int field2630;

    @ObfuscatedName("fh.av")
    public int field2629;

    @ObfuscatedName("fh.aa")
    public int field2620;

    @ObfuscatedName("fh.ah")
    public int field2621;

    @ObfuscatedName("fh.ai")
    public String field2622;

    @ObfuscatedName("fh.ae")
    public String field2623;

    @ObfuscatedName("fh.at")
    public String field2624;

    @ObfuscatedName("fh.ar")
    public String field2625;

    @ObfuscatedName("fh.aw")
    public int field2600;

    @ObfuscatedName("fh.ac")
    public int field2631;

    @ObfuscatedName("fh.ap")
    public int field2628;

    @ObfuscatedName("fh.af")
    public int field2602;

    @ObfuscatedName("fh.al")
    public String field2598;

    @ObfuscatedName("fh.ad")
    public String field2617;

    @ObfuscatedName("fh.ak")
    public int[] field2632 = new int[3];

    @ObfuscatedName("fh.bb")
    public int field2619;

    public class161(boolean arg0) {
        if (arg0) {
            if (Statics.field177.startsWith("win")) {
                this.field2604 = 1;
            } else if (Statics.field177.startsWith("mac")) {
                this.field2604 = 2;
            } else if (Statics.field177.startsWith("linux")) {
                this.field2604 = 3;
            } else {
                this.field2604 = 4;
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
                this.field2603 = true;
            } else {
                this.field2603 = false;
            }
            if (this.field2604 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2609 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2609 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2609 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2609 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2609 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2609 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2609 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2609 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2609 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2609 = 10;
                }
            } else if (this.field2604 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2609 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2609 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2609 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2609 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2609 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2609 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2609 = 26;
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
            this.field2613 = var10;
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
            this.field2614 = var14;
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
            this.field2615 = var18;
            this.field2616 = false;
            this.field2630 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2613 > 3) {
                this.field2629 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2629 = 0;
            }
            this.field2620 = 0;
        }
        if (this.field2622 == null) {
            this.field2622 = "";
        }
        if (this.field2623 == null) {
            this.field2623 = "";
        }
        if (this.field2624 == null) {
            this.field2624 = "";
        }
        if (this.field2625 == null) {
            this.field2625 = "";
        }
        if (this.field2598 == null) {
            this.field2598 = "";
        }
        if (this.field2617 == null) {
            this.field2617 = "";
        }
        this.method2939();
    }

    @ObfuscatedName("fh.j(I)V")
    public void method2939() {
        if (this.field2622.length() > 40) {
            this.field2622 = this.field2622.substring(0, 40);
        }
        if (this.field2623.length() > 40) {
            this.field2623 = this.field2623.substring(0, 40);
        }
        if (this.field2624.length() > 10) {
            this.field2624 = this.field2624.substring(0, 10);
        }
        if (this.field2625.length() > 10) {
            this.field2625 = this.field2625.substring(0, 10);
        }
    }

    @ObfuscatedName("fh.h(Ldx;I)V")
    public void method2937(class120 arg0) {
        arg0.method2364(6);
        arg0.method2364(this.field2604);
        arg0.method2364(this.field2603 ? 1 : 0);
        arg0.method2364(this.field2609);
        arg0.method2364(this.field2627);
        arg0.method2364(this.field2613);
        arg0.method2364(this.field2614);
        arg0.method2364(this.field2615);
        arg0.method2364(this.field2616 ? 1 : 0);
        arg0.method2347(this.field2630);
        arg0.method2364(this.field2629);
        arg0.method2348(this.field2620);
        arg0.method2347(this.field2621);
        arg0.method2353(this.field2622);
        arg0.method2353(this.field2623);
        arg0.method2353(this.field2624);
        arg0.method2353(this.field2625);
        arg0.method2364(this.field2631);
        arg0.method2347(this.field2600);
        arg0.method2353(this.field2598);
        arg0.method2353(this.field2617);
        arg0.method2364(this.field2628);
        arg0.method2364(this.field2602);
        for (int var2 = 0; var2 < this.field2632.length; var2++) {
            arg0.method2349(this.field2632[var2]);
        }
        arg0.method2349(this.field2619);
    }

    @ObfuscatedName("fh.m(I)I")
    public int method2936() {
        byte var1 = 38;
        String var3 = this.field2622;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2623;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2624;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2625;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2598;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2617;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
