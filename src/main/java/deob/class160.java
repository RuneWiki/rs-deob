package deob;

@ObfuscatedName("fq")
public class class160 extends class208 {

    @ObfuscatedName("fq.a")
    public int field2596;

    @ObfuscatedName("fq.h")
    public boolean field2604;

    @ObfuscatedName("fq.c")
    public int field2599;

    @ObfuscatedName("fq.ai")
    public int field2600;

    @ObfuscatedName("fq.am")
    public int field2593;

    @ObfuscatedName("fq.ax")
    public int field2602;

    @ObfuscatedName("fq.ay")
    public int field2603;

    @ObfuscatedName("fq.az")
    public boolean field2615;

    @ObfuscatedName("fq.av")
    public int field2605;

    @ObfuscatedName("fq.at")
    public int field2611;

    @ObfuscatedName("fq.ac")
    public int field2607;

    @ObfuscatedName("fq.ar")
    public int field2608;

    @ObfuscatedName("fq.ah")
    public String field2617;

    @ObfuscatedName("fq.ak")
    public String field2601;

    @ObfuscatedName("fq.ag")
    public String field2589;

    @ObfuscatedName("fq.aq")
    public String field2612;

    @ObfuscatedName("fq.au")
    public int field2613;

    @ObfuscatedName("fq.aw")
    public int field2614;

    @ObfuscatedName("fq.ad")
    public int field2609;

    @ObfuscatedName("fq.af")
    public int field2616;

    @ObfuscatedName("fq.aj")
    public String field2590;

    @ObfuscatedName("fq.ab")
    public String field2618;

    @ObfuscatedName("fq.an")
    public int[] field2619 = new int[3];

    @ObfuscatedName("fq.bj")
    public int field2620;

    public class160(boolean arg0) {
        if (arg0) {
            if (Statics.field30.startsWith("win")) {
                this.field2596 = 1;
            } else if (Statics.field30.startsWith("mac")) {
                this.field2596 = 2;
            } else if (Statics.field30.startsWith("linux")) {
                this.field2596 = 3;
            } else {
                this.field2596 = 4;
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
                this.field2604 = true;
            } else {
                this.field2604 = false;
            }
            if (this.field2596 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2599 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2599 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2599 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2599 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2599 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2599 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2599 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2599 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2599 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2599 = 10;
                }
            } else if (this.field2596 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2599 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2599 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2599 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2599 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2599 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2599 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2599 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2600 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2600 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2600 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2600 = 4;
            } else {
                this.field2600 = 5;
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
            this.field2593 = var10;
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
            this.field2602 = var14;
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
            this.field2603 = var18;
            this.field2615 = false;
            this.field2605 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2593 > 3) {
                this.field2611 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2611 = 0;
            }
            this.field2607 = 0;
        }
        if (this.field2617 == null) {
            this.field2617 = "";
        }
        if (this.field2601 == null) {
            this.field2601 = "";
        }
        if (this.field2589 == null) {
            this.field2589 = "";
        }
        if (this.field2612 == null) {
            this.field2612 = "";
        }
        if (this.field2590 == null) {
            this.field2590 = "";
        }
        if (this.field2618 == null) {
            this.field2618 = "";
        }
        this.method2985();
    }

    @ObfuscatedName("fq.j(I)V")
    public void method2985() {
        if (this.field2617.length() > 40) {
            this.field2617 = this.field2617.substring(0, 40);
        }
        if (this.field2601.length() > 40) {
            this.field2601 = this.field2601.substring(0, 40);
        }
        if (this.field2589.length() > 10) {
            this.field2589 = this.field2589.substring(0, 10);
        }
        if (this.field2612.length() > 10) {
            this.field2612 = this.field2612.substring(0, 10);
        }
    }

    @ObfuscatedName("fq.m(Ldc;I)V")
    public void method2986(class119 arg0) {
        arg0.method2357(6);
        arg0.method2357(this.field2596);
        arg0.method2357(this.field2604 ? 1 : 0);
        arg0.method2357(this.field2599);
        arg0.method2357(this.field2600);
        arg0.method2357(this.field2593);
        arg0.method2357(this.field2602);
        arg0.method2357(this.field2603);
        arg0.method2357(this.field2615 ? 1 : 0);
        arg0.method2358(this.field2605);
        arg0.method2357(this.field2611);
        arg0.method2359(this.field2607);
        arg0.method2358(this.field2608);
        arg0.method2364(this.field2617);
        arg0.method2364(this.field2601);
        arg0.method2364(this.field2589);
        arg0.method2364(this.field2612);
        arg0.method2357(this.field2614);
        arg0.method2358(this.field2613);
        arg0.method2364(this.field2590);
        arg0.method2364(this.field2618);
        arg0.method2357(this.field2609);
        arg0.method2357(this.field2616);
        for (int var2 = 0; var2 < this.field2619.length; var2++) {
            arg0.method2360(this.field2619[var2]);
        }
        arg0.method2360(this.field2620);
    }

    @ObfuscatedName("fq.f(I)I")
    public int method2987() {
        byte var1 = 38;
        String var3 = this.field2617;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2601;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2589;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2612;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2590;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2618;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
