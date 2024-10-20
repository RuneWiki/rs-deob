package deob;

@ObfuscatedName("by")
public abstract class class78 extends class141 {

    @ObfuscatedName("by.ak")
    public int field1149;

    @ObfuscatedName("by.aa")
    public int field1198;

    @ObfuscatedName("by.ax")
    public int field1170;

    @ObfuscatedName("by.aq")
    public boolean field1202 = false;

    @ObfuscatedName("by.au")
    public int field1148 = 1;

    @ObfuscatedName("by.al")
    public int field1152 = -1;

    @ObfuscatedName("by.ae")
    public int field1153 = -1;

    @ObfuscatedName("by.aj")
    public int field1154 = -1;

    @ObfuscatedName("by.as")
    public int field1155 = -1;

    @ObfuscatedName("by.am")
    public int field1156 = -1;

    @ObfuscatedName("by.ag")
    public int field1157 = -1;

    @ObfuscatedName("by.aw")
    public int field1158 = -1;

    @ObfuscatedName("by.ap")
    public int field1159 = -1;

    @ObfuscatedName("by.ad")
    public String field1193 = null;

    @ObfuscatedName("by.an")
    public boolean field1161;

    @ObfuscatedName("by.ai")
    public boolean field1162 = false;

    @ObfuscatedName("by.ay")
    public int field1178 = 100;

    @ObfuscatedName("by.ar")
    public int field1164 = 0;

    @ObfuscatedName("by.ac")
    public int field1165 = 0;

    @ObfuscatedName("by.ao")
    public byte field1166 = 0;

    @ObfuscatedName("by.av")
    public int[] field1197 = new int[4];

    @ObfuscatedName("by.ab")
    public int[] field1168 = new int[4];

    @ObfuscatedName("by.az")
    public int[] field1169 = new int[4];

    @ObfuscatedName("by.at")
    public int[] field1163 = new int[4];

    @ObfuscatedName("by.bj")
    public int[] field1171 = new int[4];

    @ObfuscatedName("by.bq")
    public class199 field1172 = new class199();

    @ObfuscatedName("by.bo")
    public int field1173 = -1;

    @ObfuscatedName("by.bk")
    public boolean field1174 = false;

    @ObfuscatedName("by.bv")
    public int field1175 = -1;

    @ObfuscatedName("by.ba")
    public int field1176 = -1;

    @ObfuscatedName("by.bs")
    public int field1190 = 0;

    @ObfuscatedName("by.bg")
    public int field1147 = 0;

    @ObfuscatedName("by.bn")
    public int field1192 = -1;

    @ObfuscatedName("by.bz")
    public int field1206 = 0;

    @ObfuscatedName("by.bl")
    public int field1181 = 0;

    @ObfuscatedName("by.bm")
    public int field1150 = 0;

    @ObfuscatedName("by.bb")
    public int field1183 = 0;

    @ObfuscatedName("by.bc")
    public int field1201 = -1;

    @ObfuscatedName("by.bf")
    public int field1185 = 0;

    @ObfuscatedName("by.br")
    public int field1186 = 0;

    @ObfuscatedName("by.bx")
    public int field1182;

    @ObfuscatedName("by.be")
    public int field1188;

    @ObfuscatedName("by.bt")
    public int field1189;

    @ObfuscatedName("by.bh")
    public int field1179;

    @ObfuscatedName("by.bd")
    public int field1191;

    @ObfuscatedName("by.bw")
    public int field1167;

    @ObfuscatedName("by.bp")
    public int field1177;

    @ObfuscatedName("by.bu")
    public int field1194;

    @ObfuscatedName("by.bi")
    public int field1195;

    @ObfuscatedName("by.by")
    public int field1196 = 0;

    @ObfuscatedName("by.cd")
    public int field1180 = 200;

    @ObfuscatedName("by.cw")
    public int field1151;

    @ObfuscatedName("by.ca")
    public int field1199 = 0;

    @ObfuscatedName("by.co")
    public int field1200 = 32;

    @ObfuscatedName("by.cs")
    public int field1184 = 0;

    @ObfuscatedName("by.cy")
    public int[] field1187 = new int[10];

    @ObfuscatedName("by.cb")
    public int[] field1203 = new int[10];

    @ObfuscatedName("by.cj")
    public byte[] field1204 = new byte[10];

    @ObfuscatedName("by.cn")
    public int field1205 = 0;

    @ObfuscatedName("by.cg")
    public int field1160 = 0;

    @ObfuscatedName("by.ak(I)V")
    public final void method1453() {
        this.field1184 = 0;
        this.field1160 = 0;
    }

    @ObfuscatedName("by.b(B)Z")
    public boolean method1065() {
        return false;
    }

    @ObfuscatedName("by.aa(IIIIIIB)V")
    public final void method1458(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1169[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class262 var13 = class262.method1012(arg0);
            var11 = var13.field3493;
            var12 = var13.field3492;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1169[0];
            } else if (var11 == 1) {
                var14 = this.field1168[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1169[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1169[var15];
                    }
                } else if (var11 == 1 && this.field1168[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1168[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1166 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1166;
                this.field1166 = (byte) ((this.field1166 + 1) % 4);
                if (this.field1169[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1197[var10] = arg0;
        this.field1168[var10] = arg1;
        this.field1163[var10] = arg2;
        this.field1171[var10] = arg3;
        this.field1169[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("by.ax(IIIIIII)V")
    public final void method1456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class256 var7 = (class256) class256.field3433.method3418((long) arg0);
        class256 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3443.method3935(33, arg0);
            class256 var10 = new class256();
            if (var9 != null) {
                var10.method4204(new class181(var9));
            }
            class256.field3433.method3417(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class256 var11 = var8;
        class85 var12 = null;
        class85 var13 = null;
        int var14 = var8.field3438;
        int var15 = 0;
        for (class85 var16 = (class85) this.field1172.method3453(); var16 != null; var16 = (class85) this.field1172.method3450()) {
            var15++;
            if (var16.field1292.field3440 == var11.field3440) {
                var16.method1601(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1292.field3445 <= var11.field3445) {
                var12 = var16;
            }
            if (var16.field1292.field3438 > var14) {
                var13 = var16;
                var14 = var16.field1292.field3438;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class85 var17 = new class85(var11);
        if (var12 == null) {
            this.field1172.method3457(var17);
        } else {
            class199.method3451(var17, var12);
        }
        var17.method1601(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3475();
        }
    }

    @ObfuscatedName("by.aq(II)V")
    public final void method1457(int arg0) {
        class256 var2 = (class256) class256.field3433.method3418((long) arg0);
        class256 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3443.method3935(33, arg0);
            class256 var5 = new class256();
            if (var4 != null) {
                var5.method4204(new class181(var4));
            }
            class256.field3433.method3417(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class256 var6 = var3;
        for (class85 var7 = (class85) this.field1172.method3453(); var7 != null; var7 = (class85) this.field1172.method3450()) {
            if (var7.field1292 == var6) {
                var7.method3475();
                return;
            }
        }
    }
}
