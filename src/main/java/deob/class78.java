package deob;

@ObfuscatedName("bf")
public abstract class class78 extends class141 {

    @ObfuscatedName("bf.ao")
    public int field1188;

    @ObfuscatedName("bf.aq")
    public int field1145;

    @ObfuscatedName("bf.ab")
    public int field1146;

    @ObfuscatedName("bf.as")
    public boolean field1147 = false;

    @ObfuscatedName("bf.ag")
    public int field1202 = 1;

    @ObfuscatedName("bf.ap")
    public int field1175 = -1;

    @ObfuscatedName("bf.av")
    public int field1150 = -1;

    @ObfuscatedName("bf.ak")
    public int field1151 = -1;

    @ObfuscatedName("bf.at")
    public int field1152 = -1;

    @ObfuscatedName("bf.an")
    public int field1153 = -1;

    @ObfuscatedName("bf.ah")
    public int field1154 = -1;

    @ObfuscatedName("bf.am")
    public int field1155 = -1;

    @ObfuscatedName("bf.ay")
    public int field1156 = -1;

    @ObfuscatedName("bf.az")
    public String field1157 = null;

    @ObfuscatedName("bf.aw")
    public boolean field1148;

    @ObfuscatedName("bf.au")
    public boolean field1159 = false;

    @ObfuscatedName("bf.ac")
    public int field1149 = 100;

    @ObfuscatedName("bf.ai")
    public int field1161 = 0;

    @ObfuscatedName("bf.ax")
    public int field1189 = 0;

    @ObfuscatedName("bf.aa")
    public byte field1163 = 0;

    @ObfuscatedName("bf.ad")
    public int[] field1170 = new int[4];

    @ObfuscatedName("bf.aj")
    public int[] field1191 = new int[4];

    @ObfuscatedName("bf.ae")
    public int[] field1166 = new int[4];

    @ObfuscatedName("bf.ar")
    public int[] field1167 = new int[4];

    @ObfuscatedName("bf.bu")
    public int[] field1168 = new int[4];

    @ObfuscatedName("bf.bk")
    public class199 field1169 = new class199();

    @ObfuscatedName("bf.bo")
    public int field1201 = -1;

    @ObfuscatedName("bf.bl")
    public boolean field1171 = false;

    @ObfuscatedName("bf.bw")
    public int field1203 = -1;

    @ObfuscatedName("bf.bj")
    public int field1173 = -1;

    @ObfuscatedName("bf.bn")
    public int field1174 = 0;

    @ObfuscatedName("bf.bt")
    public int field1194 = 0;

    @ObfuscatedName("bf.bz")
    public int field1176 = -1;

    @ObfuscatedName("bf.be")
    public int field1177 = 0;

    @ObfuscatedName("bf.bm")
    public int field1180 = 0;

    @ObfuscatedName("bf.bd")
    public int field1179 = 0;

    @ObfuscatedName("bf.ba")
    public int field1164 = 0;

    @ObfuscatedName("bf.br")
    public int field1181 = -1;

    @ObfuscatedName("bf.bc")
    public int field1182 = 0;

    @ObfuscatedName("bf.bp")
    public int field1183 = 0;

    @ObfuscatedName("bf.bi")
    public int field1184;

    @ObfuscatedName("bf.bg")
    public int field1185;

    @ObfuscatedName("bf.bb")
    public int field1186;

    @ObfuscatedName("bf.bx")
    public int field1144;

    @ObfuscatedName("bf.by")
    public int field1160;

    @ObfuscatedName("bf.bq")
    public int field1200;

    @ObfuscatedName("bf.bh")
    public int field1165;

    @ObfuscatedName("bf.bs")
    public int field1178;

    @ObfuscatedName("bf.bv")
    public int field1192;

    @ObfuscatedName("bf.bf")
    public int field1193 = 0;

    @ObfuscatedName("bf.cn")
    public int field1162 = 200;

    @ObfuscatedName("bf.cd")
    public int field1195;

    @ObfuscatedName("bf.ca")
    public int field1196 = 0;

    @ObfuscatedName("bf.ce")
    public int field1197 = 32;

    @ObfuscatedName("bf.cr")
    public int field1198 = 0;

    @ObfuscatedName("bf.cc")
    public int[] field1199 = new int[10];

    @ObfuscatedName("bf.cy")
    public int[] field1172 = new int[10];

    @ObfuscatedName("bf.cp")
    public byte[] field1190 = new byte[10];

    @ObfuscatedName("bf.ck")
    public int field1158 = 0;

    @ObfuscatedName("bf.cj")
    public int field1187 = 0;

    @ObfuscatedName("bf.ao(I)V")
    public final void method1477() {
        this.field1198 = 0;
        this.field1187 = 0;
    }

    @ObfuscatedName("bf.e(I)Z")
    public boolean method1073() {
        return false;
    }

    @ObfuscatedName("bf.aq(IIIIIII)V")
    public final void method1473(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1166[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class262 var13 = class262.method47(arg0);
            var11 = var13.field3482;
            var12 = var13.field3473;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1166[0];
            } else if (var11 == 1) {
                var14 = this.field1191[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1166[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1166[var15];
                    }
                } else if (var11 == 1 && this.field1191[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1191[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1163 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1163;
                this.field1163 = (byte) ((this.field1163 + 1) % 4);
                if (this.field1166[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1170[var10] = arg0;
        this.field1191[var10] = arg1;
        this.field1167[var10] = arg2;
        this.field1168[var10] = arg3;
        this.field1166[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bf.ab(IIIIIII)V")
    public final void method1474(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class256 var7 = (class256) class256.field3417.method3419((long) arg0);
        class256 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3421.method3930(33, arg0);
            class256 var10 = new class256();
            if (var9 != null) {
                var10.method4206(new class181(var9));
            }
            class256.field3417.method3418(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class256 var11 = var8;
        class85 var12 = null;
        class85 var13 = null;
        int var14 = var8.field3426;
        int var15 = 0;
        for (class85 var16 = (class85) this.field1169.method3453(); var16 != null; var16 = (class85) this.field1169.method3455()) {
            var15++;
            if (var16.field1283.field3420 == var11.field3420) {
                var16.method1607(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1283.field3423 <= var11.field3423) {
                var12 = var16;
            }
            if (var16.field1283.field3426 > var14) {
                var13 = var16;
                var14 = var16.field1283.field3426;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class85 var17 = new class85(var11);
        if (var12 == null) {
            this.field1169.method3452(var17);
        } else {
            class199.method3450(var17, var12);
        }
        var17.method1607(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3476();
        }
    }

    @ObfuscatedName("bf.as(II)V")
    public final void method1475(int arg0) {
        class256 var2 = (class256) class256.field3417.method3419((long) arg0);
        class256 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3421.method3930(33, arg0);
            class256 var5 = new class256();
            if (var4 != null) {
                var5.method4206(new class181(var4));
            }
            class256.field3417.method3418(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class256 var6 = var3;
        for (class85 var7 = (class85) this.field1169.method3453(); var7 != null; var7 = (class85) this.field1169.method3455()) {
            if (var7.field1283 == var6) {
                var7.method3476();
                return;
            }
        }
    }
}
