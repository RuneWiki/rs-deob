package deob;

@ObfuscatedName("fg")
public class class160 extends class208 {

    @ObfuscatedName("fg.t")
    public int field2590;

    @ObfuscatedName("fg.j")
    public boolean field2591;

    @ObfuscatedName("fg.h")
    public int field2597;

    @ObfuscatedName("fg.ax")
    public int field2596;

    @ObfuscatedName("fg.az")
    public int field2600;

    @ObfuscatedName("fg.aa")
    public int field2609;

    @ObfuscatedName("fg.ak")
    public int field2615;

    @ObfuscatedName("fg.ac")
    public boolean field2602;

    @ObfuscatedName("fg.ar")
    public int field2603;

    @ObfuscatedName("fg.an")
    public int field2604;

    @ObfuscatedName("fg.at")
    public int field2599;

    @ObfuscatedName("fg.am")
    public int field2606;

    @ObfuscatedName("fg.av")
    public String field2607;

    @ObfuscatedName("fg.ai")
    public String field2608;

    @ObfuscatedName("fg.ay")
    public String field2614;

    @ObfuscatedName("fg.aw")
    public String field2619;

    @ObfuscatedName("fg.ap")
    public int field2611;

    @ObfuscatedName("fg.aj")
    public int field2612;

    @ObfuscatedName("fg.ao")
    public int field2613;

    @ObfuscatedName("fg.ad")
    public int field2601;

    @ObfuscatedName("fg.ag")
    public String field2587;

    @ObfuscatedName("fg.al")
    public String field2616;

    @ObfuscatedName("fg.as")
    public int[] field2617 = new int[3];

    @ObfuscatedName("fg.bi")
    public int field2618;

    public class160(boolean arg0) {
        if (arg0) {
            if (Statics.field2264.startsWith("win")) {
                this.field2590 = 1;
            } else if (Statics.field2264.startsWith("mac")) {
                this.field2590 = 2;
            } else if (Statics.field2264.startsWith("linux")) {
                this.field2590 = 3;
            } else {
                this.field2590 = 4;
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
                this.field2591 = true;
            } else {
                this.field2591 = false;
            }
            if (this.field2590 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2597 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2597 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2597 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2597 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2597 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2597 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2597 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2597 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2597 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2597 = 10;
                }
            } else if (this.field2590 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2597 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2597 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2597 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2597 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2597 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2597 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2597 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2596 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2596 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2596 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2596 = 4;
            } else {
                this.field2596 = 5;
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
            this.field2600 = var10;
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
            this.field2609 = var14;
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
            this.field2615 = var18;
            this.field2602 = false;
            this.field2603 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2600 > 3) {
                this.field2604 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2604 = 0;
            }
            this.field2599 = 0;
        }
        if (this.field2607 == null) {
            this.field2607 = "";
        }
        if (this.field2608 == null) {
            this.field2608 = "";
        }
        if (this.field2614 == null) {
            this.field2614 = "";
        }
        if (this.field2619 == null) {
            this.field2619 = "";
        }
        if (this.field2587 == null) {
            this.field2587 = "";
        }
        if (this.field2616 == null) {
            this.field2616 = "";
        }
        this.method2938();
    }

    @ObfuscatedName("fg.f(I)V")
    public void method2938() {
        if (this.field2607.length() > 40) {
            this.field2607 = this.field2607.substring(0, 40);
        }
        if (this.field2608.length() > 40) {
            this.field2608 = this.field2608.substring(0, 40);
        }
        if (this.field2614.length() > 10) {
            this.field2614 = this.field2614.substring(0, 10);
        }
        if (this.field2619.length() > 10) {
            this.field2619 = this.field2619.substring(0, 10);
        }
    }

    @ObfuscatedName("fg.s(Ldn;I)V")
    public void method2939(class119 arg0) {
        arg0.method2426(6);
        arg0.method2426(this.field2590);
        arg0.method2426(this.field2591 ? 1 : 0);
        arg0.method2426(this.field2597);
        arg0.method2426(this.field2596);
        arg0.method2426(this.field2600);
        arg0.method2426(this.field2609);
        arg0.method2426(this.field2615);
        arg0.method2426(this.field2602 ? 1 : 0);
        arg0.method2349(this.field2603);
        arg0.method2426(this.field2604);
        arg0.method2496(this.field2599);
        arg0.method2349(this.field2606);
        arg0.method2355(this.field2607);
        arg0.method2355(this.field2608);
        arg0.method2355(this.field2614);
        arg0.method2355(this.field2619);
        arg0.method2426(this.field2612);
        arg0.method2349(this.field2611);
        arg0.method2355(this.field2587);
        arg0.method2355(this.field2616);
        arg0.method2426(this.field2613);
        arg0.method2426(this.field2601);
        for (int var2 = 0; var2 < this.field2617.length; var2++) {
            arg0.method2351(this.field2617[var2]);
        }
        arg0.method2351(this.field2618);
    }

    @ObfuscatedName("fg.q(B)I")
    public int method2940() {
        byte var1 = 38;
        int var2 = var1 + class119.method102(this.field2607);
        int var3 = var2 + class119.method102(this.field2608);
        int var4 = var3 + class119.method102(this.field2614);
        int var5 = var4 + class119.method102(this.field2619);
        int var6 = var5 + class119.method102(this.field2587);
        return var6 + class119.method102(this.field2616);
    }
}
