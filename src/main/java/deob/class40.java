package deob;

@ObfuscatedName("aw")
public abstract class class40 extends class89 {

    @ObfuscatedName("aw.an")
    public boolean field892 = false;

    @ObfuscatedName("aw.ap")
    public int field865;

    @ObfuscatedName("aw.ar")
    public int field832;

    @ObfuscatedName("aw.ab")
    public int field833;

    @ObfuscatedName("aw.ai")
    public int field859 = 1;

    @ObfuscatedName("aw.aa")
    public int field848 = -1;

    @ObfuscatedName("aw.ax")
    public int field877 = -1;

    @ObfuscatedName("aw.ad")
    public int field838 = -1;

    @ObfuscatedName("aw.av")
    public int field840 = -1;

    @ObfuscatedName("aw.aq")
    public int field879 = -1;

    @ObfuscatedName("aw.af")
    public int field841 = -1;

    @ObfuscatedName("aw.at")
    public int field842 = -1;

    @ObfuscatedName("aw.aw")
    public int field843 = -1;

    @ObfuscatedName("aw.ay")
    public String field844 = null;

    @ObfuscatedName("aw.ah")
    public boolean field845;

    @ObfuscatedName("aw.al")
    public boolean field831 = false;

    @ObfuscatedName("aw.as")
    public int field891 = 100;

    @ObfuscatedName("aw.ac")
    public int field834 = 0;

    @ObfuscatedName("aw.ao")
    public int field890 = 0;

    @ObfuscatedName("aw.am")
    public byte field850 = 0;

    @ObfuscatedName("aw.ag")
    public int[] field851 = new int[4];

    @ObfuscatedName("aw.az")
    public int[] field849 = new int[4];

    @ObfuscatedName("aw.ak")
    public int[] field846 = new int[4];

    @ObfuscatedName("aw.ae")
    public int[] field854 = new int[4];

    @ObfuscatedName("aw.br")
    public int[] field855 = new int[4];

    @ObfuscatedName("aw.bi")
    public class206 field856 = new class206();

    @ObfuscatedName("aw.bx")
    public int field857 = -1;

    @ObfuscatedName("aw.bs")
    public boolean field858 = false;

    @ObfuscatedName("aw.bt")
    public int field868 = -1;

    @ObfuscatedName("aw.bh")
    public int field860 = -1;

    @ObfuscatedName("aw.be")
    public int field861 = 0;

    @ObfuscatedName("aw.bq")
    public int field862 = 0;

    @ObfuscatedName("aw.bo")
    public int field885 = -1;

    @ObfuscatedName("aw.bm")
    public int field864 = 0;

    @ObfuscatedName("aw.by")
    public int field863 = 0;

    @ObfuscatedName("aw.ba")
    public int field866 = 0;

    @ObfuscatedName("aw.bc")
    public int field867 = 0;

    @ObfuscatedName("aw.bn")
    public int field835 = -1;

    @ObfuscatedName("aw.bz")
    public int field869 = 0;

    @ObfuscatedName("aw.bg")
    public int field870 = 0;

    @ObfuscatedName("aw.bf")
    public int field871;

    @ObfuscatedName("aw.bp")
    public int field872;

    @ObfuscatedName("aw.bu")
    public int field873;

    @ObfuscatedName("aw.bl")
    public int field874;

    @ObfuscatedName("aw.bv")
    public int field875;

    @ObfuscatedName("aw.bd")
    public int field837;

    @ObfuscatedName("aw.bk")
    public int field853;

    @ObfuscatedName("aw.bb")
    public int field878;

    @ObfuscatedName("aw.bj")
    public int field847;

    @ObfuscatedName("aw.bw")
    public int field880 = 0;

    @ObfuscatedName("aw.cc")
    public int field881 = 200;

    @ObfuscatedName("aw.cx")
    public int field882;

    @ObfuscatedName("aw.ct")
    public int field883 = 0;

    @ObfuscatedName("aw.cz")
    public int field884 = 32;

    @ObfuscatedName("aw.cg")
    public int field876 = 0;

    @ObfuscatedName("aw.cf")
    public int[] field886 = new int[10];

    @ObfuscatedName("aw.cr")
    public int[] field887 = new int[10];

    @ObfuscatedName("aw.cb")
    public byte[] field888 = new byte[10];

    @ObfuscatedName("aw.ch")
    public int field889 = 0;

    @ObfuscatedName("aw.cl")
    public int field852 = 0;

    @ObfuscatedName("aw.c(I)V")
    public final void method740() {
        this.field876 = 0;
        this.field852 = 0;
    }

    @ObfuscatedName("aw.j(B)Z")
    public boolean method20() {
        return false;
    }

    @ObfuscatedName("aw.z(IIIIIII)V")
    public final void method742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field846[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class52 var13 = class52.method176(arg0);
            var11 = var13.field1123;
            var12 = var13.field1128;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field846[0];
            } else if (var11 == 1) {
                var14 = this.field849[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field846[var15] < var14) {
                        var10 = var15;
                        var14 = this.field846[var15];
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
                this.field850 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field850;
                this.field850 = (byte) ((this.field850 + 1) % 4);
                if (this.field846[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field851[var10] = arg0;
        this.field849[var10] = arg1;
        this.field854[var10] = arg2;
        this.field855[var10] = arg3;
        this.field846[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("aw.n(IIIIIII)V")
    public final void method743(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class50 var7 = class50.method3215(arg0);
        class27 var8 = null;
        class27 var9 = null;
        int var10 = var7.field1093;
        int var11 = 0;
        for (class27 var12 = (class27) this.field856.method3660(); var12 != null; var12 = (class27) this.field856.method3675()) {
            var11++;
            if (var12.field636.field1091 == var7.field1091) {
                var12.method595(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field636.field1092 <= var7.field1092) {
                var8 = var12;
            }
            if (var12.field636.field1093 > var10) {
                var9 = var12;
                var10 = var12.field636.field1093;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class27 var13 = new class27(var7);
        if (var8 == null) {
            this.field856.method3657(var13);
        } else {
            class206.method3662(var13, var8);
        }
        var13.method595(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3729();
        }
    }

    @ObfuscatedName("aw.q(II)V")
    public final void method744(int arg0) {
        class50 var2 = class50.method3215(arg0);
        for (class27 var3 = (class27) this.field856.method3660(); var3 != null; var3 = (class27) this.field856.method3675()) {
            if (var3.field636 == var2) {
                var3.method3729();
                return;
            }
        }
    }
}
