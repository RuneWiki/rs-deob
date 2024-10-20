package deob;

@ObfuscatedName("ku")
public class class292 extends class193 {

    @ObfuscatedName("ku.m")
    public int field3863;

    @ObfuscatedName("ku.s")
    public boolean field3862;

    @ObfuscatedName("ku.b")
    public int field3865;

    @ObfuscatedName("ku.av")
    public int field3857;

    @ObfuscatedName("ku.al")
    public int field3867;

    @ObfuscatedName("ku.ab")
    public int field3861;

    @ObfuscatedName("ku.af")
    public int field3869;

    @ObfuscatedName("ku.ak")
    public boolean field3870;

    @ObfuscatedName("ku.ar")
    public int field3871;

    @ObfuscatedName("ku.at")
    public int field3872;

    @ObfuscatedName("ku.ad")
    public int field3858;

    @ObfuscatedName("ku.ac")
    public int field3874;

    @ObfuscatedName("ku.ae")
    public String field3875;

    @ObfuscatedName("ku.ah")
    public String field3876;

    @ObfuscatedName("ku.ax")
    public String field3877;

    @ObfuscatedName("ku.ai")
    public String field3878;

    @ObfuscatedName("ku.aa")
    public int field3879;

    @ObfuscatedName("ku.aq")
    public int field3880;

    @ObfuscatedName("ku.as")
    public int field3868;

    @ObfuscatedName("ku.au")
    public int field3882;

    @ObfuscatedName("ku.az")
    public String field3883;

    @ObfuscatedName("ku.ay")
    public String field3884;

    @ObfuscatedName("ku.ao")
    public int[] field3885 = new int[3];

    @ObfuscatedName("ku.bz")
    public int field3886;

    public class292(boolean arg0) {
        if (arg0) {
            if (Statics.field2209.startsWith("win")) {
                this.field3863 = 1;
            } else if (Statics.field2209.startsWith("mac")) {
                this.field3863 = 2;
            } else if (Statics.field2209.startsWith("linux")) {
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
                this.field3862 = true;
            } else {
                this.field3862 = false;
            }
            if (this.field3863 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3865 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3865 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3865 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3865 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3865 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3865 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3865 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3865 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3865 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3865 = 10;
                }
            } else if (this.field3863 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3865 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3865 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3865 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3865 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3865 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3865 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3865 = 26;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3857 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3857 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3857 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3857 = 4;
            } else {
                this.field3857 = 5;
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
            this.field3867 = var10;
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
            this.field3861 = var14;
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
            this.field3869 = var18;
            this.field3870 = false;
            this.field3871 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3867 > 3) {
                this.field3872 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3872 = 0;
            }
            this.field3858 = 0;
        }
        if (this.field3875 == null) {
            this.field3875 = "";
        }
        if (this.field3876 == null) {
            this.field3876 = "";
        }
        if (this.field3877 == null) {
            this.field3877 = "";
        }
        if (this.field3878 == null) {
            this.field3878 = "";
        }
        if (this.field3883 == null) {
            this.field3883 = "";
        }
        if (this.field3884 == null) {
            this.field3884 = "";
        }
        this.method4939();
    }

    @ObfuscatedName("ku.c(I)V")
    public void method4939() {
        if (this.field3875.length() > 40) {
            this.field3875 = this.field3875.substring(0, 40);
        }
        if (this.field3876.length() > 40) {
            this.field3876 = this.field3876.substring(0, 40);
        }
        if (this.field3877.length() > 10) {
            this.field3877 = this.field3877.substring(0, 10);
        }
        if (this.field3878.length() > 10) {
            this.field3878 = this.field3878.substring(0, 10);
        }
    }

    @ObfuscatedName("ku.o(Lfp;I)V")
    public void method4940(class174 arg0) {
        arg0.method2922(6);
        arg0.method2922(this.field3863);
        arg0.method2922(this.field3862 ? 1 : 0);
        arg0.method2922(this.field3865);
        arg0.method2922(this.field3857);
        arg0.method2922(this.field3867);
        arg0.method2922(this.field3861);
        arg0.method2922(this.field3869);
        arg0.method2922(this.field3870 ? 1 : 0);
        arg0.method2846(this.field3871);
        arg0.method2922(this.field3872);
        arg0.method2847(this.field3858);
        arg0.method2846(this.field3874);
        arg0.method2852(this.field3875);
        arg0.method2852(this.field3876);
        arg0.method2852(this.field3877);
        arg0.method2852(this.field3878);
        arg0.method2922(this.field3880);
        arg0.method2846(this.field3879);
        arg0.method2852(this.field3883);
        arg0.method2852(this.field3884);
        arg0.method2922(this.field3868);
        arg0.method2922(this.field3882);
        for (int var2 = 0; var2 < this.field3885.length; var2++) {
            arg0.method3024(this.field3885[var2]);
        }
        arg0.method3024(this.field3886);
    }

    @ObfuscatedName("ku.i(I)I")
    public int method4941() {
        byte var1 = 38;
        int var2 = var1 + class174.method601(this.field3875);
        int var3 = var2 + class174.method601(this.field3876);
        int var4 = var3 + class174.method601(this.field3877);
        int var5 = var4 + class174.method601(this.field3878);
        int var6 = var5 + class174.method601(this.field3883);
        return var6 + class174.method601(this.field3884);
    }
}
