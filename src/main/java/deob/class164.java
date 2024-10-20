package deob;

@ObfuscatedName("fv")
public class class164 extends class212 {

    @ObfuscatedName("fv.a")
    public int field2675;

    @ObfuscatedName("fv.b")
    public boolean field2656;

    @ObfuscatedName("fv.d")
    public int field2658;

    @ObfuscatedName("fv.ao")
    public int field2683;

    @ObfuscatedName("fv.av")
    public int field2662;

    @ObfuscatedName("fv.al")
    public int field2680;

    @ObfuscatedName("fv.ap")
    public int field2655;

    @ObfuscatedName("fv.an")
    public boolean field2651;

    @ObfuscatedName("fv.aw")
    public int field2679;

    @ObfuscatedName("fv.aa")
    public int field2667;

    @ObfuscatedName("fv.ag")
    public int field2668;

    @ObfuscatedName("fv.aq")
    public int field2669;

    @ObfuscatedName("fv.af")
    public String field2670;

    @ObfuscatedName("fv.ax")
    public String field2660;

    @ObfuscatedName("fv.ai")
    public String field2672;

    @ObfuscatedName("fv.ar")
    public String field2673;

    @ObfuscatedName("fv.ab")
    public int field2674;

    @ObfuscatedName("fv.aj")
    public int field2654;

    @ObfuscatedName("fv.au")
    public int field2676;

    @ObfuscatedName("fv.am")
    public int field2677;

    @ObfuscatedName("fv.az")
    public String field2663;

    @ObfuscatedName("fv.ay")
    public String field2653;

    @ObfuscatedName("fv.ac")
    public int[] field2664 = new int[3];

    @ObfuscatedName("fv.bw")
    public int field2681;

    public class164(boolean arg0) {
        if (arg0) {
            if (Statics.field798.startsWith("win")) {
                this.field2675 = 1;
            } else if (Statics.field798.startsWith("mac")) {
                this.field2675 = 2;
            } else if (Statics.field798.startsWith("linux")) {
                this.field2675 = 3;
            } else {
                this.field2675 = 4;
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
                this.field2656 = true;
            } else {
                this.field2656 = false;
            }
            if (this.field2675 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2658 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2658 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2658 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2658 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2658 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2658 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2658 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2658 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2658 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2658 = 10;
                }
            } else if (this.field2675 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2658 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2658 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2658 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2658 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2658 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2658 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2658 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2683 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2683 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2683 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2683 = 4;
            } else {
                this.field2683 = 5;
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
            this.field2662 = var10;
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
            this.field2680 = var14;
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
            this.field2651 = false;
            this.field2679 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2662 > 3) {
                this.field2667 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2667 = 0;
            }
            this.field2668 = 0;
        }
        if (this.field2670 == null) {
            this.field2670 = "";
        }
        if (this.field2660 == null) {
            this.field2660 = "";
        }
        if (this.field2672 == null) {
            this.field2672 = "";
        }
        if (this.field2673 == null) {
            this.field2673 = "";
        }
        if (this.field2663 == null) {
            this.field2663 = "";
        }
        if (this.field2653 == null) {
            this.field2653 = "";
        }
        this.method3058();
    }

    @ObfuscatedName("fv.e(I)V")
    public void method3058() {
        if (this.field2670.length() > 40) {
            this.field2670 = this.field2670.substring(0, 40);
        }
        if (this.field2660.length() > 40) {
            this.field2660 = this.field2660.substring(0, 40);
        }
        if (this.field2672.length() > 10) {
            this.field2672 = this.field2672.substring(0, 10);
        }
        if (this.field2673.length() > 10) {
            this.field2673 = this.field2673.substring(0, 10);
        }
    }

    @ObfuscatedName("fv.l(Ldd;I)V")
    public void method3059(class123 arg0) {
        arg0.method2649(6);
        arg0.method2649(this.field2675);
        arg0.method2649(this.field2656 ? 1 : 0);
        arg0.method2649(this.field2658);
        arg0.method2649(this.field2683);
        arg0.method2649(this.field2662);
        arg0.method2649(this.field2680);
        arg0.method2649(this.field2655);
        arg0.method2649(this.field2651 ? 1 : 0);
        arg0.method2635(this.field2679);
        arg0.method2649(this.field2667);
        arg0.method2529(this.field2668);
        arg0.method2635(this.field2669);
        arg0.method2456(this.field2670);
        arg0.method2456(this.field2660);
        arg0.method2456(this.field2672);
        arg0.method2456(this.field2673);
        arg0.method2649(this.field2654);
        arg0.method2635(this.field2674);
        arg0.method2456(this.field2663);
        arg0.method2456(this.field2653);
        arg0.method2649(this.field2676);
        arg0.method2649(this.field2677);
        for (int var2 = 0; var2 < this.field2664.length; var2++) {
            arg0.method2452(this.field2664[var2]);
        }
        arg0.method2452(this.field2681);
    }

    @ObfuscatedName("fv.c(I)I")
    public int method3060() {
        byte var1 = 38;
        String var3 = this.field2670;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2660;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2672;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2673;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2663;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2653;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
