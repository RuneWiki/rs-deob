package deob;

@ObfuscatedName("fi")
public class class160 extends class208 {

    @ObfuscatedName("fi.m")
    public int field2595;

    @ObfuscatedName("fi.b")
    public boolean field2596;

    @ObfuscatedName("fi.n")
    public int field2600;

    @ObfuscatedName("fi.ao")
    public int field2618;

    @ObfuscatedName("fi.am")
    public int field2602;

    @ObfuscatedName("fi.ah")
    public int field2603;

    @ObfuscatedName("fi.aj")
    public int field2604;

    @ObfuscatedName("fi.ar")
    public boolean field2605;

    @ObfuscatedName("fi.ae")
    public int field2615;

    @ObfuscatedName("fi.ay")
    public int field2607;

    @ObfuscatedName("fi.ab")
    public int field2608;

    @ObfuscatedName("fi.ac")
    public int field2609;

    @ObfuscatedName("fi.az")
    public String field2610;

    @ObfuscatedName("fi.as")
    public String field2611;

    @ObfuscatedName("fi.ai")
    public String field2612;

    @ObfuscatedName("fi.an")
    public String field2614;

    @ObfuscatedName("fi.ap")
    public int field2594;

    @ObfuscatedName("fi.aa")
    public int field2590;

    @ObfuscatedName("fi.ax")
    public int field2616;

    @ObfuscatedName("fi.av")
    public int field2601;

    @ObfuscatedName("fi.at")
    public String field2617;

    @ObfuscatedName("fi.aw")
    public String field2599;

    @ObfuscatedName("fi.af")
    public int[] field2620 = new int[3];

    @ObfuscatedName("fi.bz")
    public int field2621;

    public class160(boolean arg0) {
        if (arg0) {
            if (Statics.field808.startsWith("win")) {
                this.field2595 = 1;
            } else if (Statics.field808.startsWith("mac")) {
                this.field2595 = 2;
            } else if (Statics.field808.startsWith("linux")) {
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
                this.field2596 = true;
            } else {
                this.field2596 = false;
            }
            if (this.field2595 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2600 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2600 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2600 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2600 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2600 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2600 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2600 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2600 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2600 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2600 = 10;
                }
            } else if (this.field2595 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2600 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2600 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2600 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2600 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2600 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2600 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2600 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2618 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2618 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2618 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2618 = 4;
            } else {
                this.field2618 = 5;
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
            this.field2602 = var10;
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
            this.field2603 = var14;
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
            this.field2604 = var18;
            this.field2605 = false;
            this.field2615 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2602 > 3) {
                this.field2607 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2607 = 0;
            }
            this.field2608 = 0;
        }
        if (this.field2610 == null) {
            this.field2610 = "";
        }
        if (this.field2611 == null) {
            this.field2611 = "";
        }
        if (this.field2612 == null) {
            this.field2612 = "";
        }
        if (this.field2614 == null) {
            this.field2614 = "";
        }
        if (this.field2617 == null) {
            this.field2617 = "";
        }
        if (this.field2599 == null) {
            this.field2599 = "";
        }
        this.method2966();
    }

    @ObfuscatedName("fi.l(I)V")
    public void method2966() {
        if (this.field2610.length() > 40) {
            this.field2610 = this.field2610.substring(0, 40);
        }
        if (this.field2611.length() > 40) {
            this.field2611 = this.field2611.substring(0, 40);
        }
        if (this.field2612.length() > 10) {
            this.field2612 = this.field2612.substring(0, 10);
        }
        if (this.field2614.length() > 10) {
            this.field2614 = this.field2614.substring(0, 10);
        }
    }

    @ObfuscatedName("fi.e(Ldl;I)V")
    public void method2980(class119 arg0) {
        arg0.method2503(6);
        arg0.method2503(this.field2595);
        arg0.method2503(this.field2596 ? 1 : 0);
        arg0.method2503(this.field2600);
        arg0.method2503(this.field2618);
        arg0.method2503(this.field2602);
        arg0.method2503(this.field2603);
        arg0.method2503(this.field2604);
        arg0.method2503(this.field2605 ? 1 : 0);
        arg0.method2374(this.field2615);
        arg0.method2503(this.field2607);
        arg0.method2507(this.field2608);
        arg0.method2374(this.field2609);
        arg0.method2492(this.field2610);
        arg0.method2492(this.field2611);
        arg0.method2492(this.field2612);
        arg0.method2492(this.field2614);
        arg0.method2503(this.field2590);
        arg0.method2374(this.field2594);
        arg0.method2492(this.field2617);
        arg0.method2492(this.field2599);
        arg0.method2503(this.field2616);
        arg0.method2503(this.field2601);
        for (int var2 = 0; var2 < this.field2620.length; var2++) {
            arg0.method2376(this.field2620[var2]);
        }
        arg0.method2376(this.field2621);
    }

    @ObfuscatedName("fi.q(I)I")
    public int method2965() {
        byte var1 = 38;
        String var3 = this.field2610;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        int var6 = var5 + class119.method792(this.field2611);
        String var8 = this.field2612;
        int var9 = var8.length() + 2;
        int var10 = var6 + var9;
        String var12 = this.field2614;
        int var13 = var12.length() + 2;
        int var14 = var10 + var13;
        int var15 = var14 + class119.method792(this.field2617);
        return var15 + class119.method792(this.field2599);
    }
}
