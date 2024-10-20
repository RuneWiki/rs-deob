package deob;

@ObfuscatedName("ep")
public class class148 extends class189 {

    @ObfuscatedName("ep.p")
    public int field2427;

    @ObfuscatedName("ep.j")
    public boolean field2430;

    @ObfuscatedName("ep.o")
    public int field2445;

    @ObfuscatedName("ep.n")
    public int field2432;

    @ObfuscatedName("ep.ae")
    public int field2433;

    @ObfuscatedName("ep.ay")
    public int field2434;

    @ObfuscatedName("ep.ac")
    public int field2426;

    @ObfuscatedName("ep.ag")
    public boolean field2424;

    @ObfuscatedName("ep.am")
    public int field2437;

    @ObfuscatedName("ep.ai")
    public int field2438;

    @ObfuscatedName("ep.az")
    public int field2439;

    @ObfuscatedName("ep.as")
    public int field2440;

    @ObfuscatedName("ep.ah")
    public String field2441;

    @ObfuscatedName("ep.aw")
    public String field2425;

    @ObfuscatedName("ep.ar")
    public String field2443;

    @ObfuscatedName("ep.at")
    public String field2423;

    @ObfuscatedName("ep.ap")
    public int field2444;

    @ObfuscatedName("ep.ak")
    public int field2435;

    @ObfuscatedName("ep.aa")
    public int field2447;

    @ObfuscatedName("ep.av")
    public int field2448;

    @ObfuscatedName("ep.al")
    public String field2449;

    @ObfuscatedName("ep.af")
    public String field2450;

    @ObfuscatedName("ep.aj")
    public int[] field2451 = new int[3];

    @ObfuscatedName("ep.ao")
    public int field2442;

    public class148(boolean arg0) {
        if (arg0) {
            if (Statics.field620.startsWith("win")) {
                this.field2427 = 1;
            } else if (Statics.field620.startsWith("mac")) {
                this.field2427 = 2;
            } else if (Statics.field620.startsWith("linux")) {
                this.field2427 = 3;
            } else {
                this.field2427 = 4;
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
                this.field2430 = true;
            } else {
                this.field2430 = false;
            }
            if (this.field2427 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2445 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2445 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2445 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2445 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2445 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2445 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2445 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2445 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2445 = 9;
                }
            } else if (this.field2427 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2445 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2445 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2445 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2445 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2432 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2432 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2432 = 4;
            } else {
                this.field2432 = 3;
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
            this.field2433 = var10;
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
            this.field2434 = var14;
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
            this.field2426 = var18;
            this.field2424 = false;
            this.field2437 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2433 > 3) {
                this.field2438 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2438 = 0;
            }
            this.field2439 = 0;
        }
        if (this.field2441 == null) {
            this.field2441 = "";
        }
        if (this.field2425 == null) {
            this.field2425 = "";
        }
        if (this.field2443 == null) {
            this.field2443 = "";
        }
        if (this.field2423 == null) {
            this.field2423 = "";
        }
        if (this.field2449 == null) {
            this.field2449 = "";
        }
        if (this.field2450 == null) {
            this.field2450 = "";
        }
        this.method2721();
    }

    @ObfuscatedName("ep.x(B)V")
    public void method2721() {
        if (this.field2441.length() > 40) {
            this.field2441 = this.field2441.substring(0, 40);
        }
        if (this.field2425.length() > 40) {
            this.field2425 = this.field2425.substring(0, 40);
        }
        if (this.field2443.length() > 10) {
            this.field2443 = this.field2443.substring(0, 10);
        }
        if (this.field2423.length() > 10) {
            this.field2423 = this.field2423.substring(0, 10);
        }
    }

    @ObfuscatedName("ep.v(Ldm;I)V")
    public void method2722(class108 arg0) {
        arg0.method2113(6);
        arg0.method2113(this.field2427);
        arg0.method2113(this.field2430 ? 1 : 0);
        arg0.method2113(this.field2445);
        arg0.method2113(this.field2432);
        arg0.method2113(this.field2433);
        arg0.method2113(this.field2434);
        arg0.method2113(this.field2426);
        arg0.method2113(this.field2424 ? 1 : 0);
        arg0.method2114(this.field2437);
        arg0.method2113(this.field2438);
        arg0.method2147(this.field2439);
        arg0.method2114(this.field2440);
        arg0.method2279(this.field2441);
        arg0.method2279(this.field2425);
        arg0.method2279(this.field2443);
        arg0.method2279(this.field2423);
        arg0.method2113(this.field2435);
        arg0.method2114(this.field2444);
        arg0.method2279(this.field2449);
        arg0.method2279(this.field2450);
        arg0.method2113(this.field2447);
        arg0.method2113(this.field2448);
        for (int var2 = 0; var2 < this.field2451.length; var2++) {
            arg0.method2233(this.field2451[var2]);
        }
        arg0.method2233(this.field2442);
    }

    @ObfuscatedName("ep.m(I)I")
    public int method2725() {
        byte var1 = 38;
        String var3 = this.field2441;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2425;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2443;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2423;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2449;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2450;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
