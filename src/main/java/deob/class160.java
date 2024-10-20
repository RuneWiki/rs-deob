package deob;

@ObfuscatedName("fy")
public class class160 extends class208 {

    @ObfuscatedName("fy.o")
    public int field2583;

    @ObfuscatedName("fy.i")
    public boolean field2595;

    @ObfuscatedName("fy.n")
    public int field2592;

    @ObfuscatedName("fy.at")
    public int field2618;

    @ObfuscatedName("fy.af")
    public int field2601;

    @ObfuscatedName("fy.ax")
    public int field2580;

    @ObfuscatedName("fy.ac")
    public int field2615;

    @ObfuscatedName("fy.am")
    public boolean field2599;

    @ObfuscatedName("fy.ao")
    public int field2600;

    @ObfuscatedName("fy.ak")
    public int field2585;

    @ObfuscatedName("fy.aa")
    public int field2602;

    @ObfuscatedName("fy.ai")
    public int field2603;

    @ObfuscatedName("fy.av")
    public String field2604;

    @ObfuscatedName("fy.ar")
    public String field2605;

    @ObfuscatedName("fy.as")
    public String field2587;

    @ObfuscatedName("fy.ap")
    public String field2607;

    @ObfuscatedName("fy.ag")
    public int field2606;

    @ObfuscatedName("fy.ab")
    public int field2609;

    @ObfuscatedName("fy.al")
    public int field2610;

    @ObfuscatedName("fy.ae")
    public int field2611;

    @ObfuscatedName("fy.ay")
    public String field2581;

    @ObfuscatedName("fy.an")
    public String field2613;

    @ObfuscatedName("fy.ah")
    public int[] field2584 = new int[3];

    @ObfuscatedName("fy.be")
    public int field2596;

    public class160(boolean arg0) {
        if (arg0) {
            if (Statics.field2202.startsWith("win")) {
                this.field2583 = 1;
            } else if (Statics.field2202.startsWith("mac")) {
                this.field2583 = 2;
            } else if (Statics.field2202.startsWith("linux")) {
                this.field2583 = 3;
            } else {
                this.field2583 = 4;
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
                this.field2595 = true;
            } else {
                this.field2595 = false;
            }
            if (this.field2583 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2592 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2592 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2592 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2592 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2592 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2592 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2592 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2592 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2592 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2592 = 10;
                }
            } else if (this.field2583 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2592 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2592 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2592 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2592 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2592 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2592 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2592 = 26;
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
            this.field2601 = var10;
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
            this.field2580 = var14;
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
            this.field2599 = false;
            this.field2600 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2601 > 3) {
                this.field2585 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2585 = 0;
            }
            this.field2602 = 0;
        }
        if (this.field2604 == null) {
            this.field2604 = "";
        }
        if (this.field2605 == null) {
            this.field2605 = "";
        }
        if (this.field2587 == null) {
            this.field2587 = "";
        }
        if (this.field2607 == null) {
            this.field2607 = "";
        }
        if (this.field2581 == null) {
            this.field2581 = "";
        }
        if (this.field2613 == null) {
            this.field2613 = "";
        }
        this.method2904();
    }

    @ObfuscatedName("fy.c(I)V")
    public void method2904() {
        if (this.field2604.length() > 40) {
            this.field2604 = this.field2604.substring(0, 40);
        }
        if (this.field2605.length() > 40) {
            this.field2605 = this.field2605.substring(0, 40);
        }
        if (this.field2587.length() > 10) {
            this.field2587 = this.field2587.substring(0, 10);
        }
        if (this.field2607.length() > 10) {
            this.field2607 = this.field2607.substring(0, 10);
        }
    }

    @ObfuscatedName("fy.h(Ldf;I)V")
    public void method2914(class119 arg0) {
        arg0.method2276(6);
        arg0.method2276(this.field2583);
        arg0.method2276(this.field2595 ? 1 : 0);
        arg0.method2276(this.field2592);
        arg0.method2276(this.field2618);
        arg0.method2276(this.field2601);
        arg0.method2276(this.field2580);
        arg0.method2276(this.field2615);
        arg0.method2276(this.field2599 ? 1 : 0);
        arg0.method2451(this.field2600);
        arg0.method2276(this.field2585);
        arg0.method2278(this.field2602);
        arg0.method2451(this.field2603);
        arg0.method2283(this.field2604);
        arg0.method2283(this.field2605);
        arg0.method2283(this.field2587);
        arg0.method2283(this.field2607);
        arg0.method2276(this.field2609);
        arg0.method2451(this.field2606);
        arg0.method2283(this.field2581);
        arg0.method2283(this.field2613);
        arg0.method2276(this.field2610);
        arg0.method2276(this.field2611);
        for (int var2 = 0; var2 < this.field2584.length; var2++) {
            arg0.method2484(this.field2584[var2]);
        }
        arg0.method2484(this.field2596);
    }

    @ObfuscatedName("fy.k(I)I")
    public int method2907() {
        byte var1 = 38;
        String var3 = this.field2604;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2605;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2587;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2607;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2581;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2613;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
