package deob;

@ObfuscatedName("ca")
public abstract class class79 extends class142 {

    @ObfuscatedName("ca.ae")
    public int field1233;

    @ObfuscatedName("ca.au")
    public int field1265;

    @ObfuscatedName("ca.ak")
    public int field1241;

    @ObfuscatedName("ca.ap")
    public boolean field1218 = false;

    @ObfuscatedName("ca.ar")
    public int field1219 = 1;

    @ObfuscatedName("ca.am")
    public int field1271 = -1;

    @ObfuscatedName("ca.aw")
    public int field1221 = -1;

    @ObfuscatedName("ca.aq")
    public int field1245 = -1;

    @ObfuscatedName("ca.aa")
    public int field1252 = -1;

    @ObfuscatedName("ca.ag")
    public int field1224 = -1;

    @ObfuscatedName("ca.aj")
    public int field1225 = -1;

    @ObfuscatedName("ca.ax")
    public int field1226 = -1;

    @ObfuscatedName("ca.ad")
    public int field1222 = -1;

    @ObfuscatedName("ca.az")
    public String field1228 = null;

    @ObfuscatedName("ca.as")
    public boolean field1229;

    @ObfuscatedName("ca.av")
    public boolean field1230 = false;

    @ObfuscatedName("ca.ab")
    public int field1231 = 100;

    @ObfuscatedName("ca.at")
    public int field1232 = 0;

    @ObfuscatedName("ca.al")
    public int field1242 = 0;

    @ObfuscatedName("ca.an")
    public byte field1234 = 0;

    @ObfuscatedName("ca.ay")
    public int[] field1235 = new int[4];

    @ObfuscatedName("ca.ao")
    public int[] field1216 = new int[4];

    @ObfuscatedName("ca.ac")
    public int[] field1237 = new int[4];

    @ObfuscatedName("ca.af")
    public int[] field1238 = new int[4];

    @ObfuscatedName("ca.bp")
    public int[] field1239 = new int[4];

    @ObfuscatedName("ca.bi")
    public class192 field1220 = new class192();

    @ObfuscatedName("ca.ba")
    public int field1250 = -1;

    @ObfuscatedName("ca.bd")
    public boolean field1272 = false;

    @ObfuscatedName("ca.bl")
    public int field1243 = -1;

    @ObfuscatedName("ca.bc")
    public int field1244 = -1;

    @ObfuscatedName("ca.bb")
    public int field1253 = 0;

    @ObfuscatedName("ca.bn")
    public int field1246 = 0;

    @ObfuscatedName("ca.bs")
    public int field1247 = -1;

    @ObfuscatedName("ca.bh")
    public int field1248 = 0;

    @ObfuscatedName("ca.bo")
    public int field1249 = 0;

    @ObfuscatedName("ca.bk")
    public int field1227 = 0;

    @ObfuscatedName("ca.bw")
    public int field1260 = 0;

    @ObfuscatedName("ca.bg")
    public int field1215 = -1;

    @ObfuscatedName("ca.bt")
    public int field1251 = 0;

    @ObfuscatedName("ca.bz")
    public int field1254 = 0;

    @ObfuscatedName("ca.br")
    public int field1217;

    @ObfuscatedName("ca.bf")
    public int field1256;

    @ObfuscatedName("ca.bj")
    public int field1257;

    @ObfuscatedName("ca.bq")
    public int field1258;

    @ObfuscatedName("ca.bv")
    public int field1259;

    @ObfuscatedName("ca.bu")
    public int field1223;

    @ObfuscatedName("ca.be")
    public int field1261;

    @ObfuscatedName("ca.bx")
    public int field1262;

    @ObfuscatedName("ca.bm")
    public int field1263;

    @ObfuscatedName("ca.by")
    public int field1264 = 0;

    @ObfuscatedName("ca.ca")
    public int field1236 = 200;

    @ObfuscatedName("ca.cs")
    public int field1266;

    @ObfuscatedName("ca.cx")
    public int field1267 = 0;

    @ObfuscatedName("ca.ct")
    public int field1268 = 32;

    @ObfuscatedName("ca.cn")
    public int field1269 = 0;

    @ObfuscatedName("ca.cu")
    public int[] field1270 = new int[10];

    @ObfuscatedName("ca.cy")
    public int[] field1255 = new int[10];

    @ObfuscatedName("ca.ck")
    public byte[] field1240 = new byte[10];

    @ObfuscatedName("ca.ch")
    public int field1273 = 0;

    @ObfuscatedName("ca.cv")
    public int field1274 = 0;

    @ObfuscatedName("ca.ak(I)V")
    public final void method1347() {
        this.field1269 = 0;
        this.field1274 = 0;
    }

    @ObfuscatedName("ca.l(B)Z")
    public boolean method1001() {
        return false;
    }

    @ObfuscatedName("ca.ap(IIIIIIB)V")
    public final void method1348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1237[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class255 var13 = class255.method147(arg0);
            var11 = var13.field3414;
            var12 = var13.field3419;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1237[0];
            } else if (var11 == 1) {
                var14 = this.field1216[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1237[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1237[var15];
                    }
                } else if (var11 == 1 && this.field1216[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1216[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1234 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1234;
                this.field1234 = (byte) ((this.field1234 + 1) % 4);
                if (this.field1237[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1235[var10] = arg0;
        this.field1216[var10] = arg1;
        this.field1238[var10] = arg2;
        this.field1239[var10] = arg3;
        this.field1237[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("ca.ar(IIIIIII)V")
    public final void method1349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class249 var7 = (class249) class249.field3365.method3245((long) arg0);
        class249 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3374.method3787(33, arg0);
            class249 var10 = new class249();
            if (var9 != null) {
                var10.method4023(new class174(var9));
            }
            class249.field3365.method3247(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class249 var11 = var8;
        class86 var12 = null;
        class86 var13 = null;
        int var14 = var8.field3370;
        int var15 = 0;
        for (class86 var16 = (class86) this.field1220.method3282(); var16 != null; var16 = (class86) this.field1220.method3284()) {
            var15++;
            if (var16.field1359.field3367 == var11.field3367) {
                var16.method1506(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1359.field3369 <= var11.field3369) {
                var12 = var16;
            }
            if (var16.field1359.field3370 > var14) {
                var13 = var16;
                var14 = var16.field1359.field3370;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class86 var17 = new class86(var11);
        if (var12 == null) {
            this.field1220.method3279(var17);
        } else {
            class192.method3280(var17, var12);
        }
        var17.method1506(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3308();
        }
    }

    @ObfuscatedName("ca.am(IB)V")
    public final void method1350(int arg0) {
        class249 var2 = (class249) class249.field3365.method3245((long) arg0);
        class249 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3374.method3787(33, arg0);
            class249 var5 = new class249();
            if (var4 != null) {
                var5.method4023(new class174(var4));
            }
            class249.field3365.method3247(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class249 var6 = var3;
        for (class86 var7 = (class86) this.field1220.method3282(); var7 != null; var7 = (class86) this.field1220.method3284()) {
            if (var7.field1359 == var6) {
                var7.method3308();
                return;
            }
        }
    }
}
