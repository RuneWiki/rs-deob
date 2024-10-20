package deob;

@ObfuscatedName("fn")
public class class161 extends class209 {

    @ObfuscatedName("fn.r")
    public int field2639;

    @ObfuscatedName("fn.f")
    public boolean field2659;

    @ObfuscatedName("fn.w")
    public int field2643;

    @ObfuscatedName("fn.av")
    public int field2644;

    @ObfuscatedName("fn.ar")
    public int field2645;

    @ObfuscatedName("fn.ay")
    public int field2646;

    @ObfuscatedName("fn.aq")
    public int field2647;

    @ObfuscatedName("fn.ai")
    public boolean field2648;

    @ObfuscatedName("fn.an")
    public int field2640;

    @ObfuscatedName("fn.ap")
    public int field2662;

    @ObfuscatedName("fn.ac")
    public int field2660;

    @ObfuscatedName("fn.ao")
    public int field2652;

    @ObfuscatedName("fn.aj")
    public String field2653;

    @ObfuscatedName("fn.ah")
    public String field2654;

    @ObfuscatedName("fn.ae")
    public String field2655;

    @ObfuscatedName("fn.aa")
    public String field2656;

    @ObfuscatedName("fn.au")
    public int field2657;

    @ObfuscatedName("fn.ab")
    public int field2658;

    @ObfuscatedName("fn.am")
    public int field2636;

    @ObfuscatedName("fn.at")
    public int field2650;

    @ObfuscatedName("fn.az")
    public String field2661;

    @ObfuscatedName("fn.af")
    public String field2664;

    @ObfuscatedName("fn.ax")
    public int[] field2663 = new int[3];

    @ObfuscatedName("fn.bf")
    public int field2637;

    public class161(boolean arg0) {
        if (arg0) {
            if (Statics.field1777.startsWith("win")) {
                this.field2639 = 1;
            } else if (Statics.field1777.startsWith("mac")) {
                this.field2639 = 2;
            } else if (Statics.field1777.startsWith("linux")) {
                this.field2639 = 3;
            } else {
                this.field2639 = 4;
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
                this.field2659 = true;
            } else {
                this.field2659 = false;
            }
            if (this.field2639 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2643 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2643 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2643 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2643 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2643 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2643 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2643 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2643 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2643 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2643 = 10;
                }
            } else if (this.field2639 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2643 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2643 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2643 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2643 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2643 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2643 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2643 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2644 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2644 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2644 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2644 = 4;
            } else {
                this.field2644 = 5;
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
            this.field2645 = var10;
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
            this.field2646 = var14;
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
            this.field2647 = var18;
            this.field2648 = false;
            this.field2640 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2645 > 3) {
                this.field2662 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2662 = 0;
            }
            this.field2660 = 0;
        }
        if (this.field2653 == null) {
            this.field2653 = "";
        }
        if (this.field2654 == null) {
            this.field2654 = "";
        }
        if (this.field2655 == null) {
            this.field2655 = "";
        }
        if (this.field2656 == null) {
            this.field2656 = "";
        }
        if (this.field2661 == null) {
            this.field2661 = "";
        }
        if (this.field2664 == null) {
            this.field2664 = "";
        }
        this.method2929();
    }

    @ObfuscatedName("fn.t(I)V")
    public void method2929() {
        if (this.field2653.length() > 40) {
            this.field2653 = this.field2653.substring(0, 40);
        }
        if (this.field2654.length() > 40) {
            this.field2654 = this.field2654.substring(0, 40);
        }
        if (this.field2655.length() > 10) {
            this.field2655 = this.field2655.substring(0, 10);
        }
        if (this.field2656.length() > 10) {
            this.field2656 = this.field2656.substring(0, 10);
        }
    }

    @ObfuscatedName("fn.i(Ldr;I)V")
    public void method2934(class120 arg0) {
        arg0.method2293(6);
        arg0.method2293(this.field2639);
        arg0.method2293(this.field2659 ? 1 : 0);
        arg0.method2293(this.field2643);
        arg0.method2293(this.field2644);
        arg0.method2293(this.field2645);
        arg0.method2293(this.field2646);
        arg0.method2293(this.field2647);
        arg0.method2293(this.field2648 ? 1 : 0);
        arg0.method2294(this.field2640);
        arg0.method2293(this.field2662);
        arg0.method2295(this.field2660);
        arg0.method2294(this.field2652);
        arg0.method2375(this.field2653);
        arg0.method2375(this.field2654);
        arg0.method2375(this.field2655);
        arg0.method2375(this.field2656);
        arg0.method2293(this.field2658);
        arg0.method2294(this.field2657);
        arg0.method2375(this.field2661);
        arg0.method2375(this.field2664);
        arg0.method2293(this.field2636);
        arg0.method2293(this.field2650);
        for (int var2 = 0; var2 < this.field2663.length; var2++) {
            arg0.method2296(this.field2663[var2]);
        }
        arg0.method2296(this.field2637);
    }

    @ObfuscatedName("fn.g(B)I")
    public int method2931() {
        byte var1 = 38;
        int var2 = var1 + class120.method797(this.field2653);
        int var3 = var2 + class120.method797(this.field2654);
        int var4 = var3 + class120.method797(this.field2655);
        int var5 = var4 + class120.method797(this.field2656);
        int var6 = var5 + class120.method797(this.field2661);
        return var6 + class120.method797(this.field2664);
    }
}
