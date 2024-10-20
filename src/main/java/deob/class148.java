package deob;

@ObfuscatedName("ej")
public class class148 extends class189 {

    @ObfuscatedName("ej.c")
    public int field2419;

    @ObfuscatedName("ej.w")
    public boolean field2420;

    @ObfuscatedName("ej.x")
    public int field2426;

    @ObfuscatedName("ej.a")
    public int field2430;

    @ObfuscatedName("ej.am")
    public int field2446;

    @ObfuscatedName("ej.ac")
    public int field2438;

    @ObfuscatedName("ej.ap")
    public int field2433;

    @ObfuscatedName("ej.aq")
    public boolean field2422;

    @ObfuscatedName("ej.az")
    public int field2435;

    @ObfuscatedName("ej.at")
    public int field2416;

    @ObfuscatedName("ej.aj")
    public int field2437;

    @ObfuscatedName("ej.an")
    public int field2432;

    @ObfuscatedName("ej.al")
    public String field2439;

    @ObfuscatedName("ej.ag")
    public String field2440;

    @ObfuscatedName("ej.ah")
    public String field2441;

    @ObfuscatedName("ej.ar")
    public String field2442;

    @ObfuscatedName("ej.aa")
    public int field2443;

    @ObfuscatedName("ej.ax")
    public int field2444;

    @ObfuscatedName("ej.ay")
    public int field2445;

    @ObfuscatedName("ej.ao")
    public int field2423;

    @ObfuscatedName("ej.ad")
    public String field2447;

    @ObfuscatedName("ej.ab")
    public String field2448;

    @ObfuscatedName("ej.af")
    public int[] field2436 = new int[3];

    @ObfuscatedName("ej.aw")
    public int field2414;

    public class148(boolean arg0) {
        if (arg0) {
            if (Statics.field1915.startsWith("win")) {
                this.field2419 = 1;
            } else if (Statics.field1915.startsWith("mac")) {
                this.field2419 = 2;
            } else if (Statics.field1915.startsWith("linux")) {
                this.field2419 = 3;
            } else {
                this.field2419 = 4;
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
                this.field2420 = true;
            } else {
                this.field2420 = false;
            }
            if (this.field2419 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2426 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2426 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2426 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2426 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2426 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2426 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2426 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2426 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2426 = 9;
                }
            } else if (this.field2419 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2426 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2426 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2426 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2426 = 23;
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
            this.field2446 = var10;
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
            this.field2438 = var14;
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
            this.field2433 = var18;
            this.field2422 = false;
            this.field2435 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2446 > 3) {
                this.field2416 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2416 = 0;
            }
            this.field2437 = 0;
        }
        if (this.field2439 == null) {
            this.field2439 = "";
        }
        if (this.field2440 == null) {
            this.field2440 = "";
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
        if (this.field2448 == null) {
            this.field2448 = "";
        }
        this.method2642();
    }

    @ObfuscatedName("ej.g(I)V")
    public void method2642() {
        if (this.field2439.length() > 40) {
            this.field2439 = this.field2439.substring(0, 40);
        }
        if (this.field2440.length() > 40) {
            this.field2440 = this.field2440.substring(0, 40);
        }
        if (this.field2441.length() > 10) {
            this.field2441 = this.field2441.substring(0, 10);
        }
        if (this.field2442.length() > 10) {
            this.field2442 = this.field2442.substring(0, 10);
        }
    }

    @ObfuscatedName("ej.j(Ldf;I)V")
    public void method2643(class108 arg0) {
        arg0.method2069(6);
        arg0.method2069(this.field2419);
        arg0.method2069(this.field2420 ? 1 : 0);
        arg0.method2069(this.field2426);
        arg0.method2069(this.field2430);
        arg0.method2069(this.field2446);
        arg0.method2069(this.field2438);
        arg0.method2069(this.field2433);
        arg0.method2069(this.field2422 ? 1 : 0);
        arg0.method2195(this.field2435);
        arg0.method2069(this.field2416);
        arg0.method2217(this.field2437);
        arg0.method2195(this.field2432);
        arg0.method2075(this.field2439);
        arg0.method2075(this.field2440);
        arg0.method2075(this.field2441);
        arg0.method2075(this.field2442);
        arg0.method2069(this.field2444);
        arg0.method2195(this.field2443);
        arg0.method2075(this.field2447);
        arg0.method2075(this.field2448);
        arg0.method2069(this.field2445);
        arg0.method2069(this.field2423);
        for (int var2 = 0; var2 < this.field2436.length; var2++) {
            arg0.method2245(this.field2436[var2]);
        }
        arg0.method2245(this.field2414);
    }

    @ObfuscatedName("ej.z(B)I")
    public int method2644() {
        byte var1 = 38;
        int var2 = var1 + class108.method2800(this.field2439);
        int var3 = var2 + class108.method2800(this.field2440);
        int var4 = var3 + class108.method2800(this.field2441);
        int var5 = var4 + class108.method2800(this.field2442);
        int var6 = var5 + class108.method2800(this.field2447);
        return var6 + class108.method2800(this.field2448);
    }
}
