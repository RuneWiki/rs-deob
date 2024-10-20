package deob;

@ObfuscatedName("bm")
public abstract class class76 extends class140 {

    @ObfuscatedName("bm.ac")
    public int field1154;

    @ObfuscatedName("bm.ag")
    public int field1148;

    @ObfuscatedName("bm.ay")
    public int field1182;

    @ObfuscatedName("bm.as")
    public boolean field1143 = false;

    @ObfuscatedName("bm.av")
    public int field1144 = 1;

    @ObfuscatedName("bm.ao")
    public int field1145;

    @ObfuscatedName("bm.ak")
    public int field1146 = -1;

    @ObfuscatedName("bm.ad")
    public int field1190 = -1;

    @ObfuscatedName("bm.az")
    public int field1158 = -1;

    @ObfuscatedName("bm.aa")
    public int field1149 = -1;

    @ObfuscatedName("bm.ab")
    public int field1150 = -1;

    @ObfuscatedName("bm.al")
    public int field1151 = -1;

    @ObfuscatedName("bm.af")
    public int field1181 = -1;

    @ObfuscatedName("bm.ah")
    public int field1153 = -1;

    @ObfuscatedName("bm.au")
    public String field1195 = null;

    @ObfuscatedName("bm.ap")
    public boolean field1192;

    @ObfuscatedName("bm.at")
    public boolean field1156 = false;

    @ObfuscatedName("bm.am")
    public int field1157 = 100;

    @ObfuscatedName("bm.an")
    public int field1160 = 0;

    @ObfuscatedName("bm.ae")
    public int field1159 = 0;

    @ObfuscatedName("bm.ar")
    public byte field1147 = 0;

    @ObfuscatedName("bm.aq")
    public int[] field1161 = new int[4];

    @ObfuscatedName("bm.bq")
    public int[] field1155 = new int[4];

    @ObfuscatedName("bm.bi")
    public int[] field1171 = new int[4];

    @ObfuscatedName("bm.bo")
    public int[] field1164 = new int[4];

    @ObfuscatedName("bm.bj")
    public int[] field1165 = new int[4];

    @ObfuscatedName("bm.bw")
    public class216 field1166 = new class216();

    @ObfuscatedName("bm.bp")
    public int field1167 = -1;

    @ObfuscatedName("bm.bh")
    public boolean field1168 = false;

    @ObfuscatedName("bm.bz")
    public int field1169 = -1;

    @ObfuscatedName("bm.bl")
    public int field1170 = -1;

    @ObfuscatedName("bm.bb")
    public int field1200 = 0;

    @ObfuscatedName("bm.ba")
    public int field1172 = 0;

    @ObfuscatedName("bm.bk")
    public int field1173 = -1;

    @ObfuscatedName("bm.br")
    public int field1174 = 0;

    @ObfuscatedName("bm.bc")
    public int field1141 = 0;

    @ObfuscatedName("bm.bf")
    public int field1176 = 0;

    @ObfuscatedName("bm.bt")
    public int field1177 = 0;

    @ObfuscatedName("bm.bs")
    public int field1142 = -1;

    @ObfuscatedName("bm.bg")
    public int field1163 = 0;

    @ObfuscatedName("bm.bn")
    public int field1180 = 0;

    @ObfuscatedName("bm.bu")
    public int field1162;

    @ObfuscatedName("bm.bd")
    public int field1188;

    @ObfuscatedName("bm.by")
    public int field1183;

    @ObfuscatedName("bm.be")
    public int field1175;

    @ObfuscatedName("bm.bm")
    public int field1185;

    @ObfuscatedName("bm.bv")
    public int field1186;

    @ObfuscatedName("bm.bx")
    public int field1187;

    @ObfuscatedName("bm.ce")
    public int field1140;

    @ObfuscatedName("bm.cj")
    public int field1189;

    @ObfuscatedName("bm.cv")
    public int field1184 = 0;

    @ObfuscatedName("bm.ca")
    public int field1191 = 200;

    @ObfuscatedName("bm.cp")
    public int field1152;

    @ObfuscatedName("bm.cf")
    public int field1178 = 0;

    @ObfuscatedName("bm.cy")
    public int field1194 = 32;

    @ObfuscatedName("bm.cu")
    public int field1199 = 0;

    @ObfuscatedName("bm.ck")
    public int[] field1196 = new int[10];

    @ObfuscatedName("bm.cm")
    public int[] field1197 = new int[10];

    @ObfuscatedName("bm.cg")
    public byte[] field1198 = new byte[10];

    @ObfuscatedName("bm.cn")
    public int field1193 = 0;

    @ObfuscatedName("bm.cc")
    public int field1179 = 0;

    @ObfuscatedName("bm.bq(I)V")
    public final void method1591() {
        this.field1199 = 0;
        this.field1179 = 0;
    }

    @ObfuscatedName("bm.p(B)Z")
    public boolean method1123() {
        return false;
    }

    @ObfuscatedName("bm.bi(IIIIIII)V")
    public final void method1587(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1171[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class282 var13 = class282.method4262(arg0);
            var11 = var13.field3586;
            var12 = var13.field3581;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1171[0];
            } else if (var11 == 1) {
                var14 = this.field1155[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1171[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1171[var15];
                    }
                } else if (var11 == 1 && this.field1155[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1155[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1147 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1147;
                this.field1147 = (byte) ((this.field1147 + 1) % 4);
                if (this.field1171[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1161[var10] = arg0;
        this.field1155[var10] = arg1;
        this.field1164[var10] = arg2;
        this.field1165[var10] = arg3;
        this.field1171[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bm.bo(IIIIIII)V")
    public final void method1590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class276 var7 = (class276) class276.field3525.method3706((long) arg0);
        class276 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3527.method4294(33, arg0);
            class276 var10 = new class276();
            if (var9 != null) {
                var10.method4566(new class195(var9));
            }
            class276.field3525.method3712(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class276 var11 = var8;
        class84 var12 = null;
        class84 var13 = null;
        int var14 = var8.field3530;
        int var15 = 0;
        for (class84 var16 = (class84) this.field1166.method3767(); var16 != null; var16 = (class84) this.field1166.method3765()) {
            var15++;
            if (var16.field1292.field3536 == var11.field3536) {
                var16.method1802(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1292.field3529 <= var11.field3529) {
                var12 = var16;
            }
            if (var16.field1292.field3530 > var14) {
                var13 = var16;
                var14 = var16.field1292.field3530;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class84 var17 = new class84(var11);
        if (var12 == null) {
            this.field1166.method3760(var17);
        } else {
            class216.method3762(var17, var12);
        }
        var17.method1802(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3796();
        }
    }

    @ObfuscatedName("bm.bj(II)V")
    public final void method1588(int arg0) {
        class276 var2 = (class276) class276.field3525.method3706((long) arg0);
        class276 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3527.method4294(33, arg0);
            class276 var5 = new class276();
            if (var4 != null) {
                var5.method4566(new class195(var4));
            }
            class276.field3525.method3712(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class276 var6 = var3;
        for (class84 var7 = (class84) this.field1166.method3767(); var7 != null; var7 = (class84) this.field1166.method3765()) {
            if (var7.field1292 == var6) {
                var7.method3796();
                return;
            }
        }
    }
}
