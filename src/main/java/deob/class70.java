package deob;

@ObfuscatedName("bz")
public abstract class class70 extends class136 {

    @ObfuscatedName("bz.aq")
    public int field930;

    @ObfuscatedName("bz.ad")
    public int field933;

    @ObfuscatedName("bz.ag")
    public int field944;

    @ObfuscatedName("bz.ak")
    public boolean field938 = false;

    @ObfuscatedName("bz.av")
    public int field928 = 1;

    @ObfuscatedName("bz.am")
    public int field929;

    @ObfuscatedName("bz.ab")
    public int field965 = -1;

    @ObfuscatedName("bz.ax")
    public int field925 = -1;

    @ObfuscatedName("bz.al")
    public int field932 = -1;

    @ObfuscatedName("bz.ap")
    public int field976 = -1;

    @ObfuscatedName("bz.aj")
    public int field934 = -1;

    @ObfuscatedName("bz.ae")
    public int field969 = -1;

    @ObfuscatedName("bz.au")
    public int field936 = -1;

    @ObfuscatedName("bz.ah")
    public int field937 = -1;

    @ObfuscatedName("bz.an")
    public String field948 = null;

    @ObfuscatedName("bz.af")
    public boolean field939;

    @ObfuscatedName("bz.ay")
    public boolean field940 = false;

    @ObfuscatedName("bz.az")
    public int field951 = 100;

    @ObfuscatedName("bz.ao")
    public int field942 = 0;

    @ObfuscatedName("bz.ai")
    public int field943 = 0;

    @ObfuscatedName("bz.at")
    public byte field971 = 0;

    @ObfuscatedName("bz.as")
    public int[] field953 = new int[4];

    @ObfuscatedName("bz.ba")
    public int[] field946 = new int[4];

    @ObfuscatedName("bz.bg")
    public int[] field981 = new int[4];

    @ObfuscatedName("bz.bc")
    public int[] field955 = new int[4];

    @ObfuscatedName("bz.bd")
    public int[] field945 = new int[4];

    @ObfuscatedName("bz.bx")
    public class261 field950 = new class261();

    @ObfuscatedName("bz.bl")
    public int field947 = -1;

    @ObfuscatedName("bz.bh")
    public boolean field952 = false;

    @ObfuscatedName("bz.bu")
    public int field935 = -1;

    @ObfuscatedName("bz.br")
    public int field954 = -1;

    @ObfuscatedName("bz.bq")
    public int field977 = 0;

    @ObfuscatedName("bz.bi")
    public int field956 = 0;

    @ObfuscatedName("bz.be")
    public int field957 = -1;

    @ObfuscatedName("bz.bt")
    public int field958 = 0;

    @ObfuscatedName("bz.bs")
    public int field959 = 0;

    @ObfuscatedName("bz.bj")
    public int field960 = 0;

    @ObfuscatedName("bz.bm")
    public int field961 = 0;

    @ObfuscatedName("bz.bn")
    public int field962 = -1;

    @ObfuscatedName("bz.bz")
    public int field963 = 0;

    @ObfuscatedName("bz.bo")
    public int field964 = 0;

    @ObfuscatedName("bz.bk")
    public int field974;

    @ObfuscatedName("bz.bv")
    public int field966;

    @ObfuscatedName("bz.bw")
    public int field967;

    @ObfuscatedName("bz.bb")
    public int field968;

    @ObfuscatedName("bz.bf")
    public int field980;

    @ObfuscatedName("bz.by")
    public int field970;

    @ObfuscatedName("bz.bp")
    public int field926;

    @ObfuscatedName("bz.cx")
    public int field972;

    @ObfuscatedName("bz.cv")
    public int field973;

    @ObfuscatedName("bz.ce")
    public int field941 = 0;

    @ObfuscatedName("bz.cw")
    public int field975 = 200;

    @ObfuscatedName("bz.cd")
    public int field927;

    @ObfuscatedName("bz.cn")
    public int field949 = 0;

    @ObfuscatedName("bz.cr")
    public int field978 = 32;

    @ObfuscatedName("bz.ci")
    public int field979 = 0;

    @ObfuscatedName("bz.cy")
    public int[] field924 = new int[10];

    @ObfuscatedName("bz.cl")
    public int[] field931 = new int[10];

    @ObfuscatedName("bz.co")
    public byte[] field982 = new byte[10];

    @ObfuscatedName("bz.cu")
    public int field983 = 0;

    @ObfuscatedName("bz.cz")
    public int field984 = 0;

    @ObfuscatedName("bz.bu(B)V")
    public final void method1656() {
        this.field979 = 0;
        this.field984 = 0;
    }

    @ObfuscatedName("bz.h(B)Z")
    public boolean method1163() {
        return false;
    }

    @ObfuscatedName("bz.br(IIIIIII)V")
    public final void method1653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field981[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class253 var13 = class253.method3869(arg0);
            var11 = var13.field3314;
            var12 = var13.field3315;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field981[0];
            } else if (var11 == 1) {
                var14 = this.field946[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field981[var15] < var14) {
                        var10 = var15;
                        var14 = this.field981[var15];
                    }
                } else if (var11 == 1 && this.field946[var15] < var14) {
                    var10 = var15;
                    var14 = this.field946[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field971 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field971;
                this.field971 = (byte) ((this.field971 + 1) % 4);
                if (this.field981[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field953[var10] = arg0;
        this.field946[var10] = arg1;
        this.field955[var10] = arg2;
        this.field945[var10] = arg3;
        this.field981[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bz.bq(IIIIIIB)V")
    public final void method1654(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class247 var7 = (class247) class247.field3271.method3120((long) arg0);
        class247 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3262.method3873(33, arg0);
            class247 var10 = new class247();
            if (var9 != null) {
                var10.method4173(new class300(var9));
            }
            class247.field3271.method3122(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class247 var11 = var8;
        class79 var12 = null;
        class79 var13 = null;
        int var14 = var8.field3272;
        int var15 = 0;
        for (class79 var16 = (class79) this.field950.method4509(); var16 != null; var16 = (class79) this.field950.method4506()) {
            var15++;
            if (var16.field1109.field3266 == var11.field3266) {
                var16.method1949(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1109.field3268 <= var11.field3268) {
                var12 = var16;
            }
            if (var16.field1109.field3272 > var14) {
                var13 = var16;
                var14 = var16.field1109.field3272;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class79 var17 = new class79(var11);
        if (var12 == null) {
            this.field950.method4502(var17);
        } else {
            class261.method4503(var17, var12);
        }
        var17.method1949(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3386();
        }
    }

    @ObfuscatedName("bz.bi(II)V")
    public final void method1655(int arg0) {
        class247 var2 = (class247) class247.field3271.method3120((long) arg0);
        class247 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3262.method3873(33, arg0);
            class247 var5 = new class247();
            if (var4 != null) {
                var5.method4173(new class300(var4));
            }
            class247.field3271.method3122(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class247 var6 = var3;
        for (class79 var7 = (class79) this.field950.method4509(); var7 != null; var7 = (class79) this.field950.method4506()) {
            if (var7.field1109 == var6) {
                var7.method3386();
                return;
            }
        }
    }
}
