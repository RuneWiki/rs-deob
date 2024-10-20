package deob;

@ObfuscatedName("li")
public class class329 extends class213 {

    @ObfuscatedName("li.h")
    public int field3993;

    @ObfuscatedName("li.l")
    public boolean field3991;

    @ObfuscatedName("li.av")
    public int field4002;

    @ObfuscatedName("li.ai")
    public int field3997;

    @ObfuscatedName("li.aq")
    public int field4017;

    @ObfuscatedName("li.ak")
    public int field4006;

    @ObfuscatedName("li.al")
    public int field4018;

    @ObfuscatedName("li.as")
    public boolean field4013;

    @ObfuscatedName("li.az")
    public int field4009;

    @ObfuscatedName("li.ad")
    public int field4010;

    @ObfuscatedName("li.ag")
    public int field4005;

    @ObfuscatedName("li.au")
    public int field4007;

    @ObfuscatedName("li.ac")
    public String field3990;

    @ObfuscatedName("li.ay")
    public String field4014;

    @ObfuscatedName("li.at")
    public String field4012;

    @ObfuscatedName("li.aa")
    public String field4016;

    @ObfuscatedName("li.aw")
    public int field4011;

    @ObfuscatedName("li.ab")
    public int field3994;

    @ObfuscatedName("li.ap")
    public int field4019;

    @ObfuscatedName("li.ae")
    public int field4020;

    @ObfuscatedName("li.an")
    public String field4021;

    @ObfuscatedName("li.bh")
    public String field4022;

    @ObfuscatedName("li.bx")
    public int[] field4023 = new int[3];

    @ObfuscatedName("li.bb")
    public int field4024;

    public class329(boolean arg0) {
        if (arg0) {
            if (Statics.field2487.startsWith("win")) {
                this.field3993 = 1;
            } else if (Statics.field2487.startsWith("mac")) {
                this.field3993 = 2;
            } else if (Statics.field2487.startsWith("linux")) {
                this.field3993 = 3;
            } else {
                this.field3993 = 4;
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
                this.field3991 = true;
            } else {
                this.field3991 = false;
            }
            if (this.field3993 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field4002 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field4002 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field4002 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field4002 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field4002 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field4002 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field4002 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field4002 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field4002 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field4002 = 10;
                } else if (var4.indexOf("10.0") != -1) {
                    this.field4002 = 11;
                }
            } else if (this.field3993 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field4002 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field4002 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field4002 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field4002 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field4002 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field4002 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field4002 = 26;
                } else if (var4.indexOf("10.11") != -1) {
                    this.field4002 = 27;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3997 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3997 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3997 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3997 = 4;
            } else {
                this.field3997 = 5;
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
            this.field4017 = var10;
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
            this.field4006 = var14;
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
            this.field4018 = var18;
            this.field4013 = false;
            this.field4009 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field4017 > 3) {
                this.field4010 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field4010 = 0;
            }
            this.field4005 = 0;
        }
        if (this.field3990 == null) {
            this.field3990 = "";
        }
        if (this.field4014 == null) {
            this.field4014 = "";
        }
        if (this.field4012 == null) {
            this.field4012 = "";
        }
        if (this.field4016 == null) {
            this.field4016 = "";
        }
        if (this.field4021 == null) {
            this.field4021 = "";
        }
        if (this.field4022 == null) {
            this.field4022 = "";
        }
        this.method5694();
    }

    @ObfuscatedName("li.b(I)V")
    public void method5694() {
        if (this.field3990.length() > 40) {
            this.field3990 = this.field3990.substring(0, 40);
        }
        if (this.field4014.length() > 40) {
            this.field4014 = this.field4014.substring(0, 40);
        }
        if (this.field4012.length() > 10) {
            this.field4012 = this.field4012.substring(0, 10);
        }
        if (this.field4016.length() > 10) {
            this.field4016 = this.field4016.substring(0, 10);
        }
    }

    @ObfuscatedName("li.q(Lgn;I)V")
    public void method5687(class194 arg0) {
        arg0.method3232(6);
        arg0.method3232(this.field3993);
        arg0.method3232(this.field3991 ? 1 : 0);
        arg0.method3232(this.field4002);
        arg0.method3232(this.field3997);
        arg0.method3232(this.field4017);
        arg0.method3232(this.field4006);
        arg0.method3232(this.field4018);
        arg0.method3232(this.field4013 ? 1 : 0);
        arg0.method3233(this.field4009);
        arg0.method3232(this.field4010);
        arg0.method3234(this.field4005);
        arg0.method3233(this.field4007);
        arg0.method3452(this.field3990);
        arg0.method3452(this.field4014);
        arg0.method3452(this.field4012);
        arg0.method3452(this.field4016);
        arg0.method3232(this.field3994);
        arg0.method3233(this.field4011);
        arg0.method3452(this.field4021);
        arg0.method3452(this.field4022);
        arg0.method3232(this.field4019);
        arg0.method3232(this.field4020);
        for (int var2 = 0; var2 < this.field4023.length; var2++) {
            arg0.method3235(this.field4023[var2]);
        }
        arg0.method3235(this.field4024);
    }

    @ObfuscatedName("li.o(I)I")
    public int method5688() {
        byte var1 = 38;
        int var2 = var1 + class194.method2930(this.field3990);
        int var3 = var2 + class194.method2930(this.field4014);
        int var4 = var3 + class194.method2930(this.field4012);
        int var5 = var4 + class194.method2930(this.field4016);
        int var6 = var5 + class194.method2930(this.field4021);
        return var6 + class194.method2930(this.field4022);
    }
}
