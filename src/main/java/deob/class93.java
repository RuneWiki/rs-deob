package deob;

@ObfuscatedName("cu")
public class class93 extends class176 {

    @ObfuscatedName("cu.z")
    public static class146 field1266 = new class146(128);

    @ObfuscatedName("cu.n")
    public int[] field1269;

    @ObfuscatedName("cu.v")
    public int[] field1267;

    @ObfuscatedName("cu.u")
    public String[] field1272;

    @ObfuscatedName("cu.r")
    public int field1270;

    @ObfuscatedName("cu.p")
    public int field1271;

    @ObfuscatedName("cu.q")
    public int field1268;

    @ObfuscatedName("cu.m")
    public int field1273;

    @ObfuscatedName("cu.y")
    public class316[] field1274;

    @ObfuscatedName("ge.z(II)Lcu;")
    public static class93 method3263(int arg0) {
        class93 var1 = (class93) field1266.method2992((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field626.method3726(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class93 var3 = method40(var2);
            field1266.method2994(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("am.n(IIII)Lcu;")
    public static class93 method670(int arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0;
        class93 var5 = method517(var3, arg0);
        if (var5 == null) {
            int var6 = (arg2 + 40000 << 8) + arg0;
            class93 var8 = method517(var6, arg0);
            return var8 == null ? null : var8;
        } else {
            return var5;
        }
    }

    @ObfuscatedName("ax.v(III)Lcu;")
    public static class93 method517(int arg0, int arg1) {
        class93 var2 = (class93) field1266.method2992((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field626.method3765(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field626.method3733(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class93 var6 = method40(var5);
            if (var6 != null) {
                field1266.method2994(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("u.u([BB)Lcu;")
    public static class93 method40(byte[] arg0) {
        class93 var1 = new class93();
        class300 var2 = new class300(arg0);
        var2.field3702 = var2.field3699.length - 2;
        int var3 = var2.method4992();
        int var4 = var2.field3699.length - 2 - var3 - 12;
        var2.field3702 = var4;
        int var5 = var2.method5085();
        var1.field1270 = var2.method4992();
        var1.field1271 = var2.method4992();
        var1.field1268 = var2.method4992();
        var1.field1273 = var2.method4992();
        int var6 = var2.method4990();
        if (var6 > 0) {
            var1.field1274 = var1.method2011(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method4992();
                class316 var9 = new class316(var8 > 0 ? class189.method4527(var8) : 1);
                var1.field1274[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method5085();
                    int var11 = var2.method5085();
                    var9.method5363(new class180(var11), (long) var10);
                }
            }
        }
        var2.field3702 = 0;
        var2.method4998();
        var1.field1269 = new int[var5];
        var1.field1267 = new int[var5];
        var1.field1272 = new String[var5];
        int var12 = 0;
        while (var2.field3702 < var4) {
            int var13 = var2.method4992();
            if (var13 == 3) {
                var1.field1272[var12] = var2.method4999();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1267[var12] = var2.method4990();
            } else {
                var1.field1267[var12] = var2.method5085();
            }
            var1.field1269[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cu.r(II)[Llb;")
    public class316[] method2011(int arg0) {
        return new class316[arg0];
    }
}
