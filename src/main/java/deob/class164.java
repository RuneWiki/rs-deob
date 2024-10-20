package deob;

@ObfuscatedName("fz")
public class class164 extends class212 {

    @ObfuscatedName("fz.b")
    public int field2668;

    @ObfuscatedName("fz.m")
    public boolean field2647;

    @ObfuscatedName("fz.s")
    public int field2656;

    @ObfuscatedName("fz.ar")
    public int field2652;

    @ObfuscatedName("fz.ae")
    public int field2653;

    @ObfuscatedName("fz.ac")
    public int field2654;

    @ObfuscatedName("fz.aw")
    public int field2655;

    @ObfuscatedName("fz.am")
    public boolean field2648;

    @ObfuscatedName("fz.aq")
    public int field2657;

    @ObfuscatedName("fz.aa")
    public int field2658;

    @ObfuscatedName("fz.ao")
    public int field2659;

    @ObfuscatedName("fz.ai")
    public int field2660;

    @ObfuscatedName("fz.ap")
    public String field2645;

    @ObfuscatedName("fz.ak")
    public String field2662;

    @ObfuscatedName("fz.ag")
    public String field2663;

    @ObfuscatedName("fz.az")
    public String field2664;

    @ObfuscatedName("fz.au")
    public int field2644;

    @ObfuscatedName("fz.af")
    public int field2666;

    @ObfuscatedName("fz.al")
    public int field2665;

    @ObfuscatedName("fz.av")
    public int field2661;

    @ObfuscatedName("fz.ad")
    public String field2669;

    @ObfuscatedName("fz.an")
    public String field2670;

    @ObfuscatedName("fz.ab")
    public int[] field2671 = new int[3];

    @ObfuscatedName("fz.bc")
    public int field2672;

    public class164(boolean arg0) {
        if (arg0) {
            if (Statics.field591.startsWith("win")) {
                this.field2668 = 1;
            } else if (Statics.field591.startsWith("mac")) {
                this.field2668 = 2;
            } else if (Statics.field591.startsWith("linux")) {
                this.field2668 = 3;
            } else {
                this.field2668 = 4;
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
                this.field2647 = true;
            } else {
                this.field2647 = false;
            }
            if (this.field2668 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2656 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2656 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2656 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2656 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2656 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2656 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2656 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2656 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2656 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2656 = 10;
                }
            } else if (this.field2668 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2656 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2656 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2656 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2656 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2656 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2656 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2656 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2652 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2652 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2652 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2652 = 4;
            } else {
                this.field2652 = 5;
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
            this.field2653 = var10;
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
            this.field2654 = var14;
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
            this.field2655 = var18;
            this.field2648 = false;
            this.field2657 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2653 > 3) {
                this.field2658 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2658 = 0;
            }
            this.field2659 = 0;
        }
        if (this.field2645 == null) {
            this.field2645 = "";
        }
        if (this.field2662 == null) {
            this.field2662 = "";
        }
        if (this.field2663 == null) {
            this.field2663 = "";
        }
        if (this.field2664 == null) {
            this.field2664 = "";
        }
        if (this.field2669 == null) {
            this.field2669 = "";
        }
        if (this.field2670 == null) {
            this.field2670 = "";
        }
        this.method3002();
    }

    @ObfuscatedName("fz.f(B)V")
    public void method3002() {
        if (this.field2645.length() > 40) {
            this.field2645 = this.field2645.substring(0, 40);
        }
        if (this.field2662.length() > 40) {
            this.field2662 = this.field2662.substring(0, 40);
        }
        if (this.field2663.length() > 10) {
            this.field2663 = this.field2663.substring(0, 10);
        }
        if (this.field2664.length() > 10) {
            this.field2664 = this.field2664.substring(0, 10);
        }
    }

    @ObfuscatedName("fz.e(Ldx;B)V")
    public void method3003(class123 arg0) {
        arg0.method2384(6);
        arg0.method2384(this.field2668);
        arg0.method2384(this.field2647 ? 1 : 0);
        arg0.method2384(this.field2656);
        arg0.method2384(this.field2652);
        arg0.method2384(this.field2653);
        arg0.method2384(this.field2654);
        arg0.method2384(this.field2655);
        arg0.method2384(this.field2648 ? 1 : 0);
        arg0.method2385(this.field2657);
        arg0.method2384(this.field2658);
        arg0.method2386(this.field2659);
        arg0.method2385(this.field2660);
        arg0.method2391(this.field2645);
        arg0.method2391(this.field2662);
        arg0.method2391(this.field2663);
        arg0.method2391(this.field2664);
        arg0.method2384(this.field2666);
        arg0.method2385(this.field2644);
        arg0.method2391(this.field2669);
        arg0.method2391(this.field2670);
        arg0.method2384(this.field2665);
        arg0.method2384(this.field2661);
        for (int var2 = 0; var2 < this.field2671.length; var2++) {
            arg0.method2387(this.field2671[var2]);
        }
        arg0.method2387(this.field2672);
    }

    @ObfuscatedName("fz.n(I)I")
    public int method3004() {
        byte var1 = 38;
        int var2 = var1 + class123.method648(this.field2645);
        int var3 = var2 + class123.method648(this.field2662);
        int var4 = var3 + class123.method648(this.field2663);
        int var5 = var4 + class123.method648(this.field2664);
        int var6 = var5 + class123.method648(this.field2669);
        return var6 + class123.method648(this.field2670);
    }
}
