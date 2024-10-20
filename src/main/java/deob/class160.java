package deob;

@ObfuscatedName("fw")
public class class160 extends class208 {

    @ObfuscatedName("fw.g")
    public int field2610;

    @ObfuscatedName("fw.o")
    public boolean field2594;

    @ObfuscatedName("fw.y")
    public int field2606;

    @ObfuscatedName("fw.ag")
    public int field2599;

    @ObfuscatedName("fw.as")
    public int field2603;

    @ObfuscatedName("fw.al")
    public int field2628;

    @ObfuscatedName("fw.am")
    public int field2618;

    @ObfuscatedName("fw.ar")
    public boolean field2605;

    @ObfuscatedName("fw.ap")
    public int field2611;

    @ObfuscatedName("fw.ab")
    public int field2613;

    @ObfuscatedName("fw.ak")
    public int field2614;

    @ObfuscatedName("fw.ay")
    public int field2615;

    @ObfuscatedName("fw.au")
    public String field2616;

    @ObfuscatedName("fw.az")
    public String field2607;

    @ObfuscatedName("fw.aw")
    public String field2609;

    @ObfuscatedName("fw.av")
    public String field2619;

    @ObfuscatedName("fw.aq")
    public int field2620;

    @ObfuscatedName("fw.ax")
    public int field2621;

    @ObfuscatedName("fw.ai")
    public int field2602;

    @ObfuscatedName("fw.ae")
    public int field2623;

    @ObfuscatedName("fw.aj")
    public String field2612;

    @ObfuscatedName("fw.ah")
    public String field2625;

    @ObfuscatedName("fw.ao")
    public int[] field2626 = new int[3];

    @ObfuscatedName("fw.bs")
    public int field2627;

    public class160(boolean arg0) {
        if (arg0) {
            if (Statics.field222.startsWith("win")) {
                this.field2610 = 1;
            } else if (Statics.field222.startsWith("mac")) {
                this.field2610 = 2;
            } else if (Statics.field222.startsWith("linux")) {
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
                this.field2594 = true;
            } else {
                this.field2594 = false;
            }
            if (this.field2610 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2606 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2606 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2606 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2606 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2606 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2606 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2606 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2606 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2606 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2606 = 10;
                }
            } else if (this.field2610 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2606 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2606 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2606 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2606 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2606 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2606 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2606 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2599 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2599 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2599 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2599 = 4;
            } else {
                this.field2599 = 5;
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
            this.field2603 = var10;
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
            this.field2628 = var14;
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
            this.field2618 = var18;
            this.field2605 = false;
            this.field2611 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2603 > 3) {
                this.field2613 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2613 = 0;
            }
            this.field2614 = 0;
        }
        if (this.field2616 == null) {
            this.field2616 = "";
        }
        if (this.field2607 == null) {
            this.field2607 = "";
        }
        if (this.field2609 == null) {
            this.field2609 = "";
        }
        if (this.field2619 == null) {
            this.field2619 = "";
        }
        if (this.field2612 == null) {
            this.field2612 = "";
        }
        if (this.field2625 == null) {
            this.field2625 = "";
        }
        this.method2998();
    }

    @ObfuscatedName("fw.h(I)V")
    public void method2998() {
        if (this.field2616.length() > 40) {
            this.field2616 = this.field2616.substring(0, 40);
        }
        if (this.field2607.length() > 40) {
            this.field2607 = this.field2607.substring(0, 40);
        }
        if (this.field2609.length() > 10) {
            this.field2609 = this.field2609.substring(0, 10);
        }
        if (this.field2619.length() > 10) {
            this.field2619 = this.field2619.substring(0, 10);
        }
    }

    @ObfuscatedName("fw.q(Ldm;I)V")
    public void method2999(class119 arg0) {
        arg0.method2499(6);
        arg0.method2499(this.field2610);
        arg0.method2499(this.field2594 ? 1 : 0);
        arg0.method2499(this.field2606);
        arg0.method2499(this.field2599);
        arg0.method2499(this.field2603);
        arg0.method2499(this.field2628);
        arg0.method2499(this.field2618);
        arg0.method2499(this.field2605 ? 1 : 0);
        arg0.method2369(this.field2611);
        arg0.method2499(this.field2613);
        arg0.method2413(this.field2614);
        arg0.method2369(this.field2615);
        arg0.method2375(this.field2616);
        arg0.method2375(this.field2607);
        arg0.method2375(this.field2609);
        arg0.method2375(this.field2619);
        arg0.method2499(this.field2621);
        arg0.method2369(this.field2620);
        arg0.method2375(this.field2612);
        arg0.method2375(this.field2625);
        arg0.method2499(this.field2602);
        arg0.method2499(this.field2623);
        for (int var2 = 0; var2 < this.field2626.length; var2++) {
            arg0.method2556(this.field2626[var2]);
        }
        arg0.method2556(this.field2627);
    }

    @ObfuscatedName("fw.v(I)I")
    public int method3000() {
        byte var1 = 38;
        int var2 = var1 + class119.method106(this.field2616);
        int var3 = var2 + class119.method106(this.field2607);
        int var4 = var3 + class119.method106(this.field2609);
        int var5 = var4 + class119.method106(this.field2619);
        int var6 = var5 + class119.method106(this.field2612);
        return var6 + class119.method106(this.field2625);
    }
}
