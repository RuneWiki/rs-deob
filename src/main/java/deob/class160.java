package deob;

@ObfuscatedName("fy")
public class class160 extends class208 {

    @ObfuscatedName("fy.q")
    public int field2596;

    @ObfuscatedName("fy.h")
    public boolean field2608;

    @ObfuscatedName("fy.p")
    public int field2601;

    @ObfuscatedName("fy.az")
    public int field2604;

    @ObfuscatedName("fy.av")
    public int field2605;

    @ObfuscatedName("fy.al")
    public int field2606;

    @ObfuscatedName("fy.aw")
    public int field2627;

    @ObfuscatedName("fy.ac")
    public boolean field2597;

    @ObfuscatedName("fy.ai")
    public int field2617;

    @ObfuscatedName("fy.aj")
    public int field2610;

    @ObfuscatedName("fy.ay")
    public int field2611;

    @ObfuscatedName("fy.ap")
    public int field2612;

    @ObfuscatedName("fy.ax")
    public String field2613;

    @ObfuscatedName("fy.aa")
    public String field2614;

    @ObfuscatedName("fy.ae")
    public String field2615;

    @ObfuscatedName("fy.ao")
    public String field2616;

    @ObfuscatedName("fy.am")
    public int field2595;

    @ObfuscatedName("fy.aq")
    public int field2618;

    @ObfuscatedName("fy.ak")
    public int field2619;

    @ObfuscatedName("fy.at")
    public int field2607;

    @ObfuscatedName("fy.as")
    public String field2621;

    @ObfuscatedName("fy.ag")
    public String field2622;

    @ObfuscatedName("fy.ad")
    public int[] field2623 = new int[3];

    @ObfuscatedName("fy.bw")
    public int field2624;

    public class160(boolean arg0) {
        if (arg0) {
            if (Statics.field764.startsWith("win")) {
                this.field2596 = 1;
            } else if (Statics.field764.startsWith("mac")) {
                this.field2596 = 2;
            } else if (Statics.field764.startsWith("linux")) {
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
                this.field2608 = true;
            } else {
                this.field2608 = false;
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
            this.field2627 = var18;
            this.field2597 = false;
            this.field2617 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
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
        if (this.field2615 == null) {
            this.field2615 = "";
        }
        if (this.field2616 == null) {
            this.field2616 = "";
        }
        if (this.field2621 == null) {
            this.field2621 = "";
        }
        if (this.field2622 == null) {
            this.field2622 = "";
        }
        this.method2953();
    }

    @ObfuscatedName("fy.i(I)V")
    public void method2953() {
        if (this.field2613.length() > 40) {
            this.field2613 = this.field2613.substring(0, 40);
        }
        if (this.field2614.length() > 40) {
            this.field2614 = this.field2614.substring(0, 40);
        }
        if (this.field2615.length() > 10) {
            this.field2615 = this.field2615.substring(0, 10);
        }
        if (this.field2616.length() > 10) {
            this.field2616 = this.field2616.substring(0, 10);
        }
    }

    @ObfuscatedName("fy.v(Ldx;B)V")
    public void method2954(class119 arg0) {
        arg0.method2436(6);
        arg0.method2436(this.field2596);
        arg0.method2436(this.field2608 ? 1 : 0);
        arg0.method2436(this.field2601);
        arg0.method2436(this.field2604);
        arg0.method2436(this.field2605);
        arg0.method2436(this.field2606);
        arg0.method2436(this.field2627);
        arg0.method2436(this.field2597 ? 1 : 0);
        arg0.method2331(this.field2617);
        arg0.method2436(this.field2610);
        arg0.method2467(this.field2611);
        arg0.method2331(this.field2612);
        arg0.method2337(this.field2613);
        arg0.method2337(this.field2614);
        arg0.method2337(this.field2615);
        arg0.method2337(this.field2616);
        arg0.method2436(this.field2618);
        arg0.method2331(this.field2595);
        arg0.method2337(this.field2621);
        arg0.method2337(this.field2622);
        arg0.method2436(this.field2619);
        arg0.method2436(this.field2607);
        for (int var2 = 0; var2 < this.field2623.length; var2++) {
            arg0.method2333(this.field2623[var2]);
        }
        arg0.method2333(this.field2624);
    }

    @ObfuscatedName("fy.r(I)I")
    public int method2963() {
        byte var1 = 38;
        String var3 = this.field2613;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2614;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2615;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2616;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2621;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2622;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
