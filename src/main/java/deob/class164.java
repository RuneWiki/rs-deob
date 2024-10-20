package deob;

@ObfuscatedName("fo")
public class class164 extends class212 {

    @ObfuscatedName("fo.b")
    public int field2673;

    @ObfuscatedName("fo.l")
    public boolean field2674;

    @ObfuscatedName("fo.w")
    public int field2679;

    @ObfuscatedName("fo.aq")
    public int field2677;

    @ObfuscatedName("fo.ax")
    public int field2686;

    @ObfuscatedName("fo.az")
    public int field2678;

    @ObfuscatedName("fo.ap")
    public int field2683;

    @ObfuscatedName("fo.ao")
    public boolean field2695;

    @ObfuscatedName("fo.af")
    public int field2685;

    @ObfuscatedName("fo.ab")
    public int field2688;

    @ObfuscatedName("fo.ay")
    public int field2671;

    @ObfuscatedName("fo.ad")
    public int field2682;

    @ObfuscatedName("fo.am")
    public String field2697;

    @ObfuscatedName("fo.ac")
    public String field2680;

    @ObfuscatedName("fo.aw")
    public String field2692;

    @ObfuscatedName("fo.ak")
    public String field2693;

    @ObfuscatedName("fo.ar")
    public int field2694;

    @ObfuscatedName("fo.aa")
    public int field2690;

    @ObfuscatedName("fo.av")
    public int field2696;

    @ObfuscatedName("fo.aj")
    public int field2681;

    @ObfuscatedName("fo.al")
    public String field2698;

    @ObfuscatedName("fo.ai")
    public String field2699;

    @ObfuscatedName("fo.ae")
    public int[] field2700 = new int[3];

    @ObfuscatedName("fo.bf")
    public int field2701;

    public class164(boolean arg0) {
        if (arg0) {
            if (Statics.field1834.startsWith("win")) {
                this.field2673 = 1;
            } else if (Statics.field1834.startsWith("mac")) {
                this.field2673 = 2;
            } else if (Statics.field1834.startsWith("linux")) {
                this.field2673 = 3;
            } else {
                this.field2673 = 4;
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
                this.field2674 = true;
            } else {
                this.field2674 = false;
            }
            if (this.field2673 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2679 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2679 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2679 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2679 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2679 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2679 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2679 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2679 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2679 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2679 = 10;
                }
            } else if (this.field2673 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2679 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2679 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2679 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2679 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2679 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2679 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2679 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2677 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2677 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2677 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2677 = 4;
            } else {
                this.field2677 = 5;
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
            this.field2686 = var10;
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
            this.field2678 = var14;
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
            this.field2683 = var18;
            this.field2695 = false;
            this.field2685 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2686 > 3) {
                this.field2688 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2688 = 0;
            }
            this.field2671 = 0;
        }
        if (this.field2697 == null) {
            this.field2697 = "";
        }
        if (this.field2680 == null) {
            this.field2680 = "";
        }
        if (this.field2692 == null) {
            this.field2692 = "";
        }
        if (this.field2693 == null) {
            this.field2693 = "";
        }
        if (this.field2698 == null) {
            this.field2698 = "";
        }
        if (this.field2699 == null) {
            this.field2699 = "";
        }
        this.method3001();
    }

    @ObfuscatedName("fo.x(B)V")
    public void method3001() {
        if (this.field2697.length() > 40) {
            this.field2697 = this.field2697.substring(0, 40);
        }
        if (this.field2680.length() > 40) {
            this.field2680 = this.field2680.substring(0, 40);
        }
        if (this.field2692.length() > 10) {
            this.field2692 = this.field2692.substring(0, 10);
        }
        if (this.field2693.length() > 10) {
            this.field2693 = this.field2693.substring(0, 10);
        }
    }

    @ObfuscatedName("fo.r(Ldp;B)V")
    public void method3009(class123 arg0) {
        arg0.method2567(6);
        arg0.method2567(this.field2673);
        arg0.method2567(this.field2674 ? 1 : 0);
        arg0.method2567(this.field2679);
        arg0.method2567(this.field2677);
        arg0.method2567(this.field2686);
        arg0.method2567(this.field2678);
        arg0.method2567(this.field2683);
        arg0.method2567(this.field2695 ? 1 : 0);
        arg0.method2394(this.field2685);
        arg0.method2567(this.field2688);
        arg0.method2594(this.field2671);
        arg0.method2394(this.field2682);
        arg0.method2510(this.field2697);
        arg0.method2510(this.field2680);
        arg0.method2510(this.field2692);
        arg0.method2510(this.field2693);
        arg0.method2567(this.field2690);
        arg0.method2394(this.field2694);
        arg0.method2510(this.field2698);
        arg0.method2510(this.field2699);
        arg0.method2567(this.field2696);
        arg0.method2567(this.field2681);
        for (int var2 = 0; var2 < this.field2700.length; var2++) {
            arg0.method2396(this.field2700[var2]);
        }
        arg0.method2396(this.field2701);
    }

    @ObfuscatedName("fo.j(B)I")
    public int method3003() {
        byte var1 = 38;
        String var3 = this.field2697;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2680;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2692;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2693;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2698;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2699;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
