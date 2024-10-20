package deob;

@ObfuscatedName("fi")
public class class164 extends class212 {

    @ObfuscatedName("fi.u")
    public int field2658;

    @ObfuscatedName("fi.d")
    public boolean field2661;

    @ObfuscatedName("fi.t")
    public int field2666;

    @ObfuscatedName("fi.ak")
    public int field2668;

    @ObfuscatedName("fi.aq")
    public int field2654;

    @ObfuscatedName("fi.an")
    public int field2681;

    @ObfuscatedName("fi.ag")
    public int field2671;

    @ObfuscatedName("fi.al")
    public boolean field2672;

    @ObfuscatedName("fi.au")
    public int field2673;

    @ObfuscatedName("fi.aw")
    public int field2674;

    @ObfuscatedName("fi.ao")
    public int field2675;

    @ObfuscatedName("fi.ax")
    public int field2676;

    @ObfuscatedName("fi.ac")
    public String field2677;

    @ObfuscatedName("fi.ai")
    public String field2669;

    @ObfuscatedName("fi.ap")
    public String field2679;

    @ObfuscatedName("fi.aa")
    public String field2680;

    @ObfuscatedName("fi.ay")
    public int field2683;

    @ObfuscatedName("fi.ab")
    public int field2678;

    @ObfuscatedName("fi.aj")
    public int field2684;

    @ObfuscatedName("fi.az")
    public int field2665;

    @ObfuscatedName("fi.av")
    public String field2685;

    @ObfuscatedName("fi.ae")
    public String field2686;

    @ObfuscatedName("fi.at")
    public int[] field2687 = new int[3];

    @ObfuscatedName("fi.bc")
    public int field2688;

    public class164(boolean arg0) {
        if (arg0) {
            if (Statics.field1658.startsWith("win")) {
                this.field2658 = 1;
            } else if (Statics.field1658.startsWith("mac")) {
                this.field2658 = 2;
            } else if (Statics.field1658.startsWith("linux")) {
                this.field2658 = 3;
            } else {
                this.field2658 = 4;
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
                this.field2661 = true;
            } else {
                this.field2661 = false;
            }
            if (this.field2658 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2666 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2666 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2666 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2666 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2666 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2666 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2666 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2666 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2666 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2666 = 10;
                }
            } else if (this.field2658 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2666 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2666 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2666 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2666 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2666 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2666 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2666 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2668 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2668 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2668 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2668 = 4;
            } else {
                this.field2668 = 5;
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
            this.field2654 = var10;
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
            this.field2681 = var14;
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
            this.field2671 = var18;
            this.field2672 = false;
            this.field2673 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2654 > 3) {
                this.field2674 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2674 = 0;
            }
            this.field2675 = 0;
        }
        if (this.field2677 == null) {
            this.field2677 = "";
        }
        if (this.field2669 == null) {
            this.field2669 = "";
        }
        if (this.field2679 == null) {
            this.field2679 = "";
        }
        if (this.field2680 == null) {
            this.field2680 = "";
        }
        if (this.field2685 == null) {
            this.field2685 = "";
        }
        if (this.field2686 == null) {
            this.field2686 = "";
        }
        this.method3006();
    }

    @ObfuscatedName("fi.i(B)V")
    public void method3006() {
        if (this.field2677.length() > 40) {
            this.field2677 = this.field2677.substring(0, 40);
        }
        if (this.field2669.length() > 40) {
            this.field2669 = this.field2669.substring(0, 40);
        }
        if (this.field2679.length() > 10) {
            this.field2679 = this.field2679.substring(0, 10);
        }
        if (this.field2680.length() > 10) {
            this.field2680 = this.field2680.substring(0, 10);
        }
    }

    @ObfuscatedName("fi.h(Ldn;I)V")
    public void method2995(class123 arg0) {
        arg0.method2389(6);
        arg0.method2389(this.field2658);
        arg0.method2389(this.field2661 ? 1 : 0);
        arg0.method2389(this.field2666);
        arg0.method2389(this.field2668);
        arg0.method2389(this.field2654);
        arg0.method2389(this.field2681);
        arg0.method2389(this.field2671);
        arg0.method2389(this.field2672 ? 1 : 0);
        arg0.method2561(this.field2673);
        arg0.method2389(this.field2674);
        arg0.method2391(this.field2675);
        arg0.method2561(this.field2676);
        arg0.method2396(this.field2677);
        arg0.method2396(this.field2669);
        arg0.method2396(this.field2679);
        arg0.method2396(this.field2680);
        arg0.method2389(this.field2678);
        arg0.method2561(this.field2683);
        arg0.method2396(this.field2685);
        arg0.method2396(this.field2686);
        arg0.method2389(this.field2684);
        arg0.method2389(this.field2665);
        for (int var2 = 0; var2 < this.field2687.length; var2++) {
            arg0.method2569(this.field2687[var2]);
        }
        arg0.method2569(this.field2688);
    }

    @ObfuscatedName("fi.e(I)I")
    public int method2996() {
        byte var1 = 38;
        String var3 = this.field2677;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2669;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2679;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2680;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2685;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2686;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
