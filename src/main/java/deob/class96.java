package deob;

@ObfuscatedName("eo")
public class class96 extends class17 {

    @ObfuscatedName("eo.d")
    public int field1362;

    @ObfuscatedName("eo.l")
    public boolean field1336;

    @ObfuscatedName("eo.v")
    public int field1335;

    @ObfuscatedName("eo.y")
    public int field1349;

    @ObfuscatedName("eo.ay")
    public int[] field1354 = new int[3];

    @ObfuscatedName("eo.at")
    public String field1361;

    @ObfuscatedName("eo.as")
    public String field1350;

    @ObfuscatedName("eo.ar")
    public int field1346;

    @ObfuscatedName("eo.aq")
    public boolean field1338;

    @ObfuscatedName("eo.ax")
    public int field1342;

    @ObfuscatedName("eo.aw")
    public int field1343;

    @ObfuscatedName("eo.av")
    public String field1351;

    @ObfuscatedName("eo.au")
    public String field1352;

    @ObfuscatedName("eo.ak")
    public int field1345;

    @ObfuscatedName("eo.al")
    public int field1356;

    @ObfuscatedName("eo.ao")
    public int field1355;

    @ObfuscatedName("eo.ap")
    public String field1353;

    @ObfuscatedName("eo.am")
    public int field1344;

    @ObfuscatedName("eo.an")
    public int field1357;

    @ObfuscatedName("eo.ac")
    public int field1341;

    @ObfuscatedName("eo.ad")
    public int field1347;

    @ObfuscatedName("eo.aa")
    public String field1358;

    @ObfuscatedName("eo.ag")
    public int field1340;

    @ObfuscatedName("eo.ah")
    public int field1360;

    public class96(boolean arg0) {
        if (arg0) {
            if (Statics.field2659.startsWith("win")) {
                this.field1362 = 1;
            } else if (Statics.field2659.startsWith("mac")) {
                this.field1362 = 2;
            } else if (Statics.field2659.startsWith("linux")) {
                this.field1362 = 3;
            } else {
                this.field1362 = 4;
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
                this.field1336 = true;
            } else {
                this.field1336 = false;
            }
            if (this.field1362 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field1349 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field1349 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field1349 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field1349 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field1349 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field1349 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field1349 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field1349 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field1349 = 9;
                }
            } else if (this.field1362 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field1349 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field1349 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field1349 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field1349 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field1335 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field1335 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field1335 = 4;
            } else {
                this.field1335 = 3;
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
            this.field1341 = var10;
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
            this.field1342 = var14;
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
            this.field1343 = var18;
            this.field1338 = false;
            this.field1345 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field1341 > 3) {
                this.field1346 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field1346 = 0;
            }
            this.field1360 = 0;
        }
        if (this.field1350 == null) {
            this.field1350 = "";
        }
        if (this.field1351 == null) {
            this.field1351 = "";
        }
        if (this.field1352 == null) {
            this.field1352 = "";
        }
        if (this.field1353 == null) {
            this.field1353 = "";
        }
        if (this.field1358 == null) {
            this.field1358 = "";
        }
        if (this.field1361 == null) {
            this.field1361 = "";
        }
        this.method1382();
    }

    @ObfuscatedName("eo.b(I)V")
    public void method1382() {
        if (this.field1350.length() > 40) {
            this.field1350 = this.field1350.substring(0, 40);
        }
        if (this.field1351.length() > 40) {
            this.field1351 = this.field1351.substring(0, 40);
        }
        if (this.field1352.length() > 10) {
            this.field1352 = this.field1352.substring(0, 10);
        }
        if (this.field1353.length() > 10) {
            this.field1353 = this.field1353.substring(0, 10);
        }
    }

    @ObfuscatedName("eo.k(B)I")
    public int method1384() {
        byte var1 = 38;
        int var2 = var1 + class50.method3388(this.field1350);
        int var3 = var2 + class50.method3388(this.field1351);
        int var4 = var3 + class50.method3388(this.field1352);
        int var5 = var4 + class50.method3388(this.field1353);
        int var6 = var5 + class50.method3388(this.field1358);
        return var6 + class50.method3388(this.field1361);
    }

    @ObfuscatedName("eo.h(Ldp;B)V")
    public void method1385(class50 arg0) {
        arg0.method666(6);
        arg0.method666(this.field1362);
        arg0.method666(this.field1336 ? 1 : 0);
        arg0.method666(this.field1349);
        arg0.method666(this.field1335);
        arg0.method666(this.field1341);
        arg0.method666(this.field1342);
        arg0.method666(this.field1343);
        arg0.method666(this.field1338 ? 1 : 0);
        arg0.method667(this.field1345);
        arg0.method666(this.field1346);
        arg0.method668(this.field1360);
        arg0.method667(this.field1347);
        arg0.method672(this.field1350);
        arg0.method672(this.field1351);
        arg0.method672(this.field1352);
        arg0.method672(this.field1353);
        arg0.method666(this.field1355);
        arg0.method667(this.field1344);
        arg0.method672(this.field1358);
        arg0.method672(this.field1361);
        arg0.method666(this.field1356);
        arg0.method666(this.field1357);
        for (int var2 = 0; var2 < this.field1354.length; var2++) {
            arg0.method669(this.field1354[var2]);
        }
        arg0.method669(this.field1340);
    }
}
