package deob;

@ObfuscatedName("fy")
public class class160 extends class208 {

    @ObfuscatedName("fy.d")
    public int field2594;

    @ObfuscatedName("fy.l")
    public boolean field2605;

    @ObfuscatedName("fy.w")
    public int field2599;

    @ObfuscatedName("fy.as")
    public int field2602;

    @ObfuscatedName("fy.ag")
    public int field2603;

    @ObfuscatedName("fy.au")
    public int field2604;

    @ObfuscatedName("fy.ar")
    public int field2613;

    @ObfuscatedName("fy.az")
    public boolean field2597;

    @ObfuscatedName("fy.aw")
    public int field2607;

    @ObfuscatedName("fy.ap")
    public int field2590;

    @ObfuscatedName("fy.aq")
    public int field2609;

    @ObfuscatedName("fy.aa")
    public int field2608;

    @ObfuscatedName("fy.ax")
    public String field2611;

    @ObfuscatedName("fy.ah")
    public String field2612;

    @ObfuscatedName("fy.av")
    public String field2606;

    @ObfuscatedName("fy.af")
    public String field2614;

    @ObfuscatedName("fy.ai")
    public int field2615;

    @ObfuscatedName("fy.ak")
    public int field2616;

    @ObfuscatedName("fy.ab")
    public int field2617;

    @ObfuscatedName("fy.aj")
    public int field2618;

    @ObfuscatedName("fy.ac")
    public String field2600;

    @ObfuscatedName("fy.am")
    public String field2620;

    @ObfuscatedName("fy.an")
    public int[] field2621 = new int[3];

    @ObfuscatedName("fy.ba")
    public int field2622;

    public class160(boolean arg0) {
        if (arg0) {
            if (Statics.field125.startsWith("win")) {
                this.field2594 = 1;
            } else if (Statics.field125.startsWith("mac")) {
                this.field2594 = 2;
            } else if (Statics.field125.startsWith("linux")) {
                this.field2594 = 3;
            } else {
                this.field2594 = 4;
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
                this.field2605 = true;
            } else {
                this.field2605 = false;
            }
            if (this.field2594 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2599 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2599 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2599 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2599 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2599 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2599 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2599 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2599 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2599 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2599 = 10;
                }
            } else if (this.field2594 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2599 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2599 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2599 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2599 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2599 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2599 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2599 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2602 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2602 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2602 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2602 = 4;
            } else {
                this.field2602 = 5;
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
            this.field2604 = var14;
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
            this.field2613 = var18;
            this.field2597 = false;
            this.field2607 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2603 > 3) {
                this.field2590 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2590 = 0;
            }
            this.field2609 = 0;
        }
        if (this.field2611 == null) {
            this.field2611 = "";
        }
        if (this.field2612 == null) {
            this.field2612 = "";
        }
        if (this.field2606 == null) {
            this.field2606 = "";
        }
        if (this.field2614 == null) {
            this.field2614 = "";
        }
        if (this.field2600 == null) {
            this.field2600 = "";
        }
        if (this.field2620 == null) {
            this.field2620 = "";
        }
        this.method2970();
    }

    @ObfuscatedName("fy.k(S)V")
    public void method2970() {
        if (this.field2611.length() > 40) {
            this.field2611 = this.field2611.substring(0, 40);
        }
        if (this.field2612.length() > 40) {
            this.field2612 = this.field2612.substring(0, 40);
        }
        if (this.field2606.length() > 10) {
            this.field2606 = this.field2606.substring(0, 10);
        }
        if (this.field2614.length() > 10) {
            this.field2614 = this.field2614.substring(0, 10);
        }
    }

    @ObfuscatedName("fy.h(Ldk;S)V")
    public void method2969(class119 arg0) {
        arg0.method2315(6);
        arg0.method2315(this.field2594);
        arg0.method2315(this.field2605 ? 1 : 0);
        arg0.method2315(this.field2599);
        arg0.method2315(this.field2602);
        arg0.method2315(this.field2603);
        arg0.method2315(this.field2604);
        arg0.method2315(this.field2613);
        arg0.method2315(this.field2597 ? 1 : 0);
        arg0.method2316(this.field2607);
        arg0.method2315(this.field2590);
        arg0.method2317(this.field2609);
        arg0.method2316(this.field2608);
        arg0.method2322(this.field2611);
        arg0.method2322(this.field2612);
        arg0.method2322(this.field2606);
        arg0.method2322(this.field2614);
        arg0.method2315(this.field2616);
        arg0.method2316(this.field2615);
        arg0.method2322(this.field2600);
        arg0.method2322(this.field2620);
        arg0.method2315(this.field2617);
        arg0.method2315(this.field2618);
        for (int var2 = 0; var2 < this.field2621.length; var2++) {
            arg0.method2318(this.field2621[var2]);
        }
        arg0.method2318(this.field2622);
    }

    @ObfuscatedName("fy.o(B)I")
    public int method2966() {
        byte var1 = 38;
        String var3 = this.field2611;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2612;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2606;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2614;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2600;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2620;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
