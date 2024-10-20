package deob;

@ObfuscatedName("fg")
public class class160 extends class208 {

    @ObfuscatedName("fg.l")
    public int field2598;

    @ObfuscatedName("fg.r")
    public boolean field2615;

    @ObfuscatedName("fg.w")
    public int field2604;

    @ObfuscatedName("fg.ay")
    public int field2605;

    @ObfuscatedName("fg.aq")
    public int field2606;

    @ObfuscatedName("fg.ac")
    public int field2607;

    @ObfuscatedName("fg.ak")
    public int field2608;

    @ObfuscatedName("fg.am")
    public boolean field2609;

    @ObfuscatedName("fg.aj")
    public int field2595;

    @ObfuscatedName("fg.av")
    public int field2618;

    @ObfuscatedName("fg.ae")
    public int field2612;

    @ObfuscatedName("fg.ai")
    public int field2613;

    @ObfuscatedName("fg.at")
    public String field2611;

    @ObfuscatedName("fg.ah")
    public String field2599;

    @ObfuscatedName("fg.ao")
    public String field2616;

    @ObfuscatedName("fg.aa")
    public String field2617;

    @ObfuscatedName("fg.ax")
    public int field2626;

    @ObfuscatedName("fg.as")
    public int field2619;

    @ObfuscatedName("fg.ar")
    public int field2620;

    @ObfuscatedName("fg.ap")
    public int field2602;

    @ObfuscatedName("fg.ag")
    public String field2622;

    @ObfuscatedName("fg.af")
    public String field2623;

    @ObfuscatedName("fg.az")
    public int[] field2624 = new int[3];

    @ObfuscatedName("fg.bo")
    public int field2625;

    public class160(boolean arg0) {
        if (arg0) {
            if (Statics.field1385.startsWith("win")) {
                this.field2598 = 1;
            } else if (Statics.field1385.startsWith("mac")) {
                this.field2598 = 2;
            } else if (Statics.field1385.startsWith("linux")) {
                this.field2598 = 3;
            } else {
                this.field2598 = 4;
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
                this.field2615 = true;
            } else {
                this.field2615 = false;
            }
            if (this.field2598 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2604 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2604 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2604 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2604 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2604 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2604 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2604 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2604 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2604 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2604 = 10;
                }
            } else if (this.field2598 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2604 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2604 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2604 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2604 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2604 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2604 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2604 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2605 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2605 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2605 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2605 = 4;
            } else {
                this.field2605 = 5;
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
            this.field2606 = var10;
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
            this.field2607 = var14;
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
            this.field2608 = var18;
            this.field2609 = false;
            this.field2595 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2606 > 3) {
                this.field2618 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2618 = 0;
            }
            this.field2612 = 0;
        }
        if (this.field2611 == null) {
            this.field2611 = "";
        }
        if (this.field2599 == null) {
            this.field2599 = "";
        }
        if (this.field2616 == null) {
            this.field2616 = "";
        }
        if (this.field2617 == null) {
            this.field2617 = "";
        }
        if (this.field2622 == null) {
            this.field2622 = "";
        }
        if (this.field2623 == null) {
            this.field2623 = "";
        }
        this.method2902();
    }

    @ObfuscatedName("fg.z(I)V")
    public void method2902() {
        if (this.field2611.length() > 40) {
            this.field2611 = this.field2611.substring(0, 40);
        }
        if (this.field2599.length() > 40) {
            this.field2599 = this.field2599.substring(0, 40);
        }
        if (this.field2616.length() > 10) {
            this.field2616 = this.field2616.substring(0, 10);
        }
        if (this.field2617.length() > 10) {
            this.field2617 = this.field2617.substring(0, 10);
        }
    }

    @ObfuscatedName("fg.q(Lda;B)V")
    public void method2904(class119 arg0) {
        arg0.method2285(6);
        arg0.method2285(this.field2598);
        arg0.method2285(this.field2615 ? 1 : 0);
        arg0.method2285(this.field2604);
        arg0.method2285(this.field2605);
        arg0.method2285(this.field2606);
        arg0.method2285(this.field2607);
        arg0.method2285(this.field2608);
        arg0.method2285(this.field2609 ? 1 : 0);
        arg0.method2287(this.field2595);
        arg0.method2285(this.field2618);
        arg0.method2288(this.field2612);
        arg0.method2287(this.field2613);
        arg0.method2418(this.field2611);
        arg0.method2418(this.field2599);
        arg0.method2418(this.field2616);
        arg0.method2418(this.field2617);
        arg0.method2285(this.field2619);
        arg0.method2287(this.field2626);
        arg0.method2418(this.field2622);
        arg0.method2418(this.field2623);
        arg0.method2285(this.field2620);
        arg0.method2285(this.field2602);
        for (int var2 = 0; var2 < this.field2624.length; var2++) {
            arg0.method2289(this.field2624[var2]);
        }
        arg0.method2289(this.field2625);
    }

    @ObfuscatedName("fg.k(I)I")
    public int method2909() {
        byte var1 = 38;
        int var2 = var1 + class119.method987(this.field2611);
        int var3 = var2 + class119.method987(this.field2599);
        int var4 = var3 + class119.method987(this.field2616);
        int var5 = var4 + class119.method987(this.field2617);
        int var6 = var5 + class119.method987(this.field2622);
        return var6 + class119.method987(this.field2623);
    }
}
