package deob;

@ObfuscatedName("ki")
public class class293 extends class193 {

    @ObfuscatedName("ki.s")
    public int field3884;

    @ObfuscatedName("ki.r")
    public boolean field3890;

    @ObfuscatedName("ki.ae")
    public int field3908;

    @ObfuscatedName("ki.as")
    public int field3895;

    @ObfuscatedName("ki.af")
    public int field3896;

    @ObfuscatedName("ki.aq")
    public int field3916;

    @ObfuscatedName("ki.am")
    public int field3898;

    @ObfuscatedName("ki.az")
    public boolean field3899;

    @ObfuscatedName("ki.av")
    public int field3900;

    @ObfuscatedName("ki.ar")
    public int field3897;

    @ObfuscatedName("ki.aj")
    public int field3903;

    @ObfuscatedName("ki.ap")
    public int field3904;

    @ObfuscatedName("ki.ao")
    public String field3910;

    @ObfuscatedName("ki.at")
    public String field3906;

    @ObfuscatedName("ki.aw")
    public String field3907;

    @ObfuscatedName("ki.ax")
    public String field3911;

    @ObfuscatedName("ki.ac")
    public int field3892;

    @ObfuscatedName("ki.au")
    public int field3914;

    @ObfuscatedName("ki.al")
    public int field3909;

    @ObfuscatedName("ki.ay")
    public int field3912;

    @ObfuscatedName("ki.ak")
    public String field3905;

    @ObfuscatedName("ki.bj")
    public String field3888;

    @ObfuscatedName("ki.bf")
    public int[] field3915 = new int[3];

    @ObfuscatedName("ki.bq")
    public int field3913;

    public class293(boolean arg0) {
        if (arg0) {
            if (Statics.field1658.startsWith("win")) {
                this.field3884 = 1;
            } else if (Statics.field1658.startsWith("mac")) {
                this.field3884 = 2;
            } else if (Statics.field1658.startsWith("linux")) {
                this.field3884 = 3;
            } else {
                this.field3884 = 4;
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
                this.field3890 = true;
            } else {
                this.field3890 = false;
            }
            if (this.field3884 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3908 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3908 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3908 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3908 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3908 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3908 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3908 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3908 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3908 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3908 = 10;
                } else if (var4.indexOf("10.0") != -1) {
                    this.field3908 = 11;
                }
            } else if (this.field3884 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3908 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3908 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3908 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3908 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3908 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3908 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3908 = 26;
                } else if (var4.indexOf("10.11") != -1) {
                    this.field3908 = 27;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3895 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3895 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3895 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3895 = 4;
            } else {
                this.field3895 = 5;
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
            this.field3896 = var10;
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
            this.field3916 = var14;
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
            this.field3898 = var18;
            this.field3899 = false;
            this.field3900 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3896 > 3) {
                this.field3897 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3897 = 0;
            }
            this.field3903 = 0;
        }
        if (this.field3910 == null) {
            this.field3910 = "";
        }
        if (this.field3906 == null) {
            this.field3906 = "";
        }
        if (this.field3907 == null) {
            this.field3907 = "";
        }
        if (this.field3911 == null) {
            this.field3911 = "";
        }
        if (this.field3905 == null) {
            this.field3905 = "";
        }
        if (this.field3888 == null) {
            this.field3888 = "";
        }
        this.method5120();
    }

    @ObfuscatedName("ki.d(I)V")
    public void method5120() {
        if (this.field3910.length() > 40) {
            this.field3910 = this.field3910.substring(0, 40);
        }
        if (this.field3906.length() > 40) {
            this.field3906 = this.field3906.substring(0, 40);
        }
        if (this.field3907.length() > 10) {
            this.field3907 = this.field3907.substring(0, 10);
        }
        if (this.field3911.length() > 10) {
            this.field3911 = this.field3911.substring(0, 10);
        }
    }

    @ObfuscatedName("ki.k(Lfg;I)V")
    public void method5130(class174 arg0) {
        arg0.method2970(6);
        arg0.method2970(this.field3884);
        arg0.method2970(this.field3890 ? 1 : 0);
        arg0.method2970(this.field3908);
        arg0.method2970(this.field3895);
        arg0.method2970(this.field3896);
        arg0.method2970(this.field3916);
        arg0.method2970(this.field3898);
        arg0.method2970(this.field3899 ? 1 : 0);
        arg0.method2940(this.field3900);
        arg0.method2970(this.field3897);
        arg0.method2941(this.field3903);
        arg0.method2940(this.field3904);
        arg0.method3165(this.field3910);
        arg0.method3165(this.field3906);
        arg0.method3165(this.field3907);
        arg0.method3165(this.field3911);
        arg0.method2970(this.field3914);
        arg0.method2940(this.field3892);
        arg0.method3165(this.field3905);
        arg0.method3165(this.field3888);
        arg0.method2970(this.field3909);
        arg0.method2970(this.field3912);
        for (int var2 = 0; var2 < this.field3915.length; var2++) {
            arg0.method2942(this.field3915[var2]);
        }
        arg0.method2942(this.field3913);
    }

    @ObfuscatedName("ki.e(B)I")
    public int method5122() {
        byte var1 = 38;
        String var3 = this.field3910;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field3906;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field3907;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field3911;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field3905;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field3888;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
