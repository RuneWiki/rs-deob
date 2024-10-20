package deob;

@ObfuscatedName("ke")
public class class293 extends class194 {

    @ObfuscatedName("ke.g")
    public int field3866;

    @ObfuscatedName("ke.c")
    public boolean field3860;

    @ObfuscatedName("ke.ax")
    public int field3864;

    @ObfuscatedName("ke.ab")
    public int field3879;

    @ObfuscatedName("ke.aj")
    public int field3867;

    @ObfuscatedName("ke.ae")
    public int field3868;

    @ObfuscatedName("ke.at")
    public int field3869;

    @ObfuscatedName("ke.as")
    public boolean field3874;

    @ObfuscatedName("ke.af")
    public int field3871;

    @ObfuscatedName("ke.az")
    public int field3872;

    @ObfuscatedName("ke.am")
    public int field3863;

    @ObfuscatedName("ke.ah")
    public int field3884;

    @ObfuscatedName("ke.ap")
    public String field3875;

    @ObfuscatedName("ke.ad")
    public String field3876;

    @ObfuscatedName("ke.aa")
    public String field3857;

    @ObfuscatedName("ke.aw")
    public String field3878;

    @ObfuscatedName("ke.aq")
    public int field3873;

    @ObfuscatedName("ke.ai")
    public int field3880;

    @ObfuscatedName("ke.ak")
    public int field3881;

    @ObfuscatedName("ke.ac")
    public int field3882;

    @ObfuscatedName("ke.ay")
    public String field3883;

    @ObfuscatedName("ke.bk")
    public String field3855;

    @ObfuscatedName("ke.bi")
    public int[] field3885 = new int[3];

    @ObfuscatedName("ke.ba")
    public int field3886;

    public class293(boolean arg0) {
        if (arg0) {
            if (Statics.field278.startsWith("win")) {
                this.field3866 = 1;
            } else if (Statics.field278.startsWith("mac")) {
                this.field3866 = 2;
            } else if (Statics.field278.startsWith("linux")) {
                this.field3866 = 3;
            } else {
                this.field3866 = 4;
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
                this.field3860 = true;
            } else {
                this.field3860 = false;
            }
            if (this.field3866 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3864 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3864 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3864 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3864 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3864 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3864 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3864 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3864 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3864 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3864 = 10;
                } else if (var4.indexOf("10.0") != -1) {
                    this.field3864 = 11;
                }
            } else if (this.field3866 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3864 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3864 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3864 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3864 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3864 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3864 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3864 = 26;
                } else if (var4.indexOf("10.11") != -1) {
                    this.field3864 = 27;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3879 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3879 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3879 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3879 = 4;
            } else {
                this.field3879 = 5;
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
            this.field3868 = var14;
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
            this.field3874 = false;
            this.field3871 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3867 > 3) {
                this.field3872 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3872 = 0;
            }
            this.field3863 = 0;
        }
        if (this.field3875 == null) {
            this.field3875 = "";
        }
        if (this.field3876 == null) {
            this.field3876 = "";
        }
        if (this.field3857 == null) {
            this.field3857 = "";
        }
        if (this.field3878 == null) {
            this.field3878 = "";
        }
        if (this.field3883 == null) {
            this.field3883 = "";
        }
        if (this.field3855 == null) {
            this.field3855 = "";
        }
        this.method5043();
    }

    @ObfuscatedName("ke.j(I)V")
    public void method5043() {
        if (this.field3875.length() > 40) {
            this.field3875 = this.field3875.substring(0, 40);
        }
        if (this.field3876.length() > 40) {
            this.field3876 = this.field3876.substring(0, 40);
        }
        if (this.field3857.length() > 10) {
            this.field3857 = this.field3857.substring(0, 10);
        }
        if (this.field3878.length() > 10) {
            this.field3878 = this.field3878.substring(0, 10);
        }
    }

    @ObfuscatedName("ke.h(Lfb;I)V")
    public void method5042(class175 arg0) {
        arg0.method2888(6);
        arg0.method2888(this.field3866);
        arg0.method2888(this.field3860 ? 1 : 0);
        arg0.method2888(this.field3864);
        arg0.method2888(this.field3879);
        arg0.method2888(this.field3867);
        arg0.method2888(this.field3868);
        arg0.method2888(this.field3869);
        arg0.method2888(this.field3874 ? 1 : 0);
        arg0.method3030(this.field3871);
        arg0.method2888(this.field3872);
        arg0.method3053(this.field3863);
        arg0.method3030(this.field3884);
        arg0.method2959(this.field3875);
        arg0.method2959(this.field3876);
        arg0.method2959(this.field3857);
        arg0.method2959(this.field3878);
        arg0.method2888(this.field3880);
        arg0.method3030(this.field3873);
        arg0.method2959(this.field3883);
        arg0.method2959(this.field3855);
        arg0.method2888(this.field3881);
        arg0.method2888(this.field3882);
        for (int var2 = 0; var2 < this.field3885.length; var2++) {
            arg0.method2891(this.field3885[var2]);
        }
        arg0.method2891(this.field3886);
    }

    @ObfuscatedName("ke.f(I)I")
    public int method5044() {
        byte var1 = 38;
        String var3 = this.field3875;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field3876;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field3857;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field3878;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field3883;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field3855;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
