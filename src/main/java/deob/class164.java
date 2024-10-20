package deob;

@ObfuscatedName("fo")
public class class164 extends class212 {

    @ObfuscatedName("fo.l")
    public int field2677;

    @ObfuscatedName("fo.j")
    public boolean field2681;

    @ObfuscatedName("fo.a")
    public int field2699;

    @ObfuscatedName("fo.ab")
    public int field2679;

    @ObfuscatedName("fo.ai")
    public int field2680;

    @ObfuscatedName("fo.aa")
    public int field2696;

    @ObfuscatedName("fo.ax")
    public int field2682;

    @ObfuscatedName("fo.ad")
    public boolean field2683;

    @ObfuscatedName("fo.av")
    public int field2684;

    @ObfuscatedName("fo.af")
    public int field2685;

    @ObfuscatedName("fo.aw")
    public int field2686;

    @ObfuscatedName("fo.ay")
    public int field2687;

    @ObfuscatedName("fo.ah")
    public String field2688;

    @ObfuscatedName("fo.al")
    public String field2690;

    @ObfuscatedName("fo.as")
    public String field2669;

    @ObfuscatedName("fo.ac")
    public String field2691;

    @ObfuscatedName("fo.ao")
    public int field2695;

    @ObfuscatedName("fo.au")
    public int field2693;

    @ObfuscatedName("fo.am")
    public int field2694;

    @ObfuscatedName("fo.ag")
    public int field2689;

    @ObfuscatedName("fo.az")
    public String field2697;

    @ObfuscatedName("fo.ak")
    public String field2674;

    @ObfuscatedName("fo.ae")
    public int[] field2698 = new int[3];

    @ObfuscatedName("fo.br")
    public int field2673;

    public class164(boolean arg0) {
        if (arg0) {
            if (Statics.field1694.startsWith("win")) {
                this.field2677 = 1;
            } else if (Statics.field1694.startsWith("mac")) {
                this.field2677 = 2;
            } else if (Statics.field1694.startsWith("linux")) {
                this.field2677 = 3;
            } else {
                this.field2677 = 4;
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
                this.field2681 = true;
            } else {
                this.field2681 = false;
            }
            if (this.field2677 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2699 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2699 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2699 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2699 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2699 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2699 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2699 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2699 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2699 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2699 = 10;
                }
            } else if (this.field2677 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2699 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2699 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2699 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2699 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2699 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2699 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2699 = 26;
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
            this.field2696 = var14;
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
            this.field2682 = var18;
            this.field2683 = false;
            this.field2684 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2680 > 3) {
                this.field2685 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2685 = 0;
            }
            this.field2686 = 0;
        }
        if (this.field2688 == null) {
            this.field2688 = "";
        }
        if (this.field2690 == null) {
            this.field2690 = "";
        }
        if (this.field2669 == null) {
            this.field2669 = "";
        }
        if (this.field2691 == null) {
            this.field2691 = "";
        }
        if (this.field2697 == null) {
            this.field2697 = "";
        }
        if (this.field2674 == null) {
            this.field2674 = "";
        }
        this.method3006();
    }

    @ObfuscatedName("fo.m(B)V")
    public void method3006() {
        if (this.field2688.length() > 40) {
            this.field2688 = this.field2688.substring(0, 40);
        }
        if (this.field2690.length() > 40) {
            this.field2690 = this.field2690.substring(0, 40);
        }
        if (this.field2669.length() > 10) {
            this.field2669 = this.field2669.substring(0, 10);
        }
        if (this.field2691.length() > 10) {
            this.field2691 = this.field2691.substring(0, 10);
        }
    }

    @ObfuscatedName("fo.w(Ldj;B)V")
    public void method3008(class123 arg0) {
        arg0.method2399(6);
        arg0.method2399(this.field2677);
        arg0.method2399(this.field2681 ? 1 : 0);
        arg0.method2399(this.field2699);
        arg0.method2399(this.field2679);
        arg0.method2399(this.field2680);
        arg0.method2399(this.field2696);
        arg0.method2399(this.field2682);
        arg0.method2399(this.field2683 ? 1 : 0);
        arg0.method2400(this.field2684);
        arg0.method2399(this.field2685);
        arg0.method2401(this.field2686);
        arg0.method2400(this.field2687);
        arg0.method2501(this.field2688);
        arg0.method2501(this.field2690);
        arg0.method2501(this.field2669);
        arg0.method2501(this.field2691);
        arg0.method2399(this.field2693);
        arg0.method2400(this.field2695);
        arg0.method2501(this.field2697);
        arg0.method2501(this.field2674);
        arg0.method2399(this.field2694);
        arg0.method2399(this.field2689);
        for (int var2 = 0; var2 < this.field2698.length; var2++) {
            arg0.method2402(this.field2698[var2]);
        }
        arg0.method2402(this.field2673);
    }

    @ObfuscatedName("fo.e(I)I")
    public int method3007() {
        byte var1 = 38;
        String var3 = this.field2688;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2690;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2669;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2691;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2697;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2674;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
