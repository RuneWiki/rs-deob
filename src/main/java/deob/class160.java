package deob;

@ObfuscatedName("fw")
public class class160 extends class208 {

    @ObfuscatedName("fw.e")
    public int field2596;

    @ObfuscatedName("fw.g")
    public boolean field2597;

    @ObfuscatedName("fw.k")
    public int field2598;

    @ObfuscatedName("fw.ak")
    public int field2600;

    @ObfuscatedName("fw.ah")
    public int field2601;

    @ObfuscatedName("fw.ac")
    public int field2593;

    @ObfuscatedName("fw.as")
    public int field2603;

    @ObfuscatedName("fw.ao")
    public boolean field2604;

    @ObfuscatedName("fw.am")
    public int field2605;

    @ObfuscatedName("fw.ab")
    public int field2606;

    @ObfuscatedName("fw.ar")
    public int field2594;

    @ObfuscatedName("fw.aa")
    public int field2609;

    @ObfuscatedName("fw.ag")
    public String field2610;

    @ObfuscatedName("fw.an")
    public String field2611;

    @ObfuscatedName("fw.av")
    public String field2612;

    @ObfuscatedName("fw.aj")
    public String field2595;

    @ObfuscatedName("fw.ap")
    public int field2622;

    @ObfuscatedName("fw.aq")
    public int field2623;

    @ObfuscatedName("fw.af")
    public int field2616;

    @ObfuscatedName("fw.ay")
    public int field2617;

    @ObfuscatedName("fw.au")
    public String field2618;

    @ObfuscatedName("fw.az")
    public String field2619;

    @ObfuscatedName("fw.ae")
    public int[] field2620 = new int[3];

    @ObfuscatedName("fw.bd")
    public int field2621;

    public class160(boolean arg0) {
        if (arg0) {
            if (Statics.field1987.startsWith("win")) {
                this.field2596 = 1;
            } else if (Statics.field1987.startsWith("mac")) {
                this.field2596 = 2;
            } else if (Statics.field1987.startsWith("linux")) {
                this.field2596 = 3;
            } else {
                this.field2596 = 4;
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
                this.field2597 = true;
            } else {
                this.field2597 = false;
            }
            if (this.field2596 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2598 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2598 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2598 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2598 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2598 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2598 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2598 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2598 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2598 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2598 = 10;
                }
            } else if (this.field2596 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2598 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2598 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2598 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2598 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2598 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2598 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2598 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2600 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2600 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2600 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2600 = 4;
            } else {
                this.field2600 = 5;
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
            this.field2601 = var10;
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
            this.field2593 = var14;
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
            this.field2603 = var18;
            this.field2604 = false;
            this.field2605 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2601 > 3) {
                this.field2606 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2606 = 0;
            }
            this.field2594 = 0;
        }
        if (this.field2610 == null) {
            this.field2610 = "";
        }
        if (this.field2611 == null) {
            this.field2611 = "";
        }
        if (this.field2612 == null) {
            this.field2612 = "";
        }
        if (this.field2595 == null) {
            this.field2595 = "";
        }
        if (this.field2618 == null) {
            this.field2618 = "";
        }
        if (this.field2619 == null) {
            this.field2619 = "";
        }
        this.method2948();
    }

    @ObfuscatedName("fw.a(I)V")
    public void method2948() {
        if (this.field2610.length() > 40) {
            this.field2610 = this.field2610.substring(0, 40);
        }
        if (this.field2611.length() > 40) {
            this.field2611 = this.field2611.substring(0, 40);
        }
        if (this.field2612.length() > 10) {
            this.field2612 = this.field2612.substring(0, 10);
        }
        if (this.field2595.length() > 10) {
            this.field2595 = this.field2595.substring(0, 10);
        }
    }

    @ObfuscatedName("fw.r(Lds;I)V")
    public void method2949(class119 arg0) {
        arg0.method2330(6);
        arg0.method2330(this.field2596);
        arg0.method2330(this.field2597 ? 1 : 0);
        arg0.method2330(this.field2598);
        arg0.method2330(this.field2600);
        arg0.method2330(this.field2601);
        arg0.method2330(this.field2593);
        arg0.method2330(this.field2603);
        arg0.method2330(this.field2604 ? 1 : 0);
        arg0.method2331(this.field2605);
        arg0.method2330(this.field2606);
        arg0.method2332(this.field2594);
        arg0.method2331(this.field2609);
        arg0.method2337(this.field2610);
        arg0.method2337(this.field2611);
        arg0.method2337(this.field2612);
        arg0.method2337(this.field2595);
        arg0.method2330(this.field2623);
        arg0.method2331(this.field2622);
        arg0.method2337(this.field2618);
        arg0.method2337(this.field2619);
        arg0.method2330(this.field2616);
        arg0.method2330(this.field2617);
        for (int var2 = 0; var2 < this.field2620.length; var2++) {
            arg0.method2496(this.field2620[var2]);
        }
        arg0.method2496(this.field2621);
    }

    @ObfuscatedName("fw.f(B)I")
    public int method2950() {
        byte var1 = 38;
        String var3 = this.field2610;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2611;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2612;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2595;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2618;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2619;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
