package deob;

@ObfuscatedName("kk")
public class class292 extends class193 {

    @ObfuscatedName("kk.e")
    public int field3891;

    @ObfuscatedName("kk.l")
    public boolean field3870;

    @ObfuscatedName("kk.q")
    public int field3876;

    @ObfuscatedName("kk.ap")
    public int field3878;

    @ObfuscatedName("kk.ar")
    public int field3879;

    @ObfuscatedName("kk.am")
    public int field3877;

    @ObfuscatedName("kk.aw")
    public int field3881;

    @ObfuscatedName("kk.aq")
    public boolean field3882;

    @ObfuscatedName("kk.aa")
    public int field3883;

    @ObfuscatedName("kk.aj")
    public int field3884;

    @ObfuscatedName("kk.ad")
    public int field3885;

    @ObfuscatedName("kk.az")
    public int field3886;

    @ObfuscatedName("kk.as")
    public String field3880;

    @ObfuscatedName("kk.av")
    public String field3888;

    @ObfuscatedName("kk.ab")
    public String field3889;

    @ObfuscatedName("kk.at")
    public String field3890;

    @ObfuscatedName("kk.al")
    public int field3874;

    @ObfuscatedName("kk.ah")
    public int field3872;

    @ObfuscatedName("kk.an")
    public int field3893;

    @ObfuscatedName("kk.ay")
    public int field3894;

    @ObfuscatedName("kk.ao")
    public String field3867;

    @ObfuscatedName("kk.ac")
    public String field3896;

    @ObfuscatedName("kk.af")
    public int[] field3897 = new int[3];

    @ObfuscatedName("kk.bp")
    public int field3898;

    public class292(boolean arg0) {
        if (arg0) {
            if (Statics.field290.startsWith("win")) {
                this.field3891 = 1;
            } else if (Statics.field290.startsWith("mac")) {
                this.field3891 = 2;
            } else if (Statics.field290.startsWith("linux")) {
                this.field3891 = 3;
            } else {
                this.field3891 = 4;
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
                this.field3870 = true;
            } else {
                this.field3870 = false;
            }
            if (this.field3891 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3876 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3876 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3876 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3876 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3876 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3876 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3876 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3876 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3876 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3876 = 10;
                }
            } else if (this.field3891 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3876 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3876 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3876 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3876 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3876 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3876 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3876 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3878 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3878 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3878 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3878 = 4;
            } else {
                this.field3878 = 5;
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
            this.field3879 = var10;
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
            this.field3877 = var14;
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
            this.field3881 = var18;
            this.field3882 = false;
            this.field3883 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3879 > 3) {
                this.field3884 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3884 = 0;
            }
            this.field3885 = 0;
        }
        if (this.field3880 == null) {
            this.field3880 = "";
        }
        if (this.field3888 == null) {
            this.field3888 = "";
        }
        if (this.field3889 == null) {
            this.field3889 = "";
        }
        if (this.field3890 == null) {
            this.field3890 = "";
        }
        if (this.field3867 == null) {
            this.field3867 = "";
        }
        if (this.field3896 == null) {
            this.field3896 = "";
        }
        this.method4932();
    }

    @ObfuscatedName("kk.a(B)V")
    public void method4932() {
        if (this.field3880.length() > 40) {
            this.field3880 = this.field3880.substring(0, 40);
        }
        if (this.field3888.length() > 40) {
            this.field3888 = this.field3888.substring(0, 40);
        }
        if (this.field3889.length() > 10) {
            this.field3889 = this.field3889.substring(0, 10);
        }
        if (this.field3890.length() > 10) {
            this.field3890 = this.field3890.substring(0, 10);
        }
    }

    @ObfuscatedName("kk.j(Lfe;I)V")
    public void method4933(class174 arg0) {
        arg0.method2908(6);
        arg0.method2908(this.field3891);
        arg0.method2908(this.field3870 ? 1 : 0);
        arg0.method2908(this.field3876);
        arg0.method2908(this.field3878);
        arg0.method2908(this.field3879);
        arg0.method2908(this.field3877);
        arg0.method2908(this.field3881);
        arg0.method2908(this.field3882 ? 1 : 0);
        arg0.method2857(this.field3883);
        arg0.method2908(this.field3884);
        arg0.method2858(this.field3885);
        arg0.method2857(this.field3886);
        arg0.method2863(this.field3880);
        arg0.method2863(this.field3888);
        arg0.method2863(this.field3889);
        arg0.method2863(this.field3890);
        arg0.method2908(this.field3872);
        arg0.method2857(this.field3874);
        arg0.method2863(this.field3867);
        arg0.method2863(this.field3896);
        arg0.method2908(this.field3893);
        arg0.method2908(this.field3894);
        for (int var2 = 0; var2 < this.field3897.length; var2++) {
            arg0.method2859(this.field3897[var2]);
        }
        arg0.method2859(this.field3898);
    }

    @ObfuscatedName("kk.n(I)I")
    public int method4934() {
        byte var1 = 38;
        int var2 = var1 + class174.method1497(this.field3880);
        int var3 = var2 + class174.method1497(this.field3888);
        int var4 = var3 + class174.method1497(this.field3889);
        int var5 = var4 + class174.method1497(this.field3890);
        int var6 = var5 + class174.method1497(this.field3867);
        return var6 + class174.method1497(this.field3896);
    }
}
