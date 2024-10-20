package deob;

@ObfuscatedName("fj")
public class class160 extends class208 {

    @ObfuscatedName("fj.u")
    public int field2622;

    @ObfuscatedName("fj.j")
    public boolean field2601;

    @ObfuscatedName("fj.g")
    public int field2606;

    @ObfuscatedName("fj.aj")
    public int field2607;

    @ObfuscatedName("fj.at")
    public int field2608;

    @ObfuscatedName("fj.ap")
    public int field2609;

    @ObfuscatedName("fj.aa")
    public int field2610;

    @ObfuscatedName("fj.ak")
    public boolean field2615;

    @ObfuscatedName("fj.an")
    public int field2612;

    @ObfuscatedName("fj.ai")
    public int field2613;

    @ObfuscatedName("fj.ao")
    public int field2605;

    @ObfuscatedName("fj.av")
    public int field2614;

    @ObfuscatedName("fj.ad")
    public String field2616;

    @ObfuscatedName("fj.af")
    public String field2617;

    @ObfuscatedName("fj.ax")
    public String field2618;

    @ObfuscatedName("fj.ae")
    public String field2611;

    @ObfuscatedName("fj.aw")
    public int field2621;

    @ObfuscatedName("fj.ay")
    public int field2602;

    @ObfuscatedName("fj.ab")
    public int field2619;

    @ObfuscatedName("fj.ar")
    public int field2623;

    @ObfuscatedName("fj.am")
    public String field2624;

    @ObfuscatedName("fj.aq")
    public String field2599;

    @ObfuscatedName("fj.as")
    public int[] field2626 = new int[3];

    @ObfuscatedName("fj.bn")
    public int field2627;

    public class160(boolean arg0) {
        if (arg0) {
            if (Statics.field2025.startsWith("win")) {
                this.field2622 = 1;
            } else if (Statics.field2025.startsWith("mac")) {
                this.field2622 = 2;
            } else if (Statics.field2025.startsWith("linux")) {
                this.field2622 = 3;
            } else {
                this.field2622 = 4;
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
                this.field2601 = true;
            } else {
                this.field2601 = false;
            }
            if (this.field2622 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2606 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2606 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2606 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2606 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2606 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2606 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2606 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2606 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2606 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2606 = 10;
                }
            } else if (this.field2622 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2606 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2606 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2606 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2606 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2606 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2606 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2606 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2607 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2607 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2607 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2607 = 4;
            } else {
                this.field2607 = 5;
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
            this.field2608 = var10;
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
            this.field2610 = var18;
            this.field2615 = false;
            this.field2612 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2608 > 3) {
                this.field2613 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2613 = 0;
            }
            this.field2605 = 0;
        }
        if (this.field2616 == null) {
            this.field2616 = "";
        }
        if (this.field2617 == null) {
            this.field2617 = "";
        }
        if (this.field2618 == null) {
            this.field2618 = "";
        }
        if (this.field2611 == null) {
            this.field2611 = "";
        }
        if (this.field2624 == null) {
            this.field2624 = "";
        }
        if (this.field2599 == null) {
            this.field2599 = "";
        }
        this.method2961();
    }

    @ObfuscatedName("fj.n(B)V")
    public void method2961() {
        if (this.field2616.length() > 40) {
            this.field2616 = this.field2616.substring(0, 40);
        }
        if (this.field2617.length() > 40) {
            this.field2617 = this.field2617.substring(0, 40);
        }
        if (this.field2618.length() > 10) {
            this.field2618 = this.field2618.substring(0, 10);
        }
        if (this.field2611.length() > 10) {
            this.field2611 = this.field2611.substring(0, 10);
        }
    }

    @ObfuscatedName("fj.q(Ldc;B)V")
    public void method2959(class119 arg0) {
        arg0.method2345(6);
        arg0.method2345(this.field2622);
        arg0.method2345(this.field2601 ? 1 : 0);
        arg0.method2345(this.field2606);
        arg0.method2345(this.field2607);
        arg0.method2345(this.field2608);
        arg0.method2345(this.field2609);
        arg0.method2345(this.field2610);
        arg0.method2345(this.field2615 ? 1 : 0);
        arg0.method2346(this.field2612);
        arg0.method2345(this.field2613);
        arg0.method2347(this.field2605);
        arg0.method2346(this.field2614);
        arg0.method2446(this.field2616);
        arg0.method2446(this.field2617);
        arg0.method2446(this.field2618);
        arg0.method2446(this.field2611);
        arg0.method2345(this.field2602);
        arg0.method2346(this.field2621);
        arg0.method2446(this.field2624);
        arg0.method2446(this.field2599);
        arg0.method2345(this.field2619);
        arg0.method2345(this.field2623);
        for (int var2 = 0; var2 < this.field2626.length; var2++) {
            arg0.method2348(this.field2626[var2]);
        }
        arg0.method2348(this.field2627);
    }

    @ObfuscatedName("fj.c(I)I")
    public int method2958() {
        byte var1 = 38;
        int var2 = var1 + class119.method1005(this.field2616);
        int var3 = var2 + class119.method1005(this.field2617);
        int var4 = var3 + class119.method1005(this.field2618);
        int var5 = var4 + class119.method1005(this.field2611);
        int var6 = var5 + class119.method1005(this.field2624);
        return var6 + class119.method1005(this.field2599);
    }
}
