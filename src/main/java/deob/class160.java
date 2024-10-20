package deob;

@ObfuscatedName("fu")
public class class160 extends class208 {

    @ObfuscatedName("fu.s")
    public int field2602;

    @ObfuscatedName("fu.y")
    public boolean field2614;

    @ObfuscatedName("fu.c")
    public int field2623;

    @ObfuscatedName("fu.ak")
    public int field2617;

    @ObfuscatedName("fu.an")
    public int field2609;

    @ObfuscatedName("fu.af")
    public int field2610;

    @ObfuscatedName("fu.ao")
    public int field2611;

    @ObfuscatedName("fu.as")
    public boolean field2612;

    @ObfuscatedName("fu.am")
    public int field2613;

    @ObfuscatedName("fu.ax")
    public int field2599;

    @ObfuscatedName("fu.ab")
    public int field2615;

    @ObfuscatedName("fu.av")
    public int field2616;

    @ObfuscatedName("fu.aq")
    public String field2607;

    @ObfuscatedName("fu.ac")
    public String field2618;

    @ObfuscatedName("fu.ar")
    public String field2619;

    @ObfuscatedName("fu.az")
    public String field2620;

    @ObfuscatedName("fu.ad")
    public int field2621;

    @ObfuscatedName("fu.au")
    public int field2605;

    @ObfuscatedName("fu.aw")
    public int field2603;

    @ObfuscatedName("fu.ag")
    public int field2624;

    @ObfuscatedName("fu.al")
    public String field2622;

    @ObfuscatedName("fu.ai")
    public String field2626;

    @ObfuscatedName("fu.at")
    public int[] field2627 = new int[3];

    @ObfuscatedName("fu.bp")
    public int field2628;

    public class160(boolean arg0) {
        if (arg0) {
            if (Statics.field2239.startsWith("win")) {
                this.field2602 = 1;
            } else if (Statics.field2239.startsWith("mac")) {
                this.field2602 = 2;
            } else if (Statics.field2239.startsWith("linux")) {
                this.field2602 = 3;
            } else {
                this.field2602 = 4;
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
                this.field2614 = true;
            } else {
                this.field2614 = false;
            }
            if (this.field2602 == 1) {
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
            } else if (this.field2602 == 2) {
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
                this.field2617 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2617 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2617 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2617 = 4;
            } else {
                this.field2617 = 5;
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
            this.field2609 = var10;
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
            this.field2610 = var14;
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
            this.field2611 = var18;
            this.field2612 = false;
            this.field2613 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2609 > 3) {
                this.field2599 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2599 = 0;
            }
            this.field2615 = 0;
        }
        if (this.field2607 == null) {
            this.field2607 = "";
        }
        if (this.field2618 == null) {
            this.field2618 = "";
        }
        if (this.field2619 == null) {
            this.field2619 = "";
        }
        if (this.field2620 == null) {
            this.field2620 = "";
        }
        if (this.field2622 == null) {
            this.field2622 = "";
        }
        if (this.field2626 == null) {
            this.field2626 = "";
        }
        this.method2970();
    }

    @ObfuscatedName("fu.o(I)V")
    public void method2970() {
        if (this.field2607.length() > 40) {
            this.field2607 = this.field2607.substring(0, 40);
        }
        if (this.field2618.length() > 40) {
            this.field2618 = this.field2618.substring(0, 40);
        }
        if (this.field2619.length() > 10) {
            this.field2619 = this.field2619.substring(0, 10);
        }
        if (this.field2620.length() > 10) {
            this.field2620 = this.field2620.substring(0, 10);
        }
    }

    @ObfuscatedName("fu.e(Ldi;I)V")
    public void method2963(class119 arg0) {
        arg0.method2322(6);
        arg0.method2322(this.field2602);
        arg0.method2322(this.field2614 ? 1 : 0);
        arg0.method2322(this.field2623);
        arg0.method2322(this.field2617);
        arg0.method2322(this.field2609);
        arg0.method2322(this.field2610);
        arg0.method2322(this.field2611);
        arg0.method2322(this.field2612 ? 1 : 0);
        arg0.method2481(this.field2613);
        arg0.method2322(this.field2599);
        arg0.method2423(this.field2615);
        arg0.method2481(this.field2616);
        arg0.method2551(this.field2607);
        arg0.method2551(this.field2618);
        arg0.method2551(this.field2619);
        arg0.method2551(this.field2620);
        arg0.method2322(this.field2605);
        arg0.method2481(this.field2621);
        arg0.method2551(this.field2622);
        arg0.method2551(this.field2626);
        arg0.method2322(this.field2603);
        arg0.method2322(this.field2624);
        for (int var2 = 0; var2 < this.field2627.length; var2++) {
            arg0.method2327(this.field2627[var2]);
        }
        arg0.method2327(this.field2628);
    }

    @ObfuscatedName("fu.u(I)I")
    public int method2962() {
        byte var1 = 38;
        String var3 = this.field2607;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2618;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2619;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2620;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2622;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2626;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
