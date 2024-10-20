package deob;

@ObfuscatedName("bq")
public abstract class class75 extends class139 {

    @ObfuscatedName("bq.aj")
    public int field1133;

    @ObfuscatedName("bq.ah")
    public int field1096;

    @ObfuscatedName("bq.af")
    public int field1117;

    @ObfuscatedName("bq.ai")
    public boolean field1098 = false;

    @ObfuscatedName("bq.aq")
    public int field1099 = 1;

    @ObfuscatedName("bq.ak")
    public int field1097 = -1;

    @ObfuscatedName("bq.al")
    public int field1101 = -1;

    @ObfuscatedName("bq.as")
    public int field1102 = -1;

    @ObfuscatedName("bq.az")
    public int field1103 = -1;

    @ObfuscatedName("bq.ax")
    public int field1100 = -1;

    @ObfuscatedName("bq.ad")
    public int field1131 = -1;

    @ObfuscatedName("bq.ar")
    public int field1106 = -1;

    @ObfuscatedName("bq.ag")
    public int field1107 = -1;

    @ObfuscatedName("bq.au")
    public String field1147 = null;

    @ObfuscatedName("bq.ac")
    public boolean field1104;

    @ObfuscatedName("bq.ay")
    public boolean field1110 = false;

    @ObfuscatedName("bq.at")
    public int field1111 = 100;

    @ObfuscatedName("bq.aa")
    public int field1112 = 0;

    @ObfuscatedName("bq.aw")
    public int field1113 = 0;

    @ObfuscatedName("bq.ap")
    public byte field1114 = 0;

    @ObfuscatedName("bq.ae")
    public int[] field1115 = new int[4];

    @ObfuscatedName("bq.an")
    public int[] field1116 = new int[4];

    @ObfuscatedName("bq.bh")
    public int[] field1152 = new int[4];

    @ObfuscatedName("bq.bx")
    public int[] field1118 = new int[4];

    @ObfuscatedName("bq.bb")
    public int[] field1119 = new int[4];

    @ObfuscatedName("bq.bf")
    public class212 field1140 = new class212();

    @ObfuscatedName("bq.bp")
    public int field1139 = -1;

    @ObfuscatedName("bq.bj")
    public boolean field1122 = false;

    @ObfuscatedName("bq.bi")
    public int field1123 = -1;

    @ObfuscatedName("bq.br")
    public int field1124 = -1;

    @ObfuscatedName("bq.be")
    public int field1125 = 0;

    @ObfuscatedName("bq.bk")
    public int field1126 = 0;

    @ObfuscatedName("bq.bt")
    public int field1127 = -1;

    @ObfuscatedName("bq.bu")
    public int field1128 = 0;

    @ObfuscatedName("bq.bg")
    public int field1134 = 0;

    @ObfuscatedName("bq.bc")
    public int field1130 = 0;

    @ObfuscatedName("bq.bw")
    public int field1095 = 0;

    @ObfuscatedName("bq.ba")
    public int field1108 = -1;

    @ObfuscatedName("bq.bz")
    public int field1105 = 0;

    @ObfuscatedName("bq.bd")
    public int field1145 = 0;

    @ObfuscatedName("bq.bn")
    public int field1135;

    @ObfuscatedName("bq.bl")
    public int field1136;

    @ObfuscatedName("bq.bm")
    public int field1137;

    @ObfuscatedName("bq.by")
    public int field1138;

    @ObfuscatedName("bq.bq")
    public int field1109;

    @ObfuscatedName("bq.bo")
    public int field1120;

    @ObfuscatedName("bq.bs")
    public int field1141;

    @ObfuscatedName("bq.bv")
    public int field1142;

    @ObfuscatedName("bq.cq")
    public int field1143;

    @ObfuscatedName("bq.cu")
    public int field1144 = 0;

    @ObfuscatedName("bq.cw")
    public int field1132 = 200;

    @ObfuscatedName("bq.cd")
    public int field1146;

    @ObfuscatedName("bq.cv")
    public int field1121 = 0;

    @ObfuscatedName("bq.cg")
    public int field1148 = 32;

    @ObfuscatedName("bq.cx")
    public int field1149 = 0;

    @ObfuscatedName("bq.cn")
    public int[] field1150 = new int[10];

    @ObfuscatedName("bq.cl")
    public int[] field1151 = new int[10];

    @ObfuscatedName("bq.cc")
    public byte[] field1153 = new byte[10];

    @ObfuscatedName("bq.cm")
    public int field1129 = 0;

    @ObfuscatedName("bq.cy")
    public int field1154 = 0;

    @ObfuscatedName("bq.at(I)V")
    public final void method1502() {
        this.field1149 = 0;
        this.field1154 = 0;
    }

    @ObfuscatedName("bq.f(B)Z")
    public boolean method1096() {
        return false;
    }

    @ObfuscatedName("bq.aa(IIIIIII)V")
    public final void method1503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1152[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class275 var13 = class275.method1716(arg0);
            var11 = var13.field3513;
            var12 = var13.field3517;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1152[0];
            } else if (var11 == 1) {
                var14 = this.field1116[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1152[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1152[var15];
                    }
                } else if (var11 == 1 && this.field1116[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1116[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1114 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1114;
                this.field1114 = (byte) ((this.field1114 + 1) % 4);
                if (this.field1152[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1115[var10] = arg0;
        this.field1116[var10] = arg1;
        this.field1118[var10] = arg2;
        this.field1119[var10] = arg3;
        this.field1152[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bq.aw(IIIIIII)V")
    public final void method1505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class269 var7 = (class269) class269.field3456.method3658((long) arg0);
        class269 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3469.method4158(33, arg0);
            class269 var10 = new class269();
            if (var9 != null) {
                var10.method4437(new class194(var9));
            }
            class269.field3456.method3659(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class269 var11 = var8;
        class83 var12 = null;
        class83 var13 = null;
        int var14 = var8.field3462;
        int var15 = 0;
        for (class83 var16 = (class83) this.field1140.method3696(); var16 != null; var16 = (class83) this.field1140.method3718()) {
            var15++;
            if (var16.field1250.field3466 == var11.field3466) {
                var16.method1700(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1250.field3454 <= var11.field3454) {
                var12 = var16;
            }
            if (var16.field1250.field3462 > var14) {
                var13 = var16;
                var14 = var16.field1250.field3462;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class83 var17 = new class83(var11);
        if (var12 == null) {
            this.field1140.method3693(var17);
        } else {
            class212.method3694(var17, var12);
        }
        var17.method1700(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3726();
        }
    }

    @ObfuscatedName("bq.ab(II)V")
    public final void method1504(int arg0) {
        class269 var2 = (class269) class269.field3456.method3658((long) arg0);
        class269 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3469.method4158(33, arg0);
            class269 var5 = new class269();
            if (var4 != null) {
                var5.method4437(new class194(var4));
            }
            class269.field3456.method3659(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class269 var6 = var3;
        for (class83 var7 = (class83) this.field1140.method3696(); var7 != null; var7 = (class83) this.field1140.method3718()) {
            if (var7.field1250 == var6) {
                var7.method3726();
                return;
            }
        }
    }
}
