package deob;

@ObfuscatedName("ao")
public abstract class class40 extends class89 {

    @ObfuscatedName("ao.as")
    public int field879;

    @ObfuscatedName("ao.ad")
    public int field837;

    @ObfuscatedName("ao.af")
    public int field838;

    @ObfuscatedName("ao.ak")
    public boolean field839 = false;

    @ObfuscatedName("ao.aq")
    public int field840 = 1;

    @ObfuscatedName("ao.an")
    public int field886 = -1;

    @ObfuscatedName("ao.ag")
    public int field863 = -1;

    @ObfuscatedName("ao.al")
    public int field843 = -1;

    @ObfuscatedName("ao.au")
    public int field860 = -1;

    @ObfuscatedName("ao.ar")
    public int field845 = -1;

    @ObfuscatedName("ao.aw")
    public int field846 = -1;

    @ObfuscatedName("ao.ah")
    public int field847 = -1;

    @ObfuscatedName("ao.ao")
    public int field844 = -1;

    @ObfuscatedName("ao.ax")
    public String field862 = null;

    @ObfuscatedName("ao.ac")
    public boolean field850;

    @ObfuscatedName("ao.ai")
    public boolean field884 = false;

    @ObfuscatedName("ao.ap")
    public int field848 = 100;

    @ObfuscatedName("ao.aa")
    public int field853 = 0;

    @ObfuscatedName("ao.ay")
    public int field892 = 0;

    @ObfuscatedName("ao.aj")
    public byte field855 = 0;

    @ObfuscatedName("ao.az")
    public int[] field878 = new int[4];

    @ObfuscatedName("ao.av")
    public int[] field849 = new int[4];

    @ObfuscatedName("ao.ae")
    public int[] field876 = new int[4];

    @ObfuscatedName("ao.at")
    public int[] field870 = new int[4];

    @ObfuscatedName("ao.bc")
    public int[] field841 = new int[4];

    @ObfuscatedName("ao.bv")
    public class206 field861 = new class206();

    @ObfuscatedName("ao.bi")
    public int field869 = -1;

    @ObfuscatedName("ao.by")
    public boolean field891 = false;

    @ObfuscatedName("ao.bu")
    public int field864 = -1;

    @ObfuscatedName("ao.bb")
    public int field865 = -1;

    @ObfuscatedName("ao.bx")
    public int field866 = 0;

    @ObfuscatedName("ao.ba")
    public int field867 = 0;

    @ObfuscatedName("ao.bq")
    public int field868 = -1;

    @ObfuscatedName("ao.bs")
    public int field854 = 0;

    @ObfuscatedName("ao.bn")
    public int field881 = 0;

    @ObfuscatedName("ao.bj")
    public int field852 = 0;

    @ObfuscatedName("ao.bp")
    public int field872 = 0;

    @ObfuscatedName("ao.bd")
    public int field873 = -1;

    @ObfuscatedName("ao.bz")
    public int field874 = 0;

    @ObfuscatedName("ao.br")
    public int field875 = 0;

    @ObfuscatedName("ao.be")
    public int field836;

    @ObfuscatedName("ao.bf")
    public int field877;

    @ObfuscatedName("ao.bt")
    public int field842;

    @ObfuscatedName("ao.bw")
    public int field859;

    @ObfuscatedName("ao.bo")
    public int field880;

    @ObfuscatedName("ao.bm")
    public int field856;

    @ObfuscatedName("ao.bk")
    public int field882;

    @ObfuscatedName("ao.bh")
    public int field883;

    @ObfuscatedName("ao.bg")
    public int field893;

    @ObfuscatedName("ao.bl")
    public int field885 = 0;

    @ObfuscatedName("ao.ca")
    public int field871 = 200;

    @ObfuscatedName("ao.cj")
    public int field887;

    @ObfuscatedName("ao.ci")
    public int field888 = 0;

    @ObfuscatedName("ao.cm")
    public int field889 = 32;

    @ObfuscatedName("ao.cc")
    public int field890 = 0;

    @ObfuscatedName("ao.cs")
    public int[] field857 = new int[10];

    @ObfuscatedName("ao.ch")
    public int[] field858 = new int[10];

    @ObfuscatedName("ao.cu")
    public byte[] field851 = new byte[10];

    @ObfuscatedName("ao.cl")
    public int field894 = 0;

    @ObfuscatedName("ao.cw")
    public int field895 = 0;

    @ObfuscatedName("ao.ad(B)V")
    public final void method752() {
        this.field890 = 0;
        this.field895 = 0;
    }

    @ObfuscatedName("ao.d(I)Z")
    public boolean method22() {
        return false;
    }

    @ObfuscatedName("ao.af(IIIIIII)V")
    public final void method753(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field876[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class52 var13 = class52.method3277(arg0);
            var11 = var13.field1122;
            var12 = var13.field1113;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field876[0];
            } else if (var11 == 1) {
                var14 = this.field849[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field876[var15] < var14) {
                        var10 = var15;
                        var14 = this.field876[var15];
                    }
                } else if (var11 == 1 && this.field849[var15] < var14) {
                    var10 = var15;
                    var14 = this.field849[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field855 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field855;
                this.field855 = (byte) ((this.field855 + 1) % 4);
                if (this.field876[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field878[var10] = arg0;
        this.field849[var10] = arg1;
        this.field870[var10] = arg2;
        this.field841[var10] = arg3;
        this.field876[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("ao.ak(IIIIIII)V")
    public final void method754(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class50 var7 = class50.method733(arg0);
        class27 var8 = null;
        class27 var9 = null;
        int var10 = var7.field1085;
        int var11 = 0;
        for (class27 var12 = (class27) this.field861.method3633(); var12 != null; var12 = (class27) this.field861.method3635()) {
            var11++;
            if (var12.field663.field1091 == var7.field1091) {
                var12.method571(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field663.field1084 <= var7.field1084) {
                var8 = var12;
            }
            if (var12.field663.field1085 > var10) {
                var9 = var12;
                var10 = var12.field663.field1085;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class27 var13 = new class27(var7);
        if (var8 == null) {
            this.field861.method3651(var13);
        } else {
            class206.method3642(var13, var8);
        }
        var13.method571(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3706();
        }
    }

    @ObfuscatedName("ao.aq(II)V")
    public final void method755(int arg0) {
        class50 var2 = class50.method733(arg0);
        for (class27 var3 = (class27) this.field861.method3633(); var3 != null; var3 = (class27) this.field861.method3635()) {
            if (var3.field663 == var2) {
                var3.method3706();
                return;
            }
        }
    }
}
