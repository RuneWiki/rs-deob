package deob;

@ObfuscatedName("bg")
public abstract class class76 extends class140 {

    @ObfuscatedName("bg.ai")
    public int field1186;

    @ObfuscatedName("bg.ab")
    public int field1210;

    @ObfuscatedName("bg.ak")
    public int field1152;

    @ObfuscatedName("bg.as")
    public boolean field1182 = false;

    @ObfuscatedName("bg.aa")
    public int field1154 = 1;

    @ObfuscatedName("bg.ah")
    public int field1155;

    @ObfuscatedName("bg.ao")
    public int field1156 = -1;

    @ObfuscatedName("bg.am")
    public int field1196 = -1;

    @ObfuscatedName("bg.aq")
    public int field1158 = -1;

    @ObfuscatedName("bg.ae")
    public int field1159 = -1;

    @ObfuscatedName("bg.af")
    public int field1173 = -1;

    @ObfuscatedName("bg.aw")
    public int field1161 = -1;

    @ObfuscatedName("bg.ax")
    public int field1162 = -1;

    @ObfuscatedName("bg.ag")
    public int field1163 = -1;

    @ObfuscatedName("bg.ay")
    public String field1153 = null;

    @ObfuscatedName("bg.ad")
    public boolean field1168;

    @ObfuscatedName("bg.at")
    public boolean field1180 = false;

    @ObfuscatedName("bg.av")
    public int field1167 = 100;

    @ObfuscatedName("bg.az")
    public int field1208 = 0;

    @ObfuscatedName("bg.aj")
    public int field1169 = 0;

    @ObfuscatedName("bg.au")
    public byte field1170 = 0;

    @ObfuscatedName("bg.an")
    public int[] field1171 = new int[4];

    @ObfuscatedName("bg.bv")
    public int[] field1172 = new int[4];

    @ObfuscatedName("bg.bw")
    public int[] field1206 = new int[4];

    @ObfuscatedName("bg.bj")
    public int[] field1151 = new int[4];

    @ObfuscatedName("bg.ba")
    public int[] field1175 = new int[4];

    @ObfuscatedName("bg.bl")
    public class216 field1176 = new class216();

    @ObfuscatedName("bg.br")
    public int field1191 = -1;

    @ObfuscatedName("bg.bh")
    public boolean field1178 = false;

    @ObfuscatedName("bg.bf")
    public int field1166 = -1;

    @ObfuscatedName("bg.bu")
    public int field1174 = -1;

    @ObfuscatedName("bg.bp")
    public int field1181 = 0;

    @ObfuscatedName("bg.bc")
    public int field1164 = 0;

    @ObfuscatedName("bg.bb")
    public int field1183 = -1;

    @ObfuscatedName("bg.bt")
    public int field1184 = 0;

    @ObfuscatedName("bg.by")
    public int field1185 = 0;

    @ObfuscatedName("bg.be")
    public int field1165 = 0;

    @ObfuscatedName("bg.bs")
    public int field1187 = 0;

    @ObfuscatedName("bg.bq")
    public int field1188 = -1;

    @ObfuscatedName("bg.bn")
    public int field1160 = 0;

    @ObfuscatedName("bg.bk")
    public int field1157 = 0;

    @ObfuscatedName("bg.bm")
    public int field1190;

    @ObfuscatedName("bg.bx")
    public int field1192;

    @ObfuscatedName("bg.bo")
    public int field1193;

    @ObfuscatedName("bg.bi")
    public int field1194;

    @ObfuscatedName("bg.bg")
    public int field1203;

    @ObfuscatedName("bg.bd")
    public int field1179;

    @ObfuscatedName("bg.bz")
    public int field1197;

    @ObfuscatedName("bg.ca")
    public int field1198;

    @ObfuscatedName("bg.ct")
    public int field1199;

    @ObfuscatedName("bg.ck")
    public int field1200 = 0;

    @ObfuscatedName("bg.cy")
    public int field1201 = 200;

    @ObfuscatedName("bg.cd")
    public int field1202;

    @ObfuscatedName("bg.cu")
    public int field1150 = 0;

    @ObfuscatedName("bg.cq")
    public int field1204 = 32;

    @ObfuscatedName("bg.cj")
    public int field1205 = 0;

    @ObfuscatedName("bg.cm")
    public int[] field1189 = new int[10];

    @ObfuscatedName("bg.cc")
    public int[] field1207 = new int[10];

    @ObfuscatedName("bg.cg")
    public byte[] field1177 = new byte[10];

    @ObfuscatedName("bg.cv")
    public int field1209 = 0;

    @ObfuscatedName("bg.ch")
    public int field1195 = 0;

    @ObfuscatedName("bg.ar(I)V")
    public final void method1455() {
        this.field1205 = 0;
        this.field1195 = 0;
    }

    @ObfuscatedName("bg.b(I)Z")
    public boolean method1052() {
        return false;
    }

    @ObfuscatedName("bg.au(IIIIIIB)V")
    public final void method1452(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1206[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class282 var13 = class282.method47(arg0);
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
                var14 = this.field1206[0];
            } else if (var11 == 1) {
                var14 = this.field1172[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1206[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1206[var15];
                    }
                } else if (var11 == 1 && this.field1172[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1172[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1170 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1170;
                this.field1170 = (byte) ((this.field1170 + 1) % 4);
                if (this.field1206[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1171[var10] = arg0;
        this.field1172[var10] = arg1;
        this.field1151[var10] = arg2;
        this.field1175[var10] = arg3;
        this.field1206[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bg.an(IIIIIIB)V")
    public final void method1451(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class276 var7 = class276.method2955(arg0);
        class84 var8 = null;
        class84 var9 = null;
        int var10 = var7.field3522;
        int var11 = 0;
        for (class84 var12 = (class84) this.field1176.method3684(); var12 != null; var12 = (class84) this.field1176.method3699()) {
            var11++;
            if (var12.field1298.field3530 == var7.field3530) {
                var12.method1680(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1298.field3521 <= var7.field3521) {
                var8 = var12;
            }
            if (var12.field1298.field3522 > var10) {
                var9 = var12;
                var10 = var12.field1298.field3522;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class84 var13 = new class84(var7);
        if (var8 == null) {
            this.field1176.method3705(var13);
        } else {
            class216.method3682(var13, var8);
        }
        var13.method1680(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3710();
        }
    }

    @ObfuscatedName("bg.bv(II)V")
    public final void method1454(int arg0) {
        class276 var2 = class276.method2955(arg0);
        for (class84 var3 = (class84) this.field1176.method3684(); var3 != null; var3 = (class84) this.field1176.method3699()) {
            if (var3.field1298 == var2) {
                var3.method3710();
                return;
            }
        }
    }
}
