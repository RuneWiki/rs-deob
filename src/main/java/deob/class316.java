package deob;

@ObfuscatedName("lm")
public class class316 extends class204 {

    @ObfuscatedName("lm.w")
    public int field3984;

    @ObfuscatedName("lm.t")
    public boolean field3983;

    @ObfuscatedName("lm.ad")
    public int field3998;

    @ObfuscatedName("lm.as")
    public int field3990;

    @ObfuscatedName("lm.ax")
    public int field3996;

    @ObfuscatedName("lm.ak")
    public int field4007;

    @ObfuscatedName("lm.aw")
    public int field3993;

    @ObfuscatedName("lm.ai")
    public boolean field4002;

    @ObfuscatedName("lm.ab")
    public int field3992;

    @ObfuscatedName("lm.ah")
    public int field3995;

    @ObfuscatedName("lm.az")
    public int field3997;

    @ObfuscatedName("lm.ae")
    public int field3981;

    @ObfuscatedName("lm.ao")
    public String field3999;

    @ObfuscatedName("lm.av")
    public String field4000;

    @ObfuscatedName("lm.aj")
    public String field4006;

    @ObfuscatedName("lm.ap")
    public String field3991;

    @ObfuscatedName("lm.au")
    public int field4003;

    @ObfuscatedName("lm.ay")
    public int field4004;

    @ObfuscatedName("lm.aa")
    public int field4005;

    @ObfuscatedName("lm.at")
    public int field3994;

    @ObfuscatedName("lm.ac")
    public String field3989;

    @ObfuscatedName("lm.bj")
    public String field4001;

    @ObfuscatedName("lm.bo")
    public int[] field4009 = new int[3];

    @ObfuscatedName("lm.br")
    public int field4010;

    public class316(boolean arg0) {
        if (arg0) {
            if (Statics.field476.startsWith("win")) {
                this.field3984 = 1;
            } else if (Statics.field476.startsWith("mac")) {
                this.field3984 = 2;
            } else if (Statics.field476.startsWith("linux")) {
                this.field3984 = 3;
            } else {
                this.field3984 = 4;
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
                this.field3983 = true;
            } else {
                this.field3983 = false;
            }
            if (this.field3984 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3998 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3998 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3998 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3998 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3998 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3998 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3998 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3998 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3998 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3998 = 10;
                } else if (var4.indexOf("10.0") != -1) {
                    this.field3998 = 11;
                }
            } else if (this.field3984 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3998 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3998 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3998 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3998 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3998 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3998 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3998 = 26;
                } else if (var4.indexOf("10.11") != -1) {
                    this.field3998 = 27;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3990 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3990 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3990 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3990 = 4;
            } else {
                this.field3990 = 5;
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
            this.field3996 = var10;
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
            this.field4007 = var14;
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
            this.field3993 = var18;
            this.field4002 = false;
            this.field3992 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3996 > 3) {
                this.field3995 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3995 = 0;
            }
            this.field3997 = 0;
        }
        if (this.field3999 == null) {
            this.field3999 = "";
        }
        if (this.field4000 == null) {
            this.field4000 = "";
        }
        if (this.field4006 == null) {
            this.field4006 = "";
        }
        if (this.field3991 == null) {
            this.field3991 = "";
        }
        if (this.field3989 == null) {
            this.field3989 = "";
        }
        if (this.field4001 == null) {
            this.field4001 = "";
        }
        this.method5628();
    }

    @ObfuscatedName("lm.s(I)V")
    public void method5628() {
        if (this.field3999.length() > 40) {
            this.field3999 = this.field3999.substring(0, 40);
        }
        if (this.field4000.length() > 40) {
            this.field4000 = this.field4000.substring(0, 40);
        }
        if (this.field4006.length() > 10) {
            this.field4006 = this.field4006.substring(0, 10);
        }
        if (this.field3991.length() > 10) {
            this.field3991 = this.field3991.substring(0, 10);
        }
    }

    @ObfuscatedName("lm.g(Lgy;I)V")
    public void method5629(class185 arg0) {
        arg0.method3223(6);
        arg0.method3223(this.field3984);
        arg0.method3223(this.field3983 ? 1 : 0);
        arg0.method3223(this.field3998);
        arg0.method3223(this.field3990);
        arg0.method3223(this.field3996);
        arg0.method3223(this.field4007);
        arg0.method3223(this.field3993);
        arg0.method3223(this.field4002 ? 1 : 0);
        arg0.method3403(this.field3992);
        arg0.method3223(this.field3995);
        arg0.method3225(this.field3997);
        arg0.method3403(this.field3981);
        arg0.method3231(this.field3999);
        arg0.method3231(this.field4000);
        arg0.method3231(this.field4006);
        arg0.method3231(this.field3991);
        arg0.method3223(this.field4004);
        arg0.method3403(this.field4003);
        arg0.method3231(this.field3989);
        arg0.method3231(this.field4001);
        arg0.method3223(this.field4005);
        arg0.method3223(this.field3994);
        for (int var2 = 0; var2 < this.field4009.length; var2++) {
            arg0.method3242(this.field4009[var2]);
        }
        arg0.method3242(this.field4010);
    }

    @ObfuscatedName("lm.m(B)I")
    public int method5630() {
        byte var1 = 38;
        String var3 = this.field3999;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field4000;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field4006;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field3991;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field3989;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field4001;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
