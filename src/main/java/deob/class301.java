package deob;

@ObfuscatedName("ka")
public class class301 extends class200 {

    @ObfuscatedName("ka.m")
    public int field3927;

    @ObfuscatedName("ka.b")
    public boolean field3928;

    @ObfuscatedName("ka.ah")
    public int field3935;

    @ObfuscatedName("ka.al")
    public int field3936;

    @ObfuscatedName("ka.ae")
    public int field3949;

    @ObfuscatedName("ka.aj")
    public int field3938;

    @ObfuscatedName("ka.as")
    public int field3939;

    @ObfuscatedName("ka.am")
    public boolean field3929;

    @ObfuscatedName("ka.ag")
    public int field3941;

    @ObfuscatedName("ka.ap")
    public int field3942;

    @ObfuscatedName("ka.an")
    public int field3943;

    @ObfuscatedName("ka.ai")
    public int field3926;

    @ObfuscatedName("ka.ay")
    public String field3945;

    @ObfuscatedName("ka.ar")
    public String field3946;

    @ObfuscatedName("ka.ac")
    public String field3934;

    @ObfuscatedName("ka.af")
    public String field3948;

    @ObfuscatedName("ka.ao")
    public int field3944;

    @ObfuscatedName("ka.av")
    public int field3950;

    @ObfuscatedName("ka.ab")
    public int field3951;

    @ObfuscatedName("ka.az")
    public int field3937;

    @ObfuscatedName("ka.at")
    public String field3953;

    @ObfuscatedName("ka.bj")
    public String field3954;

    @ObfuscatedName("ka.bq")
    public int[] field3955 = new int[3];

    @ObfuscatedName("ka.bo")
    public int field3956;

    public class301(boolean arg0) {
        if (arg0) {
            if (Statics.field558.startsWith("win")) {
                this.field3927 = 1;
            } else if (Statics.field558.startsWith("mac")) {
                this.field3927 = 2;
            } else if (Statics.field558.startsWith("linux")) {
                this.field3927 = 3;
            } else {
                this.field3927 = 4;
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
                this.field3928 = true;
            } else {
                this.field3928 = false;
            }
            if (this.field3927 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3935 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3935 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3935 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3935 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3935 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3935 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3935 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3935 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3935 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3935 = 10;
                } else if (var4.indexOf("10.0") != -1) {
                    this.field3935 = 11;
                }
            } else if (this.field3927 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3935 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3935 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3935 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3935 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3935 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3935 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3935 = 26;
                } else if (var4.indexOf("10.11") != -1) {
                    this.field3935 = 27;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3936 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3936 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3936 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3936 = 4;
            } else {
                this.field3936 = 5;
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
            this.field3949 = var10;
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
            this.field3938 = var14;
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
            this.field3939 = var18;
            this.field3929 = false;
            this.field3941 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3949 > 3) {
                this.field3942 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3942 = 0;
            }
            this.field3943 = 0;
        }
        if (this.field3945 == null) {
            this.field3945 = "";
        }
        if (this.field3946 == null) {
            this.field3946 = "";
        }
        if (this.field3934 == null) {
            this.field3934 = "";
        }
        if (this.field3948 == null) {
            this.field3948 = "";
        }
        if (this.field3953 == null) {
            this.field3953 = "";
        }
        if (this.field3954 == null) {
            this.field3954 = "";
        }
        this.method5223();
    }

    @ObfuscatedName("ka.d(S)V")
    public void method5223() {
        if (this.field3945.length() > 40) {
            this.field3945 = this.field3945.substring(0, 40);
        }
        if (this.field3946.length() > 40) {
            this.field3946 = this.field3946.substring(0, 40);
        }
        if (this.field3934.length() > 10) {
            this.field3934 = this.field3934.substring(0, 10);
        }
        if (this.field3948.length() > 10) {
            this.field3948 = this.field3948.substring(0, 10);
        }
    }

    @ObfuscatedName("ka.x(Lfr;I)V")
    public void method5224(class181 arg0) {
        arg0.method3020(6);
        arg0.method3020(this.field3927);
        arg0.method3020(this.field3928 ? 1 : 0);
        arg0.method3020(this.field3935);
        arg0.method3020(this.field3936);
        arg0.method3020(this.field3949);
        arg0.method3020(this.field3938);
        arg0.method3020(this.field3939);
        arg0.method3020(this.field3929 ? 1 : 0);
        arg0.method3021(this.field3941);
        arg0.method3020(this.field3942);
        arg0.method3137(this.field3943);
        arg0.method3021(this.field3926);
        arg0.method3066(this.field3945);
        arg0.method3066(this.field3946);
        arg0.method3066(this.field3934);
        arg0.method3066(this.field3948);
        arg0.method3020(this.field3950);
        arg0.method3021(this.field3944);
        arg0.method3066(this.field3953);
        arg0.method3066(this.field3954);
        arg0.method3020(this.field3951);
        arg0.method3020(this.field3937);
        for (int var2 = 0; var2 < this.field3955.length; var2++) {
            arg0.method3149(this.field3955[var2]);
        }
        arg0.method3149(this.field3956);
    }

    @ObfuscatedName("ka.k(B)I")
    public int method5222() {
        byte var1 = 38;
        int var2 = var1 + class181.method2579(this.field3945);
        int var3 = var2 + class181.method2579(this.field3946);
        int var4 = var3 + class181.method2579(this.field3934);
        int var5 = var4 + class181.method2579(this.field3948);
        int var6 = var5 + class181.method2579(this.field3953);
        return var6 + class181.method2579(this.field3954);
    }
}
