package deob;

@ObfuscatedName("fj")
public class class160 extends class208 {

    @ObfuscatedName("fj.w")
    public int field2578;

    @ObfuscatedName("fj.u")
    public boolean field2579;

    @ObfuscatedName("fj.f")
    public int field2585;

    @ObfuscatedName("fj.al")
    public int field2609;

    @ObfuscatedName("fj.ax")
    public int field2593;

    @ObfuscatedName("fj.az")
    public int field2591;

    @ObfuscatedName("fj.ad")
    public int field2574;

    @ObfuscatedName("fj.aw")
    public boolean field2610;

    @ObfuscatedName("fj.as")
    public int field2594;

    @ObfuscatedName("fj.aj")
    public int field2589;

    @ObfuscatedName("fj.ar")
    public int field2596;

    @ObfuscatedName("fj.ac")
    public int field2597;

    @ObfuscatedName("fj.aq")
    public String field2598;

    @ObfuscatedName("fj.af")
    public String field2595;

    @ObfuscatedName("fj.aa")
    public String field2600;

    @ObfuscatedName("fj.ab")
    public String field2601;

    @ObfuscatedName("fj.av")
    public int field2602;

    @ObfuscatedName("fj.au")
    public int field2603;

    @ObfuscatedName("fj.ay")
    public int field2573;

    @ObfuscatedName("fj.ag")
    public int field2605;

    @ObfuscatedName("fj.an")
    public String field2606;

    @ObfuscatedName("fj.am")
    public String field2607;

    @ObfuscatedName("fj.at")
    public int[] field2608 = new int[3];

    @ObfuscatedName("fj.bi")
    public int field2588;

    public class160(boolean arg0) {
        if (arg0) {
            if (Statics.field195.startsWith("win")) {
                this.field2578 = 1;
            } else if (Statics.field195.startsWith("mac")) {
                this.field2578 = 2;
            } else if (Statics.field195.startsWith("linux")) {
                this.field2578 = 3;
            } else {
                this.field2578 = 4;
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
                this.field2579 = true;
            } else {
                this.field2579 = false;
            }
            if (this.field2578 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2585 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2585 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2585 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2585 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2585 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2585 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2585 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2585 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2585 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2585 = 10;
                }
            } else if (this.field2578 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2585 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2585 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2585 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2585 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2585 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2585 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2585 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2609 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2609 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2609 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2609 = 4;
            } else {
                this.field2609 = 5;
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
            this.field2593 = var10;
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
            this.field2591 = var14;
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
            this.field2574 = var18;
            this.field2610 = false;
            this.field2594 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2593 > 3) {
                this.field2589 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2589 = 0;
            }
            this.field2596 = 0;
        }
        if (this.field2598 == null) {
            this.field2598 = "";
        }
        if (this.field2595 == null) {
            this.field2595 = "";
        }
        if (this.field2600 == null) {
            this.field2600 = "";
        }
        if (this.field2601 == null) {
            this.field2601 = "";
        }
        if (this.field2606 == null) {
            this.field2606 = "";
        }
        if (this.field2607 == null) {
            this.field2607 = "";
        }
        this.method3007();
    }

    @ObfuscatedName("fj.d(I)V")
    public void method3007() {
        if (this.field2598.length() > 40) {
            this.field2598 = this.field2598.substring(0, 40);
        }
        if (this.field2595.length() > 40) {
            this.field2595 = this.field2595.substring(0, 40);
        }
        if (this.field2600.length() > 10) {
            this.field2600 = this.field2600.substring(0, 10);
        }
        if (this.field2601.length() > 10) {
            this.field2601 = this.field2601.substring(0, 10);
        }
    }

    @ObfuscatedName("fj.p(Ldf;I)V")
    public void method3000(class119 arg0) {
        arg0.method2388(6);
        arg0.method2388(this.field2578);
        arg0.method2388(this.field2579 ? 1 : 0);
        arg0.method2388(this.field2585);
        arg0.method2388(this.field2609);
        arg0.method2388(this.field2593);
        arg0.method2388(this.field2591);
        arg0.method2388(this.field2574);
        arg0.method2388(this.field2610 ? 1 : 0);
        arg0.method2343(this.field2594);
        arg0.method2388(this.field2589);
        arg0.method2344(this.field2596);
        arg0.method2343(this.field2597);
        arg0.method2432(this.field2598);
        arg0.method2432(this.field2595);
        arg0.method2432(this.field2600);
        arg0.method2432(this.field2601);
        arg0.method2388(this.field2603);
        arg0.method2343(this.field2602);
        arg0.method2432(this.field2606);
        arg0.method2432(this.field2607);
        arg0.method2388(this.field2573);
        arg0.method2388(this.field2605);
        for (int var2 = 0; var2 < this.field2608.length; var2++) {
            arg0.method2345(this.field2608[var2]);
        }
        arg0.method2345(this.field2588);
    }

    @ObfuscatedName("fj.v(B)I")
    public int method3001() {
        byte var1 = 38;
        String var3 = this.field2598;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2595;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2600;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2601;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2606;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2607;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
