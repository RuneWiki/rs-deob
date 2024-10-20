package deob;

@ObfuscatedName("ed")
public class class36 extends class13 {

    @ObfuscatedName("ed.t")
    public int field368;

    @ObfuscatedName("ed.q")
    public int field364;

    @ObfuscatedName("ed.z")
    public int field365;

    @ObfuscatedName("ed.x")
    public boolean field381;

    @ObfuscatedName("ed.az")
    public String field388;

    @ObfuscatedName("ed.as")
    public int field371;

    @ObfuscatedName("ed.ax")
    public int field384;

    @ObfuscatedName("ed.aw")
    public int field383;

    @ObfuscatedName("ed.av")
    public int field373;

    @ObfuscatedName("ed.au")
    public String field363;

    @ObfuscatedName("ed.al")
    public String field382;

    @ObfuscatedName("ed.ai")
    public int field377;

    @ObfuscatedName("ed.aj")
    public String field380;

    @ObfuscatedName("ed.ao")
    public boolean field374;

    @ObfuscatedName("ed.ap")
    public int field386;

    @ObfuscatedName("ed.am")
    public String field379;

    @ObfuscatedName("ed.an")
    public int field393;

    @ObfuscatedName("ed.ac")
    public int field372;

    @ObfuscatedName("ed.ad")
    public String field366;

    @ObfuscatedName("ed.ab")
    public int field361;

    @ObfuscatedName("ed.ag")
    public int[] field376 = new int[3];

    @ObfuscatedName("ed.ah")
    public int field375;

    @ObfuscatedName("ed.ae")
    public int field394;

    @ObfuscatedName("ed.af")
    public int field385;

    @ObfuscatedName("ed.c(Ldv;I)V")
    public void method693(class28 arg0) {
        arg0.method443(6);
        arg0.method443(this.field365);
        arg0.method443(this.field381 ? 1 : 0);
        arg0.method443(this.field368);
        arg0.method443(this.field364);
        arg0.method443(this.field371);
        arg0.method443(this.field372);
        arg0.method443(this.field384);
        arg0.method443(this.field374 ? 1 : 0);
        arg0.method300(this.field375);
        arg0.method443(this.field393);
        arg0.method301(this.field377);
        arg0.method300(this.field394);
        arg0.method304(this.field379);
        arg0.method304(this.field380);
        arg0.method304(this.field363);
        arg0.method304(this.field382);
        arg0.method443(this.field373);
        arg0.method300(this.field383);
        arg0.method304(this.field366);
        arg0.method304(this.field388);
        arg0.method443(this.field385);
        arg0.method443(this.field386);
        for (int var2 = 0; var2 < this.field376.length; var2++) {
            arg0.method302(this.field376[var2]);
        }
        arg0.method302(this.field361);
    }

    @ObfuscatedName("ed.b(B)I")
    public int method694() {
        byte var1 = 38;
        int var2 = var1 + class28.method3056(this.field379);
        int var3 = var2 + class28.method3056(this.field380);
        int var4 = var3 + class28.method3056(this.field363);
        int var5 = var4 + class28.method3056(this.field382);
        int var6 = var5 + class28.method3056(this.field366);
        return var6 + class28.method3056(this.field388);
    }

    public class36(boolean arg0) {
        if (arg0) {
            if (Statics.field2669.startsWith("win")) {
                this.field365 = 1;
            } else if (Statics.field2669.startsWith("mac")) {
                this.field365 = 2;
            } else if (Statics.field2669.startsWith("linux")) {
                this.field365 = 3;
            } else {
                this.field365 = 4;
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
                this.field381 = true;
            } else {
                this.field381 = false;
            }
            if (this.field365 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field368 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field368 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field368 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field368 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field368 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field368 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field368 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field368 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field368 = 9;
                }
            } else if (this.field365 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field368 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field368 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field368 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field368 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field364 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field364 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field364 = 4;
            } else {
                this.field364 = 3;
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
            this.field371 = var10;
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
            this.field372 = var14;
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
            this.field384 = var18;
            this.field374 = false;
            this.field375 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field371 > 3) {
                this.field393 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field393 = 0;
            }
            this.field377 = 0;
        }
        if (this.field379 == null) {
            this.field379 = "";
        }
        if (this.field380 == null) {
            this.field380 = "";
        }
        if (this.field363 == null) {
            this.field363 = "";
        }
        if (this.field382 == null) {
            this.field382 = "";
        }
        if (this.field366 == null) {
            this.field366 = "";
        }
        if (this.field388 == null) {
            this.field388 = "";
        }
        this.method700();
    }

    @ObfuscatedName("ed.v(I)V")
    public void method700() {
        if (this.field379.length() > 40) {
            this.field379 = this.field379.substring(0, 40);
        }
        if (this.field380.length() > 40) {
            this.field380 = this.field380.substring(0, 40);
        }
        if (this.field363.length() > 10) {
            this.field363 = this.field363.substring(0, 10);
        }
        if (this.field382.length() > 10) {
            this.field382 = this.field382.substring(0, 10);
        }
    }
}
