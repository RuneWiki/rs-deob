package deob;

@ObfuscatedName("fl")
public class class161 extends class209 {

    @ObfuscatedName("fl.u")
    public int field2619;

    @ObfuscatedName("fl.o")
    public boolean field2631;

    @ObfuscatedName("fl.n")
    public int field2624;

    @ObfuscatedName("fl.ap")
    public int field2625;

    @ObfuscatedName("fl.am")
    public int field2627;

    @ObfuscatedName("fl.ae")
    public int field2628;

    @ObfuscatedName("fl.ao")
    public int field2629;

    @ObfuscatedName("fl.as")
    public boolean field2639;

    @ObfuscatedName("fl.ai")
    public int field2630;

    @ObfuscatedName("fl.ax")
    public int field2632;

    @ObfuscatedName("fl.aq")
    public int field2633;

    @ObfuscatedName("fl.ay")
    public int field2626;

    @ObfuscatedName("fl.aj")
    public String field2618;

    @ObfuscatedName("fl.ar")
    public String field2636;

    @ObfuscatedName("fl.aw")
    public String field2637;

    @ObfuscatedName("fl.at")
    public String field2638;

    @ObfuscatedName("fl.af")
    public int field2640;

    @ObfuscatedName("fl.al")
    public int field2646;

    @ObfuscatedName("fl.ag")
    public int field2641;

    @ObfuscatedName("fl.ac")
    public int field2642;

    @ObfuscatedName("fl.ak")
    public String field2643;

    @ObfuscatedName("fl.av")
    public String field2644;

    @ObfuscatedName("fl.az")
    public int[] field2645 = new int[3];

    @ObfuscatedName("fl.bd")
    public int field2620;

    public class161(boolean arg0) {
        if (arg0) {
            if (Statics.field2247.startsWith("win")) {
                this.field2619 = 1;
            } else if (Statics.field2247.startsWith("mac")) {
                this.field2619 = 2;
            } else if (Statics.field2247.startsWith("linux")) {
                this.field2619 = 3;
            } else {
                this.field2619 = 4;
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
                this.field2631 = true;
            } else {
                this.field2631 = false;
            }
            if (this.field2619 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2624 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2624 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2624 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2624 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2624 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2624 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2624 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2624 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2624 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2624 = 10;
                }
            } else if (this.field2619 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2624 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2624 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2624 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2624 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2624 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2624 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2624 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2625 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2625 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2625 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2625 = 4;
            } else {
                this.field2625 = 5;
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
            this.field2627 = var10;
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
            this.field2629 = var18;
            this.field2639 = false;
            this.field2630 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2627 > 3) {
                this.field2632 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2632 = 0;
            }
            this.field2633 = 0;
        }
        if (this.field2618 == null) {
            this.field2618 = "";
        }
        if (this.field2636 == null) {
            this.field2636 = "";
        }
        if (this.field2637 == null) {
            this.field2637 = "";
        }
        if (this.field2638 == null) {
            this.field2638 = "";
        }
        if (this.field2643 == null) {
            this.field2643 = "";
        }
        if (this.field2644 == null) {
            this.field2644 = "";
        }
        this.method2932();
    }

    @ObfuscatedName("fl.s(I)V")
    public void method2932() {
        if (this.field2618.length() > 40) {
            this.field2618 = this.field2618.substring(0, 40);
        }
        if (this.field2636.length() > 40) {
            this.field2636 = this.field2636.substring(0, 40);
        }
        if (this.field2637.length() > 10) {
            this.field2637 = this.field2637.substring(0, 10);
        }
        if (this.field2638.length() > 10) {
            this.field2638 = this.field2638.substring(0, 10);
        }
    }

    @ObfuscatedName("fl.j(Lds;I)V")
    public void method2933(class120 arg0) {
        arg0.method2323(6);
        arg0.method2323(this.field2619);
        arg0.method2323(this.field2631 ? 1 : 0);
        arg0.method2323(this.field2624);
        arg0.method2323(this.field2625);
        arg0.method2323(this.field2627);
        arg0.method2323(this.field2628);
        arg0.method2323(this.field2629);
        arg0.method2323(this.field2639 ? 1 : 0);
        arg0.method2507(this.field2630);
        arg0.method2323(this.field2632);
        arg0.method2452(this.field2633);
        arg0.method2507(this.field2626);
        arg0.method2335(this.field2618);
        arg0.method2335(this.field2636);
        arg0.method2335(this.field2637);
        arg0.method2335(this.field2638);
        arg0.method2323(this.field2646);
        arg0.method2507(this.field2640);
        arg0.method2335(this.field2643);
        arg0.method2335(this.field2644);
        arg0.method2323(this.field2641);
        arg0.method2323(this.field2642);
        for (int var2 = 0; var2 < this.field2645.length; var2++) {
            arg0.method2326(this.field2645[var2]);
        }
        arg0.method2326(this.field2620);
    }

    @ObfuscatedName("fl.p(I)I")
    public int method2931() {
        byte var1 = 38;
        String var3 = this.field2618;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2636;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2637;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2638;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2643;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2644;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
