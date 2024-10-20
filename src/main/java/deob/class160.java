package deob;

@ObfuscatedName("fi")
public class class160 extends class208 {

    @ObfuscatedName("fi.k")
    public int field2595;

    @ObfuscatedName("fi.i")
    public boolean field2607;

    @ObfuscatedName("fi.x")
    public int field2598;

    @ObfuscatedName("fi.ad")
    public int field2588;

    @ObfuscatedName("fi.av")
    public int field2600;

    @ObfuscatedName("fi.ar")
    public int field2601;

    @ObfuscatedName("fi.al")
    public int field2602;

    @ObfuscatedName("fi.aj")
    public boolean field2605;

    @ObfuscatedName("fi.au")
    public int field2604;

    @ObfuscatedName("fi.ax")
    public int field2599;

    @ObfuscatedName("fi.af")
    public int field2606;

    @ObfuscatedName("fi.ag")
    public int field2597;

    @ObfuscatedName("fi.ah")
    public String field2608;

    @ObfuscatedName("fi.at")
    public String field2609;

    @ObfuscatedName("fi.ak")
    public String field2610;

    @ObfuscatedName("fi.ay")
    public String field2611;

    @ObfuscatedName("fi.ai")
    public int field2596;

    @ObfuscatedName("fi.am")
    public int field2613;

    @ObfuscatedName("fi.ao")
    public int field2614;

    @ObfuscatedName("fi.as")
    public int field2615;

    @ObfuscatedName("fi.aa")
    public String field2616;

    @ObfuscatedName("fi.ae")
    public String field2617;

    @ObfuscatedName("fi.an")
    public int[] field2618 = new int[3];

    @ObfuscatedName("fi.bd")
    public int field2619;

    public class160(boolean arg0) {
        if (arg0) {
            if (Statics.field1954.startsWith("win")) {
                this.field2595 = 1;
            } else if (Statics.field1954.startsWith("mac")) {
                this.field2595 = 2;
            } else if (Statics.field1954.startsWith("linux")) {
                this.field2595 = 3;
            } else {
                this.field2595 = 4;
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
                this.field2607 = true;
            } else {
                this.field2607 = false;
            }
            if (this.field2595 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2598 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2598 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2598 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2598 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2598 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2598 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2598 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2598 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2598 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2598 = 10;
                }
            } else if (this.field2595 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2598 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2598 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2598 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2598 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2598 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2598 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2598 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2588 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2588 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2588 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2588 = 4;
            } else {
                this.field2588 = 5;
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
            this.field2601 = var14;
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
            this.field2602 = var18;
            this.field2605 = false;
            this.field2604 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2600 > 3) {
                this.field2599 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2599 = 0;
            }
            this.field2606 = 0;
        }
        if (this.field2608 == null) {
            this.field2608 = "";
        }
        if (this.field2609 == null) {
            this.field2609 = "";
        }
        if (this.field2610 == null) {
            this.field2610 = "";
        }
        if (this.field2611 == null) {
            this.field2611 = "";
        }
        if (this.field2616 == null) {
            this.field2616 = "";
        }
        if (this.field2617 == null) {
            this.field2617 = "";
        }
        this.method2952();
    }

    @ObfuscatedName("fi.n(I)V")
    public void method2952() {
        if (this.field2608.length() > 40) {
            this.field2608 = this.field2608.substring(0, 40);
        }
        if (this.field2609.length() > 40) {
            this.field2609 = this.field2609.substring(0, 40);
        }
        if (this.field2610.length() > 10) {
            this.field2610 = this.field2610.substring(0, 10);
        }
        if (this.field2611.length() > 10) {
            this.field2611 = this.field2611.substring(0, 10);
        }
    }

    @ObfuscatedName("fi.d(Ldq;B)V")
    public void method2951(class119 arg0) {
        arg0.method2323(6);
        arg0.method2323(this.field2595);
        arg0.method2323(this.field2607 ? 1 : 0);
        arg0.method2323(this.field2598);
        arg0.method2323(this.field2588);
        arg0.method2323(this.field2600);
        arg0.method2323(this.field2601);
        arg0.method2323(this.field2602);
        arg0.method2323(this.field2605 ? 1 : 0);
        arg0.method2324(this.field2604);
        arg0.method2323(this.field2599);
        arg0.method2409(this.field2606);
        arg0.method2324(this.field2597);
        arg0.method2491(this.field2608);
        arg0.method2491(this.field2609);
        arg0.method2491(this.field2610);
        arg0.method2491(this.field2611);
        arg0.method2323(this.field2613);
        arg0.method2324(this.field2596);
        arg0.method2491(this.field2616);
        arg0.method2491(this.field2617);
        arg0.method2323(this.field2614);
        arg0.method2323(this.field2615);
        for (int var2 = 0; var2 < this.field2618.length; var2++) {
            arg0.method2326(this.field2618[var2]);
        }
        arg0.method2326(this.field2619);
    }

    @ObfuscatedName("fi.s(B)I")
    public int method2953() {
        byte var1 = 38;
        String var3 = this.field2608;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2609;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2610;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2611;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2616;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2617;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
