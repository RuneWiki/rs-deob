package deob;

@ObfuscatedName("bs")
public abstract class class77 extends class140 {

    @ObfuscatedName("bs.ai")
    public int field1243;

    @ObfuscatedName("bs.ah")
    public int field1209;

    @ObfuscatedName("bs.ab")
    public int field1210;

    @ObfuscatedName("bs.ad")
    public boolean field1211 = false;

    @ObfuscatedName("bs.ag")
    public int field1212 = 1;

    @ObfuscatedName("bs.as")
    public int field1249 = -1;

    @ObfuscatedName("bs.af")
    public int field1267 = -1;

    @ObfuscatedName("bs.aq")
    public int field1214 = -1;

    @ObfuscatedName("bs.am")
    public int field1216 = -1;

    @ObfuscatedName("bs.az")
    public int field1261 = -1;

    @ObfuscatedName("bs.av")
    public int field1218 = -1;

    @ObfuscatedName("bs.an")
    public int field1219 = -1;

    @ObfuscatedName("bs.ar")
    public int field1220 = -1;

    @ObfuscatedName("bs.aa")
    public String field1221 = null;

    @ObfuscatedName("bs.aj")
    public boolean field1222;

    @ObfuscatedName("bs.ap")
    public boolean field1223 = false;

    @ObfuscatedName("bs.ao")
    public int field1224 = 100;

    @ObfuscatedName("bs.at")
    public int field1225 = 0;

    @ObfuscatedName("bs.aw")
    public int field1226 = 0;

    @ObfuscatedName("bs.ac")
    public byte field1227 = 0;

    @ObfuscatedName("bs.au")
    public int[] field1246 = new int[4];

    @ObfuscatedName("bs.al")
    public int[] field1229 = new int[4];

    @ObfuscatedName("bs.ay")
    public int[] field1238 = new int[4];

    @ObfuscatedName("bs.ak")
    public int[] field1231 = new int[4];

    @ObfuscatedName("bs.bj")
    public int[] field1232 = new int[4];

    @ObfuscatedName("bs.bf")
    public class192 field1233 = new class192();

    @ObfuscatedName("bs.bq")
    public int field1234 = -1;

    @ObfuscatedName("bs.bc")
    public boolean field1235 = false;

    @ObfuscatedName("bs.by")
    public int field1236 = -1;

    @ObfuscatedName("bs.bb")
    public int field1254 = -1;

    @ObfuscatedName("bs.bn")
    public int field1228 = 0;

    @ObfuscatedName("bs.bd")
    public int field1239 = 0;

    @ObfuscatedName("bs.bl")
    public int field1240 = -1;

    @ObfuscatedName("bs.bi")
    public int field1241 = 0;

    @ObfuscatedName("bs.bo")
    public int field1208 = 0;

    @ObfuscatedName("bs.bx")
    public int field1245 = 0;

    @ObfuscatedName("bs.br")
    public int field1244 = 0;

    @ObfuscatedName("bs.bu")
    public int field1260 = -1;

    @ObfuscatedName("bs.bv")
    public int field1250 = 0;

    @ObfuscatedName("bs.bk")
    public int field1247 = 0;

    @ObfuscatedName("bs.bg")
    public int field1248;

    @ObfuscatedName("bs.ba")
    public int field1215;

    @ObfuscatedName("bs.bt")
    public int field1237;

    @ObfuscatedName("bs.bm")
    public int field1251;

    @ObfuscatedName("bs.bh")
    public int field1230;

    @ObfuscatedName("bs.bw")
    public int field1217;

    @ObfuscatedName("bs.be")
    public int field1256;

    @ObfuscatedName("bs.bz")
    public int field1255;

    @ObfuscatedName("bs.bs")
    public int field1262;

    @ObfuscatedName("bs.bp")
    public int field1257 = 0;

    @ObfuscatedName("bs.cg")
    public int field1258 = 200;

    @ObfuscatedName("bs.co")
    public int field1259;

    @ObfuscatedName("bs.cu")
    public int field1253 = 0;

    @ObfuscatedName("bs.cy")
    public int field1266 = 32;

    @ObfuscatedName("bs.cd")
    public int field1213 = 0;

    @ObfuscatedName("bs.cx")
    public int[] field1263 = new int[10];

    @ObfuscatedName("bs.cs")
    public int[] field1264 = new int[10];

    @ObfuscatedName("bs.cb")
    public byte[] field1265 = new byte[10];

    @ObfuscatedName("bs.cq")
    public int field1252 = 0;

    @ObfuscatedName("bs.cn")
    public int field1242 = 0;

    @ObfuscatedName("bs.m(I)V")
    public final void method1456() {
        this.field1213 = 0;
        this.field1242 = 0;
    }

    @ObfuscatedName("bs.r(I)Z")
    public boolean method1074() {
        return false;
    }

    @ObfuscatedName("bs.ae(IIIIIIB)V")
    public final void method1458(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1238[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class255 var13 = class255.method1689(arg0);
            var11 = var13.field3436;
            var12 = var13.field3423;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1238[0];
            } else if (var11 == 1) {
                var14 = this.field1229[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1238[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1238[var15];
                    }
                } else if (var11 == 1 && this.field1229[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1229[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1227 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1227;
                this.field1227 = (byte) ((this.field1227 + 1) % 4);
                if (this.field1238[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1246[var10] = arg0;
        this.field1229[var10] = arg1;
        this.field1231[var10] = arg2;
        this.field1232[var10] = arg3;
        this.field1238[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bs.ai(IIIIIIB)V")
    public final void method1467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class249 var7 = class249.method65(arg0);
        class84 var8 = null;
        class84 var9 = null;
        int var10 = var7.field3370;
        int var11 = 0;
        for (class84 var12 = (class84) this.field1233.method3373(); var12 != null; var12 = (class84) this.field1233.method3374()) {
            var11++;
            if (var12.field1363.field3365 == var7.field3365) {
                var12.method1599(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1363.field3361 <= var7.field3361) {
                var8 = var12;
            }
            if (var12.field1363.field3370 > var10) {
                var9 = var12;
                var10 = var12.field1363.field3370;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class84 var13 = new class84(var7);
        if (var8 == null) {
            this.field1233.method3370(var13);
        } else {
            class192.method3371(var13, var8);
        }
        var13.method1599(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3407();
        }
    }

    @ObfuscatedName("bs.ah(II)V")
    public final void method1459(int arg0) {
        class249 var2 = class249.method65(arg0);
        for (class84 var3 = (class84) this.field1233.method3373(); var3 != null; var3 = (class84) this.field1233.method3374()) {
            if (var3.field1363 == var2) {
                var3.method3407();
                return;
            }
        }
    }
}
