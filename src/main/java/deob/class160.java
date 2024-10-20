package deob;

@ObfuscatedName("fm")
public class class160 extends class208 {

    @ObfuscatedName("fm.c")
    public int field2590;

    @ObfuscatedName("fm.f")
    public boolean field2609;

    @ObfuscatedName("fm.b")
    public int field2596;

    @ObfuscatedName("fm.ax")
    public int field2598;

    @ObfuscatedName("fm.ap")
    public int field2601;

    @ObfuscatedName("fm.as")
    public int field2600;

    @ObfuscatedName("fm.av")
    public int field2603;

    @ObfuscatedName("fm.am")
    public boolean field2602;

    @ObfuscatedName("fm.aa")
    public int field2608;

    @ObfuscatedName("fm.ad")
    public int field2604;

    @ObfuscatedName("fm.ag")
    public int field2593;

    @ObfuscatedName("fm.ae")
    public int field2605;

    @ObfuscatedName("fm.ak")
    public String field2607;

    @ObfuscatedName("fm.az")
    public String field2615;

    @ObfuscatedName("fm.ac")
    public String field2592;

    @ObfuscatedName("fm.ay")
    public String field2610;

    @ObfuscatedName("fm.al")
    public int field2611;

    @ObfuscatedName("fm.at")
    public int field2612;

    @ObfuscatedName("fm.aj")
    public int field2613;

    @ObfuscatedName("fm.aw")
    public int field2587;

    @ObfuscatedName("fm.au")
    public String field2616;

    @ObfuscatedName("fm.ah")
    public String field2599;

    @ObfuscatedName("fm.an")
    public int[] field2617 = new int[3];

    @ObfuscatedName("fm.bm")
    public int field2618;

    public class160(boolean arg0) {
        if (arg0) {
            if (Statics.field2023.startsWith("win")) {
                this.field2590 = 1;
            } else if (Statics.field2023.startsWith("mac")) {
                this.field2590 = 2;
            } else if (Statics.field2023.startsWith("linux")) {
                this.field2590 = 3;
            } else {
                this.field2590 = 4;
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
                this.field2609 = true;
            } else {
                this.field2609 = false;
            }
            if (this.field2590 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2596 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2596 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2596 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2596 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2596 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2596 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2596 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2596 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2596 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2596 = 10;
                }
            } else if (this.field2590 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2596 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2596 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2596 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2596 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2596 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2596 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2596 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2598 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2598 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2598 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2598 = 4;
            } else {
                this.field2598 = 5;
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
            this.field2600 = var14;
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
            this.field2602 = false;
            this.field2608 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2601 > 3) {
                this.field2604 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2604 = 0;
            }
            this.field2593 = 0;
        }
        if (this.field2607 == null) {
            this.field2607 = "";
        }
        if (this.field2615 == null) {
            this.field2615 = "";
        }
        if (this.field2592 == null) {
            this.field2592 = "";
        }
        if (this.field2610 == null) {
            this.field2610 = "";
        }
        if (this.field2616 == null) {
            this.field2616 = "";
        }
        if (this.field2599 == null) {
            this.field2599 = "";
        }
        this.method2934();
    }

    @ObfuscatedName("fm.h(B)V")
    public void method2934() {
        if (this.field2607.length() > 40) {
            this.field2607 = this.field2607.substring(0, 40);
        }
        if (this.field2615.length() > 40) {
            this.field2615 = this.field2615.substring(0, 40);
        }
        if (this.field2592.length() > 10) {
            this.field2592 = this.field2592.substring(0, 10);
        }
        if (this.field2610.length() > 10) {
            this.field2610 = this.field2610.substring(0, 10);
        }
    }

    @ObfuscatedName("fm.m(Ldp;I)V")
    public void method2935(class119 arg0) {
        arg0.method2305(6);
        arg0.method2305(this.field2590);
        arg0.method2305(this.field2609 ? 1 : 0);
        arg0.method2305(this.field2596);
        arg0.method2305(this.field2598);
        arg0.method2305(this.field2601);
        arg0.method2305(this.field2600);
        arg0.method2305(this.field2603);
        arg0.method2305(this.field2602 ? 1 : 0);
        arg0.method2501(this.field2608);
        arg0.method2305(this.field2604);
        arg0.method2512(this.field2593);
        arg0.method2501(this.field2605);
        arg0.method2312(this.field2607);
        arg0.method2312(this.field2615);
        arg0.method2312(this.field2592);
        arg0.method2312(this.field2610);
        arg0.method2305(this.field2612);
        arg0.method2501(this.field2611);
        arg0.method2312(this.field2616);
        arg0.method2312(this.field2599);
        arg0.method2305(this.field2613);
        arg0.method2305(this.field2587);
        for (int var2 = 0; var2 < this.field2617.length; var2++) {
            arg0.method2308(this.field2617[var2]);
        }
        arg0.method2308(this.field2618);
    }

    @ObfuscatedName("fm.i(I)I")
    public int method2936() {
        byte var1 = 38;
        String var3 = this.field2607;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2615;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2592;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2610;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2616;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2599;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
