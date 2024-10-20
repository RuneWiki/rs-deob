package deob;

@ObfuscatedName("fj")
public class class161 extends class209 {

    @ObfuscatedName("fj.h")
    public int field2609;

    @ObfuscatedName("fj.g")
    public boolean field2610;

    @ObfuscatedName("fj.z")
    public int field2632;

    @ObfuscatedName("fj.az")
    public int field2615;

    @ObfuscatedName("fj.ah")
    public int field2616;

    @ObfuscatedName("fj.ar")
    public int field2622;

    @ObfuscatedName("fj.ab")
    public int field2614;

    @ObfuscatedName("fj.aj")
    public boolean field2606;

    @ObfuscatedName("fj.ay")
    public int field2625;

    @ObfuscatedName("fj.av")
    public int field2623;

    @ObfuscatedName("fj.am")
    public int field2631;

    @ObfuscatedName("fj.aw")
    public int field2624;

    @ObfuscatedName("fj.ad")
    public String field2618;

    @ObfuscatedName("fj.aa")
    public String field2626;

    @ObfuscatedName("fj.ac")
    public String field2617;

    @ObfuscatedName("fj.an")
    public String field2637;

    @ObfuscatedName("fj.ax")
    public int field2629;

    @ObfuscatedName("fj.au")
    public int field2630;

    @ObfuscatedName("fj.at")
    public int field2619;

    @ObfuscatedName("fj.ao")
    public int field2627;

    @ObfuscatedName("fj.al")
    public String field2633;

    @ObfuscatedName("fj.ak")
    public String field2634;

    @ObfuscatedName("fj.as")
    public int[] field2635 = new int[3];

    @ObfuscatedName("fj.bj")
    public int field2636;

    public class161(boolean arg0) {
        if (arg0) {
            if (Statics.field2084.startsWith("win")) {
                this.field2609 = 1;
            } else if (Statics.field2084.startsWith("mac")) {
                this.field2609 = 2;
            } else if (Statics.field2084.startsWith("linux")) {
                this.field2609 = 3;
            } else {
                this.field2609 = 4;
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
                this.field2610 = true;
            } else {
                this.field2610 = false;
            }
            if (this.field2609 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2632 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2632 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2632 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2632 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2632 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2632 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2632 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2632 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2632 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field2632 = 10;
                }
            } else if (this.field2609 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2632 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2632 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2632 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2632 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field2632 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field2632 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field2632 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2615 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2615 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field2615 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field2615 = 4;
            } else {
                this.field2615 = 5;
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
            this.field2616 = var10;
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
            this.field2622 = var14;
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
            this.field2614 = var18;
            this.field2606 = false;
            this.field2625 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2616 > 3) {
                this.field2623 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2623 = 0;
            }
            this.field2631 = 0;
        }
        if (this.field2618 == null) {
            this.field2618 = "";
        }
        if (this.field2626 == null) {
            this.field2626 = "";
        }
        if (this.field2617 == null) {
            this.field2617 = "";
        }
        if (this.field2637 == null) {
            this.field2637 = "";
        }
        if (this.field2633 == null) {
            this.field2633 = "";
        }
        if (this.field2634 == null) {
            this.field2634 = "";
        }
        this.method2945();
    }

    @ObfuscatedName("fj.e(I)V")
    public void method2945() {
        if (this.field2618.length() > 40) {
            this.field2618 = this.field2618.substring(0, 40);
        }
        if (this.field2626.length() > 40) {
            this.field2626 = this.field2626.substring(0, 40);
        }
        if (this.field2617.length() > 10) {
            this.field2617 = this.field2617.substring(0, 10);
        }
        if (this.field2637.length() > 10) {
            this.field2637 = this.field2637.substring(0, 10);
        }
    }

    @ObfuscatedName("fj.w(Ldq;I)V")
    public void method2947(class120 arg0) {
        arg0.method2397(6);
        arg0.method2397(this.field2609);
        arg0.method2397(this.field2610 ? 1 : 0);
        arg0.method2397(this.field2632);
        arg0.method2397(this.field2615);
        arg0.method2397(this.field2616);
        arg0.method2397(this.field2622);
        arg0.method2397(this.field2614);
        arg0.method2397(this.field2606 ? 1 : 0);
        arg0.method2545(this.field2625);
        arg0.method2397(this.field2623);
        arg0.method2342(this.field2631);
        arg0.method2545(this.field2624);
        arg0.method2347(this.field2618);
        arg0.method2347(this.field2626);
        arg0.method2347(this.field2617);
        arg0.method2347(this.field2637);
        arg0.method2397(this.field2630);
        arg0.method2545(this.field2629);
        arg0.method2347(this.field2633);
        arg0.method2347(this.field2634);
        arg0.method2397(this.field2619);
        arg0.method2397(this.field2627);
        for (int var2 = 0; var2 < this.field2635.length; var2++) {
            arg0.method2449(this.field2635[var2]);
        }
        arg0.method2449(this.field2636);
    }

    @ObfuscatedName("fj.f(I)I")
    public int method2948() {
        byte var1 = 38;
        String var3 = this.field2618;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2626;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2617;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2637;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2633;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2634;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
