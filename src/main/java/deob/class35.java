package deob;

@ObfuscatedName("ec")
public class class35 extends class4 {

    @ObfuscatedName("ec.a")
    public int field190;

    @ObfuscatedName("ec.n")
    public boolean field187;

    @ObfuscatedName("ec.r")
    public int field186;

    @ObfuscatedName("ec.y")
    public int field189;

    @ObfuscatedName("ec.az")
    public String field192;

    @ObfuscatedName("ec.ay")
    public int field209;

    @ObfuscatedName("ec.at")
    public int field202;

    @ObfuscatedName("ec.as")
    public String field199;

    @ObfuscatedName("ec.ar")
    public String field183;

    @ObfuscatedName("ec.ax")
    public boolean field194;

    @ObfuscatedName("ec.av")
    public String field208;

    @ObfuscatedName("ec.au")
    public int field193;

    @ObfuscatedName("ec.al")
    public int field206;

    @ObfuscatedName("ec.ai")
    public int field197;

    @ObfuscatedName("ec.aj")
    public String field185;

    @ObfuscatedName("ec.ap")
    public int field203;

    @ObfuscatedName("ec.am")
    public int field201;

    @ObfuscatedName("ec.an")
    public int field205;

    @ObfuscatedName("ec.ac")
    public int field188;

    @ObfuscatedName("ec.ad")
    public int field196;

    @ObfuscatedName("ec.aa")
    public int field191;

    @ObfuscatedName("ec.ab")
    public String field200;

    @ObfuscatedName("ec.ag")
    public int field195;

    @ObfuscatedName("ec.ae")
    public int[] field184 = new int[3];

    @ObfuscatedName("ec.j(I)V")
    public void method604() {
        if (this.field199.length() > 40) {
            this.field199 = this.field199.substring(0, 40);
        }
        if (this.field200.length() > 40) {
            this.field200 = this.field200.substring(0, 40);
        }
        if (this.field185.length() > 10) {
            this.field185 = this.field185.substring(0, 10);
        }
        if (this.field183.length() > 10) {
            this.field183 = this.field183.substring(0, 10);
        }
    }

    @ObfuscatedName("ec.p(Ldy;B)V")
    public void method605(class31 arg0) {
        arg0.method357(6);
        arg0.method357(this.field186);
        arg0.method357(this.field187 ? 1 : 0);
        arg0.method357(this.field189);
        arg0.method357(this.field190);
        arg0.method357(this.field191);
        arg0.method357(this.field202);
        arg0.method357(this.field193);
        arg0.method357(this.field194 ? 1 : 0);
        arg0.method358(this.field195);
        arg0.method357(this.field196);
        arg0.method359(this.field197);
        arg0.method358(this.field209);
        arg0.method395(this.field199);
        arg0.method395(this.field200);
        arg0.method395(this.field185);
        arg0.method395(this.field183);
        arg0.method357(this.field188);
        arg0.method358(this.field203);
        arg0.method395(this.field192);
        arg0.method395(this.field208);
        arg0.method357(this.field205);
        arg0.method357(this.field206);
        for (int var2 = 0; var2 < this.field184.length; var2++) {
            arg0.method360(this.field184[var2]);
        }
        arg0.method360(this.field201);
    }

    public class35(boolean arg0) {
        if (arg0) {
            if (Statics.field483.startsWith("win")) {
                this.field186 = 1;
            } else if (Statics.field483.startsWith("mac")) {
                this.field186 = 2;
            } else if (Statics.field483.startsWith("linux")) {
                this.field186 = 3;
            } else {
                this.field186 = 4;
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
                this.field187 = true;
            } else {
                this.field187 = false;
            }
            if (this.field186 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field189 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field189 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field189 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field189 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field189 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field189 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field189 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field189 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field189 = 9;
                }
            } else if (this.field186 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field189 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field189 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field189 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field189 = 23;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field190 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field190 = 2;
            } else if (var6.toLowerCase().indexOf("apple") == -1) {
                this.field190 = 4;
            } else {
                this.field190 = 3;
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
            this.field191 = var10;
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
            this.field202 = var14;
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
            this.field193 = var18;
            this.field194 = false;
            this.field195 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field191 > 3) {
                this.field196 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field196 = 0;
            }
            this.field197 = 0;
        }
        if (this.field199 == null) {
            this.field199 = "";
        }
        if (this.field200 == null) {
            this.field200 = "";
        }
        if (this.field185 == null) {
            this.field185 = "";
        }
        if (this.field183 == null) {
            this.field183 = "";
        }
        if (this.field192 == null) {
            this.field192 = "";
        }
        if (this.field208 == null) {
            this.field208 = "";
        }
        this.method604();
    }

    @ObfuscatedName("ec.o(I)I")
    public int method615() {
        byte var1 = 38;
        String var3 = this.field199;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field200;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field185;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field183;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field192;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field208;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
