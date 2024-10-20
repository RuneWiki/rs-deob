package deob;

@ObfuscatedName("ls")
public class class316 extends class204 {

    @ObfuscatedName("ls.a")
    public int field4007;

    @ObfuscatedName("ls.t")
    public boolean field3978;

    @ObfuscatedName("ls.aa")
    public int field3984;

    @ObfuscatedName("ls.ae")
    public int field3986;

    @ObfuscatedName("ls.ah")
    public int field3993;

    @ObfuscatedName("ls.ai")
    public int field3988;

    @ObfuscatedName("ls.au")
    public int field3973;

    @ObfuscatedName("ls.am")
    public boolean field3989;

    @ObfuscatedName("ls.af")
    public int field3991;

    @ObfuscatedName("ls.ag")
    public int field4003;

    @ObfuscatedName("ls.aw")
    public int field3994;

    @ObfuscatedName("ls.ad")
    public int field3995;

    @ObfuscatedName("ls.ab")
    public String field3996;

    @ObfuscatedName("ls.aq")
    public String field4004;

    @ObfuscatedName("ls.ac")
    public String field3998;

    @ObfuscatedName("ls.ak")
    public String field3999;

    @ObfuscatedName("ls.az")
    public int field4000;

    @ObfuscatedName("ls.as")
    public int field4001;

    @ObfuscatedName("ls.at")
    public int field3997;

    @ObfuscatedName("ls.aj")
    public int field4002;

    @ObfuscatedName("ls.al")
    public String field3987;

    @ObfuscatedName("ls.bw")
    public String field4005;

    @ObfuscatedName("ls.bt")
    public int[] field4006 = new int[3];

    @ObfuscatedName("ls.by")
    public int field3980;

    public class316(boolean arg0) {
        if (arg0) {
            if (Statics.field1884.startsWith("win")) {
                this.field4007 = 1;
            } else if (Statics.field1884.startsWith("mac")) {
                this.field4007 = 2;
            } else if (Statics.field1884.startsWith("linux")) {
                this.field4007 = 3;
            } else {
                this.field4007 = 4;
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
                this.field3978 = true;
            } else {
                this.field3978 = false;
            }
            if (this.field4007 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3984 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3984 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3984 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3984 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3984 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3984 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3984 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3984 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3984 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3984 = 10;
                } else if (var4.indexOf("10.0") != -1) {
                    this.field3984 = 11;
                }
            } else if (this.field4007 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3984 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3984 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3984 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3984 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3984 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3984 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3984 = 26;
                } else if (var4.indexOf("10.11") != -1) {
                    this.field3984 = 27;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3986 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3986 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3986 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3986 = 4;
            } else {
                this.field3986 = 5;
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
            this.field3993 = var10;
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
            this.field3988 = var14;
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
            this.field3973 = var18;
            this.field3989 = false;
            this.field3991 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3993 > 3) {
                this.field4003 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field4003 = 0;
            }
            this.field3994 = 0;
        }
        if (this.field3996 == null) {
            this.field3996 = "";
        }
        if (this.field4004 == null) {
            this.field4004 = "";
        }
        if (this.field3998 == null) {
            this.field3998 = "";
        }
        if (this.field3999 == null) {
            this.field3999 = "";
        }
        if (this.field3987 == null) {
            this.field3987 = "";
        }
        if (this.field4005 == null) {
            this.field4005 = "";
        }
        this.method5440();
    }

    @ObfuscatedName("ls.p(I)V")
    public void method5440() {
        if (this.field3996.length() > 40) {
            this.field3996 = this.field3996.substring(0, 40);
        }
        if (this.field4004.length() > 40) {
            this.field4004 = this.field4004.substring(0, 40);
        }
        if (this.field3998.length() > 10) {
            this.field3998 = this.field3998.substring(0, 10);
        }
        if (this.field3999.length() > 10) {
            this.field3999 = this.field3999.substring(0, 10);
        }
    }

    @ObfuscatedName("ls.i(Lgj;I)V")
    public void method5441(class185 arg0) {
        arg0.method3107(6);
        arg0.method3107(this.field4007);
        arg0.method3107(this.field3978 ? 1 : 0);
        arg0.method3107(this.field3984);
        arg0.method3107(this.field3986);
        arg0.method3107(this.field3993);
        arg0.method3107(this.field3988);
        arg0.method3107(this.field3973);
        arg0.method3107(this.field3989 ? 1 : 0);
        arg0.method3250(this.field3991);
        arg0.method3107(this.field4003);
        arg0.method3109(this.field3994);
        arg0.method3250(this.field3995);
        arg0.method3230(this.field3996);
        arg0.method3230(this.field4004);
        arg0.method3230(this.field3998);
        arg0.method3230(this.field3999);
        arg0.method3107(this.field4001);
        arg0.method3250(this.field4000);
        arg0.method3230(this.field3987);
        arg0.method3230(this.field4005);
        arg0.method3107(this.field3997);
        arg0.method3107(this.field4002);
        for (int var2 = 0; var2 < this.field4006.length; var2++) {
            arg0.method3110(this.field4006[var2]);
        }
        arg0.method3110(this.field3980);
    }

    @ObfuscatedName("ls.w(B)I")
    public int method5442() {
        byte var1 = 38;
        String var3 = this.field3996;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field4004;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field3998;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        int var14 = var13 + class185.method2818(this.field3999);
        String var16 = this.field3987;
        int var17 = var16.length() + 2;
        int var18 = var14 + var17;
        return var18 + class185.method2818(this.field4005);
    }
}
