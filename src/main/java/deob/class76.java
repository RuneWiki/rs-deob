package deob;

@ObfuscatedName("ba")
public abstract class class76 extends class140 {

    @ObfuscatedName("ba.at")
    public int field1211;

    @ObfuscatedName("ba.ac")
    public int field1188;

    @ObfuscatedName("ba.al")
    public int field1161;

    @ObfuscatedName("ba.ah")
    public boolean field1160 = false;

    @ObfuscatedName("ba.af")
    public int field1173 = 1;

    @ObfuscatedName("ba.aq")
    public int field1162;

    @ObfuscatedName("ba.ai")
    public int field1202 = -1;

    @ObfuscatedName("ba.az")
    public int field1164 = -1;

    @ObfuscatedName("ba.aa")
    public int field1165 = -1;

    @ObfuscatedName("ba.av")
    public int field1166 = -1;

    @ObfuscatedName("ba.am")
    public int field1210 = -1;

    @ObfuscatedName("ba.ao")
    public int field1168 = -1;

    @ObfuscatedName("ba.ax")
    public int field1178 = -1;

    @ObfuscatedName("ba.ad")
    public int field1170 = -1;

    @ObfuscatedName("ba.au")
    public String field1171 = null;

    @ObfuscatedName("ba.ar")
    public boolean field1169;

    @ObfuscatedName("ba.an")
    public boolean field1158 = false;

    @ObfuscatedName("ba.ae")
    public int field1174 = 100;

    @ObfuscatedName("ba.aw")
    public int field1175 = 0;

    @ObfuscatedName("ba.ak")
    public int field1176 = 0;

    @ObfuscatedName("ba.aj")
    public byte field1177 = 0;

    @ObfuscatedName("ba.ay")
    public int[] field1181 = new int[4];

    @ObfuscatedName("ba.bm")
    public int[] field1179 = new int[4];

    @ObfuscatedName("ba.bx")
    public int[] field1180 = new int[4];

    @ObfuscatedName("ba.bl")
    public int[] field1184 = new int[4];

    @ObfuscatedName("ba.bf")
    public int[] field1182 = new int[4];

    @ObfuscatedName("ba.bp")
    public class216 field1183 = new class216();

    @ObfuscatedName("ba.bs")
    public int field1207 = -1;

    @ObfuscatedName("ba.bu")
    public boolean field1157 = false;

    @ObfuscatedName("ba.br")
    public int field1186 = -1;

    @ObfuscatedName("ba.bk")
    public int field1187 = -1;

    @ObfuscatedName("ba.bn")
    public int field1163 = 0;

    @ObfuscatedName("ba.bj")
    public int field1189 = 0;

    @ObfuscatedName("ba.bo")
    public int field1190 = -1;

    @ObfuscatedName("ba.be")
    public int field1191 = 0;

    @ObfuscatedName("ba.bq")
    public int field1216 = 0;

    @ObfuscatedName("ba.bh")
    public int field1192 = 0;

    @ObfuscatedName("ba.bt")
    public int field1194 = 0;

    @ObfuscatedName("ba.bi")
    public int field1195 = -1;

    @ObfuscatedName("ba.bc")
    public int field1196 = 0;

    @ObfuscatedName("ba.bv")
    public int field1197 = 0;

    @ObfuscatedName("ba.by")
    public int field1198;

    @ObfuscatedName("ba.bz")
    public int field1199;

    @ObfuscatedName("ba.bw")
    public int field1204;

    @ObfuscatedName("ba.bb")
    public int field1201;

    @ObfuscatedName("ba.ba")
    public int field1200;

    @ObfuscatedName("ba.bd")
    public int field1203;

    @ObfuscatedName("ba.bg")
    public int field1167;

    @ObfuscatedName("ba.cd")
    public int field1205;

    @ObfuscatedName("ba.cf")
    public int field1172;

    @ObfuscatedName("ba.ce")
    public int field1193 = 0;

    @ObfuscatedName("ba.cl")
    public int field1208 = 200;

    @ObfuscatedName("ba.cg")
    public int field1209;

    @ObfuscatedName("ba.cb")
    public int field1185 = 0;

    @ObfuscatedName("ba.cv")
    public int field1206 = 32;

    @ObfuscatedName("ba.ck")
    public int field1212 = 0;

    @ObfuscatedName("ba.cu")
    public int[] field1213 = new int[10];

    @ObfuscatedName("ba.cm")
    public int[] field1214 = new int[10];

    @ObfuscatedName("ba.cw")
    public byte[] field1215 = new byte[10];

    @ObfuscatedName("ba.ci")
    public int field1159 = 0;

    @ObfuscatedName("ba.cx")
    public int field1217 = 0;

    @ObfuscatedName("ba.ay(I)V")
    public final void method1512() {
        this.field1212 = 0;
        this.field1217 = 0;
    }

    @ObfuscatedName("ba.v(I)Z")
    public boolean method1084() {
        return false;
    }

    @ObfuscatedName("ba.bm(IIIIIII)V")
    public final void method1514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1180[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class282 var13 = class282.method3145(arg0);
            var11 = var13.field3589;
            var12 = var13.field3576;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1180[0];
            } else if (var11 == 1) {
                var14 = this.field1179[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1180[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1180[var15];
                    }
                } else if (var11 == 1 && this.field1179[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1179[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1177 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1177;
                this.field1177 = (byte) ((this.field1177 + 1) % 4);
                if (this.field1180[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1181[var10] = arg0;
        this.field1179[var10] = arg1;
        this.field1184[var10] = arg2;
        this.field1182[var10] = arg3;
        this.field1180[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("ba.bx(IIIIIIB)V")
    public final void method1515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class276 var7 = (class276) class276.field3525.method3601((long) arg0);
        class276 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3533.method4241(33, arg0);
            class276 var10 = new class276();
            if (var9 != null) {
                var10.method4474(new class195(var9));
            }
            class276.field3525.method3603(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class276 var11 = var8;
        class84 var12 = null;
        class84 var13 = null;
        int var14 = var8.field3530;
        int var15 = 0;
        for (class84 var16 = (class84) this.field1183.method3655(); var16 != null; var16 = (class84) this.field1183.method3657()) {
            var15++;
            if (var16.field1307.field3527 == var11.field3527) {
                var16.method1710(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1307.field3537 <= var11.field3537) {
                var12 = var16;
            }
            if (var16.field1307.field3530 > var14) {
                var13 = var16;
                var14 = var16.field1307.field3530;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class84 var17 = new class84(var11);
        if (var12 == null) {
            this.field1183.method3656(var17);
        } else {
            class216.method3668(var17, var12);
        }
        var17.method1710(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3681();
        }
    }

    @ObfuscatedName("ba.bl(IB)V")
    public final void method1516(int arg0) {
        class276 var2 = (class276) class276.field3525.method3601((long) arg0);
        class276 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3533.method4241(33, arg0);
            class276 var5 = new class276();
            if (var4 != null) {
                var5.method4474(new class195(var4));
            }
            class276.field3525.method3603(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class276 var6 = var3;
        for (class84 var7 = (class84) this.field1183.method3655(); var7 != null; var7 = (class84) this.field1183.method3657()) {
            if (var7.field1307 == var6) {
                var7.method3681();
                return;
            }
        }
    }
}
