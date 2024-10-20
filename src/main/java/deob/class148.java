package deob;

@ObfuscatedName("ef")
public class class148 extends class189 {

    @ObfuscatedName("ef.l")
    public int field2448;

    @ObfuscatedName("ef.b")
    public boolean field2425;

    @ObfuscatedName("ef.d")
    public int field2429;

    @ObfuscatedName("ef.o")
    public int field2430;

    @ObfuscatedName("ef.at")
    public int field2431;

    @ObfuscatedName("ef.ag")
    public int field2420;

    @ObfuscatedName("ef.ae")
    public int field2440;

    @ObfuscatedName("ef.ak")
    public boolean field2434;

    @ObfuscatedName("ef.ap")
    public int field2435;

    @ObfuscatedName("ef.ac")
    public int field2436;

    @ObfuscatedName("ef.ai")
    public int field2437;

    @ObfuscatedName("ef.ab")
    public int field2428;

    @ObfuscatedName("ef.an")
    public String field2439;

    @ObfuscatedName("ef.ah")
    public String field2421;

    @ObfuscatedName("ef.ad")
    public String field2441;

    @ObfuscatedName("ef.af")
    public String field2442;

    @ObfuscatedName("ef.aj")
    public int field2443;

    @ObfuscatedName("ef.am")
    public int field2444;

    @ObfuscatedName("ef.ay")
    public int field2445;

    @ObfuscatedName("ef.au")
    public int field2446;

    @ObfuscatedName("ef.aa")
    public String field2447;

    @ObfuscatedName("ef.aq")
    public String field2450;

    @ObfuscatedName("ef.av")
    public int[] field2449 = new int[3];

    @ObfuscatedName("ef.aw")
    public int field2433;

    public class148(boolean arg0) {
        if (arg0) {
            if (Statics.field1650.startsWith("win")) {
                this.field2448 = 1;
            } else if (Statics.field1650.startsWith("mac")) {
                this.field2448 = 2;
            } else if (Statics.field1650.startsWith("linux")) {
                this.field2448 = 3;
            } else {
                this.field2448 = 4;
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
                this.field2425 = true;
            } else {
                this.field2425 = false;
            }
            if (this.field2448 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2429 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2429 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2429 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2429 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2429 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2429 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2429 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2429 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2429 = 9;
                }
            } else if (this.field2448 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2429 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2429 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2429 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2429 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2430 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2430 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2430 = 4;
            } else {
                this.field2430 = 3;
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
            this.field2431 = var10;
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
            this.field2420 = var14;
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
            this.field2440 = var18;
            this.field2434 = false;
            this.field2435 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2431 > 3) {
                this.field2436 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2436 = 0;
            }
            this.field2437 = 0;
        }
        if (this.field2439 == null) {
            this.field2439 = "";
        }
        if (this.field2421 == null) {
            this.field2421 = "";
        }
        if (this.field2441 == null) {
            this.field2441 = "";
        }
        if (this.field2442 == null) {
            this.field2442 = "";
        }
        if (this.field2447 == null) {
            this.field2447 = "";
        }
        if (this.field2450 == null) {
            this.field2450 = "";
        }
        this.method2730();
    }

    @ObfuscatedName("ef.c(I)V")
    public void method2730() {
        if (this.field2439.length() > 40) {
            this.field2439 = this.field2439.substring(0, 40);
        }
        if (this.field2421.length() > 40) {
            this.field2421 = this.field2421.substring(0, 40);
        }
        if (this.field2441.length() > 10) {
            this.field2441 = this.field2441.substring(0, 10);
        }
        if (this.field2442.length() > 10) {
            this.field2442 = this.field2442.substring(0, 10);
        }
    }

    @ObfuscatedName("ef.j(Ldx;I)V")
    public void method2731(class108 arg0) {
        arg0.method2120(6);
        arg0.method2120(this.field2448);
        arg0.method2120(this.field2425 ? 1 : 0);
        arg0.method2120(this.field2429);
        arg0.method2120(this.field2430);
        arg0.method2120(this.field2431);
        arg0.method2120(this.field2420);
        arg0.method2120(this.field2440);
        arg0.method2120(this.field2434 ? 1 : 0);
        arg0.method2121(this.field2435);
        arg0.method2120(this.field2436);
        arg0.method2152(this.field2437);
        arg0.method2121(this.field2428);
        arg0.method2126(this.field2439);
        arg0.method2126(this.field2421);
        arg0.method2126(this.field2441);
        arg0.method2126(this.field2442);
        arg0.method2120(this.field2444);
        arg0.method2121(this.field2443);
        arg0.method2126(this.field2447);
        arg0.method2126(this.field2450);
        arg0.method2120(this.field2445);
        arg0.method2120(this.field2446);
        for (int var2 = 0; var2 < this.field2449.length; var2++) {
            arg0.method2123(this.field2449[var2]);
        }
        arg0.method2123(this.field2433);
    }

    @ObfuscatedName("ef.y(I)I")
    public int method2735() {
        byte var1 = 38;
        String var3 = this.field2439;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2421;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2441;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2442;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2447;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2450;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
