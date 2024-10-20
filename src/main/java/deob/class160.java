package deob;

@ObfuscatedName("fe")
public class class160 extends class208 {

    @ObfuscatedName("fe.j")
    public int field2610;

    @ObfuscatedName("fe.i")
    public boolean field2611;

    @ObfuscatedName("fe.z")
    public int field2579;

    @ObfuscatedName("fe.ar")
    public int field2593;

    @ObfuscatedName("fe.ah")
    public int field2596;

    @ObfuscatedName("fe.ab")
    public int field2585;

    @ObfuscatedName("fe.au")
    public int field2598;

    @ObfuscatedName("fe.ao")
    public boolean field2599;

    @ObfuscatedName("fe.am")
    public int field2600;

    @ObfuscatedName("fe.aj")
    public int field2602;

    @ObfuscatedName("fe.at")
    public int field2603;

    @ObfuscatedName("fe.az")
    public int field2604;

    @ObfuscatedName("fe.ai")
    public String field2605;

    @ObfuscatedName("fe.af")
    public String field2587;

    @ObfuscatedName("fe.aw")
    public String field2607;

    @ObfuscatedName("fe.al")
    public String field2608;

    @ObfuscatedName("fe.ax")
    public int field2606;

    @ObfuscatedName("fe.ag")
    public int field2609;

    @ObfuscatedName("fe.ak")
    public int field2617;

    @ObfuscatedName("fe.ad")
    public int field2612;

    @ObfuscatedName("fe.ae")
    public String field2613;

    @ObfuscatedName("fe.as")
    public String field2614;

    @ObfuscatedName("fe.ay")
    public int[] field2584 = new int[3];

    @ObfuscatedName("fe.bz")
    public int field2616;

    public class160(boolean arg0) {
        if (arg0) {
            if (Statics.field2196.startsWith("win")) {
                this.field2610 = 1;
            } else if (Statics.field2196.startsWith("mac")) {
                this.field2610 = 2;
            } else if (Statics.field2196.startsWith("linux")) {
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
                this.field2611 = true;
            } else {
                this.field2611 = false;
            }
            if (this.field2610 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2579 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2579 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2579 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2579 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2579 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2579 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2579 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2579 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2579 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2579 = 10;
                }
            } else if (this.field2610 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2579 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2579 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2579 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2579 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2579 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2579 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2579 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2593 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2593 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2593 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2593 = 4;
            } else {
                this.field2593 = 5;
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
            this.field2596 = var10;
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
            this.field2585 = var14;
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
            this.field2599 = false;
            this.field2600 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2596 > 3) {
                this.field2602 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2602 = 0;
            }
            this.field2603 = 0;
        }
        if (this.field2605 == null) {
            this.field2605 = "";
        }
        if (this.field2587 == null) {
            this.field2587 = "";
        }
        if (this.field2607 == null) {
            this.field2607 = "";
        }
        if (this.field2608 == null) {
            this.field2608 = "";
        }
        if (this.field2613 == null) {
            this.field2613 = "";
        }
        if (this.field2614 == null) {
            this.field2614 = "";
        }
        this.method3008();
    }

    @ObfuscatedName("fe.m(I)V")
    public void method3008() {
        if (this.field2605.length() > 40) {
            this.field2605 = this.field2605.substring(0, 40);
        }
        if (this.field2587.length() > 40) {
            this.field2587 = this.field2587.substring(0, 40);
        }
        if (this.field2607.length() > 10) {
            this.field2607 = this.field2607.substring(0, 10);
        }
        if (this.field2608.length() > 10) {
            this.field2608 = this.field2608.substring(0, 10);
        }
    }

    @ObfuscatedName("fe.l(Ldx;I)V")
    public void method3011(class119 arg0) {
        arg0.method2366(6);
        arg0.method2366(this.field2610);
        arg0.method2366(this.field2611 ? 1 : 0);
        arg0.method2366(this.field2579);
        arg0.method2366(this.field2593);
        arg0.method2366(this.field2596);
        arg0.method2366(this.field2585);
        arg0.method2366(this.field2598);
        arg0.method2366(this.field2599 ? 1 : 0);
        arg0.method2466(this.field2600);
        arg0.method2366(this.field2602);
        arg0.method2381(this.field2603);
        arg0.method2466(this.field2604);
        arg0.method2373(this.field2605);
        arg0.method2373(this.field2587);
        arg0.method2373(this.field2607);
        arg0.method2373(this.field2608);
        arg0.method2366(this.field2609);
        arg0.method2466(this.field2606);
        arg0.method2373(this.field2613);
        arg0.method2373(this.field2614);
        arg0.method2366(this.field2617);
        arg0.method2366(this.field2612);
        for (int var2 = 0; var2 < this.field2584.length; var2++) {
            arg0.method2514(this.field2584[var2]);
        }
        arg0.method2514(this.field2616);
    }

    @ObfuscatedName("fe.y(S)I")
    public int method3014() {
        byte var1 = 38;
        String var3 = this.field2605;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2587;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2607;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2608;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2613;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2614;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
