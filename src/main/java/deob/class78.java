package deob;

@ObfuscatedName("bm")
public abstract class class78 extends class141 {

    @ObfuscatedName("bm.aw")
    public int field1155;

    @ObfuscatedName("bm.at")
    public int field1151;

    @ObfuscatedName("bm.ag")
    public int field1173;

    @ObfuscatedName("bm.ad")
    public boolean field1153 = false;

    @ObfuscatedName("bm.af")
    public int field1154 = 1;

    @ObfuscatedName("bm.az")
    public int field1150 = -1;

    @ObfuscatedName("bm.ae")
    public int field1157 = -1;

    @ObfuscatedName("bm.av")
    public int field1174 = -1;

    @ObfuscatedName("bm.am")
    public int field1169 = -1;

    @ObfuscatedName("bm.ax")
    public int field1159 = -1;

    @ObfuscatedName("bm.ah")
    public int field1176 = -1;

    @ObfuscatedName("bm.ab")
    public int field1161 = -1;

    @ObfuscatedName("bm.aj")
    public int field1162 = -1;

    @ObfuscatedName("bm.aa")
    public String field1163 = null;

    @ObfuscatedName("bm.ao")
    public boolean field1196;

    @ObfuscatedName("bm.al")
    public boolean field1165 = false;

    @ObfuscatedName("bm.ay")
    public int field1170 = 100;

    @ObfuscatedName("bm.aq")
    public int field1167 = 0;

    @ObfuscatedName("bm.ak")
    public int field1168 = 0;

    @ObfuscatedName("bm.au")
    public byte field1205 = 0;

    @ObfuscatedName("bm.an")
    public int[] field1183 = new int[4];

    @ObfuscatedName("bm.ai")
    public int[] field1171 = new int[4];

    @ObfuscatedName("bm.ap")
    public int[] field1172 = new int[4];

    @ObfuscatedName("bm.ar")
    public int[] field1184 = new int[4];

    @ObfuscatedName("bm.bg")
    public int[] field1193 = new int[4];

    @ObfuscatedName("bm.bq")
    public class203 field1158 = new class203();

    @ObfuscatedName("bm.bk")
    public int field1195 = -1;

    @ObfuscatedName("bm.by")
    public boolean field1177 = false;

    @ObfuscatedName("bm.bz")
    public int field1178 = -1;

    @ObfuscatedName("bm.bj")
    public int field1179 = -1;

    @ObfuscatedName("bm.bd")
    public int field1180 = 0;

    @ObfuscatedName("bm.bi")
    public int field1181 = 0;

    @ObfuscatedName("bm.bo")
    public int field1182 = -1;

    @ObfuscatedName("bm.bx")
    public int field1206 = 0;

    @ObfuscatedName("bm.bu")
    public int field1160 = 0;

    @ObfuscatedName("bm.bt")
    public int field1185 = 0;

    @ObfuscatedName("bm.be")
    public int field1186 = 0;

    @ObfuscatedName("bm.ba")
    public int field1187 = -1;

    @ObfuscatedName("bm.bw")
    public int field1188 = 0;

    @ObfuscatedName("bm.bp")
    public int field1189 = 0;

    @ObfuscatedName("bm.bn")
    public int field1190;

    @ObfuscatedName("bm.bl")
    public int field1191;

    @ObfuscatedName("bm.bv")
    public int field1192;

    @ObfuscatedName("bm.bs")
    public int field1175;

    @ObfuscatedName("bm.bh")
    public int field1194;

    @ObfuscatedName("bm.bf")
    public int field1207;

    @ObfuscatedName("bm.bb")
    public int field1201;

    @ObfuscatedName("bm.br")
    public int field1197;

    @ObfuscatedName("bm.bc")
    public int field1198;

    @ObfuscatedName("bm.bm")
    public int field1156 = 0;

    @ObfuscatedName("bm.cj")
    public int field1200 = 200;

    @ObfuscatedName("bm.ch")
    public int field1166;

    @ObfuscatedName("bm.ck")
    public int field1202 = 0;

    @ObfuscatedName("bm.cl")
    public int field1203 = 32;

    @ObfuscatedName("bm.cd")
    public int field1204 = 0;

    @ObfuscatedName("bm.cs")
    public int[] field1199 = new int[10];

    @ObfuscatedName("bm.cb")
    public int[] field1164 = new int[10];

    @ObfuscatedName("bm.cq")
    public byte[] field1152 = new byte[10];

    @ObfuscatedName("bm.cx")
    public int field1208 = 0;

    @ObfuscatedName("bm.cu")
    public int field1209 = 0;

    @ObfuscatedName("bm.at(I)V")
    public final void method1444() {
        this.field1204 = 0;
        this.field1209 = 0;
    }

    @ObfuscatedName("bm.s(I)Z")
    public boolean method1044() {
        return false;
    }

    @ObfuscatedName("bm.ag(IIIIIII)V")
    public final void method1434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1172[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class266 var13 = class266.method2943(arg0);
            var11 = var13.field3513;
            var12 = var13.field3504;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1172[0];
            } else if (var11 == 1) {
                var14 = this.field1171[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1172[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1172[var15];
                    }
                } else if (var11 == 1 && this.field1171[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1171[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1205 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1205;
                this.field1205 = (byte) ((this.field1205 + 1) % 4);
                if (this.field1172[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1183[var10] = arg0;
        this.field1171[var10] = arg1;
        this.field1184[var10] = arg2;
        this.field1193[var10] = arg3;
        this.field1172[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bm.ad(IIIIIII)V")
    public final void method1432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class260 var7 = (class260) class260.field3453.method3407((long) arg0);
        class260 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3456.method3931(33, arg0);
            class260 var10 = new class260();
            if (var9 != null) {
                var10.method4193(new class185(var9));
            }
            class260.field3453.method3408(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class260 var11 = var8;
        class85 var12 = null;
        class85 var13 = null;
        int var14 = var8.field3455;
        int var15 = 0;
        for (class85 var16 = (class85) this.field1158.method3442(); var16 != null; var16 = (class85) this.field1158.method3444()) {
            var15++;
            if (var16.field1289.field3457 == var11.field3457) {
                var16.method1565(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1289.field3459 <= var11.field3459) {
                var12 = var16;
            }
            if (var16.field1289.field3455 > var14) {
                var13 = var16;
                var14 = var16.field1289.field3455;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class85 var17 = new class85(var11);
        if (var12 == null) {
            this.field1158.method3439(var17);
        } else {
            class203.method3440(var17, var12);
        }
        var17.method1565(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3474();
        }
    }

    @ObfuscatedName("bm.af(II)V")
    public final void method1433(int arg0) {
        class260 var2 = (class260) class260.field3453.method3407((long) arg0);
        class260 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3456.method3931(33, arg0);
            class260 var5 = new class260();
            if (var4 != null) {
                var5.method4193(new class185(var4));
            }
            class260.field3453.method3408(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class260 var6 = var3;
        for (class85 var7 = (class85) this.field1158.method3442(); var7 != null; var7 = (class85) this.field1158.method3444()) {
            if (var7.field1289 == var6) {
                var7.method3474();
                return;
            }
        }
    }
}
