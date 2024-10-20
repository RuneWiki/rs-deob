package deob;

@ObfuscatedName("ht")
public class class231 extends class128 {

    @ObfuscatedName("ht.o")
    public int field3273;

    @ObfuscatedName("ht.l")
    public boolean field3284;

    @ObfuscatedName("ht.c")
    public int field3298;

    @ObfuscatedName("ht.ag")
    public int field3279;

    @ObfuscatedName("ht.ab")
    public int field3280;

    @ObfuscatedName("ht.aw")
    public int field3299;

    @ObfuscatedName("ht.ax")
    public int field3277;

    @ObfuscatedName("ht.ar")
    public boolean field3283;

    @ObfuscatedName("ht.ak")
    public int field3296;

    @ObfuscatedName("ht.ap")
    public int field3285;

    @ObfuscatedName("ht.aj")
    public int field3288;

    @ObfuscatedName("ht.at")
    public int field3287;

    @ObfuscatedName("ht.ad")
    public String field3274;

    @ObfuscatedName("ht.av")
    public String field3289;

    @ObfuscatedName("ht.ao")
    public String field3290;

    @ObfuscatedName("ht.ae")
    public String field3291;

    @ObfuscatedName("ht.aa")
    public int field3292;

    @ObfuscatedName("ht.as")
    public int field3281;

    @ObfuscatedName("ht.al")
    public int field3282;

    @ObfuscatedName("ht.az")
    public int field3295;

    @ObfuscatedName("ht.ay")
    public String field3269;

    @ObfuscatedName("ht.ac")
    public String field3297;

    @ObfuscatedName("ht.af")
    public int[] field3276 = new int[3];

    @ObfuscatedName("ht.bc")
    public int field3294;

    public class231(boolean arg0) {
        if (arg0) {
            if (Statics.field973.startsWith("win")) {
                this.field3273 = 1;
            } else if (Statics.field973.startsWith("mac")) {
                this.field3273 = 2;
            } else if (Statics.field973.startsWith("linux")) {
                this.field3273 = 3;
            } else {
                this.field3273 = 4;
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
                this.field3284 = true;
            } else {
                this.field3284 = false;
            }
            if (this.field3273 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3298 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3298 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3298 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3298 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3298 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3298 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3298 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3298 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3298 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3298 = 10;
                }
            } else if (this.field3273 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3298 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3298 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3298 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3298 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3298 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3298 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3298 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3279 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3279 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3279 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3279 = 4;
            } else {
                this.field3279 = 5;
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
            this.field3280 = var10;
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
            this.field3299 = var14;
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
            this.field3277 = var18;
            this.field3283 = false;
            this.field3296 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3280 > 3) {
                this.field3285 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3285 = 0;
            }
            this.field3288 = 0;
        }
        if (this.field3274 == null) {
            this.field3274 = "";
        }
        if (this.field3289 == null) {
            this.field3289 = "";
        }
        if (this.field3290 == null) {
            this.field3290 = "";
        }
        if (this.field3291 == null) {
            this.field3291 = "";
        }
        if (this.field3269 == null) {
            this.field3269 = "";
        }
        if (this.field3297 == null) {
            this.field3297 = "";
        }
        this.method4017();
    }

    @ObfuscatedName("ht.f(B)V")
    public void method4017() {
        if (this.field3274.length() > 40) {
            this.field3274 = this.field3274.substring(0, 40);
        }
        if (this.field3289.length() > 40) {
            this.field3289 = this.field3289.substring(0, 40);
        }
        if (this.field3290.length() > 10) {
            this.field3290 = this.field3290.substring(0, 10);
        }
        if (this.field3291.length() > 10) {
            this.field3291 = this.field3291.substring(0, 10);
        }
    }

    @ObfuscatedName("ht.i(Leo;I)V")
    public void method4018(class154 arg0) {
        arg0.method2651(6);
        arg0.method2651(this.field3273);
        arg0.method2651(this.field3284 ? 1 : 0);
        arg0.method2651(this.field3298);
        arg0.method2651(this.field3279);
        arg0.method2651(this.field3280);
        arg0.method2651(this.field3299);
        arg0.method2651(this.field3277);
        arg0.method2651(this.field3283 ? 1 : 0);
        arg0.method2793(this.field3296);
        arg0.method2651(this.field3285);
        arg0.method2752(this.field3288);
        arg0.method2793(this.field3287);
        arg0.method2732(this.field3274);
        arg0.method2732(this.field3289);
        arg0.method2732(this.field3290);
        arg0.method2732(this.field3291);
        arg0.method2651(this.field3281);
        arg0.method2793(this.field3292);
        arg0.method2732(this.field3269);
        arg0.method2732(this.field3297);
        arg0.method2651(this.field3282);
        arg0.method2651(this.field3295);
        for (int var2 = 0; var2 < this.field3276.length; var2++) {
            arg0.method2654(this.field3276[var2]);
        }
        arg0.method2654(this.field3294);
    }

    @ObfuscatedName("ht.u(S)I")
    public int method4019() {
        byte var1 = 38;
        String var3 = this.field3274;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field3289;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field3290;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field3291;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field3269;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field3297;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
