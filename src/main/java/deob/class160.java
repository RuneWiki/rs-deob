package deob;

@ObfuscatedName("fq")
public class class160 extends class208 {

    @ObfuscatedName("fq.l")
    public int field2629;

    @ObfuscatedName("fq.m")
    public boolean field2603;

    @ObfuscatedName("fq.i")
    public int field2632;

    @ObfuscatedName("fq.ab")
    public int field2608;

    @ObfuscatedName("fq.aa")
    public int field2606;

    @ObfuscatedName("fq.af")
    public int field2609;

    @ObfuscatedName("fq.al")
    public int field2598;

    @ObfuscatedName("fq.ad")
    public boolean field2612;

    @ObfuscatedName("fq.aw")
    public int field2600;

    @ObfuscatedName("fq.ax")
    public int field2614;

    @ObfuscatedName("fq.ae")
    public int field2619;

    @ObfuscatedName("fq.au")
    public int field2610;

    @ObfuscatedName("fq.ao")
    public String field2617;

    @ObfuscatedName("fq.aj")
    public String field2618;

    @ObfuscatedName("fq.am")
    public String field2611;

    @ObfuscatedName("fq.av")
    public String field2620;

    @ObfuscatedName("fq.ap")
    public int field2621;

    @ObfuscatedName("fq.ah")
    public int field2622;

    @ObfuscatedName("fq.ar")
    public int field2623;

    @ObfuscatedName("fq.az")
    public int field2627;

    @ObfuscatedName("fq.ac")
    public String field2625;

    @ObfuscatedName("fq.as")
    public String field2626;

    @ObfuscatedName("fq.at")
    public int[] field2597 = new int[3];

    @ObfuscatedName("fq.bt")
    public int field2628;

    public class160(boolean arg0) {
        if (arg0) {
            if (Statics.field586.startsWith("win")) {
                this.field2629 = 1;
            } else if (Statics.field586.startsWith("mac")) {
                this.field2629 = 2;
            } else if (Statics.field586.startsWith("linux")) {
                this.field2629 = 3;
            } else {
                this.field2629 = 4;
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
            if (this.field2629 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2632 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2632 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2632 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2632 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2632 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2632 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2632 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2632 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2632 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2632 = 10;
                }
            } else if (this.field2629 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2632 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2632 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2632 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2632 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2632 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2632 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2632 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2608 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2608 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2608 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2608 = 4;
            } else {
                this.field2608 = 5;
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
            this.field2609 = var14;
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
            this.field2598 = var18;
            this.field2612 = false;
            this.field2600 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2606 > 3) {
                this.field2614 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2614 = 0;
            }
            this.field2619 = 0;
        }
        if (this.field2617 == null) {
            this.field2617 = "";
        }
        if (this.field2618 == null) {
            this.field2618 = "";
        }
        if (this.field2611 == null) {
            this.field2611 = "";
        }
        if (this.field2620 == null) {
            this.field2620 = "";
        }
        if (this.field2625 == null) {
            this.field2625 = "";
        }
        if (this.field2626 == null) {
            this.field2626 = "";
        }
        this.method2994();
    }

    @ObfuscatedName("fq.g(I)V")
    public void method2994() {
        if (this.field2617.length() > 40) {
            this.field2617 = this.field2617.substring(0, 40);
        }
        if (this.field2618.length() > 40) {
            this.field2618 = this.field2618.substring(0, 40);
        }
        if (this.field2611.length() > 10) {
            this.field2611 = this.field2611.substring(0, 10);
        }
        if (this.field2620.length() > 10) {
            this.field2620 = this.field2620.substring(0, 10);
        }
    }

    @ObfuscatedName("fq.b(Ldm;B)V")
    public void method2993(class119 arg0) {
        arg0.method2476(6);
        arg0.method2476(this.field2629);
        arg0.method2476(this.field2603 ? 1 : 0);
        arg0.method2476(this.field2632);
        arg0.method2476(this.field2608);
        arg0.method2476(this.field2606);
        arg0.method2476(this.field2609);
        arg0.method2476(this.field2598);
        arg0.method2476(this.field2612 ? 1 : 0);
        arg0.method2349(this.field2600);
        arg0.method2476(this.field2614);
        arg0.method2537(this.field2619);
        arg0.method2349(this.field2610);
        arg0.method2409(this.field2617);
        arg0.method2409(this.field2618);
        arg0.method2409(this.field2611);
        arg0.method2409(this.field2620);
        arg0.method2476(this.field2622);
        arg0.method2349(this.field2621);
        arg0.method2409(this.field2625);
        arg0.method2409(this.field2626);
        arg0.method2476(this.field2623);
        arg0.method2476(this.field2627);
        for (int var2 = 0; var2 < this.field2597.length; var2++) {
            arg0.method2351(this.field2597[var2]);
        }
        arg0.method2351(this.field2628);
    }

    @ObfuscatedName("fq.w(B)I")
    public int method3000() {
        byte var1 = 38;
        String var3 = this.field2617;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2618;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2611;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2620;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2625;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2626;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
