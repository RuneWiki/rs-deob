package deob;

@ObfuscatedName("em")
public class class152 extends class179 {

    @ObfuscatedName("em.x")
    public int field2524;

    @ObfuscatedName("em.u")
    public boolean field2499;

    @ObfuscatedName("em.r")
    public int field2503;

    @ObfuscatedName("em.i")
    public int field2498;

    @ObfuscatedName("em.ap")
    public int field2505;

    @ObfuscatedName("em.as")
    public int field2506;

    @ObfuscatedName("em.ak")
    public int field2512;

    @ObfuscatedName("em.af")
    public boolean field2520;

    @ObfuscatedName("em.ag")
    public int field2509;

    @ObfuscatedName("em.ac")
    public int field2510;

    @ObfuscatedName("em.ad")
    public int field2511;

    @ObfuscatedName("em.ai")
    public int field2500;

    @ObfuscatedName("em.ae")
    public String field2513;

    @ObfuscatedName("em.au")
    public String field2514;

    @ObfuscatedName("em.at")
    public String field2519;

    @ObfuscatedName("em.ax")
    public String field2516;

    @ObfuscatedName("em.aq")
    public int field2517;

    @ObfuscatedName("em.aw")
    public int field2504;

    @ObfuscatedName("em.ao")
    public int field2508;

    @ObfuscatedName("em.aa")
    public int field2525;

    @ObfuscatedName("em.ah")
    public String field2521;

    @ObfuscatedName("em.av")
    public String field2522;

    @ObfuscatedName("em.am")
    public int[] field2523 = new int[3];

    @ObfuscatedName("em.ab")
    public int field2518;

    public class152(boolean arg0) {
        if (arg0) {
            if (Statics.field1351.startsWith("win")) {
                this.field2524 = 1;
            } else if (Statics.field1351.startsWith("mac")) {
                this.field2524 = 2;
            } else if (Statics.field1351.startsWith("linux")) {
                this.field2524 = 3;
            } else {
                this.field2524 = 4;
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
                this.field2499 = true;
            } else {
                this.field2499 = false;
            }
            if (this.field2524 == 1) {
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
            } else if (this.field2524 == 2) {
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
                this.field2498 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2498 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2498 = 4;
            } else {
                this.field2498 = 3;
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
            this.field2505 = var10;
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
            this.field2506 = var14;
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
            this.field2512 = var18;
            this.field2520 = false;
            this.field2509 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2505 > 3) {
                this.field2510 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2510 = 0;
            }
            this.field2511 = 0;
        }
        if (this.field2513 == null) {
            this.field2513 = "";
        }
        if (this.field2514 == null) {
            this.field2514 = "";
        }
        if (this.field2519 == null) {
            this.field2519 = "";
        }
        if (this.field2516 == null) {
            this.field2516 = "";
        }
        if (this.field2521 == null) {
            this.field2521 = "";
        }
        if (this.field2522 == null) {
            this.field2522 = "";
        }
        this.method2872();
    }

    @ObfuscatedName("em.c(B)V")
    public void method2872() {
        if (this.field2513.length() > 40) {
            this.field2513 = this.field2513.substring(0, 40);
        }
        if (this.field2514.length() > 40) {
            this.field2514 = this.field2514.substring(0, 40);
        }
        if (this.field2519.length() > 10) {
            this.field2519 = this.field2519.substring(0, 10);
        }
        if (this.field2516.length() > 10) {
            this.field2516 = this.field2516.substring(0, 10);
        }
    }

    @ObfuscatedName("em.q(Ldg;I)V")
    public void method2873(class127 arg0) {
        arg0.method2333(6);
        arg0.method2333(this.field2524);
        arg0.method2333(this.field2499 ? 1 : 0);
        arg0.method2333(this.field2503);
        arg0.method2333(this.field2498);
        arg0.method2333(this.field2505);
        arg0.method2333(this.field2506);
        arg0.method2333(this.field2512);
        arg0.method2333(this.field2520 ? 1 : 0);
        arg0.method2306(this.field2509);
        arg0.method2333(this.field2510);
        arg0.method2406(this.field2511);
        arg0.method2306(this.field2500);
        arg0.method2310(this.field2513);
        arg0.method2310(this.field2514);
        arg0.method2310(this.field2519);
        arg0.method2310(this.field2516);
        arg0.method2333(this.field2504);
        arg0.method2306(this.field2517);
        arg0.method2310(this.field2521);
        arg0.method2310(this.field2522);
        arg0.method2333(this.field2508);
        arg0.method2333(this.field2525);
        for (int var2 = 0; var2 < this.field2523.length; var2++) {
            arg0.method2307(this.field2523[var2]);
        }
        arg0.method2307(this.field2518);
    }

    @ObfuscatedName("em.y(B)I")
    public int method2874() {
        byte var1 = 38;
        String var3 = this.field2513;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2514;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2519;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2516;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2521;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2522;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
