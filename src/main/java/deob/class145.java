package deob;

@ObfuscatedName("ew")
public class class145 extends class184 {

    @ObfuscatedName("ew.e")
    public int field2425;

    @ObfuscatedName("ew.k")
    public boolean field2426;

    @ObfuscatedName("ew.v")
    public int field2452;

    @ObfuscatedName("ew.x")
    public int field2433;

    @ObfuscatedName("ew.aj")
    public int field2456;

    @ObfuscatedName("ew.al")
    public int field2435;

    @ObfuscatedName("ew.af")
    public int field2445;

    @ObfuscatedName("ew.ai")
    public boolean field2437;

    @ObfuscatedName("ew.ak")
    public int field2438;

    @ObfuscatedName("ew.ag")
    public int field2439;

    @ObfuscatedName("ew.an")
    public int field2440;

    @ObfuscatedName("ew.av")
    public int field2442;

    @ObfuscatedName("ew.aw")
    public String field2447;

    @ObfuscatedName("ew.aq")
    public String field2444;

    @ObfuscatedName("ew.ad")
    public String field2424;

    @ObfuscatedName("ew.at")
    public String field2446;

    @ObfuscatedName("ew.aa")
    public int field2436;

    @ObfuscatedName("ew.ay")
    public int field2434;

    @ObfuscatedName("ew.am")
    public int field2449;

    @ObfuscatedName("ew.az")
    public int field2450;

    @ObfuscatedName("ew.au")
    public String field2454;

    @ObfuscatedName("ew.ac")
    public String field2422;

    @ObfuscatedName("ew.ab")
    public int[] field2453 = new int[3];

    @ObfuscatedName("ew.ao")
    public int field2448;

    public class145(boolean arg0) {
        if (arg0) {
            if (Statics.field1567.startsWith("win")) {
                this.field2425 = 1;
            } else if (Statics.field1567.startsWith("mac")) {
                this.field2425 = 2;
            } else if (Statics.field1567.startsWith("linux")) {
                this.field2425 = 3;
            } else {
                this.field2425 = 4;
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
                this.field2426 = true;
            } else {
                this.field2426 = false;
            }
            if (this.field2425 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2452 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2452 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2452 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2452 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2452 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2452 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2452 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2452 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2452 = 9;
                }
            } else if (this.field2425 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2452 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2452 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2452 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2452 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2433 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2433 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2433 = 4;
            } else {
                this.field2433 = 3;
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
            this.field2456 = var10;
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
            this.field2435 = var14;
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
            this.field2445 = var18;
            this.field2437 = false;
            this.field2438 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2456 > 3) {
                this.field2439 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2439 = 0;
            }
            this.field2440 = 0;
        }
        if (this.field2447 == null) {
            this.field2447 = "";
        }
        if (this.field2444 == null) {
            this.field2444 = "";
        }
        if (this.field2424 == null) {
            this.field2424 = "";
        }
        if (this.field2446 == null) {
            this.field2446 = "";
        }
        if (this.field2454 == null) {
            this.field2454 = "";
        }
        if (this.field2422 == null) {
            this.field2422 = "";
        }
        this.method2725();
    }

    @ObfuscatedName("ew.j(I)V")
    public void method2725() {
        if (this.field2447.length() > 40) {
            this.field2447 = this.field2447.substring(0, 40);
        }
        if (this.field2444.length() > 40) {
            this.field2444 = this.field2444.substring(0, 40);
        }
        if (this.field2424.length() > 10) {
            this.field2424 = this.field2424.substring(0, 10);
        }
        if (this.field2446.length() > 10) {
            this.field2446 = this.field2446.substring(0, 10);
        }
    }

    @ObfuscatedName("ew.z(Lde;I)V")
    public void method2728(class107 arg0) {
        arg0.method2116(6);
        arg0.method2116(this.field2425);
        arg0.method2116(this.field2426 ? 1 : 0);
        arg0.method2116(this.field2452);
        arg0.method2116(this.field2433);
        arg0.method2116(this.field2456);
        arg0.method2116(this.field2435);
        arg0.method2116(this.field2445);
        arg0.method2116(this.field2437 ? 1 : 0);
        arg0.method2270(this.field2438);
        arg0.method2116(this.field2439);
        arg0.method2118(this.field2440);
        arg0.method2270(this.field2442);
        arg0.method2122(this.field2447);
        arg0.method2122(this.field2444);
        arg0.method2122(this.field2424);
        arg0.method2122(this.field2446);
        arg0.method2116(this.field2434);
        arg0.method2270(this.field2436);
        arg0.method2122(this.field2454);
        arg0.method2122(this.field2422);
        arg0.method2116(this.field2449);
        arg0.method2116(this.field2450);
        for (int var2 = 0; var2 < this.field2453.length; var2++) {
            arg0.method2119(this.field2453[var2]);
        }
        arg0.method2119(this.field2448);
    }

    @ObfuscatedName("ew.y(I)I")
    public int method2729() {
        byte var1 = 38;
        String var3 = this.field2447;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2444;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2424;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2446;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2454;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2422;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
