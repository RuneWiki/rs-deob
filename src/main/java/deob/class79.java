package deob;

@ObfuscatedName("ch")
public abstract class class79 extends class142 {

    @ObfuscatedName("ch.ah")
    public int field1247;

    @ObfuscatedName("ch.az")
    public int field1200;

    @ObfuscatedName("ch.ac")
    public int field1201;

    @ObfuscatedName("ch.aq")
    public boolean field1208 = false;

    @ObfuscatedName("ch.af")
    public int field1203 = 1;

    @ObfuscatedName("ch.aj")
    public int field1204 = -1;

    @ObfuscatedName("ch.ax")
    public int field1205 = -1;

    @ObfuscatedName("ch.ad")
    public int field1206 = -1;

    @ObfuscatedName("ch.av")
    public int field1228 = -1;

    @ObfuscatedName("ch.ae")
    public int field1252 = -1;

    @ObfuscatedName("ch.ar")
    public int field1209 = -1;

    @ObfuscatedName("ch.ag")
    public int field1227 = -1;

    @ObfuscatedName("ch.at")
    public int field1211 = -1;

    @ObfuscatedName("ch.ai")
    public String field1212 = null;

    @ObfuscatedName("ch.ao")
    public boolean field1213;

    @ObfuscatedName("ch.am")
    public boolean field1214 = false;

    @ObfuscatedName("ch.ap")
    public int field1215 = 100;

    @ObfuscatedName("ch.as")
    public int field1216 = 0;

    @ObfuscatedName("ch.aw")
    public int field1217 = 0;

    @ObfuscatedName("ch.ak")
    public byte field1218 = 0;

    @ObfuscatedName("ch.aa")
    public int[] field1257 = new int[4];

    @ObfuscatedName("ch.an")
    public int[] field1220 = new int[4];

    @ObfuscatedName("ch.au")
    public int[] field1239 = new int[4];

    @ObfuscatedName("ch.ab")
    public int[] field1234 = new int[4];

    @ObfuscatedName("ch.bz")
    public int[] field1223 = new int[4];

    @ObfuscatedName("ch.bd")
    public class192 field1224 = new class192();

    @ObfuscatedName("ch.bp")
    public int field1219 = -1;

    @ObfuscatedName("ch.bf")
    public boolean field1250 = false;

    @ObfuscatedName("ch.bb")
    public int field1231 = -1;

    @ObfuscatedName("ch.bw")
    public int field1222 = -1;

    @ObfuscatedName("ch.bh")
    public int field1242 = 0;

    @ObfuscatedName("ch.bl")
    public int field1230 = 0;

    @ObfuscatedName("ch.bi")
    public int field1241 = -1;

    @ObfuscatedName("ch.bq")
    public int field1232 = 0;

    @ObfuscatedName("ch.bn")
    public int field1221 = 0;

    @ObfuscatedName("ch.bg")
    public int field1233 = 0;

    @ObfuscatedName("ch.bt")
    public int field1235 = 0;

    @ObfuscatedName("ch.bv")
    public int field1236 = -1;

    @ObfuscatedName("ch.bm")
    public int field1229 = 0;

    @ObfuscatedName("ch.bo")
    public int field1238 = 0;

    @ObfuscatedName("ch.br")
    public int field1207;

    @ObfuscatedName("ch.bs")
    public int field1240;

    @ObfuscatedName("ch.bx")
    public int field1199;

    @ObfuscatedName("ch.be")
    public int field1226;

    @ObfuscatedName("ch.bu")
    public int field1243;

    @ObfuscatedName("ch.bc")
    public int field1244;

    @ObfuscatedName("ch.bj")
    public int field1245;

    @ObfuscatedName("ch.by")
    public int field1225;

    @ObfuscatedName("ch.bk")
    public int field1202;

    @ObfuscatedName("ch.ba")
    public int field1246 = 0;

    @ObfuscatedName("ch.ch")
    public int field1249 = 200;

    @ObfuscatedName("ch.cz")
    public int field1248;

    @ObfuscatedName("ch.cb")
    public int field1251 = 0;

    @ObfuscatedName("ch.cd")
    public int field1210 = 32;

    @ObfuscatedName("ch.cp")
    public int field1253 = 0;

    @ObfuscatedName("ch.cg")
    public int[] field1254 = new int[10];

    @ObfuscatedName("ch.ca")
    public int[] field1255 = new int[10];

    @ObfuscatedName("ch.cs")
    public byte[] field1256 = new byte[10];

    @ObfuscatedName("ch.cl")
    public int field1258 = 0;

    @ObfuscatedName("ch.ck")
    public int field1237 = 0;

    @ObfuscatedName("ch.az(I)V")
    public final void method1422() {
        this.field1253 = 0;
        this.field1237 = 0;
    }

    @ObfuscatedName("ch.t(I)Z")
    public boolean method1057() {
        return false;
    }

    @ObfuscatedName("ch.ac(IIIIIII)V")
    public final void method1406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1239[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class255 var13 = class255.method2697(arg0);
            var11 = var13.field3423;
            var12 = var13.field3427;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1239[0];
            } else if (var11 == 1) {
                var14 = this.field1220[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1239[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1239[var15];
                    }
                } else if (var11 == 1 && this.field1220[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1220[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1218 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1218;
                this.field1218 = (byte) ((this.field1218 + 1) % 4);
                if (this.field1239[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1257[var10] = arg0;
        this.field1220[var10] = arg1;
        this.field1234[var10] = arg2;
        this.field1223[var10] = arg3;
        this.field1239[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("ch.aq(IIIIIII)V")
    public final void method1407(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class249 var7 = Statics.method157(arg0);
        class86 var8 = null;
        class86 var9 = null;
        int var10 = var7.field3359;
        int var11 = 0;
        for (class86 var12 = (class86) this.field1224.method3336(); var12 != null; var12 = (class86) this.field1224.method3341()) {
            var11++;
            if (var12.field1344.field3355 == var7.field3355) {
                var12.method1570(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1344.field3358 <= var7.field3358) {
                var8 = var12;
            }
            if (var12.field1344.field3359 > var10) {
                var9 = var12;
                var10 = var12.field1344.field3359;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class86 var13 = new class86(var7);
        if (var8 == null) {
            this.field1224.method3335(var13);
        } else {
            class192.method3343(var13, var8);
        }
        var13.method1570(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3364();
        }
    }

    @ObfuscatedName("ch.af(IB)V")
    public final void method1408(int arg0) {
        class249 var2 = Statics.method157(arg0);
        for (class86 var3 = (class86) this.field1224.method3336(); var3 != null; var3 = (class86) this.field1224.method3341()) {
            if (var3.field1344 == var2) {
                var3.method3364();
                return;
            }
        }
    }
}
