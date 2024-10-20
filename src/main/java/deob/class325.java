package deob;

@ObfuscatedName("lg")
public class class325 extends class205 {

    @ObfuscatedName("lg.q")
    public int field3912;

    @ObfuscatedName("lg.k")
    public boolean field3893;

    @ObfuscatedName("lg.af")
    public int field3896;

    @ObfuscatedName("lg.an")
    public int field3897;

    @ObfuscatedName("lg.ao")
    public int field3898;

    @ObfuscatedName("lg.at")
    public int field3899;

    @ObfuscatedName("lg.ai")
    public int field3901;

    @ObfuscatedName("lg.ac")
    public boolean field3892;

    @ObfuscatedName("lg.ap")
    public int field3902;

    @ObfuscatedName("lg.ar")
    public int field3903;

    @ObfuscatedName("lg.av")
    public int field3907;

    @ObfuscatedName("lg.al")
    public int field3905;

    @ObfuscatedName("lg.ae")
    public String field3906;

    @ObfuscatedName("lg.az")
    public String field3915;

    @ObfuscatedName("lg.aq")
    public String field3908;

    @ObfuscatedName("lg.ad")
    public String field3909;

    @ObfuscatedName("lg.aj")
    public int field3910;

    @ObfuscatedName("lg.ax")
    public int field3911;

    @ObfuscatedName("lg.am")
    public int field3890;

    @ObfuscatedName("lg.ay")
    public int field3913;

    @ObfuscatedName("lg.ag")
    public String field3914;

    @ObfuscatedName("lg.bk")
    public String field3895;

    @ObfuscatedName("lg.bp")
    public int[] field3916 = new int[3];

    @ObfuscatedName("lg.bi")
    public int field3917;

    public class325(boolean arg0) {
        if (arg0) {
            if (Statics.field1066.startsWith("win")) {
                this.field3912 = 1;
            } else if (Statics.field1066.startsWith("mac")) {
                this.field3912 = 2;
            } else if (Statics.field1066.startsWith("linux")) {
                this.field3912 = 3;
            } else {
                this.field3912 = 4;
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
                this.field3893 = true;
            } else {
                this.field3893 = false;
            }
            if (this.field3912 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3896 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3896 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3896 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3896 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3896 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3896 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3896 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3896 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3896 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3896 = 10;
                } else if (var4.indexOf("10.0") != -1) {
                    this.field3896 = 11;
                }
            } else if (this.field3912 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3896 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3896 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3896 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3896 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3896 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3896 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3896 = 26;
                } else if (var4.indexOf("10.11") != -1) {
                    this.field3896 = 27;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3897 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3897 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3897 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3897 = 4;
            } else {
                this.field3897 = 5;
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
            this.field3898 = var10;
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
            this.field3899 = var14;
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
            this.field3901 = var18;
            this.field3892 = false;
            this.field3902 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3898 > 3) {
                this.field3903 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3903 = 0;
            }
            this.field3907 = 0;
        }
        if (this.field3906 == null) {
            this.field3906 = "";
        }
        if (this.field3915 == null) {
            this.field3915 = "";
        }
        if (this.field3908 == null) {
            this.field3908 = "";
        }
        if (this.field3909 == null) {
            this.field3909 = "";
        }
        if (this.field3914 == null) {
            this.field3914 = "";
        }
        if (this.field3895 == null) {
            this.field3895 = "";
        }
        this.method5771();
    }

    @ObfuscatedName("lg.z(I)V")
    public void method5771() {
        if (this.field3906.length() > 40) {
            this.field3906 = this.field3906.substring(0, 40);
        }
        if (this.field3915.length() > 40) {
            this.field3915 = this.field3915.substring(0, 40);
        }
        if (this.field3908.length() > 10) {
            this.field3908 = this.field3908.substring(0, 10);
        }
        if (this.field3909.length() > 10) {
            this.field3909 = this.field3909.substring(0, 10);
        }
    }

    @ObfuscatedName("lg.w(Lgk;S)V")
    public void method5777(class183 arg0) {
        arg0.method3235(6);
        arg0.method3235(this.field3912);
        arg0.method3235(this.field3893 ? 1 : 0);
        arg0.method3235(this.field3896);
        arg0.method3235(this.field3897);
        arg0.method3235(this.field3898);
        arg0.method3235(this.field3899);
        arg0.method3235(this.field3901);
        arg0.method3235(this.field3892 ? 1 : 0);
        arg0.method3458(this.field3902);
        arg0.method3235(this.field3903);
        arg0.method3237(this.field3907);
        arg0.method3458(this.field3905);
        arg0.method3243(this.field3906);
        arg0.method3243(this.field3915);
        arg0.method3243(this.field3908);
        arg0.method3243(this.field3909);
        arg0.method3235(this.field3911);
        arg0.method3458(this.field3910);
        arg0.method3243(this.field3914);
        arg0.method3243(this.field3895);
        arg0.method3235(this.field3890);
        arg0.method3235(this.field3913);
        for (int var2 = 0; var2 < this.field3916.length; var2++) {
            arg0.method3410(this.field3916[var2]);
        }
        arg0.method3410(this.field3917);
    }

    @ObfuscatedName("lg.s(I)I")
    public int method5775() {
        byte var1 = 38;
        String var3 = this.field3906;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field3915;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field3908;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field3909;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field3914;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field3895;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
