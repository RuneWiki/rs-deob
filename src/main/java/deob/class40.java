package deob;

@ObfuscatedName("au")
public abstract class class40 extends class89 {

    @ObfuscatedName("au.ah")
    public int field810;

    @ObfuscatedName("au.am")
    public int field843;

    @ObfuscatedName("au.aa")
    public int field804;

    @ObfuscatedName("au.ax")
    public boolean field861 = false;

    @ObfuscatedName("au.ac")
    public int field806 = 1;

    @ObfuscatedName("au.ar")
    public int field830 = -1;

    @ObfuscatedName("au.an")
    public int field808 = -1;

    @ObfuscatedName("au.ag")
    public int field807 = -1;

    @ObfuscatedName("au.ab")
    public int field814 = -1;

    @ObfuscatedName("au.ao")
    public int field803 = -1;

    @ObfuscatedName("au.av")
    public int field809 = -1;

    @ObfuscatedName("au.ap")
    public int field862 = -1;

    @ObfuscatedName("au.au")
    public int field813 = -1;

    @ObfuscatedName("au.ad")
    public String field815 = null;

    @ObfuscatedName("au.aj")
    public boolean field816;

    @ObfuscatedName("au.ai")
    public boolean field817 = false;

    @ObfuscatedName("au.az")
    public int field818 = 100;

    @ObfuscatedName("au.ay")
    public int field819 = 0;

    @ObfuscatedName("au.at")
    public int field820 = 0;

    @ObfuscatedName("au.aw")
    public byte field821 = 0;

    @ObfuscatedName("au.ak")
    public int[] field839 = new int[4];

    @ObfuscatedName("au.as")
    public int[] field834 = new int[4];

    @ObfuscatedName("au.aq")
    public int[] field824 = new int[4];

    @ObfuscatedName("au.af")
    public int[] field825 = new int[4];

    @ObfuscatedName("au.bp")
    public int[] field826 = new int[4];

    @ObfuscatedName("au.bh")
    public class206 field832 = new class206();

    @ObfuscatedName("au.bo")
    public int field823 = -1;

    @ObfuscatedName("au.bg")
    public boolean field829 = false;

    @ObfuscatedName("au.bk")
    public int field851 = -1;

    @ObfuscatedName("au.bw")
    public int field827 = -1;

    @ObfuscatedName("au.bj")
    public int field842 = 0;

    @ObfuscatedName("au.be")
    public int field833 = 0;

    @ObfuscatedName("au.br")
    public int field858 = -1;

    @ObfuscatedName("au.bx")
    public int field835 = 0;

    @ObfuscatedName("au.bm")
    public int field836 = 0;

    @ObfuscatedName("au.bb")
    public int field837 = 0;

    @ObfuscatedName("au.bv")
    public int field838 = 0;

    @ObfuscatedName("au.bs")
    public int field805 = -1;

    @ObfuscatedName("au.bn")
    public int field812 = 0;

    @ObfuscatedName("au.bc")
    public int field841 = 0;

    @ObfuscatedName("au.bt")
    public int field854;

    @ObfuscatedName("au.bi")
    public int field840;

    @ObfuscatedName("au.bd")
    public int field844;

    @ObfuscatedName("au.bl")
    public int field845;

    @ObfuscatedName("au.bu")
    public int field846;

    @ObfuscatedName("au.bf")
    public int field847;

    @ObfuscatedName("au.bz")
    public int field848;

    @ObfuscatedName("au.ba")
    public int field849;

    @ObfuscatedName("au.by")
    public int field850;

    @ObfuscatedName("au.bq")
    public int field802 = 0;

    @ObfuscatedName("au.cj")
    public int field852 = 200;

    @ObfuscatedName("au.cg")
    public int field853;

    @ObfuscatedName("au.cp")
    public int field811 = 0;

    @ObfuscatedName("au.ca")
    public int field855 = 32;

    @ObfuscatedName("au.ct")
    public int field856 = 0;

    @ObfuscatedName("au.cb")
    public int[] field857 = new int[10];

    @ObfuscatedName("au.cx")
    public int[] field831 = new int[10];

    @ObfuscatedName("au.ci")
    public byte[] field859 = new byte[10];

    @ObfuscatedName("au.co")
    public int field860 = 0;

    @ObfuscatedName("au.cw")
    public int field822 = 0;

    @ObfuscatedName("au.j(I)V")
    public final void method755() {
        this.field856 = 0;
        this.field822 = 0;
    }

    @ObfuscatedName("au.m(I)Z")
    public boolean method35() {
        return false;
    }

    @ObfuscatedName("au.ae(IIIIIII)V")
    public final void method757(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field824[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class52 var13 = class52.method118(arg0);
            var11 = var13.field1094;
            var12 = var13.field1085;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field824[0];
            } else if (var11 == 1) {
                var14 = this.field834[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field824[var15] < var14) {
                        var10 = var15;
                        var14 = this.field824[var15];
                    }
                } else if (var11 == 1 && this.field834[var15] < var14) {
                    var10 = var15;
                    var14 = this.field834[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field821 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field821;
                this.field821 = (byte) ((this.field821 + 1) % 4);
                if (this.field824[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field839[var10] = arg0;
        this.field834[var10] = arg1;
        this.field825[var10] = arg2;
        this.field826[var10] = arg3;
        this.field824[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("au.ah(IIIIIII)V")
    public final void method764(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class50 var7 = class50.method584(arg0);
        class27 var8 = null;
        class27 var9 = null;
        int var10 = var7.field1054;
        int var11 = 0;
        for (class27 var12 = (class27) this.field832.method3630(); var12 != null; var12 = (class27) this.field832.method3632()) {
            var11++;
            if (var12.field623.field1048 == var7.field1048) {
                var12.method602(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field623.field1053 <= var7.field1053) {
                var8 = var12;
            }
            if (var12.field623.field1054 > var10) {
                var9 = var12;
                var10 = var12.field623.field1054;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class27 var13 = new class27(var7);
        if (var8 == null) {
            this.field832.method3631(var13);
        } else {
            class206.method3626(var13, var8);
        }
        var13.method602(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3699();
        }
    }

    @ObfuscatedName("au.am(II)V")
    public final void method759(int arg0) {
        class50 var2 = class50.method584(arg0);
        for (class27 var3 = (class27) this.field832.method3630(); var3 != null; var3 = (class27) this.field832.method3632()) {
            if (var3.field623 == var2) {
                var3.method3699();
                return;
            }
        }
    }
}
