package deob;

@ObfuscatedName("bk")
public abstract class class76 extends class140 {

    @ObfuscatedName("bk.aw")
    public int field1186;

    @ObfuscatedName("bk.as")
    public int field1151;

    @ObfuscatedName("bk.au")
    public int field1183;

    @ObfuscatedName("bk.al")
    public boolean field1142 = false;

    @ObfuscatedName("bk.af")
    public int field1194 = 1;

    @ObfuscatedName("bk.ai")
    public int field1144;

    @ObfuscatedName("bk.az")
    public int field1181 = -1;

    @ObfuscatedName("bk.aq")
    public int field1146 = -1;

    @ObfuscatedName("bk.ae")
    public int field1149 = -1;

    @ObfuscatedName("bk.ad")
    public int field1164 = -1;

    @ObfuscatedName("bk.ar")
    public int field1140 = -1;

    @ObfuscatedName("bk.ao")
    public int field1150 = -1;

    @ObfuscatedName("bk.at")
    public int field1148 = -1;

    @ObfuscatedName("bk.ag")
    public int field1152 = -1;

    @ObfuscatedName("bk.an")
    public String field1153 = null;

    @ObfuscatedName("bk.ax")
    public boolean field1154;

    @ObfuscatedName("bk.ah")
    public boolean field1155 = false;

    @ObfuscatedName("bk.ab")
    public int field1156 = 100;

    @ObfuscatedName("bk.am")
    public int field1157 = 0;

    @ObfuscatedName("bk.ay")
    public int field1197 = 0;

    @ObfuscatedName("bk.aa")
    public byte field1159 = 0;

    @ObfuscatedName("bk.av")
    public int[] field1145 = new int[4];

    @ObfuscatedName("bk.bc")
    public int[] field1161 = new int[4];

    @ObfuscatedName("bk.br")
    public int[] field1162 = new int[4];

    @ObfuscatedName("bk.by")
    public int[] field1163 = new int[4];

    @ObfuscatedName("bk.bl")
    public int[] field1166 = new int[4];

    @ObfuscatedName("bk.bs")
    public class216 field1165 = new class216();

    @ObfuscatedName("bk.bu")
    public int field1139 = -1;

    @ObfuscatedName("bk.bz")
    public boolean field1167 = false;

    @ObfuscatedName("bk.bt")
    public int field1143 = -1;

    @ObfuscatedName("bk.bm")
    public int field1169 = -1;

    @ObfuscatedName("bk.bf")
    public int field1170 = 0;

    @ObfuscatedName("bk.bj")
    public int field1171 = 0;

    @ObfuscatedName("bk.bx")
    public int field1172 = -1;

    @ObfuscatedName("bk.be")
    public int field1173 = 0;

    @ObfuscatedName("bk.bn")
    public int field1174 = 0;

    @ObfuscatedName("bk.bw")
    public int field1175 = 0;

    @ObfuscatedName("bk.bg")
    public int field1176 = 0;

    @ObfuscatedName("bk.bi")
    public int field1177 = -1;

    @ObfuscatedName("bk.bb")
    public int field1178 = 0;

    @ObfuscatedName("bk.bv")
    public int field1179 = 0;

    @ObfuscatedName("bk.ba")
    public int field1180;

    @ObfuscatedName("bk.bd")
    public int field1158;

    @ObfuscatedName("bk.bp")
    public int field1168;

    @ObfuscatedName("bk.bh")
    public int field1182;

    @ObfuscatedName("bk.bk")
    public int field1147;

    @ObfuscatedName("bk.bo")
    public int field1185;

    @ObfuscatedName("bk.bq")
    public int field1189;

    @ObfuscatedName("bk.cg")
    public int field1187;

    @ObfuscatedName("bk.cd")
    public int field1188;

    @ObfuscatedName("bk.cl")
    public int field1141 = 0;

    @ObfuscatedName("bk.co")
    public int field1190 = 200;

    @ObfuscatedName("bk.cs")
    public int field1191;

    @ObfuscatedName("bk.ci")
    public int field1192 = 0;

    @ObfuscatedName("bk.cu")
    public int field1184 = 32;

    @ObfuscatedName("bk.ce")
    public int field1193 = 0;

    @ObfuscatedName("bk.ck")
    public int[] field1195 = new int[10];

    @ObfuscatedName("bk.cc")
    public int[] field1196 = new int[10];

    @ObfuscatedName("bk.cn")
    public byte[] field1160 = new byte[10];

    @ObfuscatedName("bk.cj")
    public int field1198 = 0;

    @ObfuscatedName("bk.cx")
    public int field1199 = 0;

    @ObfuscatedName("bk.ay(B)V")
    public final void method1504() {
        this.field1193 = 0;
        this.field1199 = 0;
    }

    @ObfuscatedName("bk.u(I)Z")
    public boolean method1048() {
        return false;
    }

    @ObfuscatedName("bk.aj(IIIIIII)V")
    public final void method1505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1162[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class282 var13 = class282.method4257(arg0);
            var11 = var13.field3582;
            var12 = var13.field3573;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1162[0];
            } else if (var11 == 1) {
                var14 = this.field1161[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1162[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1162[var15];
                    }
                } else if (var11 == 1 && this.field1161[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1161[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1159 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1159;
                this.field1159 = (byte) ((this.field1159 + 1) % 4);
                if (this.field1162[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1145[var10] = arg0;
        this.field1161[var10] = arg1;
        this.field1163[var10] = arg2;
        this.field1166[var10] = arg3;
        this.field1162[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bk.aa(IIIIIIS)V")
    public final void method1506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class276 var7 = (class276) class276.field3528.method3707((long) arg0);
        class276 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3516.method4273(33, arg0);
            class276 var10 = new class276();
            if (var9 != null) {
                var10.method4586(new class195(var9));
            }
            class276.field3528.method3697(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class276 var11 = var8;
        class84 var12 = null;
        class84 var13 = null;
        int var14 = var8.field3527;
        int var15 = 0;
        for (class84 var16 = (class84) this.field1165.method3762(); var16 != null; var16 = (class84) this.field1165.method3756()) {
            var15++;
            if (var16.field1287.field3519 == var11.field3519) {
                var16.method1714(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1287.field3522 <= var11.field3522) {
                var12 = var16;
            }
            if (var16.field1287.field3527 > var14) {
                var13 = var16;
                var14 = var16.field1287.field3527;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class84 var17 = new class84(var11);
        if (var12 == null) {
            this.field1165.method3751(var17);
        } else {
            class216.method3752(var17, var12);
        }
        var17.method1714(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3785();
        }
    }

    @ObfuscatedName("bk.av(IB)V")
    public final void method1507(int arg0) {
        class276 var2 = (class276) class276.field3528.method3707((long) arg0);
        class276 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3516.method4273(33, arg0);
            class276 var5 = new class276();
            if (var4 != null) {
                var5.method4586(new class195(var4));
            }
            class276.field3528.method3697(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class276 var6 = var3;
        for (class84 var7 = (class84) this.field1165.method3762(); var7 != null; var7 = (class84) this.field1165.method3756()) {
            if (var7.field1287 == var6) {
                var7.method3785();
                return;
            }
        }
    }
}
