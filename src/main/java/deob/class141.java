package deob;

@ObfuscatedName("ec")
public class class141 extends class176 {

    @ObfuscatedName("ec.a")
    public int field2379;

    @ObfuscatedName("ec.l")
    public boolean field2380;

    @ObfuscatedName("ec.h")
    public int field2387;

    @ObfuscatedName("ec.s")
    public int field2399;

    @ObfuscatedName("ec.ag")
    public int field2401;

    @ObfuscatedName("ec.ad")
    public int field2391;

    @ObfuscatedName("ec.ak")
    public int field2392;

    @ObfuscatedName("ec.ai")
    public boolean field2389;

    @ObfuscatedName("ec.ac")
    public int field2394;

    @ObfuscatedName("ec.ar")
    public int field2395;

    @ObfuscatedName("ec.ah")
    public int field2400;

    @ObfuscatedName("ec.ax")
    public int field2397;

    @ObfuscatedName("ec.ae")
    public String field2398;

    @ObfuscatedName("ec.ao")
    public String field2393;

    @ObfuscatedName("ec.aj")
    public String field2396;

    @ObfuscatedName("ec.ap")
    public String field2376;

    @ObfuscatedName("ec.am")
    public int field2378;

    @ObfuscatedName("ec.az")
    public int field2402;

    @ObfuscatedName("ec.aa")
    public int field2404;

    @ObfuscatedName("ec.ab")
    public int field2405;

    @ObfuscatedName("ec.aw")
    public String field2406;

    @ObfuscatedName("ec.av")
    public String field2407;

    @ObfuscatedName("ec.al")
    public int[] field2386 = new int[3];

    @ObfuscatedName("ec.aq")
    public int field2409;

    public class141(boolean arg0) {
        if (arg0) {
            if (Statics.field1997.startsWith("win")) {
                this.field2379 = 1;
            } else if (Statics.field1997.startsWith("mac")) {
                this.field2379 = 2;
            } else if (Statics.field1997.startsWith("linux")) {
                this.field2379 = 3;
            } else {
                this.field2379 = 4;
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
                this.field2380 = true;
            } else {
                this.field2380 = false;
            }
            if (this.field2379 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2387 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2387 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2387 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2387 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2387 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2387 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2387 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2387 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2387 = 9;
                }
            } else if (this.field2379 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2387 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2387 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2387 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2387 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2399 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2399 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2399 = 4;
            } else {
                this.field2399 = 3;
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
            this.field2401 = var10;
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
            this.field2391 = var14;
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
            this.field2392 = var18;
            this.field2389 = false;
            this.field2394 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2401 > 3) {
                this.field2395 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2395 = 0;
            }
            this.field2400 = 0;
        }
        if (this.field2398 == null) {
            this.field2398 = "";
        }
        if (this.field2393 == null) {
            this.field2393 = "";
        }
        if (this.field2396 == null) {
            this.field2396 = "";
        }
        if (this.field2376 == null) {
            this.field2376 = "";
        }
        if (this.field2406 == null) {
            this.field2406 = "";
        }
        if (this.field2407 == null) {
            this.field2407 = "";
        }
        this.method2741();
    }

    @ObfuscatedName("ec.z(B)V")
    public void method2741() {
        if (this.field2398.length() > 40) {
            this.field2398 = this.field2398.substring(0, 40);
        }
        if (this.field2393.length() > 40) {
            this.field2393 = this.field2393.substring(0, 40);
        }
        if (this.field2396.length() > 10) {
            this.field2396 = this.field2396.substring(0, 10);
        }
        if (this.field2376.length() > 10) {
            this.field2376 = this.field2376.substring(0, 10);
        }
    }

    @ObfuscatedName("ec.n(Lcj;I)V")
    public void method2730(class104 arg0) {
        arg0.method2113(6);
        arg0.method2113(this.field2379);
        arg0.method2113(this.field2380 ? 1 : 0);
        arg0.method2113(this.field2387);
        arg0.method2113(this.field2399);
        arg0.method2113(this.field2401);
        arg0.method2113(this.field2391);
        arg0.method2113(this.field2392);
        arg0.method2113(this.field2389 ? 1 : 0);
        arg0.method2114(this.field2394);
        arg0.method2113(this.field2395);
        arg0.method2115(this.field2400);
        arg0.method2114(this.field2397);
        arg0.method2119(this.field2398);
        arg0.method2119(this.field2393);
        arg0.method2119(this.field2396);
        arg0.method2119(this.field2376);
        arg0.method2113(this.field2402);
        arg0.method2114(this.field2378);
        arg0.method2119(this.field2406);
        arg0.method2119(this.field2407);
        arg0.method2113(this.field2404);
        arg0.method2113(this.field2405);
        for (int var2 = 0; var2 < this.field2386.length; var2++) {
            arg0.method2144(this.field2386[var2]);
        }
        arg0.method2144(this.field2409);
    }

    @ObfuscatedName("ec.u(I)I")
    public int method2731() {
        byte var1 = 38;
        int var2 = var1 + Statics.method2685(this.field2398);
        int var3 = var2 + Statics.method2685(this.field2393);
        String var5 = this.field2396;
        int var6 = var5.length() + 2;
        int var7 = var3 + var6;
        int var8 = var7 + Statics.method2685(this.field2376);
        String var10 = this.field2406;
        int var11 = var10.length() + 2;
        int var12 = var8 + var11;
        String var14 = this.field2407;
        int var15 = var14.length() + 2;
        return var12 + var15;
    }
}
