package deob;

@ObfuscatedName("ei")
public class class148 extends class189 {

    @ObfuscatedName("ei.c")
    public int field2408;

    @ObfuscatedName("ei.x")
    public boolean field2404;

    @ObfuscatedName("ei.h")
    public int field2416;

    @ObfuscatedName("ei.q")
    public int field2422;

    @ObfuscatedName("ei.ak")
    public int field2409;

    @ObfuscatedName("ei.ah")
    public int field2435;

    @ObfuscatedName("ei.an")
    public int field2420;

    @ObfuscatedName("ei.aw")
    public boolean field2421;

    @ObfuscatedName("ei.az")
    public int field2433;

    @ObfuscatedName("ei.ag")
    public int field2419;

    @ObfuscatedName("ei.au")
    public int field2425;

    @ObfuscatedName("ei.aq")
    public int field2418;

    @ObfuscatedName("ei.am")
    public String field2427;

    @ObfuscatedName("ei.ax")
    public String field2415;

    @ObfuscatedName("ei.af")
    public String field2429;

    @ObfuscatedName("ei.av")
    public String field2430;

    @ObfuscatedName("ei.ao")
    public int field2417;

    @ObfuscatedName("ei.al")
    public int field2432;

    @ObfuscatedName("ei.aj")
    public int field2434;

    @ObfuscatedName("ei.ae")
    public int field2431;

    @ObfuscatedName("ei.ai")
    public String field2403;

    @ObfuscatedName("ei.ay")
    public String field2436;

    @ObfuscatedName("ei.ab")
    public int[] field2426 = new int[3];

    @ObfuscatedName("ei.ar")
    public int field2438;

    public class148(boolean arg0) {
        if (arg0) {
            if (Statics.field1565.startsWith("win")) {
                this.field2408 = 1;
            } else if (Statics.field1565.startsWith("mac")) {
                this.field2408 = 2;
            } else if (Statics.field1565.startsWith("linux")) {
                this.field2408 = 3;
            } else {
                this.field2408 = 4;
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
                this.field2404 = true;
            } else {
                this.field2404 = false;
            }
            if (this.field2408 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2416 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2416 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2416 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2416 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2416 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2416 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2416 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2416 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2416 = 9;
                }
            } else if (this.field2408 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2416 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2416 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2416 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2416 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2422 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2422 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2422 = 4;
            } else {
                this.field2422 = 3;
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
            this.field2409 = var10;
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
            this.field2420 = var18;
            this.field2421 = false;
            this.field2433 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2409 > 3) {
                this.field2419 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2419 = 0;
            }
            this.field2425 = 0;
        }
        if (this.field2427 == null) {
            this.field2427 = "";
        }
        if (this.field2415 == null) {
            this.field2415 = "";
        }
        if (this.field2429 == null) {
            this.field2429 = "";
        }
        if (this.field2430 == null) {
            this.field2430 = "";
        }
        if (this.field2403 == null) {
            this.field2403 = "";
        }
        if (this.field2436 == null) {
            this.field2436 = "";
        }
        this.method2734();
    }

    @ObfuscatedName("ei.l(I)V")
    public void method2734() {
        if (this.field2427.length() > 40) {
            this.field2427 = this.field2427.substring(0, 40);
        }
        if (this.field2415.length() > 40) {
            this.field2415 = this.field2415.substring(0, 40);
        }
        if (this.field2429.length() > 10) {
            this.field2429 = this.field2429.substring(0, 10);
        }
        if (this.field2430.length() > 10) {
            this.field2430 = this.field2430.substring(0, 10);
        }
    }

    @ObfuscatedName("ei.y(Ldk;B)V")
    public void method2735(class108 arg0) {
        arg0.method2226(6);
        arg0.method2226(this.field2408);
        arg0.method2226(this.field2404 ? 1 : 0);
        arg0.method2226(this.field2416);
        arg0.method2226(this.field2422);
        arg0.method2226(this.field2409);
        arg0.method2226(this.field2435);
        arg0.method2226(this.field2420);
        arg0.method2226(this.field2421 ? 1 : 0);
        arg0.method2148(this.field2433);
        arg0.method2226(this.field2419);
        arg0.method2149(this.field2425);
        arg0.method2148(this.field2418);
        arg0.method2153(this.field2427);
        arg0.method2153(this.field2415);
        arg0.method2153(this.field2429);
        arg0.method2153(this.field2430);
        arg0.method2226(this.field2432);
        arg0.method2148(this.field2417);
        arg0.method2153(this.field2403);
        arg0.method2153(this.field2436);
        arg0.method2226(this.field2434);
        arg0.method2226(this.field2431);
        for (int var2 = 0; var2 < this.field2426.length; var2++) {
            arg0.method2150(this.field2426[var2]);
        }
        arg0.method2150(this.field2438);
    }

    @ObfuscatedName("ei.g(I)I")
    public int method2746() {
        byte var1 = 38;
        String var3 = this.field2427;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2415;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2429;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2430;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2403;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2436;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
