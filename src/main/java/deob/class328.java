package deob;

@ObfuscatedName("lu")
public class class328 extends class207 {

    @ObfuscatedName("lu.i")
    public int field3932;

    @ObfuscatedName("lu.t")
    public boolean field3927;

    @ObfuscatedName("lu.ac")
    public int field3933;

    @ObfuscatedName("lu.af")
    public int field3934;

    @ObfuscatedName("lu.ar")
    public int field3935;

    @ObfuscatedName("lu.am")
    public int field3936;

    @ObfuscatedName("lu.aj")
    public int field3937;

    @ObfuscatedName("lu.aq")
    public boolean field3938;

    @ObfuscatedName("lu.ak")
    public int field3939;

    @ObfuscatedName("lu.aw")
    public int field3940;

    @ObfuscatedName("lu.ad")
    public int field3951;

    @ObfuscatedName("lu.ah")
    public int field3942;

    @ObfuscatedName("lu.as")
    public String field3948;

    @ObfuscatedName("lu.ag")
    public String field3944;

    @ObfuscatedName("lu.at")
    public String field3945;

    @ObfuscatedName("lu.ae")
    public String field3941;

    @ObfuscatedName("lu.ap")
    public int field3947;

    @ObfuscatedName("lu.ai")
    public int field3946;

    @ObfuscatedName("lu.aa")
    public int field3949;

    @ObfuscatedName("lu.az")
    public int field3950;

    @ObfuscatedName("lu.al")
    public String field3924;

    @ObfuscatedName("lu.be")
    public String field3952;

    @ObfuscatedName("lu.br")
    public int[] field3953 = new int[3];

    @ObfuscatedName("lu.bi")
    public int field3954;

    public class328(boolean arg0) {
        if (arg0) {
            if (Statics.field1981.startsWith("win")) {
                this.field3932 = 1;
            } else if (Statics.field1981.startsWith("mac")) {
                this.field3932 = 2;
            } else if (Statics.field1981.startsWith("linux")) {
                this.field3932 = 3;
            } else {
                this.field3932 = 4;
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
                this.field3927 = true;
            } else {
                this.field3927 = false;
            }
            if (this.field3932 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3933 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3933 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3933 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3933 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3933 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3933 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3933 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3933 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3933 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3933 = 10;
                } else if (var4.indexOf("10.0") != -1) {
                    this.field3933 = 11;
                }
            } else if (this.field3932 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3933 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3933 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3933 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3933 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3933 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3933 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3933 = 26;
                } else if (var4.indexOf("10.11") != -1) {
                    this.field3933 = 27;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3934 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3934 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3934 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3934 = 4;
            } else {
                this.field3934 = 5;
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
            this.field3935 = var10;
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
            this.field3936 = var14;
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
            this.field3937 = var18;
            this.field3938 = false;
            this.field3939 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3935 > 3) {
                this.field3940 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3940 = 0;
            }
            this.field3951 = 0;
        }
        if (this.field3948 == null) {
            this.field3948 = "";
        }
        if (this.field3944 == null) {
            this.field3944 = "";
        }
        if (this.field3945 == null) {
            this.field3945 = "";
        }
        if (this.field3941 == null) {
            this.field3941 = "";
        }
        if (this.field3924 == null) {
            this.field3924 = "";
        }
        if (this.field3952 == null) {
            this.field3952 = "";
        }
        this.method5871();
    }

    @ObfuscatedName("lu.v(I)V")
    public void method5871() {
        if (this.field3948.length() > 40) {
            this.field3948 = this.field3948.substring(0, 40);
        }
        if (this.field3944.length() > 40) {
            this.field3944 = this.field3944.substring(0, 40);
        }
        if (this.field3945.length() > 10) {
            this.field3945 = this.field3945.substring(0, 10);
        }
        if (this.field3941.length() > 10) {
            this.field3941 = this.field3941.substring(0, 10);
        }
    }

    @ObfuscatedName("lu.s(Lgx;I)V")
    public void method5877(class185 arg0) {
        arg0.method3258(6);
        arg0.method3258(this.field3932);
        arg0.method3258(this.field3927 ? 1 : 0);
        arg0.method3258(this.field3933);
        arg0.method3258(this.field3934);
        arg0.method3258(this.field3935);
        arg0.method3258(this.field3936);
        arg0.method3258(this.field3937);
        arg0.method3258(this.field3938 ? 1 : 0);
        arg0.method3259(this.field3939);
        arg0.method3258(this.field3940);
        arg0.method3268(this.field3951);
        arg0.method3259(this.field3942);
        arg0.method3266(this.field3948);
        arg0.method3266(this.field3944);
        arg0.method3266(this.field3945);
        arg0.method3266(this.field3941);
        arg0.method3258(this.field3946);
        arg0.method3259(this.field3947);
        arg0.method3266(this.field3924);
        arg0.method3266(this.field3952);
        arg0.method3258(this.field3949);
        arg0.method3258(this.field3950);
        for (int var2 = 0; var2 < this.field3953.length; var2++) {
            arg0.method3261(this.field3953[var2]);
        }
        arg0.method3261(this.field3954);
    }

    @ObfuscatedName("lu.o(B)I")
    public int method5873() {
        byte var1 = 38;
        int var2 = var1 + class185.method1857(this.field3948);
        int var3 = var2 + class185.method1857(this.field3944);
        int var4 = var3 + class185.method1857(this.field3945);
        int var5 = var4 + class185.method1857(this.field3941);
        int var6 = var5 + class185.method1857(this.field3924);
        return var6 + class185.method1857(this.field3952);
    }
}
