package deob;

@ObfuscatedName("ef")
public class class152 extends class179 {

    @ObfuscatedName("ef.x")
    public int field2495;

    @ObfuscatedName("ef.k")
    public boolean field2497;

    @ObfuscatedName("ef.y")
    public int field2503;

    @ObfuscatedName("ef.c")
    public int field2507;

    @ObfuscatedName("ef.af")
    public int field2508;

    @ObfuscatedName("ef.aq")
    public int field2496;

    @ObfuscatedName("ef.at")
    public int field2510;

    @ObfuscatedName("ef.aw")
    public boolean field2511;

    @ObfuscatedName("ef.ax")
    public int field2512;

    @ObfuscatedName("ef.ar")
    public int field2505;

    @ObfuscatedName("ef.ai")
    public int field2514;

    @ObfuscatedName("ef.aj")
    public int field2515;

    @ObfuscatedName("ef.ap")
    public String field2516;

    @ObfuscatedName("ef.av")
    public String field2517;

    @ObfuscatedName("ef.ad")
    public String field2513;

    @ObfuscatedName("ef.ae")
    public String field2502;

    @ObfuscatedName("ef.ah")
    public int field2520;

    @ObfuscatedName("ef.am")
    public int field2521;

    @ObfuscatedName("ef.ay")
    public int field2522;

    @ObfuscatedName("ef.ag")
    public int field2523;

    @ObfuscatedName("ef.al")
    public String field2519;

    @ObfuscatedName("ef.an")
    public String field2501;

    @ObfuscatedName("ef.aa")
    public int[] field2526 = new int[3];

    @ObfuscatedName("ef.ao")
    public int field2527;

    public class152(boolean arg0) {
        if (arg0) {
            if (Statics.field1425.startsWith("win")) {
                this.field2495 = 1;
            } else if (Statics.field1425.startsWith("mac")) {
                this.field2495 = 2;
            } else if (Statics.field1425.startsWith("linux")) {
                this.field2495 = 3;
            } else {
                this.field2495 = 4;
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
                this.field2497 = true;
            } else {
                this.field2497 = false;
            }
            if (this.field2495 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2503 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2503 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2503 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2503 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2503 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2503 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2503 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2503 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2503 = 9;
                }
            } else if (this.field2495 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2503 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2503 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2503 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2503 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2507 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2507 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2507 = 4;
            } else {
                this.field2507 = 3;
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
            this.field2508 = var10;
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
            this.field2496 = var14;
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
            this.field2510 = var18;
            this.field2511 = false;
            this.field2512 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2508 > 3) {
                this.field2505 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2505 = 0;
            }
            this.field2514 = 0;
        }
        if (this.field2516 == null) {
            this.field2516 = "";
        }
        if (this.field2517 == null) {
            this.field2517 = "";
        }
        if (this.field2513 == null) {
            this.field2513 = "";
        }
        if (this.field2502 == null) {
            this.field2502 = "";
        }
        if (this.field2519 == null) {
            this.field2519 = "";
        }
        if (this.field2501 == null) {
            this.field2501 = "";
        }
        this.method3071();
    }

    @ObfuscatedName("ef.g(B)V")
    public void method3071() {
        if (this.field2516.length() > 40) {
            this.field2516 = this.field2516.substring(0, 40);
        }
        if (this.field2517.length() > 40) {
            this.field2517 = this.field2517.substring(0, 40);
        }
        if (this.field2513.length() > 10) {
            this.field2513 = this.field2513.substring(0, 10);
        }
        if (this.field2502.length() > 10) {
            this.field2502 = this.field2502.substring(0, 10);
        }
    }

    @ObfuscatedName("ef.h(Ldw;I)V")
    public void method3072(class127 arg0) {
        arg0.method2485(6);
        arg0.method2485(this.field2495);
        arg0.method2485(this.field2497 ? 1 : 0);
        arg0.method2485(this.field2503);
        arg0.method2485(this.field2507);
        arg0.method2485(this.field2508);
        arg0.method2485(this.field2496);
        arg0.method2485(this.field2510);
        arg0.method2485(this.field2511 ? 1 : 0);
        arg0.method2484(this.field2512);
        arg0.method2485(this.field2505);
        arg0.method2487(this.field2514);
        arg0.method2484(this.field2515);
        arg0.method2491(this.field2516);
        arg0.method2491(this.field2517);
        arg0.method2491(this.field2513);
        arg0.method2491(this.field2502);
        arg0.method2485(this.field2521);
        arg0.method2484(this.field2520);
        arg0.method2491(this.field2519);
        arg0.method2491(this.field2501);
        arg0.method2485(this.field2522);
        arg0.method2485(this.field2523);
        for (int var2 = 0; var2 < this.field2526.length; var2++) {
            arg0.method2605(this.field2526[var2]);
        }
        arg0.method2605(this.field2527);
    }

    @ObfuscatedName("ef.s(I)I")
    public int method3073() {
        byte var1 = 38;
        String var3 = this.field2516;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2517;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2513;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2502;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2519;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2501;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
