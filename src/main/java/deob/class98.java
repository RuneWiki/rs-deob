package deob;

@ObfuscatedName("co")
public class class98 extends class195 {

    @ObfuscatedName("co.y")
    public class83[] field1707;

    @ObfuscatedName("p.y(Lfd;Lfd;IZI)Lco;")
    public static class98 method528(class158 arg0, class158 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method2882(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method2879(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method2879(0, var8);
                } else {
                    var9 = arg1.method2879(var8, 0);
                }
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        if (!var4) {
            return null;
        }
        try {
            return new class98(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class98(class158 arg0, class158 arg1, int arg2, boolean arg3) {
        class190 var5 = new class190();
        int var6 = arg0.method2883(arg2);
        this.field1707 = new class83[var6];
        int[] var7 = arg0.method2882(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2874(arg2, var7[var8]);
            class97 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class97 var12 = (class97) var5.method3396(); var12 != null; var12 = (class97) var5.method3398()) {
                if (var12.field1691 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2879(0, var11);
                } else {
                    var13 = arg1.method2879(var11, 0);
                }
                var10 = new class97(var11, var13);
                var5.method3391(var10);
            }
            this.field1707[var7[var8]] = new class83(var9, var10);
        }
    }

    @ObfuscatedName("co.k(IB)Z")
    public boolean method1984(int arg0) {
        return this.field1707[arg0].field1470;
    }
}
