package deob;

@ObfuscatedName("ao")
public abstract class class40 extends class89 {

    @ObfuscatedName("ao.ay")
    public int field864;

    @ObfuscatedName("ao.ah")
    public int field818;

    @ObfuscatedName("ao.ax")
    public int field819;

    @ObfuscatedName("ao.ar")
    public boolean field820 = false;

    @ObfuscatedName("ao.ae")
    public int field843 = 1;

    @ObfuscatedName("ao.ac")
    public int field822 = -1;

    @ObfuscatedName("ao.aw")
    public int field848 = -1;

    @ObfuscatedName("ao.am")
    public int field824 = -1;

    @ObfuscatedName("ao.aq")
    public int field825 = -1;

    @ObfuscatedName("ao.at")
    public int field826 = -1;

    @ObfuscatedName("ao.aa")
    public int field827 = -1;

    @ObfuscatedName("ao.as")
    public int field828 = -1;

    @ObfuscatedName("ao.ao")
    public int field829 = -1;

    @ObfuscatedName("ao.ai")
    public String field830 = null;

    @ObfuscatedName("ao.ap")
    public boolean field831;

    @ObfuscatedName("ao.ak")
    public boolean field832 = false;

    @ObfuscatedName("ao.ag")
    public int field833 = 100;

    @ObfuscatedName("ao.az")
    public int field817 = 0;

    @ObfuscatedName("ao.au")
    public int field835 = 0;

    @ObfuscatedName("ao.al")
    public byte field844 = 0;

    @ObfuscatedName("ao.av")
    public int[] field871 = new int[4];

    @ObfuscatedName("ao.ad")
    public int[] field838 = new int[4];

    @ObfuscatedName("ao.an")
    public int[] field839 = new int[4];

    @ObfuscatedName("ao.ab")
    public int[] field875 = new int[4];

    @ObfuscatedName("ao.bc")
    public int[] field821 = new int[4];

    @ObfuscatedName("ao.bk")
    public class206 field823 = new class206();

    @ObfuscatedName("ao.bs")
    public int field846 = -1;

    @ObfuscatedName("ao.bv")
    public boolean field878 = false;

    @ObfuscatedName("ao.ba")
    public int field845 = -1;

    @ObfuscatedName("ao.bb")
    public int field857 = -1;

    @ObfuscatedName("ao.bn")
    public int field855 = 0;

    @ObfuscatedName("ao.bo")
    public int field834 = 0;

    @ObfuscatedName("ao.bt")
    public int field849 = -1;

    @ObfuscatedName("ao.bw")
    public int field850 = 0;

    @ObfuscatedName("ao.bi")
    public int field851 = 0;

    @ObfuscatedName("ao.bh")
    public int field852 = 0;

    @ObfuscatedName("ao.bg")
    public int field853 = 0;

    @ObfuscatedName("ao.bu")
    public int field854 = -1;

    @ObfuscatedName("ao.bp")
    public int field836 = 0;

    @ObfuscatedName("ao.bd")
    public int field856 = 0;

    @ObfuscatedName("ao.bf")
    public int field847;

    @ObfuscatedName("ao.bx")
    public int field861;

    @ObfuscatedName("ao.by")
    public int field859;

    @ObfuscatedName("ao.bm")
    public int field860;

    @ObfuscatedName("ao.br")
    public int field841;

    @ObfuscatedName("ao.bz")
    public int field862;

    @ObfuscatedName("ao.bl")
    public int field867;

    @ObfuscatedName("ao.be")
    public int field842;

    @ObfuscatedName("ao.bq")
    public int field865;

    @ObfuscatedName("ao.bj")
    public int field866 = 0;

    @ObfuscatedName("ao.cn")
    public int field840 = 200;

    @ObfuscatedName("ao.cz")
    public int field874;

    @ObfuscatedName("ao.cd")
    public int field869 = 0;

    @ObfuscatedName("ao.cw")
    public int field870 = 32;

    @ObfuscatedName("ao.ci")
    public int field868 = 0;

    @ObfuscatedName("ao.cl")
    public int[] field872 = new int[10];

    @ObfuscatedName("ao.cp")
    public int[] field837 = new int[10];

    @ObfuscatedName("ao.cb")
    public byte[] field858 = new byte[10];

    @ObfuscatedName("ao.co")
    public int field873 = 0;

    @ObfuscatedName("ao.cj")
    public int field876 = 0;

    @ObfuscatedName("ao.p(I)V")
    public final void method749() {
        this.field868 = 0;
        this.field876 = 0;
    }

    @ObfuscatedName("ao.m(I)Z")
    public boolean method25() {
        return false;
    }

    @ObfuscatedName("ao.y(IIIIIII)V")
    public final void method752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field839[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class52 var13 = class52.method93(arg0);
            var11 = var13.field1115;
            var12 = var13.field1106;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field839[0];
            } else if (var11 == 1) {
                var14 = this.field838[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field839[var15] < var14) {
                        var10 = var15;
                        var14 = this.field839[var15];
                    }
                } else if (var11 == 1 && this.field838[var15] < var14) {
                    var10 = var15;
                    var14 = this.field838[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field844 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field844;
                this.field844 = (byte) ((this.field844 + 1) % 4);
                if (this.field839[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field871[var10] = arg0;
        this.field838[var10] = arg1;
        this.field875[var10] = arg2;
        this.field821[var10] = arg3;
        this.field839[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("ao.s(IIIIIII)V")
    public final void method753(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class50 var7 = (class50) class50.field1087.method3569((long) arg0);
        class50 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field1081.method3107(33, arg0);
            class50 var10 = new class50();
            if (var9 != null) {
                var10.method964(new class123(var9));
            }
            class50.field1087.method3571(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class50 var11 = var8;
        class27 var12 = null;
        class27 var13 = null;
        int var14 = var8.field1083;
        int var15 = 0;
        for (class27 var16 = (class27) this.field823.method3688(); var16 != null; var16 = (class27) this.field823.method3684()) {
            var15++;
            if (var16.field643.field1075 == var11.field1075) {
                var16.method600(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field643.field1077 <= var11.field1077) {
                var12 = var16;
            }
            if (var16.field643.field1083 > var14) {
                var13 = var16;
                var14 = var16.field643.field1083;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class27 var17 = new class27(var11);
        if (var12 == null) {
            this.field823.method3686(var17);
        } else {
            class206.method3692(var17, var12);
        }
        var17.method600(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3744();
        }
    }

    @ObfuscatedName("ao.g(IS)V")
    public final void method750(int arg0) {
        class50 var2 = class50.method2(arg0);
        for (class27 var3 = (class27) this.field823.method3688(); var3 != null; var3 = (class27) this.field823.method3684()) {
            if (var3.field643 == var2) {
                var3.method3744();
                return;
            }
        }
    }
}
