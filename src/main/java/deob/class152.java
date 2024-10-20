package deob;

@ObfuscatedName("es")
public class class152 extends class179 {

    @ObfuscatedName("es.k")
    public int field2501;

    @ObfuscatedName("es.v")
    public boolean field2502;

    @ObfuscatedName("es.f")
    public int field2506;

    @ObfuscatedName("es.i")
    public int field2505;

    @ObfuscatedName("es.ap")
    public int field2509;

    @ObfuscatedName("es.am")
    public int field2519;

    @ObfuscatedName("es.ao")
    public int field2524;

    @ObfuscatedName("es.af")
    public boolean field2512;

    @ObfuscatedName("es.ae")
    public int field2513;

    @ObfuscatedName("es.al")
    public int field2514;

    @ObfuscatedName("es.ac")
    public int field2515;

    @ObfuscatedName("es.an")
    public int field2516;

    @ObfuscatedName("es.ai")
    public String field2517;

    @ObfuscatedName("es.aa")
    public String field2518;

    @ObfuscatedName("es.ab")
    public String field2520;

    @ObfuscatedName("es.aj")
    public String field2525;

    @ObfuscatedName("es.au")
    public int field2521;

    @ObfuscatedName("es.ar")
    public int field2522;

    @ObfuscatedName("es.ad")
    public int field2511;

    @ObfuscatedName("es.at")
    public int field2523;

    @ObfuscatedName("es.ag")
    public String field2507;

    @ObfuscatedName("es.ax")
    public String field2526;

    @ObfuscatedName("es.ah")
    public int[] field2527 = new int[3];

    @ObfuscatedName("es.av")
    public int field2528;

    public class152(boolean arg0) {
        if (arg0) {
            if (Statics.field1435.startsWith("win")) {
                this.field2501 = 1;
            } else if (Statics.field1435.startsWith("mac")) {
                this.field2501 = 2;
            } else if (Statics.field1435.startsWith("linux")) {
                this.field2501 = 3;
            } else {
                this.field2501 = 4;
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
                this.field2502 = true;
            } else {
                this.field2502 = false;
            }
            if (this.field2501 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2506 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2506 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2506 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2506 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2506 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2506 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2506 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2506 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2506 = 9;
                }
            } else if (this.field2501 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2506 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2506 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2506 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2506 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2505 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2505 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2505 = 4;
            } else {
                this.field2505 = 3;
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
            this.field2509 = var10;
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
            this.field2519 = var14;
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
            this.field2524 = var18;
            this.field2512 = false;
            this.field2513 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2509 > 3) {
                this.field2514 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2514 = 0;
            }
            this.field2515 = 0;
        }
        if (this.field2517 == null) {
            this.field2517 = "";
        }
        if (this.field2518 == null) {
            this.field2518 = "";
        }
        if (this.field2520 == null) {
            this.field2520 = "";
        }
        if (this.field2525 == null) {
            this.field2525 = "";
        }
        if (this.field2507 == null) {
            this.field2507 = "";
        }
        if (this.field2526 == null) {
            this.field2526 = "";
        }
        this.method2944();
    }

    @ObfuscatedName("es.q(I)V")
    public void method2944() {
        if (this.field2517.length() > 40) {
            this.field2517 = this.field2517.substring(0, 40);
        }
        if (this.field2518.length() > 40) {
            this.field2518 = this.field2518.substring(0, 40);
        }
        if (this.field2520.length() > 10) {
            this.field2520 = this.field2520.substring(0, 10);
        }
        if (this.field2525.length() > 10) {
            this.field2525 = this.field2525.substring(0, 10);
        }
    }

    @ObfuscatedName("es.c(Ldo;B)V")
    public void method2939(class127 arg0) {
        arg0.method2411(6);
        arg0.method2411(this.field2501);
        arg0.method2411(this.field2502 ? 1 : 0);
        arg0.method2411(this.field2506);
        arg0.method2411(this.field2505);
        arg0.method2411(this.field2509);
        arg0.method2411(this.field2519);
        arg0.method2411(this.field2524);
        arg0.method2411(this.field2512 ? 1 : 0);
        arg0.method2424(this.field2513);
        arg0.method2411(this.field2514);
        arg0.method2413(this.field2515);
        arg0.method2424(this.field2516);
        arg0.method2417(this.field2517);
        arg0.method2417(this.field2518);
        arg0.method2417(this.field2520);
        arg0.method2417(this.field2525);
        arg0.method2411(this.field2522);
        arg0.method2424(this.field2521);
        arg0.method2417(this.field2507);
        arg0.method2417(this.field2526);
        arg0.method2411(this.field2511);
        arg0.method2411(this.field2523);
        for (int var2 = 0; var2 < this.field2527.length; var2++) {
            arg0.method2414(this.field2527[var2]);
        }
        arg0.method2414(this.field2528);
    }

    @ObfuscatedName("es.p(I)I")
    public int method2938() {
        byte var1 = 38;
        String var3 = this.field2517;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2518;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2520;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2525;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2507;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2526;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
