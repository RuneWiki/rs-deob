package deob;

@ObfuscatedName("fh")
public class class164 extends class212 {

    @ObfuscatedName("fh.t")
    public int field2678;

    @ObfuscatedName("fh.n")
    public boolean field2679;

    @ObfuscatedName("fh.c")
    public int field2682;

    @ObfuscatedName("fh.ap")
    public int field2699;

    @ObfuscatedName("fh.aa")
    public int field2701;

    @ObfuscatedName("fh.ar")
    public int field2683;

    @ObfuscatedName("fh.av")
    public int field2702;

    @ObfuscatedName("fh.ao")
    public boolean field2687;

    @ObfuscatedName("fh.aq")
    public int field2688;

    @ObfuscatedName("fh.at")
    public int field2689;

    @ObfuscatedName("fh.ab")
    public int field2690;

    @ObfuscatedName("fh.al")
    public int field2692;

    @ObfuscatedName("fh.ad")
    public String field2684;

    @ObfuscatedName("fh.ah")
    public String field2685;

    @ObfuscatedName("fh.ak")
    public String field2694;

    @ObfuscatedName("fh.ai")
    public String field2681;

    @ObfuscatedName("fh.az")
    public int field2696;

    @ObfuscatedName("fh.au")
    public int field2697;

    @ObfuscatedName("fh.ay")
    public int field2698;

    @ObfuscatedName("fh.ag")
    public int field2695;

    @ObfuscatedName("fh.ae")
    public String field2700;

    @ObfuscatedName("fh.an")
    public String field2691;

    @ObfuscatedName("fh.aj")
    public int[] field2693 = new int[3];

    @ObfuscatedName("fh.bg")
    public int field2703;

    public class164(boolean arg0) {
        if (arg0) {
            if (Statics.field2307.startsWith("win")) {
                this.field2678 = 1;
            } else if (Statics.field2307.startsWith("mac")) {
                this.field2678 = 2;
            } else if (Statics.field2307.startsWith("linux")) {
                this.field2678 = 3;
            } else {
                this.field2678 = 4;
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
                this.field2679 = true;
            } else {
                this.field2679 = false;
            }
            if (this.field2678 == 1) {
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
            } else if (this.field2678 == 2) {
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
                this.field2699 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2699 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2699 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2699 = 4;
            } else {
                this.field2699 = 5;
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
            this.field2701 = var10;
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
            this.field2683 = var14;
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
            this.field2702 = var18;
            this.field2687 = false;
            this.field2688 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2701 > 3) {
                this.field2689 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2689 = 0;
            }
            this.field2690 = 0;
        }
        if (this.field2684 == null) {
            this.field2684 = "";
        }
        if (this.field2685 == null) {
            this.field2685 = "";
        }
        if (this.field2694 == null) {
            this.field2694 = "";
        }
        if (this.field2681 == null) {
            this.field2681 = "";
        }
        if (this.field2700 == null) {
            this.field2700 = "";
        }
        if (this.field2691 == null) {
            this.field2691 = "";
        }
        this.method3035();
    }

    @ObfuscatedName("fh.a(I)V")
    public void method3035() {
        if (this.field2684.length() > 40) {
            this.field2684 = this.field2684.substring(0, 40);
        }
        if (this.field2685.length() > 40) {
            this.field2685 = this.field2685.substring(0, 40);
        }
        if (this.field2694.length() > 10) {
            this.field2694 = this.field2694.substring(0, 10);
        }
        if (this.field2681.length() > 10) {
            this.field2681 = this.field2681.substring(0, 10);
        }
    }

    @ObfuscatedName("fh.d(Ldb;I)V")
    public void method3032(class123 arg0) {
        arg0.method2380(6);
        arg0.method2380(this.field2678);
        arg0.method2380(this.field2679 ? 1 : 0);
        arg0.method2380(this.field2682);
        arg0.method2380(this.field2699);
        arg0.method2380(this.field2701);
        arg0.method2380(this.field2683);
        arg0.method2380(this.field2702);
        arg0.method2380(this.field2687 ? 1 : 0);
        arg0.method2381(this.field2688);
        arg0.method2380(this.field2689);
        arg0.method2610(this.field2690);
        arg0.method2381(this.field2692);
        arg0.method2387(this.field2684);
        arg0.method2387(this.field2685);
        arg0.method2387(this.field2694);
        arg0.method2387(this.field2681);
        arg0.method2380(this.field2697);
        arg0.method2381(this.field2696);
        arg0.method2387(this.field2700);
        arg0.method2387(this.field2691);
        arg0.method2380(this.field2698);
        arg0.method2380(this.field2695);
        for (int var2 = 0; var2 < this.field2693.length; var2++) {
            arg0.method2467(this.field2693[var2]);
        }
        arg0.method2467(this.field2703);
    }

    @ObfuscatedName("fh.v(I)I")
    public int method3027() {
        byte var1 = 38;
        int var2 = var1 + class123.method813(this.field2684);
        int var3 = var2 + class123.method813(this.field2685);
        int var4 = var3 + class123.method813(this.field2694);
        int var5 = var4 + class123.method813(this.field2681);
        int var6 = var5 + class123.method813(this.field2700);
        return var6 + class123.method813(this.field2691);
    }
}
