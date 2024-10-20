package deob;

@ObfuscatedName("fc")
public class class161 extends class209 {

    @ObfuscatedName("fc.y")
    public int field2643;

    @ObfuscatedName("fc.m")
    public boolean field2636;

    @ObfuscatedName("fc.g")
    public int field2659;

    @ObfuscatedName("fc.ai")
    public int field2641;

    @ObfuscatedName("fc.ab")
    public int field2642;

    @ObfuscatedName("fc.av")
    public int field2644;

    @ObfuscatedName("fc.ac")
    public int field2633;

    @ObfuscatedName("fc.ah")
    public boolean field2645;

    @ObfuscatedName("fc.ae")
    public int field2646;

    @ObfuscatedName("fc.az")
    public int field2658;

    @ObfuscatedName("fc.ag")
    public int field2648;

    @ObfuscatedName("fc.ad")
    public int field2649;

    @ObfuscatedName("fc.au")
    public String field2663;

    @ObfuscatedName("fc.ao")
    public String field2651;

    @ObfuscatedName("fc.ak")
    public String field2652;

    @ObfuscatedName("fc.at")
    public String field2653;

    @ObfuscatedName("fc.aw")
    public int field2654;

    @ObfuscatedName("fc.as")
    public int field2655;

    @ObfuscatedName("fc.aq")
    public int field2656;

    @ObfuscatedName("fc.ax")
    public int field2657;

    @ObfuscatedName("fc.an")
    public String field2647;

    @ObfuscatedName("fc.aa")
    public String field2640;

    @ObfuscatedName("fc.ap")
    public int[] field2660 = new int[3];

    @ObfuscatedName("fc.bd")
    public int field2650;

    public class161(boolean arg0) {
        if (arg0) {
            if (Statics.field1169.startsWith("win")) {
                this.field2643 = 1;
            } else if (Statics.field1169.startsWith("mac")) {
                this.field2643 = 2;
            } else if (Statics.field1169.startsWith("linux")) {
                this.field2643 = 3;
            } else {
                this.field2643 = 4;
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
                this.field2636 = true;
            } else {
                this.field2636 = false;
            }
            if (this.field2643 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2659 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2659 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2659 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2659 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2659 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2659 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2659 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2659 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2659 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2659 = 10;
                }
            } else if (this.field2643 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2659 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2659 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2659 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2659 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2659 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2659 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2659 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2641 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2641 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2641 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2641 = 4;
            } else {
                this.field2641 = 5;
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
            this.field2642 = var10;
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
            this.field2644 = var14;
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
            this.field2633 = var18;
            this.field2645 = false;
            this.field2646 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2642 > 3) {
                this.field2658 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2658 = 0;
            }
            this.field2648 = 0;
        }
        if (this.field2663 == null) {
            this.field2663 = "";
        }
        if (this.field2651 == null) {
            this.field2651 = "";
        }
        if (this.field2652 == null) {
            this.field2652 = "";
        }
        if (this.field2653 == null) {
            this.field2653 = "";
        }
        if (this.field2647 == null) {
            this.field2647 = "";
        }
        if (this.field2640 == null) {
            this.field2640 = "";
        }
        this.method2992();
    }

    @ObfuscatedName("fc.w(B)V")
    public void method2992() {
        if (this.field2663.length() > 40) {
            this.field2663 = this.field2663.substring(0, 40);
        }
        if (this.field2651.length() > 40) {
            this.field2651 = this.field2651.substring(0, 40);
        }
        if (this.field2652.length() > 10) {
            this.field2652 = this.field2652.substring(0, 10);
        }
        if (this.field2653.length() > 10) {
            this.field2653 = this.field2653.substring(0, 10);
        }
    }

    @ObfuscatedName("fc.x(Lde;I)V")
    public void method2993(class120 arg0) {
        arg0.method2430(6);
        arg0.method2430(this.field2643);
        arg0.method2430(this.field2636 ? 1 : 0);
        arg0.method2430(this.field2659);
        arg0.method2430(this.field2641);
        arg0.method2430(this.field2642);
        arg0.method2430(this.field2644);
        arg0.method2430(this.field2633);
        arg0.method2430(this.field2645 ? 1 : 0);
        arg0.method2349(this.field2646);
        arg0.method2430(this.field2658);
        arg0.method2510(this.field2648);
        arg0.method2349(this.field2649);
        arg0.method2426(this.field2663);
        arg0.method2426(this.field2651);
        arg0.method2426(this.field2652);
        arg0.method2426(this.field2653);
        arg0.method2430(this.field2655);
        arg0.method2349(this.field2654);
        arg0.method2426(this.field2647);
        arg0.method2426(this.field2640);
        arg0.method2430(this.field2656);
        arg0.method2430(this.field2657);
        for (int var2 = 0; var2 < this.field2660.length; var2++) {
            arg0.method2351(this.field2660[var2]);
        }
        arg0.method2351(this.field2650);
    }

    @ObfuscatedName("fc.t(I)I")
    public int method2995() {
        byte var1 = 38;
        int var2 = var1 + class120.method131(this.field2663);
        int var3 = var2 + class120.method131(this.field2651);
        int var4 = var3 + class120.method131(this.field2652);
        int var5 = var4 + class120.method131(this.field2653);
        int var6 = var5 + class120.method131(this.field2647);
        return var6 + class120.method131(this.field2640);
    }
}
