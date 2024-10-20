package deob;

@ObfuscatedName("kd")
public class class292 extends class193 {

    @ObfuscatedName("kd.v")
    public int field3863;

    @ObfuscatedName("kd.t")
    public boolean field3859;

    @ObfuscatedName("kd.c")
    public int field3883;

    @ObfuscatedName("kd.aq")
    public int field3877;

    @ObfuscatedName("kd.af")
    public int field3873;

    @ObfuscatedName("kd.aj")
    public int field3864;

    @ObfuscatedName("kd.ax")
    public int field3875;

    @ObfuscatedName("kd.ad")
    public boolean field3876;

    @ObfuscatedName("kd.av")
    public int field3889;

    @ObfuscatedName("kd.ar")
    public int field3879;

    @ObfuscatedName("kd.at")
    public int field3880;

    @ObfuscatedName("kd.ai")
    public int field3881;

    @ObfuscatedName("kd.ao")
    public String field3882;

    @ObfuscatedName("kd.am")
    public String field3858;

    @ObfuscatedName("kd.ap")
    public String field3884;

    @ObfuscatedName("kd.as")
    public String field3890;

    @ObfuscatedName("kd.aw")
    public int field3886;

    @ObfuscatedName("kd.al")
    public int field3887;

    @ObfuscatedName("kd.ak")
    public int field3888;

    @ObfuscatedName("kd.aa")
    public int field3870;

    @ObfuscatedName("kd.an")
    public String field3867;

    @ObfuscatedName("kd.au")
    public String field3866;

    @ObfuscatedName("kd.ab")
    public int[] field3892 = new int[3];

    @ObfuscatedName("kd.bz")
    public int field3893;

    public class292(boolean arg0) {
        if (arg0) {
            if (Statics.field2114.startsWith("win")) {
                this.field3863 = 1;
            } else if (Statics.field2114.startsWith("mac")) {
                this.field3863 = 2;
            } else if (Statics.field2114.startsWith("linux")) {
                this.field3863 = 3;
            } else {
                this.field3863 = 4;
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
                this.field3859 = true;
            } else {
                this.field3859 = false;
            }
            if (this.field3863 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3883 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3883 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3883 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3883 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3883 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3883 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3883 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3883 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3883 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3883 = 10;
                }
            } else if (this.field3863 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3883 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3883 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3883 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3883 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3883 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3883 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3883 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3877 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3877 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3877 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3877 = 4;
            } else {
                this.field3877 = 5;
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
            this.field3873 = var10;
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
            this.field3864 = var14;
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
            this.field3875 = var18;
            this.field3876 = false;
            this.field3889 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3873 > 3) {
                this.field3879 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3879 = 0;
            }
            this.field3880 = 0;
        }
        if (this.field3882 == null) {
            this.field3882 = "";
        }
        if (this.field3858 == null) {
            this.field3858 = "";
        }
        if (this.field3884 == null) {
            this.field3884 = "";
        }
        if (this.field3890 == null) {
            this.field3890 = "";
        }
        if (this.field3867 == null) {
            this.field3867 = "";
        }
        if (this.field3866 == null) {
            this.field3866 = "";
        }
        this.method5068();
    }

    @ObfuscatedName("kd.i(I)V")
    public void method5068() {
        if (this.field3882.length() > 40) {
            this.field3882 = this.field3882.substring(0, 40);
        }
        if (this.field3858.length() > 40) {
            this.field3858 = this.field3858.substring(0, 40);
        }
        if (this.field3884.length() > 10) {
            this.field3884 = this.field3884.substring(0, 10);
        }
        if (this.field3890.length() > 10) {
            this.field3890 = this.field3890.substring(0, 10);
        }
    }

    @ObfuscatedName("kd.h(Lfv;I)V")
    public void method5067(class174 arg0) {
        arg0.method3031(6);
        arg0.method3031(this.field3863);
        arg0.method3031(this.field3859 ? 1 : 0);
        arg0.method3031(this.field3883);
        arg0.method3031(this.field3877);
        arg0.method3031(this.field3873);
        arg0.method3031(this.field3864);
        arg0.method3031(this.field3875);
        arg0.method3031(this.field3876 ? 1 : 0);
        arg0.method2917(this.field3889);
        arg0.method3031(this.field3879);
        arg0.method3009(this.field3880);
        arg0.method2917(this.field3881);
        arg0.method2923(this.field3882);
        arg0.method2923(this.field3858);
        arg0.method2923(this.field3884);
        arg0.method2923(this.field3890);
        arg0.method3031(this.field3887);
        arg0.method2917(this.field3886);
        arg0.method2923(this.field3867);
        arg0.method2923(this.field3866);
        arg0.method3031(this.field3888);
        arg0.method3031(this.field3870);
        for (int var2 = 0; var2 < this.field3892.length; var2++) {
            arg0.method2919(this.field3892[var2]);
        }
        arg0.method2919(this.field3893);
    }

    @ObfuscatedName("kd.u(I)I")
    public int method5066() {
        byte var1 = 38;
        int var2 = var1 + class174.method2898(this.field3882);
        int var3 = var2 + class174.method2898(this.field3858);
        int var4 = var3 + class174.method2898(this.field3884);
        int var5 = var4 + class174.method2898(this.field3890);
        int var6 = var5 + class174.method2898(this.field3867);
        return var6 + class174.method2898(this.field3866);
    }
}
