package deob;

@ObfuscatedName("ex")
public class class146 extends class187 {

    @ObfuscatedName("ex.q")
    public int field2408;

    @ObfuscatedName("ex.m")
    public boolean field2409;

    @ObfuscatedName("ex.g")
    public int field2414;

    @ObfuscatedName("ex.l")
    public int field2437;

    @ObfuscatedName("ex.al")
    public int field2417;

    @ObfuscatedName("ex.aa")
    public int field2418;

    @ObfuscatedName("ex.ar")
    public int field2419;

    @ObfuscatedName("ex.ak")
    public boolean field2431;

    @ObfuscatedName("ex.ay")
    public int field2421;

    @ObfuscatedName("ex.av")
    public int field2423;

    @ObfuscatedName("ex.af")
    public int field2424;

    @ObfuscatedName("ex.ae")
    public int field2439;

    @ObfuscatedName("ex.ai")
    public String field2426;

    @ObfuscatedName("ex.as")
    public String field2427;

    @ObfuscatedName("ex.aj")
    public String field2443;

    @ObfuscatedName("ex.au")
    public String field2429;

    @ObfuscatedName("ex.az")
    public int field2411;

    @ObfuscatedName("ex.ao")
    public int field2416;

    @ObfuscatedName("ex.ag")
    public int field2441;

    @ObfuscatedName("ex.aq")
    public int field2433;

    @ObfuscatedName("ex.an")
    public String field2434;

    @ObfuscatedName("ex.ax")
    public String field2435;

    @ObfuscatedName("ex.ap")
    public int[] field2404 = new int[3];

    @ObfuscatedName("ex.ac")
    public int field2432;

    public class146(boolean arg0) {
        if (arg0) {
            if (Statics.field701.startsWith("win")) {
                this.field2408 = 1;
            } else if (Statics.field701.startsWith("mac")) {
                this.field2408 = 2;
            } else if (Statics.field701.startsWith("linux")) {
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
                this.field2409 = true;
            } else {
                this.field2409 = false;
            }
            if (this.field2408 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field2414 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field2414 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field2414 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field2414 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field2414 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field2414 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field2414 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field2414 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field2414 = 9;
                }
            } else if (this.field2408 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field2414 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field2414 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field2414 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field2414 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field2437 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field2437 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field2437 = 4;
            } else {
                this.field2437 = 3;
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
            this.field2417 = var10;
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
            this.field2418 = var14;
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
            this.field2419 = var18;
            this.field2431 = false;
            this.field2421 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field2417 > 3) {
                this.field2423 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field2423 = 0;
            }
            this.field2424 = 0;
        }
        if (this.field2426 == null) {
            this.field2426 = "";
        }
        if (this.field2427 == null) {
            this.field2427 = "";
        }
        if (this.field2443 == null) {
            this.field2443 = "";
        }
        if (this.field2429 == null) {
            this.field2429 = "";
        }
        if (this.field2434 == null) {
            this.field2434 = "";
        }
        if (this.field2435 == null) {
            this.field2435 = "";
        }
        this.method2666();
    }

    @ObfuscatedName("ex.n(I)V")
    public void method2666() {
        if (this.field2426.length() > 40) {
            this.field2426 = this.field2426.substring(0, 40);
        }
        if (this.field2427.length() > 40) {
            this.field2427 = this.field2427.substring(0, 40);
        }
        if (this.field2443.length() > 10) {
            this.field2443 = this.field2443.substring(0, 10);
        }
        if (this.field2429.length() > 10) {
            this.field2429 = this.field2429.substring(0, 10);
        }
    }

    @ObfuscatedName("ex.x(Ldw;I)V")
    public void method2663(class107 arg0) {
        arg0.method2124(6);
        arg0.method2124(this.field2408);
        arg0.method2124(this.field2409 ? 1 : 0);
        arg0.method2124(this.field2414);
        arg0.method2124(this.field2437);
        arg0.method2124(this.field2417);
        arg0.method2124(this.field2418);
        arg0.method2124(this.field2419);
        arg0.method2124(this.field2431 ? 1 : 0);
        arg0.method2125(this.field2421);
        arg0.method2124(this.field2423);
        arg0.method2126(this.field2424);
        arg0.method2125(this.field2439);
        arg0.method2130(this.field2426);
        arg0.method2130(this.field2427);
        arg0.method2130(this.field2443);
        arg0.method2130(this.field2429);
        arg0.method2124(this.field2416);
        arg0.method2125(this.field2411);
        arg0.method2130(this.field2434);
        arg0.method2130(this.field2435);
        arg0.method2124(this.field2441);
        arg0.method2124(this.field2433);
        for (int var2 = 0; var2 < this.field2404.length; var2++) {
            arg0.method2127(this.field2404[var2]);
        }
        arg0.method2127(this.field2432);
    }

    @ObfuscatedName("ex.k(I)I")
    public int method2664() {
        byte var1 = 38;
        String var3 = this.field2426;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field2427;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field2443;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field2429;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field2434;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field2435;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
