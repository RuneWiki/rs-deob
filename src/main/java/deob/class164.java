package deob;

@ObfuscatedName("fi")
public class class164 extends class212 {

    @ObfuscatedName("fi.s")
    public int field2671;

    @ObfuscatedName("fi.k")
    public boolean field2678;

    @ObfuscatedName("fi.a")
    public int field2682;

    @ObfuscatedName("fi.am")
    public int field2679;

    @ObfuscatedName("fi.aq")
    public int field2680;

    @ObfuscatedName("fi.az")
    public int field2694;

    @ObfuscatedName("fi.ak")
    public int field2697;

    @ObfuscatedName("fi.ag")
    public boolean field2683;

    @ObfuscatedName("fi.af")
    public int field2684;

    @ObfuscatedName("fi.ap")
    public int field2685;

    @ObfuscatedName("fi.ay")
    public int field2686;

    @ObfuscatedName("fi.ai")
    public int field2687;

    @ObfuscatedName("fi.aj")
    public String field2674;

    @ObfuscatedName("fi.ae")
    public String field2689;

    @ObfuscatedName("fi.ar")
    public String field2690;

    @ObfuscatedName("fi.at")
    public String field2691;

    @ObfuscatedName("fi.av")
    public int field2692;

    @ObfuscatedName("fi.aw")
    public int field2688;

    @ObfuscatedName("fi.au")
    public int field2675;

    @ObfuscatedName("fi.ax")
    public int field2672;

    @ObfuscatedName("fi.al")
    public String field2696;

    @ObfuscatedName("fi.an")
    public String field2673;

    @ObfuscatedName("fi.aa")
    public int[] field2698 = new int[3];

    @ObfuscatedName("fi.bc")
    public int field2699;

    public class164(boolean arg0) {
        if (arg0) {
            if (Statics.field1747.startsWith("win")) {
                this.field2671 = 1;
            } else if (Statics.field1747.startsWith("mac")) {
                this.field2671 = 2;
            } else if (Statics.field1747.startsWith("linux")) {
                this.field2671 = 3;
            } else {
                this.field2671 = 4;
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
                this.field2678 = true;
            } else {
                this.field2678 = false;
            }
            if (this.field2671 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2682 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2682 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2682 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2682 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2682 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2682 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2682 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2682 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2682 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2682 = 10;
                }
            } else if (this.field2671 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2682 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2682 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2682 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2682 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2682 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2682 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2682 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2679 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2679 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2679 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2679 = 4;
            } else {
                this.field2679 = 5;
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
            this.field2680 = var10;
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
            this.field2694 = var14;
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
            this.field2697 = var18;
            this.field2683 = false;
            this.field2684 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2680 > 3) {
                this.field2685 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2685 = 0;
            }
            this.field2686 = 0;
        }
        if (this.field2674 == null) {
            this.field2674 = "";
        }
        if (this.field2689 == null) {
            this.field2689 = "";
        }
        if (this.field2690 == null) {
            this.field2690 = "";
        }
        if (this.field2691 == null) {
            this.field2691 = "";
        }
        if (this.field2696 == null) {
            this.field2696 = "";
        }
        if (this.field2673 == null) {
            this.field2673 = "";
        }
        this.method3119();
    }

    @ObfuscatedName("fi.l(I)V")
    public void method3119() {
        if (this.field2674.length() > 40) {
            this.field2674 = this.field2674.substring(0, 40);
        }
        if (this.field2689.length() > 40) {
            this.field2689 = this.field2689.substring(0, 40);
        }
        if (this.field2690.length() > 10) {
            this.field2690 = this.field2690.substring(0, 10);
        }
        if (this.field2691.length() > 10) {
            this.field2691 = this.field2691.substring(0, 10);
        }
    }

    @ObfuscatedName("fi.g(Ldc;I)V")
    public void method3121(class123 arg0) {
        arg0.method2640(6);
        arg0.method2640(this.field2671);
        arg0.method2640(this.field2678 ? 1 : 0);
        arg0.method2640(this.field2682);
        arg0.method2640(this.field2679);
        arg0.method2640(this.field2680);
        arg0.method2640(this.field2694);
        arg0.method2640(this.field2697);
        arg0.method2640(this.field2683 ? 1 : 0);
        arg0.method2476(this.field2684);
        arg0.method2640(this.field2685);
        arg0.method2706(this.field2686);
        arg0.method2476(this.field2687);
        arg0.method2482(this.field2674);
        arg0.method2482(this.field2689);
        arg0.method2482(this.field2690);
        arg0.method2482(this.field2691);
        arg0.method2640(this.field2688);
        arg0.method2476(this.field2692);
        arg0.method2482(this.field2696);
        arg0.method2482(this.field2673);
        arg0.method2640(this.field2675);
        arg0.method2640(this.field2672);
        for (int var2 = 0; var2 < this.field2698.length; var2++) {
            arg0.method2585(this.field2698[var2]);
        }
        arg0.method2585(this.field2699);
    }

    @ObfuscatedName("fi.r(B)I")
    public int method3122() {
        byte var1 = 38;
        String var3 = this.field2674;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2689;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2690;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2691;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2696;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2673;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
