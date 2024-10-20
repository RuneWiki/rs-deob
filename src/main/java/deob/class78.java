package deob;

@ObfuscatedName("br")
public abstract class class78 extends class141 {

    @ObfuscatedName("br.ad")
    public int field1182;

    @ObfuscatedName("br.ag")
    public int field1143;

    @ObfuscatedName("br.ak")
    public int field1173;

    @ObfuscatedName("br.as")
    public boolean field1171 = false;

    @ObfuscatedName("br.aq")
    public int field1127 = 1;

    @ObfuscatedName("br.ax")
    public int field1128 = -1;

    @ObfuscatedName("br.at")
    public int field1129 = -1;

    @ObfuscatedName("br.ap")
    public int field1177 = -1;

    @ObfuscatedName("br.an")
    public int field1140 = -1;

    @ObfuscatedName("br.ac")
    public int field1132 = -1;

    @ObfuscatedName("br.aw")
    public int field1133 = -1;

    @ObfuscatedName("br.al")
    public int field1124 = -1;

    @ObfuscatedName("br.ay")
    public int field1131 = -1;

    @ObfuscatedName("br.ai")
    public String field1135 = null;

    @ObfuscatedName("br.af")
    public boolean field1123;

    @ObfuscatedName("br.ah")
    public boolean field1138 = false;

    @ObfuscatedName("br.az")
    public int field1158 = 100;

    @ObfuscatedName("br.av")
    public int field1180 = 0;

    @ObfuscatedName("br.ae")
    public int field1141 = 0;

    @ObfuscatedName("br.aa")
    public byte field1142 = 0;

    @ObfuscatedName("br.aj")
    public int[] field1159 = new int[4];

    @ObfuscatedName("br.ao")
    public int[] field1130 = new int[4];

    @ObfuscatedName("br.ar")
    public int[] field1145 = new int[4];

    @ObfuscatedName("br.au")
    public int[] field1162 = new int[4];

    @ObfuscatedName("br.bb")
    public int[] field1147 = new int[4];

    @ObfuscatedName("br.bc")
    public class203 field1148 = new class203();

    @ObfuscatedName("br.bp")
    public int field1149 = -1;

    @ObfuscatedName("br.bn")
    public boolean field1150 = false;

    @ObfuscatedName("br.bg")
    public int field1151 = -1;

    @ObfuscatedName("br.bq")
    public int field1152 = -1;

    @ObfuscatedName("br.be")
    public int field1153 = 0;

    @ObfuscatedName("br.bx")
    public int field1154 = 0;

    @ObfuscatedName("br.bw")
    public int field1155 = -1;

    @ObfuscatedName("br.bf")
    public int field1169 = 0;

    @ObfuscatedName("br.bs")
    public int field1157 = 0;

    @ObfuscatedName("br.bz")
    public int field1146 = 0;

    @ObfuscatedName("br.bk")
    public int field1125 = 0;

    @ObfuscatedName("br.bh")
    public int field1160 = -1;

    @ObfuscatedName("br.bm")
    public int field1161 = 0;

    @ObfuscatedName("br.bt")
    public int field1144 = 0;

    @ObfuscatedName("br.by")
    public int field1163;

    @ObfuscatedName("br.bi")
    public int field1164;

    @ObfuscatedName("br.bl")
    public int field1165;

    @ObfuscatedName("br.bv")
    public int field1166;

    @ObfuscatedName("br.bd")
    public int field1167;

    @ObfuscatedName("br.bj")
    public int field1126;

    @ObfuscatedName("br.ba")
    public int field1139;

    @ObfuscatedName("br.bu")
    public int field1170;

    @ObfuscatedName("br.bo")
    public int field1134;

    @ObfuscatedName("br.br")
    public int field1172 = 0;

    @ObfuscatedName("br.ch")
    public int field1137 = 200;

    @ObfuscatedName("br.cp")
    public int field1174;

    @ObfuscatedName("br.cf")
    public int field1175 = 0;

    @ObfuscatedName("br.cb")
    public int field1176 = 32;

    @ObfuscatedName("br.cv")
    public int field1136 = 0;

    @ObfuscatedName("br.cj")
    public int[] field1178 = new int[10];

    @ObfuscatedName("br.cq")
    public int[] field1179 = new int[10];

    @ObfuscatedName("br.ci")
    public byte[] field1168 = new byte[10];

    @ObfuscatedName("br.ce")
    public int field1181 = 0;

    @ObfuscatedName("br.cu")
    public int field1156 = 0;

    @ObfuscatedName("br.v(I)V")
    public final void method1342() {
        this.field1136 = 0;
        this.field1156 = 0;
    }

    @ObfuscatedName("br.t(I)Z")
    public boolean method985() {
        return false;
    }

    @ObfuscatedName("br.p(IIIIIIB)V")
    public final void method1341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1145[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class266 var13 = class266.method4010(arg0);
            var11 = var13.field3504;
            var12 = var13.field3501;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1145[0];
            } else if (var11 == 1) {
                var14 = this.field1130[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1145[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1145[var15];
                    }
                } else if (var11 == 1 && this.field1130[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1130[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1142 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1142;
                this.field1142 = (byte) ((this.field1142 + 1) % 4);
                if (this.field1145[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1159[var10] = arg0;
        this.field1130[var10] = arg1;
        this.field1162[var10] = arg2;
        this.field1147[var10] = arg3;
        this.field1145[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("br.ab(IIIIIII)V")
    public final void method1344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class260 var7 = Statics.method2902(arg0);
        class85 var8 = null;
        class85 var9 = null;
        int var10 = var7.field3449;
        int var11 = 0;
        for (class85 var12 = (class85) this.field1148.method3399(); var12 != null; var12 = (class85) this.field1148.method3418()) {
            var11++;
            if (var12.field1265.field3456 == var7.field3456) {
                var12.method1489(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1265.field3448 <= var7.field3448) {
                var8 = var12;
            }
            if (var12.field1265.field3449 > var10) {
                var9 = var12;
                var10 = var12.field1265.field3449;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class85 var13 = new class85(var7);
        if (var8 == null) {
            this.field1148.method3396(var13);
        } else {
            class203.method3408(var13, var8);
        }
        var13.method1489(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3427();
        }
    }

    @ObfuscatedName("br.ad(II)V")
    public final void method1345(int arg0) {
        class260 var2 = Statics.method2902(arg0);
        for (class85 var3 = (class85) this.field1148.method3399(); var3 != null; var3 = (class85) this.field1148.method3418()) {
            if (var3.field1265 == var2) {
                var3.method3427();
                return;
            }
        }
    }
}
