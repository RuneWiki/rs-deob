package deob;

@ObfuscatedName("dn")
public class class80 extends class489 {

    @ObfuscatedName("dn.az")
    public static class304 field1007 = new class304(128);

    @ObfuscatedName("dn.ah")
    public String field1009;

    @ObfuscatedName("dn.af")
    public int[] field1006;

    @ObfuscatedName("dn.at")
    public int[] field1003;

    @ObfuscatedName("dn.an")
    public String[] field1004;

    @ObfuscatedName("dn.ao")
    public int field1005;

    @ObfuscatedName("dn.ab")
    public int field1001;

    @ObfuscatedName("dn.aw")
    public int field1002;

    @ObfuscatedName("dn.ad")
    public int field1008;

    @ObfuscatedName("dn.al")
    public class508[] field1000;

    @ObfuscatedName("ei.az(IB)Ldn;")
    public static class80 method2836(int arg0) {
        class80 var1 = (class80) field1007.method5336((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field478.method6328(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class80 var3 = method4522(var2);
            field1007.method5346(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("pv.ah(IIII)Ldn;")
    public static class80 method6551(int arg0, int arg1, int arg2) {
        int var3 = class368.method4525(arg1, arg0);
        class80 var4 = method352(var3, arg0);
        if (var4 != null) {
            return var4;
        }
        int var5 = class368.method2924(arg2, arg0);
        class80 var6 = method352(var5, arg0);
        if (var6 == null) {
            int var7 = class368.method4737(arg0);
            class80 var8 = method352(var7, arg0);
            return var8 == null ? null : var8;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ak.af(III)Ldn;")
    public static class80 method352(int arg0, int arg1) {
        class80 var2 = (class80) field1007.method5336((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field478.method6386(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field478.method6335(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class80 var6 = method4522(var5);
            if (var6 != null) {
                field1007.method5346(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("jm.at([BI)Ldn;")
    public static class80 method4522(byte[] arg0) {
        class80 var1 = new class80();
        class535 var2 = new class535(arg0);
        var2.field5233 = var2.field5231.length - 2;
        int var3 = var2.method8670();
        int var4 = var2.field5231.length - 2 - var3 - 12;
        var2.field5233 = var4;
        int var5 = var2.method8682();
        var1.field1005 = var2.method8670();
        var1.field1001 = var2.method8670();
        var1.field1002 = var2.method8670();
        var1.field1008 = var2.method8670();
        int var6 = var2.method8462();
        if (var6 > 0) {
            var1.field1000 = var1.method2098(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method8670();
                class508 var9 = new class508(var8 > 0 ? class320.method3400(var8) : 1);
                var1.field1000[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method8682();
                    int var11 = var2.method8682();
                    var9.method8200(new class492(var11), (long) var10);
                }
            }
        }
        var2.field5233 = 0;
        var1.field1009 = var2.method8622();
        var1.field1006 = new int[var5];
        var1.field1003 = new int[var5];
        var1.field1004 = new String[var5];
        int var12 = 0;
        while (var2.field5233 < var4) {
            int var13 = var2.method8670();
            if (var13 == 3) {
                var1.field1004[var12] = var2.method8473();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1003[var12] = var2.method8462();
            } else {
                var1.field1003[var12] = var2.method8682();
            }
            var1.field1006[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("dn.an(IB)[Lto;")
    public class508[] method2098(int arg0) {
        return new class508[arg0];
    }
}
