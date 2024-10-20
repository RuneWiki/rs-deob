package deob;

@ObfuscatedName("fh")
public class class164 extends class212 {

    @ObfuscatedName("fh.j")
    public int field2655;

    @ObfuscatedName("fh.m")
    public boolean field2656;

    @ObfuscatedName("fh.t")
    public int field2657;

    @ObfuscatedName("fh.at")
    public int field2676;

    @ObfuscatedName("fh.aj")
    public int field2674;

    @ObfuscatedName("fh.am")
    public int field2666;

    @ObfuscatedName("fh.ay")
    public int field2661;

    @ObfuscatedName("fh.ag")
    public boolean field2662;

    @ObfuscatedName("fh.aa")
    public int field2663;

    @ObfuscatedName("fh.ar")
    public int field2664;

    @ObfuscatedName("fh.ap")
    public int field2665;

    @ObfuscatedName("fh.ao")
    public int field2652;

    @ObfuscatedName("fh.aw")
    public String field2678;

    @ObfuscatedName("fh.ai")
    public String field2668;

    @ObfuscatedName("fh.af")
    public String field2658;

    @ObfuscatedName("fh.an")
    public String field2670;

    @ObfuscatedName("fh.au")
    public int field2671;

    @ObfuscatedName("fh.ac")
    public int field2672;

    @ObfuscatedName("fh.ae")
    public int field2673;

    @ObfuscatedName("fh.az")
    public int field2651;

    @ObfuscatedName("fh.ah")
    public String field2653;

    @ObfuscatedName("fh.as")
    public String field2675;

    @ObfuscatedName("fh.ab")
    public int[] field2677 = new int[3];

    @ObfuscatedName("fh.bn")
    public int field2659;

    public class164(boolean arg0) {
        if (arg0) {
            if (Statics.field1432.startsWith("win")) {
                this.field2655 = 1;
            } else if (Statics.field1432.startsWith("mac")) {
                this.field2655 = 2;
            } else if (Statics.field1432.startsWith("linux")) {
                this.field2655 = 3;
            } else {
                this.field2655 = 4;
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
            if (this.field2655 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2657 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2657 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2657 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2657 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2657 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2657 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2657 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2657 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2657 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2657 = 10;
                }
            } else if (this.field2655 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2657 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2657 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2657 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2657 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2657 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2657 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2657 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2676 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2676 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2676 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2676 = 4;
            } else {
                this.field2676 = 5;
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
            this.field2674 = var10;
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
            this.field2666 = var14;
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
            this.field2661 = var18;
            this.field2662 = false;
            this.field2663 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2674 > 3) {
                this.field2664 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2664 = 0;
            }
            this.field2665 = 0;
        }
        if (this.field2678 == null) {
            this.field2678 = "";
        }
        if (this.field2668 == null) {
            this.field2668 = "";
        }
        if (this.field2658 == null) {
            this.field2658 = "";
        }
        if (this.field2670 == null) {
            this.field2670 = "";
        }
        if (this.field2653 == null) {
            this.field2653 = "";
        }
        if (this.field2675 == null) {
            this.field2675 = "";
        }
        this.method2998();
    }

    @ObfuscatedName("fh.k(I)V")
    public void method2998() {
        if (this.field2678.length() > 40) {
            this.field2678 = this.field2678.substring(0, 40);
        }
        if (this.field2668.length() > 40) {
            this.field2668 = this.field2668.substring(0, 40);
        }
        if (this.field2658.length() > 10) {
            this.field2658 = this.field2658.substring(0, 10);
        }
        if (this.field2670.length() > 10) {
            this.field2670 = this.field2670.substring(0, 10);
        }
    }

    @ObfuscatedName("fh.q(Lde;B)V")
    public void method2997(class123 arg0) {
        arg0.method2412(6);
        arg0.method2412(this.field2655);
        arg0.method2412(this.field2656 ? 1 : 0);
        arg0.method2412(this.field2657);
        arg0.method2412(this.field2676);
        arg0.method2412(this.field2674);
        arg0.method2412(this.field2666);
        arg0.method2412(this.field2661);
        arg0.method2412(this.field2662 ? 1 : 0);
        arg0.method2494(this.field2663);
        arg0.method2412(this.field2664);
        arg0.method2414(this.field2665);
        arg0.method2494(this.field2652);
        arg0.method2419(this.field2678);
        arg0.method2419(this.field2668);
        arg0.method2419(this.field2658);
        arg0.method2419(this.field2670);
        arg0.method2412(this.field2672);
        arg0.method2494(this.field2671);
        arg0.method2419(this.field2653);
        arg0.method2419(this.field2675);
        arg0.method2412(this.field2673);
        arg0.method2412(this.field2651);
        for (int var2 = 0; var2 < this.field2677.length; var2++) {
            arg0.method2415(this.field2677[var2]);
        }
        arg0.method2415(this.field2659);
    }

    @ObfuscatedName("fh.f(B)I")
    public int method2995() {
        byte var1 = 38;
        int var2 = var1 + class123.method563(this.field2678);
        int var3 = var2 + class123.method563(this.field2668);
        int var4 = var3 + class123.method563(this.field2658);
        int var5 = var4 + class123.method563(this.field2670);
        int var6 = var5 + class123.method563(this.field2653);
        return var6 + class123.method563(this.field2675);
    }
}
