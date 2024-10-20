package deob;

@ObfuscatedName("kp")
public class class301 extends class200 {

    @ObfuscatedName("kp.f")
    public int field3928;

    @ObfuscatedName("kp.u")
    public boolean field3929;

    @ObfuscatedName("kp.av")
    public int field3935;

    @ObfuscatedName("kp.am")
    public int field3936;

    @ObfuscatedName("kp.ar")
    public int field3951;

    @ObfuscatedName("kp.ao")
    public int field3938;

    @ObfuscatedName("kp.at")
    public int field3939;

    @ObfuscatedName("kp.ac")
    public boolean field3940;

    @ObfuscatedName("kp.as")
    public int field3927;

    @ObfuscatedName("kp.aw")
    public int field3948;

    @ObfuscatedName("kp.aj")
    public int field3953;

    @ObfuscatedName("kp.ap")
    public int field3942;

    @ObfuscatedName("kp.ag")
    public String field3945;

    @ObfuscatedName("kp.af")
    public String field3946;

    @ObfuscatedName("kp.ay")
    public String field3947;

    @ObfuscatedName("kp.ab")
    public String field3955;

    @ObfuscatedName("kp.ax")
    public int field3943;

    @ObfuscatedName("kp.ai")
    public int field3933;

    @ObfuscatedName("kp.az")
    public int field3954;

    @ObfuscatedName("kp.aa")
    public int field3952;

    @ObfuscatedName("kp.ad")
    public String field3950;

    @ObfuscatedName("kp.ba")
    public String field3925;

    @ObfuscatedName("kp.bi")
    public int[] field3937 = new int[3];

    @ObfuscatedName("kp.bq")
    public int field3931;

    public class301(boolean arg0) {
        if (arg0) {
            if (Statics.field296.startsWith("win")) {
                this.field3928 = 1;
            } else if (Statics.field296.startsWith("mac")) {
                this.field3928 = 2;
            } else if (Statics.field296.startsWith("linux")) {
                this.field3928 = 3;
            } else {
                this.field3928 = 4;
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
                this.field3929 = true;
            } else {
                this.field3929 = false;
            }
            if (this.field3928 == 1) {
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
            } else if (this.field3928 == 2) {
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
            this.field3951 = var10;
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
            this.field3940 = false;
            this.field3927 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3951 > 3) {
                this.field3948 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3948 = 0;
            }
            this.field3953 = 0;
        }
        if (this.field3945 == null) {
            this.field3945 = "";
        }
        if (this.field3946 == null) {
            this.field3946 = "";
        }
        if (this.field3947 == null) {
            this.field3947 = "";
        }
        if (this.field3955 == null) {
            this.field3955 = "";
        }
        if (this.field3950 == null) {
            this.field3950 = "";
        }
        if (this.field3925 == null) {
            this.field3925 = "";
        }
        this.method5106();
    }

    @ObfuscatedName("kp.b(I)V")
    public void method5106() {
        if (this.field3945.length() > 40) {
            this.field3945 = this.field3945.substring(0, 40);
        }
        if (this.field3946.length() > 40) {
            this.field3946 = this.field3946.substring(0, 40);
        }
        if (this.field3947.length() > 10) {
            this.field3947 = this.field3947.substring(0, 10);
        }
        if (this.field3955.length() > 10) {
            this.field3955 = this.field3955.substring(0, 10);
        }
    }

    @ObfuscatedName("kp.s(Lfs;I)V")
    public void method5114(class181 arg0) {
        arg0.method2929(6);
        arg0.method2929(this.field3928);
        arg0.method2929(this.field3929 ? 1 : 0);
        arg0.method2929(this.field3935);
        arg0.method2929(this.field3936);
        arg0.method2929(this.field3951);
        arg0.method2929(this.field3938);
        arg0.method2929(this.field3939);
        arg0.method2929(this.field3940 ? 1 : 0);
        arg0.method2930(this.field3927);
        arg0.method2929(this.field3948);
        arg0.method2931(this.field3953);
        arg0.method2930(this.field3942);
        arg0.method3078(this.field3945);
        arg0.method3078(this.field3946);
        arg0.method3078(this.field3947);
        arg0.method3078(this.field3955);
        arg0.method2929(this.field3933);
        arg0.method2930(this.field3943);
        arg0.method3078(this.field3950);
        arg0.method3078(this.field3925);
        arg0.method2929(this.field3954);
        arg0.method2929(this.field3952);
        for (int var2 = 0; var2 < this.field3937.length; var2++) {
            arg0.method2977(this.field3937[var2]);
        }
        arg0.method2977(this.field3931);
    }

    @ObfuscatedName("kp.r(I)I")
    public int method5108() {
        byte var1 = 38;
        String var3 = this.field3945;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field3946;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field3947;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field3955;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field3950;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field3925;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
