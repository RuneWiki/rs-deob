package deob;

@ObfuscatedName("kz")
public class class295 extends class196 {

    @ObfuscatedName("kz.i")
    public int field3897;

    @ObfuscatedName("kz.j")
    public boolean field3880;

    @ObfuscatedName("kz.b")
    public int field3875;

    @ObfuscatedName("kz.ad")
    public int field3884;

    @ObfuscatedName("kz.ar")
    public int field3890;

    @ObfuscatedName("kz.aq")
    public int field3886;

    @ObfuscatedName("kz.ag")
    public int field3887;

    @ObfuscatedName("kz.ak")
    public boolean field3901;

    @ObfuscatedName("kz.ae")
    public int field3899;

    @ObfuscatedName("kz.az")
    public int field3879;

    @ObfuscatedName("kz.as")
    public int field3891;

    @ObfuscatedName("kz.aw")
    public int field3892;

    @ObfuscatedName("kz.at")
    public String field3902;

    @ObfuscatedName("kz.aj")
    public String field3889;

    @ObfuscatedName("kz.ax")
    public String field3895;

    @ObfuscatedName("kz.an")
    public String field3896;

    @ObfuscatedName("kz.ab")
    public int field3893;

    @ObfuscatedName("kz.av")
    public int field3898;

    @ObfuscatedName("kz.al")
    public int field3885;

    @ObfuscatedName("kz.ah")
    public int field3883;

    @ObfuscatedName("kz.au")
    public String field3894;

    @ObfuscatedName("kz.aa")
    public String field3888;

    @ObfuscatedName("kz.ao")
    public int[] field3903 = new int[3];

    @ObfuscatedName("kz.bm")
    public int field3904;

    public class295(boolean arg0) {
        if (arg0) {
            if (Statics.field2258.startsWith("win")) {
                this.field3897 = 1;
            } else if (Statics.field2258.startsWith("mac")) {
                this.field3897 = 2;
            } else if (Statics.field2258.startsWith("linux")) {
                this.field3897 = 3;
            } else {
                this.field3897 = 4;
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
                this.field3880 = true;
            } else {
                this.field3880 = false;
            }
            if (this.field3897 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3875 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3875 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3875 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3875 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3875 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3875 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3875 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3875 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3875 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3875 = 10;
                }
            } else if (this.field3897 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3875 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3875 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3875 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3875 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3875 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3875 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3875 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3884 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3884 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3884 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3884 = 4;
            } else {
                this.field3884 = 5;
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
            this.field3890 = var10;
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
            this.field3886 = var14;
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
            this.field3887 = var18;
            this.field3901 = false;
            this.field3899 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3890 > 3) {
                this.field3879 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3879 = 0;
            }
            this.field3891 = 0;
        }
        if (this.field3902 == null) {
            this.field3902 = "";
        }
        if (this.field3889 == null) {
            this.field3889 = "";
        }
        if (this.field3895 == null) {
            this.field3895 = "";
        }
        if (this.field3896 == null) {
            this.field3896 = "";
        }
        if (this.field3894 == null) {
            this.field3894 = "";
        }
        if (this.field3888 == null) {
            this.field3888 = "";
        }
        this.method5015();
    }

    @ObfuscatedName("kz.w(I)V")
    public void method5015() {
        if (this.field3902.length() > 40) {
            this.field3902 = this.field3902.substring(0, 40);
        }
        if (this.field3889.length() > 40) {
            this.field3889 = this.field3889.substring(0, 40);
        }
        if (this.field3895.length() > 10) {
            this.field3895 = this.field3895.substring(0, 10);
        }
        if (this.field3896.length() > 10) {
            this.field3896 = this.field3896.substring(0, 10);
        }
    }

    @ObfuscatedName("kz.o(Lfi;I)V")
    public void method5023(class177 arg0) {
        arg0.method3075(6);
        arg0.method3075(this.field3897);
        arg0.method3075(this.field3880 ? 1 : 0);
        arg0.method3075(this.field3875);
        arg0.method3075(this.field3884);
        arg0.method3075(this.field3890);
        arg0.method3075(this.field3886);
        arg0.method3075(this.field3887);
        arg0.method3075(this.field3901 ? 1 : 0);
        arg0.method2903(this.field3899);
        arg0.method3075(this.field3879);
        arg0.method2871(this.field3891);
        arg0.method2903(this.field3892);
        arg0.method3077(this.field3902);
        arg0.method3077(this.field3889);
        arg0.method3077(this.field3895);
        arg0.method3077(this.field3896);
        arg0.method3075(this.field3898);
        arg0.method2903(this.field3893);
        arg0.method3077(this.field3894);
        arg0.method3077(this.field3888);
        arg0.method3075(this.field3885);
        arg0.method3075(this.field3883);
        for (int var2 = 0; var2 < this.field3903.length; var2++) {
            arg0.method2872(this.field3903[var2]);
        }
        arg0.method2872(this.field3904);
    }

    @ObfuscatedName("kz.x(I)I")
    public int method5018() {
        byte var1 = 38;
        String var3 = this.field3902;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field3889;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field3895;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field3896;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field3894;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field3888;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
