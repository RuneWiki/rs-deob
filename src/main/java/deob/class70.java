package deob;

@ObfuscatedName("bz")
public abstract class class70 extends class136 {

    @ObfuscatedName("bz.av")
    public int field957;

    @ObfuscatedName("bz.ar")
    public int field916;

    @ObfuscatedName("bz.ac")
    public int field917;

    @ObfuscatedName("bz.ay")
    public boolean field918 = false;

    @ObfuscatedName("bz.ah")
    public int field919 = 1;

    @ObfuscatedName("bz.ak")
    public int field937;

    @ObfuscatedName("bz.aw")
    public int field962 = -1;

    @ObfuscatedName("bz.al")
    public int field922 = -1;

    @ObfuscatedName("bz.ab")
    public int field923 = -1;

    @ObfuscatedName("bz.ae")
    public int field924 = -1;

    @ObfuscatedName("bz.at")
    public int field925 = -1;

    @ObfuscatedName("bz.ad")
    public int field915 = -1;

    @ObfuscatedName("bz.ap")
    public int field927 = -1;

    @ObfuscatedName("bz.as")
    public int field920 = -1;

    @ObfuscatedName("bz.am")
    public String field929 = null;

    @ObfuscatedName("bz.an")
    public boolean field930;

    @ObfuscatedName("bz.az")
    public boolean field931 = false;

    @ObfuscatedName("bz.au")
    public int field932 = 100;

    @ObfuscatedName("bz.ao")
    public int field974 = 0;

    @ObfuscatedName("bz.aa")
    public int field968 = 0;

    @ObfuscatedName("bz.af")
    public byte field942 = 0;

    @ObfuscatedName("bz.ai")
    public int[] field936 = new int[4];

    @ObfuscatedName("bz.ba")
    public int[] field950 = new int[4];

    @ObfuscatedName("bz.bb")
    public int[] field938 = new int[4];

    @ObfuscatedName("bz.bs")
    public int[] field939 = new int[4];

    @ObfuscatedName("bz.bq")
    public int[] field940 = new int[4];

    @ObfuscatedName("bz.bn")
    public class272 field941 = new class272();

    @ObfuscatedName("bz.bk")
    public int field933 = -1;

    @ObfuscatedName("bz.bd")
    public boolean field943 = false;

    @ObfuscatedName("bz.bc")
    public int field944 = -1;

    @ObfuscatedName("bz.bo")
    public int field945 = -1;

    @ObfuscatedName("bz.bx")
    public int field946 = 0;

    @ObfuscatedName("bz.by")
    public int field956 = 0;

    @ObfuscatedName("bz.bu")
    public int field948 = -1;

    @ObfuscatedName("bz.bm")
    public int field926 = 0;

    @ObfuscatedName("bz.bl")
    public int field971 = 0;

    @ObfuscatedName("bz.br")
    public int field947 = 0;

    @ObfuscatedName("bz.bj")
    public int field952 = 0;

    @ObfuscatedName("bz.bi")
    public int field934 = -1;

    @ObfuscatedName("bz.bz")
    public int field921 = 0;

    @ObfuscatedName("bz.bg")
    public int field928 = 0;

    @ObfuscatedName("bz.bt")
    public int field972;

    @ObfuscatedName("bz.bp")
    public int field949;

    @ObfuscatedName("bz.bf")
    public int field958;

    @ObfuscatedName("bz.bh")
    public int field959;

    @ObfuscatedName("bz.be")
    public int field960;

    @ObfuscatedName("bz.bv")
    public int field961;

    @ObfuscatedName("bz.bw")
    public int field954;

    @ObfuscatedName("bz.cr")
    public int field963;

    @ObfuscatedName("bz.cv")
    public int field964;

    @ObfuscatedName("bz.ce")
    public int field965 = 0;

    @ObfuscatedName("bz.cy")
    public int field966 = 200;

    @ObfuscatedName("bz.cs")
    public int field967;

    @ObfuscatedName("bz.cm")
    public int field955 = 0;

    @ObfuscatedName("bz.cj")
    public int field969 = 32;

    @ObfuscatedName("bz.cu")
    public int field970 = 0;

    @ObfuscatedName("bz.cb")
    public int[] field953 = new int[10];

    @ObfuscatedName("bz.ck")
    public int[] field935 = new int[10];

    @ObfuscatedName("bz.cn")
    public byte[] field973 = new byte[10];

    @ObfuscatedName("bz.cq")
    public int field951 = 0;

    @ObfuscatedName("bz.ch")
    public int field975 = 0;

    @ObfuscatedName("bz.bb(I)V")
    public final void method1537() {
        this.field970 = 0;
        this.field975 = 0;
    }

    @ObfuscatedName("bz.z(B)Z")
    public boolean method1109() {
        return false;
    }

    @ObfuscatedName("bz.bs(IIIIIII)V")
    public final void method1539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field938[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class264 var13 = class264.method1627(arg0);
            var11 = var13.field3416;
            var12 = var13.field3407;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field938[0];
            } else if (var11 == 1) {
                var14 = this.field950[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field938[var15] < var14) {
                        var10 = var15;
                        var14 = this.field938[var15];
                    }
                } else if (var11 == 1 && this.field950[var15] < var14) {
                    var10 = var15;
                    var14 = this.field950[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field942 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field942;
                this.field942 = (byte) ((this.field942 + 1) % 4);
                if (this.field938[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field936[var10] = arg0;
        this.field950[var10] = arg1;
        this.field939[var10] = arg2;
        this.field940[var10] = arg3;
        this.field938[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bz.bq(IIIIIIB)V")
    public final void method1540(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class258 var7 = (class258) class258.field3354.method3011((long) arg0);
        class258 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3366.method4156(33, arg0);
            class258 var10 = new class258();
            if (var9 != null) {
                var10.method4467(new class202(var9));
            }
            class258.field3354.method3009(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class258 var11 = var8;
        class79 var12 = null;
        class79 var13 = null;
        int var14 = var8.field3359;
        int var15 = 0;
        for (class79 var16 = (class79) this.field941.method4823(); var16 != null; var16 = (class79) this.field941.method4825()) {
            var15++;
            if (var16.field1092.field3356 == var11.field3356) {
                var16.method1820(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1092.field3358 <= var11.field3358) {
                var12 = var16;
            }
            if (var16.field1092.field3359 > var14) {
                var13 = var16;
                var14 = var16.field1092.field3359;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class79 var17 = new class79(var11);
        if (var12 == null) {
            this.field941.method4820(var17);
        } else {
            class272.method4837(var17, var12);
        }
        var17.method1820(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3306();
        }
    }

    @ObfuscatedName("bz.bn(IS)V")
    public final void method1544(int arg0) {
        class258 var2 = (class258) class258.field3354.method3011((long) arg0);
        class258 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3366.method4156(33, arg0);
            class258 var5 = new class258();
            if (var4 != null) {
                var5.method4467(new class202(var4));
            }
            class258.field3354.method3009(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class258 var6 = var3;
        for (class79 var7 = (class79) this.field941.method4823(); var7 != null; var7 = (class79) this.field941.method4825()) {
            if (var7.field1092 == var6) {
                var7.method3306();
                return;
            }
        }
    }
}
