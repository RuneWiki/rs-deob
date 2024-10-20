package deob;

@ObfuscatedName("fl")
public class class164 extends class212 {

    @ObfuscatedName("fl.g")
    public int field2659;

    @ObfuscatedName("fl.m")
    public boolean field2660;

    @ObfuscatedName("fl.e")
    public int field2668;

    @ObfuscatedName("fl.ax")
    public int field2670;

    @ObfuscatedName("fl.ac")
    public int field2689;

    @ObfuscatedName("fl.ar")
    public int field2672;

    @ObfuscatedName("fl.an")
    public int field2673;

    @ObfuscatedName("fl.ag")
    public boolean field2674;

    @ObfuscatedName("fl.ab")
    public int field2675;

    @ObfuscatedName("fl.av")
    public int field2676;

    @ObfuscatedName("fl.au")
    public int field2667;

    @ObfuscatedName("fl.ad")
    public int field2678;

    @ObfuscatedName("fl.aj")
    public String field2662;

    @ObfuscatedName("fl.ai")
    public String field2680;

    @ObfuscatedName("fl.az")
    public String field2656;

    @ObfuscatedName("fl.ay")
    public String field2682;

    @ObfuscatedName("fl.at")
    public int field2683;

    @ObfuscatedName("fl.al")
    public int field2687;

    @ObfuscatedName("fl.aw")
    public int field2685;

    @ObfuscatedName("fl.ak")
    public int field2686;

    @ObfuscatedName("fl.as")
    public String field2677;

    @ObfuscatedName("fl.aq")
    public String field2688;

    @ObfuscatedName("fl.af")
    public int[] field2681 = new int[3];

    @ObfuscatedName("fl.bp")
    public int field2658;

    public class164(boolean arg0) {
        if (arg0) {
            if (Statics.field607.startsWith("win")) {
                this.field2659 = 1;
            } else if (Statics.field607.startsWith("mac")) {
                this.field2659 = 2;
            } else if (Statics.field607.startsWith("linux")) {
                this.field2659 = 3;
            } else {
                this.field2659 = 4;
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
                this.field2660 = true;
            } else {
                this.field2660 = false;
            }
            if (this.field2659 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2668 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2668 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2668 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2668 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2668 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2668 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2668 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2668 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2668 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2668 = 10;
                }
            } else if (this.field2659 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2668 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2668 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2668 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2668 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2668 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2668 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2668 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2670 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2670 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2670 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2670 = 4;
            } else {
                this.field2670 = 5;
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
            this.field2689 = var10;
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
            this.field2672 = var14;
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
            this.field2673 = var18;
            this.field2674 = false;
            this.field2675 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2689 > 3) {
                this.field2676 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2676 = 0;
            }
            this.field2667 = 0;
        }
        if (this.field2662 == null) {
            this.field2662 = "";
        }
        if (this.field2680 == null) {
            this.field2680 = "";
        }
        if (this.field2656 == null) {
            this.field2656 = "";
        }
        if (this.field2682 == null) {
            this.field2682 = "";
        }
        if (this.field2677 == null) {
            this.field2677 = "";
        }
        if (this.field2688 == null) {
            this.field2688 = "";
        }
        this.method2987();
    }

    @ObfuscatedName("fl.s(I)V")
    public void method2987() {
        if (this.field2662.length() > 40) {
            this.field2662 = this.field2662.substring(0, 40);
        }
        if (this.field2680.length() > 40) {
            this.field2680 = this.field2680.substring(0, 40);
        }
        if (this.field2656.length() > 10) {
            this.field2656 = this.field2656.substring(0, 10);
        }
        if (this.field2682.length() > 10) {
            this.field2682 = this.field2682.substring(0, 10);
        }
    }

    @ObfuscatedName("fl.z(Ldy;I)V")
    public void method2988(class123 arg0) {
        arg0.method2349(6);
        arg0.method2349(this.field2659);
        arg0.method2349(this.field2660 ? 1 : 0);
        arg0.method2349(this.field2668);
        arg0.method2349(this.field2670);
        arg0.method2349(this.field2689);
        arg0.method2349(this.field2672);
        arg0.method2349(this.field2673);
        arg0.method2349(this.field2674 ? 1 : 0);
        arg0.method2350(this.field2675);
        arg0.method2349(this.field2676);
        arg0.method2405(this.field2667);
        arg0.method2350(this.field2678);
        arg0.method2351(this.field2662);
        arg0.method2351(this.field2680);
        arg0.method2351(this.field2656);
        arg0.method2351(this.field2682);
        arg0.method2349(this.field2687);
        arg0.method2350(this.field2683);
        arg0.method2351(this.field2677);
        arg0.method2351(this.field2688);
        arg0.method2349(this.field2685);
        arg0.method2349(this.field2686);
        for (int var2 = 0; var2 < this.field2681.length; var2++) {
            arg0.method2524(this.field2681[var2]);
        }
        arg0.method2524(this.field2658);
    }

    @ObfuscatedName("fl.t(B)I")
    public int method2986() {
        byte var1 = 38;
        int var2 = var1 + Statics.method679(this.field2662);
        int var3 = var2 + Statics.method679(this.field2680);
        int var4 = var3 + Statics.method679(this.field2656);
        int var5 = var4 + Statics.method679(this.field2682);
        int var6 = var5 + Statics.method679(this.field2677);
        return var6 + Statics.method679(this.field2688);
    }
}
