package deob;

@ObfuscatedName("cm")
public abstract class class79 extends class142 {

    @ObfuscatedName("cm.aj")
    public int field1211;

    @ObfuscatedName("cm.am")
    public int field1219;

    @ObfuscatedName("cm.ag")
    public int field1212;

    @ObfuscatedName("cm.av")
    public boolean field1234 = false;

    @ObfuscatedName("cm.al")
    public int field1214 = 1;

    @ObfuscatedName("cm.ab")
    public int field1253 = -1;

    @ObfuscatedName("cm.af")
    public int field1216 = -1;

    @ObfuscatedName("cm.ak")
    public int field1217 = -1;

    @ObfuscatedName("cm.ar")
    public int field1218 = -1;

    @ObfuscatedName("cm.an")
    public int field1265 = -1;

    @ObfuscatedName("cm.at")
    public int field1245 = -1;

    @ObfuscatedName("cm.aw")
    public int field1221 = -1;

    @ObfuscatedName("cm.ad")
    public int field1222 = -1;

    @ObfuscatedName("cm.ac")
    public String field1223 = null;

    @ObfuscatedName("cm.ae")
    public boolean field1224;

    @ObfuscatedName("cm.ah")
    public boolean field1225 = false;

    @ObfuscatedName("cm.ax")
    public int field1226 = 100;

    @ObfuscatedName("cm.ai")
    public int field1227 = 0;

    @ObfuscatedName("cm.aa")
    public int field1228 = 0;

    @ObfuscatedName("cm.as")
    public byte field1229 = 0;

    @ObfuscatedName("cm.au")
    public int[] field1230 = new int[4];

    @ObfuscatedName("cm.az")
    public int[] field1231 = new int[4];

    @ObfuscatedName("cm.ay")
    public int[] field1263 = new int[4];

    @ObfuscatedName("cm.ao")
    public int[] field1262 = new int[4];

    @ObfuscatedName("cm.bz")
    public int[] field1270 = new int[4];

    @ObfuscatedName("cm.bd")
    public class192 field1235 = new class192();

    @ObfuscatedName("cm.bu")
    public int field1236 = -1;

    @ObfuscatedName("cm.bh")
    public boolean field1250 = false;

    @ObfuscatedName("cm.bg")
    public int field1238 = -1;

    @ObfuscatedName("cm.bl")
    public int field1239 = -1;

    @ObfuscatedName("cm.bo")
    public int field1215 = 0;

    @ObfuscatedName("cm.bi")
    public int field1241 = 0;

    @ObfuscatedName("cm.bn")
    public int field1242 = -1;

    @ObfuscatedName("cm.bk")
    public int field1243 = 0;

    @ObfuscatedName("cm.bj")
    public int field1244 = 0;

    @ObfuscatedName("cm.bm")
    public int field1232 = 0;

    @ObfuscatedName("cm.ba")
    public int field1246 = 0;

    @ObfuscatedName("cm.bs")
    public int field1247 = -1;

    @ObfuscatedName("cm.bc")
    public int field1248 = 0;

    @ObfuscatedName("cm.bw")
    public int field1249 = 0;

    @ObfuscatedName("cm.bp")
    public int field1213;

    @ObfuscatedName("cm.by")
    public int field1251;

    @ObfuscatedName("cm.bq")
    public int field1237;

    @ObfuscatedName("cm.be")
    public int field1266;

    @ObfuscatedName("cm.bv")
    public int field1254;

    @ObfuscatedName("cm.bb")
    public int field1255;

    @ObfuscatedName("cm.bt")
    public int field1256;

    @ObfuscatedName("cm.bf")
    public int field1269;

    @ObfuscatedName("cm.br")
    public int field1258;

    @ObfuscatedName("cm.bx")
    public int field1259 = 0;

    @ObfuscatedName("cm.cm")
    public int field1260 = 200;

    @ObfuscatedName("cm.cf")
    public int field1257;

    @ObfuscatedName("cm.cw")
    public int field1261 = 0;

    @ObfuscatedName("cm.cc")
    public int field1233 = 32;

    @ObfuscatedName("cm.cy")
    public int field1252 = 0;

    @ObfuscatedName("cm.cq")
    public int[] field1210 = new int[10];

    @ObfuscatedName("cm.cp")
    public int[] field1264 = new int[10];

    @ObfuscatedName("cm.ck")
    public byte[] field1267 = new byte[10];

    @ObfuscatedName("cm.cj")
    public int field1268 = 0;

    @ObfuscatedName("cm.ct")
    public int field1220 = 0;

    @ObfuscatedName("cm.aj(I)V")
    public final void method1362() {
        this.field1252 = 0;
        this.field1220 = 0;
    }

    @ObfuscatedName("cm.s(I)Z")
    public boolean method980() {
        return false;
    }

    @ObfuscatedName("cm.am(IIIIIIB)V")
    public final void method1372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1263[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class255 var13 = class255.method2842(arg0);
            var11 = var13.field3388;
            var12 = var13.field3397;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1263[0];
            } else if (var11 == 1) {
                var14 = this.field1231[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1263[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1263[var15];
                    }
                } else if (var11 == 1 && this.field1231[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1231[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1229 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1229;
                this.field1229 = (byte) ((this.field1229 + 1) % 4);
                if (this.field1263[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1230[var10] = arg0;
        this.field1231[var10] = arg1;
        this.field1262[var10] = arg2;
        this.field1270[var10] = arg3;
        this.field1263[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("cm.ag(IIIIIII)V")
    public final void method1364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class249 var7 = (class249) class249.field3341.method3220((long) arg0);
        class249 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3337.method3741(33, arg0);
            class249 var10 = new class249();
            if (var9 != null) {
                var10.method3973(new class174(var9));
            }
            class249.field3341.method3233(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class249 var11 = var8;
        class86 var12 = null;
        class86 var13 = null;
        int var14 = var8.field3340;
        int var15 = 0;
        for (class86 var16 = (class86) this.field1235.method3262(); var16 != null; var16 = (class86) this.field1235.method3276()) {
            var15++;
            if (var16.field1355.field3346 == var11.field3346) {
                var16.method1502(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1355.field3342 <= var11.field3342) {
                var12 = var16;
            }
            if (var16.field1355.field3340 > var14) {
                var13 = var16;
                var14 = var16.field1355.field3340;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class86 var17 = new class86(var11);
        if (var12 == null) {
            this.field1235.method3272(var17);
        } else {
            class192.method3260(var17, var12);
        }
        var17.method1502(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3287();
        }
    }

    @ObfuscatedName("cm.av(II)V")
    public final void method1365(int arg0) {
        class249 var2 = (class249) class249.field3341.method3220((long) arg0);
        class249 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3337.method3741(33, arg0);
            class249 var5 = new class249();
            if (var4 != null) {
                var5.method3973(new class174(var4));
            }
            class249.field3341.method3233(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class249 var6 = var3;
        for (class86 var7 = (class86) this.field1235.method3262(); var7 != null; var7 = (class86) this.field1235.method3276()) {
            if (var7.field1355 == var6) {
                var7.method3287();
                return;
            }
        }
    }
}
