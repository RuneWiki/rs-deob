package deob;

@ObfuscatedName("ll")
public class class325 extends class205 {

    @ObfuscatedName("ll.n")
    public int field3897;

    @ObfuscatedName("ll.h")
    public boolean field3898;

    @ObfuscatedName("ll.ai")
    public int field3895;

    @ObfuscatedName("ll.as")
    public int field3904;

    @ObfuscatedName("ll.aw")
    public int field3905;

    @ObfuscatedName("ll.ag")
    public int field3893;

    @ObfuscatedName("ll.ah")
    public int field3907;

    @ObfuscatedName("ll.az")
    public boolean field3908;

    @ObfuscatedName("ll.ao")
    public int field3909;

    @ObfuscatedName("ll.af")
    public int field3910;

    @ObfuscatedName("ll.aq")
    public int field3913;

    @ObfuscatedName("ll.aj")
    public int field3912;

    @ObfuscatedName("ll.ae")
    public String field3894;

    @ObfuscatedName("ll.au")
    public String field3914;

    @ObfuscatedName("ll.av")
    public String field3902;

    @ObfuscatedName("ll.ab")
    public String field3899;

    @ObfuscatedName("ll.aa")
    public int field3917;

    @ObfuscatedName("ll.ar")
    public int field3918;

    @ObfuscatedName("ll.ax")
    public int field3915;

    @ObfuscatedName("ll.al")
    public int field3922;

    @ObfuscatedName("ll.ak")
    public String field3921;

    @ObfuscatedName("ll.bc")
    public String field3906;

    @ObfuscatedName("ll.bo")
    public int[] field3923 = new int[3];

    @ObfuscatedName("ll.bx")
    public int field3924;

    public class325(boolean arg0) {
        if (arg0) {
            if (Statics.field1824.startsWith("win")) {
                this.field3897 = 1;
            } else if (Statics.field1824.startsWith("mac")) {
                this.field3897 = 2;
            } else if (Statics.field1824.startsWith("linux")) {
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
                this.field3898 = true;
            } else {
                this.field3898 = false;
            }
            if (this.field3897 == 1) {
                if (var4.indexOf("4.0") != -1) {
                    this.field3895 = 1;
                } else if (var4.indexOf("4.1") != -1) {
                    this.field3895 = 2;
                } else if (var4.indexOf("4.9") != -1) {
                    this.field3895 = 3;
                } else if (var4.indexOf("5.0") != -1) {
                    this.field3895 = 4;
                } else if (var4.indexOf("5.1") != -1) {
                    this.field3895 = 5;
                } else if (var4.indexOf("5.2") != -1) {
                    this.field3895 = 8;
                } else if (var4.indexOf("6.0") != -1) {
                    this.field3895 = 6;
                } else if (var4.indexOf("6.1") != -1) {
                    this.field3895 = 7;
                } else if (var4.indexOf("6.2") != -1) {
                    this.field3895 = 9;
                } else if (var4.indexOf("6.3") != -1) {
                    this.field3895 = 10;
                } else if (var4.indexOf("10.0") != -1) {
                    this.field3895 = 11;
                }
            } else if (this.field3897 == 2) {
                if (var4.indexOf("10.4") != -1) {
                    this.field3895 = 20;
                } else if (var4.indexOf("10.5") != -1) {
                    this.field3895 = 21;
                } else if (var4.indexOf("10.6") != -1) {
                    this.field3895 = 22;
                } else if (var4.indexOf("10.7") != -1) {
                    this.field3895 = 23;
                } else if (var4.indexOf("10.8") != -1) {
                    this.field3895 = 24;
                } else if (var4.indexOf("10.9") != -1) {
                    this.field3895 = 25;
                } else if (var4.indexOf("10.10") != -1) {
                    this.field3895 = 26;
                } else if (var4.indexOf("10.11") != -1) {
                    this.field3895 = 27;
                }
            }
            if (var6.toLowerCase().indexOf("sun") != -1) {
                this.field3904 = 1;
            } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
                this.field3904 = 2;
            } else if (var6.toLowerCase().indexOf("apple") != -1) {
                this.field3904 = 3;
            } else if (var6.toLowerCase().indexOf("oracle") == -1) {
                this.field3904 = 4;
            } else {
                this.field3904 = 5;
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
            this.field3905 = var10;
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
            this.field3893 = var14;
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
            this.field3907 = var18;
            this.field3908 = false;
            this.field3909 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (this.field3905 > 3) {
                this.field3910 = Runtime.getRuntime().availableProcessors();
            } else {
                this.field3910 = 0;
            }
            this.field3913 = 0;
        }
        if (this.field3894 == null) {
            this.field3894 = "";
        }
        if (this.field3914 == null) {
            this.field3914 = "";
        }
        if (this.field3902 == null) {
            this.field3902 = "";
        }
        if (this.field3899 == null) {
            this.field3899 = "";
        }
        if (this.field3921 == null) {
            this.field3921 = "";
        }
        if (this.field3906 == null) {
            this.field3906 = "";
        }
        this.method5811();
    }

    @ObfuscatedName("ll.w(B)V")
    public void method5811() {
        if (this.field3894.length() > 40) {
            this.field3894 = this.field3894.substring(0, 40);
        }
        if (this.field3914.length() > 40) {
            this.field3914 = this.field3914.substring(0, 40);
        }
        if (this.field3902.length() > 10) {
            this.field3902 = this.field3902.substring(0, 10);
        }
        if (this.field3899.length() > 10) {
            this.field3899 = this.field3899.substring(0, 10);
        }
    }

    @ObfuscatedName("ll.m(Lgy;I)V")
    public void method5806(class183 arg0) {
        arg0.method3246(6);
        arg0.method3246(this.field3897);
        arg0.method3246(this.field3898 ? 1 : 0);
        arg0.method3246(this.field3895);
        arg0.method3246(this.field3904);
        arg0.method3246(this.field3905);
        arg0.method3246(this.field3893);
        arg0.method3246(this.field3907);
        arg0.method3246(this.field3908 ? 1 : 0);
        arg0.method3296(this.field3909);
        arg0.method3246(this.field3910);
        arg0.method3248(this.field3913);
        arg0.method3296(this.field3912);
        arg0.method3254(this.field3894);
        arg0.method3254(this.field3914);
        arg0.method3254(this.field3902);
        arg0.method3254(this.field3899);
        arg0.method3246(this.field3918);
        arg0.method3296(this.field3917);
        arg0.method3254(this.field3921);
        arg0.method3254(this.field3906);
        arg0.method3246(this.field3915);
        arg0.method3246(this.field3922);
        for (int var2 = 0; var2 < this.field3923.length; var2++) {
            arg0.method3249(this.field3923[var2]);
        }
        arg0.method3249(this.field3924);
    }

    @ObfuscatedName("ll.q(I)I")
    public int method5807() {
        byte var1 = 38;
        String var3 = this.field3894;
        int var4 = var3.length() + 2;
        int var5 = var1 + var4;
        String var7 = this.field3914;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field3902;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field3899;
        int var16 = var15.length() + 2;
        int var17 = var13 + var16;
        String var19 = this.field3921;
        int var20 = var19.length() + 2;
        int var21 = var17 + var20;
        String var23 = this.field3906;
        int var24 = var23.length() + 2;
        return var21 + var24;
    }
}
