package deob;

@ObfuscatedName("fg")
public class class161 extends class209 {

    @ObfuscatedName("fg.y")
    public int field2601;

    @ObfuscatedName("fg.r")
    public boolean field2597;

    @ObfuscatedName("fg.i")
    public int field2605;

    @ObfuscatedName("fg.aj")
    public int field2607;

    @ObfuscatedName("fg.ah")
    public int field2608;

    @ObfuscatedName("fg.af")
    public int field2609;

    @ObfuscatedName("fg.az")
    public int field2600;

    @ObfuscatedName("fg.ax")
    public boolean field2603;

    @ObfuscatedName("fg.ac")
    public int field2612;

    @ObfuscatedName("fg.aq")
    public int field2613;

    @ObfuscatedName("fg.ay")
    public int field2614;

    @ObfuscatedName("fg.as")
    public int field2615;

    @ObfuscatedName("fg.ak")
    public String field2616;

    @ObfuscatedName("fg.au")
    public String field2627;

    @ObfuscatedName("fg.av")
    public String field2618;

    @ObfuscatedName("fg.at")
    public String field2619;

    @ObfuscatedName("fg.am")
    public int field2620;

    @ObfuscatedName("fg.ab")
    public int field2606;

    @ObfuscatedName("fg.ai")
    public int field2622;

    @ObfuscatedName("fg.ad")
    public int field2611;

    @ObfuscatedName("fg.ao")
    public String field2624;

    @ObfuscatedName("fg.al")
    public String field2625;

    @ObfuscatedName("fg.ap")
    public int[] field2599 = new int[3];

    @ObfuscatedName("fg.bc")
    public int field2621;

    public class161(boolean arg0) {
        if (arg0) {
            if (Statics.field1939.startsWith("win")) {
                this.field2601 = 1;
            } else if (Statics.field1939.startsWith("mac")) {
                this.field2601 = 2;
            } else if (Statics.field1939.startsWith("linux")) {
                this.field2601 = 3;
            } else {
                this.field2601 = 4;
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
                this.field2597 = true;
            } else {
                this.field2597 = false;
            }
            if (this.field2601 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2605 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2605 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2605 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2605 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2605 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2605 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2605 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2605 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2605 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2605 = 10;
                }
            } else if (this.field2601 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2605 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2605 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2605 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2605 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2605 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2605 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2605 = 26;
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
            this.field2600 = var18;
            this.field2603 = false;
            this.field2612 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2608 > 3) {
                this.field2613 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2613 = 0;
            }
            this.field2614 = 0;
        }
        if (this.field2616 == null) {
            this.field2616 = "";
        }
        if (this.field2627 == null) {
            this.field2627 = "";
        }
        if (this.field2618 == null) {
            this.field2618 = "";
        }
        if (this.field2619 == null) {
            this.field2619 = "";
        }
        if (this.field2624 == null) {
            this.field2624 = "";
        }
        if (this.field2625 == null) {
            this.field2625 = "";
        }
        this.method2962();
    }

    @ObfuscatedName("fg.b(I)V")
    public void method2962() {
        if (this.field2616.length() > 40) {
            this.field2616 = this.field2616.substring(0, 40);
        }
        if (this.field2627.length() > 40) {
            this.field2627 = this.field2627.substring(0, 40);
        }
        if (this.field2618.length() > 10) {
            this.field2618 = this.field2618.substring(0, 10);
        }
        if (this.field2619.length() > 10) {
            this.field2619 = this.field2619.substring(0, 10);
        }
    }

    @ObfuscatedName("fg.g(Lds;I)V")
    public void method2961(class120 arg0) {
        arg0.method2480(6);
        arg0.method2480(this.field2601);
        arg0.method2480(this.field2597 ? 1 : 0);
        arg0.method2480(this.field2605);
        arg0.method2480(this.field2607);
        arg0.method2480(this.field2608);
        arg0.method2480(this.field2609);
        arg0.method2480(this.field2600);
        arg0.method2480(this.field2603 ? 1 : 0);
        arg0.method2525(this.field2612);
        arg0.method2480(this.field2613);
        arg0.method2331(this.field2614);
        arg0.method2525(this.field2615);
        arg0.method2426(this.field2616);
        arg0.method2426(this.field2627);
        arg0.method2426(this.field2618);
        arg0.method2426(this.field2619);
        arg0.method2480(this.field2606);
        arg0.method2525(this.field2620);
        arg0.method2426(this.field2624);
        arg0.method2426(this.field2625);
        arg0.method2480(this.field2622);
        arg0.method2480(this.field2611);
        for (int var2 = 0; var2 < this.field2599.length; var2++) {
            arg0.method2332(this.field2599[var2]);
        }
        arg0.method2332(this.field2621);
    }

    @ObfuscatedName("fg.j(I)I")
    public int method2963() {
        byte var1 = 38;
        int var2 = var1 + class120.method844(this.field2616);
        int var3 = var2 + class120.method844(this.field2627);
        int var4 = var3 + class120.method844(this.field2618);
        int var5 = var4 + class120.method844(this.field2619);
        int var6 = var5 + class120.method844(this.field2624);
        return var6 + class120.method844(this.field2625);
    }
}
