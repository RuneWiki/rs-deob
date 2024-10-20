package deob;

@ObfuscatedName("ey")
public class class141 extends class176 {

    @ObfuscatedName("ey.i")
    public int field2373;

    @ObfuscatedName("ey.f")
    public boolean field2374;

    @ObfuscatedName("ey.s")
    public int field2376;

    @ObfuscatedName("ey.z")
    public int field2378;

    @ObfuscatedName("ey.az")
    public int field2379;

    @ObfuscatedName("ey.av")
    public int field2380;

    @ObfuscatedName("ey.ay")
    public int field2383;

    @ObfuscatedName("ey.ah")
    public boolean field2382;

    @ObfuscatedName("ey.ao")
    public int field2375;

    @ObfuscatedName("ey.ad")
    public int field2370;

    @ObfuscatedName("ey.af")
    public int field2385;

    @ObfuscatedName("ey.am")
    public int field2386;

    @ObfuscatedName("ey.aq")
    public String field2387;

    @ObfuscatedName("ey.ar")
    public String field2388;

    @ObfuscatedName("ey.an")
    public String field2389;

    @ObfuscatedName("ey.au")
    public String field2393;

    @ObfuscatedName("ey.aa")
    public int field2391;

    @ObfuscatedName("ey.ag")
    public int field2392;

    @ObfuscatedName("ey.al")
    public int field2390;

    @ObfuscatedName("ey.ap")
    public int field2395;

    @ObfuscatedName("ey.ac")
    public String field2381;

    @ObfuscatedName("ey.ak")
    public String field2396;

    @ObfuscatedName("ey.ax")
    public int[] field2399 = new int[3];

    @ObfuscatedName("ey.ab")
    public int field2398;

    public class141(boolean arg0) {
        if (arg0) {
            if (Statics.field1486.startsWith("win")) {
                this.field2373 = 1;
            } else if (Statics.field1486.startsWith("mac")) {
                this.field2373 = 2;
            } else if (Statics.field1486.startsWith("linux")) {
                this.field2373 = 3;
            } else {
                this.field2373 = 4;
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
                this.field2374 = true;
            } else {
                this.field2374 = false;
            }
            if (this.field2373 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2376 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2376 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2376 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2376 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2376 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2376 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2376 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2376 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2376 = 9;
                }
            } else if (this.field2373 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2376 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2376 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2376 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2376 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2378 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2378 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2378 = 4;
            } else {
                this.field2378 = 3;
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
            this.field2379 = var10;
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
            this.field2380 = var14;
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
            this.field2383 = var18;
            this.field2382 = false;
            this.field2375 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2379 > 3) {
                this.field2370 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2370 = 0;
            }
            this.field2385 = 0;
        }
        if (this.field2387 == null) {
            this.field2387 = "";
        }
        if (this.field2388 == null) {
            this.field2388 = "";
        }
        if (this.field2389 == null) {
            this.field2389 = "";
        }
        if (this.field2393 == null) {
            this.field2393 = "";
        }
        if (this.field2381 == null) {
            this.field2381 = "";
        }
        if (this.field2396 == null) {
            this.field2396 = "";
        }
        this.method2689();
    }

    @ObfuscatedName("ey.m(S)V")
    public void method2689() {
        if (this.field2387.length() > 40) {
            this.field2387 = this.field2387.substring(0, 40);
        }
        if (this.field2388.length() > 40) {
            this.field2388 = this.field2388.substring(0, 40);
        }
        if (this.field2389.length() > 10) {
            this.field2389 = this.field2389.substring(0, 10);
        }
        if (this.field2393.length() > 10) {
            this.field2393 = this.field2393.substring(0, 10);
        }
    }

    @ObfuscatedName("ey.k(Lcb;S)V")
    public void method2684(class104 arg0) {
        arg0.method2133(6);
        arg0.method2133(this.field2373);
        arg0.method2133(this.field2374 ? 1 : 0);
        arg0.method2133(this.field2376);
        arg0.method2133(this.field2378);
        arg0.method2133(this.field2379);
        arg0.method2133(this.field2380);
        arg0.method2133(this.field2383);
        arg0.method2133(this.field2382 ? 1 : 0);
        arg0.method2117(this.field2375);
        arg0.method2133(this.field2370);
        arg0.method2118(this.field2385);
        arg0.method2117(this.field2386);
        arg0.method2122(this.field2387);
        arg0.method2122(this.field2388);
        arg0.method2122(this.field2389);
        arg0.method2122(this.field2393);
        arg0.method2133(this.field2392);
        arg0.method2117(this.field2391);
        arg0.method2122(this.field2381);
        arg0.method2122(this.field2396);
        arg0.method2133(this.field2390);
        arg0.method2133(this.field2395);
        for (int var2 = 0; var2 < this.field2399.length; var2++) {
            arg0.method2131(this.field2399[var2]);
        }
        arg0.method2131(this.field2398);
    }

    @ObfuscatedName("ey.y(B)I")
    public int method2683() {
        byte var1 = 38;
        String var3 = this.field2387;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2388;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2389;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2393;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2381;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2396;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
