package deob;

@ObfuscatedName("cp")
public abstract class class79 extends class143 {

    @ObfuscatedName("cp.ay")
    public int field1221;

    @ObfuscatedName("cp.au")
    public int field1207;

    @ObfuscatedName("cp.ah")
    public int field1208;

    @ObfuscatedName("cp.ao")
    public boolean field1209 = false;

    @ObfuscatedName("cp.al")
    public int field1255 = 1;

    @ObfuscatedName("cp.ae")
    public int field1211 = -1;

    @ObfuscatedName("cp.ax")
    public int field1228 = -1;

    @ObfuscatedName("cp.az")
    public int field1213 = -1;

    @ObfuscatedName("cp.aw")
    public int field1242 = -1;

    @ObfuscatedName("cp.av")
    public int field1215 = -1;

    @ObfuscatedName("cp.ac")
    public int field1250 = -1;

    @ObfuscatedName("cp.ak")
    public int field1212 = -1;

    @ObfuscatedName("cp.ad")
    public int field1257 = -1;

    @ObfuscatedName("cp.at")
    public String field1219 = null;

    @ObfuscatedName("cp.af")
    public boolean field1220;

    @ObfuscatedName("cp.am")
    public boolean field1259 = false;

    @ObfuscatedName("cp.aq")
    public int field1222 = 100;

    @ObfuscatedName("cp.as")
    public int field1223 = 0;

    @ObfuscatedName("cp.ab")
    public int field1224 = 0;

    @ObfuscatedName("cp.ai")
    public byte field1225 = 0;

    @ObfuscatedName("cp.an")
    public int[] field1226 = new int[4];

    @ObfuscatedName("cp.ar")
    public int[] field1227 = new int[4];

    @ObfuscatedName("cp.aj")
    public int[] field1233 = new int[4];

    @ObfuscatedName("cp.aa")
    public int[] field1216 = new int[4];

    @ObfuscatedName("cp.bn")
    public int[] field1244 = new int[4];

    @ObfuscatedName("cp.bo")
    public class193 field1231 = new class193();

    @ObfuscatedName("cp.bq")
    public int field1232 = -1;

    @ObfuscatedName("cp.ba")
    public boolean field1243 = false;

    @ObfuscatedName("cp.bg")
    public int field1206 = -1;

    @ObfuscatedName("cp.bd")
    public int field1235 = -1;

    @ObfuscatedName("cp.bp")
    public int field1236 = 0;

    @ObfuscatedName("cp.bi")
    public int field1237 = 0;

    @ObfuscatedName("cp.by")
    public int field1238 = -1;

    @ObfuscatedName("cp.bc")
    public int field1218 = 0;

    @ObfuscatedName("cp.bu")
    public int field1240 = 0;

    @ObfuscatedName("cp.bx")
    public int field1241 = 0;

    @ObfuscatedName("cp.bz")
    public int field1247 = 0;

    @ObfuscatedName("cp.br")
    public int field1234 = -1;

    @ObfuscatedName("cp.bm")
    public int field1210 = 0;

    @ObfuscatedName("cp.bj")
    public int field1245 = 0;

    @ObfuscatedName("cp.bb")
    public int field1251;

    @ObfuscatedName("cp.bf")
    public int field1266;

    @ObfuscatedName("cp.bl")
    public int field1248;

    @ObfuscatedName("cp.bt")
    public int field1249;

    @ObfuscatedName("cp.bw")
    public int field1252;

    @ObfuscatedName("cp.bs")
    public int field1229;

    @ObfuscatedName("cp.bh")
    public int field1239;

    @ObfuscatedName("cp.bk")
    public int field1253;

    @ObfuscatedName("cp.bv")
    public int field1254;

    @ObfuscatedName("cp.be")
    public int field1246 = 0;

    @ObfuscatedName("cp.cp")
    public int field1256 = 200;

    @ObfuscatedName("cp.cs")
    public int field1217;

    @ObfuscatedName("cp.cq")
    public int field1258 = 0;

    @ObfuscatedName("cp.ct")
    public int field1230 = 32;

    @ObfuscatedName("cp.cm")
    public int field1260 = 0;

    @ObfuscatedName("cp.cu")
    public int[] field1261 = new int[10];

    @ObfuscatedName("cp.cj")
    public int[] field1262 = new int[10];

    @ObfuscatedName("cp.cl")
    public byte[] field1263 = new byte[10];

    @ObfuscatedName("cp.cg")
    public int field1264 = 0;

    @ObfuscatedName("cp.co")
    public int field1265 = 0;

    @ObfuscatedName("cp.ax(I)V")
    public final void method1414() {
        this.field1260 = 0;
        this.field1265 = 0;
    }

    @ObfuscatedName("cp.v(I)Z")
    public boolean method1057() {
        return false;
    }

    @ObfuscatedName("cp.az(IIIIIIB)V")
    public final void method1410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1233[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class256 var13 = class256.method1427(arg0);
            var11 = var13.field3403;
            var12 = var13.field3405;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1233[0];
            } else if (var11 == 1) {
                var14 = this.field1227[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1233[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1233[var15];
                    }
                } else if (var11 == 1 && this.field1227[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1227[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1225 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1225;
                this.field1225 = (byte) ((this.field1225 + 1) % 4);
                if (this.field1233[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1226[var10] = arg0;
        this.field1227[var10] = arg1;
        this.field1216[var10] = arg2;
        this.field1244[var10] = arg3;
        this.field1233[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("cp.aw(IIIIIII)V")
    public final void method1411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class250 var7 = class250.method3134(arg0);
        class87 var8 = null;
        class87 var9 = null;
        int var10 = var7.field3361;
        int var11 = 0;
        for (class87 var12 = (class87) this.field1231.method3313(); var12 != null; var12 = (class87) this.field1231.method3315()) {
            var11++;
            if (var12.field1355.field3357 == var7.field3357) {
                var12.method1572(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1355.field3360 <= var7.field3360) {
                var8 = var12;
            }
            if (var12.field1355.field3361 > var10) {
                var9 = var12;
                var10 = var12.field1355.field3361;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class87 var13 = new class87(var7);
        if (var8 == null) {
            this.field1231.method3310(var13);
        } else {
            class193.method3322(var13, var8);
        }
        var13.method1572(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3333();
        }
    }

    @ObfuscatedName("cp.av(II)V")
    public final void method1412(int arg0) {
        class250 var2 = class250.method3134(arg0);
        for (class87 var3 = (class87) this.field1231.method3313(); var3 != null; var3 = (class87) this.field1231.method3315()) {
            if (var3.field1355 == var2) {
                var3.method3333();
                return;
            }
        }
    }
}
