package deob;

@ObfuscatedName("kb")
public class class293 extends class193 {

    @ObfuscatedName("kb.v")
    public int field3888;

    @ObfuscatedName("kb.p")
    public boolean field3889;

    @ObfuscatedName("kb.ap")
    public int field3905;

    @ObfuscatedName("kb.at")
    public int field3911;

    @ObfuscatedName("kb.ao")
    public int field3883;

    @ObfuscatedName("kb.aq")
    public int field3898;

    @ObfuscatedName("kb.ax")
    public int field3899;

    @ObfuscatedName("kb.av")
    public boolean field3900;

    @ObfuscatedName("kb.al")
    public int field3896;

    @ObfuscatedName("kb.ab")
    public int field3901;

    @ObfuscatedName("kb.ac")
    public int field3903;

    @ObfuscatedName("kb.ad")
    public int field3904;

    @ObfuscatedName("kb.am")
    public String field3893;

    @ObfuscatedName("kb.ah")
    public String field3906;

    @ObfuscatedName("kb.ak")
    public String field3913;

    @ObfuscatedName("kb.ar")
    public String field3891;

    @ObfuscatedName("kb.ag")
    public int field3909;

    @ObfuscatedName("kb.ai")
    public int field3910;

    @ObfuscatedName("kb.au")
    public int field3885;

    @ObfuscatedName("kb.an")
    public int field3890;

    @ObfuscatedName("kb.as")
    public String field3894;

    @ObfuscatedName("kb.br")
    public String field3914;

    @ObfuscatedName("kb.bj")
    public int[] field3915 = new int[3];

    @ObfuscatedName("kb.bf")
    public int field3916;

    public class293(boolean arg0) {
        if (arg0) {
            if (Statics.field1353.startsWith("win")) {
                this.field3888 = 1;
            } else if (Statics.field1353.startsWith("mac")) {
                this.field3888 = 2;
            } else if (Statics.field1353.startsWith("linux")) {
                this.field3888 = 3;
            } else {
                this.field3888 = 4;
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
                this.field3889 = true;
            } else {
                this.field3889 = false;
            }
            if (this.field3888 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3905 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3905 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3905 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3905 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3905 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3905 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3905 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3905 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3905 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3905 = 10;
                } else if (var4.indexOf("10.0") != -1) {
                    this.field3905 = 11;
                }
            } else if (this.field3888 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3905 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3905 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3905 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3905 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3905 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3905 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3905 = 26;
                } else if (var4.indexOf("10.11") != -1) {
                    this.field3905 = 27;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3911 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3911 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3911 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3911 = 4;
            } else {
                this.field3911 = 5;
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
            this.field3883 = var10;
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
            this.field3898 = var14;
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
            this.field3899 = var18;
            this.field3900 = false;
            this.field3896 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3883 > 3) {
                this.field3901 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3901 = 0;
            }
            this.field3903 = 0;
        }
        if (this.field3893 == null) {
            this.field3893 = "";
        }
        if (this.field3906 == null) {
            this.field3906 = "";
        }
        if (this.field3913 == null) {
            this.field3913 = "";
        }
        if (this.field3891 == null) {
            this.field3891 = "";
        }
        if (this.field3894 == null) {
            this.field3894 = "";
        }
        if (this.field3914 == null) {
            this.field3914 = "";
        }
        this.method5149();
    }

    @ObfuscatedName("kb.w(I)V")
    public void method5149() {
        if (this.field3893.length() > 40) {
            this.field3893 = this.field3893.substring(0, 40);
        }
        if (this.field3906.length() > 40) {
            this.field3906 = this.field3906.substring(0, 40);
        }
        if (this.field3913.length() > 10) {
            this.field3913 = this.field3913.substring(0, 10);
        }
        if (this.field3891.length() > 10) {
            this.field3891 = this.field3891.substring(0, 10);
        }
    }

    @ObfuscatedName("kb.s(Lfz;I)V")
    public void method5148(class174 arg0) {
        arg0.method2955(6);
        arg0.method2955(this.field3888);
        arg0.method2955(this.field3889 ? 1 : 0);
        arg0.method2955(this.field3905);
        arg0.method2955(this.field3911);
        arg0.method2955(this.field3883);
        arg0.method2955(this.field3898);
        arg0.method2955(this.field3899);
        arg0.method2955(this.field3900 ? 1 : 0);
        arg0.method2956(this.field3896);
        arg0.method2955(this.field3901);
        arg0.method3161(this.field3903);
        arg0.method2956(this.field3904);
        arg0.method2970(this.field3893);
        arg0.method2970(this.field3906);
        arg0.method2970(this.field3913);
        arg0.method2970(this.field3891);
        arg0.method2955(this.field3910);
        arg0.method2956(this.field3909);
        arg0.method2970(this.field3894);
        arg0.method2970(this.field3914);
        arg0.method2955(this.field3885);
        arg0.method2955(this.field3890);
        for (int var2 = 0; var2 < this.field3915.length; var2++) {
            arg0.method3072(this.field3915[var2]);
        }
        arg0.method3072(this.field3916);
    }

    @ObfuscatedName("kb.q(I)I")
    public int method5150() {
        byte var1 = 38;
        String var3 = this.field3893;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field3906;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field3913;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field3891;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field3894;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field3914;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
