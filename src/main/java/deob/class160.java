package deob;

@ObfuscatedName("fr")
public class class160 extends class208 {

    @ObfuscatedName("fr.u")
    public int field2596;

    @ObfuscatedName("fr.m")
    public boolean field2620;

    @ObfuscatedName("fr.k")
    public int field2601;

    @ObfuscatedName("fr.al")
    public int field2604;

    @ObfuscatedName("fr.am")
    public int field2605;

    @ObfuscatedName("fr.ae")
    public int field2606;

    @ObfuscatedName("fr.ai")
    public int field2616;

    @ObfuscatedName("fr.aa")
    public boolean field2608;

    @ObfuscatedName("fr.ag")
    public int field2618;

    @ObfuscatedName("fr.ap")
    public int field2610;

    @ObfuscatedName("fr.ax")
    public int field2611;

    @ObfuscatedName("fr.af")
    public int field2594;

    @ObfuscatedName("fr.av")
    public String field2613;

    @ObfuscatedName("fr.au")
    public String field2614;

    @ObfuscatedName("fr.ad")
    public String field2612;

    @ObfuscatedName("fr.ab")
    public String field2597;

    @ObfuscatedName("fr.ao")
    public int field2617;

    @ObfuscatedName("fr.az")
    public int field2619;

    @ObfuscatedName("fr.aj")
    public int field2615;

    @ObfuscatedName("fr.ak")
    public int field2607;

    @ObfuscatedName("fr.aw")
    public String field2623;

    @ObfuscatedName("fr.at")
    public String field2622;

    @ObfuscatedName("fr.aq")
    public int[] field2609 = new int[3];

    @ObfuscatedName("fr.bo")
    public int field2624;

    public class160(boolean arg0) {
        if (arg0) {
            if (Statics.field1065.startsWith("win")) {
                this.field2596 = 1;
            } else if (Statics.field1065.startsWith("mac")) {
                this.field2596 = 2;
            } else if (Statics.field1065.startsWith("linux")) {
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
                this.field2620 = true;
            } else {
                this.field2620 = false;
            }
            if (this.field2596 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2601 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2601 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2601 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2601 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2601 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2601 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2601 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2601 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2601 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2601 = 10;
                }
            } else if (this.field2596 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2601 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2601 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2601 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2601 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2601 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2601 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2601 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2604 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2604 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2604 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2604 = 4;
            } else {
                this.field2604 = 5;
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
            this.field2605 = var10;
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
            this.field2606 = var14;
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
            this.field2616 = var18;
            this.field2608 = false;
            this.field2618 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2605 > 3) {
                this.field2610 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2610 = 0;
            }
            this.field2611 = 0;
        }
        if (this.field2613 == null) {
            this.field2613 = "";
        }
        if (this.field2614 == null) {
            this.field2614 = "";
        }
        if (this.field2612 == null) {
            this.field2612 = "";
        }
        if (this.field2597 == null) {
            this.field2597 = "";
        }
        if (this.field2623 == null) {
            this.field2623 = "";
        }
        if (this.field2622 == null) {
            this.field2622 = "";
        }
        this.method2903();
    }

    @ObfuscatedName("fr.o(I)V")
    public void method2903() {
        if (this.field2613.length() > 40) {
            this.field2613 = this.field2613.substring(0, 40);
        }
        if (this.field2614.length() > 40) {
            this.field2614 = this.field2614.substring(0, 40);
        }
        if (this.field2612.length() > 10) {
            this.field2612 = this.field2612.substring(0, 10);
        }
        if (this.field2597.length() > 10) {
            this.field2597 = this.field2597.substring(0, 10);
        }
    }

    @ObfuscatedName("fr.f(Ldc;S)V")
    public void method2897(class119 arg0) {
        arg0.method2347(6);
        arg0.method2347(this.field2596);
        arg0.method2347(this.field2620 ? 1 : 0);
        arg0.method2347(this.field2601);
        arg0.method2347(this.field2604);
        arg0.method2347(this.field2605);
        arg0.method2347(this.field2606);
        arg0.method2347(this.field2616);
        arg0.method2347(this.field2608 ? 1 : 0);
        arg0.method2318(this.field2618);
        arg0.method2347(this.field2610);
        arg0.method2277(this.field2611);
        arg0.method2318(this.field2594);
        arg0.method2282(this.field2613);
        arg0.method2282(this.field2614);
        arg0.method2282(this.field2612);
        arg0.method2282(this.field2597);
        arg0.method2347(this.field2619);
        arg0.method2318(this.field2617);
        arg0.method2282(this.field2623);
        arg0.method2282(this.field2622);
        arg0.method2347(this.field2615);
        arg0.method2347(this.field2607);
        for (int var2 = 0; var2 < this.field2609.length; var2++) {
            arg0.method2278(this.field2609[var2]);
        }
        arg0.method2278(this.field2624);
    }

    @ObfuscatedName("fr.i(I)I")
    public int method2898() {
        byte var1 = 38;
        int var2 = var1 + class119.method587(this.field2613);
        int var3 = var2 + class119.method587(this.field2614);
        int var4 = var3 + class119.method587(this.field2612);
        int var5 = var4 + class119.method587(this.field2597);
        int var6 = var5 + class119.method587(this.field2623);
        return var6 + class119.method587(this.field2622);
    }
}
