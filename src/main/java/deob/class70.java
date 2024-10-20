package deob;

@ObfuscatedName("bu")
public abstract class class70 extends class136 {

    @ObfuscatedName("bu.af")
    public int field957;

    @ObfuscatedName("bu.az")
    public int field918;

    @ObfuscatedName("bu.aj")
    public int field919;

    @ObfuscatedName("bu.an")
    public boolean field920 = false;

    @ObfuscatedName("bu.at")
    public int field921 = 1;

    @ObfuscatedName("bu.as")
    public int field974;

    @ObfuscatedName("bu.ak")
    public int field917 = -1;

    @ObfuscatedName("bu.ao")
    public int field970 = -1;

    @ObfuscatedName("bu.ac")
    public int field978 = -1;

    @ObfuscatedName("bu.ar")
    public int field929 = -1;

    @ObfuscatedName("bu.au")
    public int field933 = -1;

    @ObfuscatedName("bu.ax")
    public int field928 = -1;

    @ObfuscatedName("bu.ag")
    public int field926 = -1;

    @ObfuscatedName("bu.aa")
    public int field930 = -1;

    @ObfuscatedName("bu.ap")
    public String field931 = null;

    @ObfuscatedName("bu.aq")
    public boolean field934;

    @ObfuscatedName("bu.ay")
    public boolean field927 = false;

    @ObfuscatedName("bu.ad")
    public int field938 = 100;

    @ObfuscatedName("bu.al")
    public int field935 = 0;

    @ObfuscatedName("bu.ah")
    public int field936 = 0;

    @ObfuscatedName("bu.aw")
    public byte field951 = 0;

    @ObfuscatedName("bu.ae")
    public int[] field939 = new int[4];

    @ObfuscatedName("bu.bk")
    public int[] field940 = new int[4];

    @ObfuscatedName("bu.bw")
    public int[] field941 = new int[4];

    @ObfuscatedName("bu.bo")
    public int[] field922 = new int[4];

    @ObfuscatedName("bu.bn")
    public int[] field943 = new int[4];

    @ObfuscatedName("bu.bp")
    public class261 field944 = new class261();

    @ObfuscatedName("bu.bz")
    public int field925 = -1;

    @ObfuscatedName("bu.bh")
    public boolean field946 = false;

    @ObfuscatedName("bu.bv")
    public int field947 = -1;

    @ObfuscatedName("bu.bj")
    public int field980 = -1;

    @ObfuscatedName("bu.bq")
    public int field949 = 0;

    @ObfuscatedName("bu.by")
    public int field950 = 0;

    @ObfuscatedName("bu.bs")
    public int field924 = -1;

    @ObfuscatedName("bu.bi")
    public int field952 = 0;

    @ObfuscatedName("bu.bf")
    public int field953 = 0;

    @ObfuscatedName("bu.bd")
    public int field954 = 0;

    @ObfuscatedName("bu.br")
    public int field965 = 0;

    @ObfuscatedName("bu.bm")
    public int field956 = -1;

    @ObfuscatedName("bu.bu")
    public int field923 = 0;

    @ObfuscatedName("bu.bb")
    public int field958 = 0;

    @ObfuscatedName("bu.bl")
    public int field959;

    @ObfuscatedName("bu.bt")
    public int field960;

    @ObfuscatedName("bu.bx")
    public int field961;

    @ObfuscatedName("bu.ba")
    public int field962;

    @ObfuscatedName("bu.bg")
    public int field955;

    @ObfuscatedName("bu.be")
    public int field964;

    @ObfuscatedName("bu.bc")
    public int field942;

    @ObfuscatedName("bu.ce")
    public int field966;

    @ObfuscatedName("bu.ci")
    public int field967;

    @ObfuscatedName("bu.ck")
    public int field968 = 0;

    @ObfuscatedName("bu.cc")
    public int field969 = 200;

    @ObfuscatedName("bu.cd")
    public int field932;

    @ObfuscatedName("bu.cf")
    public int field971 = 0;

    @ObfuscatedName("bu.cw")
    public int field972 = 32;

    @ObfuscatedName("bu.cj")
    public int field973 = 0;

    @ObfuscatedName("bu.cp")
    public int[] field975 = new int[10];

    @ObfuscatedName("bu.cu")
    public int[] field945 = new int[10];

    @ObfuscatedName("bu.cm")
    public byte[] field976 = new byte[10];

    @ObfuscatedName("bu.cb")
    public int field977 = 0;

    @ObfuscatedName("bu.ch")
    public int field948 = 0;

    @ObfuscatedName("bu.aa(I)V")
    public final void method1566() {
        this.field973 = 0;
        this.field948 = 0;
    }

    @ObfuscatedName("bu.r(B)Z")
    public boolean method1073() {
        return false;
    }

    @ObfuscatedName("bu.ap(IIIIIII)V")
    public final void method1565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field941[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class253 var13 = class253.method4116(arg0);
            var11 = var13.field3324;
            var12 = var13.field3315;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field941[0];
            } else if (var11 == 1) {
                var14 = this.field940[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field941[var15] < var14) {
                        var10 = var15;
                        var14 = this.field941[var15];
                    }
                } else if (var11 == 1 && this.field940[var15] < var14) {
                    var10 = var15;
                    var14 = this.field940[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field951 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field951;
                this.field951 = (byte) ((this.field951 + 1) % 4);
                if (this.field941[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field939[var10] = arg0;
        this.field940[var10] = arg1;
        this.field922[var10] = arg2;
        this.field943[var10] = arg3;
        this.field941[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bu.aq(IIIIIIS)V")
    public final void method1563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class247 var7 = class247.method115(arg0);
        class79 var8 = null;
        class79 var9 = null;
        int var10 = var7.field3271;
        int var11 = 0;
        for (class79 var12 = (class79) this.field944.method4426(); var12 != null; var12 = (class79) this.field944.method4410()) {
            var11++;
            if (var12.field1102.field3265 == var7.field3265) {
                var12.method1849(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1102.field3261 <= var7.field3261) {
                var8 = var12;
            }
            if (var12.field1102.field3271 > var10) {
                var9 = var12;
                var10 = var12.field1102.field3271;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class79 var13 = new class79(var7);
        if (var8 == null) {
            this.field944.method4407(var13);
        } else {
            class261.method4408(var13, var8);
        }
        var13.method1849(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3304();
        }
    }

    @ObfuscatedName("bu.ay(IB)V")
    public final void method1564(int arg0) {
        class247 var2 = class247.method115(arg0);
        for (class79 var3 = (class79) this.field944.method4426(); var3 != null; var3 = (class79) this.field944.method4410()) {
            if (var3.field1102 == var2) {
                var3.method3304();
                return;
            }
        }
    }
}
